package org.jaudiotagger.tag.id3.framebody;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.logging.Logger;
import k91;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.datatype.AbstractDataType;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.AbstractTagItem;

public abstract class AbstractID3v2FrameBody extends AbstractTagFrameBody {
  protected static final String TYPE_BODY = "body";
  
  private int size;
  
  public AbstractID3v2FrameBody() {}
  
  public AbstractID3v2FrameBody(ByteBuffer paramByteBuffer, int paramInt) {
    setSize(paramInt);
    read(paramByteBuffer);
  }
  
  public AbstractID3v2FrameBody(AbstractID3v2FrameBody paramAbstractID3v2FrameBody) {
    super(paramAbstractID3v2FrameBody);
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("body", "");
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    while (iterator.hasNext())
      ((AbstractDataType)iterator.next()).createStructure(); 
    MP3File.getStructureFormatter().d("body");
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof AbstractID3v2FrameBody && super.equals(paramObject));
  }
  
  public abstract String getIdentifier();
  
  public int getSize() {
    return this.size;
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    int j = getSize();
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("Reading body for");
    stringBuilder.append(getIdentifier());
    stringBuilder.append(":");
    stringBuilder.append(j);
    logger.config(stringBuilder.toString());
    byte[] arrayOfByte = new byte[j];
    paramByteBuffer.get(arrayOfByte);
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      AbstractDataType abstractDataType = iterator.next();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("offset:");
      stringBuilder1.append(i);
      logger1.finest(stringBuilder1.toString());
      if (i <= j) {
        try {
          abstractDataType.readByteArray(arrayOfByte, i);
        } catch (InvalidDataTypeException invalidDataTypeException) {
          logger1 = AbstractTagItem.logger;
          stringBuilder1 = new StringBuilder("Problem reading datatype within Frame Body:");
          stringBuilder1.append(invalidDataTypeException.getMessage());
          logger1.warning(stringBuilder1.toString());
        } 
        i += abstractDataType.getSize();
        continue;
      } 
      AbstractTagItem.logger.warning("Invalid Size for FrameBody");
      throw new InvalidFrameException("Invalid size for Frame Body");
    } 
  }
  
  public void setSize() {
    this.size = 0;
    for (AbstractDataType abstractDataType : this.objectList) {
      int i = this.size;
      this.size = abstractDataType.getSize() + i;
    } 
  }
  
  public void setSize(int paramInt) {
    this.size = paramInt;
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    Logger logger2 = AbstractTagItem.logger;
    StringBuilder stringBuilder2 = new StringBuilder("Writing frame body for");
    stringBuilder2.append(getIdentifier());
    stringBuilder2.append(":Est Size:");
    stringBuilder2.append(this.size);
    logger2.config(stringBuilder2.toString());
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    while (iterator.hasNext()) {
      byte[] arrayOfByte = ((AbstractDataType)iterator.next()).writeByteArray();
      if (arrayOfByte != null)
        try {
          paramByteArrayOutputStream.write(arrayOfByte);
        } catch (IOException iOException) {
          k91.n(iOException);
          return;
        }  
    } 
    setSize();
    Logger logger1 = AbstractTagItem.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Written frame body for");
    stringBuilder1.append(getIdentifier());
    stringBuilder1.append(PwbbJfsdcHrAjW.kbZfXzmBjQGUFE);
    stringBuilder1.append(this.size);
    logger1.config(stringBuilder1.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\AbstractID3v2FrameBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */