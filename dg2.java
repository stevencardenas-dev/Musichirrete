import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

public final class dg2 {
  public static final f1 c = new f1("SplitInstallService");
  
  public static final Intent d = (new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE")).setPackage("com.android.vending");
  
  public final String a;
  
  public final md2 b;
  
  public dg2(Context paramContext, String paramString) {
    this.a = paramString;
    f1 f11 = zg2.a;
    try {
      PackageManager packageManager = paramContext.getPackageManager();
      byte b = 0;
      if ((packageManager.getApplicationInfo("com.android.vending", 0)).enabled) {
        Signature[] arrayOfSignature = (paramContext.getPackageManager().getPackageInfo("com.android.vending", 64)).signatures;
        if (arrayOfSignature != null) {
          int i = arrayOfSignature.length;
          if (i == 0)
            zg2.a.f("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]); 
          while (b < i) {
            String str;
            byte[] arrayOfByte = arrayOfSignature[b].toByteArray();
            try {
              MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
              messageDigest.update(arrayOfByte);
              str = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
              str = "";
            } 
            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
              String str1 = Build.TAGS;
              if ((!str1.contains("dev-keys") && !str1.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                b++;
                continue;
              } 
            } 
            Context context = paramContext.getApplicationContext();
            if (context != null)
              paramContext = context; 
            this.b = new md2(paramContext, c, d);
            return;
          } 
          return;
        } 
      } else {
        return;
      } 
      zg2.a.f("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
  }
  
  public static Bundle a(bv0 parambv0) {
    Bundle bundle = d();
    ArrayList<Bundle> arrayList1 = new ArrayList();
    ArrayList<Object> arrayList = parambv0.a;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      jp2 jp2 = (jp2)arrayList.get(b);
      b++;
      jp2 = jp2;
      Bundle bundle1 = new Bundle();
      bundle1.putInt("event_type", jp2.a);
      bundle1.putLong("event_timestamp", jp2.b);
      arrayList1.add(bundle1);
    } 
    bundle.putParcelableArrayList("event_timestamps", new ArrayList<Bundle>(arrayList1));
    return bundle;
  }
  
  public static Bundle d() {
    Bundle bundle = new Bundle();
    bundle.putInt("playcore_version_code", 11004);
    return bundle;
  }
  
  public static du2 e() {
    String str = oXrNDUqUkE.WXBUvYmnFOs;
    c.b(str, new Object[] { Integer.valueOf(-14) });
    return g92.C(new jo1(-14));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */