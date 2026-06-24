package org.jaudiotagger.tag.id3;

import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.EmptyFrameException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidFrameIdentifierException;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.PaddingException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyIPLS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTALB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCON;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIPL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTRCK;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.lyrics3.Lyrics3v2;
import org.jaudiotagger.tag.lyrics3.Lyrics3v2Field;
import org.jaudiotagger.tag.reference.GenreTypes;
import org.jaudiotagger.tag.reference.PictureTypes;
import u00;

public class ID3v24Tag extends AbstractID3v2Tag {
  public static final byte MAJOR_VERSION = 4;
  
  public static final int MASK_V24_COMPRESSION = 16;
  
  public static final int MASK_V24_CRC_DATA_PRESENT = 32;
  
  public static final int MASK_V24_DATA_LENGTH_INDICATOR = 2;
  
  public static final int MASK_V24_ENCRYPTION = 8;
  
  public static final int MASK_V24_EXPERIMENTAL = 32;
  
  public static final int MASK_V24_EXTENDED_HEADER = 64;
  
  public static final int MASK_V24_FILE_ALTER_PRESERVATION = 32;
  
  public static final int MASK_V24_FOOTER_PRESENT = 16;
  
  public static final int MASK_V24_FRAME_UNSYNCHRONIZATION = 4;
  
  public static final int MASK_V24_GROUPING_IDENTITY = 64;
  
  public static final int MASK_V24_IMAGE_ENCODING = 4;
  
  public static final int MASK_V24_IMAGE_SIZE_RESTRICTIONS = 6;
  
  public static final int MASK_V24_READ_ONLY = 16;
  
  public static final int MASK_V24_TAG_ALTER_PRESERVATION = 64;
  
  public static final int MASK_V24_TAG_RESTRICTIONS = 16;
  
  public static final int MASK_V24_TAG_SIZE_RESTRICTIONS = -64;
  
  public static final int MASK_V24_TAG_UPDATE = 64;
  
  public static final int MASK_V24_TEXT_ENCODING_RESTRICTIONS = 32;
  
  public static final int MASK_V24_TEXT_FIELD_SIZE_RESTRICTIONS = 24;
  
  public static final int MASK_V24_UNSYNCHRONIZATION = 128;
  
  public static final byte RELEASE = 2;
  
  public static final byte REVISION = 0;
  
  protected static int TAG_EXT_HEADER_CRC_DATA_LENGTH = 5;
  
  protected static int TAG_EXT_HEADER_CRC_LENGTH = 6;
  
  protected static int TAG_EXT_HEADER_LENGTH = 6;
  
  protected static int TAG_EXT_HEADER_RESTRICTION_DATA_LENGTH = 1;
  
  protected static int TAG_EXT_HEADER_RESTRICTION_LENGTH = 2;
  
  protected static int TAG_EXT_HEADER_UPDATE_LENGTH = 1;
  
  protected static int TAG_EXT_NUMBER_BYTES_DATA_LENGTH = 1;
  
  protected static final String TYPE_CRCDATA = "crcdata";
  
  protected static final String TYPE_EXPERIMENTAL = "experimental";
  
  protected static final String TYPE_EXTENDED = "extended";
  
  protected static final String TYPE_FOOTER = "footer";
  
  protected static final String TYPE_IMAGEENCODINGRESTRICTION = "imageEncodingRestriction";
  
  protected static final String TYPE_IMAGESIZERESTRICTION = "imageSizeRestriction";
  
  protected static final String TYPE_PADDINGSIZE = "paddingsize";
  
  protected static final String TYPE_TAGRESTRICTION = "tagRestriction";
  
  protected static final String TYPE_TAGSIZERESTRICTION = "tagSizeRestriction";
  
  protected static final String TYPE_TEXTENCODINGRESTRICTION = "textEncodingRestriction";
  
  protected static final String TYPE_TEXTFIELDSIZERESTRICTION = "textFieldSizeRestriction";
  
  protected static final String TYPE_UNSYNCHRONISATION = "unsyncronisation";
  
  protected static final String TYPE_UPDATETAG = "updateTag";
  
  protected int crcData = 0;
  
  protected boolean crcDataFlag = false;
  
  protected boolean experimental = false;
  
  protected boolean extended = false;
  
  protected boolean footer = false;
  
  protected byte imageEncodingRestriction = 0;
  
  protected byte imageSizeRestriction = 0;
  
  protected int paddingSize = 0;
  
  protected boolean tagRestriction = false;
  
  protected byte tagSizeRestriction = 0;
  
  protected byte textEncodingRestriction = 0;
  
  protected byte textFieldSizeRestriction = 0;
  
  protected boolean unsynchronization = false;
  
  protected boolean updateTag = false;
  
  public ID3v24Tag() {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
  }
  
  public ID3v24Tag(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, "");
  }
  
  public ID3v24Tag(ByteBuffer paramByteBuffer, String paramString) {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v24Tag(AbstractTag paramAbstractTag) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Creating tag from a tag of a different version");
    logger.config(stringBuilder.toString());
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    if (paramAbstractTag != null)
      if (!(paramAbstractTag instanceof ID3v24Tag)) {
        ID3v24Frame iD3v24Frame;
        if (paramAbstractTag instanceof AbstractID3v2Tag) {
          paramAbstractTag = paramAbstractTag;
          setLoggingFilename(paramAbstractTag.getLoggingFilename());
          copyPrimitives((AbstractID3v2Tag)paramAbstractTag);
          copyFrames((AbstractID3v2Tag)paramAbstractTag);
          return;
        } 
        if (paramAbstractTag instanceof ID3v1Tag) {
          ID3v1Tag iD3v1Tag = (ID3v1Tag)paramAbstractTag;
          if (iD3v1Tag.title.length() > 0) {
            FrameBodyTIT2 frameBodyTIT2 = new FrameBodyTIT2((byte)0, iD3v1Tag.title);
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame(RqlokDsQOju.DUTAqZrMob);
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyTIT2);
            setFrame(iD3v24Frame1);
          } 
          if (iD3v1Tag.artist.length() > 0) {
            FrameBodyTPE1 frameBodyTPE1 = new FrameBodyTPE1((byte)0, iD3v1Tag.artist);
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame("TPE1");
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyTPE1);
            setFrame(iD3v24Frame1);
          } 
          if (iD3v1Tag.album.length() > 0) {
            FrameBodyTALB frameBodyTALB = new FrameBodyTALB((byte)0, iD3v1Tag.album);
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame("TALB");
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyTALB);
            setFrame(iD3v24Frame1);
          } 
          if (iD3v1Tag.year.length() > 0) {
            FrameBodyTDRC frameBodyTDRC = new FrameBodyTDRC((byte)0, iD3v1Tag.year);
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame("TDRC");
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyTDRC);
            setFrame(iD3v24Frame1);
          } 
          if (iD3v1Tag.comment.length() > 0) {
            FrameBodyCOMM frameBodyCOMM = new FrameBodyCOMM((byte)0, "ENG", "", iD3v1Tag.comment);
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame("COMM");
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyCOMM);
            setFrame(iD3v24Frame1);
          } 
          byte b = iD3v1Tag.genre;
          if ((b & 0xFF) >= 0 && (b & 0xFF) != 255) {
            int i = b & 0xFF;
            StringBuilder stringBuilder1 = new StringBuilder("(");
            stringBuilder1.append(Integer.valueOf(i));
            stringBuilder1.append(") ");
            stringBuilder1.append(GenreTypes.getInstanceOf().getValueForId(i));
            FrameBodyTCON frameBodyTCON = new FrameBodyTCON((byte)0, stringBuilder1.toString());
            ID3v24Frame iD3v24Frame1 = new ID3v24Frame("TCON");
            iD3v24Frame1.setBody((AbstractTagFrameBody)frameBodyTCON);
            setFrame(iD3v24Frame1);
          } 
          if (paramAbstractTag instanceof ID3v11Tag) {
            byte b1 = ((ID3v11Tag)paramAbstractTag).track;
            if (b1 > 0) {
              FrameBodyTRCK frameBodyTRCK = new FrameBodyTRCK((byte)0, Byte.toString(b1));
              iD3v24Frame = new ID3v24Frame(CKYHNesT.htoDTAUSbMDOqOv);
              iD3v24Frame.setBody((AbstractTagFrameBody)frameBodyTRCK);
              setFrame(iD3v24Frame);
              return;
            } 
          } 
        } else if (iD3v24Frame instanceof org.jaudiotagger.tag.lyrics3.AbstractLyrics3) {
          Lyrics3v2 lyrics3v2;
          if (iD3v24Frame instanceof Lyrics3v2) {
            lyrics3v2 = new Lyrics3v2((Lyrics3v2)iD3v24Frame);
          } else {
            lyrics3v2 = new Lyrics3v2((AbstractTag)lyrics3v2);
          } 
          Iterator<Lyrics3v2Field> iterator = lyrics3v2.iterator();
          while (iterator.hasNext()) {
            try {
              Lyrics3v2Field lyrics3v2Field = iterator.next();
              ID3v24Frame iD3v24Frame1 = new ID3v24Frame();
              this(lyrics3v2Field);
              setFrame(iD3v24Frame1);
            } catch (InvalidTagException invalidTagException) {
              Logger logger1 = AbstractID3Tag.logger;
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append(getLoggingFilename());
              stringBuilder1.append(":Unable to convert Lyrics3 to v24 Frame:Frame Identifier");
              logger1.warning(stringBuilder1.toString());
            } 
          } 
        } 
      } else {
        String str = getLoggingFilename();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(":Copy Constructor not called. Please type cast the argument");
        throw new UnsupportedOperationException(stringBuilder1.toString());
      }  
  }
  
  public ID3v24Tag(ID3v24Tag paramID3v24Tag) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Creating tag from another tag of same type");
    logger.config(stringBuilder.toString());
    copyPrimitives(paramID3v24Tag);
    copyFrames(paramID3v24Tag);
  }
  
  private void readExtendedHeader(ByteBuffer paramByteBuffer, int paramInt) {
    paramInt = paramByteBuffer.getInt();
    if (paramInt > TAG_EXT_HEADER_LENGTH) {
      boolean bool1;
      boolean bool2;
      paramByteBuffer.get();
      paramInt = paramByteBuffer.get();
      if ((paramInt & 0x40) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.updateTag = bool1;
      if ((paramInt & 0x20) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.crcDataFlag = bool2;
      if ((paramInt & 0x10) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.tagRestriction = bool2;
      if (bool1)
        paramByteBuffer.get(); 
      if (this.crcDataFlag) {
        paramByteBuffer.get();
        paramInt = TAG_EXT_HEADER_CRC_DATA_LENGTH;
        byte[] arrayOfByte = new byte[paramInt];
        paramByteBuffer.get(arrayOfByte, 0, paramInt);
        this.crcData = 0;
        for (paramInt = 0; paramInt < TAG_EXT_HEADER_CRC_DATA_LENGTH; paramInt++) {
          int i = this.crcData << 8;
          this.crcData = i;
          this.crcData = i + arrayOfByte[paramInt];
        } 
      } 
      if (this.tagRestriction) {
        paramByteBuffer.get();
        byte[] arrayOfByte = new byte[1];
        paramByteBuffer.get(arrayOfByte, 0, 1);
        paramInt = arrayOfByte[0];
        this.tagSizeRestriction = (byte)((paramInt & 0xFFFFFFC0) >> 6);
        this.textEncodingRestriction = (byte)((paramInt & 0x20) >> 5);
        this.textFieldSizeRestriction = (byte)((paramInt & 0x18) >> 3);
        this.imageEncodingRestriction = (byte)((paramInt & 0x4) >> 2);
        this.imageSizeRestriction = (byte)(paramInt & 0x6);
      } 
      return;
    } 
    throw new InvalidTagException(MessageFormat.format("{0} Invalid Extended Header Size of {0} is too smal to be valid", new Object[] { getLoggingFilename(), Integer.valueOf(paramInt) }));
  }
  
  private void readHeaderFlags(ByteBuffer paramByteBuffer) {
    byte b = paramByteBuffer.get();
    boolean bool2 = false;
    if ((b & 0x80) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.unsynchronization = bool1;
    if ((b & 0x40) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.extended = bool1;
    if ((b & 0x20) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.experimental = bool1;
    boolean bool1 = bool2;
    if ((b & 0x10) != 0)
      bool1 = true; 
    this.footer = bool1;
    if ((b & 0x8) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(8) })); 
    if ((b & 0x4) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(4) })); 
    if ((b & 0x2) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(2) })); 
    if ((b & 0x1) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(1) })); 
    if (isUnsynchronization())
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is unsynchronized", new Object[] { getLoggingFilename() })); 
    if (this.extended)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is extended", new Object[] { getLoggingFilename() })); 
    if (this.experimental)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is experimental", new Object[] { getLoggingFilename() })); 
    if (this.footer)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} the ID3 Tag is has a footer", new Object[] { getLoggingFilename() })); 
  }
  
  private ByteBuffer writeHeaderToBuffer(int paramInt1, int paramInt2) {
    byte b;
    ByteBuffer byteBuffer1;
    this.unsynchronization = false;
    this.extended = false;
    this.experimental = false;
    this.footer = false;
    ByteBuffer byteBuffer2 = ByteBuffer.allocate(10);
    byteBuffer2.put(AbstractID3v2Tag.TAG_ID);
    byteBuffer2.put(getMajorVersion());
    byteBuffer2.put(getRevision());
    if (isUnsynchronization()) {
      b1 = -128;
    } else {
      b1 = 0;
    } 
    byte b2 = b1;
    if (this.extended)
      b2 = (byte)(b1 | 0x40); 
    byte b1 = b2;
    if (this.experimental)
      b1 = (byte)(b2 | 0x20); 
    b2 = b1;
    if (this.footer)
      b2 = (byte)(b1 | 0x10); 
    byteBuffer2.put(b2);
    if (this.extended) {
      int i = TAG_EXT_HEADER_LENGTH;
      b = i;
      if (this.updateTag)
        b = i + TAG_EXT_HEADER_UPDATE_LENGTH; 
      i = b;
      if (this.crcDataFlag)
        i = b + TAG_EXT_HEADER_CRC_LENGTH; 
      b = i;
      if (this.tagRestriction)
        b = i + TAG_EXT_HEADER_RESTRICTION_LENGTH; 
    } else {
      b = 0;
    } 
    byteBuffer2.put(ID3SyncSafeInteger.valueToBuffer(paramInt1 + paramInt2 + b));
    if (this.extended) {
      paramInt2 = TAG_EXT_HEADER_LENGTH;
      paramInt1 = paramInt2;
      if (this.updateTag)
        paramInt1 = paramInt2 + TAG_EXT_HEADER_UPDATE_LENGTH; 
      paramInt2 = paramInt1;
      if (this.crcDataFlag)
        paramInt2 = paramInt1 + TAG_EXT_HEADER_CRC_LENGTH; 
      paramInt1 = paramInt2;
      if (this.tagRestriction)
        paramInt1 = paramInt2 + TAG_EXT_HEADER_RESTRICTION_LENGTH; 
      ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt1);
      byteBuffer.putInt(paramInt1);
      byteBuffer.put((byte)TAG_EXT_NUMBER_BYTES_DATA_LENGTH);
      if (this.updateTag) {
        b2 = 64;
      } else {
        b2 = 0;
      } 
      b1 = b2;
      if (this.crcDataFlag)
        b1 = (byte)(b2 | 0x20); 
      b2 = b1;
      if (this.tagRestriction)
        b2 = (byte)(b1 | 0x10); 
      byteBuffer.put(b2);
      if (this.updateTag)
        byteBuffer.put((byte)0); 
      if (this.crcDataFlag) {
        byteBuffer.put((byte)TAG_EXT_HEADER_CRC_DATA_LENGTH);
        byteBuffer.put((byte)0);
        byteBuffer.putInt(this.crcData);
      } 
      byteBuffer1 = byteBuffer;
      if (this.tagRestriction) {
        byteBuffer.put((byte)TAG_EXT_HEADER_RESTRICTION_DATA_LENGTH);
        byteBuffer.put((byte)0);
        byteBuffer1 = byteBuffer;
      } 
    } else {
      byteBuffer1 = null;
    } 
    if (byteBuffer1 != null) {
      byteBuffer1.flip();
      byteBuffer2.put(byteBuffer1);
    } 
    byteBuffer2.flip();
    return byteBuffer2;
  }
  
  public void addFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    try {
      if (paramAbstractID3v2Frame instanceof ID3v24Frame) {
        copyFrameIntoMap(paramAbstractID3v2Frame.getIdentifier(), paramAbstractID3v2Frame);
        return;
      } 
      for (AbstractID3v2Frame abstractID3v2Frame : convertFrame(paramAbstractID3v2Frame))
        copyFrameIntoMap(abstractID3v2Frame.getIdentifier(), abstractID3v2Frame); 
      return;
    } catch (InvalidFrameException invalidFrameException) {
      Logger logger = AbstractID3Tag.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":Unable to convert frame:");
      stringBuilder.append(paramAbstractID3v2Frame.getIdentifier());
      logger.log(level, stringBuilder.toString());
      return;
    } 
  }
  
  public void combineFrames(AbstractID3v2Frame paramAbstractID3v2Frame, List<TagField> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getBody : ()Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   4: instanceof org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   7: ifeq -> 266
    //   10: aload_2
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 68
    //   26: aload_3
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast org/jaudiotagger/tag/TagField
    //   35: astore #4
    //   37: aload #4
    //   39: instanceof org/jaudiotagger/tag/id3/framebody/FrameBodyUnsupported
    //   42: ifeq -> 51
    //   45: aload_3
    //   46: invokeinterface remove : ()V
    //   51: aload #4
    //   53: instanceof org/jaudiotagger/tag/id3/AbstractID3v2Frame
    //   56: ifeq -> 17
    //   59: aload #4
    //   61: checkcast org/jaudiotagger/tag/id3/AbstractID3v2Frame
    //   64: astore_3
    //   65: goto -> 70
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_2
    //   71: invokeinterface isEmpty : ()Z
    //   76: ifeq -> 88
    //   79: aload_2
    //   80: aload_1
    //   81: invokeinterface add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: return
    //   88: aload_3
    //   89: invokevirtual getBody : ()Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   92: instanceof org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   95: ifeq -> 219
    //   98: aload_3
    //   99: invokevirtual getBody : ()Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   102: checkcast org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   105: astore_2
    //   106: aload_1
    //   107: invokevirtual getBody : ()Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   110: checkcast org/jaudiotagger/tag/id3/framebody/FrameBodyTDRC
    //   113: astore_1
    //   114: aload_1
    //   115: invokevirtual getOriginalID : ()Ljava/lang/String;
    //   118: ifnonnull -> 122
    //   121: return
    //   122: aload_1
    //   123: invokevirtual getOriginalID : ()Ljava/lang/String;
    //   126: ldc_w 'TYER'
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifeq -> 146
    //   135: aload_2
    //   136: aload_1
    //   137: invokevirtual getYear : ()Ljava/lang/String;
    //   140: invokevirtual setYear : (Ljava/lang/String;)V
    //   143: goto -> 207
    //   146: aload_1
    //   147: invokevirtual getOriginalID : ()Ljava/lang/String;
    //   150: ldc_w 'TDAT'
    //   153: invokevirtual equals : (Ljava/lang/Object;)Z
    //   156: ifeq -> 178
    //   159: aload_2
    //   160: aload_1
    //   161: invokevirtual getDate : ()Ljava/lang/String;
    //   164: invokevirtual setDate : (Ljava/lang/String;)V
    //   167: aload_2
    //   168: aload_1
    //   169: invokevirtual isMonthOnly : ()Z
    //   172: invokevirtual setMonthOnly : (Z)V
    //   175: goto -> 207
    //   178: aload_1
    //   179: invokevirtual getOriginalID : ()Ljava/lang/String;
    //   182: ldc_w 'TIME'
    //   185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   188: ifeq -> 207
    //   191: aload_2
    //   192: aload_1
    //   193: invokevirtual getTime : ()Ljava/lang/String;
    //   196: invokevirtual setTime : (Ljava/lang/String;)V
    //   199: aload_2
    //   200: aload_1
    //   201: invokevirtual isHoursOnly : ()Z
    //   204: invokevirtual setHoursOnly : (Z)V
    //   207: aload_2
    //   208: ldc_w 'Text'
    //   211: aload_2
    //   212: invokevirtual getFormattedText : ()Ljava/lang/String;
    //   215: invokevirtual setObjectValue : (Ljava/lang/String;Ljava/lang/Object;)V
    //   218: return
    //   219: getstatic org/jaudiotagger/tag/id3/AbstractID3Tag.logger : Ljava/util/logging/Logger;
    //   222: astore_3
    //   223: new java/lang/StringBuilder
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: astore_2
    //   231: aload_2
    //   232: aload_0
    //   233: invokevirtual getLoggingFilename : ()Ljava/lang/String;
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_2
    //   241: ldc_w ':Found duplicate TDRC frame in invalid situation,discarding:'
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_2
    //   249: aload_1
    //   250: invokevirtual getIdentifier : ()Ljava/lang/String;
    //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: aload_3
    //   258: aload_2
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: invokevirtual warning : (Ljava/lang/String;)V
    //   265: return
    //   266: aload_2
    //   267: aload_1
    //   268: invokeinterface add : (Ljava/lang/Object;)Z
    //   273: pop
    //   274: return
  }
  
  public List<AbstractID3v2Frame> convertFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    ArrayList<ID3v23Frame> arrayList = new ArrayList();
    if (paramAbstractID3v2Frame instanceof ID3v22Frame && paramAbstractID3v2Frame.getIdentifier().equals("IPL")) {
      arrayList.add(new ID3v23Frame(paramAbstractID3v2Frame));
      return (List)arrayList;
    } 
    if (paramAbstractID3v2Frame instanceof ID3v23Frame && paramAbstractID3v2Frame.getIdentifier().equals("IPLS")) {
      List list = ((FrameBodyIPLS)paramAbstractID3v2Frame.getBody()).getPairing().getMapping();
      ArrayList<Pair> arrayList1 = new ArrayList();
      Iterator<Pair> iterator = list.iterator();
      while (iterator.hasNext())
        arrayList1.add(iterator.next()); 
      if (arrayList1.size() > 0) {
        ID3v24Frame iD3v24Frame = new ID3v24Frame((ID3v23Frame)paramAbstractID3v2Frame, "TIPL");
        iD3v24Frame.setBody((AbstractTagFrameBody)new FrameBodyTIPL(paramAbstractID3v2Frame.getBody().getTextEncoding(), arrayList1));
        arrayList.add(iD3v24Frame);
      } 
      return (List)arrayList;
    } 
    arrayList.add(new ID3v24Frame(paramAbstractID3v2Frame));
    return (List)arrayList;
  }
  
  public void copyPrimitives(AbstractID3v2Tag paramAbstractID3v2Tag) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Copying primitives");
    logger.config(stringBuilder.toString());
    super.copyPrimitives(paramAbstractID3v2Tag);
    if (paramAbstractID3v2Tag instanceof ID3v24Tag) {
      paramAbstractID3v2Tag = paramAbstractID3v2Tag;
      this.footer = ((ID3v24Tag)paramAbstractID3v2Tag).footer;
      this.tagRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).tagRestriction;
      this.updateTag = ((ID3v24Tag)paramAbstractID3v2Tag).updateTag;
      this.imageEncodingRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).imageEncodingRestriction;
      this.imageSizeRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).imageSizeRestriction;
      this.tagSizeRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).tagSizeRestriction;
      this.textEncodingRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).textEncodingRestriction;
      this.textFieldSizeRestriction = ((ID3v24Tag)paramAbstractID3v2Tag).textFieldSizeRestriction;
    } 
  }
  
  public TagField createArtworkField(byte[] paramArrayOfbyte, String paramString) {
    ID3v24Frame iD3v24Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)iD3v24Frame.getBody();
    frameBodyAPIC.setObjectValue("PictureData", paramArrayOfbyte);
    frameBodyAPIC.setObjectValue("PictureType", PictureTypes.DEFAULT_ID);
    frameBodyAPIC.setObjectValue("MIMEType", paramString);
    frameBodyAPIC.setObjectValue("Description", "");
    return (TagField)iD3v24Frame;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey != null) {
      ID3v24Frame iD3v24Frame;
      String str;
      if (paramFieldKey == FieldKey.GENRE) {
        if (paramVarArgs != null) {
          str = paramVarArgs[0];
          if (str != null) {
            iD3v24Frame = createFrame(getFrameAndSubIdFromGenericKey(paramFieldKey).getFrameId());
            FrameBodyTCON frameBodyTCON = (FrameBodyTCON)iD3v24Frame.getBody();
            if (TagOptionSingleton.getInstance().isWriteMp3GenresAsText()) {
              frameBodyTCON.setText(str);
              return (TagField)iD3v24Frame;
            } 
            frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v24Genre(str));
            return (TagField)iD3v24Frame;
          } 
          l0.l("Argument cannot be null");
          return null;
        } 
        l0.l("Argument cannot be null");
        return null;
      } 
      return super.createField((FieldKey)iD3v24Frame, (String[])str);
    } 
    l0.d();
    return null;
  }
  
  public TagField createField(ID3v24FieldKey paramID3v24FieldKey, String paramString) {
    if (paramID3v24FieldKey != null)
      return doCreateTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v24FieldKey.getFrameId(), paramID3v24FieldKey.getSubId()), new String[] { paramString }); 
    l0.d();
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    ID3v24Frame iD3v24Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)iD3v24Frame.getBody();
    if (!paramArtwork.isLinked()) {
      frameBodyAPIC.setObjectValue("PictureData", paramArtwork.getBinaryData());
      frameBodyAPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyAPIC.setObjectValue("MIMEType", paramArtwork.getMimeType());
      frameBodyAPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v24Frame;
    } 
    try {
      frameBodyAPIC.setObjectValue("PictureData", paramArtwork.getImageUrl().getBytes("ISO-8859-1"));
      frameBodyAPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyAPIC.setObjectValue("MIMEType", "-->");
      frameBodyAPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v24Frame;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      l0.f(unsupportedEncodingException.getMessage());
      return null;
    } 
  }
  
  public ID3v24Frame createFrame(String paramString) {
    return new ID3v24Frame(paramString);
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("tag", getIdentifier());
    createStructureHeader();
    MP3File.getStructureFormatter().f("header", "");
    MP3File.getStructureFormatter().c("unsyncronisation", isUnsynchronization());
    MP3File.getStructureFormatter().a(uvJYmft.yAyChTRbvPN, this.crcData);
    MP3File.getStructureFormatter().c("experimental", this.experimental);
    MP3File.getStructureFormatter().c("extended", this.extended);
    MP3File.getStructureFormatter().a("paddingsize", this.paddingSize);
    MP3File.getStructureFormatter().c("footer", this.footer);
    MP3File.getStructureFormatter().a("imageEncodingRestriction", this.paddingSize);
    MP3File.getStructureFormatter().a("imageSizeRestriction", this.imageSizeRestriction);
    MP3File.getStructureFormatter().c("tagRestriction", this.tagRestriction);
    MP3File.getStructureFormatter().a("tagSizeRestriction", this.tagSizeRestriction);
    MP3File.getStructureFormatter().a("textFieldSizeRestriction", this.textFieldSizeRestriction);
    MP3File.getStructureFormatter().a("textEncodingRestriction", this.textEncodingRestriction);
    MP3File.getStructureFormatter().c("updateTag", this.updateTag);
    MP3File.getStructureFormatter().d("header");
    createStructureBody();
    MP3File.getStructureFormatter().d("tag");
  }
  
  public void deleteField(String paramString) {
    doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramString, null));
  }
  
  public void deleteField(ID3v24FieldKey paramID3v24FieldKey) {
    if (paramID3v24FieldKey != null) {
      doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v24FieldKey.getFrameId(), paramID3v24FieldKey.getSubId()));
      return;
    } 
    l0.d();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v24Tag))
      return false; 
    ID3v24Tag iD3v24Tag = (ID3v24Tag)paramObject;
    return (this.footer != iD3v24Tag.footer) ? false : ((this.imageEncodingRestriction != iD3v24Tag.imageEncodingRestriction) ? false : ((this.imageSizeRestriction != iD3v24Tag.imageSizeRestriction) ? false : ((this.tagRestriction != iD3v24Tag.tagRestriction) ? false : ((this.tagSizeRestriction != iD3v24Tag.tagSizeRestriction) ? false : ((this.textEncodingRestriction != iD3v24Tag.textEncodingRestriction) ? false : ((this.textFieldSizeRestriction != iD3v24Tag.textFieldSizeRestriction) ? false : ((this.updateTag == iD3v24Tag.updateTag && super.equals(paramObject)))))))));
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList;
    if (paramFieldKey == FieldKey.GENRE) {
      List<TagField> list = getFields(paramFieldKey);
      arrayList = new ArrayList();
      if (list != null && list.size() > 0) {
        Iterator<String> iterator = ((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().iterator();
        while (iterator.hasNext())
          arrayList.add(FrameBodyTCON.convertID3v24GenreToGeneric(iterator.next())); 
      } 
      return arrayList;
    } 
    return super.getAll((FieldKey)arrayList);
  }
  
  public List<Artwork> getArtworkList() {
    List<TagField> list = getFields(FieldKey.COVER_ART);
    ArrayList<Artwork> arrayList = new ArrayList(list.size());
    Iterator<TagField> iterator = list.iterator();
    while (iterator.hasNext()) {
      FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)((AbstractID3v2Frame)iterator.next()).getBody();
      Artwork artwork = ArtworkFactory.getNew();
      artwork.setMimeType(frameBodyAPIC.getMimeType());
      artwork.setPictureType(frameBodyAPIC.getPictureType());
      artwork.setDescription(frameBodyAPIC.getDescription());
      if (frameBodyAPIC.isImageUrl()) {
        artwork.setLinked(true);
        artwork.setImageUrl(frameBodyAPIC.getImageUrl());
      } else {
        artwork.setBinaryData(frameBodyAPIC.getImageData());
      } 
      arrayList.add(artwork);
    } 
    return arrayList;
  }
  
  public String getFirst(ID3v24FieldKey paramID3v24FieldKey) {
    if (paramID3v24FieldKey != null) {
      FieldKey fieldKey = ID3v24Frames.getInstanceOf().getGenericKeyFromId3(paramID3v24FieldKey);
      return (fieldKey != null) ? getFirst(fieldKey) : doGetValueAtIndex(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v24FieldKey.getFrameId(), paramID3v24FieldKey.getSubId()), 0);
    } 
    l0.d();
    return null;
  }
  
  public AbstractID3v2Tag.FrameAndSubId getFrameAndSubIdFromGenericKey(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      ID3v24FieldKey iD3v24FieldKey = ID3v24Frames.getInstanceOf().getId3KeyFromGenericKey(paramFieldKey);
      if (iD3v24FieldKey != null)
        return new AbstractID3v2Tag.FrameAndSubId(this, paramFieldKey, iD3v24FieldKey.getFrameId(), iD3v24FieldKey.getSubId()); 
      throw new KeyNotFoundException(paramFieldKey.name());
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public ID3Frames getID3Frames() {
    return ID3v24Frames.getInstanceOf();
  }
  
  public String getIdentifier() {
    return "ID3v2.40";
  }
  
  public byte getMajorVersion() {
    return 4;
  }
  
  public Comparator<String> getPreferredFrameOrderComparator() {
    return ID3v24PreferredFrameOrderComparator.getInstanceof();
  }
  
  public byte getRelease() {
    return 2;
  }
  
  public byte getRevision() {
    return 0;
  }
  
  public int getSize() {
    boolean bool = this.extended;
    int i = 10;
    if (bool) {
      int j = TAG_EXT_HEADER_LENGTH + 10;
      i = j;
      if (this.updateTag)
        i = j + TAG_EXT_HEADER_UPDATE_LENGTH; 
      j = i;
      if (this.crcDataFlag)
        j = i + TAG_EXT_HEADER_CRC_LENGTH; 
      i = j;
      if (this.tagRestriction)
        i = j + TAG_EXT_HEADER_RESTRICTION_LENGTH; 
    } 
    i += super.getSize();
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Tag Size is");
    stringBuilder.append(i);
    logger.finer(stringBuilder.toString());
    return i;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (paramFieldKey != null) {
      List<TagField> list;
      if (paramFieldKey == FieldKey.GENRE) {
        list = getFields(paramFieldKey);
        return (list != null && list.size() > 0) ? FrameBodyTCON.convertID3v24GenreToGeneric(((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().get(paramInt)) : "";
      } 
      return super.getValue((FieldKey)list, paramInt);
    } 
    l0.d();
    return null;
  }
  
  public boolean isUnsynchronization() {
    return this.unsynchronization;
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      readHeaderFlags(paramByteBuffer);
      int i = ID3SyncSafeInteger.bufferToValue(paramByteBuffer);
      Logger logger = AbstractID3Tag.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":Reading tag from file size set in header is:");
      stringBuilder1.append(i);
      logger.config(stringBuilder1.toString());
      if (this.extended)
        readExtendedHeader(paramByteBuffer, i); 
      readFrames(paramByteBuffer, i);
      return;
    } 
    String str1 = getLoggingFilename();
    String str2 = getIdentifier();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str1);
    stringBuilder.append(":");
    stringBuilder.append(str2);
    stringBuilder.append(" tag not found");
    throw new TagNotFoundException(stringBuilder.toString());
  }
  
  public void readFrames(ByteBuffer paramByteBuffer, int paramInt) {
    Logger logger1 = AbstractID3Tag.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":Start of frame body at");
    stringBuilder2.append(paramByteBuffer.position());
    logger1.finest(stringBuilder2.toString());
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    this.fileReadSize = paramInt;
    Logger logger2 = AbstractID3Tag.logger;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(getLoggingFilename());
    stringBuilder1.append(hrSTyFuSIm.qOBiPiWbthRtSXC);
    stringBuilder1.append(paramByteBuffer.position());
    stringBuilder1.append(",frames data size is:");
    stringBuilder1.append(paramInt);
    logger2.finest(stringBuilder1.toString());
    while (paramByteBuffer.position() <= paramInt) {
      try {
        logger2 = AbstractID3Tag.logger;
        stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":looking for next frame at:");
        stringBuilder1.append(paramByteBuffer.position());
        logger2.config(stringBuilder1.toString());
        ID3v24Frame iD3v24Frame = new ID3v24Frame();
        this(paramByteBuffer, getLoggingFilename());
        loadFrameIntoMap(iD3v24Frame.getIdentifier(), iD3v24Frame);
      } catch (PaddingException paddingException) {
        logger2 = AbstractID3Tag.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Found padding starting at:");
        stringBuilder.append(paramByteBuffer.position());
        logger2.config(stringBuilder.toString());
        break;
      } catch (EmptyFrameException emptyFrameException) {
        Logger logger = AbstractID3Tag.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Empty Frame:");
        stringBuilder.append(emptyFrameException.getMessage());
        logger.warning(stringBuilder.toString());
        this.emptyFrameBytes += 10;
      } catch (InvalidFrameIdentifierException invalidFrameIdentifierException) {
        Logger logger = AbstractID3Tag.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Invalid Frame Identifier:");
        stringBuilder.append(invalidFrameIdentifierException.getMessage());
        logger.config(stringBuilder.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidFrameException invalidFrameException) {
        logger2 = AbstractID3Tag.logger;
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Invalid Frame:");
        stringBuilder1.append(invalidFrameException.getMessage());
        logger2.warning(stringBuilder1.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidDataTypeException invalidDataTypeException) {
        logger2 = AbstractID3Tag.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Corrupt Frame:");
        stringBuilder.append(invalidDataTypeException.getMessage());
        logger2.warning(stringBuilder.toString());
        this.invalidFrames++;
      } 
    } 
  }
  
  public long write(u00 paramu00, long paramLong) {
    setLoggingFilename(paramu00.h());
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Writing tag to file:");
    logger.config(stringBuilder.toString());
    byte[] arrayOfByte = writeFramesToBuffer().toByteArray();
    int j = calculateTagSize(arrayOfByte.length + 10, (int)paramLong);
    int i = j - arrayOfByte.length + 10;
    writeBufferToFile(paramu00, writeHeaderToBuffer(i, arrayOfByte.length), arrayOfByte, i, j, paramLong);
    return j;
  }
  
  public void write(WritableByteChannel paramWritableByteChannel, int paramInt) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Writing tag to channel");
    logger.config(stringBuilder.toString());
    byte[] arrayOfByte = writeFramesToBuffer().toByteArray();
    if (paramInt > 0) {
      paramInt = calculateTagSize(arrayOfByte.length + 10, paramInt) - arrayOfByte.length + 10;
    } else {
      paramInt = 0;
    } 
    paramWritableByteChannel.write(writeHeaderToBuffer(paramInt, arrayOfByte.length));
    paramWritableByteChannel.write(ByteBuffer.wrap(arrayOfByte));
    writePadding(paramWritableByteChannel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v24Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */