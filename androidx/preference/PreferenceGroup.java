package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import java.util.ArrayList;
import jc1;
import l0;
import x91;
import zm1;

public abstract class PreferenceGroup extends Preference {
  public final zm1 O = new zm1(0);
  
  public final ArrayList P;
  
  public boolean Q;
  
  public int R;
  
  public boolean S;
  
  public int T;
  
  public PreferenceGroup(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0, 0);
  }
  
  public PreferenceGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    new Handler(Looper.getMainLooper());
    this.Q = true;
    this.R = 0;
    this.S = false;
    this.T = Integer.MAX_VALUE;
    this.P = new ArrayList();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.i, paramInt1, paramInt2);
    this.Q = typedArray.getBoolean(2, typedArray.getBoolean(2, true));
    if (typedArray.hasValue(1)) {
      paramInt1 = typedArray.getInt(1, typedArray.getInt(1, 2147483647));
      if (paramInt1 != Integer.MAX_VALUE && TextUtils.isEmpty(this.m)) {
        String str = getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference");
        Log.e(RqlokDsQOju.dLDTkwuZpTfOcvh, str);
      } 
      this.T = paramInt1;
    } 
    typedArray.recycle();
  }
  
  public final Preference F(CharSequence paramCharSequence) {
    if (paramCharSequence != null) {
      if (TextUtils.equals(this.m, paramCharSequence))
        return this; 
      int i = this.P.size();
      for (byte b = 0; b < i; b++) {
        Preference preference = G(b);
        if (TextUtils.equals(preference.m, paramCharSequence))
          return preference; 
        if (preference instanceof PreferenceGroup) {
          preference = ((PreferenceGroup)preference).F(paramCharSequence);
          if (preference != null)
            return preference; 
        } 
      } 
      return null;
    } 
    l0.l("Key cannot be null");
    return null;
  }
  
  public final Preference G(int paramInt) {
    return this.P.get(paramInt);
  }
  
  public final void a(Bundle paramBundle) {
    super.a(paramBundle);
    int i = this.P.size();
    for (byte b = 0; b < i; b++)
      G(b).a(paramBundle); 
  }
  
  public final void b(Bundle paramBundle) {
    super.b(paramBundle);
    int i = this.P.size();
    for (byte b = 0; b < i; b++)
      G(b).b(paramBundle); 
  }
  
  public final void k(boolean paramBoolean) {
    super.k(paramBoolean);
    int i = this.P.size();
    for (byte b = 0; b < i; b++) {
      Preference preference = G(b);
      if (preference.w == paramBoolean) {
        preference.w = paramBoolean ^ true;
        preference.k(preference.D());
        preference.j();
      } 
    } 
  }
  
  public final void l() {
    super.l();
    this.S = true;
    int i = this.P.size();
    for (byte b = 0; b < i; b++)
      G(b).l(); 
  }
  
  public final void p() {
    super.p();
    byte b = 0;
    this.S = false;
    int i = this.P.size();
    while (b < i) {
      G(b).p();
      b++;
    } 
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(x91.class)) {
      super.r(paramParcelable);
      return;
    } 
    x91 x91 = (x91)paramParcelable;
    this.T = x91.b;
    super.r(x91.getSuperState());
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    return (Parcelable)new x91(this.T);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\PreferenceGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */