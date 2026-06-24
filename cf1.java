import android.os.Bundle;
import android.util.Log;

public final class cf1 {
  public final df1 a;
  
  public cf1(df1 paramdf1) {
    this.a = paramdf1;
  }
  
  public static void a(String paramString, Bundle paramBundle) {
    StringBuilder stringBuilder = new StringBuilder("Error: ");
    stringBuilder.append(paramString);
    stringBuilder.append(", data: ");
    stringBuilder.append(paramBundle);
    Log.d("MediaRouteProviderProxy", stringBuilder.toString());
  }
  
  public final void b(Bundle paramBundle) {
    paramBundle.getString("groupableTitle");
    paramBundle.getString("transferableTitle");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */