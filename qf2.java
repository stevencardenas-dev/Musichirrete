import java.io.File;

public final class qf2 {
  public final File a;
  
  public final String b;
  
  public qf2(File paramFile, String paramString) {
    this.a = paramFile;
    this.b = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof qf2) {
      paramObject = paramObject;
      if (this.a.equals(((qf2)paramObject).a) && this.b.equals(((qf2)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    String str = this.a.toString();
    StringBuilder stringBuilder = new StringBuilder("SplitFileInfo{splitFile=");
    stringBuilder.append(str);
    stringBuilder.append(", splitId=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */