package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.reference.MusicalKey;

public class FrameBodyTKEY extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTKEY() {}
  
  public FrameBodyTKEY(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTKEY(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTKEY(FrameBodyTKEY paramFrameBodyTKEY) {
    super(paramFrameBodyTKEY);
  }
  
  public String getIdentifier() {
    return "TKEY";
  }
  
  public boolean isValid() {
    return MusicalKey.isValid(getFirstTextValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTKEY.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */