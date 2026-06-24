package org.jaudiotagger.tag.id3.framebody;

import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import in.krosbits.utils.SgV.YbNJ;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import mk;
import org.jaudiotagger.tag.datatype.AbstractString;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.StringFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;

public class FrameBodyPIC extends AbstractID3v2FrameBody implements ID3v22FrameBody {
  public static final String IMAGE_IS_URL = "-->";
  
  public FrameBodyPIC() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
  }
  
  public FrameBodyPIC(byte paramByte1, String paramString1, byte paramByte2, String paramString2, byte[] paramArrayOfbyte) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte1));
    setObjectValue("ImageType", paramString1);
    setPictureType(paramByte2);
    setDescription(paramString2);
    setImageData(paramArrayOfbyte);
  }
  
  public FrameBodyPIC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyPIC(FrameBodyAPIC paramFrameBodyAPIC) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyAPIC.getTextEncoding()));
    setObjectValue("ImageType", ImageFormats.getFormatForMimeType((String)paramFrameBodyAPIC.getObjectValue("MIMEType")));
    setObjectValue("PictureData", paramFrameBodyAPIC.getObjectValue("PictureData"));
    setDescription(paramFrameBodyAPIC.getDescription());
    setImageData(paramFrameBodyAPIC.getImageData());
  }
  
  public FrameBodyPIC(FrameBodyPIC paramFrameBodyPIC) {
    super(paramFrameBodyPIC);
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getFormatType() {
    return (String)getObjectValue(RqlokDsQOju.ulYKYdpynW);
  }
  
  public String getIdentifier() {
    return "PIC";
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
  
  public boolean isImageUrl() {
    return (getFormatType() != null && getFormatType().equals("-->"));
  }
  
  public void setDescription(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public void setImageData(byte[] paramArrayOfbyte) {
    setObjectValue("PictureData", paramArrayOfbyte);
  }
  
  public void setPictureType(byte paramByte) {
    setObjectValue("PictureType", Byte.valueOf(paramByte));
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new StringFixedLength("ImageType", this, 3));
    this.objectList.add(new NumberHashMap("PictureType", this, 1));
    this.objectList.add(new StringNullTerminated("Description", this));
    this.objectList.add(new ByteArraySizeTerminated("PictureData", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    if (!((AbstractString)getObject(YbNJ.WIBJv)).canBeEncoded())
      setTextEncoding((byte)1); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyPIC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */