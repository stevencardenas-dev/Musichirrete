package org.jaudiotagger.tag.id3.valuepair;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class ChannelTypes extends AbstractIntStringValuePair {
  private static ChannelTypes channelTypes;
  
  private ChannelTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Other");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "Master volume");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Front right");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), "Front left");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "Back right");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "Back left");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "Front centre");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "Back centre");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "Subwoofer");
    createMaps();
  }
  
  public static ChannelTypes getInstanceOf() {
    if (channelTypes == null)
      channelTypes = new ChannelTypes(); 
    return channelTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\ChannelTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */