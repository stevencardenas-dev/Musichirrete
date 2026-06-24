package in.krosbits.musicolet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Iterator;
import n21;

public class BluetoothUsbReceiver extends BroadcastReceiver {
  public static long a;
  
  public static Boolean b;
  
  public static boolean a() {
    SharedPreferences sharedPreferences = MyApplication.o();
    String str = xveccWbRzqx.uuuoqkZrpwTY;
    boolean bool1 = false;
    boolean bool3 = false;
    boolean bool2 = bool1;
    if (sharedPreferences.getBoolean(str, false)) {
      if (MyApplication.o().getBoolean("k_b_puwaplstrct", false) && (MusicService.P0 == null || MusicService.E0 == null || !MusicService.F0)) {
        n21.F("BUR>dis2");
        return true;
      } 
      bool2 = bool1;
      if (a > 0L) {
        bool1 = bool3;
        if (System.currentTimeMillis() - a < 4000L)
          bool1 = true; 
        bool2 = bool1;
        if (bool1) {
          n21.F("BUR>dis");
          bool2 = bool1;
        } 
      } 
    } 
    return bool2;
  }
  
  public static boolean b() {
    if (b == null) {
      Iterator<UsbDevice> iterator = ((UsbManager)MyApplication.i.getApplicationContext().getSystemService("usb")).getDeviceList().values().iterator();
      boolean bool1 = false;
      while (iterator.hasNext()) {
        UsbDevice usbDevice = iterator.next();
        int i = usbDevice.getInterfaceCount();
        for (byte b = 0; b < i; b++) {
          if (usbDevice.getInterface(b).getInterfaceClass() == 1) {
            bool1 = true;
            break;
          } 
        } 
      } 
      b = Boolean.valueOf(bool1);
    } 
    Boolean bool = b;
    return (bool != null && bool.booleanValue());
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this("BUR: ");
      stringBuilder.append(paramIntent);
      n21.F(stringBuilder.toString());
      a = System.currentTimeMillis();
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\BluetoothUsbReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */