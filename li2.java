import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class li2 implements hj2 {
  static {
    try {
      bool = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    } catch (SecurityException securityException) {
      bool = false;
    } 
    h = bool;
    Object object1 = System.getProperty("java.runtime.name", "");
    Exception exception = null;
    if (object1 == null || object1.contains("Android")) {
      Error error3;
      try {
        ii2 ii21 = new ii2();
        super();
        ii2 ii23 = null;
        exception = null;
        ii2 ii22 = ii21;
        ii21 = ii23;
      } catch (Exception exception1) {
        try {
          gi2 gi2 = new gi2();
          super();
          Exception exception2 = exception;
          exception = exception1;
          exception1 = exception2;
        } catch (Exception exception2) {
          exception = exception2;
        } catch (Error error2) {
          error3 = error2;
        } 
      } catch (Error error1) {}
      i = (wf2)error2;
      if (error1 != null) {
        gj2 gj21 = g;
        Logger logger = gj21.b();
        Level level = Level.SEVERE;
        logger.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", error3);
        gj21.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", error1);
      } 
      return;
    } 
    try {
      gi2 gi2 = new gi2();
      super();
    } catch (NoClassDefFoundError noClassDefFoundError) {
      object1 = new Object();
    } 
    Object object = null;
    exception = null;
    Object object2 = object1;
    object1 = object;
  }
  
  public final void c(ji2 paramji2) {
    paramji2.a = null;
    label23: while (true) {
      paramji2 = this.e;
      if (paramji2 != ji2.c)
        for (Object object = null; paramji2 != null; object = object1) {
          Object object1;
          ji2 ji21 = paramji2.b;
          if (paramji2.a != null) {
            object1 = paramji2;
          } else if (object != null) {
            ((ji2)object).b = ji21;
            object1 = object;
            if (((ji2)object).a == null)
              continue label23; 
          } else {
            object1 = object;
            if (!i.K0(this, paramji2, ji21))
              continue label23; 
          } 
          paramji2 = ji21;
        }  
      break;
    } 
  }
  
  public abstract Throwable d();
  
  static {
    boolean bool;
  }
  
  public static final Object f = new Object();
  
  public static final gj2 g = new gj2(kj2.class);
  
  public static final boolean h;
  
  public static final wf2 i;
  
  public volatile Object b;
  
  public volatile fi2 c;
  
  public volatile ji2 e;
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\li2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */