package org.jaudiotagger.audio.generic;

import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import l0;
import mk;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.images.Artwork;
import tp;

public abstract class GenericTag extends AbstractTag {
  private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
  
  protected static EnumSet<FieldKey> supportedKeys = EnumSet.of(FieldKey.ALBUM, new FieldKey[] { FieldKey.ARTIST, FieldKey.TITLE, FieldKey.TRACK, FieldKey.GENRE, FieldKey.COMMENT, FieldKey.YEAR });
  
  public static EnumSet<FieldKey> getSupportedKeys() {
    return supportedKeys;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (supportedKeys.contains(paramFieldKey)) {
      if (paramVarArgs != null && paramVarArgs[0] != null)
        return (TagField)new GenericTagTextField(paramFieldKey.name(), paramVarArgs[0]); 
      l0.l("Argument cannot be null");
      return null;
    } 
    tp.j(MessageFormat.format("Not available for this field {0}", new Object[] { paramFieldKey }));
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (supportedKeys.contains(paramFieldKey)) {
      deleteField(paramFieldKey.name());
      return;
    } 
    tp.j(MessageFormat.format("Not available for this field {0}", new Object[] { paramFieldKey }));
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    return getAll(paramFieldKey.name());
  }
  
  public List<Artwork> getArtworkList() {
    return Collections.EMPTY_LIST;
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    List<TagField> list2 = this.fields.get(paramFieldKey.name());
    List<TagField> list1 = list2;
    if (list2 == null)
      list1 = new ArrayList(); 
    return list1;
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    if (supportedKeys.contains(paramFieldKey))
      return getFirstField(paramFieldKey.name()); 
    tp.j(MessageFormat.format("Not available for this field {0}", new Object[] { paramFieldKey }));
    return null;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (supportedKeys.contains(paramFieldKey))
      return getItem(paramFieldKey.name(), paramInt); 
    tp.j(MessageFormat.format(jHxlGgUTadw.fcrVuf, new Object[] { paramFieldKey }));
    return null;
  }
  
  public boolean isAllowedEncoding(Charset paramCharset) {
    return true;
  }
  
  public static class GenericTagTextField implements TagTextField {
    private String content;
    
    private final String id;
    
    public GenericTagTextField(String param1String1, String param1String2) {
      this.id = param1String1;
      this.content = param1String2;
    }
    
    public void copyContent(TagField param1TagField) {
      if (param1TagField instanceof TagTextField)
        this.content = ((TagTextField)param1TagField).getContent(); 
    }
    
    public String getContent() {
      return this.content;
    }
    
    public Charset getEncoding() {
      return mk.b;
    }
    
    public String getId() {
      return this.id;
    }
    
    public byte[] getRawContent() {
      String str = this.content;
      return (str == null) ? GenericTag.a() : str.getBytes(getEncoding());
    }
    
    public void isBinary(boolean param1Boolean) {}
    
    public boolean isBinary() {
      return false;
    }
    
    public boolean isCommon() {
      return true;
    }
    
    public boolean isEmpty() {
      return "".equals(this.content);
    }
    
    public void setContent(String param1String) {
      this.content = param1String;
    }
    
    public void setEncoding(Charset param1Charset) {}
    
    public String toString() {
      return getContent();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\GenericTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */