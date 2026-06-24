import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.PlaylistEditActivity;
import java.util.ArrayList;

public final class kz extends gj0 {
  public final int d;
  
  public final Object e;
  
  private final void q(he1 paramhe1) {}
  
  private final void r(he1 paramhe1) {}
  
  public void a(RecyclerView paramRecyclerView, he1 paramhe1) {
    ArrayList arrayList;
    PlaylistEditActivity playlistEditActivity;
    switch (this.d) {
      default:
        super.a(paramRecyclerView, paramhe1);
        return;
      case 1:
        super.a(paramRecyclerView, paramhe1);
        playlistEditActivity = (PlaylistEditActivity)this.e;
        if (playlistEditActivity.e0 != null)
          if (playlistEditActivity.h0) {
            playlistEditActivity.T.clear();
            playlistEditActivity.T.addAll(playlistEditActivity.f0.subList(0, playlistEditActivity.g0));
            playlistEditActivity.T.addAll(playlistEditActivity.e0);
            for (byte b = 0; b < playlistEditActivity.e0.size(); b++)
              playlistEditActivity.U.add(Integer.valueOf(playlistEditActivity.g0 + b)); 
            ArrayList arrayList1 = playlistEditActivity.T;
            arrayList = playlistEditActivity.f0;
            arrayList1.addAll(arrayList.subList(playlistEditActivity.g0, arrayList.size()));
          } else {
            playlistEditActivity.U.addAll(playlistEditActivity.i0);
          }  
        if (playlistEditActivity.e0 != null)
          playlistEditActivity.Z.post(new xt0(5, this)); 
        playlistEditActivity.f0 = null;
        playlistEditActivity.e0 = null;
        playlistEditActivity.h0 = false;
        playlistEditActivity.g0 = 0;
        playlistEditActivity.i0 = null;
        return;
      case 0:
        break;
    } 
    super.a((RecyclerView)arrayList, (he1)playlistEditActivity);
    MyApplication.h().a();
    if (MusicService.E0 != null && MusicService.F0)
      MusicService.E0.L(); 
  }
  
  public final int d() {
    switch (this.d) {
      default:
        j = gj0.m(0, 3);
        i = gj0.m(2, 3);
        return j | i;
      case 1:
        j = gj0.m(0, 3) | gj0.m(2, 3);
        i = gj0.m(1, 8);
        return j | i;
      case 0:
        break;
    } 
    int j = gj0.m(0, 3);
    int i = gj0.m(2, 3);
    return j | i;
  }
  
  public boolean k() {
    switch (this.d) {
      default:
        return super.k();
      case 1:
        break;
    } 
    return false;
  }
  
  public boolean l() {
    switch (this.d) {
      default:
        return super.l();
      case 2:
        return false;
      case 1:
        break;
    } 
    return false;
  }
  
  public final boolean o(RecyclerView paramRecyclerView, he1 paramhe11, he1 paramhe12) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: istore #4
    //   6: iconst_1
    //   7: istore #9
    //   9: iconst_1
    //   10: istore #10
    //   12: aload_0
    //   13: getfield e : Ljava/lang/Object;
    //   16: astore #11
    //   18: iconst_0
    //   19: istore #5
    //   21: iconst_0
    //   22: istore #6
    //   24: iload #4
    //   26: tableswitch default -> 48, 0 -> 706, 1 -> 418
    //   48: aload #11
    //   50: checkcast bt1
    //   53: astore #12
    //   55: aload #12
    //   57: getfield B0 : Ljava/util/ArrayList;
    //   60: astore #11
    //   62: aload_2
    //   63: invokevirtual c : ()I
    //   66: istore #5
    //   68: aload_3
    //   69: invokevirtual c : ()I
    //   72: istore #6
    //   74: iload #5
    //   76: iload #6
    //   78: if_icmpge -> 103
    //   81: iload #6
    //   83: istore #4
    //   85: iload #6
    //   87: iload #5
    //   89: isub
    //   90: iconst_1
    //   91: if_icmple -> 129
    //   94: iload #5
    //   96: iconst_1
    //   97: iadd
    //   98: istore #4
    //   100: goto -> 129
    //   103: iload #5
    //   105: iload #6
    //   107: if_icmple -> 243
    //   110: iload #6
    //   112: istore #4
    //   114: iload #5
    //   116: iload #6
    //   118: isub
    //   119: iconst_1
    //   120: if_icmple -> 129
    //   123: iload #5
    //   125: iconst_1
    //   126: isub
    //   127: istore #4
    //   129: aload_1
    //   130: invokevirtual getAdapter : ()Lid1;
    //   133: iload #5
    //   135: invokevirtual f : (I)I
    //   138: istore #8
    //   140: aload_1
    //   141: invokevirtual getAdapter : ()Lid1;
    //   144: iload #4
    //   146: invokevirtual f : (I)I
    //   149: istore #7
    //   151: iload #5
    //   153: ifeq -> 243
    //   156: iload #5
    //   158: iconst_1
    //   159: if_icmpeq -> 243
    //   162: iload #4
    //   164: ifeq -> 243
    //   167: iload #4
    //   169: iconst_1
    //   170: if_icmpne -> 176
    //   173: goto -> 243
    //   176: iload #5
    //   178: aload #12
    //   180: getfield C0 : I
    //   183: if_icmple -> 195
    //   186: iload #5
    //   188: iconst_1
    //   189: isub
    //   190: istore #6
    //   192: goto -> 199
    //   195: iload #5
    //   197: istore #6
    //   199: aload #11
    //   201: iload #6
    //   203: invokevirtual get : (I)Ljava/lang/Object;
    //   206: checkcast java/lang/Integer
    //   209: invokevirtual intValue : ()I
    //   212: iconst_5
    //   213: if_icmpne -> 249
    //   216: aload #12
    //   218: getfield C0 : I
    //   221: istore #6
    //   223: iload #4
    //   225: iload #6
    //   227: if_icmplt -> 249
    //   230: iload #5
    //   232: iload #6
    //   234: if_icmpge -> 249
    //   237: ldc 2131887101
    //   239: iconst_0
    //   240: invokestatic O0 : (II)V
    //   243: iconst_0
    //   244: istore #9
    //   246: goto -> 415
    //   249: iload #7
    //   251: iconst_2
    //   252: if_icmpne -> 293
    //   255: aload #12
    //   257: getfield C0 : I
    //   260: istore #6
    //   262: iload #5
    //   264: iload #4
    //   266: if_icmple -> 281
    //   269: aload #12
    //   271: iload #6
    //   273: iconst_1
    //   274: iadd
    //   275: putfield C0 : I
    //   278: goto -> 393
    //   281: aload #12
    //   283: iload #6
    //   285: iconst_1
    //   286: isub
    //   287: putfield C0 : I
    //   290: goto -> 393
    //   293: iload #8
    //   295: iconst_2
    //   296: if_icmpne -> 337
    //   299: aload #12
    //   301: getfield C0 : I
    //   304: istore #6
    //   306: iload #5
    //   308: iload #4
    //   310: if_icmple -> 325
    //   313: aload #12
    //   315: iload #6
    //   317: iconst_1
    //   318: isub
    //   319: putfield C0 : I
    //   322: goto -> 393
    //   325: aload #12
    //   327: iload #6
    //   329: iconst_1
    //   330: iadd
    //   331: putfield C0 : I
    //   334: goto -> 393
    //   337: aload #12
    //   339: getfield C0 : I
    //   342: istore #7
    //   344: iload #5
    //   346: iload #7
    //   348: if_icmple -> 360
    //   351: iload #5
    //   353: iconst_1
    //   354: isub
    //   355: istore #6
    //   357: goto -> 364
    //   360: iload #5
    //   362: istore #6
    //   364: iload #4
    //   366: iload #7
    //   368: if_icmple -> 380
    //   371: iload #4
    //   373: iconst_1
    //   374: isub
    //   375: istore #7
    //   377: goto -> 384
    //   380: iload #4
    //   382: istore #7
    //   384: aload #11
    //   386: iload #6
    //   388: iload #7
    //   390: invokestatic swap : (Ljava/util/List;II)V
    //   393: aload #12
    //   395: getfield D0 : Landroidx/recyclerview/widget/RecyclerView;
    //   398: invokevirtual getAdapter : ()Lid1;
    //   401: getfield a : Ljd1;
    //   404: iload #5
    //   406: iload #4
    //   408: invokevirtual c : (II)V
    //   411: iload #10
    //   413: istore #9
    //   415: iload #9
    //   417: ireturn
    //   418: aload #11
    //   420: checkcast in/krosbits/musicolet/PlaylistEditActivity
    //   423: astore_1
    //   424: getstatic in/krosbits/musicolet/PlaylistEditActivity.r0 : Ljava/util/ArrayList;
    //   427: astore #11
    //   429: aload_2
    //   430: invokevirtual c : ()I
    //   433: istore #7
    //   435: aload_3
    //   436: invokevirtual c : ()I
    //   439: istore #5
    //   441: iload #5
    //   443: iflt -> 704
    //   446: iload #7
    //   448: iflt -> 704
    //   451: iload #7
    //   453: iload #5
    //   455: if_icmpge -> 480
    //   458: iload #5
    //   460: istore #4
    //   462: iload #5
    //   464: iload #7
    //   466: isub
    //   467: iconst_1
    //   468: if_icmple -> 506
    //   471: iload #7
    //   473: iconst_1
    //   474: iadd
    //   475: istore #4
    //   477: goto -> 506
    //   480: iload #7
    //   482: iload #5
    //   484: if_icmple -> 704
    //   487: iload #5
    //   489: istore #4
    //   491: iload #7
    //   493: iload #5
    //   495: isub
    //   496: iconst_1
    //   497: if_icmple -> 506
    //   500: iload #7
    //   502: iconst_1
    //   503: isub
    //   504: istore #4
    //   506: aload_1
    //   507: getfield e0 : Ljava/util/ArrayList;
    //   510: ifnull -> 580
    //   513: aload_1
    //   514: getfield g0 : I
    //   517: istore #8
    //   519: iload #7
    //   521: iload #8
    //   523: if_icmpne -> 532
    //   526: iconst_1
    //   527: istore #5
    //   529: goto -> 535
    //   532: iconst_0
    //   533: istore #5
    //   535: iload #4
    //   537: iload #8
    //   539: if_icmpne -> 545
    //   542: iconst_1
    //   543: istore #6
    //   545: iload #5
    //   547: iload #6
    //   549: if_icmpeq -> 685
    //   552: iload #5
    //   554: ifeq -> 566
    //   557: aload_1
    //   558: iload #4
    //   560: putfield g0 : I
    //   563: goto -> 572
    //   566: aload_1
    //   567: iload #7
    //   569: putfield g0 : I
    //   572: aload_1
    //   573: iconst_1
    //   574: putfield h0 : Z
    //   577: goto -> 685
    //   580: aload_1
    //   581: getfield U : Ljava/util/HashSet;
    //   584: iload #7
    //   586: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   589: invokevirtual contains : (Ljava/lang/Object;)Z
    //   592: istore #10
    //   594: aload_1
    //   595: getfield U : Ljava/util/HashSet;
    //   598: iload #4
    //   600: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   603: invokevirtual contains : (Ljava/lang/Object;)Z
    //   606: istore #9
    //   608: aload_1
    //   609: getfield T : Ljava/util/ArrayList;
    //   612: iload #7
    //   614: iload #4
    //   616: invokestatic swap : (Ljava/util/List;II)V
    //   619: iload #10
    //   621: iload #9
    //   623: if_icmpeq -> 685
    //   626: aload_1
    //   627: getfield U : Ljava/util/HashSet;
    //   630: astore_2
    //   631: iload #10
    //   633: ifeq -> 662
    //   636: aload_2
    //   637: iload #7
    //   639: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   642: invokevirtual remove : (Ljava/lang/Object;)Z
    //   645: pop
    //   646: aload_1
    //   647: getfield U : Ljava/util/HashSet;
    //   650: iload #4
    //   652: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   655: invokevirtual add : (Ljava/lang/Object;)Z
    //   658: pop
    //   659: goto -> 685
    //   662: aload_2
    //   663: iload #4
    //   665: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   668: invokevirtual remove : (Ljava/lang/Object;)Z
    //   671: pop
    //   672: aload_1
    //   673: getfield U : Ljava/util/HashSet;
    //   676: iload #7
    //   678: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   681: invokevirtual add : (Ljava/lang/Object;)Z
    //   684: pop
    //   685: aload_1
    //   686: getfield d0 : La3;
    //   689: getfield a : Ljd1;
    //   692: iload #7
    //   694: iload #4
    //   696: invokevirtual c : (II)V
    //   699: aload_1
    //   700: iconst_1
    //   701: putfield V : Z
    //   704: iconst_1
    //   705: ireturn
    //   706: aload #11
    //   708: checkcast oz
    //   711: astore #12
    //   713: aload_2
    //   714: invokevirtual c : ()I
    //   717: istore #7
    //   719: aload_3
    //   720: invokevirtual c : ()I
    //   723: istore #6
    //   725: iload #7
    //   727: iflt -> 1087
    //   730: iload #6
    //   732: iflt -> 1087
    //   735: iload #7
    //   737: iload #6
    //   739: if_icmpge -> 764
    //   742: iload #6
    //   744: istore #4
    //   746: iload #6
    //   748: iload #7
    //   750: isub
    //   751: iconst_1
    //   752: if_icmple -> 790
    //   755: iload #7
    //   757: iconst_1
    //   758: iadd
    //   759: istore #4
    //   761: goto -> 790
    //   764: iload #7
    //   766: iload #6
    //   768: if_icmple -> 1087
    //   771: iload #6
    //   773: istore #4
    //   775: iload #7
    //   777: iload #6
    //   779: isub
    //   780: iconst_1
    //   781: if_icmple -> 790
    //   784: iload #7
    //   786: iconst_1
    //   787: isub
    //   788: istore #4
    //   790: aload_2
    //   791: checkcast nz
    //   794: getfield w : Landroid/widget/TextView;
    //   797: iload #4
    //   799: iconst_1
    //   800: iadd
    //   801: invokestatic valueOf : (I)Ljava/lang/String;
    //   804: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   807: aload_3
    //   808: checkcast nz
    //   811: getfield w : Landroid/widget/TextView;
    //   814: iload #7
    //   816: iconst_1
    //   817: iadd
    //   818: invokestatic valueOf : (I)Ljava/lang/String;
    //   821: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   824: aload_1
    //   825: invokevirtual getChildCount : ()I
    //   828: istore #6
    //   830: iload #5
    //   832: iload #6
    //   834: if_icmpge -> 891
    //   837: aload_1
    //   838: aload_1
    //   839: iload #5
    //   841: invokevirtual getChildAt : (I)Landroid/view/View;
    //   844: invokevirtual N : (Landroid/view/View;)Lhe1;
    //   847: astore #11
    //   849: aload #11
    //   851: aload_2
    //   852: if_acmpeq -> 885
    //   855: aload #11
    //   857: aload_3
    //   858: if_acmpne -> 864
    //   861: goto -> 885
    //   864: aload #11
    //   866: checkcast nz
    //   869: getfield w : Landroid/widget/TextView;
    //   872: aload #11
    //   874: invokevirtual c : ()I
    //   877: iconst_1
    //   878: iadd
    //   879: invokestatic valueOf : (I)Ljava/lang/String;
    //   882: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   885: iinc #5, 1
    //   888: goto -> 830
    //   891: iload #7
    //   893: iload #4
    //   895: if_icmpge -> 931
    //   898: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   901: istore #10
    //   903: invokestatic h : ()Lwk1;
    //   906: getfield b : Ljava/util/Stack;
    //   909: iload #7
    //   911: invokestatic h : ()Lwk1;
    //   914: getfield b : Ljava/util/Stack;
    //   917: iload #4
    //   919: invokevirtual remove : (I)Ljava/lang/Object;
    //   922: checkcast xn1
    //   925: invokevirtual add : (ILjava/lang/Object;)V
    //   928: goto -> 961
    //   931: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   934: istore #10
    //   936: invokestatic h : ()Lwk1;
    //   939: getfield b : Ljava/util/Stack;
    //   942: iload #4
    //   944: invokestatic h : ()Lwk1;
    //   947: getfield b : Ljava/util/Stack;
    //   950: iload #7
    //   952: invokevirtual remove : (I)Ljava/lang/Object;
    //   955: checkcast xn1
    //   958: invokevirtual add : (ILjava/lang/Object;)V
    //   961: iload #7
    //   963: invokestatic h : ()Lwk1;
    //   966: getfield c : I
    //   969: if_icmpne -> 983
    //   972: invokestatic h : ()Lwk1;
    //   975: iload #4
    //   977: putfield c : I
    //   980: goto -> 1002
    //   983: iload #4
    //   985: invokestatic h : ()Lwk1;
    //   988: getfield c : I
    //   991: if_icmpne -> 1002
    //   994: invokestatic h : ()Lwk1;
    //   997: iload #7
    //   999: putfield c : I
    //   1002: invokestatic h : ()Lwk1;
    //   1005: getfield b : Ljava/util/Stack;
    //   1008: iload #7
    //   1010: invokevirtual get : (I)Ljava/lang/Object;
    //   1013: aload #12
    //   1015: getfield j : Lxn1;
    //   1018: if_acmpne -> 1034
    //   1021: aload #12
    //   1023: getfield b : Lbh0;
    //   1026: iload #7
    //   1028: invokevirtual x : (I)V
    //   1031: goto -> 1063
    //   1034: invokestatic h : ()Lwk1;
    //   1037: getfield b : Ljava/util/Stack;
    //   1040: iload #4
    //   1042: invokevirtual get : (I)Ljava/lang/Object;
    //   1045: aload #12
    //   1047: getfield j : Lxn1;
    //   1050: if_acmpne -> 1063
    //   1053: aload #12
    //   1055: getfield b : Lbh0;
    //   1058: iload #4
    //   1060: invokevirtual x : (I)V
    //   1063: invokestatic h : ()Lwk1;
    //   1066: invokevirtual a : ()V
    //   1069: aload #12
    //   1071: getfield i : La3;
    //   1074: getfield a : Ljd1;
    //   1077: iload #7
    //   1079: iload #4
    //   1081: invokevirtual c : (II)V
    //   1084: goto -> 1090
    //   1087: iconst_0
    //   1088: istore #9
    //   1090: iload #9
    //   1092: ireturn
  }
  
  public final void p(he1 paramhe1) {
    int i;
    switch (this.d) {
      default:
        return;
      case 1:
        i = paramhe1.c();
        if (i >= 0) {
          PlaylistEditActivity playlistEditActivity = (PlaylistEditActivity)this.e;
          ArrayList arrayList = PlaylistEditActivity.r0;
          playlistEditActivity.p0(i);
        } 
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */