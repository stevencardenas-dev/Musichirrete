package org.jaudiotagger.tag.vorbiscomment;

import c61;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.TagField;

public class VorbisCommentReader {
  public static final int FIELD_COMMENT_LENGTH_LENGTH = 4;
  
  public static final int FIELD_USER_COMMENT_LIST_LENGTH = 4;
  
  public static final int FIELD_VENDOR_LENGTH_LENGTH = 4;
  
  public static final int FIELD_VENDOR_LENGTH_POS = 0;
  
  public static final int FIELD_VENDOR_STRING_POS = 4;
  
  private static final int JAUDIOTAGGER_MAX_COMMENT_LENGTH = 10000000;
  
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.tag.vorbiscomment.VorbisCommentReader");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public VorbisCommentTag read(byte[] paramArrayOfbyte, boolean paramBoolean, c61 paramc61) {
    int j;
    VorbisCommentTag vorbisCommentTag = new VorbisCommentTag();
    byte[] arrayOfByte2 = new byte[4];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte2, 0, 4);
    int i = Utils.getIntLE(arrayOfByte2);
    arrayOfByte2 = new byte[i];
    System.arraycopy(paramArrayOfbyte, 4, arrayOfByte2, 0, i);
    vorbisCommentTag.setVendor(new String(arrayOfByte2, "UTF-8"));
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Vendor is:");
    stringBuilder2.append(vorbisCommentTag.getVendor());
    logger.config(stringBuilder2.toString());
    byte[] arrayOfByte1 = new byte[4];
    System.arraycopy(paramArrayOfbyte, i + 4, arrayOfByte1, 0, 4);
    i += 8;
    int k = Utils.getIntLE(arrayOfByte1);
    logger = logger;
    StringBuilder stringBuilder1 = new StringBuilder("Number of user comments:");
    stringBuilder1.append(k);
    logger.config(stringBuilder1.toString());
    byte b = 0;
    while (true) {
      j = i;
      if (b < k) {
        byte[] arrayOfByte4 = new byte[4];
        System.arraycopy(paramArrayOfbyte, i, arrayOfByte4, 0, 4);
        j = i + 4;
        i = Utils.getIntLE(arrayOfByte4);
        logger = logger;
        StringBuilder stringBuilder3 = new StringBuilder("Next Comment Length:");
        stringBuilder3.append(i);
        logger.config(stringBuilder3.toString());
        if (i > 10000000) {
          if (paramc61 != null) {
            logger = logger;
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(paramc61.toString());
            stringBuilder3.append(":");
            stringBuilder3.append(MessageFormat.format("Comment field length is very large {0} , assuming comment is corrupt", new Object[] { Integer.valueOf(i) }));
            logger.warning(stringBuilder3.toString());
            break;
          } 
          logger.warning(MessageFormat.format("Comment field length is very large {0} , assuming comment is corrupt", new Object[] { Integer.valueOf(i) }));
          break;
        } 
        if (i > paramArrayOfbyte.length - j) {
          if (paramc61 != null) {
            Logger logger2 = logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramc61.toString());
            stringBuilder.append(":");
            stringBuilder.append(MessageFormat.format("Comment field length {0} is larger than remaining comment header {1} ", new Object[] { Integer.valueOf(i), Integer.valueOf(paramArrayOfbyte.length - j) }));
            logger2.warning(stringBuilder.toString());
            break;
          } 
          logger.warning(MessageFormat.format("Comment field length {0} is larger than remaining comment header {1} ", new Object[] { Integer.valueOf(i), Integer.valueOf(paramArrayOfbyte.length) }));
          break;
        } 
        byte[] arrayOfByte3 = new byte[i];
        System.arraycopy(paramArrayOfbyte, j, arrayOfByte3, 0, i);
        i = j + i;
        VorbisCommentTagField vorbisCommentTagField = new VorbisCommentTagField(arrayOfByte3);
        Logger logger1 = logger;
        StringBuilder stringBuilder4 = new StringBuilder("Adding:");
        stringBuilder4.append(vorbisCommentTagField.getId());
        logger1.config(stringBuilder4.toString());
        vorbisCommentTag.addField((TagField)vorbisCommentTagField);
        b++;
        continue;
      } 
      break;
    } 
    if (!paramBoolean || (paramArrayOfbyte[j] & 0x1) == 1)
      return vorbisCommentTag; 
    throw new CannotReadException(MessageFormat.format("The OGG Stream is not valid, Vorbis tag valid framing bit is wrong {0} ", new Object[] { Integer.valueOf(paramArrayOfbyte[j] & 0x1) }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisCommentReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */