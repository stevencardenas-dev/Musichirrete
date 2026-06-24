package org.jaudiotagger.audio.mp4;

import c61;
import java.nio.ByteBuffer;
import java.text.MessageFormat;
import java.util.logging.Logger;
import mk;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.Mp4NonStandardFieldKey;
import org.jaudiotagger.tag.mp4.Mp4Tag;
import org.jaudiotagger.tag.mp4.field.Mp4DiscNoField;
import org.jaudiotagger.tag.mp4.field.Mp4FieldType;
import org.jaudiotagger.tag.mp4.field.Mp4GenreField;
import org.jaudiotagger.tag.mp4.field.Mp4TagBinaryField;
import org.jaudiotagger.tag.mp4.field.Mp4TagByteField;
import org.jaudiotagger.tag.mp4.field.Mp4TagCoverField;
import org.jaudiotagger.tag.mp4.field.Mp4TagRawBinaryField;
import org.jaudiotagger.tag.mp4.field.Mp4TagReverseDnsField;
import org.jaudiotagger.tag.mp4.field.Mp4TagTextField;
import org.jaudiotagger.tag.mp4.field.Mp4TagTextNumberField;
import org.jaudiotagger.tag.mp4.field.Mp4TrackField;

public class Mp4TagReader {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.mp4");
  
  private void createMp4Field(Mp4Tag paramMp4Tag, Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    if (paramMp4BoxHeader.getDataLength() != 0) {
      StringBuilder stringBuilder;
      Logger logger;
      if (paramMp4BoxHeader.getId().equals("----"))
        try {
          Mp4TagReverseDnsField mp4TagReverseDnsField = new Mp4TagReverseDnsField();
          this(paramMp4BoxHeader, paramByteBuffer);
          paramMp4Tag.addField((TagField)mp4TagReverseDnsField);
          return;
        } catch (Exception exception) {
          logger.warning(MessageFormat.format("Unable to create reverse dns field because of exception:{0} adding as binary data instead", new Object[] { exception.getMessage() }));
          paramMp4Tag.addField((TagField)new Mp4TagRawBinaryField(paramMp4BoxHeader, paramByteBuffer));
          return;
        }  
      int i = paramByteBuffer.position();
      boolean bool = Utils.getString(paramByteBuffer, 4, 4, mk.b).equals(PwbbJfsdcHrAjW.todiZSsrp);
      paramByteBuffer.position(i);
      if (bool) {
        int k = Utils.getIntBE(paramByteBuffer, 9, 11);
        Mp4FieldType mp4FieldType = Mp4FieldType.getFieldType(k);
        Logger logger2 = logger;
        StringBuilder stringBuilder2 = new StringBuilder("Box Type id:");
        stringBuilder2.append(paramMp4BoxHeader.getId());
        stringBuilder2.append(":type:");
        stringBuilder2.append(mp4FieldType);
        logger2.config(stringBuilder2.toString());
        if (paramMp4BoxHeader.getId().equals(Mp4FieldKey.TRACK.getFieldName())) {
          paramMp4Tag.addField((TagField)new Mp4TrackField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        if (paramMp4BoxHeader.getId().equals(Mp4FieldKey.DISCNUMBER.getFieldName())) {
          paramMp4Tag.addField((TagField)new Mp4DiscNoField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        if (paramMp4BoxHeader.getId().equals(Mp4FieldKey.GENRE.getFieldName())) {
          paramMp4Tag.addField((TagField)new Mp4GenreField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        bool = paramMp4BoxHeader.getId().equals(Mp4FieldKey.ARTWORK.getFieldName());
        int j = 0;
        i = 0;
        if (bool || Mp4FieldType.isCoverArtType(mp4FieldType)) {
          for (i = 0; j < paramMp4BoxHeader.getDataLength(); i++) {
            if (i > 0)
              mp4FieldType = Mp4FieldType.getFieldType(Utils.getIntBE(paramByteBuffer, j + 9, j + 11)); 
            Mp4TagCoverField mp4TagCoverField = new Mp4TagCoverField(paramByteBuffer, mp4FieldType);
            paramMp4Tag.addField((TagField)mp4TagCoverField);
            j += mp4TagCoverField.getDataAndHeaderSize();
          } 
          return;
        } 
        if (mp4FieldType == Mp4FieldType.TEXT) {
          paramMp4Tag.addField((TagField)new Mp4TagTextField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        if (mp4FieldType == Mp4FieldType.IMPLICIT) {
          paramMp4Tag.addField((TagField)new Mp4TagTextNumberField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        if (mp4FieldType == Mp4FieldType.INTEGER) {
          paramMp4Tag.addField((TagField)new Mp4TagByteField(paramMp4BoxHeader.getId(), paramByteBuffer));
          return;
        } 
        Mp4FieldKey[] arrayOfMp4FieldKey = Mp4FieldKey.values();
        j = arrayOfMp4FieldKey.length;
        while (i < j) {
          if (arrayOfMp4FieldKey[i].getFieldName().equals(paramMp4BoxHeader.getId())) {
            logger = logger;
            stringBuilder = new StringBuilder("Known Field:");
            stringBuilder.append(paramMp4BoxHeader.getId());
            stringBuilder.append(" with invalid field type of:");
            stringBuilder.append(k);
            stringBuilder.append(" is ignored");
            logger.warning(stringBuilder.toString());
            return;
          } 
          i++;
        } 
        Logger logger1 = logger;
        StringBuilder stringBuilder1 = new StringBuilder("UnKnown Field:");
        stringBuilder1.append(paramMp4BoxHeader.getId());
        stringBuilder1.append(" with invalid field type of:");
        stringBuilder1.append(k);
        stringBuilder1.append(" created as binary");
        logger1.warning(stringBuilder1.toString());
        stringBuilder.addField((TagField)new Mp4TagBinaryField(paramMp4BoxHeader.getId(), (ByteBuffer)logger));
        return;
      } 
      if (paramMp4BoxHeader.getId().equals(Mp4NonStandardFieldKey.AAPR.getFieldName())) {
        stringBuilder.addField((TagField)new Mp4TagRawBinaryField(paramMp4BoxHeader, (ByteBuffer)logger));
        return;
      } 
      stringBuilder.addField((TagField)new Mp4TagRawBinaryField(paramMp4BoxHeader, (ByteBuffer)logger));
      return;
    } 
  }
  
  public Mp4Tag read(c61 paramc61) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'r'
    //   3: invokevirtual b : (Ljava/lang/String;)Ljava/nio/channels/FileChannel;
    //   6: astore #7
    //   8: new org/jaudiotagger/tag/mp4/Mp4Tag
    //   11: astore #8
    //   13: aload #8
    //   15: invokespecial <init> : ()V
    //   18: aload #7
    //   20: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.MOOV : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   23: invokevirtual getFieldName : ()Ljava/lang/String;
    //   26: invokestatic seekWithinLevel : (Ljava/nio/channels/FileChannel;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull -> 641
    //   34: aload_1
    //   35: invokevirtual getLength : ()I
    //   38: bipush #8
    //   40: isub
    //   41: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   44: astore #9
    //   46: aload #7
    //   48: aload #9
    //   50: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   53: pop
    //   54: aload #9
    //   56: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   59: pop
    //   60: aload #9
    //   62: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.UDTA : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   65: invokevirtual getFieldName : ()Ljava/lang/String;
    //   68: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   71: astore_1
    //   72: iconst_0
    //   73: istore_3
    //   74: aload_1
    //   75: ifnull -> 309
    //   78: iconst_0
    //   79: istore_2
    //   80: aload #9
    //   82: invokevirtual position : ()I
    //   85: istore #5
    //   87: aload_1
    //   88: invokevirtual getLength : ()I
    //   91: istore #4
    //   93: aload #9
    //   95: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.META : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   98: invokevirtual getFieldName : ()Ljava/lang/String;
    //   101: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   104: astore_1
    //   105: aload_1
    //   106: ifnonnull -> 244
    //   109: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   112: astore #6
    //   114: new java/lang/StringBuilder
    //   117: astore_1
    //   118: aload_1
    //   119: invokespecial <init> : ()V
    //   122: aload_1
    //   123: ldc_w 'This file does not currently contain any metadata'
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: ldc_w '-ui'
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload_1
    //   139: iload_2
    //   140: invokestatic valueOf : (I)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #6
    //   149: aload_1
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: invokevirtual warning : (Ljava/lang/String;)V
    //   156: aload #9
    //   158: iload #4
    //   160: bipush #8
    //   162: isub
    //   163: iload #5
    //   165: iadd
    //   166: invokevirtual position : (I)Ljava/nio/Buffer;
    //   169: pop
    //   170: aload #9
    //   172: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.UDTA : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   175: invokevirtual getFieldName : ()Ljava/lang/String;
    //   178: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   181: astore_1
    //   182: aload_1
    //   183: ifnull -> 192
    //   186: iinc #2, 1
    //   189: goto -> 80
    //   192: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   195: astore #6
    //   197: new java/lang/StringBuilder
    //   200: astore #10
    //   202: aload #10
    //   204: invokespecial <init> : ()V
    //   207: aload #10
    //   209: ldc_w 'This file does not currently contain any metadata'
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload #10
    //   218: ldc_w '-nui'
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: aload #6
    //   227: aload #10
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: invokevirtual warning : (Ljava/lang/String;)V
    //   235: iconst_0
    //   236: istore_2
    //   237: goto -> 246
    //   240: astore_1
    //   241: goto -> 654
    //   244: iconst_1
    //   245: istore_2
    //   246: iload_2
    //   247: ifeq -> 306
    //   250: new org/jaudiotagger/audio/mp4/atom/Mp4MetaBox
    //   253: astore #6
    //   255: aload #6
    //   257: aload_1
    //   258: aload #9
    //   260: invokespecial <init> : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;)V
    //   263: aload #6
    //   265: invokevirtual processData : ()V
    //   268: aload #9
    //   270: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.ILST : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   273: invokevirtual getFieldName : ()Ljava/lang/String;
    //   276: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   279: astore #6
    //   281: aload #6
    //   283: astore_1
    //   284: aload #6
    //   286: ifnonnull -> 311
    //   289: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   292: ldc_w 'This file does not currently contain any metadata'
    //   295: invokevirtual warning : (Ljava/lang/String;)V
    //   298: aload #7
    //   300: invokevirtual close : ()V
    //   303: aload #8
    //   305: areturn
    //   306: goto -> 311
    //   309: iconst_0
    //   310: istore_2
    //   311: iload_2
    //   312: ifne -> 411
    //   315: aload #9
    //   317: iconst_0
    //   318: invokevirtual position : (I)Ljava/nio/Buffer;
    //   321: pop
    //   322: aload #9
    //   324: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.META : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   327: invokevirtual getFieldName : ()Ljava/lang/String;
    //   330: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   333: astore_1
    //   334: aload_1
    //   335: ifnonnull -> 355
    //   338: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   341: ldc_w 'This file does not currently contain any metadata'
    //   344: invokevirtual warning : (Ljava/lang/String;)V
    //   347: aload #7
    //   349: invokevirtual close : ()V
    //   352: aload #8
    //   354: areturn
    //   355: new org/jaudiotagger/audio/mp4/atom/Mp4MetaBox
    //   358: astore #6
    //   360: aload #6
    //   362: aload_1
    //   363: aload #9
    //   365: invokespecial <init> : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;)V
    //   368: aload #6
    //   370: invokevirtual processData : ()V
    //   373: aload #9
    //   375: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.ILST : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   378: invokevirtual getFieldName : ()Ljava/lang/String;
    //   381: invokestatic seekWithinLevel : (Ljava/nio/ByteBuffer;Ljava/lang/String;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   384: astore #6
    //   386: aload #6
    //   388: astore_1
    //   389: aload #6
    //   391: ifnonnull -> 411
    //   394: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   397: ldc_w 'This file does not currently contain any metadata'
    //   400: invokevirtual warning : (Ljava/lang/String;)V
    //   403: aload #7
    //   405: invokevirtual close : ()V
    //   408: aload #8
    //   410: areturn
    //   411: aload_1
    //   412: invokevirtual getLength : ()I
    //   415: bipush #8
    //   417: isub
    //   418: istore #4
    //   420: aload #9
    //   422: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   425: astore #6
    //   427: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   430: astore #9
    //   432: new java/lang/StringBuilder
    //   435: astore #10
    //   437: aload #10
    //   439: invokespecial <init> : ()V
    //   442: aload #10
    //   444: ldc_w 'headerlengthsays:'
    //   447: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: aload #10
    //   453: iload #4
    //   455: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: aload #10
    //   461: ldc_w 'datalength:'
    //   464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: pop
    //   468: aload #10
    //   470: aload #6
    //   472: invokevirtual limit : ()I
    //   475: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   478: pop
    //   479: aload #9
    //   481: aload #10
    //   483: invokevirtual toString : ()Ljava/lang/String;
    //   486: invokevirtual config : (Ljava/lang/String;)V
    //   489: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   492: astore #9
    //   494: new java/lang/StringBuilder
    //   497: astore #10
    //   499: aload #10
    //   501: invokespecial <init> : ()V
    //   504: aload #10
    //   506: ldc_w 'Started to read metadata fields at position is in metadata buffer:'
    //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: aload #10
    //   515: aload #6
    //   517: invokevirtual position : ()I
    //   520: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   523: pop
    //   524: aload #9
    //   526: aload #10
    //   528: invokevirtual toString : ()Ljava/lang/String;
    //   531: invokevirtual config : (Ljava/lang/String;)V
    //   534: iload_3
    //   535: istore_2
    //   536: iload_2
    //   537: iload #4
    //   539: if_icmpge -> 633
    //   542: aload_1
    //   543: aload #6
    //   545: invokevirtual update : (Ljava/nio/ByteBuffer;)V
    //   548: getstatic org/jaudiotagger/audio/mp4/Mp4TagReader.logger : Ljava/util/logging/Logger;
    //   551: astore #9
    //   553: new java/lang/StringBuilder
    //   556: astore #10
    //   558: aload #10
    //   560: invokespecial <init> : ()V
    //   563: aload #10
    //   565: ldc_w 'Next position is at:'
    //   568: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: pop
    //   572: aload #10
    //   574: aload #6
    //   576: invokevirtual position : ()I
    //   579: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   582: pop
    //   583: aload #9
    //   585: aload #10
    //   587: invokevirtual toString : ()Ljava/lang/String;
    //   590: invokevirtual config : (Ljava/lang/String;)V
    //   593: aload_0
    //   594: aload #8
    //   596: aload_1
    //   597: aload #6
    //   599: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   602: invokespecial createMp4Field : (Lorg/jaudiotagger/tag/mp4/Mp4Tag;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;)V
    //   605: aload #6
    //   607: aload #6
    //   609: invokevirtual position : ()I
    //   612: aload_1
    //   613: invokevirtual getDataLength : ()I
    //   616: iadd
    //   617: invokevirtual position : (I)Ljava/nio/Buffer;
    //   620: pop
    //   621: aload_1
    //   622: invokevirtual getLength : ()I
    //   625: istore_3
    //   626: iload_2
    //   627: iload_3
    //   628: iadd
    //   629: istore_2
    //   630: goto -> 536
    //   633: aload #7
    //   635: invokevirtual close : ()V
    //   638: aload #8
    //   640: areturn
    //   641: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   644: astore_1
    //   645: aload_1
    //   646: ldc_w 'This file does not appear to be an Mp4 file'
    //   649: invokespecial <init> : (Ljava/lang/String;)V
    //   652: aload_1
    //   653: athrow
    //   654: aload #7
    //   656: ifnull -> 675
    //   659: aload #7
    //   661: invokevirtual close : ()V
    //   664: goto -> 675
    //   667: astore #6
    //   669: aload_1
    //   670: aload #6
    //   672: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   675: aload_1
    //   676: athrow
    // Exception table:
    //   from	to	target	type
    //   8	30	240	finally
    //   34	72	240	finally
    //   80	105	240	finally
    //   109	182	240	finally
    //   192	235	240	finally
    //   250	281	240	finally
    //   289	298	240	finally
    //   315	334	240	finally
    //   338	347	240	finally
    //   355	386	240	finally
    //   394	403	240	finally
    //   411	534	240	finally
    //   542	626	240	finally
    //   641	654	240	finally
    //   659	664	667	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4TagReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */