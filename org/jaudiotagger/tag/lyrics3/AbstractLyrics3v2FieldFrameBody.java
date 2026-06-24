package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import java.util.ListIterator;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.AbstractDataType;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import uc1;

public abstract class AbstractLyrics3v2FieldFrameBody extends AbstractTagFrameBody {
  public AbstractLyrics3v2FieldFrameBody() {}
  
  public AbstractLyrics3v2FieldFrameBody(AbstractLyrics3v2FieldFrameBody paramAbstractLyrics3v2FieldFrameBody) {
    super(paramAbstractLyrics3v2FieldFrameBody);
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    int j = getSize();
    byte[] arrayOfByte = new byte[j];
    paramByteBuffer.get(arrayOfByte);
    ListIterator<AbstractDataType> listIterator = this.objectList.listIterator();
    int i = 0;
    while (listIterator.hasNext()) {
      if (i <= j - 1) {
        AbstractDataType abstractDataType = listIterator.next();
        abstractDataType.readByteArray(arrayOfByte, i);
        i += abstractDataType.getSize();
        continue;
      } 
      throw new InvalidTagException("Invalid size for Frame Body");
    } 
  }
  
  public int readHeader(uc1 paramuc1) {
    byte[] arrayOfByte = new byte[5];
    paramuc1.read(arrayOfByte, 0, 5);
    int i = Integer.parseInt(new String(arrayOfByte, 0, 5));
    if (i != 0 || TagOptionSingleton.getInstance().isLyrics3KeepEmptyFieldIfRead())
      return i; 
    throw new InvalidTagException("Lyircs3v2 Field has size of zero.");
  }
  
  public void write(uc1 paramuc1) {
    ListIterator<AbstractDataType> listIterator = this.objectList.listIterator();
    while (listIterator.hasNext())
      paramuc1.write(((AbstractDataType)listIterator.next()).writeByteArray()); 
  }
  
  public void writeHeader(uc1 paramuc1, int paramInt) {
    byte[] arrayOfByte = new byte[5];
    String str = Integer.toString(getSize());
    boolean bool = false;
    for (paramInt = 0; paramInt < 5 - str.length(); paramInt++)
      arrayOfByte[paramInt] = 48; 
    int i = str.length();
    for (paramInt = bool; paramInt < str.length(); paramInt++)
      arrayOfByte[paramInt + 5 - i] = (byte)str.charAt(paramInt); 
    paramuc1.write(arrayOfByte);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\AbstractLyrics3v2FieldFrameBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */