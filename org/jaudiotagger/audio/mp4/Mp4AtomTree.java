package org.jaudiotagger.audio.mp4;

import ga1;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.NullBoxIdException;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.audio.mp4.atom.Mp4MetaBox;
import org.jaudiotagger.audio.mp4.atom.Mp4StcoBox;
import qw;
import rw;
import sx;
import u00;
import uc1;

public class Mp4AtomTree {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.mp4");
  
  private sx dataTree;
  
  private List<rw> freeNodes = new ArrayList<rw>();
  
  private rw hdlrWithinMdiaNode;
  
  private rw hdlrWithinMetaNode;
  
  private rw ilstNode;
  
  private rw mdatNode;
  
  private List<rw> mdatNodes = new ArrayList<rw>();
  
  private rw metaNode;
  
  private ByteBuffer moovBuffer;
  
  private Mp4BoxHeader moovHeader;
  
  private rw moovNode;
  
  private rw rootNode;
  
  private List<rw> stcoNodes = new ArrayList<rw>();
  
  private List<Mp4StcoBox> stcos = new ArrayList<Mp4StcoBox>();
  
  private rw tagsNode;
  
  private List<rw> trakNodes = new ArrayList<rw>();
  
  private rw udtaNode;
  
  public Mp4AtomTree(FileChannel paramFileChannel, boolean paramBoolean) {
    buildTree(paramFileChannel, paramBoolean);
  }
  
  public Mp4AtomTree(u00 paramu00) {
    buildTree((new uc1(paramu00, "rw")).a(), true);
  }
  
  public Mp4AtomTree(u00 paramu00, boolean paramBoolean) {
    buildTree((new uc1(paramu00, "rw")).a(), paramBoolean);
  }
  
  public void buildChildrenOfNode(ByteBuffer paramByteBuffer, rw paramrw) {
    Mp4BoxHeader mp4BoxHeader = (Mp4BoxHeader)paramrw.e;
    int j = paramByteBuffer.position();
    if (mp4BoxHeader.getId().equals(Mp4AtomIdentifier.META.getFieldName())) {
      (new Mp4MetaBox(mp4BoxHeader, paramByteBuffer)).processData();
      try {
        paramByteBuffer.position(paramByteBuffer.position() - 8);
      } catch (NullBoxIdException nullBoxIdException) {
        paramByteBuffer.position(paramByteBuffer.position() - 4);
        paramByteBuffer.position(paramByteBuffer.position() - 8);
      } finally {}
    } 
    int i = paramByteBuffer.position();
    while (paramByteBuffer.position() < mp4BoxHeader.getDataLength() + i - 8) {
      Mp4BoxHeader mp4BoxHeader1 = new Mp4BoxHeader(paramByteBuffer);
      mp4BoxHeader1.setFilePos(this.moovHeader.getFilePos() + paramByteBuffer.position());
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder("Atom ");
      stringBuilder.append(mp4BoxHeader1.getId());
      stringBuilder.append(" @ ");
      stringBuilder.append(mp4BoxHeader1.getFilePos());
      stringBuilder.append(" of size:");
      stringBuilder.append(mp4BoxHeader1.getLength());
      stringBuilder.append(" ,ends @ ");
      stringBuilder.append(mp4BoxHeader1.getFilePos() + mp4BoxHeader1.getLength());
      logger.finest(stringBuilder.toString());
      rw rw1 = new rw(mp4BoxHeader1);
      paramrw.a(rw1);
      String str = mp4BoxHeader1.getId();
      Mp4AtomIdentifier mp4AtomIdentifier = Mp4AtomIdentifier.UDTA;
      if (str.equals(mp4AtomIdentifier.getFieldName())) {
        this.udtaNode = rw1;
      } else {
        String str1 = mp4BoxHeader1.getId();
        Mp4AtomIdentifier mp4AtomIdentifier1 = Mp4AtomIdentifier.META;
        if (str1.equals(mp4AtomIdentifier1.getFieldName()) && mp4BoxHeader.getId().equals(mp4AtomIdentifier.getFieldName())) {
          this.metaNode = rw1;
        } else {
          String str2 = mp4BoxHeader1.getId();
          Mp4AtomIdentifier mp4AtomIdentifier2 = Mp4AtomIdentifier.HDLR;
          if (str2.equals(mp4AtomIdentifier2.getFieldName()) && mp4BoxHeader.getId().equals(mp4AtomIdentifier1.getFieldName())) {
            this.hdlrWithinMetaNode = rw1;
          } else if (mp4BoxHeader1.getId().equals(mp4AtomIdentifier2.getFieldName())) {
            this.hdlrWithinMdiaNode = rw1;
          } else if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.TAGS.getFieldName())) {
            this.tagsNode = rw1;
          } else if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.STCO.getFieldName())) {
            this.stcos.add(new Mp4StcoBox(mp4BoxHeader1, paramByteBuffer));
            this.stcoNodes.add(rw1);
          } else if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.ILST.getFieldName())) {
            rw rw2 = paramrw.b;
            if (rw2 != null) {
              Mp4BoxHeader mp4BoxHeader2 = (Mp4BoxHeader)rw2.e;
              if (mp4BoxHeader2 != null && mp4BoxHeader.getId().equals(mp4AtomIdentifier1.getFieldName()) && mp4BoxHeader2.getId().equals(mp4AtomIdentifier.getFieldName()))
                this.ilstNode = rw1; 
            } 
          } else if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.FREE.getFieldName())) {
            this.freeNodes.add(rw1);
          } else if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.TRAK.getFieldName())) {
            this.trakNodes.add(rw1);
          } 
        } 
      } 
      if (mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.TRAK.getFieldName()) || mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.MDIA.getFieldName()) || mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.MINF.getFieldName()) || mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.STBL.getFieldName()) || mp4BoxHeader1.getId().equals(mp4AtomIdentifier.getFieldName()) || mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.META.getFieldName()) || mp4BoxHeader1.getId().equals(Mp4AtomIdentifier.ILST.getFieldName()))
        buildChildrenOfNode(paramByteBuffer, rw1); 
      int k = paramByteBuffer.position();
      paramByteBuffer.position(mp4BoxHeader1.getDataLength() + k);
    } 
    paramByteBuffer.position(j);
  }
  
  public sx buildTree(FileChannel paramFileChannel, boolean paramBoolean) {
    // Byte code:
    //   0: lconst_0
    //   1: lstore #6
    //   3: aload_1
    //   4: lconst_0
    //   5: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   8: pop
    //   9: new rw
    //   12: astore #10
    //   14: aload #10
    //   16: aconst_null
    //   17: invokespecial <init> : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;)V
    //   20: aload_0
    //   21: aload #10
    //   23: putfield rootNode : Lrw;
    //   26: new sx
    //   29: astore #10
    //   31: aload #10
    //   33: invokespecial <init> : ()V
    //   36: aload_0
    //   37: aload #10
    //   39: putfield dataTree : Lsx;
    //   42: bipush #8
    //   44: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   47: astore #10
    //   49: aload_1
    //   50: invokevirtual position : ()J
    //   53: aload_1
    //   54: invokevirtual size : ()J
    //   57: ldc2_w 8
    //   60: lsub
    //   61: lcmp
    //   62: ifge -> 210
    //   65: new org/jaudiotagger/audio/mp4/atom/Mp4BoxHeader
    //   68: astore #12
    //   70: aload #12
    //   72: invokespecial <init> : ()V
    //   75: aload #10
    //   77: invokevirtual clear : ()Ljava/nio/Buffer;
    //   80: pop
    //   81: aload_1
    //   82: aload #10
    //   84: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   87: pop
    //   88: aload #10
    //   90: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   93: pop
    //   94: iconst_0
    //   95: istore #5
    //   97: iconst_0
    //   98: istore #4
    //   100: aload #12
    //   102: aload #10
    //   104: invokevirtual update : (Ljava/nio/ByteBuffer;)V
    //   107: aload #12
    //   109: aload_1
    //   110: invokevirtual position : ()J
    //   113: ldc2_w 8
    //   116: lsub
    //   117: invokevirtual setFilePos : (J)V
    //   120: new rw
    //   123: astore #11
    //   125: aload #11
    //   127: aload #12
    //   129: invokespecial <init> : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;)V
    //   132: aload #12
    //   134: invokevirtual getId : ()Ljava/lang/String;
    //   137: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.MOOV : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   140: invokevirtual getFieldName : ()Ljava/lang/String;
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifeq -> 349
    //   149: aload_0
    //   150: getfield moovNode : Lrw;
    //   153: ifnull -> 161
    //   156: iconst_1
    //   157: istore_3
    //   158: goto -> 163
    //   161: iconst_0
    //   162: istore_3
    //   163: aload_0
    //   164: getfield mdatNode : Lrw;
    //   167: ifnull -> 173
    //   170: iconst_1
    //   171: istore #4
    //   173: iload #4
    //   175: iload_3
    //   176: iand
    //   177: ifeq -> 218
    //   180: getstatic org/jaudiotagger/audio/mp4/Mp4AtomTree.logger : Ljava/util/logging/Logger;
    //   183: ldc_w 'Additional moov atom found at end of file starting at offset {0}'
    //   186: iconst_1
    //   187: anewarray java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload_1
    //   193: invokevirtual position : ()J
    //   196: ldc2_w 8
    //   199: lsub
    //   200: invokestatic valueOf : (J)Ljava/lang/Long;
    //   203: aastore
    //   204: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   207: invokevirtual warning : (Ljava/lang/String;)V
    //   210: goto -> 692
    //   213: astore #10
    //   215: goto -> 770
    //   218: aload_0
    //   219: aload #11
    //   221: putfield moovNode : Lrw;
    //   224: aload_0
    //   225: aload #12
    //   227: putfield moovHeader : Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   230: aload_1
    //   231: invokevirtual position : ()J
    //   234: lstore #8
    //   236: aload #12
    //   238: invokevirtual getDataLength : ()I
    //   241: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   244: astore #13
    //   246: aload_0
    //   247: aload #13
    //   249: putfield moovBuffer : Ljava/nio/ByteBuffer;
    //   252: aload_1
    //   253: aload #13
    //   255: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   258: istore_3
    //   259: iload_3
    //   260: aload #12
    //   262: invokevirtual getDataLength : ()I
    //   265: if_icmplt -> 296
    //   268: aload_0
    //   269: getfield moovBuffer : Ljava/nio/ByteBuffer;
    //   272: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   275: pop
    //   276: aload_0
    //   277: aload_0
    //   278: getfield moovBuffer : Ljava/nio/ByteBuffer;
    //   281: aload #11
    //   283: invokevirtual buildChildrenOfNode : (Ljava/nio/ByteBuffer;Lrw;)V
    //   286: aload_1
    //   287: lload #8
    //   289: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   292: pop
    //   293: goto -> 416
    //   296: ldc_w 'The atom {0} states its data length to be {1} but there are only {2} bytes remaining in the file'
    //   299: iconst_3
    //   300: anewarray java/lang/Object
    //   303: dup
    //   304: iconst_0
    //   305: aload #12
    //   307: invokevirtual getId : ()Ljava/lang/String;
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: aload #12
    //   315: invokevirtual getDataLength : ()I
    //   318: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   321: aastore
    //   322: dup
    //   323: iconst_2
    //   324: iload_3
    //   325: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   328: aastore
    //   329: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   332: astore #10
    //   334: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   337: astore #11
    //   339: aload #11
    //   341: aload #10
    //   343: invokespecial <init> : (Ljava/lang/String;)V
    //   346: aload #11
    //   348: athrow
    //   349: aload #12
    //   351: invokevirtual getId : ()Ljava/lang/String;
    //   354: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.FREE : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   357: invokevirtual getFieldName : ()Ljava/lang/String;
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifeq -> 381
    //   366: aload_0
    //   367: getfield freeNodes : Ljava/util/List;
    //   370: aload #11
    //   372: invokeinterface add : (Ljava/lang/Object;)Z
    //   377: pop
    //   378: goto -> 416
    //   381: aload #12
    //   383: invokevirtual getId : ()Ljava/lang/String;
    //   386: getstatic org/jaudiotagger/audio/mp4/Mp4AtomIdentifier.MDAT : Lorg/jaudiotagger/audio/mp4/Mp4AtomIdentifier;
    //   389: invokevirtual getFieldName : ()Ljava/lang/String;
    //   392: invokevirtual equals : (Ljava/lang/Object;)Z
    //   395: ifeq -> 416
    //   398: aload_0
    //   399: aload #11
    //   401: putfield mdatNode : Lrw;
    //   404: aload_0
    //   405: getfield mdatNodes : Ljava/util/List;
    //   408: aload #11
    //   410: invokeinterface add : (Ljava/lang/Object;)Z
    //   415: pop
    //   416: aload_0
    //   417: getfield rootNode : Lrw;
    //   420: aload #11
    //   422: invokevirtual a : (Lrw;)V
    //   425: aload #12
    //   427: invokevirtual getLength : ()I
    //   430: iconst_1
    //   431: if_icmpne -> 560
    //   434: bipush #8
    //   436: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   439: astore #11
    //   441: aload #11
    //   443: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   446: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   449: pop
    //   450: aload_1
    //   451: aload #11
    //   453: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   456: istore_3
    //   457: iload_3
    //   458: bipush #8
    //   460: if_icmpeq -> 491
    //   463: aload_0
    //   464: getfield mdatNode : Lrw;
    //   467: ifnull -> 480
    //   470: iload_2
    //   471: ifeq -> 528
    //   474: aload_1
    //   475: invokevirtual close : ()V
    //   478: aconst_null
    //   479: areturn
    //   480: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   483: dup
    //   484: ldc_w 'Unable to determine start of audio in file'
    //   487: invokespecial <init> : (Ljava/lang/String;)V
    //   490: athrow
    //   491: aload #11
    //   493: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   496: pop
    //   497: aload #11
    //   499: invokevirtual getLong : ()J
    //   502: lstore #8
    //   504: lload #8
    //   506: ldc2_w 8
    //   509: lcmp
    //   510: ifge -> 541
    //   513: aload_0
    //   514: getfield mdatNode : Lrw;
    //   517: ifnull -> 530
    //   520: iload_2
    //   521: ifeq -> 528
    //   524: aload_1
    //   525: invokevirtual close : ()V
    //   528: aconst_null
    //   529: areturn
    //   530: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   533: dup
    //   534: ldc_w 'Unable to determine start of audio in file'
    //   537: invokespecial <init> : (Ljava/lang/String;)V
    //   540: athrow
    //   541: aload_1
    //   542: aload_1
    //   543: invokevirtual position : ()J
    //   546: lload #8
    //   548: ladd
    //   549: ldc2_w 16
    //   552: lsub
    //   553: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   556: pop
    //   557: goto -> 576
    //   560: aload_1
    //   561: aload_1
    //   562: invokevirtual position : ()J
    //   565: aload #12
    //   567: invokevirtual getDataLength : ()I
    //   570: i2l
    //   571: ladd
    //   572: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   575: pop
    //   576: goto -> 49
    //   579: astore #10
    //   581: aload_0
    //   582: getfield moovNode : Lrw;
    //   585: ifnull -> 593
    //   588: iconst_1
    //   589: istore_3
    //   590: goto -> 595
    //   593: iconst_0
    //   594: istore_3
    //   595: iload #5
    //   597: istore #4
    //   599: aload_0
    //   600: getfield mdatNode : Lrw;
    //   603: ifnull -> 609
    //   606: iconst_1
    //   607: istore #4
    //   609: iload_3
    //   610: iload #4
    //   612: iand
    //   613: ifeq -> 689
    //   616: new org/jaudiotagger/audio/mp4/atom/NullPadding
    //   619: astore #10
    //   621: aload #10
    //   623: aload_1
    //   624: invokevirtual position : ()J
    //   627: ldc2_w 8
    //   630: lsub
    //   631: aload_1
    //   632: invokevirtual size : ()J
    //   635: invokespecial <init> : (JJ)V
    //   638: new rw
    //   641: astore #11
    //   643: aload #11
    //   645: aload #10
    //   647: invokespecial <init> : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;)V
    //   650: aload_0
    //   651: getfield rootNode : Lrw;
    //   654: aload #11
    //   656: invokevirtual a : (Lrw;)V
    //   659: getstatic org/jaudiotagger/audio/mp4/Mp4AtomTree.logger : Ljava/util/logging/Logger;
    //   662: ldc_w 'Null Padding found at end of file starting at offset {0}'
    //   665: iconst_1
    //   666: anewarray java/lang/Object
    //   669: dup
    //   670: iconst_0
    //   671: aload #10
    //   673: invokevirtual getFilePos : ()J
    //   676: invokestatic valueOf : (J)Ljava/lang/Long;
    //   679: aastore
    //   680: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   683: invokevirtual warning : (Ljava/lang/String;)V
    //   686: goto -> 692
    //   689: aload #10
    //   691: athrow
    //   692: aload_1
    //   693: invokevirtual size : ()J
    //   696: aload_1
    //   697: invokevirtual position : ()J
    //   700: lsub
    //   701: lstore #8
    //   703: lload #8
    //   705: lload #6
    //   707: lcmp
    //   708: ifeq -> 735
    //   711: getstatic org/jaudiotagger/audio/mp4/Mp4AtomTree.logger : Ljava/util/logging/Logger;
    //   714: ldc_w '{0} byte(s) of extra data found at the end of MP4 file'
    //   717: iconst_1
    //   718: anewarray java/lang/Object
    //   721: dup
    //   722: iconst_0
    //   723: lload #8
    //   725: invokestatic valueOf : (J)Ljava/lang/Long;
    //   728: aastore
    //   729: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   732: invokevirtual warning : (Ljava/lang/String;)V
    //   735: aload_0
    //   736: getfield dataTree : Lsx;
    //   739: astore #10
    //   741: aload_0
    //   742: getfield mdatNode : Lrw;
    //   745: ifnull -> 759
    //   748: iload_2
    //   749: ifeq -> 756
    //   752: aload_1
    //   753: invokevirtual close : ()V
    //   756: aload #10
    //   758: areturn
    //   759: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   762: dup
    //   763: ldc_w 'Unable to determine start of audio in file'
    //   766: invokespecial <init> : (Ljava/lang/String;)V
    //   769: athrow
    //   770: aload_0
    //   771: getfield mdatNode : Lrw;
    //   774: ifnull -> 788
    //   777: iload_2
    //   778: ifeq -> 785
    //   781: aload_1
    //   782: invokevirtual close : ()V
    //   785: aload #10
    //   787: athrow
    //   788: new org/jaudiotagger/audio/exceptions/CannotReadException
    //   791: dup
    //   792: ldc_w 'Unable to determine start of audio in file'
    //   795: invokespecial <init> : (Ljava/lang/String;)V
    //   798: athrow
    // Exception table:
    //   from	to	target	type
    //   3	49	213	finally
    //   49	94	213	finally
    //   100	107	579	org/jaudiotagger/audio/exceptions/NullBoxIdException
    //   100	107	213	finally
    //   107	156	213	finally
    //   163	170	213	finally
    //   180	210	213	finally
    //   218	293	213	finally
    //   296	349	213	finally
    //   349	378	213	finally
    //   381	416	213	finally
    //   416	457	213	finally
    //   491	504	213	finally
    //   541	557	213	finally
    //   560	576	213	finally
    //   581	588	213	finally
    //   599	606	213	finally
    //   616	686	213	finally
    //   689	692	213	finally
    //   692	703	213	finally
    //   711	735	213	finally
    //   735	741	213	finally
  }
  
  public Mp4BoxHeader getBoxHeader(rw paramrw) {
    return (paramrw == null) ? null : (Mp4BoxHeader)paramrw.e;
  }
  
  public sx getDataTree() {
    return this.dataTree;
  }
  
  public List<rw> getFreeNodes() {
    return this.freeNodes;
  }
  
  public rw getHdlrWithinMdiaNode() {
    return this.hdlrWithinMdiaNode;
  }
  
  public rw getHdlrWithinMetaNode() {
    return this.hdlrWithinMetaNode;
  }
  
  public rw getIlstNode() {
    return this.ilstNode;
  }
  
  public rw getMdatNode() {
    return this.mdatNode;
  }
  
  public rw getMetaNode() {
    return this.metaNode;
  }
  
  public ByteBuffer getMoovBuffer() {
    return this.moovBuffer;
  }
  
  public Mp4BoxHeader getMoovHeader() {
    return this.moovHeader;
  }
  
  public rw getMoovNode() {
    return this.moovNode;
  }
  
  public List<rw> getStcoNodes() {
    return this.stcoNodes;
  }
  
  public List<Mp4StcoBox> getStcos() {
    return this.stcos;
  }
  
  public rw getTagsNode() {
    return this.tagsNode;
  }
  
  public List<rw> getTrakNodes() {
    return this.trakNodes;
  }
  
  public rw getUdtaNode() {
    return this.udtaNode;
  }
  
  public void printAtomTree() {
    rw rw1 = this.rootNode;
    rw1.getClass();
    Object object = new Object();
    Vector<rw> vector = new Vector(1);
    vector.addElement(rw1);
    Stack stack = new Stack();
    ((qw)object).a = stack;
    stack.push(vector.elements());
    while (object.hasMoreElements()) {
      rw rw2 = (rw)object.nextElement();
      Mp4BoxHeader mp4BoxHeader = (Mp4BoxHeader)rw2.e;
      if (mp4BoxHeader != null) {
        String str = "";
        byte b = 1;
        while (true) {
          byte b1 = 0;
          rw rw3 = rw2;
          while (true) {
            rw3 = rw3.b;
            if (rw3 != null) {
              b1++;
              continue;
            } 
            if (b < b1) {
              str = str.concat("\t");
              b++;
              continue;
            } 
            if (mp4BoxHeader instanceof org.jaudiotagger.audio.mp4.atom.NullPadding) {
              if (mp4BoxHeader.getLength() == 1) {
                PrintStream printStream2 = System.out;
                stringBuilder = ga1.l(str, "Null pad  @ ");
                stringBuilder.append(mp4BoxHeader.getFilePos());
                stringBuilder.append(" 64bitDataSize ,ends @ ");
                stringBuilder.append(mp4BoxHeader.getFilePos() + mp4BoxHeader.getLength());
                printStream2.println(stringBuilder.toString());
                continue;
              } 
              PrintStream printStream1 = System.out;
              stringBuilder = ga1.l((String)stringBuilder, "Null pad  @ ");
              stringBuilder.append(mp4BoxHeader.getFilePos());
              stringBuilder.append(" of size:");
              stringBuilder.append(mp4BoxHeader.getLength());
              stringBuilder.append(" ,ends @ ");
              stringBuilder.append(mp4BoxHeader.getFilePos() + mp4BoxHeader.getLength());
              printStream1.println(stringBuilder.toString());
              continue;
            } 
            if (mp4BoxHeader.getLength() == 1) {
              PrintStream printStream1 = System.out;
              stringBuilder = ga1.l((String)stringBuilder, "Atom ");
              stringBuilder.append(mp4BoxHeader.getId());
              stringBuilder.append(" @ ");
              stringBuilder.append(mp4BoxHeader.getFilePos());
              stringBuilder.append(" 64BitDataSize ,ends @ ");
              stringBuilder.append(mp4BoxHeader.getFilePos() + mp4BoxHeader.getLength());
              printStream1.println(stringBuilder.toString());
              continue;
            } 
            break;
          } 
          break;
        } 
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = ga1.l((String)stringBuilder, "Atom ");
        stringBuilder.append(mp4BoxHeader.getId());
        stringBuilder.append(" @ ");
        stringBuilder.append(mp4BoxHeader.getFilePos());
        stringBuilder.append(" of size:");
        stringBuilder.append(mp4BoxHeader.getLength());
        stringBuilder.append(" ,ends @ ");
        stringBuilder.append(mp4BoxHeader.getFilePos() + mp4BoxHeader.getLength());
        printStream.println(stringBuilder.toString());
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4AtomTree.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */