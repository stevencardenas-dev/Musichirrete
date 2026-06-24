import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;

public class vy extends ua0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
  public Handler a0;
  
  public final e3 b0 = new e3(6, this);
  
  public final sy c0 = new sy(this);
  
  public final ty d0 = new ty(0, this);
  
  public int e0 = 0;
  
  public int f0 = 0;
  
  public boolean g0 = true;
  
  public boolean h0 = true;
  
  public int i0 = -1;
  
  public boolean j0;
  
  public final gh1 k0 = new gh1(21, this);
  
  public Dialog l0;
  
  public boolean m0;
  
  public boolean n0;
  
  public boolean o0;
  
  public boolean p0 = false;
  
  public void D0() {
    E0(false, false);
  }
  
  public final void E0(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.n0)
      return; 
    this.n0 = true;
    this.o0 = false;
    Dialog dialog = this.l0;
    if (dialog != null) {
      dialog.setOnDismissListener(null);
      this.l0.dismiss();
      if (!paramBoolean2)
        if (Looper.myLooper() == this.a0.getLooper()) {
          onDismiss((DialogInterface)this.l0);
        } else {
          this.a0.post(this.b0);
        }  
    } 
    this.m0 = true;
    if (this.i0 >= 0) {
      lb0 lb0 = R();
      int i = this.i0;
      if (i >= 0) {
        lb0.x(new jb0(lb0, i), paramBoolean1);
        this.i0 = -1;
        return;
      } 
      l0.l(ga1.i("Bad id: ", i));
      return;
    } 
    lb lb = new lb(R());
    lb.p = true;
    lb.j(this);
    if (paramBoolean1) {
      lb.g(true, true);
      return;
    } 
    lb.f();
  }
  
  public Dialog F0(Bundle paramBundle) {
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("onCreateDialog called for DialogFragment ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    return new so(u0(), this.f0);
  }
  
  public void G0(Dialog paramDialog, int paramInt) {
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3)
        return; 
      Window window = paramDialog.getWindow();
      if (window != null)
        window.addFlags(24); 
    } 
    paramDialog.requestWindowFeature(1);
  }
  
  public void H0(lb0 paramlb0, String paramString) {
    this.n0 = false;
    this.o0 = true;
    paramlb0.getClass();
    lb lb = new lb(paramlb0);
    lb.p = true;
    lb.h(0, this, paramString, 1);
    lb.f();
  }
  
  public final qz1 K() {
    return new uy(this, new ra0(this));
  }
  
  public final void b0(Bundle paramBundle) {
    this.I = true;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    vz0 vz0 = this.V;
    vz0.getClass();
    vz0.a("observeForever");
    gh1 gh11 = this.k0;
    ro0 ro0 = new ro0(vz0, gh11);
    Object object = vz0.b;
    gi1 gi1 = object.c(gh11);
    if (gi1 != null) {
      object = gi1.c;
    } else {
      gi1 gi11 = new gi1(gh11, ro0);
      ((ji1)object).f++;
      gi1 = ((ji1)object).c;
      if (gi1 == null) {
        ((ji1)object).b = gi11;
        ((ji1)object).c = gi11;
      } else {
        gi1.e = gi11;
        gi11.f = gi1;
        ((ji1)object).c = gi11;
      } 
      object = null;
    } 
    if ((ro0)object == null)
      ro0.a(true); 
    if (!this.o0)
      this.n0 = false; 
  }
  
  public void f0(Bundle paramBundle) {
    boolean bool;
    super.f0(paramBundle);
    this.a0 = new Handler();
    if (this.B == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h0 = bool;
    if (paramBundle != null) {
      this.e0 = paramBundle.getInt("android:style", 0);
      this.f0 = paramBundle.getInt("android:theme", 0);
      this.g0 = paramBundle.getBoolean("android:cancelable", true);
      this.h0 = paramBundle.getBoolean("android:showsDialog", this.h0);
      this.i0 = paramBundle.getInt("android:backStackId", -1);
    } 
  }
  
  public final void i0() {
    this.I = true;
    Dialog dialog = this.l0;
    if (dialog != null) {
      this.m0 = true;
      dialog.setOnDismissListener(null);
      this.l0.dismiss();
      if (!this.n0)
        onDismiss((DialogInterface)this.l0); 
      this.l0 = null;
      this.p0 = false;
    } 
  }
  
  public final void j0() {
    this.I = true;
    if (!this.o0 && !this.n0)
      this.n0 = true; 
    vz0 vz0 = this.V;
    vz0.getClass();
    vz0.a("removeObserver");
    ro0 ro0 = (ro0)vz0.b.d(this.k0);
    if (ro0 == null)
      return; 
    ro0.a(false);
  }
  
  public final LayoutInflater k0(Bundle paramBundle) {
    String str;
    LayoutInflater layoutInflater = super.k0(paramBundle);
    boolean bool = this.h0;
    if (!bool || this.j0) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("getting layout inflater for DialogFragment ");
        stringBuilder.append(this);
        str = stringBuilder.toString();
        if (!this.h0) {
          Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
          return layoutInflater;
        } 
        Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
      } 
      return layoutInflater;
    } 
    if (bool && !this.p0) {
      try {
        this.j0 = true;
        Dialog dialog1 = F0((Bundle)str);
        this.l0 = dialog1;
        if (this.h0) {
          G0(dialog1, this.e0);
          Context context = P();
          if (context != null)
            this.l0.setOwnerActivity((Activity)context); 
          this.l0.setCancelable(this.g0);
          this.l0.setOnCancelListener(this.c0);
          this.l0.setOnDismissListener(this.d0);
          this.p0 = true;
        } else {
          this.l0 = null;
        } 
      } finally {}
      this.j0 = false;
    } 
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("get layout inflater for DialogFragment ");
      stringBuilder.append(this);
      stringBuilder.append(" from dialog context");
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Dialog dialog = this.l0;
    return (dialog != null) ? layoutInflater.cloneInContext(dialog.getContext()) : layoutInflater;
  }
  
  public void n0(Bundle paramBundle) {
    Dialog dialog = this.l0;
    if (dialog != null) {
      Bundle bundle = dialog.onSaveInstanceState();
      bundle.putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", bundle);
    } 
    int i = this.e0;
    if (i != 0)
      paramBundle.putInt("android:style", i); 
    i = this.f0;
    if (i != 0)
      paramBundle.putInt("android:theme", i); 
    boolean bool = this.g0;
    if (!bool)
      paramBundle.putBoolean("android:cancelable", bool); 
    bool = this.h0;
    if (!bool)
      paramBundle.putBoolean(tlzLOCPTHRhep.wkYMaurZOrSw, bool); 
    i = this.i0;
    if (i != -1)
      paramBundle.putInt("android:backStackId", i); 
  }
  
  public void o0() {
    this.I = true;
    Dialog dialog = this.l0;
    if (dialog != null) {
      this.m0 = false;
      dialog.show();
      View view = this.l0.getWindow().getDecorView();
      view.getClass();
      view.setTag(2131297954, this);
      view.setTag(2131297958, this);
      view.setTag(2131297957, this);
    } 
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    if (!this.m0) {
      if (lb0.M(3)) {
        StringBuilder stringBuilder = new StringBuilder("onDismiss called for DialogFragment ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      E0(true, true);
    } 
  }
  
  public void p0() {
    this.I = true;
    Dialog dialog = this.l0;
    if (dialog != null)
      dialog.hide(); 
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (this.l0 != null && paramBundle != null) {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null)
        this.l0.onRestoreInstanceState(paramBundle); 
    } 
  }
  
  public final void s0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    super.s0(paramLayoutInflater, paramViewGroup, paramBundle);
    if (this.K == null && this.l0 != null && paramBundle != null) {
      Bundle bundle = paramBundle.getBundle("android:savedDialogState");
      if (bundle != null)
        this.l0.onRestoreInstanceState(bundle); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */