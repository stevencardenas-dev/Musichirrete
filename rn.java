import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.providers.AAProvider;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public final class rn extends id1 {
  public static final int[] k = new int[] { -1, 0, 1, 2, 3, 4, 5, 6, 7 };
  
  public static final int[] l = new int[] { 2131886223, 2131887004, 2131887026, 2131886476, 2131886436, 2131887601, 2131886205, 2131886150, 2131886394 };
  
  public static final int[] m = new int[] { -1, 0, 1, 2, 3, 4 };
  
  public static final int[] n = new int[] { 2131886223, 2131887004, 2131887026, 2131886476, 2131886436, 2131887601 };
  
  public int d;
  
  public ArrayList e;
  
  public LayoutInflater f;
  
  public wn g;
  
  public Context h;
  
  public int i;
  
  public int j;
  
  public final int c() {
    return this.e.size();
  }
  
  public final int f(int paramInt) {
    return this.i;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    String str;
    xn xn = (xn)paramhe1;
    q3 q3 = this.e.get(paramInt);
    TextView textView2 = xn.w;
    TextView textView1 = xn.x;
    textView2.setText(q3.c);
    ImageView imageView = xn.z;
    if (imageView != null) {
      v61 v61 = MyApplication.v;
      paramInt = q3.i;
      HashMap hashMap = p3.a;
      ag1 ag1 = v61.f(AAProvider.c(paramInt, m92.k, false));
      ag1.d = true;
      ag1.a();
      ag1.k();
      ag1.c = true;
      ag1.f(imageView);
    } 
    paramInt = this.d;
    if (paramInt == 1) {
      int i;
      Resources resources = this.h.getResources();
      ArrayList arrayList = q3.m;
      if (arrayList != null) {
        paramInt = arrayList.size();
      } else {
        paramInt = q3.s;
      } 
      arrayList = q3.m;
      if (arrayList != null) {
        i = arrayList.size();
      } else {
        i = q3.s;
      } 
      str = resources.getQuantityString(2131755061, paramInt, new Object[] { Integer.valueOf(i) });
    } else if (paramInt == 2) {
      str = ag0.B(((q3)str).l, false, 0);
    } else if (paramInt == 3) {
      Date date = new Date(((q3)str).k);
      str = DateFormat.getDateInstance().format(date);
    } else if (paramInt == 4) {
      str = String.valueOf(((q3)str).j);
    } else if (paramInt == 5) {
      str = String.valueOf(((q3)str).e);
    } else if (paramInt == 6) {
      str = String.valueOf(((q3)str).f);
    } else if (paramInt == 7) {
      str = String.valueOf(((q3)str).g);
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
    paramInt = this.i;
    if (paramInt == 1) {
      paramInt = 2131493025;
    } else if (paramInt == 2) {
      paramInt = 2131493024;
    } else {
      paramInt = 2131493027;
    } 
    View view = this.f.inflate(paramInt, paramViewGroup, false);
    he1 he1 = new he1(view);
    ((xn)he1).w = (TextView)view.findViewById(2131297688);
    ((xn)he1).x = (TextView)view.findViewById(2131297750);
    ImageView imageView = (ImageView)view.findViewById(2131296913);
    ((xn)he1).z = imageView;
    ((xn)he1).y = this;
    if (this.i == 2 && this.j > 0)
      (imageView.getLayoutParams()).height = this.j; 
    view.setOnClickListener((View.OnClickListener)he1);
    view.setOnLongClickListener((View.OnLongClickListener)he1);
    return he1;
  }
  
  public final void k(he1 paramhe1) {
    ImageView imageView = ((xn)paramhe1).z;
    if (imageView != null)
      MyApplication.v.a(imageView); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */