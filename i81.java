import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import in.krosbits.musicolet.MyApplication;

public final class i81 extends he1 implements View.OnClickListener {
  public final l81 w;
  
  public i81(l81 paraml81, View paramView) {
    super(paramView);
    paramView.findViewById(2131296393).setOnClickListener(this);
    paramView.findViewById(2131297798).setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    l81 l811 = this.w;
    if (l811.P() != null) {
      int i = paramView.getId();
      if (i == 2131296393) {
        if (MyApplication.F.p() && Build.VERSION.SDK_INT <= 30) {
          ms0 ms0 = new ms0(l811.P());
          ms0.f = (CharSequence)Html.fromHtml(l811.T(2131886541));
          ms0.i(new CharSequence[] { l811.T(2131886778), l811.T(2131887097) });
          ms0.j(new g81(l811));
          ms0.p();
          return;
        } 
        l811.K0();
        return;
      } 
      if (i == 2131297798) {
        vm vm = new vm();
        ms0 ms0 = new ms0(l811.P());
        ms0.q(2131887100);
        ms0.g(l811.T(2131887100), null, false, new g81(l811));
        ms0.n(2131887030);
        ms0.k(2131886278);
        ms0.W = new x2(vm, 5);
        ms0.X = new pf0(vm, 3);
        EditText editText = (ms0.p()).n;
        vm.m(editText);
        editText.setText("");
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */