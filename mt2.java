import android.text.TextUtils;

public final class mt2 implements cl1 {
  public final cn b;
  
  public void d(al1 paramal1, int paramInt) {
    paramal1 = paramal1;
    d7 d7 = new d7(5);
    d7.c = Integer.valueOf(paramInt);
    si2 si2 = new si2(d7);
    cn cn1 = this.b;
    cn1.E(si2);
    cn1.I();
  }
  
  public void e(al1 paramal1, int paramInt) {
    boolean bool;
    paramal1 = paramal1;
    d7 d7 = new d7(9);
    d7.c = Integer.valueOf(paramInt);
    cn cn1 = this.b;
    if (((hf2)cn1.e).g == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    d7.e = Boolean.valueOf(bool);
    cn1.E(new si2(d7));
    cn1.I();
  }
  
  public void j(al1 paramal1, int paramInt) {
    paramal1 = paramal1;
    d7 d7 = new d7(8);
    d7.c = Integer.valueOf(paramInt);
    si2 si2 = new si2(d7);
    cn cn1 = this.b;
    cn1.E(si2);
    cn1.I();
  }
  
  public void l(al1 paramal1, String paramString) {
    oj oj = (oj)paramal1;
    si2 si2 = new si2(new d7(4));
    cn cn1 = this.b;
    cn1.E(si2);
    gc2 gc22 = (gc2)cn1.f;
    n21.m(gc22);
    gc22.a(oj);
    gc2 gc21 = (gc2)cn1.f;
    n21.m(gc21);
    String str = gc21.k;
    if (str == null) {
      gc21.k = paramString;
      return;
    } 
    if (!TextUtils.equals(paramString, str))
      gc21.b(4); 
  }
  
  public void m(al1 paramal1) {
    boolean bool;
    oj oj = (oj)paramal1;
    d7 d7 = new d7(2);
    cn cn1 = this.b;
    if (((hf2)cn1.e).g == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    d7.e = Boolean.valueOf(bool);
    cn1.E(new si2(d7));
    gc2 gc2 = (gc2)cn1.f;
    n21.m(gc2);
    gc2.a(oj);
    oj.l = (mt2)cn1.g;
  }
  
  public void p(al1 paramal1, String paramString) {
    oj oj = (oj)paramal1;
    si2 si2 = new si2(new d7(7));
    cn cn1 = this.b;
    cn1.E(si2);
    gc2 gc22 = (gc2)cn1.f;
    n21.m(gc22);
    gc22.a(oj);
    gc2 gc21 = (gc2)cn1.f;
    n21.m(gc21);
    String str = gc21.k;
    if (str == null) {
      gc21.k = paramString;
      return;
    } 
    if (!TextUtils.equals(paramString, str))
      gc21.b(4); 
  }
  
  public void r(al1 paramal1, int paramInt) {
    paramal1 = paramal1;
    d7 d7 = new d7(6);
    d7.c = Integer.valueOf(paramInt);
    si2 si2 = new si2(d7);
    cn cn1 = this.b;
    cn1.E(si2);
    gc2 gc2 = (gc2)cn1.f;
    n21.m(gc2);
    gc2.a((oj)paramal1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */