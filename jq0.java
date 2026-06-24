public final class jq0 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final mq0 i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((jq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((jq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((jq0)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.i;
    switch (i) {
      default:
        return new jq0((mq0)paramObject, paramcs, 2);
      case 1:
        return new jq0((mq0)paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new jq0((mq0)paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic l02.a : Ll02;
    //   8: astore #4
    //   10: aload_0
    //   11: getfield i : Lmq0;
    //   14: astore #9
    //   16: getstatic ys.b : Lys;
    //   19: astore_3
    //   20: aconst_null
    //   21: astore #7
    //   23: iload_2
    //   24: tableswitch default -> 48, 0 -> 384, 1 -> 114
    //   48: aload_0
    //   49: getfield h : I
    //   52: istore_2
    //   53: iload_2
    //   54: ifeq -> 80
    //   57: iload_2
    //   58: iconst_1
    //   59: if_icmpne -> 69
    //   62: aload_1
    //   63: invokestatic r0 : (Ljava/lang/Object;)V
    //   66: goto -> 111
    //   69: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   71: invokestatic f : (Ljava/lang/String;)V
    //   74: aconst_null
    //   75: astore #4
    //   77: goto -> 111
    //   80: aload_1
    //   81: invokestatic r0 : (Ljava/lang/Object;)V
    //   84: getstatic cq0.a : Lcs1;
    //   87: astore_1
    //   88: aload #9
    //   90: getfield C0 : Lkm0;
    //   93: astore_1
    //   94: aload_0
    //   95: iconst_1
    //   96: putfield h : I
    //   99: aload_1
    //   100: aload_0
    //   101: invokestatic f : (Lkm0;Lpr1;)Ljava/lang/Object;
    //   104: aload_3
    //   105: if_acmpne -> 111
    //   108: aload_3
    //   109: astore #4
    //   111: aload #4
    //   113: areturn
    //   114: aload #9
    //   116: getfield C0 : Lkm0;
    //   119: astore #8
    //   121: aload_0
    //   122: getfield h : I
    //   125: istore_2
    //   126: iload_2
    //   127: ifeq -> 165
    //   130: iload_2
    //   131: iconst_1
    //   132: if_icmpeq -> 158
    //   135: iload_2
    //   136: iconst_2
    //   137: if_icmpne -> 147
    //   140: aload_1
    //   141: invokestatic r0 : (Ljava/lang/Object;)V
    //   144: goto -> 381
    //   147: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   149: invokestatic f : (Ljava/lang/String;)V
    //   152: aconst_null
    //   153: astore #4
    //   155: goto -> 381
    //   158: aload_1
    //   159: invokestatic r0 : (Ljava/lang/Object;)V
    //   162: goto -> 191
    //   165: aload_1
    //   166: invokestatic r0 : (Ljava/lang/Object;)V
    //   169: getstatic cq0.a : Lcs1;
    //   172: astore_1
    //   173: aload_0
    //   174: iconst_1
    //   175: putfield h : I
    //   178: aload #8
    //   180: aload_0
    //   181: invokestatic f : (Lkm0;Lpr1;)Ljava/lang/Object;
    //   184: aload_3
    //   185: if_acmpne -> 191
    //   188: goto -> 378
    //   191: aload #9
    //   193: getfield G0 : Lwy;
    //   196: getfield i : Ljava/lang/Object;
    //   199: checkcast com/google/android/material/radiobutton/MaterialRadioButton
    //   202: invokevirtual isChecked : ()Z
    //   205: ifeq -> 216
    //   208: getstatic iq0.e : Liq0;
    //   211: astore #5
    //   213: goto -> 224
    //   216: getstatic iq0.c : Liq0;
    //   219: astore #5
    //   221: goto -> 213
    //   224: getstatic cq0.a : Lcs1;
    //   227: astore_1
    //   228: invokestatic o : ()Liq0;
    //   231: astore #10
    //   233: aload #9
    //   235: getfield E0 : Lv00;
    //   238: astore_1
    //   239: aload_1
    //   240: ifnull -> 275
    //   243: aload_1
    //   244: invokevirtual j : ()Landroid/net/Uri;
    //   247: astore_1
    //   248: aload_1
    //   249: ifnull -> 275
    //   252: aload_1
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: astore #6
    //   258: aload #6
    //   260: astore_1
    //   261: aload #6
    //   263: ifnonnull -> 269
    //   266: goto -> 275
    //   269: aload_1
    //   270: astore #6
    //   272: goto -> 296
    //   275: aload #9
    //   277: getfield J0 : Laq0;
    //   280: astore_1
    //   281: aload_1
    //   282: ifnull -> 293
    //   285: aload_1
    //   286: invokevirtual e : ()Ljava/lang/String;
    //   289: astore_1
    //   290: goto -> 269
    //   293: aconst_null
    //   294: astore #6
    //   296: aload #9
    //   298: getfield E0 : Lv00;
    //   301: astore_1
    //   302: aload_1
    //   303: ifnull -> 321
    //   306: aload_1
    //   307: invokevirtual h : ()Ljava/lang/String;
    //   310: astore_1
    //   311: aload_1
    //   312: ifnonnull -> 318
    //   315: goto -> 321
    //   318: goto -> 342
    //   321: aload #9
    //   323: getfield J0 : Laq0;
    //   326: astore #9
    //   328: aload #7
    //   330: astore_1
    //   331: aload #9
    //   333: ifnull -> 342
    //   336: aload #9
    //   338: invokevirtual d : ()Ljava/lang/String;
    //   341: astore_1
    //   342: new aq0
    //   345: dup
    //   346: aload #5
    //   348: aload #10
    //   350: aload #5
    //   352: aconst_null
    //   353: aconst_null
    //   354: aconst_null
    //   355: aload #6
    //   357: aload_1
    //   358: invokespecial <init> : (Liq0;Liq0;Liq0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   361: astore_1
    //   362: aload_0
    //   363: iconst_2
    //   364: putfield h : I
    //   367: aload #8
    //   369: aload_1
    //   370: aload_0
    //   371: invokestatic p : (Lkm0;Laq0;Lpr1;)Ljava/lang/Object;
    //   374: aload_3
    //   375: if_acmpne -> 381
    //   378: aload_3
    //   379: astore #4
    //   381: aload #4
    //   383: areturn
    //   384: aload_0
    //   385: getfield h : I
    //   388: istore_2
    //   389: iload_2
    //   390: ifeq -> 416
    //   393: iload_2
    //   394: iconst_1
    //   395: if_icmpne -> 405
    //   398: aload_1
    //   399: invokestatic r0 : (Ljava/lang/Object;)V
    //   402: goto -> 438
    //   405: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   407: invokestatic f : (Ljava/lang/String;)V
    //   410: aconst_null
    //   411: astore #4
    //   413: goto -> 438
    //   416: aload_1
    //   417: invokestatic r0 : (Ljava/lang/Object;)V
    //   420: aload_0
    //   421: iconst_1
    //   422: putfield h : I
    //   425: aload #9
    //   427: aload_0
    //   428: invokestatic r : (Lmq0;Lds;)Ljava/lang/Object;
    //   431: aload_3
    //   432: if_acmpne -> 438
    //   435: aload_3
    //   436: astore #4
    //   438: aload #4
    //   440: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */