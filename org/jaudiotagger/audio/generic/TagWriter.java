package org.jaudiotagger.audio.generic;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.tag.Tag;
import uc1;

public interface TagWriter {
  void delete(Tag paramTag, uc1 paramuc11, uc1 paramuc12);
  
  void write(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\TagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */