import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.musicolet.BluetoothUsbReceiver;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RemoteMediaControlReceiver;
import in.krosbits.utils.SgV.YbNJ;
import in.krosbits.utils.SgV.zpEN;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class qv0 extends MediaSession.Callback {
  public final int a;
  
  public final Object b;
  
  public static void c(tv0 paramtv0) {
    if (Build.VERSION.SDK_INT >= 28)
      return; 
    MediaSession mediaSession = paramtv0.a;
    String str1 = null;
    try {
      String str = (String)mediaSession.getClass().getMethod(GMDx.CKJAzO, null).invoke(mediaSession, null);
      str1 = str;
    } catch (Exception exception) {
      Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", exception);
    } 
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = YbNJ.GfAjObghEveATer; 
    paramtv0.d(new aw0(str2, -1, -1));
  }
  
  public static void d(m01 paramm01) {
    if (Build.VERSION.SDK_INT >= 28)
      return; 
    MediaSession mediaSession = paramm01.a;
    String str1 = null;
    try {
      String str = (String)mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
      str1 = str;
    } catch (Exception exception) {
      Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", exception);
    } 
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = "android.media.session.MediaController"; 
    paramm01.c(new aw0(str2, -1, -1));
  }
  
  public tv0 a() {
    synchronized (((rv0)this.b).a) {
      tv0 tv0 = ((rv0)this.b).d.get();
      if (tv0 != null) {
        rv0 rv0 = (rv0)this.b;
        synchronized (tv0.d) {
          rv0 rv01 = tv0.i;
          if (rv0 == rv01)
            return tv0; 
        } 
      } 
      return null;
    } 
  }
  
  public m01 b() {
    synchronized (((l01)this.b).a) {
      null = ((l01)this.b).c.get();
      l01 l01 = (l01)this.b;
      synchronized (null.c) {
        l01 l011 = null.j;
        return (l01 == l011) ? null : null;
      } 
    } 
  }
  
  public final void onCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          try {
            if (paramString.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
              IBinder iBinder;
              paramBundle = new Bundle();
              this();
              MediaSessionCompat.Token token = m01.b;
              lg0 lg0 = token.b();
              if (lg0 == null) {
                lg0 = null;
              } else {
                iBinder = lg0.asBinder();
              } 
              paramBundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinder);
              synchronized (token.b) {
                c22 c22 = token.f;
                if (c22 != null) {
                  null = new Bundle();
                  super();
                  ParcelImpl parcelImpl = new ParcelImpl();
                  this(c22);
                  null.putParcelable("a", (Parcelable)parcelImpl);
                  paramBundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)null);
                } 
                paramResultReceiver.send(0, paramBundle);
              } 
            } else {
              MediaDescriptionCompat mediaDescriptionCompat;
              if (paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
              } else if (mediaDescriptionCompat.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
              } else if (mediaDescriptionCompat.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
              } else if (mediaDescriptionCompat.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT") && m01.f != null) {
                int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                if (i >= 0 && i < m01.f.size())
                  MediaSessionCompat.QueueItem queueItem = m01.f.get(i); 
              } 
            } 
          } catch (BadParcelableException badParcelableException) {
            Log.e("MediaSessionCompat", uvJYmft.PWvri);
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      try {
        if (badParcelableException.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
          IBinder iBinder;
          paramBundle = new Bundle();
          this();
          MediaSessionCompat.Token token = tv0.c;
          lg0 lg0 = token.b();
          if (lg0 == null) {
            lg0 = null;
          } else {
            iBinder = lg0.asBinder();
          } 
          paramBundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinder);
          synchronized (token.b) {
            c22 c22 = token.f;
            if (c22 != null) {
              Bundle bundle = new Bundle();
              this();
              null = new ParcelImpl();
              super(c22);
              bundle.putParcelable("a", (Parcelable)null);
              paramBundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)bundle);
            } 
            paramResultReceiver.send(0, paramBundle);
          } 
        } else {
          MediaDescriptionCompat mediaDescriptionCompat;
          if (badParcelableException.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
          } else if (mediaDescriptionCompat.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
            mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
            paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
          } else if (mediaDescriptionCompat.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            mediaDescriptionCompat = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
          } else {
            mediaDescriptionCompat.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
          } 
        } 
      } catch (BadParcelableException badParcelableException1) {
        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
      } 
      tv0.d(null);
    } 
  }
  
  public final void onCustomAction(String paramString, Bundle paramBundle) {
    Intent intent;
    l01 l01;
    int i = this.a;
    String str2 = KjdXPYm.QgNMTXddYbDg;
    String str1 = nBRIsU.aXez;
    Object object = this.b;
    switch (i) {
      default:
        l01 = (l01)object;
        object = b();
        if (object != null) {
          p01.d(paramBundle);
          d((m01)object);
          try {
            Uri uri;
            if (paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
              uri = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
              p01.d(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!uri.equals("android.support.v4.media.session.action.PREPARE")) {
              if (uri.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                p01.d(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
              } else if (uri.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                p01.d(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
              } else if (uri.equals(str1)) {
                uri = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                p01.d(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
              } else if (uri.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                paramBundle.getBoolean(str2);
              } else if (uri.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                l01.m(paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
              } else if (uri.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                l01.o(paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
              } else {
                RatingCompat ratingCompat;
                if (uri.equals("android.support.v4.media.session.action.SET_RATING")) {
                  ratingCompat = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                  p01.d(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (ratingCompat.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                  l01.j(paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F));
                } else {
                  Intent intent1;
                  switch (l01.e) {
                    case 1:
                      ws2.d();
                      intent = new Intent();
                      this(MyApplication.i.getApplicationContext(), MusicService.class);
                      intent1 = intent.setAction((String)ratingCompat).putExtras(paramBundle);
                      ag0.n0(MyApplication.i.getApplicationContext(), intent1);
                      break;
                  } 
                } 
              } 
            } 
          } catch (BadParcelableException badParcelableException) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
          } 
          object.c(null);
        } 
        return;
      case 0:
        break;
    } 
    rv0 rv0 = (rv0)object;
    object = a();
    if (object != null) {
      zv0.m(paramBundle);
      c((tv0)object);
      try {
        Uri uri;
        if (badParcelableException.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
          uri = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          zv0.m(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
        } else if (!uri.equals("android.support.v4.media.session.action.PREPARE")) {
          if (uri.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
            paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
            zv0.m(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
          } else if (uri.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
            paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
            zv0.m(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
          } else if (uri.equals(intent)) {
            uri = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
            zv0.m(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
          } else if (uri.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
            paramBundle.getBoolean(str2);
          } else if (uri.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
            paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
          } else if (uri.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
            paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
          } else {
            RatingCompat ratingCompat;
            if (uri.equals("android.support.v4.media.session.action.SET_RATING")) {
              ratingCompat = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
              zv0.m(paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (ratingCompat.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
              paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
            } else {
              rv0.b((String)ratingCompat);
            } 
          } 
        } 
      } catch (BadParcelableException badParcelableException1) {
        Log.e("MediaSessionCompat", "Could not unparcel the data.");
      } 
      object.d(null);
    } 
  }
  
  public final void onFastForward() {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              if (l01.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("AF10"));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final boolean onMediaButtonEvent(Intent paramIntent) {
    m01 m01;
    int i = this.a;
    boolean bool = true;
    boolean bool1 = true;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          l01 l01 = (l01)this.b;
          switch (l01.e) {
            default:
              if (Build.VERSION.SDK_INT < 27) {
                synchronized (l01.a) {
                  m01 m011 = l01.c.get();
                  cj cj = l01.d;
                  if (m011 != null && cj != null) {
                    null = paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (null != null && null.getAction() == 0) {
                      m011.a();
                      null.getKeyCode();
                    } 
                  } 
                  i = 0;
                } 
                break;
              } 
              i = 0;
            case 1:
              RemoteMediaControlReceiver.a(MyApplication.i.getApplicationContext(), paramIntent);
              i = 1;
              break;
          } 
          m01.c(null);
          boolean bool2 = bool1;
          if (i == 0) {
            if (super.onMediaButtonEvent(paramIntent))
              return bool1; 
          } else {
            return bool2;
          } 
        } 
        return false;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      bool1 = ((rv0)this.b).c(paramIntent);
      tv0.d(null);
      boolean bool2 = bool;
      if (!bool1) {
        if (super.onMediaButtonEvent(paramIntent))
          return bool; 
      } else {
        return bool2;
      } 
    } 
    return false;
  }
  
  public final void onPause() {
    m01 m01;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)object).e) {
            case 1:
              if (MusicService.P0 == null || !MusicService.F0 || l01.a() || BluetoothUsbReceiver.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_PAUSE"));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      ((rv0)object).d();
      tv0.d(null);
    } 
  }
  
  public final void onPlay() {
    m01 m01;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)object).e) {
            case 1:
              if (l01.a() || BluetoothUsbReceiver.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_PLAY"));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      ((rv0)object).e();
      tv0.d(null);
    } 
  }
  
  public final void onPlayFromMediaId(String paramString, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              if (paramString == null)
                break; 
              ws2.d();
              if ("musicolet.media.r.1".equals(paramString)) {
                ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction(paramString));
                break;
              } 
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACT_MID").putExtra("EXT_MID", paramString));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPlayFromSearch(String paramString, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACT_S_P").putExtra("EXT_S_Q", paramString).putExtra(zpEN.LHplaRtpuOy, paramBundle));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPlayFromUri(Uri paramUri, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPrepare() {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPrepareFromMediaId(String paramString, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPrepareFromSearch(String paramString, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onPrepareFromUri(Uri paramUri, Bundle paramBundle) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          p01.d(paramBundle);
          d(m01);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      zv0.m(paramBundle);
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onRewind() {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              if (l01.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction(jLnXOLx.sylWuMxAZQJmz));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onSeekTo(long paramLong) {
    m01 m01;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)object).e) {
            case 1:
              if (l01.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_SEEK").putExtra("EXTRA_SEEKMILL", paramLong));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      ((rv0)object).f(paramLong);
      tv0.d(null);
    } 
  }
  
  public final void onSetPlaybackSpeed(float paramFloat) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          ((l01)this.b).j(paramFloat);
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onSetRating(Rating paramRating) {
    Intent intent;
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          km0 km0;
          d(m01);
          l01 l01 = (l01)this.b;
          RatingCompat ratingCompat = RatingCompat.b(paramRating);
          switch (l01.e) {
            case 1:
              if (MusicService.P0 == null || !MusicService.F0 || l01.a() || !ew0.d || BluetoothUsbReceiver.a())
                break; 
              km0 = MusicService.y();
              if (km0 != null) {
                boolean bool2 = c81.c(MyApplication.i.getApplicationContext()).c(km0);
                int i = ratingCompat.b;
                boolean bool1 = true;
                if (i == 1) {
                  if (i != 1 || ratingCompat.c != 1.0F)
                    bool1 = false; 
                  if (bool1 != bool2) {
                    ws2.d();
                    intent = (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACT_FAV");
                    ag0.n0(MyApplication.i.getApplicationContext(), intent);
                  } 
                } 
              } 
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      RatingCompat.b((Rating)intent);
      tv0.d(null);
    } 
  }
  
  public final void onSkipToNext() {
    m01 m01;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)object).e) {
            case 1:
              if (l01.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_NEXT"));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      ((rv0)object).g();
      tv0.d(null);
    } 
  }
  
  public final void onSkipToPrevious() {
    m01 m01;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)object).e) {
            case 1:
              if (l01.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_PREV"));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      ((rv0)object).h();
      tv0.d(null);
    } 
  }
  
  public final void onSkipToQueueItem(long paramLong) {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          Intent intent;
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              ws2.d();
              intent = (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_WQJTS").putExtra("E_WQSI", (int)paramLong);
              ag0.n0(MyApplication.i.getApplicationContext(), intent);
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
  
  public final void onStop() {
    m01 m01;
    switch (this.a) {
      default:
        m01 = b();
        if (m01 != null) {
          d(m01);
          switch (((l01)this.b).e) {
            case 1:
              if (MusicService.P0 == null || !MusicService.F0 || l01.a() || BluetoothUsbReceiver.a())
                break; 
              ws2.d();
              ag0.n0(MyApplication.i.getApplicationContext(), (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction(FgdLmmRfTxSFKI.yRIDedV));
              break;
          } 
          m01.c(null);
        } 
        return;
      case 0:
        break;
    } 
    tv0 tv0 = a();
    if (tv0 != null) {
      c(tv0);
      tv0.d(null);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */