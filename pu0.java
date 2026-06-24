import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public final class pu0 extends ArrayAdapter {
  public final float b;
  
  public final qu0 c;
  
  public pu0(qu0 paramqu0, Context paramContext, ArrayList paramArrayList) {
    super(paramContext, 0, paramArrayList);
    this.b = qz1.x(paramContext);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: aload_0
    //   4: getfield c : Lqu0;
    //   7: astore #9
    //   9: aload_2
    //   10: ifnonnull -> 31
    //   13: aload_3
    //   14: invokevirtual getContext : ()Landroid/content/Context;
    //   17: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   20: ldc 2131493124
    //   22: aload_3
    //   23: iconst_0
    //   24: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   27: astore_2
    //   28: goto -> 91
    //   31: aload_2
    //   32: ldc 2131297961
    //   34: invokevirtual findViewById : (I)Landroid/view/View;
    //   37: checkcast android/widget/LinearLayout
    //   40: aload #9
    //   42: getfield R : I
    //   45: invokestatic o : (Landroid/view/View;I)V
    //   48: aload_2
    //   49: ldc 2131297214
    //   51: invokevirtual findViewById : (I)Landroid/view/View;
    //   54: astore #11
    //   56: aload #11
    //   58: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   61: astore #10
    //   63: aload #9
    //   65: getfield Q : I
    //   68: istore #5
    //   70: aload #10
    //   72: iload #5
    //   74: putfield width : I
    //   77: aload #10
    //   79: iload #5
    //   81: putfield height : I
    //   84: aload #11
    //   86: aload #10
    //   88: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   91: aload_0
    //   92: iload_1
    //   93: invokevirtual getItem : (I)Ljava/lang/Object;
    //   96: checkcast hv0
    //   99: astore #10
    //   101: aload #10
    //   103: ifnull -> 471
    //   106: aload #10
    //   108: getfield g : Z
    //   111: istore #8
    //   113: aload_2
    //   114: ldc 2131297203
    //   116: invokevirtual findViewById : (I)Landroid/view/View;
    //   119: checkcast android/widget/TextView
    //   122: astore #11
    //   124: aload #11
    //   126: iload #8
    //   128: invokevirtual setEnabled : (Z)V
    //   131: aload #11
    //   133: aload #10
    //   135: getfield d : Ljava/lang/String;
    //   138: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   141: aload_2
    //   142: ldc 2131297215
    //   144: invokevirtual findViewById : (I)Landroid/view/View;
    //   147: checkcast androidx/mediarouter/app/MediaRouteVolumeSlider
    //   150: astore #11
    //   152: aload_3
    //   153: invokevirtual getContext : ()Landroid/content/Context;
    //   156: astore #12
    //   158: aload #9
    //   160: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   163: astore_3
    //   164: aload #12
    //   166: iconst_0
    //   167: invokestatic w : (Landroid/content/Context;I)I
    //   170: istore #6
    //   172: iload #6
    //   174: invokestatic alpha : (I)I
    //   177: istore #7
    //   179: sipush #255
    //   182: istore #5
    //   184: iload #6
    //   186: istore_1
    //   187: iload #7
    //   189: sipush #255
    //   192: if_icmpeq -> 211
    //   195: iload #6
    //   197: aload_3
    //   198: invokevirtual getTag : ()Ljava/lang/Object;
    //   201: checkcast java/lang/Integer
    //   204: invokevirtual intValue : ()I
    //   207: invokestatic g : (II)I
    //   210: istore_1
    //   211: aload #11
    //   213: iload_1
    //   214: iload_1
    //   215: invokevirtual a : (II)V
    //   218: aload #11
    //   220: aload #10
    //   222: invokevirtual setTag : (Ljava/lang/Object;)V
    //   225: aload #9
    //   227: getfield U : Ljava/util/HashMap;
    //   230: aload #10
    //   232: aload #11
    //   234: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: aload #11
    //   240: iload #8
    //   242: iconst_1
    //   243: ixor
    //   244: invokevirtual b : (Z)V
    //   247: aload #11
    //   249: iload #8
    //   251: invokevirtual setEnabled : (Z)V
    //   254: iload #8
    //   256: ifeq -> 350
    //   259: aload #9
    //   261: getfield B : Z
    //   264: ifeq -> 330
    //   267: aload #10
    //   269: invokevirtual e : ()Z
    //   272: ifeq -> 286
    //   275: invokestatic h : ()Z
    //   278: ifne -> 286
    //   281: iconst_0
    //   282: istore_1
    //   283: goto -> 292
    //   286: aload #10
    //   288: getfield o : I
    //   291: istore_1
    //   292: iload_1
    //   293: iconst_1
    //   294: if_icmpne -> 330
    //   297: aload #11
    //   299: aload #10
    //   301: getfield q : I
    //   304: invokevirtual setMax : (I)V
    //   307: aload #11
    //   309: aload #10
    //   311: getfield p : I
    //   314: invokevirtual setProgress : (I)V
    //   317: aload #11
    //   319: aload #9
    //   321: getfield O : Lou0;
    //   324: invokevirtual setOnSeekBarChangeListener : (Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    //   327: goto -> 350
    //   330: aload #11
    //   332: bipush #100
    //   334: invokevirtual setMax : (I)V
    //   337: aload #11
    //   339: bipush #100
    //   341: invokevirtual setProgress : (I)V
    //   344: aload #11
    //   346: iconst_0
    //   347: invokevirtual setEnabled : (Z)V
    //   350: aload_2
    //   351: ldc 2131297214
    //   353: invokevirtual findViewById : (I)Landroid/view/View;
    //   356: checkcast android/widget/ImageView
    //   359: astore_3
    //   360: iload #8
    //   362: ifeq -> 371
    //   365: iload #5
    //   367: istore_1
    //   368: goto -> 380
    //   371: aload_0
    //   372: getfield b : F
    //   375: ldc 255.0
    //   377: fmul
    //   378: f2i
    //   379: istore_1
    //   380: aload_3
    //   381: iload_1
    //   382: invokevirtual setAlpha : (I)V
    //   385: aload_2
    //   386: ldc 2131297961
    //   388: invokevirtual findViewById : (I)Landroid/view/View;
    //   391: checkcast android/widget/LinearLayout
    //   394: astore_3
    //   395: iload #4
    //   397: istore_1
    //   398: aload #9
    //   400: getfield M : Ljava/util/HashSet;
    //   403: aload #10
    //   405: invokevirtual contains : (Ljava/lang/Object;)Z
    //   408: ifeq -> 413
    //   411: iconst_4
    //   412: istore_1
    //   413: aload_3
    //   414: iload_1
    //   415: invokevirtual setVisibility : (I)V
    //   418: aload #9
    //   420: getfield K : Ljava/util/HashSet;
    //   423: astore_3
    //   424: aload_3
    //   425: ifnull -> 471
    //   428: aload_3
    //   429: aload #10
    //   431: invokevirtual contains : (Ljava/lang/Object;)Z
    //   434: ifeq -> 471
    //   437: new android/view/animation/AlphaAnimation
    //   440: dup
    //   441: fconst_0
    //   442: fconst_0
    //   443: invokespecial <init> : (FF)V
    //   446: astore_3
    //   447: aload_3
    //   448: lconst_0
    //   449: invokevirtual setDuration : (J)V
    //   452: aload_3
    //   453: iconst_1
    //   454: invokevirtual setFillEnabled : (Z)V
    //   457: aload_3
    //   458: iconst_1
    //   459: invokevirtual setFillAfter : (Z)V
    //   462: aload_2
    //   463: invokevirtual clearAnimation : ()V
    //   466: aload_2
    //   467: aload_3
    //   468: invokevirtual startAnimation : (Landroid/view/animation/Animation;)V
    //   471: aload_2
    //   472: areturn
  }
  
  public final boolean isEnabled(int paramInt) {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */