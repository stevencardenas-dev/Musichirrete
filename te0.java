import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class te0 implements aj1, z50, d41 {
  public static final String q = qp0.j("GreedyScheduler");
  
  public final Context b;
  
  public final HashMap c = new HashMap<Object, Object>();
  
  public final wx e;
  
  public boolean f;
  
  public final Object g = new Object();
  
  public final j01 h = new j01(new c4(4));
  
  public final ma1 i;
  
  public final j01 j;
  
  public final ip k;
  
  public final HashMap l = new HashMap<Object, Object>();
  
  public Boolean m;
  
  public final bv0 n;
  
  public final n2 o;
  
  public final n2 p;
  
  public te0(Context paramContext, ip paramip, cn paramcn, ma1 paramma1, j01 paramj01, n2 paramn2) {
    this.b = paramContext;
    w9 w9 = paramip.g;
    this.e = new wx(this, w9, paramip.d);
    this.p = new n2(w9, paramj01);
    this.o = paramn2;
    this.n = new bv0(paramcn);
    this.k = paramip;
    this.i = paramma1;
    this.j = paramj01;
  }
  
  public final void a(String paramString) {
    String str = q;
    if (this.m == null)
      this.m = Boolean.valueOf(ka1.a(this.b, this.k)); 
    if (!this.m.booleanValue()) {
      qp0.h().i(str, YbNJ.hDz);
      return;
    } 
    if (!this.f) {
      this.i.a(this);
      this.f = true;
    } 
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder("Cancelling work ID ");
    stringBuilder.append(paramString);
    qp0.b(str, stringBuilder.toString());
    wx wx1 = this.e;
    if (wx1 != null) {
      Runnable runnable = (Runnable)wx1.d.remove(paramString);
      if (runnable != null)
        wx1.b.a.removeCallbacks(runnable); 
    } 
    j01 j011 = this.h;
    j011.getClass();
    paramString.getClass();
    synchronized (j011.e) {
      List list = ((c4)j011.c).f(paramString);
      for (Object null : list) {
        this.p.l((fp1)null);
        j011 = this.j;
        j011.getClass();
        j011.D((fp1)null, -512);
      } 
      return;
    } 
  }
  
  public final void b(y72 paramy72, lr paramlr) {
    fp1 fp1;
    n72 n72 = qv.p(paramy72);
    boolean bool = paramlr instanceof jr;
    j01 j011 = this.j;
    n2 n21 = this.p;
    String str = q;
    j01 j012 = this.h;
    if (bool) {
      if (!j012.h(n72)) {
        qp0 qp0 = qp0.h();
        StringBuilder stringBuilder = new StringBuilder("Constraints met: Scheduling work ID ");
        stringBuilder.append(n72);
        qp0.b(str, stringBuilder.toString());
        fp1 = j012.E(n72);
        n21.K(fp1);
        j011.getClass();
        j011.C(fp1, null);
        return;
      } 
    } else {
      qp0 qp0 = qp0.h();
      StringBuilder stringBuilder = new StringBuilder("Constraints not met: Cancelling work ID ");
      stringBuilder.append(n72);
      qp0.b(str, stringBuilder.toString());
      fp1 fp11 = j012.y(n72);
      if (fp11 != null) {
        n21.l(fp11);
        int i = ((kr)fp1).a;
        j011.getClass();
        j011.D(fp11, i);
      } 
    } 
  }
  
  public final void c(y72... paramVarArgs) {
    if (this.m == null)
      this.m = Boolean.valueOf(ka1.a(this.b, this.k)); 
    if (!this.m.booleanValue()) {
      qp0.h().i(q, "Ignoring schedule request in a secondary process");
      return;
    } 
    if (!this.f) {
      this.i.a(this);
      this.f = true;
    } 
    HashSet<y72> hashSet = new HashSet();
    HashSet<String> hashSet1 = new HashSet();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      y72 y721 = paramVarArgs[b];
      n72 n72 = qv.p(y721);
      if (!this.h.h(n72)) {
        se0 se0;
        Object object1 = this.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          n72 n721 = qv.p(y721);
          se0 se01 = (se0)this.l.get(n721);
          se0 = se01;
          if (se01 == null) {
            se0 = new se0();
            int j = y721.k;
            this.k.d.getClass();
            this(j, System.currentTimeMillis());
            this.l.put(n721, se0);
          } 
        } finally {}
        long l1 = se0.b;
        long l2 = Math.max(y721.k - se0.a - 5, 0);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        l1 = Math.max(y721.a(), l2 * 30000L + l1);
        this.k.d.getClass();
        l2 = System.currentTimeMillis();
        if (y721.b == o72.b)
          if (l2 < l1) {
            object1 = this.e;
            if (object1 != null) {
              w9 w9 = ((wx)object1).b;
              HashMap<String, Runnable> hashMap = ((wx)object1).d;
              Runnable runnable = (Runnable)hashMap.remove(y721.a);
              if (runnable != null)
                w9.a.removeCallbacks(runnable); 
              runnable = new vi2(object1, y721, 7, false);
              hashMap.put(y721.a, runnable);
              ((wx)object1).c.getClass();
              l2 = System.currentTimeMillis();
              w9.a.postDelayed(runnable, l1 - l2);
            } 
          } else if (!ui0.c(hr.j, y721.j)) {
            String str;
            hr hr = y721.j;
            if (hr.d) {
              qp0 qp0 = qp0.h();
              str = q;
              object1 = new StringBuilder("Ignoring ");
              object1.append(y721);
              object1.append(". Requires device idle.");
              qp0.b(str, object1.toString());
            } else if (!((hr)str).i.isEmpty()) {
              object1 = qp0.h();
              str = q;
              StringBuilder stringBuilder = new StringBuilder("Ignoring ");
              stringBuilder.append(y721);
              stringBuilder.append(zpEN.oHxkkmyPhPZ);
              object1.b(str, stringBuilder.toString());
            } else {
              hashSet.add(y721);
              hashSet1.add(y721.a);
            } 
          } else if (!this.h.h(qv.p(y721))) {
            qp0 qp0 = qp0.h();
            String str = q;
            object1 = new StringBuilder("Starting work for ");
            object1.append(y721.a);
            qp0.b(str, object1.toString());
            j01 j011 = this.h;
            j011.getClass();
            fp1 fp1 = j011.E(qv.p(y721));
            this.p.K(fp1);
            j011 = this.j;
            j011.getClass();
            j011.C(fp1, null);
          }  
      } 
    } 
    Object object = this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (!hashSet.isEmpty()) {
        String str2 = TextUtils.join(xveccWbRzqx.xGesNaM, hashSet1);
        qp0 qp0 = qp0.h();
        String str1 = q;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Starting tracking for ");
        stringBuilder.append(str2);
        qp0.b(str1, stringBuilder.toString());
        for (y72 y721 : hashSet) {
          n72 n72 = qv.p(y721);
          if (!this.c.containsKey(n72)) {
            bp1 bp1 = e72.a(this.n, y721, (rs)this.o.e, this);
            this.c.put(n72, bp1);
          } 
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void d(n72 paramn72, boolean paramBoolean) {
    fp1 fp1 = this.h.y(paramn72);
    if (fp1 != null)
      this.p.l(fp1); 
    synchronized (this.g) {
      vj0 vj0 = (vj0)this.c.remove(paramn72);
      if (vj0 != null) {
        qp0 qp0 = qp0.h();
        null = q;
        StringBuilder stringBuilder = new StringBuilder("Stopping tracking for ");
        stringBuilder.append(paramn72);
        qp0.b((String)null, stringBuilder.toString());
        vj0.c(null);
      } 
      if (!paramBoolean)
        synchronized (this.g) {
          this.l.remove(paramn72);
          return;
        }  
      return;
    } 
  }
  
  public final boolean e() {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\te0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */