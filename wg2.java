import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.Log;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class wg2 extends dv0 {
  public static final rp0 f = new rp0("MRDiscoveryCallback", null);
  
  public final tg2 a;
  
  public final Set b;
  
  public final Map c;
  
  public final LinkedHashSet d;
  
  public final j01 e;
  
  public wg2(Context paramContext) {
    this.e = new j01(28, paramContext);
    this.c = Collections.synchronizedMap(new HashMap<Object, Object>());
    this.d = new LinkedHashSet();
    this.b = Collections.synchronizedSet(new LinkedHashSet());
    this.a = new tg2(this);
  }
  
  public final void d(iv0 paramiv0, hv0 paramhv0) {
    f.b(hbrAVtEa.TwTl, new Object[0]);
    p(paramhv0, true);
  }
  
  public final void e(iv0 paramiv0, hv0 paramhv0) {
    f.b(IGBYXeDFmKYajx.BDAqfzQUS, new Object[0]);
    p(paramhv0, true);
  }
  
  public final void i(iv0 paramiv0, hv0 paramhv0) {
    f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
    p(paramhv0, false);
  }
  
  public final void p(hv0 paramhv0, boolean paramBoolean) {
    boolean bool;
    rp0 rp01 = f;
    rp01.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", new Object[] { Boolean.valueOf(paramBoolean), paramhv0 });
    Map map = this.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map}, name=null} */
    try {
      String str = String.valueOf(map.keySet());
      int i = str.length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 45);
      stringBuilder.append("appIdToRouteInfo has these appId route keys: ");
      stringBuilder.append(str);
      rp01.b(stringBuilder.toString(), new Object[0]);
      Iterator<Map.Entry> iterator = map.entrySet().iterator();
      bool = false;
      while (iterator.hasNext()) {
        Map.Entry entry = iterator.next();
        str = (String)entry.getKey();
        qg2 qg2 = (qg2)entry.getValue();
        boolean bool1 = paramhv0.h(qg2.b);
        if (bool1) {
          StringBuilder stringBuilder1;
          if (paramBoolean) {
            i = String.valueOf(str).length();
            StringBuilder stringBuilder3 = new StringBuilder();
            this(i + 32);
            stringBuilder3.append("Adding/updating route for appId ");
            stringBuilder3.append(str);
            rp01.b(stringBuilder3.toString(), new Object[0]);
            bool1 = qg2.a.add(paramhv0);
            bool = bool1;
            if (!bool1) {
              String str1 = String.valueOf(paramhv0);
              i = str1.length();
              int j = String.valueOf(str).length();
              stringBuilder1 = new StringBuilder();
              this(i + 32 + j);
              stringBuilder1.append("Route ");
              stringBuilder1.append(str1);
              stringBuilder1.append(" already exists for appId ");
              stringBuilder1.append(str);
              str = stringBuilder1.toString();
              Log.w(rp01.a, rp01.c(str, new Object[0]));
              bool = bool1;
            } 
            continue;
          } 
          i = String.valueOf(str).length();
          StringBuilder stringBuilder2 = new StringBuilder();
          this(i + 25);
          stringBuilder2.append("Removing route for appId ");
          stringBuilder2.append(str);
          rp01.b(stringBuilder2.toString(), new Object[0]);
          bool1 = ((qg2)stringBuilder1).a.remove(paramhv0);
          bool = bool1;
          if (!bool1) {
            String str1 = String.valueOf(paramhv0);
            int j = str1.length();
            i = String.valueOf(str).length();
            stringBuilder1 = new StringBuilder();
            this(j + 34 + i);
            stringBuilder1.append("Route ");
            stringBuilder1.append(str1);
            stringBuilder1.append(" already removed from appId ");
            stringBuilder1.append(str);
            str = stringBuilder1.toString();
            Log.w(rp01.a, rp01.c(str, new Object[0]));
            bool = bool1;
          } 
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map}, name=null} */
    if (bool) {
      f.b("Invoking callback.onRouteUpdated.", new Object[0]);
      Set set = this.b;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
      try {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        Map map1 = this.c;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map}, name=null} */
        try {
          for (String str : map1.keySet()) {
            km2 km2;
            qg2 qg2 = (qg2)map1.get(m92.Z(str));
            if (qg2 == null) {
              int i = km2.g;
              km2 = xm2.n;
            } else {
              LinkedHashSet linkedHashSet = ((qg2)km2).a;
              int i = km2.g;
              Object[] arrayOfObject = linkedHashSet.toArray();
              km2 = km2.h(arrayOfObject.length, arrayOfObject);
            } 
            if (!km2.isEmpty())
              hashMap.put(str, km2); 
          } 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map}, name=null} */
        zh2.a(hashMap.entrySet());
        Iterator iterator = this.b.iterator();
        if (!iterator.hasNext()) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
          return;
        } 
      } finally {}
      if (paramhv0.next() == null)
        throw null; 
      ClassCastException classCastException = new ClassCastException();
      this();
      throw classCastException;
    } 
  }
  
  public final void q() {
    int i = this.d.size();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 33);
    stringBuilder.append("Starting RouteDiscovery with ");
    stringBuilder.append(i);
    stringBuilder.append(" IDs");
    String str = stringBuilder.toString();
    rp0 rp01 = f;
    rp01.b(str, new Object[0]);
    rp01.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
    if (Looper.myLooper() == Looper.getMainLooper()) {
      r();
      return;
    } 
    (new cl(Looper.getMainLooper(), 6)).post(new vg2(this, 0));
  }
  
  public final void r() {
    j01 j011 = this.e;
    if ((iv0)j011.e == null)
      j011.e = iv0.d((Context)j011.c); 
    iv0 iv0 = (iv0)j011.e;
    if (iv0 != null)
      iv0.j(this); 
    LinkedHashSet linkedHashSet = this.d;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedHashSet}, name=null} */
    try {
      for (String str2 : linkedHashSet) {
        String str1 = wf2.i(str2);
        ArrayList<String> arrayList = new ArrayList();
        this();
        if (!arrayList.contains(str1))
          arrayList.add(str1); 
        Bundle bundle = new Bundle();
        this();
        bundle.putStringArrayList("controlCategories", arrayList);
        cv0 cv0 = new cv0();
        this(bundle, arrayList);
        Map<String, qg2> map1 = this.c;
        if ((qg2)map1.get(str2) == null) {
          qg2 qg2 = new qg2();
          this(cv0);
          map1.put(str2, qg2);
        } 
        rp0 rp01 = f;
        String str3 = wf2.i(str2);
        int i = str3.length();
        StringBuilder stringBuilder = new StringBuilder();
        this(i + 49);
        stringBuilder.append("Adding mediaRouter callback for control category ");
        stringBuilder.append(str3);
        rp01.b(stringBuilder.toString(), new Object[0]);
        if ((iv0)j011.e == null)
          j011.e = iv0.d((Context)j011.c); 
        ((iv0)j011.e).a(cv0, this, 4);
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedHashSet}, name=null} */
    Map map = this.c;
    f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */