import android.widget.TextView;

public abstract class z7 {
  public static int a(TextView paramTextView) {
    return paramTextView.getAutoSizeStepGranularity();
  }
  
  public static void b(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramTextView.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void c(TextView paramTextView, int[] paramArrayOfint, int paramInt) {
    paramTextView.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
  }
  
  public static boolean d(TextView paramTextView, String paramString) {
    return paramTextView.setFontVariationSettings(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */