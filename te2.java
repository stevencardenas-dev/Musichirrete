import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import in.krosbits.musicolet.MusicService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class te2 {
  public static final String w = "urn:x-cast:com.google.cast.media";
  
  public final rp0 a;
  
  public final String b;
  
  public p01 c;
  
  public final List d;
  
  public long e;
  
  public kw0 f;
  
  public Long g;
  
  public a42 h;
  
  public int i;
  
  public final df2 j;
  
  public final df2 k;
  
  public final df2 l;
  
  public final df2 m;
  
  public final df2 n;
  
  public final df2 o;
  
  public final df2 p;
  
  public final df2 q;
  
  public final df2 r;
  
  public final df2 s;
  
  public final df2 t;
  
  public final df2 u;
  
  public final df2 v;
  
  public te2() {
    String str = w;
    qj.b(str);
    this.b = str;
    this.a = new rp0("MediaControlChannel", null);
    this.d = Collections.synchronizedList(new ArrayList());
    this.i = -1;
    df2 df21 = new df2(86400000L, "load");
    this.j = df21;
    df2 df212 = new df2(86400000L, "pause");
    this.k = df212;
    df2 df213 = new df2(86400000L, "play");
    this.l = df213;
    df2 df28 = new df2(86400000L, "stop");
    this.m = df28;
    df2 df216 = new df2(10000L, IGBYXeDFmKYajx.gjhTXWvuNljdqN);
    this.n = df216;
    df2 df214 = new df2(86400000L, "volume");
    this.o = df214;
    df2 df217 = new df2(86400000L, "mute");
    this.p = df217;
    df2 df29 = new df2(86400000L, "status");
    this.q = df29;
    df2 df211 = new df2(86400000L, "activeTracks");
    df2 df23 = new df2(86400000L, "trackStyle");
    df2 df27 = new df2(86400000L, "queueInsert");
    df2 df25 = new df2(86400000L, "queueUpdate");
    this.r = df25;
    df2 df218 = new df2(86400000L, "queueRemove");
    df2 df22 = new df2(86400000L, "queueReorder");
    df2 df26 = new df2(86400000L, eRUgfgGAccgka.UEOPzzs);
    this.s = df26;
    df2 df215 = new df2(86400000L, oXrNDUqUkE.kukrcwsDc);
    this.u = df215;
    this.t = new df2(86400000L, "queueFetchItems");
    df2 df210 = new df2(86400000L, "setPlaybackRate");
    this.v = df210;
    df2 df24 = new df2(86400000L, "skipAd");
    l(df21);
    l(df212);
    l(df213);
    l(df28);
    l(df216);
    l(df214);
    l(df217);
    l(df29);
    l(df211);
    l(df23);
    l(df27);
    l(df25);
    l(df218);
    l(df22);
    l(df26);
    l(df215);
    l(df215);
    l(df210);
    l(df24);
    j();
  }
  
  public static int[] e(JSONArray paramJSONArray) {
    if (paramJSONArray == null)
      return null; 
    int[] arrayOfInt = new int[paramJSONArray.length()];
    for (byte b = 0; b < paramJSONArray.length(); b++)
      arrayOfInt[b] = paramJSONArray.getInt(b); 
    return arrayOfInt;
  }
  
  public static fb0 k(JSONObject paramJSONObject) {
    MediaError.e(paramJSONObject);
    Object object = new Object();
    Pattern pattern = qj.a;
    if (paramJSONObject.has("customData"))
      paramJSONObject.optJSONObject("customData"); 
    return (fb0)object;
  }
  
  public final void a(ye2 paramye2, int paramInt) {
    JSONObject jSONObject = new JSONObject();
    long l = n();
    try {
      jSONObject.put("requestId", l);
      jSONObject.put("type", "QUEUE_UPDATE");
      jSONObject.put("mediaSessionId", b());
      if (paramInt != 0)
        jSONObject.put("jump", paramInt); 
      paramInt = this.i;
      if (paramInt != -1)
        jSONObject.put("sequenceNumber", paramInt); 
    } catch (JSONException jSONException) {}
    m(l, jSONObject.toString());
    paramye2 = new fe2(this, paramye2, 1);
    this.r.a(l, paramye2);
  }
  
  public final long b() {
    kw0 kw01 = this.f;
    if (kw01 != null)
      return kw01.c; 
    throw new Exception();
  }
  
  public final long c(double paramDouble, long paramLong1, long paramLong2) {
    long l2 = SystemClock.elapsedRealtime() - this.e;
    long l1 = l2;
    if (l2 < 0L)
      l1 = 0L; 
    if (l1 == 0L)
      return paramLong1; 
    paramLong1 += (long)(l1 * paramDouble);
    return (paramLong2 > 0L && paramLong1 > paramLong2) ? paramLong2 : ((paramLong1 >= 0L) ? paramLong1 : 0L);
  }
  
  public final void d(JSONObject paramJSONObject, String paramString) {
    if (paramJSONObject.has("sequenceNumber")) {
      this.i = paramJSONObject.optInt("sequenceNumber", -1);
      return;
    } 
    paramString = paramString.concat(" message is missing a sequence number.");
    rp0 rp01 = this.a;
    Log.w(rp01.a, rp01.c(paramString, new Object[0]));
  }
  
  public final void f() {
    a42 a421 = this.h;
    if (a421 != null) {
      nf1 nf1 = (nf1)a421.c;
      nf1.getClass();
      Iterator<zk> iterator = nf1.i.values().iterator();
      if (iterator.hasNext()) {
        if (iterator.next() == null) {
          if (!nf1.g()) {
            if (!nf1.g())
              throw null; 
            throw null;
          } 
          throw null;
        } 
        tp.b();
        return;
      } 
      iterator = nf1.g.iterator();
      if (!iterator.hasNext()) {
        for (zk zk : nf1.h) {
          long l;
          nf1 nf11;
          oj oj;
          mt2 mt2;
          gc2 gc2;
          qp0 qp0;
          fy1 fy1;
          switch (zk.a) {
            default:
              ((qr2)zk.b).b();
              continue;
            case 2:
              oj = (oj)zk.b;
              nf11 = oj.j;
              if (nf11 != null) {
                kw0 kw01 = nf11.d();
              } else {
                nf11 = null;
              } 
              mt2 = oj.l;
              if (mt2 == null || nf11 == null)
                continue; 
              gc2 = mt2.b.H();
              qp0 = new qp0((kw0)nf11);
              object = new Object();
              ((fy1)object).a = qp0.b;
              ((fy1)object).b = System.currentTimeMillis();
              fy1 = gc2.m;
              if (fy1 != null && fy1.a == 2)
                continue; 
              ((fy1)object).c = gc2.h;
              gc2.m = (fy1)object;
              continue;
            case 1:
              object = ((zk)object).b;
              l = object.e();
              if (l != ((rt0)object).b) {
                ((rt0)object).b = l;
                object.a();
                if (((rt0)object).b != 0L)
                  object.b(); 
              } 
              continue;
            case 0:
              break;
          } 
          Object object = ((zk)object).b;
          Handler handler = ((fl)object).C;
          Context context = ((hc)object).g;
          nf1 nf12 = object.l0();
          if (nf12 != null) {
            dc dc;
            int i = nf12.e();
            if (i == 1) {
              if (nf12.b() == 1) {
                dc = ((hc)object).e;
                if (dc != null)
                  dc.s((hc)object); 
              } 
              continue;
            } 
            if (fl.k0(i) && (((fl)object).E || (!nf12.h() && !nf12.j()))) {
              if (!((fl)object).E) {
                ((fl)object).E = true;
                fc fc = ((hc)object).c;
                if (fc != null)
                  fc.E((hc)object); 
              } 
              int j = ((fl)object).F;
              if (j > 0)
                object.R(j); 
              float f = ((fl)object).w;
              if (f != -1.0F) {
                ((fl)object).w = -1.0F;
                object.b0(f);
              } 
              if (((fl)object).L) {
                ((fl)object).M = false;
                ((fl)object).L = false;
                if (((fl)object).Q)
                  dc.post(new wk((fl)object, 5)); 
                continue;
              } 
              if (((fl)object).M) {
                ((fl)object).M = false;
                ((fl)object).L = false;
                if (!((fl)object).Q)
                  dc.post(new wk((fl)object, 2)); 
                continue;
              } 
              if (i == 3 && System.currentTimeMillis() - ((fl)object).v > 4000L) {
                if (!((fl)object).Q)
                  ag0.n0(context, (new Intent(context, MusicService.class)).setAction("ACTION_PAUSE")); 
                continue;
              } 
              if (i == 2 && System.currentTimeMillis() - ((fl)object).v > 4000L && ((fl)object).Q)
                ag0.n0(context, (new Intent(context, MusicService.class)).setAction("ACTION_PLAY")); 
            } 
          } 
        } 
      } else {
        throw x41.g(iterator);
      } 
    } 
  }
  
  public final void g() {
    a42 a421 = this.h;
    if (a421 != null) {
      nf1 nf1 = (nf1)a421.c;
      nf1.getClass();
      Iterator<zk> iterator = nf1.g.iterator();
      if (!iterator.hasNext()) {
        for (zk zk : nf1.h) {
          switch (zk.a) {
            default:
              continue;
            case 3:
              ((qr2)zk.b).b();
              continue;
            case 0:
              break;
          } 
          fl fl = (fl)zk.b;
          try {
            nf1 nf11 = fl.l0();
          } finally {
            fl = null;
          } 
        } 
      } else {
        throw x41.g(iterator);
      } 
    } 
  }
  
  public final void h() {
    a42 a421 = this.h;
    if (a421 != null) {
      nf1 nf1 = (nf1)a421.c;
      Iterator<zk> iterator = nf1.g.iterator();
      if (!iterator.hasNext()) {
        for (zk zk : nf1.h) {
          switch (zk.a) {
            case 3:
              ((qr2)zk.b).b();
              break;
          } 
        } 
      } else {
        throw x41.g(iterator);
      } 
    } 
  }
  
  public final void i() {
    a42 a421 = this.h;
    if (a421 != null) {
      nf1 nf1 = (nf1)a421.c;
      Iterator iterator = nf1.g.iterator();
      if (!iterator.hasNext()) {
        for (zk zk : nf1.h) {
          switch (zk.a) {
            case 3:
              ((qr2)zk.b).b();
              break;
          } 
        } 
      } else {
        throw x41.g(zk);
      } 
    } 
  }
  
  public final void j() {
    this.e = 0L;
    this.f = null;
    Iterator<df2> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((df2)iterator.next()).e(2002); 
  }
  
  public final void l(df2 paramdf2) {
    this.d.add(paramdf2);
  }
  
  public final void m(long paramLong, String paramString) {
    rp0 rp01 = this.a;
    rp01.getClass();
    String str = rp01.a;
    if (!Build.TYPE.equals("user") && rp01.b && Log.isLoggable(str, 2))
      Log.v(str, rp01.c("Sending text message: %s to: %s", new Object[] { paramString, null })); 
    p01 p011 = this.c;
    if (p011 == null) {
      Log.e(str, rp01.c("Attempt to send text message without a sink", new Object[0]));
      return;
    } 
    pg2 pg2 = (pg2)p011.c;
    if (pg2 != null) {
      str = this.b;
      qj.b(str);
      if (!TextUtils.isEmpty(paramString)) {
        if (paramString.length() <= 524288) {
          ah ah = ah.b();
          ah.d = new zv0(pg2, str, paramString, 16);
          ah.b = 8405;
          pg2.c(1, ah.a()).b(new sk(p011, paramLong));
          return;
        } 
        rp0 rp02 = pg2.G;
        Log.w(rp02.a, rp02.c("Message send failed. Message exceeds maximum size", new Object[0]));
        l0.l("Message exceeds maximum size524288");
        return;
      } 
      l0.l(JkpGFvCVQHzgc.BGoXkmtgZDiE);
      return;
    } 
    tp.f("Device is not connected");
  }
  
  public final long n() {
    rp0 rp01;
    p01 p011 = this.c;
    if (p011 == null) {
      rp01 = this.a;
      Log.e(rp01.a, rp01.c("Attempt to generate requestId without a sink", new Object[0]));
      return 0L;
    } 
    return ((AtomicLong)((p01)rp01).e).getAndIncrement();
  }
  
  public final long o() {
    MediaInfo mediaInfo;
    kw0 kw02 = this.f;
    kw0 kw01 = null;
    if (kw02 == null) {
      mediaInfo = null;
    } else {
      mediaInfo = kw02.b;
    } 
    long l = 0L;
    if (mediaInfo != null && kw02 != null) {
      MediaInfo mediaInfo1;
      Long long_ = this.g;
      if (long_ != null) {
        if (long_.equals(Long.valueOf(4294967296000L))) {
          long l1;
          it0 it0;
          kw0 kw03 = this.f;
          if (kw03.w != null) {
            l1 = long_.longValue();
            kw03 = this.f;
            if (kw03 != null) {
              it0 = kw03.w;
              if (it0 != null) {
                l = it0.c;
                if (!it0.f)
                  l = c(1.0D, l, -1L); 
              } 
            } 
            return Math.min(l1, l);
          } 
          if (it0 == null) {
            it0 = null;
          } else {
            mediaInfo1 = ((kw0)it0).b;
          } 
          if (mediaInfo1 != null) {
            l1 = mediaInfo1.g;
          } else {
            l1 = 0L;
          } 
          if (l1 >= 0L) {
            l1 = long_.longValue();
            kw0 kw04 = this.f;
            if (kw04 == null) {
              kw04 = kw01;
            } else {
              mediaInfo1 = kw04.b;
            } 
            if (mediaInfo1 != null)
              l = mediaInfo1.g; 
            return Math.min(l1, l);
          } 
        } 
        return long_.longValue();
      } 
      if (this.e != 0L) {
        double d = kw02.f;
        l = kw02.i;
        int i = kw02.g;
        return (d == 0.0D || i != 2) ? l : c(d, l, mediaInfo1.g);
      } 
    } 
    return 0L;
  }
  
  static {
    Pattern pattern = qj.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\te2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */