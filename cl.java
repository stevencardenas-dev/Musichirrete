import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public class cl extends Handler {
  public final int a;
  
  public cl(Looper paramLooper, int paramInt) {
    super(paramLooper);
    Looper.getMainLooper();
  }
  
  public cl(fl paramfl, Looper paramLooper) {
    super(paramLooper);
  }
  
  private final void a(Message paramMessage) {}
  
  public void handleMessage(Message paramMessage) {
    uf uf;
    kh0 kh0;
    int i;
    switch (this.a) {
      default:
        super.handleMessage(paramMessage);
        return;
      case 3:
        sendMessageDelayed(obtainMessage(), 1000L);
        return;
      case 1:
        i = paramMessage.what;
        if (i != 3) {
          StringBuilder stringBuilder;
          int j = 0;
          if (i != 8) {
            if (i == 13) {
              List<kh0> list1 = (List)paramMessage.obj;
              i = list1.size();
              while (j < i) {
                kh0 kh01 = list1.get(j);
                v61 v61 = kh01.a;
                v61.getClass();
                if ((kh01.e & 0x1) == 0) {
                  Bitmap bitmap = v61.g(kh01.f);
                } else {
                  paramMessage = null;
                } 
                if (paramMessage != null) {
                  v61.c((Bitmap)paramMessage, 1, kh01);
                } else {
                  v61.d(kh01);
                } 
                j++;
              } 
              break;
            } 
            j = paramMessage.what;
            stringBuilder = new StringBuilder("Unknown handler message received: ");
            stringBuilder.append(j);
            throw new AssertionError(stringBuilder.toString());
          } 
          List<uf> list = (List)((Message)stringBuilder).obj;
          int k = list.size();
          for (j = 0; j < k; j++) {
            uf = list.get(j);
            v61 v61 = uf.b;
            v61.getClass();
            kh0 kh01 = uf.l;
            ArrayList<kh0> arrayList = uf.m;
            if (arrayList != null && !arrayList.isEmpty()) {
              i = 1;
            } else {
              i = 0;
            } 
            if (kh01 != null || i != 0) {
              Uri uri = uf.h.b;
              Bitmap bitmap = uf.n;
              int m = uf.p;
              if (kh01 != null)
                v61.c(bitmap, m, kh01); 
              if (i != 0) {
                int n = arrayList.size();
                for (i = 0; i < n; i++)
                  v61.c(bitmap, m, arrayList.get(i)); 
              } 
            } 
          } 
          break;
        } 
        kh0 = (kh0)((Message)uf).obj;
        kh0.a.getClass();
        kh0.a.a(kh0.a());
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */