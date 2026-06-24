package org.jaudiotagger.tag.id3.framebody;

import com.google.android.material.tabs.xm.VDgS;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.TextEncodedStringNullTerminated;
import org.jaudiotagger.tag.datatype.TextEncodedStringSizeTerminated;
import org.jaudiotagger.tag.id3.ID3TextEncodingConversion;

public class FrameBodyTXXX extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public static final String ACOUSTID_FINGERPRINT = "Acoustid Fingerprint";
  
  public static final String ACOUSTID_ID = "Acoustid Id";
  
  public static final String ALBUM_ARTIST = "ALBUM ARTIST";
  
  public static final String ALBUM_ARTISTS = "ALBUM_ARTISTS";
  
  public static final String ALBUM_ARTISTS_SORT = "ALBUM_ARTISTS_SORT";
  
  public static final String ALBUM_YEAR = "ALBUM_YEAR";
  
  public static final String AMAZON_ASIN = "ASIN";
  
  public static final String ARRANGER = "ARRANGER";
  
  public static final String ARRANGER_SORT = "ARRANGER_SORT";
  
  public static final String ARTISTS = "ARTISTS";
  
  public static final String ARTISTS_SORT = "ARTISTS_SORT";
  
  public static final String BARCODE = "BARCODE";
  
  public static final String CATALOG_NO = "CATALOGNUMBER";
  
  public static final String CHOIR = "CHOIR";
  
  public static final String CHOIR_SORT = "CHOIR_SORT";
  
  public static final String CLASSICAL_CATALOG = "CLASSICAL_CATALOG";
  
  public static final String CLASSICAL_NICKNAME = "CLASSICAL_NICKNAME";
  
  public static final String CONDUCTOR_SORT = "CONDUCTOR_SORT";
  
  public static final String COUNTRY = "Country";
  
  public static final String DJMIXER = "DJMIXER";
  
  public static final String DJMIXER_SORT = "DJMIXER_SORT";
  
  public static final String ENGINEER = "ENGINEER";
  
  public static final String ENGINEER_SORT = "ENGINEER_SORT";
  
  public static final String ENSEMBLE = "ENSEMBLE";
  
  public static final String ENSEMBLE_SORT = "ENSEMBLE_SORT";
  
  public static final String FBPM = "FBPM";
  
  public static final String GROUP = "GROUP";
  
  public static final String INSTRUMENT = "INSTRUMENT";
  
  public static final String IPI = "IPI";
  
  public static final String ISWC = "ISWC";
  
  public static final String IS_CLASSICAL = "IS_CLASSICAL";
  
  public static final String IS_GREATEST_HITS = "IS_GREATEST_HITS";
  
  public static final String IS_HD = "IS_HD";
  
  public static final String IS_SOUNDTRACK = "IS_SOUNDTRACK";
  
  public static final String JAIKOZ_ID = "JAIKOZ_ID";
  
  public static final String LIVE = "LIVE";
  
  public static final String LYRICIST_SORT = "LYRICIST_SORT";
  
  public static final String MIXER = "MIXER";
  
  public static final String MIXER_SORT = "MIXER_SORT";
  
  public static final String MOOD = "MOOD";
  
  public static final String MOOD_ACOUSTIC = "MOOD_ACOUSTIC";
  
  public static final String MOOD_AGGRESSIVE = "MOOD_AGGRESSIVE";
  
  public static final String MOOD_AROUSAL = "MOOD_AROUSAL";
  
  public static final String MOOD_DANCEABILITY = "MOOD_DANCEABILITY";
  
  public static final String MOOD_ELECTRONIC = "MOOD_ELECTRONIC";
  
  public static final String MOOD_HAPPY = "MOOD_HAPPY";
  
  public static final String MOOD_INSTRUMENTAL = "MOOD_INSTRUMENTAL";
  
  public static final String MOOD_PARTY = "MOOD_PARTY";
  
  public static final String MOOD_RELAXED = "MOOD_RELAXED";
  
  public static final String MOOD_SAD = "MOOD_SAD";
  
  public static final String MOOD_VALENCE = "MOOD_VALENCE";
  
  public static final String MUSICBRAINZ_ALBUMID = "MusicBrainz Album Id";
  
  public static final String MUSICBRAINZ_ALBUM_ARTISTID = "MusicBrainz Album Artist Id";
  
  public static final String MUSICBRAINZ_ALBUM_COUNTRY = "MusicBrainz Album Release Country";
  
  public static final String MUSICBRAINZ_ALBUM_STATUS = "MusicBrainz Album Status";
  
  public static final String MUSICBRAINZ_ALBUM_TYPE = "MusicBrainz Album Type";
  
  public static final String MUSICBRAINZ_ARTISTID = "MusicBrainz Artist Id";
  
  public static final String MUSICBRAINZ_DISCID = "MusicBrainz Disc Id";
  
  public static final String MUSICBRAINZ_ORIGINAL_ALBUMID = "MusicBrainz Original Album Id";
  
  public static final String MUSICBRAINZ_RECORDING_WORK = "MUSICBRAINZ_RECORDING_WORK";
  
  public static final String MUSICBRAINZ_RECORDING_WORK_ID = "MUSICBRAINZ_RECORDING_WORK_ID";
  
  public static final String MUSICBRAINZ_RELEASE_GROUPID = "MusicBrainz Release Group Id";
  
  public static final String MUSICBRAINZ_RELEASE_TRACKID = "MusicBrainz Release Track Id";
  
  public static final String MUSICBRAINZ_WORK = "MUSICBRAINZ_WORK";
  
  public static final String MUSICBRAINZ_WORKID = "MusicBrainz Work Id";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL1 = "MUSICBRAINZ_WORK_PART_LEVEL1";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL1_ID = "MUSICBRAINZ_WORK_PART_LEVEL1_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL1_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL1_TYPE";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL2 = "MUSICBRAINZ_WORK_PART_LEVEL2";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL2_ID = "MUSICBRAINZ_WORK_PART_LEVEL2_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL2_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL2_TYPE";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL3 = "MUSICBRAINZ_WORK_PART_LEVEL3";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL3_ID = "MUSICBRAINZ_WORK_PART_LEVEL3_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL3_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL3_TYPE";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL4 = "MUSICBRAINZ_WORK_PART_LEVEL4";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL4_ID = "MUSICBRAINZ_WORK_PART_LEVEL4_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL4_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL4_TYPE";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL5 = "MUSICBRAINZ_WORK_PART_LEVEL5";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL5_ID = "MUSICBRAINZ_WORK_PART_LEVEL5_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL5_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL5_TYPE";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL6 = "MUSICBRAINZ_WORK_PART_LEVEL6";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL6_ID = "MUSICBRAINZ_WORK_PART_LEVEL6_ID";
  
  public static final String MUSICBRAINZ_WORK_PART_LEVEL6_TYPE = "MUSICBRAINZ_WORK_PART_LEVEL6_TYPE";
  
  public static final String MUSICIP_ID = "MusicIP PUID";
  
  public static final String OPUS = "OPUS";
  
  public static final String ORCHESTRA = "ORCHESTRA";
  
  public static final String ORCHESTRA_SORT = "ORCHESTRA_SORT";
  
  public static final String ORIGINALRELEASEDATE = "ORIGINALRELEASEDATE";
  
  public static final String OVERALL_WORK = "OVERALL_WORK";
  
  public static final String PART = "PART";
  
  public static final String PART_NUMBER = "PARTNUMBER";
  
  public static final String PART_TYPE = "PART_TYPE";
  
  public static final String PERFORMER = "PERFORMER";
  
  public static final String PERFORMER_NAME = "PERFORMER_NAME";
  
  public static final String PERFORMER_NAME_SORT = "PERFORMER_NAME_SORT";
  
  public static final String PERIOD = "PERIOD";
  
  public static final String PRODUCER = "PRODUCER";
  
  public static final String PRODUCER_SORT = "PRODUCER_SORT";
  
  public static final String RANKING = "RANKING";
  
  public static final String RECORDINGDATE = "RECORDINGDATE";
  
  public static final String RECORDINGENDDATE = "RECORDINGENDDATE";
  
  public static final String RECORDINGLOCATION = "RECORDINGLOCATION";
  
  public static final String RECORDINGSTARTDATE = "RECORDINGSTARTDATE";
  
  public static final String REMIXER = "REMIXER";
  
  public static final String ROONALBUMTAG = "ROONALBUMTAG";
  
  public static final String ROONTRACKTAG = "ROONTRACKTAG";
  
  public static final String SCRIPT = "SCRIPT";
  
  public static final String SECTION = "SECTION";
  
  public static final String SINGLE_DISC_TRACK_NO = "SINGLE_DISC_TRACK_NO";
  
  public static final String SONGKONG_ID = "SONGKONG_ID";
  
  public static final String TAGS = "TAGS";
  
  public static final String TIMBRE = "TIMBRE_BRIGHTNESS";
  
  public static final String TITLE_MOVEMENT = "TITLE_MOVEMENT";
  
  public static final String TONALITY = "TONALITY";
  
  public static final String VERSION = "VERSION";
  
  public static final String WORK = "WORK";
  
  public static final String WORK_TYPE = "WORK_TYPE";
  
  public FrameBodyTXXX() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Description", "");
    setObjectValue(ckOPp.cJsc, "");
  }
  
  public FrameBodyTXXX(byte paramByte, String paramString1, String paramString2) {
    setObjectValue("TextEncoding", Byte.valueOf(paramByte));
    setObjectValue("Description", paramString1);
    setObjectValue(VDgS.itzxNGGKG, paramString2);
  }
  
  public FrameBodyTXXX(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTXXX(FrameBodyTMOO paramFrameBodyTMOO) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyTMOO.getTextEncoding()));
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Description", "MOOD");
    setObjectValue("Text", paramFrameBodyTMOO.getText());
  }
  
  public FrameBodyTXXX(FrameBodyTXXX paramFrameBodyTXXX) {
    super(paramFrameBodyTXXX);
  }
  
  public String getDescription() {
    return (String)getObjectValue("Description");
  }
  
  public String getIdentifier() {
    return "TXXX";
  }
  
  public void setDescription(String paramString) {
    setObjectValue("Description", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TextEncoding", this, 1));
    this.objectList.add(new TextEncodedStringNullTerminated("Description", this));
    this.objectList.add(new TextEncodedStringSizeTerminated("Text", this));
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    setTextEncoding(ID3TextEncodingConversion.getTextEncoding(getHeader(), getTextEncoding()));
    if (!((TextEncodedStringNullTerminated)getObject("Description")).canBeEncoded())
      setTextEncoding(ID3TextEncodingConversion.getUnicodeTextEncoding(getHeader())); 
    super.write(paramByteArrayOutputStream);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTXXX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */