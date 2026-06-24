import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class ck0 implements qh0 {
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ck0.class, "_isCompleting$volatile");
  
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ck0.class, Object.class, "_rootCause$volatile");
  
  public static final AtomicReferenceFieldUpdater f;
  
  public static final long g;
  
  public static final long h;
  
  public volatile Object _exceptionsHolder$volatile;
  
  public volatile int _isCompleting$volatile;
  
  public volatile Object _rootCause$volatile;
  
  public final f21 b;
  
  static {
    Unsafe unsafe = oi.a;
    h = unsafe.objectFieldOffset(ck0.class.getDeclaredField("_rootCause$volatile"));
    f = AtomicReferenceFieldUpdater.newUpdater(ck0.class, Object.class, "_exceptionsHolder$volatile");
    g = unsafe.objectFieldOffset(ck0.class.getDeclaredField("_exceptionsHolder$volatile"));
  }
  
  public ck0(f21 paramf21, Throwable paramThrowable) {
    this.b = paramf21;
    this._isCompleting$volatile = 0;
    this._rootCause$volatile = paramThrowable;
  }
  
  public final boolean a() {
    return (e() == null);
  }
  
  public final void b(Throwable paramThrowable) {
    Throwable throwable = e();
    if (throwable == null) {
      i(paramThrowable);
      return;
    } 
    if (paramThrowable != throwable) {
      Object object = c();
      if (object == null) {
        h(paramThrowable);
        return;
      } 
      if (object instanceof Throwable) {
        if (paramThrowable != object) {
          ArrayList<Object> arrayList = new ArrayList(4);
          arrayList.add(object);
          arrayList.add(paramThrowable);
          h(arrayList);
          return;
        } 
        return;
      } 
      if (object instanceof ArrayList) {
        ((ArrayList<Throwable>)object).add(paramThrowable);
        return;
      } 
      tp.k("State is ", object);
      return;
    } 
  }
  
  public final Object c() {
    f.getClass();
    return oi.a.getObjectVolatile(this, g);
  }
  
  public final f21 d() {
    return this.b;
  }
  
  public final Throwable e() {
    e.getClass();
    return (Throwable)oi.a.getObjectVolatile(this, h);
  }
  
  public final boolean f() {
    return (e() != null);
  }
  
  public final ArrayList g(Throwable paramThrowable) {
    ArrayList<Object> arrayList;
    Object object = c();
    if (object == null) {
      arrayList = new ArrayList(4);
    } else if (object instanceof Throwable) {
      arrayList = new ArrayList(4);
      arrayList.add(object);
    } else if (object instanceof ArrayList) {
      arrayList = (ArrayList)object;
    } else {
      tp.k("State is ", object);
      return null;
    } 
    object = e();
    if (object != null)
      arrayList.add(0, object); 
    if (paramThrowable != null && !paramThrowable.equals(object))
      arrayList.add(paramThrowable); 
    h(wf2.j);
    return arrayList;
  }
  
  public final void h(Object paramObject) {
    f.getClass();
    oi.a.putObjectVolatile(this, g, paramObject);
  }
  
  public final void i(Throwable paramThrowable) {
    e.getClass();
    oi.a.putObjectVolatile(this, h, paramThrowable);
  }
  
  public final String toString() {
    boolean bool;
    StringBuilder stringBuilder = new StringBuilder("Finishing[cancelling=");
    stringBuilder.append(f());
    stringBuilder.append(", completing=");
    if (c.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    stringBuilder.append(bool);
    stringBuilder.append(", rootCause=");
    stringBuilder.append(e());
    stringBuilder.append(", exceptions=");
    stringBuilder.append(c());
    stringBuilder.append(", list=");
    stringBuilder.append(this.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ck0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */