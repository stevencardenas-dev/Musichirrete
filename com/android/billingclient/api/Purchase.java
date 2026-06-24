package com.android.billingclient.api;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import org.json.JSONObject;

public final class Purchase {
  public final String a;
  
  public final String b;
  
  public final JSONObject c;
  
  public Purchase(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = new JSONObject(paramString1);
  }
  
  public final String a() {
    String str2 = this.c.optString("orderId");
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = null; 
    return str1;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Purchase))
      return false; 
    paramObject = paramObject;
    return (TextUtils.equals(this.a, ((Purchase)paramObject).a) && TextUtils.equals(this.b, ((Purchase)paramObject).b));
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    return IGBYXeDFmKYajx.gao.concat(String.valueOf(this.a));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\android\billingclient\api\Purchase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */