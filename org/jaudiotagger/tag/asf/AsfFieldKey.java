package org.jaudiotagger.tag.asf;

import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.asf.data.ContainerType;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public enum AsfFieldKey {
  ACOUSTID_FINGERPRINT, ACOUSTID_FINGERPRINT_OLD, ACOUSTID_ID, ALBUM, ALBUM_ARTIST, ALBUM_ARTISTS, ALBUM_ARTISTS_SORT, ALBUM_ARTIST_SORT, ALBUM_SORT, ALBUM_YEAR, AMAZON_ID, ARRANGER, ARRANGER_SORT, ARTISTS, ARTISTS_SORT, ARTIST_SORT, AUTHOR, BANNER_IMAGE, BANNER_IMAGE_TYPE, BANNER_IMAGE_URL, BARCODE, BPM, CATALOG_NO, CATEGORY, CHOIR, CHOIR_SORT, CLASSICAL_CATALOG, CLASSICAL_NICKNAME, COMPOSER, COMPOSER_SORT, CONDUCTOR, CONDUCTOR_SORT, COPYRIGHT, COPYRIGHT_URL, COUNTRY, COVER_ART, COVER_ART_URL, CUSTOM, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, DESCRIPTION, DIRECTOR, DISC_NO, DISC_SUBTITLE, DISC_TOTAL, DJMIXER, DJMIXER_SORT, ENCODED_BY, ENCODER, ENGINEER, ENGINEER_SORT, ENSEMBLE, ENSEMBLE_SORT, FBPM, GENRE, GENRE_ID, GROUP, GROUPING, INITIAL_KEY, INSTRUMENT, INVOLVED_PERSON, IPI, ISRC, ISVBR, ISWC, IS_CLASSICAL, IS_COMPILATION, IS_GREATEST_HITS, IS_HD, IS_LIVE, IS_SOUNDTRACK, JAIKOZ_ID, LANGUAGE, LYRICIST, LYRICIST_SORT, LYRICS_SYNCHRONISED, LYRICS_UNSYNC, MEDIA, MIXER, MIXER_SORT, MM_RATING, MOOD, MOOD_ACOUSTIC, MOOD_AGGRESSIVE, MOOD_AROUSAL, MOOD_DANCEABILITY, MOOD_ELECTRONIC, MOOD_HAPPY, MOOD_INSTRUMENTAL, MOOD_PARTY, MOOD_RELAXED, MOOD_SAD, MOOD_VALENCE, MOVEMENT, MOVEMENT_NO, MOVEMENT_TOTAL, MUSICBRAINZ_ARTISTID, MUSICBRAINZ_DISC_ID, MUSICBRAINZ_ORIGINAL_RELEASEID, MUSICBRAINZ_RECORDING_WORK, MUSICBRAINZ_RECORDING_WORK_ID, MUSICBRAINZ_RELEASEARTISTID, MUSICBRAINZ_RELEASEGROUPID, MUSICBRAINZ_RELEASEID, MUSICBRAINZ_RELEASETRACKID, MUSICBRAINZ_RELEASE_COUNTRY, MUSICBRAINZ_RELEASE_STATUS, MUSICBRAINZ_RELEASE_TYPE, MUSICBRAINZ_TRACK_ID, MUSICBRAINZ_WORK, MUSICBRAINZ_WORKID, MUSICBRAINZ_WORK_PART_LEVEL1, MUSICBRAINZ_WORK_PART_LEVEL1_ID, MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, MUSICBRAINZ_WORK_PART_LEVEL2, MUSICBRAINZ_WORK_PART_LEVEL2_ID, MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, MUSICBRAINZ_WORK_PART_LEVEL3, MUSICBRAINZ_WORK_PART_LEVEL3_ID, MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, MUSICBRAINZ_WORK_PART_LEVEL4, MUSICBRAINZ_WORK_PART_LEVEL4_ID, MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, MUSICBRAINZ_WORK_PART_LEVEL5, MUSICBRAINZ_WORK_PART_LEVEL5_ID, MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, MUSICBRAINZ_WORK_PART_LEVEL6, MUSICBRAINZ_WORK_PART_LEVEL6_ID, MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, MUSICIP_ID, OCCASION, OPUS, ORCHESTRA, ORCHESTRA_SORT, ORIGINALRELEASEDATE, ORIGINAL_ALBUM, ORIGINAL_ARTIST, ORIGINAL_LYRICIST, ORIGINAL_YEAR, OVERALL_WORK, PART, PART_NUMBER, PART_TYPE, PERFORMER, PERFORMER_NAME, PERFORMER_NAME_SORT, PERIOD, PRODUCER, PRODUCER_SORT, QUALITY, RANKING, RATING, RECORDINGDATE, RECORDINGENDDATE, RECORDINGLOCATION, RECORDINGSTARTDATE, RECORD_LABEL, REMIXER, ROONALBUMTAG, ROONTRACKTAG, SCRIPT, SECTION, SINGLE_DISC_TRACK_NO, SONGKONG_ID, SUBTITLE, TAGS, TEMPO, TIMBRE, TITLE, TITLE_MOVEMENT, TITLE_SORT, TONALITY, TRACK, TRACK_TOTAL, URL_DISCOGS_ARTIST_SITE, URL_DISCOGS_RELEASE_SITE, URL_LYRICS_SITE, URL_OFFICIAL_ARTIST_SITE, URL_OFFICIAL_RELEASE_SITE, URL_PROMOTIONAL_SITE, URL_WIKIPEDIA_ARTIST_SITE, URL_WIKIPEDIA_RELEASE_SITE, USER_RATING, VERSION, WORK, WORK_TYPE, YEAR;
  
  private static final AsfFieldKey[] $VALUES;
  
  static final boolean $assertionsDisabled = false;
  
  private static final Map<String, AsfFieldKey> FIELD_ID_MAP;
  
  private final String fieldName;
  
  private final ContainerType highestContainer;
  
  private final ContainerType lowestContainer;
  
  private final boolean multiValued;
  
  static {
    ContainerType containerType = ContainerType.CONTENT_DESCRIPTION;
    AUTHOR = new AsfFieldKey("AUTHOR", 0, "AUTHOR", false, containerType);
    TITLE = new AsfFieldKey("TITLE", 1, "TITLE", false, containerType);
    RATING = new AsfFieldKey("RATING", 2, "RATING", false, containerType);
    COPYRIGHT = new AsfFieldKey("COPYRIGHT", 3, "COPYRIGHT", false, containerType);
    DESCRIPTION = new AsfFieldKey("DESCRIPTION", 4, "DESCRIPTION", false, containerType);
    containerType = ContainerType.CONTENT_BRANDING;
    BANNER_IMAGE = new AsfFieldKey("BANNER_IMAGE", 5, "BANNER_IMAGE", false, containerType);
    BANNER_IMAGE_TYPE = new AsfFieldKey("BANNER_IMAGE_TYPE", 6, "BANNER_IMAGE_TYPE", false, containerType);
    BANNER_IMAGE_URL = new AsfFieldKey("BANNER_IMAGE_URL", 7, "BANNER_IMAGE_URL", false, containerType);
    COPYRIGHT_URL = new AsfFieldKey("COPYRIGHT_URL", 8, "COPYRIGHT_URL", false, containerType);
    byte b = 0;
    ACOUSTID_FINGERPRINT = new AsfFieldKey("ACOUSTID_FINGERPRINT", 9, "Acoustid/Fingerprint", false);
    ACOUSTID_FINGERPRINT_OLD = new AsfFieldKey("ACOUSTID_FINGERPRINT_OLD", 10, "AcoustId/Fingerprint", false);
    ACOUSTID_ID = new AsfFieldKey("ACOUSTID_ID", 11, "Acoustid/Id", false);
    ALBUM = new AsfFieldKey("ALBUM", 12, "WM/AlbumTitle", false);
    ALBUM_ARTIST = new AsfFieldKey("ALBUM_ARTIST", 13, "WM/AlbumArtist", true);
    ALBUM_ARTIST_SORT = new AsfFieldKey("ALBUM_ARTIST_SORT", 14, "WM/AlbumArtistSortOrder", false);
    ALBUM_ARTISTS = new AsfFieldKey("ALBUM_ARTISTS", 15, "ALBUM_ARTISTS", true);
    ALBUM_ARTISTS_SORT = new AsfFieldKey("ALBUM_ARTISTS_SORT", 16, "ALBUM_ARTISTS_SORT", true);
    ALBUM_SORT = new AsfFieldKey("ALBUM_SORT", 17, "WM/AlbumSortOrder", false);
    ALBUM_YEAR = new AsfFieldKey("ALBUM_YEAR", 18, "ALBUM_YEAR", false);
    AMAZON_ID = new AsfFieldKey("AMAZON_ID", 19, "ASIN", false);
    ARRANGER = new AsfFieldKey("ARRANGER", 20, "WM/Arranger", false);
    ARRANGER_SORT = new AsfFieldKey("ARRANGER_SORT", 21, "ARRANGER_SORT", true);
    ARTISTS = new AsfFieldKey("ARTISTS", 22, "WM/ARTISTS", true);
    ARTISTS_SORT = new AsfFieldKey("ARTISTS_SORT", 23, "WM/ARTISTS_SORT", true);
    ARTIST_SORT = new AsfFieldKey("ARTIST_SORT", 24, "WM/ArtistSortOrder", false);
    BARCODE = new AsfFieldKey("BARCODE", 25, "WM/Barcode", false);
    BPM = new AsfFieldKey("BPM", 26, "WM/BeatsPerMinute", false);
    CATALOG_NO = new AsfFieldKey("CATALOG_NO", 27, "WM/CatalogNo", false);
    CATEGORY = new AsfFieldKey("CATEGORY", 28, "WM/Category", true);
    CHOIR = new AsfFieldKey("CHOIR", 29, "CHOIR", true);
    CHOIR_SORT = new AsfFieldKey("CHOIR_SORT", 30, "CHOIR_SORT", true);
    CLASSICAL_CATALOG = new AsfFieldKey("CLASSICAL_CATALOG", 31, "CLASSICAL_CATALOG", true);
    CLASSICAL_NICKNAME = new AsfFieldKey("CLASSICAL_NICKNAME", 32, "CLASSICAL_NICKNAME", true);
    COMPOSER = new AsfFieldKey("COMPOSER", 33, tlzLOCPTHRhep.cYvyNUcj, true);
    COMPOSER_SORT = new AsfFieldKey("COMPOSER_SORT", 34, nBRIsU.KyXmAiYSd, false);
    CONDUCTOR = new AsfFieldKey("CONDUCTOR", 35, "WM/Conductor", true);
    CONDUCTOR_SORT = new AsfFieldKey("CONDUCTOR_SORT", 36, "CONDUCTOR_SORT", true);
    COUNTRY = new AsfFieldKey("COUNTRY", 37, "WM/Country", false);
    COVER_ART = new AsfFieldKey("COVER_ART", 38, "WM/Picture", true);
    COVER_ART_URL = new AsfFieldKey("COVER_ART_URL", 39, "WM/AlbumCoverURL", true);
    CUSTOM1 = new AsfFieldKey("CUSTOM1", 40, "CUSTOM1", true);
    CUSTOM2 = new AsfFieldKey("CUSTOM2", 41, "CUSTOM2", true);
    CUSTOM3 = new AsfFieldKey("CUSTOM3", 42, "CUSTOM3", true);
    CUSTOM4 = new AsfFieldKey("CUSTOM4", 43, "CUSTOM4", true);
    CUSTOM5 = new AsfFieldKey("CUSTOM5", 44, "CUSTOM5", true);
    DIRECTOR = new AsfFieldKey("DIRECTOR", 45, "WM/Director", true);
    DISC_NO = new AsfFieldKey("DISC_NO", 46, "WM/PartOfSet", false);
    DISC_SUBTITLE = new AsfFieldKey("DISC_SUBTITLE", 47, "WM/SetSubTitle", false);
    DISC_TOTAL = new AsfFieldKey("DISC_TOTAL", 48, "WM/DiscTotal", false);
    DJMIXER = new AsfFieldKey("DJMIXER", 49, CKYHNesT.kzxFioiV, false);
    DJMIXER_SORT = new AsfFieldKey("DJMIXER_SORT", 50, "DJMIXER_SORT", false);
    ENCODED_BY = new AsfFieldKey("ENCODED_BY", 51, hbrAVtEa.eROOrlwAdlqPBKa, false);
    ENCODER = new AsfFieldKey("ENCODER", 52, "WM/ToolName", false);
    ENGINEER = new AsfFieldKey("ENGINEER", 53, "WM/Engineer", false);
    ENGINEER_SORT = new AsfFieldKey("ENGINEER_SORT", 54, "ENGINEER_SORT", false);
    ENSEMBLE = new AsfFieldKey("ENSEMBLE", 55, "ENSEMBLE", true);
    ENSEMBLE_SORT = new AsfFieldKey("ENSEMBLE_SORT", 56, "ENSEMBLE_SORT", true);
    String str = oXrNDUqUkE.XyoPs;
    FBPM = new AsfFieldKey(str, 57, str, true);
    GENRE = new AsfFieldKey("GENRE", 58, "WM/Genre", true);
    GENRE_ID = new AsfFieldKey("GENRE_ID", 59, "WM/GenreID", true);
    GROUP = new AsfFieldKey("GROUP", 60, "GROUP", false);
    GROUPING = new AsfFieldKey("GROUPING", 61, "WM/ContentGroupDescription", false);
    INITIAL_KEY = new AsfFieldKey("INITIAL_KEY", 62, "WM/InitialKey", false);
    INSTRUMENT = new AsfFieldKey("INSTRUMENT", 63, "INSTRUMENT", true);
    INVOLVED_PERSON = new AsfFieldKey("INVOLVED_PERSON", 64, "WM/InvolvedPerson", true);
    IPI = new AsfFieldKey("IPI", 65, "IPI", false);
    ISRC = new AsfFieldKey("ISRC", 66, "WM/ISRC", false);
    ISWC = new AsfFieldKey("ISWC", 67, "ISWC", false);
    ISVBR = new AsfFieldKey("ISVBR", 68, "IsVBR", true);
    IS_CLASSICAL = new AsfFieldKey("IS_CLASSICAL", 69, "IS_CLASSICAL", false);
    IS_COMPILATION = new AsfFieldKey("IS_COMPILATION", 70, "WM/IsCompilation", false);
    IS_GREATEST_HITS = new AsfFieldKey("IS_GREATEST_HITS", 71, "IS_GREATEST_HITS", false);
    IS_HD = new AsfFieldKey("IS_HD", 72, "IS_HD", false);
    IS_LIVE = new AsfFieldKey("IS_LIVE", 73, "LIVE", false);
    IS_SOUNDTRACK = new AsfFieldKey("IS_SOUNDTRACK", 74, "IS_SOUNDTRACK", false);
    JAIKOZ_ID = new AsfFieldKey("JAIKOZ_ID", 75, "JAIKOZ_ID", false);
    LANGUAGE = new AsfFieldKey("LANGUAGE", 76, "WM/Language", true);
    LYRICIST = new AsfFieldKey("LYRICIST", 77, "WM/Writer", true);
    LYRICIST_SORT = new AsfFieldKey("LYRICIST_SORT", 78, "LYRICIST_SORT", true);
    LYRICS_UNSYNC = new AsfFieldKey("LYRICS_UNSYNC", 79, KjdXPYm.FgXNPW, false);
    LYRICS_SYNCHRONISED = new AsfFieldKey("LYRICS_SYNCHRONISED", 80, "WM/Lyrics_Synchronised", true);
    MEDIA = new AsfFieldKey("MEDIA", 81, "WM/Media", false);
    MIXER = new AsfFieldKey("MIXER", 82, "WM/Mixer", false);
    MIXER_SORT = new AsfFieldKey("MIXER_SORT", 83, "MIXER_SORT", false);
    MM_RATING = new AsfFieldKey("MM_RATING", 84, "SDB/Rating", true);
    MOOD = new AsfFieldKey("MOOD", 85, "WM/Mood", true);
    MOOD_ACOUSTIC = new AsfFieldKey("MOOD_ACOUSTIC", 86, "MOOD_ACOUSTIC", false);
    MOOD_AGGRESSIVE = new AsfFieldKey("MOOD_AGGRESSIVE", 87, "MOOD_AGGRESSIVE", false);
    MOOD_AROUSAL = new AsfFieldKey("MOOD_AROUSAL", 88, "MOOD_AROUSAL", false);
    MOOD_DANCEABILITY = new AsfFieldKey("MOOD_DANCEABILITY", 89, "MOOD_DANCEABILITY", false);
    MOOD_ELECTRONIC = new AsfFieldKey("MOOD_ELECTRONIC", 90, "MOOD_ELECTRONIC", false);
    MOOD_HAPPY = new AsfFieldKey("MOOD_HAPPY", 91, "MOOD_HAPPY", false);
    MOOD_INSTRUMENTAL = new AsfFieldKey("MOOD_INSTRUMENTAL", 92, "MOOD_INSTRUMENTAL", false);
    MOOD_PARTY = new AsfFieldKey("MOOD_PARTY", 93, "MOOD_PARTY", false);
    MOOD_RELAXED = new AsfFieldKey("MOOD_RELAXED", 94, "MOOD_RELAXED", false);
    str = tlzLOCPTHRhep.bIEXvbTtvl;
    MOOD_SAD = new AsfFieldKey(str, 95, str, false);
    MOOD_VALENCE = new AsfFieldKey("MOOD_VALENCE", 96, "MOOD_VALENCE", false);
    MOVEMENT = new AsfFieldKey("MOVEMENT", 97, "MOVEMENT", false);
    MOVEMENT_NO = new AsfFieldKey("MOVEMENT_NO", 98, "MOVEMENT_NO", false);
    MOVEMENT_TOTAL = new AsfFieldKey(nFLlOYeP.BSx, 99, "MOVEMENT_TOTAL", false);
    MUSICBRAINZ_ARTISTID = new AsfFieldKey("MUSICBRAINZ_ARTISTID", 100, "MusicBrainz/Artist Id", false);
    MUSICBRAINZ_DISC_ID = new AsfFieldKey("MUSICBRAINZ_DISC_ID", 101, "MusicBrainz/Disc Id", false);
    MUSICBRAINZ_ORIGINAL_RELEASEID = new AsfFieldKey("MUSICBRAINZ_ORIGINAL_RELEASEID", 102, oXrNDUqUkE.UeGzeFnVAsV, false);
    MUSICBRAINZ_RELEASEARTISTID = new AsfFieldKey("MUSICBRAINZ_RELEASEARTISTID", 103, "MusicBrainz/Album Artist Id", false);
    MUSICBRAINZ_RELEASEGROUPID = new AsfFieldKey("MUSICBRAINZ_RELEASEGROUPID", 104, "MusicBrainz/Release Group Id", false);
    MUSICBRAINZ_RELEASEID = new AsfFieldKey("MUSICBRAINZ_RELEASEID", 105, "MusicBrainz/Album Id", false);
    MUSICBRAINZ_RELEASETRACKID = new AsfFieldKey("MUSICBRAINZ_RELEASETRACKID", 106, "MusicBrainz/Release Track Id", false);
    MUSICBRAINZ_RELEASE_COUNTRY = new AsfFieldKey("MUSICBRAINZ_RELEASE_COUNTRY", 107, "MusicBrainz/Album Release Country", false);
    MUSICBRAINZ_RELEASE_STATUS = new AsfFieldKey("MUSICBRAINZ_RELEASE_STATUS", 108, "MusicBrainz/Album Status", false);
    MUSICBRAINZ_RELEASE_TYPE = new AsfFieldKey("MUSICBRAINZ_RELEASE_TYPE", 109, "MusicBrainz/Album Type", false);
    MUSICBRAINZ_TRACK_ID = new AsfFieldKey("MUSICBRAINZ_TRACK_ID", 110, "MusicBrainz/Track Id", false);
    MUSICBRAINZ_WORKID = new AsfFieldKey("MUSICBRAINZ_WORKID", 111, "MusicBrainz/Work Id", false);
    MUSICBRAINZ_RECORDING_WORK = new AsfFieldKey(KjdXPYm.XsXELsixVF, 112, "MUSICBRAINZ_RECORDING_WORK", true);
    MUSICBRAINZ_RECORDING_WORK_ID = new AsfFieldKey("MUSICBRAINZ_RECORDING_WORK_ID", 113, "MUSICBRAINZ_RECORDING_WORK_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL1 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1", 114, "MUSICBRAINZ_WORK_PART_LEVEL1", true);
    MUSICBRAINZ_WORK_PART_LEVEL1_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_ID", 115, "MUSICBRAINZ_WORK_PART_LEVEL1_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL1_TYPE = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", 116, "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE", true);
    MUSICBRAINZ_WORK_PART_LEVEL2 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL2", 117, "MUSICBRAINZ_WORK_PART_LEVEL2", true);
    MUSICBRAINZ_WORK_PART_LEVEL2_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL2_ID", 118, "MUSICBRAINZ_WORK_PART_LEVEL2_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL2_TYPE = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", 119, "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE", true);
    MUSICBRAINZ_WORK_PART_LEVEL3 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3", 120, "MUSICBRAINZ_WORK_PART_LEVEL3", true);
    MUSICBRAINZ_WORK_PART_LEVEL3_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_ID", 121, "MUSICBRAINZ_WORK_PART_LEVEL3_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL3_TYPE = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", 122, "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE", true);
    MUSICBRAINZ_WORK_PART_LEVEL4 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4", 123, "MUSICBRAINZ_WORK_PART_LEVEL4", true);
    MUSICBRAINZ_WORK_PART_LEVEL4_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_ID", 124, "MUSICBRAINZ_WORK_PART_LEVEL4_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL4_TYPE = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", 125, "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE", true);
    MUSICBRAINZ_WORK_PART_LEVEL5 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5", 126, "MUSICBRAINZ_WORK_PART_LEVEL5", true);
    MUSICBRAINZ_WORK_PART_LEVEL5_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5_ID", 127, "MUSICBRAINZ_WORK_PART_LEVEL5_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL5_TYPE = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", 128, "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE", true);
    MUSICBRAINZ_WORK_PART_LEVEL6_ID = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL6_ID", 129, "MUSICBRAINZ_WORK_PART_LEVEL6_ID", true);
    MUSICBRAINZ_WORK_PART_LEVEL6 = new AsfFieldKey("MUSICBRAINZ_WORK_PART_LEVEL6", 130, "MUSICBRAINZ_WORK_PART_LEVEL6", true);
    MUSICBRAINZ_WORK_PART_LEVEL6_TYPE = new AsfFieldKey(DJqHMztxflt.avwadzy, 131, "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE", true);
    MUSICIP_ID = new AsfFieldKey("MUSICIP_ID", 132, "MusicIP/PUID", false);
    OCCASION = new AsfFieldKey("OCCASION", 133, "Occasion", true);
    OPUS = new AsfFieldKey("OPUS", 134, "OPUS", true);
    ORCHESTRA = new AsfFieldKey("ORCHESTRA", 135, "ORCHESTRA", true);
    ORCHESTRA_SORT = new AsfFieldKey("ORCHESTRA_SORT", 136, "ORCHESTRA_SORT", true);
    ORIGINAL_ALBUM = new AsfFieldKey(JkpGFvCVQHzgc.iifZWrBrchQEw, 137, "WM/OriginalAlbumTitle", true);
    ORIGINALRELEASEDATE = new AsfFieldKey("ORIGINALRELEASEDATE", 138, "ORIGINALRELEASEDATE", false);
    ORIGINAL_ARTIST = new AsfFieldKey("ORIGINAL_ARTIST", 139, "WM/OriginalArtist", true);
    ORIGINAL_LYRICIST = new AsfFieldKey("ORIGINAL_LYRICIST", 140, "WM/OriginalLyricist", true);
    ORIGINAL_YEAR = new AsfFieldKey("ORIGINAL_YEAR", 141, "WM/OriginalReleaseYear", true);
    OVERALL_WORK = new AsfFieldKey("OVERALL_WORK", 142, "OVERALL_WORK", false);
    PART = new AsfFieldKey("PART", 143, "PART", true);
    PART_NUMBER = new AsfFieldKey("PART_NUMBER", 144, "PARTNUMBER", true);
    PART_TYPE = new AsfFieldKey("PART_TYPE", 145, "PART_TYPE", true);
    PERFORMER = new AsfFieldKey("PERFORMER", 146, "PERFORMER", true);
    PERFORMER_NAME = new AsfFieldKey("PERFORMER_NAME", 147, "PERFORMER_NAME", true);
    PERFORMER_NAME_SORT = new AsfFieldKey("PERFORMER_NAME_SORT", 148, "PERFORMER_NAME_SORT", true);
    PERIOD = new AsfFieldKey("PERIOD", 149, "PERIOD", true);
    PRODUCER = new AsfFieldKey("PRODUCER", 150, "WM/Producer", false);
    PRODUCER_SORT = new AsfFieldKey("PRODUCER_SORT", 151, "PRODUCER_SORT", false);
    QUALITY = new AsfFieldKey("QUALITY", 152, "Quality", true);
    RANKING = new AsfFieldKey(OETETTfAjV.TGwuOnBdQ, 153, "RANKING", true);
    RECORD_LABEL = new AsfFieldKey("RECORD_LABEL", 154, "WM/Publisher", false);
    RECORDINGDATE = new AsfFieldKey("RECORDINGDATE", 155, "RECORDINGDATE", false);
    RECORDINGSTARTDATE = new AsfFieldKey("RECORDINGSTARTDATE", 156, "RECORDINGSTARTDATE", false);
    RECORDINGENDDATE = new AsfFieldKey("RECORDINGENDDATE", 157, "RECORDINGENDDATE", false);
    RECORDINGLOCATION = new AsfFieldKey("RECORDINGLOCATION", 158, "RECORDINGLOCATION", false);
    REMIXER = new AsfFieldKey("REMIXER", 159, "WM/ModifiedBy", false);
    ROONALBUMTAG = new AsfFieldKey("ROONALBUMTAG", 160, "ROONALBUMTAG", false);
    ROONTRACKTAG = new AsfFieldKey("ROONTRACKTAG", 161, "ROONTRACKTAG", false);
    SCRIPT = new AsfFieldKey("SCRIPT", 162, "WM/Script", false);
    SECTION = new AsfFieldKey("SECTION", 163, "SECTION", false);
    SINGLE_DISC_TRACK_NO = new AsfFieldKey("SINGLE_DISC_TRACK_NO", 164, "SINGLE_DISC_TRACK_NO", true);
    SONGKONG_ID = new AsfFieldKey("SONGKONG_ID", 165, tlzLOCPTHRhep.KmFLkK, false);
    SUBTITLE = new AsfFieldKey("SUBTITLE", 166, "WM/SubTitle", false);
    TAGS = new AsfFieldKey("TAGS", 167, "WM/Tags", false);
    TEMPO = new AsfFieldKey("TEMPO", 168, "Tempo", true);
    TIMBRE = new AsfFieldKey("TIMBRE", 169, "TIMBRE_BRIGHTNESS", false);
    TITLE_MOVEMENT = new AsfFieldKey("TITLE_MOVEMENT", 170, "TITLE_MOVEMENT", false);
    MUSICBRAINZ_WORK = new AsfFieldKey("MUSICBRAINZ_WORK", 171, "MUSICBRAINZ_WORK", false);
    TITLE_SORT = new AsfFieldKey(xveccWbRzqx.AFItpUQv, 172, "WM/TitleSortOrder", false);
    TONALITY = new AsfFieldKey("TONALITY", 173, "TONALITY", false);
    TRACK = new AsfFieldKey("TRACK", 174, "WM/TrackNumber", false);
    TRACK_TOTAL = new AsfFieldKey("TRACK_TOTAL", 175, "WM/TrackTotal", false);
    URL_DISCOGS_ARTIST_SITE = new AsfFieldKey("URL_DISCOGS_ARTIST_SITE", 176, "WM/DiscogsArtistUrl", false);
    URL_DISCOGS_RELEASE_SITE = new AsfFieldKey("URL_DISCOGS_RELEASE_SITE", 177, "WM/DiscogsReleaseUrl", false);
    URL_LYRICS_SITE = new AsfFieldKey("URL_LYRICS_SITE", 178, "WM/LyricsUrl", false);
    URL_OFFICIAL_ARTIST_SITE = new AsfFieldKey("URL_OFFICIAL_ARTIST_SITE", 179, "WM/AuthorURL", false);
    URL_OFFICIAL_RELEASE_SITE = new AsfFieldKey("URL_OFFICIAL_RELEASE_SITE", 180, "WM/OfficialReleaseUrl", false);
    URL_PROMOTIONAL_SITE = new AsfFieldKey("URL_PROMOTIONAL_SITE", 181, "WM/PromotionURL", true);
    URL_WIKIPEDIA_ARTIST_SITE = new AsfFieldKey("URL_WIKIPEDIA_ARTIST_SITE", 182, "WM/WikipediaArtistUrl", false);
    URL_WIKIPEDIA_RELEASE_SITE = new AsfFieldKey("URL_WIKIPEDIA_RELEASE_SITE", 183, "WM/WikipediaReleaseUrl", false);
    USER_RATING = new AsfFieldKey("USER_RATING", 184, "WM/SharedUserRating", true);
    VERSION = new AsfFieldKey("VERSION", 185, "VERSION", false);
    WORK = new AsfFieldKey("WORK", 186, "WORK", true);
    WORK_TYPE = new AsfFieldKey("WORK_TYPE", 187, "WORK_TYPE", true);
    YEAR = new AsfFieldKey("YEAR", 188, "WM/Year", false);
    CUSTOM = new AsfFieldKey(PwbbJfsdcHrAjW.LoEeWHcW, 189, "___CUSTOM___", true);
    $VALUES = $values();
    FIELD_ID_MAP = new HashMap<String, AsfFieldKey>((values()).length);
    AsfFieldKey[] arrayOfAsfFieldKey = values();
    int i = arrayOfAsfFieldKey.length;
    while (b < i) {
      AsfFieldKey asfFieldKey = arrayOfAsfFieldKey[b];
      if (asfFieldKey != CUSTOM)
        FIELD_ID_MAP.put(asfFieldKey.getFieldName(), asfFieldKey); 
      b++;
    } 
  }
  
  AsfFieldKey(String paramString1, boolean paramBoolean, ContainerType paramContainerType1, ContainerType paramContainerType2) {
    this.fieldName = paramString1;
    if (paramBoolean && paramContainerType2.isMultiValued()) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.multiValued = paramBoolean;
    this.lowestContainer = paramContainerType1;
    this.highestContainer = paramContainerType2;
  }
  
  public static AsfFieldKey getAsfFieldKey(String paramString) {
    AsfFieldKey asfFieldKey2 = FIELD_ID_MAP.get(paramString);
    AsfFieldKey asfFieldKey1 = asfFieldKey2;
    if (asfFieldKey2 == null)
      asfFieldKey1 = CUSTOM; 
    return asfFieldKey1;
  }
  
  public static boolean isMultiValued(String paramString) {
    AsfFieldKey asfFieldKey = getAsfFieldKey(paramString);
    return (asfFieldKey != null && asfFieldKey.isMultiValued());
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
  
  public ContainerType getHighestContainer() {
    return this.highestContainer;
  }
  
  public ContainerType getLowestContainer() {
    return this.lowestContainer;
  }
  
  public boolean isMultiValued() {
    return this.multiValued;
  }
  
  public String toString() {
    return getFieldName();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfFieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */