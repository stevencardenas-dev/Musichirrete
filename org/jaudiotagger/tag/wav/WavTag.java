package org.jaudiotagger.tag.wav;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.generic.GenericTag;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.audio.wav.WavOptions;
import org.jaudiotagger.tag.FieldDataInvalidException;
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

public class WavTag implements Tag, Id3SupportingTag {
  private static final String NULL = "\000";
  
  private static final Logger logger;
  
  private List<ChunkSummary> chunkSummaryList = new ArrayList<ChunkSummary>();
  
  private AbstractID3v2Tag id3Tag;
  
  private WavInfoTag infoTag;
  
  private boolean isBadChunkData = false;
  
  private boolean isExistingId3Tag = false;
  
  private boolean isExistingInfoTag = false;
  
  private boolean isIncorrectlyAlignedTag = false;
  
  private boolean isNonStandardPadding = false;
  
  private List<ChunkSummary> metadataChunkList = new ArrayList<ChunkSummary>();
  
  private WavOptions wavOptions;
  
  static {
    Logger logger = Logger.getLogger(WavTag.class.getPackage().getName());
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public WavTag(WavOptions paramWavOptions) {
    this.wavOptions = paramWavOptions;
  }
  
  private String addNullTerminatorIfNone(String paramString) {
    return paramString.endsWith("\000") ? paramString : paramString.concat("\000");
  }
  
  public static AbstractID3v2Tag createDefaultID3Tag() {
    return (AbstractID3v2Tag)((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V24) ? new ID3v24Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V23) ? new ID3v23Tag() : ((TagOptionSingleton.getInstance().getID3V2Version() == ID3V2Version.ID3_V22) ? new ID3v22Tag() : new ID3v23Tag())));
  }
  
  private String stripNullTerminator(String paramString) {
    return paramString.endsWith("\000") ? paramString.substring(0, paramString.length() - 1) : paramString;
  }
  
  public void addChunkSummary(ChunkSummary paramChunkSummary) {
    this.chunkSummaryList.add(paramChunkSummary);
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    addField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void addField(TagField paramTagField) {
    getActiveTag().addField(paramTagField);
  }
  
  public void addField(Artwork paramArtwork) {
    addField(createField(paramArtwork));
  }
  
  public void addMetadataChunkSummary(ChunkSummary paramChunkSummary) {
    this.metadataChunkList.add(paramChunkSummary);
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    return getActiveTag().createField(paramFieldKey, paramVarArgs);
  }
  
  public TagField createField(Artwork paramArtwork) {
    return getActiveTag().createField(paramArtwork);
  }
  
  public void deleteArtworkField() {
    getActiveTag().deleteArtworkField();
  }
  
  public void deleteField(String paramString) {
    getActiveTag().deleteField(paramString);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    getActiveTag().deleteField(paramFieldKey);
  }
  
  public boolean equals(Object paramObject) {
    return getActiveTag().equals(paramObject);
  }
  
  public Tag getActiveTag() {
    switch (this.wavOptions) {
      default:
        return (Tag)this.id3Tag;
      case null:
      case null:
        return (Tag)((isExistingInfoTag() || !isExistingId3Tag()) ? this.infoTag : this.id3Tag);
      case null:
      case null:
        return (Tag)((isExistingId3Tag() || !isExistingInfoTag()) ? this.id3Tag : this.infoTag);
      case null:
      case null:
        return (Tag)this.infoTag;
      case null:
      case null:
        break;
    } 
    return (Tag)this.id3Tag;
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    return getActiveTag().getAll(paramFieldKey);
  }
  
  public List<Artwork> getArtworkList() {
    return getActiveTag().getArtworkList();
  }
  
  public List<ChunkSummary> getChunkSummaryList() {
    return this.chunkSummaryList;
  }
  
  public long getEndLocationInFileOfId3Chunk() {
    return !isExistingId3Tag() ? 0L : this.id3Tag.getEndLocationInFile().longValue();
  }
  
  public int getFieldCount() {
    return getActiveTag().getFieldCount();
  }
  
  public int getFieldCountIncludingSubValues() {
    return getFieldCount();
  }
  
  public Iterator<TagField> getFields() {
    return getActiveTag().getFields();
  }
  
  public List<TagField> getFields(String paramString) {
    return getActiveTag().getFields(paramString);
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    return getActiveTag().getFields(paramFieldKey);
  }
  
  public String getFirst(String paramString) {
    return getActiveTag().getFirst(paramString);
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public Artwork getFirstArtwork() {
    return getActiveTag().getFirstArtwork();
  }
  
  public TagField getFirstField(String paramString) {
    return getActiveTag().getFirstField(paramString);
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    if (paramFieldKey != null)
      return getActiveTag().getFirstField(paramFieldKey); 
    l0.d();
    return null;
  }
  
  public AbstractID3v2Tag getID3Tag() {
    return this.id3Tag;
  }
  
  public WavInfoTag getInfoTag() {
    return this.infoTag;
  }
  
  public List<ChunkSummary> getMetadataChunkSummaryList() {
    return this.metadataChunkList;
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
    return getActiveTag().getValue(paramFieldKey, paramInt);
  }
  
  public boolean hasCommonFields() {
    return getActiveTag().hasCommonFields();
  }
  
  public boolean hasField(String paramString) {
    return getActiveTag().hasField(paramString);
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return getActiveTag().hasField(paramFieldKey);
  }
  
  public boolean isBadChunkData() {
    return this.isBadChunkData;
  }
  
  public boolean isEmpty() {
    return (getActiveTag() == null || getActiveTag().isEmpty());
  }
  
  public boolean isExistingId3Tag() {
    return this.isExistingId3Tag;
  }
  
  public boolean isExistingInfoTag() {
    return this.isExistingInfoTag;
  }
  
  public boolean isID3Tag() {
    return (this.id3Tag != null);
  }
  
  public boolean isIncorrectlyAlignedTag() {
    return this.isIncorrectlyAlignedTag;
  }
  
  public boolean isInfoTag() {
    return (this.infoTag != null);
  }
  
  public boolean isNonStandardPadding() {
    return this.isNonStandardPadding;
  }
  
  public void setBadChunkData(boolean paramBoolean) {
    this.isBadChunkData = paramBoolean;
  }
  
  public boolean setEncoding(Charset paramCharset) {
    return getActiveTag().setEncoding(paramCharset);
  }
  
  public void setExistingId3Tag(boolean paramBoolean) {
    this.isExistingId3Tag = paramBoolean;
  }
  
  public void setExistingInfoTag(boolean paramBoolean) {
    this.isExistingInfoTag = paramBoolean;
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void setField(TagField paramTagField) {
    getActiveTag().setField(paramTagField);
  }
  
  public void setField(Artwork paramArtwork) {
    setField(createField(paramArtwork));
  }
  
  public void setID3Tag(AbstractID3v2Tag paramAbstractID3v2Tag) {
    this.id3Tag = paramAbstractID3v2Tag;
  }
  
  public void setIncorrectlyAlignedTag(boolean paramBoolean) {
    this.isIncorrectlyAlignedTag = paramBoolean;
  }
  
  public void setInfoTag(WavInfoTag paramWavInfoTag) {
    this.infoTag = paramWavInfoTag;
  }
  
  public void setNonStandardPadding(boolean paramBoolean) {
    this.isNonStandardPadding = paramBoolean;
  }
  
  public void syncTagBeforeWrite() {
    if (getActiveTag() instanceof WavInfoTag) {
      syncToId3FromInfoOverwrite();
      return;
    } 
    syncToInfoFromId3Overwrite();
  }
  
  public void syncTagsAfterRead() {
    if (getActiveTag() instanceof WavInfoTag) {
      syncToInfoFromId3IfEmpty();
      return;
    } 
    syncToId3FromInfoIfEmpty();
  }
  
  public void syncToId3FromInfoIfEmpty() {
    try {
      for (FieldKey fieldKey : GenericTag.getSupportedKeys()) {
        if (this.id3Tag.getFirst(fieldKey).isEmpty()) {
          String str = this.infoTag.getFirst(fieldKey);
          if (!str.isEmpty())
            this.id3Tag.setField(fieldKey, new String[] { stripNullTerminator(str) }); 
        } 
      } 
      return;
    } catch (FieldDataInvalidException fieldDataInvalidException) {
      logger.log(Level.INFO, "Couldn't sync to ID3 because the data to sync was invalid", (Throwable)fieldDataInvalidException);
      return;
    } 
  }
  
  public void syncToId3FromInfoOverwrite() {
    try {
      for (FieldKey fieldKey : GenericTag.getSupportedKeys()) {
        boolean bool = this.infoTag.getFirst(fieldKey).isEmpty();
        AbstractID3v2Tag abstractID3v2Tag = this.id3Tag;
        if (!bool) {
          abstractID3v2Tag.setField(fieldKey, new String[] { stripNullTerminator(this.infoTag.getFirst(fieldKey)) });
          continue;
        } 
        abstractID3v2Tag.deleteField(fieldKey);
      } 
      return;
    } catch (FieldDataInvalidException fieldDataInvalidException) {
      logger.log(Level.INFO, "Couldn't sync to ID3 because the data to sync was invalid", (Throwable)fieldDataInvalidException);
      return;
    } 
  }
  
  public void syncToInfoFromId3IfEmpty() {
    try {
      for (FieldKey fieldKey : GenericTag.getSupportedKeys()) {
        if (this.infoTag.getFirst(fieldKey).isEmpty() && !this.id3Tag.getFirst(fieldKey).isEmpty())
          this.infoTag.setField(fieldKey, new String[] { addNullTerminatorIfNone(this.id3Tag.getFirst(fieldKey)) }); 
      } 
      return;
    } catch (FieldDataInvalidException fieldDataInvalidException) {
      logger.log(Level.INFO, "Couldn't sync to INFO because the data to sync was invalid", (Throwable)fieldDataInvalidException);
      return;
    } 
  }
  
  public void syncToInfoFromId3Overwrite() {
    try {
      for (FieldKey fieldKey : GenericTag.getSupportedKeys()) {
        boolean bool = this.id3Tag.getFirst(fieldKey).isEmpty();
        WavInfoTag wavInfoTag = this.infoTag;
        if (!bool) {
          wavInfoTag.setField(fieldKey, new String[] { addNullTerminatorIfNone(this.id3Tag.getFirst(fieldKey)) });
          continue;
        } 
        wavInfoTag.deleteField(fieldKey);
      } 
      return;
    } catch (FieldDataInvalidException fieldDataInvalidException) {
      logger.log(Level.INFO, "Couldn't sync to INFO because the data to sync was invalid", (Throwable)fieldDataInvalidException);
      return;
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Chunk Summary:\n");
    for (ChunkSummary chunkSummary : this.chunkSummaryList) {
      StringBuilder stringBuilder1 = new StringBuilder("\t");
      stringBuilder1.append(chunkSummary.toString());
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    stringBuilder.append("\n");
    if (this.id3Tag != null) {
      stringBuilder.append("Wav ID3 Tag:\n");
      if (isExistingId3Tag()) {
        StringBuilder stringBuilder2 = new StringBuilder("\tstartLocation:");
        stringBuilder2.append(wf2.c(getStartLocationInFileOfId3Chunk()));
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("\tendLocation:");
        stringBuilder2.append(wf2.c(getEndLocationInFileOfId3Chunk()));
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.id3Tag.toString().replace("\000", ""));
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    if (this.infoTag != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(this.infoTag.toString());
      stringBuilder1.append("\n");
      stringBuilder.append(stringBuilder1.toString());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\wav\WavTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */