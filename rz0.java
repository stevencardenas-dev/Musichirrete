import android.content.Context;
import android.net.Uri;
import t.c;

public final class rz0 extends ad {
  public final Context f;
  
  public final Uri g;
  
  public long h;
  
  public boolean i;
  
  public final boolean j;
  
  public final long k;
  
  public final f01 l;
  
  public final int m;
  
  public final boolean n;
  
  public final boolean o;
  
  public final float p;
  
  public final float q;
  
  public final boolean r;
  
  public final m60 s;
  
  public rz0(Context paramContext, Uri paramUri, long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, boolean paramBoolean3, f01 paramf01, m60 paramm60) {
    this.f = paramContext;
    this.g = paramUri;
    this.m = paramInt;
    this.n = paramBoolean1;
    this.o = paramBoolean2;
    this.p = paramFloat1;
    this.q = paramFloat2;
    this.r = paramBoolean3;
    this.j = true;
    this.k = paramLong;
    this.l = paramf01;
    this.s = paramm60;
    if (paramf01 != null) {
      paramLong = c.s();
      p5 p5 = paramf01.k;
      long l = p5.b;
      if (l == 0L && l != paramLong)
        p5.b = paramLong; 
    } 
  }
  
  public final nt0 a(fw0 paramfw0, uv paramuv, long paramLong) {
    f01 f011 = this.l;
    m60 m601 = this.s;
    return new qz0(this.f, this.g, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this, this.j, f011, m601);
  }
  
  public final Object f() {
    return !this.b.isEmpty() ? this.g : null;
  }
  
  public final void g() {}
  
  public final void i(wv paramwv) {
    long l = this.h;
    boolean bool = this.i;
    this.h = l;
    this.i = bool;
    j(new cn1(l, this.g, bool));
  }
  
  public final void k(nt0 paramnt0) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast qz0
    //   4: astore_1
    //   5: aload_1
    //   6: getfield v : Lf01;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull -> 37
    //   14: aload_2
    //   15: monitorenter
    //   16: aload_2
    //   17: getfield m : Ljava/util/ArrayList;
    //   20: astore_3
    //   21: aload_3
    //   22: aload_1
    //   23: invokevirtual remove : (Ljava/lang/Object;)Z
    //   26: pop
    //   27: aload_2
    //   28: monitorexit
    //   29: goto -> 37
    //   32: astore_1
    //   33: aload_2
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: aload_1
    //   38: getfield l : Lpz0;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnull -> 70
    //   46: aload_2
    //   47: getfield b : Ljava/lang/Object;
    //   50: checkcast nz0
    //   53: astore_2
    //   54: aload_2
    //   55: ifnull -> 70
    //   58: aload_2
    //   59: invokestatic b : (Lnz0;)V
    //   62: goto -> 70
    //   65: astore_2
    //   66: aload_2
    //   67: invokevirtual printStackTrace : ()V
    //   70: aload_1
    //   71: getfield g : Lin/krosbits/nativex/FDTS;
    //   74: invokevirtual a : ()V
    //   77: return
    // Exception table:
    //   from	to	target	type
    //   21	27	32	finally
    //   33	35	32	finally
    //   46	54	65	finally
    //   58	62	65	finally
  }
  
  public final void m() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */