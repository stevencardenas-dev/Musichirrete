package org.jaudiotagger.tag.wav;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import org.jaudiotagger.audio.generic.GenericTag;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import wf2;

public class WavInfoTag extends GenericTag {
  private Long endLocationInFile = null;
  
  private Long startLocationInFile = null;
  
  private List<TagTextField> unrecognisedFields = new ArrayList<TagTextField>();
  
  static {
    GenericTag.supportedKeys = EnumSet.of(FieldKey.ALBUM, new FieldKey[] { 
          FieldKey.ARTIST, FieldKey.ALBUM_ARTIST, FieldKey.TITLE, FieldKey.TRACK, FieldKey.GENRE, FieldKey.COMMENT, FieldKey.YEAR, FieldKey.RECORD_LABEL, FieldKey.ISRC, FieldKey.COMPOSER, 
          FieldKey.LYRICIST, FieldKey.ENCODER, FieldKey.CONDUCTOR, FieldKey.RATING, FieldKey.COPYRIGHT });
  }
  
  public void addUnRecognizedField(String paramString1, String paramString2) {
    this.unrecognisedFields.add(new GenericTag.GenericTagTextField(paramString1, paramString2));
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public Long getEndLocationInFile() {
    return this.endLocationInFile;
  }
  
  public long getSizeOfTag() {
    Long long_ = this.endLocationInFile;
    return (long_ == null || this.startLocationInFile == null) ? 0L : (long_.longValue() - this.startLocationInFile.longValue() - 8L);
  }
  
  public Long getStartLocationInFile() {
    return this.startLocationInFile;
  }
  
  public List<TagTextField> getUnrecognisedFields() {
    return this.unrecognisedFields;
  }
  
  public void setEndLocationInFile(long paramLong) {
    this.endLocationInFile = Long.valueOf(paramLong);
  }
  
  public void setStartLocationInFile(long paramLong) {
    this.startLocationInFile = Long.valueOf(paramLong);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Wav Info Tag:\n");
    if (getStartLocationInFile() != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tstartLocation:");
      stringBuilder1.append(wf2.c(getStartLocationInFile().longValue()));
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (getEndLocationInFile() != null) {
      StringBuilder stringBuilder1 = new StringBuilder("\tendLocation:");
      stringBuilder1.append(wf2.c(getEndLocationInFile().longValue()));
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    stringBuilder.append(super.toString().replace("\000", ""));
    if (this.unrecognisedFields.size() > 0) {
      stringBuilder.append("\nUnrecognized Tags:\n");
      for (TagTextField tagTextField : this.unrecognisedFields) {
        StringBuilder stringBuilder1 = new StringBuilder("\t");
        stringBuilder1.append(tagTextField.getId());
        stringBuilder1.append(":");
        stringBuilder1.append(tagTextField.getContent().replace("\000", ""));
        stringBuilder1.append("\n");
        stringBuilder.append(stringBuilder1.toString());
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\wav\WavInfoTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */