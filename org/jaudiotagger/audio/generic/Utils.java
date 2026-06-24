package org.jaudiotagger.audio.generic;

import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.utils.SgV.YbNJ;
import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.id3.ID3SyncSafeInteger;
import u00;
import uc1;
import ws2;
import y70;

public class Utils {
  public static int BITS_IN_BYTE_MULTIPLIER = 8;
  
  public static int KILOBYTE_MULTIPLIER = 1000;
  
  private static final int MAX_BASE_TEMP_FILENAME_LENGTH = 20;
  
  private static final Map<Class, Class> boxed2primitive;
  
  private static final Logger logger = Logger.getLogger(YbNJ.aABKDwlxshNfIi);
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    boxed2primitive = (Map)hashMap;
    hashMap.put(Void.class, void.class);
    hashMap.put(Byte.class, byte.class);
    hashMap.put(Short.class, short.class);
    hashMap.put(Character.class, char.class);
    hashMap.put(Integer.class, int.class);
    hashMap.put(Long.class, long.class);
    hashMap.put(Float.class, float.class);
    hashMap.put(Double.class, double.class);
  }
  
  private static Class[] classes(Object[] paramArrayOfObject) {
    Class[] arrayOfClass = new Class[paramArrayOfObject.length];
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      Class<?> clazz2 = paramArrayOfObject[b].getClass();
      Map<Class, Class> map = boxed2primitive;
      Class<?> clazz1 = clazz2;
      if (map.containsKey(clazz2))
        clazz1 = map.get(clazz2); 
      arrayOfClass[b] = clazz1;
    } 
    return arrayOfClass;
  }
  
  public static void copy(ReadableByteChannel paramReadableByteChannel, WritableByteChannel paramWritableByteChannel, long paramLong) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(65536);
    long l = paramLong;
    while (true) {
      byteBuffer.position(0);
      byteBuffer.limit((int)Math.min(l, byteBuffer.capacity()));
      int i = paramReadableByteChannel.read(byteBuffer);
      paramLong = l;
      if (i != -1) {
        byteBuffer.flip();
        paramWritableByteChannel.write(byteBuffer);
        paramLong = l - i;
      } 
      if (i != -1) {
        l = paramLong;
        if (paramLong <= 0L)
          break; 
        continue;
      } 
      break;
    } 
  }
  
  public static boolean copy(u00 paramu001, u00 paramu002) {
    try {
      copyThrowsOnException(paramu001, paramu002);
      return true;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return false;
    } 
  }
  
  public static void copyThrowsOnException(u00 paramu001, u00 paramu002) {
    FileInputStream fileInputStream = ws2.n(paramu001);
    try {
      FileOutputStream fileOutputStream = ws2.o(paramu002);
      try {
        FileChannel fileChannel1 = fileInputStream.getChannel();
        FileChannel fileChannel2 = fileOutputStream.getChannel();
        long l2 = fileChannel1.size();
        for (long l1 = 0L; l1 < l2; l1 += l)
          long l = fileChannel1.transferTo(l1, 1048576L, fileChannel2); 
      } finally {
        Exception exception;
      } 
      fileOutputStream.close();
      return;
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } finally {
          fileInputStream = null;
        }  
    } 
  }
  
  public static ByteBuffer duplicate(ByteBuffer paramByteBuffer) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    byteBuffer.put(paramByteBuffer.duplicate());
    byteBuffer.flip();
    return byteBuffer;
  }
  
  public static ByteBuffer fetchFromChannel(ReadableByteChannel paramReadableByteChannel, int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt);
    readFromChannel(paramReadableByteChannel, byteBuffer);
    byteBuffer.flip();
    return byteBuffer;
  }
  
  public static String getBaseFilenameForTempFile(u00 paramu00) {
    String str = getMinBaseFilenameAllowedForTempFile(paramu00);
    return (str.length() <= 20) ? str : str.substring(0, 20);
  }
  
  public static String getExtension(u00 paramu00) {
    String str = paramu00.h().toLowerCase();
    int i = str.lastIndexOf(".");
    return (i == -1) ? "" : str.substring(i + 1);
  }
  
  public static int getIntBE(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    return (int)getLongBE(paramByteBuffer, paramInt1, paramInt2);
  }
  
  public static int getIntLE(byte[] paramArrayOfbyte) {
    return (int)getLongLE(ByteBuffer.wrap(paramArrayOfbyte), 0, paramArrayOfbyte.length - 1);
  }
  
  public static int getIntLE(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (int)getLongLE(ByteBuffer.wrap(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  public static long getLongBE(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    long l = 0L;
    for (byte b = 0; b < paramInt2 - paramInt1 + 1; b++)
      l += (paramByteBuffer.get(paramInt2 - b) & 0xFF) << b * 8; 
    return l;
  }
  
  public static long getLongLE(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    long l = 0L;
    for (byte b = 0; b < paramInt2 - paramInt1 + 1; b++)
      l += ((paramByteBuffer.get(paramInt1 + b) & 0xFF) << b * 8); 
    return l;
  }
  
  public static long getLongLE(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return getLongLE(ByteBuffer.wrap(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  public static String getMagicExtension(u00 paramu00) {
    int i;
    String str1;
    u00 u001;
    HashMap hashMap = y70.b;
    byte[] arrayOfByte = new byte[128];
    FileInputStream fileInputStream = ws2.n(paramu00);
    FileChannel fileChannel = fileInputStream.getChannel();
    try {
      i = fileInputStream.read(arrayOfByte, 0, 128);
      int k = i;
      while (i < 8 && k > 0) {
        k = fileInputStream.read(arrayOfByte, i, 128 - i);
        i += k;
      } 
    } finally {}
    int j = i;
    if (y70.a(y70.a, arrayOfByte, i)) {
      ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4);
      fileChannel.position(6L);
      fileChannel.read(byteBuffer);
      byteBuffer.flip();
      fileChannel.position((ID3SyncSafeInteger.bufferToValue(byteBuffer) + 10));
      int k = fileInputStream.read(arrayOfByte, 0, 128);
      i = k;
      while (true) {
        j = i;
        if (i < 8) {
          j = i;
          if (k > 0) {
            k = fileInputStream.read(arrayOfByte, i, 128 - i);
            i += k;
            continue;
          } 
        } 
        break;
      } 
    } 
    String str2 = jHxlGgUTadw.BwvUHUPlYh;
    Iterator<String> iterator = hashMap.keySet().iterator();
    while (true) {
      str1 = str2;
      if (iterator.hasNext()) {
        str1 = iterator.next();
        if (y70.a((Integer[])hashMap.get(str1), arrayOfByte, j))
          break; 
        continue;
      } 
      break;
    } 
    str2 = str1;
    if ("OGG".equals(str1)) {
      uc1 uc1 = new uc1();
      this(paramu00, "r");
      try {
        arrayOfByte = new byte[OggPageHeader.read(uc1).getPageLength()];
        uc1.g(arrayOfByte);
        String str = str1;
        if (readString(ByteBuffer.wrap(arrayOfByte), 8).equals("OpusHead"))
          str = "OPUS"; 
      } catch (CannotReadException cannotReadException) {
        cannotReadException.printStackTrace();
        String str = str1;
      } finally {}
      uc1.close();
      u001 = paramu00;
    } 
    try {
      fileInputStream.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    try {
      fileChannel.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    return (String)y70.c.get(u001);
  }
  
  public static String getMinBaseFilenameAllowedForTempFile(u00 paramu00) {
    String str1;
    String str2 = AudioFile.getBaseFilename(paramu00);
    if (str2.length() >= 3) {
      str1 = str2;
    } else {
      if (str2.length() == 1)
        return str2.concat("000"); 
      if (str2.length() == 1)
        return str2.concat("00"); 
      str1 = str2;
      if (str2.length() == 2)
        str1 = str2.concat("0"); 
    } 
    return str1;
  }
  
  public static short getShortBE(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    return (short)getIntBE(paramByteBuffer, paramInt1, paramInt2);
  }
  
  public static byte[] getSizeBEInt16(short paramShort) {
    return new byte[] { (byte)(paramShort >> 8 & 0xFF), (byte)(paramShort & 0xFF) };
  }
  
  public static byte[] getSizeBEInt32(int paramInt) {
    return new byte[] { (byte)(paramInt >> 24 & 0xFF), (byte)(paramInt >> 16 & 0xFF), (byte)(paramInt >> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
  
  public static byte[] getSizeLEInt32(int paramInt) {
    return new byte[] { (byte)(paramInt & 0xFF), (byte)(int)((paramInt >>> 8) & 0xFFL), (byte)(int)((paramInt >>> 16) & 0xFFL), (byte)(int)(0xFFL & (paramInt >>> 24)) };
  }
  
  public static String getString(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, Charset paramCharset) {
    byte[] arrayOfByte = new byte[paramInt2];
    paramByteBuffer.position(paramByteBuffer.position() + paramInt1);
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, 0, paramInt2, paramCharset);
  }
  
  public static String getString(ByteBuffer paramByteBuffer, Charset paramCharset) {
    int i = paramByteBuffer.remaining();
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, 0, i, paramCharset);
  }
  
  public static boolean isOddLength(long paramLong) {
    return ((paramLong & 0x1L) != 0L);
  }
  
  public static <T> T newInstance(Class<T> paramClass, Object[] paramArrayOfObject) {
    try {
      return (T)paramClass.getConstructor(classes(paramArrayOfObject)).newInstance(paramArrayOfObject);
    } catch (Exception exception) {
      k91.n(exception);
      return null;
    } 
  }
  
  public static ByteBuffer read(ByteBuffer paramByteBuffer, int paramInt) {
    ByteBuffer byteBuffer = paramByteBuffer.duplicate();
    paramInt = paramByteBuffer.position() + paramInt;
    byteBuffer.limit(paramInt);
    paramByteBuffer.position(paramInt);
    return byteBuffer;
  }
  
  public static int readBER32(ByteBuffer paramByteBuffer) {
    byte b = 0;
    int i = 0;
    while (b < 4) {
      byte b1 = paramByteBuffer.get();
      i = i << 7 | b1 & Byte.MAX_VALUE;
      if ((b1 & 0xFF) >> 7 == 0)
        return i; 
      b++;
    } 
    return i;
  }
  
  public static ByteBuffer readBuf(ByteBuffer paramByteBuffer) {
    ByteBuffer byteBuffer = paramByteBuffer.duplicate();
    paramByteBuffer.position(paramByteBuffer.limit());
    return byteBuffer;
  }
  
  public static ByteBuffer readFileDataIntoBufferBE(FileChannel paramFileChannel, int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(paramInt);
    paramFileChannel.read(byteBuffer);
    byteBuffer.position(0);
    byteBuffer.order(ByteOrder.BIG_ENDIAN);
    return byteBuffer;
  }
  
  public static ByteBuffer readFileDataIntoBufferLE(FileChannel paramFileChannel, int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(paramInt);
    paramFileChannel.read(byteBuffer);
    byteBuffer.position(0);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return byteBuffer;
  }
  
  public static String readFourBytesAsChars(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() < 4)
      return null; 
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, Charset.forName(FgdLmmRfTxSFKI.uDIu));
  }
  
  public static int readFromChannel(ReadableByteChannel paramReadableByteChannel, ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    while (paramReadableByteChannel.read(paramByteBuffer) != -1 && paramByteBuffer.hasRemaining());
    return paramByteBuffer.position() - i;
  }
  
  public static String readNullTermStringCharset(ByteBuffer paramByteBuffer, Charset paramCharset) {
    ByteBuffer byteBuffer = paramByteBuffer.duplicate();
    while (paramByteBuffer.hasRemaining() && paramByteBuffer.get() != 0);
    byteBuffer.limit(paramByteBuffer.position() - 1);
    return new String(toArray(byteBuffer), paramCharset);
  }
  
  public static String readPascalString(ByteBuffer paramByteBuffer) {
    int i = u(paramByteBuffer.get());
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, 0, i, Charset.forName("ISO-8859-1"));
  }
  
  public static String readString(DataInput paramDataInput, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramDataInput.readFully(arrayOfByte);
    return new String(arrayOfByte, Charset.forName("US-ASCII"));
  }
  
  public static String readString(ByteBuffer paramByteBuffer, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, Charset.forName("US-ASCII"));
  }
  
  public static String readThreeBytesAsChars(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[3];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, Charset.forName("ISO-8859-1"));
  }
  
  public static int readUint16(DataInput paramDataInput) {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = 0;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = 0;
    arrayOfByte[3] = 0;
    paramDataInput.readFully(arrayOfByte, 2, 2);
    return ByteBuffer.wrap(arrayOfByte).getInt();
  }
  
  public static long readUint32(DataInput paramDataInput) {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = 0;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = 0;
    arrayOfByte[3] = 0;
    arrayOfByte[4] = 0;
    arrayOfByte[5] = 0;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    paramDataInput.readFully(arrayOfByte, 4, 4);
    return ByteBuffer.wrap(arrayOfByte).getLong();
  }
  
  public static String reinterpretIntAsString(Integer paramInteger) {
    return new String(ByteBuffer.allocate(4).putInt(paramInteger.intValue()).array(), Charset.forName("ISO-8859-1"));
  }
  
  public static Integer reinterpretStringAsInt(String paramString) {
    return Integer.valueOf(ByteBuffer.wrap(paramString.getBytes(Charset.forName("ISO-8859-1"))).getInt());
  }
  
  public static boolean rename(u00 paramu001, u00 paramu002) {
    StringBuilder stringBuilder;
    if (paramu002.f()) {
      Logger logger = logger;
      Level level = Level.SEVERE;
      stringBuilder = new StringBuilder("Destination File:");
      stringBuilder.append(paramu002);
      stringBuilder.append(" already exists");
      logger.log(level, stringBuilder.toString());
      return false;
    } 
    if (!stringBuilder.o(paramu002.h()))
      if (copy((u00)stringBuilder, paramu002)) {
        if (!stringBuilder.e()) {
          Logger logger = logger;
          Level level = Level.SEVERE;
          StringBuilder stringBuilder1 = new StringBuilder("Unable to delete File:");
          stringBuilder1.append(stringBuilder);
          logger.log(level, stringBuilder1.toString());
          paramu002.e();
          return false;
        } 
      } else {
        return false;
      }  
    return true;
  }
  
  public static int skip(ByteBuffer paramByteBuffer, int paramInt) {
    paramInt = Math.min(paramByteBuffer.remaining(), paramInt);
    paramByteBuffer.position(paramByteBuffer.position() + paramInt);
    return paramInt;
  }
  
  public static byte[] toArray(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
    paramByteBuffer.duplicate().get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static int u(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  public static int u(short paramShort) {
    return paramShort & 0xFFFF;
  }
  
  public static long u(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
  
  public static void write(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) {
    if (paramByteBuffer2.hasArray()) {
      byte[] arrayOfByte = paramByteBuffer2.array();
      int i = paramByteBuffer2.arrayOffset();
      paramByteBuffer1.put(arrayOfByte, paramByteBuffer2.position() + i, Math.min(paramByteBuffer1.remaining(), paramByteBuffer2.remaining()));
      return;
    } 
    paramByteBuffer1.put(toArray(paramByteBuffer2));
  }
  
  public static void writeBER32(ByteBuffer paramByteBuffer, int paramInt) {
    paramByteBuffer.put((byte)(paramInt >> 21 | 0x80));
    paramByteBuffer.put((byte)(paramInt >> 14 | 0x80));
    paramByteBuffer.put((byte)(paramInt >> 7 | 0x80));
    paramByteBuffer.put((byte)(paramInt & 0x7F));
  }
  
  public static void writePascalString(ByteBuffer paramByteBuffer, String paramString) {
    paramByteBuffer.put((byte)paramString.length());
    paramByteBuffer.put(paramString.getBytes(Charset.forName("ISO-8859-1")));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */