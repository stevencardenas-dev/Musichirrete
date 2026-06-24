package org.jaudiotagger.audio.asf.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import l0;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.GUID;
import tp;

public class Utils {
  static final boolean $assertionsDisabled = false;
  
  public static final long DIFF_BETWEEN_ASF_DATE_AND_JAVA_DATE = 11644470000000L;
  
  public static final String LINE_SEPARATOR = System.getProperty("line.separator");
  
  private static final int MAXIMUM_STRING_LENGTH_ALLOWED = 32766;
  
  public static void checkStringLengthNullSafe(String paramString) {
    if (paramString != null && paramString.length() > 32766)
      l0.l(MessageFormat.format("Trying to create field but UTF-16LE representation is {0} and exceeds maximum allowed of 65535.", new Object[] { Integer.valueOf(paramString.length() * 2) })); 
  }
  
  public static void copy(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong) {
    byte[] arrayOfByte = new byte[8192];
    long l = 0L;
    while (l < paramLong) {
      long l1 = paramLong - l;
      if (l1 < 8192L) {
        i = (int)l1;
      } else {
        i = 8192;
      } 
      int i = paramInputStream.read(arrayOfByte, 0, i);
      if (i != -1) {
        paramOutputStream.write(arrayOfByte, 0, i);
        l += i;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder("Inputstream has to continue for another ");
      stringBuilder.append(l1);
      stringBuilder.append(" bytes.");
      throw new IOException(stringBuilder.toString());
    } 
  }
  
  public static void flush(InputStream paramInputStream, OutputStream paramOutputStream) {
    byte[] arrayOfByte = new byte[8192];
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i != -1) {
        paramOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      break;
    } 
  }
  
  public static byte[] getBytes(long paramLong, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (byte b = 0; b < paramInt; b++)
      arrayOfByte[b] = (byte)(int)(paramLong >>> b * 8 & 0xFFL); 
    return arrayOfByte;
  }
  
  public static byte[] getBytes(String paramString, Charset paramCharset) {
    ByteBuffer byteBuffer = paramCharset.encode(paramString);
    byte[] arrayOfByte = new byte[byteBuffer.limit()];
    byteBuffer.rewind();
    byteBuffer.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static GregorianCalendar getDateOf(BigInteger paramBigInteger) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(new Date(paramBigInteger.divide(new BigInteger("10")).longValue() - 11644470000000L));
    return gregorianCalendar;
  }
  
  public static boolean isBlank(String paramString) {
    if (paramString == null)
      return true; 
    for (byte b = 0; b < paramString.length(); b++) {
      if (!Character.isWhitespace(paramString.charAt(b)))
        return false; 
    } 
    return true;
  }
  
  public static boolean isEmpty(String paramString) {
    return (paramString == null || paramString.length() == 0);
  }
  
  public static boolean isStringLengthValidNullSafe(String paramString) {
    return !(paramString != null && paramString.length() > 32766);
  }
  
  public static BigInteger readBig64(InputStream paramInputStream) {
    byte[] arrayOfByte1 = new byte[8];
    byte[] arrayOfByte2 = new byte[8];
    if (paramInputStream.read(arrayOfByte1) == 8) {
      for (byte b = 0; b < 8; b++)
        arrayOfByte2[7 - b] = arrayOfByte1[b]; 
      return new BigInteger(arrayOfByte2);
    } 
    throw new EOFException();
  }
  
  public static byte[] readBinary(InputStream paramInputStream, long paramLong) {
    byte[] arrayOfByte = new byte[(int)paramLong];
    paramInputStream.read(arrayOfByte);
    return arrayOfByte;
  }
  
  public static String readCharacterSizedString(InputStream paramInputStream) {
    StringBuilder stringBuilder = new StringBuilder();
    int j = readUINT16(paramInputStream);
    int i = paramInputStream.read() | paramInputStream.read() << 8;
    while (true) {
      int k = i;
      if (i != 0) {
        stringBuilder.append((char)i);
        k = paramInputStream.read() | paramInputStream.read() << 8;
      } 
      i = k;
      if (k == 0) {
        i = k;
        if (stringBuilder.length() + 1 <= j) {
          if (j == stringBuilder.length() + 1)
            return stringBuilder.toString(); 
          tp.f("Invalid Data for current interpretation");
          return null;
        } 
      } 
    } 
  }
  
  public static String readFixedSizeUTF16Str(InputStream paramInputStream, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    if (paramInputStream.read(arrayOfByte) == paramInt) {
      byte[] arrayOfByte1 = arrayOfByte;
      if (paramInt >= 2) {
        arrayOfByte1 = arrayOfByte;
        if (arrayOfByte[paramInt - 1] == 0) {
          paramInt -= 2;
          arrayOfByte1 = arrayOfByte;
          if (arrayOfByte[paramInt] == 0) {
            arrayOfByte1 = new byte[paramInt];
            System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, paramInt);
          } 
        } 
      } 
      return new String(arrayOfByte1, "UTF-16LE");
    } 
    tp.f("Couldn't read the necessary amount of bytes.");
    return null;
  }
  
  public static GUID readGUID(InputStream paramInputStream) {
    if (paramInputStream != null) {
      int[] arrayOfInt = new int[16];
      for (byte b = 0; b < 16; b++)
        arrayOfInt[b] = paramInputStream.read(); 
      return new GUID(arrayOfInt);
    } 
    l0.l(kOkiWEITVb.rttlb);
    return null;
  }
  
  public static int readUINT16(InputStream paramInputStream) {
    int i = paramInputStream.read();
    return paramInputStream.read() << 8 | i;
  }
  
  public static long readUINT32(InputStream paramInputStream) {
    long l = 0L;
    for (byte b = 0; b <= 24; b += 8)
      l |= paramInputStream.read() << b; 
    return l;
  }
  
  public static long readUINT64(InputStream paramInputStream) {
    long l = 0L;
    for (byte b = 0; b <= 56; b += 8)
      l |= paramInputStream.read() << b; 
    return l;
  }
  
  public static String readUTF16LEStr(InputStream paramInputStream) {
    int i = readUINT16(paramInputStream);
    byte[] arrayOfByte = new byte[i];
    int j = paramInputStream.read(arrayOfByte);
    if (j == i || (i == 0 && j == -1)) {
      byte[] arrayOfByte1 = arrayOfByte;
      if (i >= 2) {
        arrayOfByte1 = arrayOfByte;
        if (arrayOfByte[i - 1] == 0) {
          i -= 2;
          arrayOfByte1 = arrayOfByte;
          if (arrayOfByte[i] == 0) {
            arrayOfByte1 = new byte[i];
            System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, i);
          } 
        } 
      } 
      return new String(arrayOfByte1, AsfHeader.ASF_CHARSET.name());
    } 
    tp.f("Invalid Data for current interpretation");
    return null;
  }
  
  public static void writeUINT16(int paramInt, OutputStream paramOutputStream) {
    if (paramInt >= 0) {
      byte[] arrayOfByte = new byte[2];
      for (byte b = 0; b <= 8; b += 8)
        arrayOfByte[b / 8] = (byte)(paramInt >> b & 0xFF); 
      paramOutputStream.write(arrayOfByte);
      return;
    } 
    l0.l("positive value expected.");
  }
  
  public static void writeUINT32(long paramLong, OutputStream paramOutputStream) {
    if (paramLong >= 0L) {
      byte[] arrayOfByte = new byte[4];
      for (byte b = 0; b <= 24; b += 8)
        arrayOfByte[b / 8] = (byte)(int)(paramLong >> b & 0xFFL); 
      paramOutputStream.write(arrayOfByte);
      return;
    } 
    l0.l("positive value expected.");
  }
  
  public static void writeUINT64(long paramLong, OutputStream paramOutputStream) {
    if (paramLong >= 0L) {
      byte[] arrayOfByte = new byte[8];
      for (byte b = 0; b <= 56; b += 8)
        arrayOfByte[b / 8] = (byte)(int)(paramLong >> b & 0xFFL); 
      paramOutputStream.write(arrayOfByte);
      return;
    } 
    l0.l("positive value expected.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\as\\util\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */