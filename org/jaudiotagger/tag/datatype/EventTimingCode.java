package org.jaudiotagger.tag.datatype;

import java.util.logging.Logger;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTypes;

public class EventTimingCode extends AbstractDataType implements Cloneable {
  private static final int SIZE = 5;
  
  private NumberFixedLength timestamp = new NumberFixedLength("DateTime", null, 4);
  
  private NumberHashMap type = new NumberHashMap("TypeOfEvent", null, 1);
  
  public EventTimingCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    this(paramString, paramAbstractTagFrameBody, 0, 0L);
  }
  
  public EventTimingCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt, long paramLong) {
    super(paramString, paramAbstractTagFrameBody);
    setBody(paramAbstractTagFrameBody);
    this.type.setValue(Integer.valueOf(paramInt));
    this.timestamp.setValue(Long.valueOf(paramLong));
  }
  
  public EventTimingCode(EventTimingCode paramEventTimingCode) {
    super(paramEventTimingCode);
    this.type.setValue(paramEventTimingCode.type.getValue());
    this.timestamp.setValue(paramEventTimingCode.timestamp.getValue());
  }
  
  public Object clone() {
    return new EventTimingCode(this);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      if (!super.equals(paramObject))
        return false; 
      paramObject = paramObject;
      if (getType() == paramObject.getType() && getTimestamp() == paramObject.getTimestamp())
        return true; 
    } 
    return false;
  }
  
  public int getSize() {
    return 5;
  }
  
  public long getTimestamp() {
    return ((Number)this.timestamp.getValue()).longValue();
  }
  
  public int getType() {
    return ((Number)this.type.getValue()).intValue();
  }
  
  public int hashCode() {
    byte b;
    NumberHashMap numberHashMap = this.type;
    int i = 0;
    if (numberHashMap != null) {
      b = numberHashMap.hashCode();
    } else {
      b = 0;
    } 
    NumberFixedLength numberFixedLength = this.timestamp;
    if (numberFixedLength != null)
      i = numberFixedLength.hashCode(); 
    return b * 31 + i;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    int i = getSize();
    Logger logger = AbstractDataType.logger;
    StringBuilder stringBuilder = new StringBuilder("offset:");
    stringBuilder.append(paramInt);
    logger.finest(stringBuilder.toString());
    if (paramInt <= paramArrayOfbyte.length - i) {
      this.type.readByteArray(paramArrayOfbyte, paramInt);
      i = this.type.getSize();
      this.timestamp.readByteArray(paramArrayOfbyte, i + paramInt);
      this.timestamp.getSize();
      return;
    } 
    AbstractDataType.logger.warning("Invalid size for FrameBody");
    throw new InvalidDataTypeException("Invalid size for FrameBody");
  }
  
  public void setBody(AbstractTagFrameBody paramAbstractTagFrameBody) {
    super.setBody(paramAbstractTagFrameBody);
    this.type.setBody(paramAbstractTagFrameBody);
    this.timestamp.setBody(paramAbstractTagFrameBody);
  }
  
  public void setTimestamp(long paramLong) {
    this.timestamp.setValue(Long.valueOf(paramLong));
  }
  
  public void setType(int paramInt) {
    this.type.setValue(Integer.valueOf(paramInt));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(getType());
    stringBuilder.append(" (\"");
    stringBuilder.append(EventTimingTypes.getInstanceOf().getValueForId(getType()));
    stringBuilder.append("\"), ");
    stringBuilder.append(getTimestamp());
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte1 = this.type.writeByteArray();
    byte[] arrayOfByte2 = this.timestamp.writeByteArray();
    if (arrayOfByte1 == null || arrayOfByte2 == null)
      return null; 
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
    return arrayOfByte3;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\EventTimingCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */