package org.jaudiotagger.tag.id3;

import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import in.krosbits.utils.SgV.YbNJ;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import l0;
import m60;
import mk;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.reference.GenreTypes;
import tp;
import uc1;

public class ID3v1Tag extends AbstractID3v1Tag implements Tag {
  protected static final int BYTE_TO_UNSIGNED = 255;
  
  protected static final int FIELD_COMMENT_LENGTH = 30;
  
  protected static final int FIELD_COMMENT_POS = 97;
  
  protected static final int GENRE_UNDEFINED = 255;
  
  private static final byte MAJOR_VERSION = 0;
  
  private static final byte RELEASE = 1;
  
  private static final byte REVISION = 0;
  
  protected static final String TYPE_COMMENT = "comment";
  
  static EnumMap<FieldKey, ID3v1FieldKey> tagFieldToID3v1Field;
  
  protected String album = "";
  
  protected String artist = "";
  
  protected String comment = "";
  
  protected byte genre = -1;
  
  protected String title = "";
  
  protected String year = "";
  
  static {
    EnumMap<FieldKey, Object> enumMap = new EnumMap<FieldKey, Object>(FieldKey.class);
    tagFieldToID3v1Field = (EnumMap)enumMap;
    enumMap.put(FieldKey.ARTIST, ID3v1FieldKey.ARTIST);
    tagFieldToID3v1Field.put(FieldKey.ALBUM, ID3v1FieldKey.ALBUM);
    tagFieldToID3v1Field.put(FieldKey.TITLE, ID3v1FieldKey.TITLE);
    tagFieldToID3v1Field.put(FieldKey.TRACK, ID3v1FieldKey.TRACK);
    tagFieldToID3v1Field.put(FieldKey.YEAR, ID3v1FieldKey.YEAR);
    tagFieldToID3v1Field.put(FieldKey.GENRE, ID3v1FieldKey.GENRE);
    tagFieldToID3v1Field.put(FieldKey.COMMENT, ID3v1FieldKey.COMMENT);
  }
  
  public ID3v1Tag() {}
  
  public ID3v1Tag(AbstractTag paramAbstractTag) {
    if (paramAbstractTag != null) {
      if (!(paramAbstractTag instanceof ID3v1Tag)) {
        if (paramAbstractTag instanceof ID3v11Tag) {
          paramAbstractTag = paramAbstractTag;
        } else {
          paramAbstractTag = new ID3v11Tag(paramAbstractTag);
        } 
        this.album = ((ID3v1Tag)paramAbstractTag).album;
        this.artist = ((ID3v1Tag)paramAbstractTag).artist;
        this.comment = ((ID3v1Tag)paramAbstractTag).comment;
        this.title = ((ID3v1Tag)paramAbstractTag).title;
        this.year = ((ID3v1Tag)paramAbstractTag).year;
        this.genre = ((ID3v1Tag)paramAbstractTag).genre;
        return;
      } 
      tp.j("Copy Constructor not called. Please type cast the argument");
      throw null;
    } 
  }
  
  public ID3v1Tag(ID3v1Tag paramID3v1Tag) {
    super(paramID3v1Tag);
    this.album = paramID3v1Tag.album;
    this.artist = paramID3v1Tag.artist;
    this.comment = paramID3v1Tag.comment;
    this.title = paramID3v1Tag.title;
    this.year = paramID3v1Tag.year;
    this.genre = paramID3v1Tag.genre;
  }
  
  public ID3v1Tag(uc1 paramuc1) {
    this(paramuc1, "");
  }
  
  public ID3v1Tag(uc1 paramuc1, String paramString) {
    setLoggingFilename(paramString);
    FileChannel fileChannel = paramuc1.a();
    if (paramuc1.d() >= 128L) {
      fileChannel.position(paramuc1.d() - 128L);
      ByteBuffer byteBuffer = ByteBuffer.allocate(128);
      fileChannel.read(byteBuffer);
      byteBuffer.flip();
      read(byteBuffer);
      return;
    } 
    m60.i("File not large enough to contain a tag");
    throw null;
  }
  
  public void addField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(paramFieldKey, paramVarArgs);
  }
  
  public void addField(TagField paramTagField) {}
  
  public void addField(Artwork paramArtwork) {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public TagField createCompilationField(boolean paramBoolean) {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    String str = paramVarArgs[0];
    if (paramFieldKey != null) {
      ID3v1FieldKey iD3v1FieldKey = tagFieldToID3v1Field.get(paramFieldKey);
      if (iD3v1FieldKey != null)
        return (TagField)new ID3v1TagField(iD3v1FieldKey.name(), str); 
      throw new KeyNotFoundException(MessageFormat.format("Invalid field {0} for ID3v1 tag", new Object[] { paramFieldKey.name() }));
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("tag", getIdentifier());
    MP3File.getStructureFormatter().b("title", this.title);
    MP3File.getStructureFormatter().b("artist", this.artist);
    MP3File.getStructureFormatter().b(YbNJ.IcxPPoU, this.album);
    MP3File.getStructureFormatter().b("year", this.year);
    MP3File.getStructureFormatter().b("comment", this.comment);
    MP3File.getStructureFormatter().a("genre", this.genre);
    MP3File.getStructureFormatter().d("tag");
  }
  
  public void deleteArtworkField() {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public void deleteField(String paramString) {
    FieldKey fieldKey = FieldKey.valueOf(paramString);
    if (fieldKey != null)
      deleteField(fieldKey); 
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    switch (paramFieldKey) {
      default:
        return;
      case null:
        setComment("");
        return;
      case null:
        setYear("");
        return;
      case null:
        setGenre("");
        return;
      case null:
        setTitle("");
        return;
      case null:
        setAlbum("");
        return;
      case null:
        break;
    } 
    setArtist("");
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v1Tag))
      return false; 
    ID3v1Tag iD3v1Tag = (ID3v1Tag)paramObject;
    return !this.album.equals(iD3v1Tag.album) ? false : (!this.artist.equals(iD3v1Tag.artist) ? false : (!this.comment.equals(iD3v1Tag.comment) ? false : ((this.genre != iD3v1Tag.genre) ? false : (!this.title.equals(iD3v1Tag.title) ? false : ((this.year.equals(iD3v1Tag.year) && super.equals(paramObject)))))));
  }
  
  public List<TagField> getAlbum() {
    return (getFirstAlbum().length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.ALBUM.name(), getFirstAlbum())) : new ArrayList<TagField>();
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(getFirst(paramFieldKey.name()));
    return arrayList;
  }
  
  public List<TagField> getArtist() {
    return (getFirstArtist().length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.ARTIST.name(), getFirstArtist())) : new ArrayList<TagField>();
  }
  
  public List<Artwork> getArtworkList() {
    return Collections.EMPTY_LIST;
  }
  
  public List<TagField> getComment() {
    return (getFirstComment().length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.COMMENT.name(), getFirstComment())) : new ArrayList<TagField>();
  }
  
  public Charset getEncoding() {
    return mk.b;
  }
  
  public int getFieldCount() {
    return 6;
  }
  
  public int getFieldCountIncludingSubValues() {
    return getFieldCount();
  }
  
  public Iterator<TagField> getFields() {
    throw new UnsupportedOperationException("TODO:Not done yet");
  }
  
  public List<TagField> getFields(String paramString) {
    return FieldKey.ARTIST.name().equals(paramString) ? getArtist() : (FieldKey.ALBUM.name().equals(paramString) ? getAlbum() : (FieldKey.TITLE.name().equals(paramString) ? getTitle() : (FieldKey.GENRE.name().equals(paramString) ? getGenre() : (FieldKey.YEAR.name().equals(paramString) ? getYear() : (FieldKey.COMMENT.name().equals(paramString) ? getComment() : new ArrayList<TagField>())))));
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    switch (paramFieldKey) {
      default:
        return new ArrayList<TagField>();
      case null:
        return getComment();
      case null:
        return getYear();
      case null:
        return getGenre();
      case null:
        return getTitle();
      case null:
        return getAlbum();
      case null:
        break;
    } 
    return getArtist();
  }
  
  public String getFirst(String paramString) {
    FieldKey fieldKey = FieldKey.valueOf(paramString);
    return (fieldKey != null) ? getFirst(fieldKey) : "";
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    switch (paramFieldKey) {
      default:
        return OETETTfAjV.jlCRKuIquIijh;
      case null:
        return getFirstComment();
      case null:
        return getFirstYear();
      case null:
        return getFirstGenre();
      case null:
        return getFirstTitle();
      case null:
        return getFirstAlbum();
      case null:
        break;
    } 
    return getFirstArtist();
  }
  
  public String getFirstAlbum() {
    return this.album;
  }
  
  public String getFirstArtist() {
    return this.artist;
  }
  
  public Artwork getFirstArtwork() {
    return null;
  }
  
  public String getFirstComment() {
    return this.comment;
  }
  
  public TagField getFirstField(String paramString) {
    List<TagField> list;
    if (FieldKey.ARTIST.name().equals(paramString)) {
      list = getArtist();
    } else if (FieldKey.ALBUM.name().equals(list)) {
      list = getAlbum();
    } else if (FieldKey.TITLE.name().equals(list)) {
      list = getTitle();
    } else if (FieldKey.GENRE.name().equals(list)) {
      list = getGenre();
    } else if (FieldKey.YEAR.name().equals(list)) {
      list = getYear();
    } else if (FieldKey.COMMENT.name().equals(list)) {
      list = getComment();
    } else {
      list = null;
    } 
    return (list != null && list.size() > 0) ? list.get(0) : null;
  }
  
  public TagField getFirstField(FieldKey paramFieldKey) {
    List<TagField> list = getFields(paramFieldKey);
    return (list.size() != 0) ? list.get(0) : null;
  }
  
  public String getFirstGenre() {
    byte b = this.genre;
    String str2 = GenreTypes.getInstanceOf().getValueForId(b & 0xFF);
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    return str1;
  }
  
  public String getFirstTitle() {
    return this.title;
  }
  
  public String getFirstTrack() {
    throw new UnsupportedOperationException("ID3v10 cannot store track numbers");
  }
  
  public String getFirstYear() {
    return this.year;
  }
  
  public List<TagField> getGenre() {
    FieldKey fieldKey = FieldKey.GENRE;
    return (getFirst(fieldKey).length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.GENRE.name(), getFirst(fieldKey))) : new ArrayList<TagField>();
  }
  
  public byte getMajorVersion() {
    return 0;
  }
  
  public byte getRelease() {
    return 1;
  }
  
  public byte getRevision() {
    return 0;
  }
  
  public String getSubValue(FieldKey paramFieldKey, int paramInt1, int paramInt2) {
    return getValue(paramFieldKey, paramInt1);
  }
  
  public List<TagField> getTitle() {
    FieldKey fieldKey = FieldKey.TITLE;
    return (getFirst(fieldKey).length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.TITLE.name(), getFirst(fieldKey))) : new ArrayList<TagField>();
  }
  
  public List<TagField> getTrack() {
    throw new UnsupportedOperationException("ID3v10 cannot store track numbers");
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    return getFirst(paramFieldKey);
  }
  
  public List<TagField> getYear() {
    FieldKey fieldKey = FieldKey.YEAR;
    return (getFirst(fieldKey).length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.YEAR.name(), getFirst(fieldKey))) : new ArrayList<TagField>();
  }
  
  public boolean hasCommonFields() {
    return true;
  }
  
  public boolean hasField(String paramString) {
    try {
      return hasField(FieldKey.valueOf(paramString.toUpperCase()));
    } catch (IllegalArgumentException illegalArgumentException) {
      return false;
    } 
  }
  
  public boolean hasField(FieldKey paramFieldKey) {
    return (getFirst(paramFieldKey).length() > 0);
  }
  
  public boolean isEmpty() {
    return (getFirst(FieldKey.TITLE).length() <= 0 && getFirstArtist().length() <= 0 && getFirstAlbum().length() <= 0 && getFirst(FieldKey.GENRE).length() <= 0 && getFirst(FieldKey.YEAR).length() <= 0 && getFirstComment().length() <= 0);
  }
  
  public Iterator<Object> iterator() {
    return new ID3v1Iterator(this);
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      Logger logger1 = AbstractID3v1Tag.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":Reading v1 tag");
      logger1.finer(stringBuilder1.toString());
      byte[] arrayOfByte = new byte[128];
      paramByteBuffer.position(0);
      paramByteBuffer.get(arrayOfByte, 0, 128);
      Charset charset = mk.b;
      String str5 = (new String(arrayOfByte, 3, 30, charset)).trim();
      this.title = str5;
      Matcher matcher4 = AbstractID3v1Tag.endofStringPattern.matcher(str5);
      if (matcher4.find())
        this.title = this.title.substring(0, matcher4.start()); 
      String str4 = (new String(arrayOfByte, 33, 30, charset)).trim();
      this.artist = str4;
      Matcher matcher3 = AbstractID3v1Tag.endofStringPattern.matcher(str4);
      if (matcher3.find())
        this.artist = this.artist.substring(0, matcher3.start()); 
      String str3 = (new String(arrayOfByte, 63, 30, charset)).trim();
      this.album = str3;
      Matcher matcher5 = AbstractID3v1Tag.endofStringPattern.matcher(str3);
      Logger logger2 = AbstractID3v1Tag.logger;
      StringBuilder stringBuilder3 = new StringBuilder();
      stringBuilder3.append(getLoggingFilename());
      stringBuilder3.append(":Orig Album is:");
      stringBuilder3.append(this.comment);
      stringBuilder3.append(":");
      logger2.finest(stringBuilder3.toString());
      if (matcher5.find()) {
        this.album = this.album.substring(0, matcher5.start());
        Logger logger = AbstractID3v1Tag.logger;
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(getLoggingFilename());
        stringBuilder4.append(":Album is:");
        stringBuilder4.append(this.album);
        stringBuilder4.append(":");
        logger.finest(stringBuilder4.toString());
      } 
      String str2 = (new String(arrayOfByte, 93, 4, charset)).trim();
      this.year = str2;
      Matcher matcher2 = AbstractID3v1Tag.endofStringPattern.matcher(str2);
      if (matcher2.find())
        this.year = this.year.substring(0, matcher2.start()); 
      String str1 = (new String(arrayOfByte, 97, 30, charset)).trim();
      this.comment = str1;
      Matcher matcher1 = AbstractID3v1Tag.endofStringPattern.matcher(str1);
      logger2 = AbstractID3v1Tag.logger;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(getLoggingFilename());
      stringBuilder2.append(":Orig Comment is:");
      stringBuilder2.append(this.comment);
      stringBuilder2.append(":");
      logger2.finest(stringBuilder2.toString());
      if (matcher1.find()) {
        this.comment = this.comment.substring(0, matcher1.start());
        Logger logger = AbstractID3v1Tag.logger;
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getLoggingFilename());
        stringBuilder2.append(":Comment is:");
        stringBuilder2.append(this.comment);
        stringBuilder2.append(":");
        logger.finest(stringBuilder2.toString());
      } 
      this.genre = arrayOfByte[127];
      return;
    } 
    String str = getLoggingFilename();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(":ID3v1 tag not found");
    throw new TagNotFoundException(stringBuilder.toString());
  }
  
  public List<TagField> returnFieldToList(ID3v1TagField paramID3v1TagField) {
    ArrayList<ID3v1TagField> arrayList = new ArrayList();
    arrayList.add(paramID3v1TagField);
    return (List)arrayList;
  }
  
  public boolean seek(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[3];
    paramByteBuffer.get(arrayOfByte, 0, 3);
    return Arrays.equals(arrayOfByte, AbstractID3v1Tag.TAG_ID);
  }
  
  public void setAlbum(String paramString) {
    if (paramString != null) {
      this.album = ID3Tags.truncate(paramString, 30);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setArtist(String paramString) {
    if (paramString != null) {
      this.artist = ID3Tags.truncate(paramString, 30);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setComment(String paramString) {
    if (paramString != null) {
      this.comment = ID3Tags.truncate(paramString, 30);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public boolean setEncoding(Charset paramCharset) {
    return true;
  }
  
  public void setField(FieldKey paramFieldKey, String... paramVarArgs) {
    setField(createField(paramFieldKey, paramVarArgs));
  }
  
  public void setField(TagField paramTagField) {
    FieldKey fieldKey = FieldKey.valueOf(paramTagField.getId());
    switch (fieldKey) {
      default:
        return;
      case null:
        setComment(paramTagField.toString());
        return;
      case null:
        setYear(paramTagField.toString());
        return;
      case null:
        setGenre(paramTagField.toString());
        return;
      case null:
        setTitle(paramTagField.toString());
        return;
      case null:
        setAlbum(paramTagField.toString());
        return;
      case null:
        break;
    } 
    setArtist(paramTagField.toString());
  }
  
  public void setField(Artwork paramArtwork) {
    throw new UnsupportedOperationException("Not implemented for this format");
  }
  
  public void setGenre(String paramString) {
    if (paramString != null) {
      Integer integer = GenreTypes.getInstanceOf().getIdForValue(paramString);
      if (integer != null) {
        this.genre = integer.byteValue();
        return;
      } 
      this.genre = -1;
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setTitle(String paramString) {
    if (paramString != null) {
      this.title = ID3Tags.truncate(paramString, 30);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setYear(String paramString) {
    this.year = ID3Tags.truncate(paramString, 4);
  }
  
  public void write(uc1 paramuc1) {
    AbstractID3v1Tag.logger.config("Saving ID3v1 tag to file");
    byte[] arrayOfByte1 = new byte[128];
    delete(paramuc1);
    paramuc1.h(paramuc1.d());
    byte[] arrayOfByte2 = AbstractID3v1Tag.TAG_ID;
    int i = arrayOfByte2.length;
    boolean bool = false;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    if (TagOptionSingleton.getInstance().isId3v1SaveTitle()) {
      String str = ID3Tags.truncate(this.title, 30);
      for (i = 0; i < str.length(); i++)
        arrayOfByte1[i + 3] = (byte)str.charAt(i); 
    } 
    if (TagOptionSingleton.getInstance().isId3v1SaveArtist()) {
      String str = ID3Tags.truncate(this.artist, 30);
      for (i = 0; i < str.length(); i++)
        arrayOfByte1[i + 33] = (byte)str.charAt(i); 
    } 
    if (TagOptionSingleton.getInstance().isId3v1SaveAlbum()) {
      String str = ID3Tags.truncate(this.album, 30);
      for (i = 0; i < str.length(); i++)
        arrayOfByte1[i + 63] = (byte)str.charAt(i); 
    } 
    if (TagOptionSingleton.getInstance().isId3v1SaveYear()) {
      String str = ID3Tags.truncate(this.year, 4);
      for (i = 0; i < str.length(); i++)
        arrayOfByte1[i + 93] = (byte)str.charAt(i); 
    } 
    if (TagOptionSingleton.getInstance().isId3v1SaveComment()) {
      String str = ID3Tags.truncate(this.comment, 30);
      for (i = bool; i < str.length(); i++)
        arrayOfByte1[i + 97] = (byte)str.charAt(i); 
    } 
    if (TagOptionSingleton.getInstance().isId3v1SaveGenre())
      arrayOfByte1[127] = this.genre; 
    paramuc1.write(arrayOfByte1);
    AbstractID3v1Tag.logger.config("Saved ID3v1 tag to file");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v1Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */