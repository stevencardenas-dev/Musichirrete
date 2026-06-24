import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ff1 extends zu0 implements ServiceConnection {
  public static final int s = 0;
  
  public final ComponentName k;
  
  public final cl l;
  
  public final ArrayList m = new ArrayList();
  
  public boolean n;
  
  public boolean o;
  
  public af1 p;
  
  public boolean q;
  
  public f r;
  
  static {
    Log.isLoggable("MediaRouteProviderProxy", 3);
  }
  
  public ff1(Context paramContext, ComponentName paramComponentName) {
    super(paramContext, new bh0(9, paramComponentName));
    this.k = paramComponentName;
    this.l = new cl();
  }
  
  public final wu0 a(String paramString, yu0 paramyu0) {
    if (paramString != null) {
      av0 av0 = this.i;
      if (av0 != null) {
        List<su0> list = av0.b;
        int i = list.size();
        for (byte b = 0; b < i; b++) {
          if (((su0)list.get(b)).d().equals(paramString)) {
            df1 df1 = new df1(this, paramString, paramyu0);
            this.m.add(df1);
            if (this.q)
              df1.b(this.p); 
            l();
            return df1;
          } 
        } 
      } 
      return null;
    } 
    l0.l("initialMemberRouteId cannot be null.");
    return null;
  }
  
  public final xu0 c(String paramString, yu0 paramyu0) {
    if (paramString != null)
      return i(paramString, null, paramyu0); 
    l0.l("routeId cannot be null");
    return null;
  }
  
  public final xu0 d(String paramString1, String paramString2) {
    if (paramString1 != null) {
      if (paramString2 != null)
        return i(paramString1, paramString2, yu0.b); 
      l0.l("routeGroupId cannot be null");
      return null;
    } 
    l0.l("routeId cannot be null");
    return null;
  }
  
  public final void e(tu0 paramtu0) {
    if (this.q) {
      af1 af11 = this.p;
      int i = af11.d;
      af11.d = i + 1;
      if (paramtu0 != null) {
        Bundle bundle = paramtu0.a;
      } else {
        paramtu0 = null;
      } 
      af11.b(10, i, 0, (Bundle)paramtu0, null);
    } 
    l();
  }
  
  public final void h() {
    if (!this.o) {
      Intent intent = new Intent("android.media.MediaRouteProviderService");
      intent.setComponent(this.k);
      try {
        boolean bool;
        if (Build.VERSION.SDK_INT >= 29) {
          bool = true;
        } else {
          bool = true;
        } 
        this.o = this.b.bindService(intent, this, bool);
      } catch (SecurityException securityException) {}
    } 
  }
  
  public final ef1 i(String paramString1, String paramString2, yu0 paramyu0) {
    av0 av0 = this.i;
    if (av0 != null) {
      List<su0> list = av0.b;
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        if (((su0)list.get(b)).d().equals(paramString1)) {
          ef1 ef1 = new ef1(this, paramString1, paramString2, paramyu0);
          this.m.add(ef1);
          if (this.q)
            ef1.b(this.p); 
          l();
          return ef1;
        } 
      } 
    } 
    return null;
  }
  
  public final void j() {
    if (this.p != null) {
      f(null);
      this.q = false;
      ArrayList<bf1> arrayList = this.m;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++)
        ((bf1)arrayList.get(b)).c(); 
      af1 af11 = this.p;
      af11.b(2, 0, 0, null, null);
      af11.b.b.clear();
      af11.a.getBinder().unlinkToDeath(af11, 0);
      af11.i.l.post(new ze1(af11, 0));
      this.p = null;
    } 
  }
  
  public final void k() {
    if (this.o) {
      this.o = false;
      j();
      try {
        this.b.unbindService(this);
        return;
      } catch (IllegalArgumentException illegalArgumentException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append(": unbindService failed");
        Log.e("MediaRouteProviderProxy", stringBuilder.toString(), illegalArgumentException);
      } 
    } 
  }
  
  public final void l() {
    if (this.n && (this.g != null || !this.m.isEmpty())) {
      h();
      return;
    } 
    k();
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    if (this.o) {
      j();
      if (paramIBinder != null) {
        Messenger messenger = new Messenger(paramIBinder);
      } else {
        paramComponentName = null;
      } 
      if (paramComponentName != null)
        try {
          paramIBinder = paramComponentName.getBinder();
          if (paramIBinder != null) {
            af1 af11 = new af1(this, (Messenger)paramComponentName);
            int i = af11.d;
            af11.d = i + 1;
            af11.g = i;
            if (af11.b(1, i, 4, null, null))
              try {
                af11.a.getBinder().linkToDeath(af11, 0);
                this.p = af11;
              } catch (RemoteException remoteException) {
                af11.binderDied();
              }  
            return;
          } 
        } catch (NullPointerException nullPointerException) {} 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this);
      stringBuilder.append(": Service returned invalid messenger binder");
      Log.e("MediaRouteProviderProxy", stringBuilder.toString());
    } 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    j();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Service connection ");
    stringBuilder.append(this.k.flattenToShortString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ff1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */