import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class tw1 {
  public final HashMap a = new HashMap<Object, Object>();
  
  public final View b;
  
  public final ArrayList c = new ArrayList();
  
  public tw1(View paramView) {
    this.b = paramView;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof tw1) {
      tw1 tw11 = (tw1)paramObject;
      paramObject = tw11.b;
      if (this.b == paramObject && this.a.equals(tw11.a))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.b.hashCode();
    return this.a.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("TransitionValues@");
    stringBuilder.append(Integer.toHexString(hashCode()));
    stringBuilder.append(":\n");
    stringBuilder = ga1.l(stringBuilder.toString(), "    view = ");
    stringBuilder.append(this.b);
    stringBuilder.append("\n");
    String str = stringBuilder.toString().concat("    values:");
    HashMap hashMap = this.a;
    for (String str1 : hashMap.keySet()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append("    ");
      stringBuilder1.append(str1);
      stringBuilder1.append(": ");
      stringBuilder1.append(hashMap.get(str1));
      stringBuilder1.append("\n");
      str = stringBuilder1.toString();
    } 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */