import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.insets.ProtectionLayout;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.android.widgets.SmartTextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class p01 implements j32, kf1, qo2 {
  public static int g;
  
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public Object f;
  
  public p01() {
    this.c = new HashMap<Object, Object>();
    this.e = new HashMap<Object, Object>();
    this.f = new HashMap<Object, Object>();
  }
  
  public p01(Context paramContext, PendingIntent paramPendingIntent) {
    this.f = new ArrayList();
    if (paramContext != null) {
      if (!TextUtils.isEmpty("JSTMUSIC2")) {
        MediaSession mediaSession;
        Looper looper;
        ComponentName componentName = d20.a(paramContext);
        if (componentName == null)
          Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context."); 
        PendingIntent pendingIntent = paramPendingIntent;
        if (componentName != null) {
          pendingIntent = paramPendingIntent;
          if (paramPendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(paramContext, 0, intent, 33554432);
          } 
        } 
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          mediaSession = wv0.d(paramContext);
        } else {
          mediaSession = new MediaSession(paramContext, "JSTMUSIC2");
        } 
        if (i >= 29) {
          this.c = new m01(mediaSession);
        } else if (i >= 28) {
          this.c = new m01(mediaSession);
        } else {
          this.c = new m01(mediaSession);
        } 
        if (Looper.myLooper() != null) {
          looper = Looper.myLooper();
        } else {
          looper = Looper.getMainLooper();
        } 
        Handler handler = new Handler(looper);
        l01 l01 = new l01(0);
        ((m01)this.c).b(l01, handler);
        ((m01)this.c).a.setMediaButtonReceiver(pendingIntent);
        this.e = new j01(paramContext, this);
        if (g == 0)
          g = (int)(TypedValue.applyDimension(1, 320.0F, paramContext.getResources().getDisplayMetrics()) + 0.5F); 
        return;
      } 
      l0.l("tag must not be null or empty");
      throw null;
    } 
    l0.l("context must not be null");
    throw null;
  }
  
  public p01(ProtectionLayout paramProtectionLayout, MaterialCardView paramMaterialCardView, LinearLayout paramLinearLayout, SmartTextView paramSmartTextView) {
    this.c = paramMaterialCardView;
    this.e = paramLinearLayout;
    this.f = paramSmartTextView;
  }
  
  public p01(SystemForegroundService paramSystemForegroundService) {
    this.c = new wm0((um0)paramSystemForegroundService);
    this.e = new Handler(Looper.getMainLooper());
  }
  
  public p01(CastDevice paramCastDevice, fu2 paramfu2) {
    n21.n("CastDevice parameter cannot be null", paramCastDevice);
    this.c = paramCastDevice;
    this.e = paramfu2;
  }
  
  public p01(ee0 paramee0, zv0 paramzv0) {
    this.f = paramee0;
    this.c = paramzv0;
  }
  
  public p01(fr paramfr) {
    this.f = new ArrayList();
    this.c = new Object();
    this.e = paramfr;
  }
  
  public p01(Runnable paramRunnable) {
    this.e = new CopyOnWriteArrayList();
    this.f = new HashMap<Object, Object>();
    this.c = paramRunnable;
  }
  
  public p01(String paramString) {
    j01 j01 = new j01(27, false);
    this.e = j01;
    this.f = j01;
    this.c = paramString;
  }
  
  public p01(km0 paramkm0, vx1 paramvx1, cy1 paramcy1) {
    this.c = paramkm0;
    this.e = paramvx1;
    this.f = paramcy1;
  }
  
  public p01(nf1 paramnf1) {
    this.f = paramnf1;
    this.e = new AtomicLong((qj.b.nextLong() & 0xFFFFL) * 10000L);
  }
  
  public p01(s21 params21) {
    RemoteInput.Builder builder;
    mf1 mf1;
    boolean bool1;
    this.f = new Bundle();
    this.e = params21;
    Context context = params21.a;
    ArrayList<Bundle> arrayList4 = params21.A;
    ArrayList arrayList = params21.c;
    ArrayList<o21> arrayList5 = params21.d;
    if (Build.VERSION.SDK_INT >= 26) {
      this.c = ii0.c(context, params21.x);
    } else {
      this.c = new Notification.Builder(context);
    } 
    Notification notification = params21.z;
    Notification.Builder builder3 = ((Notification.Builder)this.c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView);
    CharSequence charSequence = notification.tickerText;
    Icon icon2 = null;
    Notification.Builder builder2 = builder3.setTicker(charSequence, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
    int i = notification.flags;
    boolean bool2 = true;
    if ((i & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder2 = builder2.setOngoing(bool1);
    if ((notification.flags & 0x8) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder2 = builder2.setOnlyAlertOnce(bool1);
    if ((notification.flags & 0x10) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder3 = builder2.setAutoCancel(bool1).setDefaults(notification.defaults).setContentTitle(params21.e).setContentText(params21.f).setContentInfo(null).setContentIntent(params21.g).setDeleteIntent(notification.deleteIntent);
    PendingIntent pendingIntent = params21.h;
    if ((notification.flags & 0x80) != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    builder3.setFullScreenIntent(pendingIntent, bool1).setNumber(0).setProgress(params21.n, params21.o, params21.p);
    Notification.Builder builder1 = (Notification.Builder)this.c;
    IconCompat iconCompat = params21.i;
    if (iconCompat == null) {
      context = null;
    } else {
      icon1 = iconCompat.f(context);
    } 
    builder1.setLargeIcon(icon1);
    ((Notification.Builder)this.c).setSubText(params21.m).setUsesChronometer(false).setPriority(params21.j);
    ArrayList<ArrayList> arrayList3 = params21.b;
    int j = arrayList3.size();
    i = 0;
    Icon icon1 = icon2;
    ArrayList<ArrayList> arrayList2 = arrayList3;
    while (i < j) {
      Icon icon;
      Bundle bundle1;
      arrayList3 = arrayList2.get(i);
      int k = i + 1;
      o21 o21 = (o21)arrayList3;
      if (o21.b == null) {
        i = o21.f;
        if (i != 0)
          o21.b = IconCompat.b((Resources)icon1, "", i); 
      } 
      IconCompat iconCompat1 = o21.b;
      bool1 = o21.d;
      Bundle bundle2 = o21.a;
      if (iconCompat1 != null) {
        icon = iconCompat1.f((Context)icon1);
      } else {
        icon = icon1;
      } 
      Notification.Action.Builder builder4 = new Notification.Action.Builder(icon, o21.g, o21.h);
      mf1[] arrayOfMf1 = o21.c;
      if (arrayOfMf1 != null) {
        int m = arrayOfMf1.length;
        RemoteInput[] arrayOfRemoteInput = new RemoteInput[m];
        if (arrayOfMf1.length <= 0) {
          for (i = 0; i < m; i++)
            builder4.addRemoteInput(arrayOfRemoteInput[i]); 
        } else {
          mf1 = arrayOfMf1[0];
          builder = new RemoteInput.Builder();
          throw icon1;
        } 
      } 
      if (bundle2 != null) {
        bundle1 = new Bundle(bundle2);
      } else {
        bundle1 = new Bundle();
      } 
      bundle1.putBoolean("android.support.allowGeneratedReplies", bool1);
      builder4.setAllowGeneratedReplies(bool1);
      bundle1.putInt("android.support.action.semanticAction", 0);
      i = Build.VERSION.SDK_INT;
      if (i >= 28)
        k5.u(builder4); 
      if (i >= 29)
        p8.h(builder4); 
      if (i >= 31)
        f00.e(builder4); 
      bundle1.putBoolean("android.support.action.showsUserInterface", o21.e);
      builder4.addExtras(bundle1);
      ((Notification.Builder)this.c).addAction(builder4.build());
      i = k;
    } 
    Bundle bundle = ((s21)builder).s;
    if (bundle != null)
      ((Bundle)this.f).putAll(bundle); 
    ((Notification.Builder)this.c).setShowWhen(((s21)builder).k);
    ((Notification.Builder)this.c).setLocalOnly(((s21)builder).q);
    ((Notification.Builder)this.c).setGroup((String)icon1);
    ((Notification.Builder)this.c).setSortKey((String)icon1);
    ((Notification.Builder)this.c).setGroupSummary(false);
    ((Notification.Builder)this.c).setCategory(((s21)builder).r);
    ((Notification.Builder)this.c).setColor(((s21)builder).t);
    ((Notification.Builder)this.c).setVisibility(((s21)builder).u);
    ((Notification.Builder)this.c).setPublicVersion(null);
    ((Notification.Builder)this.c).setSound(notification.sound, notification.audioAttributes);
    ArrayList<Bundle> arrayList1 = arrayList4;
    if (Build.VERSION.SDK_INT < 28) {
      if (arrayList == null) {
        arrayList1 = null;
      } else {
        arrayList1 = new ArrayList(arrayList.size());
        Iterator iterator = arrayList.iterator();
        if (iterator.hasNext())
          throw x41.g(iterator); 
      } 
      if (arrayList1 == null) {
        arrayList1 = arrayList4;
      } else if (arrayList4 != null) {
        i = arrayList1.size();
        d9 d9 = new d9(arrayList4.size() + i);
        d9.addAll(arrayList1);
        d9.addAll(arrayList4);
        arrayList1 = new ArrayList(d9);
      } 
    } 
    if (arrayList1 != null && !arrayList1.isEmpty()) {
      int k = arrayList1.size();
      i = 0;
      while (i < k) {
        bundle = arrayList1.get(i);
        i++;
        String str = (String)bundle;
        ((Notification.Builder)this.c).addPerson(str);
      } 
    } 
    if (arrayList5.size() > 0) {
      if (((s21)builder).s == null)
        ((s21)builder).s = new Bundle(); 
      bundle = ((s21)builder).s.getBundle("android.car.EXTENSIONS");
      Bundle bundle1 = bundle;
      if (bundle == null)
        bundle1 = new Bundle(); 
      Bundle bundle2 = new Bundle(bundle1);
      Bundle bundle3 = new Bundle();
      for (i = 0; i < arrayList5.size(); i++) {
        boolean bool;
        Bundle bundle4;
        Bundle[] arrayOfBundle;
        String str = Integer.toString(i);
        o21 o21 = arrayList5.get(i);
        Bundle bundle5 = new Bundle();
        if (o21.b == null) {
          bool = o21.f;
          if (bool != 0)
            o21.b = IconCompat.b(null, "", bool); 
        } 
        IconCompat iconCompat1 = o21.b;
        Bundle bundle6 = o21.a;
        if (iconCompat1 != null) {
          bool = iconCompat1.c();
        } else {
          bool = false;
        } 
        bundle5.putInt("icon", bool);
        bundle5.putCharSequence("title", o21.g);
        bundle5.putParcelable("actionIntent", (Parcelable)o21.h);
        if (bundle6 != null) {
          bundle4 = new Bundle(bundle6);
        } else {
          bundle4 = new Bundle();
        } 
        bundle4.putBoolean("android.support.allowGeneratedReplies", o21.d);
        bundle5.putBundle("extras", bundle4);
        mf1[] arrayOfMf1 = o21.c;
        if (arrayOfMf1 == null) {
          bundle4 = null;
        } else {
          arrayOfBundle = new Bundle[arrayOfMf1.length];
          if (arrayOfMf1.length > 0) {
            mf1 = arrayOfMf1[0];
            new Bundle();
            throw null;
          } 
        } 
        bundle5.putParcelableArray("remoteInputs", (Parcelable[])arrayOfBundle);
        bundle5.putBoolean("showsUserInterface", o21.e);
        bundle5.putInt("semanticAction", 0);
        bundle3.putBundle(str, bundle5);
      } 
      bundle1.putBundle("invisible_actions", bundle3);
      bundle2.putBundle("invisible_actions", bundle3);
      if (((s21)mf1).s == null)
        ((s21)mf1).s = new Bundle(); 
      ((s21)mf1).s.putBundle("android.car.EXTENSIONS", bundle1);
      ((Bundle)this.f).putBundle("android.car.EXTENSIONS", bundle2);
    } 
    ((Notification.Builder)this.c).setExtras(((s21)mf1).s);
    ((Notification.Builder)this.c).setRemoteInputHistory(null);
    RemoteViews remoteViews = ((s21)mf1).v;
    if (remoteViews != null)
      ((Notification.Builder)this.c).setCustomContentView(remoteViews); 
    remoteViews = ((s21)mf1).w;
    if (remoteViews != null)
      ((Notification.Builder)this.c).setCustomBigContentView(remoteViews); 
    i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      ii0.p((Notification.Builder)this.c);
      ii0.v((Notification.Builder)this.c);
      ii0.w((Notification.Builder)this.c);
      ii0.x((Notification.Builder)this.c);
      ii0.r((Notification.Builder)this.c);
      if (!TextUtils.isEmpty(((s21)mf1).x))
        ((Notification.Builder)this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null); 
    } 
    if (i >= 28) {
      Iterator iterator = arrayList.iterator();
      if (iterator.hasNext())
        throw x41.g(iterator); 
    } 
    if (i >= 29) {
      p8.f((Notification.Builder)this.c, ((s21)mf1).y);
      p8.g((Notification.Builder)this.c);
    } 
    if (i >= 36)
      q0.f((Notification.Builder)this.c); 
  }
  
  public static void d(Bundle paramBundle) {
    if (paramBundle != null)
      paramBundle.setClassLoader(p01.class.getClassLoader()); 
  }
  
  public g32 a(Class paramClass) {
    return new by1((km0)this.c, (vx1)this.e, (cy1)this.f);
  }
  
  public void accept(Object paramObject1, Object paramObject2) {
    String str1;
    String str2;
    nv2 nv2;
    qd2 qd2;
    Parcel parcel;
    n5 n5;
    int i = this.b;
    boolean bool = false;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        nv2 = (nv2)paramObject1;
        paramObject1 = this.c;
        str2 = (String)this.e;
        str1 = (String)this.f;
        n21.q("Not connected to device", paramObject1.i());
        qd2 = (qd2)nv2.i();
        n5 = g92.g0();
        parcel = qd2.o();
        parcel.writeString(str2);
        parcel.writeString(str1);
        i = mh2.a;
        parcel.writeInt(0);
        mh2.b(parcel, n5);
        qd2.p0(parcel, 14);
        object = ((pg2)paramObject1).r;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (((pg2)paramObject1).o != null)
            paramObject1.j(2477); 
        } finally {}
        ((pg2)paramObject1).o = (nt1)paramObject2;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 15:
        break;
    } 
    pg2 pg2 = (pg2)this.c;
    nf1 nf1 = (nf1)this.e;
    Object object = this.f;
    paramObject1 = paramObject1;
    if (pg2.F != 1)
      bool = true; 
    n21.q("Not active connection", bool);
    if (nf1 != null) {
      paramObject1 = paramObject1.i();
      n5 n51 = g92.g0();
      Parcel parcel1 = paramObject1.o();
      parcel1.writeString((String)object);
      mh2.b(parcel1, n51);
      paramObject1.p0(parcel1, 12);
    } 
    paramObject2.b(null);
  }
  
  public void b() {
    zv0 zv0 = (zv0)this.c;
    if (zv0 != null) {
      int i = ((ee0)this.f).o.d;
      tv0 tv0 = (tv0)zv0.c;
      tv0.getClass();
      AudioAttributes.Builder builder = new AudioAttributes.Builder();
      builder.setLegacyStreamType(i);
      tv0.a.setPlaybackToLocal(builder.build());
      this.e = null;
    } 
  }
  
  public void c(xl paramxl, ByteArrayOutputStream paramByteArrayOutputStream) {
    HashMap hashMap = (HashMap)this.c;
    bb1 bb1 = new bb1(paramByteArrayOutputStream, hashMap, (HashMap)this.e, (f31)this.f);
    f31 f31 = (f31)hashMap.get(xl.class);
    if (f31 != null) {
      f31.a(paramxl, bb1);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("No encoder for ");
    stringBuilder.append(xl.class);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public j01 e() {
    return (j01)this.e;
  }
  
  public MediaSession f() {
    return ((m01)this.c).a;
  }
  
  public MediaSessionCompat.Token h() {
    return ((m01)this.c).b;
  }
  
  public cn i(String paramString, j40 paramj40, dw1 paramdw1) {
    Set set = (Set)this.c;
    if (set.contains(paramj40))
      return new cn(this.e, paramString, paramj40, paramdw1, this.f); 
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramj40, set }));
  }
  
  public boolean j(int paramInt, hq paramhq, er paramer) {
    boolean bool1;
    re re = (re)this.c;
    int[] arrayOfInt2 = paramer.p0;
    int[] arrayOfInt1 = paramer.t;
    re.a = arrayOfInt2[0];
    boolean bool2 = true;
    re.b = arrayOfInt2[1];
    re.c = paramer.o();
    re.d = paramer.i();
    re.i = false;
    re.j = paramInt;
    if (re.a == 3) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (re.b == 3) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramInt != 0 && paramer.W > 0.0F) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (bool1 && paramer.W > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramInt != 0 && arrayOfInt1[0] == 4)
      re.a = 1; 
    if (bool1 && arrayOfInt1[1] == 4)
      re.b = 1; 
    paramhq.b(paramer, re);
    paramer.K(re.e);
    paramer.H(re.f);
    paramer.E = re.h;
    paramInt = re.g;
    paramer.a0 = paramInt;
    if (paramInt <= 0)
      bool2 = false; 
    paramer.E = bool2;
    re.j = 0;
    return re.i;
  }
  
  public void k(om0 paramom0) {
    zk1 zk12 = (zk1)this.f;
    if (zk12 != null)
      zk12.run(); 
    zk1 zk11 = new zk1((wm0)this.c, paramom0);
    this.f = zk11;
    ((Handler)this.e).postAtFrontOfQueue(zk11);
  }
  
  public void m(ib paramib, int paramInt, boolean paramBoolean) {
    PersistableBundle persistableBundle;
    gb gb = (gb)this.f;
    Context context = (Context)this.c;
    ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
    JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
    Adler32 adler32 = new Adler32();
    adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
    String str = paramib.a;
    adler32.update(str.getBytes(Charset.forName("UTF-8")));
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    fa1 fa1 = paramib.c;
    adler32.update(byteBuffer.putInt(ia1.a(fa1)).array());
    byte[] arrayOfByte = paramib.b;
    if (arrayOfByte != null)
      adler32.update(arrayOfByte); 
    int i = (int)adler32.getValue();
    if (!paramBoolean)
      for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
        int j = jobInfo.getExtras().getInt("attemptNumber");
        if (jobInfo.getId() == i) {
          if (j >= paramInt) {
            ui0.n("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramib);
            return;
          } 
          break;
        } 
      }  
    Cursor cursor = ((zh1)this.e).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { str, String.valueOf(ia1.a(fa1)) });
    try {
      Long long_;
      if (cursor.moveToNext()) {
        long_ = Long.valueOf(cursor.getLong(0));
      } else {
        long_ = Long.valueOf(0L);
      } 
      cursor.close();
      long l = long_.longValue();
      JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
      builder.setMinimumLatency(gb.a(fa1, l, paramInt));
      Set set = ((hb)gb.b.get(fa1)).c;
      if (set.contains(bj1.b)) {
        builder.setRequiredNetworkType(2);
      } else {
        builder.setRequiredNetworkType(1);
      } 
      if (set.contains(bj1.e))
        builder.setRequiresCharging(true); 
      if (set.contains(bj1.c))
        builder.setRequiresDeviceIdle(true); 
      persistableBundle = new PersistableBundle();
      persistableBundle.putInt("attemptNumber", paramInt);
      persistableBundle.putString("backendName", str);
      persistableBundle.putInt(hbrAVtEa.uMocg, ia1.a(fa1));
      if (arrayOfByte != null)
        persistableBundle.putString(VDgS.HbhhsGLNunOU, Base64.encodeToString(arrayOfByte, 0)); 
      builder.setExtras(persistableBundle);
      l = gb.a(fa1, l, paramInt);
      String str1 = ui0.D("JobInfoScheduler");
      if (Log.isLoggable(str1, 3))
        Log.d(str1, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramib, Integer.valueOf(i), Long.valueOf(l), long_, Integer.valueOf(paramInt) })); 
      return;
    } finally {
      persistableBundle.close();
    } 
  }
  
  public void n(xo2 paramxo2, File paramFile, boolean paramBoolean) {
    ((HashSet<File>)this.c).add(paramFile);
    if (!paramBoolean) {
      FileOutputStream fileOutputStream;
      qf2 qf2 = (qf2)this.e;
      String str1 = qf2.b;
      String str2 = paramxo2.a;
      ZipEntry zipEntry = paramxo2.b;
      String str4 = qf2.a.getAbsolutePath();
      String str3 = zipEntry.getName();
      String str5 = paramFile.getAbsolutePath();
      StringBuilder stringBuilder = new StringBuilder("NativeLibraryExtractor: split '");
      stringBuilder.append(str1);
      stringBuilder.append("' has native library '");
      stringBuilder.append(str2);
      stringBuilder.append("' that does not exist; extracting from '");
      x41.v(stringBuilder, str4, "!", str3, "' to '");
      stringBuilder.append(str5);
      stringBuilder.append("'");
      Log.i("SplitCompat", stringBuilder.toString());
      ZipFile zipFile = (ZipFile)this.f;
      byte[] arrayOfByte = new byte[4096];
      if (paramFile.exists())
        paramFile.delete(); 
      InputStream inputStream = zipFile.getInputStream(zipEntry);
      try {
        fileOutputStream = new FileOutputStream();
        this(paramFile);
        try {
          paramFile.setWritable(false, true);
          paramFile.setWritable(false, false);
          while (true) {
            int i = inputStream.read(arrayOfByte);
            if (i > 0) {
              fileOutputStream.write(arrayOfByte, 0, i);
              continue;
            } 
            fileOutputStream.close();
            inputStream.close();
            return;
          } 
        } finally {}
      } finally {}
      try {
        fileOutputStream.close();
      } finally {
        arrayOfByte = null;
      } 
    } 
  }
  
  public void o(MediaMetadataCompat paramMediaMetadataCompat) {
    MediaMetadata mediaMetadata;
    m01 m01 = (m01)this.c;
    m01.g = paramMediaMetadataCompat;
    MediaSession mediaSession = m01.a;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      mediaMetadata = paramMediaMetadataCompat.i();
    } 
    mediaSession.setMetadata(mediaMetadata);
  }
  
  public void p(PlaybackStateCompat paramPlaybackStateCompat) {
    m01 m01 = (m01)this.c;
    m01.e = paramPlaybackStateCompat;
    RemoteCallbackList remoteCallbackList = m01.d;
    int i = remoteCallbackList.beginBroadcast() - 1;
    while (true) {
      PlaybackState playbackState;
      if (i >= 0) {
        jg0 jg0 = (jg0)remoteCallbackList.getBroadcastItem(i);
        try {
          jg0.i0(paramPlaybackStateCompat);
        } catch (RemoteException remoteException) {}
        i--;
        continue;
      } 
      remoteCallbackList.finishBroadcast();
      MediaSession mediaSession = m01.a;
      if (paramPlaybackStateCompat == null) {
        paramPlaybackStateCompat = null;
      } else {
        playbackState = paramPlaybackStateCompat.f();
      } 
      mediaSession.setPlaybackState(playbackState);
      return;
    } 
  }
  
  public void q() {
    m01 m01 = (m01)this.c;
    m01.getClass();
    AudioAttributes.Builder builder = new AudioAttributes.Builder();
    builder.setLegacyStreamType(3).setUsage(1).setContentType(2);
    m01.a.setPlaybackToLocal(builder.build());
  }
  
  public void r(int paramInt) {
    m01 m01 = (m01)this.c;
    RemoteCallbackList remoteCallbackList = m01.d;
    if (m01.h != paramInt) {
      m01.h = paramInt;
      int i = remoteCallbackList.beginBroadcast() - 1;
      while (true) {
        if (i >= 0) {
          jg0 jg0 = (jg0)remoteCallbackList.getBroadcastItem(i);
          try {
            jg0.i(paramInt);
          } catch (RemoteException remoteException) {}
          i--;
          continue;
        } 
        remoteCallbackList.finishBroadcast();
        return;
      } 
    } 
  }
  
  public void s(int paramInt) {
    m01 m01 = (m01)this.c;
    RemoteCallbackList remoteCallbackList = m01.d;
    if (m01.i != paramInt) {
      m01.i = paramInt;
      int i = remoteCallbackList.beginBroadcast() - 1;
      while (true) {
        if (i >= 0) {
          jg0 jg0 = (jg0)remoteCallbackList.getBroadcastItem(i);
          try {
            jg0.C(paramInt);
          } catch (RemoteException remoteException) {}
          i--;
          continue;
        } 
        remoteCallbackList.finishBroadcast();
        return;
      } 
    } 
  }
  
  public void t(fr paramfr, int paramInt1, int paramInt2, int paramInt3) {
    paramfr.getClass();
    int j = paramfr.b0;
    int i = paramfr.c0;
    paramfr.b0 = 0;
    paramfr.c0 = 0;
    paramfr.K(paramInt2);
    paramfr.H(paramInt3);
    if (j < 0) {
      paramfr.b0 = 0;
    } else {
      paramfr.b0 = j;
    } 
    if (i < 0) {
      paramfr.c0 = 0;
    } else {
      paramfr.c0 = i;
    } 
    paramfr = (fr)this.e;
    paramfr.t0 = paramInt1;
    paramfr.Q();
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 18:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append((String)this.c);
    stringBuilder.append('{');
    j01 j01 = (j01)((j01)this.e).e;
    for (String str = ""; j01 != null; str = ", ") {
      Object object = j01.c;
      stringBuilder.append(str);
      if (object != null && object.getClass().isArray()) {
        str = Arrays.deepToString(new Object[] { object });
        stringBuilder.append(str, 1, str.length() - 1);
      } else {
        stringBuilder.append(object);
      } 
      j01 = (j01)j01.e;
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void u(fr paramfr) {
    ArrayList<er> arrayList = (ArrayList)this.f;
    arrayList.clear();
    int i = paramfr.q0.size();
    for (byte b = 0; b < i; b++) {
      er er = paramfr.q0.get(b);
      int[] arrayOfInt = er.p0;
      if (arrayOfInt[0] == 3 || arrayOfInt[1] == 3)
        arrayList.add(er); 
    } 
    paramfr.s0.b = true;
  }
  
  public void v(int paramInt, String paramString1, String paramString2) {
    ((HashMap<String, String>)this.c).put(paramString1, paramString2);
    ((HashMap<String, String>)this.e).put(paramString2, paramString1);
    ((HashMap<String, Integer>)this.f).put(paramString1, Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */