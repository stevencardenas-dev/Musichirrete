import android.content.Context;
import android.net.Uri;
import android.os.Build;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.nativex.FDTS;
import java.io.File;
import java.util.Collections;
import java.util.List;

public abstract class hc {
  public String b;
  
  public fc c;
  
  public dc e;
  
  public ec f;
  
  public final Context g;
  
  public cc h;
  
  public bc i;
  
  public boolean j = false;
  
  public boolean k = false;
  
  public gc l = new l0(21);
  
  public hc(Context paramContext) {
    this.g = paramContext;
  }
  
  public abstract int A();
  
  public final String B() {
    return this.b;
  }
  
  public abstract int C();
  
  public abstract float D();
  
  public abstract float E();
  
  public abstract int F();
  
  public abstract void G(Context paramContext);
  
  public abstract boolean H();
  
  public boolean I() {
    return false;
  }
  
  public abstract boolean J();
  
  public boolean K() {
    return J();
  }
  
  public void L() {
    /* monitor enter ThisExpression{ObjectType{hc}} */
    /* monitor exit ThisExpression{ObjectType{hc}} */
  }
  
  public abstract void M();
  
  public void N(int paramInt1, int paramInt2, Runnable paramRunnable) {
    this.k = false;
    if (paramInt1 <= 0) {
      if (F() > 0)
        c0(0); 
      M();
      return;
    } 
    cc cc1 = this.h;
    if (cc1 != null)
      cc1.a(true); 
    this.j = true;
    paramRunnable = new cc(this, paramInt1, paramInt2, paramRunnable);
    paramRunnable.start();
    this.h = (cc)paramRunnable;
  }
  
  public abstract void O();
  
  public final void P() {
    this.b = null;
    Q();
  }
  
  public abstract void Q();
  
  public abstract void R(int paramInt);
  
  public void S(int paramInt) {
    int i = 100;
    if (paramInt >= 100)
      if (paramInt > 100) {
        i = 200 - paramInt;
        paramInt = 100;
      } else {
        paramInt = 100;
      }  
    Y(i, paramInt);
  }
  
  public abstract void T(int paramInt);
  
  public abstract void U();
  
  public final void V(String paramString, boolean paramBoolean) {
    String str = paramString;
    if (str != null) {
      paramString = str;
      if (str.startsWith("/"))
        paramString = Uri.fromFile(new File(str)).toString(); 
      if (j50.a == 0) {
        boolean bool1;
        Context context = MyApplication.i.getApplicationContext();
        StringBuilder stringBuilder = new StringBuilder("content://in.krosbits.musicolet/s/");
        stringBuilder.append(paramString);
        FDTS fDTS = new FDTS(context, Uri.parse(stringBuilder.toString()));
        String[] arrayOfString = Build.SUPPORTED_ABIS;
        int i = arrayOfString.length;
        boolean bool = true;
        if (i >= 4 && arrayOfString[3].equals("_86_64")) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        int j = 0;
        fDTS.c(0L, 44100, false, false, 1.0F, 1.0F, bool1, 0, null, null, null);
        if (!fDTS.nte0F) {
          fDTS.sKBl = paramBoolean;
          fDTS.odUs = 44100L;
          fDTS.p = 48000L;
          String str1 = fDTS.oCont;
          if (str1 != null) {
            if (str1.endsWith(".lrc")) {
              ag0.y0("text/lyrics", fDTS);
            } else if (str1.endsWith(".jpg")) {
              ag0.y0("image/jpg", fDTS);
            } else if (str1.endsWith(".png")) {
              ag0.y0("image/png", fDTS);
            } else if (str1.endsWith(".aac")) {
              ag0.y0("audio/aac", fDTS);
            } else {
              ag0.y0("audio/raw", fDTS);
            } 
          } else {
            ag0.y0("application/unknown", fDTS);
          } 
          fDTS.l_Hps = fDTS.l_Tps * 2L;
          str1 = fDTS.oCont;
          i = bool;
          if (str1 != null) {
            try {
              vc1 vc1 = new vc1();
              this(str1);
              uc1 uc1 = vc1.b;
            } finally {
              str1 = null;
              str1 = null;
            } 
            i = -1;
          } 
          j50.a = i;
          fDTS.osR = 64;
        } 
        fDTS.a();
      } 
      if (j50.a > 0)
        this.b = paramString; 
      W(this.b, paramBoolean);
    } 
  }
  
  public abstract void W(String paramString, boolean paramBoolean);
  
  public void X(boolean paramBoolean) {}
  
  public void Y(int paramInt1, int paramInt2) {
    c0(F());
  }
  
  public void Z(MusicService paramMusicService) {
    this.l = (gc)paramMusicService;
  }
  
  public abstract void a0(float paramFloat);
  
  public abstract void b0(float paramFloat);
  
  public abstract void c0(int paramInt);
  
  public void d0() {}
  
  public abstract void e0();
  
  public void f0(int paramInt1, int paramInt2) {
    this.j = false;
    if (paramInt1 <= 0) {
      if (F() < 100)
        c0(100); 
      e0();
      return;
    } 
    bc bc1 = this.i;
    if (bc1 != null)
      bc1.a(true); 
    this.k = true;
    bc1 = new bc(this, paramInt1, paramInt2);
    e0();
    bc1.start();
    this.i = bc1;
  }
  
  public abstract void g0();
  
  public abstract void u(int paramInt);
  
  public boolean v() {
    return this instanceof n4;
  }
  
  public abstract boolean w();
  
  public abstract int x();
  
  public List y() {
    return Collections.singletonList(Integer.valueOf(x()));
  }
  
  public int z() {
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */