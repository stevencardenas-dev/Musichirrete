package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import b82;
import c82;
import e82;
import eh1;
import java.util.List;
import ls1;
import mo0;
import no0;
import oo0;
import ps;
import py;
import q72;
import qp0;
import t72;
import wc0;
import zo2;

public final class DiagnosticsWorker extends Worker {
  public DiagnosticsWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
  }
  
  public final no0 c() {
    q72 q72 = q72.a(((oo0)this).a);
    q72.getClass();
    WorkDatabase workDatabase = q72.c;
    workDatabase.getClass();
    c82 c82 = workDatabase.v();
    t72 t72 = workDatabase.t();
    e82 e82 = workDatabase.w();
    ls1 ls1 = workDatabase.s();
    q72.b.d.getClass();
    long l = System.currentTimeMillis();
    List list3 = (List)zo2.N(c82.a, true, false, (wc0)new b82(l - 86400000L));
    eh1 eh1 = c82.a;
    List list2 = (List)zo2.N(eh1, true, false, (wc0)new ps(11));
    List list1 = (List)zo2.N(eh1, true, false, (wc0)new ps(15));
    if (!list3.isEmpty()) {
      qp0 qp0 = qp0.h();
      String str = py.a;
      qp0.i(str, "Recently completed work:\n\n");
      qp0.h().i(str, py.a(t72, e82, ls1, list3));
    } 
    if (!list2.isEmpty()) {
      qp0 qp0 = qp0.h();
      String str = py.a;
      qp0.i(str, "Running work:\n\n");
      qp0.h().i(str, py.a(t72, e82, ls1, list2));
    } 
    if (!list1.isEmpty()) {
      qp0 qp0 = qp0.h();
      String str = py.a;
      qp0.i(str, "Enqueued work:\n\n");
      qp0.h().i(str, py.a(t72, e82, ls1, list1));
    } 
    return (no0)new mo0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\workers\DiagnosticsWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */