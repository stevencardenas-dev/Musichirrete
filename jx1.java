import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public final class jx1 {
  public static final String[] l = new String[] { "INSERT", "UPDATE", "DELETE" };
  
  public final WorkDatabase_Impl a;
  
  public final LinkedHashMap b;
  
  public final LinkedHashMap c;
  
  public final boolean d;
  
  public final xi0 e;
  
  public final LinkedHashMap f;
  
  public final String[] g;
  
  public final of h;
  
  public final bh0 i;
  
  public final AtomicBoolean j;
  
  public lc0 k;
  
  public jx1(WorkDatabase_Impl paramWorkDatabase_Impl, LinkedHashMap paramLinkedHashMap1, LinkedHashMap paramLinkedHashMap2, String[] paramArrayOfString, boolean paramBoolean, xi0 paramxi0) {
    this.a = paramWorkDatabase_Impl;
    this.b = paramLinkedHashMap1;
    this.c = paramLinkedHashMap2;
    this.d = paramBoolean;
    this.e = paramxi0;
    int i = 0;
    this.j = new AtomicBoolean(false);
    this.k = new i2(6);
    this.f = new LinkedHashMap<Object, Object>();
    int j = paramArrayOfString.length;
    String[] arrayOfString = new String[j];
    while (i < j) {
      String str1;
      String str2 = paramArrayOfString[i];
      Locale locale = Locale.ROOT;
      str2 = str2.toLowerCase(locale);
      str2.getClass();
      this.f.put(str2, Integer.valueOf(i));
      String str3 = (String)this.b.get(paramArrayOfString[i]);
      if (str3 != null) {
        str1 = str3.toLowerCase(locale);
        str1.getClass();
      } else {
        locale = null;
      } 
      if (locale == null)
        str1 = str2; 
      arrayOfString[i] = str1;
      i++;
    } 
    this.g = arrayOfString;
    for (Map.Entry entry : this.b.entrySet()) {
      String str = (String)entry.getValue();
      Locale locale = Locale.ROOT;
      str = str.toLowerCase(locale);
      str.getClass();
      if (this.f.containsKey(str)) {
        String str1 = ((String)entry.getKey()).toLowerCase(locale);
        str1.getClass();
        LinkedHashMap<String, Object> linkedHashMap = this.f;
        linkedHashMap.put(str1, or0.Z(linkedHashMap, str));
      } 
    } 
    i = this.g.length;
    Object object = new Object();
    ((of)object).b = new ReentrantLock();
    ((of)object).c = new long[i];
    ((of)object).d = new boolean[i];
    this.h = (of)object;
    this.i = new bh0(this.g.length, 17);
  }
  
  public static final Object a(jx1 paramjx1, o81 paramo81, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ax1
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast ax1
    //   11: astore #4
    //   13: aload #4
    //   15: getfield i : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield i : I
    //   35: aload #4
    //   37: astore_0
    //   38: goto -> 51
    //   41: new ax1
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial <init> : (Ljx1;Lds;)V
    //   50: astore_0
    //   51: aload_0
    //   52: getfield g : Ljava/lang/Object;
    //   55: astore_2
    //   56: aload_0
    //   57: getfield i : I
    //   60: istore_3
    //   61: getstatic ys.b : Lys;
    //   64: astore #5
    //   66: iload_3
    //   67: ifeq -> 116
    //   70: iload_3
    //   71: iconst_1
    //   72: if_icmpeq -> 101
    //   75: iload_3
    //   76: iconst_2
    //   77: if_icmpne -> 94
    //   80: aload_0
    //   81: getfield f : Ljava/lang/Object;
    //   84: checkcast java/util/Set
    //   87: astore_0
    //   88: aload_2
    //   89: invokestatic r0 : (Ljava/lang/Object;)V
    //   92: aload_0
    //   93: areturn
    //   94: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   96: invokestatic f : (Ljava/lang/String;)V
    //   99: aconst_null
    //   100: areturn
    //   101: aload_0
    //   102: getfield f : Ljava/lang/Object;
    //   105: checkcast o81
    //   108: astore_1
    //   109: aload_2
    //   110: invokestatic r0 : (Ljava/lang/Object;)V
    //   113: goto -> 165
    //   116: aload_2
    //   117: invokestatic r0 : (Ljava/lang/Object;)V
    //   120: new ps
    //   123: dup
    //   124: bipush #7
    //   126: invokespecial <init> : (I)V
    //   129: astore_2
    //   130: aload_0
    //   131: aload_1
    //   132: putfield f : Ljava/lang/Object;
    //   135: aload_0
    //   136: iconst_1
    //   137: putfield i : I
    //   140: aload_1
    //   141: ldc 'SELECT * FROM room_table_modification_log WHERE invalidated = 1'
    //   143: aload_2
    //   144: aload_0
    //   145: invokeinterface d : (Ljava/lang/String;Lwc0;Lds;)Ljava/lang/Object;
    //   150: astore #4
    //   152: aload #4
    //   154: astore_2
    //   155: aload #4
    //   157: aload #5
    //   159: if_acmpne -> 165
    //   162: goto -> 201
    //   165: aload_2
    //   166: checkcast java/util/Set
    //   169: astore_2
    //   170: aload_2
    //   171: invokeinterface isEmpty : ()Z
    //   176: ifne -> 204
    //   179: aload_0
    //   180: aload_2
    //   181: putfield f : Ljava/lang/Object;
    //   184: aload_0
    //   185: iconst_2
    //   186: putfield i : I
    //   189: aload_1
    //   190: ldc 'UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1'
    //   192: aload_0
    //   193: invokestatic x : (Lo81;Ljava/lang/String;Lds;)Ljava/lang/Object;
    //   196: aload #5
    //   198: if_acmpne -> 204
    //   201: aload #5
    //   203: areturn
    //   204: aload_2
    //   205: areturn
  }
  
  public static final Object b(jx1 paramjx1, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroidx/work/impl/WorkDatabase_Impl;
    //   4: astore #9
    //   6: aload_1
    //   7: instanceof dx1
    //   10: ifeq -> 44
    //   13: aload_1
    //   14: checkcast dx1
    //   17: astore #6
    //   19: aload #6
    //   21: getfield j : I
    //   24: istore_2
    //   25: iload_2
    //   26: ldc -2147483648
    //   28: iand
    //   29: ifeq -> 44
    //   32: aload #6
    //   34: iload_2
    //   35: ldc -2147483648
    //   37: iadd
    //   38: putfield j : I
    //   41: goto -> 55
    //   44: new dx1
    //   47: dup
    //   48: aload_0
    //   49: aload_1
    //   50: invokespecial <init> : (Ljx1;Lds;)V
    //   53: astore #6
    //   55: aload #6
    //   57: getfield h : Ljava/lang/Object;
    //   60: astore #8
    //   62: aload #6
    //   64: getfield j : I
    //   67: istore_2
    //   68: iload_2
    //   69: ifeq -> 115
    //   72: iload_2
    //   73: iconst_1
    //   74: if_icmpne -> 108
    //   77: aload #6
    //   79: getfield g : Lg7;
    //   82: astore_0
    //   83: aload #6
    //   85: getfield f : Ljx1;
    //   88: astore #6
    //   90: aload #8
    //   92: invokestatic r0 : (Ljava/lang/Object;)V
    //   95: goto -> 288
    //   98: astore #6
    //   100: aload_0
    //   101: astore_1
    //   102: aload #6
    //   104: astore_0
    //   105: goto -> 477
    //   108: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   110: invokestatic f : (Ljava/lang/String;)V
    //   113: aconst_null
    //   114: areturn
    //   115: aload #8
    //   117: invokestatic r0 : (Ljava/lang/Object;)V
    //   120: aload #9
    //   122: getfield f : Lg7;
    //   125: astore #7
    //   127: aload #7
    //   129: invokevirtual b : ()Z
    //   132: istore #5
    //   134: getstatic f40.b : Lf40;
    //   137: astore #8
    //   139: iload #5
    //   141: ifeq -> 483
    //   144: aload #7
    //   146: astore_1
    //   147: aload_0
    //   148: getfield j : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   151: iconst_1
    //   152: iconst_0
    //   153: invokevirtual compareAndSet : (ZZ)Z
    //   156: istore #5
    //   158: iload #5
    //   160: ifne -> 171
    //   163: aload #7
    //   165: invokevirtual K : ()V
    //   168: aload #8
    //   170: areturn
    //   171: aload #7
    //   173: astore_1
    //   174: aload_0
    //   175: getfield k : Llc0;
    //   178: invokeinterface a : ()Ljava/lang/Object;
    //   183: checkcast java/lang/Boolean
    //   186: invokevirtual booleanValue : ()Z
    //   189: istore #5
    //   191: iload #5
    //   193: ifne -> 204
    //   196: aload #7
    //   198: invokevirtual K : ()V
    //   201: aload #8
    //   203: areturn
    //   204: aload #7
    //   206: astore_1
    //   207: new ex1
    //   210: astore #8
    //   212: aload #7
    //   214: astore_1
    //   215: aload #8
    //   217: aload_0
    //   218: aconst_null
    //   219: iconst_1
    //   220: invokespecial <init> : (Ljx1;Lcs;I)V
    //   223: aload #7
    //   225: astore_1
    //   226: aload #6
    //   228: aload_0
    //   229: putfield f : Ljx1;
    //   232: aload #7
    //   234: astore_1
    //   235: aload #6
    //   237: aload #7
    //   239: putfield g : Lg7;
    //   242: aload #7
    //   244: astore_1
    //   245: aload #6
    //   247: iconst_1
    //   248: putfield j : I
    //   251: aload #7
    //   253: astore_1
    //   254: aload #9
    //   256: iconst_0
    //   257: aload #8
    //   259: aload #6
    //   261: invokevirtual p : (ZLad0;Lds;)Ljava/lang/Object;
    //   264: astore #9
    //   266: getstatic ys.b : Lys;
    //   269: astore_1
    //   270: aload #9
    //   272: astore #8
    //   274: aload_0
    //   275: astore #6
    //   277: aload #7
    //   279: astore_0
    //   280: aload #9
    //   282: aload_1
    //   283: if_acmpne -> 288
    //   286: aload_1
    //   287: areturn
    //   288: aload_0
    //   289: astore_1
    //   290: aload #8
    //   292: checkcast java/util/Set
    //   295: astore #7
    //   297: aload_0
    //   298: astore_1
    //   299: aload #7
    //   301: invokeinterface isEmpty : ()Z
    //   306: ifne -> 470
    //   309: aload_0
    //   310: astore_1
    //   311: aload #6
    //   313: getfield i : Lbh0;
    //   316: astore #8
    //   318: aload_0
    //   319: astore_1
    //   320: aload #8
    //   322: invokevirtual getClass : ()Ljava/lang/Class;
    //   325: pop
    //   326: aload_0
    //   327: astore_1
    //   328: aload #7
    //   330: invokeinterface isEmpty : ()Z
    //   335: ifeq -> 341
    //   338: goto -> 450
    //   341: aload_0
    //   342: astore_1
    //   343: aload #8
    //   345: getfield c : Ljava/lang/Object;
    //   348: checkcast ip1
    //   351: astore #11
    //   353: aload_0
    //   354: astore_1
    //   355: aload #11
    //   357: invokevirtual f : ()Ljava/lang/Object;
    //   360: astore #9
    //   362: aload_0
    //   363: astore_1
    //   364: aload #9
    //   366: checkcast [I
    //   369: astore #8
    //   371: aload_0
    //   372: astore_1
    //   373: aload #8
    //   375: arraylength
    //   376: istore #4
    //   378: aload_0
    //   379: astore_1
    //   380: iload #4
    //   382: newarray int
    //   384: astore #10
    //   386: iconst_0
    //   387: istore_2
    //   388: iload_2
    //   389: iload #4
    //   391: if_icmpge -> 436
    //   394: aload_0
    //   395: astore_1
    //   396: aload #7
    //   398: iload_2
    //   399: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   402: invokeinterface contains : (Ljava/lang/Object;)Z
    //   407: ifeq -> 420
    //   410: aload #8
    //   412: iload_2
    //   413: iaload
    //   414: iconst_1
    //   415: iadd
    //   416: istore_3
    //   417: goto -> 425
    //   420: aload #8
    //   422: iload_2
    //   423: iaload
    //   424: istore_3
    //   425: aload #10
    //   427: iload_2
    //   428: iload_3
    //   429: iastore
    //   430: iinc #2, 1
    //   433: goto -> 388
    //   436: aload_0
    //   437: astore_1
    //   438: aload #11
    //   440: aload #9
    //   442: aload #10
    //   444: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   447: ifeq -> 353
    //   450: aload_0
    //   451: astore_1
    //   452: aload #6
    //   454: getfield e : Lxi0;
    //   457: aload #7
    //   459: invokevirtual h : (Ljava/lang/Object;)Ljava/lang/Object;
    //   462: pop
    //   463: goto -> 470
    //   466: astore_0
    //   467: goto -> 477
    //   470: aload_0
    //   471: invokevirtual K : ()V
    //   474: aload #7
    //   476: areturn
    //   477: aload_1
    //   478: invokevirtual K : ()V
    //   481: aload_0
    //   482: athrow
    //   483: aload #8
    //   485: areturn
    // Exception table:
    //   from	to	target	type
    //   90	95	98	finally
    //   147	158	466	finally
    //   174	191	466	finally
    //   207	212	466	finally
    //   215	223	466	finally
    //   226	232	466	finally
    //   235	242	466	finally
    //   245	251	466	finally
    //   254	266	466	finally
    //   290	297	466	finally
    //   299	309	466	finally
    //   311	318	466	finally
    //   320	326	466	finally
    //   328	338	466	finally
    //   343	353	466	finally
    //   355	362	466	finally
    //   364	371	466	finally
    //   373	378	466	finally
    //   380	386	466	finally
    //   396	410	466	finally
    //   438	450	466	finally
    //   452	463	466	finally
  }
  
  public static final Object c(jx1 paramjx1, bw1 parambw1, int paramInt, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_3
    //   6: instanceof fx1
    //   9: ifeq -> 49
    //   12: aload_3
    //   13: checkcast fx1
    //   16: astore #7
    //   18: aload #7
    //   20: getfield o : I
    //   23: istore #4
    //   25: iload #4
    //   27: ldc -2147483648
    //   29: iand
    //   30: ifeq -> 49
    //   33: aload #7
    //   35: iload #4
    //   37: ldc -2147483648
    //   39: iadd
    //   40: putfield o : I
    //   43: aload #7
    //   45: astore_3
    //   46: goto -> 59
    //   49: new fx1
    //   52: dup
    //   53: aload_0
    //   54: aload_3
    //   55: invokespecial <init> : (Ljx1;Lds;)V
    //   58: astore_3
    //   59: aload_3
    //   60: getfield m : Ljava/lang/Object;
    //   63: astore #9
    //   65: aload_3
    //   66: getfield o : I
    //   69: istore #4
    //   71: getstatic ys.b : Lys;
    //   74: astore #11
    //   76: iload #4
    //   78: ifeq -> 175
    //   81: iload #4
    //   83: iconst_1
    //   84: if_icmpeq -> 151
    //   87: iload #4
    //   89: iconst_2
    //   90: if_icmpne -> 144
    //   93: aload_3
    //   94: getfield l : I
    //   97: istore #4
    //   99: aload_3
    //   100: getfield k : I
    //   103: istore_2
    //   104: aload_3
    //   105: getfield j : I
    //   108: istore #5
    //   110: aload_3
    //   111: getfield i : [Ljava/lang/String;
    //   114: astore #8
    //   116: aload_3
    //   117: getfield h : Ljava/lang/String;
    //   120: astore #7
    //   122: aload_3
    //   123: getfield g : Lo81;
    //   126: astore #10
    //   128: aload_3
    //   129: getfield f : Ljx1;
    //   132: astore_1
    //   133: aload #9
    //   135: invokestatic r0 : (Ljava/lang/Object;)V
    //   138: aload_3
    //   139: astore #9
    //   141: goto -> 500
    //   144: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   146: invokestatic f : (Ljava/lang/String;)V
    //   149: aconst_null
    //   150: areturn
    //   151: aload_3
    //   152: getfield j : I
    //   155: istore_2
    //   156: aload_3
    //   157: getfield g : Lo81;
    //   160: astore #7
    //   162: aload_3
    //   163: getfield f : Ljx1;
    //   166: astore_0
    //   167: aload #9
    //   169: invokestatic r0 : (Ljava/lang/Object;)V
    //   172: goto -> 253
    //   175: aload #9
    //   177: invokestatic r0 : (Ljava/lang/Object;)V
    //   180: new java/lang/StringBuilder
    //   183: dup
    //   184: ldc_w 'INSERT OR IGNORE INTO room_table_modification_log VALUES('
    //   187: invokespecial <init> : (Ljava/lang/String;)V
    //   190: astore #7
    //   192: aload #7
    //   194: iload_2
    //   195: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #7
    //   201: ldc_w ', 0)'
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload #7
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: astore #8
    //   215: aload_3
    //   216: aload_0
    //   217: putfield f : Ljx1;
    //   220: aload_3
    //   221: aload_1
    //   222: putfield g : Lo81;
    //   225: aload_3
    //   226: iload_2
    //   227: putfield j : I
    //   230: aload_3
    //   231: iconst_1
    //   232: putfield o : I
    //   235: aload_1
    //   236: astore #7
    //   238: aload_1
    //   239: aload #8
    //   241: aload_3
    //   242: invokestatic x : (Lo81;Ljava/lang/String;Lds;)Ljava/lang/Object;
    //   245: aload #11
    //   247: if_acmpne -> 253
    //   250: goto -> 497
    //   253: aload_0
    //   254: getfield g : [Ljava/lang/String;
    //   257: iload_2
    //   258: aaload
    //   259: astore #9
    //   261: getstatic jx1.l : [Ljava/lang/String;
    //   264: astore #8
    //   266: aload_0
    //   267: astore_1
    //   268: iconst_3
    //   269: istore #4
    //   271: aload #7
    //   273: astore_0
    //   274: iconst_0
    //   275: istore #6
    //   277: aload #9
    //   279: astore #7
    //   281: iload_2
    //   282: istore #5
    //   284: iload #6
    //   286: istore_2
    //   287: iload_2
    //   288: iload #4
    //   290: if_icmpge -> 512
    //   293: aload #8
    //   295: iload_2
    //   296: aaload
    //   297: astore #10
    //   299: aload_1
    //   300: getfield d : Z
    //   303: ifeq -> 314
    //   306: ldc_w 'TEMP'
    //   309: astore #9
    //   311: goto -> 319
    //   314: ldc_w ''
    //   317: astore #9
    //   319: new java/lang/StringBuilder
    //   322: dup
    //   323: ldc_w 'room_table_modification_trigger_'
    //   326: invokespecial <init> : (Ljava/lang/String;)V
    //   329: astore #12
    //   331: aload #12
    //   333: aload #7
    //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload #12
    //   341: bipush #95
    //   343: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload #12
    //   349: aload #10
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload #12
    //   357: invokevirtual toString : ()Ljava/lang/String;
    //   360: astore #12
    //   362: new java/lang/StringBuilder
    //   365: dup
    //   366: ldc_w 'CREATE '
    //   369: invokespecial <init> : (Ljava/lang/String;)V
    //   372: astore #13
    //   374: aload #13
    //   376: aload #9
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload #13
    //   384: ldc_w ' TRIGGER IF NOT EXISTS `'
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload #13
    //   393: aload #12
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #13
    //   401: ldc_w '` AFTER '
    //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: pop
    //   408: aload #13
    //   410: aload #10
    //   412: ldc_w ' ON `'
    //   415: aload #7
    //   417: ldc_w '` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = '
    //   420: invokestatic v : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload #13
    //   425: iload #5
    //   427: ldc_w ' AND invalidated = 0; END'
    //   430: invokestatic m : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
    //   433: astore #12
    //   435: aload_3
    //   436: aload_1
    //   437: putfield f : Ljx1;
    //   440: aload_3
    //   441: aload_0
    //   442: putfield g : Lo81;
    //   445: aload_3
    //   446: aload #7
    //   448: putfield h : Ljava/lang/String;
    //   451: aload_3
    //   452: aload #8
    //   454: putfield i : [Ljava/lang/String;
    //   457: aload_3
    //   458: iload #5
    //   460: putfield j : I
    //   463: aload_3
    //   464: iload_2
    //   465: putfield k : I
    //   468: aload_3
    //   469: iload #4
    //   471: putfield l : I
    //   474: aload_3
    //   475: iconst_2
    //   476: putfield o : I
    //   479: aload_3
    //   480: astore #9
    //   482: aload_0
    //   483: astore #10
    //   485: aload_0
    //   486: aload #12
    //   488: aload_3
    //   489: invokestatic x : (Lo81;Ljava/lang/String;Lds;)Ljava/lang/Object;
    //   492: aload #11
    //   494: if_acmpne -> 500
    //   497: aload #11
    //   499: areturn
    //   500: iinc #2, 1
    //   503: aload #9
    //   505: astore_3
    //   506: aload #10
    //   508: astore_0
    //   509: goto -> 287
    //   512: getstatic l02.a : Ll02;
    //   515: areturn
  }
  
  public static final Object d(jx1 paramjx1, bw1 parambw1, int paramInt, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_3
    //   6: instanceof gx1
    //   9: ifeq -> 49
    //   12: aload_3
    //   13: checkcast gx1
    //   16: astore #5
    //   18: aload #5
    //   20: getfield m : I
    //   23: istore #4
    //   25: iload #4
    //   27: ldc -2147483648
    //   29: iand
    //   30: ifeq -> 49
    //   33: aload #5
    //   35: iload #4
    //   37: ldc -2147483648
    //   39: iadd
    //   40: putfield m : I
    //   43: aload #5
    //   45: astore_3
    //   46: goto -> 59
    //   49: new gx1
    //   52: dup
    //   53: aload_0
    //   54: aload_3
    //   55: invokespecial <init> : (Ljx1;Lds;)V
    //   58: astore_3
    //   59: aload_3
    //   60: getfield k : Ljava/lang/Object;
    //   63: astore #6
    //   65: aload_3
    //   66: getfield m : I
    //   69: istore #4
    //   71: iload #4
    //   73: ifeq -> 125
    //   76: iload #4
    //   78: iconst_1
    //   79: if_icmpne -> 117
    //   82: aload_3
    //   83: getfield j : I
    //   86: istore #4
    //   88: aload_3
    //   89: getfield i : I
    //   92: istore_2
    //   93: aload_3
    //   94: getfield h : [Ljava/lang/String;
    //   97: astore_0
    //   98: aload_3
    //   99: getfield g : Ljava/lang/String;
    //   102: astore #5
    //   104: aload_3
    //   105: getfield f : Lo81;
    //   108: astore_1
    //   109: aload #6
    //   111: invokestatic r0 : (Ljava/lang/Object;)V
    //   114: goto -> 292
    //   117: getstatic org/jaudiotagger/audio/Hy/PwbbJfsdcHrAjW.FQsfHsRmCIEnxc : Ljava/lang/String;
    //   120: invokestatic f : (Ljava/lang/String;)V
    //   123: aconst_null
    //   124: areturn
    //   125: aload #6
    //   127: invokestatic r0 : (Ljava/lang/Object;)V
    //   130: aload_0
    //   131: getfield g : [Ljava/lang/String;
    //   134: iload_2
    //   135: aaload
    //   136: astore #5
    //   138: getstatic jx1.l : [Ljava/lang/String;
    //   141: astore_0
    //   142: iconst_3
    //   143: istore #4
    //   145: iconst_0
    //   146: istore_2
    //   147: iload_2
    //   148: iload #4
    //   150: if_icmpge -> 298
    //   153: aload_0
    //   154: iload_2
    //   155: aaload
    //   156: astore #6
    //   158: new java/lang/StringBuilder
    //   161: dup
    //   162: ldc_w 'room_table_modification_trigger_'
    //   165: invokespecial <init> : (Ljava/lang/String;)V
    //   168: astore #7
    //   170: aload #7
    //   172: aload #5
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload #7
    //   180: bipush #95
    //   182: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #7
    //   188: aload #6
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload #7
    //   196: invokevirtual toString : ()Ljava/lang/String;
    //   199: astore #6
    //   201: new java/lang/StringBuilder
    //   204: dup
    //   205: ldc_w 'DROP TRIGGER IF EXISTS `'
    //   208: invokespecial <init> : (Ljava/lang/String;)V
    //   211: astore #7
    //   213: aload #7
    //   215: aload #6
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload #7
    //   223: bipush #96
    //   225: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #7
    //   231: invokevirtual toString : ()Ljava/lang/String;
    //   234: astore #6
    //   236: aload_3
    //   237: aload_1
    //   238: putfield f : Lo81;
    //   241: aload_3
    //   242: aload #5
    //   244: putfield g : Ljava/lang/String;
    //   247: aload_3
    //   248: aload_0
    //   249: putfield h : [Ljava/lang/String;
    //   252: aload_3
    //   253: iload_2
    //   254: putfield i : I
    //   257: aload_3
    //   258: iload #4
    //   260: putfield j : I
    //   263: aload_3
    //   264: iconst_1
    //   265: putfield m : I
    //   268: aload_1
    //   269: aload #6
    //   271: aload_3
    //   272: invokestatic x : (Lo81;Ljava/lang/String;Lds;)Ljava/lang/Object;
    //   275: astore #6
    //   277: getstatic ys.b : Lys;
    //   280: astore #7
    //   282: aload #6
    //   284: aload #7
    //   286: if_acmpne -> 292
    //   289: aload #7
    //   291: areturn
    //   292: iinc #2, 1
    //   295: goto -> 147
    //   298: getstatic l02.a : Ll02;
    //   301: areturn
  }
  
  public final void e(lc0 paramlc01, lc0 paramlc02) {
    paramlc01.getClass();
    paramlc02.getClass();
    if (this.j.compareAndSet(false, true)) {
      paramlc01.a();
      as as = ((eh1)this.a).a;
      if (as != null) {
        qv.L(as, new ts(), null, new sc(this, paramlc02, null, 10), 2);
        return;
      } 
      ui0.n0("coroutineScope");
      throw null;
    } 
  }
  
  public final Object f(ds paramds) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof hx1
    //   4: ifeq -> 35
    //   7: aload_1
    //   8: checkcast hx1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield i : I
    //   16: istore_2
    //   17: iload_2
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 35
    //   24: aload_3
    //   25: iload_2
    //   26: ldc -2147483648
    //   28: iadd
    //   29: putfield i : I
    //   32: goto -> 45
    //   35: new hx1
    //   38: dup
    //   39: aload_0
    //   40: aload_1
    //   41: invokespecial <init> : (Ljx1;Lds;)V
    //   44: astore_3
    //   45: aload_3
    //   46: getfield g : Ljava/lang/Object;
    //   49: astore #4
    //   51: aload_3
    //   52: getfield i : I
    //   55: istore_2
    //   56: iload_2
    //   57: ifeq -> 89
    //   60: iload_2
    //   61: iconst_1
    //   62: if_icmpne -> 82
    //   65: aload_3
    //   66: getfield f : Lg7;
    //   69: astore_1
    //   70: aload #4
    //   72: invokestatic r0 : (Ljava/lang/Object;)V
    //   75: goto -> 159
    //   78: astore_3
    //   79: goto -> 167
    //   82: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   84: invokestatic f : (Ljava/lang/String;)V
    //   87: aconst_null
    //   88: areturn
    //   89: aload #4
    //   91: invokestatic r0 : (Ljava/lang/Object;)V
    //   94: aload_0
    //   95: getfield a : Landroidx/work/impl/WorkDatabase_Impl;
    //   98: astore #4
    //   100: aload #4
    //   102: getfield f : Lg7;
    //   105: astore_1
    //   106: aload_1
    //   107: invokevirtual b : ()Z
    //   110: ifeq -> 173
    //   113: new ex1
    //   116: astore #5
    //   118: aload #5
    //   120: aload_0
    //   121: aconst_null
    //   122: iconst_2
    //   123: invokespecial <init> : (Ljx1;Lcs;I)V
    //   126: aload_3
    //   127: aload_1
    //   128: putfield f : Lg7;
    //   131: aload_3
    //   132: iconst_1
    //   133: putfield i : I
    //   136: aload #4
    //   138: iconst_0
    //   139: aload #5
    //   141: aload_3
    //   142: invokevirtual p : (ZLad0;Lds;)Ljava/lang/Object;
    //   145: astore #4
    //   147: getstatic ys.b : Lys;
    //   150: astore_3
    //   151: aload #4
    //   153: aload_3
    //   154: if_acmpne -> 159
    //   157: aload_3
    //   158: areturn
    //   159: aload_1
    //   160: invokevirtual K : ()V
    //   163: goto -> 173
    //   166: astore_3
    //   167: aload_1
    //   168: invokevirtual K : ()V
    //   171: aload_3
    //   172: athrow
    //   173: getstatic l02.a : Ll02;
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   70	75	78	finally
    //   113	147	166	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */