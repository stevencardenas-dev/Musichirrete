import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MostPlayedActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SearchActivity;
import in.krosbits.musicolet.SettingsActivity;
import in.krosbits.musicolet.Tag2Activity;
import in.krosbits.musicolet.WelcomeActivity;
import in.krosbits.utils.SgV.zpEN;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.UnknownFileFormatException;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.id3.AbstractID3Tag;

public abstract class m92 {
  public static p92 a;
  
  public static final f1 b = new f1("RESUME_TOKEN", 4);
  
  public static final Byte[] c = new Byte[] { Byte.valueOf((byte)-17), Byte.valueOf((byte)-69), Byte.valueOf((byte)-65) };
  
  public static final Byte[] d;
  
  public static final Byte[] e;
  
  public static int f = 0;
  
  public static int g = 0;
  
  public static final int[] h = new int[14];
  
  public static int i = -1;
  
  public static int j = -1;
  
  public static int k;
  
  public static int l;
  
  public static final int[] m = new int[] { 
      0, 27, 1, 25, 2, 26, 3, 14, 15, 16, 
      17, 11, 4, 37, 31, 32, 34, 33, 35, 36, 
      24, 8, 13, 9 };
  
  public static Boolean n = null;
  
  public static final u70[] o = new u70[] { new u70("usage_and_diagnostics_listener", -1, 1L, true), new u70(zpEN.SoPzJtcimZgcYYZ, -1, 1L, true), new u70("usage_and_diagnostics_check_consents", -1, 1L, true), new u70("usage_and_diagnostics_settings_access", -1, 1L, true), new u70("el_capitan", -1, 1L, false), new u70("stats", -1, 1L, true) };
  
  public static String A(Tag paramTag) {
    try {
      String str2 = paramTag.getFirst(FieldKey.UNSYNC_LYRICS);
      boolean bool = TextUtils.isEmpty(str2);
      String str1 = str2;
      if (bool)
        try {
        
        } finally {
          paramTag = null;
        }  
      if (str1 != null && str1.length() > 0) {
        bool = str1.equals("<unknown>");
        if (!bool)
          return str1; 
      } 
    } finally {}
    return null;
  }
  
  public static FileLock B(FileChannel paramFileChannel, String paramString) {
    Logger logger = AbstractID3Tag.logger;
    StringBuilder stringBuilder = new StringBuilder("locking fileChannel for ");
    stringBuilder.append(paramString);
    logger.finest(stringBuilder.toString());
    try {
      FileLock fileLock = paramFileChannel.tryLock();
      if (fileLock != null)
        return fileLock; 
      m60.i(MessageFormat.format("Cannot make changes to file {0} because it is being used by another application", new Object[] { paramString }));
    } catch (IOException|Error iOException) {}
    return null;
  }
  
  public static Tag C(km0 paramkm0) {
    if (paramkm0 != null) {
      v00 v00 = paramkm0.d();
      if (v00 != null)
        try {
          AudioFile audioFile = AudioFileIO.readMagic(v00);
        } catch (UnknownFileFormatException|org.jaudiotagger.tag.TagException|org.jaudiotagger.audio.exceptions.InvalidAudioFrameException unknownFileFormatException) {
          try {
            AudioFile audioFile = AudioFileIO.read(v00);
          } finally {
            unknownFileFormatException = null;
            unknownFileFormatException.printStackTrace();
          } 
        } finally {
          paramkm0 = null;
        }  
    } 
    return null;
  }
  
  public static v00 D(km0 paramkm0) {
    v00 v002 = paramkm0.d();
    v00 v001 = (v00)v002.i();
    if (v001 != null) {
      String str2 = v002.h();
      String str1 = ag0.J(str2);
      if (v001 instanceof lw0)
        ((lw0)v001).m = 0; 
      StringBuilder stringBuilder3 = new StringBuilder();
      stringBuilder3.append(str1);
      stringBuilder3.append(".lrc");
      v00 v004 = v001.A(stringBuilder3.toString());
      if (v004.l())
        return v004; 
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str2);
      stringBuilder2.append(".lrc");
      v00 v003 = v001.A(stringBuilder2.toString());
      if (v003.l())
        return v003; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(".txt");
      v001 = v001.A(stringBuilder1.toString());
      if (v001.l())
        return v001; 
    } 
    return null;
  }
  
  public static String E(String paramString1, String paramString2, String paramString3, String paramString4) {
    paramString2 = ag0.r0(paramString2.trim(), false);
    String str = "";
    if (paramString2 == null || paramString2.equals("<unknown>"))
      paramString2 = ""; 
    paramString2 = paramString1.replaceAll(JkpGFvCVQHzgc.eGts, paramString2);
    paramString1 = ag0.r0(paramString3.trim(), false);
    if (paramString1 == null || paramString1.equals("<unknown>"))
      paramString1 = ""; 
    paramString3 = paramString2.replaceAll("(?i)<al>", paramString1);
    paramString2 = ag0.r0(paramString4.trim(), false);
    paramString1 = str;
    if (paramString2 != null) {
      paramString1 = str;
      if (!paramString2.equals("<unknown>"))
        paramString1 = paramString2; 
    } 
    return paramString3.replaceAll("(?i)<ar>", paramString1);
  }
  
  public static ArrayList F(u51 paramu51) {
    ArrayList<u51> arrayList = new ArrayList();
    try {
      Object object1 = paramu51.a;
      Object object2 = paramu51.b;
      arrayList2 = (ArrayList)object1;
      arrayList1 = (ArrayList)object2;
      Pattern.compile("(\\s)+");
      l = 0L;
      for (byte b1 = 0; b1 < ((ArrayList)object1).size(); b1++) {
        km0 km0 = ((ArrayList<km0>)object1).get(b1);
        l += ((Integer)((ArrayList<Integer>)object2).get(b1)).intValue();
      } 
    } finally {}
    Pattern pattern = lm0.r();
    zi zi = new zi();
    super();
    long l;
    ArrayList<Integer> arrayList1;
    ArrayList<km0> arrayList2;
    int i = arrayList2.size();
    byte b = 0;
    while (true) {
      boolean bool = true;
      if (b < i) {
        km0 km0 = arrayList2.get(b);
        int j = ((Integer)arrayList1.get(b)).intValue();
        String str = km0.c.e;
        Calendar calendar = lm0.M;
        ArrayList<String> arrayList3 = new ArrayList();
        this();
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str);
          if (arrayOfString.length > 0) {
            int m = arrayOfString.length;
            for (byte b2 = 0; b2 < m; b2++) {
              str = arrayOfString[b2];
              if (str != null) {
                str = str.trim();
                if (!str.isEmpty())
                  arrayList3.add(str); 
              } 
            } 
          } else {
            arrayList3.add(str);
          } 
        } else {
          arrayList3.add(str);
        } 
        int k = arrayList3.size();
        for (byte b1 = 0; b1 < k; b1++) {
          str = arrayList3.get(b1);
          Object[] arrayOfObject = (Object[])zi.get(str);
          if (arrayOfObject == null) {
            arrayOfObject = new Object[] { str, Double.valueOf(0.0D) };
            zi.a(str, arrayOfObject);
          } 
          double d = ((Double)arrayOfObject[bool]).doubleValue();
          arrayOfObject[bool] = Double.valueOf(1.0D * j / arrayList3.size() + d);
        } 
        b++;
        continue;
      } 
      Iterator<String> iterator = zi.keySet().iterator();
      while (iterator.hasNext()) {
        Object[] arrayOfObject = (Object[])zi.get(iterator.next());
        if (arrayOfObject != null) {
          paramu51 = new u51();
          this(arrayOfObject[0], Double.valueOf(((Double)arrayOfObject[1]).doubleValue() * 100.0D / l));
          arrayList.add(paramu51);
        } 
      } 
      w00 w00 = new w00();
      this(5);
      Collections.sort(arrayList, w00);
      return arrayList;
    } 
  }
  
  public static final void G(os paramos, Throwable paramThrowable) {
    try {
      q4 q4 = (q4)paramos.l(vs2.e);
      if (q4 != null) {
        q4.m(paramThrowable);
        return;
      } 
    } finally {
      Exception exception;
    } 
    g92.K(paramos, paramThrowable);
  }
  
  public static int H(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 4) {
          if (paramInt != 8) {
            if (paramInt != 16) {
              if (paramInt != 32) {
                if (paramInt != 64) {
                  if (paramInt != 128) {
                    if (paramInt != 256) {
                      if (paramInt == 512)
                        return 9; 
                      l0.l(ga1.i("type needs to be >= FIRST and <= LAST, type=", paramInt));
                      return 0;
                    } 
                    return 8;
                  } 
                  return 7;
                } 
                return 6;
              } 
              return 5;
            } 
            return 4;
          } 
          return 3;
        } 
        return 2;
      } 
      return 1;
    } 
    return 0;
  }
  
  public static void I(Context paramContext) {
    boolean bool;
    int j = Integer.parseInt(paramContext.getSharedPreferences("PP", 0).getString("THMR_BT", "2"));
    if (j == 3) {
      i = u();
    } else {
      i = j;
      if (j == 4)
        i = v(); 
    } 
    l = (paramContext.getResources().getConfiguration()).uiMode & 0x30;
    f = i;
    int i = paramContext.getSharedPreferences("PP", 0).getInt("k_si_acc", 0);
    if (f == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i = o(i, bool);
    i = paramContext.getResources().getColor(2131099832);
    int[] arrayOfInt = h;
    arrayOfInt[3] = i;
    paramContext.getTheme().applyStyle(i, true);
    i = f;
    if (i == 0) {
      j = 2131953014;
      g = 2131951632;
      arrayOfInt[0] = -986896;
      arrayOfInt[1] = -2039584;
      arrayOfInt[5] = -570425344;
      arrayOfInt[6] = -1996488704;
      arrayOfInt[12] = 1626403056;
      arrayOfInt[7] = 1610612736;
      arrayOfInt[8] = 771751936;
      arrayOfInt[2] = -328966;
      if (i == 0) {
        arrayOfInt[9] = -328966;
      } else {
        arrayOfInt[9] = -9079435;
      } 
      if (i == 0 && Build.VERSION.SDK_INT >= 26) {
        arrayOfInt[10] = -328966;
      } else {
        arrayOfInt[10] = -16777216;
      } 
      arrayOfInt[11] = -7434610;
      k = 2131230843;
    } else if (i == 1) {
      j = 2131953013;
      arrayOfInt[0] = -14606047;
      arrayOfInt[1] = -14606047;
      J();
    } else if (i == 2) {
      j = 2131953012;
      arrayOfInt[0] = -15198184;
      arrayOfInt[1] = -16777216;
      J();
      arrayOfInt[2] = -16777216;
      arrayOfInt[9] = -16777216;
      arrayOfInt[10] = -16777216;
      arrayOfInt[12] = 1612191768;
    } 
    TypedArray typedArray = paramContext.obtainStyledAttributes(i, new int[] { 2130968892, 2130968911 });
    i = typedArray.getColor(0, arrayOfInt[3]);
    arrayOfInt[3] = i;
    arrayOfInt[4] = i;
    i = typedArray.getColor(1, 269488144);
    arrayOfInt[13] = i;
    if (i == 269488144)
      if (jn.d(arrayOfInt[2], arrayOfInt[3]) > jn.d(arrayOfInt[5], arrayOfInt[3])) {
        arrayOfInt[13] = arrayOfInt[2];
      } else {
        arrayOfInt[13] = arrayOfInt[5];
      }  
    typedArray.recycle();
    paramContext.getTheme().applyStyle(j, true);
    paramContext.getTheme().applyStyle(2131953015, true);
  }
  
  public static void J() {
    g = 2131951631;
    int[] arrayOfInt = h;
    arrayOfInt[5] = -1;
    arrayOfInt[6] = -1291845633;
    arrayOfInt[12] = 1612783905;
    arrayOfInt[7] = 1694498815;
    arrayOfInt[8] = 788529151;
    arrayOfInt[2] = -15198184;
    arrayOfInt[9] = -15198184;
    arrayOfInt[10] = -15198184;
    arrayOfInt[11] = -7237231;
    k = 2131230842;
  }
  
  public static boolean K() {
    if (n == null) {
      boolean bool;
      if (((MyApplication.i.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30) != 32) {
        bool = true;
      } else {
        bool = false;
      } 
      n = Boolean.valueOf(bool);
    } 
    return n.booleanValue();
  }
  
  public static int L(float paramFloat, int paramInt1, int paramInt2) {
    return jn.g(jn.i(paramInt2, Math.round(Color.alpha(paramInt2) * paramFloat)), paramInt1);
  }
  
  public static String M(String paramString1, String paramString2) {
    int i = paramString1.length() - paramString2.length();
    if (i >= 0 && i <= 1) {
      i = paramString1.length();
      StringBuilder stringBuilder = new StringBuilder(paramString2.length() + i);
      for (i = 0; i < paramString1.length(); i++) {
        stringBuilder.append(paramString1.charAt(i));
        if (paramString2.length() > i)
          stringBuilder.append(paramString2.charAt(i)); 
      } 
      return stringBuilder.toString();
    } 
    l0.l("Invalid input received");
    return null;
  }
  
  public static yk0 N() {
    byte b;
    yk0 yk0;
    byte[] arrayOfByte;
    Map map = zo2.M("{\"kty\":\"RSA\",\"n\":\"sXchDaQebHnPiGvyDOAT4saGEUetSyo9MKLOoWFsueri23bOdgWp4Dy1WlUzewbgBHod5pcM9H95GQRV3JDXboIRROSBigeC5yjU1hGzHHyXss8UDprecbAYxknTcQkhslANGRUZmdTOQ5qTRsLAt6BTYuyvVRdhS8exSZEy_c4gs_7svlJJQ4H9_NxsiIoLwAEk7-Q3UXERGYw_75IDrGA84-lA_-Ct4eTlXHBIY2EaV7t7LjJaynVJCpkv4LKjTTAumiGUIuQhrNhZLuF_RJLqHpM2kgWFLU7-VTdL1VbC2tejvcI2BlMkEpk1BzBZI0KQB0GaDWFLN-aEAw3vRw\",\"e\":\"AQAB\"}");
    String str = yk0.d(map, "kty", true);
    str.getClass();
    switch (str.hashCode()) {
      default:
        b = -1;
        break;
      case 109856:
        if (str.equals("oct")) {
          b = 2;
          break;
        } 
      case 81440:
        if (str.equals("RSA")) {
          b = 1;
          break;
        } 
      case 2206:
        if (str.equals("EC")) {
          b = 0;
          break;
        } 
    } 
    switch (b) {
      default:
        throw new Exception("");
      case 2:
        yk0 = new yk0(map);
        arrayOfByte = (new zb(-1)).b(yk0.d(map, "k", true));
        ((n31)yk0).i = arrayOfByte;
        yk0.h = new SecretKeySpec(arrayOfByte, "AES");
        yk0.f(new String[] { "k" });
        return yk0;
      case 1:
        return new oh1((Map)arrayOfByte);
      case 0:
        break;
    } 
    return new p30((Map)arrayOfByte);
  }
  
  public static void O(PackageInfo paramPackageInfo, File paramFile) {
    File file = new File(paramFile, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
    try {
      DataOutputStream dataOutputStream = new DataOutputStream();
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      this(fileOutputStream);
      try {
        dataOutputStream.writeLong(paramPackageInfo.lastUpdateTime);
        return;
      } finally {
        try {
          dataOutputStream.close();
        } finally {
          dataOutputStream = null;
        } 
      } 
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public static void R(Context paramContext, String paramString, Bundle paramBundle) {
    try {
      Intent intent2 = new Intent();
      this(paramContext, MostPlayedActivity.class);
      Intent intent1 = intent2.putExtra("pfb", paramBundle).putExtra("pcs", paramString);
      if (!(paramContext instanceof Activity))
        intent1.addFlags(268435456); 
      paramContext.startActivity(intent1);
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      return;
    } 
  }
  
  public static void S(g7 paramg7, float paramFloat) {
    ih1 ih1 = (ih1)paramg7.c;
    qi qi = (qi)paramg7.e;
    boolean bool1 = qi.getUseCompatPadding();
    boolean bool2 = qi.getPreventCornerOverlap();
    if (paramFloat != ih1.e || ih1.f != bool1 || ih1.g != bool2) {
      ih1.e = paramFloat;
      ih1.f = bool1;
      ih1.g = bool2;
      ih1.b(null);
      ih1.invalidateSelf();
    } 
    if (!qi.getUseCompatPadding()) {
      paramg7.I(0, 0, 0, 0);
      return;
    } 
    ih1 = (ih1)paramg7.c;
    paramFloat = ih1.e;
    float f = ih1.a;
    int j = (int)Math.ceil(jh1.a(paramFloat, f, qi.getPreventCornerOverlap()));
    int i = (int)Math.ceil(jh1.b(paramFloat, f, qi.getPreventCornerOverlap()));
    paramg7.I(j, i, j, i);
  }
  
  public static void T(ms0 paramms0) {
    Context context = paramms0.b;
    if (f == 0) {
      paramms0.A0 = 1;
    } else {
      paramms0.A0 = 2;
    } 
    int[] arrayOfInt = h;
    int i = arrayOfInt[3];
    paramms0.v = i;
    paramms0.y0 = true;
    paramms0.y = dd1.w(context, i);
    paramms0.w0 = true;
    paramms0.x = dd1.w(context, arrayOfInt[3]);
    paramms0.x0 = true;
    paramms0.w = dd1.w(context, arrayOfInt[3]);
    paramms0.v0 = true;
    paramms0.z = dd1.w(context, arrayOfInt[3]);
  }
  
  public static final Object U(gj1 paramgj11, gj1 paramgj12, ad0 paramad0) {
    ys ys1;
    Object object;
    ys ys2;
    try {
      qz1.d(2, paramad0);
      object = paramad0.g(paramgj12, paramgj11);
    } finally {
      paramgj12 = null;
    } 
    if (object == ys2) {
      ys1 = ys2;
    } else {
      Object object1 = ys1.R(object);
      if (object1 == wf2.g) {
        object1 = ys2;
      } else {
        if (!(object1 instanceof bo))
          return wf2.k0(object1); 
        throw ((bo)object1).a;
      } 
    } 
    return ys1;
  }
  
  public static final void V(String paramString, int paramInt) {
    StringBuilder stringBuilder2 = new StringBuilder();
    StringBuilder stringBuilder1 = new StringBuilder("Error code: ");
    stringBuilder1.append(paramInt);
    stringBuilder2.append(stringBuilder1.toString());
    stringBuilder2.append(", message: ".concat(paramString));
    throw new SQLException(stringBuilder2.toString());
  }
  
  public static byte[] W(BigInteger paramBigInteger) {
    if (paramBigInteger.signum() >= 0) {
      byte[] arrayOfByte = paramBigInteger.toByteArray();
      return (paramBigInteger.bitLength() % 8 == 0 && arrayOfByte[0] == 0 && arrayOfByte.length > 1) ? qz1.Q(arrayOfByte, 1, arrayOfByte.length - 1) : arrayOfByte;
    } 
    l0.k();
    return null;
  }
  
  public static final long X(long paramLong, j20 paramj20) {
    hp2 hp2;
    TimeUnit timeUnit2 = paramj20.b;
    TimeUnit timeUnit1 = TimeUnit.NANOSECONDS;
    long l = timeUnit2.convert(4611686018426999999L, timeUnit1);
    if (-l <= paramLong && paramLong <= l) {
      paramLong = timeUnit1.convert(paramLong, timeUnit2);
      hp2 = f20.b;
      int i = i20.a;
      return paramLong << 1L;
    } 
    if (hp2.compareTo(j20.e) >= 0) {
      long l2 = Long.signum(paramLong);
      l = paramLong;
      if (paramLong < -9223372036854775807L)
        l = -9223372036854775807L; 
      l = Math.abs(l);
      int i = hp2.ordinal();
      long l1 = 0L;
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i != 5) {
              if (i == 6) {
                paramLong = 86400000L;
              } else {
                tp.k("Wrong unit for millisMultiplier: ", hp2);
                return 0L;
              } 
            } else {
              paramLong = 3600000L;
            } 
          } else {
            paramLong = 60000L;
          } 
        } else {
          paramLong = 1000L;
        } 
      } else {
        paramLong = 1L;
      } 
      if (l == 0L) {
        paramLong = l1;
      } else {
        l1 = 4611686018427387903L;
        if (l == 1L) {
          if (paramLong > 4611686018427387903L) {
            paramLong = l1;
            return m(l2 * paramLong);
          } 
        } else if (paramLong == 1L) {
          paramLong = l;
          if (l > 4611686018427387903L) {
            paramLong = l1;
            return m(l2 * paramLong);
          } 
        } else {
          i = 128 - Long.numberOfLeadingZeros(l) - Long.numberOfLeadingZeros(paramLong);
          if (i < 63) {
            paramLong = l * paramLong;
          } else {
            if (i > 63) {
              paramLong = l1;
              return m(l2 * paramLong);
            } 
            l *= paramLong;
            paramLong = l;
            if (l > 4611686018427387903L) {
              paramLong = l1;
              return m(l2 * paramLong);
            } 
          } 
        } 
      } 
      return m(l2 * paramLong);
    } 
    return m(k(TimeUnit.MILLISECONDS.convert(paramLong, timeUnit2)));
  }
  
  public static boolean Y(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt3 == 1 || paramInt3 == 2 || (paramInt3 == 4 && paramInt1 != 2)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (paramInt4 == 1 || paramInt4 == 2 || (paramInt4 == 4 && paramInt2 != 2)) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    return (paramInt1 != 0 || paramInt2 != 0);
  }
  
  public static String Z(String paramString) {
    char[] arrayOfChar;
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if (c >= 'a' && c <= 'z') {
        arrayOfChar = paramString.toCharArray();
        while (b < i) {
          c = arrayOfChar[b];
          if (c >= 'a' && c <= 'z')
            arrayOfChar[b] = (char)(c ^ 0x20); 
          b++;
        } 
        return String.valueOf(arrayOfChar);
      } 
    } 
    return (String)arrayOfChar;
  }
  
  public static int[] a(Context paramContext) {
    int[] arrayOfInt = new int[24];
    for (byte b = 0; b < 24; b++) {
      boolean bool;
      int i = m[b];
      if (f == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      TypedArray typedArray = paramContext.obtainStyledAttributes(o(i, bool), new int[] { 2130968892 });
      arrayOfInt[b] = typedArray.getColor(0, paramContext.getResources().getColor(2131099832));
      typedArray.recycle();
    } 
    return arrayOfInt;
  }
  
  public static void a0(int paramInt, Object[] paramArrayOfObject) {
    byte b = 0;
    while (b < paramInt) {
      if (paramArrayOfObject[b] != null) {
        b++;
        continue;
      } 
      k91.h(ga1.i("at index ", b));
    } 
  }
  
  public static final long b(long paramLong1, long paramLong2) {
    return (paramLong1 == 4611686018427387903L || paramLong1 == -4611686018427387903L) ? (((-4611686018427387903L < paramLong2 && paramLong2 < 4611686018427387903L) || (paramLong2 ^ paramLong1) >= 0L) ? paramLong1 : 9223372036854759646L) : ((paramLong2 == 4611686018427387903L || paramLong2 == -4611686018427387903L) ? paramLong2 : k(paramLong1 + paramLong2));
  }
  
  public static void c(Activity paramActivity) {
    paramActivity.setTheme(g);
    int i = i;
    paramActivity.getTheme().applyStyle(i, true);
    i = j;
    paramActivity.getTheme().applyStyle(i, true);
    paramActivity.getTheme().applyStyle(2131953015, true);
    paramActivity.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(h[2]));
  }
  
  public static Pair c0(RandomAccessFile paramRandomAccessFile, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual length : ()J
    //   4: lstore #5
    //   6: lload #5
    //   8: ldc2_w 22
    //   11: lcmp
    //   12: ifge -> 18
    //   15: goto -> 173
    //   18: iload_1
    //   19: i2l
    //   20: ldc2_w -22
    //   23: lload #5
    //   25: ladd
    //   26: invokestatic min : (JJ)J
    //   29: l2i
    //   30: bipush #22
    //   32: iadd
    //   33: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   36: astore #7
    //   38: aload #7
    //   40: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   43: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   46: pop
    //   47: lload #5
    //   49: aload #7
    //   51: invokevirtual capacity : ()I
    //   54: i2l
    //   55: lsub
    //   56: lstore #5
    //   58: aload_0
    //   59: lload #5
    //   61: invokevirtual seek : (J)V
    //   64: aload_0
    //   65: aload #7
    //   67: invokevirtual array : ()[B
    //   70: aload #7
    //   72: invokevirtual arrayOffset : ()I
    //   75: aload #7
    //   77: invokevirtual capacity : ()I
    //   80: invokevirtual readFully : ([BII)V
    //   83: aload #7
    //   85: invokestatic d0 : (Ljava/nio/ByteBuffer;)V
    //   88: aload #7
    //   90: invokevirtual capacity : ()I
    //   93: istore_1
    //   94: iload_1
    //   95: bipush #22
    //   97: if_icmpge -> 105
    //   100: iconst_m1
    //   101: istore_1
    //   102: goto -> 168
    //   105: iload_1
    //   106: bipush #22
    //   108: isub
    //   109: istore_3
    //   110: iload_3
    //   111: ldc_w 65535
    //   114: invokestatic min : (II)I
    //   117: istore #4
    //   119: iconst_0
    //   120: istore_1
    //   121: iload_1
    //   122: iload #4
    //   124: if_icmpge -> 100
    //   127: iload_3
    //   128: iload_1
    //   129: isub
    //   130: istore_2
    //   131: aload #7
    //   133: iload_2
    //   134: invokevirtual getInt : (I)I
    //   137: ldc_w 101010256
    //   140: if_icmpne -> 162
    //   143: aload #7
    //   145: iload_2
    //   146: bipush #20
    //   148: iadd
    //   149: invokevirtual getShort : (I)S
    //   152: i2c
    //   153: iload_1
    //   154: if_icmpne -> 162
    //   157: iload_2
    //   158: istore_1
    //   159: goto -> 168
    //   162: iinc #1, 1
    //   165: goto -> 121
    //   168: iload_1
    //   169: iconst_m1
    //   170: if_icmpne -> 175
    //   173: aconst_null
    //   174: areturn
    //   175: aload #7
    //   177: iload_1
    //   178: invokevirtual position : (I)Ljava/nio/Buffer;
    //   181: pop
    //   182: aload #7
    //   184: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   187: astore_0
    //   188: aload_0
    //   189: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   192: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   195: pop
    //   196: aload_0
    //   197: lload #5
    //   199: iload_1
    //   200: i2l
    //   201: ladd
    //   202: invokestatic valueOf : (J)Ljava/lang/Long;
    //   205: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   208: areturn
  }
  
  public static void d(pc parampc) {
    if (f == 0) {
      parampc.setTheme(2131952542);
    } else {
      parampc.setTheme(2131952541);
    } 
    int i = i;
    parampc.getTheme().applyStyle(i, true);
    i = j;
    parampc.getTheme().applyStyle(i, true);
    parampc.getTheme().applyStyle(2131953015, true);
  }
  
  public static void d0(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN)
      return; 
    l0.l("ByteBuffer byte order must be little endian");
  }
  
  public static final void g(int paramInt) {
    if (paramInt >= 1)
      return; 
    k91.e(ga1.i("Expected positive parallelism level, but got ", paramInt));
  }
  
  public static int h(Context paramContext, String paramString) {
    int i = Process.myPid();
    int j = Process.myUid();
    String str1 = paramContext.getPackageName();
    if (paramContext.checkPermission(paramString, i, j) == -1)
      return -1; 
    String str2 = AppOpsManager.permissionToOp(paramString);
    if (str2 != null) {
      String str3;
      String str4;
      paramString = str1;
      if (str1 == null) {
        String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(j);
        if (arrayOfString == null || arrayOfString.length <= 0)
          return -1; 
        str4 = arrayOfString[0];
      } 
      i = Process.myUid();
      str1 = paramContext.getPackageName();
      if (i == j && Objects.equals(str1, str4)) {
        if (Build.VERSION.SDK_INT >= 29) {
          AppOpsManager appOpsManager = (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
          i = Binder.getCallingUid();
          boolean bool = true;
          if (appOpsManager == null) {
            i = 1;
          } else {
            i = appOpsManager.checkOpNoThrow(str2, i, str4);
          } 
          if (i == 0) {
            str3 = p8.b(paramContext);
            if (appOpsManager == null) {
              i = bool;
            } else {
              i = appOpsManager.checkOpNoThrow(str2, j, str3);
            } 
          } 
        } else {
          i = ((AppOpsManager)str3.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str2, str4);
        } 
      } else {
        i = ((AppOpsManager)str3.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str2, str4);
      } 
      if (i != 0)
        return -2; 
    } 
    return 0;
  }
  
  public static void i() {
    int j = Integer.parseInt(MyApplication.o().getString("THMR_BT", "2"));
    int i = f;
    if (j == 3) {
      i = u();
    } else if (j == 4) {
      i = v();
    } 
    if (i != f) {
      I(MyApplication.i.getApplicationContext());
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null)
        musicActivity.i0(); 
      SettingsActivity settingsActivity = SettingsActivity.m0;
      if (settingsActivity != null)
        settingsActivity.i0(); 
      EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
      if (equalizerActivity2 != null)
        equalizerActivity2.i0(); 
      Tag2Activity tag2Activity = Tag2Activity.O1;
      if (tag2Activity != null)
        tag2Activity.i0(); 
      SearchActivity searchActivity = SearchActivity.Q0;
      if (searchActivity != null)
        searchActivity.i0(); 
      WelcomeActivity welcomeActivity = WelcomeActivity.d0;
      if (welcomeActivity != null)
        welcomeActivity.recreate(); 
    } 
  }
  
  public static final void j(Closeable paramCloseable, Throwable paramThrowable) {
    if (paramCloseable != null) {
      if (paramThrowable == null) {
        paramCloseable.close();
        return;
      } 
      try {
        return;
      } finally {
        paramCloseable = null;
      } 
    } 
  }
  
  public static long k(long paramLong) {
    return (paramLong < -4611686018427387903L) ? -4611686018427387903L : ((paramLong > 4611686018427387903L) ? 4611686018427387903L : paramLong);
  }
  
  public static int l(int paramInt1, int paramInt2) {
    return jn.i(paramInt1, Color.alpha(paramInt1) * paramInt2 / 255);
  }
  
  public static final long m(long paramLong) {
    f20.b.getClass();
    int i = i20.a;
    return (paramLong << 1L) + 1L;
  }
  
  public static final void n(th1 paramth1, String paramString) {
    paramth1.getClass();
    ai1 ai1 = paramth1.O(paramString);
    try {
      ai1.L();
      return;
    } finally {
      paramth1 = null;
    } 
  }
  
  public static int o(int paramInt, boolean paramBoolean) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt != 4) {
              if (paramInt != 8) {
                if (paramInt != 9) {
                  if (paramInt != 11) {
                    switch (paramInt) {
                      default:
                        switch (paramInt) {
                          default:
                            switch (paramInt) {
                              default:
                                return -1;
                              case 37:
                                return paramBoolean ? 2131952994 : 2131952993;
                              case 36:
                                return paramBoolean ? 2131952980 : 2131952979;
                              case 35:
                                return paramBoolean ? 2131953011 : 2131953010;
                              case 34:
                                return paramBoolean ? 2131952996 : 2131952995;
                              case 33:
                                return paramBoolean ? 2131952998 : 2131952997;
                              case 32:
                                return paramBoolean ? 2131953008 : 2131953007;
                              case 31:
                                break;
                            } 
                            return paramBoolean ? 2131952984 : 2131952983;
                          case 27:
                            return 2131953005;
                          case 26:
                            return 2131953003;
                          case 25:
                            return 2131953001;
                          case 24:
                            break;
                        } 
                        return 2131952999;
                      case 17:
                        return 2131952992;
                      case 16:
                        return 2131952991;
                      case 15:
                        return 2131952988;
                      case 14:
                        return 2131952987;
                      case 13:
                        break;
                    } 
                    return 2131952985;
                  } 
                  return 2131952981;
                } 
                return 2131952986;
              } 
              return 2131953000;
            } 
            return 2131952982;
          } 
          return 2131953004;
        } 
        return 2131953002;
      } 
      return 2131953006;
    } 
    return paramBoolean ? 2131952989 : 2131952990;
  }
  
  public static String p(v00 paramv00) {
    Charset charset = null;
    if (paramv00 != null) {
      BufferedReader bufferedReader;
      Byte[] arrayOfByte = new Byte[4];
      FileInputStream fileInputStream2 = ws2.n(paramv00);
      byte b = 0;
      while (b < 4) {
        int i = fileInputStream2.read();
        if (i != -1) {
          arrayOfByte[b] = Byte.valueOf((byte)(i & 0xFF));
          b++;
        } 
      } 
      fileInputStream2.close();
      if (ag0.a((Object[])c, (Object[])arrayOfByte, 3)) {
        charset = Charset.forName("UTF-8");
      } else if (ag0.a((Object[])d, (Object[])arrayOfByte, 2)) {
        charset = Charset.forName("UTF-16BE");
      } else if (ag0.a((Object[])e, (Object[])arrayOfByte, 2)) {
        charset = Charset.forName("UTF-16LE");
      } 
      FileInputStream fileInputStream1 = ws2.n(paramv00);
      if (charset == null) {
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream1));
      } else {
        bufferedReader = new BufferedReader(new InputStreamReader((InputStream)bufferedReader, charset));
      } 
      StringBuilder stringBuilder = new StringBuilder();
      String str = bufferedReader.readLine();
      if (str != null) {
        String str1 = str;
        if (charset != null) {
          str1 = str;
          if (str.startsWith("﻿"))
            str1 = str.substring(1); 
        } 
        stringBuilder.append(str1);
        while (true) {
          String str2 = bufferedReader.readLine();
          if (str2 != null) {
            stringBuilder.append("\n");
            stringBuilder.append(str2);
            continue;
          } 
          break;
        } 
      } 
      bufferedReader.close();
      return stringBuilder.toString();
    } 
    return null;
  }
  
  public static String q(km0 paramkm0, v00[] paramArrayOfv00) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: aaload
    //   3: astore_2
    //   4: aload_2
    //   5: ifnull -> 13
    //   8: aload_2
    //   9: astore_0
    //   10: goto -> 18
    //   13: aload_0
    //   14: invokestatic D : (Lkm0;)Lv00;
    //   17: astore_0
    //   18: aload_1
    //   19: iconst_0
    //   20: aload_0
    //   21: aastore
    //   22: aload_0
    //   23: invokestatic p : (Lv00;)Ljava/lang/String;
    //   26: astore_0
    //   27: aload_0
    //   28: ifnull -> 38
    //   31: aload_0
    //   32: areturn
    //   33: astore_0
    //   34: aload_0
    //   35: invokevirtual printStackTrace : ()V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   13	18	33	finally
    //   22	27	33	finally
  }
  
  public static k52 r(er paramer, int paramInt, ArrayList<k52> paramArrayList, k52 paramk52) {
    Object object;
    k52 k521;
    if (paramInt == 0) {
      i = paramer.n0;
    } else {
      i = paramer.o0;
    } 
    boolean bool = false;
    if (i != -1 && (paramk52 == null || i != paramk52.b)) {
      byte b = 0;
      while (true) {
        k521 = paramk52;
        if (b < paramArrayList.size()) {
          k521 = paramArrayList.get(b);
          if (k521.b == i) {
            if (paramk52 != null) {
              paramk52.c(paramInt, k521);
              paramArrayList.remove(paramk52);
            } 
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } else {
      k521 = paramk52;
      if (i != -1)
        return paramk52; 
    } 
    paramk52 = k521;
    if (k521 == null) {
      k52 k522;
      Object object1;
      paramk52 = k521;
      if (paramer instanceof yb) {
        yb yb = (yb)paramer;
        i = 0;
        while (true) {
          if (i < yb.r0) {
            er er1 = yb.q0[i];
            if (paramInt == 0) {
              int j = er1.n0;
              if (j != -1) {
                i = j;
                break;
              } 
            } 
            if (paramInt == 1) {
              int j = er1.o0;
              if (j != -1) {
                i = j;
                break;
              } 
            } 
            i++;
            continue;
          } 
          i = -1;
          break;
        } 
        k522 = k521;
        if (i != -1) {
          byte b = 0;
          while (true) {
            k522 = k521;
            if (b < paramArrayList.size()) {
              k522 = paramArrayList.get(b);
              if (k522.b == i)
                break; 
              b++;
              continue;
            } 
            break;
          } 
        } 
      } 
      k521 = k522;
      if (k522 == null) {
        object1 = new Object();
        ((k52)object1).a = new ArrayList();
        ((k52)object1).d = null;
        ((k52)object1).e = -1;
        i = k52.f;
        k52.f = i + 1;
        ((k52)object1).b = i;
        ((k52)object1).c = paramInt;
      } 
      paramArrayList.add(object1);
      object = object1;
    } 
    ArrayList<er> arrayList = ((k52)object).a;
    if (arrayList.contains(paramer))
      return (k52)object; 
    arrayList.add(paramer);
    if (paramer instanceof bf0) {
      bf0 bf0 = (bf0)paramer;
      bq bq = bf0.t0;
      i = bool;
      if (bf0.u0 == 0)
        i = 1; 
      bq.b(i, (k52)object, paramArrayList);
    } 
    int i = ((k52)object).b;
    if (paramInt == 0) {
      paramer.n0 = i;
      paramer.I.b(paramInt, (k52)object, paramArrayList);
      paramer.K.b(paramInt, (k52)object, paramArrayList);
    } else {
      paramer.o0 = i;
      paramer.J.b(paramInt, (k52)object, paramArrayList);
      paramer.M.b(paramInt, (k52)object, paramArrayList);
      paramer.L.b(paramInt, (k52)object, paramArrayList);
    } 
    paramer.P.b(paramInt, (k52)object, paramArrayList);
    return (k52)object;
  }
  
  public static void s(Resources.Theme paramTheme) {
    paramTheme.applyStyle(i, true);
    paramTheme.applyStyle(j, true);
    paramTheme.applyStyle(2131953015, true);
  }
  
  public static void t(pc parampc) {
    int i = o(parampc.getSharedPreferences("PP", 0).getInt("k_si_acc", 0), false);
    parampc.getTheme().applyStyle(i, true);
    parampc.getTheme().applyStyle(2131953012, true);
    parampc.getTheme().applyStyle(2131953015, true);
  }
  
  public static int u() {
    int i = MyApplication.o().getInt("k_i_dstt", 360);
    int j = MyApplication.o().getInt("k_i_dedt", 1079);
    Calendar calendar = Calendar.getInstance();
    int k = calendar.get(11);
    k = calendar.get(12) + k * 60;
    return (k < i || k > j) ? MyApplication.o().getInt("k_i_dtfnt", 2) : 0;
  }
  
  public static int v() {
    return (((MyApplication.i.getApplicationContext().getResources().getConfiguration()).uiMode & 0x30) == 32) ? MyApplication.o().getInt("k_i_dtfnt", 2) : 0;
  }
  
  public static int w(Context paramContext, int paramInt1, int paramInt2) {
    TypedValue typedValue = g92.Y(paramContext, paramInt1);
    if (typedValue != null) {
      paramInt1 = typedValue.resourceId;
      if (paramInt1 != 0) {
        paramInt1 = paramContext.getColor(paramInt1);
      } else {
        paramInt1 = typedValue.data;
      } 
      Integer integer = Integer.valueOf(paramInt1);
    } else {
      paramContext = null;
    } 
    return (paramContext != null) ? paramContext.intValue() : paramInt2;
  }
  
  public static int x(View paramView, int paramInt) {
    Context context1 = paramView.getContext();
    Context context2 = paramView.getContext();
    String str1 = paramView.getClass().getCanonicalName();
    TypedValue typedValue = g92.Y(context2, paramInt);
    if (typedValue != null) {
      paramInt = typedValue.resourceId;
      return (paramInt != 0) ? context1.getColor(paramInt) : typedValue.data;
    } 
    String str2 = context2.getResources().getResourceName(paramInt);
    throw new IllegalArgumentException(String.format(IGBYXeDFmKYajx.SIKtfgojS, new Object[] { str1, str2 }));
  }
  
  public static int y(pc parampc, int paramInt) {
    TypedArray typedArray = parampc.obtainStyledAttributes(new int[] { paramInt });
    paramInt = typedArray.getColor(0, 0);
    typedArray.recycle();
    return paramInt;
  }
  
  public static Drawable z(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    Drawable drawable = typedArray.getDrawable(0);
    typedArray.recycle();
    return drawable;
  }
  
  public abstract void P(int paramInt);
  
  public abstract void Q(Typeface paramTypeface, boolean paramBoolean);
  
  public he0 e(Context paramContext, Looper paramLooper, m2 paramm2, Object paramObject, me0 paramme0, ne0 paramne0) {
    return f(paramContext, paramLooper, paramm2, paramObject, (qa2)paramme0, (qa2)paramne0);
  }
  
  public he0 f(Context paramContext, Looper paramLooper, m2 paramm2, Object paramObject, qa2 paramqa21, qa2 paramqa22) {
    throw new UnsupportedOperationException("buildClient must be implemented");
  }
  
  static {
    Byte byte_2 = Byte.valueOf((byte)-2);
    Byte byte_1 = Byte.valueOf((byte)-1);
    d = new Byte[] { byte_2, byte_1 };
    e = new Byte[] { byte_1, byte_2 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */