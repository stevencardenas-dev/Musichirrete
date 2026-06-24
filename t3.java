import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public final class t3 implements AdapterView.OnItemClickListener {
  public final y3 b;
  
  public final v3 c;
  
  public t3(v3 paramv3, y3 paramy3) {
    this.c = paramv3;
    this.b = paramy3;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    v3 v31 = this.c;
    DialogInterface.OnClickListener onClickListener = v31.p;
    y3 y31 = this.b;
    onClickListener.onClick(y31.b, paramInt);
    if (!v31.t)
      y31.b.dismiss(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */