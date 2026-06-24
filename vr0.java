import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public final class vr0 extends ArrayAdapter {
  public ColorStateList b;
  
  public ColorStateList c;
  
  public final MaterialAutoCompleteTextView e;
  
  public vr0(MaterialAutoCompleteTextView paramMaterialAutoCompleteTextView, Context paramContext, int paramInt, String[] paramArrayOfString) {
    super(paramContext, paramInt, (Object[])paramArrayOfString);
    a();
  }
  
  public final void a() {
    MaterialAutoCompleteTextView materialAutoCompleteTextView = this.e;
    ColorStateList colorStateList3 = materialAutoCompleteTextView.n;
    ColorStateList colorStateList2 = null;
    if (colorStateList3 != null) {
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = 16842919;
      int i = colorStateList3.getColorForState(arrayOfInt, 0);
      colorStateList1 = new ColorStateList(new int[][] { arrayOfInt, {} }, new int[] { i, 0 });
    } else {
      colorStateList1 = null;
    } 
    this.c = colorStateList1;
    ColorStateList colorStateList1 = colorStateList2;
    if (materialAutoCompleteTextView.m != 0) {
      colorStateList1 = colorStateList2;
      if (materialAutoCompleteTextView.n != null) {
        int[] arrayOfInt2 = new int[2];
        arrayOfInt2[0] = 16843623;
        arrayOfInt2[1] = -16842919;
        int[] arrayOfInt1 = new int[2];
        arrayOfInt1[0] = 16842913;
        arrayOfInt1[1] = -16842919;
        int i = materialAutoCompleteTextView.n.getColorForState(arrayOfInt1, 0);
        int j = materialAutoCompleteTextView.n.getColorForState(arrayOfInt2, 0);
        i = jn.g(i, materialAutoCompleteTextView.m);
        j = jn.g(j, materialAutoCompleteTextView.m);
        int k = materialAutoCompleteTextView.m;
        colorStateList1 = new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, {} }, new int[] { i, j, k });
      } 
    } 
    this.b = colorStateList1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    View view = super.getView(paramInt, paramView, paramViewGroup);
    if (view instanceof TextView) {
      RippleDrawable rippleDrawable;
      TextView textView = (TextView)view;
      MaterialAutoCompleteTextView materialAutoCompleteTextView = this.e;
      boolean bool = materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText());
      paramViewGroup = null;
      ViewGroup viewGroup = paramViewGroup;
      if (bool) {
        viewGroup = paramViewGroup;
        if (materialAutoCompleteTextView.m != 0) {
          ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.m);
          if (this.c != null) {
            colorDrawable.setTintList(this.b);
            rippleDrawable = new RippleDrawable(this.c, (Drawable)colorDrawable, null);
          } 
        } 
      } 
      textView.setBackground((Drawable)rippleDrawable);
    } 
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */