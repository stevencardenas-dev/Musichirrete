package org.jaudiotagger.tag.mp4.atom;

import java.nio.ByteBuffer;
import l0;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.AbstractMp4Box;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;

public class Mp4NameBox extends AbstractMp4Box {
  public static final int FLAGS_LENGTH = 3;
  
  public static final String IDENTIFIER = "name";
  
  public static final int PRE_DATA_LENGTH = 4;
  
  public static final int VERSION_LENGTH = 1;
  
  private String name;
  
  public Mp4NameBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    if (paramMp4BoxHeader.getId().equals("name")) {
      paramByteBuffer = paramByteBuffer.slice();
      this.dataBuffer = paramByteBuffer;
      this.name = Utils.getString(paramByteBuffer, 4, paramMp4BoxHeader.getDataLength() - 4, paramMp4BoxHeader.getEncoding());
      return;
    } 
    l0.h("Unable to process name box because identifier is:", paramMp4BoxHeader.getId());
    throw null;
  }
  
  public String getName() {
    return this.name;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\atom\Mp4NameBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */