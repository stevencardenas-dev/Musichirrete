package org.jaudiotagger.audio.generic;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.ModifyVetoException;
import u00;

public class AudioFileModificationAdapter implements AudioFileModificationListener {
  public void fileModified(AudioFile paramAudioFile, u00 paramu00) {}
  
  public void fileOperationFinished(u00 paramu00) {}
  
  public void fileWillBeModified(AudioFile paramAudioFile, boolean paramBoolean) {}
  
  public void vetoThrown(AudioFileModificationListener paramAudioFileModificationListener, AudioFile paramAudioFile, ModifyVetoException paramModifyVetoException) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileModificationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */