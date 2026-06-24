import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import in.krosbits.musicolet.MyApplication;

public class k01 extends ru0 {
  public final Dialog F0(Bundle paramBundle) {
    try {
      iv0 iv0 = iv0.d(MyApplication.i.getApplicationContext());
      String str = (iv0.g()).d;
      Drawable drawable = MyApplication.i.getApplicationContext().getResources().getDrawable(2131231607);
      int i = (int)(MyApplication.p * 24.0F);
      drawable.setBounds(0, 0, i, i);
      ag0.C0(m92.h[5], drawable);
      ms0 ms0 = new ms0();
      this(P());
      ms0.S = drawable;
      ms0.f = str;
      ms0.k(2131886278);
      ms0.n(2131886874);
      m60 m60 = new m60();
      return new ss0(ms0);
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */