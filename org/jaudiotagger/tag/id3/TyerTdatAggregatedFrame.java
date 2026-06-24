package org.jaudiotagger.tag.id3;

import java.util.Iterator;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDAT;

public class TyerTdatAggregatedFrame extends AggregatedFrame {
  public static final String ID_TYER_TDAT = "TYERTDAT";
  
  public String getContent() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<AbstractID3v2Frame> iterator = this.frames.iterator();
    stringBuilder.append(((AbstractID3v2Frame)iterator.next()).getContent());
    AbstractID3v2Frame abstractID3v2Frame = iterator.next();
    if (abstractID3v2Frame.getContent().length() == 4) {
      stringBuilder.append("-");
      stringBuilder.append(abstractID3v2Frame.getContent().substring(2, 4));
      if (!((FrameBodyTDAT)abstractID3v2Frame.getBody()).isMonthOnly()) {
        stringBuilder.append("-");
        stringBuilder.append(abstractID3v2Frame.getContent().substring(0, 2));
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\TyerTdatAggregatedFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */