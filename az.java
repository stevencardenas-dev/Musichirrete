import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Stack;

public final class az extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final tk x;
  
  public az(tk paramtk, TextView paramTextView) {
    super((View)paramTextView);
    this.w = paramTextView;
    paramTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramTextView.setTextSize(2, 15.0F);
    int i = (int)((Context)paramtk.c).getResources().getDimension(2131166362);
    paramTextView.setPadding(i, i, i, i);
    paramTextView.setMaxLines(1);
    paramTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    paramTextView.setTextColor(m92.h[5]);
    paramTextView.setOnClickListener(this);
    paramTextView.setBackgroundDrawable(m92.z(paramTextView.getContext(), 2130969899));
  }
  
  public final void onClick(View paramView) {
    tk tk1 = this.x;
    Stack<xn1> stack = (Stack)tk1.e;
    int i = c();
    if (i >= 0) {
      if (i == stack.size()) {
        ArrayList arrayList = new ArrayList();
        stack.add(new xn1(0, ag0.O((Context)tk1.c, stack), arrayList, null));
      } 
      ((zy)tk1.d).b(i);
      ((ss0)tk1.f).dismiss();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */