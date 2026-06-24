import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.nativex.NativeLibx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public abstract class ws2 implements i40 {
  public static gd2 c;
  
  public static final int[] e = new int[0];
  
  public static final Object[] f = new Object[0];
  
  public static final Object g = new Object();
  
  public static final jk0 h = new jk0(2);
  
  public static final char[] i = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public static PowerManager.WakeLock j;
  
  public static boolean k;
  
  public static boolean l;
  
  public static boolean m;
  
  public static boolean n;
  
  public static Method o;
  
  public static boolean p;
  
  public static Field q;
  
  public static ThreadPoolExecutor r;
  
  public final int b;
  
  public static boolean A(hl0 paramhl0, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: aload_0
    //   4: ifnonnull -> 10
    //   7: goto -> 404
    //   10: getstatic android/os/Build$VERSION.SDK_INT : I
    //   13: bipush #28
    //   15: if_icmplt -> 26
    //   18: aload_0
    //   19: aload_3
    //   20: invokeinterface l : (Landroid/view/KeyEvent;)Z
    //   25: ireturn
    //   26: aload_2
    //   27: instanceof android/app/Activity
    //   30: istore #7
    //   32: aconst_null
    //   33: astore #8
    //   35: aconst_null
    //   36: astore #9
    //   38: iconst_1
    //   39: istore #4
    //   41: iconst_1
    //   42: istore #6
    //   44: iload #7
    //   46: ifeq -> 241
    //   49: aload_2
    //   50: checkcast android/app/Activity
    //   53: astore_1
    //   54: aload_1
    //   55: invokevirtual onUserInteraction : ()V
    //   58: aload_1
    //   59: invokevirtual getWindow : ()Landroid/view/Window;
    //   62: astore_0
    //   63: aload_0
    //   64: bipush #8
    //   66: invokevirtual hasFeature : (I)Z
    //   69: ifeq -> 182
    //   72: aload_1
    //   73: invokevirtual getActionBar : ()Landroid/app/ActionBar;
    //   76: astore_2
    //   77: aload_3
    //   78: invokevirtual getKeyCode : ()I
    //   81: bipush #82
    //   83: if_icmpne -> 182
    //   86: aload_2
    //   87: ifnull -> 182
    //   90: getstatic ws2.n : Z
    //   93: ifne -> 121
    //   96: aload_2
    //   97: invokevirtual getClass : ()Ljava/lang/Class;
    //   100: ldc 'onMenuKeyEvent'
    //   102: iconst_1
    //   103: anewarray java/lang/Class
    //   106: dup
    //   107: iconst_0
    //   108: ldc android/view/KeyEvent
    //   110: aastore
    //   111: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   114: putstatic ws2.o : Ljava/lang/reflect/Method;
    //   117: iconst_1
    //   118: putstatic ws2.n : Z
    //   121: getstatic ws2.o : Ljava/lang/reflect/Method;
    //   124: astore #8
    //   126: iload #5
    //   128: istore #4
    //   130: aload #8
    //   132: ifnull -> 170
    //   135: aload #8
    //   137: aload_2
    //   138: iconst_1
    //   139: anewarray java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_3
    //   145: aastore
    //   146: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   149: astore_2
    //   150: aload_2
    //   151: ifnonnull -> 161
    //   154: iload #5
    //   156: istore #4
    //   158: goto -> 170
    //   161: aload_2
    //   162: checkcast java/lang/Boolean
    //   165: invokevirtual booleanValue : ()Z
    //   168: istore #4
    //   170: iload #4
    //   172: ifeq -> 182
    //   175: iload #6
    //   177: istore #4
    //   179: goto -> 238
    //   182: aload_0
    //   183: aload_3
    //   184: invokevirtual superDispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   187: ifeq -> 197
    //   190: iload #6
    //   192: istore #4
    //   194: goto -> 238
    //   197: aload_0
    //   198: invokevirtual getDecorView : ()Landroid/view/View;
    //   201: astore_2
    //   202: aload_2
    //   203: aload_3
    //   204: invokestatic c : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   207: ifeq -> 217
    //   210: iload #6
    //   212: istore #4
    //   214: goto -> 238
    //   217: aload #9
    //   219: astore_0
    //   220: aload_2
    //   221: ifnull -> 229
    //   224: aload_2
    //   225: invokevirtual getKeyDispatcherState : ()Landroid/view/KeyEvent$DispatcherState;
    //   228: astore_0
    //   229: aload_3
    //   230: aload_1
    //   231: aload_0
    //   232: aload_1
    //   233: invokevirtual dispatch : (Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
    //   236: istore #4
    //   238: iload #4
    //   240: ireturn
    //   241: aload_2
    //   242: instanceof android/app/Dialog
    //   245: ifeq -> 380
    //   248: aload_2
    //   249: checkcast android/app/Dialog
    //   252: astore_1
    //   253: getstatic ws2.p : Z
    //   256: ifne -> 280
    //   259: ldc android/app/Dialog
    //   261: ldc 'mOnKeyListener'
    //   263: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   266: astore_0
    //   267: aload_0
    //   268: putstatic ws2.q : Ljava/lang/reflect/Field;
    //   271: aload_0
    //   272: iconst_1
    //   273: invokevirtual setAccessible : (Z)V
    //   276: iconst_1
    //   277: putstatic ws2.p : Z
    //   280: getstatic ws2.q : Ljava/lang/reflect/Field;
    //   283: astore_0
    //   284: aload_0
    //   285: ifnull -> 300
    //   288: aload_0
    //   289: aload_1
    //   290: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   293: checkcast android/content/DialogInterface$OnKeyListener
    //   296: astore_0
    //   297: goto -> 302
    //   300: aconst_null
    //   301: astore_0
    //   302: aload_0
    //   303: ifnull -> 324
    //   306: aload_0
    //   307: aload_1
    //   308: aload_3
    //   309: invokevirtual getKeyCode : ()I
    //   312: aload_3
    //   313: invokeinterface onKey : (Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    //   318: ifeq -> 324
    //   321: goto -> 377
    //   324: aload_1
    //   325: invokevirtual getWindow : ()Landroid/view/Window;
    //   328: astore_0
    //   329: aload_0
    //   330: aload_3
    //   331: invokevirtual superDispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   334: ifeq -> 340
    //   337: goto -> 377
    //   340: aload_0
    //   341: invokevirtual getDecorView : ()Landroid/view/View;
    //   344: astore_2
    //   345: aload_2
    //   346: aload_3
    //   347: invokestatic c : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   350: ifeq -> 356
    //   353: goto -> 377
    //   356: aload #8
    //   358: astore_0
    //   359: aload_2
    //   360: ifnull -> 368
    //   363: aload_2
    //   364: invokevirtual getKeyDispatcherState : ()Landroid/view/KeyEvent$DispatcherState;
    //   367: astore_0
    //   368: aload_3
    //   369: aload_1
    //   370: aload_0
    //   371: aload_1
    //   372: invokevirtual dispatch : (Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
    //   375: istore #4
    //   377: iload #4
    //   379: ireturn
    //   380: aload_1
    //   381: ifnull -> 392
    //   384: aload_1
    //   385: aload_3
    //   386: invokestatic c : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   389: ifne -> 402
    //   392: aload_0
    //   393: aload_3
    //   394: invokeinterface l : (Landroid/view/KeyEvent;)Z
    //   399: ifeq -> 404
    //   402: iconst_1
    //   403: ireturn
    //   404: iconst_0
    //   405: ireturn
    //   406: astore #8
    //   408: goto -> 117
    //   411: astore_2
    //   412: iload #5
    //   414: istore #4
    //   416: goto -> 170
    //   419: astore_0
    //   420: goto -> 276
    //   423: astore_0
    //   424: goto -> 300
    // Exception table:
    //   from	to	target	type
    //   96	117	406	java/lang/NoSuchMethodException
    //   135	150	411	java/lang/IllegalAccessException
    //   135	150	411	java/lang/reflect/InvocationTargetException
    //   161	170	411	java/lang/IllegalAccessException
    //   161	170	411	java/lang/reflect/InvocationTargetException
    //   259	276	419	java/lang/NoSuchFieldException
    //   288	297	423	java/lang/IllegalAccessException
  }
  
  public static void B(Parcel paramParcel, int paramInt) {
    if (paramParcel.dataPosition() == paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramInt).length() + 26);
    stringBuilder.append("Overread allowed size end=");
    stringBuilder.append(paramInt);
    throw new co(stringBuilder.toString(), paramParcel);
  }
  
  public static View C(View paramView, int paramInt) {
    if (!(paramView instanceof ViewGroup))
      return null; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    for (byte b = 0; b < i; b++) {
      paramView = viewGroup.getChildAt(b).findViewById(paramInt);
      if (paramView != null)
        return paramView; 
    } 
    return null;
  }
  
  public static du D(byte[] paramArrayOfbyte) {
    paramArrayOfbyte.getClass();
    if (paramArrayOfbyte.length <= 10240) {
      if (paramArrayOfbyte.length == 0)
        return du.b; 
      LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
      try {
        int i;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        this(paramArrayOfbyte);
        paramArrayOfbyte = new byte[2];
        byteArrayInputStream.read(paramArrayOfbyte);
        int j = 0;
        int k = 0;
        if (paramArrayOfbyte[0] == -84 && paramArrayOfbyte[1] == -19) {
          i = 1;
        } else {
          i = 0;
        } 
        byteArrayInputStream.reset();
        if (i) {
          ObjectInputStream objectInputStream = new ObjectInputStream();
          this(byteArrayInputStream);
          try {
            j = objectInputStream.readInt();
            for (i = k; i < j; i++)
              linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject()); 
          } finally {}
          objectInputStream.close();
        } else {
          DataInputStream dataInputStream = new DataInputStream();
          this(byteArrayInputStream);
          try {
            i = dataInputStream.readShort();
          } finally {
            Exception exception = null;
          } 
        } 
      } catch (IOException iOException) {
        String str = fu.a;
        qp0.h().g(str, "Error in Data#fromByteArray: ", iOException);
      } catch (ClassNotFoundException classNotFoundException) {}
      return new du(linkedHashMap);
    } 
    tp.f("Data cannot occupy more than 10240 bytes when serialized");
    return null;
  }
  
  public static final Serializable E(DataInputStream paramDataInputStream, int paramByte) {
    int i;
    if (paramByte == 0)
      return null; 
    if (paramByte == 1)
      return Boolean.valueOf(paramDataInputStream.readBoolean()); 
    if (paramByte == 2)
      return Byte.valueOf(paramDataInputStream.readByte()); 
    if (paramByte == 3)
      return Integer.valueOf(paramDataInputStream.readInt()); 
    if (paramByte == 4)
      return Long.valueOf(paramDataInputStream.readLong()); 
    if (paramByte == 5)
      return Float.valueOf(paramDataInputStream.readFloat()); 
    if (paramByte == 6)
      return Double.valueOf(paramDataInputStream.readDouble()); 
    if (paramByte == 7)
      return paramDataInputStream.readUTF(); 
    byte b1 = 0;
    byte b2 = 0;
    int k = 0;
    boolean bool1 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    int j = 0;
    if (paramByte == 8) {
      k = paramDataInputStream.readInt();
      Boolean[] arrayOfBoolean = new Boolean[k];
      for (paramByte = j; paramByte < k; paramByte++)
        arrayOfBoolean[paramByte] = Boolean.valueOf(paramDataInputStream.readBoolean()); 
      return (Serializable)arrayOfBoolean;
    } 
    if (paramByte == 9) {
      j = paramDataInputStream.readInt();
      Byte[] arrayOfByte = new Byte[j];
      for (i = b1; i < j; i++)
        arrayOfByte[i] = Byte.valueOf(paramDataInputStream.readByte()); 
      return (Serializable)arrayOfByte;
    } 
    if (i == 10) {
      int m = paramDataInputStream.readInt();
      Integer[] arrayOfInteger = new Integer[m];
      for (i = b2; i < m; i++)
        arrayOfInteger[i] = Integer.valueOf(paramDataInputStream.readInt()); 
      return (Serializable)arrayOfInteger;
    } 
    if (i == 11) {
      int m = paramDataInputStream.readInt();
      Long[] arrayOfLong = new Long[m];
      for (i = k; i < m; i++)
        arrayOfLong[i] = Long.valueOf(paramDataInputStream.readLong()); 
      return (Serializable)arrayOfLong;
    } 
    if (i == 12) {
      int m = paramDataInputStream.readInt();
      Float[] arrayOfFloat = new Float[m];
      for (i = bool1; i < m; i++)
        arrayOfFloat[i] = Float.valueOf(paramDataInputStream.readFloat()); 
      return (Serializable)arrayOfFloat;
    } 
    if (i == 13) {
      int m = paramDataInputStream.readInt();
      Double[] arrayOfDouble = new Double[m];
      for (i = bool3; i < m; i++)
        arrayOfDouble[i] = Double.valueOf(paramDataInputStream.readDouble()); 
      return (Serializable)arrayOfDouble;
    } 
    if (i == 14) {
      int m = paramDataInputStream.readInt();
      String[] arrayOfString = new String[m];
      for (i = bool2; i < m; i++) {
        String str2 = paramDataInputStream.readUTF();
        String str1 = str2;
        if (ui0.c(str2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"))
          str1 = null; 
        arrayOfString[i] = str1;
      } 
      return (Serializable)arrayOfString;
    } 
    tp.f(ga1.i("Unsupported type ", i));
    return null;
  }
  
  public static ByteBuffer G(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt >= 0) {
      int i = paramByteBuffer.limit();
      int j = paramByteBuffer.position();
      paramInt += j;
      if (paramInt >= j && paramInt <= i) {
        paramByteBuffer.limit(paramInt);
        try {
          ByteBuffer byteBuffer = paramByteBuffer.slice();
          byteBuffer.order(paramByteBuffer.order());
          paramByteBuffer.position(paramInt);
          return byteBuffer;
        } finally {
          paramByteBuffer.limit(i);
        } 
      } 
      throw new BufferUnderflowException();
    } 
    l0.k();
    return null;
  }
  
  public static Drawable I(Context paramContext, int paramInt) {
    return ig1.c().d(paramContext, paramInt);
  }
  
  public static ParcelFileDescriptor J(u00 paramu00, String paramString) {
    if (paramu00 instanceof wh) {
      paramu00 = paramu00;
      paramu00.q();
      return ((wh)paramu00).e;
    } 
    Uri uri2 = paramu00.j();
    Uri uri1 = uri2;
    if (lw0.N(uri2))
      uri1 = lw0.M(uri2); 
    return K(uri1, paramString);
  }
  
  public static ParcelFileDescriptor K(Uri paramUri, String paramString) {
    int i;
    Uri uri = paramUri;
    if (lw0.N(paramUri))
      uri = lw0.M(paramUri); 
    if ("content".equals(uri.getScheme()))
      return n21.f.getContentResolver().openFileDescriptor(uri, paramString); 
    String str = uri.getPath();
    if (paramString.contains("w")) {
      if (paramString.contains("t")) {
        i = 872415232;
      } else {
        i = 805306368;
      } 
    } else {
      i = 268435456;
    } 
    return ParcelFileDescriptor.open(new File(str), i);
  }
  
  public static ByteBuffer M(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() >= 4) {
      int i = paramByteBuffer.getInt();
      if (i >= 0) {
        if (i <= paramByteBuffer.remaining())
          return G(paramByteBuffer, i); 
        throw new Exception();
      } 
      l0.k();
      return null;
    } 
    throw new Exception();
  }
  
  public static Intent N(x5 paramx5) {
    Intent intent = paramx5.getParentActivityIntent();
    if (intent != null)
      return intent; 
    try {
      String str = P((Context)paramx5, paramx5.getComponentName());
      if (str == null)
        return null; 
      ComponentName componentName = new ComponentName((Context)paramx5, str);
      try {
        if (P((Context)paramx5, componentName) == null)
          return Intent.makeMainActivity(componentName); 
        null = new Intent();
        this();
        return null.setComponent(componentName);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        StringBuilder stringBuilder = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
        stringBuilder.append(str);
        stringBuilder.append("' in manifest");
        Log.e("NavUtils", stringBuilder.toString());
        return null;
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new IllegalArgumentException(nameNotFoundException);
    } 
  }
  
  public static Intent O(Context paramContext, ComponentName paramComponentName) {
    String str = P(paramContext, paramComponentName);
    if (str == null)
      return null; 
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    return (P(paramContext, paramComponentName) == null) ? Intent.makeMainActivity(paramComponentName) : (new Intent()).setComponent(paramComponentName);
  }
  
  public static String P(Context paramContext, ComponentName paramComponentName) {
    int i;
    PackageManager packageManager = paramContext.getPackageManager();
    if (Build.VERSION.SDK_INT >= 29) {
      i = 269222528;
    } else {
      i = 787072;
    } 
    ActivityInfo activityInfo = packageManager.getActivityInfo(paramComponentName, i);
    String str2 = activityInfo.parentActivityName;
    if (str2 != null)
      return str2; 
    Bundle bundle = activityInfo.metaData;
    if (bundle == null)
      return null; 
    String str1 = bundle.getString("android.support.PARENT_ACTIVITY");
    if (str1 == null)
      return null; 
    if (str1.charAt(0) == '.') {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append(str1);
      return stringBuilder.toString();
    } 
    return str1;
  }
  
  public static String Q() {
    if (l) {
      StringBuilder stringBuilder = new StringBuilder("(");
      stringBuilder.append(MyApplication.y(2131886736));
      stringBuilder.append(")");
      return stringBuilder.toString();
    } 
    if (m) {
      StringBuilder stringBuilder = new StringBuilder("(");
      stringBuilder.append(MyApplication.y(2131887465));
      stringBuilder.append(")");
      return stringBuilder.toString();
    } 
    return "";
  }
  
  public static boolean S() {
    return (Build.VERSION.SDK_INT >= 26);
  }
  
  public static boolean U() {
    return (l || m);
  }
  
  public static void W(ByteBuffer paramByteBuffer, CertificateFactory paramCertificateFactory, h12 paramh12, HashSet paramHashSet) {
    // Byte code:
    //   0: aload_2
    //   1: getfield g : Ljava/util/ArrayList;
    //   4: astore #11
    //   6: aload_0
    //   7: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   10: astore #16
    //   12: aload #16
    //   14: aload #16
    //   16: invokevirtual remaining : ()I
    //   19: newarray byte
    //   21: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
    //   24: pop
    //   25: aload #16
    //   27: invokevirtual flip : ()Ljava/nio/Buffer;
    //   30: pop
    //   31: aload_2
    //   32: getfield b : Ljava/util/ArrayList;
    //   35: astore #12
    //   37: aload_2
    //   38: getfield a : Ljava/util/ArrayList;
    //   41: astore #15
    //   43: aload_2
    //   44: getfield d : Ljava/util/ArrayList;
    //   47: astore #13
    //   49: aload_0
    //   50: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   53: astore #8
    //   55: aload_0
    //   56: invokestatic f0 : (Ljava/nio/ByteBuffer;)[B
    //   59: astore #14
    //   61: new java/util/ArrayList
    //   64: dup
    //   65: iconst_1
    //   66: invokespecial <init> : (I)V
    //   69: astore #17
    //   71: iconst_0
    //   72: istore #4
    //   74: aload #8
    //   76: astore_0
    //   77: aload_0
    //   78: invokevirtual hasRemaining : ()Z
    //   81: ifeq -> 268
    //   84: iload #4
    //   86: iconst_1
    //   87: iadd
    //   88: istore #5
    //   90: aload_0
    //   91: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   94: astore #8
    //   96: aload #8
    //   98: invokevirtual getInt : ()I
    //   101: istore #7
    //   103: aload #8
    //   105: invokestatic f0 : (Ljava/nio/ByteBuffer;)[B
    //   108: astore #9
    //   110: new g12
    //   113: astore #8
    //   115: aload #8
    //   117: iload #7
    //   119: invokespecial <init> : (I)V
    //   122: aload #13
    //   124: aload #8
    //   126: invokevirtual add : (Ljava/lang/Object;)Z
    //   129: pop
    //   130: invokestatic values : ()[Lxm1;
    //   133: astore #10
    //   135: aload #10
    //   137: arraylength
    //   138: istore #6
    //   140: iconst_0
    //   141: istore #4
    //   143: iload #4
    //   145: iload #6
    //   147: if_icmpge -> 176
    //   150: aload #10
    //   152: iload #4
    //   154: aaload
    //   155: astore #8
    //   157: aload #8
    //   159: getfield b : I
    //   162: iload #7
    //   164: if_icmpne -> 170
    //   167: goto -> 179
    //   170: iinc #4, 1
    //   173: goto -> 143
    //   176: aconst_null
    //   177: astore #8
    //   179: aload #8
    //   181: ifnonnull -> 219
    //   184: new z81
    //   187: astore #8
    //   189: aload #8
    //   191: bipush #40
    //   193: iconst_1
    //   194: anewarray java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: iload #7
    //   201: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   204: aastore
    //   205: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   208: aload #11
    //   210: aload #8
    //   212: invokevirtual add : (Ljava/lang/Object;)Z
    //   215: pop
    //   216: goto -> 241
    //   219: new j12
    //   222: astore #10
    //   224: aload #10
    //   226: aload #8
    //   228: aload #9
    //   230: invokespecial <init> : (Lxm1;[B)V
    //   233: aload #17
    //   235: aload #10
    //   237: invokevirtual add : (Ljava/lang/Object;)Z
    //   240: pop
    //   241: iload #5
    //   243: istore #4
    //   245: goto -> 77
    //   248: astore_0
    //   249: aload_2
    //   250: bipush #36
    //   252: iconst_1
    //   253: anewarray java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: iload #5
    //   260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   263: aastore
    //   264: invokevirtual a : (I[Ljava/lang/Object;)V
    //   267: return
    //   268: aload #13
    //   270: invokevirtual isEmpty : ()Z
    //   273: ifeq -> 287
    //   276: aload_2
    //   277: bipush #44
    //   279: iconst_0
    //   280: anewarray java/lang/Object
    //   283: invokevirtual a : (I[Ljava/lang/Object;)V
    //   286: return
    //   287: aload #17
    //   289: invokevirtual size : ()I
    //   292: istore #4
    //   294: aconst_null
    //   295: astore #8
    //   297: iconst_0
    //   298: istore #5
    //   300: aconst_null
    //   301: astore_0
    //   302: iload #5
    //   304: iload #4
    //   306: if_icmpge -> 462
    //   309: aload #17
    //   311: iload #5
    //   313: invokevirtual get : (I)Ljava/lang/Object;
    //   316: astore #9
    //   318: iinc #5, 1
    //   321: aload #9
    //   323: checkcast j12
    //   326: astore #10
    //   328: aload #10
    //   330: getfield a : Lxm1;
    //   333: astore #9
    //   335: aload_0
    //   336: ifnull -> 445
    //   339: aload #9
    //   341: getfield e : Lpr;
    //   344: astore #19
    //   346: aload_0
    //   347: getfield e : Lpr;
    //   350: astore #18
    //   352: aload #19
    //   354: invokevirtual ordinal : ()I
    //   357: istore #6
    //   359: iload #6
    //   361: ifeq -> 406
    //   364: iload #6
    //   366: iconst_1
    //   367: if_icmpne -> 402
    //   370: aload #18
    //   372: invokevirtual ordinal : ()I
    //   375: istore #6
    //   377: iload #6
    //   379: ifeq -> 445
    //   382: iload #6
    //   384: iconst_1
    //   385: if_icmpne -> 398
    //   388: aload #8
    //   390: astore #10
    //   392: aload_0
    //   393: astore #9
    //   395: goto -> 452
    //   398: invokestatic k : ()V
    //   401: return
    //   402: invokestatic k : ()V
    //   405: return
    //   406: aload #18
    //   408: invokevirtual ordinal : ()I
    //   411: istore #6
    //   413: aload #8
    //   415: astore #10
    //   417: aload_0
    //   418: astore #9
    //   420: iload #6
    //   422: ifeq -> 452
    //   425: iload #6
    //   427: iconst_1
    //   428: if_icmpne -> 441
    //   431: aload #8
    //   433: astore #10
    //   435: aload_0
    //   436: astore #9
    //   438: goto -> 452
    //   441: invokestatic k : ()V
    //   444: return
    //   445: aload #10
    //   447: getfield b : [B
    //   450: astore #10
    //   452: aload #10
    //   454: astore #8
    //   456: aload #9
    //   458: astore_0
    //   459: goto -> 302
    //   462: aload_0
    //   463: ifnonnull -> 473
    //   466: getstatic java/util/Collections.EMPTY_LIST : Ljava/util/List;
    //   469: astore_0
    //   470: goto -> 487
    //   473: new j12
    //   476: dup
    //   477: aload_0
    //   478: aload #8
    //   480: invokespecial <init> : (Lxm1;[B)V
    //   483: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   486: astore_0
    //   487: aload_0
    //   488: invokeinterface isEmpty : ()Z
    //   493: ifeq -> 507
    //   496: aload_2
    //   497: bipush #45
    //   499: iconst_0
    //   500: anewarray java/lang/Object
    //   503: invokevirtual a : (I[Ljava/lang/Object;)V
    //   506: return
    //   507: aload_0
    //   508: invokeinterface iterator : ()Ljava/util/Iterator;
    //   513: astore_0
    //   514: aload_0
    //   515: invokeinterface hasNext : ()Z
    //   520: ifeq -> 752
    //   523: aload_0
    //   524: invokeinterface next : ()Ljava/lang/Object;
    //   529: checkcast j12
    //   532: astore #9
    //   534: aload #9
    //   536: getfield a : Lxm1;
    //   539: astore #8
    //   541: aload #8
    //   543: getfield f : Ls51;
    //   546: astore #10
    //   548: aload #10
    //   550: getfield a : Ljava/lang/Object;
    //   553: checkcast java/lang/String
    //   556: astore #17
    //   558: aload #10
    //   560: getfield b : Ljava/lang/Object;
    //   563: checkcast java/security/spec/AlgorithmParameterSpec
    //   566: astore #10
    //   568: aload #8
    //   570: getfield c : Ljava/lang/String;
    //   573: astore #18
    //   575: aload #18
    //   577: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   580: astore #18
    //   582: new java/security/spec/X509EncodedKeySpec
    //   585: astore #19
    //   587: aload #19
    //   589: aload #14
    //   591: invokespecial <init> : ([B)V
    //   594: aload #18
    //   596: aload #19
    //   598: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   601: astore #18
    //   603: aload #17
    //   605: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/Signature;
    //   608: astore #17
    //   610: aload #17
    //   612: aload #18
    //   614: invokevirtual initVerify : (Ljava/security/PublicKey;)V
    //   617: aload #10
    //   619: ifnull -> 629
    //   622: aload #17
    //   624: aload #10
    //   626: invokevirtual setParameter : (Ljava/security/spec/AlgorithmParameterSpec;)V
    //   629: goto -> 644
    //   632: astore_0
    //   633: goto -> 716
    //   636: astore_0
    //   637: goto -> 716
    //   640: astore_0
    //   641: goto -> 716
    //   644: aload #16
    //   646: iconst_0
    //   647: invokevirtual position : (I)Ljava/nio/Buffer;
    //   650: pop
    //   651: aload #17
    //   653: aload #16
    //   655: invokevirtual update : (Ljava/nio/ByteBuffer;)V
    //   658: aload #9
    //   660: getfield b : [B
    //   663: astore #9
    //   665: aload #17
    //   667: aload #9
    //   669: invokevirtual verify : ([B)Z
    //   672: ifne -> 691
    //   675: aload_2
    //   676: bipush #43
    //   678: iconst_1
    //   679: anewarray java/lang/Object
    //   682: dup
    //   683: iconst_0
    //   684: aload #8
    //   686: aastore
    //   687: invokevirtual a : (I[Ljava/lang/Object;)V
    //   690: return
    //   691: aload_2
    //   692: getfield e : Ljava/util/HashMap;
    //   695: aload #8
    //   697: aload #9
    //   699: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   702: pop
    //   703: aload_3
    //   704: aload #8
    //   706: getfield e : Lpr;
    //   709: invokevirtual add : (Ljava/lang/Object;)Z
    //   712: pop
    //   713: goto -> 514
    //   716: aload_2
    //   717: bipush #42
    //   719: iconst_2
    //   720: anewarray java/lang/Object
    //   723: dup
    //   724: iconst_0
    //   725: aload #8
    //   727: aastore
    //   728: dup
    //   729: iconst_1
    //   730: aload_0
    //   731: aastore
    //   732: invokevirtual a : (I[Ljava/lang/Object;)V
    //   735: return
    //   736: astore_0
    //   737: aload_2
    //   738: bipush #34
    //   740: iconst_1
    //   741: anewarray java/lang/Object
    //   744: dup
    //   745: iconst_0
    //   746: aload_0
    //   747: aastore
    //   748: invokevirtual a : (I[Ljava/lang/Object;)V
    //   751: return
    //   752: aload #16
    //   754: iconst_0
    //   755: invokevirtual position : (I)Ljava/nio/Buffer;
    //   758: pop
    //   759: aload #16
    //   761: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   764: astore_3
    //   765: aload #16
    //   767: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   770: astore #8
    //   772: aload #16
    //   774: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   777: astore_0
    //   778: iconst_m1
    //   779: istore #4
    //   781: aload #8
    //   783: invokevirtual hasRemaining : ()Z
    //   786: ifeq -> 889
    //   789: iload #4
    //   791: iconst_1
    //   792: iadd
    //   793: istore #5
    //   795: aload #8
    //   797: invokestatic f0 : (Ljava/nio/ByteBuffer;)[B
    //   800: astore #9
    //   802: aload #9
    //   804: invokestatic a : ([B)V
    //   807: new java/io/ByteArrayInputStream
    //   810: astore #10
    //   812: aload #10
    //   814: aload #9
    //   816: invokespecial <init> : ([B)V
    //   819: aload_1
    //   820: aload #10
    //   822: invokevirtual generateCertificate : (Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   825: checkcast java/security/cert/X509Certificate
    //   828: astore #10
    //   830: aload #15
    //   832: new e12
    //   835: dup
    //   836: aload #10
    //   838: aload #9
    //   840: iconst_0
    //   841: invokespecial <init> : (Ljava/security/cert/X509Certificate;[BI)V
    //   844: invokevirtual add : (Ljava/lang/Object;)Z
    //   847: pop
    //   848: iload #5
    //   850: istore #4
    //   852: goto -> 781
    //   855: astore_0
    //   856: aload_2
    //   857: bipush #35
    //   859: iconst_3
    //   860: anewarray java/lang/Object
    //   863: dup
    //   864: iconst_0
    //   865: iload #5
    //   867: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   870: aastore
    //   871: dup
    //   872: iconst_1
    //   873: iload #4
    //   875: iconst_2
    //   876: iadd
    //   877: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   880: aastore
    //   881: dup
    //   882: iconst_2
    //   883: aload_0
    //   884: aastore
    //   885: invokevirtual a : (I[Ljava/lang/Object;)V
    //   888: return
    //   889: aload #15
    //   891: invokevirtual isEmpty : ()Z
    //   894: ifeq -> 908
    //   897: aload_2
    //   898: bipush #46
    //   900: iconst_0
    //   901: anewarray java/lang/Object
    //   904: invokevirtual a : (I[Ljava/lang/Object;)V
    //   907: return
    //   908: aload #15
    //   910: iconst_0
    //   911: invokevirtual get : (I)Ljava/lang/Object;
    //   914: checkcast java/security/cert/X509Certificate
    //   917: invokevirtual getPublicKey : ()Ljava/security/PublicKey;
    //   920: invokeinterface getEncoded : ()[B
    //   925: astore_1
    //   926: aload #14
    //   928: aload_1
    //   929: invokestatic equals : ([B[B)Z
    //   932: ifne -> 961
    //   935: aload_2
    //   936: bipush #47
    //   938: iconst_2
    //   939: anewarray java/lang/Object
    //   942: dup
    //   943: iconst_0
    //   944: aload_1
    //   945: invokestatic p0 : ([B)Ljava/lang/String;
    //   948: aastore
    //   949: dup
    //   950: iconst_1
    //   951: aload #14
    //   953: invokestatic p0 : ([B)Ljava/lang/String;
    //   956: aastore
    //   957: invokevirtual a : (I[Ljava/lang/Object;)V
    //   960: return
    //   961: iconst_0
    //   962: istore #4
    //   964: aload_3
    //   965: invokevirtual hasRemaining : ()Z
    //   968: ifeq -> 1034
    //   971: iinc #4, 1
    //   974: aload_3
    //   975: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   978: astore_1
    //   979: aload_1
    //   980: invokevirtual getInt : ()I
    //   983: istore #5
    //   985: aload_1
    //   986: invokestatic f0 : (Ljava/nio/ByteBuffer;)[B
    //   989: astore_1
    //   990: new f12
    //   993: astore #8
    //   995: aload #8
    //   997: iload #5
    //   999: aload_1
    //   1000: invokespecial <init> : (I[B)V
    //   1003: aload #12
    //   1005: aload #8
    //   1007: invokevirtual add : (Ljava/lang/Object;)Z
    //   1010: pop
    //   1011: goto -> 964
    //   1014: astore_0
    //   1015: aload_2
    //   1016: bipush #37
    //   1018: iconst_1
    //   1019: anewarray java/lang/Object
    //   1022: dup
    //   1023: iconst_0
    //   1024: iload #4
    //   1026: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1029: aastore
    //   1030: invokevirtual a : (I[Ljava/lang/Object;)V
    //   1033: return
    //   1034: new java/util/ArrayList
    //   1037: dup
    //   1038: aload #13
    //   1040: invokevirtual size : ()I
    //   1043: invokespecial <init> : (I)V
    //   1046: astore_1
    //   1047: aload #13
    //   1049: invokevirtual size : ()I
    //   1052: istore #5
    //   1054: iconst_0
    //   1055: istore #4
    //   1057: iload #4
    //   1059: iload #5
    //   1061: if_icmpge -> 1093
    //   1064: aload #13
    //   1066: iload #4
    //   1068: invokevirtual get : (I)Ljava/lang/Object;
    //   1071: astore_3
    //   1072: iinc #4, 1
    //   1075: aload_1
    //   1076: aload_3
    //   1077: checkcast g12
    //   1080: getfield a : I
    //   1083: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1086: invokevirtual add : (Ljava/lang/Object;)Z
    //   1089: pop
    //   1090: goto -> 1057
    //   1093: new java/util/ArrayList
    //   1096: dup
    //   1097: aload #12
    //   1099: invokevirtual size : ()I
    //   1102: invokespecial <init> : (I)V
    //   1105: astore #8
    //   1107: aload #12
    //   1109: invokevirtual size : ()I
    //   1112: istore #5
    //   1114: iconst_0
    //   1115: istore #4
    //   1117: iload #4
    //   1119: iload #5
    //   1121: if_icmpge -> 1154
    //   1124: aload #12
    //   1126: iload #4
    //   1128: invokevirtual get : (I)Ljava/lang/Object;
    //   1131: astore_3
    //   1132: iinc #4, 1
    //   1135: aload #8
    //   1137: aload_3
    //   1138: checkcast f12
    //   1141: getfield a : I
    //   1144: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1147: invokevirtual add : (Ljava/lang/Object;)Z
    //   1150: pop
    //   1151: goto -> 1117
    //   1154: aload_1
    //   1155: aload #8
    //   1157: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1160: ifne -> 1183
    //   1163: aload_2
    //   1164: bipush #48
    //   1166: iconst_2
    //   1167: anewarray java/lang/Object
    //   1170: dup
    //   1171: iconst_0
    //   1172: aload_1
    //   1173: aastore
    //   1174: dup
    //   1175: iconst_1
    //   1176: aload #8
    //   1178: aastore
    //   1179: invokevirtual a : (I[Ljava/lang/Object;)V
    //   1182: return
    //   1183: aload_0
    //   1184: invokevirtual hasRemaining : ()Z
    //   1187: ifeq -> 1259
    //   1190: aload_0
    //   1191: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   1194: astore_1
    //   1195: aload_1
    //   1196: invokevirtual getInt : ()I
    //   1199: istore #4
    //   1201: aload_1
    //   1202: invokestatic f0 : (Ljava/nio/ByteBuffer;)[B
    //   1205: pop
    //   1206: aload_2
    //   1207: getfield f : Ljava/util/ArrayList;
    //   1210: astore_1
    //   1211: new zb0
    //   1214: astore_3
    //   1215: aload_3
    //   1216: bipush #18
    //   1218: invokespecial <init> : (I)V
    //   1221: aload_1
    //   1222: aload_3
    //   1223: invokevirtual add : (Ljava/lang/Object;)Z
    //   1226: pop
    //   1227: new z81
    //   1230: astore_1
    //   1231: aload_1
    //   1232: bipush #41
    //   1234: iconst_1
    //   1235: anewarray java/lang/Object
    //   1238: dup
    //   1239: iconst_0
    //   1240: iload #4
    //   1242: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1245: aastore
    //   1246: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   1249: aload #11
    //   1251: aload_1
    //   1252: invokevirtual add : (Ljava/lang/Object;)Z
    //   1255: pop
    //   1256: goto -> 1183
    //   1259: return
    //   1260: astore_0
    //   1261: goto -> 1259
    // Exception table:
    //   from	to	target	type
    //   90	140	248	o5
    //   90	140	248	java/nio/BufferUnderflowException
    //   157	167	248	o5
    //   157	167	248	java/nio/BufferUnderflowException
    //   184	216	248	o5
    //   184	216	248	java/nio/BufferUnderflowException
    //   219	241	248	o5
    //   219	241	248	java/nio/BufferUnderflowException
    //   575	603	736	java/lang/Exception
    //   603	617	640	java/security/InvalidKeyException
    //   603	617	636	java/security/InvalidAlgorithmParameterException
    //   603	617	632	java/security/SignatureException
    //   622	629	640	java/security/InvalidKeyException
    //   622	629	636	java/security/InvalidAlgorithmParameterException
    //   622	629	632	java/security/SignatureException
    //   644	690	640	java/security/InvalidKeyException
    //   644	690	636	java/security/InvalidAlgorithmParameterException
    //   644	690	632	java/security/SignatureException
    //   691	713	640	java/security/InvalidKeyException
    //   691	713	636	java/security/InvalidAlgorithmParameterException
    //   691	713	632	java/security/SignatureException
    //   807	830	855	java/security/cert/CertificateException
    //   974	1011	1014	o5
    //   974	1011	1014	java/nio/BufferUnderflowException
    //   1190	1256	1260	o5
    //   1190	1256	1260	java/nio/BufferUnderflowException
  }
  
  public static boolean Z(Parcel paramParcel, int paramInt) {
    x0(paramParcel, paramInt, 4);
    return (paramParcel.readInt() != 0);
  }
  
  public static Boolean a0(Parcel paramParcel, int paramInt) {
    boolean bool;
    paramInt = h0(paramParcel, paramInt);
    if (paramInt == 0)
      return null; 
    z0(paramParcel, paramInt);
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return Boolean.valueOf(bool);
  }
  
  public static double b0(Parcel paramParcel, int paramInt) {
    x0(paramParcel, paramInt, 8);
    return paramParcel.readDouble();
  }
  
  public static void c(StringBuilder paramStringBuilder, Object paramObject, wc0 paramwc0) {
    boolean bool;
    if (paramwc0 != null) {
      paramStringBuilder.append((CharSequence)paramwc0.h(paramObject));
      return;
    } 
    if (paramObject == null) {
      bool = true;
    } else {
      bool = paramObject instanceof CharSequence;
    } 
    if (bool) {
      paramStringBuilder.append((CharSequence)paramObject);
      return;
    } 
    if (paramObject instanceof Character) {
      paramStringBuilder.append(((Character)paramObject).charValue());
      return;
    } 
    paramStringBuilder.append(paramObject.toString());
  }
  
  public static IBinder c0(Parcel paramParcel, int paramInt) {
    paramInt = h0(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    IBinder iBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return iBinder;
  }
  
  public static void d() {
    if (j == null) {
      PowerManager.WakeLock wakeLock = MyApplication.p().newWakeLock(1, "musicolet:BR_WAKELOCKS");
      j = wakeLock;
      wakeLock.setReferenceCounted(true);
    } 
    j.acquire(10000L);
  }
  
  public static int d0(Parcel paramParcel, int paramInt) {
    x0(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static final Object e(ho0 paramho0, pr1 parampr1) {
    try {
      if (paramho0.isDone())
        return e0.g(paramho0); 
      ni ni = new ni(1, dd1.N(parampr1));
      paramho0.a(new bv1(paramho0, ni, 1), tz.b);
      ni.z(new jo0(paramho0));
      return ni.v();
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      if (throwable != null)
        throw throwable; 
      throwable = new NullPointerException();
      ui0.W((RuntimeException)throwable, ui0.class.getName());
      throw throwable;
    } 
  }
  
  public static Integer e0(Parcel paramParcel, int paramInt) {
    paramInt = h0(paramParcel, paramInt);
    if (paramInt == 0)
      return null; 
    z0(paramParcel, paramInt);
    return Integer.valueOf(paramParcel.readInt());
  }
  
  public static final int f(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    paramArrayOfint.getClass();
    paramInt1--;
    int i = 0;
    while (i <= paramInt1) {
      int k = i + paramInt1 >>> 1;
      int j = paramArrayOfint[k];
      if (j < paramInt2) {
        i = k + 1;
        continue;
      } 
      if (j > paramInt2) {
        paramInt1 = k - 1;
        continue;
      } 
      return k;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static byte[] f0(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    if (i >= 0) {
      if (i <= paramByteBuffer.remaining()) {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        return arrayOfByte;
      } 
      throw new Exception();
    } 
    throw new Exception();
  }
  
  public static final int g(long[] paramArrayOflong, int paramInt, long paramLong) {
    paramArrayOflong.getClass();
    paramInt--;
    int i = 0;
    while (i <= paramInt) {
      int j = i + paramInt >>> 1;
      int k = paramArrayOflong[j] cmp paramLong;
      if (k < 0) {
        i = j + 1;
        continue;
      } 
      if (k > 0) {
        paramInt = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static long g0(Parcel paramParcel, int paramInt) {
    x0(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static dl1 h(dl1 paramdl1) {
    kr0 kr0 = paramdl1.b;
    kr0.b();
    return (kr0.k > 0) ? paramdl1 : dl1.c;
  }
  
  public static int h0(Parcel paramParcel, int paramInt) {
    return ((paramInt & 0xFFFF0000) != -65536) ? (char)(paramInt >> 16) : paramParcel.readInt();
  }
  
  public static void i0() {
    boolean bool2 = NativeLibx.a0(0);
    boolean bool1 = NativeLibx.a0(1);
    StringBuilder stringBuilder = new StringBuilder("IP:rpvft>");
    stringBuilder.append(bool2);
    stringBuilder.append(",");
    stringBuilder.append(bool1);
    n21.F(stringBuilder.toString());
    if (bool2)
      l = true; 
    if (bool1)
      m = true; 
    lf lf = lf.p;
    lf.getClass();
    lf.l(new y2(0, 2, lf));
  }
  
  public static int j0(float paramFloat) {
    if (!Float.isNaN(paramFloat))
      return Math.round(paramFloat); 
    l0.l("Cannot round NaN value.");
    return 0;
  }
  
  public static int l(Comparable<Comparable> paramComparable1, Comparable paramComparable2) {
    return (paramComparable1 == paramComparable2) ? 0 : ((paramComparable1 == null) ? -1 : ((paramComparable2 == null) ? 1 : paramComparable1.compareTo(paramComparable2)));
  }
  
  public static Bundle m(Parcel paramParcel, int paramInt) {
    int i = h0(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    Bundle bundle = paramParcel.readBundle();
    paramParcel.setDataPosition(paramInt + i);
    return bundle;
  }
  
  public static void m0(Parcel paramParcel, int paramInt) {
    paramInt = h0(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static FileInputStream n(u00 paramu00) {
    if (paramu00 instanceof wh) {
      paramu00 = paramu00;
      paramu00.q();
      return ((wh)paramu00).f;
    } 
    Uri uri2 = paramu00.j();
    Uri uri1 = uri2;
    if (lw0.N(uri2))
      uri1 = lw0.M(uri2); 
    if ("file".equals(uri1.getScheme()))
      return new FileInputStream(uri1.getPath()); 
    ParcelFileDescriptor parcelFileDescriptor = J(paramu00, "r");
    s70 s70 = new s70(parcelFileDescriptor.getFileDescriptor(), 0);
    s70.c = (Closeable)parcelFileDescriptor;
    return s70;
  }
  
  public static byte[] n0(du paramdu) {
    paramdu.getClass();
    HashMap hashMap = paramdu.a;
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      DataOutputStream dataOutputStream = new DataOutputStream();
      this(byteArrayOutputStream);
      try {
        dataOutputStream.writeShort(-21521);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet())
          o0(dataOutputStream, (String)entry.getKey(), entry.getValue()); 
      } finally {}
      dataOutputStream.flush();
      if (dataOutputStream.size() <= 10240) {
        byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
        dataOutputStream.close();
        arrayOfByte.getClass();
        return arrayOfByte;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("Data cannot occupy more than 10240 bytes when serialized");
      throw illegalStateException;
    } catch (IOException iOException) {
      String str = fu.a;
      qp0.h().g(str, "Error in Data#toByteArray: ", iOException);
      return new byte[0];
    } 
  }
  
  public static FileOutputStream o(u00 paramu00) {
    if (!paramu00.l() && paramu00 instanceof v00)
      ((v00)paramu00).p(); 
    Uri uri2 = paramu00.j();
    Uri uri1 = uri2;
    if (lw0.N(uri2))
      uri1 = lw0.M(uri2); 
    return "file".equals(uri1.getScheme()) ? new FileOutputStream(uri1.getPath()) : new t70(J(paramu00, "wt"));
  }
  
  public static final void o0(DataOutputStream paramDataOutputStream, String paramString, Object paramObject) {
    if (paramObject == null) {
      paramDataOutputStream.writeByte(0);
    } else if (paramObject instanceof Boolean) {
      paramDataOutputStream.writeByte(1);
      paramDataOutputStream.writeBoolean(((Boolean)paramObject).booleanValue());
    } else if (paramObject instanceof Byte) {
      paramDataOutputStream.writeByte(2);
      paramDataOutputStream.writeByte(((Number)paramObject).byteValue());
    } else if (paramObject instanceof Integer) {
      paramDataOutputStream.writeByte(3);
      paramDataOutputStream.writeInt(((Number)paramObject).intValue());
    } else if (paramObject instanceof Long) {
      paramDataOutputStream.writeByte(4);
      paramDataOutputStream.writeLong(((Number)paramObject).longValue());
    } else if (paramObject instanceof Float) {
      paramDataOutputStream.writeByte(5);
      paramDataOutputStream.writeFloat(((Number)paramObject).floatValue());
    } else if (paramObject instanceof Double) {
      paramDataOutputStream.writeByte(6);
      paramDataOutputStream.writeDouble(((Number)paramObject).doubleValue());
    } else if (paramObject instanceof String) {
      paramDataOutputStream.writeByte(7);
      paramDataOutputStream.writeUTF((String)paramObject);
    } else if (paramObject instanceof Object[]) {
      byte b1;
      Object[] arrayOfObject = (Object[])paramObject;
      paramObject = ne1.a(arrayOfObject.getClass());
      if (paramObject.equals(ne1.a(Boolean[].class))) {
        b1 = 8;
      } else if (paramObject.equals(ne1.a(Byte[].class))) {
        b1 = 9;
      } else if (paramObject.equals(ne1.a(Integer[].class))) {
        b1 = 10;
      } else if (paramObject.equals(ne1.a(Long[].class))) {
        b1 = 11;
      } else if (paramObject.equals(ne1.a(Float[].class))) {
        b1 = 12;
      } else if (paramObject.equals(ne1.a(Double[].class))) {
        b1 = 13;
      } else if (paramObject.equals(ne1.a(String[].class))) {
        b1 = 14;
      } else {
        tp.g("Unsupported value type ", ne1.a(arrayOfObject.getClass()).b());
        return;
      } 
      paramDataOutputStream.writeByte(b1);
      paramDataOutputStream.writeInt(arrayOfObject.length);
      int i = arrayOfObject.length;
      for (byte b2 = 0; b2 < i; b2++) {
        Object object7 = arrayOfObject[b2];
        Object object3 = null;
        Object object2 = null;
        Object object5 = null;
        Object object1 = null;
        Object object6 = null;
        Object object4 = null;
        paramObject = null;
        if (b1 == 8) {
          boolean bool;
          if (object7 instanceof Boolean)
            paramObject = object7; 
          if (paramObject != null) {
            bool = paramObject.booleanValue();
          } else {
            bool = false;
          } 
          paramDataOutputStream.writeBoolean(bool);
        } else if (b1 == 9) {
          boolean bool;
          paramObject = object3;
          if (object7 instanceof Byte)
            paramObject = object7; 
          if (paramObject != null) {
            bool = paramObject.byteValue();
          } else {
            bool = false;
          } 
          paramDataOutputStream.writeByte(bool);
        } else if (b1 == 10) {
          boolean bool;
          paramObject = object2;
          if (object7 instanceof Integer)
            paramObject = object7; 
          if (paramObject != null) {
            bool = paramObject.intValue();
          } else {
            bool = false;
          } 
          paramDataOutputStream.writeInt(bool);
        } else if (b1 == 11) {
          long l;
          paramObject = object5;
          if (object7 instanceof Long)
            paramObject = object7; 
          if (paramObject != null) {
            l = paramObject.longValue();
          } else {
            l = 0L;
          } 
          paramDataOutputStream.writeLong(l);
        } else if (b1 == 12) {
          float f;
          paramObject = object1;
          if (object7 instanceof Float)
            paramObject = object7; 
          if (paramObject != null) {
            f = paramObject.floatValue();
          } else {
            f = 0.0F;
          } 
          paramDataOutputStream.writeFloat(f);
        } else if (b1 == 13) {
          double d;
          paramObject = object6;
          if (object7 instanceof Double)
            paramObject = object7; 
          if (paramObject != null) {
            d = paramObject.doubleValue();
          } else {
            d = 0.0D;
          } 
          paramDataOutputStream.writeDouble(d);
        } else if (b1 == 14) {
          paramObject = object4;
          if (object7 instanceof String)
            paramObject = object7; 
          object1 = paramObject;
          if (paramObject == null)
            object1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"; 
          paramDataOutputStream.writeUTF((String)object1);
        } 
      } 
    } else {
      tp.g("Unsupported value type ", ne1.a(paramObject.getClass()).c());
      return;
    } 
    paramDataOutputStream.writeUTF(paramString);
  }
  
  public static int[] p(Parcel paramParcel, int paramInt) {
    int i = h0(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    int[] arrayOfInt = paramParcel.createIntArray();
    paramParcel.setDataPosition(paramInt + i);
    return arrayOfInt;
  }
  
  public static String p0(byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    int i = paramArrayOfbyte.length;
    for (byte b = 0; b < i; b++) {
      byte b1 = paramArrayOfbyte[b];
      char[] arrayOfChar = i;
      stringBuilder.append(arrayOfChar[(b1 & 0xFF) >>> 4]);
      stringBuilder.append(arrayOfChar[b1 & 0xF]);
    } 
    return stringBuilder.toString();
  }
  
  public static long[] q(Parcel paramParcel, int paramInt) {
    paramInt = h0(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    long[] arrayOfLong = paramParcel.createLongArray();
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfLong;
  }
  
  public static int q0(Parcel paramParcel) {
    int k = paramParcel.readInt();
    int j = h0(paramParcel, k);
    char c = (char)k;
    int i = paramParcel.dataPosition();
    if (c == '佅') {
      int m = j + i;
      if (m >= i && m <= paramParcel.dataSize())
        return m; 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(m).length());
      stringBuilder.append("Size read is invalid start=");
      stringBuilder.append(i);
      stringBuilder.append(" end=");
      stringBuilder.append(m);
      throw new co(stringBuilder.toString(), paramParcel);
    } 
    throw new co("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(k))), paramParcel);
  }
  
  public static OutputStream r(u00 paramu00) {
    if (!paramu00.l() && paramu00 instanceof v00)
      ((v00)paramu00).p(); 
    Uri uri2 = paramu00.j();
    Uri uri1 = uri2;
    if (lw0.N(uri2))
      uri1 = lw0.M(uri2); 
    return "file".equals(uri1.getScheme()) ? new FileOutputStream(uri1.getPath()) : n21.f.getContentResolver().openOutputStream(uri1, uvJYmft.kRVnFsXgPlMTP);
  }
  
  public static of r0(vc1 paramvc1, q5 paramq5) {
    // Byte code:
    //   0: new java/lang/Object
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #20
    //   9: aload #20
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: putfield d : Ljava/lang/Object;
    //   21: aload #20
    //   23: new java/util/ArrayList
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: putfield b : Ljava/lang/Object;
    //   33: aload #20
    //   35: new java/util/ArrayList
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: putfield c : Ljava/lang/Object;
    //   45: aload #20
    //   47: getfield c : Ljava/lang/Object;
    //   50: checkcast java/util/ArrayList
    //   53: astore #23
    //   55: aload #20
    //   57: getfield d : Ljava/lang/Object;
    //   60: checkcast java/util/ArrayList
    //   63: astore #21
    //   65: aload_1
    //   66: getfield d : Ljava/nio/ByteBuffer;
    //   69: astore #22
    //   71: aload_1
    //   72: getfield a : J
    //   75: lstore #11
    //   77: aload_1
    //   78: getfield b : J
    //   81: lstore #13
    //   83: aload_1
    //   84: getfield c : J
    //   87: lstore #9
    //   89: lload #13
    //   91: lload #11
    //   93: ladd
    //   94: lload #9
    //   96: lcmp
    //   97: ifne -> 1292
    //   100: lload #11
    //   102: ldc2_w 32
    //   105: lcmp
    //   106: iflt -> 1284
    //   109: aload_0
    //   110: bipush #24
    //   112: lload #11
    //   114: ldc2_w 24
    //   117: lsub
    //   118: invokevirtual c : (IJ)Ljava/nio/ByteBuffer;
    //   121: astore_1
    //   122: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   125: astore #24
    //   127: aload_1
    //   128: aload #24
    //   130: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   133: pop
    //   134: aload_1
    //   135: bipush #8
    //   137: invokevirtual getLong : (I)J
    //   140: ldc2_w 2334950737559900225
    //   143: lcmp
    //   144: ifne -> 1276
    //   147: aload_1
    //   148: bipush #16
    //   150: invokevirtual getLong : (I)J
    //   153: ldc2_w 3617552046287187010
    //   156: lcmp
    //   157: ifne -> 1276
    //   160: aload_1
    //   161: iconst_0
    //   162: invokevirtual getLong : (I)J
    //   165: lstore #17
    //   167: lload #17
    //   169: aload_1
    //   170: invokevirtual capacity : ()I
    //   173: i2l
    //   174: lcmp
    //   175: iflt -> 1268
    //   178: lload #17
    //   180: ldc2_w 2147483639
    //   183: lcmp
    //   184: ifgt -> 1268
    //   187: ldc2_w 8
    //   190: lload #17
    //   192: ladd
    //   193: l2i
    //   194: i2l
    //   195: lstore #15
    //   197: lload #11
    //   199: lload #15
    //   201: lsub
    //   202: lstore #13
    //   204: lload #13
    //   206: lconst_0
    //   207: lcmp
    //   208: iflt -> 1260
    //   211: aload_0
    //   212: bipush #8
    //   214: lload #13
    //   216: invokevirtual c : (IJ)Ljava/nio/ByteBuffer;
    //   219: astore #25
    //   221: aload #25
    //   223: aload #24
    //   225: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   228: pop
    //   229: aload_0
    //   230: getfield f : Lv00;
    //   233: checkcast cd1
    //   236: getfield e : Ljava/io/File;
    //   239: astore #26
    //   241: aload #26
    //   243: ifnull -> 279
    //   246: aload #26
    //   248: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   251: astore_1
    //   252: goto -> 258
    //   255: astore_1
    //   256: aconst_null
    //   257: astore_1
    //   258: aload_1
    //   259: astore #19
    //   261: aload_1
    //   262: ifnonnull -> 282
    //   265: iconst_2
    //   266: putstatic da2.a : B
    //   269: aload #26
    //   271: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   274: astore #19
    //   276: goto -> 282
    //   279: aconst_null
    //   280: astore #19
    //   282: new r3/a0
    //   285: dup
    //   286: aload #19
    //   288: invokespecial <init> : (Ljava/lang/Object;)V
    //   291: putstatic r3/a0.b : Lr3/a0;
    //   294: aload #25
    //   296: iconst_0
    //   297: invokevirtual getLong : (I)J
    //   300: lload #17
    //   302: lcmp
    //   303: ifne -> 1252
    //   306: aload_0
    //   307: lload #13
    //   309: lload #15
    //   311: invokevirtual d : (JJ)Leu;
    //   314: checkcast vc1
    //   317: astore_1
    //   318: aload_1
    //   319: aload_1
    //   320: invokevirtual size : ()J
    //   323: l2i
    //   324: lconst_0
    //   325: invokevirtual c : (IJ)Ljava/nio/ByteBuffer;
    //   328: astore_1
    //   329: aload_1
    //   330: aload #24
    //   332: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   335: pop
    //   336: aload_1
    //   337: invokevirtual order : ()Ljava/nio/ByteOrder;
    //   340: aload #24
    //   342: if_acmpne -> 1247
    //   345: aload_1
    //   346: invokevirtual capacity : ()I
    //   349: bipush #24
    //   351: isub
    //   352: istore_3
    //   353: iload_3
    //   354: bipush #8
    //   356: if_icmplt -> 1242
    //   359: aload_1
    //   360: invokevirtual capacity : ()I
    //   363: pop
    //   364: iload_3
    //   365: aload_1
    //   366: invokevirtual capacity : ()I
    //   369: if_icmpgt -> 1237
    //   372: aload_1
    //   373: invokevirtual limit : ()I
    //   376: istore #4
    //   378: aload_1
    //   379: invokevirtual position : ()I
    //   382: istore_2
    //   383: getstatic ve.e : I
    //   386: iconst_1
    //   387: iadd
    //   388: putstatic ve.e : I
    //   391: aload_1
    //   392: iconst_0
    //   393: invokevirtual position : (I)Ljava/nio/Buffer;
    //   396: pop
    //   397: aload_1
    //   398: iload_3
    //   399: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   402: pop
    //   403: aload_1
    //   404: bipush #8
    //   406: invokevirtual position : (I)Ljava/nio/Buffer;
    //   409: pop
    //   410: aload_1
    //   411: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   414: astore #19
    //   416: aload #19
    //   418: aload_1
    //   419: invokevirtual order : ()Ljava/nio/ByteOrder;
    //   422: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   425: pop
    //   426: aload_1
    //   427: iconst_0
    //   428: invokevirtual position : (I)Ljava/nio/Buffer;
    //   431: pop
    //   432: aload_1
    //   433: iload #4
    //   435: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   438: pop
    //   439: aload_1
    //   440: iload_2
    //   441: invokevirtual position : (I)Ljava/nio/Buffer;
    //   444: pop
    //   445: aload #19
    //   447: invokevirtual hasRemaining : ()Z
    //   450: ifeq -> 1207
    //   453: aload #19
    //   455: invokevirtual remaining : ()I
    //   458: bipush #8
    //   460: if_icmplt -> 1199
    //   463: aload #19
    //   465: invokevirtual getLong : ()J
    //   468: lstore #15
    //   470: lload #15
    //   472: ldc2_w 4
    //   475: lcmp
    //   476: iflt -> 1191
    //   479: lload #15
    //   481: ldc2_w 2147483647
    //   484: lcmp
    //   485: ifgt -> 1191
    //   488: lload #15
    //   490: l2i
    //   491: istore_2
    //   492: aload #19
    //   494: invokevirtual position : ()I
    //   497: istore_3
    //   498: iload_2
    //   499: aload #19
    //   501: invokevirtual remaining : ()I
    //   504: if_icmpgt -> 1183
    //   507: aload #19
    //   509: invokevirtual getInt : ()I
    //   512: istore #4
    //   514: iload #4
    //   516: ldc_w 1896449818
    //   519: if_icmpne -> 1138
    //   522: aload #19
    //   524: iload_2
    //   525: iconst_4
    //   526: isub
    //   527: invokestatic G : (Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;
    //   530: astore #24
    //   532: getstatic ve.d : I
    //   535: iconst_1
    //   536: iadd
    //   537: putstatic ve.d : I
    //   540: aload_0
    //   541: lconst_0
    //   542: lload #13
    //   544: invokevirtual d : (JJ)Leu;
    //   547: astore_1
    //   548: aload_0
    //   549: lload #11
    //   551: lload #9
    //   553: lload #11
    //   555: lsub
    //   556: invokevirtual d : (JJ)Leu;
    //   559: astore #19
    //   561: new java/util/HashSet
    //   564: dup
    //   565: iconst_1
    //   566: invokespecial <init> : (I)V
    //   569: astore_0
    //   570: aload #24
    //   572: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   575: astore #24
    //   577: aload #24
    //   579: invokevirtual hasRemaining : ()Z
    //   582: ifne -> 607
    //   585: aload #23
    //   587: new z81
    //   590: dup
    //   591: bipush #39
    //   593: iconst_0
    //   594: anewarray java/lang/Object
    //   597: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   600: invokevirtual add : (Ljava/lang/Object;)Z
    //   603: pop
    //   604: goto -> 700
    //   607: ldc_w 'X.509'
    //   610: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   613: astore #25
    //   615: aload #24
    //   617: invokevirtual hasRemaining : ()Z
    //   620: ifeq -> 700
    //   623: new h12
    //   626: dup
    //   627: invokespecial <init> : ()V
    //   630: astore #23
    //   632: aload #21
    //   634: aload #23
    //   636: invokevirtual add : (Ljava/lang/Object;)Z
    //   639: pop
    //   640: aload #24
    //   642: invokestatic M : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   645: aload #25
    //   647: aload #23
    //   649: aload_0
    //   650: invokestatic W : (Ljava/nio/ByteBuffer;Ljava/security/cert/CertificateFactory;Lh12;Ljava/util/HashSet;)V
    //   653: goto -> 615
    //   656: astore #24
    //   658: aload #23
    //   660: bipush #33
    //   662: iconst_0
    //   663: anewarray java/lang/Object
    //   666: invokevirtual a : (I[Ljava/lang/Object;)V
    //   669: goto -> 700
    //   672: astore_0
    //   673: aload_0
    //   674: invokestatic n : (Ljava/lang/Throwable;)V
    //   677: aconst_null
    //   678: areturn
    //   679: astore #24
    //   681: aload #23
    //   683: new z81
    //   686: dup
    //   687: bipush #32
    //   689: iconst_0
    //   690: anewarray java/lang/Object
    //   693: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   696: invokevirtual add : (Ljava/lang/Object;)Z
    //   699: pop
    //   700: aload #20
    //   702: invokevirtual a : ()Z
    //   705: ifeq -> 711
    //   708: goto -> 1082
    //   711: aload_0
    //   712: invokevirtual isEmpty : ()Z
    //   715: ifne -> 1130
    //   718: aload #22
    //   720: invokevirtual remaining : ()I
    //   723: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   726: astore #23
    //   728: aload #23
    //   730: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   733: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   736: pop
    //   737: aload #23
    //   739: aload #22
    //   741: invokevirtual put : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   744: pop
    //   745: aload #23
    //   747: invokevirtual flip : ()Ljava/nio/Buffer;
    //   750: pop
    //   751: aload_1
    //   752: checkcast vc1
    //   755: invokevirtual size : ()J
    //   758: lstore #9
    //   760: aload #23
    //   762: invokestatic c : (Ljava/nio/ByteBuffer;)V
    //   765: aload #23
    //   767: invokevirtual position : ()I
    //   770: istore_2
    //   771: lload #9
    //   773: lconst_0
    //   774: lcmp
    //   775: iflt -> 1100
    //   778: lload #9
    //   780: ldc2_w 4294967295
    //   783: lcmp
    //   784: ifgt -> 1100
    //   787: aload #23
    //   789: iload_2
    //   790: bipush #16
    //   792: iadd
    //   793: lload #9
    //   795: l2i
    //   796: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   799: pop
    //   800: new mi2
    //   803: astore #22
    //   805: aload #22
    //   807: aload #23
    //   809: iconst_1
    //   810: invokespecial <init> : (Ljava/nio/ByteBuffer;Z)V
    //   813: aload_0
    //   814: iconst_3
    //   815: anewarray eu
    //   818: dup
    //   819: iconst_0
    //   820: aload_1
    //   821: aastore
    //   822: dup
    //   823: iconst_1
    //   824: aload #19
    //   826: aastore
    //   827: dup
    //   828: iconst_2
    //   829: aload #22
    //   831: aastore
    //   832: invokestatic e : (Ljava/util/HashSet;[Leu;)Ljava/util/HashMap;
    //   835: astore_1
    //   836: aload_0
    //   837: aload_1
    //   838: invokevirtual keySet : ()Ljava/util/Set;
    //   841: invokeinterface equals : (Ljava/lang/Object;)Z
    //   846: ifeq -> 1085
    //   849: aload #21
    //   851: invokevirtual size : ()I
    //   854: istore #5
    //   856: iconst_0
    //   857: istore_3
    //   858: iload_3
    //   859: iload #5
    //   861: if_icmpge -> 1068
    //   864: aload #21
    //   866: iload_3
    //   867: invokevirtual get : (I)Ljava/lang/Object;
    //   870: astore_0
    //   871: iload_3
    //   872: iconst_1
    //   873: iadd
    //   874: istore #4
    //   876: aload_0
    //   877: checkcast h12
    //   880: astore #19
    //   882: aload #19
    //   884: getfield b : Ljava/util/ArrayList;
    //   887: astore #22
    //   889: aload #22
    //   891: invokevirtual size : ()I
    //   894: istore #6
    //   896: iconst_0
    //   897: istore_2
    //   898: iload #4
    //   900: istore_3
    //   901: iload_2
    //   902: iload #6
    //   904: if_icmpge -> 858
    //   907: aload #22
    //   909: iload_2
    //   910: invokevirtual get : (I)Ljava/lang/Object;
    //   913: astore_0
    //   914: iload_2
    //   915: iconst_1
    //   916: iadd
    //   917: istore_3
    //   918: aload_0
    //   919: checkcast f12
    //   922: astore #23
    //   924: aload #23
    //   926: getfield a : I
    //   929: istore #8
    //   931: invokestatic values : ()[Lxm1;
    //   934: astore #24
    //   936: aload #24
    //   938: arraylength
    //   939: istore #7
    //   941: iconst_0
    //   942: istore_2
    //   943: iload_2
    //   944: iload #7
    //   946: if_icmpge -> 972
    //   949: aload #24
    //   951: iload_2
    //   952: aaload
    //   953: astore_0
    //   954: aload_0
    //   955: getfield b : I
    //   958: iload #8
    //   960: if_icmpne -> 966
    //   963: goto -> 974
    //   966: iinc #2, 1
    //   969: goto -> 943
    //   972: aconst_null
    //   973: astore_0
    //   974: aload_0
    //   975: ifnonnull -> 983
    //   978: iload_3
    //   979: istore_2
    //   980: goto -> 898
    //   983: aload_0
    //   984: getfield e : Lpr;
    //   987: astore_0
    //   988: aload #23
    //   990: getfield b : [B
    //   993: astore #23
    //   995: aload_1
    //   996: aload_0
    //   997: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1000: checkcast [B
    //   1003: astore #24
    //   1005: aload #23
    //   1007: aload #24
    //   1009: invokestatic equals : ([B[B)Z
    //   1012: ifne -> 1051
    //   1015: aload #19
    //   1017: bipush #49
    //   1019: iconst_3
    //   1020: anewarray java/lang/Object
    //   1023: dup
    //   1024: iconst_0
    //   1025: aload_0
    //   1026: aastore
    //   1027: dup
    //   1028: iconst_1
    //   1029: aload #23
    //   1031: invokestatic p0 : ([B)Ljava/lang/String;
    //   1034: aastore
    //   1035: dup
    //   1036: iconst_2
    //   1037: aload #24
    //   1039: invokestatic p0 : ([B)Ljava/lang/String;
    //   1042: aastore
    //   1043: invokevirtual a : (I[Ljava/lang/Object;)V
    //   1046: iload_3
    //   1047: istore_2
    //   1048: goto -> 898
    //   1051: aload #19
    //   1053: getfield c : Ljava/util/HashMap;
    //   1056: aload_0
    //   1057: aload #24
    //   1059: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1062: pop
    //   1063: iload_3
    //   1064: istore_2
    //   1065: goto -> 898
    //   1068: aload #20
    //   1070: invokevirtual a : ()Z
    //   1073: ifne -> 708
    //   1076: aload #20
    //   1078: iconst_1
    //   1079: putfield a : Z
    //   1082: aload #20
    //   1084: areturn
    //   1085: new java/lang/RuntimeException
    //   1088: dup
    //   1089: invokespecial <init> : ()V
    //   1092: athrow
    //   1093: astore_0
    //   1094: aload_0
    //   1095: invokestatic n : (Ljava/lang/Throwable;)V
    //   1098: aconst_null
    //   1099: areturn
    //   1100: new java/lang/StringBuilder
    //   1103: dup
    //   1104: ldc_w 'uint32 value of out range: '
    //   1107: invokespecial <init> : (Ljava/lang/String;)V
    //   1110: astore_0
    //   1111: aload_0
    //   1112: lload #9
    //   1114: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1117: pop
    //   1118: new java/lang/IllegalArgumentException
    //   1121: dup
    //   1122: aload_0
    //   1123: invokevirtual toString : ()Ljava/lang/String;
    //   1126: invokespecial <init> : (Ljava/lang/String;)V
    //   1129: athrow
    //   1130: new java/lang/RuntimeException
    //   1133: dup
    //   1134: invokespecial <init> : ()V
    //   1137: athrow
    //   1138: aload #20
    //   1140: getfield b : Ljava/lang/Object;
    //   1143: checkcast java/util/ArrayList
    //   1146: new z81
    //   1149: dup
    //   1150: bipush #50
    //   1152: iconst_1
    //   1153: anewarray java/lang/Object
    //   1156: dup
    //   1157: iconst_0
    //   1158: iload #4
    //   1160: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1163: aastore
    //   1164: invokespecial <init> : (I[Ljava/lang/Object;)V
    //   1167: invokevirtual add : (Ljava/lang/Object;)Z
    //   1170: pop
    //   1171: aload #19
    //   1173: iload_3
    //   1174: iload_2
    //   1175: iadd
    //   1176: invokevirtual position : (I)Ljava/nio/Buffer;
    //   1179: pop
    //   1180: goto -> 445
    //   1183: new java/lang/Exception
    //   1186: dup
    //   1187: invokespecial <init> : ()V
    //   1190: athrow
    //   1191: new java/lang/Exception
    //   1194: dup
    //   1195: invokespecial <init> : ()V
    //   1198: athrow
    //   1199: new java/lang/Exception
    //   1202: dup
    //   1203: invokespecial <init> : ()V
    //   1206: athrow
    //   1207: new java/lang/Exception
    //   1210: dup
    //   1211: invokespecial <init> : ()V
    //   1214: athrow
    //   1215: astore_0
    //   1216: aload_1
    //   1217: iconst_0
    //   1218: invokevirtual position : (I)Ljava/nio/Buffer;
    //   1221: pop
    //   1222: aload_1
    //   1223: iload #4
    //   1225: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   1228: pop
    //   1229: aload_1
    //   1230: iload_2
    //   1231: invokevirtual position : (I)Ljava/nio/Buffer;
    //   1234: pop
    //   1235: aload_0
    //   1236: athrow
    //   1237: invokestatic k : ()V
    //   1240: aconst_null
    //   1241: areturn
    //   1242: invokestatic k : ()V
    //   1245: aconst_null
    //   1246: areturn
    //   1247: invokestatic k : ()V
    //   1250: aconst_null
    //   1251: areturn
    //   1252: new java/lang/Exception
    //   1255: dup
    //   1256: invokespecial <init> : ()V
    //   1259: athrow
    //   1260: new java/lang/Exception
    //   1263: dup
    //   1264: invokespecial <init> : ()V
    //   1267: athrow
    //   1268: new java/lang/Exception
    //   1271: dup
    //   1272: invokespecial <init> : ()V
    //   1275: athrow
    //   1276: new java/lang/Exception
    //   1279: dup
    //   1280: invokespecial <init> : ()V
    //   1283: athrow
    //   1284: new java/lang/Exception
    //   1287: dup
    //   1288: invokespecial <init> : ()V
    //   1291: athrow
    //   1292: new java/lang/Exception
    //   1295: dup
    //   1296: invokespecial <init> : ()V
    //   1299: athrow
    //   1300: astore_1
    //   1301: goto -> 279
    // Exception table:
    //   from	to	target	type
    //   229	241	1300	finally
    //   246	252	255	finally
    //   265	276	1300	finally
    //   391	426	1215	finally
    //   570	577	679	o5
    //   607	615	672	java/security/cert/CertificateException
    //   640	653	656	o5
    //   640	653	656	java/nio/BufferUnderflowException
    //   800	836	1093	java/security/DigestException
  }
  
  public static Parcelable s(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator) {
    int i = h0(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    Parcelable parcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(paramInt + i);
    return parcelable;
  }
  
  public static final Object s0(long paramLong, ek paramek, qp paramqp) {
    int i;
    hp2 hp2 = f20.b;
    if (paramLong > 0L) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i == 1) {
      j20 j20 = j20.c;
      long l1 = m92.X(999999L, j20);
      i = (int)paramLong & 0x1;
      if (i == ((int)l1 & 0x1)) {
        if (i == 0) {
          paramLong = (paramLong >> 1L) + (l1 >> 1L);
          if (-4611686018426999999L <= paramLong && paramLong < 4611686018427000000L) {
            paramLong <<= 1L;
            i = i20.a;
          } else {
            paramLong = m92.m(paramLong / 1000000L);
          } 
        } else {
          paramLong = m92.b(paramLong >> 1L, l1 >> 1L);
          if (paramLong != 9223372036854759646L) {
            if (paramLong == 4611686018427387903L || paramLong == -4611686018427387903L) {
              paramLong = m92.m(paramLong);
            } else if (-4611686018426L <= paramLong && paramLong < 4611686018427L) {
              paramLong = paramLong * 1000000L << 1L;
              i = i20.a;
            } else {
              paramLong = m92.m(m92.k(paramLong));
            } 
          } else {
            l0.l("Summing infinite durations of different signs yields an undefined result.");
            return null;
          } 
        } 
      } else if (i == 1) {
        paramLong = f20.a(paramLong >> 1L, l1 >> 1L);
      } else {
        paramLong = f20.a(l1 >> 1L, paramLong >> 1L);
      } 
      long l2 = f20.e;
      l1 = f20.c;
      i = (int)paramLong & 0x1;
      if (i != 1 || paramLong == l1 || paramLong == l2) {
        if (paramLong == l1) {
          paramLong = Long.MAX_VALUE;
        } else if (paramLong == l2) {
          paramLong = Long.MIN_VALUE;
        } else {
          if (i != 0)
            j20 = j20.e; 
          paramLong = TimeUnit.MILLISECONDS.convert(paramLong >> 1L, j20.b);
        } 
      } else {
        paramLong >>= 1L;
      } 
    } else if (i == 0) {
      paramLong = 0L;
    } else {
      throw new RuntimeException();
    } 
    if (paramLong > 0L) {
      Object object;
      ys ys;
      wu1 wu1 = new wu1(paramLong, paramqp);
      g92.M(wu1, true, new l00(ui0.w(wu1.h.e()).d(wu1.i, wu1, wu1.g)));
      try {
        qz1.d(2, paramek);
        object = paramek.g(wu1, wu1);
      } finally {
        paramek = null;
      } 
      if (object == ys) {
        object = ys;
      } else {
        Object object1 = wu1.R(object);
        if (object1 == wf2.g) {
          object = ys;
        } else if (object1 instanceof bo) {
          Throwable throwable = ((bo)object1).a;
          if (throwable instanceof vu1 && ((vu1)throwable).b == wu1) {
            if (object instanceof bo)
              throw ((bo)object).a; 
          } else {
            throw throwable;
          } 
        } else {
          object = wf2.k0(object1);
        } 
      } 
      return object;
    } 
    throw new vu1("Timed out immediately", null);
  }
  
  public static String t(Parcel paramParcel, int paramInt) {
    paramInt = h0(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    String str = paramParcel.readString();
    paramParcel.setDataPosition(i + paramInt);
    return str;
  }
  
  public static ArrayList u(Parcel paramParcel, int paramInt) {
    int i = h0(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    ArrayList arrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(paramInt + i);
    return arrayList;
  }
  
  public static String u0(String paramString, Object... paramVarArgs) {
    int k;
    int i = paramVarArgs.length;
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + i * 16);
    i = 0;
    int j = 0;
    while (true) {
      k = paramVarArgs.length;
      if (i < k) {
        int m = paramString.indexOf("%s", j);
        if (m == -1)
          break; 
        stringBuilder.append(paramString, j, m);
        stringBuilder.append(y0(paramVarArgs[i]));
        j = m + 2;
        i++;
        continue;
      } 
      break;
    } 
    stringBuilder.append(paramString, j, paramString.length());
    if (i < k) {
      for (paramString = " ["; i < paramVarArgs.length; paramString = ", ") {
        stringBuilder.append(paramString);
        stringBuilder.append(y0(paramVarArgs[i]));
        i++;
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static Object[] v(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator) {
    paramInt = h0(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return arrayOfObject;
  }
  
  public static Map v0(String paramString, Bundle paramBundle) {
    Map map = (Map)paramBundle.getSerializable(paramString);
    if (map == null)
      return zh2.k; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (Map.Entry entry : map.entrySet()) {
      if (entry != null && entry.getKey() != null && entry.getValue() != null)
        hashMap.put(entry.getKey(), entry.getValue()); 
    } 
    return Collections.unmodifiableMap(hashMap);
  }
  
  public static ArrayList w(Parcel paramParcel, int paramInt, Parcelable.Creator paramCreator) {
    int i = h0(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    ArrayList arrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(paramInt + i);
    return arrayList;
  }
  
  public static ThreadPoolExecutor w0() {
    if (r == null) {
      LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue();
      cg1 cg1 = new cg1(1);
      ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, linkedBlockingQueue, cg1);
      r = threadPoolExecutor;
      threadPoolExecutor.allowCoreThreadTimeOut(true);
    } 
    return r;
  }
  
  public static final q72 x(Context paramContext, ip paramip) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: new n2
    //   8: dup
    //   9: aload_1
    //   10: getfield c : Ljava/util/concurrent/ExecutorService;
    //   13: invokespecial <init> : (Ljava/util/concurrent/ExecutorService;)V
    //   16: astore #14
    //   18: aload_0
    //   19: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   22: astore #11
    //   24: aload #11
    //   26: invokevirtual getClass : ()Ljava/lang/Class;
    //   29: pop
    //   30: aload #14
    //   32: getfield c : Ljava/lang/Object;
    //   35: checkcast tk1
    //   38: astore #13
    //   40: aload #13
    //   42: invokevirtual getClass : ()Ljava/lang/Class;
    //   45: pop
    //   46: aload_1
    //   47: getfield d : Lfb0;
    //   50: astore #15
    //   52: aload_0
    //   53: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   56: ldc_w 2131034132
    //   59: invokevirtual getBoolean : (I)Z
    //   62: istore #7
    //   64: aload #15
    //   66: invokevirtual getClass : ()Ljava/lang/Class;
    //   69: pop
    //   70: iload #7
    //   72: ifeq -> 96
    //   75: new bh1
    //   78: dup
    //   79: aload #11
    //   81: aconst_null
    //   82: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   85: astore #12
    //   87: aload #12
    //   89: iconst_1
    //   90: putfield i : Z
    //   93: goto -> 133
    //   96: ldc_w 'androidx.work.workdb'
    //   99: invokestatic L0 : (Ljava/lang/String;)Z
    //   102: ifne -> 2569
    //   105: new bh1
    //   108: dup
    //   109: aload #11
    //   111: ldc_w 'androidx.work.workdb'
    //   114: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   117: astore #12
    //   119: aload #12
    //   121: new kl1
    //   124: dup
    //   125: aload #11
    //   127: invokespecial <init> : (Landroid/content/Context;)V
    //   130: putfield h : Lkl1;
    //   133: aload #12
    //   135: aload #13
    //   137: putfield f : Ljava/util/concurrent/Executor;
    //   140: new pl
    //   143: dup
    //   144: aload #15
    //   146: invokespecial <init> : (Lfb0;)V
    //   149: astore #13
    //   151: aload #12
    //   153: getfield d : Ljava/util/ArrayList;
    //   156: astore #15
    //   158: aload #15
    //   160: aload #13
    //   162: invokevirtual add : (Ljava/lang/Object;)Z
    //   165: pop
    //   166: aload #12
    //   168: iconst_1
    //   169: anewarray qx0
    //   172: dup
    //   173: iconst_0
    //   174: getstatic rx0.h : Lrx0;
    //   177: aastore
    //   178: invokevirtual a : ([Lqx0;)V
    //   181: aload #12
    //   183: iconst_1
    //   184: anewarray qx0
    //   187: dup
    //   188: iconst_0
    //   189: new eg1
    //   192: dup
    //   193: aload #11
    //   195: iconst_2
    //   196: iconst_3
    //   197: invokespecial <init> : (Landroid/content/Context;II)V
    //   200: aastore
    //   201: invokevirtual a : ([Lqx0;)V
    //   204: aload #12
    //   206: iconst_1
    //   207: anewarray qx0
    //   210: dup
    //   211: iconst_0
    //   212: getstatic rx0.i : Lrx0;
    //   215: aastore
    //   216: invokevirtual a : ([Lqx0;)V
    //   219: aload #12
    //   221: iconst_1
    //   222: anewarray qx0
    //   225: dup
    //   226: iconst_0
    //   227: getstatic rx0.j : Lrx0;
    //   230: aastore
    //   231: invokevirtual a : ([Lqx0;)V
    //   234: aload #12
    //   236: iconst_1
    //   237: anewarray qx0
    //   240: dup
    //   241: iconst_0
    //   242: new eg1
    //   245: dup
    //   246: aload #11
    //   248: iconst_5
    //   249: bipush #6
    //   251: invokespecial <init> : (Landroid/content/Context;II)V
    //   254: aastore
    //   255: invokevirtual a : ([Lqx0;)V
    //   258: aload #12
    //   260: iconst_1
    //   261: anewarray qx0
    //   264: dup
    //   265: iconst_0
    //   266: getstatic rx0.k : Lrx0;
    //   269: aastore
    //   270: invokevirtual a : ([Lqx0;)V
    //   273: aload #12
    //   275: iconst_1
    //   276: anewarray qx0
    //   279: dup
    //   280: iconst_0
    //   281: getstatic rx0.l : Lrx0;
    //   284: aastore
    //   285: invokevirtual a : ([Lqx0;)V
    //   288: aload #12
    //   290: iconst_1
    //   291: anewarray qx0
    //   294: dup
    //   295: iconst_0
    //   296: getstatic rx0.m : Lrx0;
    //   299: aastore
    //   300: invokevirtual a : ([Lqx0;)V
    //   303: aload #12
    //   305: iconst_1
    //   306: anewarray qx0
    //   309: dup
    //   310: iconst_0
    //   311: new eg1
    //   314: dup
    //   315: aload #11
    //   317: invokespecial <init> : (Landroid/content/Context;)V
    //   320: aastore
    //   321: invokevirtual a : ([Lqx0;)V
    //   324: aload #12
    //   326: iconst_1
    //   327: anewarray qx0
    //   330: dup
    //   331: iconst_0
    //   332: new eg1
    //   335: dup
    //   336: aload #11
    //   338: bipush #10
    //   340: bipush #11
    //   342: invokespecial <init> : (Landroid/content/Context;II)V
    //   345: aastore
    //   346: invokevirtual a : ([Lqx0;)V
    //   349: aload #12
    //   351: iconst_1
    //   352: anewarray qx0
    //   355: dup
    //   356: iconst_0
    //   357: getstatic rx0.d : Lrx0;
    //   360: aastore
    //   361: invokevirtual a : ([Lqx0;)V
    //   364: aload #12
    //   366: iconst_1
    //   367: anewarray qx0
    //   370: dup
    //   371: iconst_0
    //   372: getstatic rx0.e : Lrx0;
    //   375: aastore
    //   376: invokevirtual a : ([Lqx0;)V
    //   379: aload #12
    //   381: iconst_1
    //   382: anewarray qx0
    //   385: dup
    //   386: iconst_0
    //   387: getstatic rx0.f : Lrx0;
    //   390: aastore
    //   391: invokevirtual a : ([Lqx0;)V
    //   394: aload #12
    //   396: iconst_1
    //   397: anewarray qx0
    //   400: dup
    //   401: iconst_0
    //   402: getstatic rx0.g : Lrx0;
    //   405: aastore
    //   406: invokevirtual a : ([Lqx0;)V
    //   409: aload #12
    //   411: iconst_1
    //   412: anewarray qx0
    //   415: dup
    //   416: iconst_0
    //   417: new eg1
    //   420: dup
    //   421: aload #11
    //   423: bipush #21
    //   425: bipush #22
    //   427: invokespecial <init> : (Landroid/content/Context;II)V
    //   430: aastore
    //   431: invokevirtual a : ([Lqx0;)V
    //   434: aload #12
    //   436: iconst_0
    //   437: putfield p : Z
    //   440: aload #12
    //   442: iconst_1
    //   443: putfield q : Z
    //   446: aload #12
    //   448: iconst_1
    //   449: putfield r : Z
    //   452: aload #12
    //   454: getfield f : Ljava/util/concurrent/Executor;
    //   457: astore #11
    //   459: aload #11
    //   461: ifnonnull -> 494
    //   464: aload #12
    //   466: getfield g : Ljava/util/concurrent/Executor;
    //   469: ifnonnull -> 494
    //   472: getstatic s8.m : Lr8;
    //   475: astore #11
    //   477: aload #12
    //   479: aload #11
    //   481: putfield g : Ljava/util/concurrent/Executor;
    //   484: aload #12
    //   486: aload #11
    //   488: putfield f : Ljava/util/concurrent/Executor;
    //   491: goto -> 532
    //   494: aload #11
    //   496: ifnull -> 517
    //   499: aload #12
    //   501: getfield g : Ljava/util/concurrent/Executor;
    //   504: ifnonnull -> 517
    //   507: aload #12
    //   509: aload #11
    //   511: putfield g : Ljava/util/concurrent/Executor;
    //   514: goto -> 532
    //   517: aload #11
    //   519: ifnonnull -> 532
    //   522: aload #12
    //   524: aload #12
    //   526: getfield g : Ljava/util/concurrent/Executor;
    //   529: putfield f : Ljava/util/concurrent/Executor;
    //   532: aload #12
    //   534: getfield n : Ljava/util/LinkedHashSet;
    //   537: astore #11
    //   539: aload #11
    //   541: invokevirtual getClass : ()Ljava/lang/Class;
    //   544: pop
    //   545: aload #12
    //   547: getfield m : Ljava/util/LinkedHashSet;
    //   550: astore #16
    //   552: aload #16
    //   554: invokevirtual getClass : ()Ljava/lang/Class;
    //   557: pop
    //   558: aload #11
    //   560: invokeinterface isEmpty : ()Z
    //   565: ifne -> 630
    //   568: aload #11
    //   570: invokeinterface iterator : ()Ljava/util/Iterator;
    //   575: astore #11
    //   577: aload #11
    //   579: invokeinterface hasNext : ()Z
    //   584: ifeq -> 630
    //   587: aload #11
    //   589: invokeinterface next : ()Ljava/lang/Object;
    //   594: checkcast java/lang/Number
    //   597: invokevirtual intValue : ()I
    //   600: istore_2
    //   601: aload #16
    //   603: iload_2
    //   604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   607: invokeinterface contains : (Ljava/lang/Object;)Z
    //   612: ifne -> 618
    //   615: goto -> 577
    //   618: ldc_w 'Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: '
    //   621: iload_2
    //   622: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   625: invokestatic e : (Ljava/lang/Object;)V
    //   628: aconst_null
    //   629: areturn
    //   630: aload #12
    //   632: getfield h : Lkl1;
    //   635: astore #11
    //   637: aload #11
    //   639: astore #13
    //   641: aload #11
    //   643: ifnonnull -> 655
    //   646: new java/lang/Object
    //   649: dup
    //   650: invokespecial <init> : ()V
    //   653: astore #13
    //   655: aload #12
    //   657: getfield k : J
    //   660: lconst_0
    //   661: lcmp
    //   662: ifle -> 689
    //   665: aload #12
    //   667: getfield c : Ljava/lang/String;
    //   670: ifnull -> 681
    //   673: ldc_w 'Required value was null.'
    //   676: invokestatic l : (Ljava/lang/String;)V
    //   679: aconst_null
    //   680: areturn
    //   681: ldc_w 'Cannot create auto-closing database for an in-memory database.'
    //   684: invokestatic l : (Ljava/lang/String;)V
    //   687: aconst_null
    //   688: areturn
    //   689: aload #12
    //   691: getfield i : Z
    //   694: istore #8
    //   696: aload #12
    //   698: getfield j : Lch1;
    //   701: astore #11
    //   703: aload #11
    //   705: invokevirtual getClass : ()Ljava/lang/Class;
    //   708: pop
    //   709: aload #12
    //   711: getfield b : Landroid/content/Context;
    //   714: astore #17
    //   716: aload #17
    //   718: invokevirtual getClass : ()Ljava/lang/Class;
    //   721: pop
    //   722: aload #11
    //   724: getstatic ch1.b : Lch1;
    //   727: if_acmpeq -> 733
    //   730: goto -> 790
    //   733: aload #17
    //   735: ldc_w 'activity'
    //   738: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   741: astore #11
    //   743: aload #11
    //   745: instanceof android/app/ActivityManager
    //   748: ifeq -> 761
    //   751: aload #11
    //   753: checkcast android/app/ActivityManager
    //   756: astore #11
    //   758: goto -> 764
    //   761: aconst_null
    //   762: astore #11
    //   764: aload #11
    //   766: ifnull -> 785
    //   769: aload #11
    //   771: invokevirtual isLowRamDevice : ()Z
    //   774: ifne -> 785
    //   777: getstatic ch1.e : Lch1;
    //   780: astore #11
    //   782: goto -> 790
    //   785: getstatic ch1.c : Lch1;
    //   788: astore #11
    //   790: aload #12
    //   792: getfield f : Ljava/util/concurrent/Executor;
    //   795: astore #22
    //   797: aload #22
    //   799: ifnull -> 2561
    //   802: aload #12
    //   804: getfield g : Ljava/util/concurrent/Executor;
    //   807: astore #21
    //   809: aload #21
    //   811: ifnull -> 2553
    //   814: aload #12
    //   816: getfield p : Z
    //   819: istore #9
    //   821: aload #12
    //   823: getfield q : Z
    //   826: istore #10
    //   828: aload #12
    //   830: getfield r : Z
    //   833: istore #7
    //   835: aload #12
    //   837: getfield c : Ljava/lang/String;
    //   840: astore #18
    //   842: aload #12
    //   844: getfield l : Lc4;
    //   847: astore #23
    //   849: aload #12
    //   851: getfield e : Ljava/util/ArrayList;
    //   854: astore #19
    //   856: aload #12
    //   858: getfield o : Ljava/util/ArrayList;
    //   861: astore #20
    //   863: iconst_0
    //   864: istore_2
    //   865: new gu
    //   868: dup
    //   869: aload #17
    //   871: aload #18
    //   873: aload #13
    //   875: aload #23
    //   877: aload #15
    //   879: iload #8
    //   881: aload #11
    //   883: aload #22
    //   885: aload #21
    //   887: aconst_null
    //   888: iload #9
    //   890: iload #10
    //   892: aload #16
    //   894: aconst_null
    //   895: aconst_null
    //   896: aconst_null
    //   897: aload #19
    //   899: aload #20
    //   901: iload #7
    //   903: aconst_null
    //   904: aconst_null
    //   905: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;Lhr1;Lc4;Ljava/util/List;ZLch1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLuh1;Los;)V
    //   908: astore #13
    //   910: aload #13
    //   912: aload #12
    //   914: getfield s : Z
    //   917: putfield q : Z
    //   920: aload #12
    //   922: getfield a : Lll;
    //   925: astore #11
    //   927: aload #11
    //   929: invokevirtual getClass : ()Ljava/lang/Class;
    //   932: pop
    //   933: aload #11
    //   935: invokevirtual a : ()Ljava/lang/Class;
    //   938: astore #15
    //   940: aload #15
    //   942: invokevirtual getClass : ()Ljava/lang/Class;
    //   945: pop
    //   946: aload #15
    //   948: invokevirtual getPackage : ()Ljava/lang/Package;
    //   951: astore #11
    //   953: aload #11
    //   955: ifnull -> 974
    //   958: aload #11
    //   960: invokevirtual getName : ()Ljava/lang/String;
    //   963: astore #12
    //   965: aload #12
    //   967: astore #11
    //   969: aload #12
    //   971: ifnonnull -> 979
    //   974: ldc_w ''
    //   977: astore #11
    //   979: aload #15
    //   981: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   984: astore #12
    //   986: aload #12
    //   988: invokevirtual getClass : ()Ljava/lang/Class;
    //   991: pop
    //   992: aload #11
    //   994: invokevirtual length : ()I
    //   997: ifne -> 1003
    //   1000: goto -> 1017
    //   1003: aload #12
    //   1005: aload #11
    //   1007: invokevirtual length : ()I
    //   1010: iconst_1
    //   1011: iadd
    //   1012: invokevirtual substring : (I)Ljava/lang/String;
    //   1015: astore #12
    //   1017: aload #12
    //   1019: bipush #46
    //   1021: bipush #95
    //   1023: invokevirtual replace : (CC)Ljava/lang/String;
    //   1026: astore #12
    //   1028: aload #12
    //   1030: invokevirtual getClass : ()Ljava/lang/Class;
    //   1033: pop
    //   1034: aload #12
    //   1036: ldc_w '_Impl'
    //   1039: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1042: astore #12
    //   1044: aload #11
    //   1046: invokevirtual length : ()I
    //   1049: ifne -> 1059
    //   1052: aload #12
    //   1054: astore #11
    //   1056: goto -> 1100
    //   1059: new java/lang/StringBuilder
    //   1062: astore #16
    //   1064: aload #16
    //   1066: invokespecial <init> : ()V
    //   1069: aload #16
    //   1071: aload #11
    //   1073: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1076: pop
    //   1077: aload #16
    //   1079: bipush #46
    //   1081: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1084: pop
    //   1085: aload #16
    //   1087: aload #12
    //   1089: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1092: pop
    //   1093: aload #16
    //   1095: invokevirtual toString : ()Ljava/lang/String;
    //   1098: astore #11
    //   1100: aload #11
    //   1102: iconst_1
    //   1103: aload #15
    //   1105: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1108: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1111: astore #11
    //   1113: aload #11
    //   1115: invokevirtual getClass : ()Ljava/lang/Class;
    //   1118: pop
    //   1119: aload #11
    //   1121: aconst_null
    //   1122: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1125: aconst_null
    //   1126: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1129: astore #11
    //   1131: aload #11
    //   1133: checkcast eh1
    //   1136: astore #15
    //   1138: aload #15
    //   1140: invokevirtual getClass : ()Ljava/lang/Class;
    //   1143: pop
    //   1144: aload #15
    //   1146: aload #13
    //   1148: getfield q : Z
    //   1151: putfield j : Z
    //   1154: aload #15
    //   1156: invokevirtual e : ()Lf51;
    //   1159: astore #11
    //   1161: aload #11
    //   1163: invokevirtual getClass : ()Ljava/lang/Class;
    //   1166: pop
    //   1167: goto -> 1175
    //   1170: astore #11
    //   1172: aconst_null
    //   1173: astore #11
    //   1175: aload #11
    //   1177: ifnull -> 2378
    //   1180: aload #15
    //   1182: new ah1
    //   1185: dup
    //   1186: aload #13
    //   1188: aload #11
    //   1190: invokespecial <init> : (Lgu;Lf51;)V
    //   1193: putfield d : Lah1;
    //   1196: aload #15
    //   1198: aload #15
    //   1200: invokevirtual d : ()Lyi0;
    //   1203: putfield e : Lyi0;
    //   1206: new java/util/LinkedHashMap
    //   1209: dup
    //   1210: invokespecial <init> : ()V
    //   1213: astore #11
    //   1215: aload #15
    //   1217: invokevirtual h : ()Ljava/util/Set;
    //   1220: astore #16
    //   1222: aload #16
    //   1224: invokeinterface size : ()I
    //   1229: istore #6
    //   1231: iload #6
    //   1233: newarray boolean
    //   1235: astore #12
    //   1237: aload #16
    //   1239: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1244: astore #18
    //   1246: aload #18
    //   1248: invokeinterface hasNext : ()Z
    //   1253: istore #7
    //   1255: iconst_m1
    //   1256: istore #4
    //   1258: aload #13
    //   1260: getfield n : Ljava/util/List;
    //   1263: astore #17
    //   1265: iload #7
    //   1267: ifeq -> 1386
    //   1270: aload #18
    //   1272: invokeinterface next : ()Ljava/lang/Object;
    //   1277: checkcast ll
    //   1280: astore #16
    //   1282: aload #17
    //   1284: invokeinterface size : ()I
    //   1289: iconst_1
    //   1290: isub
    //   1291: istore_3
    //   1292: iload_3
    //   1293: iflt -> 1342
    //   1296: iload_3
    //   1297: iconst_1
    //   1298: isub
    //   1299: istore #5
    //   1301: aload #16
    //   1303: aload #17
    //   1305: iload_3
    //   1306: invokeinterface get : (I)Ljava/lang/Object;
    //   1311: invokevirtual d : (Ljava/lang/Object;)Z
    //   1314: ifeq -> 1325
    //   1317: aload #12
    //   1319: iload_3
    //   1320: iconst_1
    //   1321: bastore
    //   1322: goto -> 1345
    //   1325: iload #5
    //   1327: ifge -> 1336
    //   1330: iload #4
    //   1332: istore_3
    //   1333: goto -> 1345
    //   1336: iload #5
    //   1338: istore_3
    //   1339: goto -> 1296
    //   1342: iload #4
    //   1344: istore_3
    //   1345: iload_3
    //   1346: iflt -> 1370
    //   1349: aload #11
    //   1351: aload #16
    //   1353: aload #17
    //   1355: iload_3
    //   1356: invokeinterface get : (I)Ljava/lang/Object;
    //   1361: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1366: pop
    //   1367: goto -> 1246
    //   1370: aload #16
    //   1372: invokevirtual b : ()Ljava/lang/String;
    //   1375: ldc_w ') is missing in the database configuration.'
    //   1378: ldc_w 'A required auto migration spec ('
    //   1381: invokestatic g : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   1384: aconst_null
    //   1385: areturn
    //   1386: aload #17
    //   1388: invokeinterface size : ()I
    //   1393: iconst_1
    //   1394: isub
    //   1395: istore_3
    //   1396: iload_3
    //   1397: iflt -> 1440
    //   1400: iload_3
    //   1401: iconst_1
    //   1402: isub
    //   1403: istore #4
    //   1405: iload_3
    //   1406: iload #6
    //   1408: if_icmpge -> 1432
    //   1411: aload #12
    //   1413: iload_3
    //   1414: baload
    //   1415: ifeq -> 1432
    //   1418: iload #4
    //   1420: ifge -> 1426
    //   1423: goto -> 1440
    //   1426: iload #4
    //   1428: istore_3
    //   1429: goto -> 1400
    //   1432: ldc_w 'Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.'
    //   1435: invokestatic l : (Ljava/lang/String;)V
    //   1438: aconst_null
    //   1439: areturn
    //   1440: aload #15
    //   1442: aload #11
    //   1444: invokevirtual c : (Ljava/util/LinkedHashMap;)Ljava/util/List;
    //   1447: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1452: astore #17
    //   1454: aload #17
    //   1456: invokeinterface hasNext : ()Z
    //   1461: ifeq -> 1578
    //   1464: aload #17
    //   1466: invokeinterface next : ()Ljava/lang/Object;
    //   1471: checkcast qx0
    //   1474: astore #16
    //   1476: aload #16
    //   1478: getfield a : I
    //   1481: istore #4
    //   1483: aload #16
    //   1485: getfield b : I
    //   1488: istore_3
    //   1489: aload #13
    //   1491: getfield d : Lc4;
    //   1494: astore #18
    //   1496: aload #18
    //   1498: getfield a : Ljava/util/LinkedHashMap;
    //   1501: astore #11
    //   1503: aload #11
    //   1505: iload #4
    //   1507: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1510: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   1515: ifeq -> 1562
    //   1518: aload #11
    //   1520: iload #4
    //   1522: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1525: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1528: checkcast java/util/Map
    //   1531: astore #12
    //   1533: aload #12
    //   1535: astore #11
    //   1537: aload #12
    //   1539: ifnonnull -> 1547
    //   1542: getstatic e40.b : Le40;
    //   1545: astore #11
    //   1547: aload #11
    //   1549: iload_3
    //   1550: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1553: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   1558: istore_3
    //   1559: goto -> 1564
    //   1562: iload_2
    //   1563: istore_3
    //   1564: iload_3
    //   1565: ifne -> 1454
    //   1568: aload #18
    //   1570: aload #16
    //   1572: invokevirtual a : (Lqx0;)V
    //   1575: goto -> 1454
    //   1578: aload #15
    //   1580: invokevirtual i : ()Ljava/util/LinkedHashMap;
    //   1583: astore #11
    //   1585: aload #11
    //   1587: invokeinterface size : ()I
    //   1592: newarray boolean
    //   1594: astore #12
    //   1596: aload #11
    //   1598: invokevirtual entrySet : ()Ljava/util/Set;
    //   1601: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1606: astore #17
    //   1608: aload #17
    //   1610: invokeinterface hasNext : ()Z
    //   1615: istore #7
    //   1617: aload #13
    //   1619: getfield m : Ljava/util/List;
    //   1622: astore #16
    //   1624: iload #7
    //   1626: ifeq -> 1863
    //   1629: aload #17
    //   1631: invokeinterface next : ()Ljava/lang/Object;
    //   1636: checkcast java/util/Map$Entry
    //   1639: astore #18
    //   1641: aload #18
    //   1643: invokeinterface getKey : ()Ljava/lang/Object;
    //   1648: checkcast ll
    //   1651: astore #11
    //   1653: aload #18
    //   1655: invokeinterface getValue : ()Ljava/lang/Object;
    //   1660: checkcast java/util/List
    //   1663: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1668: astore #19
    //   1670: aload #19
    //   1672: invokeinterface hasNext : ()Z
    //   1677: ifeq -> 1608
    //   1680: aload #19
    //   1682: invokeinterface next : ()Ljava/lang/Object;
    //   1687: checkcast ll
    //   1690: astore #20
    //   1692: aload #16
    //   1694: invokeinterface size : ()I
    //   1699: iconst_1
    //   1700: isub
    //   1701: istore_3
    //   1702: iload_3
    //   1703: iflt -> 1749
    //   1706: iload_3
    //   1707: iconst_1
    //   1708: isub
    //   1709: istore #4
    //   1711: aload #20
    //   1713: aload #16
    //   1715: iload_3
    //   1716: invokeinterface get : (I)Ljava/lang/Object;
    //   1721: invokevirtual d : (Ljava/lang/Object;)Z
    //   1724: ifeq -> 1735
    //   1727: aload #12
    //   1729: iload_3
    //   1730: iconst_1
    //   1731: bastore
    //   1732: goto -> 1751
    //   1735: iload #4
    //   1737: ifge -> 1743
    //   1740: goto -> 1749
    //   1743: iload #4
    //   1745: istore_3
    //   1746: goto -> 1706
    //   1749: iconst_m1
    //   1750: istore_3
    //   1751: iload_3
    //   1752: iflt -> 1795
    //   1755: aload #16
    //   1757: iload_3
    //   1758: invokeinterface get : (I)Ljava/lang/Object;
    //   1763: astore #18
    //   1765: aload #20
    //   1767: invokevirtual getClass : ()Ljava/lang/Class;
    //   1770: pop
    //   1771: aload #18
    //   1773: invokevirtual getClass : ()Ljava/lang/Class;
    //   1776: pop
    //   1777: aload #15
    //   1779: getfield i : Ljava/util/LinkedHashMap;
    //   1782: aload #20
    //   1784: aload #18
    //   1786: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1791: pop
    //   1792: goto -> 1670
    //   1795: aload #20
    //   1797: invokevirtual b : ()Ljava/lang/String;
    //   1800: astore_0
    //   1801: aload #11
    //   1803: invokevirtual b : ()Ljava/lang/String;
    //   1806: astore #11
    //   1808: new java/lang/StringBuilder
    //   1811: dup
    //   1812: ldc_w 'A required type converter ('
    //   1815: invokespecial <init> : (Ljava/lang/String;)V
    //   1818: astore_1
    //   1819: aload_1
    //   1820: aload_0
    //   1821: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1824: pop
    //   1825: aload_1
    //   1826: ldc_w ') for '
    //   1829: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1832: pop
    //   1833: aload_1
    //   1834: aload #11
    //   1836: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1839: pop
    //   1840: aload_1
    //   1841: ldc_w ' is missing in the database configuration.'
    //   1844: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1847: pop
    //   1848: new java/lang/IllegalArgumentException
    //   1851: dup
    //   1852: aload_1
    //   1853: invokevirtual toString : ()Ljava/lang/String;
    //   1856: invokevirtual toString : ()Ljava/lang/String;
    //   1859: invokespecial <init> : (Ljava/lang/String;)V
    //   1862: athrow
    //   1863: aload #16
    //   1865: invokeinterface size : ()I
    //   1870: iconst_1
    //   1871: isub
    //   1872: istore_3
    //   1873: iload_3
    //   1874: iflt -> 1922
    //   1877: iload_3
    //   1878: iconst_1
    //   1879: isub
    //   1880: istore #4
    //   1882: aload #12
    //   1884: iload_3
    //   1885: baload
    //   1886: ifeq -> 1903
    //   1889: iload #4
    //   1891: ifge -> 1897
    //   1894: goto -> 1922
    //   1897: iload #4
    //   1899: istore_3
    //   1900: goto -> 1877
    //   1903: aload #16
    //   1905: iload_3
    //   1906: invokeinterface get : (I)Ljava/lang/Object;
    //   1911: ldc_w '. Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.'
    //   1914: ldc_w 'Unexpected type converter '
    //   1917: invokestatic o : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   1920: aconst_null
    //   1921: areturn
    //   1922: aload #15
    //   1924: aload #13
    //   1926: getfield h : Ljava/util/concurrent/Executor;
    //   1929: putfield b : Ljava/util/concurrent/Executor;
    //   1932: aload #15
    //   1934: new tk1
    //   1937: dup
    //   1938: aload #13
    //   1940: getfield i : Ljava/util/concurrent/Executor;
    //   1943: iconst_1
    //   1944: invokespecial <init> : (Ljava/util/concurrent/Executor;I)V
    //   1947: putfield c : Ltk1;
    //   1950: aload #15
    //   1952: getfield b : Ljava/util/concurrent/Executor;
    //   1955: astore #11
    //   1957: aload #11
    //   1959: ifnull -> 2370
    //   1962: aload #11
    //   1964: invokestatic t : (Ljava/util/concurrent/Executor;)Lrs;
    //   1967: new xj0
    //   1970: dup
    //   1971: aconst_null
    //   1972: invokespecial <init> : (Lvj0;)V
    //   1975: invokestatic f0 : (Lms;Los;)Los;
    //   1978: invokestatic a : (Los;)Las;
    //   1981: astore #11
    //   1983: aload #15
    //   1985: aload #11
    //   1987: putfield a : Las;
    //   1990: aload #11
    //   1992: getfield b : Los;
    //   1995: astore #12
    //   1997: aload #15
    //   1999: getfield c : Ltk1;
    //   2002: astore #11
    //   2004: aload #11
    //   2006: ifnull -> 2362
    //   2009: aload #12
    //   2011: aload #11
    //   2013: invokestatic t : (Ljava/util/concurrent/Executor;)Lrs;
    //   2016: invokeinterface k : (Los;)Los;
    //   2021: pop
    //   2022: aload #15
    //   2024: aload #13
    //   2026: getfield f : Z
    //   2029: putfield g : Z
    //   2032: aload #15
    //   2034: getfield d : Lah1;
    //   2037: astore #11
    //   2039: aload #11
    //   2041: ifnull -> 2354
    //   2044: aload #11
    //   2046: invokevirtual c : ()Lir1;
    //   2049: astore #12
    //   2051: aload #12
    //   2053: astore #11
    //   2055: aload #12
    //   2057: ifnonnull -> 2066
    //   2060: aconst_null
    //   2061: astore #11
    //   2063: goto -> 2100
    //   2066: aload #11
    //   2068: instanceof d91
    //   2071: ifeq -> 2077
    //   2074: goto -> 2100
    //   2077: aload #11
    //   2079: instanceof xx
    //   2082: ifeq -> 2060
    //   2085: aload #11
    //   2087: checkcast xx
    //   2090: invokeinterface a : ()Lir1;
    //   2095: astore #11
    //   2097: goto -> 2066
    //   2100: aload #11
    //   2102: checkcast d91
    //   2105: astore #11
    //   2107: aload #15
    //   2109: getfield d : Lah1;
    //   2112: astore #11
    //   2114: aload #11
    //   2116: ifnull -> 2346
    //   2119: aload #11
    //   2121: invokevirtual c : ()Lir1;
    //   2124: astore #12
    //   2126: aload #12
    //   2128: astore #11
    //   2130: aload #12
    //   2132: ifnonnull -> 2141
    //   2135: aconst_null
    //   2136: astore #11
    //   2138: goto -> 2175
    //   2141: aload #11
    //   2143: instanceof ja
    //   2146: ifeq -> 2152
    //   2149: goto -> 2175
    //   2152: aload #11
    //   2154: instanceof xx
    //   2157: ifeq -> 2135
    //   2160: aload #11
    //   2162: checkcast xx
    //   2165: invokeinterface a : ()Lir1;
    //   2170: astore #11
    //   2172: goto -> 2141
    //   2175: aload #11
    //   2177: checkcast ja
    //   2180: astore #11
    //   2182: aload #15
    //   2184: checkcast androidx/work/impl/WorkDatabase
    //   2187: astore #11
    //   2189: aload_0
    //   2190: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2193: astore #12
    //   2195: aload #12
    //   2197: invokevirtual getClass : ()Ljava/lang/Class;
    //   2200: pop
    //   2201: new cn
    //   2204: dup
    //   2205: aload #12
    //   2207: aload #14
    //   2209: invokespecial <init> : (Landroid/content/Context;Ln2;)V
    //   2212: astore #12
    //   2214: new ma1
    //   2217: dup
    //   2218: aload_0
    //   2219: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2222: aload_1
    //   2223: aload #14
    //   2225: aload #11
    //   2227: invokespecial <init> : (Landroid/content/Context;Lip;Ln2;Landroidx/work/impl/WorkDatabase;)V
    //   2230: astore #13
    //   2232: getstatic dj1.a : Ljava/lang/String;
    //   2235: astore #15
    //   2237: new ns1
    //   2240: dup
    //   2241: aload_0
    //   2242: aload #11
    //   2244: aload_1
    //   2245: invokespecial <init> : (Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lip;)V
    //   2248: astore #16
    //   2250: aload_0
    //   2251: ldc_w androidx/work/impl/background/systemjob/SystemJobService
    //   2254: iconst_1
    //   2255: invokestatic a : (Landroid/content/Context;Ljava/lang/Class;Z)V
    //   2258: invokestatic h : ()Lqp0;
    //   2261: getstatic dj1.a : Ljava/lang/String;
    //   2264: ldc_w 'Created SystemJobScheduler and enabled SystemJobService'
    //   2267: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   2270: new te0
    //   2273: dup
    //   2274: aload_0
    //   2275: aload_1
    //   2276: aload #12
    //   2278: aload #13
    //   2280: new j01
    //   2283: dup
    //   2284: aload #13
    //   2286: aload #14
    //   2288: invokespecial <init> : (Lma1;Ln2;)V
    //   2291: aload #14
    //   2293: invokespecial <init> : (Landroid/content/Context;Lip;Lcn;Lma1;Lj01;Ln2;)V
    //   2296: astore #15
    //   2298: iconst_2
    //   2299: anewarray aj1
    //   2302: astore #17
    //   2304: aload #17
    //   2306: iload_2
    //   2307: aload #16
    //   2309: aastore
    //   2310: aload #17
    //   2312: iconst_1
    //   2313: aload #15
    //   2315: aastore
    //   2316: aload #17
    //   2318: invokestatic h0 : ([Ljava/lang/Object;)Ljava/util/List;
    //   2321: astore #15
    //   2323: new q72
    //   2326: dup
    //   2327: aload_0
    //   2328: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2331: aload_1
    //   2332: aload #14
    //   2334: aload #11
    //   2336: aload #15
    //   2338: aload #13
    //   2340: aload #12
    //   2342: invokespecial <init> : (Landroid/content/Context;Lip;Ln2;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lma1;Lcn;)V
    //   2345: areturn
    //   2346: ldc_w 'connectionManager'
    //   2349: invokestatic n0 : (Ljava/lang/String;)V
    //   2352: aconst_null
    //   2353: athrow
    //   2354: ldc_w 'connectionManager'
    //   2357: invokestatic n0 : (Ljava/lang/String;)V
    //   2360: aconst_null
    //   2361: athrow
    //   2362: ldc_w 'internalTransactionExecutor'
    //   2365: invokestatic n0 : (Ljava/lang/String;)V
    //   2368: aconst_null
    //   2369: athrow
    //   2370: ldc_w 'internalQueryExecutor'
    //   2373: invokestatic n0 : (Ljava/lang/String;)V
    //   2376: aconst_null
    //   2377: athrow
    //   2378: new ah1
    //   2381: dup
    //   2382: aload #13
    //   2384: new ps
    //   2387: dup
    //   2388: aload #15
    //   2390: invokespecial <init> : (Leh1;)V
    //   2393: invokespecial <init> : (Lgu;Lps;)V
    //   2396: pop
    //   2397: aconst_null
    //   2398: athrow
    //   2399: astore_0
    //   2400: goto -> 2411
    //   2403: astore_0
    //   2404: goto -> 2450
    //   2407: astore_0
    //   2408: goto -> 2488
    //   2411: aload #15
    //   2413: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   2416: astore_1
    //   2417: new java/lang/StringBuilder
    //   2420: dup
    //   2421: ldc_w 'Failed to create an instance of '
    //   2424: invokespecial <init> : (Ljava/lang/String;)V
    //   2427: astore #11
    //   2429: aload #11
    //   2431: aload_1
    //   2432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2435: pop
    //   2436: new java/lang/RuntimeException
    //   2439: dup
    //   2440: aload #11
    //   2442: invokevirtual toString : ()Ljava/lang/String;
    //   2445: aload_0
    //   2446: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2449: athrow
    //   2450: aload #15
    //   2452: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   2455: astore #11
    //   2457: new java/lang/StringBuilder
    //   2460: dup
    //   2461: ldc_w 'Cannot access the constructor '
    //   2464: invokespecial <init> : (Ljava/lang/String;)V
    //   2467: astore_1
    //   2468: aload_1
    //   2469: aload #11
    //   2471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2474: pop
    //   2475: new java/lang/RuntimeException
    //   2478: dup
    //   2479: aload_1
    //   2480: invokevirtual toString : ()Ljava/lang/String;
    //   2483: aload_0
    //   2484: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2487: athrow
    //   2488: aload #15
    //   2490: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   2493: astore_1
    //   2494: new java/lang/StringBuilder
    //   2497: dup
    //   2498: ldc_w 'Cannot find implementation for '
    //   2501: invokespecial <init> : (Ljava/lang/String;)V
    //   2504: astore #11
    //   2506: aload #11
    //   2508: aload_1
    //   2509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2512: pop
    //   2513: aload #11
    //   2515: ldc_w '. '
    //   2518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2521: pop
    //   2522: aload #11
    //   2524: aload #12
    //   2526: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2529: pop
    //   2530: aload #11
    //   2532: ldc_w ' does not exist. Is Room annotation processor correctly configured?'
    //   2535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2538: pop
    //   2539: new java/lang/RuntimeException
    //   2542: dup
    //   2543: aload #11
    //   2545: invokevirtual toString : ()Ljava/lang/String;
    //   2548: aload_0
    //   2549: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2552: athrow
    //   2553: ldc_w 'Required value was null.'
    //   2556: invokestatic l : (Ljava/lang/String;)V
    //   2559: aconst_null
    //   2560: areturn
    //   2561: ldc_w 'Required value was null.'
    //   2564: invokestatic l : (Ljava/lang/String;)V
    //   2567: aconst_null
    //   2568: areturn
    //   2569: ldc_w 'Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder'
    //   2572: invokestatic l : (Ljava/lang/String;)V
    //   2575: aconst_null
    //   2576: areturn
    // Exception table:
    //   from	to	target	type
    //   1044	1052	2407	java/lang/ClassNotFoundException
    //   1044	1052	2403	java/lang/IllegalAccessException
    //   1044	1052	2399	java/lang/InstantiationException
    //   1059	1100	2407	java/lang/ClassNotFoundException
    //   1059	1100	2403	java/lang/IllegalAccessException
    //   1059	1100	2399	java/lang/InstantiationException
    //   1100	1131	2407	java/lang/ClassNotFoundException
    //   1100	1131	2403	java/lang/IllegalAccessException
    //   1100	1131	2399	java/lang/InstantiationException
    //   1154	1167	1170	j21
  }
  
  public static void x0(Parcel paramParcel, int paramInt1, int paramInt2) {
    paramInt1 = h0(paramParcel, paramInt1);
    if (paramInt1 == paramInt2)
      return; 
    String str = Integer.toHexString(paramInt1);
    int i = String.valueOf(paramInt2).length();
    int j = String.valueOf(paramInt1).length();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + i + 19 + j + 4 + 1);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(zLtYiJUm.GElPBiUIxptGX);
    stringBuilder.append(paramInt1);
    throw new co(x41.o(stringBuilder, " (0x", str, ")"), paramParcel);
  }
  
  public static String y(int... paramVarArgs) {
    char[] arrayOfChar = new char[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayOfChar[b] = (char)(paramVarArgs[b] - 7295); 
    return new String(arrayOfChar);
  }
  
  public static String y0(Object paramObject) {
    if (paramObject == null)
      return "null"; 
    try {
      return paramObject.toString();
    } catch (Exception exception) {
      String str2 = paramObject.getClass().getName();
      paramObject = Integer.toHexString(System.identityHashCode(paramObject));
      paramObject = x41.o(new StringBuilder(str2.length() + 1 + String.valueOf(paramObject).length()), str2, "@", (String)paramObject);
      Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat((String)paramObject), exception);
      String str1 = exception.getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(paramObject.length() + 8 + str1.length() + 1);
      x41.v(stringBuilder, "<", (String)paramObject, " threw ", str1);
      stringBuilder.append(">");
      return stringBuilder.toString();
    } 
  }
  
  public static boolean z(View paramView, KeyEvent paramKeyEvent) {
    WeakHashMap weakHashMap = v22.a;
    if (Build.VERSION.SDK_INT < 28) {
      ArrayList arrayList = u22.d;
      u22 u22 = (u22)paramView.getTag(2131297585);
      WeakReference<KeyEvent> weakReference2 = null;
      Object<KeyEvent> object = (Object<KeyEvent>)u22;
      if (u22 == null) {
        object = (Object<KeyEvent>)new Object();
        ((u22)object).a = null;
        ((u22)object).b = null;
        ((u22)object).c = null;
        paramView.setTag(2131297585, object);
      } 
      WeakReference<KeyEvent> weakReference1 = ((u22)object).c;
      if (weakReference1 == null || weakReference1.get() != paramKeyEvent) {
        ((u22)object).c = new WeakReference<KeyEvent>(paramKeyEvent);
        if (((u22)object).b == null)
          ((u22)object).b = new SparseArray(); 
        SparseArray sparseArray = ((u22)object).b;
        weakReference1 = weakReference2;
        if (paramKeyEvent.getAction() == 1) {
          int i = sparseArray.indexOfKey(paramKeyEvent.getKeyCode());
          weakReference1 = weakReference2;
          if (i >= 0) {
            weakReference1 = (WeakReference<KeyEvent>)sparseArray.valueAt(i);
            sparseArray.removeAt(i);
          } 
        } 
        object = (Object<KeyEvent>)weakReference1;
        if (weakReference1 == null)
          object = (Object<KeyEvent>)sparseArray.get(paramKeyEvent.getKeyCode()); 
        if (object != null) {
          View view = (View)object.get();
          if (view != null && view.isAttachedToWindow()) {
            ArrayList<E> arrayList1 = (ArrayList)view.getTag(2131297586);
            if (arrayList1 != null) {
              int i = arrayList1.size() - 1;
              if (i >= 0) {
                arrayList1.get(i).getClass();
                tp.b();
                return false;
              } 
            } 
          } 
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public static void z0(Parcel paramParcel, int paramInt) {
    if (paramInt == 4)
      return; 
    String str = Integer.toHexString(paramInt);
    int j = String.valueOf(4).length();
    int i = String.valueOf(paramInt).length();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + j + 19 + i + 4 + 1);
    stringBuilder.append("Expected size 4 got ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new co(stringBuilder.toString(), paramParcel);
  }
  
  public abstract Method F(Class paramClass, Field paramField);
  
  public abstract Constructor H(Class paramClass);
  
  public abstract InputFilter[] L(InputFilter[] paramArrayOfInputFilter);
  
  public abstract String[] R(Class paramClass);
  
  public abstract boolean T();
  
  public abstract boolean V(Class paramClass);
  
  public abstract void X(d0 paramd01, d0 paramd02);
  
  public abstract void Y(d0 paramd0, Thread paramThread);
  
  public abstract boolean i(e0 parame0, a0 parama01, a0 parama02);
  
  public abstract boolean j(e0 parame0, Object paramObject1, Object paramObject2);
  
  public abstract boolean k(e0 parame0, d0 paramd01, d0 paramd02);
  
  public abstract void k0(boolean paramBoolean);
  
  public abstract void l0(boolean paramBoolean);
  
  public abstract TransformationMethod t0(TransformationMethod paramTransformationMethod);
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 28:
        break;
    } 
    return ((vu2)this).s.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ws2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */