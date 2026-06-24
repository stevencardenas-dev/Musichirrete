import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class p90 extends id1 {
  public int d;
  
  public ArrayList e;
  
  public final LayoutInflater f;
  
  public final r90 g;
  
  public p90(r90 paramr90) {
    this.f = LayoutInflater.from(paramr90.P());
  }
  
  public static void l(p90 paramp90, ArrayList paramArrayList, int paramInt) {
    r90 r901 = paramp90.g;
    paramp90.e = paramArrayList;
    if (paramArrayList != null && paramArrayList.size() > 3) {
      r901.p0.setVisibility(0);
    } else {
      r901.p0.setVisibility(4);
    } 
    paramp90.d = paramInt;
    paramp90.g();
  }
  
  public final int c() {
    ArrayList arrayList = this.e;
    return (arrayList != null) ? arrayList.size() : 0;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    String str;
    q90 q90 = (q90)paramhe1;
    k90 k90 = this.e.get(paramInt);
    TextView textView2 = q90.x;
    TextView textView1 = q90.z;
    textView2.setText(k90.getName());
    paramInt = k90.b;
    ImageView imageView = q90.w;
    if (paramInt != -1) {
      imageView.setImageResource(paramInt);
    } else {
      imageView.setImageResource(2131231146);
    } 
    q90.y.setText(ml0.a(k90.e.b));
    paramInt = this.d;
    if (paramInt == 1) {
      int i;
      Resources resources = this.g.S();
      ArrayList arrayList = k90.f;
      if (arrayList != null) {
        paramInt = arrayList.size();
      } else {
        paramInt = k90.i;
      } 
      arrayList = k90.f;
      if (arrayList != null) {
        i = arrayList.size();
      } else {
        i = k90.i;
      } 
      str = resources.getQuantityString(2131755061, paramInt, new Object[] { Integer.valueOf(i) });
    } else if (paramInt == 2) {
      str = ag0.B(((k90)str).h, false, 0);
    } else if (paramInt == 3) {
      Date date = new Date(((k90)str).g);
      String str1 = DateFormat.getDateInstance().format(date);
    } else {
      str = null;
    } 
    if (this.d == 0) {
      textView1.setVisibility(8);
    } else {
      textView1.setVisibility(0);
    } 
    textView1.setText(str);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    View view = this.f.inflate(2131493023, paramViewGroup, false);
    return new q90(this.g, view);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */