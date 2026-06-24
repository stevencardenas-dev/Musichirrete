import java.util.List;

public abstract class py {
  public static final String a = qp0.j("DiagnosticsWrkr");
  
  public static final String a(t72 paramt72, e82 parame82, ls1 paramls1, List paramList) {
    StringBuilder stringBuilder = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
    for (y72 y72 : paramList) {
      n72 n72 = qv.p(y72);
      String str1 = y72.a;
      paramls1.getClass();
      String str2 = n72.a;
      int i = n72.b;
      str2.getClass();
      js1 js1 = (js1)zo2.N(paramls1.a, true, false, new ks1(str2, i, 0));
      if (js1 != null) {
        Integer integer = Integer.valueOf(js1.c);
      } else {
        js1 = null;
      } 
      paramt72.getClass();
      str1.getClass();
      str2 = nm.p0((List)zo2.N(paramt72.a, true, false, new ey(str1, 5)), ",", null, null, null, 62);
      parame82.getClass();
      String str3 = nm.p0((List)zo2.N(parame82.a, true, false, new ey(str1, 17)), ",", null, null, null, 62);
      StringBuilder stringBuilder1 = x41.q("\n", str1, "\t ");
      stringBuilder1.append(y72.c);
      stringBuilder1.append("\t ");
      stringBuilder1.append(js1);
      stringBuilder1.append("\t ");
      stringBuilder1.append(y72.b.name());
      stringBuilder1.append("\t ");
      stringBuilder1.append(str2);
      stringBuilder1.append("\t ");
      stringBuilder1.append(str3);
      stringBuilder1.append('\t');
      stringBuilder.append(stringBuilder1.toString());
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */