import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class wj1 extends TouchDelegate {
  public final View a;
  
  public final Rect b;
  
  public final Rect c;
  
  public final Rect d;
  
  public final int e;
  
  public boolean f;
  
  public wj1(View paramView, Rect paramRect1, Rect paramRect2) {
    super(paramRect1, paramView);
    int i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.e = i;
    Rect rect2 = new Rect();
    this.b = rect2;
    Rect rect3 = new Rect();
    this.d = rect3;
    Rect rect1 = new Rect();
    this.c = rect1;
    rect2.set(paramRect1);
    rect3.set(paramRect1);
    i = -i;
    rect3.inset(i, i);
    rect1.set(paramRect2);
    this.a = paramView;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getX : ()F
    //   4: f2i
    //   5: istore_3
    //   6: aload_1
    //   7: invokevirtual getY : ()F
    //   10: f2i
    //   11: istore #4
    //   13: aload_1
    //   14: invokevirtual getAction : ()I
    //   17: istore_2
    //   18: iconst_1
    //   19: istore #5
    //   21: iload_2
    //   22: ifeq -> 100
    //   25: iload_2
    //   26: iconst_1
    //   27: if_icmpeq -> 59
    //   30: iload_2
    //   31: iconst_2
    //   32: if_icmpeq -> 59
    //   35: iload_2
    //   36: iconst_3
    //   37: if_icmpeq -> 43
    //   40: goto -> 123
    //   43: aload_0
    //   44: getfield f : Z
    //   47: istore #5
    //   49: aload_0
    //   50: iconst_0
    //   51: putfield f : Z
    //   54: iconst_1
    //   55: istore_2
    //   56: goto -> 128
    //   59: aload_0
    //   60: getfield f : Z
    //   63: istore #6
    //   65: iload #6
    //   67: istore #5
    //   69: iload #6
    //   71: ifeq -> 54
    //   74: iload #6
    //   76: istore #5
    //   78: aload_0
    //   79: getfield d : Landroid/graphics/Rect;
    //   82: iload_3
    //   83: iload #4
    //   85: invokevirtual contains : (II)Z
    //   88: ifne -> 54
    //   91: iload #6
    //   93: istore #5
    //   95: iconst_0
    //   96: istore_2
    //   97: goto -> 128
    //   100: aload_0
    //   101: getfield b : Landroid/graphics/Rect;
    //   104: iload_3
    //   105: iload #4
    //   107: invokevirtual contains : (II)Z
    //   110: ifeq -> 123
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield f : Z
    //   118: iconst_1
    //   119: istore_2
    //   120: goto -> 128
    //   123: iconst_1
    //   124: istore_2
    //   125: iconst_0
    //   126: istore #5
    //   128: iload #5
    //   130: ifeq -> 211
    //   133: aload_0
    //   134: getfield c : Landroid/graphics/Rect;
    //   137: astore #7
    //   139: aload_0
    //   140: getfield a : Landroid/view/View;
    //   143: astore #8
    //   145: iload_2
    //   146: ifeq -> 183
    //   149: aload #7
    //   151: iload_3
    //   152: iload #4
    //   154: invokevirtual contains : (II)Z
    //   157: ifne -> 183
    //   160: aload_1
    //   161: aload #8
    //   163: invokevirtual getWidth : ()I
    //   166: iconst_2
    //   167: idiv
    //   168: i2f
    //   169: aload #8
    //   171: invokevirtual getHeight : ()I
    //   174: iconst_2
    //   175: idiv
    //   176: i2f
    //   177: invokevirtual setLocation : (FF)V
    //   180: goto -> 204
    //   183: aload_1
    //   184: iload_3
    //   185: aload #7
    //   187: getfield left : I
    //   190: isub
    //   191: i2f
    //   192: iload #4
    //   194: aload #7
    //   196: getfield top : I
    //   199: isub
    //   200: i2f
    //   201: invokevirtual setLocation : (FF)V
    //   204: aload #8
    //   206: aload_1
    //   207: invokevirtual dispatchTouchEvent : (Landroid/view/MotionEvent;)Z
    //   210: ireturn
    //   211: iconst_0
    //   212: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */