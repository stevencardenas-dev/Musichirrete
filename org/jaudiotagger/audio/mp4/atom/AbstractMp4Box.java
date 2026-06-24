package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;

public class AbstractMp4Box {
  protected ByteBuffer dataBuffer;
  
  protected Mp4BoxHeader header;
  
  public ByteBuffer getData() {
    return this.dataBuffer;
  }
  
  public Mp4BoxHeader getHeader() {
    return this.header;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\AbstractMp4Box.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */