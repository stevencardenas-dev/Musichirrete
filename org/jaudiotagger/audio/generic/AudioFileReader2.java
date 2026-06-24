package org.jaudiotagger.audio.generic;

import c61;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.logging.Level;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.NoReadPermissionsException;
import org.jaudiotagger.tag.Tag;
import u00;
import uc1;

public abstract class AudioFileReader2 extends AudioFileReader {
  public abstract GenericAudioHeader getEncodingInfo(c61 paramc61);
  
  public GenericAudioHeader getEncodingInfo(uc1 paramuc1) {
    throw new UnsupportedOperationException(oXrNDUqUkE.qXCczHOIZlenZaE);
  }
  
  public abstract Tag getTag(c61 paramc61);
  
  public Tag getTag(uc1 paramuc1) {
    throw new UnsupportedOperationException("Old method not used in version 2");
  }
  
  public AudioFile read(u00 paramu00) {
    c61 c61 = c61.a(paramu00);
    if (AudioFileReader.logger.isLoggable(Level.CONFIG))
      AudioFileReader.logger.config(MessageFormat.format("File {0} being read", new Object[] { c61 })); 
    if (!c61.a.a()) {
      if (!paramu00.f())
        throw new FileNotFoundException(MessageFormat.format("Unable to find:{0}", new Object[] { c61 })); 
      AudioFileReader.logger.warning(Permissions.displayPermissions(c61));
      throw new NoReadPermissionsException(MessageFormat.format("Unable to read file do not have permission to read: {0}", new Object[] { c61 }));
    } 
    if (paramu00.n() > 100L)
      return new AudioFile(paramu00, getEncodingInfo(c61), getTag(c61)); 
    throw new CannotReadException(MessageFormat.format("Unable to read file because it is too small to be valid audio file: {0}", new Object[] { c61 }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileReader2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */