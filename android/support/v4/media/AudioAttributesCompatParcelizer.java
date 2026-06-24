package android.support.v4.media;

import a22;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompatParcelizer;

public final class AudioAttributesCompatParcelizer extends AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(a22 parama22) {
    return AudioAttributesCompatParcelizer.read(parama22);
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, a22 parama22) {
    AudioAttributesCompatParcelizer.write(paramAudioAttributesCompat, parama22);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */