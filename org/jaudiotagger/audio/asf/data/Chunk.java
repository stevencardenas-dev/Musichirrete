package org.jaudiotagger.audio.asf.data;

import ga1;
import java.math.BigInteger;
import l0;
import org.jaudiotagger.audio.asf.util.Utils;

public class Chunk {
  protected final BigInteger chunkLength;
  
  protected final GUID guid;
  
  protected long position;
  
  public Chunk(GUID paramGUID, long paramLong, BigInteger paramBigInteger) {
    if (paramGUID != null) {
      if (paramLong >= 0L) {
        if (paramBigInteger != null && paramBigInteger.compareTo(BigInteger.ZERO) >= 0) {
          this.guid = paramGUID;
          this.position = paramLong;
          this.chunkLength = paramBigInteger;
          return;
        } 
        l0.l("chunkLen must not be null nor negative.");
        throw null;
      } 
      l0.l("Position of header can't be negative.");
      throw null;
    } 
    l0.l("GUID must not be null");
    throw null;
  }
  
  public Chunk(GUID paramGUID, BigInteger paramBigInteger) {
    if (paramGUID != null) {
      if (paramBigInteger != null && paramBigInteger.compareTo(BigInteger.ZERO) >= 0) {
        this.guid = paramGUID;
        this.chunkLength = paramBigInteger;
        return;
      } 
      l0.l("chunkLen must not be null nor negative.");
      throw null;
    } 
    l0.l("GUID must not be null.");
    throw null;
  }
  
  @Deprecated
  public long getChunckEnd() {
    long l = this.position;
    return this.chunkLength.longValue() + l;
  }
  
  public long getChunkEnd() {
    long l = this.position;
    return this.chunkLength.longValue() + l;
  }
  
  public BigInteger getChunkLength() {
    return this.chunkLength;
  }
  
  public GUID getGuid() {
    return this.guid;
  }
  
  public long getPosition() {
    return this.position;
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = ga1.l(paramString, "-> GUID: ");
    stringBuilder.append(GUID.getGuidDescription(this.guid));
    String str = Utils.LINE_SEPARATOR;
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  | : Starts at position: ");
    stringBuilder.append(getPosition());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  | : Last byte at: ");
    stringBuilder.append(getChunkEnd() - 1L);
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void setPosition(long paramLong) {
    this.position = paramLong;
  }
  
  public String toString() {
    return prettyPrint("");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */