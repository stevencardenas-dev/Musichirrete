package org.jaudiotagger.tag.id3.valuepair;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class EventTimingTimestampTypes extends AbstractIntStringValuePair {
  public static final int TIMESTAMP_KEY_FIELD_SIZE = 1;
  
  private static EventTimingTimestampTypes eventTimingTimestampTypes;
  
  private EventTimingTimestampTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "Absolute time using MPEG [MPEG] frames as unit");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Absolute time using milliseconds as unit");
    createMaps();
  }
  
  public static EventTimingTimestampTypes getInstanceOf() {
    if (eventTimingTimestampTypes == null)
      eventTimingTimestampTypes = new EventTimingTimestampTypes(); 
    return eventTimingTimestampTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\EventTimingTimestampTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */