package org.jaudiotagger.tag.mp4.field;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import k91;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;

public class Mp4TagTextNumberField extends Mp4TagTextField {
  public static final int NUMBER_LENGTH = 2;
  
  protected List<Short> numbers;
  
  public Mp4TagTextNumberField(String paramString1, String paramString2) {
    super(paramString1, paramString2);
  }
  
  public Mp4TagTextNumberField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    this.content = mp4DataBox.getContent();
    this.numbers = mp4DataBox.getNumbers();
  }
  
  public void copyContent(TagField paramTagField) {
    if (paramTagField instanceof Mp4TagTextNumberField) {
      Mp4TagTextNumberField mp4TagTextNumberField = (Mp4TagTextNumberField)paramTagField;
      this.content = mp4TagTextNumberField.getContent();
      this.numbers = mp4TagTextNumberField.getNumbers();
    } 
  }
  
  public byte[] getDataBytes() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (Short short_ : this.numbers) {
      try {
        byteArrayOutputStream.write(Utils.getSizeBEInt16(short_.shortValue()));
      } catch (IOException iOException) {
        k91.n(iOException);
        return null;
      } 
    } 
    return iOException.toByteArray();
  }
  
  public Mp4FieldType getFieldType() {
    return Mp4FieldType.IMPLICIT;
  }
  
  public List<Short> getNumbers() {
    return this.numbers;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagTextNumberField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */