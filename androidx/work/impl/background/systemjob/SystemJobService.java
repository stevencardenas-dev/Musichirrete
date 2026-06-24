package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import c4;
import f00;
import fp1;
import j01;
import java.util.Arrays;
import java.util.HashMap;
import k5;
import ma1;
import n72;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import q72;
import qp0;
import tp;
import x41;
import z50;
import zb0;

public class SystemJobService extends JobService implements z50 {
  public static final String g = qp0.j(CKYHNesT.XUFnPE);
  
  public q72 b;
  
  public final HashMap c = new HashMap<Object, Object>();
  
  public final c4 e = new c4(4);
  
  public j01 f;
  
  public static void a(String paramString) {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      return; 
    tp.f(x41.w("Cannot invoke ", paramString, " on a background thread"));
  }
  
  public static n72 b(JobParameters paramJobParameters) {
    try {
      PersistableBundle persistableBundle = paramJobParameters.getExtras();
      if (persistableBundle != null && persistableBundle.containsKey("EXTRA_WORK_SPEC_ID"))
        return new n72(persistableBundle.getString("EXTRA_WORK_SPEC_ID"), persistableBundle.getInt("EXTRA_WORK_SPEC_GENERATION")); 
    } catch (NullPointerException nullPointerException) {}
    return null;
  }
  
  public final void d(n72 paramn72, boolean paramBoolean) {
    a("onExecuted");
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramn72.a);
    stringBuilder.append(" executed on JobScheduler");
    String str = stringBuilder.toString();
    qp0.b(g, str);
    JobParameters jobParameters = (JobParameters)this.c.remove(paramn72);
    this.e.e(paramn72);
    if (jobParameters != null)
      jobFinished(jobParameters, paramBoolean); 
  }
  
  public final void onCreate() {
    super.onCreate();
    try {
      q72 q721 = q72.a(getApplicationContext());
      this.b = q721;
      ma1 ma1 = q721.f;
      j01 j011 = new j01();
      this(ma1, q721.d);
      this.f = j011;
      ma1.a(this);
      return;
    } catch (IllegalStateException illegalStateException) {
      if (Application.class.equals(getApplication().getClass())) {
        qp0.h().k(g, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        return;
      } 
      throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException);
    } 
  }
  
  public final void onDestroy() {
    super.onDestroy();
    q72 q721 = this.b;
    if (q721 != null) {
      null = q721.f;
      synchronized (null.k) {
        null.j.remove(this);
        return;
      } 
    } 
  }
  
  public final boolean onStartJob(JobParameters paramJobParameters) {
    StringBuilder stringBuilder1;
    qp0<n72, StringBuilder> qp0;
    a("onStartJob");
    q72 q721 = this.b;
    String str = g;
    if (q721 == null) {
      qp0.h().b(str, "WorkManager is not initialized; requesting retry.");
      jobFinished(paramJobParameters, true);
      return false;
    } 
    n72 n72 = b(paramJobParameters);
    if (n72 == null) {
      qp0.h().f(str, "WorkSpec id not found!");
      return false;
    } 
    HashMap hashMap = this.c;
    if (hashMap.containsKey(n72)) {
      qp0 = qp0.h();
      stringBuilder1 = new StringBuilder("Job is already being executed by SystemJobService: ");
      stringBuilder1.append(n72);
      qp0.b(str, stringBuilder1.toString());
      return false;
    } 
    qp0 qp01 = qp0.h();
    StringBuilder stringBuilder2 = new StringBuilder(IGBYXeDFmKYajx.GcuXGBMaGeAsRxU);
    stringBuilder2.append(n72);
    qp01.b(str, stringBuilder2.toString());
    qp0.put(n72, stringBuilder1);
    zb0 zb0 = new zb0(21);
    if (stringBuilder1.getTriggeredContentUris() != null)
      Arrays.asList(stringBuilder1.getTriggeredContentUris()); 
    if (stringBuilder1.getTriggeredContentAuthorities() != null)
      Arrays.asList(stringBuilder1.getTriggeredContentAuthorities()); 
    if (Build.VERSION.SDK_INT >= 28)
      k5.f((JobParameters)stringBuilder1); 
    this.f.C(this.e.g(n72), zb0);
    return true;
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters) {
    a("onStopJob");
    if (this.b == null) {
      qp0.h().b(g, "WorkManager is not initialized; requesting retry.");
      return true;
    } 
    n72 n72 = b(paramJobParameters);
    if (n72 == null) {
      qp0.h().f(g, "WorkSpec id not found!");
      return false;
    } 
    qp0 qp0 = qp0.h();
    String str2 = g;
    StringBuilder stringBuilder = new StringBuilder("onStopJob for ");
    stringBuilder.append(n72);
    qp0.b(str2, stringBuilder.toString());
    this.c.remove(n72);
    fp1 fp1 = this.e.e(n72);
    if (fp1 != null) {
      short s;
      if (Build.VERSION.SDK_INT >= 31) {
        s = f00.c(paramJobParameters);
      } else {
        s = -512;
      } 
      j01 j011 = this.f;
      j011.getClass();
      j011.D(fp1, s);
    } 
    null = this.b.f;
    String str1 = n72.a;
    synchronized (null.k) {
      boolean bool = null.i.contains(str1);
      return bool ^ true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\background\systemjob\SystemJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */