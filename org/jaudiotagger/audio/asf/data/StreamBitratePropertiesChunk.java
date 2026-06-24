package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.jaudiotagger.audio.asf.util.Utils;

public class StreamBitratePropertiesChunk extends Chunk {
  private final List<Long> bitRates = new ArrayList<Long>();
  
  private final List<Integer> streamNumbers = new ArrayList<Integer>();
  
  public StreamBitratePropertiesChunk(BigInteger paramBigInteger) {
    super(GUID.GUID_STREAM_BITRATE_PROPERTIES, paramBigInteger);
  }
  
  public void addBitrateRecord(int paramInt, long paramLong) {
    this.streamNumbers.add(Integer.valueOf(paramInt));
    this.bitRates.add(Long.valueOf(paramLong));
  }
  
  public long getAvgBitrate(int paramInt) {
    paramInt = this.streamNumbers.indexOf(Integer.valueOf(paramInt));
    return (paramInt == -1) ? -1L : ((Long)this.bitRates.get(paramInt)).longValue();
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    for (byte b = 0; b < this.bitRates.size(); b++) {
      stringBuilder.append(paramString);
      stringBuilder.append("  |-> Stream no. \"");
      stringBuilder.append(this.streamNumbers.get(b));
      stringBuilder.append("\" has an average bitrate of \"");
      stringBuilder.append(this.bitRates.get(b));
      stringBuilder.append('"');
      stringBuilder.append(Utils.LINE_SEPARATOR);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\StreamBitratePropertiesChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */