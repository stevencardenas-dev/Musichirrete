package org.jaudiotagger.tag.id3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.tag.datatype.AbstractDataType;
import x41;

public abstract class AbstractTagFrameBody extends AbstractTagItem {
  private AbstractTagFrame header;
  
  protected List<AbstractDataType> objectList = new ArrayList<AbstractDataType>();
  
  public AbstractTagFrameBody() {
    setupObjectList();
  }
  
  public AbstractTagFrameBody(AbstractTagFrameBody paramAbstractTagFrameBody) {
    for (byte b = 0; b < paramAbstractTagFrameBody.objectList.size(); b++) {
      AbstractDataType abstractDataType = (AbstractDataType)ID3Tags.copyObject(paramAbstractTagFrameBody.objectList.get(b));
      abstractDataType.setBody(this);
      this.objectList.add(abstractDataType);
    } 
  }
  
  public void createStructure() {}
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof AbstractTagFrameBody))
      return false; 
    AbstractTagFrameBody abstractTagFrameBody = (AbstractTagFrameBody)paramObject;
    return (this.objectList.equals(abstractTagFrameBody.objectList) && super.equals(paramObject));
  }
  
  public String getBriefDescription() {
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    String str = "";
    while (iterator.hasNext()) {
      AbstractDataType abstractDataType = iterator.next();
      if (abstractDataType.toString() != null && abstractDataType.toString().length() > 0) {
        StringBuilder stringBuilder = x41.p(str);
        stringBuilder.append(abstractDataType.getIdentifier());
        stringBuilder.append("=\"");
        stringBuilder.append(abstractDataType.toString());
        stringBuilder.append("\"; ");
        str = stringBuilder.toString();
      } 
    } 
    return str;
  }
  
  public AbstractTagFrame getHeader() {
    return this.header;
  }
  
  public final String getLongDescription() {
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    String str = "";
    while (iterator.hasNext()) {
      AbstractDataType abstractDataType = iterator.next();
      if (abstractDataType.toString() != null && abstractDataType.toString().length() > 0) {
        StringBuilder stringBuilder = x41.p(str);
        stringBuilder.append(abstractDataType.getIdentifier());
        stringBuilder.append(" = ");
        stringBuilder.append(abstractDataType.toString());
        stringBuilder.append("\n");
        str = stringBuilder.toString();
      } 
    } 
    return str;
  }
  
  public final AbstractDataType getObject(String paramString) {
    for (AbstractDataType abstractDataType : this.objectList) {
      if (abstractDataType.getIdentifier().equals(paramString))
        return abstractDataType; 
    } 
    return null;
  }
  
  public final Object getObjectValue(String paramString) {
    return getObject(paramString).getValue();
  }
  
  public int getSize() {
    Iterator<AbstractDataType> iterator = this.objectList.iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += ((AbstractDataType)iterator.next()).getSize());
    return i;
  }
  
  public final byte getTextEncoding() {
    AbstractDataType abstractDataType = getObject("TextEncoding");
    return (abstractDataType != null) ? ((Long)abstractDataType.getValue()).byteValue() : 0;
  }
  
  public String getUserFriendlyValue() {
    return toString();
  }
  
  public boolean isSubsetOf(Object<AbstractDataType> paramObject) {
    if (!(paramObject instanceof AbstractTagFrameBody))
      return false; 
    paramObject = (Object<AbstractDataType>)((AbstractTagFrameBody)paramObject).objectList;
    for (AbstractDataType abstractDataType : this.objectList) {
      if (abstractDataType.getValue() != null && !paramObject.contains(abstractDataType))
        return false; 
    } 
    return true;
  }
  
  public Iterator<? extends AbstractDataType> iterator() {
    return this.objectList.iterator();
  }
  
  public void setHeader(AbstractTagFrame paramAbstractTagFrame) {
    this.header = paramAbstractTagFrame;
  }
  
  public final void setObjectValue(String paramString, Object paramObject) {
    for (AbstractDataType abstractDataType : this.objectList) {
      if (abstractDataType.getIdentifier().equals(paramString))
        abstractDataType.setValue(paramObject); 
    } 
  }
  
  public final void setTextEncoding(byte paramByte) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
  }
  
  public abstract void setupObjectList();
  
  public String toString() {
    return getBriefDescription();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractTagFrameBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */