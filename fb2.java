import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class fb2 extends cl {
  public final Context b;
  
  public final ke0 c;
  
  public fb2(ke0 paramke0, Context paramContext) {
    super(looper, 4);
    Looper looper;
    this.b = paramContext.getApplicationContext();
  }
  
  public final void handleMessage(Message paramMessage) {
    PendingIntent pendingIntent;
    int i = paramMessage.what;
    if (i != 1) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 39);
      stringBuilder.append("Don't know how to handle this message: ");
      stringBuilder.append(i);
      Log.w("GoogleApiAvailability", stringBuilder.toString());
      return;
    } 
    i = le0.a;
    ke0 ke01 = this.c;
    Context context = this.b;
    int j = ke01.b(context, i);
    i = pe0.c;
    if (j != 1 && j != 2 && j != 3 && j != 9)
      return; 
    Intent intent = ke01.a(j, context, "n");
    if (intent == null) {
      intent = null;
    } else {
      pendingIntent = PendingIntent.getActivity(context, 0, intent, 201326592);
    } 
    ke01.f(context, j, pendingIntent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */