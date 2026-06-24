package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import dd1;
import do0;
import jc1;
import o91;
import zb0;

public class ListPreference extends DialogPreference {
  public final CharSequence[] U;
  
  public final CharSequence[] V;
  
  public String W;
  
  public String X;
  
  public boolean Y;
  
  public ListPreference(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, dd1.x(paramContext, 2130969064, 16842897), 0);
  }
  
  public ListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    TypedArray typedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.e, paramInt1, paramInt2);
    CharSequence[] arrayOfCharSequence2 = typedArray2.getTextArray(2);
    CharSequence[] arrayOfCharSequence1 = arrayOfCharSequence2;
    if (arrayOfCharSequence2 == null)
      arrayOfCharSequence1 = typedArray2.getTextArray(0); 
    this.U = arrayOfCharSequence1;
    arrayOfCharSequence2 = typedArray2.getTextArray(3);
    arrayOfCharSequence1 = arrayOfCharSequence2;
    if (arrayOfCharSequence2 == null)
      arrayOfCharSequence1 = typedArray2.getTextArray(1); 
    this.V = arrayOfCharSequence1;
    if (typedArray2.getBoolean(4, typedArray2.getBoolean(4, false))) {
      if (zb0.e == null)
        zb0.e = new zb0(3); 
      this.M = (o91)zb0.e;
      j();
    } 
    typedArray2.recycle();
    TypedArray typedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.g, paramInt1, paramInt2);
    String str2 = typedArray1.getString(33);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray1.getString(7); 
    this.X = str1;
    typedArray1.recycle();
  }
  
  public final void B(CharSequence paramCharSequence) {
    super.B(paramCharSequence);
    if (paramCharSequence == null) {
      this.X = null;
      return;
    } 
    this.X = paramCharSequence.toString();
  }
  
  public final int F(String paramString) {
    if (paramString != null) {
      CharSequence[] arrayOfCharSequence = this.V;
      if (arrayOfCharSequence != null)
        for (int i = arrayOfCharSequence.length - 1; i >= 0; i--) {
          if (TextUtils.equals(arrayOfCharSequence[i].toString(), paramString))
            return i; 
        }  
    } 
    return -1;
  }
  
  public final CharSequence G() {
    int i = F(this.W);
    if (i >= 0) {
      CharSequence[] arrayOfCharSequence = this.U;
      if (arrayOfCharSequence != null)
        return arrayOfCharSequence[i]; 
    } 
    return null;
  }
  
  public final void H(String paramString) {
    boolean bool = TextUtils.equals(this.W, paramString);
    if (!bool || !this.Y) {
      this.W = paramString;
      this.Y = true;
      y(paramString);
      if (!bool)
        j(); 
    } 
  }
  
  public final CharSequence g() {
    o91 o91 = this.M;
    if (o91 != null)
      return o91.j(this); 
    CharSequence charSequence1 = G();
    CharSequence charSequence2 = super.g();
    String str = this.X;
    if (str != null) {
      CharSequence charSequence = charSequence1;
      if (charSequence1 == null)
        charSequence = ""; 
      charSequence = String.format(str, new Object[] { charSequence });
      if (!TextUtils.equals(charSequence, charSequence2)) {
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return charSequence;
      } 
    } 
    return charSequence2;
  }
  
  public final Object q(TypedArray paramTypedArray, int paramInt) {
    return paramTypedArray.getString(paramInt);
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(do0.class)) {
      super.r(paramParcelable);
      return;
    } 
    do0 do0 = (do0)paramParcelable;
    super.r(do0.getSuperState());
    H(do0.b);
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    if (this.s)
      return (Parcelable)absSavedState; 
    do0 do0 = new do0();
    do0.b = this.W;
    return (Parcelable)do0;
  }
  
  public final void t(Object paramObject) {
    H(f((String)paramObject));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\ListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */