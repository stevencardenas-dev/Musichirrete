public final class tu1 {
  public static final Object k = new Object();
  
  public Object a = k;
  
  public Object b;
  
  public long c;
  
  public long d;
  
  public boolean e;
  
  public boolean f;
  
  public int g;
  
  public int h;
  
  public long i;
  
  public long j;
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && tu1.class.equals(paramObject.getClass())) {
      paramObject = paramObject;
      if (d12.a(this.a, ((tu1)paramObject).a) && d12.a(this.b, ((tu1)paramObject).b) && this.c == ((tu1)paramObject).c && this.d == ((tu1)paramObject).d && this.e == ((tu1)paramObject).e && this.f == ((tu1)paramObject).f && this.i == ((tu1)paramObject).i && this.j == ((tu1)paramObject).j && this.g == ((tu1)paramObject).g && this.h == ((tu1)paramObject).h)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j = this.a.hashCode();
    Object object = this.b;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    long l = this.c;
    int m = (int)(l ^ l >>> 32L);
    l = this.d;
    int n = (int)(l ^ l >>> 32L);
    boolean bool2 = this.e;
    boolean bool1 = this.f;
    l = this.i;
    int k = (int)(l ^ l >>> 32L);
    l = this.j;
    return ((((((((((j + 217) * 31 + i) * 961 + m) * 31 + n) * 31 + bool2) * 31 + bool1) * 961 + k) * 31 + (int)(l ^ l >>> 32L)) * 31 + this.g) * 31 + this.h) * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */