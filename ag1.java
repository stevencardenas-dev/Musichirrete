import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class ag1 {
  public static final AtomicInteger h = new AtomicInteger();
  
  public final v61 a;
  
  public final yf1 b;
  
  public boolean c;
  
  public boolean d;
  
  public int e;
  
  public int f;
  
  public String g;
  
  public ag1(v61 paramv61, Uri paramUri, int paramInt) {
    paramv61.getClass();
    this.a = paramv61;
    Object object = new Object();
    ((yf1)object).a = paramUri;
    ((yf1)object).b = paramInt;
    this.b = (yf1)object;
  }
  
  public final void a() {
    yf1 yf11 = this.b;
    if (!yf11.f) {
      yf11.e = true;
      return;
    } 
    tp.f("Center crop can not be used after calling centerInside");
  }
  
  public final void b() {
    yf1 yf11 = this.b;
    if (!yf11.e) {
      yf11.f = true;
      return;
    } 
    tp.f("Center inside can not be used after calling centerCrop");
  }
  
  public final zf1 c(long paramLong) {
    h.getAndIncrement();
    yf1 yf11 = this.b;
    boolean bool = yf11.f;
    if (!bool || !yf11.e) {
      boolean bool1 = yf11.e;
      if (!bool1 || yf11.c != 0 || yf11.d != 0) {
        if (!bool || yf11.c != 0 || yf11.d != 0) {
          if (yf11.i == 0)
            yf11.i = 2; 
          zf1 zf1 = new zf1(yf11.a, yf11.b, yf11.h, yf11.c, yf11.d, bool1, bool, yf11.g, yf11.i);
          this.a.getClass();
          return zf1;
        } 
        tp.f(kOkiWEITVb.CxPtWPNchh);
        return null;
      } 
      tp.f("Center crop requires calling resize with positive width and height.");
      return null;
    } 
    tp.f("Center crop and center inside can not be used together.");
    return null;
  }
  
  public final Drawable d() {
    return (this.e != 0) ? this.a.b.getResources().getDrawable(this.e) : null;
  }
  
  public final void e(kt1 paramkt1) {
    long l = System.nanoTime();
    ii0.b();
    if (paramkt1 != null) {
      if (!this.d) {
        yf1 yf11 = this.b;
        Uri uri = yf11.a;
        v61 v611 = this.a;
        if (uri != null || yf11.b != 0) {
          zf1 zf1 = c(l);
          String str1 = ii0.d(zf1);
          if ((this.f & 0x1) == 0) {
            Bitmap bitmap = v611.g(str1);
            if (bitmap != null) {
              v611.a(paramkt1);
              paramkt1.c(bitmap);
              return;
            } 
          } 
          paramkt1.a(d());
          int i = this.f;
          String str2 = this.g;
          v611.d(new kh0(this.a, paramkt1, zf1, i, str1, str2, false, 1));
          return;
        } 
        v611.a(paramkt1);
        paramkt1.a(d());
        return;
      } 
      tp.f("Fit cannot be used with a Target.");
      return;
    } 
    l0.l("Target must not be null.");
  }
  
  public final void f(ImageView paramImageView) {
    long l = System.nanoTime();
    ii0.b();
    if (paramImageView != null) {
      yf1 yf11 = this.b;
      Uri uri = yf11.a;
      v61 v611 = this.a;
      if (uri != null || yf11.b != 0) {
        if (this.d)
          if (yf11.c == 0 && yf11.d == 0) {
            tx tx;
            int k = paramImageView.getWidth();
            int j = paramImageView.getHeight();
            if (k == 0 || j == 0) {
              y61.b(paramImageView, d());
              tx = new tx(this, paramImageView);
              v611.g.put(paramImageView, tx);
              return;
            } 
            tx.a(k, j);
          } else {
            tp.f("Fit cannot be used with resize.");
            return;
          }  
        zf1 zf1 = c(l);
        String str1 = ii0.d(zf1);
        if ((this.f & 0x1) == 0) {
          Bitmap bitmap = v611.g(str1);
          if (bitmap != null) {
            v611.a(paramImageView);
            y61.a(paramImageView, v611.b, bitmap, 1, this.c);
            v611.getClass();
            return;
          } 
        } 
        y61.b(paramImageView, d());
        int i = this.f;
        String str2 = this.g;
        boolean bool = this.c;
        v611.d(new kh0(this.a, paramImageView, zf1, i, str1, str2, bool, 0));
        return;
      } 
      v611.a(paramImageView);
      y61.b(paramImageView, d());
      return;
    } 
    l0.l("Target must not be null.");
  }
  
  public final void g(int... paramVarArgs) {
    this.f |= 0x1;
    if (paramVarArgs.length > 0) {
      int i = paramVarArgs.length;
      byte b = 0;
      while (b < i) {
        int j = paramVarArgs[b];
        if (j != 0) {
          byte b1;
          int k = this.f;
          if (j != 1) {
            b1 = 2;
            if (j != 2)
              throw null; 
          } else {
            b1 = 1;
          } 
          this.f = k | b1;
          b++;
          continue;
        } 
        l0.l("Memory policy cannot be null.");
      } 
    } 
  }
  
  public final void h() {
    this.c = true;
  }
  
  public final void i() {
    yf1 yf11 = this.b;
    if (yf11.d != 0 || yf11.c != 0) {
      yf11.g = true;
      return;
    } 
    tp.f("onlyScaleDown can not be applied without resize");
  }
  
  public final void j(int paramInt1, int paramInt2) {
    this.b.a(paramInt1, paramInt2);
  }
  
  public final void k() {
    if (this.g == null) {
      this.g = "s";
      return;
    } 
    tp.f("Tag already set.");
  }
  
  public final void l(cw1 paramcw1) {
    paramcw1.b();
    yf1 yf11 = this.b;
    if (yf11.h == null)
      yf11.h = new ArrayList(2); 
    yf11.h.add(paramcw1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ag1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */