package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringDate;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;
import org.jaudiotagger.tag.id3.ID3TextEncodingConversion;

public class FrameBodyOWNE extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyOWNE() {}
  
  public FrameBodyOWNE(byte paramByte, String paramString1, String paramString2, String paramString3) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("PricePaid", paramString1);
    setObjectValue("PurchaseDate", paramString2);
    setObjectValue("SellerName", paramString3);
  }
  
  public FrameBodyOWNE(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyOWNE(FrameBodyOWNE paramFrameBodyOWNE) {
    super(paramFrameBodyOWNE);
  }
  
  public String getIdentifier() {
    return "OWNE";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringNullTerminated("PricePaid", this));
    this.objectList.add(new StringDate("PurchaseDate", this));
    this.objectList.add(new TextEncodedStringSizeTerminated("SellerName", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    setTextEncoding(ID3TextEncodingConversion.getTextEncoding(getHeader(), getTextEncoding()));
    if (!((AbstractString)getObject("SellerName")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyOWNE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */