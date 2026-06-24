import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MiniPlayerActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.List;

public final class q6 extends BroadcastReceiver {
  public final int a;
  
  public final Object b;
  
  public q6(c00 paramc00) {
    this.b = paramc00;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    StringBuilder stringBuilder;
    MiniPlayerActivity miniPlayerActivity;
    GhostSearchActivity ghostSearchActivity;
    NetworkInfo networkInfo;
    ye ye;
    ss0 ss0;
    cj cj;
    String str;
    bv2 bv2;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        bv2 = (bv2)object;
        object = paramIntent.getBundleExtra(hbrAVtEa.jKOfvKiJjeImJvW);
        if (object != null) {
          tb2 tb2 = tb2.b((Bundle)object);
          bv2.a.a(jLnXOLx.aRzUaDCti, new Object[] { tb2 });
          bv2.h.getClass();
          object = qp2.c.get();
          if (tb2.b == 3 && object != null) {
            List list = tb2.i;
            n2 n2 = new n2(bv2, tb2, (Cloneable)paramIntent, paramContext, 22);
            if (io1.e.get() != null) {
              ((ae2)object).d.execute(new lf0(object, list, n2, 3));
            } else {
              tp.f("Ingestion should only be called in SplitCompat mode.");
            } 
          } else {
            bv2.c(tb2);
          } 
        } 
        return;
      case 8:
        ((dk2)object).c();
        return;
      case 7:
        ((gf1)object).a();
        return;
      case 6:
        stringBuilder = new StringBuilder(VDgS.Pwr);
        stringBuilder.append(MyApplication.w);
        n21.F(stringBuilder.toString());
        ((MusicActivity)object).t0();
        return;
      case 5:
        miniPlayerActivity = (MiniPlayerActivity)object;
        if (MyApplication.w == 4) {
          i = MiniPlayerActivity.F0;
          miniPlayerActivity.y0 = true;
          (new Thread(new vx0(miniPlayerActivity, 0))).start();
          if (miniPlayerActivity.w0 != null) {
            cn.o(MyApplication.i.getApplicationContext()).C(miniPlayerActivity.w0);
            miniPlayerActivity.w0 = null;
          } 
        } 
        return;
      case 4:
        if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
          ((eu0)object).dismiss(); 
        return;
      case 3:
        ghostSearchActivity = (GhostSearchActivity)object;
        if (MyApplication.w == 4 && ghostSearchActivity.Z != null) {
          cn.o(MyApplication.i.getApplicationContext()).C(ghostSearchActivity.Z);
          ghostSearchActivity.Z = null;
          ss0 = ghostSearchActivity.S;
          if (ss0 != null && ss0.isShowing()) {
            ghostSearchActivity.S.setOnDismissListener(null);
            ghostSearchActivity.S.dismiss();
          } 
          ghostSearchActivity.m0();
        } 
        return;
      case 2:
        object = object;
        if (ss0 != null) {
          cj cj1;
          String str1 = ss0.getAction();
          if ("android.intent.action.AIRPLANE_MODE".equals(str1)) {
            if (ss0.hasExtra("state")) {
              boolean bool = ss0.getBooleanExtra("state", false);
              cj1 = ((c00)object).h;
              cj1.sendMessage(cj1.obtainMessage(10, bool, 0));
            } 
          } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str1)) {
            networkInfo = ((ConnectivityManager)cj1.getSystemService("connectivity")).getActiveNetworkInfo();
            cj = ((c00)object).h;
            cj.sendMessage(cj.obtainMessage(9, networkInfo));
          } 
        } 
        return;
      case 1:
        networkInfo.getClass();
        cj.getClass();
        ye = (ye)object;
        switch (ye.g) {
          default:
            if (cj.getAction() != null) {
              qp0 qp0 = qp0.h();
              object = aq1.a;
              StringBuilder stringBuilder1 = new StringBuilder("Received ");
              stringBuilder1.append(cj.getAction());
              qp0.b((String)object, stringBuilder1.toString());
              str = cj.getAction();
              if (str != null) {
                i = str.hashCode();
                if (i != -1181163412) {
                  if (i == -730838620 && str.equals("android.intent.action.DEVICE_STORAGE_OK"))
                    ye.b(Boolean.TRUE); 
                } else if (str.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                  ye.b(Boolean.FALSE);
                } 
              } 
            } 
          case 1:
            if (str.getAction() != null) {
              qp0 qp0 = qp0.h();
              object = af.a;
              StringBuilder stringBuilder1 = new StringBuilder("Received ");
              stringBuilder1.append(str.getAction());
              qp0.b((String)object, stringBuilder1.toString());
              str = str.getAction();
              if (str != null) {
                i = str.hashCode();
                if (i != -1980154005) {
                  if (i == 490310653 && str.equals("android.intent.action.BATTERY_LOW"))
                    ye.b(Boolean.FALSE); 
                } else if (str.equals("android.intent.action.BATTERY_OKAY")) {
                  ye.b(Boolean.TRUE);
                } 
              } 
            } 
          case 0:
            break;
        } 
        str = str.getAction();
        if (str == null);
        qp0.h().b(ze.a, "Received ".concat(str));
        switch (str.hashCode()) {
          default:
            return;
          case 1019184907:
            if (str.equals("android.intent.action.ACTION_POWER_CONNECTED"))
              ye.b(Boolean.TRUE); 
          case 948344062:
            if (str.equals("android.os.action.CHARGING"))
              ye.b(Boolean.TRUE); 
          case -54942926:
            if (str.equals("android.os.action.DISCHARGING"))
              ye.b(Boolean.FALSE); 
          case -1886648615:
            break;
        } 
        if (!str.equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
        ye.b(Boolean.FALSE);
      case 0:
        break;
    } 
    ((r6)object).i();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */