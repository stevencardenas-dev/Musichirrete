package org.jaudiotagger.audio.wav.chunk;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.wav.WavSubFormat;
import wf2;

public class WavFormatChunk extends Chunk {
  private static final int EXTENSIBLE_DATA_SIZE = 22;
  
  public static Logger logger;
  
  private int blockAlign;
  
  private int channelMask;
  
  private GenericAudioHeader info;
  
  private boolean isValid = false;
  
  private WavSubFormat wsf;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav.chunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavFormatChunk(ByteBuffer paramByteBuffer, ChunkHeader paramChunkHeader, GenericAudioHeader paramGenericAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.info = paramGenericAudioHeader;
  }
  
  public boolean readChunk() {
    int i = Utils.u(this.chunkData.getShort());
    this.wsf = WavSubFormat.getByCode(Integer.valueOf(i));
    this.info.setChannelNumber(Utils.u(this.chunkData.getShort()));
    this.info.setSamplingRate(this.chunkData.getInt());
    this.info.setByteRate(this.chunkData.getInt());
    GenericAudioHeader genericAudioHeader1 = this.info;
    genericAudioHeader1.setBitRate(genericAudioHeader1.getByteRate().intValue() * Utils.BITS_IN_BYTE_MULTIPLIER / Utils.KILOBYTE_MULTIPLIER);
    this.info.setVariableBitRate(false);
    this.blockAlign = Utils.u(this.chunkData.getShort());
    this.info.setBitsPerSample(Utils.u(this.chunkData.getShort()));
    WavSubFormat wavSubFormat = this.wsf;
    if (wavSubFormat != null && wavSubFormat == WavSubFormat.FORMAT_EXTENSIBLE && Utils.u(this.chunkData.getShort()) == 22) {
      this.info.setBitsPerSample(Utils.u(this.chunkData.getShort()));
      this.channelMask = this.chunkData.getInt();
      this.wsf = WavSubFormat.getByCode(Integer.valueOf(Utils.u(this.chunkData.getShort())));
    } 
    wavSubFormat = this.wsf;
    GenericAudioHeader genericAudioHeader2 = this.info;
    if (wavSubFormat != null) {
      i = genericAudioHeader2.getBitsPerSample();
      genericAudioHeader2 = this.info;
      if (i > 0) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.wsf.getDescription());
        stringBuilder.append(" ");
        stringBuilder.append(this.info.getBitsPerSample());
        stringBuilder.append(" bits");
        genericAudioHeader2.setEncodingType(stringBuilder.toString());
      } else {
        genericAudioHeader2.setEncodingType(this.wsf.getDescription());
      } 
    } else {
      genericAudioHeader2.setEncodingType("Unknown Sub Format Code:".concat(wf2.e(i)));
    } 
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("RIFF-WAVE Header:\nIs valid?: ");
    stringBuilder.append(this.isValid);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavFormatChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */