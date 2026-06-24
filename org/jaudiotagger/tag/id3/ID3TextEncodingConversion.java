package org.jaudiotagger.tag.id3;

import java.util.logging.Logger;
import org.jaudiotagger.tag.TagOptionSingleton;

public class ID3TextEncodingConversion {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  private static byte convertV24textEncodingToV23textEncoding(byte paramByte) {
    if (paramByte == 2)
      return 1; 
    byte b = paramByte;
    if (paramByte == 3)
      b = 0; 
    return b;
  }
  
  public static byte getTextEncoding(AbstractTagFrame paramAbstractTagFrame, byte paramByte) {
    if (paramAbstractTagFrame == null) {
      logger.warning("Header has not yet been set for this framebody");
      return TagOptionSingleton.getInstance().isResetTextEncodingForExistingFrames() ? TagOptionSingleton.getInstance().getId3v23DefaultTextEncoding() : convertV24textEncodingToV23textEncoding(paramByte);
    } 
    return (paramAbstractTagFrame instanceof ID3v24Frame) ? (TagOptionSingleton.getInstance().isResetTextEncodingForExistingFrames() ? TagOptionSingleton.getInstance().getId3v24DefaultTextEncoding() : paramByte) : (TagOptionSingleton.getInstance().isResetTextEncodingForExistingFrames() ? TagOptionSingleton.getInstance().getId3v23DefaultTextEncoding() : convertV24textEncodingToV23textEncoding(paramByte));
  }
  
  public static byte getUnicodeTextEncoding(AbstractTagFrame paramAbstractTagFrame) {
    if (paramAbstractTagFrame == null) {
      logger.warning("Header has not yet been set for this framebody");
      return 1;
    } 
    return (paramAbstractTagFrame instanceof ID3v24Frame) ? TagOptionSingleton.getInstance().getId3v24UnicodeTextEncoding() : 1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3TextEncodingConversion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */