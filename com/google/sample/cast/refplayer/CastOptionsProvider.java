package com.google.sample.cast.refplayer;

import a31;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import ht;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import k91;
import lj;
import mj;
import qj;
import sl0;
import ui0;
import xf2;

public class CastOptionsProvider {
  public List<xf2> getAdditionalSessionProviders(Context paramContext) {
    return null;
  }
  
  public mj getCastOptions(Context paramContext) {
    ArrayList arrayList1 = new ArrayList();
    Locale locale = Locale.getDefault();
    Pattern pattern = qj.a;
    locale.getLanguage();
    TextUtils.isEmpty(locale.getCountry());
    TextUtils.isEmpty(locale.getVariant());
    ArrayList arrayList2 = new ArrayList();
    String str = (String)MyApplication.c;
    new a31((List)a31.K, a31.L, 10000L, null, ui0.t0("smallIconDrawableResId"), ui0.t0(hbrAVtEa.ZyJjBJwK), ui0.t0("pauseDrawableResId"), ui0.t0("playDrawableResId"), ui0.t0(tlzLOCPTHRhep.SmTkREpyCMRkcF), ui0.t0("skipPrevDrawableResId"), ui0.t0("forwardDrawableResId"), ui0.t0("forward10DrawableResId"), ui0.t0("forward30DrawableResId"), ui0.t0("rewindDrawableResId"), ui0.t0("rewind10DrawableResId"), ui0.t0("rewind30DrawableResId"), ui0.t0("disconnectDrawableResId"), ui0.t0("notificationImageSizeDimenResId"), ui0.t0("castingToDeviceStringResId"), ui0.t0("stopLiveStreamStringResId"), ui0.t0("pauseStringResId"), ui0.t0("playStringResId"), ui0.t0("skipNextStringResId"), ui0.t0("skipPrevStringResId"), ui0.t0("forwardStringResId"), ui0.t0("forward10StringResId"), ui0.t0("forward30StringResId"), ui0.t0("rewindStringResId"), ui0.t0("rewind10StringResId"), ui0.t0("rewind30StringResId"), ui0.t0("disconnectStringResId"), null, false, false);
    lj lj = new lj("com.google.android.gms.cast.framework.media.MediaIntentReceiver", MusicActivity.class.getName(), null, null, false, false);
    sl0 sl0 = new sl0();
    sl0.f = new ht(UUID.randomUUID().toString(), eRUgfgGAccgka.eQFsXv);
    sl0.b = true;
    if (mj.w != null)
      return new mj(str, arrayList1, false, sl0, true, lj, false, 0.05000000074505806D, false, false, false, arrayList2, true, false, mj.u, mj.v, false, false); 
    k91.h("use Optional.orNull() instead of Optional.or(null)");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\sample\cast\refplayer\CastOptionsProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */