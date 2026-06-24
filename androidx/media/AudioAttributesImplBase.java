package androidx.media;

import ga1;
import java.util.Arrays;
import r3.IKWi.AyxAR;

public class AudioAttributesImplBase implements AudioAttributesImpl {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof AudioAttributesImplBase))
      return false; 
    paramObject = paramObject;
    if (this.b == ((AudioAttributesImplBase)paramObject).b) {
      int i;
      int j;
      int n = this.c;
      int m = ((AudioAttributesImplBase)paramObject).c;
      int k = ((AudioAttributesImplBase)paramObject).d;
      if (k != -1) {
        i = k;
      } else {
        j = ((AudioAttributesImplBase)paramObject).a;
        i = AudioAttributesCompat.b;
        if ((m & 0x1) == 1) {
          i = 7;
        } else {
          i = 4;
          if ((m & 0x4) == 4) {
            i = 6;
          } else {
            switch (j) {
              default:
                i = 3;
                break;
              case 13:
                i = 1;
                break;
              case 11:
                i = 10;
                break;
              case 6:
                i = 2;
                break;
              case 5:
              case 7:
              case 8:
              case 9:
              case 10:
                i = 5;
                break;
              case 3:
                i = 8;
                break;
              case 2:
                i = 0;
                break;
              case 4:
                break;
            } 
          } 
        } 
      } 
      if (i == 6) {
        j = m | 0x4;
      } else {
        j = m;
        if (i == 7)
          j = m | 0x1; 
      } 
      if (n == (j & 0x111) && this.a == ((AudioAttributesImplBase)paramObject).a && this.d == k)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d) });
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (this.d != -1) {
      stringBuilder.append(" stream=");
      stringBuilder.append(this.d);
      stringBuilder.append(" derived");
    } 
    stringBuilder.append(" usage=");
    int i = this.a;
    int j = AudioAttributesCompat.b;
    switch (i) {
      default:
        str = ga1.i("unknown usage ", i);
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 16:
        str = "USAGE_ASSISTANT";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 14:
        str = "USAGE_GAME";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 13:
        str = "USAGE_ASSISTANCE_SONIFICATION";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 12:
        str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 11:
        str = "USAGE_ASSISTANCE_ACCESSIBILITY";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 10:
        str = "USAGE_NOTIFICATION_EVENT";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 9:
        str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 8:
        str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 7:
        str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 6:
        str = "USAGE_NOTIFICATION_RINGTONE";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 5:
        str = "USAGE_NOTIFICATION";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 4:
        str = "USAGE_ALARM";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 3:
        str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 2:
        str = "USAGE_VOICE_COMMUNICATION";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 1:
        str = "USAGE_MEDIA";
        stringBuilder.append(str);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(AyxAR.LxNrWfLvS);
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
      case 0:
        break;
    } 
    String str = "USAGE_UNKNOWN";
    stringBuilder.append(str);
    stringBuilder.append(" content=");
    stringBuilder.append(this.b);
    stringBuilder.append(AyxAR.LxNrWfLvS);
    stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesImplBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */