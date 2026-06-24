public enum i51 {
  f, g, h;
  
  public static final i51[] i;
  
  public final String b;
  
  public final String c;
  
  public final String e;
  
  static {
    i51 i511 = new i51("M4A_128", 0, "m4a / 128 kbps", "audio/mpeg", "m4a");
    f = i511;
    i51 i513 = new i51("M4A_320", 1, "m4a / 320 kbps", "audio/mpeg", "m4a");
    g = i513;
    i51 i512 = new i51("FLAC", 2, "flac / lossless", "audio/flac", "flac");
    h = i512;
    i = new i51[] { i511, i513, i512 };
  }
  
  i51(String paramString1, String paramString2, String paramString3) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramString3;
  }
  
  public final String a() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */