package org.jaudiotagger.audio.generic;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.images.Artwork;

public abstract class AbstractTag implements Tag {
  protected int commonNumber = 0;
  
  protected Map<String, List<TagField>> fields = new LinkedHashMap<String, List<TagField>>();
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    addField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void addField(TagField paramTagField) {
    if (paramTagField != null) {
      List<TagField> list = this.fields.get(paramTagField.getId());
      if (list == null) {
        list = new ArrayList();
        list.add(paramTagField);
        this.fields.put(paramTagField.getId(), list);
        if (paramTagField.isCommon())
          this.commonNumber++; 
        return;
      } 
      list.add(paramTagField);
      return;
    } 
  }
  
  public void addField(Artwork paramArtwork) {
    addField(createField(paramArtwork));
  }
  
  public abstract TagField createField(FieldKey paramFieldKey, String... paramVarArgs);
  
  public void deleteArtworkField() {
    deleteField(FieldKey.COVER_ART);
  }
  
  public void deleteField(String paramString) {
    this.fields.remove(paramString);
  }
  
  public abstract void deleteField(FieldKey paramFieldKey);
  
  public List<TagField> getAll() {
    ArrayList<TagField> arrayList = new ArrayList();
    Iterator<List> iterator = this.fields.values().iterator();
    while (iterator.hasNext()) {
      Iterator<TagField> iterator1 = ((List)iterator.next()).iterator();
      while (iterator1.hasNext())
        arrayList.add(iterator1.next()); 
    } 
    return arrayList;
  }
  
  public List<String> getAll(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<TagField> iterator = getFields(paramString).iterator();
    while (iterator.hasNext())
      arrayList.add(((TagField)iterator.next()).toString()); 
    return arrayList;
  }
  
  public int getFieldCount() {
    Iterator<TagField> iterator = getFields();
    byte b = 0;
    while (iterator.hasNext()) {
      b++;
      iterator.next();
    } 
    return b;
  }
  
  public int getFieldCountIncludingSubValues() {
    return getFieldCount();
  }
  
  public Iterator<TagField> getFields() {
    return new Iterator<TagField>() {
        private Iterator<TagField> fieldsIt;
        
        final AbstractTag this$0;
        
        final Iterator val$it;
        
        private void changeIt() {
          if (!it.hasNext())
            return; 
          this.fieldsIt = ((List<TagField>)((Map.Entry)it.next()).getValue()).iterator();
        }
        
        public boolean hasNext() {
          if (this.fieldsIt == null)
            changeIt(); 
          if (!it.hasNext()) {
            Iterator<TagField> iterator = this.fieldsIt;
            if (iterator == null || !iterator.hasNext())
              return false; 
          } 
          return true;
        }
        
        public TagField next() {
          if (!this.fieldsIt.hasNext())
            changeIt(); 
          return this.fieldsIt.next();
        }
        
        public void remove() {
          this.fieldsIt.remove();
        }
      };
  }
  
  public List<TagField> getFields(String paramString) {
    List<TagField> list2 = this.fields.get(paramString);
    List<TagField> list1 = list2;
    if (list2 == null)
      list1 = new ArrayList(); 
    return list1;
  }
  
  public String getFirst(String paramString) {
    List<TagField> list = getFields(paramString);
    return (list.size() != 0) ? ((TagField)list.get(0)).toString() : "";
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public Artwork getFirstArtwork() {
    List<Artwork> list = getArtworkList();
    return (list.size() > 0) ? list.get(0) : null;
  }
  
  public TagField getFirstField(String paramString) {
    List<TagField> list = getFields(paramString);
    return (list.size() != 0) ? list.get(0) : null;
  }
  
  public abstract TagField getFirstField(FieldKey paramFieldKey);
  
  public String getItem(String paramString, int paramInt) {
    List<TagField> list = getFields(paramString);
    return (list.size() > paramInt) ? ((TagField)list.get(paramInt)).toString() : "";
  }
  
  public boolean hasCommonFields() {
    return (this.commonNumber != 0);
  }
  
  public boolean hasField(String paramString) {
    return (getFields(paramString).size() != 0);
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return hasField(paramFieldKey.name());
  }
  
  public abstract boolean isAllowedEncoding(Charset paramCharset);
  
  public boolean isEmpty() {
    return (this.fields.size() == 0);
  }
  
  public boolean setEncoding(Charset paramCharset) {
    if (!isAllowedEncoding(paramCharset))
      return false; 
    Iterator<TagField> iterator = getFields();
    while (iterator.hasNext()) {
      TagField tagField = iterator.next();
      if (tagField instanceof TagTextField)
        ((TagTextField)tagField).setEncoding(paramCharset); 
    } 
    return true;
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void setField(TagField paramTagField) {
    if (paramTagField != null) {
      List<TagField> list = this.fields.get(paramTagField.getId());
      if (list != null) {
        list.set(0, paramTagField);
        return;
      } 
      list = new ArrayList<TagField>();
      list.add(paramTagField);
      this.fields.put(paramTagField.getId(), list);
      if (paramTagField.isCommon())
        this.commonNumber++; 
    } 
  }
  
  public void setField(Artwork paramArtwork) {
    setField(createField(paramArtwork));
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("Tag content:\n");
    Iterator<TagField> iterator = getFields();
    while (iterator.hasNext()) {
      TagField tagField = iterator.next();
      stringBuffer.append("\t");
      stringBuffer.append(tagField.getId());
      stringBuffer.append(tlzLOCPTHRhep.VYFnSbeuwj);
      stringBuffer.append(tagField.toString());
      stringBuffer.append("\n");
    } 
    return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\generic\AbstractTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */