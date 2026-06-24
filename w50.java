public final class w50 extends jy1 {
  public volatile jy1 a;
  
  public final boolean b;
  
  public final boolean c;
  
  public final my d;
  
  public final rz1 e;
  
  public final x50 f;
  
  public w50(x50 paramx50, boolean paramBoolean1, boolean paramBoolean2, my parammy, rz1 paramrz1) {
    this.f = paramx50;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = parammy;
    this.e = paramrz1;
  }
  
  public final Object b(tk0 paramtk0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Z
    //   4: ifeq -> 13
    //   7: aload_1
    //   8: invokevirtual K : ()V
    //   11: aconst_null
    //   12: areturn
    //   13: aload_0
    //   14: getfield a : Ljy1;
    //   17: astore #4
    //   19: aload #4
    //   21: astore_3
    //   22: aload #4
    //   24: ifnonnull -> 329
    //   27: aload_0
    //   28: getfield d : Lmy;
    //   31: astore #7
    //   33: aload_0
    //   34: getfield f : Lx50;
    //   37: astore #6
    //   39: aload_0
    //   40: getfield e : Lrz1;
    //   43: astore #8
    //   45: aload #7
    //   47: getfield f : Ljava/lang/Object;
    //   50: checkcast hk0
    //   53: astore #5
    //   55: aload #5
    //   57: invokevirtual getClass : ()Ljava/lang/Class;
    //   60: pop
    //   61: aload #5
    //   63: getfield c : Ljava/util/concurrent/ConcurrentHashMap;
    //   66: astore_3
    //   67: aload #6
    //   69: getstatic hk0.e : Lgk0;
    //   72: if_acmpne -> 78
    //   75: goto -> 219
    //   78: aload #8
    //   80: getfield a : Ljava/lang/Class;
    //   83: astore #9
    //   85: aload_3
    //   86: aload #9
    //   88: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: checkcast ky1
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 114
    //   101: aload #6
    //   103: astore_3
    //   104: aload #4
    //   106: aload #6
    //   108: if_acmpne -> 222
    //   111: goto -> 219
    //   114: aload #9
    //   116: ldc fk0
    //   118: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   121: checkcast fk0
    //   124: astore #4
    //   126: aload #4
    //   128: ifnonnull -> 137
    //   131: aload #6
    //   133: astore_3
    //   134: goto -> 222
    //   137: aload #4
    //   139: invokeinterface value : ()Ljava/lang/Class;
    //   144: astore #4
    //   146: ldc ky1
    //   148: aload #4
    //   150: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   153: ifne -> 162
    //   156: aload #6
    //   158: astore_3
    //   159: goto -> 222
    //   162: aload #5
    //   164: getfield b : Lg7;
    //   167: new rz1
    //   170: dup
    //   171: aload #4
    //   173: invokespecial <init> : (Ljava/lang/reflect/Type;)V
    //   176: iconst_1
    //   177: invokevirtual t : (Lrz1;Z)Le31;
    //   180: invokeinterface d : ()Ljava/lang/Object;
    //   185: checkcast ky1
    //   188: astore #4
    //   190: aload_3
    //   191: aload #9
    //   193: aload #4
    //   195: invokevirtual putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   198: checkcast ky1
    //   201: astore_3
    //   202: aload_3
    //   203: ifnull -> 209
    //   206: aload_3
    //   207: astore #4
    //   209: aload #6
    //   211: astore_3
    //   212: aload #4
    //   214: aload #6
    //   216: if_acmpne -> 222
    //   219: aload #5
    //   221: astore_3
    //   222: aload #7
    //   224: getfield g : Ljava/lang/Object;
    //   227: checkcast java/util/List
    //   230: invokeinterface iterator : ()Ljava/util/Iterator;
    //   235: astore #5
    //   237: iconst_0
    //   238: istore_2
    //   239: aload #5
    //   241: invokeinterface hasNext : ()Z
    //   246: ifeq -> 300
    //   249: aload #5
    //   251: invokeinterface next : ()Ljava/lang/Object;
    //   256: checkcast ky1
    //   259: astore #4
    //   261: iload_2
    //   262: ifne -> 276
    //   265: aload #4
    //   267: aload_3
    //   268: if_acmpne -> 239
    //   271: iconst_1
    //   272: istore_2
    //   273: goto -> 239
    //   276: aload #4
    //   278: aload #7
    //   280: aload #8
    //   282: invokeinterface a : (Lmy;Lrz1;)Ljy1;
    //   287: astore #4
    //   289: aload #4
    //   291: ifnull -> 239
    //   294: aload #4
    //   296: astore_3
    //   297: goto -> 312
    //   300: iload_2
    //   301: ifne -> 320
    //   304: aload #7
    //   306: aload #8
    //   308: invokevirtual b : (Lrz1;)Ljy1;
    //   311: astore_3
    //   312: aload_0
    //   313: aload_3
    //   314: putfield a : Ljy1;
    //   317: goto -> 329
    //   320: ldc 'GSON cannot serialize or deserialize '
    //   322: aload #8
    //   324: invokestatic k : (Ljava/lang/String;Ljava/lang/Object;)V
    //   327: aconst_null
    //   328: areturn
    //   329: aload_3
    //   330: aload_1
    //   331: invokevirtual b : (Ltk0;)Ljava/lang/Object;
    //   334: areturn
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Z
    //   4: ifeq -> 13
    //   7: aload_1
    //   8: invokevirtual o : ()Lcl0;
    //   11: pop
    //   12: return
    //   13: aload_0
    //   14: getfield a : Ljy1;
    //   17: astore #5
    //   19: aload #5
    //   21: astore #4
    //   23: aload #5
    //   25: ifnonnull -> 344
    //   28: aload_0
    //   29: getfield d : Lmy;
    //   32: astore #9
    //   34: aload_0
    //   35: getfield f : Lx50;
    //   38: astore #7
    //   40: aload_0
    //   41: getfield e : Lrz1;
    //   44: astore #8
    //   46: aload #9
    //   48: getfield f : Ljava/lang/Object;
    //   51: checkcast hk0
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual getClass : ()Ljava/lang/Class;
    //   61: pop
    //   62: aload #6
    //   64: getfield c : Ljava/util/concurrent/ConcurrentHashMap;
    //   67: astore #10
    //   69: aload #7
    //   71: getstatic hk0.e : Lgk0;
    //   74: if_acmpne -> 80
    //   77: goto -> 230
    //   80: aload #8
    //   82: getfield a : Ljava/lang/Class;
    //   85: astore #4
    //   87: aload #10
    //   89: aload #4
    //   91: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   94: checkcast ky1
    //   97: astore #5
    //   99: aload #5
    //   101: ifnull -> 118
    //   104: aload #7
    //   106: astore #4
    //   108: aload #5
    //   110: aload #7
    //   112: if_acmpne -> 234
    //   115: goto -> 230
    //   118: aload #4
    //   120: ldc fk0
    //   122: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   125: checkcast fk0
    //   128: astore #5
    //   130: aload #5
    //   132: ifnonnull -> 142
    //   135: aload #7
    //   137: astore #4
    //   139: goto -> 234
    //   142: aload #5
    //   144: invokeinterface value : ()Ljava/lang/Class;
    //   149: astore #5
    //   151: ldc ky1
    //   153: aload #5
    //   155: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   158: ifne -> 168
    //   161: aload #7
    //   163: astore #4
    //   165: goto -> 234
    //   168: aload #6
    //   170: getfield b : Lg7;
    //   173: new rz1
    //   176: dup
    //   177: aload #5
    //   179: invokespecial <init> : (Ljava/lang/reflect/Type;)V
    //   182: iconst_1
    //   183: invokevirtual t : (Lrz1;Z)Le31;
    //   186: invokeinterface d : ()Ljava/lang/Object;
    //   191: checkcast ky1
    //   194: astore #5
    //   196: aload #10
    //   198: aload #4
    //   200: aload #5
    //   202: invokevirtual putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: checkcast ky1
    //   208: astore #4
    //   210: aload #4
    //   212: ifnull -> 219
    //   215: aload #4
    //   217: astore #5
    //   219: aload #7
    //   221: astore #4
    //   223: aload #5
    //   225: aload #7
    //   227: if_acmpne -> 234
    //   230: aload #6
    //   232: astore #4
    //   234: aload #9
    //   236: getfield g : Ljava/lang/Object;
    //   239: checkcast java/util/List
    //   242: invokeinterface iterator : ()Ljava/util/Iterator;
    //   247: astore #6
    //   249: iconst_0
    //   250: istore_3
    //   251: aload #6
    //   253: invokeinterface hasNext : ()Z
    //   258: ifeq -> 314
    //   261: aload #6
    //   263: invokeinterface next : ()Ljava/lang/Object;
    //   268: checkcast ky1
    //   271: astore #5
    //   273: iload_3
    //   274: ifne -> 289
    //   277: aload #5
    //   279: aload #4
    //   281: if_acmpne -> 251
    //   284: iconst_1
    //   285: istore_3
    //   286: goto -> 251
    //   289: aload #5
    //   291: aload #9
    //   293: aload #8
    //   295: invokeinterface a : (Lmy;Lrz1;)Ljy1;
    //   300: astore #5
    //   302: aload #5
    //   304: ifnull -> 251
    //   307: aload #5
    //   309: astore #4
    //   311: goto -> 327
    //   314: iload_3
    //   315: ifne -> 336
    //   318: aload #9
    //   320: aload #8
    //   322: invokevirtual b : (Lrz1;)Ljy1;
    //   325: astore #4
    //   327: aload_0
    //   328: aload #4
    //   330: putfield a : Ljy1;
    //   333: goto -> 344
    //   336: ldc 'GSON cannot serialize or deserialize '
    //   338: aload #8
    //   340: invokestatic k : (Ljava/lang/String;Ljava/lang/Object;)V
    //   343: return
    //   344: aload #4
    //   346: aload_1
    //   347: aload_2
    //   348: invokevirtual c : (Lcl0;Ljava/lang/Object;)V
    //   351: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */