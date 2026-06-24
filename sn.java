import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;

public final class sn {
  public final MaterialButton a;
  
  public static sn a(View paramView) {
    int i = 2131296457;
    if ((ImageView)ws2.C(paramView, 2131296457) != null) {
      i = 2131296496;
      MaterialButton materialButton = (MaterialButton)ws2.C(paramView, 2131296496);
      if (materialButton != null) {
        ConstraintLayout constraintLayout = (ConstraintLayout)paramView;
        i = 2131296740;
        if ((FlexboxLayout)ws2.C(paramView, 2131296740) != null) {
          i = 2131296782;
          if ((MaterialButton)ws2.C(paramView, 2131296782) != null) {
            i = 2131296820;
            if ((ImageView)ws2.C(paramView, 2131296820) != null) {
              i = 2131296821;
              if ((ImageView)ws2.C(paramView, 2131296821) != null) {
                i = 2131296974;
                if ((LinearLayout)ws2.C(paramView, 2131296974) != null) {
                  i = 2131297620;
                  if ((AppCompatTextView)ws2.C(paramView, 2131297620) != null) {
                    i = 2131297623;
                    if ((AppCompatTextView)ws2.C(paramView, 2131297623) != null)
                      return new sn(materialButton); 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(paramView.getResources().getResourceName(i)));
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */