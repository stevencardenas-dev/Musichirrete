package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import mk;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;

public class FrameBodyAPIC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public static final String IMAGE_IS_URL = "-->";
  
  public FrameBodyAPIC() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
  }
  
  public FrameBodyAPIC(byte paramByte1, String paramString1, byte paramByte2, String paramString2, byte[] paramArrayOfbyte) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte1));
    setMimeType(paramString1);
    setPictureType(paramByte2);
    setDescription(paramString2);
    setImageData(paramArrayOfbyte);
  }
  
  public FrameBodyAPIC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyAPIC(FrameBodyAPIC paramFrameBodyAPIC) {
    super(paramFrameBodyAPIC);
  }
  
  public FrameBodyAPIC(FrameBodyPIC paramFrameBodyPIC) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyPIC.getTextEncoding()));
    setObjectValue("MIMEType", ImageFormats.getMimeTypeForFormat((String)paramFrameBodyPIC.getObjectValue("ImageType")));
    setObjectValue("PictureType", paramFrameBodyPIC.getObjectValue("PictureType"));
    setObjectValue("Description", paramFrameBodyPIC.getDescription());
    setObjectValue("PictureData", paramFrameBodyPIC.getObjectValue("PictureData"));
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getIdentifier() {
    return "APIC";
  }
  
  public byte[] getImageData() {
    return (byte[])getObjectValue("PictureData");
  }
  
  public String getImageUrl() {
    return isImageUrl() ? new String((byte[])getObjectValue("PictureData"), 0, ((byte[])getObjectValue("PictureData")).length, mk.b) : "";
  }
  
  public String getMimeType() {
    return (String)getObjectValue("MIMEType");
  }
  
  public int getPictureType() {
    return ((Long)getObjectValue("PictureType")).intValue();
  }
  
  public String getUserFriendlyValue() {
    if (getImageData() != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getMimeType());
      stringBuilder1.append(":");
      stringBuilder1.append(getDescription());
      stringBuilder1.append(":");
      stringBuilder1.append((getImageData()).length);
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getMimeType());
    stringBuilder.append(":");
    stringBuilder.append(getDescription());
    stringBuilder.append(":0");
    return stringBuilder.toString();
  }
  
  public boolean isImageUrl() {
    return (getMimeType() != null && getMimeType().equals("-->"));
  }
  
  public void setDescription(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public void setImageData(byte[] paramArrayOfbyte) {
    setObjectValue("PictureData", paramArrayOfbyte);
  }
  
  public void setMimeType(String paramString) {
    setObjectValue("MIMEType", paramString);
  }
  
  public void setPictureType(byte paramByte) {
    setObjectValue("PictureType", Byte.valueOf(paramByte));
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringNullTerminated("MIMEType", this));
    this.objectList.add(new NumberHashMap("PictureType", this, 1));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new ByteArraySizeTerminated("PictureData", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (TagOptionSingleton.getInstance().isAPICDescriptionITunesCompatible()) {
      setTextEncoding((byte)0);
      if (!((AbstractString)getObject("Description")).canBeEncoded())
        setDescription(""); 
    } else if (!((AbstractString)getObject("Description")).canBeEncoded()) {
      setTextEncoding((byte)1);
    } 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyAPIC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */