package org.jaudiotagger.tag.id3;

import android.window.ldG.XUaAMlaMSa;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.id3.valuepair.StandardIPLSKey;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import r3.IKWi.AyxAR;
import x41;

public enum ID3v23FieldKey {
  ACOUSTID_FINGERPRINT, ACOUSTID_ID, ALBUM, ALBUM_ARTIST, ALBUM_ARTISTS, ALBUM_ARTISTS_SORT, ALBUM_ARTIST_SORT, ALBUM_SORT, ALBUM_YEAR, AMAZON_ID, ARRANGER, ARRANGER_INVOLVEDPEOPLE, ARRANGER_SORT, ARTIST, ARTISTS, ARTISTS_SORT, ARTIST_SORT, BARCODE, BPM, CATALOG_NO, CHOIR, CHOIR_SORT, CLASSICAL_CATALOG, CLASSICAL_NICKNAME, COMMENT, COMPOSER, COMPOSER_SORT, CONDUCTOR, CONDUCTOR_SORT, COPYRIGHT, COUNTRY, COVER_ART, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, DISC_NO, DISC_SUBTITLE, DISC_TOTAL, DJMIXER, DJMIXER_INVOLVEDPEOLE, DJMIXER_SORT, ENCODER, ENGINEER, ENGINEER_INVOLVEDPEOPLE, ENGINEER_SORT, ENSEMBLE, ENSEMBLE_SORT, FBPM, GENRE, GROUP, GROUPING, INSTRUMENT, INVOLVEDPEOPLE, IPI, ISRC, ISWC, IS_CLASSICAL, IS_COMPILATION, IS_GREATEST_HITS, IS_HD, IS_LIVE, IS_SOUNDTRACK, ITUNES_GROUPING, JAIKOZ_ID, KEY, LANGUAGE, LYRICIST, LYRICIST_SORT, MEDIA, MIXER, MIXER_INVOLVEDPEOLE, MIXER_SORT, MOOD, MOOD_ACOUSTIC, MOOD_AGGRESSIVE, MOOD_AROUSAL, MOOD_DANCEABILITY, MOOD_ELECTRONIC, MOOD_HAPPY, MOOD_INSTRUMENTAL, MOOD_PARTY, MOOD_RELAXED, MOOD_SAD, MOOD_VALENCE, MOVEMENT, MOVEMENT_NO, MOVEMENT_TOTAL, MUSICBRAINZ_ARTISTID, MUSICBRAINZ_DISC_ID, MUSICBRAINZ_ORIGINAL_RELEASEID, MUSICBRAINZ_RECORDING_WORK, MUSICBRAINZ_RECORDING_WORK_ID, MUSICBRAINZ_RELEASEARTISTID, MUSICBRAINZ_RELEASEID, MUSICBRAINZ_RELEASE_COUNTRY, MUSICBRAINZ_RELEASE_GROUP_ID, MUSICBRAINZ_RELEASE_STATUS, MUSICBRAINZ_RELEASE_TRACK_ID, MUSICBRAINZ_RELEASE_TYPE, MUSICBRAINZ_TRACK_ID, MUSICBRAINZ_WORK, MUSICBRAINZ_WORK_ID, MUSICBRAINZ_WORK_PART_LEVEL1_ID, MUSICBRAINZ_WORK_PART_LEVEL2_ID, MUSICBRAINZ_WORK_PART_LEVEL3_ID, MUSICBRAINZ_WORK_PART_LEVEL4_ID, MUSICBRAINZ_WORK_PART_LEVEL5_ID, MUSICBRAINZ_WORK_PART_LEVEL6_ID, MUSICIP_ID, OCCASION, OPUS, ORCHESTRA, ORCHESTRA_SORT, ORIGINALRELEASEDATE, ORIGINAL_ALBUM, ORIGINAL_ARTIST, ORIGINAL_LYRICIST, ORIGINAL_YEAR, OVERALL_WORK, PART, PART_NUMBER, PART_TYPE, PERFORMER, PERFORMER_NAME, PERFORMER_NAME_SORT, PERIOD, PRODUCER, PRODUCER_INVOLVEDPEOPLE, PRODUCER_SORT, QUALITY, RANKING, RATING, RECORDINGDATE, RECORDINGENDDATE, RECORDINGLOCATION, RECORDINGSTARTDATE, RECORD_LABEL, REMIXER, ROONALBUMTAG, ROONTRACKTAG, SCRIPT, SECTION, SINGLE_DISC_TRACK_NO, SONGKONG_ID, SUBTITLE, TAGS, TEMPO, TIMBRE, TITLE, TITLE_MOVEMENT, TITLE_SORT, TONALITY, TRACK, TRACK_TOTAL, UNSYNC_LYRICS, URL_DISCOGS_ARTIST_SITE, URL_DISCOGS_RELEASE_SITE, URL_LYRICS_SITE, URL_OFFICIAL_ARTIST_SITE, URL_OFFICIAL_RELEASE_SITE, URL_WIKIPEDIA_ARTIST_SITE, URL_WIKIPEDIA_RELEASE_SITE, VERSION, WORK, WORK_PART_LEVEL1, WORK_PART_LEVEL1_TYPE, WORK_PART_LEVEL2, WORK_PART_LEVEL2_TYPE, WORK_PART_LEVEL3, WORK_PART_LEVEL3_TYPE, WORK_PART_LEVEL4, WORK_PART_LEVEL4_TYPE, WORK_PART_LEVEL5, WORK_PART_LEVEL5_TYPE, WORK_PART_LEVEL6, WORK_PART_LEVEL6_TYPE, WORK_TYPE, YEAR;
  
  private static final ID3v23FieldKey[] $VALUES;
  
  private String fieldName;
  
  private Id3FieldType fieldType;
  
  private String frameId;
  
  private String subId;
  
  static {
    Id3FieldType id3FieldType = Id3FieldType.TEXT;
    ACOUSTID_FINGERPRINT = new ID3v23FieldKey("ACOUSTID_FINGERPRINT", 0, "TXXX", "Acoustid Fingerprint", id3FieldType);
    ACOUSTID_ID = new ID3v23FieldKey("ACOUSTID_ID", 1, "TXXX", "Acoustid Id", id3FieldType);
    ALBUM = new ID3v23FieldKey(kOkiWEITVb.mfvYCwKOssHj, 2, "TALB", id3FieldType);
    ALBUM_ARTIST = new ID3v23FieldKey("ALBUM_ARTIST", 3, "TPE2", id3FieldType);
    ALBUM_ARTIST_SORT = new ID3v23FieldKey("ALBUM_ARTIST_SORT", 4, "TSO2", id3FieldType);
    ALBUM_ARTISTS = new ID3v23FieldKey("ALBUM_ARTISTS", 5, "TXXX", "ALBUM_ARTISTS", id3FieldType);
    ALBUM_ARTISTS_SORT = new ID3v23FieldKey("ALBUM_ARTISTS_SORT", 6, "TXXX", "ALBUM_ARTISTS_SORT", id3FieldType);
    ALBUM_SORT = new ID3v23FieldKey("ALBUM_SORT", 7, uvJYmft.VhKDplphj, id3FieldType);
    ALBUM_YEAR = new ID3v23FieldKey("ALBUM_YEAR", 8, "TXXX", "ALBUM_YEAR", id3FieldType);
    AMAZON_ID = new ID3v23FieldKey("AMAZON_ID", 9, "TXXX", "ASIN", id3FieldType);
    ARRANGER = new ID3v23FieldKey("ARRANGER", 10, "TXXX", "ARRANGER", id3FieldType);
    ARRANGER_SORT = new ID3v23FieldKey("ARRANGER_SORT", 11, "TXXX", "ARRANGER_SORT", id3FieldType);
    ARRANGER_INVOLVEDPEOPLE = new ID3v23FieldKey("ARRANGER_INVOLVEDPEOPLE", 12, "IPLS", StandardIPLSKey.ARRANGER.getKey(), id3FieldType);
    ARTIST = new ID3v23FieldKey("ARTIST", 13, "TPE1", id3FieldType);
    ARTISTS = new ID3v23FieldKey("ARTISTS", 14, "TXXX", "ARTISTS", id3FieldType);
    ARTISTS_SORT = new ID3v23FieldKey("ARTISTS_SORT", 15, "TXXX", "ARTISTS_SORT", id3FieldType);
    ARTIST_SORT = new ID3v23FieldKey("ARTIST_SORT", 16, "TSOP", id3FieldType);
    BARCODE = new ID3v23FieldKey("BARCODE", 17, "TXXX", "BARCODE", id3FieldType);
    BPM = new ID3v23FieldKey("BPM", 18, "TBPM", id3FieldType);
    CATALOG_NO = new ID3v23FieldKey("CATALOG_NO", 19, "TXXX", "CATALOGNUMBER", id3FieldType);
    CHOIR = new ID3v23FieldKey("CHOIR", 20, "TXXX", "CHOIR", id3FieldType);
    CHOIR_SORT = new ID3v23FieldKey("CHOIR_SORT", 21, "TXXX", "CHOIR_SORT", id3FieldType);
    CLASSICAL_CATALOG = new ID3v23FieldKey("CLASSICAL_CATALOG", 22, "TXXX", "CLASSICAL_CATALOG", id3FieldType);
    CLASSICAL_NICKNAME = new ID3v23FieldKey("CLASSICAL_NICKNAME", 23, "TXXX", "CLASSICAL_NICKNAME", id3FieldType);
    COMMENT = new ID3v23FieldKey("COMMENT", 24, "COMM", id3FieldType);
    COMPOSER = new ID3v23FieldKey("COMPOSER", 25, "TCOM", id3FieldType);
    COMPOSER_SORT = new ID3v23FieldKey("COMPOSER_SORT", 26, "TSOC", id3FieldType);
    CONDUCTOR = new ID3v23FieldKey("CONDUCTOR", 27, "TPE3", id3FieldType);
    CONDUCTOR_SORT = new ID3v23FieldKey("CONDUCTOR_SORT", 28, "TXXX", "CONDUCTOR_SORT", id3FieldType);
    COPYRIGHT = new ID3v23FieldKey("COPYRIGHT", 29, "TCOP", id3FieldType);
    COUNTRY = new ID3v23FieldKey("COUNTRY", 30, "TXXX", "Country", id3FieldType);
    COVER_ART = new ID3v23FieldKey("COVER_ART", 31, "APIC", Id3FieldType.BINARY);
    CUSTOM1 = new ID3v23FieldKey("CUSTOM1", 32, "COMM", "Songs-DB_Custom1", id3FieldType);
    CUSTOM2 = new ID3v23FieldKey("CUSTOM2", 33, "COMM", "Songs-DB_Custom2", id3FieldType);
    CUSTOM3 = new ID3v23FieldKey("CUSTOM3", 34, "COMM", "Songs-DB_Custom3", id3FieldType);
    CUSTOM4 = new ID3v23FieldKey("CUSTOM4", 35, "COMM", "Songs-DB_Custom4", id3FieldType);
    CUSTOM5 = new ID3v23FieldKey(xveccWbRzqx.hAuoqIitFyq, 36, "COMM", "Songs-DB_Custom5", id3FieldType);
    DISC_NO = new ID3v23FieldKey("DISC_NO", 37, "TPOS", id3FieldType);
    DISC_SUBTITLE = new ID3v23FieldKey("DISC_SUBTITLE", 38, "TSST", id3FieldType);
    DISC_TOTAL = new ID3v23FieldKey("DISC_TOTAL", 39, "TPOS", id3FieldType);
    DJMIXER = new ID3v23FieldKey("DJMIXER", 40, "TXXX", "DJMIXER", id3FieldType);
    DJMIXER_SORT = new ID3v23FieldKey("DJMIXER_SORT", 41, "TXXX", "DJMIXER_SORT", id3FieldType);
    String str = StandardIPLSKey.DJMIXER.getKey();
    DJMIXER_INVOLVEDPEOLE = new ID3v23FieldKey(nBRIsU.iyhfLVvOFx, 42, "IPLS", str, id3FieldType);
    ENCODER = new ID3v23FieldKey("ENCODER", 43, "TENC", id3FieldType);
    ENGINEER = new ID3v23FieldKey("ENGINEER", 44, "TXXX", "ENGINEER", id3FieldType);
    ENGINEER_SORT = new ID3v23FieldKey("ENGINEER_SORT", 45, "TXXX", "ENGINEER_SORT", id3FieldType);
    ENGINEER_INVOLVEDPEOPLE = new ID3v23FieldKey("ENGINEER_INVOLVEDPEOPLE", 46, "IPLS", StandardIPLSKey.ENGINEER.getKey(), id3FieldType);
    ENSEMBLE = new ID3v23FieldKey("ENSEMBLE", 47, "TXXX", "ENSEMBLE", id3FieldType);
    ENSEMBLE_SORT = new ID3v23FieldKey("ENSEMBLE_SORT", 48, "TXXX", "ENSEMBLE_SORT", id3FieldType);
    FBPM = new ID3v23FieldKey("FBPM", 49, "TXXX", "FBPM", id3FieldType);
    GENRE = new ID3v23FieldKey("GENRE", 50, "TCON", id3FieldType);
    GROUP = new ID3v23FieldKey("GROUP", 51, "TXXX", "GROUP", id3FieldType);
    GROUPING = new ID3v23FieldKey(JkpGFvCVQHzgc.qwTwopsSZ, 52, "TIT1", id3FieldType);
    INVOLVEDPEOPLE = new ID3v23FieldKey("INVOLVEDPEOPLE", 53, "IPLS", id3FieldType);
    INSTRUMENT = new ID3v23FieldKey("INSTRUMENT", 54, "TXXX", "INSTRUMENT", id3FieldType);
    IPI = new ID3v23FieldKey("IPI", 55, "TXXX", "IPI", id3FieldType);
    ISRC = new ID3v23FieldKey("ISRC", 56, "TSRC", id3FieldType);
    ISWC = new ID3v23FieldKey(PwbbJfsdcHrAjW.Clq, 57, "TXXX", "ISWC", id3FieldType);
    IS_CLASSICAL = new ID3v23FieldKey("IS_CLASSICAL", 58, "TXXX", "IS_CLASSICAL", id3FieldType);
    IS_COMPILATION = new ID3v23FieldKey("IS_COMPILATION", 59, "TCMP", id3FieldType);
    IS_GREATEST_HITS = new ID3v23FieldKey("IS_GREATEST_HITS", 60, "TXXX", "IS_GREATEST_HITS", id3FieldType);
    IS_SOUNDTRACK = new ID3v23FieldKey("IS_SOUNDTRACK", 61, "TXXX", "IS_SOUNDTRACK", id3FieldType);
    IS_HD = new ID3v23FieldKey("IS_HD", 62, "TXXX", "IS_HD", id3FieldType);
    IS_LIVE = new ID3v23FieldKey("IS_LIVE", 63, "TXXX", "LIVE", id3FieldType);
    ITUNES_GROUPING = new ID3v23FieldKey("ITUNES_GROUPING", 64, "GRP1", id3FieldType);
    JAIKOZ_ID = new ID3v23FieldKey("JAIKOZ_ID", 65, "TXXX", "JAIKOZ_ID", id3FieldType);
    KEY = new ID3v23FieldKey("KEY", 66, "TKEY", id3FieldType);
    LANGUAGE = new ID3v23FieldKey("LANGUAGE", 67, "TLAN", id3FieldType);
    LYRICIST = new ID3v23FieldKey("LYRICIST", 68, "TEXT", id3FieldType);
    LYRICIST_SORT = new ID3v23FieldKey("LYRICIST_SORT", 69, "TXXX", "LYRICIST_SORT", id3FieldType);
    UNSYNC_LYRICS = new ID3v23FieldKey("UNSYNC_LYRICS", 70, "USLT", id3FieldType);
    MEDIA = new ID3v23FieldKey("MEDIA", 71, "TMED", id3FieldType);
    MIXER = new ID3v23FieldKey("MIXER", 72, "TXXX", "MIXER", id3FieldType);
    MIXER_SORT = new ID3v23FieldKey("MIXER_SORT", 73, "TXXX", "MIXER_SORT", id3FieldType);
    MIXER_INVOLVEDPEOLE = new ID3v23FieldKey("MIXER_INVOLVEDPEOLE", 74, "IPLS", StandardIPLSKey.MIXER.getKey(), id3FieldType);
    MOOD = new ID3v23FieldKey("MOOD", 75, "TXXX", "MOOD", id3FieldType);
    MOOD_ACOUSTIC = new ID3v23FieldKey("MOOD_ACOUSTIC", 76, "TXXX", "MOOD_ACOUSTIC", id3FieldType);
    MOOD_AGGRESSIVE = new ID3v23FieldKey(PwbbJfsdcHrAjW.WMpOLGZoMZfQG, 77, "TXXX", "MOOD_AGGRESSIVE", id3FieldType);
    MOOD_AROUSAL = new ID3v23FieldKey("MOOD_AROUSAL", 78, "TXXX", "MOOD_AROUSAL", id3FieldType);
    MOOD_DANCEABILITY = new ID3v23FieldKey("MOOD_DANCEABILITY", 79, "TXXX", "MOOD_DANCEABILITY", id3FieldType);
    MOOD_ELECTRONIC = new ID3v23FieldKey("MOOD_ELECTRONIC", 80, "TXXX", "MOOD_ELECTRONIC", id3FieldType);
    MOOD_HAPPY = new ID3v23FieldKey("MOOD_HAPPY", 81, "TXXX", "MOOD_HAPPY", id3FieldType);
    MOOD_INSTRUMENTAL = new ID3v23FieldKey("MOOD_INSTRUMENTAL", 82, "TXXX", "MOOD_INSTRUMENTAL", id3FieldType);
    MOOD_PARTY = new ID3v23FieldKey("MOOD_PARTY", 83, "TXXX", "MOOD_PARTY", id3FieldType);
    MOOD_RELAXED = new ID3v23FieldKey("MOOD_RELAXED", 84, "TXXX", "MOOD_RELAXED", id3FieldType);
    MOOD_SAD = new ID3v23FieldKey("MOOD_SAD", 85, "TXXX", "MOOD_SAD", id3FieldType);
    MOOD_VALENCE = new ID3v23FieldKey("MOOD_VALENCE", 86, "TXXX", "MOOD_VALENCE", id3FieldType);
    MOVEMENT = new ID3v23FieldKey("MOVEMENT", 87, "MVNM", id3FieldType);
    MOVEMENT_NO = new ID3v23FieldKey("MOVEMENT_NO", 88, "MVIN", id3FieldType);
    MOVEMENT_TOTAL = new ID3v23FieldKey(OETETTfAjV.jekD, 89, "MVIN", id3FieldType);
    MUSICBRAINZ_ARTISTID = new ID3v23FieldKey("MUSICBRAINZ_ARTISTID", 90, "TXXX", AyxAR.rUdbyFixTcq, id3FieldType);
    MUSICBRAINZ_DISC_ID = new ID3v23FieldKey("MUSICBRAINZ_DISC_ID", 91, xveccWbRzqx.MAJQuD, "MusicBrainz Disc Id", id3FieldType);
    MUSICBRAINZ_ORIGINAL_RELEASEID = new ID3v23FieldKey("MUSICBRAINZ_ORIGINAL_RELEASEID", 92, "TXXX", "MusicBrainz Original Album Id", id3FieldType);
    MUSICBRAINZ_RELEASEARTISTID = new ID3v23FieldKey("MUSICBRAINZ_RELEASEARTISTID", 93, "TXXX", "MusicBrainz Album Artist Id", id3FieldType);
    MUSICBRAINZ_RELEASEID = new ID3v23FieldKey("MUSICBRAINZ_RELEASEID", 94, "TXXX", "MusicBrainz Album Id", id3FieldType);
    MUSICBRAINZ_RELEASE_COUNTRY = new ID3v23FieldKey("MUSICBRAINZ_RELEASE_COUNTRY", 95, nBRIsU.gwJDIIaL, "MusicBrainz Album Release Country", id3FieldType);
    MUSICBRAINZ_RELEASE_GROUP_ID = new ID3v23FieldKey("MUSICBRAINZ_RELEASE_GROUP_ID", 96, "TXXX", "MusicBrainz Release Group Id", id3FieldType);
    MUSICBRAINZ_RELEASE_STATUS = new ID3v23FieldKey("MUSICBRAINZ_RELEASE_STATUS", 97, "TXXX", "MusicBrainz Album Status", id3FieldType);
    MUSICBRAINZ_RELEASE_TRACK_ID = new ID3v23FieldKey("MUSICBRAINZ_RELEASE_TRACK_ID", 98, "TXXX", "MusicBrainz Release Track Id", id3FieldType);
    MUSICBRAINZ_RELEASE_TYPE = new ID3v23FieldKey("MUSICBRAINZ_RELEASE_TYPE", 99, "TXXX", "MusicBrainz Album Type", id3FieldType);
    MUSICBRAINZ_TRACK_ID = new ID3v23FieldKey("MUSICBRAINZ_TRACK_ID", 100, "UFID", "http://musicbrainz.org", id3FieldType);
    MUSICBRAINZ_RECORDING_WORK = new ID3v23FieldKey(fXMDNeMWaILNVh.CJgqukxYZZoqG, 101, "TXXX", "MUSICBRAINZ_RECORDING_WORK", id3FieldType);
    MUSICBRAINZ_RECORDING_WORK_ID = new ID3v23FieldKey("MUSICBRAINZ_RECORDING_WORK_ID", 102, "TXXX", "MUSICBRAINZ_RECORDING_WORK_ID", id3FieldType);
    MUSICBRAINZ_WORK_ID = new ID3v23FieldKey(eRUgfgGAccgka.sHD, 103, "TXXX", "MusicBrainz Work Id", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL1_ID = new ID3v23FieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_ID", 104, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL2_ID = new ID3v23FieldKey("MUSICBRAINZ_WORK_PART_LEVEL2_ID", 105, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL3_ID = new ID3v23FieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_ID", 106, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL4_ID = new ID3v23FieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_ID", 107, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL4_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL5_ID = new ID3v23FieldKey(nFLlOYeP.qqUTmUIWpKt, 108, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL5_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL6_ID = new ID3v23FieldKey("MUSICBRAINZ_WORK_PART_LEVEL6_ID", 109, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6_ID", id3FieldType);
    MUSICIP_ID = new ID3v23FieldKey("MUSICIP_ID", 110, "TXXX", "MusicIP PUID", id3FieldType);
    OCCASION = new ID3v23FieldKey("OCCASION", 111, "COMM", "Songs-DB_Occasion", id3FieldType);
    OPUS = new ID3v23FieldKey("OPUS", 112, "TXXX", "OPUS", id3FieldType);
    ORCHESTRA = new ID3v23FieldKey("ORCHESTRA", 113, "TXXX", "ORCHESTRA", id3FieldType);
    ORCHESTRA_SORT = new ID3v23FieldKey("ORCHESTRA_SORT", 114, "TXXX", "ORCHESTRA_SORT", id3FieldType);
    ORIGINAL_ALBUM = new ID3v23FieldKey("ORIGINAL_ALBUM", 115, "TOAL", id3FieldType);
    ORIGINALRELEASEDATE = new ID3v23FieldKey("ORIGINALRELEASEDATE", 116, "TXXX", "ORIGINALRELEASEDATE", id3FieldType);
    ORIGINAL_ARTIST = new ID3v23FieldKey("ORIGINAL_ARTIST", 117, "TOPE", id3FieldType);
    ORIGINAL_LYRICIST = new ID3v23FieldKey("ORIGINAL_LYRICIST", 118, "TOLY", id3FieldType);
    OVERALL_WORK = new ID3v23FieldKey("OVERALL_WORK", 119, "TXXX", "OVERALL_WORK", id3FieldType);
    ORIGINAL_YEAR = new ID3v23FieldKey("ORIGINAL_YEAR", 120, "TORY", id3FieldType);
    PART = new ID3v23FieldKey("PART", 121, "TXXX", "PART", id3FieldType);
    PART_NUMBER = new ID3v23FieldKey("PART_NUMBER", 122, "TXXX", "PARTNUMBER", id3FieldType);
    PART_TYPE = new ID3v23FieldKey("PART_TYPE", 123, "TXXX", "PART_TYPE", id3FieldType);
    PERFORMER = new ID3v23FieldKey("PERFORMER", 124, "TXXX", "PERFORMER", id3FieldType);
    PERFORMER_NAME = new ID3v23FieldKey("PERFORMER_NAME", 125, jHxlGgUTadw.LWiMn, "PERFORMER_NAME", id3FieldType);
    PERFORMER_NAME_SORT = new ID3v23FieldKey("PERFORMER_NAME_SORT", 126, "TXXX", "PERFORMER_NAME_SORT", id3FieldType);
    PERIOD = new ID3v23FieldKey("PERIOD", 127, "TXXX", "PERIOD", id3FieldType);
    PRODUCER = new ID3v23FieldKey("PRODUCER", 128, "TXXX", "PRODUCER", id3FieldType);
    PRODUCER_SORT = new ID3v23FieldKey("PRODUCER_SORT", 129, "TXXX", "PRODUCER_SORT", id3FieldType);
    PRODUCER_INVOLVEDPEOPLE = new ID3v23FieldKey("PRODUCER_INVOLVEDPEOPLE", 130, "IPLS", StandardIPLSKey.PRODUCER.getKey(), id3FieldType);
    QUALITY = new ID3v23FieldKey("QUALITY", 131, "COMM", "Songs-DB_Preference", id3FieldType);
    RANKING = new ID3v23FieldKey("RANKING", 132, "TXXX", "RANKING", id3FieldType);
    RATING = new ID3v23FieldKey("RATING", 133, "POPM", id3FieldType);
    RECORD_LABEL = new ID3v23FieldKey("RECORD_LABEL", 134, "TPUB", id3FieldType);
    RECORDINGDATE = new ID3v23FieldKey("RECORDINGDATE", 135, "TXXX", "RECORDINGDATE", id3FieldType);
    RECORDINGSTARTDATE = new ID3v23FieldKey("RECORDINGSTARTDATE", 136, "TXXX", fXMDNeMWaILNVh.BlJPT, id3FieldType);
    RECORDINGENDDATE = new ID3v23FieldKey("RECORDINGENDDATE", 137, "TXXX", "RECORDINGENDDATE", id3FieldType);
    RECORDINGLOCATION = new ID3v23FieldKey(KjdXPYm.ujRI, 138, "TXXX", "RECORDINGLOCATION", id3FieldType);
    REMIXER = new ID3v23FieldKey("REMIXER", 139, "TPE4", id3FieldType);
    ROONALBUMTAG = new ID3v23FieldKey("ROONALBUMTAG", 140, "TXXX", "ROONALBUMTAG", id3FieldType);
    ROONTRACKTAG = new ID3v23FieldKey("ROONTRACKTAG", 141, "TXXX", "ROONTRACKTAG", id3FieldType);
    SCRIPT = new ID3v23FieldKey("SCRIPT", 142, "TXXX", "SCRIPT", id3FieldType);
    SECTION = new ID3v23FieldKey("SECTION", 143, "TXXX", "SECTION", id3FieldType);
    SINGLE_DISC_TRACK_NO = new ID3v23FieldKey("SINGLE_DISC_TRACK_NO", 144, "TXXX", "SINGLE_DISC_TRACK_NO", id3FieldType);
    SONGKONG_ID = new ID3v23FieldKey("SONGKONG_ID", 145, "TXXX", "SONGKONG_ID", id3FieldType);
    SUBTITLE = new ID3v23FieldKey("SUBTITLE", 146, "TIT3", id3FieldType);
    TAGS = new ID3v23FieldKey("TAGS", 147, "TXXX", "TAGS", id3FieldType);
    TEMPO = new ID3v23FieldKey("TEMPO", 148, "COMM", "Songs-DB_Tempo", id3FieldType);
    TIMBRE = new ID3v23FieldKey("TIMBRE", 149, "TXXX", "TIMBRE_BRIGHTNESS", id3FieldType);
    TITLE = new ID3v23FieldKey("TITLE", 150, "TIT2", id3FieldType);
    TITLE_MOVEMENT = new ID3v23FieldKey("TITLE_MOVEMENT", 151, "TXXX", "TITLE_MOVEMENT", id3FieldType);
    MUSICBRAINZ_WORK = new ID3v23FieldKey("MUSICBRAINZ_WORK", 152, "TXXX", "MUSICBRAINZ_WORK", id3FieldType);
    TITLE_SORT = new ID3v23FieldKey("TITLE_SORT", 153, "TSOT", id3FieldType);
    TONALITY = new ID3v23FieldKey("TONALITY", 154, "TXXX", "TONALITY", id3FieldType);
    TRACK = new ID3v23FieldKey("TRACK", 155, "TRCK", id3FieldType);
    TRACK_TOTAL = new ID3v23FieldKey("TRACK_TOTAL", 156, "TRCK", id3FieldType);
    URL_DISCOGS_ARTIST_SITE = new ID3v23FieldKey("URL_DISCOGS_ARTIST_SITE", 157, "WXXX", nFLlOYeP.pzbkMX, id3FieldType);
    URL_DISCOGS_RELEASE_SITE = new ID3v23FieldKey("URL_DISCOGS_RELEASE_SITE", 158, "WXXX", "DISCOGS_RELEASE", id3FieldType);
    URL_LYRICS_SITE = new ID3v23FieldKey("URL_LYRICS_SITE", 159, "WXXX", "LYRICS_SITE", id3FieldType);
    URL_OFFICIAL_ARTIST_SITE = new ID3v23FieldKey("URL_OFFICIAL_ARTIST_SITE", 160, "WOAR", id3FieldType);
    URL_OFFICIAL_RELEASE_SITE = new ID3v23FieldKey("URL_OFFICIAL_RELEASE_SITE", 161, "WXXX", "OFFICIAL_RELEASE", id3FieldType);
    URL_WIKIPEDIA_ARTIST_SITE = new ID3v23FieldKey("URL_WIKIPEDIA_ARTIST_SITE", 162, "WXXX", "WIKIPEDIA_ARTIST", id3FieldType);
    URL_WIKIPEDIA_RELEASE_SITE = new ID3v23FieldKey("URL_WIKIPEDIA_RELEASE_SITE", 163, "WXXX", "WIKIPEDIA_RELEASE", id3FieldType);
    WORK = new ID3v23FieldKey("WORK", 164, "TXXX", "WORK", id3FieldType);
    WORK_PART_LEVEL1 = new ID3v23FieldKey("WORK_PART_LEVEL1", 165, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1", id3FieldType);
    WORK_PART_LEVEL1_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL1_TYPE", 166, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", id3FieldType);
    WORK_PART_LEVEL2 = new ID3v23FieldKey("WORK_PART_LEVEL2", 167, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2", id3FieldType);
    WORK_PART_LEVEL2_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL2_TYPE", 168, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", id3FieldType);
    WORK_PART_LEVEL3 = new ID3v23FieldKey(zLtYiJUm.HVXVbzfwoKagn, 169, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3", id3FieldType);
    WORK_PART_LEVEL3_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL3_TYPE", 170, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", id3FieldType);
    WORK_PART_LEVEL4 = new ID3v23FieldKey("WORK_PART_LEVEL4", 171, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL4", id3FieldType);
    WORK_PART_LEVEL4_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL4_TYPE", 172, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", id3FieldType);
    WORK_PART_LEVEL5 = new ID3v23FieldKey("WORK_PART_LEVEL5", 173, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL5", id3FieldType);
    WORK_PART_LEVEL5_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL5_TYPE", 174, XUaAMlaMSa.NhjU, "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", id3FieldType);
    WORK_PART_LEVEL6 = new ID3v23FieldKey("WORK_PART_LEVEL6", 175, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6", id3FieldType);
    WORK_PART_LEVEL6_TYPE = new ID3v23FieldKey("WORK_PART_LEVEL6_TYPE", 176, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE", id3FieldType);
    WORK_TYPE = new ID3v23FieldKey("WORK_TYPE", 177, "TXXX", "WORK_TYPE", id3FieldType);
    VERSION = new ID3v23FieldKey("VERSION", 178, "TXXX", "VERSION", id3FieldType);
    YEAR = new ID3v23FieldKey("YEAR", 179, "TYER", id3FieldType);
    $VALUES = $values();
  }
  
  ID3v23FieldKey(String paramString1, String paramString2, Id3FieldType paramId3FieldType) {
    this.frameId = paramString1;
    this.subId = paramString2;
    this.fieldType = paramId3FieldType;
    this.fieldName = x41.l(paramString1, ":", paramString2);
  }
  
  ID3v23FieldKey(String paramString1, Id3FieldType paramId3FieldType) {
    this.frameId = paramString1;
    this.fieldType = paramId3FieldType;
    this.fieldName = paramString1;
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
  
  public Id3FieldType getFieldType() {
    return this.fieldType;
  }
  
  public String getFrameId() {
    return this.frameId;
  }
  
  public String getSubId() {
    return this.subId;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v23FieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */