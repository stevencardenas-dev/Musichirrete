package org.jaudiotagger.audio.mp4;

import c61;
import org.jaudiotagger.audio.generic.AudioFileWriter2;
import org.jaudiotagger.tag.Tag;

public class Mp4FileWriter extends AudioFileWriter2 {
  public void deleteTag(Tag paramTag, c61 paramc61) {
    (new Mp4TagWriter(paramc61.toString())).delete(paramTag, paramc61);
  }
  
  public void writeTag(Tag paramTag, c61 paramc61) {
    (new Mp4TagWriter(paramc61.toString())).write(paramTag, paramc61);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4FileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */