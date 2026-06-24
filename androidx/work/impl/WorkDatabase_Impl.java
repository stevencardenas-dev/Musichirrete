package androidx.work.impl;

import c82;
import cs1;
import d40;
import dd1;
import e82;
import f51;
import gy;
import h72;
import i72;
import j72;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lc0;
import ll;
import ls1;
import ne1;
import r91;
import rx0;
import t72;
import u72;
import yi0;

public final class WorkDatabase_Impl extends WorkDatabase {
  public final cs1 k = new cs1((lc0)new i72(this, 0));
  
  public final cs1 l = new cs1((lc0)new i72(this, 1));
  
  public final cs1 m = new cs1((lc0)new i72(this, 2));
  
  public final cs1 n = new cs1((lc0)new i72(this, 3));
  
  public final cs1 o = new cs1((lc0)new i72(this, 4));
  
  public final cs1 p = new cs1((lc0)new i72(this, 5));
  
  public final cs1 q = new cs1((lc0)new i72(this, 6));
  
  public final List c(LinkedHashMap paramLinkedHashMap) {
    ArrayList<rx0> arrayList = new ArrayList();
    arrayList.add(new rx0(13, 14, 10));
    arrayList.add(new h72(0));
    arrayList.add(new rx0(16, 17, 11));
    arrayList.add(new rx0(17, 18, 12));
    arrayList.add(new rx0(18, 19, 13));
    arrayList.add(new h72(1));
    arrayList.add(new rx0(20, 21, 14));
    arrayList.add(new rx0(22, 23, 15));
    arrayList.add(new rx0(23, 24, 16));
    return arrayList;
  }
  
  public final yi0 d() {
    return new yi0(this, new LinkedHashMap<Object, Object>(), new LinkedHashMap<Object, Object>(), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
  }
  
  public final f51 e() {
    return (f51)new j72(this);
  }
  
  public final Set h() {
    return new LinkedHashSet();
  }
  
  public final LinkedHashMap i() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    ll ll = ne1.a(c82.class);
    d40 d40 = d40.b;
    linkedHashMap.put(ll, d40);
    linkedHashMap.put(ne1.a(gy.class), d40);
    linkedHashMap.put(ne1.a(e82.class), d40);
    linkedHashMap.put(ne1.a(ls1.class), d40);
    linkedHashMap.put(ne1.a(t72.class), d40);
    linkedHashMap.put(ne1.a(u72.class), d40);
    linkedHashMap.put(ne1.a(r91.class), d40);
    linkedHashMap.put(ne1.a(dd1.class), d40);
    return linkedHashMap;
  }
  
  public final gy q() {
    return (gy)this.l.getValue();
  }
  
  public final r91 r() {
    return (r91)this.q.getValue();
  }
  
  public final ls1 s() {
    return (ls1)this.n.getValue();
  }
  
  public final t72 t() {
    return (t72)this.o.getValue();
  }
  
  public final u72 u() {
    return (u72)this.p.getValue();
  }
  
  public final c82 v() {
    return (c82)this.k.getValue();
  }
  
  public final e82 w() {
    return (e82)this.m.getValue();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\WorkDatabase_Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */