package org.jaudiotagger.tag.vorbiscomment;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.window.ldG.XUaAMlaMSa;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import java.util.EnumSet;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.jaudiotagger.tag.reference.Tagger;

public enum VorbisCommentFieldKey {
  ACOUSTID_FINGERPRINT, ACOUSTID_ID, ALBUM, ALBUMARTIST, ALBUMARTISTS, ALBUMARTISTSORT, ALBUMARTISTSSORT, ALBUMARTIST_JRIVER, ALBUMSORT, ALBUM_ARTIST, ALBUM_YEAR, ARRANGER, ARRANGER_SORT, ARTIST, ARTISTS, ARTISTSORT, ARTISTS_SORT, ASIN, BARCODE, BPM, CATALOGNUMBER, CHOIR, CHOIR_SORT, CLASSICAL_CATALOG, CLASSICAL_NICKNAME, COMMENT, COMPILATION, COMPOSER, COMPOSERSORT, CONDUCTOR, CONDUCTOR_SORT, CONTACT, COPYRIGHT, COUNTRY, COVERART, COVERARTMIME, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, DATE, DESCRIPTION, DISCNUMBER, DISCSUBTITLE, DISCTOTAL, DJMIXER, DJMIXER_SORT, ENCODEDBY, ENCODER, ENGINEER, ENGINEER_SORT, ENSEMBLE, ENSEMBLE_SORT, FBPM, GENRE, GROUP, GROUPING, INSTRUMENT, INVOLVEDPEOPLE, IPI, ISRC, ISWC, IS_CLASSICAL, IS_GREATEST_HITS, IS_HD, IS_LIVE, IS_SOUNDTRACK, JAIKOZ_ID, KEY, LABEL, LANGUAGE, LICENSE, LOCATION, LYRICIST, LYRICIST_SORT, MEDIA, METADATA_BLOCK_PICTURE, MIXER, MIXER_SORT, MOOD, MOOD_ACOUSTIC, MOOD_AGGRESSIVE, MOOD_AROUSAL, MOOD_DANCEABILITY, MOOD_ELECTRONIC, MOOD_HAPPY, MOOD_INSTRUMENTAL, MOOD_PARTY, MOOD_RELAXED, MOOD_SAD, MOOD_VALENCE, MOVEMENT, MOVEMENT_NO, MOVEMENT_TOTAL, MUSICBRAINZ_ALBUMARTISTID, MUSICBRAINZ_ALBUMID, MUSICBRAINZ_ALBUMSTATUS, MUSICBRAINZ_ALBUMTYPE, MUSICBRAINZ_ARTISTID, MUSICBRAINZ_DISCID, MUSICBRAINZ_ORIGINAL_ALBUMID, MUSICBRAINZ_RECORDING_WORK, MUSICBRAINZ_RECORDING_WORK_ID, MUSICBRAINZ_RELEASEGROUPID, MUSICBRAINZ_RELEASETRACKID, MUSICBRAINZ_TRACKID, MUSICBRAINZ_WORK, MUSICBRAINZ_WORKID, MUSICBRAINZ_WORK_PART_LEVEL1, MUSICBRAINZ_WORK_PART_LEVEL1_ID, MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, MUSICBRAINZ_WORK_PART_LEVEL2, MUSICBRAINZ_WORK_PART_LEVEL2_ID, MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, MUSICBRAINZ_WORK_PART_LEVEL3, MUSICBRAINZ_WORK_PART_LEVEL3_ID, MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, MUSICBRAINZ_WORK_PART_LEVEL4, MUSICBRAINZ_WORK_PART_LEVEL4_ID, MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, MUSICBRAINZ_WORK_PART_LEVEL5, MUSICBRAINZ_WORK_PART_LEVEL5_ID, MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, MUSICBRAINZ_WORK_PART_LEVEL6, MUSICBRAINZ_WORK_PART_LEVEL6_ID, MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, MUSICIAN, MUSICIP_PUID, OCCASION, OPUS, ORCHESTRA, ORCHESTRA_SORT, ORGANIZATION, ORIGINALRELEASEDATE, ORIGINAL_ALBUM, ORIGINAL_ARTIST, ORIGINAL_LYRICIST, ORIGINAL_YEAR, OVERALL_WORK, PART, PART_NUMBER, PART_TYPE, PERFORMER, PERFORMER_NAME, PERFORMER_NAME_SORT, PERIOD, PRODUCER, PRODUCER_SORT, PRODUCTNUMBER, QUALITY, RANKING, RATING, RECORDINGDATE, RECORDINGENDDATE, RECORDINGLOCATION, RECORDINGSTARTDATE, RELEASECOUNTRY, REMIXER, ROONALBUMTAG, ROONTRACKTAG, SCRIPT, SECTION, SINGLE_DISC_TRACK_NO, SONGKONG_ID, SOURCEMEDIA, SUBTITLE, SYNC_LYRICS, TAGS, TEMPO, TIMBRE, TITLE, TITLESORT, TITLE_MOVEMENT, TONALITY, TRACKNUMBER, TRACKTOTAL, UNSYNC_LYRICS, URL_DISCOGS_ARTIST_SITE, URL_DISCOGS_RELEASE_SITE, URL_LYRICS_SITE, URL_OFFICIAL_ARTIST_SITE, URL_OFFICIAL_RELEASE_SITE, URL_WIKIPEDIA_ARTIST_SITE, URL_WIKIPEDIA_RELEASE_SITE, VENDOR, VERSION, WORK, WORK_TYPE;
  
  private static final VorbisCommentFieldKey[] $VALUES;
  
  private String fieldName;
  
  private String realFieldName;
  
  private EnumSet<Tagger> taggers;
  
  static {
    Tagger tagger4 = Tagger.PICARD;
    ACOUSTID_FINGERPRINT = new VorbisCommentFieldKey("ACOUSTID_FINGERPRINT", 0, "ACOUSTID_FINGERPRINT", EnumSet.of(tagger4));
    ACOUSTID_ID = new VorbisCommentFieldKey("ACOUSTID_ID", 1, "ACOUSTID_ID", EnumSet.of(tagger4));
    Tagger tagger2 = Tagger.XIPH;
    Tagger tagger3 = Tagger.JAIKOZ;
    Tagger tagger5 = Tagger.ROON;
    ALBUM = new VorbisCommentFieldKey("ALBUM", 2, "ALBUM", EnumSet.of(tagger2, tagger4, tagger3, tagger5));
    ALBUMARTIST = new VorbisCommentFieldKey("ALBUMARTIST", 3, "ALBUMARTIST", EnumSet.of(tagger4, tagger3));
    ALBUMARTISTSORT = new VorbisCommentFieldKey("ALBUMARTISTSORT", 4, "ALBUMARTISTSORT", EnumSet.of(tagger4, tagger3));
    ALBUMARTISTS = new VorbisCommentFieldKey("ALBUMARTISTS", 5, "ALBUM_ARTISTS", EnumSet.of(tagger4, tagger3));
    ALBUMARTISTSSORT = new VorbisCommentFieldKey("ALBUMARTISTSSORT", 6, "ALBUM_ARTISTS_SORT", EnumSet.of(tagger4, tagger3));
    ALBUMARTIST_JRIVER = new VorbisCommentFieldKey("ALBUMARTIST_JRIVER", 7, "ALBUM ARTIST", EnumSet.of(Tagger.JRIVER));
    ALBUMSORT = new VorbisCommentFieldKey("ALBUMSORT", 8, "ALBUMSORT", EnumSet.of(tagger4, tagger3));
    Tagger tagger1 = Tagger.MEDIA_MONKEY;
    ALBUM_ARTIST = new VorbisCommentFieldKey("ALBUM_ARTIST", 9, "ALBUM_ARTIST", EnumSet.of(tagger1));
    ALBUM_YEAR = new VorbisCommentFieldKey("ALBUM_YEAR", 10, "ALBUM_YEAR", EnumSet.of(tagger3));
    ARRANGER = new VorbisCommentFieldKey("ARRANGER", 11, "ARRANGER", EnumSet.of(tagger4));
    ARRANGER_SORT = new VorbisCommentFieldKey("ARRANGER_SORT", 12, "ARRANGER_SORT", EnumSet.of(tagger3));
    ARTIST = new VorbisCommentFieldKey("ARTIST", 13, "ARTIST", EnumSet.of(tagger2, tagger4, tagger3));
    ARTISTS = new VorbisCommentFieldKey("ARTISTS", 14, "ARTISTS", EnumSet.of(tagger3));
    ARTISTSORT = new VorbisCommentFieldKey("ARTISTSORT", 15, "ARTISTSORT", EnumSet.of(tagger4, tagger3));
    ARTISTS_SORT = new VorbisCommentFieldKey("ARTISTS_SORT", 16, "ARTISTS_SORT", EnumSet.of(tagger3));
    EnumSet<Tagger> enumSet3 = EnumSet.of(tagger4, tagger3);
    String str1 = XUaAMlaMSa.noR;
    ASIN = new VorbisCommentFieldKey(str1, 17, str1, enumSet3);
    BARCODE = new VorbisCommentFieldKey("BARCODE", 18, "BARCODE", EnumSet.of(tagger3, tagger5));
    BPM = new VorbisCommentFieldKey("BPM", 19, "BPM", EnumSet.of(tagger4, tagger3));
    CATALOGNUMBER = new VorbisCommentFieldKey("CATALOGNUMBER", 20, "CATALOGNUMBER", EnumSet.of(tagger4, tagger3));
    CHOIR = new VorbisCommentFieldKey("CHOIR", 21, "CHOIR", EnumSet.of(tagger3));
    CHOIR_SORT = new VorbisCommentFieldKey("CHOIR_SORT", 22, "CHOIR_SORT", EnumSet.of(tagger3));
    CLASSICAL_CATALOG = new VorbisCommentFieldKey("CLASSICAL_CATALOG", 23, "CLASSICAL_CATALOG", EnumSet.of(tagger3));
    CLASSICAL_NICKNAME = new VorbisCommentFieldKey("CLASSICAL_NICKNAME", 24, "CLASSICAL_NICKNAME", EnumSet.of(tagger3));
    COMMENT = new VorbisCommentFieldKey("COMMENT", 25, "COMMENT", EnumSet.of(tagger4));
    COMPILATION = new VorbisCommentFieldKey("COMPILATION", 26, "COMPILATION", EnumSet.of(tagger4, tagger3));
    COMPOSER = new VorbisCommentFieldKey("COMPOSER", 27, "COMPOSER", EnumSet.of(tagger4, tagger3, tagger5));
    COMPOSERSORT = new VorbisCommentFieldKey("COMPOSERSORT", 28, "COMPOSERSORT", EnumSet.of(tagger3));
    EnumSet<Tagger> enumSet1 = EnumSet.of(tagger4, tagger3, tagger5);
    CONDUCTOR = new VorbisCommentFieldKey(hbrAVtEa.PFHGv, 29, "CONDUCTOR", enumSet1);
    enumSet1 = EnumSet.of(tagger3);
    CONDUCTOR_SORT = new VorbisCommentFieldKey(fXMDNeMWaILNVh.OzFxQZLG, 30, "CONDUCTOR_SORT", enumSet1);
    CONTACT = new VorbisCommentFieldKey("CONTACT", 31, "CONTACT", EnumSet.of(tagger2));
    COPYRIGHT = new VorbisCommentFieldKey("COPYRIGHT", 32, "COPYRIGHT", EnumSet.of(tagger2, tagger4, tagger3));
    COUNTRY = new VorbisCommentFieldKey("COUNTRY", 33, "COUNTRY", EnumSet.of(tagger4));
    String str2 = ybWnIKHovcRr.HyAKhtFLMFTSj;
    enumSet1 = EnumSet.of(tagger3);
    COVERART = new VorbisCommentFieldKey(RqlokDsQOju.BMul, 34, str2, enumSet1);
    COVERARTMIME = new VorbisCommentFieldKey("COVERARTMIME", 35, "COVERARTMIME", EnumSet.of(tagger3));
    CUSTOM1 = new VorbisCommentFieldKey("CUSTOM1", 36, tlzLOCPTHRhep.XZeq, EnumSet.of(tagger1));
    CUSTOM2 = new VorbisCommentFieldKey("CUSTOM2", 37, "CUSTOM2", EnumSet.of(tagger1));
    CUSTOM3 = new VorbisCommentFieldKey("CUSTOM3", 38, "CUSTOM3", EnumSet.of(tagger1));
    CUSTOM4 = new VorbisCommentFieldKey("CUSTOM4", 39, "CUSTOM4", EnumSet.of(tagger1));
    CUSTOM5 = new VorbisCommentFieldKey("CUSTOM5", 40, "CUSTOM5", EnumSet.of(tagger1));
    DATE = new VorbisCommentFieldKey("DATE", 41, "DATE", EnumSet.of(tagger2, tagger4, tagger3));
    DESCRIPTION = new VorbisCommentFieldKey("DESCRIPTION", 42, "DESCRIPTION", EnumSet.of(tagger2));
    DISCNUMBER = new VorbisCommentFieldKey("DISCNUMBER", 43, "DISCNUMBER", EnumSet.of(tagger4, tagger3));
    DISCSUBTITLE = new VorbisCommentFieldKey("DISCSUBTITLE", 44, "DISCSUBTITLE", EnumSet.of(tagger4, tagger3));
    DISCTOTAL = new VorbisCommentFieldKey("DISCTOTAL", 45, "DISCTOTAL", EnumSet.of(tagger2, tagger4));
    DJMIXER = new VorbisCommentFieldKey("DJMIXER", 46, "DJMIXER", EnumSet.of(tagger4));
    Tagger tagger6 = Tagger.SONGKONG;
    DJMIXER_SORT = new VorbisCommentFieldKey("DJMIXER_SORT", 47, "DJMIXER_SORT", EnumSet.of(tagger6));
    ENCODEDBY = new VorbisCommentFieldKey("ENCODEDBY", 48, "ENCODEDBY", EnumSet.of(tagger4));
    ENCODER = new VorbisCommentFieldKey("ENCODER", 49, "ENCODER");
    ENGINEER = new VorbisCommentFieldKey("ENGINEER", 50, "ENGINEER", EnumSet.of(tagger4, tagger5));
    ENGINEER_SORT = new VorbisCommentFieldKey("ENGINEER_SORT", 51, nFLlOYeP.tmLpqtICfN, EnumSet.of(tagger6));
    ENSEMBLE = new VorbisCommentFieldKey("ENSEMBLE", 52, "ENSEMBLE", EnumSet.of(tagger1, tagger3, tagger5));
    ENSEMBLE_SORT = new VorbisCommentFieldKey("ENSEMBLE_SORT", 53, "ENSEMBLE_SORT", EnumSet.of(tagger3));
    FBPM = new VorbisCommentFieldKey("FBPM", 54, "FBPM", EnumSet.of(Tagger.BEATUNES));
    GENRE = new VorbisCommentFieldKey("GENRE", 55, "GENRE", EnumSet.of(tagger2, tagger4, tagger3));
    GROUP = new VorbisCommentFieldKey("GROUP", 56, "GROUP", EnumSet.of(tagger3, Tagger.MINIMSERVER));
    GROUPING = new VorbisCommentFieldKey("GROUPING", 57, "GROUPING", EnumSet.of(tagger4, tagger3));
    INSTRUMENT = new VorbisCommentFieldKey("INSTRUMENT", 58, "INSTRUMENT", EnumSet.of(tagger3));
    INVOLVEDPEOPLE = new VorbisCommentFieldKey("INVOLVEDPEOPLE", 59, "INVOLVEDPEOPLE", EnumSet.of(tagger5));
    IPI = new VorbisCommentFieldKey("IPI", 60, "IPI", EnumSet.of(tagger3));
    ISRC = new VorbisCommentFieldKey("ISRC", 61, "ISRC", EnumSet.of(tagger2, tagger4, tagger3));
    ISWC = new VorbisCommentFieldKey("ISWC", 62, "ISWC", EnumSet.of(tagger2, tagger4, tagger3));
    IS_CLASSICAL = new VorbisCommentFieldKey("IS_CLASSICAL", 63, "IS_CLASSICAL", EnumSet.of(tagger4, tagger3));
    IS_GREATEST_HITS = new VorbisCommentFieldKey("IS_GREATEST_HITS", 64, "IS_GREATEST_HITS", EnumSet.of(tagger3));
    IS_HD = new VorbisCommentFieldKey("IS_HD", 65, "IS_HD", EnumSet.of(tagger4, tagger3));
    IS_LIVE = new VorbisCommentFieldKey("IS_LIVE", 66, "LIVE", EnumSet.of(tagger5));
    IS_SOUNDTRACK = new VorbisCommentFieldKey("IS_SOUNDTRACK", 67, "IS_SOUNDTRACK", EnumSet.of(tagger4, tagger3));
    JAIKOZ_ID = new VorbisCommentFieldKey("JAIKOZ_ID", 68, "JAIKOZ_ID", EnumSet.of(tagger3));
    KEY = new VorbisCommentFieldKey("KEY", 69, "KEY");
    LABEL = new VorbisCommentFieldKey("LABEL", 70, "LABEL", EnumSet.of(tagger4, tagger3, tagger5));
    LANGUAGE = new VorbisCommentFieldKey("LANGUAGE", 71, "LANGUAGE");
    LICENSE = new VorbisCommentFieldKey("LICENSE", 72, "LICENSE", EnumSet.of(tagger2));
    LOCATION = new VorbisCommentFieldKey("LOCATION", 73, "LOCATION", EnumSet.of(tagger2));
    LYRICIST = new VorbisCommentFieldKey("LYRICIST", 74, "LYRICIST", EnumSet.of(tagger4, tagger3, tagger5));
    LYRICIST_SORT = new VorbisCommentFieldKey("LYRICIST_SORT", 75, "LYRICIST_SORT", EnumSet.of(tagger3));
    SYNC_LYRICS = new VorbisCommentFieldKey("SYNC_LYRICS", 76, "LYRICS", EnumSet.of(tagger4, tagger3));
    UNSYNC_LYRICS = new VorbisCommentFieldKey("UNSYNC_LYRICS", 77, "UNSYNCEDLYRICS", EnumSet.of(tagger4, tagger3));
    MEDIA = new VorbisCommentFieldKey("MEDIA", 78, "MEDIA", EnumSet.of(tagger4, tagger3));
    METADATA_BLOCK_PICTURE = new VorbisCommentFieldKey("METADATA_BLOCK_PICTURE", 79, "METADATA_BLOCK_PICTURE", EnumSet.of(tagger2));
    MIXER = new VorbisCommentFieldKey("MIXER", 80, "MIXER", EnumSet.of(tagger4));
    MIXER_SORT = new VorbisCommentFieldKey("MIXER_SORT", 81, "MIXER_SORT", EnumSet.of(tagger6));
    MOOD = new VorbisCommentFieldKey("MOOD", 82, "MOOD", EnumSet.of(tagger4, tagger3));
    MOOD_ACOUSTIC = new VorbisCommentFieldKey("MOOD_ACOUSTIC", 83, "MOOD_ACOUSTIC", EnumSet.of(tagger3));
    MOOD_AGGRESSIVE = new VorbisCommentFieldKey("MOOD_AGGRESSIVE", 84, "MOOD_AGGRESSIVE", EnumSet.of(tagger3));
    MOOD_AROUSAL = new VorbisCommentFieldKey("MOOD_AROUSAL", 85, "MOOD_AROUSAL", EnumSet.of(tagger3));
    MOOD_DANCEABILITY = new VorbisCommentFieldKey("MOOD_DANCEABILITY", 86, "MOOD_DANCEABILITY", EnumSet.of(tagger3));
    MOOD_ELECTRONIC = new VorbisCommentFieldKey("MOOD_ELECTRONIC", 87, IGBYXeDFmKYajx.avKJkIDSXqZIfee, EnumSet.of(tagger3));
    MOOD_HAPPY = new VorbisCommentFieldKey("MOOD_HAPPY", 88, "MOOD_HAPPY", EnumSet.of(tagger3));
    MOOD_INSTRUMENTAL = new VorbisCommentFieldKey("MOOD_INSTRUMENTAL", 89, "MOOD_INSTRUMENTAL", EnumSet.of(tagger3));
    MOOD_PARTY = new VorbisCommentFieldKey("MOOD_PARTY", 90, "MOOD_PARTY", EnumSet.of(tagger3));
    MOOD_RELAXED = new VorbisCommentFieldKey("MOOD_RELAXED", 91, "MOOD_RELAXED", EnumSet.of(tagger3));
    MOOD_SAD = new VorbisCommentFieldKey("MOOD_SAD", 92, "MOOD_SAD", EnumSet.of(tagger3));
    MOOD_VALENCE = new VorbisCommentFieldKey("MOOD_VALENCE", 93, "MOOD_VALENCE", EnumSet.of(tagger3));
    MOVEMENT = new VorbisCommentFieldKey("MOVEMENT", 94, "MOVEMENT", EnumSet.of(tagger3));
    MOVEMENT_NO = new VorbisCommentFieldKey("MOVEMENT_NO", 95, "MOVEMENT_NO", EnumSet.of(tagger3));
    MOVEMENT_TOTAL = new VorbisCommentFieldKey("MOVEMENT_TOTAL", 96, zpEN.xFVCEKHZmrjDau, EnumSet.of(tagger3));
    MUSICBRAINZ_ALBUMARTISTID = new VorbisCommentFieldKey("MUSICBRAINZ_ALBUMARTISTID", 97, "MUSICBRAINZ_ALBUMARTISTID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_ALBUMID = new VorbisCommentFieldKey("MUSICBRAINZ_ALBUMID", 98, "MUSICBRAINZ_ALBUMID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_ALBUMSTATUS = new VorbisCommentFieldKey("MUSICBRAINZ_ALBUMSTATUS", 99, "MUSICBRAINZ_ALBUMSTATUS", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_ALBUMTYPE = new VorbisCommentFieldKey("MUSICBRAINZ_ALBUMTYPE", 100, "MUSICBRAINZ_ALBUMTYPE", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_ARTISTID = new VorbisCommentFieldKey("MUSICBRAINZ_ARTISTID", 101, "MUSICBRAINZ_ARTISTID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_DISCID = new VorbisCommentFieldKey("MUSICBRAINZ_DISCID", 102, "MUSICBRAINZ_DISCID", EnumSet.of(tagger4, tagger3));
    EnumSet<Tagger> enumSet2 = EnumSet.of(tagger3);
    MUSICBRAINZ_ORIGINAL_ALBUMID = new VorbisCommentFieldKey(YbNJ.TKMVtLQBnbMQm, 103, "MUSICBRAINZ_ORIGINALALBUMID", enumSet2);
    MUSICBRAINZ_RELEASEGROUPID = new VorbisCommentFieldKey("MUSICBRAINZ_RELEASEGROUPID", 104, "MUSICBRAINZ_RELEASEGROUPID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_RELEASETRACKID = new VorbisCommentFieldKey("MUSICBRAINZ_RELEASETRACKID", 105, "MUSICBRAINZ_RELEASETRACKID", EnumSet.of(tagger3));
    MUSICBRAINZ_TRACKID = new VorbisCommentFieldKey("MUSICBRAINZ_TRACKID", 106, "MUSICBRAINZ_TRACKID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_WORK = new VorbisCommentFieldKey("MUSICBRAINZ_WORK", 107, "MUSICBRAINZ_WORK", EnumSet.of(tagger3));
    MUSICBRAINZ_WORKID = new VorbisCommentFieldKey("MUSICBRAINZ_WORKID", 108, "MUSICBRAINZ_WORKID", EnumSet.of(tagger4, tagger3));
    MUSICBRAINZ_RECORDING_WORK = new VorbisCommentFieldKey("MUSICBRAINZ_RECORDING_WORK", 109, "MUSICBRAINZ_RECORDING_WORK", EnumSet.of(tagger3));
    MUSICBRAINZ_RECORDING_WORK_ID = new VorbisCommentFieldKey("MUSICBRAINZ_RECORDING_WORK_ID", 110, "MUSICBRAINZ_RECORDING_WORK_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL1 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1", 111, "MUSICBRAINZ_WORK_PART_LEVEL1", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL1_ID = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_ID", 112, "MUSICBRAINZ_WORK_PART_LEVEL1_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL1_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", 113, "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL2 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL2", 114, "MUSICBRAINZ_WORK_PART_LEVEL2", EnumSet.of(tagger3));
    enumSet2 = EnumSet.of(tagger3);
    MUSICBRAINZ_WORK_PART_LEVEL2_ID = new VorbisCommentFieldKey(hbrAVtEa.ClYFiDUiPfAQ, 115, "MUSICBRAINZ_WORK_PART_LEVEL2_ID", enumSet2);
    MUSICBRAINZ_WORK_PART_LEVEL2_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", 116, "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL3 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3", 117, "MUSICBRAINZ_WORK_PART_LEVEL3", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL3_ID = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_ID", 118, "MUSICBRAINZ_WORK_PART_LEVEL3_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL3_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", 119, "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL4_ID = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_ID", 120, "MUSICBRAINZ_WORK_PART_LEVEL4_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL4 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4", 121, "MUSICBRAINZ_WORK_PART_LEVEL4", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL4_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", 122, "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL5 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5", 123, "MUSICBRAINZ_WORK_PART_LEVEL5", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL5_ID = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5_ID", 124, "MUSICBRAINZ_WORK_PART_LEVEL5_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL5_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", 125, "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL6 = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL6", 126, "MUSICBRAINZ_WORK_PART_LEVEL6", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL6_ID = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL6_ID", 127, "MUSICBRAINZ_WORK_PART_LEVEL6_ID", EnumSet.of(tagger3));
    MUSICBRAINZ_WORK_PART_LEVEL6_TYPE = new VorbisCommentFieldKey("MUSICBRAINZ_WORK_PART_LEVEL6_TYPE", 128, "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE", EnumSet.of(tagger3));
    MUSICIAN = new VorbisCommentFieldKey("MUSICIAN", 129, "MUSICIAN", EnumSet.of(tagger3));
    MUSICIP_PUID = new VorbisCommentFieldKey("MUSICIP_PUID", 130, "MUSICIP_PUID", EnumSet.of(tagger4, tagger3));
    OCCASION = new VorbisCommentFieldKey("OCCASION", 131, "OCCASION", EnumSet.of(tagger1));
    OPUS = new VorbisCommentFieldKey("OPUS", 132, "OPUS", EnumSet.of(tagger3));
    ORCHESTRA = new VorbisCommentFieldKey("ORCHESTRA", 133, "ORCHESTRA", EnumSet.of(tagger3));
    ORCHESTRA_SORT = new VorbisCommentFieldKey("ORCHESTRA_SORT", 134, "ORCHESTRA_SORT", EnumSet.of(tagger3));
    ORGANIZATION = new VorbisCommentFieldKey("ORGANIZATION", 135, "ORGANIZATION", EnumSet.of(tagger2));
    ORIGINAL_ALBUM = new VorbisCommentFieldKey("ORIGINAL_ALBUM", 136, "ORIGINAL ALBUM", EnumSet.of(tagger3, tagger1));
    ORIGINALRELEASEDATE = new VorbisCommentFieldKey("ORIGINALRELEASEDATE", 137, "ORIGINALRELEASEDATE", EnumSet.of(tagger5));
    ORIGINAL_ARTIST = new VorbisCommentFieldKey("ORIGINAL_ARTIST", 138, "ORIGINAL ARTIST", EnumSet.of(tagger3, tagger1));
    ORIGINAL_LYRICIST = new VorbisCommentFieldKey("ORIGINAL_LYRICIST", 139, hrSTyFuSIm.gTCIqH, EnumSet.of(tagger1));
    ORIGINAL_YEAR = new VorbisCommentFieldKey("ORIGINAL_YEAR", 140, "ORIGINAL YEAR", EnumSet.of(tagger3, tagger1));
    OVERALL_WORK = new VorbisCommentFieldKey("OVERALL_WORK", 141, "OVERALL_WORK", EnumSet.of(tagger3));
    PART = new VorbisCommentFieldKey("PART", 142, "PART", EnumSet.of(tagger3, tagger5));
    PART_NUMBER = new VorbisCommentFieldKey("PART_NUMBER", 143, "PARTNUMBER", EnumSet.of(tagger2));
    PART_TYPE = new VorbisCommentFieldKey("PART_TYPE", 144, "PART_TYPE", EnumSet.of(tagger3));
    PERFORMER = new VorbisCommentFieldKey("PERFORMER", 145, "PERFORMER", EnumSet.of(tagger2, tagger4));
    PERFORMER_NAME = new VorbisCommentFieldKey("PERFORMER_NAME", 146, "PERFORMER_NAME", EnumSet.of(tagger3));
    PERFORMER_NAME_SORT = new VorbisCommentFieldKey("PERFORMER_NAME_SORT", 147, "PERFORMER_NAME_SORT", EnumSet.of(tagger3));
    PERIOD = new VorbisCommentFieldKey("PERIOD", 148, "PERIOD", EnumSet.of(Tagger.MUSICHI));
    PRODUCER = new VorbisCommentFieldKey("PRODUCER", 149, "PRODUCER", EnumSet.of(tagger4, tagger5));
    PRODUCER_SORT = new VorbisCommentFieldKey("PRODUCER_SORT", 150, "PRODUCER_SORT", EnumSet.of(tagger6));
    PRODUCTNUMBER = new VorbisCommentFieldKey("PRODUCTNUMBER", 151, "PRODUCTNUMBER", EnumSet.of(tagger2));
    QUALITY = new VorbisCommentFieldKey("QUALITY", 152, "QUALITY", EnumSet.of(tagger1));
    RANKING = new VorbisCommentFieldKey("RANKING", 153, "RANKING", EnumSet.of(tagger3));
    RATING = new VorbisCommentFieldKey("RATING", 154, "RATING", EnumSet.of(tagger1));
    RECORDINGDATE = new VorbisCommentFieldKey("RECORDINGDATE", 155, "RECORDINGDATE", EnumSet.of(tagger5));
    RECORDINGSTARTDATE = new VorbisCommentFieldKey("RECORDINGSTARTDATE", 156, "RECORDINGSTARTDATE", EnumSet.of(tagger5));
    RECORDINGENDDATE = new VorbisCommentFieldKey("RECORDINGENDDATE", 157, "RECORDINGENDDATE", EnumSet.of(tagger5));
    RECORDINGLOCATION = new VorbisCommentFieldKey("RECORDINGLOCATION", 158, "RECORDINGLOCATION", EnumSet.of(tagger5));
    RELEASECOUNTRY = new VorbisCommentFieldKey("RELEASECOUNTRY", 159, "RELEASECOUNTRY", EnumSet.of(tagger4, tagger3));
    REMIXER = new VorbisCommentFieldKey("REMIXER", 160, xveccWbRzqx.IbdNZMfYOHhl, EnumSet.of(tagger4, tagger3));
    ROONALBUMTAG = new VorbisCommentFieldKey("ROONALBUMTAG", 161, "ROONALBUMTAG", EnumSet.of(tagger5));
    ROONTRACKTAG = new VorbisCommentFieldKey("ROONTRACKTAG", 162, "ROONTRACKTAG", EnumSet.of(tagger5));
    SCRIPT = new VorbisCommentFieldKey("SCRIPT", 163, "SCRIPT", EnumSet.of(tagger3));
    SECTION = new VorbisCommentFieldKey("SECTION", 164, "SECTION", EnumSet.of(tagger5));
    SINGLE_DISC_TRACK_NO = new VorbisCommentFieldKey("SINGLE_DISC_TRACK_NO", 165, "SINGLE_DISC_TRACK_NO", EnumSet.of(tagger3));
    SONGKONG_ID = new VorbisCommentFieldKey("SONGKONG_ID", 166, "SONGKONG_ID", EnumSet.of(tagger6));
    SOURCEMEDIA = new VorbisCommentFieldKey("SOURCEMEDIA", 167, "SOURCEMEDIA", EnumSet.of(tagger2));
    SUBTITLE = new VorbisCommentFieldKey("SUBTITLE", 168, "SUBTITLE", EnumSet.of(tagger4, tagger3));
    TAGS = new VorbisCommentFieldKey("TAGS", 169, "TAGS", EnumSet.of(tagger3));
    TEMPO = new VorbisCommentFieldKey("TEMPO", 170, "TEMPO", EnumSet.of(tagger1));
    TIMBRE = new VorbisCommentFieldKey("TIMBRE", 171, "TIMBRE_BRIGHTNESS", EnumSet.of(tagger3));
    TITLE = new VorbisCommentFieldKey("TITLE", 172, "TITLE", EnumSet.of(tagger2, tagger4, tagger3, tagger5));
    TITLE_MOVEMENT = new VorbisCommentFieldKey("TITLE_MOVEMENT", 173, "TITLE_MOVEMENT", EnumSet.of(tagger3));
    TITLESORT = new VorbisCommentFieldKey("TITLESORT", 174, "TITLESORT", EnumSet.of(tagger4, tagger3));
    TONALITY = new VorbisCommentFieldKey("TONALITY", 175, "TONALITY", EnumSet.of(tagger3));
    TRACKNUMBER = new VorbisCommentFieldKey("TRACKNUMBER", 176, "TRACKNUMBER", EnumSet.of(tagger2, tagger4, tagger3));
    TRACKTOTAL = new VorbisCommentFieldKey("TRACKTOTAL", 177, "TRACKTOTAL", EnumSet.of(tagger2, tagger4));
    URL_DISCOGS_ARTIST_SITE = new VorbisCommentFieldKey("URL_DISCOGS_ARTIST_SITE", 178, "URL_DISCOGS_ARTIST_SITE", EnumSet.of(tagger3));
    URL_DISCOGS_RELEASE_SITE = new VorbisCommentFieldKey("URL_DISCOGS_RELEASE_SITE", 179, "URL_DISCOGS_RELEASE_SITE", EnumSet.of(tagger3));
    URL_LYRICS_SITE = new VorbisCommentFieldKey("URL_LYRICS_SITE", 180, "URL_LYRICS_SITE", EnumSet.of(tagger3));
    URL_OFFICIAL_ARTIST_SITE = new VorbisCommentFieldKey("URL_OFFICIAL_ARTIST_SITE", 181, "URL_OFFICIAL_ARTIST_SITE", EnumSet.of(tagger3));
    URL_OFFICIAL_RELEASE_SITE = new VorbisCommentFieldKey("URL_OFFICIAL_RELEASE_SITE", 182, "URL_OFFICIAL_RELEASE_SITE", EnumSet.of(tagger3));
    URL_WIKIPEDIA_ARTIST_SITE = new VorbisCommentFieldKey("URL_WIKIPEDIA_ARTIST_SITE", 183, "URL_WIKIPEDIA_ARTIST_SITE", EnumSet.of(tagger3));
    URL_WIKIPEDIA_RELEASE_SITE = new VorbisCommentFieldKey("URL_WIKIPEDIA_RELEASE_SITE", 184, "URL_WIKIPEDIA_RELEASE_SITE", EnumSet.of(tagger3));
    VENDOR = new VorbisCommentFieldKey("VENDOR", 185, "VENDOR");
    VERSION = new VorbisCommentFieldKey("VERSION", 186, "VERSION", EnumSet.of(tagger2, tagger5));
    WORK = new VorbisCommentFieldKey("WORK", 187, uvJYmft.rXdVtBdiTiYjAk, EnumSet.of(tagger3));
    WORK_TYPE = new VorbisCommentFieldKey("WORK_TYPE", 188, "WORK_TYPE", EnumSet.of(tagger3));
    $VALUES = $values();
  }
  
  VorbisCommentFieldKey(String paramString1) {
    this.fieldName = paramString1;
  }
  
  VorbisCommentFieldKey(String paramString1, String paramString2) {
    this.fieldName = paramString1;
    this.realFieldName = paramString2;
  }
  
  VorbisCommentFieldKey(String paramString1, String paramString2, EnumSet<Tagger> paramEnumSet) {
    this.fieldName = paramString1;
    this.realFieldName = paramString2;
    this.taggers = paramEnumSet;
  }
  
  VorbisCommentFieldKey(String paramString1, EnumSet<Tagger> paramEnumSet) {
    this.fieldName = paramString1;
    this.taggers = paramEnumSet;
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
  
  public String getRealFieldName() {
    return this.realFieldName;
  }
  
  public EnumSet<Tagger> getTaggers() {
    return this.taggers;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscomment\VorbisCommentFieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */