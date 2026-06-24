import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class qr2 {
  public static final rp0 v = new rp0("MediaSessionManager", null);
  
  public final Context a;
  
  public final mj b;
  
  public final eh2 c;
  
  public final bl1 d;
  
  public final a31 e;
  
  public final ComponentName f;
  
  public final ComponentName g;
  
  public final cn h;
  
  public final cn i;
  
  public final uo2 j;
  
  public final cl k;
  
  public final yi1 l;
  
  public final zk m;
  
  public nf1 n;
  
  public CastDevice o;
  
  public zv0 p;
  
  public boolean q;
  
  public PlaybackStateCompat.CustomAction r;
  
  public PlaybackStateCompat.CustomAction s;
  
  public PlaybackStateCompat.CustomAction t;
  
  public PlaybackStateCompat.CustomAction u;
  
  public qr2(Context paramContext, mj parammj, eh2 parameh2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield a : Landroid/content/Context;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield b : Lmj;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield c : Leh2;
    //   19: getstatic kj.k : Lrp0;
    //   22: astore_3
    //   23: invokestatic j : ()V
    //   26: getstatic kj.m : Lkj;
    //   29: astore_3
    //   30: aconst_null
    //   31: astore #8
    //   33: aload_3
    //   34: ifnull -> 48
    //   37: invokestatic j : ()V
    //   40: aload_3
    //   41: getfield c : Lbl1;
    //   44: astore_3
    //   45: goto -> 50
    //   48: aconst_null
    //   49: astore_3
    //   50: aload_0
    //   51: aload_3
    //   52: putfield d : Lbl1;
    //   55: aload_2
    //   56: getfield h : Llj;
    //   59: astore #9
    //   61: aload #9
    //   63: ifnonnull -> 71
    //   66: aconst_null
    //   67: astore_3
    //   68: goto -> 77
    //   71: aload #9
    //   73: getfield f : La31;
    //   76: astore_3
    //   77: aload_0
    //   78: aload_3
    //   79: putfield e : La31;
    //   82: aload_0
    //   83: new zk
    //   86: dup
    //   87: iconst_3
    //   88: aload_0
    //   89: invokespecial <init> : (ILjava/lang/Object;)V
    //   92: putfield m : Lzk;
    //   95: aload #9
    //   97: ifnonnull -> 105
    //   100: aconst_null
    //   101: astore_3
    //   102: goto -> 111
    //   105: aload #9
    //   107: getfield c : Ljava/lang/String;
    //   110: astore_3
    //   111: aload_3
    //   112: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   115: ifne -> 131
    //   118: new android/content/ComponentName
    //   121: dup
    //   122: aload_1
    //   123: aload_3
    //   124: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   127: astore_3
    //   128: goto -> 133
    //   131: aconst_null
    //   132: astore_3
    //   133: aload_0
    //   134: aload_3
    //   135: putfield f : Landroid/content/ComponentName;
    //   138: aload #9
    //   140: ifnonnull -> 148
    //   143: aconst_null
    //   144: astore_3
    //   145: goto -> 154
    //   148: aload #9
    //   150: getfield b : Ljava/lang/String;
    //   153: astore_3
    //   154: aload_3
    //   155: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   158: ifne -> 174
    //   161: new android/content/ComponentName
    //   164: dup
    //   165: aload_1
    //   166: aload_3
    //   167: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   170: astore_3
    //   171: goto -> 176
    //   174: aconst_null
    //   175: astore_3
    //   176: aload_0
    //   177: aload_3
    //   178: putfield g : Landroid/content/ComponentName;
    //   181: new cn
    //   184: dup
    //   185: aload_1
    //   186: bipush #9
    //   188: invokespecial <init> : (Landroid/content/Context;I)V
    //   191: astore_3
    //   192: aload_0
    //   193: aload_3
    //   194: putfield h : Lcn;
    //   197: aload_3
    //   198: new bp2
    //   201: dup
    //   202: aload_0
    //   203: iconst_0
    //   204: invokespecial <init> : (Lqr2;I)V
    //   207: putfield g : Ljava/lang/Object;
    //   210: new cn
    //   213: dup
    //   214: aload_1
    //   215: bipush #9
    //   217: invokespecial <init> : (Landroid/content/Context;I)V
    //   220: astore_3
    //   221: aload_0
    //   222: aload_3
    //   223: putfield i : Lcn;
    //   226: aload_3
    //   227: new bp2
    //   230: dup
    //   231: aload_0
    //   232: iconst_1
    //   233: invokespecial <init> : (Lqr2;I)V
    //   236: putfield g : Ljava/lang/Object;
    //   239: aload_0
    //   240: new cl
    //   243: dup
    //   244: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   247: bipush #6
    //   249: invokespecial <init> : (Landroid/os/Looper;I)V
    //   252: putfield k : Lcl;
    //   255: getstatic uo2.u : Lrp0;
    //   258: astore_3
    //   259: aload_2
    //   260: getfield h : Llj;
    //   263: astore_2
    //   264: aload_2
    //   265: ifnonnull -> 274
    //   268: aload #8
    //   270: astore_1
    //   271: goto -> 561
    //   274: aload_2
    //   275: getfield f : La31;
    //   278: astore_2
    //   279: aload_2
    //   280: ifnonnull -> 289
    //   283: aload #8
    //   285: astore_1
    //   286: goto -> 561
    //   289: aload_2
    //   290: getfield H : Lsj2;
    //   293: astore #9
    //   295: aload #9
    //   297: ifnonnull -> 303
    //   300: goto -> 484
    //   303: aload #9
    //   305: invokestatic a : (Lsj2;)Ljava/util/ArrayList;
    //   308: astore_2
    //   309: aload #9
    //   311: invokestatic b : (Lsj2;)[I
    //   314: astore #9
    //   316: aload_2
    //   317: ifnonnull -> 326
    //   320: iconst_0
    //   321: istore #4
    //   323: goto -> 334
    //   326: aload_2
    //   327: invokeinterface size : ()I
    //   332: istore #4
    //   334: aload_2
    //   335: ifnull -> 530
    //   338: aload_2
    //   339: invokeinterface isEmpty : ()Z
    //   344: ifeq -> 350
    //   347: goto -> 530
    //   350: aload_2
    //   351: invokeinterface size : ()I
    //   356: iconst_5
    //   357: if_icmple -> 394
    //   360: ldc n21
    //   362: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   365: ldc ' provides more than 5 actions.'
    //   367: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   370: astore_1
    //   371: aload_3
    //   372: getfield a : Ljava/lang/String;
    //   375: aload_3
    //   376: aload_1
    //   377: iconst_0
    //   378: anewarray java/lang/Object
    //   381: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   384: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   387: pop
    //   388: aload #8
    //   390: astore_1
    //   391: goto -> 561
    //   394: aload #9
    //   396: ifnull -> 496
    //   399: aload #9
    //   401: arraylength
    //   402: istore #6
    //   404: iload #6
    //   406: ifne -> 412
    //   409: goto -> 496
    //   412: iconst_0
    //   413: istore #5
    //   415: iload #5
    //   417: iload #6
    //   419: if_icmpge -> 484
    //   422: aload #9
    //   424: iload #5
    //   426: iaload
    //   427: istore #7
    //   429: iload #7
    //   431: iflt -> 450
    //   434: iload #7
    //   436: iload #4
    //   438: if_icmplt -> 444
    //   441: goto -> 450
    //   444: iinc #5, 1
    //   447: goto -> 415
    //   450: ldc n21
    //   452: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   455: ldc 'provides a compact view action whose index is out of bounds.'
    //   457: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   460: astore_1
    //   461: aload_3
    //   462: getfield a : Ljava/lang/String;
    //   465: aload_3
    //   466: aload_1
    //   467: iconst_0
    //   468: anewarray java/lang/Object
    //   471: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   474: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   477: pop
    //   478: aload #8
    //   480: astore_1
    //   481: goto -> 561
    //   484: new uo2
    //   487: dup
    //   488: aload_1
    //   489: invokespecial <init> : (Landroid/content/Context;)V
    //   492: astore_1
    //   493: goto -> 561
    //   496: ldc n21
    //   498: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   501: ldc ' doesn't provide any actions for compact view.'
    //   503: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   506: astore_1
    //   507: aload_3
    //   508: getfield a : Ljava/lang/String;
    //   511: aload_3
    //   512: aload_1
    //   513: iconst_0
    //   514: anewarray java/lang/Object
    //   517: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   520: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   523: pop
    //   524: aload #8
    //   526: astore_1
    //   527: goto -> 561
    //   530: ldc n21
    //   532: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   535: ldc ' doesn't provide any action.'
    //   537: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   540: astore_1
    //   541: aload_3
    //   542: getfield a : Ljava/lang/String;
    //   545: aload_3
    //   546: aload_1
    //   547: iconst_0
    //   548: anewarray java/lang/Object
    //   551: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   554: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   557: pop
    //   558: aload #8
    //   560: astore_1
    //   561: aload_0
    //   562: aload_1
    //   563: putfield j : Luo2;
    //   566: aload_0
    //   567: new yi1
    //   570: dup
    //   571: bipush #25
    //   573: aload_0
    //   574: invokespecial <init> : (ILjava/lang/Object;)V
    //   577: putfield l : Lyi1;
    //   580: return
  }
  
  public final void a(nf1 paramnf1, CastDevice paramCastDevice) {
    lj lj;
    mj mj1 = this.b;
    if (mj1 == null) {
      lj = null;
    } else {
      lj = mj1.h;
    } 
    if (!this.q && mj1 != null && lj != null && this.e != null && paramnf1 != null && paramCastDevice != null) {
      ComponentName componentName = this.g;
      if (componentName != null) {
        this.n = paramnf1;
        paramnf1.o(this.m);
        this.o = paramCastDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (lj.h) {
          ee0 ee0;
          zv0 zv01 = new zv0(context, componentName, pendingIntent);
          this.p = zv01;
          d(0, null);
          CastDevice castDevice = this.o;
          if (castDevice != null && !TextUtils.isEmpty(castDevice.f)) {
            Bundle bundle = new Bundle();
            String str = context.getResources().getString(2131886294, new Object[] { this.o.f });
            b9 b9 = MediaMetadataCompat.f;
            if (!b9.containsKey("android.media.metadata.ALBUM_ARTIST") || ((Integer)b9.get("android.media.metadata.ALBUM_ARTIST")).intValue() == 1) {
              bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", str);
              zv01.C(new MediaMetadataCompat(bundle));
            } else {
              l0.l("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
              return;
            } 
          } 
          zv01.B(new vp2(this), null);
          ((tv0)zv01.c).a.setActive(true);
          Iterator iterator = ((ArrayList)zv01.f).iterator();
          if (!iterator.hasNext()) {
            this.c.f.getClass();
            iv0.b();
            ee0 = iv0.c();
            ee0.F = zv01;
            p01 p011 = new p01(ee0, zv01);
            p01 p012 = ee0.E;
            if (p012 != null)
              p012.b(); 
            ee0.E = p011;
            ee0.n();
          } else {
            throw x41.g(ee0);
          } 
        } 
        this.q = true;
        b();
        return;
      } 
    } 
    v.b("skip attaching media session", new Object[0]);
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield n : Lnf1;
    //   4: astore #10
    //   6: aload #10
    //   8: ifnonnull -> 14
    //   11: goto -> 682
    //   14: aload #10
    //   16: invokevirtual t : ()I
    //   19: istore_2
    //   20: aload #10
    //   22: invokevirtual c : ()Lcom/google/android/gms/cast/MediaInfo;
    //   25: astore #9
    //   27: aload #10
    //   29: invokevirtual j : ()Z
    //   32: istore_3
    //   33: aconst_null
    //   34: astore #8
    //   36: aload #9
    //   38: astore #6
    //   40: iload_3
    //   41: ifeq -> 140
    //   44: invokestatic j : ()V
    //   47: aload #10
    //   49: invokevirtual d : ()Lkw0;
    //   52: astore #7
    //   54: aload #7
    //   56: ifnonnull -> 65
    //   59: aconst_null
    //   60: astore #7
    //   62: goto -> 111
    //   65: aload #7
    //   67: getfield n : I
    //   70: istore_1
    //   71: aload #7
    //   73: getfield z : Landroid/util/SparseArray;
    //   76: iload_1
    //   77: invokevirtual get : (I)Ljava/lang/Object;
    //   80: checkcast java/lang/Integer
    //   83: astore #6
    //   85: aload #6
    //   87: ifnonnull -> 93
    //   90: goto -> 59
    //   93: aload #7
    //   95: getfield s : Ljava/util/ArrayList;
    //   98: aload #6
    //   100: invokevirtual intValue : ()I
    //   103: invokevirtual get : (I)Ljava/lang/Object;
    //   106: checkcast ut0
    //   109: astore #7
    //   111: aload #9
    //   113: astore #6
    //   115: aload #7
    //   117: ifnull -> 140
    //   120: aload #7
    //   122: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   125: astore #7
    //   127: aload #9
    //   129: astore #6
    //   131: aload #7
    //   133: ifnull -> 140
    //   136: aload #7
    //   138: astore #6
    //   140: aload_0
    //   141: iload_2
    //   142: aload #6
    //   144: invokevirtual d : (ILcom/google/android/gms/cast/MediaInfo;)V
    //   147: aload #10
    //   149: invokevirtual g : ()Z
    //   152: ifne -> 164
    //   155: aload_0
    //   156: invokevirtual h : ()V
    //   159: aload_0
    //   160: invokevirtual j : ()V
    //   163: return
    //   164: iload_2
    //   165: ifeq -> 682
    //   168: aload_0
    //   169: getfield j : Luo2;
    //   172: astore #7
    //   174: aload #7
    //   176: ifnull -> 669
    //   179: getstatic qr2.v : Lrp0;
    //   182: ldc_w 'Update media notification.'
    //   185: iconst_0
    //   186: anewarray java/lang/Object
    //   189: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: aload_0
    //   193: getfield o : Lcom/google/android/gms/cast/CastDevice;
    //   196: astore #11
    //   198: aload_0
    //   199: getfield n : Lnf1;
    //   202: astore #15
    //   204: aload_0
    //   205: getfield p : Lzv0;
    //   208: astore #6
    //   210: aload #11
    //   212: ifnull -> 669
    //   215: aload #15
    //   217: ifnull -> 669
    //   220: aload #6
    //   222: ifnonnull -> 228
    //   225: goto -> 669
    //   228: aload #15
    //   230: invokevirtual c : ()Lcom/google/android/gms/cast/MediaInfo;
    //   233: astore #14
    //   235: aload #14
    //   237: ifnull -> 669
    //   240: aload #14
    //   242: getfield f : Lkt0;
    //   245: astore #12
    //   247: aload #12
    //   249: ifnull -> 669
    //   252: aload #12
    //   254: getfield b : Ljava/util/List;
    //   257: astore #9
    //   259: aload #15
    //   261: invokevirtual d : ()Lkw0;
    //   264: astore #16
    //   266: aload #16
    //   268: ifnull -> 372
    //   271: aload #16
    //   273: getfield r : I
    //   276: istore_1
    //   277: iload_1
    //   278: iconst_1
    //   279: if_icmpeq -> 380
    //   282: iload_1
    //   283: iconst_2
    //   284: if_icmpeq -> 380
    //   287: iload_1
    //   288: iconst_3
    //   289: if_icmpeq -> 380
    //   292: aload #16
    //   294: getfield e : I
    //   297: istore_1
    //   298: aload #16
    //   300: getfield z : Landroid/util/SparseArray;
    //   303: iload_1
    //   304: invokevirtual get : (I)Ljava/lang/Object;
    //   307: checkcast java/lang/Integer
    //   310: astore #13
    //   312: aload #13
    //   314: ifnull -> 372
    //   317: aload #13
    //   319: invokevirtual intValue : ()I
    //   322: ifle -> 330
    //   325: iconst_1
    //   326: istore_3
    //   327: goto -> 332
    //   330: iconst_0
    //   331: istore_3
    //   332: aload #13
    //   334: invokevirtual intValue : ()I
    //   337: aload #16
    //   339: getfield s : Ljava/util/ArrayList;
    //   342: invokevirtual size : ()I
    //   345: iconst_1
    //   346: isub
    //   347: if_icmpge -> 366
    //   350: iconst_1
    //   351: istore #4
    //   353: iload_3
    //   354: istore #5
    //   356: iload #4
    //   358: istore_3
    //   359: iload #5
    //   361: istore #4
    //   363: goto -> 385
    //   366: iconst_0
    //   367: istore #4
    //   369: goto -> 353
    //   372: iconst_0
    //   373: istore_3
    //   374: iload_3
    //   375: istore #4
    //   377: goto -> 385
    //   380: iconst_1
    //   381: istore_3
    //   382: goto -> 374
    //   385: aload #15
    //   387: invokevirtual e : ()I
    //   390: iconst_2
    //   391: if_icmpne -> 400
    //   394: iconst_1
    //   395: istore #5
    //   397: goto -> 403
    //   400: iconst_0
    //   401: istore #5
    //   403: aload #14
    //   405: getfield c : I
    //   408: istore_1
    //   409: ldc_w 'com.google.android.gms.cast.metadata.TITLE'
    //   412: iconst_1
    //   413: invokestatic e : (Ljava/lang/String;I)V
    //   416: aload #12
    //   418: getfield c : Landroid/os/Bundle;
    //   421: ldc_w 'com.google.android.gms.cast.metadata.TITLE'
    //   424: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   427: astore #12
    //   429: aload #11
    //   431: getfield f : Ljava/lang/String;
    //   434: astore #11
    //   436: new xn2
    //   439: dup
    //   440: iload #5
    //   442: iload_1
    //   443: aload #12
    //   445: aload #11
    //   447: aload #6
    //   449: getfield c : Ljava/lang/Object;
    //   452: checkcast tv0
    //   455: getfield c : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   458: iload_3
    //   459: iload #4
    //   461: invokespecial <init> : (ZILjava/lang/String;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;ZZ)V
    //   464: astore #13
    //   466: aload #7
    //   468: getfield k : Lxn2;
    //   471: astore #6
    //   473: aload #6
    //   475: ifnull -> 542
    //   478: iload #5
    //   480: aload #6
    //   482: getfield b : Z
    //   485: if_icmpne -> 542
    //   488: iload_1
    //   489: aload #6
    //   491: getfield c : I
    //   494: if_icmpne -> 542
    //   497: aload #12
    //   499: aload #6
    //   501: getfield d : Ljava/lang/String;
    //   504: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   507: ifeq -> 542
    //   510: aload #11
    //   512: aload #6
    //   514: getfield e : Ljava/lang/String;
    //   517: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   520: ifeq -> 542
    //   523: iload_3
    //   524: aload #6
    //   526: getfield f : Z
    //   529: if_icmpne -> 542
    //   532: iload #4
    //   534: aload #6
    //   536: getfield g : Z
    //   539: if_icmpeq -> 554
    //   542: aload #7
    //   544: aload #13
    //   546: putfield k : Lxn2;
    //   549: aload #7
    //   551: invokevirtual a : ()V
    //   554: aload #8
    //   556: astore #6
    //   558: aload #9
    //   560: ifnull -> 590
    //   563: aload #8
    //   565: astore #6
    //   567: aload #9
    //   569: invokeinterface isEmpty : ()Z
    //   574: ifne -> 590
    //   577: aload #9
    //   579: iconst_0
    //   580: invokeinterface get : (I)Ljava/lang/Object;
    //   585: checkcast i52
    //   588: astore #6
    //   590: new qj2
    //   593: dup
    //   594: aload #6
    //   596: invokespecial <init> : (Li52;)V
    //   599: astore #8
    //   601: aload #8
    //   603: getfield b : Ljava/lang/Object;
    //   606: checkcast android/net/Uri
    //   609: astore #6
    //   611: aload #7
    //   613: getfield l : Lqj2;
    //   616: astore #9
    //   618: aload #9
    //   620: ifnull -> 639
    //   623: aload #6
    //   625: aload #9
    //   627: getfield b : Ljava/lang/Object;
    //   630: checkcast android/net/Uri
    //   633: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   636: ifne -> 669
    //   639: aload #7
    //   641: getfield i : Lcn;
    //   644: astore #9
    //   646: aload #9
    //   648: new qj2
    //   651: dup
    //   652: aload #7
    //   654: aload #8
    //   656: invokespecial <init> : (Luo2;Lqj2;)V
    //   659: putfield g : Ljava/lang/Object;
    //   662: aload #9
    //   664: aload #6
    //   666: invokevirtual F : (Landroid/net/Uri;)V
    //   669: aload #10
    //   671: invokevirtual j : ()Z
    //   674: ifne -> 682
    //   677: aload_0
    //   678: iconst_1
    //   679: invokevirtual i : (Z)V
    //   682: return
  }
  
  public final void c(Bitmap paramBitmap, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lzv0;
    //   4: astore #5
    //   6: aload #5
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_1
    //   13: ifnull -> 34
    //   16: aload_1
    //   17: invokevirtual getWidth : ()I
    //   20: iconst_1
    //   21: if_icmple -> 34
    //   24: aload_1
    //   25: astore_3
    //   26: aload_1
    //   27: invokevirtual getHeight : ()I
    //   30: iconst_1
    //   31: if_icmpgt -> 48
    //   34: iconst_2
    //   35: iconst_2
    //   36: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   39: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   42: astore_3
    //   43: aload_3
    //   44: iconst_0
    //   45: invokevirtual eraseColor : (I)V
    //   48: aload_0
    //   49: getfield p : Lzv0;
    //   52: astore #4
    //   54: aconst_null
    //   55: astore_1
    //   56: aload #4
    //   58: ifnonnull -> 64
    //   61: goto -> 97
    //   64: aload #4
    //   66: getfield e : Ljava/lang/Object;
    //   69: checkcast g7
    //   72: getfield c : Ljava/lang/Object;
    //   75: checkcast android/support/v4/media/session/b
    //   78: getfield a : Landroid/media/session/MediaController;
    //   81: invokevirtual getMetadata : ()Landroid/media/MediaMetadata;
    //   84: astore #4
    //   86: aload #4
    //   88: ifnull -> 97
    //   91: aload #4
    //   93: invokestatic b : (Landroid/media/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;
    //   96: astore_1
    //   97: aload_1
    //   98: ifnonnull -> 112
    //   101: new bh0
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: astore_1
    //   109: goto -> 121
    //   112: new bh0
    //   115: dup
    //   116: aload_1
    //   117: invokespecial <init> : (Landroid/support/v4/media/MediaMetadataCompat;)V
    //   120: astore_1
    //   121: iload_2
    //   122: ifne -> 133
    //   125: ldc_w 'android.media.metadata.DISPLAY_ICON'
    //   128: astore #4
    //   130: goto -> 138
    //   133: ldc_w 'android.media.metadata.ALBUM_ART'
    //   136: astore #4
    //   138: aload_1
    //   139: aload #4
    //   141: aload_3
    //   142: invokevirtual z : (Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   145: aload #5
    //   147: new android/support/v4/media/MediaMetadataCompat
    //   150: dup
    //   151: aload_1
    //   152: getfield c : Ljava/lang/Object;
    //   155: checkcast android/os/Bundle
    //   158: invokespecial <init> : (Landroid/os/Bundle;)V
    //   161: invokevirtual C : (Landroid/support/v4/media/MediaMetadataCompat;)V
    //   164: return
  }
  
  public final void d(int paramInt, MediaInfo paramMediaInfo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lzv0;
    //   4: astore #10
    //   6: aload #10
    //   8: ifnonnull -> 14
    //   11: goto -> 1020
    //   14: new android/os/Bundle
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #11
    //   23: new android/support/v4/media/session/g
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #12
    //   32: aload_0
    //   33: getfield n : Lnf1;
    //   36: astore #9
    //   38: aload #9
    //   40: ifnull -> 457
    //   43: aload_0
    //   44: getfield j : Luo2;
    //   47: ifnonnull -> 53
    //   50: goto -> 457
    //   53: aload #9
    //   55: invokevirtual t : ()I
    //   58: ifeq -> 69
    //   61: aload #9
    //   63: invokevirtual i : ()Z
    //   66: ifeq -> 75
    //   69: lconst_0
    //   70: lstore #5
    //   72: goto -> 82
    //   75: aload #9
    //   77: invokevirtual a : ()J
    //   80: lstore #5
    //   82: invokestatic elapsedRealtime : ()J
    //   85: lstore #7
    //   87: aload #12
    //   89: iload_1
    //   90: putfield b : I
    //   93: aload #12
    //   95: lload #5
    //   97: putfield c : J
    //   100: aload #12
    //   102: lload #7
    //   104: putfield f : J
    //   107: aload #12
    //   109: fconst_1
    //   110: putfield d : F
    //   113: iload_1
    //   114: ifne -> 127
    //   117: aload #12
    //   119: invokevirtual b : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   122: astore #9
    //   124: goto -> 464
    //   127: aload_0
    //   128: getfield e : La31;
    //   131: astore #13
    //   133: aload #13
    //   135: ifnull -> 148
    //   138: aload #13
    //   140: getfield H : Lsj2;
    //   143: astore #9
    //   145: goto -> 151
    //   148: aconst_null
    //   149: astore #9
    //   151: aload_0
    //   152: getfield n : Lnf1;
    //   155: astore #14
    //   157: aload #14
    //   159: ifnull -> 180
    //   162: aload #14
    //   164: invokevirtual i : ()Z
    //   167: ifne -> 180
    //   170: aload_0
    //   171: getfield n : Lnf1;
    //   174: invokevirtual m : ()Z
    //   177: ifeq -> 186
    //   180: lconst_0
    //   181: lstore #5
    //   183: goto -> 191
    //   186: ldc2_w 256
    //   189: lstore #5
    //   191: aload #9
    //   193: ifnull -> 322
    //   196: aload #9
    //   198: invokestatic a : (Lsj2;)Ljava/util/ArrayList;
    //   201: astore #9
    //   203: lload #5
    //   205: lstore #7
    //   207: aload #9
    //   209: ifnull -> 440
    //   212: aload #9
    //   214: invokevirtual size : ()I
    //   217: istore #4
    //   219: iconst_0
    //   220: istore_3
    //   221: lload #5
    //   223: lstore #7
    //   225: iload_3
    //   226: iload #4
    //   228: if_icmpge -> 440
    //   231: aload #9
    //   233: iload_3
    //   234: invokevirtual get : (I)Ljava/lang/Object;
    //   237: astore #13
    //   239: iinc #3, 1
    //   242: aload #13
    //   244: checkcast m21
    //   247: astore #13
    //   249: aload #13
    //   251: getfield b : Ljava/lang/String;
    //   254: astore #14
    //   256: aload #14
    //   258: ldc_w 'com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK'
    //   261: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   264: ifne -> 305
    //   267: aload #14
    //   269: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_PREV'
    //   272: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   275: ifne -> 305
    //   278: aload #14
    //   280: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_NEXT'
    //   283: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   286: ifeq -> 292
    //   289: goto -> 305
    //   292: aload_0
    //   293: aload #12
    //   295: aload #14
    //   297: aload #13
    //   299: invokevirtual f : (Landroid/support/v4/media/session/g;Ljava/lang/String;Lm21;)V
    //   302: goto -> 221
    //   305: aload_0
    //   306: aload #14
    //   308: iload_1
    //   309: aload #11
    //   311: invokevirtual e : (Ljava/lang/String;ILandroid/os/Bundle;)J
    //   314: lload #5
    //   316: lor
    //   317: lstore #5
    //   319: goto -> 221
    //   322: lload #5
    //   324: lstore #7
    //   326: aload #13
    //   328: ifnull -> 440
    //   331: aload #13
    //   333: getfield b : Ljava/util/ArrayList;
    //   336: astore #9
    //   338: aload #9
    //   340: invokevirtual size : ()I
    //   343: istore #4
    //   345: iconst_0
    //   346: istore_3
    //   347: lload #5
    //   349: lstore #7
    //   351: iload_3
    //   352: iload #4
    //   354: if_icmpge -> 440
    //   357: aload #9
    //   359: iload_3
    //   360: invokevirtual get : (I)Ljava/lang/Object;
    //   363: astore #13
    //   365: iinc #3, 1
    //   368: aload #13
    //   370: checkcast java/lang/String
    //   373: astore #13
    //   375: aload #13
    //   377: ldc_w 'com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK'
    //   380: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   383: ifne -> 423
    //   386: aload #13
    //   388: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_PREV'
    //   391: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   394: ifne -> 423
    //   397: aload #13
    //   399: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_NEXT'
    //   402: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   405: ifeq -> 411
    //   408: goto -> 423
    //   411: aload_0
    //   412: aload #12
    //   414: aload #13
    //   416: aconst_null
    //   417: invokevirtual f : (Landroid/support/v4/media/session/g;Ljava/lang/String;Lm21;)V
    //   420: goto -> 347
    //   423: lload #5
    //   425: aload_0
    //   426: aload #13
    //   428: iload_1
    //   429: aload #11
    //   431: invokevirtual e : (Ljava/lang/String;ILandroid/os/Bundle;)J
    //   434: lor
    //   435: lstore #5
    //   437: goto -> 347
    //   440: aload #12
    //   442: lload #7
    //   444: putfield e : J
    //   447: aload #12
    //   449: invokevirtual b : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   452: astore #9
    //   454: goto -> 464
    //   457: aload #12
    //   459: invokevirtual b : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   462: astore #9
    //   464: aload #10
    //   466: getfield c : Ljava/lang/Object;
    //   469: checkcast tv0
    //   472: astore #13
    //   474: aload #13
    //   476: aload #9
    //   478: putfield g : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   481: aload #13
    //   483: getfield d : Ljava/lang/Object;
    //   486: astore #12
    //   488: aload #12
    //   490: monitorenter
    //   491: aload #13
    //   493: getfield f : Landroid/os/RemoteCallbackList;
    //   496: invokevirtual beginBroadcast : ()I
    //   499: istore_3
    //   500: iinc #3, -1
    //   503: aload #13
    //   505: getfield f : Landroid/os/RemoteCallbackList;
    //   508: astore #14
    //   510: iload_3
    //   511: iflt -> 547
    //   514: aload #14
    //   516: iload_3
    //   517: invokevirtual getBroadcastItem : (I)Landroid/os/IInterface;
    //   520: checkcast jg0
    //   523: astore #14
    //   525: aload #14
    //   527: aload #9
    //   529: invokeinterface i0 : (Landroid/support/v4/media/session/PlaybackStateCompat;)V
    //   534: goto -> 541
    //   537: astore_2
    //   538: goto -> 1041
    //   541: iinc #3, -1
    //   544: goto -> 503
    //   547: aload #14
    //   549: invokevirtual finishBroadcast : ()V
    //   552: aload #12
    //   554: monitorexit
    //   555: aload #13
    //   557: getfield a : Landroid/media/session/MediaSession;
    //   560: aload #9
    //   562: invokevirtual f : ()Landroid/media/session/PlaybackState;
    //   565: invokevirtual setPlaybackState : (Landroid/media/session/PlaybackState;)V
    //   568: aload_0
    //   569: getfield e : La31;
    //   572: astore #9
    //   574: aload #9
    //   576: ifnull -> 596
    //   579: aload #9
    //   581: getfield I : Z
    //   584: ifeq -> 596
    //   587: aload #11
    //   589: ldc_w 'android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS'
    //   592: iconst_1
    //   593: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   596: aload #9
    //   598: ifnull -> 618
    //   601: aload #9
    //   603: getfield J : Z
    //   606: ifeq -> 618
    //   609: aload #11
    //   611: ldc_w 'android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT'
    //   614: iconst_1
    //   615: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   618: aload #11
    //   620: ldc_w 'android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS'
    //   623: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   626: ifne -> 640
    //   629: aload #11
    //   631: ldc_w 'android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT'
    //   634: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   637: ifeq -> 656
    //   640: aload #10
    //   642: getfield c : Ljava/lang/Object;
    //   645: checkcast tv0
    //   648: getfield a : Landroid/media/session/MediaSession;
    //   651: aload #11
    //   653: invokevirtual setExtras : (Landroid/os/Bundle;)V
    //   656: iload_1
    //   657: ifeq -> 1021
    //   660: aload_0
    //   661: getfield n : Lnf1;
    //   664: ifnull -> 737
    //   667: aload_0
    //   668: getfield f : Landroid/content/ComponentName;
    //   671: astore #9
    //   673: aload #9
    //   675: ifnonnull -> 684
    //   678: aconst_null
    //   679: astore #9
    //   681: goto -> 716
    //   684: new android/content/Intent
    //   687: dup
    //   688: invokespecial <init> : ()V
    //   691: astore #11
    //   693: aload #11
    //   695: aload #9
    //   697: invokevirtual setComponent : (Landroid/content/ComponentName;)Landroid/content/Intent;
    //   700: pop
    //   701: aload_0
    //   702: getfield a : Landroid/content/Context;
    //   705: iconst_0
    //   706: aload #11
    //   708: ldc_w 201326592
    //   711: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   714: astore #9
    //   716: aload #9
    //   718: ifnull -> 737
    //   721: aload #10
    //   723: getfield c : Ljava/lang/Object;
    //   726: checkcast tv0
    //   729: getfield a : Landroid/media/session/MediaSession;
    //   732: aload #9
    //   734: invokevirtual setSessionActivity : (Landroid/app/PendingIntent;)V
    //   737: aload_0
    //   738: getfield n : Lnf1;
    //   741: astore #11
    //   743: aload #11
    //   745: ifnull -> 1020
    //   748: aload_0
    //   749: getfield p : Lzv0;
    //   752: astore #10
    //   754: aload #10
    //   756: ifnull -> 1020
    //   759: aload_2
    //   760: ifnull -> 1020
    //   763: aload_2
    //   764: getfield f : Lkt0;
    //   767: astore #9
    //   769: aload #9
    //   771: ifnull -> 1020
    //   774: aload #11
    //   776: invokevirtual i : ()Z
    //   779: ifeq -> 788
    //   782: lconst_0
    //   783: lstore #5
    //   785: goto -> 794
    //   788: aload_2
    //   789: getfield g : J
    //   792: lstore #5
    //   794: ldc_w 'com.google.android.gms.cast.metadata.TITLE'
    //   797: iconst_1
    //   798: invokestatic e : (Ljava/lang/String;I)V
    //   801: aload #9
    //   803: getfield c : Landroid/os/Bundle;
    //   806: ldc_w 'com.google.android.gms.cast.metadata.TITLE'
    //   809: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   812: astore #12
    //   814: ldc_w 'com.google.android.gms.cast.metadata.SUBTITLE'
    //   817: iconst_1
    //   818: invokestatic e : (Ljava/lang/String;I)V
    //   821: aload #9
    //   823: getfield c : Landroid/os/Bundle;
    //   826: ldc_w 'com.google.android.gms.cast.metadata.SUBTITLE'
    //   829: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   832: astore #11
    //   834: aload_0
    //   835: getfield p : Lzv0;
    //   838: astore_2
    //   839: aload_2
    //   840: ifnonnull -> 848
    //   843: aconst_null
    //   844: astore_2
    //   845: goto -> 877
    //   848: aload_2
    //   849: getfield e : Ljava/lang/Object;
    //   852: checkcast g7
    //   855: getfield c : Ljava/lang/Object;
    //   858: checkcast android/support/v4/media/session/b
    //   861: getfield a : Landroid/media/session/MediaController;
    //   864: invokevirtual getMetadata : ()Landroid/media/MediaMetadata;
    //   867: astore_2
    //   868: aload_2
    //   869: ifnull -> 843
    //   872: aload_2
    //   873: invokestatic b : (Landroid/media/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;
    //   876: astore_2
    //   877: aload_2
    //   878: ifnonnull -> 892
    //   881: new bh0
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: astore_2
    //   889: goto -> 901
    //   892: new bh0
    //   895: dup
    //   896: aload_2
    //   897: invokespecial <init> : (Landroid/support/v4/media/MediaMetadataCompat;)V
    //   900: astore_2
    //   901: aload_2
    //   902: lload #5
    //   904: ldc_w 'android.media.metadata.DURATION'
    //   907: invokevirtual A : (JLjava/lang/String;)V
    //   910: aload #12
    //   912: ifnull -> 933
    //   915: aload_2
    //   916: ldc_w 'android.media.metadata.TITLE'
    //   919: aload #12
    //   921: invokevirtual C : (Ljava/lang/String;Ljava/lang/String;)V
    //   924: aload_2
    //   925: ldc_w 'android.media.metadata.DISPLAY_TITLE'
    //   928: aload #12
    //   930: invokevirtual C : (Ljava/lang/String;Ljava/lang/String;)V
    //   933: aload #11
    //   935: ifnull -> 947
    //   938: aload_2
    //   939: ldc_w 'android.media.metadata.DISPLAY_SUBTITLE'
    //   942: aload #11
    //   944: invokevirtual C : (Ljava/lang/String;Ljava/lang/String;)V
    //   947: aload #10
    //   949: new android/support/v4/media/MediaMetadataCompat
    //   952: dup
    //   953: aload_2
    //   954: getfield c : Ljava/lang/Object;
    //   957: checkcast android/os/Bundle
    //   960: invokespecial <init> : (Landroid/os/Bundle;)V
    //   963: invokevirtual C : (Landroid/support/v4/media/MediaMetadataCompat;)V
    //   966: aload_0
    //   967: aload #9
    //   969: invokevirtual g : (Lkt0;)Landroid/net/Uri;
    //   972: astore_2
    //   973: aload_2
    //   974: ifnull -> 988
    //   977: aload_0
    //   978: getfield h : Lcn;
    //   981: aload_2
    //   982: invokevirtual F : (Landroid/net/Uri;)V
    //   985: goto -> 994
    //   988: aload_0
    //   989: aconst_null
    //   990: iconst_0
    //   991: invokevirtual c : (Landroid/graphics/Bitmap;I)V
    //   994: aload_0
    //   995: aload #9
    //   997: invokevirtual g : (Lkt0;)Landroid/net/Uri;
    //   1000: astore_2
    //   1001: aload_2
    //   1002: ifnull -> 1014
    //   1005: aload_0
    //   1006: getfield i : Lcn;
    //   1009: aload_2
    //   1010: invokevirtual F : (Landroid/net/Uri;)V
    //   1013: return
    //   1014: aload_0
    //   1015: aconst_null
    //   1016: iconst_3
    //   1017: invokevirtual c : (Landroid/graphics/Bitmap;I)V
    //   1020: return
    //   1021: aload #10
    //   1023: new android/support/v4/media/MediaMetadataCompat
    //   1026: dup
    //   1027: new android/os/Bundle
    //   1030: dup
    //   1031: invokespecial <init> : ()V
    //   1034: invokespecial <init> : (Landroid/os/Bundle;)V
    //   1037: invokevirtual C : (Landroid/support/v4/media/MediaMetadataCompat;)V
    //   1040: return
    //   1041: aload #12
    //   1043: monitorexit
    //   1044: aload_2
    //   1045: athrow
    //   1046: astore #14
    //   1048: goto -> 541
    // Exception table:
    //   from	to	target	type
    //   491	500	537	finally
    //   514	525	537	finally
    //   525	534	1046	android/os/RemoteException
    //   525	534	537	finally
    //   547	555	537	finally
    //   1041	1044	537	finally
  }
  
  public final long e(String paramString, int paramInt, Bundle paramBundle) {
    Integer integer;
    int i = paramString.hashCode();
    if (i != -945151566) {
      if (i != -945080078) {
        if (i == 235550565 && paramString.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
          long l;
          i = 3;
          if (paramInt == 3) {
            l = 514L;
            paramInt = i;
          } else {
            l = 512L;
          } 
          return (paramInt != 2) ? l : 516L;
        } 
      } else if (paramString.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
        nf1 nf11 = this.n;
        if (nf11 != null && nf11.g()) {
          kw0 kw0 = nf11.d();
          n21.m(kw0);
          if ((0x80L & kw0.j) == 0L && kw0.r == 0) {
            paramInt = kw0.e;
            integer = (Integer)kw0.z.get(paramInt);
            if (integer != null && integer.intValue() > 0)
              return 16L; 
          } else {
            return 16L;
          } 
        } 
        paramBundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        return 0L;
      } 
    } else if (integer.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
      nf1 nf11 = this.n;
      if (nf11 != null && nf11.g()) {
        kw0 kw0 = nf11.d();
        n21.m(kw0);
        if ((0x40L & kw0.j) == 0L && kw0.r == 0) {
          paramInt = kw0.e;
          Integer integer1 = (Integer)kw0.z.get(paramInt);
          if (integer1 != null && integer1.intValue() < kw0.s.size() - 1)
            return 32L; 
        } else {
          return 32L;
        } 
      } 
      paramBundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
    } 
    return 0L;
  }
  
  public final void f(g paramg, String paramString, m21 paramm21) {
    String str1;
    PlaybackStateCompat.CustomAction customAction;
    int i = paramString.hashCode();
    Context context = this.a;
    a31 a311 = this.e;
    String str2 = null;
    switch (i) {
      default:
        if (paramm21 != null) {
          str2 = paramm21.e;
          i = paramm21.c;
          if (!TextUtils.isEmpty(paramString)) {
            if (!TextUtils.isEmpty(str2)) {
              if (i != 0) {
                customAction = new PlaybackStateCompat.CustomAction(paramString, str2, i, null);
                break;
              } 
              l0.l("You must specify an icon resource id to build a CustomAction");
              return;
            } 
            l0.l("You must specify a name to build a CustomAction");
            return;
          } 
          l0.l("You must specify an action to build a CustomAction");
          return;
        } 
        break;
      case 1362116196:
        if (paramString.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
          if (this.r == null && a311 != null) {
            long l = a311.e;
            rp0 rp01 = hs2.a;
            int k = l cmp 10000L;
            i = a311.A;
            if (k == 0) {
              i = a311.B;
            } else if (l == 30000L) {
              i = a311.C;
            } 
            int j = a311.m;
            if (k == 0) {
              j = a311.n;
            } else if (l == 30000L) {
              j = a311.o;
            } 
            str1 = context.getResources().getString(i);
            if (!TextUtils.isEmpty("com.google.android.gms.cast.framework.action.FORWARD")) {
              if (!TextUtils.isEmpty(str1)) {
                if (j != 0) {
                  this.r = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.FORWARD", str1, j, null);
                } else {
                  l0.l("You must specify an icon resource id to build a CustomAction");
                  return;
                } 
              } else {
                l0.l("You must specify a name to build a CustomAction");
                return;
              } 
            } else {
              l0.l("You must specify an action to build a CustomAction");
              return;
            } 
          } 
          customAction = this.r;
          break;
        } 
      case -124479363:
        if (str1.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
          if (this.u == null && a311 != null) {
            str1 = context.getResources().getString(a311.G);
            i = a311.s;
            if (!TextUtils.isEmpty("com.google.android.gms.cast.framework.action.DISCONNECT")) {
              if (!TextUtils.isEmpty(str1)) {
                if (i != 0) {
                  this.u = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.DISCONNECT", str1, i, null);
                } else {
                  l0.l("You must specify an icon resource id to build a CustomAction");
                  return;
                } 
              } else {
                l0.l("You must specify a name to build a CustomAction");
                return;
              } 
            } else {
              l0.l("You must specify an action to build a CustomAction");
              return;
            } 
          } 
          customAction = this.u;
          break;
        } 
      case -668151673:
        if (str1.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
          if (this.t == null && a311 != null) {
            str1 = context.getResources().getString(a311.G);
            i = a311.s;
            if (!TextUtils.isEmpty("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
              if (!TextUtils.isEmpty(str1)) {
                if (i != 0) {
                  this.t = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.STOP_CASTING", str1, i, null);
                } else {
                  l0.l("You must specify an icon resource id to build a CustomAction");
                  return;
                } 
              } else {
                l0.l("You must specify a name to build a CustomAction");
                return;
              } 
            } else {
              l0.l("You must specify an action to build a CustomAction");
              return;
            } 
          } 
          customAction = this.t;
          break;
        } 
      case -1699820260:
        if (str1.equals("com.google.android.gms.cast.framework.action.REWIND")) {
          if (this.s == null && a311 != null) {
            long l = a311.e;
            rp0 rp01 = hs2.a;
            int k = l cmp 10000L;
            i = a311.D;
            if (k == 0) {
              i = a311.E;
            } else if (l == 30000L) {
              i = a311.F;
            } 
            int j = a311.p;
            if (k == 0) {
              j = a311.q;
            } else if (l == 30000L) {
              j = a311.r;
            } 
            String str = context.getResources().getString(i);
            if (!TextUtils.isEmpty("com.google.android.gms.cast.framework.action.REWIND")) {
              if (!TextUtils.isEmpty(str)) {
                if (j != 0) {
                  this.s = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.REWIND", str, j, null);
                } else {
                  l0.l("You must specify an icon resource id to build a CustomAction");
                  return;
                } 
              } else {
                l0.l("You must specify a name to build a CustomAction");
                return;
              } 
            } else {
              l0.l("You must specify an action to build a CustomAction");
              return;
            } 
          } 
          customAction = this.s;
          break;
        } 
    } 
    if (customAction != null)
      paramg.a.add(customAction); 
  }
  
  public final Uri g(kt0 paramkt0) {
    lj lj = this.b.h;
    if (lj != null)
      lj.e(); 
    List list = paramkt0.b;
    if (list != null && !list.isEmpty()) {
      i52 i52 = paramkt0.b.get(0);
    } else {
      paramkt0 = null;
    } 
    return (paramkt0 == null) ? null : ((i52)paramkt0).c;
  }
  
  public final void h() {
    uo2 uo21 = this.j;
    if (uo21 != null) {
      v.b("Stopping media notification.", new Object[0]);
      cn cn1 = uo21.i;
      cn1.G();
      cn1.g = null;
      NotificationManager notificationManager = uo21.b;
      if (notificationManager != null)
        notificationManager.cancel("castMediaNotification", 1); 
    } 
  }
  
  public final void i(boolean paramBoolean) {
    if (this.b.i) {
      cl cl1 = this.k;
      yi1 yi11 = this.l;
      if (yi11 != null)
        cl1.removeCallbacks(yi11); 
      Context context = this.a;
      Intent intent = new Intent(context, ReconnectionService.class);
      intent.setPackage(context.getPackageName());
      try {
        context.startService(intent);
        return;
      } catch (IllegalStateException illegalStateException) {
        if (paramBoolean)
          cl1.postDelayed(yi11, 1000L); 
      } 
    } 
  }
  
  public final void j() {
    if (!this.b.i)
      return; 
    this.k.removeCallbacks(this.l);
    Context context = this.a;
    Intent intent = new Intent(context, ReconnectionService.class);
    intent.setPackage(context.getPackageName());
    context.stopService(intent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */