import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class ln1 extends je {
  public static final int[] D = new int[] { 2130969967, 2130969969 };
  
  public final AccessibilityManager B;
  
  public boolean C;
  
  public ln1(Context paramContext, ViewGroup paramViewGroup, SnackbarContentLayout paramSnackbarContentLayout1, SnackbarContentLayout paramSnackbarContentLayout2) {
    super(paramContext, paramViewGroup, (View)paramSnackbarContentLayout1, paramSnackbarContentLayout2);
    this.B = (AccessibilityManager)paramViewGroup.getContext().getSystemService("accessibility");
  }
  
  public static ln1 g(View paramView, Spanned paramSpanned, int paramInt) {
    ViewGroup viewGroup;
    ViewParent viewParent;
    View view2 = null;
    View view1 = paramView;
    do {
      if (view1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
        viewGroup = (ViewGroup)view1;
        break;
      } 
      paramView = view2;
      if (view1 instanceof android.widget.FrameLayout) {
        if (view1.getId() == 16908290) {
          ViewGroup viewGroup2 = (ViewGroup)view1;
          break;
        } 
        viewGroup = (ViewGroup)view1;
      } 
      View view = view1;
      if (view1 != null) {
        viewParent = view1.getParent();
        if (viewParent instanceof View) {
          View view3 = (View)viewParent;
        } else {
          viewParent = null;
        } 
      } 
      ViewGroup viewGroup1 = viewGroup;
      ViewParent viewParent1 = viewParent;
    } while (viewParent != null);
    if (viewGroup != null) {
      Context context = viewGroup.getContext();
      LayoutInflater layoutInflater = LayoutInflater.from(context);
      TypedArray typedArray = context.obtainStyledAttributes(D);
      int i = typedArray.getResourceId(0, -1);
      int j = typedArray.getResourceId(1, -1);
      typedArray.recycle();
      if (i != -1 && j != -1) {
        i = 2131493148;
      } else {
        i = 2131492935;
      } 
      SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)layoutInflater.inflate(i, viewGroup, false);
      ln1 ln11 = new ln1(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
      ((SnackbarContentLayout)ln11.i.getChildAt(0)).getMessageView().setText((CharSequence)paramSpanned);
      ln11.k = paramInt;
      return ln11;
    } 
    l0.l("No suitable parent found from the given view. Please provide a valid view.");
    return null;
  }
  
  public final void h(CharSequence paramCharSequence, View.OnClickListener paramOnClickListener) {
    Button button = ((SnackbarContentLayout)this.i.getChildAt(0)).getActionView();
    if (TextUtils.isEmpty(paramCharSequence) || paramOnClickListener == null) {
      button.setVisibility(8);
      button.setOnClickListener(null);
      this.C = false;
      return;
    } 
    this.C = true;
    button.setVisibility(0);
    button.setText(paramCharSequence);
    button.setOnClickListener(new ag(10, this, paramOnClickListener));
  }
  
  public final void i() {
    // Byte code:
    //   0: invokestatic x : ()Ln2;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield B : Landroid/view/accessibility/AccessibilityManager;
    //   9: astore #6
    //   11: aload_0
    //   12: getfield k : I
    //   15: istore_2
    //   16: iconst_0
    //   17: istore_3
    //   18: iload_2
    //   19: bipush #-2
    //   21: if_icmpne -> 27
    //   24: goto -> 85
    //   27: getstatic android/os/Build$VERSION.SDK_INT : I
    //   30: istore_1
    //   31: aload_0
    //   32: getfield C : Z
    //   35: istore #4
    //   37: iload_1
    //   38: bipush #29
    //   40: if_icmplt -> 68
    //   43: iload #4
    //   45: ifeq -> 53
    //   48: iconst_4
    //   49: istore_1
    //   50: goto -> 55
    //   53: iconst_0
    //   54: istore_1
    //   55: aload #6
    //   57: iload_2
    //   58: iload_1
    //   59: iconst_3
    //   60: ior
    //   61: invokevirtual getRecommendedTimeoutMillis : (II)I
    //   64: istore_1
    //   65: goto -> 88
    //   68: iload_2
    //   69: istore_1
    //   70: iload #4
    //   72: ifeq -> 88
    //   75: iload_2
    //   76: istore_1
    //   77: aload #6
    //   79: invokevirtual isTouchExplorationEnabled : ()Z
    //   82: ifeq -> 88
    //   85: bipush #-2
    //   87: istore_1
    //   88: aload_0
    //   89: getfield u : Lge;
    //   92: astore #7
    //   94: aload #5
    //   96: getfield c : Ljava/lang/Object;
    //   99: astore #6
    //   101: aload #6
    //   103: monitorenter
    //   104: aload #5
    //   106: aload #7
    //   108: invokevirtual A : (Lge;)Z
    //   111: ifeq -> 165
    //   114: aload #5
    //   116: getfield f : Ljava/lang/Object;
    //   119: checkcast nn1
    //   122: astore #7
    //   124: aload #7
    //   126: iload_1
    //   127: putfield b : I
    //   130: aload #5
    //   132: getfield e : Ljava/lang/Object;
    //   135: checkcast android/os/Handler
    //   138: aload #7
    //   140: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
    //   143: aload #5
    //   145: aload #5
    //   147: getfield f : Ljava/lang/Object;
    //   150: checkcast nn1
    //   153: invokevirtual H : (Lnn1;)V
    //   156: aload #6
    //   158: monitorexit
    //   159: return
    //   160: astore #5
    //   162: goto -> 283
    //   165: aload #5
    //   167: getfield g : Ljava/lang/Object;
    //   170: checkcast nn1
    //   173: astore #8
    //   175: iload_3
    //   176: istore_2
    //   177: aload #8
    //   179: ifnull -> 199
    //   182: iload_3
    //   183: istore_2
    //   184: aload #8
    //   186: getfield a : Ljava/lang/ref/WeakReference;
    //   189: invokevirtual get : ()Ljava/lang/Object;
    //   192: aload #7
    //   194: if_acmpne -> 199
    //   197: iconst_1
    //   198: istore_2
    //   199: iload_2
    //   200: ifeq -> 218
    //   203: aload #5
    //   205: getfield g : Ljava/lang/Object;
    //   208: checkcast nn1
    //   211: iload_1
    //   212: putfield b : I
    //   215: goto -> 238
    //   218: new nn1
    //   221: astore #8
    //   223: aload #8
    //   225: iload_1
    //   226: aload #7
    //   228: invokespecial <init> : (ILge;)V
    //   231: aload #5
    //   233: aload #8
    //   235: putfield g : Ljava/lang/Object;
    //   238: aload #5
    //   240: getfield f : Ljava/lang/Object;
    //   243: checkcast nn1
    //   246: astore #7
    //   248: aload #7
    //   250: ifnull -> 268
    //   253: aload #5
    //   255: aload #7
    //   257: iconst_4
    //   258: invokevirtual m : (Lnn1;I)Z
    //   261: ifeq -> 268
    //   264: aload #6
    //   266: monitorexit
    //   267: return
    //   268: aload #5
    //   270: aconst_null
    //   271: putfield f : Ljava/lang/Object;
    //   274: aload #5
    //   276: invokevirtual J : ()V
    //   279: aload #6
    //   281: monitorexit
    //   282: return
    //   283: aload #6
    //   285: monitorexit
    //   286: aload #5
    //   288: athrow
    // Exception table:
    //   from	to	target	type
    //   104	159	160	finally
    //   165	175	160	finally
    //   184	197	160	finally
    //   203	215	160	finally
    //   218	238	160	finally
    //   238	248	160	finally
    //   253	267	160	finally
    //   268	282	160	finally
    //   283	286	160	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ln1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */