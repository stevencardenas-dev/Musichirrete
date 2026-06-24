import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class q90 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final r90 A;
  
  public final ImageView w;
  
  public final TextView x;
  
  public final TextView y;
  
  public final TextView z;
  
  public q90(r90 paramr90, View paramView) {
    super(paramView);
    this.w = (ImageView)paramView.findViewById(2131296861);
    this.x = (TextView)paramView.findViewById(2131297752);
    this.y = (TextView)paramView.findViewById(2131297756);
    this.z = (TextView)paramView.findViewById(2131297750);
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0)
      this.A.I0(i); 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0) {
      ml0 ml0;
      r90 r901 = this.A;
      k90 k90 = r901.t0.e.get(i);
      ms0 ms0 = new ms0(r901.P());
      ms0.f = k90.getName();
      ms0.e(2131492930, false);
      ViewGroup viewGroup = (ViewGroup)ms0.u.findViewById(2131296973);
      TextView textView2 = (TextView)viewGroup.findViewById(2131296984);
      String str = ml0.c(k90.c);
      if (str == null) {
        str = null;
      } else {
        ml0 = new ml0(str);
      } 
      if (ml0 != null) {
        String str1 = ml0.b;
        if (MyApplication.F.d(str1) != null && !str1.equals("Storage")) {
          textView2.setText(2131887178);
          textView2.setVisibility(0);
        } 
      } 
      TextView textView1 = (TextView)viewGroup.findViewById(2131297009);
      textView1.setText(2131886529);
      textView1.setVisibility(0);
      ((TextView)viewGroup.findViewById(2131296949)).setVisibility(0);
      textView1 = (TextView)viewGroup.findViewById(2131297021);
      textView1.setText(2131887328);
      textView1.setVisibility(0);
      textView1 = (TextView)viewGroup.findViewById(2131296980);
      textView1.setText(2131886457);
      viewGroup.findViewById(2131297027).setVisibility(0);
      viewGroup.findViewById(2131296979).setVisibility(0);
      viewGroup.findViewById(2131296991).setVisibility(0);
      viewGroup.findViewById(2131296975).setVisibility(0);
      if (!ws2.U())
        viewGroup.findViewById(2131297008).setVisibility(8); 
      if (my0.d())
        textView1.setVisibility(0); 
      ag0.x0(viewGroup, r901, a51.q);
      r901.A0 = k90;
      ArrayList arrayList = r901.G0(k90);
      z51.R(r901.J0.getInt("I_K_SRTBYF_F", 30), arrayList);
      r901.K0 = arrayList;
      r901.x0 = ms0.p();
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */