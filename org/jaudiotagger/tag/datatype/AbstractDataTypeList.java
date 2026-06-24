package org.jaudiotagger.tag.datatype;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import ga1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import m60;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public abstract class AbstractDataTypeList<T extends AbstractDataType> extends AbstractDataType {
  public AbstractDataTypeList(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
    setValue(new ArrayList<T>());
  }
  
  public AbstractDataTypeList(AbstractDataTypeList<T> paramAbstractDataTypeList) {
    super(paramAbstractDataTypeList);
  }
  
  public abstract T createListElement();
  
  public int getSize() {
    Iterator<T> iterator = getValue().iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((AbstractDataType)iterator.next()).getSize());
    return i;
  }
  
  public List<T> getValue() {
    return (List<T>)super.getValue();
  }
  
  public int hashCode() {
    return (getValue() != null) ? getValue().hashCode() : 0;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0) {
        int i = paramInt;
        if (paramInt >= paramArrayOfbyte.length) {
          getValue().clear();
          return;
        } 
        while (i < paramArrayOfbyte.length) {
          T t = createListElement();
          t.readByteArray(paramArrayOfbyte, i);
          t.setBody(this.frameBody);
          getValue().add(t);
          i += t.getSize();
        } 
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
      m60.g(paramArrayOfbyte.length, stringBuilder);
      return;
    } 
    k91.h(kOkiWEITVb.ijClMZ);
  }
  
  public void setValue(List<T> paramList) {
    if (paramList == null) {
      paramList = new ArrayList<T>();
    } else {
      paramList = new ArrayList<T>(paramList);
    } 
    setValue(paramList);
  }
  
  public String toString() {
    return (getValue() != null) ? getValue().toString() : xveccWbRzqx.rJMhwLZcvswhv;
  }
  
  public byte[] writeByteArray() {
    if (AbstractDataType.logger.isLoggable(Level.CONFIG)) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder("Writing DataTypeList ");
      stringBuilder.append(getIdentifier());
      logger.config(stringBuilder.toString());
    } 
    byte[] arrayOfByte = new byte[getSize()];
    Iterator<T> iterator = getValue().iterator();
    for (int i = 0; iterator.hasNext(); i += arrayOfByte1.length) {
      byte[] arrayOfByte1 = ((AbstractDataType)iterator.next()).writeByteArray();
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, arrayOfByte1.length);
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractDataTypeList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */