import android.view.View;
import android.widget.TextView;
import in.krosbits.musicolet.IncludedFoldersActivity;

public final class ph0 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final IncludedFoldersActivity x;
  
  public ph0(IncludedFoldersActivity paramIncludedFoldersActivity, View paramView) {
    super(paramView);
    TextView textView = (TextView)paramView.findViewById(2131297890);
    this.w = textView;
    textView.setSingleLine(false);
    textView.setTextSize(1, 14.0F);
    textView.setTextColor(m92.h[5]);
    paramView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      IncludedFoldersActivity includedFoldersActivity = this.x;
      includedFoldersActivity.V = true;
      if (includedFoldersActivity.R.size() > 1) {
        includedFoldersActivity.R.remove(i);
        includedFoldersActivity.n0();
        return;
      } 
      ag0.O0(2131886826, 0);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ph0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */