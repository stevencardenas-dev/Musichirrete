import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class z91 extends id1 {
  public final PreferenceGroup d;
  
  public ArrayList e;
  
  public ArrayList f;
  
  public final ArrayList g;
  
  public final Handler h;
  
  public final e3 i = new e3(27, this);
  
  public z91(PreferenceGroup paramPreferenceGroup) {
    this.d = paramPreferenceGroup;
    this.h = new Handler(Looper.getMainLooper());
    ((Preference)paramPreferenceGroup).H = this;
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new ArrayList();
    if (paramPreferenceGroup instanceof PreferenceScreen) {
      boolean bool = ((PreferenceScreen)paramPreferenceGroup).U;
      if (!this.a.a()) {
        this.b = bool;
      } else {
        tp.f("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        throw null;
      } 
    } else if (!this.a.a()) {
      this.b = true;
    } else {
      tp.f("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      throw null;
    } 
    p();
  }
  
  public final int c() {
    return this.f.size();
  }
  
  public final long e(int paramInt) {
    return !this.b ? -1L : n(paramInt).d();
  }
  
  public final int f(int paramInt) {
    y91 y91 = new y91(n(paramInt));
    ArrayList<y91> arrayList = this.g;
    paramInt = arrayList.indexOf(y91);
    if (paramInt != -1)
      return paramInt; 
    paramInt = arrayList.size();
    arrayList.add(y91);
    return paramInt;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    da1 da1 = (da1)paramhe1;
    Preference preference = n(paramInt);
    ColorStateList colorStateList = da1.x;
    View view = da1.b;
    Drawable drawable2 = view.getBackground();
    Drawable drawable1 = da1.w;
    if (drawable2 != drawable1) {
      WeakHashMap weakHashMap = v22.a;
      view.setBackground(drawable1);
    } 
    TextView textView = (TextView)da1.s(16908310);
    if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList))
      textView.setTextColor(colorStateList); 
    preference.n(da1);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    y91 y91 = this.g.get(paramInt);
    LayoutInflater layoutInflater = LayoutInflater.from(paramViewGroup.getContext());
    TypedArray typedArray = paramViewGroup.getContext().obtainStyledAttributes(null, jc1.a);
    Drawable drawable2 = typedArray.getDrawable(0);
    Drawable drawable1 = drawable2;
    if (drawable2 == null)
      drawable1 = ws2.I(paramViewGroup.getContext(), 17301602); 
    typedArray.recycle();
    View view = layoutInflater.inflate(y91.a, paramViewGroup, false);
    if (view.getBackground() == null) {
      WeakHashMap weakHashMap = v22.a;
      view.setBackground(drawable1);
    } 
    ViewGroup viewGroup = (ViewGroup)view.findViewById(16908312);
    if (viewGroup != null) {
      paramInt = y91.b;
      if (paramInt != 0) {
        layoutInflater.inflate(paramInt, viewGroup);
      } else {
        viewGroup.setVisibility(8);
      } 
    } 
    return new da1(view);
  }
  
  public final ArrayList l(PreferenceGroup paramPreferenceGroup) {
    ArrayList<Preference> arrayList2 = new ArrayList();
    ArrayList<Preference> arrayList1 = new ArrayList();
    int k = paramPreferenceGroup.P.size();
    boolean bool = false;
    int j = 0;
    int i = 0;
    while (true) {
      ArrayList<Object> arrayList;
      Preference preference = null;
      if (j < k) {
        int n;
        preference = paramPreferenceGroup.G(j);
        if (!preference.x) {
          n = i;
        } else {
          n = paramPreferenceGroup.T;
          if (n == Integer.MAX_VALUE || i < n) {
            arrayList2.add(preference);
          } else {
            arrayList1.add(preference);
          } 
          if (!(preference instanceof PreferenceGroup)) {
            n = i + 1;
          } else {
            PreferenceGroup preferenceGroup = (PreferenceGroup)preference;
            if (preferenceGroup instanceof PreferenceScreen) {
              n = i;
            } else if (paramPreferenceGroup.T == Integer.MAX_VALUE || preferenceGroup.T == Integer.MAX_VALUE) {
              arrayList = l(preferenceGroup);
              int i1 = arrayList.size();
              byte b = 0;
              while (true) {
                n = i;
                if (b < i1) {
                  Preference preference1 = (Preference)arrayList.get(b);
                  b++;
                  preference1 = preference1;
                  n = paramPreferenceGroup.T;
                  if (n == Integer.MAX_VALUE || i < n) {
                    arrayList2.add(preference1);
                  } else {
                    arrayList1.add(preference1);
                  } 
                  i++;
                  continue;
                } 
                break;
              } 
            } else {
              tp.f("Nesting an expandable group inside of another expandable group is not supported!");
              return null;
            } 
          } 
        } 
        j++;
        i = n;
        continue;
      } 
      int m = paramPreferenceGroup.T;
      if (m != Integer.MAX_VALUE && i > m) {
        CharSequence charSequence;
        Context context1 = ((Preference)paramPreferenceGroup).b;
        long l = ((Preference)paramPreferenceGroup).e;
        Preference preference1 = new Preference(context1, null);
        preference1.F = 2131492985;
        Context context2 = preference1.b;
        Drawable drawable = ws2.I(context2, 2131231079);
        if (preference1.l != drawable) {
          preference1.l = drawable;
          preference1.k = 0;
          preference1.j();
        } 
        preference1.k = 2131231079;
        String str = context2.getString(2131886533);
        if (!TextUtils.equals(str, preference1.i)) {
          preference1.i = str;
          preference1.j();
        } 
        if (999 != preference1.h) {
          preference1.h = 999;
          z91 z911 = preference1.H;
          if (z911 != null) {
            Handler handler = z911.h;
            e3 e31 = z911.i;
            handler.removeCallbacks(e31);
            handler.post(e31);
          } 
        } 
        ArrayList<PreferenceGroup> arrayList3 = new ArrayList();
        j = arrayList1.size();
        i = bool;
        while (i < j) {
          str = (String)arrayList1.get(i);
          m = i + 1;
          Preference preference2 = (Preference)str;
          CharSequence charSequence1 = preference2.i;
          boolean bool1 = preference2 instanceof PreferenceGroup;
          if (bool1 && !TextUtils.isEmpty(charSequence1))
            arrayList3.add((PreferenceGroup)preference2); 
          if (arrayList3.contains(preference2.J)) {
            i = m;
            if (bool1) {
              arrayList3.add((PreferenceGroup)preference2);
              i = m;
            } 
            continue;
          } 
          i = m;
          if (!TextUtils.isEmpty(charSequence1)) {
            if (arrayList == null) {
              charSequence = charSequence1;
              i = m;
              continue;
            } 
            charSequence = context2.getString(2131887466, new Object[] { charSequence, charSequence1 });
            i = m;
          } 
        } 
        preference1.B(charSequence);
        ((x60)preference1).O = l + 1000000L;
        preference1.g = new j01(2, this, paramPreferenceGroup);
        arrayList2.add(preference1);
      } 
      return arrayList2;
    } 
  }
  
  public final void m(ArrayList<Preference> paramArrayList, PreferenceGroup paramPreferenceGroup) {
    // Byte code:
    //   0: aload_2
    //   1: monitorenter
    //   2: aload_2
    //   3: getfield P : Ljava/util/ArrayList;
    //   6: invokestatic sort : (Ljava/util/List;)V
    //   9: aload_2
    //   10: monitorexit
    //   11: aload_2
    //   12: getfield P : Ljava/util/ArrayList;
    //   15: invokevirtual size : ()I
    //   18: istore #4
    //   20: iconst_0
    //   21: istore_3
    //   22: iload_3
    //   23: iload #4
    //   25: if_icmpge -> 117
    //   28: aload_2
    //   29: iload_3
    //   30: invokevirtual G : (I)Landroidx/preference/Preference;
    //   33: astore #5
    //   35: aload_1
    //   36: aload #5
    //   38: invokevirtual add : (Ljava/lang/Object;)Z
    //   41: pop
    //   42: new y91
    //   45: dup
    //   46: aload #5
    //   48: invokespecial <init> : (Landroidx/preference/Preference;)V
    //   51: astore #6
    //   53: aload_0
    //   54: getfield g : Ljava/util/ArrayList;
    //   57: aload #6
    //   59: invokevirtual contains : (Ljava/lang/Object;)Z
    //   62: ifne -> 75
    //   65: aload_0
    //   66: getfield g : Ljava/util/ArrayList;
    //   69: aload #6
    //   71: invokevirtual add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload #5
    //   77: instanceof androidx/preference/PreferenceGroup
    //   80: ifeq -> 105
    //   83: aload #5
    //   85: checkcast androidx/preference/PreferenceGroup
    //   88: astore #6
    //   90: aload #6
    //   92: instanceof androidx/preference/PreferenceScreen
    //   95: ifne -> 105
    //   98: aload_0
    //   99: aload_1
    //   100: aload #6
    //   102: invokevirtual m : (Ljava/util/ArrayList;Landroidx/preference/PreferenceGroup;)V
    //   105: aload #5
    //   107: aload_0
    //   108: putfield H : Lz91;
    //   111: iinc #3, 1
    //   114: goto -> 22
    //   117: return
    //   118: astore_1
    //   119: aload_2
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	118	finally
    //   119	121	118	finally
  }
  
  public final Preference n(int paramInt) {
    return (paramInt < 0 || paramInt >= this.f.size()) ? null : this.f.get(paramInt);
  }
  
  public final int o(String paramString) {
    int i = this.f.size();
    for (byte b = 0; b < i; b++) {
      if (TextUtils.equals(paramString, ((Preference)this.f.get(b)).m))
        return b; 
    } 
    return -1;
  }
  
  public final void p() {
    ArrayList<Object> arrayList1 = this.e;
    int i = arrayList1.size();
    boolean bool = false;
    byte b = 0;
    while (b < i) {
      Object object = arrayList1.get(b);
      b++;
      ((Preference)object).H = null;
    } 
    arrayList1 = new ArrayList<Object>(this.e.size());
    this.e = arrayList1;
    PreferenceGroup preferenceGroup = this.d;
    m(arrayList1, preferenceGroup);
    this.f = l(preferenceGroup);
    g();
    ArrayList<ArrayList<Object>> arrayList = this.e;
    i = arrayList.size();
    b = bool;
    while (b < i) {
      arrayList1 = arrayList.get(b);
      b++;
      ((Preference)arrayList1).getClass();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */