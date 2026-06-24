import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class yp implements th1, wz0 {
  public final th1 b;
  
  public final wz0 c;
  
  public os e;
  
  public Throwable f;
  
  public yp(th1 paramth1) {
    this.b = paramth1;
    this.c = yz0;
  }
  
  public final ai1 O(String paramString) {
    paramString.getClass();
    return this.b.O(paramString);
  }
  
  public final void a(Object paramObject) {
    this.c.a(null);
  }
  
  public final Object c(ds paramds) {
    return this.c.c(paramds);
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final void d(StringBuilder paramStringBuilder) {
    if (this.e != null || this.f != null) {
      paramStringBuilder.append("\t\tStatus: Acquired connection");
      paramStringBuilder.append('\n');
      os os1 = this.e;
      if (os1 != null) {
        StringBuilder stringBuilder = new StringBuilder("\t\tCoroutine: ");
        stringBuilder.append(os1);
        paramStringBuilder.append(stringBuilder.toString());
        paramStringBuilder.append('\n');
      } 
      Throwable throwable = this.f;
      if (throwable != null) {
        List list1;
        paramStringBuilder.append("\t\tAcquired:");
        paramStringBuilder.append('\n');
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        printWriter.flush();
        String str = stringWriter.toString();
        str.getClass();
        List list2 = gq1.M0(str);
        int i = list2.size();
        byte b = 1;
        if (--i <= 0) {
          d40 d40 = d40.b;
        } else if (i == 1) {
          list1 = zo2.E(nm.q0(list2));
        } else {
          list1 = new ArrayList(i);
          if (list2 instanceof java.util.RandomAccess) {
            i = list2.size();
            while (b < i) {
              list1.add(list2.get(b));
              b++;
            } 
          } else {
            ListIterator listIterator = list2.listIterator(1);
            while (listIterator.hasNext())
              list1.add(listIterator.next()); 
          } 
        } 
        for (String str1 : list1) {
          StringBuilder stringBuilder = new StringBuilder("\t\t");
          stringBuilder.append(str1);
          paramStringBuilder.append(stringBuilder.toString());
          paramStringBuilder.append('\n');
        } 
      } 
      return;
    } 
    paramStringBuilder.append("\t\tStatus: Free connection");
    paramStringBuilder.append('\n');
  }
  
  public final String toString() {
    return this.b.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */