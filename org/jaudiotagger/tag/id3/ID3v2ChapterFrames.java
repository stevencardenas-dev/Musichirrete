package org.jaudiotagger.tag.id3;

import java.util.TreeSet;
import org.jaudiotagger.tag.datatype.AbstractValuePair;

public class ID3v2ChapterFrames extends ID3Frames {
  public static final String FRAME_ID_CHAPTER = "CHAP";
  
  public static final String FRAME_ID_TABLE_OF_CONTENT = "CTOC";
  
  private static ID3v2ChapterFrames id3v2ChapterFrames;
  
  private ID3v2ChapterFrames() {
    ((AbstractValuePair)this).idToValue.put("CHAP", "Chapter");
    ((AbstractValuePair)this).idToValue.put("CTOC", "Table of content");
    createMaps();
    this.multipleFrames = new TreeSet<String>();
    this.discardIfFileAlteredFrames = new TreeSet<String>();
  }
  
  public static ID3v2ChapterFrames getInstanceOf() {
    if (id3v2ChapterFrames == null)
      id3v2ChapterFrames = new ID3v2ChapterFrames(); 
    return id3v2ChapterFrames;
  }
  
  public void setITunes12_6WorkGroupingMode(boolean paramBoolean) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v2ChapterFrames.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */