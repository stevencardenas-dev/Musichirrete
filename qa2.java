import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class qa2 implements me0, ne0 {
  public final LinkedList e;
  
  public final he0 f;
  
  public final m5 g;
  
  public final j01 h;
  
  public final HashSet i;
  
  public final HashMap j;
  
  public final int k;
  
  public final cb2 l;
  
  public boolean m;
  
  public final ArrayList n;
  
  public sp o;
  
  public int p;
  
  public final oe0 q;
  
  public qa2(oe0 paramoe0, je0 paramje0) {
    String str;
    this.q = paramoe0;
    this.e = new LinkedList();
    this.i = new HashSet();
    this.j = new HashMap<Object, Object>();
    this.n = new ArrayList();
    this.o = null;
    this.p = 0;
    Looper looper = paramoe0.o.getLooper();
    p01 p01 = paramje0.a();
    m2 m2 = new m2((d9)p01.c, (String)p01.e, (String)p01.f);
    m92 m92 = (m92)paramje0.d.c;
    n21.m(m92);
    j5 j5 = paramje0.e;
    he0 he01 = m92.e(paramje0.a, looper, m2, j5, this, this);
    gh1 gh1 = paramje0.c;
    if (gh1 == null || !(he01 instanceof yc)) {
      str = paramje0.b;
      if (str != null && he01 instanceof yc)
        he01.s = str; 
    } else {
      he01.t = (gh1)str;
    } 
    this.f = he01;
    this.g = paramje0.f;
    this.h = new j01(21);
    this.k = paramje0.h;
    if (he01.q()) {
      Context context = paramoe0.g;
      cl cl = paramoe0.o;
      p01 p011 = paramje0.a();
      this.l = new cb2(context, cl, new m2((d9)p011.c, (String)p011.e, (String)p011.f));
      return;
    } 
    this.l = null;
  }
  
  public final void a() {
    he0 he01 = this.f;
    oe0 oe01 = this.q;
    n21.i(oe01.o);
    this.o = null;
    i(sp.h);
    if (this.m) {
      cl cl = oe01.o;
      m5 m51 = this.g;
      cl.removeMessages(11, m51);
      oe01.o.removeMessages(9, m51);
      this.m = false;
    } 
    Iterator iterator = this.j.values().iterator();
    while (iterator.hasNext()) {
      of of = ((bb2)iterator.next()).a;
      if (j((u70[])of.c) != null) {
        iterator.remove();
        continue;
      } 
      try {
        du2 du2 = new du2();
        this();
        a42 a42 = (a42)((tk)of.d).c;
        a42.getClass();
        nv2 nv2 = (nv2)he01;
        qd2 qd2 = (qd2)nv2.i();
        n5 n5 = g92.g0();
        mg2 mg2 = ((pg2)a42.c).k;
        Parcel parcel2 = qd2.o();
        mh2.c(parcel2, mg2);
        mh2.b(parcel2, n5);
        qd2.p0(parcel2, 18);
        qd2 = (qd2)nv2.i();
        n5 = g92.g0();
        Parcel parcel1 = qd2.o();
        mh2.b(parcel1, n5);
        qd2.p0(parcel1, 17);
        du2.g(null);
      } catch (DeadObjectException deadObjectException) {
        m(3);
        he01.c("DeadObjectException thrown while calling register listener method.");
        break;
      } catch (RuntimeException runtimeException) {
        Log.e("GoogleApiManager", "Failed to register listener on re-connection.", runtimeException);
        iterator.remove();
      } catch (RemoteException remoteException) {
        Log.e("GoogleApiManager", "Failed to register listener on re-connection.", (Throwable)remoteException);
        iterator.remove();
      } 
    } 
    d();
    h();
  }
  
  public final void b(int paramInt) {
    SparseIntArray sparseIntArray;
    Iterator<bb2> iterator;
    n21.i(this.q.o);
    this.o = null;
    this.m = true;
    String str = this.f.a;
    j01 j011 = this.h;
    j011.getClass();
    StringBuilder stringBuilder = new StringBuilder("The connection to Google Play services was lost");
    if (paramInt == 1) {
      stringBuilder.append(" due to service disconnection.");
    } else if (paramInt == 3) {
      stringBuilder.append(" due to dead object exception.");
    } 
    if (str != null) {
      stringBuilder.append(" Last reason for disconnect: ");
      stringBuilder.append(str);
    } 
    j011.I(true, new Status(20, stringBuilder.toString(), null, null));
    null = this.g;
    oe0 oe01 = this.q;
    cl cl = oe01.o;
    cl.sendMessageDelayed(Message.obtain(cl, 9, null), 5000L);
    cl = oe01.o;
    cl.sendMessageDelayed(Message.obtain(cl, 11, null), 120000L);
    synchronized ((SparseIntArray)oe01.i.c) {
      sparseIntArray.clear();
      iterator = this.j.values().iterator();
      while (iterator.hasNext())
        ((bb2)iterator.next()).getClass(); 
      return;
    } 
  }
  
  public final boolean c(sp paramsp) {
    synchronized (oe0.s) {
      this.q.getClass();
      return false;
    } 
  }
  
  public final void d() {
    LinkedList<?> linkedList = this.e;
    ArrayList<za2> arrayList = new ArrayList(linkedList);
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      za2 za2 = arrayList.get(b);
      if (!this.f.m())
        break; 
      if (e(za2))
        linkedList.remove(za2); 
    } 
  }
  
  public final boolean e(za2 paramza2) {
    String str1;
    he0 he01;
    StringBuilder stringBuilder1;
    if (paramza2 == null) {
      j01 j011 = this.h;
      he01 = this.f;
      paramza2.e(j011, he01.q());
      try {
        paramza2.f(this);
        return true;
      } catch (DeadObjectException null) {
        m(1);
        he01.c("DeadObjectException thrown while running ApiCallRunner.");
        return true;
      } 
    } 
    u70 u70 = j(deadObjectException.a(this));
    if (u70 == null) {
      j01 j011 = this.h;
      he01 = this.f;
      deadObjectException.e(j011, he01.q());
      try {
        deadObjectException.f(this);
        return true;
      } catch (DeadObjectException deadObjectException) {
        m(1);
        he01.c("DeadObjectException thrown while running ApiCallRunner.");
        return true;
      } 
    } 
    String str3 = this.f.getClass().getName();
    String str2 = ((u70)he01).b;
    long l = he01.e();
    StringBuilder stringBuilder2 = new StringBuilder(str3.length() + 53 + String.valueOf(str2).length() + 2 + String.valueOf(l).length() + 2);
    x41.v(stringBuilder2, str3, " could not execute call because it requires feature (", str2, ", ");
    stringBuilder2.append(l);
    stringBuilder2.append(").");
    Log.w("GoogleApiManager", stringBuilder2.toString());
    oe0 oe01 = this.q;
    if (oe01.p && deadObjectException.b(this)) {
      Message message;
      ra2 ra2 = new ra2(this.g, (u70)he01);
      ArrayList<ra2> arrayList = this.n;
      int i = arrayList.indexOf(ra2);
      if (i >= 0) {
        ra2 = arrayList.get(i);
        oe01.o.removeMessages(15, ra2);
        message = Message.obtain(oe01.o, 15, ra2);
        oe01.o.sendMessageDelayed(message, 5000L);
      } else {
        arrayList.add(message);
        Message message1 = Message.obtain(oe01.o, 15, message);
        oe01.o.sendMessageDelayed(message1, 5000L);
        message = Message.obtain(oe01.o, 16, message);
        oe01.o.sendMessageDelayed(message, 120000L);
        sp sp1 = new sp(2, null, null);
        if (!c(sp1)) {
          if (oe01.f(sp1, this.k)) {
            str1 = ((u70)he01).b;
            l = he01.e();
            stringBuilder1 = new StringBuilder(String.valueOf(str1).length() + 55 + String.valueOf(l).length());
            stringBuilder1.append("Notification displayed for missing feature: ");
            stringBuilder1.append(str1);
            stringBuilder1.append(", version: ");
            stringBuilder1.append(l);
            Log.w("GoogleApiManager", stringBuilder1.toString());
          } 
        } else {
          str1 = ((u70)stringBuilder1).b;
          l = stringBuilder1.e();
          stringBuilder1 = new StringBuilder(String.valueOf(str1).length() + 61 + String.valueOf(l).length());
          stringBuilder1.append("A dialog should be displayed for missing feature: ");
          stringBuilder1.append(str1);
          stringBuilder1.append(", version: ");
          stringBuilder1.append(l);
          Log.w("GoogleApiManager", stringBuilder1.toString());
        } 
      } 
      return false;
    } 
    str1.d(new u02((u70)stringBuilder1));
    return true;
  }
  
  public final void f(Status paramStatus, Exception paramException, boolean paramBoolean) {
    boolean bool1;
    n21.i(this.q.o);
    boolean bool2 = true;
    if (paramStatus != null) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    if (paramException != null)
      bool2 = false; 
    if (bool1 != bool2) {
      Iterator<za2> iterator = this.e.iterator();
      while (iterator.hasNext()) {
        za2 za2 = iterator.next();
        if (!paramBoolean || za2.a == 2) {
          if (paramStatus != null) {
            za2.c(paramStatus);
          } else {
            za2.d(paramException);
          } 
          iterator.remove();
        } 
      } 
      return;
    } 
    l0.l("Status XOR exception should be null");
  }
  
  public final void g(Status paramStatus) {
    n21.i(this.q.o);
    f(paramStatus, null, false);
  }
  
  public final void h() {
    oe0 oe01 = this.q;
    cl cl = oe01.o;
    m5 m51 = this.g;
    cl.removeMessages(12, m51);
    cl = oe01.o;
    cl.sendMessageDelayed(cl.obtainMessage(12, m51), oe01.b);
  }
  
  public final void i(sp paramsp) {
    HashSet hashSet = this.i;
    Iterator iterator = hashSet.iterator();
    if (iterator.hasNext()) {
      if (iterator.next() == null) {
        if (z51.g(paramsp, sp.h)) {
          he0 he01 = this.f;
          if (!he01.m() || he01.b == null) {
            l0.f("Failed to connect when checking package");
            return;
          } 
        } 
        throw null;
      } 
      tp.b();
      return;
    } 
    hashSet.clear();
  }
  
  public final u70 j(u70[] paramArrayOfu70) {
    if (paramArrayOfu70 != null && paramArrayOfu70.length != 0) {
      u70[] arrayOfU701;
      gn2 gn2 = this.f.w;
      if (gn2 == null) {
        gn2 = null;
      } else {
        arrayOfU701 = gn2.c;
      } 
      boolean bool = false;
      u70[] arrayOfU702 = arrayOfU701;
      if (arrayOfU701 == null)
        arrayOfU702 = new u70[0]; 
      zm1 zm1 = new zm1(arrayOfU702.length);
      byte b;
      for (b = 0; b < arrayOfU702.length; b++) {
        u70 u701 = arrayOfU702[b];
        zm1.put(u701.b, Long.valueOf(u701.e()));
      } 
      int i = paramArrayOfu70.length;
      for (b = bool; b < i; b++) {
        u70 u701 = paramArrayOfu70[b];
        Long long_ = (Long)zm1.get(u701.b);
        if (long_ == null || long_.longValue() < u701.e())
          return u701; 
      } 
    } 
    return null;
  }
  
  public final void k(sp paramsp) {
    n21.i(this.q.o);
    he0 he01 = this.f;
    String str1 = he01.getClass().getName();
    String str2 = String.valueOf(paramsp);
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 25 + str2.length());
    stringBuilder.append("onSignInFailed for ");
    stringBuilder.append(str1);
    stringBuilder.append(" with ");
    stringBuilder.append(str2);
    str1 = stringBuilder.toString();
    he01.c(str1);
    l(paramsp, null);
  }
  
  public final void l(sp paramsp, RuntimeException paramRuntimeException) {
    SparseIntArray sparseIntArray;
    LinkedList linkedList;
    oe0 oe01 = this.q;
    n21.i(oe01.o);
    cb2 cb21 = this.l;
    if (cb21 != null) {
      vm1 vm1 = cb21.k;
      if (vm1 != null)
        vm1.b(); 
    } 
    n21.i(this.q.o);
    this.o = null;
    synchronized ((SparseIntArray)oe01.i.c) {
      cl cl;
      sparseIntArray.clear();
      i(paramsp);
      if (this.f instanceof qb2 && paramsp.c != 24) {
        oe01.c = true;
        cl cl1 = oe01.o;
        cl1.sendMessageDelayed(cl1.obtainMessage(19), 300000L);
      } 
      int i = paramsp.c;
      if (i == 4) {
        g(oe0.r);
        return;
      } 
      if (i == 25) {
        g(oe0.c(this.g, paramsp));
        return;
      } 
      linkedList = this.e;
      if (linkedList.isEmpty()) {
        this.o = paramsp;
        return;
      } 
      if (paramRuntimeException != null) {
        n21.i(oe01.o);
        f(null, paramRuntimeException, false);
        return;
      } 
      boolean bool = oe01.p;
      m5 m51 = this.g;
      if (bool) {
        f(oe0.c(m51, paramsp), null, true);
        if (!linkedList.isEmpty() && !c(paramsp) && !oe01.f(paramsp, this.k)) {
          if (paramsp.c == 18)
            this.m = true; 
          if (this.m) {
            cl = oe01.o;
            cl.sendMessageDelayed(Message.obtain(cl, 9, m51), 5000L);
            return;
          } 
          g(oe0.c(m51, (sp)cl));
        } 
        return;
      } 
      g(oe0.c(m51, (sp)cl));
      return;
    } 
  }
  
  public final void m(int paramInt) {
    oe0 oe01 = this.q;
    cl cl = oe01.o;
    if (Looper.myLooper() == cl.getLooper()) {
      b(paramInt);
      return;
    } 
    sd sd = new sd(paramInt, 5, this);
    oe01.o.post(sd);
  }
  
  public final void n(za2 paramza2) {
    n21.i(this.q.o);
    boolean bool = this.f.m();
    LinkedList<za2> linkedList = this.e;
    if (bool) {
      if (e(paramza2)) {
        h();
        return;
      } 
      linkedList.add(paramza2);
      return;
    } 
    linkedList.add(paramza2);
    sp sp1 = this.o;
    if (sp1 != null && sp1.c != 0 && sp1.e != null) {
      l(sp1, null);
      return;
    } 
    q();
  }
  
  public final void o(sp paramsp) {
    l(paramsp, null);
  }
  
  public final void p() {
    oe0 oe01 = this.q;
    n21.i(oe01.o);
    Status status = oe0.q;
    g(status);
    j01 j011 = this.h;
    byte b = 0;
    j011.I(false, status);
    po0[] arrayOfPo0 = (po0[])this.j.keySet().toArray((Object[])new po0[0]);
    int i = arrayOfPo0.length;
    while (b < i) {
      n(new ib2(arrayOfPo0[b], new nt1()));
      b++;
    } 
    i(new sp(4, null, null));
    if (this.f.m()) {
      yi1 yi1 = new yi1(15, new a42(3, this));
      oe01.o.post(yi1);
    } 
  }
  
  public final void q() {
    oe0 oe01 = this.q;
    n21.i(oe01.o);
    he0 he01 = this.f;
    if (!he01.m()) {
      he0 he02 = he01;
      if (!he02.n()) {
        String str1;
        String str2;
        try {
          int i = oe01.i.H(oe01.g, he01);
          if (i != 0) {
            sp sp1 = new sp();
            this(i, null, null);
            str1 = he01.getClass().getName();
            str2 = sp1.toString();
            int j = str1.length();
            i = str2.length();
            StringBuilder stringBuilder = new StringBuilder();
            this(j + 35 + i);
            stringBuilder.append("The service for ");
            stringBuilder.append(str1);
            stringBuilder.append(" is not available: ");
            stringBuilder.append(str2);
            Log.w("GoogleApiManager", stringBuilder.toString());
            l(sp1, null);
            return;
          } 
        } catch (IllegalStateException illegalStateException) {}
        sa2 sa2 = new sa2((oe0)str1, (he0)str2, this.g);
        if (str2.q()) {
          cb2 cb21 = this.l;
          n21.m(cb21);
          vm1 vm1 = cb21.k;
          if (vm1 != null)
            vm1.b(); 
          m2 m2 = cb21.j;
          m2.f = Integer.valueOf(System.identityHashCode(cb21));
          la2 la2 = cb21.h;
          Context context = cb21.f;
          Handler handler = cb21.g;
          cb21.k = (vm1)la2.e(context, handler.getLooper(), m2, m2.e, cb21, cb21);
          cb21.l = sa2;
          Set set = cb21.i;
          if (set == null || set.isEmpty()) {
            handler.post(new yi1(cb21));
          } else {
            vm1 vm11 = cb21.k;
            vm11.getClass();
            vm11.j = new gh1(vm11);
            vm11.t(2, null);
          } 
        } 
        try {
          ((yc)illegalStateException).j = sa2;
          illegalStateException.t(2, null);
          return;
        } catch (SecurityException securityException) {
          l(new sp(10, null, null), securityException);
          return;
        } 
      } 
    } 
  }
  
  public final void u() {
    oe0 oe01 = this.q;
    cl cl = oe01.o;
    if (Looper.myLooper() == cl.getLooper()) {
      a();
      return;
    } 
    yi1 yi1 = new yi1(14, this);
    oe01.o.post(yi1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */