import java.io.IOException;

public abstract class yj2 {
  public transient int zza;
  
  public abstract void a(ik2 paramik2);
  
  public final byte[] b() {
    try {
      int i = d();
      byte[] arrayOfByte = new byte[i];
      ik2 ik2 = new ik2();
      this(i, arrayOfByte);
      a(ik2);
      if (i - ik2.d == 0)
        return arrayOfByte; 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("Did not write as much data as expected.");
      throw illegalStateException;
    } catch (IOException iOException) {
      k91.m(x41.w("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), iOException);
      return null;
    } 
  }
  
  public abstract int c(em2 paramem2);
  
  public abstract int d();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */