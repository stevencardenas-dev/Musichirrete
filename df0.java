import android.net.Uri;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class df0 extends v00 {
  public final jm0 e;
  
  public df0(jm0 paramjm0) {
    super(null);
    this.b = new d61(paramjm0.b, null);
    this.e = paramjm0;
  }
  
  public final v00 A(String paramString) {
    return null;
  }
  
  public final ArrayList D(q01 paramq01) {
    ArrayList<jm0> arrayList = this.e.c();
    ArrayList<df0> arrayList1 = new ArrayList(arrayList.size());
    for (byte b = 0; b < arrayList.size(); b++)
      arrayList1.add(new df0(arrayList.get(b))); 
    return arrayList1;
  }
  
  public final boolean E() {
    return false;
  }
  
  public final boolean a() {
    return true;
  }
  
  public final boolean b() {
    return false;
  }
  
  public final u00 c(String paramString) {
    return null;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    return null;
  }
  
  public final boolean e() {
    return false;
  }
  
  public final boolean f() {
    return true;
  }
  
  public final String h() {
    return this.e.b();
  }
  
  public final u00 i() {
    jm0 jm02 = MyApplication.j.c.t;
    jm0 jm01 = this.e;
    if (jm01.equals(jm02))
      return null; 
    jm01 = jm01.f;
    return (jm01 != null) ? ("Storage".equals(jm01.b) ? null : new df0(jm01)) : null;
  }
  
  public final Uri j() {
    return (new Uri.Builder()).scheme("musicolet").authority("hfolder").appendQueryParameter("lp", this.b.toString()).build();
  }
  
  public final boolean k() {
    return true;
  }
  
  public final boolean l() {
    return false;
  }
  
  public final long m() {
    return 0L;
  }
  
  public final long n() {
    return 0L;
  }
  
  public final boolean o(String paramString) {
    return false;
  }
  
  public final boolean p() {
    return false;
  }
  
  public final String v() {
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\df0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */