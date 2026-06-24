package org.jaudiotagger.tag.id3.framebody;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;

public class FrameBodyGEOB extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyGEOB() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("MIMEType", "");
    setObjectValue("Filename", "");
    setObjectValue("Description", "");
    setObjectValue("Data", new byte[0]);
  }
  
  public FrameBodyGEOB(byte paramByte, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfbyte) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("MIMEType", paramString1);
    setObjectValue("Filename", paramString2);
    setObjectValue("Description", paramString3);
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public FrameBodyGEOB(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyGEOB(FrameBodyGEOB paramFrameBodyGEOB) {
    super(paramFrameBodyGEOB);
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getIdentifier() {
    return "GEOB";
  }
  
  public void setDescription(String paramString) {
    setObjectValue(IGBYXeDFmKYajx.tTebXdHVY, paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringNullTerminated("MIMEType", this));
    this.objectList.add(new TextEncodedStringNullTerminated("Filename", this));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((AbstractString)getObject("Filename")).canBeEncoded())
      setTextEncoding((byte)1); 
    if (!((AbstractString)getObject("Description")).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyGEOB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */