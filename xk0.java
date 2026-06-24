import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public final class xk0 extends bl0 {
  public gh1 k;
  
  public String l;
  
  public byte[] m;
  
  public byte[] n;
  
  public byte[] o;
  
  public byte[] p;
  
  public b4 q;
  
  public final void e(String[] paramArrayOfString) {
    gh1 gh11 = this.k;
    if (paramArrayOfString.length == 5) {
      f(paramArrayOfString[0]);
      String str2 = paramArrayOfString[1];
      zb zb2 = (zb)gh11.c;
      zb zb1 = (zb)gh11.c;
      this.n = zb2.b(str2);
      this.o = zb1.b(paramArrayOfString[2]);
      String str1 = paramArrayOfString[3];
      if (str1 != null && str1.length() != 0) {
        this.p = zb1.b(str1);
        String str = paramArrayOfString[4];
        if (str != null && str.length() != 0) {
          this.c = zb1.b(str);
          return;
        } 
        throw new Exception("");
      } 
      throw new Exception("");
    } 
    throw new Exception("");
  }
  
  public final qr g() {
    String str = this.b.y("enc");
    if (str != null) {
      this.q.a(str);
      return (qr)d4.e.c.b(str);
    } 
    throw new Exception("");
  }
  
  public final String h() {
    if (this.m == null) {
      n2 n2 = this.b;
      String str = n2.y("alg");
      if (str != null) {
        this.g.a(str);
        d4 d4 = d4.e;
        il0 il0 = (il0)d4.b.b(str);
        qr qr = g();
        qp0 qp0 = qr.c();
        a();
        String str1 = n2.y("alg");
        if (str1 != null) {
          this.g.a(str1);
          il0 il01 = (il0)d4.b.b(str1);
          Key key = this.d;
          if (this.e)
            il01.a(key, g()); 
          key = il0.h(il01.d(key, n2, this.i), this.n, qp0, this.b, this.i);
          byte[] arrayOfByte3 = this.o;
          byte[] arrayOfByte2 = this.p;
          byte[] arrayOfByte4 = this.c;
          p01 p01 = new p01(5);
          p01.c = arrayOfByte3;
          p01.e = arrayOfByte2;
          p01.f = arrayOfByte4;
          arrayOfByte2 = zo2.p(c(), "US-ASCII");
          byte[] arrayOfByte1 = key.getEncoded();
          int i = qp0.b;
          if (arrayOfByte1.length == i) {
            byte[] arrayOfByte5 = qr.e(p01, arrayOfByte2, arrayOfByte1, this.b, this.i);
            String str2 = n2.y("zip");
            arrayOfByte = arrayOfByte5;
            if (str2 != null) {
              InflaterInputStream inflaterInputStream;
              ux ux = (ux)d4.d.b(str2);
              Inflater inflater = new Inflater(true);
              ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
              try {
                inflaterInputStream = new InflaterInputStream();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
                this(arrayOfByte5);
                this(byteArrayInputStream, inflater);
                try {
                  arrayOfByte5 = new byte[256];
                  while (true) {
                    i = inflaterInputStream.read(arrayOfByte5);
                    if (i != -1) {
                      byteArrayOutputStream.write(arrayOfByte5, 0, i);
                      continue;
                    } 
                    byte[] arrayOfByte6 = byteArrayOutputStream.toByteArray();
                    inflaterInputStream.close();
                    inflater.end();
                    break;
                  } 
                } finally {}
              } catch (IOException iOException) {
              
              } finally {}
              try {
                inflaterInputStream.close();
              } finally {
                arrayOfByte5 = null;
              } 
            } 
          } else {
            m60.f();
            return null;
          } 
        } else {
          throw new Exception("");
        } 
      } else {
        throw new Exception("");
      } 
    } else {
      arrayOfByte = this.m;
      return zo2.G(this.l, arrayOfByte);
    } 
    this.m = arrayOfByte;
    byte[] arrayOfByte = this.m;
    return zo2.G(this.l, arrayOfByte);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */