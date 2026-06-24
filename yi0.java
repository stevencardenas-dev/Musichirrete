import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class yi0 {
  public final WorkDatabase_Impl a;
  
  public final jx1 b;
  
  public final LinkedHashMap c;
  
  public final ReentrantLock d;
  
  public final i2 e;
  
  public final i2 f;
  
  public final Object g;
  
  public yi0(WorkDatabase_Impl paramWorkDatabase_Impl, LinkedHashMap paramLinkedHashMap1, LinkedHashMap paramLinkedHashMap2, String... paramVarArgs) {
    this.a = paramWorkDatabase_Impl;
    jx1 jx11 = new jx1(paramWorkDatabase_Impl, paramLinkedHashMap1, paramLinkedHashMap2, paramVarArgs, ((eh1)paramWorkDatabase_Impl).j, new xi0(1, this, yi0.class, kOkiWEITVb.EPGfSTjgDk, "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 0));
    this.b = jx11;
    this.c = new LinkedHashMap<Object, Object>();
    this.d = new ReentrantLock();
    this.e = new i2(3, this);
    this.f = new i2(4, this);
    Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>()).getClass();
    this.g = new Object();
    jx11.k = new pp(2, this);
  }
  
  public final Object a(pr1 parampr1) {
    WorkDatabase_Impl workDatabase_Impl = this.a;
    if (!workDatabase_Impl.j() || workDatabase_Impl.m()) {
      Object object = this.b.f(parampr1);
      if (object == ys.b)
        return object; 
    } 
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */