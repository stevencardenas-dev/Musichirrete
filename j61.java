import android.os.AsyncTask;
import com.pairip.VMRunner;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class j61 extends AsyncTask {
  public static final ExecutorService d = Executors.newSingleThreadExecutor();
  
  public final ArrayList a;
  
  public i61 b;
  
  public boolean c;
  
  public j61(i61 parami61) {
    ArrayList<i61> arrayList = new ArrayList();
    this.a = arrayList;
    arrayList.add(parami61);
  }
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    return VMRunner.invoke("aOQtPyxrZhTs4a0k", new Object[] { this, paramArrayOfObject });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */