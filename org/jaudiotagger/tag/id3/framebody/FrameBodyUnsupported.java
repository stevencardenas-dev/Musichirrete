package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyUnsupported extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody, ID3v22FrameBody {
  private String identifier = "";
  
  public FrameBodyUnsupported() {}
  
  public FrameBodyUnsupported(String paramString) {}
  
  public FrameBodyUnsupported(String paramString, byte[] paramArrayOfbyte) {
    setObjectValue(oXrNDUqUkE.sJzWxUsI, paramArrayOfbyte);
  }
  
  public FrameBodyUnsupported(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyUnsupported(FrameBodyUnsupported paramFrameBodyUnsupported) {
    super(paramFrameBodyUnsupported);
    this.identifier = paramFrameBodyUnsupported.identifier;
  }
  
  public FrameBodyUnsupported(byte[] paramArrayOfbyte) {
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof FrameBodyUnsupported))
      return false; 
    FrameBodyUnsupported frameBodyUnsupported = (FrameBodyUnsupported)paramObject;
    return (this.identifier.equals(frameBodyUnsupported.identifier) && super.equals(paramObject));
  }
  
  public String getIdentifier() {
    return this.identifier;
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
  
  public String toString() {
    return getIdentifier();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyUnsupported.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */