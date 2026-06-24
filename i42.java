import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

public class i42 extends z51 {
  public static boolean O = true;
  
  public static boolean P = true;
  
  public static boolean Q = true;
  
  public static boolean R = true;
  
  public void Z(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (Q)
      try {
        g42.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        Q = false;
      }  
  }
  
  public void a0(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT == 28) {
      if (!z51.N) {
        try {
          Field field1 = View.class.getDeclaredField("mViewFlags");
          z51.M = field1;
          field1.setAccessible(true);
        } catch (NoSuchFieldException noSuchFieldException) {
          Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
        } 
        z51.N = true;
      } 
      Field field = z51.M;
      if (field != null)
        try {
          int i = field.getInt(paramView);
          z51.M.setInt(paramView, i & 0xFFFFFFF3 | paramInt);
        } catch (IllegalAccessException illegalAccessException) {} 
    } else if (R) {
      try {
        h42.a((View)illegalAccessException, paramInt);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        R = false;
      } 
    } 
  }
  
  public void b0(View paramView, Matrix paramMatrix) {
    if (O)
      try {
        f42.b(paramView, paramMatrix);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        O = false;
      }  
  }
  
  public void c0(ViewGroup paramViewGroup, Matrix paramMatrix) {
    if (P)
      try {
        f42.c((View)paramViewGroup, paramMatrix);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        P = false;
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */