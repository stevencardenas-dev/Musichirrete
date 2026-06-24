package org.jaudiotagger.audio;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public enum SupportedFileFormat {
  AIF,
  AIFC,
  AIFF,
  ALAC,
  ASF,
  DFF,
  DSF,
  FLAC,
  M4A,
  M4B,
  M4P,
  MP3,
  MP4,
  OGA,
  OGG("ogg", "Ogg"),
  OPUS("ogg", "Ogg"),
  RA("ogg", "Ogg"),
  RM("ogg", "Ogg"),
  WAV("ogg", "Ogg"),
  WMA("ogg", "Ogg");
  
  private static final SupportedFileFormat[] $VALUES;
  
  private String displayName;
  
  private String filesuffix;
  
  static {
    OGA = new SupportedFileFormat("OGA", 1, tlzLOCPTHRhep.RwVzUEDVSoz, "Oga");
    MP3 = new SupportedFileFormat("MP3", 2, "mp3", "Mp3");
    FLAC = new SupportedFileFormat("FLAC", 3, "flac", "Flac");
    MP4 = new SupportedFileFormat("MP4", 4, "mp4", "Mp4");
    M4A = new SupportedFileFormat("M4A", 5, "m4a", "Mp4");
    ALAC = new SupportedFileFormat("ALAC", 6, "alac", "Mp4");
    M4P = new SupportedFileFormat("M4P", 7, "m4p", "M4p");
    WMA = new SupportedFileFormat("WMA", 8, "wma", "Wma");
    ASF = new SupportedFileFormat("ASF", 9, "asf", "Asf");
    WAV = new SupportedFileFormat("WAV", 10, "wav", "Wav");
    RA = new SupportedFileFormat("RA", 11, GMDx.mAOANstV, "Ra");
    RM = new SupportedFileFormat("RM", 12, "rm", "Rm");
    M4B = new SupportedFileFormat("M4B", 13, "m4b", "Mp4");
    AIF = new SupportedFileFormat("AIF", 14, "aif", "Aif");
    AIFF = new SupportedFileFormat("AIFF", 15, "aiff", "Aif");
    AIFC = new SupportedFileFormat("AIFC", 16, "aifc", "Aif Compressed");
    DSF = new SupportedFileFormat("DSF", 17, "dsf", "Dsf");
    DFF = new SupportedFileFormat("DFF", 18, "dff", "Dff");
    OPUS = new SupportedFileFormat(PwbbJfsdcHrAjW.dnTBfWXJJcJ, 19, "opus", "opus");
    $VALUES = $values();
  }
  
  SupportedFileFormat(String paramString1, String paramString2) {
    this.filesuffix = paramString1;
    this.displayName = paramString2;
  }
  
  public String getDisplayName() {
    return this.displayName;
  }
  
  public String getFilesuffix() {
    return this.filesuffix;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\SupportedFileFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */