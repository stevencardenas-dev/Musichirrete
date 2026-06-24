import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

public final class sp2 {
  public static final rp0 d = new rp0("ApplicationAnalyticsUtils", null);
  
  public static final String e = "22.3.1";
  
  public final String a;
  
  public final Map b;
  
  public final Map c;
  
  public sp2(String paramString, Bundle paramBundle) {
    this.a = paramString;
    this.b = ws2.v0("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", paramBundle);
    this.c = ws2.v0("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", paramBundle);
  }
  
  public final oq2 a(op2 paramop2, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual b : (Lop2;)Lnq2;
    //   5: astore #4
    //   7: aload #4
    //   9: invokevirtual c : ()Liq2;
    //   12: invokestatic m : (Liq2;)Lhq2;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield c : Ljava/util/Map;
    //   20: astore #5
    //   22: aload #5
    //   24: ifnull -> 76
    //   27: iload_2
    //   28: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   31: astore #6
    //   33: aload #5
    //   35: aload #6
    //   37: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   42: ifne -> 48
    //   45: goto -> 76
    //   48: aload #5
    //   50: aload #6
    //   52: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast java/lang/Integer
    //   60: astore #5
    //   62: aload #5
    //   64: invokestatic m : (Ljava/lang/Object;)V
    //   67: aload #5
    //   69: invokevirtual intValue : ()I
    //   72: istore_3
    //   73: goto -> 82
    //   76: iload_2
    //   77: sipush #10000
    //   80: iadd
    //   81: istore_3
    //   82: aload_1
    //   83: invokevirtual a : ()V
    //   86: aload_1
    //   87: getfield c : Lpv2;
    //   90: checkcast iq2
    //   93: iload_3
    //   94: invokevirtual r : (I)V
    //   97: aload_0
    //   98: getfield b : Ljava/util/Map;
    //   101: astore #5
    //   103: aload #5
    //   105: ifnull -> 157
    //   108: iload_2
    //   109: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   112: astore #6
    //   114: aload #5
    //   116: aload #6
    //   118: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   123: ifne -> 129
    //   126: goto -> 157
    //   129: aload #5
    //   131: aload #6
    //   133: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   138: checkcast java/lang/Integer
    //   141: astore #5
    //   143: aload #5
    //   145: invokestatic m : (Ljava/lang/Object;)V
    //   148: aload #5
    //   150: invokevirtual intValue : ()I
    //   153: istore_2
    //   154: goto -> 163
    //   157: wide iinc #2 10000
    //   163: aload_1
    //   164: invokevirtual a : ()V
    //   167: aload_1
    //   168: getfield c : Lpv2;
    //   171: checkcast iq2
    //   174: iload_2
    //   175: invokevirtual s : (I)V
    //   178: aload #4
    //   180: aload_1
    //   181: invokevirtual b : ()Lpv2;
    //   184: checkcast iq2
    //   187: invokevirtual d : (Liq2;)V
    //   190: aload #4
    //   192: invokevirtual b : ()Lpv2;
    //   195: checkcast oq2
    //   198: areturn
  }
  
  public final nq2 b(op2 paramop2) {
    nq2 nq2 = oq2.m();
    long l = paramop2.d;
    nq2.a();
    ((oq2)nq2.c).o(l);
    int i = paramop2.e;
    paramop2.e = i + 1;
    nq2.a();
    ((oq2)nq2.c).u(i);
    String str1 = paramop2.c;
    if (str1 != null) {
      nq2.a();
      ((oq2)nq2.c).t(str1);
    } 
    gt2 gt2 = ht2.l();
    if (!TextUtils.isEmpty(paramop2.h)) {
      String str = paramop2.h;
      nq2.a();
      ((oq2)nq2.c).p(str);
      str = paramop2.h;
      gt2.a();
      ((ht2)gt2.c).m(str);
    } 
    if (!TextUtils.isEmpty(paramop2.i)) {
      String str = paramop2.i;
      gt2.a();
      ((ht2)gt2.c).n(str);
    } 
    if (!TextUtils.isEmpty(paramop2.j)) {
      String str = paramop2.j;
      gt2.a();
      ((ht2)gt2.c).o(str);
    } 
    if (!TextUtils.isEmpty(paramop2.k)) {
      String str = paramop2.k;
      gt2.a();
      ((ht2)gt2.c).p(str);
    } 
    if (!TextUtils.isEmpty(paramop2.l)) {
      String str = paramop2.l;
      gt2.a();
      ((ht2)gt2.c).q(str);
    } 
    if (!TextUtils.isEmpty(paramop2.m)) {
      String str = paramop2.m;
      gt2.a();
      ((ht2)gt2.c).r(str);
    } 
    int j = paramop2.n;
    boolean bool = true;
    if (j != 1) {
      i = 3;
      if (j != 2)
        if (j != 3) {
          i = 5;
          if (j != 4)
            if (j != 5) {
              i = 1;
            } else {
              i = 6;
            }  
        } else {
          i = 4;
        }  
    } else {
      i = 2;
    } 
    gt2.a();
    ((ht2)gt2.c).s(i);
    ht2 ht2 = (ht2)gt2.b();
    nq2.a();
    ((oq2)nq2.c).z(ht2);
    eq2 eq2 = fq2.l();
    eq2.a();
    ((fq2)eq2.c).n(e);
    eq2.a();
    ((fq2)eq2.c).m(this.a);
    fq2 fq2 = (fq2)eq2.b();
    nq2.a();
    ((oq2)nq2.c).x(fq2);
    hq2 hq2 = iq2.l();
    if (paramop2.b != null) {
      jr2 jr2 = kr2.l();
      String str = paramop2.b;
      jr2.a();
      ((kr2)jr2.c).m(str);
      kr2 kr2 = (kr2)jr2.b();
      hq2.a();
      ((iq2)hq2.c).o(kr2);
    } 
    hq2.a();
    ((iq2)hq2.c).p(false);
    String str2 = paramop2.f;
    if (str2 != null) {
      try {
        String str3 = str2.replace("-", "");
        String str4 = str3.substring(0, Math.min(16, str3.length()));
        BigInteger bigInteger = new BigInteger();
        this(str4, 16);
        l = bigInteger.longValue();
      } catch (NumberFormatException numberFormatException) {
        rp0 rp01 = d;
        Log.w(rp01.a, rp01.c("receiverSessionId %s is not valid for hash", new Object[] { str2 }), numberFormatException);
        l = 0L;
      } 
      hq2.a();
      ((iq2)hq2.c).q(l);
    } 
    i = paramop2.g;
    hq2.a();
    ((iq2)hq2.c).t(i);
    if (paramop2.a.g != 2)
      bool = false; 
    hq2.a();
    ((iq2)hq2.c).u(bool);
    bool = paramop2.o;
    hq2.a();
    ((iq2)hq2.c).x(bool);
    nq2.a();
    ((oq2)nq2.c).v((iq2)hq2.b());
    return nq2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */