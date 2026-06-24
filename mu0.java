import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

public final class mu0 extends AsyncTask {
  public final Bitmap a;
  
  public final Uri b;
  
  public int c;
  
  public long d;
  
  public final qu0 e;
  
  public mu0(qu0 paramqu0) {
    Uri uri;
    Bitmap bitmap1;
    MediaDescriptionCompat mediaDescriptionCompat2 = paramqu0.Y;
    MediaDescriptionCompat mediaDescriptionCompat3 = null;
    if (mediaDescriptionCompat2 == null) {
      mediaDescriptionCompat2 = null;
    } else {
      bitmap1 = mediaDescriptionCompat2.g;
    } 
    Bitmap bitmap2 = bitmap1;
    if (bitmap1 != null) {
      bitmap2 = bitmap1;
      if (bitmap1.isRecycled()) {
        Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
        bitmap2 = null;
      } 
    } 
    this.a = bitmap2;
    MediaDescriptionCompat mediaDescriptionCompat1 = paramqu0.Y;
    if (mediaDescriptionCompat1 == null) {
      mediaDescriptionCompat1 = mediaDescriptionCompat3;
    } else {
      uri = mediaDescriptionCompat1.h;
    } 
    this.b = uri;
  }
  
  public final BufferedInputStream a(Uri paramUri) {
    InputStream inputStream;
    String str = paramUri.getScheme().toLowerCase();
    if ("android.resource".equals(str) || "content".equals(str) || "file".equals(str)) {
      inputStream = this.e.m.getContentResolver().openInputStream(paramUri);
    } else {
      URLConnection uRLConnection = (new URL(inputStream.toString())).openConnection();
      int i = qu0.s0;
      uRLConnection.setConnectTimeout(i);
      uRLConnection.setReadTimeout(i);
      inputStream = uRLConnection.getInputStream();
    } 
    return (inputStream == null) ? null : new BufferedInputStream(inputStream);
  }
  
  public final Object doInBackground(Object[] paramArrayOfObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast [Ljava/lang/Void;
    //   4: astore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: aconst_null
    //   8: astore #7
    //   10: aconst_null
    //   11: astore_1
    //   12: aload_0
    //   13: getfield a : Landroid/graphics/Bitmap;
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 29
    //   23: aload #4
    //   25: astore_1
    //   26: goto -> 542
    //   29: aload_0
    //   30: getfield b : Landroid/net/Uri;
    //   33: astore #8
    //   35: aload #8
    //   37: ifnull -> 540
    //   40: aload_0
    //   41: aload #8
    //   43: invokevirtual a : (Landroid/net/Uri;)Ljava/io/BufferedInputStream;
    //   46: astore #4
    //   48: aload #4
    //   50: ifnonnull -> 134
    //   53: aload #4
    //   55: astore_1
    //   56: aload #4
    //   58: astore #5
    //   60: new java/lang/StringBuilder
    //   63: astore #6
    //   65: aload #4
    //   67: astore_1
    //   68: aload #4
    //   70: astore #5
    //   72: aload #6
    //   74: ldc 'Unable to open: '
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: aload #4
    //   81: astore_1
    //   82: aload #4
    //   84: astore #5
    //   86: aload #6
    //   88: aload #8
    //   90: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload #4
    //   96: astore_1
    //   97: aload #4
    //   99: astore #5
    //   101: ldc 'MediaRouteCtrlDialog'
    //   103: aload #6
    //   105: invokevirtual toString : ()Ljava/lang/String;
    //   108: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   111: pop
    //   112: aload #4
    //   114: ifnull -> 122
    //   117: aload #4
    //   119: invokevirtual close : ()V
    //   122: aconst_null
    //   123: areturn
    //   124: astore #4
    //   126: goto -> 529
    //   129: astore #4
    //   131: goto -> 471
    //   134: aload #4
    //   136: astore_1
    //   137: aload #4
    //   139: astore #5
    //   141: new android/graphics/BitmapFactory$Options
    //   144: astore #9
    //   146: aload #4
    //   148: astore_1
    //   149: aload #4
    //   151: astore #5
    //   153: aload #9
    //   155: invokespecial <init> : ()V
    //   158: aload #4
    //   160: astore_1
    //   161: aload #4
    //   163: astore #5
    //   165: aload #9
    //   167: iconst_1
    //   168: putfield inJustDecodeBounds : Z
    //   171: aload #4
    //   173: astore_1
    //   174: aload #4
    //   176: astore #5
    //   178: aload #4
    //   180: aconst_null
    //   181: aload #9
    //   183: invokestatic decodeStream : (Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   186: pop
    //   187: aload #4
    //   189: astore_1
    //   190: aload #4
    //   192: astore #5
    //   194: aload #9
    //   196: getfield outWidth : I
    //   199: ifeq -> 117
    //   202: aload #4
    //   204: astore_1
    //   205: aload #4
    //   207: astore #5
    //   209: aload #9
    //   211: getfield outHeight : I
    //   214: istore_3
    //   215: iload_3
    //   216: ifne -> 222
    //   219: goto -> 117
    //   222: aload #4
    //   224: astore_1
    //   225: aload #4
    //   227: invokevirtual reset : ()V
    //   230: goto -> 352
    //   233: astore_1
    //   234: aload #4
    //   236: astore_1
    //   237: aload #4
    //   239: astore #5
    //   241: aload #4
    //   243: invokevirtual close : ()V
    //   246: aload #4
    //   248: astore_1
    //   249: aload #4
    //   251: astore #5
    //   253: aload_0
    //   254: aload #8
    //   256: invokevirtual a : (Landroid/net/Uri;)Ljava/io/BufferedInputStream;
    //   259: astore #6
    //   261: aload #6
    //   263: astore #4
    //   265: aload #6
    //   267: ifnonnull -> 352
    //   270: aload #6
    //   272: astore_1
    //   273: aload #6
    //   275: astore #5
    //   277: new java/lang/StringBuilder
    //   280: astore #4
    //   282: aload #6
    //   284: astore_1
    //   285: aload #6
    //   287: astore #5
    //   289: aload #4
    //   291: ldc 'Unable to open: '
    //   293: invokespecial <init> : (Ljava/lang/String;)V
    //   296: aload #6
    //   298: astore_1
    //   299: aload #6
    //   301: astore #5
    //   303: aload #4
    //   305: aload #8
    //   307: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload #6
    //   313: astore_1
    //   314: aload #6
    //   316: astore #5
    //   318: ldc 'MediaRouteCtrlDialog'
    //   320: aload #4
    //   322: invokevirtual toString : ()Ljava/lang/String;
    //   325: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   328: pop
    //   329: aload #7
    //   331: astore_1
    //   332: aload #6
    //   334: ifnull -> 668
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: invokevirtual close : ()V
    //   346: aload #7
    //   348: astore_1
    //   349: goto -> 668
    //   352: aload #4
    //   354: astore_1
    //   355: aload #4
    //   357: astore #5
    //   359: aload #9
    //   361: iconst_0
    //   362: putfield inJustDecodeBounds : Z
    //   365: aload #4
    //   367: astore_1
    //   368: aload #4
    //   370: astore #5
    //   372: aload_0
    //   373: getfield e : Lqu0;
    //   376: aload #9
    //   378: getfield outWidth : I
    //   381: aload #9
    //   383: getfield outHeight : I
    //   386: invokevirtual l : (II)I
    //   389: istore_3
    //   390: aload #4
    //   392: astore_1
    //   393: aload #4
    //   395: astore #5
    //   397: aload #9
    //   399: iconst_1
    //   400: aload #9
    //   402: getfield outHeight : I
    //   405: iload_3
    //   406: idiv
    //   407: invokestatic highestOneBit : (I)I
    //   410: invokestatic max : (II)I
    //   413: putfield inSampleSize : I
    //   416: aload #4
    //   418: astore_1
    //   419: aload #4
    //   421: astore #5
    //   423: aload_0
    //   424: invokevirtual isCancelled : ()Z
    //   427: ifeq -> 433
    //   430: goto -> 341
    //   433: aload #4
    //   435: astore_1
    //   436: aload #4
    //   438: astore #5
    //   440: aload #4
    //   442: aconst_null
    //   443: aload #9
    //   445: invokestatic decodeStream : (Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   448: astore #6
    //   450: aload #4
    //   452: invokevirtual close : ()V
    //   455: aload #6
    //   457: astore_1
    //   458: goto -> 542
    //   461: astore #4
    //   463: goto -> 529
    //   466: astore #4
    //   468: aconst_null
    //   469: astore #5
    //   471: aload #5
    //   473: astore_1
    //   474: new java/lang/StringBuilder
    //   477: astore #6
    //   479: aload #5
    //   481: astore_1
    //   482: aload #6
    //   484: ldc 'Unable to open: '
    //   486: invokespecial <init> : (Ljava/lang/String;)V
    //   489: aload #5
    //   491: astore_1
    //   492: aload #6
    //   494: aload #8
    //   496: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   499: pop
    //   500: aload #5
    //   502: astore_1
    //   503: ldc 'MediaRouteCtrlDialog'
    //   505: aload #6
    //   507: invokevirtual toString : ()Ljava/lang/String;
    //   510: aload #4
    //   512: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   515: pop
    //   516: aload #5
    //   518: ifnull -> 540
    //   521: aload #5
    //   523: invokevirtual close : ()V
    //   526: goto -> 540
    //   529: aload_1
    //   530: ifnull -> 537
    //   533: aload_1
    //   534: invokevirtual close : ()V
    //   537: aload #4
    //   539: athrow
    //   540: aconst_null
    //   541: astore_1
    //   542: aload_1
    //   543: ifnull -> 588
    //   546: aload_1
    //   547: invokevirtual isRecycled : ()Z
    //   550: ifeq -> 588
    //   553: new java/lang/StringBuilder
    //   556: dup
    //   557: ldc 'Can't use recycled bitmap: '
    //   559: invokespecial <init> : (Ljava/lang/String;)V
    //   562: astore #4
    //   564: aload #4
    //   566: aload_1
    //   567: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   570: pop
    //   571: ldc 'MediaRouteCtrlDialog'
    //   573: aload #4
    //   575: invokevirtual toString : ()Ljava/lang/String;
    //   578: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   581: pop
    //   582: aload #7
    //   584: astore_1
    //   585: goto -> 668
    //   588: aload_1
    //   589: ifnull -> 668
    //   592: aload_1
    //   593: invokevirtual getWidth : ()I
    //   596: aload_1
    //   597: invokevirtual getHeight : ()I
    //   600: if_icmpge -> 668
    //   603: new v51
    //   606: dup
    //   607: aload_1
    //   608: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   611: astore #4
    //   613: aload #4
    //   615: iconst_1
    //   616: putfield c : I
    //   619: aload #4
    //   621: invokevirtual a : ()Ly51;
    //   624: getfield a : Ljava/util/List;
    //   627: astore #4
    //   629: aload #4
    //   631: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   634: invokeinterface isEmpty : ()Z
    //   639: ifeq -> 645
    //   642: goto -> 663
    //   645: aload #4
    //   647: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   650: iconst_0
    //   651: invokeinterface get : (I)Ljava/lang/Object;
    //   656: checkcast x51
    //   659: getfield d : I
    //   662: istore_2
    //   663: aload_0
    //   664: iload_2
    //   665: putfield c : I
    //   668: aload_1
    //   669: areturn
    //   670: astore_1
    //   671: aload #7
    //   673: astore_1
    //   674: goto -> 668
    //   677: astore_1
    //   678: aload #6
    //   680: astore_1
    //   681: goto -> 542
    //   684: astore_1
    //   685: goto -> 540
    //   688: astore_1
    //   689: goto -> 537
    // Exception table:
    //   from	to	target	type
    //   40	48	466	java/io/IOException
    //   40	48	461	finally
    //   60	65	129	java/io/IOException
    //   60	65	124	finally
    //   72	79	129	java/io/IOException
    //   72	79	124	finally
    //   86	94	129	java/io/IOException
    //   86	94	124	finally
    //   101	112	129	java/io/IOException
    //   101	112	124	finally
    //   117	122	670	java/io/IOException
    //   141	146	129	java/io/IOException
    //   141	146	124	finally
    //   153	158	129	java/io/IOException
    //   153	158	124	finally
    //   165	171	129	java/io/IOException
    //   165	171	124	finally
    //   178	187	129	java/io/IOException
    //   178	187	124	finally
    //   194	202	129	java/io/IOException
    //   194	202	124	finally
    //   209	215	129	java/io/IOException
    //   209	215	124	finally
    //   225	230	233	java/io/IOException
    //   225	230	124	finally
    //   241	246	129	java/io/IOException
    //   241	246	124	finally
    //   253	261	129	java/io/IOException
    //   253	261	124	finally
    //   277	282	129	java/io/IOException
    //   277	282	124	finally
    //   289	296	129	java/io/IOException
    //   289	296	124	finally
    //   303	311	129	java/io/IOException
    //   303	311	124	finally
    //   318	329	129	java/io/IOException
    //   318	329	124	finally
    //   341	346	670	java/io/IOException
    //   359	365	129	java/io/IOException
    //   359	365	124	finally
    //   372	390	129	java/io/IOException
    //   372	390	124	finally
    //   397	416	129	java/io/IOException
    //   397	416	124	finally
    //   423	430	129	java/io/IOException
    //   423	430	124	finally
    //   440	450	129	java/io/IOException
    //   440	450	124	finally
    //   450	455	677	java/io/IOException
    //   474	479	124	finally
    //   482	489	124	finally
    //   492	500	124	finally
    //   503	516	124	finally
    //   521	526	684	java/io/IOException
    //   533	537	688	java/io/IOException
  }
  
  public final void onPostExecute(Object paramObject) {
    paramObject = paramObject;
    qu0 qu01 = this.e;
    qu01.Z = null;
    Bitmap bitmap2 = qu01.a0;
    Bitmap bitmap1 = this.a;
    boolean bool = Objects.equals(bitmap2, bitmap1);
    Uri uri = this.b;
    if (!bool || !Objects.equals(qu01.b0, uri)) {
      qu01.a0 = bitmap1;
      qu01.d0 = (Bitmap)paramObject;
      qu01.b0 = uri;
      qu01.e0 = this.c;
      bool = true;
      qu01.c0 = true;
      if (SystemClock.uptimeMillis() - this.d <= 120L)
        bool = false; 
      qu01.q(bool);
      return;
    } 
  }
  
  public final void onPreExecute() {
    this.d = SystemClock.uptimeMillis();
    qu0 qu01 = this.e;
    qu01.c0 = false;
    qu01.d0 = null;
    qu01.e0 = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */