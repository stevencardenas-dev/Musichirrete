package org.jaudiotagger.tag.id3.framebody;

import androidx.profileinstaller.Vuyf.nBRIsU;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;

public class FrameBodyWXXX extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public static final String URL_DISCOGS_ARTIST_SITE = "DISCOGS_ARTIST";
  
  public static final String URL_DISCOGS_RELEASE_SITE = "DISCOGS_RELEASE";
  
  public static final String URL_LYRICS_SITE = "LYRICS_SITE";
  
  public static final String URL_OFFICIAL_RELEASE_SITE = "OFFICIAL_RELEASE";
  
  public static final String URL_WIKIPEDIA_ARTIST_SITE = "WIKIPEDIA_ARTIST";
  
  public static final String URL_WIKIPEDIA_RELEASE_SITE = "WIKIPEDIA_RELEASE";
  
  public FrameBodyWXXX() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Description", "");
    setObjectValue("URLLink", "");
  }
  
  public FrameBodyWXXX(byte paramByte, String paramString1, String paramString2) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Description", paramString1);
    setObjectValue("URLLink", paramString2);
  }
  
  public FrameBodyWXXX(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWXXX(FrameBodyWXXX paramFrameBodyWXXX) {
    super(paramFrameBodyWXXX);
  }
  
  public void addUrlLink(String paramString) {
    ((TextEncodedStringSizeTerminated)getObject("URLLink")).addValue(paramString);
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getFirstUrlLink() {
    return ((TextEncodedStringSizeTerminated)getObject("URLLink")).getValueAtIndex(0);
  }
  
  public String getIdentifier() {
    return nBRIsU.XUzXJmQ;
  }
  
  public String getUrlLinkAtIndex(int paramInt) {
    return ((TextEncodedStringSizeTerminated)getObject("URLLink")).getValueAtIndex(paramInt);
  }
  
  public String getUrlLinkWithoutTrailingNulls() {
    return ((TextEncodedStringSizeTerminated)getObject("URLLink")).getValueWithoutTrailingNull();
  }
  
  public List<String> getUrlLinks() {
    return ((TextEncodedStringSizeTerminated)getObject("URLLink")).getValues();
  }
  
  public void setDescription(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new StringSizeTerminated("URLLink", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((AbstractString)getObject("Description")).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWXXX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */