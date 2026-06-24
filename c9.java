import java.util.ArrayList;

public class c9 {
  public pn1 a = null;
  
  public float b = 0.0F;
  
  public final ArrayList c = new ArrayList();
  
  public final w8 d;
  
  public boolean e = false;
  
  public c9(zv0 paramzv0) {
    this.d = new w8(this, paramzv0);
  }
  
  public final void a(ln0 paramln0, int paramInt) {
    pn1 pn11 = paramln0.j(paramInt);
    w8 w81 = this.d;
    w81.g(pn11, 1.0F);
    w81.g(paramln0.j(paramInt), -1.0F);
  }
  
  public final void b(pn1 parampn11, pn1 parampn12, pn1 parampn13, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    w8 w81 = this.d;
    if (i == 0) {
      w81.g(parampn11, -1.0F);
      w81.g(parampn12, 1.0F);
      w81.g(parampn13, 1.0F);
      return;
    } 
    w81.g(parampn11, 1.0F);
    w81.g(parampn12, -1.0F);
    w81.g(parampn13, -1.0F);
  }
  
  public final void c(pn1 parampn11, pn1 parampn12, pn1 parampn13, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    w8 w81 = this.d;
    if (i == 0) {
      w81.g(parampn11, -1.0F);
      w81.g(parampn12, 1.0F);
      w81.g(parampn13, -1.0F);
      return;
    } 
    w81.g(parampn11, 1.0F);
    w81.g(parampn12, -1.0F);
    w81.g(parampn13, 1.0F);
  }
  
  public pn1 d(boolean[] paramArrayOfboolean) {
    return f(paramArrayOfboolean, null);
  }
  
  public boolean e() {
    return (this.a == null && this.b == 0.0F && this.d.d() == 0);
  }
  
  public final pn1 f(boolean[] paramArrayOfboolean, pn1 parampn1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lw8;
    //   4: astore #12
    //   6: aload #12
    //   8: invokevirtual d : ()I
    //   11: istore #7
    //   13: aconst_null
    //   14: astore #10
    //   16: iconst_0
    //   17: istore #6
    //   19: fconst_0
    //   20: fstore #4
    //   22: iload #6
    //   24: iload #7
    //   26: if_icmpge -> 156
    //   29: aload #12
    //   31: iload #6
    //   33: invokevirtual f : (I)F
    //   36: fstore #5
    //   38: aload #10
    //   40: astore #9
    //   42: fload #4
    //   44: fstore_3
    //   45: fload #5
    //   47: fconst_0
    //   48: fcmpg
    //   49: ifge -> 143
    //   52: aload #12
    //   54: iload #6
    //   56: invokevirtual e : (I)Lpn1;
    //   59: astore #11
    //   61: aload_1
    //   62: ifnull -> 82
    //   65: aload #10
    //   67: astore #9
    //   69: fload #4
    //   71: fstore_3
    //   72: aload_1
    //   73: aload #11
    //   75: getfield c : I
    //   78: baload
    //   79: ifne -> 143
    //   82: aload #10
    //   84: astore #9
    //   86: fload #4
    //   88: fstore_3
    //   89: aload #11
    //   91: aload_2
    //   92: if_acmpeq -> 143
    //   95: aload #11
    //   97: getfield n : I
    //   100: istore #8
    //   102: iload #8
    //   104: iconst_3
    //   105: if_icmpeq -> 121
    //   108: aload #10
    //   110: astore #9
    //   112: fload #4
    //   114: fstore_3
    //   115: iload #8
    //   117: iconst_4
    //   118: if_icmpne -> 143
    //   121: aload #10
    //   123: astore #9
    //   125: fload #4
    //   127: fstore_3
    //   128: fload #5
    //   130: fload #4
    //   132: fcmpg
    //   133: ifge -> 143
    //   136: fload #5
    //   138: fstore_3
    //   139: aload #11
    //   141: astore #9
    //   143: iinc #6, 1
    //   146: aload #9
    //   148: astore #10
    //   150: fload_3
    //   151: fstore #4
    //   153: goto -> 22
    //   156: aload #10
    //   158: areturn
  }
  
  public final void g(pn1 parampn1) {
    pn1 pn11 = this.a;
    w8 w81 = this.d;
    if (pn11 != null) {
      w81.g(pn11, -1.0F);
      this.a.e = -1;
      this.a = null;
    } 
    float f = w81.h(parampn1, true) * -1.0F;
    this.a = parampn1;
    if (f == 1.0F)
      return; 
    this.b /= f;
    int i = w81.h;
    for (byte b = 0; i != -1 && b < w81.a; b++) {
      float[] arrayOfFloat = w81.g;
      arrayOfFloat[i] = arrayOfFloat[i] / f;
      i = w81.f[i];
    } 
  }
  
  public final void h(ln0 paramln0, pn1 parampn1, boolean paramBoolean) {
    if (parampn1.h) {
      w8 w81 = this.d;
      float f1 = w81.c(parampn1);
      float f2 = this.b;
      this.b = parampn1.g * f1 + f2;
      w81.h(parampn1, paramBoolean);
      if (paramBoolean)
        parampn1.b(this); 
      if (w81.d() == 0) {
        this.e = true;
        paramln0.b = true;
      } 
    } 
  }
  
  public void i(ln0 paramln0, c9 paramc9, boolean paramBoolean) {
    w8 w81 = this.d;
    w81.getClass();
    float f1 = w81.c(paramc9.a);
    w81.h(paramc9.a, paramBoolean);
    w8 w82 = paramc9.d;
    int i = w82.d();
    for (byte b = 0; b < i; b++) {
      pn1 pn11 = w82.e(b);
      w81.a(pn11, w82.c(pn11) * f1, paramBoolean);
    } 
    float f2 = this.b;
    this.b = paramc9.b * f1 + f2;
    if (paramBoolean)
      paramc9.a.b(this); 
    if (this.a != null && w81.d() == 0) {
      this.e = true;
      paramln0.b = true;
    } 
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lpn1;
    //   4: ifnonnull -> 14
    //   7: ldc '0'
    //   9: astore #7
    //   11: goto -> 42
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: ldc ''
    //   20: invokespecial <init> : (Ljava/lang/String;)V
    //   23: astore #7
    //   25: aload #7
    //   27: aload_0
    //   28: getfield a : Lpn1;
    //   31: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload #7
    //   37: invokevirtual toString : ()Ljava/lang/String;
    //   40: astore #7
    //   42: aload #7
    //   44: ldc ' = '
    //   46: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   49: astore #8
    //   51: aload_0
    //   52: getfield b : F
    //   55: fstore_1
    //   56: iconst_0
    //   57: istore #4
    //   59: fload_1
    //   60: fconst_0
    //   61: fcmpl
    //   62: ifeq -> 94
    //   65: aload #8
    //   67: invokestatic p : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: astore #7
    //   72: aload #7
    //   74: aload_0
    //   75: getfield b : F
    //   78: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload #7
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: astore #8
    //   89: iconst_1
    //   90: istore_3
    //   91: goto -> 96
    //   94: iconst_0
    //   95: istore_3
    //   96: aload_0
    //   97: getfield d : Lw8;
    //   100: astore #9
    //   102: aload #9
    //   104: invokevirtual d : ()I
    //   107: istore #5
    //   109: iload #4
    //   111: iload #5
    //   113: if_icmpge -> 310
    //   116: aload #9
    //   118: iload #4
    //   120: invokevirtual e : (I)Lpn1;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnonnull -> 137
    //   130: aload #8
    //   132: astore #7
    //   134: goto -> 300
    //   137: aload #9
    //   139: iload #4
    //   141: invokevirtual f : (I)F
    //   144: fstore_2
    //   145: fload_2
    //   146: fconst_0
    //   147: fcmpl
    //   148: istore #6
    //   150: iload #6
    //   152: ifne -> 162
    //   155: aload #8
    //   157: astore #7
    //   159: goto -> 300
    //   162: aload #7
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: astore #10
    //   169: iload_3
    //   170: ifne -> 202
    //   173: aload #8
    //   175: astore #7
    //   177: fload_2
    //   178: fstore_1
    //   179: fload_2
    //   180: fconst_0
    //   181: fcmpg
    //   182: ifge -> 233
    //   185: aload #8
    //   187: ldc '- '
    //   189: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   192: astore #7
    //   194: fload_2
    //   195: ldc -1.0
    //   197: fmul
    //   198: fstore_1
    //   199: goto -> 233
    //   202: iload #6
    //   204: ifle -> 221
    //   207: aload #8
    //   209: ldc ' + '
    //   211: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   214: astore #7
    //   216: fload_2
    //   217: fstore_1
    //   218: goto -> 233
    //   221: aload #8
    //   223: ldc ' - '
    //   225: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   228: astore #7
    //   230: goto -> 194
    //   233: fload_1
    //   234: fconst_1
    //   235: fcmpl
    //   236: ifne -> 251
    //   239: aload #7
    //   241: aload #10
    //   243: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   246: astore #7
    //   248: goto -> 298
    //   251: new java/lang/StringBuilder
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: astore #8
    //   260: aload #8
    //   262: aload #7
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: aload #8
    //   270: fload_1
    //   271: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload #8
    //   277: ldc ' '
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload #8
    //   285: aload #10
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: aload #8
    //   293: invokevirtual toString : ()Ljava/lang/String;
    //   296: astore #7
    //   298: iconst_1
    //   299: istore_3
    //   300: iinc #4, 1
    //   303: aload #7
    //   305: astore #8
    //   307: goto -> 109
    //   310: iload_3
    //   311: ifne -> 322
    //   314: aload #8
    //   316: ldc '0.0'
    //   318: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   321: areturn
    //   322: aload #8
    //   324: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */