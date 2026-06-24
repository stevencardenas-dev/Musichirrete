package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;
import l0;
import org.jaudiotagger.audio.asf.util.Utils;

public final class AudioStreamChunk extends StreamChunk {
  public static final String[][] CODEC_DESCRIPTIONS = new String[][] { { "161", " (Windows Media Audio (ver 7,8,9))" }, { "162", " (Windows Media Audio 9 series (Professional))" }, { "163", "(Windows Media Audio 9 series (Lossless))" }, { "7A21", " (GSM-AMR (CBR))" }, { "7A22", " (GSM-AMR (VBR))" } };
  
  public static final long WMA = 353L;
  
  public static final long WMA_CBR = 31265L;
  
  public static final long WMA_LOSSLESS = 355L;
  
  public static final long WMA_PRO = 354L;
  
  public static final long WMA_VBR = 31266L;
  
  private long averageBytesPerSec;
  
  private int bitsPerSample;
  
  private long blockAlignment;
  
  private long channelCount;
  
  private byte[] codecData = new byte[0];
  
  private long compressionFormat;
  
  private GUID errorConcealment;
  
  private long samplingRate;
  
  public AudioStreamChunk(BigInteger paramBigInteger) {
    super(GUID.GUID_AUDIOSTREAM, paramBigInteger);
  }
  
  public long getAverageBytesPerSec() {
    return this.averageBytesPerSec;
  }
  
  public int getBitsPerSample() {
    return this.bitsPerSample;
  }
  
  public long getBlockAlignment() {
    return this.blockAlignment;
  }
  
  public long getChannelCount() {
    return this.channelCount;
  }
  
  public byte[] getCodecData() {
    return (byte[])this.codecData.clone();
  }
  
  public String getCodecDescription() {
    String str;
    StringBuilder stringBuilder = new StringBuilder(Long.toHexString(getCompressionFormat()));
    String[][] arrayOfString = CODEC_DESCRIPTIONS;
    int i = arrayOfString.length;
    byte b = 0;
    while (true) {
      if (b < i) {
        String[] arrayOfString1 = arrayOfString[b];
        if (arrayOfString1[0].equalsIgnoreCase(stringBuilder.toString())) {
          String str1 = arrayOfString1[1];
          break;
        } 
        b++;
        continue;
      } 
      str = " (Unknown)";
      break;
    } 
    if (stringBuilder.length() % 2 == 0) {
      stringBuilder.insert(0, "0x");
    } else {
      stringBuilder.insert(0, "0x0");
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public long getCompressionFormat() {
    return this.compressionFormat;
  }
  
  public GUID getErrorConcealment() {
    return this.errorConcealment;
  }
  
  public int getKbps() {
    return (int)getAverageBytesPerSec() * 8 / 1000;
  }
  
  public long getSamplingRate() {
    return this.samplingRate;
  }
  
  public boolean isErrorConcealed() {
    return getErrorConcealment().equals(GUID.GUID_AUDIO_ERROR_CONCEALEMENT_INTERLEAVED);
  }
  
  public String prettyPrint(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(super.prettyPrint(paramString));
    stringBuilder.append(paramString);
    stringBuilder.append("  |-> Audio info:");
    String str = Utils.LINE_SEPARATOR;
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |  : Bitrate : ");
    stringBuilder.append(getKbps());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |  : Channels : ");
    stringBuilder.append(getChannelCount());
    stringBuilder.append(" at ");
    stringBuilder.append(getSamplingRate());
    stringBuilder.append(" Hz");
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |  : Bits per Sample: ");
    stringBuilder.append(getBitsPerSample());
    stringBuilder.append(str);
    stringBuilder.append(paramString);
    stringBuilder.append("  |  : Formatcode: ");
    stringBuilder.append(getCodecDescription());
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void setAverageBytesPerSec(long paramLong) {
    this.averageBytesPerSec = paramLong;
  }
  
  public void setBitsPerSample(int paramInt) {
    this.bitsPerSample = paramInt;
  }
  
  public void setBlockAlignment(long paramLong) {
    this.blockAlignment = paramLong;
  }
  
  public void setChannelCount(long paramLong) {
    this.channelCount = paramLong;
  }
  
  public void setCodecData(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      this.codecData = (byte[])paramArrayOfbyte.clone();
      return;
    } 
    l0.k();
  }
  
  public void setCompressionFormat(long paramLong) {
    this.compressionFormat = paramLong;
  }
  
  public void setErrorConcealment(GUID paramGUID) {
    this.errorConcealment = paramGUID;
  }
  
  public void setSamplingRate(long paramLong) {
    this.samplingRate = paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\AudioStreamChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */