import android.util.Log;
import in.krosbits.audio_cutter.TrimActivity;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.IncludedFoldersActivity;
import in.krosbits.musicolet.LockScreenActivity;
import in.krosbits.musicolet.LyricsEditActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.PlaylistEditActivity;
import in.krosbits.musicolet.RGReadCalcActivity;
import in.krosbits.musicolet.SearchActivity;
import in.krosbits.musicolet.SettingsActivity;
import in.krosbits.musicolet.Tag2Activity;
import in.krosbits.musicolet.WelcomeActivity;
import in.krosbits.musicolet.WidgetPrefActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public abstract class d11 {
  public n2 a;
  
  public boolean b;
  
  public final void a() {
    e11 e11;
    n2 n21 = this.a;
    if (n21 != null) {
      if (!this.b)
        n21.p(this, null); 
      e11 = (e11)n21.e;
      f f = (f)n21.c;
      e11.getClass();
      if (!equals(e11.h) || -1 != e11.g) {
        this.b = false;
        return;
      } 
      w31 w312 = e11.f;
      w31 w311 = w312;
      if (w312 == null)
        w311 = e11.c(-1); 
      e11.f = null;
      e11.g = 0;
      e11.h = null;
      if (w311 == null) {
        ((b41)f.c).a.run();
      } else {
        TrimActivity trimActivity;
        lb0 lb0;
        ip1 ip11;
        WidgetPrefActivity widgetPrefActivity;
        WelcomeActivity welcomeActivity;
        Tag2Activity tag2Activity;
        SettingsActivity settingsActivity;
        SearchActivity searchActivity;
        RGReadCalcActivity rGReadCalcActivity;
        PlaylistEditActivity playlistEditActivity;
        MusicActivity musicActivity;
        LyricsEditActivity lyricsEditActivity;
        LockScreenActivity lockScreenActivity;
        IncludedFoldersActivity includedFoldersActivity;
        l90 l902;
        f11 f111;
        FolderExcluderActivity folderExcluderActivity;
        ArrayList<Object> arrayList;
        l90 l901 = w311.d;
        switch (l901.d) {
          default:
            widgetPrefActivity = (WidgetPrefActivity)l901.e;
            widgetPrefActivity.L0.e(false);
            widgetPrefActivity.m0();
            widgetPrefActivity.runOnUiThread(new xt0(28, l901));
            break;
          case 12:
            welcomeActivity = (WelcomeActivity)l901.e;
            welcomeActivity.c0.e(false);
            welcomeActivity.onBackPressed();
            welcomeActivity.runOnUiThread(new xt0(26, l901));
            break;
          case 11:
            trimActivity = (TrimActivity)l901.e;
            trimActivity.i0.e(false);
            trimActivity.onBackPressed();
            trimActivity.runOnUiThread(new nx1(trimActivity, 2));
            break;
          case 10:
            tag2Activity = (Tag2Activity)((l90)trimActivity).e;
            tag2Activity.H1.e(false);
            tag2Activity.onBackPressed();
            tag2Activity.runOnUiThread(new xt0(20, trimActivity));
            break;
          case 9:
            settingsActivity = (SettingsActivity)((l90)trimActivity).e;
            settingsActivity.j0.e(false);
            settingsActivity.onBackPressed();
            settingsActivity.runOnUiThread(new xt0(15, trimActivity));
            break;
          case 8:
            searchActivity = (SearchActivity)((l90)trimActivity).e;
            searchActivity.O0.e(false);
            searchActivity.goBack(null);
            searchActivity.runOnUiThread(new xt0(13, trimActivity));
            break;
          case 7:
            rGReadCalcActivity = (RGReadCalcActivity)((l90)trimActivity).e;
            rGReadCalcActivity.f0.e(false);
            rGReadCalcActivity.onBackPressed();
            rGReadCalcActivity.runOnUiThread(new xt0(10, trimActivity));
            break;
          case 6:
            playlistEditActivity = (PlaylistEditActivity)((l90)trimActivity).e;
            playlistEditActivity.l0.e(false);
            playlistEditActivity.onBackPressed();
            playlistEditActivity.runOnUiThread(new xt0(6, trimActivity));
            break;
          case 5:
            musicActivity = (MusicActivity)((l90)trimActivity).e;
            musicActivity.P0.e(false);
            musicActivity.onBackPressed();
            musicActivity.runOnUiThread(new xt0(4, trimActivity));
            break;
          case 4:
            lyricsEditActivity = (LyricsEditActivity)((l90)trimActivity).e;
            lyricsEditActivity.E0.e(false);
            lyricsEditActivity.onBackPressed();
            lyricsEditActivity.runOnUiThread(new e(28, trimActivity));
            break;
          case 3:
            lockScreenActivity = (LockScreenActivity)((l90)trimActivity).e;
            lockScreenActivity.K0.e(false);
            lockScreenActivity.onBackPressed();
            lockScreenActivity.runOnUiThread(new e(27, trimActivity));
            break;
          case 2:
            includedFoldersActivity = (IncludedFoldersActivity)((l90)trimActivity).e;
            includedFoldersActivity.d0.e(false);
            includedFoldersActivity.l0();
            includedFoldersActivity.runOnUiThread(new e(25, trimActivity));
            break;
          case 1:
            lb0 = (lb0)((l90)trimActivity).e;
            if (lb0.M(3)) {
              StringBuilder stringBuilder = new StringBuilder("handleOnBackPressed. PREDICTIVE_BACK = true fragment manager ");
              stringBuilder.append(lb0);
              Log.d("FragmentManager", stringBuilder.toString());
            } 
            l902 = lb0.j;
            arrayList = lb0.n;
            lb0.i = true;
            lb0.z(true);
            lb0.i = false;
            if (lb0.h != null) {
              if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(lb0.G(lb0.h));
                int k = arrayList.size();
                byte b = 0;
                label100: while (true) {
                  if (b < k) {
                    Iterator<ua0> iterator = (Iterator<ua0>)arrayList.get(b);
                    b++;
                    if (iterator == null) {
                      iterator = linkedHashSet.iterator();
                      if (!iterator.hasNext())
                        continue; 
                      ua0 ua0 = iterator.next();
                      throw null;
                    } 
                    tp.b();
                  } else {
                    break;
                  } 
                  ip11 = e11.a;
                  f111 = f11.i;
                  ip11.getClass();
                  ip11.g(null, f111);
                  break label100;
                } 
              } 
              ArrayList<ArrayList<Object>> arrayList1 = ((lb0)ip11).h.a;
              int j = arrayList1.size();
              int i = 0;
              while (i < j) {
                arrayList = arrayList1.get(i);
                int k = i + 1;
                ua0 ua0 = ((vb0)arrayList).b;
                i = k;
                if (ua0 != null) {
                  ua0.p = false;
                  i = k;
                } 
              } 
              for (jx jx : ip11.f(new ArrayList(Collections.singletonList(((lb0)ip11).h)), 0, 1)) {
                arrayList = jx.c;
                if (lb0.M(3))
                  Log.d("FragmentManager", "SpecialEffectsController: Completing Back "); 
                jx.k(arrayList);
                jx.c(arrayList);
              } 
              arrayList1 = ((lb0)ip11).h.a;
              j = arrayList1.size();
              i = 0;
              while (i < j) {
                arrayList = arrayList1.get(i);
                int k = i + 1;
                ua0 ua0 = ((vb0)arrayList).b;
                i = k;
                if (ua0 != null) {
                  i = k;
                  if (ua0.J == null) {
                    ip11.g(ua0).k();
                    i = k;
                  } 
                } 
              } 
              ((lb0)ip11).h = null;
              ip11.j0();
              if (lb0.M(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                StringBuilder stringBuilder = new StringBuilder("OnBackPressedCallback enabled=");
                stringBuilder.append(((l90)f111).b);
                stringBuilder.append(" for  FragmentManager ");
                stringBuilder.append(ip11);
                Log.d("FragmentManager", stringBuilder.toString());
              } 
              break;
            } 
            if (((l90)f111).b) {
              if (lb0.M(3))
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback"); 
              ip11.T();
              break;
            } 
            if (lb0.M(3))
              Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback"); 
            ((lb0)ip11).g.b().a();
            break;
          case 0:
            folderExcluderActivity = (FolderExcluderActivity)((l90)ip11).e;
            folderExcluderActivity.W.e(false);
            folderExcluderActivity.l0();
            folderExcluderActivity.runOnUiThread(new e(18, ip11));
            break;
        } 
      } 
    } else {
      tp.f("This input is not added to any dispatcher.");
      return;
    } 
    ip1 ip1 = e11.a;
    f11 f11 = f11.i;
    ip1.getClass();
    ip1.g(null, f11);
    // Byte code: goto -> 1359
  }
  
  public void b(boolean paramBoolean) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */