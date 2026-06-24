import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class qr1 extends qv {
  public int i;
  
  public int j;
  
  public final SwipeDismissBehavior k;
  
  public qr1(SwipeDismissBehavior paramSwipeDismissBehavior) {
    this.k = paramSwipeDismissBehavior;
    this.j = -1;
  }
  
  public final int B(View paramView) {
    return paramView.getWidth();
  }
  
  public final void N(View paramView, int paramInt) {
    this.j = paramInt;
    this.i = paramView.getLeft();
    ViewParent viewParent = paramView.getParent();
    if (viewParent != null) {
      SwipeDismissBehavior swipeDismissBehavior = this.k;
      swipeDismissBehavior.d = true;
      viewParent.requestDisallowInterceptTouchEvent(true);
      swipeDismissBehavior.d = false;
    } 
  }
  
  public final void O(int paramInt) {
    ee ee = this.k.b;
    if (ee != null) {
      ge ge = ee.b.u;
      if (paramInt != 0) {
        if (paramInt == 1 || paramInt == 2) {
          n2.x().F(ge);
          return;
        } 
      } else {
        n2.x().G(ge);
      } 
    } 
  }
  
  public final void P(View paramView, int paramInt1, int paramInt2) {
    float f1 = paramView.getWidth();
    SwipeDismissBehavior swipeDismissBehavior = this.k;
    f1 *= swipeDismissBehavior.f;
    float f2 = paramView.getWidth() * swipeDismissBehavior.g;
    float f3 = Math.abs(paramInt1 - this.i);
    if (f3 <= f1) {
      paramView.setAlpha(1.0F);
      return;
    } 
    if (f3 >= f2) {
      paramView.setAlpha(0.0F);
      return;
    } 
    paramView.setAlpha(Math.min(Math.max(0.0F, 1.0F - (f3 - f1) / (f2 - f1)), 1.0F));
  }
  
  public final void Q(View paramView, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_m1
    //   2: putfield j : I
    //   5: aload_1
    //   6: invokevirtual getWidth : ()I
    //   9: istore #5
    //   11: fload_2
    //   12: fconst_0
    //   13: fcmpl
    //   14: istore #6
    //   16: iconst_0
    //   17: istore #8
    //   19: aload_0
    //   20: getfield k : Lcom/google/android/material/behavior/SwipeDismissBehavior;
    //   23: astore #9
    //   25: iload #6
    //   27: ifeq -> 118
    //   30: aload_1
    //   31: invokevirtual getLayoutDirection : ()I
    //   34: iconst_1
    //   35: if_icmpne -> 44
    //   38: iconst_1
    //   39: istore #4
    //   41: goto -> 47
    //   44: iconst_0
    //   45: istore #4
    //   47: aload #9
    //   49: getfield e : I
    //   52: istore #7
    //   54: iload #7
    //   56: iconst_2
    //   57: if_icmpne -> 63
    //   60: goto -> 156
    //   63: iload #7
    //   65: ifne -> 90
    //   68: iload #4
    //   70: ifeq -> 82
    //   73: fload_2
    //   74: fconst_0
    //   75: fcmpg
    //   76: ifge -> 209
    //   79: goto -> 156
    //   82: iload #6
    //   84: ifle -> 209
    //   87: goto -> 156
    //   90: iload #7
    //   92: iconst_1
    //   93: if_icmpne -> 209
    //   96: iload #4
    //   98: ifeq -> 109
    //   101: iload #6
    //   103: ifle -> 209
    //   106: goto -> 156
    //   109: fload_2
    //   110: fconst_0
    //   111: fcmpg
    //   112: ifge -> 209
    //   115: goto -> 156
    //   118: aload_1
    //   119: invokevirtual getLeft : ()I
    //   122: istore #7
    //   124: aload_0
    //   125: getfield i : I
    //   128: istore #6
    //   130: aload_1
    //   131: invokevirtual getWidth : ()I
    //   134: i2f
    //   135: ldc 0.5
    //   137: fmul
    //   138: invokestatic round : (F)I
    //   141: istore #4
    //   143: iload #7
    //   145: iload #6
    //   147: isub
    //   148: invokestatic abs : (I)I
    //   151: iload #4
    //   153: if_icmplt -> 209
    //   156: fload_2
    //   157: fconst_0
    //   158: fcmpg
    //   159: iflt -> 194
    //   162: aload_1
    //   163: invokevirtual getLeft : ()I
    //   166: istore #4
    //   168: aload_0
    //   169: getfield i : I
    //   172: istore #6
    //   174: iload #4
    //   176: iload #6
    //   178: if_icmpge -> 184
    //   181: goto -> 194
    //   184: iload #6
    //   186: iload #5
    //   188: iadd
    //   189: istore #4
    //   191: goto -> 203
    //   194: aload_0
    //   195: getfield i : I
    //   198: iload #5
    //   200: isub
    //   201: istore #4
    //   203: iconst_1
    //   204: istore #8
    //   206: goto -> 215
    //   209: aload_0
    //   210: getfield i : I
    //   213: istore #4
    //   215: aload #9
    //   217: getfield a : Ly22;
    //   220: iload #4
    //   222: aload_1
    //   223: invokevirtual getTop : ()I
    //   226: invokevirtual n : (II)Z
    //   229: ifeq -> 249
    //   232: aload_1
    //   233: new zk1
    //   236: dup
    //   237: aload #9
    //   239: aload_1
    //   240: iload #8
    //   242: invokespecial <init> : (Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    //   245: invokevirtual postOnAnimation : (Ljava/lang/Runnable;)V
    //   248: return
    //   249: iload #8
    //   251: ifeq -> 272
    //   254: aload #9
    //   256: getfield b : Lee;
    //   259: astore #9
    //   261: aload #9
    //   263: ifnull -> 272
    //   266: aload #9
    //   268: aload_1
    //   269: invokevirtual a : (Landroid/view/View;)V
    //   272: return
  }
  
  public final boolean g0(View paramView, int paramInt) {
    int i = this.j;
    return ((i == -1 || i == paramInt) && this.k.w(paramView));
  }
  
  public final int j(View paramView, int paramInt) {
    int i;
    int j;
    if (paramView.getLayoutDirection() == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = this.k.e;
    if (k == 0) {
      j = this.i;
      if (i) {
        i = j - paramView.getWidth();
        j = this.i;
      } else {
        k = paramView.getWidth() + j;
        i = j;
        j = k;
      } 
    } else {
      j = this.i;
      if (k == 1) {
        if (i != 0) {
          k = paramView.getWidth() + j;
          i = j;
          j = k;
        } else {
          i = j - paramView.getWidth();
          j = this.i;
        } 
      } else {
        i = j - paramView.getWidth();
        j = this.i + paramView.getWidth();
      } 
    } 
    return Math.min(Math.max(i, paramInt), j);
  }
  
  public final int k(View paramView, int paramInt) {
    return paramView.getTop();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */