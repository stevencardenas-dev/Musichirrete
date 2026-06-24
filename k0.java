import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

public class k0 {
  public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
  
  public final View.AccessibilityDelegate a;
  
  public final j0 b;
  
  public k0() {
    this(c);
  }
  
  public k0(View.AccessibilityDelegate paramAccessibilityDelegate) {
    this.a = paramAccessibilityDelegate;
    this.b = new j0(this);
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public gh1 b(View paramView) {
    AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(paramView);
    return (accessibilityNodeProvider != null) ? new gh1(3, accessibilityNodeProvider) : null;
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, t0 paramt0) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramt0.a);
  }
  
  public void e(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean f(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean g(View paramView, int paramInt, Bundle paramBundle) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 2131297569
    //   3: invokevirtual getTag : (I)Ljava/lang/Object;
    //   6: checkcast java/util/List
    //   9: astore #10
    //   11: aload #10
    //   13: astore #9
    //   15: aload #10
    //   17: ifnonnull -> 25
    //   20: getstatic java/util/Collections.EMPTY_LIST : Ljava/util/List;
    //   23: astore #9
    //   25: iconst_0
    //   26: istore #8
    //   28: iconst_0
    //   29: istore #4
    //   31: aload #9
    //   33: invokeinterface size : ()I
    //   38: istore #5
    //   40: aconst_null
    //   41: astore #10
    //   43: iload #4
    //   45: iload #5
    //   47: if_icmpge -> 170
    //   50: aload #9
    //   52: iload #4
    //   54: invokeinterface get : (I)Ljava/lang/Object;
    //   59: checkcast m0
    //   62: astore #11
    //   64: aload #11
    //   66: invokevirtual a : ()I
    //   69: iload_2
    //   70: if_icmpne -> 164
    //   73: aload #11
    //   75: getfield c : Ljava/lang/Class;
    //   78: astore #9
    //   80: aload #11
    //   82: getfield d : Ld1;
    //   85: astore #11
    //   87: aload #11
    //   89: ifnull -> 170
    //   92: aload #9
    //   94: ifnonnull -> 100
    //   97: goto -> 151
    //   100: aload #9
    //   102: aconst_null
    //   103: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   106: aconst_null
    //   107: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   110: ifnonnull -> 120
    //   113: aconst_null
    //   114: athrow
    //   115: astore #12
    //   117: goto -> 133
    //   120: new java/lang/ClassCastException
    //   123: astore #12
    //   125: aload #12
    //   127: invokespecial <init> : ()V
    //   130: aload #12
    //   132: athrow
    //   133: ldc 'A11yActionCompat'
    //   135: ldc 'Failed to execute command with argument class ViewCommandArgument: '
    //   137: aload #9
    //   139: invokevirtual getName : ()Ljava/lang/String;
    //   142: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   145: aload #12
    //   147: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   150: pop
    //   151: aload #11
    //   153: aload_1
    //   154: invokeinterface b : (Landroid/view/View;)Z
    //   159: istore #7
    //   161: goto -> 173
    //   164: iinc #4, 1
    //   167: goto -> 31
    //   170: iconst_0
    //   171: istore #7
    //   173: iload #7
    //   175: istore #6
    //   177: iload #7
    //   179: ifne -> 194
    //   182: aload_0
    //   183: getfield a : Landroid/view/View$AccessibilityDelegate;
    //   186: aload_1
    //   187: iload_2
    //   188: aload_3
    //   189: invokevirtual performAccessibilityAction : (Landroid/view/View;ILandroid/os/Bundle;)Z
    //   192: istore #6
    //   194: iload #6
    //   196: istore #7
    //   198: iload #6
    //   200: ifne -> 379
    //   203: iload #6
    //   205: istore #7
    //   207: iload_2
    //   208: ldc 2131296274
    //   210: if_icmpne -> 379
    //   213: iload #6
    //   215: istore #7
    //   217: aload_3
    //   218: ifnull -> 379
    //   221: aload_3
    //   222: ldc 'ACCESSIBILITY_CLICKABLE_SPAN_ID'
    //   224: iconst_m1
    //   225: invokevirtual getInt : (Ljava/lang/String;I)I
    //   228: istore_2
    //   229: aload_1
    //   230: ldc 2131297570
    //   232: invokevirtual getTag : (I)Ljava/lang/Object;
    //   235: checkcast android/util/SparseArray
    //   238: astore_3
    //   239: iload #8
    //   241: istore #6
    //   243: aload_3
    //   244: ifnull -> 375
    //   247: aload_3
    //   248: iload_2
    //   249: invokevirtual get : (I)Ljava/lang/Object;
    //   252: checkcast java/lang/ref/WeakReference
    //   255: astore_3
    //   256: iload #8
    //   258: istore #6
    //   260: aload_3
    //   261: ifnull -> 375
    //   264: aload_3
    //   265: invokevirtual get : ()Ljava/lang/Object;
    //   268: checkcast android/text/style/ClickableSpan
    //   271: astore #9
    //   273: iload #8
    //   275: istore #6
    //   277: aload #9
    //   279: ifnull -> 375
    //   282: aload_1
    //   283: invokevirtual createAccessibilityNodeInfo : ()Landroid/view/accessibility/AccessibilityNodeInfo;
    //   286: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   289: astore #11
    //   291: aload #10
    //   293: astore_3
    //   294: aload #11
    //   296: instanceof android/text/Spanned
    //   299: ifeq -> 326
    //   302: aload #11
    //   304: checkcast android/text/Spanned
    //   307: iconst_0
    //   308: aload #11
    //   310: invokeinterface length : ()I
    //   315: ldc android/text/style/ClickableSpan
    //   317: invokeinterface getSpans : (IILjava/lang/Class;)[Ljava/lang/Object;
    //   322: checkcast [Landroid/text/style/ClickableSpan;
    //   325: astore_3
    //   326: iconst_0
    //   327: istore_2
    //   328: iload #8
    //   330: istore #6
    //   332: aload_3
    //   333: ifnull -> 375
    //   336: iload #8
    //   338: istore #6
    //   340: iload_2
    //   341: aload_3
    //   342: arraylength
    //   343: if_icmpge -> 375
    //   346: aload #9
    //   348: aload_3
    //   349: iload_2
    //   350: aaload
    //   351: invokevirtual equals : (Ljava/lang/Object;)Z
    //   354: ifeq -> 369
    //   357: aload #9
    //   359: aload_1
    //   360: invokevirtual onClick : (Landroid/view/View;)V
    //   363: iconst_1
    //   364: istore #6
    //   366: goto -> 375
    //   369: iinc #2, 1
    //   372: goto -> 328
    //   375: iload #6
    //   377: istore #7
    //   379: iload #7
    //   381: ireturn
    // Exception table:
    //   from	to	target	type
    //   100	115	115	java/lang/Exception
    //   120	133	115	java/lang/Exception
  }
  
  public void h(View paramView, int paramInt) {
    this.a.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void i(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */