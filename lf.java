import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.Purchase;
import in.krosbits.musicolet.IapActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.nativex.NativeLibx;
import java.util.ArrayList;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.json.JSONObject;

public final class lf {
  public static final lf p = new lf();
  
  public ef a;
  
  public Runnable b;
  
  public boolean c;
  
  public int d;
  
  public final Object e;
  
  public Purchase f;
  
  public Purchase g;
  
  public Purchase h;
  
  public Purchase i;
  
  public ta1 j;
  
  public ta1 k;
  
  public ta1 l;
  
  public sa1 m;
  
  public sa1 n;
  
  public boolean o;
  
  public lf() {
    new Handler(Looper.getMainLooper());
    this.c = false;
    this.d = 0;
    this.e = new Object();
  }
  
  public static void a(lf paramlf, int paramInt) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{lf}, name=paramlf} */
    try {
      ef ef1 = paramlf.a;
      if (ef1 != null && ef1.x()) {
        if (paramInt == 0) {
          paramlf.k = null;
          paramlf.j = null;
        } else {
          paramlf.l = null;
          paramlf.n = null;
          paramlf.m = null;
        } 
        paramlf.g();
        StringBuilder stringBuilder = new StringBuilder();
        this("BCW:cpcl(");
        stringBuilder.append(paramInt);
        stringBuilder.append(")>w");
        stringBuilder.append(paramlf.n());
        n21.F(stringBuilder.toString());
        ArrayList<jb1> arrayList = new ArrayList();
        this();
        if (paramInt == 0) {
          for (String str : (String[])MyApplication.a0) {
            j01 j01 = new j01();
            this(6, false);
            j01.c = str;
            if (paramInt == 0) {
              str = "inapp";
            } else {
              str = "subs";
            } 
            j01.e = str;
            arrayList.add(j01.b());
          } 
        } else {
          String str;
          j01 j01 = new j01();
          this(6, false);
          j01.c = MyApplication.a1;
          if (paramInt == 0) {
            str = "inapp";
          } else {
            str = "subs";
          } 
          j01.e = str;
          arrayList.add(j01.b());
        } 
        ib1 ib1 = new ib1();
        super();
        ib1.a(arrayList);
        if (ib1.a != null) {
          ib1 ib11 = new ib1();
          super();
          ib11.a = ib1.a;
          hf hf = new hf();
          this(paramlf, paramInt);
          ef1.d(ib11, hf);
        } else {
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this("Product list must be set to a non empty list.");
          throw illegalArgumentException;
        } 
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        this("BCW:cpcl>NR:");
        stringBuilder.append(ef1);
        n21.F(stringBuilder.toString());
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{lf}, name=paramlf} */
  }
  
  public final void b(int paramInt1, int paramInt2) {
    /* monitor enter ThisExpression{ObjectType{lf}} */
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this("BCW:cpsp>(");
      stringBuilder.append(paramInt2);
      stringBuilder.append(")>");
      stringBuilder.append(paramInt1);
      n21.F(stringBuilder.toString());
      ef ef1 = this.a;
      if (ef1 != null) {
        String str;
        g();
        if (paramInt2 == 0) {
          str = "inapp";
        } else {
          str = "subs";
        } 
        gf gf = new gf();
        this(paramInt1, paramInt2, this);
        cc2 cc2 = new cc2();
        this(ef1, gf, str);
        vi2 vi2 = new vi2();
        this(26, ef1, gf);
        if (ef.g(cc2, 30000L, vi2, ef1.l(), ef1.f()) == null) {
          qf qf = ef1.o();
          ef1.A(25, 9, qf);
          yg2 yg2 = ch2.c;
          gf.a(qf, th2.g);
        } 
      } else {
        stringBuilder = new StringBuilder();
        this("BCW:cpsp>nl(");
        stringBuilder.append(paramInt2);
        stringBuilder.append(")>");
        stringBuilder.append(paramInt1);
        n21.F(stringBuilder.toString());
      } 
    } finally {
      Exception exception;
    } 
    m();
    /* monitor exit ThisExpression{ObjectType{lf}} */
  }
  
  public final void c() {
    n21.F("BCW:caf>s");
    ef ef1 = this.a;
    if (ef1 != null)
      ef1.b(); 
    this.a = null;
    this.b = null;
    synchronized (this.e) {
      this.d = 0;
      this.h = null;
      this.f = null;
      this.i = null;
      this.g = null;
      this.o = false;
      return;
    } 
  }
  
  public final void d() {
    synchronized (this.e) {
      this.d--;
      return;
    } 
  }
  
  public final String e() {
    String str2 = null;
    String str1 = null;
    try {
      Purchase purchase = this.h;
      if (purchase != null)
        return purchase.a(); 
      purchase = this.i;
      if (purchase != null)
        return purchase.a(); 
      boolean bool = ws2.l;
      String str = GMDx.ZipPqfmndJA;
      if (bool) {
        String str3 = NativeLibx.a4(0);
        JSONObject jSONObject = new JSONObject();
        this(str3);
        str = jSONObject.optString(str);
        return str1;
      } 
      str1 = str2;
    } finally {
      str1 = null;
    } 
    return str1;
  }
  
  public final long f() {
    try {
      Purchase purchase = this.h;
      if (purchase != null)
        return purchase.c.optLong("purchaseTime"); 
      purchase = this.i;
      if (purchase != null)
        return purchase.c.optLong("purchaseTime"); 
      if (ws2.l) {
        String str = NativeLibx.a4(0);
        JSONObject jSONObject = new JSONObject();
        this(str);
        return jSONObject.optLong("purchaseTime");
      } 
      if (ws2.m) {
        String str = NativeLibx.a4(1);
        JSONObject jSONObject = new JSONObject();
        this(str);
        return jSONObject.optLong("purchaseTime");
      } 
    } finally {
      Exception exception;
    } 
    return 0L;
  }
  
  public final void g() {
    synchronized (this.e) {
      this.d++;
      return;
    } 
  }
  
  public final void h() {
    int i = n();
    StringBuilder stringBuilder = new StringBuilder("BCW:mca>");
    stringBuilder.append(this.c);
    stringBuilder.append(">");
    stringBuilder.append(i);
    n21.F(stringBuilder.toString());
    if (!this.c && i <= 0) {
      n21.F("BCW:mca>s");
      c();
    } 
  }
  
  public final void i() {
    StringBuilder stringBuilder = new StringBuilder("BCW:obsd>");
    stringBuilder.append(this.c);
    stringBuilder.append(">");
    stringBuilder.append(n());
    n21.F(stringBuilder.toString());
    c();
  }
  
  public final void j(qf paramqf) {
    int i = paramqf.a;
    ef ef1 = this.a;
    StringBuilder stringBuilder = ga1.k(i, "BCW:bsf>", ">");
    stringBuilder.append(n());
    stringBuilder.append(">");
    stringBuilder.append(ef1);
    n21.F(stringBuilder.toString());
    if (i == 0 && ef1 != null) {
      qf qf1;
      boolean bool1 = ef1.x();
      boolean bool = false;
      if (bool1) {
        MyApplication.g = true;
        n21.F("BCW:bsf>IPs");
      } else {
        MyApplication.g = false;
        n21.F("BCW:bsf>NR");
      } 
      if (!ef1.v()) {
        qf1 = ij2.j;
        if (qf1.a != 0) {
          ef1.A(2, 5, qf1);
        } else {
          try {
            i = xi2.a;
            ef1.q(xi2.c(5, on2.c));
          } finally {
            Exception exception = null;
          } 
        } 
      } else {
        qf1 = ij2.a;
        if (ef1.k) {
          qf1 = ij2.i;
        } else {
          qf1 = ij2.l;
        } 
        if (qf1.a != 0) {
          i = xi2.a;
          try {
            bn2 bn2 = cn2.s();
            ln2 ln2 = mn2.q();
            i = qf1.a;
            ln2.b();
            mn2.p((mn2)ln2.c, i);
            String str = qf1.c;
            ln2.b();
            mn2.s((mn2)ln2.c, str);
            ln2.c(9);
            bn2.c(ln2);
            bn2.e(5);
            tn2 tn2 = un2.p();
            tn2.b();
            un2.q((un2)tn2.c, 2);
            un2 un2 = (un2)tn2.a();
            bn2.b();
            cn2.x((cn2)bn2.c, un2);
            cn2 cn2 = (cn2)bn2.a();
          } catch (Exception exception) {
            ph2.i("BillingLogger", "Unable to create logging payload", exception);
            exception = null;
          } 
          ef1.p((cn2)exception);
        } else {
          i = xi2.a;
          try {
            dn2 dn2 = kn2.q();
            dn2.b();
            kn2.p((kn2)dn2.c, 5);
            tn2 tn2 = un2.p();
            tn2.b();
            un2.q((un2)tn2.c, 2);
            un2 un2 = (un2)tn2.a();
            dn2.b();
            kn2.t((kn2)dn2.c, un2);
            kn2 kn2 = (kn2)dn2.a();
          } catch (Exception exception) {
            ph2.i("BillingLogger", "Unable to create logging payload", exception);
            exception = null;
          } 
          ef1.q((kn2)exception);
        } 
      } 
      if (qf1.a == 0)
        bool = true; 
      MyApplication.h = bool;
      StringBuilder stringBuilder1 = new StringBuilder("BCW:bsf>SBs>");
      stringBuilder1.append(MyApplication.h);
      n21.F(stringBuilder1.toString());
      Runnable runnable = this.b;
      if (runnable != null) {
        if (bool1)
          runnable.run(); 
        this.b = null;
        return;
      } 
      m();
      return;
    } 
    n21.F("BCW:bsf>NO");
    m();
    h();
  }
  
  public final void k(qf paramqf) {
    int i = paramqf.a;
    StringBuilder stringBuilder = new StringBuilder("BCW:pUR>");
    stringBuilder.append(i);
    n21.F(stringBuilder.toString());
    l(new y2(1, 2, this));
  }
  
  public final void l(Runnable paramRunnable) {
    /* monitor enter ThisExpression{ObjectType{lf}} */
    try {
      if (this.a == null) {
        Context context = MyApplication.i.getApplicationContext();
        df df = new df();
        this(context);
        df.c = this;
        zb0 zb0 = new zb0();
        this(6);
        df.a = zb0;
        this.a = df.a();
      } 
    } finally {}
    if (this.a.x()) {
      paramRunnable.run();
    } else {
      this.b = paramRunnable;
      this.a.e(this);
    } 
    /* monitor exit ThisExpression{ObjectType{lf}} */
  }
  
  public final void m() {
    int j = n();
    boolean bool = false;
    int i = j;
    if (j < 0)
      i = 0; 
    if (i != 0) {
      i = bool;
    } else if (this.h != null || this.i != null || ws2.U()) {
      i = 2;
    } else if (this.f != null || this.g != null) {
      i = 3;
    } else {
      i = 1;
    } 
    IapActivity iapActivity = IapActivity.c0;
    if (iapActivity != null)
      try {
        ah0 ah0 = new ah0();
        this(i);
        return;
      } finally {
        iapActivity = null;
      }  
  }
  
  public final int n() {
    synchronized (this.e) {
      return this.d;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */