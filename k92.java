import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class k92 {
  public static final HashMap o = new HashMap<Object, Object>();
  
  public final Context a;
  
  public final ha2 b;
  
  public final String c;
  
  public final ArrayList d = new ArrayList();
  
  public final HashSet e = new HashSet();
  
  public final Object f = new Object();
  
  public boolean g;
  
  public final Intent h;
  
  public final fb0 i;
  
  public final WeakReference j;
  
  public final ja2 k = new ja2(0, this);
  
  public final AtomicInteger l = new AtomicInteger(0);
  
  public bl m;
  
  public ga2 n;
  
  public k92(Context paramContext, ha2 paramha2, Intent paramIntent, fb0 paramfb0) {
    this.a = paramContext;
    this.b = paramha2;
    this.c = fXMDNeMWaILNVh.Smhq;
    this.h = paramIntent;
    this.i = paramfb0;
    this.j = new WeakReference(null);
  }
  
  public static void b(k92 paramk92, q92 paramq92) {
    bl bl1;
    ga2 ga21 = paramk92.n;
    ArrayList<q92> arrayList = paramk92.d;
    ha2 ha21 = paramk92.b;
    byte b = 0;
    if (ga21 == null && !paramk92.g) {
      ha21.a("Initiate binding to the service.", new Object[0]);
      arrayList.add(paramq92);
      bl1 = new bl(paramk92);
      paramk92.m = bl1;
      paramk92.g = true;
      if (!paramk92.a.bindService(paramk92.h, bl1, 1)) {
        ha21.a("Failed to bind to the service.", new Object[0]);
        paramk92.g = false;
        int i = arrayList.size();
        while (b < i) {
          paramk92 = (k92)arrayList.get(b);
          b++;
          ((ia2)paramk92).a(new RuntimeException("Failed to bind to the service."));
        } 
        arrayList.clear();
      } 
      return;
    } 
    if (paramk92.g) {
      ha21.a("Waiting to bind to the service.", new Object[0]);
      arrayList.add(bl1);
      return;
    } 
    bl1.run();
  }
  
  public final Handler a() {
    String str;
    HashMap<String, Handler> hashMap = o;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      str = this.c;
      if (!hashMap.containsKey(str)) {
        HandlerThread handlerThread = new HandlerThread();
        this(str, 10);
        handlerThread.start();
        Handler handler1 = new Handler();
        this(handlerThread.getLooper());
        hashMap.put(str, handler1);
      } 
    } finally {
      Exception exception;
    } 
    Handler handler = hashMap.get(str);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{android/os/Handler}]>}, name=null} */
    return handler;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */