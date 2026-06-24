package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ProfileInstallReceiver extends BroadcastReceiver {
  public final void onReceive(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 7
    //   4: goto -> 1573
    //   7: aload_2
    //   8: invokevirtual getAction : ()Ljava/lang/String;
    //   11: astore #6
    //   13: ldc 'androidx.profileinstaller.action.INSTALL_PROFILE'
    //   15: aload #6
    //   17: invokevirtual equals : (Ljava/lang/Object;)Z
    //   20: ifeq -> 1280
    //   23: new r8
    //   26: dup
    //   27: iconst_1
    //   28: invokespecial <init> : (I)V
    //   31: astore_2
    //   32: new bh0
    //   35: dup
    //   36: bipush #21
    //   38: aload_0
    //   39: invokespecial <init> : (ILjava/lang/Object;)V
    //   42: astore #11
    //   44: aload_1
    //   45: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   48: astore #8
    //   50: aload #8
    //   52: invokevirtual getPackageName : ()Ljava/lang/String;
    //   55: astore #6
    //   57: aload #8
    //   59: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   62: astore #7
    //   64: aload #8
    //   66: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   69: astore #12
    //   71: new java/io/File
    //   74: dup
    //   75: aload #7
    //   77: getfield sourceDir : Ljava/lang/String;
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: invokevirtual getName : ()Ljava/lang/String;
    //   86: astore #7
    //   88: aload_1
    //   89: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   92: astore #8
    //   94: aload #8
    //   96: aload #6
    //   98: iconst_0
    //   99: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   102: astore #9
    //   104: aload_1
    //   105: invokevirtual getFilesDir : ()Ljava/io/File;
    //   108: astore #8
    //   110: new java/lang/StringBuilder
    //   113: dup
    //   114: ldc 'Installing profile for '
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: astore #10
    //   121: aload #10
    //   123: aload_1
    //   124: invokevirtual getPackageName : ()Ljava/lang/String;
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: ldc 'ProfileInstaller'
    //   133: aload #10
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: getstatic wf2.m : [B
    //   145: astore #10
    //   147: new java/io/File
    //   150: dup
    //   151: new java/io/File
    //   154: dup
    //   155: ldc '/data/misc/profiles/cur/0'
    //   157: aload #6
    //   159: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   162: ldc 'primary.prof'
    //   164: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   167: astore #6
    //   169: new my
    //   172: dup
    //   173: aload #12
    //   175: aload_2
    //   176: aload #11
    //   178: aload #7
    //   180: aload #6
    //   182: invokespecial <init> : (Landroid/content/res/AssetManager;Lr8;Lbh0;Ljava/lang/String;Ljava/io/File;)V
    //   185: astore #7
    //   187: aload #7
    //   189: getfield d : Ljava/io/Serializable;
    //   192: checkcast [B
    //   195: astore #13
    //   197: aload #13
    //   199: ifnonnull -> 217
    //   202: aload #7
    //   204: iconst_3
    //   205: getstatic android/os/Build$VERSION.SDK_INT : I
    //   208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   211: invokevirtual d : (ILjava/io/Serializable;)V
    //   214: goto -> 1251
    //   217: aload #6
    //   219: invokevirtual exists : ()Z
    //   222: ifeq -> 243
    //   225: aload #6
    //   227: invokevirtual canWrite : ()Z
    //   230: ifne -> 261
    //   233: aload #7
    //   235: iconst_4
    //   236: aconst_null
    //   237: invokevirtual d : (ILjava/io/Serializable;)V
    //   240: goto -> 1251
    //   243: aload #6
    //   245: invokevirtual createNewFile : ()Z
    //   248: ifne -> 261
    //   251: aload #7
    //   253: iconst_4
    //   254: aconst_null
    //   255: invokevirtual d : (ILjava/io/Serializable;)V
    //   258: goto -> 1251
    //   261: aload #7
    //   263: iconst_1
    //   264: putfield b : Z
    //   267: aload #7
    //   269: aload #12
    //   271: ldc 'dexopt/baseline.prof'
    //   273: invokevirtual c : (Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   276: astore_2
    //   277: goto -> 303
    //   280: astore_2
    //   281: aload #11
    //   283: bipush #7
    //   285: aload_2
    //   286: invokevirtual y : (ILjava/lang/Object;)V
    //   289: goto -> 301
    //   292: astore_2
    //   293: aload #11
    //   295: bipush #6
    //   297: aload_2
    //   298: invokevirtual y : (ILjava/lang/Object;)V
    //   301: aconst_null
    //   302: astore_2
    //   303: aload_2
    //   304: ifnull -> 462
    //   307: aload #10
    //   309: aload_2
    //   310: iconst_4
    //   311: invokestatic R : (Ljava/io/InputStream;I)[B
    //   314: invokestatic equals : ([B[B)Z
    //   317: ifeq -> 378
    //   320: aload_2
    //   321: aload_2
    //   322: iconst_4
    //   323: invokestatic R : (Ljava/io/InputStream;I)[B
    //   326: aload #7
    //   328: getfield g : Ljava/lang/Object;
    //   331: checkcast java/lang/String
    //   334: invokestatic Q : (Ljava/io/FileInputStream;[BLjava/lang/String;)[Lny;
    //   337: astore #6
    //   339: aload_2
    //   340: invokevirtual close : ()V
    //   343: aload #6
    //   345: astore_2
    //   346: goto -> 435
    //   349: astore_2
    //   350: aload #11
    //   352: bipush #7
    //   354: aload_2
    //   355: invokevirtual y : (ILjava/lang/Object;)V
    //   358: aload #6
    //   360: astore_2
    //   361: goto -> 435
    //   364: astore_1
    //   365: goto -> 444
    //   368: astore #6
    //   370: goto -> 393
    //   373: astore #6
    //   375: goto -> 421
    //   378: new java/lang/IllegalStateException
    //   381: astore #6
    //   383: aload #6
    //   385: ldc 'Invalid magic'
    //   387: invokespecial <init> : (Ljava/lang/String;)V
    //   390: aload #6
    //   392: athrow
    //   393: aload #11
    //   395: bipush #8
    //   397: aload #6
    //   399: invokevirtual y : (ILjava/lang/Object;)V
    //   402: aload_2
    //   403: invokevirtual close : ()V
    //   406: goto -> 433
    //   409: astore_2
    //   410: aload #11
    //   412: bipush #7
    //   414: aload_2
    //   415: invokevirtual y : (ILjava/lang/Object;)V
    //   418: goto -> 433
    //   421: aload #11
    //   423: bipush #7
    //   425: aload #6
    //   427: invokevirtual y : (ILjava/lang/Object;)V
    //   430: goto -> 402
    //   433: aconst_null
    //   434: astore_2
    //   435: aload #7
    //   437: aload_2
    //   438: putfield h : Ljava/lang/Object;
    //   441: goto -> 462
    //   444: aload_2
    //   445: invokevirtual close : ()V
    //   448: goto -> 460
    //   451: astore_2
    //   452: aload #11
    //   454: bipush #7
    //   456: aload_2
    //   457: invokevirtual y : (ILjava/lang/Object;)V
    //   460: aload_1
    //   461: athrow
    //   462: aload #7
    //   464: getfield h : Ljava/lang/Object;
    //   467: checkcast [Lny;
    //   470: astore_2
    //   471: aload #7
    //   473: astore #6
    //   475: aload_2
    //   476: ifnull -> 680
    //   479: getstatic android/os/Build$VERSION.SDK_INT : I
    //   482: istore_3
    //   483: iload_3
    //   484: bipush #31
    //   486: if_icmplt -> 492
    //   489: goto -> 511
    //   492: iload_3
    //   493: bipush #24
    //   495: if_icmpeq -> 511
    //   498: iload_3
    //   499: bipush #25
    //   501: if_icmpeq -> 511
    //   504: aload #7
    //   506: astore #6
    //   508: goto -> 680
    //   511: aload #7
    //   513: aload #12
    //   515: ldc 'dexopt/baseline.profm'
    //   517: invokevirtual c : (Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   520: astore #6
    //   522: aload #6
    //   524: ifnull -> 618
    //   527: getstatic wf2.n : [B
    //   530: aload #6
    //   532: iconst_4
    //   533: invokestatic R : (Ljava/io/InputStream;I)[B
    //   536: invokestatic equals : ([B[B)Z
    //   539: ifeq -> 588
    //   542: aload #7
    //   544: aload #6
    //   546: aload #6
    //   548: iconst_4
    //   549: invokestatic R : (Ljava/io/InputStream;I)[B
    //   552: aload #13
    //   554: aload_2
    //   555: invokestatic N : (Ljava/io/FileInputStream;[B[B[Lny;)[Lny;
    //   558: putfield h : Ljava/lang/Object;
    //   561: aload #6
    //   563: invokevirtual close : ()V
    //   566: aload #7
    //   568: astore_2
    //   569: goto -> 669
    //   572: astore_2
    //   573: goto -> 631
    //   576: astore_2
    //   577: goto -> 648
    //   580: astore_2
    //   581: goto -> 659
    //   584: astore_2
    //   585: goto -> 600
    //   588: new java/lang/IllegalStateException
    //   591: astore_2
    //   592: aload_2
    //   593: ldc 'Invalid magic'
    //   595: invokespecial <init> : (Ljava/lang/String;)V
    //   598: aload_2
    //   599: athrow
    //   600: aload #6
    //   602: invokevirtual close : ()V
    //   605: goto -> 616
    //   608: astore #6
    //   610: aload_2
    //   611: aload #6
    //   613: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   616: aload_2
    //   617: athrow
    //   618: aload #6
    //   620: ifnull -> 667
    //   623: aload #6
    //   625: invokevirtual close : ()V
    //   628: goto -> 667
    //   631: aload #7
    //   633: aconst_null
    //   634: putfield h : Ljava/lang/Object;
    //   637: aload #11
    //   639: bipush #8
    //   641: aload_2
    //   642: invokevirtual y : (ILjava/lang/Object;)V
    //   645: goto -> 667
    //   648: aload #11
    //   650: bipush #7
    //   652: aload_2
    //   653: invokevirtual y : (ILjava/lang/Object;)V
    //   656: goto -> 667
    //   659: aload #11
    //   661: bipush #9
    //   663: aload_2
    //   664: invokevirtual y : (ILjava/lang/Object;)V
    //   667: aconst_null
    //   668: astore_2
    //   669: aload #7
    //   671: astore #6
    //   673: aload_2
    //   674: ifnull -> 680
    //   677: aload_2
    //   678: astore #6
    //   680: aload #6
    //   682: getfield c : Ljava/lang/Object;
    //   685: checkcast bh0
    //   688: astore_2
    //   689: aload #6
    //   691: getfield h : Ljava/lang/Object;
    //   694: checkcast [Lny;
    //   697: astore #11
    //   699: aload #6
    //   701: getfield d : Ljava/io/Serializable;
    //   704: checkcast [B
    //   707: astore #12
    //   709: aload #11
    //   711: ifnull -> 873
    //   714: aload #12
    //   716: ifnonnull -> 722
    //   719: goto -> 873
    //   722: aload #6
    //   724: getfield b : Z
    //   727: ifeq -> 867
    //   730: new java/io/ByteArrayOutputStream
    //   733: astore #7
    //   735: aload #7
    //   737: invokespecial <init> : ()V
    //   740: aload #7
    //   742: aload #10
    //   744: invokevirtual write : ([B)V
    //   747: aload #7
    //   749: aload #12
    //   751: invokevirtual write : ([B)V
    //   754: aload #7
    //   756: aload #12
    //   758: aload #11
    //   760: invokestatic j0 : (Ljava/io/ByteArrayOutputStream;[B[Lny;)Z
    //   763: ifne -> 801
    //   766: aload_2
    //   767: iconst_5
    //   768: aconst_null
    //   769: invokevirtual y : (ILjava/lang/Object;)V
    //   772: aload #6
    //   774: aconst_null
    //   775: putfield h : Ljava/lang/Object;
    //   778: aload #7
    //   780: invokevirtual close : ()V
    //   783: goto -> 873
    //   786: astore #7
    //   788: goto -> 839
    //   791: astore #7
    //   793: goto -> 850
    //   796: astore #10
    //   798: goto -> 819
    //   801: aload #6
    //   803: aload #7
    //   805: invokevirtual toByteArray : ()[B
    //   808: putfield e : Ljava/lang/Object;
    //   811: aload #7
    //   813: invokevirtual close : ()V
    //   816: goto -> 858
    //   819: aload #7
    //   821: invokevirtual close : ()V
    //   824: goto -> 836
    //   827: astore #7
    //   829: aload #10
    //   831: aload #7
    //   833: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   836: aload #10
    //   838: athrow
    //   839: aload_2
    //   840: bipush #8
    //   842: aload #7
    //   844: invokevirtual y : (ILjava/lang/Object;)V
    //   847: goto -> 858
    //   850: aload_2
    //   851: bipush #7
    //   853: aload #7
    //   855: invokevirtual y : (ILjava/lang/Object;)V
    //   858: aload #6
    //   860: aconst_null
    //   861: putfield h : Ljava/lang/Object;
    //   864: goto -> 873
    //   867: ldc 'This device doesn't support aot. Did you call deviceSupportsAotProfile()?'
    //   869: invokestatic f : (Ljava/lang/String;)V
    //   872: return
    //   873: aload #6
    //   875: getfield e : Ljava/lang/Object;
    //   878: checkcast [B
    //   881: astore #7
    //   883: aload #7
    //   885: ifnonnull -> 894
    //   888: iconst_0
    //   889: istore #4
    //   891: goto -> 1200
    //   894: aload #6
    //   896: getfield b : Z
    //   899: ifeq -> 1237
    //   902: new java/io/ByteArrayInputStream
    //   905: astore_2
    //   906: aload_2
    //   907: aload #7
    //   909: invokespecial <init> : ([B)V
    //   912: new java/io/FileOutputStream
    //   915: astore #7
    //   917: aload #7
    //   919: aload #6
    //   921: getfield f : Ljava/lang/Object;
    //   924: checkcast java/io/File
    //   927: invokespecial <init> : (Ljava/io/File;)V
    //   930: aload #7
    //   932: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   935: astore #10
    //   937: aload #10
    //   939: invokevirtual tryLock : ()Ljava/nio/channels/FileLock;
    //   942: astore #11
    //   944: aload #11
    //   946: ifnull -> 1063
    //   949: aload #11
    //   951: invokevirtual isValid : ()Z
    //   954: ifeq -> 1063
    //   957: sipush #512
    //   960: newarray byte
    //   962: astore #12
    //   964: aload_2
    //   965: aload #12
    //   967: invokevirtual read : ([B)I
    //   970: istore_3
    //   971: iload_3
    //   972: ifle -> 987
    //   975: aload #7
    //   977: aload #12
    //   979: iconst_0
    //   980: iload_3
    //   981: invokevirtual write : ([BII)V
    //   984: goto -> 964
    //   987: aload #6
    //   989: iconst_1
    //   990: aconst_null
    //   991: invokevirtual d : (ILjava/io/Serializable;)V
    //   994: aload #11
    //   996: invokevirtual close : ()V
    //   999: aload #10
    //   1001: invokevirtual close : ()V
    //   1004: aload #7
    //   1006: invokevirtual close : ()V
    //   1009: aload_2
    //   1010: invokevirtual close : ()V
    //   1013: aload #6
    //   1015: aconst_null
    //   1016: putfield e : Ljava/lang/Object;
    //   1019: aload #6
    //   1021: aconst_null
    //   1022: putfield h : Ljava/lang/Object;
    //   1025: iconst_1
    //   1026: istore #4
    //   1028: goto -> 1200
    //   1031: astore_1
    //   1032: goto -> 1223
    //   1035: astore_2
    //   1036: goto -> 1166
    //   1039: astore_2
    //   1040: goto -> 1189
    //   1043: astore #7
    //   1045: goto -> 1149
    //   1048: astore #10
    //   1050: goto -> 1129
    //   1053: astore #11
    //   1055: goto -> 1104
    //   1058: astore #12
    //   1060: goto -> 1079
    //   1063: new java/io/IOException
    //   1066: astore #12
    //   1068: aload #12
    //   1070: ldc_w 'Unable to acquire a lock on the underlying file channel.'
    //   1073: invokespecial <init> : (Ljava/lang/String;)V
    //   1076: aload #12
    //   1078: athrow
    //   1079: aload #11
    //   1081: ifnull -> 1101
    //   1084: aload #11
    //   1086: invokevirtual close : ()V
    //   1089: goto -> 1101
    //   1092: astore #11
    //   1094: aload #12
    //   1096: aload #11
    //   1098: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   1101: aload #12
    //   1103: athrow
    //   1104: aload #10
    //   1106: ifnull -> 1126
    //   1109: aload #10
    //   1111: invokevirtual close : ()V
    //   1114: goto -> 1126
    //   1117: astore #10
    //   1119: aload #11
    //   1121: aload #10
    //   1123: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   1126: aload #11
    //   1128: athrow
    //   1129: aload #7
    //   1131: invokevirtual close : ()V
    //   1134: goto -> 1146
    //   1137: astore #7
    //   1139: aload #10
    //   1141: aload #7
    //   1143: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   1146: aload #10
    //   1148: athrow
    //   1149: aload_2
    //   1150: invokevirtual close : ()V
    //   1153: goto -> 1163
    //   1156: astore_2
    //   1157: aload #7
    //   1159: aload_2
    //   1160: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   1163: aload #7
    //   1165: athrow
    //   1166: aload #6
    //   1168: bipush #7
    //   1170: aload_2
    //   1171: invokevirtual d : (ILjava/io/Serializable;)V
    //   1174: aload #6
    //   1176: aconst_null
    //   1177: putfield e : Ljava/lang/Object;
    //   1180: aload #6
    //   1182: aconst_null
    //   1183: putfield h : Ljava/lang/Object;
    //   1186: goto -> 888
    //   1189: aload #6
    //   1191: bipush #6
    //   1193: aload_2
    //   1194: invokevirtual d : (ILjava/io/Serializable;)V
    //   1197: goto -> 1174
    //   1200: iload #4
    //   1202: istore #5
    //   1204: iload #4
    //   1206: ifeq -> 1254
    //   1209: aload #9
    //   1211: aload #8
    //   1213: invokestatic O : (Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    //   1216: iload #4
    //   1218: istore #5
    //   1220: goto -> 1254
    //   1223: aload #6
    //   1225: aconst_null
    //   1226: putfield e : Ljava/lang/Object;
    //   1229: aload #6
    //   1231: aconst_null
    //   1232: putfield h : Ljava/lang/Object;
    //   1235: aload_1
    //   1236: athrow
    //   1237: ldc 'This device doesn't support aot. Did you call deviceSupportsAotProfile()?'
    //   1239: invokestatic f : (Ljava/lang/String;)V
    //   1242: return
    //   1243: astore_2
    //   1244: aload #7
    //   1246: iconst_4
    //   1247: aconst_null
    //   1248: invokevirtual d : (ILjava/io/Serializable;)V
    //   1251: iconst_0
    //   1252: istore #5
    //   1254: aload_1
    //   1255: iload #5
    //   1257: invokestatic c : (Landroid/content/Context;Z)V
    //   1260: goto -> 1573
    //   1263: astore_2
    //   1264: aload #11
    //   1266: bipush #7
    //   1268: aload_2
    //   1269: invokevirtual y : (ILjava/lang/Object;)V
    //   1272: aload_1
    //   1273: iconst_0
    //   1274: invokestatic c : (Landroid/content/Context;Z)V
    //   1277: goto -> 1573
    //   1280: ldc_w 'androidx.profileinstaller.action.SKIP_FILE'
    //   1283: aload #6
    //   1285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1288: ifeq -> 1430
    //   1291: aload_2
    //   1292: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   1295: astore_2
    //   1296: aload_2
    //   1297: ifnull -> 1573
    //   1300: aload_2
    //   1301: ldc_w 'EXTRA_SKIP_FILE_OPERATION'
    //   1304: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1307: astore_2
    //   1308: ldc_w 'WRITE_SKIP_FILE'
    //   1311: aload_2
    //   1312: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1315: ifeq -> 1384
    //   1318: new bh0
    //   1321: dup
    //   1322: bipush #21
    //   1324: aload_0
    //   1325: invokespecial <init> : (ILjava/lang/Object;)V
    //   1328: astore_2
    //   1329: aload_1
    //   1330: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1333: invokevirtual getPackageName : ()Ljava/lang/String;
    //   1336: astore #7
    //   1338: aload_1
    //   1339: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   1342: astore #6
    //   1344: aload #6
    //   1346: aload #7
    //   1348: iconst_0
    //   1349: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   1352: astore #6
    //   1354: aload #6
    //   1356: aload_1
    //   1357: invokevirtual getFilesDir : ()Ljava/io/File;
    //   1360: invokestatic O : (Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    //   1363: aload_2
    //   1364: bipush #10
    //   1366: aconst_null
    //   1367: invokevirtual y : (ILjava/lang/Object;)V
    //   1370: goto -> 1573
    //   1373: astore_1
    //   1374: aload_2
    //   1375: bipush #7
    //   1377: aload_1
    //   1378: invokevirtual y : (ILjava/lang/Object;)V
    //   1381: goto -> 1573
    //   1384: ldc_w 'DELETE_SKIP_FILE'
    //   1387: aload_2
    //   1388: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1391: ifeq -> 1573
    //   1394: new java/io/File
    //   1397: dup
    //   1398: aload_1
    //   1399: invokevirtual getFilesDir : ()Ljava/io/File;
    //   1402: ldc_w 'profileinstaller_profileWrittenFor_lastUpdateTime.dat'
    //   1405: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   1408: invokevirtual delete : ()Z
    //   1411: pop
    //   1412: ldc 'ProfileInstaller'
    //   1414: ldc_w 'RESULT_DELETE_SKIP_FILE_SUCCESS'
    //   1417: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1420: pop
    //   1421: aload_0
    //   1422: bipush #11
    //   1424: invokevirtual setResultCode : (I)V
    //   1427: goto -> 1573
    //   1430: ldc_w 'androidx.profileinstaller.action.SAVE_PROFILE'
    //   1433: aload #6
    //   1435: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1438: ifeq -> 1465
    //   1441: invokestatic myPid : ()I
    //   1444: bipush #10
    //   1446: invokestatic sendSignal : (II)V
    //   1449: ldc 'ProfileInstaller'
    //   1451: ldc_w ''
    //   1454: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1457: pop
    //   1458: aload_0
    //   1459: bipush #12
    //   1461: invokevirtual setResultCode : (I)V
    //   1464: return
    //   1465: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.rTlxKPJaZqJjDk : Ljava/lang/String;
    //   1468: aload #6
    //   1470: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1473: ifeq -> 1573
    //   1476: aload_2
    //   1477: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   1480: astore_2
    //   1481: aload_2
    //   1482: ifnull -> 1573
    //   1485: aload_2
    //   1486: ldc_w 'EXTRA_BENCHMARK_OPERATION'
    //   1489: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1492: astore #6
    //   1494: new bh0
    //   1497: dup
    //   1498: bipush #21
    //   1500: aload_0
    //   1501: invokespecial <init> : (ILjava/lang/Object;)V
    //   1504: astore_2
    //   1505: ldc_w 'DROP_SHADER_CACHE'
    //   1508: aload #6
    //   1510: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1513: ifeq -> 1566
    //   1516: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1519: bipush #34
    //   1521: if_icmplt -> 1535
    //   1524: aload_1
    //   1525: invokevirtual createDeviceProtectedStorageContext : ()Landroid/content/Context;
    //   1528: invokevirtual getCacheDir : ()Ljava/io/File;
    //   1531: astore_1
    //   1532: goto -> 1543
    //   1535: aload_1
    //   1536: invokevirtual createDeviceProtectedStorageContext : ()Landroid/content/Context;
    //   1539: invokevirtual getCodeCacheDir : ()Ljava/io/File;
    //   1542: astore_1
    //   1543: aload_1
    //   1544: invokestatic x : (Ljava/io/File;)Z
    //   1547: ifeq -> 1558
    //   1550: aload_2
    //   1551: bipush #14
    //   1553: aconst_null
    //   1554: invokevirtual y : (ILjava/lang/Object;)V
    //   1557: return
    //   1558: aload_2
    //   1559: bipush #15
    //   1561: aconst_null
    //   1562: invokevirtual y : (ILjava/lang/Object;)V
    //   1565: return
    //   1566: aload_2
    //   1567: bipush #16
    //   1569: aconst_null
    //   1570: invokevirtual y : (ILjava/lang/Object;)V
    //   1573: return
    // Exception table:
    //   from	to	target	type
    //   94	104	1263	android/content/pm/PackageManager$NameNotFoundException
    //   243	258	1243	java/io/IOException
    //   267	277	292	java/io/FileNotFoundException
    //   267	277	280	java/io/IOException
    //   307	339	373	java/io/IOException
    //   307	339	368	java/lang/IllegalStateException
    //   307	339	364	finally
    //   339	343	349	java/io/IOException
    //   378	393	373	java/io/IOException
    //   378	393	368	java/lang/IllegalStateException
    //   378	393	364	finally
    //   393	402	364	finally
    //   402	406	409	java/io/IOException
    //   421	430	364	finally
    //   444	448	451	java/io/IOException
    //   511	522	580	java/io/FileNotFoundException
    //   511	522	576	java/io/IOException
    //   511	522	572	java/lang/IllegalStateException
    //   527	561	584	finally
    //   561	566	580	java/io/FileNotFoundException
    //   561	566	576	java/io/IOException
    //   561	566	572	java/lang/IllegalStateException
    //   588	600	584	finally
    //   600	605	608	finally
    //   610	616	580	java/io/FileNotFoundException
    //   610	616	576	java/io/IOException
    //   610	616	572	java/lang/IllegalStateException
    //   616	618	580	java/io/FileNotFoundException
    //   616	618	576	java/io/IOException
    //   616	618	572	java/lang/IllegalStateException
    //   623	628	580	java/io/FileNotFoundException
    //   623	628	576	java/io/IOException
    //   623	628	572	java/lang/IllegalStateException
    //   730	740	791	java/io/IOException
    //   730	740	786	java/lang/IllegalStateException
    //   740	778	796	finally
    //   778	783	791	java/io/IOException
    //   778	783	786	java/lang/IllegalStateException
    //   801	811	796	finally
    //   811	816	791	java/io/IOException
    //   811	816	786	java/lang/IllegalStateException
    //   819	824	827	finally
    //   829	836	791	java/io/IOException
    //   829	836	786	java/lang/IllegalStateException
    //   836	839	791	java/io/IOException
    //   836	839	786	java/lang/IllegalStateException
    //   902	912	1039	java/io/FileNotFoundException
    //   902	912	1035	java/io/IOException
    //   902	912	1031	finally
    //   912	930	1043	finally
    //   930	937	1048	finally
    //   937	944	1053	finally
    //   949	964	1058	finally
    //   964	971	1058	finally
    //   975	984	1058	finally
    //   987	994	1058	finally
    //   994	999	1053	finally
    //   999	1004	1048	finally
    //   1004	1009	1043	finally
    //   1009	1013	1039	java/io/FileNotFoundException
    //   1009	1013	1035	java/io/IOException
    //   1009	1013	1031	finally
    //   1063	1079	1058	finally
    //   1084	1089	1092	finally
    //   1094	1101	1053	finally
    //   1101	1104	1053	finally
    //   1109	1114	1117	finally
    //   1119	1126	1048	finally
    //   1126	1129	1048	finally
    //   1129	1134	1137	finally
    //   1139	1146	1043	finally
    //   1146	1149	1043	finally
    //   1149	1153	1156	finally
    //   1157	1163	1039	java/io/FileNotFoundException
    //   1157	1163	1035	java/io/IOException
    //   1157	1163	1031	finally
    //   1163	1166	1039	java/io/FileNotFoundException
    //   1163	1166	1035	java/io/IOException
    //   1163	1166	1031	finally
    //   1166	1174	1031	finally
    //   1189	1197	1031	finally
    //   1344	1354	1373	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\profileinstaller\ProfileInstallReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */