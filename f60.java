import android.util.Log;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class f60 {
  public final int a;
  
  public final int b;
  
  public final long c;
  
  public final byte[] d;
  
  public f60(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong;
    this.d = paramArrayOfbyte;
  }
  
  public f60(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this(-1L, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static f60 a(long paramLong, ByteOrder paramByteOrder) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[j60.D[4]]);
    byteBuffer.order(paramByteOrder);
    (new long[1])[0] = paramLong;
    byteBuffer.putInt((int)(new long[1])[0]);
    return new f60(byteBuffer.array(), 4, 1);
  }
  
  public static f60 b(h60 paramh60, ByteOrder paramByteOrder) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[j60.D[5]]);
    byteBuffer.order(paramByteOrder);
    (new h60[1])[0] = paramh60;
    paramh60 = (new h60[1])[0];
    byteBuffer.putInt((int)paramh60.a);
    byteBuffer.putInt((int)paramh60.b);
    return new f60(byteBuffer.array(), 5, 1);
  }
  
  public static f60 c(int paramInt, ByteOrder paramByteOrder) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[j60.D[3]]);
    byteBuffer.order(paramByteOrder);
    (new int[1])[0] = paramInt;
    byteBuffer.putShort((short)(new int[1])[0]);
    return new f60(byteBuffer.array(), 3, 1);
  }
  
  public final double d(ByteOrder paramByteOrder) {
    Serializable serializable = g(paramByteOrder);
    if (serializable != null) {
      long[] arrayOfLong;
      int[] arrayOfInt;
      double[] arrayOfDouble;
      if (serializable instanceof String)
        return Double.parseDouble((String)serializable); 
      if (serializable instanceof long[]) {
        arrayOfLong = (long[])serializable;
        if (arrayOfLong.length == 1)
          return arrayOfLong[0]; 
        throw new NumberFormatException("There are more than one component");
      } 
      if (arrayOfLong instanceof int[]) {
        arrayOfInt = (int[])arrayOfLong;
        if (arrayOfInt.length == 1)
          return arrayOfInt[0]; 
        throw new NumberFormatException("There are more than one component");
      } 
      if (arrayOfInt instanceof double[]) {
        arrayOfDouble = (double[])arrayOfInt;
        if (arrayOfDouble.length == 1)
          return arrayOfDouble[0]; 
        throw new NumberFormatException("There are more than one component");
      } 
      if (arrayOfDouble instanceof h60[]) {
        h60[] arrayOfH60 = (h60[])arrayOfDouble;
        if (arrayOfH60.length == 1) {
          h60 h60 = arrayOfH60[0];
          return h60.a / h60.b;
        } 
        throw new NumberFormatException("There are more than one component");
      } 
      throw new NumberFormatException("Couldn't find a double value");
    } 
    throw new NumberFormatException("NULL can't be converted to a double value");
  }
  
  public final int e(ByteOrder paramByteOrder) {
    Serializable serializable = g(paramByteOrder);
    if (serializable != null) {
      long[] arrayOfLong;
      if (serializable instanceof String)
        return Integer.parseInt((String)serializable); 
      if (serializable instanceof long[]) {
        arrayOfLong = (long[])serializable;
        if (arrayOfLong.length == 1)
          return (int)arrayOfLong[0]; 
        throw new NumberFormatException("There are more than one component");
      } 
      if (arrayOfLong instanceof int[]) {
        int[] arrayOfInt = (int[])arrayOfLong;
        if (arrayOfInt.length == 1)
          return arrayOfInt[0]; 
        throw new NumberFormatException("There are more than one component");
      } 
      throw new NumberFormatException("Couldn't find a integer value");
    } 
    throw new NumberFormatException("NULL can't be converted to a integer value");
  }
  
  public final String f(ByteOrder paramByteOrder) {
    Serializable serializable = g(paramByteOrder);
    if (serializable != null) {
      long[] arrayOfLong;
      int[] arrayOfInt;
      double[] arrayOfDouble;
      if (serializable instanceof String)
        return (String)serializable; 
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool1 = serializable instanceof long[];
      int j = 0;
      boolean bool = false;
      int i = 0;
      byte b = 0;
      if (bool1) {
        arrayOfLong = (long[])serializable;
        i = b;
        while (i < arrayOfLong.length) {
          stringBuilder.append(arrayOfLong[i]);
          j = i + 1;
          i = j;
          if (j != arrayOfLong.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (arrayOfLong instanceof int[]) {
        arrayOfInt = (int[])arrayOfLong;
        i = j;
        while (i < arrayOfInt.length) {
          stringBuilder.append(arrayOfInt[i]);
          j = i + 1;
          i = j;
          if (j != arrayOfInt.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (arrayOfInt instanceof double[]) {
        arrayOfDouble = (double[])arrayOfInt;
        i = bool;
        while (i < arrayOfDouble.length) {
          stringBuilder.append(arrayOfDouble[i]);
          j = i + 1;
          i = j;
          if (j != arrayOfDouble.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (arrayOfDouble instanceof h60[]) {
        h60[] arrayOfH60 = (h60[])arrayOfDouble;
        while (i < arrayOfH60.length) {
          stringBuilder.append((arrayOfH60[i]).a);
          stringBuilder.append('/');
          stringBuilder.append((arrayOfH60[i]).b);
          j = i + 1;
          i = j;
          if (j != arrayOfH60.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
    } 
    return null;
  }
  
  public final Serializable g(ByteOrder paramByteOrder) {
    ByteOrder byteOrder;
    byte[] arrayOfByte = this.d;
    e60 e60 = null;
    try {
      IOException iOException2;
      int[] arrayOfInt;
      e60 e601 = new e60();
      this(arrayOfByte);
      e60 = e601;
      try {
        double[] arrayOfDouble1;
        StringBuilder stringBuilder;
        String str1;
        double[] arrayOfDouble2;
        h60[] arrayOfH602;
        int[] arrayOfInt1;
        h60[] arrayOfH601;
        long[] arrayOfLong;
        e601.e = paramByteOrder;
        e60 = e601;
        int m = this.a;
        byte b4 = 0;
        byte b6 = 0;
        byte b1 = 0;
        byte b3 = 0;
        byte b7 = 0;
        int i = 0;
        byte b5 = 0;
        int j = 0;
        byte b2 = 0;
        int k = this.b;
        switch (m) {
          default:
            try {
              e601.close();
              return null;
            } catch (IOException iOException) {
              Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
              return null;
            } 
          case 12:
            e60 = e601;
            arrayOfDouble2 = new double[k];
            i = b2;
            while (true) {
              arrayOfDouble1 = arrayOfDouble2;
              if (i < k) {
                e60 = e601;
                arrayOfDouble2[i] = e601.readDouble();
                i++;
                continue;
              } 
              break;
            } 
            try {
              e601.close();
              return (Serializable)arrayOfDouble1;
            } catch (IOException iOException) {
              Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
              return (Serializable)arrayOfDouble1;
            } 
          case 11:
            e60 = e601;
            arrayOfDouble2 = new double[k];
            i = b4;
            while (true) {
              arrayOfDouble1 = arrayOfDouble2;
              if (i < k) {
                e60 = e601;
                arrayOfDouble2[i] = e601.readFloat();
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfDouble1;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfDouble1;
              } 
            } 
          case 10:
            e60 = e601;
            arrayOfH602 = new h60[k];
            i = b6;
            while (true) {
              h60[] arrayOfH60 = arrayOfH602;
              if (i < k) {
                e60 = e601;
                arrayOfH602[i] = new h60(e601.readInt(), e601.readInt());
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfH60;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfH60;
              } 
            } 
          case 9:
            e60 = e601;
            arrayOfInt1 = new int[k];
            i = b1;
            while (true) {
              int[] arrayOfInt2 = arrayOfInt1;
              if (i < k) {
                e60 = e601;
                arrayOfInt1[i] = e601.readInt();
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfInt2;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfInt2;
              } 
            } 
          case 8:
            e60 = e601;
            arrayOfInt1 = new int[k];
            i = b3;
            while (true) {
              int[] arrayOfInt2 = arrayOfInt1;
              if (i < k) {
                e60 = e601;
                arrayOfInt1[i] = e601.readShort();
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfInt2;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfInt2;
              } 
            } 
          case 5:
            e60 = e601;
            arrayOfH601 = new h60[k];
            i = b7;
            while (true) {
              h60[] arrayOfH60 = arrayOfH601;
              if (i < k) {
                e60 = e601;
                arrayOfH601[i] = new h60(e601.readInt() & 0xFFFFFFFFL, e601.readInt() & 0xFFFFFFFFL);
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfH60;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfH60;
              } 
            } 
          case 4:
            e60 = e601;
            arrayOfLong = new long[k];
            while (true) {
              long[] arrayOfLong1 = arrayOfLong;
              if (i < k) {
                e60 = e601;
                arrayOfLong[i] = e601.readInt() & 0xFFFFFFFFL;
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfLong1;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfLong1;
              } 
            } 
          case 3:
            e60 = e601;
            arrayOfInt = new int[k];
            i = b5;
            while (true) {
              int[] arrayOfInt2 = arrayOfInt;
              if (i < k) {
                e60 = e601;
                arrayOfInt[i] = e601.readUnsignedShort();
                i++;
                continue;
              } 
              try {
                e601.close();
                return (Serializable)arrayOfInt2;
              } catch (IOException iOException) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
                return (Serializable)arrayOfInt2;
              } 
            } 
          case 2:
          case 7:
            e60 = e601;
            i = j;
            if (k >= j60.E.length) {
              i = 0;
              while (true) {
                e60 = e601;
                byte[] arrayOfByte1 = j60.E;
                e60 = e601;
                if (i < arrayOfByte1.length) {
                  if (arrayOfInt[i] != arrayOfByte1[i]) {
                    i = j;
                    break;
                  } 
                  i++;
                  continue;
                } 
                e60 = e601;
                i = arrayOfByte1.length;
                break;
              } 
            } 
            e60 = e601;
            stringBuilder = new StringBuilder();
            e60 = e601;
            this();
            while (i < k) {
              j = arrayOfInt[i];
              if (j == 0)
                break; 
              if (j >= 32) {
                e60 = e601;
                stringBuilder.append((char)j);
              } else {
                e60 = e601;
                stringBuilder.append('?');
              } 
              i++;
            } 
            e60 = e601;
            str1 = stringBuilder.toString();
            try {
              e601.close();
              return str1;
            } catch (IOException iOException) {
              Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
              return str1;
            } 
          case 1:
          case 6:
            break;
        } 
      } catch (IOException iOException) {
        e60 e602 = e601;
        iOException2 = iOException;
      } finally {}
      IOException iOException1 = iOException2;
      if (arrayOfInt.length == 1) {
        int i = arrayOfInt[0];
        if (i >= 0 && i <= 1) {
          iOException1 = iOException2;
          String str1 = new String(new char[] { (char)(i + 48) });
          try {
            iOException2.close();
            return str1;
          } catch (IOException iOException) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
            return str1;
          } 
        } 
      } 
      iOException1 = iOException2;
      String str = new String((byte[])arrayOfInt, j60.M);
      try {
        iOException2.close();
        return str;
      } catch (IOException iOException) {
        Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
        return str;
      } 
    } catch (IOException iOException) {
      paramByteOrder = null;
      byteOrder = paramByteOrder;
      Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
      if (paramByteOrder != null)
        try {
          paramByteOrder.close();
        } catch (IOException iOException1) {
          Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException1);
        }  
      return null;
    } finally {}
    if (byteOrder != null)
      try {
        byteOrder.close();
      } catch (IOException iOException) {
        Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException);
      }  
    throw paramByteOrder;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("(");
    stringBuilder.append(j60.C[this.a]);
    stringBuilder.append(oXrNDUqUkE.dexmdGPXgYgcu);
    return x41.m(stringBuilder, this.d.length, ")");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */