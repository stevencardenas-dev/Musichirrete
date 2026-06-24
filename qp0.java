import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class qp0 implements p20, xq2 {
  public static final Object c = new Object();
  
  public static volatile qp0 e;
  
  public final int b;
  
  public qp0(kw0 paramkw0) {
    this.b = paramkw0.g;
  }
  
  public static qp0 h() {
    Object object = c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (e == null) {
        qp0 qp02 = new qp0();
        this(3);
        e = qp02;
      } 
    } finally {
      Exception exception;
    } 
    qp0 qp01 = e;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return qp01;
  }
  
  public static String j(String paramString) {
    int i = paramString.length();
    StringBuilder stringBuilder = new StringBuilder(23);
    stringBuilder.append("WM-");
    if (i >= 20) {
      stringBuilder.append(paramString.substring(0, 20));
    } else {
      stringBuilder.append(paramString);
    } 
    return stringBuilder.toString();
  }
  
  public tb2 a(tb2 paramtb2) {
    if (paramtb2 == null)
      return null; 
    int i = paramtb2.a;
    long l1 = paramtb2.d;
    long l2 = paramtb2.e;
    List<? extends E> list = paramtb2.f;
    ArrayList arrayList2 = new ArrayList();
    if (list != null) {
      this(list);
    } else {
      this();
    } 
    list = paramtb2.g;
    ArrayList arrayList1 = new ArrayList();
    if (list != null) {
      this(list);
    } else {
      this();
    } 
    return tb2.a(i, 6, this.b, l1, l2, arrayList2, arrayList1);
  }
  
  public void b(String paramString1, String paramString2) {
    if (this.b <= 3)
      Log.d(paramString1, paramString2); 
  }
  
  public int c(Context paramContext) {
    return this.b;
  }
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable) {
    if (this.b <= 3)
      Log.d(paramString1, paramString2, paramThrowable); 
  }
  
  public int e(Context paramContext, boolean paramBoolean) {
    return 0;
  }
  
  public void f(String paramString1, String paramString2) {
    if (this.b <= 6)
      Log.e(paramString1, paramString2); 
  }
  
  public void g(String paramString1, String paramString2, Throwable paramThrowable) {
    if (this.b <= 6)
      Log.e(paramString1, paramString2, paramThrowable); 
  }
  
  public void i(String paramString1, String paramString2) {
    if (this.b <= 4)
      Log.i(paramString1, paramString2); 
  }
  
  public void k(String paramString1, String paramString2) {
    if (this.b <= 5)
      Log.w(paramString1, paramString2); 
  }
  
  public boolean l(int paramInt) {
    return ((this.b & paramInt) == paramInt);
  }
  
  public boolean m() {
    return !((!l(32) || l(64) || l(128)) && !l(64));
  }
  
  public boolean n() {
    return (m() || l(128));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */