import java.security.Key;

public abstract class h61 extends e4 implements il0 {
  public static final byte[] g = new byte[] { 0 };
  
  public final int c;
  
  public final k3 d;
  
  public final qp0 e;
  
  public final Object f;
  
  public h61(String paramString1, String paramString2, k3 paramk3) {
    this.a = paramString1;
    this.b = "n/a";
    f1 f1 = new f1(2);
    f1.c = paramString2;
    this.f = f1;
    this.d = paramk3;
    this.e = new qp0(paramk3.d);
  }
  
  public h61(String paramString, k3 paramk3) {
    this.a = paramString;
    this.b = "N/A";
    this.d = paramk3;
    v20 v20 = new v20();
    v20.c = "alg";
    this.f = v20;
    this.e = new qp0(paramk3.d);
  }
  
  public final void a(Key paramKey, qr paramqr) {
    switch (this.c) {
      default:
        ((v20)this.f).a(paramKey, paramqr);
        return;
      case 0:
        break;
    } 
    if (paramKey == null)
      m60.f(); 
  }
  
  public final p01 d(Key paramKey, n2 paramn2, j01 paramj01) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore #4
    //   6: aload_0
    //   7: getfield f : Ljava/lang/Object;
    //   10: astore #15
    //   12: iload #4
    //   14: tableswitch default -> 32, 0 -> 44
    //   32: aload #15
    //   34: checkcast v20
    //   37: aload_1
    //   38: aload_2
    //   39: aload_3
    //   40: invokevirtual d : (Ljava/security/Key;Ln2;Lj01;)Lp01;
    //   43: areturn
    //   44: aload_2
    //   45: getfield e : Ljava/lang/Object;
    //   48: checkcast java/util/Map
    //   51: ldc 'p2c'
    //   53: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: astore #13
    //   60: aload #13
    //   62: ifnull -> 81
    //   65: aload #13
    //   67: checkcast java/lang/Number
    //   70: invokevirtual longValue : ()J
    //   73: invokestatic valueOf : (J)Ljava/lang/Long;
    //   76: astore #13
    //   78: goto -> 84
    //   81: aconst_null
    //   82: astore #13
    //   84: aload_2
    //   85: ldc 'p2s'
    //   87: invokevirtual y : (Ljava/lang/String;)Ljava/lang/String;
    //   90: astore_2
    //   91: new zb
    //   94: dup
    //   95: iconst_m1
    //   96: invokespecial <init> : (I)V
    //   99: aload_2
    //   100: invokevirtual b : (Ljava/lang/String;)[B
    //   103: astore_2
    //   104: iconst_3
    //   105: anewarray [B
    //   108: dup
    //   109: iconst_0
    //   110: aload_0
    //   111: getfield a : Ljava/lang/String;
    //   114: ldc 'UTF-8'
    //   116: invokestatic p : (Ljava/lang/String;Ljava/lang/String;)[B
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: getstatic h61.g : [B
    //   125: aastore
    //   126: dup
    //   127: iconst_2
    //   128: aload_2
    //   129: aastore
    //   130: invokestatic i : ([[B)[B
    //   133: astore #14
    //   135: aload_0
    //   136: getfield e : Lqp0;
    //   139: getfield b : I
    //   142: istore #9
    //   144: aload_3
    //   145: getfield c : Ljava/lang/Object;
    //   148: astore_2
    //   149: aload #15
    //   151: checkcast f1
    //   154: astore_2
    //   155: aload_1
    //   156: invokeinterface getEncoded : ()[B
    //   161: astore_1
    //   162: aload #13
    //   164: invokevirtual intValue : ()I
    //   167: istore #11
    //   169: aload_2
    //   170: getfield c : Ljava/lang/String;
    //   173: new j3
    //   176: dup
    //   177: iconst_1
    //   178: aload_1
    //   179: invokespecial <init> : (I[B)V
    //   182: invokestatic C : (Ljava/lang/String;Ljava/security/Key;)Ljavax/crypto/Mac;
    //   185: astore #15
    //   187: aload #15
    //   189: invokevirtual getMacLength : ()I
    //   192: istore #12
    //   194: iload #9
    //   196: i2l
    //   197: ldc2_w 4294967295
    //   200: lcmp
    //   201: ifgt -> 417
    //   204: iload #9
    //   206: i2d
    //   207: iload #12
    //   209: i2d
    //   210: ddiv
    //   211: invokestatic ceil : (D)D
    //   214: d2i
    //   215: istore #10
    //   217: iload #10
    //   219: iconst_1
    //   220: isub
    //   221: istore #8
    //   223: new java/io/ByteArrayOutputStream
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: astore #16
    //   232: iconst_0
    //   233: istore #4
    //   235: iload #4
    //   237: iload #10
    //   239: if_icmpge -> 391
    //   242: iload #4
    //   244: iconst_1
    //   245: iadd
    //   246: istore #7
    //   248: aconst_null
    //   249: astore_1
    //   250: aconst_null
    //   251: astore_2
    //   252: iconst_1
    //   253: istore #5
    //   255: iload #5
    //   257: iload #11
    //   259: if_icmpgt -> 352
    //   262: iload #5
    //   264: iconst_1
    //   265: if_icmpne -> 299
    //   268: aload #15
    //   270: iconst_2
    //   271: anewarray [B
    //   274: dup
    //   275: iconst_0
    //   276: aload #14
    //   278: aastore
    //   279: dup
    //   280: iconst_1
    //   281: iload #7
    //   283: invokestatic u : (I)[B
    //   286: aastore
    //   287: invokestatic i : ([[B)[B
    //   290: invokevirtual doFinal : ([B)[B
    //   293: astore_3
    //   294: aload_3
    //   295: astore_2
    //   296: goto -> 344
    //   299: aload #15
    //   301: aload_2
    //   302: invokevirtual doFinal : ([B)[B
    //   305: astore #13
    //   307: iconst_0
    //   308: istore #6
    //   310: aload_1
    //   311: astore_3
    //   312: aload #13
    //   314: astore_2
    //   315: iload #6
    //   317: aload #13
    //   319: arraylength
    //   320: if_icmpge -> 344
    //   323: aload_1
    //   324: iload #6
    //   326: aload #13
    //   328: iload #6
    //   330: baload
    //   331: aload_1
    //   332: iload #6
    //   334: baload
    //   335: ixor
    //   336: i2b
    //   337: bastore
    //   338: iinc #6, 1
    //   341: goto -> 310
    //   344: iinc #5, 1
    //   347: aload_3
    //   348: astore_1
    //   349: goto -> 255
    //   352: aload_1
    //   353: astore_2
    //   354: iload #4
    //   356: iload #8
    //   358: if_icmpne -> 375
    //   361: aload_1
    //   362: iconst_0
    //   363: iload #9
    //   365: iload #12
    //   367: iload #8
    //   369: imul
    //   370: isub
    //   371: invokestatic Q : ([BII)[B
    //   374: astore_2
    //   375: aload #16
    //   377: aload_2
    //   378: iconst_0
    //   379: aload_2
    //   380: arraylength
    //   381: invokevirtual write : ([BII)V
    //   384: iload #7
    //   386: istore #4
    //   388: goto -> 235
    //   391: new p01
    //   394: dup
    //   395: aconst_null
    //   396: new javax/crypto/spec/SecretKeySpec
    //   399: dup
    //   400: aload #16
    //   402: invokevirtual toByteArray : ()[B
    //   405: ldc 'AES'
    //   407: invokespecial <init> : ([BLjava/lang/String;)V
    //   410: aconst_null
    //   411: bipush #6
    //   413: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   416: areturn
    //   417: new java/lang/RuntimeException
    //   420: dup
    //   421: ldc ''
    //   423: iload #9
    //   425: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   428: invokespecial <init> : (Ljava/lang/String;)V
    //   431: athrow
  }
  
  public final boolean g() {
    boolean bool;
    int i = this.c;
    k3 k31 = this.d;
    switch (i) {
      default:
        if (((v20)this.f).g() && k31.g()) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    return k31.g();
  }
  
  public final Key h(p01 paramp01, byte[] paramArrayOfbyte, qp0 paramqp0, n2 paramn2, j01 paramj01) {
    Key key1;
    k3 k32;
    switch (this.c) {
      default:
        key1 = ((v20)this.f).h(paramp01, qz1.b, this.e, paramn2, paramj01);
        k32 = this.d;
        return k32.h(k32.d(key1, paramn2, paramj01), paramArrayOfbyte, paramqp0, paramn2, paramj01);
      case 0:
        break;
    } 
    Key key2 = (Key)((p01)key1).e;
    k3 k31 = this.d;
    return k31.h(k31.d(key2, paramn2, paramj01), paramArrayOfbyte, paramqp0, paramn2, paramj01);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */