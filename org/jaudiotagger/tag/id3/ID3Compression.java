package org.jaudiotagger.tag.id3;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jaudiotagger.tag.InvalidFrameException;

public class ID3Compression {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  public static ByteBuffer uncompress(String paramString1, String paramString2, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString2);
    stringBuilder.append(":About to decompress ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" bytes, expect result to be:");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" bytes");
    logger.config(stringBuilder.toString());
    byte[] arrayOfByte1 = new byte[paramInt1];
    byte[] arrayOfByte2 = new byte[paramInt2];
    paramInt1 = paramByteBuffer.position();
    paramByteBuffer.get(arrayOfByte2, 0, paramInt2);
    paramByteBuffer.position(paramInt1);
    Inflater inflater = new Inflater();
    inflater.setInput(arrayOfByte2);
    try {
      paramInt1 = inflater.inflate(arrayOfByte1);
      Logger logger1 = logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append(paramString2);
      stringBuilder1.append(":Decompressed to ");
      stringBuilder1.append(paramInt1);
      stringBuilder1.append(" bytes");
      logger1.config(stringBuilder1.toString());
      inflater.end();
      return ByteBuffer.wrap(arrayOfByte1);
    } catch (DataFormatException dataFormatException) {
      Logger logger1 = logger;
      Level level = Level.CONFIG;
      StringBuilder stringBuilder1 = new StringBuilder(xveccWbRzqx.RVJcspCJADtu);
      stringBuilder1.append(paramString1);
      logger1.log(level, stringBuilder1.toString(), dataFormatException);
      paramByteBuffer.position(paramByteBuffer.position() + paramInt2);
      throw new InvalidFrameException(MessageFormat.format("Unable to decompress frame {0} in file {1} because {2}", new Object[] { paramString1, paramString2, dataFormatException.getMessage() }));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3Compression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */