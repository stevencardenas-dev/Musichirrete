import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class x10 {
  public static final Field a;
  
  static {
    Field field = null;
    try {
      Field field1 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      field = field1;
      field1.setAccessible(true);
      field = field1;
    } catch (NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.printStackTrace();
    } 
    a = field;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */