import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class x00 extends he1 implements View.OnClickListener {
  public final ImageView w;
  
  public final TextView x;
  
  public final TextView y;
  
  public final z00 z;
  
  public x00(z00 paramz00, View paramView, int paramInt) {
    super(paramView);
    this.w = (ImageView)paramView.findViewById(2131296866);
    TextView textView1 = (TextView)paramView.findViewById(2131297890);
    this.x = textView1;
    TextView textView2 = (TextView)paramView.findViewById(2131297878);
    this.y = textView2;
    paramView.setOnClickListener(this);
    Context context = paramView.getContext();
    StateListDrawable stateListDrawable = new StateListDrawable();
    Drawable drawable2 = m92.z(context, 2130969903);
    stateListDrawable.addState(new int[] { 16842913 }, drawable2);
    Drawable drawable1 = m92.z(context, 2130969899);
    stateListDrawable.addState(new int[0], drawable1);
    paramView.setBackground((Drawable)stateListDrawable);
    if (paramInt == 0) {
      textView1.setSingleLine(true);
      textView2.setSelected(true);
      textView2.setVisibility(0);
    } 
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      z00 z001 = this.z;
      int j = i;
      try {
        if (z001.w)
          j = i - 1; 
        if (j >= 0) {
          v00 v00 = z001.u.get(j);
          if (v00.k() || (z001.t == null && !v00.a()))
            return; 
          z001.y = v00;
          z001.s.g();
          return;
        } 
        ms0 ms0 = new ms0();
        this(z001.b);
        ms0.q(2131886980);
        f f = new f();
        this(9, z001);
        ms0.g(null, null, false, f);
        ms0.n(2131887030);
        ms0.k(2131886278);
        ss0 ss0 = ms0.p();
        vm vm = new vm();
        this();
        vm.m(ss0.n);
        x2 x2 = new x2();
        this(vm, 1);
        return;
      } finally {
        z001 = null;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */