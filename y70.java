import java.util.HashMap;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public abstract class y70 {
  public static final Integer[] a;
  
  public static final HashMap b;
  
  public static final HashMap c;
  
  static {
    Integer integer1 = Integer.valueOf(73);
    Integer[] arrayOfInteger = new Integer[3];
    arrayOfInteger[0] = integer1;
    arrayOfInteger[1] = Integer.valueOf(68);
    arrayOfInteger[2] = Integer.valueOf(51);
    a = arrayOfInteger;
    Integer integer6 = Integer.valueOf(255);
    Integer integer5 = Integer.valueOf(0);
    Integer integer2 = Integer.valueOf(102);
    Integer integer4 = Integer.valueOf(103);
    Integer integer3 = Integer.valueOf(70);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    b = hashMap2;
    hashMap2.put("MP3IDv2", arrayOfInteger);
    hashMap2.put("MP3IDv1_1", new Integer[] { integer6, Integer.valueOf(243) });
    hashMap2.put("MP3IDv1_2", new Integer[] { integer6, Integer.valueOf(250) });
    hashMap2.put("MP3IDv1_3", new Integer[] { integer6, Integer.valueOf(242) });
    hashMap2.put("MP3IDv1_4", new Integer[] { integer6, Integer.valueOf(251) });
    hashMap2.put("MP4", new Integer[] { integer5, integer5, integer5, null, integer2, Integer.valueOf(116), Integer.valueOf(121), Integer.valueOf(112) });
    hashMap2.put("FLAC", new Integer[] { integer2, Integer.valueOf(76), Integer.valueOf(97), Integer.valueOf(67) });
    String str = zLtYiJUm.bHuNoEsv;
    hashMap2.put(str, new Integer[] { Integer.valueOf(79), integer4, integer4, Integer.valueOf(83) });
    hashMap2.put("RIFF", new Integer[] { Integer.valueOf(82), integer1, integer3, integer3 });
    hashMap2.put("WAVE", new Integer[] { Integer.valueOf(87), Integer.valueOf(65), Integer.valueOf(86), Integer.valueOf(69) });
    hashMap2.put("ASF", new Integer[] { Integer.valueOf(48), Integer.valueOf(38), Integer.valueOf(178), Integer.valueOf(117), Integer.valueOf(142), integer2, Integer.valueOf(207), Integer.valueOf(17) });
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    c = hashMap1;
    hashMap1.put("MP3IDv2", "mp3");
    hashMap1.put("MP3IDv1_1", "mp3");
    hashMap1.put("MP3IDv1_2", "mp3");
    hashMap1.put("MP3IDv1_3", "mp3");
    hashMap1.put("MP3IDv1_4", "mp3");
    hashMap1.put("MP4", "m4a");
    hashMap1.put("FLAC", "flac");
    hashMap1.put(str, "ogg");
    hashMap1.put("OPUS", "opus");
    hashMap1.put("RIFF", "wav");
    hashMap1.put("WAVE", "wav");
    hashMap1.put("ASF", "asf");
    hashMap1.put(JkpGFvCVQHzgc.rCvNDiQ, "");
  }
  
  public static boolean a(Integer[] paramArrayOfInteger, byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt >= paramArrayOfInteger.length) {
      paramInt = 0;
      while (paramInt < paramArrayOfInteger.length) {
        Integer integer = paramArrayOfInteger[paramInt];
        if (integer == null || integer.intValue() == (paramArrayOfbyte[paramInt] & 0xFF)) {
          paramInt++;
          continue;
        } 
        return false;
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */