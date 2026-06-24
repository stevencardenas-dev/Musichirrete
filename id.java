import android.text.TextUtils;

public final class id implements fc, ec, dc {
  public final kd b;
  
  public void E(hc paramhc) {
    StringBuilder stringBuilder = new StringBuilder("bpp>ip:");
    stringBuilder.append(paramhc);
    n21.F(stringBuilder.toString());
    kd kd1 = this.b;
    if (paramhc == kd1.n) {
      kd1.s = true;
      if (TextUtils.equals(kd1.l.a(), kd.h0(kd1))) {
        boolean bool = kd1.t;
        if (bool || kd1.u > 0) {
          boolean bool1 = bool;
          if (bool) {
            bool1 = bool;
            try {
              if (kd1.u > 0) {
                bool1 = bool;
                if (kd1.n.C() > kd1.u * 2) {
                  bool1 = bool;
                  if (kd1.m.C() > kd1.u)
                    bool1 = false; 
                } 
              } 
            } finally {
              Exception exception;
            } 
          } 
          if (bool1) {
            if (kd1.o == 1) {
              ((n4)kd1.m).m.setNextMediaPlayer(((n4)kd1.n).m);
              kd1.r = true;
              kd1.n.c0(100);
            } 
          } else if (kd1.u > 0 && kd1.n.C() > kd1.u * 2 && kd1.m.C() > kd1.u) {
            kd1.r = true;
            kd1.k0();
            kd1.n.c0(0);
          } 
        } 
      } else {
        StringBuilder stringBuilder1 = new StringBuilder("bpp>ip?ne:");
        stringBuilder1.append(paramhc);
        n21.F(stringBuilder1.toString());
        kd1.L();
      } 
    } 
    if (paramhc == kd1.m) {
      fc fc1 = kd1.c;
      if (fc1 != null && j50.a > 0)
        fc1.E(kd1); 
      if (kd1.t || kd1.u > 0) {
        StringBuilder stringBuilder1 = new StringBuilder("bpp>ip?1:");
        stringBuilder1.append(paramhc);
        n21.F(stringBuilder1.toString());
        kd1.L();
      } 
    } 
  }
  
  public void s(hc paramhc) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc 'bpp>ic:'
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: astore #6
    //   11: aload #6
    //   13: aload_1
    //   14: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: aload #6
    //   20: invokevirtual toString : ()Ljava/lang/String;
    //   23: invokestatic F : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield b : Lkd;
    //   30: astore #6
    //   32: aload_1
    //   33: aload #6
    //   35: getfield m : Lhc;
    //   38: if_acmpne -> 776
    //   41: aload #6
    //   43: aconst_null
    //   44: putfield q : Ljava/lang/String;
    //   47: aload #6
    //   49: invokestatic h0 : (Lkd;)Ljava/lang/String;
    //   52: astore #6
    //   54: aload_0
    //   55: getfield b : Lkd;
    //   58: astore #7
    //   60: aload #7
    //   62: getfield r : Z
    //   65: ifeq -> 528
    //   68: aload #7
    //   70: getfield x : Z
    //   73: ifne -> 528
    //   76: aload #7
    //   78: iconst_0
    //   79: putfield r : Z
    //   82: aload #7
    //   84: getfield l : Lgc;
    //   87: invokeinterface a : ()Ljava/lang/String;
    //   92: astore #7
    //   94: aload #7
    //   96: aload #6
    //   98: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   101: ifeq -> 528
    //   104: aload_0
    //   105: getfield b : Lkd;
    //   108: astore #8
    //   110: aload #8
    //   112: getfield s : Z
    //   115: ifeq -> 528
    //   118: aload #8
    //   120: getfield u : I
    //   123: ifle -> 328
    //   126: aload #8
    //   128: getfield m : Lhc;
    //   131: invokevirtual C : ()I
    //   134: aload_0
    //   135: getfield b : Lkd;
    //   138: getfield m : Lhc;
    //   141: invokevirtual A : ()I
    //   144: isub
    //   145: istore #4
    //   147: aload_0
    //   148: getfield b : Lkd;
    //   151: getfield m : Lhc;
    //   154: astore #8
    //   156: aload #8
    //   158: instanceof w60
    //   161: ifeq -> 183
    //   164: aload #8
    //   166: checkcast w60
    //   169: getfield z : Lbn1;
    //   172: getfield c : Lp60;
    //   175: getfield j : Z
    //   178: istore #5
    //   180: goto -> 186
    //   183: iconst_1
    //   184: istore #5
    //   186: aload #8
    //   188: invokevirtual J : ()Z
    //   191: ifeq -> 223
    //   194: aload_0
    //   195: getfield b : Lkd;
    //   198: getfield m : Lhc;
    //   201: invokevirtual A : ()I
    //   204: sipush #1000
    //   207: if_icmple -> 223
    //   210: iload #4
    //   212: ifge -> 218
    //   215: goto -> 223
    //   218: iconst_0
    //   219: istore_2
    //   220: goto -> 228
    //   223: iconst_0
    //   224: istore #4
    //   226: iconst_1
    //   227: istore_2
    //   228: aload_0
    //   229: getfield b : Lkd;
    //   232: getfield n : Lhc;
    //   235: getfield b : Ljava/lang/String;
    //   238: astore #8
    //   240: iload_2
    //   241: istore_3
    //   242: aload #8
    //   244: ifnull -> 330
    //   247: iload_2
    //   248: istore_3
    //   249: aload #8
    //   251: aload #7
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifeq -> 330
    //   259: iload #4
    //   261: i2f
    //   262: aload_0
    //   263: getfield b : Lkd;
    //   266: getfield m : Lhc;
    //   269: invokevirtual E : ()F
    //   272: fdiv
    //   273: f2i
    //   274: istore #4
    //   276: aload_0
    //   277: getfield b : Lkd;
    //   280: getfield m : Lhc;
    //   283: astore #7
    //   285: aload #7
    //   287: iload #4
    //   289: iconst_0
    //   290: new e3
    //   293: dup
    //   294: iconst_3
    //   295: aload #7
    //   297: invokespecial <init> : (ILjava/lang/Object;)V
    //   300: invokevirtual N : (IILjava/lang/Runnable;)V
    //   303: iload_2
    //   304: istore_3
    //   305: iload #5
    //   307: ifeq -> 330
    //   310: aload_0
    //   311: getfield b : Lkd;
    //   314: getfield n : Lhc;
    //   317: iload #4
    //   319: iconst_0
    //   320: invokevirtual f0 : (II)V
    //   323: iload_2
    //   324: istore_3
    //   325: goto -> 330
    //   328: iconst_0
    //   329: istore_3
    //   330: aload_0
    //   331: getfield b : Lkd;
    //   334: astore #8
    //   336: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.ammXkuSBIi : Ljava/lang/String;
    //   339: astore #10
    //   341: aload #8
    //   343: getfield n : Lhc;
    //   346: instanceof w60
    //   349: ifeq -> 470
    //   352: ldc 'bpp:sp0'
    //   354: invokestatic F : (Ljava/lang/String;)V
    //   357: aload #8
    //   359: getfield m : Lhc;
    //   362: astore #7
    //   364: aload #7
    //   366: monitorenter
    //   367: aload #8
    //   369: getfield m : Lhc;
    //   372: checkcast w60
    //   375: getfield m : Lfp;
    //   378: invokevirtual A : ()I
    //   381: iconst_2
    //   382: if_icmpne -> 459
    //   385: new java/lang/StringBuilder
    //   388: astore #9
    //   390: aload #9
    //   392: aload #10
    //   394: invokespecial <init> : (Ljava/lang/String;)V
    //   397: aload #9
    //   399: aload #8
    //   401: getfield m : Lhc;
    //   404: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   407: pop
    //   408: aload #9
    //   410: invokevirtual toString : ()Ljava/lang/String;
    //   413: invokestatic F : (Ljava/lang/String;)V
    //   416: aload #8
    //   418: getfield m : Lhc;
    //   421: astore #8
    //   423: aload #8
    //   425: aload #8
    //   427: checkcast w60
    //   430: getfield m : Lfp;
    //   433: iconst_1
    //   434: invokevirtual z : (I)Lur0;
    //   437: getfield i : Lad;
    //   440: invokevirtual f : ()Ljava/lang/Object;
    //   443: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   446: putfield b : Ljava/lang/String;
    //   449: aload #7
    //   451: monitorexit
    //   452: goto -> 500
    //   455: astore_1
    //   456: goto -> 465
    //   459: aload #7
    //   461: monitorexit
    //   462: goto -> 470
    //   465: aload #7
    //   467: monitorexit
    //   468: aload_1
    //   469: athrow
    //   470: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.NXLKbAZTtAzxaVh : Ljava/lang/String;
    //   473: invokestatic F : (Ljava/lang/String;)V
    //   476: aload #8
    //   478: getfield m : Lhc;
    //   481: astore #7
    //   483: aload #8
    //   485: aload #8
    //   487: getfield n : Lhc;
    //   490: putfield m : Lhc;
    //   493: aload #8
    //   495: aload #7
    //   497: putfield n : Lhc;
    //   500: aload_0
    //   501: getfield b : Lkd;
    //   504: astore #7
    //   506: aload #7
    //   508: iconst_1
    //   509: putfield p : Z
    //   512: aload #7
    //   514: iconst_1
    //   515: putfield w : Z
    //   518: aload #7
    //   520: aload #6
    //   522: putfield b : Ljava/lang/String;
    //   525: goto -> 530
    //   528: iconst_0
    //   529: istore_3
    //   530: aload_0
    //   531: getfield b : Lkd;
    //   534: astore #7
    //   536: aload #7
    //   538: getfield e : Ldc;
    //   541: astore #6
    //   543: aload #6
    //   545: ifnull -> 557
    //   548: aload #6
    //   550: aload #7
    //   552: invokeinterface s : (Lhc;)V
    //   557: aload_0
    //   558: getfield b : Lkd;
    //   561: astore #6
    //   563: aload #6
    //   565: getfield p : Z
    //   568: ifeq -> 640
    //   571: aload #6
    //   573: getfield c : Lfc;
    //   576: astore #7
    //   578: aload #7
    //   580: ifnull -> 640
    //   583: aload #7
    //   585: aload #6
    //   587: invokeinterface E : (Lhc;)V
    //   592: aload_0
    //   593: getfield b : Lkd;
    //   596: astore #7
    //   598: aload #7
    //   600: getfield m : Lhc;
    //   603: instanceof w60
    //   606: ifeq -> 640
    //   609: getstatic kd.H : Landroid/os/Handler;
    //   612: astore #6
    //   614: aload #6
    //   616: aload #7
    //   618: getfield G : Ljd;
    //   621: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   624: aload #6
    //   626: aload_0
    //   627: getfield b : Lkd;
    //   630: getfield G : Ljd;
    //   633: ldc2_w 1500
    //   636: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   639: pop
    //   640: aload_0
    //   641: getfield b : Lkd;
    //   644: astore #6
    //   646: aload #6
    //   648: iconst_0
    //   649: putfield w : Z
    //   652: aload #6
    //   654: getfield p : Z
    //   657: ifeq -> 848
    //   660: aload #6
    //   662: getfield u : I
    //   665: ifeq -> 672
    //   668: iload_3
    //   669: ifeq -> 848
    //   672: aload #6
    //   674: iconst_0
    //   675: putfield p : Z
    //   678: aload #6
    //   680: getfield m : Lhc;
    //   683: astore #6
    //   685: aload #6
    //   687: instanceof w60
    //   690: ifeq -> 741
    //   693: aload #6
    //   695: checkcast w60
    //   698: getfield m : Lfp;
    //   701: astore #6
    //   703: aload #6
    //   705: invokevirtual A : ()I
    //   708: iconst_2
    //   709: if_icmpne -> 741
    //   712: aload #6
    //   714: monitorenter
    //   715: aload #6
    //   717: iconst_0
    //   718: invokevirtual z : (I)Lur0;
    //   721: pop
    //   722: aload #6
    //   724: iconst_0
    //   725: iconst_1
    //   726: invokevirtual C : (II)V
    //   729: aload #6
    //   731: monitorexit
    //   732: goto -> 741
    //   735: astore_1
    //   736: aload #6
    //   738: monitorexit
    //   739: aload_1
    //   740: athrow
    //   741: new java/lang/StringBuilder
    //   744: dup
    //   745: ldc_w 'bpp>ic?1:'
    //   748: invokespecial <init> : (Ljava/lang/String;)V
    //   751: astore #6
    //   753: aload #6
    //   755: aload_1
    //   756: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload #6
    //   762: invokevirtual toString : ()Ljava/lang/String;
    //   765: invokestatic F : (Ljava/lang/String;)V
    //   768: aload_0
    //   769: getfield b : Lkd;
    //   772: invokevirtual L : ()V
    //   775: return
    //   776: aload_1
    //   777: aload #6
    //   779: getfield n : Lhc;
    //   782: if_acmpne -> 848
    //   785: aload #6
    //   787: iconst_0
    //   788: putfield p : Z
    //   791: new java/lang/StringBuilder
    //   794: dup
    //   795: ldc_w 'bpp>ic?2:'
    //   798: invokespecial <init> : (Ljava/lang/String;)V
    //   801: astore #6
    //   803: aload #6
    //   805: aload_1
    //   806: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   809: pop
    //   810: aload #6
    //   812: invokevirtual toString : ()Ljava/lang/String;
    //   815: invokestatic F : (Ljava/lang/String;)V
    //   818: aload_0
    //   819: getfield b : Lkd;
    //   822: invokevirtual L : ()V
    //   825: aload_0
    //   826: getfield b : Lkd;
    //   829: astore_1
    //   830: aload_1
    //   831: getfield x : Z
    //   834: ifeq -> 848
    //   837: aload_1
    //   838: aload_1
    //   839: getfield m : Lhc;
    //   842: getfield b : Ljava/lang/String;
    //   845: invokevirtual m0 : (Ljava/lang/String;)V
    //   848: return
    // Exception table:
    //   from	to	target	type
    //   367	452	455	finally
    //   459	462	455	finally
    //   465	468	455	finally
    //   715	729	735	finally
    //   736	739	735	finally
  }
  
  public boolean v(hc paramhc, int paramInt1, int paramInt2) {
    kd kd1 = this.b;
    hc hc1 = kd1.m;
    if (paramhc == hc1) {
      int i = kd1.D;
      if (i < 1 && ((paramInt1 == 1 && paramInt2 == -32) || (paramInt1 == 100 && paramInt2 == 1))) {
        String str = hc1.b;
        if (str != null) {
          kd1.D = i + 1;
          hc1.P();
          try {
            return true;
          } finally {
            str = null;
            str.printStackTrace();
          } 
        } 
      } 
    } 
    ec ec1 = kd1.f;
    if (ec1 != null)
      ec1.v(kd1, paramInt1, paramInt2); 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */