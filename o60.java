import java.util.concurrent.CopyOnWriteArrayList;

public final class o60 implements Runnable {
  public final q71 b;
  
  public final CopyOnWriteArrayList c;
  
  public final zv0 e;
  
  public final boolean f;
  
  public final int g;
  
  public final int h;
  
  public final boolean i;
  
  public final boolean j;
  
  public final boolean k;
  
  public final boolean l;
  
  public final boolean m;
  
  public final boolean n;
  
  public final boolean o;
  
  public o60(q71 paramq711, q71 paramq712, CopyOnWriteArrayList<?> paramCopyOnWriteArrayList, zv0 paramzv0, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.b = paramq711;
    this.c = new CopyOnWriteArrayList(paramCopyOnWriteArrayList);
    this.e = paramzv0;
    this.f = paramBoolean1;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramBoolean2;
    this.o = paramBoolean4;
    paramInt1 = paramq712.e;
    paramInt2 = paramq711.e;
    paramBoolean2 = false;
    if (paramInt1 != paramInt2) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.j = paramBoolean1;
    l60 l601 = paramq712.f;
    l60 l602 = paramq711.f;
    if (l601 != l602 && l602 != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.k = paramBoolean1;
    if (paramq712.a != paramq711.a) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.l = paramBoolean1;
    if (paramq712.g != paramq711.g) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.m = paramBoolean1;
    paramBoolean1 = paramBoolean2;
    if (paramq712.i != paramq711.i)
      paramBoolean1 = true; 
    this.n = paramBoolean1;
  }
  
  public final void run() {
    q71 q711 = this.b;
    oz0 oz0 = q711.i;
    boolean bool = this.l;
    CopyOnWriteArrayList copyOnWriteArrayList = this.c;
    if (bool || this.h == 0)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.t(q711.a); 
      }  
    if (this.f)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.a(this.g); 
      }  
    if (this.k)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.g(q711.f); 
      }  
    if (this.n) {
      null = oz0.f;
      this.e.getClass();
      null = null;
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b) {
          u71 u71 = fd.a;
          Object object = oz0.e;
          u71.s();
        } 
      } 
    } 
    if (this.m)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.c(); 
      }  
    if (this.j)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.n(q711.e); 
      }  
    if (this.o)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.q(); 
      }  
    if (this.i)
      for (fd fd : copyOnWriteArrayList) {
        if (!fd.b)
          fd.a.i(); 
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */