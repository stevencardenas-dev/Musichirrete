import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.tabs.xm.VDgS;

public final class l80 {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g;
  
  public final FlexboxLayoutManager h;
  
  public l80(FlexboxLayoutManager paramFlexboxLayoutManager) {
    this.h = paramFlexboxLayoutManager;
    this.d = 0;
  }
  
  public static void a(l80 paraml80) {
    int i;
    FlexboxLayoutManager flexboxLayoutManager = paraml80.h;
    if (!flexboxLayoutManager.j() && flexboxLayoutManager.w) {
      if (paraml80.e) {
        i = flexboxLayoutManager.E.i();
      } else {
        i = ((a)flexboxLayoutManager).p - flexboxLayoutManager.E.m();
      } 
      paraml80.c = i;
      return;
    } 
    boolean bool = paraml80.e;
    f51 f51 = flexboxLayoutManager.E;
    if (bool) {
      i = f51.i();
    } else {
      i = f51.m();
    } 
    paraml80.c = i;
  }
  
  public static void b(l80 paraml80) {
    paraml80.a = -1;
    paraml80.b = -1;
    paraml80.c = Integer.MIN_VALUE;
    boolean bool2 = false;
    boolean bool1 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    paraml80.f = false;
    paraml80.g = false;
    FlexboxLayoutManager flexboxLayoutManager = paraml80.h;
    boolean bool = flexboxLayoutManager.j();
    int i = flexboxLayoutManager.s;
    if (bool) {
      if (i == 0) {
        bool1 = bool3;
        if (flexboxLayoutManager.r == 1)
          bool1 = true; 
        paraml80.e = bool1;
        return;
      } 
      bool1 = bool2;
      if (i == 2)
        bool1 = true; 
      paraml80.e = bool1;
      return;
    } 
    if (i == 0) {
      if (flexboxLayoutManager.r == 3)
        bool1 = true; 
      paraml80.e = bool1;
      return;
    } 
    bool1 = bool4;
    if (i == 2)
      bool1 = true; 
    paraml80.e = bool1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mFlexLinePosition=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mCoordinate=");
    stringBuilder.append(this.c);
    stringBuilder.append(VDgS.acktHoX);
    stringBuilder.append(this.d);
    stringBuilder.append(", mLayoutFromEnd=");
    stringBuilder.append(this.e);
    stringBuilder.append(", mValid=");
    stringBuilder.append(this.f);
    stringBuilder.append(", mAssignedFromSavedState=");
    stringBuilder.append(this.g);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */