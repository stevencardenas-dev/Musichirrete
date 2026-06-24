package org.jaudiotagger.audio.aiff;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import c61;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkReader;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkType;
import org.jaudiotagger.audio.aiff.chunk.ID3Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.tag.aiff.AiffTag;
import wf2;

public class AiffTagReader extends AiffChunkReader {
  public static Logger logger;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger(jLnXOLx.OHPAbCk);
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public AiffTagReader(String paramString) {
    this.loggingName = paramString;
  }
  
  private boolean readChunk(FileChannel paramFileChannel, AiffTag paramAiffTag) {
    Logger logger1;
    StringBuilder stringBuilder1;
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.BIG_ENDIAN);
    if (!chunkHeader.readHeader(paramFileChannel))
      return false; 
    Logger logger2 = logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(this.loggingName);
    stringBuilder2.append(":Reading Chunk:");
    stringBuilder2.append(chunkHeader.getID());
    stringBuilder2.append(":starting at:");
    stringBuilder2.append(wf2.c(chunkHeader.getStartLocationInFile()));
    stringBuilder2.append(":sizeIncHeader:");
    stringBuilder2.append(chunkHeader.getSize() + 8L);
    logger2.config(stringBuilder2.toString());
    long l = paramFileChannel.position();
    AiffChunkType aiffChunkType = AiffChunkType.get(chunkHeader.getID());
    if (aiffChunkType != null && aiffChunkType == AiffChunkType.TAG && chunkHeader.getSize() > 0L) {
      ByteBuffer byteBuffer = readChunkDataIntoBuffer(paramFileChannel, chunkHeader);
      paramAiffTag.addChunkSummary(new ChunkSummary(chunkHeader.getID(), chunkHeader.getStartLocationInFile(), chunkHeader.getSize()));
      if (paramAiffTag.getID3Tag() == null) {
        (new ID3Chunk(chunkHeader, byteBuffer, paramAiffTag, this.loggingName)).readChunk();
        paramAiffTag.setExistingId3Tag(true);
        paramAiffTag.getID3Tag().setStartLocationInFile(l);
        paramAiffTag.getID3Tag().setEndLocationInFile(paramFileChannel.position());
      } else {
        logger1 = logger;
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(":Ignoring ID3Tag because already have one:");
        stringBuilder1.append(chunkHeader.getID());
        stringBuilder1.append(":");
        stringBuilder1.append(chunkHeader.getStartLocationInFile());
        stringBuilder1.append(":");
        stringBuilder1.append(wf2.c(chunkHeader.getStartLocationInFile() - 1L));
        stringBuilder1.append(":sizeIncHeader:");
        stringBuilder1.append(chunkHeader.getSize() + 8L);
        logger1.warning(stringBuilder1.toString());
      } 
    } else {
      if (stringBuilder1 != null && stringBuilder1 == AiffChunkType.CORRUPT_TAG_LATE) {
        logger = logger;
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.loggingName);
        stringBuilder2.append(":Found Corrupt ID3 Chunk, starting at Odd Location:");
        stringBuilder2.append(chunkHeader.getID());
        stringBuilder2.append(":");
        stringBuilder2.append(wf2.c(chunkHeader.getStartLocationInFile() - 1L));
        stringBuilder2.append(":sizeIncHeader:");
        stringBuilder2.append(chunkHeader.getSize() + 8L);
        logger.warning(stringBuilder2.toString());
        if (logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        paramFileChannel.position(paramFileChannel.position() - 9L);
        return true;
      } 
      if (logger != null && logger == AiffChunkType.CORRUPT_TAG_EARLY) {
        Logger logger3 = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(":Found Corrupt ID3 Chunk, starting at Odd Location:");
        stringBuilder.append(chunkHeader.getID());
        stringBuilder.append(":");
        stringBuilder.append(wf2.c(chunkHeader.getStartLocationInFile()));
        stringBuilder.append(":sizeIncHeader:");
        stringBuilder.append(chunkHeader.getSize() + 8L);
        logger3.warning(stringBuilder.toString());
        if (logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        paramFileChannel.position(paramFileChannel.position() - 7L);
        return true;
      } 
      Logger logger = logger;
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(this.loggingName);
      stringBuilder2.append(":Skipping Chunk:");
      stringBuilder2.append(chunkHeader.getID());
      stringBuilder2.append(":");
      stringBuilder2.append(chunkHeader.getSize());
      logger.config(stringBuilder2.toString());
      logger1.addChunkSummary(new ChunkSummary(chunkHeader.getID(), chunkHeader.getStartLocationInFile(), chunkHeader.getSize()));
      l = paramFileChannel.position();
      paramFileChannel.position(chunkHeader.getSize() + l);
    } 
    IffHeaderChunk.ensureOnEqualBoundary(paramFileChannel, chunkHeader);
    return true;
  }
  
  public AiffTag read(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      AiffAudioHeader aiffAudioHeader = new AiffAudioHeader();
      this();
      aiffTag = new AiffTag();
      this();
      AiffFileHeader aiffFileHeader = new AiffFileHeader();
      this(paramc61.toString());
      l = aiffFileHeader.readHeader(fileChannel, aiffAudioHeader);
      aiffTag.setFormSize(l);
      aiffTag.setFileSize(fileChannel.size());
      l += 8L;
      while (fileChannel.position() < l && fileChannel.position() < fileChannel.size()) {
        if (!readChunk(fileChannel, aiffTag)) {
          Logger logger1 = logger;
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append(paramc61);
          stringBuilder1.append(":UnableToReadProcessChunk");
          logger1.severe(stringBuilder1.toString());
          break;
        } 
      } 
    } finally {}
    if (aiffTag.getID3Tag() == null)
      aiffTag.setID3Tag(AiffTag.createDefaultID3Tag()); 
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    this();
    long l;
    AiffTag aiffTag;
    stringBuilder.append("LastChunkPos:");
    stringBuilder.append(wf2.c(fileChannel.position()));
    stringBuilder.append(":OfficialEndLocation:");
    stringBuilder.append(wf2.c(l));
    logger.config(stringBuilder.toString());
    if (fileChannel.position() > l)
      aiffTag.setLastChunkSizeExtendsPastFormSize(true); 
    fileChannel.close();
    return aiffTag;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffTagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */