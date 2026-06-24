import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

public abstract class jr0 {
  public int b;
  
  public int c;
  
  public int e;
  
  public final Serializable f;
  
  public jr0(int paramInt1, Class paramClass, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.f = paramClass;
    this.e = paramInt2;
    this.c = paramInt3;
  }
  
  public jr0(kr0 paramkr0) {
    this.f = paramkr0;
    this.c = -1;
    this.e = paramkr0.j;
    d();
  }
  
  public void a() {
    if (((kr0)this.f).j == this.e)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public abstract Object b(View paramView);
  
  public abstract void c(View paramView, Object paramObject);
  
  public void d() {
    while (true) {
      int i = this.b;
      kr0 kr0 = (kr0)this.f;
      if (i < kr0.h && kr0.e[i] < 0) {
        this.b = i + 1;
        continue;
      } 
      break;
    } 
  }
  
  public void e(View paramView, Object paramObject) {
    Object object1;
    if (Build.VERSION.SDK_INT >= this.c) {
      c(paramView, paramObject);
      return;
    } 
    int j = Build.VERSION.SDK_INT;
    int i = this.c;
    Object object2 = null;
    if (j >= i) {
      object1 = b(paramView);
    } else {
      object1 = paramView.getTag(this.b);
      if (!((Class)this.f).isInstance(object1))
        object1 = null; 
    } 
    if (f(object1, paramObject)) {
      object1 = v22.d(paramView);
      if (object1 == null) {
        object1 = object2;
      } else if (object1 instanceof j0) {
        object1 = ((j0)object1).a;
      } else {
        object1 = new k0((View.AccessibilityDelegate)object1);
      } 
      object2 = object1;
      if (object1 == null)
        object2 = new k0(); 
      v22.n(paramView, (k0)object2);
      paramView.setTag(this.b, paramObject);
      v22.h(paramView, this.e);
    } 
  }
  
  public abstract boolean f(Object paramObject1, Object paramObject2);
  
  public boolean hasNext() {
    return (this.b < ((kr0)this.f).h);
  }
  
  public void remove() {
    kr0 kr0 = (kr0)this.f;
    a();
    if (this.c != -1) {
      kr0.c();
      kr0.k(this.c);
      this.c = -1;
      this.e = kr0.j;
      return;
    } 
    tp.f("Call next() before removing element from the iterator.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */