package in.krosbits.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;
import m20;
import u7;

public class DynamicWidthSpinner extends u7 {
  public DynamicWidthSpinner(Context paramContext) {
    super(paramContext, null, 2130969974);
  }
  
  public DynamicWidthSpinner(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130969974);
  }
  
  public DynamicWidthSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (paramSpinnerAdapter != null) {
      m20 m20 = new m20(this, paramSpinnerAdapter);
    } else {
      paramSpinnerAdapter = null;
    } 
    super.setAdapter(paramSpinnerAdapter);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbit\\utils\DynamicWidthSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */