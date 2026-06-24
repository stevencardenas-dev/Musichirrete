package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import ip2;
import jc1;
import k30;
import o91;

public class EditTextPreference extends DialogPreference {
  public String U;
  
  public EditTextPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i, 0);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.d, i, 0);
    if (typedArray.getBoolean(0, typedArray.getBoolean(0, false))) {
      if (ip2.v == null)
        ip2.v = (ip2)new Object(); 
      this.M = (o91)ip2.v;
      j();
    } 
    typedArray.recycle();
  }
  
  public final boolean D() {
    return (TextUtils.isEmpty(this.U) || super.D());
  }
  
  public final void F(String paramString) {
    boolean bool2 = D();
    this.U = paramString;
    y(paramString);
    boolean bool1 = D();
    if (bool1 != bool2)
      k(bool1); 
    j();
  }
  
  public final Object q(TypedArray paramTypedArray, int paramInt) {
    return paramTypedArray.getString(paramInt);
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(k30.class)) {
      super.r(paramParcelable);
      return;
    } 
    k30 k30 = (k30)paramParcelable;
    super.r(k30.getSuperState());
    F(k30.b);
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    if (this.s)
      return (Parcelable)absSavedState; 
    k30 k30 = new k30();
    k30.b = this.U;
    return (Parcelable)k30;
  }
  
  public final void t(Object paramObject) {
    F(f((String)paramObject));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\EditTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */