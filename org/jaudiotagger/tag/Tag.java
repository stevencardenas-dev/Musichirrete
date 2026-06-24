package org.jaudiotagger.tag;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.tag.images.Artwork;

public interface Tag {
  void addField(FieldKey paramFieldKey, String... paramVarArgs);
  
  void addField(TagField paramTagField);
  
  void addField(Artwork paramArtwork);
  
  TagField createCompilationField(boolean paramBoolean);
  
  TagField createField(FieldKey paramFieldKey, String... paramVarArgs);
  
  TagField createField(Artwork paramArtwork);
  
  void deleteArtworkField();
  
  void deleteField(String paramString);
  
  void deleteField(FieldKey paramFieldKey);
  
  List<String> getAll(FieldKey paramFieldKey);
  
  List<Artwork> getArtworkList();
  
  int getFieldCount();
  
  int getFieldCountIncludingSubValues();
  
  Iterator<TagField> getFields();
  
  List<TagField> getFields(String paramString);
  
  List<TagField> getFields(FieldKey paramFieldKey);
  
  String getFirst(String paramString);
  
  String getFirst(FieldKey paramFieldKey);
  
  Artwork getFirstArtwork();
  
  TagField getFirstField(String paramString);
  
  TagField getFirstField(FieldKey paramFieldKey);
  
  String getValue(FieldKey paramFieldKey, int paramInt);
  
  boolean hasCommonFields();
  
  boolean hasField(String paramString);
  
  boolean hasField(FieldKey paramFieldKey);
  
  boolean isEmpty();
  
  boolean setEncoding(Charset paramCharset);
  
  void setField(FieldKey paramFieldKey, String... paramVarArgs);
  
  void setField(TagField paramTagField);
  
  void setField(Artwork paramArtwork);
  
  String toString();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */