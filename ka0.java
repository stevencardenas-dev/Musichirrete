public final class ka0 implements Comparable {
  public final int b;
  
  public final int c;
  
  public final String e;
  
  public final String f;
  
  public ka0(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramString1;
    this.f = paramString2;
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    paramObject.getClass();
    int i = this.b - ((ka0)paramObject).b;
    return (i == 0) ? (this.c - ((ka0)paramObject).c) : i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ka0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */