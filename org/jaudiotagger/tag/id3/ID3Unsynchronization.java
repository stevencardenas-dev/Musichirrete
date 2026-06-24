package org.jaudiotagger.tag.id3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ID3Unsynchronization {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  public static boolean requiresUnsynchronization(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length - 1; b++) {
      if ((paramArrayOfbyte[b] & 0xFF) == 255 && (paramArrayOfbyte[b + 1] & 0xE0) == 224) {
        if (logger.isLoggable(Level.FINEST)) {
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder("Unsynchronisation required found bit at:");
          stringBuilder.append(b);
          logger.finest(stringBuilder.toString());
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public static ByteBuffer synchronize(ByteBuffer paramByteBuffer) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual remaining : ()I
    //   4: istore #6
    //   6: iload #6
    //   8: iconst_1
    //   9: iadd
    //   10: newarray byte
    //   12: astore #7
    //   14: aload_0
    //   15: aload #7
    //   17: iconst_0
    //   18: iload #6
    //   20: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
    //   23: pop
    //   24: iconst_1
    //   25: istore_2
    //   26: iconst_0
    //   27: istore_3
    //   28: iconst_0
    //   29: istore #5
    //   31: iload_3
    //   32: iload #6
    //   34: if_icmpge -> 94
    //   37: aload #7
    //   39: iload_3
    //   40: baload
    //   41: istore_1
    //   42: iload_2
    //   43: ifne -> 54
    //   46: iload #5
    //   48: istore #4
    //   50: iload_1
    //   51: ifeq -> 66
    //   54: aload #7
    //   56: iload #5
    //   58: iload_1
    //   59: bastore
    //   60: iload #5
    //   62: iconst_1
    //   63: iadd
    //   64: istore #4
    //   66: iload_1
    //   67: sipush #255
    //   70: iand
    //   71: sipush #255
    //   74: if_icmpeq -> 82
    //   77: iconst_1
    //   78: istore_2
    //   79: goto -> 84
    //   82: iconst_0
    //   83: istore_2
    //   84: iinc #3, 1
    //   87: iload #4
    //   89: istore #5
    //   91: goto -> 31
    //   94: aload #7
    //   96: iconst_0
    //   97: iload #5
    //   99: invokestatic wrap : ([BII)Ljava/nio/ByteBuffer;
    //   102: areturn
  }
  
  public static byte[] unsynchronize(byte[] paramArrayOfbyte) {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length);
    int i = 0;
    while (byteArrayInputStream.available() > 0) {
      int k = byteArrayInputStream.read();
      int j = i + 1;
      byteArrayOutputStream.write(k);
      i = j;
      if ((k & 0xFF) == 255) {
        i = j;
        if (byteArrayInputStream.available() > 0) {
          byteArrayInputStream.mark(1);
          i = byteArrayInputStream.read();
          if ((i & 0xE0) == 224) {
            if (logger.isLoggable(Level.FINEST)) {
              Logger logger = logger;
              StringBuilder stringBuilder = new StringBuilder("Writing unsynchronisation bit at:");
              stringBuilder.append(j);
              logger.finest(stringBuilder.toString());
            } 
            byteArrayOutputStream.write(0);
          } else if (i == 0) {
            if (logger.isLoggable(Level.FINEST)) {
              Logger logger = logger;
              StringBuilder stringBuilder = new StringBuilder("Inserting zero unsynchronisation bit at:");
              stringBuilder.append(j);
              logger.finest(stringBuilder.toString());
            } 
            byteArrayOutputStream.write(0);
          } 
          byteArrayInputStream.reset();
          i = j;
        } 
      } 
    } 
    if ((paramArrayOfbyte[paramArrayOfbyte.length - 1] & 0xFF) == 255) {
      logger.finest("Adding unsynchronisation bit at end of stream");
      byteArrayOutputStream.write(0);
    } 
    return byteArrayOutputStream.toByteArray();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3Unsynchronization.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */