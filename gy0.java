import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

public final class gy0 {
  public long a;
  
  public long b;
  
  public TimeInterpolator c = null;
  
  public int d = 0;
  
  public int e = 1;
  
  public gy0(long paramLong) {
    this.a = paramLong;
    this.b = 150L;
  }
  
  public final void a(ObjectAnimator paramObjectAnimator) {
    paramObjectAnimator.setStartDelay(this.a);
    paramObjectAnimator.setDuration(this.b);
    paramObjectAnimator.setInterpolator(b());
    paramObjectAnimator.setRepeatCount(this.d);
    paramObjectAnimator.setRepeatMode(this.e);
  }
  
  public final TimeInterpolator b() {
    TimeInterpolator timeInterpolator = this.c;
    return (TimeInterpolator)((timeInterpolator != null) ? timeInterpolator : g5.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof gy0))
      return false; 
    paramObject = paramObject;
    return (this.a != ((gy0)paramObject).a) ? false : ((this.b != ((gy0)paramObject).b) ? false : ((this.d != ((gy0)paramObject).d) ? false : ((this.e != ((gy0)paramObject).e) ? false : b().getClass().equals(paramObject.b().getClass()))));
  }
  
  public final int hashCode() {
    long l = this.a;
    int j = (int)(l ^ l >>> 32L);
    l = this.b;
    int i = (int)(l >>> 32L ^ l);
    return ((b().getClass().hashCode() + (j * 31 + i) * 31) * 31 + this.d) * 31 + this.e;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n");
    stringBuilder.append(gy0.class.getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" delay: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" duration: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" interpolator: ");
    stringBuilder.append(b().getClass());
    stringBuilder.append(" repeatCount: ");
    stringBuilder.append(this.d);
    stringBuilder.append(" repeatMode: ");
    return x41.m(stringBuilder, this.e, "}\n");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */