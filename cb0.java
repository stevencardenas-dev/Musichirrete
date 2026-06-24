import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

public final class cb0 implements f2 {
  public final int b;
  
  public final lb0 c;
  
  public final void a(Object paramObject) {
    StringBuilder stringBuilder;
    e2 e2;
    hb0 hb0;
    int i = this.b;
    lb0 lb01 = this.c;
    switch (i) {
      default:
        e2 = (e2)paramObject;
        hb0 = lb01.F.pollFirst();
        if (hb0 == null) {
          paramObject = new StringBuilder("No IntentSenders were started for ");
          paramObject.append(this);
          Log.w("FragmentManager", paramObject.toString());
        } else {
          paramObject = hb0.b;
          i = hb0.c;
          ua0 ua0 = lb01.c.r((String)paramObject);
          if (ua0 == null) {
            stringBuilder = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
            stringBuilder.append((String)paramObject);
            Log.w("FragmentManager", stringBuilder.toString());
          } else {
            stringBuilder.c0(i, e2.b, e2.c);
          } 
        } 
        return;
      case 1:
        e2 = (e2)paramObject;
        hb0 = ((lb0)stringBuilder).F.pollLast();
        if (hb0 == null) {
          paramObject = new StringBuilder("No Activities were started for result for ");
          paramObject.append(this);
          Log.w("FragmentManager", paramObject.toString());
        } else {
          paramObject = hb0.b;
          i = hb0.c;
          ua0 ua0 = ((lb0)stringBuilder).c.r((String)paramObject);
          if (ua0 == null) {
            stringBuilder = new StringBuilder("Activity result delivered for unknown Fragment ");
            stringBuilder.append((String)paramObject);
            Log.w("FragmentManager", stringBuilder.toString());
          } else {
            stringBuilder.c0(i, e2.b, e2.c);
          } 
        } 
        return;
      case 0:
        break;
    } 
    Map map = (Map)paramObject;
    paramObject = map.keySet().toArray((Object[])new String[0]);
    paramObject = new ArrayList(map.values());
    int[] arrayOfInt = new int[paramObject.size()];
    for (i = 0; i < paramObject.size(); i++) {
      byte b;
      if (((Boolean)paramObject.get(i)).booleanValue()) {
        b = 0;
      } else {
        b = -1;
      } 
      arrayOfInt[i] = b;
    } 
    paramObject = ((lb0)stringBuilder).F.pollFirst();
    if (paramObject == null) {
      paramObject = new StringBuilder("No permissions were requested for ");
      paramObject.append(this);
      Log.w("FragmentManager", paramObject.toString());
    } else {
      paramObject = ((hb0)paramObject).b;
      if (((lb0)stringBuilder).c.r((String)paramObject) == null) {
        stringBuilder = new StringBuilder("Permission request result delivered for unknown Fragment ");
        stringBuilder.append((String)paramObject);
        Log.w("FragmentManager", stringBuilder.toString());
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */