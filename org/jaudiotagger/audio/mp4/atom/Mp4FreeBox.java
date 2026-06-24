package org.jaudiotagger.audio.mp4.atom;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import k91;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.Mp4AtomIdentifier;

public class Mp4FreeBox extends AbstractMp4Box {
  public Mp4FreeBox(int paramInt) {
    try {
      Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader();
      this();
      this.header = mp4BoxHeader;
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream.write(Utils.getSizeBEInt32(paramInt + 8));
      byteArrayOutputStream.write(Mp4AtomIdentifier.FREE.getFieldName().getBytes(mk.b));
      this.header.update(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
      byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      for (byte b = 0; b < paramInt; b++)
        byteArrayOutputStream.write(0); 
      this.dataBuffer = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
      return;
    } catch (IOException iOException) {
      k91.n(iOException);
      throw null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4FreeBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */