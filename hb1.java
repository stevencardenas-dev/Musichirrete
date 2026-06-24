import android.util.SparseArray;

public enum hb1 {
  b;
  
  public static final hb1[] c;
  
  static {
    Enum<Enum> enum_1 = new Enum<Enum>("DEFAULT", 0);
    b = (hb1)enum_1;
    Enum<Enum> enum_4 = new Enum<Enum>("UNMETERED_ONLY", 1);
    Enum<Enum> enum_6 = new Enum<Enum>("UNMETERED_OR_DAILY", 2);
    Enum<Enum> enum_2 = new Enum<Enum>("FAST_IF_RADIO_AWAKE", 3);
    Enum<Enum> enum_3 = new Enum<Enum>("NEVER", 4);
    Enum<Enum> enum_5 = new Enum<Enum>("UNRECOGNIZED", 5);
    c = new hb1[] { (hb1)enum_1, (hb1)enum_4, (hb1)enum_6, (hb1)enum_2, (hb1)enum_3, (hb1)enum_5 };
    SparseArray sparseArray = new SparseArray();
    sparseArray.put(0, enum_1);
    sparseArray.put(1, enum_4);
    sparseArray.put(2, enum_6);
    sparseArray.put(3, enum_2);
    sparseArray.put(4, enum_3);
    sparseArray.put(-1, enum_5);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */