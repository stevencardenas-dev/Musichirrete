import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public final class v80 {
  public static final int A;
  
  public static final int B;
  
  public static final int C;
  
  public static final int[] D;
  
  public static final int[] E;
  
  public static final int[] F;
  
  public static final int[] G;
  
  public static final int[] H;
  
  public static final int[] I;
  
  public static final o70 y = g5.c;
  
  public static final int z = 2130969683;
  
  public vl1 a;
  
  public u80 b;
  
  public RippleDrawable c;
  
  public ug d;
  
  public RippleDrawable e;
  
  public boolean f;
  
  public boolean g = true;
  
  public float h;
  
  public float i;
  
  public float j;
  
  public int k;
  
  public StateListAnimator l;
  
  public Animator m;
  
  public fy0 n;
  
  public fy0 o;
  
  public float p = 1.0F;
  
  public int q;
  
  public int r = 0;
  
  public final FloatingActionButton s;
  
  public final gh1 t;
  
  public final Rect u = new Rect();
  
  public final RectF v = new RectF();
  
  public final RectF w = new RectF();
  
  public final Matrix x = new Matrix();
  
  static {
    A = 2130969699;
    B = 2130969686;
    C = 2130969697;
    D = new int[] { 16842919, 16842910 };
    E = new int[] { 16843623, 16842908, 16842910 };
    F = new int[] { 16842908, 16842910 };
    G = new int[] { 16843623, 16842910 };
    H = new int[] { 16842910 };
    I = new int[0];
  }
  
  public v80(FloatingActionButton paramFloatingActionButton, gh1 paramgh1) {
    this.s = paramFloatingActionButton;
    this.t = paramgh1;
  }
  
  public final void a(float paramFloat, Matrix paramMatrix) {
    paramMatrix.reset();
    Drawable drawable = this.s.getDrawable();
    if (drawable != null && this.q != 0) {
      float f1 = drawable.getIntrinsicWidth();
      float f2 = drawable.getIntrinsicHeight();
      RectF rectF1 = this.v;
      rectF1.set(0.0F, 0.0F, f1, f2);
      f1 = this.q;
      RectF rectF2 = this.w;
      rectF2.set(0.0F, 0.0F, f1, f1);
      paramMatrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.CENTER);
      f1 = this.q / 2.0F;
      paramMatrix.postScale(paramFloat, paramFloat, f1, f1);
    } 
  }
  
  public final AnimatorSet b(fy0 paramfy0, float paramFloat1, float paramFloat2, float paramFloat3) {
    ArrayList<ObjectAnimator> arrayList = new ArrayList();
    Property property = View.ALPHA;
    FloatingActionButton floatingActionButton = this.s;
    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(floatingActionButton, property, new float[] { paramFloat1 });
    paramfy0.c("opacity").a(objectAnimator2);
    arrayList.add(objectAnimator2);
    objectAnimator2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, new float[] { paramFloat2 });
    paramfy0.c("scale").a(objectAnimator2);
    int i = Build.VERSION.SDK_INT;
    if (i == 26)
      objectAnimator2.setEvaluator(new t80()); 
    arrayList.add(objectAnimator2);
    objectAnimator2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, new float[] { paramFloat2 });
    paramfy0.c("scale").a(objectAnimator2);
    if (i == 26)
      objectAnimator2.setEvaluator(new t80()); 
    arrayList.add(objectAnimator2);
    Matrix matrix = this.x;
    a(paramFloat3, matrix);
    ObjectAnimator objectAnimator1 = ObjectAnimator.ofObject(floatingActionButton, new ih0(), new s80(this), (Object[])new Matrix[] { new Matrix(matrix) });
    paramfy0.c("iconScale").a(objectAnimator1);
    arrayList.add(objectAnimator1);
    AnimatorSet animatorSet = new AnimatorSet();
    g92.U(animatorSet, arrayList);
    return animatorSet;
  }
  
  public final AnimatorSet c(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2) {
    AnimatorSet animatorSet = new AnimatorSet();
    ArrayList<ValueAnimator> arrayList = new ArrayList();
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    FloatingActionButton floatingActionButton = this.s;
    valueAnimator.addUpdateListener(new q80(this, floatingActionButton.getAlpha(), paramFloat1, floatingActionButton.getScaleX(), paramFloat2, floatingActionButton.getScaleY(), this.p, paramFloat3, new Matrix(this.x)));
    arrayList.add(valueAnimator);
    g92.U(animatorSet, arrayList);
    animatorSet.setDuration(zo2.P(floatingActionButton.getContext(), paramInt1, floatingActionButton.getContext().getResources().getInteger(2131361835)));
    animatorSet.setInterpolator(zo2.Q(floatingActionButton.getContext(), paramInt2, (TimeInterpolator)g5.b));
    return animatorSet;
  }
  
  public final AnimatorSet d(float paramFloat1, float paramFloat2) {
    AnimatorSet animatorSet = new AnimatorSet();
    FloatingActionButton floatingActionButton = this.s;
    animatorSet.play((Animator)ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
    animatorSet.setInterpolator((TimeInterpolator)y);
    return animatorSet;
  }
  
  public final void e(float paramFloat1, float paramFloat2, float paramFloat3) {
    FloatingActionButton floatingActionButton = this.s;
    if (floatingActionButton.getStateListAnimator() == this.l) {
      StateListAnimator stateListAnimator = new StateListAnimator();
      stateListAnimator.addState(D, (Animator)d(paramFloat1, paramFloat3));
      stateListAnimator.addState(E, (Animator)d(paramFloat1, paramFloat2));
      stateListAnimator.addState(F, (Animator)d(paramFloat1, paramFloat2));
      stateListAnimator.addState(G, (Animator)d(paramFloat1, paramFloat2));
      AnimatorSet animatorSet = new AnimatorSet();
      ArrayList<ObjectAnimator> arrayList = new ArrayList();
      arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[] { paramFloat1 }).setDuration(0L));
      if (Build.VERSION.SDK_INT <= 24)
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[] { floatingActionButton.getTranslationZ() }).setDuration(100L)); 
      arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L));
      animatorSet.playSequentially(arrayList.<Animator>toArray(new Animator[0]));
      animatorSet.setInterpolator((TimeInterpolator)y);
      stateListAnimator.addState(H, (Animator)animatorSet);
      stateListAnimator.addState(I, (Animator)d(0.0F, 0.0F));
      this.l = stateListAnimator;
      floatingActionButton.setStateListAnimator(stateListAnimator);
    } 
    if (((FloatingActionButton)this.t.c).m || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
      h();
      return;
    } 
  }
  
  public final void f() {}
  
  public final void g(vl1 paramvl1) {
    this.a = paramvl1;
    u80 u801 = this.b;
    if (u801 != null)
      u801.setShapeAppearanceModel(paramvl1); 
    RippleDrawable rippleDrawable = this.c;
    if (rippleDrawable instanceof gm1)
      ((gm1)rippleDrawable).setShapeAppearanceModel(paramvl1); 
    ug ug1 = this.d;
    if (ug1 != null) {
      ug1.o = paramvl1;
      ug1.invalidateSelf();
    } 
  }
  
  public final void h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield t : Lgh1;
    //   4: astore #10
    //   6: aload #10
    //   8: getfield c : Ljava/lang/Object;
    //   11: checkcast com/google/android/material/floatingactionbutton/FloatingActionButton
    //   14: astore #11
    //   16: aload #10
    //   18: getfield c : Ljava/lang/Object;
    //   21: checkcast com/google/android/material/floatingactionbutton/FloatingActionButton
    //   24: astore #9
    //   26: aload #11
    //   28: getfield m : Z
    //   31: istore #8
    //   33: aload_0
    //   34: getfield f : Z
    //   37: istore #7
    //   39: aload_0
    //   40: getfield u : Landroid/graphics/Rect;
    //   43: astore #11
    //   45: aload_0
    //   46: getfield s : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   49: astore #12
    //   51: iconst_0
    //   52: istore_2
    //   53: iload #8
    //   55: ifeq -> 141
    //   58: iload #7
    //   60: ifeq -> 80
    //   63: aload_0
    //   64: getfield k : I
    //   67: aload #12
    //   69: invokevirtual getSizeDimension : ()I
    //   72: isub
    //   73: iconst_2
    //   74: idiv
    //   75: iconst_0
    //   76: invokestatic max : (II)I
    //   79: istore_2
    //   80: aload_0
    //   81: getfield g : Z
    //   84: ifeq -> 101
    //   87: aload #12
    //   89: invokevirtual getElevation : ()F
    //   92: aload_0
    //   93: getfield j : F
    //   96: fadd
    //   97: fstore_1
    //   98: goto -> 103
    //   101: fconst_0
    //   102: fstore_1
    //   103: iload_2
    //   104: fload_1
    //   105: f2d
    //   106: invokestatic ceil : (D)D
    //   109: d2i
    //   110: invokestatic max : (II)I
    //   113: istore_3
    //   114: iload_2
    //   115: fload_1
    //   116: ldc_w 1.5
    //   119: fmul
    //   120: f2d
    //   121: invokestatic ceil : (D)D
    //   124: d2i
    //   125: invokestatic max : (II)I
    //   128: istore_2
    //   129: aload #11
    //   131: iload_3
    //   132: iload_2
    //   133: iload_3
    //   134: iload_2
    //   135: invokevirtual set : (IIII)V
    //   138: goto -> 193
    //   141: iload #7
    //   143: ifeq -> 184
    //   146: aload #12
    //   148: invokevirtual getSizeDimension : ()I
    //   151: istore_2
    //   152: aload_0
    //   153: getfield k : I
    //   156: istore_3
    //   157: iload_2
    //   158: iload_3
    //   159: if_icmpge -> 184
    //   162: iload_3
    //   163: aload #12
    //   165: invokevirtual getSizeDimension : ()I
    //   168: isub
    //   169: iconst_2
    //   170: idiv
    //   171: istore_2
    //   172: aload #11
    //   174: iload_2
    //   175: iload_2
    //   176: iload_2
    //   177: iload_2
    //   178: invokevirtual set : (IIII)V
    //   181: goto -> 193
    //   184: aload #11
    //   186: iconst_0
    //   187: iconst_0
    //   188: iconst_0
    //   189: iconst_0
    //   190: invokevirtual set : (IIII)V
    //   193: aload_0
    //   194: getfield e : Landroid/graphics/drawable/RippleDrawable;
    //   197: astore #13
    //   199: getstatic com/android/billingclient/api/wH/DJqHMztxflt.UpIuqGJuGicoiT : Ljava/lang/String;
    //   202: aload #13
    //   204: invokestatic c : (Ljava/lang/String;Ljava/lang/Object;)V
    //   207: aload #10
    //   209: getfield c : Ljava/lang/Object;
    //   212: checkcast com/google/android/material/floatingactionbutton/FloatingActionButton
    //   215: getfield m : Z
    //   218: ifne -> 264
    //   221: aload_0
    //   222: getfield f : Z
    //   225: ifeq -> 243
    //   228: aload #12
    //   230: invokevirtual getSizeDimension : ()I
    //   233: aload_0
    //   234: getfield k : I
    //   237: if_icmpge -> 243
    //   240: goto -> 264
    //   243: aload_0
    //   244: getfield e : Landroid/graphics/drawable/RippleDrawable;
    //   247: astore #10
    //   249: aload #10
    //   251: ifnull -> 300
    //   254: aload #9
    //   256: aload #10
    //   258: invokestatic b : (Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V
    //   261: goto -> 300
    //   264: aload #9
    //   266: new android/graphics/drawable/InsetDrawable
    //   269: dup
    //   270: aload_0
    //   271: getfield e : Landroid/graphics/drawable/RippleDrawable;
    //   274: aload #11
    //   276: getfield left : I
    //   279: aload #11
    //   281: getfield top : I
    //   284: aload #11
    //   286: getfield right : I
    //   289: aload #11
    //   291: getfield bottom : I
    //   294: invokespecial <init> : (Landroid/graphics/drawable/Drawable;IIII)V
    //   297: invokestatic b : (Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V
    //   300: aload #11
    //   302: getfield left : I
    //   305: istore_2
    //   306: aload #11
    //   308: getfield top : I
    //   311: istore #5
    //   313: aload #11
    //   315: getfield right : I
    //   318: istore #4
    //   320: aload #11
    //   322: getfield bottom : I
    //   325: istore_3
    //   326: aload #9
    //   328: getfield n : Landroid/graphics/Rect;
    //   331: iload_2
    //   332: iload #5
    //   334: iload #4
    //   336: iload_3
    //   337: invokevirtual set : (IIII)V
    //   340: aload #9
    //   342: getfield k : I
    //   345: istore #6
    //   347: aload #9
    //   349: iload_2
    //   350: iload #6
    //   352: iadd
    //   353: iload #5
    //   355: iload #6
    //   357: iadd
    //   358: iload #4
    //   360: iload #6
    //   362: iadd
    //   363: iload_3
    //   364: iload #6
    //   366: iadd
    //   367: invokevirtual setPadding : (IIII)V
    //   370: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */