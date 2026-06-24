import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class is1 implements z50, d41 {
  public static final String l = qp0.j("SystemFgDispatcher");
  
  public final q72 b;
  
  public final n2 c;
  
  public final Object e = new Object();
  
  public n72 f;
  
  public final LinkedHashMap g;
  
  public final HashMap h;
  
  public final HashMap i;
  
  public final bv0 j;
  
  public SystemForegroundService k;
  
  public is1(Context paramContext) {
    q72 q721 = q72.a(paramContext);
    this.b = q721;
    this.c = q721.d;
    this.f = null;
    this.g = new LinkedHashMap<Object, Object>();
    this.i = new HashMap<Object, Object>();
    this.h = new HashMap<Object, Object>();
    this.j = new bv0(q721.j);
    q721.f.a(this);
  }
  
  public static Intent a(Context paramContext, n72 paramn72, ja0 paramja0) {
    Intent intent = new Intent(paramContext, SystemForegroundService.class);
    intent.setAction("ACTION_START_FOREGROUND");
    intent.putExtra("KEY_WORKSPEC_ID", paramn72.a);
    intent.putExtra("KEY_GENERATION", paramn72.b);
    intent.putExtra("KEY_NOTIFICATION_ID", paramja0.a);
    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", paramja0.b);
    intent.putExtra("KEY_NOTIFICATION", (Parcelable)paramja0.c);
    return intent;
  }
  
  public final void b(y72 paramy72, lr paramlr) {
    if (paramlr instanceof kr) {
      String str2 = paramy72.a;
      qp0 qp0 = qp0.h();
      StringBuilder stringBuilder = new StringBuilder("Constraints unmet for WorkSpec ");
      stringBuilder.append(str2);
      String str1 = stringBuilder.toString();
      qp0.b(l, str1);
      n72 n721 = qv.p(paramy72);
      int i = ((kr)paramlr).a;
      q72 q721 = this.b;
      n2 n21 = q721.d;
      tp1 tp1 = new tp1(q721.f, new fp1(n721), true, i);
      ((tk1)n21.c).execute(tp1);
    } 
  }
  
  public final void c(Intent paramIntent) {
    if (this.k != null) {
      int i = 0;
      int k = paramIntent.getIntExtra("KEY_NOTIFICATION_ID", 0);
      int j = paramIntent.getIntExtra(zLtYiJUm.VOcjo, 0);
      String str = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
      n72 n721 = new n72(str, paramIntent.getIntExtra("KEY_GENERATION", 0));
      Notification notification = (Notification)paramIntent.getParcelableExtra("KEY_NOTIFICATION");
      qp0 qp0 = qp0.h();
      StringBuilder stringBuilder = new StringBuilder("Notifying with (id:");
      stringBuilder.append(k);
      stringBuilder.append(", workSpecId: ");
      stringBuilder.append(str);
      stringBuilder.append(", notificationType :");
      stringBuilder.append(j);
      stringBuilder.append(")");
      str = stringBuilder.toString();
      qp0.b(l, str);
      if (notification != null) {
        ja0 ja02 = new ja0(k, notification, j);
        LinkedHashMap<n72, ja0> linkedHashMap = this.g;
        linkedHashMap.put(n721, ja02);
        ja0 ja01 = linkedHashMap.get(this.f);
        if (ja01 == null) {
          this.f = n721;
          ja01 = ja02;
        } else {
          this.k.f.notify(k, notification);
          if (Build.VERSION.SDK_INT >= 29) {
            Iterator iterator = linkedHashMap.entrySet().iterator();
            while (iterator.hasNext())
              i |= ((ja0)((Map.Entry)iterator.next()).getValue()).b; 
            ja01 = new ja0(ja01.a, ja01.c, i);
          } 
        } 
        SystemForegroundService systemForegroundService = this.k;
        k = ja01.a;
        i = ja01.b;
        Notification notification1 = ja01.c;
        systemForegroundService.getClass();
        j = Build.VERSION.SDK_INT;
        if (j >= 31) {
          p8.m(systemForegroundService, k, notification1, i);
          return;
        } 
        if (j >= 29) {
          p8.k(systemForegroundService, k, notification1, i);
          return;
        } 
        systemForegroundService.startForeground(k, notification1);
        return;
      } 
      l0.l("Notification passed in the intent was null.");
      return;
    } 
    tp.f("handleNotify was called on the destroyed dispatcher");
  }
  
  public final void d(n72 paramn72, boolean paramBoolean) {
    vj0 vj0;
    Object object = this.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if ((y72)this.h.remove(paramn72) != null) {
        vj0 = (vj0)this.i.remove(paramn72);
      } else {
        vj0 = null;
      } 
    } finally {}
    if (vj0 != null)
      vj0.c(null); 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    object = this.g.remove(paramn72);
    if (paramn72.equals(this.f))
      if (this.g.size() > 0) {
        Iterator<Map.Entry> iterator = this.g.entrySet().iterator();
        Map.Entry entry;
        for (entry = iterator.next(); iterator.hasNext(); entry = iterator.next());
        this.f = (n72)entry.getKey();
        if (this.k != null) {
          ja0 ja0 = (ja0)entry.getValue();
          SystemForegroundService systemForegroundService2 = this.k;
          int j = ja0.a;
          int i = ja0.b;
          Notification notification = ja0.c;
          systemForegroundService2.getClass();
          int k = Build.VERSION.SDK_INT;
          if (k >= 31) {
            p8.m(systemForegroundService2, j, notification, i);
          } else if (k >= 29) {
            p8.k(systemForegroundService2, j, notification, i);
          } else {
            systemForegroundService2.startForeground(j, notification);
          } 
          SystemForegroundService systemForegroundService1 = this.k;
          i = ja0.a;
          systemForegroundService1.f.cancel(i);
        } 
      } else {
        this.f = null;
      }  
    SystemForegroundService systemForegroundService = this.k;
    if (object != null && systemForegroundService != null) {
      qp0 qp0 = qp0.h();
      String str = l;
      StringBuilder stringBuilder = new StringBuilder("Removing Notification (id: ");
      stringBuilder.append(((ja0)object).a);
      stringBuilder.append(", workSpecId: ");
      stringBuilder.append(paramn72);
      stringBuilder.append(", notificationType: ");
      stringBuilder.append(((ja0)object).b);
      qp0.b(str, stringBuilder.toString());
      int i = ((ja0)object).a;
      systemForegroundService.f.cancel(i);
    } 
  }
  
  public final void e() {
    this.k = null;
    null = this.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      Iterator<vj0> iterator = this.i.values().iterator();
      while (iterator.hasNext())
        ((vj0)iterator.next()).c(null); 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    null = this.b.f;
    synchronized (null.k) {
      null.j.remove(this);
      return;
    } 
  }
  
  public final void f(int paramInt1, int paramInt2) {
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder("Foreground service timed out, FGS type: ");
    stringBuilder.append(paramInt2);
    String str = stringBuilder.toString();
    qp0.i(l, str);
    for (Map.Entry entry : this.g.entrySet()) {
      if (((ja0)entry.getValue()).b == paramInt2) {
        n72 n721 = (n72)entry.getKey();
        q72 q721 = this.b;
        n2 n21 = q721.d;
        tp1 tp1 = new tp1(q721.f, new fp1(n721), true, -128);
        ((tk1)n21.c).execute(tp1);
      } 
    } 
    SystemForegroundService systemForegroundService = this.k;
    if (systemForegroundService != null) {
      systemForegroundService.c = true;
      qp0.h().b(SystemForegroundService.g, "Shutting down.");
      if (Build.VERSION.SDK_INT >= 26)
        systemForegroundService.stopForeground(true); 
      systemForegroundService.stopSelf(paramInt1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\is1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */