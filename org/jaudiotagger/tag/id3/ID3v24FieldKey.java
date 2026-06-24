package org.jaudiotagger.tag.id3;

import android.window.ldG.XUaAMlaMSa;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.tabs.xm.VDgS;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.jaudiotagger.tag.id3.valuepair.StandardIPLSKey;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import r3.IKWi.AyxAR;
import x41;

public enum ID3v24FieldKey {
  ACOUSTID_FINGERPRINT, ACOUSTID_ID, ALBUM, ALBUM_ARTIST, ALBUM_ARTISTS, ALBUM_ARTISTS_SORT, ALBUM_ARTIST_SORT, ALBUM_SORT, ALBUM_YEAR, AMAZON_ID, ARRANGER, ARRANGER_INVOLVEDPEOPLE, ARRANGER_SORT, ARTIST, ARTISTS, ARTISTS_SORT, ARTIST_SORT, BARCODE, BPM, CATALOG_NO, CHOIR, CHOIR_SORT, CLASSICAL_CATALOG, CLASSICAL_NICKNAME, COMMENT, COMPOSER, COMPOSER_SORT, CONDUCTOR, CONDUCTOR_SORT, COPYRIGHT, COUNTRY, COVER_ART, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, DISC_NO, DISC_SUBTITLE, DISC_TOTAL, DJMIXER, DJMIXER_INVOLVEDPEOPLE, DJMIXER_SORT, ENCODER, ENGINEER, ENGINEER_INVOLVEDPEOPLE, ENGINEER_SORT, ENSEMBLE, ENSEMBLE_SORT, FBPM, GENRE, GROUP, GROUPING, INSTRUMENT, INVOLVED_PEOPLE, IPI, ISRC, ISWC, IS_CLASSICAL, IS_COMPILATION, IS_GREATEST_HITS, IS_HD, IS_LIVE, IS_SOUNDTRACK, ITUNES_GROUPING, JAIKOZ_ID, KEY, LANGUAGE, LYRICIST, LYRICIST_SORT, MEDIA, MIXER, MIXER_INVOLVEDPEOPLE, MIXER_SORT, MOOD, MOOD_ACOUSTIC, MOOD_AGGRESSIVE, MOOD_AROUSAL, MOOD_DANCEABILITY, MOOD_ELECTRONIC, MOOD_HAPPY, MOOD_INSTRUMENTAL, MOOD_PARTY, MOOD_RELAXED, MOOD_SAD, MOOD_VALENCE, MOVEMENT, MOVEMENT_NO, MOVEMENT_TOTAL, MUSICBRAINZ_ARTISTID, MUSICBRAINZ_DISC_ID, MUSICBRAINZ_ORIGINAL_RELEASEID, MUSICBRAINZ_RECORDING_WORK, MUSICBRAINZ_RECORDING_WORK_ID, MUSICBRAINZ_RELEASEARTISTID, MUSICBRAINZ_RELEASEID, MUSICBRAINZ_RELEASE_COUNTRY, MUSICBRAINZ_RELEASE_GROUP_ID, MUSICBRAINZ_RELEASE_STATUS, MUSICBRAINZ_RELEASE_TRACK_ID, MUSICBRAINZ_RELEASE_TYPE, MUSICBRAINZ_TRACK_ID, MUSICBRAINZ_WORK, MUSICBRAINZ_WORK_ID, MUSICBRAINZ_WORK_PART_LEVEL1_ID, MUSICBRAINZ_WORK_PART_LEVEL2_ID, MUSICBRAINZ_WORK_PART_LEVEL3_ID, MUSICBRAINZ_WORK_PART_LEVEL4_ID, MUSICBRAINZ_WORK_PART_LEVEL5_ID, MUSICBRAINZ_WORK_PART_LEVEL6_ID, MUSICIANS, MUSICIP_ID, OCCASION, OPUS, ORCHESTRA, ORCHESTRA_SORT, ORIGINALRELEASEDATE, ORIGINAL_ALBUM, ORIGINAL_ARTIST, ORIGINAL_LYRICIST, ORIGINAL_YEAR, OVERALL_WORK, PART, PART_NUMBER, PART_TYPE, PERFORMER, PERFORMER_NAME, PERFORMER_NAME_SORT, PERIOD, PRODUCER, PRODUCER_INVOLVEDPEOPLE, PRODUCER_SORT, QUALITY, RANKING, RATING, RECORDINGDATE, RECORDINGENDDATE, RECORDINGLOCATION, RECORDINGSTARTDATE, RECORD_LABEL, REMIXER, ROONALBUMTAG, ROONTRACKTAG, SCRIPT, SECTION, SINGLE_DISC_TRACK_NO, SONGKONG_ID, SUBTITLE, TAGS, TEMPO, TIMBRE, TITLE, TITLE_MOVEMENT, TITLE_SORT, TONALITY, TRACK, TRACK_TOTAL, UNSYNC_LYRICS, URL_DISCOGS_ARTIST_SITE, URL_DISCOGS_RELEASE_SITE, URL_LYRICS_SITE, URL_OFFICIAL_ARTIST_SITE, URL_OFFICIAL_RELEASE_SITE, URL_WIKIPEDIA_ARTIST_SITE, URL_WIKIPEDIA_RELEASE_SITE, VERSION, WORK, WORK_PARTOF_LEVEL3_TYPE, WORK_PART_LEVEL1, WORK_PART_LEVEL1_TYPE, WORK_PART_LEVEL2, WORK_PART_LEVEL2_TYPE, WORK_PART_LEVEL3, WORK_PART_LEVEL4, WORK_PART_LEVEL4_TYPE, WORK_PART_LEVEL5, WORK_PART_LEVEL5_TYPE, WORK_PART_LEVEL6, WORK_PART_LEVEL6_TYPE, WORK_TYPE, YEAR;
  
  private static final ID3v24FieldKey[] $VALUES;
  
  private String fieldName;
  
  private Id3FieldType fieldType;
  
  private String frameId;
  
  private String subId;
  
  static {
    Id3FieldType id3FieldType = Id3FieldType.TEXT;
    ACOUSTID_FINGERPRINT = new ID3v24FieldKey("ACOUSTID_FINGERPRINT", 0, "TXXX", "Acoustid Fingerprint", id3FieldType);
    ACOUSTID_ID = new ID3v24FieldKey("ACOUSTID_ID", 1, "TXXX", "Acoustid Id", id3FieldType);
    ALBUM = new ID3v24FieldKey("ALBUM", 2, "TALB", id3FieldType);
    ALBUM_ARTIST = new ID3v24FieldKey("ALBUM_ARTIST", 3, "TPE2", id3FieldType);
    ALBUM_ARTIST_SORT = new ID3v24FieldKey(zpEN.uGCUqaUNUQXT, 4, "TSO2", id3FieldType);
    ALBUM_ARTISTS = new ID3v24FieldKey("ALBUM_ARTISTS", 5, "TXXX", "ALBUM_ARTISTS", id3FieldType);
    ALBUM_ARTISTS_SORT = new ID3v24FieldKey("ALBUM_ARTISTS_SORT", 6, "TXXX", "ALBUM_ARTISTS_SORT", id3FieldType);
    ALBUM_SORT = new ID3v24FieldKey("ALBUM_SORT", 7, "TSOA", id3FieldType);
    ALBUM_YEAR = new ID3v24FieldKey("ALBUM_YEAR", 8, "TXXX", "ALBUM_YEAR", id3FieldType);
    AMAZON_ID = new ID3v24FieldKey("AMAZON_ID", 9, "TXXX", "ASIN", id3FieldType);
    ARRANGER = new ID3v24FieldKey("ARRANGER", 10, "TXXX", "ARRANGER", id3FieldType);
    ARRANGER_SORT = new ID3v24FieldKey("ARRANGER_SORT", 11, "TXXX", "ARRANGER_SORT", id3FieldType);
    ARRANGER_INVOLVEDPEOPLE = new ID3v24FieldKey("ARRANGER_INVOLVEDPEOPLE", 12, "TIPL", StandardIPLSKey.ARRANGER.getKey(), id3FieldType);
    ARTIST = new ID3v24FieldKey("ARTIST", 13, "TPE1", id3FieldType);
    ARTISTS = new ID3v24FieldKey("ARTISTS", 14, "TXXX", "ARTISTS", id3FieldType);
    ARTISTS_SORT = new ID3v24FieldKey("ARTISTS_SORT", 15, "TXXX", "ARTISTS_SORT", id3FieldType);
    ARTIST_SORT = new ID3v24FieldKey("ARTIST_SORT", 16, "TSOP", id3FieldType);
    BARCODE = new ID3v24FieldKey("BARCODE", 17, "TXXX", "BARCODE", id3FieldType);
    BPM = new ID3v24FieldKey("BPM", 18, "TBPM", id3FieldType);
    CATALOG_NO = new ID3v24FieldKey("CATALOG_NO", 19, "TXXX", "CATALOGNUMBER", id3FieldType);
    CHOIR = new ID3v24FieldKey("CHOIR", 20, "TXXX", "CHOIR", id3FieldType);
    CHOIR_SORT = new ID3v24FieldKey("CHOIR_SORT", 21, "TXXX", "CHOIR_SORT", id3FieldType);
    CLASSICAL_CATALOG = new ID3v24FieldKey("CLASSICAL_CATALOG", 22, "TXXX", "CLASSICAL_CATALOG", id3FieldType);
    CLASSICAL_NICKNAME = new ID3v24FieldKey("CLASSICAL_NICKNAME", 23, "TXXX", "CLASSICAL_NICKNAME", id3FieldType);
    COMMENT = new ID3v24FieldKey("COMMENT", 24, "COMM", id3FieldType);
    COMPOSER = new ID3v24FieldKey("COMPOSER", 25, "TCOM", id3FieldType);
    COMPOSER_SORT = new ID3v24FieldKey("COMPOSER_SORT", 26, "TSOC", id3FieldType);
    CONDUCTOR = new ID3v24FieldKey("CONDUCTOR", 27, "TPE3", id3FieldType);
    CONDUCTOR_SORT = new ID3v24FieldKey("CONDUCTOR_SORT", 28, "TXXX", hrSTyFuSIm.nPRbMoxM, id3FieldType);
    COPYRIGHT = new ID3v24FieldKey("COPYRIGHT", 29, "TCOP", id3FieldType);
    COUNTRY = new ID3v24FieldKey("COUNTRY", 30, "TXXX", "Country", id3FieldType);
    COVER_ART = new ID3v24FieldKey("COVER_ART", 31, "APIC", Id3FieldType.BINARY);
    CUSTOM1 = new ID3v24FieldKey("CUSTOM1", 32, "COMM", "Songs-DB_Custom1", id3FieldType);
    CUSTOM2 = new ID3v24FieldKey("CUSTOM2", 33, "COMM", "Songs-DB_Custom2", id3FieldType);
    CUSTOM3 = new ID3v24FieldKey("CUSTOM3", 34, "COMM", "Songs-DB_Custom3", id3FieldType);
    CUSTOM4 = new ID3v24FieldKey("CUSTOM4", 35, "COMM", "Songs-DB_Custom4", id3FieldType);
    CUSTOM5 = new ID3v24FieldKey("CUSTOM5", 36, "COMM", "Songs-DB_Custom5", id3FieldType);
    DISC_NO = new ID3v24FieldKey("DISC_NO", 37, "TPOS", id3FieldType);
    DISC_SUBTITLE = new ID3v24FieldKey("DISC_SUBTITLE", 38, "TSST", id3FieldType);
    DISC_TOTAL = new ID3v24FieldKey("DISC_TOTAL", 39, "TPOS", id3FieldType);
    DJMIXER = new ID3v24FieldKey("DJMIXER", 40, "TXXX", "DJMIXER", id3FieldType);
    DJMIXER_SORT = new ID3v24FieldKey("DJMIXER_SORT", 41, "TXXX", "DJMIXER_SORT", id3FieldType);
    DJMIXER_INVOLVEDPEOPLE = new ID3v24FieldKey("DJMIXER_INVOLVEDPEOPLE", 42, "TIPL", StandardIPLSKey.DJMIXER.getKey(), id3FieldType);
    ENCODER = new ID3v24FieldKey("ENCODER", 43, "TENC", id3FieldType);
    ENGINEER = new ID3v24FieldKey("ENGINEER", 44, "TXXX", "ENGINEER", id3FieldType);
    ENGINEER_SORT = new ID3v24FieldKey("ENGINEER_SORT", 45, "TXXX", "ENGINEER_SORT", id3FieldType);
    String str = StandardIPLSKey.ENGINEER.getKey();
    ENGINEER_INVOLVEDPEOPLE = new ID3v24FieldKey(fXMDNeMWaILNVh.DtiwyBq, 46, "TIPL", str, id3FieldType);
    ENSEMBLE = new ID3v24FieldKey("ENSEMBLE", 47, "TXXX", "ENSEMBLE", id3FieldType);
    ENSEMBLE_SORT = new ID3v24FieldKey("ENSEMBLE_SORT", 48, "TXXX", "ENSEMBLE_SORT", id3FieldType);
    FBPM = new ID3v24FieldKey("FBPM", 49, "TXXX", "FBPM", id3FieldType);
    GENRE = new ID3v24FieldKey("GENRE", 50, "TCON", id3FieldType);
    GROUP = new ID3v24FieldKey("GROUP", 51, "TXXX", "GROUP", id3FieldType);
    GROUPING = new ID3v24FieldKey("GROUPING", 52, "TIT1", id3FieldType);
    INVOLVED_PEOPLE = new ID3v24FieldKey(LHyji.sMqaAEDgPQHMhY, 53, "TIPL", id3FieldType);
    INSTRUMENT = new ID3v24FieldKey("INSTRUMENT", 54, "TXXX", "INSTRUMENT", id3FieldType);
    IPI = new ID3v24FieldKey("IPI", 55, "TXXX", "IPI", id3FieldType);
    ISRC = new ID3v24FieldKey("ISRC", 56, "TSRC", id3FieldType);
    ISWC = new ID3v24FieldKey("ISWC", 57, "TXXX", "ISWC", id3FieldType);
    IS_CLASSICAL = new ID3v24FieldKey("IS_CLASSICAL", 58, "TXXX", "IS_CLASSICAL", id3FieldType);
    IS_COMPILATION = new ID3v24FieldKey("IS_COMPILATION", 59, "TCMP", id3FieldType);
    IS_GREATEST_HITS = new ID3v24FieldKey("IS_GREATEST_HITS", 60, "TXXX", "IS_GREATEST_HITS", id3FieldType);
    IS_HD = new ID3v24FieldKey("IS_HD", 61, "TXXX", "IS_HD", id3FieldType);
    IS_LIVE = new ID3v24FieldKey("IS_LIVE", 62, "TXXX", "LIVE", id3FieldType);
    IS_SOUNDTRACK = new ID3v24FieldKey("IS_SOUNDTRACK", 63, "TXXX", "IS_SOUNDTRACK", id3FieldType);
    ITUNES_GROUPING = new ID3v24FieldKey("ITUNES_GROUPING", 64, "GRP1", id3FieldType);
    JAIKOZ_ID = new ID3v24FieldKey("JAIKOZ_ID", 65, "TXXX", "JAIKOZ_ID", id3FieldType);
    KEY = new ID3v24FieldKey("KEY", 66, "TKEY", id3FieldType);
    LANGUAGE = new ID3v24FieldKey("LANGUAGE", 67, "TLAN", id3FieldType);
    LYRICIST = new ID3v24FieldKey("LYRICIST", 68, "TEXT", id3FieldType);
    LYRICIST_SORT = new ID3v24FieldKey("LYRICIST_SORT", 69, "TXXX", "LYRICIST_SORT", id3FieldType);
    UNSYNC_LYRICS = new ID3v24FieldKey("UNSYNC_LYRICS", 70, "USLT", id3FieldType);
    MEDIA = new ID3v24FieldKey("MEDIA", 71, "TMED", id3FieldType);
    MIXER = new ID3v24FieldKey("MIXER", 72, "TXXX", "MIXER", id3FieldType);
    MIXER_SORT = new ID3v24FieldKey("MIXER_SORT", 73, "TXXX", "MIXER_SORT", id3FieldType);
    MIXER_INVOLVEDPEOPLE = new ID3v24FieldKey("MIXER_INVOLVEDPEOPLE", 74, "TIPL", StandardIPLSKey.MIXER.getKey(), id3FieldType);
    MOOD = new ID3v24FieldKey("MOOD", 75, "TMOO", id3FieldType);
    MOOD_ACOUSTIC = new ID3v24FieldKey("MOOD_ACOUSTIC", 76, "TXXX", uvJYmft.DkymazcDNK, id3FieldType);
    MOOD_AGGRESSIVE = new ID3v24FieldKey("MOOD_AGGRESSIVE", 77, "TXXX", "MOOD_AGGRESSIVE", id3FieldType);
    MOOD_AROUSAL = new ID3v24FieldKey("MOOD_AROUSAL", 78, "TXXX", "MOOD_AROUSAL", id3FieldType);
    MOOD_DANCEABILITY = new ID3v24FieldKey("MOOD_DANCEABILITY", 79, "TXXX", "MOOD_DANCEABILITY", id3FieldType);
    MOOD_ELECTRONIC = new ID3v24FieldKey("MOOD_ELECTRONIC", 80, "TXXX", VDgS.GhiHAnjFYK, id3FieldType);
    MOOD_HAPPY = new ID3v24FieldKey("MOOD_HAPPY", 81, "TXXX", "MOOD_HAPPY", id3FieldType);
    MOOD_INSTRUMENTAL = new ID3v24FieldKey("MOOD_INSTRUMENTAL", 82, "TXXX", "MOOD_INSTRUMENTAL", id3FieldType);
    MOOD_PARTY = new ID3v24FieldKey("MOOD_PARTY", 83, "TXXX", "MOOD_PARTY", id3FieldType);
    MOOD_RELAXED = new ID3v24FieldKey("MOOD_RELAXED", 84, "TXXX", ybWnIKHovcRr.VIuPxlMprdkpB, id3FieldType);
    MOOD_SAD = new ID3v24FieldKey("MOOD_SAD", 85, "TXXX", "MOOD_SAD", id3FieldType);
    MOOD_VALENCE = new ID3v24FieldKey("MOOD_VALENCE", 86, "TXXX", "MOOD_VALENCE", id3FieldType);
    MOVEMENT = new ID3v24FieldKey("MOVEMENT", 87, "MVNM", id3FieldType);
    MOVEMENT_NO = new ID3v24FieldKey("MOVEMENT_NO", 88, "MVIN", id3FieldType);
    MOVEMENT_TOTAL = new ID3v24FieldKey("MOVEMENT_TOTAL", 89, "MVIN", id3FieldType);
    MUSICBRAINZ_ARTISTID = new ID3v24FieldKey("MUSICBRAINZ_ARTISTID", 90, "TXXX", "MusicBrainz Artist Id", id3FieldType);
    MUSICBRAINZ_DISC_ID = new ID3v24FieldKey("MUSICBRAINZ_DISC_ID", 91, "TXXX", "MusicBrainz Disc Id", id3FieldType);
    MUSICBRAINZ_ORIGINAL_RELEASEID = new ID3v24FieldKey("MUSICBRAINZ_ORIGINAL_RELEASEID", 92, "TXXX", "MusicBrainz Original Album Id", id3FieldType);
    MUSICBRAINZ_RELEASEARTISTID = new ID3v24FieldKey("MUSICBRAINZ_RELEASEARTISTID", 93, "TXXX", "MusicBrainz Album Artist Id", id3FieldType);
    MUSICBRAINZ_RELEASEID = new ID3v24FieldKey(nBRIsU.oGncMTACmT, 94, "TXXX", "MusicBrainz Album Id", id3FieldType);
    MUSICBRAINZ_RELEASE_COUNTRY = new ID3v24FieldKey("MUSICBRAINZ_RELEASE_COUNTRY", 95, "TXXX", "MusicBrainz Album Release Country", id3FieldType);
    MUSICBRAINZ_RELEASE_GROUP_ID = new ID3v24FieldKey("MUSICBRAINZ_RELEASE_GROUP_ID", 96, "TXXX", "MusicBrainz Release Group Id", id3FieldType);
    MUSICBRAINZ_RELEASE_STATUS = new ID3v24FieldKey("MUSICBRAINZ_RELEASE_STATUS", 97, FgdLmmRfTxSFKI.tJNEVnUGkejUC, "MusicBrainz Album Status", id3FieldType);
    MUSICBRAINZ_RELEASE_TRACK_ID = new ID3v24FieldKey("MUSICBRAINZ_RELEASE_TRACK_ID", 98, "TXXX", "MusicBrainz Release Track Id", id3FieldType);
    MUSICBRAINZ_RELEASE_TYPE = new ID3v24FieldKey("MUSICBRAINZ_RELEASE_TYPE", 99, "TXXX", "MusicBrainz Album Type", id3FieldType);
    MUSICBRAINZ_TRACK_ID = new ID3v24FieldKey("MUSICBRAINZ_TRACK_ID", 100, "UFID", "http://musicbrainz.org", id3FieldType);
    MUSICBRAINZ_RECORDING_WORK_ID = new ID3v24FieldKey("MUSICBRAINZ_RECORDING_WORK_ID", 101, "TXXX", "MUSICBRAINZ_RECORDING_WORK_ID", id3FieldType);
    MUSICBRAINZ_WORK_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_ID", 102, "TXXX", "MusicBrainz Work Id", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL1_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_ID", 103, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL2_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL2_ID", 104, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL3_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_ID", 105, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL4_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_ID", 106, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL4_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL5_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL5_ID", 107, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL5_ID", id3FieldType);
    MUSICBRAINZ_WORK_PART_LEVEL6_ID = new ID3v24FieldKey("MUSICBRAINZ_WORK_PART_LEVEL6_ID", 108, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6_ID", id3FieldType);
    MUSICIP_ID = new ID3v24FieldKey("MUSICIP_ID", 109, "TXXX", "MusicIP PUID", id3FieldType);
    OCCASION = new ID3v24FieldKey("OCCASION", 110, "COMM", "Songs-DB_Occasion", id3FieldType);
    OPUS = new ID3v24FieldKey("OPUS", 111, "TXXX", "OPUS", id3FieldType);
    ORCHESTRA = new ID3v24FieldKey("ORCHESTRA", 112, "TXXX", "ORCHESTRA", id3FieldType);
    ORCHESTRA_SORT = new ID3v24FieldKey("ORCHESTRA_SORT", 113, "TXXX", "ORCHESTRA_SORT", id3FieldType);
    ORIGINAL_ALBUM = new ID3v24FieldKey("ORIGINAL_ALBUM", 114, "TOAL", id3FieldType);
    ORIGINALRELEASEDATE = new ID3v24FieldKey("ORIGINALRELEASEDATE", 115, "TXXX", "ORIGINALRELEASEDATE", id3FieldType);
    ORIGINAL_ARTIST = new ID3v24FieldKey("ORIGINAL_ARTIST", 116, "TOPE", id3FieldType);
    ORIGINAL_LYRICIST = new ID3v24FieldKey("ORIGINAL_LYRICIST", 117, "TOLY", id3FieldType);
    ORIGINAL_YEAR = new ID3v24FieldKey("ORIGINAL_YEAR", 118, "TDOR", id3FieldType);
    OVERALL_WORK = new ID3v24FieldKey(GMDx.xGkZhTytQN, 119, "TXXX", "OVERALL_WORK", id3FieldType);
    PART = new ID3v24FieldKey(eRUgfgGAccgka.rbaOnSAqMGSH, 120, "TXXX", "PART", id3FieldType);
    PART_NUMBER = new ID3v24FieldKey("PART_NUMBER", 121, "TXXX", "PARTNUMBER", id3FieldType);
    PART_TYPE = new ID3v24FieldKey("PART_TYPE", 122, "TXXX", "PART_TYPE", id3FieldType);
    MUSICIANS = new ID3v24FieldKey("MUSICIANS", 123, "TMCL", id3FieldType);
    PERFORMER = new ID3v24FieldKey("PERFORMER", 124, "TXXX", "PERFORMER", id3FieldType);
    PERFORMER_NAME = new ID3v24FieldKey("PERFORMER_NAME", 125, "TXXX", "PERFORMER_NAME", id3FieldType);
    PERFORMER_NAME_SORT = new ID3v24FieldKey("PERFORMER_NAME_SORT", 126, "TXXX", tlzLOCPTHRhep.jiRnYghs, id3FieldType);
    PERIOD = new ID3v24FieldKey("PERIOD", 127, "TXXX", "PERIOD", id3FieldType);
    PRODUCER = new ID3v24FieldKey("PRODUCER", 128, "TXXX", "PRODUCER", id3FieldType);
    PRODUCER_SORT = new ID3v24FieldKey("PRODUCER_SORT", 129, "TXXX", "PRODUCER_SORT", id3FieldType);
    PRODUCER_INVOLVEDPEOPLE = new ID3v24FieldKey("PRODUCER_INVOLVEDPEOPLE", 130, "TIPL", StandardIPLSKey.PRODUCER.getKey(), id3FieldType);
    QUALITY = new ID3v24FieldKey("QUALITY", 131, "COMM", "Songs-DB_Preference", id3FieldType);
    RANKING = new ID3v24FieldKey("RANKING", 132, FgdLmmRfTxSFKI.hqrh, PwbbJfsdcHrAjW.sWCDFyRAMO, id3FieldType);
    RATING = new ID3v24FieldKey("RATING", 133, "POPM", id3FieldType);
    RECORD_LABEL = new ID3v24FieldKey("RECORD_LABEL", 134, "TPUB", id3FieldType);
    RECORDINGDATE = new ID3v24FieldKey("RECORDINGDATE", 135, "TXXX", "RECORDINGDATE", id3FieldType);
    RECORDINGSTARTDATE = new ID3v24FieldKey("RECORDINGSTARTDATE", 136, "TXXX", "RECORDINGSTARTDATE", id3FieldType);
    RECORDINGENDDATE = new ID3v24FieldKey("RECORDINGENDDATE", 137, kOkiWEITVb.AQVYsqRfuIbj, "RECORDINGENDDATE", id3FieldType);
    RECORDINGLOCATION = new ID3v24FieldKey("RECORDINGLOCATION", 138, "TXXX", "RECORDINGLOCATION", id3FieldType);
    REMIXER = new ID3v24FieldKey("REMIXER", 139, "TPE4", id3FieldType);
    ROONALBUMTAG = new ID3v24FieldKey("ROONALBUMTAG", 140, "TXXX", "ROONALBUMTAG", id3FieldType);
    ROONTRACKTAG = new ID3v24FieldKey("ROONTRACKTAG", 141, "TXXX", "ROONTRACKTAG", id3FieldType);
    SCRIPT = new ID3v24FieldKey("SCRIPT", 142, "TXXX", "SCRIPT", id3FieldType);
    SECTION = new ID3v24FieldKey("SECTION", 143, "TXXX", "SECTION", id3FieldType);
    SINGLE_DISC_TRACK_NO = new ID3v24FieldKey("SINGLE_DISC_TRACK_NO", 144, "TXXX", "SINGLE_DISC_TRACK_NO", id3FieldType);
    SONGKONG_ID = new ID3v24FieldKey("SONGKONG_ID", 145, "TXXX", "SONGKONG_ID", id3FieldType);
    SUBTITLE = new ID3v24FieldKey("SUBTITLE", 146, "TIT3", id3FieldType);
    TAGS = new ID3v24FieldKey(PwbbJfsdcHrAjW.fsaZDzRKMOnK, 147, "TXXX", "TAGS", id3FieldType);
    TEMPO = new ID3v24FieldKey("TEMPO", 148, "COMM", "Songs-DB_Tempo", id3FieldType);
    TIMBRE = new ID3v24FieldKey("TIMBRE", 149, "TXXX", AyxAR.gAsW, id3FieldType);
    TITLE = new ID3v24FieldKey("TITLE", 150, "TIT2", id3FieldType);
    TITLE_MOVEMENT = new ID3v24FieldKey("TITLE_MOVEMENT", 151, "TXXX", "TITLE_MOVEMENT", id3FieldType);
    MUSICBRAINZ_WORK = new ID3v24FieldKey("MUSICBRAINZ_WORK", 152, "TXXX", "MUSICBRAINZ_WORK", id3FieldType);
    TITLE_SORT = new ID3v24FieldKey("TITLE_SORT", 153, "TSOT", id3FieldType);
    TONALITY = new ID3v24FieldKey("TONALITY", 154, "TXXX", "TONALITY", id3FieldType);
    TRACK = new ID3v24FieldKey("TRACK", 155, "TRCK", id3FieldType);
    TRACK_TOTAL = new ID3v24FieldKey("TRACK_TOTAL", 156, "TRCK", id3FieldType);
    URL_DISCOGS_ARTIST_SITE = new ID3v24FieldKey("URL_DISCOGS_ARTIST_SITE", 157, "WXXX", "DISCOGS_ARTIST", id3FieldType);
    URL_DISCOGS_RELEASE_SITE = new ID3v24FieldKey("URL_DISCOGS_RELEASE_SITE", 158, "WXXX", "DISCOGS_RELEASE", id3FieldType);
    URL_LYRICS_SITE = new ID3v24FieldKey("URL_LYRICS_SITE", 159, "WXXX", "LYRICS_SITE", id3FieldType);
    URL_OFFICIAL_ARTIST_SITE = new ID3v24FieldKey("URL_OFFICIAL_ARTIST_SITE", 160, "WOAR", id3FieldType);
    URL_OFFICIAL_RELEASE_SITE = new ID3v24FieldKey(XUaAMlaMSa.IfGLSlxlNdb, 161, "WXXX", "OFFICIAL_RELEASE", id3FieldType);
    URL_WIKIPEDIA_ARTIST_SITE = new ID3v24FieldKey("URL_WIKIPEDIA_ARTIST_SITE", 162, "WXXX", "WIKIPEDIA_ARTIST", id3FieldType);
    URL_WIKIPEDIA_RELEASE_SITE = new ID3v24FieldKey("URL_WIKIPEDIA_RELEASE_SITE", 163, "WXXX", CKYHNesT.szcjwCcy, id3FieldType);
    VERSION = new ID3v24FieldKey("VERSION", 164, "TXXX", "VERSION", id3FieldType);
    WORK = new ID3v24FieldKey("WORK", 165, "TXXX", "WORK", id3FieldType);
    MUSICBRAINZ_RECORDING_WORK = new ID3v24FieldKey("MUSICBRAINZ_RECORDING_WORK", 166, "TXXX", "MUSICBRAINZ_RECORDING_WORK", id3FieldType);
    WORK_PARTOF_LEVEL3_TYPE = new ID3v24FieldKey("WORK_PARTOF_LEVEL3_TYPE", 167, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", id3FieldType);
    WORK_PART_LEVEL1 = new ID3v24FieldKey("WORK_PART_LEVEL1", 168, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1", id3FieldType);
    WORK_PART_LEVEL1_TYPE = new ID3v24FieldKey("WORK_PART_LEVEL1_TYPE", 169, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", id3FieldType);
    WORK_PART_LEVEL2 = new ID3v24FieldKey("WORK_PART_LEVEL2", 170, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2", id3FieldType);
    WORK_PART_LEVEL2_TYPE = new ID3v24FieldKey("WORK_PART_LEVEL2_TYPE", 171, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", id3FieldType);
    WORK_PART_LEVEL3 = new ID3v24FieldKey(YbNJ.PNbov, 172, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL3", id3FieldType);
    WORK_PART_LEVEL4 = new ID3v24FieldKey("WORK_PART_LEVEL4", 173, "TXXX", hbrAVtEa.pagCxIltDmD, id3FieldType);
    WORK_PART_LEVEL4_TYPE = new ID3v24FieldKey("WORK_PART_LEVEL4_TYPE", 174, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", id3FieldType);
    WORK_PART_LEVEL5 = new ID3v24FieldKey("WORK_PART_LEVEL5", 175, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL5", id3FieldType);
    WORK_PART_LEVEL5_TYPE = new ID3v24FieldKey("WORK_PART_LEVEL5_TYPE", 176, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", id3FieldType);
    WORK_PART_LEVEL6 = new ID3v24FieldKey("WORK_PART_LEVEL6", 177, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6", id3FieldType);
    WORK_PART_LEVEL6_TYPE = new ID3v24FieldKey("WORK_PART_LEVEL6_TYPE", 178, "TXXX", "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE", id3FieldType);
    WORK_TYPE = new ID3v24FieldKey(fXMDNeMWaILNVh.BBhNiek, 179, "TXXX", "WORK_TYPE", id3FieldType);
    YEAR = new ID3v24FieldKey("YEAR", 180, "TDRC", id3FieldType);
    $VALUES = $values();
  }
  
  ID3v24FieldKey(String paramString1, String paramString2, Id3FieldType paramId3FieldType) {
    this.frameId = paramString1;
    this.subId = paramString2;
    this.fieldType = paramId3FieldType;
    this.fieldName = x41.l(paramString1, ":", paramString2);
  }
  
  ID3v24FieldKey(String paramString1, Id3FieldType paramId3FieldType) {
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v24FieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */