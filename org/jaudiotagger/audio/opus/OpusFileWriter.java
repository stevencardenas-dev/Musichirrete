package org.jaudiotagger.audio.opus;

import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.generic.AudioFileWriter;
import org.jaudiotagger.tag.Tag;
import uc1;

public class OpusFileWriter extends AudioFileWriter {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.opus");
  
  private OpusVorbisTagWriter vtw = new OpusVorbisTagWriter();
  
  public void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    this.vtw.delete(paramuc11, paramuc12);
  }
  
  public void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    this.vtw.write(paramTag, paramuc11, paramuc12);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opus\OpusFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */