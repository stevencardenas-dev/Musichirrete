package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetEncoder;
import java.text.MessageFormat;
import l0;
import mk;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;
import org.jaudiotagger.tag.id3.AbstractTagItem;

public abstract class AbstractFrameBodyUrlLink extends AbstractID3v2FrameBody {
  public AbstractFrameBodyUrlLink() {}
  
  public AbstractFrameBodyUrlLink(String paramString) {
    setObjectValue("URLLink", paramString);
  }
  
  public AbstractFrameBodyUrlLink(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public AbstractFrameBodyUrlLink(AbstractFrameBodyUrlLink paramAbstractFrameBodyUrlLink) {
    super(paramAbstractFrameBodyUrlLink);
  }
  
  private String encodeURL(String paramString) {
    StringBuffer stringBuffer;
    try {
      String[] arrayOfString = paramString.split("(?<!/)/(?!/)", -1);
      stringBuffer = new StringBuffer();
      this(arrayOfString[0]);
      for (byte b = 1; b < arrayOfString.length; b++) {
        stringBuffer.append("/");
        stringBuffer.append(URLEncoder.encode(arrayOfString[b], "utf-8"));
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {}
    return stringBuffer.toString();
  }
  
  public String getUrlLink() {
    return (String)getObjectValue("URLLink");
  }
  
  public String getUserFriendlyValue() {
    return getUrlLink();
  }
  
  public void setUrlLink(String paramString) {
    if (paramString != null) {
      setObjectValue("URLLink", paramString);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated("URLLink", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    CharsetEncoder charsetEncoder = mk.b.newEncoder();
    String str = getUrlLink();
    if (!charsetEncoder.canEncode(str)) {
      setUrlLink(encodeURL(str));
      if (!charsetEncoder.canEncode(getUrlLink())) {
        AbstractTagItem.logger.warning(MessageFormat.format("Unable to save url:{0} because cannot encode all characters setting to blank instead", new Object[] { str }));
        setUrlLink("");
      } else {
        AbstractTagItem.logger.warning(MessageFormat.format("Url:{0} saved in encoded form as {1}", new Object[] { str, getUrlLink() }));
      } 
    } 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\AbstractFrameBodyUrlLink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */