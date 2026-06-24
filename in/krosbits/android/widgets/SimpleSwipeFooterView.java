package in.krosbits.android.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import cc1;
import m92;
import rr1;
import wr1;

public class SimpleSwipeFooterView extends SmartTextView implements rr1, wr1 {
  public String g;
  
  public String h;
  
  public int i;
  
  public int j;
  
  public SimpleSwipeFooterView(Context paramContext) {
    super(paramContext);
    h(paramContext, null);
  }
  
  public SimpleSwipeFooterView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    h(paramContext, paramAttributeSet);
  }
  
  public SimpleSwipeFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    h(paramContext, paramAttributeSet);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void b(int paramInt) {
    if (paramInt != 2 && paramInt != 3) {
      setTextColor(this.j);
      setTypeface(Typeface.DEFAULT);
      return;
    } 
    setTextColor(this.i);
    setTypeface(Typeface.DEFAULT_BOLD);
  }
  
  public final void c() {}
  
  public final void d() {}
  
  public final void e() {}
  
  public final void f() {}
  
  public final void h(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.e);
    this.g = typedArray.getString(3);
    this.h = typedArray.getString(4);
    typedArray.getString(1);
    String str = this.g;
    if (str != null && this.h == null)
      this.h = str; 
    int[] arrayOfInt = m92.h;
    this.i = typedArray.getColor(0, arrayOfInt[5]);
    this.j = typedArray.getColor(2, arrayOfInt[7]);
    typedArray.recycle();
    setText(this.g);
  }
  
  public final void onComplete() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\SimpleSwipeFooterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */