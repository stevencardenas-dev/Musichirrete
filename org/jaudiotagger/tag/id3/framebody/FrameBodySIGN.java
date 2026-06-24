package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberFixedLength;

public class FrameBodySIGN extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  public FrameBodySIGN() {}
  
  public FrameBodySIGN(byte paramByte, byte[] paramArrayOfbyte) {
    setObjectValue("GroupSymbol", Byte.valueOf(paramByte));
    setObjectValue(PwbbJfsdcHrAjW.eXtmuVtBTwv, paramArrayOfbyte);
  }
  
  public FrameBodySIGN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodySIGN(FrameBodySIGN paramFrameBodySIGN) {
    super(paramFrameBodySIGN);
  }
  
  public byte getGroupSymbol() {
    return (getObjectValue("GroupSymbol") != null) ? ((Byte)getObjectValue("GroupSymbol")).byteValue() : 0;
  }
  
  public String getIdentifier() {
    return "SIGN";
  }
  
  public byte[] getSignature() {
    return (byte[])getObjectValue("Signature");
  }
  
  public void setGroupSymbol(byte paramByte) {
    setObjectValue("GroupSymbol", Byte.valueOf(paramByte));
  }
  
  public void setSignature(byte[] paramArrayOfbyte) {
    setObjectValue("Signature", paramArrayOfbyte);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberFixedLength("GroupSymbol", this, 1));
    this.objectList.add(new ByteArraySizeTerminated("Signature", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodySIGN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */