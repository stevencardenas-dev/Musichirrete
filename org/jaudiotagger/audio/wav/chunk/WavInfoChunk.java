package org.jaudiotagger.audio.wav.chunk;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.wav.WavInfoTag;
import org.jaudiotagger.tag.wav.WavTag;
import x41;

public class WavInfoChunk {
  public static Logger logger;
  
  private String loggingName;
  
  private WavInfoTag wavInfoTag;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav.WavInfoChunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavInfoChunk(WavTag paramWavTag, String paramString) {
    this.loggingName = paramString;
    WavInfoTag wavInfoTag = new WavInfoTag();
    this.wavInfoTag = wavInfoTag;
    paramWavTag.setInfoTag(wavInfoTag);
  }
  
  public boolean readChunks(ByteBuffer paramByteBuffer) {
    while (paramByteBuffer.remaining() >= IffHeaderChunk.TYPE_LENGTH) {
      StringBuilder stringBuilder;
      String str = Utils.readFourBytesAsChars(paramByteBuffer);
      if (str.trim().isEmpty())
        return true; 
      int i = paramByteBuffer.getInt();
      if (!Character.isLetter(str.charAt(0)) || !Character.isLetter(str.charAt(1)) || !Character.isLetter(str.charAt(2)) || !Character.isLetter(str.charAt(3))) {
        Logger logger = logger;
        stringBuilder = new StringBuilder();
        x41.v(stringBuilder, this.loggingName, "LISTINFO appears corrupt, ignoring:", str, ":");
        stringBuilder.append(i);
        logger.severe(stringBuilder.toString());
        return false;
      } 
      try {
        Level level;
        Logger logger1;
        String str1 = Utils.getString((ByteBuffer)stringBuilder, 0, i, mk.c);
        Logger logger2 = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        x41.v(stringBuilder1, this.loggingName, "Result:", str, ":");
        stringBuilder1.append(i);
        stringBuilder1.append(":");
        stringBuilder1.append(str1);
        stringBuilder1.append(":");
        logger2.config(stringBuilder1.toString());
        WavInfoIdentifier wavInfoIdentifier = WavInfoIdentifier.getByCode(str);
        if (wavInfoIdentifier != null && wavInfoIdentifier.getFieldKey() != null) {
          try {
            this.wavInfoTag.setField(wavInfoIdentifier.getFieldKey(), new String[] { str1 });
          } catch (FieldDataInvalidException fieldDataInvalidException) {
            logger1 = logger;
            level = Level.SEVERE;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.loggingName);
            stringBuilder2.append(fieldDataInvalidException.getMessage());
            logger1.log(level, stringBuilder2.toString(), (Throwable)fieldDataInvalidException);
          } 
        } else if (!level.trim().isEmpty()) {
          this.wavInfoTag.addUnRecognizedField((String)level, (String)logger1);
        } 
        if (Utils.isOddLength(i) && stringBuilder.hasRemaining())
          stringBuilder.get(); 
      } catch (BufferUnderflowException bufferUnderflowException) {
        Logger logger = logger;
        Level level = Level.SEVERE;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append("LISTINFO appears corrupt, ignoring:");
        stringBuilder1.append(bufferUnderflowException.getMessage());
        logger.log(level, stringBuilder1.toString(), bufferUnderflowException);
        return false;
      } 
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavInfoChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */