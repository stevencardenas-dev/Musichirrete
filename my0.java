import android.content.Context;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class my0 {
  public static boolean a;
  
  public static ArrayList b;
  
  public static final ArrayList c = new ArrayList(0);
  
  public static final HashSet d = new HashSet(0);
  
  public static long e = 0L;
  
  public static boolean f;
  
  public static long g;
  
  public static boolean h = true;
  
  public static boolean i = false;
  
  public static void a() {
    d.clear();
    ArrayList arrayList = c;
    arrayList.clear();
    arrayList.trimToSize();
    a = false;
    e = 0L;
    i = false;
    if (h)
      f(); 
  }
  
  public static void b(List paramList) {
    if (paramList != null && paramList.size() != 0) {
      Iterator<km0> iterator = paramList.iterator();
      while (true) {
        boolean bool = iterator.hasNext();
        ArrayList arrayList = c;
        HashSet hashSet = d;
        if (bool) {
          km0 km0 = iterator.next();
          if (km0 != null) {
            int i = km0.b;
            if (hashSet.contains(Integer.valueOf(i))) {
              arrayList.remove(km0);
              e -= km0.c.g;
              hashSet.remove(Integer.valueOf(i));
            } 
          } 
          continue;
        } 
        if (h)
          f(); 
        if (arrayList.isEmpty())
          arrayList.trimToSize(); 
        hashSet.isEmpty();
        break;
      } 
    } 
  }
  
  public static ArrayList c(boolean paramBoolean) {
    ArrayList arrayList = new ArrayList(c);
    if (paramBoolean)
      z51.E(-1, arrayList); 
    return arrayList;
  }
  
  public static boolean d() {
    return (i || c.size() != 0);
  }
  
  public static boolean e(int paramInt) {
    return (d() && d.contains(Integer.valueOf(paramInt)));
  }
  
  public static void f() {
    g = System.currentTimeMillis();
    ArrayList<Object> arrayList = b;
    if (arrayList != null) {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        ly0 ly0 = (ly0)arrayList.get(b);
        b++;
        ((ly0)ly0).j();
      } 
    } 
  }
  
  public static void g(ArrayList<km0> paramArrayList) {
    int j;
    byte b;
    km0 km01;
    km0 km02;
    int i = 0;
    while (true) {
      j = paramArrayList.size();
      b = -1;
      km02 = null;
      if (i < j) {
        km0 km0 = paramArrayList.get(i);
        if (e(km0.b)) {
          j = i;
          break;
        } 
        i++;
        continue;
      } 
      j = -1;
      km01 = null;
      break;
    } 
    if (j >= 0) {
      int k;
      km0 km0;
      i = paramArrayList.size() - 1;
      while (true) {
        k = b;
        km0 = km02;
        if (i > j) {
          km0 = paramArrayList.get(i);
          if (e(km0.b)) {
            k = i;
            break;
          } 
          i--;
          continue;
        } 
        break;
      } 
      if (k > j) {
        List<km0> list = Arrays.asList(new km0[] { km01, km0 });
        h = false;
        b(list);
        h(paramArrayList.subList(j, k + 1));
        h = true;
        f();
      } 
    } 
  }
  
  public static void h(List paramList) {
    if (paramList != null && paramList.size() != 0) {
      ArrayList<km0> arrayList = c;
      if (arrayList.isEmpty())
        f = true; 
      for (km0 km0 : paramList) {
        if (km0 != null) {
          int i = km0.b;
          HashSet<Integer> hashSet = d;
          if (!hashSet.contains(Integer.valueOf(i))) {
            arrayList.add(km0);
            e += km0.c.g;
            hashSet.add(Integer.valueOf(i));
          } 
        } 
      } 
      if (h)
        f(); 
    } 
  }
  
  public static void i(Context paramContext) {
    i = true;
    f();
    if (paramContext != null && !MyApplication.x().getBoolean("s_mlsltpsw", false)) {
      MyApplication.x().edit().putBoolean("s_mlsltpsw", true).apply();
      ms0 ms0 = new ms0(paramContext);
      ms0.q(2131887506);
      ms0.c(2131887507);
      ms0.n(2131886639);
      ms0.p();
    } 
  }
  
  public static void j(km0 paramkm0) {
    if (paramkm0 != null) {
      int i = paramkm0.b;
      if (i > 0) {
        List<km0> list = Collections.singletonList(paramkm0);
        if (e(i)) {
          b(list);
          return;
        } 
        h(list);
      } 
    } 
  }
  
  public static void k(List paramList) {
    if (paramList == null)
      return; 
    h = false;
    Iterator<km0> iterator = paramList.iterator();
    while (iterator.hasNext())
      j(iterator.next()); 
    h = true;
    f();
  }
  
  public static void l(lm0 paramlm0) {
    if (!d())
      return; 
    int i = 0;
    h = false;
    ArrayList<Object> arrayList = c;
    ArrayList<km0> arrayList1 = new ArrayList(arrayList.size());
    int j = arrayList.size();
    while (i < j) {
      wo wo1 = (wo)arrayList.get(i);
      int k = i + 1;
      wo wo2 = ((km0)wo1).c.f;
      HashMap hashMap = paramlm0.w;
      wo1 = wo2;
      if (hashMap != null) {
        wo wo = (wo)hashMap.get(wo2);
        wo1 = wo2;
        if (wo != null)
          wo1 = wo; 
      } 
      km0 km0 = paramlm0.b(wo1);
      i = k;
      if (km0 != null) {
        arrayList1.add(km0);
        i = k;
      } 
    } 
    a();
    h(arrayList1);
    f();
    h = true;
    f();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\my0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */