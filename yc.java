import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class yc {
  public static final u70[] y = new u70[0];
  
  public volatile String a = null;
  
  public fh1 b;
  
  public final Context c;
  
  public final Looper d;
  
  public final bq2 e;
  
  public final uf2 f;
  
  public final Object g = new Object();
  
  public final Object h = new Object();
  
  public fc2 i;
  
  public xc j;
  
  public IInterface k;
  
  public final ArrayList l = new ArrayList();
  
  public uj2 m;
  
  public int n = 1;
  
  public final a42 o;
  
  public final a42 p;
  
  public final int q;
  
  public final String r;
  
  public volatile String s;
  
  public volatile gh1 t;
  
  public sp u = null;
  
  public boolean v = false;
  
  public volatile gn2 w = null;
  
  public final AtomicInteger x = new AtomicInteger(0);
  
  public yc(Context paramContext, Looper paramLooper, bq2 parambq2, int paramInt, a42 parama421, a42 parama422, String paramString) {
    n21.n("Context must not be null", paramContext);
    this.c = paramContext;
    n21.n("Looper must not be null", paramLooper);
    this.d = paramLooper;
    n21.n("Supervisor must not be null", parambq2);
    this.e = parambq2;
    this.f = new uf2(this, paramLooper);
    this.q = paramInt;
    this.o = parama421;
    this.p = parama422;
    this.r = paramString;
  }
  
  public abstract IInterface a(IBinder paramIBinder);
  
  public void b() {
    this.x.incrementAndGet();
    ArrayList<ac2> arrayList = this.l;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        synchronized ((ac2)arrayList.get(b)) {
          null.a = null;
          b++;
        } 
      } 
    } finally {
      Exception exception;
    } 
    arrayList.clear();
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList<ObjectType{ac2}>}, name=null} */
    synchronized (this.h) {
      this.i = null;
      t(1, null);
      return;
    } 
  }
  
  public final void c(String paramString) {
    this.a = paramString;
    b();
  }
  
  public u70[] d() {
    return y;
  }
  
  public Bundle e() {
    return null;
  }
  
  public Bundle f() {
    return new Bundle();
  }
  
  public abstract int g();
  
  public final void h(gg0 paramgg0, Set paramSet) {
    String str;
    Bundle bundle1 = f();
    if (Build.VERSION.SDK_INT < 31) {
      str = this.s;
    } else if (this.t == null) {
      str = this.s;
    } else {
      AttributionSource attributionSource = (AttributionSource)this.t.c;
      if (attributionSource == null) {
        str = this.s;
      } else if (str.getAttributionTag() == null) {
        str = this.s;
      } else {
        str = str.getAttributionTag();
      } 
    } 
    int j = this.q;
    int i = le0.a;
    Scope[] arrayOfScope = ud0.q;
    Bundle bundle2 = new Bundle();
    u70[] arrayOfU70 = ud0.r;
    ud0 ud0 = new ud0(6, j, i, null, null, arrayOfScope, bundle2, null, arrayOfU70, arrayOfU70, true, 0, false, str);
    ud0.f = this.c.getPackageName();
    ud0.i = bundle1;
    if (paramSet != null)
      ud0.h = (Scope[])paramSet.toArray((Object[])new Scope[0]); 
    if (q()) {
      ud0.j = new Account("<<default account>>", "com.google");
      if (paramgg0 != null)
        ud0.g = paramgg0.asBinder(); 
    } 
    ud0.k = y;
    ud0.l = d();
    if (r())
      ud0.o = true; 
    try {
      object = this.h;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        fc2 fc21 = this.i;
        if (fc21 != null) {
          cj2 cj2 = new cj2();
          this(this, this.x.get());
          fc21.m(cj2, ud0);
        } else {
          Log.w("GmsClient", "mServiceBroker is null, client disconnected");
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } catch (DeadObjectException null) {
    
    } catch (SecurityException null) {
      throw object;
    } catch (RemoteException null) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)object);
      p(8, null, null, this.x.get());
      return;
    } catch (RuntimeException object) {
      Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)object);
      p(8, null, null, this.x.get());
      return;
    } 
    Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)object);
    i = this.x.get();
    object = this.f;
    object.sendMessage(object.obtainMessage(6, i, 3));
  }
  
  public final IInterface i() {
    Object object = this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (this.n != 5) {
        if (m()) {
          IInterface iInterface = this.k;
          n21.n("Client is connected but service is null", iInterface);
          iInterface = iInterface;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return iInterface;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("Not connected. Call connect() and wait for onConnected() to be called.");
        throw illegalStateException;
      } 
    } finally {
      Exception exception;
    } 
    DeadObjectException deadObjectException = new DeadObjectException();
    this();
    throw deadObjectException;
  }
  
  public abstract String j();
  
  public abstract String k();
  
  public boolean l() {
    return (g() >= 211700000);
  }
  
  public final boolean m() {
    synchronized (this.g) {
      boolean bool;
      if (this.n == 4) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final boolean n() {
    synchronized (this.g) {
      int i = this.n;
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (i != 2)
        if (i == 3) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }  
      return bool1;
    } 
  }
  
  public void o(sp paramsp) {
    paramsp.getClass();
    System.currentTimeMillis();
  }
  
  public void p(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2) {
    jk2 jk2 = new jk2(this, paramInt1, paramIBinder, paramBundle);
    uf2 uf21 = this.f;
    uf21.sendMessage(uf21.obtainMessage(1, paramInt2, -1, jk2));
  }
  
  public boolean q() {
    return false;
  }
  
  public boolean r() {
    return this instanceof lp2;
  }
  
  public final void t(int paramInt, IInterface paramIInterface) {
    int i;
    byte b;
    String str = jLnXOLx.DwQkwRwyzaC;
    boolean bool = false;
    if (paramInt != 4) {
      i = 0;
    } else {
      i = 1;
    } 
    if (paramIInterface == null) {
      b = 0;
    } else {
      b = 1;
    } 
    if (i == b) {
      Object object = this.g;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        this.n = paramInt;
        this.k = paramIInterface;
        StringBuilder stringBuilder = null;
        if (paramInt != 1) {
          if (paramInt != 2 && paramInt != 3) {
            if (paramInt == 4) {
              n21.m(paramIInterface);
              paramIInterface = paramIInterface;
              System.currentTimeMillis();
            } 
          } else {
            uj2 uj21 = this.m;
            if (uj21 != null) {
              fh1 fh12 = this.b;
              if (fh12 != null) {
                String str2 = fh12.a;
                paramInt = String.valueOf(str2).length();
                i = "com.google.android.gms".length();
                StringBuilder stringBuilder1 = new StringBuilder();
                this(paramInt + 70 + i);
                stringBuilder1.append("Calling connect() while still connected, missing disconnect() for ");
                stringBuilder1.append(str2);
                stringBuilder1.append(str);
                Log.e("GmsClient", stringBuilder1.toString());
                bq2 bq21 = this.e;
                str = this.b.a;
                n21.m(str);
                this.b.getClass();
                if (this.r == null)
                  this.c.getClass(); 
                bq21.b(str, uj21, this.b.b);
                this.x.incrementAndGet();
              } 
            } 
            uj2 uj22 = new uj2();
            this(this, this.x.get());
            this.m = uj22;
            fh1 fh11 = new fh1();
            String str1 = k();
            boolean bool1 = l();
            this(str1, bool1);
            this.b = fh11;
            if (!bool1 || g() >= 17895000) {
              bq2 bq21 = this.e;
              String str3 = this.b.a;
              n21.m(str3);
              this.b.getClass();
              String str2 = this.r;
              str1 = str2;
              if (str2 == null)
                str1 = this.c.getClass().getName(); 
              bool1 = this.b.b;
              dp2 dp2 = new dp2();
              this(str3, bool1);
              sp sp1 = bq21.a(dp2, uj22, str1);
              paramInt = bool;
              if (sp1.c == 0)
                paramInt = 1; 
              if (paramInt == 0) {
                Bundle bundle;
                String str4 = this.b.a;
                paramInt = String.valueOf(str4).length();
                i = "com.google.android.gms".length();
                StringBuilder stringBuilder1 = new StringBuilder();
                this(paramInt + 34 + i);
                stringBuilder1.append("unable to connect to service: ");
                stringBuilder1.append(str4);
                stringBuilder1.append(" on com.google.android.gms");
                Log.w("GmsClient", stringBuilder1.toString());
                i = sp1.c;
                paramInt = i;
                if (i == -1)
                  paramInt = 16; 
                stringBuilder1 = stringBuilder;
                if (sp1.e != null) {
                  bundle = new Bundle();
                  this();
                  bundle.putParcelable("pendingIntent", (Parcelable)sp1.e);
                } 
                i = this.x.get();
                fl2 fl2 = new fl2();
                this(this, paramInt, bundle);
                uf2 uf21 = this.f;
                uf21.sendMessage(uf21.obtainMessage(7, i, -1, fl2));
              } 
            } else {
              IllegalStateException illegalStateException = new IllegalStateException();
              this("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
              throw illegalStateException;
            } 
          } 
        } else {
          uj2 uj21 = this.m;
          if (uj21 != null) {
            bq2 bq21 = this.e;
            str = this.b.a;
            n21.m(str);
            this.b.getClass();
            if (this.r == null)
              this.c.getClass(); 
            bq21.b(str, uj21, this.b.b);
            this.m = null;
          } 
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } 
    l0.k();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */