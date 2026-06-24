import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ns1 implements aj1 {
  public static final String h = qp0.j("SystemJobScheduler");
  
  public final Context b;
  
  public final JobScheduler c;
  
  public final ms1 e;
  
  public final WorkDatabase f;
  
  public final ip g;
  
  public ns1(Context paramContext, WorkDatabase paramWorkDatabase, ip paramip) {
    this.b = paramContext;
    this.c = jobScheduler;
    this.e = ms11;
    this.f = paramWorkDatabase;
    this.g = paramip;
  }
  
  public static void b(JobScheduler paramJobScheduler, int paramInt) {
    try {
      return;
    } finally {
      paramJobScheduler = null;
      qp0 qp0 = qp0.h();
      String str = String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[] { Integer.valueOf(paramInt) });
      qp0.g(h, str, (Throwable)paramJobScheduler);
    } 
  }
  
  public static ArrayList d(Context paramContext, JobScheduler paramJobScheduler) {
    ComponentName componentName;
    ArrayList<JobInfo> arrayList;
    String str = zj0.a;
    paramJobScheduler.getClass();
    try {
      List list = paramJobScheduler.getAllPendingJobs();
      list.getClass();
    } finally {
      paramJobScheduler = null;
      str = zj0.a;
      qp0.h().g(str, "getAllPendingJobs() is not reliable on this device.", (Throwable)paramJobScheduler);
    } 
    for (JobInfo jobInfo : paramJobScheduler) {
      if (componentName.equals(jobInfo.getService()))
        arrayList.add(jobInfo); 
    } 
    return arrayList;
  }
  
  public static n72 f(JobInfo paramJobInfo) {
    PersistableBundle persistableBundle = paramJobInfo.getExtras();
    if (persistableBundle != null)
      try {
        if (persistableBundle.containsKey("EXTRA_WORK_SPEC_ID")) {
          int i = persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
          return new n72(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), i);
        } 
      } catch (NullPointerException nullPointerException) {} 
    return null;
  }
  
  public final void a(String paramString) {
    ArrayList<Integer> arrayList;
    Context context = this.b;
    JobScheduler jobScheduler = this.c;
    ArrayList<Object> arrayList1 = d(context, jobScheduler);
    if (arrayList1 == null) {
      context = null;
    } else {
      arrayList = new ArrayList(2);
      int j = arrayList1.size();
      int i = 0;
      while (i < j) {
        JobInfo jobInfo = (JobInfo)arrayList1.get(i);
        int k = i + 1;
        jobInfo = jobInfo;
        n72 n72 = f(jobInfo);
        i = k;
        if (n72 != null) {
          i = k;
          if (paramString.equals(n72.a)) {
            arrayList.add(Integer.valueOf(jobInfo.getId()));
            i = k;
          } 
        } 
      } 
    } 
    if (arrayList != null && !arrayList.isEmpty()) {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        arrayList1 = (ArrayList<Object>)arrayList.get(b);
        b++;
        b(jobScheduler, ((Integer)arrayList1).intValue());
      } 
      ls1 ls1 = this.f.s();
      ls1.getClass();
      paramString.getClass();
      zo2.N(ls1.a, false, true, new ey(paramString, 4));
    } 
  }
  
  public final void c(y72... paramVarArgs) {
    ip ip1 = this.g;
    WorkDatabase workDatabase = this.f;
    dh0 dh0 = new dh0(workDatabase, 0);
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      y72 y721 = paramVarArgs[b];
      workDatabase.b();
      try {
        qp0 qp0;
        c82 c82 = workDatabase.v();
        String str1 = y721.a;
        y72 y722 = c82.b(str1);
        String str2 = h;
        if (y722 == null) {
          qp0 = qp0.h();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Skipping scheduling ");
          stringBuilder.append(str1);
          stringBuilder.append(" because it's no longer in the DB");
          qp0.k(str2, stringBuilder.toString());
          workDatabase.o();
        } else {
          qp0 qp01;
          if (((y72)qp0).b != o72.b) {
            qp01 = qp0.h();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("Skipping scheduling ");
            stringBuilder.append(str1);
            stringBuilder.append(" because it is no longer enqueued");
            qp01.k(str2, stringBuilder.toString());
            workDatabase.o();
          } else {
            int j;
            n72 n72 = qv.p((y72)qp01);
            int k = n72.b;
            String str = n72.a;
            ls1 ls1 = workDatabase.s();
            ls1.getClass();
            str.getClass();
            eh1 eh1 = ls1.a;
            ks1 ks1 = new ks1();
            this(str, k, 0);
            js1 js1 = (js1)zo2.N(eh1, true, false, ks1);
            if (js1 != null) {
              j = js1.c;
            } else {
              ip1.getClass();
              j = ip1.i;
              WorkDatabase workDatabase1 = dh0.a;
              ch0 ch0 = new ch0();
              this(dh0, j);
              Object object = workDatabase1.n(ch0);
              object.getClass();
              j = ((Number)object).intValue();
            } 
            if (js1 == null) {
              js1 = new js1();
              this(str, k, j);
              ls1 ls11 = workDatabase.s();
              ls11.getClass();
              eh1 eh11 = ls11.a;
              dy dy = new dy();
              this(4, ls11, js1);
              zo2.N(eh11, false, true, dy);
            } 
            g((y72)qp01, j);
            workDatabase.o();
          } 
        } 
        workDatabase.l();
      } finally {}
    } 
  }
  
  public final boolean e() {
    return true;
  }
  
  public final void g(y72 paramy72, int paramInt) {
    JobInfo jobInfo = this.e.a(paramy72, paramInt);
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder("Scheduling work ID ");
    String str1 = paramy72.a;
    stringBuilder.append(str1);
    stringBuilder.append("Job ID ");
    stringBuilder.append(paramInt);
    String str3 = stringBuilder.toString();
    String str2 = h;
    qp0.b(str2, str3);
    boolean bool = false;
    try {
      if (this.c.schedule(jobInfo) == 0) {
        qp0 = qp0.h();
        StringBuilder stringBuilder1 = new StringBuilder();
        this("Unable to schedule work ID ");
        stringBuilder1.append(str1);
        qp0.k(str2, stringBuilder1.toString());
        if (paramy72.q && paramy72.r == g51.b) {
          paramy72.q = false;
          stringBuilder1 = new StringBuilder();
          this("Scheduling a non-expedited job (work ID ");
          stringBuilder1.append(str1);
          stringBuilder1.append(")");
          str1 = stringBuilder1.toString();
          qp0.h().b(str2, str1);
          g(paramy72, paramInt);
          return;
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
    
    } finally {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ns1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */