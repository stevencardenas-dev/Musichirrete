import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class xb2 {
  public static final rp0 a = new rp0("MetadataUtils", null);
  
  public static final String[] b;
  
  public static final String c;
  
  static {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "Z";
    arrayOfString[1] = "+hh";
    arrayOfString[2] = "+hhmm";
    arrayOfString[3] = "+hh:mm";
    b = arrayOfString;
    c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(arrayOfString[0]));
  }
  
  public static void a(List<i52> paramList, JSONArray paramJSONArray) {
    try {
      paramList.clear();
      byte b = 0;
      while (true) {
        if (b < paramJSONArray.length()) {
          JSONObject jSONObject = paramJSONArray.getJSONObject(b);
          try {
            i52 i52 = new i52();
            this(jSONObject);
            paramList.add(i52);
          } catch (IllegalArgumentException illegalArgumentException) {}
          b++;
          continue;
        } 
        return;
      } 
    } catch (JSONException jSONException) {}
  }
  
  public static JSONArray b(List paramList) {
    paramList.getClass();
    JSONArray jSONArray = new JSONArray();
    Iterator<i52> iterator = paramList.iterator();
    while (true) {
      if (iterator.hasNext()) {
        i52 i52 = iterator.next();
        i52.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
          jSONObject.put("url", i52.c.toString());
          jSONObject.put("width", i52.e);
          jSONObject.put("height", i52.f);
        } catch (JSONException jSONException) {}
        jSONArray.put(jSONObject);
        continue;
      } 
      return jSONArray;
    } 
  }
  
  public static Calendar c(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4: istore_2
    //   5: getstatic xb2.a : Lrp0;
    //   8: astore #4
    //   10: iload_2
    //   11: ifeq -> 27
    //   14: aload #4
    //   16: ldc 'Input string is empty or null'
    //   18: iconst_0
    //   19: anewarray java/lang/Object
    //   22: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aconst_null
    //   26: areturn
    //   27: aload_0
    //   28: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   31: ifne -> 72
    //   34: aload_0
    //   35: iconst_0
    //   36: bipush #8
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: astore_3
    //   42: goto -> 86
    //   45: astore_3
    //   46: aload #4
    //   48: getfield a : Ljava/lang/String;
    //   51: aload #4
    //   53: ldc 'Error extracting the date'
    //   55: iconst_0
    //   56: anewarray java/lang/Object
    //   59: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   62: aload_3
    //   63: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   66: pop
    //   67: aconst_null
    //   68: astore_3
    //   69: goto -> 86
    //   72: aload #4
    //   74: ldc 'Input string is empty or null'
    //   76: iconst_0
    //   77: anewarray java/lang/Object
    //   80: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: goto -> 67
    //   86: aload_3
    //   87: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   90: ifeq -> 106
    //   93: aload #4
    //   95: ldc 'Invalid date format'
    //   97: iconst_0
    //   98: anewarray java/lang/Object
    //   101: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   104: aconst_null
    //   105: areturn
    //   106: aload_0
    //   107: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   110: ifeq -> 129
    //   113: aload #4
    //   115: ldc 'string is empty or null'
    //   117: iconst_0
    //   118: anewarray java/lang/Object
    //   121: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aconst_null
    //   125: astore_0
    //   126: goto -> 330
    //   129: aload_0
    //   130: bipush #84
    //   132: invokevirtual indexOf : (I)I
    //   135: istore_1
    //   136: iload_1
    //   137: bipush #8
    //   139: if_icmpeq -> 156
    //   142: aload #4
    //   144: ldc 'T delimeter is not found'
    //   146: iconst_0
    //   147: anewarray java/lang/Object
    //   150: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: goto -> 124
    //   156: aload_0
    //   157: iload_1
    //   158: iconst_1
    //   159: iadd
    //   160: invokevirtual substring : (I)Ljava/lang/String;
    //   163: astore_0
    //   164: aload_0
    //   165: invokevirtual length : ()I
    //   168: bipush #6
    //   170: if_icmpne -> 176
    //   173: goto -> 330
    //   176: aload_0
    //   177: bipush #6
    //   179: invokevirtual charAt : (I)C
    //   182: istore_1
    //   183: getstatic xb2.b : [Ljava/lang/String;
    //   186: astore #5
    //   188: iload_1
    //   189: bipush #43
    //   191: if_icmpeq -> 246
    //   194: iload_1
    //   195: bipush #45
    //   197: if_icmpeq -> 246
    //   200: iload_1
    //   201: bipush #90
    //   203: if_icmpeq -> 209
    //   206: goto -> 124
    //   209: aload_0
    //   210: invokevirtual length : ()I
    //   213: aload #5
    //   215: iconst_0
    //   216: aaload
    //   217: invokevirtual length : ()I
    //   220: bipush #6
    //   222: iadd
    //   223: if_icmpne -> 124
    //   226: aload_0
    //   227: iconst_0
    //   228: aload_0
    //   229: invokevirtual length : ()I
    //   232: iconst_1
    //   233: isub
    //   234: invokevirtual substring : (II)Ljava/lang/String;
    //   237: ldc '+0000'
    //   239: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   242: astore_0
    //   243: goto -> 330
    //   246: aload_0
    //   247: invokevirtual length : ()I
    //   250: istore_1
    //   251: iload_1
    //   252: aload #5
    //   254: iconst_1
    //   255: aaload
    //   256: invokevirtual length : ()I
    //   259: bipush #6
    //   261: iadd
    //   262: if_icmpeq -> 293
    //   265: iload_1
    //   266: aload #5
    //   268: iconst_2
    //   269: aaload
    //   270: invokevirtual length : ()I
    //   273: bipush #6
    //   275: iadd
    //   276: if_icmpeq -> 293
    //   279: iload_1
    //   280: aload #5
    //   282: iconst_3
    //   283: aaload
    //   284: invokevirtual length : ()I
    //   287: bipush #6
    //   289: iadd
    //   290: if_icmpne -> 124
    //   293: aload_0
    //   294: ldc '([\+\-]\d\d):(\d\d)'
    //   296: ldc '$1$2'
    //   298: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   301: astore_0
    //   302: goto -> 330
    //   305: astore_0
    //   306: aload #4
    //   308: getfield a : Ljava/lang/String;
    //   311: aload #4
    //   313: ldc 'Error extracting the time substring: %s'
    //   315: iconst_0
    //   316: anewarray java/lang/Object
    //   319: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   322: aload_0
    //   323: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   326: pop
    //   327: goto -> 124
    //   330: aload_0
    //   331: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   334: ifne -> 392
    //   337: new java/lang/StringBuilder
    //   340: dup
    //   341: aload_3
    //   342: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   345: invokevirtual length : ()I
    //   348: iconst_1
    //   349: iadd
    //   350: aload_0
    //   351: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   354: invokevirtual length : ()I
    //   357: iadd
    //   358: invokespecial <init> : (I)V
    //   361: aload_3
    //   362: ldc 'T'
    //   364: aload_0
    //   365: invokestatic o : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   368: astore_3
    //   369: aload_0
    //   370: invokevirtual length : ()I
    //   373: bipush #6
    //   375: if_icmpne -> 385
    //   378: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.xUPJPDnWIKS : Ljava/lang/String;
    //   381: astore_0
    //   382: goto -> 395
    //   385: getstatic xb2.c : Ljava/lang/String;
    //   388: astore_0
    //   389: goto -> 395
    //   392: ldc 'yyyyMMdd'
    //   394: astore_0
    //   395: invokestatic getInstance : ()Ljava/util/Calendar;
    //   398: astore #5
    //   400: new java/text/SimpleDateFormat
    //   403: astore #6
    //   405: aload #6
    //   407: aload_0
    //   408: invokespecial <init> : (Ljava/lang/String;)V
    //   411: aload #6
    //   413: aload_3
    //   414: invokevirtual parse : (Ljava/lang/String;)Ljava/util/Date;
    //   417: astore_0
    //   418: aload #5
    //   420: aload_0
    //   421: invokevirtual setTime : (Ljava/util/Date;)V
    //   424: aload #5
    //   426: areturn
    //   427: astore_0
    //   428: aload #4
    //   430: getfield a : Ljava/lang/String;
    //   433: aload #4
    //   435: ldc 'Error parsing string'
    //   437: iconst_0
    //   438: anewarray java/lang/Object
    //   441: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   444: aload_0
    //   445: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   448: pop
    //   449: aconst_null
    //   450: areturn
    // Exception table:
    //   from	to	target	type
    //   34	42	45	java/lang/IndexOutOfBoundsException
    //   156	164	305	java/lang/IndexOutOfBoundsException
    //   400	418	427	java/text/ParseException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */