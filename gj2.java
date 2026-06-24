import java.io.Serializable;
import java.util.logging.Logger;

public final class gj2 implements zl2 {
  public final int b;
  
  public final Serializable c;
  
  public volatile Object e;
  
  public Object f;
  
  public gj2(int paramInt) {
    bg2 bg2;
    this.c = (Serializable)new Object();
    this.f = ju2.class.getName();
  }
  
  public gj2(Class paramClass) {
    this.c = (Serializable)new Object();
    this.f = paramClass.getName();
  }
  
  public Object a() {
    zl2 zl21 = (zl2)this.e;
    bg2 bg2 = bg2.c;
    if (zl21 != bg2) {
      xh xh = (xh)this.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
      try {
        if ((zl2)this.e != bg2) {
          Object object = ((zl2)this.e).a();
          this.f = object;
          this.e = bg2;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
          return object;
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
    } 
    return this.f;
  }
  
  public Logger b() {
    switch (this.b) {
      default:
        logger = (Logger)this.e;
        if (logger == null) {
          xh xh = (xh)this.c;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
          try {
            logger = (Logger)this.e;
            if (logger != null) {
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
            } else {
              logger = Logger.getLogger((String)this.f);
              this.e = logger;
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
            } 
          } finally {}
        } 
        return logger;
      case 0:
        break;
    } 
    Logger logger = (Logger)this.e;
    if (logger == null) {
      xh xh = (xh)this.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
      try {
        logger = (Logger)this.e;
        if (logger != null) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
        } else {
          logger = Logger.getLogger((String)this.f);
          this.e = logger;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{xh}, name=null} */
        } 
      } finally {}
    } 
    return logger;
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    zl2 zl22 = (zl2)this.e;
    zl2 zl21 = zl22;
    if (zl22 == bg2.c) {
      str = String.valueOf(this.f);
      str = x41.o(new StringBuilder(str.length() + 25), "<supplier that returned ", str, ">");
    } 
    String str = String.valueOf(str);
    return x41.o(new StringBuilder(str.length() + 19), "Suppliers.memoize(", str, ")");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */