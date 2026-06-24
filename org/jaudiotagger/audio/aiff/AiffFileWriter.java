package org.jaudiotagger.audio.aiff;

import c61;
import org.jaudiotagger.audio.generic.AudioFileWriter2;
import org.jaudiotagger.tag.Tag;

public class AiffFileWriter extends AudioFileWriter2 {
  private AiffTagWriter tw = new AiffTagWriter();
  
  public void deleteTag(Tag paramTag, c61 paramc61) {
    this.tw.delete(paramTag, paramc61);
  }
  
  public void writeTag(Tag paramTag, c61 paramc61) {
    this.tw.write(paramTag, paramc61);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */