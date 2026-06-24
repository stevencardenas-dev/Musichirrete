import android.view.View;
import android.widget.TextView;
import in.krosbits.musicolet.FolderExcluderActivity;

public final class n90 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final FolderExcluderActivity x;
  
  public n90(FolderExcluderActivity paramFolderExcluderActivity, View paramView) {
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
      FolderExcluderActivity folderExcluderActivity = this.x;
      folderExcluderActivity.S.remove(i);
      (folderExcluderActivity.R.getAdapter()).a.f(i, 1);
      folderExcluderActivity.V = true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */