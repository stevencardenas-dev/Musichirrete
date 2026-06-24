package org.jaudiotagger.audio.wav.chunk;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.wav.WavChunkType;
import org.jaudiotagger.tag.wav.WavInfoTag;
import org.jaudiotagger.tag.wav.WavTag;

public class WavListChunk extends Chunk {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav.chunk.WavListChunk");
  
  private boolean isValid = false;
  
  private String loggingName;
  
  private WavTag tag;
  
  public WavListChunk(String paramString, ByteBuffer paramByteBuffer, ChunkHeader paramChunkHeader, WavTag paramWavTag) {
    super(paramByteBuffer, paramChunkHeader);
    this.tag = paramWavTag;
    this.loggingName = paramString;
  }
  
  public boolean readChunk() {
    String str = Utils.readFourBytesAsChars(this.chunkData);
    if (str.equals(WavChunkType.INFO.getCode())) {
      boolean bool = (new WavInfoChunk(this.tag, this.loggingName)).readChunks(this.chunkData);
      this.tag.getInfoTag().setStartLocationInFile(this.chunkHeader.getStartLocationInFile());
      WavInfoTag wavInfoTag = this.tag.getInfoTag();
      long l = this.chunkHeader.getStartLocationInFile();
      wavInfoTag.setEndLocationInFile(this.chunkHeader.getSize() + l + 8L);
      this.tag.setExistingInfoTag(true);
      return bool;
    } 
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("LIST chunk does not contain INFO instead contains ");
    stringBuilder.append(str);
    stringBuilder.append(" so skipping");
    logger.severe(stringBuilder.toString());
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("RIFF-WAVE Header:\nIs valid?: ");
    stringBuilder.append(this.isValid);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavListChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */