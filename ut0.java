import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ut0 extends f0 {
  public static final Parcelable.Creator<ut0> CREATOR = new yb2(19);
  
  public MediaInfo b;
  
  public int c;
  
  public boolean e;
  
  public double f;
  
  public double g;
  
  public double h;
  
  public long[] i;
  
  public String j;
  
  public JSONObject k;
  
  public ut0(MediaInfo paramMediaInfo, int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, long[] paramArrayOflong, String paramString) {
    this.b = paramMediaInfo;
    this.c = paramInt;
    this.e = paramBoolean;
    this.f = paramDouble1;
    this.g = paramDouble2;
    this.h = paramDouble3;
    this.i = paramArrayOflong;
    this.j = paramString;
    if (paramString != null)
      try {
        JSONObject jSONObject = new JSONObject();
        this(this.j);
        this.k = jSONObject;
        return;
      } catch (JSONException jSONException) {
        this.k = null;
        this.j = null;
        return;
      }  
    this.k = null;
  }
  
  public ut0(JSONObject paramJSONObject) {
    this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0D, null, null);
    e(paramJSONObject);
  }
  
  public final boolean e(JSONObject paramJSONObject) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'media'
    //   3: invokevirtual has : (Ljava/lang/String;)Z
    //   6: istore #8
    //   8: iconst_0
    //   9: istore #6
    //   11: iload #8
    //   13: ifeq -> 39
    //   16: aload_0
    //   17: new com/google/android/gms/cast/MediaInfo
    //   20: dup
    //   21: aload_1
    //   22: ldc 'media'
    //   24: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   27: invokespecial <init> : (Lorg/json/JSONObject;)V
    //   30: putfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   33: iconst_1
    //   34: istore #8
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #8
    //   42: iload #8
    //   44: istore #9
    //   46: aload_1
    //   47: ldc 'itemId'
    //   49: invokevirtual has : (Ljava/lang/String;)Z
    //   52: ifeq -> 85
    //   55: aload_1
    //   56: ldc 'itemId'
    //   58: invokevirtual getInt : (Ljava/lang/String;)I
    //   61: istore #4
    //   63: iload #8
    //   65: istore #9
    //   67: aload_0
    //   68: getfield c : I
    //   71: iload #4
    //   73: if_icmpeq -> 85
    //   76: aload_0
    //   77: iload #4
    //   79: putfield c : I
    //   82: iconst_1
    //   83: istore #9
    //   85: iload #9
    //   87: istore #8
    //   89: aload_1
    //   90: ldc 'autoplay'
    //   92: invokevirtual has : (Ljava/lang/String;)Z
    //   95: ifeq -> 128
    //   98: aload_1
    //   99: ldc 'autoplay'
    //   101: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   104: istore #10
    //   106: iload #9
    //   108: istore #8
    //   110: aload_0
    //   111: getfield e : Z
    //   114: iload #10
    //   116: if_icmpeq -> 128
    //   119: aload_0
    //   120: iload #10
    //   122: putfield e : Z
    //   125: iconst_1
    //   126: istore #8
    //   128: aload_1
    //   129: ldc 'startTime'
    //   131: invokevirtual optDouble : (Ljava/lang/String;)D
    //   134: dstore_2
    //   135: dload_2
    //   136: invokestatic isNaN : (D)Z
    //   139: aload_0
    //   140: getfield f : D
    //   143: invokestatic isNaN : (D)Z
    //   146: if_icmpeq -> 152
    //   149: goto -> 183
    //   152: iload #8
    //   154: istore #9
    //   156: dload_2
    //   157: invokestatic isNaN : (D)Z
    //   160: ifne -> 191
    //   163: iload #8
    //   165: istore #9
    //   167: dload_2
    //   168: aload_0
    //   169: getfield f : D
    //   172: dsub
    //   173: invokestatic abs : (D)D
    //   176: ldc2_w 1.0E-7
    //   179: dcmpl
    //   180: ifle -> 191
    //   183: aload_0
    //   184: dload_2
    //   185: putfield f : D
    //   188: iconst_1
    //   189: istore #9
    //   191: iload #9
    //   193: istore #8
    //   195: aload_1
    //   196: ldc 'playbackDuration'
    //   198: invokevirtual has : (Ljava/lang/String;)Z
    //   201: ifeq -> 239
    //   204: aload_1
    //   205: ldc 'playbackDuration'
    //   207: invokevirtual getDouble : (Ljava/lang/String;)D
    //   210: dstore_2
    //   211: iload #9
    //   213: istore #8
    //   215: dload_2
    //   216: aload_0
    //   217: getfield g : D
    //   220: dsub
    //   221: invokestatic abs : (D)D
    //   224: ldc2_w 1.0E-7
    //   227: dcmpl
    //   228: ifle -> 239
    //   231: aload_0
    //   232: dload_2
    //   233: putfield g : D
    //   236: iconst_1
    //   237: istore #8
    //   239: iload #8
    //   241: istore #9
    //   243: aload_1
    //   244: ldc 'preloadTime'
    //   246: invokevirtual has : (Ljava/lang/String;)Z
    //   249: ifeq -> 287
    //   252: aload_1
    //   253: ldc 'preloadTime'
    //   255: invokevirtual getDouble : (Ljava/lang/String;)D
    //   258: dstore_2
    //   259: iload #8
    //   261: istore #9
    //   263: dload_2
    //   264: aload_0
    //   265: getfield h : D
    //   268: dsub
    //   269: invokestatic abs : (D)D
    //   272: ldc2_w 1.0E-7
    //   275: dcmpl
    //   276: ifle -> 287
    //   279: aload_0
    //   280: dload_2
    //   281: putfield h : D
    //   284: iconst_1
    //   285: istore #9
    //   287: aload_1
    //   288: ldc 'activeTrackIds'
    //   290: invokevirtual has : (Ljava/lang/String;)Z
    //   293: ifeq -> 420
    //   296: aload_1
    //   297: ldc 'activeTrackIds'
    //   299: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   302: astore #11
    //   304: aload #11
    //   306: invokevirtual length : ()I
    //   309: istore #7
    //   311: iload #7
    //   313: newarray long
    //   315: astore #12
    //   317: iconst_0
    //   318: istore #4
    //   320: iload #4
    //   322: iload #7
    //   324: if_icmpge -> 345
    //   327: aload #12
    //   329: iload #4
    //   331: aload #11
    //   333: iload #4
    //   335: invokevirtual getLong : (I)J
    //   338: lastore
    //   339: iinc #4, 1
    //   342: goto -> 320
    //   345: aload_0
    //   346: getfield i : [J
    //   349: astore #11
    //   351: aload #11
    //   353: ifnonnull -> 366
    //   356: iconst_1
    //   357: istore #5
    //   359: aload #12
    //   361: astore #11
    //   363: goto -> 427
    //   366: aload #11
    //   368: arraylength
    //   369: iload #7
    //   371: if_icmpeq -> 377
    //   374: goto -> 356
    //   377: iconst_0
    //   378: istore #4
    //   380: iload #6
    //   382: istore #5
    //   384: aload #12
    //   386: astore #11
    //   388: iload #4
    //   390: iload #7
    //   392: if_icmpge -> 427
    //   395: aload_0
    //   396: getfield i : [J
    //   399: iload #4
    //   401: laload
    //   402: aload #12
    //   404: iload #4
    //   406: laload
    //   407: lcmp
    //   408: ifeq -> 414
    //   411: goto -> 356
    //   414: iinc #4, 1
    //   417: goto -> 380
    //   420: aconst_null
    //   421: astore #11
    //   423: iload #6
    //   425: istore #5
    //   427: iload #5
    //   429: ifeq -> 441
    //   432: aload_0
    //   433: aload #11
    //   435: putfield i : [J
    //   438: iconst_1
    //   439: istore #9
    //   441: aload_1
    //   442: ldc 'customData'
    //   444: invokevirtual has : (Ljava/lang/String;)Z
    //   447: ifeq -> 462
    //   450: aload_0
    //   451: aload_1
    //   452: ldc 'customData'
    //   454: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   457: putfield k : Lorg/json/JSONObject;
    //   460: iconst_1
    //   461: ireturn
    //   462: iload #9
    //   464: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool1;
    boolean bool2;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ut0))
      return false; 
    paramObject = paramObject;
    JSONObject jSONObject2 = this.k;
    if (jSONObject2 != null) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    JSONObject jSONObject1 = ((ut0)paramObject).k;
    if (jSONObject1 != null) {
      bool2 = false;
    } else {
      bool2 = true;
    } 
    return (bool1 != bool2) ? false : ((jSONObject2 != null && jSONObject1 != null && !vk0.a(jSONObject2, jSONObject1)) ? false : ((qj.c(this.b, ((ut0)paramObject).b) && this.c == ((ut0)paramObject).c && this.e == ((ut0)paramObject).e && ((Double.isNaN(this.f) && Double.isNaN(((ut0)paramObject).f)) || this.f == ((ut0)paramObject).f) && this.g == ((ut0)paramObject).g && this.h == ((ut0)paramObject).h && Arrays.equals(this.i, ((ut0)paramObject).i))));
  }
  
  public final JSONObject f() {
    JSONObject jSONObject = new JSONObject();
    try {
      MediaInfo mediaInfo = this.b;
      if (mediaInfo != null)
        jSONObject.put("media", mediaInfo.f()); 
      int i = this.c;
      if (i != 0)
        jSONObject.put("itemId", i); 
      jSONObject.put("autoplay", this.e);
      if (!Double.isNaN(this.f))
        jSONObject.put("startTime", this.f); 
      double d = this.g;
      if (d != Double.POSITIVE_INFINITY)
        jSONObject.put("playbackDuration", d); 
      jSONObject.put(PwbbJfsdcHrAjW.SepOkPRttV, this.h);
      if (this.i != null) {
        JSONArray jSONArray = new JSONArray();
        this();
        long[] arrayOfLong = this.i;
        int j = arrayOfLong.length;
        for (i = 0; i < j; i++)
          jSONArray.put(arrayOfLong[i]); 
        jSONObject.put("activeTrackIds", jSONArray);
      } 
      JSONObject jSONObject1 = this.k;
      if (jSONObject1 != null)
        jSONObject.put("customData", jSONObject1); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, Integer.valueOf(this.c), Boolean.valueOf(this.e), Double.valueOf(this.f), Double.valueOf(this.g), Double.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), String.valueOf(this.k) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.k;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.j = str;
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 2, (Parcelable)this.b, paramInt);
    paramInt = this.c;
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(paramInt);
    boolean bool = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(bool);
    double d = this.f;
    qv.C0(paramParcel, 5, 8);
    paramParcel.writeDouble(d);
    d = this.g;
    qv.C0(paramParcel, 6, 8);
    paramParcel.writeDouble(d);
    d = this.h;
    qv.C0(paramParcel, 7, 8);
    paramParcel.writeDouble(d);
    qv.t0(paramParcel, 8, this.i);
    qv.v0(paramParcel, 9, this.j);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ut0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */