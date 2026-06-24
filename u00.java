import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

public abstract class u00 {
  public final u00 a;
  
  public u00(u00 paramu00) {
    this.a = paramu00;
  }
  
  public static c91 g(Context paramContext, Uri paramUri) {
    String str = DocumentsContract.getTreeDocumentId(paramUri);
    if (DocumentsContract.isDocumentUri(paramContext, paramUri))
      str = DocumentsContract.getDocumentId(paramUri); 
    if (str != null) {
      Uri uri = DocumentsContract.buildDocumentUriUsingTree(paramUri, str);
      if (uri != null)
        return new c91(null, paramContext, uri); 
      StringBuilder stringBuilder = new StringBuilder("Failed to build documentUri from a tree: ");
      stringBuilder.append(paramUri);
      throw new NullPointerException(stringBuilder.toString());
    } 
    m60.k("Could not get document ID from Uri: ", paramUri);
    return null;
  }
  
  public abstract boolean a();
  
  public abstract boolean b();
  
  public abstract u00 c(String paramString);
  
  public abstract u00 d(String paramString1, String paramString2);
  
  public abstract boolean e();
  
  public abstract boolean f();
  
  public abstract String h();
  
  public u00 i() {
    return this.a;
  }
  
  public abstract Uri j();
  
  public abstract boolean k();
  
  public abstract boolean l();
  
  public abstract long m();
  
  public abstract long n();
  
  public abstract boolean o(String paramString);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */