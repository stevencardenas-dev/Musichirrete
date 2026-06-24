import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class sq0 extends zo2 {
  public static final Pattern w = Pattern.compile("^[#][E|e][X|x][T|t][-][X|x][-].*");
  
  public static int x = 0;
  
  public final Pattern s = Pattern.compile("^[#][E|e][X|x][T|t][I|i][N|n][F|f].*");
  
  public final Pattern t = Pattern.compile("^(.*?),");
  
  public final Pattern u = Pattern.compile("(:)(\\d+)(,)");
  
  public boolean v = false;
  
  static {
    Collections.singleton(nw0.a("x-mpegurl"));
  }
  
  public final void J(InputStream paramInputStream, bv0 parambv0) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    paramInputStream = null;
    while (true) {
      String str = bufferedReader.readLine();
      if (str != null) {
        if (!str.equalsIgnoreCase("#EXTM3U") && !w.matcher(str).matches() && !str.trim().equals("")) {
          f81 f81;
          if (this.s.matcher(str).matches()) {
            f81 = new f81();
            f81.b("playlist_metadata", this.t.matcher(str).replaceAll(""));
            try {
              Matcher matcher = this.u.matcher(str);
              if (matcher.find())
                f81.b("duration", matcher.group(2)); 
            } finally {}
            this.v = true;
            continue;
          } 
          if (!this.v)
            f81 = new f81(); 
          f81.b("uri", str.trim());
          int i = x + 1;
          x = i;
          f81.b("track", String.valueOf(i));
          zo2.K(f81, parambv0);
          this.v = false;
        } 
        continue;
      } 
      return;
    } 
  }
  
  static {
    Pattern.compile("^[H|h][T|t][T|t][P|p].*");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */