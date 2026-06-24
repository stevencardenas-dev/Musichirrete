import android.net.Uri;
import android.text.TextUtils;
import in.krosbits.musicolet.MyApplication;
import java.util.Objects;

public final class s00 {
  public final ml0 a;
  
  public final Uri b;
  
  public final int c;
  
  public final int d;
  
  public s00(ml0 paramml0, Uri paramUri, int paramInt1, int paramInt2) {
    this.a = paramml0;
    this.b = paramUri;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final String a() {
    boolean bool = lw0.r.equals(this.b);
    String str = this.a.b;
    if (bool)
      return str; 
    str = ml0.f(str);
    return !TextUtils.isEmpty(str) ? ml0.a(str) : MyApplication.i.getApplicationContext().getString(2131887251);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && s00.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.c == ((s00)paramObject).c && this.d == ((s00)paramObject).d && this.a.equals(((s00)paramObject).a) && Objects.equals(this.b, ((s00)paramObject).b))
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */