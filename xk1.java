import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public abstract class xk1 {
  public static final my a = new my();
  
  public static final fb0 b = (fb0)new Object();
  
  public static rk0 a(ArrayList paramArrayList) {
    ik0 ik01;
    ik0 ik02;
    ik0 ik03;
    ik0 ik04;
    ik0 ik05;
    rk0 rk0 = new rk0();
    qn0 qn0 = rk0.b;
    try {
      ik03 = new ik0();
      this(paramArrayList.size());
      ik01 = new ik0();
      this(paramArrayList.size());
      ik04 = new ik0();
      this(paramArrayList.size());
      ik05 = new ik0();
      this(paramArrayList.size());
      ik02 = new ik0();
      this(paramArrayList.size());
      for (byte b = 0; b < paramArrayList.size(); b++) {
        qn1 qn1 = ((km0)paramArrayList.get(b)).c;
        ik03.l(ag0.Q0(qn1.f));
        ik01.l(qn1.b);
        ik04.l(qn1.c);
        ik05.l(qn1.e);
        ik02.k(Integer.valueOf(qn1.g));
      } 
    } finally {}
    qn0.put("S_P", ik03);
    qn0.put("S_T", ik01);
    qn0.put("S_AL", ik04);
    qn0.put("S_AR", ik05);
    qn0.put(PwbbJfsdcHrAjW.PTRQtPKATQI, ik02);
    return rk0;
  }
  
  public static ArrayList b(rk0 paramrk0, q01 paramq01) {
    km0 km01;
    ArrayList arrayList;
    km0 km03 = null;
    try {
      ik0 ik04 = paramrk0.m("S_P").f();
      ArrayList arrayList2 = ik04.b;
      ik0 ik01 = paramrk0.m("S_T").f();
      ik0 ik03 = paramrk0.m("S_AL").f();
      ik0 ik02 = paramrk0.m("S_AR").f();
      ik0 ik05 = paramrk0.m("S_D").f();
      ArrayList<km0> arrayList1 = new ArrayList();
      this(arrayList2.size());
      byte b = 0;
      while (true)
        ArrayList<km0> arrayList3 = arrayList1; 
    } finally {
      paramq01 = null;
      km01 = km03;
    } 
    km0 km02 = km01;
    if (km01 == null)
      arrayList = new ArrayList(); 
    return arrayList;
  }
  
  public static nk0 c(File paramFile) {
    try {
      FileReader fileReader = new FileReader();
      this(paramFile);
      b.getClass();
      return fb0.n(fileReader);
    } finally {
      paramFile = null;
    } 
  }
  
  public static void d(rk0 paramrk0, File paramFile) {
    try {
      return;
    } finally {
      paramrk0 = null;
      paramrk0.printStackTrace();
    } 
  }
  
  public static void e(ArrayList paramArrayList, File paramFile) {
    try {
      return;
    } finally {
      paramArrayList = null;
      paramArrayList.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */