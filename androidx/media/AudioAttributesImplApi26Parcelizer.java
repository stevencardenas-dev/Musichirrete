package androidx.media;

import a22;
import android.media.AudioAttributes;
import android.os.Parcelable;

public class AudioAttributesImplApi26Parcelizer {
  public static AudioAttributesImplApi26 read(a22 parama22) {
    AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
    audioAttributesImplApi21.a = (AudioAttributes)parama22.g((Parcelable)audioAttributesImplApi21.a, 1);
    audioAttributesImplApi21.b = parama22.f(audioAttributesImplApi21.b, 2);
    return (AudioAttributesImplApi26)audioAttributesImplApi21;
  }
  
  public static void write(AudioAttributesImplApi26 paramAudioAttributesImplApi26, a22 parama22) {
    parama22.getClass();
    parama22.k((Parcelable)paramAudioAttributesImplApi26.a, 1);
    parama22.j(paramAudioAttributesImplApi26.b, 2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesImplApi26Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */