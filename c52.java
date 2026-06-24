import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WelcomeActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class c52 extends ua0 implements View.OnClickListener {
  public static boolean h0;
  
  public static final k91 i0 = new k91(24);
  
  public Button a0;
  
  public SmartTextView b0;
  
  public TextView c0;
  
  public TextView d0;
  
  public TextView e0;
  
  public WelcomeActivity f0;
  
  public boolean g0;
  
  public c52() {
    h0 = false;
  }
  
  public final void D0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c0 : Landroid/widget/TextView;
    //   4: ldc 2131886165
    //   6: invokevirtual setText : (I)V
    //   9: aload_0
    //   10: getfield d0 : Landroid/widget/TextView;
    //   13: ldc 2131887456
    //   15: invokevirtual setText : (I)V
    //   18: aload_0
    //   19: getfield e0 : Landroid/widget/TextView;
    //   22: bipush #8
    //   24: invokevirtual setVisibility : (I)V
    //   27: aload_0
    //   28: getfield a0 : Landroid/widget/Button;
    //   31: ldc 2131886164
    //   33: invokevirtual setText : (I)V
    //   36: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   39: invokevirtual k : ()Ljava/util/ArrayList;
    //   42: astore #6
    //   44: aload #6
    //   46: invokevirtual isEmpty : ()Z
    //   49: istore #4
    //   51: iconst_1
    //   52: istore_2
    //   53: iload #4
    //   55: ifeq -> 279
    //   58: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   61: iconst_0
    //   62: invokevirtual m : (Z)Ljava/util/ArrayList;
    //   65: astore #6
    //   67: new java/util/ArrayList
    //   70: dup
    //   71: aload #6
    //   73: invokevirtual size : ()I
    //   76: invokespecial <init> : (I)V
    //   79: astore #5
    //   81: aload #6
    //   83: invokevirtual size : ()I
    //   86: istore_3
    //   87: iconst_0
    //   88: istore_1
    //   89: iload_1
    //   90: iload_3
    //   91: if_icmpge -> 141
    //   94: aload #6
    //   96: iload_1
    //   97: invokevirtual get : (I)Ljava/lang/Object;
    //   100: astore #7
    //   102: iload_1
    //   103: iconst_1
    //   104: iadd
    //   105: istore_2
    //   106: aload #7
    //   108: checkcast xp1
    //   111: astore #7
    //   113: iload_2
    //   114: istore_1
    //   115: aload #7
    //   117: getfield j : I
    //   120: bipush #-2
    //   122: if_icmpeq -> 89
    //   125: aload #5
    //   127: aload #7
    //   129: invokestatic l : (Lxp1;)Ljava/lang/String;
    //   132: invokevirtual add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: iload_2
    //   137: istore_1
    //   138: goto -> 89
    //   141: aload_0
    //   142: invokevirtual S : ()Landroid/content/res/Resources;
    //   145: ldc 2131755017
    //   147: aload #5
    //   149: invokevirtual size : ()I
    //   152: invokevirtual getQuantityString : (II)Ljava/lang/String;
    //   155: astore #7
    //   157: aload_0
    //   158: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   161: astore #6
    //   163: aload #7
    //   165: ldc '<br/><b>'
    //   167: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: astore #7
    //   172: aload #7
    //   174: ldc ', '
    //   176: aload #5
    //   178: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload #7
    //   187: ldc '</b>'
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload #6
    //   195: aload #7
    //   197: invokevirtual toString : ()Ljava/lang/String;
    //   200: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   203: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   206: aload_0
    //   207: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   210: ldc 2131099829
    //   212: invokevirtual setBackgroundResource : (I)V
    //   215: aload_0
    //   216: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   219: iconst_0
    //   220: invokevirtual setVisibility : (I)V
    //   223: aload_0
    //   224: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   227: aload_0
    //   228: invokevirtual S : ()Landroid/content/res/Resources;
    //   231: ldc 2131231111
    //   233: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   236: aconst_null
    //   237: aconst_null
    //   238: aconst_null
    //   239: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   242: aload_0
    //   243: getfield a0 : Landroid/widget/Button;
    //   246: bipush #8
    //   248: invokevirtual setVisibility : (I)V
    //   251: aload_0
    //   252: getfield g0 : Z
    //   255: ifeq -> 537
    //   258: aload_0
    //   259: getfield f0 : Lin/krosbits/musicolet/WelcomeActivity;
    //   262: astore #5
    //   264: aload #5
    //   266: getfield D : Z
    //   269: ifeq -> 537
    //   272: aload #5
    //   274: iconst_1
    //   275: invokevirtual n0 : (Z)V
    //   278: return
    //   279: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   282: iconst_0
    //   283: invokevirtual m : (Z)Ljava/util/ArrayList;
    //   286: astore #7
    //   288: aload #7
    //   290: invokevirtual size : ()I
    //   293: istore_3
    //   294: iconst_0
    //   295: istore_1
    //   296: iload_1
    //   297: iload_3
    //   298: if_icmpge -> 330
    //   301: aload #7
    //   303: iload_1
    //   304: invokevirtual get : (I)Ljava/lang/Object;
    //   307: astore #5
    //   309: iinc #1, 1
    //   312: aload #5
    //   314: checkcast xp1
    //   317: getfield j : I
    //   320: bipush #-2
    //   322: if_icmpne -> 296
    //   325: iload_2
    //   326: istore_1
    //   327: goto -> 332
    //   330: iconst_0
    //   331: istore_1
    //   332: new java/util/ArrayList
    //   335: dup
    //   336: aload #6
    //   338: invokevirtual size : ()I
    //   341: invokespecial <init> : (I)V
    //   344: astore #5
    //   346: aload #6
    //   348: invokevirtual size : ()I
    //   351: istore_3
    //   352: iconst_0
    //   353: istore_2
    //   354: iload_2
    //   355: iload_3
    //   356: if_icmpge -> 387
    //   359: aload #6
    //   361: iload_2
    //   362: invokevirtual get : (I)Ljava/lang/Object;
    //   365: astore #7
    //   367: iinc #2, 1
    //   370: aload #5
    //   372: aload #7
    //   374: checkcast xp1
    //   377: invokestatic l : (Lxp1;)Ljava/lang/String;
    //   380: invokevirtual add : (Ljava/lang/Object;)Z
    //   383: pop
    //   384: goto -> 354
    //   387: aload_0
    //   388: getfield g0 : Z
    //   391: ifne -> 413
    //   394: iload_1
    //   395: ifeq -> 401
    //   398: goto -> 413
    //   401: aload_0
    //   402: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   405: bipush #8
    //   407: invokevirtual setVisibility : (I)V
    //   410: goto -> 514
    //   413: aload_0
    //   414: invokevirtual S : ()Landroid/content/res/Resources;
    //   417: ldc 2131755024
    //   419: aload #5
    //   421: invokevirtual size : ()I
    //   424: invokevirtual getQuantityString : (II)Ljava/lang/String;
    //   427: astore #7
    //   429: aload_0
    //   430: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   433: astore #6
    //   435: aload #7
    //   437: ldc '<br/><b>'
    //   439: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: astore #7
    //   444: aload #7
    //   446: ldc ', '
    //   448: aload #5
    //   450: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: pop
    //   457: aload #7
    //   459: ldc '</b>'
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload #6
    //   467: aload #7
    //   469: invokevirtual toString : ()Ljava/lang/String;
    //   472: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   475: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   478: aload_0
    //   479: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   482: ldc 2131100766
    //   484: invokevirtual setBackgroundResource : (I)V
    //   487: aload_0
    //   488: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   491: aload_0
    //   492: invokevirtual S : ()Landroid/content/res/Resources;
    //   495: ldc 2131231131
    //   497: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   500: aconst_null
    //   501: aconst_null
    //   502: aconst_null
    //   503: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   506: aload_0
    //   507: getfield b0 : Lin/krosbits/android/widgets/SmartTextView;
    //   510: iconst_0
    //   511: invokevirtual setVisibility : (I)V
    //   514: aload_0
    //   515: getfield a0 : Landroid/widget/Button;
    //   518: iconst_0
    //   519: invokevirtual setVisibility : (I)V
    //   522: aload_0
    //   523: getfield g0 : Z
    //   526: ifeq -> 537
    //   529: aload_0
    //   530: getfield f0 : Lin/krosbits/musicolet/WelcomeActivity;
    //   533: iconst_0
    //   534: invokevirtual n0 : (Z)V
    //   537: return
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.f0 = (WelcomeActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131493001, paramViewGroup, false);
    g92.c(view.findViewById(2131297555), true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)view.findViewById(2131296941);
    hn hn = new hn(2, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    this.c0 = (TextView)view.findViewById(2131297890);
    this.d0 = (TextView)view.findViewById(2131297790);
    this.e0 = (TextView)view.findViewById(2131297791);
    this.b0 = (SmartTextView)view.findViewById(2131297789);
    this.a0 = (Button)view.findViewById(2131296369);
    this.b0.setOnClickListener(this);
    this.a0.setOnClickListener(this);
    return view;
  }
  
  public final void j0() {
    this.f0 = null;
    this.I = true;
  }
  
  public final void m0() {
    this.I = true;
    if (!h0 || !this.g0)
      D0(); 
    h0 = false;
  }
  
  public final void onClick(View paramView) {
    wp1 wp1 = new wp1();
    wp1.D0 = i0;
    ArrayList<Object> arrayList1 = MyApplication.F.m(false);
    ArrayList<String> arrayList = new ArrayList(arrayList1.size());
    int j = arrayList1.size();
    int i = 0;
    while (i < j) {
      xp1 xp1 = (xp1)arrayList1.get(i);
      int k = i + 1;
      xp1 = xp1;
      i = k;
      if (xp1.j != 0) {
        i = k;
        if (xp1.i) {
          arrayList.add(xp1.e);
          i = k;
        } 
      } 
    } 
    if (arrayList.size() > 0) {
      Bundle bundle = new Bundle();
      bundle.putStringArray("arg_reqattu", arrayList.<String>toArray(new String[0]));
      bundle.putInt("arg_reqattpid", 2131755024);
      bundle.putBoolean("arg_bshmsg", false);
      wp1.x0(bundle);
    } 
    wp1.O0((pc)P(), O());
    this.g0 = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */