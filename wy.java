import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class wy {
  public final Object a;
  
  public final Object b;
  
  public final Object c;
  
  public final Object d;
  
  public final Object e;
  
  public final Object f;
  
  public final Object g;
  
  public final Object h;
  
  public final Object i;
  
  public void a(ib paramib, int paramInt) {
    byte[] arrayOfByte = paramib.b;
    zh1 zh1 = (zh1)this.f;
    uw1 uw1 = ((ox0)this.b).a(paramib.a);
    long l = 0L;
    while (true) {
      if (((Boolean)zh1.k(new y02(this, paramib, 0))).booleanValue()) {
        ua ua2;
        Iterable iterable = (Iterable)zh1.k(new y02(this, paramib, 1));
        if (!iterable.iterator().hasNext())
          return; 
        if (uw1 == null) {
          ui0.n("Uploader", "Unknown backend for %s, deleting event batch for it...", paramib);
          ua ua = new ua(3, -1L);
          byte[] arrayOfByte1 = arrayOfByte;
          ua1 = ua;
        } else {
          ua ua;
          ArrayList<za> arrayList = new ArrayList();
          Iterator iterator = iterable.iterator();
          while (iterator.hasNext())
            arrayList.add(((fb)iterator.next()).c); 
          if (ua1 != null) {
            zh1 zh11 = (zh1)this.i;
            Objects.requireNonNull(zh11);
            xl xl = (xl)zh1.k(new x02(zh11, 0));
            Object object = new Object();
            ((m2)object).f = new HashMap<Object, Object>();
            ((m2)object).d = Long.valueOf(((am)this.g).i());
            ((m2)object).e = Long.valueOf(((am)this.h).i());
            ((m2)object).a = "GDT_CLIENT_METRICS";
            j40 j40 = new j40("proto");
            xl.getClass();
            p01 p01 = ya1.a;
            p01.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
              p01.c(xl, byteArrayOutputStream);
            } catch (IOException iOException) {}
            ((m2)object).c = new g40(j40, byteArrayOutputStream.toByteArray());
            za za = object.c();
            arrayList.add(((sj)uw1).a(za));
          } 
          sj sj = (sj)uw1;
          HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
          int k = arrayList.size();
          int j = 0;
          while (j < k) {
            za za1 = (za)arrayList.get(j);
            j++;
            za za2 = za1;
            String str = za2.a;
            if (!hashMap.containsKey(str)) {
              ArrayList<za> arrayList2 = new ArrayList();
              arrayList2.add(za2);
              hashMap.put(str, arrayList2);
              continue;
            } 
            ((List<za>)hashMap.get(str)).add(za2);
          } 
          ArrayList<cb> arrayList1 = new ArrayList();
          for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
            za za = ((List<za>)entry.getValue()).get(0);
            hb1 hb1 = hb1.b;
            long l2 = sj.f.i();
            long l3 = sj.e.i();
            j = za.b("sdk-version");
            String str7 = za.a("model");
            String str3 = za.a("hardware");
            String str1 = za.a("device");
            String str5 = za.a("product");
            String str2 = za.a("os-uild");
            String str8 = za.a("manufacturer");
            String str4 = za.a("fingerprint");
            String str6 = za.a("country");
            wa wa = new wa(new ta(Integer.valueOf(j), str7, str3, str1, str5, str2, str8, str4, za.a("locale"), str6, za.a("mcc_mnc"), za.a("application_build")));
            try {
              j = Integer.parseInt((String)entry.getKey());
              Integer integer = Integer.valueOf(j);
              str2 = null;
            } catch (NumberFormatException numberFormatException) {
              str2 = (String)entry.getKey();
              str1 = null;
            } 
            ArrayList<bb> arrayList2 = new ArrayList();
            for (za za1 : entry.getValue()) {
              long l4;
              String str10;
              Object object;
              g40 g40 = za1.c;
              j40 j40 = g40.a;
              byte[] arrayOfByte1 = g40.b;
              if (j40.equals(new j40("proto"))) {
                object = new Object();
                ((rv1)object).f = arrayOfByte1;
              } else if (j40.equals(new j40("json"))) {
                str11 = new String(arrayOfByte1, Charset.forName("UTF-8"));
                object = new Object();
                ((rv1)object).g = str11;
              } else {
                str10 = ui0.D("CctTransportBackend");
                if (Log.isLoggable(str10, 5)) {
                  object = new StringBuilder("Received event of unsupported encoding ");
                  object.append(str11);
                  object.append(". Skipping...");
                  Log.w(str10, object.toString());
                } 
                continue;
              } 
              ((rv1)object).b = Long.valueOf(((za)str10).d);
              ((rv1)object).e = Long.valueOf(((za)str10).e);
              String str12 = tlzLOCPTHRhep.TSpiQpjGFW;
              str12 = (String)((za)str10).f.get(str12);
              if (str12 == null) {
                l4 = 0L;
              } else {
                l4 = Long.valueOf(str12).longValue();
              } 
              ((rv1)object).h = Long.valueOf(l4);
              j = str10.b("net-type");
              r11 r11 = (r11)r11.b.get(j);
              j = str10.b("mobile-subtype");
              ((rv1)object).i = new eb(r11, (q11)q11.b.get(j));
              Integer integer = ((za)str10).b;
              if (integer != null)
                ((rv1)object).c = integer; 
              if ((Long)((rv1)object).b == null) {
                str11 = " eventTimeMs";
              } else {
                str11 = "";
              } 
              String str9 = str11;
              if ((Long)((rv1)object).e == null)
                str9 = str11.concat(" eventUptimeMs"); 
              String str11 = str9;
              if ((Long)((rv1)object).h == null)
                str11 = str9.concat(" timezoneOffsetSeconds"); 
              if (str11.isEmpty()) {
                arrayList2.add(new bb(((Long)((rv1)object).b).longValue(), (Integer)((rv1)object).c, ((Long)((rv1)object).e).longValue(), (byte[])((rv1)object).f, (String)((rv1)object).g, ((Long)((rv1)object).h).longValue(), (eb)((rv1)object).i));
                continue;
              } 
              tp.f("Missing required properties:".concat(str11));
              return;
            } 
            arrayList1.add(new cb(l2, l3, wa, (Integer)str1, str2, arrayList2));
          } 
          ua2 = ua1;
          va va = new va(arrayList1);
          URL uRL = sj.d;
          if (ua2 != null) {
            try {
              sh sh = sh.a((byte[])ua2);
              String str1 = sh.b;
              if (str1 == null)
                str1 = null; 
              URL uRL2 = sj.b(sh.a);
              String str2 = str1;
              URL uRL1 = uRL2;
            } catch (IllegalArgumentException illegalArgumentException) {
              ua = new ua(3, -1L);
            } 
          } else {
            hashMap = null;
          } 
          try {
            rj rj;
            zv0 zv02 = new zv0();
            this(ua, va, hashMap, 4);
            f f = new f();
            this(3, sj);
            j = 5;
            zv0 zv01 = zv02;
            while (true) {
              rj = f.g(zv01);
              URL uRL1 = rj.b;
              if (uRL1 != null) {
                ui0.n("CctTransportBackend", "Following redirect to: %s", uRL1);
                zv0 zv0 = new zv0();
                this(uRL1, zv01.e, zv01.f, 4);
                zv01 = zv0;
              } else {
                zv01 = null;
              } 
              if (zv01 != null) {
                k = j - 1;
                j = k;
                if (k < 1)
                  break; 
                continue;
              } 
              break;
            } 
            j = rj.a;
            if (j == 200) {
              ua ua3 = new ua(1, rj.c);
            } else if (j >= 500 || j == 404) {
              ua ua3 = new ua(2, -1L);
            } else if (j == 400) {
              ua ua3 = new ua(4, -1L);
            } else {
              ua ua3 = new ua(3, -1L);
            } 
          } catch (IOException iOException) {
            ui0.r("CctTransportBackend", "Could not make request to the backend", iOException);
            ua1 = new ua(2, -1L);
          } 
        } 
        int i = ua1.a;
        if (i == 2) {
          zh1.k(new z02(this, iterable, paramib, l));
          ((p01)this.d).m(paramib, paramInt + 1, true);
          return;
        } 
        long l1 = l;
        zh1.k(new vn(21, this, iterable));
        if (i == 1) {
          l1 = Math.max(l1, ua1.b);
          l = l1;
          if (ua2 != null) {
            zh1.k(new ds1(5, this));
            l = l1;
          } 
        } else {
          l = l1;
          if (i == 4) {
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
              String str = ((fb)iterator.next()).c.a;
              if (!hashMap.containsKey(str)) {
                hashMap.put(str, Integer.valueOf(1));
                continue;
              } 
              hashMap.put(str, Integer.valueOf(((Integer)hashMap.get(str)).intValue() + 1));
            } 
            zh1.k(new vn(22, this, hashMap));
            l = l1;
          } 
        } 
        ua ua1 = ua2;
        continue;
      } 
      zh1.k(new wh1(l, this, paramib));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */