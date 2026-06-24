import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class np2 implements ServiceConnection {
  public final HashMap b;
  
  public int c;
  
  public boolean e;
  
  public IBinder f;
  
  public final dp2 g;
  
  public ComponentName h;
  
  public final bq2 i;
  
  public np2(bq2 parambq2, dp2 paramdp2) {
    this.i = parambq2;
    this.g = paramdp2;
    this.b = new HashMap<Object, Object>();
    this.c = 2;
  }
  
  public final sp a(String paramString, Executor paramExecutor) {
    sp sp;
    try {
      bq2 bq21;
      Intent intent = rd2.a(this.i.b, this.g);
      this.c = 3;
      StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
      if (Build.VERSION.SDK_INT >= 31)
        StrictMode.setVmPolicy(kh2.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build()); 
      try {
        bq21 = this.i;
        xp xp = bq21.d;
        Context context = bq21.b;
        dp2 dp21 = this.g;
        boolean bool = xp.b(context, paramString, intent, this, paramExecutor);
        this.e = bool;
        if (bool) {
          Message message = bq21.c.obtainMessage(1, dp21);
          bq21.c.sendMessageDelayed(message, bq21.f);
          sp sp1 = sp.h;
          StrictMode.setVmPolicy(vmPolicy);
          return sp1;
        } 
      } finally {}
      this.c = 2;
      try {
        bq21.d.a(bq21.b, this);
      } catch (IllegalArgumentException illegalArgumentException) {}
      sp = new sp(16, null, null);
      StrictMode.setVmPolicy(vmPolicy);
    } catch (jd2 jd2) {
      sp = jd2.b;
    } 
    return sp;
  }
  
  public final void onBindingDied(ComponentName paramComponentName) {
    onServiceDisconnected(paramComponentName);
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    bq2 bq21 = this.i;
    HashMap hashMap = bq21.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      bq21.c.removeMessages(1, this.g);
      this.f = paramIBinder;
      this.h = paramComponentName;
      Iterator<ServiceConnection> iterator = this.b.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceConnected(paramComponentName, paramIBinder); 
    } finally {}
    this.c = 1;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    bq2 bq21 = this.i;
    HashMap hashMap = bq21.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      bq21.c.removeMessages(1, this.g);
      this.f = null;
      this.h = paramComponentName;
      Iterator<ServiceConnection> iterator = this.b.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceDisconnected(paramComponentName); 
    } finally {}
    this.c = 2;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\np2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */