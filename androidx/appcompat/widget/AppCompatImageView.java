package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import d7;
import ku1;
import up;
import v2;

public class AppCompatImageView extends ImageView {
  public final v2 b;
  
  public final d7 c;
  
  public boolean e = false;
  
  public AppCompatImageView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, paramInt);
    d7 d71 = new d7(this);
    this.c = d71;
    d71.e(paramAttributeSet, paramInt);
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    v2 v21 = this.b;
    if (v21 != null)
      v21.a(); 
    d7 d71 = this.c;
    if (d71 != null)
      d71.a(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.i() : null;
  }
  
  public ColorStateList getSupportImageTintList() {
    d7 d71 = this.c;
    if (d71 != null) {
      up up = (up)d71.e;
      if (up != null)
        return (ColorStateList)up.c; 
    } 
    return null;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    d7 d71 = this.c;
    if (d71 != null) {
      up up = (up)d71.e;
      if (up != null)
        return (PorterDuff.Mode)up.d; 
    } 
    return null;
  }
  
  public final boolean hasOverlappingRendering() {
    return (!(((ImageView)this.c.c).getBackground() instanceof android.graphics.drawable.RippleDrawable) && super.hasOverlappingRendering());
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    v2 v21 = this.b;
    if (v21 != null)
      v21.m(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    v2 v21 = this.b;
    if (v21 != null)
      v21.n(paramInt); 
  }
  
  public void setImageBitmap(Bitmap paramBitmap) {
    super.setImageBitmap(paramBitmap);
    d7 d71 = this.c;
    if (d71 != null)
      d71.a(); 
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    d7 d71 = this.c;
    if (d71 != null && paramDrawable != null && !this.e)
      d71.b = paramDrawable.getLevel(); 
    super.setImageDrawable(paramDrawable);
    if (d71 != null) {
      d71.a();
      if (!this.e) {
        ImageView imageView = (ImageView)d71.c;
        if (imageView.getDrawable() != null)
          imageView.getDrawable().setLevel(d71.b); 
      } 
    } 
  }
  
  public void setImageLevel(int paramInt) {
    super.setImageLevel(paramInt);
    this.e = true;
  }
  
  public void setImageResource(int paramInt) {
    d7 d71 = this.c;
    if (d71 != null)
      d71.j(paramInt); 
  }
  
  public void setImageURI(Uri paramUri) {
    super.setImageURI(paramUri);
    d7 d71 = this.c;
    if (d71 != null)
      d71.a(); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.s(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.t(paramMode); 
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    d7 d71 = this.c;
    if (d71 != null) {
      if ((up)d71.e == null)
        d71.e = new Object(); 
      up up = (up)d71.e;
      up.c = paramColorStateList;
      up.b = true;
      d71.a();
    } 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    d7 d71 = this.c;
    if (d71 != null) {
      if ((up)d71.e == null)
        d71.e = new Object(); 
      up up = (up)d71.e;
      up.d = paramMode;
      up.a = true;
      d71.a();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */