import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.musicolet.AboutActivity;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RestoreActivity;
import in.krosbits.musicolet.SearchActivity;
import in.krosbits.musicolet.SettingsActivity;
import in.krosbits.musicolet.Tag2Activity;
import in.krosbits.musicolet.WelcomeActivity;
import in.krosbits.pref.AutoUpdatingListPref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public class sl1 extends w91 implements SharedPreferences.OnSharedPreferenceChangeListener {
  public RecyclerView j0;
  
  public String k0;
  
  public SettingsActivity l0;
  
  public final Pattern m0 = Pattern.compile("%");
  
  public static void G0() {
    try {
      Context context = MyApplication.i.getApplicationContext();
      Intent intent = new Intent();
      this(MyApplication.i.getApplicationContext(), GhostSearchActivity.class);
      context.startActivity(intent.setAction("A_RMS").addFlags(268435456));
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null)
        return; 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void H0() {
    try {
      MyApplication.j.c.s();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void I0() {
    byte b1;
    byte b2;
    int j;
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = true;
    if (i >= 35 || MyApplication.o().getBoolean("k_b_sclnot", true)) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    boolean bool = MyApplication.o().getBoolean("k_b_mn_aa", true);
    byte b3 = 9;
    byte b4 = 5;
    if (bool) {
      i = 5;
    } else {
      i = 9;
    } 
    if (!b1) {
      j = i + 1;
      b3 = 10;
      b1 = 5;
      b4 = 6;
      b2 = 5;
    } else {
      b2 = 4;
      b1 = 4;
      j = i;
    } 
    i = bool2;
    if (l21.a(MyApplication.o().getInt("k_b_mn_cp_blayt", 85)) > j) {
      x41.u("k_b_mn_cp_blayt", 85);
      i = 1;
    } 
    if (l21.a(MyApplication.o().getInt("k_b_mo_cp_blayt", 85)) > b4) {
      x41.u("k_b_mo_cp_blayt", 85);
      i = 1;
    } 
    if (l21.a(MyApplication.o().getInt("k_b_mn_ex_blayt", 125)) > b3) {
      x41.u("k_b_mn_ex_blayt", 125);
      i = 1;
    } 
    if (l21.a(MyApplication.o().getInt("k_b_mo_ex_blayt", 85)) > b2) {
      x41.u("k_b_mo_ex_blayt", 85);
      i = 1;
    } 
    if (l21.a(MyApplication.o().getInt("k_b_st_ex_blayt", 85)) > b1) {
      x41.u("k_b_st_ex_blayt", 85);
      i = bool1;
    } 
    if (i != 0)
      MusicService.O0(); 
  }
  
  public static void L0(Preference paramPreference, String paramString, int paramInt, List<Integer> paramList1, List<CharSequence> paramList2) {
    int i = MyApplication.o().getInt(paramString, paramInt);
    for (paramInt = 0; paramInt < paramList1.size(); paramInt++) {
      if (((Integer)paramList1.get(paramInt)).intValue() == i) {
        paramPreference.B(paramList2.get(paramInt));
        return;
      } 
    } 
  }
  
  public static void O0(x5 paramx5) {
    im0 im0 = new im0(false, false, true);
    im0.d = paramx5.getString(2131886199);
    im0.K = true;
    GhostSearchActivity.g0 = im0;
    paramx5.startActivity((new Intent((Context)paramx5, GhostSearchActivity.class)).setAction("A_BGU"));
  }
  
  public static void P0(boolean paramBoolean) {
    boolean bool;
    if (SettingsActivity.m0 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    MusicActivity musicActivity = MusicActivity.R0;
    if (musicActivity != null)
      musicActivity.i0(); 
    if (bool && paramBoolean)
      SettingsActivity.m0.i0(); 
    WelcomeActivity welcomeActivity = WelcomeActivity.d0;
    if (welcomeActivity != null)
      welcomeActivity.recreate(); 
    SearchActivity.l0();
    EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
    if (equalizerActivity2 != null)
      equalizerActivity2.finish(); 
    Tag2Activity tag2Activity = Tag2Activity.O1;
    if (tag2Activity != null)
      tag2Activity.finish(); 
    AboutActivity aboutActivity = AboutActivity.Z;
    if (aboutActivity != null)
      aboutActivity.finish(); 
  }
  
  public static void S0(Preference paramPreference, String paramString1, String paramString2) {
    if (paramPreference != null)
      paramPreference.B(MyApplication.o().getString(paramString1, paramString2)); 
  }
  
  public static void T0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    int i = MyApplication.o().getInt("k_i_nstl", jm1.d);
    if (i == 1 || (i == 2 && Build.VERSION.SDK_INT >= 30)) {
      ((TwoStatePreference)paramPreference).F(true);
      paramPreference.B(paramPreference.b.getString(2131887007));
      paramPreference.z(false);
      return;
    } 
    paramPreference.B(null);
    paramPreference.z(true);
  }
  
  public static void W0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    SharedPreferences sharedPreferences = MyApplication.v();
    v00 v00 = null;
    String str = sharedPreferences.getString("SAF_S_ATBKPFL", null);
    if (str != null)
      v00 = v00.q(MyApplication.i.getApplicationContext(), str); 
    if (v00 != null && v00.k()) {
      paramPreference.B(MyApplication.F.e(v00, true));
      return;
    } 
    if (MyApplication.F.p()) {
      paramPreference.B(MyApplication.F.e(ag0.H().A("Backups/Automatic backups"), true));
      return;
    } 
    yp1 yp1 = MyApplication.F;
    StringBuilder stringBuilder = new StringBuilder("Storage/primary/");
    stringBuilder.append(tb.d());
    stringBuilder.append("/Musicolet/Backups");
    paramPreference.B(ml0.a((yp1.c(stringBuilder.toString())).b));
  }
  
  public static void X0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    SharedPreferences sharedPreferences = MyApplication.v();
    v00 v00 = null;
    String str = sharedPreferences.getString("SAF_S_ATEXCVPFL", null);
    if (str != null)
      v00 = v00.q(MyApplication.i.getApplicationContext(), str); 
    if (v00 != null && v00.k()) {
      paramPreference.B(MyApplication.F.e(v00, true));
      return;
    } 
    if (MyApplication.F.p()) {
      paramPreference.B(MyApplication.F.e(ag0.H().A("Exported Play Counts"), true));
      return;
    } 
    yp1 yp1 = MyApplication.F;
    StringBuilder stringBuilder = new StringBuilder("Storage/primary/");
    stringBuilder.append(Environment.DIRECTORY_DOCUMENTS);
    stringBuilder.append("/Musicolet/Exported Play Counts");
    paramPreference.B(ml0.a((yp1.c(stringBuilder.toString())).b));
  }
  
  public static void j1(TwoStatePreference paramTwoStatePreference, String paramString) {
    try {
      boolean bool;
      if (paramTwoStatePreference.O && MyApplication.G.g()) {
        bool = true;
      } else {
        bool = false;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramString);
      if (bool) {
        paramString = " *";
      } else {
        paramString = "";
      } 
      stringBuilder.append(paramString);
      return;
    } finally {
      paramTwoStatePreference = null;
      paramTwoStatePreference.printStackTrace();
    } 
  }
  
  public final void E0(String paramString) {
    ba1 ba1 = this.b0;
    ba1.f = "PP";
    ba1.c = null;
    if (ba1 != null) {
      Preference preference2;
      PreferenceScreen preferenceScreen3 = ba1.c(u0());
      PreferenceScreen preferenceScreen2 = preferenceScreen3;
      if (paramString != null) {
        preference2 = preferenceScreen3.F(paramString);
        if (!(preference2 instanceof PreferenceScreen)) {
          l0.l(x41.w("Preference object with key ", paramString, " is not a PreferenceScreen"));
          return;
        } 
      } 
      preferenceScreen3 = (PreferenceScreen)preference2;
      ba1 ba11 = this.b0;
      PreferenceScreen preferenceScreen1 = ba11.g;
      if (preferenceScreen3 != preferenceScreen1) {
        if (preferenceScreen1 != null)
          preferenceScreen1.p(); 
        ba11.g = preferenceScreen3;
        this.d0 = true;
        if (this.e0) {
          cj cj = this.h0;
          if (!cj.hasMessages(1))
            cj.obtainMessage(1).sendToTarget(); 
        } 
      } 
      R0((PreferenceGroup)this.b0.g);
      SettingsActivity settingsActivity = this.l0;
      Preference preference1 = D0("");
      settingsActivity.getClass();
      if (preference1 != null && preference1 instanceof ListPreference)
        preference1.B(((ListPreference)preference1).G()); 
      Bundle bundle = this.i;
      if (bundle != null) {
        this.k0 = bundle.getString("H");
        bundle.remove("H");
      } 
      return;
    } 
    l0.f("This should be called after super.onCreate.");
  }
  
  public final RecyclerView F0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    RecyclerView recyclerView = super.F0(paramLayoutInflater, paramViewGroup, paramBundle);
    recyclerView.setClipToPadding(false);
    g92.d((View)recyclerView, true, false);
    return recyclerView;
  }
  
  public final void J0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    boolean bool1 = j50.u();
    boolean bool = false;
    if (!bool1) {
      paramPreference.z(false);
      paramPreference.B(U(2131887014, new Object[] { j50.g() }));
      return;
    } 
    paramPreference.z(true);
    L0(paramPreference, "k_i_crgvcns", 2, Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) }, ), Arrays.asList(new String[] { T(2131886134), T(2131887541), T(2131886180) }));
    if (MyApplication.o().getInt("k_i_rgm", 0) != 0)
      bool = true; 
    paramPreference.z(bool);
  }
  
  public final void K0(Preference paramPreference, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt = S().getIntArray(paramInt2);
    String[] arrayOfString = S().getStringArray(paramInt3);
    paramInt2 = MyApplication.o().getInt(paramString, paramInt1);
    for (paramInt1 = 0; paramInt1 < arrayOfInt.length; paramInt1++) {
      if (arrayOfInt[paramInt1] == paramInt2) {
        paramPreference.B(arrayOfString[paramInt1]);
        return;
      } 
    } 
  }
  
  public final void M0(Preference paramPreference) {
    if (!j50.u()) {
      paramPreference.z(false);
      paramPreference.B(U(2131887014, new Object[] { j50.g() }));
      return;
    } 
    paramPreference.z(true);
    L0(paramPreference, "k_i_rgm", 0, Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) }, ), Arrays.asList(new String[] { T(2131886134), T(2131887518), T(2131886141) }));
  }
  
  public final void N0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    boolean bool1 = j50.u();
    boolean bool = false;
    if (!bool1) {
      paramPreference.z(false);
      paramPreference.B(U(2131887014, new Object[] { j50.g() }));
      return;
    } 
    paramPreference.z(true);
    StringBuilder stringBuilder = new StringBuilder();
    SharedPreferences sharedPreferences = MyApplication.o();
    String str = paramPreference.m;
    "k_f_rgpa".equals(str);
    stringBuilder.append(sharedPreferences.getFloat(str, 0.0F));
    stringBuilder.append(" dB");
    paramPreference.B(stringBuilder.toString());
    if (MyApplication.o().getInt("k_i_rgm", 0) != 0)
      bool = true; 
    paramPreference.z(bool);
  }
  
  public final void Q0(Preference paramPreference) {
    if (paramPreference != null) {
      int i = MyApplication.o().getInt("k_i_ams", 0);
      StringBuilder stringBuilder = new StringBuilder(T(2131886145));
      stringBuilder.append("<br/><b>");
      stringBuilder.append(T(2131886146));
      if ((i & 0x1) > 0) {
        stringBuilder.append(", ");
        stringBuilder.append(T(2131886150));
      } 
      if ((i & 0x2) > 0) {
        stringBuilder.append(", ");
        stringBuilder.append(T(2131886394));
      } 
      if ((i & 0x4) > 0) {
        stringBuilder.append(", ");
        stringBuilder.append(T(2131887601));
      } 
      stringBuilder.append("</b>");
      paramPreference.B(stringBuilder);
    } 
  }
  
  public final void R0(PreferenceGroup paramPreferenceGroup) {
    int i = paramPreferenceGroup.P.size();
    byte b = 0;
    for (sl1 sl11 = this;; sl11 = sl12) {
      sl1 sl12;
      if (b < i) {
        int j;
        Preference preference = paramPreferenceGroup.G(b);
        CharSequence charSequence = preference.m;
        boolean bool = preference instanceof androidx.preference.PreferenceCategory;
        if (bool)
          sl11.R0((PreferenceGroup)preference); 
        boolean bool1 = true;
        if (charSequence == null) {
          j = 1;
        } else {
          j = 0;
        } 
        if (preference instanceof PreferenceScreen || bool || preference instanceof TwoStatePreference)
          j = 1; 
        if (preference instanceof AutoUpdatingListPref) {
          charSequence = ((AutoUpdatingListPref)preference).G();
          sl12 = sl11;
          if (charSequence != null) {
            String str = charSequence.toString();
            preference.B(sl11.m0.matcher(str).replaceAll("%%"));
            sl1 sl13 = sl11;
          } 
        } else {
          if (!j)
            preference.g = (m91)sl11.l0; 
          if ("k_i_nstl".equals(charSequence)) {
            sl11.f1(preference);
            sl12 = sl11;
          } else if ("k_i_mn_bg".equals(charSequence)) {
            sl11.e1(preference);
            sl12 = sl11;
          } else if ("k_b_mn_alex".equals(charSequence)) {
            sl11.U0();
            sl12 = sl11;
          } else if ("k_b_mn_aa".equals(charSequence)) {
            T0(preference);
            sl12 = sl11;
          } else if ("k_b_mn_upcsngs".equals(charSequence)) {
            sl11.k1();
            sl12 = sl11;
          } else if ("k_b_mn_crcbcm".equals(charSequence)) {
            sl11.i1();
            sl12 = sl11;
          } else if ("k_b_clntfc".equals(charSequence)) {
            sl11.Z0(preference);
            sl12 = sl11;
          } else if ("THMR_BT".equals(charSequence)) {
            preference.B(sl11.l0.getResources().getStringArray(2130903043)[Integer.parseInt(MyApplication.o().getString("THMR_BT", "2"))]);
            sl12 = sl11;
          } else if ("k_b_hwsic".equals(charSequence)) {
            sl12 = sl11;
            if (wn1.f) {
              ((TwoStatePreference)preference).F(true);
              preference.z(false);
              sl12 = sl11;
            } 
          } else if ("S_SFSHAL".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886137).toLowerCase(), sl11.T(2131887386) }));
            sl12 = sl11;
          } else if ("S_SFSHAR".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886205).toLowerCase(), sl11.T(2131887390) }));
            sl12 = sl11;
          } else if ("S_SFSHALAR".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886150).toLowerCase(), sl11.T(2131887385).toLowerCase() }));
            sl12 = sl11;
          } else if ("S_SFSHCM".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886394).toLowerCase(), sl11.T(2131887391) }));
            sl12 = sl11;
          } else if ("S_SFSHGN".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886624).toLowerCase(), sl11.T(2131887393) }));
            sl12 = sl11;
          } else if ("S_SFSHFL".equals(charSequence)) {
            preference.B(sl11.U(2131887433, new Object[] { sl11.T(2131886582).toLowerCase(), sl11.T(2131887392) }));
            sl12 = sl11;
          } else {
            e3 e3;
            if ("k_i_eilfl".equals(charSequence)) {
              sl12 = sl11;
              if (Integer.parseInt(MyApplication.o().getString(sl11.T(2131886711), String.valueOf(1))) == 1) {
                preference.B(sl11.T(2131887009));
                preference.z(false);
                sl12 = sl11;
                if (Integer.MAX_VALUE != preference.h) {
                  preference.h = Integer.MAX_VALUE;
                  z91 z91 = preference.H;
                  sl12 = sl11;
                  if (z91 != null) {
                    Handler handler = z91.h;
                    e3 = z91.i;
                    handler.removeCallbacks(e3);
                    handler.post(e3);
                    sl1 sl13 = sl11;
                  } 
                } 
              } 
            } else if ("k_s_hfp".equals(charSequence)) {
              if (Integer.parseInt(MyApplication.o().getString(sl11.T(2131886711), String.valueOf(1))) == 1) {
                sl11.d1((Preference)e3, (String)charSequence);
                sl12 = sl11;
              } else {
                e3.B(sl11.T(2131887010));
                e3.z(false);
                sl12 = sl11;
              } 
            } else if ("k_b_aosptl".equals(charSequence)) {
              sl12 = sl11;
              if (MyApplication.o().getBoolean("k_b_aospta", false)) {
                ((TwoStatePreference)e3).F(true);
                e3.z(false);
                sl12 = sl11;
              } 
            } else if ("k_s_ffd".equals(charSequence) || "k_s_rwd".equals(charSequence)) {
              j = MyApplication.o().getInt((String)charSequence, 10);
              e3.B(sl11.S().getQuantityString(2131755058, j, new Object[] { Integer.valueOf(j) }));
              sl12 = sl11;
            } else if ("k_srt_sb_al".equals(charSequence)) {
              try {
              
              } finally {
                Exception exception = null;
              } 
            } else if ("mseqs".equals(charSequence)) {
              j = MyApplication.o().getInt("etu2", 0);
              bool = bool1;
              if (j != 0)
                if (j == 2) {
                  bool = bool1;
                } else {
                  bool = false;
                }  
              e3.z(bool);
              sl12 = sl11;
            } else if ("sosqala".equals(charSequence) || "sosqlrc".equals(charSequence)) {
              String str;
              if ("sosqala".equals(charSequence)) {
                str = "album art <al> <t>";
              } else {
                str = "lyrics <t> <al>";
              } 
              e3.B(MyApplication.o().getString((String)charSequence, str));
              sl12 = sl11;
            } else if ("k_i_boclalatnp".equals(charSequence)) {
              sl11.K0((Preference)e3, (String)charSequence, -2, 2130903087, 2130903063);
              sl12 = sl11;
            } else if ("k_s_marsp".equals(charSequence) || "k_s_malarsp".equals(charSequence) || "k_s_mcmsp".equals(charSequence)) {
              S0((Preference)e3, (String)charSequence, ", ; / | & ft. feat.");
              sl12 = sl11;
            } else {
              if ("k_s_mgnsp".equals(charSequence)) {
                S0((Preference)e3, (String)charSequence, ", ; / | &");
              } else if ("k_i_ams".equals(charSequence)) {
                sl11.Q0((Preference)e3);
              } else if ("k_i_fldjpg".equals(charSequence)) {
                sl11.l1((Preference)e3);
              } else if ("k_i_cfd".equals(charSequence)) {
                sl11.a1((Preference)e3);
              } else if ("k_i_adt".equals(charSequence)) {
                sl11.K0((Preference)e3, (String)charSequence, 0, 2130903078, 2130903051);
              } else {
                sl1 sl13;
                if ("msdci".equals(charSequence)) {
                  try {
                    StringBuilder stringBuilder = new StringBuilder();
                    this("s:");
                    stringBuilder.append(MusicService.E0.z());
                    e3.B(stringBuilder.toString());
                    sl13 = sl11;
                  } catch (Exception exception) {
                    e3.B(null);
                    sl13 = sl11;
                  } 
                } else {
                  if ("k_f_plyspd4".equals(charSequence)) {
                    j = j50.a;
                    MusicService musicService = MusicService.P0;
                    if (musicService != null)
                      musicService.J(); 
                    e3.B(null);
                    e3.z(true);
                  } else if ("etu2".equals(charSequence)) {
                    sl11.K0((Preference)e3, (String)charSequence, 0, 2130903071, 2130903053);
                  } else {
                    sl1 sl14;
                    if ("igthar_wl".equals(charSequence)) {
                      S0((Preference)e3, (String)charSequence, RqlokDsQOju.DaGQRouRToQswc);
                      sl14 = sl11;
                    } else if ("igthar_t".equals(charSequence) || "alpnmsr_t".equals(charSequence)) {
                      sl11.b1((Preference)e3, (String)charSequence);
                      sl14 = sl11;
                    } else if ("k_i_gds".equals(charSequence)) {
                      e3.z(MyApplication.o().getString(sl11.T(2131886706), "2").equals("2"));
                      L0((Preference)e3, (String)charSequence, 2, Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4) }, ), Arrays.asList(new String[] { sl11.T(2131887411), sl11.T(2131887410), sl11.T(2131886823), sl11.T(2131886245), sl11.T(2131886246) }));
                      sl14 = sl11;
                    } else if ("SAF_S_ATBKPFL".equals(charSequence)) {
                      W0((Preference)e3);
                      sl14 = sl11;
                    } else if ("k_i_pfsnr".equals(charSequence)) {
                      sl11.g1((Preference)e3);
                      sl14 = sl11;
                    } else if ("k_b_sskhpbt".equals(charSequence)) {
                      StringBuilder stringBuilder = new StringBuilder("\"");
                      stringBuilder.append(sl11.T(2131887317));
                      stringBuilder.append("\", \"");
                      stringBuilder.append(sl11.T(2131886278));
                      stringBuilder.append("\"");
                      e3.B(stringBuilder.toString());
                      sl14 = sl11;
                    } else if ("k_b_puwapl".equals(charSequence)) {
                      sl14 = sl11;
                      if (Build.VERSION.SDK_INT >= 31) {
                        sl14 = sl11;
                        if (MyApplication.o().getBoolean("k_b_puwapl", false)) {
                          sl14 = sl11;
                          if (n21.p(MyApplication.i.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                            sl14 = sl11;
                            if (e3 instanceof TwoStatePreference) {
                              ((TwoStatePreference)e3).F(false);
                              sl14 = sl11;
                            } 
                          } 
                        } 
                      } 
                    } else if ("k_b_rwbct".equals(charSequence)) {
                      if (Build.VERSION.SDK_INT >= 31 && MyApplication.o().getBoolean("k_b_rwbct", false) && n21.p(MyApplication.i.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") != 0 && e3 instanceof TwoStatePreference)
                        ((TwoStatePreference)e3).F(false); 
                      sl11.Y0((Preference)e3);
                      sl14 = sl11;
                    } else if ("k_b_rwwhct".equals(charSequence)) {
                      sl11.m1((Preference)e3);
                      sl14 = sl11;
                    } else if ("k_albgpk".equals(charSequence)) {
                      sl14 = sl11;
                    } else if ("k_i_rgm".equals(charSequence)) {
                      sl11.M0((Preference)e3);
                      sl14 = sl11;
                    } else if ("k_i_crgvcns".equals(charSequence)) {
                      sl11.J0((Preference)e3);
                      sl14 = sl11;
                    } else {
                      String str;
                      if ("k_i_rglsd".equals(charSequence)) {
                        if (!j50.u()) {
                          e3.z(false);
                          e3.B(sl11.U(2131887014, new Object[] { j50.g() }));
                          sl14 = sl11;
                        } else {
                          e3.z(true);
                          Locale locale = Locale.ENGLISH;
                          String str1 = sl11.T(2131887518);
                          lm0 lm01 = MyApplication.j.c;
                          int m = lm01.x;
                          j = lm01.b.size();
                          str = sl11.T(2131886141);
                          lm0 lm02 = MyApplication.j.c;
                          int k = lm02.y;
                          int n = lm02.b.size();
                          StringBuilder stringBuilder = new StringBuilder();
                          stringBuilder.append(str1);
                          stringBuilder.append(": ");
                          stringBuilder.append(m);
                          stringBuilder.append("/");
                          stringBuilder.append(j);
                          stringBuilder.append(" • ");
                          stringBuilder.append(str);
                          stringBuilder.append(": ");
                          stringBuilder.append(k);
                          stringBuilder.append("/");
                          stringBuilder.append(n);
                          e3.B(stringBuilder.toString());
                          sl14 = sl11;
                        } 
                      } else if ("k_f_rgpa".equals(str) || "k_f_rgpna".equals(str)) {
                        sl11.N0((Preference)e3);
                        sl14 = sl11;
                      } else {
                        SettingsActivity settingsActivity;
                        if ("k_b_mmpsb".equals(str)) {
                          settingsActivity = sl11.l0;
                          sl14 = sl11;
                          if (settingsActivity != null) {
                            sl14 = sl11;
                            if (settingsActivity.getIntent() != null) {
                              sl14 = sl11;
                              if (sl11.l0.getIntent().getBooleanExtra("e_b_imppls", false)) {
                                StringBuilder stringBuilder = new StringBuilder("#");
                                stringBuilder.append(sl11.T(2131886189).toLowerCase());
                                stringBuilder.append(" #");
                                stringBuilder.append(sl11.T(2131886842).toLowerCase().replaceAll("\\s+", ""));
                                e3.B(stringBuilder.toString());
                                e3.C(true);
                                sl1 sl15 = sl11;
                              } 
                            } 
                          } 
                        } else if ("k_b_dvoec".equals(settingsActivity)) {
                          e3.C(MyApplication.o().getBoolean(oXrNDUqUkE.ffjpHlyOyMHbugr, false));
                          sl14 = sl11;
                        } else if ("k_b_scvfl".equals(settingsActivity)) {
                          sl14 = sl11;
                          if (e3 instanceof TwoStatePreference) {
                            j1((TwoStatePreference)e3, sl11.T(2131887286));
                            sl14 = sl11;
                          } 
                        } else if ("k_b_scnmfl".equals(settingsActivity)) {
                          sl14 = sl11;
                          if (e3 instanceof TwoStatePreference) {
                            j1((TwoStatePreference)e3, sl11.T(2131887280));
                            sl14 = sl11;
                          } 
                        } else if ("k_b_schdfl".equals(settingsActivity)) {
                          sl14 = sl11;
                          if (e3 instanceof TwoStatePreference) {
                            j1((TwoStatePreference)e3, sl11.T(2131887278));
                            sl14 = sl11;
                          } 
                        } else if ("lmacc_km".equals(settingsActivity)) {
                          StringBuilder stringBuilder = new StringBuilder("<small>* ");
                          stringBuilder.append(sl11.T(2131886739));
                          stringBuilder.append(" (<u>");
                          stringBuilder.append(sl11.T(2131886718));
                          stringBuilder.append("</u>)</small>");
                          e3.B((CharSequence)Html.fromHtml(stringBuilder.toString()));
                          sl11.c1();
                          sl14 = sl11;
                        } else if ("B_R_AFL".equals(settingsActivity)) {
                          sl11.V0((Preference)e3);
                          sl14 = sl11;
                        } else if ("~k_b_aexpctcsvf".equals(settingsActivity)) {
                          sl14 = sl11;
                          if (ws2.U()) {
                            e3.C(true);
                            sl14 = sl11;
                          } 
                        } else if ("SAF_S_ATEXCVPFL".equals(settingsActivity)) {
                          X0((Preference)e3);
                          sl14 = sl11;
                        } else if ("k_i_hwqwsnaex".equals(settingsActivity)) {
                          sl11.h1((Preference)e3);
                          sl14 = sl11;
                        } else {
                          "".equals(settingsActivity);
                          sl14 = sl11;
                        } 
                      } 
                    } 
                    b++;
                    sl11 = sl14;
                  } 
                  sl13 = sl11;
                } 
                b++;
                sl11 = sl13;
              } 
              sl12 = sl11;
            } 
          } 
        } 
      } else {
        return;
      } 
      b++;
    } 
  }
  
  public final void U0() {
    boolean bool1;
    boolean bool2;
    TwoStatePreference twoStatePreference = (TwoStatePreference)D0("k_b_mn_alex");
    Preference preference2 = D0("k_b_mn_ex_blayt");
    Preference preference1 = D0("k_b_mn_cp_blayt");
    if (Build.VERSION.SDK_INT >= 31 || MyApplication.o().getBoolean("k_b_mn_ex", true)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int i = MyApplication.o().getInt("k_i_nstl", jm1.d);
    if (!bool1)
      twoStatePreference.F(false); 
    if (i != 2 && bool1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    twoStatePreference.z(bool2);
    if (ag0.c0()) {
      twoStatePreference.C(false);
      twoStatePreference.F(false);
      D0("k_b_mn_ex").C(false);
      bool1 = true;
    } 
    if (i == 2) {
      preference1.z(false);
      preference2.z(true);
      return;
    } 
    if (twoStatePreference.O) {
      preference1.z(false);
    } else {
      preference1.z(true);
    } 
    if (bool1) {
      preference2.z(true);
      return;
    } 
    preference2.z(false);
  }
  
  public final void V0(Preference paramPreference) {
    // Byte code:
    //   0: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3: ldc_w 'B_R_AFL'
    //   6: iconst_3
    //   7: invokeinterface getInt : (Ljava/lang/String;I)I
    //   12: istore_2
    //   13: aload_0
    //   14: ldc_w 2131886733
    //   17: iconst_1
    //   18: anewarray java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: iload_2
    //   24: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   27: aastore
    //   28: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore #4
    //   33: iload_2
    //   34: ifeq -> 45
    //   37: aload #4
    //   39: astore_3
    //   40: iload_2
    //   41: iconst_1
    //   42: if_icmpne -> 79
    //   45: aload #4
    //   47: ldc_w '&nbsp&nbsp<small>⚠️ <i>('
    //   50: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: astore_3
    //   54: aload_3
    //   55: aload_0
    //   56: ldc_w 2131887012
    //   59: invokevirtual T : (I)Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload_3
    //   67: ldc_w ')</i></small>'
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_3
    //   75: invokevirtual toString : ()Ljava/lang/String;
    //   78: astore_3
    //   79: aload_1
    //   80: aload_3
    //   81: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   84: invokevirtual B : (Ljava/lang/CharSequence;)V
    //   87: return
  }
  
  public final void Y0(Preference paramPreference) {
    if (Build.VERSION.SDK_INT >= 35 && MyApplication.o().getBoolean("k_b_rwbct", false)) {
      StringBuilder stringBuilder = new StringBuilder("<small>");
      stringBuilder.append(T(2131887564));
      stringBuilder.append("</small>");
      paramPreference.B((CharSequence)Html.fromHtml(stringBuilder.toString()));
      return;
    } 
    paramPreference.B(null);
  }
  
  public final void Z0(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    if (Build.VERSION.SDK_INT >= 35 || MyApplication.o().getBoolean("k_b_sclnot", true)) {
      int j = MyApplication.o().getInt("k_i_nstl", jm1.d);
      if (j == 2) {
        paramPreference.B(T(2131887007));
        paramPreference.z(false);
        return;
      } 
      int i = MyApplication.o().getInt("k_i_mn_bg", jm1.a);
      if (j == 1)
        i = 4; 
      if (i != 0 && i != 1 && i != 4) {
        paramPreference.B(T(2131887006));
        paramPreference.z(false);
        return;
      } 
      paramPreference.B(T(2131886370));
      paramPreference.z(true);
      return;
    } 
    paramPreference.B(T(2131886366));
    paramPreference.z(false);
  }
  
  public final void a1(Preference paramPreference) {
    if (paramPreference != null) {
      if (MyApplication.o().getInt("etu2", 0) == 1) {
        paramPreference.B(U(2131887014, new Object[] { T(2131887483) }));
        paramPreference.z(false);
        return;
      } 
      paramPreference.z(true);
      try {
        int i = MyApplication.o().getInt("k_i_cfd", 0);
        if (i == 0) {
          paramPreference.B(T(2131886134));
          return;
        } 
        paramPreference.B(ag0.u(3, i));
      } finally {}
    } 
  }
  
  public final void b1(Preference paramPreference, String paramString) {
    SharedPreferences sharedPreferences = MyApplication.o();
    boolean bool4 = false;
    int i = sharedPreferences.getInt(paramString, 0);
    if (i == 0) {
      paramPreference.B(paramPreference.b.getString(2131887004));
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    if ((i & 0x1) > 0) {
      stringBuilder.append(T(2131887508));
      bool2 = false;
    } else {
      bool2 = true;
    } 
    boolean bool1 = bool2;
    if ((i & 0x2) > 0) {
      if (!bool2)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886563));
      bool1 = false;
    } 
    boolean bool3 = bool1;
    if ((i & 0x4) > 0) {
      if (!bool1)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886582));
      bool3 = false;
    } 
    boolean bool2 = bool3;
    if ((i & 0x8) > 0) {
      if (!bool3)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886137));
      bool2 = false;
    } 
    bool1 = bool2;
    if ((i & 0x10) > 0) {
      if (!bool2)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886205));
      bool1 = false;
    } 
    bool2 = bool1;
    if ((i & 0x20) > 0) {
      if (!bool1)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886150));
      bool2 = false;
    } 
    if ((i & 0x40) > 0) {
      if (!bool2)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131886394));
      bool1 = bool4;
    } else {
      bool1 = bool2;
    } 
    if ((i & 0x80) > 0) {
      if (!bool1)
        stringBuilder.append(", "); 
      stringBuilder.append(T(2131887096));
    } 
    paramPreference.B(stringBuilder);
  }
  
  public final void c1() {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 'lmacc_km'
    //   4: invokevirtual D0 : (Ljava/lang/CharSequence;)Landroidx/preference/Preference;
    //   7: astore #4
    //   9: aload #4
    //   11: ifnull -> 84
    //   14: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   17: invokevirtual g : ()Z
    //   20: istore_3
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: istore_1
    //   25: iload_3
    //   26: ifeq -> 78
    //   29: invokestatic o : ()Landroid/content/SharedPreferences;
    //   32: ldc_w 'k_b_schdfl'
    //   35: iconst_0
    //   36: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   41: ifne -> 76
    //   44: invokestatic o : ()Landroid/content/SharedPreferences;
    //   47: ldc_w 'k_b_scnmfl'
    //   50: iconst_0
    //   51: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   56: ifne -> 76
    //   59: iload_2
    //   60: istore_1
    //   61: invokestatic o : ()Landroid/content/SharedPreferences;
    //   64: ldc_w 'k_b_scvfl'
    //   67: iconst_0
    //   68: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   73: ifeq -> 78
    //   76: iconst_1
    //   77: istore_1
    //   78: aload #4
    //   80: iload_1
    //   81: invokevirtual C : (Z)V
    //   84: return
    //   85: astore #4
    //   87: goto -> 84
    // Exception table:
    //   from	to	target	type
    //   0	9	85	finally
    //   14	21	85	finally
    //   29	59	85	finally
    //   61	76	85	finally
    //   78	84	85	finally
  }
  
  public final void d1(Preference paramPreference, String paramString) {
    try {
      String str = MyApplication.j.c.t.c;
      paramString = MyApplication.o().getString(paramString, str);
      if (TextUtils.equals(str, paramString.toLowerCase(Locale.ENGLISH)))
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(T(2131886416));
      stringBuilder.append(" ");
      stringBuilder.append(ml0.a((MyApplication.F.c(paramString)).b));
      return;
    } finally {
      paramPreference = null;
      paramPreference.printStackTrace();
    } 
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.l0 = (SettingsActivity)paramContext;
  }
  
  public final void e1(Preference paramPreference) {
    if (paramPreference != null) {
      int i = MyApplication.o().getInt("k_i_nstl", jm1.d);
      byte b = 0;
      if (i == 0) {
        paramPreference.z(true);
        String[] arrayOfString = S().getStringArray(2130903056);
        int[] arrayOfInt = P().getResources().getIntArray(2130903082);
        i = MyApplication.o().getInt("k_i_mn_bg", jm1.a);
        while (b < arrayOfInt.length) {
          if (arrayOfInt[b] == i) {
            paramPreference.B(arrayOfString[b]);
            return;
          } 
          b++;
        } 
        return;
      } 
      paramPreference.B(paramPreference.b.getString(2131887007));
      paramPreference.z(false);
      return;
    } 
  }
  
  public final void f1(Preference paramPreference) {
    if (paramPreference == null)
      return; 
    String[] arrayOfString = S().getStringArray(2130903057);
    int[] arrayOfInt = P().getResources().getIntArray(2130903083);
    int j = MyApplication.o().getInt("k_i_nstl", jm1.d);
    boolean bool = false;
    int i;
    for (i = 0; i < arrayOfInt.length; i++) {
      if (arrayOfInt[i] == j) {
        String str2 = arrayOfString[i];
        String str1 = str2;
        if (Build.VERSION.SDK_INT >= 31)
          if (j == 2) {
            str1 = str2;
          } else {
            str1 = x41.k("⚠️ ", str2);
          }  
        paramPreference.B(str1);
        break;
      } 
    } 
    if (j == 2) {
      try {
        TwoStatePreference twoStatePreference = (TwoStatePreference)D0("k_b_mn_ex");
        twoStatePreference.F(true);
        twoStatePreference.z(false);
        D0("k_b_mn_alex").z(false);
        D0("k_b_mn_cp_blayt").z(false);
        D0("k_b_mn_ex_blayt").z(true);
      } finally {}
    } else {
      D0("k_b_mn_ex").z(true);
      U0();
    } 
    e1(D0("k_i_mn_bg"));
    T0(D0("k_b_mn_aa"));
    i = Build.VERSION.SDK_INT;
    if (i >= 33) {
      paramPreference = D0("k_i_mn_bg");
      if (paramPreference != null) {
        boolean bool1;
        if (j == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramPreference.C(bool1);
      } 
      paramPreference = D0("k_b_mn_aa");
      if (paramPreference != null) {
        boolean bool1;
        if (j == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramPreference.C(bool1);
      } 
      paramPreference = D0("k_b_clntfc");
      if (paramPreference != null) {
        boolean bool1;
        if (j == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramPreference.C(bool1);
      } 
      paramPreference = D0("k_b_sclnot");
      if (paramPreference != null) {
        boolean bool1;
        if (j == 0 && i < 35) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramPreference.C(bool1);
      } 
      paramPreference = D0("cmopctnt");
      if (paramPreference != null) {
        boolean bool1;
        if (j == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramPreference.C(bool1);
      } 
      paramPreference = D0("expndnt");
      if (paramPreference != null) {
        boolean bool1 = bool;
        if (j == 0)
          bool1 = true; 
        paramPreference.C(bool1);
      } 
    } 
  }
  
  public final void g1(Preference paramPreference) {
    L0(paramPreference, "k_i_pfsnr", 0, Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1) }, ), Arrays.asList(new String[] { T(2131887485), T(2131886970) }));
  }
  
  public final void h1(Preference paramPreference) {
    ArrayList<Object> arrayList1 = new ArrayList(2);
    byte b;
    for (b = 0; b < 2; b++) {
      (new Object[2])[0] = Integer.valueOf(0);
      (new Object[2])[1] = Integer.valueOf(1);
      Object object = (new Object[2])[b];
      Objects.requireNonNull(object);
      arrayList1.add(object);
    } 
    List list = Collections.unmodifiableList(arrayList1);
    String str2 = T(2131887189);
    String str1 = T(2131886824);
    ArrayList<Object> arrayList2 = new ArrayList(2);
    for (b = 0; b < 2; b++) {
      (new Object[2])[0] = str2;
      (new Object[2])[1] = str1;
      Object object = (new Object[2])[b];
      Objects.requireNonNull(object);
      arrayList2.add(object);
    } 
    L0(paramPreference, "k_i_hwqwsnaex", 0, list, Collections.unmodifiableList(arrayList2));
  }
  
  public final void i1() {
    TwoStatePreference twoStatePreference1 = (TwoStatePreference)D0("k_b_mn_crcbcm");
    TwoStatePreference twoStatePreference2 = (TwoStatePreference)D0(ckOPp.bhJeCssD);
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    if (i >= 35 || MyApplication.o().getBoolean("k_b_sclnot", true)) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0 && D0("k_b_mn_cp_blayt").i()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    twoStatePreference1.z(bool1);
    boolean bool1 = bool2;
    if (i != 0) {
      bool1 = bool2;
      if (D0("k_b_mn_ex_blayt").i())
        bool1 = true; 
    } 
    twoStatePreference2.z(bool1);
  }
  
  public final void k1() {
    TwoStatePreference twoStatePreference = (TwoStatePreference)D0("k_b_mn_upcsngs");
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    if (i >= 31 || MyApplication.o().getBoolean("k_b_mn_ex", true)) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = MyApplication.o().getInt("k_i_nstl", jm1.d);
    boolean bool1 = bool2;
    if (j == 0) {
      bool1 = bool2;
      if (i != 0)
        bool1 = true; 
    } 
    twoStatePreference.z(bool1);
    if (j != 0) {
      twoStatePreference.B(((Preference)twoStatePreference).b.getString(2131887007));
      return;
    } 
    twoStatePreference.B(null);
  }
  
  public final void l0() {
    this.I = true;
    this.b0.b().unregisterOnSharedPreferenceChangeListener(this);
  }
  
  public final void l1(Preference paramPreference) {
    boolean bool;
    String[] arrayOfString = S().getStringArray(2130903062);
    int[] arrayOfInt = P().getResources().getIntArray(2130903086);
    int i = MyApplication.o().getInt("k_i_fldjpg", jm1.e);
    byte b = 0;
    if (i != 0 && MyApplication.G.g()) {
      bool = true;
    } else {
      bool = false;
    } 
    while (b < arrayOfInt.length) {
      if (arrayOfInt[b] == i) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(T(2131886593));
        stringBuilder.append(": <b>");
        stringBuilder.append(arrayOfString[b]);
        if (bool) {
          str = " *";
        } else {
          str = "";
        } 
        stringBuilder.append(str);
        stringBuilder.append("</b>");
        paramPreference.B(stringBuilder.toString());
        return;
      } 
      b++;
    } 
  }
  
  public final void m0() {
    this.I = true;
    this.b0.b().registerOnSharedPreferenceChangeListener(this);
    PreferenceScreen preferenceScreen = this.b0.g;
    CharSequence charSequence2 = ((Preference)preferenceScreen).i;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = S().getString(2131887354); 
    this.l0.Y().g0(charSequence1);
    SettingsActivity settingsActivity = this.l0;
    settingsActivity.Y = ((Preference)preferenceScreen).m;
    settingsActivity.n0();
    charSequence2 = settingsActivity.d0;
    if (charSequence2 != null) {
      settingsActivity.d0 = null;
      Preference preference = settingsActivity.Z.D0(charSequence2);
      if (preference != null)
        preference.v(); 
    } 
    no no = settingsActivity.f0;
    if (no != null)
      settingsActivity.f0 = null; 
    if ("webinfo".equals(settingsActivity.Y) && !MyApplication.x().getBoolean("stwebie", false)) {
      MyApplication.x().edit().putBoolean("stwebie", true).apply();
      ms0 ms0 = new ms0((Context)settingsActivity);
      ms0.q(2131887577);
      ms0.c(2131886664);
      ms0.n(2131886639);
      ms0.p();
    } 
    if ("k_b_puwapl_".equals(settingsActivity.Y) && !MyApplication.x().getBoolean("stpruwape", false)) {
      MyApplication.x().edit().putBoolean("stpruwape", true).apply();
      settingsActivity.x0();
    } 
    if (settingsActivity.b0 != null)
      settingsActivity.m0(); 
    if ("tag_adv".equals(settingsActivity.Y)) {
      Object object = new Object();
      ((kv0)object).a = MyApplication.o().getBoolean("k_b_scnmfl", false);
      ((kv0)object).b = MyApplication.o().getBoolean("k_b_schdfl", false);
      ((kv0)object).c = MyApplication.o().getBoolean("k_b_scvfl", false);
      ((kv0)object).d = MyApplication.o().getBoolean("k_b_cuarialarim", false);
      settingsActivity.b0 = (kv0)object;
    } 
    this.l0.Z = this;
    RecyclerView recyclerView = this.c0;
    this.j0 = recyclerView;
    String str = this.k0;
    this.k0 = null;
    recyclerView.postDelayed(new e6(20, this, str), 50L);
  }
  
  public final void m1(Preference paramPreference) {
    if (MyApplication.o().getBoolean("k_b_rwwhct", false)) {
      StringBuilder stringBuilder = new StringBuilder("<small>");
      stringBuilder.append(T(2131887218));
      stringBuilder.append("</small>");
      paramPreference.B((CharSequence)Html.fromHtml(stringBuilder.toString()));
      return;
    } 
    paramPreference.B(null);
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString) {
    if (!RestoreActivity.A0) {
      Preference preference = D0(paramString);
      if (preference != null) {
        if (preference instanceof AutoUpdatingListPref) {
          String str = ((AutoUpdatingListPref)preference).G().toString();
          preference.B(this.m0.matcher(str).replaceAll("%%"));
        } 
        if (!"THMR_BT".equals(paramString))
          if (this.l0.getString(2131886706).equals(paramString)) {
            Preference preference1 = D0("k_i_gds");
            if (preference1 != null)
              preference1.z(MyApplication.o().getString(T(2131886706), "2").equals("2")); 
            MusicActivity musicActivity = MusicActivity.R0;
            if (musicActivity != null) {
              musicActivity.i0();
              return;
            } 
          } else if ("k_i_gds".equals(paramString)) {
            try {
              L0(preference, paramString, 2, Arrays.asList(new Integer[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4) }, ), Arrays.asList(new String[] { T(2131887411), T(2131887410), T(2131886823), T(2131886245), T(2131886246) }));
              return;
            } finally {
              paramSharedPreferences = null;
            } 
          } else {
            ss0 ss0;
            if ("etu2".equals(paramString)) {
              boolean bool;
              K0(preference, paramString, 0, 2130903071, 2130903053);
              int i = paramSharedPreferences.getInt("etu2", 0);
              if (i == 0 || i == 2) {
                bool = true;
              } else {
                bool = false;
              } 
              Preference preference1 = D0("mseqs");
              if (preference1 != null)
                preference1.z(bool); 
              a1(D0("k_i_cfd"));
              try {
                MusicActivity.R0.d0.D0();
              } finally {}
              ms0 ms0 = new ms0((Context)this.l0);
              ms0.c(2131886199);
              ms0.J = false;
              ms0.K = false;
              ms0.o(0, true);
              ss0 = ms0.p();
              (new Handler(Looper.getMainLooper())).postDelayed(new xt0(16, ss0), 3500L);
            } else if ("B_PF_FILNMIOTTL".equals(paramString)) {
              try {
                ag0.h = ss0.getBoolean(paramString, false);
                MusicService.v0(MusicService.y());
                MusicActivity musicActivity = MusicActivity.R0;
                if (musicActivity != null) {
                  musicActivity.K0();
                  musicActivity.M0();
                } 
                MusicService.P0.D();
                if (ag0.h)
                  return; 
                return;
              } finally {
                ss0 = null;
              } 
            } else {
              if (this.l0.getString(2131886711).equals(paramString) || paramString.equals("IA_TABO")) {
                P0(false);
                return;
              } 
              if (paramString.equals("I_E_D_SEC_SCN") || paramString.equals("k_b_mare") || paramString.equals("k_b_malare") || paramString.equals("k_b_mcme") || paramString.equals("k_b_mgne")) {
                O0(M());
                return;
              } 
              if ("B_R_AF".equals(paramString)) {
                if (!ss0.getBoolean(paramString, true)) {
                  ms0 ms0 = new ms0((Context)this.l0);
                  ms0.q(2131886216);
                  ms0.c(2131887196);
                  ms0.n(2131886639);
                  ms0.p();
                  return;
                } 
                if (MusicService.P0 != null && MusicService.F0) {
                  MusicService musicService = MusicService.P0;
                  if (musicService.v != null && !musicService.j) {
                    musicService.X(new Integer[0]);
                    MusicService.P0.v.postDelayed(new l3(19), 500L);
                    return;
                  } 
                } 
              } else if ("B_SYSLCSBG".equals(paramString)) {
                try {
                  MusicService musicService = MusicService.P0;
                } finally {
                  ss0 = null;
                } 
              } else {
                String str = CKYHNesT.vdUuuUUCPJQtO;
                if (paramString.equals(str)) {
                  try {
                    int i = ss0.getInt(str, jm1.e);
                    boolean bool = MyApplication.G.g();
                  } finally {
                    ss0 = null;
                  } 
                } else if ("k_b_dsblaald".equals(paramString)) {
                  try {
                    p3.b = MyApplication.o().getBoolean("k_b_dsblaald", true);
                    p3.a.clear();
                    MusicActivity musicActivity = MusicActivity.R0;
                    if (musicActivity != null) {
                      musicActivity.K0();
                      musicActivity.M0();
                      musicActivity.n0 = 0;
                    } 
                    MyApplication.f();
                    dd1.f();
                    zo2.c();
                    MusicService.P0.D();
                    return;
                  } catch (Exception exception) {
                    exception.printStackTrace();
                  } 
                } else if ("k_b_aaquet".equals(paramString)) {
                  try {
                    return;
                  } finally {
                    ss0 = null;
                  } 
                } else if ("k_b_gcnp".equals(paramString)) {
                  try {
                    return;
                  } finally {
                    ss0 = null;
                  } 
                } else {
                  if ("k_b_alaric".equals(paramString) || "k_b_ar".equals(paramString) || "k_b_al".equals(paramString) || "k_b_ctrali".equals(paramString) || "k_i_ffrwnp3".equals(paramString) || "k_b_npsctx".equals(paramString)) {
                    try {
                      return;
                    } finally {
                      ss0 = null;
                    } 
                    return;
                  } 
                  if ("k_b_arsubcme".equals(paramString)) {
                    try {
                      MusicActivity.R0.a0.N0();
                      Preference preference1 = D0("k_srt_sb_al");
                    } finally {
                      ss0 = null;
                    } 
                  } else if (nBRIsU.QBbmFABOTWgmd.equals(paramString)) {
                    try {
                      return;
                    } finally {
                      ss0 = null;
                    } 
                  } else if ("k_b_gnsubcme".equals(paramString)) {
                    try {
                      return;
                    } finally {
                      ss0 = null;
                    } 
                  } else if ("k_i_prflrsc".equals(paramString)) {
                    try {
                      z71 z71 = MusicActivity.R0.d0;
                      z71.V0 = null;
                      return;
                    } finally {
                      ss0 = null;
                    } 
                  } else if ("k_b_hwsic".equals(paramString)) {
                    try {
                      ag0.i = MyApplication.o().getBoolean(paramString, false);
                      MusicService.v0(MusicService.y());
                      MusicActivity musicActivity = MusicActivity.R0;
                      if (musicActivity != null)
                        musicActivity.d0.g1(); 
                      return;
                    } finally {
                      ss0 = null;
                    } 
                  } else {
                    ez0 ez0;
                    if ("k_b_hwsie".equals(paramString)) {
                      try {
                        int i;
                        boolean bool = MyApplication.o().getBoolean(paramString, false);
                        this.b0.b().unregisterOnSharedPreferenceChangeListener(this);
                        TwoStatePreference twoStatePreference = (TwoStatePreference)preference;
                        int j = bool ^ true;
                        twoStatePreference.F(j);
                        MyApplication.o().edit().putBoolean("k_b_hwsie", j).apply();
                        this.b0.b().registerOnSharedPreferenceChangeListener(this);
                        if (bool) {
                          i = 2131886663;
                        } else {
                          i = 2131886662;
                        } 
                        ms0 ms0 = new ms0();
                        this(P());
                        ms0.c(i);
                        ms0.k(2131886278);
                        ms0.n(2131886672);
                        ez0 = new ez0();
                        this(this, bool, preference);
                        ms0.m(ez0);
                        return;
                      } finally {
                        ss0 = null;
                      } 
                    } else {
                      if ("k_b_aospta".equals(ez0) || "k_b_aosptl".equals(ez0)) {
                        try {
                          if ("k_b_aospta".equals(ez0)) {
                            CheckBoxPreference checkBoxPreference = (CheckBoxPreference)D0("k_b_aosptl");
                            this.b0.b().unregisterOnSharedPreferenceChangeListener(this);
                            if (MyApplication.o().getBoolean("k_b_aospta", false)) {
                              checkBoxPreference.F(true);
                              checkBoxPreference.z(false);
                            } else {
                              checkBoxPreference.F(MyApplication.o().getBoolean("k_b_aosptl", true));
                              checkBoxPreference.z(true);
                            } 
                            this.b0.b().registerOnSharedPreferenceChangeListener(this);
                          } 
                          return;
                        } finally {
                          ss0 = null;
                        } 
                        return;
                      } 
                      if ("k_s_ffd".equals(ez0) || "k_s_rwd".equals(ez0)) {
                        int i = MyApplication.o().getInt((String)ez0, 10);
                        preference.B(S().getQuantityString(2131755058, i, new Object[] { Integer.valueOf(i) }));
                        return;
                      } 
                      if ("k_s_hfp".equals(ez0)) {
                        d1(preference, (String)ez0);
                        MusicActivity.R0.g0.I0(MyApplication.j.c.u);
                        return;
                      } 
                      if ("B_PF_EXOSWP".equals(ez0)) {
                        ag0.O0(2131886557, 1);
                        return;
                      } 
                      if ("k_b_qsque".equals(ez0)) {
                        try {
                          return;
                        } finally {
                          ss0 = null;
                        } 
                      } else if ("k_b_qsfl1".equals(ez0)) {
                        try {
                          r90 r90 = MusicActivity.R0.c0;
                          if (r90 != null)
                            r90.H0(); 
                          gf0 gf0 = MusicActivity.R0.g0;
                        } finally {
                          ss0 = null;
                        } 
                      } else if ("k_b_qsal1".equals(ez0)) {
                        try {
                          wn wn = MusicActivity.R0.Z;
                        } finally {
                          ss0 = null;
                        } 
                      } else if ("k_b_qsar1".equals(ez0)) {
                        try {
                          wn wn = MusicActivity.R0.a0;
                        } finally {
                          ss0 = null;
                        } 
                      } else if ("k_b_qsgn1".equals(ez0)) {
                        try {
                          wn wn = MusicActivity.R0.b0;
                        } finally {
                          ss0 = null;
                        } 
                      } else if ("k_b_qspl1".equals(ez0)) {
                        try {
                          l81 l81 = MusicActivity.R0.e0;
                        } finally {
                          ss0 = null;
                        } 
                      } else {
                        if ("k_i_nstl".equals(ez0)) {
                          f1(D0((CharSequence)ez0));
                          k1();
                          i1();
                          Z0(D0("k_b_clntfc"));
                          zo2.c();
                          MusicService.O0();
                          return;
                        } 
                        if ("k_i_mn_bg".equals(ez0)) {
                          e1(D0((CharSequence)ez0));
                          Z0(D0("k_b_clntfc"));
                          zo2.c();
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_mn_aa".equals(ez0)) {
                          T0(D0("k_b_mn_aa"));
                          zo2.c();
                          I0();
                          i1();
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_sclnot".equals(ez0)) {
                          I0();
                          i1();
                          Z0(D0("k_b_clntfc"));
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_clntfc".equals(ez0)) {
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_mn_ex".equals(ez0)) {
                          U0();
                          k1();
                          i1();
                          zo2.c();
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_mn_alex".equals(ez0)) {
                          U0();
                          i1();
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_mn_upcsngs".equals(ez0)) {
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_mn_crcbcm".equals(ez0) || "k_b_mn_crcbex".equals(ez0)) {
                          MusicService.O0();
                          return;
                        } 
                        if ("k_b_glp".equals(ez0)) {
                          hc hc = MusicService.E0;
                          if (hc instanceof kd) {
                            ((kd)hc).l0(MyApplication.o().getBoolean((String)ez0, true));
                            return;
                          } 
                        } else {
                          if ("k_b_atbkpe".equals(ez0)) {
                            tb.j();
                            return;
                          } 
                          if ("k_b_rwwhct".equals(ez0)) {
                            m1(preference);
                            return;
                          } 
                          if ("k_b_eqrefe".equals(ez0)) {
                            if (MyApplication.o().getBoolean("k_b_eqrefe", false)) {
                              ms0 ms0 = new ms0(P());
                              ms0.q(2131887234);
                              ms0.c(2131887232);
                              ms0.J = false;
                              ms0.K = false;
                              ms0.n(2131886639);
                              ms0.p();
                            } 
                            if (MyApplication.o().getInt("etu2", 0) == 0)
                              try {
                                MusicService.P0.a0(3000L);
                                EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
                              } finally {
                                ss0 = null;
                              }  
                          } else {
                            CharSequence charSequence;
                            if ("sosqala".equals(ez0) || "sosqlrc".equals(ez0)) {
                              String str1;
                              if ("sosqala".equals(ez0)) {
                                str1 = "album art <al> <t>";
                              } else {
                                str1 = "lyrics <t> <al>";
                              } 
                              preference.B(MyApplication.o().getString((String)ez0, str1));
                              return;
                            } 
                            if ("k_i_boclalatnp".equals(ez0)) {
                              K0(preference, (String)ez0, -2, 2130903087, 2130903063);
                              return;
                            } 
                            if ("k_b_puwapl".equals(ez0)) {
                              if (MyApplication.o().getBoolean("k_b_puwapl", false)) {
                                if (Build.VERSION.SDK_INT >= 31 && n21.p(MyApplication.d(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                                  if (preference instanceof TwoStatePreference)
                                    ((TwoStatePreference)preference).F(false); 
                                  SettingsActivity settingsActivity = this.l0;
                                  charSequence = preference.h();
                                  settingsActivity.j0(new String[] { "android.permission.BLUETOOTH_CONNECT" }, charSequence, "android.permission-group.NEARBY_DEVICES", 10111);
                                  return;
                                } 
                              } else {
                                Preference preference1 = D0("k_b_puwaplstrct");
                                if (preference1 instanceof CheckBoxPreference) {
                                  ((CheckBoxPreference)preference1).F(false);
                                  return;
                                } 
                              } 
                            } else {
                              MusicService musicService;
                              if ("k_s_marsp".equals(charSequence) || "k_s_malarsp".equals(charSequence) || "k_s_mcmsp".equals(charSequence) || "k_s_mgnsp".equals(charSequence)) {
                                S0(D0(charSequence), (String)charSequence, ", ; / | & ft. feat.");
                                O0(M());
                                return;
                              } 
                              if ("k_i_ams".equals(charSequence)) {
                                Q0(D0(charSequence));
                                O0(M());
                                return;
                              } 
                              if ("k_i_cfd".equals(charSequence)) {
                                a1(preference);
                                return;
                              } 
                              if ("k_i_adt".equals(charSequence)) {
                                K0(preference, (String)charSequence, 0, 2130903078, 2130903051);
                                Preference preference1 = D0("k_f_plyspd4");
                                if (preference1 != null) {
                                  int i = j50.a;
                                  musicService = MusicService.P0;
                                  if (musicService != null)
                                    musicService.J(); 
                                  preference1.B(null);
                                  preference1.z(true);
                                  return;
                                } 
                              } else if ("igthar_wl".equals(musicService)) {
                                if (!MyApplication.o().getString("igthar_wl", "A An The").equals(z51.t)) {
                                  z51.t = MyApplication.o().getString("igthar_wl", "A An The");
                                  S0(preference, (String)musicService, "A An The");
                                  z51.q = null;
                                  H0();
                                  return;
                                } 
                              } else if ("igthar_t".equals(musicService)) {
                                if (MyApplication.o().getInt("igthar_t", 0) != z51.r) {
                                  z51.r = MyApplication.o().getInt("igthar_t", 0);
                                  b1(preference, (String)musicService);
                                  z51.q = null;
                                  H0();
                                  return;
                                } 
                              } else if ("alpnmsr_t".equals(musicService)) {
                                if (MyApplication.o().getInt("alpnmsr_t", 0) != z51.s) {
                                  z51.s = MyApplication.o().getInt("alpnmsr_t", 0);
                                  b1(preference, (String)musicService);
                                  z51.J();
                                  H0();
                                  return;
                                } 
                              } else if ("k_i_tbabt".equals(musicService)) {
                                MusicActivity musicActivity = MusicActivity.R0;
                                if (musicActivity != null) {
                                  musicActivity.i0();
                                  return;
                                } 
                              } else {
                                CharSequence charSequence1;
                                if ("k_i_pfsnr".equals(musicService)) {
                                  g1(preference);
                                  return;
                                } 
                                if ("k_b_rwbct".equals(musicService)) {
                                  if (Build.VERSION.SDK_INT >= 31 && MyApplication.o().getBoolean("k_b_rwbct", false) && n21.p(MyApplication.d(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                                    if (preference instanceof TwoStatePreference)
                                      ((TwoStatePreference)preference).F(false); 
                                    SettingsActivity settingsActivity = this.l0;
                                    charSequence1 = preference.h();
                                    settingsActivity.j0(new String[] { "android.permission.BLUETOOTH_CONNECT" }, charSequence1, "android.permission-group.NEARBY_DEVICES", 10110);
                                  } 
                                  Y0(preference);
                                  return;
                                } 
                                if ("k_i_rgm".equals(charSequence1)) {
                                  M0(preference);
                                  N0(D0("k_f_rgpa"));
                                  N0(D0("k_f_rgpna"));
                                  if (MusicService.P0 != null && MusicService.F0) {
                                    MusicService.Z();
                                    MusicService.E0.d0();
                                  } 
                                  J0(D0("k_i_crgvcns"));
                                  return;
                                } 
                                if ("k_i_crgvcns".equals(charSequence1)) {
                                  J0(D0("k_i_crgvcns"));
                                  if (MusicService.P0 != null && MusicService.F0) {
                                    MusicService.Z();
                                    return;
                                  } 
                                } else {
                                  TwoStatePreference twoStatePreference;
                                  if ("k_f_rgpa".equals(charSequence1) || "k_f_rgpna".equals(charSequence1)) {
                                    N0(preference);
                                    if (MusicService.P0 != null && MusicService.F0) {
                                      MusicService.E0.d0();
                                      return;
                                    } 
                                    return;
                                  } 
                                  if ("k_b_scvfl".equals(charSequence1)) {
                                    if (preference instanceof TwoStatePreference) {
                                      twoStatePreference = (TwoStatePreference)preference;
                                      if (Build.VERSION.SDK_INT >= 33 && MyApplication.o().getBoolean("k_b_scvfl", false) && MyApplication.d().checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                                        twoStatePreference.F(false);
                                        SettingsActivity settingsActivity = this.l0;
                                        charSequence1 = T(2131887286);
                                        settingsActivity.j0(new String[] { "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO" }, charSequence1, "android.permission-group.READ_MEDIA_VISUAL", 10113);
                                      } 
                                      j1(twoStatePreference, T(2131887286));
                                      c1();
                                      return;
                                    } 
                                  } else if ("k_b_accf".equals(charSequence1)) {
                                    if (MyApplication.o().getBoolean("k_b_accf", true)) {
                                      try {
                                        MusicActivity musicActivity = MusicActivity.R0;
                                        if (musicActivity != null && musicActivity.e0 != null)
                                          musicActivity.i0(); 
                                        return;
                                      } finally {
                                        ss0 = null;
                                      } 
                                    } else {
                                      G0();
                                      return;
                                    } 
                                  } else if ("k_b_mpsfscmr".equals(charSequence1)) {
                                    if (MyApplication.o().getBoolean("k_b_mpsfscmr", true)) {
                                      if (!MusicService.P0.B0.b()) {
                                        MusicService.P0.B0.c();
                                        MusicService.P0.P0();
                                        return;
                                      } 
                                    } else if (MusicService.P0.B0.b()) {
                                      MusicService.P0.B0.d(null);
                                      return;
                                    } 
                                  } else if ("k_b_rcmpaemy".equals(charSequence1)) {
                                    try {
                                      MusicActivity musicActivity = MusicActivity.R0;
                                    } finally {
                                      ss0 = null;
                                    } 
                                  } else if ("k_b_mmpsb".equals(charSequence1)) {
                                    MusicActivity musicActivity = MusicActivity.R0;
                                    if (musicActivity != null) {
                                      musicActivity.i0();
                                      return;
                                    } 
                                  } else if ("k_b_mtdc".equals(charSequence1)) {
                                    if (MusicService.P0 != null && MusicService.G0 && j50.u())
                                      try {
                                        return;
                                      } finally {
                                        ss0 = null;
                                      }  
                                  } else if ("k_b_nlmsqi".equals(charSequence1)) {
                                    try {
                                      return;
                                    } finally {
                                      ss0 = null;
                                    } 
                                  } else if ("k_b_scnmfl".equals(charSequence1)) {
                                    if (twoStatePreference instanceof TwoStatePreference) {
                                      j1(twoStatePreference, T(2131887280));
                                      c1();
                                      return;
                                    } 
                                  } else if ("k_b_schdfl".equals(charSequence1)) {
                                    if (twoStatePreference instanceof TwoStatePreference) {
                                      j1(twoStatePreference, T(2131887278));
                                      c1();
                                      return;
                                    } 
                                  } else {
                                    Handler handler;
                                    if ("k_b_msflcpbt".equals(charSequence1)) {
                                      try {
                                        p01 p01 = ew0.a;
                                        boolean bool = MyApplication.o().getBoolean("k_b_msflcpbt", true);
                                        ew0.d = bool;
                                        ((m01)ew0.a.c).a.setRatingType(bool);
                                        handler = this.l0.e0;
                                        l3 l3 = new l3();
                                        this(20);
                                        return;
                                      } finally {
                                        ss0 = null;
                                      } 
                                    } else {
                                      if ("k_b_bcalaturs".equals(handler) || "k_b_mstlstds2".equals(handler)) {
                                        MusicService.P0.D();
                                        return;
                                      } 
                                      if ("k_i_npblam".equals(handler)) {
                                        try {
                                          MusicActivity musicActivity = MusicActivity.R0;
                                        } finally {
                                          ss0 = null;
                                        } 
                                      } else {
                                        if ("B_R_AFL".equals(handler)) {
                                          V0((Preference)twoStatePreference);
                                          return;
                                        } 
                                        if ("k_i_hwqwsnaex".equals(handler)) {
                                          h1((Preference)twoStatePreference);
                                          return;
                                        } 
                                        "".equals(handler);
                                        return;
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
                  } 
                } 
              } 
            } 
          }  
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */