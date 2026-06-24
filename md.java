import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

public final class md {
  public x4 a;
  
  public final int b;
  
  public final View c;
  
  public final void a(Drawable paramDrawable) {
    ColorStateList colorStateList;
    int i = this.b;
    View view = this.c;
    switch (i) {
      default:
        colorStateList = ((MaterialCheckBox)view).q;
        if (colorStateList != null)
          paramDrawable.setTintList(colorStateList); 
        return;
      case 1:
        nd = (nd)colorStateList;
        if (!nd.i)
          nd.setVisibility(nd.j); 
        return;
      case 0:
        break;
    } 
    nd nd = (nd)colorStateList;
    nd.setIndeterminate(false);
    nd.a(nd.c, nd.e);
  }
  
  public void b(Drawable paramDrawable) {
    switch (this.b) {
      default:
        return;
      case 2:
        break;
    } 
    MaterialCheckBox materialCheckBox = (MaterialCheckBox)this.c;
    ColorStateList colorStateList = materialCheckBox.q;
    if (colorStateList != null)
      paramDrawable.setTint(colorStateList.getColorForState(materialCheckBox.u, colorStateList.getDefaultColor())); 
  }
  
  public final void c(Drawable paramDrawable) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */