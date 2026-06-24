package org.jaudiotagger.audio.wav;

import c61;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.wav.WavTag;

public class WavFileReader extends AudioFileReader2 {
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    return (new WavInfoReader(paramc61.toString())).read(paramc61);
  }
  
  public Tag getTag(c61 paramc61) {
    WavTag wavTag = (new WavTagReader(paramc61.toString())).read(paramc61);
    int i = null.$SwitchMap$org$jaudiotagger$audio$wav$WavOptions[TagOptionSingleton.getInstance().getWavOptions().ordinal()];
    if (i != 1 && i != 2 && i != 3 && i != 4)
      return (Tag)wavTag; 
    wavTag.syncTagsAfterRead();
    return (Tag)wavTag;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */