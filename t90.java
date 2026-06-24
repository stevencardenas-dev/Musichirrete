import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;

public final class t90 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final TextView w;
  
  public final ImageView x;
  
  public final u90 y;
  
  public t90(u90 paramu90, View paramView) {
    super(paramView);
    this.w = (TextView)paramView.findViewById(2131297752);
    paramView.findViewById(2131297756).setVisibility(8);
    this.x = (ImageView)paramView.findViewById(2131296861);
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      u90 u901 = this.y;
      try {
        return;
      } finally {
        u901 = null;
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0) {
      u90 u901 = this.y;
      gf0 gf0 = u901.i;
      jm0 jm01 = u901.d.get(i);
      gf0.u0 = jm01;
      gf0.B0 = gf0.E0(jm01.c);
      ms0 ms0 = new ms0(gf0.P());
      ms0.f = jm01.b();
      ms0.e(2131492930, false);
      ViewGroup viewGroup = (ViewGroup)ms0.u.findViewById(2131296973);
      TextView textView2 = (TextView)viewGroup.findViewById(2131297714);
      textView2.setText(2131887051);
      textView2.setVisibility(0);
      textView2 = (TextView)viewGroup.findViewById(2131296984);
      textView2.setText(2131887178);
      jm0 jm02 = jm01.f;
      if (jm02 != null) {
        String str = jm02.b;
        if (MyApplication.F.d(str) != null && !str.equals("Storage"))
          textView2.setVisibility(0); 
      } 
      textView2 = (TextView)viewGroup.findViewById(2131297009);
      textView2.setText(2131886529);
      textView2.setVisibility(0);
      ((TextView)viewGroup.findViewById(2131296949)).setVisibility(0);
      if (!jm01.c.equals(MyApplication.j.c.u.c))
        ((TextView)viewGroup.findViewById(2131297024)).setVisibility(0); 
      TextView textView1 = (TextView)viewGroup.findViewById(2131297021);
      textView1.setText(2131887328);
      textView1.setVisibility(8);
      textView1 = (TextView)viewGroup.findViewById(2131297022);
      textView1.setText(2131887331);
      textView1.setVisibility(0);
      viewGroup.findViewById(2131297027).setVisibility(0);
      viewGroup.findViewById(2131296979).setVisibility(0);
      viewGroup.findViewById(2131296975).setVisibility(0);
      viewGroup.findViewById(2131296991).setVisibility(0);
      if (!ws2.U())
        viewGroup.findViewById(2131297008).setVisibility(8); 
      if (my0.d()) {
        ((TextView)viewGroup.findViewById(2131296980)).setText(2131886457);
        textView1 = (TextView)viewGroup.findViewById(2131296981);
        textView1.setText(2131886458);
        textView1.setVisibility(0);
      } 
      ag0.x0(viewGroup, gf0, a51.q);
      gf0.o0 = ms0.p();
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */