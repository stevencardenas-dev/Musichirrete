package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jaudiotagger.audio.generic.Utils;

public class Mp4MvhdBox extends AbstractMp4Box {
  public static final int CREATED_DATE_LONG_LENGTH = 8;
  
  public static final int CREATED_DATE_LONG_POS = 4;
  
  public static final int CREATED_DATE_SHORT_LENGTH = 4;
  
  public static final int CREATED_DATE_SHORT_POS = 4;
  
  public static final int DURATION_LONG_LENGTH = 8;
  
  public static final int DURATION_LONG_POS = 24;
  
  public static final int DURATION_SHORT_LENGTH = 4;
  
  public static final int DURATION_SHORT_POS = 16;
  
  private static final int LONG_FORMAT = 1;
  
  public static final int MODIFIED_DATE_LONG_LENGTH = 8;
  
  public static final int MODIFIED_DATE_LONG_POS = 12;
  
  public static final int MODIFIED_DATE_SHORT_LENGTH = 4;
  
  public static final int MODIFIED_DATE_SHORT_POS = 8;
  
  public static final int OTHER_FLAG_LENGTH = 3;
  
  public static final int OTHER_FLAG_POS = 1;
  
  public static final int TIMESCALE_LENGTH = 4;
  
  public static final int TIMESCALE_LONG_POS = 20;
  
  public static final int TIMESCALE_SHORT_POS = 12;
  
  public static final int VERSION_FLAG_LENGTH = 1;
  
  public static final int VERSION_FLAG_POS = 0;
  
  private long timeLength;
  
  private int timeScale;
  
  public Mp4MvhdBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    if (paramByteBuffer.get(0) == 1) {
      this.timeScale = paramByteBuffer.getInt(20);
      this.timeLength = paramByteBuffer.getLong(24);
      return;
    } 
    this.timeScale = paramByteBuffer.getInt(12);
    this.timeLength = Utils.u(paramByteBuffer.getInt(16));
  }
  
  public int getLength() {
    return (int)(this.timeLength / this.timeScale);
  }
  
  public double getPreciseLength() {
    return this.timeLength / this.timeScale;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4MvhdBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */