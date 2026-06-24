import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import in.krosbits.musicolet.MyApplication;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import org.jaudiotagger.audio.mp3.VbriFrame;

public abstract class qz1 {
  public static final byte[] b = new byte[0];
  
  public static final ip2 c = (ip2)new Object();
  
  public static final boolean[] e = new boolean[3];
  
  public static final f1 f = new f1("NONE", 4);
  
  public static final f1 g = new f1(IGBYXeDFmKYajx.fqvBLhHaLVwh, 4);
  
  public static final Object h = new Object();
  
  public static boolean i;
  
  public static int j;
  
  public qz1() {
    new ConcurrentHashMap<Object, Object>();
  }
  
  public static String A(String paramString) {
    try {
      Process process = Runtime.getRuntime().exec("getprop ".concat(paramString));
      BufferedReader bufferedReader = new BufferedReader();
      InputStreamReader inputStreamReader = new InputStreamReader();
      this(process.getInputStream());
      this(inputStreamReader, 1024);
    } finally {
      paramString = null;
    } 
    if (paramString != null)
      try {
        paramString.close();
      } finally {
        paramString = null;
      }  
    return null;
  }
  
  public static int B(Context paramContext, int paramInt1, int paramInt2) {
    if (paramInt1 != 0) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt1, new int[] { paramInt2 });
      paramInt1 = typedArray.getColor(0, 0);
      typedArray.recycle();
      if (paramInt1 != 0)
        return paramInt1; 
    } 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(paramInt2, typedValue, true);
    return (typedValue.resourceId != 0) ? paramContext.getResources().getColor(typedValue.resourceId) : typedValue.data;
  }
  
  public static int C(Context paramContext, int paramInt) {
    TypedValue typedValue = new TypedValue();
    return paramContext.getTheme().resolveAttribute(paramInt, typedValue, true) ? typedValue.resourceId : 0;
  }
  
  public static boolean D() {
    boolean bool = TextUtils.isEmpty(A("ro.build.version.emui"));
    int i = bool ^ true;
    if (bool) {
      i = 0;
      try {
        MyApplication.i.getApplicationContext().getPackageManager().getPackageInfo("com.huawei.appmarket", 0);
        i = 1;
      } finally {
        Exception exception;
      } 
    } 
    return i;
  }
  
  public static boolean E(int paramInt, Object paramObject) {
    if (paramObject instanceof hd0) {
      byte b;
      if (paramObject instanceof id0) {
        b = ((id0)paramObject).b();
      } else if (paramObject instanceof lc0) {
        b = 0;
      } else if (paramObject instanceof wc0) {
        b = 1;
      } else if (paramObject instanceof ad0) {
        b = 2;
      } else if (paramObject instanceof bd0) {
        b = 3;
      } else if (paramObject instanceof cd0) {
        b = 4;
      } else if (paramObject instanceof r72) {
        b = 6;
      } else {
        b = -1;
      } 
      if (b == paramInt)
        return true; 
    } 
    return false;
  }
  
  public static boolean F(Context paramContext) {
    TypedValue typedValue = new TypedValue();
    return (paramContext.getTheme().resolveAttribute(2130969355, typedValue, true) && typedValue.data != 0);
  }
  
  public static boolean G() {
    return TextUtils.isEmpty(A("ro.miui.ui.version.name")) ^ true;
  }
  
  public static boolean I() {
    if (!"realme".equalsIgnoreCase(Build.MANUFACTURER) && !"realme".equalsIgnoreCase(Build.BRAND)) {
      String str = Build.MODEL;
      if (str == null || !str.toLowerCase().startsWith("realme"))
        return false; 
    } 
    return true;
  }
  
  public static final w41 J(hp2 paramhp2, String paramString, Executor paramExecutor, lc0 paramlc0) {
    l02 l02 = l02.a;
    paramhp2.getClass();
    paramExecutor.getClass();
    vz0 vz0 = new vz0(0);
    Object object = new Object();
    ((bi)object).c = (hg1)new Object();
    ei ei = new ei((bi)object);
    ((bi)object).b = ei;
    ((bi)object).a = x41.class;
    try {
      z20 z20 = new z20();
      this(paramhp2, paramString, paramlc0, vz0, object, 1);
      paramExecutor.execute(z20);
      ((bi)object).a = l02;
    } catch (Exception exception) {
      ei.c.j(exception);
    } 
    return (w41)new Object();
  }
  
  public static final void M(ni paramni, cs paramcs, boolean paramBoolean) {
    Object object1;
    Object object2;
    Object object3 = paramni.w();
    Throwable throwable = paramni.g(object3);
    if (throwable != null) {
      object1 = new qg1(throwable);
    } else {
      object1 = object1.h(object3);
    } 
    if (paramBoolean) {
      paramcs.getClass();
      paramcs = paramcs;
      object3 = ((xz)paramcs).g;
      object2 = ((xz)paramcs).i;
      os os = object3.e();
      Object object = wf2.m0(os, object2);
      if (object != wf2.o) {
        object2 = S((cs)object3, os, object);
      } else {
        object2 = null;
      } 
      try {
        object3.f(object1);
        return;
      } finally {
        if (object2 == null || object2.k0())
          wf2.X(os, object); 
      } 
    } 
    object2.f(object1);
  }
  
  public static boolean O(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte2 = b;
    byte[] arrayOfByte1 = paramArrayOfbyte1;
    if (paramArrayOfbyte1 == null)
      arrayOfByte1 = arrayOfByte2; 
    paramArrayOfbyte1 = paramArrayOfbyte2;
    if (paramArrayOfbyte2 == null)
      paramArrayOfbyte1 = arrayOfByte2; 
    int k = Math.min(arrayOfByte1.length, paramArrayOfbyte1.length);
    int j = Math.max(arrayOfByte1.length, paramArrayOfbyte1.length);
    byte b = 0;
    int i = 0;
    while (b < k) {
      i |= arrayOfByte1[b] ^ paramArrayOfbyte1[b];
      b++;
    } 
    return (i == 0 && k == j);
  }
  
  public static void P(Window paramWindow, boolean paramBoolean) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      n0.v(paramWindow, paramBoolean);
      return;
    } 
    if (i >= 30) {
      n0.u(paramWindow, paramBoolean);
      return;
    } 
    View view = paramWindow.getDecorView();
    i = view.getSystemUiVisibility();
    if (paramBoolean) {
      i &= 0xFFFFF8FF;
    } else {
      i |= 0x700;
    } 
    view.setSystemUiVisibility(i);
  }
  
  public static byte[] Q(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public static void R(String paramString, Object paramObject) {
    if (paramObject == null) {
      paramObject = "null";
    } else {
      paramObject = paramObject.getClass().getName();
    } 
    ClassCastException classCastException = new ClassCastException(x41.l((String)paramObject, " cannot be cast to ", paramString));
    ui0.W(classCastException, qz1.class.getName());
    throw classCastException;
  }
  
  public static final f02 S(cs paramcs, os paramos, Object paramObject) {
    boolean bool = paramcs instanceof zs;
    zs zs1 = null;
    zs zs2 = null;
    if (bool && paramos.l(g02.b) != null) {
      zs zs = (zs)paramcs;
      while (true) {
        if (zs instanceof yz) {
          zs = zs2;
          break;
        } 
        zs1 = zs.d();
        if (zs1 == null) {
          zs = zs2;
          break;
        } 
        zs = zs1;
        if (zs1 instanceof f02) {
          zs = zs1;
          break;
        } 
      } 
      zs1 = zs;
      if (zs != null) {
        zs.l0(paramos, paramObject);
        zs1 = zs;
      } 
    } 
    return (f02)zs1;
  }
  
  public static Class T(Class<int> paramClass) {
    Class<Void> clazz;
    if (paramClass == int.class)
      return Integer.class; 
    if (paramClass == float.class)
      return Float.class; 
    if (paramClass == byte.class)
      return Byte.class; 
    if (paramClass == double.class)
      return Double.class; 
    if (paramClass == long.class)
      return Long.class; 
    if (paramClass == char.class)
      return Character.class; 
    if (paramClass == boolean.class)
      return Boolean.class; 
    if (paramClass == short.class)
      return Short.class; 
    Class<int> clazz1 = paramClass;
    if (paramClass == void.class)
      clazz = Void.class; 
    return clazz;
  }
  
  public static void U(Object paramObject, StringWriter paramStringWriter) {
    if (paramObject == null) {
      paramStringWriter.write("null");
      return;
    } 
    if (paramObject instanceof String) {
      paramStringWriter.write(34);
      paramStringWriter.write(q((String)paramObject));
      paramStringWriter.write(34);
      return;
    } 
    if (paramObject instanceof Double) {
      Double double_ = (Double)paramObject;
      if (double_.isInfinite() || double_.isNaN()) {
        paramStringWriter.write("null");
        return;
      } 
      paramStringWriter.write(paramObject.toString());
      return;
    } 
    if (paramObject instanceof Float) {
      Float float_ = (Float)paramObject;
      if (float_.isInfinite() || float_.isNaN()) {
        paramStringWriter.write("null");
        return;
      } 
      paramStringWriter.write(paramObject.toString());
      return;
    } 
    if (paramObject instanceof Number) {
      paramStringWriter.write(paramObject.toString());
      return;
    } 
    if (paramObject instanceof Boolean) {
      paramStringWriter.write(paramObject.toString());
      return;
    } 
    if (paramObject instanceof pj0) {
      ((pj0)paramObject).d(paramStringWriter);
      return;
    } 
    if (paramObject instanceof nj0) {
      paramStringWriter.write(((nj0)paramObject).c());
      return;
    } 
    if (paramObject instanceof Map) {
      oj0.a((Map)paramObject, paramStringWriter);
      return;
    } 
    if (paramObject instanceof Collection) {
      mj0.e((Collection)paramObject, paramStringWriter);
      return;
    } 
    boolean bool = paramObject instanceof byte[];
    int j = 1;
    boolean bool3 = true;
    int i = 1;
    boolean bool7 = true;
    boolean bool6 = true;
    boolean bool1 = true;
    boolean bool5 = true;
    boolean bool4 = true;
    boolean bool2 = true;
    if (bool) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = bool2; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof short[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = j; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof int[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = bool3; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof long[]) {
      paramObject = paramObject;
      j = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      while (i < paramObject.length) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
        i++;
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof float[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = bool7; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof double[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = bool6; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof boolean[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      paramStringWriter.write(String.valueOf(paramObject[0]));
      for (i = bool1; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        paramStringWriter.write(String.valueOf(paramObject[i]));
      } 
      paramStringWriter.write("]");
      return;
    } 
    if (paramObject instanceof char[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[\"");
      paramStringWriter.write(q(String.valueOf(paramObject[0])));
      for (i = bool5; i < paramObject.length; i++) {
        paramStringWriter.write("\",\"");
        paramStringWriter.write(q(String.valueOf(paramObject[i])));
      } 
      paramStringWriter.write("\"]");
      return;
    } 
    if (paramObject instanceof Object[]) {
      paramObject = paramObject;
      i = mj0.b;
      if (paramObject.length == 0) {
        paramStringWriter.write("[]");
        return;
      } 
      paramStringWriter.write("[");
      U(paramObject[0], paramStringWriter);
      for (i = bool4; i < paramObject.length; i++) {
        paramStringWriter.write(",");
        U(paramObject[i], paramStringWriter);
      } 
      paramStringWriter.write("]");
      return;
    } 
    U(paramObject.toString(), paramStringWriter);
  }
  
  public static int V(int paramInt) {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  public static String W(hv2 paramhv2) {
    StringBuilder stringBuilder = new StringBuilder(paramhv2.e());
    for (byte b = 0; b < paramhv2.e(); b++) {
      byte b1 = paramhv2.c(b);
      if (b1 != 34) {
        if (b1 != 39) {
          if (b1 != 92) {
            switch (b1) {
              default:
                if (b1 >= 32 && b1 <= 126) {
                  stringBuilder.append((char)b1);
                  break;
                } 
                stringBuilder.append('\\');
                stringBuilder.append((char)((b1 >>> 6 & 0x3) + 48));
                stringBuilder.append((char)((b1 >>> 3 & 0x7) + 48));
                stringBuilder.append((char)((b1 & 0x7) + 48));
                break;
              case 13:
                stringBuilder.append("\\r");
                break;
              case 12:
                stringBuilder.append("\\f");
                break;
              case 11:
                stringBuilder.append("\\v");
                break;
              case 10:
                stringBuilder.append("\\n");
                break;
              case 9:
                stringBuilder.append("\\t");
                break;
              case 8:
                stringBuilder.append("\\b");
                break;
              case 7:
                stringBuilder.append("\\a");
                break;
            } 
          } else {
            stringBuilder.append("\\\\");
          } 
        } else {
          stringBuilder.append("\\'");
        } 
      } else {
        stringBuilder.append("\\\"");
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static void Y(int paramInt, Object paramObject) {
    if (paramObject != null)
      return; 
    paramObject = new StringBuilder(String.valueOf(paramInt).length() + 9);
    paramObject.append("at index ");
    paramObject.append(paramInt);
    throw new NullPointerException(paramObject.toString());
  }
  
  public static final ip1 b(Object paramObject) {
    return new ip1(paramObject);
  }
  
  public static final void c(g32 paramg32, j01 paramj01, wm0 paramwm0) {
    paramj01.getClass();
    paramwm0.getClass();
    ni1 ni1 = (ni1)paramg32.c("androidx.lifecycle.savedstate.vm.tag");
    if (ni1 != null && !ni1.e) {
      ni1.c(paramwm0, paramj01);
      pm0 pm0 = (pm0)paramwm0.i;
      if (pm0 == pm0.c || pm0.compareTo(pm0.f) >= 0) {
        paramj01.B();
        return;
      } 
      paramwm0.a(new fm0(paramwm0, paramj01));
      return;
    } 
  }
  
  public static void d(int paramInt, Object paramObject) {
    if (paramObject == null || E(paramInt, paramObject))
      return; 
    StringBuilder stringBuilder = new StringBuilder("kotlin.jvm.functions.Function");
    stringBuilder.append(paramInt);
    R(stringBuilder.toString(), paramObject);
    throw null;
  }
  
  public static int e(int paramInt) {
    if (paramInt <= 268435455 && paramInt >= 0)
      return paramInt * 8; 
    throw new RuntimeException("");
  }
  
  public static final void f(q72 paramq72, String paramString) {
    WorkDatabase workDatabase = paramq72.c;
    workDatabase.getClass();
    c82 c82 = workDatabase.v();
    gy gy = workDatabase.q();
    ArrayList arrayList = om.i0((Object[])new String[] { paramString });
    while (!arrayList.isEmpty()) {
      String str = (String)tm.m0(arrayList);
      o72 o72 = c82.a(str);
      if (o72 != o72.e && o72 != o72.f)
        ((Number)zo2.N(c82.a, false, true, new ey(str, 10))).intValue(); 
      arrayList.addAll(gy.a(str));
    } 
    ma1 ma1 = paramq72.f;
    ma1.getClass();
    synchronized (ma1.k) {
      qp0 qp0 = qp0.h();
      String str = ma1.l;
      StringBuilder stringBuilder = new StringBuilder();
      this("Processor cancelling ");
      stringBuilder.append(paramString);
      qp0.b(str, stringBuilder.toString());
      ma1.i.add(paramString);
      q82 q82 = ma1.b(paramString);
      ma1.d(paramString, q82, 1);
      Iterator<aj1> iterator = paramq72.e.iterator();
      while (iterator.hasNext())
        ((aj1)iterator.next()).a(paramString); 
      return;
    } 
  }
  
  public static void g(fr paramfr, ln0 paramln0, er paramer) {
    paramer.o = -1;
    bq bq1 = paramer.M;
    int[] arrayOfInt2 = paramer.p0;
    bq bq2 = paramer.L;
    bq bq4 = paramer.J;
    bq bq5 = paramer.K;
    bq bq3 = paramer.I;
    paramer.p = -1;
    int[] arrayOfInt1 = paramfr.p0;
    if (arrayOfInt1[0] != 2 && arrayOfInt2[0] == 4) {
      int i = bq3.g;
      int j = paramfr.o() - bq5.g;
      bq3.i = paramln0.k(bq3);
      bq5.i = paramln0.k(bq5);
      paramln0.d(bq3.i, i);
      paramln0.d(bq5.i, j);
      paramer.o = 2;
      paramer.Y = i;
      j -= i;
      paramer.U = j;
      i = paramer.b0;
      if (j < i)
        paramer.U = i; 
    } 
    if (arrayOfInt1[1] != 2 && arrayOfInt2[1] == 4) {
      int i = bq4.g;
      int j = paramfr.i() - bq2.g;
      bq4.i = paramln0.k(bq4);
      bq2.i = paramln0.k(bq2);
      paramln0.d(bq4.i, i);
      paramln0.d(bq2.i, j);
      if (paramer.a0 > 0 || paramer.g0 == 8) {
        pn1 pn1 = paramln0.k(bq1);
        bq1.i = pn1;
        paramln0.d(pn1, paramer.a0 + i);
      } 
      paramer.p = 2;
      paramer.Z = i;
      j -= i;
      paramer.V = j;
      i = paramer.c0;
      if (j < i)
        paramer.V = i; 
    } 
  }
  
  public static byte[] i(byte[]... paramVarArgs) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      int i = paramVarArgs.length;
      for (byte b = 0; b < i; b++)
        byteArrayOutputStream.write(paramVarArgs[b]); 
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException);
    } 
  }
  
  public static ContextThemeWrapper n(Context paramContext, boolean paramBoolean) {
    int i;
    if (!paramBoolean) {
      i = 2130969066;
    } else {
      i = 2130968623;
    } 
    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(paramContext, C(paramContext, i));
    if (C((Context)contextThemeWrapper, 2130969655) != 0) {
      if (F((Context)contextThemeWrapper)) {
        if (w((Context)contextThemeWrapper, 0) == -570425344) {
          i = 2131952414;
        } else {
          i = 2131952415;
        } 
      } else if (w((Context)contextThemeWrapper, 0) == -570425344) {
        i = 2131952416;
      } else {
        i = 2131952413;
      } 
      return new ContextThemeWrapper((Context)contextThemeWrapper, i);
    } 
    return contextThemeWrapper;
  }
  
  public static byte[] o(String paramString) {
    return (new zb(0)).b(paramString);
  }
  
  public static final boolean p(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) == paramInt2);
  }
  
  public static String q(String paramString) {
    if (paramString == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if (c != '\f') {
        if (c != '\r') {
          if (c != '"') {
            if (c != '\\') {
              switch (c) {
                default:
                  if ((c >= '\000' && c <= '\037') || (c >= '' && c <= '') || (c >= ' ' && c <= '⃿')) {
                    String str = Integer.toHexString(c);
                    stringBuilder.append("\\u");
                    for (byte b1 = 0; b1 < 4 - str.length(); b1++)
                      stringBuilder.append('0'); 
                    stringBuilder.append(str.toUpperCase());
                    break;
                  } 
                  stringBuilder.append(c);
                  break;
                case '\n':
                  stringBuilder.append("\\n");
                  break;
                case '\t':
                  stringBuilder.append("\\t");
                  break;
                case '\b':
                  stringBuilder.append("\\b");
                  break;
              } 
            } else {
              stringBuilder.append("\\\\");
            } 
          } else {
            stringBuilder.append(eRUgfgGAccgka.gBBjRE);
          } 
        } else {
          stringBuilder.append("\\r");
        } 
      } else {
        stringBuilder.append("\\f");
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static ha0 r(ha0[] paramArrayOfha0, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iand
    //   3: ifne -> 13
    //   6: sipush #400
    //   9: istore_2
    //   10: goto -> 17
    //   13: sipush #700
    //   16: istore_2
    //   17: iload_1
    //   18: iconst_2
    //   19: iand
    //   20: ifeq -> 29
    //   23: iconst_1
    //   24: istore #7
    //   26: goto -> 32
    //   29: iconst_0
    //   30: istore #7
    //   32: aload_0
    //   33: arraylength
    //   34: istore #6
    //   36: aconst_null
    //   37: astore #8
    //   39: ldc_w 2147483647
    //   42: istore_3
    //   43: iconst_0
    //   44: istore_1
    //   45: iload_1
    //   46: iload #6
    //   48: if_icmpge -> 127
    //   51: aload_0
    //   52: iload_1
    //   53: aaload
    //   54: astore #9
    //   56: aload #9
    //   58: getfield c : I
    //   61: iload_2
    //   62: isub
    //   63: invokestatic abs : (I)I
    //   66: istore #5
    //   68: aload #9
    //   70: getfield d : Z
    //   73: iload #7
    //   75: if_icmpne -> 84
    //   78: iconst_0
    //   79: istore #4
    //   81: goto -> 87
    //   84: iconst_1
    //   85: istore #4
    //   87: iload #5
    //   89: iconst_2
    //   90: imul
    //   91: iload #4
    //   93: iadd
    //   94: istore #5
    //   96: aload #8
    //   98: ifnull -> 110
    //   101: iload_3
    //   102: istore #4
    //   104: iload_3
    //   105: iload #5
    //   107: if_icmple -> 118
    //   110: aload #9
    //   112: astore #8
    //   114: iload #5
    //   116: istore #4
    //   118: iinc #1, 1
    //   121: iload #4
    //   123: istore_3
    //   124: goto -> 45
    //   127: aload #8
    //   129: areturn
  }
  
  public static final os s(os paramos1, os paramos2, boolean paramBoolean) {
    Object object;
    Boolean bool1 = Boolean.FALSE;
    paramBoolean = ((Boolean)paramos1.h(bool1, new on(2))).booleanValue();
    boolean bool = ((Boolean)paramos2.h(bool1, new on(2))).booleanValue();
    if (!paramBoolean && !bool)
      return paramos1.k(paramos2); 
    on on = new on(3);
    b40 b40 = b40.b;
    os os1 = (os)paramos1.h(b40, on);
    paramos1 = paramos2;
    if (bool)
      object = paramos2.h(b40, new on(4)); 
    return os1.k((os)object);
  }
  
  public static final rs t(Executor paramExecutor) {
    return new c60(paramExecutor);
  }
  
  public static byte[] u(int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    byteBuffer.putInt(paramInt);
    return byteBuffer.array();
  }
  
  public static Cipher v(String paramString) {
    try {
      return Cipher.getInstance(paramString);
    } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException noSuchAlgorithmException) {
      throw new Exception(noSuchAlgorithmException.toString(), noSuchAlgorithmException);
    } catch (NoSuchProviderException noSuchProviderException) {
      throw new Exception("", noSuchProviderException);
    } 
  }
  
  public static int w(Context paramContext, int paramInt) {
    return (jn.d(-1, B(paramContext, paramInt, 2130968930)) >= 3.0D) ? -1 : -570425344;
  }
  
  public static float x(Context paramContext) {
    TypedValue typedValue = new TypedValue();
    return paramContext.getTheme().resolveAttribute(16842803, typedValue, true) ? typedValue.getFloat() : 0.5F;
  }
  
  public static HashSet y() {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #6
    //   9: ldc_w '(?i).*vold.*(vfat|ntfs|exfat|fat32|ext3|ext4|f2fs|fuseblk).*rw.*'
    //   12: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   15: astore #5
    //   17: new java/util/ArrayList
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore #7
    //   26: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   29: ldc_w 'mount'
    //   32: invokevirtual exec : (Ljava/lang/String;)Ljava/lang/Process;
    //   35: astore #9
    //   37: new java/io/BufferedReader
    //   40: astore #8
    //   42: new java/io/InputStreamReader
    //   45: astore #10
    //   47: aload #10
    //   49: aload #9
    //   51: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   54: invokespecial <init> : (Ljava/io/InputStream;)V
    //   57: aload #8
    //   59: aload #10
    //   61: invokespecial <init> : (Ljava/io/Reader;)V
    //   64: aload #8
    //   66: invokevirtual readLine : ()Ljava/lang/String;
    //   69: astore #10
    //   71: aload #10
    //   73: ifnull -> 92
    //   76: aload #7
    //   78: aload #10
    //   80: invokevirtual add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: goto -> 64
    //   87: astore #8
    //   89: goto -> 105
    //   92: aload #8
    //   94: invokevirtual close : ()V
    //   97: aload #9
    //   99: invokevirtual destroy : ()V
    //   102: goto -> 110
    //   105: aload #8
    //   107: invokevirtual printStackTrace : ()V
    //   110: aload #7
    //   112: invokevirtual size : ()I
    //   115: istore_3
    //   116: iconst_0
    //   117: istore_0
    //   118: iload_0
    //   119: iload_3
    //   120: if_icmpge -> 249
    //   123: aload #7
    //   125: iload_0
    //   126: invokevirtual get : (I)Ljava/lang/Object;
    //   129: astore #8
    //   131: iload_0
    //   132: iconst_1
    //   133: iadd
    //   134: istore_2
    //   135: aload #8
    //   137: checkcast java/lang/String
    //   140: astore #8
    //   142: iload_2
    //   143: istore_0
    //   144: aload #8
    //   146: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   149: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   152: ldc_w 'asec'
    //   155: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   158: ifne -> 118
    //   161: iload_2
    //   162: istore_0
    //   163: aload #5
    //   165: aload #8
    //   167: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   170: invokevirtual matches : ()Z
    //   173: ifeq -> 118
    //   176: aload #8
    //   178: ldc_w ' '
    //   181: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   184: astore #8
    //   186: aload #8
    //   188: arraylength
    //   189: istore #4
    //   191: iconst_0
    //   192: istore_1
    //   193: iload_2
    //   194: istore_0
    //   195: iload_1
    //   196: iload #4
    //   198: if_icmpge -> 118
    //   201: aload #8
    //   203: iload_1
    //   204: aaload
    //   205: astore #9
    //   207: aload #9
    //   209: ldc_w '/'
    //   212: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   215: ifeq -> 243
    //   218: aload #9
    //   220: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   223: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   226: ldc_w 'vold'
    //   229: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   232: ifne -> 243
    //   235: aload #6
    //   237: aload #9
    //   239: invokevirtual add : (Ljava/lang/Object;)Z
    //   242: pop
    //   243: iinc #1, 1
    //   246: goto -> 193
    //   249: aload #6
    //   251: areturn
    // Exception table:
    //   from	to	target	type
    //   26	64	87	java/lang/Exception
    //   64	71	87	java/lang/Exception
    //   76	84	87	java/lang/Exception
    //   92	102	87	java/lang/Exception
  }
  
  public static Object z(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte4;
    byte[] arrayOfByte3;
    byte[] arrayOfByte2;
    byte[] arrayOfByte1;
    String[] arrayOfString = n21.d;
    String str4 = arrayOfString[2];
    byte b = 0;
    String str5 = null;
    if (str4 == null) {
      str4 = null;
    } else {
      arrayOfByte4 = Base64.decode(str4, 0);
    } 
    Class<?> clazz1 = Class.forName(new String(arrayOfByte4));
    String str3 = arrayOfString[3];
    if (str3 == null) {
      str3 = null;
    } else {
      arrayOfByte3 = Base64.decode(str3, 0);
    } 
    Method method2 = clazz1.getMethod(new String(arrayOfByte3), new Class[] { String.class });
    String str2 = arrayOfString[4];
    if (str2 == null) {
      str2 = null;
    } else {
      arrayOfByte2 = Base64.decode(str2, 0);
    } 
    Object object = method2.invoke(null, new Object[] { new String(arrayOfByte2) });
    Class<?> clazz2 = object.getClass();
    String str1 = arrayOfString[5];
    if (str1 == null) {
      str1 = str5;
    } else {
      arrayOfByte1 = Base64.decode(str1, 0);
    } 
    Method method1 = clazz2.getMethod(new String(arrayOfByte1), new Class[] { byte[].class });
    zq0 zq0 = br0.d;
    int i = 0;
    while (b < paramArrayOfbyte.length) {
      i += paramArrayOfbyte[b];
      b++;
    } 
    VbriFrame.setVersion(i);
    return method1.invoke(object, new Object[] { paramArrayOfbyte });
  }
  
  public abstract View K(int paramInt);
  
  public abstract boolean L();
  
  public abstract Typeface j(Context paramContext, ea0 paramea0, Resources paramResources, int paramInt);
  
  public abstract Typeface k(Context paramContext, ha0[] paramArrayOfha0, int paramInt);
  
  public Typeface l(Context paramContext, List paramList, int paramInt) {
    throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
  }
  
  public Typeface m(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    File file = g92.J(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = g92.u(file, paramResources, paramInt1);
      if (!bool)
        return null; 
      return Typeface.createFromFile(file.getPath());
    } catch (RuntimeException runtimeException) {
      return null;
    } finally {
      file.delete();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */