import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class uj2 implements ServiceConnection {
  public final int b;
  
  public final yc c;
  
  public uj2(yc paramyc, int paramInt) {
    this.c = paramyc;
    this.b = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    yc yc2 = this.c;
    if (paramIBinder == null)
      synchronized (yc2.g) {
        int j = yc2.n;
        if (j == 3) {
          yc2.v = true;
          j = 5;
        } else {
          j = 4;
        } 
        null = yc2.f;
        null.sendMessage(null.obtainMessage(j, yc2.x.get(), 16));
        return;
      }  
    Object object = yc2.h;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (iInterface != null && iInterface instanceof fc2) {
        iInterface = iInterface;
      } else {
        iInterface = new fc2(paramIBinder);
      } 
    } finally {}
    yc2.i = (fc2)paramComponentName;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    yc yc1 = this.c;
    int i = this.b;
    yc1.getClass();
    fl2 fl2 = new fl2(yc1, 0, null);
    uf2 uf2 = yc1.f;
    uf2.sendMessage(uf2.obtainMessage(7, i, -1, fl2));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    null = this.c;
    synchronized (null.h) {
      null.i = null;
      null = this.c;
      int i = this.b;
      null = ((yc)null).f;
      null.sendMessage(null.obtainMessage(6, i, 1));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */