package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;

public class Mp4StsdBox extends AbstractMp4Box {
  public static final int NO_OF_DESCRIPTIONS_POS = 4;
  
  public static final int NO_OF_DESCRIPTIONS_POS_LENGTH = 4;
  
  public static final int OTHER_FLAG_LENGTH = 3;
  
  public static final int OTHER_FLAG_POS = 1;
  
  public static final int VERSION_FLAG_LENGTH = 1;
  
  public static final int VERSION_FLAG_POS = 0;
  
  public Mp4StsdBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
  }
  
  public void processData() {
    ByteBuffer byteBuffer = this.dataBuffer;
    byteBuffer.position(byteBuffer.position() + 8);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4StsdBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */