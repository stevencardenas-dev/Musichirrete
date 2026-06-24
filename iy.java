import java.util.ArrayList;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public class iy implements cy {
  public m52 a = null;
  
  public boolean b = false;
  
  public boolean c = false;
  
  public final m52 d;
  
  public int e = 1;
  
  public int f;
  
  public int g;
  
  public int h = 1;
  
  public rz i = null;
  
  public boolean j = false;
  
  public final ArrayList k = new ArrayList();
  
  public final ArrayList l = new ArrayList();
  
  public iy(m52 paramm52) {
    this.d = paramm52;
  }
  
  public final void a(cy paramcy) {
    ArrayList<cy> arrayList = this.l;
    int i = arrayList.size();
    boolean bool = false;
    byte b = 0;
    while (b < i) {
      paramcy = arrayList.get(b);
      b++;
      if (!((iy)paramcy).j)
        return; 
    } 
    this.c = true;
    paramcy = this.a;
    if (paramcy != null)
      paramcy.a(this); 
    if (this.b) {
      this.d.a(this);
      return;
    } 
    int j = arrayList.size();
    paramcy = null;
    i = 0;
    b = bool;
    while (i < j) {
      iy iy1 = (iy)arrayList.get(i);
      i++;
      iy1 = iy1;
      if (iy1 instanceof rz)
        continue; 
      b++;
      paramcy = iy1;
    } 
    if (paramcy != null && b == 1 && ((iy)paramcy).j) {
      rz rz1 = this.i;
      if (rz1 != null)
        if (rz1.j) {
          this.f = this.h * rz1.g;
        } else {
          return;
        }  
      d(((iy)paramcy).g + this.f);
    } 
    paramcy = this.a;
    if (paramcy != null)
      paramcy.a(this); 
  }
  
  public final void b(m52 paramm52) {
    this.k.add(paramm52);
    if (this.j)
      paramm52.a(paramm52); 
  }
  
  public final void c() {
    this.l.clear();
    this.k.clear();
    this.j = false;
    this.g = 0;
    this.c = false;
    this.b = false;
  }
  
  public void d(int paramInt) {
    if (!this.j) {
      this.j = true;
      this.g = paramInt;
      ArrayList<Object> arrayList = this.k;
      int i = arrayList.size();
      paramInt = 0;
      while (paramInt < i) {
        cy cy1 = (cy)arrayList.get(paramInt);
        paramInt++;
        cy1 = cy1;
        cy1.a(cy1);
      } 
    } 
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.b.h0);
    stringBuilder.append(":");
    switch (this.e) {
      default:
        str = "null";
        break;
      case 8:
        str = "BASELINE";
        break;
      case 7:
        str = "BOTTOM";
        break;
      case 6:
        str = "TOP";
        break;
      case 5:
        str = "RIGHT";
        break;
      case 4:
        str = "LEFT";
        break;
      case 3:
        str = zLtYiJUm.MiKIwv;
        break;
      case 2:
        str = "HORIZONTAL_DIMENSION";
        break;
      case 1:
        str = "UNKNOWN";
        break;
    } 
    stringBuilder.append(str);
    stringBuilder.append("(");
    if (this.j) {
      Integer integer = Integer.valueOf(this.g);
    } else {
      str = "unresolved";
    } 
    stringBuilder.append(str);
    stringBuilder.append(") <t=");
    stringBuilder.append(this.l.size());
    stringBuilder.append(":d=");
    stringBuilder.append(this.k.size());
    stringBuilder.append(">");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */