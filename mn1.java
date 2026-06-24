import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

public final class mn1 implements Handler.Callback {
  public final int b;
  
  public final Object c;
  
  public final boolean handleMessage(Message paramMessage) {
    int i = this.b;
    boolean bool1 = true;
    boolean bool2 = true;
    switch (i) {
      default:
        i = paramMessage.what;
        if (i != 0) {
          if (i != 1) {
            bool1 = false;
          } else {
            bq2 bq2 = (bq2)this.c;
            HashMap hashMap = bq2.a;
            /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
            try {
              dp2 dp2 = (dp2)paramMessage.obj;
              np2 np2 = (np2)bq2.a.get(dp2);
              if (np2 != null && np2.c == 3) {
                String str1 = String.valueOf(dp2);
                i = str1.length();
                StringBuilder stringBuilder = new StringBuilder();
                this(i + 47);
                stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                stringBuilder.append(str1);
                String str2 = stringBuilder.toString();
                Exception exception = new Exception();
                this();
                Log.e("GmsClientSupervisor", str2, exception);
                ComponentName componentName2 = np2.h;
                ComponentName componentName1 = componentName2;
                if (componentName2 == null) {
                  dp2.getClass();
                  componentName1 = null;
                } 
                componentName2 = componentName1;
                if (componentName1 == null) {
                  componentName2 = new ComponentName();
                  String str = dp2.b;
                  n21.m(str);
                  this(str, "unknown");
                } 
                np2.onServiceDisconnected(componentName2);
              } 
            } finally {}
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
            bool1 = bool2;
          } 
        } else {
          bq2 bq2 = (bq2)this.c;
          HashMap hashMap = bq2.a;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
          try {
            dp2 dp2 = (dp2)paramMessage.obj;
            np2 np2 = (np2)bq2.a.get(dp2);
            if (np2 != null && np2.b.isEmpty()) {
              if (np2.e) {
                dp2 dp21 = np2.g;
                bq2 bq21 = np2.i;
                bq21.c.removeMessages(1, dp21);
                bq21.d.a(bq21.b, np2);
                np2.e = false;
                np2.c = 2;
              } 
              bq2.a.remove(dp2);
            } 
          } finally {}
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
          bool1 = bool2;
        } 
        return bool1;
      case 0:
        break;
    } 
    if (paramMessage.what != 0) {
      bool1 = false;
    } else {
      null = (n2)this.c;
      nn1 nn1 = (nn1)paramMessage.obj;
      synchronized (null.c) {
        if ((nn1)null.f == nn1 || (nn1)null.g == nn1)
          null.m(nn1, 2); 
        return bool1;
      } 
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */