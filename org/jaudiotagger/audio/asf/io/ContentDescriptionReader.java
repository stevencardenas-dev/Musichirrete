package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.ContentDescription;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class ContentDescriptionReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_CONTENTDESCRIPTION };
  
  private int[] getStringSizes(InputStream paramInputStream) {
    int[] arrayOfInt = new int[5];
    for (byte b = 0; b < 5; b++)
      arrayOfInt[b] = Utils.readUINT16(paramInputStream); 
    return arrayOfInt;
  }
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    int[] arrayOfInt = getStringSizes(paramInputStream);
    int i = arrayOfInt.length;
    String[] arrayOfString = new String[i];
    for (byte b = 0; b < i; b++) {
      int j = arrayOfInt[b];
      if (j > 0)
        arrayOfString[b] = Utils.readFixedSizeUTF16Str(paramInputStream, j); 
    } 
    ContentDescription contentDescription = new ContentDescription(paramLong, bigInteger);
    if (arrayOfInt[0] > 0)
      contentDescription.setTitle(arrayOfString[0]); 
    if (arrayOfInt[1] > 0)
      contentDescription.setAuthor(arrayOfString[1]); 
    if (arrayOfInt[2] > 0)
      contentDescription.setCopyright(arrayOfString[2]); 
    if (arrayOfInt[3] > 0)
      contentDescription.setComment(arrayOfString[3]); 
    if (arrayOfInt[4] > 0)
      contentDescription.setRating(arrayOfString[4]); 
    return (Chunk)contentDescription;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ContentDescriptionReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */