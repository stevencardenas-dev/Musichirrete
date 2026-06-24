import android.net.Uri;

public final class ha0 {
  public final Uri a;
  
  public final int b;
  
  public final int c;
  
  public final boolean d;
  
  public final String e;
  
  public final int f;
  
  public ha0(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, String paramString, int paramInt3) {
    paramUri.getClass();
    this.a = paramUri;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
    this.e = paramString;
    this.f = paramInt3;
  }
  
  public ha0(String paramString1, String paramString2) {
    this.a = (new Uri.Builder()).scheme("systemfont").authority(paramString1).build();
    this.b = 0;
    this.c = 400;
    this.d = false;
    this.e = paramString2;
    this.f = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ha0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */