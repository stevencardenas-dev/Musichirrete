package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import l0;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;
import x41;

public class Mp4TagByteField extends Mp4TagTextField {
  public static String FALSE_VALUE = "0";
  
  public static String TRUE_VALUE = "1";
  
  private byte[] bytedata;
  
  private int realDataLength;
  
  public Mp4TagByteField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public Mp4TagByteField(Mp4FieldKey paramMp4FieldKey, String paramString) {
    this(paramMp4FieldKey, paramString, 1);
  }
  
  public Mp4TagByteField(Mp4FieldKey paramMp4FieldKey, String paramString, int paramInt) {
    super(paramMp4FieldKey.getFieldName(), paramString);
    this.realDataLength = paramInt;
    try {
      Long.parseLong(paramString);
      return;
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder("Value of:");
      stringBuilder.append(paramString);
      stringBuilder.append(" is invalid for field:");
      stringBuilder.append(paramMp4FieldKey);
      throw new FieldDataInvalidException(stringBuilder.toString());
    } 
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    int i = mp4BoxHeader.getDataLength();
    this.dataSize = i;
    this.realDataLength = i - 8;
    this.bytedata = mp4DataBox.getByteData();
    this.content = mp4DataBox.getContent();
  }
  
  public byte[] getDataBytes() {
    byte[] arrayOfByte = this.bytedata;
    if (arrayOfByte != null)
      return arrayOfByte; 
    int i = this.realDataLength;
    if (i != 1) {
      if (i != 2) {
        if (i == 4)
          return Utils.getSizeBEInt32((new Integer(this.content)).intValue()); 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id);
        stringBuilder.append(":");
        l0.f(x41.m(stringBuilder, this.realDataLength, ":Dont know how to write byte fields of this length"));
        return null;
      } 
      return Utils.getSizeBEInt16((new Short(this.content)).shortValue());
    } 
    return new byte[] { (new Short(this.content)).byteValue() };
  }
  
  public Mp4FieldType getFieldType() {
    return Mp4FieldType.INTEGER;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagByteField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */