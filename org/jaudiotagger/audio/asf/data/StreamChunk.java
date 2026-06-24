package org.jaudiotagger.audio.asf.data;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.util.Utils;

public abstract class StreamChunk extends Chunk {
  static final boolean $assertionsDisabled = false;
  
  private boolean contentEncrypted;
  
  private int streamNumber;
  
  private long streamSpecificDataSize;
  
  private long timeOffset;
  
  private final GUID type;
  
  private long typeSpecificDataSize;
  
  public StreamChunk(GUID paramGUID, BigInteger paramBigInteger) {
    super(GUID.GUID_STREAM, paramBigInteger);
    this.type = paramGUID;
  }
  
  public int getStreamNumber() {
    return this.streamNumber;
  }
  
  public long getStreamSpecificDataSize() {
    return this.streamSpecificDataSize;
  }
  
  public GUID getStreamType() {
    return this.type;
  }
  
  public long getTimeOffset() {
    return this.timeOffset;
  }
  
  public long getTypeSpecificDataSize() {
    return this.typeSpecificDataSize;
  }
  
  public boolean isContentEncrypted() {
    return this.contentEncrypted;
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Stream number: ");
    stringBuilder.append(getStreamNumber());
    String str = Utils.LINE_SEPARATOR;
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append(eRUgfgGAccgka.dTpd);
    stringBuilder.append(getTypeSpecificDataSize());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Stream specific data size: ");
    stringBuilder.append(getStreamSpecificDataSize());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Time Offset              : ");
    stringBuilder.append(getTimeOffset());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Content Encryption       : ");
    stringBuilder.append(isContentEncrypted());
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void setContentEncrypted(boolean paramBoolean) {
    this.contentEncrypted = paramBoolean;
  }
  
  public void setStreamNumber(int paramInt) {
    this.streamNumber = paramInt;
  }
  
  public void setStreamSpecificDataSize(long paramLong) {
    this.streamSpecificDataSize = paramLong;
  }
  
  public void setTimeOffset(long paramLong) {
    this.timeOffset = paramLong;
  }
  
  public void setTypeSpecificDataSize(long paramLong) {
    this.typeSpecificDataSize = paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\StreamChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */