package org.jaudiotagger.audio.generic;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public class GenericAudioHeader implements AudioHeader {
  private Long audioDataEndPosition;
  
  private Long audioDataLength;
  
  private Long audioDataStartPosition;
  
  private Integer bitRate;
  
  private Integer bitsPerSample;
  
  private Integer byteRate;
  
  private String encodingType;
  
  private String format;
  
  private Boolean isLossless;
  
  private Boolean isVbr = Boolean.TRUE;
  
  private Integer noOfChannels;
  
  private Long noOfSamples;
  
  private Integer samplingRate;
  
  private Double trackLength;
  
  public Long getAudioDataEndPosition() {
    return this.audioDataEndPosition;
  }
  
  public Long getAudioDataLength() {
    return this.audioDataLength;
  }
  
  public Long getAudioDataStartPosition() {
    return this.audioDataStartPosition;
  }
  
  public String getBitRate() {
    return String.valueOf(this.bitRate);
  }
  
  public long getBitRateAsNumber() {
    Integer integer = this.bitRate;
    return (integer != null) ? integer.intValue() : -1L;
  }
  
  public int getBitsPerSample() {
    Integer integer = this.bitsPerSample;
    return (integer == null) ? -1 : integer.intValue();
  }
  
  public Integer getByteRate() {
    return this.byteRate;
  }
  
  public int getChannelNumber() {
    Integer integer = this.noOfChannels;
    return (integer != null) ? integer.intValue() : -1;
  }
  
  public String getChannels() {
    return String.valueOf(getChannelNumber());
  }
  
  public String getEncodingType() {
    return this.encodingType;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public Long getNoOfSamples() {
    return this.noOfSamples;
  }
  
  public double getPreciseTrackLength() {
    Double double_ = this.trackLength;
    return (double_ != null) ? double_.doubleValue() : 0.0D;
  }
  
  public String getSampleRate() {
    return String.valueOf(this.samplingRate);
  }
  
  public int getSampleRateAsNumber() {
    return this.samplingRate.intValue();
  }
  
  public int getTrackLength() {
    return (int)Math.round(getPreciseTrackLength());
  }
  
  public boolean isLossless() {
    Boolean bool = this.isLossless;
    return (bool == null) ? false : bool.booleanValue();
  }
  
  public boolean isVariableBitRate() {
    Boolean bool = this.isVbr;
    return (bool == null) ? false : bool.booleanValue();
  }
  
  public void setAudioDataEndPosition(Long paramLong) {
    this.audioDataEndPosition = paramLong;
  }
  
  public void setAudioDataLength(long paramLong) {
    this.audioDataLength = Long.valueOf(paramLong);
  }
  
  public void setAudioDataStartPosition(Long paramLong) {
    this.audioDataStartPosition = paramLong;
  }
  
  public void setBitRate(int paramInt) {
    this.bitRate = Integer.valueOf(paramInt);
  }
  
  public void setBitsPerSample(int paramInt) {
    this.bitsPerSample = Integer.valueOf(paramInt);
  }
  
  public void setByteRate(int paramInt) {
    this.byteRate = Integer.valueOf(paramInt);
  }
  
  public void setChannelNumber(int paramInt) {
    this.noOfChannels = Integer.valueOf(paramInt);
  }
  
  public void setEncodingType(String paramString) {
    this.encodingType = paramString;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
  
  public void setLossless(boolean paramBoolean) {
    this.isLossless = Boolean.valueOf(paramBoolean);
  }
  
  public void setNoOfSamples(Long paramLong) {
    this.noOfSamples = paramLong;
  }
  
  public void setPreciseLength(double paramDouble) {
    this.trackLength = Double.valueOf(paramDouble);
  }
  
  public void setSamplingRate(int paramInt) {
    this.samplingRate = Integer.valueOf(paramInt);
  }
  
  public void setVariableBitRate(boolean paramBoolean) {
    this.isVbr = Boolean.valueOf(paramBoolean);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Audio Header content:\n");
    if (this.audioDataLength != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\taudioDataLength:");
      stringBuilder1.append(this.audioDataLength);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.audioDataStartPosition != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\taudioDataStartPosition:");
      stringBuilder1.append(this.audioDataStartPosition);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.audioDataEndPosition != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\taudioDataEndPosition:");
      stringBuilder1.append(this.audioDataEndPosition);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.byteRate != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tbyteRate:");
      stringBuilder1.append(this.byteRate);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.bitRate != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tbitRate:");
      stringBuilder1.append(this.bitRate);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.samplingRate != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tsamplingRate:");
      stringBuilder1.append(this.samplingRate);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.bitsPerSample != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tbitsPerSample:");
      stringBuilder1.append(this.bitsPerSample);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.noOfSamples != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\ttotalNoSamples:");
      stringBuilder1.append(this.noOfSamples);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.noOfChannels != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tnumberOfChannels:");
      stringBuilder1.append(this.noOfChannels);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.format != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tformat:");
      stringBuilder1.append(this.format);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.encodingType != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tencodingType:");
      stringBuilder1.append(this.encodingType);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.isVbr != null) {
      StringBuilder stringBuilder1 = new StringBuilder(hrSTyFuSIm.zsVTB);
      stringBuilder1.append(this.isVbr);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.isLossless != null) {
      StringBuilder stringBuilder1 = new StringBuilder(IGBYXeDFmKYajx.jDtkChWdoDvB);
      stringBuilder1.append(this.isLossless);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.trackLength != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\ttrackDuration:");
      stringBuilder1.append(this.trackLength);
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\GenericAudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */