package org.jaudiotagger.tag.mp4.atom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l0;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.AbstractMp4Box;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.mp4.field.Mp4FieldType;

public class Mp4DataBox extends AbstractMp4Box {
  public static final int DATA_HEADER_LENGTH = 16;
  
  public static final String IDENTIFIER = "data";
  
  public static final int NULL_LENGTH = 4;
  
  public static final int NUMBER_LENGTH = 2;
  
  public static final int PRE_DATA_LENGTH = 8;
  
  public static final int TYPE_LENGTH = 3;
  
  public static final int TYPE_POS = 1;
  
  public static final int TYPE_POS_INCLUDING_HEADER = 9;
  
  public static final int VERSION_LENGTH = 1;
  
  private byte[] bytedata;
  
  private String content;
  
  private List<Short> numbers;
  
  private int type;
  
  public Mp4DataBox(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    ListIterator<Short> listIterator;
    this.header = paramMp4BoxHeader;
    if (paramMp4BoxHeader.getId().equals("data")) {
      StringBuffer stringBuffer;
      ByteBuffer byteBuffer = paramByteBuffer.slice();
      this.dataBuffer = byteBuffer;
      int i = Utils.getIntBE(byteBuffer, 1, 3);
      this.type = i;
      if (i == Mp4FieldType.TEXT.getFileClassId()) {
        this.content = Utils.getString(this.dataBuffer, 8, paramMp4BoxHeader.getDataLength() - 8, paramMp4BoxHeader.getEncoding());
        return;
      } 
      int k = this.type;
      int m = Mp4FieldType.IMPLICIT.getFileClassId();
      int j = 0;
      i = 0;
      if (k == m || this.type == Mp4FieldType.GENRES.getFileClassId()) {
        this.numbers = new ArrayList<Short>();
        for (i = j; i < (paramMp4BoxHeader.getDataLength() - 8) / 2; i++) {
          paramByteBuffer = this.dataBuffer;
          j = i * 2;
          short s = Utils.getShortBE(paramByteBuffer, j + 8, j + 9);
          this.numbers.add(Short.valueOf(s));
        } 
        stringBuffer = new StringBuffer();
        listIterator = this.numbers.listIterator();
        while (listIterator.hasNext()) {
          stringBuffer.append(listIterator.next());
          if (listIterator.hasNext())
            stringBuffer.append("/"); 
        } 
        this.content = stringBuffer.toString();
        return;
      } 
      if (this.type == Mp4FieldType.INTEGER.getFileClassId()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Utils.getIntBE(this.dataBuffer, 8, listIterator.getDataLength() - 1));
        stringBuilder.append("");
        this.content = stringBuilder.toString();
        this.bytedata = new byte[listIterator.getDataLength() - 8];
        j = stringBuffer.position();
        stringBuffer.position(j + 8);
        stringBuffer.get(this.bytedata);
        stringBuffer.position(j);
        this.numbers = new ArrayList<Short>();
        while (i < (listIterator.getDataLength() - 8) / 2) {
          ByteBuffer byteBuffer1 = this.dataBuffer;
          j = i * 2;
          short s = Utils.getShortBE(byteBuffer1, j + 8, j + 9);
          this.numbers.add(Short.valueOf(s));
          i++;
        } 
      } else if (this.type == Mp4FieldType.COVERART_JPEG.getFileClassId()) {
        this.content = Utils.getString(this.dataBuffer, 8, listIterator.getDataLength() - 8, listIterator.getEncoding());
      } 
      return;
    } 
    l0.h("Unable to process data box because identifier is:", listIterator.getId());
    throw null;
  }
  
  public byte[] getByteData() {
    return this.bytedata;
  }
  
  public String getContent() {
    return this.content;
  }
  
  public List<Short> getNumbers() {
    return this.numbers;
  }
  
  public int getType() {
    return this.type;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\atom\Mp4DataBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */