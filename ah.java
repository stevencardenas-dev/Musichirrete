import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

public final class ah {
  public final int a;
  
  public int b;
  
  public boolean c;
  
  public Object d;
  
  public Object e;
  
  public ah(ah paramah, u70[] paramArrayOfu70, boolean paramBoolean, int paramInt) {
    this.e = paramah;
    this.d = paramArrayOfu70;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramArrayOfu70 != null) {
      bool1 = bool2;
      if (paramBoolean)
        bool1 = true; 
    } 
    this.c = bool1;
    this.b = paramInt;
  }
  
  public ah(BottomSheetBehavior paramBottomSheetBehavior) {
    this.e = paramBottomSheetBehavior;
    this.d = new e3(5, this);
  }
  
  public ah(SideSheetBehavior paramSideSheetBehavior) {
    this.e = paramSideSheetBehavior;
    this.d = new xt0(18, this);
  }
  
  public static ah b() {
    ah ah1 = new ah();
    ah1.c = true;
    ah1.b = 0;
    return ah1;
  }
  
  public ah a() {
    boolean bool;
    if ((kf1)this.d != null) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.g("execute parameter required", bool);
    return new ah(this, (u70[])this.e, this.c, this.b);
  }
  
  public void c(int paramInt) {
    WeakReference weakReference1;
    SideSheetBehavior sideSheetBehavior;
    switch (this.a) {
      default:
        sideSheetBehavior = (SideSheetBehavior)this.e;
        weakReference1 = sideSheetBehavior.p;
        if (weakReference1 != null && weakReference1.get() != null) {
          this.b = paramInt;
          if (!this.c) {
            ((View)sideSheetBehavior.p.get()).postOnAnimation((xt0)this.d);
            this.c = true;
          } 
        } 
        return;
      case 0:
        break;
    } 
    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)this.e;
    WeakReference weakReference2 = bottomSheetBehavior.W;
    if (weakReference2 != null && weakReference2.get() != null) {
      this.b = paramInt;
      if (!this.c) {
        ((View)bottomSheetBehavior.W.get()).postOnAnimation((e3)this.d);
        this.c = true;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */