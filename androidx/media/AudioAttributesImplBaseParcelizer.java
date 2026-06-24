package androidx.media;

import a22;

public class AudioAttributesImplBaseParcelizer {
  public static AudioAttributesImplBase read(a22 parama22) {
    Object object = new Object();
    ((AudioAttributesImplBase)object).a = 0;
    ((AudioAttributesImplBase)object).b = 0;
    ((AudioAttributesImplBase)object).c = 0;
    ((AudioAttributesImplBase)object).d = -1;
    ((AudioAttributesImplBase)object).a = parama22.f(0, 1);
    ((AudioAttributesImplBase)object).b = parama22.f(((AudioAttributesImplBase)object).b, 2);
    ((AudioAttributesImplBase)object).c = parama22.f(((AudioAttributesImplBase)object).c, 3);
    ((AudioAttributesImplBase)object).d = parama22.f(((AudioAttributesImplBase)object).d, 4);
    return (AudioAttributesImplBase)object;
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, a22 parama22) {
    parama22.getClass();
    parama22.j(paramAudioAttributesImplBase.a, 1);
    parama22.j(paramAudioAttributesImplBase.b, 2);
    parama22.j(paramAudioAttributesImplBase.c, 3);
    parama22.j(paramAudioAttributesImplBase.d, 4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */