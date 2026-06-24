import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class md2 {
  public static final HashMap n = new HashMap<Object, Object>();
  
  public final Context a;
  
  public final f1 b;
  
  public final String c;
  
  public final ArrayList d = new ArrayList();
  
  public final HashSet e = new HashSet();
  
  public final Object f = new Object();
  
  public boolean g;
  
  public final Intent h;
  
  public final WeakReference i;
  
  public final ja2 j = new ja2(1, this);
  
  public final AtomicInteger k = new AtomicInteger(0);
  
  public bl l;
  
  public ug2 m;
  
  public md2(Context paramContext, f1 paramf1, Intent paramIntent) {
    this.a = paramContext;
    this.b = paramf1;
    this.c = "SplitInstallService";
    this.h = paramIntent;
    this.i = new WeakReference(null);
  }
  
  public static void b(md2 parammd2, ot2 paramot2) {
    RuntimeException runtimeException;
    nt1 nt1;
    ug2 ug21 = parammd2.m;
    f1 f11 = parammd2.b;
    ArrayList<ot2> arrayList = parammd2.d;
    int i = 0;
    if (ug21 == null && !parammd2.g) {
      f11.e("Initiate binding to the service.", new Object[0]);
      arrayList.add(paramot2);
      bl bl1 = new bl(2, parammd2);
      parammd2.l = bl1;
      parammd2.g = true;
      if (!parammd2.a.bindService(parammd2.h, bl1, 1)) {
        f11.e("Failed to bind to the service.", new Object[0]);
        parammd2.g = false;
        int j = arrayList.size();
        while (i < j) {
          parammd2 = (md2)arrayList.get(i);
          int k = i + 1;
          ot2 ot21 = (ot2)parammd2;
          runtimeException = new RuntimeException("Failed to bind to the service.");
          nt1 = ot21.b;
          i = k;
          if (nt1 != null) {
            nt1.c(runtimeException);
            i = k;
          } 
        } 
        arrayList.clear();
      } 
      return;
    } 
    if (((md2)runtimeException).g) {
      f11.e("Waiting to bind to the service.", new Object[0]);
      arrayList.add(nt1);
      return;
    } 
    nt1.run();
  }
  
  public final Handler a() {
    HashMap<String, Handler> hashMap = n;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      if (!hashMap.containsKey(this.c)) {
        HandlerThread handlerThread = new HandlerThread();
        this(this.c, 10);
        handlerThread.start();
        String str = this.c;
        Handler handler1 = new Handler();
        this(handlerThread.getLooper());
        hashMap.put(str, handler1);
      } 
    } finally {
      Exception exception;
    } 
    Handler handler = hashMap.get(this.c);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{android/os/Handler}]>}, name=null} */
    return handler;
  }
  
  public final void c(ot2 paramot2, nt1 paramnt1) {
    paramot2 = new je2(this, paramot2.b, paramnt1, paramot2);
    a().post(paramot2);
  }
  
  public final void d(nt1 paramnt1) {
    synchronized (this.f) {
      this.e.remove(paramnt1);
      bd2 bd2 = new bd2(1, this);
      a().post(bd2);
      return;
    } 
  }
  
  public final void e() {
    HashSet hashSet = this.e;
    Iterator<nt1> iterator = hashSet.iterator();
    while (iterator.hasNext())
      ((nt1)iterator.next()).c((Exception)new RemoteException(String.valueOf(this.c).concat(" : Binder has died."))); 
    hashSet.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\md2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */