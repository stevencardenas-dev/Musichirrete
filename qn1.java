import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.util.Objects;

public final class qn1 implements Serializable, Cloneable {
  public final String b;
  
  public final String c;
  
  public final String e;
  
  public final wo f;
  
  public final int g;
  
  public int h;
  
  public qn1(wo paramwo, String paramString1, String paramString2, String paramString3, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.MTGRYgkdH : Ljava/lang/String;
    //   7: astore #6
    //   9: aload_3
    //   10: ifnull -> 23
    //   13: aload_3
    //   14: astore #7
    //   16: aload_3
    //   17: invokevirtual length : ()I
    //   20: ifne -> 27
    //   23: aload #6
    //   25: astore #7
    //   27: aload #4
    //   29: ifnull -> 43
    //   32: aload #4
    //   34: astore_3
    //   35: aload #4
    //   37: invokevirtual length : ()I
    //   40: ifne -> 46
    //   43: aload #6
    //   45: astore_3
    //   46: aload_0
    //   47: aload_1
    //   48: putfield f : Lwo;
    //   51: aload_0
    //   52: aload #7
    //   54: putfield c : Ljava/lang/String;
    //   57: aload_0
    //   58: aload_3
    //   59: putfield e : Ljava/lang/String;
    //   62: aload_0
    //   63: aload_2
    //   64: putfield b : Ljava/lang/String;
    //   67: aload_0
    //   68: iload #5
    //   70: putfield g : I
    //   73: return
  }
  
  public final Uri a() {
    try {
      String str = this.f.toString();
      if (str.startsWith("content") || str.startsWith("file") || str.startsWith("musicolet"))
        return Uri.parse(str); 
      if (str.startsWith("/")) {
        File file = new File();
        this(str);
        return Uri.fromFile(file);
      } 
    } finally {
      Exception exception;
    } 
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof qn1) {
      paramObject = ((qn1)paramObject).f;
      return Objects.equals(this.f, paramObject);
    } 
    return false;
  }
  
  public final int hashCode() {
    wo wo1 = this.f;
    return (wo1 != null) ? wo1.hashCode() : super.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */