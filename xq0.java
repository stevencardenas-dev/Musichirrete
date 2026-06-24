import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.afollestad.materialdialogs.internal.MDRootLayout;

public final class xq0 implements ViewTreeObserver.OnScrollChangedListener {
  public final ViewGroup a;
  
  public final boolean b;
  
  public final MDRootLayout c;
  
  public xq0(MDRootLayout paramMDRootLayout, ViewGroup paramViewGroup, boolean paramBoolean) {
    this.c = paramMDRootLayout;
    this.a = paramViewGroup;
    this.b = paramBoolean;
  }
  
  public final void onScrollChanged() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/afollestad/materialdialogs/internal/MDRootLayout;
    //   4: astore #9
    //   6: aload #9
    //   8: getfield g : [Lcom/afollestad/materialdialogs/internal/MDButton;
    //   11: astore #11
    //   13: aload #11
    //   15: arraylength
    //   16: istore #4
    //   18: iconst_0
    //   19: istore #7
    //   21: iconst_0
    //   22: istore_3
    //   23: iload_3
    //   24: iload #4
    //   26: if_icmpge -> 62
    //   29: aload #11
    //   31: iload_3
    //   32: aaload
    //   33: astore #10
    //   35: aload #10
    //   37: ifnull -> 56
    //   40: aload #10
    //   42: invokevirtual getVisibility : ()I
    //   45: bipush #8
    //   47: if_icmpeq -> 56
    //   50: iconst_1
    //   51: istore #5
    //   53: goto -> 65
    //   56: iinc #3, 1
    //   59: goto -> 23
    //   62: iconst_0
    //   63: istore #5
    //   65: aload_0
    //   66: getfield a : Landroid/view/ViewGroup;
    //   69: astore #10
    //   71: aload #10
    //   73: instanceof android/webkit/WebView
    //   76: istore #8
    //   78: aload_0
    //   79: getfield b : Z
    //   82: istore #6
    //   84: iload #8
    //   86: ifeq -> 221
    //   89: aload #10
    //   91: checkcast android/webkit/WebView
    //   94: astore #11
    //   96: iload #6
    //   98: ifeq -> 155
    //   101: aload #9
    //   103: getfield b : Landroid/view/View;
    //   106: astore #10
    //   108: aload #10
    //   110: ifnull -> 145
    //   113: aload #10
    //   115: invokevirtual getVisibility : ()I
    //   118: bipush #8
    //   120: if_icmpeq -> 145
    //   123: aload #11
    //   125: invokevirtual getScrollY : ()I
    //   128: istore_3
    //   129: aload #11
    //   131: invokevirtual getPaddingTop : ()I
    //   134: iload_3
    //   135: iadd
    //   136: ifle -> 145
    //   139: iconst_1
    //   140: istore #6
    //   142: goto -> 148
    //   145: iconst_0
    //   146: istore #6
    //   148: aload #9
    //   150: iload #6
    //   152: putfield e : Z
    //   155: iload #7
    //   157: istore #6
    //   159: iload #5
    //   161: ifeq -> 211
    //   164: aload #11
    //   166: invokevirtual getScrollY : ()I
    //   169: istore_3
    //   170: aload #11
    //   172: invokevirtual getMeasuredHeight : ()I
    //   175: iload_3
    //   176: iadd
    //   177: aload #11
    //   179: invokevirtual getPaddingBottom : ()I
    //   182: isub
    //   183: i2f
    //   184: fstore_1
    //   185: aload #11
    //   187: invokevirtual getContentHeight : ()I
    //   190: i2f
    //   191: fstore_2
    //   192: iload #7
    //   194: istore #6
    //   196: fload_1
    //   197: aload #11
    //   199: invokevirtual getScale : ()F
    //   202: fload_2
    //   203: fmul
    //   204: fcmpg
    //   205: ifge -> 211
    //   208: iconst_1
    //   209: istore #6
    //   211: aload #9
    //   213: iload #6
    //   215: putfield f : Z
    //   218: goto -> 232
    //   221: aload #9
    //   223: aload #10
    //   225: iload #6
    //   227: iload #5
    //   229: invokestatic a : (Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V
    //   232: aload #9
    //   234: invokevirtual invalidate : ()V
    //   237: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */