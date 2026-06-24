import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class db2 extends jb2 {
  public final Intent b;
  
  public final GoogleApiActivity c;
  
  public db2(Intent paramIntent, GoogleApiActivity paramGoogleApiActivity) {
    this.b = paramIntent;
    this.c = paramGoogleApiActivity;
  }
  
  public final void a() {
    Intent intent = this.b;
    if (intent != null)
      this.c.startActivityForResult(intent, 2); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\db2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */