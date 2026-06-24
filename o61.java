import android.content.Context;
import android.util.Log;
import android.widget.OverScroller;
import android.window.ldG.XUaAMlaMSa;

public final class o61 implements Runnable {
  public final int b;
  
  public int c;
  
  public int e;
  
  public final Object f;
  
  public final Object g;
  
  public o61(bv2 parambv2, tb2 paramtb2, int paramInt1, int paramInt2) {
    this.g = parambv2;
    this.f = paramtb2;
    this.c = paramInt1;
    this.e = paramInt2;
  }
  
  public o61(u61 paramu61, Context paramContext) {
    this.g = paramu61;
    this.f = new bh0(paramContext);
  }
  
  public final void run() {
    int j;
    int i = this.b;
    Object object2 = this.f;
    Object object1 = this.g;
    switch (i) {
      default:
        object1 = object1;
        object2 = object2;
        j = this.c;
        i = this.e;
        object1.c(new tb2(((tb2)object2).a, j, i, ((tb2)object2).d, ((tb2)object2).e, ((tb2)object2).f, ((tb2)object2).g, ((tb2)object2).h, ((tb2)object2).i));
        return;
      case 0:
        break;
    } 
    object1 = object1;
    bh0 bh0 = (bh0)object2;
    if (!((OverScroller)bh0.c).isFinished()) {
      object2 = object1.h();
      if (object2 != null && ((OverScroller)bh0.c).computeScrollOffset()) {
        j = ((OverScroller)bh0.c).getCurrX();
        i = ((OverScroller)bh0.c).getCurrY();
        if (u61.B) {
          StringBuilder stringBuilder = new StringBuilder("fling run(). CurrentX:");
          stringBuilder.append(this.c);
          stringBuilder.append(XUaAMlaMSa.Retlq);
          stringBuilder.append(this.e);
          stringBuilder.append(" NewX:");
          stringBuilder.append(j);
          stringBuilder.append(" NewY:");
          stringBuilder.append(i);
          Log.d("PhotoViewAttacher", stringBuilder.toString());
        } 
        ((u61)object1).o.postTranslate((this.c - j), (this.e - i));
        object1.m(object1.g());
        this.c = j;
        this.e = i;
        object2.postOnAnimation(this);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */