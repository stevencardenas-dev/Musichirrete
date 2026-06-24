import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class c00 {
  public final Context a;
  
  public final ExecutorService b;
  
  public final d10 c;
  
  public final LinkedHashMap d;
  
  public final WeakHashMap e;
  
  public final WeakHashMap f;
  
  public final HashSet g;
  
  public final cj h;
  
  public final Handler i;
  
  public final bh0 j;
  
  public final rp1 k;
  
  public final ArrayList l;
  
  public final boolean m;
  
  public c00(Context paramContext, ThreadPoolExecutor paramThreadPoolExecutor, Handler paramHandler, d10 paramd10, bh0 parambh0, rp1 paramrp1) {
    HandlerThread handlerThread = new HandlerThread("Picasso-Dispatcher", 10);
    handlerThread.start();
    Looper looper = handlerThread.getLooper();
    boolean bool = false;
    cl cl = new cl(looper, 3, false);
    cl.sendMessageDelayed(cl.obtainMessage(), 1000L);
    this.a = paramContext;
    this.b = paramThreadPoolExecutor;
    this.d = new LinkedHashMap<Object, Object>();
    this.e = new WeakHashMap<Object, Object>();
    this.f = new WeakHashMap<Object, Object>();
    this.g = new HashSet();
    this.h = new cj(handlerThread.getLooper(), this, 1);
    this.c = paramd10;
    this.i = paramHandler;
    this.j = parambh0;
    this.k = paramrp1;
    this.l = new ArrayList(4);
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    } catch (NullPointerException nullPointerException) {}
    if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
      bool = true; 
    this.m = bool;
    q6 q6 = new q6(this);
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
    c00 c001 = (c00)q6.b;
    if (c001.m)
      intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE"); 
    ii0.m(c001.a, q6, intentFilter);
  }
  
  public final void a(uf paramuf) {
    Future future = paramuf.o;
    if (future != null && future.isCancelled())
      return; 
    this.l.add(paramuf);
    cj cj1 = this.h;
    if (!cj1.hasMessages(7))
      cj1.sendEmptyMessageDelayed(7, 200L); 
  }
  
  public final void b(uf paramuf) {
    cj cj1 = this.h;
    cj1.sendMessage(cj1.obtainMessage(4, paramuf));
  }
  
  public final void c(uf paramuf) {
    kh0 kh0 = paramuf.l;
    WeakHashMap<Object, kh0> weakHashMap = this.e;
    if (kh0 != null) {
      Object object = kh0.a();
      if (object != null) {
        kh0.h = true;
        weakHashMap.put(object, kh0);
      } 
    } 
    ArrayList<kh0> arrayList = paramuf.m;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        kh0 kh01 = arrayList.get(b);
        Object object = kh01.a();
        if (object != null) {
          kh01.h = true;
          weakHashMap.put(object, kh01);
        } 
      } 
    } 
  }
  
  public final void d(uf paramuf, boolean paramBoolean) {
    paramuf.b.getClass();
    this.d.remove(paramuf.g);
    a(paramuf);
  }
  
  public final void e(kh0 paramkh0, boolean paramBoolean) {
    uf uf1;
    Object object1 = paramkh0.g;
    zf1 zf1 = paramkh0.b;
    String str = paramkh0.f;
    v61 v61 = paramkh0.a;
    if (this.g.contains(object1)) {
      this.f.put(paramkh0.a(), paramkh0);
      v61.getClass();
      return;
    } 
    object1 = this.d;
    uf uf2 = (uf)object1.get(str);
    if (uf2 != null) {
      uf2.b.getClass();
      if (uf2.l == null) {
        uf2.l = paramkh0;
        return;
      } 
      if (uf2.m == null)
        uf2.m = new ArrayList(3); 
      uf2.m.add(paramkh0);
      int j = zf1.j;
      if (x41.y(j) > x41.y(uf2.t))
        uf2.t = j; 
      return;
    } 
    ExecutorService executorService = this.b;
    if (executorService.isShutdown()) {
      v61.getClass();
      return;
    } 
    Object object2 = uf.u;
    List<dg1> list = v61.a;
    int i = list.size();
    byte b = 0;
    while (true) {
      bh0 bh01 = this.j;
      object2 = this.k;
      if (b < i) {
        dg1 dg1 = list.get(b);
        if (dg1.b(zf1)) {
          uf uf = new uf(v61, this, bh01, (rp1)object2, paramkh0, dg1);
          break;
        } 
        b++;
        continue;
      } 
      uf1 = new uf(v61, this, bh01, (rp1)object2, paramkh0, uf.x);
      break;
    } 
    uf1.o = executorService.submit(uf1);
    object1.put(str, uf1);
    if (paramBoolean)
      this.e.remove(paramkh0.a()); 
    v61.getClass();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */