import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.ArrayList;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.json.JSONException;

public abstract class ph2 {
  public static final int a = Runtime.getRuntime().availableProcessors();
  
  public static int a(String paramString, Bundle paramBundle) {
    if (paramBundle == null) {
      h(paramString, "Unexpected null bundle received!");
      return 6;
    } 
    Object object = paramBundle.get("RESPONSE_CODE");
    if (object == null) {
      g(paramString, "getResponseCodeFromBundle() got null response code, assuming OK");
      return 0;
    } 
    if (object instanceof Integer)
      return ((Integer)object).intValue(); 
    h(paramString, "Unexpected type for bundle response code: ".concat(object.getClass().getName()));
    return 6;
  }
  
  public static void b(Bundle paramBundle, String paramString1, String paramString2, long paramLong) {
    paramBundle.putString(uvJYmft.vDML, paramString1);
    if (paramString2 != null)
      paramBundle.putString("playBillingLibraryWrapperVersion", paramString2); 
    paramBundle.putLong("billingClientSessionId", paramLong);
  }
  
  public static Bundle c(int paramInt, qf paramqf) {
    Bundle bundle = new Bundle();
    bundle.putInt("RESPONSE_CODE", paramqf.a);
    bundle.putString("DEBUG_MESSAGE", paramqf.c);
    bundle.putInt("LOG_REASON", ga1.e(paramInt));
    return bundle;
  }
  
  public static Bundle d(String paramString1, String paramString2, ArrayList<jb1> paramArrayList, fb0 paramfb0, long paramLong) {
    Bundle bundle = new Bundle();
    b(bundle, paramString1, paramString2, paramLong);
    bundle.putBoolean("enablePendingPurchases", true);
    bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
    yg2 yg2 = ch2.c;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "subs";
    arrayOfObject[1] = "inapp";
    m92.a0(2, arrayOfObject);
    bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList(ch2.j(2, arrayOfObject)));
    arrayOfObject = new Object[1];
    arrayOfObject[0] = "inapp";
    m92.a0(1, arrayOfObject);
    bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList(ch2.j(1, arrayOfObject)));
    arrayOfObject = new Object[1];
    arrayOfObject[0] = "inapp";
    m92.a0(1, arrayOfObject);
    bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList(ch2.j(1, arrayOfObject)));
    bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
    ArrayList arrayList1 = new ArrayList();
    ArrayList arrayList2 = new ArrayList();
    ArrayList arrayList3 = new ArrayList();
    int k = paramArrayList.size();
    byte b = 0;
    int j = 0;
    int i = 0;
    while (b < k) {
      jb1 jb1 = paramArrayList.get(b);
      arrayList1.add(null);
      j |= TextUtils.isEmpty(null) ^ true;
      arrayList3.add(null);
      i |= TextUtils.isEmpty(null) ^ true;
      if (!jb1.b.equals("first_party")) {
        b++;
        continue;
      } 
      k91.h("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
      return null;
    } 
    if (j != 0)
      bundle.putStringArrayList(xveccWbRzqx.Ucze, arrayList1); 
    if (!arrayList2.isEmpty())
      bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList2); 
    if (!TextUtils.isEmpty(null))
      bundle.putString("accountName", null); 
    if (i != 0)
      bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList3); 
    return bundle;
  }
  
  public static qf e(String paramString, Intent paramIntent) {
    pf pf1;
    if (paramIntent == null) {
      h("BillingHelper", "Got null intent!");
      pf1 = qf.a();
      pf1.a = 6;
      pf1.c = "An internal error occurred.";
      return pf1.a();
    } 
    pf pf2 = qf.a();
    pf2.a = a((String)pf1, paramIntent.getExtras());
    pf2.c = f((String)pf1, paramIntent.getExtras());
    return pf2.a();
  }
  
  public static String f(String paramString, Bundle paramBundle) {
    if (paramBundle == null) {
      h(paramString, "Unexpected null bundle received!");
      return "";
    } 
    Object object = paramBundle.get("DEBUG_MESSAGE");
    if (object == null) {
      g(paramString, "getDebugMessageFromBundle() got null response code, assuming OK");
      return "";
    } 
    if (object instanceof String)
      return (String)object; 
    h(paramString, "Unexpected type for debug message: ".concat(object.getClass().getName()));
    return "";
  }
  
  public static void g(String paramString1, String paramString2) {
    if (Log.isLoggable(paramString1, 2))
      if (!paramString2.isEmpty()) {
        for (int i = 40000; !paramString2.isEmpty() && i > 0; i -= j) {
          int j = Math.min(paramString2.length(), Math.min(4000, i));
          Log.v(paramString1, paramString2.substring(0, j));
          paramString2 = paramString2.substring(j);
        } 
      } else {
        Log.v(paramString1, paramString2);
      }  
  }
  
  public static void h(String paramString1, String paramString2) {
    if (Log.isLoggable(paramString1, 5))
      Log.w(paramString1, paramString2); 
  }
  
  public static void i(String paramString1, String paramString2, Throwable paramThrowable) {
    try {
      if (Log.isLoggable(paramString1, 5)) {
        if (paramThrowable == null) {
          Log.w(paramString1, paramString2);
          return;
        } 
        Log.w(paramString1, paramString2, paramThrowable);
      } 
    } finally {}
  }
  
  public static Purchase j(String paramString1, String paramString2) {
    if (paramString1 != null && paramString2 != null)
      try {
        return new Purchase(paramString1, paramString2);
      } catch (JSONException jSONException) {
        h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(jSONException.toString()));
        return null;
      }  
    g("BillingHelper", "Received a null purchase data.");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ph2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */