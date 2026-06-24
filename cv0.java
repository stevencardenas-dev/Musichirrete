import android.os.Bundle;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class cv0 {
  public static final cv0 c = new cv0(new Bundle(), null);
  
  public final Bundle a;
  
  public List b;
  
  public cv0(Bundle paramBundle, ArrayList paramArrayList) {
    this.a = paramBundle;
    this.b = paramArrayList;
  }
  
  public static cv0 b(Bundle paramBundle) {
    return (paramBundle != null) ? new cv0(paramBundle, null) : null;
  }
  
  public final void a() {
    if (this.b == null) {
      ArrayList arrayList = this.a.getStringArrayList("controlCategories");
      this.b = arrayList;
      if (arrayList == null || arrayList.isEmpty())
        this.b = Collections.EMPTY_LIST; 
    } 
  }
  
  public final ArrayList c() {
    a();
    return new ArrayList(this.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof cv0) {
      paramObject = paramObject;
      a();
      paramObject.a();
      return this.b.equals(((cv0)paramObject).b);
    } 
    return false;
  }
  
  public final int hashCode() {
    a();
    return this.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(nFLlOYeP.WjbAKCWdzObkmUB);
    stringBuilder.append(Arrays.toString(c().toArray()));
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */