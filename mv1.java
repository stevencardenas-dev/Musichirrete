import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

public final class mv1 implements sv {
  public final Toolbar a;
  
  public int b;
  
  public final View c;
  
  public Drawable d;
  
  public Drawable e;
  
  public final Drawable f;
  
  public boolean g;
  
  public CharSequence h;
  
  public final CharSequence i;
  
  public final CharSequence j;
  
  public Window.Callback k;
  
  public boolean l;
  
  public u1 m;
  
  public final int n;
  
  public final Drawable o;
  
  public mv1(Toolbar paramToolbar, boolean paramBoolean) {
    boolean bool;
    this.n = 0;
    this.a = paramToolbar;
    this.h = paramToolbar.getTitle();
    this.i = paramToolbar.getSubtitle();
    if (this.h != null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    this.f = paramToolbar.getNavigationIcon();
    Context context = paramToolbar.getContext();
    int[] arrayOfInt = nc1.a;
    String str = null;
    zv0 zv0 = zv0.y(2130968583, 0, context, null, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    int i = 15;
    this.o = zv0.o(15);
    if (paramBoolean) {
      CharSequence charSequence = typedArray.getText(27);
      if (!TextUtils.isEmpty(charSequence)) {
        this.g = true;
        this.h = charSequence;
        if ((this.b & 0x8) != 0) {
          paramToolbar.setTitle(charSequence);
          if (this.g)
            v22.o(paramToolbar.getRootView(), charSequence); 
        } 
      } 
      charSequence = typedArray.getText(25);
      if (!TextUtils.isEmpty(charSequence)) {
        this.i = charSequence;
        if ((this.b & 0x8) != 0)
          paramToolbar.setSubtitle(charSequence); 
      } 
      Drawable drawable = zv0.o(20);
      if (drawable != null) {
        this.e = drawable;
        c();
      } 
      drawable = zv0.o(17);
      if (drawable != null) {
        this.d = drawable;
        c();
      } 
      if (this.f == null) {
        drawable = this.o;
        if (drawable != null) {
          this.f = drawable;
          if ((this.b & 0x4) != 0) {
            paramToolbar.setNavigationIcon(drawable);
          } else {
            paramToolbar.setNavigationIcon(null);
          } 
        } 
      } 
      a(typedArray.getInt(10, 0));
      i = typedArray.getResourceId(9, 0);
      if (i != 0) {
        View view1 = LayoutInflater.from(paramToolbar.getContext()).inflate(i, (ViewGroup)paramToolbar, false);
        View view2 = this.c;
        if (view2 != null && (this.b & 0x10) != 0)
          paramToolbar.removeView(view2); 
        this.c = view1;
        if (view1 != null && (this.b & 0x10) != 0)
          paramToolbar.addView(view1); 
        a(this.b | 0x10);
      } 
      i = typedArray.getLayoutDimension(13, 0);
      if (i > 0) {
        ViewGroup.LayoutParams layoutParams = paramToolbar.getLayoutParams();
        layoutParams.height = i;
        paramToolbar.setLayoutParams(layoutParams);
      } 
      i = typedArray.getDimensionPixelOffset(7, -1);
      int j = typedArray.getDimensionPixelOffset(3, -1);
      if (i >= 0 || j >= 0) {
        i = Math.max(i, 0);
        j = Math.max(j, 0);
        paramToolbar.d();
        paramToolbar.v.a(i, j);
      } 
      i = typedArray.getResourceId(28, 0);
      if (i != 0) {
        Context context1 = paramToolbar.getContext();
        paramToolbar.n = i;
        AppCompatTextView appCompatTextView = paramToolbar.c;
        if (appCompatTextView != null)
          appCompatTextView.setTextAppearance(context1, i); 
      } 
      i = typedArray.getResourceId(26, 0);
      if (i != 0) {
        Context context1 = paramToolbar.getContext();
        paramToolbar.o = i;
        AppCompatTextView appCompatTextView = paramToolbar.e;
        if (appCompatTextView != null)
          appCompatTextView.setTextAppearance(context1, i); 
      } 
      i = typedArray.getResourceId(22, 0);
      if (i != 0)
        paramToolbar.setPopupTheme(i); 
    } else {
      if (paramToolbar.getNavigationIcon() != null) {
        this.o = paramToolbar.getNavigationIcon();
      } else {
        i = 11;
      } 
      this.b = i;
    } 
    zv0.z();
    if (2131886088 != this.n) {
      this.n = 2131886088;
      if (TextUtils.isEmpty(paramToolbar.getNavigationContentDescription())) {
        i = this.n;
        if (i != 0)
          str = paramToolbar.getContext().getString(i); 
        this.j = str;
        b();
      } 
    } 
    this.j = paramToolbar.getNavigationContentDescription();
    paramToolbar.setNavigationOnClickListener(new fj(this));
  }
  
  public final void a(int paramInt) {
    int i = this.b ^ paramInt;
    this.b = paramInt;
    if (i != 0) {
      Toolbar toolbar = this.a;
      if ((i & 0x4) != 0) {
        if ((paramInt & 0x4) != 0)
          b(); 
        if ((this.b & 0x4) != 0) {
          Drawable drawable = this.f;
          if (drawable == null)
            drawable = this.o; 
          toolbar.setNavigationIcon(drawable);
        } else {
          toolbar.setNavigationIcon(null);
        } 
      } 
      if ((i & 0x3) != 0)
        c(); 
      if ((i & 0x8) != 0)
        if ((paramInt & 0x8) != 0) {
          toolbar.setTitle(this.h);
          toolbar.setSubtitle(this.i);
        } else {
          toolbar.setTitle(null);
          toolbar.setSubtitle(null);
        }  
      if ((i & 0x10) != 0) {
        View view = this.c;
        if (view != null) {
          if ((paramInt & 0x10) != 0) {
            toolbar.addView(view);
            return;
          } 
          toolbar.removeView(view);
        } 
      } 
    } 
  }
  
  public final void b() {
    if ((this.b & 0x4) != 0) {
      boolean bool = TextUtils.isEmpty(this.j);
      Toolbar toolbar = this.a;
      if (bool) {
        toolbar.setNavigationContentDescription(this.n);
        return;
      } 
      toolbar.setNavigationContentDescription(this.j);
    } 
  }
  
  public final void c() {
    Drawable drawable;
    int i = this.b;
    if ((i & 0x2) != 0) {
      if ((i & 0x1) != 0) {
        drawable = this.e;
        if (drawable == null)
          drawable = this.d; 
      } else {
        drawable = this.d;
      } 
    } else {
      drawable = null;
    } 
    this.a.setLogo(drawable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */