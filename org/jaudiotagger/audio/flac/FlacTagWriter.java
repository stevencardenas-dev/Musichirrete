package org.jaudiotagger.audio.flac;

import c61;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.jaudiotagger.audio.flac.metadatablock.BlockType;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlock;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockDataPadding;
import org.jaudiotagger.audio.flac.metadatablock.MetadataBlockHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.flac.FlacTag;
import ui0;

public class FlacTagWriter {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
  
  private FlacTagCreator tc = new FlacTagCreator();
  
  private void insertUsingChunks(c61 paramc61, Tag paramTag, FileChannel paramFileChannel, MetadataBlockInfo paramMetadataBlockInfo, FlacStreamReader paramFlacStreamReader, int paramInt1, int paramInt2) {
    long l = (paramFlacStreamReader.getStartOfFlacInFile() + 42 + paramInt2);
    paramInt1 -= paramInt2;
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramc61);
    stringBuilder.append(KjdXPYm.pEBoETCGv);
    stringBuilder.append(paramInt1);
    logger.config(stringBuilder.toString());
    paramFileChannel.position(l);
    ui0.i0(paramFileChannel, paramInt1);
    paramFileChannel.position((paramFlacStreamReader.getStartOfFlacInFile() + 4));
    writeAllNonAudioData(paramTag, paramFileChannel, paramMetadataBlockInfo, paramFlacStreamReader, 4000);
  }
  
  private void writeAllNonAudioData(Tag paramTag, FileChannel paramFileChannel, MetadataBlockInfo paramMetadataBlockInfo, FlacStreamReader paramFlacStreamReader, int paramInt) {
    boolean bool;
    paramFileChannel.position((paramFlacStreamReader.getStartOfFlacInFile() + 4));
    writeStreamBlock(paramFileChannel, paramMetadataBlockInfo);
    FlacTagCreator flacTagCreator = this.tc;
    byte b = 0;
    if (paramInt > 0 || MetadataBlockInfo.g(paramMetadataBlockInfo, paramMetadataBlockInfo) > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramFileChannel.write(flacTagCreator.convertMetadata(paramTag, bool));
    List<MetadataBlock> list = paramMetadataBlockInfo.getListOfNonMetadataBlocks();
    if (list.size() > 1)
      while (b < list.size() - 1) {
        paramFileChannel.write(ByteBuffer.wrap(((MetadataBlock)list.get(b)).getHeader().getBytesWithoutIsLastBlockFlag()));
        paramFileChannel.write(((MetadataBlock)list.get(b)).getData().getBytes());
        b++;
      }  
    if (list.size() > 0) {
      if (paramInt > 0) {
        paramFileChannel.write(ByteBuffer.wrap(((MetadataBlock)list.get(list.size() - 1)).getHeader().getBytesWithoutIsLastBlockFlag()));
      } else {
        paramFileChannel.write(ByteBuffer.wrap(((MetadataBlock)list.get(list.size() - 1)).getHeader().getBytesWithLastBlockFlag()));
      } 
      paramFileChannel.write(((MetadataBlock)list.get(list.size() - 1)).getData().getBytes());
    } 
    if (paramInt > 0)
      paramFileChannel.write(addPaddingBlock(paramInt)); 
  }
  
  private void writeStreamBlock(FileChannel paramFileChannel, MetadataBlockInfo paramMetadataBlockInfo) {
    paramFileChannel.write(ByteBuffer.wrap(MetadataBlockInfo.e(paramMetadataBlockInfo).getHeader().getBytesWithoutIsLastBlockFlag()));
    paramFileChannel.write(MetadataBlockInfo.e(paramMetadataBlockInfo).getData().getBytes());
  }
  
  public ByteBuffer addPaddingBlock(int paramInt) {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("padding:");
    stringBuilder.append(paramInt);
    logger.config(stringBuilder.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt);
    if (paramInt > 0) {
      paramInt -= 4;
      MetadataBlockHeader metadataBlockHeader = new MetadataBlockHeader(true, BlockType.PADDING, paramInt);
      MetadataBlockDataPadding metadataBlockDataPadding = new MetadataBlockDataPadding(paramInt);
      byteBuffer.put(metadataBlockHeader.getBytes());
      byteBuffer.put(metadataBlockDataPadding.getBytes());
      byteBuffer.rewind();
    } 
    return byteBuffer;
  }
  
  public void delete(Tag paramTag, c61 paramc61) {
    write((Tag)new FlacTag(null, new ArrayList()), paramc61);
  }
  
  public void write(Tag paramTag, c61 paramc61) {
    // Byte code:
    //   0: getstatic org/jaudiotagger/audio/flac/FlacTagWriter.logger : Ljava/util/logging/Logger;
    //   3: astore #7
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #8
    //   14: aload #8
    //   16: aload_2
    //   17: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: aload #8
    //   23: ldc ' Writing tag'
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload #7
    //   31: aload #8
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokevirtual config : (Ljava/lang/String;)V
    //   39: aconst_null
    //   40: astore #11
    //   42: aconst_null
    //   43: astore #9
    //   45: aconst_null
    //   46: astore #7
    //   48: aconst_null
    //   49: astore #8
    //   51: aload_2
    //   52: ldc 'rw'
    //   54: invokevirtual b : (Ljava/lang/String;)Ljava/nio/channels/FileChannel;
    //   57: astore #10
    //   59: aload #11
    //   61: astore #9
    //   63: aload #10
    //   65: aload_2
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: invokestatic B : (Ljava/nio/channels/FileChannel;Ljava/lang/String;)Ljava/nio/channels/FileLock;
    //   72: astore #7
    //   74: aload #7
    //   76: astore #8
    //   78: aload #7
    //   80: astore #9
    //   82: new org/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo
    //   85: astore #12
    //   87: iconst_0
    //   88: istore #6
    //   90: aload #7
    //   92: astore #8
    //   94: aload #7
    //   96: astore #9
    //   98: aload #12
    //   100: iconst_0
    //   101: invokespecial <init> : (I)V
    //   104: aload #7
    //   106: astore #8
    //   108: aload #7
    //   110: astore #9
    //   112: new org/jaudiotagger/audio/flac/FlacStreamReader
    //   115: astore #11
    //   117: aload #7
    //   119: astore #8
    //   121: aload #7
    //   123: astore #9
    //   125: new java/lang/StringBuilder
    //   128: astore #13
    //   130: aload #7
    //   132: astore #8
    //   134: aload #7
    //   136: astore #9
    //   138: aload #13
    //   140: invokespecial <init> : ()V
    //   143: aload #7
    //   145: astore #8
    //   147: aload #7
    //   149: astore #9
    //   151: aload #13
    //   153: aload_2
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload #7
    //   163: astore #8
    //   165: aload #7
    //   167: astore #9
    //   169: aload #13
    //   171: getstatic androidx/profileinstaller/Vuyf/nBRIsU.XjMxkHcrOcVhZrc : Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload #7
    //   180: astore #8
    //   182: aload #7
    //   184: astore #9
    //   186: aload #11
    //   188: aload #10
    //   190: aload #13
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: invokespecial <init> : (Ljava/nio/channels/FileChannel;Ljava/lang/String;)V
    //   198: aload #7
    //   200: astore #8
    //   202: aload #7
    //   204: astore #9
    //   206: aload #11
    //   208: invokevirtual findStream : ()V
    //   211: iload #6
    //   213: ifne -> 754
    //   216: aload #7
    //   218: astore #8
    //   220: aload #10
    //   222: invokestatic readHeader : (Ljava/nio/channels/FileChannel;)Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;
    //   225: astore #9
    //   227: aload #7
    //   229: astore #8
    //   231: aload #9
    //   233: invokevirtual getBlockType : ()Lorg/jaudiotagger/audio/flac/metadatablock/BlockType;
    //   236: ifnull -> 713
    //   239: aload #7
    //   241: astore #8
    //   243: getstatic org/jaudiotagger/audio/flac/FlacTagWriter$1.$SwitchMap$org$jaudiotagger$audio$flac$metadatablock$BlockType : [I
    //   246: aload #9
    //   248: invokevirtual getBlockType : ()Lorg/jaudiotagger/audio/flac/metadatablock/BlockType;
    //   251: invokevirtual ordinal : ()I
    //   254: iaload
    //   255: tableswitch default -> 296, 1 -> 658, 2 -> 563, 3 -> 563, 4 -> 563, 5 -> 491, 6 -> 419, 7 -> 347
    //   296: aload #7
    //   298: astore #8
    //   300: aload #10
    //   302: aload #10
    //   304: invokevirtual position : ()J
    //   307: aload #9
    //   309: invokevirtual getDataLength : ()I
    //   312: i2l
    //   313: ladd
    //   314: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   317: pop
    //   318: goto -> 713
    //   321: astore_1
    //   322: aload #8
    //   324: astore #7
    //   326: aload_1
    //   327: astore_2
    //   328: aload #10
    //   330: astore_1
    //   331: goto -> 1439
    //   334: astore #8
    //   336: aload #10
    //   338: astore_1
    //   339: goto -> 1367
    //   342: astore #9
    //   344: goto -> 727
    //   347: aload #7
    //   349: astore #8
    //   351: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlockDataCueSheet
    //   354: astore #14
    //   356: aload #7
    //   358: astore #8
    //   360: aload #14
    //   362: aload #9
    //   364: aload #10
    //   366: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Ljava/nio/channels/FileChannel;)V
    //   369: aload #7
    //   371: astore #8
    //   373: aload #12
    //   375: invokestatic b : (Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;)Ljava/util/List;
    //   378: astore #15
    //   380: aload #7
    //   382: astore #8
    //   384: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlock
    //   387: astore #13
    //   389: aload #7
    //   391: astore #8
    //   393: aload #13
    //   395: aload #9
    //   397: aload #14
    //   399: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockData;)V
    //   402: aload #7
    //   404: astore #8
    //   406: aload #15
    //   408: aload #13
    //   410: invokeinterface add : (Ljava/lang/Object;)Z
    //   415: pop
    //   416: goto -> 713
    //   419: aload #7
    //   421: astore #8
    //   423: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlockDataSeekTable
    //   426: astore #13
    //   428: aload #7
    //   430: astore #8
    //   432: aload #13
    //   434: aload #9
    //   436: aload #10
    //   438: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Ljava/nio/channels/FileChannel;)V
    //   441: aload #7
    //   443: astore #8
    //   445: aload #12
    //   447: invokestatic d : (Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;)Ljava/util/List;
    //   450: astore #14
    //   452: aload #7
    //   454: astore #8
    //   456: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlock
    //   459: astore #15
    //   461: aload #7
    //   463: astore #8
    //   465: aload #15
    //   467: aload #9
    //   469: aload #13
    //   471: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockData;)V
    //   474: aload #7
    //   476: astore #8
    //   478: aload #14
    //   480: aload #15
    //   482: invokeinterface add : (Ljava/lang/Object;)Z
    //   487: pop
    //   488: goto -> 713
    //   491: aload #7
    //   493: astore #8
    //   495: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlockDataApplication
    //   498: astore #13
    //   500: aload #7
    //   502: astore #8
    //   504: aload #13
    //   506: aload #9
    //   508: aload #10
    //   510: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Ljava/nio/channels/FileChannel;)V
    //   513: aload #7
    //   515: astore #8
    //   517: aload #12
    //   519: invokestatic a : (Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;)Ljava/util/List;
    //   522: astore #15
    //   524: aload #7
    //   526: astore #8
    //   528: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlock
    //   531: astore #14
    //   533: aload #7
    //   535: astore #8
    //   537: aload #14
    //   539: aload #9
    //   541: aload #13
    //   543: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockData;)V
    //   546: aload #7
    //   548: astore #8
    //   550: aload #15
    //   552: aload #14
    //   554: invokeinterface add : (Ljava/lang/Object;)Z
    //   559: pop
    //   560: goto -> 713
    //   563: aload #7
    //   565: astore #8
    //   567: aload #10
    //   569: aload #10
    //   571: invokevirtual position : ()J
    //   574: aload #9
    //   576: invokevirtual getDataLength : ()I
    //   579: i2l
    //   580: ladd
    //   581: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   584: pop
    //   585: aload #7
    //   587: astore #8
    //   589: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlockDataPadding
    //   592: astore #13
    //   594: aload #7
    //   596: astore #8
    //   598: aload #13
    //   600: aload #9
    //   602: invokevirtual getDataLength : ()I
    //   605: invokespecial <init> : (I)V
    //   608: aload #7
    //   610: astore #8
    //   612: aload #12
    //   614: invokestatic c : (Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;)Ljava/util/List;
    //   617: astore #14
    //   619: aload #7
    //   621: astore #8
    //   623: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlock
    //   626: astore #15
    //   628: aload #7
    //   630: astore #8
    //   632: aload #15
    //   634: aload #9
    //   636: aload #13
    //   638: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockData;)V
    //   641: aload #7
    //   643: astore #8
    //   645: aload #14
    //   647: aload #15
    //   649: invokeinterface add : (Ljava/lang/Object;)Z
    //   654: pop
    //   655: goto -> 713
    //   658: aload #7
    //   660: astore #8
    //   662: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlock
    //   665: astore #13
    //   667: aload #7
    //   669: astore #8
    //   671: new org/jaudiotagger/audio/flac/metadatablock/MetadataBlockDataStreamInfo
    //   674: astore #14
    //   676: aload #7
    //   678: astore #8
    //   680: aload #14
    //   682: aload #9
    //   684: aload #10
    //   686: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Ljava/nio/channels/FileChannel;)V
    //   689: aload #7
    //   691: astore #8
    //   693: aload #13
    //   695: aload #9
    //   697: aload #14
    //   699: invokespecial <init> : (Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockHeader;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlockData;)V
    //   702: aload #7
    //   704: astore #8
    //   706: aload #12
    //   708: aload #13
    //   710: invokestatic f : (Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;Lorg/jaudiotagger/audio/flac/metadatablock/MetadataBlock;)V
    //   713: aload #7
    //   715: astore #8
    //   717: aload #9
    //   719: invokevirtual isLastBlock : ()Z
    //   722: istore #6
    //   724: goto -> 211
    //   727: aload #7
    //   729: astore #8
    //   731: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   734: astore_1
    //   735: aload #7
    //   737: astore #8
    //   739: aload_1
    //   740: aload #9
    //   742: invokevirtual getMessage : ()Ljava/lang/String;
    //   745: invokespecial <init> : (Ljava/lang/String;)V
    //   748: aload #7
    //   750: astore #8
    //   752: aload_1
    //   753: athrow
    //   754: aload #7
    //   756: astore #8
    //   758: aload #7
    //   760: astore #9
    //   762: aload #12
    //   764: invokevirtual computeAvailableRoom : ()I
    //   767: istore #5
    //   769: aload #7
    //   771: astore #8
    //   773: aload #7
    //   775: astore #9
    //   777: aload_0
    //   778: getfield tc : Lorg/jaudiotagger/audio/flac/FlacTagCreator;
    //   781: aload_1
    //   782: invokevirtual convertMetadata : (Lorg/jaudiotagger/tag/Tag;)Ljava/nio/ByteBuffer;
    //   785: invokevirtual limit : ()I
    //   788: istore #4
    //   790: aload #7
    //   792: astore #8
    //   794: aload #7
    //   796: astore #9
    //   798: aload #12
    //   800: invokevirtual computeNeededRoom : ()I
    //   803: iload #4
    //   805: iadd
    //   806: istore_3
    //   807: aload #7
    //   809: astore #8
    //   811: aload #7
    //   813: astore #9
    //   815: aload #10
    //   817: aload #11
    //   819: invokevirtual getStartOfFlacInFile : ()I
    //   822: i2l
    //   823: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   826: pop
    //   827: aload #7
    //   829: astore #8
    //   831: aload #7
    //   833: astore #9
    //   835: getstatic org/jaudiotagger/audio/flac/FlacTagWriter.logger : Ljava/util/logging/Logger;
    //   838: astore #13
    //   840: aload #7
    //   842: astore #8
    //   844: aload #7
    //   846: astore #9
    //   848: new java/lang/StringBuilder
    //   851: astore #14
    //   853: aload #7
    //   855: astore #8
    //   857: aload #7
    //   859: astore #9
    //   861: aload #14
    //   863: invokespecial <init> : ()V
    //   866: aload #7
    //   868: astore #8
    //   870: aload #7
    //   872: astore #9
    //   874: aload #14
    //   876: aload_2
    //   877: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   880: pop
    //   881: aload #7
    //   883: astore #8
    //   885: aload #7
    //   887: astore #9
    //   889: aload #14
    //   891: ldc_w ':Writing tag available bytes:'
    //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: pop
    //   898: aload #7
    //   900: astore #8
    //   902: aload #7
    //   904: astore #9
    //   906: aload #14
    //   908: iload #5
    //   910: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   913: pop
    //   914: aload #7
    //   916: astore #8
    //   918: aload #7
    //   920: astore #9
    //   922: aload #14
    //   924: ldc_w ':needed bytes:'
    //   927: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: pop
    //   931: aload #7
    //   933: astore #8
    //   935: aload #7
    //   937: astore #9
    //   939: aload #14
    //   941: iload_3
    //   942: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   945: pop
    //   946: aload #7
    //   948: astore #8
    //   950: aload #7
    //   952: astore #9
    //   954: aload #13
    //   956: aload #14
    //   958: invokevirtual toString : ()Ljava/lang/String;
    //   961: invokevirtual config : (Ljava/lang/String;)V
    //   964: iload #5
    //   966: iload_3
    //   967: if_icmpeq -> 978
    //   970: iload #5
    //   972: iload_3
    //   973: iconst_4
    //   974: iadd
    //   975: if_icmple -> 981
    //   978: goto -> 1195
    //   981: aload #7
    //   983: astore #8
    //   985: aload #7
    //   987: astore #9
    //   989: getstatic org/jaudiotagger/audio/flac/FlacTagWriter.logger : Ljava/util/logging/Logger;
    //   992: astore #13
    //   994: aload #7
    //   996: astore #8
    //   998: aload #7
    //   1000: astore #9
    //   1002: new java/lang/StringBuilder
    //   1005: astore #14
    //   1007: aload #7
    //   1009: astore #8
    //   1011: aload #7
    //   1013: astore #9
    //   1015: aload #14
    //   1017: invokespecial <init> : ()V
    //   1020: aload #7
    //   1022: astore #8
    //   1024: aload #7
    //   1026: astore #9
    //   1028: aload #14
    //   1030: aload_2
    //   1031: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1034: pop
    //   1035: aload #7
    //   1037: astore #8
    //   1039: aload #7
    //   1041: astore #9
    //   1043: aload #14
    //   1045: ldc_w ':Audio must be shifted NewTagSize:'
    //   1048: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1051: pop
    //   1052: aload #7
    //   1054: astore #8
    //   1056: aload #7
    //   1058: astore #9
    //   1060: aload #14
    //   1062: iload #4
    //   1064: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1067: pop
    //   1068: aload #7
    //   1070: astore #8
    //   1072: aload #7
    //   1074: astore #9
    //   1076: aload #14
    //   1078: ldc_w ':AvailableRoom:'
    //   1081: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1084: pop
    //   1085: aload #7
    //   1087: astore #8
    //   1089: aload #7
    //   1091: astore #9
    //   1093: aload #14
    //   1095: iload #5
    //   1097: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1100: pop
    //   1101: aload #7
    //   1103: astore #8
    //   1105: aload #7
    //   1107: astore #9
    //   1109: aload #14
    //   1111: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.ewL : Ljava/lang/String;
    //   1114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1117: pop
    //   1118: aload #7
    //   1120: astore #8
    //   1122: aload #7
    //   1124: astore #9
    //   1126: aload #14
    //   1128: iload_3
    //   1129: iload #5
    //   1131: isub
    //   1132: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1135: pop
    //   1136: aload #7
    //   1138: astore #8
    //   1140: aload #7
    //   1142: astore #9
    //   1144: aload #13
    //   1146: aload #14
    //   1148: invokevirtual toString : ()Ljava/lang/String;
    //   1151: invokevirtual config : (Ljava/lang/String;)V
    //   1154: aload_0
    //   1155: aload_2
    //   1156: aload_1
    //   1157: aload #10
    //   1159: aload #12
    //   1161: aload #11
    //   1163: iload_3
    //   1164: sipush #4000
    //   1167: iadd
    //   1168: iload #5
    //   1170: invokespecial insertUsingChunks : (Lc61;Lorg/jaudiotagger/tag/Tag;Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;Lorg/jaudiotagger/audio/flac/FlacStreamReader;II)V
    //   1173: goto -> 1279
    //   1176: astore_1
    //   1177: goto -> 326
    //   1180: astore_1
    //   1181: aload_1
    //   1182: astore #8
    //   1184: goto -> 336
    //   1187: astore_1
    //   1188: aload #9
    //   1190: astore #7
    //   1192: goto -> 1181
    //   1195: aload #7
    //   1197: astore #8
    //   1199: getstatic org/jaudiotagger/audio/flac/FlacTagWriter.logger : Ljava/util/logging/Logger;
    //   1202: astore #13
    //   1204: aload #7
    //   1206: astore #8
    //   1208: new java/lang/StringBuilder
    //   1211: astore #9
    //   1213: aload #7
    //   1215: astore #8
    //   1217: aload #9
    //   1219: invokespecial <init> : ()V
    //   1222: aload #7
    //   1224: astore #8
    //   1226: aload #9
    //   1228: aload_2
    //   1229: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1232: pop
    //   1233: aload #7
    //   1235: astore #8
    //   1237: aload #9
    //   1239: ldc_w ':Room to Rewrite'
    //   1242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1245: pop
    //   1246: aload #7
    //   1248: astore #8
    //   1250: aload #13
    //   1252: aload #9
    //   1254: invokevirtual toString : ()Ljava/lang/String;
    //   1257: invokevirtual config : (Ljava/lang/String;)V
    //   1260: aload #7
    //   1262: astore #8
    //   1264: aload_0
    //   1265: aload_1
    //   1266: aload #10
    //   1268: aload #12
    //   1270: aload #11
    //   1272: iload #5
    //   1274: iload_3
    //   1275: isub
    //   1276: invokespecial writeAllNonAudioData : (Lorg/jaudiotagger/tag/Tag;Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/audio/flac/FlacTagWriter$MetadataBlockInfo;Lorg/jaudiotagger/audio/flac/FlacStreamReader;I)V
    //   1279: aload #7
    //   1281: ifnull -> 1297
    //   1284: aload #7
    //   1286: invokevirtual release : ()V
    //   1289: goto -> 1297
    //   1292: astore_1
    //   1293: aload_1
    //   1294: invokevirtual printStackTrace : ()V
    //   1297: aload #10
    //   1299: invokevirtual close : ()V
    //   1302: goto -> 1310
    //   1305: astore_1
    //   1306: aload_1
    //   1307: invokevirtual printStackTrace : ()V
    //   1310: return
    //   1311: astore_1
    //   1312: goto -> 1181
    //   1315: astore_1
    //   1316: aload #7
    //   1318: astore #8
    //   1320: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   1323: astore #9
    //   1325: aload #7
    //   1327: astore #8
    //   1329: aload #9
    //   1331: aload_1
    //   1332: invokevirtual getMessage : ()Ljava/lang/String;
    //   1335: invokespecial <init> : (Ljava/lang/String;)V
    //   1338: aload #7
    //   1340: astore #8
    //   1342: aload #9
    //   1344: athrow
    //   1345: astore_2
    //   1346: aconst_null
    //   1347: astore #8
    //   1349: aload #7
    //   1351: astore_1
    //   1352: aload #8
    //   1354: astore #7
    //   1356: goto -> 1439
    //   1359: astore #8
    //   1361: aconst_null
    //   1362: astore #7
    //   1364: aload #9
    //   1366: astore_1
    //   1367: getstatic org/jaudiotagger/audio/flac/FlacTagWriter.logger : Ljava/util/logging/Logger;
    //   1370: getstatic java/util/logging/Level.SEVERE : Ljava/util/logging/Level;
    //   1373: aload #8
    //   1375: invokevirtual getMessage : ()Ljava/lang/String;
    //   1378: aload #8
    //   1380: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1383: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   1386: astore #10
    //   1388: new java/lang/StringBuilder
    //   1391: astore #9
    //   1393: aload #9
    //   1395: invokespecial <init> : ()V
    //   1398: aload #9
    //   1400: aload_2
    //   1401: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1404: pop
    //   1405: aload #9
    //   1407: ldc_w ':'
    //   1410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1413: pop
    //   1414: aload #9
    //   1416: aload #8
    //   1418: invokevirtual getMessage : ()Ljava/lang/String;
    //   1421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1424: pop
    //   1425: aload #10
    //   1427: aload #9
    //   1429: invokevirtual toString : ()Ljava/lang/String;
    //   1432: invokespecial <init> : (Ljava/lang/String;)V
    //   1435: aload #10
    //   1437: athrow
    //   1438: astore_2
    //   1439: aload_1
    //   1440: ifnull -> 1475
    //   1443: aload #7
    //   1445: ifnull -> 1463
    //   1448: aload #7
    //   1450: invokevirtual release : ()V
    //   1453: goto -> 1463
    //   1456: astore #7
    //   1458: aload #7
    //   1460: invokevirtual printStackTrace : ()V
    //   1463: aload_1
    //   1464: invokevirtual close : ()V
    //   1467: goto -> 1475
    //   1470: astore_1
    //   1471: aload_1
    //   1472: invokevirtual printStackTrace : ()V
    //   1475: aload_2
    //   1476: athrow
    // Exception table:
    //   from	to	target	type
    //   51	59	1359	java/io/IOException
    //   51	59	1345	finally
    //   63	74	1187	java/io/IOException
    //   63	74	321	finally
    //   82	87	1187	java/io/IOException
    //   82	87	321	finally
    //   98	104	1187	java/io/IOException
    //   98	104	321	finally
    //   112	117	1187	java/io/IOException
    //   112	117	321	finally
    //   125	130	1187	java/io/IOException
    //   125	130	321	finally
    //   138	143	1187	java/io/IOException
    //   138	143	321	finally
    //   151	161	1187	java/io/IOException
    //   151	161	321	finally
    //   169	178	1187	java/io/IOException
    //   169	178	321	finally
    //   186	198	1187	java/io/IOException
    //   186	198	321	finally
    //   206	211	1315	org/jaudiotagger/audio/exceptions/CannotReadException
    //   206	211	1187	java/io/IOException
    //   206	211	321	finally
    //   220	227	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   220	227	334	java/io/IOException
    //   220	227	321	finally
    //   231	239	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   231	239	334	java/io/IOException
    //   231	239	321	finally
    //   243	296	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   243	296	334	java/io/IOException
    //   243	296	321	finally
    //   300	318	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   300	318	334	java/io/IOException
    //   300	318	321	finally
    //   351	356	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   351	356	334	java/io/IOException
    //   351	356	321	finally
    //   360	369	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   360	369	334	java/io/IOException
    //   360	369	321	finally
    //   373	380	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   373	380	334	java/io/IOException
    //   373	380	321	finally
    //   384	389	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   384	389	334	java/io/IOException
    //   384	389	321	finally
    //   393	402	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   393	402	334	java/io/IOException
    //   393	402	321	finally
    //   406	416	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   406	416	334	java/io/IOException
    //   406	416	321	finally
    //   423	428	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   423	428	334	java/io/IOException
    //   423	428	321	finally
    //   432	441	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   432	441	334	java/io/IOException
    //   432	441	321	finally
    //   445	452	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   445	452	334	java/io/IOException
    //   445	452	321	finally
    //   456	461	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   456	461	334	java/io/IOException
    //   456	461	321	finally
    //   465	474	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   465	474	334	java/io/IOException
    //   465	474	321	finally
    //   478	488	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   478	488	334	java/io/IOException
    //   478	488	321	finally
    //   495	500	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   495	500	334	java/io/IOException
    //   495	500	321	finally
    //   504	513	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   504	513	334	java/io/IOException
    //   504	513	321	finally
    //   517	524	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   517	524	334	java/io/IOException
    //   517	524	321	finally
    //   528	533	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   528	533	334	java/io/IOException
    //   528	533	321	finally
    //   537	546	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   537	546	334	java/io/IOException
    //   537	546	321	finally
    //   550	560	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   550	560	334	java/io/IOException
    //   550	560	321	finally
    //   567	585	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   567	585	334	java/io/IOException
    //   567	585	321	finally
    //   589	594	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   589	594	334	java/io/IOException
    //   589	594	321	finally
    //   598	608	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   598	608	334	java/io/IOException
    //   598	608	321	finally
    //   612	619	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   612	619	334	java/io/IOException
    //   612	619	321	finally
    //   623	628	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   623	628	334	java/io/IOException
    //   623	628	321	finally
    //   632	641	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   632	641	334	java/io/IOException
    //   632	641	321	finally
    //   645	655	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   645	655	334	java/io/IOException
    //   645	655	321	finally
    //   662	667	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   662	667	334	java/io/IOException
    //   662	667	321	finally
    //   671	676	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   671	676	334	java/io/IOException
    //   671	676	321	finally
    //   680	689	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   680	689	334	java/io/IOException
    //   680	689	321	finally
    //   693	702	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   693	702	334	java/io/IOException
    //   693	702	321	finally
    //   706	713	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   706	713	334	java/io/IOException
    //   706	713	321	finally
    //   717	724	342	org/jaudiotagger/audio/exceptions/CannotReadException
    //   717	724	334	java/io/IOException
    //   717	724	321	finally
    //   731	735	334	java/io/IOException
    //   731	735	321	finally
    //   739	748	334	java/io/IOException
    //   739	748	321	finally
    //   752	754	334	java/io/IOException
    //   752	754	321	finally
    //   762	769	1187	java/io/IOException
    //   762	769	321	finally
    //   777	790	1187	java/io/IOException
    //   777	790	321	finally
    //   798	807	1187	java/io/IOException
    //   798	807	321	finally
    //   815	827	1187	java/io/IOException
    //   815	827	321	finally
    //   835	840	1187	java/io/IOException
    //   835	840	321	finally
    //   848	853	1187	java/io/IOException
    //   848	853	321	finally
    //   861	866	1187	java/io/IOException
    //   861	866	321	finally
    //   874	881	1187	java/io/IOException
    //   874	881	321	finally
    //   889	898	1187	java/io/IOException
    //   889	898	321	finally
    //   906	914	1187	java/io/IOException
    //   906	914	321	finally
    //   922	931	1187	java/io/IOException
    //   922	931	321	finally
    //   939	946	1187	java/io/IOException
    //   939	946	321	finally
    //   954	964	1187	java/io/IOException
    //   954	964	321	finally
    //   989	994	1187	java/io/IOException
    //   989	994	321	finally
    //   1002	1007	1187	java/io/IOException
    //   1002	1007	321	finally
    //   1015	1020	1187	java/io/IOException
    //   1015	1020	321	finally
    //   1028	1035	1187	java/io/IOException
    //   1028	1035	321	finally
    //   1043	1052	1187	java/io/IOException
    //   1043	1052	321	finally
    //   1060	1068	1187	java/io/IOException
    //   1060	1068	321	finally
    //   1076	1085	1187	java/io/IOException
    //   1076	1085	321	finally
    //   1093	1101	1187	java/io/IOException
    //   1093	1101	321	finally
    //   1109	1118	1187	java/io/IOException
    //   1109	1118	321	finally
    //   1126	1136	1187	java/io/IOException
    //   1126	1136	321	finally
    //   1144	1154	1187	java/io/IOException
    //   1144	1154	321	finally
    //   1154	1173	1180	java/io/IOException
    //   1154	1173	1176	finally
    //   1199	1204	1311	java/io/IOException
    //   1199	1204	321	finally
    //   1208	1213	1311	java/io/IOException
    //   1208	1213	321	finally
    //   1217	1222	1311	java/io/IOException
    //   1217	1222	321	finally
    //   1226	1233	1311	java/io/IOException
    //   1226	1233	321	finally
    //   1237	1246	1311	java/io/IOException
    //   1237	1246	321	finally
    //   1250	1260	1311	java/io/IOException
    //   1250	1260	321	finally
    //   1264	1279	1311	java/io/IOException
    //   1264	1279	321	finally
    //   1284	1289	1292	java/io/IOException
    //   1297	1302	1305	java/io/IOException
    //   1320	1325	1311	java/io/IOException
    //   1320	1325	321	finally
    //   1329	1338	1311	java/io/IOException
    //   1329	1338	321	finally
    //   1342	1345	1311	java/io/IOException
    //   1342	1345	321	finally
    //   1367	1438	1438	finally
    //   1448	1453	1456	java/io/IOException
    //   1463	1467	1470	java/io/IOException
  }
  
  public static class MetadataBlockInfo {
    private List<MetadataBlock> blocks = new ArrayList<MetadataBlock>();
    
    private List<MetadataBlock> metadataBlockApplication = new ArrayList<MetadataBlock>(1);
    
    private List<MetadataBlock> metadataBlockCueSheet = new ArrayList<MetadataBlock>(1);
    
    private List<MetadataBlock> metadataBlockPadding = new ArrayList<MetadataBlock>(1);
    
    private List<MetadataBlock> metadataBlockSeekTable = new ArrayList<MetadataBlock>(1);
    
    private MetadataBlock streamInfoBlock;
    
    private MetadataBlockInfo() {}
    
    private int getOtherBlockCount(MetadataBlockInfo param1MetadataBlockInfo) {
      int i = param1MetadataBlockInfo.metadataBlockApplication.size();
      int j = param1MetadataBlockInfo.metadataBlockSeekTable.size();
      return param1MetadataBlockInfo.metadataBlockCueSheet.size() + j + i;
    }
    
    public int computeAvailableRoom() {
      Iterator<MetadataBlock> iterator = this.metadataBlockApplication.iterator();
      int i;
      for (i = 0; iterator.hasNext(); i += ((MetadataBlock)iterator.next()).getLength());
      iterator = this.metadataBlockSeekTable.iterator();
      while (iterator.hasNext())
        i += ((MetadataBlock)iterator.next()).getLength(); 
      iterator = this.metadataBlockCueSheet.iterator();
      while (iterator.hasNext())
        i += ((MetadataBlock)iterator.next()).getLength(); 
      iterator = this.metadataBlockPadding.iterator();
      while (iterator.hasNext())
        i += ((MetadataBlock)iterator.next()).getLength(); 
      return i;
    }
    
    public int computeNeededRoom() {
      Iterator<MetadataBlock> iterator = this.metadataBlockApplication.iterator();
      int i;
      for (i = 0; iterator.hasNext(); i += ((MetadataBlock)iterator.next()).getLength());
      iterator = this.metadataBlockSeekTable.iterator();
      while (iterator.hasNext())
        i += ((MetadataBlock)iterator.next()).getLength(); 
      iterator = this.metadataBlockCueSheet.iterator();
      while (iterator.hasNext())
        i += ((MetadataBlock)iterator.next()).getLength(); 
      return i;
    }
    
    public List<MetadataBlock> getListOfNonMetadataBlocks() {
      for (MetadataBlock metadataBlock : this.metadataBlockSeekTable)
        this.blocks.add(metadataBlock); 
      for (MetadataBlock metadataBlock : this.metadataBlockCueSheet)
        this.blocks.add(metadataBlock); 
      for (MetadataBlock metadataBlock : this.metadataBlockApplication)
        this.blocks.add(metadataBlock); 
      return this.blocks;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\FlacTagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */