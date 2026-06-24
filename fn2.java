import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class fn2 extends y92 implements IInterface {
  public final int f;
  
  public fn2(byte[] paramArrayOfbyte) {
    super("com.google.android.gms.common.internal.ICertData", 4);
    if (paramArrayOfbyte.length == 25) {
      this.f = Arrays.hashCode(paramArrayOfbyte);
      return;
    } 
    l0.k();
    throw null;
  }
  
  public static byte[] q0(String paramString) {
    try {
      return paramString.getBytes("ISO-8859-1");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof fn2)
      try {
        paramObject = paramObject;
        if (((fn2)paramObject).f == this.f) {
          byte[] arrayOfByte = paramObject.p0();
          paramObject = new j31();
          super(arrayOfByte);
          paramObject = j31.q0((sg0)paramObject);
          return Arrays.equals(p0(), (byte[])paramObject);
        } 
        return false;
      } catch (RemoteException remoteException) {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)remoteException);
        return false;
      }  
    return false;
  }
  
  public final int hashCode() {
    return this.f;
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    if (paramInt != 1) {
      if (paramInt != 2)
        return false; 
      paramParcel2.writeNoException();
      paramParcel2.writeInt(this.f);
      return true;
    } 
    j31 j31 = new j31(p0());
    paramParcel2.writeNoException();
    nh2.b(paramParcel2, j31);
    return true;
  }
  
  public abstract byte[] p0();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */