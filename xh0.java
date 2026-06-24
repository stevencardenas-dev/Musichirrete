import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

public final class xh0 {
  public ColorStateList A;
  
  public Typeface B;
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final TimeInterpolator d;
  
  public final TimeInterpolator e;
  
  public final TimeInterpolator f;
  
  public final Context g;
  
  public final TextInputLayout h;
  
  public LinearLayout i;
  
  public int j;
  
  public FrameLayout k;
  
  public AnimatorSet l;
  
  public final float m;
  
  public int n;
  
  public int o;
  
  public CharSequence p;
  
  public boolean q;
  
  public AppCompatTextView r;
  
  public CharSequence s;
  
  public int t;
  
  public int u;
  
  public ColorStateList v;
  
  public CharSequence w;
  
  public boolean x;
  
  public AppCompatTextView y;
  
  public int z;
  
  public xh0(TextInputLayout paramTextInputLayout) {
    Context context = paramTextInputLayout.getContext();
    this.g = context;
    this.h = paramTextInputLayout;
    this.m = context.getResources().getDimensionPixelSize(2131165387);
    this.a = zo2.P(context, 2130969693, 217);
    this.b = zo2.P(context, 2130969689, 167);
    this.c = zo2.P(context, 2130969693, 167);
    this.d = zo2.Q(context, 2130969698, (TimeInterpolator)g5.d);
    LinearInterpolator linearInterpolator = g5.a;
    this.e = zo2.Q(context, 2130969698, (TimeInterpolator)linearInterpolator);
    this.f = zo2.Q(context, 2130969701, (TimeInterpolator)linearInterpolator);
  }
  
  public final void a(AppCompatTextView paramAppCompatTextView, int paramInt) {
    if (this.i == null && this.k == null) {
      Context context = this.g;
      LinearLayout linearLayout1 = new LinearLayout(context);
      this.i = linearLayout1;
      linearLayout1.setOrientation(0);
      LinearLayout linearLayout2 = this.i;
      TextInputLayout textInputLayout = this.h;
      textInputLayout.addView((View)linearLayout2, -1, -2);
      this.k = new FrameLayout(context);
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0F);
      this.i.addView((View)this.k, (ViewGroup.LayoutParams)layoutParams);
      if (textInputLayout.getEditText() != null)
        b(); 
    } 
    if (paramInt == 0 || paramInt == 1) {
      this.k.setVisibility(0);
      this.k.addView((View)paramAppCompatTextView);
    } else {
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
      this.i.addView((View)paramAppCompatTextView, (ViewGroup.LayoutParams)layoutParams);
    } 
    this.i.setVisibility(0);
    this.j++;
  }
  
  public final void b() {
    if (this.i != null) {
      TextInputLayout textInputLayout = this.h;
      if (textInputLayout.getEditText() != null) {
        EditText editText = textInputLayout.getEditText();
        Context context = this.g;
        boolean bool = wf2.I(context);
        LinearLayout linearLayout = this.i;
        int i = editText.getPaddingStart();
        if (bool)
          i = context.getResources().getDimensionPixelSize(2131166051); 
        int j = context.getResources().getDimensionPixelSize(2131166050);
        if (bool)
          j = context.getResources().getDimensionPixelSize(2131166052); 
        int k = editText.getPaddingEnd();
        if (bool)
          k = context.getResources().getDimensionPixelSize(2131166051); 
        linearLayout.setPaddingRelative(i, j, k, 0);
      } 
    } 
  }
  
  public final void c() {
    AnimatorSet animatorSet = this.l;
    if (animatorSet != null)
      animatorSet.cancel(); 
  }
  
  public final void d(ArrayList<ObjectAnimator> paramArrayList, boolean paramBoolean, AppCompatTextView paramAppCompatTextView, int paramInt1, int paramInt2, int paramInt3) {
    if (paramAppCompatTextView != null && paramBoolean && (paramInt1 == paramInt3 || paramInt1 == paramInt2)) {
      float f;
      boolean bool;
      long l;
      TimeInterpolator timeInterpolator;
      if (paramInt3 == paramInt1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        f = 1.0F;
      } else {
        f = 0.0F;
      } 
      ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramAppCompatTextView, View.ALPHA, new float[] { f });
      int i = this.c;
      if (bool) {
        l = this.b;
      } else {
        l = i;
      } 
      objectAnimator.setDuration(l);
      if (bool) {
        timeInterpolator = this.e;
      } else {
        timeInterpolator = this.f;
      } 
      objectAnimator.setInterpolator(timeInterpolator);
      if (paramInt1 == paramInt3 && paramInt2 != 0)
        objectAnimator.setStartDelay(i); 
      paramArrayList.add(objectAnimator);
      if (paramInt3 == paramInt1 && paramInt2 != 0) {
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(paramAppCompatTextView, View.TRANSLATION_Y, new float[] { -this.m, 0.0F });
        objectAnimator1.setDuration(this.a);
        objectAnimator1.setInterpolator(this.d);
        objectAnimator1.setStartDelay(i);
        paramArrayList.add(objectAnimator1);
      } 
    } 
  }
  
  public final TextView e(int paramInt) {
    return (TextView)((paramInt != 1) ? ((paramInt != 2) ? null : this.y) : this.r);
  }
  
  public final void f() {
    this.p = null;
    c();
    if (this.n == 1)
      if (this.x && !TextUtils.isEmpty(this.w)) {
        this.o = 2;
      } else {
        this.o = 0;
      }  
    i(this.n, this.o, h(this.r, ""));
  }
  
  public final void g(AppCompatTextView paramAppCompatTextView, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/widget/LinearLayout;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnonnull -> 12
    //   9: goto -> 73
    //   12: iload_2
    //   13: ifeq -> 21
    //   16: iload_2
    //   17: iconst_1
    //   18: if_icmpne -> 41
    //   21: aload_0
    //   22: getfield k : Landroid/widget/FrameLayout;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 41
    //   32: aload #4
    //   34: aload_1
    //   35: invokevirtual removeView : (Landroid/view/View;)V
    //   38: goto -> 46
    //   41: aload_3
    //   42: aload_1
    //   43: invokevirtual removeView : (Landroid/view/View;)V
    //   46: aload_0
    //   47: getfield j : I
    //   50: iconst_1
    //   51: isub
    //   52: istore_2
    //   53: aload_0
    //   54: iload_2
    //   55: putfield j : I
    //   58: aload_0
    //   59: getfield i : Landroid/widget/LinearLayout;
    //   62: astore_1
    //   63: iload_2
    //   64: ifne -> 73
    //   67: aload_1
    //   68: bipush #8
    //   70: invokevirtual setVisibility : (I)V
    //   73: return
  }
  
  public final boolean h(AppCompatTextView paramAppCompatTextView, CharSequence paramCharSequence) {
    TextInputLayout textInputLayout = this.h;
    return (textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.o != this.n || paramAppCompatTextView == null || !TextUtils.equals(paramAppCompatTextView.getText(), paramCharSequence)));
  }
  
  public final void i(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt1 == paramInt2)
      return; 
    if (paramBoolean) {
      AnimatorSet animatorSet = new AnimatorSet();
      this.l = animatorSet;
      ArrayList arrayList = new ArrayList();
      d(arrayList, this.x, this.y, 2, paramInt1, paramInt2);
      d(arrayList, this.q, this.r, 1, paramInt1, paramInt2);
      g92.U(animatorSet, arrayList);
      animatorSet.addListener((Animator.AnimatorListener)new vh0(this, paramInt2, e(paramInt1), paramInt1, e(paramInt2)));
      animatorSet.start();
    } else if (paramInt1 != paramInt2) {
      if (paramInt2 != 0) {
        TextView textView = e(paramInt2);
        if (textView != null) {
          textView.setVisibility(0);
          textView.setAlpha(1.0F);
        } 
      } 
      if (paramInt1 != 0) {
        TextView textView = e(paramInt1);
        if (textView != null) {
          textView.setVisibility(4);
          if (paramInt1 == 1)
            textView.setText(null); 
        } 
      } 
      this.n = paramInt2;
    } 
    TextInputLayout textInputLayout = this.h;
    textInputLayout.t();
    textInputLayout.w(paramBoolean, false);
    textInputLayout.z();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */