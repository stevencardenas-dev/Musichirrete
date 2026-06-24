import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class y20 {
  public static EdgeEffect a(Context paramContext, AttributeSet paramAttributeSet) {
    try {
      return new EdgeEffect(paramContext, paramAttributeSet);
    } finally {
      paramAttributeSet = null;
    } 
  }
  
  public static float b(EdgeEffect paramEdgeEffect) {
    try {
      return paramEdgeEffect.getDistance();
    } finally {
      paramEdgeEffect = null;
    } 
  }
  
  public static float c(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2) {
    try {
      return paramEdgeEffect.onPullDistance(paramFloat1, paramFloat2);
    } finally {
      Exception exception = null;
      paramEdgeEffect.onPull(paramFloat1, paramFloat2);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */