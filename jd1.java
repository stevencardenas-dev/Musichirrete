import android.database.Observable;
import androidx.preference.Preference;

public final class jd1 extends Observable {
  public final boolean a() {
    return this.mObservers.isEmpty() ^ true;
  }
  
  public final void b() {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((kd1)this.mObservers.get(i)).a(); 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((kd1)this.mObservers.get(i)).d(paramInt1, paramInt2); 
  }
  
  public final void d(int paramInt1, int paramInt2, Preference paramPreference) {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((kd1)this.mObservers.get(i)).b(paramInt1, paramInt2, paramPreference); 
  }
  
  public final void e(int paramInt1, int paramInt2) {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((kd1)this.mObservers.get(i)).c(paramInt1, paramInt2); 
  }
  
  public final void f(int paramInt1, int paramInt2) {
    for (int i = this.mObservers.size() - 1; i >= 0; i--)
      ((kd1)this.mObservers.get(i)).e(paramInt1, paramInt2); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */