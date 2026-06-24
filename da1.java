import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

public final class da1 extends he1 {
  public boolean A;
  
  public final Drawable w;
  
  public final ColorStateList x;
  
  public final SparseArray y;
  
  public boolean z;
  
  public da1(View paramView) {
    super(paramView);
    SparseArray sparseArray = new SparseArray(4);
    this.y = sparseArray;
    TextView textView = (TextView)paramView.findViewById(16908310);
    sparseArray.put(16908310, textView);
    sparseArray.put(16908304, paramView.findViewById(16908304));
    sparseArray.put(16908294, paramView.findViewById(16908294));
    sparseArray.put(2131296812, paramView.findViewById(2131296812));
    sparseArray.put(16908350, paramView.findViewById(16908350));
    this.w = paramView.getBackground();
    if (textView != null)
      this.x = textView.getTextColors(); 
  }
  
  public final View s(int paramInt) {
    SparseArray sparseArray = this.y;
    View view = (View)sparseArray.get(paramInt);
    if (view != null)
      return view; 
    view = this.b.findViewById(paramInt);
    if (view != null)
      sparseArray.put(paramInt, view); 
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\da1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */