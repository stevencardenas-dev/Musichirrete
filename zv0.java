import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import in.krosbits.musicolet.DbCleanActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipFile;

public class zv0 implements ps0, sh2, di0, ao2, kf1, jw0, j70 {
  public static int g;
  
  public static final int[] h = new int[0];
  
  public static zv0 i;
  
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public Object f;
  
  public zv0(Context paramContext) {
    this.e = object;
    this.f = new AtomicReference<ox>(ox);
  }
  
  public zv0(Context paramContext, ComponentName paramComponentName, PendingIntent paramPendingIntent) {
    this.f = new ArrayList();
    if (paramContext != null) {
      if (!TextUtils.isEmpty("CastMediaSession")) {
        Looper looper;
        ComponentName componentName = paramComponentName;
        if (paramComponentName == null) {
          paramComponentName = d20.a(paramContext);
          componentName = paramComponentName;
          if (paramComponentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            componentName = paramComponentName;
          } 
        } 
        PendingIntent pendingIntent = paramPendingIntent;
        if (componentName != null) {
          pendingIntent = paramPendingIntent;
          if (paramPendingIntent == null) {
            boolean bool;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            if (Build.VERSION.SDK_INT >= 31) {
              bool = true;
            } else {
              bool = false;
            } 
            pendingIntent = PendingIntent.getBroadcast(paramContext, 0, intent, bool);
          } 
        } 
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          this.c = new tv0(paramContext);
        } else if (i >= 28) {
          this.c = new tv0(paramContext);
        } else {
          this.c = new tv0(paramContext);
        } 
        if (Looper.myLooper() != null) {
          looper = Looper.myLooper();
        } else {
          looper = Looper.getMainLooper();
        } 
        Handler handler = new Handler(looper);
        B(new rv0(), handler);
        ((tv0)this.c).a.setMediaButtonReceiver(pendingIntent);
        this.e = new g7(paramContext, ((tv0)this.c).c);
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
  
  public zv0(Context paramContext, TypedArray paramTypedArray) {
    this.c = paramContext;
    this.e = paramTypedArray;
  }
  
  public zv0(Context paramContext, LocationManager paramLocationManager) {
    this.f = new Object();
    this.c = paramContext;
    this.e = paramLocationManager;
  }
  
  public zv0(Context paramContext, tv0 paramtv0) {
    this.f = new ArrayList();
    this.c = paramtv0;
    this.e = new g7(paramContext, paramtv0.c);
  }
  
  public zv0(gp2 paramgp2, HashSet paramHashSet, qf2 paramqf2) {
    this.f = paramgp2;
    this.c = paramHashSet;
    this.e = paramqf2;
  }
  
  public zv0(DbCleanActivity paramDbCleanActivity, ArrayList paramArrayList, boolean[] paramArrayOfboolean) {
    this.e = paramDbCleanActivity;
    this.f = paramArrayList;
    this.c = paramArrayOfboolean;
  }
  
  public zv0(Class paramClass) {
    UUID uUID = UUID.randomUUID();
    uUID.getClass();
    this.c = uUID;
    String str2 = ((UUID)this.c).toString();
    str2.getClass();
    this.e = new y72(str2, null, paramClass.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0L, 0, 0, null, null, 33554426);
    String str1 = paramClass.getName();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet(or0.a0(1));
    (new String[1])[0] = str1;
    linkedHashSet.add((new String[1])[0]);
    this.f = linkedHashSet;
  }
  
  public zv0(vo paramvo, Object paramObject) {
    this.f = paramvo;
    this.e = new d7((CopyOnWriteArrayList)paramvo.c.e, 0, null);
    this.c = paramObject;
  }
  
  public zv0(xr0 paramxr0, View paramView) {
    Object object;
    int i = Build.VERSION.SDK_INT;
    if (i >= 34) {
      object = new Object();
    } else if (i >= 33) {
      object = new Object();
    } else {
      object = null;
    } 
    this.c = object;
    this.e = paramxr0;
    this.f = paramView;
  }
  
  public static Bundle D(Bundle paramBundle) {
    if (paramBundle == null)
      return null; 
    m(paramBundle);
    try {
      paramBundle.isEmpty();
      return paramBundle;
    } catch (BadParcelableException badParcelableException) {
      Log.e("MediaSessionCompat", "Could not unparcel the data.");
      return null;
    } 
  }
  
  public static int i(int paramInt1, int paramInt2) {
    return (paramInt1 > paramInt2) ? 1 : ((paramInt2 > paramInt1) ? -1 : 0);
  }
  
  public static int l(int paramInt1, int paramInt2) {
    return (paramInt1 == -1) ? ((paramInt2 == -1) ? 0 : -1) : ((paramInt2 == -1) ? 1 : (paramInt1 - paramInt2));
  }
  
  public static void m(Bundle paramBundle) {
    if (paramBundle != null)
      paramBundle.setClassLoader(zv0.class.getClassLoader()); 
  }
  
  public static int r(la0 paramla0, String paramString, boolean paramBoolean) {
    if (!TextUtils.isEmpty(paramString) && paramString.equals(paramla0.C))
      return 4; 
    paramString = x(paramString);
    String str = x(paramla0.C);
    if (str == null || paramString == null)
      return (paramBoolean && str == null) ? 1 : 0; 
    if (str.startsWith(paramString) || paramString.startsWith(str))
      return 3; 
    int i = d12.a;
    return str.split("-", 2)[0].equals(paramString.split("-", 2)[0]) ? 2 : 0;
  }
  
  public static ArrayList s(uv1 paramuv1, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore #8
    //   6: aload_0
    //   7: getfield c : [Lla0;
    //   10: astore #14
    //   12: new java/util/ArrayList
    //   15: dup
    //   16: iload #8
    //   18: invokespecial <init> : (I)V
    //   21: astore #13
    //   23: iconst_0
    //   24: istore #4
    //   26: iload #4
    //   28: iload #8
    //   30: if_icmpge -> 50
    //   33: aload #13
    //   35: iload #4
    //   37: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   40: invokevirtual add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: iinc #4, 1
    //   47: goto -> 26
    //   50: iload_1
    //   51: ldc_w 2147483647
    //   54: if_icmpeq -> 423
    //   57: iload_2
    //   58: ldc_w 2147483647
    //   61: if_icmpne -> 67
    //   64: goto -> 423
    //   67: ldc_w 2147483647
    //   70: istore #4
    //   72: iconst_0
    //   73: istore #5
    //   75: iload #5
    //   77: iload #8
    //   79: if_icmpge -> 328
    //   82: aload #14
    //   84: iload #5
    //   86: aaload
    //   87: astore #15
    //   89: aload #15
    //   91: getfield p : I
    //   94: istore #10
    //   96: aload #15
    //   98: getfield q : I
    //   101: istore #9
    //   103: iload #4
    //   105: istore #6
    //   107: iload #10
    //   109: ifle -> 318
    //   112: iload #4
    //   114: istore #6
    //   116: iload #9
    //   118: ifle -> 318
    //   121: iload_3
    //   122: ifeq -> 171
    //   125: iload #10
    //   127: iload #9
    //   129: if_icmple -> 138
    //   132: iconst_1
    //   133: istore #6
    //   135: goto -> 141
    //   138: iconst_0
    //   139: istore #6
    //   141: iload_1
    //   142: iload_2
    //   143: if_icmple -> 152
    //   146: iconst_1
    //   147: istore #7
    //   149: goto -> 155
    //   152: iconst_0
    //   153: istore #7
    //   155: iload #6
    //   157: iload #7
    //   159: if_icmpeq -> 171
    //   162: iload_1
    //   163: istore #7
    //   165: iload_2
    //   166: istore #6
    //   168: goto -> 177
    //   171: iload_1
    //   172: istore #6
    //   174: iload_2
    //   175: istore #7
    //   177: iload #10
    //   179: iload #7
    //   181: imul
    //   182: istore #12
    //   184: iload #9
    //   186: iload #6
    //   188: imul
    //   189: istore #11
    //   191: iload #12
    //   193: iload #11
    //   195: if_icmplt -> 226
    //   198: getstatic d12.a : I
    //   201: istore #7
    //   203: new android/graphics/Point
    //   206: dup
    //   207: iload #6
    //   209: iload #11
    //   211: iload #10
    //   213: iadd
    //   214: iconst_1
    //   215: isub
    //   216: iload #10
    //   218: idiv
    //   219: invokespecial <init> : (II)V
    //   222: astore_0
    //   223: goto -> 251
    //   226: getstatic d12.a : I
    //   229: istore #6
    //   231: new android/graphics/Point
    //   234: dup
    //   235: iload #12
    //   237: iload #9
    //   239: iadd
    //   240: iconst_1
    //   241: isub
    //   242: iload #9
    //   244: idiv
    //   245: iload #7
    //   247: invokespecial <init> : (II)V
    //   250: astore_0
    //   251: aload #15
    //   253: getfield p : I
    //   256: istore #10
    //   258: iload #10
    //   260: iload #9
    //   262: imul
    //   263: istore #7
    //   265: iload #4
    //   267: istore #6
    //   269: iload #10
    //   271: aload_0
    //   272: getfield x : I
    //   275: i2f
    //   276: ldc_w 0.98
    //   279: fmul
    //   280: f2i
    //   281: if_icmplt -> 318
    //   284: iload #4
    //   286: istore #6
    //   288: iload #9
    //   290: aload_0
    //   291: getfield y : I
    //   294: i2f
    //   295: ldc_w 0.98
    //   298: fmul
    //   299: f2i
    //   300: if_icmplt -> 318
    //   303: iload #4
    //   305: istore #6
    //   307: iload #7
    //   309: iload #4
    //   311: if_icmpge -> 318
    //   314: iload #7
    //   316: istore #6
    //   318: iinc #5, 1
    //   321: iload #6
    //   323: istore #4
    //   325: goto -> 75
    //   328: iload #4
    //   330: ldc_w 2147483647
    //   333: if_icmpeq -> 423
    //   336: aload #13
    //   338: invokevirtual size : ()I
    //   341: iconst_1
    //   342: isub
    //   343: istore_1
    //   344: iload_1
    //   345: iflt -> 423
    //   348: aload #14
    //   350: aload #13
    //   352: iload_1
    //   353: invokevirtual get : (I)Ljava/lang/Object;
    //   356: checkcast java/lang/Integer
    //   359: invokevirtual intValue : ()I
    //   362: aaload
    //   363: astore_0
    //   364: aload_0
    //   365: getfield p : I
    //   368: istore_2
    //   369: iload_2
    //   370: iconst_m1
    //   371: if_icmpeq -> 397
    //   374: aload_0
    //   375: getfield q : I
    //   378: istore #5
    //   380: iload #5
    //   382: iconst_m1
    //   383: if_icmpne -> 389
    //   386: goto -> 397
    //   389: iload_2
    //   390: iload #5
    //   392: imul
    //   393: istore_2
    //   394: goto -> 399
    //   397: iconst_m1
    //   398: istore_2
    //   399: iload_2
    //   400: iconst_m1
    //   401: if_icmpeq -> 410
    //   404: iload_2
    //   405: iload #4
    //   407: if_icmple -> 417
    //   410: aload #13
    //   412: iload_1
    //   413: invokevirtual remove : (I)Ljava/lang/Object;
    //   416: pop
    //   417: iinc #1, -1
    //   420: goto -> 344
    //   423: aload #13
    //   425: areturn
  }
  
  public static boolean t(int paramInt, boolean paramBoolean) {
    paramInt &= 0x7;
    return (paramInt == 4 || (paramBoolean && paramInt == 3));
  }
  
  public static boolean u(la0 paramla0, int paramInt1, mx parammx, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_0
    //   2: invokestatic t : (IZ)Z
    //   5: ifeq -> 99
    //   8: aload_0
    //   9: getfield g : I
    //   12: istore_1
    //   13: iload_1
    //   14: iconst_m1
    //   15: if_icmpeq -> 23
    //   18: iload_1
    //   19: iload_3
    //   20: if_icmpgt -> 99
    //   23: iload #6
    //   25: ifne -> 46
    //   28: aload_0
    //   29: getfield x : I
    //   32: istore_1
    //   33: iload_1
    //   34: iconst_m1
    //   35: if_icmpeq -> 99
    //   38: iload_1
    //   39: aload_2
    //   40: getfield a : I
    //   43: if_icmpne -> 99
    //   46: iload #4
    //   48: ifne -> 74
    //   51: aload_0
    //   52: getfield k : Ljava/lang/String;
    //   55: astore #7
    //   57: aload #7
    //   59: ifnull -> 99
    //   62: aload #7
    //   64: aload_2
    //   65: getfield c : Ljava/lang/String;
    //   68: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   71: ifeq -> 99
    //   74: iload #5
    //   76: ifne -> 97
    //   79: aload_0
    //   80: getfield y : I
    //   83: istore_1
    //   84: iload_1
    //   85: iconst_m1
    //   86: if_icmpeq -> 99
    //   89: iload_1
    //   90: aload_2
    //   91: getfield b : I
    //   94: if_icmpne -> 99
    //   97: iconst_1
    //   98: ireturn
    //   99: iconst_0
    //   100: ireturn
  }
  
  public static boolean v(la0 paramla0, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if ((paramla0.f & 0x4000) != 0)
      return false; 
    if (t(paramInt1, false) && (paramInt1 & paramInt2) != 0 && (paramString == null || d12.a(paramla0.k, paramString))) {
      paramInt1 = paramla0.p;
      if (paramInt1 == -1 || paramInt1 <= paramInt3) {
        paramInt1 = paramla0.q;
        if (paramInt1 == -1 || paramInt1 <= paramInt4) {
          float f = paramla0.r;
          if (f == -1.0F || f <= paramInt5) {
            paramInt1 = paramla0.g;
            if (paramInt1 == -1 || paramInt1 <= paramInt6)
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public static String x(String paramString) {
    return (TextUtils.isEmpty(paramString) || TextUtils.equals(paramString, "und")) ? null : paramString;
  }
  
  public static zv0 y(int paramInt1, int paramInt2, Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return new zv0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, paramInt1, paramInt2));
  }
  
  public void A(String paramString) {
    if (paramString != null) {
      this.c = paramString;
      return;
    } 
    k91.h("Null backendName");
  }
  
  public void B(rv0 paramrv0, Handler paramHandler) {
    tv0 tv0 = (tv0)this.c;
    if (paramrv0 == null) {
      tv0.c(null, null);
      return;
    } 
    if (paramHandler == null)
      paramHandler = new Handler(); 
    tv0.c(paramrv0, paramHandler);
  }
  
  public void C(MediaMetadataCompat paramMediaMetadataCompat) {
    tv0 tv0 = (tv0)this.c;
    tv0.h = paramMediaMetadataCompat;
    tv0.a.setMetadata(paramMediaMetadataCompat.i());
  }
  
  public Object E() {
    Object object = this.c;
    Field field = (Field)this.e;
    Class<Object> clazz = (Class)this.f;
    try {
      return clazz.cast(field.get(object));
    } catch (Exception exception) {
      k91.k("Failed to get value of field ", field.getName(), object.getClass().getName(), clazz.getName(), exception);
      return null;
    } 
  }
  
  public boolean F(Integer[] paramArrayOfInteger) {
    ArrayList<String> arrayList = (ArrayList)this.f;
    boolean[] arrayOfBoolean = new boolean[arrayList.size()];
    byte b;
    for (b = 0; b < paramArrayOfInteger.length; b++)
      arrayOfBoolean[paramArrayOfInteger[b].intValue()] = true; 
    for (b = 0; b < arrayList.size(); b++) {
      boolean[] arrayOfBoolean1 = (boolean[])this.c;
      boolean bool1 = arrayOfBoolean1[b];
      boolean bool2 = arrayOfBoolean[b];
      if (bool1 != bool2) {
        arrayOfBoolean1[b] = bool2;
        String str = arrayList.get(b);
        DbCleanActivity dbCleanActivity = (DbCleanActivity)this.e;
        for (byte b1 = 0; b1 < dbCleanActivity.R.size(); b1++) {
          if (str.equals(((km0)dbCleanActivity.R.get(b1)).i))
            dbCleanActivity.S[b1] = bool2; 
        } 
        dbCleanActivity.n0();
      } 
    } 
    return true;
  }
  
  public void G(Object paramObject) {
    Object object = this.c;
    Field field = (Field)this.e;
    try {
      field.set(object, paramObject);
      return;
    } catch (Exception exception) {
      k91.k("Failed to set value of field ", field.getName(), object.getClass().getName(), ((Class)this.f).getName(), exception);
      return;
    } 
  }
  
  public void accept(Object paramObject1, Object paramObject2) {
    boolean bool;
    String str2;
    pg2 pg21;
    nf1 nf1;
    nv2 nv21;
    sl0 sl0;
    pg2 pg23;
    qd2 qd2;
    n5 n5;
    Parcel parcel;
    int i = this.b;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        pg23 = (pg2)this.c;
        str2 = (String)this.e;
        nf1 = (nf1)this.f;
        nv21 = (nv2)paramObject1;
        i = pg23.F;
        bool = true;
        if (i == 1)
          bool = false; 
        n21.q("Not active connection", bool);
        paramObject1 = nv21.c;
        paramObject1 = g92.g0();
        qd2 = (qd2)nv21.i();
        parcel = qd2.o();
        parcel.writeString(str2);
        mh2.b(parcel, (Parcelable)paramObject1);
        qd2.p0(parcel, 12);
        if (nf1 != null) {
          qd2 qd21 = (qd2)nv21.i();
          Parcel parcel1 = qd21.o();
          parcel1.writeString(str2);
          mh2.b(parcel1, (Parcelable)paramObject1);
          qd21.p0(parcel1, 11);
        } 
        paramObject2.b(null);
        return;
      case 17:
        pg21 = (pg2)this.c;
        str3 = (String)this.e;
        sl0 = (sl0)this.f;
        paramObject1 = paramObject1;
        n21.q("Not connected to device", pg21.i());
        paramObject1 = paramObject1.i();
        n5 = g92.g0();
        parcel = paramObject1.o();
        parcel.writeString(str3);
        mh2.b(parcel, sl0);
        mh2.b(parcel, n5);
        paramObject1.p0(parcel, 13);
        paramObject1 = pg21.r;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject1} */
        try {
          if (pg21.o != null)
            pg21.j(2477); 
        } finally {}
        pg21.o = (nt1)paramObject2;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject1} */
        return;
      case 16:
        break;
    } 
    String str1 = (String)this.e;
    String str3 = (String)this.f;
    nv2 nv22 = (nv2)paramObject1;
    pg2 pg22 = (pg2)this.c;
    paramObject1 = pg22.B;
    long l = pg22.q.incrementAndGet();
    n21.q("Not connected to device", pg22.i());
    try {
      paramObject1.put(Long.valueOf(l), paramObject2);
      Context context = nv22.c;
      n5 n51 = g92.g0();
      qd2 qd21 = (qd2)nv22.i();
      Parcel parcel1 = qd21.o();
      parcel1.writeString(str1);
      parcel1.writeString(str3);
      parcel1.writeLong(l);
      mh2.b(parcel1, n51);
      qd21.p0(parcel1, 9);
    } catch (RemoteException remoteException) {
      paramObject1.remove(Long.valueOf(l));
      paramObject2.a((Exception)remoteException);
    } 
  }
  
  public void b(ZipFile paramZipFile, HashSet paramHashSet) {
    HashSet hashSet2 = (HashSet)this.c;
    gp2 gp2 = (gp2)this.f;
    qf2 qf2 = (qf2)this.e;
    HashSet hashSet1 = new HashSet();
    gp2.c(qf2, paramHashSet, new p01(hashSet1, qf2, paramZipFile, 20));
    hashSet2.addAll(hashSet1);
  }
  
  public Object c() {
    return null;
  }
  
  public void d(int paramInt, fw0 paramfw0) {
    if (w(paramInt, paramfw0)) {
      vo vo = (vo)this.f;
      fw0 fw01 = (fw0)((d7)this.e).c;
      fw01.getClass();
      if (vo.s(fw01))
        ((d7)this.e).g(); 
    } 
  }
  
  public Uri e() {
    return (Uri)this.c;
  }
  
  public void f() {}
  
  public Uri g() {
    return (Uri)this.f;
  }
  
  public Object get() {
    switch (this.b) {
      default:
        return new vw1(new zb0(20), (am)new Object(), (zw)((cn)this.c).get(), (wy)((rv1)this.e).get(), (n2)((n2)this.f).get());
      case 12:
        break;
    } 
    return new p01(((fb1)this.c).get(), ((fb1)this.e).get(), ((fb0)this.f).get(), 8);
  }
  
  public ClipDescription getDescription() {
    return (ClipDescription)this.e;
  }
  
  public void h(int paramInt, fw0 paramfw0) {
    if (w(paramInt, paramfw0)) {
      vo vo = (vo)this.f;
      paramfw0 = (fw0)((d7)this.e).c;
      paramfw0.getClass();
      if (vo.s(paramfw0))
        ((d7)this.e).f(); 
    } 
  }
  
  public ib j() {
    String str1;
    if ((String)this.c == null) {
      str1 = " backendName";
    } else {
      str1 = "";
    } 
    String str2 = str1;
    if ((fa1)this.f == null)
      str2 = str1.concat(" priority"); 
    if (str2.isEmpty())
      return new ib((String)this.c, (byte[])this.e, (fa1)this.f); 
    tp.f("Missing required properties:".concat(str2));
    return null;
  }
  
  public t41 k() {
    // Byte code:
    //   0: new t41
    //   3: dup
    //   4: aload_0
    //   5: getfield c : Ljava/lang/Object;
    //   8: checkcast java/util/UUID
    //   11: aload_0
    //   12: getfield e : Ljava/lang/Object;
    //   15: checkcast y72
    //   18: aload_0
    //   19: getfield f : Ljava/lang/Object;
    //   22: checkcast java/util/LinkedHashSet
    //   25: invokespecial <init> : (Ljava/util/UUID;Ly72;Ljava/util/LinkedHashSet;)V
    //   28: astore #7
    //   30: aload_0
    //   31: getfield e : Ljava/lang/Object;
    //   34: checkcast y72
    //   37: getfield j : Lhr;
    //   40: astore #5
    //   42: aload #5
    //   44: getfield i : Ljava/util/Set;
    //   47: invokeinterface isEmpty : ()Z
    //   52: ifeq -> 87
    //   55: aload #5
    //   57: getfield e : Z
    //   60: ifne -> 87
    //   63: aload #5
    //   65: getfield c : Z
    //   68: ifne -> 87
    //   71: aload #5
    //   73: getfield d : Z
    //   76: ifeq -> 82
    //   79: goto -> 87
    //   82: iconst_0
    //   83: istore_1
    //   84: goto -> 89
    //   87: iconst_1
    //   88: istore_1
    //   89: aload_0
    //   90: getfield e : Ljava/lang/Object;
    //   93: checkcast y72
    //   96: astore #8
    //   98: aload #8
    //   100: getfield q : Z
    //   103: ifeq -> 139
    //   106: iload_1
    //   107: ifne -> 131
    //   110: aload #8
    //   112: getfield g : J
    //   115: lconst_0
    //   116: lcmp
    //   117: ifgt -> 123
    //   120: goto -> 139
    //   123: ldc_w 'Expedited jobs cannot be delayed'
    //   126: invokestatic l : (Ljava/lang/String;)V
    //   129: aconst_null
    //   130: areturn
    //   131: ldc_w 'Expedited jobs only support network and storage constraints'
    //   134: invokestatic l : (Ljava/lang/String;)V
    //   137: aconst_null
    //   138: areturn
    //   139: aload #8
    //   141: getfield x : Ljava/lang/String;
    //   144: astore #5
    //   146: aload #5
    //   148: ifnonnull -> 491
    //   151: aload #8
    //   153: getfield c : Ljava/lang/String;
    //   156: astore #9
    //   158: iconst_1
    //   159: anewarray java/lang/String
    //   162: astore #5
    //   164: aload #5
    //   166: iconst_0
    //   167: ldc_w '.'
    //   170: aastore
    //   171: aload #9
    //   173: invokevirtual getClass : ()Ljava/lang/Class;
    //   176: pop
    //   177: aload #5
    //   179: iconst_0
    //   180: aaload
    //   181: astore #6
    //   183: aload #6
    //   185: invokevirtual length : ()I
    //   188: ifne -> 317
    //   191: aload #5
    //   193: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   196: astore #5
    //   198: aload #5
    //   200: invokevirtual getClass : ()Ljava/lang/Class;
    //   203: pop
    //   204: new sk1
    //   207: dup
    //   208: new zx
    //   211: dup
    //   212: aload #9
    //   214: new ei1
    //   217: dup
    //   218: iconst_1
    //   219: aload #5
    //   221: invokespecial <init> : (ILjava/lang/Object;)V
    //   224: invokespecial <init> : (Ljava/lang/CharSequence;Lei1;)V
    //   227: invokespecial <init> : (Lzx;)V
    //   230: astore #5
    //   232: new java/util/ArrayList
    //   235: dup
    //   236: aload #5
    //   238: invokestatic k0 : (Ljava/lang/Iterable;)I
    //   241: invokespecial <init> : (I)V
    //   244: astore #6
    //   246: aload #5
    //   248: invokevirtual iterator : ()Ljava/util/Iterator;
    //   251: astore #10
    //   253: aload #10
    //   255: checkcast yx
    //   258: astore #11
    //   260: aload #6
    //   262: astore #5
    //   264: aload #11
    //   266: invokevirtual hasNext : ()Z
    //   269: ifeq -> 424
    //   272: aload #11
    //   274: invokevirtual next : ()Ljava/lang/Object;
    //   277: checkcast li0
    //   280: astore #5
    //   282: aload #5
    //   284: invokevirtual getClass : ()Ljava/lang/Class;
    //   287: pop
    //   288: aload #6
    //   290: aload #9
    //   292: aload #5
    //   294: getfield b : I
    //   297: aload #5
    //   299: getfield c : I
    //   302: iconst_1
    //   303: iadd
    //   304: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
    //   307: invokevirtual toString : ()Ljava/lang/String;
    //   310: invokevirtual add : (Ljava/lang/Object;)Z
    //   313: pop
    //   314: goto -> 253
    //   317: aload #9
    //   319: aload #6
    //   321: iconst_0
    //   322: iconst_0
    //   323: invokestatic I0 : (Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    //   326: istore_2
    //   327: iload_2
    //   328: iconst_m1
    //   329: if_icmpeq -> 414
    //   332: new java/util/ArrayList
    //   335: dup
    //   336: bipush #10
    //   338: invokespecial <init> : (I)V
    //   341: astore #5
    //   343: iconst_0
    //   344: istore_1
    //   345: aload #5
    //   347: aload #9
    //   349: iload_1
    //   350: iload_2
    //   351: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
    //   354: invokevirtual toString : ()Ljava/lang/String;
    //   357: invokevirtual add : (Ljava/lang/Object;)Z
    //   360: pop
    //   361: aload #6
    //   363: invokevirtual length : ()I
    //   366: iload_2
    //   367: iadd
    //   368: istore_3
    //   369: aload #9
    //   371: aload #6
    //   373: iload_3
    //   374: iconst_0
    //   375: invokestatic I0 : (Ljava/lang/CharSequence;Ljava/lang/String;IZ)I
    //   378: istore #4
    //   380: iload #4
    //   382: istore_2
    //   383: iload_3
    //   384: istore_1
    //   385: iload #4
    //   387: iconst_m1
    //   388: if_icmpne -> 345
    //   391: aload #5
    //   393: aload #9
    //   395: iload_3
    //   396: aload #9
    //   398: invokevirtual length : ()I
    //   401: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
    //   404: invokevirtual toString : ()Ljava/lang/String;
    //   407: invokevirtual add : (Ljava/lang/Object;)Z
    //   410: pop
    //   411: goto -> 424
    //   414: aload #9
    //   416: invokevirtual toString : ()Ljava/lang/String;
    //   419: invokestatic E : (Ljava/lang/Object;)Ljava/util/List;
    //   422: astore #5
    //   424: aload #5
    //   426: invokeinterface size : ()I
    //   431: iconst_1
    //   432: if_icmpne -> 451
    //   435: aload #5
    //   437: iconst_0
    //   438: invokeinterface get : (I)Ljava/lang/Object;
    //   443: checkcast java/lang/String
    //   446: astore #5
    //   448: goto -> 461
    //   451: aload #5
    //   453: invokestatic q0 : (Ljava/util/List;)Ljava/lang/Object;
    //   456: checkcast java/lang/String
    //   459: astore #5
    //   461: aload #5
    //   463: invokevirtual length : ()I
    //   466: bipush #127
    //   468: if_icmpgt -> 474
    //   471: goto -> 481
    //   474: aload #5
    //   476: invokestatic P0 : (Ljava/lang/String;)Ljava/lang/String;
    //   479: astore #5
    //   481: aload #8
    //   483: aload #5
    //   485: putfield x : Ljava/lang/String;
    //   488: goto -> 516
    //   491: aload #5
    //   493: invokevirtual length : ()I
    //   496: bipush #127
    //   498: if_icmple -> 516
    //   501: aload_0
    //   502: getfield e : Ljava/lang/Object;
    //   505: checkcast y72
    //   508: aload #5
    //   510: invokestatic P0 : (Ljava/lang/String;)Ljava/lang/String;
    //   513: putfield x : Ljava/lang/String;
    //   516: invokestatic randomUUID : ()Ljava/util/UUID;
    //   519: astore #5
    //   521: aload #5
    //   523: invokevirtual getClass : ()Ljava/lang/Class;
    //   526: pop
    //   527: aload_0
    //   528: aload #5
    //   530: putfield c : Ljava/lang/Object;
    //   533: aload #5
    //   535: invokevirtual toString : ()Ljava/lang/String;
    //   538: astore #8
    //   540: aload #8
    //   542: invokevirtual getClass : ()Ljava/lang/Class;
    //   545: pop
    //   546: aload_0
    //   547: getfield e : Ljava/lang/Object;
    //   550: checkcast y72
    //   553: astore #5
    //   555: aload #5
    //   557: invokevirtual getClass : ()Ljava/lang/Class;
    //   560: pop
    //   561: aload #5
    //   563: getfield c : Ljava/lang/String;
    //   566: astore #6
    //   568: aload_0
    //   569: new y72
    //   572: dup
    //   573: aload #8
    //   575: aload #5
    //   577: getfield b : Lo72;
    //   580: aload #6
    //   582: aload #5
    //   584: getfield d : Ljava/lang/String;
    //   587: new du
    //   590: dup
    //   591: aload #5
    //   593: getfield e : Ldu;
    //   596: invokespecial <init> : (Ldu;)V
    //   599: new du
    //   602: dup
    //   603: aload #5
    //   605: getfield f : Ldu;
    //   608: invokespecial <init> : (Ldu;)V
    //   611: aload #5
    //   613: getfield g : J
    //   616: aload #5
    //   618: getfield h : J
    //   621: aload #5
    //   623: getfield i : J
    //   626: new hr
    //   629: dup
    //   630: aload #5
    //   632: getfield j : Lhr;
    //   635: invokespecial <init> : (Lhr;)V
    //   638: aload #5
    //   640: getfield k : I
    //   643: aload #5
    //   645: getfield l : Lqb;
    //   648: aload #5
    //   650: getfield m : J
    //   653: aload #5
    //   655: getfield n : J
    //   658: aload #5
    //   660: getfield o : J
    //   663: aload #5
    //   665: getfield p : J
    //   668: aload #5
    //   670: getfield q : Z
    //   673: aload #5
    //   675: getfield r : Lg51;
    //   678: aload #5
    //   680: getfield s : I
    //   683: aload #5
    //   685: getfield u : J
    //   688: aload #5
    //   690: getfield v : I
    //   693: aload #5
    //   695: getfield w : I
    //   698: aload #5
    //   700: getfield x : Ljava/lang/String;
    //   703: aload #5
    //   705: getfield y : Ljava/lang/Boolean;
    //   708: ldc_w 524288
    //   711: invokespecial <init> : (Ljava/lang/String;Lo72;Ljava/lang/String;Ljava/lang/String;Ldu;Ldu;JJJLhr;ILqb;JJJJZLg51;IJIILjava/lang/String;Ljava/lang/Boolean;I)V
    //   714: putfield e : Ljava/lang/Object;
    //   717: aload #7
    //   719: areturn
  }
  
  public ColorStateList n(int paramInt) {
    TypedArray typedArray = (TypedArray)this.e;
    if (typedArray.hasValue(paramInt)) {
      int i = typedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = n21.y((Context)this.c, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return typedArray.getColorStateList(paramInt);
  }
  
  public Drawable o(int paramInt) {
    TypedArray typedArray = (TypedArray)this.e;
    if (typedArray.hasValue(paramInt)) {
      int i = typedArray.getResourceId(paramInt, 0);
      if (i != 0)
        return ws2.I((Context)this.c, i); 
    } 
    return typedArray.getDrawable(paramInt);
  }
  
  public Drawable p(int paramInt) {
    if (((TypedArray)this.e).hasValue(paramInt)) {
      paramInt = ((TypedArray)this.e).getResourceId(paramInt, 0);
      if (paramInt != 0) {
        y6 y6 = y6.a();
        synchronized ((Context)this.c) {
          Drawable drawable = y6.a.e(null, paramInt, true);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{y6}, name=null} */
          return drawable;
        } 
      } 
    } 
    return null;
  }
  
  public Typeface q(int paramInt1, int paramInt2, w7 paramw7) {
    paramInt1 = ((TypedArray)this.e).getResourceId(paramInt1, 0);
    if (paramInt1 != 0) {
      if ((TypedValue)this.f == null)
        this.f = new TypedValue(); 
      Context context = (Context)this.c;
      TypedValue typedValue = (TypedValue)this.f;
      ThreadLocal threadLocal = lg1.a;
      if (!context.isRestricted())
        return lg1.a(context, paramInt1, typedValue, paramInt2, paramw7, true, false); 
    } 
    return null;
  }
  
  public boolean w(int paramInt, fw0 paramfw0) {
    Object object = this.c;
    vo vo = (vo)this.f;
    if (paramfw0 != null) {
      fw0 fw01 = vo.o(object, paramfw0);
      paramfw0 = fw01;
      if (fw01 == null)
        return false; 
    } else {
      paramfw0 = null;
    } 
    paramInt = vo.p(paramInt, object);
    d7 d7 = (d7)this.e;
    if (d7.b != paramInt || !d12.a(d7.c, paramfw0))
      this.e = new d7((CopyOnWriteArrayList)vo.c.e, paramInt, paramfw0); 
    return true;
  }
  
  public void z() {
    ((TypedArray)this.e).recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */