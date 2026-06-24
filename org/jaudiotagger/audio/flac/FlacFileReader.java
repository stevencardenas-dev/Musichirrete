package org.jaudiotagger.audio.flac;

import c61;
import org.jaudiotagger.audio.generic.AudioFileReader2;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;

public class FlacFileReader extends AudioFileReader2 {
  private FlacInfoReader ir = new FlacInfoReader();
  
  private FlacTagReader tr = new FlacTagReader();
  
  public GenericAudioHeader getEncodingInfo(c61 paramc61) {
    return this.ir.read(paramc61);
  }
  
  public Tag getTag(c61 paramc61) {
    return (Tag)this.tr.read(paramc61);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */