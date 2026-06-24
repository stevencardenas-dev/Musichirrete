import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class im1 extends ConnectivityManager.NetworkCallback {
  public static final im1 a = (im1)new ConnectivityManager.NetworkCallback();
  
  public static final Object b = new Object();
  
  public static final LinkedHashMap c = new LinkedHashMap<Object, Object>();
  
  public static NetworkCapabilities d;
  
  public static boolean e;
  
  public static Boolean f;
  
  public static boolean a(NetworkRequest paramNetworkRequest, NetworkCapabilities paramNetworkCapabilities) {
    Boolean bool = f;
    bool.getClass();
    return (!bool.booleanValue() && paramNetworkRequest.canBeSatisfiedBy(paramNetworkCapabilities));
  }
  
  public static void b() {
    String str;
    ArrayList arrayList = new ArrayList();
    Object object = b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (!e || f == null) {
        qp0 qp0 = qp0.h();
        str = e72.a;
        StringBuilder stringBuilder = new StringBuilder();
        this("Not dispatching constraint state yet: isBlocked=");
        stringBuilder.append(f);
        stringBuilder.append(", capabilitiesInitialized=");
        stringBuilder.append(e);
        qp0.b(str, stringBuilder.toString());
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
      for (Map.Entry entry : c.entrySet()) {
        kr kr;
        wc0 wc0 = (wc0)entry.getKey();
        NetworkRequest networkRequest = (NetworkRequest)entry.getValue();
        im1 im11 = a;
        NetworkCapabilities networkCapabilities = d;
        im11.getClass();
        if (a(networkRequest, networkCapabilities)) {
          jr jr = jr.a;
        } else {
          kr = new kr(7);
        } 
        t51 t51 = new t51();
        this(wc0, kr);
        str.add(t51);
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    int i = str.size();
    byte b = 0;
    while (b < i) {
      t51 t51 = (t51)str.get(b);
      b++;
      t51 = t51;
      ((wc0)t51.b).h(t51.c);
    } 
  }
  
  public final void onBlockedStatusChanged(Network paramNetwork, boolean paramBoolean) {
    paramNetwork.getClass();
    qp0 qp0 = qp0.h();
    null = e72.a;
    StringBuilder stringBuilder = new StringBuilder("NetworkRequestConstraintController onBlockedStatusChanged callback ");
    stringBuilder.append(paramBoolean);
    qp0.b(null, stringBuilder.toString());
    synchronized (b) {
      boolean bool = ui0.c(f, Boolean.valueOf(paramBoolean));
      if (bool)
        return; 
      f = Boolean.valueOf(paramBoolean);
      b();
      return;
    } 
  }
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities) {
    paramNetwork.getClass();
    paramNetworkCapabilities.getClass();
    qp0.h().b(e72.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
    synchronized (b) {
      d = paramNetworkCapabilities;
      e = true;
      b();
      return;
    } 
  }
  
  public final void onLost(Network paramNetwork) {
    paramNetwork.getClass();
    qp0.h().b(e72.a, "NetworkRequestConstraintController onLost callback");
    Object object = b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      d = null;
      for (wc0 wc0 : c.keySet()) {
        kr kr = new kr();
        this(7);
        wc0.h(kr);
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\im1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */