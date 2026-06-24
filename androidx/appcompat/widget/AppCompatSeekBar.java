package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import j7;
import ku1;

public class AppCompatSeekBar extends SeekBar {
  public final j7 b;
  
  public AppCompatSeekBar(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969898);
  }
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    j7 j71 = new j7(this);
    this.b = j71;
    j71.A(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    j7 j71 = this.b;
    AppCompatSeekBar appCompatSeekBar = j71.g;
    Drawable drawable = j71.h;
    if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBar.getDrawableState()))
      appCompatSeekBar.invalidateDrawable(drawable); 
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.b.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: getfield b : Lj7;
    //   11: aload_1
    //   12: invokevirtual N : (Landroid/graphics/Canvas;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
    //   19	21	18	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */