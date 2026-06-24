import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class vp {
  public static final vp e;
  
  public static final vp f;
  
  public final boolean a;
  
  public final boolean b;
  
  public final String[] c;
  
  public final String[] d;
  
  static {
    gl gl8 = gl.j;
    gl gl9 = gl.l;
    gl gl11 = gl.k;
    gl gl7 = gl.m;
    gl gl2 = gl.o;
    gl gl3 = gl.n;
    gl gl10 = gl.h;
    gl gl4 = gl.i;
    gl gl1 = gl.f;
    gl gl6 = gl.g;
    gl gl13 = gl.d;
    gl gl12 = gl.e;
    gl gl5 = gl.c;
    up up = new up(true);
    up.a(new gl[] { gl8, gl9, gl11, gl7, gl2, gl3 });
    av1 av11 = av1.e;
    up.b(new av1[] { av11 });
    up.b = true;
    up = new up(true);
    up.a(new gl[] { 
          gl8, gl9, gl11, gl7, gl2, gl3, gl10, gl4, gl1, gl6, 
          gl13, gl12, gl5 });
    av1 av13 = av1.f;
    av1 av12 = av1.g;
    up.b(new av1[] { av11, av13, av12 });
    up.b = true;
    vp vp1 = new vp(up);
    e = vp1;
    av1[] arrayOfAv1 = new av1[1];
    arrayOfAv1[0] = av12;
    boolean bool = vp1.a;
    if (bool) {
      int i = arrayOfAv1.length;
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < arrayOfAv1.length; b++)
        arrayOfString[b] = (arrayOfAv1[b]).b; 
      if (bool) {
        if (i != 0) {
          if (bool) {
            f = new vp(new up(false));
            return;
          } 
          tp.f("no TLS extensions for cleartext connections");
          return;
        } 
        l0.l("At least one TLS version is required");
        return;
      } 
      tp.f("no TLS versions for cleartext connections");
      return;
    } 
    tp.f("no TLS versions for cleartext connections");
  }
  
  public vp(up paramup) {
    this.a = paramup.a;
    this.c = (String[])paramup.c;
    this.d = (String[])paramup.d;
    this.b = paramup.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof vp))
      return false; 
    if (paramObject != this) {
      paramObject = paramObject;
      boolean bool1 = ((vp)paramObject).a;
      boolean bool2 = this.a;
      if (bool2 != bool1 || (bool2 && (!Arrays.equals((Object[])this.c, (Object[])((vp)paramObject).c) || !Arrays.equals((Object[])this.d, (Object[])((vp)paramObject).d) || this.b != ((vp)paramObject).b)))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    return this.a ? (((527 + Arrays.hashCode((Object[])this.c)) * 31 + Arrays.hashCode((Object[])this.d)) * 31 + (this.b ^ true)) : 17;
  }
  
  public final String toString() {
    String str2;
    if (!this.a)
      return "ConnectionSpec()"; 
    String str1 = "[all enabled]";
    String[] arrayOfString1 = this.c;
    if (arrayOfString1 != null) {
      ArrayList<gl> arrayList = new ArrayList(arrayOfString1.length);
      int i = arrayOfString1.length;
      for (byte b = 0; b < i; b++)
        arrayList.add(gl.a(arrayOfString1[b])); 
      str2 = Collections.<gl>unmodifiableList(arrayList).toString();
    } else {
      str2 = "[all enabled]";
    } 
    String[] arrayOfString2 = this.d;
    if (arrayOfString2 != null) {
      ArrayList<av1> arrayList = new ArrayList(arrayOfString2.length);
      int i = arrayOfString2.length;
      for (byte b = 0; b < i; b++) {
        av1 av1;
        str1 = arrayOfString2[b];
        str1.getClass();
        int j = str1.hashCode();
        byte b1 = -1;
        switch (j) {
          case 79923350:
            if (!str1.equals("TLSv1"))
              break; 
            b1 = 4;
            break;
          case 79201641:
            if (!str1.equals("SSLv3"))
              break; 
            b1 = 3;
            break;
          case -503070501:
            if (!str1.equals("TLSv1.3"))
              break; 
            b1 = 2;
            break;
          case -503070502:
            if (!str1.equals("TLSv1.2"))
              break; 
            b1 = 1;
            break;
          case -503070503:
            if (!str1.equals("TLSv1.1"))
              break; 
            b1 = 0;
            break;
        } 
        switch (b1) {
          default:
            l0.l("Unexpected TLS version: ".concat(str1));
            return null;
          case 4:
            av1 = av1.g;
            break;
          case 3:
            av1 = av1.h;
            break;
          case 2:
            av1 = av1.c;
            break;
          case 1:
            av1 = av1.e;
            break;
          case 0:
            av1 = av1.f;
            break;
        } 
        arrayList.add(av1);
      } 
      str1 = Collections.<av1>unmodifiableList(arrayList).toString();
    } 
    StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
    stringBuilder.append(str2);
    stringBuilder.append(", tlsVersions=");
    stringBuilder.append(str1);
    stringBuilder.append(", supportsTlsExtensions=");
    stringBuilder.append(this.b);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */