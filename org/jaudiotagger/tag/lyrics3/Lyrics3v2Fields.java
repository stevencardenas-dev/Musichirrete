package org.jaudiotagger.tag.lyrics3;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import org.jaudiotagger.tag.datatype.AbstractStringStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class Lyrics3v2Fields extends AbstractStringStringValuePair {
  public static final String CRLF;
  
  public static final String FIELD_V2_ADDITIONAL_MULTI_LINE_TEXT = "INF";
  
  public static final String FIELD_V2_ALBUM = "EAL";
  
  public static final String FIELD_V2_ARTIST = "EAR";
  
  public static final String FIELD_V2_AUTHOR = "AUT";
  
  public static final String FIELD_V2_IMAGE = "IMG";
  
  public static final String FIELD_V2_INDICATIONS = "IND";
  
  public static final String FIELD_V2_LYRICS_MULTI_LINE_TEXT = "LYR";
  
  public static final String FIELD_V2_TRACK = "ETT";
  
  private static final byte[] crlfByte;
  
  private static Lyrics3v2Fields lyrics3Fields;
  
  static {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = 13;
    arrayOfByte[1] = 10;
    crlfByte = arrayOfByte;
    CRLF = new String(arrayOfByte);
  }
  
  private Lyrics3v2Fields() {
    ((AbstractValuePair)this).idToValue.put("IND", "Indications field");
    ((AbstractValuePair)this).idToValue.put("LYR", "Lyrics multi line text");
    ((AbstractValuePair)this).idToValue.put("INF", "Additional information multi line text");
    ((AbstractValuePair)this).idToValue.put(IGBYXeDFmKYajx.anOFurZGVj, "Lyrics/Music Author name");
    ((AbstractValuePair)this).idToValue.put("EAL", "Extended Album name");
    ((AbstractValuePair)this).idToValue.put("EAR", "Extended Artist name");
    ((AbstractValuePair)this).idToValue.put("ETT", "Extended Track Title");
    ((AbstractValuePair)this).idToValue.put("IMG", "Link to an image files");
    createMaps();
  }
  
  public static Lyrics3v2Fields getInstanceOf() {
    if (lyrics3Fields == null)
      lyrics3Fields = new Lyrics3v2Fields(); 
    return lyrics3Fields;
  }
  
  public static boolean isLyrics3v2FieldIdentifier(String paramString) {
    return (paramString.length() >= 3 && getInstanceOf().getIdToValueMap().containsKey(paramString.substring(0, 3)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\Lyrics3v2Fields.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */