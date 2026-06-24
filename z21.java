import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;

public final class z21 {
  public static final Object c = new Object();
  
  public static String d;
  
  public static HashSet e = new HashSet();
  
  public static final Object f = new Object();
  
  public static y21 g;
  
  public final Context a;
  
  public final NotificationManager b;
  
  public z21(Context paramContext) {
    this.a = paramContext;
    this.b = (NotificationManager)paramContext.getSystemService("notification");
  }
  
  public final boolean a() {
    int i = Build.VERSION.SDK_INT;
    return (i >= 29) ? ((i < 34) ? (!(this.a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") != 0)) : p0.a(this.b)) : true;
  }
  
  public final void b(int paramInt) {
    this.b.cancel(null, paramInt);
  }
  
  public final void c(int paramInt, Notification paramNotification) {
    Object object;
    Bundle bundle = paramNotification.extras;
    if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
      v21 v21 = new v21(this.a.getPackageName(), paramInt, paramNotification);
      object = f;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (g == null) {
          y21 y211 = new y21();
          this(this.a.getApplicationContext());
          g = y211;
        } 
      } finally {}
      g.c.obtainMessage(0, v21).sendToTarget();
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      this.b.cancel(null, paramInt);
      return;
    } 
    this.b.notify(null, paramInt, (Notification)object);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */