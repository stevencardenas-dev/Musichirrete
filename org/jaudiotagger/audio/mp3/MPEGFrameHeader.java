package org.jaudiotagger.audio.mp3;

import h0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import x41;

public class MPEGFrameHeader {
  private static final int BYTE_1 = 0;
  
  private static final int BYTE_2 = 1;
  
  private static final int BYTE_3 = 2;
  
  private static final int BYTE_4 = 3;
  
  public static final int EMPHASIS_5015MS = 1;
  
  public static final int EMPHASIS_CCITT = 3;
  
  public static final int EMPHASIS_NONE = 0;
  
  public static final int EMPHASIS_RESERVED = 2;
  
  public static final int HEADER_SIZE = 4;
  
  public static final int LAYER_I = 3;
  
  public static final int LAYER_II = 2;
  
  public static final int LAYER_III = 1;
  
  private static final int LAYER_III_FRAME_SIZE_COEFFICIENT = 144;
  
  public static final int LAYER_III_SLOT_SIZE = 1;
  
  private static final int LAYER_II_FRAME_SIZE_COEFFICIENT = 144;
  
  public static final int LAYER_II_SLOT_SIZE = 1;
  
  private static final int LAYER_I_FRAME_SIZE_COEFFICIENT = 12;
  
  public static final int LAYER_I_SLOT_SIZE = 4;
  
  private static final int MASK_MP3_BITRATE = 240;
  
  private static final int MASK_MP3_COPY = 8;
  
  private static final int MASK_MP3_EMPHASIS = 3;
  
  private static final int MASK_MP3_FREQUENCY = 12;
  
  private static final int MASK_MP3_HOME = 4;
  
  private static final int MASK_MP3_ID = 8;
  
  private static final int MASK_MP3_LAYER = 6;
  
  private static final int MASK_MP3_MODE = 192;
  
  private static final int MASK_MP3_MODE_EXTENSION = 48;
  
  private static final int MASK_MP3_PADDING = 2;
  
  private static final int MASK_MP3_PRIVACY = 1;
  
  private static final int MASK_MP3_PROTECTION = 1;
  
  private static final int MASK_MP3_VERSION = 24;
  
  public static final int MODE_DUAL_CHANNEL = 2;
  
  private static final int MODE_EXTENSION_NONE = 0;
  
  private static final int MODE_EXTENSION_OFF_OFF = 0;
  
  private static final int MODE_EXTENSION_OFF_ON = 2;
  
  private static final int MODE_EXTENSION_ONE = 1;
  
  private static final int MODE_EXTENSION_ON_OFF = 1;
  
  private static final int MODE_EXTENSION_ON_ON = 3;
  
  private static final int MODE_EXTENSION_THREE = 3;
  
  private static final int MODE_EXTENSION_TWO = 2;
  
  public static final int MODE_JOINT_STEREO = 1;
  
  public static final int MODE_MONO = 3;
  
  public static final int MODE_STEREO = 0;
  
  private static final int SCALE_BY_THOUSAND = 1000;
  
  public static final int SYNC_BIT_ANDSAMPING_BYTE3 = 252;
  
  public static final int SYNC_BYTE1 = 255;
  
  public static final int SYNC_BYTE2 = 224;
  
  public static final int SYNC_SIZE = 2;
  
  public static final int VERSION_1 = 3;
  
  public static final int VERSION_2 = 2;
  
  public static final int VERSION_2_5 = 0;
  
  private static final Map<Integer, Integer> bitrateMap;
  
  private static final Map<Integer, String> emphasisMap;
  
  private static final byte[] header = new byte[4];
  
  private static final Map<Integer, String> modeExtensionLayerIIIMap;
  
  private static final Map<Integer, String> modeExtensionMap;
  
  public static final Map<Integer, String> modeMap;
  
  public static final Map<Integer, String> mpegLayerMap;
  
  public static final Map<Integer, String> mpegVersionMap;
  
  private static final Map<Integer, Map<Integer, Integer>> samplesPerFrameMap;
  
  private static final Map<Integer, Integer> samplesPerFrameV1Map;
  
  private static final Map<Integer, Integer> samplesPerFrameV25Map;
  
  private static final Map<Integer, Integer> samplesPerFrameV2Map;
  
  private static final Map<Integer, Map<Integer, Integer>> samplingRateMap;
  
  private static final Map<Integer, Integer> samplingV1Map;
  
  private static final Map<Integer, Integer> samplingV25Map;
  
  private static final Map<Integer, Integer> samplingV2Map;
  
  private Integer bitRate;
  
  private int channelMode;
  
  private String channelModeAsString;
  
  private int emphasis;
  
  private String emphasisAsString;
  
  private boolean isCopyrighted;
  
  private boolean isOriginal;
  
  private boolean isPadding;
  
  private boolean isPrivate;
  
  private boolean isProtected;
  
  private int layer;
  
  private String layerAsString;
  
  private String modeExtension;
  
  private byte[] mpegBytes;
  
  private Integer samplingRate;
  
  private int version;
  
  private String versionAsString;
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    mpegVersionMap = (Map)hashMap1;
    Integer integer1 = Integer.valueOf(0);
    hashMap1.put(integer1, "MPEG-2.5");
    Integer integer3 = Integer.valueOf(2);
    hashMap1.put(integer3, "MPEG-2");
    Integer integer2 = Integer.valueOf(3);
    hashMap1.put(integer2, "MPEG-1");
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    mpegLayerMap = (Map)hashMap2;
    hashMap2.put(integer2, "Layer 1");
    hashMap2.put(integer3, "Layer 2");
    Integer integer4 = Integer.valueOf(1);
    hashMap2.put(integer4, uvJYmft.lPRszTxgwITzn);
    HashMap<Object, Object> hashMap7 = new HashMap<Object, Object>();
    bitrateMap = (Map)hashMap7;
    Integer integer6 = Integer.valueOf(32);
    hashMap7.put(Integer.valueOf(30), integer6);
    Integer integer7 = Integer.valueOf(64);
    hashMap7.put(Integer.valueOf(46), integer7);
    Integer integer8 = Integer.valueOf(96);
    hashMap7.put(Integer.valueOf(62), integer8);
    Integer integer10 = Integer.valueOf(128);
    hashMap7.put(Integer.valueOf(78), integer10);
    Integer integer11 = Integer.valueOf(160);
    hashMap7.put(Integer.valueOf(94), integer11);
    Integer integer12 = x41.h(352, hashMap7, x41.h(320, hashMap7, x41.h(288, hashMap7, x41.h(256, hashMap7, x41.h(224, hashMap7, x41.h(192, hashMap7, Integer.valueOf(110), 126), 142), 158), 174), 190), 206);
    Integer integer5 = Integer.valueOf(384);
    hashMap7.put(integer12, integer5);
    hashMap7.put(x41.h(416, hashMap7, Integer.valueOf(222), 238), Integer.valueOf(448));
    hashMap7.put(Integer.valueOf(28), integer6);
    Integer integer13 = Integer.valueOf(48);
    hashMap7.put(Integer.valueOf(44), integer13);
    integer12 = Integer.valueOf(56);
    hashMap7.put(Integer.valueOf(60), integer12);
    hashMap7.put(Integer.valueOf(76), integer7);
    Integer integer14 = Integer.valueOf(80);
    hashMap7.put(Integer.valueOf(92), integer14);
    hashMap7.put(Integer.valueOf(108), integer8);
    Integer integer15 = Integer.valueOf(112);
    hashMap7.put(Integer.valueOf(124), integer15);
    hashMap7.put(Integer.valueOf(140), integer10);
    hashMap7.put(Integer.valueOf(156), integer11);
    hashMap7.put(x41.h(256, hashMap7, x41.h(224, hashMap7, x41.h(192, hashMap7, Integer.valueOf(172), 188), 204), 220), Integer.valueOf(320));
    hashMap7.put(Integer.valueOf(236), integer5);
    hashMap7.put(Integer.valueOf(26), integer6);
    hashMap7.put(Integer.valueOf(42), Integer.valueOf(40));
    hashMap7.put(Integer.valueOf(58), integer13);
    hashMap7.put(Integer.valueOf(74), integer12);
    hashMap7.put(Integer.valueOf(90), integer7);
    hashMap7.put(Integer.valueOf(106), integer14);
    hashMap7.put(Integer.valueOf(122), integer8);
    hashMap7.put(Integer.valueOf(138), integer15);
    hashMap7.put(Integer.valueOf(154), integer10);
    hashMap7.put(Integer.valueOf(170), integer11);
    hashMap7.put(x41.h(256, hashMap7, x41.h(224, hashMap7, x41.h(192, hashMap7, Integer.valueOf(186), 202), 218), 234), Integer.valueOf(320));
    hashMap7.put(Integer.valueOf(22), integer6);
    hashMap7.put(Integer.valueOf(38), integer13);
    hashMap7.put(Integer.valueOf(54), integer12);
    hashMap7.put(Integer.valueOf(70), integer7);
    hashMap7.put(Integer.valueOf(86), integer14);
    hashMap7.put(Integer.valueOf(102), integer8);
    hashMap7.put(Integer.valueOf(118), integer15);
    hashMap7.put(Integer.valueOf(134), integer10);
    hashMap7.put(Integer.valueOf(150), Integer.valueOf(144));
    hashMap7.put(Integer.valueOf(166), integer11);
    hashMap7.put(x41.h(16, hashMap7, x41.h(8, hashMap7, x41.h(256, hashMap7, x41.h(224, hashMap7, x41.h(192, hashMap7, x41.h(176, hashMap7, Integer.valueOf(182), 198), 214), 230), 20), 36), 52), Integer.valueOf(24));
    hashMap7.put(Integer.valueOf(68), integer6);
    hashMap7.put(Integer.valueOf(84), Integer.valueOf(40));
    hashMap7.put(Integer.valueOf(100), integer13);
    hashMap7.put(Integer.valueOf(116), integer12);
    hashMap7.put(Integer.valueOf(132), integer7);
    hashMap7.put(Integer.valueOf(148), integer14);
    hashMap7.put(Integer.valueOf(164), integer8);
    hashMap7.put(Integer.valueOf(180), integer15);
    hashMap7.put(Integer.valueOf(196), integer10);
    hashMap7.put(Integer.valueOf(212), Integer.valueOf(144));
    hashMap7.put(Integer.valueOf(228), integer11);
    hashMap7.put(x41.h(16, hashMap7, x41.h(8, hashMap7, Integer.valueOf(18), 34), 50), Integer.valueOf(24));
    hashMap7.put(Integer.valueOf(66), integer6);
    hashMap7.put(Integer.valueOf(82), Integer.valueOf(40));
    hashMap7.put(Integer.valueOf(98), integer13);
    hashMap7.put(Integer.valueOf(114), integer12);
    hashMap7.put(Integer.valueOf(130), integer7);
    hashMap7.put(Integer.valueOf(146), integer14);
    hashMap7.put(Integer.valueOf(162), integer8);
    hashMap7.put(Integer.valueOf(178), integer15);
    hashMap7.put(Integer.valueOf(194), integer10);
    hashMap7.put(Integer.valueOf(210), Integer.valueOf(144));
    hashMap7.put(Integer.valueOf(226), integer11);
    HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
    modeMap = (Map)hashMap3;
    hashMap3.put(integer1, "Stereo");
    hashMap3.put(integer4, "Joint Stereo");
    hashMap3.put(integer3, "Dual");
    hashMap3.put(integer2, "Mono");
    hashMap3 = new HashMap<Object, Object>();
    emphasisMap = (Map)hashMap3;
    hashMap3.put(integer1, "None");
    hashMap3.put(integer4, "5015MS");
    hashMap3.put(integer3, "Reserved");
    hashMap3.put(integer2, "CCITT");
    HashMap<Object, Object> hashMap4 = new HashMap<Object, Object>();
    modeExtensionMap = (Map)hashMap4;
    hashMap3 = new HashMap<Object, Object>();
    modeExtensionLayerIIIMap = (Map)hashMap3;
    hashMap4.put(integer1, "4-31");
    hashMap4.put(integer4, "8-31");
    hashMap4.put(integer3, "12-31");
    hashMap4.put(integer2, "16-31");
    hashMap3.put(integer1, "off-off");
    hashMap3.put(integer4, "on-off");
    hashMap3.put(integer3, "off-on");
    hashMap3.put(integer2, "on-on");
    HashMap<Object, Object> hashMap5 = new HashMap<Object, Object>();
    samplingRateMap = (Map)hashMap5;
    HashMap<Object, Object> hashMap6 = new HashMap<Object, Object>();
    samplingV1Map = (Map)hashMap6;
    hashMap3 = new HashMap<Object, Object>();
    samplingV2Map = (Map)hashMap3;
    hashMap4 = new HashMap<Object, Object>();
    samplingV25Map = (Map)hashMap4;
    hashMap6.put(integer1, Integer.valueOf(44100));
    hashMap6.put(integer4, Integer.valueOf(48000));
    hashMap3.put(integer1, x41.h(32000, hashMap6, integer3, 22050));
    hashMap3.put(integer4, Integer.valueOf(24000));
    hashMap4.put(integer1, x41.h(16000, hashMap3, integer3, 11025));
    hashMap4.put(integer4, Integer.valueOf(12000));
    hashMap4.put(integer3, Integer.valueOf(8000));
    hashMap5.put(integer2, hashMap6);
    hashMap5.put(integer3, hashMap3);
    hashMap5.put(integer1, hashMap4);
    hashMap7 = new HashMap<Object, Object>();
    samplesPerFrameMap = (Map)hashMap7;
    hashMap4 = new HashMap<Object, Object>();
    samplesPerFrameV1Map = (Map)hashMap4;
    hashMap5 = new HashMap<Object, Object>();
    samplesPerFrameV2Map = (Map)hashMap5;
    hashMap3 = new HashMap<Object, Object>();
    samplesPerFrameV25Map = (Map)hashMap3;
    hashMap4.put(integer2, integer5);
    Integer integer9 = Integer.valueOf(1152);
    hashMap4.put(integer3, integer9);
    hashMap4.put(integer4, integer9);
    hashMap5.put(integer2, integer5);
    hashMap5.put(integer3, integer9);
    hashMap5.put(integer4, integer9);
    hashMap3.put(integer2, integer5);
    hashMap3.put(integer3, integer9);
    hashMap3.put(integer4, integer9);
    hashMap7.put(integer2, hashMap4);
    hashMap7.put(integer3, hashMap5);
    hashMap7.put(integer1, hashMap3);
  }
  
  private MPEGFrameHeader() {}
  
  private MPEGFrameHeader(byte[] paramArrayOfbyte) {
    this.mpegBytes = paramArrayOfbyte;
    setBitrate();
    setVersion();
    setLayer();
    setProtected();
    setSamplingRate();
    setPadding();
    setPrivate();
    setChannelMode();
    setModeExtension();
    setCopyrighted();
    setOriginal();
    setEmphasis();
  }
  
  public static boolean isMPEGFrame(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    return ((paramByteBuffer.get(i) & 0xFF) == 255 && (paramByteBuffer.get(i + 1) & 0xE0) == 224 && (paramByteBuffer.get(i + 2) & 0xFC) != 252);
  }
  
  public static MPEGFrameHeader parseMPEGHeader(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    byte[] arrayOfByte = header;
    paramByteBuffer.get(arrayOfByte, 0, 4);
    paramByteBuffer.position(i);
    return new MPEGFrameHeader(arrayOfByte);
  }
  
  private void setBitrate() {
    byte[] arrayOfByte = this.mpegBytes;
    byte b2 = arrayOfByte[2];
    byte b1 = arrayOfByte[1];
    Integer integer = bitrateMap.get(Integer.valueOf(b1 & 0x6 | b2 & 0xF0 | b1 & 0x8));
    this.bitRate = integer;
    if (integer != null)
      return; 
    throw new InvalidAudioFrameException("Invalid bitrate");
  }
  
  private void setChannelMode() {
    int i = (this.mpegBytes[3] & 0xC0) >>> 6;
    this.channelMode = i;
    String str = modeMap.get(Integer.valueOf(i));
    this.channelModeAsString = str;
    if (str != null)
      return; 
    throw new InvalidAudioFrameException("Invalid channel mode");
  }
  
  private void setCopyrighted() {
    boolean bool;
    if ((this.mpegBytes[3] & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.isCopyrighted = bool;
  }
  
  private void setEmphasis() {
    int i = this.mpegBytes[3] & 0x3;
    this.emphasis = i;
    this.emphasisAsString = emphasisMap.get(Integer.valueOf(i));
    if (getEmphasisAsString() != null)
      return; 
    throw new InvalidAudioFrameException("Invalid emphasis");
  }
  
  private void setLayer() {
    int i = (this.mpegBytes[1] & 0x6) >>> 1;
    this.layer = i;
    String str = mpegLayerMap.get(Integer.valueOf(i));
    this.layerAsString = str;
    if (str != null)
      return; 
    throw new InvalidAudioFrameException("Invalid Layer");
  }
  
  private void setModeExtension() {
    int i = (this.mpegBytes[3] & 0x30) >> 4;
    if (this.layer == 1) {
      this.modeExtension = modeExtensionLayerIIIMap.get(Integer.valueOf(i));
      if (getModeExtension() == null)
        throw new InvalidAudioFrameException("Invalid Mode Extension"); 
    } else {
      this.modeExtension = modeExtensionMap.get(Integer.valueOf(i));
      if (getModeExtension() == null)
        throw new InvalidAudioFrameException("Invalid Mode Extension"); 
    } 
  }
  
  private void setOriginal() {
    boolean bool;
    if ((this.mpegBytes[3] & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.isOriginal = bool;
  }
  
  private void setPadding() {
    boolean bool;
    if ((this.mpegBytes[2] & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.isPadding = bool;
  }
  
  private void setPrivate() {
    byte b = this.mpegBytes[2];
    boolean bool = true;
    if ((b & 0x1) == 0)
      bool = false; 
    this.isPrivate = bool;
  }
  
  private void setProtected() {
    byte[] arrayOfByte = this.mpegBytes;
    boolean bool = true;
    if ((arrayOfByte[1] & 0x1) != 0)
      bool = false; 
    this.isProtected = bool;
  }
  
  private void setSamplingRate() {
    byte b = this.mpegBytes[2];
    Map map = samplingRateMap.get(Integer.valueOf(this.version));
    if (map != null) {
      Integer integer = (Integer)map.get(Integer.valueOf((b & 0xC) >>> 2));
      this.samplingRate = integer;
      if (integer != null)
        return; 
      throw new InvalidAudioFrameException("Invalid sampling rate");
    } 
    throw new InvalidAudioFrameException("Invalid version");
  }
  
  private void setVersion() {
    byte b = (byte)((this.mpegBytes[1] & 0x18) >> 3);
    this.version = b;
    String str = mpegVersionMap.get(Integer.valueOf(b));
    this.versionAsString = str;
    if (str != null)
      return; 
    throw new InvalidAudioFrameException("Invalid mpeg version");
  }
  
  public Integer getBitRate() {
    return this.bitRate;
  }
  
  public int getChannelMode() {
    return this.channelMode;
  }
  
  public String getChannelModeAsString() {
    return this.channelModeAsString;
  }
  
  public int getEmphasis() {
    return this.emphasis;
  }
  
  public String getEmphasisAsString() {
    return this.emphasisAsString;
  }
  
  public int getFrameLength() {
    int i = this.version;
    if (i != 0 && i != 2) {
      if (i == 3) {
        i = this.layer;
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              i = getBitRate().intValue() * 12000 / getSamplingRate().intValue();
              return (getPaddingLength() + i) * 4;
            } 
            i = this.layer;
            StringBuilder stringBuilder1 = new StringBuilder("Mp3 Unknown Layer:");
            stringBuilder1.append(i);
            throw new RuntimeException(stringBuilder1.toString());
          } 
          i = getBitRate().intValue() * 144000 / getSamplingRate().intValue();
          return getPaddingLength() + i;
        } 
        i = getBitRate().intValue() * 144000 / getSamplingRate().intValue();
        return getPaddingLength() + i;
      } 
      i = this.version;
      StringBuilder stringBuilder = new StringBuilder("Mp3 Unknown Version:");
      stringBuilder.append(i);
      throw new RuntimeException(stringBuilder.toString());
    } 
    i = this.layer;
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          i = getBitRate().intValue() * 12000 / getSamplingRate().intValue();
          return (getPaddingLength() + i) * 4;
        } 
        i = this.layer;
        StringBuilder stringBuilder = new StringBuilder("Mp3 Unknown Layer:");
        stringBuilder.append(i);
        throw new RuntimeException(stringBuilder.toString());
      } 
      i = getBitRate().intValue() * 144000 / getSamplingRate().intValue();
      return getPaddingLength() + i;
    } 
    if (getChannelMode() == 3) {
      i = getBitRate().intValue() * 72000 / getSamplingRate().intValue();
      return getPaddingLength() + i;
    } 
    i = getBitRate().intValue() * 144000 / getSamplingRate().intValue();
    return getPaddingLength() + i;
  }
  
  public int getLayer() {
    return this.layer;
  }
  
  public String getLayerAsString() {
    return this.layerAsString;
  }
  
  public String getModeExtension() {
    return this.modeExtension;
  }
  
  public int getNoOfSamples() {
    return ((Integer)((Map)samplesPerFrameMap.get(Integer.valueOf(this.version))).get(Integer.valueOf(this.layer))).intValue();
  }
  
  public int getNumberOfChannels() {
    int i = this.channelMode;
    return (i != 0 && i != 1 && i != 2) ? ((i != 3) ? 0 : 1) : 2;
  }
  
  public int getPaddingLength() {
    return isPadding() ? 1 : 0;
  }
  
  public Integer getSamplingRate() {
    return this.samplingRate;
  }
  
  public int getVersion() {
    return this.version;
  }
  
  public String getVersionAsString() {
    return this.versionAsString;
  }
  
  public boolean isCopyrighted() {
    return this.isCopyrighted;
  }
  
  public boolean isOriginal() {
    return this.isOriginal;
  }
  
  public boolean isPadding() {
    return this.isPadding;
  }
  
  public boolean isPrivate() {
    return this.isPrivate;
  }
  
  public boolean isProtected() {
    return this.isProtected;
  }
  
  public boolean isVariableBitRate() {
    return false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("MPEG Frame Header:\n\tframe length:");
    stringBuilder.append(getFrameLength());
    stringBuilder.append("\n\tversion:");
    stringBuilder.append(this.versionAsString);
    stringBuilder.append("\n\tlayer:");
    stringBuilder.append(this.layerAsString);
    stringBuilder.append("\n\tchannelMode:");
    stringBuilder.append(this.channelModeAsString);
    stringBuilder.append("\n\tnoOfSamples:");
    stringBuilder.append(getNoOfSamples());
    stringBuilder.append("\n\tsamplingRate:");
    stringBuilder.append(this.samplingRate);
    stringBuilder.append("\n\tisPadding:");
    stringBuilder.append(this.isPadding);
    stringBuilder.append("\n\tisProtected:");
    stringBuilder.append(this.isProtected);
    stringBuilder.append("\n\tisPrivate:");
    stringBuilder.append(this.isPrivate);
    stringBuilder.append("\n\tisCopyrighted:");
    stringBuilder.append(this.isCopyrighted);
    stringBuilder.append("\n\tisOriginal:");
    stringBuilder.append(this.isCopyrighted);
    stringBuilder.append("\n\tisVariableBitRate");
    stringBuilder.append(isVariableBitRate());
    stringBuilder.append("\n\theader as binary:\n\t");
    stringBuilder.append(h0.e(this.mpegBytes[0]));
    stringBuilder.append(" \t");
    stringBuilder.append(h0.e(this.mpegBytes[1]));
    stringBuilder.append(" \t");
    stringBuilder.append(h0.e(this.mpegBytes[2]));
    stringBuilder.append(" \t");
    stringBuilder.append(h0.e(this.mpegBytes[3]));
    stringBuilder.append("\n");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\MPEGFrameHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */