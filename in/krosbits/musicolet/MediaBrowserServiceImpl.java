package in.krosbits.musicolet;

import ag0;
import android.content.res.Resources;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import ew0;
import in.krosbits.musicolet.providers.AAProvider;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jm0;
import km0;
import m01;
import qn1;
import z51;

public class MediaBrowserServiceImpl extends MediaBrowserService {
  public static MediaBrowserServiceImpl b;
  
  public static final Bundle c;
  
  public static final Bundle e;
  
  public static final Bundle f;
  
  public static final Bundle g;
  
  public static final Bundle h;
  
  public static final Bundle i;
  
  public static final Bundle j;
  
  public static final ExecutorService k = Executors.newSingleThreadExecutor();
  
  public static void a(ArrayList<MediaBrowser.MediaItem> paramArrayList, jm0 paramjm0) {
    Resources resources = MyApplication.i.getApplicationContext().getResources();
    MediaDescription.Builder builder = new MediaDescription.Builder();
    StringBuilder stringBuilder2 = new StringBuilder("musicolet.media.r.13_pa_");
    String str = paramjm0.b;
    stringBuilder2.append(str);
    builder = builder.setMediaId(stringBuilder2.toString());
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append(resources.getString(2131887085));
    stringBuilder2.append(": ");
    stringBuilder2.append(paramjm0.b());
    builder = builder.setTitle(stringBuilder2.toString()).setSubtitle(resources.getString(2131886603));
    stringBuilder2 = new StringBuilder("android.resource://in.krosbits.musicolet/drawable/");
    stringBuilder2.append(resources.getResourceEntryName(2131231063));
    paramArrayList.add(new MediaBrowser.MediaItem(builder.setIconUri(Uri.parse(stringBuilder2.toString())).setExtras(j).build(), 2));
    ArrayList<StringBuilder> arrayList = paramjm0.c();
    int j = arrayList.size();
    for (int i = 0; i < j; i = k) {
      stringBuilder2 = arrayList.get(i);
      int k = i + 1;
      jm0 jm01 = (jm0)stringBuilder2;
      MediaDescription.Builder builder1 = new MediaDescription.Builder();
      StringBuilder stringBuilder = new StringBuilder(nBRIsU.RuNDmntKKWk);
      stringBuilder.append(jm01.b);
      builder1 = builder1.setMediaId(stringBuilder.toString()).setTitle(jm01.b()).setExtras(c);
      stringBuilder = new StringBuilder("android.resource://in.krosbits.musicolet/drawable/");
      i = jm01.h;
      if (i == -1)
        i = 2131231146; 
      stringBuilder.append(resources.getResourceEntryName(i));
      paramArrayList.add(new MediaBrowser.MediaItem(builder1.setIconUri(Uri.parse(stringBuilder.toString())).build(), 1));
    } 
    arrayList = MyApplication.j.c.m(str);
    z51.R(MyApplication.o().getInt("I_K_SRTBYF_F", 30), arrayList);
    StringBuilder stringBuilder1 = new StringBuilder("musicolet.media.r.13_ps_");
    stringBuilder1.append(str);
    stringBuilder1.append("_");
    b(paramArrayList, arrayList, stringBuilder1.toString());
  }
  
  public static void b(ArrayList<MediaBrowser.MediaItem> paramArrayList1, ArrayList<km0> paramArrayList2, String paramString) {
    boolean bool;
    boolean bool1 = paramString.startsWith("musicolet.media.r.5.s_");
    byte b = 0;
    if (bool1 || paramString.startsWith("musicolet.media.r.9.s_") || paramString.startsWith("musicolet.media.r.8.s_")) {
      bool = true;
    } else {
      bool = false;
    } 
    while (b < paramArrayList2.size()) {
      String str;
      km0 km0 = paramArrayList2.get(b);
      MediaDescription.Builder builder = new MediaDescription.Builder();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(b);
      builder = builder.setMediaId(stringBuilder.toString()).setTitle(ag0.W(km0)).setIconUri(AAProvider.d(km0));
      qn1 qn1 = km0.c;
      if (bool) {
        str = qn1.c;
      } else {
        str = ((qn1)str).e;
      } 
      paramArrayList1.add(new MediaBrowser.MediaItem(builder.setSubtitle(str).setExtras(j).build(), 2));
      b++;
    } 
  }
  
  public static void c(String paramString, MediaBrowserService.Result paramResult) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: ldc_w 'musicolet.media.r.0'
    //   12: aload_0
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: istore #6
    //   18: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.i : Landroid/os/Bundle;
    //   21: astore #9
    //   23: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.c : Landroid/os/Bundle;
    //   26: astore #11
    //   28: getstatic androidx/profileinstaller/Vuyf/nBRIsU.TFkusfnSw : Ljava/lang/String;
    //   31: astore #12
    //   33: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.e : Landroid/os/Bundle;
    //   36: astore #8
    //   38: iconst_1
    //   39: istore #5
    //   41: iload #6
    //   43: ifeq -> 314
    //   46: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   49: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   52: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   55: astore_0
    //   56: new android/media/MediaDescription$Builder
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: ldc_w 'musicolet.media.t.1'
    //   66: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   69: aload #8
    //   71: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   74: aload_0
    //   75: ldc_w 2131887136
    //   78: invokevirtual getString : (I)Ljava/lang/String;
    //   81: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   84: astore #10
    //   86: new java/lang/StringBuilder
    //   89: dup
    //   90: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   92: invokespecial <init> : (Ljava/lang/String;)V
    //   95: astore #8
    //   97: aload #8
    //   99: aload_0
    //   100: ldc_w 2131231376
    //   103: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload #7
    //   112: new android/media/browse/MediaBrowser$MediaItem
    //   115: dup
    //   116: aload #10
    //   118: aload #8
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   126: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   129: invokevirtual build : ()Landroid/media/MediaDescription;
    //   132: iconst_1
    //   133: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   136: invokevirtual add : (Ljava/lang/Object;)Z
    //   139: pop
    //   140: new android/media/MediaDescription$Builder
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: aload #12
    //   149: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   152: aload #11
    //   154: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   157: aload_0
    //   158: ldc_w 2131886734
    //   161: invokevirtual getString : (I)Ljava/lang/String;
    //   164: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   167: astore #8
    //   169: new java/lang/StringBuilder
    //   172: dup
    //   173: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: astore #10
    //   180: aload #10
    //   182: aload_0
    //   183: ldc_w 2131231199
    //   186: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload #7
    //   195: new android/media/browse/MediaBrowser$MediaItem
    //   198: dup
    //   199: aload #8
    //   201: aload #10
    //   203: invokevirtual toString : ()Ljava/lang/String;
    //   206: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   209: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   212: invokevirtual build : ()Landroid/media/MediaDescription;
    //   215: iconst_1
    //   216: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   219: invokevirtual add : (Ljava/lang/Object;)Z
    //   222: pop
    //   223: new android/media/MediaDescription$Builder
    //   226: dup
    //   227: invokespecial <init> : ()V
    //   230: ldc_w 'musicolet.media.r.11'
    //   233: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   236: aload #9
    //   238: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   241: aload_0
    //   242: ldc_w 2131887104
    //   245: invokevirtual getString : (I)Ljava/lang/String;
    //   248: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   251: astore #8
    //   253: new java/lang/StringBuilder
    //   256: dup
    //   257: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   259: invokespecial <init> : (Ljava/lang/String;)V
    //   262: astore #9
    //   264: aload #9
    //   266: aload_0
    //   267: ldc_w 2131231373
    //   270: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: pop
    //   277: aload #7
    //   279: new android/media/browse/MediaBrowser$MediaItem
    //   282: dup
    //   283: aload #8
    //   285: aload #9
    //   287: invokevirtual toString : ()Ljava/lang/String;
    //   290: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   293: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   296: invokevirtual build : ()Landroid/media/MediaDescription;
    //   299: iconst_1
    //   300: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   303: invokevirtual add : (Ljava/lang/Object;)Z
    //   306: pop
    //   307: aload_1
    //   308: aload #7
    //   310: invokevirtual sendResult : (Ljava/lang/Object;)V
    //   313: return
    //   314: ldc_w 'musicolet.media.t.1'
    //   317: aload_0
    //   318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   321: istore #6
    //   323: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.j : Landroid/os/Bundle;
    //   326: astore #10
    //   328: iconst_0
    //   329: istore #4
    //   331: iconst_0
    //   332: istore_2
    //   333: iconst_0
    //   334: istore_3
    //   335: iload #6
    //   337: ifeq -> 850
    //   340: invokestatic k : ()Z
    //   343: ifne -> 349
    //   346: goto -> 843
    //   349: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   352: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   355: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   358: astore #9
    //   360: invokestatic z : ()Lxn1;
    //   363: astore #8
    //   365: aload #8
    //   367: ifnull -> 610
    //   370: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   373: astore_0
    //   374: aload_0
    //   375: ifnull -> 387
    //   378: iload_3
    //   379: istore_2
    //   380: aload_0
    //   381: getfield j : Z
    //   384: ifeq -> 389
    //   387: iconst_1
    //   388: istore_2
    //   389: new android/media/MediaDescription$Builder
    //   392: dup
    //   393: invokespecial <init> : ()V
    //   396: ldc_w 'musicolet.media.r.1'
    //   399: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   402: astore #11
    //   404: new java/lang/StringBuilder
    //   407: dup
    //   408: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   410: invokespecial <init> : (Ljava/lang/String;)V
    //   413: astore_0
    //   414: aload_0
    //   415: aload #9
    //   417: ldc 2131231063
    //   419: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload #11
    //   428: aload_0
    //   429: invokevirtual toString : ()Ljava/lang/String;
    //   432: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   435: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   438: aload #8
    //   440: getfield h : Ljava/lang/String;
    //   443: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   446: astore #11
    //   448: new java/lang/StringBuilder
    //   451: astore #12
    //   453: iload_2
    //   454: ifeq -> 491
    //   457: aload #12
    //   459: ldc_w ' | ▶ '
    //   462: invokespecial <init> : (Ljava/lang/String;)V
    //   465: aload #9
    //   467: ldc_w 2131887221
    //   470: invokevirtual getString : (I)Ljava/lang/String;
    //   473: astore_0
    //   474: aload #12
    //   476: aload_0
    //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: pop
    //   481: aload #12
    //   483: invokevirtual toString : ()Ljava/lang/String;
    //   486: astore #12
    //   488: goto -> 511
    //   491: aload #12
    //   493: ldc_w ' | '
    //   496: invokespecial <init> : (Ljava/lang/String;)V
    //   499: aload #9
    //   501: ldc_w 2131887023
    //   504: invokevirtual getString : (I)Ljava/lang/String;
    //   507: astore_0
    //   508: goto -> 474
    //   511: new java/lang/StringBuilder
    //   514: dup
    //   515: ldc_w '('
    //   518: invokespecial <init> : (Ljava/lang/String;)V
    //   521: astore_0
    //   522: aload_0
    //   523: aload #8
    //   525: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   528: invokevirtual e : (Z)I
    //   531: iconst_1
    //   532: iadd
    //   533: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   536: pop
    //   537: aload_0
    //   538: ldc_w '/'
    //   541: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: pop
    //   545: aload_0
    //   546: aload #8
    //   548: getfield b : Ljava/util/ArrayList;
    //   551: invokevirtual size : ()I
    //   554: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   557: pop
    //   558: aload_0
    //   559: ldc_w ')'
    //   562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   565: pop
    //   566: aload_0
    //   567: aload #12
    //   569: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: pop
    //   573: aload #11
    //   575: aload_0
    //   576: invokevirtual toString : ()Ljava/lang/String;
    //   579: invokevirtual setSubtitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   582: pop
    //   583: aload #11
    //   585: aload #10
    //   587: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   590: pop
    //   591: aload #7
    //   593: new android/media/browse/MediaBrowser$MediaItem
    //   596: dup
    //   597: aload #11
    //   599: invokevirtual build : ()Landroid/media/MediaDescription;
    //   602: iconst_2
    //   603: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   606: invokevirtual add : (Ljava/lang/Object;)Z
    //   609: pop
    //   610: invokestatic h : ()Lwk1;
    //   613: getfield b : Ljava/util/Stack;
    //   616: astore_0
    //   617: aload_0
    //   618: invokevirtual size : ()I
    //   621: iconst_1
    //   622: isub
    //   623: istore_2
    //   624: iload_2
    //   625: iflt -> 843
    //   628: aload_0
    //   629: iload_2
    //   630: invokevirtual get : (I)Ljava/lang/Object;
    //   633: checkcast xn1
    //   636: astore #10
    //   638: aload #10
    //   640: aload #8
    //   642: if_acmpeq -> 837
    //   645: new android/media/MediaDescription$Builder
    //   648: dup
    //   649: invokespecial <init> : ()V
    //   652: aload #10
    //   654: getfield h : Ljava/lang/String;
    //   657: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   660: astore #11
    //   662: new java/lang/StringBuilder
    //   665: dup
    //   666: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   668: invokespecial <init> : (Ljava/lang/String;)V
    //   671: astore #12
    //   673: aload #12
    //   675: aload #9
    //   677: ldc_w 2131231376
    //   680: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   683: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   686: pop
    //   687: aload #11
    //   689: aload #12
    //   691: invokevirtual toString : ()Ljava/lang/String;
    //   694: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   697: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   700: astore #11
    //   702: new java/lang/StringBuilder
    //   705: dup
    //   706: ldc_w '('
    //   709: invokespecial <init> : (Ljava/lang/String;)V
    //   712: astore #12
    //   714: aload #12
    //   716: aload #10
    //   718: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   721: invokevirtual e : (Z)I
    //   724: iconst_1
    //   725: iadd
    //   726: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   729: pop
    //   730: aload #12
    //   732: ldc_w '/'
    //   735: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   738: pop
    //   739: aload #12
    //   741: aload #10
    //   743: getfield b : Ljava/util/ArrayList;
    //   746: invokevirtual size : ()I
    //   749: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   752: pop
    //   753: aload #12
    //   755: ldc_w ') | ▶ '
    //   758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: pop
    //   762: aload #12
    //   764: aload #9
    //   766: ldc_w 2131887221
    //   769: invokevirtual getString : (I)Ljava/lang/String;
    //   772: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   775: pop
    //   776: aload #11
    //   778: aload #12
    //   780: invokevirtual toString : ()Ljava/lang/String;
    //   783: invokevirtual setSubtitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   786: astore #10
    //   788: new java/lang/StringBuilder
    //   791: dup
    //   792: ldc_w 'musicolet.media.r.14_'
    //   795: invokespecial <init> : (Ljava/lang/String;)V
    //   798: astore #11
    //   800: aload #11
    //   802: iload_2
    //   803: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   806: pop
    //   807: aload #7
    //   809: new android/media/browse/MediaBrowser$MediaItem
    //   812: dup
    //   813: aload #10
    //   815: aload #11
    //   817: invokevirtual toString : ()Ljava/lang/String;
    //   820: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   823: invokevirtual build : ()Landroid/media/MediaDescription;
    //   826: iconst_2
    //   827: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   830: invokevirtual add : (Ljava/lang/Object;)Z
    //   833: pop
    //   834: goto -> 837
    //   837: iinc #2, -1
    //   840: goto -> 624
    //   843: aload_1
    //   844: aload #7
    //   846: invokevirtual sendResult : (Ljava/lang/Object;)V
    //   849: return
    //   850: aload #12
    //   852: aload_0
    //   853: invokevirtual equals : (Ljava/lang/Object;)Z
    //   856: ifeq -> 1703
    //   859: invokestatic k : ()Z
    //   862: ifne -> 868
    //   865: goto -> 1696
    //   868: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   871: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   874: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   877: astore_0
    //   878: iload #4
    //   880: istore_2
    //   881: invokestatic o : ()Landroid/content/SharedPreferences;
    //   884: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   887: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   890: ldc_w 2131886711
    //   893: invokevirtual getString : (I)Ljava/lang/String;
    //   896: iconst_1
    //   897: invokestatic valueOf : (I)Ljava/lang/String;
    //   900: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   905: invokestatic parseInt : (Ljava/lang/String;)I
    //   908: iconst_1
    //   909: if_icmpne -> 914
    //   912: iconst_1
    //   913: istore_2
    //   914: new android/media/MediaDescription$Builder
    //   917: dup
    //   918: invokespecial <init> : ()V
    //   921: ldc_w 'musicolet.media.r.2'
    //   924: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   927: astore #13
    //   929: new java/lang/StringBuilder
    //   932: dup
    //   933: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   935: invokespecial <init> : (Ljava/lang/String;)V
    //   938: astore #12
    //   940: aload #12
    //   942: aload_0
    //   943: ldc_w 2131231398
    //   946: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   949: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: pop
    //   953: aload #7
    //   955: new android/media/browse/MediaBrowser$MediaItem
    //   958: dup
    //   959: aload #13
    //   961: aload #12
    //   963: invokevirtual toString : ()Ljava/lang/String;
    //   966: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   969: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   972: aload_0
    //   973: ldc_w 2131887387
    //   976: invokevirtual getString : (I)Ljava/lang/String;
    //   979: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   982: aload_0
    //   983: ldc_w 2131886162
    //   986: invokevirtual getString : (I)Ljava/lang/String;
    //   989: invokevirtual setSubtitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   992: aload #10
    //   994: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   997: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1000: iconst_2
    //   1001: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1004: invokevirtual add : (Ljava/lang/Object;)Z
    //   1007: pop
    //   1008: iload_2
    //   1009: ifeq -> 1098
    //   1012: new android/media/MediaDescription$Builder
    //   1015: dup
    //   1016: invokespecial <init> : ()V
    //   1019: ldc_w 'musicolet.media.r.13_d_'
    //   1022: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1025: aload #11
    //   1027: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1030: astore #10
    //   1032: new java/lang/StringBuilder
    //   1035: dup
    //   1036: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1038: invokespecial <init> : (Ljava/lang/String;)V
    //   1041: astore #9
    //   1043: aload #9
    //   1045: aload_0
    //   1046: ldc_w 2131231144
    //   1049: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1052: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: pop
    //   1056: aload #7
    //   1058: new android/media/browse/MediaBrowser$MediaItem
    //   1061: dup
    //   1062: aload #10
    //   1064: aload #9
    //   1066: invokevirtual toString : ()Ljava/lang/String;
    //   1069: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1072: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1075: aload_0
    //   1076: ldc 2131886603
    //   1078: invokevirtual getString : (I)Ljava/lang/String;
    //   1081: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1084: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1087: iconst_1
    //   1088: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1091: invokevirtual add : (Ljava/lang/Object;)Z
    //   1094: pop
    //   1095: goto -> 1181
    //   1098: new android/media/MediaDescription$Builder
    //   1101: dup
    //   1102: invokespecial <init> : ()V
    //   1105: ldc_w 'musicolet.media.r.10'
    //   1108: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1111: aload #9
    //   1113: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1116: astore #10
    //   1118: new java/lang/StringBuilder
    //   1121: dup
    //   1122: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1124: invokespecial <init> : (Ljava/lang/String;)V
    //   1127: astore #9
    //   1129: aload #9
    //   1131: aload_0
    //   1132: ldc_w 2131231144
    //   1135: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1141: pop
    //   1142: aload #7
    //   1144: new android/media/browse/MediaBrowser$MediaItem
    //   1147: dup
    //   1148: aload #10
    //   1150: aload #9
    //   1152: invokevirtual toString : ()Ljava/lang/String;
    //   1155: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1158: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1161: aload_0
    //   1162: ldc 2131886603
    //   1164: invokevirtual getString : (I)Ljava/lang/String;
    //   1167: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1170: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1173: iconst_1
    //   1174: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1177: invokevirtual add : (Ljava/lang/Object;)Z
    //   1180: pop
    //   1181: new android/media/MediaDescription$Builder
    //   1184: dup
    //   1185: invokespecial <init> : ()V
    //   1188: ldc_w 'musicolet.media.r.4'
    //   1191: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1194: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.f : Landroid/os/Bundle;
    //   1197: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1200: astore #9
    //   1202: new java/lang/StringBuilder
    //   1205: dup
    //   1206: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1208: invokespecial <init> : (Ljava/lang/String;)V
    //   1211: astore #10
    //   1213: aload #10
    //   1215: aload_0
    //   1216: ldc_w 2131231076
    //   1219: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1225: pop
    //   1226: aload #7
    //   1228: new android/media/browse/MediaBrowser$MediaItem
    //   1231: dup
    //   1232: aload #9
    //   1234: aload #10
    //   1236: invokevirtual toString : ()Ljava/lang/String;
    //   1239: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1242: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1245: aload_0
    //   1246: ldc_w 2131886155
    //   1249: invokevirtual getString : (I)Ljava/lang/String;
    //   1252: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1255: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1258: iconst_1
    //   1259: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1262: invokevirtual add : (Ljava/lang/Object;)Z
    //   1265: pop
    //   1266: new android/media/MediaDescription$Builder
    //   1269: dup
    //   1270: invokespecial <init> : ()V
    //   1273: ldc_w 'musicolet.media.r.5'
    //   1276: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1279: astore #10
    //   1281: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.g : Landroid/os/Bundle;
    //   1284: astore #9
    //   1286: aload #10
    //   1288: aload #9
    //   1290: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1293: astore #10
    //   1295: new java/lang/StringBuilder
    //   1298: dup
    //   1299: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1301: invokespecial <init> : (Ljava/lang/String;)V
    //   1304: astore #11
    //   1306: aload #11
    //   1308: aload_0
    //   1309: ldc_w 2131231081
    //   1312: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1318: pop
    //   1319: aload #7
    //   1321: new android/media/browse/MediaBrowser$MediaItem
    //   1324: dup
    //   1325: aload #10
    //   1327: aload #11
    //   1329: invokevirtual toString : ()Ljava/lang/String;
    //   1332: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1335: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1338: aload_0
    //   1339: ldc_w 2131886211
    //   1342: invokevirtual getString : (I)Ljava/lang/String;
    //   1345: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1348: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1351: iconst_1
    //   1352: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1355: invokevirtual add : (Ljava/lang/Object;)Z
    //   1358: pop
    //   1359: new android/media/MediaDescription$Builder
    //   1362: dup
    //   1363: invokespecial <init> : ()V
    //   1366: ldc_w 'musicolet.media.r.9'
    //   1369: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1372: aload #9
    //   1374: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1377: astore #10
    //   1379: new java/lang/StringBuilder
    //   1382: dup
    //   1383: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1385: invokespecial <init> : (Ljava/lang/String;)V
    //   1388: astore #11
    //   1390: aload #11
    //   1392: aload_0
    //   1393: ldc_w 2131231081
    //   1396: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1402: pop
    //   1403: aload #7
    //   1405: new android/media/browse/MediaBrowser$MediaItem
    //   1408: dup
    //   1409: aload #10
    //   1411: aload #11
    //   1413: invokevirtual toString : ()Ljava/lang/String;
    //   1416: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1419: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1422: aload_0
    //   1423: ldc_w 2131886154
    //   1426: invokevirtual getString : (I)Ljava/lang/String;
    //   1429: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1432: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1435: iconst_1
    //   1436: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1439: invokevirtual add : (Ljava/lang/Object;)Z
    //   1442: pop
    //   1443: new android/media/MediaDescription$Builder
    //   1446: dup
    //   1447: invokespecial <init> : ()V
    //   1450: ldc_w 'musicolet.media.r.8'
    //   1453: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1456: aload #9
    //   1458: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1461: astore #10
    //   1463: new java/lang/StringBuilder
    //   1466: dup
    //   1467: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1469: invokespecial <init> : (Ljava/lang/String;)V
    //   1472: astore #9
    //   1474: aload #9
    //   1476: aload_0
    //   1477: ldc_w 2131231081
    //   1480: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1486: pop
    //   1487: aload #7
    //   1489: new android/media/browse/MediaBrowser$MediaItem
    //   1492: dup
    //   1493: aload #10
    //   1495: aload #9
    //   1497: invokevirtual toString : ()Ljava/lang/String;
    //   1500: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1503: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1506: aload_0
    //   1507: ldc_w 2131886398
    //   1510: invokevirtual getString : (I)Ljava/lang/String;
    //   1513: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1516: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1519: iconst_1
    //   1520: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1523: invokevirtual add : (Ljava/lang/Object;)Z
    //   1526: pop
    //   1527: new android/media/MediaDescription$Builder
    //   1530: dup
    //   1531: invokespecial <init> : ()V
    //   1534: ldc_w 'musicolet.media.r.6'
    //   1537: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1540: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.h : Landroid/os/Bundle;
    //   1543: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1546: astore #9
    //   1548: new java/lang/StringBuilder
    //   1551: dup
    //   1552: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1554: invokespecial <init> : (Ljava/lang/String;)V
    //   1557: astore #10
    //   1559: aload #10
    //   1561: aload_0
    //   1562: ldc_w 2131231412
    //   1565: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1568: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1571: pop
    //   1572: aload #7
    //   1574: new android/media/browse/MediaBrowser$MediaItem
    //   1577: dup
    //   1578: aload #9
    //   1580: aload #10
    //   1582: invokevirtual toString : ()Ljava/lang/String;
    //   1585: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1588: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1591: aload_0
    //   1592: ldc_w 2131886629
    //   1595: invokevirtual getString : (I)Ljava/lang/String;
    //   1598: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1601: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1604: iconst_1
    //   1605: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1608: invokevirtual add : (Ljava/lang/Object;)Z
    //   1611: pop
    //   1612: new android/media/MediaDescription$Builder
    //   1615: dup
    //   1616: invokespecial <init> : ()V
    //   1619: getstatic org/jaudiotagger/tag/mp4/bKj/fXMDNeMWaILNVh.ioJaLz : Ljava/lang/String;
    //   1622: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1625: aload #8
    //   1627: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1630: astore #9
    //   1632: new java/lang/StringBuilder
    //   1635: dup
    //   1636: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1638: invokespecial <init> : (Ljava/lang/String;)V
    //   1641: astore #8
    //   1643: aload #8
    //   1645: aload_0
    //   1646: ldc_w 2131231077
    //   1649: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1652: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1655: pop
    //   1656: aload #7
    //   1658: new android/media/browse/MediaBrowser$MediaItem
    //   1661: dup
    //   1662: aload #9
    //   1664: aload #8
    //   1666: invokevirtual toString : ()Ljava/lang/String;
    //   1669: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1672: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1675: aload_0
    //   1676: ldc_w 2131886162
    //   1679: invokevirtual getString : (I)Ljava/lang/String;
    //   1682: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1685: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1688: iconst_1
    //   1689: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1692: invokevirtual add : (Ljava/lang/Object;)Z
    //   1695: pop
    //   1696: aload_1
    //   1697: aload #7
    //   1699: invokevirtual sendResult : (Ljava/lang/Object;)V
    //   1702: return
    //   1703: ldc_w 'musicolet.media.r.11'
    //   1706: aload_0
    //   1707: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1710: ifeq -> 1991
    //   1713: invokestatic k : ()Z
    //   1716: ifne -> 1722
    //   1719: goto -> 1984
    //   1722: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1725: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1728: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1731: invokevirtual d : ()Z
    //   1734: ifne -> 1831
    //   1737: new android/media/MediaDescription$Builder
    //   1740: dup
    //   1741: invokespecial <init> : ()V
    //   1744: ldc_w 'musicolet.media.r.12'
    //   1747: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1750: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1753: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1756: ldc_w 2131886556
    //   1759: invokevirtual getString : (I)Ljava/lang/String;
    //   1762: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1765: astore #9
    //   1767: new java/lang/StringBuilder
    //   1770: dup
    //   1771: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1773: invokespecial <init> : (Ljava/lang/String;)V
    //   1776: astore_0
    //   1777: aload_0
    //   1778: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1781: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1784: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1787: ldc_w 2131231139
    //   1790: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1796: pop
    //   1797: aload #7
    //   1799: new android/media/browse/MediaBrowser$MediaItem
    //   1802: dup
    //   1803: aload #9
    //   1805: aload_0
    //   1806: invokevirtual toString : ()Ljava/lang/String;
    //   1809: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1812: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1815: aload #8
    //   1817: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1820: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1823: iconst_1
    //   1824: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1827: invokevirtual add : (Ljava/lang/Object;)Z
    //   1830: pop
    //   1831: new java/util/ArrayList
    //   1834: dup
    //   1835: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1838: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1841: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   1844: invokespecial <init> : (Ljava/util/Collection;)V
    //   1847: astore_0
    //   1848: iload_2
    //   1849: aload_0
    //   1850: invokevirtual size : ()I
    //   1853: if_icmpge -> 1984
    //   1856: aload_0
    //   1857: iload_2
    //   1858: invokevirtual get : (I)Ljava/lang/Object;
    //   1861: checkcast java/lang/String
    //   1864: astore #9
    //   1866: new android/media/MediaDescription$Builder
    //   1869: dup
    //   1870: invokespecial <init> : ()V
    //   1873: astore #10
    //   1875: new java/lang/StringBuilder
    //   1878: dup
    //   1879: ldc_w 'musicolet.media.r.11_'
    //   1882: invokespecial <init> : (Ljava/lang/String;)V
    //   1885: astore #11
    //   1887: aload #11
    //   1889: iload_2
    //   1890: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1893: pop
    //   1894: aload #10
    //   1896: aload #11
    //   1898: invokevirtual toString : ()Ljava/lang/String;
    //   1901: invokevirtual setMediaId : (Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
    //   1904: astore #11
    //   1906: new java/lang/StringBuilder
    //   1909: dup
    //   1910: ldc 'android.resource://in.krosbits.musicolet/drawable/'
    //   1912: invokespecial <init> : (Ljava/lang/String;)V
    //   1915: astore #10
    //   1917: aload #10
    //   1919: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1922: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1925: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1928: ldc_w 2131231372
    //   1931: invokevirtual getResourceEntryName : (I)Ljava/lang/String;
    //   1934: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1937: pop
    //   1938: aload #7
    //   1940: new android/media/browse/MediaBrowser$MediaItem
    //   1943: dup
    //   1944: aload #11
    //   1946: aload #10
    //   1948: invokevirtual toString : ()Ljava/lang/String;
    //   1951: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   1954: invokevirtual setIconUri : (Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
    //   1957: aload #9
    //   1959: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
    //   1962: aload #8
    //   1964: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
    //   1967: invokevirtual build : ()Landroid/media/MediaDescription;
    //   1970: iconst_1
    //   1971: invokespecial <init> : (Landroid/media/MediaDescription;I)V
    //   1974: invokevirtual add : (Ljava/lang/Object;)Z
    //   1977: pop
    //   1978: iinc #2, 1
    //   1981: goto -> 1848
    //   1984: aload_1
    //   1985: aload #7
    //   1987: invokevirtual sendResult : (Ljava/lang/Object;)V
    //   1990: return
    //   1991: invokestatic k : ()Z
    //   1994: ifne -> 2004
    //   1997: aload_1
    //   1998: aload #7
    //   2000: invokevirtual sendResult : (Ljava/lang/Object;)V
    //   2003: return
    //   2004: aload_1
    //   2005: invokevirtual detach : ()V
    //   2008: new br0
    //   2011: dup
    //   2012: aload_0
    //   2013: aload_1
    //   2014: invokespecial <init> : (Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    //   2017: astore_0
    //   2018: getstatic ag0.a : Ljava/lang/String;
    //   2021: astore_1
    //   2022: aload_0
    //   2023: getstatic in/krosbits/musicolet/MediaBrowserServiceImpl.k : Ljava/util/concurrent/ExecutorService;
    //   2026: iconst_0
    //   2027: anewarray java/lang/Object
    //   2030: invokevirtual executeOnExecutor : (Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   2033: pop
    //   2034: return
  }
  
  public final void onCreate() {
    super.onCreate();
    b = this;
    setSessionToken(((m01)(ew0.a(getApplicationContext())).c).a.getSessionToken());
  }
  
  public final void onDestroy() {
    b = null;
    super.onDestroy();
  }
  
  public final MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle) {
    Bundle bundle = new Bundle();
    if (paramBundle != null) {
      if (paramBundle.getBoolean("android.service.media.extra.RECENT"))
        return new MediaBrowserService.BrowserRoot("musicolet.media.r.-1", null); 
      if (paramBundle.getBoolean("android.service.media.extra.SUGGESTED"))
        return new MediaBrowserService.BrowserRoot("musicolet.media.r.-1", null); 
      if (paramBundle.getBoolean("android.service.media.extra.OFFLINE"))
        return new MediaBrowserService.BrowserRoot("musicolet.media.r.-1", null); 
    } 
    bundle.putBoolean("android.media.browse.AUTO_TABS_OPT_IN_HINT", true);
    bundle.putLong("android.media.extra.BT_FOLDER_TYPE", 0L);
    bundle.putInt("com.google.android.music.browse.bt_folder_type_hint", 0);
    bundle.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle.putBoolean(ybWnIKHovcRr.pKqu, false);
    bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
    bundle.putInt(nFLlOYeP.DEQFCHOyyujpXA, 3);
    bundle.putInt(hbrAVtEa.ygsnLCf, 1);
    return new MediaBrowserService.BrowserRoot("musicolet.media.r.0", bundle);
  }
  
  public final void onLoadChildren(String paramString, MediaBrowserService.Result paramResult) {
    new Bundle();
    c(paramString, paramResult);
  }
  
  public final void onLoadChildren(String paramString, MediaBrowserService.Result paramResult, Bundle paramBundle) {
    c(paramString, paramResult);
  }
  
  static {
    Bundle bundle2 = new Bundle(1);
    c = bundle2;
    Bundle bundle4 = new Bundle(1);
    e = bundle4;
    Bundle bundle1 = new Bundle(1);
    f = bundle1;
    Bundle bundle6 = new Bundle(1);
    g = bundle6;
    Bundle bundle3 = new Bundle(1);
    h = bundle3;
    Bundle bundle5 = new Bundle(1);
    i = bundle5;
    Bundle bundle7 = new Bundle(1);
    j = bundle7;
    bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", 0L);
    bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", 1L);
    bundle1.putLong("android.media.extra.BT_FOLDER_TYPE", 2L);
    bundle6.putLong("android.media.extra.BT_FOLDER_TYPE", 3L);
    bundle3.putLong("android.media.extra.BT_FOLDER_TYPE", 4L);
    bundle5.putLong("android.media.extra.BT_FOLDER_TYPE", 5L);
    bundle2.putInt("com.google.android.music.browse.bt_folder_type_hint", 0);
    bundle4.putInt("com.google.android.music.browse.bt_folder_type_hint", 1);
    bundle1.putInt("com.google.android.music.browse.bt_folder_type_hint", 2);
    bundle6.putInt("com.google.android.music.browse.bt_folder_type_hint", 3);
    bundle3.putInt("com.google.android.music.browse.bt_folder_type_hint", 4);
    bundle5.putInt("com.google.android.music.browse.bt_folder_type_hint", 5);
    bundle2.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle4.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle1.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle6.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle3.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle5.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 7);
    bundle7.putInt("com.google.android.music.mediasession.extra.MEDIA_ITEM_TYPE", 0);
    bundle1.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MediaBrowserServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */