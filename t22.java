import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

public abstract class t22 {
  public static String[] a(View paramView) {
    return paramView.getReceiveContentMimeTypes();
  }
  
  public static xr b(View paramView, xr paramxr) {
    ContentInfo contentInfo2 = paramxr.a.c();
    Objects.requireNonNull(contentInfo2);
    ContentInfo contentInfo1 = paramView.performReceiveContent(contentInfo2);
    return (contentInfo1 == null) ? null : ((contentInfo1 == contentInfo2) ? paramxr : new xr(new tr(contentInfo1)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */