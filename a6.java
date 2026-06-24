import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

public final class a6 {
  public ColorStateList a;
  
  public PorterDuff.Mode b;
  
  public boolean c;
  
  public boolean d;
  
  public boolean e;
  
  public final TextView f;
  
  public void a() {
    CompoundButton compoundButton = (CompoundButton)this.f;
    Drawable drawable = compoundButton.getButtonDrawable();
    if (drawable != null && (this.c || this.d)) {
      drawable = drawable.mutate();
      if (this.c)
        drawable.setTintList(this.a); 
      if (this.d)
        drawable.setTintMode(this.b); 
      if (drawable.isStateful())
        drawable.setState(compoundButton.getDrawableState()); 
      compoundButton.setButtonDrawable(drawable);
    } 
  }
  
  public void b() {
    z5 z5 = (z5)this.f;
    Drawable drawable = z5.getCheckMarkDrawable();
    if (drawable != null && (this.c || this.d)) {
      drawable = drawable.mutate();
      if (this.c)
        drawable.setTintList(this.a); 
      if (this.d)
        drawable.setTintMode(this.b); 
      if (drawable.isStateful())
        drawable.setState(z5.getDrawableState()); 
      z5.setCheckMarkDrawable(drawable);
    } 
  }
  
  public void c(AttributeSet paramAttributeSet, int paramInt) {
    CompoundButton compoundButton = (CompoundButton)this.f;
    Context context = compoundButton.getContext();
    int[] arrayOfInt = nc1.m;
    zv0 zv0 = zv0.y(paramInt, 0, context, paramAttributeSet, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    v22.m((View)compoundButton, compoundButton.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    try {
      if (typedArray.hasValue(1)) {
        paramInt = typedArray.getResourceId(1, 0);
        if (paramInt != 0)
          try {
            compoundButton.setButtonDrawable(ws2.I(compoundButton.getContext(), paramInt));
            if (typedArray.hasValue(2))
              compoundButton.setButtonTintList(zv0.n(2)); 
            if (typedArray.hasValue(3))
              compoundButton.setButtonTintMode(l10.c(typedArray.getInt(3, -1), null)); 
            zv0.z();
            return;
          } catch (android.content.res.Resources.NotFoundException notFoundException) {} 
      } 
    } finally {}
    if (typedArray.hasValue(0)) {
      paramInt = typedArray.getResourceId(0, 0);
      if (paramInt != 0)
        compoundButton.setButtonDrawable(ws2.I(compoundButton.getContext(), paramInt)); 
    } 
    if (typedArray.hasValue(2))
      compoundButton.setButtonTintList(zv0.n(2)); 
    if (typedArray.hasValue(3))
      compoundButton.setButtonTintMode(l10.c(typedArray.getInt(3, -1), null)); 
    zv0.z();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */