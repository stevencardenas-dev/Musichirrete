package org.jaudiotagger.tag.id3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;

public class AggregatedFrame implements TagTextField {
  protected Set<AbstractID3v2Frame> frames = new LinkedHashSet<AbstractID3v2Frame>();
  
  public void addFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    this.frames.add(paramAbstractID3v2Frame);
  }
  
  public void copyContent(TagField paramTagField) {}
  
  public String getContent() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<AbstractID3v2Frame> iterator = this.frames.iterator();
    while (iterator.hasNext())
      stringBuilder.append(((AbstractID3v2Frame)iterator.next()).getContent()); 
    return stringBuilder.toString();
  }
  
  public Charset getEncoding() {
    byte b = ((AbstractID3v2Frame)this.frames.iterator().next()).getBody().getTextEncoding();
    return TextEncoding.getInstanceOf().getCharsetForId(b);
  }
  
  public Set<AbstractID3v2Frame> getFrames() {
    return this.frames;
  }
  
  public String getId() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<AbstractID3v2Frame> iterator = this.frames.iterator();
    while (iterator.hasNext())
      stringBuilder.append(((AbstractID3v2Frame)iterator.next()).getId()); 
    return stringBuilder.toString();
  }
  
  public byte[] getRawContent() {
    throw new UnsupportedEncodingException();
  }
  
  public void isBinary(boolean paramBoolean) {}
  
  public boolean isBinary() {
    return false;
  }
  
  public boolean isCommon() {
    return true;
  }
  
  public boolean isEmpty() {
    return false;
  }
  
  public void setContent(String paramString) {}
  
  public void setEncoding(Charset paramCharset) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AggregatedFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */