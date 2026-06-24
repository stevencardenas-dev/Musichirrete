import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cj extends Handler {
  public final int a;
  
  public final Object b;
  
  public cj(yt0 paramyt0) {
    super(Looper.getMainLooper());
  }
  
  private final void a(Message paramMessage) {
    if (paramMessage.what == 1)
      synchronized (((rv0)this.b).a) {
        tv0 tv0 = ((rv0)this.b).d.get();
        rv0 rv0 = (rv0)this.b;
        cj cj1 = rv0.e;
        if (tv0 != null)
          synchronized (tv0.d) {
            rv0 rv01 = tv0.i;
            if (rv0 == rv01 && cj1 != null) {
              tv0.d((aw0)paramMessage.obj);
              ((rv0)this.b).a(tv0, cj1);
              tv0.d(null);
              return;
            } 
          }  
      }  
  }
  
  private final void b(Message paramMessage) {
    if (paramMessage.what == 1)
      synchronized (((l01)this.b).a) {
        m01 m01 = ((l01)this.b).c.get();
        l01 l01 = (l01)this.b;
        cj cj1 = l01.d;
        if (m01 != null)
          synchronized (m01.c) {
            l01 l011 = m01.j;
            if (l01 == l011 && cj1 != null) {
              m01.c((aw0)paramMessage.obj);
              ((l01)this.b).getClass();
              m01.c(null);
              return;
            } 
          }  
      }  
  }
  
  public final void handleMessage(Message paramMessage) {
    Long long_;
    w91 w91;
    av0 av0;
    Bundle bundle;
    String str;
    g7[] arrayOfG7;
    Object object1;
    int j;
    zu0 zu0;
    eu0 eu0;
    NetworkInfo networkInfo;
    c00 c002;
    Handler handler;
    uf uf;
    c00 c001;
    kh0 kh0;
    cj cj1;
    Object object2;
    c00 c003;
    Object object3;
    SparseArray sparseArray;
    Object object4;
    int i = this.a;
    ae0 ae0 = null;
    cf1 cf1 = null;
    rp1 rp1 = null;
    boolean bool2 = false;
    boolean bool1 = true;
    switch (i) {
      default:
        rp1 = (rp1)this.b;
        i = paramMessage.what;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4) {
                  v61.i.post(new a00(paramMessage, 1));
                } else {
                  long_ = (Long)paramMessage.obj;
                  rp1.k++;
                  long l = rp1.e;
                  l = long_.longValue() + l;
                  rp1.e = l;
                  rp1.h = l / rp1.k;
                } 
              } else {
                long l = ((Message)long_).arg1;
                rp1.m++;
                l = rp1.g + l;
                rp1.g = l;
                rp1.j = l / rp1.l;
              } 
            } else {
              long l = ((Message)long_).arg1;
              i = rp1.l + 1;
              rp1.l = i;
              l = rp1.f + l;
              rp1.f = l;
              rp1.i = l / i;
            } 
          } else {
            rp1.d++;
          } 
        } else {
          rp1.c++;
        } 
        return;
      case 9:
        if (((Message)long_).what == 1) {
          w91 = (w91)this.b;
          PreferenceScreen preferenceScreen = w91.b0.g;
          if (preferenceScreen != null) {
            w91.c0.setAdapter(new z91((PreferenceGroup)preferenceScreen));
            preferenceScreen.l();
          } 
        } 
        return;
      case 8:
        b((Message)w91);
        return;
      case 7:
        a((Message)w91);
        return;
      case 6:
        zu0 = (zu0)this.b;
        i = ((Message)w91).what;
        if (i != 1) {
          if (i == 2) {
            zu0.h = false;
            zu0.e(zu0.g);
          } 
        } else {
          zu0.j = false;
          ae0 = zu0.f;
          if (ae0 != null) {
            av0 = zu0.i;
            ee0 ee0 = ae0.a;
            gv0 gv0 = ee0.d(zu0);
            if (gv0 != null)
              ee0.o(gv0, av0); 
          } 
        } 
        return;
      case 5:
        eu0 = (eu0)this.b;
        cj1 = eu0.z;
        i = ((Message)av0).what;
        if (i != 1) {
          if (i != 2) {
            if (i == 3 && eu0.l.isEmpty()) {
              eu0.j(3);
              cj1.removeMessages(2);
              cj1.removeMessages(3);
              cj1.removeMessages(1);
              eu0.i.j(eu0.j);
            } 
          } else if (eu0.l.isEmpty()) {
            eu0.j(2);
            cj1.removeMessages(2);
            cj1.removeMessages(3);
            cj1.sendMessageDelayed(cj1.obtainMessage(3), 15000L);
          } 
        } else {
          eu0.f((List)((Message)av0).obj);
        } 
        return;
      case 4:
        i = ((Message)av0).what;
        j = ((Message)av0).arg1;
        object2 = ((Message)av0).obj;
        bundle = av0.peekData();
        sparseArray = ((yt0)this.b).j;
        cf1 = (cf1)sparseArray.get(j);
        if (cf1 == null) {
          Log.w("MR2Provider", "Pending callback not found for control request.");
        } else {
          sparseArray.remove(j);
          if (i != 3) {
            if (i == 4) {
              eu0 eu01;
              if (bundle == null) {
                eu01 = eu0;
              } else {
                str = eu01.getString("error");
              } 
              cf1.a(str, (Bundle)object2);
            } 
          } else {
            cf1.b((Bundle)object2);
          } 
        } 
        return;
      case 3:
        if (((Message)str).what != 1) {
          super.handleMessage((Message)str);
        } else {
          cn cn = (cn)this.b;
          while (true) {
            int k;
            object2 = cn.e;
            /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            try {
              k = ((ArrayList)cn.b).size();
              if (k <= 0) {
                /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                return;
              } 
            } finally {}
            arrayOfG7 = new g7[k];
            ((ArrayList)cn.b).toArray((Object[])arrayOfG7);
            ((ArrayList)cn.b).clear();
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            for (i = 0; i < k; i++) {
              object2 = arrayOfG7[i];
              int m = ((ArrayList)((g7)object2).e).size();
              for (j = 0; j < m; j++) {
                to0 to0 = ((ArrayList<to0>)((g7)object2).e).get(j);
                if (!to0.d)
                  to0.b.onReceive((Context)cn.c, (Intent)((g7)object2).c); 
              } 
            } 
          } 
        } 
        return;
      case 2:
        object2 = this.b;
        i = ((Message)arrayOfG7).what;
        if (i != 0) {
          if (i == 1) {
            r71 r71 = (r71)((Message)arrayOfG7).obj;
            if (((Message)arrayOfG7).arg1 != 0)
              ((p60)object2).o--; 
            if (((p60)object2).o == 0 && !((p60)object2).p.equals(r71)) {
              ((p60)object2).p = r71;
              object2.q(new m60(0, r71));
            } 
          } else {
            throw new IllegalStateException();
          } 
        } else {
          q71 q71 = (q71)((Message)arrayOfG7).obj;
          i = ((Message)arrayOfG7).arg1;
          j = ((Message)arrayOfG7).arg2;
          if (j == -1)
            bool1 = false; 
          i = ((p60)object2).l - i;
          ((p60)object2).l = i;
          if (i == 0) {
            object1 = q71;
            if (q71.c == -9223372036854775807L)
              object1 = q71.a(q71.b, 0L, q71.d, q71.l); 
            if (!((p60)object2).q.a.n() && ((q71)object1).a.n()) {
              ((p60)object2).s = 0;
              ((p60)object2).r = 0;
              ((p60)object2).t = 0L;
            } 
            if (((p60)object2).m) {
              i = 0;
            } else {
              i = 2;
            } 
            bool2 = ((p60)object2).n;
            ((p60)object2).m = false;
            ((p60)object2).n = false;
            object2.t((q71)object1, bool1, j, i, bool2);
          } 
        } 
        return;
      case 1:
        switch (((Message)object1).what) {
          default:
            v61.i.post(new a00((Message)object1, 0));
            return;
          case 12:
            object4 = ((Message)object1).obj;
            c003 = (c00)this.b;
            if (c003.g.remove(object4)) {
              Iterator<kh0> iterator = c003.f.values().iterator();
              object1 = object2;
              while (iterator.hasNext()) {
                object2 = iterator.next();
                if (((kh0)object2).g.equals(object4)) {
                  Object object = object1;
                  if (object1 == null)
                    object = new ArrayList(); 
                  object.add(object2);
                  iterator.remove();
                  object1 = object;
                } 
              } 
              if (object1 != null) {
                Handler handler1 = c003.i;
                handler1.sendMessage(handler1.obtainMessage(13, object1));
              } 
            } 
            return;
          case 11:
            object3 = ((Message)object1).obj;
            object2 = this.b;
            if (((c00)object2).g.add(object3)) {
              Iterator<uf> iterator = ((c00)object2).d.values().iterator();
              while (iterator.hasNext()) {
                object1 = iterator.next();
                ((uf)object1).b.getClass();
                kh0 kh01 = ((uf)object1).l;
                object4 = ((uf)object1).m;
                if (object4 != null && !object4.isEmpty()) {
                  i = 1;
                } else {
                  i = 0;
                } 
                if (kh01 == null && i == 0)
                  continue; 
                if (kh01 != null && kh01.g.equals(object3)) {
                  object1.d(kh01);
                  ((c00)object2).f.put(kh01.a(), kh01);
                } 
                if (i != 0)
                  for (i = object4.size() - 1; i >= 0; i--) {
                    kh01 = object4.get(i);
                    if (kh01.g.equals(object3)) {
                      object1.d(kh01);
                      ((c00)object2).f.put(kh01.a(), kh01);
                    } 
                  }  
                if (object1.b())
                  iterator.remove(); 
              } 
            } 
            return;
          case 10:
            ((c00)this.b).getClass();
            return;
          case 9:
            networkInfo = (NetworkInfo)((Message)object1).obj;
            object1 = this.b;
            object2 = ((c00)object1).b;
            if (object2 instanceof z61) {
              object2 = object2;
              if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
                object2.a(3);
              } else {
                i = networkInfo.getType();
                if (i != 0) {
                  if (i != 1 && i != 6 && i != 9) {
                    object2.a(3);
                  } else {
                    object2.a(4);
                  } 
                } else {
                  i = networkInfo.getSubtype();
                  switch (i) {
                    default:
                      switch (i) {
                        default:
                          object2.a(3);
                          break;
                        case 13:
                        case 14:
                        case 15:
                          object2.a(3);
                          break;
                        case 12:
                          break;
                      } 
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                      object2.a(2);
                      break;
                    case 1:
                    case 2:
                      object2.a(1);
                      break;
                  } 
                } 
              } 
            } 
            if (networkInfo != null && networkInfo.isConnected() && !((c00)object1).e.isEmpty()) {
              Iterator<kh0> iterator = ((c00)object1).e.values().iterator();
              while (iterator.hasNext()) {
                object2 = iterator.next();
                iterator.remove();
                ((kh0)object2).a.getClass();
                object1.e((kh0)object2, false);
              } 
            } 
            return;
          case 7:
            c002 = (c00)this.b;
            c002.getClass();
            object1 = new ArrayList(c002.l);
            c002.l.clear();
            handler = c002.i;
            handler.sendMessage(handler.obtainMessage(8, object1));
            if (!object1.isEmpty())
              ((uf)object1.get(0)).b.getClass(); 
            return;
          case 6:
            object1 = ((Message)object1).obj;
            ((c00)this.b).d((uf)object1, false);
            return;
          case 5:
            uf = (uf)((Message)object1).obj;
            object2 = this.b;
            object2.getClass();
            object1 = uf.o;
            if (object1 == null || !object1.isCancelled())
              if (((c00)object2).b.isShutdown()) {
                object2.d(uf, false);
              } else {
                object1 = object3;
                if (((c00)object2).m)
                  object1 = ((ConnectivityManager)((c00)object2).a.getSystemService("connectivity")).getActiveNetworkInfo(); 
                if (object1 != null && object1.isConnected()) {
                  i = 1;
                } else {
                  i = 0;
                } 
                j = uf.s;
                if (j > 0) {
                  uf.s = j - 1;
                  bool1 = uf.k.f((NetworkInfo)object1);
                } else {
                  bool1 = false;
                } 
                object1 = uf.k;
                object1.getClass();
                boolean bool3 = object1 instanceof y11;
                boolean bool4 = ((c00)object2).m;
                if (!bool1) {
                  bool1 = bool2;
                  if (bool4) {
                    bool1 = bool2;
                    if (bool3)
                      bool1 = true; 
                  } 
                  object2.d(uf, bool1);
                  if (bool1)
                    object2.c(uf); 
                } else {
                  if (!bool4 || i != 0) {
                    uf.b.getClass();
                    if (uf.q instanceof x11)
                      uf.j |= 0x1; 
                    uf.o = ((c00)object2).b.submit(uf);
                    return;
                  } 
                  object2.d(uf, bool3);
                  if (bool3)
                    object2.c(uf); 
                } 
              }  
            return;
          case 4:
            object2 = ((Message)object1).obj;
            c001 = (c00)this.b;
            c001.getClass();
            if ((((uf)object2).i & 0x2) == 0) {
              bh0 bh0 = c001.j;
              object1 = ((uf)object2).g;
              object4 = ((uf)object2).n;
              bh0.getClass();
              if (object1 != null && object4 != null) {
                i = object4.getByteCount();
                if (i >= 0) {
                  tp0 tp0 = (tp0)bh0.c;
                  synchronized ((fb0)tp0.g) {
                    j = tp0.b;
                    object3 = bh0.c;
                    if (i > j) {
                      object3.getClass();
                      object4 = ((vp0)object3).g;
                      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                      try {
                        c4 c4 = (c4)((vp0)object3).f;
                        c4.getClass();
                        c4 = (c4)c4.a.remove(object1);
                        if (c4 != null)
                          ((vp0)object3).c -= object3.k(object1, c4); 
                      } finally {}
                      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                    } else {
                      object3.j(object1, new up0((Bitmap)object4, i));
                    } 
                  } 
                } else {
                  m60.o("Negative size: ", object4);
                  return;
                } 
              } else {
                k91.h("key == null || bitmap == null");
                return;
              } 
            } 
            c001.d.remove(((uf)object2).g);
            c001.a((uf)object2);
            ((uf)object2).b.getClass();
            return;
          case 2:
            kh0 = (kh0)((Message)object1).obj;
            object2 = this.b;
            object2.getClass();
            object1 = kh0.f;
            object3 = ((c00)object2).d.get(object1);
            if (object3 != null) {
              object3.d(kh0);
              if (object3.b()) {
                ((c00)object2).d.remove(object1);
                kh0.a.getClass();
              } 
            } 
            if (((c00)object2).g.contains(kh0.g)) {
              ((c00)object2).f.remove(kh0.a());
              kh0.a.getClass();
            } 
            object1 = ((c00)object2).e.remove(kh0.a());
            if (object1 != null)
              ((kh0)object1).a.getClass(); 
            return;
          case 1:
            break;
        } 
        object1 = ((Message)object1).obj;
        ((c00)this.b).e((kh0)object1, true);
        return;
      case 0:
        break;
    } 
    if (((Message)object1).what == 1)
      ((jj)this.b).g((List)((Message)object1).obj); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */