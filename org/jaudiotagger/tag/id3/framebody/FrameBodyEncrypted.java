package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyEncrypted extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  private String identifier;
  
  public FrameBodyEncrypted(String paramString) {
    this.identifier = paramString;
  }
  
  public FrameBodyEncrypted(String paramString, ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
    this.identifier = paramString;
  }
  
  public FrameBodyEncrypted(FrameBodyEncrypted paramFrameBodyEncrypted) {
    super(paramFrameBodyEncrypted);
    this.identifier = null;
  }
  
  public String getIdentifier() {
    return this.identifier;
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyEncrypted.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */