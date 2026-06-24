package org.jaudiotagger.tag.datatype;

import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyETCO;

public class EventTimingCodeList extends AbstractDataTypeList<EventTimingCode> {
  public EventTimingCodeList(EventTimingCodeList paramEventTimingCodeList) {
    super(paramEventTimingCodeList);
  }
  
  public EventTimingCodeList(FrameBodyETCO paramFrameBodyETCO) {
    super("TimedEventList", (AbstractTagFrameBody)paramFrameBodyETCO);
  }
  
  public EventTimingCode createListElement() {
    return new EventTimingCode("TimedEvent", this.frameBody);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\EventTimingCodeList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */