import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.ActionMenuView;
import in.krosbits.musicolet.RestoreActivity;

public final class sb implements y00, gx0 {
  public boolean b;
  
  public Object c;
  
  public sb(vs2 paramvs2, boolean paramBoolean) {
    this(paramvs2);
    this.b = paramBoolean;
  }
  
  public void a(rw0 paramrw0, boolean paramBoolean) {
    kv1 kv1 = (kv1)this.c;
    if (this.b)
      return; 
    this.b = true;
    ActionMenuView actionMenuView = kv1.o.a.b;
    if (actionMenuView != null) {
      u1 u1 = actionMenuView.g;
      if (u1 != null) {
        u1.d();
        r1 r1 = u1.v;
        if (r1 != null && r1.b())
          r1.i.dismiss(); 
      } 
    } 
    kv1.p.onPanelClosed(108, paramrw0);
    this.b = false;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public boolean c(CharSequence paramCharSequence, int paramInt) {
    if (paramCharSequence != null && paramInt >= 0 && paramCharSequence.length() - paramInt >= 0) {
      if ((vs2)this.c == null)
        return b(); 
      byte b1 = 0;
      byte b = 2;
      while (b1 < paramInt && b == 2) {
        b = Character.getDirectionality(paramCharSequence.charAt(b1));
        sb sb1 = wt1.a;
        if (b != 0)
          if (b != 1 && b != 2) {
            switch (b) {
              default:
                b = 2;
                break;
              case 16:
              case 17:
                b = 0;
                break;
              case 14:
              case 15:
                b = 1;
                break;
            } 
            b1++;
          }  
      } 
      return (b != 0) ? ((b != 1) ? b() : false) : true;
    } 
    l0.k();
    return false;
  }
  
  public void d(fo2 paramfo2) {
    if (this.b) {
      ph2.h("BillingLogger", "Skipping logging since initialization failed.");
      return;
    } 
    try {
      cn cn = (cn)this.c;
      ya ya = new ya();
      return;
    } finally {
      paramfo2 = null;
      ph2.h("BillingLogger", "logging failed.");
    } 
  }
  
  public void f(Context paramContext, v00 paramv00) {
    pc pc = (pc)this.c;
    pc.startActivity((new Intent((Context)pc, RestoreActivity.class)).putExtra("fresh", this.b).putExtra("path", paramv00.j().toString()).putExtra("logpath", paramv00.b.toString()));
  }
  
  public boolean k(rw0 paramrw0) {
    ((kv1)this.c).p.onMenuOpened(108, paramrw0);
    return true;
  }
  
  public boolean n(v00 paramv00) {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */