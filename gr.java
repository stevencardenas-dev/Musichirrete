import android.net.Uri;

public final class gr {
  public final Uri a;
  
  public final boolean b;
  
  public gr(boolean paramBoolean, Uri paramUri) {
    this.a = paramUri;
    this.b = paramBoolean;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      Object object;
      if (paramObject != null) {
        object = paramObject.getClass();
      } else {
        object = null;
      } 
      if (!gr.class.equals(object))
        return false; 
      paramObject.getClass();
      paramObject = paramObject;
      if (!this.a.equals(((gr)paramObject).a) || this.b != ((gr)paramObject).b)
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return Boolean.hashCode(this.b) + i * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */