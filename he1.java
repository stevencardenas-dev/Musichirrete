import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public abstract class he1 {
  public static final List v = Collections.EMPTY_LIST;
  
  public final View b;
  
  public WeakReference c;
  
  public int e = -1;
  
  public int f = -1;
  
  public long g = -1L;
  
  public int h = -1;
  
  public int i = -1;
  
  public he1 j = null;
  
  public he1 k = null;
  
  public int l;
  
  public ArrayList m = null;
  
  public List n = null;
  
  public int o = 0;
  
  public yd1 p = null;
  
  public boolean q = false;
  
  public int r = 0;
  
  public int s = -1;
  
  public RecyclerView t;
  
  public id1 u;
  
  public he1(View paramView) {
    if (paramView != null) {
      this.b = paramView;
      return;
    } 
    l0.l("itemView may not be null");
    throw null;
  }
  
  public final void a(int paramInt) {
    this.l = paramInt | this.l;
  }
  
  public final int b() {
    RecyclerView recyclerView = this.t;
    return (recyclerView == null) ? -1 : recyclerView.K(this);
  }
  
  public final int c() {
    if (this.u == null)
      return -1; 
    RecyclerView recyclerView = this.t;
    if (recyclerView == null)
      return -1; 
    id1 id11 = recyclerView.getAdapter();
    if (id11 == null)
      return -1; 
    int i = this.t.K(this);
    return (i == -1) ? -1 : ((this.u == id11) ? i : -1);
  }
  
  public final int d() {
    int i = this.i;
    return (i == -1) ? this.e : i;
  }
  
  public final List e() {
    if ((this.l & 0x400) == 0) {
      ArrayList arrayList = this.m;
      if (arrayList != null && arrayList.size() != 0)
        return this.n; 
    } 
    return v;
  }
  
  public final boolean f() {
    View view = this.b;
    return (view.getParent() != null && view.getParent() != this.t);
  }
  
  public final boolean g() {
    return ((this.l & 0x1) != 0);
  }
  
  public final boolean h() {
    return ((this.l & 0x4) != 0);
  }
  
  public final boolean i() {
    if ((this.l & 0x10) == 0) {
      WeakHashMap weakHashMap = v22.a;
      if (!this.b.hasTransientState())
        return true; 
    } 
    return false;
  }
  
  public final boolean j() {
    return ((this.l & 0x8) != 0);
  }
  
  public final boolean k() {
    return (this.p != null);
  }
  
  public final boolean l() {
    return ((this.l & 0x100) != 0);
  }
  
  public final boolean m() {
    return ((this.l & 0x2) != 0);
  }
  
  public final void n(int paramInt, boolean paramBoolean) {
    if (this.f == -1)
      this.f = this.e; 
    if (this.i == -1)
      this.i = this.e; 
    if (paramBoolean)
      this.i += paramInt; 
    this.e += paramInt;
    View view = this.b;
    if (view.getLayoutParams() != null)
      ((sd1)view.getLayoutParams()).e = true; 
  }
  
  public final void o() {
    if (!RecyclerView.E0 || !l()) {
      this.l = 0;
      this.e = -1;
      this.f = -1;
      this.g = -1L;
      this.i = -1;
      this.o = 0;
      this.j = null;
      this.k = null;
      ArrayList arrayList = this.m;
      if (arrayList != null)
        arrayList.clear(); 
      this.l &= 0xFFFFFBFF;
      this.r = 0;
      this.s = -1;
      RecyclerView.k(this);
      return;
    } 
    m60.h(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
  }
  
  public final void p(boolean paramBoolean) {
    int i = this.o;
    if (paramBoolean) {
      i--;
    } else {
      i++;
    } 
    this.o = i;
    if (i < 0) {
      this.o = 0;
      if (!RecyclerView.E0) {
        StringBuilder stringBuilder = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        stringBuilder.append(this);
        Log.e("View", stringBuilder.toString());
      } else {
        StringBuilder stringBuilder = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        stringBuilder.append(this);
        throw new RuntimeException(stringBuilder.toString());
      } 
    } else if (!paramBoolean && i == 1) {
      this.l |= 0x10;
    } else if (paramBoolean && i == 0) {
      this.l &= 0xFFFFFFEF;
    } 
    if (RecyclerView.F0) {
      StringBuilder stringBuilder = new StringBuilder("setIsRecyclable val:");
      stringBuilder.append(paramBoolean);
      stringBuilder.append(":");
      stringBuilder.append(this);
      Log.d("RecyclerView", stringBuilder.toString());
    } 
  }
  
  public final boolean q() {
    return ((this.l & 0x80) != 0);
  }
  
  public final boolean r() {
    return ((this.l & 0x20) != 0);
  }
  
  public final String toString() {
    String str;
    if (getClass().isAnonymousClass()) {
      str = "ViewHolder";
    } else {
      str = getClass().getSimpleName();
    } 
    StringBuilder stringBuilder1 = ga1.l(str, "{");
    stringBuilder1.append(Integer.toHexString(hashCode()));
    stringBuilder1.append(" position=");
    stringBuilder1.append(this.e);
    stringBuilder1.append(" id=");
    stringBuilder1.append(this.g);
    stringBuilder1.append(", oldPos=");
    stringBuilder1.append(this.f);
    stringBuilder1.append(", pLpos:");
    stringBuilder1.append(this.i);
    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder1.toString());
    if (k()) {
      String str1;
      stringBuilder2.append(" scrap ");
      if (this.q) {
        str1 = "[changeScrap]";
      } else {
        str1 = "[attachedScrap]";
      } 
      stringBuilder2.append(str1);
    } 
    if (h())
      stringBuilder2.append(" invalid"); 
    if (!g())
      stringBuilder2.append(" unbound"); 
    if ((this.l & 0x2) != 0)
      stringBuilder2.append(" update"); 
    if (j())
      stringBuilder2.append(" removed"); 
    if (q())
      stringBuilder2.append(" ignored"); 
    if (l())
      stringBuilder2.append(" tmpDetached"); 
    if (!i()) {
      stringBuilder1 = new StringBuilder(GMDx.UtP);
      stringBuilder1.append(this.o);
      stringBuilder1.append(")");
      stringBuilder2.append(stringBuilder1.toString());
    } 
    if ((this.l & 0x200) != 0 || h())
      stringBuilder2.append(" undefined adapter position"); 
    if (this.b.getParent() == null)
      stringBuilder2.append(" no parent"); 
    stringBuilder2.append("}");
    return stringBuilder2.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\he1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */