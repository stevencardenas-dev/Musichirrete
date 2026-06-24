package org.jaudiotagger.audio.opus.util;

import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.generic.Utils;

public class OpusVorbisIdentificationHeader {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg.opus");
  
  private byte audioChannels;
  
  private int audioSampleRate;
  
  private int bitrateMaximal;
  
  private int bitrateMinimal;
  
  private int bitrateNominal;
  
  private byte[] channelMap;
  
  private byte channelMapFamily;
  
  private boolean isValid = false;
  
  private short outputGain;
  
  private short preSkip;
  
  private byte streamCount;
  
  private byte streamCountTwoChannel;
  
  private byte vorbisVersion;
  
  public OpusVorbisIdentificationHeader(byte[] paramArrayOfbyte) {
    decodeHeader(paramArrayOfbyte);
  }
  
  private void decodeHeader(byte[] paramArrayOfbyte) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte);
    if (Utils.readString(byteBuffer, 8).equals("OpusHead")) {
      this.vorbisVersion = byteBuffer.get();
      this.audioChannels = byteBuffer.get();
      this.preSkip = byteBuffer.getShort();
      this.audioSampleRate = byteBuffer.getInt();
      this.outputGain = byteBuffer.getShort();
      byte b = byteBuffer.get();
      this.channelMapFamily = b;
      if (b > 0) {
        this.streamCount = byteBuffer.get();
        this.streamCountTwoChannel = byteBuffer.get();
        this.channelMap = new byte[this.audioChannels];
        for (byte b1 = 0; b1 < this.audioChannels; b1++)
          this.channelMap[b1] = byteBuffer.get(); 
      } 
      this.isValid = true;
    } 
  }
  
  public byte getAudioChannels() {
    return this.audioChannels;
  }
  
  public int getAudioSampleRate() {
    return this.audioSampleRate;
  }
  
  public int getBitrateMaximal() {
    return this.bitrateMaximal;
  }
  
  public int getBitrateMinimal() {
    return this.bitrateMinimal;
  }
  
  public int getBitrateNominal() {
    return this.bitrateNominal;
  }
  
  public byte[] getChannelMap() {
    return this.channelMap;
  }
  
  public byte getChannelMapFamily() {
    return this.channelMapFamily;
  }
  
  public short getOutputGain() {
    return this.outputGain;
  }
  
  public short getPreSkip() {
    return this.preSkip;
  }
  
  public byte getStreamCount() {
    return this.streamCount;
  }
  
  public byte getStreamCountTwoChannel() {
    return this.streamCountTwoChannel;
  }
  
  public byte getVorbisVersion() {
    return this.vorbisVersion;
  }
  
  public boolean isValid() {
    return this.isValid;
  }
  
  public void setAudioChannels(byte paramByte) {
    this.audioChannels = paramByte;
  }
  
  public void setAudioSampleRate(int paramInt) {
    this.audioSampleRate = paramInt;
  }
  
  public void setBitrateMaximal(int paramInt) {
    this.bitrateMaximal = paramInt;
  }
  
  public void setBitrateMinimal(int paramInt) {
    this.bitrateMinimal = paramInt;
  }
  
  public void setBitrateNominal(int paramInt) {
    this.bitrateNominal = paramInt;
  }
  
  public void setChannelMap(byte[] paramArrayOfbyte) {
    this.channelMap = paramArrayOfbyte;
  }
  
  public void setChannelMapFamily(byte paramByte) {
    this.channelMapFamily = paramByte;
  }
  
  public void setOutputGain(short paramShort) {
    this.outputGain = paramShort;
  }
  
  public void setPreSkip(short paramShort) {
    this.preSkip = paramShort;
  }
  
  public void setStreamCount(byte paramByte) {
    this.streamCount = paramByte;
  }
  
  public void setStreamCountTwoChannel(byte paramByte) {
    this.streamCountTwoChannel = paramByte;
  }
  
  public void setValid(boolean paramBoolean) {
    this.isValid = paramBoolean;
  }
  
  public void setVorbisVersion(byte paramByte) {
    this.vorbisVersion = paramByte;
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer("OpusVorbisIdentificationHeader{isValid=");
    stringBuffer.append(this.isValid);
    stringBuffer.append(CKYHNesT.zOIdEAdpllTGT);
    stringBuffer.append(this.vorbisVersion);
    stringBuffer.append(", audioChannels=");
    stringBuffer.append(this.audioChannels);
    stringBuffer.append(", preSkip=");
    stringBuffer.append(this.preSkip);
    stringBuffer.append(", audioSampleRate=");
    stringBuffer.append(this.audioSampleRate);
    stringBuffer.append(", outputGain=");
    stringBuffer.append(this.outputGain);
    stringBuffer.append(", channelMapFamily=");
    stringBuffer.append(this.channelMapFamily);
    stringBuffer.append(", streamCount=");
    stringBuffer.append(this.streamCount);
    stringBuffer.append(", streamCountTwoChannel=");
    stringBuffer.append(this.streamCountTwoChannel);
    stringBuffer.append(", channelMap=");
    if (this.channelMap == null) {
      stringBuffer.append("null");
    } else {
      stringBuffer.append('[');
      for (byte b = 0; b < this.channelMap.length; b++) {
        String str;
        if (b == 0) {
          str = "";
        } else {
          str = RqlokDsQOju.rIIswZ;
        } 
        stringBuffer.append(str);
        stringBuffer.append(this.channelMap[b]);
      } 
      stringBuffer.append(']');
    } 
    stringBuffer.append(RqlokDsQOju.lXa);
    stringBuffer.append(this.bitrateMinimal);
    stringBuffer.append(", bitrateNominal=");
    stringBuffer.append(this.bitrateNominal);
    stringBuffer.append(", bitrateMaximal=");
    stringBuffer.append(this.bitrateMaximal);
    stringBuffer.append('}');
    return stringBuffer.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opu\\util\OpusVorbisIdentificationHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */