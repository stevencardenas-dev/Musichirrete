import android.media.VolumeProvider;
import android.os.Build;

public final class el {
  public final int a;
  
  public final int b;
  
  public final String c;
  
  public int d;
  
  public VolumeProvider e;
  
  public final int f;
  
  public final Object g;
  
  public el(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.c = paramString;
  }
  
  public el(fl paramfl, int paramInt) {
    this(2, 20, paramInt, null);
  }
  
  public el(p01 paramp01, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    this(paramInt1, paramInt2, paramInt3, paramString);
  }
  
  public VolumeProvider a() {
    if (this.e == null)
      if (Build.VERSION.SDK_INT >= 30) {
        int k = this.d;
        String str = this.c;
        int j = this.a;
        int i = this.b;
        this.e = new r42(this, j, i, k, str);
      } else {
        int j = this.b;
        int i = this.d;
        this.e = new s42(this, this.a, j, i);
      }  
    return this.e;
  }
  
  public final void b(int paramInt) {
    int i = this.f;
    Object object = this.g;
    switch (i) {
      default:
        ((ee0)((p01)object).f).a.post(new ce0(this, paramInt, 1));
        return;
      case 0:
        break;
    } 
    object = object;
    object.q0(object.j0() + paramInt);
  }
  
  public final void c(int paramInt) {
    int i = this.f;
    Object object = this.g;
    switch (i) {
      default:
        ((ee0)((p01)object).f).a.post(new ce0(this, paramInt, 0));
        return;
      case 0:
        break;
    } 
    ((fl)object).q0(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */