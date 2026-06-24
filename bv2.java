import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class bv2 extends tr2 {
  public static bv2 j;
  
  public final Handler g = new Handler(Looper.getMainLooper());
  
  public final qp2 h;
  
  public final LinkedHashSet i = new LinkedHashSet();
  
  public bv2(Context paramContext) {
    super(new f1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), paramContext);
    this.h = qp21;
  }
  
  public static bv2 b(Context paramContext) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{bv2}} */
    try {
      if (j == null) {
        bv2 bv22 = new bv2();
        qp2 qp21 = qp2.b;
        this(paramContext);
        j = bv22;
      } 
    } finally {}
    bv2 bv21 = j;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{bv2}} */
    return bv21;
  }
  
  public final void c(tb2 paramtb2) {
    /* monitor enter ThisExpression{ObjectType{bv2}} */
    try {
      LinkedHashSet linkedHashSet = new LinkedHashSet();
      this(this.i);
      Iterator<ol0> iterator = linkedHashSet.iterator();
      while (iterator.hasNext())
        ((ol0)iterator.next()).a(paramtb2); 
    } finally {}
    /* monitor enter ThisExpression{ObjectType{bv2}} */
    try {
      HashSet hashSet = new HashSet();
      this(this.d);
      Iterator<ol0> iterator = hashSet.iterator();
      while (iterator.hasNext())
        ((ol0)iterator.next()).a(paramtb2); 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{bv2}} */
    /* monitor exit ThisExpression{ObjectType{bv2}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */