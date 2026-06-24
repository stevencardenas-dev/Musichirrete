package org.jaudiotagger.audio.dsf;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.Utils;

public class ID3Chunk {
  public static Logger logger;
  
  private ByteBuffer dataBuffer;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.generic.ID3Chunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public ID3Chunk(ByteBuffer paramByteBuffer) {
    this.dataBuffer = paramByteBuffer;
  }
  
  public static ID3Chunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readThreeBytesAsChars(paramByteBuffer);
    if (DsfChunkType.ID3.getCode().equals(str))
      return new ID3Chunk(paramByteBuffer); 
    Logger logger = logger;
    Level level = Level.WARNING;
    StringBuilder stringBuilder = new StringBuilder("Invalid type:");
    stringBuilder.append(str);
    stringBuilder.append(" where expected ID3 tag");
    logger.log(level, stringBuilder.toString());
    return null;
  }
  
  public ByteBuffer getDataBuffer() {
    return this.dataBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\ID3Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */