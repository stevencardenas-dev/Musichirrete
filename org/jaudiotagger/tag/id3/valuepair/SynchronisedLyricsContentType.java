package org.jaudiotagger.tag.id3.valuepair;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class SynchronisedLyricsContentType extends AbstractIntStringValuePair {
  public static final int CONTENT_KEY_FIELD_SIZE = 1;
  
  private static SynchronisedLyricsContentType eventTimingTypes;
  
  private SynchronisedLyricsContentType() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "other");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "lyrics");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "text transcription");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), "movement/part name");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "events");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "chord");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "trivia");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "URLs to webpages");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "URLs to images");
    createMaps();
  }
  
  public static SynchronisedLyricsContentType getInstanceOf() {
    if (eventTimingTypes == null)
      eventTimingTypes = new SynchronisedLyricsContentType(); 
    return eventTimingTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\SynchronisedLyricsContentType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */