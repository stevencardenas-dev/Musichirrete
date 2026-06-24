import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

public final class o21 {
  public final Bundle a;
  
  public IconCompat b;
  
  public final mf1[] c;
  
  public final boolean d;
  
  public final boolean e = true;
  
  public final int f;
  
  public final CharSequence g;
  
  public final PendingIntent h;
  
  public o21(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, mf1[] paramArrayOfmf1, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramIconCompat;
    if (paramIconCompat != null) {
      int j = paramIconCompat.a;
      int i = j;
      if (j == -1) {
        Object object = paramIconCompat.b;
        if (Build.VERSION.SDK_INT >= 28) {
          i = k5.p(object);
        } else {
          try {
            i = ((Integer)object.getClass().getMethod("getType", null).invoke(object, null)).intValue();
          } catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder = new StringBuilder("Unable to get icon type ");
            stringBuilder.append(object);
            Log.e("IconCompat", stringBuilder.toString(), illegalAccessException);
            i = -1;
          } catch (InvocationTargetException invocationTargetException) {
          
          } catch (NoSuchMethodException noSuchMethodException) {}
        } 
      } 
      if (i == 2)
        this.f = paramIconCompat.c(); 
    } 
    this.g = s21.c(paramCharSequence);
    this.h = paramPendingIntent;
    if (paramBundle == null)
      paramBundle = new Bundle(); 
    this.a = paramBundle;
    this.c = paramArrayOfmf1;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */