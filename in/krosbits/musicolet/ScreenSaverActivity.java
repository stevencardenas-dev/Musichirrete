package in.krosbits.musicolet;

import ad0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import bp1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.imageview.ShapeableImageView;
import ek;
import g92;
import gh1;
import hj1;
import in.krosbits.android.widgets.SmartTextView;
import k91;
import l61;
import le1;
import lz;
import m2;
import m92;
import n0;
import pc;
import qo;
import qv;
import tp;
import ui0;
import um0;
import ws2;
import xs;

public final class ScreenSaverActivity extends pc {
  public static final int W = 0;
  
  public m2 R;
  
  public boolean S;
  
  public boolean T;
  
  public final int U = 1;
  
  public bp1 V;
  
  public final m2 l0() {
    m2 m21 = this.R;
    if (m21 != null)
      return m21; 
    ui0.n0("activityScreenSaverBinding");
    throw null;
  }
  
  public final void m0(int paramInt) {
    bp1 bp11 = this.V;
    if (bp11 != null)
      bp11.c(null); 
    this.V = null;
    ((ConstraintLayout)(l0()).a).setAlpha(1.0F);
    WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
    layoutParams.screenBrightness = -1.0F;
    getWindow().setAttributes(layoutParams);
    boolean bool = false;
    if (paramInt == 0) {
      ((Group)(l0()).e).setVisibility(0);
      MaterialCheckBox materialCheckBox = (MaterialCheckBox)(l0()).d;
      if (this.S) {
        paramInt = bool;
      } else {
        paramInt = 8;
      } 
      materialCheckBox.setVisibility(paramInt);
      ((Group)(l0()).f).setVisibility(8);
      return;
    } 
    if (paramInt == this.U) {
      ((Group)(l0()).e).setVisibility(8);
      ((MaterialCheckBox)(l0()).d).setVisibility(8);
      ((Group)(l0()).f).setVisibility(0);
      Object object = new Object();
      ((le1)object).b = 1.0F;
      this.V = qv.L((xs)g92.E((um0)this), null, null, (ad0)new ek(object, this, null, 6), 3);
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    m92.t(this);
    getTheme().applyStyle(2131953009, true);
    n0.a((qo)this, true);
    LayoutInflater layoutInflater = getLayoutInflater();
    boolean bool = false;
    Object object = layoutInflater.inflate(2131492911, null, false);
    int i = 2131296397;
    MaterialButton materialButton = (MaterialButton)ws2.C((View)object, 2131296397);
    if (materialButton != null) {
      i = 2131296400;
      MaterialButton materialButton1 = (MaterialButton)ws2.C((View)object, 2131296400);
      if (materialButton1 != null) {
        i = 2131296531;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox)ws2.C((View)object, 2131296531);
        if (materialCheckBox != null) {
          i = 2131296766;
          Group group = (Group)ws2.C((View)object, 2131296766);
          if (group != null) {
            i = 2131296767;
            Group group1 = (Group)ws2.C((View)object, 2131296767);
            if (group1 != null) {
              i = 2131296914;
              if ((ShapeableImageView)ws2.C((View)object, 2131296914) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout)object;
                i = 2131297860;
                if ((SmartTextView)ws2.C((View)object, 2131297860) != null) {
                  i = 2131297861;
                  if ((SmartTextView)ws2.C((View)object, 2131297861) != null) {
                    i = 2131297862;
                    if ((TextView)ws2.C((View)object, 2131297862) != null) {
                      i = 2131297874;
                      if ((TextView)ws2.C((View)object, 2131297874) != null) {
                        i = 2131297911;
                        if ((TextView)ws2.C((View)object, 2131297911) != null) {
                          boolean bool1;
                          object = new Object();
                          ((m2)object).a = constraintLayout;
                          ((m2)object).b = materialButton;
                          ((m2)object).c = materialButton1;
                          ((m2)object).d = materialCheckBox;
                          ((m2)object).e = group;
                          ((m2)object).f = group1;
                          this.R = (m2)object;
                          setContentView((View)(l0()).a);
                          getWindow().addFlags(1024);
                          View view = getWindow().getDecorView();
                          view.getClass();
                          view.setSystemUiVisibility(5638);
                          getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(-16777216));
                          getWindow().addFlags(128);
                          i = Build.VERSION.SDK_INT;
                          if (i >= 28) {
                            WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
                            if (i >= 30) {
                              i = 3;
                            } else {
                              i = 1;
                            } 
                            tp.c(layoutParams, i);
                          } 
                          i = MyApplication.x().getInt("S_i_ssesnt", 0);
                          if (i > 1) {
                            bool1 = true;
                          } else {
                            bool1 = false;
                          } 
                          this.S = bool1;
                          this.T = MyApplication.x().getBoolean("S_b_dtssse", false);
                          gh1 gh1 = new gh1(MyApplication.i.getApplicationContext(), new l61(1, this));
                          ((GestureDetector)gh1.c).setIsLongpressEnabled(false);
                          ((MaterialButton)(l0()).b).setOnClickListener((View.OnClickListener)new hj1(this, 0));
                          ((MaterialButton)(l0()).c).setOnClickListener((View.OnClickListener)new hj1(this, 1));
                          ((ConstraintLayout)(l0()).a).setOnTouchListener((View.OnTouchListener)new lz(2, gh1));
                          MyApplication.x().edit().putInt("S_i_ssesnt", i + 1).apply();
                          i = bool;
                          if (this.T)
                            i = this.U; 
                          m0(i);
                          return;
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(object.getResources().getResourceName(i)));
  }
  
  public final void onDestroy() {
    bp1 bp11 = this.V;
    if (bp11 != null)
      bp11.c(null); 
    this.V = null;
    WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
    layoutParams.screenBrightness = -1.0F;
    getWindow().setAttributes(layoutParams);
    super.onDestroy();
  }
  
  public final void onStop() {
    super.onStop();
    finish();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\ScreenSaverActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */