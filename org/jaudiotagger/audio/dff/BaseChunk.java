package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.exceptions.InvalidChunkException;
import org.jaudiotagger.audio.generic.Utils;

public class BaseChunk {
  public static final int ID_LENGHT = 4;
  
  private Long chunkSize;
  
  private Long chunkStart;
  
  public BaseChunk(ByteBuffer paramByteBuffer) {}
  
  public static BaseChunk readIdChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    if (DffChunkType.FS.getCode().equals(str))
      return new FsChunk(paramByteBuffer); 
    if (DffChunkType.CHNL.getCode().equals(str))
      return new ChnlChunk(paramByteBuffer); 
    if (DffChunkType.CMPR.getCode().equals(str))
      return new CmprChunk(paramByteBuffer); 
    if (DffChunkType.END.getCode().equals(str) || DffChunkType.DSD.getCode().equals(str))
      return new EndChunk(paramByteBuffer); 
    if (DffChunkType.DST.getCode().equals(str))
      return new DstChunk(paramByteBuffer); 
    if (DffChunkType.FRTE.getCode().equals(str))
      return new FrteChunk(paramByteBuffer); 
    if (DffChunkType.ID3.getCode().equals(str))
      return new Id3Chunk(paramByteBuffer); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" is not recognized as a valid DFF chunk");
    throw new InvalidChunkException(stringBuilder.toString());
  }
  
  public Long getChunkEnd() {
    long l = this.chunkStart.longValue();
    return Long.valueOf(this.chunkSize.longValue() + l);
  }
  
  public Long getChunkSize() {
    return this.chunkSize;
  }
  
  public Long getChunkStart() {
    return this.chunkStart;
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    this.chunkSize = Long.valueOf(Long.reverseBytes(Utils.readFileDataIntoBufferLE(paramFileChannel, 8).getLong()));
    this.chunkStart = Long.valueOf(paramFileChannel.position());
  }
  
  public void skipToChunkEnd(FileChannel paramFileChannel) {
    long l = getChunkEnd().longValue() - paramFileChannel.position();
    if (l > 0L)
      Utils.readFileDataIntoBufferLE(paramFileChannel, Long.valueOf(l).intValue()); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\BaseChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */