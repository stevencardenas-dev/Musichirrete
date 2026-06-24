package org.jaudiotagger.audio.aiff;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AiffUtil {
  private static final SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  
  public static String formatDate(Date paramDate) {
    return dateFmt.format(paramDate);
  }
  
  public static double read80BitDouble(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[10];
    paramByteBuffer.get(arrayOfByte);
    return (new ExtDouble(arrayOfByte)).toDouble();
  }
  
  public static Date timestampToDate(long paramLong) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(1904, 0, 1, 0, 0, 0);
    int j = (int)(paramLong / 3600L);
    int i = (int)(paramLong - j * 3600L);
    calendar.add(11, j);
    calendar.add(13, i);
    return calendar.getTime();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */