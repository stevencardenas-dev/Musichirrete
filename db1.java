import androidx.profileinstaller.Vuyf.nBRIsU;

public enum db1 {
  c, e;
  
  public static final db1[] f;
  
  public final String b;
  
  static {
    db1 db11 = new db1("HTTP_1_0", 0, "http/1.0");
    db1 db14 = new db1("HTTP_1_1", 1, "http/1.1");
    c = db14;
    db1 db12 = new db1("SPDY_3", 2, nBRIsU.bvtnQDeqx);
    db1 db13 = new db1("HTTP_2", 3, "h2");
    e = db13;
    f = new db1[] { db11, db14, db12, db13, new db1("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge"), new db1("QUIC", 5, "quic") };
  }
  
  db1(String paramString1) {
    this.b = paramString1;
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\db1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */