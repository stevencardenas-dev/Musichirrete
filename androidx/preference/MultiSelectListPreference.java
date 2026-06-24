package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;
import jc1;
import ny0;

public class MultiSelectListPreference extends DialogPreference {
  public final CharSequence[] U;
  
  public final CharSequence[] V;
  
  public final HashSet W = new HashSet();
  
  public MultiSelectListPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i, 0);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.f, i, 0);
    CharSequence[] arrayOfCharSequence2 = typedArray.getTextArray(2);
    CharSequence[] arrayOfCharSequence1 = arrayOfCharSequence2;
    if (arrayOfCharSequence2 == null)
      arrayOfCharSequence1 = typedArray.getTextArray(0); 
    this.U = arrayOfCharSequence1;
    arrayOfCharSequence2 = typedArray.getTextArray(3);
    arrayOfCharSequence1 = arrayOfCharSequence2;
    if (arrayOfCharSequence2 == null)
      arrayOfCharSequence1 = typedArray.getTextArray(1); 
    this.V = arrayOfCharSequence1;
    typedArray.recycle();
  }
  
  public final void F(Set paramSet) {
    HashSet hashSet = this.W;
    hashSet.clear();
    hashSet.addAll(paramSet);
    if (E()) {
      Set set;
      boolean bool = E();
      String str = this.m;
      hashSet = null;
      if (bool)
        set = this.c.b().getStringSet(str, null); 
      if (!paramSet.equals(set)) {
        SharedPreferences.Editor editor = this.c.a();
        editor.putStringSet(str, paramSet);
        if (!this.c.e)
          editor.apply(); 
      } 
    } 
    j();
  }
  
  public final Object q(TypedArray paramTypedArray, int paramInt) {
    CharSequence[] arrayOfCharSequence = paramTypedArray.getTextArray(paramInt);
    HashSet<String> hashSet = new HashSet();
    int i = arrayOfCharSequence.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      hashSet.add(arrayOfCharSequence[paramInt].toString()); 
    return hashSet;
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(ny0.class)) {
      super.r(paramParcelable);
      return;
    } 
    ny0 ny0 = (ny0)paramParcelable;
    super.r(ny0.getSuperState());
    F(ny0.b);
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    if (this.s)
      return (Parcelable)absSavedState; 
    ny0 ny0 = new ny0();
    ny0.b = this.W;
    return (Parcelable)ny0;
  }
  
  public final void t(Object paramObject) {
    paramObject = paramObject;
    if (E())
      paramObject = this.c.b().getStringSet(this.m, (Set)paramObject); 
    F((Set)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\MultiSelectListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */