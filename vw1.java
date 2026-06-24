import android.content.Context;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class vw1 {
  public static volatile cu e;
  
  public final am a;
  
  public final am b;
  
  public final zw c;
  
  public final wy d;
  
  public vw1(am paramam1, am paramam2, zw paramzw, wy paramwy, n2 paramn2) {
    this.a = paramam1;
    this.b = paramam2;
    this.c = paramzw;
    this.d = paramwy;
    ((Executor)paramn2.c).execute(new p72(0, paramn2));
  }
  
  public static vw1 a() {
    cu cu1 = e;
    if (cu1 != null)
      return (vw1)cu1.h.get(); 
    tp.f("Not initialized!");
    return null;
  }
  
  public static void b(Context paramContext) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{vw1}} */
    if (e == null) {
      try {
        if (e == null) {
          bu bu = new bu();
          super();
          paramContext.getClass();
          bu.b = paramContext;
          e = bu.a();
        } 
      } finally {}
      /* monitor exit TypeReferenceDotClassExpression{ObjectType{vw1}} */
      return;
    } 
  }
  
  public final p01 c(sh paramsh) {
    Set<j40> set;
    if (paramsh instanceof sh) {
      set = Collections.unmodifiableSet(sh.d);
    } else {
      set = Collections.singleton(new j40("proto"));
    } 
    zv0 zv0 = ib.a();
    paramsh.getClass();
    zv0.c = "cct";
    String str3 = paramsh.a;
    String str2 = paramsh.b;
    String str1 = str2;
    if (str2 == null)
      str1 = hbrAVtEa.LTkSmmrykMgw; 
    StringBuilder stringBuilder = new StringBuilder("1$");
    stringBuilder.append(str3);
    stringBuilder.append("\\");
    stringBuilder.append(str1);
    zv0.e = stringBuilder.toString().getBytes(Charset.forName("UTF-8"));
    return new p01(set, zv0.j(), this, 13);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */