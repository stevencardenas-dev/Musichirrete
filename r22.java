import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public abstract class r22 {
  public static View.AccessibilityDelegate a(View paramView) {
    return paramView.getAccessibilityDelegate();
  }
  
  public static void b(View paramView, Context paramContext, int[] paramArrayOfint, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfint, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */