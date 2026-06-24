package org.jaudiotagger.tag.datatype;

import ga1;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.valuepair.EventTimingTypes;

public class SynchronisedTempoCode extends AbstractDataType implements Cloneable {
  private TempoCode tempo = new TempoCode("SynchronisedTempoData", null, Integer.valueOf(1));
  
  private NumberFixedLength timestamp = new NumberFixedLength("DateTime", null, 4);
  
  public SynchronisedTempoCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    this(paramString, paramAbstractTagFrameBody, 0, 0L);
  }
  
  public SynchronisedTempoCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt, long paramLong) {
    super(paramString, paramAbstractTagFrameBody);
    setBody(paramAbstractTagFrameBody);
    this.tempo.setValue(Integer.valueOf(paramInt));
    this.timestamp.setValue(Long.valueOf(paramLong));
  }
  
  public SynchronisedTempoCode(SynchronisedTempoCode paramSynchronisedTempoCode) {
    super(paramSynchronisedTempoCode);
    this.tempo.setValue(paramSynchronisedTempoCode.tempo.getValue());
    this.timestamp.setValue(paramSynchronisedTempoCode.timestamp.getValue());
  }
  
  public Object clone() {
    return new SynchronisedTempoCode(this);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      if (!super.equals(paramObject))
        return false; 
      paramObject = paramObject;
      if (getTempo() == paramObject.getTempo() && getTimestamp() == paramObject.getTimestamp())
        return true; 
    } 
    return false;
  }
  
  public int getSize() {
    int i = this.tempo.getSize();
    return this.timestamp.getSize() + i;
  }
  
  public int getTempo() {
    return ((Number)this.tempo.getValue()).intValue();
  }
  
  public long getTimestamp() {
    return ((Number)this.timestamp.getValue()).longValue();
  }
  
  public int hashCode() {
    byte b;
    TempoCode tempoCode = this.tempo;
    int i = 0;
    if (tempoCode != null) {
      b = tempoCode.hashCode();
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
      this.tempo.readByteArray(paramArrayOfbyte, paramInt);
      i = this.tempo.getSize();
      this.timestamp.readByteArray(paramArrayOfbyte, i + paramInt);
      this.timestamp.getSize();
      return;
    } 
    AbstractDataType.logger.warning("Invalid size for FrameBody");
    throw new InvalidDataTypeException("Invalid size for FrameBody");
  }
  
  public void setBody(AbstractTagFrameBody paramAbstractTagFrameBody) {
    super.setBody(paramAbstractTagFrameBody);
    this.tempo.setBody(paramAbstractTagFrameBody);
    this.timestamp.setBody(paramAbstractTagFrameBody);
  }
  
  public void setTempo(int paramInt) {
    if (paramInt >= 0 && paramInt <= 510) {
      this.tempo.setValue(Integer.valueOf(paramInt));
      return;
    } 
    l0.l(ga1.i("Tempo must be a positive value less than 511: ", paramInt));
  }
  
  public void setTimestamp(long paramLong) {
    this.timestamp.setValue(Long.valueOf(paramLong));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(getTempo());
    stringBuilder.append(" (\"");
    stringBuilder.append(EventTimingTypes.getInstanceOf().getValueForId(getTempo()));
    stringBuilder.append("\"), ");
    stringBuilder.append(getTimestamp());
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte3 = this.tempo.writeByteArray();
    byte[] arrayOfByte2 = this.timestamp.writeByteArray();
    if (arrayOfByte3 == null || arrayOfByte2 == null)
      return null; 
    byte[] arrayOfByte1 = new byte[arrayOfByte3.length + arrayOfByte2.length];
    System.arraycopy(arrayOfByte3, 0, arrayOfByte1, 0, arrayOfByte3.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, arrayOfByte3.length, arrayOfByte2.length);
    return arrayOfByte1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\SynchronisedTempoCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */