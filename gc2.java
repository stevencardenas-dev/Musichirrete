import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class gc2 {
  public static final rp0 v = new rp0("SessionFlowSummary", null);
  
  public static final String w = "22.3.1";
  
  public static long x = System.currentTimeMillis();
  
  public final gj2 a = new gj2(1);
  
  public final List b = Collections.synchronizedList(new ArrayList());
  
  public final List c = Collections.synchronizedList(new ArrayList());
  
  public final List d = Collections.synchronizedList(new ArrayList());
  
  public final Map e = Collections.synchronizedMap(new HashMap<Object, Object>());
  
  public final hn2 f;
  
  public final String g;
  
  public final long h;
  
  public final long i;
  
  public oj j;
  
  public String k;
  
  public String l;
  
  public fy1 m;
  
  public String n;
  
  public String o;
  
  public String p;
  
  public String q;
  
  public String r;
  
  public String s;
  
  public int t = 0;
  
  public int u;
  
  public gc2(hn2 paramhn2, String paramString) {
    this.f = paramhn2;
    this.g = paramString;
    this.h = System.currentTimeMillis();
    long l = x;
    x = 1L + l;
    this.i = l;
  }
  
  public final void a(oj paramoj) {
    ec2 ec2;
    if (paramoj == null) {
      b(2);
      return;
    } 
    n21.j();
    CastDevice castDevice = paramoj.k;
    if (castDevice == null) {
      b(3);
      return;
    } 
    this.j = paramoj;
    String str2 = this.l;
    String str1 = castDevice.n;
    if (str2 == null) {
      this.l = str1;
      this.n = castDevice.g;
      this.t = castDevice.i();
      ec2 = castDevice.f();
      if (ec2 != null) {
        this.o = ec2.f;
        this.p = ec2.g;
        this.q = ec2.h;
        this.r = ec2.i;
        this.s = ec2.j;
      } 
      paramoj.g();
      return;
    } 
    if (!TextUtils.equals(str2, (CharSequence)ec2))
      b(5); 
  }
  
  public final void b(int paramInt) {
    Integer integer = Integer.valueOf(paramInt - 1);
    Map<Integer, ed2> map = this.e;
    ed2 ed2 = (ed2)map.get(integer);
    if (ed2 == null) {
      ed2 = new ed2(new qp0(paramInt));
      ed2.c = this.h;
      map.put(integer, ed2);
      return;
    } 
    ed2.d.incrementAndGet();
    ed2.b = System.currentTimeMillis();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */