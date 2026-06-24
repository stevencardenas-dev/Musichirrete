package org.jaudiotagger.audio.flac;

import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import x41;

public class FlacStreamReader {
  public static final String FLAC_STREAM_IDENTIFIER = "fLaC";
  
  public static final int FLAC_STREAM_IDENTIFIER_LENGTH = 4;
  
  public static Logger logger;
  
  private FileChannel fc;
  
  private String loggingName;
  
  private int startOfFlacInFile;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public FlacStreamReader(FileChannel paramFileChannel, String paramString) {
    this.fc = paramFileChannel;
    this.loggingName = paramString;
  }
  
  private boolean isFlacHeader() {
    return Utils.readFourBytesAsChars(Utils.readFileDataIntoBufferBE(this.fc, 4)).equals("fLaC");
  }
  
  private boolean isId3v2Tag() {
    this.fc.position(0L);
    if (AbstractID3v2Tag.isId3Tag(this.fc)) {
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.loggingName);
      stringBuilder.append(MessageFormat.format("Flac File contains invalid ID3 Tag, skipping ID3 Tag of length:{0}", new Object[] { Long.valueOf(this.fc.position()) }));
      logger.warning(stringBuilder.toString());
      if (isFlacHeader())
        return true; 
    } 
    return false;
  }
  
  public void findStream() {
    if (this.fc.size() != 0L) {
      this.fc.position(0L);
      if (isFlacHeader()) {
        this.startOfFlacInFile = 0;
        return;
      } 
      if (isId3v2Tag()) {
        this.startOfFlacInFile = (int)(this.fc.position() - 4L);
        return;
      } 
      throw new CannotReadException(x41.n(new StringBuilder(), this.loggingName, "Flac Header not found, not a flac file"));
    } 
    String str = this.loggingName;
    StringBuilder stringBuilder = new StringBuilder("Error: File empty ");
    stringBuilder.append(str);
    throw new CannotReadException(stringBuilder.toString());
  }
  
  public int getStartOfFlacInFile() {
    return this.startOfFlacInFile;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacStreamReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */