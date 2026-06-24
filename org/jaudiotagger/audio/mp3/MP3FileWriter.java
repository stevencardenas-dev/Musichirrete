package org.jaudiotagger.audio.mp3;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.generic.AudioFileWriter;
import org.jaudiotagger.tag.Tag;
import uc1;

public class MP3FileWriter extends AudioFileWriter {
  public void deleteTag(AudioFile paramAudioFile) {
    paramAudioFile.commit();
  }
  
  public void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    throw new RuntimeException("MP3FileReader.getEncodingInfo should be called");
  }
  
  public void writeFile(AudioFile paramAudioFile) {
    paramAudioFile.commit();
  }
  
  public void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    throw new RuntimeException("MP3FileReaderwriteTag should not be called");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\MP3FileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */