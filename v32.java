import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class v32 implements kk2 {
  public final ArrayList b;
  
  public long c;
  
  public boolean e;
  
  public Object f;
  
  public Object g;
  
  public final Object h;
  
  public v32() {
    this.c = -1L;
    this.h = new lv1(this);
    this.b = new ArrayList();
  }
  
  public v32(m70 paramm70, ArrayList paramArrayList1, ArrayList paramArrayList2, long paramLong, boolean paramBoolean, ArrayList paramArrayList3) {
    this.h = paramm70;
    this.b = paramArrayList1;
    this.f = paramArrayList2;
    this.c = paramLong;
    this.e = paramBoolean;
    this.g = paramArrayList3;
  }
  
  public void a() {
    m70 m70 = (m70)this.h;
    ArrayList arrayList = (ArrayList)this.f;
    long l = this.c;
    m70.l.addAll(this.b);
    m70.m.addAll(arrayList);
    Long long_ = Long.valueOf(l);
    m70.n(5, 0, long_, long_, null, null, null);
  }
  
  public void b() {
    if (!this.e)
      return; 
    ArrayList<Object> arrayList = this.b;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      u32 u32 = (u32)arrayList.get(b);
      b++;
      ((u32)u32).b();
    } 
    this.e = false;
  }
  
  public void c(int paramInt) {
    ((m70)this.h).n(6, paramInt, null, null, null, null, null);
  }
  
  public void d() {
    if (!this.e) {
      m70 m70 = (m70)this.h;
      ArrayList arrayList1 = (ArrayList)this.g;
      ArrayList arrayList2 = (ArrayList)this.f;
      long l = this.c;
      m70.i.getClass();
      ae2 ae2 = qp2.c.get();
      v32 v321 = new v32(m70, this.b, arrayList2, l, true, arrayList1);
      ae2.getClass();
      if (io1.e.get() != null) {
        ae2.d.execute(new lf0(ae2, arrayList1, v321, 3));
        return;
      } 
      tp.f("Ingestion should only be called in SplitCompat mode.");
    } 
  }
  
  public void e() {
    if (this.e)
      return; 
    ArrayList<Object> arrayList = this.b;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      u32 u32 = (u32)arrayList.get(i);
      int k = i + 1;
      u32 = u32;
      long l = this.c;
      if (l >= 0L)
        u32.c(l); 
      Interpolator interpolator = (Interpolator)this.f;
      if (interpolator != null) {
        View view1 = u32.a.get();
        if (view1 != null)
          view1.animate().setInterpolator((TimeInterpolator)interpolator); 
      } 
      if ((w32)this.g != null)
        u32.d((lv1)this.h); 
      View view = u32.a.get();
      i = k;
      if (view != null) {
        view.animate().start();
        i = k;
      } 
    } 
    this.e = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */