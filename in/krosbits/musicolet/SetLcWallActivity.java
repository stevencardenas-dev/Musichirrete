package in.krosbits.musicolet;

import ad0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import el1;
import g92;
import hl1;
import k91;
import m92;
import n0;
import n2;
import pc;
import qo;
import qv;
import sc;
import ui0;
import um0;
import ws2;
import xs;

public final class SetLcWallActivity extends pc {
  public static final int T = 0;
  
  public final int R = 1;
  
  public n2 S;
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      Uri uri = paramIntent.getData();
      if (uri != null)
        qv.L((xs)g92.E((um0)this), null, null, (ad0)new sc(this, uri, null, 9), 3); 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    FrameLayout frameLayout;
    m92.t(this);
    getTheme().applyStyle(2131953009, true);
    getTheme().applyStyle(2131953018, true);
    n0.a((qo)this, true);
    super.onCreate(paramBundle);
    View view = getLayoutInflater().inflate(2131492913, null, false);
    int i = 2131296386;
    MaterialButton materialButton = (MaterialButton)ws2.C(view, 2131296386);
    if (materialButton != null) {
      i = 2131296428;
      MaterialButton materialButton1 = (MaterialButton)ws2.C(view, 2131296428);
      if (materialButton1 != null) {
        i = 2131297890;
        TextView textView = (TextView)ws2.C(view, 2131297890);
        if (textView != null) {
          i = 2131297921;
          LinearLayout linearLayout = (LinearLayout)ws2.C(view, 2131297921);
          if (linearLayout != null) {
            frameLayout = (FrameLayout)view;
            this.S = new n2(frameLayout, materialButton, materialButton1, textView, linearLayout);
            setContentView((View)frameLayout);
            n2 n21 = this.S;
            if (n21 != null) {
              g92.e((View)n21.f, true);
              n21 = this.S;
              if (n21 != null) {
                g92.d((View)n21.g, true, false);
                n21 = this.S;
                if (n21 != null) {
                  TextView textView1 = (TextView)n21.f;
                  String str2 = getString(2131886964);
                  String str1 = getString(2131887561);
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append(str2);
                  stringBuilder.append(" ");
                  stringBuilder.append(str1);
                  textView1.setText(stringBuilder.toString());
                  n2 n22 = this.S;
                  if (n22 != null) {
                    ((MaterialButton)n22.c).setOnClickListener((View.OnClickListener)new el1(this, 0));
                    n22 = this.S;
                    if (n22 != null) {
                      ((MaterialButton)n22.e).setOnClickListener((View.OnClickListener)new el1(this, 1));
                      qv.L((xs)g92.E((um0)this), null, null, (ad0)new hl1(this, null, 0), 3);
                      return;
                    } 
                    ui0.n0("binding");
                    throw null;
                  } 
                  ui0.n0("binding");
                  throw null;
                } 
                ui0.n0("binding");
                throw null;
              } 
              ui0.n0("binding");
              throw null;
            } 
            ui0.n0("binding");
            throw null;
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(frameLayout.getResources().getResourceName(i)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\SetLcWallActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */