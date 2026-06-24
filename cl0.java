import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class cl0 implements Flushable, Closeable {
  public static final Pattern n = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
  
  public static final String[] o = new String[128];
  
  public static final String[] p;
  
  public final Writer b;
  
  public int[] c;
  
  public int e;
  
  public na0 f;
  
  public String g;
  
  public String h;
  
  public boolean i;
  
  public int j;
  
  public boolean k;
  
  public String l;
  
  public boolean m;
  
  static {
    for (byte b = 0; b <= 31; b++) {
      o[b] = String.format("\\u%04x", new Object[] { Integer.valueOf(b) });
    } 
    String[] arrayOfString = o;
    arrayOfString[34] = "\\\"";
    arrayOfString[92] = "\\\\";
    arrayOfString[9] = "\\t";
    arrayOfString[8] = "\\b";
    arrayOfString[10] = "\\n";
    arrayOfString[13] = "\\r";
    arrayOfString[12] = "\\f";
    arrayOfString = (String[])arrayOfString.clone();
    p = arrayOfString;
    arrayOfString[60] = "\\u003c";
    arrayOfString[62] = "\\u003e";
    arrayOfString[38] = "\\u0026";
    arrayOfString[61] = "\\u003d";
    arrayOfString[39] = "\\u0027";
  }
  
  public cl0(Writer paramWriter) {
    int[] arrayOfInt = new int[32];
    this.c = arrayOfInt;
    this.e = 0;
    if (arrayOfInt.length == 0)
      this.c = Arrays.copyOf(arrayOfInt, 0); 
    arrayOfInt = this.c;
    int i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = 6;
    this.j = 2;
    this.m = true;
    Objects.requireNonNull(paramWriter, "out == null");
    this.b = paramWriter;
    q(na0.d);
  }
  
  public final void a() {
    int i = p();
    if (i != 1) {
      Writer writer = this.b;
      if (i != 2) {
        if (i != 4) {
          if (i != 6)
            if (i == 7) {
              if (this.j != 1) {
                tp.f("JSON must have only one top-level value.");
                return;
              } 
            } else {
              tp.f("Nesting problem.");
              return;
            }  
          this.c[this.e - 1] = 7;
          return;
        } 
        writer.append(this.g);
        this.c[this.e - 1] = 5;
        return;
      } 
      writer.append(this.h);
      m();
      return;
    } 
    this.c[this.e - 1] = 2;
    m();
  }
  
  public void c() {
    y();
    a();
    int i = this.e;
    int[] arrayOfInt = this.c;
    if (i == arrayOfInt.length)
      this.c = Arrays.copyOf(arrayOfInt, i * 2); 
    arrayOfInt = this.c;
    i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = 1;
    this.b.write(91);
  }
  
  public void close() {
    this.b.close();
    int i = this.e;
    if (i <= 1 && (i != 1 || this.c[i - 1] == 7)) {
      this.e = 0;
      return;
    } 
    m60.i("Incomplete document");
  }
  
  public void d() {
    y();
    a();
    int i = this.e;
    int[] arrayOfInt = this.c;
    if (i == arrayOfInt.length)
      this.c = Arrays.copyOf(arrayOfInt, i * 2); 
    arrayOfInt = this.c;
    i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = 3;
    this.b.write(123);
  }
  
  public void flush() {
    if (this.e != 0) {
      this.b.flush();
      return;
    } 
    tp.f("JsonWriter is closed.");
  }
  
  public final void g(int paramInt1, int paramInt2, char paramChar) {
    int i = p();
    if (i == paramInt2 || i == paramInt1) {
      if (this.l == null) {
        this.e--;
        if (i == paramInt2)
          m(); 
        this.b.write(paramChar);
        return;
      } 
      m60.p(oXrNDUqUkE.yKNuR, this.l);
      return;
    } 
    tp.f("Nesting problem.");
  }
  
  public void h() {
    g(1, 2, ']');
  }
  
  public void k() {
    g(3, 5, '}');
  }
  
  public void l(String paramString) {
    Objects.requireNonNull(paramString, "name == null");
    if (this.l == null) {
      int i = p();
      if (i == 3 || i == 5) {
        this.l = paramString;
        return;
      } 
      tp.f("Please begin an object before writing a name.");
      return;
    } 
    tp.f(oXrNDUqUkE.kPPxfzACgkc);
  }
  
  public final void m() {
    if (!this.i) {
      String str = this.f.a;
      Writer writer = this.b;
      writer.write(str);
      int i = this.e;
      for (byte b = 1; b < i; b++)
        writer.write(this.f.b); 
    } 
  }
  
  public cl0 o() {
    if (this.l != null)
      if (this.m) {
        y();
      } else {
        this.l = null;
        return this;
      }  
    a();
    this.b.write("null");
    return this;
  }
  
  public final int p() {
    int i = this.e;
    if (i != 0)
      return this.c[i - 1]; 
    tp.f("JsonWriter is closed.");
    return 0;
  }
  
  public final void q(na0 paramna0) {
    boolean bool;
    Objects.requireNonNull(paramna0);
    this.f = paramna0;
    this.h = ",";
    if (paramna0.c) {
      this.g = ": ";
      if (paramna0.a.isEmpty())
        this.h = ", "; 
    } else {
      this.g = ":";
    } 
    if (this.f.a.isEmpty() && this.f.b.isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.i = bool;
  }
  
  public final void r(int paramInt) {
    if (paramInt != 0) {
      this.j = paramInt;
      return;
    } 
    throw null;
  }
  
  public final void s(String paramString) {
    Object object;
    String[] arrayOfString;
    if (this.k) {
      arrayOfString = p;
    } else {
      arrayOfString = o;
    } 
    Writer writer = this.b;
    writer.write(34);
    int i = paramString.length();
    byte b = 0;
    boolean bool = false;
    while (b < i) {
      String str;
      char c = paramString.charAt(b);
      if (c < '') {
        String str1 = arrayOfString[c];
        str = str1;
        if (str1 == null) {
          Object object1 = object;
          continue;
        } 
      } else if (c == ' ') {
        str = nBRIsU.QhrcccqdJQfASY;
      } else {
        Object object1 = object;
        if (c == ' ') {
          str = "\\u2029";
        } else {
          continue;
        } 
      } 
      if (object < b)
        writer.write(paramString, object, b - object); 
      writer.write(str);
      int j = b + 1;
      continue;
      b++;
      object = SYNTHETIC_LOCAL_VARIABLE_4;
    } 
    if (object < i)
      writer.write(paramString, object, i - object); 
    writer.write(34);
  }
  
  public void u(long paramLong) {
    y();
    a();
    this.b.write(Long.toString(paramLong));
  }
  
  public void v(Number paramNumber) {
    if (paramNumber == null) {
      o();
      return;
    } 
    y();
    String str = paramNumber.toString();
    Class<?> clazz = paramNumber.getClass();
    if (clazz != Integer.class && clazz != Long.class && clazz != Byte.class && clazz != Short.class && clazz != BigDecimal.class && clazz != BigInteger.class && clazz != AtomicInteger.class && clazz != AtomicLong.class)
      if (str.equals(eRUgfgGAccgka.qocOWGfzTdYN) || str.equals("Infinity") || str.equals("NaN")) {
        if (this.j != 1) {
          l0.l("Numeric values must be finite, but was ".concat(str));
          return;
        } 
      } else if (clazz != Float.class && clazz != Double.class && !n.matcher(str).matches()) {
        tp.h("String created by ", clazz, OETETTfAjV.RqVIoyaOXGZP, str);
        return;
      }  
    a();
    this.b.append(str);
  }
  
  public void w(String paramString) {
    if (paramString == null) {
      o();
      return;
    } 
    y();
    a();
    s(paramString);
  }
  
  public void x(boolean paramBoolean) {
    String str;
    y();
    a();
    if (paramBoolean) {
      str = "true";
    } else {
      str = "false";
    } 
    this.b.write(str);
  }
  
  public final void y() {
    if (this.l != null) {
      int i = p();
      if (i == 5) {
        this.b.write(this.h);
      } else {
        if (i == 3) {
          m();
          this.c[this.e - 1] = 4;
          s(this.l);
          this.l = null;
          return;
        } 
        tp.f("Nesting problem.");
        return;
      } 
    } else {
      return;
    } 
    m();
    this.c[this.e - 1] = 4;
    s(this.l);
    this.l = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */