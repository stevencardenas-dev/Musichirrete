import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public abstract class lg1 {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static final WeakHashMap b = new WeakHashMap<Object, Object>(0);
  
  public static final Object c = new Object();
  
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, n21 paramn21, boolean paramBoolean1, boolean paramBoolean2) {
    String str2;
    Resources resources = paramContext.getResources();
    resources.getValue(paramInt1, paramTypedValue, true);
    CharSequence charSequence = paramTypedValue.string;
    if (charSequence != null) {
      String str = charSequence.toString();
      boolean bool = str.startsWith("res/");
      charSequence = null;
      if (!bool) {
        CharSequence charSequence1 = charSequence;
        if (paramn21 != null) {
          paramn21.f(-3);
          charSequence1 = charSequence;
        } 
      } else {
        int i = paramTypedValue.assetCookie;
        vp0 vp0 = sz1.b;
        Typeface typeface = (Typeface)vp0.f(sz1.b(resources, paramInt1, str, i, paramInt2));
        if (typeface != null) {
          if (paramn21 != null)
            (new Handler(Looper.getMainLooper())).post(new e6(18, paramn21, typeface)); 
          Typeface typeface1 = typeface;
        } else if (paramBoolean2) {
          CharSequence charSequence1 = charSequence;
        } else {
          try {
            Typeface typeface1;
            if (str.toLowerCase().endsWith(".xml")) {
              CharSequence charSequence1;
              da0 da0 = z51.B(resources.getXml(paramInt1), resources);
              if (da0 == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                charSequence1 = charSequence;
                if (paramn21 != null) {
                  paramn21.f(-3);
                  charSequence1 = charSequence;
                } 
              } else {
                typeface1 = sz1.a((Context)charSequence1, da0, resources, paramInt1, str, paramTypedValue.assetCookie, paramInt2, paramn21, paramBoolean1);
              } 
            } else {
              i = paramTypedValue.assetCookie;
              typeface1 = sz1.a.m((Context)typeface1, resources, paramInt1, str, paramInt2);
              if (typeface1 != null)
                vp0.j(sz1.b(resources, paramInt1, str, i, paramInt2), typeface1); 
              if (paramn21 != null)
                if (typeface1 != null) {
                  Handler handler = new Handler();
                  this(Looper.getMainLooper());
                  e6 e6 = new e6();
                  this(18, paramn21, typeface1);
                  handler.post(e6);
                } else {
                  paramn21.f(-3);
                }  
            } 
          } catch (XmlPullParserException xmlPullParserException) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(str), (Throwable)xmlPullParserException);
            CharSequence charSequence1 = charSequence;
            if (paramn21 != null) {
              paramn21.f(-3);
              charSequence1 = charSequence;
            } 
          } catch (IOException iOException) {}
        } 
      } 
      if (iOException != null || paramn21 != null || paramBoolean2)
        return (Typeface)iOException; 
      str2 = Integer.toHexString(paramInt1);
      StringBuilder stringBuilder = new StringBuilder("Font resource ID #0x");
      stringBuilder.append(str2);
      stringBuilder.append(" could not be retrieved.");
      throw new Resources.NotFoundException(stringBuilder.toString());
    } 
    String str1 = resources.getResourceName(paramInt1);
    String str3 = Integer.toHexString(paramInt1);
    charSequence = new StringBuilder("Resource \"");
    charSequence.append(str1);
    charSequence.append("\" (");
    charSequence.append(str3);
    charSequence.append(") is not a Font: ");
    charSequence.append(str2);
    throw new Resources.NotFoundException(charSequence.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */