import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;

public abstract class t91 extends vy implements DialogInterface.OnClickListener {
  public DialogPreference q0;
  
  public CharSequence r0;
  
  public CharSequence s0;
  
  public CharSequence t0;
  
  public CharSequence u0;
  
  public int v0;
  
  public BitmapDrawable w0;
  
  public int x0;
  
  public final Dialog F0(Bundle paramBundle) {
    View view;
    this.x0 = -2;
    mi2 mi2 = new mi2(u0());
    CharSequence charSequence = this.r0;
    v3 v3 = (v3)mi2.e;
    v3.d = charSequence;
    v3.c = (Drawable)this.w0;
    v3.g = this.s0;
    v3.h = this;
    v3.i = this.t0;
    v3.j = this;
    u0();
    int i = this.v0;
    charSequence = null;
    if (i != 0) {
      LayoutInflater layoutInflater2 = this.P;
      LayoutInflater layoutInflater1 = layoutInflater2;
      if (layoutInflater2 == null) {
        layoutInflater1 = k0(null);
        this.P = layoutInflater1;
      } 
      view = layoutInflater1.inflate(i, null);
    } 
    if (view != null) {
      J0(view);
      v3.q = view;
    } else {
      v3.f = this.u0;
    } 
    L0(mi2);
    z3 z3 = mi2.c();
    if (this instanceof l30) {
      Window window = z3.getWindow();
      if (Build.VERSION.SDK_INT >= 30) {
        s91.a(window);
        return z3;
      } 
      l30 l30 = (l30)this;
      l30.B0 = SystemClock.currentThreadTimeMillis();
      l30.M0();
    } 
    return z3;
  }
  
  public final DialogPreference I0() {
    if (this.q0 == null) {
      Bundle bundle = this.i;
      if (bundle != null) {
        String str = bundle.getString(jHxlGgUTadw.HIYiAyMci);
        this.q0 = (DialogPreference)((w91)V(true)).D0(str);
      } else {
        m60.h(this, " does not have any arguments.", "Fragment ");
        return null;
      } 
    } 
    return this.q0;
  }
  
  public void J0(View paramView) {
    paramView = paramView.findViewById(16908299);
    if (paramView != null) {
      byte b;
      CharSequence charSequence = this.u0;
      if (!TextUtils.isEmpty(charSequence)) {
        if (paramView instanceof TextView)
          ((TextView)paramView).setText(charSequence); 
        b = 0;
      } else {
        b = 8;
      } 
      if (paramView.getVisibility() != b)
        paramView.setVisibility(b); 
    } 
  }
  
  public abstract void K0(boolean paramBoolean);
  
  public void L0(mi2 parammi2) {}
  
  public void f0(Bundle paramBundle) {
    super.f0(paramBundle);
    ua0 ua0 = V(true);
    if (ua0 instanceof w91) {
      ua0 = ua0;
      Bundle bundle = this.i;
      if (bundle != null) {
        Drawable drawable;
        String str = bundle.getString("key");
        if (paramBundle == null) {
          DialogPreference dialogPreference = (DialogPreference)ua0.D0(str);
          this.q0 = dialogPreference;
          this.r0 = dialogPreference.O;
          this.s0 = dialogPreference.R;
          this.t0 = dialogPreference.S;
          this.u0 = dialogPreference.P;
          this.v0 = dialogPreference.T;
          drawable = dialogPreference.Q;
          if (drawable == null || drawable instanceof BitmapDrawable) {
            this.w0 = (BitmapDrawable)drawable;
            return;
          } 
          Bitmap bitmap1 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
          Canvas canvas = new Canvas(bitmap1);
          drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
          drawable.draw(canvas);
          this.w0 = new BitmapDrawable(S(), bitmap1);
          return;
        } 
        this.r0 = drawable.getCharSequence("PreferenceDialogFragment.title");
        this.s0 = drawable.getCharSequence("PreferenceDialogFragment.positiveText");
        this.t0 = drawable.getCharSequence("PreferenceDialogFragment.negativeText");
        this.u0 = drawable.getCharSequence("PreferenceDialogFragment.message");
        this.v0 = drawable.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap)drawable.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null)
          this.w0 = new BitmapDrawable(S(), bitmap); 
        return;
      } 
      m60.h(this, tlzLOCPTHRhep.XLSu, "Fragment ");
      return;
    } 
    tp.f("Target fragment must implement TargetFragment interface");
  }
  
  public void n0(Bundle paramBundle) {
    super.n0(paramBundle);
    paramBundle.putCharSequence("PreferenceDialogFragment.title", this.r0);
    paramBundle.putCharSequence("PreferenceDialogFragment.positiveText", this.s0);
    paramBundle.putCharSequence("PreferenceDialogFragment.negativeText", this.t0);
    paramBundle.putCharSequence("PreferenceDialogFragment.message", this.u0);
    paramBundle.putInt("PreferenceDialogFragment.layout", this.v0);
    BitmapDrawable bitmapDrawable = this.w0;
    if (bitmapDrawable != null)
      paramBundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)bitmapDrawable.getBitmap()); 
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    this.x0 = paramInt;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    boolean bool;
    super.onDismiss(paramDialogInterface);
    if (this.x0 == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    K0(bool);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */