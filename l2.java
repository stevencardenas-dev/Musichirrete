import android.os.Parcelable;
import java.util.ArrayList;

public final class l2 extends dd1 {
  public final int p;
  
  public final oo q;
  
  public final String r;
  
  public final z51 s;
  
  public final void S0(Parcelable paramParcelable) {
    int i = this.p;
    z51 z511 = this.s;
    String str = this.r;
    oo oo1 = this.q;
    switch (i) {
      default:
        arrayList = oo1.d;
        object = oo1.b.get(str);
        if (object != null) {
          i = ((Number)object).intValue();
          arrayList.add(str);
          try {
            oo1.b(i, z511, paramParcelable);
          } catch (Exception null) {
            arrayList.remove(str);
            throw exception;
          } 
        } else {
          m60.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", z511, " and input ", exception, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        } 
        return;
      case 0:
        break;
    } 
    Object object = oo1.b;
    ArrayList<String> arrayList = oo1.d;
    object = object.get(str);
    if (object != null) {
      i = ((Number)object).intValue();
      arrayList.add(str);
      try {
        oo1.b(i, z511, exception);
      } catch (Exception exception) {
        arrayList.remove(str);
        throw exception;
      } 
    } else {
      m60.l("Attempting to launch an unregistered ActivityResultLauncher with contract ", z511, " and input ", exception, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    } 
  }
  
  public void T0() {
    this.q.e(this.r);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */