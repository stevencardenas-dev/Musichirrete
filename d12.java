import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public abstract class d12 {
  public static final int a;
  
  public static final String b;
  
  public static final String c;
  
  public static final String d;
  
  public static HashMap e;
  
  public static final String[] f = new String[] { 
      "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", 
      "chi", fXMDNeMWaILNVh.FUHsgxNKJNzdSQb, "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", 
      "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", 
      "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", 
      "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", jLnXOLx.MHNygdt, "yi", 
      "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", 
      "nno", GMDx.QyF, "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", 
      "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", 
      "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
  
  public static final String[] g = new String[] { 
      "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", 
      "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public static int b(int[] paramArrayOfint, int paramInt) {
    int j = Arrays.binarySearch(paramArrayOfint, paramInt);
    int i = j;
    if (j < 0)
      return -(j + 2); 
    while (--i >= 0 && paramArrayOfint[i] == paramInt);
    return i;
  }
  
  public static int c(int paramInt) {
    switch (paramInt) {
      default:
        return 0;
      case 8:
        paramInt = a;
        return (paramInt >= 23) ? 6396 : ((paramInt >= 21) ? 6396 : 0);
      case 7:
        return 1276;
      case 6:
        return 252;
      case 5:
        return 220;
      case 4:
        return 204;
      case 3:
        return 28;
      case 2:
        return 12;
      case 1:
        break;
    } 
    return 4;
  }
  
  public static int d(Context paramContext) {
    int i = 0;
    if (paramContext == null)
      return 0; 
    ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (connectivityManager == null)
      return 0; 
    try {
      NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
      byte b = 1;
      i = b;
      if (networkInfo != null)
        if (!networkInfo.isConnected()) {
          i = b;
        } else {
          i = networkInfo.getType();
          if (i != 0)
            if (i != 1) {
              if (i != 4 && i != 5)
                return (i != 6) ? ((i != 9) ? 8 : 7) : 5; 
            } else {
              return 2;
            }  
          switch (networkInfo.getSubtype()) {
            default:
              return 6;
            case 20:
              return 9;
            case 18:
              return 2;
            case 13:
              return 5;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
              return 4;
            case 1:
            case 2:
              break;
          } 
          return 3;
        }  
    } catch (SecurityException securityException) {}
    return i;
  }
  
  public static int e(int paramInt1, int paramInt2) {
    if (paramInt1 != 2) {
      int i = paramInt2;
      if (paramInt1 != 3) {
        if (paramInt1 != 4)
          if (paramInt1 != 268435456) {
            if (paramInt1 != 536870912) {
              if (paramInt1 != 805306368) {
                l0.k();
                return 0;
              } 
            } else {
              return paramInt2 * 3;
            } 
          } else {
            return paramInt2 * 2;
          }  
        i = paramInt2 * 4;
      } 
      return i;
    } 
    return paramInt2 * 2;
  }
  
  public static boolean f(int paramInt) {
    return (paramInt == 3 || paramInt == 2 || paramInt == 268435456 || paramInt == 536870912 || paramInt == 805306368 || paramInt == 4);
  }
  
  public static String g(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: bipush #95
    //   9: bipush #45
    //   11: invokevirtual replace : (CC)Ljava/lang/String;
    //   14: astore #5
    //   16: aload_0
    //   17: astore #4
    //   19: aload #5
    //   21: invokevirtual isEmpty : ()Z
    //   24: ifne -> 48
    //   27: ldc_w 'und'
    //   30: aload #5
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 44
    //   38: aload_0
    //   39: astore #4
    //   41: goto -> 48
    //   44: aload #5
    //   46: astore #4
    //   48: aload #4
    //   50: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   53: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   56: astore #5
    //   58: aload #5
    //   60: ldc_w '-'
    //   63: iconst_2
    //   64: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   67: astore_0
    //   68: iconst_0
    //   69: istore_2
    //   70: aload_0
    //   71: iconst_0
    //   72: aaload
    //   73: astore #6
    //   75: getstatic d12.e : Ljava/util/HashMap;
    //   78: ifnonnull -> 201
    //   81: invokestatic getISOLanguages : ()[Ljava/lang/String;
    //   84: astore #4
    //   86: aload #4
    //   88: arraylength
    //   89: istore_1
    //   90: getstatic d12.f : [Ljava/lang/String;
    //   93: astore #7
    //   95: new java/util/HashMap
    //   98: dup
    //   99: iload_1
    //   100: aload #7
    //   102: arraylength
    //   103: iadd
    //   104: invokespecial <init> : (I)V
    //   107: astore_0
    //   108: aload #4
    //   110: arraylength
    //   111: istore_3
    //   112: iconst_0
    //   113: istore_1
    //   114: iload_1
    //   115: iload_3
    //   116: if_icmpge -> 167
    //   119: aload #4
    //   121: iload_1
    //   122: aaload
    //   123: astore #8
    //   125: new java/util/Locale
    //   128: astore #9
    //   130: aload #9
    //   132: aload #8
    //   134: invokespecial <init> : (Ljava/lang/String;)V
    //   137: aload #9
    //   139: invokevirtual getISO3Language : ()Ljava/lang/String;
    //   142: astore #9
    //   144: aload #9
    //   146: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   149: ifne -> 161
    //   152: aload_0
    //   153: aload #9
    //   155: aload #8
    //   157: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   160: pop
    //   161: iinc #1, 1
    //   164: goto -> 114
    //   167: iconst_0
    //   168: istore_1
    //   169: iload_1
    //   170: aload #7
    //   172: arraylength
    //   173: if_icmpge -> 197
    //   176: aload_0
    //   177: aload #7
    //   179: iload_1
    //   180: aaload
    //   181: aload #7
    //   183: iload_1
    //   184: iconst_1
    //   185: iadd
    //   186: aaload
    //   187: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   190: pop
    //   191: iinc #1, 2
    //   194: goto -> 169
    //   197: aload_0
    //   198: putstatic d12.e : Ljava/util/HashMap;
    //   201: getstatic d12.e : Ljava/util/HashMap;
    //   204: aload #6
    //   206: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   209: checkcast java/lang/String
    //   212: astore #7
    //   214: aload #6
    //   216: astore #4
    //   218: aload #5
    //   220: astore_0
    //   221: aload #7
    //   223: ifnull -> 246
    //   226: aload #7
    //   228: aload #5
    //   230: aload #6
    //   232: invokevirtual length : ()I
    //   235: invokevirtual substring : (I)Ljava/lang/String;
    //   238: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   241: astore_0
    //   242: aload #7
    //   244: astore #4
    //   246: iload_2
    //   247: istore_1
    //   248: ldc_w 'no'
    //   251: aload #4
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifne -> 288
    //   259: iload_2
    //   260: istore_1
    //   261: ldc_w 'i'
    //   264: aload #4
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifne -> 288
    //   272: aload_0
    //   273: astore #5
    //   275: ldc_w 'zh'
    //   278: aload #4
    //   280: invokevirtual equals : (Ljava/lang/Object;)Z
    //   283: ifeq -> 368
    //   286: iload_2
    //   287: istore_1
    //   288: getstatic d12.g : [Ljava/lang/String;
    //   291: astore #4
    //   293: aload_0
    //   294: astore #5
    //   296: iload_1
    //   297: aload #4
    //   299: arraylength
    //   300: if_icmpge -> 368
    //   303: aload_0
    //   304: aload #4
    //   306: iload_1
    //   307: aaload
    //   308: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   311: ifeq -> 362
    //   314: new java/lang/StringBuilder
    //   317: dup
    //   318: invokespecial <init> : ()V
    //   321: astore #5
    //   323: aload #5
    //   325: aload #4
    //   327: iload_1
    //   328: iconst_1
    //   329: iadd
    //   330: aaload
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload #5
    //   337: aload_0
    //   338: aload #4
    //   340: iload_1
    //   341: aaload
    //   342: invokevirtual length : ()I
    //   345: invokevirtual substring : (I)Ljava/lang/String;
    //   348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: aload #5
    //   354: invokevirtual toString : ()Ljava/lang/String;
    //   357: astore #5
    //   359: goto -> 368
    //   362: iinc #1, 2
    //   365: goto -> 288
    //   368: aload #5
    //   370: areturn
    //   371: astore #8
    //   373: goto -> 161
    // Exception table:
    //   from	to	target	type
    //   125	161	371	java/util/MissingResourceException
  }
  
  public static Intent h(Context paramContext, vv paramvv, IntentFilter paramIntentFilter) {
    return (Build.VERSION.SDK_INT >= 26) ? paramContext.registerReceiver(paramvv, paramIntentFilter, null, null, 2) : paramContext.registerReceiver(paramvv, paramIntentFilter, null, null);
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    a = i;
    String str3 = Build.DEVICE;
    b = str3;
    String str2 = Build.MANUFACTURER;
    c = str2;
    String str1 = Build.MODEL;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str3);
    stringBuilder.append(", ");
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    stringBuilder.append(", ");
    stringBuilder.append(i);
    d = stringBuilder.toString();
    Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    Pattern.compile("%([A-Fa-f0-9]{2})");
    Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */