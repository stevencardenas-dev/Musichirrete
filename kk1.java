import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class kk1 extends ek1 {
  public final AtomicReferenceArray g = new AtomicReferenceArray(jk1.f);
  
  public kk1(long paramLong, kk1 paramkk1, int paramInt) {
    super(paramLong, paramkk1, paramInt);
  }
  
  public final int k() {
    return jk1.f;
  }
  
  public final void l(int paramInt, os paramos) {
    f1 f1 = jk1.e;
    this.g.set(paramInt, f1);
    m();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("SemaphoreSegment[id=");
    stringBuilder.append(this.e);
    stringBuilder.append(LHyji.drBuGywaRthgDwW);
    stringBuilder.append(hashCode());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */