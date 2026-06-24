import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

public abstract class zj0 {
  public static final String a = qp0.j("SystemJobScheduler");
  
  public static final JobScheduler a(Context paramContext) {
    paramContext.getClass();
    Object object = paramContext.getSystemService("jobscheduler");
    object.getClass();
    JobScheduler jobScheduler = (JobScheduler)object;
    object = jobScheduler;
    if (Build.VERSION.SDK_INT >= 34)
      object = p0.b(jobScheduler); 
    return (JobScheduler)object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */