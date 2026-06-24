package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringDate;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;

public class FrameBodyCOMR extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyCOMR() {}
  
  public FrameBodyCOMR(byte paramByte1, String paramString1, String paramString2, String paramString3, byte paramByte2, String paramString4, String paramString5, String paramString6, byte[] paramArrayOfbyte) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte1));
    setObjectValue("PriceString", paramString1);
    setObjectValue("ValidUntil", paramString2);
    setObjectValue("ContactURL", paramString3);
    setObjectValue("RecievedAs", Byte.valueOf(paramByte2));
    setObjectValue("SellerName", paramString4);
    setObjectValue("Description", paramString5);
    setObjectValue("MIMEType", paramString6);
    setObjectValue("SellerLogo", paramArrayOfbyte);
  }
  
  public FrameBodyCOMR(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyCOMR(FrameBodyCOMR paramFrameBodyCOMR) {
    super(paramFrameBodyCOMR);
  }
  
  public String getIdentifier() {
    return "COMR";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void getOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringNullTerminated("PriceString", this));
    this.objectList.add(new StringDate("ValidUntil", this));
    this.objectList.add(new StringNullTerminated(oXrNDUqUkE.zjhaq, this));
    this.objectList.add(new NumberHashMap("RecievedAs", this, 1));
    this.objectList.add(new TextEncodedStringNullTerminated("SellerName", this));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new StringNullTerminated("MIMEType", this));
    this.objectList.add(new ByteArraySizeTerminated("SellerLogo", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((AbstractString)getObject("SellerName")).canBeEncoded())
      setTextEncoding((byte)1); 
    if (!((AbstractString)getObject("Description")).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyCOMR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */