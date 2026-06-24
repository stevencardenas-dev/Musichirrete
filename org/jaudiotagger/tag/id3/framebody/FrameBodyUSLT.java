package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.Lyrics3Line;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringHashMap;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;
import org.jaudiotagger.tag.id3.ID3TextEncodingConversion;

public class FrameBodyUSLT extends AbstractID3v2FrameBody implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyUSLT() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Language", "");
    setObjectValue("Description", "");
    setObjectValue("Lyrics", "");
  }
  
  public FrameBodyUSLT(byte paramByte, String paramString1, String paramString2, String paramString3) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Language", paramString1);
    setObjectValue("Description", paramString2);
    setObjectValue("Lyrics", paramString3);
  }
  
  public FrameBodyUSLT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyUSLT(FrameBodyUSLT paramFrameBodyUSLT) {
    super(paramFrameBodyUSLT);
  }
  
  public void addLyric(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLyric());
    stringBuilder.append(paramString);
    setLyric(stringBuilder.toString());
  }
  
  public void addLyric(Lyrics3Line paramLyrics3Line) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLyric());
    stringBuilder.append(paramLyrics3Line.writeString());
    setLyric(stringBuilder.toString());
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getFirstTextValue() {
    return ((TextEncodedStringSizeTerminated)getObject("Lyrics")).getValueAtIndex(0);
  }
  
  public String getIdentifier() {
    return "USLT";
  }
  
  public String getLanguage() {
    return (String)getObjectValue("Language");
  }
  
  public String getLyric() {
    return (String)getObjectValue("Lyrics");
  }
  
  public String getUserFriendlyValue() {
    return getFirstTextValue();
  }
  
  public void setDescription(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public void setLanguage(String paramString) {
    setObjectValue("Language", paramString);
  }
  
  public void setLyric(String paramString) {
    setObjectValue("Lyrics", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringHashMap("Language", this, 3));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new TextEncodedStringSizeTerminated("Lyrics", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    setTextEncoding(ID3TextEncodingConversion.getTextEncoding(getHeader(), getTextEncoding()));
    if (!((AbstractString)getObject("Description")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    if (!((AbstractString)getObject(zLtYiJUm.kKcIjbDsr)).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyUSLT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */