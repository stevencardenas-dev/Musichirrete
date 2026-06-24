package org.jaudiotagger.audio.dsf;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import c61;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;

public class DsfFileReader extends AudioFileReader2 {
  private Tag readTag(FileChannel paramFileChannel, DsdChunk paramDsdChunk, String paramString) {
    if (paramDsdChunk.getMetadataOffset() > 0L) {
      paramFileChannel.position(paramDsdChunk.getMetadataOffset());
      if (paramFileChannel.size() - paramFileChannel.position() >= DsfChunkType.ID3.getCode().length()) {
        ID3Chunk iD3Chunk = ID3Chunk.readChunk(Utils.readFileDataIntoBufferLE(paramFileChannel, (int)(paramFileChannel.size() - paramFileChannel.position())));
        if (iD3Chunk != null) {
          StringBuilder stringBuilder3;
          byte b = iD3Chunk.getDataBuffer().get(3);
          if (b != 2) {
            if (b != 3) {
              if (b != 4)
                try {
                  Logger logger3 = AudioFileReader.logger;
                  Level level3 = Level.WARNING;
                  StringBuilder stringBuilder4 = new StringBuilder();
                  this();
                  stringBuilder4.append(paramString);
                  stringBuilder4.append(jLnXOLx.UXjO);
                  stringBuilder4.append(b);
                  stringBuilder4.append(". Returning an empty ID3v2 Tag.");
                  logger3.log(level3, stringBuilder4.toString());
                  return null;
                } catch (TagException tagException) {
                  stringBuilder3 = new StringBuilder();
                  stringBuilder3.append(paramString);
                  stringBuilder3.append(" Could not read ID3v2 tag:corruption");
                  throw new CannotReadException(stringBuilder3.toString());
                }  
              return (Tag)new ID3v24Tag(stringBuilder3.getDataBuffer(), paramString);
            } 
            return (Tag)new ID3v23Tag(stringBuilder3.getDataBuffer(), paramString);
          } 
          return (Tag)new ID3v22Tag(stringBuilder3.getDataBuffer(), paramString);
        } 
        Logger logger2 = AudioFileReader.logger;
        Level level2 = Level.WARNING;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(paramString);
        stringBuilder2.append(" No existing ID3 tag(1)");
        logger2.log(level2, stringBuilder2.toString());
        return null;
      } 
      Logger logger1 = AudioFileReader.logger;
      Level level1 = Level.WARNING;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString);
      stringBuilder1.append(" No existing ID3 tag(2)");
      logger1.log(level1, stringBuilder1.toString());
      return null;
    } 
    Logger logger = AudioFileReader.logger;
    Level level = Level.WARNING;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(" No existing ID3 tag(3)");
    logger.log(level, stringBuilder.toString());
    return null;
  }
  
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      DsdChunk dsdChunk = DsdChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, DsdChunk.DSD_HEADER_LENGTH));
      if (dsdChunk != null) {
        GenericAudioHeader genericAudioHeader;
        FmtChunk fmtChunk = FmtChunk.readChunkHeader(Utils.readFileDataIntoBufferLE(fileChannel, IffHeaderChunk.SIGNATURE_LENGTH + 8));
        if (fmtChunk != null) {
          genericAudioHeader = fmtChunk.readChunkData(dsdChunk, fileChannel);
          if (fileChannel != null)
            fileChannel.close(); 
          return genericAudioHeader;
        } 
        CannotReadException cannotReadException1 = new CannotReadException();
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(genericAudioHeader);
        stringBuilder1.append(" Not a valid dsf file. Content does not include 'fmt ' chunk");
        this(stringBuilder1.toString());
        throw cannotReadException1;
      } 
    } finally {}
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(paramc61);
    stringBuilder.append(" Not a valid dsf file. Content does not start with 'DSD '");
    this(stringBuilder.toString());
    throw cannotReadException;
  }
  
  public Tag getTag(c61 paramc61) {
    FileChannel fileChannel = paramc61.b("r");
    try {
      DsdChunk dsdChunk = DsdChunk.readChunk(Utils.readFileDataIntoBufferLE(fileChannel, DsdChunk.DSD_HEADER_LENGTH));
      if (dsdChunk != null) {
        Logger logger = AudioFileReader.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(paramc61);
        stringBuilder1.append(":actualFileSize:");
        stringBuilder1.append(fileChannel.size());
        stringBuilder1.append(":");
        stringBuilder1.append(dsdChunk.toString());
        logger.config(stringBuilder1.toString());
        Tag tag = readTag(fileChannel, dsdChunk, paramc61.toString());
        fileChannel.close();
        return tag;
      } 
    } finally {}
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(paramc61);
    stringBuilder.append(" Not a valid dsf file. Content does not start with 'DSD '.");
    this(stringBuilder.toString());
    throw cannotReadException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\DsfFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */