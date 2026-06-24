import java.util.ArrayList;
import java.util.Locale;

public final class mu implements ti0, ri0 {
  public final ti0[] b;
  
  public final ri0[] c;
  
  public final int e;
  
  public final int f;
  
  public mu(ArrayList<Object> paramArrayList) {
    ArrayList<ti0> arrayList1 = new ArrayList();
    ArrayList<ri0> arrayList = new ArrayList();
    int j = paramArrayList.size();
    boolean bool = false;
    byte b;
    for (b = 0; b < j; b += 2) {
      ri0[] arrayOfRi0;
      ti0[] arrayOfTi0 = (ti0[])paramArrayList.get(b);
      if (arrayOfTi0 instanceof mu) {
        arrayOfTi0 = ((mu)arrayOfTi0).b;
        if (arrayOfTi0 != null)
          for (byte b1 = 0; b1 < arrayOfTi0.length; b1++)
            arrayList1.add(arrayOfTi0[b1]);  
      } else {
        arrayList1.add((ti0)arrayOfTi0);
      } 
      arrayOfTi0 = (ti0[])paramArrayList.get(b + 1);
      if (arrayOfTi0 instanceof mu) {
        arrayOfRi0 = ((mu)arrayOfTi0).c;
        if (arrayOfRi0 != null)
          for (byte b1 = 0; b1 < arrayOfRi0.length; b1++)
            arrayList.add(arrayOfRi0[b1]);  
      } else {
        arrayList.add((ri0)arrayOfRi0);
      } 
    } 
    if (arrayList1.contains(null) || arrayList1.isEmpty()) {
      this.b = null;
      this.e = 0;
    } else {
      j = arrayList1.size();
      this.b = new ti0[j];
      b = 0;
      int k = 0;
      while (b < j) {
        ti0 ti01 = arrayList1.get(b);
        k += ti01.b();
        this.b[b] = ti01;
        b++;
      } 
      this.e = k;
    } 
    if (arrayList.contains(null) || arrayList.isEmpty()) {
      this.c = null;
      this.f = 0;
      return;
    } 
    j = arrayList.size();
    this.c = new ri0[j];
    int i = 0;
    for (b = bool; b < j; b++) {
      ri0 ri01 = arrayList.get(b);
      i += ri01.d();
      this.c[b] = ri01;
    } 
    this.f = i;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    ri0[] arrayOfRi0 = this.c;
    if (arrayOfRi0 != null) {
      int i = arrayOfRi0.length;
      for (byte b = 0; b < i && paramInt >= 0; b++)
        paramInt = arrayOfRi0[b].a(paramcv, paramCharSequence, paramInt); 
      return paramInt;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final int b() {
    return this.e;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    ti0[] arrayOfTi0 = this.b;
    if (arrayOfTi0 != null) {
      Locale locale = paramLocale;
      if (paramLocale == null)
        locale = Locale.getDefault(); 
      int i = arrayOfTi0.length;
      for (byte b = 0; b < i; b++)
        arrayOfTi0[b].c(paramStringBuilder, paramuo0, locale); 
      return;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final int d() {
    return this.f;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    ti0[] arrayOfTi0 = this.b;
    if (arrayOfTi0 != null) {
      if (paramLocale == null)
        paramLocale = Locale.getDefault(); 
      int i = arrayOfTi0.length;
      for (byte b = 0; b < i; b++)
        arrayOfTi0[b].e(paramStringBuilder, paramLong, paramdd1, paramInt, paramhv, paramLocale); 
      return;
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */