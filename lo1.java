import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class lo1 {
  public static final k20 p = new k20(1);
  
  public static final k20 q = new k20(2);
  
  public static final k20 r = new k20(3);
  
  public static final k20 s = new k20(4);
  
  public static final k20 t = new k20(5);
  
  public static final k20 u = new k20(0);
  
  public float a = 0.0F;
  
  public float b = Float.MAX_VALUE;
  
  public boolean c = false;
  
  public final Object d;
  
  public final qv e;
  
  public boolean f = false;
  
  public final float g = Float.MAX_VALUE;
  
  public final float h = -3.4028235E38F;
  
  public long i = 0L;
  
  public final float j;
  
  public final ArrayList k = new ArrayList();
  
  public final ArrayList l = new ArrayList();
  
  public mo1 m;
  
  public float n;
  
  public boolean o;
  
  public lo1(Object paramObject, qv paramqv) {
    this.d = paramObject;
    this.e = paramqv;
    if (paramqv == r || paramqv == s || paramqv == t) {
      this.j = 0.1F;
    } else if (paramqv == u) {
      this.j = 0.00390625F;
    } else if (paramqv == p || paramqv == q) {
      this.j = 0.002F;
    } else {
      this.j = 1.0F;
    } 
    this.m = null;
    this.n = Float.MAX_VALUE;
    this.o = false;
  }
  
  public static f5 b() {
    ThreadLocal<f5> threadLocal = f5.i;
    if (threadLocal.get() == null)
      threadLocal.set(new f5(new g7(2))); 
    return threadLocal.get();
  }
  
  public final void a(float paramFloat) {
    if (this.f) {
      this.n = paramFloat;
      return;
    } 
    if (this.m == null)
      this.m = new mo1(paramFloat); 
    mo1 mo11 = this.m;
    double d = paramFloat;
    mo11.i = d;
    d = (float)d;
    float f = this.g;
    if (d <= f) {
      paramFloat = this.h;
      if (d >= paramFloat) {
        d = Math.abs((this.j * 0.75F));
        mo11.d = d;
        mo11.e = d * 62.5D;
        g7 g7 = (b()).e;
        g7.getClass();
        if (Thread.currentThread() == ((Looper)g7.e).getThread()) {
          boolean bool = this.f;
          if (!bool && !bool) {
            this.f = true;
            if (!this.c)
              this.b = this.e.A(this.d); 
            float f1 = this.b;
            if (f1 <= f && f1 >= paramFloat) {
              b().a(this);
              return;
            } 
            l0.l(zLtYiJUm.OtsWQuq);
          } 
          return;
        } 
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
      } 
      tp.j("Final position of the spring cannot be less than the min value.");
      return;
    } 
    tp.j("Final position of the spring cannot be greater than the max value.");
  }
  
  public final void c(float paramFloat) {
    this.e.Z(this.d, paramFloat);
    int i = 0;
    while (true) {
      ArrayList<iw1> arrayList = this.l;
      if (i < arrayList.size()) {
        if (arrayList.get(i) == null) {
          i++;
          continue;
        } 
        ((iw1)arrayList.get(i)).getClass();
        throw null;
      } 
      for (i = arrayList.size() - 1; i >= 0; i--) {
        if (arrayList.get(i) == null)
          arrayList.remove(i); 
      } 
      return;
    } 
  }
  
  public final void d() {
    if (this.m.b > 0.0D) {
      g7 g7 = (b()).e;
      g7.getClass();
      if (Thread.currentThread() == ((Looper)g7.e).getThread()) {
        if (this.f)
          this.o = true; 
        return;
      } 
      throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    } 
    tp.j("Spring animations can only come to an end when there is damping");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */