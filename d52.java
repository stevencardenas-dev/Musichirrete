import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.insets.ProtectionLayout;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.WelcomeActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class d52 extends ua0 implements View.OnClickListener {
  public SmartTextView a0;
  
  public TextView b0;
  
  public TextView c0;
  
  public SmartImageView d0;
  
  public WelcomeActivity e0;
  
  public CharSequence f0 = null;
  
  public TextView g0;
  
  public final void D0() {
    String[] arrayOfString;
    System.currentTimeMillis();
    if (Build.VERSION.SDK_INT >= 33) {
      arrayOfString = new String[1];
      arrayOfString[0] = "android.permission.READ_MEDIA_AUDIO";
    } else {
      arrayOfString = new String[2];
      arrayOfString[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
      arrayOfString[1] = "android.permission.READ_EXTERNAL_STORAGE";
    } 
    WelcomeActivity welcomeActivity = this.e0;
    CharSequence charSequence = this.f0;
    welcomeActivity.getClass();
    ((pc)welcomeActivity).J = System.currentTimeMillis();
    ((pc)welcomeActivity).K = charSequence;
    ((pc)welcomeActivity).L = 100;
    ((pc)welcomeActivity).M = arrayOfString;
    welcomeActivity.requestPermissions(arrayOfString, 100);
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.e0 = (WelcomeActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131493002, paramViewGroup, false);
    g92.c(view.findViewById(2131297555), true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)view.findViewById(2131296941);
    hn hn = new hn(2, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    this.a0 = (SmartTextView)view.findViewById(2131296398);
    this.b0 = (TextView)view.findViewById(2131297822);
    this.g0 = (TextView)view.findViewById(2131297501);
    this.d0 = (SmartImageView)view.findViewById(2131297492);
    this.c0 = (TextView)view.findViewById(2131297502);
    this.a0.setOnClickListener(this);
    return view;
  }
  
  public final void j0() {
    this.e0 = null;
    this.I = true;
  }
  
  public final void m0() {
    int i = 1;
    boolean bool = true;
    this.I = true;
    if (Build.VERSION.SDK_INT >= 33) {
      Drawable drawable;
      Exception exception;
      try {
        PackageManager packageManager = MyApplication.i.getApplicationContext().getPackageManager();
        PermissionGroupInfo permissionGroupInfo = packageManager.getPermissionGroupInfo("android.permission-group.READ_MEDIA_AURAL", 0);
      } finally {
        exception = null;
        drawable = null;
        exception.printStackTrace();
      } 
      CharSequence charSequence = this.f0;
      if (charSequence != null) {
        this.g0.setText((CharSequence)Html.fromHtml(U(2131887076, new Object[] { charSequence })));
        this.a0.setText((CharSequence)Html.fromHtml(U(2131887600, new Object[] { this.f0 })));
      } 
      if (drawable != null) {
        drawable = ag0.C0(m92.h[5], drawable.mutate());
        this.d0.setImageDrawable(drawable);
      } 
      if (exception != null)
        this.a0.setCompoundDrawables(exception.mutate(), null, null, null); 
      this.c0.setVisibility(8);
      if (n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_MEDIA_AUDIO") != 0)
        i = 0; 
    } else {
      this.g0.setText((CharSequence)Html.fromHtml(T(2131887458)));
      this.a0.setText(2131886821);
      try {
        PackageManager packageManager = MyApplication.i.getApplicationContext().getPackageManager();
        this.f0 = packageManager.getPermissionGroupInfo("android.permission-group.STORAGE", 0).loadLabel(packageManager);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        nameNotFoundException.printStackTrace();
      } 
      int j = n21.p(MyApplication.i.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
      i = n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE");
      if (j != 0 || i != 0)
        bool = false; 
      i = bool;
      if (!bool) {
        i = bool;
        if (j == 0) {
          D0();
          i = bool;
        } 
      } 
    } 
    SmartTextView smartTextView = this.a0;
    if (i != 0) {
      smartTextView.setVisibility(8);
      this.b0.setVisibility(0);
    } else {
      smartTextView.setVisibility(0);
      this.b0.setVisibility(8);
    } 
    System.currentTimeMillis();
  }
  
  public final void onClick(View paramView) {
    D0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */