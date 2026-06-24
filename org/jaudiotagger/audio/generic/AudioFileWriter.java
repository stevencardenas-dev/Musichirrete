package org.jaudiotagger.audio.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.ModifyVetoException;
import org.jaudiotagger.tag.Tag;
import u00;
import uc1;
import v00;
import ws2;

public abstract class AudioFileWriter {
  private static final String FILE_NAME_TOO_LONG = "File name too long";
  
  private static final int FILE_NAME_TOO_LONG_SAFE_LIMIT = 50;
  
  protected static final int MINIMUM_FILESIZE = 100;
  
  private static final String TEMP_FILENAME_SUFFIX = ".tmp";
  
  private static final String WRITE_MODE = "rw";
  
  public static Logger logger;
  
  private AudioFileModificationListener modificationListener = null;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.generic");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private void precheckWrite(AudioFile paramAudioFile) {
    try {
      boolean bool = paramAudioFile.getTag().isEmpty();
      return;
    } finally {
      Exception exception = null;
    } 
  }
  
  private void transferNewFileContentToOriginalFile(u00 paramu001, u00 paramu002) {
    uc1 uc1;
    try {
      uc1 = new uc1();
      this(paramu002, "rw");
      try {
        FileChannel fileChannel = uc1.a();
        try {
          FileLock fileLock = fileChannel.tryLock();
          if (fileLock != null) {
            try {
              transferNewFileContentToOriginalFile(paramu001, paramu002, uc1, fileChannel);
            } finally {
              fileLock.close();
            } 
          } else {
            logger.warning(MessageFormat.format("Cannot make changes to file {0} because it is being used by another application", new Object[] { paramu002.j() }));
            CannotWriteException cannotWriteException = new CannotWriteException();
            this(MessageFormat.format("Cannot make changes to file {0} because it is being used by another application", new Object[] { paramu002.j() }));
            throw cannotWriteException;
          } 
        } catch (IOException iOException) {
          logger.warning(MessageFormat.format("Cannot make changes to file {0} because it is being used by another application", new Object[] { paramu002.j() }));
          if ("Operation not supported".equals(iOException.getMessage())) {
            transferNewFileContentToOriginalFile(paramu001, paramu002, uc1, fileChannel);
          } else {
            CannotWriteException cannotWriteException = new CannotWriteException();
            this(MessageFormat.format("Cannot make changes to file {0} because it is being used by another application", new Object[] { paramu002.j() }), iOException);
            throw cannotWriteException;
          } 
        } catch (Exception exception) {}
      } finally {}
    } catch (FileNotFoundException fileNotFoundException) {
    
    } catch (Exception exception) {}
    try {
      uc1.close();
    } finally {
      uc1 = null;
    } 
  }
  
  private void transferNewFileContentToOriginalFile(u00 paramu001, u00 paramu002, uc1 paramuc1, FileChannel paramFileChannel) {
    try {
      long l;
      FileInputStream fileInputStream = ws2.n(paramu001);
      try {
        FileChannel fileChannel = fileInputStream.getChannel();
        l = fileChannel.size();
        long l1;
        for (l1 = 0L; l1 < l; l1 += fileChannel.transferTo(l1, 1048576L, paramFileChannel));
      } finally {}
      paramuc1.k(l);
      fileInputStream.close();
      if (paramu001.f() && !paramu001.e())
        logger.warning(MessageFormat.format("Unable to delete the temporary file {0}", new Object[] { paramu001.j() })); 
      return;
    } catch (FileNotFoundException fileNotFoundException) {
    
    } catch (IOException iOException) {}
    logger.warning(MessageFormat.format("Cannot make changes to file {0} because unable to rename from temporary file {1}", new Object[] { fileNotFoundException.j(), paramu001.h() }));
    throw new CannotWriteException(MessageFormat.format("Cannot make changes to file {0} because unable to rename from temporary file {1}", new Object[] { fileNotFoundException.j(), paramu001.h() }), iOException);
  }
  
  private void transferNewFileToOriginalFile(u00 paramu001, u00 paramu002) {
    transferNewFileContentToOriginalFile(paramu001, paramu002);
  }
  
  public void delete(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    paramuc11.h(0L);
    paramuc12.h(0L);
    deleteTag(paramTag, paramuc11, paramuc12);
  }
  
  public abstract void deleteTag(Tag paramTag, uc1 paramuc11, uc1 paramuc12);
  
  public void setAudioFileModificationListener(AudioFileModificationListener paramAudioFileModificationListener) {
    this.modificationListener = paramAudioFileModificationListener;
  }
  
  public void write(AudioFile paramAudioFile) {
    AudioFileModificationListener audioFileModificationListener1;
    CannotWriteException cannotWriteException;
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Started writing tag data for file:");
    stringBuilder2.append(paramAudioFile.getFile().h());
    logger.config(stringBuilder2.toString());
    precheckWrite(paramAudioFile);
    if (paramAudioFile instanceof org.jaudiotagger.audio.mp3.MP3File) {
      paramAudioFile.commit();
      return;
    } 
    v00 v001 = (v00)paramAudioFile.getFile();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(paramAudioFile.getFile().h().replace('.', '_'));
    stringBuilder1.append(".tmp");
    v00 v002 = v001.x(stringBuilder1.toString());
    v002.p();
    AudioFileModificationListener audioFileModificationListener2 = null;
    try {
      uc1 uc1 = new uc1();
      this((u00)v002, "rw");
      try {
        uc1 uc11 = new uc1(paramAudioFile.getFile(), "rw");
        try {
          uc11.h(0L);
          uc1.h(0L);
          try {
            audioFileModificationListener2 = this.modificationListener;
            if (audioFileModificationListener2 != null)
              audioFileModificationListener2.fileWillBeModified(paramAudioFile, false); 
          } catch (ModifyVetoException modifyVetoException) {}
        } catch (Exception exception) {
          exception.printStackTrace();
          logger.log(Level.SEVERE, MessageFormat.format("Cannot make changes to file {0} because {1}", new Object[] { paramAudioFile.getFile(), exception.getMessage() }), exception);
          try {
            uc11.close();
            uc1.close();
          } catch (IOException iOException1) {
            logger.log(Level.WARNING, MessageFormat.format("Problem closing file handles for file {0} because {1}", new Object[] { paramAudioFile.getFile().j(), iOException1.getMessage() }), iOException1);
          } 
          if (!v002.e())
            logger.warning(MessageFormat.format("Unable to delete the temporary file {0}", new Object[] { v002.j() })); 
          cannotWriteException = new CannotWriteException();
          this(MessageFormat.format("Cannot make changes to file {0} because {1}", new Object[] { paramAudioFile.getFile(), exception.getMessage() }), exception);
          throw cannotWriteException;
        } finally {}
        try {
          uc11.close();
          uc1.close();
        } catch (IOException null) {
          logger.log(Level.WARNING, MessageFormat.format("Problem closing file handles for file {0} because {1}", new Object[] { paramAudioFile.getFile().j(), iOException.getMessage() }), iOException);
        } 
        throw audioFileModificationListener2;
      } catch (IOException null) {}
    } catch (IOException iOException) {
      audioFileModificationListener1 = audioFileModificationListener2;
    } 
    logger.log(Level.SEVERE, MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { paramAudioFile.getFile().j() }), iOException);
    if (audioFileModificationListener1 != null)
      try {
        audioFileModificationListener1.close();
      } catch (IOException iOException1) {
        logger.log(Level.WARNING, MessageFormat.format("Problem closing file handles for file {0} because {1}", new Object[] { paramAudioFile.getFile(), iOException.getMessage() }), iOException1);
      }  
    if (!cannotWriteException.e())
      logger.warning(MessageFormat.format("Unable to delete the temporary file {0}", new Object[] { cannotWriteException.j() })); 
    throw new CannotWriteException(MessageFormat.format("Cannot modify {0} because do not have permissions to modify file", new Object[] { paramAudioFile.getFile().j() }));
  }
  
  public abstract void writeTag(AudioFile paramAudioFile, Tag paramTag, uc1 paramuc11, uc1 paramuc12);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AudioFileWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */