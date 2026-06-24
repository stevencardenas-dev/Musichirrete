import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.checkbox.MaterialCheckBox;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.DbCleanActivity;
import in.krosbits.musicolet.FAQActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.PlaylistEditActivity;
import java.util.HashSet;
import java.util.Stack;

public final class a3 extends id1 {
  public final int d;
  
  public final Object e;
  
  public a3(LyricsView paramLyricsView) {
    // Byte code:
    //   0: aload_0
    //   1: bipush #10
    //   3: putfield d : I
    //   6: aload_0
    //   7: aload_1
    //   8: putfield e : Ljava/lang/Object;
    //   11: aload_0
    //   12: invokespecial <init> : ()V
    //   15: aload_1
    //   16: invokevirtual getContext : ()Landroid/content/Context;
    //   19: invokestatic I0 : (Landroid/content/Context;)Z
    //   22: istore #4
    //   24: iconst_1
    //   25: istore_3
    //   26: iload_3
    //   27: istore_2
    //   28: iload #4
    //   30: ifne -> 85
    //   33: aload_1
    //   34: invokevirtual getContext : ()Landroid/content/Context;
    //   37: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   40: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   43: astore #5
    //   45: aload #5
    //   47: getfield orientation : I
    //   50: iconst_1
    //   51: if_icmpne -> 83
    //   54: iload_3
    //   55: istore_2
    //   56: aload #5
    //   58: getfield screenHeightDp : I
    //   61: sipush #512
    //   64: if_icmplt -> 85
    //   67: aload #5
    //   69: getfield screenWidthDp : I
    //   72: sipush #300
    //   75: if_icmpge -> 83
    //   78: iload_3
    //   79: istore_2
    //   80: goto -> 85
    //   83: iconst_0
    //   84: istore_2
    //   85: aload_1
    //   86: iload_2
    //   87: putfield Q0 : Z
    //   90: return
  }
  
  public a3(Object[] paramArrayOfObject) {
    this.e = paramArrayOfObject;
  }
  
  public final int c() {
    boolean bool;
    z00 z00;
    int k = this.d;
    boolean bool2 = false;
    boolean bool5 = false;
    boolean bool1 = false;
    int i = 0;
    boolean bool4 = false;
    boolean bool3 = false;
    int j = 0;
    byte b = 0;
    Object object = this.e;
    switch (k) {
      default:
        object = ((a52)object).k0;
        i = b;
        if (object != null)
          i = object.size(); 
        return i;
      case 13:
        return ((Object[])object).length;
      case 12:
        object = object;
        if (((PlaylistEditActivity)object).e0 != null) {
          i = ((PlaylistEditActivity)object).f0.size() + 1;
        } else {
          i = ((PlaylistEditActivity)object).T.size();
        } 
        return i;
      case 11:
        return ((l21)object).l.length;
      case 10:
        object = ((LyricsView)object).N0;
        i = bool2;
        if (object != null)
          i = ((xp0)object).a.size(); 
        return i;
      case 9:
        object = ((cm0)object).f;
        i = bool5;
        if (object != null)
          i = object.size(); 
        return i;
      case 8:
        object = ((ql0)object).B0;
        i = bool1;
        if (object != null)
          i = object.size(); 
        return i;
      case 7:
        object = ((FAQActivity)object).R;
        if (object != null)
          i = object.size(); 
        return i;
      case 6:
        z00 = (z00)object;
        object = z00.u;
        i = bool4;
        if (object != null) {
          j = object.size();
          i = j;
          if (z00.w)
            i = j + 1; 
        } 
        return i;
      case 5:
        bool = MusicService.C0;
        return (MyApplication.h()).b.size();
      case 4:
        return ((Stack)((tk)object).e).size() + 1;
      case 3:
        object = ((DbCleanActivity)object).R;
        i = bool3;
        if (object != null)
          i = object.size(); 
        return i;
      case 2:
        return ((tg)object).c.size();
      case 1:
        object = ((o3)object).i;
        i = j;
        if (object != null)
          i = object.size(); 
        return i;
      case 0:
        break;
    } 
    return ((c3)object).i.size();
  }
  
  public int f(int paramInt) {
    boolean bool;
    xp0 xp0;
    o3 o3;
    int k = this.d;
    byte b1 = 5;
    int j = 6;
    byte b2 = 3;
    int i = 2;
    boolean bool2 = false;
    boolean bool1 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    Object object = this.e;
    switch (k) {
      default:
        return super.f(paramInt);
      case 12:
        object = object;
        if (((PlaylistEditActivity)object).e0 != null) {
          i = ((PlaylistEditActivity)object).g0;
          if (paramInt == i) {
            paramInt = 10;
          } else {
            object = ((PlaylistEditActivity)object).f0;
            if (paramInt >= i)
              paramInt--; 
            if (((km0)object.get(paramInt)).u == 64) {
              paramInt = j;
            } else {
              paramInt = 4;
            } 
          } 
        } else {
          if (((km0)((PlaylistEditActivity)object).T.get(paramInt)).u != 64)
            j = 4; 
          paramInt = j + ((PlaylistEditActivity)object).U.contains(Integer.valueOf(paramInt));
        } 
        return paramInt;
      case 11:
        object = object;
        paramInt = ((l21)object).l[paramInt];
        j = l21.a(paramInt);
        if (paramInt == ((l21)object).e) {
          paramInt = 1;
        } else {
          boolean bool5 = ((l21)object).f;
          if (bool5 && j <= ((l21)object).b)
            return 0; 
          paramInt = i;
          if (!bool5) {
            paramInt = i;
            if (j <= ((l21)object).c)
              return 0; 
          } 
        } 
        return paramInt;
      case 10:
        object = object;
        xp0 = ((LyricsView)object).N0;
        if (xp0 == null || TextUtils.isEmpty(xp0.b(paramInt)))
          return 3; 
        if (((LyricsView)object).S0) {
          if (((LyricsView)object).T0.contains(Integer.valueOf(paramInt))) {
            paramInt = b1;
          } else {
            paramInt = 4;
          } 
        } else {
          xp0 = ((LyricsView)object).N0;
          if (xp0.d) {
            j = ((LyricsView)object).O0.E();
            i = ((LyricsView)object).N0.a(j);
            if (paramInt != i || (i == 0 && j < ((LyricsView)object).N0.c(i)))
              return 2; 
            paramInt = 1;
          } else if (xp0.f) {
            paramInt = 6;
          } else {
            paramInt = 0;
          } 
        } 
        return paramInt;
      case 9:
        i = bool3;
        if (((cm0)object).g == paramInt)
          i = 1; 
        return i;
      case 8:
        return dd1.P(MyApplication.i.getApplicationContext(), ((ql0)object).B0.get(paramInt)) ^ true;
      case 7:
        return ((f70)((FAQActivity)object).R.get(paramInt)).a;
      case 6:
        if (!MyApplication.F.p() && ((z00)object).t == null) {
          paramInt = bool2;
        } else {
          paramInt = 1;
        } 
        return paramInt;
      case 5:
        object = object;
        bool = MusicService.C0;
        if (paramInt == (MyApplication.h()).c && (MyApplication.h()).b.get(paramInt) == ((oz)object).j) {
          i = 4;
        } else if (paramInt == (MyApplication.h()).c) {
          i = 1;
        } else {
          i = b2;
          if ((MyApplication.h()).b.get(paramInt) == ((oz)object).j)
            i = 2; 
        } 
        return i;
      case 4:
        object = object;
        if (paramInt == ((Stack)((tk)object).e).size()) {
          paramInt = 1;
        } else if (paramInt == ((tk)object).b) {
          paramInt = i;
        } else {
          paramInt = 0;
        } 
        return paramInt;
      case 1:
        o3 = (o3)object;
        object = o3.i;
        i = bool1;
        if (object != null) {
          i = bool1;
          if (object.size() > 5) {
            i = bool1;
            if (paramInt == o3.i.size() - 1)
              i = 1; 
          } 
        } 
        return i;
      case 0:
        break;
    } 
    object = object;
    j = bool4;
    if (((c3)object).c == 1)
      j = 32; 
    i = j;
    if (((c3)object).q != null) {
      HashSet hashSet = ((c3)object).s;
      if (hashSet != null) {
        i = ((c3)object).r;
        if (i == -999 || paramInt <= i) {
          if (hashSet.contains(((c3)object).i.get(paramInt))) {
            i = j | 0x3;
          } else {
            i = j | 0x2;
          } 
          return i;
        } 
      } 
      i = j | 0x1;
    } 
    return i;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_0
    //   9: getfield e : Ljava/lang/Object;
    //   12: astore #5
    //   14: iload_3
    //   15: tableswitch default -> 84, 0 -> 1863, 1 -> 1796, 2 -> 1734, 3 -> 1664, 4 -> 1563, 5 -> 1511, 6 -> 1252, 7 -> 1209, 8 -> 1140, 9 -> 1045, 10 -> 1008, 11 -> 862, 12 -> 503, 13 -> 397
    //   84: aload_1
    //   85: checkcast z42
    //   88: astore_1
    //   89: aload_1
    //   90: getfield y : Landroid/widget/ImageView;
    //   93: astore #6
    //   95: aload_1
    //   96: getfield x : Landroid/widget/TextView;
    //   99: astore #7
    //   101: aload_1
    //   102: getfield w : Landroid/widget/TextView;
    //   105: astore #8
    //   107: getstatic m92.h : [I
    //   110: astore_1
    //   111: aload #5
    //   113: checkcast a52
    //   116: astore #5
    //   118: aload #5
    //   120: getfield k0 : Ljava/util/ArrayList;
    //   123: iload_2
    //   124: invokevirtual get : (I)Ljava/lang/Object;
    //   127: checkcast v00
    //   130: astore #10
    //   132: aload #10
    //   134: instanceof ww1
    //   137: ifeq -> 198
    //   140: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   143: aload #10
    //   145: getfield b : Ld61;
    //   148: invokevirtual toString : ()Ljava/lang/String;
    //   151: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   154: getfield b : Ljava/lang/String;
    //   157: astore #5
    //   159: aload #8
    //   161: aload #5
    //   163: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   166: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   169: aload #8
    //   171: aload_1
    //   172: iconst_5
    //   173: iaload
    //   174: invokevirtual setTextColor : (I)V
    //   177: aload #7
    //   179: aload #5
    //   181: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   184: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   187: aload #6
    //   189: ldc_w 2131231144
    //   192: invokevirtual setImageResource : (I)V
    //   195: goto -> 396
    //   198: aload #10
    //   200: instanceof lw0
    //   203: ifeq -> 396
    //   206: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   209: aload #10
    //   211: getfield b : Ld61;
    //   214: invokevirtual toString : ()Ljava/lang/String;
    //   217: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   220: getfield b : Ljava/lang/String;
    //   223: astore #9
    //   225: getstatic lw0.r : Landroid/net/Uri;
    //   228: aload #10
    //   230: invokevirtual j : ()Landroid/net/Uri;
    //   233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   236: istore #4
    //   238: aload #8
    //   240: aload_1
    //   241: bipush #6
    //   243: iaload
    //   244: invokevirtual setTextColor : (I)V
    //   247: iload #4
    //   249: ifeq -> 264
    //   252: aload #5
    //   254: ldc_w 2131887277
    //   257: invokevirtual T : (I)Ljava/lang/String;
    //   260: astore_1
    //   261: goto -> 320
    //   264: aload #9
    //   266: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
    //   269: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   272: ifne -> 284
    //   275: aload #9
    //   277: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   280: astore_1
    //   281: goto -> 320
    //   284: aload #9
    //   286: ldc_w '/'
    //   289: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: astore_1
    //   293: aload_1
    //   294: aload #5
    //   296: ldc_w 2131887251
    //   299: invokevirtual T : (I)Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload_1
    //   307: invokevirtual toString : ()Ljava/lang/String;
    //   310: ldc_w '/'
    //   313: ldc_w ' › '
    //   316: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   319: astore_1
    //   320: aload #8
    //   322: aload_1
    //   323: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   326: new java/lang/StringBuilder
    //   329: dup
    //   330: invokespecial <init> : ()V
    //   333: astore_1
    //   334: aload_1
    //   335: aload #5
    //   337: ldc_w 2131886739
    //   340: invokevirtual T : (I)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload_1
    //   348: ldc_w '*  (<u>'
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload_1
    //   356: aload #5
    //   358: ldc_w 2131886718
    //   361: invokevirtual T : (I)Ljava/lang/String;
    //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: aload_1
    //   369: ldc_w '</u>)'
    //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload #7
    //   378: aload_1
    //   379: invokevirtual toString : ()Ljava/lang/String;
    //   382: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   385: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   388: aload #6
    //   390: ldc_w 2131231037
    //   393: invokevirtual setImageResource : (I)V
    //   396: return
    //   397: aload_1
    //   398: checkcast zn1
    //   401: astore #6
    //   403: aload #5
    //   405: checkcast [Ljava/lang/Object;
    //   408: iload_2
    //   409: aaload
    //   410: astore_1
    //   411: aload_1
    //   412: instanceof km0
    //   415: ifeq -> 470
    //   418: aload_1
    //   419: checkcast km0
    //   422: astore_1
    //   423: new java/lang/StringBuilder
    //   426: dup
    //   427: invokespecial <init> : ()V
    //   430: astore #5
    //   432: aload #5
    //   434: aload_1
    //   435: getfield h : Ljava/lang/String;
    //   438: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: aload #5
    //   444: ldc_w '/'
    //   447: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: aload #5
    //   453: aload_1
    //   454: getfield g : Ljava/lang/String;
    //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: aload #5
    //   463: invokevirtual toString : ()Ljava/lang/String;
    //   466: astore_1
    //   467: goto -> 481
    //   470: aload_1
    //   471: checkcast v00
    //   474: getfield b : Ld61;
    //   477: invokevirtual toString : ()Ljava/lang/String;
    //   480: astore_1
    //   481: aload #6
    //   483: getfield w : Landroid/widget/TextView;
    //   486: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   489: aload_1
    //   490: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   493: getfield b : Ljava/lang/String;
    //   496: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   499: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   502: return
    //   503: aload_1
    //   504: checkcast e81
    //   507: astore #6
    //   509: aload #6
    //   511: getfield B : Lin/krosbits/android/widgets/SmartTextView;
    //   514: astore #7
    //   516: aload #6
    //   518: getfield y : Lin/krosbits/android/widgets/SmartTextView;
    //   521: astore #8
    //   523: aload #5
    //   525: checkcast in/krosbits/musicolet/PlaylistEditActivity
    //   528: astore #5
    //   530: aload #5
    //   532: getfield e0 : Ljava/util/ArrayList;
    //   535: astore_1
    //   536: aload_1
    //   537: ifnull -> 636
    //   540: iload_2
    //   541: aload #5
    //   543: getfield g0 : I
    //   546: if_icmpne -> 636
    //   549: aload #8
    //   551: aload #5
    //   553: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   556: ldc_w 2131755061
    //   559: aload #5
    //   561: getfield e0 : Ljava/util/ArrayList;
    //   564: invokevirtual size : ()I
    //   567: iconst_1
    //   568: anewarray java/lang/Object
    //   571: dup
    //   572: iconst_0
    //   573: aload #5
    //   575: getfield e0 : Ljava/util/ArrayList;
    //   578: invokevirtual size : ()I
    //   581: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   584: aastore
    //   585: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   588: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   591: aload #7
    //   593: aload #5
    //   595: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   598: ldc_w 2131755020
    //   601: aload #5
    //   603: getfield e0 : Ljava/util/ArrayList;
    //   606: invokevirtual size : ()I
    //   609: iconst_1
    //   610: anewarray java/lang/Object
    //   613: dup
    //   614: iconst_0
    //   615: aload #5
    //   617: getfield e0 : Ljava/util/ArrayList;
    //   620: invokevirtual size : ()I
    //   623: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   626: aastore
    //   627: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   630: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   633: goto -> 861
    //   636: aload_1
    //   637: ifnull -> 673
    //   640: iload_2
    //   641: istore_3
    //   642: iload_2
    //   643: aload #5
    //   645: getfield g0 : I
    //   648: if_icmple -> 655
    //   651: iload_2
    //   652: iconst_1
    //   653: isub
    //   654: istore_3
    //   655: aload #5
    //   657: getfield f0 : Ljava/util/ArrayList;
    //   660: iload_3
    //   661: invokevirtual get : (I)Ljava/lang/Object;
    //   664: checkcast km0
    //   667: astore_1
    //   668: iload_3
    //   669: istore_2
    //   670: goto -> 686
    //   673: aload #5
    //   675: getfield T : Ljava/util/ArrayList;
    //   678: iload_2
    //   679: invokevirtual get : (I)Ljava/lang/Object;
    //   682: checkcast km0
    //   685: astore_1
    //   686: aload #6
    //   688: getfield x : Landroid/widget/ImageView;
    //   691: astore #9
    //   693: aload_1
    //   694: getfield c : Lqn1;
    //   697: astore #10
    //   699: aload #8
    //   701: aload #10
    //   703: getfield b : Ljava/lang/String;
    //   706: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   709: aload #7
    //   711: aload #10
    //   713: getfield e : Ljava/lang/String;
    //   716: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   719: aload #6
    //   721: getfield z : Lin/krosbits/android/widgets/SmartTextView;
    //   724: aload #10
    //   726: getfield c : Ljava/lang/String;
    //   729: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   732: aload #6
    //   734: getfield A : Lin/krosbits/android/widgets/SmartTextView;
    //   737: aload #10
    //   739: getfield g : I
    //   742: i2l
    //   743: iconst_0
    //   744: iconst_0
    //   745: invokestatic B : (JZI)Ljava/lang/String;
    //   748: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   751: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   754: aload_1
    //   755: invokestatic l : (Lkm0;)Landroid/net/Uri;
    //   758: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   761: astore_1
    //   762: aload_1
    //   763: iconst_1
    //   764: putfield d : Z
    //   767: aload_1
    //   768: invokevirtual a : ()V
    //   771: aload_1
    //   772: iconst_1
    //   773: putfield c : Z
    //   776: aload_1
    //   777: invokevirtual k : ()V
    //   780: aload_1
    //   781: aload #6
    //   783: getfield w : Landroid/widget/ImageView;
    //   786: invokevirtual f : (Landroid/widget/ImageView;)V
    //   789: aload #5
    //   791: getfield m0 : Z
    //   794: ifne -> 821
    //   797: aload #5
    //   799: getfield U : Ljava/util/HashSet;
    //   802: invokevirtual size : ()I
    //   805: ifle -> 811
    //   808: goto -> 821
    //   811: aload #9
    //   813: bipush #8
    //   815: invokevirtual setVisibility : (I)V
    //   818: goto -> 861
    //   821: aload #9
    //   823: iconst_0
    //   824: invokevirtual setVisibility : (I)V
    //   827: aload #5
    //   829: getfield U : Ljava/util/HashSet;
    //   832: iload_2
    //   833: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   836: invokevirtual contains : (Ljava/lang/Object;)Z
    //   839: ifeq -> 853
    //   842: aload #9
    //   844: ldc_w 2131230845
    //   847: invokevirtual setImageResource : (I)V
    //   850: goto -> 861
    //   853: aload #9
    //   855: ldc_w 2131230844
    //   858: invokevirtual setImageResource : (I)V
    //   861: return
    //   862: aload_1
    //   863: checkcast k21
    //   866: astore_1
    //   867: aload #5
    //   869: checkcast l21
    //   872: getfield l : [I
    //   875: iload_2
    //   876: iaload
    //   877: istore_2
    //   878: aload_1
    //   879: getfield w : Landroid/view/ViewGroup;
    //   882: sipush #256
    //   885: iload_2
    //   886: invokestatic c : (Landroid/view/View;II)V
    //   889: aload_1
    //   890: getfield x : Landroid/view/View;
    //   893: iconst_1
    //   894: iload_2
    //   895: invokestatic c : (Landroid/view/View;II)V
    //   898: aload_1
    //   899: getfield y : Landroid/view/View;
    //   902: iconst_2
    //   903: iload_2
    //   904: invokestatic c : (Landroid/view/View;II)V
    //   907: aload_1
    //   908: getfield z : Landroid/view/View;
    //   911: iconst_4
    //   912: iload_2
    //   913: invokestatic c : (Landroid/view/View;II)V
    //   916: aload_1
    //   917: getfield A : Landroid/view/View;
    //   920: astore #6
    //   922: aload #6
    //   924: bipush #8
    //   926: iload_2
    //   927: invokestatic c : (Landroid/view/View;II)V
    //   930: aload_1
    //   931: getfield B : Landroid/view/View;
    //   934: bipush #16
    //   936: iload_2
    //   937: invokestatic c : (Landroid/view/View;II)V
    //   940: aload_1
    //   941: getfield C : Landroid/view/View;
    //   944: astore #5
    //   946: aload #5
    //   948: bipush #32
    //   950: iload_2
    //   951: invokestatic c : (Landroid/view/View;II)V
    //   954: aload_1
    //   955: getfield D : Landroid/view/View;
    //   958: bipush #64
    //   960: iload_2
    //   961: invokestatic c : (Landroid/view/View;II)V
    //   964: aload_1
    //   965: getfield E : Landroid/view/View;
    //   968: sipush #128
    //   971: iload_2
    //   972: invokestatic c : (Landroid/view/View;II)V
    //   975: aload_1
    //   976: getfield F : Landroid/view/View;
    //   979: sipush #512
    //   982: iload_2
    //   983: invokestatic c : (Landroid/view/View;II)V
    //   986: iload_2
    //   987: sipush #511
    //   990: if_icmpne -> 1007
    //   993: aload #5
    //   995: bipush #8
    //   997: invokevirtual setVisibility : (I)V
    //   1000: aload #6
    //   1002: bipush #8
    //   1004: invokevirtual setVisibility : (I)V
    //   1007: return
    //   1008: aload_1
    //   1009: checkcast pq0
    //   1012: astore_1
    //   1013: aload #5
    //   1015: checkcast in/krosbits/android/widgets/LyricsView
    //   1018: getfield N0 : Lxp0;
    //   1021: astore #5
    //   1023: aload #5
    //   1025: ifnonnull -> 1031
    //   1028: goto -> 1044
    //   1031: aload_1
    //   1032: getfield w : Landroid/widget/TextView;
    //   1035: aload #5
    //   1037: iload_2
    //   1038: invokevirtual b : (I)Ljava/lang/String;
    //   1041: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1044: return
    //   1045: aload_1
    //   1046: checkcast bm0
    //   1049: astore_1
    //   1050: aload #5
    //   1052: checkcast cm0
    //   1055: getfield f : Ljava/util/ArrayList;
    //   1058: iload_2
    //   1059: invokevirtual get : (I)Ljava/lang/Object;
    //   1062: checkcast km0
    //   1065: astore #6
    //   1067: aload_1
    //   1068: getfield x : Landroid/widget/TextView;
    //   1071: aload #6
    //   1073: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   1076: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1079: aload_1
    //   1080: getfield y : Landroid/widget/TextView;
    //   1083: astore #5
    //   1085: aload #6
    //   1087: getfield c : Lqn1;
    //   1090: astore #6
    //   1092: aload #5
    //   1094: aload #6
    //   1096: getfield e : Ljava/lang/String;
    //   1099: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1102: aload_1
    //   1103: getfield z : Landroid/widget/TextView;
    //   1106: aload #6
    //   1108: getfield g : I
    //   1111: i2l
    //   1112: iconst_0
    //   1113: iconst_0
    //   1114: invokestatic B : (JZI)Ljava/lang/String;
    //   1117: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1120: aload_1
    //   1121: getfield w : Landroid/widget/TextView;
    //   1124: astore_1
    //   1125: aload_1
    //   1126: ifnull -> 1139
    //   1129: aload_1
    //   1130: iload_2
    //   1131: iconst_1
    //   1132: iadd
    //   1133: invokestatic valueOf : (I)Ljava/lang/String;
    //   1136: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1139: return
    //   1140: aload_1
    //   1141: checkcast pl0
    //   1144: astore #6
    //   1146: aload #5
    //   1148: checkcast ql0
    //   1151: getfield B0 : Ljava/util/ArrayList;
    //   1154: iload_2
    //   1155: invokevirtual get : (I)Ljava/lang/Object;
    //   1158: checkcast java/util/Locale
    //   1161: astore_1
    //   1162: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   1165: astore #5
    //   1167: aload #5
    //   1169: invokevirtual getLanguage : ()Ljava/lang/String;
    //   1172: aload_1
    //   1173: invokevirtual getLanguage : ()Ljava/lang/String;
    //   1176: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1179: ifeq -> 1193
    //   1182: aload #5
    //   1184: aload #5
    //   1186: invokevirtual getDisplayLanguage : (Ljava/util/Locale;)Ljava/lang/String;
    //   1189: astore_1
    //   1190: goto -> 1199
    //   1193: aload_1
    //   1194: aload_1
    //   1195: invokevirtual getDisplayName : (Ljava/util/Locale;)Ljava/lang/String;
    //   1198: astore_1
    //   1199: aload #6
    //   1201: getfield w : Lin/krosbits/android/widgets/SmartTextView;
    //   1204: aload_1
    //   1205: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1208: return
    //   1209: aload_1
    //   1210: checkcast g70
    //   1213: getfield w : Landroid/widget/TextView;
    //   1216: astore_1
    //   1217: aload #5
    //   1219: checkcast in/krosbits/musicolet/FAQActivity
    //   1222: astore #5
    //   1224: aload_1
    //   1225: aload #5
    //   1227: aload #5
    //   1229: getfield R : Ljava/util/ArrayList;
    //   1232: iload_2
    //   1233: invokevirtual get : (I)Ljava/lang/Object;
    //   1236: checkcast f70
    //   1239: getfield b : I
    //   1242: invokevirtual getString : (I)Ljava/lang/String;
    //   1245: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1248: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1251: return
    //   1252: aload_1
    //   1253: checkcast x00
    //   1256: astore #7
    //   1258: aload #7
    //   1260: getfield x : Landroid/widget/TextView;
    //   1263: astore #6
    //   1265: aload #7
    //   1267: getfield w : Landroid/widget/ImageView;
    //   1270: astore #8
    //   1272: aload #5
    //   1274: checkcast z00
    //   1277: astore #5
    //   1279: iload_2
    //   1280: istore_3
    //   1281: aload #5
    //   1283: getfield w : Z
    //   1286: ifeq -> 1293
    //   1289: iload_2
    //   1290: iconst_1
    //   1291: isub
    //   1292: istore_3
    //   1293: iload_3
    //   1294: iflt -> 1494
    //   1297: aload #5
    //   1299: getfield u : Ljava/util/List;
    //   1302: iload_3
    //   1303: invokeinterface get : (I)Ljava/lang/Object;
    //   1308: checkcast v00
    //   1311: astore_1
    //   1312: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1315: aload_1
    //   1316: getfield b : Ld61;
    //   1319: invokevirtual toString : ()Ljava/lang/String;
    //   1322: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   1325: getfield b : Ljava/lang/String;
    //   1328: astore #11
    //   1330: aload #11
    //   1332: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   1335: astore #10
    //   1337: aload_1
    //   1338: invokevirtual k : ()Z
    //   1341: ifne -> 1373
    //   1344: aload #5
    //   1346: getfield t : Lv00;
    //   1349: ifnonnull -> 1362
    //   1352: aload_1
    //   1353: invokevirtual a : ()Z
    //   1356: ifne -> 1362
    //   1359: goto -> 1373
    //   1362: aload #8
    //   1364: ldc_w 2131231187
    //   1367: invokevirtual setImageResource : (I)V
    //   1370: goto -> 1445
    //   1373: aload #5
    //   1375: getfield t : Lv00;
    //   1378: ifnonnull -> 1437
    //   1381: aload_1
    //   1382: getfield b : Ld61;
    //   1385: invokevirtual toString : ()Ljava/lang/String;
    //   1388: ldc_w 'Storage'
    //   1391: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1394: ifeq -> 1437
    //   1397: aload_1
    //   1398: invokevirtual w : ()Ljava/lang/String;
    //   1401: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1404: ifeq -> 1437
    //   1407: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1410: aload_1
    //   1411: invokevirtual y : ()Ljava/lang/String;
    //   1414: invokevirtual b : (Ljava/lang/String;)Lxp1;
    //   1417: astore #9
    //   1419: aload #9
    //   1421: ifnull -> 1437
    //   1424: aload #8
    //   1426: aload #9
    //   1428: invokevirtual e : ()I
    //   1431: invokevirtual setImageResource : (I)V
    //   1434: goto -> 1445
    //   1437: aload #8
    //   1439: ldc_w 2131231146
    //   1442: invokevirtual setImageResource : (I)V
    //   1445: aload #6
    //   1447: aload #10
    //   1449: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1452: aload #7
    //   1454: getfield y : Landroid/widget/TextView;
    //   1457: aload #11
    //   1459: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   1462: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1465: aload #7
    //   1467: getfield b : Landroid/view/View;
    //   1470: astore #6
    //   1472: aload #5
    //   1474: getfield y : Lv00;
    //   1477: aload_1
    //   1478: if_acmpne -> 1484
    //   1481: iconst_1
    //   1482: istore #4
    //   1484: aload #6
    //   1486: iload #4
    //   1488: invokevirtual setSelected : (Z)V
    //   1491: goto -> 1510
    //   1494: aload #8
    //   1496: ldc_w 2131231120
    //   1499: invokevirtual setImageResource : (I)V
    //   1502: aload #6
    //   1504: ldc_w 2131886980
    //   1507: invokevirtual setText : (I)V
    //   1510: return
    //   1511: aload_1
    //   1512: checkcast nz
    //   1515: astore #5
    //   1517: aload #5
    //   1519: getfield x : Landroid/widget/TextView;
    //   1522: astore_1
    //   1523: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1526: istore #4
    //   1528: aload_1
    //   1529: invokestatic h : ()Lwk1;
    //   1532: getfield b : Ljava/util/Stack;
    //   1535: iload_2
    //   1536: invokevirtual get : (I)Ljava/lang/Object;
    //   1539: checkcast xn1
    //   1542: getfield h : Ljava/lang/String;
    //   1545: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1548: aload #5
    //   1550: getfield w : Landroid/widget/TextView;
    //   1553: iload_2
    //   1554: iconst_1
    //   1555: iadd
    //   1556: invokestatic valueOf : (I)Ljava/lang/String;
    //   1559: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1562: return
    //   1563: aload_1
    //   1564: checkcast az
    //   1567: astore #6
    //   1569: aload #5
    //   1571: checkcast tk
    //   1574: getfield e : Ljava/lang/Object;
    //   1577: checkcast java/util/Stack
    //   1580: astore_1
    //   1581: aload_1
    //   1582: invokevirtual size : ()I
    //   1585: istore_3
    //   1586: aload #6
    //   1588: getfield w : Landroid/widget/TextView;
    //   1591: astore #5
    //   1593: iload_2
    //   1594: iload_3
    //   1595: if_icmpne -> 1609
    //   1598: aload #5
    //   1600: ldc_w 2131886982
    //   1603: invokevirtual setText : (I)V
    //   1606: goto -> 1663
    //   1609: new java/lang/StringBuilder
    //   1612: dup
    //   1613: invokespecial <init> : ()V
    //   1616: astore #6
    //   1618: aload #6
    //   1620: iload_2
    //   1621: iconst_1
    //   1622: iadd
    //   1623: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1626: pop
    //   1627: aload #6
    //   1629: ldc_w '. '
    //   1632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1635: pop
    //   1636: aload #6
    //   1638: aload_1
    //   1639: iload_2
    //   1640: invokevirtual get : (I)Ljava/lang/Object;
    //   1643: checkcast xn1
    //   1646: getfield h : Ljava/lang/String;
    //   1649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1652: pop
    //   1653: aload #5
    //   1655: aload #6
    //   1657: invokevirtual toString : ()Ljava/lang/String;
    //   1660: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1663: return
    //   1664: aload_1
    //   1665: checkcast ov
    //   1668: astore #6
    //   1670: aload #5
    //   1672: checkcast in/krosbits/musicolet/DbCleanActivity
    //   1675: astore_1
    //   1676: aload_1
    //   1677: getfield R : Ljava/util/ArrayList;
    //   1680: iload_2
    //   1681: invokevirtual get : (I)Ljava/lang/Object;
    //   1684: checkcast km0
    //   1687: getfield h : Ljava/lang/String;
    //   1690: astore #5
    //   1692: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1695: aload #5
    //   1697: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   1700: astore #5
    //   1702: aload #6
    //   1704: getfield w : Landroidx/appcompat/widget/AppCompatCheckBox;
    //   1707: astore #6
    //   1709: aload #6
    //   1711: aload #5
    //   1713: getfield b : Ljava/lang/String;
    //   1716: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   1719: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1722: aload #6
    //   1724: aload_1
    //   1725: getfield S : [Z
    //   1728: iload_2
    //   1729: baload
    //   1730: invokevirtual setChecked : (Z)V
    //   1733: return
    //   1734: aload_1
    //   1735: checkcast sg
    //   1738: astore_1
    //   1739: aload #5
    //   1741: checkcast tg
    //   1744: astore #5
    //   1746: aload #5
    //   1748: getfield c : Ljava/util/ArrayList;
    //   1751: iload_2
    //   1752: invokevirtual get : (I)Ljava/lang/Object;
    //   1755: checkcast yf
    //   1758: astore #5
    //   1760: aload_1
    //   1761: getfield w : Landroid/widget/TextView;
    //   1764: aload #5
    //   1766: getfield b : J
    //   1769: invokestatic n : (J)Ljava/lang/String;
    //   1772: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1775: aload_1
    //   1776: getfield x : Landroid/widget/TextView;
    //   1779: aload #5
    //   1781: getfield c : Ljava/lang/String;
    //   1784: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1787: goto -> 1795
    //   1790: astore_1
    //   1791: aload_1
    //   1792: invokevirtual printStackTrace : ()V
    //   1795: return
    //   1796: aload_1
    //   1797: checkcast n3
    //   1800: astore_1
    //   1801: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   1804: aload #5
    //   1806: checkcast o3
    //   1809: getfield i : Ljava/util/ArrayList;
    //   1812: iload_2
    //   1813: invokevirtual get : (I)Ljava/lang/Object;
    //   1816: checkcast android/net/Uri
    //   1819: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   1822: astore #5
    //   1824: aload #5
    //   1826: iconst_1
    //   1827: putfield d : Z
    //   1830: aload #5
    //   1832: invokevirtual a : ()V
    //   1835: aload #5
    //   1837: iconst_1
    //   1838: putfield c : Z
    //   1841: aload #5
    //   1843: iconst_1
    //   1844: newarray int
    //   1846: dup
    //   1847: iconst_0
    //   1848: iconst_2
    //   1849: iastore
    //   1850: invokevirtual g : ([I)V
    //   1853: aload #5
    //   1855: aload_1
    //   1856: getfield w : Landroid/widget/ImageView;
    //   1859: invokevirtual f : (Landroid/widget/ImageView;)V
    //   1862: return
    //   1863: aload_1
    //   1864: checkcast b3
    //   1867: astore_1
    //   1868: aload #5
    //   1870: checkcast c3
    //   1873: astore #6
    //   1875: aload #6
    //   1877: getfield i : Ljava/util/ArrayList;
    //   1880: iload_2
    //   1881: invokevirtual get : (I)Ljava/lang/Object;
    //   1884: checkcast java/lang/String
    //   1887: astore #5
    //   1889: aload_1
    //   1890: getfield w : Lcom/google/android/material/checkbox/MaterialCheckBox;
    //   1893: astore_1
    //   1894: aload_1
    //   1895: aload #5
    //   1897: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1900: aload_1
    //   1901: aload #6
    //   1903: getfield j : Ljava/util/HashSet;
    //   1906: aload #5
    //   1908: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1911: invokevirtual setChecked : (Z)V
    //   1914: return
    // Exception table:
    //   from	to	target	type
    //   1746	1787	1790	finally
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    View view2;
    e81 e81;
    pq0 pq0;
    bm0 bm0;
    SmartTextView smartTextView;
    View view1;
    int[] arrayOfInt;
    AppCompatCheckBox appCompatCheckBox;
    LyricsView lyricsView;
    LayoutInflater layoutInflater;
    ql0 ql0;
    View view3;
    oz oz;
    Context context1;
    SmartImageView smartImageView;
    o3 o3;
    TextView textView;
    Context context2;
    LinearLayout linearLayout;
    LinearLayout.LayoutParams layoutParams1;
    LinearLayout.LayoutParams layoutParams2;
    int i = this.d;
    PlaylistEditActivity playlistEditActivity = null;
    boolean bool = true;
    Object object = this.e;
    switch (i) {
      default:
        view2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493053, paramViewGroup, false);
        return new z42((a52)object, view2);
      case 13:
        return new zn1(LayoutInflater.from(view2.getContext()).inflate(2131493101, (ViewGroup)view2, false));
      case 12:
        playlistEditActivity = (PlaylistEditActivity)object;
        if (paramInt == 10) {
          e81 = new e81(playlistEditActivity, playlistEditActivity.b0.inflate(2131493027, (ViewGroup)view2, false), 10);
        } else {
          e81 = new e81(playlistEditActivity, playlistEditActivity.b0.inflate(2131493028, (ViewGroup)e81, false), paramInt);
        } 
        return e81;
      case 11:
        return new k21((l21)object, LayoutInflater.from(e81.getContext()).inflate(2131493068, (ViewGroup)e81, false), paramInt);
      case 10:
        lyricsView = (LyricsView)object;
        if (paramInt == 5) {
          SmartTextView smartTextView1 = new SmartTextView(e81.getContext());
          pq0 = new pq0(lyricsView, (TextView)smartTextView1);
          object = smartTextView1.getContext().getResources().getDrawable(2131230992);
          smartTextView1.b = true;
          smartTextView1.setCompoundDrawableColorIndex(5);
          smartTextView1.setTextTintIndex(5);
          paramInt = (int)(smartTextView1.getContext().getResources().getDimension(2131165390) * 24.0F);
          object.setBounds(0, 0, paramInt, paramInt);
          smartTextView1.setCompoundDrawablesRelative((Drawable)object, null, null, null);
          pq0.w.setBackgroundColor(lyricsView.b1);
        } else {
          Drawable drawable;
          if (paramInt == 4) {
            object = new SmartTextView(pq0.getContext());
            pq0 = new pq0(lyricsView, (TextView)object);
            drawable = object.getContext().getResources().getDrawable(2131231091);
            ((SmartTextView)object).b = true;
            object.setCompoundDrawableColorIndex(5);
            object.setTextTintIndex(6);
            paramInt = (int)(object.getContext().getResources().getDimension(2131165390) * 24.0F);
            drawable.setBounds(0, 0, paramInt, paramInt);
            object.setCompoundDrawablesRelative(drawable, null, null, null);
          } else {
            object = new TextView(pq0.getContext());
            if (paramInt == 3) {
              pq0 = new pq0((LyricsView)drawable, (TextView)object);
            } else if (paramInt == 1) {
              pq0 = new nq0((LyricsView)drawable, (TextView)object, 0);
            } else if (paramInt == 2) {
              pq0 = new nq0((LyricsView)drawable, (TextView)object, 1);
            } else if (paramInt == 6) {
              pq0 = new pq0((LyricsView)drawable, (TextView)object);
              object.setTextColor(((LyricsView)drawable).c1);
            } else {
              pq0 = new pq0((LyricsView)drawable, (TextView)object);
            } 
          } 
        } 
        return pq0;
      case 9:
        object = object;
        layoutInflater = ((cm0)object).h;
        if (paramInt == 1) {
          bm0 = new bm0((cm0)object, layoutInflater.inflate(2131493202, (ViewGroup)pq0, false), paramInt);
        } else {
          bm0 = new bm0((cm0)object, layoutInflater.inflate(2131493201, (ViewGroup)bm0, false), paramInt);
        } 
        return bm0;
      case 8:
        ql0 = (ql0)object;
        smartTextView = new SmartTextView(bm0.getContext());
        if (paramInt != 0)
          bool = false; 
        return new pl0(ql0, smartTextView, bool);
      case 7:
        object = object;
        if (paramInt == 1) {
          view3 = ((FAQActivity)object).S.inflate(2131493185, (ViewGroup)smartTextView, false);
        } else if (paramInt == 0) {
          view3 = ((FAQActivity)object).S.inflate(17367043, (ViewGroup)smartTextView, false);
        } 
        return new g70((FAQActivity)object, view3, paramInt);
      case 6:
        view1 = LayoutInflater.from(smartTextView.getContext()).inflate(2131493053, (ViewGroup)smartTextView, false);
        return new x00((z00)object, view1, paramInt);
      case 5:
        oz = (oz)object;
        return new nz(oz, oz.f.inflate(2131493026, (ViewGroup)view1, false), paramInt);
      case 4:
        arrayOfInt = m92.h;
        object = object;
        context1 = (Context)((tk)object).c;
        textView = new TextView(context1);
        if (paramInt == 1) {
          Drawable drawable = context1.getResources().getDrawable(2131231072).mutate();
          drawable.setColorFilter(arrayOfInt[5], PorterDuff.Mode.SRC_ATOP);
          paramInt = (int)context1.getResources().getDimension(2131165392) * 3;
          drawable.setBounds(0, 0, paramInt, paramInt);
          textView.setCompoundDrawables(drawable, null, null, null);
        } else if (paramInt == 2) {
          Drawable drawable = context1.getResources().getDrawable(2131231063);
          paramInt = (int)context1.getResources().getDimension(2131165392) * 3;
          drawable.setBounds(0, 0, paramInt, paramInt);
          ag0.C0(arrayOfInt[3], drawable);
          textView.setCompoundDrawables(drawable, null, null, null);
          textView.setCompoundDrawablePadding(paramInt / 3);
        } 
        return new az((tk)object, textView);
      case 3:
        context2 = arrayOfInt.getContext();
        appCompatCheckBox = new AppCompatCheckBox(context2);
        smartImageView = new SmartImageView(context2);
        smartImageView.setImageResource(2131231186);
        smartImageView.setColorTintIndex(6);
        object = object;
        paramInt = ((DbCleanActivity)object).g0;
        smartImageView.setPadding(paramInt, paramInt, paramInt, paramInt);
        smartImageView.setBackground(m92.z((Context)object, 2130969899));
        linearLayout = new LinearLayout(context2);
        paramInt = ((DbCleanActivity)object).e0;
        linearLayout.setPadding(paramInt, 0, 0, paramInt);
        layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0F;
        paramInt = ((DbCleanActivity)object).f0 * 2;
        layoutParams1 = new LinearLayout.LayoutParams(paramInt, paramInt);
        linearLayout.setGravity(16);
        linearLayout.addView((View)appCompatCheckBox, (ViewGroup.LayoutParams)layoutParams2);
        linearLayout.addView((View)smartImageView, (ViewGroup.LayoutParams)layoutParams1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new sd1(-1, -2));
        return new ov((DbCleanActivity)object, linearLayout, appCompatCheckBox, smartImageView);
      case 2:
        return new sg((tg)object, LayoutInflater.from(appCompatCheckBox.getContext()).inflate(2131493049, (ViewGroup)appCompatCheckBox, false));
      case 1:
        o3 = (o3)object;
        return new n3(o3, o3.c.inflate(2131493063, (ViewGroup)appCompatCheckBox, false), paramInt);
      case 0:
        break;
    } 
    MaterialCheckBox materialCheckBox = new MaterialCheckBox(appCompatCheckBox.getContext());
    materialCheckBox.setLayoutParams((ViewGroup.LayoutParams)new sd1(-1, -2));
    return new b3((c3)object, materialCheckBox, paramInt);
  }
  
  public void k(he1 paramhe1) {
    ImageView imageView;
    switch (this.d) {
      default:
        return;
      case 12:
        imageView = ((e81)paramhe1).w;
        if (imageView != null)
          MyApplication.v.a(imageView); 
        return;
      case 1:
        break;
    } 
    n3 n3 = (n3)imageView;
    MyApplication.v.a(n3.w);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */