import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class j81 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final ImageView w;
  
  public final TextView x;
  
  public final l81 y;
  
  public j81(l81 paraml81, View paramView) {
    super(paramView);
    this.w = (ImageView)paramView.findViewById(2131296882);
    this.x = (TextView)paramView.findViewById(2131297827);
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
  }
  
  public final void onClick(View paramView) {
    l81 l811 = this.y;
    l811.u0.setExpanded(true);
    int i = c();
    if (i >= 0)
      l811.L0(i); 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0) {
      l81 l811 = this.y;
      if (l811.C0 || i == 5)
        return false; 
      l811.a0 = i;
      l811.K0 = l811.G0(i);
      ArrayList arrayList = l811.J0(i);
      if (i == 0 || i == 1)
        z51.R(MyApplication.o().getInt("I_K_SRTBYF_PL", 0), arrayList); 
      l811.J0 = arrayList;
      ms0 ms0 = new ms0(l811.P());
      ms0.f = l811.K0;
      ms0.e(2131492930, false);
      LinearLayout linearLayout = (LinearLayout)ms0.u.findViewById(2131296973);
      int j = l811.a0;
      i = l81.i1;
      if (j > i) {
        TextView textView1 = (TextView)linearLayout.findViewById(2131296984);
        textView1.setText(2131887176);
        textView1.setVisibility(0);
        textView1 = (TextView)linearLayout.findViewById(2131296985);
        textView1.setText(2131886485);
        textView1.setVisibility(0);
        textView1 = (TextView)linearLayout.findViewById(2131297009);
        textView1.setText(2131887169);
        textView1.setVisibility(0);
      } 
      TextView textView = (TextView)linearLayout.findViewById(2131297021);
      textView.setText(2131887325);
      textView.setVisibility(0);
      if (my0.d()) {
        textView = (TextView)linearLayout.findViewById(2131296980);
        textView.setText(2131886454);
        textView.setVisibility(0);
      } 
      linearLayout.findViewById(2131297027).setVisibility(0);
      linearLayout.findViewById(2131296949).setVisibility(0);
      j = l811.a0;
      if (j == 1 || j > i) {
        linearLayout.findViewById(2131296986).setVisibility(0);
        linearLayout.findViewById(2131296979).setVisibility(0);
        linearLayout.findViewById(2131296991).setVisibility(0);
        linearLayout.findViewById(2131296975).setVisibility(0);
      } 
      if (!ws2.U())
        linearLayout.findViewById(2131297008).setVisibility(8); 
      if (l811.J0.size() == 0) {
        String str = ag0.a;
        int m = linearLayout.getChildCount();
        byte b = 0;
        i = 0;
        int k;
        for (k = i; b < m; k = j) {
          View view = linearLayout.getChildAt(b);
          j = k;
          if (k == 0) {
            if ("sg".equals(view.getTag()))
              view.setVisibility(8); 
            j = k;
            if (view.getId() == 2131297714)
              j = 1; 
          } 
          if (j != 0)
            view.setVisibility(8); 
          k = i;
          if (i == 0) {
            k = i;
            if (view.getVisibility() == 0) {
              k = i;
              if (!"s".equals(view.getTag()))
                k = 1; 
            } 
          } 
          b++;
          i = k;
        } 
        if (i == 0) {
          ag0.O0(2131887496, 0);
          return true;
        } 
      } 
      ag0.x0((ViewGroup)linearLayout, l811, a51.u);
      l811.M0 = ms0.p();
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */