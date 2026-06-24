import java.io.DataInput;
import java.util.Arrays;

public final class kv extends hv {
  public final long[] h;
  
  public final int[] i;
  
  public final int[] j;
  
  public final String[] k;
  
  public final iv l;
  
  public kv(String paramString, long[] paramArrayOflong, int[] paramArrayOfint1, int[] paramArrayOfint2, String[] paramArrayOfString, iv paramiv) {
    super(paramString);
    this.h = paramArrayOflong;
    this.i = paramArrayOfint1;
    this.j = paramArrayOfint2;
    this.k = paramArrayOfString;
    this.l = paramiv;
  }
  
  public static kv r(DataInput paramDataInput, String paramString) {
    int k = paramDataInput.readUnsignedShort();
    String[] arrayOfString2 = new String[k];
    int j = 0;
    int i;
    for (i = 0; i < k; i++)
      arrayOfString2[i] = paramDataInput.readUTF(); 
    int m = paramDataInput.readInt();
    long[] arrayOfLong = new long[m];
    int[] arrayOfInt1 = new int[m];
    int[] arrayOfInt2 = new int[m];
    String[] arrayOfString1 = new String[m];
    for (i = j;; i++) {
      iv iv1 = null;
      if (i < m) {
        arrayOfLong[i] = qv.U(paramDataInput);
        arrayOfInt1[i] = (int)qv.U(paramDataInput);
        arrayOfInt2[i] = (int)qv.U(paramDataInput);
        if (k < 256) {
          try {
            j = paramDataInput.readUnsignedByte();
            arrayOfString1[i] = arrayOfString2[j];
            i++;
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            m60.i("Invalid encoding");
            return null;
          } 
          continue;
        } 
        j = arrayIndexOutOfBoundsException.readUnsignedShort();
      } else {
        if (arrayIndexOutOfBoundsException.readBoolean())
          iv1 = new iv(paramString, (int)qv.U((DataInput)arrayIndexOutOfBoundsException), lv.c((DataInput)arrayIndexOutOfBoundsException), lv.c((DataInput)arrayIndexOutOfBoundsException)); 
        return new kv(paramString, arrayOfLong, arrayOfInt1, arrayOfInt2, arrayOfString1, iv1);
      } 
      arrayOfString1[i] = arrayOfString2[j];
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof kv) {
      paramObject = paramObject;
      if (this.b.equals(((hv)paramObject).b) && Arrays.equals(this.h, ((kv)paramObject).h) && Arrays.equals((Object[])this.k, (Object[])((kv)paramObject).k) && Arrays.equals(this.i, ((kv)paramObject).i) && Arrays.equals(this.j, ((kv)paramObject).j)) {
        iv iv1 = ((kv)paramObject).l;
        paramObject = this.l;
        if ((paramObject == null) ? (iv1 == null) : paramObject.equals(iv1))
          return true; 
      } 
    } 
    return false;
  }
  
  public final String f(long paramLong) {
    long[] arrayOfLong = this.h;
    int i = Arrays.binarySearch(arrayOfLong, paramLong);
    String[] arrayOfString = this.k;
    if (i >= 0)
      return arrayOfString[i]; 
    i ^= 0xFFFFFFFF;
    if (i < arrayOfLong.length)
      return (i > 0) ? arrayOfString[i - 1] : "UTC"; 
    iv iv1 = this.l;
    return (iv1 == null) ? arrayOfString[i - 1] : (iv1.r(paramLong)).b;
  }
  
  public final int h(long paramLong) {
    long[] arrayOfLong = this.h;
    int i = Arrays.binarySearch(arrayOfLong, paramLong);
    int[] arrayOfInt = this.i;
    if (i >= 0)
      return arrayOfInt[i]; 
    i ^= 0xFFFFFFFF;
    if (i < arrayOfLong.length)
      return (i > 0) ? arrayOfInt[i - 1] : 0; 
    iv iv1 = this.l;
    return (iv1 == null) ? arrayOfInt[i - 1] : iv1.h(paramLong);
  }
  
  public final int k(long paramLong) {
    long[] arrayOfLong = this.h;
    int i = Arrays.binarySearch(arrayOfLong, paramLong);
    int[] arrayOfInt = this.j;
    if (i >= 0)
      return arrayOfInt[i]; 
    i ^= 0xFFFFFFFF;
    if (i < arrayOfLong.length)
      return (i > 0) ? arrayOfInt[i - 1] : 0; 
    iv iv1 = this.l;
    return (iv1 == null) ? arrayOfInt[i - 1] : iv1.h;
  }
  
  public final boolean l() {
    return false;
  }
  
  public final long m(long paramLong) {
    long[] arrayOfLong = this.h;
    int i = Arrays.binarySearch(arrayOfLong, paramLong);
    if (i >= 0) {
      i++;
    } else {
      i ^= 0xFFFFFFFF;
    } 
    if (i < arrayOfLong.length)
      return arrayOfLong[i]; 
    iv iv1 = this.l;
    if (iv1 == null)
      return paramLong; 
    long l2 = arrayOfLong[arrayOfLong.length - 1];
    long l1 = paramLong;
    if (paramLong < l2)
      l1 = l2; 
    return iv1.m(l1);
  }
  
  public final long o(long paramLong) {
    long[] arrayOfLong = this.h;
    int i = Arrays.binarySearch(arrayOfLong, paramLong);
    if (i >= 0) {
      if (paramLong > Long.MIN_VALUE)
        return paramLong - 1L; 
    } else {
      i ^= 0xFFFFFFFF;
      if (i < arrayOfLong.length) {
        if (i > 0) {
          long l = arrayOfLong[i - 1];
          if (l > Long.MIN_VALUE)
            return l - 1L; 
        } 
      } else {
        iv iv1 = this.l;
        if (iv1 != null) {
          long l1 = iv1.o(paramLong);
          if (l1 < paramLong)
            return l1; 
        } 
        long l = arrayOfLong[i - 1];
        if (l > Long.MIN_VALUE)
          return l - 1L; 
      } 
    } 
    return paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */