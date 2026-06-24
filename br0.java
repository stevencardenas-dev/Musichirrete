import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.AsyncTask;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.util.Log;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.musicolet.MediaBrowserServiceImpl;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.providers.AAProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public final class br0 extends AsyncTask {
  public static final zq0 d = (zq0)new Object();
  
  public static final ar0 e = new ar0(0);
  
  public final int a;
  
  public final Object b;
  
  public final Object c;
  
  public br0(Context paramContext, b81 paramb81) {}
  
  public br0(String paramString, MediaBrowserService.Result paramResult) {
    this.b = paramResult;
    this.c = paramString;
  }
  
  public br0(v51 paramv51, a71 parama71) {}
  
  public br0(boolean[] paramArrayOfboolean, a71 parama71) {
    this.b = parama71;
    this.c = paramArrayOfboolean;
  }
  
  public static y51[] a(Bitmap paramBitmap, boolean[] paramArrayOfboolean) {
    y51[] arrayOfY51 = new y51[2];
    try {
      int k = paramBitmap.getWidth();
      int i = paramBitmap.getHeight();
      v51 v512 = new v51();
      this(paramBitmap);
      ArrayList<ar0> arrayList = v512.f;
      arrayList.clear();
      v512.d = 6400;
      v512.e = -1;
      arrayList.add(e);
      int j = (int)(k / 3.5D);
      v512.b(0, 0, j, i);
      y51 y513 = v512.a();
      if (paramArrayOfboolean[0])
        return null; 
      v51 v511 = new v51();
      this(paramBitmap);
      ArrayList<zq0> arrayList1 = v511.f;
      arrayList1.clear();
      v511.d = 4096;
      v511.e = -1;
      zq0 zq01 = d;
      arrayList1.add(zq01);
      v511.b(0, 0, j, i);
      y51 y512 = v511.a();
      if (paramArrayOfboolean[0])
        return null; 
      v51 v514 = new v51();
      this(paramBitmap);
      arrayList1 = v514.f;
      arrayList1.clear();
      v514.d = 4096;
      v514.e = -1;
      arrayList1.add(zq01);
      v514.b(k / 5, 0, k, i);
      y51 y514 = v514.a();
      if (paramArrayOfboolean[0])
        return null; 
      v51 v513 = new v51();
      this(paramBitmap);
      y51 y511 = v513.a();
      if (paramArrayOfboolean[0])
        return null; 
      arrayOfY51[0] = y513;
      arrayOfY51[1] = y511;
      x51 x511 = y513.d;
      if (x511 == null) {
        arrayOfY51[0] = y512;
        return arrayOfY51;
      } 
      float[] arrayOfFloat2 = x511.b();
      float[] arrayOfFloat1 = y512.d.b();
      x51 x512 = y514.d;
      if (x512 != null) {
        float[] arrayOfFloat = x512.b();
        float f5 = Math.abs(arrayOfFloat1[2] - arrayOfFloat[2]);
        Math.abs(arrayOfFloat2[2] - arrayOfFloat[2]);
        float f4 = Math.abs(arrayOfFloat1[1] - arrayOfFloat[1]);
        float f6 = Math.abs(arrayOfFloat1[0] - arrayOfFloat[0]);
        if (arrayOfFloat1[2] < 0.1D && arrayOfFloat[2] < 0.1D && f5 < 0.05D && f4 < 0.4D && f6 <= 30.0F) {
          arrayOfY51[0] = y512;
          return arrayOfY51;
        } 
      } 
      float f1 = arrayOfFloat2[0] - arrayOfFloat1[0];
      float f2 = arrayOfFloat2[1];
      f2 = arrayOfFloat1[1];
      f2 = arrayOfFloat2[2];
      float f3 = arrayOfFloat1[2];
      if (f3 < 0.15F && f2 - f3 < 0.3F && (f1 <= 30.0F || f1 >= 85.0F))
        arrayOfY51[0] = y512; 
    } finally {}
    return arrayOfY51;
  }
  
  public static boolean b(float[] paramArrayOffloat) {
    float f = paramArrayOffloat[0];
    if (f >= 12.0F && f <= 37.0F) {
      double d1;
      double d2 = paramArrayOffloat[1];
      if (paramArrayOffloat[2] < 0.5D) {
        d1 = 0.82D;
      } else {
        d1 = 0.6200000047683716D;
      } 
      if (d2 <= d1)
        return true; 
    } 
    return false;
  }
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    File file;
    Bitmap[] arrayOfBitmap;
    b81 b811;
    Bundle bundle;
    String str1;
    String str2;
    int i = this.a;
    boolean bool4 = false;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool5 = false;
    int j = 0;
    Object object1 = this.b;
    b81 b812 = null;
    Object object2 = this.c;
    switch (i) {
      default:
        file = ((Context)object1).getFilesDir();
        object1 = new StringBuilder();
        b812 = (b81)object2;
        file = new File(file, x41.n((StringBuilder)object1, b812.b, ".mpl"));
        try {
          if (!file.exists())
            file.createNewFile(); 
        } catch (IOException iOException) {}
        xk1.e(b812.c, (File)iOException);
        c81.c.remove(b812.b);
        return null;
      case 2:
        arrayOfBitmap = (Bitmap[])iOException;
        try {
          y51 y51 = ((v51)object2).a();
        } catch (Exception exception) {
          Log.e("Palette", "Exception thrown during async generate", exception);
          b811 = b812;
        } 
        return b811;
      case 1:
        str2 = (String)object2;
        bundle = MediaBrowserServiceImpl.e;
        object2 = new ArrayList();
        if (str2 != null) {
          int k = MyApplication.w;
          i = 4;
          if (k == 4)
            if ("musicolet.media.r.3".equals(str2)) {
              i = MyApplication.o().getInt("I_K_SRTBYF_PL", 0);
              MediaBrowserServiceImpl.b((ArrayList)object2, MyApplication.j.c.i(new int[] { i }, ), "musicolet.media.r.3.s_");
            } else {
              StringBuilder stringBuilder;
              if ("musicolet.media.r.4".equals(str2)) {
                ArrayList<q3> arrayList = MyApplication.j.c.e();
                for (i = j; i < arrayList.size(); i++) {
                  q3 q3 = arrayList.get(i);
                  MediaDescription.Builder builder = new MediaDescription.Builder();
                  stringBuilder = new StringBuilder("musicolet.media.r.4_");
                  stringBuilder.append(i);
                  object2.add(new MediaBrowser.MediaItem(builder.setMediaId(stringBuilder.toString()).setIconUri(AAProvider.d(MyApplication.j.c.a(q3.i))).setTitle(q3.c).setExtras(bundle).build(), 1));
                } 
              } else {
                MediaDescription.Builder builder;
                if ("musicolet.media.r.5".equals(stringBuilder)) {
                  ArrayList<q3> arrayList = MyApplication.j.c.f();
                  for (i = bool4; i < arrayList.size(); i++) {
                    q3 q3 = arrayList.get(i);
                    builder = new MediaDescription.Builder();
                    StringBuilder stringBuilder1 = new StringBuilder("musicolet.media.r.5_");
                    stringBuilder1.append(i);
                    object2.add(new MediaBrowser.MediaItem(builder.setMediaId(stringBuilder1.toString()).setTitle(q3.c).setExtras(bundle).build(), 1));
                  } 
                } else {
                  q3 q3;
                  if ("musicolet.media.r.9".equals(builder)) {
                    ArrayList<q3> arrayList = MyApplication.j.c.d();
                    for (i = bool1; i < arrayList.size(); i++) {
                      q3 = arrayList.get(i);
                      MediaDescription.Builder builder1 = new MediaDescription.Builder();
                      StringBuilder stringBuilder1 = new StringBuilder("musicolet.media.r.9_");
                      stringBuilder1.append(i);
                      object2.add(new MediaBrowser.MediaItem(builder1.setMediaId(stringBuilder1.toString()).setTitle(q3.c).setExtras(bundle).build(), 1));
                    } 
                  } else {
                    StringBuilder stringBuilder1;
                    if (OETETTfAjV.bbCVW.equals(q3)) {
                      ArrayList<q3> arrayList = MyApplication.j.c.g();
                      for (i = bool2; i < arrayList.size(); i++) {
                        q3 q31 = arrayList.get(i);
                        MediaDescription.Builder builder1 = new MediaDescription.Builder();
                        stringBuilder1 = new StringBuilder("musicolet.media.r.8_");
                        stringBuilder1.append(i);
                        object2.add(new MediaBrowser.MediaItem(builder1.setMediaId(stringBuilder1.toString()).setTitle(q31.c).setExtras(bundle).build(), 1));
                      } 
                    } else {
                      ArrayList<k90> arrayList;
                      if ("musicolet.media.r.10".equals(stringBuilder1)) {
                        arrayList = (ArrayList)MyApplication.j.c.q.clone();
                        for (i = bool3; i < arrayList.size(); i++) {
                          k90 k90 = arrayList.get(i);
                          MediaDescription.Builder builder1 = new MediaDescription.Builder();
                          StringBuilder stringBuilder2 = new StringBuilder("musicolet.media.r.10_");
                          stringBuilder2.append(i);
                          object2.add(new MediaBrowser.MediaItem(builder1.setMediaId(stringBuilder2.toString()).setTitle(k90.getName()).setExtras(bundle).build(), 1));
                        } 
                      } else if ("musicolet.media.r.6".equals(arrayList)) {
                        arrayList = MyApplication.j.c.h();
                        for (i = bool5; i < arrayList.size(); i++) {
                          q3 q31 = (q3)arrayList.get(i);
                          MediaDescription.Builder builder1 = new MediaDescription.Builder();
                          StringBuilder stringBuilder2 = new StringBuilder("musicolet.media.r.6_");
                          stringBuilder2.append(i);
                          object2.add(new MediaBrowser.MediaItem(builder1.setMediaId(stringBuilder2.toString()).setTitle(q31.c).setExtras(bundle).build(), 1));
                        } 
                      } else if ("musicolet.media.r.12".equals(arrayList)) {
                        b81 b81 = c81.a;
                        ArrayList arrayList1 = c81.d((c81.c(MyApplication.i.getApplicationContext())).c);
                        z51.R(MyApplication.o().getInt("I_K_SRTBYF_PL", 0), arrayList1);
                        MediaBrowserServiceImpl.b((ArrayList)object2, arrayList1, "musicolet.media.r.12.s_");
                      } else {
                        boolean bool = arrayList.startsWith("musicolet.media.r.4_");
                        String str = "I_K_SRTBYF_AL";
                        if (bool) {
                          try {
                            i = Integer.parseInt(arrayList.substring(20));
                            ArrayList arrayList1 = ((q3)MyApplication.j.c.e().get(i)).l(MyApplication.j.c, new int[] { MyApplication.o().getInt("I_K_SRTBYF_AL", 12) });
                            StringBuilder stringBuilder2 = new StringBuilder();
                            this("musicolet.media.r.4.s_");
                            stringBuilder2.append(i);
                            stringBuilder2.append("_");
                            MediaBrowserServiceImpl.b((ArrayList)object2, arrayList1, stringBuilder2.toString());
                          } finally {
                            bundle = null;
                          } 
                        } else {
                          bool = arrayList.startsWith("musicolet.media.r.5_");
                          str1 = tlzLOCPTHRhep.qJrcpjd;
                          if (bool) {
                            try {
                              j = Integer.parseInt(arrayList.substring(20));
                              q3 q31 = MyApplication.j.c.f().get(j);
                              bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
                              if (bool)
                                i = 12; 
                              if (!bool)
                                str = str1; 
                              ArrayList arrayList1 = q31.l(MyApplication.j.c, new int[] { MyApplication.o().getInt(str, i) });
                              StringBuilder stringBuilder2 = new StringBuilder();
                              this("musicolet.media.r.5.s_");
                              stringBuilder2.append(j);
                              stringBuilder2.append("_");
                            } finally {
                              str1 = null;
                            } 
                          } else {
                            q3 q31;
                            if (arrayList.startsWith("musicolet.media.r.9_")) {
                              String str3 = nFLlOYeP.TeLYNE;
                              try {
                                j = Integer.parseInt(arrayList.substring(20));
                                q31 = MyApplication.j.c.d().get(j);
                                bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
                                if (bool)
                                  i = 12; 
                                if (!bool)
                                  str = str1; 
                                ArrayList arrayList1 = q31.l(MyApplication.j.c, new int[] { MyApplication.o().getInt(str, i) });
                                StringBuilder stringBuilder2 = new StringBuilder();
                                this(str3);
                                stringBuilder2.append(j);
                                stringBuilder2.append("_");
                              } finally {
                                str1 = null;
                              } 
                            } else if (q31.startsWith("musicolet.media.r.8_")) {
                              try {
                                j = Integer.parseInt(q31.substring(20));
                                q3 q32 = MyApplication.j.c.g().get(j);
                                bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
                                if (bool)
                                  i = 12; 
                                if (!bool)
                                  str = str1; 
                                ArrayList arrayList1 = q32.l(MyApplication.j.c, new int[] { MyApplication.o().getInt(str, i) });
                                StringBuilder stringBuilder2 = new StringBuilder();
                                this("musicolet.media.r.8.s_");
                                stringBuilder2.append(j);
                                stringBuilder2.append("_");
                              } finally {
                                str1 = null;
                              } 
                            } else if (q31.startsWith("musicolet.media.r.10_")) {
                              try {
                                i = Integer.parseInt(q31.substring(21));
                                ArrayList arrayList1 = ((k90)((ArrayList<k90>)MyApplication.j.c.q.clone()).get(i)).c(MyApplication.j.c, new int[] { MyApplication.o().getInt("I_K_SRTBYF_F", 30) });
                                StringBuilder stringBuilder2 = new StringBuilder();
                                this("musicolet.media.r.10.s_");
                                stringBuilder2.append(i);
                                stringBuilder2.append("_");
                                MediaBrowserServiceImpl.b((ArrayList)object2, arrayList1, stringBuilder2.toString());
                              } finally {
                                str1 = null;
                              } 
                            } else if (q31.startsWith("musicolet.media.r.11_")) {
                              if (MyApplication.k()) {
                                try {
                                  i = Integer.parseInt(q31.substring(21));
                                  str1 = c81.g(MyApplication.i.getApplicationContext()).get(i);
                                  j = c81.e(str1);
                                  ArrayList arrayList1 = c81.d((c81.f(MyApplication.i.getApplicationContext(), str1)).c);
                                  if (j != -1)
                                    z51.R(j, arrayList1); 
                                } finally {}
                                StringBuilder stringBuilder2 = new StringBuilder();
                                this("musicolet.media.r.11.s_");
                                stringBuilder2.append(i);
                                stringBuilder2.append("_");
                                MediaBrowserServiceImpl.b((ArrayList)object2, (ArrayList)str1, stringBuilder2.toString());
                              } 
                            } else if (q31.startsWith("musicolet.media.r.6_")) {
                              try {
                                i = Integer.parseInt(q31.substring(20));
                                ArrayList arrayList1 = ((q3)MyApplication.j.c.h().get(i)).l(MyApplication.j.c, new int[] { MyApplication.o().getInt("I_K_SRTBYF_G", 0) });
                                StringBuilder stringBuilder2 = new StringBuilder();
                                this("musicolet.media.r.6.s_");
                                stringBuilder2.append(i);
                                stringBuilder2.append("_");
                                MediaBrowserServiceImpl.b((ArrayList)object2, arrayList1, stringBuilder2.toString());
                              } finally {
                                str1 = null;
                              } 
                            } else if (q31.startsWith("musicolet.media.r.13_d_")) {
                              str1 = q31.substring(23);
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            }  
        } 
        ((MediaBrowserService.Result)object1).sendResult(object2);
        return null;
      case 0:
        break;
    } 
    return a(((Bitmap[])str1)[0], (boolean[])object2);
  }
  
  public void onPostExecute(Object paramObject) {
    a71 a71;
    Bitmap bitmap;
    wo wo;
    km0 km0;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        super.onPostExecute(paramObject);
        return;
      case 2:
        paramObject = paramObject;
        a71 = (a71)object;
        object = a71.a;
        bitmap = a71.b;
        wo = MusicService.V0;
        km0 = ((b71)object).d;
        if (Objects.equals(wo, km0.c.f) && !((b71)object).b[0]) {
          zo2.R(km0, bitmap, (y51)paramObject, null);
          MusicService.O0();
          ((b71)object).e = true;
        } 
        return;
      case 0:
        break;
    } 
    y51[] arrayOfY51 = (y51[])paramObject;
    super.onPostExecute(arrayOfY51);
    if (arrayOfY51 != null) {
      a71 a711 = (a71)object;
      if (a711 != null) {
        paramObject = arrayOfY51[0];
        y51 y51 = arrayOfY51[1];
        object = a711.a;
        Bitmap bitmap1 = a711.b;
        km0 = ((b71)object).d;
        if (km0.c.f.equals(MusicService.V0) && !((b71)object).b[0]) {
          zo2.R(km0, bitmap1, (y51)paramObject, y51);
          MusicService.O0();
          ((b71)object).e = true;
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\br0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */