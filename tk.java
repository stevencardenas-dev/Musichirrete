import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.xm.VDgS;
import java.util.ArrayList;
import java.util.Stack;

public final class tk {
  public final int a;
  
  public int b;
  
  public Object c;
  
  public Object d;
  
  public Object e;
  
  public Object f;
  
  public tk(Context paramContext, Stack paramStack, int paramInt, zy paramzy) {
    this.c = paramContext;
    this.d = paramzy;
    this.e = paramStack;
    this.b = paramInt;
    ms0 ms0 = new ms0(paramContext);
    RecyclerView recyclerView = new RecyclerView(paramContext);
    recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramInt = (int)paramContext.getResources().getDimension(2131166362);
    recyclerView.setPadding(paramInt, paramInt, paramInt, paramInt);
    recyclerView.setAdapter(new a3(4, this));
    recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
    ms0.q(2131887136);
    ms0.f((View)recyclerView, false);
    this.f = new ss0(ms0);
  }
  
  public tk(xy paramxy) {
    this.b = 0;
    this.c = paramxy;
    this.d = new sk(0);
    this.e = new ArrayList();
  }
  
  public void a(View paramView, int paramInt, boolean paramBoolean) {
    RecyclerView recyclerView = ((xy)this.c).b;
    if (paramInt < 0) {
      paramInt = recyclerView.getChildCount();
    } else {
      paramInt = f(paramInt);
    } 
    ((sk)this.d).e(paramInt, paramBoolean);
    if (paramBoolean)
      i(paramView); 
    recyclerView.addView(paramView, paramInt);
    RecyclerView.O(paramView);
    ArrayList arrayList = recyclerView.E;
    if (arrayList != null)
      for (paramInt = arrayList.size() - 1; paramInt >= 0; paramInt--)
        ((ij0)recyclerView.E.get(paramInt)).getClass();  
  }
  
  public void b(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean) {
    StringBuilder stringBuilder1;
    String str;
    StringBuilder stringBuilder2;
    RecyclerView recyclerView = ((xy)this.c).b;
    if (paramInt < 0) {
      paramInt = recyclerView.getChildCount();
    } else {
      paramInt = f(paramInt);
    } 
    ((sk)this.d).e(paramInt, paramBoolean);
    if (paramBoolean)
      i(paramView); 
    he1 he1 = RecyclerView.O(paramView);
    if (he1 != null) {
      if (he1.l() || he1.q()) {
        if (RecyclerView.F0) {
          StringBuilder stringBuilder = new StringBuilder("reAttach ");
          stringBuilder.append(he1);
          Log.d("RecyclerView", stringBuilder.toString());
        } 
        he1.l &= 0xFFFFFEFF;
      } else {
        stringBuilder1 = new StringBuilder("Called attach on a child which is not detached: ");
        stringBuilder1.append(he1);
        l0.j(stringBuilder1, recyclerView.B());
        return;
      } 
    } else if (RecyclerView.E0) {
      stringBuilder2 = new StringBuilder("No ViewHolder found for child: ");
      stringBuilder2.append(stringBuilder1);
      str = recyclerView.B();
      stringBuilder2.append(", index: ");
      stringBuilder2.append(paramInt);
      stringBuilder2.append(str);
      throw new IllegalArgumentException(stringBuilder2.toString());
    } 
    RecyclerView.a(recyclerView, (View)str, paramInt, (ViewGroup.LayoutParams)stringBuilder2);
  }
  
  public void c(int paramInt) {
    String str;
    paramInt = f(paramInt);
    ((sk)this.d).g(paramInt);
    RecyclerView recyclerView = ((xy)this.c).b;
    View view = recyclerView.getChildAt(paramInt);
    if (view != null) {
      he1 he1 = RecyclerView.O(view);
      if (he1 != null)
        if (!he1.l() || he1.q()) {
          if (RecyclerView.F0) {
            StringBuilder stringBuilder = new StringBuilder("tmpDetach ");
            stringBuilder.append(he1);
            Log.d("RecyclerView", stringBuilder.toString());
          } 
          he1.a(256);
        } else {
          StringBuilder stringBuilder = new StringBuilder("called detach on an already detached child ");
          stringBuilder.append(he1);
          l0.j(stringBuilder, recyclerView.B());
          return;
        }  
    } else if (RecyclerView.E0) {
      str = recyclerView.B();
      StringBuilder stringBuilder = new StringBuilder(VDgS.LaEinBxMhdZIQo);
      stringBuilder.append(paramInt);
      stringBuilder.append(str);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    RecyclerView.b((RecyclerView)str, paramInt);
  }
  
  public View d(int paramInt) {
    paramInt = f(paramInt);
    return ((xy)this.c).b.getChildAt(paramInt);
  }
  
  public int e() {
    return ((xy)this.c).b.getChildCount() - ((ArrayList)this.e).size();
  }
  
  public int f(int paramInt) {
    sk sk = (sk)this.d;
    if (paramInt >= 0) {
      int j = ((xy)this.c).b.getChildCount();
      for (int i = paramInt; i < j; i += k) {
        int k = paramInt - i - sk.b(i);
        if (k == 0) {
          while (sk.d(i))
            i++; 
          return i;
        } 
      } 
    } 
    return -1;
  }
  
  public View g(int paramInt) {
    return ((xy)this.c).b.getChildAt(paramInt);
  }
  
  public int h() {
    return ((xy)this.c).b.getChildCount();
  }
  
  public void i(View paramView) {
    ((ArrayList<View>)this.e).add(paramView);
    xy xy = (xy)this.c;
    he1 he1 = RecyclerView.O(paramView);
    if (he1 != null) {
      paramView = he1.b;
      RecyclerView recyclerView = xy.b;
      int i = he1.s;
      if (i != -1) {
        he1.r = i;
      } else {
        he1.r = paramView.getImportantForAccessibility();
      } 
      if (recyclerView.R()) {
        he1.s = 4;
        recyclerView.w0.add(he1);
        return;
      } 
      paramView.setImportantForAccessibility(4);
    } 
  }
  
  public void j(int paramInt) {
    xy xy = (xy)this.c;
    int i = this.b;
    if (i != 1) {
      if (i != 2) {
        try {
          paramInt = f(paramInt);
          View view = xy.b.getChildAt(paramInt);
          if (view == null) {
            this.b = 0;
            this.f = null;
            return;
          } 
          this.b = 1;
          this.f = view;
          if (((sk)this.d).g(paramInt))
            k(view); 
        } finally {}
        xy.j(paramInt);
        this.b = 0;
        this.f = null;
        return;
      } 
      tp.f("Cannot call removeView(At) within removeViewIfHidden");
      return;
    } 
    tp.f("Cannot call removeView(At) within removeView(At)");
  }
  
  public void k(View paramView) {
    if (((ArrayList)this.e).remove(paramView)) {
      xy xy = (xy)this.c;
      he1 he1 = RecyclerView.O(paramView);
      if (he1 != null) {
        RecyclerView recyclerView = xy.b;
        int i = he1.r;
        if (recyclerView.R()) {
          he1.s = i;
          recyclerView.w0.add(he1);
        } else {
          he1.b.setImportantForAccessibility(i);
        } 
        he1.r = 0;
      } 
    } 
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(((sk)this.d).toString());
    stringBuilder.append(", hidden list:");
    stringBuilder.append(((ArrayList)this.e).size());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */