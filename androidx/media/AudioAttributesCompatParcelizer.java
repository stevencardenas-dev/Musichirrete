package androidx.media;

import a22;
import c22;

public class AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(a22 parama22) {
    c22 c22;
    Object object = new Object();
    AudioAttributesImpl audioAttributesImpl = ((AudioAttributesCompat)object).a;
    if (!parama22.e(1)) {
      c22 = audioAttributesImpl;
    } else {
      c22 = c22.h();
    } 
    ((AudioAttributesCompat)object).a = (AudioAttributesImpl)c22;
    return (AudioAttributesCompat)object;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, a22 parama22) {
    parama22.getClass();
    AudioAttributesImpl audioAttributesImpl = paramAudioAttributesCompat.a;
    parama22.i(1);
    parama22.l(audioAttributesImpl);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */