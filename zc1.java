import android.media.Rating;

public abstract class zc1 {
  public static float a(Rating paramRating) {
    return paramRating.getPercentRating();
  }
  
  public static int b(Rating paramRating) {
    return paramRating.getRatingStyle();
  }
  
  public static float c(Rating paramRating) {
    return paramRating.getStarRating();
  }
  
  public static boolean d(Rating paramRating) {
    return paramRating.hasHeart();
  }
  
  public static boolean e(Rating paramRating) {
    return paramRating.isRated();
  }
  
  public static boolean f(Rating paramRating) {
    return paramRating.isThumbUp();
  }
  
  public static Rating g(boolean paramBoolean) {
    return Rating.newHeartRating(paramBoolean);
  }
  
  public static Rating h(float paramFloat) {
    return Rating.newPercentageRating(paramFloat);
  }
  
  public static Rating i(int paramInt, float paramFloat) {
    return Rating.newStarRating(paramInt, paramFloat);
  }
  
  public static Rating j(boolean paramBoolean) {
    return Rating.newThumbRating(paramBoolean);
  }
  
  public static Rating k(int paramInt) {
    return Rating.newUnratedRating(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */