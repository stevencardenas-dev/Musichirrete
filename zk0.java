import androidx.profileinstaller.Vuyf.nBRIsU;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.Map;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class zk0 extends bl0 {
  public byte[] k;
  
  public String l;
  
  public String m;
  
  public Boolean n;
  
  public final boolean d(String paramString) {
    return "b64".equals(paramString);
  }
  
  public final void e(String[] paramArrayOfString) {
    if (paramArrayOfString.length == 3) {
      f(paramArrayOfString[0]);
      Object object = ((Map)this.b.e).get("b64");
      gh1 gh1 = this.a;
      if (object != null && object instanceof Boolean && !((Boolean)object).booleanValue()) {
        this.k = zo2.p(paramArrayOfString[1], this.l);
        this.m = null;
      } else {
        object = paramArrayOfString[1];
        this.m = (String)object;
        this.k = ((zb)gh1.c).b((String)object);
      } 
      String str = paramArrayOfString[2];
      this.c = ((zb)gh1.c).b(str);
      return;
    } 
    throw new Exception("");
  }
  
  public final String g() {
    if (!Boolean.getBoolean("org.jose4j.jws.getPayload-skip-verify")) {
      n2 n2 = this.b;
      String str = n2.y("alg");
      if (str != null) {
        this.g.a(str);
        al0 al0 = (al0)d4.e.a.b(str);
        Key key = this.d;
        if (this.e)
          al0.b(key); 
        if (this.n == null) {
          byte[] arrayOfByte1;
          a();
          byte[] arrayOfByte2 = this.c;
          n2 = (n2)((Map)n2.e).get(JkpGFvCVQHzgc.XePLNIahgujEZSK);
          String str1 = nBRIsU.XSGeX;
          if (n2 != null && n2 instanceof Boolean && !((Boolean)n2).booleanValue()) {
            try {
              ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
              this();
              byteArrayOutputStream.write(zo2.p(c(), str1));
              byteArrayOutputStream.write(46);
              byteArrayOutputStream.write(this.k);
              arrayOfByte1 = byteArrayOutputStream.toByteArray();
            } catch (IOException iOException) {
              throw new Exception("", iOException);
            } 
          } else {
            String str3 = c();
            String str2 = this.m;
            if (str2 == null) {
              byte[] arrayOfByte3 = this.k;
              str2 = ((zb)this.a.c).d(arrayOfByte3);
            } 
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b = 0; b < 2; b++) {
              (new String[2])[0] = str3;
              (new String[2])[1] = str2;
              String str4 = (new String[2])[b];
              str = str4;
              if (str4 == null)
                str = ""; 
              stringBuilder.append(str);
              if (b != 1)
                stringBuilder.append("."); 
            } 
            arrayOfByte1 = zo2.p(stringBuilder.toString(), str1);
          } 
          this.n = Boolean.valueOf(al0.i(arrayOfByte2, key, arrayOfByte1, this.i));
        } 
        if (!this.n.booleanValue())
          throw new Exception(""); 
      } else {
        throw new Exception("");
      } 
    } 
    byte[] arrayOfByte = this.k;
    return zo2.G(this.l, arrayOfByte);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */