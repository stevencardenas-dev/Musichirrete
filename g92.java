import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.window.ldG.XUaAMlaMSa;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.button.MaterialButton;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.utils.SgV.zpEN;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public abstract class g92 {
  public static final float[][] a = new float[][] { { 0.401288F, 0.650173F, -0.051461F }, { -0.250268F, 1.204414F, 0.045854F }, { -0.002079F, 0.048952F, 0.953127F } };
  
  public static final float[][] b = new float[][] { { 1.8620678F, -1.0112547F, 0.14918678F }, { 0.38752654F, 0.62144744F, -0.00897398F }, { -0.0158415F, -0.03412294F, 1.0499644F } };
  
  public static final float[] c = new float[] { 95.047F, 100.0F, 108.883F };
  
  public static final float[][] d = new float[][] { { 0.41233894F, 0.35762063F, 0.18051042F }, { 0.2126F, 0.7152F, 0.0722F }, { 0.01932141F, 0.11916382F, 0.9503448F } };
  
  public static final Type[] e = new Type[0];
  
  public static final int[] f = new int[] { 5000, 7500, 9000, 10000, 12500, 15000, 20000 };
  
  public static final int[] g = new int[] { 2130968930 };
  
  public static final int[] h = new int[] { 2130968938 };
  
  public static final u70 i;
  
  public static final u70 j;
  
  public static final u70 k;
  
  public static final u70 l;
  
  public static final u70[] m;
  
  static {
    u70 u705 = new u70("client_side_logging", -1, 1L, true);
    u70 u703 = new u70("cxless_client_minimal", -1, 1L, true);
    i = u703;
    u70 u701 = new u70(jHxlGgUTadw.LSg, -1, 1L, true);
    u70 u708 = new u70("module_flag_control", -1, 1L, true);
    j = u708;
    u70 u702 = new u70("discovery_hint_supply", -1, 1L, true);
    u70 u704 = new u70("relay_casting_set_active_account", -1, 1L, true);
    u70 u706 = new u70("analytics_proto_enum_translation", -1, 1L, true);
    k = u706;
    u70 u707 = new u70("integer_to_integer_map", -1, 1L, true);
    l = u707;
    m = new u70[] { 
        u705, u703, u701, u708, u702, u704, u706, u707, new u70("relay_casting_set_remote_casting_mode", -1, 1L, true), new u70("get_relay_access_token", -1, 1L, true), 
        new u70("get_cast_settings", -1, 1L, true), new u70("set_bundle_setting", -1, 1L, true), new u70("get_client_updated_info", -1, 1L, true), new u70("device_suggestions", -1, 1L, true) };
  }
  
  public static boolean A(Type paramType1, Type paramType2) {
    if (paramType1 == paramType2)
      return true; 
    if (paramType1 instanceof Class)
      return paramType1.equals(paramType2); 
    if (paramType1 instanceof ParameterizedType) {
      if (!(paramType2 instanceof ParameterizedType))
        return false; 
      paramType1 = paramType1;
      paramType2 = paramType2;
      return (Objects.equals(paramType1.getOwnerType(), paramType2.getOwnerType()) && paramType1.getRawType().equals(paramType2.getRawType()) && Arrays.equals((Object[])paramType1.getActualTypeArguments(), (Object[])paramType2.getActualTypeArguments()));
    } 
    if (paramType1 instanceof GenericArrayType) {
      if (!(paramType2 instanceof GenericArrayType))
        return false; 
      paramType1 = paramType1;
      paramType2 = paramType2;
      return A(paramType1.getGenericComponentType(), paramType2.getGenericComponentType());
    } 
    if (paramType1 instanceof WildcardType) {
      if (!(paramType2 instanceof WildcardType))
        return false; 
      paramType1 = paramType1;
      paramType2 = paramType2;
      return (Arrays.equals((Object[])paramType1.getUpperBounds(), (Object[])paramType2.getUpperBounds()) && Arrays.equals((Object[])paramType1.getLowerBounds(), (Object[])paramType2.getLowerBounds()));
    } 
    if (paramType1 instanceof java.lang.reflect.TypeVariable) {
      if (!(paramType2 instanceof java.lang.reflect.TypeVariable))
        return false; 
      paramType1 = paramType1;
      paramType2 = paramType2;
      if (Objects.equals(paramType1.getGenericDeclaration(), paramType2.getGenericDeclaration()) && paramType1.getName().equals(paramType2.getName()))
        return true; 
    } 
    return false;
  }
  
  public static boolean B(Context paramContext, Uri paramUri) {
    Cursor cursor1;
    ContentResolver contentResolver = paramContext.getContentResolver();
    boolean bool = false;
    Cursor cursor2 = null;
    paramContext = null;
    try {
      Cursor cursor = contentResolver.query(paramUri, new String[] { "document_id" }, null, null, null);
      cursor1 = cursor;
      cursor2 = cursor;
      int i = cursor.getCount();
      if (i > 0)
        bool = true; 
      r(cursor);
      return bool;
    } catch (Exception exception) {
      cursor1 = cursor2;
      StringBuilder stringBuilder = new StringBuilder();
      cursor1 = cursor2;
      this("Failed query: ");
      cursor1 = cursor2;
      stringBuilder.append(exception);
      cursor1 = cursor2;
      Log.w("DocumentFile", stringBuilder.toString());
      r(cursor2);
      return false;
    } finally {}
    r(cursor1);
    throw paramUri;
  }
  
  public static du2 C(Exception paramException) {
    du2 du2 = new du2();
    du2.h(paramException);
    return du2;
  }
  
  public static Type D(Type<? super Object> paramType, Class<Object> paramClass1, Class<? super Object> paramClass2) {
    if (paramClass2 == paramClass1)
      return paramType; 
    if (paramClass2.isInterface())
      for (Class<?> clazz : paramClass1.getInterfaces()) {
        if (clazz == paramClass2)
          return paramClass1.getGenericInterfaces()[null]; 
        if (paramClass2.isAssignableFrom(clazz))
          return D(paramClass1.getGenericInterfaces()[null], null[null], paramClass2); 
      }  
    if (!paramClass1.isInterface())
      while (paramClass1 != Object.class) {
        paramType = paramClass1.getSuperclass();
        if (paramType == paramClass2)
          return paramClass1.getGenericSuperclass(); 
        if (paramClass2.isAssignableFrom((Class<?>)paramType))
          return D(paramClass1.getGenericSuperclass(), (Class)paramType, paramClass2); 
        Type<? super Object> type = paramType;
      }  
    return paramClass2;
  }
  
  public static final rm0 E(um0 paramum0) {
    paramum0.getClass();
    wm0 wm0 = paramum0.N();
    wm0.getClass();
    gh1 gh1 = (gh1)wm0.g;
    label12: while (true) {
      rm0 rm02 = ((AtomicReference<rm0>)gh1.c).get();
      if (rm02 != null)
        return rm02; 
      xj0 xj0 = new xj0(null);
      yw yw = e00.a;
      rm0 rm01 = new rm0(wm0, dd1.f0(xj0, fr0.a.g));
      AtomicReference<rm0> atomicReference = (AtomicReference)gh1.c;
      while (true) {
        if (atomicReference.compareAndSet(null, rm01)) {
          yw yw1 = e00.a;
          qv.L(rm01, fr0.a.g, null, new qm0(rm01, null, 0), 2);
          return rm01;
        } 
        if (atomicReference.get() != null)
          continue label12; 
      } 
      break;
    } 
  }
  
  public static final ni F(cs paramcs) {
    if (!(paramcs instanceof xz))
      return new ni(1, paramcs); 
    ni ni = ((xz)paramcs).n();
    if (ni != null) {
      if (!ni.F())
        ni = null; 
      if (ni != null)
        return ni; 
    } 
    return new ni(2, paramcs);
  }
  
  public static Class G(Type paramType) {
    String str;
    if (paramType instanceof Class)
      return (Class)paramType; 
    if (paramType instanceof ParameterizedType)
      return (Class)((ParameterizedType)paramType).getRawType(); 
    if (paramType instanceof GenericArrayType)
      return Array.newInstance(G(((GenericArrayType)paramType).getGenericComponentType()), 0).getClass(); 
    if (paramType instanceof java.lang.reflect.TypeVariable)
      return Object.class; 
    if (paramType instanceof WildcardType)
      return G(((WildcardType)paramType).getUpperBounds()[0]); 
    if (paramType == null) {
      str = "null";
    } else {
      str = paramType.getClass().getName();
    } 
    tp.h("Expected a Class, ParameterizedType, or GenericArrayType, but <", paramType, "> is of type ", str);
    return null;
  }
  
  public static final ek1 H(Object paramObject) {
    if (paramObject != zo2.b)
      return (ek1)paramObject; 
    tp.f("Does not contain segment");
    return null;
  }
  
  public static Type I(Type paramType, Class<?> paramClass1, Class paramClass2) {
    Type type = paramType;
    if (paramType instanceof WildcardType)
      type = ((WildcardType)paramType).getUpperBounds()[0]; 
    if (paramClass2.isAssignableFrom(paramClass1))
      return Z(type, paramClass1, D(type, paramClass1, paramClass2), new HashMap<Object, Object>()); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramClass1);
    stringBuilder.append(" is not the same as or a subtype of ");
    stringBuilder.append(paramClass2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static File J(Context paramContext) {
    File file = paramContext.getCacheDir();
    if (file == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder(".font");
    stringBuilder.append(Process.myPid());
    stringBuilder.append("-");
    stringBuilder.append(Process.myTid());
    stringBuilder.append("-");
    String str = stringBuilder.toString();
    byte b = 0;
    while (true) {
      if (b < 100) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(b);
        File file1 = new File(file, stringBuilder1.toString());
        try {
          boolean bool = file1.createNewFile();
          if (bool)
            return file1; 
        } catch (IOException iOException) {}
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public static final void K(os paramos, Throwable paramThrowable) {
    for (q4 q4 : ss.a) {
      try {
        q4.m(paramThrowable);
      } finally {
        Throwable throwable;
        q4 = null;
        if (paramThrowable == q4) {
          throwable = paramThrowable;
        } else {
          throwable = new RuntimeException("Exception while trying to handle coroutine exception", throwable);
          dd1.a(throwable, paramThrowable);
        } 
        Thread thread1 = Thread.currentThread();
      } 
    } 
    try {
      oy oy = new oy();
      this(paramos);
      dd1.a(paramThrowable, oy);
    } finally {}
    Thread thread = Thread.currentThread();
    thread.getUncaughtExceptionHandler().uncaughtException(thread, paramThrowable);
  }
  
  public static int L(float paramFloat) {
    float f1;
    boolean bool;
    if (paramFloat < 1.0F)
      return -16777216; 
    if (paramFloat > 99.0F)
      return -1; 
    float f3 = (paramFloat + 16.0F) / 116.0F;
    if (paramFloat > 8.0F) {
      paramFloat = f3 * f3 * f3;
    } else {
      paramFloat /= 903.2963F;
    } 
    float f2 = f3 * f3 * f3;
    if (f2 > 0.008856452F) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      f1 = f2;
    } else {
      f1 = (f3 * 116.0F - 16.0F) / 903.2963F;
    } 
    if (!bool)
      f2 = (f3 * 116.0F - 16.0F) / 903.2963F; 
    float[] arrayOfFloat = c;
    return jn.b((f1 * arrayOfFloat[0]), (paramFloat * arrayOfFloat[1]), (f2 * arrayOfFloat[2]));
  }
  
  public static final k00 M(vj0 paramvj0, boolean paramBoolean, yj0 paramyj0) {
    aj0 aj0;
    if (paramvj0 instanceof dk0)
      return ((dk0)paramvj0).M(paramBoolean, paramyj0); 
    boolean bool = paramyj0.r();
    xi0 xi0 = new xi0(1, paramyj0, yj0.class, zpEN.TWfesW, "invoke(Ljava/lang/Throwable;)V", 0, 0, 1);
    dk0 dk0 = (dk0)paramvj0;
    if (bool) {
      zi0 zi0 = new zi0(xi0);
    } else {
      aj0 = new aj0(xi0);
    } 
    return dk0.M(paramBoolean, aj0);
  }
  
  public static final boolean N(Object paramObject) {
    return (paramObject == zo2.b);
  }
  
  public static final boolean O(gu paramgu, int paramInt1, int paramInt2) {
    paramgu.getClass();
    if (paramInt1 > paramInt2 && paramgu.k)
      return false; 
    Set set = paramgu.l;
    return (paramgu.j && (set == null || !set.contains(Integer.valueOf(paramInt1))));
  }
  
  public static boolean P() {
    return MyApplication.o().getBoolean("k_b_usmpspm", true);
  }
  
  public static float Q(int paramInt) {
    float f = paramInt / 255.0F;
    if (f <= 0.04045F) {
      f /= 12.92F;
      return f * 100.0F;
    } 
    f = (float)Math.pow(((f + 0.055F) / 1.055F), 2.4000000953674316D);
    return f * 100.0F;
  }
  
  public static MappedByteBuffer R(Context paramContext, Uri paramUri) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(paramUri, "r", null);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null) {
          parcelFileDescriptor.close();
          return null;
        } 
      } else {
        Exception exception;
        try {
          FileInputStream fileInputStream = new FileInputStream();
          this(parcelFileDescriptor.getFileDescriptor());
          try {
            FileChannel fileChannel = fileInputStream.getChannel();
            long l = fileChannel.size();
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, l);
            fileInputStream.close();
            parcelFileDescriptor.close();
            return mappedByteBuffer;
          } finally {}
        } finally {}
        try {
          paramUri.close();
        } finally {
          paramUri = null;
        } 
      } 
    } catch (IOException iOException) {}
    return null;
  }
  
  public static TypedArray S(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    m(paramContext, paramAttributeSet, paramInt1, paramInt2);
    o(paramContext, paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2, paramVarArgs1);
    return paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint1, paramInt1, paramInt2);
  }
  
  public static nk0 T(tk0 paramtk0) {
    boolean bool;
    try {
      paramtk0.C();
      bool = false;
      try {
        ok0.a.getClass();
        return ok0.d(paramtk0);
      } catch (EOFException eOFException) {}
    } catch (EOFException eOFException) {
      bool = true;
    } catch (gr0 gr0) {
      throw new RuntimeException(gr0);
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } catch (NumberFormatException numberFormatException) {
      throw new RuntimeException(numberFormatException);
    } 
    if (bool)
      return qk0.b; 
    throw new RuntimeException(numberFormatException);
  }
  
  public static void U(AnimatorSet paramAnimatorSet, ArrayList<Animator> paramArrayList) {
    int i = paramArrayList.size();
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      Animator animator = paramArrayList.get(b);
      long l1 = animator.getStartDelay();
      l = Math.max(l, animator.getDuration() + l1);
    } 
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { 0, 0 });
    valueAnimator.setDuration(l);
    paramArrayList.add(0, valueAnimator);
    paramAnimatorSet.playTogether(paramArrayList);
  }
  
  public static long V(Context paramContext, Uri paramUri, String paramString, long paramLong) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    Cursor cursor = null;
    paramContext = null;
    try {
      Cursor cursor2 = contentResolver.query(paramUri, new String[] { paramString }, null, null, null);
      Cursor cursor1 = cursor2;
      cursor = cursor2;
      if (cursor2.moveToFirst()) {
        cursor1 = cursor2;
        cursor = cursor2;
        if (!cursor2.isNull(0)) {
          cursor1 = cursor2;
          cursor = cursor2;
          long l = cursor2.getLong(0);
          r(cursor2);
          return l;
        } 
      } 
    } catch (Exception exception) {
    
    } finally {}
    r((Cursor)paramUri);
    return paramLong;
  }
  
  public static String W(Context paramContext, Uri paramUri, String paramString) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      Cursor cursor2 = contentResolver.query(paramUri, new String[] { paramString }, null, null, null);
      Cursor cursor1 = cursor2;
      try {
        if (cursor2.moveToFirst()) {
          cursor1 = cursor2;
          if (!cursor2.isNull(0)) {
            cursor1 = cursor2;
            paramString = cursor2.getString(0);
            return paramString;
          } 
        } 
      } catch (Exception exception) {
      
      } finally {}
      return null;
    } catch (Exception exception) {
      paramUri = null;
      Uri uri = paramUri;
      StringBuilder stringBuilder = new StringBuilder();
      uri = paramUri;
      this("Failed query: ");
      uri = paramUri;
      stringBuilder.append(exception);
      uri = paramUri;
      Log.w("DocumentFile", stringBuilder.toString());
      return null;
    } finally {
      paramUri = null;
    } 
    r((Cursor)contentResolver);
    throw paramUri;
  }
  
  public static Rect X(Rect paramRect1, Rect paramRect2) {
    return new Rect(paramRect1.left + paramRect2.left, paramRect1.top + paramRect2.top, paramRect1.right + paramRect2.right, paramRect1.bottom + paramRect2.bottom);
  }
  
  public static TypedValue Y(Context paramContext, int paramInt) {
    TypedValue typedValue = new TypedValue();
    return paramContext.getTheme().resolveAttribute(paramInt, typedValue, true) ? typedValue : null;
  }
  
  public static Type Z(Type paramType1, Class paramClass, Type paramType2, HashMap paramHashMap) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #9
    //   3: aload_2
    //   4: astore #11
    //   6: aload #11
    //   8: instanceof java/lang/reflect/TypeVariable
    //   11: istore #8
    //   13: iconst_0
    //   14: istore #6
    //   16: iconst_0
    //   17: istore #4
    //   19: iload #8
    //   21: ifeq -> 213
    //   24: aload #11
    //   26: checkcast java/lang/reflect/TypeVariable
    //   29: astore #12
    //   31: aload_3
    //   32: aload #12
    //   34: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: checkcast java/lang/reflect/Type
    //   40: astore_2
    //   41: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   44: astore #10
    //   46: aload_2
    //   47: ifnull -> 61
    //   50: aload_2
    //   51: aload #10
    //   53: if_acmpne -> 59
    //   56: aload #11
    //   58: areturn
    //   59: aload_2
    //   60: areturn
    //   61: aload_3
    //   62: aload #12
    //   64: aload #10
    //   66: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: aload #9
    //   72: astore #10
    //   74: aload #9
    //   76: ifnonnull -> 83
    //   79: aload #12
    //   81: astore #10
    //   83: aload #12
    //   85: invokeinterface getGenericDeclaration : ()Ljava/lang/reflect/GenericDeclaration;
    //   90: astore_2
    //   91: aload_2
    //   92: instanceof java/lang/Class
    //   95: ifeq -> 106
    //   98: aload_2
    //   99: checkcast java/lang/Class
    //   102: astore_2
    //   103: goto -> 108
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_2
    //   109: ifnonnull -> 115
    //   112: goto -> 190
    //   115: aload_0
    //   116: aload_1
    //   117: aload_2
    //   118: invokestatic D : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    //   121: astore #9
    //   123: aload #9
    //   125: instanceof java/lang/reflect/ParameterizedType
    //   128: ifeq -> 190
    //   131: aload_2
    //   132: invokevirtual getTypeParameters : ()[Ljava/lang/reflect/TypeVariable;
    //   135: astore_2
    //   136: aload_2
    //   137: arraylength
    //   138: istore #5
    //   140: iload #4
    //   142: iload #5
    //   144: if_icmpge -> 182
    //   147: aload #12
    //   149: aload_2
    //   150: iload #4
    //   152: aaload
    //   153: invokevirtual equals : (Ljava/lang/Object;)Z
    //   156: ifeq -> 176
    //   159: aload #9
    //   161: checkcast java/lang/reflect/ParameterizedType
    //   164: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
    //   169: iload #4
    //   171: aaload
    //   172: astore_2
    //   173: goto -> 193
    //   176: iinc #4, 1
    //   179: goto -> 140
    //   182: new java/util/NoSuchElementException
    //   185: dup
    //   186: invokespecial <init> : ()V
    //   189: athrow
    //   190: aload #12
    //   192: astore_2
    //   193: aload #10
    //   195: astore #9
    //   197: aload_2
    //   198: astore #11
    //   200: aload_2
    //   201: aload #12
    //   203: if_acmpne -> 6
    //   206: aload #10
    //   208: astore #12
    //   210: goto -> 736
    //   213: aload #11
    //   215: instanceof java/lang/Class
    //   218: ifeq -> 283
    //   221: aload #11
    //   223: checkcast java/lang/Class
    //   226: astore_2
    //   227: aload_2
    //   228: invokevirtual isArray : ()Z
    //   231: ifeq -> 283
    //   234: aload_2
    //   235: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   238: astore #10
    //   240: aload_0
    //   241: aload_1
    //   242: aload #10
    //   244: aload_3
    //   245: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   248: astore_0
    //   249: aload #10
    //   251: aload_0
    //   252: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   255: ifeq -> 265
    //   258: aload #9
    //   260: astore #12
    //   262: goto -> 736
    //   265: new ye0
    //   268: dup
    //   269: aload_0
    //   270: invokespecial <init> : (Ljava/lang/reflect/Type;)V
    //   273: astore_0
    //   274: aload #9
    //   276: astore #12
    //   278: aload_0
    //   279: astore_2
    //   280: goto -> 736
    //   283: aload #11
    //   285: instanceof java/lang/reflect/GenericArrayType
    //   288: ifeq -> 342
    //   291: aload #11
    //   293: checkcast java/lang/reflect/GenericArrayType
    //   296: astore_2
    //   297: aload_2
    //   298: invokeinterface getGenericComponentType : ()Ljava/lang/reflect/Type;
    //   303: astore #10
    //   305: aload_0
    //   306: aload_1
    //   307: aload #10
    //   309: aload_3
    //   310: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   313: astore_0
    //   314: aload #10
    //   316: aload_0
    //   317: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   320: ifeq -> 330
    //   323: aload #9
    //   325: astore #12
    //   327: goto -> 736
    //   330: new ye0
    //   333: dup
    //   334: aload_0
    //   335: invokespecial <init> : (Ljava/lang/reflect/Type;)V
    //   338: astore_0
    //   339: goto -> 274
    //   342: aload #11
    //   344: instanceof java/lang/reflect/ParameterizedType
    //   347: ifeq -> 524
    //   350: aload #11
    //   352: checkcast java/lang/reflect/ParameterizedType
    //   355: astore #11
    //   357: aload #11
    //   359: invokeinterface getOwnerType : ()Ljava/lang/reflect/Type;
    //   364: astore_2
    //   365: aload_0
    //   366: aload_1
    //   367: aload_2
    //   368: aload_3
    //   369: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   372: astore #13
    //   374: aload #13
    //   376: aload_2
    //   377: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   380: istore #8
    //   382: aload #11
    //   384: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
    //   389: astore #10
    //   391: aload #10
    //   393: arraylength
    //   394: istore #7
    //   396: iconst_0
    //   397: istore #4
    //   399: iload #6
    //   401: iload #7
    //   403: if_icmpge -> 482
    //   406: aload_0
    //   407: aload_1
    //   408: aload #10
    //   410: iload #6
    //   412: aaload
    //   413: aload_3
    //   414: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   417: astore #12
    //   419: iload #4
    //   421: istore #5
    //   423: aload #10
    //   425: astore_2
    //   426: aload #12
    //   428: aload #10
    //   430: iload #6
    //   432: aaload
    //   433: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   436: ifne -> 469
    //   439: iload #4
    //   441: istore #5
    //   443: aload #10
    //   445: astore_2
    //   446: iload #4
    //   448: ifne -> 463
    //   451: aload #10
    //   453: invokevirtual clone : ()Ljava/lang/Object;
    //   456: checkcast [Ljava/lang/reflect/Type;
    //   459: astore_2
    //   460: iconst_1
    //   461: istore #5
    //   463: aload_2
    //   464: iload #6
    //   466: aload #12
    //   468: aastore
    //   469: iinc #6, 1
    //   472: iload #5
    //   474: istore #4
    //   476: aload_2
    //   477: astore #10
    //   479: goto -> 399
    //   482: iload #8
    //   484: ifeq -> 499
    //   487: aload #9
    //   489: astore #12
    //   491: aload #11
    //   493: astore_2
    //   494: iload #4
    //   496: ifeq -> 736
    //   499: new ze0
    //   502: dup
    //   503: aload #13
    //   505: aload #11
    //   507: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
    //   512: checkcast java/lang/Class
    //   515: aload #10
    //   517: invokespecial <init> : (Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V
    //   520: astore_0
    //   521: goto -> 274
    //   524: aload #9
    //   526: astore #12
    //   528: aload #11
    //   530: astore_2
    //   531: aload #11
    //   533: instanceof java/lang/reflect/WildcardType
    //   536: ifeq -> 736
    //   539: aload #11
    //   541: checkcast java/lang/reflect/WildcardType
    //   544: astore #10
    //   546: aload #10
    //   548: invokeinterface getLowerBounds : ()[Ljava/lang/reflect/Type;
    //   553: astore #13
    //   555: aload #10
    //   557: invokeinterface getUpperBounds : ()[Ljava/lang/reflect/Type;
    //   562: astore #11
    //   564: aload #13
    //   566: arraylength
    //   567: iconst_1
    //   568: if_icmpne -> 651
    //   571: aload_0
    //   572: aload_1
    //   573: aload #13
    //   575: iconst_0
    //   576: aaload
    //   577: aload_3
    //   578: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   581: astore_0
    //   582: aload #9
    //   584: astore #12
    //   586: aload #10
    //   588: astore_2
    //   589: aload_0
    //   590: aload #13
    //   592: iconst_0
    //   593: aaload
    //   594: if_acmpeq -> 736
    //   597: aload_0
    //   598: instanceof java/lang/reflect/WildcardType
    //   601: ifeq -> 617
    //   604: aload_0
    //   605: checkcast java/lang/reflect/WildcardType
    //   608: invokeinterface getLowerBounds : ()[Ljava/lang/reflect/Type;
    //   613: astore_0
    //   614: goto -> 626
    //   617: iconst_1
    //   618: anewarray java/lang/reflect/Type
    //   621: dup
    //   622: iconst_0
    //   623: aload_0
    //   624: aastore
    //   625: astore_0
    //   626: new af0
    //   629: dup
    //   630: iconst_1
    //   631: anewarray java/lang/reflect/Type
    //   634: dup
    //   635: iconst_0
    //   636: ldc java/lang/Object
    //   638: aastore
    //   639: aload_0
    //   640: invokespecial <init> : ([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    //   643: astore_2
    //   644: aload #9
    //   646: astore #12
    //   648: goto -> 736
    //   651: aload #9
    //   653: astore #12
    //   655: aload #10
    //   657: astore_2
    //   658: aload #11
    //   660: arraylength
    //   661: iconst_1
    //   662: if_icmpne -> 736
    //   665: aload_0
    //   666: aload_1
    //   667: aload #11
    //   669: iconst_0
    //   670: aaload
    //   671: aload_3
    //   672: invokestatic Z : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    //   675: astore_0
    //   676: aload #9
    //   678: astore #12
    //   680: aload #10
    //   682: astore_2
    //   683: aload_0
    //   684: aload #11
    //   686: iconst_0
    //   687: aaload
    //   688: if_acmpeq -> 736
    //   691: aload_0
    //   692: instanceof java/lang/reflect/WildcardType
    //   695: ifeq -> 711
    //   698: aload_0
    //   699: checkcast java/lang/reflect/WildcardType
    //   702: invokeinterface getUpperBounds : ()[Ljava/lang/reflect/Type;
    //   707: astore_0
    //   708: goto -> 720
    //   711: iconst_1
    //   712: anewarray java/lang/reflect/Type
    //   715: dup
    //   716: iconst_0
    //   717: aload_0
    //   718: aastore
    //   719: astore_0
    //   720: new af0
    //   723: dup
    //   724: aload_0
    //   725: getstatic g92.e : [Ljava/lang/reflect/Type;
    //   728: invokespecial <init> : ([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V
    //   731: astore_2
    //   732: aload #9
    //   734: astore #12
    //   736: aload #12
    //   738: ifnull -> 749
    //   741: aload_3
    //   742: aload #12
    //   744: aload_2
    //   745: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   748: pop
    //   749: aload_2
    //   750: areturn
  }
  
  public static xj0 a() {
    return new xj0(null);
  }
  
  public static boolean a0(Context paramContext, int paramInt, boolean paramBoolean) {
    TypedValue typedValue = Y(paramContext, paramInt);
    return (typedValue != null && typedValue.type == 18) ? ((typedValue.data != 0)) : paramBoolean;
  }
  
  public static void b(View paramView, Rect paramRect) {
    Object object = paramView.getTag(2131296464);
    if (object instanceof Rect) {
      object = object;
    } else {
      object = new Rect(paramView.getPaddingLeft(), paramView.getPaddingTop(), paramView.getPaddingRight(), paramView.getPaddingBottom());
      paramView.setTag(2131296464, object);
    } 
    object = X(paramRect, (Rect)object);
    paramView.setTag(2131296340, paramRect);
    paramView.setPadding(((Rect)object).left, ((Rect)object).top, ((Rect)object).right, ((Rect)object).bottom);
  }
  
  public static final Object b0(ad0 paramad0) {
    Thread.interrupted();
    paramad0 = new qm0(paramad0, null, 2);
    return qv.X(b40.b, paramad0);
  }
  
  public static void c(View paramView, boolean paramBoolean1, boolean paramBoolean2) {
    u52 u52 = new u52(paramBoolean2, paramView, paramBoolean1, 0);
    WeakHashMap weakHashMap = v22.a;
    m22.c(paramView, u52);
  }
  
  public static String c0(String paramString) {
    int i = paramString.hashCode();
    switch (i) {
      default:
        switch (i) {
          default:
            switch (i) {
              default:
                switch (i) {
                  default:
                    return null;
                  case 80123380:
                    if (paramString.equals("kotlin.jvm.functions.Function9"))
                      return hrSTyFuSIm.HqJHifNy; 
                  case 80123379:
                    if (paramString.equals("kotlin.jvm.functions.Function8"))
                      return "Function8"; 
                  case 80123378:
                    if (paramString.equals("kotlin.jvm.functions.Function7"))
                      return "Function7"; 
                  case 80123377:
                    if (paramString.equals("kotlin.jvm.functions.Function6"))
                      return "Function6"; 
                  case 80123376:
                    if (paramString.equals("kotlin.jvm.functions.Function5"))
                      return "Function5"; 
                  case 80123375:
                    if (paramString.equals("kotlin.jvm.functions.Function4"))
                      return "Function4"; 
                  case 80123374:
                    if (paramString.equals("kotlin.jvm.functions.Function3"))
                      return "Function3"; 
                  case 80123373:
                    if (paramString.equals("kotlin.jvm.functions.Function2"))
                      return "Function2"; 
                  case 80123372:
                    if (paramString.equals("kotlin.jvm.functions.Function1"))
                      return "Function1"; 
                  case 80123371:
                    break;
                } 
                if (!paramString.equals(FgdLmmRfTxSFKI.wknKYo));
                return "Function0";
              case -1811142683:
                if (!paramString.equals("kotlin.jvm.functions.Function22"));
                return "Function22";
              case -1811142684:
                if (!paramString.equals("kotlin.jvm.functions.Function21"));
                return "Function21";
              case -1811142685:
                break;
            } 
            if (!paramString.equals("kotlin.jvm.functions.Function20"));
            return "Function20";
          case -1811142707:
            if (!paramString.equals("kotlin.jvm.functions.Function19"));
            return "Function19";
          case -1811142708:
            if (!paramString.equals("kotlin.jvm.functions.Function18"));
            return "Function18";
          case -1811142709:
            if (!paramString.equals(tlzLOCPTHRhep.dtHzJ));
            return "Function17";
          case -1811142710:
            if (!paramString.equals("kotlin.jvm.functions.Function16"));
            return "Function16";
          case -1811142711:
            if (!paramString.equals("kotlin.jvm.functions.Function15"));
            return "Function15";
          case -1811142712:
            if (!paramString.equals("kotlin.jvm.functions.Function14"));
            return "Function14";
          case -1811142713:
            if (!paramString.equals("kotlin.jvm.functions.Function13"));
            return "Function13";
          case -1811142714:
            if (!paramString.equals("kotlin.jvm.functions.Function12"));
            return "Function12";
          case -1811142715:
            if (!paramString.equals("kotlin.jvm.functions.Function11"));
            return "Function11";
          case -1811142716:
            break;
        } 
        if (!paramString.equals("kotlin.jvm.functions.Function10"));
        return "Function10";
      case 1877171123:
        if (!paramString.equals("kotlin.jvm.internal.IntCompanionObject"));
        return "Companion";
      case 1630335596:
        if (!paramString.equals("java.lang.Throwable"));
        return "Throwable";
      case 1383693018:
        if (!paramString.equals("kotlin.jvm.internal.BooleanCompanionObject"));
        return "Companion";
      case 1275614662:
        if (!paramString.equals("java.lang.Iterable"));
        return "Iterable";
      case 1195259493:
        if (!paramString.equals("java.lang.String"));
        return "String";
      case 1063877011:
        if (!paramString.equals("java.lang.Object"));
        return "Any";
      case 1052881309:
        if (!paramString.equals("java.lang.Number"));
        return "Number";
      case 761287205:
        if (!paramString.equals("java.lang.Double"));
        return "Double";
      case 599019395:
        if (!paramString.equals("kotlin.jvm.internal.StringCompanionObject"));
        return "Companion";
      case 577341676:
        if (!paramString.equals("java.util.ListIterator"));
        return "ListIterator";
      case 499831342:
        if (!paramString.equals("java.util.Iterator"));
        return "Iterator";
      case 482629606:
        if (!paramString.equals("kotlin.jvm.internal.FloatCompanionObject"));
        return "Companion";
      case 398795216:
        if (!paramString.equals("java.lang.Long"));
        return "Long";
      case 398585941:
        if (!paramString.equals("java.lang.Enum"));
        return "Enum";
      case 398507100:
        if (!paramString.equals("java.lang.Byte"));
        return "Byte";
      case 344809556:
        if (!paramString.equals("java.lang.Boolean"));
        return "Boolean";
      case 226173651:
        if (!paramString.equals("kotlin.jvm.internal.EnumCompanionObject"));
        return "Companion";
      case 155276373:
        if (!paramString.equals("java.lang.Character"));
        return "Char";
      case 109413500:
        if (!paramString.equals("short"));
        return "Short";
      case 97526364:
        if (!paramString.equals("float"));
        return "Float";
      case 77230534:
        if (!paramString.equals("kotlin.jvm.internal.ShortCompanionObject"));
        return "Companion";
      case 65821278:
        if (!paramString.equals("java.util.List"));
        return "List";
      case 64711720:
        if (!paramString.equals("boolean"));
        return "Boolean";
      case 3327612:
        if (!paramString.equals("long"));
        return "Long";
      case 3052374:
        if (!paramString.equals("char"));
        return "Char";
      case 3039496:
        if (!paramString.equals("byte"));
        return "Byte";
      case 104431:
        if (!paramString.equals("int"));
        return "Int";
      case -165139126:
        if (!paramString.equals("java.util.Map$Entry"));
        return "Entry";
      case -207262728:
        if (!paramString.equals("kotlin.jvm.internal.LongCompanionObject"));
        return "Companion";
      case -246476834:
        if (!paramString.equals(hrSTyFuSIm.pkFnLtcZ));
        return "Companion";
      case -515992664:
        if (!paramString.equals("java.lang.Short"));
        return "Short";
      case -527879800:
        if (!paramString.equals("java.lang.Float"));
        return "Float";
      case -688322466:
        if (!paramString.equals("java.util.Collection"));
        return "Collection";
      case -1062240117:
        if (!paramString.equals("java.lang.CharSequence"));
        return "CharSequence";
      case -1182275604:
        if (!paramString.equals("kotlin.jvm.internal.ByteCompanionObject"));
        return "Companion";
      case -1325958191:
        if (!paramString.equals("double"));
        return "Double";
      case -1383343454:
        if (!paramString.equals("java.util.Set"));
        return "Set";
      case -1383349348:
        if (!paramString.equals("java.util.Map"));
        return "Map";
      case -1571515090:
        if (!paramString.equals("java.lang.Comparable"));
        return "Comparable";
      case -1979556166:
        if (!paramString.equals("java.lang.annotation.Annotation"));
        return GMDx.KqOB;
      case -2034166429:
        if (!paramString.equals("java.lang.Cloneable"));
        return "Cloneable";
      case -2056817302:
        if (!paramString.equals("java.lang.Integer"));
        return "Int";
      case -2061550653:
        break;
    } 
    if (!paramString.equals("kotlin.jvm.internal.DoubleCompanionObject"));
    return "Companion";
  }
  
  public static void d(View paramView, boolean paramBoolean1, boolean paramBoolean2) {
    u52 u52 = new u52(paramBoolean2, paramView, paramBoolean1, 1);
    WeakHashMap weakHashMap = v22.a;
    m22.c(paramView, u52);
  }
  
  public static boolean d0(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte2 != null && paramArrayOfbyte1.length >= paramArrayOfbyte2.length) {
      byte b = 0;
      while (b < paramArrayOfbyte2.length) {
        if (paramArrayOfbyte1[b] == paramArrayOfbyte2[b]) {
          b++;
          continue;
        } 
        return false;
      } 
      return true;
    } 
    return false;
  }
  
  public static void e(View paramView, boolean paramBoolean) {
    n71 n71 = new n71(paramView, paramBoolean);
    WeakHashMap weakHashMap = v22.a;
    m22.c(paramView, n71);
  }
  
  public static String e0(Type paramType) {
    return (paramType instanceof Class) ? ((Class)paramType).getName() : paramType.toString();
  }
  
  public static void f(View paramView) {
    v52 v52 = new v52(paramView, 0);
    WeakHashMap weakHashMap = v22.a;
    m22.c(paramView, v52);
  }
  
  public static float f0() {
    return (float)Math.pow(0.5689655172413793D, 3.0D) * 100.0F;
  }
  
  public static void g(Context paramContext, String paramString1, String paramString2, Drawable paramDrawable, Runnable paramRunnable) {
    ms0 ms0 = new ms0(paramContext);
    ms0.e(2131492968, true);
    View view = ms0.u;
    TextView textView2 = (TextView)view.findViewById(2131297890);
    TextView textView1 = (TextView)view.findViewById(2131297714);
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296398);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296376);
    if (paramString1 != null) {
      textView2.setText(paramString1);
      textView2.setVisibility(0);
    } else {
      textView2.setVisibility(8);
    } 
    if (paramString2 != null) {
      textView1.setText((CharSequence)Html.fromHtml(paramContext.getString(2131887077, new Object[] { paramString2 })));
    } else {
      textView1.setText(2131887080);
    } 
    if (paramString2 != null) {
      materialButton1.setText((CharSequence)Html.fromHtml(paramContext.getString(2131887600, new Object[] { paramString2 })));
    } else {
      materialButton1.setText(2131886983);
    } 
    if (paramDrawable != null) {
      materialButton1.setIcon(paramDrawable);
      materialButton1.setIconSize((int)(MyApplication.p * 24.0F));
    } 
    ss0 ss0 = ms0.p();
    materialButton1.setOnClickListener(new ag(4, paramRunnable, ss0));
    materialButton2.setOnClickListener(new nc(ss0, 1));
  }
  
  public static n5 g0() {
    eo eo = new eo(-1, true, -1, 0);
    Parcelable.Creator<n5> creator = n5.CREATOR;
    n5 n5 = new n5(eo, false);
    n5.e = false;
    return n5;
  }
  
  public static final Object h(pa1 parampa1, lc0 paramlc0, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof na1
    //   4: ifeq -> 40
    //   7: aload_2
    //   8: checkcast na1
    //   11: astore #4
    //   13: aload #4
    //   15: getfield h : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc_w -2147483648
    //   23: iand
    //   24: ifeq -> 40
    //   27: aload #4
    //   29: iload_3
    //   30: ldc_w -2147483648
    //   33: iadd
    //   34: putfield h : I
    //   37: goto -> 50
    //   40: new ds
    //   43: dup
    //   44: aload_2
    //   45: invokespecial <init> : (Lcs;)V
    //   48: astore #4
    //   50: aload #4
    //   52: getfield g : Ljava/lang/Object;
    //   55: astore #5
    //   57: aload #4
    //   59: getfield h : I
    //   62: istore_3
    //   63: iload_3
    //   64: ifeq -> 100
    //   67: iload_3
    //   68: iconst_1
    //   69: if_icmpne -> 92
    //   72: aload #4
    //   74: getfield f : Llc0;
    //   77: astore_0
    //   78: aload_0
    //   79: astore_2
    //   80: aload #5
    //   82: invokestatic r0 : (Ljava/lang/Object;)V
    //   85: goto -> 222
    //   88: astore_0
    //   89: goto -> 233
    //   92: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   95: invokestatic f : (Ljava/lang/String;)V
    //   98: aconst_null
    //   99: areturn
    //   100: aload #5
    //   102: invokestatic r0 : (Ljava/lang/Object;)V
    //   105: aload #4
    //   107: getfield c : Los;
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual getClass : ()Ljava/lang/Class;
    //   115: pop
    //   116: aload_2
    //   117: getstatic vs2.g : Lvs2;
    //   120: invokeinterface l : (Lns;)Lms;
    //   125: aload_0
    //   126: if_acmpne -> 242
    //   129: aload_1
    //   130: astore_2
    //   131: aload #4
    //   133: aload_1
    //   134: putfield f : Llc0;
    //   137: aload_1
    //   138: astore_2
    //   139: aload #4
    //   141: iconst_1
    //   142: putfield h : I
    //   145: aload_1
    //   146: astore_2
    //   147: new ni
    //   150: astore #5
    //   152: aload_1
    //   153: astore_2
    //   154: aload #5
    //   156: iconst_1
    //   157: aload #4
    //   159: invokestatic N : (Lcs;)Lcs;
    //   162: invokespecial <init> : (ILcs;)V
    //   165: aload_1
    //   166: astore_2
    //   167: aload #5
    //   169: invokevirtual x : ()V
    //   172: aload_1
    //   173: astore_2
    //   174: new oa1
    //   177: astore #4
    //   179: aload_1
    //   180: astore_2
    //   181: aload #4
    //   183: aload #5
    //   185: invokespecial <init> : (Lni;)V
    //   188: aload_1
    //   189: astore_2
    //   190: aload_0
    //   191: getfield h : Llh;
    //   194: aload #4
    //   196: invokevirtual x : (Loa1;)V
    //   199: aload_1
    //   200: astore_2
    //   201: aload #5
    //   203: invokevirtual v : ()Ljava/lang/Object;
    //   206: astore #4
    //   208: getstatic ys.b : Lys;
    //   211: astore_2
    //   212: aload_1
    //   213: astore_0
    //   214: aload #4
    //   216: aload_2
    //   217: if_acmpne -> 222
    //   220: aload_2
    //   221: areturn
    //   222: aload_0
    //   223: invokeinterface a : ()Ljava/lang/Object;
    //   228: pop
    //   229: getstatic l02.a : Ll02;
    //   232: areturn
    //   233: aload_2
    //   234: invokeinterface a : ()Ljava/lang/Object;
    //   239: pop
    //   240: aload_0
    //   241: athrow
    //   242: ldc_w 'awaitClose() can only be invoked from the producer context'
    //   245: invokestatic f : (Ljava/lang/String;)V
    //   248: aconst_null
    //   249: areturn
    // Exception table:
    //   from	to	target	type
    //   80	85	88	finally
    //   131	137	88	finally
    //   139	145	88	finally
    //   147	152	88	finally
    //   154	165	88	finally
    //   167	172	88	finally
    //   174	179	88	finally
    //   181	188	88	finally
    //   190	199	88	finally
    //   201	208	88	finally
  }
  
  public static String h0(File paramFile) {
    if (paramFile.getName().endsWith(".apk")) {
      String str = paramFile.getName().replaceFirst("(_\\d+)?\\.apk", "");
      return (str.equals("base-master") || str.equals("base-main")) ? "" : (str.startsWith("base-") ? str.replace("base-", "config.") : str.replace("-", ".config.").replace(".config.master", "").replace(".config.main", ""));
    } 
    l0.l("Non-apk found in splits directory.");
    return null;
  }
  
  public static boolean i(Context paramContext, Uri paramUri) {
    if (paramContext.checkCallingOrSelfUriPermission(paramUri, 2) == 0) {
      String str = W(paramContext, paramUri, "mime_type");
      int i = (int)V(paramContext, paramUri, "flags", 0L);
      if (!TextUtils.isEmpty(str) && ((i & 0x4) != 0 || ("vnd.android.document/directory".equals(str) && (i & 0x8) != 0) || (!TextUtils.isEmpty(str) && (i & 0x2) != 0)))
        return true; 
    } 
    return false;
  }
  
  public static void i0(int paramInt, Object[] paramArrayOfObject) {
    byte b = 0;
    while (b < paramInt) {
      if (paramArrayOfObject[b] != null) {
        b++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 9);
      stringBuilder.append("at index ");
      stringBuilder.append(b);
      throw new NullPointerException(stringBuilder.toString());
    } 
  }
  
  public static final void j(os paramos, CancellationException paramCancellationException) {
    paramos = paramos.l(vs2.g);
    if (paramos != null)
      paramos.c(paramCancellationException); 
  }
  
  public static boolean j0(byte paramByte) {
    return (paramByte > -65);
  }
  
  public static final Object k(vj0 paramvj0, pr1 parampr1) {
    paramvj0.c(null);
    Object object = ((dk0)paramvj0).Q(parampr1);
    return (object == ys.b) ? object : l02.a;
  }
  
  public static Type l(Type paramType) {
    if (paramType instanceof Class) {
      paramType = paramType;
      return paramType.isArray() ? new ye0(l(paramType.getComponentType())) : paramType;
    } 
    if (paramType instanceof ParameterizedType) {
      paramType = paramType;
      return new ze0(paramType.getOwnerType(), (Class)paramType.getRawType(), paramType.getActualTypeArguments());
    } 
    if (paramType instanceof GenericArrayType)
      return new ye0(((GenericArrayType)paramType).getGenericComponentType()); 
    if (paramType instanceof WildcardType) {
      paramType = paramType;
      return new af0(paramType.getUpperBounds(), paramType.getLowerBounds());
    } 
    return paramType;
  }
  
  public static void m(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.K, paramInt1, paramInt2);
    boolean bool = typedArray.getBoolean(1, false);
    typedArray.recycle();
    if (bool) {
      TypedValue typedValue = new TypedValue();
      if (!paramContext.getTheme().resolveAttribute(2130969358, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0))
        p(paramContext, h, "Theme.MaterialComponents"); 
    } 
    p(paramContext, g, "Theme.AppCompat");
  }
  
  public static void n(Type paramType) {
    if (paramType instanceof Class && ((Class)paramType).isPrimitive())
      l0.l("Primitive type is not allowed"); 
  }
  
  public static void o(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint1, int paramInt1, int paramInt2, int... paramVarArgs1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic zb1.K : [I
    //   5: iload_3
    //   6: iload #4
    //   8: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   11: astore #7
    //   13: iconst_0
    //   14: istore #6
    //   16: aload #7
    //   18: iconst_2
    //   19: iconst_0
    //   20: invokevirtual getBoolean : (IZ)Z
    //   23: ifne -> 32
    //   26: aload #7
    //   28: invokevirtual recycle : ()V
    //   31: return
    //   32: aload #5
    //   34: arraylength
    //   35: ifne -> 57
    //   38: iload #6
    //   40: istore_3
    //   41: aload #7
    //   43: iconst_0
    //   44: iconst_m1
    //   45: invokevirtual getResourceId : (II)I
    //   48: iconst_m1
    //   49: if_icmpeq -> 116
    //   52: iconst_1
    //   53: istore_3
    //   54: goto -> 116
    //   57: aload_0
    //   58: aload_1
    //   59: aload_2
    //   60: iload_3
    //   61: iload #4
    //   63: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   66: astore_0
    //   67: aload #5
    //   69: arraylength
    //   70: istore #4
    //   72: iconst_0
    //   73: istore_3
    //   74: iload_3
    //   75: iload #4
    //   77: if_icmpge -> 109
    //   80: aload_0
    //   81: aload #5
    //   83: iload_3
    //   84: iaload
    //   85: iconst_m1
    //   86: invokevirtual getResourceId : (II)I
    //   89: iconst_m1
    //   90: if_icmpne -> 103
    //   93: aload_0
    //   94: invokevirtual recycle : ()V
    //   97: iload #6
    //   99: istore_3
    //   100: goto -> 116
    //   103: iinc #3, 1
    //   106: goto -> 74
    //   109: aload_0
    //   110: invokevirtual recycle : ()V
    //   113: goto -> 52
    //   116: aload #7
    //   118: invokevirtual recycle : ()V
    //   121: iload_3
    //   122: ifeq -> 126
    //   125: return
    //   126: ldc_w 'This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).'
    //   129: invokestatic l : (Ljava/lang/String;)V
    //   132: return
  }
  
  public static void p(Context paramContext, int[] paramArrayOfint, String paramString) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramArrayOfint);
    byte b = 0;
    while (b < paramArrayOfint.length) {
      if (typedArray.hasValue(b)) {
        b++;
        continue;
      } 
      typedArray.recycle();
      l0.l(x41.w("The style on this component requires your app theme to be ", paramString, " (or a descendant)."));
      return;
    } 
    typedArray.recycle();
  }
  
  public static String q(String paramString) {
    int i = paramString.hashCode();
    switch (i) {
      default:
        switch (i) {
          default:
            switch (i) {
              default:
                switch (i) {
                  default:
                    return null;
                  case 80123380:
                    if (paramString.equals("kotlin.jvm.functions.Function9"))
                      return "kotlin.Function9"; 
                  case 80123379:
                    if (paramString.equals("kotlin.jvm.functions.Function8"))
                      return "kotlin.Function8"; 
                  case 80123378:
                    if (paramString.equals("kotlin.jvm.functions.Function7"))
                      return "kotlin.Function7"; 
                  case 80123377:
                    if (paramString.equals("kotlin.jvm.functions.Function6"))
                      return "kotlin.Function6"; 
                  case 80123376:
                    if (paramString.equals("kotlin.jvm.functions.Function5"))
                      return "kotlin.Function5"; 
                  case 80123375:
                    if (paramString.equals("kotlin.jvm.functions.Function4"))
                      return "kotlin.Function4"; 
                  case 80123374:
                    if (paramString.equals("kotlin.jvm.functions.Function3"))
                      return "kotlin.Function3"; 
                  case 80123373:
                    if (paramString.equals("kotlin.jvm.functions.Function2"))
                      return "kotlin.Function2"; 
                  case 80123372:
                    if (paramString.equals(xveccWbRzqx.spTDLPMnElqxZu))
                      return "kotlin.Function1"; 
                  case 80123371:
                    break;
                } 
                if (!paramString.equals("kotlin.jvm.functions.Function0"));
                return "kotlin.Function0";
              case -1811142683:
                if (!paramString.equals("kotlin.jvm.functions.Function22"));
                return "kotlin.Function22";
              case -1811142684:
                if (!paramString.equals("kotlin.jvm.functions.Function21"));
                return "kotlin.Function21";
              case -1811142685:
                break;
            } 
            if (!paramString.equals("kotlin.jvm.functions.Function20"));
            return "kotlin.Function20";
          case -1811142707:
            if (!paramString.equals("kotlin.jvm.functions.Function19"));
            return "kotlin.Function19";
          case -1811142708:
            if (!paramString.equals("kotlin.jvm.functions.Function18"));
            return JkpGFvCVQHzgc.AJLSdPdbQM;
          case -1811142709:
            if (!paramString.equals("kotlin.jvm.functions.Function17"));
            return "kotlin.Function17";
          case -1811142710:
            if (!paramString.equals("kotlin.jvm.functions.Function16"));
            return PwbbJfsdcHrAjW.gRublAKnMBFXo;
          case -1811142711:
            if (!paramString.equals("kotlin.jvm.functions.Function15"));
            return "kotlin.Function15";
          case -1811142712:
            if (!paramString.equals(hbrAVtEa.UaVrOhqqyDmfhXZ));
            return "kotlin.Function14";
          case -1811142713:
            if (!paramString.equals("kotlin.jvm.functions.Function13"));
            return "kotlin.Function13";
          case -1811142714:
            if (!paramString.equals("kotlin.jvm.functions.Function12"));
            return "kotlin.Function12";
          case -1811142715:
            if (!paramString.equals("kotlin.jvm.functions.Function11"));
            return "kotlin.Function11";
          case -1811142716:
            break;
        } 
        if (!paramString.equals("kotlin.jvm.functions.Function10"));
        return "kotlin.Function10";
      case 1877171123:
        if (!paramString.equals("kotlin.jvm.internal.IntCompanionObject"));
        return "kotlin.Int.Companion";
      case 1630335596:
        if (!paramString.equals("java.lang.Throwable"));
        return "kotlin.Throwable";
      case 1383693018:
        if (!paramString.equals("kotlin.jvm.internal.BooleanCompanionObject"));
        return "kotlin.Boolean.Companion";
      case 1275614662:
        if (!paramString.equals("java.lang.Iterable"));
        return "kotlin.collections.Iterable";
      case 1195259493:
        if (!paramString.equals("java.lang.String"));
        return "kotlin.String";
      case 1063877011:
        if (!paramString.equals("java.lang.Object"));
        return "kotlin.Any";
      case 1052881309:
        if (!paramString.equals(jHxlGgUTadw.wHOcVm));
        return "kotlin.Number";
      case 761287205:
        if (!paramString.equals("java.lang.Double"));
        return "kotlin.Double";
      case 599019395:
        if (!paramString.equals("kotlin.jvm.internal.StringCompanionObject"));
        return "kotlin.String.Companion";
      case 577341676:
        if (!paramString.equals("java.util.ListIterator"));
        return "kotlin.collections.ListIterator";
      case 499831342:
        if (!paramString.equals("java.util.Iterator"));
        return "kotlin.collections.Iterator";
      case 482629606:
        if (!paramString.equals("kotlin.jvm.internal.FloatCompanionObject"));
        return "kotlin.Float.Companion";
      case 398795216:
        if (!paramString.equals("java.lang.Long"));
        return "kotlin.Long";
      case 398585941:
        if (!paramString.equals("java.lang.Enum"));
        return "kotlin.Enum";
      case 398507100:
        if (!paramString.equals("java.lang.Byte"));
        return "kotlin.Byte";
      case 344809556:
        if (!paramString.equals("java.lang.Boolean"));
        return "kotlin.Boolean";
      case 226173651:
        if (!paramString.equals("kotlin.jvm.internal.EnumCompanionObject"));
        return "kotlin.Enum.Companion";
      case 155276373:
        if (!paramString.equals(JkpGFvCVQHzgc.MNiJsZGOmRjLP));
        return "kotlin.Char";
      case 109413500:
        if (!paramString.equals("short"));
        return "kotlin.Short";
      case 97526364:
        if (!paramString.equals("float"));
        return "kotlin.Float";
      case 77230534:
        if (!paramString.equals("kotlin.jvm.internal.ShortCompanionObject"));
        return "kotlin.Short.Companion";
      case 65821278:
        if (!paramString.equals("java.util.List"));
        return "kotlin.collections.List";
      case 64711720:
        if (!paramString.equals("boolean"));
        return "kotlin.Boolean";
      case 3327612:
        if (!paramString.equals("long"));
        return "kotlin.Long";
      case 3052374:
        if (!paramString.equals("char"));
        return "kotlin.Char";
      case 3039496:
        if (!paramString.equals("byte"));
        return "kotlin.Byte";
      case 104431:
        if (!paramString.equals("int"));
        return "kotlin.Int";
      case -165139126:
        if (!paramString.equals("java.util.Map$Entry"));
        return "kotlin.collections.Map.Entry";
      case -207262728:
        if (!paramString.equals(XUaAMlaMSa.dxpf));
        return "kotlin.Long.Companion";
      case -246476834:
        if (!paramString.equals("kotlin.jvm.internal.CharCompanionObject"));
        return uvJYmft.ozgKr;
      case -515992664:
        if (!paramString.equals("java.lang.Short"));
        return "kotlin.Short";
      case -527879800:
        if (!paramString.equals("java.lang.Float"));
        return "kotlin.Float";
      case -688322466:
        if (!paramString.equals("java.util.Collection"));
        return "kotlin.collections.Collection";
      case -1062240117:
        if (!paramString.equals("java.lang.CharSequence"));
        return "kotlin.CharSequence";
      case -1182275604:
        if (!paramString.equals("kotlin.jvm.internal.ByteCompanionObject"));
        return "kotlin.Byte.Companion";
      case -1325958191:
        if (!paramString.equals("double"));
        return "kotlin.Double";
      case -1383343454:
        if (!paramString.equals("java.util.Set"));
        return "kotlin.collections.Set";
      case -1383349348:
        if (!paramString.equals("java.util.Map"));
        return "kotlin.collections.Map";
      case -1571515090:
        if (!paramString.equals(XUaAMlaMSa.zZkQITmUKsjHdxW));
        return "kotlin.Comparable";
      case -1979556166:
        if (!paramString.equals("java.lang.annotation.Annotation"));
        return "kotlin.Annotation";
      case -2034166429:
        if (!paramString.equals("java.lang.Cloneable"));
        return "kotlin.Cloneable";
      case -2056817302:
        if (!paramString.equals("java.lang.Integer"));
        return "kotlin.Int";
      case -2061550653:
        break;
    } 
    if (!paramString.equals("kotlin.jvm.internal.DoubleCompanionObject"));
    return "kotlin.Double.Companion";
  }
  
  public static void r(Cursor paramCursor) {
    if (paramCursor != null)
      try {
        x41.s(paramCursor);
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {} 
  }
  
  public static long[] s(Serializable paramSerializable) {
    int[] arrayOfInt;
    if (paramSerializable instanceof int[]) {
      arrayOfInt = (int[])paramSerializable;
      long[] arrayOfLong = new long[arrayOfInt.length];
      for (byte b = 0; b < arrayOfInt.length; b++)
        arrayOfLong[b] = arrayOfInt[b]; 
      return arrayOfLong;
    } 
    return (arrayOfInt instanceof long[]) ? (long[])arrayOfInt : null;
  }
  
  public static float[] t(float[] paramArrayOffloat, int paramInt) {
    if (paramInt >= 0) {
      int i = paramArrayOffloat.length;
      if (i >= 0) {
        i = Math.min(paramInt, i);
        float[] arrayOfFloat = new float[paramInt];
        System.arraycopy(paramArrayOffloat, 0, arrayOfFloat, 0, i);
        return arrayOfFloat;
      } 
      throw new ArrayIndexOutOfBoundsException();
    } 
    l0.k();
    return null;
  }
  
  public static boolean u(File paramFile, Resources paramResources, int paramInt) {
    try {
      InputStream inputStream = paramResources.openRawResource(paramInt);
    } finally {
      paramFile = null;
    } 
    if (paramResources != null)
      try {
        paramResources.close();
      } catch (IOException iOException) {} 
    throw paramFile;
  }
  
  public static boolean v(File paramFile, InputStream paramInputStream) {
    // Byte code:
    //   0: invokestatic allowThreadDiskWrites : ()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore #7
    //   5: aconst_null
    //   6: astore #5
    //   8: aconst_null
    //   9: astore #6
    //   11: aload #6
    //   13: astore_3
    //   14: new java/io/FileOutputStream
    //   17: astore #4
    //   19: aload #6
    //   21: astore_3
    //   22: aload #4
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial <init> : (Ljava/io/File;Z)V
    //   29: sipush #1024
    //   32: newarray byte
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual read : ([B)I
    //   40: istore_2
    //   41: iload_2
    //   42: iconst_m1
    //   43: if_icmpeq -> 71
    //   46: aload #4
    //   48: aload_0
    //   49: iconst_0
    //   50: iload_2
    //   51: invokevirtual write : ([BII)V
    //   54: goto -> 35
    //   57: astore_0
    //   58: aload #4
    //   60: astore_3
    //   61: goto -> 159
    //   64: astore_1
    //   65: aload #4
    //   67: astore_0
    //   68: goto -> 91
    //   71: aload #4
    //   73: invokevirtual close : ()V
    //   76: aload #7
    //   78: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   81: iconst_1
    //   82: ireturn
    //   83: astore_0
    //   84: goto -> 159
    //   87: astore_1
    //   88: aload #5
    //   90: astore_0
    //   91: aload_0
    //   92: astore_3
    //   93: new java/lang/StringBuilder
    //   96: astore #4
    //   98: aload_0
    //   99: astore_3
    //   100: aload #4
    //   102: invokespecial <init> : ()V
    //   105: aload_0
    //   106: astore_3
    //   107: aload #4
    //   109: ldc_w 'Error copying resource contents to temp file: '
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_0
    //   117: astore_3
    //   118: aload #4
    //   120: aload_1
    //   121: invokevirtual getMessage : ()Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_0
    //   129: astore_3
    //   130: ldc_w 'TypefaceCompatUtil'
    //   133: aload #4
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: aload_0
    //   143: ifnull -> 152
    //   146: aload_0
    //   147: invokeinterface close : ()V
    //   152: aload #7
    //   154: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   157: iconst_0
    //   158: ireturn
    //   159: aload_3
    //   160: ifnull -> 169
    //   163: aload_3
    //   164: invokeinterface close : ()V
    //   169: aload #7
    //   171: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   174: aload_0
    //   175: athrow
    //   176: astore_0
    //   177: goto -> 76
    //   180: astore_0
    //   181: goto -> 152
    //   184: astore_1
    //   185: goto -> 169
    // Exception table:
    //   from	to	target	type
    //   14	19	87	java/io/IOException
    //   14	19	83	finally
    //   22	29	87	java/io/IOException
    //   22	29	83	finally
    //   29	35	64	java/io/IOException
    //   29	35	57	finally
    //   35	41	64	java/io/IOException
    //   35	41	57	finally
    //   46	54	64	java/io/IOException
    //   46	54	57	finally
    //   71	76	176	java/io/IOException
    //   93	98	83	finally
    //   100	105	83	finally
    //   107	116	83	finally
    //   118	128	83	finally
    //   130	142	83	finally
    //   146	152	180	java/io/IOException
    //   163	169	184	java/io/IOException
  }
  
  public static e61[] w(String paramString) {
    ArrayList<e61> arrayList = new ArrayList();
    int i = 0;
    byte b;
    for (b = 1; b < paramString.length(); b++) {
      while (b < paramString.length()) {
        char c = paramString.charAt(b);
        if (((c - 90) * (c - 65) <= 0 || (c - 122) * (c - 97) <= 0) && c != 'e' && c != 'E')
          break; 
        b++;
      } 
      String str = paramString.substring(i, b).trim();
      if (!str.isEmpty()) {
        float[] arrayOfFloat;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
          arrayOfFloat = new float[0];
        } else {
          int j;
          try {
            arrayOfFloat = new float[str.length()];
            int m = str.length();
            j = 0;
            int k = 1;
            while (k < m) {
              int i3 = 0;
              char c = Character.MIN_VALUE;
              i = c;
              int i1 = i;
              int n = k;
              int i2 = i;
              i = i3;
              while (true) {
                i3 = i1;
                if (n < str.length()) {
                  i3 = str.charAt(n);
                  if (i3 != 32) {
                    if (i3 != 69 && i3 != 101) {
                      switch (i3) {
                        default:
                          i = 0;
                          break;
                        case '.':
                          if (c == '\000') {
                            i = 0;
                            c = '\001';
                            break;
                          } 
                          i = 0;
                          i2 = 1;
                          i1 = 1;
                          break;
                        case '-':
                        
                        case ',':
                          i = 0;
                          i2 = 1;
                          break;
                      } 
                    } else {
                      i = 1;
                    } 
                    if (i2 != 0) {
                      i3 = i1;
                      break;
                    } 
                    continue;
                  } 
                } 
                break;
                n++;
              } 
              i = j;
              if (k < n) {
                arrayOfFloat[j] = Float.parseFloat(str.substring(k, n));
                i = j + 1;
              } 
              if (i3 != 0) {
                k = n;
              } else {
                k = n + 1;
              } 
              j = i;
            } 
          } catch (NumberFormatException numberFormatException) {}
          arrayOfFloat = t(arrayOfFloat, j);
        } 
        arrayList.add(new e61(str.charAt(0), arrayOfFloat));
      } 
      i = b;
    } 
    if (b - i == 1 && i < numberFormatException.length())
      arrayList.add(new e61(numberFormatException.charAt(i), new float[0])); 
    return arrayList.<e61>toArray(new e61[0]);
  }
  
  public static boolean x(File paramFile) {
    File[] arrayOfFile;
    if (paramFile.isDirectory()) {
      arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
        return false; 
      int i = arrayOfFile.length;
      byte b = 0;
      boolean bool = true;
      while (b < i) {
        if (x(arrayOfFile[b]) && bool) {
          bool = true;
        } else {
          bool = false;
        } 
        b++;
      } 
      return bool;
    } 
    arrayOfFile.delete();
    return true;
  }
  
  public static final void y(os paramos) {
    paramos = paramos.l(vs2.g);
    if (paramos == null || paramos.a())
      return; 
    throw ((dk0)paramos).C();
  }
  
  public static void z() {
    if (P()) {
      SharedPreferences sharedPreferences = MyApplication.o();
      int m = 10000;
      if (sharedPreferences.getInt("k_f_plyptch4", 10000) != 10000)
        x41.u("k_f_plyptch4", 10000); 
      int j = MyApplication.o().getInt("k_f_plyspd4", 10000);
      int i = 20000;
      if (j > 20000) {
        x41.u("k_f_plyspd4", 20000);
      } else {
        char c = 'ᎈ';
        i = j;
        if (j < 5000) {
          x41.u("k_f_plyspd4", 5000);
          i = c;
        } 
      } 
      String str = ag0.a;
      int k = 0;
      j = 0;
      while (true) {
        int[] arrayOfInt = f;
        if (j < 7) {
          if (arrayOfInt[j] == i)
            break; 
          j++;
          continue;
        } 
        int n = Integer.MAX_VALUE;
        j = k;
        while (j < 7) {
          int i2 = arrayOfInt[j];
          int i1 = Math.abs(i2 - i);
          k = n;
          if (i1 < n) {
            m = i2;
            k = i1;
          } 
          j++;
          n = k;
        } 
        x41.u("k_f_plyspd4", m);
        break;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */