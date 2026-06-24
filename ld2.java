import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

public final class ld2 implements sh2 {
  public final int b;
  
  public final dd2 c;
  
  public final Object a() {
    File file;
    int i = this.b;
    dd2 dd21 = this.c;
    switch (i) {
      default:
        return new sr2(dd21.c.b);
      case 2:
        return new gg2(dd21.c.b);
      case 1:
        context1 = dd21.c.b;
        return new dg2(context1, context1.getPackageName());
      case 0:
        break;
    } 
    Context context2 = ((dd2)context1).c.b;
    Context context1 = null;
    try {
      Bundle bundle = (context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128)).metaData;
      if (bundle != null) {
        String str = bundle.getString("local_testing_dir");
        if (str != null)
          file = new File(context2.getExternalFilesDir(null), str); 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return file;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ld2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */