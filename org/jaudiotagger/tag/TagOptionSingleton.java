package org.jaudiotagger.tag;

import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import k91;
import org.jaudiotagger.audio.wav.WavOptions;
import org.jaudiotagger.audio.wav.WavSaveOptions;
import org.jaudiotagger.audio.wav.WavSaveOrder;
import org.jaudiotagger.tag.id3.ID3v22Frames;
import org.jaudiotagger.tag.id3.ID3v23Frames;
import org.jaudiotagger.tag.id3.ID3v24Frames;
import org.jaudiotagger.tag.id3.framebody.AbstractID3v2FrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIPL;
import org.jaudiotagger.tag.id3.framebody.ID3v24FrameBody;
import org.jaudiotagger.tag.lyrics3.Lyrics3v2Fields;
import org.jaudiotagger.tag.options.PadNumberOption;
import org.jaudiotagger.tag.reference.GenreTypes;
import org.jaudiotagger.tag.reference.ID3V2Version;
import org.jaudiotagger.tag.reference.Languages;
import org.jaudiotagger.tag.vorbiscomment.VorbisAlbumArtistReadOptions;
import org.jaudiotagger.tag.vorbiscomment.VorbisAlbumArtistSaveOptions;

public class TagOptionSingleton {
  private static String DEFAULT;
  
  private static String defaultOptions;
  
  private static HashMap<String, TagOptionSingleton> tagOptionTable = new HashMap<String, TagOptionSingleton>();
  
  private boolean checkIsWritable = false;
  
  private boolean filenameTagSave = false;
  
  private boolean id3v1Save = true;
  
  private boolean id3v1SaveAlbum = true;
  
  private boolean id3v1SaveArtist = true;
  
  private boolean id3v1SaveComment = true;
  
  private boolean id3v1SaveGenre = true;
  
  private boolean id3v1SaveTitle = true;
  
  private boolean id3v1SaveTrack = true;
  
  private boolean id3v1SaveYear = true;
  
  private byte id3v23DefaultTextEncoding = 0;
  
  private byte id3v24DefaultTextEncoding = 0;
  
  private byte id3v24UnicodeTextEncoding = 1;
  
  private boolean id3v2ITunes12_6WorkGroupingMode = false;
  
  private boolean id3v2PaddingCopyTag = true;
  
  private boolean id3v2PaddingWillShorten = false;
  
  private boolean id3v2Save = true;
  
  private ID3V2Version id3v2Version = ID3V2Version.ID3_V23;
  
  private boolean isAPICDescriptionITunesCompatible = false;
  
  private boolean isAndroid = true;
  
  private boolean isEncodeUTF16BomAsLittleEndian = true;
  
  private boolean isWriteMp3GenresAsText = false;
  
  private boolean isWriteMp4GenresAsText = false;
  
  private boolean isWriteWavForTwonky = false;
  
  private HashMap<Class<? extends ID3v24FrameBody>, LinkedList<String>> keywordMap = new HashMap<Class<? extends ID3v24FrameBody>, LinkedList<String>>();
  
  private String language = "eng";
  
  private boolean lyrics3KeepEmptyFieldIfRead = false;
  
  private boolean lyrics3Save = true;
  
  private boolean lyrics3SaveEmptyField = false;
  
  private HashMap<String, Boolean> lyrics3SaveFieldMap = new HashMap<String, Boolean>();
  
  private int numberMP3SyncFrame = 3;
  
  private boolean originalSavedAfterAdjustingID3v2Padding = true;
  
  private PadNumberOption padNumberTotalLength = PadNumberOption.PAD_ONE_ZERO;
  
  private boolean padNumbers = false;
  
  private HashMap<String, String> parenthesisMap = new HashMap<String, String>();
  
  private int playerCompatability = -1;
  
  private boolean preserveFileIdentity = true;
  
  private boolean removeTrailingTerminatorOnWrite = true;
  
  private HashMap<String, String> replaceWordMap = new HashMap<String, String>();
  
  private boolean resetTextEncodingForExistingFrames = false;
  
  private byte timeStampFormat = 2;
  
  private boolean truncateTextWithoutErrors = false;
  
  private boolean unsyncTags = false;
  
  private VorbisAlbumArtistReadOptions vorbisAlbumArtistReadOptions = VorbisAlbumArtistReadOptions.READ_ALBUMARTIST_THEN_JRIVER;
  
  private VorbisAlbumArtistSaveOptions vorbisAlbumArtistSaveOptions = VorbisAlbumArtistSaveOptions.WRITE_ALBUMARTIST;
  
  private WavOptions wavOptions = WavOptions.READ_ID3_ONLY_AND_SYNC;
  
  private WavSaveOptions wavSaveOptions = WavSaveOptions.SAVE_BOTH;
  
  private WavSaveOrder wavSaveOrder = WavSaveOrder.INFO_THEN_ID3;
  
  private long writeChunkSize = 4194304L;
  
  static {
    DEFAULT = "default";
    defaultOptions = "default";
  }
  
  private TagOptionSingleton() {
    setToDefault();
  }
  
  public static TagOptionSingleton getInstance() {
    return getInstance(defaultOptions);
  }
  
  public static TagOptionSingleton getInstance(String paramString) {
    TagOptionSingleton tagOptionSingleton2 = tagOptionTable.get(paramString);
    TagOptionSingleton tagOptionSingleton1 = tagOptionSingleton2;
    if (tagOptionSingleton2 == null) {
      tagOptionSingleton1 = new TagOptionSingleton();
      tagOptionTable.put(paramString, tagOptionSingleton1);
    } 
    return tagOptionSingleton1;
  }
  
  public static String getInstanceKey() {
    return defaultOptions;
  }
  
  public void addKeyword(Class<? extends ID3v24FrameBody> paramClass, String paramString) {
    LinkedList<String> linkedList;
    if (AbstractID3v2FrameBody.class.isAssignableFrom(paramClass)) {
      if (paramString != null && paramString.length() > 0) {
        if (!this.keywordMap.containsKey(paramClass)) {
          LinkedList<String> linkedList1 = new LinkedList();
          this.keywordMap.put(paramClass, linkedList1);
          linkedList = linkedList1;
        } else {
          linkedList = this.keywordMap.get(linkedList);
        } 
        linkedList.add(paramString);
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Invalid class type. Must be AbstractId3v2FrameBody ");
    stringBuilder.append(linkedList);
    throw new TagException(stringBuilder.toString());
  }
  
  public void addParenthesis(String paramString1, String paramString2) {
    this.parenthesisMap.put(paramString1, paramString2);
  }
  
  public void addReplaceWord(String paramString1, String paramString2) {
    this.replaceWordMap.put(paramString1, paramString2);
  }
  
  public ID3V2Version getID3V2Version() {
    return this.id3v2Version;
  }
  
  public byte getId3v23DefaultTextEncoding() {
    return this.id3v23DefaultTextEncoding;
  }
  
  public byte getId3v24DefaultTextEncoding() {
    return this.id3v24DefaultTextEncoding;
  }
  
  public byte getId3v24UnicodeTextEncoding() {
    return this.id3v24UnicodeTextEncoding;
  }
  
  public Iterator<Class<? extends ID3v24FrameBody>> getKeywordIterator() {
    return this.keywordMap.keySet().iterator();
  }
  
  public Iterator<String> getKeywordListIterator(Class<? extends ID3v24FrameBody> paramClass) {
    return ((LinkedList<String>)this.keywordMap.get(paramClass)).iterator();
  }
  
  public String getLanguage() {
    return this.language;
  }
  
  public boolean getLyrics3SaveField(String paramString) {
    return ((Boolean)this.lyrics3SaveFieldMap.get(paramString)).booleanValue();
  }
  
  public HashMap<String, Boolean> getLyrics3SaveFieldMap() {
    return this.lyrics3SaveFieldMap;
  }
  
  public String getNewReplaceWord(String paramString) {
    return this.replaceWordMap.get(paramString);
  }
  
  public int getNumberMP3SyncFrame() {
    return this.numberMP3SyncFrame;
  }
  
  public Iterator<String> getOldReplaceWordIterator() {
    return this.replaceWordMap.keySet().iterator();
  }
  
  public Iterator<String> getOpenParenthesisIterator() {
    return this.parenthesisMap.keySet().iterator();
  }
  
  public PadNumberOption getPadNumberTotalLength() {
    return this.padNumberTotalLength;
  }
  
  public int getPlayerCompatability() {
    return this.playerCompatability;
  }
  
  public byte getTimeStampFormat() {
    return this.timeStampFormat;
  }
  
  public VorbisAlbumArtistReadOptions getVorbisAlbumArtisReadOptions() {
    return this.vorbisAlbumArtistReadOptions;
  }
  
  public VorbisAlbumArtistSaveOptions getVorbisAlbumArtistSaveOptions() {
    return this.vorbisAlbumArtistSaveOptions;
  }
  
  public WavOptions getWavOptions() {
    return this.wavOptions;
  }
  
  public WavSaveOptions getWavSaveOptions() {
    return this.wavSaveOptions;
  }
  
  public WavSaveOrder getWavSaveOrder() {
    return this.wavSaveOrder;
  }
  
  public long getWriteChunkSize() {
    return this.writeChunkSize;
  }
  
  public boolean isAPICDescriptionITunesCompatible() {
    return this.isAPICDescriptionITunesCompatible;
  }
  
  public boolean isAndroid() {
    return this.isAndroid;
  }
  
  public boolean isCheckIsWritable() {
    return this.checkIsWritable;
  }
  
  public boolean isEncodeUTF16BomAsLittleEndian() {
    return this.isEncodeUTF16BomAsLittleEndian;
  }
  
  public boolean isFilenameTagSave() {
    return this.filenameTagSave;
  }
  
  public boolean isId3v1Save() {
    return this.id3v1Save;
  }
  
  public boolean isId3v1SaveAlbum() {
    return this.id3v1SaveAlbum;
  }
  
  public boolean isId3v1SaveArtist() {
    return this.id3v1SaveArtist;
  }
  
  public boolean isId3v1SaveComment() {
    return this.id3v1SaveComment;
  }
  
  public boolean isId3v1SaveGenre() {
    return this.id3v1SaveGenre;
  }
  
  public boolean isId3v1SaveTitle() {
    return this.id3v1SaveTitle;
  }
  
  public boolean isId3v1SaveTrack() {
    return this.id3v1SaveTrack;
  }
  
  public boolean isId3v1SaveYear() {
    return this.id3v1SaveYear;
  }
  
  public boolean isId3v2ITunes12_6WorkGroupingMode() {
    return this.id3v2ITunes12_6WorkGroupingMode;
  }
  
  public boolean isId3v2PaddingCopyTag() {
    return this.id3v2PaddingCopyTag;
  }
  
  public boolean isId3v2PaddingWillShorten() {
    return this.id3v2PaddingWillShorten;
  }
  
  public boolean isId3v2Save() {
    return this.id3v2Save;
  }
  
  public boolean isLyrics3KeepEmptyFieldIfRead() {
    return this.lyrics3KeepEmptyFieldIfRead;
  }
  
  public boolean isLyrics3Save() {
    return this.lyrics3Save;
  }
  
  public boolean isLyrics3SaveEmptyField() {
    return this.lyrics3SaveEmptyField;
  }
  
  public boolean isOpenParenthesis(String paramString) {
    return this.parenthesisMap.containsKey(paramString);
  }
  
  public boolean isOriginalSavedAfterAdjustingID3v2Padding() {
    return this.originalSavedAfterAdjustingID3v2Padding;
  }
  
  public boolean isPadNumbers() {
    return this.padNumbers;
  }
  
  public boolean isPreserveFileIdentity() {
    return this.preserveFileIdentity;
  }
  
  public boolean isRemoveTrailingTerminatorOnWrite() {
    return this.removeTrailingTerminatorOnWrite;
  }
  
  public boolean isResetTextEncodingForExistingFrames() {
    return this.resetTextEncodingForExistingFrames;
  }
  
  public boolean isTruncateTextWithoutErrors() {
    return this.truncateTextWithoutErrors;
  }
  
  public boolean isUnsyncTags() {
    return this.unsyncTags;
  }
  
  public boolean isWriteMp3GenresAsText() {
    return this.isWriteMp3GenresAsText;
  }
  
  public boolean isWriteMp4GenresAsText() {
    return this.isWriteMp4GenresAsText;
  }
  
  public boolean isWriteWavForTwonky() {
    return this.isWriteWavForTwonky;
  }
  
  public void setAPICDescriptionITunesCompatible(boolean paramBoolean) {
    this.isAPICDescriptionITunesCompatible = paramBoolean;
  }
  
  public void setAndroid(boolean paramBoolean) {
    this.isAndroid = paramBoolean;
  }
  
  public void setCheckIsWritable(boolean paramBoolean) {
    this.checkIsWritable = paramBoolean;
  }
  
  public void setEncodeUTF16BomAsLittleEndian(boolean paramBoolean) {
    this.isEncodeUTF16BomAsLittleEndian = paramBoolean;
  }
  
  public void setFilenameTagSave(boolean paramBoolean) {
    this.filenameTagSave = paramBoolean;
  }
  
  public void setID3V2Version(ID3V2Version paramID3V2Version) {
    this.id3v2Version = paramID3V2Version;
  }
  
  public void setId3v1Save(boolean paramBoolean) {
    this.id3v1Save = paramBoolean;
  }
  
  public void setId3v1SaveAlbum(boolean paramBoolean) {
    this.id3v1SaveAlbum = paramBoolean;
  }
  
  public void setId3v1SaveArtist(boolean paramBoolean) {
    this.id3v1SaveArtist = paramBoolean;
  }
  
  public void setId3v1SaveComment(boolean paramBoolean) {
    this.id3v1SaveComment = paramBoolean;
  }
  
  public void setId3v1SaveGenre(boolean paramBoolean) {
    this.id3v1SaveGenre = paramBoolean;
  }
  
  public void setId3v1SaveTitle(boolean paramBoolean) {
    this.id3v1SaveTitle = paramBoolean;
  }
  
  public void setId3v1SaveTrack(boolean paramBoolean) {
    this.id3v1SaveTrack = paramBoolean;
  }
  
  public void setId3v1SaveYear(boolean paramBoolean) {
    this.id3v1SaveYear = paramBoolean;
  }
  
  public void setId3v23DefaultTextEncoding(byte paramByte) {
    if (paramByte == 0 || paramByte == 1) {
      this.id3v23DefaultTextEncoding = paramByte;
      return;
    } 
  }
  
  public void setId3v24DefaultTextEncoding(byte paramByte) {
    if (paramByte == 0 || paramByte == 1 || paramByte == 2 || paramByte == 3) {
      this.id3v24DefaultTextEncoding = paramByte;
      return;
    } 
  }
  
  public void setId3v24UnicodeTextEncoding(byte paramByte) {
    if (paramByte == 1 || paramByte == 2 || paramByte == 3) {
      this.id3v24UnicodeTextEncoding = paramByte;
      return;
    } 
  }
  
  public void setId3v2ITunes12_6WorkGroupingMode(boolean paramBoolean) {
    if (this.id3v2ITunes12_6WorkGroupingMode != paramBoolean) {
      ID3v22Frames.getInstanceOf().setITunes12_6WorkGroupingMode(paramBoolean);
      ID3v23Frames.getInstanceOf().setITunes12_6WorkGroupingMode(paramBoolean);
      ID3v24Frames.getInstanceOf().setITunes12_6WorkGroupingMode(paramBoolean);
      this.id3v2ITunes12_6WorkGroupingMode = paramBoolean;
    } 
  }
  
  public void setId3v2PaddingCopyTag(boolean paramBoolean) {
    this.id3v2PaddingCopyTag = paramBoolean;
  }
  
  public void setId3v2PaddingWillShorten(boolean paramBoolean) {
    this.id3v2PaddingWillShorten = paramBoolean;
  }
  
  public void setId3v2Save(boolean paramBoolean) {
    this.id3v2Save = paramBoolean;
  }
  
  public void setInstanceKey(String paramString) {
    defaultOptions = paramString;
  }
  
  public void setLanguage(String paramString) {
    if (Languages.getInstanceOf().getIdToValueMap().containsKey(paramString))
      this.language = paramString; 
  }
  
  public void setLyrics3KeepEmptyFieldIfRead(boolean paramBoolean) {
    this.lyrics3KeepEmptyFieldIfRead = paramBoolean;
  }
  
  public void setLyrics3Save(boolean paramBoolean) {
    this.lyrics3Save = paramBoolean;
  }
  
  public void setLyrics3SaveEmptyField(boolean paramBoolean) {
    this.lyrics3SaveEmptyField = paramBoolean;
  }
  
  public void setLyrics3SaveField(String paramString, boolean paramBoolean) {
    this.lyrics3SaveFieldMap.put(paramString, Boolean.valueOf(paramBoolean));
  }
  
  public void setNumberMP3SyncFrame(int paramInt) {
    this.numberMP3SyncFrame = paramInt;
  }
  
  public void setOriginalSavedAfterAdjustingID3v2Padding(boolean paramBoolean) {
    this.originalSavedAfterAdjustingID3v2Padding = paramBoolean;
  }
  
  public void setPadNumberTotalLength(PadNumberOption paramPadNumberOption) {
    this.padNumberTotalLength = paramPadNumberOption;
  }
  
  public void setPadNumbers(boolean paramBoolean) {
    this.padNumbers = paramBoolean;
  }
  
  public void setPlayerCompatability(int paramInt) {
    this.playerCompatability = paramInt;
  }
  
  public void setPreserveFileIdentity(boolean paramBoolean) {
    this.preserveFileIdentity = paramBoolean;
  }
  
  public void setRemoveTrailingTerminatorOnWrite(boolean paramBoolean) {
    this.removeTrailingTerminatorOnWrite = paramBoolean;
  }
  
  public void setResetTextEncodingForExistingFrames(boolean paramBoolean) {
    this.resetTextEncodingForExistingFrames = paramBoolean;
  }
  
  public void setTimeStampFormat(byte paramByte) {
    if (paramByte == 1 || paramByte == 2) {
      this.timeStampFormat = paramByte;
      return;
    } 
  }
  
  public void setToDefault() {
    this.isWriteWavForTwonky = false;
    this.wavOptions = WavOptions.READ_ID3_ONLY_AND_SYNC;
    this.wavSaveOptions = WavSaveOptions.SAVE_BOTH;
    this.keywordMap = new HashMap<Class<? extends ID3v24FrameBody>, LinkedList<String>>();
    this.filenameTagSave = false;
    this.id3v1Save = true;
    this.id3v1SaveAlbum = true;
    this.id3v1SaveArtist = true;
    this.id3v1SaveComment = true;
    this.id3v1SaveGenre = true;
    this.id3v1SaveTitle = true;
    this.id3v1SaveTrack = true;
    this.id3v1SaveYear = true;
    this.id3v2PaddingCopyTag = true;
    this.id3v2PaddingWillShorten = false;
    this.id3v2Save = true;
    this.language = "eng";
    this.lyrics3KeepEmptyFieldIfRead = false;
    this.lyrics3Save = true;
    this.lyrics3SaveEmptyField = false;
    this.lyrics3SaveFieldMap = new HashMap<String, Boolean>();
    this.numberMP3SyncFrame = 3;
    this.parenthesisMap = new HashMap<String, String>();
    this.replaceWordMap = new HashMap<String, String>();
    this.timeStampFormat = 2;
    this.unsyncTags = false;
    this.removeTrailingTerminatorOnWrite = true;
    this.id3v23DefaultTextEncoding = 0;
    this.id3v24DefaultTextEncoding = 0;
    this.id3v24UnicodeTextEncoding = 1;
    this.resetTextEncodingForExistingFrames = false;
    this.truncateTextWithoutErrors = false;
    this.padNumbers = false;
    this.isAPICDescriptionITunesCompatible = false;
    this.isAndroid = true;
    this.isEncodeUTF16BomAsLittleEndian = true;
    this.writeChunkSize = 5000000L;
    this.isWriteMp4GenresAsText = false;
    this.padNumberTotalLength = PadNumberOption.PAD_ONE_ZERO;
    this.id3v2Version = ID3V2Version.ID3_V23;
    this.checkIsWritable = false;
    this.preserveFileIdentity = true;
    for (String str : Lyrics3v2Fields.getInstanceOf().getIdToValueMap().keySet())
      this.lyrics3SaveFieldMap.put(str, Boolean.TRUE); 
    try {
      addKeyword((Class)FrameBodyCOMM.class, "ultimix");
      addKeyword((Class)FrameBodyCOMM.class, "dance");
      addKeyword((Class)FrameBodyCOMM.class, "mix");
      addKeyword((Class)FrameBodyCOMM.class, "remix");
      addKeyword((Class)FrameBodyCOMM.class, "rmx");
      addKeyword((Class)FrameBodyCOMM.class, "live");
      addKeyword((Class)FrameBodyCOMM.class, "cover");
      addKeyword((Class)FrameBodyCOMM.class, "soundtrack");
      addKeyword((Class)FrameBodyCOMM.class, "version");
      addKeyword((Class)FrameBodyCOMM.class, "acoustic");
      addKeyword((Class)FrameBodyCOMM.class, "original");
      addKeyword((Class)FrameBodyCOMM.class, "cd");
      addKeyword((Class)FrameBodyCOMM.class, "extended");
      addKeyword((Class)FrameBodyCOMM.class, "vocal");
      addKeyword((Class)FrameBodyCOMM.class, "unplugged");
      addKeyword((Class)FrameBodyCOMM.class, "acapella");
      addKeyword((Class)FrameBodyCOMM.class, "edit");
      addKeyword((Class)FrameBodyCOMM.class, "radio");
      addKeyword((Class)FrameBodyCOMM.class, "original");
      addKeyword((Class)FrameBodyCOMM.class, "album");
      addKeyword((Class)FrameBodyCOMM.class, "studio");
      addKeyword((Class)FrameBodyCOMM.class, "instrumental");
      addKeyword((Class)FrameBodyCOMM.class, "unedited");
      addKeyword((Class)FrameBodyCOMM.class, "karoke");
      addKeyword((Class)FrameBodyCOMM.class, "quality");
      addKeyword((Class)FrameBodyCOMM.class, "uncensored");
      addKeyword((Class)FrameBodyCOMM.class, "clean");
      addKeyword((Class)FrameBodyCOMM.class, "dirty");
      addKeyword((Class)FrameBodyTIPL.class, "f.");
      addKeyword((Class)FrameBodyTIPL.class, "feat");
      addKeyword((Class)FrameBodyTIPL.class, "feat.");
      addKeyword((Class)FrameBodyTIPL.class, "featuring");
      addKeyword((Class)FrameBodyTIPL.class, "ftng");
      addKeyword((Class)FrameBodyTIPL.class, "ftng.");
      addKeyword((Class)FrameBodyTIPL.class, "ft.");
      addKeyword((Class)FrameBodyTIPL.class, "ft");
      Iterator<String> iterator = GenreTypes.getInstanceOf().getValueToIdMap().keySet().iterator();
      while (iterator.hasNext())
        addKeyword((Class)FrameBodyCOMM.class, iterator.next()); 
      addReplaceWord("v.", "vs.");
      addReplaceWord("vs.", "vs.");
      addReplaceWord(DJqHMztxflt.QIJzLHifnWuee, "vs.");
      addReplaceWord("f.", "feat.");
      addReplaceWord("feat", "feat.");
      addReplaceWord("featuring", "feat.");
      addReplaceWord("ftng.", "feat.");
      addReplaceWord("ftng", "feat.");
      addReplaceWord("ft.", "feat.");
      addReplaceWord("ft", "feat.");
      getKeywordListIterator((Class)FrameBodyTIPL.class);
      addParenthesis("(", ")");
      addParenthesis(tlzLOCPTHRhep.OWAOoMy, "]");
      addParenthesis("{", "}");
      addParenthesis("<", ">");
      return;
    } catch (TagException tagException) {
      k91.n(tagException);
      return;
    } 
  }
  
  public void setTruncateTextWithoutErrors(boolean paramBoolean) {
    this.truncateTextWithoutErrors = paramBoolean;
  }
  
  public void setUnsyncTags(boolean paramBoolean) {
    this.unsyncTags = paramBoolean;
  }
  
  public void setVorbisAlbumArtistReadOptions(VorbisAlbumArtistReadOptions paramVorbisAlbumArtistReadOptions) {
    this.vorbisAlbumArtistReadOptions = paramVorbisAlbumArtistReadOptions;
  }
  
  public void setVorbisAlbumArtistSaveOptions(VorbisAlbumArtistSaveOptions paramVorbisAlbumArtistSaveOptions) {
    this.vorbisAlbumArtistSaveOptions = paramVorbisAlbumArtistSaveOptions;
  }
  
  public void setWavOptions(WavOptions paramWavOptions) {
    this.wavOptions = paramWavOptions;
  }
  
  public void setWavSaveOptions(WavSaveOptions paramWavSaveOptions) {
    this.wavSaveOptions = paramWavSaveOptions;
  }
  
  public void setWavSaveOrder(WavSaveOrder paramWavSaveOrder) {
    this.wavSaveOrder = paramWavSaveOrder;
  }
  
  public void setWriteChunkSize(long paramLong) {
    this.writeChunkSize = paramLong;
  }
  
  public void setWriteMp3GenresAsText(boolean paramBoolean) {
    this.isWriteMp3GenresAsText = paramBoolean;
  }
  
  public void setWriteMp4GenresAsText(boolean paramBoolean) {
    this.isWriteMp4GenresAsText = paramBoolean;
  }
  
  public void setWriteWavForTwonky(boolean paramBoolean) {
    this.isWriteWavForTwonky = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\TagOptionSingleton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */