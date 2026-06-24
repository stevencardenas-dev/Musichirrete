package com.google.android.gms.cast.framework.media.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class ResourceProvider {
  public static final Map a;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("smallIconDrawableResId", Integer.valueOf(2131230984));
    hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(2131230985));
    hashMap.put("pauseDrawableResId", Integer.valueOf(2131230977));
    hashMap.put("playDrawableResId", Integer.valueOf(2131230978));
    hashMap.put("skipNextDrawableResId", Integer.valueOf(2131230982));
    hashMap.put("skipPrevDrawableResId", Integer.valueOf(2131230983));
    hashMap.put("forwardDrawableResId", Integer.valueOf(2131230973));
    hashMap.put("forward10DrawableResId", Integer.valueOf(2131230974));
    hashMap.put("forward30DrawableResId", Integer.valueOf(2131230975));
    hashMap.put("rewindDrawableResId", Integer.valueOf(2131230979));
    hashMap.put(zLtYiJUm.kLESAJSLky, Integer.valueOf(2131230980));
    hashMap.put("rewind30DrawableResId", Integer.valueOf(2131230981));
    hashMap.put("disconnectDrawableResId", Integer.valueOf(2131230972));
    hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(2131165300));
    hashMap.put("castingToDeviceStringResId", Integer.valueOf(2131886294));
    hashMap.put("stopLiveStreamStringResId", Integer.valueOf(2131886329));
    hashMap.put("pauseStringResId", Integer.valueOf(2131886320));
    hashMap.put("playStringResId", Integer.valueOf(2131886321));
    hashMap.put("skipNextStringResId", Integer.valueOf(2131886326));
    hashMap.put("skipPrevStringResId", Integer.valueOf(2131886327));
    hashMap.put("forwardStringResId", Integer.valueOf(2131886308));
    hashMap.put("forward10StringResId", Integer.valueOf(2131886309));
    hashMap.put("forward30StringResId", Integer.valueOf(2131886310));
    hashMap.put("rewindStringResId", Integer.valueOf(2131886322));
    hashMap.put("rewind10StringResId", Integer.valueOf(2131886323));
    hashMap.put("rewind30StringResId", Integer.valueOf(2131886324));
    hashMap.put("disconnectStringResId", Integer.valueOf(2131886298));
    a = Collections.unmodifiableMap(hashMap);
  }
  
  public static Integer findResourceByName(String paramString) {
    return (paramString == null) ? null : (Integer)a.get(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\media\internal\ResourceProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */