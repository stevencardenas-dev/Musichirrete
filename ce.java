import android.os.Handler;
import android.os.Message;

public final class ce implements Handler.Callback {
  public final boolean handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: istore_2
    //   5: iload_2
    //   6: ifeq -> 288
    //   9: iload_2
    //   10: iconst_1
    //   11: if_icmpeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield obj : Ljava/lang/Object;
    //   20: checkcast je
    //   23: astore #5
    //   25: aload_1
    //   26: getfield arg1 : I
    //   29: istore #4
    //   31: aload #5
    //   33: getfield i : Lie;
    //   36: astore_1
    //   37: aload #5
    //   39: getfield t : Landroid/view/accessibility/AccessibilityManager;
    //   42: astore #6
    //   44: aload #6
    //   46: ifnonnull -> 52
    //   49: goto -> 75
    //   52: aload #6
    //   54: iconst_1
    //   55: invokevirtual getEnabledAccessibilityServiceList : (I)Ljava/util/List;
    //   58: astore #6
    //   60: aload #6
    //   62: ifnull -> 281
    //   65: aload #6
    //   67: invokeinterface isEmpty : ()Z
    //   72: ifeq -> 281
    //   75: aload_1
    //   76: invokevirtual getVisibility : ()I
    //   79: ifne -> 281
    //   82: aload_1
    //   83: invokevirtual getAnimationMode : ()I
    //   86: iconst_1
    //   87: if_icmpne -> 161
    //   90: iconst_2
    //   91: newarray float
    //   93: dup
    //   94: iconst_0
    //   95: fconst_1
    //   96: fastore
    //   97: dup
    //   98: iconst_1
    //   99: fconst_0
    //   100: fastore
    //   101: invokestatic ofFloat : ([F)Landroid/animation/ValueAnimator;
    //   104: astore_1
    //   105: aload_1
    //   106: aload #5
    //   108: getfield d : Landroid/animation/TimeInterpolator;
    //   111: invokevirtual setInterpolator : (Landroid/animation/TimeInterpolator;)V
    //   114: aload_1
    //   115: new be
    //   118: dup
    //   119: aload #5
    //   121: iconst_0
    //   122: invokespecial <init> : (Lje;I)V
    //   125: invokevirtual addUpdateListener : (Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    //   128: aload_1
    //   129: aload #5
    //   131: getfield b : I
    //   134: i2l
    //   135: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   138: pop
    //   139: aload_1
    //   140: new ae
    //   143: dup
    //   144: aload #5
    //   146: iload #4
    //   148: iconst_0
    //   149: invokespecial <init> : (Lje;II)V
    //   152: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   155: aload_1
    //   156: invokevirtual start : ()V
    //   159: iconst_1
    //   160: ireturn
    //   161: new android/animation/ValueAnimator
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: astore_1
    //   169: aload #5
    //   171: getfield i : Lie;
    //   174: astore #6
    //   176: aload #6
    //   178: invokevirtual getHeight : ()I
    //   181: istore_3
    //   182: aload #6
    //   184: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   187: astore #6
    //   189: iload_3
    //   190: istore_2
    //   191: aload #6
    //   193: instanceof android/view/ViewGroup$MarginLayoutParams
    //   196: ifeq -> 210
    //   199: iload_3
    //   200: aload #6
    //   202: checkcast android/view/ViewGroup$MarginLayoutParams
    //   205: getfield bottomMargin : I
    //   208: iadd
    //   209: istore_2
    //   210: aload_1
    //   211: iconst_2
    //   212: newarray int
    //   214: dup
    //   215: iconst_0
    //   216: iconst_0
    //   217: iastore
    //   218: dup
    //   219: iconst_1
    //   220: iload_2
    //   221: iastore
    //   222: invokevirtual setIntValues : ([I)V
    //   225: aload_1
    //   226: aload #5
    //   228: getfield e : Landroid/animation/TimeInterpolator;
    //   231: invokevirtual setInterpolator : (Landroid/animation/TimeInterpolator;)V
    //   234: aload_1
    //   235: aload #5
    //   237: getfield c : I
    //   240: i2l
    //   241: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   244: pop
    //   245: aload_1
    //   246: new ae
    //   249: dup
    //   250: aload #5
    //   252: iload #4
    //   254: iconst_2
    //   255: invokespecial <init> : (Lje;II)V
    //   258: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   261: aload_1
    //   262: new be
    //   265: dup
    //   266: aload #5
    //   268: iconst_3
    //   269: invokespecial <init> : (Lje;I)V
    //   272: invokevirtual addUpdateListener : (Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    //   275: aload_1
    //   276: invokevirtual start : ()V
    //   279: iconst_1
    //   280: ireturn
    //   281: aload #5
    //   283: invokevirtual c : ()V
    //   286: iconst_1
    //   287: ireturn
    //   288: aload_1
    //   289: getfield obj : Ljava/lang/Object;
    //   292: checkcast je
    //   295: astore #5
    //   297: aload #5
    //   299: getfield i : Lie;
    //   302: astore_1
    //   303: aload_1
    //   304: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   307: ifnonnull -> 424
    //   310: aload_1
    //   311: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   314: astore #6
    //   316: aload #6
    //   318: instanceof is
    //   321: ifeq -> 391
    //   324: aload #6
    //   326: checkcast is
    //   329: astore #8
    //   331: new com/google/android/material/snackbar/BaseTransientBottomBar$Behavior
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: astore #7
    //   340: aload #7
    //   342: getfield i : Lgh1;
    //   345: astore #6
    //   347: aload #6
    //   349: invokevirtual getClass : ()Ljava/lang/Class;
    //   352: pop
    //   353: aload #6
    //   355: aload #5
    //   357: getfield u : Lge;
    //   360: putfield c : Ljava/lang/Object;
    //   363: aload #7
    //   365: new ee
    //   368: dup
    //   369: aload #5
    //   371: invokespecial <init> : (Lje;)V
    //   374: putfield b : Lee;
    //   377: aload #8
    //   379: aload #7
    //   381: invokevirtual b : (Lfs;)V
    //   384: aload #8
    //   386: bipush #80
    //   388: putfield g : I
    //   391: aload #5
    //   393: getfield g : Landroid/view/ViewGroup;
    //   396: astore #6
    //   398: aload_1
    //   399: iconst_1
    //   400: putfield m : Z
    //   403: aload #6
    //   405: aload_1
    //   406: invokevirtual addView : (Landroid/view/View;)V
    //   409: aload_1
    //   410: iconst_0
    //   411: putfield m : Z
    //   414: aload #5
    //   416: invokevirtual f : ()V
    //   419: aload_1
    //   420: iconst_4
    //   421: invokevirtual setVisibility : (I)V
    //   424: aload_1
    //   425: invokevirtual isLaidOut : ()Z
    //   428: ifeq -> 438
    //   431: aload #5
    //   433: invokevirtual e : ()V
    //   436: iconst_1
    //   437: ireturn
    //   438: aload #5
    //   440: iconst_1
    //   441: putfield r : Z
    //   444: iconst_1
    //   445: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */