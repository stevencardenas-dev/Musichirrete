import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class z90 implements Callable {
  public final int a;
  
  public final String b;
  
  public final Context c;
  
  public final int d;
  
  public final Object e;
  
  public final Object call() {
    ba0 ba0;
    int j = this.a;
    int i = this.d;
    Object object1 = this.e;
    Context context = this.c;
    String str = this.b;
    switch (j) {
      default:
        try {
          ba0 = ca0.b(str, context, (ArrayList)object1, i);
        } finally {
          context = null;
        } 
      case 0:
        break;
    } 
    y90 y90 = (y90)object1;
    object1 = new ArrayList(1);
    (new Object[1])[0] = y90;
    Object object2 = (new Object[1])[0];
    Objects.requireNonNull(object2);
    object1.add(object2);
    return ca0.b(str, (Context)ba0, Collections.unmodifiableList((List<?>)object1), i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */