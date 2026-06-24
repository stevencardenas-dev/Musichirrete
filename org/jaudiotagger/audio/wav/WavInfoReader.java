package org.jaudiotagger.audio.wav;

import androidx.profileinstaller.Vuyf.nBRIsU;
import c61;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.audio.wav.chunk.WavCorruptChunkType;
import org.jaudiotagger.audio.wav.chunk.WavFactChunk;
import org.jaudiotagger.audio.wav.chunk.WavFormatChunk;
import wf2;
import x41;

public class WavInfoReader {
  public static Logger logger;
  
  private boolean isFoundAudio = false;
  
  private boolean isFoundFormat = false;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavInfoReader(String paramString) {
    this.loggingName = paramString;
  }
  
  private void calculateTrackLength(GenericAudioHeader paramGenericAudioHeader) {
    if (paramGenericAudioHeader.getNoOfSamples() != null) {
      if (paramGenericAudioHeader.getSampleRateAsNumber() > 0)
        paramGenericAudioHeader.setPreciseLength(((float)paramGenericAudioHeader.getNoOfSamples().longValue() / paramGenericAudioHeader.getSampleRateAsNumber())); 
      return;
    } 
    if (paramGenericAudioHeader.getAudioDataLength().longValue() > 0L) {
      paramGenericAudioHeader.setPreciseLength(((float)paramGenericAudioHeader.getAudioDataLength().longValue() / paramGenericAudioHeader.getByteRate().intValue()));
      return;
    } 
    throw new CannotReadException(x41.n(new StringBuilder(), this.loggingName, " Wav Data Header Missing"));
  }
  
  public GenericAudioHeader read(c61 paramc61) {
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    FileChannel fileChannel = paramc61.b("r");
    try {
      if (WavRIFFHeader.isValidHeader(this.loggingName, fileChannel)) {
        while (fileChannel.position() < fileChannel.size()) {
          boolean bool = readChunk(fileChannel, genericAudioHeader);
          if (!bool)
            break; 
        } 
        fileChannel.close();
        if (this.isFoundFormat && this.isFoundAudio) {
          genericAudioHeader.setFormat(SupportedFileFormat.WAV.getDisplayName());
          genericAudioHeader.setLossless(true);
          calculateTrackLength(genericAudioHeader);
          return genericAudioHeader;
        } 
        throw new CannotReadException(x41.n(new StringBuilder(), this.loggingName, " Unable to safetly read chunks for this file, appears to be corrupt"));
      } 
    } finally {}
    CannotReadException cannotReadException = new CannotReadException();
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(this.loggingName);
    stringBuilder.append(" Wav RIFF Header not valid");
    this(stringBuilder.toString());
    throw cannotReadException;
  }
  
  public boolean readChunk(FileChannel paramFileChannel, GenericAudioHeader paramGenericAudioHeader) {
    Logger logger1;
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    if (!chunkHeader.readHeader(paramFileChannel))
      return false; 
    String str = chunkHeader.getID();
    Logger logger2 = logger;
    StringBuilder stringBuilder = new StringBuilder();
    x41.v(stringBuilder, this.loggingName, JkpGFvCVQHzgc.fiHpAa, str, ":starting at:");
    stringBuilder.append(wf2.c(chunkHeader.getStartLocationInFile()));
    stringBuilder.append(":sizeIncHeader:");
    stringBuilder.append(chunkHeader.getSize() + 8L);
    logger2.info(stringBuilder.toString());
    WavChunkType wavChunkType = WavChunkType.get(str);
    if (wavChunkType != null) {
      StringBuilder stringBuilder1;
      int i = null.$SwitchMap$org$jaudiotagger$audio$wav$WavChunkType[wavChunkType.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            long l = paramFileChannel.position();
            if (chunkHeader.getSize() + l <= paramFileChannel.size()) {
              l = paramFileChannel.position();
              paramFileChannel.position(chunkHeader.getSize() + l);
            } else if (this.isFoundAudio && this.isFoundFormat) {
              Logger logger = logger;
              stringBuilder1 = new StringBuilder();
              x41.v(stringBuilder1, this.loggingName, " Size of Chunk Header larger than data, skipping to file end:", str, ":starting at:");
              stringBuilder1.append(wf2.c(chunkHeader.getStartLocationInFile()));
              stringBuilder1.append(":sizeIncHeader:");
              stringBuilder1.append(chunkHeader.getSize() + 8L);
              logger.severe(stringBuilder1.toString());
              paramFileChannel.position(paramFileChannel.size());
            } else {
              logger1 = logger;
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append(this.loggingName);
              stringBuilder1.append(" Size of Chunk Header larger than data, cannot read file");
              logger1.severe(stringBuilder1.toString());
              throw new CannotReadException(x41.n(new StringBuilder(), this.loggingName, " Size of Chunk Header larger than data, cannot read file"));
            } 
          } else {
            if (!(new WavFormatChunk(Utils.readFileDataIntoBufferLE((FileChannel)logger1, (int)chunkHeader.getSize()), chunkHeader, (GenericAudioHeader)stringBuilder1)).readChunk())
              return false; 
            this.isFoundFormat = true;
          } 
        } else {
          stringBuilder1.setAudioDataLength(chunkHeader.getSize());
          stringBuilder1.setAudioDataStartPosition(Long.valueOf(logger1.position()));
          long l = logger1.position();
          stringBuilder1.setAudioDataEndPosition(Long.valueOf(chunkHeader.getSize() + l));
          l = logger1.position();
          logger1.position(chunkHeader.getSize() + l);
          this.isFoundAudio = true;
        } 
      } else if (!(new WavFactChunk(Utils.readFileDataIntoBufferLE((FileChannel)logger1, (int)chunkHeader.getSize()), chunkHeader, (GenericAudioHeader)stringBuilder1)).readChunk()) {
        return false;
      } 
    } else {
      String str1;
      StringBuilder stringBuilder1;
      Logger logger;
      if (str.substring(1, 3).equals(WavCorruptChunkType.CORRUPT_LIST_EARLY.getCode())) {
        Logger logger3 = logger;
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(" Found Corrupt LIST Chunk, starting at Odd Location:");
        stringBuilder1.append(chunkHeader.getID());
        stringBuilder1.append(":");
        stringBuilder1.append(chunkHeader.getSize());
        logger3.severe(stringBuilder1.toString());
        logger1.position(logger1.position() - 7L);
        return true;
      } 
      if (stringBuilder1.substring(0, 3).equals(WavCorruptChunkType.CORRUPT_LIST_LATE.getCode())) {
        Logger logger3 = logger;
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(nBRIsU.GZjNV);
        stringBuilder1.append(chunkHeader.getID());
        stringBuilder1.append(":");
        stringBuilder1.append(chunkHeader.getSize());
        logger3.severe(stringBuilder1.toString());
        logger1.position(logger1.position() - 9L);
        return true;
      } 
      if (stringBuilder1.equals("\000\000\000\000") && chunkHeader.getSize() == 0L) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(logger1.size() - logger1.position()));
        logger1.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining() && byteBuffer.get() == 0);
        logger = logger;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.loggingName);
        stringBuilder2.append(ckOPp.WtpU);
        stringBuilder2.append(chunkHeader.getStartLocationInFile());
        stringBuilder2.append(", size:");
        stringBuilder2.append(byteBuffer.position());
        stringBuilder2.append(8);
        logger.severe(stringBuilder2.toString());
        logger1.position(chunkHeader.getStartLocationInFile() + byteBuffer.position() + 7L);
        return true;
      } 
      if (chunkHeader.getSize() < 0L) {
        if (this.isFoundAudio && this.isFoundFormat) {
          Logger logger3 = logger;
          StringBuilder stringBuilder2 = new StringBuilder();
          x41.v(stringBuilder2, this.loggingName, RqlokDsQOju.MbJdjAyfaPKJ, (String)logger, ":starting at:");
          stringBuilder2.append(wf2.c(chunkHeader.getStartLocationInFile()));
          stringBuilder2.append(":sizeIncHeader:");
          stringBuilder2.append(chunkHeader.getSize() + 8L);
          logger3.severe(stringBuilder2.toString());
          logger1.position(logger1.size());
        } else {
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(this.loggingName);
          stringBuilder2.append(" Not a valid header, unable to read a sensible size:Header");
          stringBuilder2.append(chunkHeader.getID());
          stringBuilder2.append("Size:");
          stringBuilder2.append(chunkHeader.getSize());
          str1 = stringBuilder2.toString();
          logger.severe(str1);
          throw new CannotReadException(str1);
        } 
      } else {
        StringBuilder stringBuilder2;
        long l = str1.position();
        if (chunkHeader.getSize() + l <= str1.size()) {
          Logger logger3 = logger;
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append(this.loggingName);
          stringBuilder2.append(" Skipping chunk bytes:");
          stringBuilder2.append(chunkHeader.getSize());
          stringBuilder2.append(" for ");
          stringBuilder2.append(chunkHeader.getID());
          logger3.severe(stringBuilder2.toString());
          l = str1.position();
          str1.position(chunkHeader.getSize() + l);
        } else {
          if (this.isFoundAudio && this.isFoundFormat) {
            Logger logger3 = logger;
            StringBuilder stringBuilder4 = new StringBuilder();
            x41.v(stringBuilder4, this.loggingName, " Size of Chunk Header larger than data, skipping to file end:", (String)stringBuilder2, ":starting at:");
            stringBuilder4.append(wf2.c(chunkHeader.getStartLocationInFile()));
            stringBuilder4.append(":sizeIncHeader:");
            stringBuilder4.append(chunkHeader.getSize() + 8L);
            logger3.severe(stringBuilder4.toString());
            str1.position(str1.size());
            IffHeaderChunk.ensureOnEqualBoundary((FileChannel)str1, chunkHeader);
            return true;
          } 
          logger1 = logger;
          StringBuilder stringBuilder3 = new StringBuilder();
          stringBuilder3.append(this.loggingName);
          stringBuilder3.append(" Size of Chunk Header larger than data, cannot read file");
          logger1.severe(stringBuilder3.toString());
          throw new CannotReadException(x41.n(new StringBuilder(), this.loggingName, " Size of Chunk Header larger than data, cannot read file"));
        } 
      } 
    } 
    IffHeaderChunk.ensureOnEqualBoundary((FileChannel)logger1, chunkHeader);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavInfoReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */