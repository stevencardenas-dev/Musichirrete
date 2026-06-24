import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

public final class ud0 extends f0 {
  public static final Parcelable.Creator<ud0> CREATOR = new pk2(10);
  
  public static final Scope[] q = new Scope[0];
  
  public static final u70[] r = new u70[0];
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public String f;
  
  public IBinder g;
  
  public Scope[] h;
  
  public Bundle i;
  
  public Account j;
  
  public u70[] k;
  
  public u70[] l;
  
  public final boolean m;
  
  public final int n;
  
  public boolean o;
  
  public final String p;
  
  public ud0(int paramInt1, int paramInt2, int paramInt3, String paramString1, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, u70[] paramArrayOfu701, u70[] paramArrayOfu702, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, String paramString2) {
    Account account;
    Parcel parcel;
    if (paramArrayOfScope == null)
      paramArrayOfScope = q; 
    if (paramBundle == null)
      paramBundle = new Bundle(); 
    u70[] arrayOfU70 = r;
    if (paramArrayOfu701 == null)
      paramArrayOfu701 = arrayOfU70; 
    if (paramArrayOfu702 == null)
      paramArrayOfu702 = arrayOfU70; 
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    if ("com.google.android.gms".equals(paramString1)) {
      this.f = "com.google.android.gms";
    } else {
      this.f = paramString1;
    } 
    if (paramInt1 < 2) {
      paramAccount = null;
      account = paramAccount;
      if (paramIBinder != null) {
        paramInt1 = e1.f;
        null = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (null instanceof gg0) {
          null = null;
        } else {
          null = new na2(paramIBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        } 
        long l = Binder.clearCallingIdentity();
        try {
          null = null;
          parcel = null.m(null.o(), 2);
          Account account1 = (Account)nh2.a(parcel, Account.CREATOR);
          parcel.recycle();
        } catch (RemoteException remoteException) {
          Log.w("AccountAccessor", "Remote account accessor probably died");
          Binder.restoreCallingIdentity(l);
        } finally {
          Binder.restoreCallingIdentity(l);
        } 
      } 
    } else {
      this.g = (IBinder)parcel;
      account = paramAccount;
    } 
    this.j = account;
    this.h = paramArrayOfScope;
    this.i = paramBundle;
    this.k = paramArrayOfu701;
    this.l = paramArrayOfu702;
    this.m = paramBoolean1;
    this.n = paramInt4;
    this.o = paramBoolean2;
    this.p = paramString2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    pk2.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ud0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */