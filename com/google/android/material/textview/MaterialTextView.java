package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import g92;
import qv;
import wf2;
import zb1;

public class MaterialTextView extends AppCompatTextView {
  public MaterialTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 0), paramAttributeSet, paramInt);
    f(paramAttributeSet, paramInt, 0);
  }
  
  public MaterialTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt1, paramInt2), paramAttributeSet, paramInt1);
    f(paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void f(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    Context context = getContext();
    if (g92.a0(context, 2130970119, true)) {
      Resources.Theme theme = context.getTheme();
      int[] arrayOfInt = zb1.w;
      TypedArray typedArray = theme.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
      boolean bool = false;
      byte b = 0;
      int i = -1;
      while (b < 2 && i < 0) {
        (new int[2])[0] = 1;
        (new int[2])[1] = 2;
        i = wf2.w(context, typedArray, (new int[2])[b], -1);
        b++;
      } 
      typedArray.recycle();
      if (i == -1) {
        TypedArray typedArray1 = theme.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
        paramInt1 = typedArray1.getResourceId(0, -1);
        typedArray1.recycle();
        if (paramInt1 != -1) {
          TypedArray typedArray2 = theme.obtainStyledAttributes(paramInt1, zb1.v);
          Context context1 = getContext();
          paramInt2 = -1;
          for (paramInt1 = bool; paramInt1 < 2 && paramInt2 < 0; paramInt1++) {
            (new int[2])[0] = 2;
            (new int[2])[1] = 4;
            paramInt2 = wf2.w(context1, typedArray2, (new int[2])[paramInt1], -1);
          } 
          typedArray2.recycle();
          if (paramInt2 >= 0)
            setLineHeight(paramInt2); 
        } 
      } 
    } 
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    if (g92.a0(paramContext, 2130970119, true)) {
      TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramInt, zb1.v);
      Context context = getContext();
      paramInt = 0;
      int i = -1;
      while (paramInt < 2 && i < 0) {
        (new int[2])[0] = 2;
        (new int[2])[1] = 4;
        i = wf2.w(context, typedArray, (new int[2])[paramInt], -1);
        paramInt++;
      } 
      typedArray.recycle();
      if (i >= 0)
        setLineHeight(i); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\textview\MaterialTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */