package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.aiff.AiffTag;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;

public class ID3Chunk extends Chunk {
  public static Logger logger;
  
  private AiffTag aiffTag;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.aiff.chunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public ID3Chunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffTag paramAiffTag, String paramString) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffTag = paramAiffTag;
    this.loggingName = paramString;
  }
  
  private boolean isId3v2Tag(ByteBuffer paramByteBuffer) {
    for (byte b = 0; b < 3; b++) {
      if (paramByteBuffer.get() != AbstractID3v2Tag.TAG_ID[b])
        return false; 
    } 
    return true;
  }
  
  public boolean readChunk() {
    ID3v22Tag iD3v22Tag;
    Logger logger = AudioFile.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.loggingName);
    stringBuilder.append(":Reading chunk");
    logger.config(stringBuilder.toString());
    if (!isId3v2Tag(this.chunkData)) {
      Logger logger1 = logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.loggingName);
      stringBuilder1.append(":Invalid ID3 header for ID3 chunk");
      logger1.severe(stringBuilder1.toString());
      return false;
    } 
    byte b = this.chunkData.get();
    if (b != 2) {
      if (b != 3) {
        if (b != 4)
          return false; 
        ID3v24Tag iD3v24Tag = new ID3v24Tag();
        logger = AudioFile.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(":Reading ID3V2.4 tag");
        logger.config(stringBuilder1.toString());
      } else {
        ID3v23Tag iD3v23Tag = new ID3v23Tag();
        Logger logger1 = AudioFile.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(":Reading ID3V2.3 tag");
        logger1.config(stringBuilder1.toString());
      } 
    } else {
      iD3v22Tag = new ID3v22Tag();
      logger = AudioFile.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.loggingName);
      stringBuilder1.append(":Reading ID3V2.2 tag");
      logger.config(stringBuilder1.toString());
    } 
    this.aiffTag.setID3Tag((AbstractID3v2Tag)iD3v22Tag);
    this.chunkData.position(0);
    try {
      iD3v22Tag.read(this.chunkData);
      return true;
    } catch (TagException tagException) {
      Logger logger1 = AudioFile.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.loggingName);
      stringBuilder1.append(":Exception reading ID3 tag: ");
      stringBuilder1.append(tagException.getClass().getName());
      stringBuilder1.append(": ");
      stringBuilder1.append(tagException.getMessage());
      logger1.severe(stringBuilder1.toString());
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\ID3Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */