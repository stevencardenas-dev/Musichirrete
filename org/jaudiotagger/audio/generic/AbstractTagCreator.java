package org.jaudiotagger.audio.generic;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.Tag;

public abstract class AbstractTagCreator {
  public ByteBuffer convertMetadata(Tag paramTag) {
    return convertMetadata(paramTag, false);
  }
  
  public abstract ByteBuffer convertMetadata(Tag paramTag, boolean paramBoolean);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AbstractTagCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */