package org.jaudiotagger.tag.id3.valuepair;

import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class InterpolationTypes extends AbstractIntStringValuePair {
  private static InterpolationTypes interpolationTypes;
  
  private InterpolationTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Band");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "Linear");
    createMaps();
  }
  
  public static InterpolationTypes getInstanceOf() {
    if (interpolationTypes == null)
      interpolationTypes = new InterpolationTypes(); 
    return interpolationTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\InterpolationTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */