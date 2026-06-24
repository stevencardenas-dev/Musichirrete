import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class ma1 {
  public static final String l = qp0.j("Processor");
  
  public PowerManager.WakeLock a;
  
  public final Context b;
  
  public final ip c;
  
  public final n2 d;
  
  public final WorkDatabase e;
  
  public final HashMap f;
  
  public final HashMap g;
  
  public final HashMap h;
  
  public final HashSet i;
  
  public final ArrayList j;
  
  public final Object k;
  
  public ma1(Context paramContext, ip paramip, n2 paramn2, WorkDatabase paramWorkDatabase) {
    this.b = paramContext;
    this.c = paramip;
    this.d = paramn2;
    this.e = paramWorkDatabase;
    this.g = new HashMap<Object, Object>();
    this.f = new HashMap<Object, Object>();
    this.i = new HashSet();
    this.j = new ArrayList();
    this.a = null;
    this.k = new Object();
    this.h = new HashMap<Object, Object>();
  }
  
  public static boolean d(String paramString, q82 paramq82, int paramInt) {
    String str = l;
    if (paramq82 != null) {
      paramq82.m.u(new g82(paramInt));
      qp0 qp01 = qp0.h();
      StringBuilder stringBuilder1 = new StringBuilder("WorkerWrapper interrupted for ");
      stringBuilder1.append(paramString);
      qp01.b(str, stringBuilder1.toString());
      return true;
    } 
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder("WorkerWrapper could not be found for ");
    stringBuilder.append(paramString);
    qp0.b(str, stringBuilder.toString());
    return false;
  }
  
  public final void a(z50 paramz50) {
    synchronized (this.k) {
      this.j.add(paramz50);
      return;
    } 
  }
  
  public final q82 b(String paramString) {
    boolean bool;
    q82 q82 = (q82)this.f.remove(paramString);
    if (q82 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      q82 = (q82)this.g.remove(paramString); 
    this.h.remove(paramString);
    if (bool) {
      Object object = this.k;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (this.f.isEmpty()) {
          PowerManager.WakeLock wakeLock;
          Context context = this.b;
          String str = is1.l;
          Intent intent = new Intent();
          this(context, SystemForegroundService.class);
          intent.setAction("ACTION_STOP_FOREGROUND");
          try {
            this.b.startService(intent);
          } finally {
            context = null;
          } 
          if (wakeLock != null) {
            wakeLock.release();
            this.a = null;
          } 
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    } 
    return q82;
  }
  
  public final q82 c(String paramString) {
    q82 q82 = (q82)this.f.get(paramString);
    return (q82 == null) ? (q82)this.g.get(paramString) : q82;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ma1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */