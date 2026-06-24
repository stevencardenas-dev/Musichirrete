package org.jaudiotagger.tag.vorbiscomment;

import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import k91;
import l0;
import mk;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPicture;
import org.jaudiotagger.audio.generic.AbstractTag;
import org.jaudiotagger.tag.FieldDataInvalidException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.vorbiscomment.util.Base64Coder;

public class VorbisCommentTag extends AbstractTag {
  public static final String DEFAULT_VENDOR = "jaudiotagger";
  
  private static EnumMap<FieldKey, VorbisCommentFieldKey> tagFieldToOggField;
  
  static {
    EnumMap<FieldKey, Object> enumMap = new EnumMap<FieldKey, Object>(FieldKey.class);
    tagFieldToOggField = (EnumMap)enumMap;
    enumMap.put(FieldKey.ACOUSTID_FINGERPRINT, VorbisCommentFieldKey.ACOUSTID_FINGERPRINT);
    tagFieldToOggField.put(FieldKey.ACOUSTID_ID, VorbisCommentFieldKey.ACOUSTID_ID);
    tagFieldToOggField.put(FieldKey.ALBUM, VorbisCommentFieldKey.ALBUM);
    tagFieldToOggField.put(FieldKey.ALBUM_ARTIST, VorbisCommentFieldKey.ALBUMARTIST);
    tagFieldToOggField.put(FieldKey.ALBUM_YEAR, VorbisCommentFieldKey.ALBUM_YEAR);
    tagFieldToOggField.put(FieldKey.ALBUM_ARTISTS, VorbisCommentFieldKey.ALBUMARTISTS);
    tagFieldToOggField.put(FieldKey.ALBUM_ARTISTS_SORT, VorbisCommentFieldKey.ALBUMARTISTSSORT);
    tagFieldToOggField.put(FieldKey.ALBUM_ARTIST_SORT, VorbisCommentFieldKey.ALBUMARTISTSORT);
    tagFieldToOggField.put(FieldKey.ALBUM_SORT, VorbisCommentFieldKey.ALBUMSORT);
    tagFieldToOggField.put(FieldKey.AMAZON_ID, VorbisCommentFieldKey.ASIN);
    tagFieldToOggField.put(FieldKey.ARRANGER, VorbisCommentFieldKey.ARRANGER);
    tagFieldToOggField.put(FieldKey.ARRANGER_SORT, VorbisCommentFieldKey.ARRANGER_SORT);
    tagFieldToOggField.put(FieldKey.ARTIST, VorbisCommentFieldKey.ARTIST);
    tagFieldToOggField.put(FieldKey.ARTISTS, VorbisCommentFieldKey.ARTISTS);
    tagFieldToOggField.put(FieldKey.ARTISTS_SORT, VorbisCommentFieldKey.ARTISTS_SORT);
    tagFieldToOggField.put(FieldKey.ARTIST_SORT, VorbisCommentFieldKey.ARTISTSORT);
    tagFieldToOggField.put(FieldKey.BARCODE, VorbisCommentFieldKey.BARCODE);
    tagFieldToOggField.put(FieldKey.BPM, VorbisCommentFieldKey.BPM);
    tagFieldToOggField.put(FieldKey.CATALOG_NO, VorbisCommentFieldKey.CATALOGNUMBER);
    tagFieldToOggField.put(FieldKey.CHOIR, VorbisCommentFieldKey.CHOIR);
    tagFieldToOggField.put(FieldKey.CHOIR_SORT, VorbisCommentFieldKey.CHOIR_SORT);
    tagFieldToOggField.put(FieldKey.CLASSICAL_CATALOG, VorbisCommentFieldKey.CLASSICAL_CATALOG);
    tagFieldToOggField.put(FieldKey.CLASSICAL_NICKNAME, VorbisCommentFieldKey.CLASSICAL_NICKNAME);
    tagFieldToOggField.put(FieldKey.COMMENT, VorbisCommentFieldKey.COMMENT);
    tagFieldToOggField.put(FieldKey.COMPOSER, VorbisCommentFieldKey.COMPOSER);
    tagFieldToOggField.put(FieldKey.COMPOSER_SORT, VorbisCommentFieldKey.COMPOSERSORT);
    tagFieldToOggField.put(FieldKey.COPYRIGHT, VorbisCommentFieldKey.COPYRIGHT);
    tagFieldToOggField.put(FieldKey.CONDUCTOR, VorbisCommentFieldKey.CONDUCTOR);
    tagFieldToOggField.put(FieldKey.CONDUCTOR_SORT, VorbisCommentFieldKey.CONDUCTOR_SORT);
    tagFieldToOggField.put(FieldKey.COUNTRY, VorbisCommentFieldKey.COUNTRY);
    tagFieldToOggField.put(FieldKey.COVER_ART, VorbisCommentFieldKey.METADATA_BLOCK_PICTURE);
    tagFieldToOggField.put(FieldKey.CUSTOM1, VorbisCommentFieldKey.CUSTOM1);
    tagFieldToOggField.put(FieldKey.CUSTOM2, VorbisCommentFieldKey.CUSTOM2);
    tagFieldToOggField.put(FieldKey.CUSTOM3, VorbisCommentFieldKey.CUSTOM3);
    tagFieldToOggField.put(FieldKey.CUSTOM4, VorbisCommentFieldKey.CUSTOM4);
    tagFieldToOggField.put(FieldKey.CUSTOM5, VorbisCommentFieldKey.CUSTOM5);
    tagFieldToOggField.put(FieldKey.DISC_NO, VorbisCommentFieldKey.DISCNUMBER);
    tagFieldToOggField.put(FieldKey.DISC_SUBTITLE, VorbisCommentFieldKey.DISCSUBTITLE);
    tagFieldToOggField.put(FieldKey.DISC_TOTAL, VorbisCommentFieldKey.DISCTOTAL);
    tagFieldToOggField.put(FieldKey.DJMIXER, VorbisCommentFieldKey.DJMIXER);
    tagFieldToOggField.put(FieldKey.DJMIXER_SORT, VorbisCommentFieldKey.DJMIXER_SORT);
    tagFieldToOggField.put(FieldKey.ENCODER, VorbisCommentFieldKey.VENDOR);
    tagFieldToOggField.put(FieldKey.ENGINEER, VorbisCommentFieldKey.ENGINEER);
    tagFieldToOggField.put(FieldKey.ENGINEER_SORT, VorbisCommentFieldKey.ENGINEER_SORT);
    tagFieldToOggField.put(FieldKey.ENSEMBLE, VorbisCommentFieldKey.ENSEMBLE);
    tagFieldToOggField.put(FieldKey.ENSEMBLE_SORT, VorbisCommentFieldKey.ENSEMBLE_SORT);
    tagFieldToOggField.put(FieldKey.FBPM, VorbisCommentFieldKey.FBPM);
    tagFieldToOggField.put(FieldKey.GENRE, VorbisCommentFieldKey.GENRE);
    tagFieldToOggField.put(FieldKey.GROUP, VorbisCommentFieldKey.GROUP);
    tagFieldToOggField.put(FieldKey.GROUPING, VorbisCommentFieldKey.GROUPING);
    tagFieldToOggField.put(FieldKey.INSTRUMENT, VorbisCommentFieldKey.INSTRUMENT);
    tagFieldToOggField.put(FieldKey.INVOLVEDPEOPLE, VorbisCommentFieldKey.INVOLVEDPEOPLE);
    tagFieldToOggField.put(FieldKey.IPI, VorbisCommentFieldKey.IPI);
    tagFieldToOggField.put(FieldKey.ISRC, VorbisCommentFieldKey.ISRC);
    tagFieldToOggField.put(FieldKey.ISWC, VorbisCommentFieldKey.ISWC);
    tagFieldToOggField.put(FieldKey.IS_CLASSICAL, VorbisCommentFieldKey.IS_CLASSICAL);
    tagFieldToOggField.put(FieldKey.IS_COMPILATION, VorbisCommentFieldKey.COMPILATION);
    tagFieldToOggField.put(FieldKey.IS_GREATEST_HITS, VorbisCommentFieldKey.IS_GREATEST_HITS);
    tagFieldToOggField.put(FieldKey.IS_HD, VorbisCommentFieldKey.IS_HD);
    tagFieldToOggField.put(FieldKey.IS_LIVE, VorbisCommentFieldKey.IS_LIVE);
    tagFieldToOggField.put(FieldKey.IS_SOUNDTRACK, VorbisCommentFieldKey.IS_SOUNDTRACK);
    tagFieldToOggField.put(FieldKey.JAIKOZ_ID, VorbisCommentFieldKey.JAIKOZ_ID);
    tagFieldToOggField.put(FieldKey.KEY, VorbisCommentFieldKey.KEY);
    tagFieldToOggField.put(FieldKey.LANGUAGE, VorbisCommentFieldKey.LANGUAGE);
    tagFieldToOggField.put(FieldKey.LYRICIST, VorbisCommentFieldKey.LYRICIST);
    tagFieldToOggField.put(FieldKey.LYRICIST_SORT, VorbisCommentFieldKey.LYRICIST_SORT);
    tagFieldToOggField.put(FieldKey.SYNC_LYRICS, VorbisCommentFieldKey.SYNC_LYRICS);
    tagFieldToOggField.put(FieldKey.UNSYNC_LYRICS, VorbisCommentFieldKey.UNSYNC_LYRICS);
    tagFieldToOggField.put(FieldKey.MEDIA, VorbisCommentFieldKey.MEDIA);
    tagFieldToOggField.put(FieldKey.MIXER, VorbisCommentFieldKey.MIXER);
    tagFieldToOggField.put(FieldKey.MIXER_SORT, VorbisCommentFieldKey.MIXER_SORT);
    tagFieldToOggField.put(FieldKey.MOOD, VorbisCommentFieldKey.MOOD);
    tagFieldToOggField.put(FieldKey.MOOD_ACOUSTIC, VorbisCommentFieldKey.MOOD_ACOUSTIC);
    tagFieldToOggField.put(FieldKey.MOOD_AGGRESSIVE, VorbisCommentFieldKey.MOOD_AGGRESSIVE);
    tagFieldToOggField.put(FieldKey.MOOD_AROUSAL, VorbisCommentFieldKey.MOOD_AROUSAL);
    tagFieldToOggField.put(FieldKey.MOOD_DANCEABILITY, VorbisCommentFieldKey.MOOD_DANCEABILITY);
    tagFieldToOggField.put(FieldKey.MOOD_ELECTRONIC, VorbisCommentFieldKey.MOOD_ELECTRONIC);
    tagFieldToOggField.put(FieldKey.MOOD_HAPPY, VorbisCommentFieldKey.MOOD_HAPPY);
    tagFieldToOggField.put(FieldKey.MOOD_INSTRUMENTAL, VorbisCommentFieldKey.MOOD_INSTRUMENTAL);
    tagFieldToOggField.put(FieldKey.MOOD_PARTY, VorbisCommentFieldKey.MOOD_PARTY);
    tagFieldToOggField.put(FieldKey.MOOD_RELAXED, VorbisCommentFieldKey.MOOD_RELAXED);
    tagFieldToOggField.put(FieldKey.MOOD_SAD, VorbisCommentFieldKey.MOOD_SAD);
    tagFieldToOggField.put(FieldKey.MOOD_VALENCE, VorbisCommentFieldKey.MOOD_VALENCE);
    tagFieldToOggField.put(FieldKey.MOVEMENT, VorbisCommentFieldKey.MOVEMENT);
    tagFieldToOggField.put(FieldKey.MOVEMENT_NO, VorbisCommentFieldKey.MOVEMENT_NO);
    tagFieldToOggField.put(FieldKey.MOVEMENT_TOTAL, VorbisCommentFieldKey.MOVEMENT_TOTAL);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_ARTISTID, VorbisCommentFieldKey.MUSICBRAINZ_ARTISTID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_DISC_ID, VorbisCommentFieldKey.MUSICBRAINZ_DISCID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_ORIGINAL_RELEASE_ID, VorbisCommentFieldKey.MUSICBRAINZ_ORIGINAL_ALBUMID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASEARTISTID, VorbisCommentFieldKey.MUSICBRAINZ_ALBUMARTISTID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASEID, VorbisCommentFieldKey.MUSICBRAINZ_ALBUMID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY, VorbisCommentFieldKey.RELEASECOUNTRY);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID, VorbisCommentFieldKey.MUSICBRAINZ_RELEASEGROUPID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASE_STATUS, VorbisCommentFieldKey.MUSICBRAINZ_ALBUMSTATUS);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID, VorbisCommentFieldKey.MUSICBRAINZ_RELEASETRACKID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RELEASE_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_ALBUMTYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_TRACK_ID, VorbisCommentFieldKey.MUSICBRAINZ_TRACKID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK, VorbisCommentFieldKey.MUSICBRAINZ_WORK);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RECORDING_WORK, VorbisCommentFieldKey.MUSICBRAINZ_RECORDING_WORK);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_RECORDING_WORK_ID, VorbisCommentFieldKey.MUSICBRAINZ_RECORDING_WORK_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORKID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID);
    tagFieldToOggField.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, VorbisCommentFieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE);
    tagFieldToOggField.put(FieldKey.MUSICIP_ID, VorbisCommentFieldKey.MUSICIP_PUID);
    tagFieldToOggField.put(FieldKey.OCCASION, VorbisCommentFieldKey.OCCASION);
    tagFieldToOggField.put(FieldKey.OPUS, VorbisCommentFieldKey.OPUS);
    tagFieldToOggField.put(FieldKey.ORCHESTRA, VorbisCommentFieldKey.ORCHESTRA);
    tagFieldToOggField.put(FieldKey.ORCHESTRA_SORT, VorbisCommentFieldKey.ORCHESTRA_SORT);
    tagFieldToOggField.put(FieldKey.ORIGINAL_ALBUM, VorbisCommentFieldKey.ORIGINAL_ALBUM);
    tagFieldToOggField.put(FieldKey.ORIGINALRELEASEDATE, VorbisCommentFieldKey.ORIGINALRELEASEDATE);
    tagFieldToOggField.put(FieldKey.ORIGINAL_ARTIST, VorbisCommentFieldKey.ORIGINAL_ARTIST);
    tagFieldToOggField.put(FieldKey.ORIGINAL_LYRICIST, VorbisCommentFieldKey.ORIGINAL_LYRICIST);
    tagFieldToOggField.put(FieldKey.ORIGINAL_YEAR, VorbisCommentFieldKey.ORIGINAL_YEAR);
    tagFieldToOggField.put(FieldKey.OVERALL_WORK, VorbisCommentFieldKey.OVERALL_WORK);
    tagFieldToOggField.put(FieldKey.PART, VorbisCommentFieldKey.PART);
    tagFieldToOggField.put(FieldKey.PART_NUMBER, VorbisCommentFieldKey.PART_NUMBER);
    tagFieldToOggField.put(FieldKey.PART_TYPE, VorbisCommentFieldKey.PART_TYPE);
    tagFieldToOggField.put(FieldKey.PERFORMER, VorbisCommentFieldKey.PERFORMER);
    tagFieldToOggField.put(FieldKey.PERFORMER_NAME, VorbisCommentFieldKey.PERFORMER_NAME);
    tagFieldToOggField.put(FieldKey.PERFORMER_NAME_SORT, VorbisCommentFieldKey.PERFORMER_NAME_SORT);
    tagFieldToOggField.put(FieldKey.PERIOD, VorbisCommentFieldKey.PERIOD);
    tagFieldToOggField.put(FieldKey.PRODUCER, VorbisCommentFieldKey.PRODUCER);
    tagFieldToOggField.put(FieldKey.PRODUCER_SORT, VorbisCommentFieldKey.PRODUCER_SORT);
    tagFieldToOggField.put(FieldKey.QUALITY, VorbisCommentFieldKey.QUALITY);
    tagFieldToOggField.put(FieldKey.RANKING, VorbisCommentFieldKey.RANKING);
    tagFieldToOggField.put(FieldKey.RATING, VorbisCommentFieldKey.RATING);
    tagFieldToOggField.put(FieldKey.RECORD_LABEL, VorbisCommentFieldKey.LABEL);
    tagFieldToOggField.put(FieldKey.RECORDINGLOCATION, VorbisCommentFieldKey.RECORDINGLOCATION);
    tagFieldToOggField.put(FieldKey.RECORDINGDATE, VorbisCommentFieldKey.RECORDINGDATE);
    tagFieldToOggField.put(FieldKey.RECORDINGSTARTDATE, VorbisCommentFieldKey.RECORDINGSTARTDATE);
    tagFieldToOggField.put(FieldKey.RECORDINGENDDATE, VorbisCommentFieldKey.RECORDINGENDDATE);
    tagFieldToOggField.put(FieldKey.REMIXER, VorbisCommentFieldKey.REMIXER);
    tagFieldToOggField.put(FieldKey.ROONALBUMTAG, VorbisCommentFieldKey.ROONALBUMTAG);
    tagFieldToOggField.put(FieldKey.ROONTRACKTAG, VorbisCommentFieldKey.ROONTRACKTAG);
    tagFieldToOggField.put(FieldKey.SCRIPT, VorbisCommentFieldKey.SCRIPT);
    tagFieldToOggField.put(FieldKey.SECTION, VorbisCommentFieldKey.SECTION);
    tagFieldToOggField.put(FieldKey.SINGLE_DISC_TRACK_NO, VorbisCommentFieldKey.SINGLE_DISC_TRACK_NO);
    tagFieldToOggField.put(FieldKey.SONGKONG_ID, VorbisCommentFieldKey.SONGKONG_ID);
    tagFieldToOggField.put(FieldKey.SUBTITLE, VorbisCommentFieldKey.SUBTITLE);
    tagFieldToOggField.put(FieldKey.TAGS, VorbisCommentFieldKey.TAGS);
    tagFieldToOggField.put(FieldKey.TEMPO, VorbisCommentFieldKey.TEMPO);
    tagFieldToOggField.put(FieldKey.TIMBRE, VorbisCommentFieldKey.TIMBRE);
    tagFieldToOggField.put(FieldKey.TITLE, VorbisCommentFieldKey.TITLE);
    tagFieldToOggField.put(FieldKey.TITLE_MOVEMENT, VorbisCommentFieldKey.TITLE_MOVEMENT);
    tagFieldToOggField.put(FieldKey.TITLE_SORT, VorbisCommentFieldKey.TITLESORT);
    tagFieldToOggField.put(FieldKey.TONALITY, VorbisCommentFieldKey.TONALITY);
    tagFieldToOggField.put(FieldKey.TRACK, VorbisCommentFieldKey.TRACKNUMBER);
    tagFieldToOggField.put(FieldKey.TRACK_TOTAL, VorbisCommentFieldKey.TRACKTOTAL);
    tagFieldToOggField.put(FieldKey.URL_DISCOGS_ARTIST_SITE, VorbisCommentFieldKey.URL_DISCOGS_ARTIST_SITE);
    tagFieldToOggField.put(FieldKey.URL_DISCOGS_RELEASE_SITE, VorbisCommentFieldKey.URL_DISCOGS_RELEASE_SITE);
    tagFieldToOggField.put(FieldKey.URL_LYRICS_SITE, VorbisCommentFieldKey.URL_LYRICS_SITE);
    tagFieldToOggField.put(FieldKey.URL_OFFICIAL_ARTIST_SITE, VorbisCommentFieldKey.URL_OFFICIAL_ARTIST_SITE);
    tagFieldToOggField.put(FieldKey.URL_OFFICIAL_RELEASE_SITE, VorbisCommentFieldKey.URL_OFFICIAL_RELEASE_SITE);
    tagFieldToOggField.put(FieldKey.URL_WIKIPEDIA_ARTIST_SITE, VorbisCommentFieldKey.URL_WIKIPEDIA_ARTIST_SITE);
    tagFieldToOggField.put(FieldKey.URL_WIKIPEDIA_RELEASE_SITE, VorbisCommentFieldKey.URL_WIKIPEDIA_RELEASE_SITE);
    tagFieldToOggField.put(FieldKey.VERSION, VorbisCommentFieldKey.VERSION);
    tagFieldToOggField.put(FieldKey.WORK, VorbisCommentFieldKey.WORK);
    tagFieldToOggField.put(FieldKey.WORK_TYPE, VorbisCommentFieldKey.WORK_TYPE);
    tagFieldToOggField.put(FieldKey.YEAR, VorbisCommentFieldKey.DATE);
  }
  
  private MetadataBlockDataPicture createMetadataBlockDataPicture(Artwork paramArtwork) {
    if (paramArtwork.isLinked())
      return new MetadataBlockDataPicture(paramArtwork.getImageUrl().getBytes(mk.b), paramArtwork.getPictureType(), "-->", "", 0, 0, 0, 0); 
    if (paramArtwork.setImageFromData())
      return new MetadataBlockDataPicture(paramArtwork.getBinaryData(), paramArtwork.getPictureType(), paramArtwork.getMimeType(), paramArtwork.getDescription(), paramArtwork.getWidth(), paramArtwork.getHeight(), 0, 0); 
    throw new FieldDataInvalidException("Unable to create MetadataBlockDataPicture from buffered");
  }
  
  public static VorbisCommentTag createNewTag() {
    VorbisCommentTag vorbisCommentTag = new VorbisCommentTag();
    vorbisCommentTag.setVendor("jaudiotagger");
    return vorbisCommentTag;
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
              addField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
              return;
            } 
            addField(createField(paramFieldKey, new String[] { str }));
            deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName());
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
    if (paramTagField.getId().equals(VorbisCommentFieldKey.VENDOR.getFieldName())) {
      setField(paramTagField);
      return;
    } 
    super.addField(paramTagField);
  }
  
  public void addField(Artwork paramArtwork) {
    addField(createField(paramArtwork));
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    return createField(FieldKey.IS_COMPILATION, new String[] { String.valueOf(paramBoolean) });
  }
  
  public TagField createField(String paramString1, String paramString2) {
    if (paramString2 != null)
      return (TagField)new VorbisCommentTagField(paramString1, paramString2); 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey != null)
      return createField(tagFieldToOggField.get(paramFieldKey), paramVarArgs[0]); 
    l0.d();
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    try {
      char[] arrayOfChar = Base64Coder.encode(createMetadataBlockDataPicture(paramArtwork).getRawContent());
      String str = new String();
      this(arrayOfChar);
      return createField(VorbisCommentFieldKey.METADATA_BLOCK_PICTURE, str);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      k91.n(unsupportedEncodingException);
      return null;
    } 
  }
  
  public TagField createField(VorbisCommentFieldKey paramVorbisCommentFieldKey, String paramString) {
    if (paramString != null) {
      if (paramVorbisCommentFieldKey != null)
        return (TagField)new VorbisCommentTagField(paramVorbisCommentFieldKey.getFieldName(), paramString); 
      l0.d();
      return null;
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public void deleteArtworkField() {
    deleteField(VorbisCommentFieldKey.METADATA_BLOCK_PICTURE);
    deleteField(VorbisCommentFieldKey.COVERART);
    deleteField(VorbisCommentFieldKey.COVERARTMIME);
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      if (paramFieldKey == FieldKey.ALBUM_ARTIST) {
        int i = null.$SwitchMap$org$jaudiotagger$tag$vorbiscomment$VorbisAlbumArtistSaveOptions[TagOptionSingleton.getInstance().getVorbisAlbumArtistSaveOptions().ordinal()];
        if (i != 1 && i != 2) {
          if (i != 3 && i != 4) {
            if (i != 5)
              return; 
            deleteField(tagFieldToOggField.get(paramFieldKey));
            deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER);
            return;
          } 
          deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER);
          return;
        } 
        deleteField(tagFieldToOggField.get(paramFieldKey));
        return;
      } 
      deleteField(tagFieldToOggField.get(paramFieldKey));
      return;
    } 
    l0.d();
  }
  
  public void deleteField(VorbisCommentFieldKey paramVorbisCommentFieldKey) {
    if (paramVorbisCommentFieldKey != null) {
      deleteField(paramVorbisCommentFieldKey.getFieldName());
      return;
    } 
    l0.d();
  }
  
  public List<TagField> get(VorbisCommentFieldKey paramVorbisCommentFieldKey) {
    if (paramVorbisCommentFieldKey != null)
      return getFields(paramVorbisCommentFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    VorbisCommentFieldKey vorbisCommentFieldKey = tagFieldToOggField.get(paramFieldKey);
    if (vorbisCommentFieldKey != null)
      return getAll(vorbisCommentFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public byte[] getArtworkBinaryData() {
    return Base64Coder.decode(getFirst(VorbisCommentFieldKey.COVERART).toCharArray());
  }
  
  public List<Artwork> getArtworkList() {
    boolean bool1;
    boolean bool2 = true;
    ArrayList<Artwork> arrayList = new ArrayList(1);
    if (getArtworkBinaryData() != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((getArtworkBinaryData()).length <= 0)
      bool2 = false; 
    if ((bool2 & bool1) != 0) {
      Artwork artwork = ArtworkFactory.getNew();
      artwork.setMimeType(getArtworkMimeType());
      artwork.setBinaryData(getArtworkBinaryData());
      arrayList.add(artwork);
    } 
    for (TagField tagField : get(VorbisCommentFieldKey.METADATA_BLOCK_PICTURE)) {
      try {
        byte[] arrayOfByte = Base64Coder.decode(((TagTextField)tagField).getContent());
        MetadataBlockDataPicture metadataBlockDataPicture = new MetadataBlockDataPicture();
        this(ByteBuffer.wrap(arrayOfByte));
        arrayList.add(ArtworkFactory.createArtworkFromMetadataBlockDataPicture(metadataBlockDataPicture));
        continue;
      } catch (IOException iOException) {
      
      } catch (InvalidFrameException invalidFrameException) {}
      k91.n((Throwable)invalidFrameException);
      return null;
    } 
    return (List<Artwork>)invalidFrameException;
  }
  
  public String getArtworkMimeType() {
    return getFirst(VorbisCommentFieldKey.COVERARTMIME);
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    VorbisCommentFieldKey vorbisCommentFieldKey = tagFieldToOggField.get(paramFieldKey);
    if (vorbisCommentFieldKey != null)
      return getFields(vorbisCommentFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public String getFirst(VorbisCommentFieldKey paramVorbisCommentFieldKey) {
    if (paramVorbisCommentFieldKey != null)
      return getFirst(paramVorbisCommentFieldKey.getFieldName()); 
    l0.d();
    return null;
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    if (paramFieldKey != null)
      return getFirstField(((VorbisCommentFieldKey)tagFieldToOggField.get(paramFieldKey)).getFieldName()); 
    l0.d();
    return null;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    String str;
    if (paramFieldKey == FieldKey.ALBUM_ARTIST) {
      int i = null.$SwitchMap$org$jaudiotagger$tag$vorbiscomment$VorbisAlbumArtistReadOptions[TagOptionSingleton.getInstance().getVorbisAlbumArtisReadOptions().ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              VorbisCommentFieldKey vorbisCommentFieldKey1 = tagFieldToOggField.get(paramFieldKey);
              if (vorbisCommentFieldKey1 != null)
                return getItem(vorbisCommentFieldKey1.getFieldName(), paramInt); 
              l0.d();
              return null;
            } 
            String str1 = getItem(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName(), paramInt);
            return str1.isEmpty() ? getItem(VorbisCommentFieldKey.ALBUMARTIST.getFieldName(), paramInt) : str1;
          } 
          str = getItem(VorbisCommentFieldKey.ALBUMARTIST.getFieldName(), paramInt);
          return str.isEmpty() ? getItem(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName(), paramInt) : str;
        } 
        return getItem(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName(), paramInt);
      } 
      return getItem(VorbisCommentFieldKey.ALBUMARTIST.getFieldName(), paramInt);
    } 
    VorbisCommentFieldKey vorbisCommentFieldKey = tagFieldToOggField.get(str);
    if (vorbisCommentFieldKey != null) {
      String str1 = getItem(vorbisCommentFieldKey.getFieldName(), paramInt);
      return (vorbisCommentFieldKey == VorbisCommentFieldKey.UNSYNC_LYRICS && TextUtils.isEmpty(str1)) ? getItem("UNSYNCED LYRICS", paramInt) : str1;
    } 
    l0.d();
    return null;
  }
  
  public String getVendor() {
    return getFirst(VorbisCommentFieldKey.VENDOR.getFieldName());
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return (getFields(((VorbisCommentFieldKey)tagFieldToOggField.get(paramFieldKey)).getFieldName()).size() != 0);
  }
  
  public boolean hasField(VorbisCommentFieldKey paramVorbisCommentFieldKey) {
    return (getFields(paramVorbisCommentFieldKey.getFieldName()).size() != 0);
  }
  
  public boolean isAllowedEncoding(Charset paramCharset) {
    return paramCharset.equals(mk.c);
  }
  
  public boolean isEmpty() {
    return (this.fields.size() <= 1);
  }
  
  @Deprecated
  public void setArtworkField(byte[] paramArrayOfbyte, String paramString) {
    String str = new String(Base64Coder.encode(paramArrayOfbyte));
    VorbisCommentTagField vorbisCommentTagField1 = new VorbisCommentTagField(VorbisCommentFieldKey.COVERART.getFieldName(), str);
    VorbisCommentTagField vorbisCommentTagField2 = new VorbisCommentTagField(VorbisCommentFieldKey.COVERARTMIME.getFieldName(), paramString);
    setField((TagField)vorbisCommentTagField1);
    setField((TagField)vorbisCommentTagField2);
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
              setField(createField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER, str));
              return;
            } 
            setField(createField(paramFieldKey, new String[] { str }));
            deleteField(VorbisCommentFieldKey.ALBUMARTIST_JRIVER.getFieldName());
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
  
  public void setField(Artwork paramArtwork) {
    setField(createField(paramArtwork));
    VorbisCommentFieldKey vorbisCommentFieldKey = VorbisCommentFieldKey.COVERART;
    if (getFirst(vorbisCommentFieldKey).length() > 0) {
      deleteField(vorbisCommentFieldKey);
      deleteField(VorbisCommentFieldKey.COVERARTMIME);
    } 
  }
  
  public void setVendor(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = "jaudiotagger"; 
    setField((TagField)new VorbisCommentTagField(VorbisCommentFieldKey.VENDOR.getFieldName(), str));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("OGG ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisCommentTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */