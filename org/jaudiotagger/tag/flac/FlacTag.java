package org.jaudiotagger.tag.flac;

import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0;
import mk;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.reference.PictureTypes;
import org.jaudiotagger.tag.vorbiscomment.VorbisAlbumArtistSaveOptions;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentFieldKey;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import tp;

public class FlacTag implements Tag {
  private List<MetadataBlockDataPicture> images;
  
  private VorbisCommentTag tag = null;
  
  public FlacTag() {
    this(VorbisCommentTag.createNewTag(), new ArrayList<MetadataBlockDataPicture>());
  }
  
  public FlacTag(VorbisCommentTag paramVorbisCommentTag, List<MetadataBlockDataPicture> paramList) {
    new ArrayList();
    this.tag = paramVorbisCommentTag;
    this.images = paramList;
  }
  
  public void addField(String paramString1, String paramString2) {
    addField(createField(paramString1, paramString2));
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramVarArgs != null) {
      String str = paramVarArgs[0];
      if (str != null) {
        if (paramFieldKey == FieldKey.ALBUM_ARTIST) {
          int i = null.$SwitchMap$org$jaudiotagger$tag$vorbiscomment$VorbisAlbumArtistSaveOptions[TagOptionSingleton.getInstance().getVorbisAlbumArtistSaveOptions().ordinal()];
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4) {
                  if (i != 5)
                    return; 
                  addField(createField(paramFieldKey, new String[] { str }));
                  addField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
                  return;
                } 
                addField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
                deleteField(VorbisCommentFieldKey.ALBUMARTIST.getFieldName());
                return;
              } 
              addField(createField(paramFieldKey, new String[] { str }));
              deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName());
              return;
            } 
            addField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
            return;
          } 
          addField(createField(paramFieldKey, new String[] { str }));
          return;
        } 
        addField(createField(paramFieldKey, new String[] { str }));
        return;
      } 
    } 
    l0.l("Argument cannot be null");
  }
  
  public void addField(TagField paramTagField) {
    if (paramTagField instanceof MetadataBlockDataPicture) {
      this.images.add((MetadataBlockDataPicture)paramTagField);
      return;
    } 
    this.tag.addField(paramTagField);
  }
  
  public void addField(Artwork paramArtwork) {
    addField(createField(paramArtwork));
  }
  
  public TagField createArtworkField(byte[] paramArrayOfbyte, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramArrayOfbyte != null)
      return (TagField)new MetadataBlockDataPicture(paramArrayOfbyte, paramInt1, paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5); 
    throw new FieldDataInvalidException("ImageData cannot be null");
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return this.tag.createCompilationField(paramBoolean);
  }
  
  public TagField createField(String paramString1, String paramString2) {
    if (!paramString1.equals(VorbisCommentFieldKey.COVERART.getFieldName()))
      return this.tag.createField(paramString1, paramString2); 
    tp.j("Cover Art cannot be created using this method");
    return null;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (!paramFieldKey.equals(FieldKey.COVER_ART))
      return this.tag.createField(paramFieldKey, paramVarArgs); 
    tp.j("Cover Art cannot be created using this method");
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    if (paramArtwork.isLinked())
      return (TagField)new MetadataBlockDataPicture(paramArtwork.getImageUrl().getBytes(mk.b), paramArtwork.getPictureType(), "-->", "", 0, 0, 0, 0); 
    if (paramArtwork.setImageFromData())
      return (TagField)new MetadataBlockDataPicture(paramArtwork.getBinaryData(), paramArtwork.getPictureType(), paramArtwork.getMimeType(), paramArtwork.getDescription(), paramArtwork.getWidth(), paramArtwork.getHeight(), 0, 0); 
    throw new FieldDataInvalidException("Unable to createField buffered image from the image");
  }
  
  public TagField createField(VorbisCommentFieldKey paramVorbisCommentFieldKey, String paramString) {
    if (!paramVorbisCommentFieldKey.equals(VorbisCommentFieldKey.COVERART))
      return this.tag.createField(paramVorbisCommentFieldKey, paramString); 
    tp.j("Cover Art cannot be created using this method");
    return null;
  }
  
  public TagField createLinkedArtworkField(String paramString) {
    return (TagField)new MetadataBlockDataPicture(paramString.getBytes(mk.b), PictureTypes.DEFAULT_ID.intValue(), "-->", "", 0, 0, 0, 0);
  }
  
  public void deleteArtworkField() {
    deleteField(FieldKey.COVER_ART);
  }
  
  public void deleteField(String paramString) {
    if (paramString.equals(FieldKey.COVER_ART.name())) {
      this.images.clear();
      return;
    } 
    this.tag.deleteField(paramString);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (paramFieldKey.equals(FieldKey.COVER_ART)) {
      this.images.clear();
      return;
    } 
    this.tag.deleteField(paramFieldKey);
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    if (paramFieldKey != FieldKey.COVER_ART)
      return this.tag.getAll(paramFieldKey); 
    tp.j(ckOPp.cvXNUkZV);
    return null;
  }
  
  public List<Artwork> getArtworkList() {
    ArrayList<Artwork> arrayList = new ArrayList(this.images.size());
    Iterator<MetadataBlockDataPicture> iterator = this.images.iterator();
    while (iterator.hasNext())
      arrayList.add(ArtworkFactory.createArtworkFromMetadataBlockDataPicture(iterator.next())); 
    return arrayList;
  }
  
  public int getFieldCount() {
    int i = this.tag.getFieldCount();
    return this.images.size() + i;
  }
  
  public int getFieldCountIncludingSubValues() {
    return getFieldCount();
  }
  
  public Iterator<TagField> getFields() {
    return this.tag.getFields();
  }
  
  public List<TagField> getFields(String paramString) {
    Iterator<MetadataBlockDataPicture> iterator;
    if (paramString.equals(FieldKey.COVER_ART.name())) {
      ArrayList<MetadataBlockDataPicture> arrayList = new ArrayList();
      iterator = this.images.iterator();
      while (iterator.hasNext())
        arrayList.add(iterator.next()); 
      return (List)arrayList;
    } 
    return this.tag.getFields((String)iterator);
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    Iterator<MetadataBlockDataPicture> iterator;
    if (paramFieldKey.equals(FieldKey.COVER_ART)) {
      ArrayList<MetadataBlockDataPicture> arrayList = new ArrayList();
      iterator = this.images.iterator();
      while (iterator.hasNext())
        arrayList.add(iterator.next()); 
      return (List)arrayList;
    } 
    return this.tag.getFields((FieldKey)iterator);
  }
  
  public String getFirst(String paramString) {
    if (!paramString.equals(FieldKey.COVER_ART.name()))
      return this.tag.getFirst(paramString); 
    tp.j("Cover Art cannot be created using this method");
    return null;
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
    return paramString.equals(FieldKey.COVER_ART.name()) ? ((this.images.size() > 0) ? (TagField)this.images.get(0) : null) : this.tag.getFirstField(paramString);
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      FieldKey fieldKey = FieldKey.COVER_ART;
      return (paramFieldKey == fieldKey) ? getFirstField(fieldKey.name()) : this.tag.getFirstField(paramFieldKey);
    } 
    l0.d();
    return null;
  }
  
  public List<MetadataBlockDataPicture> getImages() {
    return this.images;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (!paramFieldKey.equals(FieldKey.COVER_ART))
      return this.tag.getValue(paramFieldKey, paramInt); 
    tp.j("Cover Art cannot be retrieved using this method");
    return null;
  }
  
  public VorbisCommentTag getVorbisCommentTag() {
    return this.tag;
  }
  
  public boolean hasCommonFields() {
    return this.tag.hasCommonFields();
  }
  
  public boolean hasField(String paramString) {
    return paramString.equals(FieldKey.COVER_ART.name()) ? ((this.images.size() > 0)) : this.tag.hasField(paramString);
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return (paramFieldKey == FieldKey.COVER_ART) ? ((this.images.size() > 0)) : this.tag.hasField(paramFieldKey);
  }
  
  public boolean hasField(VorbisCommentFieldKey paramVorbisCommentFieldKey) {
    return this.tag.hasField(paramVorbisCommentFieldKey);
  }
  
  public boolean isEmpty() {
    VorbisCommentTag vorbisCommentTag = this.tag;
    return ((vorbisCommentTag == null || vorbisCommentTag.isEmpty()) && this.images.size() == 0);
  }
  
  public boolean setEncoding(Charset paramCharset) {
    return this.tag.setEncoding(paramCharset);
  }
  
  public void setField(String paramString1, String paramString2) {
    setField(createField(paramString1, paramString2));
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramVarArgs != null) {
      String str = paramVarArgs[0];
      if (str != null) {
        if (paramFieldKey == FieldKey.ALBUM_ARTIST) {
          int i = null.$SwitchMap$org$jaudiotagger$tag$vorbiscomment$VorbisAlbumArtistSaveOptions[TagOptionSingleton.getInstance().getVorbisAlbumArtistSaveOptions().ordinal()];
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4) {
                  if (i != 5)
                    return; 
                  setField(createField(paramFieldKey, new String[] { str }));
                  setField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
                  return;
                } 
                setField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
                deleteField(VorbisCommentFieldKey.ALBUMARTIST.getFieldName());
                return;
              } 
              setField(createField(paramFieldKey, new String[] { str }));
              deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName());
              return;
            } 
            setField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
            return;
          } 
          setField(createField(paramFieldKey, new String[] { str }));
          return;
        } 
        setField(createField(paramFieldKey, new String[] { str }));
        return;
      } 
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setField(TagField paramTagField) {
    if (paramTagField instanceof MetadataBlockDataPicture) {
      int i = this.images.size();
      List<MetadataBlockDataPicture> list = this.images;
      if (i == 0) {
        list.add(0, (MetadataBlockDataPicture)paramTagField);
        return;
      } 
      list.set(0, (MetadataBlockDataPicture)paramTagField);
      return;
    } 
    this.tag.setField(paramTagField);
  }
  
  public void setField(Artwork paramArtwork) {
    setField(createField(paramArtwork));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("FLAC ");
    stringBuilder.append(getVorbisCommentTag());
    stringBuilder = new StringBuilder(stringBuilder.toString());
    if (this.images.size() > 0) {
      stringBuilder.append("\n\tImages\n");
      Iterator<MetadataBlockDataPicture> iterator = this.images.iterator();
      while (iterator.hasNext())
        stringBuilder.append(iterator.next()); 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\flac\FlacTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */