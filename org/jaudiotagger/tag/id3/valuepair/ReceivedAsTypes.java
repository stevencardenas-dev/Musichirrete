package org.jaudiotagger.tag.id3.valuepair;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class ReceivedAsTypes extends AbstractIntStringValuePair {
  public static final int RECEIVED_AS_FIELD_SIZE = 1;
  
  private static ReceivedAsTypes receivedAsTypes;
  
  private ReceivedAsTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Other");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "Standard CD album with other songs");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Compressed audio on CD");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), "File over the Internet");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "Stream over the Internet");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "As note sheets");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "As note sheets in a book with other sheets");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "Music on other media");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "Non-musical merchandise");
    createMaps();
  }
  
  public static ReceivedAsTypes getInstanceOf() {
    if (receivedAsTypes == null)
      receivedAsTypes = new ReceivedAsTypes(); 
    return receivedAsTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\ReceivedAsTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */