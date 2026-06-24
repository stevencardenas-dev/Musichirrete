package org.jaudiotagger.audio.aiff;

import c61;
import in.krosbits.utils.SgV.zpEN;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkReader;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkType;
import org.jaudiotagger.audio.aiff.chunk.AnnotationChunk;
import org.jaudiotagger.audio.aiff.chunk.ApplicationChunk;
import org.jaudiotagger.audio.aiff.chunk.AuthorChunk;
import org.jaudiotagger.audio.aiff.chunk.CommentsChunk;
import org.jaudiotagger.audio.aiff.chunk.CommonChunk;
import org.jaudiotagger.audio.aiff.chunk.CopyrightChunk;
import org.jaudiotagger.audio.aiff.chunk.FormatVersionChunk;
import org.jaudiotagger.audio.aiff.chunk.NameChunk;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import wf2;

public class AiffInfoReader extends AiffChunkReader {
  public static Logger logger;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.aiff");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public AiffInfoReader(String paramString) {
    this.loggingName = paramString;
  }
  
  private void calculateBitRate(GenericAudioHeader paramGenericAudioHeader) {
    if (paramGenericAudioHeader.getAudioDataLength() != null)
      paramGenericAudioHeader.setBitRate((int)Math.round((paramGenericAudioHeader.getAudioDataLength().longValue() * Utils.BITS_IN_BYTE_MULTIPLIER) / paramGenericAudioHeader.getPreciseTrackLength() * Utils.KILOBYTE_MULTIPLIER)); 
  }
  
  private Chunk createChunk(FileChannel paramFileChannel, ChunkHeader paramChunkHeader, AiffAudioHeader paramAiffAudioHeader) {
    AiffChunkType aiffChunkType = AiffChunkType.get(paramChunkHeader.getID());
    if (aiffChunkType != null) {
      long l;
      switch (aiffChunkType) {
        default:
          return null;
        case null:
          paramAiffAudioHeader.setAudioDataLength(paramChunkHeader.getSize());
          paramAiffAudioHeader.setAudioDataStartPosition(Long.valueOf(paramFileChannel.position()));
          l = paramFileChannel.position();
          paramAiffAudioHeader.setAudioDataEndPosition(Long.valueOf(paramChunkHeader.getSize() + l));
          return null;
        case null:
          return (Chunk)new AnnotationChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new CopyrightChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new AuthorChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new NameChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new CommentsChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new CommonChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          return (Chunk)new ApplicationChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
        case null:
          break;
      } 
      return (Chunk)new FormatVersionChunk(paramChunkHeader, readChunkDataIntoBuffer(paramFileChannel, paramChunkHeader), paramAiffAudioHeader);
    } 
    return null;
  }
  
  private boolean readChunk(FileChannel paramFileChannel, AiffAudioHeader paramAiffAudioHeader) {
    Logger logger1;
    String str;
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.BIG_ENDIAN);
    if (!chunkHeader.readHeader(paramFileChannel))
      return false; 
    Logger logger2 = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.loggingName);
    stringBuilder.append(":Reading Next Chunk:");
    stringBuilder.append(chunkHeader.getID());
    stringBuilder.append(zpEN.wLrXceaPbph);
    stringBuilder.append(wf2.c(chunkHeader.getStartLocationInFile()));
    stringBuilder.append(":sizeIncHeader:");
    stringBuilder.append(wf2.c(chunkHeader.getSize() + 8L));
    stringBuilder.append(JkpGFvCVQHzgc.GnniIa);
    long l = chunkHeader.getStartLocationInFile();
    stringBuilder.append(wf2.c(chunkHeader.getSize() + l + 8L));
    logger2.config(stringBuilder.toString());
    Chunk chunk = createChunk(paramFileChannel, chunkHeader, paramAiffAudioHeader);
    if (chunk != null) {
      if (!chunk.readChunk()) {
        logger1 = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(":ChunkReadFail:");
        stringBuilder1.append(chunkHeader.getID());
        logger1.severe(stringBuilder1.toString());
        return false;
      } 
    } else {
      if (chunkHeader.getSize() > 0L) {
        l = logger1.position();
        logger1.position(chunkHeader.getSize() + l);
        IffHeaderChunk.ensureOnEqualBoundary((FileChannel)logger1, chunkHeader);
        return true;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.loggingName);
      stringBuilder1.append(":Not a valid header, unable to read a sensible size:Header");
      stringBuilder1.append(chunkHeader.getID());
      stringBuilder1.append("Size:");
      stringBuilder1.append(chunkHeader.getSize());
      str = stringBuilder1.toString();
      logger.severe(str);
      throw new CannotReadException(str);
    } 
    IffHeaderChunk.ensureOnEqualBoundary((FileChannel)str, chunkHeader);
    return true;
  }
  
  public GenericAudioHeader read(c61 paramc61) {
    AiffAudioHeader aiffAudioHeader;
    FileChannel fileChannel = paramc61.b("r");
    try {
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(this.loggingName);
      stringBuilder.append(":Reading AIFF file size:");
      stringBuilder.append(wf2.c(fileChannel.size()));
      logger.config(stringBuilder.toString());
      aiffAudioHeader = new AiffAudioHeader();
      this();
      AiffFileHeader aiffFileHeader = new AiffFileHeader();
      this(this.loggingName);
      long l = aiffFileHeader.readHeader(fileChannel, aiffAudioHeader);
      while (fileChannel.position() < 8L + l && fileChannel.position() < fileChannel.size()) {
        if (!readChunk(fileChannel, aiffAudioHeader)) {
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
    if (aiffAudioHeader.getFileType() == AiffType.AIFC) {
      aiffAudioHeader.setFormat(SupportedFileFormat.AIF.getDisplayName());
    } else {
      aiffAudioHeader.setFormat(SupportedFileFormat.AIF.getDisplayName());
    } 
    calculateBitRate(aiffAudioHeader);
    fileChannel.close();
    return aiffAudioHeader;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffInfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */