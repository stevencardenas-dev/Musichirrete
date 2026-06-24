import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class aa1 {
  public static final Class[] e = new Class[] { Context.class, AttributeSet.class };
  
  public static final HashMap f = new HashMap<Object, Object>();
  
  public final Context a;
  
  public final Object[] b = new Object[2];
  
  public final ba1 c;
  
  public final String[] d;
  
  public aa1(Context paramContext, ba1 paramba1) {
    this.a = paramContext;
    this.c = paramba1;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Preference.class.getPackage().getName());
    stringBuilder.append(".");
    String str = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(SwitchPreference.class.getPackage().getName());
    stringBuilder.append(".");
    this.d = new String[] { str, stringBuilder.toString() };
  }
  
  public final Preference a(String paramString, String[] paramArrayOfString, AttributeSet paramAttributeSet) {
    StringBuilder stringBuilder;
    HashMap<String, Constructor> hashMap = f;
    Constructor<Preference> constructor2 = (Constructor)hashMap.get(paramString);
    Constructor<Preference> constructor1 = constructor2;
    if (constructor2 == null)
      try {
        Class<?> clazz;
        InflateException inflateException;
        ClassLoader classLoader = this.a.getClassLoader();
        if (paramArrayOfString == null || paramArrayOfString.length == 0) {
          clazz = Class.forName(paramString, false, classLoader);
        } else {
          Class<?> clazz1;
          int i = clazz.length;
          Constructor<Preference> constructor = null;
          byte b = 0;
          constructor2 = null;
          while (true) {
            constructor1 = constructor;
            if (b < i) {
              clazz1 = clazz[b];
              try {
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append((String)clazz1);
                stringBuilder1.append(paramString);
                clazz1 = Class.forName(stringBuilder1.toString(), false, classLoader);
                break;
              } catch (ClassNotFoundException classNotFoundException1) {
                b++;
                continue;
              } 
            } 
            break;
          } 
          clazz = clazz1;
          if (clazz1 == null) {
            if (classNotFoundException1 == null) {
              inflateException = new InflateException();
              stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(paramAttributeSet.getPositionDescription());
              stringBuilder.append(": Error inflating class ");
              stringBuilder.append(paramString);
              this(stringBuilder.toString());
              throw inflateException;
            } 
            throw classNotFoundException1;
          } 
        } 
        constructor1 = inflateException.getConstructor(e);
        constructor1.setAccessible(true);
        hashMap.put(paramString, constructor1);
        Object[] arrayOfObject1 = this.b;
        arrayOfObject1[1] = paramAttributeSet;
        return constructor1.newInstance(arrayOfObject1);
      } catch (ClassNotFoundException classNotFoundException) {
        throw classNotFoundException;
      } catch (Exception exception) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(paramAttributeSet.getPositionDescription());
        stringBuilder.append(": Error inflating class ");
        stringBuilder.append((String)classNotFoundException);
        InflateException inflateException = new InflateException(stringBuilder.toString());
        inflateException.initCause(exception);
        throw inflateException;
      }  
    Object[] arrayOfObject = this.b;
    arrayOfObject[1] = paramAttributeSet;
    return stringBuilder.newInstance(arrayOfObject);
  }
  
  public final Preference b(String paramString, AttributeSet paramAttributeSet) {
    try {
      return (-1 == paramString.indexOf('.')) ? a(paramString, this.d, paramAttributeSet) : a(paramString, null, paramAttributeSet);
    } catch (InflateException inflateException) {
      throw inflateException;
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramAttributeSet.getPositionDescription());
      stringBuilder.append(": Error inflating class (not found)");
      stringBuilder.append((String)inflateException);
      inflateException = new InflateException(stringBuilder.toString());
      inflateException.initCause(classNotFoundException);
      throw inflateException;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramAttributeSet.getPositionDescription());
      stringBuilder.append(": Error inflating class ");
      stringBuilder.append((String)inflateException);
      inflateException = new InflateException(stringBuilder.toString());
      inflateException.initCause(exception);
      throw inflateException;
    } 
  }
  
  public final PreferenceGroup c(XmlResourceParser paramXmlResourceParser) {
    synchronized (this.b) {
      AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser);
      this.b[0] = this.a;
      try {
        int i;
        do {
          i = paramXmlResourceParser.next();
        } while (i != 2 && i != 1);
        if (i == 2) {
          PreferenceGroup preferenceGroup = (PreferenceGroup)b(paramXmlResourceParser.getName(), attributeSet);
          preferenceGroup.m(this.c);
          d((XmlPullParser)paramXmlResourceParser, (Preference)preferenceGroup, attributeSet);
          return preferenceGroup;
        } 
      } catch (InflateException inflateException) {
      
      } catch (XmlPullParserException xmlPullParserException) {
      
      } catch (IOException iOException) {}
    } 
  }
  
  public final void d(XmlPullParser paramXmlPullParser, Preference paramPreference, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getDepth : ()I
    //   6: istore #6
    //   8: aload_1
    //   9: invokeinterface next : ()I
    //   14: istore #4
    //   16: iload #4
    //   18: iconst_3
    //   19: if_icmpne -> 33
    //   22: aload_1
    //   23: invokeinterface getDepth : ()I
    //   28: iload #6
    //   30: if_icmple -> 761
    //   33: iload #4
    //   35: iconst_1
    //   36: if_icmpeq -> 761
    //   39: iload #4
    //   41: iconst_2
    //   42: if_icmpeq -> 48
    //   45: goto -> 8
    //   48: aload_1
    //   49: invokeinterface getName : ()Ljava/lang/String;
    //   54: astore #10
    //   56: ldc 'intent'
    //   58: aload #10
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 108
    //   66: aload_0
    //   67: getfield a : Landroid/content/Context;
    //   70: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   73: aload_1
    //   74: aload_3
    //   75: invokestatic parseIntent : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/content/Intent;
    //   78: astore #10
    //   80: aload_2
    //   81: aload #10
    //   83: putfield n : Landroid/content/Intent;
    //   86: goto -> 8
    //   89: astore_1
    //   90: new org/xmlpull/v1/XmlPullParserException
    //   93: dup
    //   94: ldc 'Error parsing preference'
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: astore_2
    //   100: aload_2
    //   101: aload_1
    //   102: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   105: pop
    //   106: aload_2
    //   107: athrow
    //   108: ldc 'extra'
    //   110: aload #10
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 222
    //   118: aload_0
    //   119: getfield a : Landroid/content/Context;
    //   122: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   125: astore #10
    //   127: aload_2
    //   128: getfield p : Landroid/os/Bundle;
    //   131: ifnonnull -> 145
    //   134: aload_2
    //   135: new android/os/Bundle
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: putfield p : Landroid/os/Bundle;
    //   145: aload #10
    //   147: ldc 'extra'
    //   149: aload_3
    //   150: aload_2
    //   151: getfield p : Landroid/os/Bundle;
    //   154: invokevirtual parseBundleExtra : (Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    //   157: aload_1
    //   158: invokeinterface getDepth : ()I
    //   163: istore #4
    //   165: aload_1
    //   166: invokeinterface next : ()I
    //   171: istore #5
    //   173: iload #5
    //   175: iconst_1
    //   176: if_icmpeq -> 8
    //   179: iload #5
    //   181: iconst_3
    //   182: if_icmpne -> 165
    //   185: aload_1
    //   186: invokeinterface getDepth : ()I
    //   191: istore #5
    //   193: iload #5
    //   195: iload #4
    //   197: if_icmpgt -> 165
    //   200: goto -> 8
    //   203: astore_1
    //   204: new org/xmlpull/v1/XmlPullParserException
    //   207: dup
    //   208: ldc 'Error parsing preference'
    //   210: invokespecial <init> : (Ljava/lang/String;)V
    //   213: astore_2
    //   214: aload_2
    //   215: aload_1
    //   216: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   219: pop
    //   220: aload_2
    //   221: athrow
    //   222: aload_0
    //   223: aload #10
    //   225: aload_3
    //   226: invokevirtual b : (Ljava/lang/String;Landroid/util/AttributeSet;)Landroidx/preference/Preference;
    //   229: astore #13
    //   231: aload_2
    //   232: checkcast androidx/preference/PreferenceGroup
    //   235: astore #11
    //   237: aload #11
    //   239: getfield P : Ljava/util/ArrayList;
    //   242: aload #13
    //   244: invokevirtual contains : (Ljava/lang/Object;)Z
    //   247: ifeq -> 253
    //   250: goto -> 722
    //   253: aload #13
    //   255: getfield m : Ljava/lang/String;
    //   258: ifnull -> 339
    //   261: aload #11
    //   263: astore #10
    //   265: aload #10
    //   267: getfield J : Landroidx/preference/PreferenceGroup;
    //   270: astore #12
    //   272: aload #12
    //   274: ifnull -> 284
    //   277: aload #12
    //   279: astore #10
    //   281: goto -> 265
    //   284: aload #13
    //   286: getfield m : Ljava/lang/String;
    //   289: astore #12
    //   291: aload #10
    //   293: aload #12
    //   295: invokevirtual F : (Ljava/lang/CharSequence;)Landroidx/preference/Preference;
    //   298: ifnull -> 339
    //   301: new java/lang/StringBuilder
    //   304: dup
    //   305: ldc 'Found duplicated key: "'
    //   307: invokespecial <init> : (Ljava/lang/String;)V
    //   310: astore #10
    //   312: aload #10
    //   314: aload #12
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: pop
    //   320: aload #10
    //   322: ldc '". This can cause unintended behaviour, please use unique keys for every preference.'
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: ldc 'PreferenceGroup'
    //   330: aload #10
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   338: pop
    //   339: aload #13
    //   341: getfield h : I
    //   344: istore #5
    //   346: iload #5
    //   348: ldc 2147483647
    //   350: if_icmpne -> 453
    //   353: aload #11
    //   355: getfield Q : Z
    //   358: ifeq -> 432
    //   361: aload #11
    //   363: getfield R : I
    //   366: istore #4
    //   368: aload #11
    //   370: iload #4
    //   372: iconst_1
    //   373: iadd
    //   374: putfield R : I
    //   377: iload #4
    //   379: iload #5
    //   381: if_icmpeq -> 432
    //   384: aload #13
    //   386: iload #4
    //   388: putfield h : I
    //   391: aload #13
    //   393: getfield H : Lz91;
    //   396: astore #12
    //   398: aload #12
    //   400: ifnull -> 432
    //   403: aload #12
    //   405: getfield h : Landroid/os/Handler;
    //   408: astore #10
    //   410: aload #12
    //   412: getfield i : Le3;
    //   415: astore #12
    //   417: aload #10
    //   419: aload #12
    //   421: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   424: aload #10
    //   426: aload #12
    //   428: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   431: pop
    //   432: aload #13
    //   434: instanceof androidx/preference/PreferenceGroup
    //   437: ifeq -> 453
    //   440: aload #13
    //   442: checkcast androidx/preference/PreferenceGroup
    //   445: aload #11
    //   447: getfield Q : Z
    //   450: putfield Q : Z
    //   453: aload #11
    //   455: getfield P : Ljava/util/ArrayList;
    //   458: aload #13
    //   460: invokestatic binarySearch : (Ljava/util/List;Ljava/lang/Object;)I
    //   463: istore #5
    //   465: iload #5
    //   467: istore #4
    //   469: iload #5
    //   471: ifge -> 482
    //   474: iload #5
    //   476: iconst_m1
    //   477: imul
    //   478: iconst_1
    //   479: isub
    //   480: istore #4
    //   482: aload #11
    //   484: invokevirtual D : ()Z
    //   487: istore #9
    //   489: aload #13
    //   491: getfield w : Z
    //   494: iload #9
    //   496: if_icmpne -> 523
    //   499: aload #13
    //   501: iload #9
    //   503: iconst_1
    //   504: ixor
    //   505: putfield w : Z
    //   508: aload #13
    //   510: aload #13
    //   512: invokevirtual D : ()Z
    //   515: invokevirtual k : (Z)V
    //   518: aload #13
    //   520: invokevirtual j : ()V
    //   523: aload #11
    //   525: monitorenter
    //   526: aload #11
    //   528: getfield P : Ljava/util/ArrayList;
    //   531: iload #4
    //   533: aload #13
    //   535: invokevirtual add : (ILjava/lang/Object;)V
    //   538: aload #11
    //   540: monitorexit
    //   541: aload #11
    //   543: getfield c : Lba1;
    //   546: astore #10
    //   548: aload #13
    //   550: getfield m : Ljava/lang/String;
    //   553: astore #12
    //   555: aload #12
    //   557: ifnull -> 605
    //   560: aload #11
    //   562: getfield O : Lzm1;
    //   565: aload #12
    //   567: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   570: ifeq -> 605
    //   573: aload #11
    //   575: getfield O : Lzm1;
    //   578: aload #12
    //   580: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   583: checkcast java/lang/Long
    //   586: invokevirtual longValue : ()J
    //   589: lstore #7
    //   591: aload #11
    //   593: getfield O : Lzm1;
    //   596: aload #12
    //   598: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   601: pop
    //   602: goto -> 627
    //   605: aload #10
    //   607: monitorenter
    //   608: aload #10
    //   610: getfield b : J
    //   613: lstore #7
    //   615: aload #10
    //   617: lconst_1
    //   618: lload #7
    //   620: ladd
    //   621: putfield b : J
    //   624: aload #10
    //   626: monitorexit
    //   627: aload #13
    //   629: lload #7
    //   631: putfield e : J
    //   634: aload #13
    //   636: iconst_1
    //   637: putfield f : Z
    //   640: aload #13
    //   642: aload #10
    //   644: invokevirtual m : (Lba1;)V
    //   647: aload #13
    //   649: iconst_0
    //   650: putfield f : Z
    //   653: aload #13
    //   655: getfield J : Landroidx/preference/PreferenceGroup;
    //   658: ifnonnull -> 733
    //   661: aload #13
    //   663: aload #11
    //   665: putfield J : Landroidx/preference/PreferenceGroup;
    //   668: aload #11
    //   670: getfield S : Z
    //   673: ifeq -> 681
    //   676: aload #13
    //   678: invokevirtual l : ()V
    //   681: aload #11
    //   683: getfield H : Lz91;
    //   686: astore #11
    //   688: aload #11
    //   690: ifnull -> 722
    //   693: aload #11
    //   695: getfield h : Landroid/os/Handler;
    //   698: astore #10
    //   700: aload #11
    //   702: getfield i : Le3;
    //   705: astore #11
    //   707: aload #10
    //   709: aload #11
    //   711: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   714: aload #10
    //   716: aload #11
    //   718: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   721: pop
    //   722: aload_0
    //   723: aload_1
    //   724: aload #13
    //   726: aload_3
    //   727: invokevirtual d : (Lorg/xmlpull/v1/XmlPullParser;Landroidx/preference/Preference;Landroid/util/AttributeSet;)V
    //   730: goto -> 8
    //   733: ldc_w 'This preference already has a parent. You must remove the existing parent before assigning a new one.'
    //   736: invokestatic f : (Ljava/lang/String;)V
    //   739: return
    //   740: astore_1
    //   741: aload #13
    //   743: iconst_0
    //   744: putfield f : Z
    //   747: aload_1
    //   748: athrow
    //   749: astore_1
    //   750: aload #10
    //   752: monitorexit
    //   753: aload_1
    //   754: athrow
    //   755: astore_1
    //   756: aload #11
    //   758: monitorexit
    //   759: aload_1
    //   760: athrow
    //   761: return
    // Exception table:
    //   from	to	target	type
    //   66	80	89	java/io/IOException
    //   157	165	203	java/io/IOException
    //   165	173	203	java/io/IOException
    //   185	193	203	java/io/IOException
    //   526	541	755	finally
    //   608	627	749	finally
    //   640	647	740	finally
    //   750	753	749	finally
    //   756	759	755	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */