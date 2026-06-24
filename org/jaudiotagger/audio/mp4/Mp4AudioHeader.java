package org.jaudiotagger.audio.mp4;

import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.mp4.atom.Mp4EsdsBox;

public class Mp4AudioHeader extends GenericAudioHeader {
  private String brand;
  
  private Mp4EsdsBox.Kind kind;
  
  private Mp4EsdsBox.AudioProfile profile;
  
  public String getBrand() {
    return this.brand;
  }
  
  public Mp4EsdsBox.Kind getKind() {
    return this.kind;
  }
  
  public Mp4EsdsBox.AudioProfile getProfile() {
    return this.profile;
  }
  
  public void setBrand(String paramString) {
    this.brand = paramString;
  }
  
  public void setKind(Mp4EsdsBox.Kind paramKind) {
    this.kind = paramKind;
  }
  
  public void setProfile(Mp4EsdsBox.AudioProfile paramAudioProfile) {
    this.profile = paramAudioProfile;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4AudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */