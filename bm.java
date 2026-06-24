import android.database.ContentObserver;
import android.os.Handler;
import android.text.format.DateFormat;
import in.krosbits.android.widgets.ClockView;
import in.krosbits.android.widgets.DateView;
import java.text.SimpleDateFormat;

public final class bm extends ContentObserver {
  public final int a;
  
  public final Object b;
  
  public bm(ClockView paramClockView) {
    super(new Handler());
  }
  
  public bm(DateView paramDateView) {
    super(new Handler());
  }
  
  public bm(lt paramlt) {
    super(new Handler());
  }
  
  public boolean deliverSelfNotifications() {
    switch (this.a) {
      default:
        return super.deliverSelfNotifications();
      case 1:
        break;
    } 
    return true;
  }
  
  public final void onChange(boolean paramBoolean) {
    lt lt;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        object = object;
        i = DateView.i;
        ((DateView)object).h = new SimpleDateFormat("MMM dd, E");
        return;
      case 1:
        lt = (lt)object;
        if (lt.c) {
          object = lt.e;
          if (object != null && !object.isClosed())
            lt.b = lt.e.requery(); 
        } 
        return;
      case 0:
        break;
    } 
    object = object;
    i = ClockView.i;
    ((ClockView)object).h = DateFormat.getTimeFormat(object.getContext());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */