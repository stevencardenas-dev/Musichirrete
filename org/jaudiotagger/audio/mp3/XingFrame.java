package org.jaudiotagger.audio.mp3;

import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jaudiotagger.audio.AudioFile;
import x41;

public class XingFrame {
  private static final int BYTE_1 = 0;
  
  private static final int BYTE_2 = 1;
  
  private static final int BYTE_3 = 2;
  
  private static final int BYTE_4 = 3;
  
  public static final int MAX_BUFFER_SIZE_NEEDED_TO_READ_XING = 192;
  
  private static final int MPEG_VERSION_1_MODE_MONO_OFFSET = 21;
  
  private static final int MPEG_VERSION_1_MODE_STEREO_OFFSET = 36;
  
  private static final int MPEG_VERSION_2_MODE_MONO_OFFSET = 13;
  
  private static final int MPEG_VERSION_2_MODE_STEREO_OFFSET = 21;
  
  private static final int XING_AUDIOSIZE_BUFFER_SIZE = 4;
  
  private static final byte[] XING_CBR_ID;
  
  private static final int XING_FLAG_BUFFER_SIZE = 4;
  
  private static final int XING_FRAMECOUNT_BUFFER_SIZE = 4;
  
  private static final int XING_HEADER_BUFFER_SIZE = 120;
  
  private static final int XING_IDENTIFIER_BUFFER_SIZE = 4;
  
  private static final byte[] XING_VBR_ID = new byte[] { 88, 105, 110, 103 };
  
  private int audioSize = -1;
  
  private int frameCount = -1;
  
  private ByteBuffer header;
  
  private boolean isAudioSizeEnabled = false;
  
  private boolean isFrameCountEnabled = false;
  
  private LameFrame lameFrame;
  
  private boolean vbr = false;
  
  static {
    XING_CBR_ID = new byte[] { 73, 110, 102, 111 };
  }
  
  private XingFrame(ByteBuffer paramByteBuffer) {
    this.header = paramByteBuffer;
    paramByteBuffer.rewind();
    setVbr();
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte);
    if ((arrayOfByte[3] & 0x1) != 0)
      setFrameCount(); 
    if ((arrayOfByte[3] & 0x2) != 0)
      setAudioSize(); 
    if (paramByteBuffer.limit() >= 156) {
      paramByteBuffer.position(120);
      this.lameFrame = LameFrame.parseLameFrame(paramByteBuffer);
    } 
  }
  
  public static ByteBuffer isXingFrame(ByteBuffer paramByteBuffer, MPEGFrameHeader paramMPEGFrameHeader) {
    int i = paramByteBuffer.position();
    if (paramMPEGFrameHeader.getVersion() == 3) {
      if (paramMPEGFrameHeader.getChannelMode() == 3) {
        paramByteBuffer.position(i + 21);
      } else {
        paramByteBuffer.position(i + 36);
      } 
    } else if (paramMPEGFrameHeader.getChannelMode() == 3) {
      paramByteBuffer.position(i + 13);
    } else {
      paramByteBuffer.position(i + 21);
    } 
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    paramByteBuffer.position(i);
    byte[] arrayOfByte = new byte[4];
    byteBuffer.get(arrayOfByte);
    if (!Arrays.equals(arrayOfByte, XING_VBR_ID) && !Arrays.equals(arrayOfByte, XING_CBR_ID))
      return null; 
    AudioFile.logger.finest("Found Xing Frame");
    return byteBuffer;
  }
  
  public static XingFrame parseXingFrame(ByteBuffer paramByteBuffer) {
    return new XingFrame(paramByteBuffer);
  }
  
  private void setAudioSize() {
    byte[] arrayOfByte = new byte[4];
    this.header.get(arrayOfByte);
    this.isAudioSizeEnabled = true;
    byte b2 = arrayOfByte[0];
    byte b3 = arrayOfByte[1];
    byte b1 = arrayOfByte[2];
    this.audioSize = arrayOfByte[3] & 0xFF | b3 << 16 & 0xFF0000 | b2 << 24 & 0xFF000000 | b1 << 8 & 0xFF00;
  }
  
  private void setFrameCount() {
    byte[] arrayOfByte = new byte[4];
    this.header.get(arrayOfByte);
    this.isFrameCountEnabled = true;
    byte b1 = arrayOfByte[0];
    byte b3 = arrayOfByte[1];
    byte b2 = arrayOfByte[2];
    this.frameCount = arrayOfByte[3] & 0xFF | b3 << 16 & 0xFF0000 | b1 << 24 & 0xFF000000 | b2 << 8 & 0xFF00;
  }
  
  private void setVbr() {
    byte[] arrayOfByte = new byte[4];
    this.header.get(arrayOfByte);
    if (Arrays.equals(arrayOfByte, XING_VBR_ID)) {
      AudioFile.logger.finest("Is Vbr");
      this.vbr = true;
    } 
  }
  
  public final int getAudioSize() {
    return this.audioSize;
  }
  
  public final int getFrameCount() {
    return this.frameCount;
  }
  
  public LameFrame getLameFrame() {
    return this.lameFrame;
  }
  
  public final boolean isAudioSizeEnabled() {
    return this.isAudioSizeEnabled;
  }
  
  public final boolean isFrameCountEnabled() {
    return this.isFrameCountEnabled;
  }
  
  public final boolean isVbr() {
    return this.vbr;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Xing Header+\n\tvbr:");
    stringBuilder.append(this.vbr);
    stringBuilder.append("\n\tframeCountEnabled:");
    stringBuilder.append(this.isFrameCountEnabled);
    stringBuilder.append("\n\tframeCount:");
    stringBuilder.append(this.frameCount);
    stringBuilder.append("\n\taudioSizeEnabled:");
    stringBuilder.append(this.isAudioSizeEnabled);
    stringBuilder.append(OETETTfAjV.udecNaR);
    return x41.m(stringBuilder, this.audioSize, "\n");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\XingFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */