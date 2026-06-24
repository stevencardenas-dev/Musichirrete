public final class di extends e0 {
  public final ei j;
  
  public di(ei paramei) {
    this.j = paramei;
  }
  
  public final String h() {
    bi bi = this.j.b.get();
    if (bi == null)
      return "Completer object has been garbage collected, future will fail soon"; 
    StringBuilder stringBuilder = new StringBuilder("tag=[");
    stringBuilder.append(bi.a);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */