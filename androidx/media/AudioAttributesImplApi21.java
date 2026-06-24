package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
  public AudioAttributes a;
  
  public int b = -1;
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof AudioAttributesImplApi21))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((AudioAttributesImplApi21)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat: audioattributes=");
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesImplApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */