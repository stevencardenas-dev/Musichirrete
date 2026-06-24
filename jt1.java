import android.content.Context;
import android.net.Uri;
import in.krosbits.nativex.FDTS;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jt1 implements AutoCloseable, Closeable {
  public final FDTS b;
  
  public boolean c;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public String h;
  
  public int i;
  
  public long j;
  
  public HashMap k;
  
  public HashMap l;
  
  static {
    Charset.forName("ISO-8859-1");
  }
  
  public jt1(Context paramContext, Uri paramUri, int paramInt) {
    this.b = new FDTS(paramContext, paramUri);
    a(paramInt);
  }
  
  public jt1(Context paramContext, Uri paramUri, int paramInt1, int paramInt2, long paramLong) {
    FDTS fDTS = new FDTS(paramContext, paramUri);
    try {
      fDTS.g = paramInt2;
      fDTS.n = paramLong;
      fDTS.l = true;
    } finally {
      paramUri = null;
    } 
    a(paramInt1);
  }
  
  public final void a(int paramInt) {
    FDTS fDTS = this.b;
    boolean bool = fDTS.d();
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = bool3;
    if (bool) {
      bool2 = bool3;
      if (fDTS.e(paramInt)) {
        this.e = fDTS.oCont;
        this.f = fDTS.oEnc;
        this.g = String.valueOf(fDTS.ocC);
        this.h = String.valueOf(fDTS.osR);
        this.i = fDTS.obPS * 8;
        long l = fDTS.odUs;
        if (l < 0L)
          l = 0L; 
        this.j = l;
        if ("asf".equals(this.e) || "asf_o".equals(this.e))
          this.k = jl0.a; 
        if ((paramInt & 0x2) != 0) {
          String[] arrayOfString2 = new String[10];
          arrayOfString2[0] = "title";
          arrayOfString2[1] = "album";
          arrayOfString2[2] = "artist";
          arrayOfString2[3] = "album_artist";
          arrayOfString2[4] = "composer";
          arrayOfString2[5] = "genre";
          arrayOfString2[6] = "date";
          arrayOfString2[7] = "track";
          arrayOfString2[8] = "disc";
          arrayOfString2[9] = "TEXT";
          for (paramInt = 0; paramInt < 10; paramInt++) {
            String str2 = arrayOfString2[paramInt];
            HashMap hashMap1 = this.k;
            String str1 = str2;
            if (hashMap1 != null) {
              String str = (String)hashMap1.get(str2);
              str1 = str2;
              if (str != null)
                str1 = str; 
            } 
            arrayOfString2[paramInt] = str1;
          } 
          String[] arrayOfString1 = fDTS.k(arrayOfString2);
          HashMap<Object, Object> hashMap = new HashMap<Object, Object>(arrayOfString1.length);
          for (paramInt = bool1; paramInt < arrayOfString1.length; paramInt++)
            hashMap.put(arrayOfString2[paramInt], arrayOfString1[paramInt]); 
          this.l = hashMap;
        } 
        bool2 = true;
      } 
    } 
    this.c = bool2;
    if (!bool2)
      close(); 
  }
  
  public final float[] c() {
    byte b1;
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[1] = -999.0F;
    byte b2 = 0;
    arrayOfFloat[0] = -999.0F;
    try {
      if (this.c) {
        String[] arrayOfString2 = new String[2];
        arrayOfString2[0] = "REPLAYGAIN_TRACK_GAIN";
        arrayOfString2[1] = "REPLAYGAIN_ALBUM_GAIN";
        for (b1 = 0; b1 < 2; b1++) {
          String str2 = arrayOfString2[b1];
          HashMap hashMap = this.k;
          String str1 = str2;
          if (hashMap != null) {
            String str3 = (String)hashMap.get(str2);
            str1 = str2;
            if (str3 != null)
              str1 = str3; 
          } 
          arrayOfString2[b1] = str1;
        } 
        String[] arrayOfString1 = this.b.k(arrayOfString2);
        Pattern pattern = Pattern.compile("([+-]?([0-9]*[.])?[0-9]+)");
        for (b1 = 0; b1 < arrayOfString1.length; b1++) {
          String str2 = arrayOfString1[b1];
          String str1 = str2;
          if (str2 != null) {
            Matcher matcher = pattern.matcher(str2);
            str1 = str2;
            if (matcher.find())
              str1 = matcher.group(); 
          } 
          arrayOfString1[b1] = str1;
        } 
        String str = arrayOfString1[0];
        if (str != null)
          try {
            arrayOfFloat[0] = Float.parseFloat(str);
          } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
          }  
        str = arrayOfString1[1];
        b1 = b2;
        if (str != null)
          try {
            arrayOfFloat[1] = Float.parseFloat(str);
            b1 = b2;
          } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            b1 = b2;
          }  
      } else {
        IllegalStateException illegalStateException = new IllegalStateException();
        this("!trno!");
        throw illegalStateException;
      } 
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void close() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final String d(String paramString) {
    HashMap hashMap1 = this.l;
    if (hashMap1 != null) {
      String str1 = (String)hashMap1.get(paramString);
      if (str1 != null)
        return str1; 
    } 
    HashMap hashMap2 = this.k;
    String str = paramString;
    if (hashMap2 != null) {
      String str1 = (String)hashMap2.get(paramString);
      str = paramString;
      if (str1 != null)
        str = str1; 
    } 
    return this.b.j(str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */