package org.jaudiotagger.audio.aiff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jaudiotagger.audio.generic.GenericAudioHeader;

public class AiffAudioHeader extends GenericAudioHeader {
  private List<String> annotations = new ArrayList<String>();
  
  private List<String> applicationIdentifiers = new ArrayList<String>();
  
  private String author;
  
  private List<String> comments = new ArrayList<String>();
  
  private String copyright;
  
  private Endian endian = Endian.BIG_ENDIAN;
  
  private AiffType fileType;
  
  private String name;
  
  private Date timestamp;
  
  public void addAnnotation(String paramString) {
    this.annotations.add(paramString);
  }
  
  public void addApplicationIdentifier(String paramString) {
    this.applicationIdentifiers.add(paramString);
  }
  
  public void addComment(String paramString) {
    this.comments.add(paramString);
  }
  
  public List<String> getAnnotations() {
    return this.annotations;
  }
  
  public List<String> getApplicationIdentifiers() {
    return this.applicationIdentifiers;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public List<String> getComments() {
    return this.comments;
  }
  
  public String getCopyright() {
    return this.copyright;
  }
  
  public Endian getEndian() {
    return this.endian;
  }
  
  public AiffType getFileType() {
    return this.fileType;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Date getTimestamp() {
    return this.timestamp;
  }
  
  public void setAuthor(String paramString) {
    this.author = paramString;
  }
  
  public void setCopyright(String paramString) {
    this.copyright = paramString;
  }
  
  public void setEndian(Endian paramEndian) {
    this.endian = paramEndian;
  }
  
  public void setFileType(AiffType paramAiffType) {
    this.fileType = paramAiffType;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setTimestamp(Date paramDate) {
    this.timestamp = paramDate;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder("\n");
    str = this.name;
    if (str != null && !str.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder("\tName:");
      stringBuilder.append(this.name);
      stringBuilder.append("\n");
      stringBuilder1.append(stringBuilder.toString());
    } 
    str = this.author;
    if (str != null && !str.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder("\tAuthor:");
      stringBuilder.append(this.author);
      stringBuilder.append("\n");
      stringBuilder1.append(stringBuilder.toString());
    } 
    str = this.copyright;
    if (str != null && !str.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder("\tCopyright:");
      stringBuilder.append(this.copyright);
      stringBuilder.append("\n");
      stringBuilder1.append(stringBuilder.toString());
    } 
    if (this.comments.size() > 0) {
      stringBuilder1.append("Comments:\n");
      for (String str : this.comments) {
        StringBuilder stringBuilder = new StringBuilder("\t");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringBuilder1.append(stringBuilder.toString());
      } 
    } 
    if (this.applicationIdentifiers.size() > 0) {
      stringBuilder1.append("ApplicationIds:\n");
      for (String str1 : this.applicationIdentifiers) {
        StringBuilder stringBuilder = new StringBuilder("\t");
        stringBuilder.append(str1);
        stringBuilder.append("\n");
        stringBuilder1.append(stringBuilder.toString());
      } 
    } 
    if (this.annotations.size() > 0) {
      stringBuilder1.append("Annotations:\n");
      for (String str : this.annotations) {
        StringBuilder stringBuilder = new StringBuilder("\t");
        stringBuilder.append(str);
        stringBuilder.append("\n");
        stringBuilder1.append(stringBuilder.toString());
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(super.toString());
    stringBuilder2.append(stringBuilder1.toString());
    return stringBuilder2.toString();
  }
  
  public enum Endian {
    BIG_ENDIAN, LITTLE_ENDIAN;
    
    private static final Endian[] $VALUES = $values();
    
    static {
    
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffAudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */