import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

public final class qe0 {
  public static qe0 a;
  
  public static final boolean a(PackageInfo paramPackageInfo) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 7
    //   4: goto -> 595
    //   7: ldc 'com.android.vending'
    //   9: aload_0
    //   10: getfield packageName : Ljava/lang/String;
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: ifne -> 39
    //   19: ldc 'com.google.android.gms'
    //   21: aload_0
    //   22: getfield packageName : Ljava/lang/String;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 34
    //   31: goto -> 39
    //   34: iconst_1
    //   35: istore_3
    //   36: goto -> 70
    //   39: aload_0
    //   40: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   43: astore #9
    //   45: aload #9
    //   47: ifnonnull -> 55
    //   50: iconst_0
    //   51: istore_3
    //   52: goto -> 70
    //   55: aload #9
    //   57: getfield flags : I
    //   60: sipush #129
    //   63: iand
    //   64: ifeq -> 50
    //   67: goto -> 34
    //   70: iload_3
    //   71: ifeq -> 82
    //   74: getstatic cp2.c : Lwd2;
    //   77: astore #10
    //   79: goto -> 87
    //   82: getstatic cp2.b : Lwd2;
    //   85: astore #10
    //   87: getstatic android/os/Build$VERSION.SDK_INT : I
    //   90: istore_1
    //   91: iload_1
    //   92: bipush #28
    //   94: if_icmpge -> 192
    //   97: aload_0
    //   98: getfield signatures : [Landroid/content/pm/Signature;
    //   101: astore #12
    //   103: aconst_null
    //   104: astore #11
    //   106: aload #11
    //   108: astore #9
    //   110: aload #12
    //   112: ifnull -> 135
    //   115: aload #11
    //   117: astore #9
    //   119: aload #12
    //   121: arraylength
    //   122: iconst_1
    //   123: if_icmpne -> 135
    //   126: aload #12
    //   128: iconst_0
    //   129: aaload
    //   130: invokevirtual toByteArray : ()[B
    //   133: astore #9
    //   135: aload #9
    //   137: ifnull -> 179
    //   140: getstatic sd2.f : Lfd2;
    //   143: astore #11
    //   145: iconst_1
    //   146: anewarray java/lang/Object
    //   149: astore #11
    //   151: aload #11
    //   153: iconst_0
    //   154: aload #9
    //   156: aastore
    //   157: iconst_1
    //   158: aload #11
    //   160: invokestatic i0 : (I[Ljava/lang/Object;)V
    //   163: new wd2
    //   166: astore #9
    //   168: aload #9
    //   170: iconst_1
    //   171: aload #11
    //   173: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   176: goto -> 434
    //   179: getstatic sd2.f : Lfd2;
    //   182: astore #9
    //   184: getstatic wd2.i : Lwd2;
    //   187: astore #9
    //   189: goto -> 434
    //   192: iload_1
    //   193: bipush #28
    //   195: if_icmplt -> 533
    //   198: aload_0
    //   199: getfield signingInfo : Landroid/content/pm/SigningInfo;
    //   202: astore #11
    //   204: aload #11
    //   206: ifnull -> 424
    //   209: aload #11
    //   211: invokevirtual hasMultipleSigners : ()Z
    //   214: ifne -> 424
    //   217: aload #11
    //   219: invokevirtual getSigningCertificateHistory : ()[Landroid/content/pm/Signature;
    //   222: ifnonnull -> 228
    //   225: goto -> 424
    //   228: getstatic sd2.f : Lfd2;
    //   231: astore #9
    //   233: iconst_4
    //   234: anewarray java/lang/Object
    //   237: astore #9
    //   239: aload #11
    //   241: invokevirtual getSigningCertificateHistory : ()[Landroid/content/pm/Signature;
    //   244: astore #11
    //   246: aload #11
    //   248: arraylength
    //   249: istore #8
    //   251: iconst_0
    //   252: istore #5
    //   254: iconst_0
    //   255: istore #4
    //   257: iload #5
    //   259: iload #8
    //   261: if_icmpge -> 395
    //   264: aload #11
    //   266: iload #5
    //   268: aaload
    //   269: invokevirtual toByteArray : ()[B
    //   272: astore #12
    //   274: aload #12
    //   276: invokevirtual getClass : ()Ljava/lang/Class;
    //   279: pop
    //   280: aload #9
    //   282: arraylength
    //   283: istore #7
    //   285: iload #4
    //   287: iconst_1
    //   288: iadd
    //   289: istore #6
    //   291: iload #6
    //   293: iflt -> 380
    //   296: iload #6
    //   298: iload #7
    //   300: if_icmpgt -> 309
    //   303: iload #7
    //   305: istore_2
    //   306: goto -> 346
    //   309: iload #7
    //   311: iconst_1
    //   312: ishr
    //   313: iload #7
    //   315: iadd
    //   316: iconst_1
    //   317: iadd
    //   318: istore_2
    //   319: iload_2
    //   320: istore_1
    //   321: iload_2
    //   322: iload #6
    //   324: if_icmpge -> 337
    //   327: iload #4
    //   329: invokestatic highestOneBit : (I)I
    //   332: istore_1
    //   333: iload_1
    //   334: iload_1
    //   335: iadd
    //   336: istore_1
    //   337: iload_1
    //   338: istore_2
    //   339: iload_1
    //   340: ifge -> 346
    //   343: ldc 2147483647
    //   345: istore_2
    //   346: iload_2
    //   347: iload #7
    //   349: if_icmpgt -> 355
    //   352: goto -> 363
    //   355: aload #9
    //   357: iload_2
    //   358: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   361: astore #9
    //   363: aload #9
    //   365: iload #4
    //   367: aload #12
    //   369: aastore
    //   370: iinc #5, 1
    //   373: iload #6
    //   375: istore #4
    //   377: goto -> 257
    //   380: new java/lang/IllegalArgumentException
    //   383: astore #9
    //   385: aload #9
    //   387: ldc 'cannot store more than Integer.MAX_VALUE elements'
    //   389: invokespecial <init> : (Ljava/lang/String;)V
    //   392: aload #9
    //   394: athrow
    //   395: iload #4
    //   397: ifne -> 408
    //   400: getstatic wd2.i : Lwd2;
    //   403: astore #9
    //   405: goto -> 434
    //   408: new wd2
    //   411: dup
    //   412: iload #4
    //   414: aload #9
    //   416: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   419: astore #9
    //   421: goto -> 405
    //   424: getstatic sd2.f : Lfd2;
    //   427: astore #9
    //   429: getstatic wd2.i : Lwd2;
    //   432: astore #9
    //   434: aload #9
    //   436: invokevirtual isEmpty : ()Z
    //   439: ifne -> 518
    //   442: aload #9
    //   444: invokevirtual g : ()Lsd2;
    //   447: astore #9
    //   449: aload #9
    //   451: invokeinterface size : ()I
    //   456: istore_2
    //   457: iconst_0
    //   458: istore_1
    //   459: iload_1
    //   460: iload_2
    //   461: if_icmpge -> 595
    //   464: aload #9
    //   466: iload_1
    //   467: invokeinterface get : (I)Ljava/lang/Object;
    //   472: checkcast [B
    //   475: astore #12
    //   477: aload #10
    //   479: iconst_0
    //   480: invokevirtual i : (I)Lfd2;
    //   483: astore #11
    //   485: aload #11
    //   487: invokevirtual hasNext : ()Z
    //   490: ifeq -> 512
    //   493: aload #12
    //   495: aload #11
    //   497: invokevirtual next : ()Ljava/lang/Object;
    //   500: checkcast [B
    //   503: invokestatic equals : ([B[B)Z
    //   506: ifeq -> 485
    //   509: goto -> 593
    //   512: iinc #1, 1
    //   515: goto -> 459
    //   518: new java/lang/IllegalArgumentException
    //   521: astore #9
    //   523: aload #9
    //   525: ldc 'Unable to obtain package certificate history.'
    //   527: invokespecial <init> : (Ljava/lang/String;)V
    //   530: aload #9
    //   532: athrow
    //   533: new java/lang/IllegalStateException
    //   536: astore #9
    //   538: aload #9
    //   540: invokespecial <init> : ()V
    //   543: aload #9
    //   545: athrow
    //   546: astore #9
    //   548: ldc 'GoogleSignatureVerifier'
    //   550: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.kRNWBrZhxDYlfb : Ljava/lang/String;
    //   553: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   556: pop
    //   557: iload_3
    //   558: ifeq -> 572
    //   561: aload_0
    //   562: getstatic cp2.a : [Lfn2;
    //   565: invokestatic b : (Landroid/content/pm/PackageInfo;[Lfn2;)Lfn2;
    //   568: astore_0
    //   569: goto -> 589
    //   572: aload_0
    //   573: iconst_1
    //   574: anewarray fn2
    //   577: dup
    //   578: iconst_0
    //   579: getstatic cp2.a : [Lfn2;
    //   582: iconst_0
    //   583: aaload
    //   584: aastore
    //   585: invokestatic b : (Landroid/content/pm/PackageInfo;[Lfn2;)Lfn2;
    //   588: astore_0
    //   589: aload_0
    //   590: ifnull -> 595
    //   593: iconst_1
    //   594: ireturn
    //   595: iconst_0
    //   596: ireturn
    // Exception table:
    //   from	to	target	type
    //   74	79	546	java/lang/IllegalArgumentException
    //   82	87	546	java/lang/IllegalArgumentException
    //   87	91	546	java/lang/IllegalArgumentException
    //   97	103	546	java/lang/IllegalArgumentException
    //   119	135	546	java/lang/IllegalArgumentException
    //   140	151	546	java/lang/IllegalArgumentException
    //   157	176	546	java/lang/IllegalArgumentException
    //   179	189	546	java/lang/IllegalArgumentException
    //   198	204	546	java/lang/IllegalArgumentException
    //   209	225	546	java/lang/IllegalArgumentException
    //   228	251	546	java/lang/IllegalArgumentException
    //   264	285	546	java/lang/IllegalArgumentException
    //   327	333	546	java/lang/IllegalArgumentException
    //   355	363	546	java/lang/IllegalArgumentException
    //   380	395	546	java/lang/IllegalArgumentException
    //   400	405	546	java/lang/IllegalArgumentException
    //   408	421	546	java/lang/IllegalArgumentException
    //   424	434	546	java/lang/IllegalArgumentException
    //   434	457	546	java/lang/IllegalArgumentException
    //   464	485	546	java/lang/IllegalArgumentException
    //   485	509	546	java/lang/IllegalArgumentException
    //   518	533	546	java/lang/IllegalArgumentException
    //   533	546	546	java/lang/IllegalArgumentException
  }
  
  public static fn2 b(PackageInfo paramPackageInfo, fn2... paramVarArgs) {
    Signature[] arrayOfSignature = paramPackageInfo.signatures;
    if (arrayOfSignature != null) {
      if (arrayOfSignature.length != 1) {
        Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        return null;
      } 
      Signature[] arrayOfSignature1 = paramPackageInfo.signatures;
      byte b = 0;
      yn2 yn2 = new yn2(arrayOfSignature1[0].toByteArray());
      while (b < paramVarArgs.length) {
        if (paramVarArgs[b].equals(yn2))
          return paramVarArgs[b]; 
        b++;
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qe0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */