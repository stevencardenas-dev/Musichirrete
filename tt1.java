import android.graphics.Typeface;

public final class tt1 extends n21 {
  public final m92 k;
  
  public final vt1 l;
  
  public tt1(vt1 paramvt1, m92 paramm92) {
    this.l = paramvt1;
    this.k = paramm92;
  }
  
  public final void J(int paramInt) {
    this.l.n = true;
    this.k.P(paramInt);
  }
  
  public final void K(Typeface paramTypeface) {
    vt1 vt11 = this.l;
    paramTypeface = Typeface.create(paramTypeface, vt11.d);
    vt11.p = paramTypeface;
    vt11.n = true;
    this.k.Q(paramTypeface, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */