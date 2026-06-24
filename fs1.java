import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class fs1 extends hd {
  public final HashMap b;
  
  public final gs1 c;
  
  public fs1(gs1 paramgs1) {
    this.c = paramgs1;
    this.b = new HashMap<Object, Object>();
  }
  
  public final void h(d62 paramd62) {
    ArrayList<xa1> arrayList = this.c.b;
    if ((paramd62.a.d() & 0x207) != 0) {
      this.b.remove(paramd62);
      for (int i = arrayList.size() - 1; i >= 0; i--) {
        boolean bool;
        xa1 xa1 = arrayList.get(i);
        int j = xa1.e;
        if (j > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        xa1.e = --j;
        if (bool && j == 0)
          xa1.c(); 
      } 
    } 
  }
  
  public final void i(d62 paramd62) {
    ArrayList<xa1> arrayList = this.c.b;
    if ((paramd62.a.d() & 0x207) != 0)
      for (int i = arrayList.size() - 1; i >= 0; i--) {
        xa1 xa1 = arrayList.get(i);
        xa1.e++;
      }  
  }
  
  public final x62 j(x62 paramx62, List<d62> paramList) {
    ArrayList<xa1> arrayList = this.c.b;
    RectF rectF = new RectF(1.0F, 1.0F, 1.0F, 1.0F);
    int j = paramList.size() - 1;
    int i;
    for (i = 0; j >= 0; i = k) {
      d62 d62 = paramList.get(j);
      Integer integer = (Integer)this.b.get(d62);
      int k = i;
      if (integer != null) {
        k = integer.intValue();
        float f = d62.a.a();
        if ((k & 0x1) != 0)
          rectF.left = f; 
        if ((k & 0x2) != 0)
          rectF.top = f; 
        if ((k & 0x4) != 0)
          rectF.right = f; 
        if ((k & 0x8) != 0)
          rectF.bottom = f; 
        k = i | k;
      } 
      j--;
    } 
    fi0 fi0 = fi0.b(paramx62.a.h(519), paramx62.a.h(64));
    for (j = arrayList.size() - 1; j >= 0; j--) {
      xa1 xa1 = arrayList.get(j);
      fi0 fi01 = xa1.d;
      ArrayList<hn> arrayList1 = xa1.a;
      for (int k = arrayList1.size() - 1; k >= 0; k--) {
        hn hn = arrayList1.get(k);
        int m = hn.a;
        if ((m & i) != 0) {
          wa1 wa1 = hn.b;
          if (wa1.d != true) {
            wa1.d = true;
            j01 j01 = wa1.i;
            if (j01 != null)
              ((View)j01.e).setVisibility(0); 
          } 
          if (m != 1) {
            if (m != 2) {
              if (m != 4) {
                if (m == 8) {
                  m = fi01.d;
                  if (m > 0)
                    hn.b(fi0.d / m); 
                  hn.a(rectF.bottom);
                } 
              } else {
                m = fi01.c;
                if (m > 0)
                  hn.b(fi0.c / m); 
                hn.a(rectF.right);
              } 
            } else {
              m = fi01.b;
              if (m > 0)
                hn.b(fi0.b / m); 
              hn.a(rectF.top);
            } 
          } else {
            m = fi01.a;
            if (m > 0)
              hn.b(fi0.a / m); 
            hn.a(rectF.left);
          } 
        } 
      } 
    } 
    return paramx62;
  }
  
  public final j01 k(d62 paramd62, j01 paramj01) {
    if ((paramd62.a.d() & 0x207) != 0) {
      fi0 fi02 = (fi0)paramj01.e;
      fi0 fi01 = (fi0)paramj01.c;
      if (fi02.a != fi01.a) {
        j = 1;
      } else {
        j = 0;
      } 
      int i = j;
      if (fi02.b != fi01.b)
        i = j | 0x2; 
      int j = i;
      if (fi02.c != fi01.c)
        j = i | 0x4; 
      i = j;
      if (fi02.d != fi01.d)
        i = j | 0x8; 
      this.b.put(paramd62, Integer.valueOf(i));
    } 
    return paramj01;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */