package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lx0;
import n21;
import org.json.JSONArray;
import org.json.JSONObject;
import qv;

@Deprecated
public class GoogleSignInAccount extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = (Parcelable.Creator<GoogleSignInAccount>)new lx0(22);
  
  public final String b;
  
  public final String c;
  
  public final String e;
  
  public final String f;
  
  public final Uri g;
  
  public String h;
  
  public final long i;
  
  public final String j;
  
  public final List k;
  
  public final String l;
  
  public final String m;
  
  public final HashSet n = new HashSet();
  
  public GoogleSignInAccount(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, ArrayList paramArrayList, String paramString7, String paramString8) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramUri;
    this.h = paramString5;
    this.i = paramLong;
    this.j = paramString6;
    this.k = paramArrayList;
    this.l = paramString7;
    this.m = paramString8;
  }
  
  public static GoogleSignInAccount e(String paramString) {
    String str1;
    String str2;
    String str3;
    String str4;
    boolean bool = TextUtils.isEmpty(paramString);
    String str5 = null;
    if (bool)
      return null; 
    JSONObject jSONObject = new JSONObject(paramString);
    paramString = jSONObject.optString("photoUrl");
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
    } else {
      paramString = null;
    } 
    long l = Long.parseLong(jSONObject.getString("expirationTime"));
    HashSet<Scope> hashSet = new HashSet();
    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
    int i = jSONArray.length();
    for (byte b = 0; b < i; b++)
      hashSet.add(new Scope(jSONArray.getString(b), 1)); 
    String str6 = jSONObject.optString("id");
    if (jSONObject.has("tokenId")) {
      String str = jSONObject.optString("tokenId");
    } else {
      jSONArray = null;
    } 
    if (jSONObject.has("email")) {
      str1 = jSONObject.optString("email");
    } else {
      str1 = null;
    } 
    if (jSONObject.has("displayName")) {
      str2 = jSONObject.optString("displayName");
    } else {
      str2 = null;
    } 
    if (jSONObject.has("givenName")) {
      str3 = jSONObject.optString("givenName");
    } else {
      str3 = null;
    } 
    if (jSONObject.has("familyName")) {
      str4 = jSONObject.optString("familyName");
    } else {
      str4 = null;
    } 
    String str7 = jSONObject.getString("obfuscatedIdentifier");
    n21.k(str7);
    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(str6, (String)jSONArray, str1, str2, (Uri)paramString, null, l, str7, new ArrayList<Scope>(hashSet), str3, str4);
    paramString = str5;
    if (jSONObject.has("serverAuthCode"))
      paramString = jSONObject.optString("serverAuthCode"); 
    googleSignInAccount.h = paramString;
    return googleSignInAccount;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (paramObject == this)
        return true; 
      if (paramObject instanceof GoogleSignInAccount) {
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)paramObject;
        if (googleSignInAccount.j.equals(this.j)) {
          paramObject = new HashSet(googleSignInAccount.k);
          paramObject.addAll(googleSignInAccount.n);
          HashSet hashSet = new HashSet(this.k);
          hashSet.addAll(this.n);
          if (paramObject.equals(hashSet))
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.j.hashCode();
    HashSet hashSet = new HashSet(this.k);
    hashSet.addAll(this.n);
    return (i + 527) * 31 + hashSet.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.v0(paramParcel, 4, this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.u0(paramParcel, 6, (Parcelable)this.g, paramInt);
    qv.v0(paramParcel, 7, this.h);
    qv.C0(paramParcel, 8, 8);
    paramParcel.writeLong(this.i);
    qv.v0(paramParcel, 9, this.j);
    qv.y0(paramParcel, 10, this.k);
    qv.v0(paramParcel, 11, this.l);
    qv.v0(paramParcel, 12, this.m);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */