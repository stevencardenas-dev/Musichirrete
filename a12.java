import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class a12 implements d10 {
  public static volatile HttpResponseCache c;
  
  public static final Object e = new Object();
  
  public static final rf f = new rf(2);
  
  public final Context b;
  
  public a12(Context paramContext) {
    this.b = paramContext.getApplicationContext();
  }
  
  public final b10 b(int paramInt, Uri paramUri) {
    Context context = this.b;
    if (c == null)
      try {
        Object object = e;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (c == null) {
            File file = new File();
            this(context.getApplicationContext().getCacheDir(), "picasso-cache");
            if (!file.exists())
              file.mkdirs(); 
            HttpResponseCache httpResponseCache2 = HttpResponseCache.getInstalled();
            HttpResponseCache httpResponseCache1 = httpResponseCache2;
            if (httpResponseCache2 == null)
              httpResponseCache1 = HttpResponseCache.install(file, ii0.a(file)); 
            c = httpResponseCache1;
          } 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } catch (IOException iOException) {} 
    HttpURLConnection httpURLConnection = (HttpURLConnection)(new URL(paramUri.toString())).openConnection();
    httpURLConnection.setConnectTimeout(15000);
    httpURLConnection.setReadTimeout(20000);
    boolean bool = true;
    httpURLConnection.setUseCaches(true);
    if (paramInt != 0) {
      String str1;
      if ((paramInt & 0x4) != 0) {
        str1 = "only-if-cached,max-age=2147483647";
      } else {
        StringBuilder stringBuilder1 = f.get();
        stringBuilder1.setLength(0);
        if ((paramInt & 0x1) != 0)
          stringBuilder1.append("no-cache"); 
        if ((paramInt & 0x2) != 0) {
          if (stringBuilder1.length() > 0)
            stringBuilder1.append(','); 
          stringBuilder1.append("no-store");
        } 
        str1 = stringBuilder1.toString();
      } 
      httpURLConnection.setRequestProperty("Cache-Control", str1);
    } 
    int i = httpURLConnection.getResponseCode();
    if (i < 300) {
      long l = httpURLConnection.getHeaderFieldInt("Content-Length", -1);
      String str1 = httpURLConnection.getHeaderField("X-Android-Response-Source");
      if (str1 != null) {
        String[] arrayOfString = str1.split(" ", 2);
        if ("CACHE".equals(arrayOfString[0]))
          return new b10(httpURLConnection.getInputStream(), bool, l); 
        if (arrayOfString.length != 1)
          try {
            if ("CONDITIONAL_CACHE".equals(arrayOfString[0])) {
              paramInt = Integer.parseInt(arrayOfString[1]);
              if (paramInt == 304)
                return new b10(httpURLConnection.getInputStream(), bool, l); 
            } 
          } catch (NumberFormatException numberFormatException) {} 
      } 
      bool = false;
      return new b10(httpURLConnection.getInputStream(), bool, l);
    } 
    httpURLConnection.disconnect();
    String str = httpURLConnection.getResponseMessage();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i);
    stringBuilder.append(" ");
    stringBuilder.append(str);
    throw new c10(stringBuilder.toString(), paramInt, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */