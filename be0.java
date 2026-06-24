import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class be0 extends Handler {
  public final ArrayList a = new ArrayList();
  
  public final ArrayList b = new ArrayList();
  
  public final ee0 c;
  
  public be0(ee0 paramee0) {}
  
  public static void a(ev0 paramev0, int paramInt1, Object paramObject, int paramInt2) {
    gv0 gv0;
    hv0 hv0;
    iv0 iv0 = paramev0.a;
    dv0 dv0 = paramev0.b;
    int i = 0xFF00 & paramInt1;
    if (i != 256) {
      if (i != 512)
        if (i == 768 && paramInt1 == 769) {
          lv0 lv0 = (lv0)paramObject;
          dv0.getClass();
          return;
        }  
      gv0 = (gv0)paramObject;
      switch (paramInt1) {
        default:
          return;
        case 515:
          dv0.b(iv0);
          return;
        case 514:
          dv0.c(iv0);
          return;
        case 513:
          break;
      } 
      dv0.a(iv0);
      return;
    } 
    if (paramInt1 == 264 || paramInt1 == 262) {
      paramObject = paramObject;
      hv0 = ((de0)paramObject).b;
      paramObject = ((de0)paramObject).a;
    } else if (paramInt1 != 265 && paramInt1 != 266) {
      hv0 = (hv0)paramObject;
      paramObject = null;
    } else {
      throw x41.f(paramObject);
    } 
    if (hv0 != null) {
      int j = ((ev0)gv0).d;
      boolean bool = true;
      i = bool;
      if ((j & 0x2) == 0)
        if (hv0.h(((ev0)gv0).c)) {
          i = bool;
        } else {
          boolean bool1;
          lv0 lv0 = (iv0.c()).w;
          if (lv0 == null) {
            bool1 = false;
          } else {
            bool1 = lv0.c;
          } 
          if (bool1 && hv0.d() && paramInt1 == 262 && paramInt2 == 3 && paramObject != null) {
            i = true ^ paramObject.d();
          } else {
            i = 0;
          } 
        }  
      if (i == 0);
      switch (paramInt1) {
        default:
        
        case 266:
          dv0.g((hv0)paramObject, hv0, paramInt2);
          return;
        case 265:
          dv0.f((hv0)paramObject, hv0);
          return;
        case 264:
          dv0.l(iv0, hv0, paramInt2, (hv0)paramObject);
          return;
        case 263:
          dv0.n(iv0, hv0, paramInt2);
          return;
        case 262:
          dv0.l(iv0, hv0, paramInt2, hv0);
          return;
        case 261:
          dv0.h(iv0);
          return;
        case 260:
          dv0.o(hv0);
          return;
        case 259:
          dv0.e(iv0, hv0);
          return;
        case 258:
          dv0.i(iv0, hv0);
          return;
        case 257:
          break;
      } 
      dv0.d(iv0, hv0);
    } 
  }
  
  public final void b(int paramInt, Object paramObject) {
    obtainMessage(paramInt, paramObject).sendToTarget();
  }
  
  public final void handleMessage(Message paramMessage) {
    hv0 hv0;
    de0 de0;
    ArrayList<hv0> arrayList1 = this.a;
    ee0 ee01 = this.c;
    ArrayList<WeakReference<iv0>> arrayList2 = ee01.i;
    h71 h71 = ee01.t;
    int i = paramMessage.what;
    Object object = paramMessage.obj;
    int j = paramMessage.arg1;
    if (i == 259 && (ee01.g()).c.equals(((hv0)object).c))
      ee01.q(true); 
    byte b2 = 0;
    ArrayList arrayList = this.b;
    if (i != 262) {
      if (i != 264) {
        switch (i) {
          case 259:
            hv0 = (hv0)object;
            h71.getClass();
            if (hv0.c() != h71) {
              int m = h71.k(hv0);
              if (m >= 0)
                h71.t(h71.t.get(m)); 
            } 
            break;
          case 258:
            h71.o((hv0)object);
            break;
          case 257:
            h71.n((hv0)object);
            break;
        } 
      } else {
        de0 = (de0)object;
        hv0 hv01 = de0.b;
        hv0.add(hv01);
        h71.n(hv01);
        if (de0.c)
          h71.p(hv01); 
      } 
    } else {
      de0 de01 = (de0)object;
      hv0 hv01 = de01.b;
      if (de01.c)
        h71.p(hv01); 
      if (((ee0)de0).x != null && hv01.d()) {
        int m = hv0.size();
        byte b = 0;
        while (b < m) {
          de0 = hv0.get(b);
          b++;
          h71.o((hv0)de0);
        } 
        hv0.clear();
      } 
    } 
    try {
      int m = arrayList2.size();
      while (--m >= 0) {
        iv0 iv0 = ((WeakReference<iv0>)arrayList2.get(m)).get();
        if (iv0 == null) {
          arrayList2.remove(m);
          continue;
        } 
        arrayList1.addAll(iv0.b);
      } 
    } finally {}
    int k = arrayList1.size();
    byte b1 = b2;
    while (b1 < k) {
      hv0 = arrayList1.get(b1);
      b1++;
      a((ev0)hv0, i, object, j);
    } 
    arrayList1.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\be0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */