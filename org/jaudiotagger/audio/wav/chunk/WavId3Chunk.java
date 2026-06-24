package org.jaudiotagger.audio.wav.chunk;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import org.jaudiotagger.tag.wav.WavTag;

public class WavId3Chunk extends Chunk {
  public static Logger logger;
  
  private String loggingName;
  
  private WavTag wavTag;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav.chunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavId3Chunk(ByteBuffer paramByteBuffer, ChunkHeader paramChunkHeader, WavTag paramWavTag, String paramString) {
    super(paramByteBuffer, paramChunkHeader);
    this.wavTag = paramWavTag;
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
    if (!isId3v2Tag(this.chunkData)) {
      logger.severe("Invalid ID3 header for ID3 chunk");
      return false;
    } 
    byte b = this.chunkData.get();
    if (b != 2) {
      if (b != 3) {
        if (b != 4)
          return false; 
        ID3v24Tag iD3v24Tag = new ID3v24Tag();
        iD3v24Tag.setLoggingFilename(this.loggingName);
      } else {
        ID3v23Tag iD3v23Tag = new ID3v23Tag();
        iD3v23Tag.setLoggingFilename(this.loggingName);
      } 
    } else {
      iD3v22Tag = new ID3v22Tag();
      iD3v22Tag.setLoggingFilename(this.loggingName);
    } 
    iD3v22Tag.setStartLocationInFile(this.chunkHeader.getStartLocationInFile() + 8L);
    long l = this.chunkHeader.getStartLocationInFile();
    iD3v22Tag.setEndLocationInFile(this.chunkHeader.getSize() + l + 8L);
    this.wavTag.setExistingId3Tag(true);
    this.wavTag.setID3Tag((AbstractID3v2Tag)iD3v22Tag);
    this.chunkData.position(0);
    try {
      iD3v22Tag.read(this.chunkData);
      return true;
    } catch (TagException tagException) {
      Logger logger = AudioFile.logger;
      StringBuilder stringBuilder = new StringBuilder("Exception reading ID3 tag: ");
      stringBuilder.append(tagException.getClass().getName());
      stringBuilder.append(": ");
      stringBuilder.append(tagException.getMessage());
      logger.info(stringBuilder.toString());
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavId3Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */