package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.Mp4TagField;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;
import org.jaudiotagger.tag.reference.GenreTypes;

public class Mp4GenreField extends Mp4TagTextNumberField {
  public Mp4GenreField(String paramString) {
    super(Mp4FieldKey.GENRE.getFieldName(), paramString);
    try {
      short s = Short.parseShort(paramString);
      if (s <= GenreTypes.getMaxStandardGenreId()) {
        ArrayList<Short> arrayList1 = new ArrayList();
        this();
        this.numbers = arrayList1;
        arrayList1.add(Short.valueOf((short)(s + 1)));
        return;
      } 
      ArrayList<Short> arrayList = new ArrayList();
      this();
      this.numbers = arrayList;
      arrayList.add(short_);
      return;
    } catch (NumberFormatException numberFormatException) {
      ArrayList<Short> arrayList2;
      Integer integer = GenreTypes.getInstanceOf().getIdForValue(paramString);
      if (integer != null && integer.intValue() <= GenreTypes.getMaxStandardGenreId()) {
        arrayList2 = new ArrayList();
        this.numbers = arrayList2;
        arrayList2.add(Short.valueOf((short)(integer.intValue() + 1)));
        return;
      } 
      ArrayList<Short> arrayList1 = new ArrayList();
      this.numbers = arrayList1;
      arrayList1.add(arrayList2);
      return;
    } 
  }
  
  public Mp4GenreField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public static boolean isValidGenre(String paramString) {
    try {
      short s = Short.parseShort(paramString);
      int i = GenreTypes.getMaxStandardGenreId();
      if (s - 1 <= i)
        return true; 
    } catch (NumberFormatException numberFormatException) {}
    Integer integer = GenreTypes.getInstanceOf().getIdForValue(paramString);
    return (integer != null && integer.intValue() <= GenreTypes.getMaxStandardGenreId());
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    List<Short> list = mp4DataBox.getNumbers();
    this.numbers = list;
    if (list != null && list.size() > 0) {
      short s = ((Short)this.numbers.get(0)).shortValue();
      String str = GenreTypes.getInstanceOf().getValueForId(s - 1);
      this.content = str;
      if (str == null)
        Mp4TagField.logger.warning(MessageFormat.format("Genre Id {0} does not map to a valid genre", new Object[] { Integer.valueOf(s) })); 
      return;
    } 
    Logger logger = Mp4TagField.logger;
    int i = mp4BoxHeader.getDataLength();
    logger.warning(MessageFormat.format(hrSTyFuSIm.QVImpyhSQUCqA, new Object[] { Integer.valueOf(i) }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4GenreField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */