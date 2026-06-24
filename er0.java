import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import com.google.android.material.slider.RangeSlider2;
import com.google.android.material.textview.MaterialTextView;

public final class er0 extends he1 implements View.OnClickListener {
  public final n2 w;
  
  public final j41 x;
  
  public er0(View paramView, g7 paramg7) {
    super(paramView);
    ConstraintLayout constraintLayout = (ConstraintLayout)paramView;
    int i = 2131297306;
    if ((Placeholder)ws2.C(paramView, 2131297306) != null) {
      i = 2131297307;
      if ((Placeholder)ws2.C(paramView, 2131297307) != null) {
        i = 2131297404;
        RangeSlider2 rangeSlider2 = (RangeSlider2)ws2.C(paramView, 2131297404);
        if (rangeSlider2 != null) {
          i = 2131297716;
          MaterialTextView materialTextView = (MaterialTextView)ws2.C(paramView, 2131297716);
          if (materialTextView != null) {
            i = 2131297762;
            MaterialTextView materialTextView1 = (MaterialTextView)ws2.C(paramView, 2131297762);
            if (materialTextView1 != null) {
              i = 2131297890;
              MaterialTextView materialTextView2 = (MaterialTextView)ws2.C(paramView, 2131297890);
              if (materialTextView2 != null) {
                this.w = new n2(rangeSlider2, materialTextView, materialTextView1, materialTextView2, 6);
                this.x = paramg7;
                paramView.setOnClickListener(this);
                return;
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(paramView.getResources().getResourceName(i)));
    throw null;
  }
  
  public final void onClick(View paramView) {
    this.x.v(c());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\er0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */