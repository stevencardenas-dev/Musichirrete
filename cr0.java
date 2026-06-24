import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import in.krosbits.musicolet.MostPlayedActivity;
import java.util.ArrayList;

public final class cr0 implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
  public final ss0 b;
  
  public final xy c;
  
  public final Bundle e;
  
  public final zx0 f;
  
  public cr0(MostPlayedActivity paramMostPlayedActivity, Bundle paramBundle, zx0 paramzx0, ArrayList paramArrayList) {
    ConstraintLayout constraintLayout;
    bh0 bh0 = new bh0(5, this);
    this.e = paramBundle;
    this.f = paramzx0;
    ms0 ms0 = new ms0((Context)paramMostPlayedActivity);
    View view = paramMostPlayedActivity.getLayoutInflater().inflate(2131492966, null, false);
    RecyclerView recyclerView = (RecyclerView)ws2.C(view, 2131297428);
    if (recyclerView != null) {
      constraintLayout = (ConstraintLayout)view;
      this.c = new xy(constraintLayout, recyclerView);
      ms0.f((View)constraintLayout, true);
      ms0.W = this;
      ms0.Y = this;
      this.b = new ss0(ms0);
      FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(paramMostPlayedActivity);
      if (flexboxLayoutManager.t != 2) {
        flexboxLayoutManager.t = 2;
        flexboxLayoutManager.C0();
      } 
      flexboxLayoutManager.h1(2);
      flexboxLayoutManager.j1(1);
      recyclerView.setLayoutManager((a)flexboxLayoutManager);
      recyclerView.setAdapter(new gn(paramArrayList, paramBundle.getInt("ti", 0), bh0));
      return;
    } 
    k91.h("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(2131297428)));
    throw null;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {}
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.c.b.k0(this.e.getInt("ti", 0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */