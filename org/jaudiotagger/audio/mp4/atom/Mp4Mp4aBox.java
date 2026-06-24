package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;

public class Mp4Mp4aBox extends AbstractMp4Box {
  public static final int AUDIO_COMPRESSION_ID_LENGTH = 2;
  
  public static final int AUDIO_COMPRESSION_ID_POS = 20;
  
  public static final int AUDIO_ENCODING_LENGTH = 2;
  
  public static final int AUDIO_ENCODING_POS = 8;
  
  public static final int AUDIO_ENCODING_VENDOR_LENGTH = 4;
  
  public static final int AUDIO_ENCODING_VENDOR_POS = 12;
  
  public static final int AUDIO_PACKET_SIZE_LENGTH = 2;
  
  public static final int AUDIO_PACKET_SIZE_POS = 22;
  
  public static final int AUDIO_REVISION_LENGTH = 2;
  
  public static final int AUDIO_REVISION_POS = 10;
  
  public static final int AUDIO_SAMPLE_RATE_LENGTH = 4;
  
  public static final int AUDIO_SAMPLE_RATE_POS = 24;
  
  public static final int AUDIO_SAMPLE_SIZE_LENGTH = 2;
  
  public static final int AUDIO_SAMPLE_SIZE_POS = 18;
  
  public static final int CHANNELS_LENGTH = 2;
  
  public static final int CHANNELS_POS = 16;
  
  public static final int REFERENCE_INDEX_LENGTH = 2;
  
  public static final int REFERENCE_INDEX_POS = 6;
  
  public static final int RESERVED_LENGTH = 6;
  
  public static final int RESERVED_POS = 0;
  
  public static final int TOTAL_LENGTH = 28;
  
  public Mp4Mp4aBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
  }
  
  public void processData() {
    ByteBuffer byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 28);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4Mp4aBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */