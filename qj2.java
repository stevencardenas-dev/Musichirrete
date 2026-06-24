import android.graphics.Bitmap;
import android.net.Uri;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

public final class qj2 implements vb2, c41 {
  public final Object b;
  
  public Object c;
  
  public qj2(i52 parami52) {
    Uri uri;
    if (parami52 == null) {
      parami52 = null;
    } else {
      uri = parami52.c;
    } 
    this.b = uri;
  }
  
  public qj2(qf paramqf, ArrayList paramArrayList) {
    this.b = paramArrayList;
    this.c = paramqf;
  }
  
  public qj2(uo2 paramuo2, qj2 paramqj2) {
    this.b = paramqj2;
    Objects.requireNonNull(paramuo2);
    this.c = paramuo2;
  }
  
  public void a(Bitmap paramBitmap) {
    qj2 qj21 = (qj2)this.b;
    qj21.c = paramBitmap;
    uo2 uo2 = (uo2)this.c;
    uo2.l = qj21;
    uo2.a();
  }
  
  public String b() {
    StringBuilder stringBuilder = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
    String str = (String)this.b;
    if (str != null) {
      String str1 = str.toUpperCase(Locale.ROOT);
      if (str1.matches("[A-F0-9]+")) {
        stringBuilder.append("/");
        stringBuilder.append(str1);
      } else {
        l0.l("Invalid application ID: ".concat(str));
        return null;
      } 
    } 
    Collection collection = (Collection)this.c;
    boolean bool = false;
    if (collection != null) {
      if (!collection.isEmpty()) {
        if (str == null) {
          bool = false;
        } else {
          bool = true;
        } 
        if (str == null)
          stringBuilder.append("/"); 
        stringBuilder.append("/");
        Iterator<String> iterator = collection.iterator();
        for (byte b = 1; iterator.hasNext(); b = 0) {
          str = iterator.next();
          qj.b(str);
          if (!b)
            stringBuilder.append(OETETTfAjV.GaNppgQeBGEn); 
          if (!qj.a.matcher(str).matches()) {
            StringBuilder stringBuilder1 = new StringBuilder(str.length());
            for (b = 0; b < str.length(); b++) {
              char c = str.charAt(b);
              if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != '_' && c != '-' && c != '.' && c != ':') {
                stringBuilder1.append(String.format("%%%04x", new Object[] { Integer.valueOf(c) }));
              } else {
                stringBuilder1.append(c);
              } 
            } 
            str = stringBuilder1.toString();
          } 
          stringBuilder.append(str);
        } 
      } else {
        l0.l("Must specify at least one namespace");
        return null;
      } 
    } else if (str != null) {
      bool = true;
    } 
    if (true != bool && collection == null)
      stringBuilder.append("/"); 
    if (collection == null)
      stringBuilder.append("/"); 
    stringBuilder.append("//ALLOW_IPV6");
    return stringBuilder.toString();
  }
  
  public void q(du2 paramdu2) {
    md2 md2 = (md2)this.b;
    null = (nt1)this.c;
    synchronized (md2.f) {
      md2.e.remove(null);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */