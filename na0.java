import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;

public final class na0 {
  public static final na0 d = new na0("", "", false);
  
  public final String a;
  
  public final String b;
  
  public final boolean c;
  
  static {
    new na0("\n", "  ", true);
  }
  
  public na0(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramString1.matches("[\r\n]*")) {
      if (paramString2.matches(jHxlGgUTadw.UEhZlyhvGKE)) {
        this.a = paramString1;
        this.b = paramString2;
        this.c = paramBoolean;
        return;
      } 
      l0.l("Only combinations of spaces and tabs are allowed in indent.");
      throw null;
    } 
    l0.l("Only combinations of \\n and \\r are allowed in newline.");
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\na0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */