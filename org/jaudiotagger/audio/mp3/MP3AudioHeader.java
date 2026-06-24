package org.jaudiotagger.audio.mp3;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.SupportedFileFormat;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.generic.Utils;
import u00;
import wf2;

public class MP3AudioHeader implements AudioHeader {
  private static final int FILE_BUFFER_SIZE = 5000;
  
  private static final int MIN_BUFFER_REMAINING_REQUIRED = 196;
  
  private static final int NO_SECONDS_IN_HOUR = 3600;
  
  private static final char isVbrIdentifier = '~';
  
  public static Logger logger;
  
  private static final SimpleDateFormat timeInFormat;
  
  private static final SimpleDateFormat timeOutFormat;
  
  private static final SimpleDateFormat timeOutOverAnHourFormat;
  
  private Long audioDataEndPosition;
  
  private Long audioDataStartPosition;
  
  private long bitrate;
  
  private String encoder = "";
  
  private long fileSize;
  
  protected MPEGFrameHeader mp3FrameHeader;
  
  protected VbriFrame mp3VbriFrame;
  
  protected XingFrame mp3XingFrame;
  
  private long numberOfFrames;
  
  private long numberOfFramesEstimate;
  
  private long startByte;
  
  private double timePerFrame;
  
  private double trackLength;
  
  static {
    Locale locale = Locale.UK;
    timeInFormat = new SimpleDateFormat("ss", locale);
    timeOutFormat = new SimpleDateFormat("mm:ss", locale);
    timeOutOverAnHourFormat = new SimpleDateFormat("kk:mm:ss", locale);
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.mp3");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public MP3AudioHeader() {}
  
  public MP3AudioHeader(u00 paramu00) {
    if (seek(paramu00, 0L))
      return; 
    String str = paramu00.h();
    StringBuilder stringBuilder = new StringBuilder("No audio header found within");
    stringBuilder.append(str);
    throw new InvalidAudioFrameException(stringBuilder.toString());
  }
  
  public MP3AudioHeader(u00 paramu00, long paramLong) {
    if (seek(paramu00, paramLong))
      return; 
    throw new InvalidAudioFrameException(MessageFormat.format("No audio header found within {0}", new Object[] { paramu00.h() }));
  }
  
  private double getTimePerFrame() {
    return this.timePerFrame;
  }
  
  private boolean isNextFrameValid(u00 paramu00, long paramLong, ByteBuffer paramByteBuffer, FileChannel paramFileChannel) {
    StringBuilder stringBuilder;
    if (logger.isLoggable(Level.FINEST)) {
      Logger logger = logger;
      StringBuilder stringBuilder1 = new StringBuilder("Checking next frame");
      stringBuilder1.append(paramu00.h());
      stringBuilder1.append(":fpc:");
      stringBuilder1.append(paramLong);
      stringBuilder1.append("skipping to:");
      stringBuilder1.append(this.mp3FrameHeader.getFrameLength() + paramLong);
      logger.finer(stringBuilder1.toString());
    } 
    int i = paramByteBuffer.position();
    int j = this.mp3FrameHeader.getFrameLength();
    boolean bool = false;
    if (j > 4804) {
      Logger logger = logger;
      stringBuilder = new StringBuilder("Frame size is too large to be a frame:");
      stringBuilder.append(this.mp3FrameHeader.getFrameLength());
      logger.finer(stringBuilder.toString());
      return false;
    } 
    if (stringBuilder.remaining() <= this.mp3FrameHeader.getFrameLength() + 196) {
      Logger logger = logger;
      StringBuilder stringBuilder1 = new StringBuilder("Buffer too small, need to reload, buffer size:");
      stringBuilder1.append(stringBuilder.remaining());
      logger.finer(stringBuilder1.toString());
      stringBuilder.clear();
      paramFileChannel.position(paramLong);
      paramFileChannel.read((ByteBuffer)stringBuilder, paramFileChannel.position());
      stringBuilder.flip();
      if (stringBuilder.limit() <= 196) {
        logger.finer("Nearly at end of file, no header found:");
        return false;
      } 
      if (stringBuilder.limit() <= this.mp3FrameHeader.getFrameLength() + 196) {
        logger.finer("Nearly at end of file, no room for next frame, no header found:");
        return false;
      } 
      i = 0;
    } 
    j = stringBuilder.position();
    stringBuilder.position(this.mp3FrameHeader.getFrameLength() + j);
    if (MPEGFrameHeader.isMPEGFrame((ByteBuffer)stringBuilder)) {
      try {
        MPEGFrameHeader.parseMPEGHeader((ByteBuffer)stringBuilder);
        logger.finer("Check next frame confirms is an audio header ");
        bool = true;
      } catch (InvalidAudioFrameException invalidAudioFrameException) {
        logger.finer("Check next frame has identified this is not an audio header");
      } 
    } else {
      logger.finer("isMPEGFrame has identified this is not an audio header");
    } 
    stringBuilder.position(i);
    return bool;
  }
  
  public Long getAudioDataEndPosition() {
    return this.audioDataEndPosition;
  }
  
  public Long getAudioDataLength() {
    return Long.valueOf(0L);
  }
  
  public Long getAudioDataStartPosition() {
    return this.audioDataStartPosition;
  }
  
  public String getBitRate() {
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null && xingFrame.isVbr()) {
      StringBuilder stringBuilder = new StringBuilder("~");
      stringBuilder.append(String.valueOf(this.bitrate));
      return stringBuilder.toString();
    } 
    VbriFrame vbriFrame = this.mp3VbriFrame;
    long l = this.bitrate;
    if (vbriFrame != null) {
      StringBuilder stringBuilder = new StringBuilder("~");
      stringBuilder.append(String.valueOf(l));
      return stringBuilder.toString();
    } 
    return String.valueOf(l);
  }
  
  public long getBitRateAsNumber() {
    return this.bitrate;
  }
  
  public int getBitsPerSample() {
    return 16;
  }
  
  public Integer getByteRate() {
    return null;
  }
  
  public String getChannels() {
    return this.mp3FrameHeader.getChannelModeAsString();
  }
  
  public String getEmphasis() {
    return this.mp3FrameHeader.getEmphasisAsString();
  }
  
  public String getEncoder() {
    return this.encoder;
  }
  
  public String getEncodingType() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.mp3FrameHeader.getVersionAsString());
    stringBuilder.append(" ");
    stringBuilder.append(this.mp3FrameHeader.getLayerAsString());
    return stringBuilder.toString();
  }
  
  public String getFormat() {
    return SupportedFileFormat.MP3.getDisplayName();
  }
  
  public long getMp3StartByte() {
    return this.startByte;
  }
  
  public String getMpegLayer() {
    return this.mp3FrameHeader.getLayerAsString();
  }
  
  public String getMpegVersion() {
    return this.mp3FrameHeader.getVersionAsString();
  }
  
  public Long getNoOfSamples() {
    return Long.valueOf(this.numberOfFrames);
  }
  
  public long getNumberOfFrames() {
    return this.numberOfFrames;
  }
  
  public long getNumberOfFramesEstimate() {
    return this.numberOfFramesEstimate;
  }
  
  public double getPreciseTrackLength() {
    return this.trackLength;
  }
  
  public String getSampleRate() {
    return String.valueOf(this.mp3FrameHeader.getSamplingRate());
  }
  
  public int getSampleRateAsNumber() {
    return this.mp3FrameHeader.getSamplingRate().intValue();
  }
  
  public int getTrackLength() {
    return (int)Math.round(getPreciseTrackLength());
  }
  
  public String getTrackLengthAsString() {
    Exception exception;
    try {
      long l = getTrackLength();
      SimpleDateFormat simpleDateFormat = timeInFormat;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/text/SimpleDateFormat}, name=null} */
      try {
        null = simpleDateFormat.parse(String.valueOf(l));
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/text/SimpleDateFormat}, name=null} */
        if (l < 3600L)
          synchronized (timeOutFormat) {
            return simpleDateFormat.format(null);
          }  
        synchronized (timeOutOverAnHourFormat) {
          return simpleDateFormat.format(null);
        } 
      } finally {}
    } catch (ParseException parseException) {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/text/ParseException}, name=null} */
    throw exception;
  }
  
  public boolean isCopyrighted() {
    return this.mp3FrameHeader.isCopyrighted();
  }
  
  public boolean isLossless() {
    return false;
  }
  
  public boolean isOriginal() {
    return this.mp3FrameHeader.isOriginal();
  }
  
  public boolean isPadding() {
    return this.mp3FrameHeader.isPadding();
  }
  
  public boolean isPrivate() {
    return this.mp3FrameHeader.isPrivate();
  }
  
  public boolean isProtected() {
    return this.mp3FrameHeader.isProtected();
  }
  
  public boolean isVariableBitRate() {
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null)
      return xingFrame.isVbr(); 
    VbriFrame vbriFrame = this.mp3VbriFrame;
    return (vbriFrame != null) ? vbriFrame.isVbr() : this.mp3FrameHeader.isVariableBitRate();
  }
  
  public boolean seek(u00 paramu00, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic n : (Lu00;)Ljava/io/FileInputStream;
    //   4: astore #10
    //   6: aload #10
    //   8: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   11: astore #11
    //   13: sipush #5000
    //   16: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   19: astore #12
    //   21: aload #11
    //   23: lload_2
    //   24: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   27: pop
    //   28: aload #11
    //   30: aload #12
    //   32: lload_2
    //   33: invokevirtual read : (Ljava/nio/ByteBuffer;J)I
    //   36: pop
    //   37: aload #12
    //   39: invokevirtual flip : ()Ljava/nio/Buffer;
    //   42: pop
    //   43: iconst_0
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #5
    //   49: aload_1
    //   50: astore #8
    //   52: aload_0
    //   53: astore #9
    //   55: aload #12
    //   57: invokevirtual remaining : ()I
    //   60: istore #4
    //   62: iload #4
    //   64: sipush #196
    //   67: if_icmpgt -> 141
    //   70: aload #12
    //   72: invokevirtual clear : ()Ljava/nio/Buffer;
    //   75: pop
    //   76: aload #11
    //   78: lload_2
    //   79: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   82: pop
    //   83: aload #11
    //   85: aload #12
    //   87: aload #11
    //   89: invokevirtual position : ()J
    //   92: invokevirtual read : (Ljava/nio/ByteBuffer;J)I
    //   95: pop
    //   96: aload #12
    //   98: invokevirtual flip : ()Ljava/nio/Buffer;
    //   101: pop
    //   102: aload #12
    //   104: invokevirtual limit : ()I
    //   107: istore #4
    //   109: iload #4
    //   111: sipush #196
    //   114: if_icmpgt -> 141
    //   117: aload #11
    //   119: invokevirtual close : ()V
    //   122: aload #10
    //   124: invokevirtual close : ()V
    //   127: iconst_0
    //   128: ireturn
    //   129: astore_1
    //   130: goto -> 540
    //   133: astore_1
    //   134: goto -> 417
    //   137: astore_1
    //   138: goto -> 432
    //   141: aload #12
    //   143: invokestatic isMPEGFrame : (Ljava/nio/ByteBuffer;)Z
    //   146: istore #6
    //   148: iload #6
    //   150: ifeq -> 376
    //   153: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   156: astore #13
    //   158: getstatic java/util/logging/Level.FINEST : Ljava/util/logging/Level;
    //   161: astore_1
    //   162: aload #13
    //   164: aload_1
    //   165: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   168: istore #6
    //   170: iload #6
    //   172: ifeq -> 216
    //   175: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   178: astore #14
    //   180: new java/lang/StringBuilder
    //   183: astore #13
    //   185: aload #13
    //   187: invokespecial <init> : ()V
    //   190: aload #13
    //   192: ldc_w 'Found Possible header at:'
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #13
    //   201: lload_2
    //   202: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #14
    //   208: aload #13
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: invokevirtual finest : (Ljava/lang/String;)V
    //   216: aload #12
    //   218: invokestatic parseMPEGHeader : (Ljava/nio/ByteBuffer;)Lorg/jaudiotagger/audio/mp3/MPEGFrameHeader;
    //   221: astore #13
    //   223: aload #9
    //   225: aload #13
    //   227: putfield mp3FrameHeader : Lorg/jaudiotagger/audio/mp3/MPEGFrameHeader;
    //   230: aload #12
    //   232: aload #13
    //   234: invokestatic isXingFrame : (Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp3/MPEGFrameHeader;)Ljava/nio/ByteBuffer;
    //   237: astore #13
    //   239: aload #13
    //   241: ifnull -> 286
    //   244: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   247: aload_1
    //   248: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   251: ifeq -> 273
    //   254: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   257: ldc_w 'Found Possible XingHeader'
    //   260: invokevirtual finest : (Ljava/lang/String;)V
    //   263: goto -> 273
    //   266: astore_1
    //   267: iconst_1
    //   268: istore #5
    //   270: goto -> 376
    //   273: aload #9
    //   275: aload #13
    //   277: invokestatic parseXingFrame : (Ljava/nio/ByteBuffer;)Lorg/jaudiotagger/audio/mp3/XingFrame;
    //   280: putfield mp3XingFrame : Lorg/jaudiotagger/audio/mp3/XingFrame;
    //   283: goto -> 332
    //   286: aload #12
    //   288: aload #9
    //   290: getfield mp3FrameHeader : Lorg/jaudiotagger/audio/mp3/MPEGFrameHeader;
    //   293: invokestatic isVbriFrame : (Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp3/MPEGFrameHeader;)Ljava/nio/ByteBuffer;
    //   296: astore #13
    //   298: aload #13
    //   300: ifnull -> 338
    //   303: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   306: aload_1
    //   307: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   310: ifeq -> 322
    //   313: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   316: ldc_w 'Found Possible VbriHeader'
    //   319: invokevirtual finest : (Ljava/lang/String;)V
    //   322: aload #9
    //   324: aload #13
    //   326: invokestatic parseVBRIFrame : (Ljava/nio/ByteBuffer;)Lorg/jaudiotagger/audio/mp3/VbriFrame;
    //   329: putfield mp3VbriFrame : Lorg/jaudiotagger/audio/mp3/VbriFrame;
    //   332: iconst_1
    //   333: istore #5
    //   335: goto -> 401
    //   338: aload #9
    //   340: aload #8
    //   342: lload_2
    //   343: aload #12
    //   345: aload #11
    //   347: invokespecial isNextFrameValid : (Lu00;JLjava/nio/ByteBuffer;Ljava/nio/channels/FileChannel;)Z
    //   350: istore #6
    //   352: iload #6
    //   354: istore #5
    //   356: iload #6
    //   358: ifeq -> 376
    //   361: iload #6
    //   363: istore #5
    //   365: goto -> 401
    //   368: astore_1
    //   369: goto -> 432
    //   372: astore_1
    //   373: goto -> 369
    //   376: aload #12
    //   378: aload #12
    //   380: invokevirtual position : ()I
    //   383: iconst_1
    //   384: iadd
    //   385: invokevirtual position : (I)Ljava/nio/Buffer;
    //   388: pop
    //   389: lload_2
    //   390: lconst_1
    //   391: ladd
    //   392: lstore_2
    //   393: iload #5
    //   395: ifeq -> 414
    //   398: goto -> 365
    //   401: aload #11
    //   403: invokevirtual close : ()V
    //   406: aload #10
    //   408: invokevirtual close : ()V
    //   411: goto -> 452
    //   414: goto -> 55
    //   417: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   420: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   423: ldc_w 'IOException occurred whilst trying to find sync'
    //   426: aload_1
    //   427: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   430: aload_1
    //   431: athrow
    //   432: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   435: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   438: ldc_w 'Reached end of file without finding sync match'
    //   441: aload_1
    //   442: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   445: iload #7
    //   447: istore #5
    //   449: goto -> 401
    //   452: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   455: getstatic java/util/logging/Level.FINEST : Ljava/util/logging/Level;
    //   458: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   461: ifeq -> 496
    //   464: getstatic org/jaudiotagger/audio/mp3/MP3AudioHeader.logger : Ljava/util/logging/Logger;
    //   467: astore_1
    //   468: new java/lang/StringBuilder
    //   471: dup
    //   472: ldc_w 'Return found matching mp3 header starting at'
    //   475: invokespecial <init> : (Ljava/lang/String;)V
    //   478: astore #10
    //   480: aload #10
    //   482: lload_2
    //   483: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload_1
    //   488: aload #10
    //   490: invokevirtual toString : ()Ljava/lang/String;
    //   493: invokevirtual finer : (Ljava/lang/String;)V
    //   496: aload #9
    //   498: aload #8
    //   500: invokevirtual n : ()J
    //   503: invokevirtual setFileSize : (J)V
    //   506: aload #9
    //   508: lload_2
    //   509: invokevirtual setMp3StartByte : (J)V
    //   512: aload #9
    //   514: invokevirtual setTimePerFrame : ()V
    //   517: aload #9
    //   519: invokevirtual setNumberOfFrames : ()V
    //   522: aload #9
    //   524: invokevirtual setTrackLength : ()V
    //   527: aload #9
    //   529: invokevirtual setBitRate : ()V
    //   532: aload #9
    //   534: invokevirtual setEncoder : ()V
    //   537: iload #5
    //   539: ireturn
    //   540: aload #11
    //   542: invokevirtual close : ()V
    //   545: aload #10
    //   547: invokevirtual close : ()V
    //   550: aload_1
    //   551: athrow
    //   552: astore_1
    //   553: goto -> 376
    //   556: astore_1
    //   557: goto -> 332
    //   560: astore_1
    //   561: goto -> 267
    // Exception table:
    //   from	to	target	type
    //   55	62	372	java/io/EOFException
    //   55	62	133	java/io/IOException
    //   55	62	129	finally
    //   70	109	137	java/io/EOFException
    //   70	109	133	java/io/IOException
    //   70	109	129	finally
    //   141	148	372	java/io/EOFException
    //   141	148	133	java/io/IOException
    //   141	148	129	finally
    //   153	170	552	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   153	170	372	java/io/EOFException
    //   153	170	133	java/io/IOException
    //   153	170	129	finally
    //   175	216	552	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   175	216	137	java/io/EOFException
    //   175	216	133	java/io/IOException
    //   175	216	129	finally
    //   216	230	552	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   216	230	372	java/io/EOFException
    //   216	230	133	java/io/IOException
    //   216	230	129	finally
    //   230	239	266	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   230	239	372	java/io/EOFException
    //   230	239	133	java/io/IOException
    //   230	239	129	finally
    //   244	263	266	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   244	263	137	java/io/EOFException
    //   244	263	133	java/io/IOException
    //   244	263	129	finally
    //   273	283	556	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   273	283	137	java/io/EOFException
    //   273	283	133	java/io/IOException
    //   273	283	129	finally
    //   286	298	266	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   286	298	372	java/io/EOFException
    //   286	298	133	java/io/IOException
    //   286	298	129	finally
    //   303	322	266	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   303	322	137	java/io/EOFException
    //   303	322	133	java/io/IOException
    //   303	322	129	finally
    //   322	332	556	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   322	332	137	java/io/EOFException
    //   322	332	133	java/io/IOException
    //   322	332	129	finally
    //   338	352	560	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   338	352	368	java/io/EOFException
    //   338	352	133	java/io/IOException
    //   338	352	129	finally
    //   376	389	368	java/io/EOFException
    //   376	389	133	java/io/IOException
    //   376	389	129	finally
    //   417	432	129	finally
    //   432	445	129	finally
  }
  
  public void setAudioDataEndPosition(Long paramLong) {
    this.audioDataEndPosition = paramLong;
  }
  
  public void setAudioDataStartPosition(Long paramLong) {
    this.audioDataStartPosition = paramLong;
  }
  
  public void setBitRate() {
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null && xingFrame.isVbr()) {
      if (this.mp3XingFrame.isAudioSizeEnabled() && this.mp3XingFrame.getAudioSize() > 0) {
        this.bitrate = (long)((this.mp3XingFrame.getAudioSize() * Utils.BITS_IN_BYTE_MULTIPLIER) / this.timePerFrame * getNumberOfFrames() * Utils.KILOBYTE_MULTIPLIER);
        return;
      } 
      this.bitrate = (long)(((this.fileSize - this.startByte) * Utils.BITS_IN_BYTE_MULTIPLIER) / this.timePerFrame * getNumberOfFrames() * Utils.KILOBYTE_MULTIPLIER);
      return;
    } 
    VbriFrame vbriFrame = this.mp3VbriFrame;
    if (vbriFrame != null) {
      if (vbriFrame.getAudioSize() > 0) {
        this.bitrate = (long)((this.mp3VbriFrame.getAudioSize() * Utils.BITS_IN_BYTE_MULTIPLIER) / this.timePerFrame * getNumberOfFrames() * Utils.KILOBYTE_MULTIPLIER);
        return;
      } 
      this.bitrate = (long)(((this.fileSize - this.startByte) * Utils.BITS_IN_BYTE_MULTIPLIER) / this.timePerFrame * getNumberOfFrames() * Utils.KILOBYTE_MULTIPLIER);
      return;
    } 
    this.bitrate = this.mp3FrameHeader.getBitRate().intValue();
  }
  
  public void setEncoder() {
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null) {
      if (xingFrame.getLameFrame() != null) {
        this.encoder = this.mp3XingFrame.getLameFrame().getEncoder();
        return;
      } 
    } else {
      VbriFrame vbriFrame = this.mp3VbriFrame;
      if (vbriFrame != null)
        this.encoder = vbriFrame.getEncoder(); 
    } 
  }
  
  public void setFileSize(long paramLong) {
    this.fileSize = paramLong;
  }
  
  public void setMp3StartByte(long paramLong) {
    this.startByte = paramLong;
  }
  
  public void setNumberOfFrames() {
    this.numberOfFramesEstimate = (this.fileSize - this.startByte) / this.mp3FrameHeader.getFrameLength();
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null && xingFrame.isFrameCountEnabled()) {
      this.numberOfFrames = this.mp3XingFrame.getFrameCount();
      return;
    } 
    VbriFrame vbriFrame = this.mp3VbriFrame;
    if (vbriFrame != null) {
      this.numberOfFrames = vbriFrame.getFrameCount();
      return;
    } 
    this.numberOfFrames = this.numberOfFramesEstimate;
  }
  
  public void setTimePerFrame() {
    this.timePerFrame = this.mp3FrameHeader.getNoOfSamples() / this.mp3FrameHeader.getSamplingRate().doubleValue();
    if ((this.mp3FrameHeader.getVersion() == 2 || this.mp3FrameHeader.getVersion() == 0) && (this.mp3FrameHeader.getLayer() == 2 || this.mp3FrameHeader.getLayer() == 1) && this.mp3FrameHeader.getNumberOfChannels() == 1)
      this.timePerFrame /= 2.0D; 
  }
  
  public void setTrackLength() {
    this.trackLength = this.numberOfFrames * getTimePerFrame();
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder("Audio Header content:\n");
    StringBuilder stringBuilder2 = new StringBuilder("\tfileSize:");
    stringBuilder2.append(this.fileSize);
    stringBuilder2.append("\n\tencoder:");
    stringBuilder2.append(this.encoder);
    stringBuilder2.append("\n\tencoderType:");
    stringBuilder2.append(getEncodingType());
    stringBuilder2.append("\n\tformat:");
    stringBuilder2.append(getFormat());
    stringBuilder2.append("\n\tstartByte:");
    stringBuilder2.append(wf2.f(this.startByte));
    stringBuilder2.append("\n\tnumberOfFrames:");
    stringBuilder2.append(this.numberOfFrames);
    stringBuilder2.append("\n\tnumberOfFramesEst:");
    stringBuilder2.append(this.numberOfFramesEstimate);
    stringBuilder2.append("\n\ttimePerFrame:");
    stringBuilder2.append(this.timePerFrame);
    stringBuilder2.append("\n\tbitrate:");
    stringBuilder2.append(this.bitrate);
    stringBuilder2.append("\n\ttrackLength:");
    stringBuilder2.append(getTrackLengthAsString());
    stringBuilder2.append("\n");
    stringBuilder1.append(stringBuilder2.toString());
    MPEGFrameHeader mPEGFrameHeader = this.mp3FrameHeader;
    if (mPEGFrameHeader != null) {
      stringBuilder1.append(mPEGFrameHeader.toString());
    } else {
      stringBuilder1.append("MPEG Frame Header:false");
    } 
    XingFrame xingFrame = this.mp3XingFrame;
    if (xingFrame != null) {
      stringBuilder1.append(xingFrame.toString());
    } else {
      stringBuilder1.append("Xing Frame:false");
    } 
    VbriFrame vbriFrame = this.mp3VbriFrame;
    if (vbriFrame != null) {
      stringBuilder1.append(vbriFrame.toString());
    } else {
      stringBuilder1.append("VBRI Frame:false");
    } 
    return stringBuilder1.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\MP3AudioHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */