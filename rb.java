import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import com.pairip.VMRunner;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.Iterator;
import java.util.List;

public final class rb extends AsyncTask {
  public final int a;
  
  public ss0 b;
  
  public boolean c;
  
  public final Context d;
  
  public final Object e;
  
  public rb(Context paramContext, List paramList) {}
  
  public rb(u00 paramu00, Context paramContext, boolean paramBoolean) {}
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    return VMRunner.invoke("JhNJfaUPMomrTNEc", new Object[] { rb.class, { this, paramArrayOfObject } });
  }
  
  public void onCancelled() {
    switch (this.a) {
      default:
        super.onCancelled();
        return;
      case 0:
        break;
    } 
    ss0 ss01 = this.b;
    if (ss01 != null && ss01.isShowing()) {
      this.b.dismiss();
      this.b = null;
    } 
  }
  
  public final void onPostExecute(Object paramObject) {
    int i = this.a;
    Context context = this.d;
    Object object = this.e;
    switch (i) {
      default:
        paramObject = object;
        object = this.b;
        if (object != null)
          object.dismiss(); 
        this.b = null;
        object = MusicActivity.R0;
        if (object != null)
          object.K0(); 
        if (this.c && paramObject.size() == 1)
          MusicActivity.F0(context, paramObject.get(0), new int[0]); 
        return;
      case 0:
        break;
    } 
    object = object;
    ss0 ss01 = this.b;
    if (ss01 != null)
      try {
        if (ss01.isShowing())
          this.b.dismiss(); 
      } finally {
        ss01 = null;
      }  
    if (paramObject instanceof Boolean && ((Boolean)paramObject).booleanValue() && this.c)
      try {
        if (object instanceof cd1) {
          paramObject = MyApplication.F;
          paramObject = ml0.a((paramObject.c(paramObject.f(((cd1)object).H()))).b);
        } else {
          paramObject = object.h();
        } 
        ms0 ms0 = new ms0();
        this(context);
        ms0.q(2131886235);
        ms0.d((CharSequence)paramObject);
        ms0.n(2131886467);
        ms0.l(2131887363);
        paramObject = new f();
        super(2, object);
        ms0.C = (rs0)paramObject;
      } finally {
        paramObject = null;
      }  
  }
  
  public final void onPreExecute() {
    ms0 ms0;
    ss0 ss01;
    int i = this.a;
    Context context = this.d;
    switch (i) {
      default:
        ss01 = MusicActivity.S0;
        if (ss01 != null) {
          ss01.dismiss();
          this.c = true;
        } 
        ms0 = new ms0(context);
        ms0.o(0, true);
        ms0.J = false;
        ms0.K = false;
        ms0.c(2131887105);
        this.b = ms0.p();
        return;
      case 0:
        break;
    } 
    if (this.c && ms0 != null) {
      ms0 = new ms0((Context)ms0);
      ms0.c(2131886234);
      ms0.o(0, true);
      ms0.J = false;
      ms0.K = false;
      this.b = ms0.p();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */