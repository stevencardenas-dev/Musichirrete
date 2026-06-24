public enum lv2 {
  c, e;
  
  public static final lv2[] f;
  
  public static final lv2[] g;
  
  public final int b;
  
  static {
    wv2 wv26 = wv2.g;
    lv2 lv21 = new lv2("DOUBLE", 0, 0, 1, wv26);
    wv2 wv27 = wv2.f;
    lv2 lv24 = new lv2("FLOAT", 1, 1, 1, wv27);
    wv2 wv23 = wv2.e;
    lv2 lv218 = new lv2("INT64", 2, 2, 1, wv23);
    lv2 lv216 = new lv2("UINT64", 3, 3, 1, wv23);
    wv2 wv25 = wv2.c;
    lv2 lv223 = new lv2("INT32", 4, 4, 1, wv25);
    lv2 lv25 = new lv2("FIXED64", 5, 5, 1, wv23);
    lv2 lv217 = new lv2("FIXED32", 6, 6, 1, wv25);
    wv2 wv28 = wv2.h;
    lv2 lv28 = new lv2("BOOL", 7, 7, 1, wv28);
    wv2 wv22 = wv2.i;
    lv2 lv225 = new lv2("STRING", 8, 8, 1, wv22);
    wv2 wv21 = wv2.l;
    lv2 lv219 = new lv2("MESSAGE", 9, 9, 1, wv21);
    wv2 wv24 = wv2.j;
    lv2 lv29 = new lv2("BYTES", 10, 10, 1, wv24);
    lv2 lv211 = new lv2("UINT32", 11, 11, 1, wv25);
    wv2 wv29 = wv2.k;
    lv2 lv213 = new lv2("ENUM", 12, 12, 1, wv29);
    lv2 lv22 = new lv2("SFIXED32", 13, 13, 1, wv25);
    lv2 lv23 = new lv2("SFIXED64", 14, 14, 1, wv23);
    lv2 lv214 = new lv2("SINT32", 15, 15, 1, wv25);
    lv2 lv220 = new lv2("SINT64", 16, 16, 1, wv23);
    lv2 lv224 = new lv2("GROUP", 17, 17, 1, wv21);
    lv2 lv27 = new lv2("DOUBLE_LIST", 18, 18, 2, wv26);
    lv2 lv210 = new lv2("FLOAT_LIST", 19, 19, 2, wv27);
    lv2 lv26 = new lv2("INT64_LIST", 20, 20, 2, wv23);
    lv2 lv221 = new lv2("UINT64_LIST", 21, 21, 2, wv23);
    lv2 lv222 = new lv2("INT32_LIST", 22, 22, 2, wv25);
    lv2 lv212 = new lv2("FIXED64_LIST", 23, 23, 2, wv23);
    lv2 lv215 = new lv2("FIXED32_LIST", 24, 24, 2, wv25);
    lv2 lv226 = new lv2("BOOL_LIST", 25, 25, 2, wv28);
    lv2 lv227 = new lv2("STRING_LIST", 26, 26, 2, wv22);
    lv2 lv228 = new lv2("MESSAGE_LIST", 27, 27, 2, wv21);
    lv2 lv235 = new lv2("BYTES_LIST", 28, 28, 2, wv24);
    lv2 lv231 = new lv2("UINT32_LIST", 29, 29, 2, wv25);
    lv2 lv230 = new lv2("ENUM_LIST", 30, 30, 2, wv29);
    lv2 lv232 = new lv2("SFIXED32_LIST", 31, 31, 2, wv25);
    lv2 lv237 = new lv2("SFIXED64_LIST", 32, 32, 2, wv23);
    lv2 lv234 = new lv2("SINT32_LIST", 33, 33, 2, wv25);
    lv2 lv236 = new lv2("SINT64_LIST", 34, 34, 2, wv23);
    lv2 lv238 = new lv2("DOUBLE_LIST_PACKED", 35, 35, 3, wv26);
    c = lv238;
    lv2 lv242 = new lv2("FLOAT_LIST_PACKED", 36, 36, 3, wv27);
    lv2 lv243 = new lv2("INT64_LIST_PACKED", 37, 37, 3, wv23);
    lv2 lv239 = new lv2("UINT64_LIST_PACKED", 38, 38, 3, wv23);
    lv2 lv240 = new lv2("INT32_LIST_PACKED", 39, 39, 3, wv25);
    lv2 lv241 = new lv2("FIXED64_LIST_PACKED", 40, 40, 3, wv23);
    lv2 lv244 = new lv2("FIXED32_LIST_PACKED", 41, 41, 3, wv25);
    lv2 lv247 = new lv2("BOOL_LIST_PACKED", 42, 42, 3, wv28);
    lv2 lv245 = new lv2("UINT32_LIST_PACKED", 43, 43, 3, wv25);
    lv2 lv249 = new lv2("ENUM_LIST_PACKED", 44, 44, 3, wv29);
    lv2 lv248 = new lv2("SFIXED32_LIST_PACKED", 45, 45, 3, wv25);
    lv2 lv246 = new lv2("SFIXED64_LIST_PACKED", 46, 46, 3, wv23);
    lv2 lv233 = new lv2("SINT32_LIST_PACKED", 47, 47, 3, wv25);
    lv2 lv229 = new lv2("SINT64_LIST_PACKED", 48, 48, 3, wv23);
    e = lv229;
    g = new lv2[] { 
        lv21, lv24, lv218, lv216, lv223, lv25, lv217, lv28, lv225, lv219, 
        lv29, lv211, lv213, lv22, lv23, lv214, lv220, lv224, lv27, lv210, 
        lv26, lv221, lv222, lv212, lv215, lv226, lv227, lv228, lv235, lv231, 
        lv230, lv232, lv237, lv234, lv236, lv238, lv242, lv243, lv239, lv240, 
        lv241, lv244, lv247, lv245, lv249, lv248, lv246, lv233, lv229, new lv2("GROUP_LIST", 49, 49, 2, wv21), 
        new lv2("MAP", 50, 50, 4, wv2.b) };
    lv2[] arrayOfLv2 = values();
    int i = arrayOfLv2.length;
    f = new lv2[i];
    for (byte b = 0; b < i; b++) {
      lv22 = arrayOfLv2[b];
      int j = lv22.b;
      f[j] = lv22;
    } 
  }
  
  lv2(int paramInt1, int paramInt2, wv2 paramwv2) {
    this.b = paramInt1;
    this$enum$index = paramInt2 - 1;
    if (this$enum$index != 1) {
      if (this$enum$index == 3)
        paramwv2.getClass(); 
    } else {
      paramwv2.getClass();
    } 
    if (paramInt2 == 1) {
      wv2 wv21 = wv2.b;
      paramwv2.ordinal();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */