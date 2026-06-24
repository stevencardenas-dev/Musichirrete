import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.regex.Pattern;

public final class m51 extends zo2 {
  public static int u;
  
  public static final Set v = Collections.singleton(nw0.a("x-scpls"));
  
  public boolean s = false;
  
  public final Pattern t = Pattern.compile("[Ff][Ii][Ll][Ee].*");
  
  public final void J(InputStream paramInputStream, bv0 parambv0) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    f81 f81 = new f81();
    this.s = false;
    while (true) {
      String str = bufferedReader.readLine();
      if (str != null) {
        if (str.trim().equals("")) {
          if (this.s)
            g0(f81, parambv0); 
          f81 = new f81();
          this.s = false;
          continue;
        } 
        int i = str.indexOf('=');
        String[] arrayOfString = new String[0];
        if (i != -1) {
          arrayOfString = new String[2];
          arrayOfString[0] = str.substring(0, i);
          arrayOfString[1] = str.substring(i + 1);
        } 
        if (arrayOfString.length == 2) {
          str = arrayOfString[0].trim();
          if (this.t.matcher(str).matches()) {
            f81 f811 = f81;
            if (this.s) {
              g0(f81, parambv0);
              f811 = new f81();
              this.s = false;
            } 
            this.s = true;
            f811.b("uri", arrayOfString[1].trim());
            f81 = f811;
            continue;
          } 
          if (arrayOfString[0].trim().contains("Title")) {
            f81.b("playlist_metadata", arrayOfString[1].trim());
            continue;
          } 
          if (arrayOfString[0].trim().contains("Length"))
            f81.b("duration", arrayOfString[1].trim()); 
        } 
        continue;
      } 
      if (this.s)
        g0(f81, parambv0); 
      return;
    } 
  }
  
  public final void g0(f81 paramf81, bv0 parambv0) {
    int i = u + 1;
    u = i;
    paramf81.b("track", String.valueOf(i));
    zo2.K(paramf81, parambv0);
    this.s = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */