import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.ToLongFunction;

public final class xp0 {
  public final ArrayList a;
  
  public final ArrayList b;
  
  public final wo c;
  
  public final boolean d;
  
  public final boolean e;
  
  public boolean f;
  
  public boolean g;
  
  public String h;
  
  public xp0(wo paramwo, String paramString, boolean paramBoolean) {
    ArrayList arrayList = new ArrayList();
    this.a = arrayList;
    this.c = paramwo;
    boolean bool = true;
    n21.E(paramString, arrayList, true);
    this.e = paramBoolean;
    this.b = new ArrayList(arrayList.size());
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      xr1 xr1 = this.a.get(b);
      if (xr1.a >= 0L)
        this.b.add(new Pair(xr1, Integer.valueOf(b))); 
    } 
    if (this.b.size() > 0) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.d = paramBoolean;
    if (paramBoolean)
      Collections.sort(this.b, Comparator.comparingLong((ToLongFunction<?>)new Object())); 
  }
  
  public final int a(int paramInt) {
    ArrayList<Pair> arrayList = this.b;
    try {
      Pair pair = arrayList.get(0);
      int i = arrayList.size();
      byte b = 1;
      return ((Integer)pair.second).intValue();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final String b(int paramInt) {
    return ((xr1)this.a.get(paramInt)).b;
  }
  
  public final int c(int paramInt) {
    return (int)((xr1)this.a.get(paramInt)).a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof xp0) {
      paramObject = ((xp0)paramObject).c;
      return Objects.equals(this.c, paramObject);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */