import android.content.Context;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.musicolet.MyApplication;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

public final class km0 implements xj1, Serializable {
  public final int b;
  
  public final qn1 c;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final String i;
  
  public final String j;
  
  public final long k;
  
  public final long l;
  
  public long m;
  
  public long n;
  
  public int o;
  
  public final int p;
  
  public final int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public km0(int paramInt1, qn1 paramqn1, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, String paramString4, String paramString5, String paramString6, int paramInt8) {
    // Byte code:
    //   0: aload_2
    //   1: getfield b : Ljava/lang/String;
    //   4: astore #25
    //   6: aload_0
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: iload_1
    //   12: putfield b : I
    //   15: aload_3
    //   16: ifnull -> 29
    //   19: aload_3
    //   20: astore #24
    //   22: aload_3
    //   23: invokevirtual length : ()I
    //   26: ifne -> 33
    //   29: ldc '<unknown>'
    //   31: astore #24
    //   33: aload #4
    //   35: ifnull -> 55
    //   38: aload #4
    //   40: invokevirtual length : ()I
    //   43: ifne -> 49
    //   46: goto -> 55
    //   49: aload #4
    //   51: astore_3
    //   52: goto -> 58
    //   55: ldc '<unknown>'
    //   57: astore_3
    //   58: aload #5
    //   60: ifnull -> 81
    //   63: aload #5
    //   65: invokevirtual length : ()I
    //   68: ifne -> 74
    //   71: goto -> 81
    //   74: aload #5
    //   76: astore #4
    //   78: goto -> 85
    //   81: ldc '<unknown>'
    //   83: astore #4
    //   85: aload #25
    //   87: ifnull -> 111
    //   90: aload #25
    //   92: invokevirtual length : ()I
    //   95: ifeq -> 111
    //   98: aload_2
    //   99: astore #5
    //   101: ldc '<unknown>'
    //   103: aload #25
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifeq -> 141
    //   111: new qn1
    //   114: dup
    //   115: aload_2
    //   116: getfield f : Lwo;
    //   119: aload #22
    //   121: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   124: aload_2
    //   125: getfield c : Ljava/lang/String;
    //   128: aload_2
    //   129: getfield e : Ljava/lang/String;
    //   132: aload_2
    //   133: getfield g : I
    //   136: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   139: astore #5
    //   141: aload_0
    //   142: aload #5
    //   144: putfield c : Lqn1;
    //   147: aload_0
    //   148: aload #24
    //   150: putfield e : Ljava/lang/String;
    //   153: aload_0
    //   154: aload_3
    //   155: putfield f : Ljava/lang/String;
    //   158: aload_0
    //   159: aload #22
    //   161: putfield g : Ljava/lang/String;
    //   164: aload_0
    //   165: aload #20
    //   167: putfield h : Ljava/lang/String;
    //   170: aload_0
    //   171: aload #21
    //   173: putfield i : Ljava/lang/String;
    //   176: aload_0
    //   177: aload #4
    //   179: putfield j : Ljava/lang/String;
    //   182: aload_0
    //   183: lload #6
    //   185: putfield k : J
    //   188: aload_0
    //   189: lload #8
    //   191: putfield l : J
    //   194: aload_0
    //   195: lload #10
    //   197: putfield m : J
    //   200: aload_0
    //   201: lload #12
    //   203: putfield n : J
    //   206: aload_0
    //   207: iload #14
    //   209: putfield o : I
    //   212: aload_0
    //   213: iload #15
    //   215: putfield r : I
    //   218: aload_0
    //   219: iload #16
    //   221: putfield s : I
    //   224: aload_0
    //   225: iload #17
    //   227: putfield t : I
    //   230: aload_0
    //   231: iload #18
    //   233: putfield p : I
    //   236: aload_0
    //   237: iload #19
    //   239: putfield q : I
    //   242: aload_0
    //   243: iload #23
    //   245: putfield u : I
    //   248: return
  }
  
  public static String n(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3) {
    if (paramInt1 == 0)
      return paramString1; 
    StringBuilder stringBuilder = new StringBuilder(paramString1);
    String str = VDgS.WCeZpe;
    if ((paramInt1 & 0x1) > 0) {
      stringBuilder.append(str);
      stringBuilder.append(paramString2);
    } 
    if ((paramInt1 & 0x2) > 0) {
      stringBuilder.append(str);
      stringBuilder.append(paramString3);
    } 
    if ((paramInt1 & 0x4) > 0) {
      stringBuilder.append(str);
      stringBuilder.append(paramInt2);
    } 
    return stringBuilder.toString();
  }
  
  public final boolean a(String[] paramArrayOfString) {
    if (paramArrayOfString != null && paramArrayOfString.length != 0) {
      int i = paramArrayOfString.length;
      for (byte b = 0;; b++) {
        if (b < i) {
          String str = paramArrayOfString[b];
          if (!ag0.i0(ag0.W(this).toUpperCase().toLowerCase()).contains(str)) {
            qn1 qn11 = this.c;
            if (ag0.i0(qn11.c.toUpperCase().toLowerCase()).contains(str) || ag0.i0(qn11.e.toUpperCase().toLowerCase()).contains(str))
              continue; 
            break;
          } 
          continue;
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public final long b() {
    return this.m;
  }
  
  public final int c() {
    return this.q / 1000;
  }
  
  public final v00 d() {
    Context context = MyApplication.i.getApplicationContext();
    String str = ag0.Q0(this.c.f);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.h);
    stringBuilder.append("/");
    stringBuilder.append(this.g);
    return v00.r(context, str, stringBuilder.toString(), this.g, this.l);
  }
  
  public final int e() {
    return this.o;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof km0) {
      paramObject = ((km0)paramObject).c;
      return Objects.equals(this.c, paramObject);
    } 
    return false;
  }
  
  public final int f() {
    if (this.m == 0L)
      return 0; 
    int i = lm0.M.get(1);
    int j = lm0.M.get(2);
    Calendar calendar = lm0.N;
    calendar.setTimeInMillis(this.m);
    return (i == calendar.get(1) && j == calendar.get(2)) ? this.s : 0;
  }
  
  public final int g() {
    return this.s;
  }
  
  public final String getName() {
    return this.c.b;
  }
  
  public final int h() {
    if (this.m == 0L)
      return 0; 
    int i = lm0.M.get(1);
    int j = lm0.M.get(3);
    Calendar calendar = lm0.N;
    calendar.setTimeInMillis(this.m);
    return (i == calendar.get(1) && j == calendar.get(3)) ? this.r : 0;
  }
  
  public final int hashCode() {
    qn1 qn11 = this.c;
    return (qn11 != null) ? qn11.hashCode() : super.hashCode();
  }
  
  public final int i() {
    return this.r;
  }
  
  public final int j() {
    if (this.m == 0L)
      return 0; 
    int i = lm0.M.get(1);
    Calendar calendar = lm0.N;
    calendar.setTimeInMillis(this.m);
    return (i == calendar.get(1)) ? this.t : 0;
  }
  
  public final int k() {
    return this.t;
  }
  
  public final int l() {
    return this.q % 1000;
  }
  
  public final String m(int paramInt) {
    String str1 = this.c.c;
    String str2 = this.f;
    return n(paramInt, this.p, str1, this.j, str2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\km0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */