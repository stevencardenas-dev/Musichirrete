import android.os.IBinder;
import android.os.IInterface;

public abstract class ej2 extends of2 implements vj2 {
  public static vj2 asInterface(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
    return (iInterface instanceof vj2) ? (vj2)iInterface : new lh2(paramIBinder);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ej2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */