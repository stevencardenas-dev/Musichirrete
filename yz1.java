import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

public final class yz1 extends xz1 {
  public final Font b0(ha0 paramha0) {
    Uri uri = paramha0.a;
    boolean bool = Objects.equals(uri.getScheme(), "systemfont");
    String str = paramha0.e;
    if (bool) {
      String str1 = uri.getAuthority();
    } else {
      paramha0 = null;
    } 
    if (paramha0 != null) {
      Typeface typeface1 = Typeface.create((String)paramha0, 0);
      Typeface typeface2 = Typeface.create(Typeface.DEFAULT, 0);
      if (typeface1 == null || typeface1.equals(typeface2))
        typeface1 = null; 
      if (typeface1 != null) {
        Font font = sz1.d(typeface1);
        if (font != null) {
          if (TextUtils.isEmpty(str))
            return font; 
          try {
            Font.Builder builder = new Font.Builder();
            this(font);
            return builder.setFontVariationSettings(str).build();
          } catch (IOException iOException) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
          } 
        } 
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */