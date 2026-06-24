package org.jaudiotagger.tag.id3;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.utils.SgV.zpEN;
import java.util.EnumMap;
import java.util.Map;
import java.util.TreeSet;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.datatype.AbstractValuePair;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public class ID3v23Frames extends ID3Frames {
  public static final String FRAME_ID_V3_ACCOMPANIMENT = "TPE2";
  
  public static final String FRAME_ID_V3_ALBUM = "TALB";
  
  public static final String FRAME_ID_V3_ALBUM_ARTIST_SORT_ORDER_ITUNES = "TSO2";
  
  public static final String FRAME_ID_V3_ALBUM_SORT_ORDER_ITUNES = "TSOA";
  
  public static final String FRAME_ID_V3_ALBUM_SORT_ORDER_MUSICBRAINZ = "XSOA";
  
  public static final String FRAME_ID_V3_ARTIST = "TPE1";
  
  public static final String FRAME_ID_V3_ARTIST_SORT_ORDER_ITUNES = "TSOP";
  
  public static final String FRAME_ID_V3_ARTIST_SORT_ORDER_MUSICBRAINZ = "XSOP";
  
  public static final String FRAME_ID_V3_ATTACHED_PICTURE = "APIC";
  
  public static final String FRAME_ID_V3_AUDIO_ENCRYPTION = "AENC";
  
  public static final String FRAME_ID_V3_BPM = "TBPM";
  
  public static final String FRAME_ID_V3_CHAPTER = "CHAP";
  
  public static final String FRAME_ID_V3_CHAPTER_TOC = "CTOC";
  
  public static final String FRAME_ID_V3_COMMENT = "COMM";
  
  public static final String FRAME_ID_V3_COMMERCIAL_FRAME = "COMR";
  
  public static final String FRAME_ID_V3_COMPOSER = "TCOM";
  
  public static final String FRAME_ID_V3_COMPOSER_SORT_ORDER_ITUNES = "TSOC";
  
  public static final String FRAME_ID_V3_CONDUCTOR = "TPE3";
  
  public static final String FRAME_ID_V3_CONTENT_GROUP_DESC = "TIT1";
  
  public static final String FRAME_ID_V3_COPYRIGHTINFO = "TCOP";
  
  public static final String FRAME_ID_V3_ENCODEDBY = "TENC";
  
  public static final String FRAME_ID_V3_ENCRYPTION = "ENCR";
  
  public static final String FRAME_ID_V3_EQUALISATION = "EQUA";
  
  public static final String FRAME_ID_V3_EVENT_TIMING_CODES = "ETCO";
  
  public static final String FRAME_ID_V3_FILE_OWNER = "TOWN";
  
  public static final String FRAME_ID_V3_FILE_TYPE = "TFLT";
  
  public static final String FRAME_ID_V3_GENERAL_ENCAPS_OBJECT = "GEOB";
  
  public static final String FRAME_ID_V3_GENRE = "TCON";
  
  public static final String FRAME_ID_V3_GROUP_ID_REG = "GRID";
  
  public static final String FRAME_ID_V3_HW_SW_SETTINGS = "TSSE";
  
  public static final String FRAME_ID_V3_INITIAL_KEY = "TKEY";
  
  public static final String FRAME_ID_V3_INVOLVED_PEOPLE = "IPLS";
  
  public static final String FRAME_ID_V3_ISRC = "TSRC";
  
  public static final String FRAME_ID_V3_IS_COMPILATION = "TCMP";
  
  public static final String FRAME_ID_V3_ITUNES_GROUPING = "GRP1";
  
  public static final String FRAME_ID_V3_LANGUAGE = "TLAN";
  
  public static final String FRAME_ID_V3_LENGTH = "TLEN";
  
  public static final String FRAME_ID_V3_LINKED_INFO = "LINK";
  
  public static final String FRAME_ID_V3_LYRICIST = "TEXT";
  
  public static final String FRAME_ID_V3_MEDIA_TYPE = "TMED";
  
  public static final String FRAME_ID_V3_MOVEMENT = "MVNM";
  
  public static final String FRAME_ID_V3_MOVEMENT_NO = "MVIN";
  
  public static final String FRAME_ID_V3_MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
  
  public static final String FRAME_ID_V3_MUSIC_CD_ID = "MCDI";
  
  public static final String FRAME_ID_V3_ORIGARTIST = "TOPE";
  
  public static final String FRAME_ID_V3_ORIG_FILENAME = "TOFN";
  
  public static final String FRAME_ID_V3_ORIG_LYRICIST = "TOLY";
  
  public static final String FRAME_ID_V3_ORIG_TITLE = "TOAL";
  
  public static final String FRAME_ID_V3_OWNERSHIP = "OWNE";
  
  public static final String FRAME_ID_V3_PLAYLIST_DELAY = "TDLY";
  
  public static final String FRAME_ID_V3_PLAY_COUNTER = "PCNT";
  
  public static final String FRAME_ID_V3_POPULARIMETER = "POPM";
  
  public static final String FRAME_ID_V3_POSITION_SYNC = "POSS";
  
  public static final String FRAME_ID_V3_PRIVATE = "PRIV";
  
  public static final String FRAME_ID_V3_PUBLISHER = "TPUB";
  
  public static final String FRAME_ID_V3_RADIO_NAME = "TRSN";
  
  public static final String FRAME_ID_V3_RADIO_OWNER = "TRSO";
  
  public static final String FRAME_ID_V3_RECOMMENDED_BUFFER_SIZE = "RBUF";
  
  public static final String FRAME_ID_V3_RELATIVE_VOLUME_ADJUSTMENT = "RVAD";
  
  public static final String FRAME_ID_V3_REMIXED = "TPE4";
  
  public static final String FRAME_ID_V3_REVERB = "RVRB";
  
  public static final String FRAME_ID_V3_SET = "TPOS";
  
  public static final String FRAME_ID_V3_SET_SUBTITLE = "TSST";
  
  public static final String FRAME_ID_V3_SYNC_LYRICS = "SYLT";
  
  public static final String FRAME_ID_V3_SYNC_TEMPO = "SYTC";
  
  public static final String FRAME_ID_V3_TDAT = "TDAT";
  
  public static final String FRAME_ID_V3_TERMS_OF_USE = "USER";
  
  public static final String FRAME_ID_V3_TIME = "TIME";
  
  public static final String FRAME_ID_V3_TITLE = "TIT2";
  
  public static final String FRAME_ID_V3_TITLE_REFINEMENT = "TIT3";
  
  public static final String FRAME_ID_V3_TITLE_SORT_ORDER_ITUNES = "TSOT";
  
  public static final String FRAME_ID_V3_TITLE_SORT_ORDER_MUSICBRAINZ = "XSOT";
  
  public static final String FRAME_ID_V3_TORY = "TORY";
  
  public static final String FRAME_ID_V3_TRACK = "TRCK";
  
  public static final String FRAME_ID_V3_TRDA = "TRDA";
  
  public static final String FRAME_ID_V3_TSIZ = "TSIZ";
  
  public static final String FRAME_ID_V3_TYER = "TYER";
  
  public static final String FRAME_ID_V3_UNIQUE_FILE_ID = "UFID";
  
  public static final String FRAME_ID_V3_UNSYNC_LYRICS = "USLT";
  
  public static final String FRAME_ID_V3_URL_ARTIST_WEB = "WOAR";
  
  public static final String FRAME_ID_V3_URL_COMMERCIAL = "WCOM";
  
  public static final String FRAME_ID_V3_URL_COPYRIGHT = "WCOP";
  
  public static final String FRAME_ID_V3_URL_FILE_WEB = "WOAF";
  
  public static final String FRAME_ID_V3_URL_OFFICIAL_RADIO = "WORS";
  
  public static final String FRAME_ID_V3_URL_PAYMENT = "WPAY";
  
  public static final String FRAME_ID_V3_URL_PUBLISHERS = "WPUB";
  
  public static final String FRAME_ID_V3_URL_SOURCE_WEB = "WOAS";
  
  public static final String FRAME_ID_V3_USER_DEFINED_INFO = "TXXX";
  
  public static final String FRAME_ID_V3_USER_DEFINED_URL = "WXXX";
  
  private static ID3v23Frames id3v23Frames;
  
  protected EnumMap<ID3v23FieldKey, FieldKey> id3ToTagField = new EnumMap<ID3v23FieldKey, FieldKey>(ID3v23FieldKey.class);
  
  protected EnumMap<FieldKey, ID3v23FieldKey> tagFieldToId3 = new EnumMap<FieldKey, ID3v23FieldKey>(FieldKey.class);
  
  private ID3v23Frames() {
    this.supportedFrames.add("TPE2");
    this.supportedFrames.add("TALB");
    this.supportedFrames.add("TPE1");
    this.supportedFrames.add("APIC");
    this.supportedFrames.add("AENC");
    this.supportedFrames.add("TBPM");
    this.supportedFrames.add("CHAP");
    this.supportedFrames.add("CTOC");
    this.supportedFrames.add("COMM");
    this.supportedFrames.add("COMR");
    this.supportedFrames.add("TCOM");
    this.supportedFrames.add("TPE3");
    this.supportedFrames.add("TIT1");
    this.supportedFrames.add(eRUgfgGAccgka.uslPc);
    this.supportedFrames.add("TENC");
    this.supportedFrames.add("ENCR");
    this.supportedFrames.add("EQUA");
    TreeSet<String> treeSet = this.supportedFrames;
    String str = GMDx.elH;
    treeSet.add(str);
    this.supportedFrames.add("TOWN");
    this.supportedFrames.add("TFLT");
    this.supportedFrames.add("GEOB");
    this.supportedFrames.add("TCON");
    this.supportedFrames.add("GRID");
    this.supportedFrames.add("TSSE");
    this.supportedFrames.add("TKEY");
    this.supportedFrames.add("IPLS");
    this.supportedFrames.add("TSRC");
    this.supportedFrames.add("GRP1");
    this.supportedFrames.add("TLAN");
    this.supportedFrames.add("TLEN");
    this.supportedFrames.add("LINK");
    this.supportedFrames.add("TEXT");
    this.supportedFrames.add("TMED");
    this.supportedFrames.add("MLLT");
    this.supportedFrames.add("MVNM");
    this.supportedFrames.add("MVIN");
    this.supportedFrames.add(nFLlOYeP.qKxphOkbl);
    this.supportedFrames.add("TOPE");
    this.supportedFrames.add("TOFN");
    this.supportedFrames.add("TOLY");
    this.supportedFrames.add("TOAL");
    this.supportedFrames.add("OWNE");
    this.supportedFrames.add(PwbbJfsdcHrAjW.DLlrlgAv);
    this.supportedFrames.add("PCNT");
    this.supportedFrames.add("POPM");
    this.supportedFrames.add("POSS");
    this.supportedFrames.add("PRIV");
    this.supportedFrames.add("TPUB");
    this.supportedFrames.add("TRSN");
    this.supportedFrames.add("TRSO");
    this.supportedFrames.add("RBUF");
    this.supportedFrames.add("RVAD");
    this.supportedFrames.add("TPE4");
    this.supportedFrames.add("RVRB");
    this.supportedFrames.add("TPOS");
    this.supportedFrames.add("TSST");
    this.supportedFrames.add("SYLT");
    this.supportedFrames.add("SYTC");
    this.supportedFrames.add("TDAT");
    this.supportedFrames.add("USER");
    this.supportedFrames.add("TIME");
    this.supportedFrames.add("TIT2");
    this.supportedFrames.add("TIT3");
    this.supportedFrames.add(ckOPp.dUicHtiLPXtLt);
    this.supportedFrames.add("TRCK");
    this.supportedFrames.add("TRDA");
    this.supportedFrames.add("TSIZ");
    this.supportedFrames.add("TYER");
    this.supportedFrames.add("UFID");
    this.supportedFrames.add("USLT");
    this.supportedFrames.add("WOAR");
    this.supportedFrames.add("WCOM");
    this.supportedFrames.add("WCOP");
    this.supportedFrames.add("WOAF");
    this.supportedFrames.add("WORS");
    this.supportedFrames.add("WPAY");
    this.supportedFrames.add(zpEN.RWWmgiqtTFpopr);
    this.supportedFrames.add("WOAS");
    this.supportedFrames.add("TXXX");
    this.supportedFrames.add("WXXX");
    this.extensionFrames.add("TCMP");
    this.extensionFrames.add("TSOT");
    this.extensionFrames.add("TSOP");
    this.extensionFrames.add("TSOA");
    this.extensionFrames.add("XSOT");
    this.extensionFrames.add(hbrAVtEa.BWXDjUqPKuuO);
    this.extensionFrames.add("XSOA");
    this.extensionFrames.add("TSO2");
    this.extensionFrames.add("TSOC");
    this.commonFrames.add("TPE1");
    this.commonFrames.add("TALB");
    this.commonFrames.add("TIT2");
    this.commonFrames.add("TCON");
    this.commonFrames.add("TRCK");
    this.commonFrames.add("TYER");
    this.commonFrames.add("COMM");
    this.binaryFrames.add("APIC");
    this.binaryFrames.add("AENC");
    this.binaryFrames.add("ENCR");
    this.binaryFrames.add("EQUA");
    this.binaryFrames.add(str);
    this.binaryFrames.add("GEOB");
    this.binaryFrames.add("RVAD");
    this.binaryFrames.add("RBUF");
    this.binaryFrames.add("UFID");
    ((AbstractValuePair)this).idToValue.put("TPE2", "Text: Band/Orchestra/Accompaniment");
    ((AbstractValuePair)this).idToValue.put("TALB", "Text: Album/Movie/Show title");
    ((AbstractValuePair)this).idToValue.put("TPE1", "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
    ((AbstractValuePair)this).idToValue.put("APIC", "Attached picture");
    ((AbstractValuePair)this).idToValue.put("AENC", "Audio encryption");
    ((AbstractValuePair)this).idToValue.put("TBPM", "Text: BPM (Beats Per Minute)");
    ((AbstractValuePair)this).idToValue.put("CHAP", "Chapter");
    ((AbstractValuePair)this).idToValue.put("CTOC", "Chapter TOC");
    ((AbstractValuePair)this).idToValue.put("COMM", "Comments");
    ((AbstractValuePair)this).idToValue.put("COMR", "");
    ((AbstractValuePair)this).idToValue.put("TCOM", "Text: Composer");
    ((AbstractValuePair)this).idToValue.put("TPE3", "Text: Conductor/Performer refinement");
    ((AbstractValuePair)this).idToValue.put("TIT1", "Text: Content group description");
    ((AbstractValuePair)this).idToValue.put("TCOP", "Text: Copyright message");
    ((AbstractValuePair)this).idToValue.put("TENC", "Text: Encoded by");
    ((AbstractValuePair)this).idToValue.put("ENCR", "Encryption method registration");
    ((AbstractValuePair)this).idToValue.put("EQUA", "Equalization");
    ((AbstractValuePair)this).idToValue.put(str, "Event timing codes");
    ((AbstractValuePair)this).idToValue.put("TOWN", "");
    ((AbstractValuePair)this).idToValue.put("TFLT", "Text: File type");
    ((AbstractValuePair)this).idToValue.put("GEOB", "General encapsulated datatype");
    ((AbstractValuePair)this).idToValue.put("TCON", GMDx.hQQSc);
    ((AbstractValuePair)this).idToValue.put("GRID", "");
    ((AbstractValuePair)this).idToValue.put("TSSE", "Text: Software/hardware and settings used for encoding");
    ((AbstractValuePair)this).idToValue.put("TKEY", "Text: Initial key");
    ((AbstractValuePair)this).idToValue.put("IPLS", "Involved people list");
    ((AbstractValuePair)this).idToValue.put("TSRC", "Text: ISRC (International Standard Recording Code)");
    ((AbstractValuePair)this).idToValue.put("GRP1", "Text: iTunes Grouping");
    ((AbstractValuePair)this).idToValue.put("TLAN", "Text: Language(s)");
    ((AbstractValuePair)this).idToValue.put("TLEN", "Text: Length");
    ((AbstractValuePair)this).idToValue.put(fXMDNeMWaILNVh.vzFBqhPfj, "Linked information");
    ((AbstractValuePair)this).idToValue.put("TEXT", "Text: Lyricist/text writer");
    ((AbstractValuePair)this).idToValue.put("TMED", "Text: Media type");
    ((AbstractValuePair)this).idToValue.put("MVNM", "Text: Movement");
    ((AbstractValuePair)this).idToValue.put("MVIN", "Text: Movement No");
    ((AbstractValuePair)this).idToValue.put("MLLT", "MPEG location lookup table");
    ((AbstractValuePair)this).idToValue.put("MCDI", "Music CD Identifier");
    ((AbstractValuePair)this).idToValue.put("TOPE", "Text: Original artist(s)/performer(s)");
    ((AbstractValuePair)this).idToValue.put("TOFN", "Text: Original filename");
    ((AbstractValuePair)this).idToValue.put("TOLY", "Text: Original Lyricist(s)/text writer(s)");
    ((AbstractValuePair)this).idToValue.put("TOAL", "Text: Original album/Movie/Show title");
    ((AbstractValuePair)this).idToValue.put("OWNE", "");
    ((AbstractValuePair)this).idToValue.put("TDLY", "Text: Playlist delay");
    ((AbstractValuePair)this).idToValue.put(IGBYXeDFmKYajx.XRUtKhQkOAyhg, "Play counter");
    ((AbstractValuePair)this).idToValue.put("POPM", "Popularimeter");
    ((AbstractValuePair)this).idToValue.put("POSS", "Position Sync");
    ((AbstractValuePair)this).idToValue.put("PRIV", "Private frame");
    ((AbstractValuePair)this).idToValue.put("TPUB", "Text: Publisher");
    ((AbstractValuePair)this).idToValue.put("TRSN", "");
    ((AbstractValuePair)this).idToValue.put("TRSO", "");
    ((AbstractValuePair)this).idToValue.put("RBUF", oXrNDUqUkE.Xgci);
    ((AbstractValuePair)this).idToValue.put("RVAD", "Relative volume adjustment");
    ((AbstractValuePair)this).idToValue.put("TPE4", "Text: Interpreted, remixed, or otherwise modified by");
    ((AbstractValuePair)this).idToValue.put("RVRB", "Reverb");
    ((AbstractValuePair)this).idToValue.put("TPOS", "Text: Part of a setField");
    ((AbstractValuePair)this).idToValue.put("TSST", "Text: SubTitle");
    ((AbstractValuePair)this).idToValue.put("SYLT", jLnXOLx.QOKKjuVxgQl);
    ((AbstractValuePair)this).idToValue.put("SYTC", "Synced tempo codes");
    ((AbstractValuePair)this).idToValue.put(PwbbJfsdcHrAjW.PTJTOMN, "Text: Date");
    ((AbstractValuePair)this).idToValue.put("USER", "");
    ((AbstractValuePair)this).idToValue.put("TIME", uvJYmft.PlMbd);
    ((AbstractValuePair)this).idToValue.put("TIT2", "Text: Title/Songname/Content description");
    ((AbstractValuePair)this).idToValue.put("TIT3", "Text: Subtitle/Description refinement");
    ((AbstractValuePair)this).idToValue.put("TORY", "Text: Original release year");
    ((AbstractValuePair)this).idToValue.put("TRCK", "Text: Track number/Position in setField");
    ((AbstractValuePair)this).idToValue.put("TRDA", "Text: Recording dates");
    ((AbstractValuePair)this).idToValue.put("TSIZ", "Text: Size");
    ((AbstractValuePair)this).idToValue.put("TYER", "Text: Year");
    ((AbstractValuePair)this).idToValue.put("UFID", "Unique file identifier");
    ((AbstractValuePair)this).idToValue.put("USLT", "Unsychronized lyric/text transcription");
    ((AbstractValuePair)this).idToValue.put("WOAR", "URL: Official artist/performer webpage");
    ((AbstractValuePair)this).idToValue.put("WCOM", "URL: Commercial information");
    ((AbstractValuePair)this).idToValue.put("WCOP", "URL: Copyright/Legal information");
    ((AbstractValuePair)this).idToValue.put("WOAF", "URL: Official audio file webpage");
    ((AbstractValuePair)this).idToValue.put("WORS", "Official Radio");
    ((AbstractValuePair)this).idToValue.put("WPAY", "URL: Payment");
    ((AbstractValuePair)this).idToValue.put("WPUB", "URL: Publishers official webpage");
    ((AbstractValuePair)this).idToValue.put(jHxlGgUTadw.rrZHEeB, "URL: Official audio source webpage");
    ((AbstractValuePair)this).idToValue.put("TXXX", "User defined text information frame");
    ((AbstractValuePair)this).idToValue.put("WXXX", "User defined URL link frame");
    ((AbstractValuePair)this).idToValue.put("TCMP", "Is Compilation");
    ((AbstractValuePair)this).idToValue.put("TSOT", "Text: title sort order");
    ((AbstractValuePair)this).idToValue.put("TSOP", "Text: artist sort order");
    ((AbstractValuePair)this).idToValue.put("TSOA", "Text: album sort order");
    ((AbstractValuePair)this).idToValue.put("XSOT", "Text: title sort order");
    ((AbstractValuePair)this).idToValue.put("XSOP", "Text: artist sort order");
    ((AbstractValuePair)this).idToValue.put("XSOA", "Text: album sort order");
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
    this.discardIfFileAlteredFrames.add(str);
    this.discardIfFileAlteredFrames.add("EQUA");
    this.discardIfFileAlteredFrames.add("MLLT");
    this.discardIfFileAlteredFrames.add("POSS");
    this.discardIfFileAlteredFrames.add("SYTC");
    this.discardIfFileAlteredFrames.add("RVAD");
    this.discardIfFileAlteredFrames.add(str);
    this.discardIfFileAlteredFrames.add("TENC");
    this.discardIfFileAlteredFrames.add("TLEN");
    this.discardIfFileAlteredFrames.add("TSIZ");
    this.tagFieldToId3.put(FieldKey.ACOUSTID_FINGERPRINT, ID3v23FieldKey.ACOUSTID_FINGERPRINT);
    this.tagFieldToId3.put(FieldKey.ACOUSTID_ID, ID3v23FieldKey.ACOUSTID_ID);
    this.tagFieldToId3.put(FieldKey.ALBUM, ID3v23FieldKey.ALBUM);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTIST, ID3v23FieldKey.ALBUM_ARTIST);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTIST_SORT, ID3v23FieldKey.ALBUM_ARTIST_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTISTS, ID3v23FieldKey.ALBUM_ARTISTS);
    this.tagFieldToId3.put(FieldKey.ALBUM_ARTISTS_SORT, ID3v23FieldKey.ALBUM_ARTISTS_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_SORT, ID3v23FieldKey.ALBUM_SORT);
    this.tagFieldToId3.put(FieldKey.ALBUM_YEAR, ID3v23FieldKey.ALBUM_YEAR);
    this.tagFieldToId3.put(FieldKey.AMAZON_ID, ID3v23FieldKey.AMAZON_ID);
    this.tagFieldToId3.put(FieldKey.ARRANGER, ID3v23FieldKey.ARRANGER);
    this.tagFieldToId3.put(FieldKey.ARRANGER_SORT, ID3v23FieldKey.ARRANGER_SORT);
    this.tagFieldToId3.put(FieldKey.ARTIST, ID3v23FieldKey.ARTIST);
    this.tagFieldToId3.put(FieldKey.ARTISTS, ID3v23FieldKey.ARTISTS);
    this.tagFieldToId3.put(FieldKey.ARTISTS_SORT, ID3v23FieldKey.ARTISTS_SORT);
    this.tagFieldToId3.put(FieldKey.ARTIST_SORT, ID3v23FieldKey.ARTIST_SORT);
    this.tagFieldToId3.put(FieldKey.BARCODE, ID3v23FieldKey.BARCODE);
    this.tagFieldToId3.put(FieldKey.BPM, ID3v23FieldKey.BPM);
    this.tagFieldToId3.put(FieldKey.CATALOG_NO, ID3v23FieldKey.CATALOG_NO);
    this.tagFieldToId3.put(FieldKey.CHOIR, ID3v23FieldKey.CHOIR);
    this.tagFieldToId3.put(FieldKey.CHOIR_SORT, ID3v23FieldKey.CHOIR_SORT);
    this.tagFieldToId3.put(FieldKey.CLASSICAL_CATALOG, ID3v23FieldKey.CLASSICAL_CATALOG);
    this.tagFieldToId3.put(FieldKey.CLASSICAL_NICKNAME, ID3v23FieldKey.CLASSICAL_NICKNAME);
    this.tagFieldToId3.put(FieldKey.COMMENT, ID3v23FieldKey.COMMENT);
    this.tagFieldToId3.put(FieldKey.COMPOSER, ID3v23FieldKey.COMPOSER);
    this.tagFieldToId3.put(FieldKey.COMPOSER_SORT, ID3v23FieldKey.COMPOSER_SORT);
    this.tagFieldToId3.put(FieldKey.CONDUCTOR, ID3v23FieldKey.CONDUCTOR);
    this.tagFieldToId3.put(FieldKey.CONDUCTOR_SORT, ID3v23FieldKey.CONDUCTOR_SORT);
    this.tagFieldToId3.put(FieldKey.COPYRIGHT, ID3v23FieldKey.COPYRIGHT);
    this.tagFieldToId3.put(FieldKey.COUNTRY, ID3v23FieldKey.COUNTRY);
    this.tagFieldToId3.put(FieldKey.COVER_ART, ID3v23FieldKey.COVER_ART);
    this.tagFieldToId3.put(FieldKey.CUSTOM1, ID3v23FieldKey.CUSTOM1);
    this.tagFieldToId3.put(FieldKey.CUSTOM2, ID3v23FieldKey.CUSTOM2);
    this.tagFieldToId3.put(FieldKey.CUSTOM3, ID3v23FieldKey.CUSTOM3);
    this.tagFieldToId3.put(FieldKey.CUSTOM4, ID3v23FieldKey.CUSTOM4);
    this.tagFieldToId3.put(FieldKey.CUSTOM5, ID3v23FieldKey.CUSTOM5);
    EnumMap<FieldKey, ID3v23FieldKey> enumMap = this.tagFieldToId3;
    FieldKey fieldKey = FieldKey.DISC_NO;
    ID3v23FieldKey iD3v23FieldKey = ID3v23FieldKey.DISC_NO;
    enumMap.put(fieldKey, iD3v23FieldKey);
    this.tagFieldToId3.put(FieldKey.DISC_SUBTITLE, ID3v23FieldKey.DISC_SUBTITLE);
    this.tagFieldToId3.put(FieldKey.DISC_TOTAL, iD3v23FieldKey);
    this.tagFieldToId3.put(FieldKey.DJMIXER, ID3v23FieldKey.DJMIXER);
    this.tagFieldToId3.put(FieldKey.DJMIXER_SORT, ID3v23FieldKey.DJMIXER_SORT);
    this.tagFieldToId3.put(FieldKey.MOOD_ELECTRONIC, ID3v23FieldKey.MOOD_ELECTRONIC);
    this.tagFieldToId3.put(FieldKey.ENCODER, ID3v23FieldKey.ENCODER);
    this.tagFieldToId3.put(FieldKey.ENGINEER, ID3v23FieldKey.ENGINEER);
    this.tagFieldToId3.put(FieldKey.ENGINEER_SORT, ID3v23FieldKey.ENGINEER_SORT);
    this.tagFieldToId3.put(FieldKey.ENSEMBLE, ID3v23FieldKey.ENSEMBLE);
    this.tagFieldToId3.put(FieldKey.ENSEMBLE_SORT, ID3v23FieldKey.ENSEMBLE_SORT);
    this.tagFieldToId3.put(FieldKey.FBPM, ID3v23FieldKey.FBPM);
    this.tagFieldToId3.put(FieldKey.GENRE, ID3v23FieldKey.GENRE);
    this.tagFieldToId3.put(FieldKey.GROUP, ID3v23FieldKey.GROUP);
    this.tagFieldToId3.put(FieldKey.GROUPING, ID3v23FieldKey.GROUPING);
    this.tagFieldToId3.put(FieldKey.INSTRUMENT, ID3v23FieldKey.INSTRUMENT);
    this.tagFieldToId3.put(FieldKey.INVOLVEDPEOPLE, ID3v23FieldKey.INVOLVEDPEOPLE);
    this.tagFieldToId3.put(FieldKey.IPI, ID3v23FieldKey.IPI);
    this.tagFieldToId3.put(FieldKey.ISRC, ID3v23FieldKey.ISRC);
    this.tagFieldToId3.put(FieldKey.ISWC, ID3v23FieldKey.ISWC);
    this.tagFieldToId3.put(FieldKey.IS_CLASSICAL, ID3v23FieldKey.IS_CLASSICAL);
    this.tagFieldToId3.put(FieldKey.IS_COMPILATION, ID3v23FieldKey.IS_COMPILATION);
    this.tagFieldToId3.put(FieldKey.IS_GREATEST_HITS, ID3v23FieldKey.IS_GREATEST_HITS);
    this.tagFieldToId3.put(FieldKey.IS_HD, ID3v23FieldKey.IS_HD);
    this.tagFieldToId3.put(FieldKey.IS_LIVE, ID3v23FieldKey.IS_LIVE);
    this.tagFieldToId3.put(FieldKey.IS_SOUNDTRACK, ID3v23FieldKey.IS_SOUNDTRACK);
    this.tagFieldToId3.put(FieldKey.ITUNES_GROUPING, ID3v23FieldKey.ITUNES_GROUPING);
    this.tagFieldToId3.put(FieldKey.JAIKOZ_ID, ID3v23FieldKey.JAIKOZ_ID);
    this.tagFieldToId3.put(FieldKey.KEY, ID3v23FieldKey.KEY);
    this.tagFieldToId3.put(FieldKey.LANGUAGE, ID3v23FieldKey.LANGUAGE);
    this.tagFieldToId3.put(FieldKey.LYRICIST, ID3v23FieldKey.LYRICIST);
    this.tagFieldToId3.put(FieldKey.LYRICIST_SORT, ID3v23FieldKey.LYRICIST_SORT);
    this.tagFieldToId3.put(FieldKey.UNSYNC_LYRICS, ID3v23FieldKey.UNSYNC_LYRICS);
    this.tagFieldToId3.put(FieldKey.MEDIA, ID3v23FieldKey.MEDIA);
    this.tagFieldToId3.put(FieldKey.MIXER, ID3v23FieldKey.MIXER);
    this.tagFieldToId3.put(FieldKey.MIXER_SORT, ID3v23FieldKey.MIXER_SORT);
    this.tagFieldToId3.put(FieldKey.MOOD, ID3v23FieldKey.MOOD);
    this.tagFieldToId3.put(FieldKey.MOOD_ACOUSTIC, ID3v23FieldKey.MOOD_ACOUSTIC);
    this.tagFieldToId3.put(FieldKey.MOOD_AGGRESSIVE, ID3v23FieldKey.MOOD_AGGRESSIVE);
    this.tagFieldToId3.put(FieldKey.MOOD_AROUSAL, ID3v23FieldKey.MOOD_AROUSAL);
    this.tagFieldToId3.put(FieldKey.MOOD_DANCEABILITY, ID3v23FieldKey.MOOD_DANCEABILITY);
    this.tagFieldToId3.put(FieldKey.MOOD_HAPPY, ID3v23FieldKey.MOOD_HAPPY);
    this.tagFieldToId3.put(FieldKey.MOOD_INSTRUMENTAL, ID3v23FieldKey.MOOD_INSTRUMENTAL);
    this.tagFieldToId3.put(FieldKey.MOOD_PARTY, ID3v23FieldKey.MOOD_PARTY);
    this.tagFieldToId3.put(FieldKey.MOOD_RELAXED, ID3v23FieldKey.MOOD_RELAXED);
    this.tagFieldToId3.put(FieldKey.MOOD_SAD, ID3v23FieldKey.MOOD_SAD);
    this.tagFieldToId3.put(FieldKey.MOOD_VALENCE, ID3v23FieldKey.MOOD_VALENCE);
    this.tagFieldToId3.put(FieldKey.MOVEMENT, ID3v23FieldKey.MOVEMENT);
    this.tagFieldToId3.put(FieldKey.MOVEMENT_NO, ID3v23FieldKey.MOVEMENT_NO);
    this.tagFieldToId3.put(FieldKey.MOVEMENT_TOTAL, ID3v23FieldKey.MOVEMENT_TOTAL);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_ARTISTID, ID3v23FieldKey.MUSICBRAINZ_ARTISTID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_DISC_ID, ID3v23FieldKey.MUSICBRAINZ_DISC_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_ORIGINAL_RELEASE_ID, ID3v23FieldKey.MUSICBRAINZ_ORIGINAL_RELEASEID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASEARTISTID, ID3v23FieldKey.MUSICBRAINZ_RELEASEARTISTID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASEID, ID3v23FieldKey.MUSICBRAINZ_RELEASEID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY, ID3v23FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID, ID3v23FieldKey.MUSICBRAINZ_RELEASE_GROUP_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_STATUS, ID3v23FieldKey.MUSICBRAINZ_RELEASE_STATUS);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID, ID3v23FieldKey.MUSICBRAINZ_RELEASE_TRACK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RELEASE_TYPE, ID3v23FieldKey.MUSICBRAINZ_RELEASE_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_TRACK_ID, ID3v23FieldKey.MUSICBRAINZ_TRACK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK, ID3v23FieldKey.MUSICBRAINZ_WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RECORDING_WORK_ID, ID3v23FieldKey.MUSICBRAINZ_RECORDING_WORK_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_ID);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID, ID3v23FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_ID);
    this.tagFieldToId3.put(FieldKey.MUSICIP_ID, ID3v23FieldKey.MUSICIP_ID);
    this.tagFieldToId3.put(FieldKey.OCCASION, ID3v23FieldKey.OCCASION);
    this.tagFieldToId3.put(FieldKey.OPUS, ID3v23FieldKey.OPUS);
    this.tagFieldToId3.put(FieldKey.ORCHESTRA, ID3v23FieldKey.ORCHESTRA);
    this.tagFieldToId3.put(FieldKey.ORCHESTRA_SORT, ID3v23FieldKey.ORCHESTRA_SORT);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_ALBUM, ID3v23FieldKey.ORIGINAL_ALBUM);
    this.tagFieldToId3.put(FieldKey.ORIGINALRELEASEDATE, ID3v23FieldKey.ORIGINALRELEASEDATE);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_ARTIST, ID3v23FieldKey.ORIGINAL_ARTIST);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_LYRICIST, ID3v23FieldKey.ORIGINAL_LYRICIST);
    this.tagFieldToId3.put(FieldKey.ORIGINAL_YEAR, ID3v23FieldKey.ORIGINAL_YEAR);
    this.tagFieldToId3.put(FieldKey.OVERALL_WORK, ID3v23FieldKey.OVERALL_WORK);
    this.tagFieldToId3.put(FieldKey.PART, ID3v23FieldKey.PART);
    this.tagFieldToId3.put(FieldKey.PART_NUMBER, ID3v23FieldKey.PART_NUMBER);
    this.tagFieldToId3.put(FieldKey.PART_TYPE, ID3v23FieldKey.PART_TYPE);
    this.tagFieldToId3.put(FieldKey.PERFORMER, ID3v23FieldKey.PERFORMER);
    this.tagFieldToId3.put(FieldKey.PERFORMER_NAME, ID3v23FieldKey.PERFORMER_NAME);
    this.tagFieldToId3.put(FieldKey.PERFORMER_NAME_SORT, ID3v23FieldKey.PERFORMER_NAME_SORT);
    this.tagFieldToId3.put(FieldKey.PERIOD, ID3v23FieldKey.PERIOD);
    this.tagFieldToId3.put(FieldKey.PRODUCER, ID3v23FieldKey.PRODUCER);
    this.tagFieldToId3.put(FieldKey.PRODUCER_SORT, ID3v23FieldKey.PRODUCER_SORT);
    this.tagFieldToId3.put(FieldKey.QUALITY, ID3v23FieldKey.QUALITY);
    this.tagFieldToId3.put(FieldKey.RANKING, ID3v23FieldKey.RANKING);
    this.tagFieldToId3.put(FieldKey.RATING, ID3v23FieldKey.RATING);
    this.tagFieldToId3.put(FieldKey.RECORD_LABEL, ID3v23FieldKey.RECORD_LABEL);
    this.tagFieldToId3.put(FieldKey.RECORDINGDATE, ID3v23FieldKey.RECORDINGDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGSTARTDATE, ID3v23FieldKey.RECORDINGSTARTDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGENDDATE, ID3v23FieldKey.RECORDINGENDDATE);
    this.tagFieldToId3.put(FieldKey.RECORDINGLOCATION, ID3v23FieldKey.RECORDINGLOCATION);
    this.tagFieldToId3.put(FieldKey.REMIXER, ID3v23FieldKey.REMIXER);
    this.tagFieldToId3.put(FieldKey.ROONALBUMTAG, ID3v23FieldKey.ROONALBUMTAG);
    this.tagFieldToId3.put(FieldKey.ROONTRACKTAG, ID3v23FieldKey.ROONTRACKTAG);
    this.tagFieldToId3.put(FieldKey.SCRIPT, ID3v23FieldKey.SCRIPT);
    this.tagFieldToId3.put(FieldKey.SECTION, ID3v23FieldKey.SECTION);
    this.tagFieldToId3.put(FieldKey.SINGLE_DISC_TRACK_NO, ID3v23FieldKey.SINGLE_DISC_TRACK_NO);
    this.tagFieldToId3.put(FieldKey.SONGKONG_ID, ID3v23FieldKey.SONGKONG_ID);
    this.tagFieldToId3.put(FieldKey.SUBTITLE, ID3v23FieldKey.SUBTITLE);
    this.tagFieldToId3.put(FieldKey.TAGS, ID3v23FieldKey.TAGS);
    this.tagFieldToId3.put(FieldKey.TEMPO, ID3v23FieldKey.TEMPO);
    this.tagFieldToId3.put(FieldKey.TIMBRE, ID3v23FieldKey.TIMBRE);
    this.tagFieldToId3.put(FieldKey.TITLE, ID3v23FieldKey.TITLE);
    this.tagFieldToId3.put(FieldKey.TITLE_MOVEMENT, ID3v23FieldKey.TITLE_MOVEMENT);
    this.tagFieldToId3.put(FieldKey.TITLE_SORT, ID3v23FieldKey.TITLE_SORT);
    this.tagFieldToId3.put(FieldKey.TONALITY, ID3v23FieldKey.TONALITY);
    this.tagFieldToId3.put(FieldKey.TRACK, ID3v23FieldKey.TRACK);
    this.tagFieldToId3.put(FieldKey.TRACK_TOTAL, ID3v23FieldKey.TRACK_TOTAL);
    this.tagFieldToId3.put(FieldKey.URL_DISCOGS_ARTIST_SITE, ID3v23FieldKey.URL_DISCOGS_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_DISCOGS_RELEASE_SITE, ID3v23FieldKey.URL_DISCOGS_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.URL_LYRICS_SITE, ID3v23FieldKey.URL_LYRICS_SITE);
    this.tagFieldToId3.put(FieldKey.URL_OFFICIAL_ARTIST_SITE, ID3v23FieldKey.URL_OFFICIAL_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_OFFICIAL_RELEASE_SITE, ID3v23FieldKey.URL_OFFICIAL_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.URL_WIKIPEDIA_ARTIST_SITE, ID3v23FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
    this.tagFieldToId3.put(FieldKey.URL_WIKIPEDIA_RELEASE_SITE, ID3v23FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
    this.tagFieldToId3.put(FieldKey.WORK, ID3v23FieldKey.WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_RECORDING_WORK, ID3v23FieldKey.MUSICBRAINZ_RECORDING_WORK);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1, ID3v23FieldKey.WORK_PART_LEVEL1);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL1_TYPE, ID3v23FieldKey.WORK_PART_LEVEL1_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2, ID3v23FieldKey.WORK_PART_LEVEL2);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL2_TYPE, ID3v23FieldKey.WORK_PART_LEVEL2_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3, ID3v23FieldKey.WORK_PART_LEVEL3);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL3_TYPE, ID3v23FieldKey.WORK_PART_LEVEL3_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4, ID3v23FieldKey.WORK_PART_LEVEL4);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL4_TYPE, ID3v23FieldKey.WORK_PART_LEVEL4_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5, ID3v23FieldKey.WORK_PART_LEVEL5);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL5_TYPE, ID3v23FieldKey.WORK_PART_LEVEL5_TYPE);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6, ID3v23FieldKey.WORK_PART_LEVEL6);
    this.tagFieldToId3.put(FieldKey.MUSICBRAINZ_WORK_PART_LEVEL6_TYPE, ID3v23FieldKey.WORK_PART_LEVEL6_TYPE);
    this.tagFieldToId3.put(FieldKey.VERSION, ID3v23FieldKey.VERSION);
    this.tagFieldToId3.put(FieldKey.WORK_TYPE, ID3v23FieldKey.WORK_TYPE);
    this.tagFieldToId3.put(FieldKey.YEAR, ID3v23FieldKey.YEAR);
    populateId3ToTagField();
  }
  
  public static ID3v23Frames getInstanceOf() {
    if (id3v23Frames == null)
      id3v23Frames = new ID3v23Frames(); 
    return id3v23Frames;
  }
  
  private void populateId3ToTagField() {
    for (Map.Entry<FieldKey, ID3v23FieldKey> entry : this.tagFieldToId3.entrySet())
      this.id3ToTagField.put((ID3v23FieldKey)entry.getValue(), (FieldKey)entry.getKey()); 
  }
  
  public FieldKey getGenericKeyFromId3(ID3v23FieldKey paramID3v23FieldKey) {
    return this.id3ToTagField.get(paramID3v23FieldKey);
  }
  
  public ID3v23FieldKey getId3KeyFromGenericKey(FieldKey paramFieldKey) {
    return this.tagFieldToId3.get(paramFieldKey);
  }
  
  public void setITunes12_6WorkGroupingMode(boolean paramBoolean) {
    EnumMap<FieldKey, ID3v23FieldKey> enumMap = this.tagFieldToId3;
    if (paramBoolean) {
      enumMap.put(FieldKey.WORK, ID3v23FieldKey.GROUPING);
      this.tagFieldToId3.put(FieldKey.GROUPING, ID3v23FieldKey.ITUNES_GROUPING);
    } else {
      enumMap.put(FieldKey.WORK, ID3v23FieldKey.WORK);
      this.tagFieldToId3.put(FieldKey.GROUPING, ID3v23FieldKey.GROUPING);
    } 
    populateId3ToTagField();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v23Frames.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */