import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

public final class zh0 extends ConnectivityManager.NetworkCallback {
  public static final int c = 0;
  
  public final int a;
  
  public final Object b;
  
  public zh0(dy paramdy) {
    this.b = paramdy;
  }
  
  private final void a(Network paramNetwork) {}
  
  public void onAvailable(Network paramNetwork) {
    switch (this.a) {
      default:
        super.onAvailable(paramNetwork);
        break;
      case 2:
        break;
    } 
  }
  
  public void onBlockedStatusChanged(Network paramNetwork, boolean paramBoolean) {
    switch (this.a) {
      default:
        super.onBlockedStatusChanged(paramNetwork, paramBoolean);
        return;
      case 1:
        break;
    } 
    paramNetwork.getClass();
    if (paramNetwork.equals(((b21)this.b).f.getActiveNetwork())) {
      qp0 qp0 = qp0.h();
      String str = a21.a;
      StringBuilder stringBuilder = new StringBuilder("Network blocked status changed: ");
      stringBuilder.append(paramBoolean);
      qp0.b(str, stringBuilder.toString());
      b21 b21 = (b21)this.b;
      null = b21.e;
      null = null;
      if (null == null)
        null = b21.a(); 
      z11 z11 = (z11)null;
      null = this.b;
      synchronized (((b21)null).g) {
        boolean bool = ((b21)null).h;
        if (bool == paramBoolean) {
        
        } else {
          ((b21)null).h = paramBoolean;
          ((b21)this.b).b(new z11(z11.a, z11.b, z11.c, z11.d, paramBoolean));
        } 
      } 
    } 
  }
  
  public void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities) {
    qp0 qp0;
    b21 b21;
    StringBuilder stringBuilder;
    String str;
    switch (this.a) {
      default:
        super.onCapabilitiesChanged(paramNetwork, paramNetworkCapabilities);
        return;
      case 1:
        paramNetwork.getClass();
        paramNetworkCapabilities.getClass();
        qp0 = qp0.h();
        str = a21.a;
        stringBuilder = new StringBuilder("Network capabilities changed: ");
        stringBuilder.append(paramNetworkCapabilities);
        qp0.b(str, stringBuilder.toString());
        b21 = (b21)this.b;
        b21.b(a21.a(b21.f, b21.h));
        return;
      case 0:
        break;
    } 
    b21.getClass();
    paramNetworkCapabilities.getClass();
    qp0.h().b(e72.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
    ((dy)this.b).h(jr.a);
  }
  
  public void onLinkPropertiesChanged(Network paramNetwork, LinkProperties paramLinkProperties) {
    switch (this.a) {
      default:
        super.onLinkPropertiesChanged(paramNetwork, paramLinkProperties);
        return;
      case 2:
        break;
    } 
    ((dk2)this.b).b(paramNetwork, paramLinkProperties);
  }
  
  public final void onLost(Network paramNetwork) {
    Object object;
    dk2 dk2;
    switch (this.a) {
      default:
        dk2 = (dk2)this.b;
        object = dk2.h;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          dk2.l.b("the network is lost", new Object[0]);
          if (dk2.e.remove(paramNetwork))
            dk2.d.remove(paramNetwork); 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        dk2.c();
        return;
      case 1:
        paramNetwork.getClass();
        qp0.h().b(a21.a, "Network connection lost");
        ((b21)this.b).b(new z11(false, false, false, false, false));
        return;
      case 0:
        break;
    } 
    paramNetwork.getClass();
    qp0.h().b(e72.a, "NetworkRequestConstraintController onLost callback");
    ((dy)this.b).h(new kr(7));
  }
  
  public void onUnavailable() {
    switch (this.a) {
      default:
        super.onUnavailable();
        return;
      case 2:
        break;
    } 
    null = (dk2)this.b;
    synchronized (null.h) {
      dk2.l.b("all networks are unavailable.", new Object[0]);
      null.d.clear();
      null.e.clear();
      null.c();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */