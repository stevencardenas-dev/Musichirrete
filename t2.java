import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.util.Arrays;

public final class t2 {
  public static final t2 e = new t2(new long[0]);
  
  public final int a;
  
  public final long[] b;
  
  public final s2[] c;
  
  public final long d;
  
  public t2(long... paramVarArgs) {
    int i = paramVarArgs.length;
    this.a = i;
    this.b = Arrays.copyOf(paramVarArgs, i);
    this.c = new s2[i];
    for (byte b = 0; b < i; b++)
      this.c[b] = new s2(); 
    this.d = -9223372036854775807L;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && t2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((t2)paramObject).a && this.d == ((t2)paramObject).d && Arrays.equals(this.b, ((t2)paramObject).b) && Arrays.equals((Object[])this.c, (Object[])((t2)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int k = this.a;
    int j = (int)this.d;
    int i = Arrays.hashCode(this.b);
    return Arrays.hashCode((Object[])this.c) + (i + (k * 961 + j) * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AdPlaybackState(adResumePositionUs=0, adGroups=[");
    byte b = 0;
    while (true) {
      s2[] arrayOfS2 = this.c;
      if (b < arrayOfS2.length) {
        stringBuilder.append("adGroup(timeUs=");
        stringBuilder.append(this.b[b]);
        stringBuilder.append(", ads=[");
        byte b1 = 0;
        while (true) {
          int i = (arrayOfS2[b]).b.length;
          String str = tlzLOCPTHRhep.ugYJgxivHarhlEW;
          if (b1 < i) {
            stringBuilder.append("ad(state=");
            i = (arrayOfS2[b]).b[b1];
            if (i != 0) {
              if (i != 1) {
                if (i != 2) {
                  if (i != 3) {
                    if (i != 4) {
                      stringBuilder.append('?');
                    } else {
                      stringBuilder.append('!');
                    } 
                  } else {
                    stringBuilder.append('P');
                  } 
                } else {
                  stringBuilder.append('S');
                } 
              } else {
                stringBuilder.append('R');
              } 
            } else {
              stringBuilder.append('_');
            } 
            stringBuilder.append(", durationUs=");
            stringBuilder.append((arrayOfS2[b]).c[b1]);
            stringBuilder.append(')');
            if (b1 < (arrayOfS2[b]).b.length - 1)
              stringBuilder.append(str); 
            b1++;
            continue;
          } 
          stringBuilder.append("])");
          if (b < arrayOfS2.length - 1)
            stringBuilder.append(str); 
          break;
        } 
        b++;
        continue;
      } 
      stringBuilder.append("])");
      return stringBuilder.toString();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */