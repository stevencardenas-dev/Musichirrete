import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.Tag2Activity;
import java.util.List;

public final class t8 extends ArrayAdapter {
  public final int b;
  
  public final Object c;
  
  public t8(Tag2Activity paramTag2Activity, List paramList) {
    super((Context)paramTag2Activity, 17367043, paramList);
    this.c = paramList;
  }
  
  public t8(p71 paramp71, Context paramContext, String[] paramArrayOfString) {
    super(paramContext, 2131493048, (Object[])paramArrayOfString);
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    switch (this.b) {
      default:
        return super.getDropDownView(paramInt, paramView, paramViewGroup);
      case 1:
        break;
    } 
    View view = super.getDropDownView(paramInt, paramView, paramViewGroup);
    if (paramView == null)
      ((SmartTextView)view).setCompoundDrawables(null, null, null, null); 
    SmartTextView smartTextView = (SmartTextView)view;
    int[] arrayOfInt = m92.h;
    if (paramInt == ((p71)this.c).P0.getSelectedItemPosition()) {
      paramInt = 3;
    } else {
      paramInt = 6;
    } 
    smartTextView.setTextColor(arrayOfInt[paramInt]);
    return view;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    switch (this.b) {
      default:
        return super.getView(paramInt, paramView, paramViewGroup);
      case 1:
        break;
    } 
    View view = super.getView(paramInt, paramView, paramViewGroup);
    if (paramView == null) {
      SmartTextView smartTextView = (SmartTextView)view;
      smartTextView.setTextColor(m92.h[3]);
      smartTextView.setCompoundDrawables(null, null, MyApplication.i.getApplicationContext().getResources().getDrawable(2131231191), null);
    } 
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */