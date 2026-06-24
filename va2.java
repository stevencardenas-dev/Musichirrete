public final class va2 implements c41 {
  public final oe0 b;
  
  public final int c;
  
  public final m5 e;
  
  public final long f;
  
  public final long g;
  
  public va2(oe0 paramoe0, int paramInt, m5 paramm5, long paramLong1, long paramLong2) {
    this.b = paramoe0;
    this.c = paramInt;
    this.e = paramm5;
    this.f = paramLong1;
    this.g = paramLong2;
  }
  
  public static wp a(qa2 paramqa2, yc paramyc, int paramInt) {
    wp wp;
    gn2 gn2 = paramyc.w;
    if (gn2 == null) {
      gn2 = null;
    } else {
      wp = gn2.f;
    } 
    if (wp != null && wp.c) {
      int[] arrayOfInt = wp.f;
      byte b1 = 0;
      byte b2 = 0;
      if (arrayOfInt == null) {
        arrayOfInt = wp.h;
        b1 = b2;
        if (arrayOfInt != null)
          while (b1 < arrayOfInt.length) {
            if (arrayOfInt[b1] == paramInt)
              break label27; 
            b1++;
          }  
      } else {
        label27: while (true) {
          if (b1 < arrayOfInt.length) {
            if (arrayOfInt[b1] != paramInt) {
              b1++;
              continue;
            } 
          } else {
            break;
          } 
          if (paramqa2.p < wp.g)
            return wp; 
          break;
        } 
        return null;
      } 
    } else {
      return null;
    } 
    if (paramqa2.p < wp.g)
      return wp; 
    break;
  }
  
  public final void q(du2 paramdu2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Loe0;
    //   4: astore #21
    //   6: aload #21
    //   8: invokevirtual e : ()Z
    //   11: ifne -> 17
    //   14: goto -> 467
    //   17: invokestatic n : ()Lgh1;
    //   20: getfield c : Ljava/lang/Object;
    //   23: checkcast hh1
    //   26: astore #22
    //   28: aload #22
    //   30: ifnull -> 41
    //   33: aload #22
    //   35: getfield c : Z
    //   38: ifeq -> 467
    //   41: aload_0
    //   42: getfield e : Lm5;
    //   45: astore #23
    //   47: aload #21
    //   49: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   52: aload #23
    //   54: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast qa2
    //   60: astore #23
    //   62: aload #23
    //   64: ifnull -> 467
    //   67: aload #23
    //   69: getfield f : Lhe0;
    //   72: astore #24
    //   74: aload #24
    //   76: instanceof yc
    //   79: ifeq -> 467
    //   82: aload #24
    //   84: checkcast yc
    //   87: astore #24
    //   89: aload_0
    //   90: getfield f : J
    //   93: lstore #14
    //   95: lload #14
    //   97: lconst_0
    //   98: lcmp
    //   99: istore #13
    //   101: iconst_1
    //   102: istore #9
    //   104: iconst_0
    //   105: istore #4
    //   107: iload #13
    //   109: ifle -> 117
    //   112: iconst_1
    //   113: istore_3
    //   114: goto -> 119
    //   117: iconst_0
    //   118: istore_3
    //   119: aload #24
    //   121: getfield q : I
    //   124: istore #12
    //   126: aload #22
    //   128: ifnull -> 267
    //   131: iload_3
    //   132: aload #22
    //   134: getfield e : Z
    //   137: iand
    //   138: istore #11
    //   140: aload #22
    //   142: getfield f : I
    //   145: istore #8
    //   147: aload #22
    //   149: getfield g : I
    //   152: istore #10
    //   154: aload #22
    //   156: getfield b : I
    //   159: istore #5
    //   161: iload #5
    //   163: istore #6
    //   165: iload #11
    //   167: istore_3
    //   168: iload #8
    //   170: istore #7
    //   172: iload #10
    //   174: istore_2
    //   175: aload #24
    //   177: getfield w : Lgn2;
    //   180: ifnull -> 264
    //   183: iload #5
    //   185: istore #6
    //   187: iload #11
    //   189: istore_3
    //   190: iload #8
    //   192: istore #7
    //   194: iload #10
    //   196: istore_2
    //   197: aload #24
    //   199: invokevirtual n : ()Z
    //   202: ifne -> 264
    //   205: aload #23
    //   207: aload #24
    //   209: aload_0
    //   210: getfield c : I
    //   213: invokestatic a : (Lqa2;Lyc;I)Lwp;
    //   216: astore #22
    //   218: aload #22
    //   220: ifnull -> 467
    //   223: aload #22
    //   225: getfield e : Z
    //   228: ifeq -> 242
    //   231: iload #13
    //   233: ifle -> 242
    //   236: iload #9
    //   238: istore_2
    //   239: goto -> 244
    //   242: iconst_0
    //   243: istore_2
    //   244: aload #22
    //   246: getfield g : I
    //   249: istore #6
    //   251: iload_2
    //   252: istore_3
    //   253: iload #6
    //   255: istore_2
    //   256: iload #8
    //   258: istore #7
    //   260: iload #5
    //   262: istore #6
    //   264: goto -> 281
    //   267: sipush #5000
    //   270: istore #7
    //   272: bipush #100
    //   274: istore_2
    //   275: iconst_0
    //   276: istore #6
    //   278: goto -> 264
    //   281: aload_1
    //   282: invokevirtual f : ()Z
    //   285: istore #20
    //   287: iconst_m1
    //   288: istore #8
    //   290: iload #20
    //   292: ifeq -> 301
    //   295: iconst_0
    //   296: istore #5
    //   298: goto -> 370
    //   301: aload_1
    //   302: invokevirtual d : ()Ljava/lang/Exception;
    //   305: astore_1
    //   306: aload_1
    //   307: instanceof l5
    //   310: ifeq -> 363
    //   313: aload_1
    //   314: checkcast l5
    //   317: getfield b : Lcom/google/android/gms/common/api/Status;
    //   320: astore_1
    //   321: aload_1
    //   322: getfield b : I
    //   325: istore #4
    //   327: aload_1
    //   328: getfield f : Lsp;
    //   331: astore_1
    //   332: aload_1
    //   333: ifnonnull -> 346
    //   336: iload #4
    //   338: istore #5
    //   340: iconst_m1
    //   341: istore #4
    //   343: goto -> 370
    //   346: aload_1
    //   347: getfield c : I
    //   350: istore #9
    //   352: iload #4
    //   354: istore #5
    //   356: iload #9
    //   358: istore #4
    //   360: goto -> 370
    //   363: bipush #101
    //   365: istore #4
    //   367: goto -> 336
    //   370: iload_3
    //   371: ifeq -> 396
    //   374: aload_0
    //   375: getfield g : J
    //   378: lstore #18
    //   380: invokestatic currentTimeMillis : ()J
    //   383: lstore #16
    //   385: invokestatic elapsedRealtime : ()J
    //   388: lload #18
    //   390: lsub
    //   391: l2i
    //   392: istore_3
    //   393: goto -> 408
    //   396: lconst_0
    //   397: lstore #14
    //   399: lconst_0
    //   400: lstore #16
    //   402: iload #8
    //   404: istore_3
    //   405: goto -> 393
    //   408: new wa2
    //   411: dup
    //   412: new px0
    //   415: dup
    //   416: aload_0
    //   417: getfield c : I
    //   420: iload #5
    //   422: iload #4
    //   424: lload #14
    //   426: lload #16
    //   428: aconst_null
    //   429: aconst_null
    //   430: iload #12
    //   432: iload_3
    //   433: invokespecial <init> : (IIIJJLjava/lang/String;Ljava/lang/String;II)V
    //   436: iload #6
    //   438: iload #7
    //   440: i2l
    //   441: iload_2
    //   442: invokespecial <init> : (Lpx0;IJI)V
    //   445: astore_1
    //   446: aload #21
    //   448: getfield o : Lcl;
    //   451: astore #21
    //   453: aload #21
    //   455: aload #21
    //   457: bipush #18
    //   459: aload_1
    //   460: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   463: invokevirtual sendMessage : (Landroid/os/Message;)Z
    //   466: pop
    //   467: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\va2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */