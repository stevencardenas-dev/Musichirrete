import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public final class f72 {
  public static final String i = qp0.j("WorkContinuationImpl");
  
  public final q72 a;
  
  public final String b;
  
  public final k60 c;
  
  public final List d;
  
  public final ArrayList e;
  
  public final ArrayList f;
  
  public boolean g;
  
  public w41 h;
  
  public f72(q72 paramq72, String paramString, k60 paramk60, List paramList) {
    this.a = paramq72;
    this.b = paramString;
    this.c = paramk60;
    this.d = paramList;
    this.e = new ArrayList(paramList.size());
    this.f = new ArrayList();
    byte b = 0;
    while (b < paramList.size()) {
      if (paramk60 != k60.b || ((t41)paramList.get(b)).b.u == Long.MAX_VALUE) {
        String str = ((t41)paramList.get(b)).a.toString();
        str.getClass();
        this.e.add(str);
        this.f.add(str);
        b++;
        continue;
      } 
      l0.l("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
      throw null;
    } 
  }
  
  public static HashSet b(f72 paramf72) {
    HashSet hashSet = new HashSet();
    paramf72.getClass();
    return hashSet;
  }
  
  public final w41 a() {
    if (!this.g) {
      q72 q721 = this.a;
      hp2 hp2 = q721.b.m;
      StringBuilder stringBuilder = new StringBuilder("EnqueueRunnable_");
      stringBuilder.append(this.c.name());
      this.h = qz1.J(hp2, stringBuilder.toString(), (tk1)q721.d.c, new pp(9, this));
    } else {
      qp0 qp0 = qp0.h();
      StringBuilder stringBuilder = new StringBuilder("Already enqueued work ids (");
      stringBuilder.append(TextUtils.join(", ", this.e));
      stringBuilder.append(PwbbJfsdcHrAjW.cSLSHmOdDcwr);
      String str = stringBuilder.toString();
      qp0.k(i, str);
    } 
    return this.h;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */