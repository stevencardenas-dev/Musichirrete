package org.jaudiotagger.audio.flac;

import org.jaudiotagger.audio.generic.GenericAudioHeader;

public class FlacAudioHeader extends GenericAudioHeader {
  private String md5;
  
  public String getMd5() {
    return this.md5;
  }
  
  public void setMd5(String paramString) {
    this.md5 = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacAudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */