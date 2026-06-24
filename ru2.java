import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ru2 implements ho0 {
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
        pu2 pu21 = new pu2();
        super();
        pu2 pu23 = null;
        exception = null;
        pu2 pu22 = pu21;
        pu21 = pu23;
      } catch (Exception exception1) {
        try {
          ku2 ku2 = new ku2();
          super();
          Exception exception2 = exception1;
          exception1 = exception;
          exception = exception2;
        } catch (Exception exception2) {
          exception = exception2;
        } catch (Error error2) {
          error3 = error2;
        } 
      } catch (Error error1) {}
      i = (zo2)error2;
      if (error1 != null) {
        gj2 gj21 = g;
        Logger logger = gj21.b();
        Level level = Level.SEVERE;
        logger.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", error3);
        gj21.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", LHyji.SAnKvWGD, error1);
      } 
      return;
    } 
    try {
      ku2 ku2 = new ku2();
      super();
    } catch (NoClassDefFoundError noClassDefFoundError) {
      object1 = new Object();
    } 
    Object object = null;
    exception = null;
    Object object2 = object1;
    object1 = object;
  }
  
  public final void c(qu2 paramqu2) {
    paramqu2.a = null;
    label23: while (true) {
      paramqu2 = this.e;
      if (paramqu2 != qu2.c)
        for (Object object = null; paramqu2 != null; object = object1) {
          Object object1;
          qu2 qu21 = paramqu2.b;
          if (paramqu2.a != null) {
            object1 = paramqu2;
          } else if (object != null) {
            ((qu2)object).b = qu21;
            object1 = object;
            if (((qu2)object).a == null)
              continue label23; 
          } else {
            object1 = object;
            if (!i.b0(this, paramqu2, qu21))
              continue label23; 
          } 
          paramqu2 = qu21;
        }  
      break;
    } 
  }
  
  static {
    boolean bool;
  }
  
  public static final Object f = new Object();
  
  public static final gj2 g = new gj2(2);
  
  public static final boolean h;
  
  public static final zo2 i;
  
  public volatile Object b;
  
  public volatile iu2 c;
  
  public volatile qu2 e;
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ru2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */