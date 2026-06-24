package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;

public class Mp4DiscNoField extends Mp4TagTextNumberField {
  private static final int DISC_NO_INDEX = 1;
  
  private static final int DISC_TOTAL_INDEX = 2;
  
  public Mp4DiscNoField(int paramInt) {
    super(Mp4FieldKey.DISCNUMBER.getFieldName(), String.valueOf(paramInt));
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    this.numbers.add(Short.valueOf((short)paramInt));
    this.numbers.add(new Short("0"));
  }
  
  public Mp4DiscNoField(int paramInt1, int paramInt2) {
    super(Mp4FieldKey.DISCNUMBER.getFieldName(), String.valueOf(paramInt1));
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    this.numbers.add(Short.valueOf((short)paramInt1));
    this.numbers.add(Short.valueOf((short)paramInt2));
  }
  
  public Mp4DiscNoField(String paramString) {
    super(Mp4FieldKey.DISCNUMBER.getFieldName(), paramString);
    String str;
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    String[] arrayOfString = paramString.split("/");
    int i = arrayOfString.length;
    if (i != 1) {
      if (i == 2) {
        StringBuilder stringBuilder1;
        try {
          this.numbers.add(Short.valueOf(Short.parseShort(arrayOfString[0])));
          try {
            this.numbers.add(Short.valueOf(Short.parseShort(arrayOfString[1])));
            return;
          } catch (NumberFormatException numberFormatException) {
            String str1 = arrayOfString[1];
            String str2 = this.id;
            stringBuilder1 = new StringBuilder("Value of:");
            stringBuilder1.append(str1);
            stringBuilder1.append(" is invalid for field:");
            stringBuilder1.append(str2);
            throw new FieldDataInvalidException(stringBuilder1.toString());
          } 
        } catch (NumberFormatException numberFormatException) {
          StringBuilder stringBuilder2 = stringBuilder1[0];
          String str1 = this.id;
          StringBuilder stringBuilder3 = new StringBuilder("Value of:");
          stringBuilder3.append((String)stringBuilder2);
          stringBuilder3.append(" is invalid for field:");
          stringBuilder3.append(str1);
          throw new FieldDataInvalidException(stringBuilder3.toString());
        } 
      } 
      str = this.id;
      StringBuilder stringBuilder = new StringBuilder("Value is invalid for field:");
      stringBuilder.append(str);
      throw new FieldDataInvalidException(stringBuilder.toString());
    } 
    try {
      this.numbers.add(Short.valueOf(Short.parseShort(str[0])));
      this.numbers.add(new Short("0"));
      return;
    } catch (NumberFormatException numberFormatException) {
      String str2 = str[0];
      String str1 = this.id;
      StringBuilder stringBuilder = new StringBuilder("Value of:");
      stringBuilder.append(str2);
      stringBuilder.append(" is invalid for field:");
      stringBuilder.append(str1);
      throw new FieldDataInvalidException(stringBuilder.toString());
    } 
  }
  
  public Mp4DiscNoField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    this.numbers = mp4DataBox.getNumbers();
    StringBuffer stringBuffer = new StringBuffer();
    if (this.numbers.size() > 1 && ((Short)this.numbers.get(1)).shortValue() > 0)
      stringBuffer.append(this.numbers.get(1)); 
    if (this.numbers.size() > 2 && ((Short)this.numbers.get(2)).shortValue() > 0) {
      stringBuffer.append("/");
      stringBuffer.append(this.numbers.get(2));
    } 
    this.content = stringBuffer.toString();
  }
  
  public Short getDiscNo() {
    return this.numbers.get(1);
  }
  
  public Short getDiscTotal() {
    return (this.numbers.size() <= 2) ? Short.valueOf((short)0) : this.numbers.get(2);
  }
  
  public void setDiscNo(int paramInt) {
    this.numbers.set(1, Short.valueOf((short)paramInt));
  }
  
  public void setDiscTotal(int paramInt) {
    this.numbers.set(2, Short.valueOf((short)paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4DiscNoField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */