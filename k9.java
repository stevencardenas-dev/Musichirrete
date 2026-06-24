import android.media.AudioAttributes;

public final class k9 {
  public static final k9 b = (k9)new Object();
  
  public AudioAttributes a;
  
  public final AudioAttributes a() {
    if (this.a == null) {
      AudioAttributes.Builder builder = (new AudioAttributes.Builder()).setContentType(2).setFlags(0).setUsage(1);
      if (d12.a >= 29)
        builder.setAllowedCapturePolicy(1); 
      this.a = builder.build();
    } 
    return this.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || k9.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return true;
  }
  
  public final int hashCode() {
    return 15759471;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */