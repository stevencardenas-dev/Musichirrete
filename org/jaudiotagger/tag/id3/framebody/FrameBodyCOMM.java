package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l0;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringHashMap;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;
import org.jaudiotagger.tag.id3.ID3TextEncodingConversion;

public class FrameBodyCOMM extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public static final String DEFAULT = "";
  
  public static final String ITUNES_NORMALIZATION = "iTunNORM";
  
  public static final String MM_CUSTOM1 = "Songs-DB_Custom1";
  
  public static final String MM_CUSTOM2 = "Songs-DB_Custom2";
  
  public static final String MM_CUSTOM3 = "Songs-DB_Custom3";
  
  public static final String MM_CUSTOM4 = "Songs-DB_Custom4";
  
  public static final String MM_CUSTOM5 = "Songs-DB_Custom5";
  
  public static final String MM_OCCASION = "Songs-DB_Occasion";
  
  private static final String MM_PREFIX = "Songs-DB";
  
  public static final String MM_QUALITY = "Songs-DB_Preference";
  
  public static final String MM_TEMPO = "Songs-DB_Tempo";
  
  public FrameBodyCOMM() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Language", "eng");
    setObjectValue("Description", "");
    setObjectValue("Text", "");
  }
  
  public FrameBodyCOMM(byte paramByte, String paramString1, String paramString2, String paramString3) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Language", paramString1);
    setObjectValue("Description", paramString2);
    setObjectValue("Text", paramString3);
  }
  
  public FrameBodyCOMM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyCOMM(FrameBodyCOMM paramFrameBodyCOMM) {
    super(paramFrameBodyCOMM);
  }
  
  public void addTextValue(String paramString) {
    ((TextEncodedStringSizeTerminated)getObject("Text")).addValue(paramString);
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getFirstTextValue() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueAtIndex(0);
  }
  
  public String getIdentifier() {
    return uvJYmft.ITZb;
  }
  
  public String getLanguage() {
    return (String)getObjectValue("Language");
  }
  
  public int getNumberOfValues() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getNumberOfValues();
  }
  
  public String getText() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueAtIndex(0);
  }
  
  public String getTextWithoutTrailingNulls() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueWithoutTrailingNull();
  }
  
  public String getUserFriendlyValue() {
    return getText();
  }
  
  public String getValueAtIndex(int paramInt) {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValueAtIndex(paramInt);
  }
  
  public List<String> getValues() {
    return ((TextEncodedStringSizeTerminated)getObject("Text")).getValues();
  }
  
  public boolean isItunesFrame() {
    String str = getDescription();
    return (str != null && str.length() != 0 && str.equals("iTunNORM"));
  }
  
  public boolean isMediaMonkeyFrame() {
    String str = getDescription();
    return (str != null && str.length() != 0 && str.startsWith("Songs-DB"));
  }
  
  public void setDescription(String paramString) {
    if (paramString != null) {
      setObjectValue("Description", paramString);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setLanguage(String paramString) {
    setObjectValue("Language", paramString);
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
    this.objectList.add(new StringHashMap("Language", this, 3));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new TextEncodedStringSizeTerminated("Text", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    setTextEncoding(ID3TextEncodingConversion.getTextEncoding(getHeader(), getTextEncoding()));
    if (!((AbstractString)getObject("Text")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    if (!((AbstractString)getObject("Description")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyCOMM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */