import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.window.ldG.XUaAMlaMSa;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import in.krosbits.audio_cutter.TrimActivity;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class cn implements vl0, j70 {
  public static final ij h = new ij(4);
  
  public static final Object i = new Object();
  
  public static cn j;
  
  public Object b;
  
  public Object c;
  
  public final Object e;
  
  public Object f;
  
  public Object g;
  
  public cn(Context paramContext, int paramInt) {
    this.b = new Handler(Looper.getMainLooper());
    this.c = paramContext;
    this.e = paramContext.getSharedPreferences("PP", 0);
    this.g = UUID.randomUUID().toString();
  }
  
  public cn(Context paramContext, gh0 paramgh0) {
    this.c = paramContext;
    this.e = paramgh0;
    G();
  }
  
  public cn(Context paramContext, n2 paramn2) {
    this.c = paramContext;
    this.e = ye2;
    this.b = ye3;
    this.f = context1;
    this.g = ye1;
  }
  
  public cn(f80 paramf80) {
    this.e = paramf80;
  }
  
  public cn(hn2 paramhn2, hf2 paramhf2, String paramString) {
    this.c = paramhn2;
    this.e = paramhf2;
    this.b = paramString;
    this.g = new mt2(this);
  }
  
  public cn(Map<?, ?> paramMap) {
    this.c = new LinkedHashMap<Object, Object>(paramMap);
    this.e = new LinkedHashMap<Object, Object>();
    this.b = new LinkedHashMap<Object, Object>();
    this.f = new LinkedHashMap<Object, Object>();
    this.g = new jo(3, this);
  }
  
  public cn(ll paramll, tx1 paramtx11, pp parampp, tx1 paramtx12) {
    this.c = paramll;
    this.e = paramtx11;
    this.b = parampp;
    this.f = paramtx12;
  }
  
  public cn(int[] paramArrayOfint, int paramInt, w51[] paramArrayOfw51) {
    this.g = new float[3];
    this.f = paramArrayOfw51;
    int[] arrayOfInt = new int[32768];
    this.e = arrayOfInt;
    int m = 0;
    int i;
    for (i = 0; i < paramArrayOfint.length; i++) {
      int n = paramArrayOfint[i];
      int i2 = s(Color.red(n), 8, 5);
      int i1 = s(Color.green(n), 8, 5);
      n = s(Color.blue(n), 8, 5) | i2 << 10 | i1 << 5;
      paramArrayOfint[i] = n;
      arrayOfInt[n] = arrayOfInt[n] + 1;
    } 
    int j = 0;
    for (i = 0; j < 32768; i = n) {
      if (arrayOfInt[j] > 0) {
        int i1 = Color.rgb(s(j >> 10 & 0x1F, 5, 8), s(j >> 5 & 0x1F, 5, 8), s(j & 0x1F, 5, 8));
        float[] arrayOfFloat = (float[])this.g;
        ThreadLocal threadLocal = jn.a;
        jn.a(Color.red(i1), Color.green(i1), Color.blue(i1), arrayOfFloat);
        w51[] arrayOfW51 = (w51[])this.f;
        if (arrayOfW51 != null && arrayOfW51.length > 0) {
          int i2 = arrayOfW51.length;
          for (i1 = 0; i1 < i2; i1++) {
            if (!arrayOfW51[i1].a(arrayOfFloat)) {
              arrayOfInt[j] = 0;
              break;
            } 
          } 
        } 
      } 
      int n = i;
      if (arrayOfInt[j] > 0)
        n = i + 1; 
      j++;
    } 
    paramArrayOfint = new int[i];
    this.c = paramArrayOfint;
    j = 0;
    int k;
    for (k = 0; j < 32768; k = n) {
      int n = k;
      if (arrayOfInt[j] > 0) {
        paramArrayOfint[k] = j;
        n = k + 1;
      } 
      j++;
    } 
    if (i <= paramInt) {
      this.b = new ArrayList();
      for (paramInt = m; paramInt < i; paramInt++) {
        j = paramArrayOfint[paramInt];
        ((ArrayList<x51>)this.b).add(new x51(Color.rgb(s(j >> 10 & 0x1F, 5, 8), s(j >> 5 & 0x1F, 5, 8), s(j & 0x1F, 5, 8)), arrayOfInt[j]));
      } 
      return;
    } 
    PriorityQueue<bn> priorityQueue = new PriorityQueue(paramInt, h);
    priorityQueue.offer(new bn(this, 0, ((int[])this.c).length - 1));
    while (priorityQueue.size() < paramInt) {
      bn bn = priorityQueue.poll();
      if (bn != null) {
        k = bn.b;
        j = bn.a;
        if (k + 1 - j > 1) {
          cn cn1 = bn.j;
          if (k + 1 - j > 1) {
            m = bn.e - bn.d;
            i = bn.g - bn.f;
            int n = bn.i - bn.h;
            if (m >= i && m >= n) {
              i = -3;
            } else if (i >= m && i >= n) {
              i = -2;
            } else {
              i = -1;
            } 
            int[] arrayOfInt1 = (int[])cn1.c;
            int[] arrayOfInt2 = (int[])cn1.e;
            r(arrayOfInt1, i, j, k);
            Arrays.sort(arrayOfInt1, j, bn.b + 1);
            r(arrayOfInt1, i, j, bn.b);
            m = bn.c / 2;
            k = 0;
            i = j;
            while (true) {
              int i1 = bn.b;
              n = j;
              if (i <= i1) {
                k += arrayOfInt2[arrayOfInt1[i]];
                if (k >= m) {
                  n = Math.min(i1 - 1, i);
                  break;
                } 
                i++;
                continue;
              } 
              break;
            } 
            bn bn1 = new bn(cn1, n + 1, bn.b);
            bn.b = n;
            bn.a();
            priorityQueue.offer(bn1);
            priorityQueue.offer(bn);
            continue;
          } 
          tp.f("Can not split a box with only 1 color");
          throw null;
        } 
      } 
    } 
    ArrayList<x51> arrayList = new ArrayList(priorityQueue.size());
    label93: for (bn bn : priorityQueue) {
      cn cn1 = bn.j;
      int[] arrayOfInt1 = (int[])cn1.c;
      int[] arrayOfInt2 = (int[])cn1.e;
      k = bn.a;
      int n = 0;
      j = 0;
      paramInt = j;
      i = paramInt;
      while (k <= bn.b) {
        m = arrayOfInt1[k];
        int i1 = arrayOfInt2[m];
        j += i1;
        n = (m >> 10 & 0x1F) * i1 + n;
        paramInt = (m >> 5 & 0x1F) * i1 + paramInt;
        i += i1 * (m & 0x1F);
        k++;
      } 
      float f2 = n;
      float f1 = j;
      k = Math.round(f2 / f1);
      paramInt = Math.round(paramInt / f1);
      i = Math.round(i / f1);
      x51 x51 = new x51(Color.rgb(s(k, 5, 8), s(paramInt, 5, 8), s(i, 5, 8)), j);
      float[] arrayOfFloat = x51.b();
      w51[] arrayOfW51 = (w51[])this.f;
      if (arrayOfW51 != null && arrayOfW51.length > 0) {
        i = arrayOfW51.length;
        for (paramInt = 0; paramInt < i; paramInt++) {
          if (!arrayOfW51[paramInt].a(arrayOfFloat))
            continue label93; 
        } 
      } 
      arrayList.add(x51);
    } 
    this.b = arrayList;
  }
  
  public static ArrayList e(int paramInt1, int paramInt2, List<h80> paramList) {
    paramInt1 = (paramInt1 - paramInt2) / 2;
    ArrayList<h80> arrayList = new ArrayList();
    h80 h80 = new h80();
    h80.g = paramInt1;
    paramInt2 = paramList.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (paramInt1 == 0)
        arrayList.add(h80); 
      arrayList.add(paramList.get(paramInt1));
      if (paramInt1 == paramList.size() - 1)
        arrayList.add(h80); 
    } 
    return arrayList;
  }
  
  public static cn o(Context paramContext) {
    Object object = i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (j == null) {
        cn cn2 = new cn();
        this(paramContext.getApplicationContext(), 1);
        j = cn2;
      } 
    } finally {}
    cn cn1 = j;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return cn1;
  }
  
  public static void r(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (paramInt1 != -2) {
      if (paramInt1 == -1)
        while (paramInt2 <= paramInt3) {
          paramInt1 = paramArrayOfint[paramInt2];
          paramArrayOfint[paramInt2] = paramInt1 >> 10 & 0x1F | (paramInt1 & 0x1F) << 10 | (paramInt1 >> 5 & 0x1F) << 5;
          paramInt2++;
        }  
    } else {
      while (i <= paramInt3) {
        paramInt1 = paramArrayOfint[i];
        paramArrayOfint[i] = paramInt1 & 0x1F | (paramInt1 >> 5 & 0x1F) << 10 | (paramInt1 >> 10 & 0x1F) << 5;
        i++;
      } 
    } 
  }
  
  public static int s(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 > paramInt2) {
      paramInt1 <<= paramInt3 - paramInt2;
    } else {
      paramInt1 >>= paramInt2 - paramInt3;
    } 
    return paramInt1 & (1 << paramInt3) - 1;
  }
  
  public static int[] y(int paramInt, ArrayList<Comparable> paramArrayList, SparseIntArray paramSparseIntArray) {
    Collections.sort(paramArrayList);
    paramSparseIntArray.clear();
    int[] arrayOfInt = new int[paramInt];
    int i = paramArrayList.size();
    paramInt = 0;
    byte b = 0;
    while (b < i) {
      j80 j80 = (j80)paramArrayList.get(b);
      b++;
      j80 = j80;
      int j = j80.b;
      arrayOfInt[paramInt] = j;
      paramSparseIntArray.append(j, j80.c);
      paramInt++;
    } 
    return arrayOfInt;
  }
  
  public void A(View paramView, int paramInt1, int paramInt2) {
    g80 g80 = (g80)paramView.getLayoutParams();
    int i = g80.v();
    int j = g80.r();
    f80 f80 = (f80)this.e;
    i = Math.min(Math.max(paramInt1 - i - j - f80.k(paramView), g80.l()), g80.p());
    long[] arrayOfLong = (long[])this.g;
    if (arrayOfLong != null) {
      paramInt1 = (int)arrayOfLong[paramInt2];
    } else {
      paramInt1 = paramView.getMeasuredWidth();
    } 
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    paramView.measure(paramInt1, i);
    D(paramInt2, paramInt1, i, paramView);
    f80.h(paramView, paramInt2);
  }
  
  public void B(int paramInt) {
    f80 f80 = (f80)this.e;
    if (paramInt < f80.getFlexItemCount()) {
      int i = f80.getFlexDirection();
      if (f80.getAlignItems() == 4) {
        int[] arrayOfInt = (int[])this.c;
        if (arrayOfInt != null) {
          paramInt = arrayOfInt[paramInt];
        } else {
          paramInt = 0;
        } 
        List<h80> list = f80.getFlexLinesInternal();
        int j = list.size();
        while (paramInt < j) {
          h80 h80 = list.get(paramInt);
          int k = h80.h;
          for (byte b = 0; b < k; b++) {
            int m = h80.o + b;
            if (b < f80.getFlexItemCount()) {
              View view = f80.g(m);
              if (view != null && view.getVisibility() != 8) {
                g80 g80 = (g80)view.getLayoutParams();
                if (g80.g() == -1 || g80.g() == 4)
                  if (i != 0 && i != 1) {
                    if (i == 2 || i == 3) {
                      z(view, h80.g, m);
                    } else {
                      l0.l(ga1.i("Invalid flex direction: ", i));
                      return;
                    } 
                  } else {
                    A(view, h80.g, m);
                  }  
              } 
            } 
          } 
          paramInt++;
        } 
      } else {
        for (h80 h80 : f80.getFlexLinesInternal()) {
          ArrayList<Object> arrayList = h80.n;
          int j = arrayList.size();
          paramInt = 0;
          while (paramInt < j) {
            Integer integer = (Integer)arrayList.get(paramInt);
            paramInt++;
            integer = integer;
            View view = f80.g(integer.intValue());
            if (i != 0 && i != 1) {
              if (i == 2 || i == 3) {
                z(view, h80.g, integer.intValue());
                continue;
              } 
              l0.l(ga1.i("Invalid flex direction: ", i));
              return;
            } 
            A(view, h80.g, integer.intValue());
          } 
        } 
      } 
    } 
  }
  
  public void C(BroadcastReceiver paramBroadcastReceiver) {
    ArrayList<to0> arrayList;
    HashMap hashMap = (HashMap)this.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      arrayList = (ArrayList)((HashMap)this.e).remove(paramBroadcastReceiver);
      if (arrayList == null) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
        return;
      } 
    } finally {}
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      to0 to0 = arrayList.get(i);
      to0.d = true;
      for (byte b = 0; b < to0.a.countActions(); b++) {
        String str = to0.a.getAction(b);
        ArrayList<to0> arrayList1 = (ArrayList)((HashMap)this.f).get(str);
        if (arrayList1 != null) {
          for (int j = arrayList1.size() - 1; j >= 0; j--) {
            to0 to01 = arrayList1.get(j);
            if (to01.b == paramBroadcastReceiver) {
              to01.d = true;
              arrayList1.remove(j);
            } 
          } 
          if (arrayList1.size() <= 0)
            ((HashMap)this.f).remove(str); 
        } 
      } 
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
  }
  
  public void D(int paramInt1, int paramInt2, int paramInt3, View paramView) {
    long[] arrayOfLong = (long[])this.f;
    if (arrayOfLong != null) {
      long l = paramInt3;
      arrayOfLong[paramInt1] = paramInt2 & 0xFFFFFFFFL | l << 32L;
    } 
    arrayOfLong = (long[])this.g;
    if (arrayOfLong != null) {
      paramInt2 = paramView.getMeasuredWidth();
      arrayOfLong[paramInt1] = paramView.getMeasuredHeight() << 32L | paramInt2 & 0xFFFFFFFFL;
    } 
  }
  
  public void E(si2 paramsi2) {
    int i = paramsi2.e;
    if (i == 2 && (gc2)this.f != null)
      I(); 
    if (i == 2) {
      this.f = new gc2((hn2)this.c, (String)this.b);
    } else {
      this.f = H();
    } 
    gc2 gc2 = (gc2)this.f;
    n21.m(gc2);
    paramsi2.d = gc2.h;
    gc2.b.add(paramsi2);
  }
  
  public void F(Uri paramUri) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: checkcast android/content/Context
    //   7: astore #4
    //   9: aload_1
    //   10: ifnonnull -> 18
    //   13: aload_0
    //   14: invokevirtual G : ()V
    //   17: return
    //   18: aload_1
    //   19: aload_0
    //   20: getfield b : Ljava/lang/Object;
    //   23: checkcast android/net/Uri
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifne -> 148
    //   32: aload_0
    //   33: invokevirtual G : ()V
    //   36: aload_0
    //   37: aload_1
    //   38: putfield b : Ljava/lang/Object;
    //   41: aload_0
    //   42: getfield e : Ljava/lang/Object;
    //   45: checkcast gh0
    //   48: astore_1
    //   49: aload_1
    //   50: getfield c : I
    //   53: istore_3
    //   54: iload_3
    //   55: ifeq -> 89
    //   58: aload_1
    //   59: getfield e : I
    //   62: istore_2
    //   63: iload_2
    //   64: ifne -> 70
    //   67: goto -> 89
    //   70: aload_0
    //   71: new aj2
    //   74: dup
    //   75: aload #4
    //   77: iload_3
    //   78: iload_2
    //   79: aload_0
    //   80: invokespecial <init> : (Landroid/content/Context;IILcn;)V
    //   83: putfield f : Ljava/lang/Object;
    //   86: goto -> 105
    //   89: aload_0
    //   90: new aj2
    //   93: dup
    //   94: aload #4
    //   96: iconst_0
    //   97: iconst_0
    //   98: aload_0
    //   99: invokespecial <init> : (Landroid/content/Context;IILcn;)V
    //   102: putfield f : Ljava/lang/Object;
    //   105: aload_0
    //   106: getfield f : Ljava/lang/Object;
    //   109: checkcast aj2
    //   112: astore_1
    //   113: aload_1
    //   114: invokestatic m : (Ljava/lang/Object;)V
    //   117: aload_0
    //   118: getfield b : Ljava/lang/Object;
    //   121: checkcast android/net/Uri
    //   124: astore #4
    //   126: aload #4
    //   128: invokestatic m : (Ljava/lang/Object;)V
    //   131: aload_1
    //   132: getstatic android/os/AsyncTask.THREAD_POOL_EXECUTOR : Ljava/util/concurrent/Executor;
    //   135: iconst_1
    //   136: anewarray android/net/Uri
    //   139: dup
    //   140: iconst_0
    //   141: aload #4
    //   143: aastore
    //   144: invokevirtual executeOnExecutor : (Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   147: pop
    //   148: return
  }
  
  public void G() {
    aj2 aj2 = (aj2)this.f;
    if (aj2 != null) {
      aj2.cancel(true);
      this.f = null;
    } 
    this.b = null;
  }
  
  public gc2 H() {
    if ((gc2)this.f == null) {
      gc2 gc2 = new gc2((hn2)this.c, (String)this.b);
      this.f = gc2;
      gc2.b(1);
    } 
    return (gc2)this.f;
  }
  
  public void I() {
    gc2 gc2 = (gc2)this.f;
    if (gc2 != null) {
      oj oj = gc2.j;
      if (oj != null) {
        oj.l = null;
        gc2.j = null;
      } 
      long l = gc2.i;
      nq2 nq2 = oq2.m();
      nq2.a();
      ((oq2)nq2.c).o(l);
      String str1 = gc2.l;
      if (str1 != null) {
        nq2.a();
        ((oq2)nq2.c).t(str1);
      } 
      gt2 gt2 = ht2.l();
      if (!TextUtils.isEmpty(gc2.n)) {
        String str = gc2.n;
        nq2.a();
        ((oq2)nq2.c).p(str);
        str = gc2.n;
        gt2.a();
        ((ht2)gt2.c).m(str);
      } 
      if (!TextUtils.isEmpty(gc2.o)) {
        String str = gc2.o;
        gt2.a();
        ((ht2)gt2.c).n(str);
      } 
      if (!TextUtils.isEmpty(gc2.p)) {
        String str = gc2.p;
        gt2.a();
        ((ht2)gt2.c).o(str);
      } 
      if (!TextUtils.isEmpty(gc2.q)) {
        String str = gc2.q;
        gt2.a();
        ((ht2)gt2.c).p(str);
      } 
      if (!TextUtils.isEmpty(gc2.r)) {
        String str = gc2.r;
        gt2.a();
        ((ht2)gt2.c).q(str);
      } 
      if (!TextUtils.isEmpty(gc2.s)) {
        String str = gc2.s;
        gt2.a();
        ((ht2)gt2.c).r(str);
      } 
      int i = gc2.t;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 5) {
                i = 1;
              } else {
                i = 6;
              } 
            } else {
              i = 5;
            } 
          } else {
            i = 4;
          } 
        } else {
          i = 3;
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
      String str3 = gc2.w;
      eq2.a();
      ((fq2)eq2.c).n(str3);
      str3 = gc2.g;
      eq2.a();
      ((fq2)eq2.c).m(str3);
      fq2 fq2 = (fq2)eq2.b();
      nq2.a();
      ((oq2)nq2.c).x(fq2);
      gj2 gj2 = gc2.a;
      vq2 vq2 = wq2.l();
      String str2 = (String)gj2.a();
      if (str2 != null) {
        jr2 jr2 = kr2.l();
        jr2.a();
        ((kr2)jr2.c).m(str2);
        kr2 kr2 = (kr2)jr2.b();
        vq2.a();
        ((wq2)vq2.c).m(kr2);
      } 
      str2 = gc2.k;
      if (str2 != null) {
        try {
          String str = str2.replace("-", "");
          str = str.substring(0, Math.min(16, str.length()));
          BigInteger bigInteger = new BigInteger();
          this(str, 16);
          l = bigInteger.longValue();
        } catch (NumberFormatException numberFormatException) {
          rp0 rp0 = gc2.v;
          Log.w(rp0.a, rp0.c("receiverSessionId %s is not valid for hash", new Object[] { str2 }), numberFormatException);
          l = 0L;
        } 
        vq2.a();
        ((wq2)vq2.c).n(l);
      } 
      List list = gc2.b;
      if (!list.isEmpty()) {
        ArrayList<uq2> arrayList = new ArrayList();
        for (si2 si2 : list) {
          si2.getClass();
          tq2 tq2 = uq2.l();
          i = si2.e;
          tq2.a();
          ((uq2)tq2.c).q(i);
          i = (int)(si2.b - si2.d);
          l = i;
          tq2.a();
          ((uq2)tq2.c).p(l);
          tq2.a();
          ((uq2)tq2.c).m(i);
          Integer integer = si2.a;
          if (integer != null) {
            i = integer.intValue();
            tq2.a();
            ((uq2)tq2.c).n(i);
          } 
          Boolean bool = si2.c;
          if (bool != null) {
            boolean bool1 = bool.booleanValue();
            tq2.a();
            ((uq2)tq2.c).o(bool1);
          } 
          arrayList.add((uq2)tq2.b());
        } 
        vq2.a();
        ((wq2)vq2.c).o(arrayList);
      } 
      list = gc2.c;
      if (!list.isEmpty()) {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        if (!iterator.hasNext()) {
          vq2.a();
          ((wq2)vq2.c).q(arrayList);
        } else {
          throw x41.g(iterator);
        } 
      } 
      list = gc2.d;
      if (!list.isEmpty()) {
        ArrayList<qq2> arrayList = new ArrayList();
        for (ri2 ri2 : list) {
          String str = ri2.a;
          pq2 pq2 = qq2.l();
          switch (str.hashCode()) {
            default:
              i = 1;
              break;
            case 1873161788:
              if (str.equals("queueFetchItemIds")) {
                i = 17;
                break;
              } 
            case 1451542318:
              if (str.equals("activeTracks")) {
                i = 11;
                break;
              } 
            case 1148867366:
              if (str.equals("trackStyle")) {
                i = 12;
                break;
              } 
            case 913357482:
              if (str.equals("queueReorder")) {
                i = 16;
                break;
              } 
            case 525402049:
              if (str.equals("queueFetchItemRange")) {
                i = 18;
                break;
              } 
            case 106440182:
              if (str.equals("pause")) {
                i = 4;
                break;
              } 
            case 3540994:
              if (str.equals("stop")) {
                i = 5;
                break;
              } 
            case 3526264:
              if (str.equals("seek")) {
                i = 6;
                break;
              } 
            case 3443508:
              if (str.equals("play")) {
                i = 3;
                break;
              } 
            case 3363353:
              if (str.equals("mute")) {
                i = 8;
                break;
              } 
            case 3327206:
              if (str.equals("load")) {
                i = 2;
                break;
              } 
            case -402284771:
              if (str.equals("setPlaybackRate")) {
                i = 20;
                break;
              } 
            case -810883302:
              if (str.equals(hrSTyFuSIm.wUlBnmGnUEYt)) {
                i = 7;
                break;
              } 
            case -844665542:
              if (str.equals("queueUpdate")) {
                i = 14;
                break;
              } 
            case -892481550:
              if (str.equals("status")) {
                i = 10;
                break;
              } 
            case -900560382:
              if (str.equals("skipAd")) {
                i = 21;
                break;
              } 
            case -921113364:
              if (str.equals("volume-mute")) {
                i = 9;
                break;
              } 
            case -930425472:
              if (str.equals("setPlaybackDevices")) {
                i = 23;
                break;
              } 
            case -936597225:
              if (str.equals("queueFetchItems")) {
                i = 19;
                break;
              } 
            case -940430091:
              if (str.equals("queueRemove")) {
                i = 15;
                break;
              } 
            case -1109843021:
              if (str.equals("launch")) {
                i = 22;
                break;
              } 
            case -1189611734:
              if (str.equals("queueInsert")) {
                i = 13;
                break;
              } 
          } 
          pq2.a();
          ((qq2)pq2.c).q(i);
          i = (int)ri2.b;
          pq2.a();
          ((qq2)pq2.c).m(i);
          i = ri2.c;
          pq2.a();
          ((qq2)pq2.c).n(i);
          i = (int)(ri2.d - ri2.f);
          pq2.a();
          ((qq2)pq2.c).o(i);
          i = (int)(ri2.e - ri2.f);
          pq2.a();
          ((qq2)pq2.c).p(i);
          arrayList.add((qq2)pq2.b());
        } 
        vq2.a();
        ((wq2)vq2.c).p(arrayList);
      } 
      if (gc2.m != null) {
        ArrayList<sq2> arrayList = new ArrayList();
        fy1 fy1 = gc2.m;
        i = fy1.a;
        rq2 rq2 = sq2.l();
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i != 4) {
                i = 1;
              } else {
                i = 5;
              } 
            } else {
              i = 4;
            } 
          } else {
            i = 3;
          } 
        } else {
          i = 2;
        } 
        rq2.a();
        ((sq2)rq2.c).n(i);
        i = (int)(fy1.b - fy1.c);
        rq2.a();
        ((sq2)rq2.c).m(i);
        arrayList.add((sq2)rq2.b());
        vq2.a();
        ((wq2)vq2.c).s(arrayList);
      } 
      Map map = gc2.e;
      if (!map.isEmpty()) {
        ArrayList<cr2> arrayList = new ArrayList();
        for (ed2 ed2 : map.values()) {
          ed2.getClass();
          br2 br2 = cr2.l();
          i = ed2.e;
          br2.a();
          ((cr2)br2.c).p(i);
          i = ed2.d.get();
          br2.a();
          ((cr2)br2.c).m(i);
          i = (int)(ed2.a - ed2.c);
          br2.a();
          ((cr2)br2.c).n(i);
          i = (int)(ed2.b - ed2.c);
          br2.a();
          ((cr2)br2.c).o(i);
          arrayList.add((cr2)br2.b());
        } 
        vq2.a();
        ((wq2)vq2.c).r(arrayList);
      } 
      i = gc2.u;
      vq2.a();
      ((wq2)vq2.c).t(i);
      wq2 wq2 = (wq2)vq2.b();
      nq2.a();
      ((oq2)nq2.c).w(wq2);
      oq2 oq2 = (oq2)nq2.b();
      gc2.f.a(oq2, 233);
      this.f = null;
    } 
  }
  
  public void a(List<h80> paramList, h80 paramh80, int paramInt1, int paramInt2) {
    paramh80.m = paramInt2;
    ((f80)this.e).f(paramh80);
    paramh80.p = paramInt1;
    paramList.add(paramh80);
  }
  
  public void b(i80 parami80, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/Object;
    //   4: checkcast f80
    //   7: astore #33
    //   9: aload #33
    //   11: invokeinterface j : ()Z
    //   16: istore #28
    //   18: iload_2
    //   19: invokestatic getMode : (I)I
    //   22: istore #27
    //   24: iload_2
    //   25: invokestatic getSize : (I)I
    //   28: istore #26
    //   30: aload #7
    //   32: ifnonnull -> 47
    //   35: new java/util/ArrayList
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #7
    //   44: goto -> 47
    //   47: aload_1
    //   48: aload #7
    //   50: putfield b : Ljava/util/List;
    //   53: iload #6
    //   55: iconst_m1
    //   56: if_icmpne -> 65
    //   59: iconst_1
    //   60: istore #9
    //   62: goto -> 68
    //   65: iconst_0
    //   66: istore #9
    //   68: iload #28
    //   70: ifeq -> 85
    //   73: aload #33
    //   75: invokeinterface getPaddingStart : ()I
    //   80: istore #10
    //   82: goto -> 94
    //   85: aload #33
    //   87: invokeinterface getPaddingTop : ()I
    //   92: istore #10
    //   94: iload #28
    //   96: ifeq -> 111
    //   99: aload #33
    //   101: invokeinterface getPaddingEnd : ()I
    //   106: istore #11
    //   108: goto -> 120
    //   111: aload #33
    //   113: invokeinterface getPaddingBottom : ()I
    //   118: istore #11
    //   120: iload #28
    //   122: ifeq -> 137
    //   125: aload #33
    //   127: invokeinterface getPaddingTop : ()I
    //   132: istore #15
    //   134: goto -> 146
    //   137: aload #33
    //   139: invokeinterface getPaddingStart : ()I
    //   144: istore #15
    //   146: iload #28
    //   148: ifeq -> 163
    //   151: aload #33
    //   153: invokeinterface getPaddingBottom : ()I
    //   158: istore #16
    //   160: goto -> 172
    //   163: aload #33
    //   165: invokeinterface getPaddingEnd : ()I
    //   170: istore #16
    //   172: new h80
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: astore #30
    //   181: iload #5
    //   183: istore #18
    //   185: iconst_1
    //   186: istore #19
    //   188: aload #30
    //   190: iload #18
    //   192: putfield o : I
    //   195: iload #10
    //   197: iload #11
    //   199: iadd
    //   200: istore #10
    //   202: aload #30
    //   204: iload #10
    //   206: putfield e : I
    //   209: aload #33
    //   211: invokeinterface getFlexItemCount : ()I
    //   216: istore #17
    //   218: iload #9
    //   220: istore #5
    //   222: ldc_w -2147483648
    //   225: istore #11
    //   227: iconst_0
    //   228: istore #12
    //   230: iconst_0
    //   231: istore #9
    //   233: iconst_0
    //   234: istore #20
    //   236: iload #12
    //   238: istore #13
    //   240: iload #18
    //   242: iload #17
    //   244: if_icmpge -> 2065
    //   247: aload #33
    //   249: iload #18
    //   251: invokeinterface g : (I)Landroid/view/View;
    //   256: astore #31
    //   258: aload #31
    //   260: ifnonnull -> 295
    //   263: iload #18
    //   265: iload #17
    //   267: iconst_1
    //   268: isub
    //   269: if_icmpne -> 358
    //   272: aload #30
    //   274: invokevirtual a : ()I
    //   277: ifeq -> 358
    //   280: aload_0
    //   281: aload #7
    //   283: aload #30
    //   285: iload #18
    //   287: iload #9
    //   289: invokevirtual a : (Ljava/util/List;Lh80;II)V
    //   292: goto -> 358
    //   295: aload #31
    //   297: invokevirtual getVisibility : ()I
    //   300: bipush #8
    //   302: if_icmpne -> 385
    //   305: aload #30
    //   307: aload #30
    //   309: getfield i : I
    //   312: iconst_1
    //   313: iadd
    //   314: putfield i : I
    //   317: aload #30
    //   319: aload #30
    //   321: getfield h : I
    //   324: iconst_1
    //   325: iadd
    //   326: putfield h : I
    //   329: iload #18
    //   331: iload #17
    //   333: iconst_1
    //   334: isub
    //   335: if_icmpne -> 358
    //   338: aload #30
    //   340: invokevirtual a : ()I
    //   343: ifeq -> 358
    //   346: aload_0
    //   347: aload #7
    //   349: aload #30
    //   351: iload #18
    //   353: iload #9
    //   355: invokevirtual a : (Ljava/util/List;Lh80;II)V
    //   358: iload #12
    //   360: istore #21
    //   362: aload #7
    //   364: astore #32
    //   366: iload #9
    //   368: istore #22
    //   370: aload #30
    //   372: astore #31
    //   374: iload #10
    //   376: istore #14
    //   378: iload #11
    //   380: istore #23
    //   382: goto -> 2068
    //   385: aload #31
    //   387: instanceof android/widget/CompoundButton
    //   390: ifeq -> 523
    //   393: aload #31
    //   395: checkcast android/widget/CompoundButton
    //   398: astore #34
    //   400: aload #34
    //   402: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   405: checkcast g80
    //   408: astore #32
    //   410: aload #32
    //   412: invokeinterface m : ()I
    //   417: istore #23
    //   419: aload #32
    //   421: invokeinterface l : ()I
    //   426: istore #22
    //   428: aload #34
    //   430: invokevirtual getButtonDrawable : ()Landroid/graphics/drawable/Drawable;
    //   433: astore #34
    //   435: aload #34
    //   437: ifnonnull -> 446
    //   440: iconst_0
    //   441: istore #13
    //   443: goto -> 453
    //   446: aload #34
    //   448: invokevirtual getMinimumWidth : ()I
    //   451: istore #13
    //   453: aload #34
    //   455: ifnonnull -> 464
    //   458: iconst_0
    //   459: istore #14
    //   461: goto -> 474
    //   464: aload #34
    //   466: invokevirtual getMinimumHeight : ()I
    //   469: istore #14
    //   471: goto -> 461
    //   474: iload #23
    //   476: istore #21
    //   478: iload #23
    //   480: iconst_m1
    //   481: if_icmpne -> 488
    //   484: iload #13
    //   486: istore #21
    //   488: aload #32
    //   490: iload #21
    //   492: invokeinterface q : (I)V
    //   497: iload #22
    //   499: istore #13
    //   501: iload #22
    //   503: iconst_m1
    //   504: if_icmpne -> 511
    //   507: iload #14
    //   509: istore #13
    //   511: aload #32
    //   513: iload #13
    //   515: invokeinterface a : (I)V
    //   520: goto -> 523
    //   523: aload #31
    //   525: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   528: checkcast g80
    //   531: astore #32
    //   533: aload #32
    //   535: invokeinterface g : ()I
    //   540: iconst_4
    //   541: if_icmpne -> 558
    //   544: aload #30
    //   546: getfield n : Ljava/util/ArrayList;
    //   549: iload #18
    //   551: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   554: invokevirtual add : (Ljava/lang/Object;)Z
    //   557: pop
    //   558: iload #28
    //   560: ifeq -> 575
    //   563: aload #32
    //   565: invokeinterface getWidth : ()I
    //   570: istore #13
    //   572: goto -> 584
    //   575: aload #32
    //   577: invokeinterface getHeight : ()I
    //   582: istore #13
    //   584: iload #13
    //   586: istore #14
    //   588: aload #32
    //   590: invokeinterface d : ()F
    //   595: ldc_w -1.0
    //   598: fcmpl
    //   599: ifeq -> 634
    //   602: iload #13
    //   604: istore #14
    //   606: iload #27
    //   608: ldc_w 1073741824
    //   611: if_icmpne -> 634
    //   614: iload #26
    //   616: i2f
    //   617: fstore #8
    //   619: aload #32
    //   621: invokeinterface d : ()F
    //   626: fload #8
    //   628: fmul
    //   629: invokestatic round : (F)I
    //   632: istore #14
    //   634: iload #28
    //   636: ifeq -> 742
    //   639: aload #32
    //   641: invokeinterface s : ()I
    //   646: istore #13
    //   648: aload #33
    //   650: iload_2
    //   651: aload #32
    //   653: invokeinterface k : ()I
    //   658: iload #13
    //   660: iload #10
    //   662: iadd
    //   663: iadd
    //   664: iload #14
    //   666: invokeinterface i : (III)I
    //   671: istore #13
    //   673: aload #32
    //   675: invokeinterface v : ()I
    //   680: istore #14
    //   682: aload #33
    //   684: iload_3
    //   685: aload #32
    //   687: invokeinterface r : ()I
    //   692: iload #14
    //   694: iload #15
    //   696: iload #16
    //   698: iadd
    //   699: iadd
    //   700: iadd
    //   701: iload #9
    //   703: iadd
    //   704: aload #32
    //   706: invokeinterface getHeight : ()I
    //   711: invokeinterface d : (III)I
    //   716: istore #14
    //   718: aload #31
    //   720: iload #13
    //   722: iload #14
    //   724: invokevirtual measure : (II)V
    //   727: aload_0
    //   728: iload #18
    //   730: iload #13
    //   732: iload #14
    //   734: aload #31
    //   736: invokevirtual D : (IIILandroid/view/View;)V
    //   739: goto -> 842
    //   742: aload #32
    //   744: invokeinterface s : ()I
    //   749: istore #13
    //   751: aload #33
    //   753: iload_3
    //   754: aload #32
    //   756: invokeinterface k : ()I
    //   761: iload #13
    //   763: iload #15
    //   765: iload #16
    //   767: iadd
    //   768: iadd
    //   769: iadd
    //   770: iload #9
    //   772: iadd
    //   773: aload #32
    //   775: invokeinterface getWidth : ()I
    //   780: invokeinterface i : (III)I
    //   785: istore #21
    //   787: aload #32
    //   789: invokeinterface v : ()I
    //   794: istore #13
    //   796: aload #33
    //   798: iload_2
    //   799: aload #32
    //   801: invokeinterface r : ()I
    //   806: iload #13
    //   808: iload #10
    //   810: iadd
    //   811: iadd
    //   812: iload #14
    //   814: invokeinterface d : (III)I
    //   819: istore #13
    //   821: aload #31
    //   823: iload #21
    //   825: iload #13
    //   827: invokevirtual measure : (II)V
    //   830: aload_0
    //   831: iload #18
    //   833: iload #21
    //   835: iload #13
    //   837: aload #31
    //   839: invokevirtual D : (IIILandroid/view/View;)V
    //   842: aload #33
    //   844: aload #31
    //   846: iload #18
    //   848: invokeinterface h : (Landroid/view/View;I)V
    //   853: aload_0
    //   854: aload #31
    //   856: iload #18
    //   858: invokevirtual c : (Landroid/view/View;I)V
    //   861: iload #12
    //   863: aload #31
    //   865: invokevirtual getMeasuredState : ()I
    //   868: invokestatic combineMeasuredStates : (II)I
    //   871: istore #12
    //   873: aload #30
    //   875: getfield e : I
    //   878: istore #23
    //   880: iload #28
    //   882: ifeq -> 895
    //   885: aload #31
    //   887: invokevirtual getMeasuredWidth : ()I
    //   890: istore #14
    //   892: goto -> 902
    //   895: aload #31
    //   897: invokevirtual getMeasuredHeight : ()I
    //   900: istore #14
    //   902: iload #28
    //   904: ifeq -> 919
    //   907: aload #32
    //   909: invokeinterface s : ()I
    //   914: istore #21
    //   916: goto -> 928
    //   919: aload #32
    //   921: invokeinterface v : ()I
    //   926: istore #21
    //   928: iload #28
    //   930: ifeq -> 945
    //   933: aload #32
    //   935: invokeinterface k : ()I
    //   940: istore #22
    //   942: goto -> 954
    //   945: aload #32
    //   947: invokeinterface r : ()I
    //   952: istore #22
    //   954: iload #14
    //   956: iload #21
    //   958: iadd
    //   959: iload #22
    //   961: iadd
    //   962: istore #21
    //   964: aload #7
    //   966: invokeinterface size : ()I
    //   971: istore #14
    //   973: aload #33
    //   975: invokeinterface getFlexWrap : ()I
    //   980: ifne -> 986
    //   983: goto -> 1351
    //   986: aload #32
    //   988: invokeinterface o : ()Z
    //   993: ifeq -> 999
    //   996: goto -> 1075
    //   999: iload #27
    //   1001: ifne -> 1007
    //   1004: goto -> 983
    //   1007: aload #33
    //   1009: invokeinterface getMaxLine : ()I
    //   1014: istore #22
    //   1016: iload #22
    //   1018: iconst_m1
    //   1019: if_icmpeq -> 1034
    //   1022: iload #22
    //   1024: iload #14
    //   1026: iconst_1
    //   1027: iadd
    //   1028: if_icmpgt -> 1034
    //   1031: goto -> 983
    //   1034: aload #33
    //   1036: aload #31
    //   1038: iload #18
    //   1040: iload #20
    //   1042: invokeinterface c : (Landroid/view/View;II)I
    //   1047: istore #22
    //   1049: iload #21
    //   1051: istore #14
    //   1053: iload #22
    //   1055: ifle -> 1065
    //   1058: iload #21
    //   1060: iload #22
    //   1062: iadd
    //   1063: istore #14
    //   1065: iload #26
    //   1067: iload #23
    //   1069: iload #14
    //   1071: iadd
    //   1072: if_icmpge -> 983
    //   1075: aload #30
    //   1077: invokevirtual a : ()I
    //   1080: ifle -> 1128
    //   1083: iload #18
    //   1085: ifle -> 1097
    //   1088: iload #18
    //   1090: iconst_1
    //   1091: isub
    //   1092: istore #11
    //   1094: goto -> 1103
    //   1097: iconst_0
    //   1098: istore #11
    //   1100: goto -> 1094
    //   1103: aload_0
    //   1104: aload #7
    //   1106: aload #30
    //   1108: iload #11
    //   1110: iload #9
    //   1112: invokevirtual a : (Ljava/util/List;Lh80;II)V
    //   1115: iload #9
    //   1117: aload #30
    //   1119: getfield g : I
    //   1122: iadd
    //   1123: istore #9
    //   1125: goto -> 1128
    //   1128: iload #28
    //   1130: ifeq -> 1223
    //   1133: aload #32
    //   1135: invokeinterface getHeight : ()I
    //   1140: iconst_m1
    //   1141: if_icmpne -> 1310
    //   1144: aload #33
    //   1146: invokeinterface getPaddingTop : ()I
    //   1151: istore #20
    //   1153: aload #33
    //   1155: invokeinterface getPaddingBottom : ()I
    //   1160: istore #14
    //   1162: aload #32
    //   1164: invokeinterface v : ()I
    //   1169: istore #11
    //   1171: aload #31
    //   1173: iload #13
    //   1175: aload #33
    //   1177: iload_3
    //   1178: aload #32
    //   1180: invokeinterface r : ()I
    //   1185: iload #11
    //   1187: iload #14
    //   1189: iload #20
    //   1191: iadd
    //   1192: iadd
    //   1193: iadd
    //   1194: iload #9
    //   1196: iadd
    //   1197: aload #32
    //   1199: invokeinterface getHeight : ()I
    //   1204: invokeinterface d : (III)I
    //   1209: invokevirtual measure : (II)V
    //   1212: aload_0
    //   1213: aload #31
    //   1215: iload #18
    //   1217: invokevirtual c : (Landroid/view/View;I)V
    //   1220: goto -> 1310
    //   1223: aload #32
    //   1225: invokeinterface getWidth : ()I
    //   1230: iconst_m1
    //   1231: if_icmpne -> 1310
    //   1234: aload #33
    //   1236: invokeinterface getPaddingLeft : ()I
    //   1241: istore #11
    //   1243: aload #33
    //   1245: invokeinterface getPaddingRight : ()I
    //   1250: istore #14
    //   1252: aload #32
    //   1254: invokeinterface s : ()I
    //   1259: istore #20
    //   1261: aload #31
    //   1263: aload #33
    //   1265: iload_3
    //   1266: aload #32
    //   1268: invokeinterface k : ()I
    //   1273: iload #20
    //   1275: iload #14
    //   1277: iload #11
    //   1279: iadd
    //   1280: iadd
    //   1281: iadd
    //   1282: iload #9
    //   1284: iadd
    //   1285: aload #32
    //   1287: invokeinterface getWidth : ()I
    //   1292: invokeinterface i : (III)I
    //   1297: iload #13
    //   1299: invokevirtual measure : (II)V
    //   1302: aload_0
    //   1303: aload #31
    //   1305: iload #18
    //   1307: invokevirtual c : (Landroid/view/View;I)V
    //   1310: new h80
    //   1313: dup
    //   1314: invokespecial <init> : ()V
    //   1317: astore #30
    //   1319: aload #30
    //   1321: iload #19
    //   1323: putfield h : I
    //   1326: aload #30
    //   1328: iload #10
    //   1330: putfield e : I
    //   1333: aload #30
    //   1335: iload #18
    //   1337: putfield o : I
    //   1340: ldc_w -2147483648
    //   1343: istore #14
    //   1345: iconst_0
    //   1346: istore #11
    //   1348: goto -> 1378
    //   1351: aload #30
    //   1353: aload #30
    //   1355: getfield h : I
    //   1358: iload #19
    //   1360: iadd
    //   1361: putfield h : I
    //   1364: iload #20
    //   1366: iconst_1
    //   1367: iadd
    //   1368: istore #13
    //   1370: iload #11
    //   1372: istore #14
    //   1374: iload #13
    //   1376: istore #11
    //   1378: iload #10
    //   1380: istore #13
    //   1382: aload #30
    //   1384: getfield q : Z
    //   1387: istore #29
    //   1389: aload #32
    //   1391: invokeinterface c : ()F
    //   1396: fconst_0
    //   1397: fcmpl
    //   1398: ifeq -> 1407
    //   1401: iconst_1
    //   1402: istore #10
    //   1404: goto -> 1410
    //   1407: iconst_0
    //   1408: istore #10
    //   1410: aload #30
    //   1412: iload #29
    //   1414: iload #10
    //   1416: ior
    //   1417: putfield q : Z
    //   1420: aload #30
    //   1422: getfield r : Z
    //   1425: istore #29
    //   1427: aload #32
    //   1429: invokeinterface h : ()F
    //   1434: fconst_0
    //   1435: fcmpl
    //   1436: ifeq -> 1445
    //   1439: iconst_1
    //   1440: istore #10
    //   1442: goto -> 1448
    //   1445: iconst_0
    //   1446: istore #10
    //   1448: aload #30
    //   1450: iload #29
    //   1452: iload #10
    //   1454: ior
    //   1455: putfield r : Z
    //   1458: aload_0
    //   1459: getfield c : Ljava/lang/Object;
    //   1462: checkcast [I
    //   1465: astore #34
    //   1467: aload #34
    //   1469: ifnull -> 1484
    //   1472: aload #34
    //   1474: iload #18
    //   1476: aload #7
    //   1478: invokeinterface size : ()I
    //   1483: iastore
    //   1484: aload #30
    //   1486: getfield e : I
    //   1489: istore #21
    //   1491: iload #28
    //   1493: ifeq -> 1506
    //   1496: aload #31
    //   1498: invokevirtual getMeasuredWidth : ()I
    //   1501: istore #10
    //   1503: goto -> 1513
    //   1506: aload #31
    //   1508: invokevirtual getMeasuredHeight : ()I
    //   1511: istore #10
    //   1513: iload #28
    //   1515: ifeq -> 1530
    //   1518: aload #32
    //   1520: invokeinterface s : ()I
    //   1525: istore #19
    //   1527: goto -> 1539
    //   1530: aload #32
    //   1532: invokeinterface v : ()I
    //   1537: istore #19
    //   1539: iload #28
    //   1541: ifeq -> 1556
    //   1544: aload #32
    //   1546: invokeinterface k : ()I
    //   1551: istore #20
    //   1553: goto -> 1565
    //   1556: aload #32
    //   1558: invokeinterface r : ()I
    //   1563: istore #20
    //   1565: aload #30
    //   1567: iload #10
    //   1569: iload #19
    //   1571: iadd
    //   1572: iload #20
    //   1574: iadd
    //   1575: iload #21
    //   1577: iadd
    //   1578: putfield e : I
    //   1581: aload #30
    //   1583: getfield j : F
    //   1586: fstore #8
    //   1588: aload #30
    //   1590: aload #32
    //   1592: invokeinterface c : ()F
    //   1597: fload #8
    //   1599: fadd
    //   1600: putfield j : F
    //   1603: aload #30
    //   1605: getfield k : F
    //   1608: fstore #8
    //   1610: aload #30
    //   1612: aload #32
    //   1614: invokeinterface h : ()F
    //   1619: fload #8
    //   1621: fadd
    //   1622: putfield k : F
    //   1625: aload #33
    //   1627: aload #31
    //   1629: iload #18
    //   1631: iload #11
    //   1633: aload #30
    //   1635: invokeinterface a : (Landroid/view/View;IILh80;)V
    //   1640: iload #28
    //   1642: ifeq -> 1655
    //   1645: aload #31
    //   1647: invokevirtual getMeasuredHeight : ()I
    //   1650: istore #10
    //   1652: goto -> 1662
    //   1655: aload #31
    //   1657: invokevirtual getMeasuredWidth : ()I
    //   1660: istore #10
    //   1662: iload #28
    //   1664: ifeq -> 1679
    //   1667: aload #32
    //   1669: invokeinterface v : ()I
    //   1674: istore #19
    //   1676: goto -> 1688
    //   1679: aload #32
    //   1681: invokeinterface s : ()I
    //   1686: istore #19
    //   1688: iload #28
    //   1690: ifeq -> 1705
    //   1693: aload #32
    //   1695: invokeinterface r : ()I
    //   1700: istore #20
    //   1702: goto -> 1714
    //   1705: aload #32
    //   1707: invokeinterface k : ()I
    //   1712: istore #20
    //   1714: iload #14
    //   1716: aload #33
    //   1718: aload #31
    //   1720: invokeinterface k : (Landroid/view/View;)I
    //   1725: iload #10
    //   1727: iload #19
    //   1729: iadd
    //   1730: iload #20
    //   1732: iadd
    //   1733: iadd
    //   1734: invokestatic max : (II)I
    //   1737: istore #24
    //   1739: aload #30
    //   1741: aload #30
    //   1743: getfield g : I
    //   1746: iload #24
    //   1748: invokestatic max : (II)I
    //   1751: putfield g : I
    //   1754: iload #28
    //   1756: ifeq -> 1851
    //   1759: aload #33
    //   1761: invokeinterface getFlexWrap : ()I
    //   1766: istore #14
    //   1768: aload #30
    //   1770: getfield l : I
    //   1773: istore #10
    //   1775: iload #14
    //   1777: iconst_2
    //   1778: if_icmpeq -> 1811
    //   1781: aload #31
    //   1783: invokevirtual getBaseline : ()I
    //   1786: istore #14
    //   1788: aload #30
    //   1790: iload #10
    //   1792: aload #32
    //   1794: invokeinterface v : ()I
    //   1799: iload #14
    //   1801: iadd
    //   1802: invokestatic max : (II)I
    //   1805: putfield l : I
    //   1808: goto -> 1851
    //   1811: aload #31
    //   1813: invokevirtual getMeasuredHeight : ()I
    //   1816: istore #14
    //   1818: aload #31
    //   1820: invokevirtual getBaseline : ()I
    //   1823: istore #19
    //   1825: aload #30
    //   1827: iload #10
    //   1829: aload #32
    //   1831: invokeinterface r : ()I
    //   1836: iload #14
    //   1838: iload #19
    //   1840: isub
    //   1841: iadd
    //   1842: invokestatic max : (II)I
    //   1845: putfield l : I
    //   1848: goto -> 1851
    //   1851: iload #9
    //   1853: istore #10
    //   1855: iload #18
    //   1857: iload #17
    //   1859: iconst_1
    //   1860: isub
    //   1861: if_icmpne -> 1898
    //   1864: iload #9
    //   1866: istore #10
    //   1868: aload #30
    //   1870: invokevirtual a : ()I
    //   1873: ifeq -> 1898
    //   1876: aload_0
    //   1877: aload #7
    //   1879: aload #30
    //   1881: iload #18
    //   1883: iload #9
    //   1885: invokevirtual a : (Ljava/util/List;Lh80;II)V
    //   1888: iload #9
    //   1890: aload #30
    //   1892: getfield g : I
    //   1895: iadd
    //   1896: istore #10
    //   1898: iload #6
    //   1900: iconst_m1
    //   1901: if_icmpeq -> 1970
    //   1904: aload #7
    //   1906: invokeinterface size : ()I
    //   1911: ifle -> 1970
    //   1914: aload #7
    //   1916: aload #7
    //   1918: invokeinterface size : ()I
    //   1923: iconst_1
    //   1924: isub
    //   1925: invokeinterface get : (I)Ljava/lang/Object;
    //   1930: checkcast h80
    //   1933: getfield p : I
    //   1936: iload #6
    //   1938: if_icmplt -> 1970
    //   1941: iload #18
    //   1943: iload #6
    //   1945: if_icmplt -> 1970
    //   1948: iload #5
    //   1950: ifne -> 1970
    //   1953: aload #30
    //   1955: getfield g : I
    //   1958: ineg
    //   1959: istore #10
    //   1961: iconst_1
    //   1962: istore #9
    //   1964: iconst_1
    //   1965: istore #25
    //   1967: goto -> 1977
    //   1970: iload #5
    //   1972: istore #9
    //   1974: goto -> 1964
    //   1977: iload #9
    //   1979: istore #5
    //   1981: iload #12
    //   1983: istore #21
    //   1985: aload #7
    //   1987: astore #32
    //   1989: iload #10
    //   1991: istore #22
    //   1993: aload #30
    //   1995: astore #31
    //   1997: iload #11
    //   1999: istore #20
    //   2001: iload #13
    //   2003: istore #14
    //   2005: iload #25
    //   2007: istore #19
    //   2009: iload #24
    //   2011: istore #23
    //   2013: iload #10
    //   2015: iload #4
    //   2017: if_icmple -> 2068
    //   2020: iload #9
    //   2022: istore #5
    //   2024: iload #12
    //   2026: istore #21
    //   2028: aload #7
    //   2030: astore #32
    //   2032: iload #10
    //   2034: istore #22
    //   2036: aload #30
    //   2038: astore #31
    //   2040: iload #11
    //   2042: istore #20
    //   2044: iload #13
    //   2046: istore #14
    //   2048: iload #25
    //   2050: istore #19
    //   2052: iload #24
    //   2054: istore #23
    //   2056: iload #9
    //   2058: ifeq -> 2068
    //   2061: iload #12
    //   2063: istore #13
    //   2065: goto -> 2098
    //   2068: iinc #18, 1
    //   2071: iload #21
    //   2073: istore #12
    //   2075: aload #32
    //   2077: astore #7
    //   2079: iload #22
    //   2081: istore #9
    //   2083: aload #31
    //   2085: astore #30
    //   2087: iload #14
    //   2089: istore #10
    //   2091: iload #23
    //   2093: istore #11
    //   2095: goto -> 236
    //   2098: aload_1
    //   2099: iload #13
    //   2101: putfield a : I
    //   2104: return
  }
  
  public void c(View paramView, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast g80
    //   7: astore #8
    //   9: aload_1
    //   10: invokevirtual getMeasuredWidth : ()I
    //   13: istore #4
    //   15: aload_1
    //   16: invokevirtual getMeasuredHeight : ()I
    //   19: istore #6
    //   21: aload #8
    //   23: invokeinterface m : ()I
    //   28: istore_3
    //   29: iconst_1
    //   30: istore #5
    //   32: iload #4
    //   34: iload_3
    //   35: if_icmpge -> 58
    //   38: aload #8
    //   40: invokeinterface m : ()I
    //   45: istore_3
    //   46: iconst_1
    //   47: istore #7
    //   49: iload_3
    //   50: istore #4
    //   52: iload #7
    //   54: istore_3
    //   55: goto -> 83
    //   58: iload #4
    //   60: aload #8
    //   62: invokeinterface u : ()I
    //   67: if_icmple -> 81
    //   70: aload #8
    //   72: invokeinterface u : ()I
    //   77: istore_3
    //   78: goto -> 46
    //   81: iconst_0
    //   82: istore_3
    //   83: iload #6
    //   85: aload #8
    //   87: invokeinterface l : ()I
    //   92: if_icmpge -> 106
    //   95: aload #8
    //   97: invokeinterface l : ()I
    //   102: istore_3
    //   103: goto -> 135
    //   106: iload #6
    //   108: aload #8
    //   110: invokeinterface p : ()I
    //   115: if_icmple -> 129
    //   118: aload #8
    //   120: invokeinterface p : ()I
    //   125: istore_3
    //   126: goto -> 135
    //   129: iload_3
    //   130: istore #5
    //   132: iload #6
    //   134: istore_3
    //   135: iload #5
    //   137: ifeq -> 188
    //   140: iload #4
    //   142: ldc_w 1073741824
    //   145: invokestatic makeMeasureSpec : (II)I
    //   148: istore #4
    //   150: iload_3
    //   151: ldc_w 1073741824
    //   154: invokestatic makeMeasureSpec : (II)I
    //   157: istore_3
    //   158: aload_1
    //   159: iload #4
    //   161: iload_3
    //   162: invokevirtual measure : (II)V
    //   165: aload_0
    //   166: iload_2
    //   167: iload #4
    //   169: iload_3
    //   170: aload_1
    //   171: invokevirtual D : (IIILandroid/view/View;)V
    //   174: aload_0
    //   175: getfield e : Ljava/lang/Object;
    //   178: checkcast f80
    //   181: aload_1
    //   182: iload_2
    //   183: invokeinterface h : (Landroid/view/View;I)V
    //   188: return
  }
  
  public void d(int paramInt, List paramList) {
    int j = ((int[])this.c)[paramInt];
    int i = j;
    if (j == -1)
      i = 0; 
    if (paramList.size() > i)
      paramList.subList(i, paramList.size()).clear(); 
    int[] arrayOfInt = (int[])this.c;
    i = arrayOfInt.length - 1;
    if (paramInt > i) {
      Arrays.fill(arrayOfInt, -1);
    } else {
      Arrays.fill(arrayOfInt, paramInt, i, -1);
    } 
    long[] arrayOfLong = (long[])this.f;
    i = arrayOfLong.length - 1;
    if (paramInt > i) {
      Arrays.fill(arrayOfLong, 0L);
      return;
    } 
    Arrays.fill(arrayOfLong, paramInt, i, 0L);
  }
  
  public ArrayList f(int paramInt) {
    ArrayList<Object> arrayList = new ArrayList(paramInt);
    for (byte b = 0; b < paramInt; b++) {
      g80 g80 = (g80)((f80)this.e).b(b).getLayoutParams();
      Object object = new Object();
      ((j80)object).c = g80.getOrder();
      ((j80)object).b = b;
      arrayList.add(object);
    } 
    return arrayList;
  }
  
  public void g(int paramInt1, int paramInt2, int paramInt3) {
    f80 f80 = (f80)this.e;
    int i = f80.getFlexDirection();
    if (i != 0 && i != 1) {
      if (i == 2 || i == 3) {
        i = View.MeasureSpec.getMode(paramInt1);
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
      } else {
        l0.l(ga1.i("Invalid flex direction: ", i));
        return;
      } 
    } else {
      paramInt1 = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      i = paramInt1;
      paramInt1 = paramInt2;
    } 
    List<h80> list = f80.getFlexLinesInternal();
    if (i == 1073741824) {
      int j = f80.getSumOfCrossSize() + paramInt3;
      int k = list.size();
      i = 0;
      paramInt2 = 0;
      if (k == 1) {
        ((h80)list.get(0)).g = paramInt1 - paramInt3;
        return;
      } 
      if (list.size() >= 2) {
        paramInt3 = f80.getAlignContent();
        if (paramInt3 != 1) {
          h80 h801;
          if (paramInt3 != 2) {
            if (paramInt3 != 3) {
              if (paramInt3 != 4) {
                if (paramInt3 == 5 && j < paramInt1) {
                  float f2 = (paramInt1 - j) / list.size();
                  i = list.size();
                  float f1 = 0.0F;
                  while (paramInt2 < i) {
                    h801 = list.get(paramInt2);
                    float f5 = h801.g + f2;
                    float f4 = f5;
                    float f3 = f1;
                    if (paramInt2 == list.size() - 1) {
                      f4 = f5 + f1;
                      f3 = 0.0F;
                    } 
                    paramInt3 = Math.round(f4);
                    f3 = f4 - paramInt3 + f3;
                    if (f3 > 1.0F) {
                      paramInt1 = paramInt3 + 1;
                      f1 = f3 - 1.0F;
                    } else {
                      f1 = f3;
                      paramInt1 = paramInt3;
                      if (f3 < -1.0F) {
                        paramInt1 = paramInt3 - 1;
                        f1 = f3 + 1.0F;
                      } 
                    } 
                    h801.g = paramInt1;
                    paramInt2++;
                  } 
                } 
              } else {
                if (j >= paramInt1) {
                  h801.setFlexLines(e(paramInt1, j, list));
                  return;
                } 
                paramInt1 = (paramInt1 - j) / list.size() * 2;
                ArrayList<h80> arrayList = new ArrayList();
                h80 h802 = new h80();
                h802.g = paramInt1;
                for (h80 h80 : list) {
                  arrayList.add(h802);
                  arrayList.add(h80);
                  arrayList.add(h802);
                } 
                h801.setFlexLines(arrayList);
                return;
              } 
            } else if (j < paramInt1) {
              float f2 = (paramInt1 - j) / (h80.size() - 1);
              ArrayList<h80> arrayList = new ArrayList();
              paramInt2 = h80.size();
              float f1 = 0.0F;
              paramInt1 = i;
              while (paramInt1 < paramInt2) {
                arrayList.add(h80.get(paramInt1));
                float f = f1;
                if (paramInt1 != h80.size() - 1) {
                  h80 h802 = new h80();
                  if (paramInt1 == h80.size() - 2) {
                    h802.g = Math.round(f1 + f2);
                    f1 = 0.0F;
                  } else {
                    h802.g = Math.round(f2);
                  } 
                  paramInt3 = h802.g;
                  f = f2 - paramInt3 + f1;
                  if (f > 1.0F) {
                    h802.g = paramInt3 + 1;
                    f1 = f - 1.0F;
                  } else {
                    f1 = f;
                    if (f < -1.0F) {
                      h802.g = paramInt3 - 1;
                      f1 = f + 1.0F;
                    } 
                  } 
                  arrayList.add(h802);
                  f = f1;
                } 
                paramInt1++;
                f1 = f;
              } 
              h801.setFlexLines(arrayList);
              return;
            } 
          } else {
            h801.setFlexLines(e(paramInt1, j, (List)h80));
            return;
          } 
        } else {
          h80 h801 = new h80();
          h801.g = paramInt1 - j;
          h80.add(0, h801);
        } 
      } 
    } 
  }
  
  public Object get() {
    return new zw((Executor)((fb1)this.c).get(), (ox0)((fb1)this.e).get(), (p01)((zv0)this.b).get(), (zh1)((fb1)this.f).get(), (zh1)((fb1)this.g).get());
  }
  
  public Object getValue() {
    g32 g32 = (g32)this.g;
    if (g32 == null) {
      n2 n2 = new n2(((TrimActivity)((tx1)this.e).c).H(), (j32)((pp)this.b).a(), ((TrimActivity)((tx1)this.f).c).y());
      ll ll = (ll)this.c;
      String str = ll.b();
      if (str != null) {
        g32 = n2.z(ll, XUaAMlaMSa.Qoe.concat(str));
        this.g = g32;
        return g32;
      } 
      l0.l("Local and anonymous classes can not be ViewModels");
      return null;
    } 
    return g32;
  }
  
  public void h(int paramInt1, int paramInt2, int paramInt3) {
    f80 f80 = (f80)this.e;
    int i = f80.getFlexItemCount();
    boolean[] arrayOfBoolean = (boolean[])this.b;
    boolean bool = false;
    if (arrayOfBoolean == null) {
      this.b = new boolean[Math.max(i, 10)];
    } else if (arrayOfBoolean.length < i) {
      this.b = new boolean[Math.max(arrayOfBoolean.length * 2, i)];
    } else {
      Arrays.fill(arrayOfBoolean, false);
    } 
    if (paramInt3 < f80.getFlexItemCount()) {
      int k;
      int m;
      i = f80.getFlexDirection();
      int j = f80.getFlexDirection();
      if (j != 0 && j != 1) {
        if (j == 2 || j == 3) {
          j = View.MeasureSpec.getMode(paramInt2);
          i = View.MeasureSpec.getSize(paramInt2);
          if (j != 1073741824)
            i = f80.getLargestMainSize(); 
          m = f80.getPaddingTop();
          k = f80.getPaddingBottom();
          j = i;
        } else {
          l0.l(ga1.i("Invalid flex direction: ", i));
          return;
        } 
      } else {
        j = View.MeasureSpec.getMode(paramInt1);
        i = View.MeasureSpec.getSize(paramInt1);
        k = f80.getLargestMainSize();
        if (j != 1073741824)
          i = Math.min(k, i); 
        m = f80.getPaddingLeft();
        k = f80.getPaddingRight();
        j = i;
      } 
      k += m;
      int[] arrayOfInt = (int[])this.c;
      i = bool;
      if (arrayOfInt != null)
        i = arrayOfInt[paramInt3]; 
      List<h80> list = f80.getFlexLinesInternal();
      paramInt3 = list.size();
      cn cn1 = this;
      while (i < paramInt3) {
        h80 h80 = list.get(i);
        m = h80.e;
        if (m < j && h80.q) {
          cn1.l(paramInt1, paramInt2, h80, j, k, false);
        } else if (m > j && h80.r) {
          cn1.x(paramInt1, paramInt2, h80, j, k, false);
        } 
        i++;
      } 
    } 
  }
  
  public void i(int paramInt) {
    int[] arrayOfInt = (int[])this.c;
    if (arrayOfInt == null) {
      this.c = new int[Math.max(paramInt, 10)];
      return;
    } 
    if (arrayOfInt.length < paramInt) {
      paramInt = Math.max(arrayOfInt.length * 2, paramInt);
      this.c = Arrays.copyOf((int[])this.c, paramInt);
    } 
  }
  
  public void j(int paramInt) {
    long[] arrayOfLong = (long[])this.f;
    if (arrayOfLong == null) {
      this.f = new long[Math.max(paramInt, 10)];
      return;
    } 
    if (arrayOfLong.length < paramInt) {
      paramInt = Math.max(arrayOfLong.length * 2, paramInt);
      this.f = Arrays.copyOf((long[])this.f, paramInt);
    } 
  }
  
  public void k(int paramInt) {
    long[] arrayOfLong = (long[])this.g;
    if (arrayOfLong == null) {
      this.g = new long[Math.max(paramInt, 10)];
      return;
    } 
    if (arrayOfLong.length < paramInt) {
      paramInt = Math.max(arrayOfLong.length * 2, paramInt);
      this.g = Arrays.copyOf((long[])this.g, paramInt);
    } 
  }
  
  public void l(int paramInt1, int paramInt2, h80 paramh80, int paramInt3, int paramInt4, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/Object;
    //   4: checkcast f80
    //   7: astore #25
    //   9: aload_3
    //   10: getfield j : F
    //   13: fstore #9
    //   15: fconst_0
    //   16: fstore #10
    //   18: fload #9
    //   20: fconst_0
    //   21: fcmpg
    //   22: ifle -> 1080
    //   25: aload_3
    //   26: getfield e : I
    //   29: istore #20
    //   31: iload #4
    //   33: iload #20
    //   35: if_icmpge -> 41
    //   38: goto -> 1080
    //   41: iload #4
    //   43: iload #20
    //   45: isub
    //   46: i2f
    //   47: fload #9
    //   49: fdiv
    //   50: fstore #12
    //   52: aload_3
    //   53: iload #5
    //   55: aload_3
    //   56: getfield f : I
    //   59: iadd
    //   60: putfield e : I
    //   63: iload #6
    //   65: ifne -> 75
    //   68: aload_3
    //   69: ldc_w -2147483648
    //   72: putfield g : I
    //   75: iconst_0
    //   76: istore #18
    //   78: iconst_0
    //   79: istore #15
    //   81: iconst_0
    //   82: istore #19
    //   84: fconst_0
    //   85: fstore #9
    //   87: iload #18
    //   89: aload_3
    //   90: getfield h : I
    //   93: if_icmpge -> 1054
    //   96: aload_3
    //   97: getfield o : I
    //   100: iload #18
    //   102: iadd
    //   103: istore #21
    //   105: aload #25
    //   107: iload #21
    //   109: invokeinterface g : (I)Landroid/view/View;
    //   114: astore #24
    //   116: aload #24
    //   118: ifnull -> 131
    //   121: aload #24
    //   123: invokevirtual getVisibility : ()I
    //   126: bipush #8
    //   128: if_icmpne -> 134
    //   131: goto -> 1048
    //   134: aload #24
    //   136: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   139: checkcast g80
    //   142: astore #26
    //   144: aload #25
    //   146: invokeinterface getFlexDirection : ()I
    //   151: istore #16
    //   153: iload #16
    //   155: ifeq -> 164
    //   158: iload #16
    //   160: iconst_1
    //   161: if_icmpne -> 167
    //   164: goto -> 597
    //   167: aload #24
    //   169: invokevirtual getMeasuredHeight : ()I
    //   172: istore #16
    //   174: aload_0
    //   175: getfield g : Ljava/lang/Object;
    //   178: checkcast [J
    //   181: astore #27
    //   183: aload #27
    //   185: ifnull -> 199
    //   188: aload #27
    //   190: iload #21
    //   192: laload
    //   193: bipush #32
    //   195: lshr
    //   196: l2i
    //   197: istore #16
    //   199: aload #24
    //   201: invokevirtual getMeasuredWidth : ()I
    //   204: istore #17
    //   206: aload_0
    //   207: getfield g : Ljava/lang/Object;
    //   210: checkcast [J
    //   213: astore #27
    //   215: aload #27
    //   217: ifnull -> 228
    //   220: aload #27
    //   222: iload #21
    //   224: laload
    //   225: l2i
    //   226: istore #17
    //   228: aload_0
    //   229: getfield b : Ljava/lang/Object;
    //   232: checkcast [Z
    //   235: iload #21
    //   237: baload
    //   238: ifne -> 512
    //   241: aload #26
    //   243: invokeinterface c : ()F
    //   248: fload #10
    //   250: fcmpl
    //   251: ifle -> 512
    //   254: iload #16
    //   256: i2f
    //   257: fstore #11
    //   259: aload #26
    //   261: invokeinterface c : ()F
    //   266: fload #12
    //   268: fmul
    //   269: fload #11
    //   271: fadd
    //   272: fstore #14
    //   274: fload #14
    //   276: fstore #13
    //   278: fload #9
    //   280: fstore #11
    //   282: iload #18
    //   284: aload_3
    //   285: getfield h : I
    //   288: iconst_1
    //   289: isub
    //   290: if_icmpne -> 304
    //   293: fload #14
    //   295: fload #9
    //   297: fadd
    //   298: fstore #13
    //   300: fload #10
    //   302: fstore #11
    //   304: fload #13
    //   306: invokestatic round : (F)I
    //   309: istore #17
    //   311: iload #17
    //   313: aload #26
    //   315: invokeinterface p : ()I
    //   320: if_icmple -> 369
    //   323: aload #26
    //   325: invokeinterface p : ()I
    //   330: istore #16
    //   332: aload_0
    //   333: getfield b : Ljava/lang/Object;
    //   336: checkcast [Z
    //   339: iload #21
    //   341: iconst_1
    //   342: bastore
    //   343: aload_3
    //   344: aload_3
    //   345: getfield j : F
    //   348: aload #26
    //   350: invokeinterface c : ()F
    //   355: fsub
    //   356: putfield j : F
    //   359: iconst_1
    //   360: istore #15
    //   362: fload #11
    //   364: fstore #9
    //   366: goto -> 440
    //   369: fload #13
    //   371: iload #17
    //   373: i2f
    //   374: fsub
    //   375: fload #11
    //   377: fadd
    //   378: fstore #9
    //   380: fload #9
    //   382: f2d
    //   383: dstore #7
    //   385: dload #7
    //   387: dconst_1
    //   388: dcmpl
    //   389: ifle -> 412
    //   392: iload #17
    //   394: iconst_1
    //   395: iadd
    //   396: istore #16
    //   398: dload #7
    //   400: dconst_1
    //   401: dsub
    //   402: dstore #7
    //   404: dload #7
    //   406: d2f
    //   407: fstore #9
    //   409: goto -> 440
    //   412: iload #17
    //   414: istore #16
    //   416: dload #7
    //   418: ldc2_w -1.0
    //   421: dcmpg
    //   422: ifge -> 409
    //   425: iload #17
    //   427: iconst_1
    //   428: isub
    //   429: istore #16
    //   431: dload #7
    //   433: dconst_1
    //   434: dadd
    //   435: dstore #7
    //   437: goto -> 404
    //   440: aload_0
    //   441: iload_1
    //   442: aload #26
    //   444: aload_3
    //   445: getfield m : I
    //   448: invokevirtual n : (ILg80;I)I
    //   451: istore #22
    //   453: iload #16
    //   455: ldc_w 1073741824
    //   458: invokestatic makeMeasureSpec : (II)I
    //   461: istore #23
    //   463: aload #24
    //   465: iload #22
    //   467: iload #23
    //   469: invokevirtual measure : (II)V
    //   472: aload #24
    //   474: invokevirtual getMeasuredWidth : ()I
    //   477: istore #17
    //   479: aload #24
    //   481: invokevirtual getMeasuredHeight : ()I
    //   484: istore #16
    //   486: aload_0
    //   487: iload #21
    //   489: iload #22
    //   491: iload #23
    //   493: aload #24
    //   495: invokevirtual D : (IIILandroid/view/View;)V
    //   498: aload #25
    //   500: aload #24
    //   502: iload #21
    //   504: invokeinterface h : (Landroid/view/View;I)V
    //   509: goto -> 512
    //   512: aload #26
    //   514: invokeinterface s : ()I
    //   519: istore #22
    //   521: aload #26
    //   523: invokeinterface k : ()I
    //   528: istore #21
    //   530: iload #19
    //   532: aload #25
    //   534: aload #24
    //   536: invokeinterface k : (Landroid/view/View;)I
    //   541: iload #21
    //   543: iload #22
    //   545: iload #17
    //   547: iadd
    //   548: iadd
    //   549: iadd
    //   550: invokestatic max : (II)I
    //   553: istore #17
    //   555: aload_3
    //   556: getfield e : I
    //   559: istore #19
    //   561: aload #26
    //   563: invokeinterface v : ()I
    //   568: istore #21
    //   570: aload_3
    //   571: aload #26
    //   573: invokeinterface r : ()I
    //   578: iload #21
    //   580: iload #16
    //   582: iadd
    //   583: iadd
    //   584: iload #19
    //   586: iadd
    //   587: putfield e : I
    //   590: iload #17
    //   592: istore #16
    //   594: goto -> 1028
    //   597: aload #24
    //   599: invokevirtual getMeasuredWidth : ()I
    //   602: istore #16
    //   604: aload_0
    //   605: getfield g : Ljava/lang/Object;
    //   608: checkcast [J
    //   611: astore #27
    //   613: aload #27
    //   615: ifnull -> 626
    //   618: aload #27
    //   620: iload #21
    //   622: laload
    //   623: l2i
    //   624: istore #16
    //   626: aload #24
    //   628: invokevirtual getMeasuredHeight : ()I
    //   631: istore #17
    //   633: aload_0
    //   634: getfield g : Ljava/lang/Object;
    //   637: checkcast [J
    //   640: astore #27
    //   642: aload #27
    //   644: ifnull -> 658
    //   647: aload #27
    //   649: iload #21
    //   651: laload
    //   652: bipush #32
    //   654: lshr
    //   655: l2i
    //   656: istore #17
    //   658: aload_0
    //   659: getfield b : Ljava/lang/Object;
    //   662: checkcast [Z
    //   665: iload #21
    //   667: baload
    //   668: ifne -> 946
    //   671: aload #26
    //   673: invokeinterface c : ()F
    //   678: fload #10
    //   680: fcmpl
    //   681: ifle -> 946
    //   684: iload #16
    //   686: i2f
    //   687: fstore #11
    //   689: aload #26
    //   691: invokeinterface c : ()F
    //   696: fload #12
    //   698: fmul
    //   699: fload #11
    //   701: fadd
    //   702: fstore #14
    //   704: fload #14
    //   706: fstore #13
    //   708: fload #9
    //   710: fstore #11
    //   712: iload #18
    //   714: aload_3
    //   715: getfield h : I
    //   718: iconst_1
    //   719: isub
    //   720: if_icmpne -> 734
    //   723: fload #14
    //   725: fload #9
    //   727: fadd
    //   728: fstore #13
    //   730: fload #10
    //   732: fstore #11
    //   734: fload #13
    //   736: invokestatic round : (F)I
    //   739: istore #17
    //   741: iload #17
    //   743: aload #26
    //   745: invokeinterface u : ()I
    //   750: if_icmple -> 795
    //   753: aload #26
    //   755: invokeinterface u : ()I
    //   760: istore #16
    //   762: aload_0
    //   763: getfield b : Ljava/lang/Object;
    //   766: checkcast [Z
    //   769: iload #21
    //   771: iconst_1
    //   772: bastore
    //   773: aload_3
    //   774: aload_3
    //   775: getfield j : F
    //   778: aload #26
    //   780: invokeinterface c : ()F
    //   785: fsub
    //   786: putfield j : F
    //   789: iconst_1
    //   790: istore #15
    //   792: goto -> 870
    //   795: fload #13
    //   797: iload #17
    //   799: i2f
    //   800: fsub
    //   801: fload #11
    //   803: fadd
    //   804: fstore #9
    //   806: fload #9
    //   808: f2d
    //   809: dstore #7
    //   811: dload #7
    //   813: dconst_1
    //   814: dcmpl
    //   815: ifle -> 842
    //   818: iload #17
    //   820: iconst_1
    //   821: iadd
    //   822: istore #16
    //   824: dload #7
    //   826: dconst_1
    //   827: dsub
    //   828: dstore #7
    //   830: dload #7
    //   832: d2f
    //   833: fstore #9
    //   835: fload #9
    //   837: fstore #11
    //   839: goto -> 870
    //   842: iload #17
    //   844: istore #16
    //   846: dload #7
    //   848: ldc2_w -1.0
    //   851: dcmpg
    //   852: ifge -> 835
    //   855: iload #17
    //   857: iconst_1
    //   858: isub
    //   859: istore #16
    //   861: dload #7
    //   863: dconst_1
    //   864: dadd
    //   865: dstore #7
    //   867: goto -> 830
    //   870: aload_0
    //   871: iload_2
    //   872: aload #26
    //   874: aload_3
    //   875: getfield m : I
    //   878: invokevirtual m : (ILg80;I)I
    //   881: istore #22
    //   883: iload #16
    //   885: ldc_w 1073741824
    //   888: invokestatic makeMeasureSpec : (II)I
    //   891: istore #23
    //   893: aload #24
    //   895: iload #23
    //   897: iload #22
    //   899: invokevirtual measure : (II)V
    //   902: aload #24
    //   904: invokevirtual getMeasuredWidth : ()I
    //   907: istore #16
    //   909: aload #24
    //   911: invokevirtual getMeasuredHeight : ()I
    //   914: istore #17
    //   916: aload_0
    //   917: iload #21
    //   919: iload #23
    //   921: iload #22
    //   923: aload #24
    //   925: invokevirtual D : (IIILandroid/view/View;)V
    //   928: aload #25
    //   930: aload #24
    //   932: iload #21
    //   934: invokeinterface h : (Landroid/view/View;I)V
    //   939: fload #11
    //   941: fstore #9
    //   943: goto -> 946
    //   946: aload #26
    //   948: invokeinterface v : ()I
    //   953: istore #21
    //   955: aload #26
    //   957: invokeinterface r : ()I
    //   962: istore #22
    //   964: iload #19
    //   966: aload #25
    //   968: aload #24
    //   970: invokeinterface k : (Landroid/view/View;)I
    //   975: iload #22
    //   977: iload #21
    //   979: iload #17
    //   981: iadd
    //   982: iadd
    //   983: iadd
    //   984: invokestatic max : (II)I
    //   987: istore #17
    //   989: aload_3
    //   990: getfield e : I
    //   993: istore #21
    //   995: aload #26
    //   997: invokeinterface s : ()I
    //   1002: istore #19
    //   1004: aload_3
    //   1005: aload #26
    //   1007: invokeinterface k : ()I
    //   1012: iload #19
    //   1014: iload #16
    //   1016: iadd
    //   1017: iadd
    //   1018: iload #21
    //   1020: iadd
    //   1021: putfield e : I
    //   1024: iload #17
    //   1026: istore #16
    //   1028: aload_3
    //   1029: aload_3
    //   1030: getfield g : I
    //   1033: iload #16
    //   1035: invokestatic max : (II)I
    //   1038: putfield g : I
    //   1041: iload #16
    //   1043: istore #19
    //   1045: goto -> 1048
    //   1048: iinc #18, 1
    //   1051: goto -> 87
    //   1054: iload #15
    //   1056: ifeq -> 1080
    //   1059: iload #20
    //   1061: aload_3
    //   1062: getfield e : I
    //   1065: if_icmpeq -> 1080
    //   1068: aload_0
    //   1069: iload_1
    //   1070: iload_2
    //   1071: aload_3
    //   1072: iload #4
    //   1074: iload #5
    //   1076: iconst_1
    //   1077: invokevirtual l : (IILh80;IIZ)V
    //   1080: return
  }
  
  public int m(int paramInt1, g80 paramg80, int paramInt2) {
    f80 f80 = (f80)this.e;
    int k = f80.getPaddingTop();
    int i = f80.getPaddingBottom();
    int j = paramg80.v();
    paramInt2 = f80.d(paramInt1, paramg80.r() + j + i + k + paramInt2, paramg80.getHeight());
    i = View.MeasureSpec.getSize(paramInt2);
    if (i > paramg80.p())
      return View.MeasureSpec.makeMeasureSpec(paramg80.p(), View.MeasureSpec.getMode(paramInt2)); 
    paramInt1 = paramInt2;
    if (i < paramg80.l())
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramg80.l(), View.MeasureSpec.getMode(paramInt2)); 
    return paramInt1;
  }
  
  public int n(int paramInt1, g80 paramg80, int paramInt2) {
    f80 f80 = (f80)this.e;
    int i = f80.getPaddingLeft();
    int k = f80.getPaddingRight();
    int j = paramg80.s();
    paramInt2 = f80.i(paramInt1, paramg80.k() + j + k + i + paramInt2, paramg80.getWidth());
    i = View.MeasureSpec.getSize(paramInt2);
    if (i > paramg80.u())
      return View.MeasureSpec.makeMeasureSpec(paramg80.u(), View.MeasureSpec.getMode(paramInt2)); 
    paramInt1 = paramInt2;
    if (i < paramg80.m())
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramg80.m(), View.MeasureSpec.getMode(paramInt2)); 
    return paramInt1;
  }
  
  public void p(View paramView, h80 paramh80, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    g80 g80 = (g80)paramView.getLayoutParams();
    f80 f80 = (f80)this.e;
    int i = f80.getAlignItems();
    if (g80.g() != -1)
      i = g80.g(); 
    int j = paramh80.g;
    if (i != 0)
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return; 
          } else {
            j = f80.getFlexWrap();
            i = paramh80.l;
            if (j != 2) {
              i = Math.max(i - paramView.getBaseline(), g80.v());
              paramView.layout(paramInt1, paramInt2 + i, paramInt3, paramInt4 + i);
              return;
            } 
            j = paramView.getMeasuredHeight();
            i = Math.max(paramView.getBaseline() + i - j, g80.r());
            paramView.layout(paramInt1, paramInt2 - i, paramInt3, paramInt4 - i);
            return;
          } 
        } else {
          paramInt4 = paramView.getMeasuredHeight();
          paramInt4 = (g80.v() + j - paramInt4 - g80.r()) / 2;
          if (f80.getFlexWrap() != 2) {
            paramInt2 += paramInt4;
            paramView.layout(paramInt1, paramInt2, paramInt3, paramView.getMeasuredHeight() + paramInt2);
            return;
          } 
          paramInt2 -= paramInt4;
          paramView.layout(paramInt1, paramInt2, paramInt3, paramView.getMeasuredHeight() + paramInt2);
          return;
        } 
      } else {
        if (f80.getFlexWrap() != 2) {
          paramInt2 += j;
          paramView.layout(paramInt1, paramInt2 - paramView.getMeasuredHeight() - g80.r(), paramInt3, paramInt2 - g80.r());
          return;
        } 
        i = paramView.getMeasuredHeight();
        int m = g80.v();
        int k = paramView.getMeasuredHeight();
        paramView.layout(paramInt1, m + i + paramInt2 - j, paramInt3, g80.v() + k + paramInt4 - j);
        return;
      }  
    if (f80.getFlexWrap() != 2) {
      paramView.layout(paramInt1, g80.v() + paramInt2, paramInt3, g80.v() + paramInt4);
      return;
    } 
    paramView.layout(paramInt1, paramInt2 - g80.r(), paramInt3, paramInt4 - g80.r());
  }
  
  public void q(View paramView, h80 paramh80, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    g80 g80 = (g80)paramView.getLayoutParams();
    int i = ((f80)this.e).getAlignItems();
    if (g80.g() != -1)
      i = g80.g(); 
    int j = paramh80.g;
    if (i != 0)
      if (i != 1) {
        if (i != 2) {
          if (i != 3 && i != 4)
            return; 
        } else {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
          i = paramView.getMeasuredWidth();
          i = (marginLayoutParams.getMarginStart() + j - i - marginLayoutParams.getMarginEnd()) / 2;
          if (!paramBoolean) {
            paramView.layout(paramInt1 + i, paramInt2, paramInt3 + i, paramInt4);
            return;
          } 
          paramView.layout(paramInt1 - i, paramInt2, paramInt3 - i, paramInt4);
          return;
        } 
      } else {
        if (!paramBoolean) {
          paramView.layout(paramInt1 + j - paramView.getMeasuredWidth() - g80.k(), paramInt2, paramInt3 + j - paramView.getMeasuredWidth() - g80.k(), paramInt4);
          return;
        } 
        i = paramView.getMeasuredWidth();
        int m = g80.s();
        int k = paramView.getMeasuredWidth();
        paramView.layout(m + i + paramInt1 - j, paramInt2, g80.s() + k + paramInt3 - j, paramInt4);
        return;
      }  
    if (!paramBoolean) {
      paramView.layout(g80.s() + paramInt1, paramInt2, g80.s() + paramInt3, paramInt4);
      return;
    } 
    paramView.layout(paramInt1 - g80.k(), paramInt2, paramInt3 - g80.k(), paramInt4);
  }
  
  public void t(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    ArrayList<to0> arrayList;
    to0 to0;
    HashMap hashMap = (HashMap)this.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      to0 = new to0();
      this(paramBroadcastReceiver, paramIntentFilter);
      ArrayList<to0> arrayList1 = (ArrayList)((HashMap)this.e).get(paramBroadcastReceiver);
      arrayList = arrayList1;
      if (arrayList1 == null) {
        arrayList = new ArrayList();
        this(1);
        ((HashMap<BroadcastReceiver, ArrayList>)this.e).put(paramBroadcastReceiver, arrayList);
      } 
    } finally {}
    arrayList.add(to0);
    for (byte b = 0; b < paramIntentFilter.countActions(); b++) {
      String str = paramIntentFilter.getAction(b);
      arrayList = (ArrayList<to0>)((HashMap)this.f).get(str);
      ArrayList<to0> arrayList1 = arrayList;
      if (arrayList == null) {
        arrayList1 = new ArrayList<to0>();
        this(1);
        ((HashMap<String, ArrayList<to0>>)this.f).put(str, arrayList1);
      } 
      arrayList1.add(to0);
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
  }
  
  public void u(ya paramya) {
    k91 k91 = new k91(19);
    vw1 vw1 = (vw1)this.g;
    ib ib = (ib)this.c;
    String str = (String)this.e;
    dw1 dw1 = (dw1)this.f;
    j40 j40 = (j40)this.b;
    zw zw = vw1.c;
    fa1 fa1 = paramya.c;
    zv0 zv0 = ib.a();
    zv0.A(ib.a);
    zv0.f = fa1;
    zv0.e = ib.b;
    ib = zv0.j();
    Object object = new Object();
    ((m2)object).f = new HashMap<Object, Object>();
    ((m2)object).d = Long.valueOf(vw1.a.i());
    ((m2)object).e = Long.valueOf(vw1.b.i());
    ((m2)object).a = str;
    ((m2)object).c = new g40(j40, (byte[])dw1.apply(paramya.b));
    ((m2)object).b = paramya.a;
    za za = object.c();
    zw.b.execute(new ww(zw, ib, k91, za));
  }
  
  public void v(Intent paramIntent) {
    byte b;
    Set set;
    String str1;
    String str2;
    String str3;
    Uri uri;
    HashMap hashMap = (HashMap)this.e;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      str3 = paramIntent.getAction();
      str2 = paramIntent.resolveTypeIfNeeded(((Context)this.c).getContentResolver());
      uri = paramIntent.getData();
      str1 = paramIntent.getScheme();
      set = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) != 0) {
        b = 1;
      } else {
        b = 0;
      } 
      if (b) {
        String str = hbrAVtEa.OARCu;
        StringBuilder stringBuilder = new StringBuilder();
        this("Resolving type ");
        stringBuilder.append(str2);
        stringBuilder.append(" scheme ");
        stringBuilder.append(str1);
        stringBuilder.append(" of intent ");
        stringBuilder.append(paramIntent);
        Log.v(str, stringBuilder.toString());
      } 
    } finally {}
    ArrayList<to0> arrayList = (ArrayList)((HashMap)this.f).get(paramIntent.getAction());
    if (arrayList != null) {
      if (b) {
        StringBuilder stringBuilder = new StringBuilder();
        this("Action list: ");
        stringBuilder.append(arrayList);
        Log.v("LocalBroadcastManager", stringBuilder.toString());
      } 
      ArrayList<to0> arrayList1 = null;
      byte b1 = 0;
      while (b1 < arrayList.size()) {
        ArrayList<to0> arrayList2;
        to0 to0 = arrayList.get(b1);
        if (b) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Matching against filter ");
          stringBuilder.append(to0.a);
          Log.v("LocalBroadcastManager", stringBuilder.toString());
        } 
        if (to0.c) {
          if (b)
            Log.v("LocalBroadcastManager", "  Filter's target already added"); 
          arrayList2 = arrayList1;
        } else {
          int i = to0.a.match(str3, str2, str1, uri, set, "LocalBroadcastManager");
          if (i >= 0) {
            if (b) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("  Filter matched!  match=0x");
              stringBuilder.append(Integer.toHexString(i));
              Log.v("LocalBroadcastManager", stringBuilder.toString());
            } 
            arrayList2 = arrayList1;
            if (arrayList1 == null) {
              arrayList2 = new ArrayList();
              this();
            } 
            arrayList2.add(to0);
            to0.c = true;
          } else {
            arrayList2 = arrayList1;
            if (b) {
              String str;
              if (i != -4) {
                if (i != -3) {
                  if (i != -2) {
                    if (i != -1) {
                      str = "unknown reason";
                    } else {
                      str = "type";
                    } 
                  } else {
                    str = "data";
                  } 
                } else {
                  str = "action";
                } 
              } else {
                str = "category";
              } 
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("  Filter did not match: ");
              stringBuilder.append(str);
              Log.v("LocalBroadcastManager", stringBuilder.toString());
              arrayList2 = arrayList1;
            } 
          } 
        } 
        b1++;
        arrayList1 = arrayList2;
      } 
      if (arrayList1 != null) {
        for (b = 0; b < arrayList1.size(); b++)
          ((to0)arrayList1.get(b)).c = false; 
        arrayList = (ArrayList<to0>)this.b;
        g7 g7 = new g7();
        this(24, paramIntent, arrayList1);
        arrayList.add(g7);
        if (!((cj)this.g).hasMessages(1))
          ((cj)this.g).sendEmptyMessage(1); 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
        return;
      } 
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
  }
  
  public void w(String paramString, Object paramObject) {
    f1 f1 = dd1.f;
    paramString.getClass();
    ((LinkedHashMap<String, Object>)this.c).put(paramString, paramObject);
    ip1 ip12 = (ip1)((LinkedHashMap)this.b).get(paramString);
    if (ip12 != null) {
      Object object;
      if (paramObject == null) {
        object = f1;
      } else {
        object = paramObject;
      } 
      ip12.g(null, object);
    } 
    ip1 ip11 = (ip1)((LinkedHashMap)this.f).get(paramString);
    if (ip11 != null) {
      Object object = paramObject;
      if (paramObject == null)
        object = f1; 
      ip11.g(null, object);
    } 
  }
  
  public void x(int paramInt1, int paramInt2, h80 paramh80, int paramInt3, int paramInt4, boolean paramBoolean) {
    f80 f80 = (f80)this.e;
    int i = paramh80.e;
    float f1 = paramh80.k;
    float f2 = 0.0F;
    if (f1 > 0.0F && paramInt3 <= i) {
      float f = (i - paramInt3) / f1;
      paramh80.e = paramInt4 + paramh80.f;
      if (!paramBoolean)
        paramh80.g = Integer.MIN_VALUE; 
      byte b = 0;
      int j = 0;
      int k = 0;
      f1 = 0.0F;
      while (true) {
        int m;
        if (b < paramh80.h) {
          int i1 = paramh80.o + b;
          View view = f80.g(i1);
          if (view == null || view.getVisibility() == 8)
            continue; 
          g80 g80 = (g80)view.getLayoutParams();
          m = f80.getFlexDirection();
          if (m == 0 || m == 1) {
            m = j;
          } else {
            int i3 = view.getMeasuredHeight();
            long[] arrayOfLong1 = (long[])this.g;
            if (arrayOfLong1 != null)
              i3 = (int)(arrayOfLong1[i1] >> 32L); 
            m = view.getMeasuredWidth();
            arrayOfLong1 = (long[])this.g;
            if (arrayOfLong1 != null)
              m = (int)arrayOfLong1[i1]; 
            if (!((boolean[])this.b)[i1] && g80.h() > f2) {
              float f5 = i3 - g80.h() * f;
              float f4 = f5;
              float f3 = f1;
              if (b == paramh80.h - 1) {
                f4 = f5 + f1;
                f3 = f2;
              } 
              m = Math.round(f4);
              if (m < g80.l()) {
                m = g80.l();
                ((boolean[])this.b)[i1] = true;
                paramh80.k -= g80.h();
                j = 1;
                f1 = f3;
              } else {
                f1 = f4 - m + f3;
                double d = f1;
                if (d > 1.0D) {
                  m++;
                  f1--;
                } else if (d < -1.0D) {
                  m--;
                  f1++;
                } 
              } 
              int i5 = n(paramInt1, g80, paramh80.m);
              int i6 = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
              view.measure(i5, i6);
              m = view.getMeasuredWidth();
              i3 = view.getMeasuredHeight();
              D(i1, i5, i6, view);
              f80.h(view, i1);
            } 
            int i4 = g80.s();
            i1 = g80.k();
            m = Math.max(k, f80.k(view) + i1 + i4 + m);
            k = paramh80.e;
            i1 = g80.v();
            paramh80.e = g80.r() + i1 + i3 + k;
            paramh80.g = Math.max(paramh80.g, m);
            k = m;
          } 
          j = view.getMeasuredWidth();
          long[] arrayOfLong = (long[])this.g;
          if (arrayOfLong != null)
            j = (int)arrayOfLong[i1]; 
          int n = view.getMeasuredHeight();
          arrayOfLong = (long[])this.g;
          if (arrayOfLong != null)
            n = (int)(arrayOfLong[i1] >> 32L); 
          if (!((boolean[])this.b)[i1] && g80.h() > f2) {
            float f5 = j - g80.h() * f;
            float f4 = f5;
            float f3 = f1;
            if (b == paramh80.h - 1) {
              f4 = f5 + f1;
              f3 = f2;
            } 
            n = Math.round(f4);
            if (n < g80.m()) {
              j = g80.m();
              ((boolean[])this.b)[i1] = true;
              paramh80.k -= g80.h();
              m = 1;
              f1 = f3;
            } else {
              f3 = f4 - n + f3;
              double d = f3;
              if (d > 1.0D) {
                j = n + 1;
                f1 = f3 - 1.0F;
              } else {
                f1 = f3;
                j = n;
                if (d < -1.0D) {
                  j = n - 1;
                  f1 = f3 + 1.0F;
                } 
              } 
            } 
            int i3 = m(paramInt2, g80, paramh80.m);
            int i4 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
            view.measure(i4, i3);
            j = view.getMeasuredWidth();
            n = view.getMeasuredHeight();
            D(i1, i4, i3, view);
            f80.h(view, i1);
          } 
          i1 = g80.v();
          int i2 = g80.r();
          n = Math.max(k, f80.k(view) + i2 + i1 + n);
          k = paramh80.e;
          i1 = g80.s();
          paramh80.e = g80.k() + i1 + j + k;
          j = m;
          m = n;
        } else {
          break;
        } 
        paramh80.g = Math.max(paramh80.g, m);
        k = m;
        b++;
      } 
      if (j != 0 && i != paramh80.e)
        x(paramInt1, paramInt2, paramh80, paramInt3, paramInt4, true); 
    } 
  }
  
  public void z(View paramView, int paramInt1, int paramInt2) {
    g80 g80 = (g80)paramView.getLayoutParams();
    int i = g80.s();
    int j = g80.k();
    f80 f80 = (f80)this.e;
    i = Math.min(Math.max(paramInt1 - i - j - f80.k(paramView), g80.m()), g80.u());
    long[] arrayOfLong = (long[])this.g;
    if (arrayOfLong != null) {
      paramInt1 = (int)(arrayOfLong[paramInt2] >> 32L);
    } else {
      paramInt1 = paramView.getMeasuredHeight();
    } 
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    paramView.measure(i, paramInt1);
    D(paramInt2, i, paramInt1, paramView);
    f80.h(paramView, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */