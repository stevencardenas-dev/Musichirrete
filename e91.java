import android.media.audiofx.AudioEffect;
import android.media.audiofx.LoudnessEnhancer;
import java.util.ArrayList;
import java.util.List;

public final class e91 {
  public static int f;
  
  public final ArrayList a = new ArrayList(2);
  
  public int b;
  
  public boolean c;
  
  public boolean d;
  
  public final boolean e;
  
  public e91(int paramInt, List<Integer> paramList) {
    boolean bool1 = false;
    this.b = 0;
    boolean bool2 = true;
    if (paramInt != 1)
      bool2 = false; 
    this.e = bool2;
    a();
    if (bool2)
      for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
        this.a.add(new LoudnessEnhancer(((Integer)paramList.get(paramInt)).intValue()));  
  }
  
  public final void a() {
    if (this.e) {
      byte b = 0;
      while (true) {
        ArrayList<AudioEffect> arrayList = this.a;
        if (b < arrayList.size()) {
          ((AudioEffect)arrayList.get(b)).release();
          b++;
          continue;
        } 
        arrayList.clear();
        break;
      } 
    } 
  }
  
  public final void b(boolean paramBoolean) {
    ArrayList<AudioEffect> arrayList = this.a;
    this.c = paramBoolean;
    byte b = 0;
    if (paramBoolean && this.b != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (this.d != paramBoolean) {
      this.d = paramBoolean;
      if (this.e) {
        try {
          while (b < arrayList.size()) {
            ((AudioEffect)arrayList.get(b)).setEnabled(paramBoolean);
            b++;
          } 
        } finally {
          arrayList = null;
          arrayList.printStackTrace();
        } 
      } else {
        (f01.b()).c.a = paramBoolean;
        f01.b().g();
      } 
    } 
  }
  
  public final void c(float paramFloat) {
    int i = (int)(paramFloat * 100.0F);
    if (i != this.b) {
      this.b = i;
      if (this.e) {
        i = 0;
        while (true) {
          ArrayList<AudioEffect> arrayList = this.a;
          if (i < arrayList.size()) {
            try {
              AudioEffect audioEffect = arrayList.get(i);
              if (audioEffect instanceof LoudnessEnhancer)
                ((LoudnessEnhancer)audioEffect).setTargetGain(this.b); 
            } finally {}
            i++;
            continue;
          } 
          b(this.c);
          return;
        } 
      } 
    } else {
      return;
    } 
    b(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */