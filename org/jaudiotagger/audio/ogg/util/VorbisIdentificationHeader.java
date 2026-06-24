package org.jaudiotagger.audio.ogg.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.audio.ogg.VorbisVersion;

public class VorbisIdentificationHeader implements VorbisHeader {
  public static final int FIELD_AUDIO_CHANNELS_LENGTH = 1;
  
  public static final int FIELD_AUDIO_CHANNELS_POS = 11;
  
  public static final int FIELD_AUDIO_SAMPLE_RATE_LENGTH = 4;
  
  public static final int FIELD_AUDIO_SAMPLE_RATE_POS = 12;
  
  public static final int FIELD_BITRATE_MAX_LENGTH = 4;
  
  public static final int FIELD_BITRATE_MAX_POS = 16;
  
  public static final int FIELD_BITRATE_MIN_LENGTH = 4;
  
  public static final int FIELD_BITRATE_MIN_POS = 24;
  
  public static final int FIELD_BITRATE_NOMAIML_LENGTH = 4;
  
  public static final int FIELD_BITRATE_NOMAIML_POS = 20;
  
  public static final int FIELD_BLOCKSIZE_LENGTH = 1;
  
  public static final int FIELD_BLOCKSIZE_POS = 28;
  
  public static final int FIELD_FRAMING_FLAG_LENGTH = 1;
  
  public static final int FIELD_FRAMING_FLAG_POS = 29;
  
  public static final int FIELD_VORBIS_VERSION_LENGTH = 4;
  
  public static final int FIELD_VORBIS_VERSION_POS = 7;
  
  public static Logger logger;
  
  private int audioChannels;
  
  private int audioSampleRate;
  
  private int bitrateMaximal;
  
  private int bitrateMinimal;
  
  private int bitrateNominal;
  
  private boolean isValid = false;
  
  private int vorbisVersion;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public VorbisIdentificationHeader(byte[] paramArrayOfbyte) {
    decodeHeader(paramArrayOfbyte);
  }
  
  private int u(int paramInt) {
    return paramInt & 0xFF;
  }
  
  public void decodeHeader(byte[] paramArrayOfbyte) {
    byte b = paramArrayOfbyte[0];
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("packetType");
    stringBuilder.append(b);
    logger.fine(stringBuilder.toString());
    String str = new String(paramArrayOfbyte, 1, VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH, mk.b);
    if (b == VorbisPacketType.IDENTIFICATION_HEADER.getType() && str.equals("vorbis")) {
      this.vorbisVersion = paramArrayOfbyte[7] + (paramArrayOfbyte[8] << 8) + (paramArrayOfbyte[9] << 16) + (paramArrayOfbyte[10] << 24);
      Logger logger5 = logger;
      StringBuilder stringBuilder3 = new StringBuilder("vorbisVersion");
      stringBuilder3.append(this.vorbisVersion);
      logger5.fine(stringBuilder3.toString());
      this.audioChannels = u(paramArrayOfbyte[11]);
      Logger logger3 = logger;
      StringBuilder stringBuilder5 = new StringBuilder("audioChannels");
      stringBuilder5.append(this.audioChannels);
      logger3.fine(stringBuilder5.toString());
      this.audioSampleRate = u(paramArrayOfbyte[12]) + (u(paramArrayOfbyte[13]) << 8) + (u(paramArrayOfbyte[14]) << 16) + (u(paramArrayOfbyte[15]) << 24);
      Logger logger4 = logger;
      StringBuilder stringBuilder2 = new StringBuilder("audioSampleRate");
      stringBuilder2.append(this.audioSampleRate);
      logger4.fine(stringBuilder2.toString());
      Logger logger2 = logger;
      StringBuilder stringBuilder4 = new StringBuilder("audioSampleRate");
      stringBuilder4.append(paramArrayOfbyte[12]);
      stringBuilder4.append(" ");
      stringBuilder4.append(paramArrayOfbyte[13]);
      stringBuilder4.append(" ");
      stringBuilder4.append(paramArrayOfbyte[14]);
      logger2.fine(stringBuilder4.toString());
      this.bitrateMinimal = u(paramArrayOfbyte[16]) + (u(paramArrayOfbyte[17]) << 8) + (u(paramArrayOfbyte[18]) << 16) + (u(paramArrayOfbyte[19]) << 24);
      this.bitrateNominal = u(paramArrayOfbyte[20]) + (u(paramArrayOfbyte[21]) << 8) + (u(paramArrayOfbyte[22]) << 16) + (u(paramArrayOfbyte[23]) << 24);
      this.bitrateMaximal = u(paramArrayOfbyte[24]) + (u(paramArrayOfbyte[25]) << 8) + (u(paramArrayOfbyte[26]) << 16) + (u(paramArrayOfbyte[27]) << 24);
      b = paramArrayOfbyte[29];
      Logger logger1 = logger;
      StringBuilder stringBuilder1 = new StringBuilder("framingFlag");
      stringBuilder1.append(b);
      logger1.fine(stringBuilder1.toString());
      if (b != 0)
        this.isValid = true; 
    } 
  }
  
  public int getChannelNumber() {
    return this.audioChannels;
  }
  
  public String getEncodingType() {
    return VorbisVersion.values()[this.vorbisVersion].toString();
  }
  
  public int getMaxBitrate() {
    return this.bitrateMaximal;
  }
  
  public int getMinBitrate() {
    return this.bitrateMinimal;
  }
  
  public int getNominalBitrate() {
    return this.bitrateNominal;
  }
  
  public int getSamplingRate() {
    return this.audioSampleRate;
  }
  
  public boolean isValid() {
    return this.isValid;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\VorbisIdentificationHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */