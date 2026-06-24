import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

public final class bh1 {
  public final ll a = ne1.a(WorkDatabase.class);
  
  public final Context b;
  
  public final String c;
  
  public final ArrayList d = new ArrayList();
  
  public final ArrayList e = new ArrayList();
  
  public Executor f;
  
  public Executor g;
  
  public kl1 h;
  
  public boolean i;
  
  public final ch1 j = ch1.b;
  
  public final long k = -1L;
  
  public final c4 l = new c4(3);
  
  public final LinkedHashSet m = new LinkedHashSet();
  
  public final LinkedHashSet n = new LinkedHashSet();
  
  public final ArrayList o = new ArrayList();
  
  public boolean p = true;
  
  public boolean q;
  
  public boolean r;
  
  public final boolean s = true;
  
  public bh1(Context paramContext, String paramString) {
    this.b = paramContext;
    this.c = paramString;
  }
  
  public final void a(qx0... paramVarArgs) {
    int i = paramVarArgs.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      qx0 qx01 = paramVarArgs[b];
      int j = qx01.a;
      LinkedHashSet<Integer> linkedHashSet = this.n;
      linkedHashSet.add(Integer.valueOf(j));
      linkedHashSet.add(Integer.valueOf(qx01.b));
    } 
    paramVarArgs = Arrays.<qx0>copyOf(paramVarArgs, paramVarArgs.length);
    c4 c41 = this.l;
    c41.getClass();
    i = paramVarArgs.length;
    for (b = bool; b < i; b++)
      c41.a(paramVarArgs[b]); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */