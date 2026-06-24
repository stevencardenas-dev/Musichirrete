public final class cn2 extends wk2 {
  public static final cn2 zzb;
  
  public int zzd;
  
  public int zze = 0;
  
  public Object zzf;
  
  public int zzg;
  
  public mn2 zzh;
  
  public int zzi;
  
  static {
    cn2 cn21 = new cn2();
    zzb = cn21;
    wk2.f(cn2.class, cn21);
  }
  
  public static bn2 s() {
    return (bn2)zzb.k();
  }
  
  public static cn2 t(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic cn2.zzb : Lcn2;
    //   3: astore_3
    //   4: aload_0
    //   5: arraylength
    //   6: istore_1
    //   7: getstatic nk2.a : Lnk2;
    //   10: astore #4
    //   12: getstatic ak2.a : I
    //   15: istore_2
    //   16: getstatic nk2.a : Lnk2;
    //   19: astore #4
    //   21: iload_1
    //   22: ifne -> 30
    //   25: aload_3
    //   26: astore_0
    //   27: goto -> 86
    //   30: aload_3
    //   31: invokevirtual n : ()Lwk2;
    //   34: astore_3
    //   35: getstatic bm2.c : Lbm2;
    //   38: aload_3
    //   39: invokevirtual getClass : ()Ljava/lang/Class;
    //   42: invokevirtual a : (Ljava/lang/Class;)Lem2;
    //   45: astore #6
    //   47: new bk2
    //   50: astore #5
    //   52: aload #5
    //   54: invokespecial <init> : ()V
    //   57: aload #4
    //   59: invokevirtual getClass : ()Ljava/lang/Class;
    //   62: pop
    //   63: aload #6
    //   65: aload_3
    //   66: aload_0
    //   67: iconst_0
    //   68: iload_1
    //   69: aload #5
    //   71: invokeinterface b : (Ljava/lang/Object;[BIILbk2;)V
    //   76: aload #6
    //   78: aload_3
    //   79: invokeinterface a : (Ljava/lang/Object;)V
    //   84: aload_3
    //   85: astore_0
    //   86: aload_0
    //   87: ifnull -> 116
    //   90: aload_0
    //   91: iconst_1
    //   92: invokestatic i : (Lwk2;Z)Z
    //   95: ifeq -> 101
    //   98: goto -> 116
    //   101: new lm2
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: invokevirtual getMessage : ()Ljava/lang/String;
    //   111: invokestatic c : (Ljava/lang/String;)V
    //   114: aconst_null
    //   115: areturn
    //   116: aload_0
    //   117: checkcast cn2
    //   120: areturn
    //   121: astore_0
    //   122: goto -> 165
    //   125: astore_0
    //   126: ldc 'While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.'
    //   128: invokestatic c : (Ljava/lang/String;)V
    //   131: aconst_null
    //   132: areturn
    //   133: astore_0
    //   134: aload_0
    //   135: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   138: instanceof ll2
    //   141: ifeq -> 152
    //   144: aload_0
    //   145: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   148: checkcast ll2
    //   151: athrow
    //   152: new java/io/IOException
    //   155: dup
    //   156: aload_0
    //   157: invokevirtual getMessage : ()Ljava/lang/String;
    //   160: aload_0
    //   161: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   164: athrow
    //   165: aload_0
    //   166: invokevirtual getMessage : ()Ljava/lang/String;
    //   169: invokestatic c : (Ljava/lang/String;)V
    //   172: aconst_null
    //   173: areturn
    //   174: astore_0
    //   175: aload_0
    //   176: athrow
    // Exception table:
    //   from	to	target	type
    //   35	84	174	ll2
    //   35	84	121	lm2
    //   35	84	133	java/io/IOException
    //   35	84	125	java/lang/IndexOutOfBoundsException
  }
  
  public static void v(cn2 paramcn2, on2 paramon2) {
    paramcn2.zzi = paramon2.b;
    paramcn2.zzd |= 0x4;
  }
  
  public final Object j(int paramInt) {
    if (--paramInt != 0) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt == 5)
              return zzb; 
            throw null;
          } 
          return new uk2(zzb);
        } 
        return new cn2();
      } 
      xj2 xj22 = xj2.c;
      xj2 xj21 = xj2.e;
      return new dm2(zzb, "\004\006\001\001\001\007\006\000\000\000\001᠌\000\002ဉ\001\004<\000\005᠌\002\006<\000\007<\000", new Object[] { 
            "zzf", "zze", "zzd", "zzg", xj22, "zzh", un2.class, "zzi", xj21, lo2.class, 
            do2.class });
    } 
    return Byte.valueOf((byte)1);
  }
  
  public final do2 u() {
    return (this.zze == 7) ? (do2)this.zzf : do2.p();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */