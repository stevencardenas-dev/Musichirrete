package org.jaudiotagger.audio.mp4.atom;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.mp4.Mp4AtomIdentifier;

public class Mp4MetaBox extends AbstractMp4Box {
  public static final int FLAGS_LENGTH = 4;
  
  public Mp4MetaBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    this.header = paramMp4BoxHeader;
    this.dataBuffer = paramByteBuffer;
  }
  
  public static Mp4MetaBox createiTunesStyleMetaBox(int paramInt) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(Mp4AtomIdentifier.META.getFieldName());
    mp4BoxHeader.setLength(paramInt + 12);
    return new Mp4MetaBox(mp4BoxHeader, ByteBuffer.allocate(4));
  }
  
  public void processData() {
    byte[] arrayOfByte = new byte[4];
    this.dataBuffer.get(arrayOfByte);
    if (arrayOfByte[0] == 0)
      return; 
    throw new CannotReadException("Expect data in meta box to be null");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4MetaBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */