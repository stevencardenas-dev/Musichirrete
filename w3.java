import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.profileinstaller.Vuyf.nBRIsU;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class w3 extends Handler {
  public final int a;
  
  public WeakReference b;
  
  public w3(af1 paramaf1) {
    this.b = new WeakReference<af1>(paramaf1);
  }
  
  public final void handleMessage(Message paramMessage) {
    tu0 tu0;
    af1 af1;
    switch (this.a) {
      default:
        af1 = this.b.get();
        if (af1 != null) {
          ee0 ee0;
          ArrayList<vu0> arrayList1;
          SparseArray sparseArray = af1.h;
          ff1 ff1 = af1.i;
          ArrayList<Message> arrayList = ff1.m;
          int i1 = paramMessage.what;
          int i2 = paramMessage.arg1;
          int n = paramMessage.arg2;
          Object object = paramMessage.obj;
          Bundle bundle = paramMessage.peekData();
          int k = 0;
          int j = 0;
          int m = 0;
          f f = null;
          paramMessage = null;
          Message message = null;
          switch (i1) {
            default:
              j = ff1.s;
              break;
            case 8:
              if (ff1.p == af1) {
                bf1 bf1;
                k = arrayList.size();
                j = m;
                while (true) {
                  paramMessage = message;
                  if (j < k) {
                    paramMessage = arrayList.get(j);
                    j++;
                    bf1 = (bf1)paramMessage;
                    if (bf1.a() == n)
                      break; 
                    continue;
                  } 
                  break;
                } 
                f = ff1.r;
                if (f != null && bf1 instanceof xu0) {
                  xu0 xu0 = (xu0)bf1;
                  ee0 = ((gf1)f.c).b;
                  if (ee0.e == xu0)
                    ee0.k(ee0.c(), 2, true); 
                } 
                if (bf1 != null) {
                  arrayList.remove(bf1);
                  bf1.c();
                  ff1.l();
                } 
              } 
            case 7:
              if (object == null || object instanceof Bundle) {
                Bundle bundle1 = (Bundle)object;
                if (af1.f != 0) {
                  Bundle bundle2 = (Bundle)bundle1.getParcelable("groupRoute");
                  if (bundle2 != null) {
                    su0 su0 = new su0(bundle2);
                  } else {
                    bundle2 = null;
                  } 
                  object = bundle1.getParcelableArrayList("dynamicRoutes");
                  arrayList1 = new ArrayList();
                  m = object.size();
                  j = 0;
                  while (j < m) {
                    vu0 vu0;
                    bundle1 = object.get(j);
                    j++;
                    bundle = bundle1;
                    if (bundle == null) {
                      bundle1 = null;
                    } else {
                      bundle1 = bundle.getBundle("mrDescriptor");
                      if (bundle1 != null) {
                        su0 su0 = new su0(bundle1);
                      } else {
                        bundle1 = null;
                      } 
                      vu0 = new vu0((su0)bundle1, bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
                    } 
                    arrayList1.add(vu0);
                  } 
                  if (ff1.p == af1) {
                    bf1 bf1;
                    m = arrayList.size();
                    j = k;
                    while (true) {
                      ee0 ee01 = ee0;
                      if (j < m) {
                        ee01 = (ee0)arrayList.get(j);
                        j++;
                        bf1 = (bf1)ee01;
                        if (bf1.a() == n)
                          break; 
                        continue;
                      } 
                      break;
                    } 
                    if (bf1 instanceof df1)
                      ((df1)bf1).j((su0)bundle2, arrayList1); 
                  } 
                  break;
                } 
              } 
            case 6:
              if (object instanceof Bundle) {
                Bundle bundle1 = (Bundle)object;
                cf1 cf1 = (cf1)arrayList1.get(i2);
                if (bundle1.containsKey("routeId")) {
                  arrayList1.remove(i2);
                  cf1.b(bundle1);
                } else {
                  cf1.getClass();
                  cf1.a("DynamicGroupRouteController is created without valid route id.", bundle1);
                } 
              } else {
                Log.w("MediaRouteProviderProxy", nBRIsU.YejfyHU);
              } 
            case 5:
              if (object == null || object instanceof Bundle) {
                Bundle bundle1 = (Bundle)object;
                if (af1.f != 0) {
                  av0 av0 = av0.a(bundle1);
                  if (ff1.p == af1)
                    ff1.f(av0); 
                  break;
                } 
              } 
            case 4:
              if (object == null || object instanceof Bundle) {
                String str;
                if (bundle != null)
                  str = bundle.getString("error"); 
                Bundle bundle1 = (Bundle)object;
                if ((cf1)arrayList1.get(i2) != null) {
                  arrayList1.remove(i2);
                  cf1.a(str, bundle1);
                  break;
                } 
              } 
            case 3:
              if (object == null || object instanceof Bundle) {
                Bundle bundle1 = (Bundle)object;
                cf1 cf1 = (cf1)arrayList1.get(i2);
                if (cf1 != null) {
                  arrayList1.remove(i2);
                  cf1.b(bundle1);
                  break;
                } 
              } 
            case 2:
              if (object == null || object instanceof Bundle) {
                Bundle bundle1 = (Bundle)object;
                if (af1.f == 0 && i2 == af1.g && n >= 1) {
                  af1.g = 0;
                  af1.f = n;
                  av0 av0 = av0.a(bundle1);
                  if (ff1.p == af1)
                    ff1.f(av0); 
                  if (ff1.p == af1) {
                    ff1.q = true;
                    k = arrayList.size();
                    while (j < k) {
                      ((bf1)arrayList.get(j)).b(ff1.p);
                      j++;
                    } 
                    tu0 = ff1.g;
                    if (tu0 != null) {
                      af1 af11 = ff1.p;
                      j = af11.d;
                      af11.d = j + 1;
                      af11.b(10, j, 0, tu0.a, null);
                    } 
                  } 
                  break;
                } 
              } 
            case 0:
              if (i2 == af1.g) {
                af1.g = 0;
                if (ff1.p == af1)
                  ff1.k(); 
              } 
              if ((cf1)arrayList1.get(i2) != null) {
                arrayList1.remove(i2);
                cf1.a(null, null);
              } 
              break;
            case 1:
              break;
          } 
        } 
        return;
      case 0:
        break;
    } 
    int i = ((Message)tu0).what;
    if (i != -3 && i != -2 && i != -1) {
      if (i == 1)
        ((DialogInterface)((Message)tu0).obj).dismiss(); 
    } else {
      ((DialogInterface.OnClickListener)((Message)tu0).obj).onClick(this.b.get(), ((Message)tu0).what);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */