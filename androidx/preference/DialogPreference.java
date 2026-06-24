package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import dd1;
import fo0;
import jc1;
import l30;
import py0;
import tp;
import ua0;
import w91;

public abstract class DialogPreference extends Preference {
  public final CharSequence O;
  
  public final String P;
  
  public final Drawable Q;
  
  public final String R;
  
  public final String S;
  
  public final int T;
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, dd1.x(paramContext, 2130969064, 16842897), 0);
  }
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.c, paramInt1, paramInt2);
    String str4 = typedArray.getString(9);
    String str2 = str4;
    if (str4 == null)
      str2 = typedArray.getString(0); 
    this.O = str2;
    if (str2 == null)
      this.O = this.i; 
    str4 = typedArray.getString(8);
    str2 = str4;
    if (str4 == null)
      str2 = typedArray.getString(1); 
    this.P = str2;
    Drawable drawable2 = typedArray.getDrawable(6);
    Drawable drawable1 = drawable2;
    if (drawable2 == null)
      drawable1 = typedArray.getDrawable(2); 
    this.Q = drawable1;
    String str3 = typedArray.getString(11);
    String str1 = str3;
    if (str3 == null)
      str1 = typedArray.getString(3); 
    this.R = str1;
    str3 = typedArray.getString(10);
    str1 = str3;
    if (str3 == null)
      str1 = typedArray.getString(4); 
    this.S = str1;
    this.T = typedArray.getResourceId(7, typedArray.getResourceId(5, 0));
    typedArray.recycle();
  }
  
  public void o() {
    w91 w91 = this.c.i;
    if (w91 != null) {
      w91 w911 = w91;
      while (w911 != null)
        ua0 ua0 = ((ua0)w911).z; 
      if (w91.R().E("androidx.preference.PreferenceFragment.DIALOG") == null) {
        py0 py0;
        boolean bool = this instanceof EditTextPreference;
        String str = this.m;
        if (bool) {
          l30 l30 = new l30();
          Bundle bundle = new Bundle(1);
          bundle.putString("key", str);
          l30.x0(bundle);
        } else if (this instanceof ListPreference) {
          fo0 fo0 = new fo0();
          Bundle bundle = new Bundle(1);
          bundle.putString("key", str);
          fo0.x0(bundle);
        } else if (this instanceof MultiSelectListPreference) {
          py0 = new py0();
          Bundle bundle = new Bundle(1);
          bundle.putString("key", str);
          py0.x0(bundle);
        } else {
          tp.e(getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", "Cannot display dialog for an unknown Preference type: ");
          return;
        } 
        py0.z0((ua0)w91);
        py0.H0(w91.R(), "androidx.preference.PreferenceFragment.DIALOG");
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\DialogPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */