package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.aiff.AiffType;
import org.jaudiotagger.audio.aiff.AiffUtil;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class CommonChunk extends Chunk {
  private AiffAudioHeader aiffHeader;
  
  public CommonChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffHeader = paramAiffAudioHeader;
  }
  
  public boolean readChunk() {
    int i = Utils.u(this.chunkData.getShort());
    long l = this.chunkData.getInt();
    int j = Utils.u(this.chunkData.getShort());
    double d = AiffUtil.read80BitDouble(this.chunkData);
    if (this.aiffHeader.getFileType() == AiffType.AIFC) {
      if (this.chunkData.remaining() == 0)
        return false; 
      String str2 = Utils.readFourBytesAsChars(this.chunkData);
      if (str2.equals(AiffCompressionType.SOWT.getCode()))
        this.aiffHeader.setEndian(AiffAudioHeader.Endian.LITTLE_ENDIAN); 
      String str1 = Utils.readPascalString(this.chunkData);
      AiffCompressionType aiffCompressionType = AiffCompressionType.getByCode(str2);
      if (aiffCompressionType != null) {
        String str = aiffCompressionType.getCompression();
        this.aiffHeader.setLossless(aiffCompressionType.isLossless());
        str1 = str;
        if (aiffCompressionType == AiffCompressionType.NONE) {
          this.aiffHeader.setVariableBitRate(false);
          str1 = str;
        } 
      } else {
        this.aiffHeader.setLossless(false);
      } 
      boolean bool = str1.isEmpty();
      AiffAudioHeader aiffAudioHeader = this.aiffHeader;
      if (bool) {
        aiffAudioHeader.setEncodingType(str2);
      } else {
        aiffAudioHeader.setEncodingType(str1);
      } 
    } else {
      this.aiffHeader.setLossless(true);
      this.aiffHeader.setEncodingType(AiffCompressionType.NONE.getCompression());
      this.aiffHeader.setVariableBitRate(false);
    } 
    this.aiffHeader.setBitsPerSample(j);
    this.aiffHeader.setSamplingRate((int)d);
    this.aiffHeader.setChannelNumber(i);
    this.aiffHeader.setPreciseLength(l / d);
    this.aiffHeader.setNoOfSamples(Long.valueOf(l));
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\CommonChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */