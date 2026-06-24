import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;

public final class vk2 extends y92 implements IInterface {
  public final nt1 f;
  
  public vk2(pb2 parampb2, nt1 paramnt1) {
    super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", 3);
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    PendingIntent pendingIntent;
    Status status2;
    sk2 sk21;
    Status status7;
    sk2 sk23;
    Status status6;
    zk2 zk2;
    Status status5;
    tk2 tk2;
    Status status4;
    sk2 sk22;
    Status status3;
    String str = oXrNDUqUkE.pQQHJdcdLhTE;
    switch (paramInt) {
      default:
        return false;
      case 15:
        status7 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        sk23 = (sk2)mh2.a(paramParcel1, sk2.CREATOR);
        mh2.d(paramParcel1);
        tp.f(str);
        return false;
      case 14:
        status6 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        zk2 = (zk2)mh2.a(paramParcel1, zk2.CREATOR);
        mh2.d(paramParcel1);
        tp.f(str);
        return false;
      case 13:
        status5 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        tp.f(str);
        return false;
      case 12:
        status5 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        tk2 = (tk2)mh2.a(paramParcel1, tk2.CREATOR);
        mh2.d(paramParcel1);
        tp.f(str);
        return false;
      case 11:
        status4 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        tp.f(str);
        return false;
      case 10:
        pendingIntent = (PendingIntent)mh2.a(paramParcel1, PendingIntent.CREATOR);
        mh2.d(paramParcel1);
        tp.f("Not implemented");
        return false;
      case 9:
        status2 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        sk21 = (sk2)mh2.a(paramParcel1, sk2.CREATOR);
        mh2.d(paramParcel1);
        tp.f("Not implemented");
        return false;
      case 8:
        status4 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        paramParcel1.readInt();
        sk22 = (sk2)mh2.a(paramParcel1, sk2.CREATOR);
        mh2.d(paramParcel1);
        tp.f((String)sk21);
        return false;
      case 7:
        status3 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        tp.f((String)sk21);
        return false;
      case 6:
        status3 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        paramParcel1.createStringArrayList();
        mh2.d(paramParcel1);
        tp.f((String)sk21);
        return false;
      case 5:
        status3 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        throw new IllegalStateException(sk21);
      case 4:
        status3 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        tp.f((String)sk21);
        return false;
      case 3:
        status3 = (Status)mh2.a(paramParcel1, Status.CREATOR);
        mh2.d(paramParcel1);
        tp.f((String)sk21);
        return false;
      case 2:
        break;
    } 
    Status status1 = (Status)mh2.a(paramParcel1, Status.CREATOR);
    ml2 ml2 = (ml2)mh2.a(paramParcel1, ml2.CREATOR);
    mh2.d(paramParcel1);
    pl2 pl2 = new pl2(ml2);
    Object object = new Object();
    ((yk2)object).a = pl2;
    paramInt = status1.b;
    nt1 nt11 = this.f;
    if (paramInt <= 0) {
      nt11.b(object);
    } else {
      if (status1.e != null) {
        object = new l5(status1);
      } else {
        object = new l5(status1);
      } 
      nt11.a((Exception)object);
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */