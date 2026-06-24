import android.content.Context;

public final class df {
  public volatile zb0 a;
  
  public final Context b;
  
  public volatile lf c;
  
  public final ef a() {
    Context context = this.b;
    if (context != null) {
      if (this.c != null) {
        if (this.a != null) {
          this.a.getClass();
          lf lf1 = this.c;
          zb0 zb01 = this.a;
          if (lf1 != null) {
            lf1 = this.c;
            return b() ? new wi2(zb01, context, lf1, this) : new ef(zb01, context, lf1, this);
          } 
          return b() ? new wi2(zb01, context, this) : new ef(zb01, context, this);
        } 
        l0.l("Pending purchases for one-time products must be supported.");
        return null;
      } 
      l0.l("Please provide a valid listener for purchases updates.");
      return null;
    } 
    l0.l("Please provide a valid Context.");
    return null;
  }
  
  public final boolean b() {
    try {
      Context context = this.b;
      return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
    } catch (Exception exception) {
      ph2.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", exception);
      return false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */