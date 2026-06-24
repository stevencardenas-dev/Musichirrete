import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.material.behavior.SwipeDismissBehavior;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.io.File;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class bh0 implements j41, cs0, cl1, qz, pw0, mm1, uh1, d1 {
  public final int b;
  
  public Object c;
  
  public bh0() {
    this.c = new Bundle();
  }
  
  public bh0(int paramInt1, int paramInt2) {
    this.c = new ip1(new int[paramInt1]);
  }
  
  public bh0(Context paramContext) {
    this.c = new OverScroller(paramContext);
  }
  
  public bh0(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2) {
    if (Build.VERSION.SDK_INT >= 25) {
      this.c = new ci0(paramUri1, paramClipDescription, paramUri2);
    } else {
      this.c = new zv0(paramUri1, paramClipDescription, paramUri2, 8);
    } 
  }
  
  public bh0(MediaMetadataCompat paramMediaMetadataCompat) {
    Bundle bundle = new Bundle(paramMediaMetadataCompat.b);
    this.c = bundle;
    zv0.m(bundle);
  }
  
  public bh0(MediaInfo paramMediaInfo) {
    ut0 ut0 = new ut0(paramMediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0D, null, null);
    if (paramMediaInfo != null) {
      this.c = ut0;
      return;
    } 
    l0.l("media cannot be null.");
    throw null;
  }
  
  public bh0(ir1 paramir1) {
    this.c = paramir1;
  }
  
  public bh0(JSONObject paramJSONObject) {
    this.c = new ut0(paramJSONObject);
  }
  
  public void A(long paramLong, String paramString) {
    b9 b9 = MediaMetadataCompat.f;
    if (!b9.containsKey(paramString) || ((Integer)b9.get(paramString)).intValue() == 0) {
      ((Bundle)this.c).putLong(paramString, paramLong);
      return;
    } 
    l0.l(x41.w("The ", paramString, " key cannot be used to put a long"));
  }
  
  public void B(String paramString, RatingCompat paramRatingCompat) {
    b9 b9 = MediaMetadataCompat.f;
    if (!b9.containsKey(paramString) || ((Integer)b9.get(paramString)).intValue() == 3) {
      Bundle bundle = (Bundle)this.c;
      float f = paramRatingCompat.c;
      if (paramRatingCompat.e == null) {
        boolean bool1;
        boolean bool3 = false;
        boolean bool2 = false;
        if (f >= 0.0F) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        int i = paramRatingCompat.b;
        if (bool1) {
          switch (i) {
            default:
              paramRatingCompat = null;
              break;
            case 6:
              if (i != 6 || f < 0.0F)
                f = -1.0F; 
              paramRatingCompat.e = zc1.h(f);
              object = paramRatingCompat.e;
            case 3:
            case 4:
            case 5:
              if ((i != 3 && i != 4 && i != 5) || f < 0.0F)
                f = -1.0F; 
              ((RatingCompat)object).e = zc1.i(i, f);
              object = ((RatingCompat)object).e;
            case 2:
              if (i == 2 && f == 1.0F)
                bool2 = true; 
              ((RatingCompat)object).e = zc1.j(bool2);
              object = ((RatingCompat)object).e;
            case 1:
              if (i != 1) {
                bool2 = bool3;
              } else {
                bool2 = bool3;
                if (f == 1.0F)
                  bool2 = true; 
              } 
              ((RatingCompat)object).e = zc1.g(bool2);
              object = ((RatingCompat)object).e;
          } 
        } else {
          ((RatingCompat)object).e = zc1.k(i);
          object = ((RatingCompat)object).e;
        } 
        bundle.putParcelable(paramString, (Parcelable)object);
        return;
      } 
    } else {
      l0.l(x41.w("The ", paramString, " key cannot be used to put a Rating"));
      return;
    } 
    Object object = ((RatingCompat)object).e;
  }
  
  public void C(String paramString1, String paramString2) {
    b9 b9 = MediaMetadataCompat.f;
    if (!b9.containsKey(paramString1) || ((Integer)b9.get(paramString1)).intValue() == 1) {
      ((Bundle)this.c).putCharSequence(paramString1, paramString2);
      return;
    } 
    l0.l(x41.w("The ", paramString1, " key cannot be used to put a String"));
  }
  
  public void D(km0 paramkm0, String paramString) {
    try {
      File file = w(paramkm0.b);
      rk0 rk0 = new rk0();
      this();
      return;
    } finally {
      paramkm0 = null;
      paramkm0.printStackTrace();
    } 
  }
  
  public th1 a(String paramString) {
    paramString.getClass();
    return new er1(((ir1)this.c).M());
  }
  
  public boolean b(View paramView) {
    SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior)this.c;
    boolean bool = swipeDismissBehavior.w(paramView);
    int i = 0;
    if (bool) {
      if (paramView.getLayoutDirection() == 1)
        i = 1; 
      int j = swipeDismissBehavior.e;
      if ((j == 0 && i) || (j == 1 && !i)) {
        i = -paramView.getWidth();
      } else {
        i = paramView.getWidth();
      } 
      WeakHashMap weakHashMap = v22.a;
      paramView.offsetLeftAndRight(i);
      paramView.setAlpha(0.0F);
      ee ee = swipeDismissBehavior.b;
      if (ee != null)
        ee.a(paramView); 
      return true;
    } 
    return false;
  }
  
  public boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    b91 b91 = (b91)((n2)this.c).f;
    return (b91 != null) ? b91.onMenuItemClick(paramMenuItem) : false;
  }
  
  public void e(al1 paramal1, int paramInt) {
    oj oj = (oj)paramal1;
    StringBuilder stringBuilder = new StringBuilder("ms_oSE:");
    stringBuilder.append(oj);
    stringBuilder.append(", e=");
    stringBuilder.append(paramInt);
    stringBuilder.append(": ");
    stringBuilder.append(oj.e());
    stringBuilder.append(", ");
    stringBuilder.append(oj.a());
    stringBuilder.append(", ");
    stringBuilder.append(oj.c());
    stringBuilder.append(" ::: ");
    stringBuilder.append(oj.d());
    n21.F(stringBuilder.toString());
    MusicService musicService = (MusicService)this.c;
    if (MusicService.E0 instanceof fl) {
      musicService.j = true;
      musicService.a0(100L);
    } 
  }
  
  public boolean f(float paramFloat) {
    if (paramFloat == 0.0F)
      return false; 
    n();
    ((NestedScrollView)this.c).j((int)paramFloat);
    return true;
  }
  
  public void g(rw0 paramrw0) {}
  
  public float i() {
    return -((NestedScrollView)this.c).getVerticalScrollFactorCompat();
  }
  
  public void j(al1 paramal1, int paramInt) {
    oj oj = (oj)paramal1;
    StringBuilder stringBuilder = new StringBuilder("ms_oSRF:");
    stringBuilder.append(oj);
    stringBuilder.append(", e=");
    stringBuilder.append(paramInt);
    n21.F(stringBuilder.toString());
    try {
      MusicActivity.R0.d0.h1(0);
    } finally {}
  }
  
  public void k(al1 paramal1, boolean paramBoolean) {
    oj oj = (oj)paramal1;
    StringBuilder stringBuilder = new StringBuilder("ms_oSR:");
    stringBuilder.append(oj);
    stringBuilder.append(", ws=");
    stringBuilder.append(paramBoolean);
    n21.F(stringBuilder.toString());
    MusicService musicService = (MusicService)this.c;
    paramBoolean = MusicService.C0;
    musicService.F0();
  }
  
  public void l(al1 paramal1, String paramString) {
    oj oj = (oj)paramal1;
    StringBuilder stringBuilder = new StringBuilder("ms_oSSt:");
    stringBuilder.append(oj);
    stringBuilder.append(", si=");
    stringBuilder.append(paramString);
    n21.F(stringBuilder.toString());
    MusicService musicService = (MusicService)this.c;
    boolean bool = MusicService.C0;
    musicService.F0();
  }
  
  public void n() {
    ((NestedScrollView)this.c).f.abortAnimation();
  }
  
  public ut0 o() {
    ut0 ut0 = (ut0)this.c;
    if (ut0.b != null) {
      if (Double.isNaN(ut0.f) || ut0.f >= 0.0D) {
        if (!Double.isNaN(ut0.g)) {
          if (!Double.isNaN(ut0.h) && ut0.h >= 0.0D)
            return ut0; 
          l0.l("preloadTime cannot be negative or Nan.");
          return null;
        } 
        l0.l("playbackDuration cannot be NaN.");
        return null;
      } 
      l0.l("startTime cannot be negative or NaN.");
      return null;
    } 
    l0.l("media cannot be null.");
    return null;
  }
  
  public void q(cx1 paramcx1, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof l31
    //   4: ifeq -> 43
    //   7: aload_2
    //   8: checkcast l31
    //   11: astore #4
    //   13: aload #4
    //   15: getfield h : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc_w -2147483648
    //   23: iand
    //   24: ifeq -> 43
    //   27: aload #4
    //   29: iload_3
    //   30: ldc_w -2147483648
    //   33: iadd
    //   34: putfield h : I
    //   37: aload #4
    //   39: astore_2
    //   40: goto -> 53
    //   43: new l31
    //   46: dup
    //   47: aload_0
    //   48: aload_2
    //   49: invokespecial <init> : (Lbh0;Lds;)V
    //   52: astore_2
    //   53: aload_2
    //   54: getfield f : Ljava/lang/Object;
    //   57: astore #4
    //   59: aload_2
    //   60: getfield h : I
    //   63: istore_3
    //   64: iload_3
    //   65: ifeq -> 93
    //   68: iload_3
    //   69: iconst_1
    //   70: if_icmpeq -> 80
    //   73: ldc_w 'call to 'resume' before 'invoke' with coroutine'
    //   76: invokestatic f : (Ljava/lang/String;)V
    //   79: return
    //   80: aload #4
    //   82: invokestatic r0 : (Ljava/lang/Object;)V
    //   85: new java/lang/RuntimeException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #4
    //   95: invokestatic r0 : (Ljava/lang/Object;)V
    //   98: aload_0
    //   99: getfield c : Ljava/lang/Object;
    //   102: checkcast ip1
    //   105: astore #4
    //   107: aload_2
    //   108: iconst_1
    //   109: putfield h : I
    //   112: aload #4
    //   114: aload_1
    //   115: aload_2
    //   116: invokevirtual a : (Lx80;Lcs;)Ljava/lang/Object;
    //   119: pop
    //   120: return
  }
  
  public void r(al1 paramal1, int paramInt) {
    paramal1 = paramal1;
    StringBuilder stringBuilder = new StringBuilder("ms_oSSs:");
    stringBuilder.append(paramal1);
    stringBuilder.append(", r=");
    stringBuilder.append(paramInt);
    n21.F(stringBuilder.toString());
  }
  
  public boolean s(int paramInt) {
    return false;
  }
  
  public v00 t(km0 paramkm0) {
    try {
      nk0 nk0 = xk1.c(w(paramkm0.b));
      if (nk0 instanceof rk0) {
        nk0 = ((rk0)nk0).m("uri");
        if (nk0 instanceof sk0) {
          String str = nk0.i();
          if (str != null) {
            v00 v00 = v00.q(n21.f, str);
            if (v00 != null && v00.l() && v00.b()) {
              String str1 = MyApplication.F.e(v00, false);
              if (str1 != null) {
                d61 d61 = new d61();
                this(str1, (q01)null);
                v00.b = d61;
              } 
              return v00;
            } 
          } 
        } 
      } 
    } finally {}
    return null;
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 9:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("ProviderMetadata{ componentName=");
    stringBuilder.append(((ComponentName)this.c).flattenToShortString());
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
  
  public File u() {
    File file = (File)this.c;
    if (file != null)
      return file; 
    file = new File(MyApplication.i.getApplicationContext().getFilesDir(), "info");
    if (file.isFile()) {
      file.delete();
    } else if (!file.exists()) {
      file.mkdirs();
    } 
    this.c = file;
    return file;
  }
  
  public void v(int paramInt) {
    cr0 cr0 = (cr0)this.c;
    cr0.e.putInt("ti", paramInt);
    cr0.b.dismiss();
    cr0.f.run();
  }
  
  public File w(int paramInt) {
    return new File(u(), String.valueOf(paramInt));
  }
  
  public void x(int paramInt) {
    lb1 lb1 = (lb1)this.c;
    lb1.c0 = paramInt;
    lb1.H0();
    lb1.m0.getLayoutManager().E0(lb1.n0.d.e(MusicService.C0));
    lb1.d0 = null;
  }
  
  public void y(int paramInt, Object paramObject) {
    String str;
    switch (paramInt) {
      default:
        str = "";
        break;
      case 11:
        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
        break;
      case 10:
        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
        break;
      case 8:
        str = "RESULT_PARSE_EXCEPTION";
        break;
      case 7:
        str = "RESULT_IO_EXCEPTION";
        break;
      case 6:
        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
        break;
      case 5:
        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
        break;
      case 4:
        str = "RESULT_NOT_WRITABLE";
        break;
      case 3:
        str = "RESULT_UNSUPPORTED_ART_VERSION";
        break;
      case 2:
        str = "RESULT_ALREADY_INSTALLED";
        break;
      case 1:
        str = "RESULT_INSTALL_SUCCESS";
        break;
    } 
    if (paramInt != 6 && paramInt != 7 && paramInt != 8) {
      Log.d("ProfileInstaller", str);
    } else {
      Log.e("ProfileInstaller", str, (Throwable)paramObject);
    } 
    ((ProfileInstallReceiver)this.c).setResultCode(paramInt);
  }
  
  public void z(String paramString, Bitmap paramBitmap) {
    b9 b9 = MediaMetadataCompat.f;
    if (!b9.containsKey(paramString) || ((Integer)b9.get(paramString)).intValue() == 2) {
      ((Bundle)this.c).putParcelable(paramString, (Parcelable)paramBitmap);
      return;
    } 
    l0.l(x41.w("The ", paramString, " key cannot be used to put a Bitmap"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */