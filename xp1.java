import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.storage.StorageVolume;
import in.krosbits.musicolet.MyApplication;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class xp1 {
  public final boolean a;
  
  public final boolean b;
  
  public final boolean c;
  
  public final boolean d;
  
  public final String e;
  
  public final String f;
  
  public final boolean g;
  
  public final boolean h;
  
  public final boolean i;
  
  public final int j;
  
  public final String k;
  
  public final String l;
  
  public final boolean m;
  
  public final String n;
  
  public final Object o;
  
  public v00 p;
  
  public xp1(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, String paramString3, StorageVolume paramStorageVolume, String paramString4) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: ldc 'SV<i>: '
    //   10: invokespecial <init> : (Ljava/lang/String;)V
    //   13: astore #13
    //   15: aload #13
    //   17: iload_1
    //   18: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload #13
    //   24: ldc ', '
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload #13
    //   32: iload_2
    //   33: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload #13
    //   39: ldc ', '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload #13
    //   47: iload_3
    //   48: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #13
    //   54: ldc ', '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload #13
    //   62: aload #4
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: aload #13
    //   70: ldc ', '
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload #13
    //   78: aload #5
    //   80: ldc ', '
    //   82: aload #6
    //   84: ldc ', '
    //   86: invokestatic v : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload #13
    //   91: aload #7
    //   93: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #13
    //   99: ldc ', '
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #13
    //   107: aload #8
    //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload #13
    //   115: invokevirtual toString : ()Ljava/lang/String;
    //   118: invokestatic F : (Ljava/lang/String;)V
    //   121: iload_1
    //   122: istore #10
    //   124: aload #4
    //   126: astore #6
    //   128: iload_1
    //   129: ifeq -> 184
    //   132: aload #4
    //   134: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   137: ifne -> 156
    //   140: aload #8
    //   142: ifnull -> 156
    //   145: aload #8
    //   147: getstatic yp1.e : Ljava/lang/String;
    //   150: invokevirtual equals : (Ljava/lang/Object;)Z
    //   153: ifeq -> 160
    //   156: ldc 'primary'
    //   158: astore #4
    //   160: iload_1
    //   161: istore #10
    //   163: aload #4
    //   165: astore #6
    //   167: ldc 'primary'
    //   169: aload #4
    //   171: invokevirtual equals : (Ljava/lang/Object;)Z
    //   174: ifne -> 184
    //   177: iconst_0
    //   178: istore #10
    //   180: aload #4
    //   182: astore #6
    //   184: aload #6
    //   186: ifnull -> 1030
    //   189: aload #5
    //   191: astore #4
    //   193: aload #5
    //   195: ifnonnull -> 202
    //   198: aload #6
    //   200: astore #4
    //   202: aload_0
    //   203: iload #10
    //   205: putfield a : Z
    //   208: aload_0
    //   209: iload_2
    //   210: putfield b : Z
    //   213: aload_0
    //   214: aload #7
    //   216: putfield o : Ljava/lang/Object;
    //   219: aload_0
    //   220: aload #6
    //   222: putfield e : Ljava/lang/String;
    //   225: aload_0
    //   226: aload #4
    //   228: putfield f : Ljava/lang/String;
    //   231: aload_0
    //   232: aload #6
    //   234: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   237: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   240: putfield n : Ljava/lang/String;
    //   243: aload #8
    //   245: ifnull -> 251
    //   248: goto -> 332
    //   251: invokestatic n : ()Lzi;
    //   254: aload #6
    //   256: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   259: checkcast java/lang/String
    //   262: astore #4
    //   264: aload #4
    //   266: ifnull -> 276
    //   269: aload #4
    //   271: astore #8
    //   273: goto -> 332
    //   276: aload #7
    //   278: ifnull -> 329
    //   281: aload #7
    //   283: invokevirtual getClass : ()Ljava/lang/Class;
    //   286: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.ZikigagTFHMhoSG : Ljava/lang/String;
    //   289: aconst_null
    //   290: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   293: aload #7
    //   295: aconst_null
    //   296: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   299: astore #4
    //   301: aload #4
    //   303: instanceof java/lang/String
    //   306: ifeq -> 329
    //   309: aload #4
    //   311: checkcast java/lang/String
    //   314: astore #4
    //   316: goto -> 269
    //   319: astore #4
    //   321: aload #4
    //   323: invokevirtual toString : ()Ljava/lang/String;
    //   326: invokestatic v : (Ljava/lang/String;)V
    //   329: aconst_null
    //   330: astore #8
    //   332: aload_0
    //   333: aload #8
    //   335: putfield l : Ljava/lang/String;
    //   338: new java/lang/StringBuilder
    //   341: dup
    //   342: ldc 'SV>GRP: '
    //   344: invokespecial <init> : (Ljava/lang/String;)V
    //   347: astore #4
    //   349: aload #4
    //   351: aload #8
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: aload #4
    //   359: invokevirtual toString : ()Ljava/lang/String;
    //   362: invokestatic F : (Ljava/lang/String;)V
    //   365: aload_0
    //   366: invokevirtual d : ()Lv00;
    //   369: astore #5
    //   371: new java/lang/StringBuilder
    //   374: dup
    //   375: ldc 'SV>DRF: '
    //   377: invokespecial <init> : (Ljava/lang/String;)V
    //   380: astore #4
    //   382: aload #4
    //   384: aload #5
    //   386: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload #4
    //   392: invokevirtual toString : ()Ljava/lang/String;
    //   395: invokestatic F : (Ljava/lang/String;)V
    //   398: aload #5
    //   400: ifnull -> 459
    //   403: aload #5
    //   405: invokevirtual b : ()Z
    //   408: istore_2
    //   409: aload #5
    //   411: invokevirtual a : ()Z
    //   414: istore_1
    //   415: new java/lang/StringBuilder
    //   418: dup
    //   419: ldc 'SV>DRF>RWT: '
    //   421: invokespecial <init> : (Ljava/lang/String;)V
    //   424: astore #4
    //   426: aload #4
    //   428: iload_1
    //   429: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   432: pop
    //   433: aload #4
    //   435: ldc ','
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload #4
    //   443: iload_2
    //   444: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   447: pop
    //   448: aload #4
    //   450: invokevirtual toString : ()Ljava/lang/String;
    //   453: invokestatic F : (Ljava/lang/String;)V
    //   456: goto -> 463
    //   459: iconst_0
    //   460: istore_1
    //   461: iconst_0
    //   462: istore_2
    //   463: aload #6
    //   465: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   468: astore #4
    //   470: invokestatic v : ()Landroid/content/SharedPreferences;
    //   473: aload #4
    //   475: aconst_null
    //   476: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   481: astore #5
    //   483: new java/lang/StringBuilder
    //   486: dup
    //   487: ldc 'SV>SPSTU: '
    //   489: invokespecial <init> : (Ljava/lang/String;)V
    //   492: astore #4
    //   494: aload #4
    //   496: aload #5
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: aload #4
    //   504: invokevirtual toString : ()Ljava/lang/String;
    //   507: invokestatic F : (Ljava/lang/String;)V
    //   510: aload #5
    //   512: ifnull -> 566
    //   515: aload #5
    //   517: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   520: astore #4
    //   522: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   525: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   528: aload #4
    //   530: invokestatic g : (Landroid/content/Context;Landroid/net/Uri;)Lc91;
    //   533: astore #4
    //   535: new java/lang/StringBuilder
    //   538: astore #6
    //   540: aload #6
    //   542: ldc 'SV>SPSTUF: '
    //   544: invokespecial <init> : (Ljava/lang/String;)V
    //   547: aload #6
    //   549: aload #4
    //   551: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   554: pop
    //   555: aload #6
    //   557: invokevirtual toString : ()Ljava/lang/String;
    //   560: invokestatic F : (Ljava/lang/String;)V
    //   563: goto -> 569
    //   566: aconst_null
    //   567: astore #4
    //   569: aload #4
    //   571: ifnull -> 595
    //   574: aload_0
    //   575: aload #4
    //   577: invokevirtual a : ()Z
    //   580: putfield h : Z
    //   583: aload_0
    //   584: aload #4
    //   586: invokevirtual b : ()Z
    //   589: putfield g : Z
    //   592: goto -> 605
    //   595: aload_0
    //   596: iconst_0
    //   597: putfield g : Z
    //   600: aload_0
    //   601: iconst_0
    //   602: putfield h : Z
    //   605: new java/lang/StringBuilder
    //   608: dup
    //   609: ldc 'SV>WRTU: '
    //   611: invokespecial <init> : (Ljava/lang/String;)V
    //   614: astore #4
    //   616: aload #4
    //   618: aload_0
    //   619: getfield h : Z
    //   622: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   625: pop
    //   626: aload #4
    //   628: ldc ', '
    //   630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: pop
    //   634: aload #4
    //   636: aload_0
    //   637: getfield g : Z
    //   640: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   643: pop
    //   644: aload #4
    //   646: invokevirtual toString : ()Ljava/lang/String;
    //   649: invokestatic F : (Ljava/lang/String;)V
    //   652: iload_3
    //   653: ifne -> 677
    //   656: aload #5
    //   658: ifnull -> 671
    //   661: aload_0
    //   662: getfield g : Z
    //   665: ifne -> 671
    //   668: goto -> 677
    //   671: iconst_0
    //   672: istore #10
    //   674: goto -> 680
    //   677: iconst_1
    //   678: istore #10
    //   680: iload_1
    //   681: ifne -> 697
    //   684: aload_0
    //   685: getfield h : Z
    //   688: ifeq -> 697
    //   691: iconst_1
    //   692: istore #11
    //   694: goto -> 700
    //   697: iconst_0
    //   698: istore #11
    //   700: aload_0
    //   701: iload #11
    //   703: putfield d : Z
    //   706: iload_2
    //   707: ifne -> 723
    //   710: aload_0
    //   711: getfield g : Z
    //   714: ifeq -> 723
    //   717: iconst_1
    //   718: istore #12
    //   720: goto -> 726
    //   723: iconst_0
    //   724: istore #12
    //   726: aload_0
    //   727: iload #12
    //   729: putfield c : Z
    //   732: new java/lang/StringBuilder
    //   735: dup
    //   736: ldc 'SV>3: '
    //   738: invokespecial <init> : (Ljava/lang/String;)V
    //   741: astore #4
    //   743: aload #4
    //   745: iload #10
    //   747: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   750: pop
    //   751: aload #4
    //   753: ldc ', '
    //   755: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: pop
    //   759: aload #4
    //   761: iload #11
    //   763: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   766: pop
    //   767: aload #4
    //   769: ldc ', '
    //   771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload #4
    //   777: iload #12
    //   779: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   782: pop
    //   783: aload #4
    //   785: invokevirtual toString : ()Ljava/lang/String;
    //   788: invokestatic F : (Ljava/lang/String;)V
    //   791: aload_0
    //   792: getfield g : Z
    //   795: ifne -> 877
    //   798: iload_2
    //   799: ifne -> 877
    //   802: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   805: invokevirtual p : ()Z
    //   808: ifne -> 814
    //   811: goto -> 877
    //   814: aload_0
    //   815: getfield h : Z
    //   818: ifne -> 853
    //   821: iload_1
    //   822: ifeq -> 828
    //   825: goto -> 853
    //   828: ldc 'SV>C2'
    //   830: invokestatic F : (Ljava/lang/String;)V
    //   833: aload_0
    //   834: bipush #-2
    //   836: putfield j : I
    //   839: aload_0
    //   840: iload_3
    //   841: iconst_1
    //   842: ixor
    //   843: putfield i : Z
    //   846: ldc 2131886990
    //   848: istore #9
    //   850: goto -> 895
    //   853: ldc 'SV>C1'
    //   855: invokestatic F : (Ljava/lang/String;)V
    //   858: aload_0
    //   859: iconst_m1
    //   860: putfield j : I
    //   863: aload_0
    //   864: iload_3
    //   865: iconst_1
    //   866: ixor
    //   867: putfield i : Z
    //   870: ldc 2131887002
    //   872: istore #9
    //   874: goto -> 895
    //   877: ldc 'SV>C0'
    //   879: invokestatic F : (Ljava/lang/String;)V
    //   882: aload_0
    //   883: iconst_0
    //   884: putfield j : I
    //   887: aload_0
    //   888: iconst_0
    //   889: putfield i : Z
    //   892: iconst_m1
    //   893: istore #9
    //   895: new java/lang/StringBuilder
    //   898: dup
    //   899: getstatic android/support/v4/graphics/drawable/uUq/IGBYXeDFmKYajx.UNfWe : Ljava/lang/String;
    //   902: invokespecial <init> : (Ljava/lang/String;)V
    //   905: astore #4
    //   907: aload #4
    //   909: aload_0
    //   910: getfield j : I
    //   913: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   916: pop
    //   917: aload #4
    //   919: ldc ', '
    //   921: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   924: pop
    //   925: aload #4
    //   927: aload_0
    //   928: getfield i : Z
    //   931: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   934: pop
    //   935: aload #4
    //   937: invokevirtual toString : ()Ljava/lang/String;
    //   940: invokestatic F : (Ljava/lang/String;)V
    //   943: iload_3
    //   944: ifeq -> 951
    //   947: ldc 2131886835
    //   949: istore #9
    //   951: iload #9
    //   953: iconst_m1
    //   954: if_icmpne -> 965
    //   957: aload_0
    //   958: aconst_null
    //   959: putfield k : Ljava/lang/String;
    //   962: goto -> 980
    //   965: aload_0
    //   966: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   969: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   972: iload #9
    //   974: invokevirtual getString : (I)Ljava/lang/String;
    //   977: putfield k : Ljava/lang/String;
    //   980: aload_0
    //   981: getfield l : Ljava/lang/String;
    //   984: astore #5
    //   986: aload #5
    //   988: ifnull -> 1019
    //   991: getstatic yp1.f : Ljava/util/HashSet;
    //   994: astore #4
    //   996: aload #4
    //   998: ifnull -> 1019
    //   1001: aload #4
    //   1003: aload #5
    //   1005: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1008: ifne -> 1019
    //   1011: aload_0
    //   1012: iconst_1
    //   1013: putfield m : Z
    //   1016: goto -> 1024
    //   1019: aload_0
    //   1020: iconst_0
    //   1021: putfield m : Z
    //   1024: aload_0
    //   1025: aconst_null
    //   1026: putfield p : Lv00;
    //   1029: return
    //   1030: ldc_w '0UD: '
    //   1033: aload #8
    //   1035: invokestatic k : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1038: invokestatic l : (Ljava/lang/String;)V
    //   1041: aconst_null
    //   1042: athrow
    //   1043: astore #4
    //   1045: goto -> 566
    //   1048: astore #6
    //   1050: goto -> 569
    // Exception table:
    //   from	to	target	type
    //   281	316	319	finally
    //   515	535	1043	finally
    //   535	563	1048	finally
  }
  
  public final Intent a(boolean paramBoolean) {
    Intent intent2 = null;
    Object object = this.o;
    Intent intent1 = intent2;
    if (object != null) {
      intent1 = intent2;
      if (object instanceof StorageVolume)
        if (Build.VERSION.SDK_INT >= 29) {
          intent1 = ((StorageVolume)object).createOpenDocumentTreeIntent();
        } else {
          intent1 = intent2;
          if (!paramBoolean)
            intent1 = ((StorageVolume)object).createAccessIntent(null); 
        }  
    } 
    if (intent1 != null)
      return intent1; 
    intent2 = new Intent(fXMDNeMWaILNVh.qCf);
    intent2.putExtra("android.content.extra.SHOW_ADVANCED", true);
    StringBuilder stringBuilder = new StringBuilder("content://com.android.externalstorage.documents/root/");
    stringBuilder.append(this.e);
    intent2.putExtra("android.provider.extra.INITIAL_URI", stringBuilder.toString());
    if (object instanceof StorageVolume)
      intent2.putExtra("android.os.storage.extra.STORAGE_VOLUME", (Parcelable)object); 
    return intent2;
  }
  
  public final Uri b() {
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority("com.android.externalstorage.documents").appendPath("tree");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.e);
    stringBuilder.append(":");
    return builder.appendPath(stringBuilder.toString()).build();
  }
  
  public final String c() {
    return this.a ? MyApplication.i.getApplicationContext().getString(2131887082) : this.f;
  }
  
  public final v00 d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lv00;
    //   4: ifnonnull -> 243
    //   7: aload_0
    //   8: getfield d : Z
    //   11: istore_1
    //   12: aload_0
    //   13: getfield e : Ljava/lang/String;
    //   16: astore #5
    //   18: aconst_null
    //   19: astore_3
    //   20: iload_1
    //   21: ifeq -> 138
    //   24: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   27: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   30: astore #4
    //   32: aload #5
    //   34: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_2
    //   38: invokestatic v : ()Landroid/content/SharedPreferences;
    //   41: aload_2
    //   42: aconst_null
    //   43: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnull -> 66
    //   53: aload_2
    //   54: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   57: astore_2
    //   58: goto -> 68
    //   61: astore_2
    //   62: aload_2
    //   63: invokevirtual printStackTrace : ()V
    //   66: aconst_null
    //   67: astore_2
    //   68: aload_2
    //   69: ifnull -> 75
    //   72: goto -> 80
    //   75: aload_0
    //   76: invokevirtual b : ()Landroid/net/Uri;
    //   79: astore_2
    //   80: aload_0
    //   81: getfield e : Ljava/lang/String;
    //   84: astore #5
    //   86: aload_2
    //   87: ifnonnull -> 99
    //   90: getstatic v00.c : Ld61;
    //   93: astore_2
    //   94: aload_3
    //   95: astore_2
    //   96: goto -> 126
    //   99: new ww1
    //   102: dup
    //   103: aconst_null
    //   104: aload #4
    //   106: aload_2
    //   107: invokestatic z : (Landroid/net/Uri;)Landroid/net/Uri;
    //   110: aconst_null
    //   111: ldc_w 'Storage'
    //   114: aload #5
    //   116: ldc_w 'vnd.android.document/directory'
    //   119: ldc2_w -1
    //   122: invokespecial <init> : (Lww1;Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   125: astore_2
    //   126: aload_0
    //   127: aload_2
    //   128: putfield p : Lv00;
    //   131: goto -> 216
    //   134: astore_2
    //   135: goto -> 212
    //   138: aload_0
    //   139: getfield l : Ljava/lang/String;
    //   142: astore_3
    //   143: aload_3
    //   144: ifnull -> 159
    //   147: new java/io/File
    //   150: astore_2
    //   151: aload_2
    //   152: aload_3
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: goto -> 161
    //   159: aconst_null
    //   160: astore_2
    //   161: new java/lang/StringBuilder
    //   164: astore_3
    //   165: aload_3
    //   166: ldc_w 'Storage/'
    //   169: invokespecial <init> : (Ljava/lang/String;)V
    //   172: aload_3
    //   173: aload #5
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_3
    //   180: invokevirtual toString : ()Ljava/lang/String;
    //   183: astore_3
    //   184: getstatic v00.c : Ld61;
    //   187: astore #4
    //   189: new cd1
    //   192: astore #4
    //   194: aload #4
    //   196: aconst_null
    //   197: aload_2
    //   198: aload_3
    //   199: aconst_null
    //   200: invokespecial <init> : (Lcd1;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    //   203: aload_0
    //   204: aload #4
    //   206: putfield p : Lv00;
    //   209: goto -> 216
    //   212: aload_2
    //   213: invokevirtual printStackTrace : ()V
    //   216: new java/lang/StringBuilder
    //   219: dup
    //   220: ldc_w 'SV>G_DRF: '
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: astore_2
    //   227: aload_2
    //   228: aload_0
    //   229: getfield p : Lv00;
    //   232: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload_2
    //   237: invokevirtual toString : ()Ljava/lang/String;
    //   240: invokestatic F : (Ljava/lang/String;)V
    //   243: aload_0
    //   244: getfield p : Lv00;
    //   247: areturn
    // Exception table:
    //   from	to	target	type
    //   7	12	134	finally
    //   24	49	134	finally
    //   53	58	61	finally
    //   62	66	134	finally
    //   75	80	134	finally
    //   80	86	134	finally
    //   90	94	134	finally
    //   99	126	134	finally
    //   126	131	134	finally
    //   138	143	134	finally
    //   147	156	134	finally
    //   161	209	134	finally
  }
  
  public final int e() {
    return this.a ? 2131231366 : (this.m ? 2131231420 : (this.b ? 2131231385 : 2131231407));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */