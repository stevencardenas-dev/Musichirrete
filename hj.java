import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.IOException;
import java.util.ArrayList;

public final class hj extends id1 {
  public final ArrayList d = new ArrayList();
  
  public final LayoutInflater e;
  
  public final Drawable f;
  
  public final Drawable g;
  
  public final Drawable h;
  
  public final Drawable i;
  
  public final jj j;
  
  public hj(jj paramjj) {
    Context context = paramjj.k;
    this.e = LayoutInflater.from(context);
    this.f = dd1.B(context, 2130969647);
    this.g = dd1.B(context, 2130969656);
    this.h = dd1.B(context, 2130969653);
    this.i = dd1.B(context, 2130969652);
    l();
  }
  
  public final int c() {
    return this.d.size();
  }
  
  public final int f(int paramInt) {
    ((ej)this.d.get(paramInt)).getClass();
    return 2;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    Drawable drawable;
    f(paramInt);
    ej ej = this.d.get(paramInt);
    paramhe1 = paramhe1;
    hv0 hv0 = (hv0)ej.a;
    View view = ((gj)paramhe1).w;
    view.setVisibility(0);
    ((gj)paramhe1).y.setVisibility(4);
    view.setOnClickListener(new fj(0, paramhe1, hv0));
    ((gj)paramhe1).z.setText(hv0.d);
    ImageView imageView = ((gj)paramhe1).x;
    hj hj1 = ((gj)paramhe1).A;
    Uri uri = hv0.f;
    if (uri != null)
      try {
        drawable = Drawable.createFromStream(hj1.j.k.getContentResolver().openInputStream(uri), null);
        if (drawable != null) {
          imageView.setImageDrawable(drawable);
          return;
        } 
      } catch (IOException iOException) {} 
    paramInt = hv0.n;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (hv0.e()) {
          drawable = hj1.i;
        } else {
          drawable = hj1.f;
        } 
      } else {
        drawable = hj1.h;
      } 
    } else {
      drawable = hj1.g;
    } 
    imageView.setImageDrawable(drawable);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    if (paramInt == 2)
      return new gj(this, this.e.inflate(2131493007, paramViewGroup, false)); 
    throw new IllegalStateException();
  }
  
  public final void l() {
    ArrayList<ej> arrayList1 = this.d;
    arrayList1.clear();
    ArrayList<Object> arrayList = this.j.n;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      hv0 hv0 = (hv0)arrayList.get(b);
      b++;
      arrayList1.add(new ej(hv0));
    } 
    g();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */