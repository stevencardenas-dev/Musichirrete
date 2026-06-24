package androidx.preference;

import ak1;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import da1;
import he1;
import jc1;
import wm;
import zj1;

public class SeekBarPreference extends Preference {
  public int O;
  
  public int P;
  
  public int Q;
  
  public int R;
  
  public boolean S;
  
  public SeekBar T;
  
  public TextView U;
  
  public final boolean V;
  
  public final boolean W;
  
  public final boolean X;
  
  public final wm Y = new wm(2, this);
  
  public final zj1 Z = new zj1(this);
  
  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130969896, 0);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.k, 2130969896, 0);
    this.P = typedArray.getInt(3, 0);
    int k = typedArray.getInt(1, 100);
    int j = this.P;
    int i = k;
    if (k < j)
      i = j; 
    if (i != this.Q) {
      this.Q = i;
      j();
    } 
    i = typedArray.getInt(14, 0);
    if (i != this.R) {
      this.R = Math.min(this.Q - this.P, Math.abs(i));
      j();
    } 
    this.V = typedArray.getBoolean(2, true);
    this.W = typedArray.getBoolean(15, false);
    this.X = typedArray.getBoolean(16, false);
    typedArray.recycle();
  }
  
  public final void F(int paramInt, boolean paramBoolean) {
    int j = this.P;
    int i = paramInt;
    if (paramInt < j)
      i = j; 
    j = this.Q;
    paramInt = i;
    if (i > j)
      paramInt = j; 
    if (paramInt != this.O) {
      this.O = paramInt;
      TextView textView = this.U;
      if (textView != null)
        textView.setText(String.valueOf(paramInt)); 
      x(paramInt);
      if (paramBoolean)
        j(); 
    } 
  }
  
  public final void n(da1 paramda1) {
    super.n(paramda1);
    ((he1)paramda1).b.setOnKeyListener((View.OnKeyListener)this.Z);
    this.T = (SeekBar)paramda1.s(2131297465);
    TextView textView2 = (TextView)paramda1.s(2131297466);
    this.U = textView2;
    if (this.W) {
      textView2.setVisibility(0);
    } else {
      textView2.setVisibility(8);
      this.U = null;
    } 
    SeekBar seekBar = this.T;
    if (seekBar == null) {
      Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
      return;
    } 
    seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this.Y);
    this.T.setMax(this.Q - this.P);
    int i = this.R;
    seekBar = this.T;
    if (i != 0) {
      seekBar.setKeyProgressIncrement(i);
    } else {
      this.R = seekBar.getKeyProgressIncrement();
    } 
    this.T.setProgress(this.O - this.P);
    i = this.O;
    TextView textView1 = this.U;
    if (textView1 != null)
      textView1.setText(String.valueOf(i)); 
    this.T.setEnabled(i());
  }
  
  public final Object q(TypedArray paramTypedArray, int paramInt) {
    return Integer.valueOf(paramTypedArray.getInt(paramInt, 0));
  }
  
  public final void r(Parcelable paramParcelable) {
    if (!paramParcelable.getClass().equals(ak1.class)) {
      super.r(paramParcelable);
      return;
    } 
    ak1 ak1 = (ak1)paramParcelable;
    super.r(ak1.getSuperState());
    this.O = ak1.b;
    this.P = ak1.c;
    this.Q = ak1.e;
    j();
  }
  
  public final Parcelable s() {
    super.s();
    AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
    if (this.s)
      return (Parcelable)absSavedState; 
    ak1 ak1 = new ak1();
    ak1.b = this.O;
    ak1.c = this.P;
    ak1.e = this.Q;
    return (Parcelable)ak1;
  }
  
  public final void t(Object paramObject) {
    Object object = paramObject;
    if (paramObject == null)
      object = Integer.valueOf(0); 
    F(e(((Integer)object).intValue()), true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\SeekBarPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */