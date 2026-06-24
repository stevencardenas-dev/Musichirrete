import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class b81 implements Serializable {
  public String b;
  
  public ArrayList c;
  
  public HashSet e;
  
  public b81(String paramString) {
    this(paramString, new ArrayList());
  }
  
  public b81(String paramString, ArrayList paramArrayList) {
    this.b = paramString;
    this.c = paramArrayList;
    e();
  }
  
  public final boolean a(km0 paramkm0) {
    paramkm0.getClass();
    if (!c(paramkm0)) {
      this.c.add(paramkm0);
      this.e.add(paramkm0.c.f);
      return true;
    } 
    return false;
  }
  
  public final boolean b(ArrayList<Object> paramArrayList) {
    int i = paramArrayList.size();
    boolean bool = false;
    byte b = 0;
    while (b < i) {
      km0 km0 = (km0)paramArrayList.get(b);
      b++;
      bool |= a(km0);
    } 
    return bool;
  }
  
  public final boolean c(km0 paramkm0) {
    return (paramkm0 == null) ? false : this.e.contains(paramkm0.c.f);
  }
  
  public final boolean d() {
    ArrayList arrayList = this.c;
    return (arrayList == null || arrayList.isEmpty());
  }
  
  public final void e() {
    this.e = new HashSet(this.c.size());
    for (byte b = 0; b < this.c.size(); b++)
      this.e.add(((km0)this.c.get(b)).c.f); 
  }
  
  public final void f(km0 paramkm0) {
    this.c.remove(paramkm0);
    this.e.remove(paramkm0.c.f);
  }
  
  public final boolean g(HashSet paramHashSet) {
    ArrayList<km0> arrayList = new ArrayList();
    ArrayList<Object> arrayList1 = this.c;
    int i = arrayList1.size();
    boolean bool = false;
    byte b = 0;
    while (b < i) {
      km0 km0 = (km0)arrayList1.get(b);
      b++;
      km0 = km0;
      if (!paramHashSet.contains(km0.c.f)) {
        arrayList.add(km0);
        continue;
      } 
      bool = true;
    } 
    if (bool) {
      this.c = arrayList;
      e();
    } 
    return bool;
  }
  
  public final boolean h(HashMap paramHashMap) {
    ArrayList<wo> arrayList = new ArrayList();
    ArrayList<Object> arrayList1 = this.c;
    int j = arrayList1.size();
    boolean bool = false;
    int i = 0;
    while (i < j) {
      km0 km01 = (km0)arrayList1.get(i);
      int k = i + 1;
      km01 = km01;
      km0 km02 = (km0)paramHashMap.get(km01.c.f);
      i = k;
      if (km02 != null) {
        qn1 qn1 = km02.c;
        i = k;
        if (!qn1.f.equals(km01.c.f)) {
          arrayList.add(qn1.f);
          i = k;
        } 
      } 
    } 
    boolean bool1 = g(new HashSet<wo>(arrayList));
    for (i = bool; i < this.c.size(); i++) {
      km0 km0 = (km0)paramHashMap.get(((km0)this.c.get(i)).c.f);
      if (km0 != null) {
        this.c.set(i, km0);
        bool1 = true;
      } 
    } 
    if (bool1)
      e(); 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */