package org.jaudiotagger.audio.dsf;

import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import org.jaudiotagger.tag.reference.ID3V2Version;

public class Dsf {
  public static Tag createDefaultTag() {
    return (Tag)((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V24) ? new ID3v24Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V23) ? new ID3v23Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V22) ? new ID3v22Tag() : new ID3v24Tag())));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\Dsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */