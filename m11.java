import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class m11 {
  public ViewParent a;
  
  public ViewParent b;
  
  public final ViewGroup c;
  
  public boolean d;
  
  public int[] e;
  
  public m11(ViewGroup paramViewGroup) {
    this.c = paramViewGroup;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (this.d) {
      ViewParent viewParent = e(0);
      if (viewParent != null) {
        ViewGroup viewGroup = this.c;
        try {
          return viewParent.onNestedFling((View)viewGroup, paramFloat1, paramFloat2, paramBoolean);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder("ViewParent ");
          stringBuilder.append(viewParent);
          stringBuilder.append(" does not implement interface method onNestedFling");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } 
    } 
    return false;
  }
  
  public final boolean b(float paramFloat1, float paramFloat2) {
    if (this.d) {
      ViewParent viewParent = e(0);
      if (viewParent != null) {
        ViewGroup viewGroup = this.c;
        try {
          return viewParent.onNestedPreFling((View)viewGroup, paramFloat1, paramFloat2);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder("ViewParent ");
          stringBuilder.append(viewParent);
          stringBuilder.append(" does not implement interface method onNestedPreFling");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } 
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    boolean bool = this.d;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      ViewParent viewParent = e(paramInt3);
      if (viewParent == null) {
        bool1 = bool2;
      } else {
        if (paramInt1 != 0 || paramInt2 != 0) {
          byte b1;
          byte b2;
          ViewGroup viewGroup2;
          ViewGroup viewGroup1 = this.c;
          if (paramArrayOfint2 != null) {
            viewGroup1.getLocationInWindow(paramArrayOfint2);
            b1 = paramArrayOfint2[0];
            b2 = paramArrayOfint2[1];
          } else {
            b1 = 0;
            b2 = 0;
          } 
          if (paramArrayOfint1 == null) {
            if (this.e == null)
              this.e = new int[2]; 
            paramArrayOfint1 = this.e;
          } 
          paramArrayOfint1[0] = 0;
          paramArrayOfint1[1] = 0;
          if (viewParent instanceof n11) {
            ((n11)viewParent).c((View)viewGroup1, paramInt1, paramInt2, paramArrayOfint1, paramInt3);
            viewGroup2 = viewGroup1;
          } else {
            viewGroup2 = viewGroup1;
            if (paramInt3 == 0)
              try {
                viewParent.onNestedPreScroll((View)viewGroup1, paramInt1, paramInt2, paramArrayOfint1);
                viewGroup2 = viewGroup1;
              } catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
                viewGroup2 = viewGroup1;
              }  
          } 
          if (paramArrayOfint2 != null) {
            viewGroup2.getLocationInWindow(paramArrayOfint2);
            paramArrayOfint2[0] = paramArrayOfint2[0] - b1;
            paramArrayOfint2[1] = paramArrayOfint2[1] - b2;
          } 
          if (paramArrayOfint1[0] == 0) {
            bool1 = bool2;
            if (paramArrayOfint1[1] != 0)
              bool1 = true; 
            return bool1;
          } 
        } else {
          bool1 = bool2;
          if (paramArrayOfint2 != null) {
            paramArrayOfint2[0] = 0;
            paramArrayOfint2[1] = 0;
            return false;
          } 
          return bool1;
        } 
        bool1 = true;
      } 
    } 
    return bool1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    if (this.d) {
      ViewParent viewParent = e(paramInt5);
      if (viewParent != null) {
        if (paramInt1 != 0 || paramInt2 != 0 || paramInt3 != 0 || paramInt4 != 0) {
          byte b1;
          byte b2;
          ViewGroup viewGroup = this.c;
          if (paramArrayOfint1 != null) {
            viewGroup.getLocationInWindow(paramArrayOfint1);
            b2 = paramArrayOfint1[0];
            b1 = paramArrayOfint1[1];
          } else {
            b2 = 0;
            b1 = 0;
          } 
          if (paramArrayOfint2 == null) {
            if (this.e == null)
              this.e = new int[2]; 
            paramArrayOfint2 = this.e;
            paramArrayOfint2[0] = 0;
            paramArrayOfint2[1] = 0;
          } 
          if (viewParent instanceof o11) {
            ((o11)viewParent).d((View)viewGroup, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfint2);
          } else {
            paramArrayOfint2[0] = paramArrayOfint2[0] + paramInt3;
            paramArrayOfint2[1] = paramArrayOfint2[1] + paramInt4;
            if (viewParent instanceof n11) {
              ((n11)viewParent).e((View)viewGroup, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
            } else if (paramInt5 == 0) {
              try {
                viewParent.onNestedScroll((View)viewGroup, paramInt1, paramInt2, paramInt3, paramInt4);
              } catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
              } 
            } 
          } 
          if (paramArrayOfint1 != null) {
            viewGroup.getLocationInWindow(paramArrayOfint1);
            paramArrayOfint1[0] = paramArrayOfint1[0] - b2;
            paramArrayOfint1[1] = paramArrayOfint1[1] - b1;
          } 
          return true;
        } 
        if (paramArrayOfint1 != null) {
          paramArrayOfint1[0] = 0;
          paramArrayOfint1[1] = 0;
          return false;
        } 
      } 
    } 
    return false;
  }
  
  public final ViewParent e(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? null : this.b) : this.a;
  }
  
  public final boolean f(int paramInt) {
    return (e(paramInt) != null);
  }
  
  public final boolean g(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual f : (I)Z
    //   5: ifeq -> 11
    //   8: goto -> 257
    //   11: aload_0
    //   12: getfield d : Z
    //   15: ifeq -> 286
    //   18: aload_0
    //   19: getfield c : Landroid/view/ViewGroup;
    //   22: astore #7
    //   24: aload #7
    //   26: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   29: astore #5
    //   31: aload #7
    //   33: astore #6
    //   35: aload #5
    //   37: ifnull -> 286
    //   40: aload #5
    //   42: instanceof n11
    //   45: istore #4
    //   47: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.vxpsiUVEWbSM : Ljava/lang/String;
    //   50: astore #8
    //   52: iload #4
    //   54: ifeq -> 77
    //   57: aload #5
    //   59: checkcast n11
    //   62: aload #6
    //   64: aload #7
    //   66: iload_1
    //   67: iload_2
    //   68: invokeinterface f : (Landroid/view/View;Landroid/view/View;II)Z
    //   73: istore_3
    //   74: goto -> 141
    //   77: iload_2
    //   78: ifne -> 139
    //   81: aload #5
    //   83: aload #6
    //   85: aload #7
    //   87: iload_1
    //   88: invokeinterface onStartNestedScroll : (Landroid/view/View;Landroid/view/View;I)Z
    //   93: istore_3
    //   94: goto -> 141
    //   97: astore #10
    //   99: new java/lang/StringBuilder
    //   102: dup
    //   103: ldc 'ViewParent '
    //   105: invokespecial <init> : (Ljava/lang/String;)V
    //   108: astore #9
    //   110: aload #9
    //   112: aload #5
    //   114: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload #9
    //   120: ldc ' does not implement interface method onStartNestedScroll'
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #8
    //   128: aload #9
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: aload #10
    //   135: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   138: pop
    //   139: iconst_0
    //   140: istore_3
    //   141: iload_3
    //   142: ifeq -> 259
    //   145: iload_2
    //   146: ifeq -> 166
    //   149: iload_2
    //   150: iconst_1
    //   151: if_icmpeq -> 157
    //   154: goto -> 172
    //   157: aload_0
    //   158: aload #5
    //   160: putfield b : Landroid/view/ViewParent;
    //   163: goto -> 172
    //   166: aload_0
    //   167: aload #5
    //   169: putfield a : Landroid/view/ViewParent;
    //   172: iload #4
    //   174: ifeq -> 196
    //   177: aload #5
    //   179: checkcast n11
    //   182: aload #6
    //   184: aload #7
    //   186: iload_1
    //   187: iload_2
    //   188: invokeinterface a : (Landroid/view/View;Landroid/view/View;II)V
    //   193: goto -> 257
    //   196: iload_2
    //   197: ifne -> 257
    //   200: aload #5
    //   202: aload #6
    //   204: aload #7
    //   206: iload_1
    //   207: invokeinterface onNestedScrollAccepted : (Landroid/view/View;Landroid/view/View;I)V
    //   212: goto -> 257
    //   215: astore #7
    //   217: new java/lang/StringBuilder
    //   220: dup
    //   221: ldc 'ViewParent '
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: astore #6
    //   228: aload #6
    //   230: aload #5
    //   232: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload #6
    //   238: ldc ' does not implement interface method onNestedScrollAccepted'
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload #8
    //   246: aload #6
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: aload #7
    //   253: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   256: pop
    //   257: iconst_1
    //   258: ireturn
    //   259: aload #5
    //   261: instanceof android/view/View
    //   264: ifeq -> 274
    //   267: aload #5
    //   269: checkcast android/view/View
    //   272: astore #6
    //   274: aload #5
    //   276: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   281: astore #5
    //   283: goto -> 35
    //   286: iconst_0
    //   287: ireturn
    // Exception table:
    //   from	to	target	type
    //   81	94	97	java/lang/AbstractMethodError
    //   200	212	215	java/lang/AbstractMethodError
  }
  
  public final void h(int paramInt) {
    ViewParent viewParent = e(paramInt);
    if (viewParent != null) {
      boolean bool = viewParent instanceof n11;
      ViewGroup viewGroup = this.c;
      if (bool) {
        ((n11)viewParent).b((View)viewGroup, paramInt);
      } else if (paramInt == 0) {
        try {
          viewParent.onStopNestedScroll((View)viewGroup);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder("ViewParent ");
          stringBuilder.append(viewParent);
          stringBuilder.append(" does not implement interface method onStopNestedScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } 
      if (paramInt != 0) {
        if (paramInt == 1)
          this.b = null; 
      } else {
        this.a = null;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */