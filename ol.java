import java.lang.reflect.Method;
import java.util.HashMap;

public final class ol {
  public static final ol c = new ol();
  
  public final HashMap a = new HashMap<Object, Object>();
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public static void b(HashMap<nl, om0> paramHashMap, nl paramnl, om0 paramom0, Class paramClass) {
    om0 om01 = (om0)paramHashMap.get(paramnl);
    if (om01 == null || paramom0 == om01) {
      if (om01 == null)
        paramHashMap.put(paramnl, paramom0); 
      return;
    } 
    String str1 = paramnl.b.getName();
    String str2 = paramClass.getName();
    StringBuilder stringBuilder = new StringBuilder("Method ");
    stringBuilder.append(str1);
    stringBuilder.append(" in ");
    stringBuilder.append(str2);
    stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
    stringBuilder.append(om01);
    stringBuilder.append(", new value ");
    stringBuilder.append(paramom0);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final ml a(Class<?> paramClass, Method[] paramArrayOfMethod) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   4: astore #10
    //   6: new java/util/HashMap
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #9
    //   15: aload_0
    //   16: getfield a : Ljava/util/HashMap;
    //   19: astore #8
    //   21: aload #10
    //   23: ifnull -> 65
    //   26: aload #8
    //   28: aload #10
    //   30: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast ml
    //   36: astore #7
    //   38: aload #7
    //   40: ifnull -> 46
    //   43: goto -> 55
    //   46: aload_0
    //   47: aload #10
    //   49: aconst_null
    //   50: invokevirtual a : (Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lml;
    //   53: astore #7
    //   55: aload #9
    //   57: aload #7
    //   59: getfield b : Ljava/util/HashMap;
    //   62: invokevirtual putAll : (Ljava/util/Map;)V
    //   65: aload_1
    //   66: invokevirtual getInterfaces : ()[Ljava/lang/Class;
    //   69: astore #10
    //   71: aload #10
    //   73: arraylength
    //   74: istore #4
    //   76: iconst_0
    //   77: istore_3
    //   78: iload_3
    //   79: iload #4
    //   81: if_icmpge -> 191
    //   84: aload #10
    //   86: iload_3
    //   87: aaload
    //   88: astore #11
    //   90: aload #8
    //   92: aload #11
    //   94: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: checkcast ml
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 110
    //   107: goto -> 119
    //   110: aload_0
    //   111: aload #11
    //   113: aconst_null
    //   114: invokevirtual a : (Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lml;
    //   117: astore #7
    //   119: aload #7
    //   121: getfield b : Ljava/util/HashMap;
    //   124: invokevirtual entrySet : ()Ljava/util/Set;
    //   127: invokeinterface iterator : ()Ljava/util/Iterator;
    //   132: astore #7
    //   134: aload #7
    //   136: invokeinterface hasNext : ()Z
    //   141: ifeq -> 185
    //   144: aload #7
    //   146: invokeinterface next : ()Ljava/lang/Object;
    //   151: checkcast java/util/Map$Entry
    //   154: astore #11
    //   156: aload #9
    //   158: aload #11
    //   160: invokeinterface getKey : ()Ljava/lang/Object;
    //   165: checkcast nl
    //   168: aload #11
    //   170: invokeinterface getValue : ()Ljava/lang/Object;
    //   175: checkcast om0
    //   178: aload_1
    //   179: invokestatic b : (Ljava/util/HashMap;Lnl;Lom0;Ljava/lang/Class;)V
    //   182: goto -> 134
    //   185: iinc #3, 1
    //   188: goto -> 78
    //   191: aload_2
    //   192: ifnull -> 198
    //   195: goto -> 203
    //   198: aload_1
    //   199: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   202: astore_2
    //   203: aload_2
    //   204: arraylength
    //   205: istore #5
    //   207: iconst_0
    //   208: istore #4
    //   210: iconst_0
    //   211: istore #6
    //   213: iload #4
    //   215: iload #5
    //   217: if_icmpge -> 382
    //   220: aload_2
    //   221: iload #4
    //   223: aaload
    //   224: astore #10
    //   226: aload #10
    //   228: ldc k41
    //   230: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   233: checkcast k41
    //   236: astore #11
    //   238: aload #11
    //   240: ifnonnull -> 246
    //   243: goto -> 369
    //   246: aload #10
    //   248: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   251: astore #7
    //   253: aload #7
    //   255: arraylength
    //   256: ifle -> 284
    //   259: ldc um0
    //   261: aload #7
    //   263: iconst_0
    //   264: aaload
    //   265: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   268: ifeq -> 276
    //   271: iconst_1
    //   272: istore_3
    //   273: goto -> 286
    //   276: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.Vhkxw : Ljava/lang/String;
    //   279: invokestatic l : (Ljava/lang/String;)V
    //   282: aconst_null
    //   283: areturn
    //   284: iconst_0
    //   285: istore_3
    //   286: aload #11
    //   288: invokeinterface value : ()Lom0;
    //   293: astore #11
    //   295: aload #7
    //   297: arraylength
    //   298: iconst_1
    //   299: if_icmple -> 341
    //   302: ldc om0
    //   304: aload #7
    //   306: iconst_1
    //   307: aaload
    //   308: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   311: ifeq -> 334
    //   314: aload #11
    //   316: getstatic om0.ON_ANY : Lom0;
    //   319: if_acmpne -> 327
    //   322: iconst_2
    //   323: istore_3
    //   324: goto -> 341
    //   327: ldc 'Second arg is supported only for ON_ANY value'
    //   329: invokestatic l : (Ljava/lang/String;)V
    //   332: aconst_null
    //   333: areturn
    //   334: ldc 'invalid parameter type. second arg must be an event'
    //   336: invokestatic l : (Ljava/lang/String;)V
    //   339: aconst_null
    //   340: areturn
    //   341: aload #7
    //   343: arraylength
    //   344: iconst_2
    //   345: if_icmpgt -> 375
    //   348: aload #9
    //   350: new nl
    //   353: dup
    //   354: iload_3
    //   355: aload #10
    //   357: invokespecial <init> : (ILjava/lang/reflect/Method;)V
    //   360: aload #11
    //   362: aload_1
    //   363: invokestatic b : (Ljava/util/HashMap;Lnl;Lom0;Ljava/lang/Class;)V
    //   366: iconst_1
    //   367: istore #6
    //   369: iinc #4, 1
    //   372: goto -> 213
    //   375: ldc 'cannot have more than 2 params'
    //   377: invokestatic l : (Ljava/lang/String;)V
    //   380: aconst_null
    //   381: areturn
    //   382: new ml
    //   385: dup
    //   386: aload #9
    //   388: invokespecial <init> : (Ljava/util/HashMap;)V
    //   391: astore_2
    //   392: aload #8
    //   394: aload_1
    //   395: aload_2
    //   396: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   399: pop
    //   400: aload_0
    //   401: getfield b : Ljava/util/HashMap;
    //   404: aload_1
    //   405: iload #6
    //   407: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   410: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   413: pop
    //   414: aload_2
    //   415: areturn
    //   416: astore_1
    //   417: new java/lang/IllegalArgumentException
    //   420: dup
    //   421: ldc 'The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.'
    //   423: aload_1
    //   424: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   427: athrow
    // Exception table:
    //   from	to	target	type
    //   198	203	416	java/lang/NoClassDefFoundError
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */