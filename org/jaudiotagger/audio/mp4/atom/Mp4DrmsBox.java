package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;

public class Mp4DrmsBox extends AbstractMp4Box {
  public Mp4DrmsBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
  }
  
  public void processData() {
    while (this.dataBuffer.hasRemaining()) {
      byte b2;
      if (this.dataBuffer.get() != 101)
        continue; 
      ByteBuffer byteBuffer = this.dataBuffer.slice();
      byte b1 = byteBuffer.get();
      boolean bool = false;
      if (b1 == 115) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if (byteBuffer.get() == 100) {
        b2 = 1;
      } else {
        b2 = 0;
      } 
      if (byteBuffer.get() == 115)
        bool = true; 
      if ((b1 & b2 & bool) != 0) {
        byteBuffer = this.dataBuffer;
        byteBuffer.position(byteBuffer.position() - 5);
        break;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4DrmsBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */