package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.data.StreamBitratePropertiesChunk;
import org.jaudiotagger.audio.asf.util.Utils;

public class StreamBitratePropertiesReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_STREAM_BITRATE_PROPERTIES };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    StreamBitratePropertiesChunk streamBitratePropertiesChunk = new StreamBitratePropertiesChunk(Utils.readBig64(paramInputStream));
    long l = Utils.readUINT16(paramInputStream);
    for (byte b = 0; b < l; b++)
      streamBitratePropertiesChunk.addBitrateRecord(Utils.readUINT16(paramInputStream) & 0xFF, Utils.readUINT32(paramInputStream)); 
    streamBitratePropertiesChunk.setPosition(paramLong);
    return (Chunk)streamBitratePropertiesChunk;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\StreamBitratePropertiesReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */