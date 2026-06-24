public final class d71 extends h0 {
  public StringBuffer b;
  
  public StringBuffer c;
  
  public final void a(String paramString, int paramInt) {
    b(paramString, String.valueOf(paramInt));
  }
  
  public final void b(String paramString1, String paramString2) {
    StringBuffer stringBuffer = this.b;
    stringBuffer.append(this.c);
    stringBuffer.append(paramString1);
    stringBuffer.append(":");
    stringBuffer.append(paramString2);
    stringBuffer.append('\n');
  }
  
  public final void c(String paramString, boolean paramBoolean) {
    b(paramString, String.valueOf(paramBoolean));
  }
  
  public final void d(String paramString) {
    StringBuffer stringBuffer = this.c;
    this.c = new StringBuffer(stringBuffer.substring(0, stringBuffer.length() - 2));
  }
  
  public final void f(String paramString1, String paramString2) {
    b(paramString1, paramString2);
    this.c.append("  ");
  }
  
  public final String toString() {
    return this.b.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */