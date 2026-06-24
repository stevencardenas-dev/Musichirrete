import android.content.Context;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.SparseArray;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import r3.IKWi.AyxAR;

public final class wv {
  public static final Map i;
  
  public static final long[] j = new long[] { 5800000L, 3500000L, 1900000L, 1000000L, 520000L };
  
  public static final long[] k = new long[] { 204000L, 154000L, 139000L, 122000L, 102000L };
  
  public static final long[] l = new long[] { 2200000L, 1150000L, 810000L, 640000L, 450000L };
  
  public static final long[] m = new long[] { 4900000L, 2300000L, 1500000L, 970000L, 540000L };
  
  public static wv n;
  
  public final Context a;
  
  public final SparseArray b;
  
  public final gh1 c;
  
  public final bv0 d;
  
  public final j30 e;
  
  public int f;
  
  public long g;
  
  public long h;
  
  public wv(Context paramContext, SparseArray paramSparseArray, j30 paramj30, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: astore #6
    //   11: goto -> 20
    //   14: aload_1
    //   15: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   18: astore #6
    //   20: aload_0
    //   21: aload #6
    //   23: putfield a : Landroid/content/Context;
    //   26: aload_0
    //   27: aload_2
    //   28: putfield b : Landroid/util/SparseArray;
    //   31: aload_0
    //   32: new gh1
    //   35: dup
    //   36: bipush #24
    //   38: invokespecial <init> : (I)V
    //   41: putfield c : Lgh1;
    //   44: aload_0
    //   45: new bv0
    //   48: dup
    //   49: iconst_3
    //   50: invokespecial <init> : (I)V
    //   53: putfield d : Lbv0;
    //   56: aload_0
    //   57: aload_3
    //   58: putfield e : Lj30;
    //   61: aload_1
    //   62: ifnonnull -> 71
    //   65: iconst_0
    //   66: istore #5
    //   68: goto -> 77
    //   71: aload_1
    //   72: invokestatic d : (Landroid/content/Context;)I
    //   75: istore #5
    //   77: aload_0
    //   78: iload #5
    //   80: putfield f : I
    //   83: aload_2
    //   84: iload #5
    //   86: invokevirtual get : (I)Ljava/lang/Object;
    //   89: checkcast java/lang/Long
    //   92: astore #6
    //   94: aload #6
    //   96: astore_3
    //   97: aload #6
    //   99: ifnonnull -> 111
    //   102: aload_2
    //   103: iconst_0
    //   104: invokevirtual get : (I)Ljava/lang/Object;
    //   107: checkcast java/lang/Long
    //   110: astore_3
    //   111: aload_3
    //   112: astore_2
    //   113: aload_3
    //   114: ifnonnull -> 124
    //   117: ldc2_w 1000000
    //   120: invokestatic valueOf : (J)Ljava/lang/Long;
    //   123: astore_2
    //   124: aload_0
    //   125: aload_2
    //   126: invokevirtual longValue : ()J
    //   129: putfield g : J
    //   132: aload_1
    //   133: ifnull -> 268
    //   136: iload #4
    //   138: ifeq -> 268
    //   141: getstatic vv.c : Lvv;
    //   144: astore_2
    //   145: ldc_w vv
    //   148: monitorenter
    //   149: getstatic vv.c : Lvv;
    //   152: ifnonnull -> 198
    //   155: new vv
    //   158: astore_2
    //   159: aload_2
    //   160: invokespecial <init> : ()V
    //   163: aload_2
    //   164: putstatic vv.c : Lvv;
    //   167: new android/content/IntentFilter
    //   170: astore_2
    //   171: aload_2
    //   172: invokespecial <init> : ()V
    //   175: aload_2
    //   176: ldc_w 'android.net.conn.CONNECTIVITY_CHANGE'
    //   179: invokevirtual addAction : (Ljava/lang/String;)V
    //   182: aload_1
    //   183: getstatic vv.c : Lvv;
    //   186: aload_2
    //   187: invokestatic h : (Landroid/content/Context;Lvv;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   190: pop
    //   191: goto -> 198
    //   194: astore_1
    //   195: goto -> 262
    //   198: getstatic vv.c : Lvv;
    //   201: astore_1
    //   202: ldc_w vv
    //   205: monitorexit
    //   206: aload_1
    //   207: monitorenter
    //   208: aload_1
    //   209: invokevirtual a : ()V
    //   212: aload_1
    //   213: getfield b : Ljava/util/ArrayList;
    //   216: astore_3
    //   217: new java/lang/ref/WeakReference
    //   220: astore_2
    //   221: aload_2
    //   222: aload_0
    //   223: invokespecial <init> : (Ljava/lang/Object;)V
    //   226: aload_3
    //   227: aload_2
    //   228: invokevirtual add : (Ljava/lang/Object;)Z
    //   231: pop
    //   232: aload_1
    //   233: getfield a : Landroid/os/Handler;
    //   236: astore_3
    //   237: new e6
    //   240: astore_2
    //   241: aload_2
    //   242: iconst_4
    //   243: aload_1
    //   244: aload_0
    //   245: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   248: aload_3
    //   249: aload_2
    //   250: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   253: pop
    //   254: aload_1
    //   255: monitorexit
    //   256: return
    //   257: astore_2
    //   258: aload_1
    //   259: monitorexit
    //   260: aload_2
    //   261: athrow
    //   262: ldc_w vv
    //   265: monitorexit
    //   266: aload_1
    //   267: athrow
    //   268: return
    // Exception table:
    //   from	to	target	type
    //   149	191	194	finally
    //   198	202	194	finally
    //   208	254	257	finally
    //   258	260	257	finally
    //   262	266	194	finally
  }
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("AD", new int[] { 0, 2, 0, 0 });
    hashMap.put("AE", new int[] { 2, 4, 4, 4 });
    hashMap.put("AF", new int[] { 4, 4, 3, 3 });
    hashMap.put("AG", new int[] { 4, 2, 2, 3 });
    hashMap.put("AI", new int[] { 0, 3, 2, 4 });
    hashMap.put("AL", new int[] { 1, 2, 0, 1 });
    hashMap.put("AM", new int[] { 2, 2, 1, 2 });
    hashMap.put("AO", new int[] { 3, 4, 3, 1 });
    hashMap.put("AQ", new int[] { 4, 2, 2, 2 });
    hashMap.put("AR", new int[] { 2, 3, 1, 2 });
    hashMap.put("AS", new int[] { 2, 2, 4, 2 });
    hashMap.put("AT", new int[] { 0, 3, 0, 0 });
    hashMap.put("AU", new int[] { 0, 2, 0, 1 });
    hashMap.put("AW", new int[] { 1, 1, 2, 4 });
    hashMap.put("AX", new int[] { 0, 1, 0, 0 });
    hashMap.put("AZ", new int[] { 3, 3, 3, 3 });
    hashMap.put("BA", new int[] { 1, 1, 0, 1 });
    hashMap.put(tlzLOCPTHRhep.GXdWlbv, new int[] { 0, 3, 0, 0 });
    hashMap.put("BD", new int[] { 2, 0, 4, 3 });
    hashMap.put("BE", new int[] { 0, 1, 2, 3 });
    hashMap.put("BF", new int[] { 4, 4, 4, 1 });
    hashMap.put("BG", new int[] { 0, 1, 0, 0 });
    hashMap.put("BH", new int[] { 1, 0, 3, 4 });
    hashMap.put("BI", new int[] { 4, 4, 4, 4 });
    hashMap.put("BJ", new int[] { 4, 4, 3, 4 });
    hashMap.put("BL", new int[] { 1, 0, 4, 3 });
    hashMap.put("BM", new int[] { 0, 1, 0, 0 });
    hashMap.put("BN", new int[] { 4, 0, 2, 4 });
    hashMap.put("BO", new int[] { 1, 3, 3, 3 });
    hashMap.put("BQ", new int[] { 1, 0, 1, 0 });
    hashMap.put("BR", new int[] { 2, 4, 3, 1 });
    hashMap.put("BS", new int[] { 3, 1, 1, 3 });
    hashMap.put("BT", new int[] { 3, 0, 3, 1 });
    hashMap.put("BW", new int[] { 3, 4, 3, 3 });
    hashMap.put(nFLlOYeP.fDLcAaIqMDDYsLr, new int[] { 0, 1, 1, 1 });
    hashMap.put("BZ", new int[] { 1, 3, 2, 1 });
    hashMap.put("CA", new int[] { 0, 3, 2, 2 });
    hashMap.put("CD", new int[] { 3, 4, 2, 2 });
    hashMap.put("CF", new int[] { 4, 3, 2, 2 });
    hashMap.put("CG", new int[] { 3, 4, 1, 1 });
    hashMap.put("CH", new int[] { 0, 0, 0, 0 });
    hashMap.put("CI", new int[] { 3, 4, 3, 3 });
    hashMap.put("CK", new int[] { 2, 0, 1, 0 });
    hashMap.put("CL", new int[] { 1, 2, 2, 3 });
    hashMap.put(hrSTyFuSIm.ZtGt, new int[] { 3, 4, 3, 2 });
    hashMap.put(OETETTfAjV.AydwhRM, new int[] { 1, 0, 1, 1 });
    hashMap.put("CO", new int[] { 2, 3, 3, 2 });
    hashMap.put("CR", new int[] { 2, 2, 4, 4 });
    hashMap.put(IGBYXeDFmKYajx.OKNhjxEnwoCdL, new int[] { 4, 4, 2, 1 });
    hashMap.put("CV", new int[] { 2, 3, 3, 2 });
    hashMap.put("CW", new int[] { 1, 1, 0, 0 });
    hashMap.put("CY", new int[] { 1, 1, 0, 0 });
    hashMap.put("CZ", new int[] { 0, 1, 0, 0 });
    hashMap.put("DE", new int[] { 0, 1, 2, 3 });
    hashMap.put("DJ", new int[] { 4, 2, 4, 4 });
    hashMap.put("DK", new int[] { 0, 0, 1, 0 });
    hashMap.put("DM", new int[] { 1, 1, 0, 2 });
    hashMap.put("DO", new int[] { 3, 3, 4, 4 });
    hashMap.put("DZ", new int[] { 3, 3, 4, 4 });
    hashMap.put("EC", new int[] { 2, 3, 4, 2 });
    hashMap.put(jHxlGgUTadw.mPwpTBv, new int[] { 0, 0, 0, 0 });
    hashMap.put("EG", new int[] { 3, 4, 2, 1 });
    hashMap.put("EH", new int[] { 2, 0, 3, 1 });
    hashMap.put("ER", new int[] { 4, 2, 4, 4 });
    hashMap.put("ES", new int[] { 0, 1, 1, 1 });
    hashMap.put(oXrNDUqUkE.TScWSejOneFTNBR, new int[] { 4, 4, 4, 1 });
    hashMap.put("FI", new int[] { 0, 0, 1, 0 });
    hashMap.put("FJ", new int[] { 3, 0, 4, 4 });
    hashMap.put("FK", new int[] { 2, 2, 2, 1 });
    hashMap.put("FM", new int[] { 3, 2, 4, 1 });
    hashMap.put("FO", new int[] { 1, 1, 0, 0 });
    hashMap.put("FR", new int[] { 1, 1, 1, 1 });
    hashMap.put("GA", new int[] { 3, 2, 2, 2 });
    hashMap.put("GB", new int[] { 0, 1, 1, 1 });
    hashMap.put("GD", new int[] { 1, 1, 3, 1 });
    hashMap.put(nFLlOYeP.RqiUprKmHVEDbx, new int[] { 1, 0, 1, 4 });
    hashMap.put("GF", new int[] { 2, 0, 1, 3 });
    hashMap.put("GG", new int[] { 1, 0, 0, 0 });
    hashMap.put("GH", new int[] { 3, 3, 3, 3 });
    hashMap.put("GI", new int[] { 4, 4, 0, 0 });
    hashMap.put("GL", new int[] { 2, 1, 1, 2 });
    hashMap.put("GM", new int[] { 4, 3, 2, 4 });
    hashMap.put("GN", new int[] { 3, 4, 4, 2 });
    hashMap.put("GP", new int[] { 2, 1, 3, 4 });
    hashMap.put("GQ", new int[] { 4, 4, 4, 0 });
    hashMap.put("GR", new int[] { 1, 1, 0, 1 });
    hashMap.put("GT", new int[] { 3, 2, 2, 2 });
    hashMap.put("GU", new int[] { 1, 0, 2, 2 });
    hashMap.put("GW", new int[] { 3, 4, 4, 3 });
    hashMap.put("GY", new int[] { 3, 2, 1, 1 });
    hashMap.put("HK", new int[] { 0, 2, 3, 4 });
    hashMap.put("HN", new int[] { 3, 1, 3, 3 });
    hashMap.put("HR", new int[] { 1, 1, 0, 1 });
    hashMap.put("HT", new int[] { 4, 4, 4, 4 });
    hashMap.put("HU", new int[] { 0, 1, 0, 0 });
    hashMap.put(zpEN.NNZirvp, new int[] { 2, 2, 2, 3 });
    hashMap.put("IE", new int[] { 1, 0, 1, 1 });
    hashMap.put("IL", new int[] { 1, 0, 2, 3 });
    hashMap.put("IM", new int[] { 0, 0, 0, 1 });
    hashMap.put("IN", new int[] { 2, 2, 4, 3 });
    hashMap.put("IO", new int[] { 4, 4, 2, 3 });
    hashMap.put("IQ", new int[] { 3, 3, 4, 2 });
    hashMap.put("IR", new int[] { 3, 0, 2, 1 });
    hashMap.put("IS", new int[] { 0, 1, 0, 0 });
    hashMap.put("IT", new int[] { 1, 1, 1, 2 });
    hashMap.put("JE", new int[] { 1, 0, 0, 1 });
    hashMap.put("JM", new int[] { 3, 3, 3, 4 });
    hashMap.put("JO", new int[] { 1, 2, 1, 1 });
    hashMap.put("JP", new int[] { 0, 2, 0, 0 });
    hashMap.put("KE", new int[] { 3, 4, 3, 3 });
    hashMap.put(hbrAVtEa.iteuwQKgIPkN, new int[] { 2, 0, 2, 2 });
    hashMap.put("KH", new int[] { 1, 0, 4, 3 });
    hashMap.put(ckOPp.JTEcdYkgNSytSi, new int[] { 4, 4, 4, 0 });
    hashMap.put("KM", new int[] { 4, 3, 2, 4 });
    hashMap.put("KN", new int[] { 1, 0, 2, 4 });
    hashMap.put("KP", new int[] { 4, 2, 0, 2 });
    hashMap.put("KR", new int[] { 0, 1, 0, 1 });
    hashMap.put("KW", new int[] { 2, 3, 1, 2 });
    hashMap.put("KY", new int[] { 3, 1, 2, 3 });
    hashMap.put("KZ", new int[] { 1, 2, 2, 2 });
    hashMap.put("LA", new int[] { 2, 2, 1, 1 });
    hashMap.put("LB", new int[] { 3, 2, 0, 0 });
    hashMap.put("LC", new int[] { 1, 1, 0, 0 });
    hashMap.put("LI", new int[] { 0, 0, 1, 1 });
    hashMap.put("LK", new int[] { 2, 0, 2, 3 });
    hashMap.put("LR", new int[] { 3, 4, 4, 2 });
    hashMap.put("LS", new int[] { 3, 3, 2, 2 });
    hashMap.put("LT", new int[] { 0, 0, 0, 0 });
    hashMap.put("LU", new int[] { 0, 0, 0, 0 });
    hashMap.put("LV", new int[] { 0, 0, 0, 0 });
    hashMap.put("LY", new int[] { 3, 3, 4, 3 });
    hashMap.put("MA", new int[] { 3, 2, 3, 2 });
    hashMap.put("MC", new int[] { 0, 4, 0, 0 });
    hashMap.put("MD", new int[] { 1, 1, 0, 0 });
    hashMap.put("ME", new int[] { 1, 3, 1, 2 });
    hashMap.put("MF", new int[] { 2, 3, 1, 1 });
    hashMap.put("MG", new int[] { 3, 4, 2, 3 });
    hashMap.put("MH", new int[] { 4, 0, 2, 4 });
    hashMap.put("MK", new int[] { 1, 0, 0, 0 });
    hashMap.put("ML", new int[] { 4, 4, 2, 0 });
    hashMap.put("MM", new int[] { 3, 3, 2, 2 });
    hashMap.put("MN", new int[] { 2, 3, 1, 1 });
    hashMap.put("MO", new int[] { 0, 0, 4, 4 });
    hashMap.put("MP", new int[] { 0, 2, 1, 2 });
    hashMap.put("MQ", new int[] { 2, 1, 1, 3 });
    hashMap.put("MR", new int[] { 4, 2, 4, 4 });
    hashMap.put("MS", new int[] { 1, 4, 3, 4 });
    hashMap.put("MT", new int[] { 0, 0, 0, 0 });
    hashMap.put("MU", new int[] { 2, 2, 4, 4 });
    hashMap.put("MV", new int[] { 4, 3, 2, 4 });
    hashMap.put("MW", new int[] { 3, 1, 1, 1 });
    hashMap.put("MX", new int[] { 2, 4, 3, 3 });
    hashMap.put("MY", new int[] { 2, 1, 3, 3 });
    hashMap.put("MZ", new int[] { 3, 3, 3, 3 });
    hashMap.put("NA", new int[] { 4, 3, 3, 3 });
    hashMap.put("NC", new int[] { 2, 0, 4, 4 });
    hashMap.put("NE", new int[] { 4, 4, 4, 4 });
    hashMap.put("NF", new int[] { 1, 2, 2, 0 });
    hashMap.put("NG", new int[] { 3, 3, 2, 2 });
    hashMap.put("NI", new int[] { 3, 2, 4, 3 });
    hashMap.put("NL", new int[] { 0, 2, 3, 2 });
    hashMap.put("NO", new int[] { 0, 2, 1, 0 });
    hashMap.put("NP", new int[] { 2, 2, 2, 2 });
    hashMap.put("NR", new int[] { 4, 0, 3, 2 });
    hashMap.put("NZ", new int[] { 0, 0, 1, 2 });
    hashMap.put("OM", new int[] { 2, 3, 0, 2 });
    hashMap.put("PA", new int[] { 1, 3, 3, 3 });
    hashMap.put("PE", new int[] { 2, 4, 4, 4 });
    hashMap.put("PF", new int[] { 2, 1, 1, 1 });
    hashMap.put("PG", new int[] { 4, 3, 3, 2 });
    hashMap.put("PH", new int[] { 3, 0, 3, 4 });
    hashMap.put("PK", new int[] { 3, 2, 3, 2 });
    hashMap.put(PwbbJfsdcHrAjW.FHKuvhRIidYgV, new int[] { 1, 0, 1, 2 });
    hashMap.put("PM", new int[] { 0, 2, 2, 0 });
    hashMap.put("PR", new int[] { 2, 2, 2, 2 });
    hashMap.put("PS", new int[] { 3, 3, 1, 4 });
    hashMap.put("PT", new int[] { 1, 1, 0, 0 });
    hashMap.put("PW", new int[] { 1, 1, 3, 0 });
    hashMap.put("PY", new int[] { 2, 0, 3, 3 });
    hashMap.put("QA", new int[] { 2, 3, 1, 1 });
    hashMap.put("RE", new int[] { 1, 0, 2, 2 });
    hashMap.put(FgdLmmRfTxSFKI.RnCdCDNhdOlK, new int[] { 0, 1, 1, 2 });
    hashMap.put("RS", new int[] { 1, 2, 0, 0 });
    hashMap.put("RU", new int[] { 0, 1, 0, 1 });
    hashMap.put("RW", new int[] { 4, 4, 4, 4 });
    hashMap.put("SA", new int[] { 2, 2, 2, 1 });
    hashMap.put("SB", new int[] { 4, 4, 4, 1 });
    hashMap.put("SC", new int[] { 4, 2, 0, 1 });
    hashMap.put("SD", new int[] { 4, 4, 4, 4 });
    hashMap.put("SE", new int[] { 0, 1, 0, 0 });
    hashMap.put("SG", new int[] { 1, 0, 3, 3 });
    hashMap.put("SH", new int[] { 4, 2, 2, 2 });
    hashMap.put("SI", new int[] { 0, 1, 0, 0 });
    hashMap.put("SJ", new int[] { 2, 2, 2, 4 });
    hashMap.put(YbNJ.iftiYe, new int[] { 0, 1, 0, 0 });
    hashMap.put("SL", new int[] { 4, 3, 3, 1 });
    hashMap.put("SM", new int[] { 0, 0, 1, 2 });
    hashMap.put("SN", new int[] { 4, 4, 4, 3 });
    hashMap.put("SO", new int[] { 3, 4, 3, 4 });
    hashMap.put("SR", new int[] { 2, 2, 2, 1 });
    hashMap.put("SS", new int[] { 4, 4, 4, 4 });
    hashMap.put("ST", new int[] { 2, 3, 1, 2 });
    hashMap.put("SV", new int[] { 2, 2, 4, 4 });
    hashMap.put("SX", new int[] { 2, 4, 1, 0 });
    hashMap.put(AyxAR.amxcUYjm, new int[] { 4, 3, 1, 1 });
    hashMap.put("SZ", new int[] { 4, 4, 3, 4 });
    hashMap.put("TC", new int[] { 1, 2, 1, 0 });
    hashMap.put("TD", new int[] { 4, 4, 4, 3 });
    hashMap.put("TG", new int[] { 3, 2, 1, 0 });
    hashMap.put("TH", new int[] { 1, 3, 3, 3 });
    hashMap.put("TJ", new int[] { 4, 4, 4, 4 });
    hashMap.put("TL", new int[] { 4, 2, 4, 4 });
    hashMap.put("TM", new int[] { 4, 2, 2, 2 });
    hashMap.put("TN", new int[] { 2, 1, 1, 1 });
    hashMap.put("TO", new int[] { 4, 3, 4, 4 });
    hashMap.put("TR", new int[] { 1, 2, 1, 1 });
    hashMap.put("TT", new int[] { 1, 3, 2, 4 });
    hashMap.put("TV", new int[] { 4, 2, 3, 4 });
    hashMap.put("TW", new int[] { 0, 0, 0, 0 });
    hashMap.put("TZ", new int[] { 3, 4, 3, 3 });
    hashMap.put("UA", new int[] { 0, 3, 1, 1 });
    hashMap.put("UG", new int[] { 3, 2, 2, 3 });
    hashMap.put("US", new int[] { 0, 1, 2, 2 });
    hashMap.put("UY", new int[] { 2, 1, 2, 2 });
    hashMap.put("UZ", new int[] { 2, 2, 3, 2 });
    hashMap.put("VA", new int[] { 0, 2, 2, 2 });
    hashMap.put("VC", new int[] { 2, 3, 0, 2 });
    hashMap.put("VE", new int[] { 4, 4, 4, 4 });
    hashMap.put("VG", new int[] { 3, 1, 2, 4 });
    hashMap.put("VI", new int[] { 1, 4, 4, 3 });
    hashMap.put("VN", new int[] { 0, 1, 3, 4 });
    hashMap.put("VU", new int[] { 4, 0, 3, 3 });
    hashMap.put("WS", new int[] { 3, 2, 4, 3 });
    hashMap.put("XK", new int[] { 1, 2, 1, 0 });
    hashMap.put("YE", new int[] { 4, 4, 4, 3 });
    hashMap.put("YT", new int[] { 2, 2, 2, 3 });
    hashMap.put("ZA", new int[] { 2, 3, 2, 2 });
    hashMap.put("ZM", new int[] { 3, 2, 3, 3 });
    hashMap.put("ZW", new int[] { 3, 3, 2, 3 });
    i = Collections.unmodifiableMap(hashMap);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */