import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.pairip.VMRunner;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class vv extends BroadcastReceiver {
  public static vv c;
  
  public final Handler a = new Handler(Looper.getMainLooper());
  
  public final ArrayList b = new ArrayList();
  
  public static void b(wv paramwv) {
    synchronized (wv.i) {
      int i;
      Context context = paramwv.a;
      if (context == null) {
        i = 0;
      } else {
        i = d12.d(context);
      } 
      int j = paramwv.f;
      if (j == i) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{wv}, name=paramwv} */
        return;
      } 
      paramwv.f = i;
      if (i == 1 || i == 0 || i == 8) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{wv}, name=paramwv} */
        return;
      } 
      SparseArray sparseArray = paramwv.b;
      Long long_2 = (Long)sparseArray.get(i);
      Long long_1 = long_2;
      if (long_2 == null)
        long_1 = (Long)sparseArray.get(0); 
      long_2 = long_1;
      if (long_1 == null)
        long_2 = Long.valueOf(1000000L); 
      paramwv.g = long_2.longValue();
      paramwv.e.getClass();
      SystemClock.elapsedRealtime();
      long l = paramwv.g;
      if (l != paramwv.h) {
        paramwv.h = l;
        gh1 gh1 = paramwv.c;
        tp tp = new tp();
        this(14);
        for (m50 m50 : gh1.c) {
          Handler handler = m50.a;
          e e = new e();
          this(16, m50, tp);
          handler.post(e);
        } 
      } 
      paramwv.d.a.clear();
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{wv}, name=paramwv} */
      return;
    } 
  }
  
  public final void a() {
    ArrayList<WeakReference<wv>> arrayList = this.b;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      if ((wv)((WeakReference<wv>)arrayList.get(i)).get() == null)
        arrayList.remove(i); 
    } 
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("g6bUCEUALGWpZ8Iz", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */