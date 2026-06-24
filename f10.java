import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Collections;

public final class f10 extends gj0 {
  public static boolean e = false;
  
  public mb1 d;
  
  public final void a(RecyclerView paramRecyclerView, he1 paramhe1) {
    super.a(paramRecyclerView, paramhe1);
    mb1 mb11 = this.d;
    if (mb11.j != null && mb11.p == MusicService.C0 && mb11.m) {
      ArrayList arrayList1 = new ArrayList(mb11.d.b.size());
      arrayList1.addAll(mb11.k.subList(0, mb11.l));
      arrayList1.addAll(mb11.j);
      ArrayList arrayList2 = mb11.k;
      arrayList1.addAll(arrayList2.subList(mb11.l, arrayList2.size()));
      if (arrayList1.size() == mb11.d.b.size()) {
        int i = mb11.l();
        if (i >= 0) {
          boolean bool = mb11.p;
          xn1 xn1 = mb11.d;
          if (bool) {
            xn1.c = arrayList1;
          } else {
            xn1.b.clear();
            mb11.d.b.addAll(arrayList1);
          } 
          mb11.d.n(i);
        } 
      } 
    } 
    mb11.k = null;
    mb11.j = null;
    mb11.m = false;
    mb11.l = 0;
    mb11.o = -1;
    mb11.n = -1;
    my0.h(mb11.q);
    mb11.q = null;
    if (e) {
      e = false;
      MusicService musicService = MusicService.P0;
      if (musicService != null) {
        musicService.b0(true);
        MyApplication.h().a();
        MusicService.T0(MyApplication.i.getApplicationContext());
      } 
    } 
  }
  
  public final int d() {
    return gj0.m(0, 3) | gj0.m(2, 3) | gj0.m(1, 8);
  }
  
  public final boolean o(RecyclerView paramRecyclerView, he1 paramhe11, he1 paramhe12) {
    mb1 mb11 = this.d;
    mb11.getClass();
    int j = paramhe11.c();
    int i = paramhe12.c();
    if (j >= 0 && i >= 0) {
      int k;
      if (j < i) {
        k = i;
        if (i - j > 1)
          k = j + 1; 
      } else if (j > i) {
        k = i;
        if (j - i > 1)
          k = j - 1; 
      } else {
        return true;
      } 
      if (mb11.j != null) {
        int m = mb11.l;
        byte b = 0;
        if (j == m) {
          i = 1;
        } else {
          i = 0;
        } 
        if (k == m)
          b = 1; 
        if (i != b) {
          if (i != 0) {
            mb11.l = k;
          } else {
            mb11.l = j;
          } 
          mb11.m = true;
        } 
      } else {
        ArrayList<?> arrayList;
        boolean bool = MusicService.C0;
        xn1 xn12 = mb11.d;
        if (bool) {
          arrayList = xn12.c;
        } else {
          arrayList = ((xn1)arrayList).b;
        } 
        Collections.swap(arrayList, j, k);
        i = mb11.d.e(MusicService.C0);
        xn1 xn11 = mb11.d;
        if (j == i) {
          xn11.n(k);
        } else if (k == xn11.e(MusicService.C0)) {
          mb11.d.n(j);
        } 
      } 
      mb11.a.c(j, k);
      e = true;
      try {
        return true;
      } finally {
        paramRecyclerView = null;
      } 
    } 
    return true;
  }
  
  public final void p(he1 paramhe1) {
    int i = paramhe1.c();
    if (i >= 0)
      this.d.m(i); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */