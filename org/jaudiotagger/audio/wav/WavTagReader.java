package org.jaudiotagger.audio.wav;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import c61;
import ga1;
import in.krosbits.utils.SgV.YbNJ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.BadChunkSummary;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.audio.iff.PaddingChunkSummary;
import org.jaudiotagger.audio.wav.chunk.WavCorruptChunkType;
import org.jaudiotagger.audio.wav.chunk.WavId3Chunk;
import org.jaudiotagger.audio.wav.chunk.WavListChunk;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.wav.WavInfoTag;
import org.jaudiotagger.tag.wav.WavTag;
import wf2;
import x41;

public class WavTagReader {
  public static Logger logger;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavTagReader(String paramString) {
    this.loggingName = paramString;
  }
  
  private void createDefaultMetadataTagsIfMissing(WavTag paramWavTag) {
    if (!paramWavTag.isExistingId3Tag())
      paramWavTag.setID3Tag(WavTag.createDefaultID3Tag()); 
    if (!paramWavTag.isExistingInfoTag())
      paramWavTag.setInfoTag(new WavInfoTag()); 
  }
  
  public WavTag read(c61 paramc61) {
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(this.loggingName);
    stringBuilder2.append(" Read Tag:start");
    logger.config(stringBuilder2.toString());
    WavTag wavTag = new WavTag(TagOptionSingleton.getInstance().getWavOptions());
    FileChannel fileChannel = paramc61.b("r");
    try {
      if (WavRIFFHeader.isValidHeader(this.loggingName, fileChannel)) {
        while (fileChannel.position() < fileChannel.size()) {
          boolean bool = readChunk(fileChannel, wavTag);
          if (!bool)
            break; 
        } 
        fileChannel.close();
        createDefaultMetadataTagsIfMissing(wavTag);
        Logger logger1 = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(" Read Tag:end");
        logger1.config(stringBuilder.toString());
        return wavTag;
      } 
    } finally {}
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder1 = new StringBuilder();
    this();
    stringBuilder1.append(this.loggingName);
    stringBuilder1.append(" Wav RIFF Header not valid");
    this(stringBuilder1.toString());
    throw cannotReadException;
  }
  
  public boolean readChunk(FileChannel paramFileChannel, WavTag paramWavTag) {
    StringBuilder stringBuilder1;
    Logger logger1;
    StringBuilder stringBuilder2;
    StringBuilder stringBuilder3;
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    if (!chunkHeader.readHeader(paramFileChannel))
      return false; 
    String str = chunkHeader.getID();
    Logger logger2 = logger;
    StringBuilder stringBuilder4 = new StringBuilder();
    x41.v(stringBuilder4, this.loggingName, " Reading Chunk:", str, ":starting at:");
    stringBuilder4.append(wf2.c(chunkHeader.getStartLocationInFile()));
    stringBuilder4.append(":sizeIncHeader:");
    stringBuilder4.append(chunkHeader.getSize() + 8L);
    logger2.info(stringBuilder4.toString());
    WavChunkType wavChunkType = WavChunkType.get(str);
    if (wavChunkType != null) {
      Logger logger;
      int i = null.$SwitchMap$org$jaudiotagger$audio$wav$WavChunkType[wavChunkType.ordinal()];
      if (i != 1) {
        StringBuilder stringBuilder;
        if (i != 2) {
          if (i != 3) {
            paramWavTag.addChunkSummary(new ChunkSummary(chunkHeader.getID(), chunkHeader.getStartLocationInFile(), chunkHeader.getSize()));
            long l = paramFileChannel.position();
            paramFileChannel.position(chunkHeader.getSize() + l);
          } else {
            ChunkSummary chunkSummary = new ChunkSummary(chunkHeader.getID(), chunkHeader.getStartLocationInFile(), chunkHeader.getSize());
            paramWavTag.addChunkSummary(chunkSummary);
            paramWavTag.addMetadataChunkSummary(chunkSummary);
            if (paramWavTag.getID3Tag() == null) {
              if (!(new WavId3Chunk(Utils.readFileDataIntoBufferLE(paramFileChannel, (int)chunkHeader.getSize()), chunkHeader, paramWavTag, this.loggingName)).readChunk()) {
                logger1 = logger;
                stringBuilder1 = new StringBuilder();
                stringBuilder1.append(this.loggingName);
                stringBuilder1.append(" id3 readChunkFailed");
                logger1.severe(stringBuilder1.toString());
                return false;
              } 
            } else {
              long l = stringBuilder1.position();
              stringBuilder1.position(chunkHeader.getSize() + l);
              Logger logger3 = logger;
              stringBuilder = new StringBuilder();
              stringBuilder.append(this.loggingName);
              stringBuilder.append(" Ignoring id3 chunk because already have one:");
              stringBuilder.append(chunkHeader.getID());
              stringBuilder.append(":");
              stringBuilder.append(wf2.c(chunkHeader.getStartLocationInFile()));
              stringBuilder.append(":sizeIncHeader:");
              stringBuilder.append(chunkHeader.getSize() + 8L);
              logger3.warning(stringBuilder.toString());
            } 
          } 
        } else {
          ChunkSummary chunkSummary = new ChunkSummary(chunkHeader.getID(), chunkHeader.getStartLocationInFile(), chunkHeader.getSize());
          stringBuilder.addChunkSummary(chunkSummary);
          stringBuilder.addMetadataChunkSummary(chunkSummary);
          if (stringBuilder.getID3Tag() == null) {
            boolean bool = (new WavId3Chunk(Utils.readFileDataIntoBufferLE((FileChannel)stringBuilder1, (int)chunkHeader.getSize()), chunkHeader, (WavTag)stringBuilder, this.loggingName)).readChunk();
            String str1 = this.loggingName;
            if (!bool) {
              logger = logger;
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append(str1);
              stringBuilder2.append(" ID3 readChunkFailed");
              logger.severe(stringBuilder2.toString());
              return false;
            } 
            Logger logger3 = logger;
            StringBuilder stringBuilder5 = ga1.l(str1, " ID3 chunk should be id3:");
            stringBuilder5.append(stringBuilder2.getID());
            stringBuilder5.append(":");
            stringBuilder5.append(wf2.c(stringBuilder2.getStartLocationInFile()));
            stringBuilder5.append(":sizeIncHeader:");
            stringBuilder5.append(stringBuilder2.getSize() + 8L);
            logger3.severe(stringBuilder5.toString());
          } else {
            long l = logger.position();
            logger.position(stringBuilder2.getSize() + l);
            logger1 = logger;
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(this.loggingName);
            stringBuilder3.append(" Ignoring id3 chunk because already have one:");
            stringBuilder3.append(stringBuilder2.getID());
            stringBuilder3.append(":");
            stringBuilder3.append(wf2.c(stringBuilder2.getStartLocationInFile()));
            stringBuilder3.append(":sizeIncHeader:");
            stringBuilder3.append(stringBuilder2.getSize() + 8L);
            logger1.warning(stringBuilder3.toString());
          } 
        } 
      } else {
        ChunkSummary chunkSummary = new ChunkSummary(stringBuilder2.getID(), stringBuilder2.getStartLocationInFile(), stringBuilder2.getSize());
        logger1.addChunkSummary(chunkSummary);
        logger1.addMetadataChunkSummary(chunkSummary);
        if (logger1.getInfoTag() == null) {
          if (!(new WavListChunk(this.loggingName, Utils.readFileDataIntoBufferLE((FileChannel)logger, (int)stringBuilder2.getSize()), (ChunkHeader)stringBuilder2, (WavTag)logger1)).readChunk()) {
            logger1 = logger;
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append(this.loggingName);
            stringBuilder1.append(" LIST readChunkFailed");
            logger1.severe(stringBuilder1.toString());
            return false;
          } 
        } else {
          long l = stringBuilder1.position();
          stringBuilder1.position(stringBuilder2.getSize() + l);
          logger1 = logger;
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(this.loggingName);
          stringBuilder3.append(" Ignoring LIST chunk because already have one:");
          stringBuilder3.append(stringBuilder2.getID());
          stringBuilder3.append(":");
          stringBuilder3.append(wf2.c(stringBuilder2.getStartLocationInFile() - 1L));
          stringBuilder3.append(":sizeIncHeader:");
          stringBuilder3.append(stringBuilder2.getSize() + 8L);
          logger1.warning(stringBuilder3.toString());
        } 
      } 
    } else {
      Logger logger4;
      StringBuilder stringBuilder;
      Logger logger3;
      boolean bool = stringBuilder3.substring(1, 3).equals(WavCorruptChunkType.CORRUPT_ID3_EARLY.getCode());
      String str1 = YbNJ.NzkpLdCqvwCfE;
      if (bool) {
        logger4 = logger;
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(this.loggingName);
        stringBuilder5.append(str1);
        stringBuilder5.append(stringBuilder2.getID());
        stringBuilder5.append(":");
        stringBuilder5.append(stringBuilder2.getSize());
        logger4.severe(stringBuilder5.toString());
        if (logger1.getInfoTag() == null && logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        stringBuilder1.position(stringBuilder1.position() - 7L);
        return true;
      } 
      if (logger4.substring(0, 3).equals(WavCorruptChunkType.CORRUPT_ID3_LATE.getCode())) {
        logger2 = logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(str1);
        stringBuilder.append(stringBuilder2.getID());
        stringBuilder.append(":");
        stringBuilder.append(stringBuilder2.getSize());
        logger2.severe(stringBuilder.toString());
        if (logger1.getInfoTag() == null && logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        stringBuilder1.position(stringBuilder1.position() - 9L);
        return true;
      } 
      if (stringBuilder.substring(1, 3).equals(WavCorruptChunkType.CORRUPT_LIST_EARLY.getCode())) {
        Logger logger = logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(" Found Corrupt LIST Chunk, starting at Odd Location:");
        stringBuilder.append(stringBuilder2.getID());
        stringBuilder.append(":");
        stringBuilder.append(stringBuilder2.getSize());
        logger.severe(stringBuilder.toString());
        if (logger1.getInfoTag() == null && logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        stringBuilder1.position(stringBuilder1.position() - 7L);
        return true;
      } 
      if (stringBuilder.substring(0, 3).equals(WavCorruptChunkType.CORRUPT_LIST_LATE.getCode())) {
        Logger logger = logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(jLnXOLx.GKddvoDsWztJoh);
        stringBuilder.append(stringBuilder2.getID());
        stringBuilder.append(":");
        stringBuilder.append(stringBuilder2.getSize());
        logger.severe(stringBuilder.toString());
        if (logger1.getInfoTag() == null && logger1.getID3Tag() == null)
          logger1.setIncorrectlyAlignedTag(true); 
        stringBuilder1.position(stringBuilder1.position() - 9L);
        return true;
      } 
      if (stringBuilder.equals("\000\000\000\000") && stringBuilder2.getSize() == 0L) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(stringBuilder1.size() - stringBuilder1.position()));
        stringBuilder1.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.get() == 0);
        logger3 = logger;
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(this.loggingName);
        stringBuilder5.append("Found Null Padding, starting at ");
        stringBuilder5.append(stringBuilder2.getStartLocationInFile());
        stringBuilder5.append(", size:");
        stringBuilder5.append(byteBuffer.position());
        stringBuilder5.append(8);
        logger3.severe(stringBuilder5.toString());
        stringBuilder1.position(stringBuilder2.getStartLocationInFile() + byteBuffer.position() + 7L);
        logger1.addChunkSummary((ChunkSummary)new PaddingChunkSummary(stringBuilder2.getStartLocationInFile(), (byteBuffer.position() - 1)));
        logger1.setNonStandardPadding(true);
        return true;
      } 
      if (stringBuilder2.getSize() < 0L) {
        logger2 = logger;
        StringBuilder stringBuilder5 = new StringBuilder();
        x41.v(stringBuilder5, this.loggingName, " Size of Chunk Header is negative, skipping to file end:", (String)logger3, ":starting at:");
        stringBuilder5.append(wf2.c(stringBuilder2.getStartLocationInFile()));
        stringBuilder5.append(":sizeIncHeader:");
        stringBuilder5.append(stringBuilder2.getSize() + 8L);
        logger2.severe(stringBuilder5.toString());
        logger1.addChunkSummary((ChunkSummary)new BadChunkSummary(stringBuilder2.getStartLocationInFile(), stringBuilder1.size() - stringBuilder1.position()));
        logger1.setBadChunkData(true);
        stringBuilder1.position(stringBuilder1.size());
      } else {
        StringBuilder stringBuilder5;
        long l3 = stringBuilder1.position();
        long l2 = stringBuilder2.getSize();
        long l1 = stringBuilder1.size();
        str1 = this.loggingName;
        if (l2 + l3 <= l1) {
          logger3 = logger;
          stringBuilder5 = ga1.l(str1, " Skipping chunk bytes:");
          stringBuilder5.append(stringBuilder2.getSize());
          stringBuilder5.append(" for ");
          stringBuilder5.append(stringBuilder2.getID());
          logger3.severe(stringBuilder5.toString());
          logger1.addChunkSummary(new ChunkSummary(stringBuilder2.getID(), stringBuilder2.getStartLocationInFile(), stringBuilder2.getSize()));
          l1 = stringBuilder1.position();
          stringBuilder1.position(stringBuilder2.getSize() + l1);
        } else {
          logger2 = logger;
          StringBuilder stringBuilder6 = new StringBuilder();
          stringBuilder6.append((String)stringBuilder5);
          stringBuilder6.append(" Size of Chunk Header larger than data, skipping to file end:");
          stringBuilder6.append((String)logger3);
          stringBuilder6.append(":starting at:");
          stringBuilder6.append(wf2.c(stringBuilder2.getStartLocationInFile()));
          stringBuilder6.append(":sizeIncHeader:");
          stringBuilder6.append(stringBuilder2.getSize() + 8L);
          logger2.severe(stringBuilder6.toString());
          logger1.addChunkSummary((ChunkSummary)new BadChunkSummary(stringBuilder2.getStartLocationInFile(), stringBuilder1.size() - stringBuilder1.position()));
          logger1.setBadChunkData(true);
          stringBuilder1.position(stringBuilder1.size());
        } 
      } 
    } 
    IffHeaderChunk.ensureOnEqualBoundary((FileChannel)stringBuilder1, (ChunkHeader)stringBuilder2);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavTagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */