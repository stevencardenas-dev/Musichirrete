package in.krosbits.musicolet;

import a51;
import ag0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.insets.ProtectionLayout;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import ba1;
import bt1;
import c91;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import f;
import f1;
import g92;
import ga1;
import hn;
import hp0;
import il1;
import im0;
import in.krosbits.pref.UnImportantPref;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import ip0;
import j01;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import jf1;
import jl1;
import jm1;
import jn;
import jp0;
import ju;
import kl1;
import kv0;
import l21;
import l3;
import l90;
import lb;
import lb0;
import lm0;
import lt;
import m91;
import m92;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import ml1;
import ms0;
import n0;
import n21;
import nl1;
import no;
import ns0;
import o9;
import o90;
import ol1;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import p71;
import pc;
import pi0;
import ps0;
import qi0;
import ql0;
import ql1;
import qo;
import r90;
import rj1;
import rl1;
import rn;
import rs0;
import s9;
import sj1;
import sl1;
import ss0;
import tb;
import tj1;
import tn;
import u00;
import ua0;
import un;
import uo0;
import v50;
import vn;
import wf2;
import wn;
import wp1;
import xw;
import y00;
import yp1;
import z00;
import z21;
import z51;
import zi1;
import zp0;

public class SettingsActivity extends pc implements m91, sj1, tj1, Cursor, View.OnClickListener, rj1 {
  public static SettingsActivity m0;
  
  public jp0 R;
  
  public SearchView S;
  
  public LayoutInflater T;
  
  public ql1 U;
  
  public final ArrayList V = new ArrayList();
  
  public final ArrayList W = new ArrayList();
  
  public boolean X;
  
  public String Y;
  
  public sl1 Z;
  
  public SharedPreferences a0;
  
  public kv0 b0;
  
  public ss0 c0;
  
  public String d0 = null;
  
  public final Handler e0 = new Handler();
  
  public no f0 = null;
  
  public boolean g0;
  
  public Toast h0 = null;
  
  public final nl1 i0 = new nl1(this, 0);
  
  public final l90 j0 = new l90(this, 9);
  
  public boolean k0 = false;
  
  public final nl1 l0 = new nl1(this, 1);
  
  public static void o0(SettingsActivity paramSettingsActivity) {
    InputMethodManager inputMethodManager = (InputMethodManager)paramSettingsActivity.getSystemService("input_method");
    if (inputMethodManager != null) {
      byte b = 0;
      while (true) {
        if (b < 3) {
          (new String[3])[0] = "mCurRootView";
          (new String[3])[1] = "mServedView";
          (new String[3])[2] = "mNextServedView";
          String str = (new String[3])[b];
          try {
            Field field = inputMethodManager.getClass().getDeclaredField(str);
            if (!field.isAccessible())
              field.setAccessible(true); 
            Object object = field.get(inputMethodManager);
            if (object instanceof View) {
              object = object;
              if (object.getContext() == paramSettingsActivity) {
                field.set(inputMethodManager, null);
              } else {
                String str1 = eRUgfgGAccgka.RXrvebnjOJyZ;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append(PwbbJfsdcHrAjW.lheUA);
                stringBuilder.append(object.getContext());
                stringBuilder.append(" dest_context=");
                stringBuilder.append(paramSettingsActivity);
                Log.e(str1, stringBuilder.toString());
                return;
              } 
            } 
          } finally {}
          b++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public static void q0(Activity paramActivity, String paramString1, String paramString2, int paramInt) {
    // Byte code:
    //   0: new android/content/Intent
    //   3: astore #9
    //   5: aload #9
    //   7: ldc 'android.settings.VIEW_ADVANCED_POWER_USAGE_DETAIL'
    //   9: invokespecial <init> : (Ljava/lang/String;)V
    //   12: new java/lang/StringBuilder
    //   15: astore #8
    //   17: aload #8
    //   19: ldc 'package:'
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: aload #8
    //   26: aload_1
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload #9
    //   33: aload #8
    //   35: invokevirtual toString : ()Ljava/lang/String;
    //   38: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   41: invokevirtual setData : (Landroid/net/Uri;)Landroid/content/Intent;
    //   44: pop
    //   45: getstatic android/os/Build$VERSION.SDK_INT : I
    //   48: istore #4
    //   50: iload #4
    //   52: bipush #31
    //   54: if_icmplt -> 82
    //   57: aload #9
    //   59: aload_0
    //   60: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   63: invokevirtual resolveActivity : (Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //   66: astore #8
    //   68: aload #8
    //   70: astore #10
    //   72: goto -> 88
    //   75: astore #8
    //   77: aload #8
    //   79: invokevirtual printStackTrace : ()V
    //   82: aconst_null
    //   83: astore #8
    //   85: goto -> 68
    //   88: aload #10
    //   90: ifnull -> 99
    //   93: iconst_1
    //   94: istore #5
    //   96: goto -> 102
    //   99: iconst_0
    //   100: istore #5
    //   102: aload #9
    //   104: astore #8
    //   106: iload #5
    //   108: ifne -> 216
    //   111: aload #9
    //   113: astore #8
    //   115: invokestatic G : ()Z
    //   118: ifeq -> 216
    //   121: aload #9
    //   123: astore #8
    //   125: getstatic android/os/Build$VERSION.SDK_INT : I
    //   128: bipush #26
    //   130: if_icmplt -> 216
    //   133: new android/content/Intent
    //   136: astore #9
    //   138: aload #9
    //   140: invokespecial <init> : ()V
    //   143: aload #9
    //   145: ldc 'com.miui.powerkeeper'
    //   147: ldc 'com.miui.powerkeeper.ui.HiddenAppsConfigActivity'
    //   149: invokevirtual setClassName : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   152: pop
    //   153: aload #9
    //   155: getstatic com/sdsmdg/harjot/crollerTest/TG/ckOPp.iiGRBBDO : Ljava/lang/String;
    //   158: aload_1
    //   159: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   162: pop
    //   163: aload #9
    //   165: ldc 'package_label'
    //   167: aload_2
    //   168: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   171: pop
    //   172: aload #9
    //   174: aload_0
    //   175: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   178: invokevirtual resolveActivity : (Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //   181: astore #8
    //   183: aload #8
    //   185: astore #10
    //   187: goto -> 197
    //   190: astore #8
    //   192: aload #8
    //   194: invokevirtual printStackTrace : ()V
    //   197: aload #9
    //   199: astore #8
    //   201: aload #10
    //   203: ifnull -> 216
    //   206: aload #9
    //   208: astore #8
    //   210: iconst_1
    //   211: istore #6
    //   213: goto -> 219
    //   216: iconst_0
    //   217: istore #6
    //   219: new java/lang/StringBuilder
    //   222: astore #9
    //   224: aload #9
    //   226: ldc '<b>'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: aload #9
    //   233: aload_0
    //   234: ldc 2131887031
    //   236: invokevirtual getString : (I)Ljava/lang/String;
    //   239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload #9
    //   245: ldc_w '</b>'
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: iload #5
    //   254: ifne -> 356
    //   257: iload #6
    //   259: ifeq -> 265
    //   262: goto -> 356
    //   265: aload #9
    //   267: ldc_w '<br/><br/>(1) '
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #9
    //   276: aload_0
    //   277: ldc_w 2131887340
    //   280: iconst_1
    //   281: anewarray java/lang/Object
    //   284: dup
    //   285: iconst_0
    //   286: aload_0
    //   287: ldc_w 2131886158
    //   290: invokevirtual getString : (I)Ljava/lang/String;
    //   293: aastore
    //   294: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: pop
    //   301: aload #9
    //   303: ldc_w '<br/>(2) '
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload #9
    //   312: aload_0
    //   313: ldc_w 2131886574
    //   316: iconst_1
    //   317: anewarray java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: aload_2
    //   323: aastore
    //   324: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload #9
    //   333: ldc_w '<br/>(3) '
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: pop
    //   340: aload #9
    //   342: aload_0
    //   343: ldc_w 2131887527
    //   346: invokevirtual getString : (I)Ljava/lang/String;
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: goto -> 438
    //   356: getstatic android/os/Build$VERSION.SDK_INT : I
    //   359: bipush #35
    //   361: if_icmplt -> 416
    //   364: iload #5
    //   366: ifeq -> 416
    //   369: aload #9
    //   371: ldc_w '<br/><br/>(1) '
    //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: pop
    //   378: aload #9
    //   380: aload_0
    //   381: ldc_w 2131887253
    //   384: invokevirtual getString : (I)Ljava/lang/String;
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload #9
    //   393: ldc_w '<br/><br/>(2) '
    //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: pop
    //   400: aload #9
    //   402: aload_0
    //   403: ldc_w 2131887254
    //   406: invokevirtual getString : (I)Ljava/lang/String;
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: goto -> 438
    //   416: aload #9
    //   418: ldc_w '<br/><br/>'
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: pop
    //   425: aload #9
    //   427: aload_0
    //   428: ldc_w 2131887527
    //   431: invokevirtual getString : (I)Ljava/lang/String;
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: pop
    //   438: new ms0
    //   441: astore_2
    //   442: aload_2
    //   443: aload_0
    //   444: invokespecial <init> : (Landroid/content/Context;)V
    //   447: aload_2
    //   448: ldc_w 2131492958
    //   451: iconst_1
    //   452: invokevirtual e : (IZ)V
    //   455: aload_2
    //   456: ldc_w 2131886278
    //   459: invokevirtual k : (I)V
    //   462: aload_2
    //   463: ldc_w 2131886983
    //   466: invokevirtual n : (I)V
    //   469: aload_2
    //   470: iconst_0
    //   471: putfield P : Z
    //   474: new ll1
    //   477: astore #10
    //   479: aload #10
    //   481: iload #5
    //   483: iload #6
    //   485: aload_0
    //   486: aload #8
    //   488: iload_3
    //   489: invokespecial <init> : (ZZLandroid/app/Activity;Landroid/content/Intent;I)V
    //   492: aload_2
    //   493: aload #10
    //   495: putfield D : Lrs0;
    //   498: aload_2
    //   499: getfield u : Landroid/view/View;
    //   502: ldc_w 2131297758
    //   505: invokevirtual findViewById : (I)Landroid/view/View;
    //   508: checkcast android/widget/TextView
    //   511: aload #9
    //   513: invokevirtual toString : ()Ljava/lang/String;
    //   516: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   519: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   522: ldc_w 'in.krosbits.castplugin'
    //   525: aload_1
    //   526: invokevirtual equals : (Ljava/lang/Object;)Z
    //   529: istore #7
    //   531: aload_2
    //   532: getfield u : Landroid/view/View;
    //   535: astore_0
    //   536: iload #5
    //   538: ifeq -> 577
    //   541: aload_0
    //   542: ldc_w 2131296864
    //   545: invokevirtual findViewById : (I)Landroid/view/View;
    //   548: checkcast android/widget/ImageView
    //   551: astore_0
    //   552: iload #7
    //   554: ifeq -> 567
    //   557: aload_0
    //   558: ldc_w 2131231051
    //   561: invokevirtual setImageResource : (I)V
    //   564: goto -> 641
    //   567: aload_0
    //   568: ldc_w 2131231050
    //   571: invokevirtual setImageResource : (I)V
    //   574: goto -> 641
    //   577: iload #6
    //   579: ifeq -> 618
    //   582: aload_0
    //   583: ldc_w 2131296864
    //   586: invokevirtual findViewById : (I)Landroid/view/View;
    //   589: checkcast android/widget/ImageView
    //   592: astore_0
    //   593: iload #7
    //   595: ifeq -> 608
    //   598: aload_0
    //   599: ldc_w 2131231047
    //   602: invokevirtual setImageResource : (I)V
    //   605: goto -> 641
    //   608: aload_0
    //   609: ldc_w 2131231046
    //   612: invokevirtual setImageResource : (I)V
    //   615: goto -> 641
    //   618: aload_0
    //   619: ldc_w 2131296864
    //   622: invokevirtual findViewById : (I)Landroid/view/View;
    //   625: checkcast android/widget/ImageView
    //   628: astore_0
    //   629: iload #7
    //   631: ifeq -> 641
    //   634: aload_0
    //   635: ldc_w 2131231049
    //   638: invokevirtual setImageResource : (I)V
    //   641: aload_2
    //   642: invokevirtual p : ()Lss0;
    //   645: pop
    //   646: goto -> 654
    //   649: astore_0
    //   650: aload_0
    //   651: invokevirtual printStackTrace : ()V
    //   654: return
    // Exception table:
    //   from	to	target	type
    //   0	50	649	android/content/ActivityNotFoundException
    //   57	68	75	finally
    //   77	82	649	android/content/ActivityNotFoundException
    //   115	121	649	android/content/ActivityNotFoundException
    //   125	172	649	android/content/ActivityNotFoundException
    //   172	183	190	finally
    //   192	197	649	android/content/ActivityNotFoundException
    //   219	252	649	android/content/ActivityNotFoundException
    //   265	353	649	android/content/ActivityNotFoundException
    //   356	364	649	android/content/ActivityNotFoundException
    //   369	413	649	android/content/ActivityNotFoundException
    //   416	438	649	android/content/ActivityNotFoundException
    //   438	531	649	android/content/ActivityNotFoundException
    //   541	552	649	android/content/ActivityNotFoundException
    //   557	564	649	android/content/ActivityNotFoundException
    //   567	574	649	android/content/ActivityNotFoundException
    //   582	593	649	android/content/ActivityNotFoundException
    //   598	605	649	android/content/ActivityNotFoundException
    //   608	615	649	android/content/ActivityNotFoundException
    //   618	629	649	android/content/ActivityNotFoundException
    //   634	641	649	android/content/ActivityNotFoundException
    //   641	646	649	android/content/ActivityNotFoundException
  }
  
  public static void r0(Activity paramActivity, int paramInt) {
    if (MyApplication.F.p()) {
      paramActivity.startActivityForResult(new Intent((Context)paramActivity, IncludedFoldersActivity.class), paramInt);
      return;
    } 
    paramActivity.startActivity((new Intent((Context)paramActivity, WelcomeActivity.class)).putExtra(KjdXPYm.EAqkNhQ, new int[] { 4 }));
  }
  
  public static void t0(Context paramContext) {
    if (MusicService.E0 instanceof fl) {
      ms0 ms0 = new ms0(paramContext);
      ms0.q(2131886415);
      ms0.d(paramContext.getString(2131886339));
      ms0.n(2131887030);
      ms0.p();
      return;
    } 
    int j = MyApplication.o().getInt("etu2", 0);
    int i = 1;
    if (j == 1) {
      ms0 ms0 = new ms0(paramContext);
      ms0.q(2131886415);
      ms0.d(paramContext.getString(2131887014, new Object[] { paramContext.getString(2131887483) }));
      ms0.n(2131887030);
      ms0.p();
      return;
    } 
    int[] arrayOfInt = new int[60];
    String[] arrayOfString = new String[60];
    arrayOfInt[0] = 0;
    arrayOfString[0] = paramContext.getString(2131886134);
    while (i < 60) {
      j = i + 1;
      int k = j * 1000;
      arrayOfInt[i] = k;
      arrayOfString[i] = ag0.u(3, k);
      i = j;
    } 
    ag0.J0(paramContext, paramContext.getString(2131886415), null, null, "k_i_cfd", 0, Arrays.asList(arrayOfString), arrayOfInt, null, null, (Runnable)new l3(14));
  }
  
  public static void u0(Context paramContext, String paramString) {
    Context context;
    SharedPreferences sharedPreferences = MyApplication.o();
    if ("k_s_ffd".equals(paramString)) {
      context = MyApplication.i.getApplicationContext();
      i = 2131886558;
    } else {
      context = MyApplication.i.getApplicationContext();
      i = 2131887252;
    } 
    String str2 = context.getString(i);
    StringBuilder stringBuilder = ga1.l(str2, " (");
    stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131886689));
    stringBuilder.append(")");
    String str1 = stringBuilder.toString();
    int i = sharedPreferences.getInt(paramString, 10);
    ms0 ms0 = new ms0(paramContext);
    ms0.f = str1;
    ms0.g(str1, String.valueOf(i), false, (ns0)new jl1(paramString, 2));
    ms0.n(2131887030);
    ms0.k(2131886278);
    EditText editText = (ms0.p()).n;
    editText.setInputType(2);
    editText.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(3) });
  }
  
  public static void w0(Context paramContext) {
    Context context = paramContext.getApplicationContext();
    ms0 ms0 = new ms0(paramContext);
    ms0.q(2131886216);
    ms0.c(2131887591);
    ms0.n(2131886844);
    ms0.P = false;
    ms0.D = (rs0)new kl1(context);
    ms0.p();
  }
  
  public static void y0(SettingsActivity paramSettingsActivity, String paramString) {
    Spanned spanned;
    int i;
    Context context;
    if ("k_f_rgpa".equals(paramString)) {
      context = MyApplication.i.getApplicationContext();
      i = 2131887108;
    } else {
      context = MyApplication.i.getApplicationContext();
      i = 2131887109;
    } 
    String str1 = context.getString(i);
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str1);
    stringBuilder2.append(" (dB)");
    String str2 = stringBuilder2.toString();
    float f = MyApplication.o().getFloat(paramString, 0.0F);
    boolean bool = "k_f_rgpa".equals(paramString);
    stringBuilder2 = null;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramSettingsActivity.getString(2131887243));
      stringBuilder.append("<br/>");
      stringBuilder.append(paramSettingsActivity.getString(2131887244));
      stringBuilder.append(": ≤ 0 dB<br/>");
      stringBuilder.append(paramSettingsActivity.getString(2131887245));
      stringBuilder.append(": ≤ -14 dB");
    } else {
      str1 = null;
    } 
    ms0 ms0 = new ms0((Context)paramSettingsActivity);
    ms0.f = str2;
    StringBuilder stringBuilder1 = stringBuilder2;
    if (str1 != null)
      spanned = Html.fromHtml(str1.toString()); 
    ms0.d((CharSequence)spanned);
    ms0.g(String.format(Locale.ENGLISH, "%.2f", new Object[] { Float.valueOf(0.0F) }), String.valueOf(f), true, (ns0)new jl1(paramString, 1));
    ms0.n(2131887030);
    ms0.k(2131886278);
    if (f != 0.0F) {
      ms0.l(2131887193);
      ms0.C = (rs0)new f1(paramString, 3);
    } 
    EditText editText = (ms0.p()).n;
    editText.setInputType(12290);
    editText.setFilters(new InputFilter[] { (InputFilter)new InputFilter.LengthFilter(7) });
  }
  
  public final void close() {
    this.X = true;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer) {}
  
  public final void deactivate() {}
  
  public final byte[] getBlob(int paramInt) {
    return new byte[0];
  }
  
  public final int getColumnCount() {
    return 1;
  }
  
  public final int getColumnIndex(String paramString) {
    return 0;
  }
  
  public final int getColumnIndexOrThrow(String paramString) {
    return 0;
  }
  
  public final String getColumnName(int paramInt) {
    return null;
  }
  
  public final String[] getColumnNames() {
    return new String[0];
  }
  
  public final int getCount() {
    return this.W.size();
  }
  
  public final double getDouble(int paramInt) {
    return 0.0D;
  }
  
  public final Bundle getExtras() {
    return null;
  }
  
  public final float getFloat(int paramInt) {
    return 0.0F;
  }
  
  public final int getInt(int paramInt) {
    return 0;
  }
  
  public final long getLong(int paramInt) {
    return 0L;
  }
  
  public final Uri getNotificationUri() {
    return null;
  }
  
  public final int getPosition() {
    return 0;
  }
  
  public final short getShort(int paramInt) {
    return 0;
  }
  
  public final int getType(int paramInt) {
    return 0;
  }
  
  public final boolean getWantsAllOnMoveCalls() {
    return false;
  }
  
  public final boolean isAfterLast() {
    return false;
  }
  
  public final boolean isBeforeFirst() {
    return false;
  }
  
  public final boolean isClosed() {
    return this.X;
  }
  
  public final boolean isFirst() {
    return false;
  }
  
  public final boolean isLast() {
    return false;
  }
  
  public final boolean isNull(int paramInt) {
    return false;
  }
  
  public final void l0() {
    try {
      Intent intent = new Intent();
      StringBuilder stringBuilder = new StringBuilder();
      this("package:");
      stringBuilder.append(getPackageName());
      this("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse(stringBuilder.toString()));
      startActivityForResult(intent, 10116);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean m(Preference paramPreference) {
    ms0 ms02;
    lm0 lm0;
    String str1;
    Drawable drawable;
    ms0 ms01;
    byte b1;
    View view;
    String str2;
    wn wn1;
    wn wn2;
    CheckBox checkBox1;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    int[] arrayOfInt4 = z51.p;
    int[] arrayOfInt3 = z51.o;
    Integer integer = Integer.valueOf(2);
    String str3 = paramPreference.m;
    if (getResources().getString(2131886717).equals(str3)) {
      if (ag0.e0()) {
        w0((Context)this);
        return false;
      } 
      startActivity(new Intent((Context)this, WidgetPrefActivity.class));
      return false;
    } 
    if ("etu2".equals(str3)) {
      ag0.K0((Context)this, paramPreference.i.toString(), null, str3, 0, 2130903071, 2130903053, null, null);
      return false;
    } 
    boolean bool = "B_MLCKSN".equals(str3);
    RadioButton radioButton = null;
    RadioGroup radioGroup = null;
    LinearLayout linearLayout = null;
    TextView textView = null;
    CheckBox checkBox2 = null;
    if (bool) {
      ms02 = new ms0((Context)this);
      ((jp0)ms02).N0 = getSharedPreferences("PP", 0);
      view = LayoutInflater.from((Context)this).inflate(2131492960, null);
      textView = (TextView)view.findViewById(2131297783);
      SwitchCompat switchCompat = (SwitchCompat)view.findViewById(2131297558);
      ((jp0)ms02).B0 = switchCompat;
      linearLayout = (LinearLayout)view.findViewById(2131296973);
      ((jp0)ms02).C0 = linearLayout;
      radioGroup = (RadioGroup)linearLayout.findViewById(2131297370);
      ((jp0)ms02).D0 = radioGroup;
      radioButton = (RadioButton)radioGroup.findViewById(2131297325);
      radioButton = (RadioButton)radioGroup.findViewById(2131297326);
      CheckBox checkBox9 = (CheckBox)linearLayout.findViewById(2131296538);
      ((jp0)ms02).E0 = checkBox9;
      checkBox2 = (CheckBox)linearLayout.findViewById(2131296530);
      ((jp0)ms02).F0 = checkBox2;
      checkBox1 = (CheckBox)linearLayout.findViewById(2131296559);
      ((jp0)ms02).H0 = checkBox1;
      CheckBox checkBox7 = (CheckBox)linearLayout.findViewById(2131296560);
      ((jp0)ms02).G0 = checkBox7;
      CheckBox checkBox6 = (CheckBox)linearLayout.findViewById(2131296562);
      ((jp0)ms02).I0 = checkBox6;
      CheckBox checkBox8 = (CheckBox)linearLayout.findViewById(2131296555);
      ((jp0)ms02).J0 = checkBox8;
      checkBox3 = (CheckBox)linearLayout.findViewById(2131296554);
      ((jp0)ms02).K0 = checkBox3;
      checkBox4 = (CheckBox)linearLayout.findViewById(2131296541);
      ((jp0)ms02).M0 = checkBox4;
      checkBox5 = (CheckBox)linearLayout.findViewById(2131296540);
      ((jp0)ms02).L0 = checkBox5;
      MaterialButton materialButton = (MaterialButton)linearLayout.findViewById(2131296456);
      ms02.f(view, true);
      ms02.r();
      switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox4.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox5.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox9.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox6.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox7.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox8.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      checkBox3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)ms02);
      materialButton.setOnClickListener((View.OnClickListener)ms02);
      radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)new hp0(ms02, 0));
      this.R = (jp0)ms02;
      ms02.W = (DialogInterface.OnDismissListener)new un(8, this);
      ms02.p();
      return false;
    } 
    if (getResources().getString(2131886710).equals(view)) {
      startActivityForResult(new Intent((Context)this, FolderExcluderActivity.class), 1);
      return false;
    } 
    if ("I_E_D_SEC_SCN".equals(view)) {
      (new v50(this)).p();
      return false;
    } 
    if (getResources().getString(2131886713).equals(view)) {
      (new zp0((Context)this)).p();
      return false;
    } 
    if ("IA_TABO".equals(view)) {
      (new bt1(this)).p();
      return false;
    } 
    if ("k_delayInfo".equals(view)) {
      ms02 = new ms0((Context)this);
      ms02.q(2131886170);
      ms02.d((CharSequence)Html.fromHtml(getString(2131886168).replace("\n", "<br/>")));
      ms02.n(2131887030);
      ms02.p();
      return false;
    } 
    if ("k_note1".equals(view)) {
      ms02 = new ms0((Context)this);
      ms02.c(2131886481);
      ms02.n(2131887030);
      ms02.p();
      return false;
    } 
    if (getString(2131886712).equals(view)) {
      startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
      return false;
    } 
    if ("THMR_BT".equals(view)) {
      startActivity((new Intent((Context)this, WelcomeActivity.class)).putExtra("ARGWCPGS", new int[] { 3 }).putExtra("acthpron", true));
      return false;
    } 
    if ("k_s_lng".equals(view)) {
      (new ql0((Context)this)).p();
      return false;
    } 
    if ("k_ntfa".equals(view))
      return false; 
    if ("k_f_plyspd4".equals(view)) {
      (new p71((Context)this)).p();
      return false;
    } 
    if ("k_b_rlpis".equals(view)) {
      (new jf1(this)).p();
      return false;
    } 
    if ("k_i_lfch".equals(view)) {
      (new o9(this)).p();
      return false;
    } 
    if ("B_R_AFL".equals(view)) {
      (new s9(this)).p();
      return false;
    } 
    if ("S_SFSHAL".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, "S_SFSHAL", 12, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("S_SFSHAR".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, "S_SFSHAR", 4, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("S_SFSHALAR".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, "S_SFSHALAR", 4, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("S_SFSHCM".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, "S_SFSHCM", 4, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("S_SFSHGN".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, kOkiWEITVb.zMJIUYTfmpI, 1000, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("S_SFSHFL".equals(view)) {
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, "S_SFSHFL", 0, (int[])checkBox4, (int[])checkBox5, null);
      return false;
    } 
    if ("k_i_eilfl".equals(view)) {
      o90 o90;
      MusicActivity musicActivity = MusicActivity.R0;
      CheckBox checkBox = checkBox2;
      if (musicActivity != null) {
        r90 r90 = musicActivity.c0;
        checkBox = checkBox2;
        if (r90 != null) {
          checkBox = checkBox2;
          if (r90.Y())
            o90 = MusicActivity.R0.c0.L0; 
        } 
      } 
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, (String)view, -1, r90.O0, r90.P0, (Runnable)o90);
      return false;
    } 
    if ("k_i_eilal".equals(view)) {
      tn tn;
      MusicActivity musicActivity = MusicActivity.R0;
      CheckBox checkBox = checkBox1;
      if (musicActivity != null) {
        wn1 = musicActivity.Z;
        checkBox = checkBox1;
        if (wn1 != null) {
          checkBox = checkBox1;
          if (wn1.Y())
            tn = MusicActivity.R0.Z.m1; 
        } 
      } 
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, (String)view, -1, rn.k, rn.l, (Runnable)tn);
      return false;
    } 
    bool = "k_i_eilar".equals(view);
    int[] arrayOfInt2 = rn.n;
    int[] arrayOfInt1 = rn.m;
    if (bool) {
      tn tn;
      MusicActivity musicActivity = MusicActivity.R0;
      wn wn = wn1;
      if (musicActivity != null) {
        wn2 = musicActivity.a0;
        wn = wn1;
        if (wn2 != null) {
          wn = wn1;
          if (wn2.Y())
            tn = MusicActivity.R0.a0.m1; 
        } 
      } 
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, (String)view, -1, arrayOfInt1, arrayOfInt2, (Runnable)tn);
      return false;
    } 
    if ("k_i_eilgn".equals(view)) {
      tn tn;
      MusicActivity musicActivity = MusicActivity.R0;
      wn wn = wn2;
      if (musicActivity != null) {
        wn wn3 = musicActivity.b0;
        wn = wn2;
        if (wn3 != null) {
          wn = wn2;
          if (wn3.Y())
            tn = MusicActivity.R0.b0.m1; 
        } 
      } 
      ag0.L0((Context)this, ((Preference)ms02).i.toString(), null, (String)view, -1, arrayOfInt1, arrayOfInt2, (Runnable)tn);
      return false;
    } 
    if ("jsa_icdfl".equals(view)) {
      r0((Activity)this, 2);
      return false;
    } 
    if ("MM_MM".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.b, a51.l, (Runnable)new l3(15));
      return false;
    } 
    if ("QANP_QANP".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.f, a51.p, (Runnable)new l3(16));
      return false;
    } 
    if ("PT_PT".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.e, a51.o, null);
      return false;
    } 
    if ("SS_SS".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.c, a51.m, null);
      return false;
    } 
    if ("ML_ML".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.d, a51.n, null);
      return false;
    } 
    if ("FL_FL".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.g, a51.q, null);
      return false;
    } 
    if ("AL_AL".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.h, a51.r, null);
      return false;
    } 
    if ("AR_AR".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.i, a51.s, null);
      return false;
    } 
    if ("GN_GN".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.j, a51.t, null);
      return false;
    } 
    if ("PLS_PLS".equals(view)) {
      a51.d((Context)this, ((Preference)ms02).i.toString(), a51.k, a51.u, null);
      return false;
    } 
    if ("webi".equals(view)) {
      ms02 = new ms0((Context)this);
      ms02.q(2131887577);
      ms02.c(2131886664);
      ms02.n(2131886639);
      ms02.p();
      return false;
    } 
    if ("k_s_ffd".equals(view) || PwbbJfsdcHrAjW.RaiJacQgI.equals(view)) {
      u0((Context)this, (String)view);
      return false;
    } 
    if ("k_s_hfp".equals(view)) {
      this.a0.edit().remove((String)view).apply();
      lm0 = MyApplication.j.c;
      lm0.u = lm0.t;
      ag0.O0(2131886467, 0);
      return false;
    } 
    if ("k_srt_sb_al".equals(view)) {
      str2 = lm0.g().toString();
      str1 = wn.I0(2);
      l3 l3 = new l3(17);
      ag0.L0((Context)this, str2, null, str1, 0, wn.s1, wn.t1, (Runnable)l3);
      return false;
    } 
    if ("k_i_nstl".equals(str2)) {
      b1 = Build.VERSION.SDK_INT;
      if (b1 >= 31) {
        CharSequence charSequence;
        if (b1 >= 33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
          charSequence = str1.h();
          j0(new String[] { "android.permission.POST_NOTIFICATIONS" }, charSequence, "android.permission-group.NOTIFICATIONS", 10115);
          return false;
        } 
        String str = charSequence.h().toString();
        drawable = charSequence.c();
        b1 = jm1.d;
        StringBuilder stringBuilder = new StringBuilder("<strike>");
        stringBuilder.append(getString(2131886967));
        stringBuilder.append("</strike>");
        Spanned spanned = Html.fromHtml(stringBuilder.toString());
        stringBuilder = new StringBuilder("<b>");
        stringBuilder.append(getString(2131887450));
        stringBuilder.append("</b><br/><small>");
        stringBuilder.append(getString(2131887148));
        stringBuilder.append("</small>");
        ag0.J0((Context)this, str, null, drawable, str2, b1, Arrays.asList(new CharSequence[] { (CharSequence)spanned, (CharSequence)Html.fromHtml(stringBuilder.toString()) }, ), new int[] { 0, 2 }, null, null, null);
        return false;
      } 
      ag0.K0((Context)this, drawable.h().toString(), drawable.c(), str2, jm1.d, 2130903083, 2130903057, null, null);
      return false;
    } 
    if ("k_i_mn_bg".equals(str2)) {
      ag0.K0((Context)this, drawable.h().toString(), drawable.c(), str2, jm1.a, 2130903082, 2130903056, null, null);
      return false;
    } 
    if ("notfdesclmr".equals(str2)) {
      ms01 = new ms0((Context)this);
      ms01.c(2131887018);
      ms01.n(2131886639);
      ms01.p();
      return false;
    } 
    bool = "k_b_mn_cp_blayt".equals(str2);
    byte b2 = 6;
    if (bool) {
      boolean bool2;
      b1 = MyApplication.o().getInt("k_i_nstl", jm1.d);
      boolean bool1 = MyApplication.o().getBoolean("k_b_mn_aa", true);
      if (Build.VERSION.SDK_INT >= 35 || MyApplication.o().getBoolean("k_b_sclnot", true)) {
        bool = true;
      } else {
        bool = false;
      } 
      if (b1 == 1) {
        str2 = "k_b_mo_cp_blayt";
        b1 = 5;
        bool1 = true;
        bool2 = false;
      } else {
        bool2 = true;
        b1 = 9;
      } 
      if (!bool) {
        b1++;
      } else {
        b2 = 5;
      } 
      (new l21(this, ((Preference)ms01).J.h().toString(), jm1.b, b2, b1, bool1, bool2, bool, str2, 85)).j.show();
      return false;
    } 
    bool = "k_b_mn_ex_blayt".equals(str2);
    b2 = 4;
    if (bool) {
      b1 = MyApplication.o().getInt("k_i_nstl", jm1.d);
      bool = MyApplication.o().getBoolean("k_b_mn_aa", true);
      if (Build.VERSION.SDK_INT >= 35 || MyApplication.o().getBoolean("k_b_sclnot", true)) {
        boolean bool2 = true;
      } else {
        boolean bool2 = false;
      } 
      if (b1 == 1) {
        str2 = "k_b_mo_ex_blayt";
        bool = true;
      } else if (b1 == 2) {
        str2 = "k_b_st_ex_blayt";
      } else {
        byte b5 = 125;
        b2 = 9;
        boolean bool2 = true;
        b1 = 9;
        byte b6 = b2;
        int i = b1;
      } 
      b1 = 4;
      byte b = 85;
      boolean bool1 = false;
    } else {
      Intent intent;
      if ("k_atbkup".equals(str2)) {
        ag0.K0((Context)this, ms01.h().toString(), null, str2, 0, 2130903076, 2130903048, null, null);
        return false;
      } 
      if ("k_bkupnw".equals(str2)) {
        String str5 = ag0.a;
        uo0 uo0 = uo0.b(Calendar.getInstance());
        String str4 = ju.a("yyyy-MM-dd HH-mm-ss").b(uo0).concat(".zip");
        try {
          intent = new Intent();
          this("android.intent.action.CREATE_DOCUMENT");
          startActivityForResult(intent.setType("application/zip").putExtra("android.intent.extra.TITLE", str4).putExtra("android.content.extra.SHOW_ADVANCED", true).addCategory("android.intent.category.OPENABLE"), 10100);
        } catch (ActivityNotFoundException activityNotFoundException) {
          activityNotFoundException.printStackTrace();
          wp1.K0((Context)this);
        } 
      } else {
        qi0 qi0;
        String str5;
        ss0 ss01;
        String str4;
        String str6;
        InputFilter.LengthFilter lengthFilter;
        StringBuilder stringBuilder2;
        List<CharSequence> list;
        StringBuilder stringBuilder1;
        Integer integer1;
        if ("k_restrnw".equals(intent)) {
          tb.l(this);
          return false;
        } 
        if ("puwapl".equals(intent)) {
          x0();
          return false;
        } 
        if ("k_p_scnw".equals(intent)) {
          startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
          return false;
        } 
        if ("dfsrchen".equals(intent)) {
          ag0.K0((Context)this, activityNotFoundException.h().toString(), null, (String)intent, -1, 2130903079, 2130903044, null, null);
          return false;
        } 
        if ("sosqala".equals(intent) || "sosqlrc".equals(intent)) {
          String str7;
          if ("sosqala".equals(intent)) {
            str7 = "album art <al> <t>";
          } else {
            str7 = "lyrics <t> <al>";
          } 
          String str8 = this.a0.getString((String)intent, str7);
          ms0 ms0 = new ms0((Context)this);
          ms0.f = activityNotFoundException.h();
          ms0.d(getString(2131886519));
          ms0.g(str7, str8, false, (ns0)new vn(18, this, intent));
          ms0.n(2131887030);
          ms0.k(2131886278);
          if (!str7.equals(str8)) {
            ms0.l(2131887193);
            ms0.C = (rs0)new xw(this, intent, str7, 9);
          } 
          ms0.p();
          return false;
        } 
        if ("k_i_boclalatnp".equals(intent)) {
          ag0.K0((Context)this, activityNotFoundException.h().toString(), null, "k_i_boclalatnp", -2, 2130903087, 2130903063, null, null);
          return false;
        } 
        if ("stod".equals(intent)) {
          MyApplication.F = new yp1();
          n21.F("SA>opc>smc");
          MyApplication.F.m(false);
          (new wp1()).N0(this);
          zi1.b();
          return false;
        } 
        if ("sflt".equals(intent)) {
          ag0.M0((Context)this, null);
          return false;
        } 
        if ("k_s_marsp".equals(intent)) {
          z0((Preference)activityNotFoundException, (String)intent, ", ; / | & ft. feat.");
          return false;
        } 
        if ("k_s_malarsp".equals(intent)) {
          z0((Preference)activityNotFoundException, (String)intent, ", ; / | & ft. feat.");
          return false;
        } 
        if ("k_s_mcmsp".equals(intent)) {
          z0((Preference)activityNotFoundException, (String)intent, ", ; / | & ft. feat.");
          return false;
        } 
        if ("k_s_mgnsp".equals(intent)) {
          z0((Preference)activityNotFoundException, (String)intent, ", ; / | &");
          return false;
        } 
        if ("k_i_ams".equals(intent)) {
          b1 = MyApplication.o().getInt((String)intent, 0);
          List<String> list1 = Arrays.asList(new String[] { getString(2131886146), getString(2131886150), getString(2131886394), getString(2131887601) });
          ArrayList<Integer> arrayList = new ArrayList(4);
          integer1 = Integer.valueOf(0);
          arrayList.add(integer1);
          if ((b1 & 0x1) > 0)
            arrayList.add(Integer.valueOf(1)); 
          if ((b1 & 0x2) > 0)
            arrayList.add(Integer.valueOf(2)); 
          if ((b1 & 0x4) > 0)
            arrayList.add(Integer.valueOf(3)); 
          Integer[] arrayOfInteger = arrayList.<Integer>toArray(new Integer[0]);
          ms0 ms0 = new ms0((Context)this);
          ms0.f = ((Preference)activityNotFoundException).i;
          ms0.c(2131886145);
          ms0.h(list1);
          ml1 ml1 = new ml1(b1, 1, (String)intent);
          ms0.N = arrayOfInteger;
          ms0.E = null;
          ms0.F = null;
          ms0.G = (ps0)ml1;
          ms0.O = new Integer[] { integer1 };
          ms0.n(2131887030);
          ms0.k(2131886278);
          if (b1 != 0) {
            ms0.l(2131887193);
            ms0.C = (rs0)new jl1((String)intent, 4);
          } 
          ms0.p();
          return false;
        } 
        if ("k_i_fldjpg".equals(intent)) {
          String str;
          bool = MyApplication.G.g();
          int j = Build.VERSION.SDK_INT;
          if (j >= 33 && MyApplication.d().checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
            b1 = 1;
          } else {
            b1 = 0;
          } 
          int i = MyApplication.o().getInt("k_i_fldjpg", jm1.e);
          if (i != 0 && bool) {
            b2 = 1;
          } else {
            b2 = 0;
          } 
          if ((j == 33) ? (bool && b1) : (j >= 34 && bool && i == 0 && b1)) {
            str = getString(2131886592);
            j0(new String[] { "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO" }, str, "android.permission-group.READ_MEDIA_VISUAL", 10112);
            return false;
          } 
          stringBuilder2 = new StringBuilder();
          if (b2 != 0) {
            StringBuilder stringBuilder = new StringBuilder("<small>* <a href=\"1\">");
            stringBuilder.append(getString(2131886739));
            stringBuilder.append(" (");
            stringBuilder.append(getString(2131886718));
            stringBuilder.append(ybWnIKHovcRr.JOTHAkBOi);
            str = stringBuilder.toString();
          } else {
            str = "";
          } 
          stringBuilder2.append(str);
          stringBuilder2.append(getString(2131886593));
          stringBuilder2.append(":");
          str6 = stringBuilder2.toString();
          Integer integer2 = integer1;
          if (b2 != 0)
            qi0 = new qi0((pi0)new f(29, this)); 
          String[] arrayOfString = getResources().getStringArray(2130903062);
          int[] arrayOfInt = getResources().getIntArray(2130903086);
          if (b2 != 0)
            for (b1 = 0; b1 < arrayOfInt.length; b1++) {
              if (arrayOfInt[b1] == i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(arrayOfString[b1]);
                stringBuilder.append(" *");
                arrayOfString[b1] = stringBuilder.toString();
                break;
              } 
            }  
          ag0.J0((Context)this, null, (CharSequence)Html.fromHtml(str6), null, "k_i_fldjpg", jm1.e, Arrays.asList(arrayOfString), arrayOfInt, null, qi0, null);
          return false;
        } 
        if ("k_i_cfd".equals(str6)) {
          t0((Context)this);
          return false;
        } 
        if ("k_i_adt".equals(str6)) {
          ag0.K0((Context)this, qi0.h().toString(), null, "k_i_adt", 0, 2130903078, 2130903051, wf2.B("setting_docs", new String[] { str6 }), (Runnable)new ip0(this, 2));
          return false;
        } 
        if ("k_i_aclaiacv".equals(str6)) {
          List<CharSequence> list1 = Arrays.asList(new CharSequence[] { getResources().getQuantityString(2131755052, 2, new Object[] { checkBox3 }), getResources().getQuantityString(2131755052, 5, new Object[] { Integer.valueOf(5) }), getResources().getQuantityString(2131755052, 10, new Object[] { Integer.valueOf(10) }), getResources().getQuantityString(2131755052, 30, new Object[] { Integer.valueOf(30) }), getResources().getQuantityString(2131755050, 1, new Object[] { Integer.valueOf(1) }), getResources().getQuantityString(2131755050, 2, new Object[] { checkBox3 }), getString(2131886979) });
          String str = qi0.h().toString();
          str5 = qi0.g().toString();
          l3 l3 = new l3(18);
          ag0.J0((Context)this, str, str5, null, str6, 300000, list1, new int[] { 120000, 300000, 600000, 1800000, 3600000, 7200000, -1 }, null, null, (Runnable)l3);
          return false;
        } 
        if ("igthar_wl".equals(str6)) {
          String str = MyApplication.o().getString(str6, "A An The");
          ms0 ms0 = new ms0((Context)this);
          ms0.f = ((Preference)str5).i;
          ms0.c(2131887264);
          ms0.g("A An The", str, true, (ns0)new il1(0, str, str6));
          if (!str.equals("A An The")) {
            ms0.l(2131887193);
            ms0.C = (rs0)new jl1(str6, 0);
          } 
          ms0.k(2131886278);
          ms0.n(2131887030);
          ss01 = ms0.p();
          lengthFilter = new InputFilter.LengthFilter(22);
          ss01.n.setFilters(new InputFilter[] { (InputFilter)lengthFilter });
          return false;
        } 
        if ("igthar_t".equals(lengthFilter) || "alpnmsr_t".equals(lengthFilter)) {
          v0((Preference)ss01, (String)lengthFilter);
          return false;
        } 
        if ("k_i_gds".equals(lengthFilter)) {
          ag0.J0((Context)this, ss01.h().toString(), null, null, (String)lengthFilter, 2, Arrays.asList(new String[] { getString(2131887411), getString(2131887410), getString(2131886823), getString(2131886245), getString(2131886246) }, ), new int[] { 0, 1, 2, 3, 4 }, null, null, null);
          return false;
        } 
        if ("SAF_S_ATBKPFL".equals(lengthFilter)) {
          if (Build.VERSION.SDK_INT >= 30) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(getString(2131886227));
            stringBuilder2.append(" › ");
            stringBuilder2.append(ss01.h().toString());
            ag0.m0(this, 10102, true, stringBuilder2.toString());
            return false;
          } 
          (new z00((Context)this, getString(2131887321), true, true, true, null, getString(2131887339), getString(2131886278), null, (y00)new ol1(this, 0))).e();
          return false;
        } 
        if ("k_i_pfsnr".equals(stringBuilder2)) {
          str4 = ss01.h().toString();
          List<CharSequence> list1 = Arrays.asList(new CharSequence[] { getString(2131887485), getString(2131886970) });
          Uri uri = wf2.B("setting_docs", new String[] { (String)stringBuilder2 });
          ag0.J0((Context)this, str4, null, null, (String)stringBuilder2, 0, list1, new int[] { 0, 1 }, uri, null, null);
          return false;
        } 
        if ("k_albgpk".equals(stringBuilder2)) {
          ag0.Y(this, false, null);
          return false;
        } 
        if ("k_i_rgm".equals(stringBuilder2)) {
          str4 = getString(2131887190);
          stringBuilder2 = new StringBuilder("<b>");
          stringBuilder2.append(getString(2131886134));
          stringBuilder2.append("</b>");
          Spanned spanned1 = Html.fromHtml(stringBuilder2.toString());
          StringBuilder stringBuilder = new StringBuilder("<b>");
          stringBuilder.append(getString(2131887518));
          stringBuilder.append("</b><br/><small>(");
          stringBuilder.append(getString(2131887519));
          stringBuilder.append(")</small>");
          Spanned spanned2 = Html.fromHtml(stringBuilder.toString());
          stringBuilder = new StringBuilder("<b>");
          stringBuilder.append(getString(2131886141));
          stringBuilder.append("</b><br/><small>(");
          stringBuilder.append(getString(2131886142));
          stringBuilder.append(")</small>");
          list = Arrays.asList(new CharSequence[] { (CharSequence)spanned1, (CharSequence)spanned2, (CharSequence)Html.fromHtml(stringBuilder.toString()) });
          ag0.J0((Context)this, str4, null, null, YbNJ.Zki, 0, list, new int[] { 0, 1, 2 }, null, null, null);
          return false;
        } 
        if ("k_i_rglsd".equals(list)) {
          RGReadCalcActivity.n0((Activity)this, null);
          return false;
        } 
        if ("k_f_rgpa".equals(list) || "k_f_rgpna".equals(list)) {
          "k_f_rgpa".equals(list);
          y0(this, (String)list);
          return false;
        } 
        if ("k_i_crgvcns".equals(list)) {
          stringBuilder1 = new StringBuilder("<small>");
          stringBuilder1.append(str4.h().toString());
          stringBuilder1.append("</small>");
          ag0.J0((Context)this, (CharSequence)Html.fromHtml(stringBuilder1.toString()), null, null, "k_i_crgvcns", 2, Arrays.asList(new CharSequence[] { getString(2131886134), getString(2131887541), getString(2131886180) }, ), new int[] { 0, 1, 2 }, null, null, null);
          return false;
        } 
        if ("k_i_ffrwnp3".equals(stringBuilder1)) {
          ag0.J0((Context)this, str4.h(), null, null, (String)stringBuilder1, 1, Arrays.asList(new CharSequence[] { getString(2131886134), getString(2131886479), getString(2131886175) }, ), new int[] { 0, 1, 2 }, null, null, null);
          return false;
        } 
        if ("lmacc_km".equals(stringBuilder1)) {
          if (Build.VERSION.SDK_INT >= 30)
            n0.z((Context)this); 
          return false;
        } 
        if ("SAF_S_ATEXCVPFL".equals(stringBuilder1)) {
          if (Build.VERSION.SDK_INT >= 30) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append(getString(2131886224));
            stringBuilder1.append(" › ");
            stringBuilder1.append(str4.h().toString());
            ag0.m0(this, 10104, true, stringBuilder1.toString());
            return false;
          } 
          (new z00((Context)this, getString(2131887321), true, true, true, null, getString(2131887339), getString(2131886278), null, (y00)new ol1(this, 1))).e();
          return false;
        } 
        if ("k_i_hwqwsnaex".equals(stringBuilder1)) {
          CharSequence charSequence = str4.h();
          String str7 = getString(2131887189);
          String str8 = getString(2131886824);
          ArrayList<Object> arrayList = new ArrayList(2);
          for (b1 = 0; b1 < 2; b1++) {
            (new Object[2])[0] = str7;
            (new Object[2])[1] = str8;
            Object object = (new Object[2])[b1];
            Objects.requireNonNull(object);
            arrayList.add(object);
          } 
          ag0.J0((Context)this, charSequence, null, null, (String)stringBuilder1, 0, Collections.unmodifiableList(arrayList), new int[] { 0, 1 }, null, null, null);
          return false;
        } 
        if ("k_b_ornxpvbarwrw".equals(stringBuilder1)) {
          ((ss0)(new j01(this)).c).show();
          return false;
        } 
        stringBuilder1.equals(stringBuilder1);
        return false;
      } 
      return false;
    } 
    byte b4 = b2;
    byte b3 = b1;
  }
  
  public final void m0() {
    kv0 kv01 = this.b0;
    if (kv01 != null) {
      boolean bool8 = kv01.a;
      SharedPreferences sharedPreferences2 = null;
      this.b0 = null;
      boolean bool11 = MyApplication.o().getBoolean("k_b_scnmfl", false);
      boolean bool12 = MyApplication.o().getBoolean("k_b_schdfl", false);
      boolean bool9 = MyApplication.o().getBoolean("k_b_scvfl", false);
      SharedPreferences sharedPreferences1 = MyApplication.o();
      String str = DJqHMztxflt.gHJgsdqlyXhiMDE;
      boolean bool5 = sharedPreferences1.getBoolean(str, false);
      boolean bool6 = kv01.c;
      boolean bool10 = kv01.d;
      boolean bool7 = kv01.b;
      if (bool11 != bool8) {
        if (bool11) {
          bool3 = false;
          bool4 = true;
        } else {
          bool4 = false;
          bool3 = true;
        } 
      } else {
        bool3 = false;
        bool4 = false;
      } 
      boolean bool2 = bool3;
      boolean bool1 = bool4;
      if (bool12 != bool7)
        if (bool12) {
          bool1 = true;
          bool2 = bool3;
        } else {
          bool2 = true;
          bool1 = bool4;
        }  
      if (bool5 != bool10) {
        bool5 = true;
      } else {
        bool5 = false;
      } 
      boolean bool4 = bool2;
      boolean bool3 = bool1;
      if (bool9 != bool6) {
        if (bool9) {
          bool1 = true;
        } else {
          bool2 = true;
        } 
        if (MyApplication.H != null)
          MyApplication.i.getApplicationContext().getContentResolver().unregisterContentObserver((ContentObserver)MyApplication.H); 
        MyApplication.H = null;
        MyApplication.r();
        bool3 = bool1;
        bool4 = bool2;
      } 
      if (bool3 || bool4 || bool5) {
        if (MyApplication.s > 0) {
          ArrayList arrayList;
          sharedPreferences1 = sharedPreferences2;
          if (!bool3)
            if (bool5) {
              sharedPreferences1 = sharedPreferences2;
            } else {
              arrayList = new ArrayList(0);
            }  
          if (arrayList != null) {
            bool6 = true;
          } else {
            bool6 = false;
          } 
          im0 im0 = new im0(false, bool5, bool6);
          im0.K = true;
          im0.d = getString(2131886199);
          im0.m = true;
          GhostSearchActivity.g0 = im0;
          startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
          return;
        } 
        MyApplication.o().edit().putBoolean("k_b_scnmfl", bool8).putBoolean("k_b_schdfl", bool7).putBoolean("k_b_scvfl", bool6).putBoolean(str, bool10).apply();
      } 
    } 
  }
  
  public final boolean move(int paramInt) {
    return true;
  }
  
  public final boolean moveToFirst() {
    return false;
  }
  
  public final boolean moveToLast() {
    return false;
  }
  
  public final boolean moveToNext() {
    return false;
  }
  
  public final boolean moveToPosition(int paramInt) {
    return true;
  }
  
  public final boolean moveToPrevious() {
    return false;
  }
  
  public final void n0() {
    SearchView searchView = this.S;
    if (searchView != null) {
      searchView.setQuery("", false);
      this.S.clearFocus();
      this.S.setIconified(true);
    } 
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    Uri uri;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1 && paramInt2 == -1) {
      startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
      return;
    } 
    if (paramInt1 == 2 && paramInt2 == -1) {
      startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
      return;
    } 
    if (paramInt1 == 10100 && paramInt2 == -1 && paramIntent.getData() != null) {
      tb.m((u00)new c91(MyApplication.i.getApplicationContext(), paramIntent.getData()), (Context)this, true);
      return;
    } 
    if (paramInt1 == 10102 && paramInt2 == -1 && paramIntent.getData() != null) {
      uri = paramIntent.getData();
      MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(uri, 3);
      MyApplication.v().edit().putString("SAF_S_ATBKPFL", uri.toString()).apply();
      sl1.W0(this.Z.D0("SAF_S_ATBKPFL"));
      return;
    } 
    if (paramInt1 == 10104 && paramInt2 == -1 && uri.getData() != null) {
      uri = uri.getData();
      MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(uri, 3);
      MyApplication.v().edit().putString("SAF_S_ATEXCVPFL", uri.toString()).apply();
      sl1.X0(this.Z.D0("SAF_S_ATEXCVPFL"));
      return;
    } 
    this.k0 = false;
    this.N.removeCallbacks((Runnable)this.l0);
    if (paramInt1 == 10116 && this.k0 && (new z21(MyApplication.i.getApplicationContext())).a()) {
      jp0 jp01 = this.R;
      if (jp01 != null)
        try {
          return;
        } finally {
          jp01 = null;
        }  
    } 
  }
  
  public final void onBackPressed() {
    if (!this.S.isIconified()) {
      n0();
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297451) {
      this.S.clearAnimation();
      if (!this.g0) {
        MyApplication.x().edit().putBoolean("stgschts", true).apply();
        this.S.setEnabled(true);
        this.g0 = true;
        Toast toast = this.h0;
        if (toast != null)
          toast.cancel(); 
        this.e0.removeCallbacks((Runnable)this.i0);
      } 
      this.S.isIconified();
      return;
    } 
    if (i == 2131296865)
      try {
        Intent intent = new Intent();
        this("android.intent.action.VIEW", wf2.B("setting_docs", new String[] { this.Y }));
        startActivity(intent);
      } finally {} 
  }
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    m0 = this;
    setContentView(2131492914);
    this.a0 = getSharedPreferences("PP", 0);
    this.T = LayoutInflater.from((Context)this);
    Toolbar toolbar = (Toolbar)findViewById(2131297607);
    g0(toolbar);
    g92.e((View)toolbar, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)findViewById(2131296941);
    hn hn = new hn(8, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    U().a(this.j0);
    this.S = (SearchView)toolbar.findViewById(2131297451);
    ((ImageView)toolbar.findViewById(2131296865)).setOnClickListener(this);
    ba1 ba1 = new ba1(getApplicationContext());
    ba1.f = "PP";
    ba1.c = null;
    PreferenceScreen preferenceScreen = ba1.c(getApplicationContext());
    this.V.clear();
    s0((PreferenceGroup)preferenceScreen, null, null);
    if (paramBundle == null) {
      sl1 sl12 = (sl1)Z().E("S");
      sl1 sl11 = sl12;
      if (sl12 == null) {
        sl11 = new sl1();
        Intent intent = getIntent();
        Bundle bundle = new Bundle(3);
        bundle.putString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT", intent.getStringExtra(zLtYiJUm.TaiiTNULp));
        bundle.putString("H", intent.getStringExtra("hltk"));
        sl11.x0(bundle);
        this.d0 = intent.getStringExtra("onpfk");
      } 
      lb0 lb0 = Z();
      lb0.getClass();
      lb lb = new lb(lb0);
      lb.k(2131296751, (ua0)sl11, "S");
      lb.f();
    } 
    Y().Z(true);
    Y().f0(2131887354);
    boolean bool = getIntent().getBooleanExtra("hs", false);
    SearchView searchView = this.S;
    if (bool) {
      searchView.setVisibility(8);
      return;
    } 
    searchView.setQueryHint(getString(2131887302));
    ql1 ql11 = new ql1(this, this, this);
    this.U = ql11;
    this.S.setSuggestionsAdapter((lt)ql11);
    this.S.setOnSuggestionListener(this);
    this.S.setOnQueryTextListener(this);
    this.S.setOnSearchClickListener(this);
    this.S.setOnCloseListener(this);
  }
  
  public final void onDestroy() {
    if (m0 == this)
      m0 = null; 
    Toast toast = this.h0;
    if (toast != null)
      toast.cancel(); 
    nl1 nl11 = this.i0;
    Handler handler = this.e0;
    handler.removeCallbacks((Runnable)nl11);
    handler.removeCallbacksAndMessages(null);
    if (this.b0 != null)
      m0(); 
    this.X = true;
    super.onDestroy();
    try {
      return;
    } finally {
      nl11 = null;
      nl11.printStackTrace();
    } 
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    if (paramMenuItem.getItemId() == 16908332)
      onBackPressed(); 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
    if (paramArrayOfint.length != 0 && paramArrayOfString.length != 0)
      this.f0 = new no(paramInt, 5, this, paramArrayOfint); 
  }
  
  public final void onResume() {
    super.onResume();
    boolean bool = MyApplication.x().getBoolean("stgschts", false);
    this.g0 = bool;
    if (!bool && this.S.getVisibility() == 0) {
      ip0 ip0 = new ip0(this, 1);
      this.e0.postDelayed((Runnable)ip0, 1000L);
      this.g0 = true;
      MyApplication.x().edit().putBoolean("stgschts", true).apply();
    } 
  }
  
  public final void p0(PreferenceScreen paramPreferenceScreen) {
    String str = ((Preference)paramPreferenceScreen).m;
    lb0 lb0 = Z();
    lb0.getClass();
    lb lb = new lb(lb0);
    sl1 sl11 = new sl1();
    Bundle bundle = new Bundle();
    bundle.putString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT", str);
    bundle.putString("H", null);
    sl11.x0(bundle);
    lb.k(2131296751, (ua0)sl11, str);
    if (!TextUtils.equals(this.Y, str))
      lb.c(str); 
    lb.f();
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver) {}
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final boolean requery() {
    return false;
  }
  
  public final Bundle respond(Bundle paramBundle) {
    return null;
  }
  
  public final void s0(PreferenceGroup paramPreferenceGroup, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2) {
    int i = paramPreferenceGroup.P.size();
    ArrayList<String> arrayList = paramArrayList1;
    if (paramArrayList1 == null) {
      arrayList = new ArrayList();
      arrayList.add("S");
    } 
    paramArrayList1 = paramArrayList2;
    if (paramArrayList2 == null)
      paramArrayList1 = new ArrayList<String>(); 
    Drawable drawable = paramPreferenceGroup.c();
    for (byte b = 0; b < i; b++) {
      boolean bool;
      Preference preference = paramPreferenceGroup.G(b);
      String str = preference.m;
      if (str != null && str.startsWith("~")) {
        bool = true;
      } else {
        bool = false;
      } 
      boolean bool1 = preference.x;
      if (bool1 || bool) {
        CharSequence charSequence = preference.i;
        preference.g();
        if (preference.c() == null && preference.l != drawable) {
          preference.l = drawable;
          preference.k = 0;
          preference.j();
        } 
        if (charSequence != null || !(preference instanceof UnImportantPref) || ((UnImportantPref)preference).O != null) {
          Object object = new Object();
          ((rl1)object).h = preference;
          charSequence = preference.i;
          if (charSequence != null)
            ((rl1)object).a = charSequence.toString(); 
          if (((rl1)object).a == null && preference.g() != null)
            ((rl1)object).a = preference.g().toString(); 
          charSequence = ((rl1)object).a;
          ArrayList<String> arrayList1 = null;
          if (charSequence != null) {
            charSequence = ag0.i0(charSequence.toUpperCase().toLowerCase());
          } else {
            charSequence = null;
          } 
          ((rl1)object).b = (String)charSequence;
          if (preference.g() != null) {
            charSequence = ag0.i0(preference.g().toString().toUpperCase().toLowerCase());
          } else {
            charSequence = null;
          } 
          ((rl1)object).c = (String)charSequence;
          ((rl1)object).d = preference.c();
          ((rl1)object).e = arrayList;
          ((rl1)object).f = paramArrayList1;
          charSequence = preference.m;
          ((rl1)object).g = (String)charSequence;
          if (charSequence != null && bool1)
            this.V.add(object); 
          if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup)preference;
            if (preferenceGroup.c() == null && ((Preference)preferenceGroup).l != drawable) {
              ((Preference)preferenceGroup).l = drawable;
              ((Preference)preferenceGroup).k = 0;
              preferenceGroup.j();
            } 
            if (preferenceGroup instanceof PreferenceScreen) {
              arrayList1 = (ArrayList)arrayList.clone();
              arrayList1.add(((Preference)preferenceGroup).m);
              ((rl1)object).e = arrayList1;
              object = paramArrayList1.clone();
              CharSequence charSequence1 = preference.i;
              charSequence = charSequence1;
              if (charSequence1 == null)
                charSequence = preference.g(); 
              if (charSequence != null) {
                charSequence = charSequence.toString();
              } else {
                charSequence = zpEN.YkDFPWJDQNgu;
              } 
              object.add(charSequence);
              Object object1 = object;
            } else if (preferenceGroup instanceof androidx.preference.PreferenceCategory) {
              arrayList1 = arrayList;
              ArrayList<String> arrayList2 = paramArrayList1;
            } else {
              charSequence = null;
            } 
            s0(preferenceGroup, arrayList1, (ArrayList)charSequence);
          } 
        } 
      } 
    } 
  }
  
  public final void setExtras(Bundle paramBundle) {}
  
  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri) {}
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver) {}
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final void v0(Preference paramPreference, String paramString) {
    int i = MyApplication.o().getInt(paramString, 0);
    List<String> list = Arrays.asList(new String[] { getString(2131887508), getString(2131886563), getString(2131886582), getString(2131886137), getString(2131886205), getString(2131886150), getString(2131886394) });
    ArrayList<Integer> arrayList = new ArrayList(7);
    if ((i & 0x1) > 0)
      arrayList.add(Integer.valueOf(0)); 
    if ((i & 0x2) > 0)
      arrayList.add(Integer.valueOf(1)); 
    if ((i & 0x4) > 0)
      arrayList.add(Integer.valueOf(2)); 
    if ((i & 0x8) > 0)
      arrayList.add(Integer.valueOf(3)); 
    if ((i & 0x10) > 0)
      arrayList.add(Integer.valueOf(4)); 
    if ((i & 0x20) > 0)
      arrayList.add(Integer.valueOf(5)); 
    if ((i & 0x40) > 0)
      arrayList.add(Integer.valueOf(6)); 
    Integer[] arrayOfInteger = arrayList.<Integer>toArray(new Integer[0]);
    ms0 ms0 = new ms0((Context)this);
    ms0.f = paramPreference.i;
    StringBuilder stringBuilder = new StringBuilder("<small>");
    stringBuilder.append(getString(2131887562));
    stringBuilder.append(" ");
    stringBuilder.append(getString(2131886186));
    stringBuilder.append("</small>");
    ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
    ms0.h(list);
    ml1 ml1 = new ml1(i, 0, paramString);
    ms0.N = arrayOfInteger;
    ms0.E = null;
    ms0.F = null;
    ms0.G = (ps0)ml1;
    ms0.n(2131887030);
    ms0.k(2131886278);
    if (i != 0) {
      ms0.l(2131887193);
      ms0.C = (rs0)new jl1(paramString, 3);
    } 
    ms0.p();
  }
  
  public final void x0() {
    ms0 ms0 = new ms0((Context)this);
    ms0.q(2131887121);
    StringBuilder stringBuilder = new StringBuilder("<b>");
    stringBuilder.append(getString(2131887577));
    stringBuilder.append("</b><br/><br/>");
    stringBuilder.append(getString(2131887122));
    ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
    ms0.n(2131886639);
    ms0.p();
  }
  
  public final void z0(Preference paramPreference, String paramString1, String paramString2) {
    String str = MyApplication.o().getString(paramString1, paramString2);
    ms0 ms0 = new ms0((Context)this);
    ms0.f = paramPreference.i;
    ms0.c(2131887344);
    ms0.g(paramString2, str, true, (ns0)new il1(1, str, paramString1));
    if (!str.equals(paramString2)) {
      ms0.l(2131887193);
      ms0.C = (rs0)new il1(2, paramString1, paramString2);
    } 
    ms0.k(2131886278);
    ms0.n(2131887030);
    ss0 ss01 = ms0.p();
    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(60);
    ss01.n.setFilters(new InputFilter[] { (InputFilter)lengthFilter });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\SettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */