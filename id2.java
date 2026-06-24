import android.os.Bundle;
import android.os.Parcel;

public abstract class id2 extends y92 {
  public final int f;
  
  public id2(int paramInt) {
    super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 3);
  }
  
  public abstract void A0(wb2 paramwb2);
  
  public abstract void B0(String paramString1, String paramString2);
  
  public abstract void C0(String paramString, byte[] paramArrayOfbyte);
  
  public abstract void D0(int paramInt, long paramLong);
  
  public abstract void E0(long paramLong);
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    cd2 cd2;
    wb2 wb2;
    byte[] arrayOfByte;
    String str1;
    long l;
    String str2;
    q8 q8;
    String str3;
    int i = this.f;
    boolean bool3 = false;
    boolean bool2 = false;
    null = false;
    switch (i) {
      default:
        switch (paramInt) {
          default:
            return bool3;
          case 15:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            s0(paramInt);
            return true;
          case 14:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            r0(paramInt);
            return true;
          case 13:
            cd2 = (cd2)mh2.a(paramParcel1, cd2.CREATOR);
            mh2.d(paramParcel1);
            z0(cd2);
            return true;
          case 12:
            wb2 = (wb2)mh2.a(paramParcel1, wb2.CREATOR);
            mh2.d(paramParcel1);
            A0(wb2);
            return true;
          case 11:
            paramParcel1.readString();
            l = paramParcel1.readLong();
            mh2.d(paramParcel1);
            E0(l);
            return true;
          case 10:
            paramParcel1.readString();
            l = paramParcel1.readLong();
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            D0(paramInt, l);
            return true;
          case 9:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            x0(paramInt);
            return true;
          case 8:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            v0(paramInt);
            return true;
          case 7:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            w0(paramInt);
            return true;
          case 6:
            str2 = paramParcel1.readString();
            arrayOfByte = paramParcel1.createByteArray();
            mh2.d(paramParcel1);
            C0(str2, arrayOfByte);
            return true;
          case 5:
            str2 = paramParcel1.readString();
            str1 = paramParcel1.readString();
            mh2.d(paramParcel1);
            B0(str2, str1);
            return true;
          case 4:
            paramParcel1.readString();
            paramParcel1.readDouble();
            paramInt = mh2.a;
            paramParcel1.readInt();
            mh2.d(paramParcel1);
            y0();
            return true;
          case 3:
            paramInt = paramParcel1.readInt();
            mh2.d(paramParcel1);
            u0(paramInt);
            return true;
          case 2:
            q8 = (q8)mh2.a(paramParcel1, q8.CREATOR);
            str3 = paramParcel1.readString();
            str1 = paramParcel1.readString();
            if (paramParcel1.readInt() != 0)
              null = true; 
            mh2.d(paramParcel1);
            t0(q8, str3, str1, null);
            return true;
          case 1:
            break;
        } 
        paramInt = paramParcel1.readInt();
        mh2.d(paramParcel1);
        p0(paramInt);
        return true;
      case 0:
        break;
    } 
    boolean bool1 = bool2;
    if (paramInt == 1) {
      Bundle bundle = (Bundle)mh2.a(paramParcel1, Bundle.CREATOR);
      n5 n5 = (n5)mh2.a(paramParcel1, n5.CREATOR);
      mh2.d(paramParcel1);
      q0(bundle);
      bool1 = true;
    } 
    return bool1;
  }
  
  public abstract void p0(int paramInt);
  
  public abstract void q0(Bundle paramBundle);
  
  public abstract void r0(int paramInt);
  
  public abstract void s0(int paramInt);
  
  public abstract void t0(q8 paramq8, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void u0(int paramInt);
  
  public abstract void v0(int paramInt);
  
  public abstract void w0(int paramInt);
  
  public abstract void x0(int paramInt);
  
  public abstract void y0();
  
  public abstract void z0(cd2 paramcd2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\id2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */