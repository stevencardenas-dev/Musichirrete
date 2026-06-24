import android.view.ViewGroup;
import java.util.ArrayList;

public final class gs1 {
  public final es1 a;
  
  public final ArrayList b;
  
  public fi0 c;
  
  public fi0 d;
  
  public int e;
  
  public gs1(ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield b : Ljava/util/ArrayList;
    //   15: getstatic fi0.e : Lfi0;
    //   18: astore_3
    //   19: aload_0
    //   20: aload_3
    //   21: putfield c : Lfi0;
    //   24: aload_0
    //   25: aload_3
    //   26: putfield d : Lfi0;
    //   29: aload_1
    //   30: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   33: astore_3
    //   34: aload_3
    //   35: instanceof android/graphics/drawable/ColorDrawable
    //   38: ifeq -> 52
    //   41: aload_3
    //   42: checkcast android/graphics/drawable/ColorDrawable
    //   45: invokevirtual getColor : ()I
    //   48: istore_2
    //   49: goto -> 54
    //   52: iconst_0
    //   53: istore_2
    //   54: aload_0
    //   55: iload_2
    //   56: putfield e : I
    //   59: new es1
    //   62: dup
    //   63: aload_0
    //   64: aload_1
    //   65: invokevirtual getContext : ()Landroid/content/Context;
    //   68: aload_1
    //   69: invokespecial <init> : (Lgs1;Landroid/content/Context;Landroid/view/ViewGroup;)V
    //   72: astore #4
    //   74: aload_0
    //   75: aload #4
    //   77: putfield a : Les1;
    //   80: aload #4
    //   82: bipush #8
    //   84: invokevirtual setVisibility : (I)V
    //   87: aload #4
    //   89: iconst_1
    //   90: invokevirtual setWillNotDraw : (Z)V
    //   93: new ds1
    //   96: dup
    //   97: iconst_0
    //   98: aload_0
    //   99: invokespecial <init> : (ILjava/lang/Object;)V
    //   102: astore #5
    //   104: getstatic v22.a : Ljava/util/WeakHashMap;
    //   107: astore_3
    //   108: aload #4
    //   110: aload #5
    //   112: invokestatic c : (Landroid/view/View;Ls31;)V
    //   115: aload #4
    //   117: new fs1
    //   120: dup
    //   121: aload_0
    //   122: invokespecial <init> : (Lgs1;)V
    //   125: invokestatic p : (Landroid/view/View;Lhd;)V
    //   128: aload_1
    //   129: invokevirtual getChildCount : ()I
    //   132: iconst_1
    //   133: isub
    //   134: istore_2
    //   135: iload_2
    //   136: iflt -> 165
    //   139: aload_1
    //   140: iload_2
    //   141: invokevirtual getChildAt : (I)Landroid/view/View;
    //   144: astore_3
    //   145: aload_3
    //   146: invokevirtual isAttachedToWindow : ()Z
    //   149: aload_1
    //   150: invokevirtual isAttachedToWindow : ()Z
    //   153: if_icmpeq -> 159
    //   156: goto -> 167
    //   159: iinc #2, -1
    //   162: goto -> 135
    //   165: aconst_null
    //   166: astore_3
    //   167: aload_3
    //   168: ifnonnull -> 179
    //   171: aload_1
    //   172: aload #4
    //   174: iconst_0
    //   175: invokevirtual addView : (Landroid/view/View;I)V
    //   178: return
    //   179: aload_3
    //   180: new za0
    //   183: dup
    //   184: aload_1
    //   185: aload #4
    //   187: invokespecial <init> : (Landroid/view/ViewGroup;Les1;)V
    //   190: invokevirtual addOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
    //   193: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */