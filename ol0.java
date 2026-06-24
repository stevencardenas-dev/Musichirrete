import android.app.Activity;
import android.content.IntentSender;
import in.krosbits.musicolet.MyApplication;
import java.lang.ref.WeakReference;

public final class ol0 {
  public final ql0 a;
  
  public ol0(ql0 paramql0) {
    this.a = paramql0;
  }
  
  public final void a(Object paramObject) {
    WeakReference weakReference;
    tb2 tb2 = (tb2)paramObject;
    int j = tb2.b;
    int i = tb2.a;
    paramObject = this.a;
    if (j == 3 || j == 5) {
      ((ql0)paramObject).I0 = -1;
      ss0 ss0 = ((ql0)paramObject).C0;
      if (ss0 != null) {
        ss0.setOnDismissListener(null);
        ((ql0)paramObject).C0.dismiss();
      } 
      weakReference = dd1.l;
      if (weakReference != null)
        weakReference.clear(); 
      dd1.l = null;
      if (((ql0)paramObject).D0 != null && dd1.P(MyApplication.i.getApplicationContext(), ((ql0)paramObject).D0))
        paramObject.r(((ql0)paramObject).D0, false); 
      return;
    } 
    if (j == 6 || j == 7 || j == 9) {
      ((ql0)paramObject).I0 = -1;
      return;
    } 
    if (j == 1) {
      ((ql0)paramObject).I0 = i;
      paramObject = ((ql0)paramObject).C0;
      if (paramObject != null) {
        paramObject.k("Download pending");
        return;
      } 
    } else if (j == 2) {
      ((ql0)paramObject).I0 = i;
      paramObject = ((ql0)paramObject).C0;
      if (paramObject != null) {
        paramObject.k("Downloading");
        return;
      } 
    } else if (j == 8) {
      ((ql0)paramObject).I0 = -1;
      try {
        ((ql0)paramObject).F0.g((tb2)weakReference, (Activity)((ms0)paramObject).b);
        return;
      } catch (android.content.IntentSender.SendIntentException sendIntentException) {
        sendIntentException.printStackTrace();
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ol0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */