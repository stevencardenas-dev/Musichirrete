import android.media.audiofx.Equalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ow {
  public static int d;
  
  public boolean a;
  
  public boolean b;
  
  public final Object c;
  
  public ow(int paramInt, List<Integer> paramList) {
    boolean bool2;
    this.c = new ArrayList(2);
    boolean bool1 = false;
    boolean bool3 = true;
    if (paramInt == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.b = bool2;
    a();
    if (paramInt == 0) {
      bool2 = bool3;
    } else {
      bool2 = false;
    } 
    this.b = bool2;
    if (bool2)
      for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
        ((ArrayList<Equalizer>)this.c).add(new Equalizer(127, ((Integer)paramList.get(paramInt)).intValue()));  
  }
  
  public ow(t60 paramt60) {
    cp1 cp1 = new cp1();
    cp1.e = r71.d;
    this.c = cp1;
    this.a = true;
  }
  
  public void a() {
    ArrayList<Equalizer> arrayList = (ArrayList)this.c;
    if (this.b) {
      byte b = 0;
      while (true) {
        if (b < arrayList.size()) {
          try {
            ((Equalizer)arrayList.get(b)).release();
          } finally {
            Exception exception;
          } 
          b++;
          continue;
        } 
        arrayList.clear();
        return;
      } 
    } 
  }
  
  public void b(short paramShort1, short paramShort2) {
    ArrayList<Equalizer> arrayList1 = (ArrayList)this.c;
    boolean bool = this.b;
    byte b = 0;
    if (bool)
      while (true) {
        if (b < arrayList1.size()) {
          try {
            ((Equalizer)arrayList1.get(b)).setBandLevel(paramShort1, paramShort2);
          } finally {
            Exception exception;
          } 
          b++;
          continue;
        } 
        return;
      }  
    f01 f01 = f01.b();
    float f = paramShort2 / 100.0F;
    r01 r01 = f01.g.get(paramShort1);
    r01.d = f;
    qn qn = new qn(r01.b(), r01.b(), yj1.f, String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(r01.d) }));
    ArrayList<Object> arrayList = f01.m;
    int i = arrayList.size();
    b = 0;
    while (b < i) {
      au au = (au)arrayList.get(b);
      b++;
      (new qn[1])[0] = qn;
      ((au)au).f((new qn[1])[0]);
    } 
  }
  
  public void c(boolean paramBoolean1, boolean paramBoolean2) {
    ArrayList<Equalizer> arrayList = (ArrayList)this.c;
    this.a = paramBoolean1;
    boolean bool1 = this.b;
    boolean bool = false;
    int j = 0;
    int i = 0;
    if (bool1)
      while (true) {
        if (i < arrayList.size()) {
          try {
            ((Equalizer)arrayList.get(i)).setEnabled(paramBoolean1);
          } finally {
            Exception exception;
          } 
          i++;
          continue;
        } 
        return;
      }  
    f01 f01 = f01.b();
    i = j;
    if (f01.l != paramBoolean1) {
      f01.l = paramBoolean1;
      arrayList = f01.g;
      int m = arrayList.size();
      i = 0;
      j = 0;
      while (j < m) {
        r01 r01 = (r01)arrayList.get(j);
        int n = j + 1;
        r01 = r01;
        j = n;
        if (r01.a != paramBoolean1) {
          r01.a = paramBoolean1;
          i = 1;
          j = n;
        } 
      } 
      a[] arrayOfA = f01.h;
      int k = arrayOfA.length;
      for (j = bool; j < k; j++) {
        a a = arrayOfA[j];
        if (a.d() != paramBoolean1) {
          a.e(paramBoolean1);
          i = 1;
        } 
      } 
    } 
    if (i != 0 && paramBoolean2)
      f01.b().g(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */