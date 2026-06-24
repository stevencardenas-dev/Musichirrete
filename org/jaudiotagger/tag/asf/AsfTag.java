package org.jaudiotagger.tag.asf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l0;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.generic.AbstractTag;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.reference.PictureTypes;
import tp;

public final class AsfTag extends AbstractTag {
  public static final Set<AsfFieldKey> COMMON_FIELDS;
  
  private static final EnumMap<FieldKey, AsfFieldKey> tagFieldToAsfField;
  
  private final boolean copyFields;
  
  static {
    EnumMap<FieldKey, Object> enumMap = new EnumMap<FieldKey, Object>(FieldKey.class);
    tagFieldToAsfField = (EnumMap)enumMap;
    enumMap.put(FieldKey.ACOUSTID_FINGERPRINT, AsfFieldKey.ACOUSTID_FINGERPRINT);
    enumMap.put(FieldKey.ACOUSTID_ID, AsfFieldKey.ACOUSTID_ID);
    FieldKey fieldKey1 = FieldKey.ALBUM;
    AsfFieldKey asfFieldKey1 = AsfFieldKey.ALBUM;
    enumMap.put(fieldKey1, asfFieldKey1);
    enumMap.put(FieldKey.ALBUM_ARTIST, AsfFieldKey.ALBUM_ARTIST);
    enumMap.put(FieldKey.ALBUM_ARTIST_SORT, AsfFieldKey.ALBUM_ARTIST_SORT);
    enumMap.put(FieldKey.ALBUM_ARTISTS, AsfFieldKey.ALBUM_ARTISTS);
    enumMap.put(FieldKey.ALBUM_ARTISTS_SORT, AsfFieldKey.ALBUM_ARTISTS_SORT);
    enumMap.put(FieldKey.ALBUM_SORT, AsfFieldKey.ALBUM_SORT);
    enumMap.put(FieldKey.ALBUM_YEAR, AsfFieldKey.ALBUM_YEAR);
    enumMap.put(FieldKey.AMAZON_ID, AsfFieldKey.AMAZON_ID);
    enumMap.put(FieldKey.ARRANGER, AsfFieldKey.ARRANGER);
    enumMap.put(FieldKey.ARRANGER_SORT, AsfFieldKey.ARRANGER_SORT);
    FieldKey fieldKey2 = FieldKey.ARTIST;
    AsfFieldKey asfFieldKey2 = AsfFieldKey.AUTHOR;
    enumMap.put(fieldKey2, asfFieldKey2);
    enumMap.put(FieldKey.ARTISTS, AsfFieldKey.ARTISTS);
    enumMap.put(FieldKey.ARTISTS_SORT, AsfFieldKey.ARTISTS_SORT);
    enumMap.put(FieldKey.ARTIST_SORT, AsfFieldKey.ARTIST_SORT);
    enumMap.put(FieldKey.BARCODE, AsfFieldKey.BARCODE);
    enumMap.put(FieldKey.BPM, AsfFieldKey.BPM);
    enumMap.put(FieldKey.CATALOG_NO, AsfFieldKey.CATALOG_NO);
    enumMap.put(FieldKey.CHOIR, AsfFieldKey.CHOIR);
    enumMap.put(FieldKey.CHOIR_SORT, AsfFieldKey.CHOIR_SORT);
    enumMap.put(FieldKey.CLASSICAL_CATALOG, AsfFieldKey.CLASSICAL_CATALOG);
    enumMap.put(FieldKey.CLASSICAL_NICKNAME, AsfFieldKey.CLASSICAL_NICKNAME);
    FieldKey fieldKey3 = FieldKey.COMMENT;
    AsfFieldKey asfFieldKey3 = AsfFieldKey.DESCRIPTION;
    enumMap.put(fieldKey3, asfFieldKey3);
    enumMap.put(FieldKey.COMPOSER, AsfFieldKey.COMPOSER);
    enumMap.put(FieldKey.COMPOSER_SORT, AsfFieldKey.COMPOSER_SORT);
    enumMap.put(FieldKey.CONDUCTOR, AsfFieldKey.CONDUCTOR);
    enumMap.put(FieldKey.CONDUCTOR_SORT, AsfFieldKey.CONDUCTOR_SORT);
    enumMap.put(FieldKey.COPYRIGHT, AsfFieldKey.COPYRIGHT);
    enumMap.put(FieldKey.COUNTRY, AsfFieldKey.COUNTRY);
    enumMap.put(FieldKey.COVER_ART, AsfFieldKey.COVER_ART);
    enumMap.put(FieldKey.CUSTOM1, AsfFieldKey.CUSTOM1);
    enumMap.put(FieldKey.CUSTOM2, AsfFieldKey.CUSTOM2);
    enumMap.put(FieldKey.CUSTOM3, AsfFieldKey.CUSTOM3);
    enumMap.put(FieldKey.CUSTOM4, AsfFieldKey.CUSTOM4);
    enumMap.put(FieldKey.CUSTOM5, AsfFieldKey.CUSTOM5);
    enumMap.put(FieldKey.DISC_NO, AsfFieldKey.DISC_NO);
    enumMap.put(FieldKey.DISC_SUBTITLE, AsfFieldKey.DISC_SUBTITLE);
    enumMap.put(FieldKey.DISC_TOTAL, AsfFieldKey.DISC_TOTAL);
    enumMap.put(FieldKey.DJMIXER, AsfFieldKey.DJMIXER);
    enumMap.put(FieldKey.DJMIXER_SORT, AsfFieldKey.DJMIXER_SORT);
    enumMap.put(FieldKey.MOOD_ELECTRONIC, AsfFieldKey.MOOD_ELECTRONIC);
    enumMap.put(FieldKey.ENCODER, AsfFieldKey.ENCODER);
    enumMap.put(FieldKey.ENGINEER, AsfFieldKey.ENGINEER);
    enumMap.put(FieldKey.ENGINEER_SORT, AsfFieldKey.ENGINEER_SORT);
    enumMap.put(FieldKey.ENSEMBLE, AsfFieldKey.ENSEMBLE);
    enumMap.put(FieldKey.ENSEMBLE_SORT, AsfFieldKey.ENSEMBLE_SORT);
    enumMap.put(FieldKey.FBPM, AsfFieldKey.FBPM);
    FieldKey fieldKey4 = FieldKey.GENRE;
    AsfFieldKey asfFieldKey4 = AsfFieldKey.GENRE;
    enumMap.put(fieldKey4, asfFieldKey4);
    enumMap.put(FieldKey.GROUP, AsfFieldKey.GROUP);
    enumMap.put(FieldKey.GROUPING, AsfFieldKey.GROUPING);
    enumMap.put(FieldKey.INSTRUMENT, AsfFieldKey.INSTRUMENT);
    enumMap.put(FieldKey.INVOLVEDPEOPLE, AsfFieldKey.INVOLVED_PERSON);
    enumMap.put(FieldKey.IPI, AsfFieldKey.IPI);
    enumMap.put(FieldKey.ISRC, AsfFieldKey.ISRC);
    enumMap.put(FieldKey.ISWC, AsfFieldKey.ISWC);
    enumMap.put(FieldKey.IS_CLASSICAL, AsfFieldKey.IS_CLASSICAL);
    enumMap.put(FieldKey.IS_COMPILATION, AsfFieldKey.IS_COMPILATION);
    enumMap.put(FieldKey.IS_GREATEST_HITS, AsfFieldKey.IS_GREATEST_HITS);
    enumMap.put(FieldKey.IS_HD, AsfFieldKey.IS_HD);
    enumMap.put(FieldKey.IS_LIVE, AsfFieldKey.IS_LIVE);
    enumMap.put(FieldKey.IS_SOUNDTRACK, AsfFieldKey.IS_SOUNDTRACK);
    enumMap.put(FieldKey.JAIKOZ_ID, AsfFieldKey.JAIKOZ_ID);
    enumMap.put(FieldKey.KEY, AsfFieldKey.INITIAL_KEY);
    enumMap.put(FieldKey.LANGUAGE, AsfFieldKey.LANGUAGE);
    enumMap.put(FieldKey.LYRICIST, AsfFieldKey.LYRICIST);
    enumMap.put(FieldKey.LYRICIST_SORT, AsfFieldKey.LYRICIST_SORT);
    enumMap.put(FieldKey.UNSYNC_LYRICS, AsfFieldKey.LYRICS_UNSYNC);
    enumMap.put(FieldKey.MEDIA, AsfFieldKey.MEDIA);
    enumMap.put(FieldKey.MIXER, AsfFieldKey.MIXER);
    enumMap.put(FieldKey.MIXER_SORT, AsfFieldKey.MIXER_SORT);
    enumMap.put(FieldKey.MOOD, AsfFieldKey.MOOD);
    enumMap.put(FieldKey.MOOD_ACOUSTIC, AsfFieldKey.MOOD_ACOUSTIC);
    enumMap.put(FieldKey.MOOD_AGGRESSIVE, AsfFieldKey.MOOD_AGGRESSIVE);
    enumMap.put(FieldKey.MOOD_AROUSAL, AsfFieldKey.MOOD_AROUSAL);
    enumMap.put(FieldKey.MOOD_DANCEABILITY, AsfFieldKey.MOOD_DANCEABILITY);
    enumMap.put(FieldKey.MOOD_HAPPY, AsfFieldKey.MOOD_HAPPY);
    enumMap.put(FieldKey.MOOD_INSTRUMENTAL, AsfFieldKey.MOOD_INSTRUMENTAL);
    enumMap.put(FieldKey.MOOD_PARTY, AsfFieldKey.MOOD_PARTY);
    enumMap.put(FieldKey.MOOD_RELAXED, AsfFieldKey.MOOD_RELAXED);
    enumMap.put(FieldKey.MOOD_SAD, AsfFieldKey.MOOD_SAD);
    enumMap.put(FieldKey.MOOD_VALENCE, AsfFieldKey.MOOD_VALENCE);
    enumMap.put(FieldKey.MOVEMENT, AsfFieldKey.MOVEMENT);
    enumMap.put(FieldKey.MOVEMENT_NO, AsfFieldKey.MOVEMENT_NO);
    enumMap.put(FieldKey.MOVEMENT_TOTAL, AsfFieldKey.MOVEMENT_TOTAL);
    enumMap.put(FieldKey.MUSICBRAINZ_ARTISTID, AsfFieldKey.MUSICBRAINZ_ARTISTID);
    enumMap.put(FieldKey.MUSICBRAINZ_DISC_ID, AsfFieldKey.MUSICBRAINZ_DISC_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_ORIGINAL_RELEASE_ID, AsfFieldKey.MUSICBRAINZ_ORIGINAL_RELEASEID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASEARTISTID, AsfFieldKey.MUSICBRAINZ_RELEASEARTISTID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASEID, AsfFieldKey.MUSICBRAINZ_RELEASEID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY, AsfFieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID, AsfFieldKey.MUSICBRAINZ_RELEASEGROUPID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_STATUS, AsfFieldKey.MUSICBRAINZ_RELEASE_STATUS);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID, AsfFieldKey.MUSICBRAINZ_RELEASETRACKID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_TYPE, AsfFieldKey.MUSICBRAINZ_RELEASE_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_TRACK_ID, AsfFieldKey.MUSICBRAINZ_TRACK_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK, AsfFieldKey.MUSICBRAINZ_WORK);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_ID, AsfFieldKey.MUSICBRAINZ_WORKID);
    enumMap.put(FieldKey.MUSICBRAINZ_RECORDING_WORK, AsfFieldKey.MUSICBRAINZ_RECORDING_WORK);
    enumMap.put(FieldKey.MUSICBRAINZ_RECORDING_WORK_ID, AsfFieldKey.MUSICBRAINZ_RECORDING_WORK_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, AsfFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE);
    enumMap.put(FieldKey.MUSICIP_ID, AsfFieldKey.MUSICIP_ID);
    enumMap.put(FieldKey.OCCASION, AsfFieldKey.OCCASION);
    enumMap.put(FieldKey.OPUS, AsfFieldKey.OPUS);
    enumMap.put(FieldKey.ORCHESTRA, AsfFieldKey.ORCHESTRA);
    enumMap.put(FieldKey.ORCHESTRA_SORT, AsfFieldKey.ORCHESTRA_SORT);
    enumMap.put(FieldKey.ORIGINAL_ALBUM, AsfFieldKey.ORIGINAL_ALBUM);
    enumMap.put(FieldKey.ORIGINAL_ARTIST, AsfFieldKey.ORIGINAL_ARTIST);
    enumMap.put(FieldKey.ORIGINAL_LYRICIST, AsfFieldKey.ORIGINAL_LYRICIST);
    enumMap.put(FieldKey.ORIGINAL_YEAR, AsfFieldKey.ORIGINAL_YEAR);
    enumMap.put(FieldKey.ORIGINALRELEASEDATE, AsfFieldKey.ORIGINALRELEASEDATE);
    enumMap.put(FieldKey.OVERALL_WORK, AsfFieldKey.OVERALL_WORK);
    enumMap.put(FieldKey.PART, AsfFieldKey.PART);
    enumMap.put(FieldKey.PART_NUMBER, AsfFieldKey.PART_NUMBER);
    enumMap.put(FieldKey.PART_TYPE, AsfFieldKey.PART_TYPE);
    enumMap.put(FieldKey.PERFORMER, AsfFieldKey.PERFORMER);
    enumMap.put(FieldKey.PERFORMER_NAME, AsfFieldKey.PERFORMER_NAME);
    enumMap.put(FieldKey.PERFORMER_NAME_SORT, AsfFieldKey.PERFORMER_NAME_SORT);
    enumMap.put(FieldKey.PERIOD, AsfFieldKey.PERIOD);
    enumMap.put(FieldKey.PRODUCER, AsfFieldKey.PRODUCER);
    enumMap.put(FieldKey.PRODUCER_SORT, AsfFieldKey.PRODUCER_SORT);
    enumMap.put(FieldKey.QUALITY, AsfFieldKey.QUALITY);
    enumMap.put(FieldKey.RANKING, AsfFieldKey.RANKING);
    enumMap.put(FieldKey.RATING, AsfFieldKey.USER_RATING);
    enumMap.put(FieldKey.RECORD_LABEL, AsfFieldKey.RECORD_LABEL);
    enumMap.put(FieldKey.RECORDINGDATE, AsfFieldKey.RECORDINGDATE);
    enumMap.put(FieldKey.RECORDINGSTARTDATE, AsfFieldKey.RECORDINGSTARTDATE);
    enumMap.put(FieldKey.RECORDINGENDDATE, AsfFieldKey.RECORDINGENDDATE);
    enumMap.put(FieldKey.RECORDINGLOCATION, AsfFieldKey.RECORDINGLOCATION);
    enumMap.put(FieldKey.REMIXER, AsfFieldKey.REMIXER);
    enumMap.put(FieldKey.ROONALBUMTAG, AsfFieldKey.ROONALBUMTAG);
    enumMap.put(FieldKey.ROONTRACKTAG, AsfFieldKey.ROONTRACKTAG);
    enumMap.put(FieldKey.SCRIPT, AsfFieldKey.SCRIPT);
    enumMap.put(FieldKey.SECTION, AsfFieldKey.SECTION);
    enumMap.put(FieldKey.SINGLE_DISC_TRACK_NO, AsfFieldKey.SINGLE_DISC_TRACK_NO);
    enumMap.put(FieldKey.SONGKONG_ID, AsfFieldKey.SONGKONG_ID);
    enumMap.put(FieldKey.SUBTITLE, AsfFieldKey.SUBTITLE);
    enumMap.put(FieldKey.TAGS, AsfFieldKey.TAGS);
    enumMap.put(FieldKey.TEMPO, AsfFieldKey.TEMPO);
    enumMap.put(FieldKey.TIMBRE, AsfFieldKey.TIMBRE);
    FieldKey fieldKey5 = FieldKey.TITLE;
    AsfFieldKey asfFieldKey5 = AsfFieldKey.TITLE;
    enumMap.put(fieldKey5, asfFieldKey5);
    enumMap.put(FieldKey.TITLE_MOVEMENT, AsfFieldKey.TITLE_MOVEMENT);
    enumMap.put(FieldKey.TITLE_SORT, AsfFieldKey.TITLE_SORT);
    enumMap.put(FieldKey.TONALITY, AsfFieldKey.TONALITY);
    FieldKey fieldKey6 = FieldKey.TRACK;
    AsfFieldKey asfFieldKey6 = AsfFieldKey.TRACK;
    enumMap.put(fieldKey6, asfFieldKey6);
    enumMap.put(FieldKey.TRACK_TOTAL, AsfFieldKey.TRACK_TOTAL);
    enumMap.put(FieldKey.URL_DISCOGS_ARTIST_SITE, AsfFieldKey.URL_DISCOGS_ARTIST_SITE);
    enumMap.put(FieldKey.URL_DISCOGS_RELEASE_SITE, AsfFieldKey.URL_DISCOGS_RELEASE_SITE);
    enumMap.put(FieldKey.URL_LYRICS_SITE, AsfFieldKey.URL_LYRICS_SITE);
    enumMap.put(FieldKey.URL_OFFICIAL_ARTIST_SITE, AsfFieldKey.URL_OFFICIAL_ARTIST_SITE);
    enumMap.put(FieldKey.URL_OFFICIAL_RELEASE_SITE, AsfFieldKey.URL_OFFICIAL_RELEASE_SITE);
    enumMap.put(FieldKey.URL_WIKIPEDIA_ARTIST_SITE, AsfFieldKey.URL_WIKIPEDIA_ARTIST_SITE);
    enumMap.put(FieldKey.URL_WIKIPEDIA_RELEASE_SITE, AsfFieldKey.URL_WIKIPEDIA_RELEASE_SITE);
    enumMap.put(FieldKey.VERSION, AsfFieldKey.VERSION);
    enumMap.put(FieldKey.WORK, AsfFieldKey.WORK);
    enumMap.put(FieldKey.WORK_TYPE, AsfFieldKey.WORK_TYPE);
    FieldKey fieldKey7 = FieldKey.YEAR;
    AsfFieldKey asfFieldKey7 = AsfFieldKey.YEAR;
    enumMap.put(fieldKey7, asfFieldKey7);
    HashSet<AsfFieldKey> hashSet = new HashSet();
    COMMON_FIELDS = hashSet;
    hashSet.add(asfFieldKey1);
    hashSet.add(asfFieldKey2);
    hashSet.add(asfFieldKey3);
    hashSet.add(asfFieldKey4);
    hashSet.add(asfFieldKey5);
    hashSet.add(asfFieldKey6);
    hashSet.add(asfFieldKey7);
  }
  
  public AsfTag() {
    this(false);
  }
  
  public AsfTag(Tag paramTag, boolean paramBoolean) {
    this(paramBoolean);
    copyFrom(paramTag);
  }
  
  public AsfTag(boolean paramBoolean) {
    this.copyFields = paramBoolean;
  }
  
  private TagField copyFrom(TagField paramTagField) {
    if (isCopyingFields()) {
      if (paramTagField instanceof AsfTagField)
        try {
          return (TagField)((AsfTagField)paramTagField).clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
          return new AsfTagField(((AsfTagField)paramTagField).getDescriptor());
        }  
      if (paramTagField instanceof TagTextField) {
        String str = ((TagTextField)paramTagField).getContent();
        return new AsfTagTextField(paramTagField.getId(), str);
      } 
      l0.h("Unknown Asf Tag Field class:", paramTagField.getClass());
      return null;
    } 
    return paramTagField;
  }
  
  private void copyFrom(Tag paramTag) {
    Iterator<TagField> iterator = paramTag.getFields();
    while (iterator.hasNext()) {
      TagField tagField = copyFrom(iterator.next());
      if (tagField != null)
        super.addField(tagField); 
    } 
  }
  
  private boolean isValidField(TagField paramTagField) {
    return (paramTagField == null) ? false : (!(paramTagField instanceof AsfTagField) ? false : (paramTagField.isEmpty() ^ true));
  }
  
  public void addCopyright(String paramString) {
    addField(createCopyrightField(paramString));
  }
  
  public void addField(TagField paramTagField) {
    if (isValidField(paramTagField)) {
      if (AsfFieldKey.isMultiValued(paramTagField.getId())) {
        super.addField(copyFrom(paramTagField));
        return;
      } 
      super.setField(copyFrom(paramTagField));
    } 
  }
  
  public void addRating(String paramString) {
    addField(createRatingField(paramString));
  }
  
  public AsfTagCoverField createArtworkField(byte[] paramArrayOfbyte) {
    return new AsfTagCoverField(paramArrayOfbyte, PictureTypes.DEFAULT_ID.intValue(), null, null);
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public AsfTagTextField createCopyrightField(String paramString) {
    return new AsfTagTextField(AsfFieldKey.COPYRIGHT, paramString);
  }
  
  public AsfTagCoverField createField(Artwork paramArtwork) {
    return new AsfTagCoverField(paramArtwork.getBinaryData(), paramArtwork.getPictureType(), paramArtwork.getDescription(), paramArtwork.getMimeType());
  }
  
  public AsfTagTextField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramVarArgs != null && paramVarArgs[0] != null) {
      if (paramFieldKey != null) {
        AsfFieldKey asfFieldKey = tagFieldToAsfField.get(paramFieldKey);
        if (asfFieldKey != null)
          return createField(asfFieldKey, paramVarArgs[0]); 
        throw new KeyNotFoundException(paramFieldKey.toString());
      } 
      l0.l("Argument cannot be null");
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public AsfTagTextField createField(AsfFieldKey paramAsfFieldKey, String paramString) {
    if (paramString != null) {
      if (paramAsfFieldKey != null) {
        int i = null.$SwitchMap$org$jaudiotagger$tag$asf$AsfFieldKey[paramAsfFieldKey.ordinal()];
        if (i != 1) {
          if (i != 2)
            return new AsfTagTextField(paramAsfFieldKey.getFieldName(), paramString); 
          tp.j("Banner Image cannot be created using this method");
          return null;
        } 
        tp.j("Cover Art cannot be created using this method");
        return null;
      } 
      l0.l("Argument cannot be null");
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public AsfTagTextField createRatingField(String paramString) {
    return new AsfTagTextField(AsfFieldKey.RATING, paramString);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      deleteField(((AsfFieldKey)tagFieldToAsfField.get(paramFieldKey)).getFieldName());
      return;
    } 
    l0.d();
  }
  
  public void deleteField(AsfFieldKey paramAsfFieldKey) {
    deleteField(paramAsfFieldKey.getFieldName());
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    AsfFieldKey asfFieldKey = tagFieldToAsfField.get(paramFieldKey);
    if (asfFieldKey != null)
      return getAll(asfFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public List<Artwork> getArtworkList() {
    List<TagField> list = getFields(FieldKey.COVER_ART);
    ArrayList<Artwork> arrayList = new ArrayList(list.size());
    for (AsfTagCoverField asfTagCoverField : list) {
      Artwork artwork = ArtworkFactory.getNew();
      artwork.setBinaryData(asfTagCoverField.getRawImageData());
      artwork.setMimeType(asfTagCoverField.getMimeType());
      artwork.setDescription(asfTagCoverField.getDescription());
      artwork.setPictureType(asfTagCoverField.getPictureType());
      arrayList.add(artwork);
    } 
    return arrayList;
  }
  
  public Iterator<AsfTagField> getAsfFields() {
    if (isCopyingFields())
      return new AsfFieldIterator(getFields()); 
    tp.f("Since the field conversion is not enabled, this method cannot be executed");
    return null;
  }
  
  public List<TagField> getCopyright() {
    return getFields(AsfFieldKey.COPYRIGHT.getFieldName());
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      AsfFieldKey asfFieldKey = tagFieldToAsfField.get(paramFieldKey);
      if (asfFieldKey != null)
        return getFields(asfFieldKey.getFieldName()); 
      l0.d();
      return null;
    } 
    l0.d();
    return null;
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    try {
      return getValue(paramFieldKey, 0);
    } finally {
      paramFieldKey = null;
    } 
  }
  
  public String getFirst(AsfFieldKey paramAsfFieldKey) {
    if (paramAsfFieldKey != null)
      return getFirst(paramAsfFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public String getFirstCopyright() {
    return getFirst(AsfFieldKey.COPYRIGHT.getFieldName());
  }
  
  public AsfTagField getFirstField(FieldKey paramFieldKey) {
    if (paramFieldKey != null)
      return (AsfTagField)getFirstField(((AsfFieldKey)tagFieldToAsfField.get(paramFieldKey)).getFieldName()); 
    l0.d();
    return null;
  }
  
  public String getFirstRating() {
    return getFirst(AsfFieldKey.RATING.getFieldName());
  }
  
  public List<TagField> getRating() {
    return getFields(AsfFieldKey.RATING.getFieldName());
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (paramFieldKey != null)
      return getItem(((AsfFieldKey)tagFieldToAsfField.get(paramFieldKey)).getFieldName(), paramInt); 
    l0.d();
    return null;
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return (getFields(((AsfFieldKey)tagFieldToAsfField.get(paramFieldKey)).getFieldName()).size() != 0);
  }
  
  public boolean hasField(AsfFieldKey paramAsfFieldKey) {
    return (getFields(paramAsfFieldKey.getFieldName()).size() != 0);
  }
  
  public boolean isAllowedEncoding(Charset paramCharset) {
    return AsfHeader.ASF_CHARSET.name().equals(paramCharset);
  }
  
  public boolean isCopyingFields() {
    return this.copyFields;
  }
  
  public void setCopyright(String paramString) {
    setField(createCopyrightField(paramString));
  }
  
  public void setField(TagField paramTagField) {
    if (isValidField(paramTagField))
      super.setField(copyFrom(paramTagField)); 
  }
  
  public void setRating(String paramString) {
    setField(createRatingField(paramString));
  }
  
  public static class AsfFieldIterator implements Iterator<AsfTagField> {
    static final boolean $assertionsDisabled = false;
    
    private final Iterator<TagField> fieldIterator;
    
    public AsfFieldIterator(Iterator<TagField> param1Iterator) {
      this.fieldIterator = param1Iterator;
    }
    
    public boolean hasNext() {
      return this.fieldIterator.hasNext();
    }
    
    public AsfTagField next() {
      return (AsfTagField)this.fieldIterator.next();
    }
    
    public void remove() {
      this.fieldIterator.remove();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */