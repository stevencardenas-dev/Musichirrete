import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class ob0 extends g32 {
  public static final nb0 h = new nb0(0);
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public final HashMap c = new HashMap<Object, Object>();
  
  public final HashMap d = new HashMap<Object, Object>();
  
  public final boolean e;
  
  public boolean f = false;
  
  public boolean g = false;
  
  public ob0(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public final void d() {
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("onCleared called for ");
      stringBuilder.append(this);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.f = true;
  }
  
  public final void e(ua0 paramua0, boolean paramBoolean) {
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("Clearing non-config state for ");
      stringBuilder.append(paramua0);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    g(paramua0.h, paramBoolean);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && ob0.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b.equals(((ob0)paramObject).b) && this.c.equals(((ob0)paramObject).c) && this.d.equals(((ob0)paramObject).d))
        return true; 
    } 
    return false;
  }
  
  public final void f(String paramString, boolean paramBoolean) {
    if (lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("Clearing non-config state for saved state of Fragment ");
      stringBuilder.append(paramString);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    g(paramString, paramBoolean);
  }
  
  public final void g(String paramString, boolean paramBoolean) {
    HashMap hashMap2 = this.c;
    ob0 ob01 = (ob0)hashMap2.get(paramString);
    if (ob01 != null) {
      if (paramBoolean) {
        ArrayList<Object> arrayList = new ArrayList();
        arrayList.addAll(ob01.c.keySet());
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          String str = (String)arrayList.get(b);
          b++;
          ob01.f(str, true);
        } 
      } 
      ob01.d();
      hashMap2.remove(paramString);
    } 
    HashMap hashMap1 = this.d;
    k32 k32 = (k32)hashMap1.get(paramString);
    if (k32 != null) {
      k32.a();
      hashMap1.remove(paramString);
    } 
  }
  
  public final void h(ua0 paramua0) {
    if (this.g) {
      if (lb0.M(2)) {
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        return;
      } 
    } else if (this.b.remove(paramua0.h) != null && lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Updating retained Fragments: Removed ");
      stringBuilder.append(paramua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public final int hashCode() {
    int j = this.b.hashCode();
    int i = this.c.hashCode();
    return this.d.hashCode() + (i + j * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("} Fragments (");
    Iterator<String> iterator = this.b.values().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") Child Non Config (");
    iterator = this.c.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(") ViewModelStores (");
    iterator = this.d.keySet().iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next());
      if (iterator.hasNext())
        stringBuilder.append(", "); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ob0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */