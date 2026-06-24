import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class ed extends cl {
  public final void handleMessage(Message paramMessage) {
    StringBuilder stringBuilder;
    int i = paramMessage.what;
    if (i != 1) {
      if (i != 2) {
        stringBuilder = new StringBuilder(String.valueOf(i).length() + 34);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
        return;
      } 
      ((BasePendingResult)((Message)stringBuilder).obj).c(Status.h);
      return;
    } 
    Pair pair = (Pair)((Message)stringBuilder).obj;
    oo2 oo2 = (oo2)pair.first;
    sg1 sg1 = (sg1)pair.second;
    try {
      oo2.a(sg1);
      return;
    } catch (RuntimeException runtimeException) {
      i = BasePendingResult.k;
      throw runtimeException;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */