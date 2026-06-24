import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class u90 extends id1 implements cj0 {
  public ArrayList d;
  
  public ArrayList e;
  
  public Context f;
  
  public LayoutInflater g;
  
  public boolean h;
  
  public gf0 i;
  
  public final void a(int paramInt) {
    paramInt = l(paramInt);
    gf0 gf01 = this.i;
    if (gf01 != null)
      gf01.J(this.e.get(paramInt)); 
  }
  
  public final void b(int paramInt) {
    int i = l(paramInt);
    if (my0.d())
      this.h = true; 
    my0.j(this.e.get(i));
    h(paramInt);
  }
  
  public final int c() {
    ArrayList arrayList = this.d;
    if (arrayList != null) {
      int i = arrayList.size();
      arrayList = this.e;
      if (arrayList != null) {
        int j = arrayList.size();
        if (j > 0)
          return j + 1 + i; 
      } 
      return i;
    } 
    return 0;
  }
  
  public final void d(int paramInt) {
    int i = l(paramInt);
    if (my0.d()) {
      this.h = true;
      my0.j(this.e.get(i));
      h(paramInt);
      return;
    } 
    gf0 gf01 = this.i;
    if (gf01 != null)
      gf01.d(i); 
  }
  
  public final int f(int paramInt) {
    boolean bool;
    if (paramInt < this.d.size()) {
      bool = false;
    } else {
      bool = true;
    } 
    if (paramInt == this.d.size())
      bool = true; 
    return (bool == 2 && my0.e(((km0)this.e.get(l(paramInt))).b)) ? 3 : bool;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    ImageView imageView;
    int i = f(paramInt);
    if (i == 2 || i == 3) {
      km0 km0 = this.e.get(l(paramInt));
      Uri uri = p3.l(km0);
      paramhe1 = paramhe1;
      TextView textView = ((yn1)paramhe1).y;
      String str = ag0.W(km0);
      qn1 qn1 = km0.c;
      textView.setText(str);
      ((yn1)paramhe1).w.setText(qn1.c);
      ((yn1)paramhe1).x.setText(qn1.e);
      ((yn1)paramhe1).z.setText(ag0.B(qn1.g, false, 0));
      ag1 ag1 = MyApplication.v.f(uri);
      ag1.d = true;
      ag1.a();
      ag1.c = true;
      ag1.k();
      ag1.f(((yn1)paramhe1).A);
      imageView = ((yn1)paramhe1).B;
      if (my0.d()) {
        imageView.setVisibility(0);
        if (my0.e(km0.b)) {
          imageView.setImageResource(2131230845);
          return;
        } 
        imageView.setImageResource(2131230844);
        return;
      } 
      imageView.setVisibility(8);
      return;
    } 
    if (i == 0) {
      jm0 jm0 = this.d.get(paramInt);
      t90 t90 = (t90)imageView;
      t90.w.setText(jm0.b());
      imageView = t90.x;
      paramInt = jm0.h;
      if (paramInt == -1)
        paramInt = 2131231146; 
      imageView.setImageResource(paramInt);
      return;
    } 
    if (i == 1) {
      s90 s90 = (s90)imageView;
      paramInt = this.e.size();
      s90.w.setText(this.f.getResources().getQuantityString(2131755068, paramInt, new Object[] { Integer.valueOf(paramInt) }));
    } 
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    LayoutInflater layoutInflater = this.g;
    boolean bool = false;
    if (paramInt == 0)
      return new t90(this, layoutInflater.inflate(2131493023, paramViewGroup, false)); 
    if (paramInt == 1)
      return new s90(this, layoutInflater.inflate(2131493009, paramViewGroup, false)); 
    View view = layoutInflater.inflate(2131493029, paramViewGroup, false);
    if (paramInt == 3)
      bool = true; 
    return new yn1(view, this, bool);
  }
  
  public final void k(he1 paramhe1) {
    if (paramhe1 instanceof yn1) {
      ImageView imageView = ((yn1)paramhe1).A;
      if (imageView != null)
        MyApplication.v.a(imageView); 
    } 
  }
  
  public final int l(int paramInt) {
    int i = paramInt - 1;
    ArrayList arrayList = this.d;
    paramInt = i;
    if (arrayList != null)
      paramInt = i - arrayList.size(); 
    return paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */