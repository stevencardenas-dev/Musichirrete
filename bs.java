import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

public final class bs extends ContextWrapper {
  public static Configuration f;
  
  public int a;
  
  public Resources.Theme b;
  
  public LayoutInflater c;
  
  public Configuration d;
  
  public Resources e;
  
  public bs(Context paramContext, int paramInt) {
    super(paramContext);
    this.a = paramInt;
  }
  
  public final void a(Configuration paramConfiguration) {
    if (this.e == null) {
      if (this.d == null) {
        this.d = new Configuration(paramConfiguration);
        return;
      } 
      tp.f("Override configuration has already been set");
      return;
    } 
    tp.f("getResources() or getAssets() has already been called");
  }
  
  public final void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
  }
  
  public final void b() {
    if (this.b == null) {
      this.b = getResources().newTheme();
      Resources.Theme theme = getBaseContext().getTheme();
      if (theme != null)
        this.b.setTo(theme); 
    } 
    this.b.applyStyle(this.a, true);
  }
  
  public final AssetManager getAssets() {
    return getResources().getAssets();
  }
  
  public final Resources getResources() {
    if (this.e == null) {
      Configuration configuration = this.d;
      if (configuration != null) {
        if (Build.VERSION.SDK_INT >= 26) {
          if (f == null) {
            Configuration configuration1 = new Configuration();
            configuration1.fontScale = 0.0F;
            f = configuration1;
          } 
          if (configuration.equals(f)) {
            this.e = super.getResources();
            return this.e;
          } 
        } 
        this.e = createConfigurationContext(this.d).getResources();
        return this.e;
      } 
    } else {
      return this.e;
    } 
    this.e = super.getResources();
    return this.e;
  }
  
  public final Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext((Context)this); 
      return this.c;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public final Resources.Theme getTheme() {
    Resources.Theme theme = this.b;
    if (theme != null)
      return theme; 
    if (this.a == 0)
      this.a = 2131952322; 
    b();
    return this.b;
  }
  
  public final void setTheme(int paramInt) {
    if (this.a != paramInt) {
      this.a = paramInt;
      b();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */