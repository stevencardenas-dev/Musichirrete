import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class cr1 extends MenuInflater {
  public static final Class[] e;
  
  public static final Class[] f;
  
  public final Object[] a;
  
  public final Object[] b;
  
  public final Context c;
  
  public Object d;
  
  static {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    e = arrayOfClass;
    f = arrayOfClass;
  }
  
  public cr1(Context paramContext) {
    super(paramContext);
    this.c = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    this.a = arrayOfObject;
    this.b = arrayOfObject;
  }
  
  public static Object a(Object paramObject) {
    if (paramObject instanceof android.app.Activity)
      return paramObject; 
    Object object = paramObject;
    if (paramObject instanceof ContextWrapper)
      object = a(((ContextWrapper)paramObject).getBaseContext()); 
    return object;
  }
  
  public final void b(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    // Byte code:
    //   0: new br1
    //   3: dup
    //   4: aload_0
    //   5: aload_3
    //   6: invokespecial <init> : (Lcr1;Landroid/view/Menu;)V
    //   9: astore #11
    //   11: aload_1
    //   12: invokeinterface getEventType : ()I
    //   17: istore #5
    //   19: iload #5
    //   21: iconst_2
    //   22: if_icmpne -> 62
    //   25: aload_1
    //   26: invokeinterface getName : ()Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: ldc 'menu'
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 52
    //   41: aload_1
    //   42: invokeinterface next : ()I
    //   47: istore #6
    //   49: goto -> 80
    //   52: ldc 'Expecting menu, got '
    //   54: aload_3
    //   55: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   58: invokestatic f : (Ljava/lang/String;)V
    //   61: return
    //   62: aload_1
    //   63: invokeinterface next : ()I
    //   68: istore #5
    //   70: iload #5
    //   72: iconst_1
    //   73: if_icmpne -> 1160
    //   76: iload #5
    //   78: istore #6
    //   80: iconst_0
    //   81: istore #5
    //   83: iconst_0
    //   84: istore #7
    //   86: aconst_null
    //   87: astore_3
    //   88: iload #6
    //   90: istore #8
    //   92: iload #5
    //   94: ifne -> 1159
    //   97: iload #8
    //   99: iconst_1
    //   100: if_icmpeq -> 1153
    //   103: aload #11
    //   105: getfield a : Landroid/view/Menu;
    //   108: astore #12
    //   110: iload #8
    //   112: iconst_2
    //   113: if_icmpeq -> 352
    //   116: iload #8
    //   118: iconst_3
    //   119: if_icmpeq -> 125
    //   122: goto -> 345
    //   125: aload_1
    //   126: invokeinterface getName : ()Ljava/lang/String;
    //   131: astore #10
    //   133: iload #7
    //   135: ifeq -> 155
    //   138: aload #10
    //   140: aload_3
    //   141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   144: ifeq -> 155
    //   147: iconst_0
    //   148: istore #6
    //   150: aconst_null
    //   151: astore_3
    //   152: goto -> 1138
    //   155: aload #10
    //   157: ldc 'group'
    //   159: invokevirtual equals : (Ljava/lang/Object;)Z
    //   162: ifeq -> 204
    //   165: aload #11
    //   167: iconst_0
    //   168: putfield b : I
    //   171: aload #11
    //   173: iconst_0
    //   174: putfield c : I
    //   177: aload #11
    //   179: iconst_0
    //   180: putfield d : I
    //   183: aload #11
    //   185: iconst_0
    //   186: putfield e : I
    //   189: aload #11
    //   191: iconst_1
    //   192: putfield f : Z
    //   195: aload #11
    //   197: iconst_1
    //   198: putfield g : Z
    //   201: goto -> 122
    //   204: aload #10
    //   206: ldc 'item'
    //   208: invokevirtual equals : (Ljava/lang/Object;)Z
    //   211: ifeq -> 332
    //   214: aload #11
    //   216: getfield h : Z
    //   219: ifne -> 122
    //   222: aload #11
    //   224: getfield z : Lvw0;
    //   227: astore #10
    //   229: aload #10
    //   231: ifnull -> 291
    //   234: aload #10
    //   236: getfield b : Landroid/view/ActionProvider;
    //   239: invokevirtual hasSubMenu : ()Z
    //   242: ifeq -> 291
    //   245: aload #11
    //   247: iconst_1
    //   248: putfield h : Z
    //   251: aload #11
    //   253: aload #12
    //   255: aload #11
    //   257: getfield b : I
    //   260: aload #11
    //   262: getfield i : I
    //   265: aload #11
    //   267: getfield j : I
    //   270: aload #11
    //   272: getfield k : Ljava/lang/CharSequence;
    //   275: invokeinterface addSubMenu : (IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    //   280: invokeinterface getItem : ()Landroid/view/MenuItem;
    //   285: invokevirtual b : (Landroid/view/MenuItem;)V
    //   288: goto -> 122
    //   291: aload #11
    //   293: iconst_1
    //   294: putfield h : Z
    //   297: aload #11
    //   299: aload #12
    //   301: aload #11
    //   303: getfield b : I
    //   306: aload #11
    //   308: getfield i : I
    //   311: aload #11
    //   313: getfield j : I
    //   316: aload #11
    //   318: getfield k : Ljava/lang/CharSequence;
    //   321: invokeinterface add : (IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    //   326: invokevirtual b : (Landroid/view/MenuItem;)V
    //   329: goto -> 122
    //   332: aload #10
    //   334: ldc 'menu'
    //   336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   339: ifeq -> 122
    //   342: iconst_1
    //   343: istore #5
    //   345: iload #7
    //   347: istore #6
    //   349: goto -> 1138
    //   352: iload #7
    //   354: ifeq -> 360
    //   357: goto -> 122
    //   360: aload_1
    //   361: invokeinterface getName : ()Ljava/lang/String;
    //   366: astore #10
    //   368: aload #10
    //   370: ldc 'group'
    //   372: invokevirtual equals : (Ljava/lang/Object;)Z
    //   375: istore #9
    //   377: aload_0
    //   378: getfield c : Landroid/content/Context;
    //   381: astore #13
    //   383: iload #9
    //   385: ifeq -> 479
    //   388: aload #13
    //   390: aload_2
    //   391: getstatic nc1.p : [I
    //   394: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   397: astore #10
    //   399: aload #11
    //   401: aload #10
    //   403: iconst_1
    //   404: iconst_0
    //   405: invokevirtual getResourceId : (II)I
    //   408: putfield b : I
    //   411: aload #11
    //   413: aload #10
    //   415: iconst_3
    //   416: iconst_0
    //   417: invokevirtual getInt : (II)I
    //   420: putfield c : I
    //   423: aload #11
    //   425: aload #10
    //   427: iconst_4
    //   428: iconst_0
    //   429: invokevirtual getInt : (II)I
    //   432: putfield d : I
    //   435: aload #11
    //   437: aload #10
    //   439: iconst_5
    //   440: iconst_0
    //   441: invokevirtual getInt : (II)I
    //   444: putfield e : I
    //   447: aload #11
    //   449: aload #10
    //   451: iconst_2
    //   452: iconst_1
    //   453: invokevirtual getBoolean : (IZ)Z
    //   456: putfield f : Z
    //   459: aload #11
    //   461: aload #10
    //   463: iconst_0
    //   464: iconst_1
    //   465: invokevirtual getBoolean : (IZ)Z
    //   468: putfield g : Z
    //   471: aload #10
    //   473: invokevirtual recycle : ()V
    //   476: goto -> 122
    //   479: aload #10
    //   481: ldc 'item'
    //   483: invokevirtual equals : (Ljava/lang/Object;)Z
    //   486: ifeq -> 1060
    //   489: aload #13
    //   491: aload_2
    //   492: getstatic nc1.q : [I
    //   495: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   498: astore #12
    //   500: aload #11
    //   502: aload #12
    //   504: iconst_2
    //   505: iconst_0
    //   506: invokevirtual getResourceId : (II)I
    //   509: putfield i : I
    //   512: aload #11
    //   514: aload #12
    //   516: iconst_5
    //   517: aload #11
    //   519: getfield c : I
    //   522: invokevirtual getInt : (II)I
    //   525: ldc -65536
    //   527: iand
    //   528: aload #12
    //   530: bipush #6
    //   532: aload #11
    //   534: getfield d : I
    //   537: invokevirtual getInt : (II)I
    //   540: ldc 65535
    //   542: iand
    //   543: ior
    //   544: putfield j : I
    //   547: aload #11
    //   549: aload #12
    //   551: bipush #7
    //   553: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   556: putfield k : Ljava/lang/CharSequence;
    //   559: aload #11
    //   561: aload #12
    //   563: bipush #8
    //   565: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   568: putfield l : Ljava/lang/CharSequence;
    //   571: aload #11
    //   573: aload #12
    //   575: iconst_0
    //   576: iconst_0
    //   577: invokevirtual getResourceId : (II)I
    //   580: putfield m : I
    //   583: aload #12
    //   585: bipush #9
    //   587: invokevirtual getString : (I)Ljava/lang/String;
    //   590: astore #10
    //   592: aload #10
    //   594: ifnonnull -> 603
    //   597: iconst_0
    //   598: istore #4
    //   600: goto -> 611
    //   603: aload #10
    //   605: iconst_0
    //   606: invokevirtual charAt : (I)C
    //   609: istore #4
    //   611: aload #11
    //   613: iload #4
    //   615: putfield n : C
    //   618: aload #11
    //   620: aload #12
    //   622: bipush #16
    //   624: sipush #4096
    //   627: invokevirtual getInt : (II)I
    //   630: putfield o : I
    //   633: aload #12
    //   635: bipush #10
    //   637: invokevirtual getString : (I)Ljava/lang/String;
    //   640: astore #10
    //   642: aload #10
    //   644: ifnonnull -> 653
    //   647: iconst_0
    //   648: istore #4
    //   650: goto -> 661
    //   653: aload #10
    //   655: iconst_0
    //   656: invokevirtual charAt : (I)C
    //   659: istore #4
    //   661: aload #11
    //   663: iload #4
    //   665: putfield p : C
    //   668: aload #11
    //   670: aload #12
    //   672: bipush #20
    //   674: sipush #4096
    //   677: invokevirtual getInt : (II)I
    //   680: putfield q : I
    //   683: aload #12
    //   685: bipush #11
    //   687: invokevirtual hasValue : (I)Z
    //   690: ifeq -> 709
    //   693: aload #11
    //   695: aload #12
    //   697: bipush #11
    //   699: iconst_0
    //   700: invokevirtual getBoolean : (IZ)Z
    //   703: putfield r : I
    //   706: goto -> 719
    //   709: aload #11
    //   711: aload #11
    //   713: getfield e : I
    //   716: putfield r : I
    //   719: aload #11
    //   721: aload #12
    //   723: iconst_3
    //   724: iconst_0
    //   725: invokevirtual getBoolean : (IZ)Z
    //   728: putfield s : Z
    //   731: aload #11
    //   733: aload #12
    //   735: iconst_4
    //   736: aload #11
    //   738: getfield f : Z
    //   741: invokevirtual getBoolean : (IZ)Z
    //   744: putfield t : Z
    //   747: aload #11
    //   749: aload #12
    //   751: iconst_1
    //   752: aload #11
    //   754: getfield g : Z
    //   757: invokevirtual getBoolean : (IZ)Z
    //   760: putfield u : Z
    //   763: aload #11
    //   765: aload #12
    //   767: bipush #21
    //   769: iconst_m1
    //   770: invokevirtual getInt : (II)I
    //   773: putfield v : I
    //   776: aload #11
    //   778: aload #12
    //   780: bipush #12
    //   782: invokevirtual getString : (I)Ljava/lang/String;
    //   785: putfield y : Ljava/lang/String;
    //   788: aload #11
    //   790: aload #12
    //   792: bipush #13
    //   794: iconst_0
    //   795: invokevirtual getResourceId : (II)I
    //   798: putfield w : I
    //   801: aload #11
    //   803: aload #12
    //   805: bipush #15
    //   807: invokevirtual getString : (I)Ljava/lang/String;
    //   810: putfield x : Ljava/lang/String;
    //   813: aload #12
    //   815: bipush #14
    //   817: invokevirtual getString : (I)Ljava/lang/String;
    //   820: astore #10
    //   822: aload #10
    //   824: ifnull -> 833
    //   827: iconst_1
    //   828: istore #6
    //   830: goto -> 836
    //   833: iconst_0
    //   834: istore #6
    //   836: iload #6
    //   838: ifeq -> 882
    //   841: aload #11
    //   843: getfield w : I
    //   846: ifne -> 882
    //   849: aload #11
    //   851: getfield x : Ljava/lang/String;
    //   854: ifnonnull -> 882
    //   857: aload #11
    //   859: aload #11
    //   861: aload #10
    //   863: getstatic cr1.f : [Ljava/lang/Class;
    //   866: aload_0
    //   867: getfield b : [Ljava/lang/Object;
    //   870: invokevirtual a : (Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   873: checkcast vw0
    //   876: putfield z : Lvw0;
    //   879: goto -> 901
    //   882: iload #6
    //   884: ifeq -> 895
    //   887: ldc 'SupportMenuInflater'
    //   889: ldc 'Ignoring attribute 'actionProviderClass'. Action view already specified.'
    //   891: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   894: pop
    //   895: aload #11
    //   897: aconst_null
    //   898: putfield z : Lvw0;
    //   901: aload #11
    //   903: aload #12
    //   905: bipush #17
    //   907: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   910: putfield A : Ljava/lang/CharSequence;
    //   913: aload #11
    //   915: aload #12
    //   917: bipush #22
    //   919: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   922: putfield B : Ljava/lang/CharSequence;
    //   925: aload #12
    //   927: bipush #19
    //   929: invokevirtual hasValue : (I)Z
    //   932: ifeq -> 959
    //   935: aload #11
    //   937: aload #12
    //   939: bipush #19
    //   941: iconst_m1
    //   942: invokevirtual getInt : (II)I
    //   945: aload #11
    //   947: getfield D : Landroid/graphics/PorterDuff$Mode;
    //   950: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   953: putfield D : Landroid/graphics/PorterDuff$Mode;
    //   956: goto -> 965
    //   959: aload #11
    //   961: aconst_null
    //   962: putfield D : Landroid/graphics/PorterDuff$Mode;
    //   965: aload #12
    //   967: bipush #18
    //   969: invokevirtual hasValue : (I)Z
    //   972: ifeq -> 1036
    //   975: aload #12
    //   977: bipush #18
    //   979: invokevirtual hasValue : (I)Z
    //   982: ifeq -> 1017
    //   985: aload #12
    //   987: bipush #18
    //   989: iconst_0
    //   990: invokevirtual getResourceId : (II)I
    //   993: istore #6
    //   995: iload #6
    //   997: ifeq -> 1017
    //   1000: aload #13
    //   1002: iload #6
    //   1004: invokestatic y : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   1007: astore #10
    //   1009: aload #10
    //   1011: ifnull -> 1017
    //   1014: goto -> 1026
    //   1017: aload #12
    //   1019: bipush #18
    //   1021: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   1024: astore #10
    //   1026: aload #11
    //   1028: aload #10
    //   1030: putfield C : Landroid/content/res/ColorStateList;
    //   1033: goto -> 1042
    //   1036: aload #11
    //   1038: aconst_null
    //   1039: putfield C : Landroid/content/res/ColorStateList;
    //   1042: aload #12
    //   1044: invokevirtual recycle : ()V
    //   1047: aload #11
    //   1049: iconst_0
    //   1050: putfield h : Z
    //   1053: iload #7
    //   1055: istore #6
    //   1057: goto -> 1138
    //   1060: aload #10
    //   1062: ldc 'menu'
    //   1064: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1067: ifeq -> 1132
    //   1070: aload #11
    //   1072: iconst_1
    //   1073: putfield h : Z
    //   1076: aload #12
    //   1078: aload #11
    //   1080: getfield b : I
    //   1083: aload #11
    //   1085: getfield i : I
    //   1088: aload #11
    //   1090: getfield j : I
    //   1093: aload #11
    //   1095: getfield k : Ljava/lang/CharSequence;
    //   1098: invokeinterface addSubMenu : (IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    //   1103: astore #10
    //   1105: aload #11
    //   1107: aload #10
    //   1109: invokeinterface getItem : ()Landroid/view/MenuItem;
    //   1114: invokevirtual b : (Landroid/view/MenuItem;)V
    //   1117: aload_0
    //   1118: aload_1
    //   1119: aload_2
    //   1120: aload #10
    //   1122: invokevirtual b : (Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   1125: iload #7
    //   1127: istore #6
    //   1129: goto -> 1138
    //   1132: aload #10
    //   1134: astore_3
    //   1135: iconst_1
    //   1136: istore #6
    //   1138: aload_1
    //   1139: invokeinterface next : ()I
    //   1144: istore #8
    //   1146: iload #6
    //   1148: istore #7
    //   1150: goto -> 92
    //   1153: getstatic androidx/profileinstaller/Vuyf/nBRIsU.bunqJILAmeNZu : Ljava/lang/String;
    //   1156: invokestatic f : (Ljava/lang/String;)V
    //   1159: return
    //   1160: goto -> 19
  }
  
  public final void inflate(int paramInt, Menu paramMenu) {
    AttributeSet attributeSet;
    if (!(paramMenu instanceof rw0)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    XmlResourceParser xmlResourceParser1 = null;
    byte b1 = 0;
    byte b3 = 0;
    boolean bool = false;
    byte b2 = 0;
    int i = b2;
    int j = b1;
    int k = b3;
    try {
      XmlResourceParser xmlResourceParser = this.c.getResources().getLayout(paramInt);
      xmlResourceParser1 = xmlResourceParser;
      i = b2;
      xmlResourceParser2 = xmlResourceParser;
      j = b1;
      xmlResourceParser3 = xmlResourceParser;
      k = b3;
      attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
      xmlResourceParser1 = xmlResourceParser;
      i = b2;
      xmlResourceParser2 = xmlResourceParser;
      j = b1;
      xmlResourceParser3 = xmlResourceParser;
      k = b3;
      paramInt = bool;
      if (paramMenu instanceof rw0) {
        xmlResourceParser1 = xmlResourceParser;
        i = b2;
        xmlResourceParser2 = xmlResourceParser;
        j = b1;
        xmlResourceParser3 = xmlResourceParser;
        k = b3;
        rw0 rw0 = (rw0)paramMenu;
        xmlResourceParser1 = xmlResourceParser;
        i = b2;
        xmlResourceParser2 = xmlResourceParser;
        j = b1;
        xmlResourceParser3 = xmlResourceParser;
        k = b3;
        paramInt = bool;
        if (!rw0.p) {
          xmlResourceParser1 = xmlResourceParser;
          i = b2;
          xmlResourceParser2 = xmlResourceParser;
          j = b1;
          xmlResourceParser3 = xmlResourceParser;
          k = b3;
          rw0.w();
          paramInt = 1;
        } 
      } 
    } catch (XmlPullParserException xmlPullParserException4) {
    
    } catch (IOException iOException) {
    
    } finally {}
    XmlPullParserException xmlPullParserException1 = xmlPullParserException4;
    i = paramInt;
    XmlPullParserException xmlPullParserException2 = xmlPullParserException4;
    j = paramInt;
    XmlPullParserException xmlPullParserException3 = xmlPullParserException4;
    k = paramInt;
    b((XmlPullParser)xmlPullParserException4, attributeSet, paramMenu);
    if (paramInt != 0)
      ((rw0)paramMenu).v(); 
    xmlPullParserException4.close();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */