import android.graphics.Typeface;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.HashSet;

public final class b3 extends he1 implements View.OnClickListener {
  public final MaterialCheckBox w;
  
  public final c3 x;
  
  public b3(c3 paramc3, MaterialCheckBox paramMaterialCheckBox, int paramInt) {
    super((View)paramMaterialCheckBox);
    this.w = paramMaterialCheckBox;
    int i = paramc3.n;
    paramMaterialCheckBox.setPadding(i, i, i, i);
    paramMaterialCheckBox.setOnClickListener(this);
    if ((paramInt & 0x20) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    paramInt &= 0xFFFFFFDF;
    if (paramInt == 1) {
      paramMaterialCheckBox.setTextColor(arrayOfInt[7]);
    } else if (paramInt == 3) {
      paramMaterialCheckBox.setTypeface(Typeface.DEFAULT_BOLD);
      paramMaterialCheckBox.setTextColor(arrayOfInt[5]);
    } else if (paramInt == 2) {
      paramMaterialCheckBox.setTextColor(arrayOfInt[6]);
    } 
    if (i != 0) {
      paramMaterialCheckBox.setButtonDrawable(2131230994);
      return;
    } 
    paramMaterialCheckBox.setButtonDrawable(2131230993);
  }
  
  public final void onClick(View paramView) {
    c3 c31 = this.x;
    HashSet<String> hashSet = c31.j;
    int i = c();
    if (i >= 0) {
      String str = c31.i.get(i);
      if (hashSet.contains(str)) {
        hashSet.remove(str);
      } else {
        hashSet.add(str);
      } 
      c31.e.q.setEnabled(hashSet.isEmpty() ^ true);
      c31.m.h(i);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */