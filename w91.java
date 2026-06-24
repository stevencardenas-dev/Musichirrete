import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public abstract class w91 extends ua0 {
  public final u91 a0 = new u91(this);
  
  public ba1 b0;
  
  public RecyclerView c0;
  
  public boolean d0;
  
  public boolean e0;
  
  public int f0 = 2131493192;
  
  public vi2 g0;
  
  public final cj h0 = new cj(this, Looper.getMainLooper(), 9);
  
  public final e3 i0 = new e3(26, this);
  
  public final Preference D0(CharSequence paramCharSequence) {
    ba1 ba11 = this.b0;
    if (ba11 == null)
      return null; 
    PreferenceScreen preferenceScreen = ba11.g;
    return (preferenceScreen == null) ? null : preferenceScreen.F(paramCharSequence);
  }
  
  public abstract void E0(String paramString);
  
  public RecyclerView F0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (u0().getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
      RecyclerView recyclerView1 = (RecyclerView)paramViewGroup.findViewById(2131297364);
      if (recyclerView1 != null)
        return recyclerView1; 
    } 
    RecyclerView recyclerView = (RecyclerView)paramLayoutInflater.inflate(2131493194, paramViewGroup, false);
    u0();
    recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
    recyclerView.setAccessibilityDelegateCompat(new ca1(recyclerView));
    return recyclerView;
  }
  
  public final void f0(Bundle paramBundle) {
    super.f0(paramBundle);
    TypedValue typedValue = new TypedValue();
    u0().getTheme().resolveAttribute(2130969824, typedValue, true);
    int j = typedValue.resourceId;
    int i = j;
    if (j == 0)
      i = 2131952022; 
    u0().getTheme().applyStyle(i, false);
    ba1 ba11 = new ba1(u0());
    this.b0 = ba11;
    ba11.j = this;
    Bundle bundle = this.i;
    if (bundle != null) {
      String str = bundle.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
    } else {
      bundle = null;
    } 
    E0((String)bundle);
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    TypedArray typedArray = u0().obtainStyledAttributes(null, jc1.h, 2130969818, 0);
    this.f0 = typedArray.getResourceId(0, this.f0);
    Drawable drawable = typedArray.getDrawable(1);
    int i = typedArray.getDimensionPixelSize(2, -1);
    boolean bool = typedArray.getBoolean(3, true);
    typedArray.recycle();
    LayoutInflater layoutInflater = paramLayoutInflater.cloneInContext(u0());
    View view1 = layoutInflater.inflate(this.f0, paramViewGroup, false);
    View view2 = view1.findViewById(16908351);
    if (view2 instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)view2;
      RecyclerView recyclerView = F0(layoutInflater, viewGroup, paramBundle);
      this.c0 = recyclerView;
      u91 u911 = this.a0;
      recyclerView.h(u911);
      if (drawable != null) {
        u911.getClass();
        u911.b = drawable.getIntrinsicHeight();
      } else {
        u911.b = 0;
      } 
      u911.a = drawable;
      w91 w911 = u911.d;
      recyclerView = w911.c0;
      if (recyclerView.r.size() != 0) {
        a a = recyclerView.p;
        if (a != null)
          a.m("Cannot invalidate item decorations during a scroll or layout"); 
        recyclerView.T();
        recyclerView.requestLayout();
      } 
      if (i != -1) {
        u911.b = i;
        RecyclerView recyclerView1 = w911.c0;
        if (recyclerView1.r.size() != 0) {
          a a = recyclerView1.p;
          if (a != null)
            a.m("Cannot invalidate item decorations during a scroll or layout"); 
          recyclerView1.T();
          recyclerView1.requestLayout();
        } 
      } 
      u911.c = bool;
      if (this.c0.getParent() == null)
        viewGroup.addView((View)this.c0); 
      this.h0.post(this.i0);
      return view1;
    } 
    tp.f("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    return null;
  }
  
  public final void i0() {
    e3 e31 = this.i0;
    cj cj1 = this.h0;
    cj1.removeCallbacks(e31);
    cj1.removeMessages(1);
    if (this.d0) {
      this.c0.setAdapter(null);
      PreferenceScreen preferenceScreen = this.b0.g;
      if (preferenceScreen != null)
        preferenceScreen.p(); 
    } 
    this.c0 = null;
    this.I = true;
  }
  
  public final void n0(Bundle paramBundle) {
    PreferenceScreen preferenceScreen = this.b0.g;
    if (preferenceScreen != null) {
      Bundle bundle = new Bundle();
      preferenceScreen.b(bundle);
      paramBundle.putBundle("android:preferences", bundle);
    } 
  }
  
  public final void o0() {
    this.I = true;
    ba1 ba11 = this.b0;
    ba11.h = this;
    ba11.i = this;
  }
  
  public final void p0() {
    this.I = true;
    ba1 ba11 = this.b0;
    ba11.h = null;
    ba11.i = null;
  }
  
  public final void q0(Bundle paramBundle) {
    if (paramBundle != null) {
      paramBundle = paramBundle.getBundle("android:preferences");
      if (paramBundle != null) {
        PreferenceScreen preferenceScreen = this.b0.g;
        if (preferenceScreen != null)
          preferenceScreen.a(paramBundle); 
      } 
    } 
    if (this.d0) {
      PreferenceScreen preferenceScreen = this.b0.g;
      if (preferenceScreen != null) {
        this.c0.setAdapter(new z91((PreferenceGroup)preferenceScreen));
        preferenceScreen.l();
      } 
      vi2 vi21 = this.g0;
      if (vi21 != null) {
        vi21.run();
        this.g0 = null;
      } 
    } 
    this.e0 = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */