import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.HashMap;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public abstract class a51 {
  public static final z41 a = new z41(-1, -1, "m", false, -1);
  
  public static z41[] b;
  
  public static z41[] c;
  
  public static z41[] d;
  
  public static z41[] e;
  
  public static z41[] f;
  
  public static z41[] g;
  
  public static z41[] h;
  
  public static z41[] i;
  
  public static z41[] j;
  
  public static z41[] k;
  
  public static final HashMap l = new HashMap<Object, Object>(b.length);
  
  public static final HashMap m = new HashMap<Object, Object>(c.length);
  
  public static final HashMap n = new HashMap<Object, Object>(d.length);
  
  public static final HashMap o = new HashMap<Object, Object>(e.length);
  
  public static final HashMap p = new HashMap<Object, Object>(f.length);
  
  public static final HashMap q = new HashMap<Object, Object>(g.length);
  
  public static final HashMap r = new HashMap<Object, Object>(h.length);
  
  public static final HashMap s = new HashMap<Object, Object>(i.length);
  
  public static final HashMap t = new HashMap<Object, Object>(j.length);
  
  public static final HashMap u = new HashMap<Object, Object>(e.length);
  
  public static void a(z41[] paramArrayOfz41, HashMap<Integer, Boolean> paramHashMap) {
    paramHashMap.clear();
    Context context = MyApplication.i.getApplicationContext();
    byte b = 0;
    SharedPreferences sharedPreferences = context.getSharedPreferences("OMV", 0);
    int i = paramArrayOfz41.length;
    while (b < i) {
      z41 z411 = paramArrayOfz41[b];
      boolean bool = sharedPreferences.getBoolean(z411.c, z411.d);
      z411.f = bool;
      paramHashMap.put(Integer.valueOf(z411.a), Boolean.valueOf(bool));
      b++;
    } 
  }
  
  public static void b() {
    c();
    a(b, l);
    a(c, m);
    a(d, n);
    a(e, o);
    a(f, p);
    a(g, q);
    a(h, r);
    a(i, s);
    a(j, t);
    a(k, u);
  }
  
  public static void c() {
    b = new z41[] { new z41(2131297121, 2131886504, "MM_EQL", true, -1), new z41(2131297141, 2131887408, "MM_SLT", true, -1), new z41(2131297135, 2131887275, "MM_SC", true, -1), new z41(2131297122, 2131886364, "MM_CLS", true, -1) };
    z41 z417 = new z41(2131297023, 2131887349, "SS_RGT", true, -1);
    z41 z415 = new z41(2131296964, 2131886219, "SS_ACTR", true, -1);
    z41 z416 = new z41(2131297025, 2131887363, "SS_SHR", true, -1);
    z41 z414 = new z41(2131296983, 2131886487, "SS_EDT", true, -1);
    z41 z413 = new z41(2131297823, 2131887093, "SS_PSP", true, -1);
    boolean bool = ws2.U();
    z41 z411 = a;
    if (bool) {
      z412 = new z41(2131297008, 2131887142, "SS_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    c = new z41[] { 
        z417, z415, z416, z414, z413, z412, new z41(2131296991, 2131886845, "SS_MV", true, -1), new z41(2131296975, 2131886410, "SS_CP", false, -1), new z41(2131296978, 2131886448, "SS_DL", true, -1), new z41(2131297001, 2131887123, "SS_QP", true, -1), 
        new z41(2131297034, 2131887453, "SS_SATS", true, -1) };
    z415 = new z41(2131296958, 2131886131, "ML_ASFL", true, -1);
    z416 = new z41(2131297026, 2131887363, "ML_SHR", true, -1);
    z413 = new z41(2131296983, 2131886487, "ML_EDT", true, -1);
    z414 = new z41(2131297823, 2131887093, PwbbJfsdcHrAjW.ZEqG, true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297008, 2131887142, "ML_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    d = new z41[] { z415, z416, z413, z414, z412, new z41(2131296991, 2131886845, "ML_MV", true, -1), new z41(2131296975, 2131886410, "ML_CP", true, -1), new z41(2131296979, 2131886448, "ML_DL", true, -1), new z41(2131296970, 2131886360, "ML_CLPLHS", true, -1) };
    z41 z4110 = new z41(2131297868, 2131887376, "PT_LRC", true, -1);
    z41 z418 = new z41(2131296967, 2131886253, "PT_BKM", true, -1);
    z41 z419 = new z41(2131297033, 2131887416, "PT_SI", false, -1);
    z416 = new z41(2131296859, 2131887512, "PT_FAV", false, -1);
    z415 = new z41(2131297680, 2131886085, "PT_ABR", true, -1);
    z417 = new z41(2131297823, 2131887442, "PT_PLS", true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297717, 2131886415, "PT_CSFD", true, -1);
    } else {
      z412 = z411;
    } 
    if (ws2.U()) {
      z413 = new z41(2131296962, 2131886290, "PT_CST", true, -1);
    } else {
      z413 = z411;
    } 
    z41 z4114 = new z41(2131297023, 2131887349, "PT_RGT", true, -1);
    z41 z4111 = new z41(2131296964, 2131886219, "PT_ACTR", true, -1);
    z41 z4112 = new z41(2131297025, 2131887365, "PT_SHR", true, -1);
    z41 z4113 = new z41(2131296983, 2131886487, "PT_EDT", true, -1);
    if (ws2.U()) {
      z414 = new z41(2131297014, 2131887190, "PT_RG", true, -1);
    } else {
      z414 = z411;
    } 
    e = new z41[] { 
        z4110, z418, z419, z416, z415, z417, z412, z413, z4114, z4111, 
        z4112, z4113, z414, new z41(2131296991, 2131886845, "PT_MV", true, -1), new z41(2131296975, 2131886410, "PT_CP", false, -1), new z41(2131296978, 2131886448, "PT_DL", true, -1), new z41(2131296994, 2131887382, "PT_SHCTMZ", true, -1), new z41(2131297007, 2131887138, "PT_QAS", true, -1) };
    z419 = new z41(2131296859, 2131887512, "QANP_FAV", true, 2131231057);
    z418 = new z41(2131297033, 2131887416, "QANP_SI", true, 2131231186);
    z417 = new z41(2131297868, 2131887376, "QANP_LRC", false, 2131231410);
    z416 = new z41(2131296967, 2131886253, "QANP_BKM", false, 2131231089);
    z414 = new z41(2131297680, 2131886085, "QANP_ABR", false, 2131231054);
    z415 = new z41(2131297823, 2131887442, "QANP_PLS", false, 2131231369);
    if (ws2.U()) {
      z412 = new z41(2131297717, 2131886415, "QANP_CSFD", false, 2131231122);
    } else {
      z412 = z411;
    } 
    if (ws2.U()) {
      z413 = new z41(2131297014, 2131887190, "QANP_RG", false, 2131231383);
    } else {
      z413 = z411;
    } 
    f = new z41[] { 
        z419, z418, z417, z416, z414, z415, z412, z413, new z41(2131296951, 2131886125, "QANP_ADPL", true, 2131231371), new z41(2131297025, 2131887365, "QANP_SHR", false, 2131231070), 
        new z41(2131297136, 2131887296, "QANP_SRCH", false, 2131231387), new z41(2131297141, 2131887408, "QANP_SLPTM", false, 2131231402) };
    z418 = new z41(2131296949, 2131887371, "FL_SHT", true, -1);
    z414 = new z41(2131296984, 2131887178, "FL_RNF", true, -1);
    z413 = new z41(2131297009, 2131886529, "FL_EXS", true, -1);
    z416 = new z41(2131296958, 2131886131, OETETTfAjV.IaWGGGlGhtt, true, -1);
    z419 = new z41(2131297026, 2131887363, "FL_SHR", true, -1);
    z415 = new z41(2131296983, 2131886487, "FL_EDT", true, -1);
    z417 = new z41(2131297823, 2131887093, "FL_PSP", true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297008, 2131887142, "FL_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    g = new z41[] { 
        z418, z414, z413, z416, z419, z415, z417, z412, new z41(2131296991, 2131886845, "FL_MV", false, -1), new z41(2131296975, 2131886410, "FL_CP", false, -1), 
        new z41(2131296979, 2131886448, "FL_DL", false, -1) };
    z416 = new z41(2131296949, 2131887371, "AL_SHT", true, -1);
    z415 = new z41(2131296958, 2131886131, "AL_ASFL", true, -1);
    z413 = new z41(2131297026, 2131887363, "AL_SHR", true, -1);
    z414 = new z41(2131296983, 2131886487, "AL_EDT", true, -1);
    z417 = new z41(2131297823, 2131887093, "AL_PSP", true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297008, 2131887142, "AL_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    h = new z41[] { z416, z415, z413, z414, z417, z412, new z41(2131296991, 2131886845, "AL_MV", false, -1), new z41(2131296975, 2131886410, "AL_CP", false, -1), new z41(2131296979, 2131886448, "AL_DL", false, -1) };
    z414 = new z41(2131296949, 2131887371, "AR_SHT", true, -1);
    z415 = new z41(2131296958, 2131886131, "AR_ASFL", true, -1);
    z413 = new z41(2131297026, 2131887363, "AR_SHR", true, -1);
    z416 = new z41(2131296983, 2131886487, "AR_EDT", true, -1);
    z417 = new z41(2131297823, 2131887093, "AR_PSP", true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297008, 2131887142, "AR_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    i = new z41[] { z414, z415, z413, z416, z417, z412, new z41(2131296991, 2131886845, "AR_MV", false, -1), new z41(2131296975, 2131886410, "AR_CP", false, -1), new z41(2131296979, 2131886448, "AR_DL", false, -1) };
    z415 = new z41(2131296949, 2131887371, "GN_SHT", true, -1);
    z414 = new z41(2131296958, 2131886131, "GN_ASFL", true, -1);
    z416 = new z41(2131297026, 2131887363, "GN_SHR", true, -1);
    z413 = new z41(2131296983, 2131886487, xveccWbRzqx.CECqqrQF, true, -1);
    z417 = new z41(2131297823, 2131887093, "GN_PSP", true, -1);
    if (ws2.U()) {
      z412 = new z41(2131297008, 2131887142, "GN_RCRG", true, -1);
    } else {
      z412 = z411;
    } 
    j = new z41[] { z415, z414, z416, z413, z417, z412, new z41(2131296991, 2131886845, "GN_MV", false, -1), new z41(2131296975, 2131886410, "GN_CP", false, -1), new z41(2131296979, 2131886448, "GN_DL", false, -1) };
    z414 = new z41(2131296949, 2131887371, "PLS_SHT", true, -1);
    z415 = new z41(2131296958, 2131886131, "PLS_ASFL", true, -1);
    z416 = new z41(2131297026, 2131887363, ckOPp.oHtenwZfNyq, true, -1);
    z413 = new z41(2131296983, 2131886487, "PLS_EDT", true, -1);
    z41 z412 = new z41(2131297823, 2131887093, "PLS_PSP", true, -1);
    if (ws2.U())
      z411 = new z41(2131297008, 2131887142, "PLS_RCRG", true, -1); 
    k = new z41[] { z414, z415, z416, z413, z412, z411, new z41(2131296991, 2131886845, "PLS_MV", false, -1), new z41(2131296975, 2131886410, "PLS_CP", false, -1), new z41(2131296979, 2131886448, "PLS_DL", false, -1) };
  }
  
  public static void d(Context paramContext, String paramString, z41[] paramArrayOfz41, HashMap paramHashMap, Runnable paramRunnable) {
    ArrayList<String> arrayList1 = new ArrayList(paramArrayOfz41.length);
    ArrayList<Integer> arrayList2 = new ArrayList(paramArrayOfz41.length);
    ArrayList<z41> arrayList = new ArrayList(paramArrayOfz41.length);
    byte b = 0;
    boolean bool = false;
    while (b < paramArrayOfz41.length) {
      z41 z411 = paramArrayOfz41[b];
      if (z411.a != -1) {
        arrayList.add(z411);
        arrayList1.add(paramContext.getString(z411.b));
        if (z411.f)
          arrayList2.add(Integer.valueOf(arrayList.size() - 1)); 
        if (z411.f != z411.d)
          bool = true; 
      } 
      b++;
    } 
    ms0 ms0 = new ms0(paramContext);
    ms0.f = paramString;
    ms0.h(arrayList1);
    Integer[] arrayOfInteger = arrayList2.<Integer>toArray(new Integer[0]);
    y41 y41 = new y41(arrayList, paramArrayOfz41, paramHashMap, paramRunnable);
    ms0.N = arrayOfInteger;
    ms0.E = null;
    ms0.F = null;
    ms0.G = y41;
    ms0.n(2131887265);
    ms0.k(2131886278);
    if (bool) {
      ms0.l(2131887193);
      ms0.D = new y41(arrayList, paramArrayOfz41, paramHashMap, paramRunnable);
    } 
    ms0.p();
  }
  
  public static void e(z41[] paramArrayOfz41, HashMap<Integer, Boolean> paramHashMap) {
    Context context = MyApplication.i.getApplicationContext();
    byte b = 0;
    SharedPreferences.Editor editor = context.getSharedPreferences("OMV", 0).edit();
    int i = paramArrayOfz41.length;
    while (b < i) {
      z41 z411 = paramArrayOfz41[b];
      editor.putBoolean(z411.c, z411.f);
      paramHashMap.put(Integer.valueOf(z411.a), Boolean.valueOf(z411.f));
      b++;
    } 
    editor.apply();
  }
  
  static {
    c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */