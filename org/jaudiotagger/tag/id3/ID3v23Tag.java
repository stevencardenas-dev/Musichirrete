package org.jaudiotagger.tag.id3;

import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.EmptyFrameException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidFrameIdentifierException;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.PaddingException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagNotFoundException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.datatype.Pair;
import org.jaudiotagger.tag.datatype.PairedTextEncodedStringNullTerminated;
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyTextInfo;
import org.jaudiotagger.tag.id3.framebody.FrameBodyAPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyIPLS;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCON;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDAT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIME;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIPL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMCL;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTYER;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.reference.PictureTypes;
import tp;
import u00;
import x41;

public class ID3v23Tag extends AbstractID3v2Tag {
  protected static int FIELD_TAG_EXT_SIZE_LENGTH = 4;
  
  public static final byte MAJOR_VERSION = 3;
  
  public static final int MASK_V23_CRC_DATA_PRESENT = 128;
  
  public static final int MASK_V23_EMBEDDED_INFO_FLAG = 2;
  
  public static final int MASK_V23_EXPERIMENTAL = 32;
  
  public static final int MASK_V23_EXTENDED_HEADER = 64;
  
  public static final int MASK_V23_UNSYNCHRONIZATION = 128;
  
  public static final byte RELEASE = 2;
  
  public static final byte REVISION = 0;
  
  protected static int TAG_EXT_HEADER_CRC_LENGTH = 4;
  
  protected static int TAG_EXT_HEADER_DATA_LENGTH = 10 - 4;
  
  protected static int TAG_EXT_HEADER_LENGTH = 10;
  
  protected static final String TYPE_CRCDATA = "crcdata";
  
  protected static final String TYPE_EXPERIMENTAL = "experimental";
  
  protected static final String TYPE_EXTENDED = "extended";
  
  protected static final String TYPE_PADDINGSIZE = "paddingsize";
  
  protected static final String TYPE_UNSYNCHRONISATION = "unsyncronisation";
  
  protected boolean compression = false;
  
  private int crc32;
  
  protected boolean crcDataFlag = false;
  
  protected boolean experimental = false;
  
  protected boolean extended = false;
  
  private int paddingSize = 0;
  
  protected boolean unsynchronization = false;
  
  public ID3v23Tag() {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
  }
  
  public ID3v23Tag(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, nFLlOYeP.ZtTpkgZYGinq);
  }
  
  public ID3v23Tag(ByteBuffer paramByteBuffer, String paramString) {
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v23Tag(AbstractTag paramAbstractTag) {
    AbstractID3Tag.logger.config("Creating tag from a tag of a different version");
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    if (paramAbstractTag != null) {
      if (!(paramAbstractTag instanceof ID3v23Tag)) {
        if (paramAbstractTag instanceof ID3v24Tag) {
          paramAbstractTag = paramAbstractTag;
        } else {
          paramAbstractTag = new ID3v24Tag(paramAbstractTag);
        } 
        setLoggingFilename(paramAbstractTag.getLoggingFilename());
        copyPrimitives((AbstractID3v2Tag)paramAbstractTag);
        copyFrames((AbstractID3v2Tag)paramAbstractTag);
        AbstractID3Tag.logger.config("Created tag from a tag of a different version");
        return;
      } 
      tp.j("Copy Constructor not called. Please type cast the argument");
      throw null;
    } 
  }
  
  public ID3v23Tag(ID3v23Tag paramID3v23Tag) {
    super(paramID3v23Tag);
    AbstractID3Tag.logger.config("Creating tag from another tag of same type");
    copyPrimitives(paramID3v23Tag);
    copyFrames(paramID3v23Tag);
  }
  
  private void putAsList(Map<String, List<TagField>> paramMap, String paramString, TagField paramTagField) {
    ArrayList<TagField> arrayList = new ArrayList();
    arrayList.add(paramTagField);
    paramMap.put(paramString, arrayList);
  }
  
  private void readExtendedHeader(ByteBuffer paramByteBuffer, int paramInt) {
    int i = paramByteBuffer.getInt();
    paramInt = TAG_EXT_HEADER_DATA_LENGTH;
    boolean bool1 = false;
    boolean bool2 = false;
    if (i == paramInt) {
      bool1 = bool2;
      if ((paramByteBuffer.get() & 0x80) != 0)
        bool1 = true; 
      this.crcDataFlag = bool1;
      if (bool1)
        AbstractID3Tag.logger.warning(MessageFormat.format("{0} CRC Data flag not set correctly.", new Object[] { getLoggingFilename() })); 
      paramByteBuffer.get();
      paramInt = paramByteBuffer.getInt();
      this.paddingSize = paramInt;
      if (paramInt > 0)
        AbstractID3Tag.logger.config(MessageFormat.format("{0} According to Extended Header the ID3 Tag has padding size of {1}", new Object[] { getLoggingFilename(), Integer.valueOf(this.paddingSize) })); 
      return;
    } 
    if (i == paramInt + TAG_EXT_HEADER_CRC_LENGTH) {
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag has crc check", new Object[] { getLoggingFilename() }));
      if ((paramByteBuffer.get() & 0x80) != 0)
        bool1 = true; 
      this.crcDataFlag = bool1;
      if (!bool1)
        AbstractID3Tag.logger.warning(MessageFormat.format("{0} CRC Data flag not set correctly.", new Object[] { getLoggingFilename() })); 
      paramByteBuffer.get();
      paramInt = paramByteBuffer.getInt();
      this.paddingSize = paramInt;
      if (paramInt > 0)
        AbstractID3Tag.logger.config(MessageFormat.format("{0} According to Extended Header the ID3 Tag has padding size of {1}", new Object[] { getLoggingFilename(), Integer.valueOf(this.paddingSize) })); 
      this.crc32 = paramByteBuffer.getInt();
      AbstractID3Tag.logger.config(MessageFormat.format("{0} According to Extended Header the ID3 Tag has crc32 of {1}", new Object[] { getLoggingFilename(), Integer.valueOf(this.crc32) }));
      return;
    } 
    AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid Extended Header Size of {0} assuming no extended header after all", new Object[] { getLoggingFilename(), Integer.valueOf(i) }));
    paramByteBuffer.position(paramByteBuffer.position() - FIELD_TAG_EXT_SIZE_LENGTH);
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
    boolean bool1 = bool2;
    if ((b & 0x20) != 0)
      bool1 = true; 
    this.experimental = bool1;
    if ((b & 0x10) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(16) })); 
    if ((b & 0x8) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(8) })); 
    if ((b & 0x4) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(4) })); 
    if ((b & 0x2) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(2) })); 
    if ((b & 0x1) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(1) })); 
    if (isUnsynchronization()) {
      Logger logger = AbstractID3Tag.logger;
      String str = getLoggingFilename();
      logger.config(MessageFormat.format(oXrNDUqUkE.zNmjofOnnwNa, new Object[] { str }));
    } 
    if (this.extended)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is extended", new Object[] { getLoggingFilename() })); 
    if (this.experimental)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is experimental", new Object[] { getLoggingFilename() })); 
  }
  
  private ByteBuffer writeHeaderToBuffer(int paramInt1, int paramInt2) {
    byte b;
    this.extended = false;
    this.experimental = false;
    this.crcDataFlag = false;
    ByteBuffer byteBuffer = ByteBuffer.allocate(TAG_EXT_HEADER_LENGTH + 10 + TAG_EXT_HEADER_CRC_LENGTH);
    byteBuffer.put(AbstractID3v2Tag.TAG_ID);
    byteBuffer.put(getMajorVersion());
    byteBuffer.put(getRevision());
    if (isUnsynchronization()) {
      b2 = -128;
    } else {
      b2 = 0;
    } 
    byte b1 = b2;
    if (this.extended)
      b1 = (byte)(b2 | 0x40); 
    byte b2 = b1;
    if (this.experimental)
      b2 = (byte)(b1 | 0x20); 
    byteBuffer.put(b2);
    if (this.extended) {
      int i = TAG_EXT_HEADER_LENGTH;
      b = i;
      if (this.crcDataFlag)
        b = i + TAG_EXT_HEADER_CRC_LENGTH; 
    } else {
      b = 0;
    } 
    byteBuffer.put(ID3SyncSafeInteger.valueToBuffer(paramInt2 + paramInt1 + b));
    if (this.extended)
      if (this.crcDataFlag) {
        byteBuffer.putInt(TAG_EXT_HEADER_DATA_LENGTH + TAG_EXT_HEADER_CRC_LENGTH);
        byteBuffer.put(-128);
        byteBuffer.put((byte)0);
        byteBuffer.putInt(this.paddingSize);
        byteBuffer.putInt(this.crc32);
      } else {
        byteBuffer.putInt(TAG_EXT_HEADER_DATA_LENGTH);
        byteBuffer.put((byte)0);
        byteBuffer.put((byte)0);
        byteBuffer.putInt(paramInt1);
      }  
    byteBuffer.flip();
    return byteBuffer;
  }
  
  public void addFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    try {
      if (paramAbstractID3v2Frame instanceof ID3v23Frame) {
        copyFrameIntoMap(paramAbstractID3v2Frame.getIdentifier(), paramAbstractID3v2Frame);
        return;
      } 
      for (AbstractID3v2Frame abstractID3v2Frame : convertFrame(paramAbstractID3v2Frame))
        copyFrameIntoMap(abstractID3v2Frame.getIdentifier(), abstractID3v2Frame); 
      return;
    } catch (InvalidFrameException invalidFrameException) {
      Logger logger = AbstractID3Tag.logger;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder = new StringBuilder("Unable to convert frame:");
      stringBuilder.append(paramAbstractID3v2Frame.getIdentifier());
      logger.log(level, stringBuilder.toString());
      return;
    } 
  }
  
  public void combineFrames(AbstractID3v2Frame paramAbstractID3v2Frame, List<TagField> paramList) {
    Iterator<Pair> iterator;
    PairedTextEncodedStringNullTerminated.ValuePairs<Iterator<Pair>> valuePairs;
    Iterator<TagField> iterator1 = paramList.iterator();
    AbstractID3v2Frame abstractID3v2Frame = null;
    while (iterator1.hasNext()) {
      TagField tagField = iterator1.next();
      if (tagField instanceof AbstractID3v2Frame) {
        AbstractID3v2Frame abstractID3v2Frame1 = (AbstractID3v2Frame)tagField;
        if (abstractID3v2Frame1.getIdentifier().equals(paramAbstractID3v2Frame.getIdentifier()))
          abstractID3v2Frame = abstractID3v2Frame1; 
      } 
    } 
    if (paramAbstractID3v2Frame.getIdentifier().equals("IPLS") && abstractID3v2Frame != null) {
      valuePairs = ((FrameBodyIPLS)abstractID3v2Frame.getBody()).getPairing();
      iterator = ((FrameBodyIPLS)paramAbstractID3v2Frame.getBody()).getPairing().getMapping().iterator();
      while (iterator.hasNext())
        valuePairs.add(iterator.next()); 
      return;
    } 
    valuePairs.add(iterator);
  }
  
  public List<AbstractID3v2Frame> convertFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    FrameBodyTDRC frameBodyTDRC;
    ArrayList<ID3v23Frame> arrayList = new ArrayList();
    if (paramAbstractID3v2Frame.getIdentifier().equals("TDRC") && paramAbstractID3v2Frame.getBody() instanceof FrameBodyTDRC) {
      frameBodyTDRC = (FrameBodyTDRC)paramAbstractID3v2Frame.getBody();
      frameBodyTDRC.findMatchingMaskAndExtractV3Values();
      if (!frameBodyTDRC.getYear().equals("")) {
        ID3v23Frame iD3v23Frame = new ID3v23Frame("TYER");
        ((FrameBodyTYER)iD3v23Frame.getBody()).setText(frameBodyTDRC.getYear());
        arrayList.add(iD3v23Frame);
      } 
      if (!frameBodyTDRC.getDate().equals("")) {
        ID3v23Frame iD3v23Frame = new ID3v23Frame("TDAT");
        ((FrameBodyTDAT)iD3v23Frame.getBody()).setText(frameBodyTDRC.getDate());
        ((FrameBodyTDAT)iD3v23Frame.getBody()).setMonthOnly(frameBodyTDRC.isMonthOnly());
        arrayList.add(iD3v23Frame);
      } 
      if (!frameBodyTDRC.getTime().equals("")) {
        ID3v23Frame iD3v23Frame = new ID3v23Frame(DJqHMztxflt.GAurJPebXEeWDb);
        ((FrameBodyTIME)iD3v23Frame.getBody()).setText(frameBodyTDRC.getTime());
        ((FrameBodyTIME)iD3v23Frame.getBody()).setHoursOnly(frameBodyTDRC.isHoursOnly());
        arrayList.add(iD3v23Frame);
      } 
      return (List)arrayList;
    } 
    if (frameBodyTDRC.getIdentifier().equals("TIPL") && frameBodyTDRC.getBody() instanceof FrameBodyTIPL) {
      List list = ((FrameBodyTIPL)frameBodyTDRC.getBody()).getPairing().getMapping();
      ID3v23Frame iD3v23Frame = new ID3v23Frame((ID3v24Frame)frameBodyTDRC, "IPLS");
      iD3v23Frame.setBody((AbstractTagFrameBody)new FrameBodyIPLS(frameBodyTDRC.getBody().getTextEncoding(), list));
      arrayList.add(iD3v23Frame);
      return (List)arrayList;
    } 
    if (frameBodyTDRC.getIdentifier().equals("TMCL") && frameBodyTDRC.getBody() instanceof FrameBodyTMCL) {
      List list = ((FrameBodyTMCL)frameBodyTDRC.getBody()).getPairing().getMapping();
      ID3v23Frame iD3v23Frame = new ID3v23Frame((ID3v24Frame)frameBodyTDRC, "IPLS");
      iD3v23Frame.setBody((AbstractTagFrameBody)new FrameBodyIPLS(frameBodyTDRC.getBody().getTextEncoding(), list));
      arrayList.add(iD3v23Frame);
      return (List)arrayList;
    } 
    arrayList.add(new ID3v23Frame((AbstractID3v2Frame)frameBodyTDRC));
    return (List)arrayList;
  }
  
  public void copyPrimitives(AbstractID3v2Tag paramAbstractID3v2Tag) {
    AbstractID3Tag.logger.config("Copying primitives");
    super.copyPrimitives(paramAbstractID3v2Tag);
    if (paramAbstractID3v2Tag instanceof ID3v23Tag) {
      paramAbstractID3v2Tag = paramAbstractID3v2Tag;
      this.crcDataFlag = ((ID3v23Tag)paramAbstractID3v2Tag).crcDataFlag;
      this.experimental = ((ID3v23Tag)paramAbstractID3v2Tag).experimental;
      this.extended = ((ID3v23Tag)paramAbstractID3v2Tag).extended;
      this.crc32 = ((ID3v23Tag)paramAbstractID3v2Tag).crc32;
      this.paddingSize = ((ID3v23Tag)paramAbstractID3v2Tag).paddingSize;
    } 
  }
  
  public TagField createArtworkField(byte[] paramArrayOfbyte, String paramString) {
    ID3v23Frame iD3v23Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)iD3v23Frame.getBody();
    frameBodyAPIC.setObjectValue("PictureData", paramArrayOfbyte);
    frameBodyAPIC.setObjectValue("PictureType", PictureTypes.DEFAULT_ID);
    frameBodyAPIC.setObjectValue("MIMEType", paramString);
    frameBodyAPIC.setObjectValue("Description", "");
    return (TagField)iD3v23Frame;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey != null) {
      if (paramVarArgs != null) {
        String str = paramVarArgs[0];
        if (str != null) {
          FrameBodyTCON frameBodyTCON;
          ID3v23Frame iD3v23Frame1;
          ID3v23Frame iD3v23Frame2;
          if (paramFieldKey == FieldKey.GENRE) {
            if (str != null) {
              iD3v23Frame2 = createFrame(getFrameAndSubIdFromGenericKey(paramFieldKey).getFrameId());
              frameBodyTCON = (FrameBodyTCON)iD3v23Frame2.getBody();
              frameBodyTCON.setV23Format();
              if (TagOptionSingleton.getInstance().isWriteMp3GenresAsText()) {
                frameBodyTCON.setText(str);
                return (TagField)iD3v23Frame2;
              } 
              frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v23Genre(str));
              return (TagField)iD3v23Frame2;
            } 
            l0.l("Argument cannot be null");
            return null;
          } 
          if (frameBodyTCON == FieldKey.YEAR) {
            if (str.length() == 1) {
              iD3v23Frame1 = createFrame("TYER");
              ((AbstractFrameBodyTextInfo)iD3v23Frame1.getBody()).setText("000".concat(str));
              return (TagField)iD3v23Frame1;
            } 
            if (str.length() == 2) {
              iD3v23Frame1 = createFrame("TYER");
              ((AbstractFrameBodyTextInfo)iD3v23Frame1.getBody()).setText("00".concat(str));
              return (TagField)iD3v23Frame1;
            } 
            if (str.length() == 3) {
              iD3v23Frame1 = createFrame("TYER");
              ((AbstractFrameBodyTextInfo)iD3v23Frame1.getBody()).setText("0".concat(str));
              return (TagField)iD3v23Frame1;
            } 
            if (str.length() == 4) {
              iD3v23Frame1 = createFrame("TYER");
              ((AbstractFrameBodyTextInfo)iD3v23Frame1.getBody()).setText(str);
              return (TagField)iD3v23Frame1;
            } 
            if (str.length() > 4) {
              ID3v23Frame iD3v23Frame;
              iD3v23Frame1 = createFrame("TYER");
              ((AbstractFrameBodyTextInfo)iD3v23Frame1.getBody()).setText(str.substring(0, 4));
              if (str.length() >= 10) {
                String str1 = str.substring(5, 7);
                String str2 = str.substring(8, 10);
                iD3v23Frame = createFrame("TDAT");
                ((AbstractFrameBodyTextInfo)iD3v23Frame.getBody()).setText(str2.concat(str1));
                TyerTdatAggregatedFrame tyerTdatAggregatedFrame = new TyerTdatAggregatedFrame();
                tyerTdatAggregatedFrame.addFrame(iD3v23Frame1);
                tyerTdatAggregatedFrame.addFrame(iD3v23Frame);
                return (TagField)tyerTdatAggregatedFrame;
              } 
              if (iD3v23Frame.length() >= 7) {
                String str1 = iD3v23Frame.substring(5, 7);
                iD3v23Frame2 = createFrame("TDAT");
                ((AbstractFrameBodyTextInfo)iD3v23Frame2.getBody()).setText("01".concat(str1));
                TyerTdatAggregatedFrame tyerTdatAggregatedFrame = new TyerTdatAggregatedFrame();
                tyerTdatAggregatedFrame.addFrame(iD3v23Frame1);
                tyerTdatAggregatedFrame.addFrame(iD3v23Frame2);
                return (TagField)tyerTdatAggregatedFrame;
              } 
              return (TagField)iD3v23Frame1;
            } 
            return null;
          } 
          return super.createField((FieldKey)iD3v23Frame1, (String[])iD3v23Frame2);
        } 
      } 
      l0.l("Argument cannot be null");
      return null;
    } 
    l0.d();
    return null;
  }
  
  public TagField createField(ID3v23FieldKey paramID3v23FieldKey, String paramString) {
    if (paramID3v23FieldKey != null)
      return doCreateTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v23FieldKey.getFrameId(), paramID3v23FieldKey.getSubId()), new String[] { paramString }); 
    l0.d();
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    ID3v23Frame iD3v23Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyAPIC frameBodyAPIC = (FrameBodyAPIC)iD3v23Frame.getBody();
    if (!paramArtwork.isLinked()) {
      frameBodyAPIC.setObjectValue("PictureData", paramArtwork.getBinaryData());
      frameBodyAPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyAPIC.setObjectValue("MIMEType", paramArtwork.getMimeType());
      frameBodyAPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v23Frame;
    } 
    try {
      frameBodyAPIC.setObjectValue("PictureData", paramArtwork.getImageUrl().getBytes("ISO-8859-1"));
      frameBodyAPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyAPIC.setObjectValue("MIMEType", "-->");
      frameBodyAPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v23Frame;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      l0.f(unsupportedEncodingException.getMessage());
      return null;
    } 
  }
  
  public ID3v23Frame createFrame(String paramString) {
    return new ID3v23Frame(paramString);
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("tag", getIdentifier());
    createStructureHeader();
    MP3File.getStructureFormatter().f("header", "");
    MP3File.getStructureFormatter().c("unsyncronisation", isUnsynchronization());
    MP3File.getStructureFormatter().c("extended", this.extended);
    MP3File.getStructureFormatter().c("experimental", this.experimental);
    MP3File.getStructureFormatter().a("crcdata", this.crc32);
    MP3File.getStructureFormatter().a("paddingsize", this.paddingSize);
    MP3File.getStructureFormatter().d("header");
    createStructureBody();
    MP3File.getStructureFormatter().d("tag");
  }
  
  public void deleteField(String paramString) {
    doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramString, null));
  }
  
  public void deleteField(ID3v23FieldKey paramID3v23FieldKey) {
    if (paramID3v23FieldKey != null) {
      doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v23FieldKey.getFrameId(), paramID3v23FieldKey.getSubId()));
      return;
    } 
    l0.d();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v23Tag))
      return false; 
    ID3v23Tag iD3v23Tag = (ID3v23Tag)paramObject;
    return (this.crc32 != iD3v23Tag.crc32) ? false : ((this.crcDataFlag != iD3v23Tag.crcDataFlag) ? false : ((this.experimental != iD3v23Tag.experimental) ? false : ((this.extended != iD3v23Tag.extended) ? false : ((this.paddingSize == iD3v23Tag.paddingSize && super.equals(paramObject))))));
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList;
    if (paramFieldKey == FieldKey.GENRE) {
      List<TagField> list = getFields(paramFieldKey);
      arrayList = new ArrayList();
      if (list != null && list.size() > 0) {
        Iterator<String> iterator = ((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().iterator();
        while (iterator.hasNext())
          arrayList.add(FrameBodyTCON.convertID3v23GenreToGeneric(iterator.next())); 
      } 
      return arrayList;
    } 
    if (arrayList == FieldKey.YEAR) {
      List<TagField> list = getFields((FieldKey)arrayList);
      arrayList = new ArrayList<String>();
      if (list != null && list.size() > 0)
        for (TagField tagField : list) {
          if (tagField instanceof TagTextField)
            arrayList.add(((TagTextField)tagField).getContent()); 
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
  
  public int getCrc32() {
    return this.crc32;
  }
  
  public List<TagField> getFields(FieldKey paramFieldKey) {
    AggregatedFrame aggregatedFrame = null;
    if (paramFieldKey != null) {
      ArrayList<AggregatedFrame> arrayList;
      if (paramFieldKey == FieldKey.YEAR) {
        List<TagField> list = getFrame("TYERTDAT");
        AggregatedFrame aggregatedFrame1 = aggregatedFrame;
        if (list != null) {
          aggregatedFrame1 = aggregatedFrame;
          if (!list.isEmpty())
            aggregatedFrame1 = (AggregatedFrame)list.get(0); 
        } 
        if (aggregatedFrame1 != null) {
          arrayList = new ArrayList();
          arrayList.add(aggregatedFrame1);
          return (List)arrayList;
        } 
        return super.getFields((FieldKey)arrayList);
      } 
      return super.getFields((FieldKey)arrayList);
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public String getFirst(ID3v23FieldKey paramID3v23FieldKey) {
    if (paramID3v23FieldKey != null) {
      FieldKey fieldKey = ID3v23Frames.getInstanceOf().getGenericKeyFromId3(paramID3v23FieldKey);
      return (fieldKey != null) ? getFirst(fieldKey) : doGetValueAtIndex(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v23FieldKey.getFrameId(), paramID3v23FieldKey.getSubId()), 0);
    } 
    l0.d();
    return null;
  }
  
  public AbstractID3v2Tag.FrameAndSubId getFrameAndSubIdFromGenericKey(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      ID3v23FieldKey iD3v23FieldKey = ID3v23Frames.getInstanceOf().getId3KeyFromGenericKey(paramFieldKey);
      if (iD3v23FieldKey != null)
        return new AbstractID3v2Tag.FrameAndSubId(this, paramFieldKey, iD3v23FieldKey.getFrameId(), iD3v23FieldKey.getSubId()); 
      throw new KeyNotFoundException(paramFieldKey.name());
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public ID3Frames getID3Frames() {
    return ID3v23Frames.getInstanceOf();
  }
  
  public String getIdentifier() {
    return "ID3v2.30";
  }
  
  public byte getMajorVersion() {
    return 3;
  }
  
  public int getPaddingSize() {
    return this.paddingSize;
  }
  
  public Comparator<String> getPreferredFrameOrderComparator() {
    return ID3v23PreferredFrameOrderComparator.getInstanceof();
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
      int j = 10 + TAG_EXT_HEADER_LENGTH;
      i = j;
      if (this.crcDataFlag)
        i = j + TAG_EXT_HEADER_CRC_LENGTH; 
    } 
    return i + super.getSize();
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    AggregatedFrame aggregatedFrame = null;
    if (paramFieldKey != null) {
      List<TagField> list;
      if (paramFieldKey == FieldKey.YEAR) {
        List<TagField> list1 = getFrame("TYERTDAT");
        AggregatedFrame aggregatedFrame1 = aggregatedFrame;
        if (list1 != null) {
          aggregatedFrame1 = aggregatedFrame;
          if (!list1.isEmpty())
            aggregatedFrame1 = (AggregatedFrame)list1.get(0); 
        } 
        return (aggregatedFrame1 != null) ? aggregatedFrame1.getContent() : super.getValue(paramFieldKey, paramInt);
      } 
      if (paramFieldKey == FieldKey.GENRE) {
        list = getFields(paramFieldKey);
        return (list != null && list.size() > 0) ? FrameBodyTCON.convertID3v23GenreToGeneric(((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().get(paramInt)) : "";
      } 
      return super.getValue((FieldKey)list, paramInt);
    } 
    l0.d();
    return null;
  }
  
  public boolean isUnsynchronization() {
    return this.unsynchronization;
  }
  
  public void loadFrameIntoMap(String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyTCON)
      ((FrameBodyTCON)paramAbstractID3v2Frame.getBody()).setV23Format(); 
    super.loadFrameIntoMap(paramString, paramAbstractID3v2Frame);
  }
  
  public void loadFrameIntoSpecifiedMap(Map<String, List<TagField>> paramMap, String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    Logger logger;
    StringBuilder stringBuilder;
    TyerTdatAggregatedFrame tyerTdatAggregatedFrame;
    if (!paramString.equals("TYER") && !paramString.equals("TDAT")) {
      super.loadFrameIntoSpecifiedMap(paramMap, paramString, paramAbstractID3v2Frame);
      return;
    } 
    if (paramString.equals("TDAT") && paramAbstractID3v2Frame.getContent().length() == 0) {
      logger = AbstractID3Tag.logger;
      stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":TDAT is empty so just ignoring");
      logger.warning(stringBuilder.toString());
      return;
    } 
    if (logger.containsKey(stringBuilder) || logger.containsKey("TYERTDAT")) {
      if (this.duplicateFrameId.length() > 0)
        this.duplicateFrameId = x41.n(new StringBuilder(), this.duplicateFrameId, oXrNDUqUkE.rYgC); 
      this.duplicateFrameId = x41.n(new StringBuilder(), this.duplicateFrameId, (String)stringBuilder);
      int i = this.duplicateBytes;
      this.duplicateBytes = paramAbstractID3v2Frame.getSize() + i;
      return;
    } 
    if (stringBuilder.equals("TYER")) {
      if (logger.containsKey("TDAT")) {
        tyerTdatAggregatedFrame = new TyerTdatAggregatedFrame();
        tyerTdatAggregatedFrame.addFrame(paramAbstractID3v2Frame);
        for (TagField tagField : logger.get("TDAT")) {
          if (tagField instanceof AbstractID3v2Frame)
            tyerTdatAggregatedFrame.addFrame((AbstractID3v2Frame)tagField); 
        } 
        logger.remove("TDAT");
        putAsList((Map<String, List<TagField>>)logger, "TYERTDAT", (TagField)tyerTdatAggregatedFrame);
        return;
      } 
      putAsList((Map<String, List<TagField>>)logger, "TYER", tagField);
      return;
    } 
    if (tyerTdatAggregatedFrame.equals("TDAT")) {
      if (logger.containsKey("TYER")) {
        TyerTdatAggregatedFrame tyerTdatAggregatedFrame1 = new TyerTdatAggregatedFrame();
        for (TagField tagField1 : logger.get("TYER")) {
          if (tagField1 instanceof AbstractID3v2Frame)
            tyerTdatAggregatedFrame1.addFrame((AbstractID3v2Frame)tagField1); 
        } 
        tyerTdatAggregatedFrame1.addFrame((AbstractID3v2Frame)tagField);
        logger.remove("TYER");
        putAsList((Map<String, List<TagField>>)logger, "TYERTDAT", (TagField)tyerTdatAggregatedFrame1);
        return;
      } 
      putAsList((Map<String, List<TagField>>)logger, "TDAT", tagField);
    } 
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      Logger logger2 = AbstractID3Tag.logger;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(getLoggingFilename());
      stringBuilder2.append(":Reading ID3v23 tag");
      logger2.config(stringBuilder2.toString());
      readHeaderFlags(paramByteBuffer);
      int i = ID3SyncSafeInteger.bufferToValue(paramByteBuffer);
      AbstractID3Tag.logger.config(MessageFormat.format("{0} Tag size is {1} according to header (does not include header size, add 10)", new Object[] { getLoggingFilename(), Integer.valueOf(i) }));
      if (this.extended)
        readExtendedHeader(paramByteBuffer, i); 
      ByteBuffer byteBuffer = paramByteBuffer.slice();
      paramByteBuffer = byteBuffer;
      if (isUnsynchronization())
        paramByteBuffer = ID3Unsynchronization.synchronize(byteBuffer); 
      readFrames(paramByteBuffer, i);
      Logger logger1 = AbstractID3Tag.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":Loaded Frames,there are:");
      stringBuilder1.append(this.frameMap.keySet().size());
      logger1.config(stringBuilder1.toString());
      return;
    } 
    String str = getIdentifier();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(" tag not found");
    throw new TagNotFoundException(stringBuilder.toString());
  }
  
  public void readFrames(ByteBuffer paramByteBuffer, int paramInt) {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    this.fileReadSize = paramInt;
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Start of frame body at:");
    stringBuilder.append(paramByteBuffer.position());
    stringBuilder.append(",frames data size is:");
    stringBuilder.append(paramInt);
    logger.finest(stringBuilder.toString());
    while (paramByteBuffer.position() < paramInt) {
      try {
        int i = paramByteBuffer.position();
        logger = AbstractID3Tag.logger;
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Looking for next frame at:");
        stringBuilder.append(i);
        logger.config(stringBuilder.toString());
        ID3v23Frame iD3v23Frame = new ID3v23Frame();
        this(paramByteBuffer, getLoggingFilename());
        String str = iD3v23Frame.getIdentifier();
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Found ");
        stringBuilder1.append(str);
        stringBuilder1.append(" at frame at:");
        stringBuilder1.append(i);
        logger1.config(stringBuilder1.toString());
        loadFrameIntoMap(str, iD3v23Frame);
      } catch (PaddingException paddingException) {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Found padding starting at:");
        stringBuilder1.append(paramByteBuffer.position());
        logger1.info(stringBuilder1.toString());
        break;
      } catch (EmptyFrameException emptyFrameException) {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Empty Frame:");
        stringBuilder1.append(emptyFrameException.getMessage());
        logger1.warning(stringBuilder1.toString());
        this.emptyFrameBytes += 10;
      } catch (InvalidFrameIdentifierException invalidFrameIdentifierException) {
        logger = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(LHyji.xztcIHT);
        stringBuilder1.append(invalidFrameIdentifierException.getMessage());
        logger.warning(stringBuilder1.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidFrameException invalidFrameException) {
        Logger logger1 = AbstractID3Tag.logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Invalid Frame:");
        stringBuilder.append(invalidFrameException.getMessage());
        logger1.warning(stringBuilder.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidDataTypeException invalidDataTypeException) {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Corrupt Frame:");
        stringBuilder1.append(invalidDataTypeException.getMessage());
        logger1.warning(stringBuilder1.toString());
        this.invalidFrames++;
      } 
    } 
  }
  
  public void removeFrame(String paramString) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("Removing frame with identifier:");
    stringBuilder.append(paramString);
    logger.config(stringBuilder.toString());
    this.frameMap.remove(paramString);
    boolean bool = paramString.equals("TYER");
    Map<String, List<TagField>> map = this.frameMap;
    if (bool) {
      map.remove("TYER");
      this.frameMap.remove("TYERTDAT");
      return;
    } 
    map.remove(paramString);
  }
  
  public long write(u00 paramu00, long paramLong) {
    boolean bool;
    setLoggingFilename(paramu00.h());
    Logger logger3 = AbstractID3Tag.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Writing tag to file:");
    stringBuilder1.append(getLoggingFilename());
    logger3.config(stringBuilder1.toString());
    byte[] arrayOfByte2 = writeFramesToBuffer().toByteArray();
    Logger logger1 = AbstractID3Tag.logger;
    StringBuilder stringBuilder4 = new StringBuilder();
    stringBuilder4.append(getLoggingFilename());
    stringBuilder4.append(":bodybytebuffer:sizebeforeunsynchronisation:");
    stringBuilder4.append(arrayOfByte2.length);
    logger1.config(stringBuilder4.toString());
    if (TagOptionSingleton.getInstance().isUnsyncTags() && ID3Unsynchronization.requiresUnsynchronization(arrayOfByte2)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.unsynchronization = bool;
    byte[] arrayOfByte1 = arrayOfByte2;
    if (isUnsynchronization()) {
      arrayOfByte1 = ID3Unsynchronization.unsynchronize(arrayOfByte2);
      Logger logger = AbstractID3Tag.logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":bodybytebuffer:sizeafterunsynchronisation:");
      stringBuilder.append(arrayOfByte1.length);
      logger.config(stringBuilder.toString());
    } 
    int j = calculateTagSize(arrayOfByte1.length + 10, (int)paramLong);
    int i = j - arrayOfByte1.length + 10;
    Logger logger4 = AbstractID3Tag.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":Current audiostart:");
    stringBuilder2.append(paramLong);
    logger4.config(stringBuilder2.toString());
    logger4 = AbstractID3Tag.logger;
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(FgdLmmRfTxSFKI.osfX);
    stringBuilder2.append(j);
    logger4.config(stringBuilder2.toString());
    Logger logger2 = AbstractID3Tag.logger;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(getLoggingFilename());
    stringBuilder3.append(":Padding:");
    stringBuilder3.append(i);
    logger2.config(stringBuilder3.toString());
    writeBufferToFile(paramu00, writeHeaderToBuffer(i, arrayOfByte1.length), arrayOfByte1, i, j, paramLong);
    return j;
  }
  
  public void write(WritableByteChannel paramWritableByteChannel, int paramInt) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(getLoggingFilename());
    stringBuilder1.append(":Writing tag to channel");
    logger.config(stringBuilder1.toString());
    byte[] arrayOfByte2 = writeFramesToBuffer().toByteArray();
    logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":bodybytebuffer:sizebeforeunsynchronisation:");
    stringBuilder2.append(arrayOfByte2.length);
    logger.config(stringBuilder2.toString());
    boolean bool = TagOptionSingleton.getInstance().isUnsyncTags();
    int i = 0;
    if (bool && ID3Unsynchronization.requiresUnsynchronization(arrayOfByte2)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.unsynchronization = bool;
    byte[] arrayOfByte1 = arrayOfByte2;
    if (isUnsynchronization()) {
      arrayOfByte1 = ID3Unsynchronization.unsynchronize(arrayOfByte2);
      Logger logger1 = AbstractID3Tag.logger;
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(getLoggingFilename());
      stringBuilder2.append(":bodybytebuffer:sizeafterunsynchronisation:");
      stringBuilder2.append(arrayOfByte1.length);
      logger1.config(stringBuilder2.toString());
    } 
    if (paramInt > 0) {
      i = calculateTagSize(arrayOfByte1.length + 10, paramInt) - arrayOfByte1.length + 10;
      Logger logger1 = AbstractID3Tag.logger;
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(getLoggingFilename());
      stringBuilder2.append(":Padding:");
      stringBuilder2.append(i);
      logger1.config(stringBuilder2.toString());
    } 
    paramWritableByteChannel.write(writeHeaderToBuffer(i, arrayOfByte1.length));
    paramWritableByteChannel.write(ByteBuffer.wrap(arrayOfByte1));
    writePadding(paramWritableByteChannel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v23Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */