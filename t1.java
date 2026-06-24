import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public final class t1 extends AppCompatImageView implements v1 {
  public final u1 f;
  
  public t1(u1 paramu1, Context paramContext) {
    super(paramContext, null, 2130968609);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    qv.Y((View)this, getContentDescription());
    setOnTouchListener(new p1(this, this));
  }
  
  public final boolean a() {
    return false;
  }
  
  public final boolean b() {
    return false;
  }
  
  public final boolean performClick() {
    if (super.performClick())
      return true; 
    playSoundEffect(0);
    this.f.l();
    return true;
  }
  
  public final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable drawable1 = getDrawable();
    Drawable drawable2 = getBackground();
    if (drawable1 != null && drawable2 != null) {
      int i = getWidth();
      paramInt2 = getHeight();
      paramInt1 = Math.max(i, paramInt2) / 2;
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt3 = getPaddingTop();
      paramInt4 = getPaddingBottom();
      i = (i + j - k) / 2;
      paramInt2 = (paramInt2 + paramInt3 - paramInt4) / 2;
      drawable2.setHotspotBounds(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    } 
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */