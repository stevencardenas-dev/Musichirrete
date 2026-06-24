import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

public abstract class dj1 {
  public static final String a = qp0.j("Schedulers");
  
  public static void a(c82 paramc82, fb0 paramfb0, List paramList) {
    if (paramList.size() > 0) {
      paramfb0.getClass();
      long l = System.currentTimeMillis();
      Iterator iterator = paramList.iterator();
      while (iterator.hasNext())
        paramc82.c(l, ((y72)iterator.next()).a); 
    } 
  }
  
  public static void b(ip paramip, WorkDatabase paramWorkDatabase, List paramList) {
    if (paramList != null && paramList.size() != 0) {
      c82 c82 = paramWorkDatabase.v();
      paramWorkDatabase.b();
      try {
        eh1 eh12 = c82.a;
        eh1 eh11 = c82.a;
        ps ps2 = new ps();
        this(12);
        List list3 = (List)zo2.N(eh12, true, false, ps2);
        a(c82, paramip.d, list3);
        int i = paramip.k;
        z72 z72 = new z72();
        this(i);
        List list2 = (List)zo2.N(eh11, true, false, z72);
        a(c82, paramip.d, list2);
        list2.addAll(list3);
        ps ps1 = new ps();
        this(15);
        List list1 = (List)zo2.N(eh11, true, false, ps1);
        paramWorkDatabase.o();
        paramWorkDatabase.l();
        if (list2.size() > 0) {
          y72[] arrayOfY72 = (y72[])list2.toArray((Object[])new y72[list2.size()]);
          for (aj1 aj1 : paramList) {
            if (aj1.e())
              aj1.c(arrayOfY72); 
          } 
        } 
      } finally {
        paramWorkDatabase.l();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */