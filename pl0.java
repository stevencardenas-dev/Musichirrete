import android.view.View;
import android.view.ViewGroup;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MyApplication;
import java.util.Collections;
import java.util.Locale;

public final class pl0 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final SmartTextView w;
  
  public final ql0 x;
  
  public pl0(ql0 paramql0, SmartTextView paramSmartTextView, boolean paramBoolean) {
    super((View)paramSmartTextView);
    this.w = paramSmartTextView;
    paramSmartTextView.setBackground(m92.z(paramSmartTextView.getContext(), 2130969899));
    paramSmartTextView.setLayoutParams((ViewGroup.LayoutParams)new sd1(-1, -2));
    int i = paramql0.G0;
    paramSmartTextView.setPadding(i * 2, i, i, i);
    if (paramBoolean) {
      paramSmartTextView.setTextTintIndex(5);
    } else {
      paramSmartTextView.setTextTintIndex(6);
    } 
    paramSmartTextView.setGravity(3);
    paramSmartTextView.setOnClickListener(this);
    paramSmartTextView.setOnLongClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      ql0 ql01 = this.x;
      ql01.s(ql01.B0.get(i));
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0) {
      ql0 ql01 = this.x;
      Locale locale = ql01.B0.get(i);
      if (!MyApplication.l() && !locale.equals(z51.n()) && !locale.equals(z51.o(MyApplication.i.getApplicationContext())))
        ql01.F0.b(Collections.singletonList(locale)); 
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */