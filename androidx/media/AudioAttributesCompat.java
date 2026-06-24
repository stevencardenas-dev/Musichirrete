package androidx.media;

import android.util.SparseIntArray;
import c22;

public class AudioAttributesCompat implements c22 {
  public static final int b = 0;
  
  public AudioAttributesImpl a;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    sparseIntArray.put(5, 1);
    sparseIntArray.put(6, 2);
    sparseIntArray.put(7, 2);
    sparseIntArray.put(8, 1);
    sparseIntArray.put(9, 1);
    sparseIntArray.put(10, 1);
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof AudioAttributesCompat))
      return false; 
    AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat)paramObject;
    paramObject = this.a;
    AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
    return (paramObject == null) ? ((audioAttributesImpl == null)) : paramObject.equals(audioAttributesImpl);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    return this.a.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\media\AudioAttributesCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */