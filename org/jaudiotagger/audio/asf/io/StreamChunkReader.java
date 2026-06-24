package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.AudioStreamChunk;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.data.VideoStreamChunk;
import org.jaudiotagger.audio.asf.util.Utils;

public class StreamChunkReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_STREAM };
  
  public boolean canFail() {
    return true;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    GUID gUID = Utils.readGUID(paramInputStream);
    paramGUID = GUID.GUID_AUDIOSTREAM;
    if (paramGUID.equals(gUID) || GUID.GUID_VIDEOSTREAM.equals(gUID)) {
      VideoStreamChunk videoStreamChunk;
      long l1;
      boolean bool;
      GUID gUID1 = Utils.readGUID(paramInputStream);
      long l3 = Utils.readUINT64(paramInputStream);
      long l4 = Utils.readUINT32(paramInputStream);
      long l2 = Utils.readUINT32(paramInputStream);
      int j = Utils.readUINT16(paramInputStream);
      int i = j & 0x7F;
      if ((j & 0x8000) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      paramInputStream.skip(4L);
      if (paramGUID.equals(gUID)) {
        AudioStreamChunk audioStreamChunk = new AudioStreamChunk(bigInteger);
        long l7 = Utils.readUINT16(paramInputStream);
        l1 = Utils.readUINT16(paramInputStream);
        long l8 = Utils.readUINT32(paramInputStream);
        long l5 = Utils.readUINT32(paramInputStream);
        long l6 = Utils.readUINT16(paramInputStream);
        j = Utils.readUINT16(paramInputStream);
        int k = Utils.readUINT16(paramInputStream);
        byte[] arrayOfByte = new byte[k];
        paramInputStream.read(arrayOfByte);
        audioStreamChunk.setCompressionFormat(l7);
        audioStreamChunk.setChannelCount(l1);
        audioStreamChunk.setSamplingRate(l8);
        audioStreamChunk.setAverageBytesPerSec(l5);
        audioStreamChunk.setErrorConcealment(gUID1);
        audioStreamChunk.setBlockAlignment(l6);
        audioStreamChunk.setBitsPerSample(j);
        audioStreamChunk.setCodecData(arrayOfByte);
        l1 = (k + 18);
      } else {
        videoStreamChunk = new VideoStreamChunk(bigInteger);
        l1 = Utils.readUINT32(paramInputStream);
        long l = Utils.readUINT32(paramInputStream);
        paramInputStream.skip(1L);
        paramInputStream.skip(2L);
        paramInputStream.skip(16L);
        byte[] arrayOfByte = new byte[4];
        paramInputStream.read(arrayOfByte);
        videoStreamChunk.setPictureWidth(l1);
        videoStreamChunk.setPictureHeight(l);
        videoStreamChunk.setCodecId(arrayOfByte);
        l1 = 31L;
      } 
      videoStreamChunk.setStreamNumber(i);
      videoStreamChunk.setStreamSpecificDataSize(l2);
      videoStreamChunk.setTypeSpecificDataSize(l4);
      videoStreamChunk.setTimeOffset(l3);
      videoStreamChunk.setContentEncrypted(bool);
      videoStreamChunk.setPosition(paramLong);
      paramInputStream.skip(bigInteger.longValue() - 24L - l1 - 54L);
      return (Chunk)videoStreamChunk;
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\StreamChunkReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */