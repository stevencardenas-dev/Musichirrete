package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import java.util.Date;
import org.jaudiotagger.audio.asf.util.Utils;

public class FileHeader extends Chunk {
  private final BigInteger duration;
  
  private final Date fileCreationTime;
  
  private final BigInteger fileSize;
  
  private final long flags;
  
  private final long maxPackageSize;
  
  private final long minPackageSize;
  
  private final BigInteger packageCount;
  
  private final BigInteger timeEndPos;
  
  private final BigInteger timeStartPos;
  
  private final long uncompressedFrameSize;
  
  public FileHeader(BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4, BigInteger paramBigInteger5, BigInteger paramBigInteger6, BigInteger paramBigInteger7, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    super(GUID.GUID_FILE, paramBigInteger1);
    this.fileSize = paramBigInteger2;
    this.packageCount = paramBigInteger4;
    this.duration = paramBigInteger5;
    this.timeStartPos = paramBigInteger6;
    this.timeEndPos = paramBigInteger7;
    this.flags = paramLong1;
    this.minPackageSize = paramLong2;
    this.maxPackageSize = paramLong3;
    this.uncompressedFrameSize = paramLong4;
    this.fileCreationTime = Utils.getDateOf(paramBigInteger3).getTime();
  }
  
  public BigInteger getDuration() {
    return this.duration;
  }
  
  public int getDurationInSeconds() {
    return this.duration.divide(new BigInteger("10000000")).intValue();
  }
  
  public Date getFileCreationTime() {
    return new Date(this.fileCreationTime.getTime());
  }
  
  public BigInteger getFileSize() {
    return this.fileSize;
  }
  
  public long getFlags() {
    return this.flags;
  }
  
  public long getMaxPackageSize() {
    return this.maxPackageSize;
  }
  
  public long getMinPackageSize() {
    return this.minPackageSize;
  }
  
  public BigInteger getPackageCount() {
    return this.packageCount;
  }
  
  public float getPreciseDuration() {
    return (float)(getDuration().doubleValue() / 1.0E7D);
  }
  
  public BigInteger getTimeEndPos() {
    return this.timeEndPos;
  }
  
  public BigInteger getTimeStartPos() {
    return this.timeStartPos;
  }
  
  public long getUncompressedFrameSize() {
    return this.uncompressedFrameSize;
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Filesize      = ");
    stringBuilder.append(getFileSize().toString());
    stringBuilder.append(" Bytes");
    String str = Utils.LINE_SEPARATOR;
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Media duration= ");
    stringBuilder.append(getDuration().divide(new BigInteger("10000")).toString());
    stringBuilder.append(" ms");
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Created at    = ");
    stringBuilder.append(getFileCreationTime());
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\FileHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */