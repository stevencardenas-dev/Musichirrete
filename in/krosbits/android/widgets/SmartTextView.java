package in.krosbits.android.widgets;

import ag0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import cc1;
import m92;
import qi0;

public class SmartTextView extends TextView {
  public boolean b;
  
  public int c;
  
  public Rect e;
  
  public boolean f;
  
  public SmartTextView(Context paramContext) {
    super(paramContext);
    g(paramContext, null);
  }
  
  public SmartTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      g(paramContext, paramAttributeSet); 
  }
  
  public SmartTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    if (!isInEditMode())
      g(paramContext, paramAttributeSet); 
  }
  
  public final void g(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.h);
    int i = typedArray.getInt(6, -1);
    setTextTintIndex(i);
    int j = (int)getTextSize();
    this.e = new Rect(0, 0, j, j);
    boolean bool2 = typedArray.getBoolean(5, false);
    boolean bool1 = typedArray.getBoolean(7, false);
    this.b = typedArray.getBoolean(2, false);
    this.f = typedArray.getBoolean(1, false);
    j = typedArray.getInt(0, -1);
    if (j > 0) {
      j = (int)(getResources().getDimension(2131165390) * j);
      this.e = new Rect(0, 0, j, j);
      this.f = true;
    } 
    if (this.b)
      this.c = m92.h[typedArray.getInt(3, i)]; 
    typedArray.recycle();
    if (this.b || this.e != null) {
      AttributeSet attributeSet;
      Drawable[] arrayOfDrawable = getCompoundDrawables();
      if (arrayOfDrawable != null) {
        Drawable drawable1 = arrayOfDrawable[0];
        Drawable drawable2 = arrayOfDrawable[1];
        Drawable drawable4 = arrayOfDrawable[2];
        Drawable drawable3 = arrayOfDrawable[3];
      } else {
        typedArray = null;
        arrayOfDrawable = null;
        paramAttributeSet = null;
        attributeSet = paramAttributeSet;
      } 
      setCompoundDrawables((Drawable)typedArray, (Drawable)paramAttributeSet, (Drawable)attributeSet, (Drawable)arrayOfDrawable);
    } 
    if (bool1 && !bool2) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getText().toString());
      stringBuilder.append("</u>");
      setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
    } 
    if (bool2) {
      setText((CharSequence)Html.fromHtml(getText().toString()));
      setMovementMethod((MovementMethod)new qi0());
    } 
  }
  
  public void setCompoundDrawableColor(int paramInt) {
    this.c = paramInt;
    Drawable[] arrayOfDrawable = getCompoundDrawables();
    setCompoundDrawables(arrayOfDrawable[0], arrayOfDrawable[1], arrayOfDrawable[2], arrayOfDrawable[3]);
  }
  
  public void setCompoundDrawableColorIndex(int paramInt) {
    setCompoundDrawableColor(m92.h[paramInt]);
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    Drawable drawable = paramDrawable1;
    if (paramDrawable1 != null) {
      paramDrawable1 = paramDrawable1.mutate();
      if (this.f)
        paramDrawable1.setBounds(this.e); 
      drawable = paramDrawable1;
      if (this.b) {
        ag0.C0(this.c, paramDrawable1);
        drawable = paramDrawable1;
      } 
    } 
    paramDrawable1 = paramDrawable2;
    if (paramDrawable2 != null) {
      paramDrawable2 = paramDrawable2.mutate();
      if (this.f)
        paramDrawable2.setBounds(this.e); 
      paramDrawable1 = paramDrawable2;
      if (this.b) {
        ag0.C0(this.c, paramDrawable2);
        paramDrawable1 = paramDrawable2;
      } 
    } 
    paramDrawable2 = paramDrawable3;
    if (paramDrawable3 != null) {
      paramDrawable3 = paramDrawable3.mutate();
      if (this.f)
        paramDrawable3.setBounds(this.e); 
      paramDrawable2 = paramDrawable3;
      if (this.b) {
        ag0.C0(this.c, paramDrawable3);
        paramDrawable2 = paramDrawable3;
      } 
    } 
    paramDrawable3 = paramDrawable4;
    if (paramDrawable4 != null) {
      paramDrawable4 = paramDrawable4.mutate();
      if (this.f)
        paramDrawable4.setBounds(this.e); 
      paramDrawable3 = paramDrawable4;
      if (this.b) {
        ag0.C0(this.c, paramDrawable4);
        paramDrawable3 = paramDrawable4;
      } 
    } 
    super.setCompoundDrawables(drawable, paramDrawable1, paramDrawable2, paramDrawable3);
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    if (this.b) {
      if (paramDrawable1 != null) {
        if (this.f)
          paramDrawable1.setBounds(this.e); 
        if (this.b)
          ag0.C0(this.c, paramDrawable1); 
      } 
      if (paramDrawable2 != null) {
        if (this.f)
          paramDrawable2.setBounds(this.e); 
        if (this.b)
          ag0.C0(this.c, paramDrawable2); 
      } 
      if (paramDrawable3 != null) {
        if (this.f)
          paramDrawable3.setBounds(this.e); 
        if (this.b)
          ag0.C0(this.c, paramDrawable3); 
      } 
      if (paramDrawable4 != null) {
        if (this.f)
          paramDrawable4.setBounds(this.e); 
        if (this.b)
          ag0.C0(this.c, paramDrawable4); 
      } 
    } 
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public void setTextTintIndex(int paramInt) {
    if (paramInt >= 0)
      setTextColor(m92.h[paramInt]); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\SmartTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */