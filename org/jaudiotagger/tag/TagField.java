package org.jaudiotagger.tag;

public interface TagField {
  void copyContent(TagField paramTagField);
  
  String getId();
  
  byte[] getRawContent();
  
  void isBinary(boolean paramBoolean);
  
  boolean isBinary();
  
  boolean isCommon();
  
  boolean isEmpty();
  
  String toString();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\TagField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */