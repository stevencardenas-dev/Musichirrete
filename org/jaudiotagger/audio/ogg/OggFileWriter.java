package org.jaudiotagger.audio.ogg;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.generic.AudioFileWriter;
import org.jaudiotagger.tag.Tag;
import uc1;

public class OggFileWriter extends AudioFileWriter {
  public static Logger logger;
  
  private OggVorbisTagWriter vtw = new OggVorbisTagWriter();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    this.vtw.delete(paramuc11, paramuc12);
  }
  
  public void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    this.vtw.write(paramTag, paramuc11, paramuc12);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\OggFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */