import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class rb2 extends f0 {
  public static final Parcelable.Creator<rb2> CREATOR = new lx0(27);
  
  public final int b;
  
  public final Account c;
  
  public final int e;
  
  public final GoogleSignInAccount f;
  
  public rb2(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount) {
    this.b = paramInt1;
    this.c = paramAccount;
    this.e = paramInt2;
    this.f = paramGoogleSignInAccount;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.u0(paramParcel, 2, (Parcelable)this.c, paramInt);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.u0(paramParcel, 4, (Parcelable)this.f, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */