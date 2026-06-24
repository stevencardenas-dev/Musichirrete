import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.window.ldG.XUaAMlaMSa;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public final class oo {
  public final LinkedHashMap a = new LinkedHashMap<Object, Object>();
  
  public final LinkedHashMap b = new LinkedHashMap<Object, Object>();
  
  public final LinkedHashMap c = new LinkedHashMap<Object, Object>();
  
  public final ArrayList d = new ArrayList();
  
  public final transient LinkedHashMap e = new LinkedHashMap<Object, Object>();
  
  public final LinkedHashMap f = new LinkedHashMap<Object, Object>();
  
  public final Bundle g = new Bundle();
  
  public final qo h;
  
  public oo(qo paramqo) {}
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent) {
    ArrayList arrayList;
    String str = (String)this.a.get(Integer.valueOf(paramInt1));
    if (str == null)
      return false; 
    j2 j2 = (j2)this.e.get(str);
    if (j2 != null) {
      arrayList = (ArrayList)j2.a;
    } else {
      arrayList = null;
    } 
    if (arrayList != null) {
      arrayList = this.d;
      if (arrayList.contains(str)) {
        j2.a.a(j2.b.C(paramIntent, paramInt2));
        arrayList.remove(str);
        return true;
      } 
    } 
    this.f.remove(str);
    e2 e2 = new e2(paramIntent, paramInt2);
    this.g.putParcelable(str, e2);
    return true;
  }
  
  public final void b(int paramInt, z51 paramz51, Object paramObject) {
    qo qo1 = this.h;
    s0 s0 = paramz51.p((Context)qo1, paramObject);
    if (s0 != null) {
      (new Handler(Looper.getMainLooper())).post(new no(paramInt, 0, this, s0));
      return;
    } 
    paramObject = paramz51.f((Context)qo1, paramObject);
    if (paramObject.getExtras() != null) {
      object = paramObject.getExtras();
      object.getClass();
      if (object.getClassLoader() == null)
        paramObject.setExtrasClassLoader(qo1.getClassLoader()); 
    } 
    if (paramObject.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
      object = paramObject.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      paramObject.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
    } else {
      paramz51 = null;
    } 
    if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(paramObject.getAction())) {
      paramObject = paramObject.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      object = paramObject;
      if (paramObject == null)
        object = new String[0]; 
      n21.P(qo1, (String[])object, paramInt);
      return;
    } 
    if (XUaAMlaMSa.EfFGLfU.equals(paramObject.getAction())) {
      paramObject = paramObject.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
      try {
        paramObject.getClass();
        IntentSender intentSender = ((oi0)paramObject).b;
        Intent intent = ((oi0)paramObject).c;
        int i = ((oi0)paramObject).e;
        int j = ((oi0)paramObject).f;
        try {
          qo1.startIntentSenderForResult(intentSender, paramInt, intent, i, j, 0, (Bundle)object);
          return;
        } catch (android.content.IntentSender.SendIntentException null) {}
      } catch (android.content.IntentSender.SendIntentException object) {}
      (new Handler(Looper.getMainLooper())).post(new no(paramInt, 1, this, object));
      return;
    } 
    qo1.startActivityForResult((Intent)paramObject, paramInt, (Bundle)object);
  }
  
  public final l2 c(String paramString, z51 paramz51, f2 paramf2) {
    d(paramString);
    j2 j2 = new j2(paramf2, paramz51);
    this.e.put(paramString, j2);
    LinkedHashMap linkedHashMap = this.f;
    if (linkedHashMap.containsKey(paramString)) {
      j2 = (j2)linkedHashMap.get(paramString);
      linkedHashMap.remove(paramString);
      paramf2.a(j2);
    } 
    Bundle bundle = this.g;
    e2 e2 = (e2)ui0.y(paramString, bundle);
    if (e2 != null) {
      bundle.remove(paramString);
      int i = e2.b;
      paramf2.a(paramz51.C(e2.c, i));
    } 
    return new l2(this, paramString, paramz51, 1);
  }
  
  public final void d(String paramString) {
    LinkedHashMap<String, Integer> linkedHashMap = this.b;
    if ((Integer)linkedHashMap.get(paramString) != null)
      return; 
    i2 i2 = new i2(0);
    for (Number number : new aq(new zx(i2, new l(4, i2)))) {
      int i = number.intValue();
      LinkedHashMap<Integer, String> linkedHashMap1 = this.a;
      if (!linkedHashMap1.containsKey(Integer.valueOf(i))) {
        i = number.intValue();
        linkedHashMap1.put(Integer.valueOf(i), paramString);
        linkedHashMap.put(paramString, Integer.valueOf(i));
        return;
      } 
    } 
    throw new NoSuchElementException(YbNJ.fTCpyjBtfur);
  }
  
  public final void e(String paramString) {
    if (!this.d.contains(paramString)) {
      Integer integer = (Integer)this.b.remove(paramString);
      if (integer != null)
        this.a.remove(integer); 
    } 
    this.e.remove(paramString);
    LinkedHashMap linkedHashMap2 = this.f;
    boolean bool = linkedHashMap2.containsKey(paramString);
    String str = LHyji.jxIaW;
    if (bool) {
      StringBuilder stringBuilder = x41.q(str, paramString, ": ");
      stringBuilder.append(linkedHashMap2.get(paramString));
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      linkedHashMap2.remove(paramString);
    } 
    Bundle bundle = this.g;
    if (bundle.containsKey(paramString)) {
      e2 e2 = (e2)ui0.y(paramString, bundle);
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder.append(paramString);
      stringBuilder.append(": ");
      stringBuilder.append(e2);
      Log.w("ActivityResultRegistry", stringBuilder.toString());
      bundle.remove(paramString);
    } 
    LinkedHashMap linkedHashMap1 = this.c;
    k2 k2 = (k2)linkedHashMap1.get(paramString);
    if (k2 != null) {
      ArrayList<Object> arrayList = k2.b;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        sm0 sm0 = (sm0)arrayList.get(b);
        b++;
        sm0 = sm0;
        k2.a.g(sm0);
      } 
      arrayList.clear();
      linkedHashMap1.remove(paramString);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */