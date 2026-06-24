package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringHashMap;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public class FrameBodySYLT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodySYLT() {}
  
  public FrameBodySYLT(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, byte[] paramArrayOfbyte) {
    setObjectValue("TextEncoding", Integer.valueOf(paramInt1));
    setObjectValue("Language", paramString1);
    setObjectValue("TimeStampFormat", Integer.valueOf(paramInt2));
    setObjectValue("contentType", Integer.valueOf(paramInt3));
    setObjectValue("Description", paramString2);
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public FrameBodySYLT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodySYLT(FrameBodySYLT paramFrameBodySYLT) {
    super(paramFrameBodySYLT);
  }
  
  public int getContentType() {
    return ((Number)getObjectValue("contentType")).intValue();
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getIdentifier() {
    return "SYLT";
  }
  
  public String getLanguage() {
    return (String)getObjectValue("Language");
  }
  
  public byte[] getLyrics() {
    return (byte[])getObjectValue("Data");
  }
  
  public int getTimeStampFormat() {
    return ((Number)getObjectValue(hrSTyFuSIm.IZvwZRUpZEgSTF)).intValue();
  }
  
  public void setLyrics(byte[] paramArrayOfbyte) {
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringHashMap("Language", this, 3));
    this.objectList.add(new NumberHashMap("TimeStampFormat", this, 1));
    this.objectList.add(new NumberHashMap("contentType", this, 1));
    this.objectList.add(new StringNullTerminated("Description", this));
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodySYLT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */