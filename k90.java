import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class k90 implements xj1, Serializable {
  public int b = -1;
  
  public final String c;
  
  public final ml0 e;
  
  public ArrayList f;
  
  public long g;
  
  public long h;
  
  public int i;
  
  public String j;
  
  public boolean k = false;
  
  public boolean l = false;
  
  public WeakReference m;
  
  public k90(String paramString, ml0 paramml0) {
    this.c = paramString;
    this.e = paramml0;
    int i = paramString.lastIndexOf('/');
    if (i >= 0) {
      int j = i + 1;
      if (j < paramString.length()) {
        paramString.substring(j);
        return;
      } 
      paramString.substring(i);
    } 
  }
  
  public final boolean a(String[] paramArrayOfString) {
    String str;
    WeakReference<String> weakReference1 = this.m;
    if (weakReference1 != null) {
      String str1 = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    WeakReference<String> weakReference2 = weakReference1;
    if (weakReference1 == null) {
      str = ag0.i0(getName().toUpperCase().toLowerCase());
      this.m = new WeakReference<String>(str);
    } 
    return ag0.g0(str, paramArrayOfString);
  }
  
  public final void b(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1) {
      if (this.f == null)
        this.f = new ArrayList(); 
      this.f.add(paramkm0);
    } 
    if (paramBoolean2) {
      this.i++;
      long l1 = this.h;
      qn1 qn1 = paramkm0.c;
      this.h = l1 + qn1.g;
      String str = this.j;
      if (str == null) {
        this.j = qn1.c;
      } else if (!"".equals(str) && this.j != paramkm0.c.c) {
        this.j = "";
      } 
      long l2 = this.g;
      l1 = paramkm0.k;
      if (l2 < l1)
        this.g = l1; 
    } 
  }
  
  public final ArrayList c(lm0 paramlm0, int... paramVarArgs) {
    if (this.l) {
      if (!this.k) {
        ArrayList<lm0> arrayList1 = this.f;
        int i = arrayList1.size();
        byte b = 0;
        while (b < i) {
          paramlm0 = arrayList1.get(b);
          b++;
          b((km0)paramlm0, false, this.k ^ true);
        } 
        this.k = true;
      } 
    } else {
      if (this.f == null)
        this.f = new ArrayList(); 
      ArrayList<Object> arrayList1 = paramlm0.i(new int[0]);
      int j = arrayList1.size();
      int i = 0;
      while (i < j) {
        km0 km0 = (km0)arrayList1.get(i);
        int k = i + 1;
        km0 = km0;
        i = k;
        if (km0.h.equals(this.c)) {
          b(km0, true, this.k ^ true);
          i = k;
        } 
      } 
      this.k = true;
      this.l = true;
    } 
    ArrayList arrayList = new ArrayList(this.f);
    if (paramVarArgs.length > 0) {
      int i = paramVarArgs[0];
      if (i >= 0)
        z51.R(i, arrayList); 
    } 
    return arrayList;
  }
  
  public final String getName() {
    return ml0.b(this.e.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */