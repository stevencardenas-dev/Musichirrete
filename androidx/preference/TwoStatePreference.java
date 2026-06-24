package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import hy1;

public abstract class TwoStatePreference extends Preference {
  public boolean O;
  
  public CharSequence P;
  
  public CharSequence Q;
  
  public boolean R;
  
  public boolean S;
  
  public TwoStatePreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0, 0);
  }
  
  public final boolean D() {
    boolean bool2 = this.S;
    boolean bool1 = this.O;
    if (!bool2)
      if (!bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      }  
    return (bool1 || super.D());
  }
  
  public final void F(boolean paramBoolean) {
    boolean bool;
    if (this.O != paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool || !this.R) {
      this.O = paramBoolean;
      this.R = true;
      if (E()) {
        boolean bool1;
        int i = paramBoolean ^ true;
        boolean bool2 = E();
        String str = this.m;
        if (bool2)
          bool1 = this.c.b().getBoolean(str, i); 
        if (paramBoolean != bool1) {
          SharedPreferences.Editor editor = this.c.a();
          editor.putBoolean(str, paramBoolean);
          if (!this.c.e)
            editor.apply(); 
        } 
      } 
      if (bool) {
        k(D());
        j();
      } 
    } 
  }
  
  public final void G(View paramView) {
    if (!(paramView instanceof TextView))
      return; 
    TextView textView = (TextView)paramView;
    boolean bool = this.O;
    boolean bool3 = false;
    if (bool && !TextUtils.isEmpty(this.P)) {
      textView.setText(this.P);
    } else if (!this.O && !TextUtils.isEmpty(this.Q)) {
      textView.setText(this.Q);
    } else {
      boolean bool4 = true;
      boolean bool5 = bool4;
    } 
    boolean bool1 = false;
    boolean bool2 = bool1;
  }
  
  public final void o() {
    F(this.O ^ true);
  }
  
  public final Object q(TypedArray paramTypedArray, int paramInt) {
    return Boolean.valueOf(paramTypedArray.getBoolean(paramInt, false));
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(hy1.class)) {
      super.r(paramParcelable);
      return;
    } 
    hy1 hy1 = (hy1)paramParcelable;
    super.r(hy1.getSuperState());
    F(hy1.b);
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    if (this.s)
      return (Parcelable)absSavedState; 
    hy1 hy1 = new hy1();
    hy1.b = this.O;
    return (Parcelable)hy1;
  }
  
  public final void t(Object paramObject) {
    Object object = paramObject;
    if (paramObject == null)
      object = Boolean.FALSE; 
    boolean bool = ((Boolean)object).booleanValue();
    if (E())
      bool = this.c.b().getBoolean(this.m, bool); 
    F(bool);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\TwoStatePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */