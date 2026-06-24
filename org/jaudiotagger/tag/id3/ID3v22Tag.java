package org.jaudiotagger.tag.id3;

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
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
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
import org.jaudiotagger.tag.id3.framebody.AbstractFrameBodyTextInfo;
import org.jaudiotagger.tag.id3.framebody.FrameBodyPIC;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCON;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTDRC;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;
import org.jaudiotagger.tag.reference.PictureTypes;
import tp;
import u00;

public class ID3v22Tag extends AbstractID3v2Tag {
  public static final byte MAJOR_VERSION = 2;
  
  public static final int MASK_V22_COMPRESSION = 64;
  
  public static final int MASK_V22_UNSYNCHRONIZATION = 128;
  
  public static final byte RELEASE = 2;
  
  public static final byte REVISION = 0;
  
  protected static final String TYPE_COMPRESSION = "compression";
  
  protected static final String TYPE_UNSYNCHRONISATION = "unsyncronisation";
  
  protected boolean compression = false;
  
  protected boolean unsynchronization = false;
  
  public ID3v22Tag() {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
  }
  
  public ID3v22Tag(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, "");
  }
  
  public ID3v22Tag(ByteBuffer paramByteBuffer, String paramString) {
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v22Tag(AbstractTag paramAbstractTag) {
    this.frameMap = new LinkedHashMap<String, List<TagField>>();
    this.encryptedFrameMap = new LinkedHashMap<String, List<TagField>>();
    AbstractID3Tag.logger.config("Creating tag from a tag of a different version");
    if (paramAbstractTag != null) {
      if (paramAbstractTag instanceof ID3v23Tag || !(paramAbstractTag instanceof ID3v22Tag)) {
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
  
  public ID3v22Tag(ID3v22Tag paramID3v22Tag) {
    super(paramID3v22Tag);
    AbstractID3Tag.logger.config("Creating tag from another tag of same type");
    copyPrimitives(paramID3v22Tag);
    copyFrames(paramID3v22Tag);
  }
  
  private void readHeaderFlags(ByteBuffer paramByteBuffer) {
    boolean bool1;
    Integer integer = Integer.valueOf(8);
    byte b = paramByteBuffer.get();
    boolean bool2 = false;
    if ((b & 0x80) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.unsynchronization = bool1;
    if ((b & 0x40) != 0)
      bool2 = true; 
    this.compression = bool2;
    if (bool1)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is unsynchronized", new Object[] { getLoggingFilename() })); 
    if (this.compression)
      AbstractID3Tag.logger.config(MessageFormat.format("{0} the ID3 Tag is compressed", new Object[] { getLoggingFilename() })); 
    if ((b & 0x20) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(32) })); 
    if ((b & 0x10) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(16) })); 
    if ((b & 0x8) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), integer })); 
    if ((b & 0x4) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(4) })); 
    if ((b & 0x2) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), Integer.valueOf(2) })); 
    if ((b & 0x1) != 0)
      AbstractID3Tag.logger.warning(MessageFormat.format("{0} Invalid or unknown bit flag 0x{1} set in ID3 tag header", new Object[] { getLoggingFilename(), integer })); 
  }
  
  private ByteBuffer writeHeaderToBuffer(int paramInt1, int paramInt2) {
    byte b1 = 0;
    this.compression = false;
    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    byteBuffer.put(AbstractID3v2Tag.TAG_ID);
    byteBuffer.put(getMajorVersion());
    byteBuffer.put(getRevision());
    if (this.unsynchronization)
      b1 = -128; 
    byte b2 = b1;
    if (this.compression)
      b2 = (byte)(b1 | 0x40); 
    byteBuffer.put(b2);
    byteBuffer.put(ID3SyncSafeInteger.valueToBuffer(paramInt1 + paramInt2));
    byteBuffer.flip();
    return byteBuffer;
  }
  
  public void addFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    try {
      if (paramAbstractID3v2Frame instanceof ID3v22Frame) {
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
  
  public List<AbstractID3v2Frame> convertFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    FrameBodyTDRC frameBodyTDRC;
    ArrayList<ID3v22Frame> arrayList = new ArrayList();
    if (paramAbstractID3v2Frame.getIdentifier().equals("TDRC") && paramAbstractID3v2Frame.getBody() instanceof FrameBodyTDRC) {
      frameBodyTDRC = (FrameBodyTDRC)paramAbstractID3v2Frame.getBody();
      if (frameBodyTDRC.getYear().length() != 0) {
        ID3v22Frame iD3v22Frame = new ID3v22Frame("TYE");
        ((AbstractFrameBodyTextInfo)iD3v22Frame.getBody()).setText(frameBodyTDRC.getYear());
        arrayList.add(iD3v22Frame);
      } 
      if (frameBodyTDRC.getTime().length() != 0) {
        ID3v22Frame iD3v22Frame = new ID3v22Frame("TIM");
        ((AbstractFrameBodyTextInfo)iD3v22Frame.getBody()).setText(frameBodyTDRC.getTime());
        arrayList.add(iD3v22Frame);
      } 
      return (List)arrayList;
    } 
    arrayList.add(new ID3v22Frame((AbstractID3v2Frame)frameBodyTDRC));
    return (List)arrayList;
  }
  
  public void copyPrimitives(AbstractID3v2Tag paramAbstractID3v2Tag) {
    AbstractID3Tag.logger.config("Copying primitives");
    super.copyPrimitives(paramAbstractID3v2Tag);
    if (paramAbstractID3v2Tag instanceof ID3v22Tag) {
      paramAbstractID3v2Tag = paramAbstractID3v2Tag;
      this.compression = ((ID3v22Tag)paramAbstractID3v2Tag).compression;
      this.unsynchronization = ((ID3v22Tag)paramAbstractID3v2Tag).unsynchronization;
      return;
    } 
    if (paramAbstractID3v2Tag instanceof ID3v23Tag) {
      paramAbstractID3v2Tag = paramAbstractID3v2Tag;
      this.compression = ((ID3v23Tag)paramAbstractID3v2Tag).compression;
      this.unsynchronization = ((ID3v23Tag)paramAbstractID3v2Tag).unsynchronization;
      return;
    } 
    if (paramAbstractID3v2Tag instanceof ID3v24Tag) {
      paramAbstractID3v2Tag = paramAbstractID3v2Tag;
      this.compression = false;
      this.unsynchronization = ((ID3v24Tag)paramAbstractID3v2Tag).unsynchronization;
    } 
  }
  
  public TagField createArtworkField(byte[] paramArrayOfbyte, String paramString) {
    ID3v22Frame iD3v22Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyPIC frameBodyPIC = (FrameBodyPIC)iD3v22Frame.getBody();
    frameBodyPIC.setObjectValue("PictureData", paramArrayOfbyte);
    frameBodyPIC.setObjectValue("PictureType", PictureTypes.DEFAULT_ID);
    frameBodyPIC.setObjectValue("ImageType", ImageFormats.getFormatForMimeType(paramString));
    frameBodyPIC.setObjectValue("Description", "");
    return (TagField)iD3v22Frame;
  }
  
  public TagField createField(FieldKey paramFieldKey, String... paramVarArgs) {
    if (paramFieldKey != null) {
      if (paramVarArgs != null) {
        FrameBodyTCON frameBodyTCON;
        ID3v22Frame iD3v22Frame;
        String str = paramVarArgs[0];
        if (paramFieldKey == FieldKey.GENRE) {
          if (str != null) {
            iD3v22Frame = createFrame(getFrameAndSubIdFromGenericKey(paramFieldKey).getFrameId());
            frameBodyTCON = (FrameBodyTCON)iD3v22Frame.getBody();
            frameBodyTCON.setV23Format();
            frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v22Genre(str));
            return (TagField)iD3v22Frame;
          } 
          l0.l("Argument cannot be null");
          return null;
        } 
        return super.createField((FieldKey)frameBodyTCON, (String[])iD3v22Frame);
      } 
      l0.l("Argument cannot be null");
      return null;
    } 
    l0.d();
    return null;
  }
  
  public TagField createField(ID3v22FieldKey paramID3v22FieldKey, String paramString) {
    if (paramID3v22FieldKey != null)
      return doCreateTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v22FieldKey.getFrameId(), paramID3v22FieldKey.getSubId()), new String[] { paramString }); 
    l0.d();
    return null;
  }
  
  public TagField createField(Artwork paramArtwork) {
    ID3v22Frame iD3v22Frame = createFrame(getFrameAndSubIdFromGenericKey(FieldKey.COVER_ART).getFrameId());
    FrameBodyPIC frameBodyPIC = (FrameBodyPIC)iD3v22Frame.getBody();
    if (!paramArtwork.isLinked()) {
      frameBodyPIC.setObjectValue("PictureData", paramArtwork.getBinaryData());
      frameBodyPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyPIC.setObjectValue("ImageType", ImageFormats.getFormatForMimeType(paramArtwork.getMimeType()));
      frameBodyPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v22Frame;
    } 
    try {
      frameBodyPIC.setObjectValue("PictureData", paramArtwork.getImageUrl().getBytes("ISO-8859-1"));
      frameBodyPIC.setObjectValue("PictureType", Integer.valueOf(paramArtwork.getPictureType()));
      frameBodyPIC.setObjectValue("ImageType", "-->");
      frameBodyPIC.setObjectValue("Description", paramArtwork.getDescription());
      return (TagField)iD3v22Frame;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      l0.f(unsupportedEncodingException.getMessage());
      return null;
    } 
  }
  
  public ID3v22Frame createFrame(String paramString) {
    return new ID3v22Frame(paramString);
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("tag", getIdentifier());
    createStructureHeader();
    MP3File.getStructureFormatter().f("header", "");
    MP3File.getStructureFormatter().c("compression", this.compression);
    MP3File.getStructureFormatter().c("unsyncronisation", this.unsynchronization);
    MP3File.getStructureFormatter().d("header");
    createStructureBody();
    MP3File.getStructureFormatter().d("tag");
  }
  
  public void deleteField(String paramString) {
    doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramString, null));
  }
  
  public void deleteField(ID3v22FieldKey paramID3v22FieldKey) {
    if (paramID3v22FieldKey != null) {
      doDeleteTagField(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v22FieldKey.getFrameId(), paramID3v22FieldKey.getSubId()));
      return;
    } 
    l0.d();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v22Tag))
      return false; 
    ID3v22Tag iD3v22Tag = (ID3v22Tag)paramObject;
    return (this.compression != iD3v22Tag.compression) ? false : ((this.unsynchronization == iD3v22Tag.unsynchronization && super.equals(paramObject)));
  }
  
  public List<String> getAll(FieldKey paramFieldKey) {
    ArrayList<String> arrayList;
    if (paramFieldKey == FieldKey.GENRE) {
      List<TagField> list = getFields(paramFieldKey);
      arrayList = new ArrayList();
      if (list != null && list.size() > 0) {
        Iterator<String> iterator = ((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().iterator();
        while (iterator.hasNext())
          arrayList.add(FrameBodyTCON.convertID3v22GenreToGeneric(iterator.next())); 
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
      FrameBodyPIC frameBodyPIC = (FrameBodyPIC)((AbstractID3v2Frame)iterator.next()).getBody();
      Artwork artwork = ArtworkFactory.getNew();
      artwork.setMimeType(ImageFormats.getMimeTypeForFormat(frameBodyPIC.getFormatType()));
      artwork.setPictureType(frameBodyPIC.getPictureType());
      artwork.setDescription(frameBodyPIC.getDescription());
      if (frameBodyPIC.isImageUrl()) {
        artwork.setLinked(true);
        artwork.setImageUrl(frameBodyPIC.getImageUrl());
      } else {
        artwork.setBinaryData(frameBodyPIC.getImageData());
      } 
      arrayList.add(artwork);
    } 
    return arrayList;
  }
  
  public String getFirst(ID3v22FieldKey paramID3v22FieldKey) {
    if (paramID3v22FieldKey != null) {
      FieldKey fieldKey = ID3v22Frames.getInstanceOf().getGenericKeyFromId3(paramID3v22FieldKey);
      return (fieldKey != null) ? getFirst(fieldKey) : doGetValueAtIndex(new AbstractID3v2Tag.FrameAndSubId(this, null, paramID3v22FieldKey.getFrameId(), paramID3v22FieldKey.getSubId()), 0);
    } 
    l0.d();
    return null;
  }
  
  public AbstractID3v2Tag.FrameAndSubId getFrameAndSubIdFromGenericKey(FieldKey paramFieldKey) {
    if (paramFieldKey != null) {
      ID3v22FieldKey iD3v22FieldKey = ID3v22Frames.getInstanceOf().getId3KeyFromGenericKey(paramFieldKey);
      if (iD3v22FieldKey != null)
        return new AbstractID3v2Tag.FrameAndSubId(this, paramFieldKey, iD3v22FieldKey.getFrameId(), iD3v22FieldKey.getSubId()); 
      throw new KeyNotFoundException(paramFieldKey.name());
    } 
    l0.l("Argument cannot be null");
    return null;
  }
  
  public ID3Frames getID3Frames() {
    return ID3v22Frames.getInstanceOf();
  }
  
  public String getIdentifier() {
    return "ID3v2_2.20";
  }
  
  public byte getMajorVersion() {
    return 2;
  }
  
  public Comparator<String> getPreferredFrameOrderComparator() {
    return ID3v22PreferredFrameOrderComparator.getInstanceof();
  }
  
  public byte getRelease() {
    return 2;
  }
  
  public byte getRevision() {
    return 0;
  }
  
  public int getSize() {
    return super.getSize() + 10;
  }
  
  public String getValue(FieldKey paramFieldKey, int paramInt) {
    if (paramFieldKey != null) {
      List<TagField> list;
      if (paramFieldKey == FieldKey.GENRE) {
        list = getFields(paramFieldKey);
        return (list != null && list.size() > 0) ? FrameBodyTCON.convertID3v22GenreToGeneric(((FrameBodyTCON)((AbstractID3v2Frame)list.get(0)).getBody()).getValues().get(paramInt)) : "";
      } 
      return super.getValue((FieldKey)list, paramInt);
    } 
    l0.d();
    return null;
  }
  
  public boolean isCompression() {
    return this.compression;
  }
  
  public boolean isUnsynchronization() {
    return this.unsynchronization;
  }
  
  public void loadFrameIntoMap(String paramString, AbstractID3v2Frame paramAbstractID3v2Frame) {
    if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyTCON)
      ((FrameBodyTCON)paramAbstractID3v2Frame.getBody()).setV23Format(); 
    super.loadFrameIntoMap(paramString, paramAbstractID3v2Frame);
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    if (seek(paramByteBuffer)) {
      Logger logger2 = AbstractID3Tag.logger;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(getLoggingFilename());
      stringBuilder2.append(":Reading tag from file");
      logger2.config(stringBuilder2.toString());
      readHeaderFlags(paramByteBuffer);
      int i = ID3SyncSafeInteger.bufferToValue(paramByteBuffer);
      ByteBuffer byteBuffer = paramByteBuffer.slice();
      paramByteBuffer = byteBuffer;
      if (this.unsynchronization)
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
    throw new TagNotFoundException("ID3v2.20 tag not found");
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
    stringBuilder.append(",frames sizes and padding is:");
    stringBuilder.append(paramInt);
    logger.finest(stringBuilder.toString());
    while (paramByteBuffer.position() < paramInt) {
      try {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":looking for next frame at:");
        stringBuilder1.append(paramByteBuffer.position());
        logger1.config(stringBuilder1.toString());
        ID3v22Frame iD3v22Frame = new ID3v22Frame();
        this(paramByteBuffer, getLoggingFilename());
        loadFrameIntoMap(iD3v22Frame.getIdentifier(), iD3v22Frame);
      } catch (PaddingException paddingException) {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Found padding starting at:");
        stringBuilder1.append(paramByteBuffer.position());
        logger1.config(stringBuilder1.toString());
        break;
      } catch (EmptyFrameException emptyFrameException) {
        logger = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(JkpGFvCVQHzgc.LURVKmNrVoaAsp);
        stringBuilder1.append(emptyFrameException.getMessage());
        logger.warning(stringBuilder1.toString());
        this.emptyFrameBytes += 6;
      } catch (InvalidFrameIdentifierException invalidFrameIdentifierException) {
        Logger logger1 = AbstractID3Tag.logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Invalid Frame Identifier:");
        stringBuilder.append(invalidFrameIdentifierException.getMessage());
        logger1.config(stringBuilder.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidFrameException invalidFrameException) {
        Logger logger1 = AbstractID3Tag.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Invalid Frame:");
        stringBuilder1.append(invalidFrameException.getMessage());
        logger1.warning(stringBuilder1.toString());
        this.invalidFrames++;
        break;
      } catch (InvalidDataTypeException invalidDataTypeException) {
        Logger logger1 = AbstractID3Tag.logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Corrupt Frame:");
        stringBuilder.append(invalidDataTypeException.getMessage());
        logger1.warning(stringBuilder.toString());
        this.invalidFrames++;
      } 
    } 
  }
  
  public void translateFrame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    FrameBodyTDRC frameBodyTDRC = (FrameBodyTDRC)paramAbstractID3v2Frame.getBody();
    if (frameBodyTDRC.getYear().length() != 0) {
      ID3v22Frame iD3v22Frame = new ID3v22Frame("TYE");
      ((AbstractFrameBodyTextInfo)iD3v22Frame.getBody()).setText(frameBodyTDRC.getYear());
      setFrame(iD3v22Frame);
    } 
    if (frameBodyTDRC.getTime().length() != 0) {
      ID3v22Frame iD3v22Frame = new ID3v22Frame("TIM");
      ((AbstractFrameBodyTextInfo)iD3v22Frame.getBody()).setText(frameBodyTDRC.getTime());
      setFrame(iD3v22Frame);
    } 
  }
  
  public long write(u00 paramu00, long paramLong) {
    boolean bool;
    setLoggingFilename(paramu00.h());
    Logger logger2 = AbstractID3Tag.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Writing tag to file:");
    stringBuilder1.append(getLoggingFilename());
    logger2.config(stringBuilder1.toString());
    byte[] arrayOfByte2 = writeFramesToBuffer().toByteArray();
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
    Logger logger1 = AbstractID3Tag.logger;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(getLoggingFilename());
    stringBuilder3.append(":Current audiostart:");
    stringBuilder3.append(paramLong);
    logger1.config(stringBuilder3.toString());
    Logger logger3 = AbstractID3Tag.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":Size including padding:");
    stringBuilder2.append(j);
    logger3.config(stringBuilder2.toString());
    logger3 = AbstractID3Tag.logger;
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":Padding:");
    stringBuilder2.append(i);
    logger3.config(stringBuilder2.toString());
    writeBufferToFile(paramu00, writeHeaderToBuffer(i, arrayOfByte1.length), arrayOfByte1, i, j, paramLong);
    return j;
  }
  
  public void write(WritableByteChannel paramWritableByteChannel, int paramInt) {
    Logger logger2 = AbstractID3Tag.logger;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(getLoggingFilename());
    stringBuilder1.append(":Writing tag to channel");
    logger2.config(stringBuilder1.toString());
    byte[] arrayOfByte2 = writeFramesToBuffer().toByteArray();
    Logger logger1 = AbstractID3Tag.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":bodybytebuffer:sizebeforeunsynchronisation:");
    stringBuilder2.append(arrayOfByte2.length);
    logger1.config(stringBuilder2.toString());
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
      Logger logger = AbstractID3Tag.logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":bodybytebuffer:sizeafterunsynchronisation:");
      stringBuilder.append(arrayOfByte1.length);
      logger.config(stringBuilder.toString());
    } 
    if (paramInt > 0)
      i = calculateTagSize(arrayOfByte1.length + 10, paramInt) - arrayOfByte1.length + 10; 
    paramWritableByteChannel.write(writeHeaderToBuffer(i, arrayOfByte1.length));
    paramWritableByteChannel.write(ByteBuffer.wrap(arrayOfByte1));
    writePadding(paramWritableByteChannel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v22Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */