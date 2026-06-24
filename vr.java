import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class vr implements ur, wr {
  public final int a;
  
  public ClipData b;
  
  public int c;
  
  public int d;
  
  public Uri e;
  
  public Bundle f;
  
  public vr(vr paramvr) {
    ClipData clipData = paramvr.b;
    clipData.getClass();
    this.b = clipData;
    int i = paramvr.c;
    if (i >= 0) {
      if (i <= 5) {
        this.c = i;
        i = paramvr.d;
        if ((i & 0x1) == i) {
          this.d = i;
          this.e = paramvr.e;
          this.f = paramvr.f;
          return;
        } 
        String str2 = Integer.toHexString(i);
        String str1 = Integer.toHexString(1);
        StringBuilder stringBuilder = new StringBuilder("Requested flags 0x");
        stringBuilder.append(str2);
        stringBuilder.append(", but only 0x");
        stringBuilder.append(str1);
        stringBuilder.append(" are allowed");
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      Locale locale1 = Locale.US;
      l0.l("source is out of range of [0, 5] (too high)");
      throw null;
    } 
    Locale locale = Locale.US;
    l0.l("source is out of range of [0, 5] (too low)");
    throw null;
  }
  
  public int a() {
    return this.d;
  }
  
  public ClipData b() {
    return this.b;
  }
  
  public xr build() {
    return new xr(new vr(this));
  }
  
  public ContentInfo c() {
    return null;
  }
  
  public void d(Uri paramUri) {
    this.e = paramUri;
  }
  
  public int e() {
    return this.c;
  }
  
  public void f(int paramInt) {
    this.d = paramInt;
  }
  
  public void setExtras(Bundle paramBundle) {
    this.f = paramBundle;
  }
  
  public String toString() {
    String str1;
    switch (this.a) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    Uri uri = this.e;
    StringBuilder stringBuilder = new StringBuilder("ContentInfoCompat{clip=");
    stringBuilder.append(this.b.getDescription());
    stringBuilder.append(", source=");
    int i = this.c;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4) {
              if (i != 5) {
                str1 = String.valueOf(i);
              } else {
                str1 = "SOURCE_PROCESS_TEXT";
              } 
            } else {
              str1 = "SOURCE_AUTOFILL";
            } 
          } else {
            str1 = "SOURCE_DRAG_AND_DROP";
          } 
        } else {
          str1 = "SOURCE_INPUT_METHOD";
        } 
      } else {
        str1 = "SOURCE_CLIPBOARD";
      } 
    } else {
      str1 = "SOURCE_APP";
    } 
    stringBuilder.append(str1);
    stringBuilder.append(", flags=");
    i = this.d;
    if ((i & 0x1) != 0) {
      str1 = "FLAG_CONVERT_TO_PLAIN_TEXT";
    } else {
      str1 = String.valueOf(i);
    } 
    stringBuilder.append(str1);
    String str2 = "";
    if (uri == null) {
      str1 = "";
    } else {
      StringBuilder stringBuilder1 = new StringBuilder(", hasLinkUri(");
      stringBuilder1.append(uri.toString().length());
      stringBuilder1.append(")");
      str1 = stringBuilder1.toString();
    } 
    stringBuilder.append(str1);
    if (this.f == null) {
      str1 = str2;
    } else {
      str1 = ", hasExtras";
    } 
    return x41.n(stringBuilder, str1, "}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */