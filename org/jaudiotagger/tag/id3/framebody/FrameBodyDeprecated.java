package org.jaudiotagger.tag.id3.framebody;

public class FrameBodyDeprecated extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  private AbstractID3v2FrameBody originalFrameBody;
  
  public FrameBodyDeprecated(AbstractID3v2FrameBody paramAbstractID3v2FrameBody) {
    this.originalFrameBody = paramAbstractID3v2FrameBody;
  }
  
  public FrameBodyDeprecated(FrameBodyDeprecated paramFrameBodyDeprecated) {
    super(paramFrameBodyDeprecated);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof FrameBodyDeprecated))
      return false; 
    FrameBodyDeprecated frameBodyDeprecated = (FrameBodyDeprecated)paramObject;
    return (getIdentifier().equals(frameBodyDeprecated.getIdentifier()) && super.equals(paramObject));
  }
  
  public String getBriefDescription() {
    AbstractID3v2FrameBody abstractID3v2FrameBody = this.originalFrameBody;
    return (abstractID3v2FrameBody != null) ? abstractID3v2FrameBody.getBriefDescription() : "";
  }
  
  public String getIdentifier() {
    return this.originalFrameBody.getIdentifier();
  }
  
  public AbstractID3v2FrameBody getOriginalFrameBody() {
    return this.originalFrameBody;
  }
  
  public int getSize() {
    return this.originalFrameBody.getSize();
  }
  
  public void setupObjectList() {}
  
  public String toString() {
    return getIdentifier();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyDeprecated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */