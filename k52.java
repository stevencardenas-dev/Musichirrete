import android.window.ldG.XUaAMlaMSa;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import in.krosbits.utils.SgV.zpEN;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

public final class k52 {
  public static int f;
  
  public ArrayList a;
  
  public int b;
  
  public int c;
  
  public ArrayList d;
  
  public int e;
  
  public final void a(ArrayList<k52> paramArrayList) {
    int i = this.a.size();
    if (this.e != -1 && i > 0)
      for (byte b = 0; b < paramArrayList.size(); b++) {
        k52 k521 = paramArrayList.get(b);
        if (this.e == k521.b)
          c(this.c, k521); 
      }  
    if (i == 0)
      paramArrayList.remove(this); 
  }
  
  public final int b(ln0 paramln0, int paramInt) {
    ArrayList<er> arrayList = this.a;
    int i = arrayList.size();
    boolean bool = false;
    if (i == 0)
      return 0; 
    fr fr = (fr)((er)arrayList.get(0)).T;
    paramln0.t();
    fr.b(paramln0, false);
    for (i = 0; i < arrayList.size(); i++)
      ((er)arrayList.get(i)).b(paramln0, false); 
    if (paramInt == 0 && fr.z0 > 0)
      qv.e(fr, paramln0, arrayList, 0); 
    if (paramInt == 1 && fr.A0 > 0)
      qv.e(fr, paramln0, arrayList, 1); 
    try {
      paramln0.p();
    } catch (Exception exception) {
      PrintStream printStream = System.err;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(exception.toString());
      stringBuilder.append("\n");
      stringBuilder.append(Arrays.toString((Object[])exception.getStackTrace()).replace("[", "   at ").replace(",", jLnXOLx.UNLTjigfBJM).replace("]", ""));
      printStream.println(stringBuilder.toString());
    } 
    this.d = new ArrayList();
    for (i = bool; i < arrayList.size(); i++) {
      er er = arrayList.get(i);
      Object object = new Object();
      new WeakReference<er>(er);
      ln0.n(er.I);
      ln0.n(er.J);
      ln0.n(er.K);
      ln0.n(er.L);
      ln0.n(er.M);
      this.d.add(object);
    } 
    if (paramInt == 0) {
      i = ln0.n(fr.I);
      paramInt = ln0.n(fr.K);
      paramln0.t();
    } else {
      i = ln0.n(fr.J);
      paramInt = ln0.n(fr.L);
      paramln0.t();
    } 
    return paramInt - i;
  }
  
  public final void c(int paramInt, k52 paramk52) {
    int i = paramk52.b;
    ArrayList<Object> arrayList = this.a;
    int j = arrayList.size();
    byte b = 0;
    while (b < j) {
      er er = (er)arrayList.get(b);
      b++;
      er = er;
      ArrayList<er> arrayList1 = paramk52.a;
      if (!arrayList1.contains(er))
        arrayList1.add(er); 
      if (paramInt == 0) {
        er.n0 = i;
        continue;
      } 
      er.o0 = i;
    } 
    this.e = i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    int i = this.c;
    if (i == 0) {
      str = "Horizontal";
    } else if (i == 1) {
      str = "Vertical";
    } else if (i == 2) {
      str = "Both";
    } else {
      str = "Unknown";
    } 
    stringBuilder.append(str);
    stringBuilder.append(" [");
    String str = x41.m(stringBuilder, this.b, "] <");
    ArrayList<Object> arrayList = this.a;
    int j = arrayList.size();
    i = 0;
    while (i < j) {
      er er = (er)arrayList.get(i);
      i++;
      er = er;
      StringBuilder stringBuilder1 = ga1.l(str, zpEN.JNqntKViulzZ);
      stringBuilder1.append(er.h0);
      str = stringBuilder1.toString();
    } 
    return str.concat(XUaAMlaMSa.mmUGLeDsS);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */