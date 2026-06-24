package org.jaudiotagger.audio.dsf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;

public class FmtChunk {
  public static final int FMT_CHUNK_MIN_DATA_SIZE_ = 40;
  
  public static Logger logger;
  
  private long chunkSizeLength;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.dsf.FmtChunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private FmtChunk(ByteBuffer paramByteBuffer) {
    this.chunkSizeLength = paramByteBuffer.getLong();
  }
  
  private GenericAudioHeader readAudioInfo(DsdChunk paramDsdChunk, ByteBuffer paramByteBuffer) {
    GenericAudioHeader genericAudioHeader = new GenericAudioHeader();
    if (paramByteBuffer.limit() < 40) {
      logger.log(Level.WARNING, "Not enough bytes supplied for Generic audio header. Returning an empty one.");
      return genericAudioHeader;
    } 
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    int i = paramByteBuffer.getInt();
    int j = paramByteBuffer.getInt();
    int k = paramByteBuffer.getInt();
    long l = paramByteBuffer.getLong();
    paramByteBuffer.getInt();
    genericAudioHeader.setEncodingType("DSF");
    genericAudioHeader.setFormat(SupportedFileFormat.DSF.getDisplayName());
    genericAudioHeader.setBitRate(k * j * i);
    genericAudioHeader.setBitsPerSample(k);
    genericAudioHeader.setChannelNumber(i);
    genericAudioHeader.setSamplingRate(j);
    genericAudioHeader.setNoOfSamples(Long.valueOf(l));
    genericAudioHeader.setPreciseLength(((float)l / j));
    genericAudioHeader.setVariableBitRate(false);
    return genericAudioHeader;
  }
  
  public static FmtChunk readChunkHeader(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return DsfChunkType.FORMAT.getCode().equals(str) ? new FmtChunk(paramByteBuffer) : null;
  }
  
  public GenericAudioHeader readChunkData(DsdChunk paramDsdChunk, FileChannel paramFileChannel) {
    return readAudioInfo(paramDsdChunk, Utils.readFileDataIntoBufferLE(paramFileChannel, (int)(this.chunkSizeLength - (IffHeaderChunk.SIGNATURE_LENGTH + 8))));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\FmtChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */