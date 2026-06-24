import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class vp0 {
  public final int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public final Object f;
  
  public final Object g;
  
  public vp0(int paramInt) {
    this.b = paramInt;
    if (paramInt > 0) {
      this.f = new c4(2);
      this.g = new Object();
      return;
    } 
    l0.l("maxSize <= 0");
    throw null;
  }
  
  public vp0(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt) {
    this.g = paramStaggeredGridLayoutManager;
    this.f = new ArrayList();
    this.b = Integer.MIN_VALUE;
    this.c = Integer.MIN_VALUE;
    this.d = 0;
    this.e = paramInt;
  }
  
  public void a() {
    ArrayList<View> arrayList = (ArrayList)this.f;
    View view = arrayList.get(arrayList.size() - 1);
    xo1 xo1 = (xo1)view.getLayoutParams();
    this.c = ((StaggeredGridLayoutManager)this.g).t.d(view);
    xo1.getClass();
  }
  
  public void b() {
    ((ArrayList)this.f).clear();
    this.b = Integer.MIN_VALUE;
    this.c = Integer.MIN_VALUE;
    this.d = 0;
  }
  
  public int c() {
    boolean bool = ((StaggeredGridLayoutManager)this.g).y;
    ArrayList arrayList = (ArrayList)this.f;
    return bool ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
  }
  
  public int d() {
    boolean bool = ((StaggeredGridLayoutManager)this.g).y;
    ArrayList arrayList = (ArrayList)this.f;
    return bool ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
  }
  
  public int e(int paramInt1, int paramInt2) {
    byte b;
    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager)this.g;
    int j = staggeredGridLayoutManager.t.m();
    int i = staggeredGridLayoutManager.t.i();
    if (paramInt2 > paramInt1) {
      b = 1;
    } else {
      b = -1;
    } 
    while (paramInt1 != paramInt2) {
      boolean bool1;
      View view = ((ArrayList<View>)this.f).get(paramInt1);
      int k = staggeredGridLayoutManager.t.g(view);
      int m = staggeredGridLayoutManager.t.d(view);
      boolean bool2 = false;
      if (k <= i) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (m >= j)
        bool2 = true; 
      if (bool1 && bool2 && (k < j || m > i))
        return a.R(view); 
      paramInt1 += b;
    } 
    return -1;
  }
  
  public Object f(Object paramObject) {
    paramObject.getClass();
    fb0 fb0 = (fb0)this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      c4 c4 = (c4)this.f;
      c4.getClass();
      paramObject = c4.a.get(paramObject);
      if (paramObject != null) {
        this.d++;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
        return paramObject;
      } 
    } finally {}
    this.e++;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    return null;
  }
  
  public int g(int paramInt) {
    int i = this.c;
    if (i != Integer.MIN_VALUE)
      return i; 
    if (((ArrayList)this.f).size() == 0)
      return paramInt; 
    a();
    return this.c;
  }
  
  public View h(int paramInt1, int paramInt2) {
    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager)this.g;
    ArrayList<View> arrayList = (ArrayList)this.f;
    View view2 = null;
    View view1 = null;
    if (paramInt2 == -1) {
      int i = arrayList.size();
      paramInt2 = 0;
      while (paramInt2 < i) {
        view2 = arrayList.get(paramInt2);
        if ((!staggeredGridLayoutManager.y || a.R(view2) > paramInt1) && (staggeredGridLayoutManager.y || a.R(view2) < paramInt1) && view2.hasFocusable()) {
          paramInt2++;
          view1 = view2;
        } 
      } 
      return view1;
    } 
    paramInt2 = arrayList.size() - 1;
    view1 = view2;
    while (paramInt2 >= 0) {
      view2 = arrayList.get(paramInt2);
      if ((!staggeredGridLayoutManager.y || a.R(view2) < paramInt1) && (staggeredGridLayoutManager.y || a.R(view2) > paramInt1) && view2.hasFocusable()) {
        paramInt2--;
        view1 = view2;
      } 
    } 
    return view1;
  }
  
  public int i(int paramInt) {
    ArrayList<View> arrayList = (ArrayList)this.f;
    int i = this.b;
    if (i != Integer.MIN_VALUE)
      return i; 
    if (arrayList.size() == 0)
      return paramInt; 
    View view = arrayList.get(0);
    xo1 xo1 = (xo1)view.getLayoutParams();
    this.b = ((StaggeredGridLayoutManager)this.g).t.g(view);
    xo1.getClass();
    return this.b;
  }
  
  public Object j(Object paramObject1, Object paramObject2) {
    paramObject1.getClass();
    fb0 fb0 = (fb0)this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      this.c += k(paramObject1, paramObject2);
      c4 c4 = (c4)this.f;
      c4.getClass();
      paramObject2 = c4.a.put(paramObject1, paramObject2);
      if (paramObject2 != null)
        this.c -= k(paramObject1, paramObject2); 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    m(this.b);
    return paramObject2;
  }
  
  public int k(Object paramObject1, Object paramObject2) {
    int i = l(paramObject1, paramObject2);
    if (i >= 0)
      return i; 
    StringBuilder stringBuilder = new StringBuilder("Negative size: ");
    stringBuilder.append(paramObject1);
    stringBuilder.append('=');
    stringBuilder.append(paramObject2);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public int l(Object paramObject1, Object paramObject2) {
    paramObject1.getClass();
    paramObject2.getClass();
    return 1;
  }
  
  public void m(int paramInt) {
    while (true) {
      fb0 fb0 = (fb0)this.g;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
      try {
        if (this.c >= 0 && (!((c4)this.f).a.isEmpty() || this.c == 0)) {
          List<Object> list;
          if (this.c <= paramInt || ((c4)this.f).a.isEmpty()) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
            return;
          } 
          Set set = ((c4)this.f).a.entrySet();
          set.getClass();
          boolean bool = set instanceof List;
          Map.Entry entry1 = null;
          if (bool) {
            list = (List)set;
            if (!list.isEmpty())
              entry1 = (Map.Entry)list.get(0); 
          } else {
            Iterator<Object> iterator = list.iterator();
            if (iterator.hasNext())
              entry1 = (Map.Entry)iterator.next(); 
          } 
          Map.Entry entry2 = entry1;
          if (entry2 == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
            return;
          } 
          entry1 = (Map.Entry)entry2.getKey();
          entry2 = (Map.Entry)entry2.getValue();
          c4 c4 = (c4)this.f;
          c4.getClass();
          entry1.getClass();
          c4.a.remove(entry1);
          this.c -= k(entry1, entry2);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
          entry2.getClass();
          continue;
        } 
      } finally {
        Exception exception;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("LruCache.sizeOf() is reporting inconsistent results!");
      throw illegalStateException;
    } 
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 0:
        break;
    } 
    fb0 fb0 = (fb0)this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      i = this.d;
      int j = this.e + i;
      if (j != 0) {
        i = i * 100 / j;
      } else {
        i = 0;
      } 
    } finally {
      Exception exception;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    this("LruCache[maxSize=");
    int i;
    stringBuilder.append(this.b);
    stringBuilder.append(hbrAVtEa.bLnJm);
    stringBuilder.append(this.d);
    stringBuilder.append(",misses=");
    stringBuilder.append(this.e);
    stringBuilder.append(",hitRate=");
    stringBuilder.append(i);
    stringBuilder.append("%]");
    String str = stringBuilder.toString();
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */