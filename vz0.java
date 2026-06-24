import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.Map;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public class vz0 {
  public static final Object k = new Object();
  
  public final Object a = new Object();
  
  public final ji1 b = new ji1();
  
  public int c = 0;
  
  public boolean d;
  
  public volatile Object e;
  
  public volatile Object f;
  
  public int g;
  
  public boolean h;
  
  public boolean i;
  
  public final e3 j;
  
  public vz0() {
    Object object = k;
    this.f = object;
    this.j = new e3(16, this);
    this.e = object;
    this.g = -1;
  }
  
  public vz0(int paramInt) {
    this.f = k;
    this.j = new e3(16, this);
    this.e = v41;
    this.g = 0;
  }
  
  public static void a(String paramString) {
    (s8.Z()).k.getClass();
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      return; 
    tp.f(x41.w("Cannot invoke ", paramString, PwbbJfsdcHrAjW.sPjCPwBKuKEdEK));
  }
  
  public final void b(ro0 paramro0) {
    if (paramro0.b) {
      int i = paramro0.c;
      int j = this.g;
      if (i < j) {
        paramro0.c = j;
        gh1 gh1 = paramro0.a;
        Object object = this.e;
        gh1.getClass();
        um0 um0 = (um0)object;
        object = gh1.c;
        if (um0 != null && ((vy)object).h0) {
          View view = object.v0();
          if (view.getParent() == null) {
            if (((vy)object).l0 != null) {
              if (lb0.M(3)) {
                StringBuilder stringBuilder = new StringBuilder("DialogFragment ");
                stringBuilder.append(gh1);
                stringBuilder.append(" setting the content view on ");
                stringBuilder.append(((vy)object).l0);
                Log.d("FragmentManager", stringBuilder.toString());
              } 
              ((vy)object).l0.setContentView(view);
              return;
            } 
          } else {
            tp.f("DialogFragment can not be attached to a container view");
          } 
        } 
      } 
    } 
  }
  
  public final void c(ro0 paramro0) {
    if (this.h) {
      this.i = true;
      return;
    } 
    this.h = true;
    while (true) {
      ro0 ro01;
      this.i = false;
      if (paramro0 != null) {
        b(paramro0);
        ro01 = null;
      } else {
        ji1 ji11 = this.b;
        ji11.getClass();
        hi1 hi1 = new hi1(ji11);
        ji11.e.put(hi1, Boolean.FALSE);
        while (true) {
          ro01 = paramro0;
          if (hi1.hasNext()) {
            b((ro0)((Map.Entry)hi1.next()).getValue());
            if (this.i) {
              ro01 = paramro0;
              break;
            } 
            continue;
          } 
          break;
        } 
      } 
      paramro0 = ro01;
      if (!this.i) {
        this.h = false;
        return;
      } 
    } 
  }
  
  public final void d(dd1 paramdd1) {
    synchronized (this.a) {
      boolean bool;
      if (this.f == k) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = paramdd1;
      if (!bool)
        return; 
      s8 s8 = s8.Z();
      null = this.j;
      lx lx = s8.k;
      if (lx.m == null) {
        Object object = lx.k;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (lx.m == null)
            lx.m = lx.Z(Looper.getMainLooper()); 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } 
      lx.m.post((Runnable)null);
      return;
    } 
  }
  
  public final void e(Object paramObject) {
    a("setValue");
    this.g++;
    this.e = paramObject;
    c(null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */