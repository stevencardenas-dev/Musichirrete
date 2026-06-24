import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.utils.SgV.YbNJ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public final class lb0 {
  public final eb0 A;
  
  public final fb0 B;
  
  public l2 C;
  
  public l2 D;
  
  public l2 E;
  
  public ArrayDeque F;
  
  public boolean G;
  
  public boolean H;
  
  public boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public ArrayList L;
  
  public ArrayList M;
  
  public ArrayList N;
  
  public ob0 O;
  
  public final e3 P;
  
  public final ArrayList a = new ArrayList();
  
  public boolean b;
  
  public final n2 c = new n2(3);
  
  public ArrayList d = new ArrayList();
  
  public ArrayList e;
  
  public final ab0 f = new ab0(this);
  
  public b41 g;
  
  public lb h = null;
  
  public boolean i = false;
  
  public final l90 j = new l90(this);
  
  public final AtomicInteger k = new AtomicInteger();
  
  public final Map l = Collections.synchronizedMap(new HashMap<Object, Object>());
  
  public final Map m = Collections.synchronizedMap(new HashMap<Object, Object>());
  
  public final ArrayList n;
  
  public final g7 o;
  
  public final CopyOnWriteArrayList p;
  
  public final bb0 q;
  
  public final bb0 r;
  
  public final bb0 s;
  
  public final bb0 t;
  
  public final db0 u;
  
  public int v;
  
  public wa0 w;
  
  public qz1 x;
  
  public ua0 y;
  
  public ua0 z;
  
  public lb0() {
    Collections.synchronizedMap(new HashMap<Object, Object>());
    this.n = new ArrayList();
    this.o = new g7(this);
    this.p = new CopyOnWriteArrayList();
    this.q = new bb0(this, 0);
    this.r = new bb0(this, 1);
    this.s = new bb0(this, 2);
    this.t = new bb0(this, 3);
    this.u = new db0(this);
    this.v = -1;
    this.A = new eb0(this);
    this.B = (fb0)new Object();
    this.F = new ArrayDeque();
    this.P = new e3(14, this);
  }
  
  public static HashSet G(lb paramlb) {
    HashSet<ua0> hashSet = new HashSet();
    for (byte b = 0; b < paramlb.a.size(); b++) {
      ua0 ua01 = ((vb0)paramlb.a.get(b)).b;
      if (ua01 != null && paramlb.g)
        hashSet.add(ua01); 
    } 
    return hashSet;
  }
  
  public static boolean M(int paramInt) {
    return Log.isLoggable("FragmentManager", paramInt);
  }
  
  public static boolean N(ua0 paramua0) {
    paramua0.getClass();
    ArrayList<Object> arrayList = paramua0.y.c.u();
    int i = arrayList.size();
    boolean bool = false;
    byte b = 0;
    while (b < i) {
      ua0 ua01 = (ua0)arrayList.get(b);
      b++;
      ua01 = ua01;
      boolean bool1 = bool;
      if (ua01 != null)
        bool1 = N(ua01); 
      bool = bool1;
      if (bool1)
        return true; 
    } 
    return false;
  }
  
  public static boolean P(ua0 paramua0) {
    return (paramua0 == null || (paramua0.H && (paramua0.w == null || P(paramua0.z))));
  }
  
  public static boolean Q(ua0 paramua0) {
    if (paramua0 != null) {
      lb0 lb01 = paramua0.w;
      if (paramua0 != lb01.z || !Q(lb01.y))
        return false; 
    } 
    return true;
  }
  
  public static void g0(ua0 paramua0) {
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder("show: ");
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramua0.D) {
      paramua0.D = false;
      paramua0.O ^= 0x1;
    } 
  }
  
  public final void A(lb paramlb, boolean paramBoolean) {
    if (paramBoolean && (this.w == null || this.J))
      return; 
    y(paramBoolean);
    lb lb1 = this.h;
    if (lb1 != null) {
      lb1.s = false;
      lb1.e();
      if (M(3)) {
        StringBuilder stringBuilder = new StringBuilder("Reversing mTransitioningOp ");
        stringBuilder.append(this.h);
        stringBuilder.append(" as part of execSingleAction for action ");
        stringBuilder.append(paramlb);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      this.h.g(false, false);
      this.h.a(this.L, this.M);
      ArrayList<Object> arrayList = this.h.a;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        ua0 ua01 = (ua0)arrayList.get(i);
        int k = i + 1;
        ua01 = ((vb0)ua01).b;
        i = k;
        if (ua01 != null) {
          ua01.p = false;
          i = k;
        } 
      } 
      this.h = null;
    } 
    paramlb.a(this.L, this.M);
    this.b = true;
    try {
      Y(this.L, this.M);
      d();
      j0();
      if (this.K) {
        this.K = false;
        h0();
      } 
      return;
    } finally {
      d();
    } 
  }
  
  public final void B(ArrayList<lb> paramArrayList1, ArrayList<Boolean> paramArrayList2, int paramInt1, int paramInt2) {
    ua0 ua01;
    IllegalArgumentException illegalArgumentException;
    n2 n21 = this.c;
    ArrayList<Object> arrayList1 = this.n;
    boolean bool1 = ((lb)paramArrayList1.get(paramInt1)).p;
    ArrayList arrayList = this.N;
    if (arrayList == null) {
      this.N = new ArrayList();
    } else {
      arrayList.clear();
    } 
    this.N.addAll(n21.v());
    Object object = this.z;
    int j = paramInt1;
    boolean bool = false;
    while (j < paramInt2) {
      boolean bool2;
      lb lb1 = paramArrayList1.get(j);
      boolean bool3 = ((Boolean)paramArrayList2.get(j)).booleanValue();
      ArrayList<ua0> arrayList2 = this.N;
      if (!bool3) {
        ArrayList arrayList3 = lb1.a;
        int k = 0;
        boolean bool4 = bool;
        while (true)
          k++; 
        k = j;
        Object object1 = object;
        bool2 = bool4;
      } else {
        bool3 = bool1;
        ArrayList<vb0> arrayList3 = lb1.a;
        int k = arrayList3.size() - 1;
        while (true) {
          Object object1 = object;
          bool1 = bool3;
          int m = j;
          bool2 = bool;
          if (k >= 0) {
            object1 = arrayList3.get(k);
            m = ((vb0)object1).a;
            if (m != 1)
              if (m != 3) {
                switch (m) {
                  case 10:
                    ((vb0)object1).i = ((vb0)object1).h;
                    break;
                  case 9:
                    object = ((vb0)object1).b;
                    break;
                  case 8:
                    object = null;
                    break;
                  case 6:
                    arrayList2.add(((vb0)object1).b);
                    break;
                  case 7:
                    arrayList2.remove(((vb0)object1).b);
                    break;
                } 
                k--;
                continue;
              }  
          } 
          break;
        } 
      } 
      if (bool2 || lb1.g) {
        bool = true;
      } else {
        bool = false;
      } 
      continue;
      j = SYNTHETIC_LOCAL_VARIABLE_6 + 1;
      object = SYNTHETIC_LOCAL_VARIABLE_15;
    } 
    this.N.clear();
    if (!bool1 && this.v >= 1)
      for (int k = paramInt1; k < paramInt2; k++) {
        object = ((lb)paramArrayList1.get(k)).a;
        int m = object.size();
        j = 0;
        while (j < m) {
          ua0 ua02 = (ua0)object.get(j);
          int n = j + 1;
          ua02 = ((vb0)ua02).b;
          j = n;
          if (ua02 != null) {
            j = n;
            if (ua02.w != null) {
              n21.B(g(ua02));
              j = n;
            } 
          } 
        } 
      }  
    object = "Unknown cmd: ";
    j = paramInt1;
    while (j < paramInt2) {
      Object object1;
      lb lb1 = paramArrayList1.get(j);
      if (((Boolean)paramArrayList2.get(j)).booleanValue()) {
        lb1.d(-1);
        lb0 lb01 = lb1.r;
        ArrayList<vb0> arrayList2 = lb1.a;
        int k = arrayList2.size();
        int m = k - 1;
        while (true) {
          object1 = object;
          if (m >= 0) {
            object1 = arrayList2.get(m);
            ua0 ua02 = ((vb0)object1).b;
            if (ua02 != null) {
              if (ua02.N != null)
                (ua02.L()).a = true; 
              int n = lb1.f;
              k = 8194;
              char c = 'ခ';
              if (n != 4097) {
                k = c;
                if (n != 8194) {
                  k = 4100;
                  if (n != 8197) {
                    k = 4099;
                    if (n != 4099)
                      if (n != 4100) {
                        k = 0;
                      } else {
                        k = 8197;
                      }  
                  } 
                } 
              } 
              if (ua02.N != null || k != 0) {
                ua02.L();
                ua02.N.f = k;
              } 
              ua02.L();
              ua02.N.getClass();
            } 
            switch (((vb0)object1).a) {
              default:
                m60.n((String)object, ((vb0)object1).a);
                return;
              case 10:
                ((vb0)object1).i = ua02.S;
                lb01.d0(ua02, ((vb0)object1).h);
                break;
              case 9:
                lb01.e0(ua02);
                break;
              case 8:
                lb01.e0(null);
                break;
              case 7:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, true);
                lb01.h(ua02);
                break;
              case 6:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c(ua02);
                break;
              case 5:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, true);
                lb01.L(ua02);
                break;
              case 4:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.getClass();
                g0(ua02);
                break;
              case 3:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.a(ua02);
                break;
              case 1:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, true);
                lb01.X(ua02);
                break;
            } 
            m--;
            continue;
          } 
          break;
        } 
      } else {
        lb1.d(1);
        lb0 lb01 = lb1.r;
        ArrayList<vb0> arrayList2 = lb1.a;
        int k = arrayList2.size();
        byte b = 0;
        while (true) {
          object1 = object;
          if (b < k) {
            object1 = arrayList2.get(b);
            ua0 ua02 = ((vb0)object1).b;
            if (ua02 != null) {
              if (ua02.N != null)
                (ua02.L()).a = false; 
              int m = lb1.f;
              if (ua02.N != null || m != 0) {
                ua02.L();
                ua02.N.f = m;
              } 
              ua02.L();
              ua02.N.getClass();
            } 
            switch (((vb0)object1).a) {
              default:
                m60.n((String)object, ((vb0)object1).a);
                return;
              case 10:
                ((vb0)object1).h = ua02.S;
                lb01.d0(ua02, ((vb0)object1).i);
                break;
              case 9:
                lb01.e0(null);
                break;
              case 8:
                lb01.e0(ua02);
                break;
              case 7:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, false);
                lb01.c(ua02);
                break;
              case 6:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.h(ua02);
                break;
              case 5:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, false);
                g0(ua02);
                break;
              case 4:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.L(ua02);
                break;
              case 3:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.X(ua02);
                break;
              case 1:
                ua02.w0(((vb0)object1).d, ((vb0)object1).e, ((vb0)object1).f, ((vb0)object1).g);
                lb01.c0(ua02, false);
                lb01.a(ua02);
                break;
            } 
            b++;
            continue;
          } 
          break;
        } 
      } 
      j++;
      object = object1;
    } 
    bool1 = ((Boolean)paramArrayList2.get(paramInt2 - 1)).booleanValue();
    if (bool && !arrayList1.isEmpty()) {
      object = new LinkedHashSet();
      j = paramArrayList1.size();
      byte b = 0;
      while (b < j) {
        lb lb1 = (lb)paramArrayList1.get(b);
        b++;
        object.addAll(G(lb1));
      } 
      if (this.h == null) {
        j = arrayList1.size();
        b = 0;
        while (b < j) {
          Iterator<ua0> iterator1 = (Iterator<ua0>)arrayList1.get(b);
          b++;
          if (iterator1 == null) {
            iterator1 = object.iterator();
            if (!iterator1.hasNext())
              continue; 
            ua01 = iterator1.next();
            throw null;
          } 
          tp.b();
          return;
        } 
        j = arrayList1.size();
        b = 0;
        while (b < j) {
          Iterator<ua0> iterator1 = (Iterator<ua0>)arrayList1.get(b);
          b++;
          if (iterator1 == null) {
            iterator1 = object.iterator();
            if (!iterator1.hasNext())
              continue; 
            ua01 = iterator1.next();
            throw null;
          } 
          tp.b();
          return;
        } 
      } 
    } 
    int i;
    for (i = paramInt1; i < paramInt2; i++) {
      lb lb1 = ua01.get(i);
      if (bool1) {
        for (j = lb1.a.size() - 1; j >= 0; j--) {
          object = ((vb0)lb1.a.get(j)).b;
          if (object != null)
            g((ua0)object).k(); 
        } 
      } else {
        object = lb1.a;
        int k = object.size();
        j = 0;
        while (j < k) {
          lb1 = object.get(j);
          int m = j + 1;
          ua0 ua02 = ((vb0)lb1).b;
          j = m;
          if (ua02 != null) {
            g(ua02).k();
            j = m;
          } 
        } 
      } 
    } 
    R(this.v, true);
    i = paramInt1;
    Iterator<jx> iterator = f((ArrayList)ua01, i, paramInt2).iterator();
    while (true) {
      paramInt1 = i;
      if (iterator.hasNext()) {
        jx jx = iterator.next();
        jx.e = bool1;
        ArrayList arrayList2 = jx.b;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        try {
          jx.l();
          object = jx.b;
          ListIterator listIterator = object.listIterator(object.size());
          while (true) {
            if (listIterator.hasPrevious()) {
              object = listIterator.previous();
              go1 go1 = (go1)object;
              View view = go1.c.K;
              view.getClass();
              float f = view.getAlpha();
              paramInt1 = 4;
              if (f != 0.0F || view.getVisibility() != 0) {
                j = view.getVisibility();
                if (j != 0) {
                  if (j != 4)
                    if (j == 8) {
                      paramInt1 = 3;
                    } else {
                      illegalArgumentException = new IllegalArgumentException();
                      StringBuilder stringBuilder = new StringBuilder();
                      this("Unknown visibility ");
                      stringBuilder.append(j);
                      this(stringBuilder.toString());
                      throw illegalArgumentException;
                    }  
                } else {
                  paramInt1 = 2;
                } 
              } 
              if (go1.a == 2 && paramInt1 != 2)
                break; 
              continue;
            } 
            object = null;
            break;
          } 
        } finally {}
        object = object;
        jx.f = false;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        jx.e();
        continue;
      } 
      break;
    } 
    while (paramInt1 < paramInt2) {
      object = ua01.get(paramInt1);
      if (((Boolean)illegalArgumentException.get(paramInt1)).booleanValue() && ((lb)object).t >= 0)
        ((lb)object).t = -1; 
      if (((lb)object).q != null) {
        for (i = 0; i < ((lb)object).q.size(); i++)
          ((Runnable)((lb)object).q.get(i)).run(); 
        ((lb)object).q = null;
      } 
      paramInt1++;
    } 
    if (bool && arrayList1.size() > 0) {
      arrayList1.get(0).getClass();
      tp.b();
    } 
  }
  
  public final void C() {
    z(true);
    F();
  }
  
  public final ua0 D(int paramInt) {
    n2 n21 = this.c;
    ArrayList<ua0> arrayList = (ArrayList)n21.c;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      ua0 ua01 = arrayList.get(i);
      if (ua01 != null && ua01.A == paramInt)
        return ua01; 
    } 
    for (sb0 sb0 : ((HashMap)n21.e).values()) {
      if (sb0 != null) {
        ua0 ua01 = sb0.c;
        if (ua01.A == paramInt)
          return ua01; 
      } 
    } 
    return null;
  }
  
  public final ua0 E(String paramString) {
    n2 n21 = this.c;
    ArrayList<ua0> arrayList = (ArrayList)n21.c;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      ua0 ua01 = arrayList.get(i);
      if (ua01 != null && paramString.equals(ua01.C))
        return ua01; 
    } 
    for (sb0 sb0 : ((HashMap)n21.e).values()) {
      if (sb0 != null) {
        ua0 ua01 = sb0.c;
        if (paramString.equals(ua01.C))
          return ua01; 
      } 
    } 
    return null;
  }
  
  public final void F() {
    for (jx jx : e()) {
      if (jx.f) {
        if (M(2))
          Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations"); 
        jx.f = false;
        jx.e();
      } 
    } 
  }
  
  public final ua0 H(String paramString, Bundle paramBundle) {
    String str = paramBundle.getString(paramString);
    if (str == null)
      return null; 
    ua0 ua01 = this.c.q(str);
    if (ua01 != null)
      return ua01; 
    StringBuilder stringBuilder = new StringBuilder("Fragment no longer exists for key ");
    stringBuilder.append(paramString);
    stringBuilder.append(": unique id ");
    stringBuilder.append(str);
    i0(new IllegalStateException(stringBuilder.toString()));
    throw null;
  }
  
  public final ViewGroup I(ua0 paramua0) {
    ViewGroup viewGroup = paramua0.J;
    if (viewGroup != null)
      return viewGroup; 
    if (paramua0.B > 0 && this.x.L()) {
      View view = this.x.K(paramua0.B);
      if (view instanceof ViewGroup)
        return (ViewGroup)view; 
    } 
    return null;
  }
  
  public final eb0 J() {
    ua0 ua01 = this.y;
    return (ua01 != null) ? ua01.w.J() : this.A;
  }
  
  public final fb0 K() {
    ua0 ua01 = this.y;
    return (ua01 != null) ? ua01.w.K() : this.B;
  }
  
  public final void L(ua0 paramua0) {
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder("hide: ");
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramua0.D) {
      paramua0.D = true;
      paramua0.O = true ^ paramua0.O;
      f0(paramua0);
    } 
  }
  
  public final boolean O() {
    ua0 ua01 = this.y;
    return (ua01 == null) ? true : ((ua01.Y() && this.y.R().O()));
  }
  
  public final void R(int paramInt, boolean paramBoolean) {
    if (this.w != null || paramInt == -1) {
      if (paramBoolean || paramInt != this.v) {
        this.v = paramInt;
        n2 n21 = this.c;
        HashMap hashMap = (HashMap)n21.e;
        ArrayList<Object> arrayList = (ArrayList)n21.c;
        int i = arrayList.size();
        paramInt = 0;
        while (paramInt < i) {
          sb0 sb0 = (sb0)arrayList.get(paramInt);
          int j = paramInt + 1;
          sb0 = (sb0)hashMap.get(((ua0)sb0).h);
          paramInt = j;
          if (sb0 != null) {
            sb0.k();
            paramInt = j;
          } 
        } 
        for (sb0 sb0 : hashMap.values()) {
          if (sb0 != null) {
            sb0.k();
            ua0 ua01 = sb0.c;
            if (ua01.o && !ua01.a0())
              n21.C(sb0); 
          } 
        } 
        h0();
        if (this.G) {
          wa0 wa01 = this.w;
          if (wa01 != null && this.v == 7) {
            wa01.o.invalidateOptionsMenu();
            this.G = false;
          } 
        } 
      } 
      return;
    } 
    tp.f("No activity");
  }
  
  public final void S() {
    if (this.w != null) {
      this.H = false;
      this.I = false;
      this.O.g = false;
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null)
          ua01.y.S(); 
      } 
    } 
  }
  
  public final boolean T() {
    return U(-1, 0);
  }
  
  public final boolean U(int paramInt1, int paramInt2) {
    z(false);
    y(true);
    ua0 ua01 = this.z;
    if (ua01 != null && paramInt1 < 0 && ua01.O().T())
      return true; 
    boolean bool = V(this.L, this.M, paramInt1, paramInt2);
    if (bool) {
      this.b = true;
      try {
        Y(this.L, this.M);
      } finally {
        d();
      } 
    } 
    j0();
    if (this.K) {
      this.K = false;
      h0();
    } 
    ((HashMap)this.c.e).values().removeAll(Collections.singleton(null));
    return bool;
  }
  
  public final boolean V(ArrayList<lb> paramArrayList1, ArrayList<Boolean> paramArrayList2, int paramInt1, int paramInt2) {
    int i;
    if ((paramInt2 & 0x1) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    boolean bool = this.d.isEmpty();
    byte b = -1;
    if (bool) {
      paramInt2 = b;
    } else if (paramInt1 < 0) {
      if (i) {
        paramInt2 = 0;
      } else {
        paramInt2 = this.d.size() - 1;
      } 
    } else {
      for (paramInt2 = this.d.size() - 1; paramInt2 >= 0; paramInt2--) {
        lb lb1 = this.d.get(paramInt2);
        if (paramInt1 >= 0 && paramInt1 == lb1.t)
          break; 
      } 
      if (paramInt2 >= 0)
        if (i) {
          i = paramInt2;
          while (true) {
            paramInt2 = i;
            if (i > 0) {
              lb lb1 = this.d.get(i - 1);
              paramInt2 = i;
              if (paramInt1 >= 0) {
                paramInt2 = i;
                if (paramInt1 == lb1.t) {
                  i--;
                  continue;
                } 
              } 
            } 
            break;
          } 
        } else if (paramInt2 == this.d.size() - 1) {
          paramInt2 = b;
        } else {
          paramInt2++;
        }  
    } 
    if (paramInt2 < 0)
      return false; 
    for (paramInt1 = this.d.size() - 1; paramInt1 >= paramInt2; paramInt1--) {
      paramArrayList1.add(this.d.remove(paramInt1));
      paramArrayList2.add(Boolean.TRUE);
    } 
    return true;
  }
  
  public final void W(Bundle paramBundle, String paramString, ua0 paramua0) {
    if (paramua0.w == this) {
      paramBundle.putString(paramString, paramua0.h);
      return;
    } 
    i0(new IllegalStateException(x41.j("Fragment ", paramua0, " is not currently in the FragmentManager")));
    throw null;
  }
  
  public final void X(ua0 paramua0) {
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder("remove: ");
      stringBuilder.append(paramua0);
      stringBuilder.append(" nesting=");
      stringBuilder.append(paramua0.v);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    boolean bool = paramua0.a0();
    if (!paramua0.E || !bool) {
      n2 n21 = this.c;
      synchronized ((ArrayList)n21.c) {
        ((ArrayList)n21.c).remove(paramua0);
        paramua0.n = false;
        if (N(paramua0))
          this.G = true; 
        paramua0.o = true;
        f0(paramua0);
        return;
      } 
    } 
  }
  
  public final void Y(ArrayList paramArrayList1, ArrayList<Boolean> paramArrayList2) {
    if (!paramArrayList1.isEmpty()) {
      if (paramArrayList1.size() == paramArrayList2.size()) {
        int k = paramArrayList1.size();
        int i = 0;
        int j;
        for (j = 0; i < k; j = m) {
          int n = i;
          int m = j;
          if (!((lb)paramArrayList1.get(i)).p) {
            if (j != i)
              B(paramArrayList1, paramArrayList2, j, i); 
            j = i + 1;
            m = j;
            if (((Boolean)paramArrayList2.get(i)).booleanValue())
              while (true) {
                m = j;
                if (j < k) {
                  m = j;
                  if (((Boolean)paramArrayList2.get(j)).booleanValue()) {
                    m = j;
                    if (!((lb)paramArrayList1.get(j)).p) {
                      j++;
                      continue;
                    } 
                  } 
                } 
                break;
              }  
            B(paramArrayList1, paramArrayList2, i, m);
            n = m - 1;
          } 
          i = n + 1;
        } 
        if (j != k)
          B(paramArrayList1, paramArrayList2, j, k); 
        return;
      } 
      tp.f("Internal error with the back stack records");
      return;
    } 
  }
  
  public final void Z(Bundle paramBundle) {
    for (String str : paramBundle.keySet()) {
      if (str.startsWith("result_")) {
        Bundle bundle = paramBundle.getBundle(str);
        if (bundle != null) {
          bundle.setClassLoader(this.w.l.getClassLoader());
          str = str.substring(7);
          this.m.put(str, bundle);
        } 
      } 
    } 
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    for (String str : paramBundle.keySet()) {
      if (str.startsWith("fragment_")) {
        Bundle bundle = paramBundle.getBundle(str);
        if (bundle != null) {
          bundle.setClassLoader(this.w.l.getClassLoader());
          hashMap1.put(str.substring(9), bundle);
        } 
      } 
    } 
    n2 n21 = this.c;
    HashMap<Object, Object> hashMap2 = (HashMap)n21.f;
    HashMap hashMap = (HashMap)n21.e;
    hashMap2.clear();
    hashMap2.putAll(hashMap1);
    mb0 mb0 = (mb0)paramBundle.getParcelable("state");
    if (mb0 == null)
      return; 
    hashMap.clear();
    ArrayList<Object> arrayList = mb0.b;
    int j = arrayList.size();
    int i = 0;
    while (true) {
      sb0 sb0;
      g7 g71 = this.o;
      if (i < j) {
        Bundle bundle = (Bundle)arrayList.get(i);
        int m = i + 1;
        bundle = n21.I((String)bundle, null);
        i = m;
        if (bundle != null) {
          rb0 rb0 = (rb0)bundle.getParcelable("state");
          ob0 ob02 = this.O;
          String str1 = rb0.c;
          ua0 ua01 = (ua0)ob02.b.get(str1);
          if (ua01 != null) {
            if (M(2)) {
              StringBuilder stringBuilder = new StringBuilder("restoreSaveState: re-attaching retained ");
              stringBuilder.append(ua01);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            sb0 = new sb0(g71, n21, ua01, bundle);
          } else {
            ClassLoader classLoader = this.w.l.getClassLoader();
            eb0 eb01 = J();
            sb0 = new sb0(this.o, this.c, classLoader, eb01, bundle);
          } 
          ua01 = sb0.c;
          ua01.c = bundle;
          ua01.w = this;
          if (M(2)) {
            StringBuilder stringBuilder = new StringBuilder("restoreSaveState: active (");
            stringBuilder.append(ua01.h);
            stringBuilder.append("): ");
            stringBuilder.append(ua01);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          sb0.m(this.w.l.getClassLoader());
          n21.B(sb0);
          sb0.e = this.v;
          i = m;
        } 
        continue;
      } 
      ob0 ob01 = this.O;
      ob01.getClass();
      ArrayList<Object> arrayList3 = new ArrayList(ob01.b.values());
      int k = arrayList3.size();
      i = 0;
      while (i < k) {
        ua0 ua01 = (ua0)arrayList3.get(i);
        i++;
        ua01 = ua01;
        if (hashMap.get(ua01.h) != null)
          continue; 
        if (M(2)) {
          StringBuilder stringBuilder = new StringBuilder("Discarding retained Fragment ");
          stringBuilder.append(ua01);
          stringBuilder.append(" that was not found in the set of active Fragments ");
          stringBuilder.append(mb0.b);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.O.h(ua01);
        ua01.w = this;
        sb0 sb01 = new sb0((g7)sb0, n21, ua01);
        sb01.e = 1;
        sb01.k();
        ua01.o = true;
        sb01.k();
      } 
      ArrayList<HashMap> arrayList2 = mb0.c;
      ((ArrayList)n21.c).clear();
      if (arrayList2 != null) {
        k = arrayList2.size();
        i = 0;
        while (i < k) {
          hashMap = arrayList2.get(i);
          i++;
          String str1 = (String)hashMap;
          ua0 ua01 = n21.q(str1);
          if (ua01 != null) {
            if (M(2)) {
              StringBuilder stringBuilder = new StringBuilder("restoreSaveState: added (");
              stringBuilder.append(str1);
              stringBuilder.append("): ");
              stringBuilder.append(ua01);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            n21.f(ua01);
            continue;
          } 
          tp.f(x41.w("No instantiated fragment for (", str1, ")"));
          return;
        } 
      } 
      if (mb0.e != null) {
        this.d = new ArrayList(mb0.e.length);
        k = 0;
        while (true) {
          mb[] arrayOfMb = mb0.e;
          if (k < arrayOfMb.length) {
            mb mb = arrayOfMb[k];
            arrayList3 = mb.c;
            lb lb1 = new lb(this);
            int[] arrayOfInt = mb.b;
            i = 0;
            j = 0;
            while (true) {
              int m = i;
              if (m < arrayOfInt.length) {
                boolean bool;
                Object object = new Object();
                i = m + 1;
                ((vb0)object).a = arrayOfInt[m];
                if (M(2)) {
                  StringBuilder stringBuilder = new StringBuilder("Instantiate ");
                  stringBuilder.append(lb1);
                  stringBuilder.append(" op #");
                  stringBuilder.append(j);
                  stringBuilder.append(" base fragment #");
                  stringBuilder.append(arrayOfInt[i]);
                  Log.v("FragmentManager", stringBuilder.toString());
                } 
                ((vb0)object).h = pm0.values()[mb.e[j]];
                ((vb0)object).i = pm0.values()[mb.f[j]];
                if (arrayOfInt[i] != 0) {
                  bool = true;
                } else {
                  bool = false;
                } 
                ((vb0)object).c = bool;
                int i1 = arrayOfInt[m + 2];
                ((vb0)object).d = i1;
                int i2 = arrayOfInt[m + 3];
                ((vb0)object).e = i2;
                int n = arrayOfInt[m + 4];
                ((vb0)object).f = n;
                i = m + 6;
                m = arrayOfInt[m + 5];
                ((vb0)object).g = m;
                lb1.b = i1;
                lb1.c = i2;
                lb1.d = n;
                lb1.e = m;
                lb1.b((vb0)object);
                j++;
                continue;
              } 
              lb1.f = mb.g;
              lb1.i = mb.h;
              lb1.g = true;
              lb1.j = mb.j;
              lb1.k = mb.k;
              lb1.l = mb.l;
              lb1.m = mb.m;
              lb1.n = mb.n;
              lb1.o = mb.o;
              lb1.p = mb.p;
              lb1.t = mb.i;
              for (i = 0; i < arrayList3.size(); i++) {
                String str1 = (String)arrayList3.get(i);
                if (str1 != null)
                  ((vb0)lb1.a.get(i)).b = n21.q(str1); 
              } 
              lb1.d(1);
              if (M(2)) {
                StringBuilder stringBuilder = ga1.k(k, "restoreAllState: back stack #", " (index ");
                stringBuilder.append(lb1.t);
                stringBuilder.append("): ");
                stringBuilder.append(lb1);
                Log.v("FragmentManager", stringBuilder.toString());
                PrintWriter printWriter = new PrintWriter(new pp0());
                lb1.i("  ", printWriter, false);
                printWriter.close();
              } 
              break;
            } 
            this.d.add(lb1);
            k++;
            continue;
          } 
          break;
        } 
      } else {
        this.d = new ArrayList();
      } 
      this.k.set(mb0.f);
      String str = mb0.g;
      if (str != null) {
        ua0 ua01 = n21.q(str);
        this.z = ua01;
        r(ua01);
      } 
      ArrayList<String> arrayList1 = mb0.h;
      if (arrayList1 != null)
        for (i = 0; i < arrayList1.size(); i++) {
          String str1 = arrayList1.get(i);
          nb nb = mb0.i.get(i);
          this.l.put(str1, nb);
        }  
      this.F = new ArrayDeque(mb0.j);
      return;
    } 
  }
  
  public final sb0 a(ua0 paramua0) {
    String str = paramua0.R;
    if (str != null)
      ub0.c(paramua0, str); 
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder(RqlokDsQOju.VFWtBjguvDr);
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    sb0 sb0 = g(paramua0);
    paramua0.w = this;
    n2 n21 = this.c;
    n21.B(sb0);
    if (!paramua0.E) {
      n21.f(paramua0);
      paramua0.o = false;
      if (paramua0.K == null)
        paramua0.O = false; 
      if (N(paramua0))
        this.G = true; 
    } 
    return sb0;
  }
  
  public final Bundle a0() {
    Bundle bundle = new Bundle();
    F();
    w();
    z(true);
    this.H = true;
    this.O.g = true;
    n2 n21 = this.c;
    n21.getClass();
    HashMap hashMap1 = (HashMap)n21.e;
    ArrayList<String> arrayList = new ArrayList(hashMap1.size());
    for (sb0 sb0 : hashMap1.values()) {
      if (sb0 != null) {
        ua0 ua01 = sb0.c;
        n21.I(ua01.h, sb0.o());
        arrayList.add(ua01.h);
        if (M(2)) {
          StringBuilder stringBuilder = new StringBuilder("Saved state of ");
          stringBuilder.append(ua01);
          stringBuilder.append(": ");
          stringBuilder.append(ua01.c);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
      } 
    } 
    HashMap hashMap2 = (HashMap)this.c.f;
    if (hashMap2.isEmpty()) {
      if (M(2)) {
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return bundle;
      } 
    } else {
      byte b;
      n2 n22 = this.c;
      ArrayList arrayList1 = (ArrayList)n22.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
      try {
        boolean bool = ((ArrayList)n22.c).isEmpty();
        b = 0;
        if (bool) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
          n21 = null;
        } else {
          ArrayList<String> arrayList4 = new ArrayList();
          this(((ArrayList)n22.c).size());
          ArrayList<Object> arrayList5 = (ArrayList)n22.c;
          int k = arrayList5.size();
          int j = 0;
          while (j < k) {
            ua0 ua02 = (ua0)arrayList5.get(j);
            int m = j + 1;
            ua02 = ua02;
            arrayList4.add(ua02.h);
            j = m;
            if (M(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("saveAllState: adding fragment (");
              stringBuilder.append(ua02.h);
              stringBuilder.append("): ");
              stringBuilder.append(ua02);
              Log.v("FragmentManager", stringBuilder.toString());
              j = m;
            } 
          } 
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        } 
      } finally {}
      int i = this.d.size();
      if (i > 0) {
        mb[] arrayOfMb = new mb[i];
        byte b1 = b;
        while (true) {
          mb[] arrayOfMb1 = arrayOfMb;
          if (b1 < i) {
            arrayOfMb[b1] = new mb(this.d.get(b1));
            if (M(2)) {
              StringBuilder stringBuilder = ga1.k(b1, "saveAllState: adding back stack #", ": ");
              stringBuilder.append(this.d.get(b1));
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } else {
        arrayList1 = null;
      } 
      Object object = new Object();
      ((mb0)object).g = null;
      ArrayList arrayList2 = new ArrayList();
      ((mb0)object).h = arrayList2;
      ArrayList arrayList3 = new ArrayList();
      ((mb0)object).i = arrayList3;
      ((mb0)object).b = arrayList;
      ((mb0)object).c = (ArrayList)n21;
      ((mb0)object).e = (mb[])arrayList1;
      ((mb0)object).f = this.k.get();
      ua0 ua01 = this.z;
      if (ua01 != null)
        ((mb0)object).g = ua01.h; 
      arrayList2.addAll(this.l.keySet());
      arrayList3.addAll(this.l.values());
      ((mb0)object).j = new ArrayList(this.F);
      bundle.putParcelable("state", (Parcelable)object);
      for (String str : this.m.keySet())
        bundle.putBundle(x41.k("result_", str), (Bundle)this.m.get(str)); 
      for (String str : hashMap2.keySet())
        bundle.putBundle(x41.k("fragment_", str), (Bundle)hashMap2.get(str)); 
    } 
    return bundle;
  }
  
  public final void b(wa0 paramwa0, qz1 paramqz1, ua0 paramua0) {
    if (this.w == null) {
      boolean bool;
      this.w = paramwa0;
      this.x = paramqz1;
      this.y = paramua0;
      CopyOnWriteArrayList<gb0> copyOnWriteArrayList = this.p;
      if (paramua0 != null) {
        copyOnWriteArrayList.add(new gb0(paramua0));
      } else if (paramwa0 != null) {
        copyOnWriteArrayList.add(paramwa0);
      } 
      if (this.y != null)
        j0(); 
      if (paramwa0 != null) {
        wa0 wa02;
        b41 b411 = paramwa0.o.U();
        this.g = b411;
        if (paramua0 != null) {
          ua0 ua01 = paramua0;
        } else {
          wa02 = paramwa0;
        } 
        b411.getClass();
        l90 l901 = this.j;
        l901.getClass();
        wm0 wm0 = wa02.N();
        if ((pm0)wm0.i != pm0.b) {
          w31 w31 = new w31(l901, new x31(l901, wa02));
          l901.a.add(w31);
          w31.b(false);
          n2.h((b411.b()).c, w31);
          fm0 fm0 = new fm0(w31, b411, wm0);
          wm0.a(fm0);
          y31 y31 = new y31(wm0, fm0);
          l901.c.add(y31);
        } 
      } 
      if (paramua0 != null) {
        ob0 ob03 = paramua0.w.O;
        HashMap<String, ob0> hashMap = ob03.c;
        ob0 ob02 = (ob0)hashMap.get(paramua0.h);
        ob01 = ob02;
        if (ob02 == null) {
          ob01 = new ob0(ob03.e);
          hashMap.put(paramua0.h, ob01);
        } 
        this.O = ob01;
      } else if (ob01 != null) {
        k32 k32 = ((wa0)ob01).o.H();
        ft ft = ft.b;
        ft.getClass();
        n2 n21 = new n2(k32, ob0.h, ft);
        ll ll = ne1.a(ob0.class);
        String str = ll.b();
        if (str != null) {
          this.O = (ob0)n21.z(ll, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        } else {
          l0.l("Local and anonymous classes can not be ViewModels");
          return;
        } 
      } else {
        this.O = new ob0(false);
      } 
      ob0 ob01 = this.O;
      if (this.H || this.I) {
        bool = true;
      } else {
        bool = false;
      } 
      ob01.g = bool;
      this.c.g = ob01;
      wa0 wa01 = this.w;
      if (wa01 != null && paramua0 == null) {
        j01 j01 = wa01.h();
        j01.x("android:support:fragments", new jo(2, this));
        Bundle bundle = j01.g("android:support:fragments");
        if (bundle != null)
          Z(bundle); 
      } 
      wa01 = this.w;
      if (wa01 != null) {
        oo oo = wa01.o.l;
        if (paramua0 != null) {
          str = x41.n(new StringBuilder(), paramua0.h, ":");
        } else {
          str = "";
        } 
        String str = "FragmentManager:".concat(str);
        this.C = oo.c(str.concat("StartActivityForResult"), new g2(1), new cb0(this, 1));
        this.D = oo.c(str.concat("StartIntentSenderForResult"), new g2(3), new cb0(this, 2));
        this.E = oo.c(str.concat("RequestPermissions"), new g2(0), new cb0(this, 0));
      } 
      wa01 = this.w;
      if (wa01 != null) {
        x5 x5 = wa01.o;
        bb0 bb01 = this.q;
        bb01.getClass();
        x5.m.add(bb01);
      } 
      wa01 = this.w;
      if (wa01 != null) {
        x5 x5 = wa01.o;
        bb0 bb01 = this.r;
        bb01.getClass();
        x5.n.add(bb01);
      } 
      wa01 = this.w;
      if (wa01 != null) {
        x5 x5 = wa01.o;
        bb0 bb01 = this.s;
        bb01.getClass();
        x5.p.add(bb01);
      } 
      wa01 = this.w;
      if (wa01 != null) {
        x5 x5 = wa01.o;
        bb0 bb01 = this.t;
        bb01.getClass();
        x5.q.add(bb01);
      } 
      wa01 = this.w;
      if (wa01 != null && paramua0 == null) {
        x5 x5 = wa01.o;
        db0 db01 = this.u;
        db01.getClass();
        p01 p01 = x5.f;
        ((CopyOnWriteArrayList<db0>)p01.e).add(db01);
        ((Runnable)p01.c).run();
      } 
      return;
    } 
    tp.f("Already attached");
  }
  
  public final void b0() {
    ArrayList arrayList = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      if (this.a.size() == 1) {
        this.w.m.removeCallbacks(this.P);
        this.w.m.post(this.P);
        j0();
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
  }
  
  public final void c(ua0 paramua0) {
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder("attach: ");
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (paramua0.E) {
      paramua0.E = false;
      if (!paramua0.n) {
        this.c.f(paramua0);
        if (M(2)) {
          StringBuilder stringBuilder = new StringBuilder("add from attach: ");
          stringBuilder.append(paramua0);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        if (N(paramua0))
          this.G = true; 
      } 
    } 
  }
  
  public final void c0(ua0 paramua0, boolean paramBoolean) {
    ViewGroup viewGroup = I(paramua0);
    if (viewGroup != null && viewGroup instanceof ya0)
      ((ya0)viewGroup).setDrawDisappearingViewsLast(paramBoolean ^ true); 
  }
  
  public final void d() {
    this.b = false;
    this.M.clear();
    this.L.clear();
  }
  
  public final void d0(ua0 paramua0, pm0 parampm0) {
    String str = paramua0.h;
    if (paramua0 == this.c.q(str) && (paramua0.x == null || paramua0.w == this)) {
      paramua0.S = parampm0;
      return;
    } 
    tp.h("Fragment ", paramua0, " is not an active fragment of FragmentManager ", this);
  }
  
  public final HashSet e() {
    HashSet<Object> hashSet = new HashSet();
    ArrayList<Object> arrayList = this.c.t();
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      Object object = arrayList.get(i);
      int k = i + 1;
      ViewGroup viewGroup = ((sb0)object).c.J;
      i = k;
      if (viewGroup != null) {
        K().getClass();
        object = viewGroup.getTag(2131297520);
        if (object instanceof jx) {
          object = object;
        } else {
          object = new jx(viewGroup);
          viewGroup.setTag(2131297520, object);
        } 
        hashSet.add(object);
        i = k;
      } 
    } 
    return hashSet;
  }
  
  public final void e0(ua0 paramua0) {
    if (paramua0 != null) {
      String str = paramua0.h;
      if (paramua0 != this.c.q(str) || (paramua0.x != null && paramua0.w != this)) {
        tp.h(PwbbJfsdcHrAjW.ZRs, paramua0, jLnXOLx.MGMGeLHCG, this);
        return;
      } 
    } 
    ua0 ua01 = this.z;
    this.z = paramua0;
    r(ua01);
    r(this.z);
  }
  
  public final HashSet f(ArrayList paramArrayList, int paramInt1, int paramInt2) {
    HashSet<jx> hashSet = new HashSet();
    while (paramInt1 < paramInt2) {
      ArrayList<Object> arrayList = ((lb)paramArrayList.get(paramInt1)).a;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        ua0 ua01 = (ua0)arrayList.get(i);
        int k = i + 1;
        ua01 = ((vb0)ua01).b;
        i = k;
        if (ua01 != null) {
          ViewGroup viewGroup = ua01.J;
          i = k;
          if (viewGroup != null) {
            hashSet.add(jx.i(viewGroup, this));
            i = k;
          } 
        } 
      } 
      paramInt1++;
    } 
    return hashSet;
  }
  
  public final void f0(ua0 paramua0) {
    ViewGroup viewGroup = I(paramua0);
    if (viewGroup != null) {
      int i;
      int j;
      int k;
      int m;
      sa0 sa0 = paramua0.N;
      boolean bool = false;
      if (sa0 == null) {
        i = 0;
      } else {
        i = sa0.b;
      } 
      if (sa0 == null) {
        j = 0;
      } else {
        j = sa0.c;
      } 
      if (sa0 == null) {
        k = 0;
      } else {
        k = sa0.d;
      } 
      if (sa0 == null) {
        m = 0;
      } else {
        m = sa0.e;
      } 
      if (m + k + j + i > 0) {
        if (viewGroup.getTag(2131297960) == null)
          viewGroup.setTag(2131297960, paramua0); 
        ua0 ua01 = (ua0)viewGroup.getTag(2131297960);
        sa0 sa01 = paramua0.N;
        if (sa01 != null)
          bool = sa01.a; 
        if (ua01.N != null)
          (ua01.L()).a = bool; 
      } 
    } 
  }
  
  public final sb0 g(ua0 paramua0) {
    String str = paramua0.h;
    n2 n21 = this.c;
    sb0 sb02 = (sb0)((HashMap)n21.e).get(str);
    if (sb02 != null)
      return sb02; 
    sb0 sb01 = new sb0(this.o, n21, paramua0);
    sb01.m(this.w.l.getClassLoader());
    sb01.e = this.v;
    return sb01;
  }
  
  public final void h(ua0 paramua0) {
    if (M(2)) {
      StringBuilder stringBuilder = new StringBuilder("detach: ");
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    if (!paramua0.E) {
      paramua0.E = true;
      if (paramua0.n) {
        if (M(2)) {
          StringBuilder stringBuilder = new StringBuilder("remove from detach: ");
          stringBuilder.append(paramua0);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        n2 n21 = this.c;
        synchronized ((ArrayList)n21.c) {
          ((ArrayList)n21.c).remove(paramua0);
          paramua0.n = false;
          if (N(paramua0))
            this.G = true; 
          f0(paramua0);
          return;
        } 
      } 
    } 
  }
  
  public final void h0() {
    ArrayList<Object> arrayList = this.c.t();
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      sb0 sb0 = (sb0)arrayList.get(i);
      int k = i + 1;
      sb0 = sb0;
      ua0 ua01 = sb0.c;
      i = k;
      if (ua01.L) {
        if (this.b) {
          this.K = true;
          i = k;
          continue;
        } 
        ua01.L = false;
        sb0.k();
        i = k;
      } 
    } 
  }
  
  public final void i(boolean paramBoolean, Configuration paramConfiguration) {
    if (!paramBoolean || this.w == null) {
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null) {
          ua01.onConfigurationChanged(paramConfiguration);
          if (paramBoolean)
            ua01.y.i(true, paramConfiguration); 
        } 
      } 
      return;
    } 
    i0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
    throw null;
  }
  
  public final void i0(IllegalStateException paramIllegalStateException) {
    Log.e("FragmentManager", paramIllegalStateException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter printWriter = new PrintWriter(new pp0());
    wa0 wa01 = this.w;
    if (wa01 != null) {
      try {
        wa01.o.dump("  ", null, printWriter, new String[0]);
      } catch (Exception exception) {
        Log.e("FragmentManager", "Failed dumping state", exception);
      } 
    } else {
      try {
        v("  ", null, (PrintWriter)exception, new String[0]);
      } catch (Exception exception1) {
        Log.e("FragmentManager", "Failed dumping state", exception1);
      } 
    } 
    throw paramIllegalStateException;
  }
  
  public final boolean j() {
    if (this.v >= 1)
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null) {
          boolean bool;
          if (!ua01.D) {
            bool = ua01.y.j();
          } else {
            bool = false;
          } 
          if (bool)
            return true; 
        } 
      }  
    return false;
  }
  
  public final void j0() {
    byte b;
    boolean bool;
    ArrayList arrayList = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      boolean bool1 = this.a.isEmpty();
      bool = true;
      if (!bool1) {
        this.j.e(true);
        if (M(3)) {
          StringBuilder stringBuilder = new StringBuilder();
          this("FragmentManager ");
          stringBuilder.append(this);
          stringBuilder.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
          Log.d("FragmentManager", stringBuilder.toString());
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        return;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    int i = this.d.size();
    if (this.h != null) {
      b = 1;
    } else {
      b = 0;
    } 
    if (i + b <= 0 || !Q(this.y))
      bool = false; 
    if (M(3)) {
      StringBuilder stringBuilder = new StringBuilder("OnBackPressedCallback for FragmentManager ");
      stringBuilder.append(this);
      stringBuilder.append(" enabled state is ");
      stringBuilder.append(bool);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.j.e(bool);
  }
  
  public final boolean k() {
    int i = this.v;
    byte b = 0;
    if (i < 1)
      return false; 
    Iterator<ua0> iterator = this.c.v().iterator();
    ArrayList<ua0> arrayList = null;
    boolean bool = false;
    while (iterator.hasNext()) {
      ua0 ua01 = iterator.next();
      if (ua01 != null && P(ua01)) {
        boolean bool1;
        if (!ua01.D) {
          bool1 = ua01.y.k();
        } else {
          bool1 = false;
        } 
        if (bool1) {
          ArrayList<ua0> arrayList1 = arrayList;
          if (arrayList == null)
            arrayList1 = new ArrayList(); 
          arrayList1.add(ua01);
          bool = true;
          arrayList = arrayList1;
        } 
      } 
    } 
    if (this.e != null)
      while (b < this.e.size()) {
        ua0 ua01 = this.e.get(b);
        if (arrayList == null || !arrayList.contains(ua01))
          ua01.getClass(); 
        b++;
      }  
    this.e = arrayList;
    return bool;
  }
  
  public final void l() {
    boolean bool;
    this.J = true;
    z(true);
    w();
    wa0 wa02 = this.w;
    n2 n21 = this.c;
    if (wa02 != null) {
      bool = ((ob0)n21.g).f;
    } else {
      x5 x5 = wa02.l;
      if (x5 != null) {
        bool = x5.isChangingConfigurations() ^ true;
      } else {
        bool = true;
      } 
    } 
    byte b = 0;
    if (bool) {
      Iterator iterator = this.l.values().iterator();
      while (iterator.hasNext()) {
        ArrayList<Object> arrayList = ((nb)iterator.next()).b;
        int i = arrayList.size();
        byte b1 = 0;
        while (b1 < i) {
          String str = (String)arrayList.get(b1);
          b1++;
          str = str;
          ((ob0)n21.g).f(str, false);
        } 
      } 
    } 
    u(-1);
    wa0 wa01 = this.w;
    if (wa01 != null) {
      x5 x5 = wa01.o;
      bb0 bb01 = this.r;
      bb01.getClass();
      x5.n.remove(bb01);
    } 
    wa01 = this.w;
    if (wa01 != null) {
      x5 x5 = wa01.o;
      bb0 bb01 = this.q;
      bb01.getClass();
      x5.m.remove(bb01);
    } 
    wa01 = this.w;
    if (wa01 != null) {
      x5 x5 = wa01.o;
      bb0 bb01 = this.s;
      bb01.getClass();
      x5.p.remove(bb01);
    } 
    wa01 = this.w;
    if (wa01 != null) {
      x5 x5 = wa01.o;
      bb0 bb01 = this.t;
      bb01.getClass();
      x5.q.remove(bb01);
    } 
    wa01 = this.w;
    if (wa01 != null && this.y == null) {
      x5 x5 = wa01.o;
      db0 db01 = this.u;
      db01.getClass();
      p01 p01 = x5.f;
      ((CopyOnWriteArrayList)p01.e).remove(db01);
      if (((HashMap)p01.f).remove(db01) == null) {
        ((Runnable)p01.c).run();
      } else {
        tp.b();
      } 
    } 
    this.w = null;
    this.x = null;
    this.y = null;
    if (this.g != null) {
      l90 l901 = this.j;
      ArrayList<CopyOnWriteArrayList> arrayList = l901.a;
      CopyOnWriteArrayList copyOnWriteArrayList = l901.c;
      Iterator<AutoCloseable> iterator = copyOnWriteArrayList.iterator();
      iterator.getClass();
      while (iterator.hasNext()) {
        AutoCloseable autoCloseable = iterator.next();
        if (autoCloseable instanceof AutoCloseable) {
          autoCloseable.close();
          continue;
        } 
        if (autoCloseable instanceof java.util.concurrent.ExecutorService) {
          autoCloseable = autoCloseable;
          if (autoCloseable == ForkJoinPool.commonPool())
            continue; 
          bool = autoCloseable.isTerminated();
          if (!bool) {
            autoCloseable.shutdown();
            boolean bool1 = false;
            while (true) {
              boolean bool2 = bool;
              if (!bool2) {
                try {
                  bool = autoCloseable.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException interruptedException) {
                  bool = bool2;
                  if (!bool1) {
                    autoCloseable.shutdownNow();
                    bool1 = true;
                    bool = bool2;
                  } 
                } 
                continue;
              } 
              if (bool1)
                Thread.currentThread().interrupt(); 
            } 
          } 
          continue;
        } 
        if (autoCloseable instanceof TypedArray) {
          ((TypedArray)autoCloseable).recycle();
          continue;
        } 
        if (autoCloseable instanceof MediaMetadataRetriever) {
          ((MediaMetadataRetriever)autoCloseable).release();
          continue;
        } 
        if (autoCloseable instanceof MediaDrm) {
          ((MediaDrm)autoCloseable).release();
          continue;
        } 
        l0.k();
        return;
      } 
      copyOnWriteArrayList.clear();
      int i = arrayList.size();
      byte b1 = b;
      while (b1 < i) {
        copyOnWriteArrayList = arrayList.get(b1);
        b1++;
        ((w31)copyOnWriteArrayList).a();
      } 
      arrayList.clear();
      this.g = null;
    } 
    l2 l21 = this.C;
    if (l21 != null) {
      l21.T0();
      this.D.T0();
      this.E.T0();
    } 
  }
  
  public final void m(boolean paramBoolean) {
    if (!paramBoolean || this.w == null) {
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null) {
          ua01.I = true;
          if (paramBoolean)
            ua01.y.m(true); 
        } 
      } 
      return;
    } 
    i0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
    throw null;
  }
  
  public final void n(boolean paramBoolean) {
    if (!paramBoolean || this.w == null) {
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null && paramBoolean)
          ua01.y.n(true); 
      } 
      return;
    } 
    i0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
    throw null;
  }
  
  public final void o() {
    ArrayList<Object> arrayList = this.c.u();
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      ua0 ua01 = (ua0)arrayList.get(i);
      int k = i + 1;
      ua01 = ua01;
      i = k;
      if (ua01 != null) {
        ua01.Z();
        ua01.y.o();
        i = k;
      } 
    } 
  }
  
  public final boolean p() {
    if (this.v >= 1)
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null) {
          boolean bool;
          if (!ua01.D) {
            bool = ua01.y.p();
          } else {
            bool = false;
          } 
          if (bool)
            return true; 
        } 
      }  
    return false;
  }
  
  public final void q() {
    if (this.v >= 1)
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null && !ua01.D)
          ua01.y.q(); 
      }  
  }
  
  public final void r(ua0 paramua0) {
    if (paramua0 != null) {
      String str = paramua0.h;
      if (paramua0 == this.c.q(str)) {
        paramua0.w.getClass();
        boolean bool = Q(paramua0);
        Boolean bool1 = paramua0.m;
        if (bool1 == null || bool1.booleanValue() != bool) {
          paramua0.m = Boolean.valueOf(bool);
          lb0 lb01 = paramua0.y;
          lb01.j0();
          lb01.r(lb01.z);
        } 
      } 
    } 
  }
  
  public final void s(boolean paramBoolean) {
    if (!paramBoolean || this.w == null) {
      for (ua0 ua01 : this.c.v()) {
        if (ua01 != null && paramBoolean)
          ua01.y.s(true); 
      } 
      return;
    } 
    i0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
    throw null;
  }
  
  public final boolean t() {
    if (this.v < 1)
      return false; 
    Iterator<ua0> iterator = this.c.v().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      ua0 ua01 = iterator.next();
      if (ua01 != null && P(ua01)) {
        boolean bool1;
        if (!ua01.D) {
          bool1 = ua01.y.t();
        } else {
          bool1 = false;
        } 
        if (bool1)
          bool = true; 
      } 
    } 
    return bool;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    ua0 ua01 = this.y;
    if (ua01 != null) {
      stringBuilder.append(ua01.getClass().getSimpleName());
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this.y)));
      stringBuilder.append("}");
    } else {
      wa0 wa01 = this.w;
      if (wa01 != null) {
        stringBuilder.append(wa01.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this.w)));
        stringBuilder.append("}");
      } else {
        stringBuilder.append(jHxlGgUTadw.KrmYVXh);
      } 
    } 
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public final void u(int paramInt) {
    try {
      this.b = true;
      for (sb0 sb0 : ((HashMap)this.c.e).values()) {
        if (sb0 != null)
          sb0.e = paramInt; 
      } 
      R(paramInt, false);
      Iterator<jx> iterator = e().iterator();
      while (iterator.hasNext())
        ((jx)iterator.next()).h(); 
    } finally {
      Exception exception;
    } 
    this.b = false;
    z(true);
  }
  
  public final void v(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append("    ");
    String str1 = stringBuilder2.toString();
    n2 n21 = this.c;
    ArrayList<ua0> arrayList = (ArrayList)n21.c;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(paramString);
    stringBuilder3.append("    ");
    String str2 = stringBuilder3.toString();
    HashMap hashMap = (HashMap)n21.e;
    boolean bool = hashMap.isEmpty();
    byte b = 0;
    if (!bool) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      for (sb0 sb0 : hashMap.values()) {
        paramPrintWriter.print(paramString);
        if (sb0 != null) {
          int j;
          ua0 ua01 = sb0.c;
          paramPrintWriter.println(ua01);
          ua01.getClass();
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mFragmentId=#");
          paramPrintWriter.print(Integer.toHexString(ua01.A));
          paramPrintWriter.print(" mContainerId=#");
          paramPrintWriter.print(Integer.toHexString(ua01.B));
          paramPrintWriter.print(" mTag=");
          paramPrintWriter.println(ua01.C);
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mState=");
          paramPrintWriter.print(ua01.b);
          paramPrintWriter.print(" mWho=");
          paramPrintWriter.print(ua01.h);
          paramPrintWriter.print(" mBackStackNesting=");
          paramPrintWriter.println(ua01.v);
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mAdded=");
          paramPrintWriter.print(ua01.n);
          paramPrintWriter.print(" mRemoving=");
          paramPrintWriter.print(ua01.o);
          paramPrintWriter.print(" mFromLayout=");
          paramPrintWriter.print(ua01.q);
          paramPrintWriter.print(" mInLayout=");
          paramPrintWriter.println(ua01.r);
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mHidden=");
          paramPrintWriter.print(ua01.D);
          paramPrintWriter.print(YbNJ.PYCb);
          paramPrintWriter.print(ua01.E);
          paramPrintWriter.print(" mMenuVisible=");
          paramPrintWriter.print(ua01.H);
          paramPrintWriter.print(" mHasMenu=");
          paramPrintWriter.println(false);
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mRetainInstance=");
          paramPrintWriter.print(ua01.F);
          paramPrintWriter.print(" mUserVisibleHint=");
          paramPrintWriter.println(ua01.M);
          if (ua01.w != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mFragmentManager=");
            paramPrintWriter.println(ua01.w);
          } 
          if (ua01.x != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mHost=");
            paramPrintWriter.println(ua01.x);
          } 
          if (ua01.z != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mParentFragment=");
            paramPrintWriter.println(ua01.z);
          } 
          if (ua01.i != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mArguments=");
            paramPrintWriter.println(ua01.i);
          } 
          if (ua01.c != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mSavedFragmentState=");
            paramPrintWriter.println(ua01.c);
          } 
          if (ua01.e != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mSavedViewState=");
            paramPrintWriter.println(ua01.e);
          } 
          if (ua01.f != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mSavedViewRegistryState=");
            paramPrintWriter.println(ua01.f);
          } 
          ua0 ua02 = ua01.V(false);
          if (ua02 != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mTarget=");
            paramPrintWriter.print(ua02);
            paramPrintWriter.print(" mTargetRequestCode=");
            paramPrintWriter.println(ua01.l);
          } 
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mPopDirection=");
          sa0 sa0 = ua01.N;
          if (sa0 == null) {
            bool = false;
          } else {
            bool = sa0.a;
          } 
          paramPrintWriter.println(bool);
          sa0 = ua01.N;
          if (sa0 == null) {
            j = 0;
          } else {
            j = sa0.b;
          } 
          if (j != 0) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("getEnterAnim=");
            sa0 = ua01.N;
            if (sa0 == null) {
              j = 0;
            } else {
              j = sa0.b;
            } 
            paramPrintWriter.println(j);
          } 
          sa0 = ua01.N;
          if (sa0 == null) {
            j = 0;
          } else {
            j = sa0.c;
          } 
          if (j != 0) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("getExitAnim=");
            sa0 = ua01.N;
            if (sa0 == null) {
              j = 0;
            } else {
              j = sa0.c;
            } 
            paramPrintWriter.println(j);
          } 
          sa0 = ua01.N;
          if (sa0 == null) {
            j = 0;
          } else {
            j = sa0.d;
          } 
          if (j != 0) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("getPopEnterAnim=");
            sa0 = ua01.N;
            if (sa0 == null) {
              j = 0;
            } else {
              j = sa0.d;
            } 
            paramPrintWriter.println(j);
          } 
          sa0 = ua01.N;
          if (sa0 == null) {
            j = 0;
          } else {
            j = sa0.e;
          } 
          if (j != 0) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("getPopExitAnim=");
            sa0 = ua01.N;
            if (sa0 == null) {
              j = 0;
            } else {
              j = sa0.e;
            } 
            paramPrintWriter.println(j);
          } 
          if (ua01.J != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mContainer=");
            paramPrintWriter.println(ua01.J);
          } 
          if (ua01.K != null) {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mView=");
            paramPrintWriter.println(ua01.K);
          } 
          if (ua01.P() != null) {
            k32 k32 = ua01.H();
            nb0 nb0 = so0.c;
            k32.getClass();
            ft ft = ft.b;
            ft.getClass();
            n2 n22 = new n2(k32, nb0, ft);
            ll ll = ne1.a(so0.class);
            String str = ll.b();
            if (str != null) {
              eo1 eo1 = ((so0)n22.z(ll, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str))).b;
              if (eo1.e > 0) {
                paramPrintWriter.print(str2);
                paramPrintWriter.println("Loaders:");
                if (eo1.e > 0) {
                  if (eo1.c[0] != null) {
                    tp.b();
                    continue;
                  } 
                  paramPrintWriter.print(str2);
                  paramPrintWriter.print("  #");
                  paramPrintWriter.print(eo1.b[0]);
                  paramPrintWriter.print(": ");
                  throw null;
                } 
              } 
            } else {
              l0.l("Local and anonymous classes can not be ViewModels");
              continue;
            } 
          } 
          paramPrintWriter.print(str2);
          StringBuilder stringBuilder = new StringBuilder("Child ");
          stringBuilder.append(ua01.y);
          stringBuilder.append(":");
          paramPrintWriter.println(stringBuilder.toString());
          ua01.y.v(str2.concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          continue;
        } 
        paramPrintWriter.println(CKYHNesT.gKkkaPiqF);
      } 
    } 
    int i = arrayList.size();
    if (i > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (byte b1 = 0; b1 < i; b1++) {
        ua0 ua01 = arrayList.get(b1);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(b1);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(ua01.toString());
      } 
    } 
    ArrayList arrayList2 = this.e;
    if (arrayList2 != null) {
      i = arrayList2.size();
      if (i > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (byte b1 = 0; b1 < i; b1++) {
          ua0 ua01 = this.e.get(b1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(b1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(ua01.toString());
        } 
      } 
    } 
    i = this.d.size();
    if (i > 0) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Back Stack:");
      for (byte b1 = 0; b1 < i; b1++) {
        lb lb1 = this.d.get(b1);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(b1);
        paramPrintWriter.print(IGBYXeDFmKYajx.lIl);
        paramPrintWriter.println(lb1.toString());
        lb1.i(str1, paramPrintWriter, true);
      } 
    } 
    paramPrintWriter.print(paramString);
    StringBuilder stringBuilder1 = new StringBuilder(LHyji.YPnDBnppmFap);
    stringBuilder1.append(this.k.get());
    paramPrintWriter.println(stringBuilder1.toString());
    ArrayList arrayList1 = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      i = this.a.size();
      if (i > 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        for (byte b1 = b; b1 < i; b1++) {
          ib0 ib0 = this.a.get(b1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(b1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(ib0);
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.w);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.x);
    if (this.y != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.y);
    } 
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.v);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.H);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.I);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.J);
    if (this.G) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.G);
    } 
  }
  
  public final void w() {
    Iterator<jx> iterator = e().iterator();
    while (iterator.hasNext())
      ((jx)iterator.next()).h(); 
  }
  
  public final void x(ib0 paramib0, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.w == null) {
        if (this.J) {
          tp.f("FragmentManager has been destroyed");
          return;
        } 
        tp.f("FragmentManager has not been attached to a host.");
        return;
      } 
      if (this.H || this.I) {
        tp.f("Can not perform this action after onSaveInstanceState");
        return;
      } 
    } 
    ArrayList arrayList = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      if (this.w == null) {
        if (paramBoolean) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
          return;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("Activity has been destroyed");
        throw illegalStateException;
      } 
    } finally {}
    this.a.add(paramib0);
    b0();
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
  }
  
  public final void y(boolean paramBoolean) {
    if (!this.b) {
      if (this.w == null) {
        if (this.J) {
          tp.f("FragmentManager has been destroyed");
          return;
        } 
        tp.f("FragmentManager has not been attached to a host.");
        return;
      } 
      if (Looper.myLooper() == this.w.m.getLooper()) {
        if (paramBoolean || (!this.H && !this.I)) {
          if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
          } 
          return;
        } 
        tp.f("Can not perform this action after onSaveInstanceState");
        return;
      } 
      tp.f("Must be called from main thread of fragment host");
      return;
    } 
    tp.f("FragmentManager is already executing transactions");
  }
  
  public final boolean z(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual y : (Z)V
    //   5: aload_0
    //   6: getfield i : Z
    //   9: ifne -> 184
    //   12: aload_0
    //   13: getfield h : Llb;
    //   16: astore #6
    //   18: aload #6
    //   20: ifnull -> 184
    //   23: aload #6
    //   25: iconst_0
    //   26: putfield s : Z
    //   29: aload #6
    //   31: invokevirtual e : ()V
    //   34: iconst_3
    //   35: invokestatic M : (I)Z
    //   38: ifeq -> 93
    //   41: new java/lang/StringBuilder
    //   44: dup
    //   45: ldc_w 'Reversing mTransitioningOp '
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: astore #6
    //   53: aload #6
    //   55: aload_0
    //   56: getfield h : Llb;
    //   59: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload #6
    //   65: ldc_w ' as part of execPendingActions for actions '
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload #6
    //   74: aload_0
    //   75: getfield a : Ljava/util/ArrayList;
    //   78: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: ldc 'FragmentManager'
    //   84: aload #6
    //   86: invokevirtual toString : ()Ljava/lang/String;
    //   89: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   92: pop
    //   93: aload_0
    //   94: getfield h : Llb;
    //   97: iconst_0
    //   98: iconst_0
    //   99: invokevirtual g : (ZZ)I
    //   102: pop
    //   103: aload_0
    //   104: getfield a : Ljava/util/ArrayList;
    //   107: iconst_0
    //   108: aload_0
    //   109: getfield h : Llb;
    //   112: invokevirtual add : (ILjava/lang/Object;)V
    //   115: aload_0
    //   116: getfield h : Llb;
    //   119: getfield a : Ljava/util/ArrayList;
    //   122: astore #6
    //   124: aload #6
    //   126: invokevirtual size : ()I
    //   129: istore #4
    //   131: iconst_0
    //   132: istore_2
    //   133: iload_2
    //   134: iload #4
    //   136: if_icmpge -> 179
    //   139: aload #6
    //   141: iload_2
    //   142: invokevirtual get : (I)Ljava/lang/Object;
    //   145: astore #7
    //   147: iload_2
    //   148: iconst_1
    //   149: iadd
    //   150: istore_3
    //   151: aload #7
    //   153: checkcast vb0
    //   156: getfield b : Lua0;
    //   159: astore #7
    //   161: iload_3
    //   162: istore_2
    //   163: aload #7
    //   165: ifnull -> 133
    //   168: aload #7
    //   170: iconst_0
    //   171: putfield p : Z
    //   174: iload_3
    //   175: istore_2
    //   176: goto -> 133
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield h : Llb;
    //   184: iconst_0
    //   185: istore_1
    //   186: aload_0
    //   187: getfield L : Ljava/util/ArrayList;
    //   190: astore #7
    //   192: aload_0
    //   193: getfield M : Ljava/util/ArrayList;
    //   196: astore #9
    //   198: aload_0
    //   199: getfield a : Ljava/util/ArrayList;
    //   202: astore #6
    //   204: aload #6
    //   206: monitorenter
    //   207: aload_0
    //   208: getfield a : Ljava/util/ArrayList;
    //   211: invokevirtual isEmpty : ()Z
    //   214: ifeq -> 230
    //   217: aload #6
    //   219: monitorexit
    //   220: iconst_0
    //   221: istore_2
    //   222: goto -> 313
    //   225: astore #7
    //   227: goto -> 421
    //   230: aload_0
    //   231: getfield a : Ljava/util/ArrayList;
    //   234: invokevirtual size : ()I
    //   237: istore #4
    //   239: iconst_0
    //   240: istore_3
    //   241: iconst_0
    //   242: istore_2
    //   243: aload_0
    //   244: getfield a : Ljava/util/ArrayList;
    //   247: astore #8
    //   249: iload_3
    //   250: iload #4
    //   252: if_icmpge -> 291
    //   255: aload #8
    //   257: iload_3
    //   258: invokevirtual get : (I)Ljava/lang/Object;
    //   261: checkcast ib0
    //   264: aload #7
    //   266: aload #9
    //   268: invokeinterface a : (Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   273: istore #5
    //   275: iload_2
    //   276: iload #5
    //   278: ior
    //   279: istore_2
    //   280: iinc #3, 1
    //   283: goto -> 243
    //   286: astore #7
    //   288: goto -> 397
    //   291: aload #8
    //   293: invokevirtual clear : ()V
    //   296: aload_0
    //   297: getfield w : Lwa0;
    //   300: getfield m : Landroid/os/Handler;
    //   303: aload_0
    //   304: getfield P : Le3;
    //   307: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   310: aload #6
    //   312: monitorexit
    //   313: iload_2
    //   314: ifeq -> 352
    //   317: iconst_1
    //   318: istore_1
    //   319: aload_0
    //   320: iconst_1
    //   321: putfield b : Z
    //   324: aload_0
    //   325: aload_0
    //   326: getfield L : Ljava/util/ArrayList;
    //   329: aload_0
    //   330: getfield M : Ljava/util/ArrayList;
    //   333: invokevirtual Y : (Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   336: aload_0
    //   337: invokevirtual d : ()V
    //   340: goto -> 186
    //   343: astore #6
    //   345: aload_0
    //   346: invokevirtual d : ()V
    //   349: aload #6
    //   351: athrow
    //   352: aload_0
    //   353: invokevirtual j0 : ()V
    //   356: aload_0
    //   357: getfield K : Z
    //   360: ifeq -> 372
    //   363: aload_0
    //   364: iconst_0
    //   365: putfield K : Z
    //   368: aload_0
    //   369: invokevirtual h0 : ()V
    //   372: aload_0
    //   373: getfield c : Ln2;
    //   376: getfield e : Ljava/lang/Object;
    //   379: checkcast java/util/HashMap
    //   382: invokevirtual values : ()Ljava/util/Collection;
    //   385: aconst_null
    //   386: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   389: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   394: pop
    //   395: iload_1
    //   396: ireturn
    //   397: aload_0
    //   398: getfield a : Ljava/util/ArrayList;
    //   401: invokevirtual clear : ()V
    //   404: aload_0
    //   405: getfield w : Lwa0;
    //   408: getfield m : Landroid/os/Handler;
    //   411: aload_0
    //   412: getfield P : Le3;
    //   415: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   418: aload #7
    //   420: athrow
    //   421: aload #6
    //   423: monitorexit
    //   424: aload #7
    //   426: athrow
    // Exception table:
    //   from	to	target	type
    //   207	220	225	finally
    //   230	239	286	finally
    //   255	275	286	finally
    //   291	313	225	finally
    //   324	336	343	finally
    //   397	421	225	finally
    //   421	424	225	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */