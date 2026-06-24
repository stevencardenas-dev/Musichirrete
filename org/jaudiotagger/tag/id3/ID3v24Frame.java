package org.jaudiotagger.tag.id3;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k91;
import mk;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.EmptyFrameException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidFrameIdentifierException;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.Lyrics3Line;
import org.jaudiotagger.tag.id3.framebody.AbstractID3v2FrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyCOMM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyDeprecated;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTALB;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTCOM;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTIT2;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTMOO;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTPE1;
import org.jaudiotagger.tag.id3.framebody.FrameBodyTXXX;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyAUT;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyEAL;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyEAR;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyETT;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyINF;
import org.jaudiotagger.tag.lyrics3.FieldFrameBodyLYR;
import org.jaudiotagger.tag.lyrics3.Lyrics3v2Field;
import tp;
import wf2;
import x41;
import z51;

public class ID3v24Frame extends AbstractID3v2Frame {
  protected static final int FRAME_DATA_LENGTH_SIZE = 4;
  
  protected static final int FRAME_ENCRYPTION_INDICATOR_SIZE = 1;
  
  protected static final int FRAME_FLAGS_SIZE = 2;
  
  protected static final int FRAME_GROUPING_INDICATOR_SIZE = 1;
  
  protected static final int FRAME_HEADER_SIZE = 10;
  
  protected static final int FRAME_ID_SIZE = 4;
  
  protected static final int FRAME_SIZE_SIZE = 4;
  
  private static Pattern validFrameIdentifier = Pattern.compile("[A-Z][0-9A-Z]{3}");
  
  private int encryptionMethod;
  
  private int groupIdentifier;
  
  public ID3v24Frame() {}
  
  public ID3v24Frame(String paramString) {
    super(paramString);
    this.statusFlags = new StatusFlags();
    this.encodingFlags = new EncodingFlags();
  }
  
  public ID3v24Frame(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, "");
  }
  
  public ID3v24Frame(ByteBuffer paramByteBuffer, String paramString) {
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v24Frame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    if (!(paramAbstractID3v2Frame instanceof ID3v24Frame)) {
      boolean bool = paramAbstractID3v2Frame instanceof ID3v23Frame;
      if (bool) {
        this.statusFlags = new StatusFlags((ID3v23Frame.StatusFlags)paramAbstractID3v2Frame.getStatusFlags());
        this.encodingFlags = new EncodingFlags(paramAbstractID3v2Frame.getEncodingFlags().getFlags());
      } else if (paramAbstractID3v2Frame instanceof ID3v22Frame) {
        this.statusFlags = new StatusFlags();
        this.encodingFlags = new EncodingFlags();
      } 
      if (bool) {
        createV24FrameFromV23Frame((ID3v23Frame)paramAbstractID3v2Frame);
      } else if (paramAbstractID3v2Frame instanceof ID3v22Frame) {
        createV24FrameFromV23Frame(new ID3v23Frame(paramAbstractID3v2Frame));
      } 
      this.frameBody.setHeader(this);
      return;
    } 
    tp.j("Copy Constructor not called. Please type cast the argument");
    throw null;
  }
  
  public ID3v24Frame(ID3v23Frame paramID3v23Frame, String paramString) {
    this.identifier = paramString;
    this.statusFlags = new StatusFlags((ID3v23Frame.StatusFlags)paramID3v23Frame.getStatusFlags());
    this.encodingFlags = new EncodingFlags(paramID3v23Frame.getEncodingFlags().getFlags());
  }
  
  public ID3v24Frame(ID3v24Frame paramID3v24Frame) {
    super(paramID3v24Frame);
    this.statusFlags = new StatusFlags(paramID3v24Frame.getStatusFlags().getOriginalFlags());
    this.encodingFlags = new EncodingFlags(paramID3v24Frame.getEncodingFlags().getFlags());
  }
  
  public ID3v24Frame(Lyrics3v2Field paramLyrics3v2Field) {
    String str = paramLyrics3v2Field.getIdentifier();
    if (!str.equals("IND")) {
      Iterator<Lyrics3Line> iterator;
      FrameBodyCOMM frameBodyCOMM;
      FrameBodyTCOM frameBodyTCOM;
      FrameBodyTALB frameBodyTALB;
      FrameBodyTPE1 frameBodyTPE1;
      FrameBodySYLT frameBodySYLT;
      if (str.equals("LYR")) {
        FieldFrameBodyLYR fieldFrameBodyLYR = (FieldFrameBodyLYR)paramLyrics3v2Field.getBody();
        iterator = fieldFrameBodyLYR.iterator();
        boolean bool = fieldFrameBodyLYR.hasTimeStamp();
        frameBodySYLT = new FrameBodySYLT(0, "ENG", 2, 1, "", new byte[0]);
        FrameBodyUSLT frameBodyUSLT = new FrameBodyUSLT((byte)0, "ENG", "", "");
        while (iterator.hasNext()) {
          Lyrics3Line lyrics3Line = iterator.next();
          if (bool)
            continue; 
          frameBodyUSLT.addLyric(lyrics3Line);
        } 
        if (bool) {
          this.frameBody = (AbstractTagFrameBody)frameBodySYLT;
          frameBodySYLT.setHeader(this);
          return;
        } 
        this.frameBody = (AbstractTagFrameBody)frameBodyUSLT;
        frameBodyUSLT.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals("INF")) {
        frameBodyCOMM = new FrameBodyCOMM((byte)0, "ENG", "", ((FieldFrameBodyINF)iterator.getBody()).getAdditionalInformation());
        this.frameBody = (AbstractTagFrameBody)frameBodyCOMM;
        frameBodyCOMM.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals(ybWnIKHovcRr.ERFqskcfnbQSoB)) {
        frameBodyTCOM = new FrameBodyTCOM((byte)0, ((FieldFrameBodyAUT)frameBodyCOMM.getBody()).getAuthor());
        this.frameBody = (AbstractTagFrameBody)frameBodyTCOM;
        frameBodyTCOM.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals("EAL")) {
        frameBodyTALB = new FrameBodyTALB((byte)0, ((FieldFrameBodyEAL)frameBodyTCOM.getBody()).getAlbum());
        this.frameBody = (AbstractTagFrameBody)frameBodyTALB;
        frameBodyTALB.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals("EAR")) {
        frameBodyTPE1 = new FrameBodyTPE1((byte)0, ((FieldFrameBodyEAR)frameBodyTALB.getBody()).getArtist());
        this.frameBody = (AbstractTagFrameBody)frameBodyTPE1;
        frameBodyTPE1.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals("ETT")) {
        FrameBodyTIT2 frameBodyTIT2 = new FrameBodyTIT2((byte)0, ((FieldFrameBodyETT)frameBodyTPE1.getBody()).getTitle());
        this.frameBody = (AbstractTagFrameBody)frameBodyTIT2;
        frameBodyTIT2.setHeader(this);
        return;
      } 
      if (frameBodySYLT.equals("IMG"))
        throw new InvalidTagException("Cannot create ID3v2.40 frame from Lyrics3 image field."); 
      throw new InvalidTagException(x41.w("Cannot caret ID3v2.40 frame from ", frameBodySYLT, " Lyrics3 field"));
    } 
    throw new InvalidTagException("Cannot create ID3v2.40 frame from Lyrics3 indications field.");
  }
  
  private void checkIfFrameSizeThatIsNotSyncSafe(ByteBuffer paramByteBuffer) {
    if (this.frameSize > 127) {
      StringBuilder stringBuilder;
      int j = paramByteBuffer.position();
      paramByteBuffer.position(j - getFrameIdSize());
      int k = paramByteBuffer.getInt();
      paramByteBuffer.position(j - getFrameIdSize());
      boolean bool = ID3SyncSafeInteger.isBufferNotSyncSafe(paramByteBuffer);
      paramByteBuffer.position(j);
      if (bool) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(getLoggingFilename());
        stringBuilder1.append(":Frame size is NOT stored as a sync safe integer:");
        stringBuilder1.append(this.identifier);
        logger.warning(stringBuilder1.toString());
        if (k <= paramByteBuffer.remaining() - -getFrameFlagsSize()) {
          this.frameSize = k;
          return;
        } 
        logger = AbstractTagItem.logger;
        stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Invalid Frame size larger than size before mp3 audio:");
        stringBuilder.append(this.identifier);
        logger.warning(stringBuilder.toString());
        throw new InvalidFrameException(x41.n(new StringBuilder(), this.identifier, " is invalid frame"));
      } 
      byte[] arrayOfByte = new byte[getFrameIdSize()];
      int i = this.frameSize;
      stringBuilder.position(getFrameFlagsSize() + i + j);
      if (stringBuilder.remaining() < getFrameIdSize()) {
        stringBuilder.position(j);
        return;
      } 
      stringBuilder.get(arrayOfByte, 0, getFrameIdSize());
      stringBuilder.position(j);
      if (!isValidID3v2FrameIdentifier(new String(arrayOfByte)) && !ID3SyncSafeInteger.isBufferEmpty(arrayOfByte)) {
        Logger logger;
        if (k > stringBuilder.remaining() - getFrameFlagsSize()) {
          stringBuilder.position(j);
          return;
        } 
        byte[] arrayOfByte1 = new byte[getFrameIdSize()];
        stringBuilder.position(getFrameFlagsSize() + j + k);
        if (stringBuilder.remaining() >= getFrameIdSize()) {
          stringBuilder.get(arrayOfByte1, 0, getFrameIdSize());
          String str = new String(arrayOfByte1);
          stringBuilder.position(j);
          if (isValidID3v2FrameIdentifier(str)) {
            this.frameSize = k;
            logger = AbstractTagItem.logger;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(getLoggingFilename());
            stringBuilder1.append(":Assuming frame size is NOT stored as a sync safe integer:");
            stringBuilder1.append(this.identifier);
            logger.warning(stringBuilder1.toString());
            return;
          } 
          if (ID3SyncSafeInteger.isBufferEmpty(arrayOfByte1)) {
            this.frameSize = k;
            logger = AbstractTagItem.logger;
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(getLoggingFilename());
            stringBuilder1.append(":Assuming frame size is NOT stored as a sync safe integer:");
            stringBuilder1.append(this.identifier);
            logger.warning(stringBuilder1.toString());
            return;
          } 
        } else {
          logger.position(j);
          if (logger.remaining() == 0)
            this.frameSize = k; 
        } 
      } 
    } 
  }
  
  private void createV24FrameFromV23Frame(ID3v23Frame paramID3v23Frame) {
    AbstractTagFrameBody abstractTagFrameBody;
    AbstractID3v2FrameBody abstractID3v2FrameBody;
    this.identifier = ID3Tags.convertFrameID23To24(paramID3v23Frame.getIdentifier());
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("Creating V24frame from v23:");
    stringBuilder.append(paramID3v23Frame.getIdentifier());
    stringBuilder.append(":");
    stringBuilder.append(this.identifier);
    logger.finer(stringBuilder.toString());
    if (paramID3v23Frame.getBody() instanceof FrameBodyUnsupported) {
      FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported((FrameBodyUnsupported)paramID3v23Frame.getBody());
      this.frameBody = (AbstractTagFrameBody)frameBodyUnsupported;
      frameBodyUnsupported.setHeader(this);
      this.identifier = paramID3v23Frame.getIdentifier();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V3:UnsupportedBody:Orig id is:");
      stringBuilder1.append(paramID3v23Frame.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.finer(stringBuilder1.toString());
      return;
    } 
    if (this.identifier != null) {
      FrameBodyTMOO frameBodyTMOO;
      if ("TXXX".equals(paramID3v23Frame.getIdentifier()) && paramID3v23Frame.getBody() instanceof FrameBodyTXXX && "MOOD".equals(((FrameBodyTXXX)paramID3v23Frame.getBody()).getDescription())) {
        frameBodyTMOO = new FrameBodyTMOO((FrameBodyTXXX)paramID3v23Frame.getBody());
        this.frameBody = (AbstractTagFrameBody)frameBodyTMOO;
        frameBodyTMOO.setHeader(this);
        this.identifier = this.frameBody.getIdentifier();
        return;
      } 
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V3:Orig id is:");
      stringBuilder1.append(frameBodyTMOO.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.finer(stringBuilder1.toString());
      abstractTagFrameBody = (AbstractTagFrameBody)ID3Tags.copyObject(frameBodyTMOO.getBody());
      this.frameBody = abstractTagFrameBody;
      abstractTagFrameBody.setHeader(this);
      return;
    } 
    if (ID3Tags.isID3v23FrameIdentifier(abstractTagFrameBody.getIdentifier())) {
      String str = ID3Tags.forceFrameID23To24(abstractTagFrameBody.getIdentifier());
      this.identifier = str;
      if (str != null) {
        Logger logger2 = AbstractTagItem.logger;
        stringBuilder = new StringBuilder("V3:Orig id is:");
        stringBuilder.append(abstractTagFrameBody.getIdentifier());
        stringBuilder.append(":New id is:");
        stringBuilder.append(this.identifier);
        logger2.config(stringBuilder.toString());
        abstractID3v2FrameBody = readBody(this.identifier, (AbstractID3v2FrameBody)abstractTagFrameBody.getBody());
        this.frameBody = (AbstractTagFrameBody)abstractID3v2FrameBody;
        abstractID3v2FrameBody.setHeader(this);
        return;
      } 
      FrameBodyDeprecated frameBodyDeprecated = new FrameBodyDeprecated((AbstractID3v2FrameBody)abstractID3v2FrameBody.getBody());
      this.frameBody = (AbstractTagFrameBody)frameBodyDeprecated;
      frameBodyDeprecated.setHeader(this);
      this.identifier = abstractID3v2FrameBody.getIdentifier();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V3:Deprecated:Orig id is:");
      stringBuilder1.append(abstractID3v2FrameBody.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.finer(stringBuilder1.toString());
      return;
    } 
    if (abstractID3v2FrameBody.getBody() instanceof FrameBodyUnsupported) {
      FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported((FrameBodyUnsupported)abstractID3v2FrameBody.getBody());
      this.frameBody = (AbstractTagFrameBody)frameBodyUnsupported;
      frameBodyUnsupported.setHeader(this);
      this.identifier = abstractID3v2FrameBody.getIdentifier();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V3:Unknown:Orig id is:");
      stringBuilder1.append(abstractID3v2FrameBody.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.finer(stringBuilder1.toString());
      return;
    } 
    if (abstractID3v2FrameBody.getBody() instanceof FrameBodyDeprecated) {
      FrameBodyDeprecated frameBodyDeprecated = new FrameBodyDeprecated((FrameBodyDeprecated)abstractID3v2FrameBody.getBody());
      this.frameBody = (AbstractTagFrameBody)frameBodyDeprecated;
      frameBodyDeprecated.setHeader(this);
      this.identifier = abstractID3v2FrameBody.getIdentifier();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V3:Deprecated:Orig id is:");
      stringBuilder1.append(abstractID3v2FrameBody.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.finer(stringBuilder1.toString());
    } 
  }
  
  private void getFrameSize(ByteBuffer paramByteBuffer) {
    int i = ID3SyncSafeInteger.bufferToValue(paramByteBuffer);
    this.frameSize = i;
    if (i >= 0) {
      Logger logger1;
      if (i != 0) {
        if (i <= paramByteBuffer.remaining() - 2) {
          checkIfFrameSizeThatIsNotSyncSafe(paramByteBuffer);
          return;
        } 
        logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getLoggingFilename());
        stringBuilder2.append(":Invalid Frame size larger than size before mp3 audio:");
        stringBuilder2.append(this.identifier);
        logger1.warning(stringBuilder2.toString());
        throw new InvalidFrameException(x41.n(new StringBuilder(), this.identifier, " is invalid frame"));
      } 
      Logger logger2 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(getLoggingFilename());
      stringBuilder1.append(":Empty Frame:");
      stringBuilder1.append(this.identifier);
      logger2.warning(stringBuilder1.toString());
      logger1.get();
      logger1.get();
      throw new EmptyFrameException(x41.n(new StringBuilder(), this.identifier, " is empty frame"));
    } 
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLoggingFilename());
    stringBuilder.append(":Invalid Frame size:");
    stringBuilder.append(this.identifier);
    logger.warning(stringBuilder.toString());
    throw new InvalidFrameException(x41.n(new StringBuilder(), this.identifier, " is invalid frame"));
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("frame", getIdentifier());
    MP3File.getStructureFormatter().a("frameSize", this.frameSize);
    this.statusFlags.createStructure();
    this.encodingFlags.createStructure();
    this.frameBody.createStructure();
    MP3File.getStructureFormatter().d("frame");
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ID3v24Frame))
      return false; 
    paramObject = paramObject;
    return (z51.a(this.statusFlags, ((AbstractID3v2Frame)paramObject).statusFlags) && z51.a(this.encodingFlags, ((AbstractID3v2Frame)paramObject).encodingFlags) && super.equals(paramObject));
  }
  
  public AbstractID3v2Frame.EncodingFlags getEncodingFlags() {
    return this.encodingFlags;
  }
  
  public int getEncryptionMethod() {
    return this.encryptionMethod;
  }
  
  public int getFrameFlagsSize() {
    return 2;
  }
  
  public int getFrameHeaderSize() {
    return 10;
  }
  
  public int getFrameIdSize() {
    return 4;
  }
  
  public int getFrameSizeSize() {
    return 4;
  }
  
  public int getGroupIdentifier() {
    return this.groupIdentifier;
  }
  
  public int getSize() {
    return this.frameBody.getSize() + 10;
  }
  
  public AbstractID3v2Frame.StatusFlags getStatusFlags() {
    return this.statusFlags;
  }
  
  public boolean isBinary() {
    return ID3v24Frames.getInstanceOf().isBinary(getId());
  }
  
  public boolean isCommon() {
    return ID3v24Frames.getInstanceOf().isCommon(getId());
  }
  
  public boolean isValidID3v2FrameIdentifier(String paramString) {
    return validFrameIdentifier.matcher(paramString).matches();
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    String str2 = readIdentifier(paramByteBuffer);
    boolean bool = isValidID3v2FrameIdentifier(str2);
    int i = 1;
    if (bool) {
      getFrameSize(paramByteBuffer);
      this.statusFlags = new StatusFlags(paramByteBuffer.get());
      EncodingFlags encodingFlags = new EncodingFlags(paramByteBuffer.get());
      this.encodingFlags = encodingFlags;
      if (encodingFlags.isGrouping()) {
        this.groupIdentifier = paramByteBuffer.get();
      } else {
        i = 0;
      } 
      int j = i;
      if (((EncodingFlags)this.encodingFlags).isEncryption()) {
        j = i + 1;
        this.encryptionMethod = paramByteBuffer.get();
      } 
      if (((EncodingFlags)this.encodingFlags).isDataLengthIndicator()) {
        int m = ID3SyncSafeInteger.bufferToValue(paramByteBuffer);
        i = j + 4;
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Frame Size Is:");
        stringBuilder.append(this.frameSize);
        stringBuilder.append(" Data Length Size:");
        stringBuilder.append(m);
        logger1.config(stringBuilder.toString());
        j = m;
      } else {
        byte b = -1;
        i = j;
        j = b;
      } 
      int k = this.frameSize - i;
      ByteBuffer byteBuffer = paramByteBuffer.slice();
      byteBuffer.limit(k);
      if (((EncodingFlags)this.encodingFlags).isUnsynchronised()) {
        byteBuffer = ID3Unsynchronization.synchronize(byteBuffer);
        i = byteBuffer.limit();
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Frame Size After Syncing is:");
        stringBuilder.append(i);
        logger1.config(stringBuilder.toString());
      } else {
        i = k;
      } 
      try {
        if (((EncodingFlags)this.encodingFlags).isCompression()) {
          byteBuffer = ID3Compression.uncompress(str2, getLoggingFilename(), paramByteBuffer, j, k);
          if (((EncodingFlags)this.encodingFlags).isEncryption()) {
            this.frameBody = (AbstractTagFrameBody)readEncryptedBody(str2, byteBuffer, j);
          } else {
            this.frameBody = (AbstractTagFrameBody)readBody(str2, byteBuffer, j);
          } 
        } else if (((EncodingFlags)this.encodingFlags).isEncryption()) {
          paramByteBuffer.slice().limit(k);
          this.frameBody = (AbstractTagFrameBody)readEncryptedBody(str2, paramByteBuffer, this.frameSize);
        } else {
          this.frameBody = (AbstractTagFrameBody)readBody(str2, byteBuffer, i);
        } 
      } finally {}
      if (!(this.frameBody instanceof org.jaudiotagger.tag.id3.framebody.ID3v24FrameBody)) {
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(getLoggingFilename());
        stringBuilder.append(":Converted frame body with:");
        stringBuilder.append(str2);
        stringBuilder.append(" to deprecated framebody");
        logger1.config(stringBuilder.toString());
        FrameBodyDeprecated frameBodyDeprecated = new FrameBodyDeprecated();
        this((AbstractID3v2FrameBody)this.frameBody);
        this.frameBody = (AbstractTagFrameBody)frameBodyDeprecated;
      } 
      paramByteBuffer.position(paramByteBuffer.position() + k);
      return;
    } 
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(getLoggingFilename());
    stringBuilder2.append(":Invalid identifier:");
    stringBuilder2.append(str2);
    logger.config(stringBuilder2.toString());
    paramByteBuffer.position(paramByteBuffer.position() - getFrameIdSize() - 1);
    String str1 = getLoggingFilename();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(str1);
    stringBuilder1.append(":");
    stringBuilder1.append(str2);
    stringBuilder1.append(":is not a valid ID3v2.30 frame");
    throw new InvalidFrameIdentifierException(stringBuilder1.toString());
  }
  
  public void setEncoding(Charset paramCharset) {
    Integer integer = TextEncoding.getInstanceOf().getIdForCharset(paramCharset);
    if (integer != null && integer.intValue() < 4)
      getBody().setTextEncoding(integer.byteValue()); 
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    boolean bool;
    Logger logger1 = AbstractTagItem.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Writing frame to file:");
    stringBuilder1.append(getIdentifier());
    logger1.config(stringBuilder1.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ((AbstractID3v2FrameBody)this.frameBody).write(byteArrayOutputStream);
    byte[] arrayOfByte2 = byteArrayOutputStream.toByteArray();
    if (TagOptionSingleton.getInstance().isUnsyncTags() && ID3Unsynchronization.requiresUnsynchronization(arrayOfByte2)) {
      bool = true;
    } else {
      bool = false;
    } 
    byte[] arrayOfByte1 = arrayOfByte2;
    if (bool) {
      arrayOfByte1 = ID3Unsynchronization.unsynchronize(arrayOfByte2);
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder = new StringBuilder("bodybytebuffer:sizeafterunsynchronisation:");
      stringBuilder.append(arrayOfByte1.length);
      logger.config(stringBuilder.toString());
    } 
    if (getIdentifier().length() == 3) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.identifier);
      stringBuilder.append(' ');
      this.identifier = stringBuilder.toString();
    } 
    byteBuffer.put(getIdentifier().getBytes(mk.b), 0, 4);
    int i = arrayOfByte1.length;
    Logger logger2 = AbstractTagItem.logger;
    StringBuilder stringBuilder2 = new StringBuilder("Frame Size Is:");
    stringBuilder2.append(i);
    logger2.fine(stringBuilder2.toString());
    byteBuffer.put(ID3SyncSafeInteger.valueToBuffer(i));
    byteBuffer.put(this.statusFlags.getWriteFlags());
    ((EncodingFlags)this.encodingFlags).unsetNonStandardFlags();
    AbstractID3v2Frame.EncodingFlags encodingFlags = this.encodingFlags;
    if (bool) {
      ((EncodingFlags)encodingFlags).setUnsynchronised();
    } else {
      ((EncodingFlags)encodingFlags).unsetUnsynchronised();
    } 
    ((EncodingFlags)this.encodingFlags).unsetCompression();
    ((EncodingFlags)this.encodingFlags).unsetDataLengthIndicator();
    byteBuffer.put(this.encodingFlags.getFlags());
    try {
      paramByteArrayOutputStream.write(byteBuffer.array());
      if (((EncodingFlags)this.encodingFlags).isEncryption())
        paramByteArrayOutputStream.write(this.encryptionMethod); 
      if (((EncodingFlags)this.encodingFlags).isGrouping())
        paramByteArrayOutputStream.write(this.groupIdentifier); 
      paramByteArrayOutputStream.write(arrayOfByte1);
      return;
    } catch (IOException iOException) {
      k91.n(iOException);
      return;
    } 
  }
  
  public class EncodingFlags extends AbstractID3v2Frame.EncodingFlags {
    public static final int MASK_COMPRESSION = 8;
    
    public static final int MASK_DATA_LENGTH_INDICATOR = 1;
    
    public static final int MASK_ENCRYPTION = 4;
    
    public static final int MASK_FRAME_UNSYNCHRONIZATION = 2;
    
    public static final int MASK_GROUPING_IDENTITY = 64;
    
    public static final String TYPE_COMPRESSION = "compression";
    
    public static final String TYPE_DATALENGTHINDICATOR = "dataLengthIndicator";
    
    public static final String TYPE_ENCRYPTION = "encryption";
    
    public static final String TYPE_FRAMEUNSYNCHRONIZATION = "frameUnsynchronisation";
    
    public static final String TYPE_GROUPIDENTITY = "groupidentity";
    
    final ID3v24Frame this$0;
    
    public EncodingFlags() {}
    
    public EncodingFlags(byte param1Byte) {
      super(param1Byte);
      logEnabledFlags();
    }
    
    public void createStructure() {
      MP3File.getStructureFormatter().f("encodingFlags", "");
      MP3File.getStructureFormatter().a("compression", this.flags & 0x8);
      MP3File.getStructureFormatter().a("encryption", this.flags & 0x4);
      MP3File.getStructureFormatter().a("groupidentity", this.flags & 0x40);
      h0 h0 = MP3File.getStructureFormatter();
      byte b = this.flags;
      h0.a(zLtYiJUm.FYNjkIucO, b & 0x2);
      MP3File.getStructureFormatter().a("dataLengthIndicator", this.flags & 0x1);
      MP3File.getStructureFormatter().d("encodingFlags");
    }
    
    public byte getFlags() {
      return this.flags;
    }
    
    public boolean isCompression() {
      return ((this.flags & 0x8) > 0);
    }
    
    public boolean isDataLengthIndicator() {
      return ((this.flags & 0x1) > 0);
    }
    
    public boolean isEncryption() {
      return ((this.flags & 0x4) > 0);
    }
    
    public boolean isGrouping() {
      return ((this.flags & 0x40) > 0);
    }
    
    public boolean isNonStandardFlags() {
      byte b = this.flags;
      return ((b & 0x80) > 0 || (b & 0x20) > 0 || (b & 0x10) > 0);
    }
    
    public boolean isUnsynchronised() {
      return ((this.flags & 0x2) > 0);
    }
    
    public void logEnabledFlags() {
      if (isNonStandardFlags()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v24Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v24Frame.this.identifier);
        stringBuilder.append(":Unknown Encoding Flags:");
        stringBuilder.append(wf2.d(this.flags));
        logger.warning(stringBuilder.toString());
      } 
      if (isCompression()) {
        Logger logger = AbstractTagItem.logger;
        String str1 = ID3v24Frame.this.getLoggingFilename();
        String str2 = ID3v24Frame.this.identifier;
        logger.warning(MessageFormat.format(eRUgfgGAccgka.ZyR, new Object[] { str1, str2 }));
      } 
      if (isEncryption())
        AbstractTagItem.logger.warning(MessageFormat.format("Filename {0}:{1} is encrypted", new Object[] { this.this$0.getLoggingFilename(), this.this$0.identifier })); 
      if (isGrouping())
        AbstractTagItem.logger.config(MessageFormat.format("Filename {0}:{1} is grouped", new Object[] { this.this$0.getLoggingFilename(), this.this$0.identifier })); 
      if (isUnsynchronised())
        AbstractTagItem.logger.config(MessageFormat.format("Filename {0}:{1} is unsynchronised", new Object[] { this.this$0.getLoggingFilename(), this.this$0.identifier })); 
      if (isDataLengthIndicator())
        AbstractTagItem.logger.config(MessageFormat.format("Filename {0}:{1} has a data length indicator", new Object[] { this.this$0.getLoggingFilename(), this.this$0.identifier })); 
    }
    
    public void setCompression() {
      this.flags = (byte)(this.flags | 0x8);
    }
    
    public void setDataLengthIndicator() {
      this.flags = (byte)(this.flags | 0x1);
    }
    
    public void setEncryption() {
      this.flags = (byte)(this.flags | 0x4);
    }
    
    public void setGrouping() {
      this.flags = (byte)(this.flags | 0x40);
    }
    
    public void setUnsynchronised() {
      this.flags = (byte)(this.flags | 0x2);
    }
    
    public void unsetCompression() {
      this.flags = (byte)(this.flags & 0xFFFFFFF7);
    }
    
    public void unsetDataLengthIndicator() {
      this.flags = (byte)(this.flags & 0xFFFFFFFE);
    }
    
    public void unsetEncryption() {
      this.flags = (byte)(this.flags & 0xFFFFFFFB);
    }
    
    public void unsetGrouping() {
      this.flags = (byte)(this.flags & 0xFFFFFFBF);
    }
    
    public void unsetNonStandardFlags() {
      if (isNonStandardFlags()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v24Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v24Frame.this.getIdentifier());
        stringBuilder.append(":Unsetting Unknown Encoding Flags:");
        stringBuilder.append(wf2.d(this.flags));
        logger.warning(stringBuilder.toString());
        this.flags = (byte)((byte)((byte)(this.flags & Byte.MAX_VALUE) & 0xFFFFFFDF) & 0xFFFFFFEF);
      } 
    }
    
    public void unsetUnsynchronised() {
      this.flags = (byte)(this.flags & 0xFFFFFFFD);
    }
  }
  
  public class StatusFlags extends AbstractID3v2Frame.StatusFlags {
    public static final int MASK_FILE_ALTER_PRESERVATION = 32;
    
    public static final int MASK_READ_ONLY = 16;
    
    public static final int MASK_TAG_ALTER_PRESERVATION = 64;
    
    public static final String TYPE_FILEALTERPRESERVATION = "typeFileAlterPreservation";
    
    public static final String TYPE_READONLY = "typeReadOnly";
    
    public static final String TYPE_TAGALTERPRESERVATION = "typeTagAlterPreservation";
    
    final ID3v24Frame this$0;
    
    public StatusFlags() {}
    
    public StatusFlags(byte param1Byte) {
      this.originalFlags = param1Byte;
      this.writeFlags = param1Byte;
      modifyFlags();
    }
    
    public StatusFlags(ID3v23Frame.StatusFlags param1StatusFlags) {
      byte b = convertV3ToV4Flags(param1StatusFlags.getOriginalFlags());
      this.originalFlags = b;
      this.writeFlags = b;
      modifyFlags();
    }
    
    private byte convertV3ToV4Flags(byte param1Byte) {
      byte b1;
      if ((param1Byte & 0x40) != 0) {
        b1 = 32;
      } else {
        b1 = 0;
      } 
      byte b2 = b1;
      if ((param1Byte & 0x80) != 0)
        b2 = (byte)(b1 | 0x40); 
      return b2;
    }
    
    public void createStructure() {
      MP3File.getStructureFormatter().f("statusFlags", "");
      MP3File.getStructureFormatter().a("typeTagAlterPreservation", this.originalFlags & 0x40);
      MP3File.getStructureFormatter().a("typeFileAlterPreservation", this.originalFlags & 0x20);
      MP3File.getStructureFormatter().a("typeReadOnly", this.originalFlags & 0x10);
      MP3File.getStructureFormatter().d("statusFlags");
    }
    
    public void modifyFlags() {
      String str = ID3v24Frame.this.getIdentifier();
      boolean bool = ID3v24Frames.getInstanceOf().isDiscardIfFileAltered(str);
      byte b = this.writeFlags;
      if (bool) {
        this.writeFlags = (byte)((byte)(b | 0x20) & 0xFFFFFFBF);
        return;
      } 
      this.writeFlags = (byte)((byte)(b & 0xFFFFFFDF) & 0xFFFFFFBF);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v24Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */