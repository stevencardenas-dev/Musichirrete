import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class ci0 implements di0 {
  public final InputContentInfo b;
  
  public ci0(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2) {
    this.b = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
  }
  
  public ci0(Object paramObject) {
    this.b = (InputContentInfo)paramObject;
  }
  
  public final Object c() {
    return this.b;
  }
  
  public final Uri e() {
    return this.b.getContentUri();
  }
  
  public final void f() {
    this.b.requestPermission();
  }
  
  public final Uri g() {
    return this.b.getLinkUri();
  }
  
  public final ClipDescription getDescription() {
    return this.b.getDescription();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ci0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */