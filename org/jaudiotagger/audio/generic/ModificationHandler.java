package org.jaudiotagger.audio.generic;

import java.util.Iterator;
import java.util.Vector;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.ModifyVetoException;
import u00;

public class ModificationHandler implements AudioFileModificationListener {
  private Vector<AudioFileModificationListener> listeners = new Vector<AudioFileModificationListener>();
  
  public void addAudioFileModificationListener(AudioFileModificationListener paramAudioFileModificationListener) {
    if (!this.listeners.contains(paramAudioFileModificationListener))
      this.listeners.add(paramAudioFileModificationListener); 
  }
  
  public void fileModified(AudioFile paramAudioFile, u00 paramu00) {
    for (AudioFileModificationListener audioFileModificationListener : this.listeners) {
      try {
        audioFileModificationListener.fileModified(paramAudioFile, paramu00);
      } catch (ModifyVetoException modifyVetoException) {
        vetoThrown(audioFileModificationListener, paramAudioFile, modifyVetoException);
        throw modifyVetoException;
      } 
    } 
  }
  
  public void fileOperationFinished(u00 paramu00) {
    Iterator<AudioFileModificationListener> iterator = this.listeners.iterator();
    while (iterator.hasNext())
      ((AudioFileModificationListener)iterator.next()).fileOperationFinished(paramu00); 
  }
  
  public void fileWillBeModified(AudioFile paramAudioFile, boolean paramBoolean) {
    Iterator<AudioFileModificationListener> iterator = this.listeners.iterator();
    while (iterator.hasNext()) {
      AudioFileModificationListener audioFileModificationListener = iterator.next();
      try {
        audioFileModificationListener.fileWillBeModified(paramAudioFile, paramBoolean);
      } catch (ModifyVetoException modifyVetoException) {
        vetoThrown(audioFileModificationListener, paramAudioFile, modifyVetoException);
        throw modifyVetoException;
      } 
    } 
  }
  
  public void removeAudioFileModificationListener(AudioFileModificationListener paramAudioFileModificationListener) {
    if (this.listeners.contains(paramAudioFileModificationListener))
      this.listeners.remove(paramAudioFileModificationListener); 
  }
  
  public void vetoThrown(AudioFileModificationListener paramAudioFileModificationListener, AudioFile paramAudioFile, ModifyVetoException paramModifyVetoException) {
    Iterator<AudioFileModificationListener> iterator = this.listeners.iterator();
    while (iterator.hasNext())
      ((AudioFileModificationListener)iterator.next()).vetoThrown(paramAudioFileModificationListener, paramAudioFile, paramModifyVetoException); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\ModificationHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */