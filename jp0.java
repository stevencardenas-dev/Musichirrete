import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.musicolet.LockScreenReceiver;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SetLcWallActivity;
import in.krosbits.musicolet.SettingsActivity;

public final class jp0 extends ms0 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
  public SwitchCompat B0;
  
  public LinearLayout C0;
  
  public RadioGroup D0;
  
  public CheckBox E0;
  
  public CheckBox F0;
  
  public CheckBox G0;
  
  public CheckBox H0;
  
  public CheckBox I0;
  
  public CheckBox J0;
  
  public CheckBox K0;
  
  public CheckBox L0;
  
  public CheckBox M0;
  
  public SharedPreferences N0;
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    StringBuilder stringBuilder;
    ms0 ms01;
    String str;
    CheckBox checkBox = this.K0;
    SharedPreferences sharedPreferences = this.N0;
    SwitchCompat switchCompat = this.B0;
    if (paramCompoundButton == switchCompat) {
      String str1;
      Context context = this.b;
      if (paramBoolean && Build.VERSION.SDK_INT >= 33 && MyApplication.i.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
        if (context instanceof pc) {
          switchCompat.setChecked(false);
          pc pc = (pc)context;
          str1 = context.getString(2131886964);
          pc.j0(new String[] { "android.permission.POST_NOTIFICATIONS" }, str1, "android.permission-group.NOTIFICATIONS", 10114);
          return;
        } 
      } else if (paramBoolean && Build.VERSION.SDK_INT >= 34 && !(new z21(MyApplication.i.getApplicationContext())).a()) {
        if (str1 instanceof SettingsActivity) {
          SettingsActivity settingsActivity = (SettingsActivity)str1;
          try {
            switchCompat.setChecked(false);
            str = str1.getString(2131886621);
            String str2 = str1.getString(2131886964);
            Drawable drawable = str1.getDrawable(2131231148);
            ip0 ip0 = new ip0();
            return;
          } finally {
            str1 = null;
            str1.printStackTrace();
          } 
        } 
      } else {
        if (qz1.G() && paramBoolean && !MyApplication.x().getBoolean("miuilsp", false)) {
          ms01 = new ms0((Context)str1);
          stringBuilder = new StringBuilder();
          stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131887529));
          stringBuilder.append("\n\n");
          stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131886833));
          ms01.d(stringBuilder.toString());
          ms01.J = false;
          ms01.K = false;
          ms01.n(2131886635);
          ms01.D = new f(19, this);
          ms01.k(2131886278);
          ms01.p();
          return;
        } 
        ms01.edit().putBoolean("B_MLCKSN", paramBoolean).apply();
        r();
        return;
      } 
    } else {
      if (stringBuilder == this.F0) {
        ms01.edit().putBoolean("k_b_scpqls", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.E0) {
        ms01.edit().putBoolean("k_b_gcls2", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.H0) {
        ms01.edit().putBoolean("k_b_slsiulc", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.G0) {
        ms01.edit().putBoolean("k_dslipfmtm", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.I0) {
        ms01.edit().putBoolean("k_b_ulcsyslc", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == str) {
        ms01.edit().putBoolean("k_b_aoslsl", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.J0) {
        ms01.edit().putBoolean("k_b_aoslsa", paramBoolean).apply();
        if (paramBoolean) {
          str.setChecked(true);
          str.setEnabled(false);
          return;
        } 
        str.setChecked(ms01.getBoolean("k_b_aoslsl", true));
        str.setEnabled(true);
        return;
      } 
      if (stringBuilder == this.M0) {
        ms01.edit().putBoolean("k_b_lcshadpliocl", paramBoolean).apply();
        return;
      } 
      if (stringBuilder == this.L0)
        ms01.edit().putBoolean("k_b_lcffrw", paramBoolean).apply(); 
    } 
  }
  
  public final void onClick(View paramView) {
    if (paramView.getId() == 2131296456)
      MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), SetLcWallActivity.class)).addFlags(268435456)); 
  }
  
  public final void r() {
    CheckBox checkBox2 = this.K0;
    CheckBox checkBox1 = this.I0;
    RadioGroup radioGroup = this.D0;
    SharedPreferences sharedPreferences = this.N0;
    boolean bool3 = sharedPreferences.getBoolean("B_MLCKSN", false);
    this.B0.setChecked(bool3);
    int i = sharedPreferences.getInt("I_LSNBG", 0);
    boolean bool2 = true;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
          radioGroup.check(2131297327); 
      } else {
        radioGroup.check(2131297326);
      } 
    } else {
      radioGroup.check(2131297325);
    } 
    this.L0.setChecked(sharedPreferences.getBoolean("k_b_lcffrw", true));
    this.M0.setChecked(sharedPreferences.getBoolean("k_b_lcshadpliocl", true));
    this.E0.setChecked(sharedPreferences.getBoolean(ybWnIKHovcRr.yhCkTKzeZryLT, false));
    this.F0.setChecked(sharedPreferences.getBoolean("k_b_scpqls", true));
    checkBox1.setChecked(sharedPreferences.getBoolean("k_b_ulcsyslc", true));
    this.H0.setChecked(sharedPreferences.getBoolean("k_b_slsiulc", true));
    this.G0.setChecked(sharedPreferences.getBoolean("k_dslipfmtm", true));
    boolean bool4 = sharedPreferences.getBoolean(KjdXPYm.paUAGTOHwfeTcX, false);
    this.J0.setChecked(bool4);
    boolean bool1 = bool2;
    if (!bool4)
      if (sharedPreferences.getBoolean("k_b_aoslsl", true)) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }  
    checkBox2.setChecked(bool1);
    if (bool4)
      checkBox2.setEnabled(false); 
    if (LockScreenReceiver.a.isDeviceSecure()) {
      checkBox1.setChecked(false);
      checkBox1.setEnabled(false);
    } 
    LinearLayout linearLayout = this.C0;
    if (bool3) {
      linearLayout.setVisibility(0);
      return;
    } 
    linearLayout.setVisibility(8);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */