import in.krosbits.musicolet.MyApplication;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

public final class jm0 implements xj1 {
  public final String b;
  
  public final String c;
  
  public final ArrayList e = new ArrayList();
  
  public jm0 f;
  
  public k90 g;
  
  public int h = -1;
  
  public int i = 0;
  
  public int j = 0;
  
  public long k = 0L;
  
  public ml0 l = null;
  
  public ArrayList m = null;
  
  public WeakReference n;
  
  public jm0(String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final boolean a(String[] paramArrayOfString) {
    String str;
    WeakReference<String> weakReference1 = this.n;
    if (weakReference1 != null) {
      String str1 = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    WeakReference<String> weakReference2 = weakReference1;
    if (weakReference1 == null) {
      str = ag0.i0(b().toUpperCase().toLowerCase());
      this.n = new WeakReference<String>(str);
    } 
    return ag0.g0(str, paramArrayOfString);
  }
  
  public final String b() {
    ml0 ml01 = this.l;
    if (ml01 == null) {
      ml01 = MyApplication.F.c(this.b);
      this.l = ml01;
    } 
    return ml0.b(ml01.b);
  }
  
  public final ArrayList c() {
    ArrayList<?> arrayList = new ArrayList(this.e);
    Collections.sort(arrayList, new w00(12));
    return arrayList;
  }
  
  public final void d() {
    int i;
    long l;
    k90 k901 = this.g;
    byte b = 0;
    if (k901 != null) {
      ArrayList arrayList1 = k901.f;
      if (arrayList1 != null) {
        i = arrayList1.size();
      } else {
        i = k901.i;
      } 
    } else {
      i = 0;
    } 
    if (k901 != null) {
      l = k901.h;
    } else {
      l = 0L;
    } 
    ArrayList<k90> arrayList = this.e;
    int j = arrayList.size();
    int k = arrayList.size();
    while (b < k) {
      k901 = arrayList.get(b);
      b++;
      jm0 jm01 = (jm0)k901;
      jm01.d();
      i += jm01.i;
      l += jm01.k;
      j += jm01.j;
    } 
    this.i = i;
    this.k = l;
    this.j = j;
    String str2 = this.b;
    String str1 = ml0.f(str2);
    if (str1 != null && str1.isEmpty()) {
      str1 = ml0.g(str2);
      if (str1 != null) {
        xp1 xp1 = MyApplication.F.b(str1);
        if (xp1 != null)
          this.h = xp1.e(); 
      } 
    } 
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject instanceof jm0) ? ((jm0)paramObject).c.equals(this.c) : false);
  }
  
  public final String getName() {
    return b();
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */