package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import eq;
import er;
import fc1;
import yb;

public class Barrier extends eq {
  public int j;
  
  public int k;
  
  public yb l;
  
  public Barrier(Context paramContext) {
    super(paramContext);
    setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setVisibility(8);
  }
  
  public final void g(AttributeSet paramAttributeSet) {
    super.g(paramAttributeSet);
    er er = new er();
    ((yb)er).q0 = new er[4];
    ((yb)er).r0 = 0;
    ((yb)er).s0 = 0;
    ((yb)er).t0 = true;
    ((yb)er).u0 = 0;
    ((yb)er).v0 = false;
    this.l = (yb)er;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, fc1.b);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == 26) {
          setType(typedArray.getInt(j, 0));
        } else if (j == 25) {
          this.l.t0 = typedArray.getBoolean(j, true);
        } else if (j == 27) {
          j = typedArray.getDimensionPixelSize(j, 0);
          this.l.u0 = j;
        } 
      } 
      typedArray.recycle();
    } 
    this.f = this.l;
    j();
  }
  
  public boolean getAllowsGoneWidget() {
    return this.l.t0;
  }
  
  public int getMargin() {
    return this.l.u0;
  }
  
  public int getType() {
    return this.j;
  }
  
  public final void h(er paramer, boolean paramBoolean) {
    int i = this.j;
    this.k = i;
    if (paramBoolean) {
      if (i == 5) {
        this.k = 1;
      } else if (i == 6) {
        this.k = 0;
      } 
    } else if (i == 5) {
      this.k = 0;
    } else if (i == 6) {
      this.k = 1;
    } 
    if (paramer instanceof yb)
      ((yb)paramer).s0 = this.k; 
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean) {
    this.l.t0 = paramBoolean;
  }
  
  public void setDpMargin(int paramInt) {
    float f = (getResources().getDisplayMetrics()).density;
    paramInt = (int)(paramInt * f + 0.5F);
    this.l.u0 = paramInt;
  }
  
  public void setMargin(int paramInt) {
    this.l.u0 = paramInt;
  }
  
  public void setType(int paramInt) {
    this.j = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\constraintlayout\widget\Barrier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */