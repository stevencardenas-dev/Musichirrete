package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import mk;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.mp4.Mp4TagField;
import org.jaudiotagger.tag.mp4.atom.Mp4DataBox;

public class Mp4TagTextField extends Mp4TagField implements TagTextField {
  protected String content;
  
  protected int dataSize;
  
  public Mp4TagTextField(String paramString1, String paramString2) {
    super(paramString1);
    this.content = paramString2;
  }
  
  public Mp4TagTextField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    Mp4DataBox mp4DataBox = new Mp4DataBox(mp4BoxHeader, paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    this.content = mp4DataBox.getContent();
  }
  
  public void copyContent(TagField paramTagField) {
    if (paramTagField instanceof Mp4TagTextField)
      this.content = ((Mp4TagTextField)paramTagField).getContent(); 
  }
  
  public String getContent() {
    return this.content;
  }
  
  public byte[] getDataBytes() {
    return this.content.getBytes(getEncoding());
  }
  
  public Charset getEncoding() {
    return mk.c;
  }
  
  public Mp4FieldType getFieldType() {
    return Mp4FieldType.TEXT;
  }
  
  public boolean isBinary() {
    return false;
  }
  
  public boolean isEmpty() {
    return this.content.trim().equals("");
  }
  
  public void setContent(String paramString) {
    this.content = paramString;
  }
  
  public void setEncoding(Charset paramCharset) {}
  
  public String toString() {
    return this.content;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagTextField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */