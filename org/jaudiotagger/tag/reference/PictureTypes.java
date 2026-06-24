package org.jaudiotagger.tag.reference;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public class PictureTypes extends AbstractIntStringValuePair {
  public static final Integer DEFAULT_ID = Integer.valueOf(3);
  
  public static final String DEFAULT_VALUE = "Cover (front)";
  
  public static final int PICTURE_TYPE_FIELD_SIZE = 1;
  
  private static PictureTypes pictureTypes;
  
  private PictureTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Other");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "32x32 pixels 'file icon' (PNG only)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Other file icon");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), "Cover (front)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "Cover (back)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "Leaflet page");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "Media (e.g. label side of CD)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "Lead artist/lead performer/soloist");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "Artist/performer");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(9), "Conductor");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(10), "Band/Orchestra");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(11), "Composer");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(12), "Lyricist/text writer");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(13), "Recording Location");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(14), "During recording");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(15), "During performance");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(16), "Movie/video screen capture");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(17), "A bright coloured fish");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(18), "Illustration");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(19), "Band/artist logotype");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(20), fXMDNeMWaILNVh.mJalMXBX);
    createMaps();
  }
  
  public static PictureTypes getInstanceOf() {
    if (pictureTypes == null)
      pictureTypes = new PictureTypes(); 
    return pictureTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\PictureTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */