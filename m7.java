import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

public abstract class m7 {
  public static void a(ThemedSpinnerAdapter paramThemedSpinnerAdapter, Resources.Theme paramTheme) {
    if (!Objects.equals(paramThemedSpinnerAdapter.getDropDownViewTheme(), paramTheme))
      paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */