import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public abstract class xm0 {
  public static final HashMap a = new HashMap<Object, Object>();
  
  public static final HashMap b = new HashMap<Object, Object>();
  
  public static void a(Constructor<T> paramConstructor, sm0 paramsm0) {
    try {
      paramConstructor.newInstance(new Object[] { paramsm0 }).getClass();
      ClassCastException classCastException = new ClassCastException();
      this();
      throw classCastException;
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException(illegalAccessException);
    } catch (InstantiationException instantiationException) {
      throw new RuntimeException(instantiationException);
    } catch (InvocationTargetException invocationTargetException) {
      throw new RuntimeException(invocationTargetException);
    } 
  }
  
  public static int b(Class paramClass) {
    // Byte code:
    //   0: getstatic xm0.a : Ljava/util/HashMap;
    //   3: astore #9
    //   5: aload #9
    //   7: aload_0
    //   8: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: checkcast java/lang/Integer
    //   14: astore #6
    //   16: aload #6
    //   18: ifnull -> 27
    //   21: aload #6
    //   23: invokevirtual intValue : ()I
    //   26: ireturn
    //   27: aload_0
    //   28: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   31: astore #6
    //   33: iconst_1
    //   34: istore_2
    //   35: aload #6
    //   37: ifnonnull -> 45
    //   40: iload_2
    //   41: istore_1
    //   42: goto -> 625
    //   45: iconst_0
    //   46: istore_3
    //   47: aconst_null
    //   48: astore #8
    //   50: aload_0
    //   51: invokevirtual getPackage : ()Ljava/lang/Package;
    //   54: astore #6
    //   56: aload_0
    //   57: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   60: astore #7
    //   62: aload #6
    //   64: ifnull -> 81
    //   67: aload #6
    //   69: invokevirtual getName : ()Ljava/lang/String;
    //   72: astore #6
    //   74: goto -> 85
    //   77: astore_0
    //   78: goto -> 244
    //   81: ldc ''
    //   83: astore #6
    //   85: aload #6
    //   87: invokevirtual getClass : ()Ljava/lang/Class;
    //   90: pop
    //   91: aload #6
    //   93: invokevirtual length : ()I
    //   96: ifne -> 102
    //   99: goto -> 122
    //   102: aload #7
    //   104: invokevirtual getClass : ()Ljava/lang/Class;
    //   107: pop
    //   108: aload #7
    //   110: aload #6
    //   112: invokevirtual length : ()I
    //   115: iconst_1
    //   116: iadd
    //   117: invokevirtual substring : (I)Ljava/lang/String;
    //   120: astore #7
    //   122: aload #7
    //   124: invokevirtual getClass : ()Ljava/lang/Class;
    //   127: pop
    //   128: aload #7
    //   130: ldc '.'
    //   132: ldc '_'
    //   134: invokestatic E0 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   137: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.pfagnlFx : Ljava/lang/String;
    //   140: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   143: astore #7
    //   145: aload #6
    //   147: invokevirtual length : ()I
    //   150: ifne -> 160
    //   153: aload #7
    //   155: astore #6
    //   157: goto -> 201
    //   160: new java/lang/StringBuilder
    //   163: astore #10
    //   165: aload #10
    //   167: invokespecial <init> : ()V
    //   170: aload #10
    //   172: aload #6
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload #10
    //   180: bipush #46
    //   182: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: aload #10
    //   188: aload #7
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload #10
    //   196: invokevirtual toString : ()Ljava/lang/String;
    //   199: astore #6
    //   201: aload #6
    //   203: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   206: iconst_1
    //   207: anewarray java/lang/Class
    //   210: dup
    //   211: iconst_0
    //   212: aload_0
    //   213: aastore
    //   214: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   217: astore #7
    //   219: aload #7
    //   221: astore #6
    //   223: aload #7
    //   225: invokevirtual isAccessible : ()Z
    //   228: ifne -> 255
    //   231: aload #7
    //   233: iconst_1
    //   234: invokevirtual setAccessible : (Z)V
    //   237: aload #7
    //   239: astore #6
    //   241: goto -> 255
    //   244: aload_0
    //   245: invokestatic n : (Ljava/lang/Throwable;)V
    //   248: iconst_0
    //   249: ireturn
    //   250: astore #6
    //   252: aconst_null
    //   253: astore #6
    //   255: getstatic xm0.b : Ljava/util/HashMap;
    //   258: astore #10
    //   260: aload #6
    //   262: ifnull -> 282
    //   265: aload #10
    //   267: aload_0
    //   268: aload #6
    //   270: invokestatic E : (Ljava/lang/Object;)Ljava/util/List;
    //   273: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   276: pop
    //   277: iconst_2
    //   278: istore_1
    //   279: goto -> 625
    //   282: getstatic ol.c : Lol;
    //   285: astore #7
    //   287: aload #7
    //   289: getfield b : Ljava/util/HashMap;
    //   292: astore #6
    //   294: aload #6
    //   296: aload_0
    //   297: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   300: checkcast java/lang/Boolean
    //   303: astore #11
    //   305: aload #11
    //   307: ifnull -> 320
    //   310: aload #11
    //   312: invokevirtual booleanValue : ()Z
    //   315: istore #5
    //   317: goto -> 388
    //   320: aload_0
    //   321: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   324: astore #11
    //   326: aload #11
    //   328: arraylength
    //   329: istore #4
    //   331: iconst_0
    //   332: istore_1
    //   333: iload_1
    //   334: iload #4
    //   336: if_icmpge -> 375
    //   339: aload #11
    //   341: iload_1
    //   342: aaload
    //   343: ldc k41
    //   345: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   348: checkcast k41
    //   351: ifnull -> 369
    //   354: aload #7
    //   356: aload_0
    //   357: aload #11
    //   359: invokevirtual a : (Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lml;
    //   362: pop
    //   363: iconst_1
    //   364: istore #5
    //   366: goto -> 388
    //   369: iinc #1, 1
    //   372: goto -> 333
    //   375: aload #6
    //   377: aload_0
    //   378: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   381: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: iconst_0
    //   386: istore #5
    //   388: iload #5
    //   390: ifeq -> 398
    //   393: iload_2
    //   394: istore_1
    //   395: goto -> 625
    //   398: aload_0
    //   399: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   402: astore #7
    //   404: aload #8
    //   406: astore #6
    //   408: aload #7
    //   410: ifnull -> 476
    //   413: aload #8
    //   415: astore #6
    //   417: ldc sm0
    //   419: aload #7
    //   421: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   424: ifeq -> 476
    //   427: aload #7
    //   429: invokevirtual getClass : ()Ljava/lang/Class;
    //   432: pop
    //   433: aload #7
    //   435: invokestatic b : (Ljava/lang/Class;)I
    //   438: iconst_1
    //   439: if_icmpne -> 447
    //   442: iload_2
    //   443: istore_1
    //   444: goto -> 625
    //   447: aload #10
    //   449: aload #7
    //   451: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   454: astore #6
    //   456: aload #6
    //   458: invokevirtual getClass : ()Ljava/lang/Class;
    //   461: pop
    //   462: new java/util/ArrayList
    //   465: dup
    //   466: aload #6
    //   468: checkcast java/util/Collection
    //   471: invokespecial <init> : (Ljava/util/Collection;)V
    //   474: astore #6
    //   476: aload_0
    //   477: invokevirtual getInterfaces : ()[Ljava/lang/Class;
    //   480: astore #8
    //   482: aload #8
    //   484: invokevirtual getClass : ()Ljava/lang/Class;
    //   487: pop
    //   488: aload #8
    //   490: arraylength
    //   491: istore #4
    //   493: iload_3
    //   494: istore_1
    //   495: iload_1
    //   496: iload #4
    //   498: if_icmpge -> 606
    //   501: aload #8
    //   503: iload_1
    //   504: aaload
    //   505: astore #11
    //   507: aload #6
    //   509: astore #7
    //   511: aload #11
    //   513: ifnull -> 596
    //   516: aload #6
    //   518: astore #7
    //   520: ldc sm0
    //   522: aload #11
    //   524: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   527: ifeq -> 596
    //   530: aload #11
    //   532: invokevirtual getClass : ()Ljava/lang/Class;
    //   535: pop
    //   536: aload #11
    //   538: invokestatic b : (Ljava/lang/Class;)I
    //   541: iconst_1
    //   542: if_icmpne -> 550
    //   545: iload_2
    //   546: istore_1
    //   547: goto -> 625
    //   550: aload #6
    //   552: astore #7
    //   554: aload #6
    //   556: ifnonnull -> 568
    //   559: new java/util/ArrayList
    //   562: dup
    //   563: invokespecial <init> : ()V
    //   566: astore #7
    //   568: aload #10
    //   570: aload #11
    //   572: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   575: astore #6
    //   577: aload #6
    //   579: invokevirtual getClass : ()Ljava/lang/Class;
    //   582: pop
    //   583: aload #7
    //   585: aload #6
    //   587: checkcast java/util/Collection
    //   590: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   595: pop
    //   596: iinc #1, 1
    //   599: aload #7
    //   601: astore #6
    //   603: goto -> 495
    //   606: iload_2
    //   607: istore_1
    //   608: aload #6
    //   610: ifnull -> 625
    //   613: aload #10
    //   615: aload_0
    //   616: aload #6
    //   618: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   621: pop
    //   622: goto -> 277
    //   625: aload #9
    //   627: aload_0
    //   628: iload_1
    //   629: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   632: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   635: pop
    //   636: iload_1
    //   637: ireturn
    //   638: astore_0
    //   639: new java/lang/IllegalArgumentException
    //   642: dup
    //   643: ldc 'The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.'
    //   645: aload_0
    //   646: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   649: athrow
    // Exception table:
    //   from	to	target	type
    //   50	62	250	java/lang/ClassNotFoundException
    //   50	62	77	java/lang/NoSuchMethodException
    //   67	74	250	java/lang/ClassNotFoundException
    //   67	74	77	java/lang/NoSuchMethodException
    //   85	99	250	java/lang/ClassNotFoundException
    //   85	99	77	java/lang/NoSuchMethodException
    //   102	122	250	java/lang/ClassNotFoundException
    //   102	122	77	java/lang/NoSuchMethodException
    //   122	153	250	java/lang/ClassNotFoundException
    //   122	153	77	java/lang/NoSuchMethodException
    //   160	201	250	java/lang/ClassNotFoundException
    //   160	201	77	java/lang/NoSuchMethodException
    //   201	219	250	java/lang/ClassNotFoundException
    //   201	219	77	java/lang/NoSuchMethodException
    //   223	237	250	java/lang/ClassNotFoundException
    //   223	237	77	java/lang/NoSuchMethodException
    //   320	326	638	java/lang/NoClassDefFoundError
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */