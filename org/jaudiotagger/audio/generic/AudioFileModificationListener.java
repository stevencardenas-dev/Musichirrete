package org.jaudiotagger.audio.generic;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.ModifyVetoException;
import u00;

public interface AudioFileModificationListener {
  void fileModified(AudioFile paramAudioFile, u00 paramu00);
  
  void fileOperationFinished(u00 paramu00);
  
  void fileWillBeModified(AudioFile paramAudioFile, boolean paramBoolean);
  
  void vetoThrown(AudioFileModificationListener paramAudioFileModificationListener, AudioFile paramAudioFile, ModifyVetoException paramModifyVetoException);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileModificationListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */