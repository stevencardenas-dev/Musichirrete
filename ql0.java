import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;

public final class ql0 extends ms0 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {
  public final ArrayList B0 = z51.k();
  
  public ss0 C0;
  
  public Locale D0;
  
  public DialogInterface E0;
  
  public final ko1 F0 = dd1.q0(MyApplication.i.getApplicationContext());
  
  public final int G0 = (int)(MyApplication.p * 12.0F);
  
  public final ol0 H0 = new ol0(this);
  
  public int I0 = -1;
  
  public Locale J0;
  
  public ql0(Context paramContext) {
    super(paramContext);
    WeakReference weakReference = dd1.l;
    if (weakReference != null)
      weakReference.clear(); 
    dd1.l = null;
    q(2131886354);
    a3 a3 = new a3(8, this);
    this.U = a3;
    a(a3, (LinearLayoutManager2)new LinearLayoutManager(1));
    this.P = false;
    this.Y = this;
    this.W = this;
    k(2131886278);
    this.B = new m60(18);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.D0 = null;
    ss0 ss01 = this.C0;
    if (ss01 != null)
      ss01.setOnDismissListener(null); 
    int i = this.I0;
    ko1 ko11 = this.F0;
    if (i != -1)
      ko11.f(i); 
    ko11.a(this.H0);
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.E0 = paramDialogInterface;
    Locale locale = this.J0;
    if (locale != null)
      s(locale); 
  }
  
  public final void r(Locale paramLocale, boolean paramBoolean) {
    DialogInterface dialogInterface;
    StringBuilder stringBuilder = new StringBuilder("LPD>sl:");
    stringBuilder.append(paramLocale);
    n21.F(stringBuilder.toString());
    Context context = this.b;
    String str = context.getSharedPreferences("PP", 0).getString("k_s_lng", null);
    if (this.J0 == null && !TextUtils.isEmpty(str) && z51.i(str).equals(paramLocale)) {
      dialogInterface = this.E0;
      if (dialogInterface != null) {
        dialogInterface.dismiss();
        return;
      } 
    } else {
      z51.n();
      SharedPreferences sharedPreferences = context.getSharedPreferences("PP", 0);
      str = sharedPreferences.getString("k_s_lng", null);
      String str2 = dialogInterface.getLanguage();
      String str1 = dialogInterface.getCountry();
      String str3 = dialogInterface.getVariant();
      str2 = (new JSONArray()).put(str2).put(str1).put(str3).toString();
      DialogInterface dialogInterface1 = this.E0;
      if (dialogInterface1 != null)
        dialogInterface1.dismiss(); 
      if (this.J0 != null || TextUtils.isEmpty(str) || !str.equals(str2)) {
        sharedPreferences.edit().putString("k_s_lng", str2).apply();
        z51.A(MyApplication.i.getApplicationContext());
        try {
          if (MyApplication.k() && MyApplication.j.c != null) {
            im0 im0 = new im0();
            this(false, false, true);
            im0.N = true;
            im0.w(im0);
          } 
        } finally {
          sharedPreferences = null;
        } 
      } 
    } 
  }
  
  public final void s(Locale paramLocale) {
    BitmapDrawable bitmapDrawable;
    if (dd1.P(MyApplication.i.getApplicationContext(), paramLocale)) {
      r(paramLocale, true);
      return;
    } 
    ss0 ss01 = this.C0;
    if (ss01 != null && ss01.isShowing())
      this.C0.dismiss(); 
    ss0 ss02 = null;
    ss01 = ss02;
    try {
      PackageManager packageManager = MyApplication.i.getApplicationContext().getPackageManager();
      ss01 = ss02;
      Drawable drawable2 = packageManager.getApplicationInfo("com.android.vending", 0).loadIcon(packageManager).mutate();
      Drawable drawable1 = drawable2;
      int i = (int)(MyApplication.p * 40.0F);
      drawable1 = drawable2;
      Bitmap bitmap = ag0.v(drawable2, i, i);
      drawable1 = drawable2;
      BitmapDrawable bitmapDrawable1 = new BitmapDrawable();
      drawable1 = drawable2;
      this(MyApplication.i.getApplicationContext().getResources(), bitmap);
      bitmapDrawable = bitmapDrawable1;
    } finally {}
    ms0 ms01 = new ms0(this.b);
    ms01.f = paramLocale.getDisplayName(paramLocale);
    ms01.S = (Drawable)bitmapDrawable;
    ms01.o(0, true);
    ms01.t0 = true;
    ms01.d("Getting language info");
    ms01.W = this;
    ms01.J = false;
    ms01.K = false;
    ms01.q = "Cancel";
    this.C0 = ms01.p();
    this.D0 = paramLocale;
    ol0 ol01 = this.H0;
    ko1 ko11 = this.F0;
    ko11.h(ol01);
    v90 v90 = new v90(1);
    v90.c.add(paramLocale);
    ko11.c(new v90(v90)).b(new f(17, this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ql0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */