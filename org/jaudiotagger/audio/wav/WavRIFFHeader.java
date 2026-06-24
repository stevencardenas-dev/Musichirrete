package org.jaudiotagger.audio.wav;

import ga1;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;

public class WavRIFFHeader {
  public static final String RIFF_SIGNATURE = "RIFF";
  
  public static final String WAVE_SIGNATURE = "WAVE";
  
  public static boolean isValidHeader(String paramString, FileChannel paramFileChannel) {
    StringBuilder stringBuilder1;
    long l1 = paramFileChannel.size();
    long l2 = paramFileChannel.position();
    int i = IffHeaderChunk.FORM_HEADER_LENGTH;
    if (l1 - l2 >= i) {
      ByteBuffer byteBuffer = Utils.readFileDataIntoBufferLE(paramFileChannel, i);
      if (Utils.readFourBytesAsChars(byteBuffer).equals("RIFF")) {
        Logger logger = IffHeaderChunk.logger;
        stringBuilder1 = ga1.l(paramString, ":Header:File:Size:");
        stringBuilder1.append(byteBuffer.getInt());
        logger.finer(stringBuilder1.toString());
        if (Utils.readFourBytesAsChars(byteBuffer).equals("WAVE"))
          return true; 
      } 
      return false;
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append((String)stringBuilder1);
    stringBuilder2.append(":This is not a WAV File (<12 bytes)");
    throw new CannotReadException(stringBuilder2.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavRIFFHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */