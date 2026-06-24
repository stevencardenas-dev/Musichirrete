package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ba1;
import da1;
import dd1;
import e3;
import eb0;
import he1;
import i1;
import id1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jc1;
import l0;
import lb;
import lb0;
import m91;
import n91;
import o91;
import tp;
import ua0;
import v22;
import w91;
import ws2;
import x41;
import z91;

public class Preference implements Comparable<Preference> {
  public final boolean A;
  
  public final boolean B = true;
  
  public final boolean C;
  
  public final boolean D;
  
  public final boolean E = true;
  
  public int F = 2131493184;
  
  public final int G;
  
  public z91 H;
  
  public ArrayList I;
  
  public PreferenceGroup J;
  
  public boolean K;
  
  public n91 L;
  
  public o91 M;
  
  public final i1 N = new i1(6, this);
  
  public final Context b;
  
  public ba1 c;
  
  public long e;
  
  public boolean f;
  
  public m91 g;
  
  public int h = Integer.MAX_VALUE;
  
  public CharSequence i;
  
  public CharSequence j;
  
  public int k;
  
  public Drawable l;
  
  public final String m;
  
  public Intent n;
  
  public final String o;
  
  public Bundle p;
  
  public boolean q = true;
  
  public final boolean r = true;
  
  public final boolean s = true;
  
  public final String t;
  
  public final Object u;
  
  public boolean v = true;
  
  public boolean w = true;
  
  public boolean x = true;
  
  public final boolean y = true;
  
  public final boolean z = true;
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, dd1.x(paramContext, 2130969823, 16842894), 0);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.b = paramContext;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.g, paramInt1, paramInt2);
    this.k = typedArray.getResourceId(23, typedArray.getResourceId(0, 0));
    String str2 = typedArray.getString(26);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(6); 
    this.m = str1;
    CharSequence charSequence2 = typedArray.getText(34);
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = typedArray.getText(4); 
    this.i = charSequence1;
    charSequence2 = typedArray.getText(33);
    charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = typedArray.getText(7); 
    this.j = charSequence1;
    this.h = typedArray.getInt(28, typedArray.getInt(8, 2147483647));
    charSequence2 = typedArray.getString(22);
    charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = typedArray.getString(13); 
    this.o = (String)charSequence1;
    this.F = typedArray.getResourceId(27, typedArray.getResourceId(3, 2131493184));
    this.G = typedArray.getResourceId(36, typedArray.getResourceId(9, 0));
    this.q = typedArray.getBoolean(21, typedArray.getBoolean(2, true));
    boolean bool = typedArray.getBoolean(30, typedArray.getBoolean(5, true));
    this.r = bool;
    this.s = typedArray.getBoolean(29, typedArray.getBoolean(1, true));
    charSequence2 = typedArray.getString(19);
    charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = typedArray.getString(10); 
    this.t = (String)charSequence1;
    this.y = typedArray.getBoolean(16, typedArray.getBoolean(16, bool));
    this.z = typedArray.getBoolean(17, typedArray.getBoolean(17, bool));
    if (typedArray.hasValue(18)) {
      this.u = q(typedArray, 18);
    } else if (typedArray.hasValue(11)) {
      this.u = q(typedArray, 11);
    } 
    this.E = typedArray.getBoolean(31, typedArray.getBoolean(12, true));
    bool = typedArray.hasValue(32);
    this.A = bool;
    if (bool)
      this.B = typedArray.getBoolean(32, typedArray.getBoolean(14, true)); 
    this.C = typedArray.getBoolean(24, typedArray.getBoolean(15, false));
    this.x = typedArray.getBoolean(25, typedArray.getBoolean(25, true));
    this.D = typedArray.getBoolean(20, typedArray.getBoolean(20, false));
    typedArray.recycle();
  }
  
  public static void A(View paramView, boolean paramBoolean) {
    paramView.setEnabled(paramBoolean);
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (int i = viewGroup.getChildCount() - 1; i >= 0; i--)
        A(viewGroup.getChildAt(i), paramBoolean); 
    } 
  }
  
  public void B(CharSequence paramCharSequence) {
    if (this.M == null) {
      if (!TextUtils.equals(this.j, paramCharSequence)) {
        this.j = paramCharSequence;
        j();
      } 
      return;
    } 
    tp.f("Preference already has a SummaryProvider set.");
  }
  
  public final void C(boolean paramBoolean) {
    if (this.x != paramBoolean) {
      this.x = paramBoolean;
      z91 z911 = this.H;
      if (z911 != null) {
        Handler handler = z911.h;
        e3 e3 = z911.i;
        handler.removeCallbacks((Runnable)e3);
        handler.post((Runnable)e3);
      } 
    } 
  }
  
  public boolean D() {
    return i() ^ true;
  }
  
  public final boolean E() {
    return (this.c != null && this.s && !TextUtils.isEmpty(this.m));
  }
  
  public void a(Bundle paramBundle) {
    String str = this.m;
    if (!TextUtils.isEmpty(str)) {
      Parcelable parcelable = paramBundle.getParcelable(str);
      if (parcelable != null) {
        this.K = false;
        r(parcelable);
        if (!this.K)
          tp.f("Derived class did not call super.onRestoreInstanceState()"); 
      } 
    } 
  }
  
  public void b(Bundle paramBundle) {
    String str = this.m;
    if (!TextUtils.isEmpty(str)) {
      this.K = false;
      Parcelable parcelable = s();
      if (this.K) {
        if (parcelable != null) {
          paramBundle.putParcelable(str, parcelable);
          return;
        } 
      } else {
        tp.f("Derived class did not call super.onSaveInstanceState()");
      } 
    } 
  }
  
  public final Drawable c() {
    if (this.l == null) {
      int i = this.k;
      if (i != 0)
        this.l = ws2.I(this.b, i); 
    } 
    return this.l;
  }
  
  public final int compareTo(Object paramObject) {
    Preference preference = (Preference)paramObject;
    int j = this.h;
    int i = preference.h;
    if (j != i)
      return j - i; 
    CharSequence charSequence = this.i;
    paramObject = preference.i;
    return (charSequence == paramObject) ? 0 : ((charSequence == null) ? 1 : ((paramObject == null) ? -1 : charSequence.toString().compareToIgnoreCase(preference.i.toString())));
  }
  
  public long d() {
    return this.e;
  }
  
  public final int e(int paramInt) {
    return !E() ? paramInt : this.c.b().getInt(this.m, paramInt);
  }
  
  public final String f(String paramString) {
    return !E() ? paramString : this.c.b().getString(this.m, paramString);
  }
  
  public CharSequence g() {
    o91 o911 = this.M;
    return (o911 != null) ? o911.j(this) : this.j;
  }
  
  public final CharSequence h() {
    return this.i;
  }
  
  public boolean i() {
    return (this.q && this.v && this.w);
  }
  
  public void j() {
    z91 z911 = this.H;
    if (z911 != null) {
      int i = z911.f.indexOf(this);
      if (i != -1)
        ((id1)z911).a.d(i, 1, this); 
    } 
  }
  
  public void k(boolean paramBoolean) {
    ArrayList<Preference> arrayList = this.I;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        Preference preference = arrayList.get(b);
        if (preference.v == paramBoolean) {
          preference.v = paramBoolean ^ true;
          preference.k(preference.D());
          preference.j();
        } 
      } 
    } 
  }
  
  public void l() {
    String str = this.t;
    if (!TextUtils.isEmpty(str)) {
      ba1 ba11 = this.c;
      Preference preference = null;
      if (ba11 != null) {
        PreferenceScreen preferenceScreen = ba11.g;
        if (preferenceScreen != null)
          preference = preferenceScreen.F(str); 
      } 
      if (preference != null) {
        if (preference.I == null)
          preference.I = new ArrayList(); 
        preference.I.add(this);
        boolean bool = preference.D();
        if (this.v == bool) {
          this.v = bool ^ true;
          k(D());
          j();
        } 
        return;
      } 
      StringBuilder stringBuilder = x41.q("Dependency \"", str, "\" not found for preference \"");
      stringBuilder.append(this.m);
      stringBuilder.append("\" (title: \"");
      stringBuilder.append(this.i);
      stringBuilder.append("\"");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public final void m(ba1 paramba1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield c : Lba1;
    //   5: aload_0
    //   6: getfield f : Z
    //   9: ifne -> 43
    //   12: aload_1
    //   13: monitorenter
    //   14: aload_1
    //   15: getfield b : J
    //   18: lstore_2
    //   19: aload_1
    //   20: lconst_1
    //   21: lload_2
    //   22: ladd
    //   23: putfield b : J
    //   26: aload_1
    //   27: monitorexit
    //   28: aload_0
    //   29: lload_2
    //   30: putfield e : J
    //   33: goto -> 43
    //   36: astore #4
    //   38: aload_1
    //   39: monitorexit
    //   40: aload #4
    //   42: athrow
    //   43: aload_0
    //   44: invokevirtual E : ()Z
    //   47: ifeq -> 91
    //   50: aload_0
    //   51: getfield c : Lba1;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull -> 67
    //   59: aload_1
    //   60: invokevirtual b : ()Landroid/content/SharedPreferences;
    //   63: astore_1
    //   64: goto -> 69
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_1
    //   70: aload_0
    //   71: getfield m : Ljava/lang/String;
    //   74: invokeinterface contains : (Ljava/lang/String;)Z
    //   79: ifne -> 85
    //   82: goto -> 91
    //   85: aload_0
    //   86: aconst_null
    //   87: invokevirtual u : (Ljava/lang/Object;)V
    //   90: return
    //   91: aload_0
    //   92: getfield u : Ljava/lang/Object;
    //   95: astore_1
    //   96: aload_1
    //   97: ifnull -> 105
    //   100: aload_0
    //   101: aload_1
    //   102: invokevirtual u : (Ljava/lang/Object;)V
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   14	28	36	finally
    //   38	40	36	finally
  }
  
  public void n(da1 paramda1) {
    View view = ((he1)paramda1).b;
    view.setOnClickListener((View.OnClickListener)this.N);
    view.setId(0);
    TextView textView = (TextView)paramda1.s(16908304);
    byte b = 8;
    if (textView != null) {
      CharSequence charSequence = g();
      if (!TextUtils.isEmpty(charSequence)) {
        textView.setText(charSequence);
        textView.setVisibility(0);
        Integer integer = Integer.valueOf(textView.getCurrentTextColor());
      } else {
        textView.setVisibility(8);
        charSequence = null;
      } 
      textView = (TextView)paramda1.s(16908310);
      boolean bool1 = this.r;
      if (textView != null) {
        CharSequence charSequence1 = this.i;
        if (!TextUtils.isEmpty(charSequence1)) {
          textView.setText(charSequence1);
          textView.setVisibility(0);
          if (this.A)
            textView.setSingleLine(this.B); 
          if (!bool1 && i() && charSequence != null)
            textView.setTextColor(charSequence.intValue()); 
        } else {
          textView.setVisibility(8);
        } 
      } 
      ImageView imageView = (ImageView)paramda1.s(16908294);
      boolean bool2 = this.C;
      if (imageView != null) {
        int i = this.k;
        if (i != 0 || this.l != null) {
          if (this.l == null)
            this.l = ws2.I(this.b, i); 
          Drawable drawable = this.l;
          if (drawable != null)
            imageView.setImageDrawable(drawable); 
        } 
        if (this.l != null) {
          imageView.setVisibility(0);
        } else {
          if (bool2) {
            i = 4;
          } else {
            i = 8;
          } 
          imageView.setVisibility(i);
        } 
      } 
      View view2 = paramda1.s(2131296812);
      View view1 = view2;
      if (view2 == null)
        view1 = paramda1.s(16908350); 
      if (view1 != null)
        if (this.l != null) {
          view1.setVisibility(0);
        } else {
          byte b1 = b;
          if (bool2)
            b1 = 4; 
          view1.setVisibility(b1);
        }  
      if (this.E) {
        A(view, i());
      } else {
        A(view, true);
      } 
      view.setFocusable(bool1);
      view.setClickable(bool1);
      paramda1.z = this.y;
      paramda1.A = this.z;
      bool2 = this.D;
      if (bool2 && this.L == null)
        this.L = new n91(this); 
      if (bool2) {
        n91 n911 = this.L;
      } else {
        paramda1 = null;
      } 
      view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)paramda1);
      view.setLongClickable(bool2);
      if (bool2 && !bool1) {
        WeakHashMap weakHashMap = v22.a;
        view.setBackground(null);
      } 
      return;
    } 
    Object object = null;
  }
  
  public void o() {}
  
  public void p() {
    String str = this.t;
    if (str != null) {
      ba1 ba11 = this.c;
      Preference preference = null;
      if (ba11 != null) {
        PreferenceScreen preferenceScreen = ba11.g;
        if (preferenceScreen != null)
          preference = preferenceScreen.F(str); 
      } 
      if (preference != null) {
        ArrayList arrayList = preference.I;
        if (arrayList != null)
          arrayList.remove(this); 
      } 
    } 
  }
  
  public Object q(TypedArray paramTypedArray, int paramInt) {
    return null;
  }
  
  public void r(Parcelable paramParcelable) {
    this.K = true;
    if (paramParcelable != AbsSavedState.EMPTY_STATE && paramParcelable != null)
      l0.l("Wrong state class -- expecting Preference State"); 
  }
  
  public Parcelable s() {
    this.K = true;
    return (Parcelable)AbsSavedState.EMPTY_STATE;
  }
  
  public void t(Object paramObject) {}
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    CharSequence charSequence = this.i;
    if (!TextUtils.isEmpty(charSequence)) {
      stringBuilder.append(charSequence);
      stringBuilder.append(' ');
    } 
    charSequence = g();
    if (!TextUtils.isEmpty(charSequence)) {
      stringBuilder.append(charSequence);
      stringBuilder.append(' ');
    } 
    if (stringBuilder.length() > 0)
      stringBuilder.setLength(stringBuilder.length() - 1); 
    return stringBuilder.toString();
  }
  
  public void u(Object paramObject) {
    t(paramObject);
  }
  
  public final void v() {
    if (i() && this.r) {
      o();
      m91 m911 = this.g;
      if (m911 == null || !m911.m(this)) {
        ba1 ba11 = this.c;
        if (ba11 != null) {
          w91 w91 = ba11.h;
          if (w91 != null) {
            String str = this.o;
            if (str != null) {
              w91 w911 = w91;
              while (w911 != null)
                ua0 ua01 = ((ua0)w911).z; 
              Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
              lb0 lb0 = w91.R();
              if (this.p == null)
                this.p = new Bundle(); 
              Bundle bundle = this.p;
              eb0 eb0 = lb0.J();
              w91.t0().getClassLoader();
              ua0 ua0 = eb0.a(str);
              ua0.x0(bundle);
              ua0.z0((ua0)w91);
              lb lb = new lb(lb0);
              lb.k(((View)w91.v0().getParent()).getId(), ua0, null);
              lb.c(null);
              lb.f();
              return;
            } 
          } 
        } 
        Intent intent = this.n;
        if (intent != null)
          this.b.startActivity(intent); 
      } 
    } 
  }
  
  public void w(View paramView) {
    v();
  }
  
  public boolean x(int paramInt) {
    if (!E())
      return false; 
    if (paramInt != e(paramInt ^ 0xFFFFFFFF)) {
      SharedPreferences.Editor editor = this.c.a();
      editor.putInt(this.m, paramInt);
      if (!this.c.e)
        editor.apply(); 
    } 
    return true;
  }
  
  public final void y(String paramString) {
    if (!E())
      return; 
    if (!TextUtils.equals(paramString, f(null))) {
      SharedPreferences.Editor editor = this.c.a();
      editor.putString(this.m, paramString);
      if (!this.c.e)
        editor.apply(); 
    } 
  }
  
  public final void z(boolean paramBoolean) {
    if (this.q != paramBoolean) {
      this.q = paramBoolean;
      k(D());
      j();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\Preference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */