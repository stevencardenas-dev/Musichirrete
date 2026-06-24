package org.jaudiotagger.tag.id3;

import z51;

public abstract class AbstractTagFrame extends AbstractTagItem {
  protected AbstractTagFrameBody frameBody;
  
  public AbstractTagFrame() {}
  
  public AbstractTagFrame(AbstractTagFrame paramAbstractTagFrame) {
    AbstractTagFrameBody abstractTagFrameBody = (AbstractTagFrameBody)ID3Tags.copyObject(paramAbstractTagFrame.frameBody);
    this.frameBody = abstractTagFrameBody;
    abstractTagFrameBody.setHeader(this);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof AbstractTagFrame))
      return false; 
    paramObject = paramObject;
    return (z51.a(getIdentifier(), paramObject.getIdentifier()) && z51.a(this.frameBody, ((AbstractTagFrame)paramObject).frameBody) && super.equals(paramObject));
  }
  
  public AbstractTagFrameBody getBody() {
    return this.frameBody;
  }
  
  public boolean isSubsetOf(Object paramObject) {
    if (!(paramObject instanceof AbstractTagFrame))
      return false; 
    AbstractTagFrameBody abstractTagFrameBody = this.frameBody;
    if (abstractTagFrameBody == null && ((AbstractTagFrame)paramObject).frameBody == null)
      return true; 
    if (abstractTagFrameBody != null) {
      AbstractTagFrameBody abstractTagFrameBody1 = ((AbstractTagFrame)paramObject).frameBody;
      if (abstractTagFrameBody1 != null && abstractTagFrameBody.isSubsetOf(abstractTagFrameBody1) && super.isSubsetOf(paramObject))
        return true; 
    } 
    return false;
  }
  
  public void setBody(AbstractTagFrameBody paramAbstractTagFrameBody) {
    this.frameBody = paramAbstractTagFrameBody;
    paramAbstractTagFrameBody.setHeader(this);
  }
  
  public String toString() {
    return getBody().toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractTagFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */