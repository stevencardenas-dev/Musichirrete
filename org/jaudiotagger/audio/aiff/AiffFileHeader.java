package org.jaudiotagger.audio.aiff;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import wf2;
import x41;

public class AiffFileHeader {
  private static final String FORM = "FORM";
  
  private static Logger logger;
  
  private String loggingName;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.aiff.AudioFileHeader");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public AiffFileHeader(String paramString) {
    this.loggingName = paramString;
  }
  
  private void readFileType(ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    AiffType aiffType = AiffType.AIFF;
    if (aiffType.getCode().equals(str)) {
      paramAiffAudioHeader.setFileType(aiffType);
      return;
    } 
    aiffType = AiffType.AIFC;
    if (aiffType.getCode().equals(str)) {
      paramAiffAudioHeader.setFileType(aiffType);
      return;
    } 
    throw new CannotReadException(x41.o(new StringBuilder(), this.loggingName, ":Invalid AIFF file: Incorrect file type info ", str));
  }
  
  public long readHeader(FileChannel paramFileChannel, AiffAudioHeader paramAiffAudioHeader) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(IffHeaderChunk.FORM_HEADER_LENGTH);
    byteBuffer.order(ByteOrder.BIG_ENDIAN);
    int j = paramFileChannel.read(byteBuffer);
    byteBuffer.position(0);
    if (j >= IffHeaderChunk.FORM_HEADER_LENGTH) {
      Logger logger;
      String str1 = Utils.readFourBytesAsChars(byteBuffer);
      if ("FORM".equals(str1)) {
        long l = byteBuffer.getInt();
        logger = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(this.loggingName);
        stringBuilder1.append(":Reading AIFF header size:");
        stringBuilder1.append(wf2.c(l));
        stringBuilder1.append(":File Size Should End At:");
        stringBuilder1.append(wf2.c(8L + l));
        logger.config(stringBuilder1.toString());
        readFileType(byteBuffer, paramAiffAudioHeader);
        return l;
      } 
      throw new CannotReadException(x41.o(new StringBuilder(), this.loggingName, ":Not an AIFF file: incorrect signature ", logger));
    } 
    String str = this.loggingName;
    int i = IffHeaderChunk.FORM_HEADER_LENGTH;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(":AIFF:Unable to read required number of databytes read:");
    stringBuilder.append(j);
    stringBuilder.append(":required:");
    stringBuilder.append(i);
    throw new IOException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffFileHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */