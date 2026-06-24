import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

public final class ge2 {
  public final pz0 a;
  
  public final Context b;
  
  public final a42 c;
  
  public PackageInfo d;
  
  public ge2(Context paramContext, pz0 parampz0) {
    this.a = parampz0;
    this.b = paramContext;
    this.c = a421;
  }
  
  public final boolean a(File[] paramArrayOfFile) {
    long l;
    Context context = this.b;
    if (this.d == null)
      try {
        this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        nameNotFoundException = null;
      }  
    PackageInfo packageInfo = this.d;
    if (Build.VERSION.SDK_INT >= 28) {
      l = packageInfo.getLongVersionCode();
    } else {
      l = packageInfo.versionCode;
    } 
    try {
      constructor = AssetManager.class.getDeclaredConstructor(null);
      if (!constructor.isAccessible())
        constructor.setAccessible(true); 
    } catch (Exception exception) {}
    Constructor<AssetManager> constructor = (Constructor<AssetManager>)constructor.newInstance(null);
    AssetManager assetManager = (AssetManager)constructor;
    int i = exception.length;
    while (--i >= 0) {
      XmlResourceParser xmlResourceParser = assetManager.openXmlResourceParser(a42.u(assetManager, (File)exception[i]), "AndroidManifest.xml");
      a42 a421 = this.c;
      a421.c = xmlResourceParser;
      if (xmlResourceParser != null) {
        while (true) {
          int j = ((XmlResourceParser)a421.c).next();
          if (j != 2) {
            if (j != 1)
              continue; 
            break;
          } 
          if (((XmlResourceParser)a421.c).getName().equals("manifest")) {
            String str2 = ((XmlResourceParser)a421.c).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
            String str1 = ((XmlResourceParser)a421.c).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
            if (str2 != null) {
              try {
                j = Integer.parseInt(str2);
                if (str1 == null) {
                  long l1 = j;
                  continue;
                } 
                try {
                  int k = Integer.parseInt(str1);
                  long l1 = k;
                  l1 = j & 0xFFFFFFFFL | l1 << 32L;
                  if (l != l1)
                    return false; 
                } catch (NumberFormatException numberFormatException) {
                  throw new XmlPullParserException(x41.k("Couldn't parse versionCodeMajor to int: ", numberFormatException.getMessage()));
                } 
              } catch (NumberFormatException numberFormatException) {
                throw new XmlPullParserException(x41.k("Couldn't parse versionCode to int: ", numberFormatException.getMessage()));
              } 
              continue;
            } 
            throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
          } 
          break;
        } 
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
      } 
      throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    } 
    return true;
  }
  
  public final boolean b(File[] paramArrayOfFile) {
    ArrayList<CertificateException> arrayList;
    Context context = this.b;
    PackageInfo packageInfo1 = this.d;
    PackageInfo packageInfo3 = null;
    if (packageInfo1 == null)
      try {
        this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        context = null;
      }  
    PackageInfo packageInfo2 = this.d;
    packageInfo1 = packageInfo3;
    if (packageInfo2 != null)
      if (packageInfo2.signatures == null) {
        packageInfo1 = packageInfo3;
      } else {
        ArrayList<CertificateException> arrayList1 = new ArrayList();
        for (Signature signature : packageInfo2.signatures) {
          try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
            this(signature.toByteArray());
            X509Certificate x509Certificate = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
          } catch (CertificateException certificateException) {
            Log.e("SplitCompat", "Cannot decode certificate.", certificateException);
            certificateException = null;
          } 
          if (certificateException != null)
            arrayList1.add(certificateException); 
        } 
        arrayList = arrayList1;
      }  
    if (arrayList == null || arrayList.isEmpty()) {
      Log.e("SplitCompat", "No app certificates found.");
      return false;
    } 
    int i = paramArrayOfFile.length;
    label71: while (true) {
      int j = i - 1;
      if (j >= 0) {
        X509Certificate x509Certificate;
        File file = paramArrayOfFile[j];
        try {
          String str = file.getAbsolutePath();
          try {
            X509Certificate[][] arrayOfX509Certificate = dd1.H0(str);
            if (arrayOfX509Certificate == null || arrayOfX509Certificate.length == 0 || (arrayOfX509Certificate[0]).length == 0) {
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append("Downloaded split ");
              stringBuilder1.append(str);
              stringBuilder1.append(" is not signed.");
              Log.e("SplitCompat", stringBuilder1.toString());
              continue;
            } 
            if (arrayList.isEmpty()) {
              Log.e("SplitCompat", "No certificates found for app.");
              continue;
            } 
            int m = arrayList.size();
            int k = 0;
            label69: while (true) {
              i = j;
              if (k < m) {
                str = (String)arrayList.get(k);
                int n = k + 1;
                x509Certificate = (X509Certificate)str;
                int i1 = arrayOfX509Certificate.length;
                i = 0;
                while (i < i1) {
                  k = n;
                  if (!arrayOfX509Certificate[i][0].equals(x509Certificate)) {
                    i++;
                    continue;
                  } 
                  continue label69;
                } 
                Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                Log.e("SplitCompat", "Split verification failure.");
                return false;
              } 
              continue label71;
            } 
            break;
          } catch (Exception null) {}
        } catch (Exception exception) {}
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Downloaded split ");
        stringBuilder.append((String)x509Certificate);
        stringBuilder.append(" is not signed.");
        Log.e("SplitCompat", stringBuilder.toString(), exception);
      } 
      return true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ge2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */