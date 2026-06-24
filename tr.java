import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class tr implements ur, wr {
  public final int a;
  
  public final Object b;
  
  public tr(ClipData paramClipData, int paramInt) {
    this.b = sr.b(paramClipData, paramInt);
  }
  
  public tr(ContentInfo paramContentInfo) {
    paramContentInfo.getClass();
    this.b = paramContentInfo;
  }
  
  public int a() {
    return ((ContentInfo)this.b).getFlags();
  }
  
  public ClipData b() {
    return ((ContentInfo)this.b).getClip();
  }
  
  public xr build() {
    return new xr(new tr(((ContentInfo.Builder)this.b).build()));
  }
  
  public ContentInfo c() {
    return (ContentInfo)this.b;
  }
  
  public void d(Uri paramUri) {
    ((ContentInfo.Builder)this.b).setLinkUri(paramUri);
  }
  
  public int e() {
    return ((ContentInfo)this.b).getSource();
  }
  
  public void f(int paramInt) {
    ((ContentInfo.Builder)this.b).setFlags(paramInt);
  }
  
  public void setExtras(Bundle paramBundle) {
    ((ContentInfo.Builder)this.b).setExtras(paramBundle);
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */