import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import com.afollestad.materialdialogs.color.CircleView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.slider.RangeSlider;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.IncludedFoldersActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WelcomeActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class b52 extends ua0 implements View.OnClickListener, ym {
  public WelcomeActivity a0;
  
  public final int[] b0 = m92.a(MyApplication.i.getApplicationContext());
  
  public final void F(int paramInt) {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.a0 = (WelcomeActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view1 = paramLayoutInflater.inflate(2131493000, paramViewGroup, false);
    g92.c(view1.findViewById(2131297555), true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)view1.findViewById(2131296941);
    int[] arrayOfInt = m92.h;
    hn hn = new hn(2, jn.i(arrayOfInt[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    View view4 = view1.findViewById(2131296948);
    Context context = P();
    int i = arrayOfInt[8];
    float f = MyApplication.p;
    view4.setBackground((Drawable)ag0.V(context, i, 0, (int)(f * 1.3D), f * 8.0F));
    view4.setOnClickListener(this);
    View view3 = view1.findViewById(2131296395);
    View view2 = view1.findViewById(2131296392);
    if (MyApplication.F.p() && !M().getIntent().getBooleanExtra("acthpron", false)) {
      view3.setOnClickListener(this);
      view2.setOnClickListener(this);
    } else {
      view1.findViewById(2131297922).setVisibility(8);
      view3.setVisibility(8);
      view2.setVisibility(8);
    } 
    if (M().getIntent().getBooleanExtra("acthpron", false))
      view1.findViewById(2131296769).setVisibility(8); 
    RadioGroup radioGroup = (RadioGroup)view1.findViewById(2131297375);
    i = Integer.parseInt(MyApplication.o().getString("THMR_BT", "2"));
    if (i == 0) {
      radioGroup.check(2131297333);
    } else if (i == 1) {
      radioGroup.check(2131297329);
    } else if (i == 2) {
      radioGroup.check(2131297328);
    } else if (i == 3) {
      radioGroup.check(2131297330);
      ImageView imageView = (ImageView)view1.findViewById(2131296820);
      imageView.setVisibility(0);
      imageView.setOnClickListener(this);
    } else if (i == 4) {
      ImageView imageView = (ImageView)view1.findViewById(2131296821);
      imageView.setVisibility(0);
      imageView.setOnClickListener(this);
      radioGroup.check(2131297355);
    } 
    if (Build.VERSION.SDK_INT < 29)
      view1.findViewById(2131297036).setVisibility(8); 
    view1.findViewById(2131297333).setOnClickListener(this);
    view1.findViewById(2131297329).setOnClickListener(this);
    view1.findViewById(2131297328).setOnClickListener(this);
    view1.findViewById(2131297330).setOnClickListener(this);
    view1.findViewById(2131297355).setOnClickListener(this);
    return view1;
  }
  
  public final void j0() {
    this.a0 = null;
    this.I = true;
  }
  
  public final void onClick(View paramView) {
    xm xm;
    int j = paramView.getId();
    int i = 0;
    if (j == 2131296948) {
      xm = new xm((Context)this.a0, this);
      xm.h = false;
      xm.i = false;
      xm.f = this.b0;
      xm.a();
      return;
    } 
    if (j == 2131296395) {
      B0(new Intent(P(), IncludedFoldersActivity.class));
      return;
    } 
    if (j == 2131296392) {
      B0(new Intent(P(), FolderExcluderActivity.class));
      return;
    } 
    if (j == 2131297333 || j == 2131297329 || j == 2131297328 || j == 2131297330 || j == 2131297355) {
      int k = xm.getId();
      j = m92.f;
      if (k != 2131297333)
        if (k == 2131297329) {
          i = 1;
        } else if (k == 2131297328) {
          i = 2;
        } else if (k == 2131297330) {
          i = 3;
        } else if (k == 2131297355) {
          i = 4;
        } else {
          i = j;
        }  
      if (i != Integer.parseInt(MyApplication.o().getString("THMR_BT", "2"))) {
        MyApplication.o().edit().putString("THMR_BT", String.valueOf(i)).apply();
        m92.I(MyApplication.i.getApplicationContext());
        MyApplication.s();
        sl1.P0(true);
      } 
      return;
    } 
    if (j == 2131296820 || j == 2131296821) {
      ms0 ms0 = new ms0(P());
      Context context = ms0.b;
      ((ju1)ms0).M0 = m92.a(context);
      ((ju1)ms0).N0 = -1;
      ((ju1)ms0).O0 = 1;
      ms0.k(2131886278);
      ms0.n(2131887265);
      ms0.e(2131492978, true);
      RadioGroup radioGroup = (RadioGroup)ms0.u.findViewById(2131297375);
      ((ju1)ms0).B0 = radioGroup;
      CheckBox checkBox = (CheckBox)ms0.u.findViewById(2131296563);
      ((ju1)ms0).D0 = checkBox;
      CircleView circleView = (CircleView)ms0.u.findViewById(2131296625);
      ((ju1)ms0).E0 = circleView;
      RangeSlider rangeSlider = (RangeSlider)ms0.u.findViewById(2131297480);
      ((ju1)ms0).F0 = rangeSlider;
      ((ju1)ms0).G0 = (TextView)ms0.u.findViewById(2131297726);
      ((ju1)ms0).H0 = (TextView)ms0.u.findViewById(2131297799);
      MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup)ms0.u.findViewById(2131297656);
      ((ju1)ms0).I0 = materialButtonToggleGroup;
      ((ju1)ms0).J0 = (ViewGroup)ms0.u.findViewById(2131296495);
      ms0.u.findViewById(2131296948).setOnClickListener((View.OnClickListener)ms0);
      i = Integer.parseInt(MyApplication.o().getString("THMR_BT", "2"));
      j = Build.VERSION.SDK_INT;
      if (j < 29)
        radioGroup.findViewById(2131297355).setVisibility(8); 
      if (i == 0) {
        radioGroup.check(2131297333);
      } else if (i == 1) {
        radioGroup.check(2131297329);
      } else if (i == 2) {
        radioGroup.check(2131297328);
      } else if (i == 4 && j >= 29) {
        radioGroup.check(2131297355);
      } else if (i == 3) {
        radioGroup.check(2131297330);
      } 
      checkBox.setChecked(context.getSharedPreferences("PP", 0).getBoolean("kb_lstusbr", true));
      checkBox.setVisibility(8);
      ms0.r();
      ((Button)materialButtonToggleGroup.findViewById(2131297594)).setMaxLines(3);
      ((Button)materialButtonToggleGroup.findViewById(2131297593)).setMaxLines(3);
      rangeSlider.a(new iu1((ju1)ms0));
      materialButtonToggleGroup.f(new dq0((View.OnClickListener)ms0, 1));
      radioGroup.setOnCheckedChangeListener(new hp0(ms0, 2));
      checkBox.setOnCheckedChangeListener(new fz(4, ms0));
      circleView.setBackgroundColor(m92.h[3]);
      ms0.A = (rs0)ms0;
      i = 0;
      j = context.getSharedPreferences("PP", 0).getInt("k_si_acc", 0);
      while (true) {
        int[] arrayOfInt = m92.m;
        if (i < 24) {
          if (j == arrayOfInt[i]) {
            ((ju1)ms0).N0 = i;
            break;
          } 
          i++;
          continue;
        } 
        break;
      } 
      ms0.p();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */