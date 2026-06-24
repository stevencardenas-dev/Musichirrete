import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.io.FileOutputStream;
import java.util.Date;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class dz implements DialogInterface.OnCancelListener, DialogInterface.OnShowListener, DialogInterface.OnDismissListener, CompoundButton.OnCheckedChangeListener {
  public Bitmap b;
  
  public Bitmap c;
  
  public Bitmap e;
  
  public final Context f;
  
  public final ImageView g;
  
  public final ProgressBar h;
  
  public final CheckBox i;
  
  public cz j;
  
  public final Handler k;
  
  public u00 l;
  
  public final int m;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public ss0 p;
  
  public final Rect q;
  
  public final Rect r;
  
  public final float s;
  
  public dz(Context paramContext, Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt, Rect paramRect1, Rect paramRect2, float paramFloat) {
    ms0 ms0 = new ms0(paramContext);
    this.f = paramContext.getApplicationContext();
    this.b = paramBitmap1;
    this.e = paramBitmap2;
    this.m = paramInt;
    this.q = paramRect1;
    this.r = paramRect2;
    this.s = paramFloat;
    this.k = new Handler(Looper.getMainLooper());
    View view = LayoutInflater.from(paramContext).inflate(2131492975, null);
    this.g = (ImageView)view.findViewById(2131296885);
    this.h = (ProgressBar)view.findViewById(2131297315);
    CheckBox checkBox = (CheckBox)view.findViewById(2131296537);
    this.i = checkBox;
    ms0.X = this;
    ms0.Y = this;
    ms0.W = this;
    checkBox.setOnCheckedChangeListener(this);
    ms0.f(view, false);
    ms0.l(2131886278);
    ms0.n(2131887363);
    ms0.D = new f(7, this);
    this.p = new ss0(ms0);
  }
  
  public final void a() {
    this.i.setEnabled(false);
    this.g.setVisibility(4);
    this.h.setVisibility(0);
    cz cz1 = this.j;
    if (cz1 != null && cz1 != null) {
      cz1.b = true;
      this.j = null;
    } 
    cz1 = new cz(this);
    this.j = cz1;
    cz1.start();
  }
  
  public final void b() {
    ImageView imageView = this.g;
    if (imageView != null)
      imageView.setImageBitmap(null); 
    Bitmap bitmap = this.b;
    if (bitmap != null) {
      bitmap.recycle();
      this.b = null;
    } 
    bitmap = this.c;
    if (bitmap != null) {
      bitmap.recycle();
      this.c = null;
    } 
    bitmap = this.e;
    if (bitmap != null) {
      bitmap.recycle();
      this.e = null;
    } 
  }
  
  public final void c() {
    FileOutputStream fileOutputStream;
    Context context = this.f;
    String str = x41.w("Screen_Musicolet_", DateFormat.format("yyyy-MM-dd_hh-mm-ss", new Date()).toString(), nFLlOYeP.jgFtkErVBW);
    if (MyApplication.F.p()) {
      v00 v00 = ag0.I().A(str);
      this.l = v00;
      v00.p();
      fileOutputStream = ws2.o(this.l);
    } else {
      ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
      String str1 = x41.n(new StringBuilder(), Environment.DIRECTORY_PICTURES, JkpGFvCVQHzgc.MBycJWBUYvb);
      ContentValues contentValues = new ContentValues(4);
      contentValues.put("_display_name", str);
      contentValues.put("relative_path", str1);
      contentValues.put("mime_type", "image/jpeg");
      Uri uri1 = contentResolver.insert(uri2, contentValues);
      fileOutputStream = new t70(contentResolver.openFileDescriptor(uri1, "wt"));
      this.l = new c91(MyApplication.i.getApplicationContext(), uri1);
    } 
    this.c.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
    fileOutputStream.flush();
    fileOutputStream.close();
    if (this.l.l()) {
      Intent intent;
      str = null;
      try {
        u00 u001 = this.l;
        if (u001 instanceof cd1) {
          String str4 = MyApplication.F.g((v00)u001);
          if (str4 != null)
            MediaScannerConnection.scanFile(context, new String[] { str4 }, null, null); 
        } 
      } finally {
        fileOutputStream = null;
      } 
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null && musicActivity.j0 != null) {
        str3 = (String)MusicService.y();
      } else {
        str3 = null;
      } 
      String str2 = str;
      if (str3 != null) {
        qn1 qn1 = ((km0)str3).c;
        str3 = qn1.b;
        String str4 = qn1.e;
        str2 = str;
        if (str3 != null) {
          str2 = str;
          if (str3.trim().length() > 0) {
            String str5 = nBRIsU.wuERvrzBWcfy;
            str2 = str;
            if (!str3.equals(str5)) {
              str2 = str;
              if (str4.trim().length() > 0) {
                str2 = str;
                if (!str4.equals(str5))
                  str2 = context.getString(2131886958, new Object[] { ag0.E(str3), ag0.E(str4) }); 
              } 
            } 
          } 
        } 
      } 
      intent.putExtra("android.intent.extra.STREAM", (Parcelable)zo2.s(context, this.l));
      intent.addFlags(1);
      String str3 = str2;
      if (str2 == null)
        str3 = context.getString(2131886959); 
      StringBuilder stringBuilder = ga1.l(str3, "\n\n");
      stringBuilder.append(context.getString(2131886631, new Object[] { "Musicolet" }));
      String str1 = stringBuilder.toString().concat(" krosbits.in/musicolet");
      intent.putExtra(RqlokDsQOju.UcDxPE, str1).addFlags(268435456);
      intent.setType("image/*");
      context.startActivity(Intent.createChooser(intent, "Share screenshot via...").addFlags(268435456));
      ag0.i(str1);
      Toast.makeText(context, 2131886289, 1).show();
    } 
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    cz cz1 = this.j;
    if (cz1 != null) {
      cz1.b = true;
      this.j = null;
    } 
    b();
    this.p = null;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    a();
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    cz cz1 = this.j;
    if (cz1 != null) {
      cz1.b = true;
      this.j = null;
    } 
    b();
    this.p = null;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    a();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */