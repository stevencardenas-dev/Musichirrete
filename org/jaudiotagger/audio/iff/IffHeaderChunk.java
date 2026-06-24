package org.jaudiotagger.audio.iff;

import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.generic.Utils;
import uc1;

public class IffHeaderChunk {
  public static int FORM_HEADER_LENGTH;
  
  public static int SIGNATURE_LENGTH;
  
  public static int SIZE_LENGTH;
  
  public static int TYPE_LENGTH;
  
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.iff");
    logger = logger;
    logger.setLevel(Level.SEVERE);
    SIGNATURE_LENGTH = 4;
    SIZE_LENGTH = 4;
    TYPE_LENGTH = 4;
    FORM_HEADER_LENGTH = 4 + 4 + 4;
  }
  
  public static void ensureOnEqualBoundary(FileChannel paramFileChannel, ChunkHeader paramChunkHeader) {
    if (Utils.isOddLength(paramChunkHeader.getSize()) && paramFileChannel.position() < paramFileChannel.size()) {
      logger.config("Skipping Byte because on odd boundary");
      paramFileChannel.position(paramFileChannel.position() + 1L);
    } 
  }
  
  public static void ensureOnEqualBoundary(uc1 paramuc1, ChunkHeader paramChunkHeader) {
    if (Utils.isOddLength(paramChunkHeader.getSize()) && paramuc1.c() < paramuc1.d()) {
      logger.config("Skipping Byte because on odd boundary");
      paramuc1.skipBytes(1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\iff\IffHeaderChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */