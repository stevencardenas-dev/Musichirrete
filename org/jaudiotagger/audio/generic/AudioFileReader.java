package org.jaudiotagger.audio.generic;

import c61;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.NoReadPermissionsException;
import org.jaudiotagger.tag.Tag;
import u00;
import uc1;

public abstract class AudioFileReader {
  protected static final int MINIMUM_SIZE_FOR_VALID_AUDIO_FILE = 100;
  
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.generic");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public abstract GenericAudioHeader getEncodingInfo(uc1 paramuc1);
  
  public abstract Tag getTag(uc1 paramuc1);
  
  public AudioFile read(u00 paramu00) {
    if (logger.isLoggable(Level.CONFIG))
      logger.config(MessageFormat.format("File {0} being read", new Object[] { paramu00.j() })); 
    if (!paramu00.a()) {
      if (!paramu00.f())
        throw new FileNotFoundException(MessageFormat.format("Unable to find:{0}", new Object[] { paramu00.j() })); 
      logger.warning(Permissions.displayPermissions(c61.a(paramu00)));
      throw new NoReadPermissionsException(MessageFormat.format("Unable to read file do not have permission to read: {0}", new Object[] { paramu00.j() }));
    } 
    if (paramu00.n() > 100L) {
      Object object = null;
      GenericAudioHeader genericAudioHeader3 = null;
      GenericAudioHeader genericAudioHeader2 = null;
      GenericAudioHeader genericAudioHeader1 = genericAudioHeader2;
      try {
        uc1 uc1 = new uc1();
        genericAudioHeader1 = genericAudioHeader2;
        this(paramu00, "r");
        try {
          uc1.h(0L);
          genericAudioHeader1 = getEncodingInfo(uc1);
          uc1.h(0L);
        } catch (CannotReadException cannotReadException) {
        
        } catch (Exception null) {
        
        } finally {
          GenericAudioHeader genericAudioHeader;
          genericAudioHeader2 = null;
          Exception exception2 = exception1;
        } 
      } catch (CannotReadException cannotReadException) {
        genericAudioHeader1 = genericAudioHeader3;
      } catch (Exception exception) {
        Object object1 = object;
      } finally {
        Exception exception1;
      } 
      throw exception;
    } 
    throw new CannotReadException(MessageFormat.format("Unable to read file because it is too small to be valid audio file: {0}", new Object[] { paramu00.j() }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */