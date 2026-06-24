import java.util.List;

public final class kd2 extends sd2 {
  public final transient sd2 g;
  
  public kd2(sd2 paramsd2) {
    super(0);
    this.g = paramsd2;
  }
  
  public final boolean contains(Object paramObject) {
    return this.g.contains(paramObject);
  }
  
  public final sd2 g() {
    return this.g;
  }
  
  public final Object get(int paramInt) {
    sd2 sd21 = this.g;
    wf2.z0(paramInt, sd21.size());
    return sd21.get(sd21.size() - 1 - paramInt);
  }
  
  public final sd2 h(int paramInt1, int paramInt2) {
    sd2 sd21 = this.g;
    wf2.E0(paramInt1, paramInt2, sd21.size());
    return sd21.h(sd21.size() - paramInt2, sd21.size() - paramInt1).g();
  }
  
  public final int indexOf(Object paramObject) {
    sd2 sd21 = this.g;
    int i = sd21.lastIndexOf(paramObject);
    return (i >= 0) ? (sd21.size() - 1 - i) : -1;
  }
  
  public final int lastIndexOf(Object paramObject) {
    sd2 sd21 = this.g;
    int i = sd21.indexOf(paramObject);
    return (i >= 0) ? (sd21.size() - 1 - i) : -1;
  }
  
  public final int size() {
    return this.g.size();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */