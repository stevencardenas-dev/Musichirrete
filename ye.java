import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class ye extends qq {
  public final q6 f = new q6(1, this);
  
  public final int g;
  
  public ye(Context paramContext, n2 paramn2, int paramInt) {
    super(paramContext, paramn2);
  }
  
  public final Object a() {
    boolean bool1;
    Intent intent3;
    String str;
    Intent intent2;
    Boolean bool6;
    Boolean bool5;
    int i = this.g;
    Context context = this.b;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool2 = true;
    switch (i) {
      default:
        intent3 = context.registerReceiver(null, e());
        bool1 = bool2;
        if (intent3 != null)
          if (intent3.getAction() == null) {
            bool1 = bool2;
          } else {
            str = intent3.getAction();
            if (str != null) {
              i = str.hashCode();
              if (i != -1181163412) {
                if (i != -730838620)
                  bool1 = false; 
                bool1 = bool2;
                if (!str.equals("android.intent.action.DEVICE_STORAGE_OK"))
                  bool1 = false; 
              } else {
                str.equals("android.intent.action.DEVICE_STORAGE_LOW");
                bool1 = false;
              } 
              return Boolean.valueOf(bool1);
            } 
            bool1 = false;
          }  
        return Boolean.valueOf(bool1);
      case 1:
        intent2 = str.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intent2 == null) {
          qp0.h().f(af.a, "getInitialState - null intent received");
          bool6 = Boolean.FALSE;
        } else {
          int j = bool6.getIntExtra("status", -1);
          int k = bool6.getIntExtra("level", -1);
          i = bool6.getIntExtra("scale", -1);
          float f = k / i;
          bool1 = bool3;
          if (j != 1)
            if (f > 0.15F) {
              bool1 = bool3;
            } else {
              bool1 = false;
            }  
          bool6 = Boolean.valueOf(bool1);
        } 
        return bool6;
      case 0:
        break;
    } 
    Intent intent1 = bool6.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (intent1 == null) {
      qp0.h().f(ze.a, "getInitialState - null intent received");
      bool5 = Boolean.FALSE;
    } else {
      i = bool5.getIntExtra("status", -1);
      bool1 = bool4;
      if (i != 2)
        if (i == 5) {
          bool1 = bool4;
        } else {
          bool1 = false;
        }  
      bool5 = Boolean.valueOf(bool1);
    } 
    return bool5;
  }
  
  public final void c() {
    qp0.h().b(fh.a, getClass().getSimpleName().concat(": registering receiver"));
    q6 q61 = this.f;
    IntentFilter intentFilter = e();
    this.b.registerReceiver(q61, intentFilter);
  }
  
  public final void d() {
    qp0.h().b(fh.a, getClass().getSimpleName().concat(": unregistering receiver"));
    this.b.unregisterReceiver(this.f);
  }
  
  public final IntentFilter e() {
    switch (this.g) {
      default:
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
      case 1:
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
      case 0:
        break;
    } 
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.os.action.CHARGING");
    intentFilter.addAction("android.os.action.DISCHARGING");
    return intentFilter;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */