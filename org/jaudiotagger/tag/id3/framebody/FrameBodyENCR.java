package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyENCR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyENCR() {
    setObjectValue("Owner", "");
    setObjectValue("MethodSymbol", Byte.valueOf((byte)0));
    setObjectValue("EncryptionInfo", new byte[0]);
  }
  
  public FrameBodyENCR(String paramString, byte paramByte, byte[] paramArrayOfbyte) {
    setObjectValue("Owner", paramString);
    setObjectValue("MethodSymbol", Byte.valueOf(paramByte));
    setObjectValue("EncryptionInfo", paramArrayOfbyte);
  }
  
  public FrameBodyENCR(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyENCR(FrameBodyENCR paramFrameBodyENCR) {
    super(paramFrameBodyENCR);
  }
  
  public String getIdentifier() {
    return jHxlGgUTadw.eZibzohEIQWICX;
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void setOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Owner", this));
    this.objectList.add(new NumberFixedLength("MethodSymbol", this, 1));
    this.objectList.add(new ByteArraySizeTerminated("EncryptionInfo", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyENCR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */