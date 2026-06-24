package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l0;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;
import org.jaudiotagger.tag.id3.ID3TextEncodingConversion;

public abstract class AbstractFrameBodyTextInfo extends AbstractID3v2FrameBody {
  public AbstractFrameBodyTextInfo() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", "");
  }
  
  public AbstractFrameBodyTextInfo(byte paramByte, String paramString) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Text", paramString);
  }
  
  public AbstractFrameBodyTextInfo(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public AbstractFrameBodyTextInfo(AbstractFrameBodyTextInfo paramAbstractFrameBodyTextInfo) {
    super(paramAbstractFrameBodyTextInfo);
  }
  
  public void addTextValue(String paramString) {
    ((TextEncodedStringSizeTerminated)getObject("Text")).addValue(paramString);
  }
  
  public String getFirstTextValue() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueAtIndex(0);
  }
  
  public int getNumberOfValues() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getNumberOfValues();
  }
  
  public String getText() {
    return (String)getObjectValue("Text");
  }
  
  public String getTextWithoutTrailingNulls() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueWithoutTrailingNull();
  }
  
  public String getUserFriendlyValue() {
    return getTextWithoutTrailingNulls();
  }
  
  public String getValueAtIndex(int paramInt) {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueAtIndex(paramInt);
  }
  
  public List<String> getValues() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValues();
  }
  
  public void setText(String paramString) {
    if (paramString != null) {
      setObjectValue("Text", paramString);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new TextEncodedStringSizeTerminated("Text", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    setTextEncoding(ID3TextEncodingConversion.getTextEncoding(getHeader(), getTextEncoding()));
    if (!((TextEncodedStringSizeTerminated)getObject("Text")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\AbstractFrameBodyTextInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */