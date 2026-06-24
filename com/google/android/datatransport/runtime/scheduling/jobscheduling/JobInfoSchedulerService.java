package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e6;
import ff;
import ia1;
import ib;
import java.util.concurrent.Executor;
import vw1;
import wy;
import zv0;

public class JobInfoSchedulerService extends JobService {
  public static final int b = 0;
  
  public final boolean onStartJob(JobParameters paramJobParameters) {
    String str1 = paramJobParameters.getExtras().getString("backendName");
    String str2 = paramJobParameters.getExtras().getString("extras");
    int j = paramJobParameters.getExtras().getInt("priority");
    int i = paramJobParameters.getExtras().getInt("attemptNumber");
    vw1.b(getApplicationContext());
    zv0 zv0 = ib.a();
    zv0.A(str1);
    zv0.f = ia1.b(j);
    if (str2 != null)
      zv0.e = Base64.decode(str2, 0); 
    wy wy = (vw1.a()).d;
    ib ib = zv0.j();
    e6 e6 = new e6(9, this, paramJobParameters);
    ((Executor)wy.e).execute((Runnable)new ff(wy, ib, i, (Runnable)e6));
    return true;
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters) {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\datatransport\runtime\scheduling\jobscheduling\JobInfoSchedulerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */