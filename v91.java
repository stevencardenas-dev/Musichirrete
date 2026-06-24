import androidx.recyclerview.widget.RecyclerView;

public final class v91 extends kd1 {
  public final z91 a;
  
  public final RecyclerView b;
  
  public final String c;
  
  public v91(z91 paramz91, RecyclerView paramRecyclerView, String paramString) {
    this.a = paramz91;
    this.b = paramRecyclerView;
    this.c = paramString;
  }
  
  public final void a() {
    f();
  }
  
  public final void b(int paramInt1, int paramInt2, Object paramObject) {
    f();
  }
  
  public final void c(int paramInt1, int paramInt2) {
    f();
  }
  
  public final void d(int paramInt1, int paramInt2) {
    f();
  }
  
  public final void e(int paramInt1, int paramInt2) {
    f();
  }
  
  public final void f() {
    z91 z911 = this.a;
    z911.a.unregisterObserver(this);
    int i = z911.o(this.c);
    if (i != -1)
      this.b.k0(i); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */