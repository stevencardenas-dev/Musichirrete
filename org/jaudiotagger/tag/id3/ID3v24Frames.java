package org.jaudiotagger.tag.id3;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.window.ldG.XUaAMlaMSa;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.tabs.xm.VDgS;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.datatype.AbstractValuePair;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import r3.IKWi.AyxAR;

public class ID3v24Frames extends ID3Frames {
  public static final String FRAME_ID_ACCOMPANIMENT = "TPE2";
  
  public static final String FRAME_ID_ALBUM = "TALB";
  
  public static final String FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES = "TSO2";
  
  public static final String FRAME_ID_ALBUM_SORT_ORDER = "TSOA";
  
  public static final String FRAME_ID_ARTIST = "TPE1";
  
  public static final String FRAME_ID_ARTIST_SORT_ORDER = "TSOP";
  
  public static final String FRAME_ID_ATTACHED_PICTURE = "APIC";
  
  public static final String FRAME_ID_AUDIO_ENCRYPTION = "AENC";
  
  public static final String FRAME_ID_AUDIO_SEEK_POINT_INDEX = "ASPI";
  
  public static final String FRAME_ID_BPM = "TBPM";
  
  public static final String FRAME_ID_CHAPTER = "CHAP";
  
  public static final String FRAME_ID_CHAPTER_TOC = "CTOC";
  
  public static final String FRAME_ID_COMMENT = "COMM";
  
  public static final String FRAME_ID_COMMERCIAL_FRAME = "COMR";
  
  public static final String FRAME_ID_COMPOSER = "TCOM";
  
  public static final String FRAME_ID_COMPOSER_SORT_ORDER_ITUNES = "TSOC";
  
  public static final String FRAME_ID_CONDUCTOR = "TPE3";
  
  public static final String FRAME_ID_CONTENT_GROUP_DESC = "TIT1";
  
  public static final String FRAME_ID_COPYRIGHTINFO = "TCOP";
  
  public static final String FRAME_ID_ENCODEDBY = "TENC";
  
  public static final String FRAME_ID_ENCODING_TIME = "TDEN";
  
  public static final String FRAME_ID_ENCRYPTION = "ENCR";
  
  public static final String FRAME_ID_EQUALISATION2 = "EQU2";
  
  public static final String FRAME_ID_EVENT_TIMING_CODES = "ETCO";
  
  public static final String FRAME_ID_FILE_OWNER = "TOWN";
  
  public static final String FRAME_ID_FILE_TYPE = "TFLT";
  
  public static final String FRAME_ID_GENERAL_ENCAPS_OBJECT = "GEOB";
  
  public static final String FRAME_ID_GENRE = "TCON";
  
  public static final String FRAME_ID_GROUP_ID_REG = "GRID";
  
  public static final String FRAME_ID_HW_SW_SETTINGS = "TSSE";
  
  public static final String FRAME_ID_INITIAL_KEY = "TKEY";
  
  public static final String FRAME_ID_INVOLVED_PEOPLE = "TIPL";
  
  public static final String FRAME_ID_ISRC = "TSRC";
  
  public static final String FRAME_ID_IS_COMPILATION = "TCMP";
  
  public static final String FRAME_ID_ITUNES_GROUPING = "GRP1";
  
  public static final String FRAME_ID_LANGUAGE = "TLAN";
  
  public static final String FRAME_ID_LENGTH = "TLEN";
  
  public static final String FRAME_ID_LINKED_INFO = "LINK";
  
  public static final String FRAME_ID_LYRICIST = "TEXT";
  
  public static final String FRAME_ID_MEDIA_TYPE = "TMED";
  
  public static final String FRAME_ID_MOOD = "TMOO";
  
  public static final String FRAME_ID_MOVEMENT = "MVNM";
  
  public static final String FRAME_ID_MOVEMENT_NO = "MVIN";
  
  public static final String FRAME_ID_MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
  
  public static final String FRAME_ID_MUSICIAN_CREDITS = "TMCL";
  
  public static final String FRAME_ID_MUSIC_CD_ID = "MCDI";
  
  public static final String FRAME_ID_ORIGARTIST = "TOPE";
  
  public static final String FRAME_ID_ORIGINAL_RELEASE_TIME = "TDOR";
  
  public static final String FRAME_ID_ORIG_FILENAME = "TOFN";
  
  public static final String FRAME_ID_ORIG_LYRICIST = "TOLY";
  
  public static final String FRAME_ID_ORIG_TITLE = "TOAL";
  
  public static final String FRAME_ID_OWNERSHIP = "OWNE";
  
  public static final String FRAME_ID_PERFORMER_SORT_OWNER = "TSOP";
  
  public static final String FRAME_ID_PLAYLIST_DELAY = "TDLY";
  
  public static final String FRAME_ID_PLAY_COUNTER = "PCNT";
  
  public static final String FRAME_ID_POPULARIMETER = "POPM";
  
  public static final String FRAME_ID_POSITION_SYNC = "POSS";
  
  public static final String FRAME_ID_PRIVATE = "PRIV";
  
  public static final String FRAME_ID_PRODUCED_NOTICE = "TPRO";
  
  public static final String FRAME_ID_PUBLISHER = "TPUB";
  
  public static final String FRAME_ID_RADIO_NAME = "TRSN";
  
  public static final String FRAME_ID_RADIO_OWNER = "TRSO";
  
  public static final String FRAME_ID_RECOMMENDED_BUFFER_SIZE = "RBUF";
  
  public static final String FRAME_ID_RELATIVE_VOLUME_ADJUSTMENT2 = "RVA2";
  
  public static final String FRAME_ID_RELEASE_TIME = "TDRL";
  
  public static final String FRAME_ID_REMIXED = "TPE4";
  
  public static final String FRAME_ID_REVERB = "RVRB";
  
  public static final String FRAME_ID_SEEK = "SEEK";
  
  public static final String FRAME_ID_SET = "TPOS";
  
  public static final String FRAME_ID_SET_SUBTITLE = "TSST";
  
  public static final String FRAME_ID_SIGNATURE = "SIGN";
  
  public static final String FRAME_ID_SYNC_LYRICS = "SYLT";
  
  public static final String FRAME_ID_SYNC_TEMPO = "SYTC";
  
  public static final String FRAME_ID_TAGGING_TIME = "TDTG";
  
  public static final String FRAME_ID_TERMS_OF_USE = "USER";
  
  public static final String FRAME_ID_TITLE = "TIT2";
  
  public static final String FRAME_ID_TITLE_REFINEMENT = "TIT3";
  
  public static final String FRAME_ID_TITLE_SORT_ORDER = "TSOT";
  
  public static final String FRAME_ID_TITLE_SORT_OWNER = "TSOT";
  
  public static final String FRAME_ID_TRACK = "TRCK";
  
  public static final String FRAME_ID_UNIQUE_FILE_ID = "UFID";
  
  public static final String FRAME_ID_UNSYNC_LYRICS = "USLT";
  
  public static final String FRAME_ID_URL_ARTIST_WEB = "WOAR";
  
  public static final String FRAME_ID_URL_COMMERCIAL = "WCOM";
  
  public static final String FRAME_ID_URL_COPYRIGHT = "WCOP";
  
  public static final String FRAME_ID_URL_FILE_WEB = "WOAF";
  
  public static final String FRAME_ID_URL_OFFICIAL_RADIO = "WORS";
  
  public static final String FRAME_ID_URL_PAYMENT = "WPAY";
  
  public static final String FRAME_ID_URL_PUBLISHERS = "WPUB";
  
  public static final String FRAME_ID_URL_SOURCE_WEB = "WOAS";
  
  public static final String FRAME_ID_USER_DEFINED_INFO = "TXXX";
  
  public static final String FRAME_ID_USER_DEFINED_URL = "WXXX";
  
  public static final String FRAME_ID_YEAR = "TDRC";
  
  private static ID3v24Frames id3v24Frames;
  
  protected EnumMap<ID3v24FieldKey, FieldKey> id3ToTagField = new EnumMap<ID3v24FieldKey, FieldKey>(ID3v24FieldKey.class);
  
  protected EnumMap<FieldKey, ID3v24FieldKey> tagFieldToId3 = new EnumMap<FieldKey, ID3v24FieldKey>(FieldKey.class);
  
  private ID3v24Frames() {
    this.supportedFrames.add("TPE2");
    this.supportedFrames.add("TALB");
    this.supportedFrames.add("TSOA");
    this.supportedFrames.add("TPE1");
    this.supportedFrames.add("APIC");
    this.supportedFrames.add("AENC");
    this.supportedFrames.add("ASPI");
    this.supportedFrames.add("TBPM");
    this.supportedFrames.add("CHAP");
    this.supportedFrames.add("CTOC");
    this.supportedFrames.add("COMM");
    this.supportedFrames.add("COMR");
    this.supportedFrames.add("TCOM");
    this.supportedFrames.add("TPE3");
    this.supportedFrames.add("TIT1");
    this.supportedFrames.add("TCOP");
    this.supportedFrames.add("TENC");
    this.supportedFrames.add("TDEN");
    TreeSet<String> treeSet = this.supportedFrames;
    String str = hrSTyFuSIm.ZsSQh;
    treeSet.add(str);
    this.supportedFrames.add("EQU2");
    this.supportedFrames.add("ETCO");
    this.supportedFrames.add("TOWN");
    this.supportedFrames.add(nFLlOYeP.KqAiWOKx);
    this.supportedFrames.add("GEOB");
    this.supportedFrames.add("TCON");
    this.supportedFrames.add("GRID");
    this.supportedFrames.add(FgdLmmRfTxSFKI.ywYFUuAACyxoz);
    this.supportedFrames.add("TKEY");
    this.supportedFrames.add(DJqHMztxflt.jEPcCS);
    this.supportedFrames.add("TSRC");
    this.supportedFrames.add("GRP1");
    this.supportedFrames.add("TLAN");
    this.supportedFrames.add("TLEN");
    this.supportedFrames.add("LINK");
    this.supportedFrames.add("TEXT");
    this.supportedFrames.add(AyxAR.nyK);
    this.supportedFrames.add("TMOO");
    this.supportedFrames.add("MVNM");
    this.supportedFrames.add("MVIN");
    this.supportedFrames.add("MLLT");
    this.supportedFrames.add("MCDI");
    this.supportedFrames.add("TMCL");
    this.supportedFrames.add("TOPE");
    this.supportedFrames.add("TDOR");
    this.supportedFrames.add("TOFN");
    this.supportedFrames.add("TOLY");
    this.supportedFrames.add("TOAL");
    this.supportedFrames.add("OWNE");
    this.supportedFrames.add("TSOP");
    this.supportedFrames.add("TDLY");
    this.supportedFrames.add("PCNT");
    this.supportedFrames.add("POPM");
    this.supportedFrames.add("POSS");
    this.supportedFrames.add("PRIV");
    this.supportedFrames.add("TPRO");
    this.supportedFrames.add("TPUB");
    this.supportedFrames.add("TRSN");
    this.supportedFrames.add("TRSO");
    this.supportedFrames.add("RBUF");
    this.supportedFrames.add("RVA2");
    this.supportedFrames.add("TDRL");
    this.supportedFrames.add("TPE4");
    this.supportedFrames.add("RVRB");
    this.supportedFrames.add("SEEK");
    this.supportedFrames.add("TPOS");
    this.supportedFrames.add("TSST");
    this.supportedFrames.add("SIGN");
    this.supportedFrames.add("SYLT");
    this.supportedFrames.add("SYTC");
    this.supportedFrames.add("TDTG");
    this.supportedFrames.add("USER");
    this.supportedFrames.add("TIT2");
    this.supportedFrames.add("TIT3");
    this.supportedFrames.add("TSOT");
    this.supportedFrames.add("TRCK");
    this.supportedFrames.add("UFID");
    this.supportedFrames.add("USLT");
    this.supportedFrames.add("WOAR");
    this.supportedFrames.add("WCOM");
    this.supportedFrames.add("WCOP");
    this.supportedFrames.add("WOAF");
    this.supportedFrames.add("WORS");
    this.supportedFrames.add("WPAY");
    this.supportedFrames.add("WPUB");
    this.supportedFrames.add("WOAS");
    this.supportedFrames.add("TXXX");
    this.supportedFrames.add(PwbbJfsdcHrAjW.wQogfhpl);
    this.supportedFrames.add(jLnXOLx.sLKiIhavRtiLaEL);
    this.extensionFrames.add("TCMP");
    this.extensionFrames.add("TSO2");
    this.extensionFrames.add("TSOC");
    this.commonFrames.add("TPE1");
    this.commonFrames.add("TALB");
    this.commonFrames.add("TIT2");
    this.commonFrames.add("TCON");
    this.commonFrames.add(GMDx.gzTrnVkkBh);
    this.commonFrames.add("TDRC");
    this.commonFrames.add("COMM");
    this.binaryFrames.add("APIC");
    this.binaryFrames.add("AENC");
    this.binaryFrames.add(str);
    this.binaryFrames.add("EQU2");
    this.binaryFrames.add("ETCO");
    this.binaryFrames.add("GEOB");
    this.binaryFrames.add("RVA2");
    this.binaryFrames.add("RBUF");
    this.binaryFrames.add("UFID");
    ((AbstractValuePair)this).idToValue.put("TPE2", "Text: Band/Orchestra/Accompaniment");
    ((AbstractValuePair)this).idToValue.put("TALB", "Text: Album/Movie/Show title");
    ((AbstractValuePair)this).idToValue.put("TSOA", "Album sort order");
    ((AbstractValuePair)this).idToValue.put("TPE1", "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
    ((AbstractValuePair)this).idToValue.put("APIC", "Attached picture");
    ((AbstractValuePair)this).idToValue.put("AENC", "Audio encryption");
    ((AbstractValuePair)this).idToValue.put("ASPI", "Audio seek point index");
    ((AbstractValuePair)this).idToValue.put("TBPM", "Text: BPM (Beats Per Minute)");
    ((AbstractValuePair)this).idToValue.put("CHAP", "Chapter");
    ((AbstractValuePair)this).idToValue.put("CTOC", "Chapter TOC");
    ((AbstractValuePair)this).idToValue.put("COMM", "Comments");
    ((AbstractValuePair)this).idToValue.put("COMR", "Commercial Frame");
    ((AbstractValuePair)this).idToValue.put("TCOM", "Text: Composer");
    ((AbstractValuePair)this).idToValue.put("TPE3", "Text: Conductor/Performer refinement");
    ((AbstractValuePair)this).idToValue.put("TIT1", "Text: Content group description");
    ((AbstractValuePair)this).idToValue.put("TCOP", "Text: Copyright message");
    ((AbstractValuePair)this).idToValue.put("TENC", GMDx.tYg);
    ((AbstractValuePair)this).idToValue.put(IGBYXeDFmKYajx.vRfg, "Text: Encoding time");
    ((AbstractValuePair)this).idToValue.put(str, "Encryption method registration");
    ((AbstractValuePair)this).idToValue.put("EQU2", XUaAMlaMSa.ZULpqCra);
    ((AbstractValuePair)this).idToValue.put("ETCO", zLtYiJUm.ZKAs);
    ((AbstractValuePair)this).idToValue.put("TOWN", "Text:File Owner");
    ((AbstractValuePair)this).idToValue.put("TFLT", "Text: File type");
    ((AbstractValuePair)this).idToValue.put("GEOB", "General encapsulated datatype");
    ((AbstractValuePair)this).idToValue.put("TCON", "Text: Content type");
    ((AbstractValuePair)this).idToValue.put("GRID", "Group ID Registration");
    ((AbstractValuePair)this).idToValue.put("TSSE", "Text: Software/hardware and settings used for encoding");
    ((AbstractValuePair)this).idToValue.put("TKEY", "Text: Initial key");
    ((AbstractValuePair)this).idToValue.put("TIPL", "Involved people list");
    ((AbstractValuePair)this).idToValue.put("TSRC", "Text: ISRC (International Standard Recording Code)");
    ((AbstractValuePair)this).idToValue.put("GRP1", "iTunes Grouping");
    ((AbstractValuePair)this).idToValue.put("TLAN", "Text: Language(s)");
    ((AbstractValuePair)this).idToValue.put("TLEN", kOkiWEITVb.LzcSZOH);
    ((AbstractValuePair)this).idToValue.put(nFLlOYeP.heXzvI, "Linked information");
    ((AbstractValuePair)this).idToValue.put("TEXT", "Text: Lyricist/text writer");
    ((AbstractValuePair)this).idToValue.put(VDgS.HDDCVjBlmogvVD, "Text: Media type");
    ((AbstractValuePair)this).idToValue.put("TMOO", "Text: Mood");
    ((AbstractValuePair)this).idToValue.put("MVNM", "Text: Movement");
    ((AbstractValuePair)this).idToValue.put("MVIN", "Text: Movement No");
    ((AbstractValuePair)this).idToValue.put("MLLT", "MPEG location lookup table");
    ((AbstractValuePair)this).idToValue.put("MCDI", "Music CD Identifier");
    ((AbstractValuePair)this).idToValue.put("TOPE", "Text: Original artist(s)/performer(s)");
    ((AbstractValuePair)this).idToValue.put("TDOR", "Text: Original release time");
    ((AbstractValuePair)this).idToValue.put(hrSTyFuSIm.kpskoMQSK, "Text: Original filename");
    ((AbstractValuePair)this).idToValue.put("TOLY", "Text: Original Lyricist(s)/text writer(s)");
    ((AbstractValuePair)this).idToValue.put("TOAL", "Text: Original album/Movie/Show title");
    ((AbstractValuePair)this).idToValue.put("OWNE", "Ownership");
    ((AbstractValuePair)this).idToValue.put("TSOP", "Performance Sort Order");
    ((AbstractValuePair)this).idToValue.put("TDLY", "Text: Playlist delay");
    ((AbstractValuePair)this).idToValue.put("PCNT", "Play counter");
    ((AbstractValuePair)this).idToValue.put("POPM", "Popularimeter");
    ((AbstractValuePair)this).idToValue.put("POSS", "Position Sync");
    ((AbstractValuePair)this).idToValue.put("PRIV", "Private frame");
    ((AbstractValuePair)this).idToValue.put("TPRO", "Produced Notice");
    ((AbstractValuePair)this).idToValue.put("TPUB", "Text: Publisher");
    ((AbstractValuePair)this).idToValue.put("TRSN", "Text: Radio Name");
    ((AbstractValuePair)this).idToValue.put("TRSO", "Text: Radio Owner");
    ((AbstractValuePair)this).idToValue.put("RBUF", "Recommended buffer size");
    ((AbstractValuePair)this).idToValue.put("RVA2", "Relative volume adjustment(2)");
    ((AbstractValuePair)this).idToValue.put(fXMDNeMWaILNVh.bpatKHe, "Release Time");
    ((AbstractValuePair)this).idToValue.put("TPE4", "Text: Interpreted, remixed, or otherwise modified by");
    ((AbstractValuePair)this).idToValue.put("RVRB", "Reverb");
    ((AbstractValuePair)this).idToValue.put("SEEK", "Seek");
    ((AbstractValuePair)this).idToValue.put("TPOS", "Text: Part of a setField");
    ((AbstractValuePair)this).idToValue.put("TSST", "Text: Set subtitle");
    ((AbstractValuePair)this).idToValue.put("SIGN", "Signature");
    ((AbstractValuePair)this).idToValue.put("SYLT", "Synchronized lyric/text");
    ((AbstractValuePair)this).idToValue.put("SYTC", "Synced tempo codes");
    ((AbstractValuePair)this).idToValue.put("TDTG", XUaAMlaMSa.NGaXoCIqNlBz);
    ((AbstractValuePair)this).idToValue.put("USER", "Terms of Use");
    ((AbstractValuePair)this).idToValue.put("TIT2", "Text: title");
    ((AbstractValuePair)this).idToValue.put("TIT3", "Text: Subtitle/Description refinement");
    ((AbstractValuePair)this).idToValue.put("TSOT", "Text: title sort order");
    ((AbstractValuePair)this).idToValue.put("TRCK", FgdLmmRfTxSFKI.MUnLLEyegowWpjI);
    ((AbstractValuePair)this).idToValue.put("UFID", "Unique file identifier");
    ((AbstractValuePair)this).idToValue.put("USLT", CKYHNesT.horXWBSQDxqmWdu);
    ((AbstractValuePair)this).idToValue.put(ckOPp.KKomP, "URL: Official artist/performer webpage");
    ((AbstractValuePair)this).idToValue.put("WCOM", "URL: Commercial information");
    ((AbstractValuePair)this).idToValue.put("WCOP", "URL: Copyright/Legal information");
    ((AbstractValuePair)this).idToValue.put("WOAF", "URL: Official audio file webpage");
    ((AbstractValuePair)this).idToValue.put("WORS", "URL: Official Radio website");
    ((AbstractValuePair)this).idToValue.put("WPAY", "URL: Payment for this recording ");
    ((AbstractValuePair)this).idToValue.put(nBRIsU.PCTfrag, "URL: Publishers official webpage");
    ((AbstractValuePair)this).idToValue.put("WOAS", tlzLOCPTHRhep.oVwlDDN);
    ((AbstractValuePair)this).idToValue.put("TXXX", "User defined text information frame");
    ((AbstractValuePair)this).idToValue.put("WXXX", "User defined URL link frame");
    ((AbstractValuePair)this).idToValue.put("TDRC", "Text:Year");
    ((AbstractValuePair)this).idToValue.put("TCMP", "Is Compilation");
    ((AbstractValuePair)this).idToValue.put("TSO2", "Text:Album Artist Sort Order Frame");
    ((AbstractValuePair)this).idToValue.put("TSOC", "Text:Composer Sort Order Frame");
    createMaps();
    this.multipleFrames.add("TXXX");
    this.multipleFrames.add("WXXX");
    this.multipleFrames.add("APIC");
    this.multipleFrames.add("PRIV");
    this.multipleFrames.add("COMM");
    this.multipleFrames.add("UFID");
    this.multipleFrames.add("USLT");
    this.multipleFrames.add("SYLT");
    this.multipleFrames.add("POPM");
    this.multipleFrames.add("GEOB");
    this.multipleFrames.add("WOAR");
    this.multipleFrames.add("RVA2");
    this.discardIfFileAlteredFrames.add("ETCO");
    this.discardIfFileAlteredFrames.add("MLLT");
    this.discardIfFileAlteredFrames.add("POSS");
    this.discardIfFileAlteredFrames.add("SYTC");
    this.discardIfFileAlteredFrames.add("ETCO");
    this.discardIfFileAlteredFrames.add("TENC");
    this.discardIfFileAlteredFrames.add("TLEN");
    this.tagFieldToId3.put(FieldKey.ACOUSTID_FINGERPRINT, ID3v24FieldKey.ACOUSTID_FINGERPRINT);
    this.tagFieldToId3.put(FieldKey.ACOUSTID_ID, ID3v24FieldKey.ACOUSTID_ID);
    this.tagFieldToId3.put(FieldKey.ALBUM, ID3v24FieldKey.ALBUM);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTIST, ID3v24FieldKey.ALBUM_ARTIST);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTIST_SORT, ID3v24FieldKey.ALBUM_ARTIST_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTISTS, ID3v24FieldKey.ALBUM_ARTISTS);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTISTS_SORT, ID3v24FieldKey.ALBUM_ARTISTS_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_SORT, ID3v24FieldKey.ALBUM_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_YEAR, ID3v24FieldKey.ALBUM_YEAR);
    this.tagFieldToId3.put(FieldKey.AMAZON_ID, ID3v24FieldKey.AMAZON_ID);
    this.tagFieldToId3.put(FieldKey.ARRANGER, ID3v24FieldKey.ARRANGER);
    this.tagFieldToId3.put(FieldKey.ARRANGER_SORT, ID3v24FieldKey.ARRANGER_SORT);
    this.tagFieldToId3.put(FieldKey.ARTIST, ID3v24FieldKey.ARTIST);
    this.tagFieldToId3.put(FieldKey.ARTISTS, ID3v24FieldKey.ARTISTS);
    this.tagFieldToId3.put(FieldKey.ARTISTS_SORT, ID3v24FieldKey.ARTISTS_SORT);
    this.tagFieldToId3.put(FieldKey.ARTIST_SORT, ID3v24FieldKey.ARTIST_SORT);
    this.tagFieldToId3.put(FieldKey.BARCODE, ID3v24FieldKey.BARCODE);
    this.tagFieldToId3.put(FieldKey.BPM, ID3v24FieldKey.BPM);
    this.tagFieldToId3.put(FieldKey.CATALOG_NO, ID3v24FieldKey.CATALOG_NO);
    this.tagFieldToId3.put(FieldKey.CHOIR, ID3v24FieldKey.CHOIR);
    this.tagFieldToId3.put(FieldKey.CHOIR_SORT, ID3v24FieldKey.CHOIR_SORT);
    this.tagFieldToId3.put(FieldKey.CLASSICAL_CATALOG, ID3v24FieldKey.CLASSICAL_CATALOG);
    this.tagFieldToId3.put(FieldKey.CLASSICAL_NICKNAME, ID3v24FieldKey.CLASSICAL_NICKNAME);
    this.tagFieldToId3.put(FieldKey.COMMENT, ID3v24FieldKey.COMMENT);
    this.tagFieldToId3.put(FieldKey.COMPOSER, ID3v24FieldKey.COMPOSER);
    this.tagFieldToId3.put(FieldKey.COMPOSER_SORT, ID3v24FieldKey.COMPOSER_SORT);
    this.tagFieldToId3.put(FieldKey.CONDUCTOR, ID3v24FieldKey.CONDUCTOR);
    this.tagFieldToId3.put(FieldKey.CONDUCTOR_SORT, ID3v24FieldKey.CONDUCTOR_SORT);
    this.tagFieldToId3.put(FieldKey.COPYRIGHT, ID3v24FieldKey.COPYRIGHT);
    this.tagFieldToId3.put(FieldKey.COUNTRY, ID3v24FieldKey.COUNTRY);
    this.tagFieldToId3.put(FieldKey.COVER_ART, ID3v24FieldKey.COVER_ART);
    this.tagFieldToId3.put(FieldKey.CUSTOM1, ID3v24FieldKey.CUSTOM1);
    this.tagFieldToId3.put(FieldKey.CUSTOM2, ID3v24FieldKey.CUSTOM2);
    this.tagFieldToId3.put(FieldKey.CUSTOM3, ID3v24FieldKey.CUSTOM3);
    this.tagFieldToId3.put(FieldKey.CUSTOM4, ID3v24FieldKey.CUSTOM4);
    this.tagFieldToId3.put(FieldKey.CUSTOM5, ID3v24FieldKey.CUSTOM5);
    EnumMap<FieldKey, ID3v24FieldKey> enumMap = this.tagFieldToId3;
    FieldKey fieldKey = FieldKey.DISC_NO;
    ID3v24FieldKey iD3v24FieldKey = ID3v24FieldKey.DISC_NO;
    enumMap.put(fieldKey, iD3v24FieldKey);
    this.tagFieldToId3.put(FieldKey.DISC_SUBTITLE, ID3v24FieldKey.DISC_SUBTITLE);
    this.tagFieldToId3.put(FieldKey.DISC_TOTAL, iD3v24FieldKey);
    this.tagFieldToId3.put(FieldKey.DJMIXER, ID3v24FieldKey.DJMIXER);
    this.tagFieldToId3.put(FieldKey.DJMIXER_SORT, ID3v24FieldKey.DJMIXER_SORT);
    this.tagFieldToId3.put(FieldKey.MOOD_ELECTRONIC, ID3v24FieldKey.MOOD_ELECTRONIC);
    this.tagFieldToId3.put(FieldKey.ENCODER, ID3v24FieldKey.ENCODER);
    this.tagFieldToId3.put(FieldKey.ENGINEER, ID3v24FieldKey.ENGINEER);
    this.tagFieldToId3.put(FieldKey.ENGINEER_SORT, ID3v24FieldKey.ENGINEER_SORT);
    this.tagFieldToId3.put(FieldKey.ENSEMBLE, ID3v24FieldKey.ENSEMBLE);
    this.tagFieldToId3.put(FieldKey.ENSEMBLE_SORT, ID3v24FieldKey.ENSEMBLE_SORT);
    this.tagFieldToId3.put(FieldKey.FBPM, ID3v24FieldKey.FBPM);
    this.tagFieldToId3.put(FieldKey.GENRE, ID3v24FieldKey.GENRE);
    this.tagFieldToId3.put(FieldKey.GROUP, ID3v24FieldKey.GROUP);
    this.tagFieldToId3.put(FieldKey.GROUPING, ID3v24FieldKey.GROUPING);
    this.tagFieldToId3.put(FieldKey.INSTRUMENT, ID3v24FieldKey.INSTRUMENT);
    this.tagFieldToId3.put(FieldKey.INVOLVEDPEOPLE, ID3v24FieldKey.INVOLVED_PEOPLE);
    this.tagFieldToId3.put(FieldKey.IPI, ID3v24FieldKey.IPI);
    this.tagFieldToId3.put(FieldKey.ISRC, ID3v24FieldKey.ISRC);
    this.tagFieldToId3.put(FieldKey.ISWC, ID3v24FieldKey.ISWC);
    this.tagFieldToId3.put(FieldKey.IS_CLASSICAL, ID3v24FieldKey.IS_CLASSICAL);
    this.tagFieldToId3.put(FieldKey.IS_COMPILATION, ID3v24FieldKey.IS_COMPILATION);
    this.tagFieldToId3.put(FieldKey.IS_SOUNDTRACK, ID3v24FieldKey.IS_SOUNDTRACK);
    this.tagFieldToId3.put(FieldKey.IS_GREATEST_HITS, ID3v24FieldKey.IS_GREATEST_HITS);
    this.tagFieldToId3.put(FieldKey.IS_HD, ID3v24FieldKey.IS_HD);
    this.tagFieldToId3.put(FieldKey.IS_LIVE, ID3v24FieldKey.IS_LIVE);
    this.tagFieldToId3.put(FieldKey.ITUNES_GROUPING, ID3v24FieldKey.ITUNES_GROUPING);
    this.tagFieldToId3.put(FieldKey.JAIKOZ_ID, ID3v24FieldKey.JAIKOZ_ID);
    this.tagFieldToId3.put(FieldKey.KEY, ID3v24FieldKey.KEY);
    this.tagFieldToId3.put(FieldKey.LANGUAGE, ID3v24FieldKey.LANGUAGE);
    this.tagFieldToId3.put(FieldKey.LYRICIST, ID3v24FieldKey.LYRICIST);
    this.tagFieldToId3.put(FieldKey.LYRICIST_SORT, ID3v24FieldKey.LYRICIST_SORT);
    this.tagFieldToId3.put(FieldKey.UNSYNC_LYRICS, ID3v24FieldKey.UNSYNC_LYRICS);
    this.tagFieldToId3.put(FieldKey.MEDIA, ID3v24FieldKey.MEDIA);
    this.tagFieldToId3.put(FieldKey.MIXER, ID3v24FieldKey.MIXER);
    this.tagFieldToId3.put(FieldKey.MIXER_SORT, ID3v24FieldKey.MIXER_SORT);
    this.tagFieldToId3.put(FieldKey.MOOD, ID3v24FieldKey.MOOD);
    this.tagFieldToId3.put(FieldKey.MOOD_ACOUSTIC, ID3v24FieldKey.MOOD_ACOUSTIC);
    this.tagFieldToId3.put(FieldKey.MOOD_AGGRESSIVE, ID3v24FieldKey.MOOD_AGGRESSIVE);
    this.tagFieldToId3.put(FieldKey.MOOD_AROUSAL, ID3v24FieldKey.MOOD_AROUSAL);
    this.tagFieldToId3.put(FieldKey.MOOD_DANCEABILITY, ID3v24FieldKey.MOOD_DANCEABILITY);
    this.tagFieldToId3.put(FieldKey.MOOD_HAPPY, ID3v24FieldKey.MOOD_HAPPY);
    this.tagFieldToId3.put(FieldKey.MOOD_INSTRUMENTAL, ID3v24FieldKey.MOOD_INSTRUMENTAL);
    this.tagFieldToId3.put(FieldKey.MOOD_PARTY, ID3v24FieldKey.MOOD_PARTY);
    this.tagFieldToId3.put(FieldKey.MOOD_RELAXED, ID3v24FieldKey.MOOD_RELAXED);
    this.tagFieldToId3.put(FieldKey.MOOD_SAD, ID3v24FieldKey.MOOD_SAD);
    this.tagFieldToId3.put(FieldKey.MOOD_VALENCE, ID3v24FieldKey.MOOD_VALENCE);
    this.tagFieldToId3.put(FieldKey.MOVEMENT, ID3v24FieldKey.MOVEMENT);
    this.tagFieldToId3.put(FieldKey.MOVEMENT_NO, ID3v24FieldKey.MOVEMENT_NO);
    this.tagFieldToId3.put(FieldKey.MOVEMENT_TOTAL, ID3v24FieldKey.MOVEMENT_TOTAL);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_ARTISTID, ID3v24FieldKey.MUSICBRAINZ_ARTISTID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_DISC_ID, ID3v24FieldKey.MUSICBRAINZ_DISC_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_ORIGINAL_RELEASE_ID, ID3v24FieldKey.MUSICBRAINZ_ORIGINAL_RELEASEID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASEARTISTID, ID3v24FieldKey.MUSICBRAINZ_RELEASEARTISTID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASEID, ID3v24FieldKey.MUSICBRAINZ_RELEASEID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY, ID3v24FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID, ID3v24FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_STATUS, ID3v24FieldKey.MUSICBRAINZ_RELEASE_STATUS);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID, ID3v24FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_TYPE, ID3v24FieldKey.MUSICBRAINZ_RELEASE_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_TRACK_ID, ID3v24FieldKey.MUSICBRAINZ_TRACK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK, ID3v24FieldKey.MUSICBRAINZ_WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RECORDING_WORK, ID3v24FieldKey.MUSICBRAINZ_RECORDING_WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RECORDING_WORK_ID, ID3v24FieldKey.MUSICBRAINZ_RECORDING_WORK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID, ID3v24FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID);
    this.tagFieldToId3.put(FieldKey.MUSICIP_ID, ID3v24FieldKey.MUSICIP_ID);
    this.tagFieldToId3.put(FieldKey.OCCASION, ID3v24FieldKey.OCCASION);
    this.tagFieldToId3.put(FieldKey.OPUS, ID3v24FieldKey.OPUS);
    this.tagFieldToId3.put(FieldKey.ORCHESTRA, ID3v24FieldKey.ORCHESTRA);
    this.tagFieldToId3.put(FieldKey.ORCHESTRA_SORT, ID3v24FieldKey.ORCHESTRA_SORT);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_ALBUM, ID3v24FieldKey.ORIGINAL_ALBUM);
    this.tagFieldToId3.put(FieldKey.ORIGINALRELEASEDATE, ID3v24FieldKey.ORIGINALRELEASEDATE);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_ARTIST, ID3v24FieldKey.ORIGINAL_ARTIST);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_LYRICIST, ID3v24FieldKey.ORIGINAL_LYRICIST);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_YEAR, ID3v24FieldKey.ORIGINAL_YEAR);
    this.tagFieldToId3.put(FieldKey.OVERALL_WORK, ID3v24FieldKey.OVERALL_WORK);
    this.tagFieldToId3.put(FieldKey.PART, ID3v24FieldKey.PART);
    this.tagFieldToId3.put(FieldKey.PART_NUMBER, ID3v24FieldKey.PART_NUMBER);
    this.tagFieldToId3.put(FieldKey.PART_TYPE, ID3v24FieldKey.PART_TYPE);
    this.tagFieldToId3.put(FieldKey.PERFORMER, ID3v24FieldKey.PERFORMER);
    this.tagFieldToId3.put(FieldKey.PERFORMER_NAME, ID3v24FieldKey.PERFORMER_NAME);
    this.tagFieldToId3.put(FieldKey.PERFORMER_NAME_SORT, ID3v24FieldKey.PERFORMER_NAME_SORT);
    this.tagFieldToId3.put(FieldKey.PERIOD, ID3v24FieldKey.PERIOD);
    this.tagFieldToId3.put(FieldKey.PRODUCER, ID3v24FieldKey.PRODUCER);
    this.tagFieldToId3.put(FieldKey.PRODUCER_SORT, ID3v24FieldKey.PRODUCER_SORT);
    this.tagFieldToId3.put(FieldKey.QUALITY, ID3v24FieldKey.QUALITY);
    this.tagFieldToId3.put(FieldKey.RANKING, ID3v24FieldKey.RANKING);
    this.tagFieldToId3.put(FieldKey.RATING, ID3v24FieldKey.RATING);
    this.tagFieldToId3.put(FieldKey.RECORD_LABEL, ID3v24FieldKey.RECORD_LABEL);
    this.tagFieldToId3.put(FieldKey.RECORDINGDATE, ID3v24FieldKey.RECORDINGDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGSTARTDATE, ID3v24FieldKey.RECORDINGSTARTDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGENDDATE, ID3v24FieldKey.RECORDINGENDDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGLOCATION, ID3v24FieldKey.RECORDINGLOCATION);
    this.tagFieldToId3.put(FieldKey.REMIXER, ID3v24FieldKey.REMIXER);
    this.tagFieldToId3.put(FieldKey.ROONALBUMTAG, ID3v24FieldKey.ROONALBUMTAG);
    this.tagFieldToId3.put(FieldKey.ROONTRACKTAG, ID3v24FieldKey.ROONTRACKTAG);
    this.tagFieldToId3.put(FieldKey.SCRIPT, ID3v24FieldKey.SCRIPT);
    this.tagFieldToId3.put(FieldKey.SECTION, ID3v24FieldKey.SECTION);
    this.tagFieldToId3.put(FieldKey.SINGLE_DISC_TRACK_NO, ID3v24FieldKey.SINGLE_DISC_TRACK_NO);
    this.tagFieldToId3.put(FieldKey.SONGKONG_ID, ID3v24FieldKey.SONGKONG_ID);
    this.tagFieldToId3.put(FieldKey.SUBTITLE, ID3v24FieldKey.SUBTITLE);
    this.tagFieldToId3.put(FieldKey.TAGS, ID3v24FieldKey.TAGS);
    this.tagFieldToId3.put(FieldKey.TEMPO, ID3v24FieldKey.TEMPO);
    this.tagFieldToId3.put(FieldKey.TIMBRE, ID3v24FieldKey.TIMBRE);
    this.tagFieldToId3.put(FieldKey.TITLE, ID3v24FieldKey.TITLE);
    this.tagFieldToId3.put(FieldKey.TITLE_MOVEMENT, ID3v24FieldKey.TITLE_MOVEMENT);
    this.tagFieldToId3.put(FieldKey.TITLE_SORT, ID3v24FieldKey.TITLE_SORT);
    this.tagFieldToId3.put(FieldKey.TONALITY, ID3v24FieldKey.TONALITY);
    this.tagFieldToId3.put(FieldKey.TRACK, ID3v24FieldKey.TRACK);
    this.tagFieldToId3.put(FieldKey.TRACK_TOTAL, ID3v24FieldKey.TRACK_TOTAL);
    this.tagFieldToId3.put(FieldKey.URL_DISCOGS_ARTIST_SITE, ID3v24FieldKey.URL_DISCOGS_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_DISCOGS_RELEASE_SITE, ID3v24FieldKey.URL_DISCOGS_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.URL_LYRICS_SITE, ID3v24FieldKey.URL_LYRICS_SITE);
    this.tagFieldToId3.put(FieldKey.URL_OFFICIAL_ARTIST_SITE, ID3v24FieldKey.URL_OFFICIAL_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_OFFICIAL_RELEASE_SITE, ID3v24FieldKey.URL_OFFICIAL_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.URL_WIKIPEDIA_ARTIST_SITE, ID3v24FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_WIKIPEDIA_RELEASE_SITE, ID3v24FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.WORK, ID3v24FieldKey.WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1, ID3v24FieldKey.WORK_PART_LEVEL1);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, ID3v24FieldKey.WORK_PART_LEVEL1_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2, ID3v24FieldKey.WORK_PART_LEVEL2);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, ID3v24FieldKey.WORK_PART_LEVEL2_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3, ID3v24FieldKey.WORK_PART_LEVEL3);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, ID3v24FieldKey.WORK_PARTOF_LEVEL3_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4, ID3v24FieldKey.WORK_PART_LEVEL4);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, ID3v24FieldKey.WORK_PART_LEVEL4_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5, ID3v24FieldKey.WORK_PART_LEVEL5);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, ID3v24FieldKey.WORK_PART_LEVEL5_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6, ID3v24FieldKey.WORK_PART_LEVEL6);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, ID3v24FieldKey.WORK_PART_LEVEL6_TYPE);
    this.tagFieldToId3.put(FieldKey.VERSION, ID3v24FieldKey.VERSION);
    this.tagFieldToId3.put(FieldKey.WORK_TYPE, ID3v24FieldKey.WORK_TYPE);
    this.tagFieldToId3.put(FieldKey.YEAR, ID3v24FieldKey.YEAR);
    populateId3ToTagField();
  }
  
  public static ID3v24Frames getInstanceOf() {
    if (id3v24Frames == null)
      id3v24Frames = new ID3v24Frames(); 
    return id3v24Frames;
  }
  
  private void populateId3ToTagField() {
    for (Map.Entry<FieldKey, ID3v24FieldKey> entry : this.tagFieldToId3.entrySet())
      this.id3ToTagField.put((ID3v24FieldKey)entry.getValue(), (FieldKey)entry.getKey()); 
  }
  
  public FieldKey getGenericKeyFromId3(ID3v24FieldKey paramID3v24FieldKey) {
    return this.id3ToTagField.get(paramID3v24FieldKey);
  }
  
  public ID3v24FieldKey getId3KeyFromGenericKey(FieldKey paramFieldKey) {
    return this.tagFieldToId3.get(paramFieldKey);
  }
  
  public void setITunes12_6WorkGroupingMode(boolean paramBoolean) {
    EnumMap<FieldKey, ID3v24FieldKey> enumMap = this.tagFieldToId3;
    if (paramBoolean) {
      enumMap.put(FieldKey.WORK, ID3v24FieldKey.GROUPING);
      this.tagFieldToId3.put(FieldKey.GROUPING, ID3v24FieldKey.ITUNES_GROUPING);
    } else {
      enumMap.put(FieldKey.WORK, ID3v24FieldKey.WORK);
      this.tagFieldToId3.put(FieldKey.GROUPING, ID3v24FieldKey.GROUPING);
    } 
    populateId3ToTagField();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v24Frames.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */