package org.jaudiotagger.audio.generic;

import c61;
import java.text.MessageFormat;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import r3.IKWi.AyxAR;
import uc1;

public abstract class AudioFileWriter2 extends AudioFileWriter {
  public abstract void deleteTag(Tag paramTag, c61 paramc61);
  
  public void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    throw new UnsupportedOperationException("Old method not used in version 2");
  }
  
  public void write(AudioFile paramAudioFile) {
    c61 c61 = c61.a(paramAudioFile.getFile());
    if (!TagOptionSingleton.getInstance().isCheckIsWritable() || c61.a.b()) {
      if (paramAudioFile.getFile().n() > 100L) {
        writeTag(paramAudioFile.getTag(), c61);
        return;
      } 
      throw new CannotWriteException(MessageFormat.format(AyxAR.okwYDtWvnDFzD, new Object[] { c61 }));
    } 
    AudioFileWriter.logger.severe(Permissions.displayPermissions(c61));
    AudioFileWriter.logger.severe(MessageFormat.format("Cannot make changes to file {0}", new Object[] { c61.a(paramAudioFile.getFile()) }));
    throw new CannotWriteException(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { c61 }));
  }
  
  public void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    throw new UnsupportedOperationException("Old method not used in version 2");
  }
  
  public abstract void writeTag(Tag paramTag, c61 paramc61);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileWriter2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */