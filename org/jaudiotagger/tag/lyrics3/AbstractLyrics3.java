package org.jaudiotagger.tag.lyrics3;

import org.jaudiotagger.tag.id3.AbstractTag;
import org.jaudiotagger.tag.id3.ID3v1Tag;
import uc1;

public abstract class AbstractLyrics3 extends AbstractTag {
  public AbstractLyrics3() {}
  
  public AbstractLyrics3(AbstractLyrics3 paramAbstractLyrics3) {
    super(paramAbstractLyrics3);
  }
  
  public void delete(uc1 paramuc1) {
    new ID3v1Tag();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\AbstractLyrics3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */