import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Collections;
import java.util.Set;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public abstract class je0 {
  public final Context a;
  
  public final String b;
  
  public final gh1 c;
  
  public final g7 d;
  
  public final j5 e;
  
  public final m5 f;
  
  public final Looper g;
  
  public final int h;
  
  public final ip2 i;
  
  public final oe0 j;
  
  public je0(Context paramContext, g7 paramg7, j5 paramj5, ie0 paramie0) {
    String str;
    n21.n("Null context is not permitted.", paramContext);
    n21.n(xveccWbRzqx.RnLDhvXDZRCk, paramg7);
    n21.n("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", paramie0);
    Context context = paramContext.getApplicationContext();
    n21.n("The provided context did not have an application context.", context);
    this.a = context;
    int i = Build.VERSION.SDK_INT;
    gh1 gh11 = null;
    if (i >= 30 && i >= 30) {
      str = paramContext.getAttributionTag();
    } else {
      str = null;
    } 
    this.b = str;
    if (i >= 31)
      gh11 = new gh1(11, paramContext.getAttributionSource()); 
    this.c = gh11;
    this.d = paramg7;
    this.e = paramj5;
    this.g = paramie0.b;
    this.f = new m5(paramg7, paramj5, str);
    ta2 ta2 = new ta2();
    oe0 oe01 = oe0.d(context);
    this.j = oe01;
    this.h = oe01.j.getAndIncrement();
    this.i = paramie0.a;
    cl cl = oe01.o;
    cl.sendMessage(cl.obtainMessage(7, this));
  }
  
  public final p01 a() {
    p01 p01 = new p01(4);
    Set set = Collections.EMPTY_SET;
    if ((d9)p01.c == null)
      p01.c = new d9(0); 
    ((d9)p01.c).addAll(set);
    Context context = this.a;
    p01.f = context.getClass().getName();
    p01.e = context.getPackageName();
    return p01;
  }
  
  public final qo0 b(id2 paramid2) {
    Looper looper = this.g;
    n21.n("Listener must not be null", paramid2);
    n21.n(fXMDNeMWaILNVh.KlohOqSER, looper);
    Object object = new Object();
    new cl(looper, 7);
    n21.k("castDeviceControllerListenerKey");
    ((qo0)object).a = new po0(paramid2);
    return (qo0)object;
  }
  
  public final du2 c(int paramInt, ah paramah) {
    nt1 nt1 = new nt1();
    oe0 oe01 = this.j;
    oe01.getClass();
    oe01.b(nt1, paramah.b, this);
    ab2 ab2 = new ab2(new lb2(paramInt, paramah, nt1, this.i), oe01.k.get(), this);
    cl cl = oe01.o;
    cl.sendMessage(cl.obtainMessage(4, ab2));
    return nt1.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\je0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */