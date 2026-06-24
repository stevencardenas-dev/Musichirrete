package in.krosbits.musicolet;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import c80;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import g92;
import hn;
import in.krosbits.android.widgets.SmartTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import jn;
import m92;
import n0;
import pc;
import qo;

public class FixCcOptimizeActivity extends pc {
  public static final int f0 = 0;
  
  public TextView R;
  
  public SmartTextView S;
  
  public SmartTextView T;
  
  public ImageView U;
  
  public ImageView V;
  
  public MaterialButton W;
  
  public MaterialButton X;
  
  public MaterialCardView Y;
  
  public MaterialCardView Z;
  
  public MaterialCheckBox a0;
  
  public boolean b0 = false;
  
  public boolean c0 = false;
  
  public boolean d0 = false;
  
  public String e0 = "";
  
  public final void l0() {
    float f1;
    float f2;
    byte b1;
    byte b2;
    byte b3;
    byte b4;
    int i;
    byte b5;
    int j;
    byte b6;
    boolean bool1;
    View.OnClickListener onClickListener;
    boolean bool = this.b0;
    c80 c80 = null;
    if (bool) {
      if (this.c0 && this.d0) {
        b2 = 0;
        b3 = 8;
        b1 = 8;
      } else {
        onClickListener = (View.OnClickListener)new StringBuilder(getString(2131886623));
        onClickListener.append(" ");
        onClickListener.append(getString(2131886342));
        onClickListener.append("<br/><br/><b>");
        onClickListener.append(getString(2131887412));
        onClickListener.append(":</b><br/>");
        onClickListener.append(getString(2131886461));
        this.R.setText((CharSequence)Html.fromHtml(onClickListener.toString()));
        b3 = 0;
        b1 = 0;
        b2 = 8;
      } 
      bool1 = this.c0;
      bool = true;
      f2 = 1.0F;
      if (bool1) {
        onClickListener = null;
        b5 = 0;
        bool1 = false;
        f1 = 0.3F;
        i = 2130968945;
      } else {
        onClickListener = (View.OnClickListener)new c80(this, 0);
        i = 2130968894;
        bool1 = true;
        f1 = 1.0F;
        b5 = 8;
      } 
      if (this.d0) {
        c80 = null;
        b4 = 0;
        bool = false;
        f2 = 0.3F;
        j = 2130968945;
      } else {
        c80 = new c80(this, 1);
        j = 2130968894;
        b4 = 8;
      } 
      PackageManager packageManager = MyApplication.i.getApplicationContext().getPackageManager();
      try {
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo("in.krosbits.castplugin", 0);
        this.e0 = applicationInfo.loadLabel(packageManager).toString();
        SmartTextView smartTextView = this.T;
        StringBuilder stringBuilder = new StringBuilder();
        this("(2)\n");
        stringBuilder.append(this.e0);
        smartTextView.setText(stringBuilder.toString());
        Drawable drawable = applicationInfo.loadIcon(packageManager);
        this.T.setCompoundDrawables(null, drawable, null, null);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        nameNotFoundException.printStackTrace();
        finish();
      } 
      try {
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(getPackageName(), 0);
        this.S.setText("(1)\nMusicolet");
        Drawable drawable = applicationInfo.loadIcon(packageManager);
        this.S.setCompoundDrawables(null, drawable, null, null);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        nameNotFoundException.printStackTrace();
        finish();
      } 
      b6 = i;
      i = j;
      j = b6;
    } else {
      try {
        Intent intent = new Intent();
        this();
        startActivityForResult(intent.setClassName("in.krosbits.castplugin", "in.krosbits.castplugin.bocActivity"), 10402);
      } catch (ActivityNotFoundException activityNotFoundException) {
        activityNotFoundException.printStackTrace();
        finish();
      } 
      f1 = 0.0F;
      onClickListener = null;
      f2 = 0.0F;
      i = 2130968945;
      b3 = 8;
      b5 = 8;
      j = 2130968945;
      bool1 = false;
      b2 = 8;
      b1 = 8;
      b4 = 8;
      bool = false;
    } 
    MaterialCheckBox materialCheckBox = this.a0;
    if (MyApplication.x().getBoolean("s_ccbtroptgdsw", false)) {
      b6 = b1;
    } else {
      b6 = 8;
    } 
    materialCheckBox.setVisibility(b6);
    this.Y.setEnabled(bool1);
    this.Z.setEnabled(bool);
    this.Y.setCardBackgroundColor(m92.y(this, j));
    this.Z.setCardBackgroundColor(m92.y(this, i));
    this.R.setVisibility(b3);
    this.S.setAlpha(f1);
    this.T.setAlpha(f2);
    this.U.setVisibility(b5);
    this.V.setVisibility(b4);
    this.W.setVisibility(b2);
    this.X.setVisibility(b1);
    this.Z.setOnClickListener((View.OnClickListener)c80);
    this.Y.setOnClickListener(onClickListener);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10402)
      if (paramInt2 == -1 && paramIntent != null) {
        this.d0 = paramIntent.getBooleanExtra("ecpiibo", true);
        this.c0 = n0.r();
        this.b0 = true;
        l0();
      } else {
        finish();
      }  
    if (paramInt1 == 10401)
      recreate(); 
  }
  
  public final void onCreate(Bundle paramBundle) {
    byte b = 0;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    setContentView(2131492898);
    g92.c(findViewById(2131297555), true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)findViewById(2131296941);
    int i = jn.i(m92.h[2], 178);
    hn hn1 = new hn(2, i);
    hn hn2 = new hn(8, i);
    ArrayList<Object> arrayList = new ArrayList(2);
    while (b < 2) {
      (new Object[2])[0] = hn1;
      (new Object[2])[1] = hn2;
      Object object = (new Object[2])[b];
      Objects.requireNonNull(object);
      arrayList.add(object);
      b++;
    } 
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    this.Y = (MaterialCardView)findViewById(2131296626);
    this.Z = (MaterialCardView)findViewById(2131296628);
    this.R = (TextView)findViewById(2131297714);
    this.S = (SmartTextView)findViewById(2131297691);
    this.T = (SmartTextView)findViewById(2131297707);
    this.U = (ImageView)findViewById(2131296840);
    this.V = (ImageView)findViewById(2131296841);
    this.W = (MaterialButton)findViewById(2131296384);
    this.X = (MaterialButton)findViewById(2131296376);
    this.a0 = (MaterialCheckBox)findViewById(2131296531);
    this.W.setOnClickListener((View.OnClickListener)new c80(this, 2));
    this.X.setOnClickListener((View.OnClickListener)new c80(this, 3));
    l0();
  }
  
  public final void onDestroy() {
    super.onDestroy();
    if (!h0()) {
      if (this.a0.getVisibility() == 8) {
        MyApplication.x().edit().putBoolean("s_ccbtroptgdsw", true).apply();
        return;
      } 
      if (this.a0.isChecked())
        MyApplication.x().edit().putBoolean(FgdLmmRfTxSFKI.wXfz, true).apply(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\FixCcOptimizeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */