import android.view.accessibility.AccessibilityNodeInfo;

public final class s0 implements j70 {
  public final Object b;
  
  public static s0 a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return new s0(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, false, paramBoolean));
  }
  
  public Object get() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */