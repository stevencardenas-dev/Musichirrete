import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class go1 {
  public int a;
  
  public int b;
  
  public final ua0 c;
  
  public final ArrayList d;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g;
  
  public boolean h;
  
  public boolean i;
  
  public final ArrayList j;
  
  public final ArrayList k;
  
  public final sb0 l;
  
  public go1(int paramInt1, int paramInt2, sb0 paramsb0) {}
  
  public final void a(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    this.h = false;
    if (!this.e) {
      this.e = true;
      if (this.j.isEmpty()) {
        b();
        return;
      } 
      for (fo1 fo1 : nm.v0(this.k)) {
        fo1.getClass();
        if (!fo1.b)
          fo1.a(paramViewGroup); 
        fo1.b = true;
      } 
    } 
  }
  
  public final void b() {
    this.h = false;
    if (!this.f) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("SpecialEffectsController: ");
        stringBuilder.append(this);
        stringBuilder.append(" has called complete.");
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      this.f = true;
      ArrayList<Object> arrayList = this.d;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        Runnable runnable = (Runnable)arrayList.get(b);
        b++;
        ((Runnable)runnable).run();
      } 
    } 
    this.c.p = false;
    this.l.k();
  }
  
  public final void c(fo1 paramfo1) {
    paramfo1.getClass();
    ArrayList arrayList = this.j;
    if (arrayList.remove(paramfo1) && arrayList.isEmpty())
      b(); 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (paramInt1 != 0) {
      if (paramInt2 != 0) {
        paramInt2 = x41.y(paramInt2);
        ua0 ua01 = this.c;
        if (paramInt2 != 0) {
          if (paramInt2 != 1) {
            if (paramInt2 == 2) {
              if (lb0.M(2)) {
                StringBuilder stringBuilder = new StringBuilder("SpecialEffectsController: For fragment ");
                stringBuilder.append(ua01);
                stringBuilder.append(" mFinalState = ");
                stringBuilder.append(ga1.q(this.a));
                stringBuilder.append(" -> REMOVED. mLifecycleImpact  = ");
                stringBuilder.append(ga1.p(this.b));
                stringBuilder.append(" to REMOVING.");
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              this.a = 1;
              this.b = 3;
              this.i = true;
              return;
            } 
          } else if (this.a == 1) {
            if (lb0.M(2)) {
              StringBuilder stringBuilder = new StringBuilder("SpecialEffectsController: For fragment ");
              stringBuilder.append(ua01);
              stringBuilder.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
              stringBuilder.append(ga1.p(this.b));
              stringBuilder.append(" to ADDING.");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            this.a = 2;
            this.b = 2;
            this.i = true;
            return;
          } 
        } else if (this.a != 1) {
          if (lb0.M(2)) {
            StringBuilder stringBuilder = new StringBuilder("SpecialEffectsController: For fragment ");
            stringBuilder.append(ua01);
            stringBuilder.append(" mFinalState = ");
            stringBuilder.append(ga1.q(this.a));
            stringBuilder.append(" -> ");
            stringBuilder.append(ga1.q(paramInt1));
            stringBuilder.append('.');
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          this.a = paramInt1;
        } 
        return;
      } 
      throw null;
    } 
    throw null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = x41.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
    stringBuilder.append(ga1.q(this.a));
    stringBuilder.append(" lifecycleImpact = ");
    stringBuilder.append(ga1.p(this.b));
    stringBuilder.append(" fragment = ");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\go1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */