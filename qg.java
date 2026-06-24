import android.app.Activity;
import android.text.Html;
import com.google.android.gms.common.api.internal.BasePendingResult;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayDeque;
import java.util.TimerTask;

public final class qg extends TimerTask {
  public final int b;
  
  public final Object c;
  
  public final void run() {
    rt0 rt0;
    ArrayDeque arrayDeque;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        rt0 = (rt0)object;
        arrayDeque = rt0.h;
        if (!arrayDeque.isEmpty() && rt0.k == null && rt0.b != 0L) {
          object = rt0.c;
          int[] arrayOfInt = qj.d(arrayDeque);
          object.getClass();
          n21.j();
          if (!object.v()) {
            object = nf1.u();
          } else {
            object = new ce2((nf1)object, arrayOfInt);
            nf1.w((cg2)object);
          } 
          rt0.k = (BasePendingResult)object;
          object.f(new oo2(rt0, 0));
          arrayDeque.clear();
        } 
        return;
      case 1:
        object = object;
        if (object.getContext() instanceof Activity)
          ((Activity)object.getContext()).runOnUiThread(new yi1(2, this)); 
        return;
      case 0:
        break;
    } 
    try {
      long l = (((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).k()).c;
      object = object;
      String str = ag0.B(l, false, 0);
      StringBuilder stringBuilder = new StringBuilder();
      this("<u>");
      stringBuilder.append(str);
      stringBuilder.append("</u>");
      object.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
    } finally {
      object = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */