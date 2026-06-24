package com.google.android.gms.cast.framework.media;

import al1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import bl1;
import cg2;
import hd2;
import kj;
import n21;
import nf1;
import oj;
import ov0;
import rp0;

public class MediaIntentReceiver extends BroadcastReceiver {
  public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
  
  public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
  
  public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
  
  public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
  
  public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
  
  public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
  
  public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
  
  public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
  
  private static final String TAG = "MediaIntentReceiver";
  
  private static final rp0 log = new rp0("MediaIntentReceiver", null);
  
  private static nf1 getRemoteMediaClient(oj paramoj) {
    if (paramoj == null || !paramoj.a())
      return null; 
    n21.j();
    return paramoj.j;
  }
  
  private void seek(oj paramoj, long paramLong) {
    if (paramLong != 0L) {
      nf1 nf1 = getRemoteMediaClient(paramoj);
      if (nf1 != null && !nf1.i() && !nf1.m())
        nf1.p(new ov0(nf1.a() + paramLong)); 
    } 
  }
  
  private void togglePlayback(oj paramoj) {
    nf1 nf1 = getRemoteMediaClient(paramoj);
    if (nf1 == null)
      return; 
    nf1.q();
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    String str = paramIntent.getAction();
    log.b("onReceive action: %s", new Object[] { str });
    if (str != null) {
      kj kj = kj.b(paramContext);
      kj.getClass();
      n21.j();
      bl1 bl1 = kj.c;
      al1 al1 = bl1.d();
      if (al1 != null) {
        switch (str.hashCode()) {
          case 1997055314:
            if (str.equals("android.intent.action.MEDIA_BUTTON")) {
              onReceiveActionMediaButton(al1, paramIntent);
              return;
            } 
            break;
          case 1362116196:
            if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
              onReceiveActionForward(al1, paramIntent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
              return;
            } 
            break;
          case 235550565:
            if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
              onReceiveActionTogglePlayback(al1);
              return;
            } 
            break;
          case -124479363:
            if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
              bl1.b(false);
              return;
            } 
            break;
          case -668151673:
            if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
              bl1.b(true);
              return;
            } 
            break;
          case -945080078:
            if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
              onReceiveActionSkipPrev(al1);
              return;
            } 
            break;
          case -945151566:
            if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
              onReceiveActionSkipNext(al1);
              return;
            } 
            break;
          case -1699820260:
            if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
              onReceiveActionRewind(al1, paramIntent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
              return;
            } 
            break;
        } 
        onReceiveOtherAction(paramContext, str, paramIntent);
      } 
    } 
  }
  
  public void onReceiveActionForward(al1 paramal1, long paramLong) {
    if (paramal1 instanceof oj)
      seek((oj)paramal1, paramLong); 
  }
  
  public void onReceiveActionMediaButton(al1 paramal1, Intent paramIntent) {
    if (paramal1 instanceof oj && paramIntent.hasExtra("android.intent.extra.KEY_EVENT")) {
      Bundle bundle = paramIntent.getExtras();
      n21.m(bundle);
      KeyEvent keyEvent = (KeyEvent)bundle.get("android.intent.extra.KEY_EVENT");
      if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85)
        togglePlayback((oj)paramal1); 
    } 
  }
  
  public void onReceiveActionRewind(al1 paramal1, long paramLong) {
    if (paramal1 instanceof oj)
      seek((oj)paramal1, -paramLong); 
  }
  
  public void onReceiveActionSkipNext(al1 paramal1) {
    if (paramal1 instanceof oj) {
      nf1 nf1 = getRemoteMediaClient((oj)paramal1);
      if (nf1 != null && !nf1.m()) {
        n21.j();
        if (!nf1.v()) {
          nf1.u();
          return;
        } 
        nf1.w((cg2)new hd2(nf1, 1, false));
      } 
    } 
  }
  
  public void onReceiveActionSkipPrev(al1 paramal1) {
    if (paramal1 instanceof oj) {
      nf1 nf1 = getRemoteMediaClient((oj)paramal1);
      if (nf1 != null && !nf1.m()) {
        n21.j();
        if (!nf1.v()) {
          nf1.u();
          return;
        } 
        nf1.w((cg2)new hd2(nf1, 0, false));
      } 
    } 
  }
  
  public void onReceiveActionTogglePlayback(al1 paramal1) {
    if (paramal1 instanceof oj)
      togglePlayback((oj)paramal1); 
  }
  
  public void onReceiveOtherAction(Context paramContext, String paramString, Intent paramIntent) {}
  
  @Deprecated
  public void onReceiveOtherAction(String paramString, Intent paramIntent) {
    onReceiveOtherAction(null, paramString, paramIntent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\media\MediaIntentReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */