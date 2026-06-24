package org.jaudiotagger.tag.id3;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import l0;
import m60;
import mk;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTALB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCON;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRCK;
import org.jaudiotagger.tag.reference.GenreTypes;
import tp;
import uc1;
import x41;

public class ID3v11Tag extends ID3v1Tag {
  protected static final int FIELD_COMMENT_LENGTH = 28;
  
  protected static final int FIELD_COMMENT_POS = 97;
  
  protected static final int FIELD_TRACK_INDICATOR_LENGTH = 1;
  
  protected static final int FIELD_TRACK_INDICATOR_POS = 125;
  
  protected static final int FIELD_TRACK_LENGTH = 1;
  
  protected static final int FIELD_TRACK_POS = 126;
  
  private static final byte MAJOR_VERSION = 1;
  
  private static final byte RELEASE = 1;
  
  private static final byte REVISION = 0;
  
  protected static final int TRACK_MAX_VALUE = 255;
  
  protected static final int TRACK_MIN_VALUE = 1;
  
  protected static final int TRACK_UNDEFINED = 0;
  
  protected static final String TYPE_TRACK = "track";
  
  protected byte track = 0;
  
  public ID3v11Tag() {}
  
  public ID3v11Tag(AbstractTag paramAbstractTag) {
    if (paramAbstractTag != null) {
      if (paramAbstractTag instanceof ID3v1Tag) {
        if (!(paramAbstractTag instanceof ID3v11Tag)) {
          paramAbstractTag = paramAbstractTag;
          this.title = ((ID3v1Tag)paramAbstractTag).title;
          this.artist = ((ID3v1Tag)paramAbstractTag).artist;
          this.album = ((ID3v1Tag)paramAbstractTag).album;
          this.comment = ((ID3v1Tag)paramAbstractTag).comment;
          this.year = ((ID3v1Tag)paramAbstractTag).year;
          this.genre = ((ID3v1Tag)paramAbstractTag).genre;
          return;
        } 
        tp.j("Copy Constructor not called. Please type cast the argument");
        throw null;
      } 
      if (!(paramAbstractTag instanceof ID3v24Tag)) {
        paramAbstractTag = new ID3v24Tag(paramAbstractTag);
      } else {
        paramAbstractTag = paramAbstractTag;
      } 
      if (paramAbstractTag.hasFrame("TIT2"))
        this.title = ID3Tags.truncate(((FrameBodyTIT2)((ID3v24Frame)paramAbstractTag.getFrame("TIT2").get(0)).getBody()).getText(), 30); 
      if (paramAbstractTag.hasFrame("TPE1"))
        this.artist = ID3Tags.truncate(((FrameBodyTPE1)((ID3v24Frame)paramAbstractTag.getFrame("TPE1").get(0)).getBody()).getText(), 30); 
      if (paramAbstractTag.hasFrame("TALB"))
        this.album = ID3Tags.truncate(((FrameBodyTALB)((ID3v24Frame)paramAbstractTag.getFrame("TALB").get(0)).getBody()).getText(), 30); 
      if (paramAbstractTag.hasFrame("TDRC"))
        this.year = ID3Tags.truncate(((FrameBodyTDRC)((ID3v24Frame)paramAbstractTag.getFrame("TDRC").get(0)).getBody()).getText(), 4); 
      if (paramAbstractTag.hasFrame("COMM")) {
        Iterator<Object> iterator = paramAbstractTag.getFrameOfType("COMM");
        String str = "";
        while (iterator.hasNext()) {
          ID3v24Frame iD3v24Frame = (ID3v24Frame)iterator.next();
          StringBuilder stringBuilder = x41.p(str);
          stringBuilder.append(((FrameBodyCOMM)iD3v24Frame.getBody()).getText());
          stringBuilder.append(" ");
          str = stringBuilder.toString();
        } 
        this.comment = ID3Tags.truncate(str, 28);
      } 
      if (paramAbstractTag.hasFrame("TCON")) {
        String str = ((FrameBodyTCON)((ID3v24Frame)paramAbstractTag.getFrame("TCON").get(0)).getBody()).getText();
        try {
          this.genre = (byte)(int)ID3Tags.findNumber(str);
        } catch (TagException tagException) {
          Integer integer = GenreTypes.getInstanceOf().getIdForValue(str);
          if (integer != null) {
            this.genre = integer.byteValue();
          } else {
            Logger logger = AbstractID3v1Tag.logger;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getLoggingFilename());
            stringBuilder.append(":Unable to convert TCON frame to format suitable for v11 tag");
            logger.log(level, stringBuilder.toString(), (Throwable)tagException);
            this.genre = -1;
          } 
        } 
      } 
      if (paramAbstractTag.hasFrame("TRCK"))
        this.track = (byte)((FrameBodyTRCK)((ID3v24Frame)paramAbstractTag.getFrame("TRCK").get(0)).getBody()).getTrackNo().intValue(); 
    } 
  }
  
  public ID3v11Tag(ID3v11Tag paramID3v11Tag) {
    super(paramID3v11Tag);
    this.track = paramID3v11Tag.track;
  }
  
  public ID3v11Tag(uc1 paramuc1) {
    this(paramuc1, "");
  }
  
  public ID3v11Tag(uc1 paramuc1, String paramString) {
    setLoggingFilename(paramString);
    ByteBuffer byteBuffer = ByteBuffer.allocate(128);
    if (paramuc1.d() >= 128L) {
      FileChannel fileChannel = paramuc1.a();
      fileChannel.position(paramuc1.d() - 128L);
      fileChannel.read(byteBuffer);
      byteBuffer.flip();
      read(byteBuffer);
      return;
    } 
    m60.i("File not large enough to contain a tag");
    throw null;
  }
  
  public void addTrack(String paramString) {
    setTrack(paramString);
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("tag", getIdentifier());
    MP3File.getStructureFormatter().b("title", this.title);
    MP3File.getStructureFormatter().b("artist", this.artist);
    MP3File.getStructureFormatter().b("album", this.album);
    MP3File.getStructureFormatter().b("year", this.year);
    MP3File.getStructureFormatter().b("comment", this.comment);
    MP3File.getStructureFormatter().a("track", this.track);
    MP3File.getStructureFormatter().a("genre", this.genre);
    MP3File.getStructureFormatter().d("tag");
  }
  
  public void deleteField(FieldKey paramFieldKey) {
    if (paramFieldKey == FieldKey.TRACK) {
      this.track = 0;
      return;
    } 
    super.deleteField(paramFieldKey);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v11Tag))
      return false; 
    ID3v11Tag iD3v11Tag = (ID3v11Tag)paramObject;
    return (this.track == iD3v11Tag.track && super.equals(paramObject));
  }
  
  public int getFieldCount() {
    return 7;
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    return (paramFieldKey == FieldKey.TRACK) ? getTrack() : super.getFields(paramFieldKey);
  }
  
  public String getFirst(FieldKey paramFieldKey) {
    switch (paramFieldKey) {
      default:
        return "";
      case null:
        return getFirstComment();
      case null:
        return getFirstTrack();
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
  
  public String getFirstComment() {
    return this.comment;
  }
  
  public TagField getFirstField(String paramString) {
    List<TagField> list;
    if (FieldKey.TRACK.name().equals(paramString)) {
      list = getTrack();
      return (list != null && list.size() > 0) ? list.get(0) : null;
    } 
    return super.getFirstField((String)list);
  }
  
  public String getFirstTrack() {
    return String.valueOf(this.track & 0xFF);
  }
  
  public byte getMajorVersion() {
    return 1;
  }
  
  public byte getRelease() {
    return 1;
  }
  
  public byte getRevision() {
    return 0;
  }
  
  public List<TagField> getTrack() {
    FieldKey fieldKey = FieldKey.TRACK;
    return (getFirst(fieldKey).length() > 0) ? returnFieldToList(new ID3v1TagField(ID3v1FieldKey.TRACK.name(), getFirst(fieldKey))) : new ArrayList<TagField>();
  }
  
  public boolean isEmpty() {
    return (this.track <= 0 && super.isEmpty());
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      AbstractID3v1Tag.logger.finer("Reading v1.1 tag");
      byte[] arrayOfByte = new byte[128];
      paramByteBuffer.position(0);
      paramByteBuffer.get(arrayOfByte, 0, 128);
      Charset charset = mk.b;
      String str5 = (new String(arrayOfByte, 3, 30, charset)).trim();
      this.title = str5;
      Matcher matcher5 = AbstractID3v1Tag.endofStringPattern.matcher(str5);
      if (matcher5.find())
        this.title = this.title.substring(0, matcher5.start()); 
      String str4 = (new String(arrayOfByte, 33, 30, charset)).trim();
      this.artist = str4;
      Matcher matcher4 = AbstractID3v1Tag.endofStringPattern.matcher(str4);
      if (matcher4.find())
        this.artist = this.artist.substring(0, matcher4.start()); 
      String str3 = (new String(arrayOfByte, 63, 30, charset)).trim();
      this.album = str3;
      Matcher matcher3 = AbstractID3v1Tag.endofStringPattern.matcher(str3);
      if (matcher3.find())
        this.album = this.album.substring(0, matcher3.start()); 
      String str2 = (new String(arrayOfByte, 93, 4, charset)).trim();
      this.year = str2;
      Matcher matcher2 = AbstractID3v1Tag.endofStringPattern.matcher(str2);
      if (matcher2.find())
        this.year = this.year.substring(0, matcher2.start()); 
      String str1 = (new String(arrayOfByte, 97, 28, charset)).trim();
      this.comment = str1;
      Matcher matcher1 = AbstractID3v1Tag.endofStringPattern.matcher(str1);
      if (matcher1.find())
        this.comment = this.comment.substring(0, matcher1.start()); 
      this.track = arrayOfByte[126];
      this.genre = arrayOfByte[127];
      return;
    } 
    throw new TagNotFoundException("ID3v1 tag not found");
  }
  
  public boolean seek(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[3];
    paramByteBuffer.get(arrayOfByte, 0, 3);
    if (!Arrays.equals(arrayOfByte, AbstractID3v1Tag.TAG_ID))
      return false; 
    paramByteBuffer.position(125);
    return (paramByteBuffer.get() != 0) ? false : ((paramByteBuffer.get() != 0));
  }
  
  public void setComment(String paramString) {
    if (paramString != null) {
      this.comment = ID3Tags.truncate(paramString, 28);
      return;
    } 
    l0.l("Argument cannot be null");
  }
  
  public void setField(TagField paramTagField) {
    if (FieldKey.valueOf(paramTagField.getId()) == FieldKey.TRACK) {
      setTrack(paramTagField.toString());
      return;
    } 
    super.setField(paramTagField);
  }
  
  public void setTrack(String paramString) {
    byte b;
    try {
      b = Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      b = 0;
    } 
    if (b > 'ÿ' || b < 1) {
      this.track = 0;
      return;
    } 
    this.track = (byte)Integer.parseInt(paramString);
  }
  
  public void write(uc1 paramuc1) {
    AbstractID3v1Tag.logger.config(tlzLOCPTHRhep.oboGjxqiZY);
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
      String str = ID3Tags.truncate(this.comment, 28);
      for (i = bool; i < str.length(); i++)
        arrayOfByte1[i + 97] = (byte)str.charAt(i); 
    } 
    arrayOfByte1[126] = this.track;
    if (TagOptionSingleton.getInstance().isId3v1SaveGenre())
      arrayOfByte1[127] = this.genre; 
    paramuc1.write(arrayOfByte1);
    AbstractID3v1Tag.logger.config("Saved ID3v11 tag to file");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v11Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */