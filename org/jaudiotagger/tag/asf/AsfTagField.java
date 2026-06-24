package org.jaudiotagger.tag.asf;

import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.tag.TagField;
import tp;

public class AsfTagField implements TagField, Cloneable {
  static final boolean $assertionsDisabled = false;
  
  protected MetadataDescriptor toWrap;
  
  public AsfTagField(String paramString) {
    this.toWrap = new MetadataDescriptor(AsfFieldKey.getAsfFieldKey(paramString).getHighestContainer(), paramString, 0);
  }
  
  public AsfTagField(MetadataDescriptor paramMetadataDescriptor) {
    this.toWrap = paramMetadataDescriptor.createCopy();
  }
  
  public AsfTagField(AsfFieldKey paramAsfFieldKey) {
    this.toWrap = new MetadataDescriptor(paramAsfFieldKey.getHighestContainer(), paramAsfFieldKey.getFieldName(), 0);
  }
  
  public Object clone() {
    return super.clone();
  }
  
  public void copyContent(TagField paramTagField) {
    throw new UnsupportedOperationException("Not implemented yet.");
  }
  
  public MetadataDescriptor getDescriptor() {
    return this.toWrap;
  }
  
  public String getId() {
    return this.toWrap.getName();
  }
  
  public byte[] getRawContent() {
    return this.toWrap.getRawData();
  }
  
  public void isBinary(boolean paramBoolean) {
    if (paramBoolean || !isBinary()) {
      MetadataDescriptor metadataDescriptor = this.toWrap;
      metadataDescriptor.setBinaryValue(metadataDescriptor.getRawData());
      return;
    } 
    tp.j("No conversion supported.");
  }
  
  public boolean isBinary() {
    return (this.toWrap.getType() == 1);
  }
  
  public boolean isCommon() {
    return AsfTag.COMMON_FIELDS.contains(AsfFieldKey.getAsfFieldKey(getId()));
  }
  
  public boolean isEmpty() {
    return this.toWrap.isEmpty();
  }
  
  public String toString() {
    return this.toWrap.getString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfTagField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */