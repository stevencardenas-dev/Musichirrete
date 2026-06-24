import android.text.TextUtils;
import androidx.preference.Preference;

public final class y91 {
  public final int a;
  
  public final int b;
  
  public final String c;
  
  public y91(Preference paramPreference) {
    this.c = paramPreference.getClass().getName();
    this.a = paramPreference.F;
    this.b = paramPreference.G;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof y91) {
      paramObject = paramObject;
      if (this.a == ((y91)paramObject).a && this.b == ((y91)paramObject).b && TextUtils.equals(this.c, ((y91)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.a;
    int i = this.b;
    return this.c.hashCode() + ((527 + j) * 31 + i) * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */