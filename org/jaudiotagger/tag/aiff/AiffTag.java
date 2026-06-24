package org.jaudiotagger.tag.aiff;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v22Tag;
import org.jaudiotagger.tag.id3.ID3v23Tag;
import org.jaudiotagger.tag.id3.ID3v24Tag;
import org.jaudiotagger.tag.id3.Id3SupportingTag;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.reference.ID3V2Version;
import wf2;

public class AiffTag implements Tag, Id3SupportingTag {
  private List<ChunkSummary> chunkSummaryList = new ArrayList<ChunkSummary>();
  
  private long fileSize;
  
  private long formSize;
  
  private AbstractID3v2Tag id3Tag;
  
  private boolean isExistingId3Tag = false;
  
  private boolean isIncorrectlyAlignedTag = false;
  
  private boolean lastChunkSizeExtendsPastFormSize = false;
  
  public AiffTag() {}
  
  public AiffTag(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.id3Tag = paramAbstractID3v2Tag;
  }
  
  public static AbstractID3v2Tag createDefaultID3Tag() {
    return (AbstractID3v2Tag)((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V24) ? new ID3v24Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V23) ? new ID3v23Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V22) ? new ID3v22Tag() : new ID3v23Tag())));
  }
  
  public void addChunkSummary(ChunkSummary paramChunkSummary) {
    this.chunkSummaryList.add(paramChunkSummary);
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    addField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void addField(TagField paramTagField) {
    this.id3Tag.addField(paramTagField);
  }
  
  public void addField(Artwork paramArtwork) {
    this.id3Tag.addField(paramArtwork);
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    return this.id3Tag.createField(paramFieldKey, paramVarArgs);
  }
  
  public TagField createField(Artwork paramArtwork) {
    return this.id3Tag.createField(paramArtwork);
  }
  
  public void deleteArtworkField() {
    this.id3Tag.deleteArtworkField();
  }
  
  public void deleteField(String paramString) {
    this.id3Tag.deleteField(paramString);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    this.id3Tag.deleteField(paramFieldKey);
  }
  
  public boolean equals(Object paramObject) {
    return this.id3Tag.equals(paramObject);
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    return this.id3Tag.getAll(paramFieldKey);
  }
  
  public List<Artwork> getArtworkList() {
    return this.id3Tag.getArtworkList();
  }
  
  public List<ChunkSummary> getChunkSummaryList() {
    return this.chunkSummaryList;
  }
  
  public long getEndLocationInFileOfId3Chunk() {
    return !isExistingId3Tag() ? 0L : this.id3Tag.getEndLocationInFile().longValue();
  }
  
  public int getFieldCount() {
    return this.id3Tag.getFieldCount();
  }
  
  public int getFieldCountIncludingSubValues() {
    return getFieldCount();
  }
  
  public Iterator<TagField> getFields() {
    return this.id3Tag.getFields();
  }
  
  public List<TagField> getFields(String paramString) {
    return this.id3Tag.getFields(paramString);
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    return this.id3Tag.getFields(paramFieldKey);
  }
  
  public long getFileSize() {
    return this.fileSize;
  }
  
  public String getFirst(String paramString) {
    return this.id3Tag.getFirst(paramString);
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public Artwork getFirstArtwork() {
    return this.id3Tag.getFirstArtwork();
  }
  
  public TagField getFirstField(String paramString) {
    return (TagField)this.id3Tag.getFirstField(paramString);
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    if (paramFieldKey != null)
      return this.id3Tag.getFirstField(paramFieldKey); 
    l0.d();
    return null;
  }
  
  public long getFormSize() {
    return this.formSize;
  }
  
  public AbstractID3v2Tag getID3Tag() {
    return this.id3Tag;
  }
  
  public long getSizeOfID3TagIncludingChunkHeader() {
    return !isExistingId3Tag() ? 0L : (getSizeOfID3TagOnly() + 8L);
  }
  
  public long getSizeOfID3TagOnly() {
    return !isExistingId3Tag() ? 0L : (this.id3Tag.getEndLocationInFile().longValue() - this.id3Tag.getStartLocationInFile().longValue());
  }
  
  public long getStartLocationInFileOfId3Chunk() {
    return !isExistingId3Tag() ? 0L : (this.id3Tag.getStartLocationInFile().longValue() - 8L);
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    return this.id3Tag.getValue(paramFieldKey, paramInt);
  }
  
  public boolean hasCommonFields() {
    return this.id3Tag.hasCommonFields();
  }
  
  public boolean hasField(String paramString) {
    return this.id3Tag.hasField(paramString);
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return this.id3Tag.hasField(paramFieldKey);
  }
  
  public boolean isEmpty() {
    AbstractID3v2Tag abstractID3v2Tag = this.id3Tag;
    return (abstractID3v2Tag == null || abstractID3v2Tag.isEmpty());
  }
  
  public boolean isExistingId3Tag() {
    return this.isExistingId3Tag;
  }
  
  public boolean isIncorrectlyAlignedTag() {
    return this.isIncorrectlyAlignedTag;
  }
  
  public boolean isLastChunkSizeExtendsPastFormSize() {
    return this.lastChunkSizeExtendsPastFormSize;
  }
  
  public boolean setEncoding(Charset paramCharset) {
    return this.id3Tag.setEncoding(paramCharset);
  }
  
  public void setExistingId3Tag(boolean paramBoolean) {
    this.isExistingId3Tag = paramBoolean;
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void setField(TagField paramTagField) {
    this.id3Tag.setField(paramTagField);
  }
  
  public void setField(Artwork paramArtwork) {
    this.id3Tag.setField(paramArtwork);
  }
  
  public void setFileSize(long paramLong) {
    this.fileSize = paramLong;
  }
  
  public void setFormSize(long paramLong) {
    this.formSize = paramLong;
  }
  
  public void setID3Tag(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.id3Tag = paramAbstractID3v2Tag;
  }
  
  public void setIncorrectlyAlignedTag(boolean paramBoolean) {
    this.isIncorrectlyAlignedTag = paramBoolean;
  }
  
  public void setLastChunkSizeExtendsPastFormSize(boolean paramBoolean) {
    this.lastChunkSizeExtendsPastFormSize = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder("FileSize:");
    stringBuilder2.append(wf2.c(this.fileSize));
    stringBuilder2.append("\n");
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder2 = new StringBuilder("FORMSize:");
    stringBuilder2.append(wf2.c(this.formSize + 8L));
    stringBuilder2.append("\n");
    stringBuilder1.append(stringBuilder2.toString());
    if (this.lastChunkSizeExtendsPastFormSize) {
      stringBuilder1.append("Last Chunk extends past Form stated size\n");
    } else if (this.fileSize > this.formSize + 8L) {
      stringBuilder2 = new StringBuilder("Non Iff Data at End of File:");
      stringBuilder2.append(this.fileSize - this.formSize + 8L);
      stringBuilder2.append(PwbbJfsdcHrAjW.MWoVVjayEpzXJy);
      stringBuilder1.append(stringBuilder2.toString());
    } 
    stringBuilder1.append("Chunks:\n");
    for (ChunkSummary chunkSummary : this.chunkSummaryList) {
      StringBuilder stringBuilder = new StringBuilder("\t");
      stringBuilder.append(chunkSummary.toString());
      stringBuilder.append("\n");
      stringBuilder1.append(stringBuilder.toString());
    } 
    if (this.id3Tag != null) {
      stringBuilder1.append("Aiff ID3 Tag:\n");
      if (isExistingId3Tag()) {
        if (this.isIncorrectlyAlignedTag)
          stringBuilder1.append("\tincorrectly starts as odd byte\n"); 
        stringBuilder2 = new StringBuilder("\tstartLocation:");
        stringBuilder2.append(wf2.c(getStartLocationInFileOfId3Chunk()));
        stringBuilder2.append("\n");
        stringBuilder1.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("\tendLocation:");
        stringBuilder2.append(wf2.c(getEndLocationInFileOfId3Chunk()));
        stringBuilder2.append("\n");
        stringBuilder1.append(stringBuilder2.toString());
      } 
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(this.id3Tag.toString());
      stringBuilder2.append("\n");
      stringBuilder1.append(stringBuilder2.toString());
      return stringBuilder1.toString();
    } 
    return "tag:empty";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\aiff\AiffTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */