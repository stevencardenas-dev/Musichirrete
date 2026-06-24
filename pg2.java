import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class pg2 extends je0 {
  public static final rp0 G = new rp0("CastClient", null);
  
  public static final g7 H = new g7("Cast.API_CXLESS", new la2(3), de2.a);
  
  public final CastDevice A;
  
  public final HashMap B;
  
  public final HashMap C;
  
  public final fu2 D;
  
  public final List E = Collections.synchronizedList(new ArrayList());
  
  public int F;
  
  public final mg2 k = new mg2(this);
  
  public cl l;
  
  public boolean m;
  
  public boolean n;
  
  public nt1 o;
  
  public nt1 p;
  
  public final AtomicLong q;
  
  public final Object r = new Object();
  
  public final Object s = new Object();
  
  public q8 t;
  
  public String u;
  
  public double v;
  
  public boolean w;
  
  public int x;
  
  public int y;
  
  public oe2 z;
  
  public pg2(Context paramContext, aj paramaj) {
    super(paramContext, H, paramaj, ie0.c);
    this.D = paramaj.c;
    this.A = paramaj.b;
    this.B = new HashMap<Object, Object>();
    this.C = new HashMap<Object, Object>();
    this.q = new AtomicLong(0L);
    this.F = 1;
    k();
  }
  
  public final void d(int paramInt) {
    Exception exception;
    Object object = this.s;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      nt1 nt11 = this.p;
      if (nt11 == null) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    if (paramInt == 0) {
      Status status = new Status();
      this(0, null, null, null);
      exception.b(status);
    } else {
      Status status = new Status();
      this(paramInt, null, null, null);
      l5 l5 = new l5();
      this(status);
      exception.a(l5);
    } 
    this.p = null;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void e(int paramInt, long paramLong) {
    synchronized (this.B) {
      Long long_ = Long.valueOf(paramLong);
      nt1 nt11 = (nt1)null.get(long_);
      null.remove(long_);
      if (nt11 != null) {
        if (paramInt == 0) {
          nt11.b(null);
          return;
        } 
        nt11.a(new l5(new Status(paramInt, null, null, null)));
      } 
      return;
    } 
  }
  
  public final Handler f() {
    if (this.l == null)
      this.l = new cl(this.g, 6); 
    return this.l;
  }
  
  public final du2 g(id2 paramid2) {
    po0 po0 = (b(paramid2)).a;
    n21.n("Key must not be null", po0);
    oe0 oe0 = this.j;
    oe0.getClass();
    nt1 nt11 = new nt1();
    oe0.b(nt11, 8415, this);
    ab2 ab2 = new ab2(new ib2(po0, nt11), oe0.k.get(), this);
    cl cl1 = oe0.o;
    cl1.sendMessage(cl1.obtainMessage(13, ab2));
    return nt11.a;
  }
  
  public final void h() {
    G.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.C) {
      null.clear();
      return;
    } 
  }
  
  public final boolean i() {
    return (this.F == 3);
  }
  
  public final void j(int paramInt) {
    Object object = this.r;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      nt1 nt11 = this.o;
      if (nt11 != null) {
        Status status = new Status();
        this(paramInt, null, null, null);
        l5 l5 = new l5();
        this(status);
        nt11.a(l5);
      } 
    } finally {
      Exception exception;
    } 
    this.o = null;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void k() {
    CastDevice castDevice = this.A;
    qp0 qp0 = castDevice.k;
    if (!qp0.l(2048) && qp0.l(4) && !qp0.l(1))
      "Chromecast Audio".equals(castDevice.g); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */