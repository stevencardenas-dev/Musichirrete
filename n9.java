import java.util.Arrays;

public final class n9 {
  public static final int c = 0;
  
  public final int[] a;
  
  public final int b;
  
  static {
    new n9(new int[] { 2 }, 8);
    new n9(new int[] { 2, 5, 6 }, 8);
  }
  
  public n9(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint != null) {
      paramArrayOfint = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
      this.a = paramArrayOfint;
      Arrays.sort(paramArrayOfint);
    } else {
      this.a = new int[0];
    } 
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof n9))
      return false; 
    paramObject = paramObject;
    return (Arrays.equals(this.a, ((n9)paramObject).a) && this.b == ((n9)paramObject).b);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.a) * 31 + this.b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AudioCapabilities[maxChannelCount=");
    stringBuilder.append(this.b);
    stringBuilder.append(", supportedEncodings=");
    stringBuilder.append(Arrays.toString(this.a));
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */