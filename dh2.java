import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;

public final class dh2 implements ServiceConnection {
  public final lf b;
  
  public final cp1 c;
  
  public final cp1 e;
  
  public final ef f;
  
  public dh2(ef paramef, lf paramlf) {
    this.f = paramef;
    dd1 dd1 = paramef.B;
    this.c = new cp1(dd1);
    this.e = new cp1(dd1);
    this.b = paramlf;
  }
  
  public final Long a(boolean paramBoolean) {
    ef ef1 = this.f;
    if (paramBoolean)
      try {
        Object object1 = ef1.a;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return null;
      } finally {
        ef1 = null;
        ph2.i("BillingClient", "Exception getting connection establishment duration.", (Throwable)ef1);
      }  
    Object object = ef1.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      cp1 cp11 = this.e;
      if (cp11.b) {
        long l = ((dd1)cp11.e).F0();
        if (cp11.b) {
          cp11.b = false;
          long l1 = cp11.c;
          l = l - cp11.d + l1;
          cp11.c = l;
          l /= 1000000L;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return Long.valueOf(l);
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("This stopwatch is already stopped.");
        throw illegalStateException;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return null;
  }
  
  public final void b(qf paramqf, int paramInt, String paramString, boolean paramBoolean) {
    try {
      bn2 bn2;
      ln2 ln2 = mn2.q();
      int i = paramqf.a;
      ln2.b();
      mn2.p((mn2)ln2.c, i);
      String str = paramqf.c;
      ln2.b();
      mn2.s((mn2)ln2.c, str);
      ln2.c(paramInt);
      ln2.b();
      mn2.t((mn2)ln2.c);
      if (paramString != null) {
        ln2.b();
        mn2.r((mn2)ln2.c, paramString);
      } 
      Long long_ = a(paramBoolean);
      ef ef1 = this.f;
      if (paramBoolean) {
        ko2 ko2 = lo2.p();
        ko2.c(false);
        ko2.d();
        ko2.b();
        lo2.t((lo2)ko2.c);
        if (long_ != null) {
          long l = long_.longValue();
          ko2.b();
          lo2.s((lo2)ko2.c, l);
        } 
        bn2 = cn2.s();
        bn2.c(ln2);
        bn2.e(6);
        return;
      } 
      ho2 ho2 = io2.p();
      ho2.b();
      io2.q((io2)ho2.c, (mn2)ln2.a());
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void c(qf paramqf) {
    ef ef1 = this.f;
    Object object = ef1.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (ef1.b == 3) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", eRUgfgGAccgka.jxMJawHxjP, (Throwable)paramqf);
    } 
  }
  
  public final void onBindingDied(ComponentName paramComponentName) {
    ef ef1;
    ph2.h("BillingClient", "Billing service died.");
    try {
      ef1 = this.f;
      Object object = ef1.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        int i = ef1.b;
        boolean bool = true;
        if (i != 1)
          bool = false; 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        j01 j01 = ef1.h;
        if (bool) {
          object = cn2.s();
          object.e(6);
          ln2 ln2 = mn2.q();
          ln2.c(110);
          object.c(ln2);
          ko2 ko2 = lo2.p();
          ko2.c(false);
          ko2.d();
          object.d(ko2);
          j01.J((cn2)object.a());
        } else {
          j01.N(nn2.p());
        } 
      } finally {}
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{android/content/ComponentName}, name=paramComponentName} */
    throw ef1;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    IInterface iInterface;
    ph2.g("BillingClient", "Billing service connected.");
    ef ef1 = this.f;
    Object object = ef1.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (ef1.b == 3) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    int i = me2.f;
    if (paramIBinder == null) {
      paramComponentName = null;
    } else {
      iInterface = paramIBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
      if (iInterface instanceof qe2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(paramIBinder, "com.android.vending.billing.IInAppBillingService", 3);
      } 
    } 
    ef1.i = (qe2)iInterface;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    if (ef.g(new ah2(0, this), 30000L, new yi1(19, this), ef1.l(), ef1.f()) == null) {
      qf qf = ef1.o();
      ef1.r(25, qf);
      c(qf);
    } 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    ef ef1;
    ph2.h("BillingClient", "Billing service disconnected.");
    try {
      ef1 = this.f;
      Object object = ef1.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        int i = ef1.b;
        boolean bool = true;
        if (i != 1)
          bool = false; 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        object = ef1.h;
        if (bool) {
          bn2 bn2 = cn2.s();
          bn2.e(6);
          ln2 ln2 = mn2.q();
          ln2.c(109);
          bn2.c(ln2);
          ko2 ko2 = lo2.p();
          ko2.c(false);
          ko2.d();
          bn2.d(ko2);
          object.J((cn2)bn2.a());
        } else {
          object.P(jo2.p());
        } 
      } finally {}
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{android/content/ComponentName}, name=paramComponentName} */
    throw ef1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */