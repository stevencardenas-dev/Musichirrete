import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.CompoundButton;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RestoreActivity;
import java.io.BufferedInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class og1 extends AsyncTask {
  public final int a;
  
  public ss0 b;
  
  public final RestoreActivity c;
  
  public final void a() {
    publishProgress(new Object[0]);
  }
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    im0 im0;
    Boolean bool;
    Intent intent;
    int i = this.a;
    boolean bool1 = false;
    switch (i) {
      default:
        try {
          RestoreActivity.A0 = true;
          Thread.sleep(1000L);
          if (this.c.Z.isChecked()) {
            RestoreActivity restoreActivity1 = this.c;
            restoreActivity1.y0 = restoreActivity1.getString(2131887215);
            a();
            RestoreActivity.q0(this.c);
          } 
        } finally {}
        im0 = new im0();
        this(false, this.c.w0, false);
        im0.K = true;
        im0.d = this.c.getString(2131886199);
        im0.h = true;
        im0.i = true;
        im0.l = true;
        im0.m = true;
        GhostSearchActivity.g0 = im0;
        null = this.c;
        intent = new Intent();
        this((Context)this.c, GhostSearchActivity.class);
        null.startActivity(intent.setAction("A_BGU"));
        synchronized (RestoreActivity.B0) {
          null.wait();
          null = this.c;
          null.y0 = null.getString(2131887537);
          a();
          HashMap hashMap1 = RestoreActivity.m0(this.c);
          null = MyApplication.j;
          HashMap hashMap2 = ((wn1)null).c.w;
          null.o();
          MyApplication.j.c.w = hashMap2;
          l51.j();
          if (this.c.c0.isChecked()) {
            null = this.c;
            ((RestoreActivity)null).y0 = null.getString(2131887212);
            null = this.c;
            ((RestoreActivity)null).z0 = null.getString(2131886469);
            a();
            RestoreActivity.n0(this.c, hashMap1);
          } 
          if (this.c.e0.isChecked()) {
            null = this.c;
            ((RestoreActivity)null).y0 = null.getString(2131887213);
            a();
            RestoreActivity.o0(this.c, hashMap1);
          } 
          if (this.c.d0.isChecked()) {
            null = this.c;
            ((RestoreActivity)null).y0 = null.getString(2131887214);
            null = this.c;
            ((RestoreActivity)null).z0 = null.getString(2131886469);
            a();
            RestoreActivity.p0(this.c, hashMap1);
          } 
          RestoreActivity restoreActivity1 = this.c;
          null = new Intent();
          super(MyApplication.i.getApplicationContext(), MusicService.class);
          restoreActivity1.startService(null.setAction("ACTION_CLOSE"));
          Thread.sleep(2000L);
          if (this.c.x0)
            z51.A(MyApplication.i.getApplicationContext()); 
          Thread.sleep(1000L);
          bool = Boolean.TRUE;
          null = MyApplication.j.c.w;
          if (null != null) {
            null.clear();
            MyApplication.j.c.w = null;
          } 
          RestoreActivity.A0 = false;
        } 
        return im0;
      case 0:
        break;
    } 
    RestoreActivity restoreActivity = this.c;
    try {
      long l = restoreActivity.S.n();
      ZipInputStream zipInputStream = new ZipInputStream();
      BufferedInputStream bufferedInputStream = new BufferedInputStream();
      this(ws2.n(restoreActivity.S));
      this(bufferedInputStream);
      i = 0;
      while (true) {
        IllegalArgumentException illegalArgumentException;
        ZipEntry zipEntry = zipInputStream.getNextEntry();
        if (zipEntry != null) {
          String str = zipEntry.getName();
          if (str.length() > 1) {
            int j = str.lastIndexOf('/');
            String str1 = str;
            if (j >= 0) {
              j++;
              str1 = str;
              if (j < str.length())
                str1 = str.substring(j); 
            } 
            if ("0.musicolet.backup".equals(str1)) {
              bool1 = true;
              continue;
            } 
            if ("hash".equals(str1))
              i = 1; 
          } 
          continue;
        } 
        return illegalArgumentException;
      } 
    } finally {
      im0 = null;
      im0.printStackTrace();
    } 
    return bool;
  }
  
  public final void onCancelled() {
    RestoreActivity restoreActivity;
    switch (this.a) {
      default:
        if (this.b.isShowing())
          this.b.dismiss(); 
        restoreActivity = this.c;
        if (!restoreActivity.isFinishing())
          restoreActivity.finish(); 
        return;
      case 0:
        break;
    } 
    if (this.b.isShowing())
      this.b.dismiss(); 
  }
  
  public final void onPostExecute(Object paramObject) {
    int i = this.a;
    RestoreActivity restoreActivity = this.c;
    switch (i) {
      default:
        paramObject = paramObject;
        if (this.b.isShowing())
          this.b.dismiss(); 
        if (!isCancelled())
          if (paramObject.booleanValue()) {
            boolean bool = RestoreActivity.A0;
            ag0.O0(2131887200, 1);
            sl1.G0();
            restoreActivity.finish();
          } else {
            restoreActivity.finish();
            ag0.O0(2131886550, 1);
          }  
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    if (this.b.isShowing())
      this.b.dismiss(); 
    if (!isCancelled())
      if (paramObject.booleanValue()) {
        restoreActivity.x0();
        Date date = new Date(restoreActivity.l0);
        paramObject = new SimpleDateFormat();
        restoreActivity.U.setText(paramObject.format(date));
        restoreActivity.Z.setChecked(true);
        restoreActivity.a0.setChecked(restoreActivity.j0);
        restoreActivity.b0.setChecked(restoreActivity.j0);
        restoreActivity.d0.setChecked(restoreActivity.j0);
        if (restoreActivity.o0.l()) {
          restoreActivity.c0.setChecked(restoreActivity.j0);
          restoreActivity.c0.setVisibility(0);
        } 
        i = 0;
        while (true) {
          paramObject = restoreActivity.t0;
          if (i < paramObject.length) {
            paramObject[i].setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)restoreActivity);
            i++;
            continue;
          } 
          restoreActivity.X.setOnClickListener((View.OnClickListener)restoreActivity);
          restoreActivity.W.setOnClickListener((View.OnClickListener)restoreActivity);
          paramObject = restoreActivity.i0;
          if (paramObject != null && paramObject.size() > 0) {
            restoreActivity.h0.addAll(restoreActivity.i0);
            restoreActivity.x0();
            restoreActivity.e0.setVisibility(0);
            restoreActivity.e0.setChecked(restoreActivity.j0);
            if (!restoreActivity.j0)
              restoreActivity.w0(); 
            break;
          } 
          restoreActivity.w0();
          break;
        } 
      } else {
        restoreActivity.finish();
        ag0.O0(2131886511, 1);
      }  
  }
  
  public final void onPreExecute() {
    int i = this.a;
    RestoreActivity restoreActivity = this.c;
    switch (i) {
      default:
        restoreActivity.y0 = restoreActivity.getString(2131887105);
        restoreActivity.z0 = restoreActivity.getString(2131886469);
        ms0 = new ms0((Context)restoreActivity);
        ms0.f = restoreActivity.y0;
        ms0.d(restoreActivity.z0);
        ms0.o(0, true);
        ms0.J = false;
        ms0.K = false;
        this.b = ms0.p();
        return;
      case 0:
        break;
    } 
    ms0 ms0 = new ms0((Context)restoreActivity);
    ms0.c(2131887555);
    ms0.o(0, true);
    ms0.J = false;
    ms0.K = false;
    this.b = ms0.p();
  }
  
  public void onProgressUpdate(Object... paramVarArgs) {
    switch (this.a) {
      default:
        super.onProgressUpdate(paramVarArgs);
        return;
      case 1:
        break;
    } 
    ss0 ss01 = this.b;
    RestoreActivity restoreActivity = this.c;
    ss01.setTitle(restoreActivity.y0);
    this.b.k(restoreActivity.z0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\og1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */