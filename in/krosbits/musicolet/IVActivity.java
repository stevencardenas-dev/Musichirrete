package in.krosbits.musicolet;

import ag0;
import ag1;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import in.krosbits.musicolet.providers.AAProvider;
import io1;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import km0;
import m92;
import p3;
import q61;
import t70;
import u00;
import uk.co.senab.photoview.PhotoView;
import v00;
import v61;
import ws2;
import z51;

public class IVActivity extends Activity implements View.OnClickListener, q61 {
  public PhotoView b;
  
  public int c;
  
  public View e;
  
  public final void a(Context paramContext) {
    paramContext = z51.A(paramContext);
    Locale locale = (paramContext.getResources().getConfiguration()).locale;
    super.attachBaseContext(paramContext);
    if (!(getResources().getConfiguration()).locale.equals(locale))
      z51.h(getResources(), locale); 
    io1.a(this);
    if (!(getResources().getConfiguration()).locale.equals(locale))
      z51.h(getResources(), locale); 
  }
  
  public final void attachBaseContext(Context paramContext) {
    a(z51.A(paramContext));
  }
  
  public final void b(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    z51.A((Context)this);
  }
  
  public void onClick(View paramView) {
    try {
      km0 km0 = MyApplication.j.c.a(this.c);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    if (exception != null) {
      float f = getResources().getDimension(2131165390);
      Context context = getApplicationContext();
      int j = (int)((getResources().getConfiguration()).screenWidthDp * f);
      int i = (int)((getResources().getConfiguration()).screenHeightDp * f);
      int k = m92.k;
      HashMap hashMap = p3.a;
      Bitmap bitmap = p3.g(context, exception.d(), j, i, k, true);
      String str1 = ag0.J(((km0)exception).g);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(".jpg");
      String str2 = stringBuilder.toString();
      try {
        FileOutputStream fileOutputStream;
        t70 t70;
        Uri uri;
        if (MyApplication.F.p()) {
          v00 v00 = ag0.I().A(str2);
          v00.p();
          fileOutputStream = ws2.o((u00)v00);
          i = 0;
        } else {
          ContentResolver contentResolver = getContentResolver();
          uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append(Environment.DIRECTORY_PICTURES);
          stringBuilder1.append("/Musicolet/");
          String str = stringBuilder1.toString();
          ContentValues contentValues = new ContentValues();
          this(4);
          contentValues.put("title", (String)fileOutputStream);
          contentValues.put("_display_name", str2);
          contentValues.put("relative_path", str);
          contentValues.put("mime_type", "image/jpeg");
          t70 = new t70(contentResolver.openFileDescriptor(contentResolver.insert(uri, contentValues), "wt"));
          i = 1;
          uri = null;
        } 
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)t70);
        t70.flush();
        t70.close();
      } finally {
        str1 = null;
      } 
    } 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    b(paramConfiguration);
    z51.A((Context)this);
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131492901);
    PhotoView photoView = (PhotoView)findViewById(2131296913);
    this.b = photoView;
    photoView.setOnPhotoTapListener(this);
    int i = getIntent().getIntExtra("rid", 0);
    this.c = i;
    v61 v61 = MyApplication.v;
    HashMap hashMap = p3.a;
    ag1 ag1 = v61.f(AAProvider.c(i, m92.k, true));
    ag1.g(new int[] { 2 });
    ag1.d = true;
    ag1.b();
    ag1.f((ImageView)this.b);
    View view = findViewById(2131297857);
    this.e = view;
    view.setOnClickListener(this);
    this.e.setBackground((Drawable)ag0.U((Context)this, Color.argb(255, 255, 255, 255), Color.argb(130, 0, 0, 0)));
  }
  
  public final void onStart() {
    super.onStart();
    MyApplication.s++;
    setTaskDescription(new ActivityManager.TaskDescription(null, null, m92.h[0]));
  }
  
  public final void onStop() {
    super.onStop();
    int i = MyApplication.s - 1;
    MyApplication.s = i;
    if (i == 0)
      MyApplication.f(); 
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\IVActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */