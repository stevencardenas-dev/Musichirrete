import android.app.Presentation;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.f;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import in.krosbits.musicolet.MyApplication;

public final class tz0 extends Presentation implements DialogInterface.OnShowListener {
  public rv1 b;
  
  public final bs c;
  
  public final Handler e = new Handler(Looper.getMainLooper());
  
  public final e3 f = new e3(23, this);
  
  public final sz0 g = new sz0(this);
  
  public long h = 0L;
  
  public tz0(Context paramContext, Display paramDisplay) {
    super(paramContext, paramDisplay);
    bs bs1 = new bs(getContext(), 2131951631);
    this.c = bs1;
    m92.s(bs1.getTheme());
    bs1.getTheme().applyStyle(2131953009, true);
    setOnShowListener(this);
    Window window = getWindow();
    if (window != null)
      window.addFlags(4718593); 
  }
  
  public final void a() {
    ConstraintLayout constraintLayout;
    View view = LayoutInflater.from((Context)this.c).inflate(2131493200, null, false);
    int i = 2131296837;
    ImageView imageView = (ImageView)ws2.C(view, 2131296837);
    if (imageView != null) {
      i = 2131296874;
      ImageView imageView1 = (ImageView)ws2.C(view, 2131296874);
      if (imageView1 != null) {
        i = 2131296913;
        ImageView imageView2 = (ImageView)ws2.C(view, 2131296913);
        if (imageView2 != null) {
          i = 2131296937;
          LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)ws2.C(view, 2131296937);
          if (linearProgressIndicator != null) {
            i = 2131297685;
            TextView textView = (TextView)ws2.C(view, 2131297685);
            if (textView != null) {
              i = 2131297692;
              TextView textView1 = (TextView)ws2.C(view, 2131297692);
              if (textView1 != null) {
                i = 2131297890;
                TextView textView2 = (TextView)ws2.C(view, 2131297890);
                if (textView2 != null) {
                  constraintLayout = (ConstraintLayout)view;
                  Object object = new Object();
                  ((rv1)object).b = imageView;
                  ((rv1)object).c = imageView1;
                  ((rv1)object).f = imageView2;
                  ((rv1)object).g = linearProgressIndicator;
                  ((rv1)object).e = textView;
                  ((rv1)object).h = textView1;
                  ((rv1)object).i = textView2;
                  this.b = (rv1)object;
                  setContentView((View)constraintLayout);
                  b(this.b);
                  c(this.b);
                  return;
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i)));
  }
  
  public final void b(rv1 paramrv1) {
    if (paramrv1 != null)
      try {
        ImageView imageView = (ImageView)paramrv1.f;
        TextView textView2 = (TextView)paramrv1.e;
        TextView textView1 = (TextView)paramrv1.h;
        MediaMetadata mediaMetadata = ((f)((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).c).a.getMetadata();
        if (mediaMetadata != null) {
        
        } else {
        
        } 
        boolean bool = MyApplication.o().getBoolean("k_b_npsctx", true);
        try {
          String str1 = mediaMetadata.j("android.media.metadata.TITLE");
          String str3 = mediaMetadata.j("android.media.metadata.ARTIST");
          String str2 = mediaMetadata.j("android.media.metadata.ALBUM");
          long l = mediaMetadata.f("musicolet.metadata.RID");
          this.h = mediaMetadata.f("android.media.metadata.DURATION");
          ((TextView)paramrv1.i).setText(str1);
          textView1.setText(str3);
          textView2.setText(str2);
          km0 km0 = MyApplication.j.c.a((int)l);
          ag1 ag12 = MyApplication.v.f(p3.l(km0));
          ag12.d = true;
          ag12.c = true;
          ag12.f(imageView);
          ag1 ag11 = MyApplication.v.f(p3.l(km0));
          ag11.d = true;
          ag11.a();
          ag11.c = true;
          ag11.f((ImageView)paramrv1.b);
          textView1.setVisibility(0);
          textView2.setVisibility(0);
          ((ImageView)paramrv1.c).setVisibility(0);
          imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } finally {
          mediaMetadata = null;
          if (!(mediaMetadata instanceof AssertionError))
            mediaMetadata.printStackTrace(); 
          this.h = 0L;
          ((TextView)paramrv1.i).setText(2131886189);
          ImageView imageView1 = (ImageView)paramrv1.b;
          ColorDrawable colorDrawable = new ColorDrawable();
          this(-16777216);
          imageView1.setImageDrawable((Drawable)colorDrawable);
          ((ImageView)paramrv1.f).setImageResource(2131231576);
          ((ImageView)paramrv1.f).setScaleType(ImageView.ScaleType.CENTER);
          ((TextView)paramrv1.h).setVisibility(8);
          ((TextView)paramrv1.e).setVisibility(8);
        } 
        ((TextView)paramrv1.i).setSelected(bool);
        ((TextView)paramrv1.h).setSelected(bool);
      } finally {
        paramrv1 = null;
      }  
  }
  
  public final void c(rv1 paramrv1) {
    Handler handler = this.e;
    e3 e31 = this.f;
    handler.removeCallbacks(e31);
    if (paramrv1 != null) {
      LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)paramrv1.g;
      PlaybackStateCompat playbackStateCompat = ((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).k();
      if (playbackStateCompat != null) {
        boolean bool;
        long l1 = playbackStateCompat.c;
        if (playbackStateCompat.b == 3) {
          bool = true;
        } else {
          bool = false;
        } 
        long l2 = this.h;
        if (l2 > 0L && l1 >= 0L && l1 <= l2) {
          int i = (int)l2;
        } else {
          linearProgressIndicator.setVisibility(8);
        } 
        if (bool)
          handler.postDelayed(e31, 1000L); 
      } 
    } 
  }
  
  public final void onDisplayChanged() {
    super.onDisplayChanged();
    a();
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    Window window = getWindow();
    if (window != null)
      window.addFlags(4718593); 
  }
  
  public final void onStart() {
    super.onStart();
    ((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).w(this.g);
  }
  
  public final void onStop() {
    super.onStop();
    ((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).F(this.g);
    this.e.removeCallbacks(this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */