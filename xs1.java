import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

public final class xs1 implements r32 {
  public final WeakReference b;
  
  public int c;
  
  public int e;
  
  public xs1(TabLayout paramTabLayout) {
    this.b = new WeakReference<TabLayout>(paramTabLayout);
  }
  
  public final void k(int paramInt) {
    this.c = this.e;
    this.e = paramInt;
    TabLayout tabLayout = this.b.get();
    if (tabLayout != null)
      tabLayout.a0 = this.e; 
  }
  
  public final void q(int paramInt) {
    TabLayout tabLayout = this.b.get();
    if (tabLayout != null && tabLayout.getSelectedTabPosition() != paramInt && paramInt < tabLayout.getTabCount()) {
      boolean bool;
      int i = this.e;
      if (i == 0 || (i == 2 && this.c == 0)) {
        bool = true;
      } else {
        bool = false;
      } 
      tabLayout.m(tabLayout.h(paramInt), bool);
    } 
  }
  
  public final void z(int paramInt, float paramFloat) {
    TabLayout tabLayout = this.b.get();
    if (tabLayout != null) {
      int i = this.e;
      boolean bool1 = true;
      if (i == 2 && this.c != 1)
        bool1 = false; 
      boolean bool3 = true;
      boolean bool2 = bool3;
      if (i == 2)
        if (this.c != 0) {
          bool2 = bool3;
        } else {
          bool2 = false;
        }  
      tabLayout.o(paramInt, paramFloat, bool1, bool2, false);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */