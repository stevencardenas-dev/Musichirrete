import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

public final class af1 implements IBinder.DeathRecipient {
  public final Messenger a;
  
  public final w3 b;
  
  public final Messenger c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public final SparseArray h;
  
  public final ff1 i;
  
  public af1(ff1 paramff1, Messenger paramMessenger) {
    this.i = paramff1;
    this.d = 1;
    this.e = 1;
    this.h = new SparseArray();
    this.a = paramMessenger;
    w3 w31 = new w3(this);
    this.b = w31;
    this.c = new Messenger(w31);
  }
  
  public final void a(int paramInt) {
    int i = this.d;
    this.d = i + 1;
    b(5, i, paramInt, null, null);
  }
  
  public final boolean b(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle1, Bundle paramBundle2) {
    Message message = Message.obtain();
    message.what = paramInt1;
    message.arg1 = paramInt2;
    message.arg2 = paramInt3;
    message.obj = paramBundle1;
    message.setData(paramBundle2);
    message.replyTo = this.c;
    try {
      this.a.send(message);
      return true;
    } catch (DeadObjectException deadObjectException) {
    
    } catch (RemoteException remoteException) {
      if (paramInt1 != 2)
        Log.e("MediaRouteProviderProxy", "Could not send message to service.", (Throwable)remoteException); 
    } 
    return false;
  }
  
  public final void binderDied() {
    this.i.l.post(new ze1(this, 1));
  }
  
  public final void c(int paramInt1, int paramInt2) {
    Bundle bundle = new Bundle();
    bundle.putInt("volume", paramInt2);
    paramInt2 = this.d;
    this.d = paramInt2 + 1;
    b(7, paramInt2, paramInt1, null, bundle);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    Bundle bundle = new Bundle();
    bundle.putInt("volume", paramInt2);
    paramInt2 = this.d;
    this.d = paramInt2 + 1;
    b(8, paramInt2, paramInt1, null, bundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\af1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */