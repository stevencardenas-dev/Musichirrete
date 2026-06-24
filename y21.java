import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class y21 implements Handler.Callback, ServiceConnection {
  public final Context b;
  
  public final Handler c;
  
  public final HashMap e = new HashMap<Object, Object>();
  
  public HashSet f = new HashSet();
  
  public y21(Context paramContext) {
    this.b = paramContext;
    HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
    handlerThread.start();
    this.c = new Handler(handlerThread.getLooper(), this);
  }
  
  public final void a(x21 paramx21) {
    boolean bool;
    ArrayDeque<v21> arrayDeque = paramx21.d;
    ComponentName componentName = paramx21.a;
    if (Log.isLoggable("NotifManCompat", 3)) {
      StringBuilder stringBuilder = new StringBuilder("Processing component ");
      stringBuilder.append(componentName);
      stringBuilder.append(", ");
      stringBuilder.append(arrayDeque.size());
      stringBuilder.append(" queued tasks");
      Log.d("NotifManCompat", stringBuilder.toString());
    } 
    if (arrayDeque.isEmpty())
      return; 
    if (paramx21.b) {
      bool = true;
    } else {
      Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(componentName);
      Context context = this.b;
      bool = context.bindService(intent, this, 33);
      paramx21.b = bool;
      if (bool) {
        paramx21.e = 0;
      } else {
        StringBuilder stringBuilder = new StringBuilder("Unable to bind to listener ");
        stringBuilder.append(componentName);
        Log.w("NotifManCompat", stringBuilder.toString());
        context.unbindService(this);
      } 
      bool = paramx21.b;
    } 
    if (!bool || paramx21.c == null) {
      b(paramx21);
      return;
    } 
    while (true) {
      v21 v21 = arrayDeque.peek();
      if (v21 == null)
        break; 
      try {
        if (Log.isLoggable("NotifManCompat", 3)) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Sending task ");
          stringBuilder.append(v21);
          Log.d("NotifManCompat", stringBuilder.toString());
        } 
        v21.a(paramx21.c);
        arrayDeque.remove();
        continue;
      } catch (DeadObjectException deadObjectException) {
        if (Log.isLoggable("NotifManCompat", 3)) {
          StringBuilder stringBuilder = new StringBuilder("Remote service has died: ");
          stringBuilder.append(componentName);
          Log.d("NotifManCompat", stringBuilder.toString());
        } 
      } catch (RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder("RemoteException communicating with ");
        stringBuilder.append(componentName);
        Log.w("NotifManCompat", stringBuilder.toString(), (Throwable)remoteException);
        break;
      } 
      if (!arrayDeque.isEmpty())
        b(paramx21); 
      return;
    } 
    if (!arrayDeque.isEmpty())
      b(paramx21); 
  }
  
  public final void b(x21 paramx21) {
    StringBuilder stringBuilder;
    ComponentName componentName = paramx21.a;
    ArrayDeque arrayDeque = paramx21.d;
    Handler handler = this.c;
    if (handler.hasMessages(3, componentName))
      return; 
    int j = paramx21.e;
    int i = j + 1;
    paramx21.e = i;
    if (i > 6) {
      stringBuilder = new StringBuilder("Giving up on delivering ");
      stringBuilder.append(arrayDeque.size());
      stringBuilder.append(" tasks to ");
      stringBuilder.append(componentName);
      stringBuilder.append(" after ");
      stringBuilder.append(paramx21.e);
      stringBuilder.append(" retries");
      Log.w("NotifManCompat", stringBuilder.toString());
      arrayDeque.clear();
      return;
    } 
    i = (1 << j) * 1000;
    if (Log.isLoggable("NotifManCompat", 3)) {
      StringBuilder stringBuilder1 = new StringBuilder("Scheduling retry for ");
      stringBuilder1.append(i);
      stringBuilder1.append(" ms");
      Log.d("NotifManCompat", stringBuilder1.toString());
    } 
    stringBuilder.sendMessageDelayed(stringBuilder.obtainMessage(3, componentName), i);
  }
  
  public final boolean handleMessage(Message paramMessage) {
    Object object;
    int i = paramMessage.what;
    ComponentName componentName = null;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return false; 
          ComponentName componentName1 = (ComponentName)paramMessage.obj;
          object = this.e.get(componentName1);
          if (object != null) {
            a((x21)object);
            return true;
          } 
        } else {
          ComponentName componentName1 = (ComponentName)((Message)object).obj;
          object = this.e.get(componentName1);
          if (object != null) {
            if (((x21)object).b) {
              this.b.unbindService(this);
              ((x21)object).b = false;
            } 
            ((x21)object).c = null;
            return true;
          } 
        } 
      } else {
        w21 w21 = (w21)((Message)object).obj;
        ComponentName componentName1 = w21.a;
        IBinder iBinder = w21.b;
        x21 x21 = (x21)this.e.get(componentName1);
        if (x21 != null) {
          i = qg0.e;
          if (iBinder == null) {
            componentName1 = componentName;
          } else {
            object = iBinder.queryLocalInterface(rg0.c);
            if (object != null && object instanceof rg0) {
              object = object;
            } else {
              object = new Object();
              ((pg0)object).e = iBinder;
            } 
          } 
          x21.c = (rg0)object;
          x21.e = 0;
          a(x21);
          return true;
        } 
      } 
    } else {
      object = ((Message)object).obj;
      String str = Settings.Secure.getString(this.b.getContentResolver(), "enabled_notification_listeners");
      object1 = z21.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      if (str != null)
        try {
          if (!str.equals(z21.d)) {
            String[] arrayOfString = str.split(":", -1);
            HashSet<String> hashSet1 = new HashSet();
            this(arrayOfString.length);
            int j = arrayOfString.length;
            for (i = 0; i < j; i++) {
              ComponentName componentName1 = ComponentName.unflattenFromString(arrayOfString[i]);
              if (componentName1 != null)
                hashSet1.add(componentName1.getPackageName()); 
            } 
            z21.e = hashSet1;
            z21.d = str;
          } 
        } finally {} 
      HashSet hashSet = z21.e;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      if (!hashSet.equals(this.f)) {
        this.f = hashSet;
        List list = this.b.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
        object1 = new HashSet();
        for (ResolveInfo resolveInfo : list) {
          if (!hashSet.contains(resolveInfo.serviceInfo.packageName))
            continue; 
          ServiceInfo serviceInfo = resolveInfo.serviceInfo;
          ComponentName componentName1 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
          if (resolveInfo.serviceInfo.permission != null) {
            StringBuilder stringBuilder = new StringBuilder("Permission present on component ");
            stringBuilder.append(componentName1);
            stringBuilder.append(", not adding listener record.");
            Log.w("NotifManCompat", stringBuilder.toString());
            continue;
          } 
          object1.add(componentName1);
        } 
        for (ComponentName componentName1 : object1) {
          if (!this.e.containsKey(componentName1)) {
            if (Log.isLoggable("NotifManCompat", 3)) {
              StringBuilder stringBuilder = new StringBuilder("Adding listener record for ");
              stringBuilder.append(componentName1);
              Log.d("NotifManCompat", stringBuilder.toString());
            } 
            this.e.put(componentName1, new x21(componentName1));
          } 
        } 
        Iterator<Map.Entry> iterator = this.e.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry entry = iterator.next();
          if (!object1.contains(entry.getKey())) {
            if (Log.isLoggable("NotifManCompat", 3)) {
              StringBuilder stringBuilder = new StringBuilder("Removing listener record for ");
              stringBuilder.append(entry.getKey());
              Log.d("NotifManCompat", stringBuilder.toString());
            } 
            x21 x21 = (x21)entry.getValue();
            if (x21.b) {
              this.b.unbindService(this);
              x21.b = false;
            } 
            x21.c = null;
            iterator.remove();
          } 
        } 
      } 
      for (Object object1 : this.e.values()) {
        ((x21)object1).d.add(object);
        a((x21)object1);
      } 
    } 
    return true;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    if (Log.isLoggable("NotifManCompat", 3)) {
      StringBuilder stringBuilder = new StringBuilder("Connected to service ");
      stringBuilder.append(paramComponentName);
      Log.d("NotifManCompat", stringBuilder.toString());
    } 
    w21 w21 = new w21(paramComponentName, paramIBinder);
    this.c.obtainMessage(1, w21).sendToTarget();
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    if (Log.isLoggable("NotifManCompat", 3)) {
      StringBuilder stringBuilder = new StringBuilder("Disconnected from service ");
      stringBuilder.append(paramComponentName);
      Log.d("NotifManCompat", stringBuilder.toString());
    } 
    this.c.obtainMessage(2, paramComponentName).sendToTarget();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */