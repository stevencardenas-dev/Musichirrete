import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class qw1 extends kw1 {
  public ArrayList F;
  
  public boolean G;
  
  public int H;
  
  public boolean I;
  
  public int J;
  
  public final kw1 A(jw1 paramjw1) {
    super.A(paramjw1);
    return this;
  }
  
  public final void B(View paramView) {
    super.B(paramView);
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).B(paramView); 
  }
  
  public final void C() {
    if (this.F.isEmpty()) {
      K();
      m();
      return;
    } 
    pw1 pw1 = new pw1();
    pw1.b = this;
    ArrayList<Object> arrayList2 = this.F;
    int k = arrayList2.size();
    int j = 0;
    int i = 0;
    while (i < k) {
      kw1 kw11 = (kw1)arrayList2.get(i);
      i++;
      ((kw1)kw11).a(pw1);
    } 
    this.H = this.F.size();
    if (!this.G) {
      i = 1;
      while (true) {
        j = this.F.size();
        ArrayList<kw1> arrayList = this.F;
        if (i < j) {
          ((kw1)arrayList.get(i - 1)).a(new pw1(this.F.get(i), 2));
          i++;
          continue;
        } 
        kw1 kw11 = arrayList.get(0);
        if (kw11 != null) {
          kw11.C();
          return;
        } 
        return;
      } 
    } 
    ArrayList<Object> arrayList1 = this.F;
    k = arrayList1.size();
    i = j;
    while (i < k) {
      kw1 kw11 = (kw1)arrayList1.get(i);
      i++;
      ((kw1)kw11).C();
    } 
  }
  
  public final void D(long paramLong1, long paramLong2) {
    boolean bool;
    long l2;
    long l3 = this.z;
    qw1 qw11 = this.l;
    long l1 = 0L;
    if (qw11 != null && ((paramLong1 < 0L && paramLong2 < 0L) || (paramLong1 > l3 && paramLong2 > l3)))
      return; 
    int k = paramLong1 cmp paramLong2;
    int i = 0;
    if (k < 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int j = paramLong1 cmp 0L;
    if ((j >= 0 && paramLong2 < 0L) || (paramLong1 <= l3 && paramLong2 > l3)) {
      this.u = false;
      x(this, k91.c, bool);
    } 
    if (this.G) {
      while (true) {
        l2 = l1;
        if (i < this.F.size()) {
          ((kw1)this.F.get(i)).D(paramLong1, paramLong2);
          i++;
          continue;
        } 
        break;
      } 
    } else {
      i = 1;
      while (true) {
        int m = this.F.size();
        ArrayList arrayList = this.F;
        if (i < m) {
          if (((kw1)arrayList.get(i)).A <= paramLong2) {
            i++;
            continue;
          } 
        } else {
          i = arrayList.size();
        } 
        i--;
        if (k >= 0) {
          while (true) {
            l2 = l1;
            if (i < this.F.size()) {
              kw1 kw11 = this.F.get(i);
              l2 = kw11.A;
              long l = paramLong1 - l2;
              if (l < l1)
                break; 
              kw11.D(l, paramLong2 - l2);
              i++;
              continue;
            } 
            l1 = l2;
            break;
          } 
        } else {
          l2 = 0L;
          while (true) {
            l1 = l2;
            if (i >= 0) {
              kw1 kw11 = this.F.get(i);
              l1 = kw11.A;
              long l = paramLong1 - l1;
              kw11.D(l, paramLong2 - l1);
              if (l >= 0L) {
                l1 = l2;
                break;
              } 
              i--;
              continue;
            } 
            break;
          } 
        } 
        if (this.l != null) {
          i = paramLong1 cmp l3;
          if ((i > 0 && paramLong2 <= l3) || (j < 0 && paramLong2 >= l1)) {
            if (i > 0)
              this.u = true; 
            x(this, k91.e, bool);
          } 
        } 
        return;
      } 
    } 
    l1 = l2;
    break;
  }
  
  public final void F(z51 paramz51) {
    this.J |= 0x8;
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).F(paramz51); 
  }
  
  public final void H(fb0 paramfb0) {
    super.H(paramfb0);
    this.J |= 0x4;
    if (this.F != null)
      for (byte b = 0; b < this.F.size(); b++)
        ((kw1)this.F.get(b)).H(paramfb0);  
  }
  
  public final void I() {
    this.J |= 0x2;
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).I(); 
  }
  
  public final void J(long paramLong) {
    this.c = paramLong;
  }
  
  public final String L(String paramString) {
    String str = super.L(paramString);
    for (byte b = 0; b < this.F.size(); b++) {
      StringBuilder stringBuilder = ga1.l(str, "\n");
      stringBuilder.append(((kw1)this.F.get(b)).L(paramString.concat("  ")));
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  public final void M(kw1 paramkw1) {
    this.F.add(paramkw1);
    paramkw1.l = this;
    long l = this.e;
    if (l >= 0L)
      paramkw1.E(l); 
    if ((this.J & 0x1) != 0)
      paramkw1.G(this.f); 
    if ((this.J & 0x2) != 0)
      paramkw1.I(); 
    if ((this.J & 0x4) != 0)
      paramkw1.H(this.y); 
    if ((this.J & 0x8) != 0)
      paramkw1.F(null); 
  }
  
  public final void N(long paramLong) {
    this.e = paramLong;
    if (paramLong >= 0L) {
      ArrayList arrayList = this.F;
      if (arrayList != null) {
        int i = arrayList.size();
        for (byte b = 0; b < i; b++)
          ((kw1)this.F.get(b)).E(paramLong); 
      } 
    } 
  }
  
  public final void O(TimeInterpolator paramTimeInterpolator) {
    this.J |= 0x1;
    ArrayList arrayList = this.F;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++)
        ((kw1)this.F.get(b)).G(paramTimeInterpolator); 
    } 
    this.f = paramTimeInterpolator;
  }
  
  public final void P(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1) {
        this.G = false;
        return;
      } 
      throw new AndroidRuntimeException(ga1.i("Invalid parameter for TransitionSet ordering: ", paramInt));
    } 
    this.G = true;
  }
  
  public final void c() {
    super.c();
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).c(); 
  }
  
  public final void d(tw1 paramtw1) {
    View view = paramtw1.b;
    if (v(view)) {
      ArrayList<Object> arrayList = this.F;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        kw1 kw11 = (kw1)arrayList.get(i);
        int k = i + 1;
        kw11 = kw11;
        i = k;
        if (kw11.v(view)) {
          kw11.d(paramtw1);
          paramtw1.c.add(kw11);
          i = k;
        } 
      } 
    } 
  }
  
  public final void f(tw1 paramtw1) {
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).f(paramtw1); 
  }
  
  public final void g(tw1 paramtw1) {
    View view = paramtw1.b;
    if (v(view)) {
      ArrayList<Object> arrayList = this.F;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        kw1 kw11 = (kw1)arrayList.get(i);
        int k = i + 1;
        kw11 = kw11;
        i = k;
        if (kw11.v(view)) {
          kw11.g(paramtw1);
          paramtw1.c.add(kw11);
          i = k;
        } 
      } 
    } 
  }
  
  public final kw1 j() {
    qw1 qw11 = (qw1)super.j();
    qw11.F = new ArrayList();
    int i = this.F.size();
    for (byte b = 0; b < i; b++) {
      kw1 kw11 = ((kw1)this.F.get(b)).j();
      qw11.F.add(kw11);
      kw11.l = qw11;
    } 
    return qw11;
  }
  
  public final void l(ViewGroup paramViewGroup, n2 paramn21, n2 paramn22, ArrayList paramArrayList1, ArrayList paramArrayList2) {
    long l = this.c;
    int i = this.F.size();
    for (byte b = 0; b < i; b++) {
      kw1 kw11 = this.F.get(b);
      if (l > 0L && (this.G || b == 0)) {
        long l1 = kw11.c;
        if (l1 > 0L) {
          kw11.J(l1 + l);
        } else {
          kw11.J(l);
        } 
      } 
      kw11.l(paramViewGroup, paramn21, paramn22, paramArrayList1, paramArrayList2);
    } 
  }
  
  public final void n() {
    for (byte b = 0; b < this.F.size(); b++)
      ((kw1)this.F.get(b)).n(); 
    super.n();
  }
  
  public final boolean t() {
    for (byte b = 0; b < this.F.size(); b++) {
      if (((kw1)this.F.get(b)).t())
        return true; 
    } 
    return false;
  }
  
  public final void y(View paramView) {
    super.y(paramView);
    int i = this.F.size();
    for (byte b = 0; b < i; b++)
      ((kw1)this.F.get(b)).y(paramView); 
  }
  
  public final void z() {
    this.z = 0L;
    byte b = 0;
    pw1 pw1 = new pw1(this, 0);
    while (b < this.F.size()) {
      kw1 kw11 = this.F.get(b);
      kw11.a(pw1);
      kw11.z();
      long l1 = kw11.z;
      boolean bool = this.G;
      long l2 = this.z;
      if (bool) {
        this.z = Math.max(l2, l1);
      } else {
        kw11.A = l2;
        this.z = l2 + l1;
      } 
      b++;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */