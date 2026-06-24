package org.jaudiotagger.audio.mp3;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.generic.AudioFileReader;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.tag.Tag;
import u00;
import uc1;

public class MP3FileReader extends AudioFileReader {
  public GenericAudioHeader getEncodingInfo(uc1 paramuc1) {
    throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
  }
  
  public Tag getTag(uc1 paramuc1) {
    throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
  }
  
  public AudioFile read(u00 paramu00) {
    return new MP3File(paramu00, 6, true);
  }
  
  public AudioFile readMustBeWritable(u00 paramu00) {
    return new MP3File(paramu00, 6, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\MP3FileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */