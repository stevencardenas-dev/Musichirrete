import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class dk2 {
  public static final rp0 l = new rp0("ConnectivityMonitor", null);
  
  public final uu2 a;
  
  public final zh0 b;
  
  public final ConnectivityManager c;
  
  public final HashMap d;
  
  public final ArrayList e;
  
  public boolean f;
  
  public final Context g;
  
  public final Object h;
  
  public final boolean i;
  
  public final q6 j;
  
  public final HashSet k;
  
  public dk2(Context paramContext, uu2 paramuu2) {
    boolean bool;
    this.b = new zh0(2, this);
    this.d = new HashMap<Object, Object>();
    this.e = new ArrayList();
    this.h = new Object();
    if (Build.VERSION.SDK_INT >= 31) {
      bool = true;
    } else {
      bool = false;
    } 
    this.i = bool;
    this.j = new q6(8, this);
    this.k = new HashSet();
    this.a = paramuu2;
    this.g = paramContext;
    this.c = (ConnectivityManager)paramContext.getSystemService("connectivity");
  }
  
  public final void a() {
    l.b("Start monitoring connectivity changes", new Object[0]);
    if (!this.f) {
      ConnectivityManager connectivityManager = this.c;
      if (connectivityManager != null) {
        Context context = this.g;
        if (n21.p(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
          Network network = connectivityManager.getActiveNetwork();
          if (network != null) {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null)
              b(network, linkProperties); 
          } 
          NetworkRequest.Builder builder = (new NetworkRequest.Builder()).addTransportType(1);
          if (this.i) {
            builder.setIncludeOtherUidNetworks(true);
          } else {
            IntentFilter intentFilter = new IntentFilter("android.net.wifi.STATE_CHANGE");
            context.registerReceiver(this.j, intentFilter);
          } 
          connectivityManager.registerNetworkCallback(builder.build(), this.b);
          this.f = true;
        } 
      } 
    } 
  }
  
  public final void b(Network paramNetwork, LinkProperties paramLinkProperties) {
    HashMap<Network, LinkProperties> hashMap;
    Object object = this.h;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      l.b("a new network is available", new Object[0]);
      hashMap = this.d;
      if (hashMap.containsKey(paramNetwork))
        this.e.remove(paramNetwork); 
    } finally {}
    hashMap.put(paramNetwork, paramLinkProperties);
    this.e.add(paramNetwork);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    c();
  }
  
  public final void c() {
    uu2 uu21 = this.a;
    if (uu21 == null)
      return; 
    HashSet hashSet = this.k;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} */
    try {
      Iterator iterator = hashSet.iterator();
      while (iterator.hasNext()) {
        if (iterator.next() == null) {
          if (!uu21.b.isShutdown()) {
            yi1 yi1 = new yi1();
            this(22, this);
            uu21.execute(yi1);
          } 
          continue;
        } 
        ClassCastException classCastException = new ClassCastException();
        this();
        throw classCastException;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */