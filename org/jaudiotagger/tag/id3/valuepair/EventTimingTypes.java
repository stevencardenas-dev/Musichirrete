package org.jaudiotagger.tag.id3.valuepair;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import org.jaudiotagger.tag.datatype.AbstractIntStringValuePair;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class EventTimingTypes extends AbstractIntStringValuePair {
  private static EventTimingTypes eventTimingTypes;
  
  private EventTimingTypes() {
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(0), "Padding (has no meaning)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(1), "End of initial silence");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(2), "Intro start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(3), tlzLOCPTHRhep.fnDeNz);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(4), "Outro start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(5), "Outro end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(6), "Verse start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(7), "Refrain start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(8), "Interlude start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(9), "Theme start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(10), "Variation start");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(11), "Key change");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(12), "Time change");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(13), "Momentary unwanted noise (Snap, Crackle & Pop)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(14), "Sustained noise");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(15), "Sustained noise end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(16), "Intro end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(17), "Main part end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(18), "Verse end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(19), "Refrain end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(20), "Theme end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(21), "Profanity");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(22), "Profanity end");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(224), "Not predefined synch 0");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(225), "Not predefined synch 1");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(226), xveccWbRzqx.qpNXPeBCSG);
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(227), "Not predefined synch 3");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(228), "Not predefined synch 4");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(229), "Not predefined synch 5");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(230), "Not predefined synch 6");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(231), "Not predefined synch 7");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(232), "Not predefined synch 8");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(233), "Not predefined synch 9");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(234), "Not predefined synch A");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(235), "Not predefined synch B");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(236), "Not predefined synch C");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(237), "Not predefined synch D");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(238), "Not predefined synch E");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(239), "Not predefined synch F");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(253), "Audio end (start of silence)");
    ((AbstractValuePair)this).idToValue.put(Integer.valueOf(254), "Audio file ends");
    createMaps();
  }
  
  public static EventTimingTypes getInstanceOf() {
    if (eventTimingTypes == null)
      eventTimingTypes = new EventTimingTypes(); 
    return eventTimingTypes;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\EventTimingTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */