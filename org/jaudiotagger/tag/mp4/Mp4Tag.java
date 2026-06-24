package org.jaudiotagger.tag.mp4;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import l0;
import mk;
import org.jaudiotagger.audio.generic.AbstractTag;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.mp4.field.Mp4DiscNoField;
import org.jaudiotagger.tag.mp4.field.Mp4GenreField;
import org.jaudiotagger.tag.mp4.field.Mp4TagByteField;
import org.jaudiotagger.tag.mp4.field.Mp4TagCoverField;
import org.jaudiotagger.tag.mp4.field.Mp4TagReverseDnsField;
import org.jaudiotagger.tag.mp4.field.Mp4TagTextField;
import org.jaudiotagger.tag.mp4.field.Mp4TagTextNumberField;
import org.jaudiotagger.tag.mp4.field.Mp4TrackField;
import tp;

public class Mp4Tag extends AbstractTag {
  private static final EnumMap<FieldKey, Mp4FieldKey> tagFieldToMp4Field;
  
  static {
    EnumMap<FieldKey, Object> enumMap = new EnumMap<FieldKey, Object>(FieldKey.class);
    tagFieldToMp4Field = (EnumMap)enumMap;
    enumMap.put(FieldKey.ACOUSTID_FINGERPRINT, Mp4FieldKey.ACOUSTID_FINGERPRINT);
    enumMap.put(FieldKey.ACOUSTID_ID, Mp4FieldKey.ACOUSTID_ID);
    enumMap.put(FieldKey.ALBUM, Mp4FieldKey.ALBUM);
    enumMap.put(FieldKey.ALBUM_ARTIST, Mp4FieldKey.ALBUM_ARTIST);
    enumMap.put(FieldKey.ALBUM_ARTIST_SORT, Mp4FieldKey.ALBUM_ARTIST_SORT);
    enumMap.put(FieldKey.ALBUM_ARTISTS, Mp4FieldKey.ALBUM_ARTISTS);
    enumMap.put(FieldKey.ALBUM_ARTISTS_SORT, Mp4FieldKey.ALBUM_ARTISTS_SORT);
    enumMap.put(FieldKey.ALBUM_SORT, Mp4FieldKey.ALBUM_SORT);
    enumMap.put(FieldKey.ALBUM_YEAR, Mp4FieldKey.ALBUM_YEAR);
    enumMap.put(FieldKey.AMAZON_ID, Mp4FieldKey.ASIN);
    enumMap.put(FieldKey.ARRANGER, Mp4FieldKey.ARRANGER);
    enumMap.put(FieldKey.ARRANGER_SORT, Mp4FieldKey.ARRANGER_SORT);
    enumMap.put(FieldKey.ARTIST, Mp4FieldKey.ARTIST);
    enumMap.put(FieldKey.ARTISTS, Mp4FieldKey.ARTISTS);
    enumMap.put(FieldKey.ARTIST_SORT, Mp4FieldKey.ARTIST_SORT);
    enumMap.put(FieldKey.ARTISTS_SORT, Mp4FieldKey.ARTISTS_SORT);
    enumMap.put(FieldKey.BARCODE, Mp4FieldKey.BARCODE);
    enumMap.put(FieldKey.BPM, Mp4FieldKey.BPM);
    enumMap.put(FieldKey.CATALOG_NO, Mp4FieldKey.CATALOGNO);
    enumMap.put(FieldKey.CHOIR, Mp4FieldKey.CHOIR);
    enumMap.put(FieldKey.CHOIR_SORT, Mp4FieldKey.CHOIR_SORT);
    enumMap.put(FieldKey.CLASSICAL_CATALOG, Mp4FieldKey.CLASSICAL_CATALOG);
    enumMap.put(FieldKey.CLASSICAL_NICKNAME, Mp4FieldKey.CLASSICAL_NICKNAME);
    enumMap.put(FieldKey.COMMENT, Mp4FieldKey.COMMENT);
    enumMap.put(FieldKey.COMPOSER, Mp4FieldKey.COMPOSER);
    enumMap.put(FieldKey.COMPOSER_SORT, Mp4FieldKey.COMPOSER_SORT);
    enumMap.put(FieldKey.CONDUCTOR, Mp4FieldKey.CONDUCTOR);
    enumMap.put(FieldKey.COUNTRY, Mp4FieldKey.COUNTRY);
    enumMap.put(FieldKey.CONDUCTOR_SORT, Mp4FieldKey.CONDUCTOR_SORT);
    enumMap.put(FieldKey.COPYRIGHT, Mp4FieldKey.COPYRIGHT);
    enumMap.put(FieldKey.COVER_ART, Mp4FieldKey.ARTWORK);
    enumMap.put(FieldKey.CUSTOM1, Mp4FieldKey.MM_CUSTOM_1);
    enumMap.put(FieldKey.CUSTOM2, Mp4FieldKey.MM_CUSTOM_2);
    enumMap.put(FieldKey.CUSTOM3, Mp4FieldKey.MM_CUSTOM_3);
    enumMap.put(FieldKey.CUSTOM4, Mp4FieldKey.MM_CUSTOM_4);
    enumMap.put(FieldKey.CUSTOM5, Mp4FieldKey.MM_CUSTOM_5);
    FieldKey fieldKey = FieldKey.DISC_NO;
    Mp4FieldKey mp4FieldKey = Mp4FieldKey.DISCNUMBER;
    enumMap.put(fieldKey, mp4FieldKey);
    enumMap.put(FieldKey.DISC_SUBTITLE, Mp4FieldKey.DISC_SUBTITLE);
    enumMap.put(FieldKey.DISC_TOTAL, mp4FieldKey);
    enumMap.put(FieldKey.DJMIXER, Mp4FieldKey.DJMIXER);
    enumMap.put(FieldKey.DJMIXER_SORT, Mp4FieldKey.DJMIXER_SORT);
    enumMap.put(FieldKey.MOOD_ELECTRONIC, Mp4FieldKey.MOOD_ELECTRONIC);
    enumMap.put(FieldKey.ENCODER, Mp4FieldKey.ENCODER);
    enumMap.put(FieldKey.ENGINEER, Mp4FieldKey.ENGINEER);
    enumMap.put(FieldKey.ENGINEER_SORT, Mp4FieldKey.ENGINEER_SORT);
    enumMap.put(FieldKey.ENSEMBLE, Mp4FieldKey.ENSEMBLE);
    enumMap.put(FieldKey.ENSEMBLE_SORT, Mp4FieldKey.ENSEMBLE_SORT);
    enumMap.put(FieldKey.FBPM, Mp4FieldKey.FBPM);
    enumMap.put(FieldKey.GENRE, Mp4FieldKey.GENRE);
    enumMap.put(FieldKey.GROUP, Mp4FieldKey.GROUP);
    enumMap.put(FieldKey.GROUPING, Mp4FieldKey.GROUPING);
    enumMap.put(FieldKey.INSTRUMENT, Mp4FieldKey.INSTRUMENT);
    enumMap.put(FieldKey.INVOLVEDPEOPLE, Mp4FieldKey.INVOLVEDPEOPLE);
    enumMap.put(FieldKey.IPI, Mp4FieldKey.IPI);
    enumMap.put(FieldKey.ISRC, Mp4FieldKey.ISRC);
    enumMap.put(FieldKey.ISWC, Mp4FieldKey.ISWC);
    enumMap.put(FieldKey.IS_COMPILATION, Mp4FieldKey.COMPILATION);
    enumMap.put(FieldKey.IS_CLASSICAL, Mp4FieldKey.IS_CLASSICAL);
    enumMap.put(FieldKey.IS_GREATEST_HITS, Mp4FieldKey.IS_GREATEST_HITS);
    enumMap.put(FieldKey.IS_HD, Mp4FieldKey.IS_HD);
    enumMap.put(FieldKey.IS_LIVE, Mp4FieldKey.IS_LIVE);
    enumMap.put(FieldKey.IS_SOUNDTRACK, Mp4FieldKey.IS_SOUNDTRACK);
    enumMap.put(FieldKey.JAIKOZ_ID, Mp4FieldKey.JAIKOZ_ID);
    enumMap.put(FieldKey.KEY, Mp4FieldKey.KEY);
    enumMap.put(FieldKey.LANGUAGE, Mp4FieldKey.LANGUAGE);
    enumMap.put(FieldKey.LYRICIST, Mp4FieldKey.LYRICIST);
    enumMap.put(FieldKey.LYRICIST_SORT, Mp4FieldKey.LYRICIST_SORT);
    enumMap.put(FieldKey.UNSYNC_LYRICS, Mp4FieldKey.LYRICS);
    enumMap.put(FieldKey.MEDIA, Mp4FieldKey.MEDIA);
    enumMap.put(FieldKey.MIXER, Mp4FieldKey.MIXER);
    enumMap.put(FieldKey.MIXER_SORT, Mp4FieldKey.MIXER_SORT);
    enumMap.put(FieldKey.MOOD, Mp4FieldKey.MOOD);
    enumMap.put(FieldKey.MOOD_ACOUSTIC, Mp4FieldKey.MOOD_ACOUSTIC);
    enumMap.put(FieldKey.MOOD_AGGRESSIVE, Mp4FieldKey.MOOD_AGGRESSIVE);
    enumMap.put(FieldKey.MOOD_AROUSAL, Mp4FieldKey.MOOD_AROUSAL);
    enumMap.put(FieldKey.MOOD_DANCEABILITY, Mp4FieldKey.MOOD_DANCEABILITY);
    enumMap.put(FieldKey.MOOD_HAPPY, Mp4FieldKey.MOOD_HAPPY);
    enumMap.put(FieldKey.MOOD_INSTRUMENTAL, Mp4FieldKey.MOOD_INSTRUMENTAL);
    enumMap.put(FieldKey.MOOD_PARTY, Mp4FieldKey.MOOD_PARTY);
    enumMap.put(FieldKey.MOOD_RELAXED, Mp4FieldKey.MOOD_RELAXED);
    enumMap.put(FieldKey.MOOD_SAD, Mp4FieldKey.MOOD_SAD);
    enumMap.put(FieldKey.MOOD_VALENCE, Mp4FieldKey.MOOD_VALENCE);
    enumMap.put(FieldKey.MOVEMENT, Mp4FieldKey.MOVEMENT);
    enumMap.put(FieldKey.MOVEMENT_NO, Mp4FieldKey.MOVEMENT_NO);
    enumMap.put(FieldKey.MOVEMENT_TOTAL, Mp4FieldKey.MOVEMENT_TOTAL);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK, Mp4FieldKey.MUSICBRAINZ_WORK);
    enumMap.put(FieldKey.MUSICBRAINZ_ARTISTID, Mp4FieldKey.MUSICBRAINZ_ARTISTID);
    enumMap.put(FieldKey.MUSICBRAINZ_DISC_ID, Mp4FieldKey.MUSICBRAINZ_DISCID);
    enumMap.put(FieldKey.MUSICBRAINZ_ORIGINAL_RELEASE_ID, Mp4FieldKey.MUSICBRAINZ_ORIGINALALBUMID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASEARTISTID, Mp4FieldKey.MUSICBRAINZ_ALBUMARTISTID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASEID, Mp4FieldKey.MUSICBRAINZ_ALBUMID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY, Mp4FieldKey.RELEASECOUNTRY);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID, Mp4FieldKey.MUSICBRAINZ_RELEASE_GROUPID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_STATUS, Mp4FieldKey.MUSICBRAINZ_ALBUM_STATUS);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID, Mp4FieldKey.MUSICBRAINZ_RELEASE_TRACKID);
    enumMap.put(FieldKey.MUSICBRAINZ_RELEASE_TYPE, Mp4FieldKey.MUSICBRAINZ_ALBUM_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_TRACK_ID, Mp4FieldKey.MUSICBRAINZ_TRACKID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_ID, Mp4FieldKey.MUSICBRAINZ_WORKID);
    enumMap.put(FieldKey.MUSICBRAINZ_RECORDING_WORK_ID, Mp4FieldKey.MUSICBRAINZ_RECORDING_WORK_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_RECORDING_WORK, Mp4FieldKey.MUSICBRAINZ_RECORDING_WORK);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6);
    enumMap.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, Mp4FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE);
    enumMap.put(FieldKey.MUSICIP_ID, Mp4FieldKey.MUSICIP_PUID);
    enumMap.put(FieldKey.OCCASION, Mp4FieldKey.MM_OCCASION);
    enumMap.put(FieldKey.OPUS, Mp4FieldKey.OPUS);
    enumMap.put(FieldKey.ORCHESTRA, Mp4FieldKey.ORCHESTRA);
    enumMap.put(FieldKey.ORCHESTRA_SORT, Mp4FieldKey.ORCHESTRA_SORT);
    enumMap.put(FieldKey.ORIGINAL_ALBUM, Mp4FieldKey.MM_ORIGINAL_ALBUM_TITLE);
    enumMap.put(FieldKey.ORIGINALRELEASEDATE, Mp4FieldKey.ORIGINALRELEASEDATE);
    enumMap.put(FieldKey.ORIGINAL_ARTIST, Mp4FieldKey.MM_ORIGINAL_ARTIST);
    enumMap.put(FieldKey.ORIGINAL_LYRICIST, Mp4FieldKey.MM_ORIGINAL_LYRICIST);
    enumMap.put(FieldKey.ORIGINAL_YEAR, Mp4FieldKey.MM_ORIGINAL_YEAR);
    enumMap.put(FieldKey.OVERALL_WORK, Mp4FieldKey.OVERALL_WORK);
    enumMap.put(FieldKey.PART, Mp4FieldKey.PART);
    enumMap.put(FieldKey.PART_NUMBER, Mp4FieldKey.PART_NUMBER);
    enumMap.put(FieldKey.PART_TYPE, Mp4FieldKey.PART_TYPE);
    enumMap.put(FieldKey.PERFORMER, Mp4FieldKey.PERFORMER);
    enumMap.put(FieldKey.PERFORMER_NAME, Mp4FieldKey.PERFORMER_NAME);
    enumMap.put(FieldKey.PERFORMER_NAME_SORT, Mp4FieldKey.PERFORMER_NAME_SORT);
    enumMap.put(FieldKey.PERIOD, Mp4FieldKey.PERIOD);
    enumMap.put(FieldKey.PRODUCER, Mp4FieldKey.PRODUCER);
    enumMap.put(FieldKey.PRODUCER_SORT, Mp4FieldKey.PRODUCER_SORT);
    enumMap.put(FieldKey.QUALITY, Mp4FieldKey.MM_QUALITY);
    enumMap.put(FieldKey.RANKING, Mp4FieldKey.RANKING);
    enumMap.put(FieldKey.RATING, Mp4FieldKey.SCORE);
    enumMap.put(FieldKey.RECORD_LABEL, Mp4FieldKey.LABEL);
    enumMap.put(FieldKey.RECORDINGDATE, Mp4FieldKey.RECORDINGDATE);
    enumMap.put(FieldKey.RECORDINGSTARTDATE, Mp4FieldKey.RECORDINGSTARTDATE);
    enumMap.put(FieldKey.RECORDINGENDDATE, Mp4FieldKey.RECORDINGENDDATE);
    enumMap.put(FieldKey.RECORDINGLOCATION, Mp4FieldKey.RECORDINGLOCATION);
    enumMap.put(FieldKey.REMIXER, Mp4FieldKey.REMIXER);
    enumMap.put(FieldKey.ROONALBUMTAG, Mp4FieldKey.ROONALBUMTAG);
    enumMap.put(FieldKey.ROONTRACKTAG, Mp4FieldKey.ROONTRACKTAG);
    enumMap.put(FieldKey.SCRIPT, Mp4FieldKey.SCRIPT);
    enumMap.put(FieldKey.SECTION, Mp4FieldKey.SECTION);
    enumMap.put(FieldKey.SINGLE_DISC_TRACK_NO, Mp4FieldKey.SINGLE_DISC_TRACK_NO);
    enumMap.put(FieldKey.SONGKONG_ID, Mp4FieldKey.SONGKONG_ID);
    enumMap.put(FieldKey.SUBTITLE, Mp4FieldKey.SUBTITLE);
    enumMap.put(FieldKey.TAGS, Mp4FieldKey.TAGS);
    enumMap.put(FieldKey.TEMPO, Mp4FieldKey.TEMPO);
    enumMap.put(FieldKey.TIMBRE, Mp4FieldKey.TIMBRE);
    enumMap.put(FieldKey.TITLE, Mp4FieldKey.TITLE);
    enumMap.put(FieldKey.TITLE_MOVEMENT, Mp4FieldKey.TITLE_MOVEMENT);
    enumMap.put(FieldKey.TITLE_SORT, Mp4FieldKey.TITLE_SORT);
    enumMap.put(FieldKey.TONALITY, Mp4FieldKey.TONALITY);
    fieldKey = FieldKey.TRACK;
    mp4FieldKey = Mp4FieldKey.TRACK;
    enumMap.put(fieldKey, mp4FieldKey);
    enumMap.put(FieldKey.TRACK_TOTAL, mp4FieldKey);
    enumMap.put(FieldKey.URL_DISCOGS_ARTIST_SITE, Mp4FieldKey.URL_DISCOGS_ARTIST_SITE);
    enumMap.put(FieldKey.URL_DISCOGS_RELEASE_SITE, Mp4FieldKey.URL_DISCOGS_RELEASE_SITE);
    enumMap.put(FieldKey.URL_LYRICS_SITE, Mp4FieldKey.URL_LYRICS_SITE);
    enumMap.put(FieldKey.URL_OFFICIAL_ARTIST_SITE, Mp4FieldKey.URL_OFFICIAL_ARTIST_SITE);
    enumMap.put(FieldKey.URL_OFFICIAL_RELEASE_SITE, Mp4FieldKey.URL_OFFICIAL_RELEASE_SITE);
    enumMap.put(FieldKey.URL_WIKIPEDIA_ARTIST_SITE, Mp4FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
    enumMap.put(FieldKey.URL_WIKIPEDIA_RELEASE_SITE, Mp4FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
    enumMap.put(FieldKey.VERSION, Mp4FieldKey.VERSION);
    enumMap.put(FieldKey.WORK, Mp4FieldKey.WORK);
    enumMap.put(FieldKey.YEAR, Mp4FieldKey.DAY);
    enumMap.put(FieldKey.WORK_TYPE, Mp4FieldKey.WORK_TYPE);
  }
  
  public static EnumMap<FieldKey, Mp4FieldKey> getMapping() {
    return tagFieldToMp4Field;
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey == FieldKey.TRACK || paramFieldKey == FieldKey.TRACK_TOTAL || paramFieldKey == FieldKey.DISC_NO || paramFieldKey == FieldKey.DISC_TOTAL) {
      setField(paramFieldKey, paramVarArgs);
      return;
    } 
    addField(createField(paramFieldKey, paramVarArgs));
  }
  
  public TagField createArtworkField(byte[] paramArrayOfbyte) {
    return (TagField)new Mp4TagCoverField(paramArrayOfbyte);
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    if (paramBoolean) {
      String str1 = Mp4TagByteField.TRUE_VALUE;
      Mp4FieldKey mp4FieldKey1 = Mp4FieldKey.COMPILATION;
      return (TagField)new Mp4TagByteField(mp4FieldKey1, str1, mp4FieldKey1.getFieldLength());
    } 
    String str = Mp4TagByteField.FALSE_VALUE;
    Mp4FieldKey mp4FieldKey = Mp4FieldKey.COMPILATION;
    return (TagField)new Mp4TagByteField(mp4FieldKey, str, mp4FieldKey.getFieldLength());
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramVarArgs != null) {
      if (paramFieldKey != null) {
        String str = paramVarArgs[0];
        FieldKey fieldKey = FieldKey.TRACK;
        if (paramFieldKey == fieldKey || paramFieldKey == FieldKey.TRACK_TOTAL || paramFieldKey == FieldKey.DISC_NO || paramFieldKey == FieldKey.DISC_TOTAL) {
          int i;
          try {
            i = Integer.parseInt(str);
            if (paramFieldKey == fieldKey)
              return (TagField)new Mp4TrackField(i); 
          } catch (NumberFormatException numberFormatException) {}
          return (TagField)((numberFormatException == FieldKey.TRACK_TOTAL) ? new Mp4TrackField(0, i) : ((numberFormatException == FieldKey.DISC_NO) ? new Mp4DiscNoField(i) : ((numberFormatException == FieldKey.DISC_TOTAL) ? new Mp4DiscNoField(0, i) : createField(tagFieldToMp4Field.get(numberFormatException), str))));
        } 
        return (TagField)((paramFieldKey == FieldKey.GENRE) ? (TagOptionSingleton.getInstance().isWriteMp4GenresAsText() ? new Mp4TagTextField(Mp4FieldKey.GENRE_CUSTOM.getFieldName(), str) : (Mp4GenreField.isValidGenre(str) ? new Mp4GenreField(str) : new Mp4TagTextField(Mp4FieldKey.GENRE_CUSTOM.getFieldName(), str))) : createField(tagFieldToMp4Field.get(paramFieldKey), str));
      } 
      l0.d();
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    return (TagField)new Mp4TagCoverField(paramArtwork.getBinaryData());
  }
  
  public TagField createField(Mp4FieldKey paramMp4FieldKey, String paramString) {
    if (paramString != null) {
      if (paramMp4FieldKey != null) {
        if (paramMp4FieldKey == Mp4FieldKey.COMPILATION)
          return (paramString.equalsIgnoreCase("true") || paramString.equals("1")) ? createCompilationField(true) : createCompilationField(false); 
        if (paramMp4FieldKey == Mp4FieldKey.GENRE) {
          if (Mp4GenreField.isValidGenre(paramString))
            return (TagField)new Mp4GenreField(paramString); 
          l0.l(oXrNDUqUkE.OJFsIjc);
          return null;
        } 
        Mp4FieldKey mp4FieldKey = Mp4FieldKey.GENRE_CUSTOM;
        if (paramMp4FieldKey == mp4FieldKey)
          return (TagField)new Mp4TagTextField(mp4FieldKey.getFieldName(), paramString); 
        if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.DISC_NO)
          return (TagField)new Mp4DiscNoField(paramString); 
        if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.TRACK_NO)
          return (TagField)new Mp4TrackField(paramString); 
        if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.BYTE)
          return (TagField)new Mp4TagByteField(paramMp4FieldKey, paramString, paramMp4FieldKey.getFieldLength()); 
        if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.NUMBER)
          return (TagField)new Mp4TagTextNumberField(paramMp4FieldKey.getFieldName(), paramString); 
        if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.REVERSE_DNS)
          return (TagField)new Mp4TagReverseDnsField(paramMp4FieldKey, paramString); 
        if (paramMp4FieldKey.getSubClassFieldType() != Mp4TagFieldSubType.ARTWORK) {
          if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.TEXT)
            return (TagField)new Mp4TagTextField(paramMp4FieldKey.getFieldName(), paramString); 
          if (paramMp4FieldKey.getSubClassFieldType() == Mp4TagFieldSubType.UNKNOWN) {
            tp.j(MessageFormat.format("DO not know how to create this atom type {0}", new Object[] { paramMp4FieldKey.getFieldName() }));
            return null;
          } 
          tp.j(MessageFormat.format("DO not know how to create this atom type {0}", new Object[] { paramMp4FieldKey.getFieldName() }));
          return null;
        } 
        tp.j("Cover Art cannot be created using this method");
        return null;
      } 
      l0.d();
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public TagField createGenreField(String paramString) {
    if (paramString != null)
      return (TagField)(TagOptionSingleton.getInstance().isWriteMp4GenresAsText() ? new Mp4TagTextField(Mp4FieldKey.GENRE_CUSTOM.getFieldName(), paramString) : (Mp4GenreField.isValidGenre(paramString) ? new Mp4GenreField(paramString) : new Mp4TagTextField(Mp4FieldKey.GENRE_CUSTOM.getFieldName(), paramString))); 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      String str = ((Mp4FieldKey)tagFieldToMp4Field.get(paramFieldKey)).getFieldName();
      if (paramFieldKey == FieldKey.KEY) {
        deleteField(Mp4FieldKey.KEY_OLD);
        deleteField(str);
        return;
      } 
      FieldKey fieldKey = FieldKey.TRACK;
      if (paramFieldKey == fieldKey) {
        paramFieldKey = FieldKey.TRACK_TOTAL;
        if (getFirst(paramFieldKey).length() == 0) {
          deleteField(str);
          return;
        } 
        ((Mp4TrackField)getFirstField(paramFieldKey)).setTrackNo(0);
        return;
      } 
      if (paramFieldKey == FieldKey.TRACK_TOTAL) {
        if (getFirst(fieldKey).length() == 0) {
          deleteField(str);
          return;
        } 
        ((Mp4TrackField)getFirstField(fieldKey)).setTrackTotal(0);
        return;
      } 
      fieldKey = FieldKey.DISC_NO;
      if (paramFieldKey == fieldKey) {
        paramFieldKey = FieldKey.DISC_TOTAL;
        if (getFirst(paramFieldKey).length() == 0) {
          deleteField(str);
          return;
        } 
        ((Mp4DiscNoField)getFirstField(paramFieldKey)).setDiscNo(0);
        return;
      } 
      if (paramFieldKey == FieldKey.DISC_TOTAL) {
        if (getFirst(fieldKey).length() == 0) {
          deleteField(str);
          return;
        } 
        ((Mp4DiscNoField)getFirstField(fieldKey)).setDiscTotal(0);
        return;
      } 
      if (paramFieldKey == FieldKey.GENRE) {
        deleteField(Mp4FieldKey.GENRE.getFieldName());
        deleteField(Mp4FieldKey.GENRE_CUSTOM.getFieldName());
        return;
      } 
      deleteField(str);
      return;
    } 
    l0.d();
  }
  
  public void deleteField(Mp4FieldKey paramMp4FieldKey) {
    if (paramMp4FieldKey != null) {
      deleteField(paramMp4FieldKey.getFieldName());
      return;
    } 
    l0.d();
  }
  
  public List<TagField> get(Mp4FieldKey paramMp4FieldKey) {
    if (paramMp4FieldKey != null)
      return getFields(paramMp4FieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList = new ArrayList();
    for (TagField tagField : getFields(paramFieldKey)) {
      if (paramFieldKey == FieldKey.TRACK) {
        arrayList.add(((Mp4TrackField)tagField).getTrackNo().toString());
        continue;
      } 
      if (paramFieldKey == FieldKey.TRACK_TOTAL) {
        arrayList.add(((Mp4TrackField)tagField).getTrackTotal().toString());
        continue;
      } 
      if (paramFieldKey == FieldKey.DISC_NO) {
        arrayList.add(((Mp4DiscNoField)tagField).getDiscNo().toString());
        continue;
      } 
      if (paramFieldKey == FieldKey.DISC_TOTAL) {
        arrayList.add(((Mp4DiscNoField)tagField).getDiscTotal().toString());
        continue;
      } 
      arrayList.add(tagField.toString());
    } 
    return arrayList;
  }
  
  public List<Artwork> getArtworkList() {
    List<TagField> list = get(Mp4FieldKey.ARTWORK);
    ArrayList<Artwork> arrayList = new ArrayList(list.size());
    for (Mp4TagCoverField mp4TagCoverField : list) {
      Artwork artwork = ArtworkFactory.getNew();
      artwork.setBinaryData(mp4TagCoverField.getData());
      artwork.setMimeType(Mp4TagCoverField.getMimeTypeForImageType(mp4TagCoverField.getFieldType()));
      arrayList.add(artwork);
    } 
    return arrayList;
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      Mp4FieldKey mp4FieldKey = tagFieldToMp4Field.get(paramFieldKey);
      if (mp4FieldKey != null) {
        List<TagField> list = getFields(mp4FieldKey.getFieldName());
        ArrayList<TagField> arrayList = new ArrayList();
        if (paramFieldKey == FieldKey.KEY)
          return (list.size() == 0) ? getFields(Mp4FieldKey.KEY_OLD.getFieldName()) : list; 
        if (paramFieldKey == FieldKey.GENRE)
          return (list.size() == 0) ? getFields(Mp4FieldKey.GENRE_CUSTOM.getFieldName()) : list; 
        if (paramFieldKey == FieldKey.TRACK) {
          for (TagField tagField : list) {
            if (((Mp4TrackField)tagField).getTrackNo().shortValue() > 0)
              arrayList.add(tagField); 
          } 
        } else if (paramFieldKey == FieldKey.TRACK_TOTAL) {
          for (TagField tagField1 : tagField) {
            if (((Mp4TrackField)tagField1).getTrackTotal().shortValue() > 0)
              arrayList.add(tagField1); 
          } 
        } else if (tagField1 == FieldKey.DISC_NO) {
          for (TagField tagField1 : tagField) {
            if (((Mp4DiscNoField)tagField1).getDiscNo().shortValue() > 0)
              arrayList.add(tagField1); 
          } 
        } else {
          if (tagField1 == FieldKey.DISC_TOTAL) {
            for (TagField tagField : tagField) {
              if (((Mp4DiscNoField)tagField).getDiscTotal().shortValue() > 0)
                arrayList.add(tagField); 
            } 
            return arrayList;
          } 
          return (List<TagField>)tagField;
        } 
        return arrayList;
      } 
      l0.d();
      return null;
    } 
    l0.d();
    return null;
  }
  
  public String getFirst(Mp4FieldKey paramMp4FieldKey) {
    if (paramMp4FieldKey != null)
      return getFirst(paramMp4FieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public Mp4TagField getFirstField(FieldKey paramFieldKey) {
    List<TagField> list = getFields(paramFieldKey);
    return (list.size() == 0) ? null : (Mp4TagField)list.get(0);
  }
  
  public Mp4TagField getFirstField(Mp4FieldKey paramMp4FieldKey) {
    if (paramMp4FieldKey != null)
      return (Mp4TagField)getFirstField(paramMp4FieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    List<TagField> list = getFields(paramFieldKey);
    if (list.size() > paramInt) {
      TagField tagField = list.get(paramInt);
      return (paramFieldKey == FieldKey.TRACK) ? ((Mp4TrackField)tagField).getTrackNo().toString() : ((paramFieldKey == FieldKey.DISC_NO) ? ((Mp4DiscNoField)tagField).getDiscNo().toString() : ((paramFieldKey == FieldKey.TRACK_TOTAL) ? ((Mp4TrackField)tagField).getTrackTotal().toString() : ((paramFieldKey == FieldKey.DISC_TOTAL) ? ((Mp4DiscNoField)tagField).getDiscTotal().toString() : tagField.toString())));
    } 
    return "";
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return (getFields(paramFieldKey).size() != 0);
  }
  
  public boolean hasField(Mp4FieldKey paramMp4FieldKey) {
    return (getFields(paramMp4FieldKey.getFieldName()).size() != 0);
  }
  
  public boolean isAllowedEncoding(Charset paramCharset) {
    return mk.c.equals(paramCharset);
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    TagField tagField = createField(paramFieldKey, paramVarArgs);
    if (paramFieldKey == FieldKey.GENRE) {
      String str = tagField.getId();
      Mp4FieldKey mp4FieldKey = Mp4FieldKey.GENRE;
      if (str.equals(mp4FieldKey.getFieldName())) {
        deleteField(Mp4FieldKey.GENRE_CUSTOM);
      } else if (tagField.getId().equals(Mp4FieldKey.GENRE_CUSTOM.getFieldName())) {
        deleteField(mp4FieldKey);
      } 
    } 
    setField(tagField);
  }
  
  public void setField(TagField paramTagField) {
    Short short_;
    if (paramTagField == null)
      return; 
    if (paramTagField.getId().equals(Mp4FieldKey.TRACK.getFieldName())) {
      List<Mp4TrackField> list = (List)this.fields.get(paramTagField.getId());
      if (list == null || list.size() == 0) {
        super.setField(paramTagField);
        return;
      } 
      Mp4TrackField mp4TrackField1 = list.get(0);
      Mp4TrackField mp4TrackField2 = (Mp4TrackField)paramTagField;
      short_ = mp4TrackField1.getTrackNo();
      Short short_1 = mp4TrackField1.getTrackTotal();
      if (mp4TrackField2.getTrackNo().shortValue() > 0)
        short_ = mp4TrackField2.getTrackNo(); 
      if (mp4TrackField2.getTrackTotal().shortValue() > 0)
        short_1 = mp4TrackField2.getTrackTotal(); 
      super.setField((TagField)new Mp4TrackField(short_.shortValue(), short_1.shortValue()));
      return;
    } 
    if (short_.getId().equals(Mp4FieldKey.DISCNUMBER.getFieldName())) {
      List<Mp4DiscNoField> list = (List)this.fields.get(short_.getId());
      if (list == null || list.size() == 0) {
        super.setField((TagField)short_);
        return;
      } 
      Mp4DiscNoField mp4DiscNoField1 = list.get(0);
      Mp4DiscNoField mp4DiscNoField2 = (Mp4DiscNoField)short_;
      short_ = mp4DiscNoField1.getDiscNo();
      Short short_1 = mp4DiscNoField1.getDiscTotal();
      if (mp4DiscNoField2.getDiscNo().shortValue() > 0)
        short_ = mp4DiscNoField2.getDiscNo(); 
      if (mp4DiscNoField2.getDiscTotal().shortValue() > 0)
        short_1 = mp4DiscNoField2.getDiscTotal(); 
      super.setField((TagField)new Mp4DiscNoField(short_.shortValue(), short_1.shortValue()));
      return;
    } 
    super.setField((TagField)short_);
  }
  
  public void setField(Mp4FieldKey paramMp4FieldKey, String paramString) {
    setField(createField(paramMp4FieldKey, paramString));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Mpeg4 ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\Mp4Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */