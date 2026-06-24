package org.jaudiotagger.tag.datatype;

import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYTC;

public class SynchronisedTempoCodeList extends AbstractDataTypeList<SynchronisedTempoCode> {
  public SynchronisedTempoCodeList(SynchronisedTempoCodeList paramSynchronisedTempoCodeList) {
    super(paramSynchronisedTempoCodeList);
  }
  
  public SynchronisedTempoCodeList(FrameBodySYTC paramFrameBodySYTC) {
    super("SynchronisedTempoList", (AbstractTagFrameBody)paramFrameBodySYTC);
  }
  
  public SynchronisedTempoCode createListElement() {
    return new SynchronisedTempoCode("SynchronisedTempo", this.frameBody);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\SynchronisedTempoCodeList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */