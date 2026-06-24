import java.util.Objects;

public final class h00 {
  public final String a;
  
  public final int b;
  
  public final int c;
  
  public h00(String paramString, int paramInt1, int paramInt2) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h00) {
      paramObject = paramObject;
      if (this.a.equals(((h00)paramObject).a) && this.b == ((h00)paramObject).b && this.c == ((h00)paramObject).c)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.b;
    int i = this.c;
    Float float_ = Float.valueOf(1.0F);
    Integer integer = Integer.valueOf(0);
    return Objects.hash(new Object[] { this.a, Integer.valueOf(j), Integer.valueOf(i), float_, integer, integer, integer, float_ });
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DisplayShapeCompat{ spec=");
    stringBuilder.append(Integer.valueOf(this.a.hashCode()));
    stringBuilder.append(" displayWidth=");
    stringBuilder.append(this.b);
    stringBuilder.append(" displayHeight=");
    return x41.m(stringBuilder, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */