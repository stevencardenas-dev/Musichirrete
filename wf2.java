import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.musicolet.MyApplication;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class wf2 implements ke2 {
  public static ClassLoader b;
  
  public static Thread c;
  
  public static final Object[] e = new Object[0];
  
  public static final f1 f = new f1("COMPLETING_ALREADY", 4);
  
  public static final f1 g = new f1("COMPLETING_WAITING_CHILDREN", 4);
  
  public static final f1 h = new f1("COMPLETING_RETRY", 4);
  
  public static final f1 i = new f1("TOO_LATE_TO_CANCEL", 4);
  
  public static final f1 j = new f1("SEALED", 4);
  
  public static final a40 k = new a40(false);
  
  public static final a40 l = new a40(true);
  
  public static final byte[] m = new byte[] { 112, 114, 111, 0 };
  
  public static final byte[] n = new byte[] { 112, 114, 109, 0 };
  
  public static final f1 o = new f1("NO_THREAD_ELEMENTS", 4);
  
  public static final on p = new on(6);
  
  public static final on q = new on(7);
  
  public static final on r = new on(8);
  
  public static String A(String paramString) {
    if (paramString != null)
      try {
        int i = paramString.lastIndexOf('/');
        if (i >= 0)
          return paramString.substring(0, i); 
      } finally {} 
    return null;
  }
  
  public static void A0(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 <= paramInt2)
      return; 
    m60.m(F0(paramInt1, paramInt2, "index"));
  }
  
  public static Uri B(String paramString, String... paramVarArgs) {
    Uri.Builder builder2 = Uri.parse("http://krosbits.in").buildUpon().appendPath("musicolet").appendPath("redirect");
    builder2.appendQueryParameter("android", String.valueOf(Build.VERSION.SDK_INT));
    int i = Build.VERSION.PREVIEW_SDK_INT;
    if (i != 0)
      builder2.appendQueryParameter("preview", String.valueOf(i)); 
    builder2.appendQueryParameter("app", "musicolet");
    builder2.appendQueryParameter("version", String.valueOf(530));
    Uri.Builder builder1 = builder2.appendQueryParameter("key", paramString);
    if (paramVarArgs.length > 0)
      builder1.appendQueryParameter("subKeys", TextUtils.join(",", (Object[])paramVarArgs)); 
    return builder1.build();
  }
  
  public static i91 C(AppCompatTextView paramAppCompatTextView) {
    TextDirectionHeuristic textDirectionHeuristic1;
    int k = Build.VERSION.SDK_INT;
    if (k >= 28)
      return new i91(k5.o(paramAppCompatTextView)); 
    TextPaint textPaint = new TextPaint((Paint)paramAppCompatTextView.getPaint());
    TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    int j = paramAppCompatTextView.getBreakStrategy();
    int i = paramAppCompatTextView.getHyphenationFrequency();
    if (paramAppCompatTextView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
      textDirectionHeuristic1 = TextDirectionHeuristics.LTR;
    } else {
      byte b = 1;
      if (k >= 28 && (paramAppCompatTextView.getInputType() & 0xF) == 3) {
        b = Character.getDirectionality(k5.d(DecimalFormatSymbols.getInstance(paramAppCompatTextView.getTextLocale()))[0].codePointAt(0));
        if (b == 1 || b == 2) {
          TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.RTL;
          return new i91(textPaint, textDirectionHeuristic, j, i);
        } 
        textDirectionHeuristic1 = TextDirectionHeuristics.LTR;
      } else {
        if (paramAppCompatTextView.getLayoutDirection() != 1)
          b = 0; 
        textDirectionHeuristic1 = textDirectionHeuristic2;
        switch (paramAppCompatTextView.getTextDirection()) {
          default:
            textDirectionHeuristic1 = textDirectionHeuristic2;
            if (b != 0)
              textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL; 
            break;
          case 7:
            textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            break;
          case 5:
            textDirectionHeuristic1 = TextDirectionHeuristics.LOCALE;
            break;
          case 4:
            textDirectionHeuristic1 = TextDirectionHeuristics.RTL;
            break;
          case 3:
            textDirectionHeuristic1 = TextDirectionHeuristics.LTR;
            break;
          case 2:
            textDirectionHeuristic1 = TextDirectionHeuristics.ANYRTL_LTR;
            break;
          case 6:
            break;
        } 
      } 
    } 
    return new i91(textPaint, textDirectionHeuristic1, j, i);
  }
  
  public static void C0(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0 || paramInt2 < paramInt1 || paramInt2 > paramInt3) {
      String str;
      if (paramInt1 >= 0 && paramInt1 <= paramInt3) {
        if (paramInt2 < 0 || paramInt2 > paramInt3) {
          String str1 = F0(paramInt2, paramInt3, "end index");
          throw new IndexOutOfBoundsException(str1);
        } 
        str = zo2.V("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = F0(paramInt1, paramInt3, "start index");
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static final int D(th1 paramth1) {
    paramth1.getClass();
    ai1 ai1 = paramth1.O("SELECT changes()");
    try {
      ai1.L();
      long l = ai1.getLong(0);
      return (int)l;
    } finally {
      Exception exception = null;
    } 
  }
  
  public static int E(Context paramContext, int paramInt) {
    if (paramInt != 0) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, zb1.v);
      TypedValue typedValue = new TypedValue();
      boolean bool2 = typedArray.getValue(4, typedValue);
      boolean bool1 = bool2;
      if (!bool2)
        bool1 = typedArray.getValue(2, typedValue); 
      typedArray.recycle();
      if (bool1) {
        int i = typedValue.getComplexUnit();
        paramInt = typedValue.data;
        return (i == 2) ? Math.round(TypedValue.complexToFloat(paramInt) * (paramContext.getResources().getDisplayMetrics()).density) : TypedValue.complexToDimensionPixelSize(paramInt, paramContext.getResources().getDisplayMetrics());
      } 
    } 
    return 0;
  }
  
  public static void E0(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0 || paramInt2 < paramInt1 || paramInt2 > paramInt3) {
      String str;
      if (paramInt1 >= 0 && paramInt1 <= paramInt3) {
        if (paramInt2 < 0 || paramInt2 > paramInt3) {
          String str1 = I0(paramInt2, paramInt3, "end index");
          throw new IndexOutOfBoundsException(str1);
        } 
        str = ws2.u0("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = I0(paramInt1, paramInt3, "start index");
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static ArrayList F(JSONArray paramJSONArray) {
    ArrayList<km0> arrayList = new ArrayList();
    byte b = 0;
    q01 q01 = new q01(0);
    while (b < paramJSONArray.length()) {
      try {
        km0 km0 = G(paramJSONArray.getJSONObject(b), q01);
        if (km0 != null)
          arrayList.add(km0); 
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
      b++;
    } 
    return arrayList;
  }
  
  public static String F0(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0)
      return zo2.V("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return zo2.V("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    ck2.b(String.valueOf(paramInt2).length() + 15, paramInt2, "negative size: ");
    return null;
  }
  
  public static km0 G(JSONObject paramJSONObject, q01 paramq01) {
    try {
      String str4 = paramJSONObject.getString("S_T");
      String str2 = paramJSONObject.getString("S_AL");
      String str1 = paramJSONObject.getString("S_AR");
      String str3 = paramJSONObject.getString("S_P");
      int i = paramJSONObject.getInt("S_D");
      qn1 qn1 = new qn1();
      wo wo = new wo();
      this(str3, paramq01);
      this(wo, str4, paramq01.a(str2), paramq01.a(str1), i);
      return new km0(0, qn1, null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, null, null, null, 0);
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
      return null;
    } 
  }
  
  public static boolean G0(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean, fb0 paramfb0, String paramString, ue2 paramue2) {
    kg2 kg2;
    ArrayList<IOException> arrayList = new ArrayList();
    Field field = n21.f0("pathList", paramClassLoader);
    byte b = 0;
    try {
      paramfb0 = (fb0)Object.class.cast(field.get(paramClassLoader));
      kg2 = n21.Y(paramfb0, "dexElements", Object.class);
      list = Arrays.asList((Object[])kg2.E());
      ArrayList<File> arrayList1 = new ArrayList();
      for (List list : list) {
        Field field1 = n21.f0(paramString, list);
        try {
          File file = (File)File.class.cast(field1.get(list));
          arrayList1.add(file);
        } catch (Exception exception) {
          k91.k("Failed to get value of field ", field1.getName(), list.getClass().getName(), File.class.getName(), exception);
          return false;
        } 
      } 
      if (!exception.contains(paramFile2)) {
        if (paramBoolean || paramue2.d(paramfb0, paramFile2, paramFile1)) {
          kg2.H(Arrays.asList((Object[])n21.c0(paramfb0, "makePathElements", List.class, new ArrayList(Collections.singleton(paramFile2)), paramFile1, List.class, arrayList)));
          if (!arrayList.isEmpty()) {
            exception = new RuntimeException("DexPathList.makeDexElement failed");
            int i = arrayList.size();
            while (true) {
              if (b < i) {
                IOException iOException = arrayList.get(b);
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                try {
                  Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class }).invoke(exception, new Object[] { iOException });
                } catch (Exception exception1) {}
                b++;
                continue;
              } 
              n21.Y(paramfb0, "dexElementsSuppressedExceptions", IOException.class).H(arrayList);
              throw exception;
            } 
          } 
          return true;
        } 
        Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(paramFile2.getPath())));
        return false;
      } 
      return true;
    } catch (Exception exception1) {
      k91.k("Failed to get value of field ", kg2.getName(), exception.getClass().getName(), Object.class.getName(), exception1);
      return false;
    } 
  }
  
  public static boolean I(Context paramContext) {
    return ((paramContext.getResources().getConfiguration()).fontScale >= 1.3F);
  }
  
  public static String I0(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0)
      return ws2.u0("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return ws2.u0("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    ck2.b(String.valueOf(paramInt2).length() + 15, paramInt2, "negative size: ");
    return null;
  }
  
  public static boolean J(MotionEvent paramMotionEvent, int paramInt) {
    return ((paramMotionEvent.getSource() & paramInt) == paramInt);
  }
  
  public static float K(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2) {
    if (Build.VERSION.SDK_INT >= 31)
      return y20.c(paramEdgeEffect, paramFloat1, paramFloat2); 
    paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  public static void L() {
    int i = MyApplication.o().getInt("k_i_fldjpg", 1);
    if (MyApplication.G.g() && i != 0 && n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_MEDIA_IMAGES") == 0)
      x41.u("k_i_fldjpg", i); 
  }
  
  public static int[] M(ByteArrayInputStream paramByteArrayInputStream, int paramInt) {
    int[] arrayOfInt = new int[paramInt];
    byte b = 0;
    int i = 0;
    while (b < paramInt) {
      i += (int)qv.V(paramByteArrayInputStream, 2);
      arrayOfInt[b] = i;
      b++;
    } 
    return arrayOfInt;
  }
  
  public static ny[] N(FileInputStream paramFileInputStream, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, ny[] paramArrayOfny) {
    ByteArrayInputStream byteArrayInputStream;
    byte[] arrayOfByte = zo2.j;
    if (Arrays.equals(paramArrayOfbyte1, arrayOfByte)) {
      if (!Arrays.equals(zo2.e, paramArrayOfbyte2)) {
        if (Arrays.equals(paramArrayOfbyte1, arrayOfByte)) {
          int i = (int)qv.V(paramFileInputStream, 1);
          long l = qv.V(paramFileInputStream, 4);
          paramArrayOfbyte1 = qv.S(paramFileInputStream, (int)qv.V(paramFileInputStream, 4), (int)l);
          if (paramFileInputStream.read() <= 0) {
            byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte1);
            try {
              return O(byteArrayInputStream, i, paramArrayOfny);
            } finally {
              try {
                byteArrayInputStream.close();
              } finally {
                byteArrayInputStream = null;
              } 
            } 
          } 
          tp.f("Content found after the end of file");
          return null;
        } 
        tp.f("Unsupported meta version");
        return null;
      } 
      tp.f("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
      return null;
    } 
    if (Arrays.equals(paramArrayOfbyte1, zo2.k)) {
      int i = (int)qv.V(byteArrayInputStream, 2);
      long l = qv.V(byteArrayInputStream, 4);
      paramArrayOfbyte1 = qv.S((FileInputStream)byteArrayInputStream, (int)qv.V(byteArrayInputStream, 4), (int)l);
      if (byteArrayInputStream.read() <= 0) {
        byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte1);
        try {
          return P(byteArrayInputStream, paramArrayOfbyte2, i, paramArrayOfny);
        } finally {
          try {
            byteArrayInputStream.close();
          } finally {
            byteArrayInputStream = null;
          } 
        } 
      } 
      tp.f("Content found after the end of file");
      return null;
    } 
    tp.f("Unsupported meta version");
    return null;
  }
  
  public static ny[] O(ByteArrayInputStream paramByteArrayInputStream, int paramInt, ny[] paramArrayOfny) {
    int i = paramByteArrayInputStream.available();
    boolean bool = false;
    if (i == 0)
      return new ny[0]; 
    if (paramInt == paramArrayOfny.length) {
      String[] arrayOfString = new String[paramInt];
      int[] arrayOfInt = new int[paramInt];
      int j = 0;
      while (true) {
        i = bool;
        if (j < paramInt) {
          i = (int)qv.V(paramByteArrayInputStream, 2);
          arrayOfInt[j] = (int)qv.V(paramByteArrayInputStream, 2);
          arrayOfString[j] = new String(qv.R(paramByteArrayInputStream, i), StandardCharsets.UTF_8);
          j++;
          continue;
        } 
        break;
      } 
      while (i < paramInt) {
        ny ny1 = paramArrayOfny[i];
        if (ny1.b.equals(arrayOfString[i])) {
          j = arrayOfInt[i];
          ny1.e = j;
          ny1.h = M(paramByteArrayInputStream, j);
          i++;
          continue;
        } 
        tp.f("Order of dexfiles in metadata did not match baseline");
        return null;
      } 
      return paramArrayOfny;
    } 
    tp.f("Mismatched number of dex files found in metadata");
    return null;
  }
  
  public static ny[] P(ByteArrayInputStream paramByteArrayInputStream, byte[] paramArrayOfbyte, int paramInt, ny[] paramArrayOfny) {
    if (paramByteArrayInputStream.available() == 0)
      return new ny[0]; 
    if (paramInt == paramArrayOfny.length) {
      byte b = 0;
      while (b < paramInt) {
        String str1;
        int[] arrayOfInt;
        qv.V(paramByteArrayInputStream, 2);
        String str2 = new String(qv.R(paramByteArrayInputStream, (int)qv.V(paramByteArrayInputStream, 2)), StandardCharsets.UTF_8);
        long l = qv.V(paramByteArrayInputStream, 4);
        int k = (int)qv.V(paramByteArrayInputStream, 2);
        if (paramArrayOfny.length <= 0)
          continue; 
        int j = str2.indexOf("!");
        int i = j;
        if (j < 0)
          i = str2.indexOf(":"); 
        if (i > 0) {
          str1 = str2.substring(i + 1);
        } else {
          str1 = str2;
        } 
        i = 0;
        while (true) {
          if (i < paramArrayOfny.length) {
            if ((paramArrayOfny[i]).b.equals(str1)) {
              ny ny1 = paramArrayOfny[i];
              break;
            } 
            i++;
            continue;
          } 
          str1 = null;
          break;
        } 
        if (str1 != null) {
          ((ny)str1).d = l;
          arrayOfInt = M(paramByteArrayInputStream, k);
          if (Arrays.equals(paramArrayOfbyte, zo2.i)) {
            ((ny)str1).e = k;
            ((ny)str1).h = arrayOfInt;
          } 
          b++;
          continue;
        } 
        tp.f("Missing profile key: ".concat((String)arrayOfInt));
        return null;
      } 
      return paramArrayOfny;
    } 
    tp.f("Mismatched number of dex files found in metadata");
    return null;
  }
  
  public static ny[] Q(FileInputStream paramFileInputStream, byte[] paramArrayOfbyte, String paramString) {
    if (Arrays.equals(paramArrayOfbyte, zo2.f)) {
      int i = (int)qv.V(paramFileInputStream, 1);
      long l = qv.V(paramFileInputStream, 4);
      paramArrayOfbyte = qv.S(paramFileInputStream, (int)qv.V(paramFileInputStream, 4), (int)l);
      if (paramFileInputStream.read() <= 0) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
        try {
          return R(byteArrayInputStream, paramString, i);
        } finally {
          try {
            byteArrayInputStream.close();
          } finally {
            byteArrayInputStream = null;
          } 
        } 
      } 
      tp.f("Content found after the end of file");
      return null;
    } 
    tp.f("Unsupported version");
    return null;
  }
  
  public static ny[] R(ByteArrayInputStream paramByteArrayInputStream, String paramString, int paramInt) {
    int i = paramByteArrayInputStream.available();
    int k = 0;
    if (i == 0)
      return new ny[0]; 
    ny[] arrayOfNy = new ny[paramInt];
    for (i = 0; i < paramInt; i++) {
      int n = (int)qv.V(paramByteArrayInputStream, 2);
      int m = (int)qv.V(paramByteArrayInputStream, 2);
      long l2 = qv.V(paramByteArrayInputStream, 4);
      long l3 = qv.V(paramByteArrayInputStream, 4);
      long l1 = qv.V(paramByteArrayInputStream, 4);
      arrayOfNy[i] = new ny(paramString, new String(qv.R(paramByteArrayInputStream, n), StandardCharsets.UTF_8), l3, m, (int)l2, (int)l1, new int[m], new TreeMap<Object, Object>());
    } 
    int j = 0;
    i = k;
    while (j < paramInt) {
      ny ny = arrayOfNy[j];
      int m = paramByteArrayInputStream.available();
      k = ny.f;
      int i1 = ny.g;
      TreeMap<Integer, Integer> treeMap = ny.i;
      int i2 = m - k;
      int n = i;
      m = j;
      label58: while (paramByteArrayInputStream.available() > i2) {
        int i4 = n + (int)qv.V(paramByteArrayInputStream, 2);
        treeMap.put(Integer.valueOf(i4), Integer.valueOf(1));
        int i3 = (int)qv.V(paramByteArrayInputStream, 2);
        k = m;
        j = i;
        while (true) {
          i = j;
          m = k;
          n = i4;
          if (i3 > 0) {
            qv.V(paramByteArrayInputStream, 2);
            int i5 = (int)qv.V(paramByteArrayInputStream, 1);
            if (i5 != 6) {
              m = j;
              i = k;
              n = i5;
              if (i5 != 7)
                while (true) {
                  j = m;
                  k = i;
                  if (n > 0) {
                    qv.V(paramByteArrayInputStream, 1);
                    for (j = (int)qv.V(paramByteArrayInputStream, 1); j > 0; j--)
                      qv.V(paramByteArrayInputStream, 2); 
                    n--;
                    continue;
                  } 
                  break;
                }  
            } 
            i3--;
            continue;
          } 
          continue label58;
        } 
      } 
      if (paramByteArrayInputStream.available() == i2) {
        ny.h = M(paramByteArrayInputStream, ny.e);
        BitSet bitSet = BitSet.valueOf(qv.R(paramByteArrayInputStream, (i1 * 2 + 7 & 0xFFFFFFF8) / 8));
        for (k = i; k < i1; k++) {
          if (bitSet.get(k)) {
            j = 2;
          } else {
            j = i;
          } 
          int i3 = j;
          if (bitSet.get(k + i1))
            i3 = j | 0x4; 
          if (i3 != 0) {
            Integer integer2 = treeMap.get(Integer.valueOf(k));
            Integer integer1 = integer2;
            if (integer2 == null)
              integer1 = Integer.valueOf(i); 
            treeMap.put(Integer.valueOf(k), Integer.valueOf(i3 | integer1.intValue()));
          } 
        } 
        j = m + 1;
        continue;
      } 
      tp.f("Read too much data during profile line parse");
      return null;
    } 
    return arrayOfNy;
  }
  
  public static void S() {
    if (n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_MEDIA_IMAGES") != 0) {
      int i = MyApplication.o().getInt("k_i_fldjpg", jm1.e);
      if (MyApplication.G.g() && i != 0) {
        x41.u("k_i_fldjpg", 0);
        p3.c = 0;
      } 
    } 
  }
  
  public static void T() {
    boolean bool1;
    boolean bool = MyApplication.o().getBoolean("B_MLCKSN", false);
    if (n21.p(MyApplication.i.getApplicationContext(), "android.permission.POST_NOTIFICATIONS") != 0) {
      if (MyApplication.o().getInt("k_i_nstl", jm1.d) != 2)
        x41.u("k_i_nstl", 2); 
      bool1 = bool;
    } else {
      bool1 = false;
    } 
    boolean bool2 = bool1;
    if (!(new z21(MyApplication.i.getApplicationContext())).a()) {
      bool2 = bool1;
      if (bool)
        bool2 = true; 
    } 
    if (bool2)
      MyApplication.o().edit().putBoolean("B_MLCKSN", false).apply(); 
  }
  
  public static void U() {
    if (n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_MEDIA_VIDEO") != 0) {
      boolean bool = MyApplication.o().getBoolean("k_b_scvfl", false);
      if (MyApplication.G.g() && bool)
        MyApplication.o().edit().putBoolean("k_b_scvfl", false).apply(); 
    } 
  }
  
  public static void V() {
    if (MyApplication.o().getInt("k_i_wdth", 1) == 5)
      x41.u("k_i_wdth", 2); 
  }
  
  public static final void W(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    paramArrayOfObject.getClass();
    while (paramInt1 < paramInt2) {
      paramArrayOfObject[paramInt1] = null;
      paramInt1++;
    } 
  }
  
  public static final void X(os paramos, Object paramObject) {
    if (paramObject != o) {
      pu1 pu1;
      if (paramObject instanceof pu1) {
        pu1 = (pu1)paramObject;
        lu1[] arrayOfLu1 = pu1.c;
        int i = arrayOfLu1.length - 1;
        if (i >= 0)
          while (true) {
            int j = i - 1;
            lu1 lu1 = arrayOfLu1[i];
            lu1.getClass();
            paramObject = pu1.b[i];
            lu1.c.set(paramObject);
            if (j < 0)
              break; 
            i = j;
          }  
        return;
      } 
      Object object = pu1.h(null, q);
      object.getClass();
      ((lu1)object).c.set(paramObject);
      return;
    } 
  }
  
  public static long Y(long paramLong1, long paramLong2) {
    long l = paramLong1 + paramLong2;
    if ((paramLong1 ^ l) >= 0L || (paramLong1 ^ paramLong2) < 0L)
      return l; 
    StringBuilder stringBuilder = new StringBuilder("The calculation caused an overflow: ");
    stringBuilder.append(paramLong1);
    stringBuilder.append(" + ");
    stringBuilder.append(paramLong2);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static int Z(long paramLong) {
    if (-2147483648L <= paramLong && paramLong <= 2147483647L)
      return (int)paramLong; 
    StringBuilder stringBuilder = new StringBuilder("Value cannot fit in an int: ");
    stringBuilder.append(paramLong);
    throw new ArithmeticException(stringBuilder.toString());
  }
  
  public static final as a(os paramos) {
    if (paramos.l(vs2.g) == null)
      paramos = paramos.k(g92.a()); 
    return new as(paramos);
  }
  
  public static final String b(Object[] paramArrayOfObject, int paramInt1, int paramInt2, u paramu) {
    StringBuilder stringBuilder = new StringBuilder(paramInt2 * 3 + 2);
    stringBuilder.append("[");
    for (byte b = 0; b < paramInt2; b++) {
      if (b > 0)
        stringBuilder.append(", "); 
      Object object = paramArrayOfObject[paramInt1 + b];
      if (object == paramu) {
        stringBuilder.append("(this Collection)");
      } else {
        stringBuilder.append(object);
      } 
    } 
    stringBuilder.append(jLnXOLx.dbzopj);
    return stringBuilder.toString();
  }
  
  public static String c(long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramLong);
    stringBuilder.append(" (");
    stringBuilder.append(f(paramLong));
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public static void c0(TextView paramTextView, int paramInt) {
    if (paramInt >= 0) {
      int i;
      if (Build.VERSION.SDK_INT >= 28) {
        k5.t(paramTextView, paramInt);
        return;
      } 
      Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      if (paramTextView.getIncludeFontPadding()) {
        i = fontMetricsInt.top;
      } else {
        i = fontMetricsInt.ascent;
      } 
      if (paramInt > Math.abs(i))
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + i, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom()); 
      return;
    } 
    l0.k();
  }
  
  public static String d(byte paramByte) {
    StringBuilder stringBuilder = new StringBuilder("0x");
    stringBuilder.append(Integer.toHexString(paramByte));
    return stringBuilder.toString();
  }
  
  public static void d0(TextView paramTextView, int paramInt) {
    if (paramInt >= 0) {
      int i;
      Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      if (paramTextView.getIncludeFontPadding()) {
        i = fontMetricsInt.bottom;
      } else {
        i = fontMetricsInt.descent;
      } 
      if (paramInt > Math.abs(i))
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - i); 
      return;
    } 
    l0.k();
  }
  
  public static String e(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder("0x");
    stringBuilder.append(Integer.toHexString(paramInt));
    return stringBuilder.toString();
  }
  
  public static void e0(TextView paramTextView, int paramInt) {
    if (paramInt >= 0) {
      int i = paramTextView.getPaint().getFontMetricsInt(null);
      if (paramInt != i)
        paramTextView.setLineSpacing((paramInt - i), 1.0F); 
      return;
    } 
    l0.k();
  }
  
  public static String f(long paramLong) {
    String str = Long.toHexString(paramLong);
    return (str.length() == 1) ? "0x0".concat(str) : "0x".concat(str);
  }
  
  public static final Rect f0(Bitmap paramBitmap, RectF paramRectF) {
    float f2 = paramBitmap.getWidth() / paramBitmap.getHeight();
    float f3 = paramRectF.width() / paramRectF.height();
    if (f2 > f3) {
      f3 = paramBitmap.getHeight() * f3;
      f2 = (paramBitmap.getWidth() - f3) / 2.0F;
      return new Rect(ws2.j0(f2), 0, ws2.j0(f2 + f3), ws2.j0(paramBitmap.getHeight()));
    } 
    f2 = paramBitmap.getWidth() / f3;
    f3 = (paramBitmap.getHeight() - f2) / 2.0F;
    return new Rect(0, ws2.j0(f3), ws2.j0(paramBitmap.getWidth()), ws2.j0(f3 + f2));
  }
  
  public static Bitmap g(Bitmap paramBitmap, int paramInt) {
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    int i = j * k;
    int[] arrayOfInt3 = new int[i];
    paramBitmap.getPixels(arrayOfInt3, 0, j, 0, 0, j, k);
    int[] arrayOfInt2 = new int[i];
    paramBitmap.getPixels(arrayOfInt2, 0, j, 0, 0, j, k);
    byte b;
    for (b = 0; b < j; b++) {
      byte b1 = 0;
      int n = 0;
      int m = n;
      for (i = m; b1 < k; i = i1) {
        int i1;
        int i2;
        int i3;
        if (b1 == 0) {
          int i4 = -paramInt;
          while (true) {
            i3 = n;
            i2 = m;
            i1 = i;
            if (i4 <= paramInt) {
              i1 = arrayOfInt3[q0(b1 + i4, k) * j + b];
              float f2 = Color.red(i1);
              float f3 = Color.green(i1);
              float f4 = Color.blue(i1);
              n = (int)(n + f2);
              m = (int)(m + f3);
              i = (int)(i + f4);
              i4++;
              continue;
            } 
            break;
          } 
        } else {
          i1 = arrayOfInt3[q0(b1 + paramInt, k) * j + b];
          int i4 = arrayOfInt3[q0(b1 - 1 - paramInt, k) * j + b];
          i3 = Color.red(i1);
          i2 = Color.green(i1);
          i1 = Color.blue(i1);
          int i6 = Color.red(i4);
          int i5 = Color.green(i4);
          i4 = Color.blue(i4);
          i3 = n - i6 + i3;
          i2 = m - i5 + i2;
          i1 = i - i4 + i1;
        } 
        i = paramInt * 2 + 1;
        arrayOfInt2[b1 * j + b] = Color.argb(255, l(i3 / i), l(i2 / i), l(i1 / i));
        b1++;
        n = i3;
        m = i2;
      } 
    } 
    Bitmap bitmap = Bitmap.createBitmap(arrayOfInt2, j, k, paramBitmap.getConfig());
    j = bitmap.getWidth();
    k = bitmap.getHeight();
    i = j * k;
    arrayOfInt2 = new int[i];
    bitmap.getPixels(arrayOfInt2, 0, j, 0, 0, j, k);
    int[] arrayOfInt1 = new int[i];
    bitmap.getPixels(arrayOfInt1, 0, j, 0, 0, j, k);
    for (b = 0; b < k; b++) {
      byte b1 = 0;
      int m = 0;
      int n = m;
      for (i = n; b1 < j; i = i1) {
        int i1;
        int i2;
        int i3;
        if (b1 == 0) {
          int i4 = -paramInt;
          while (true) {
            i3 = m;
            i2 = n;
            i1 = i;
            if (i4 <= paramInt) {
              i2 = arrayOfInt2[q0(b1 + i4, j) + b * j];
              i3 = Color.red(i2);
              i1 = Color.green(i2);
              i2 = Color.blue(i2);
              m += i3;
              n += i1;
              i += i2;
              i4++;
              continue;
            } 
            break;
          } 
        } else {
          i1 = b * j;
          i2 = arrayOfInt2[q0(b1 + paramInt, j) + i1];
          int i5 = arrayOfInt2[q0(b1 - 1 - paramInt, j) + i1];
          i3 = Color.red(i2);
          i1 = Color.green(i2);
          int i4 = Color.blue(i2);
          int i6 = Color.red(i5);
          i2 = Color.green(i5);
          i5 = Color.blue(i5);
          i3 = m - i6 + i3;
          i2 = n - i2 + i1;
          i1 = i - i5 + i4;
        } 
        i = paramInt * 2 + 1;
        arrayOfInt1[b * j + b1] = Color.argb(255, l(i3 / i), l(i2 / i), l(i1 / i));
        b1++;
        m = i3;
        n = i2;
      } 
    } 
    return Bitmap.createBitmap(arrayOfInt1, j, k, bitmap.getConfig());
  }
  
  public static final Object g0(os paramos) {
    Object object = paramos.h(Integer.valueOf(0), p);
    object.getClass();
    return object;
  }
  
  public static void h(xs paramxs) {
    vj0 vj0 = (vj0)paramxs.g().l(vs2.g);
    if (vj0 != null) {
      vj0.c(null);
      return;
    } 
    tp.k("Scope cannot be cancelled because it does not have a job: ", paramxs);
  }
  
  public static final Object[] h0(Collection paramCollection) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface size : ()I
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 14
    //   11: goto -> 32
    //   14: aload_0
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #5
    //   22: aload #5
    //   24: invokeinterface hasNext : ()Z
    //   29: ifne -> 36
    //   32: getstatic wf2.e : [Ljava/lang/Object;
    //   35: areturn
    //   36: iload_1
    //   37: anewarray java/lang/Object
    //   40: astore #4
    //   42: iconst_0
    //   43: istore_1
    //   44: iload_1
    //   45: iconst_1
    //   46: iadd
    //   47: istore_2
    //   48: aload #4
    //   50: iload_1
    //   51: aload #5
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: aastore
    //   59: iload_2
    //   60: aload #4
    //   62: arraylength
    //   63: if_icmplt -> 131
    //   66: aload #5
    //   68: invokeinterface hasNext : ()Z
    //   73: ifne -> 79
    //   76: aload #4
    //   78: areturn
    //   79: iload_2
    //   80: iconst_3
    //   81: imul
    //   82: iconst_1
    //   83: iadd
    //   84: iconst_1
    //   85: iushr
    //   86: istore_3
    //   87: iload_3
    //   88: istore_1
    //   89: iload_3
    //   90: iload_2
    //   91: if_icmpgt -> 116
    //   94: ldc_w 2147483645
    //   97: istore_1
    //   98: iload_2
    //   99: ldc_w 2147483645
    //   102: if_icmpge -> 108
    //   105: goto -> 116
    //   108: new java/lang/OutOfMemoryError
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: athrow
    //   116: aload #4
    //   118: iload_1
    //   119: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   122: astore_0
    //   123: iload_2
    //   124: istore_1
    //   125: aload_0
    //   126: astore #4
    //   128: goto -> 44
    //   131: aload #4
    //   133: astore_0
    //   134: aload #5
    //   136: invokeinterface hasNext : ()Z
    //   141: ifne -> 123
    //   144: aload #4
    //   146: iload_2
    //   147: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   150: areturn
  }
  
  public static String i(String paramString) {
    if (paramString != null)
      return (new qj2(paramString, null)).b(); 
    l0.l("applicationId cannot be null");
    return null;
  }
  
  public static final Object[] i0(Collection paramCollection, Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface size : ()I
    //   6: istore_3
    //   7: iconst_0
    //   8: istore_2
    //   9: iload_3
    //   10: ifne -> 24
    //   13: aload_1
    //   14: arraylength
    //   15: ifle -> 51
    //   18: aload_1
    //   19: iconst_0
    //   20: aconst_null
    //   21: aastore
    //   22: aload_1
    //   23: areturn
    //   24: aload_0
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #6
    //   32: aload #6
    //   34: invokeinterface hasNext : ()Z
    //   39: ifne -> 53
    //   42: aload_1
    //   43: arraylength
    //   44: ifle -> 51
    //   47: aload_1
    //   48: iconst_0
    //   49: aconst_null
    //   50: aastore
    //   51: aload_1
    //   52: areturn
    //   53: iload_3
    //   54: aload_1
    //   55: arraylength
    //   56: if_icmpgt -> 64
    //   59: aload_1
    //   60: astore_0
    //   61: goto -> 86
    //   64: aload_1
    //   65: invokevirtual getClass : ()Ljava/lang/Class;
    //   68: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   71: iload_3
    //   72: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   75: astore_0
    //   76: aload_0
    //   77: invokevirtual getClass : ()Ljava/lang/Class;
    //   80: pop
    //   81: aload_0
    //   82: checkcast [Ljava/lang/Object;
    //   85: astore_0
    //   86: iload_2
    //   87: iconst_1
    //   88: iadd
    //   89: istore_3
    //   90: aload_0
    //   91: iload_2
    //   92: aload #6
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: aastore
    //   100: iload_3
    //   101: aload_0
    //   102: arraylength
    //   103: if_icmplt -> 173
    //   106: aload #6
    //   108: invokeinterface hasNext : ()Z
    //   113: ifne -> 118
    //   116: aload_0
    //   117: areturn
    //   118: iload_3
    //   119: iconst_3
    //   120: imul
    //   121: iconst_1
    //   122: iadd
    //   123: iconst_1
    //   124: iushr
    //   125: istore #4
    //   127: iload #4
    //   129: istore_2
    //   130: iload #4
    //   132: iload_3
    //   133: if_icmpgt -> 158
    //   136: ldc_w 2147483645
    //   139: istore_2
    //   140: iload_3
    //   141: ldc_w 2147483645
    //   144: if_icmpge -> 150
    //   147: goto -> 158
    //   150: new java/lang/OutOfMemoryError
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: athrow
    //   158: aload_0
    //   159: iload_2
    //   160: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   163: astore #5
    //   165: iload_3
    //   166: istore_2
    //   167: aload #5
    //   169: astore_0
    //   170: goto -> 86
    //   173: aload_0
    //   174: astore #5
    //   176: aload #6
    //   178: invokeinterface hasNext : ()Z
    //   183: ifne -> 165
    //   186: aload_0
    //   187: aload_1
    //   188: if_acmpne -> 197
    //   191: aload_1
    //   192: iload_3
    //   193: aconst_null
    //   194: aastore
    //   195: aload_1
    //   196: areturn
    //   197: aload_0
    //   198: iload_3
    //   199: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   202: areturn
  }
  
  public static void j(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0 && paramInt2 <= paramInt3) {
      if (paramInt1 <= paramInt2)
        return; 
      l0.l(ga1.j("fromIndex: ", paramInt1, paramInt2, " > toIndex: "));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("fromIndex: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(", toIndex: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(", size: ");
    stringBuilder.append(paramInt3);
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public static boolean j0(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfbyte, ny[] paramArrayOfny) {
    IllegalStateException illegalStateException;
    String str;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2 = zo2.i;
    byte[] arrayOfByte3 = zo2.h;
    byte[] arrayOfByte4 = zo2.e;
    if (Arrays.equals(paramArrayOfbyte, arrayOfByte4)) {
      int i;
      int k;
      ByteArrayOutputStream byteArrayOutputStream2;
      ArrayList<w82> arrayList = new ArrayList(3);
      ArrayList<byte[]> arrayList1 = new ArrayList(3);
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      try {
        qv.A0(byteArrayOutputStream1, paramArrayOfny.length);
        k = 2;
        byte b = 0;
        i = 2;
        while (b < paramArrayOfny.length) {
          ny ny1 = paramArrayOfny[b];
          qv.z0(byteArrayOutputStream1, ny1.c, 4);
          qv.z0(byteArrayOutputStream1, ny1.d, 4);
          qv.z0(byteArrayOutputStream1, ny1.g, 4);
          String str1 = s(ny1.a, ny1.b, arrayOfByte4);
          Charset charset = StandardCharsets.UTF_8;
          int m = (str1.getBytes(charset)).length;
          qv.A0(byteArrayOutputStream1, m);
          i = i + 14 + m;
          byteArrayOutputStream1.write(str1.getBytes(charset));
          b++;
        } 
      } finally {}
      arrayOfByte4 = byteArrayOutputStream1.toByteArray();
      int j = arrayOfByte4.length;
      if (i == j) {
        w82 w82 = new w82(1, arrayOfByte4, false);
        byteArrayOutputStream1.close();
        arrayList.add(w82);
        byteArrayOutputStream1 = new ByteArrayOutputStream();
        j = 0;
        int m = 0;
        i = k;
        while (true) {
          int n = 0;
          try {
            if (j < paramArrayOfny.length) {
              ny ny1 = paramArrayOfny[j];
              qv.A0(byteArrayOutputStream1, j);
              qv.A0(byteArrayOutputStream1, ny1.e);
              int i1 = m + 4 + ny1.e * i;
              int[] arrayOfInt = ny1.h;
              int i2 = arrayOfInt.length;
              k = 0;
              m = n;
              while (m < i2) {
                n = arrayOfInt[m];
                qv.A0(byteArrayOutputStream1, n - k);
                m++;
                k = n;
              } 
              j++;
              m = i1;
              continue;
            } 
          } finally {}
          byte[] arrayOfByte = byteArrayOutputStream1.toByteArray();
          if (m == arrayOfByte.length) {
            w82 w821 = new w82(3, arrayOfByte, true);
            byteArrayOutputStream1.close();
            arrayList.add(w821);
            byteArrayOutputStream1 = new ByteArrayOutputStream();
            j = 0;
            m = 0;
            try {
              while (j < paramArrayOfny.length) {
                ny ny1 = paramArrayOfny[j];
                Iterator<Map.Entry> iterator = ny1.i.entrySet().iterator();
                for (k = 0; iterator.hasNext(); k |= ((Integer)((Map.Entry)iterator.next()).getValue()).intValue());
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                this();
                try {
                  t0(byteArrayOutputStream2, k, ny1);
                  byte[] arrayOfByte5 = byteArrayOutputStream2.toByteArray();
                  byteArrayOutputStream2.close();
                  byteArrayOutputStream2 = new ByteArrayOutputStream();
                  this();
                } finally {
                  try {
                    byteArrayOutputStream2.close();
                  } finally {
                    arrayList = null;
                  } 
                } 
              } 
            } finally {}
            arrayOfByte1 = byteArrayOutputStream1.toByteArray();
            if (m == arrayOfByte1.length) {
              w82 w822 = new w82(4, arrayOfByte1, true);
              byteArrayOutputStream1.close();
              arrayList.add(w822);
              long l = 12L + (arrayList.size() * 16);
              qv.z0(paramByteArrayOutputStream, arrayList.size(), 4);
              for (j = 0; j < arrayList.size(); j++) {
                long l1;
                w822 = arrayList.get(j);
                m = w822.a;
                arrayOfByte3 = w822.b;
                if (m != 1) {
                  if (m != i) {
                    if (m != 3) {
                      if (m != 4) {
                        if (m == 5) {
                          l1 = 4L;
                        } else {
                          throw null;
                        } 
                      } else {
                        l1 = 3L;
                      } 
                    } else {
                      l1 = 2L;
                    } 
                  } else {
                    l1 = 1L;
                  } 
                } else {
                  l1 = 0L;
                } 
                qv.z0(paramByteArrayOutputStream, l1, 4);
                qv.z0(paramByteArrayOutputStream, l, 4);
                if (w822.c) {
                  l1 = arrayOfByte3.length;
                  arrayOfByte1 = qv.m(arrayOfByte3);
                  arrayList1.add(arrayOfByte1);
                  qv.z0(paramByteArrayOutputStream, arrayOfByte1.length, 4);
                  qv.z0(paramByteArrayOutputStream, l1, 4);
                  m = arrayOfByte1.length;
                } else {
                  arrayList1.add(arrayOfByte3);
                  qv.z0(paramByteArrayOutputStream, arrayOfByte3.length, 4);
                  qv.z0(paramByteArrayOutputStream, 0L, 4);
                  m = arrayOfByte3.length;
                } 
                l += m;
              } 
              for (i = 0; i < arrayList1.size(); i++)
                paramByteArrayOutputStream.write(arrayList1.get(i)); 
              break;
            } 
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Expected size ");
            stringBuilder1.append(m);
            stringBuilder1.append(", does not match actual size ");
            stringBuilder1.append(arrayOfByte1.length);
            String str1 = stringBuilder1.toString();
            IllegalStateException illegalStateException1 = new IllegalStateException();
            this(str1);
            throw illegalStateException1;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Expected size ");
          stringBuilder.append(m);
          stringBuilder.append(", does not match actual size ");
          stringBuilder.append(byteArrayOutputStream2.length);
          str = stringBuilder.toString();
          illegalStateException = new IllegalStateException();
          this(str);
          throw illegalStateException;
        } 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Expected size ");
        stringBuilder.append(i);
        stringBuilder.append(", does not match actual size ");
        stringBuilder.append(byteArrayOutputStream2.length);
        str = stringBuilder.toString();
        illegalStateException = new IllegalStateException();
        this(str);
        throw illegalStateException;
      } 
    } else {
      byte[] arrayOfByte;
      int[] arrayOfInt;
      Iterator<Integer> iterator;
      arrayOfByte4 = zo2.f;
      if (Arrays.equals((byte[])str, arrayOfByte4)) {
        arrayOfByte = p((ny[])arrayOfByte1, arrayOfByte4);
        qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte1.length, 1);
        qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte.length, 4);
        arrayOfByte = qv.m(arrayOfByte);
        qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte.length, 4);
        illegalStateException.write(arrayOfByte);
        return true;
      } 
      if (Arrays.equals(arrayOfByte, arrayOfByte3)) {
        qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte1.length, 1);
        int i = arrayOfByte1.length;
        for (byte b = 0; b < i; b++) {
          byte b1 = arrayOfByte1[b];
          int j = b1.i.size();
          String str1 = s(b1.a, b1.b, arrayOfByte3);
          Charset charset = StandardCharsets.UTF_8;
          qv.A0((ByteArrayOutputStream)illegalStateException, (str1.getBytes(charset)).length);
          qv.A0((ByteArrayOutputStream)illegalStateException, b1.h.length);
          qv.z0((ByteArrayOutputStream)illegalStateException, (j * 4), 4);
          qv.z0((ByteArrayOutputStream)illegalStateException, b1.c, 4);
          illegalStateException.write(str1.getBytes(charset));
          iterator = b1.i.keySet().iterator();
          while (iterator.hasNext()) {
            qv.A0((ByteArrayOutputStream)illegalStateException, ((Integer)iterator.next()).intValue());
            qv.A0((ByteArrayOutputStream)illegalStateException, 0);
          } 
          arrayOfInt = b1.h;
          int k = arrayOfInt.length;
          for (j = 0; j < k; j++)
            qv.A0((ByteArrayOutputStream)illegalStateException, arrayOfInt[j]); 
        } 
      } else {
        byte[] arrayOfByte5;
        arrayOfByte3 = zo2.g;
        if (Arrays.equals((byte[])arrayOfInt, arrayOfByte3)) {
          arrayOfByte5 = p((ny[])arrayOfByte1, arrayOfByte3);
          qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte1.length, 1);
          qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte5.length, 4);
          arrayOfByte5 = qv.m(arrayOfByte5);
          qv.z0((ByteArrayOutputStream)illegalStateException, arrayOfByte5.length, 4);
          illegalStateException.write(arrayOfByte5);
          return true;
        } 
        if (Arrays.equals(arrayOfByte5, (byte[])iterator)) {
          qv.A0((ByteArrayOutputStream)illegalStateException, arrayOfByte1.length);
          int i = arrayOfByte1.length;
          for (byte b = 0; b < i; b++) {
            byte b1 = arrayOfByte1[b];
            String str1 = b1.a;
            TreeMap treeMap = b1.i;
            str1 = s(str1, b1.b, (byte[])iterator);
            Charset charset = StandardCharsets.UTF_8;
            qv.A0((ByteArrayOutputStream)illegalStateException, (str1.getBytes(charset)).length);
            qv.A0((ByteArrayOutputStream)illegalStateException, treeMap.size());
            qv.A0((ByteArrayOutputStream)illegalStateException, b1.h.length);
            qv.z0((ByteArrayOutputStream)illegalStateException, b1.c, 4);
            illegalStateException.write(str1.getBytes(charset));
            Iterator<Integer> iterator1 = treeMap.keySet().iterator();
            while (iterator1.hasNext())
              qv.A0((ByteArrayOutputStream)illegalStateException, ((Integer)iterator1.next()).intValue()); 
            int[] arrayOfInt1 = b1.h;
            int j = arrayOfInt1.length;
            for (byte b2 = 0; b2 < j; b2++)
              qv.A0((ByteArrayOutputStream)illegalStateException, arrayOfInt1[b2]); 
          } 
          return true;
        } 
        return false;
      } 
    } 
    return true;
  }
  
  public static final Object k0(Object paramObject) {
    qh0 qh0;
    if (paramObject instanceof rh0) {
      qh0 = (qh0)paramObject;
    } else {
      qh0 = null;
    } 
    if (qh0 != null) {
      qh0 = ((rh0)qh0).a;
      if (qh0 != null)
        return qh0; 
    } 
    return paramObject;
  }
  
  public static int l(int paramInt) {
    return (paramInt < 0) ? 0 : ((paramInt > 255) ? 255 : paramInt);
  }
  
  public static ActionMode.Callback l0(ActionMode.Callback paramCallback) {
    ActionMode.Callback callback = paramCallback;
    if (paramCallback instanceof gu1) {
      callback = paramCallback;
      if (Build.VERSION.SDK_INT >= 26)
        callback = ((gu1)paramCallback).a; 
    } 
    return callback;
  }
  
  public static final Object m0(os paramos, Object paramObject) {
    Object object = paramObject;
    if (paramObject == null)
      object = g0(paramos); 
    if (object == Integer.valueOf(0))
      return o; 
    if (object instanceof Integer)
      return paramos.h(new pu1(((Number)object).intValue(), paramos), r); 
    paramos = (lu1)object;
    paramObject = ((lu1)paramos).c;
    object = paramObject.get();
    paramObject.set(((lu1)paramos).b);
    return object;
  }
  
  public static final Object n(ad0 paramad0, cs paramcs) {
    paramcs = new gj1(paramcs, paramcs.e());
    return m92.U((gj1)paramcs, (gj1)paramcs, paramad0);
  }
  
  public static void n0(hu paramhu, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= paramInt2 && paramInt1 <= paramInt3)
      return; 
    throw new eh0(paramhu.q(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
  }
  
  public static final Bitmap o(ArrayList<Bitmap> paramArrayList, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
    Bitmap bitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    if (!paramArrayList.isEmpty()) {
      List<Rect> list;
      List<RectF> list1;
      Canvas canvas = new Canvas(bitmap);
      Paint paint = new Paint();
      paint.setAntiAlias(true);
      paint.setFilterBitmap(true);
      paint.setColor(-1);
      float f6 = paramInt1;
      float f4 = f6 / 2.0F;
      float f3 = paramInt2;
      float f5 = f3 / 2.0F;
      float f2 = paramFloat1 / 2.0F;
      paramInt2 = paramArrayList.size();
      paramInt1 = paramInt2;
      if (paramInt2 > 4)
        paramInt1 = 4; 
      paramInt2 = 0;
      if (paramInt1 != 1) {
        if (paramInt1 != 2) {
          if (paramInt1 != 3) {
            float f7 = f4 - f2;
            float f8 = f5 - f2;
            RectF rectF1 = new RectF(paramFloat1, paramFloat1, f7, f8);
            f4 += f2;
            f6 -= paramFloat1;
            RectF rectF3 = new RectF(f4, paramFloat1, f6, f8);
            f2 = f5 + f2;
            f3 -= paramFloat1;
            RectF rectF2 = new RectF(paramFloat1, f2, f7, f3);
            RectF rectF4 = new RectF(f4, f2, f6, f3);
            list = om.h0((Object[])new Rect[] { f0(paramArrayList.get(0), rectF1), f0(paramArrayList.get(1), rectF3), f0(paramArrayList.get(2), rectF2), f0(paramArrayList.get(3), rectF4) });
            list1 = om.h0((Object[])new RectF[] { rectF1, rectF3, rectF2, rectF4 });
          } else {
            float f = f6 - paramFloat1;
            RectF rectF3 = new RectF(paramFloat1, paramFloat1, f, f5 - f2);
            f5 += f2;
            f3 -= paramFloat1;
            RectF rectF1 = new RectF(paramFloat1, f5, f4 - f2, f3);
            RectF rectF2 = new RectF(f4 + f2, f5, f, f3);
            Rect rect1 = f0(paramArrayList.get(0), rectF3);
            Rect rect3 = f0(paramArrayList.get(1), rectF1);
            Rect rect2 = f0(paramArrayList.get(2), rectF2);
            list1 = om.h0((Object[])new RectF[] { rectF3, rectF1, rectF2 });
            list = om.h0((Object[])new Rect[] { rect1, rect3, rect2 });
          } 
        } else {
          f3 -= paramFloat1;
          RectF rectF2 = new RectF(paramFloat1, paramFloat1, f4 - f2, f3);
          RectF rectF1 = new RectF(f4 + f2, paramFloat1, f6 - paramFloat1, f3);
          list = om.h0((Object[])new Rect[] { f0(paramArrayList.get(0), rectF2), f0(paramArrayList.get(1), rectF1) });
          list1 = om.h0((Object[])new RectF[] { rectF2, rectF1 });
        } 
      } else {
        RectF rectF = new RectF(paramFloat1, paramFloat1, f6 - paramFloat1, f3 - paramFloat1);
        list = zo2.E(f0(paramArrayList.get(0), rectF));
        list1 = zo2.E(rectF);
      } 
      Iterator<RectF> iterator = list1.iterator();
      while (iterator.hasNext())
        canvas.drawRoundRect(iterator.next(), paramFloat2, paramFloat2, paint); 
      paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      int i = list1.size();
      for (paramInt1 = paramInt2; paramInt1 < i; paramInt1++)
        canvas.drawBitmap(paramArrayList.get(paramInt1), list.get(paramInt1), list1.get(paramInt1), paint); 
    } 
    return bitmap;
  }
  
  public static void o0(iu paramiu, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= paramInt2 && paramInt1 <= paramInt3)
      return; 
    throw new eh0(paramiu, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
  }
  
  public static byte[] p(ny[] paramArrayOfny, byte[] paramArrayOfbyte) {
    int n = paramArrayOfny.length;
    int k = 0;
    int m = 0;
    int j = 0;
    int i = 0;
    while (j < n) {
      ny ny1 = paramArrayOfny[j];
      int i1 = (s(ny1.a, ny1.b, paramArrayOfbyte).getBytes(StandardCharsets.UTF_8)).length;
      int i2 = ny1.e;
      int i3 = ny1.f;
      i += (ny1.g * 2 + 7 & 0xFFFFFFF8) / 8 + i2 * 2 + i1 + 16 + i3;
      j++;
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
    if (Arrays.equals(paramArrayOfbyte, zo2.g)) {
      k = paramArrayOfny.length;
      for (j = m; j < k; j++) {
        ny ny1 = paramArrayOfny[j];
        s0(byteArrayOutputStream, ny1, s(ny1.a, ny1.b, paramArrayOfbyte));
        r0(byteArrayOutputStream, ny1);
      } 
    } else {
      m = paramArrayOfny.length;
      for (j = 0; j < m; j++) {
        ny ny1 = paramArrayOfny[j];
        s0(byteArrayOutputStream, ny1, s(ny1.a, ny1.b, paramArrayOfbyte));
      } 
      m = paramArrayOfny.length;
      for (j = k; j < m; j++)
        r0(byteArrayOutputStream, paramArrayOfny[j]); 
    } 
    if (byteArrayOutputStream.size() == i)
      return byteArrayOutputStream.toByteArray(); 
    j = byteArrayOutputStream.size();
    StringBuilder stringBuilder = new StringBuilder("The bytes saved do not match expectation. actual=");
    stringBuilder.append(j);
    stringBuilder.append(" expected=");
    stringBuilder.append(i);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static ActionMode.Callback p0(ActionMode.Callback paramCallback, TextView paramTextView) {
    int i = Build.VERSION.SDK_INT;
    return (i < 26 || i > 27 || paramCallback instanceof gu1 || paramCallback == null) ? paramCallback : new gu1(paramCallback, paramTextView);
  }
  
  public static final void q(xs paramxs) {
    g92.y(paramxs.g());
  }
  
  public static int q0(int paramInt1, int paramInt2) {
    return (paramInt1 < 0) ? 0 : ((paramInt1 >= paramInt2) ? (paramInt2 - 1) : paramInt1);
  }
  
  public static q5 r(vc1 paramvc1) {
    s51 s51;
    if (paramvc1.size() < 22L) {
      paramvc1 = null;
    } else {
      s51 s511 = dd1.t(paramvc1, 0);
      if (s511 != null) {
        s51 = s511;
      } else {
        s51 = dd1.t((vc1)s51, 65535);
      } 
    } 
    if (s51 != null) {
      ByteBuffer byteBuffer = (ByteBuffer)s51.a;
      long l1 = ((Long)s51.b).longValue();
      byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      dd1.c(byteBuffer);
      long l2 = byteBuffer.getInt(byteBuffer.position() + 16) & 0xFFFFFFFFL;
      if (l2 <= l1) {
        dd1.c(byteBuffer);
        long l = byteBuffer.getInt(byteBuffer.position() + 12) & 0xFFFFFFFFL;
        if (l2 + l <= l1) {
          dd1.c(byteBuffer);
          byteBuffer.getShort(byteBuffer.position() + 10);
          return new q5(l2, l, l1, byteBuffer);
        } 
        throw new Exception();
      } 
      throw new Exception();
    } 
    throw new Exception();
  }
  
  public static void r0(ByteArrayOutputStream paramByteArrayOutputStream, ny paramny) {
    u0(paramByteArrayOutputStream, paramny);
    int k = paramny.g;
    int[] arrayOfInt = paramny.h;
    int m = arrayOfInt.length;
    int i = 0;
    int j;
    for (j = 0; i < m; j = n) {
      int n = arrayOfInt[i];
      qv.A0(paramByteArrayOutputStream, n - j);
      i++;
    } 
    byte[] arrayOfByte = new byte[(k * 2 + 7 & 0xFFFFFFF8) / 8];
    for (Map.Entry entry : paramny.i.entrySet()) {
      i = ((Integer)entry.getKey()).intValue();
      int n = ((Integer)entry.getValue()).intValue();
      if ((n & 0x2) != 0) {
        j = i / 8;
        arrayOfByte[j] = (byte)(arrayOfByte[j] | 1 << i % 8);
      } 
      if ((n & 0x4) != 0) {
        i += k;
        j = i / 8;
        arrayOfByte[j] = (byte)(1 << i % 8 | arrayOfByte[j]);
      } 
    } 
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static String s(String paramString1, String paramString2, byte[] paramArrayOfbyte) {
    String str1;
    byte[] arrayOfByte1 = zo2.h;
    byte[] arrayOfByte2 = zo2.i;
    boolean bool = Arrays.equals(paramArrayOfbyte, arrayOfByte2);
    String str2 = "!";
    if (bool || Arrays.equals(paramArrayOfbyte, arrayOfByte1)) {
      str1 = ":";
    } else {
      str1 = "!";
    } 
    if (paramString1.length() <= 0) {
      if ("!".equals(str1))
        return paramString2.replace(":", "!"); 
      if (":".equals(str1))
        return paramString2.replace("!", ":"); 
    } else {
      if (paramString2.equals("classes.dex"))
        return paramString1; 
      if (paramString2.contains("!") || paramString2.contains(":"))
        return "!".equals(str1) ? paramString2.replace(":", "!") : (":".equals(str1) ? paramString2.replace("!", ":") : paramString2); 
      if (paramString2.endsWith(".apk"))
        return paramString2; 
      StringBuilder stringBuilder = x41.p(paramString1);
      if (Arrays.equals(paramArrayOfbyte, arrayOfByte2)) {
        paramString1 = ":";
        return x41.n(stringBuilder, paramString1, paramString2);
      } 
      paramString1 = str2;
      if (Arrays.equals(paramArrayOfbyte, arrayOfByte1)) {
        paramString1 = ":";
        return x41.n(stringBuilder, paramString1, paramString2);
      } 
      return x41.n(stringBuilder, paramString1, paramString2);
    } 
    return paramString2;
  }
  
  public static void s0(ByteArrayOutputStream paramByteArrayOutputStream, ny paramny, String paramString) {
    Charset charset = StandardCharsets.UTF_8;
    qv.A0(paramByteArrayOutputStream, (paramString.getBytes(charset)).length);
    qv.A0(paramByteArrayOutputStream, paramny.e);
    qv.z0(paramByteArrayOutputStream, paramny.f, 4);
    qv.z0(paramByteArrayOutputStream, paramny.c, 4);
    qv.z0(paramByteArrayOutputStream, paramny.g, 4);
    paramByteArrayOutputStream.write(paramString.getBytes(charset));
  }
  
  public static ColorStateList t(Context paramContext, zv0 paramzv0, int paramInt) {
    TypedArray typedArray = (TypedArray)paramzv0.e;
    if (typedArray.hasValue(paramInt)) {
      int i = typedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = n21.y(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return paramzv0.n(paramInt);
  }
  
  public static void t0(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt, ny paramny) {
    int i = paramny.g;
    byte[] arrayOfByte = new byte[(Integer.bitCount(paramInt & 0xFFFFFFFE) * i + 7 & 0xFFFFFFF8) / 8];
    for (Map.Entry entry : paramny.i.entrySet()) {
      int k = ((Integer)entry.getKey()).intValue();
      int m = ((Integer)entry.getValue()).intValue();
      byte b = 0;
      for (int j = 1; j <= 4; j <<= 1) {
        if (j != 1 && (j & paramInt) != 0) {
          if ((j & m) == j) {
            int i1 = b * i + k;
            int n = i1 / 8;
            arrayOfByte[n] = (byte)(1 << i1 % 8 | arrayOfByte[n]);
          } 
          b++;
        } 
      } 
    } 
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static ColorStateList u(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = n21.y(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return paramTypedArray.getColorStateList(paramInt);
  }
  
  public static void u0(ByteArrayOutputStream paramByteArrayOutputStream, ny paramny) {
    Iterator<Map.Entry> iterator = paramny.i.entrySet().iterator();
    for (int i = 0; iterator.hasNext(); i = j) {
      Map.Entry entry = iterator.next();
      int j = ((Integer)entry.getKey()).intValue();
      if ((((Integer)entry.getValue()).intValue() & 0x1) == 0)
        continue; 
      qv.A0(paramByteArrayOutputStream, j - i);
      qv.A0(paramByteArrayOutputStream, 0);
    } 
  }
  
  public static String v(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString) {
    try {
      Cursor cursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, paramString, paramArrayOfString, null);
    } finally {
      paramUri = null;
      paramContext = null;
    } 
    return null;
  }
  
  public static ClassLoader v0() {
    // Byte code:
    //   0: ldc wf2
    //   2: monitorenter
    //   3: getstatic wf2.b : Ljava/lang/ClassLoader;
    //   6: ifnonnull -> 478
    //   9: getstatic wf2.c : Ljava/lang/Thread;
    //   12: astore #4
    //   14: aconst_null
    //   15: astore #8
    //   17: aconst_null
    //   18: astore #7
    //   20: aload #4
    //   22: astore #5
    //   24: aload #4
    //   26: ifnonnull -> 377
    //   29: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   32: invokevirtual getThread : ()Ljava/lang/Thread;
    //   35: invokevirtual getThreadGroup : ()Ljava/lang/ThreadGroup;
    //   38: astore #5
    //   40: aload #5
    //   42: ifnonnull -> 51
    //   45: aconst_null
    //   46: astore #4
    //   48: goto -> 344
    //   51: ldc_w java/lang/Void
    //   54: monitorenter
    //   55: aload #5
    //   57: invokevirtual activeGroupCount : ()I
    //   60: istore_2
    //   61: iload_2
    //   62: anewarray java/lang/ThreadGroup
    //   65: astore #6
    //   67: aload #5
    //   69: aload #6
    //   71: invokevirtual enumerate : ([Ljava/lang/ThreadGroup;)I
    //   74: pop
    //   75: iconst_0
    //   76: istore_1
    //   77: iconst_0
    //   78: istore_0
    //   79: iload_0
    //   80: iload_2
    //   81: if_icmpge -> 123
    //   84: aload #6
    //   86: iload_0
    //   87: aaload
    //   88: astore #4
    //   90: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.zXojXbuu : Ljava/lang/String;
    //   93: aload #4
    //   95: invokevirtual getName : ()Ljava/lang/String;
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 107
    //   104: goto -> 126
    //   107: iinc #0, 1
    //   110: goto -> 79
    //   113: astore #4
    //   115: goto -> 370
    //   118: astore #5
    //   120: goto -> 270
    //   123: aconst_null
    //   124: astore #4
    //   126: aload #4
    //   128: astore #6
    //   130: aload #4
    //   132: ifnonnull -> 150
    //   135: new java/lang/ThreadGroup
    //   138: astore #6
    //   140: aload #6
    //   142: aload #5
    //   144: ldc_w 'dynamiteLoader'
    //   147: invokespecial <init> : (Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   150: aload #6
    //   152: invokevirtual activeCount : ()I
    //   155: istore_2
    //   156: iload_2
    //   157: anewarray java/lang/Thread
    //   160: astore #5
    //   162: aload #6
    //   164: aload #5
    //   166: invokevirtual enumerate : ([Ljava/lang/Thread;)I
    //   169: pop
    //   170: iload_1
    //   171: istore_0
    //   172: iload_0
    //   173: iload_2
    //   174: if_icmpge -> 208
    //   177: aload #5
    //   179: iload_0
    //   180: aaload
    //   181: astore #4
    //   183: ldc_w 'GmsDynamite'
    //   186: aload #4
    //   188: invokevirtual getName : ()Ljava/lang/String;
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: istore_3
    //   195: iload_3
    //   196: ifeq -> 202
    //   199: goto -> 211
    //   202: iinc #0, 1
    //   205: goto -> 172
    //   208: aconst_null
    //   209: astore #4
    //   211: aload #4
    //   213: astore #5
    //   215: aload #4
    //   217: ifnonnull -> 336
    //   220: new bc2
    //   223: astore #5
    //   225: aload #5
    //   227: aload #6
    //   229: ldc_w 'GmsDynamite'
    //   232: invokespecial <init> : (Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   235: aload #5
    //   237: aconst_null
    //   238: invokevirtual setContextClassLoader : (Ljava/lang/ClassLoader;)V
    //   241: aload #5
    //   243: invokevirtual start : ()V
    //   246: goto -> 336
    //   249: astore #6
    //   251: aload #5
    //   253: astore #4
    //   255: aload #6
    //   257: astore #5
    //   259: goto -> 273
    //   262: goto -> 273
    //   265: astore #5
    //   267: goto -> 262
    //   270: aconst_null
    //   271: astore #4
    //   273: aload #5
    //   275: invokevirtual getMessage : ()Ljava/lang/String;
    //   278: astore #6
    //   280: aload #6
    //   282: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   285: invokevirtual length : ()I
    //   288: istore_0
    //   289: new java/lang/StringBuilder
    //   292: astore #5
    //   294: aload #5
    //   296: iload_0
    //   297: bipush #39
    //   299: iadd
    //   300: invokespecial <init> : (I)V
    //   303: aload #5
    //   305: ldc_w 'Failed to enumerate thread/threadgroup '
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload #5
    //   314: aload #6
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: pop
    //   320: ldc_w 'DynamiteLoaderV2CL'
    //   323: aload #5
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   331: pop
    //   332: aload #4
    //   334: astore #5
    //   336: ldc_w java/lang/Void
    //   339: monitorexit
    //   340: aload #5
    //   342: astore #4
    //   344: aload #4
    //   346: putstatic wf2.c : Ljava/lang/Thread;
    //   349: aload #4
    //   351: astore #5
    //   353: aload #4
    //   355: ifnonnull -> 377
    //   358: aload #8
    //   360: astore #4
    //   362: goto -> 464
    //   365: astore #4
    //   367: goto -> 489
    //   370: ldc_w java/lang/Void
    //   373: monitorexit
    //   374: aload #4
    //   376: athrow
    //   377: aload #5
    //   379: monitorenter
    //   380: getstatic wf2.c : Ljava/lang/Thread;
    //   383: invokevirtual getContextClassLoader : ()Ljava/lang/ClassLoader;
    //   386: astore #4
    //   388: goto -> 461
    //   391: astore #4
    //   393: goto -> 472
    //   396: astore #4
    //   398: aload #4
    //   400: invokevirtual getMessage : ()Ljava/lang/String;
    //   403: astore #4
    //   405: aload #4
    //   407: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   410: invokevirtual length : ()I
    //   413: istore_0
    //   414: new java/lang/StringBuilder
    //   417: astore #6
    //   419: aload #6
    //   421: iload_0
    //   422: bipush #41
    //   424: iadd
    //   425: invokespecial <init> : (I)V
    //   428: aload #6
    //   430: ldc_w 'Failed to get thread context classloader '
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload #6
    //   439: aload #4
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: pop
    //   445: ldc_w 'DynamiteLoaderV2CL'
    //   448: aload #6
    //   450: invokevirtual toString : ()Ljava/lang/String;
    //   453: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   456: pop
    //   457: aload #7
    //   459: astore #4
    //   461: aload #5
    //   463: monitorexit
    //   464: aload #4
    //   466: putstatic wf2.b : Ljava/lang/ClassLoader;
    //   469: goto -> 478
    //   472: aload #5
    //   474: monitorexit
    //   475: aload #4
    //   477: athrow
    //   478: getstatic wf2.b : Ljava/lang/ClassLoader;
    //   481: astore #4
    //   483: ldc wf2
    //   485: monitorexit
    //   486: aload #4
    //   488: areturn
    //   489: ldc wf2
    //   491: monitorexit
    //   492: aload #4
    //   494: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	365	finally
    //   29	40	365	finally
    //   51	55	365	finally
    //   55	75	118	java/lang/SecurityException
    //   55	75	113	finally
    //   90	104	118	java/lang/SecurityException
    //   90	104	113	finally
    //   135	150	118	java/lang/SecurityException
    //   135	150	113	finally
    //   150	170	118	java/lang/SecurityException
    //   150	170	113	finally
    //   183	195	118	java/lang/SecurityException
    //   183	195	113	finally
    //   220	235	265	java/lang/SecurityException
    //   220	235	113	finally
    //   235	246	249	java/lang/SecurityException
    //   235	246	113	finally
    //   273	332	113	finally
    //   336	340	113	finally
    //   344	349	365	finally
    //   370	374	113	finally
    //   374	377	365	finally
    //   377	380	365	finally
    //   380	388	396	java/lang/SecurityException
    //   380	388	391	finally
    //   398	457	391	finally
    //   461	464	391	finally
    //   464	469	365	finally
    //   472	475	391	finally
    //   475	478	365	finally
    //   478	483	365	finally
    //   489	492	365	finally
  }
  
  public static int w(Context paramContext, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    TypedValue typedValue = new TypedValue();
    if (!paramTypedArray.getValue(paramInt1, typedValue) || typedValue.type != 2)
      return paramTypedArray.getDimensionPixelSize(paramInt1, paramInt2); 
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
    paramInt1 = typedArray.getDimensionPixelSize(0, paramInt2);
    typedArray.recycle();
    return paramInt1;
  }
  
  public static float x(EdgeEffect paramEdgeEffect) {
    return (Build.VERSION.SDK_INT >= 31) ? y20.b(paramEdgeEffect) : 0.0F;
  }
  
  public static Drawable y(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        Drawable drawable = ws2.I(paramContext, i);
        if (drawable != null)
          return drawable; 
      } 
    } 
    return paramTypedArray.getDrawable(paramInt);
  }
  
  public static void y0(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt1 >= paramInt2) {
      String str = FgdLmmRfTxSFKI.qDKjbNkNemsFmP;
      if (paramInt1 >= 0) {
        if (paramInt2 < 0) {
          ck2.b(String.valueOf(paramInt2).length() + 15, paramInt2, "negative size: ");
          return;
        } 
        str = zo2.V("%s (%s) must be less than size (%s)", new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        str = zo2.V("%s (%s) must not be negative", new Object[] { str, Integer.valueOf(paramInt1) });
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static final Class z(ll paramll) {
    paramll.getClass();
    Class<Short> clazz1 = paramll.a();
    if (!clazz1.isPrimitive())
      return clazz1; 
    String str = clazz1.getName();
    switch (str.hashCode()) {
      default:
        return clazz1;
      case 109413500:
        if (str.equals("short"))
          clazz1 = Short.class; 
      case 97526364:
        if (str.equals("float"))
          Class<Float> clazz2 = Float.class; 
      case 64711720:
        if (str.equals("boolean"))
          Class<Boolean> clazz2 = Boolean.class; 
      case 3625364:
        if (str.equals("void"))
          Class<Void> clazz2 = Void.class; 
      case 3327612:
        if (str.equals("long"))
          Class<Long> clazz2 = Long.class; 
      case 3052374:
        if (str.equals("char"))
          Class<Character> clazz2 = Character.class; 
      case 3039496:
        if (str.equals("byte"))
          Class<Byte> clazz2 = Byte.class; 
      case 104431:
        if (str.equals("int"))
          Class<Integer> clazz2 = Integer.class; 
      case -1325958191:
        break;
    } 
    if (!str.equals("double"));
    Class<Double> clazz = Double.class;
  }
  
  public static void z0(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt1 >= paramInt2) {
      String str;
      if (paramInt1 >= 0) {
        if (paramInt2 < 0) {
          ck2.b(String.valueOf(paramInt2).length() + 15, paramInt2, "negative size: ");
          return;
        } 
        str = ws2.u0("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        str = ws2.u0("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public abstract void B0(ji2 paramji21, ji2 paramji22);
  
  public abstract void D0(ji2 paramji2, Thread paramThread);
  
  public abstract boolean H();
  
  public abstract boolean H0(kj2 paramkj2, fi2 paramfi21, fi2 paramfi22);
  
  public abstract boolean J0(li2 paramli2, Object paramObject1, Object paramObject2);
  
  public abstract boolean K0(li2 paramli2, ji2 paramji21, ji2 paramji22);
  
  public void a0(boolean paramBoolean) {}
  
  public abstract void b0(boolean paramBoolean);
  
  public abstract fi2 w0(kj2 paramkj2);
  
  public abstract ji2 x0(kj2 paramkj2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */