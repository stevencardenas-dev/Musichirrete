package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import l0;
import nc1;
import tp;
import y32;

public final class ViewStubCompat extends View {
  public int b = 0;
  
  public int c;
  
  public WeakReference e;
  
  public LayoutInflater f;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, nc1.B, paramInt, 0);
    this.c = typedArray.getResourceId(2, -1);
    this.b = typedArray.getResourceId(1, 0);
    setId(typedArray.getResourceId(0, -1));
    typedArray.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final View a() {
    ViewParent viewParent = getParent();
    if (viewParent instanceof ViewGroup) {
      if (this.b != 0) {
        ViewGroup viewGroup = (ViewGroup)viewParent;
        LayoutInflater layoutInflater = this.f;
        if (layoutInflater == null)
          layoutInflater = LayoutInflater.from(getContext()); 
        View view = layoutInflater.inflate(this.b, viewGroup, false);
        int i = this.c;
        if (i != -1)
          view.setId(i); 
        i = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
          viewGroup.addView(view, i, layoutParams);
        } else {
          viewGroup.addView(view, i);
        } 
        this.e = new WeakReference<View>(view);
        return view;
      } 
      l0.l("ViewStub must have a valid layoutResource");
      return null;
    } 
    tp.f("ViewStub must have a non-null ViewGroup viewParent");
    return null;
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public int getInflatedId() {
    return this.c;
  }
  
  public LayoutInflater getLayoutInflater() {
    return this.f;
  }
  
  public int getLayoutResource() {
    return this.b;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt) {
    this.c = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater) {
    this.f = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt) {
    this.b = paramInt;
  }
  
  public void setOnInflateListener(y32 paramy32) {}
  
  public void setVisibility(int paramInt) {
    WeakReference<View> weakReference = this.e;
    if (weakReference != null) {
      View view = weakReference.get();
      if (view != null) {
        view.setVisibility(paramInt);
        return;
      } 
      tp.f("setVisibility called on un-referenced view");
      return;
    } 
    super.setVisibility(paramInt);
    if (paramInt == 0 || paramInt == 4) {
      a();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ViewStubCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */