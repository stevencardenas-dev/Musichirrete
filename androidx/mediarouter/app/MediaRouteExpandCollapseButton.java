package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import c7;
import i1;
import qz1;

public class MediaRouteExpandCollapseButton extends c7 {
  public final AnimationDrawable f;
  
  public final AnimationDrawable g;
  
  public final String h;
  
  public final String i;
  
  public boolean j;
  
  public View.OnClickListener k;
  
  public MediaRouteExpandCollapseButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    AnimationDrawable animationDrawable1 = (AnimationDrawable)paramContext.getDrawable(2131231521);
    this.f = animationDrawable1;
    AnimationDrawable animationDrawable2 = (AnimationDrawable)paramContext.getDrawable(2131231520);
    this.g = animationDrawable2;
    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(qz1.w(paramContext, paramInt), PorterDuff.Mode.SRC_IN);
    animationDrawable1.setColorFilter((ColorFilter)porterDuffColorFilter);
    animationDrawable2.setColorFilter((ColorFilter)porterDuffColorFilter);
    String str = paramContext.getString(2131886868);
    this.h = str;
    this.i = paramContext.getString(2131886866);
    setImageDrawable(animationDrawable1.getFrame(0));
    setContentDescription(str);
    super.setOnClickListener((View.OnClickListener)new i1(4, this));
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener) {
    this.k = paramOnClickListener;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\mediarouter\app\MediaRouteExpandCollapseButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */