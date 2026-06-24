import android.text.TextUtils;
import java.util.Objects;

public class dw0 {
  public final String a;
  
  public final int b;
  
  public final int c;
  
  public dw0(String paramString, int paramInt1, int paramInt2) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof dw0))
      return false; 
    dw0 dw01 = (dw0)paramObject;
    int m = dw01.c;
    paramObject = dw01.a;
    int j = dw01.b;
    int k = this.c;
    String str = this.a;
    int i = this.b;
    return (i < 0 || j < 0) ? ((TextUtils.equals(str, (CharSequence)paramObject) && k == m)) : ((TextUtils.equals(str, (CharSequence)paramObject) && i == j && k == m));
  }
  
  public final int hashCode() {
    int i = this.c;
    return Objects.hash(new Object[] { this.a, Integer.valueOf(i) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */