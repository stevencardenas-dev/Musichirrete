package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringHashMap;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FrameBodyUSER extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyUSER() {}
  
  public FrameBodyUSER(byte paramByte, String paramString1, String paramString2) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Language", paramString1);
    setObjectValue("Text", paramString2);
  }
  
  public FrameBodyUSER(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyUSER(FrameBodyUSER paramFrameBodyUSER) {
    super(paramFrameBodyUSER);
  }
  
  public String getIdentifier() {
    return "USER";
  }
  
  public String getLanguage() {
    return (String)getObjectValue("Language");
  }
  
  public void setOwner(String paramString) {
    setObjectValue("Language", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringHashMap("Language", this, 3));
    this.objectList.add(new StringSizeTerminated("Text", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((AbstractString)getObject("Text")).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyUSER.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */