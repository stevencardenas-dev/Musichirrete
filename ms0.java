import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ms0 {
  public rs0 A;
  
  public int A0;
  
  public rs0 B;
  
  public rs0 C;
  
  public rs0 D;
  
  public os0 E;
  
  public qs0 F;
  
  public ps0 G;
  
  public boolean H;
  
  public boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public final float L;
  
  public int M;
  
  public Integer[] N;
  
  public Integer[] O;
  
  public boolean P;
  
  public final Typeface Q;
  
  public final Typeface R;
  
  public Drawable S;
  
  public final int T;
  
  public id1 U;
  
  public LinearLayoutManager V;
  
  public DialogInterface.OnDismissListener W;
  
  public DialogInterface.OnCancelListener X;
  
  public DialogInterface.OnShowListener Y;
  
  public vo1 Z;
  
  public boolean a0;
  
  public final Context b;
  
  public int b0;
  
  public MovementMethod c = LinkMovementMethod.getInstance();
  
  public int c0;
  
  public boolean d0;
  
  public boolean e;
  
  public boolean e0;
  
  public CharSequence f;
  
  public int f0;
  
  public final re0 g;
  
  public int g0;
  
  public final re0 h;
  
  public CharSequence h0;
  
  public final re0 i;
  
  public CharSequence i0;
  
  public final re0 j;
  
  public ns0 j0;
  
  public final re0 k;
  
  public boolean k0;
  
  public final int l;
  
  public int l0;
  
  public int m;
  
  public final int m0;
  
  public int n;
  
  public final int n0;
  
  public CharSequence o;
  
  public CharSequence o0;
  
  public ArrayList p;
  
  public boolean p0;
  
  public CharSequence q;
  
  public CompoundButton.OnCheckedChangeListener q0;
  
  public CharSequence r;
  
  public final String r0;
  
  public CharSequence s;
  
  public final NumberFormat s0;
  
  public boolean t;
  
  public boolean t0;
  
  public View u;
  
  public boolean u0;
  
  public int v;
  
  public boolean v0;
  
  public ColorStateList w;
  
  public boolean w0;
  
  public ColorStateList x;
  
  public boolean x0;
  
  public ColorStateList y;
  
  public boolean y0;
  
  public ColorStateList z;
  
  public boolean z0;
  
  public ms0(Context paramContext) {
    re0 re02 = re0.b;
    this.g = re02;
    this.h = re02;
    re0 re01 = re0.e;
    this.i = re01;
    this.j = re02;
    this.k = re02;
    this.l = 0;
    this.m = -1;
    this.n = -1;
    this.H = false;
    this.I = false;
    this.A0 = 1;
    this.J = true;
    this.K = true;
    this.L = 1.2F;
    this.M = -1;
    this.N = null;
    this.O = null;
    this.P = true;
    this.T = -1;
    this.f0 = -2;
    this.g0 = 0;
    this.l0 = -1;
    this.m0 = -1;
    this.n0 = -1;
    this.u0 = false;
    this.v0 = false;
    this.w0 = false;
    this.x0 = false;
    this.y0 = false;
    this.b = paramContext;
    int i = dd1.j0(paramContext, 2130968892, paramContext.getColor(2131100650));
    this.v = i;
    i = dd1.j0(paramContext, 16843829, i);
    this.v = i;
    this.w = dd1.w(paramContext, i);
    this.x = dd1.w(paramContext, this.v);
    this.y = dd1.w(paramContext, this.v);
    this.z = dd1.w(paramContext, dd1.j0(paramContext, 2130969628, this.v));
    this.l = dd1.j0(paramContext, 2130969614, dd1.j0(paramContext, 2130968900, dd1.j0(paramContext, 16843820, 0)));
    this.s0 = NumberFormat.getPercentInstance();
    this.r0 = "%1d/%2d";
    if (dd1.O(dd1.j0(paramContext, 16842806, 0))) {
      i = 1;
    } else {
      i = 2;
    } 
    this.A0 = i;
    if (fb0.g(false) != null) {
      fb0.g(true).getClass();
      this.g = re02;
      this.h = re02;
      this.i = re01;
      this.j = re02;
      this.k = re02;
    } 
    this.g = dd1.l0(paramContext, 2130969637, this.g);
    this.h = dd1.l0(paramContext, 2130969619, this.h);
    this.i = dd1.l0(paramContext, 2130969616, this.i);
    this.j = dd1.l0(paramContext, 2130969627, this.j);
    this.k = dd1.l0(paramContext, 2130969617, this.k);
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130969630, typedValue, true);
    String str2 = (String)typedValue.string;
    typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130969635, typedValue, true);
    String str1 = (String)typedValue.string;
    if (str2 != null) {
      Typeface typeface = zz1.a(paramContext, str2);
      this.R = typeface;
      if (typeface == null) {
        l0.l("No font asset found for ".concat(str2));
        throw null;
      } 
    } 
    if (str1 != null) {
      Typeface typeface = zz1.a(paramContext, str1);
      this.Q = typeface;
      if (typeface == null) {
        l0.l("No font asset found for ".concat(str1));
        throw null;
      } 
    } 
    if (this.R == null)
      try {
        this.R = Typeface.create("sans-serif-medium", 0);
      } catch (Exception exception) {} 
    if (this.Q == null)
      try {
        this.Q = Typeface.create("sans-serif", 0);
      } catch (Exception exception) {} 
  }
  
  public final void a(id1 paramid1, LinearLayoutManager2 paramLinearLayoutManager2) {
    if (this.u == null) {
      this.U = paramid1;
      this.V = (LinearLayoutManager)paramLinearLayoutManager2;
      return;
    } 
    tp.f("You cannot set adapter() when you're using a custom view.");
  }
  
  public final void b(int paramInt, boolean paramBoolean, xd0 paramxd0) {
    this.o0 = this.b.getResources().getText(paramInt);
    this.p0 = paramBoolean;
    this.q0 = paramxd0;
  }
  
  public final void c(int paramInt) {
    d((CharSequence)Html.fromHtml(this.b.getString(paramInt)));
  }
  
  public final void d(CharSequence paramCharSequence) {
    if (this.u == null) {
      this.o = paramCharSequence;
      return;
    } 
    tp.f("You cannot set content() when you're using a custom view.");
  }
  
  public final void e(int paramInt, boolean paramBoolean) {
    f(LayoutInflater.from(this.b).inflate(paramInt, null), paramBoolean);
  }
  
  public final void f(View paramView, boolean paramBoolean) {
    if (this.o == null) {
      if (this.p == null) {
        if (this.j0 == null) {
          if (this.f0 <= -2 && !this.d0) {
            if (paramView.getParent() != null && paramView.getParent() instanceof ViewGroup)
              ((ViewGroup)paramView.getParent()).removeView(paramView); 
            this.u = paramView;
            this.a0 = paramBoolean;
            return;
          } 
          tp.f("You cannot use customView() with a progress dialog");
          return;
        } 
        tp.f("You cannot use customView() with an input dialog");
        return;
      } 
      tp.f("You cannot use customView() when you have items set.");
      return;
    } 
    tp.f("You cannot use customView() when you have content set.");
  }
  
  public final void g(String paramString, CharSequence paramCharSequence, boolean paramBoolean, ns0 paramns0) {
    if (this.u == null) {
      this.j0 = paramns0;
      this.i0 = paramString;
      this.h0 = paramCharSequence;
      this.k0 = paramBoolean;
      return;
    } 
    tp.f("You cannot set content() when you're using a custom view.");
  }
  
  public final void h(Collection paramCollection) {
    if (paramCollection.size() > 0) {
      CharSequence[] arrayOfCharSequence = new CharSequence[paramCollection.size()];
      Iterator<E> iterator = paramCollection.iterator();
      for (byte b = 0; iterator.hasNext(); b++)
        arrayOfCharSequence[b] = iterator.next().toString(); 
      i(arrayOfCharSequence);
    } 
  }
  
  public final void i(CharSequence... paramVarArgs) {
    if (this.u == null) {
      ArrayList<? super CharSequence> arrayList = new ArrayList();
      this.p = arrayList;
      Collections.addAll(arrayList, paramVarArgs);
      return;
    } 
    tp.f("You cannot set items() when you're using a custom view.");
  }
  
  public final void j(os0 paramos0) {
    this.E = paramos0;
    this.F = null;
    this.G = null;
  }
  
  public final void k(int paramInt) {
    if (paramInt == 0)
      return; 
    this.s = this.b.getText(paramInt);
  }
  
  public final void l(int paramInt) {
    if (paramInt == 0)
      return; 
    this.r = this.b.getText(paramInt);
  }
  
  public final void m(ez0 paramez0) {
    this.A = paramez0;
  }
  
  public final void n(int paramInt) {
    if (paramInt == 0)
      return; 
    this.q = this.b.getText(paramInt);
  }
  
  public final void o(int paramInt, boolean paramBoolean) {
    if (this.u == null) {
      if (paramBoolean) {
        this.d0 = true;
        this.f0 = -2;
        return;
      } 
      this.d0 = false;
      this.f0 = -1;
      this.g0 = paramInt;
      return;
    } 
    tp.f("You cannot set progress() when you're using a custom view.");
  }
  
  public ss0 p() {
    ss0 ss0 = new ss0(this);
    ss0.show();
    return ss0;
  }
  
  public final void q(int paramInt) {
    this.f = this.b.getText(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ms0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */