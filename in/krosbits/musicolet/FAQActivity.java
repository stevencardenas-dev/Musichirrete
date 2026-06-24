package in.krosbits.musicolet;

import a3;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.insets.ProtectionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import e70;
import f70;
import g92;
import hn;
import id1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import jn;
import k91;
import m60;
import m92;
import n0;
import pc;
import qo;
import qz1;
import rs0;
import ws2;

public class FAQActivity extends pc {
  public static final int U = 0;
  
  public final ArrayList R = new ArrayList();
  
  public LayoutInflater S;
  
  public int T;
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    this.T = (int)getResources().getDimension(2131165392);
    Object object = LayoutInflater.from((Context)this).inflate(2131492897, null, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)object;
    int i = 2131297364;
    RecyclerView recyclerView = (RecyclerView)ws2.C((View)object, 2131297364);
    if (recyclerView != null) {
      i = 2131297607;
      Toolbar toolbar = (Toolbar)ws2.C((View)object, 2131297607);
      if (toolbar != null) {
        setContentView((View)protectionLayout);
        g0(toolbar);
        g92.e((View)toolbar, true);
        g92.d((View)recyclerView, true, false);
        hn hn = new hn(8, jn.i(m92.h[2], 178));
        ArrayList<Object> arrayList1 = new ArrayList(1);
        (new Object[1])[0] = hn;
        object = (new Object[1])[0];
        Objects.requireNonNull(object);
        arrayList1.add(object);
        protectionLayout.setProtections(Collections.unmodifiableList(arrayList1));
        this.S = LayoutInflater.from((Context)this);
        Y().f0(2131886553);
        Y().b0(true);
        Y().Z(true);
        boolean bool = qz1.G();
        f70 f70 = new f70(1, 2131886957, -1);
        ArrayList<f70> arrayList = this.R;
        arrayList.add(f70);
        if (ag0.e0())
          arrayList.add(new f70(2131887588, (Runnable)new e70(this, 0))); 
        arrayList.add(new f70(2131887132, Uri.parse("musicolet://dl/dkmp")));
        arrayList.add(new f70(2131887131, Uri.parse("musicolet://dl/pruwapl")));
        arrayList.add(new f70(2131887473, (Runnable)new e70(this, 1)));
        arrayList.add(new f70(1, 2131887419, -1));
        object = getString(2131886185, new Object[] { getString(2131887548) });
        Object object1 = new Object();
        ((f70)object1).a = 0;
        ((f70)object1).b = 2131887589;
        ((f70)object1).d = (String)object;
        arrayList.add(object1);
        arrayList.add(new f70(1, 2131887137, -1));
        arrayList.add(new f70(0, 2131887574, 2131886183));
        arrayList.add(new f70(0, 2131887575, 2131886184));
        arrayList.add(new f70(0, 2131886547, 2131886182));
        if (bool) {
          arrayList.add(new f70(1, 2131886618, -1));
          arrayList.add(new f70(2131886752, getString(2131886833), getString(2131886635), (rs0)new m60(4)));
          arrayList.add(new f70(2131886671, getString(2131886834), getString(2131886635), (rs0)new m60(5)));
        } 
        arrayList.add(new f70(1, 2131886838, -1));
        arrayList.add(new f70(0, 2131886465, 2131887570));
        recyclerView.setAdapter((id1)new a3(7, this));
        recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
        return;
      } 
    } 
    k91.h("Missing required view with ID: ".concat(object.getResources().getResourceName(i)));
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    if (paramMenuItem.getItemId() == 16908332)
      finish(); 
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\FAQActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */