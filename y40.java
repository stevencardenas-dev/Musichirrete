import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public final class y40 extends ArrayAdapter {
  public final int b;
  
  public final int c;
  
  public final void a(TextView paramTextView, boolean paramBoolean) {
    int i = this.b;
    int j = this.c;
    switch (i) {
      default:
        paramTextView.setTextColor(j);
        paramTextView.setHorizontallyScrolling(true);
        paramTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        paramTextView.setMarqueeRepeatLimit(-1);
        layoutParams = paramTextView.getLayoutParams();
        if (!paramBoolean) {
          layoutParams.width = -2;
          layoutParams.height = -1;
          paramTextView.setSingleLine(true);
          paramTextView.setSelected(true);
        } else {
          layoutParams.width = -1;
          layoutParams.height = -2;
          paramTextView.setSingleLine(false);
          paramTextView.setSelected(false);
        } 
        paramTextView.setLayoutParams(layoutParams);
        paramTextView.setTextSize(1, 14.0F);
        paramTextView.setMinWidth(0);
        return;
      case 0:
        break;
    } 
    paramTextView.setTextColor(j);
    paramTextView.setHorizontallyScrolling(true);
    paramTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    paramTextView.setMarqueeRepeatLimit(-1);
    ViewGroup.LayoutParams layoutParams = paramTextView.getLayoutParams();
    if (!paramBoolean) {
      layoutParams.width = -2;
      layoutParams.height = -1;
      paramTextView.setSingleLine(true);
      paramTextView.setSelected(true);
    } else {
      layoutParams.width = -1;
      layoutParams.height = -2;
      paramTextView.setSingleLine(false);
      paramTextView.setSelected(false);
    } 
    paramTextView.setLayoutParams(layoutParams);
    paramTextView.setTextSize(1, 14.0F);
    paramTextView.setMinWidth(0);
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    switch (this.b) {
      default:
        view = super.getDropDownView(paramInt, paramView, paramViewGroup);
        if (paramView == null)
          a((TextView)view, true); 
        return view;
      case 0:
        break;
    } 
    View view = super.getDropDownView(paramInt, paramView, (ViewGroup)view);
    if (paramView == null)
      a((TextView)view, true); 
    return view;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    switch (this.b) {
      default:
        view = super.getView(paramInt, paramView, paramViewGroup);
        if (paramView == null)
          a((TextView)view, false); 
        return view;
      case 0:
        break;
    } 
    View view = super.getView(paramInt, paramView, (ViewGroup)view);
    if (paramView == null)
      a((TextView)view, false); 
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */