import java.util.Arrays;

public enum pf2 {
  c;
  
  public static final zh2 e;
  
  public static final pf2[] f;
  
  public final int b;
  
  static {
    zh2 zh21;
    pf2 pf21 = new pf2("RESPONSE_CODE_UNSPECIFIED", 0, -999);
    c = pf21;
    f = new pf2[] { 
        pf21, new pf2("SERVICE_TIMEOUT", 1, -3), new pf2("FEATURE_NOT_SUPPORTED", 2, -2), new pf2("SERVICE_DISCONNECTED", 3, -1), new pf2("OK", 4, 0), new pf2("USER_CANCELED", 5, 1), new pf2("SERVICE_UNAVAILABLE", 6, 2), new pf2("BILLING_UNAVAILABLE", 7, 3), new pf2("ITEM_UNAVAILABLE", 8, 4), new pf2("DEVELOPER_ERROR", 9, 5), 
        new pf2("ERROR", 10, 6), new pf2("ITEM_ALREADY_OWNED", 11, 7), new pf2("ITEM_NOT_OWNED", 12, 8), new pf2("EXPIRED_OFFER_TOKEN", 13, 11), new pf2("NETWORK_ERROR", 14, 12) };
    Object object = new Object();
    ((d7)object).c = new Object[8];
    ((d7)object).b = 0;
    for (pf2 pf22 : values()) {
      int k = pf22.b;
      int j = ((d7)object).b + 1;
      Object[] arrayOfObject = (Object[])((d7)object).c;
      int i = arrayOfObject.length;
      int m = j + j;
      if (m > i) {
        j = i;
        if (m > i) {
          j = i + (i >> 1) + 1;
          i = j;
          if (j < m) {
            i = Integer.highestOneBit(m - 1);
            i += i;
          } 
          j = i;
          if (i < 0)
            j = Integer.MAX_VALUE; 
        } 
        ((d7)object).c = Arrays.copyOf(arrayOfObject, j);
      } 
      arrayOfObject = (Object[])((d7)object).c;
      i = ((d7)object).b;
      j = i + i;
      arrayOfObject[j] = Integer.valueOf(k);
      arrayOfObject[j + 1] = pf22;
      ((d7)object).b = i + 1;
    } 
    fh2 fh2 = (fh2)((d7)object).e;
    if (fh2 == null) {
      zh21 = zh2.b(((d7)object).b, (Object[])((d7)object).c, (d7)object);
      object = ((d7)object).e;
      if (object == null) {
        e = zh21;
        return;
      } 
      throw object.a();
    } 
    throw zh21.a();
  }
  
  pf2(int paramInt1) {
    this.b = paramInt1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */