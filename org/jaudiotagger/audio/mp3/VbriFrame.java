package org.jaudiotagger.audio.mp3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;

public class VbriFrame {
  private static final int BYTE_1 = 0;
  
  private static final int BYTE_2 = 1;
  
  private static final int BYTE_3 = 2;
  
  private static final int BYTE_4 = 3;
  
  public static final int MAX_BUFFER_SIZE_NEEDED_TO_READ_VBRI = 156;
  
  private static final int VBRI_AUDIOSIZE_BUFFER_SIZE = 4;
  
  private static final int VBRI_FRAMECOUNT_BUFFER_SIZE = 4;
  
  private static final int VBRI_HEADER_BUFFER_SIZE = 120;
  
  private static final int VBRI_IDENTIFIER_BUFFER_SIZE = 4;
  
  private static final int VBRI_OFFSET = 36;
  
  private static final byte[] VBRI_VBR_ID = new byte[] { 86, 66, 82, 73 };
  
  public static int defaultVersion;
  
  private int audioSize = -1;
  
  private int frameCount = -1;
  
  private ByteBuffer header;
  
  private boolean vbr = false;
  
  private VbriFrame(ByteBuffer paramByteBuffer) {
    this.header = paramByteBuffer;
    paramByteBuffer.rewind();
    paramByteBuffer.position(10);
    setAudioSize();
    setFrameCount();
  }
  
  public static ByteBuffer isVbriFrame(ByteBuffer paramByteBuffer, MPEGFrameHeader paramMPEGFrameHeader) {
    int i = paramByteBuffer.position();
    Logger logger = AudioFile.logger;
    StringBuilder stringBuilder = new StringBuilder("Checking VBRI Frame at");
    stringBuilder.append(i);
    logger.finest(stringBuilder.toString());
    paramByteBuffer.position(i + 36);
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    paramByteBuffer.position(i);
    byte[] arrayOfByte = new byte[4];
    byteBuffer.get(arrayOfByte);
    if (!Arrays.equals(arrayOfByte, VBRI_VBR_ID))
      return null; 
    AudioFile.logger.finest("Found VBRI Frame");
    return byteBuffer;
  }
  
  public static VbriFrame parseVBRIFrame(ByteBuffer paramByteBuffer) {
    return new VbriFrame(paramByteBuffer);
  }
  
  private void setAudioSize() {
    byte[] arrayOfByte = new byte[4];
    this.header.get(arrayOfByte);
    byte b2 = arrayOfByte[0];
    byte b3 = arrayOfByte[1];
    byte b1 = arrayOfByte[2];
    this.audioSize = arrayOfByte[3] & 0xFF | b2 << 24 & 0xFF000000 | b3 << 16 & 0xFF0000 | b1 << 8 & 0xFF00;
  }
  
  private void setFrameCount() {
    byte[] arrayOfByte = new byte[4];
    this.header.get(arrayOfByte);
    byte b2 = arrayOfByte[0];
    byte b3 = arrayOfByte[1];
    byte b1 = arrayOfByte[2];
    this.frameCount = arrayOfByte[3] & 0xFF | b2 << 24 & 0xFF000000 | b3 << 16 & 0xFF0000 | b1 << 8 & 0xFF00;
  }
  
  public static void setVersion(int paramInt) {
    defaultVersion = paramInt + 4;
  }
  
  public final int getAudioSize() {
    return this.audioSize;
  }
  
  public String getEncoder() {
    return "Fraunhofer";
  }
  
  public final int getFrameCount() {
    return this.frameCount;
  }
  
  public final boolean isVbr() {
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("VBRIheader\n\tvbr:");
    stringBuilder.append(this.vbr);
    stringBuilder.append("\n\tframeCount:");
    stringBuilder.append(this.frameCount);
    stringBuilder.append("\n\taudioFileSize:");
    stringBuilder.append(this.audioSize);
    stringBuilder.append("\n\tencoder:");
    stringBuilder.append(getEncoder());
    stringBuilder.append("\n");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\VbriFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */