import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class mb1 extends id1 {
  public xn1 d;
  
  public LayoutInflater e;
  
  public boolean f;
  
  public lb1 g;
  
  public boolean h;
  
  public boolean i;
  
  public ArrayList j;
  
  public ArrayList k;
  
  public int l;
  
  public boolean m;
  
  public int n;
  
  public int o;
  
  public boolean p;
  
  public ArrayList q;
  
  public final int c() {
    return (this.j != null) ? (this.k.size() + 1) : this.d.b.size();
  }
  
  public final int f(int paramInt) {
    ArrayList arrayList = this.j;
    byte b1 = 6;
    byte b2 = 4;
    if (arrayList != null) {
      int j = this.l;
      if (paramInt == j)
        return 10; 
      if (paramInt >= j)
        paramInt--; 
      if (this.o == paramInt) {
        j = 1;
      } else {
        j = 0;
      } 
      if (this.f) {
        paramInt = b2;
        if (j != 0)
          paramInt = 0; 
      } else {
        paramInt = b1;
        if (j != 0)
          paramInt = 2; 
      } 
      return this.i ? (paramInt | 0x10) : paramInt;
    } 
    boolean bool = this.f;
    xn1 xn11 = this.d;
    if (bool) {
      if (xn11.e(MusicService.C0) == paramInt) {
        b1 = 0;
      } else {
        b1 = 4;
      } 
    } else if (xn11.e(MusicService.C0) == paramInt) {
      b1 = 2;
    } 
    int i = b1;
    if (my0.e((this.d.h(paramInt, MusicService.C0)).b))
      i = b1 + 1; 
    return this.i ? (i | 0x10) : i;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast nb1
    //   4: astore_1
    //   5: aload_1
    //   6: getfield B : Lin/krosbits/android/widgets/SmartTextView;
    //   9: astore #5
    //   11: aload_1
    //   12: getfield z : Lin/krosbits/android/widgets/SmartTextView;
    //   15: astore #4
    //   17: aload_0
    //   18: getfield j : Ljava/util/ArrayList;
    //   21: astore_3
    //   22: aload_3
    //   23: ifnull -> 121
    //   26: iload_2
    //   27: aload_0
    //   28: getfield l : I
    //   31: if_icmpne -> 121
    //   34: aload #4
    //   36: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   39: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   42: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   45: ldc 2131755061
    //   47: aload_0
    //   48: getfield j : Ljava/util/ArrayList;
    //   51: invokevirtual size : ()I
    //   54: iconst_1
    //   55: anewarray java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_0
    //   61: getfield j : Ljava/util/ArrayList;
    //   64: invokevirtual size : ()I
    //   67: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   70: aastore
    //   71: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   74: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   77: aload #5
    //   79: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   82: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   85: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   88: ldc 2131755020
    //   90: aload_0
    //   91: getfield j : Ljava/util/ArrayList;
    //   94: invokevirtual size : ()I
    //   97: iconst_1
    //   98: anewarray java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: aload_0
    //   104: getfield j : Ljava/util/ArrayList;
    //   107: invokevirtual size : ()I
    //   110: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   113: aastore
    //   114: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   120: return
    //   121: aload_3
    //   122: ifnull -> 193
    //   125: iload_2
    //   126: aload_0
    //   127: getfield l : I
    //   130: if_icmpge -> 136
    //   133: goto -> 139
    //   136: iinc #2, -1
    //   139: aload_0
    //   140: getfield k : Ljava/util/ArrayList;
    //   143: iload_2
    //   144: invokevirtual get : (I)Ljava/lang/Object;
    //   147: astore_3
    //   148: aload_3
    //   149: instanceof km0
    //   152: ifeq -> 166
    //   155: aload_1
    //   156: aload_3
    //   157: checkcast km0
    //   160: putfield y : Lkm0;
    //   163: goto -> 208
    //   166: aload_1
    //   167: aload_0
    //   168: getfield d : Lxn1;
    //   171: getfield b : Ljava/util/ArrayList;
    //   174: aload_3
    //   175: checkcast java/lang/Integer
    //   178: invokevirtual intValue : ()I
    //   181: invokevirtual get : (I)Ljava/lang/Object;
    //   184: checkcast km0
    //   187: putfield y : Lkm0;
    //   190: goto -> 208
    //   193: aload_1
    //   194: aload_0
    //   195: getfield d : Lxn1;
    //   198: iload_2
    //   199: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   202: invokevirtual h : (IZ)Lkm0;
    //   205: putfield y : Lkm0;
    //   208: aload_1
    //   209: getfield E : Landroid/widget/ImageView;
    //   212: astore_3
    //   213: aload #4
    //   215: aload_1
    //   216: getfield y : Lkm0;
    //   219: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   222: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   225: aload_1
    //   226: getfield A : Lin/krosbits/android/widgets/SmartTextView;
    //   229: aload_1
    //   230: getfield y : Lkm0;
    //   233: getfield c : Lqn1;
    //   236: getfield c : Ljava/lang/String;
    //   239: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   242: aload #5
    //   244: aload_1
    //   245: getfield y : Lkm0;
    //   248: getfield c : Lqn1;
    //   251: getfield e : Ljava/lang/String;
    //   254: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   257: aload_1
    //   258: getfield C : Lin/krosbits/android/widgets/SmartTextView;
    //   261: aload_1
    //   262: getfield y : Lkm0;
    //   265: getfield c : Lqn1;
    //   268: getfield g : I
    //   271: i2l
    //   272: iconst_0
    //   273: iconst_0
    //   274: invokestatic B : (JZI)Ljava/lang/String;
    //   277: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   280: aload_0
    //   281: getfield i : Z
    //   284: ifeq -> 337
    //   287: aload_1
    //   288: getfield y : Lkm0;
    //   291: invokestatic l : (Lkm0;)Landroid/net/Uri;
    //   294: astore #4
    //   296: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   299: aload #4
    //   301: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   304: astore #4
    //   306: aload #4
    //   308: iconst_1
    //   309: putfield d : Z
    //   312: aload #4
    //   314: invokevirtual a : ()V
    //   317: aload #4
    //   319: iconst_1
    //   320: putfield c : Z
    //   323: aload #4
    //   325: invokevirtual k : ()V
    //   328: aload #4
    //   330: aload_1
    //   331: getfield D : Landroid/widget/ImageView;
    //   334: invokevirtual f : (Landroid/widget/ImageView;)V
    //   337: aload_0
    //   338: getfield i : Z
    //   341: ifeq -> 382
    //   344: invokestatic d : ()Z
    //   347: ifeq -> 382
    //   350: aload_3
    //   351: iconst_0
    //   352: invokevirtual setVisibility : (I)V
    //   355: aload_1
    //   356: getfield y : Lkm0;
    //   359: getfield b : I
    //   362: invokestatic e : (I)Z
    //   365: ifeq -> 375
    //   368: aload_3
    //   369: ldc 2131230845
    //   371: invokevirtual setImageResource : (I)V
    //   374: return
    //   375: aload_3
    //   376: ldc 2131230844
    //   378: invokevirtual setImageResource : (I)V
    //   381: return
    //   382: aload_3
    //   383: bipush #8
    //   385: invokevirtual setVisibility : (I)V
    //   388: return
    //   389: astore_1
    //   390: aload_1
    //   391: invokevirtual printStackTrace : ()V
    //   394: return
    // Exception table:
    //   from	to	target	type
    //   125	133	389	finally
    //   139	163	389	finally
    //   166	190	389	finally
    //   193	208	389	finally
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    LayoutInflater layoutInflater = this.e;
    return (paramInt == 10) ? new nb1(layoutInflater.inflate(2131493027, paramViewGroup, false), this, 10) : new nb1(layoutInflater.inflate(2131493028, paramViewGroup, false), this, paramInt);
  }
  
  public final void k(he1 paramhe1) {
    ImageView imageView = ((nb1)paramhe1).D;
    if (imageView != null)
      MyApplication.v.a(imageView); 
  }
  
  public final int l() {
    ArrayList arrayList = this.j;
    if (arrayList != null) {
      int i = this.n;
      if (i >= 0)
        return i + this.l; 
      i = this.o;
      if (i >= 0)
        return (i < this.l) ? i : (arrayList.size() + this.o); 
    } 
    return -1;
  }
  
  public final void m(int paramInt) {
    lb1 lb11 = this.g;
    try {
      ArrayList<Integer> arrayList = new ArrayList();
      this(1);
      arrayList.add(Integer.valueOf(paramInt));
      lb1.A0 = true;
      return;
    } finally {
      lb11 = null;
      lb11.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */