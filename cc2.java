import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.json.JSONException;
import org.json.JSONObject;

public final class cc2 implements Callable {
  public final int a;
  
  public final Object b;
  
  public final Object c;
  
  public final Object d;
  
  public cc2(ef paramef, gf paramgf, String paramString) {
    this.c = paramgf;
    this.b = paramString;
    Objects.requireNonNull(paramef);
    this.d = paramef;
  }
  
  public final Object call() {
    boolean bool;
    ib1 ib1;
    Object object;
    hf hf;
    ef ef1;
    ef ef2;
    yg2 yg2;
    String str1;
    String str2;
    f1 f1;
    ef ef3;
    ef ef4;
    int i = this.a;
    null = null;
    switch (i) {
      default:
        return ((SharedPreferences)this.c).getString((String)this.b, (String)this.d);
      case 6:
        return Long.valueOf(((SharedPreferences)this.c).getLong((String)this.b, ((Long)this.d).longValue()));
      case 5:
        ef4 = (ef)this.d;
        bool = ef4.w();
        if (!bool) {
          qf qf = ij2.j;
          ef4.A(2, 9, qf);
          null = (gf)this.c;
          yg2 = ch2.c;
          null.a(qf, th2.g);
        } else {
          String str = (String)this.b;
          if (TextUtils.isEmpty(str)) {
            ph2.h("BillingClient", "Please provide a valid product type.");
            qf qf = ij2.e;
            ef4.A(50, 9, qf);
            null = (gf)this.c;
            yg2 = ch2.c;
            null.a(qf, th2.g);
          } else {
            ph2.g("BillingClient", "Querying owned items, item type: ".concat(str));
            ArrayList arrayList = new ArrayList();
            bool = ef4.n;
            ef4.x.getClass();
            ef4.x.getClass();
            long l = ef4.A.longValue();
            Bundle bundle = new Bundle();
            ph2.b(bundle, ef4.c, ef4.d, l);
            if (bool)
              bundle.putBoolean("enablePendingPurchases", true); 
            qj2 qj2 = null;
            while (true) {
              Object object1;
              try {
                object1 = ef4.a;
                /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                try {
                  qe2 qe2 = ef4.i;
                  /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                  if (qe2 == null) {
                    qj2 = ef4.z(ij2.j, 107, "Service has been reset to null", (Exception)null);
                    break;
                  } 
                  if (!ef4.n) {
                    object1 = ef4.g.getPackageName();
                    object1 = ((ie2)qe2).w0((String)object1, str, (String)qj2);
                  } else {
                    if (ef4.w) {
                      i = 26;
                    } else if (ef4.v) {
                      i = 24;
                    } else if (ef4.s) {
                      i = 19;
                    } else {
                      i = 9;
                    } 
                    object1 = ef4.g.getPackageName();
                    object1 = ((ie2)qe2).x0(i, (String)object1, str, (String)qj2, bundle);
                  } 
                  qf qf2 = ij2.h;
                  if (object1 == null) {
                    ph2.h("BillingClient", "getPurchase() got null owned items list");
                    i = 54;
                  } else {
                    i = ph2.a("BillingClient", (Bundle)object1);
                    String str3 = ph2.f("BillingClient", (Bundle)object1);
                    pf pf = qf.a();
                    pf.a = i;
                    pf.c = str3;
                    qf qf3 = pf.a();
                    if (i != 0) {
                      StringBuilder stringBuilder = new StringBuilder("getPurchase() failed. Response code: ");
                      stringBuilder.append(i);
                      ph2.h("BillingClient", stringBuilder.toString());
                      i = 23;
                    } else {
                      if (!object1.containsKey("INAPP_PURCHASE_ITEM_LIST") || !object1.containsKey("INAPP_PURCHASE_DATA_LIST") || !object1.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ph2.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i = 55;
                      } else {
                        ArrayList arrayList3 = object1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList arrayList2 = object1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList arrayList1 = object1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (arrayList3 == null) {
                          ph2.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                          i = 56;
                        } else if (arrayList2 == null) {
                          ph2.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                          i = 57;
                        } else if (arrayList1 == null) {
                          ph2.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                          i = 58;
                        } else {
                          qf qf4 = ij2.i;
                          i = 1;
                          if (qf4 != ij2.i) {
                            qj2 qj21 = ef4.z(qf4, i, fXMDNeMWaILNVh.YSDtsmwLjzEkUz, (Exception)null);
                            break;
                          } 
                        } 
                      } 
                      qf3 = qf2;
                    } 
                    if (qf3 != ij2.i) {
                      qj2 qj21 = ef4.z(qf3, i, fXMDNeMWaILNVh.YSDtsmwLjzEkUz, (Exception)null);
                      break;
                    } 
                  } 
                  qf qf1 = qf2;
                } finally {}
              } catch (DeadObjectException deadObjectException) {
                break label274;
              } catch (Exception exception1) {}
              label274: while (true) {
                try {
                  /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                  try {
                    throw exception1;
                  } catch (DeadObjectException deadObjectException) {
                    break;
                  } catch (Exception exception2) {}
                  continue;
                } finally {
                  exception1 = null;
                } 
              } 
              qj2 = ef4.z(ij2.j, 52, "Got exception trying to get purchases try to reconnect", exception1);
            } 
            List list = (List)qj2.b;
            gf gf = (gf)this.c;
            qf qf = (qf)qj2.c;
          } 
        } 
        return null;
      case 4:
        ef2 = (ef)this.c;
        hf = (hf)this.b;
        ib1 = (ib1)this.d;
        if (!ef2.w()) {
          qf qf = ij2.j;
          ef2.A(2, 7, qf);
          yg2 = ch2.c;
          hf.b(qf, new bh0(22, th2.g));
        } else {
          qf qf;
          if (!((ef)yg2).r) {
            ph2.h("BillingClient", "Querying product details is not supported.");
            qf = ij2.o;
            yg2.A(20, 7, qf);
            yg2 = ch2.c;
            hf.b(qf, new bh0(22, th2.g));
          } else {
            d7 d7;
            ArrayList<Object> arrayList = new ArrayList();
            ArrayList<h02> arrayList1 = new ArrayList();
            String str = ((jb1)((ib1)qf).a.get(0)).b;
            ch2 ch2 = ((ib1)qf).a;
            int j = ch2.size();
            i = 0;
            label281: while (true) {
              if (i < j) {
                Object object1;
                int m = i + 20;
                if (m > j) {
                  k = j;
                } else {
                  k = m;
                } 
                ArrayList arrayList2 = new ArrayList(ch2.subList(i, k));
                ArrayList<String> arrayList3 = new ArrayList();
                int k = arrayList2.size();
                for (i = 0; i < k; i++)
                  arrayList3.add(((jb1)arrayList2.get(i)).a); 
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                String str3 = ((ef)yg2).c;
                bundle.putString("playBillingLibraryVersion", str3);
                try {
                  object1 = ((ef)yg2).a;
                  /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                  try {
                    ArrayList<h02> arrayList5;
                    qe2 qe2 = ((ef)yg2).i;
                    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                    if (qe2 == null) {
                      d7 d71 = yg2.m(ij2.j, 107, "Service has been reset to null.", null);
                      break;
                    } 
                    if (((ef)yg2).s)
                      ((ef)yg2).x.getClass(); 
                    yg2.h();
                    yg2.h();
                    yg2.h();
                    yg2.h();
                    fb0 fb0 = new fb0();
                    super();
                    if (true != ((ef)yg2).t) {
                      i = 17;
                    } else {
                      i = 20;
                    } 
                    object1 = ((ef)yg2).g.getPackageName();
                    Bundle bundle2 = ph2.d(str3, ((ef)yg2).d, arrayList2, fb0, ((ef)yg2).A.longValue());
                    Bundle bundle1 = ((ie2)qe2).y0(i, (String)object1, str, bundle, bundle2);
                    if (bundle1 == null) {
                      d7 d71 = yg2.m(ij2.p, 44, "queryProductDetailsAsync got empty product details response.", null);
                      break;
                    } 
                    if (!bundle1.containsKey("DETAILS_LIST")) {
                      i = ph2.a("BillingClient", bundle1);
                      String str4 = ph2.f("BillingClient", bundle1);
                      if (i != 0) {
                        d71 = yg2.m(ij2.a(str4, i), 23, ga1.i("getSkuDetails() failed for queryProductDetailsAsync. Response code: ", i), null);
                        break;
                      } 
                      d7 d71 = yg2.m(ij2.a((String)d71, 6), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                      break;
                    } 
                    ArrayList<String> arrayList6 = bundle1.getStringArrayList("DETAILS_LIST");
                    if (arrayList6 == null) {
                      d7 d71 = yg2.m(ij2.p, 46, "queryProductDetailsAsync got null response list", null);
                      break;
                    } 
                    ArrayList<Object> arrayList4 = new ArrayList();
                    k = arrayList6.size();
                    i = 0;
                    while (i < k) {
                      object1 = arrayList6.get(i);
                      try {
                        object1 = new ta1((String)object1);
                        ph2.g("BillingClient", "Got product details: ".concat(object1.toString()));
                        arrayList4.add(object1);
                        i++;
                      } catch (JSONException jSONException) {
                        d7 d71 = yg2.m(ij2.a("Error trying to decode SkuDetails.", 6), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", (Exception)jSONException);
                        break label281;
                      } 
                    } 
                    arrayList6 = bundle1.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                    new ArrayList();
                    try {
                      h02 h02;
                      arrayList5 = new ArrayList();
                      this();
                      if (arrayList6 != null) {
                        k = arrayList6.size();
                        i = 0;
                        while (i < k) {
                          arrayList2 = (ArrayList)arrayList6.get(i);
                          i++;
                          object1 = arrayList2;
                          h02 = new h02();
                          this((String)object1);
                          ph2.g("BillingClient", "Got unfetchedProduct: ".concat(h02.toString()));
                          arrayList5.add(h02);
                        } 
                      } else {
                        i = h02.size();
                        k = 0;
                        label278: while (k < i) {
                          arrayList6 = h02.get(k);
                          k++;
                          jb1 jb1 = (jb1)arrayList6;
                          int n = arrayList4.size();
                          byte b = 0;
                          while (b < n) {
                            object1 = arrayList4.get(b);
                            b++;
                            object1 = object1;
                            if (jb1.a.equals(((ta1)object1).c) && jb1.b.equals(((ta1)object1).d))
                              continue label278; 
                          } 
                          object1 = new JSONObject();
                          super();
                          JSONObject jSONObject = object1.put("productId", jb1.a).put("type", jb1.b).put("statusCode", 0);
                          object1 = new h02();
                          super(jSONObject.toString());
                          arrayList5.add(object1);
                        } 
                      } 
                    } catch (JSONException jSONException) {}
                    arrayList.addAll(arrayList4);
                    arrayList1.addAll(arrayList5);
                    i = m;
                  } finally {}
                } catch (DeadObjectException deadObjectException) {
                
                } catch (Exception exception1) {}
                /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                throw exception1;
              } 
              d7 = new d7(0, "", arrayList, arrayList1);
              break;
            } 
            i = d7.b;
            hf.b(ij2.a((String)d7.e, i), new bh0(22, d7.c));
          } 
        } 
        return null;
      case 3:
        return Integer.valueOf(((SharedPreferences)this.c).getInt((String)this.b, ((Integer)this.d).intValue()));
      case 2:
        ef1 = (ef)this.c;
        object = this.b;
        f1 = (f1)this.d;
        try {
          if (!ef1.w()) {
            qf qf = ij2.j;
            ef1.A(2, 3, qf);
            object.a(qf);
          } else if (TextUtils.isEmpty(f1.c)) {
            ph2.h("BillingClient", "Please provide a valid purchase token.");
            qf qf = ij2.g;
            ef1.A(26, 3, qf);
            object.a(qf);
          } else if (!ef1.n) {
            qf qf = ij2.a;
            ef1.A(27, 3, qf);
            object.a(qf);
          } else {
            synchronized (ef1.a) {
              qe2 qe2 = ef1.i;
              if (qe2 == null) {
                ef1.j((hf)object, ij2.j, 107, null);
              } else {
                null = ef1.g.getPackageName();
                String str3 = f1.c;
                String str4 = ef1.c;
                String str5 = ef1.d;
                long l = ef1.A.longValue();
                i = ph2.a;
                Bundle bundle2 = new Bundle();
                this();
                ph2.b(bundle2, str4, str5, l);
                Bundle bundle1 = ((ie2)qe2).t0((String)null, str3, bundle2);
                i = ph2.a("BillingClient", bundle1);
                object.a(ij2.a(ph2.f("BillingClient", bundle1), i));
              } 
            } 
          } 
        } catch (DeadObjectException deadObjectException) {
          ef1.j((hf)object, ij2.j, 28, (Exception)deadObjectException);
        } catch (Exception exception1) {}
        return null;
      case 1:
        ef3 = (ef)this.c;
        str2 = (String)this.b;
        str1 = (String)this.d;
        try {
          object = ef3.a;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          try {
            qe2 qe2 = ef3.i;
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            if (qe2 == null) {
              object = ph2.c(107, ij2.j);
            } else {
              object = ef3.g.getPackageName();
              object = ((ie2)qe2).u0((String)object, str2, str1);
            } 
          } finally {}
        } catch (DeadObjectException deadObjectException) {
        
        } catch (Exception exception) {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        throw exception;
      case 0:
        break;
    } 
    return Boolean.valueOf(((SharedPreferences)this.c).getBoolean((String)this.b, ((Boolean)this.d).booleanValue()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */