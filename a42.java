import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a42 implements kf1, rf2, ye2, c41, cl1, qo2, ul2, r41, bw2 {
  public final int b;
  
  public Object c;
  
  public a42(int paramInt) {}
  
  public a42(ik2 paramik2) {
    Charset charset = il2.a;
    this.c = paramik2;
    paramik2.a = this;
  }
  
  public a42(ByteBuffer paramByteBuffer) {
    this.c = paramByteBuffer.slice();
  }
  
  public a42(jv2 paramjv2) {
    Charset charset = vv2.a;
    this.c = paramjv2;
    paramjv2.a = this;
  }
  
  public a42(tk paramtk, po0 parampo0) {
    this.c = paramtk;
  }
  
  public static final int u(AssetManager paramAssetManager, File paramFile) {
    String str = paramFile.getPath();
    int i = ((Integer)n21.a0(paramAssetManager, DJqHMztxflt.FWJufVMaRk, Integer.class, String.class, str)).intValue();
    StringBuilder stringBuilder = new StringBuilder("addAssetPath completed with ");
    stringBuilder.append(i);
    Log.d("SplitCompat", stringBuilder.toString());
    return i;
  }
  
  public long a() {
    return ((ByteBuffer)this.c).capacity();
  }
  
  public void accept(Object paramObject1, Object paramObject2) {
    pb2 pb2;
    Parcel parcel1;
    n5 n51;
    qd2 qd21;
    nv2 nv2;
    n5 n52;
    Parcel parcel2;
    qd2 qd22;
    switch (this.b) {
      default:
        pb2 = (pb2)this.c;
        paramObject2 = paramObject2;
        paramObject1 = paramObject1;
        paramObject2 = new vk2(pb2, (nt1)paramObject2);
        paramObject1 = paramObject1.i();
        parcel1 = paramObject1.o();
        mh2.c(parcel1, (IInterface)paramObject2);
        paramObject1.o0(parcel1, 2);
        return;
      case 12:
        paramObject2 = paramObject2;
        nv2 = (nv2)paramObject1;
        qd22 = (qd2)nv2.i();
        n51 = g92.g0();
        paramObject1 = ((pg2)this.c).k;
        parcel2 = qd22.o();
        mh2.c(parcel2, (IInterface)paramObject1);
        mh2.b(parcel2, n51);
        qd22.p0(parcel2, 18);
        qd21 = (qd2)nv2.i();
        n52 = g92.g0();
        paramObject1 = qd21.o();
        mh2.b((Parcel)paramObject1, n52);
        qd21.p0((Parcel)paramObject1, 17);
        paramObject2.b(null);
        return;
      case 7:
        break;
    } 
    paramObject2 = paramObject2;
    mb2 mb2 = (mb2)((qb2)paramObject1).i();
    rt1 rt1 = (rt1)this.c;
    paramObject1 = Parcel.obtain();
    paramObject1.writeInterfaceToken(mb2.g);
    int i = ya2.a;
    if (rt1 == null) {
      paramObject1.writeInt(0);
    } else {
      paramObject1.writeInt(1);
      rt1.writeToParcel((Parcel)paramObject1, 0);
    } 
    try {
      mb2.f.transact(1, (Parcel)paramObject1, null, 1);
      paramObject1.recycle();
      return;
    } finally {
      paramObject1.recycle();
    } 
  }
  
  public dm2 b(Class paramClass) {
    for (byte b = 0; b < 2; b++) {
      ul2 ul21 = ((ul2[])this.c)[b];
      if (ul21.c(paramClass))
        return ul21.b(paramClass); 
    } 
    String str = paramClass.getName();
    tp.j(hbrAVtEa.qtAYxJWEMfCyn.concat(str));
    return null;
  }
  
  public boolean b(Class paramClass) {
    for (byte b = 0; b < 2; b++) {
      if (((bw2[])this.c)[b].b(paramClass))
        return true; 
    } 
    return false;
  }
  
  public iw2 c(Class paramClass) {
    for (byte b = 0; b < 2; b++) {
      bw2 bw21 = ((bw2[])this.c)[b];
      if (bw21.b(paramClass))
        return bw21.c(paramClass); 
    } 
    tp.j("No factory is available for message type: ".concat(paramClass.getName()));
    return null;
  }
  
  public boolean c(Class paramClass) {
    for (byte b = 0; b < 2; b++) {
      if (((ul2[])this.c)[b].c(paramClass))
        return true; 
    } 
    return false;
  }
  
  public void f(String paramString, long paramLong1, int paramInt, Object paramObject, long paramLong2, long paramLong3) {
    cg2 cg2 = (cg2)this.c;
    try {
      paramObject = new kf2();
      Status status = new Status();
      try {
        this(paramInt, null, null, null);
        super(status);
        cg2.e((sg1)paramObject);
      } catch (IllegalStateException null) {}
    } catch (IllegalStateException illegalStateException) {}
    rp0 rp0 = nf1.j;
    Log.e(rp0.a, rp0.c("Result already set when calling onRequestCompleted", new Object[0]), illegalStateException);
  }
  
  public void g(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt) {
    ByteBuffer byteBuffer;
    MessageDigest messageDigest;
    synchronized ((ByteBuffer)this.c) {
      ByteBuffer byteBuffer1 = (ByteBuffer)this.c;
      int i = (int)paramLong;
      byteBuffer1.position(i);
      ((ByteBuffer)this.c).limit(i + paramInt);
      byteBuffer1 = ((ByteBuffer)this.c).slice();
      i = paramArrayOfMessageDigest.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        messageDigest = paramArrayOfMessageDigest[paramInt];
        byteBuffer1.position(0);
        messageDigest.update(byteBuffer1);
      } 
      return;
    } 
  }
  
  public void i(Object paramObject) {
    kj kj = (kj)this.c;
    Bundle bundle = (Bundle)paramObject;
    if (hn2.k) {
      byte b1;
      Context context = kj.a;
      pb2 pb2 = kj.f;
      hn2 hn2 = new hn2(context, pb2, kj.c, kj.i, kj.g);
      if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
        b1 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
      } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      boolean bool2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
      boolean bool1 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
      hn2.k = bool1;
      byte b2 = b1;
      if (!b1)
        if (bool2 || bool1) {
          b2 = 0;
        } else {
          return;
        }  
      hn2.h = new ki2(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
      paramObject = context.getPackageName();
      Locale locale = Locale.ROOT;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append((String)paramObject);
      stringBuilder.append(".client_cast_analytics_data");
      String str = stringBuilder.toString();
      if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0L) {
        b1 = 1;
      } else {
        b1 = 2;
      } 
      hn2.i = b1;
      vw1.b(context);
      hn2.g = vw1.a().c(sh.e).i("CAST_SENDER_SDK", new j40("proto"), eg2.c);
      if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"))
        hn2.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")); 
      SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0);
      if (b2 != 0) {
        ah ah = ah.b();
        ah.d = new en2(pb2, new String[] { "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON" }, 1);
        ah.e = new u70[] { g92.k };
        ah.c = false;
        ah.b = 8426;
        pb2.c(0, ah.a()).c(new oz0(hn2, (String)paramObject, b2, sharedPreferences));
      } 
      if (bool2) {
        n21.m(sharedPreferences);
        rp0 rp0 = zq2.i;
        /* monitor enter TypeReferenceDotClassExpression{ObjectType{zq2}} */
        try {
          if (zq2.k == null) {
            zq2 zq21 = new zq2();
            this(sharedPreferences, hn2, (String)paramObject);
            zq2.k = zq21;
          } 
        } finally {}
        zq2 zq2 = zq2.k;
        /* monitor exit TypeReferenceDotClassExpression{ObjectType{zq2}} */
        String str2 = zq2.c;
        paramObject = zq2.b;
        HashSet<String> hashSet = zq2.f;
        str3 = paramObject.getString("feature_usage_sdk_version", null);
        String str4 = paramObject.getString("feature_usage_package_name", null);
        hashSet.clear();
        HashSet hashSet1 = zq2.g;
        hashSet1.clear();
        zq2.h = 0L;
        str = zq2.j;
        if (!str.equals(str3) || !str2.equals(str4)) {
          hashSet = new HashSet();
          for (String str1 : paramObject.getAll().keySet()) {
            if (str1.startsWith("feature_usage_timestamp_"))
              hashSet.add(str1); 
          } 
          hashSet.add("feature_usage_last_report_time");
          zq2.b(hashSet);
          paramObject.edit().putString("feature_usage_sdk_version", str).putString("feature_usage_package_name", str2).apply();
        } else {
          zq2.h = paramObject.getLong("feature_usage_last_report_time", 0L);
          long l = System.currentTimeMillis();
          HashSet<String> hashSet2 = new HashSet();
          for (String str3 : paramObject.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
              wp2 wp2;
              long l1 = paramObject.getLong(str3, 0L);
              if (l1 != 0L && l - l1 > 1209600000L) {
                hashSet2.add(str3);
                continue;
              } 
              if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                wp2 = zq2.c(str3.substring(41));
                if (wp2 != null) {
                  str1.add(wp2);
                  hashSet.add(wp2);
                } 
                continue;
              } 
              if (wp2.startsWith("feature_usage_timestamp_detected_feature_")) {
                wp2 = zq2.c(wp2.substring(41));
                if (wp2 != null)
                  hashSet.add(wp2); 
              } 
            } 
          } 
          zq2.b(hashSet2);
          n21.m(zq2.e);
          n21.m(zq2.d);
          zq2.e.post(zq2.d);
        } 
        zq2.a(wp2.i);
      } 
      /* monitor enter TypeReferenceDotClassExpression{ObjectType{vs2}} */
      if (hn2.k) {
        try {
          if (vs2.b == null) {
            paramObject = new vs2();
            this();
            vs2.b = (vs2)paramObject;
            /* monitor exit TypeReferenceDotClassExpression{ObjectType{vs2}} */
            return;
          } 
        } finally {}
        /* monitor exit TypeReferenceDotClassExpression{ObjectType{vs2}} */
        return;
      } 
    } 
  }
  
  public void k(al1 paramal1, boolean paramBoolean) {
    rp0 rp0;
    fp2 fp2;
    oj oj2;
    hn2 hn2;
    sp2 sp2;
    nq2 nq2;
    op2 op2;
    hq2 hq2;
    switch (this.b) {
      default:
        oj2 = (oj)paramal1;
        rp0 = fp2.i;
        fp2.i.b("onSessionResumed with wasSuspended = %b", new Object[] { Boolean.valueOf(paramBoolean) });
        fp2 = (fp2)this.c;
        fp2.h = oj2;
        fp2.e();
        n21.m(fp2.g);
        sp2 = fp2.c;
        op2 = fp2.g;
        hn2 = fp2.a;
        nq2 = sp2.b(op2);
        hq2 = iq2.m(nq2.c());
        hq2.a();
        ((iq2)hq2.c).p(paramBoolean);
        nq2.a();
        ((oq2)nq2.c).v((iq2)hq2.b());
        hn2.a((oq2)nq2.b(), 227);
        fp2.a();
        fp2.c();
        return;
      case 15:
        break;
    } 
    oj oj1 = (oj)fp2;
  }
  
  public void l(al1 paramal1, String paramString) {
    fp2 fp2;
    sp2 sp2;
    oj oj2;
    op2 op2;
    switch (this.b) {
      default:
        oj2 = (oj)paramal1;
        fp2.i.b("onSessionStarted with sessionId = %s", new Object[] { paramString });
        fp2 = (fp2)this.c;
        fp2.h = oj2;
        fp2.e();
        op2 = fp2.g;
        op2.f = paramString;
        sp2 = fp2.c;
        fp2.a.a((oq2)sp2.b(op2).b(), 222);
        fp2.a();
        fp2.c();
        return;
      case 15:
        break;
    } 
    oj oj1 = (oj)fp2;
    vh2 vh2 = (vh2)this.c;
    vh2.getClass();
    vh2.g.b("onSessionStarted with transferType = %d", new Object[] { Integer.valueOf(0) });
    if (vh2.e)
      boolean bool = vh2.a.s; 
    vh2.a();
  }
  
  public void m(al1 paramal1) {
    fp2 fp2;
    hn2 hn2;
    rp0 rp0;
    op2 op2;
    oj oj2;
    sp2 sp2;
    nq2 nq2;
    switch (this.b) {
      default:
        oj2 = (oj)paramal1;
        rp0 = fp2.i;
        rp0.b("onSessionStarting", new Object[0]);
        fp2 = (fp2)this.c;
        fp2.h = oj2;
        if (fp2.g != null)
          Log.w(rp0.a, rp0.c("Start a session while there's already an active session. Create a new one.", new Object[0])); 
        fp2.d();
        op2 = fp2.g;
        sp2 = fp2.c;
        hn2 = fp2.a;
        nq2 = sp2.b(op2);
        if (op2.p == 1) {
          hq2 hq2 = iq2.m(nq2.c());
          hq2.a();
          ((iq2)hq2.c).r(17);
          nq2.d((iq2)hq2.b());
        } 
        hn2.a((oq2)nq2.b(), 221);
        return;
      case 15:
        break;
    } 
    oj oj1 = (oj)hn2;
  }
  
  public void n(xo2 paramxo2, File paramFile, boolean paramBoolean) {
    n2 n2 = (n2)this.c;
    ((HashSet<File>)n2.e).add(paramFile);
    if (!paramBoolean)
      ((AtomicBoolean)n2.f).set(false); 
  }
  
  public void o(String paramString, long paramLong1, long paramLong2, long paramLong3) {
    cg2 cg2 = (cg2)this.c;
    try {
      Status status = new Status();
      this(2103, null, null, null);
      kf2 kf2 = new kf2();
      this(cg2, status);
      cg2.e(kf2);
    } catch (IllegalStateException illegalStateException) {
      rp0 rp0 = nf1.j;
      Log.e(rp0.a, rp0.c("Result already set when calling onRequestReplaced", new Object[0]), illegalStateException);
    } 
    Iterator<zk> iterator = cg2.n.h.iterator();
    while (iterator.hasNext())
      ((zk)iterator.next()).e(paramString, paramLong1, 2103, paramLong2, paramLong3); 
  }
  
  public void p(al1 paramal1, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 24, 15 -> 771
    //   24: aload_1
    //   25: checkcast oj
    //   28: astore_1
    //   29: getstatic fp2.i : Lrp0;
    //   32: astore #6
    //   34: aload #6
    //   36: ldc_w 'onSessionResuming with sessionId = %s'
    //   39: iconst_1
    //   40: anewarray java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: aload_2
    //   46: aastore
    //   47: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aload_0
    //   51: getfield c : Ljava/lang/Object;
    //   54: checkcast fp2
    //   57: astore #5
    //   59: aload #5
    //   61: aload_1
    //   62: putfield h : Loj;
    //   65: aload #5
    //   67: getfield f : Landroid/content/SharedPreferences;
    //   70: astore #8
    //   72: aload #5
    //   74: aload_2
    //   75: invokevirtual h : (Ljava/lang/String;)Z
    //   78: istore_3
    //   79: iconst_0
    //   80: istore #4
    //   82: iload_3
    //   83: ifeq -> 109
    //   86: aload #6
    //   88: ldc_w 'Use the existing ApplicationAnalyticsSession if it is available and valid.'
    //   91: iconst_0
    //   92: anewarray java/lang/Object
    //   95: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload #5
    //   100: getfield g : Lop2;
    //   103: invokestatic m : (Ljava/lang/Object;)V
    //   106: goto -> 635
    //   109: aload #5
    //   111: getfield b : Lhf2;
    //   114: astore #7
    //   116: aload #8
    //   118: ifnonnull -> 128
    //   121: getstatic op2.q : Lrp0;
    //   124: astore_1
    //   125: goto -> 452
    //   128: new op2
    //   131: dup
    //   132: aload #7
    //   134: invokespecial <init> : (Lhf2;)V
    //   137: astore_1
    //   138: aload_1
    //   139: aload #8
    //   141: ldc_w 'is_output_switcher_enabled'
    //   144: iconst_0
    //   145: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   150: putfield o : Z
    //   153: aload #8
    //   155: ldc_w 'application_id'
    //   158: invokeinterface contains : (Ljava/lang/String;)Z
    //   163: ifeq -> 452
    //   166: aload_1
    //   167: aload #8
    //   169: ldc_w 'application_id'
    //   172: ldc_w ''
    //   175: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: putfield b : Ljava/lang/String;
    //   183: aload #8
    //   185: ldc_w 'receiver_metrics_id'
    //   188: invokeinterface contains : (Ljava/lang/String;)Z
    //   193: ifeq -> 452
    //   196: aload_1
    //   197: aload #8
    //   199: ldc_w 'receiver_metrics_id'
    //   202: ldc_w ''
    //   205: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   210: putfield c : Ljava/lang/String;
    //   213: aload #8
    //   215: ldc_w 'analytics_session_id'
    //   218: invokeinterface contains : (Ljava/lang/String;)Z
    //   223: ifeq -> 452
    //   226: aload_1
    //   227: aload #8
    //   229: ldc_w 'analytics_session_id'
    //   232: lconst_0
    //   233: invokeinterface getLong : (Ljava/lang/String;J)J
    //   238: putfield d : J
    //   241: getstatic r3/IKWi/AyxAR.TKv : Ljava/lang/String;
    //   244: astore #9
    //   246: aload #8
    //   248: aload #9
    //   250: invokeinterface contains : (Ljava/lang/String;)Z
    //   255: ifeq -> 452
    //   258: aload_1
    //   259: aload #8
    //   261: aload #9
    //   263: iconst_0
    //   264: invokeinterface getInt : (Ljava/lang/String;I)I
    //   269: putfield e : I
    //   272: aload #8
    //   274: ldc_w 'receiver_session_id'
    //   277: invokeinterface contains : (Ljava/lang/String;)Z
    //   282: ifeq -> 452
    //   285: aload_1
    //   286: aload #8
    //   288: ldc_w 'receiver_session_id'
    //   291: ldc_w ''
    //   294: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   299: putfield f : Ljava/lang/String;
    //   302: aload_1
    //   303: aload #8
    //   305: ldc_w 'device_capabilities'
    //   308: iconst_0
    //   309: invokeinterface getInt : (Ljava/lang/String;I)I
    //   314: putfield g : I
    //   317: aload_1
    //   318: aload #8
    //   320: ldc_w 'device_model_name'
    //   323: ldc_w ''
    //   326: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: putfield h : Ljava/lang/String;
    //   334: aload_1
    //   335: aload #8
    //   337: ldc_w 'manufacturer'
    //   340: ldc_w ''
    //   343: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   348: putfield i : Ljava/lang/String;
    //   351: aload_1
    //   352: aload #8
    //   354: ldc_w 'product_name'
    //   357: ldc_w ''
    //   360: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   365: putfield j : Ljava/lang/String;
    //   368: aload_1
    //   369: aload #8
    //   371: ldc_w 'build_type'
    //   374: ldc_w ''
    //   377: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   382: putfield k : Ljava/lang/String;
    //   385: aload_1
    //   386: aload #8
    //   388: ldc_w 'cast_build_version'
    //   391: ldc_w ''
    //   394: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   399: putfield l : Ljava/lang/String;
    //   402: aload_1
    //   403: aload #8
    //   405: ldc_w 'system_build_number'
    //   408: ldc_w ''
    //   411: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   416: putfield m : Ljava/lang/String;
    //   419: aload_1
    //   420: aload #8
    //   422: ldc_w 'device_category'
    //   425: iconst_0
    //   426: invokeinterface getInt : (Ljava/lang/String;I)I
    //   431: putfield n : I
    //   434: aload_1
    //   435: aload #8
    //   437: ldc_w 'analytics_session_start_type'
    //   440: iconst_0
    //   441: invokeinterface getInt : (Ljava/lang/String;I)I
    //   446: putfield p : I
    //   449: goto -> 454
    //   452: aconst_null
    //   453: astore_1
    //   454: aload #5
    //   456: aload_1
    //   457: putfield g : Lop2;
    //   460: aload #5
    //   462: aload_2
    //   463: invokevirtual h : (Ljava/lang/String;)Z
    //   466: ifeq -> 505
    //   469: aload #6
    //   471: ldc_w 'Use the restored ApplicationAnalyticsSession if it is valid.'
    //   474: iconst_0
    //   475: anewarray java/lang/Object
    //   478: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   481: aload #5
    //   483: getfield g : Lop2;
    //   486: invokestatic m : (Ljava/lang/Object;)V
    //   489: aload #5
    //   491: getfield g : Lop2;
    //   494: getfield d : J
    //   497: lconst_1
    //   498: ladd
    //   499: putstatic op2.r : J
    //   502: goto -> 635
    //   505: aload #6
    //   507: ldc_w 'The restored ApplicationAnalyticsSession is not valid, create a new one.'
    //   510: iconst_0
    //   511: anewarray java/lang/Object
    //   514: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   517: new op2
    //   520: dup
    //   521: aload #7
    //   523: invokespecial <init> : (Lhf2;)V
    //   526: astore #6
    //   528: getstatic op2.r : J
    //   531: lconst_1
    //   532: ladd
    //   533: putstatic op2.r : J
    //   536: aload #5
    //   538: aload #6
    //   540: putfield g : Lop2;
    //   543: aload #5
    //   545: getfield h : Loj;
    //   548: astore_1
    //   549: iload #4
    //   551: istore_3
    //   552: aload_1
    //   553: ifnull -> 571
    //   556: iload #4
    //   558: istore_3
    //   559: aload_1
    //   560: getfield g : Leh2;
    //   563: invokevirtual q0 : ()Z
    //   566: ifeq -> 571
    //   569: iconst_1
    //   570: istore_3
    //   571: aload #6
    //   573: iload_3
    //   574: putfield o : Z
    //   577: aload #5
    //   579: getfield g : Lop2;
    //   582: astore_1
    //   583: aload_1
    //   584: invokestatic m : (Ljava/lang/Object;)V
    //   587: getstatic kj.k : Lrp0;
    //   590: astore #6
    //   592: invokestatic j : ()V
    //   595: getstatic kj.m : Lkj;
    //   598: astore #6
    //   600: aload #6
    //   602: invokestatic m : (Ljava/lang/Object;)V
    //   605: invokestatic j : ()V
    //   608: aload_1
    //   609: aload #6
    //   611: getfield e : Lmj;
    //   614: getfield b : Ljava/lang/String;
    //   617: putfield b : Ljava/lang/String;
    //   620: aload #5
    //   622: getfield g : Lop2;
    //   625: astore_1
    //   626: aload_1
    //   627: invokestatic m : (Ljava/lang/Object;)V
    //   630: aload_1
    //   631: aload_2
    //   632: putfield f : Ljava/lang/String;
    //   635: aload #5
    //   637: getfield g : Lop2;
    //   640: invokestatic m : (Ljava/lang/Object;)V
    //   643: aload #5
    //   645: getfield c : Lsp2;
    //   648: astore #6
    //   650: aload #5
    //   652: getfield g : Lop2;
    //   655: astore_2
    //   656: aload #5
    //   658: getfield a : Lhn2;
    //   661: astore_1
    //   662: aload #6
    //   664: aload_2
    //   665: invokevirtual b : (Lop2;)Lnq2;
    //   668: astore_2
    //   669: aload_2
    //   670: invokevirtual c : ()Liq2;
    //   673: invokestatic m : (Liq2;)Lhq2;
    //   676: astore #5
    //   678: aload #5
    //   680: invokevirtual a : ()V
    //   683: aload #5
    //   685: getfield c : Lpv2;
    //   688: checkcast iq2
    //   691: bipush #10
    //   693: invokevirtual r : (I)V
    //   696: aload_2
    //   697: aload #5
    //   699: invokevirtual b : ()Lpv2;
    //   702: checkcast iq2
    //   705: invokevirtual d : (Liq2;)V
    //   708: aload_2
    //   709: invokevirtual c : ()Liq2;
    //   712: invokestatic m : (Liq2;)Lhq2;
    //   715: astore #5
    //   717: aload #5
    //   719: invokevirtual a : ()V
    //   722: aload #5
    //   724: getfield c : Lpv2;
    //   727: checkcast iq2
    //   730: iconst_1
    //   731: invokevirtual p : (Z)V
    //   734: aload_2
    //   735: invokevirtual a : ()V
    //   738: aload_2
    //   739: getfield c : Lpv2;
    //   742: checkcast oq2
    //   745: aload #5
    //   747: invokevirtual b : ()Lpv2;
    //   750: checkcast iq2
    //   753: invokevirtual v : (Liq2;)V
    //   756: aload_1
    //   757: aload_2
    //   758: invokevirtual b : ()Lpv2;
    //   761: checkcast oq2
    //   764: sipush #226
    //   767: invokevirtual a : (Loq2;I)V
    //   770: return
    //   771: aload_1
    //   772: checkcast oj
    //   775: astore_1
    //   776: return
  }
  
  public void q(du2 paramdu2) {
    eh2 eh2 = (eh2)this.c;
    boolean bool3 = eh2.j;
    rp0 rp0 = eh2.n;
    if (paramdu2.f()) {
      Bundle bundle = (Bundle)paramdu2.e();
      if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
        boolean bool = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
        eh2.k = bool;
        rp0.b("The module-to-client output switcher flag value is %b", new Object[] { Boolean.valueOf(bool) });
      } 
      if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK")) {
        boolean bool = bundle.getBoolean("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK");
        eh2.l = bool;
        rp0.b("The module-to-client show system output switcher on cast icon click flag value is %b", new Object[] { Boolean.valueOf(bool) });
      } 
    } 
    boolean bool2 = eh2.k;
    boolean bool1 = eh2.l;
    if (eh2.f != null) {
      mj mj = eh2.g;
      if (mj != null) {
        gf1 gf1;
        boolean bool5 = mj.m;
        boolean bool = true;
        if (bool1 && mj.l) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (bool2 && mj.o) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        Object object = new Object();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
          bool4 = true;
        } else {
          bool4 = false;
        } 
        ((kv0)object).a = bool4;
        if (i >= 30)
          ((kv0)object).a = bool2; 
        if (i >= 30)
          ((kv0)object).c = bool5; 
        if (i >= 30)
          ((kv0)object).b = bool1; 
        boolean bool4 = mj.t;
        if (i >= 30)
          ((kv0)object).d = bool4; 
        lv0 lv01 = new lv0((kv0)object);
        iv0.b();
        ee0 ee0 = iv0.c();
        lv0 lv02 = ee0.w;
        object = ee0.a;
        ee0.w = lv01;
        bool4 = ee0.h();
        cu0 cu0 = ee0.s;
        if (bool4) {
          if (cu0 == null) {
            cu0 = new cu0(ee0.h, new ae0(ee0));
            ee0.s = cu0;
            ee0.a(cu0, true);
            ee0.m();
          } 
          cu0 = ee0.s;
          bool4 = lv01.d;
          cu0.r = bool4;
          cu0.j();
          gf1 = ee0.c;
          gf1.f = bool4;
          gf1.c.post(gf1.i);
          if (lv02 != null && lv02.c) {
            bool4 = true;
          } else {
            bool4 = false;
          } 
          if (bool4 != lv01.c) {
            cu0 cu01 = ee0.s;
            cu01.g = ee0.C;
            if (!cu01.h) {
              cu01.h = true;
              cu01.e.sendEmptyMessage(2);
            } 
          } 
        } else if (gf1 != null) {
          gv0 gv0 = ee0.d((zu0)gf1);
          if (gv0 != null) {
            iv0.b();
            ((zu0)gf1).f = null;
            gf1.g(null);
            ee0.o(gv0, null);
            object.b(514, gv0);
            ee0.m.remove(gv0);
          } 
          ee0.s = null;
          gf1 gf11 = ee0.c;
          gf11.c.post(gf11.i);
        } 
        object.b(769, lv01);
        Log.i(rp0.a, rp0.c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool5), Boolean.valueOf(bool1) }));
        object = eh2.i;
        if (object != null) {
          if (bool3 && bool2) {
            bool1 = bool;
          } else {
            bool1 = false;
          } 
          ((vh2)object).e = bool1;
        } 
        if (bool3 && bool2)
          zq2.a(wp2.M); 
        if (bool5)
          zq2.a(wp2.N); 
      } 
    } 
  }
  
  public void r(al1 paramal1, int paramInt) {
    rp0 rp0;
    fp2 fp2;
    oj oj2;
    sp2 sp2;
    op2 op2;
    switch (this.b) {
      default:
        oj2 = (oj)paramal1;
        rp0 = fp2.i;
        fp2.i.b("onSessionSuspended with reason = %d", new Object[] { Integer.valueOf(paramInt) });
        fp2 = (fp2)this.c;
        fp2.h = oj2;
        fp2.e();
        n21.m(fp2.g);
        sp2 = fp2.c;
        op2 = fp2.g;
        fp2.a.a(sp2.a(op2, paramInt), 225);
        fp2.a();
        fp2.e.removeCallbacks(fp2.d);
        return;
      case 15:
        break;
    } 
    oj oj1 = (oj)fp2;
  }
  
  public HashMap s(Collection paramCollection) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Map map = (Map)this.c;
    for (String str : map.keySet()) {
      Set<String> set;
      if (!map.containsKey(str)) {
        set = Collections.EMPTY_SET;
      } else {
        HashSet<String> hashSet = new HashSet();
        for (Map.Entry entry : ((Map)map.get(str)).entrySet()) {
          if (paramCollection.contains(entry.getKey()))
            hashSet.add((String)entry.getValue()); 
        } 
        set = Collections.unmodifiableSet(hashSet);
      } 
      hashMap.put(str, set);
    } 
    return hashMap;
  }
  
  public void t(Context paramContext, HashSet paramHashSet) {
    /* monitor enter ThisExpression{ObjectType{a42}} */
    try {
      AssetManager assetManager = paramContext.getAssets();
      Iterator<File> iterator = paramHashSet.iterator();
      while (iterator.hasNext())
        u(assetManager, iterator.next()); 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{a42}} */
  }
  
  public void v(Object paramObject) {
    /* monitor enter ThisExpression{ObjectType{a42}} */
    try {
      Iterator<ol0> iterator = ((HashSet)this.c).iterator();
      while (iterator.hasNext())
        ((ol0)iterator.next()).a(paramObject); 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{a42}} */
  }
  
  public void w() {
    nf1 nf1 = (nf1)this.c;
    Iterator<zk> iterator = nf1.g.iterator();
    if (!iterator.hasNext()) {
      for (zk zk : nf1.h) {
        switch (zk.a) {
          case 3:
            ((qr2)zk.b).b();
            break;
        } 
      } 
      return;
    } 
    throw x41.g(iterator);
  }
  
  public void x(int paramInt, Object paramObject, jw2 paramjw2) {
    jv2 jv2 = (jv2)this.c;
    paramObject = paramObject;
    jv2.c(paramInt, 2);
    jv2.k(paramObject.b(paramjw2));
    paramjw2.f(paramObject, this);
  }
  
  public void y(int paramInt, Object paramObject, em2 paramem2) {
    ik2 ik2 = (ik2)this.c;
    paramObject = paramObject;
    ik2.i(paramInt, 2);
    ik2.k(paramObject.c(paramem2));
    paramem2.i(paramObject, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */