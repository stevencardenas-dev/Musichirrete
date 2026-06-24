package org.jaudiotagger.audio.wav;

import c61;
import ga1;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import wf2;
import x41;

public class WavCleaner {
  public static Logger logger;
  
  private String loggingName;
  
  private c61 path;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavCleaner(c61 paramc61) {
    this.path = paramc61;
    this.loggingName = paramc61.toString();
  }
  
  private int findEndOfDataChunk() {
    FileChannel fileChannel = this.path.b("wr");
    try {
      if (WavRIFFHeader.isValidHeader(this.loggingName, fileChannel))
        while (fileChannel.position() < fileChannel.size()) {
          int i = readChunk(fileChannel);
          if (i > 0) {
            fileChannel.truncate(fileChannel.position());
            fileChannel.close();
            return i;
          } 
        }  
    } finally {
      Exception exception;
    } 
    if (fileChannel != null)
      fileChannel.close(); 
    return 0;
  }
  
  private int readChunk(FileChannel paramFileChannel) {
    String str1;
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    if (!chunkHeader.readHeader(paramFileChannel))
      return 0; 
    String str2 = chunkHeader.getID();
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    x41.v(stringBuilder, this.loggingName, " Reading Chunk:", str2, ":starting at:");
    stringBuilder.append(wf2.c(chunkHeader.getStartLocationInFile()));
    stringBuilder.append(":sizeIncHeader:");
    stringBuilder.append(chunkHeader.getSize() + 8L);
    logger.config(stringBuilder.toString());
    WavChunkType wavChunkType = WavChunkType.get(str2);
    if (wavChunkType != null) {
      if (null.$SwitchMap$org$jaudiotagger$audio$wav$WavChunkType[wavChunkType.ordinal()] != 1) {
        Logger logger1 = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(" Skipping chunk bytes:");
        stringBuilder1.append(chunkHeader.getSize());
        logger1.config(stringBuilder1.toString());
        long l = paramFileChannel.position();
        paramFileChannel.position(chunkHeader.getSize() + l);
      } else {
        long l = paramFileChannel.position();
        paramFileChannel.position(chunkHeader.getSize() + l);
        return (int)paramFileChannel.position();
      } 
    } else {
      StringBuilder stringBuilder2;
      long l = chunkHeader.getSize();
      String str = this.loggingName;
      if (l >= 0L) {
        Logger logger1 = logger;
        stringBuilder2 = ga1.l(str, " Skipping chunk bytes:");
        stringBuilder2.append(chunkHeader.getSize());
        stringBuilder2.append(" for");
        stringBuilder2.append(chunkHeader.getID());
        logger1.severe(stringBuilder2.toString());
        l = paramFileChannel.position();
        paramFileChannel.position(chunkHeader.getSize() + l);
        IffHeaderChunk.ensureOnEqualBoundary(paramFileChannel, chunkHeader);
        return 0;
      } 
      StringBuilder stringBuilder1 = ga1.l((String)stringBuilder2, " Not a valid header, unable to read a sensible size:Header");
      stringBuilder1.append(chunkHeader.getID());
      stringBuilder1.append("Size:");
      stringBuilder1.append(chunkHeader.getSize());
      str1 = stringBuilder1.toString();
      logger.severe(str1);
      throw new CannotReadException(str1);
    } 
    IffHeaderChunk.ensureOnEqualBoundary((FileChannel)str1, chunkHeader);
    return 0;
  }
  
  public void clean() {
    System.out.println("EndOfDataChunk:".concat(wf2.e(findEndOfDataChunk())));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavCleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */