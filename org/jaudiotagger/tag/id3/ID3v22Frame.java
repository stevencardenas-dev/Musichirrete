package org.jaudiotagger.tag.id3;

import androidx.profileinstaller.Vuyf.nBRIsU;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import ga1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k91;
import mk;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.EmptyFrameException;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.InvalidFrameIdentifierException;
import org.jaudiotagger.tag.id3.framebody.AbstractID3v2FrameBody;
import org.jaudiotagger.tag.id3.framebody.FrameBodyDeprecated;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUnsupported;
import org.jaudiotagger.tag.id3.valuepair.TextEncoding;
import tp;
import z51;

public class ID3v22Frame extends AbstractID3v2Frame {
  protected static final int FRAME_HEADER_SIZE = 6;
  
  protected static final int FRAME_ID_SIZE = 3;
  
  protected static final int FRAME_SIZE_SIZE = 3;
  
  private static Pattern validFrameIdentifier = Pattern.compile("[A-Z][0-9A-Z]{2}");
  
  public ID3v22Frame() {}
  
  public ID3v22Frame(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: getstatic org/jaudiotagger/tag/id3/AbstractTagItem.logger : Ljava/util/logging/Logger;
    //   7: astore_3
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: ldc 'Creating empty frame of type'
    //   14: invokespecial <init> : (Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_3
    //   25: aload_2
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: invokevirtual config : (Ljava/lang/String;)V
    //   32: aload_0
    //   33: aload_1
    //   34: putfield identifier : Ljava/lang/String;
    //   37: aload_1
    //   38: invokestatic isID3v22FrameIdentifier : (Ljava/lang/String;)Z
    //   41: ifeq -> 109
    //   44: aload_1
    //   45: invokestatic forceFrameID22To23 : (Ljava/lang/String;)Ljava/lang/String;
    //   48: ifnull -> 54
    //   51: goto -> 109
    //   54: aload_1
    //   55: ldc 'CRM'
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 66
    //   63: goto -> 109
    //   66: aload_1
    //   67: ldc 'TYE'
    //   69: invokevirtual equals : (Ljava/lang/Object;)Z
    //   72: ifne -> 102
    //   75: aload_1
    //   76: ldc 'TIM'
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifeq -> 87
    //   84: goto -> 102
    //   87: aload_1
    //   88: invokestatic isID3v22FrameIdentifier : (Ljava/lang/String;)Z
    //   91: ifeq -> 109
    //   94: aload_1
    //   95: invokestatic convertFrameID22To23 : (Ljava/lang/String;)Ljava/lang/String;
    //   98: astore_2
    //   99: goto -> 111
    //   102: getstatic org/jaudiotagger/audio/Hy/PwbbJfsdcHrAjW.PJQQutvI : Ljava/lang/String;
    //   105: astore_2
    //   106: goto -> 111
    //   109: aload_1
    //   110: astore_2
    //   111: new java/lang/StringBuilder
    //   114: astore_3
    //   115: aload_3
    //   116: ldc 'org.jaudiotagger.tag.id3.framebody.FrameBody'
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: aload_3
    //   122: aload_2
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_0
    //   128: aload_3
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   135: invokevirtual newInstance : ()Ljava/lang/Object;
    //   138: checkcast org/jaudiotagger/tag/id3/AbstractTagFrameBody
    //   141: putfield frameBody : Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   144: goto -> 225
    //   147: astore_1
    //   148: goto -> 159
    //   151: astore_1
    //   152: goto -> 179
    //   155: astore_3
    //   156: goto -> 199
    //   159: getstatic org/jaudiotagger/tag/id3/AbstractTagItem.logger : Ljava/util/logging/Logger;
    //   162: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   165: aload_1
    //   166: invokevirtual getMessage : ()Ljava/lang/String;
    //   169: aload_1
    //   170: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   173: aload_1
    //   174: invokestatic n : (Ljava/lang/Throwable;)V
    //   177: aconst_null
    //   178: athrow
    //   179: getstatic org/jaudiotagger/tag/id3/AbstractTagItem.logger : Ljava/util/logging/Logger;
    //   182: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   185: aload_1
    //   186: invokevirtual getMessage : ()Ljava/lang/String;
    //   189: aload_1
    //   190: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   193: aload_1
    //   194: invokestatic n : (Ljava/lang/Throwable;)V
    //   197: aconst_null
    //   198: athrow
    //   199: getstatic org/jaudiotagger/tag/id3/AbstractTagItem.logger : Ljava/util/logging/Logger;
    //   202: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   205: aload_3
    //   206: invokevirtual getMessage : ()Ljava/lang/String;
    //   209: aload_3
    //   210: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   213: aload_0
    //   214: new org/jaudiotagger/tag/id3/framebody/FrameBodyUnsupported
    //   217: dup
    //   218: aload_1
    //   219: invokespecial <init> : (Ljava/lang/String;)V
    //   222: putfield frameBody : Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   225: aload_0
    //   226: getfield frameBody : Lorg/jaudiotagger/tag/id3/AbstractTagFrameBody;
    //   229: aload_0
    //   230: invokevirtual setHeader : (Lorg/jaudiotagger/tag/id3/AbstractTagFrame;)V
    //   233: getstatic org/jaudiotagger/tag/id3/AbstractTagItem.logger : Ljava/util/logging/Logger;
    //   236: astore_1
    //   237: new java/lang/StringBuilder
    //   240: dup
    //   241: ldc 'Created empty frame of type'
    //   243: invokespecial <init> : (Ljava/lang/String;)V
    //   246: astore_3
    //   247: aload_3
    //   248: aload_0
    //   249: getfield identifier : Ljava/lang/String;
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_3
    //   257: ldc 'with frame body of'
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: aload_3
    //   264: aload_2
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload_1
    //   270: aload_3
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokevirtual config : (Ljava/lang/String;)V
    //   277: return
    // Exception table:
    //   from	to	target	type
    //   111	144	155	java/lang/ClassNotFoundException
    //   111	144	151	java/lang/InstantiationException
    //   111	144	147	java/lang/IllegalAccessException
  }
  
  public ID3v22Frame(ByteBuffer paramByteBuffer) {
    this(paramByteBuffer, "");
  }
  
  public ID3v22Frame(ByteBuffer paramByteBuffer, String paramString) {
    setLoggingFilename(paramString);
    read(paramByteBuffer);
  }
  
  public ID3v22Frame(AbstractID3v2Frame paramAbstractID3v2Frame) {
    AbstractTagItem.logger.config("Creating frame from a frame of a different version");
    if (!(paramAbstractID3v2Frame instanceof ID3v22Frame)) {
      if (paramAbstractID3v2Frame instanceof ID3v24Frame) {
        createV22FrameFromV23Frame(new ID3v23Frame(paramAbstractID3v2Frame));
      } else if (paramAbstractID3v2Frame instanceof ID3v23Frame) {
        createV22FrameFromV23Frame((ID3v23Frame)paramAbstractID3v2Frame);
      } 
      this.frameBody.setHeader(this);
      AbstractTagItem.logger.config("Created frame from a frame of a different version");
      return;
    } 
    tp.j("Copy Constructor not called. Please type cast the argument");
    throw null;
  }
  
  public ID3v22Frame(ID3v22Frame paramID3v22Frame) {
    super(paramID3v22Frame);
    AbstractTagItem.logger.config("Creating frame from a frame of same version");
  }
  
  public ID3v22Frame(AbstractID3v2FrameBody paramAbstractID3v2FrameBody) {
    super(paramAbstractID3v2FrameBody);
  }
  
  private void createV22FrameFromV23Frame(ID3v23Frame paramID3v23Frame) {
    String str1;
    String str2 = ID3Tags.convertFrameID23To22(paramID3v23Frame.getIdentifier());
    this.identifier = str2;
    if (str2 != null) {
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("V2:Orig id is:");
      stringBuilder1.append(paramID3v23Frame.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.config(stringBuilder1.toString());
      this.frameBody = (AbstractTagFrameBody)ID3Tags.copyObject(paramID3v23Frame.getBody());
      return;
    } 
    if (ID3Tags.isID3v23FrameIdentifier(paramID3v23Frame.getIdentifier())) {
      str2 = ID3Tags.forceFrameID23To22(paramID3v23Frame.getIdentifier());
      this.identifier = str2;
      if (str2 != null) {
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder2 = new StringBuilder("V2:Force:Orig id is:");
        stringBuilder2.append(paramID3v23Frame.getIdentifier());
        stringBuilder2.append(":New id is:");
        stringBuilder2.append(this.identifier);
        logger1.config(stringBuilder2.toString());
        this.frameBody = (AbstractTagFrameBody)readBody(this.identifier, (AbstractID3v2FrameBody)paramID3v23Frame.getBody());
        return;
      } 
      str1 = paramID3v23Frame.getIdentifier();
      StringBuilder stringBuilder1 = new StringBuilder(nBRIsU.XpGzKOwceaQ);
      stringBuilder1.append(str1);
      stringBuilder1.append(" to a v22 frame");
      throw new InvalidFrameException(stringBuilder1.toString());
    } 
    if (str1.getBody() instanceof FrameBodyDeprecated) {
      if (ID3Tags.isID3v22FrameIdentifier(str1.getIdentifier())) {
        this.frameBody = str1.getBody();
        this.identifier = str1.getIdentifier();
        Logger logger2 = AbstractTagItem.logger;
        StringBuilder stringBuilder2 = new StringBuilder("DEPRECATED:Orig id is:");
        stringBuilder2.append(str1.getIdentifier());
        stringBuilder2.append(":New id is:");
        stringBuilder2.append(this.identifier);
        logger2.config(stringBuilder2.toString());
        return;
      } 
      this.frameBody = (AbstractTagFrameBody)new FrameBodyDeprecated((FrameBodyDeprecated)str1.getBody());
      this.identifier = str1.getIdentifier();
      Logger logger1 = AbstractTagItem.logger;
      StringBuilder stringBuilder1 = new StringBuilder("DEPRECATED:Orig id is:");
      stringBuilder1.append(str1.getIdentifier());
      stringBuilder1.append(":New id is:");
      stringBuilder1.append(this.identifier);
      logger1.config(stringBuilder1.toString());
      return;
    } 
    this.frameBody = (AbstractTagFrameBody)new FrameBodyUnsupported((FrameBodyUnsupported)str1.getBody());
    this.identifier = str1.getIdentifier();
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder("v2:UNKNOWN:Orig id is:");
    stringBuilder.append(str1.getIdentifier());
    stringBuilder.append(":New id is:");
    stringBuilder.append(this.identifier);
    logger.config(stringBuilder.toString());
  }
  
  private int decodeSize(byte[] paramArrayOfbyte) {
    int i = (new BigInteger(paramArrayOfbyte)).intValue();
    if (i < 0) {
      Logger logger = AbstractTagItem.logger;
      StringBuilder stringBuilder = ga1.k(i, "Invalid Frame Size of:", "Decoded from bin:");
      stringBuilder.append(Integer.toBinaryString(i));
      stringBuilder.append("Decoded from hex:");
      stringBuilder.append(Integer.toHexString(i));
      logger.warning(stringBuilder.toString());
    } 
    return i;
  }
  
  private void encodeSize(ByteBuffer paramByteBuffer, int paramInt) {
    paramByteBuffer.put((byte)((0xFF0000 & paramInt) >> 16));
    paramByteBuffer.put((byte)((0xFF00 & paramInt) >> 8));
    paramByteBuffer.put((byte)(paramInt & 0xFF));
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = ga1.k(paramInt, "Frame Size Is Actual:", ":Encoded bin:");
    stringBuilder.append(Integer.toBinaryString(paramInt));
    stringBuilder.append(":Encoded Hex");
    stringBuilder.append(Integer.toHexString(paramInt));
    logger.fine(stringBuilder.toString());
  }
  
  public void createStructure() {
    MP3File.getStructureFormatter().f("frame", getIdentifier());
    MP3File.getStructureFormatter().a("frameSize", this.frameSize);
    this.frameBody.createStructure();
    MP3File.getStructureFormatter().d("frame");
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ID3v22Frame))
      return false; 
    paramObject = paramObject;
    return (z51.a(this.statusFlags, ((AbstractID3v2Frame)paramObject).statusFlags) && z51.a(this.encodingFlags, ((AbstractID3v2Frame)paramObject).encodingFlags) && super.equals(paramObject));
  }
  
  public int getFrameHeaderSize() {
    return 6;
  }
  
  public int getFrameIdSize() {
    return 3;
  }
  
  public int getFrameSizeSize() {
    return 3;
  }
  
  public int getSize() {
    int i = this.frameBody.getSize();
    return getFrameHeaderSize() + i;
  }
  
  public boolean isBinary() {
    return ID3v22Frames.getInstanceOf().isBinary(getId());
  }
  
  public boolean isCommon() {
    return ID3v22Frames.getInstanceOf().isCommon(getId());
  }
  
  public boolean isPadding(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte[0] == 0 && paramArrayOfbyte[1] == 0 && paramArrayOfbyte[2] == 0);
  }
  
  public boolean isValidID3v2FrameIdentifier(String paramString) {
    return validFrameIdentifier.matcher(paramString).matches();
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    StringBuilder stringBuilder1;
    ByteBuffer byteBuffer;
    String str2 = readIdentifier(paramByteBuffer);
    byte[] arrayOfByte = new byte[getFrameSizeSize()];
    if (isValidID3v2FrameIdentifier(str2)) {
      paramByteBuffer.get(arrayOfByte, 0, getFrameSizeSize());
      int i = decodeSize(arrayOfByte);
      this.frameSize = i;
      if (i >= 0) {
        if (i != 0) {
          if (i <= paramByteBuffer.remaining()) {
            Logger logger3 = AbstractTagItem.logger;
            StringBuilder stringBuilder6 = new StringBuilder("Frame Size Is:");
            stringBuilder6.append(this.frameSize);
            logger3.fine(stringBuilder6.toString());
            String str = ID3Tags.convertFrameID22To24(str2);
            null = str;
            if (str == null) {
              str = ID3Tags.convertFrameID22To23(str2);
              null = str;
              if (str == null)
                if (ID3Tags.isID3v22FrameIdentifier(str2)) {
                  null = str2;
                } else {
                  null = "Unsupported";
                }  
            } 
            Logger logger4 = AbstractTagItem.logger;
            StringBuilder stringBuilder7 = new StringBuilder("Identifier was:");
            stringBuilder7.append(str2);
            stringBuilder7.append(" reading using:");
            stringBuilder7.append(null);
            logger4.fine(stringBuilder7.toString());
            byteBuffer = paramByteBuffer.slice();
            byteBuffer.limit(this.frameSize);
            try {
              this.frameBody = (AbstractTagFrameBody)readBody(null, byteBuffer, this.frameSize);
              return;
            } finally {
              paramByteBuffer.position(paramByteBuffer.position() + this.frameSize);
            } 
          } 
          Logger logger2 = AbstractTagItem.logger;
          StringBuilder stringBuilder = new StringBuilder("Invalid Frame size larger than size before mp3 audio:");
          stringBuilder.append((String)byteBuffer);
          logger2.warning(stringBuilder.toString());
          stringBuilder = new StringBuilder();
          stringBuilder.append((String)byteBuffer);
          stringBuilder.append(" is invalid frame");
          throw new InvalidFrameException(stringBuilder.toString());
        } 
        Logger logger1 = AbstractTagItem.logger;
        StringBuilder stringBuilder5 = new StringBuilder("Empty Frame:");
        stringBuilder5.append((String)byteBuffer);
        logger1.warning(stringBuilder5.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append((String)byteBuffer);
        stringBuilder4.append(" is empty frame");
        throw new EmptyFrameException(stringBuilder4.toString());
      } 
      stringBuilder1 = ga1.l((String)byteBuffer, " has invalid size of:");
      stringBuilder1.append(this.frameSize);
      throw new InvalidFrameException(stringBuilder1.toString());
    } 
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder3 = new StringBuilder("Invalid identifier:");
    stringBuilder3.append((String)byteBuffer);
    logger.config(stringBuilder3.toString());
    stringBuilder1.position(stringBuilder1.position() - getFrameIdSize() - 1);
    String str1 = getLoggingFilename();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str1);
    stringBuilder2.append(":");
    stringBuilder2.append((String)byteBuffer);
    stringBuilder2.append(":is not a valid ID3v2.20 frame");
    throw new InvalidFrameIdentifierException(stringBuilder2.toString());
  }
  
  public void setEncoding(Charset paramCharset) {
    Integer integer = TextEncoding.getInstanceOf().getIdForCharset(paramCharset);
    if (integer != null && integer.intValue() < 2)
      getBody().setTextEncoding(integer.byteValue()); 
  }
  
  public void write(ByteArrayOutputStream paramByteArrayOutputStream) {
    Logger logger = AbstractTagItem.logger;
    StringBuilder stringBuilder = new StringBuilder(FgdLmmRfTxSFKI.UZzZfYnNxw);
    stringBuilder.append(getIdentifier());
    logger.config(stringBuilder.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(getFrameHeaderSize());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ((AbstractID3v2FrameBody)this.frameBody).write(byteArrayOutputStream);
    byteBuffer.put(getIdentifier().getBytes(mk.b), 0, getFrameIdSize());
    encodeSize(byteBuffer, this.frameBody.getSize());
    try {
      paramByteArrayOutputStream.write(byteBuffer.array());
      paramByteArrayOutputStream.write(byteArrayOutputStream.toByteArray());
      return;
    } catch (IOException iOException) {
      k91.n(iOException);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v22Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */