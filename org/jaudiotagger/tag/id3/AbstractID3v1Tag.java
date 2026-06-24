package org.jaudiotagger.tag.id3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import m60;
import r3.IKWi.AyxAR;
import uc1;

public abstract class AbstractID3v1Tag extends AbstractID3Tag {
  protected static final byte END_OF_FIELD = 0;
  
  protected static final int FIELD_ALBUM_LENGTH = 30;
  
  protected static final int FIELD_ALBUM_POS = 63;
  
  protected static final int FIELD_ARTIST_LENGTH = 30;
  
  protected static final int FIELD_ARTIST_POS = 33;
  
  protected static final int FIELD_GENRE_LENGTH = 1;
  
  protected static final int FIELD_GENRE_POS = 127;
  
  protected static final int FIELD_TAGID_LENGTH = 3;
  
  protected static final int FIELD_TAGID_POS = 0;
  
  protected static final int FIELD_TITLE_LENGTH = 30;
  
  protected static final int FIELD_TITLE_POS = 3;
  
  protected static final int FIELD_YEAR_LENGTH = 4;
  
  protected static final int FIELD_YEAR_POS = 93;
  
  public static final String TAG = "TAG";
  
  protected static final int TAG_DATA_LENGTH = 125;
  
  protected static final byte[] TAG_ID;
  
  protected static final int TAG_LENGTH = 128;
  
  protected static final String TYPE_ALBUM = "album";
  
  protected static final String TYPE_ARTIST = "artist";
  
  protected static final String TYPE_GENRE = "genre";
  
  protected static final String TYPE_TITLE = "title";
  
  protected static final String TYPE_YEAR = "year";
  
  protected static Pattern endofStringPattern;
  
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  static {
    endofStringPattern = Pattern.compile(AyxAR.cJxlRUuSf);
    TAG_ID = new byte[] { 84, 65, 71 };
  }
  
  public AbstractID3v1Tag() {}
  
  public AbstractID3v1Tag(AbstractID3v1Tag paramAbstractID3v1Tag) {
    super(paramAbstractID3v1Tag);
  }
  
  public static boolean seekForV1OrV11Tag(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[3];
    paramByteBuffer.get(arrayOfByte, 0, 3);
    return Arrays.equals(arrayOfByte, TAG_ID);
  }
  
  public void delete(uc1 paramuc1) {
    logger.config("Deleting ID3v1 from file if exists");
    FileChannel fileChannel = paramuc1.a();
    if (paramuc1.d() >= 128L) {
      fileChannel.position(paramuc1.d() - 128L);
      ByteBuffer byteBuffer = ByteBuffer.allocate(128);
      fileChannel.read(byteBuffer);
      byteBuffer.rewind();
      if (seekForV1OrV11Tag(byteBuffer))
        try {
          logger.config("Deleted ID3v1 tag");
          paramuc1.k(paramuc1.d() - 128L);
          return;
        } catch (IOException iOException) {
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder("Unable to delete existing ID3v1 Tag:");
          stringBuilder.append(iOException.getMessage());
          logger.severe(stringBuilder.toString());
          return;
        }  
      logger.config("Unable to find ID3v1 tag to deleteField");
      return;
    } 
    m60.i("File not large enough to contain a tag");
  }
  
  public int getSize() {
    return 128;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractID3v1Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */