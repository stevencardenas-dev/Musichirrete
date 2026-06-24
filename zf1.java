import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class zf1 {
  public int a;
  
  public final Uri b;
  
  public final int c;
  
  public final List d;
  
  public final int e;
  
  public final int f;
  
  public final boolean g;
  
  public final boolean h;
  
  public final boolean i;
  
  public final int j;
  
  public zf1(Uri paramUri, int paramInt1, ArrayList<?> paramArrayList, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4) {
    this.b = paramUri;
    this.c = paramInt1;
    if (paramArrayList == null) {
      this.d = null;
    } else {
      this.d = Collections.unmodifiableList(paramArrayList);
    } 
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
    this.i = paramBoolean3;
    this.j = paramInt4;
  }
  
  public final boolean a() {
    return (this.e != 0 || this.f != 0);
  }
  
  public final boolean b() {
    return !!a();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(JkpGFvCVQHzgc.XODBlxvG);
    int i = this.c;
    if (i > 0) {
      stringBuilder.append(i);
    } else {
      stringBuilder.append(this.b);
    } 
    List list = this.d;
    if (list != null && !list.isEmpty())
      for (cw1 cw1 : list) {
        stringBuilder.append(' ');
        stringBuilder.append(cw1.b());
      }  
    i = this.e;
    if (i > 0) {
      stringBuilder.append(" resize(");
      stringBuilder.append(i);
      stringBuilder.append(',');
      stringBuilder.append(this.f);
      stringBuilder.append(')');
    } 
    if (this.g)
      stringBuilder.append(" centerCrop"); 
    if (this.h)
      stringBuilder.append(" centerInside"); 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */