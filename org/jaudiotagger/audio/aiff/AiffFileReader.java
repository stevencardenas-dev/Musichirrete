package org.jaudiotagger.audio.aiff;

import c61;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;

public class AiffFileReader extends AudioFileReader2 {
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    return (new AiffInfoReader(paramc61.toString())).read(paramc61);
  }
  
  public Tag getTag(c61 paramc61) {
    return (Tag)(new AiffTagReader(paramc61.toString())).read(paramc61);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */