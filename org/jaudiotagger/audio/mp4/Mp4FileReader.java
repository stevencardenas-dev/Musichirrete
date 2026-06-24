package org.jaudiotagger.audio.mp4;

import c61;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;

public class Mp4FileReader extends AudioFileReader2 {
  private Mp4InfoReader ir = new Mp4InfoReader();
  
  private Mp4TagReader tr = new Mp4TagReader();
  
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    return this.ir.read(paramc61);
  }
  
  public Tag getTag(c61 paramc61) {
    return (Tag)this.tr.read(paramc61);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4FileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */