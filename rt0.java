import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class rt0 {
  public final rp0 a = new rp0("MediaQueue", null);
  
  public long b;
  
  public final nf1 c;
  
  public ArrayList d;
  
  public final SparseIntArray e;
  
  public final wn2 f;
  
  public final ArrayList g;
  
  public final ArrayDeque h;
  
  public final cl i;
  
  public final qg j;
  
  public BasePendingResult k;
  
  public BasePendingResult l;
  
  public final Set m = Collections.synchronizedSet(new HashSet());
  
  public rt0(nf1 paramnf1) {
    this.c = paramnf1;
    Math.max(20, 1);
    this.d = new ArrayList();
    this.e = new SparseIntArray();
    this.g = new ArrayList();
    this.h = new ArrayDeque(20);
    this.i = new cl(Looper.getMainLooper(), 6);
    this.j = new qg(2, this);
    paramnf1.o(new zk(1, this));
    this.f = new wn2(this);
    this.b = e();
    b();
  }
  
  public final void a() {
    f();
    this.d.clear();
    this.e.clear();
    this.f.evictAll();
    this.g.clear();
    this.i.removeCallbacks(this.j);
    this.h.clear();
    BasePendingResult basePendingResult = this.l;
    if (basePendingResult != null) {
      basePendingResult.a();
      this.l = null;
    } 
    basePendingResult = this.k;
    if (basePendingResult != null) {
      basePendingResult.a();
      this.k = null;
    } 
    h();
    g();
  }
  
  public final void b() {
    n21.j();
    if (this.b != 0L) {
      BasePendingResult basePendingResult = this.l;
      if (basePendingResult == null) {
        nf2 nf2;
        hd2 hd2;
        if (basePendingResult != null) {
          basePendingResult.a();
          this.l = null;
        } 
        basePendingResult = this.k;
        if (basePendingResult != null) {
          basePendingResult.a();
          this.k = null;
        } 
        nf1 nf11 = this.c;
        nf11.getClass();
        n21.j();
        if (!nf11.v()) {
          nf2 = nf1.u();
        } else {
          hd2 = new hd2((nf1)nf2, 2);
          nf1.w(hd2);
        } 
        this.l = hd2;
        hd2.f(new oo2(this, 1));
      } 
    } 
  }
  
  public final void d() {
    Set set = this.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      Iterator iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        return;
      } 
    } finally {}
    if (exception.next() == null)
      throw null; 
    Exception exception = new ClassCastException();
    super();
    throw exception;
  }
  
  public final long e() {
    kw0 kw0 = this.c.d();
    if (kw0 != null) {
      int i;
      MediaInfo mediaInfo = kw0.b;
      if (mediaInfo == null) {
        i = -1;
      } else {
        i = mediaInfo.c;
      } 
      int k = kw0.g;
      int m = kw0.h;
      int j = kw0.n;
      if (k != 1)
        return kw0.c; 
      if (m != 1)
        if (m != 2) {
          if (m != 3)
            return 0L; 
        } else {
          return (i == 2) ? kw0.c : 0L;
        }  
      if (j != 0)
        return kw0.c; 
    } 
    return 0L;
  }
  
  public final void f() {
    Set set = this.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      Iterator iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        return;
      } 
    } finally {}
    if (exception.next() == null)
      throw null; 
    Exception exception = new ClassCastException();
    super();
    throw exception;
  }
  
  public final void g() {
    Set set = this.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      Iterator iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        return;
      } 
    } finally {}
    if (exception.next() == null)
      throw null; 
    Exception exception = new ClassCastException();
    super();
    throw exception;
  }
  
  public final void h() {
    Set set = this.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      Iterator iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        return;
      } 
    } finally {}
    if (exception.next() == null)
      throw null; 
    Exception exception = new ClassCastException();
    super();
    throw exception;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */