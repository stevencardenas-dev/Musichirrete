package org.jaudiotagger.audio.mp4.atom;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.generic.Utils;

public class Mp4EsdsBox extends AbstractMp4Box {
  public static final int AVERAGE_BITRATE_LENGTH = 4;
  
  public static final int BUFFER_SIZE_LENGTH = 3;
  
  public static final int CHANNEL_FLAGS_LENGTH = 1;
  
  public static final int CONFIG_TYPE_LENGTH = 1;
  
  public static final int DESCRIPTOR_OBJECT_TYPE_LENGTH = 1;
  
  public static final int DESCRIPTOR_TYPE_LENGTH = 1;
  
  public static final int ES_ID_LENGTH = 2;
  
  private static final int FILLER_END = 254;
  
  private static final int FILLER_OTHER = 129;
  
  private static final int FILLER_START = 128;
  
  public static final int MAX_BITRATE_LENGTH = 4;
  
  public static final int OBJECT_TYPE_LENGTH = 1;
  
  public static final int OTHER_FLAG_LENGTH = 3;
  
  private static final int SECTION_FIVE = 5;
  
  private static final int SECTION_FOUR = 4;
  
  private static final int SECTION_THREE = 3;
  
  public static final int STREAM_PRIORITY_LENGTH = 1;
  
  public static final int STREAM_TYPE_LENGTH = 1;
  
  public static final int VERSION_FLAG_LENGTH = 1;
  
  private static Map<Integer, AudioProfile> audioProfileMap;
  
  private static Map<Integer, Kind> kindMap = new HashMap<Integer, Kind>();
  
  private AudioProfile audioProfile;
  
  private int avgBitrate;
  
  private Kind kind;
  
  private int maxBitrate;
  
  private int numberOfChannels;
  
  static {
    Kind[] arrayOfKind = Kind.values();
    int i = arrayOfKind.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      Kind kind = arrayOfKind[b];
      kindMap.put(Integer.valueOf(kind.getId()), kind);
    } 
    audioProfileMap = new HashMap<Integer, AudioProfile>();
    AudioProfile[] arrayOfAudioProfile = AudioProfile.values();
    i = arrayOfAudioProfile.length;
    for (b = bool; b < i; b++) {
      AudioProfile audioProfile = arrayOfAudioProfile[b];
      audioProfileMap.put(Integer.valueOf(audioProfile.getId()), audioProfile);
    } 
  }
  
  public Mp4EsdsBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    paramByteBuffer.position(paramByteBuffer.position() + 4);
    if (paramByteBuffer.get() == 3) {
      processSectionHeader(paramByteBuffer);
      paramByteBuffer.position(paramByteBuffer.position() + 3);
    } 
    if (paramByteBuffer.get() == 4) {
      processSectionHeader(paramByteBuffer);
      this.kind = kindMap.get(Integer.valueOf(paramByteBuffer.get()));
      paramByteBuffer.position(paramByteBuffer.position() + 4);
      this.maxBitrate = paramByteBuffer.getInt();
      this.avgBitrate = paramByteBuffer.getInt();
    } 
    if (paramByteBuffer.get() == 5) {
      processSectionHeader(paramByteBuffer);
      this.audioProfile = audioProfileMap.get(Integer.valueOf(paramByteBuffer.get() >> 3));
      this.numberOfChannels = paramByteBuffer.get() << 1 >> 4;
    } 
  }
  
  public AudioProfile getAudioProfile() {
    return this.audioProfile;
  }
  
  public int getAvgBitrate() {
    return this.avgBitrate;
  }
  
  public Kind getKind() {
    return this.kind;
  }
  
  public int getMaxBitrate() {
    return this.maxBitrate;
  }
  
  public int getNumberOfChannels() {
    return this.numberOfChannels;
  }
  
  public int processSectionHeader(ByteBuffer paramByteBuffer) {
    byte b = paramByteBuffer.get();
    int i = b & 0xFF;
    if (i == 128 || i == 129 || i == 254) {
      paramByteBuffer.get();
      paramByteBuffer.get();
      return Utils.u(paramByteBuffer.get());
    } 
    return Utils.u(b);
  }
  
  public enum AudioProfile {
    CELP,
    HILN,
    HVXC,
    LOW_COMPLEXITY,
    MAIN(1, "Main"),
    MAIN_SYNTHESIS(1, "Main"),
    SCALEABLE(1, "Main"),
    TTSI(1, "Main"),
    TWIN_VQ(1, "Main"),
    T_F(1, "Main"),
    T_F_LC(1, "Main"),
    T_F_MAIN(1, "Main"),
    WAVETABLE(1, "Main");
    
    private static final AudioProfile[] $VALUES;
    
    private String description;
    
    private int id;
    
    static {
      T_F_LC = new AudioProfile("T_F_LC", 5, 6, "T/F LC");
      TWIN_VQ = new AudioProfile("TWIN_VQ", 6, 7, "TWIN");
      CELP = new AudioProfile("CELP", 7, 8, "CELP");
      HVXC = new AudioProfile("HVXC", 8, 9, "HVXC");
      HILN = new AudioProfile("HILN", 9, 10, "HILN");
      TTSI = new AudioProfile("TTSI", 10, 11, "TTSI");
      MAIN_SYNTHESIS = new AudioProfile("MAIN_SYNTHESIS", 11, 12, "MAIN_SYNTHESIS");
      WAVETABLE = new AudioProfile("WAVETABLE", 12, 13, "WAVETABLE");
      $VALUES = $values();
    }
    
    AudioProfile(int param1Int1, String param1String1) {
      this.id = param1Int1;
      this.description = param1String1;
    }
    
    public String getDescription() {
      return this.description;
    }
    
    public int getId() {
      return this.id;
    }
  }
  
  public enum Kind {
    ADPCM_AUDIO(1, "Main"),
    ALAW_AUDIO(1, "Main"),
    DOLBY_V3_AUDIO(1, "Main"),
    H261_VIDEO(1, "Main"),
    H263_VIDEO(1, "Main"),
    H264_VIDEO(1, "Main"),
    JPEG_VIDEO(1, "Main"),
    MPEG1_ADTS(1, "Main"),
    MPEG1_VIDEO(1, "Main"),
    MPEG2_422_VIDEO(1, "Main"),
    MPEG2_ADTS_MAIN(1, "Main"),
    MPEG2_HIGH_VIDEO(1, "Main"),
    MPEG2_MAIN_VIDEO(1, "Main"),
    MPEG2_SIMPLE_VIDEO(1, "Main"),
    MPEG2_SNR_VIDEO(1, "Main"),
    MPEG2_SPATIAL_VIDEO(1, "Main"),
    MPEG4_ADTS_LOW_COMPLEXITY(1, "Main"),
    MPEG4_ADTS_MAIN(1, "Main"),
    MPEG4_ADTS_SCALEABLE_SAMPLING(1, "Main"),
    MPEG4_AUDIO(1, "Main"),
    MPEG4_AVC_PPS(1, "Main"),
    MPEG4_AVC_SPS(1, "Main"),
    MPEG4_VIDEO(1, "Main"),
    MULAW_AUDIO(1, "Main"),
    PCM_BIG_ENDIAN_AUDIO(1, "Main"),
    PCM_LITTLE_ENDIAN_AUDIO(1, "Main"),
    PRIVATE_AUDIO(1, "Main"),
    PRIVATE_VIDEO(1, "Main"),
    V1(1),
    V2(2),
    VORBIS_AUDIO(2),
    YV12_VIDEO(2);
    
    private static final Kind[] $VALUES;
    
    private int id;
    
    static {
      MPEG4_AVC_SPS = new Kind("MPEG4_AVC_SPS", 3, 33);
      MPEG4_AVC_PPS = new Kind("MPEG4_AVC_PPS", 4, 34);
      MPEG4_AUDIO = new Kind("MPEG4_AUDIO", 5, 64);
      MPEG2_SIMPLE_VIDEO = new Kind("MPEG2_SIMPLE_VIDEO", 6, 96);
      MPEG2_MAIN_VIDEO = new Kind("MPEG2_MAIN_VIDEO", 7, 97);
      MPEG2_SNR_VIDEO = new Kind("MPEG2_SNR_VIDEO", 8, 98);
      MPEG2_SPATIAL_VIDEO = new Kind("MPEG2_SPATIAL_VIDEO", 9, 99);
      MPEG2_HIGH_VIDEO = new Kind("MPEG2_HIGH_VIDEO", 10, 100);
      MPEG2_422_VIDEO = new Kind("MPEG2_422_VIDEO", 11, 101);
      MPEG4_ADTS_MAIN = new Kind("MPEG4_ADTS_MAIN", 12, 102);
      MPEG4_ADTS_LOW_COMPLEXITY = new Kind("MPEG4_ADTS_LOW_COMPLEXITY", 13, 103);
      MPEG4_ADTS_SCALEABLE_SAMPLING = new Kind("MPEG4_ADTS_SCALEABLE_SAMPLING", 14, 104);
      MPEG2_ADTS_MAIN = new Kind("MPEG2_ADTS_MAIN", 15, 105);
      MPEG1_VIDEO = new Kind("MPEG1_VIDEO", 16, 106);
      MPEG1_ADTS = new Kind("MPEG1_ADTS", 17, 107);
      JPEG_VIDEO = new Kind("JPEG_VIDEO", 18, 108);
      PRIVATE_AUDIO = new Kind("PRIVATE_AUDIO", 19, 192);
      PRIVATE_VIDEO = new Kind("PRIVATE_VIDEO", 20, 208);
      PCM_LITTLE_ENDIAN_AUDIO = new Kind("PCM_LITTLE_ENDIAN_AUDIO", 21, 224);
      VORBIS_AUDIO = new Kind("VORBIS_AUDIO", 22, 225);
      DOLBY_V3_AUDIO = new Kind("DOLBY_V3_AUDIO", 23, 226);
      ALAW_AUDIO = new Kind("ALAW_AUDIO", 24, 227);
      MULAW_AUDIO = new Kind("MULAW_AUDIO", 25, 228);
      ADPCM_AUDIO = new Kind("ADPCM_AUDIO", 26, 229);
      PCM_BIG_ENDIAN_AUDIO = new Kind("PCM_BIG_ENDIAN_AUDIO", 27, 230);
      YV12_VIDEO = new Kind("YV12_VIDEO", 28, 240);
      H264_VIDEO = new Kind("H264_VIDEO", 29, 241);
      H263_VIDEO = new Kind("H263_VIDEO", 30, 242);
      H261_VIDEO = new Kind("H261_VIDEO", 31, 243);
      $VALUES = $values();
    }
    
    Kind(int param1Int1) {
      this.id = param1Int1;
    }
    
    public int getId() {
      return this.id;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4EsdsBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */