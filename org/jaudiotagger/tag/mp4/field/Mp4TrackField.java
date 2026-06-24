package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;

public class Mp4TrackField extends Mp4TagTextNumberField {
  private static final int TRACK_NO_INDEX = 1;
  
  private static final int TRACK_TOTAL_INDEX = 2;
  
  public Mp4TrackField(int paramInt) {
    super(Mp4FieldKey.TRACK.getFieldName(), String.valueOf(paramInt));
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    this.numbers.add(Short.valueOf((short)paramInt));
    this.numbers.add(new Short("0"));
    this.numbers.add(new Short("0"));
  }
  
  public Mp4TrackField(int paramInt1, int paramInt2) {
    super(Mp4FieldKey.TRACK.getFieldName(), String.valueOf(paramInt1));
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    this.numbers.add(Short.valueOf((short)paramInt1));
    this.numbers.add(Short.valueOf((short)paramInt2));
    this.numbers.add(new Short("0"));
  }
  
  public Mp4TrackField(String paramString) {
    super(Mp4FieldKey.TRACK.getFieldName(), paramString);
    StringBuilder stringBuilder;
    ArrayList<Short> arrayList = new ArrayList();
    this.numbers = arrayList;
    arrayList.add(new Short("0"));
    String[] arrayOfString = paramString.split("/");
    int i = arrayOfString.length;
    if (i != 1) {
      if (i == 2) {
        String str1;
        try {
          this.numbers.add(Short.valueOf(Short.parseShort(arrayOfString[0])));
          try {
            this.numbers.add(Short.valueOf(Short.parseShort(arrayOfString[1])));
            this.numbers.add(new Short("0"));
            return;
          } catch (NumberFormatException numberFormatException) {
            String str2 = arrayOfString[1];
            str1 = this.id;
            StringBuilder stringBuilder1 = new StringBuilder("Value of:");
            stringBuilder1.append(str2);
            stringBuilder1.append(" is invalid for field:");
            stringBuilder1.append(str1);
            throw new FieldDataInvalidException(stringBuilder1.toString());
          } 
        } catch (NumberFormatException numberFormatException) {
          String str2 = str1[0];
          str1 = this.id;
          StringBuilder stringBuilder1 = new StringBuilder("Value of:");
          stringBuilder1.append(str2);
          stringBuilder1.append(" is invalid for field:");
          stringBuilder1.append(str1);
          throw new FieldDataInvalidException(stringBuilder1.toString());
        } 
      } 
      String str = this.id;
      stringBuilder = new StringBuilder("Value is invalid for field:");
      stringBuilder.append(str);
      throw new FieldDataInvalidException(stringBuilder.toString());
    } 
    try {
      this.numbers.add(Short.valueOf(Short.parseShort((String)stringBuilder[0])));
      this.numbers.add(new Short("0"));
      this.numbers.add(new Short("0"));
      return;
    } catch (NumberFormatException numberFormatException) {
      stringBuilder = stringBuilder[0];
      String str = this.id;
      StringBuilder stringBuilder1 = new StringBuilder("Value of:");
      stringBuilder1.append((String)stringBuilder);
      stringBuilder1.append(" is invalid for field:");
      stringBuilder1.append(str);
      throw new FieldDataInvalidException(stringBuilder1.toString());
    } 
  }
  
  public Mp4TrackField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    this.numbers = mp4DataBox.getNumbers();
    StringBuffer stringBuffer = new StringBuffer();
    List<Short> list = this.numbers;
    if (list != null) {
      if (list.size() > 1 && ((Short)this.numbers.get(1)).shortValue() > 0)
        stringBuffer.append(this.numbers.get(1)); 
      if (this.numbers.size() > 2 && ((Short)this.numbers.get(2)).shortValue() > 0) {
        stringBuffer.append("/");
        stringBuffer.append(this.numbers.get(2));
      } 
    } 
    this.content = stringBuffer.toString();
  }
  
  public Short getTrackNo() {
    return (this.numbers.get(1) != null) ? this.numbers.get(1) : Short.valueOf((short)0);
  }
  
  public Short getTrackTotal() {
    return (this.numbers.get(2) != null) ? this.numbers.get(2) : Short.valueOf((short)0);
  }
  
  public void setTrackNo(int paramInt) {
    this.numbers.set(1, Short.valueOf((short)paramInt));
  }
  
  public void setTrackTotal(int paramInt) {
    this.numbers.set(2, Short.valueOf((short)paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TrackField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */