package j$.time.format;

import java.util.Comparator;
import java.util.Map;

public final class r implements Comparator {
  public final int compare(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((String)((Map.Entry)paramObject2).getKey()).length() - ((String)paramObject1.getKey()).length();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */