import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public final class s92 {
  public final ha2 a;
  
  public final String b;
  
  public final Context c;
  
  public final zb0 d;
  
  public final k92 e;
  
  public s92(Context paramContext, ha2 paramha2, zb0 paramzb0) {
    this.b = paramContext.getPackageName();
    this.a = paramha2;
    this.d = paramzb0;
    this.c = paramContext;
    ha2 ha21 = n92.a;
    try {
      boolean bool = (paramContext.getPackageManager().getApplicationInfo("com.android.vending", 0)).enabled;
      if (!bool) {
        ha21.b("Play Store package is disabled.", new Object[0]);
      } else {
        try {
          Signature[] arrayOfSignature = (paramContext.getPackageManager().getPackageInfo("com.android.vending", 64)).signatures;
          if (n92.a(arrayOfSignature)) {
            this.e = new k92(paramContext, paramha2, t92.a, (fb0)new Object());
            return;
          } 
        } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
          ha21.b("Play Store package is not found.", new Object[0]);
        } 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      ha21.b("Play Store package is not found.", new Object[0]);
    } 
    paramha2.getClass();
    if (Log.isLoggable("PlayCore", 6))
      Log.e("PlayCore", ha2.c(paramha2.a, "Phonesky is not installed.", new Object[0])); 
    this.e = null;
  }
  
  public static Bundle a(s92 params92, byte[] paramArrayOfbyte) {
    Bundle bundle = new Bundle();
    bundle.putString("package.name", params92.b);
    bundle.putByteArray("nonce", paramArrayOfbyte);
    bundle.putInt("playcore.integrity.version.major", 1);
    bundle.putInt("playcore.integrity.version.minor", 6);
    byte b = 0;
    bundle.putInt("playcore.integrity.version.patch", 0);
    ArrayList<aa2> arrayList1 = new ArrayList();
    arrayList1.add(new aa2(System.currentTimeMillis()));
    ArrayList<Bundle> arrayList = new ArrayList();
    int i = arrayList1.size();
    while (b < i) {
      aa2 aa21 = (aa2)arrayList1.get(b);
      b++;
      aa2 aa22 = aa21;
      Bundle bundle1 = new Bundle();
      aa22.getClass();
      bundle1.putInt("event_type", 3);
      bundle1.putLong("event_timestamp", aa22.a);
      arrayList.add(bundle1);
    } 
    bundle.putParcelableArrayList("event_timestamps", new ArrayList<Bundle>(arrayList));
    return bundle;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */