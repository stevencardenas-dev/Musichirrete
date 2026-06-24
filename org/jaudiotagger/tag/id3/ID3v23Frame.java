package org.jaudiotagger.tag.id3;

import android.window.ldG.XUaAMlaMSa;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import ga1;
import h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k91;
import mk;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.EmptyFrameException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidFrameIdentifierException;
import org.jaudiotagger.tag.id3.framebody.AbstractID3v2FrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyDeprecated;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import tp;
import wf2;
import z51;

public class ID3v23Frame extends AbstractID3v2Frame {
  protected static final int FRAME_COMPRESSION_UNCOMPRESSED_SIZE = 4;
  
  protected static final int FRAME_ENCRYPTION_INDICATOR_SIZE = 1;
  
  protected static final int FRAME_FLAGS_SIZE = 2;
  
  protected static final int FRAME_GROUPING_INDICATOR_SIZE = 1;
  
  protected static final int FRAME_HEADER_SIZE = 10;
  
  protected static final int FRAME_ID_SIZE = 4;
  
  protected static final int FRAME_SIZE_SIZE = 4;
  
  private static Pattern validFrameIdentifier = Pattern.compile(PwbbJfsdcHrAjW.DWzNNz);
  
  private int encryptionMethod;
  
  private int groupIdentifier;
  
  public ID3v23Frame() {}
  
  public ID3v23Frame(String paramString) {
    super(paramString);
    this.statusFlags = new StatusFlags();
    this.encodingFlags = new EncodingFlags();
  }
  
  public ID3v23Frame(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, "");
  }
  
  public ID3v23Frame(ByteBuffer paramByteBuffer, String paramString) {
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v23Frame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    AbstractTagItem.logger.finer("Creating frame from a frame of a different version");
    if (!(paramAbstractID3v2Frame instanceof ID3v23Frame)) {
      StringBuilder stringBuilder1;
      AbstractID3v2FrameBody abstractID3v2FrameBody;
      boolean bool = paramAbstractID3v2Frame instanceof ID3v22Frame;
      if (bool) {
        this.statusFlags = new StatusFlags();
        this.encodingFlags = new EncodingFlags();
      } else if (paramAbstractID3v2Frame instanceof ID3v24Frame) {
        this.statusFlags = new StatusFlags((ID3v24Frame.StatusFlags)paramAbstractID3v2Frame.getStatusFlags());
        this.encodingFlags = new EncodingFlags(paramAbstractID3v2Frame.getEncodingFlags().getFlags());
      } 
      if (paramAbstractID3v2Frame instanceof ID3v24Frame) {
        if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyUnsupported) {
          FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported((FrameBodyUnsupported)paramAbstractID3v2Frame.getBody());
          this.frameBody = (AbstractTagFrameBody)frameBodyUnsupported;
          frameBodyUnsupported.setHeader(this);
          this.identifier = paramAbstractID3v2Frame.getIdentifier();
          Logger logger1 = AbstractTagItem.logger;
          StringBuilder stringBuilder = new StringBuilder("UNKNOWN:Orig id is:");
          stringBuilder.append(paramAbstractID3v2Frame.getIdentifier());
          stringBuilder.append(":New id is:");
          stringBuilder.append(this.identifier);
          logger1.config(stringBuilder.toString());
          return;
        } 
        if (paramAbstractID3v2Frame.getBody() instanceof FrameBodyDeprecated) {
          if (ID3Tags.isID3v23FrameIdentifier(paramAbstractID3v2Frame.getIdentifier())) {
            AbstractID3v2FrameBody abstractID3v2FrameBody1 = ((FrameBodyDeprecated)paramAbstractID3v2Frame.getBody()).getOriginalFrameBody();
            this.frameBody = (AbstractTagFrameBody)abstractID3v2FrameBody1;
            abstractID3v2FrameBody1.setHeader(this);
            AbstractTagFrameBody abstractTagFrameBody = this.frameBody;
            abstractTagFrameBody.setTextEncoding(ID3TextEncodingConversion.getTextEncoding(this, abstractTagFrameBody.getTextEncoding()));
            this.identifier = paramAbstractID3v2Frame.getIdentifier();
            Logger logger1 = AbstractTagItem.logger;
            StringBuilder stringBuilder = new StringBuilder("DEPRECATED:Orig id is:");
            stringBuilder.append(paramAbstractID3v2Frame.getIdentifier());
            stringBuilder.append(":New id is:");
            stringBuilder.append(this.identifier);
            logger1.config(stringBuilder.toString());
          } else {
            FrameBodyDeprecated frameBodyDeprecated = new FrameBodyDeprecated((FrameBodyDeprecated)paramAbstractID3v2Frame.getBody());
            this.frameBody = (AbstractTagFrameBody)frameBodyDeprecated;
            frameBodyDeprecated.setHeader(this);
            AbstractTagFrameBody abstractTagFrameBody = this.frameBody;
            abstractTagFrameBody.setTextEncoding(ID3TextEncodingConversion.getTextEncoding(this, abstractTagFrameBody.getTextEncoding()));
            this.identifier = paramAbstractID3v2Frame.getIdentifier();
            Logger logger1 = AbstractTagItem.logger;
            StringBuilder stringBuilder = new StringBuilder("DEPRECATED:Orig id is:");
            stringBuilder.append(paramAbstractID3v2Frame.getIdentifier());
            stringBuilder.append(":New id is:");
            stringBuilder.append(this.identifier);
            logger1.config(stringBuilder.toString());
            return;
          } 
        } else {
          AbstractTagFrameBody abstractTagFrameBody;
          if (ID3Tags.isID3v24FrameIdentifier(paramAbstractID3v2Frame.getIdentifier())) {
            AbstractTagItem.logger.finer("isID3v24FrameIdentifier");
            String str1 = ID3Tags.convertFrameID24To23(paramAbstractID3v2Frame.getIdentifier());
            this.identifier = str1;
            if (str1 != null) {
              Logger logger3 = AbstractTagItem.logger;
              StringBuilder stringBuilder4 = new StringBuilder("V4:Orig id is:");
              stringBuilder4.append(paramAbstractID3v2Frame.getIdentifier());
              stringBuilder4.append(":New id is:");
              stringBuilder4.append(this.identifier);
              logger3.finer(stringBuilder4.toString());
              abstractTagFrameBody = (AbstractTagFrameBody)ID3Tags.copyObject(paramAbstractID3v2Frame.getBody());
              this.frameBody = abstractTagFrameBody;
              abstractTagFrameBody.setHeader(this);
              abstractTagFrameBody = this.frameBody;
              abstractTagFrameBody.setTextEncoding(ID3TextEncodingConversion.getTextEncoding(this, abstractTagFrameBody.getTextEncoding()));
              return;
            } 
            str1 = ID3Tags.forceFrameID24To23(abstractTagFrameBody.getIdentifier());
            this.identifier = str1;
            if (str1 != null) {
              Logger logger3 = AbstractTagItem.logger;
              StringBuilder stringBuilder4 = new StringBuilder("V4:Orig id is:");
              stringBuilder4.append(abstractTagFrameBody.getIdentifier());
              stringBuilder4.append(":New id is:");
              stringBuilder4.append(this.identifier);
              logger3.finer(stringBuilder4.toString());
              abstractID3v2FrameBody = readBody(this.identifier, (AbstractID3v2FrameBody)abstractTagFrameBody.getBody());
              this.frameBody = (AbstractTagFrameBody)abstractID3v2FrameBody;
              abstractID3v2FrameBody.setHeader(this);
              abstractTagFrameBody = this.frameBody;
              abstractTagFrameBody.setTextEncoding(ID3TextEncodingConversion.getTextEncoding(this, abstractTagFrameBody.getTextEncoding()));
              return;
            } 
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((AbstractID3v2FrameBody)abstractTagFrameBody.getBody()).write(byteArrayOutputStream);
            str1 = abstractTagFrameBody.getIdentifier();
            this.identifier = str1;
            FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported(str1, byteArrayOutputStream.toByteArray());
            this.frameBody = (AbstractTagFrameBody)frameBodyUnsupported;
            frameBodyUnsupported.setHeader(this);
            Logger logger2 = AbstractTagItem.logger;
            StringBuilder stringBuilder3 = new StringBuilder("V4:Orig id is:");
            stringBuilder3.append(abstractTagFrameBody.getIdentifier());
            stringBuilder3.append(":New Id Unsupported is:");
            stringBuilder3.append(this.identifier);
            logger2.finer(stringBuilder3.toString());
            return;
          } 
          Logger logger1 = AbstractTagItem.logger;
          StringBuilder stringBuilder = new StringBuilder("Orig id is:");
          stringBuilder.append(abstractTagFrameBody.getIdentifier());
          stringBuilder.append(":Unable to create Frame Body");
          logger1.severe(stringBuilder.toString());
          String str = abstractTagFrameBody.getIdentifier();
          stringBuilder1 = new StringBuilder("Orig id is:");
          stringBuilder1.append(str);
          stringBuilder1.append("Unable to create Frame Body");
          throw new InvalidFrameException(stringBuilder1.toString());
        } 
      } else if (bool) {
        if (ID3Tags.isID3v22FrameIdentifier(stringBuilder1.getIdentifier())) {
          AbstractTagFrameBody abstractTagFrameBody;
          String str = ID3Tags.convertFrameID22To23(stringBuilder1.getIdentifier());
          this.identifier = str;
          if (str != null) {
            Logger logger1 = AbstractTagItem.logger;
            StringBuilder stringBuilder = new StringBuilder("V3:Orig id is:");
            stringBuilder.append(stringBuilder1.getIdentifier());
            stringBuilder.append(":New id is:");
            stringBuilder.append(this.identifier);
            logger1.config(stringBuilder.toString());
            abstractTagFrameBody = (AbstractTagFrameBody)ID3Tags.copyObject(stringBuilder1.getBody());
            this.frameBody = abstractTagFrameBody;
            abstractTagFrameBody.setHeader(this);
            return;
          } 
          if (ID3Tags.isID3v22FrameIdentifier(abstractTagFrameBody.getIdentifier())) {
            str = ID3Tags.forceFrameID22To23(abstractTagFrameBody.getIdentifier());
            this.identifier = str;
            if (str != null) {
              Logger logger2 = AbstractTagItem.logger;
              StringBuilder stringBuilder3 = new StringBuilder("V22Orig id is:");
              stringBuilder3.append(abstractTagFrameBody.getIdentifier());
              stringBuilder3.append("New id is:");
              stringBuilder3.append(this.identifier);
              logger2.config(stringBuilder3.toString());
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
            StringBuilder stringBuilder = new StringBuilder("Deprecated:V22:orig id id is:");
            stringBuilder.append(abstractID3v2FrameBody.getIdentifier());
            stringBuilder.append(":New id is:");
            stringBuilder.append(this.identifier);
            logger1.config(stringBuilder.toString());
            return;
          } 
        } else {
          FrameBodyUnsupported frameBodyUnsupported = new FrameBodyUnsupported((FrameBodyUnsupported)abstractID3v2FrameBody.getBody());
          this.frameBody = (AbstractTagFrameBody)frameBodyUnsupported;
          frameBodyUnsupported.setHeader(this);
          this.identifier = abstractID3v2FrameBody.getIdentifier();
          Logger logger1 = AbstractTagItem.logger;
          StringBuilder stringBuilder = new StringBuilder("UNKNOWN:Orig id is:");
          stringBuilder.append(abstractID3v2FrameBody.getIdentifier());
          stringBuilder.append(":New id is:");
          stringBuilder.append(this.identifier);
          logger1.config(stringBuilder.toString());
          return;
        } 
      } 
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder2 = new StringBuilder(XUaAMlaMSa.AJsyIcIp);
      stringBuilder2.append(abstractID3v2FrameBody.getClass());
      logger.warning(stringBuilder2.toString());
      return;
    } 
    tp.j("Copy Constructor not called. Please type cast the argument");
    throw null;
  }
  
  public ID3v23Frame(ID3v23Frame paramID3v23Frame) {
    super(paramID3v23Frame);
    this.statusFlags = new StatusFlags(paramID3v23Frame.getStatusFlags().getOriginalFlags());
    this.encodingFlags = new EncodingFlags(paramID3v23Frame.getEncodingFlags().getFlags());
  }
  
  public ID3v23Frame(ID3v24Frame paramID3v24Frame, String paramString) {
    this.identifier = paramString;
    this.statusFlags = new StatusFlags((ID3v24Frame.StatusFlags)paramID3v24Frame.getStatusFlags());
    this.encodingFlags = new EncodingFlags(paramID3v24Frame.getEncodingFlags().getFlags());
  }
  
  public void createStructure() {
    h0 h0 = MP3File.getStructureFormatter();
    String str2 = getIdentifier();
    String str1 = jLnXOLx.qvkkGKV;
    h0.f(str1, str2);
    MP3File.getStructureFormatter().a("frameSize", this.frameSize);
    this.statusFlags.createStructure();
    this.encodingFlags.createStructure();
    this.frameBody.createStructure();
    MP3File.getStructureFormatter().d(str1);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ID3v23Frame))
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
    return ID3v23Frames.getInstanceOf().isBinary(getId());
  }
  
  public boolean isCommon() {
    return ID3v23Frames.getInstanceOf().isCommon(getId());
  }
  
  public boolean isValidID3v2FrameIdentifier(String paramString) {
    return validFrameIdentifier.matcher(paramString).matches();
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    StringBuilder stringBuilder1;
    String str2 = readIdentifier(paramByteBuffer);
    if (isValidID3v2FrameIdentifier(str2)) {
      int i = paramByteBuffer.getInt();
      this.frameSize = i;
      if (i >= 0) {
        if (i != 0) {
          if (i + 2 <= paramByteBuffer.remaining()) {
            byte b;
            this.statusFlags = new StatusFlags(paramByteBuffer.get());
            this.encodingFlags = new EncodingFlags(paramByteBuffer.get());
            String str4 = ID3Tags.convertFrameID23To24(str2);
            String str3 = str4;
            if (str4 == null)
              if (ID3Tags.isID3v23FrameIdentifier(str2)) {
                str3 = str2;
              } else {
                str3 = "Unsupported";
              }  
            if (((EncodingFlags)this.encodingFlags).isCompression()) {
              b = paramByteBuffer.getInt();
              Logger logger4 = AbstractTagItem.logger;
              StringBuilder stringBuilder8 = new StringBuilder();
              stringBuilder8.append(getLoggingFilename());
              stringBuilder8.append(":Decompressed frame size is:");
              stringBuilder8.append(b);
              logger4.fine(stringBuilder8.toString());
              i = 4;
            } else {
              i = 0;
              b = -1;
            } 
            int j = i;
            if (((EncodingFlags)this.encodingFlags).isEncryption()) {
              j = i + 1;
              this.encryptionMethod = paramByteBuffer.get();
            } 
            i = j;
            if (((EncodingFlags)this.encodingFlags).isGrouping()) {
              i = j + 1;
              this.groupIdentifier = paramByteBuffer.get();
            } 
            if (((EncodingFlags)this.encodingFlags).isNonStandardFlags()) {
              Logger logger4 = AbstractTagItem.logger;
              StringBuilder stringBuilder8 = new StringBuilder();
              stringBuilder8.append(getLoggingFilename());
              stringBuilder8.append(":InvalidEncodingFlags:");
              stringBuilder8.append(wf2.d(((EncodingFlags)this.encodingFlags).getFlags()));
              logger4.severe(stringBuilder8.toString());
            } 
            if (!((EncodingFlags)this.encodingFlags).isCompression() || b <= this.frameSize * 100) {
              i = this.frameSize - i;
              if (i > 0) {
                try {
                  if (((EncodingFlags)this.encodingFlags).isCompression()) {
                    ByteBuffer byteBuffer = ID3Compression.uncompress(str2, getLoggingFilename(), paramByteBuffer, b, i);
                    if (((EncodingFlags)this.encodingFlags).isEncryption()) {
                      this.frameBody = (AbstractTagFrameBody)readEncryptedBody(str3, byteBuffer, b);
                    } else {
                      this.frameBody = (AbstractTagFrameBody)readBody(str3, byteBuffer, b);
                    } 
                  } else {
                    InvalidFrameException invalidFrameException;
                    if (((EncodingFlags)this.encodingFlags).isEncryption()) {
                      if (paramByteBuffer.remaining() >= this.frameSize) {
                        ByteBuffer byteBuffer = paramByteBuffer.slice();
                        byteBuffer.limit(this.frameSize);
                        this.frameBody = (AbstractTagFrameBody)readEncryptedBody(str2, byteBuffer, this.frameSize);
                      } else {
                        Logger logger4 = AbstractTagItem.logger;
                        StringBuilder stringBuilder9 = new StringBuilder();
                        this();
                        stringBuilder9.append(getLoggingFilename());
                        stringBuilder9.append(":Invalid Frame ");
                        stringBuilder9.append(this.frameSize);
                        stringBuilder9.append(" encodingFlagSetButNotEnoughBytes:");
                        stringBuilder9.append(paramByteBuffer.remaining());
                        stringBuilder9.append(" before mp3 audio:");
                        stringBuilder9.append(str2);
                        logger4.warning(stringBuilder9.toString());
                        invalidFrameException = new InvalidFrameException();
                        StringBuilder stringBuilder10 = new StringBuilder();
                        this();
                        stringBuilder10.append(str2);
                        stringBuilder10.append(" invalid frame:");
                        stringBuilder10.append(this.frameSize);
                        stringBuilder10.append("  encodingFlagSetButNotEnoughBytes:");
                        stringBuilder10.append(paramByteBuffer.remaining());
                        stringBuilder10.append(" before mp3 audio:");
                        stringBuilder10.append(str2);
                        this(stringBuilder10.toString());
                        throw invalidFrameException;
                      } 
                    } else {
                      ByteBuffer byteBuffer = paramByteBuffer.slice();
                      byteBuffer.limit(i);
                      this.frameBody = (AbstractTagFrameBody)readBody((String)invalidFrameException, byteBuffer, i);
                    } 
                  } 
                } finally {}
                if (!(this.frameBody instanceof org.jaudiotagger.tag.id3.framebody.ID3v23FrameBody)) {
                  Logger logger4 = AbstractTagItem.logger;
                  StringBuilder stringBuilder9 = new StringBuilder();
                  this();
                  stringBuilder9.append(getLoggingFilename());
                  stringBuilder9.append(":Converted frameBody with:");
                  stringBuilder9.append(str2);
                  stringBuilder9.append(" to deprecated frameBody");
                  logger4.config(stringBuilder9.toString());
                  FrameBodyDeprecated frameBodyDeprecated = new FrameBodyDeprecated();
                  this((AbstractID3v2FrameBody)this.frameBody);
                  this.frameBody = (AbstractTagFrameBody)frameBodyDeprecated;
                } 
                paramByteBuffer.position(paramByteBuffer.position() + i);
                return;
              } 
              StringBuilder stringBuilder8 = new StringBuilder();
              stringBuilder8.append(str2);
              stringBuilder8.append(" is invalid frame, realframeSize is:");
              stringBuilder8.append(i);
              throw new InvalidFrameException(stringBuilder8.toString());
            } 
            stringBuilder4 = ga1.l(str2, " is invalid frame, frame size ");
            stringBuilder4.append(this.frameSize);
            stringBuilder4.append(" cannot be:");
            stringBuilder4.append(b);
            stringBuilder4.append(" when uncompressed");
            throw new InvalidFrameException(stringBuilder4.toString());
          } 
          Logger logger3 = AbstractTagItem.logger;
          StringBuilder stringBuilder7 = new StringBuilder();
          stringBuilder7.append(getLoggingFilename());
          stringBuilder7.append(":Invalid Frame size of ");
          stringBuilder7.append(this.frameSize);
          stringBuilder7.append(" larger than size of");
          stringBuilder7.append(stringBuilder4.remaining());
          stringBuilder7.append(" before mp3 audio:");
          stringBuilder7.append(str2);
          logger3.warning(stringBuilder7.toString());
          StringBuilder stringBuilder6 = ga1.l(str2, " is invalid frame:");
          stringBuilder6.append(this.frameSize);
          stringBuilder6.append(" larger than size of");
          stringBuilder6.append(stringBuilder4.remaining());
          stringBuilder6.append(" before mp3 audio:");
          stringBuilder6.append(str2);
          throw new InvalidFrameException(stringBuilder6.toString());
        } 
        Logger logger2 = AbstractTagItem.logger;
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(getLoggingFilename());
        stringBuilder5.append(":Empty Frame Size:");
        stringBuilder5.append(str2);
        logger2.warning(stringBuilder5.toString());
        stringBuilder4.get();
        stringBuilder4.get();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str2);
        stringBuilder4.append(" is empty frame");
        throw new EmptyFrameException(stringBuilder4.toString());
      } 
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getLoggingFilename());
      stringBuilder.append(":Invalid Frame Size:");
      stringBuilder.append(this.frameSize);
      stringBuilder.append(":");
      stringBuilder.append(str2);
      logger1.warning(stringBuilder.toString());
      stringBuilder1 = ga1.l(str2, " is invalid frame:");
      stringBuilder1.append(this.frameSize);
      throw new InvalidFrameException(stringBuilder1.toString());
    } 
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(getLoggingFilename());
    stringBuilder3.append(":Invalid identifier:");
    stringBuilder3.append(str2);
    logger.config(stringBuilder3.toString());
    stringBuilder1.position(stringBuilder1.position() - getFrameIdSize() - 1);
    String str1 = getLoggingFilename();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str1);
    stringBuilder2.append(":");
    stringBuilder2.append(str2);
    stringBuilder2.append(":is not a valid ID3v2.30 frame");
    throw new InvalidFrameIdentifierException(stringBuilder2.toString());
  }
  
  public void setEncoding(Charset paramCharset) {
    Integer integer = TextEncoding.getInstanceOf().getIdForCharset(paramCharset);
    if (integer != null && integer.intValue() < 2)
      getBody().setTextEncoding(integer.byteValue()); 
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    Logger logger1 = AbstractTagItem.logger;
    StringBuilder stringBuilder1 = new StringBuilder("Writing frame to buffer:");
    stringBuilder1.append(getIdentifier());
    logger1.config(stringBuilder1.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ((AbstractID3v2FrameBody)this.frameBody).write(byteArrayOutputStream);
    if (getIdentifier().length() == 3) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.identifier);
      stringBuilder.append(' ');
      this.identifier = stringBuilder.toString();
    } 
    byteBuffer.put(getIdentifier().getBytes(mk.b), 0, 4);
    int i = this.frameBody.getSize();
    Logger logger2 = AbstractTagItem.logger;
    StringBuilder stringBuilder2 = new StringBuilder("Frame Size Is:");
    stringBuilder2.append(i);
    logger2.fine(stringBuilder2.toString());
    byteBuffer.putInt(this.frameBody.getSize());
    byteBuffer.put(this.statusFlags.getWriteFlags());
    ((EncodingFlags)this.encodingFlags).unsetNonStandardFlags();
    ((EncodingFlags)this.encodingFlags).unsetCompression();
    byteBuffer.put(this.encodingFlags.getFlags());
    try {
      paramByteArrayOutputStream.write(byteBuffer.array());
      if (((EncodingFlags)this.encodingFlags).isEncryption())
        paramByteArrayOutputStream.write(this.encryptionMethod); 
      if (((EncodingFlags)this.encodingFlags).isGrouping())
        paramByteArrayOutputStream.write(this.groupIdentifier); 
      paramByteArrayOutputStream.write(byteArrayOutputStream.toByteArray());
      return;
    } catch (IOException iOException) {
      k91.n(iOException);
      return;
    } 
  }
  
  public class EncodingFlags extends AbstractID3v2Frame.EncodingFlags {
    public static final int MASK_COMPRESSION = 128;
    
    public static final int MASK_ENCRYPTION = 64;
    
    public static final int MASK_GROUPING_IDENTITY = 32;
    
    public static final String TYPE_COMPRESSION = "compression";
    
    public static final String TYPE_ENCRYPTION = "encryption";
    
    public static final String TYPE_GROUPIDENTITY = "groupidentity";
    
    final ID3v23Frame this$0;
    
    public EncodingFlags() {}
    
    public EncodingFlags(byte param1Byte) {
      super(param1Byte);
      logEnabledFlags();
    }
    
    public void createStructure() {
      MP3File.getStructureFormatter().f("encodingFlags", "");
      MP3File.getStructureFormatter().a("compression", this.flags & 0x80);
      MP3File.getStructureFormatter().a("encryption", this.flags & 0x40);
      MP3File.getStructureFormatter().a("groupidentity", this.flags & 0x20);
      MP3File.getStructureFormatter().d("encodingFlags");
    }
    
    public boolean isCompression() {
      return ((this.flags & 0x80) > 0);
    }
    
    public boolean isEncryption() {
      return ((this.flags & 0x40) > 0);
    }
    
    public boolean isGrouping() {
      return ((this.flags & 0x20) > 0);
    }
    
    public boolean isNonStandardFlags() {
      byte b = this.flags;
      return ((b & 0x10) > 0 || (b & 0x8) > 0 || (b & 0x4) > 0 || (b & 0x2) > 0 || (b & 0x1) > 0);
    }
    
    public void logEnabledFlags() {
      if (isNonStandardFlags()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v23Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v23Frame.this.identifier);
        stringBuilder.append(":Unknown Encoding Flags:");
        stringBuilder.append(wf2.d(this.flags));
        logger.warning(stringBuilder.toString());
      } 
      if (isCompression()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v23Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v23Frame.this.identifier);
        stringBuilder.append(" is compressed");
        logger.warning(stringBuilder.toString());
      } 
      if (isEncryption()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v23Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v23Frame.this.identifier);
        stringBuilder.append(" is encrypted");
        logger.warning(stringBuilder.toString());
      } 
      if (isGrouping()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v23Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v23Frame.this.identifier);
        stringBuilder.append(" is grouped");
        logger.warning(stringBuilder.toString());
      } 
    }
    
    public void setCompression() {
      this.flags = (byte)(this.flags | 0x80);
    }
    
    public void setEncryption() {
      this.flags = (byte)(this.flags | 0x40);
    }
    
    public void setGrouping() {
      this.flags = (byte)(this.flags | 0x20);
    }
    
    public void unsetCompression() {
      this.flags = (byte)(this.flags & Byte.MAX_VALUE);
    }
    
    public void unsetEncryption() {
      this.flags = (byte)(this.flags & 0xFFFFFFBF);
    }
    
    public void unsetGrouping() {
      this.flags = (byte)(this.flags & 0xFFFFFFDF);
    }
    
    public void unsetNonStandardFlags() {
      if (isNonStandardFlags()) {
        Logger logger = AbstractTagItem.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ID3v23Frame.this.getLoggingFilename());
        stringBuilder.append(":");
        stringBuilder.append(ID3v23Frame.this.getIdentifier());
        stringBuilder.append(":Unsetting Unknown Encoding Flags:");
        stringBuilder.append(wf2.d(this.flags));
        logger.warning(stringBuilder.toString());
        this.flags = (byte)((byte)((byte)((byte)((byte)(this.flags & 0xFFFFFFEF) & 0xFFFFFFF7) & 0xFFFFFFFB) & 0xFFFFFFFD) & 0xFFFFFFFE);
      } 
    }
  }
  
  public class StatusFlags extends AbstractID3v2Frame.StatusFlags {
    public static final int MASK_FILE_ALTER_PRESERVATION = 64;
    
    public static final int MASK_READ_ONLY = 32;
    
    public static final int MASK_TAG_ALTER_PRESERVATION = 128;
    
    public static final String TYPE_FILEALTERPRESERVATION = "typeFileAlterPreservation";
    
    public static final String TYPE_READONLY = "typeReadOnly";
    
    public static final String TYPE_TAGALTERPRESERVATION = "typeTagAlterPreservation";
    
    final ID3v23Frame this$0;
    
    public StatusFlags() {
      this.originalFlags = 0;
      this.writeFlags = 0;
    }
    
    public StatusFlags(byte param1Byte) {
      this.originalFlags = param1Byte;
      this.writeFlags = param1Byte;
      modifyFlags();
    }
    
    public StatusFlags(ID3v24Frame.StatusFlags param1StatusFlags) {
      byte b = convertV4ToV3Flags(param1StatusFlags.getOriginalFlags());
      this.originalFlags = b;
      this.writeFlags = b;
      modifyFlags();
    }
    
    private byte convertV4ToV3Flags(byte param1Byte) {
      byte b1;
      if ((param1Byte & 0x20) != 0) {
        b1 = 64;
      } else {
        b1 = 0;
      } 
      byte b2 = b1;
      if ((param1Byte & 0x40) != 0)
        b2 = (byte)(b1 | 0xFFFFFF80); 
      return b2;
    }
    
    public void createStructure() {
      MP3File.getStructureFormatter().f("statusFlags", "");
      MP3File.getStructureFormatter().a("typeTagAlterPreservation", this.originalFlags & 0x80);
      MP3File.getStructureFormatter().a("typeFileAlterPreservation", this.originalFlags & 0x40);
      MP3File.getStructureFormatter().a("typeReadOnly", this.originalFlags & 0x20);
      MP3File.getStructureFormatter().d("statusFlags");
    }
    
    public void modifyFlags() {
      String str = ID3v23Frame.this.getIdentifier();
      boolean bool = ID3v23Frames.getInstanceOf().isDiscardIfFileAltered(str);
      byte b = this.writeFlags;
      if (bool) {
        this.writeFlags = (byte)((byte)(b | 0x40) & Byte.MAX_VALUE);
        return;
      } 
      this.writeFlags = (byte)((byte)(b & 0xFFFFFFBF) & Byte.MAX_VALUE);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v23Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */