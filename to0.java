import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class to0 {
  public final IntentFilter a;
  
  public final BroadcastReceiver b;
  
  public boolean c;
  
  public boolean d;
  
  public to0(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    this.a = paramIntentFilter;
    this.b = paramBroadcastReceiver;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("Receiver{");
    stringBuilder.append(this.b);
    stringBuilder.append(" filter=");
    stringBuilder.append(this.a);
    if (this.d)
      stringBuilder.append(" DEAD"); 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\to0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */