import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class x90 {
  public static final vp0 a = new vp0(2);
  
  public static final w00 b = new w00(3);
  
  public static i80 a(Context paramContext, List<y90> paramList) {
    Trace.beginSection(ui0.p0("FontProvider.getFontFamilyResult"));
    try {
      ArrayList<ha0[]> arrayList = new ArrayList();
      this();
      for (byte b = 0; b < paramList.size(); b++) {
        i80 i801;
        y90 y90 = paramList.get(b);
        if (Build.VERSION.SDK_INT >= 31) {
          String str = y90.e;
          Typeface typeface = sz1.c(str);
          if (typeface != null && sz1.d(typeface) != null) {
            ha0 ha0 = new ha0();
            this(str, y90.f);
            arrayList.add(new ha0[] { ha0 });
            continue;
          } 
        } 
        ProviderInfo providerInfo = b(paramContext.getPackageManager(), y90, paramContext.getResources());
        if (providerInfo == null) {
          i801 = new i80();
          super();
          i801.a = 1;
          i801.b = Collections.singletonList(null);
          return i801;
        } 
        arrayList.add(c((Context)i801, y90, providerInfo.authority));
        continue;
      } 
      i80 i80 = new i80();
      super();
      i80.a = 0;
      i80.b = arrayList;
      return i80;
    } finally {
      Trace.endSection();
    } 
  }
  
  public static ProviderInfo b(PackageManager paramPackageManager, y90 paramy90, Resources paramResources) {
    w00 w001 = b;
    vp0 vp01 = a;
    Trace.beginSection(ui0.p0("FontProvider.getProvider"));
    try {
      List<Collection<? extends E>> list;
      ArrayList<?> arrayList;
      List list1 = paramy90.d;
      String str1 = paramy90.a;
      String str2 = paramy90.b;
      if (list1 != null) {
        list = list1;
      } else {
        list = z51.G(paramResources, 0);
      } 
      w90 w90 = new w90();
      super();
      w90.a = str1;
      w90.b = str2;
      w90.c = list;
      ProviderInfo providerInfo = (ProviderInfo)vp01.f(w90);
      if (providerInfo != null)
        return providerInfo; 
      providerInfo = paramPackageManager.resolveContentProvider(str1, 0);
      if (providerInfo != null) {
        if (providerInfo.packageName.equals(str2)) {
          Signature[] arrayOfSignature = (paramPackageManager.getPackageInfo(providerInfo.packageName, 64)).signatures;
          ArrayList<byte[]> arrayList1 = new ArrayList();
          this();
          int i = arrayOfSignature.length;
          byte b;
          for (b = 0; b < i; b++)
            arrayList1.add(arrayOfSignature[b].toByteArray()); 
          Collections.sort(arrayList1, w001);
          b = 0;
          label38: while (b < list.size()) {
            arrayList = new ArrayList();
            this(list.get(b));
            Collections.sort(arrayList, w001);
            if (arrayList1.size() != arrayList.size())
              continue; 
            for (i = 0; i < arrayList1.size(); i++) {
              if (!Arrays.equals(arrayList1.get(i), (byte[])arrayList.get(i))) {
                b++;
                continue label38;
              } 
            } 
            vp01.j(w90, providerInfo);
            Trace.endSection();
            return providerInfo;
          } 
          return null;
        } 
        PackageManager.NameNotFoundException nameNotFoundException1 = new PackageManager.NameNotFoundException();
        StringBuilder stringBuilder1 = new StringBuilder();
        this("Found content provider ");
        stringBuilder1.append((String)arrayList);
        stringBuilder1.append(ybWnIKHovcRr.wdylIOAOqCfvMvh);
        stringBuilder1.append(str2);
        this(stringBuilder1.toString());
        throw nameNotFoundException1;
      } 
      PackageManager.NameNotFoundException nameNotFoundException = new PackageManager.NameNotFoundException();
      StringBuilder stringBuilder = new StringBuilder();
      this("No package found for authority: ");
      stringBuilder.append((String)arrayList);
      this(stringBuilder.toString());
      throw nameNotFoundException;
    } finally {
      Trace.endSection();
    } 
  }
  
  public static ha0[] c(Context paramContext, y90 paramy90, String paramString) {
    // Byte code:
    //   0: ldc 'FontProvider.query'
    //   2: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5: invokestatic beginSection : (Ljava/lang/String;)V
    //   8: new java/util/ArrayList
    //   11: astore #14
    //   13: aload #14
    //   15: invokespecial <init> : ()V
    //   18: new android/net/Uri$Builder
    //   21: astore #13
    //   23: aload #13
    //   25: invokespecial <init> : ()V
    //   28: aload #13
    //   30: ldc 'content'
    //   32: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   35: aload_2
    //   36: invokevirtual authority : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   39: invokevirtual build : ()Landroid/net/Uri;
    //   42: astore #15
    //   44: new android/net/Uri$Builder
    //   47: astore #13
    //   49: aload #13
    //   51: invokespecial <init> : ()V
    //   54: aload #13
    //   56: ldc 'content'
    //   58: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   61: aload_2
    //   62: invokevirtual authority : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   65: ldc 'file'
    //   67: invokevirtual appendPath : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   70: invokevirtual build : ()Landroid/net/Uri;
    //   73: astore #17
    //   75: aload_0
    //   76: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   79: aload #15
    //   81: invokevirtual acquireUnstableContentProviderClient : (Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   84: astore #16
    //   86: aconst_null
    //   87: astore_0
    //   88: aconst_null
    //   89: astore #13
    //   91: aload_0
    //   92: astore_2
    //   93: ldc_w 'ContentQueryWrapper.query'
    //   96: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   99: invokestatic beginSection : (Ljava/lang/String;)V
    //   102: aload_1
    //   103: getfield c : Ljava/lang/String;
    //   106: astore_2
    //   107: aload #16
    //   109: ifnonnull -> 118
    //   112: aload #13
    //   114: astore_0
    //   115: goto -> 207
    //   118: aload #16
    //   120: aload #15
    //   122: bipush #7
    //   124: anewarray java/lang/String
    //   127: dup
    //   128: iconst_0
    //   129: ldc_w '_id'
    //   132: aastore
    //   133: dup
    //   134: iconst_1
    //   135: ldc_w 'file_id'
    //   138: aastore
    //   139: dup
    //   140: iconst_2
    //   141: ldc_w 'font_ttc_index'
    //   144: aastore
    //   145: dup
    //   146: iconst_3
    //   147: ldc_w 'font_variation_settings'
    //   150: aastore
    //   151: dup
    //   152: iconst_4
    //   153: ldc_w 'font_weight'
    //   156: aastore
    //   157: dup
    //   158: iconst_5
    //   159: ldc_w 'font_italic'
    //   162: aastore
    //   163: dup
    //   164: bipush #6
    //   166: ldc_w 'result_code'
    //   169: aastore
    //   170: ldc_w 'query = ?'
    //   173: iconst_1
    //   174: anewarray java/lang/String
    //   177: dup
    //   178: iconst_0
    //   179: aload_2
    //   180: aastore
    //   181: aconst_null
    //   182: aconst_null
    //   183: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   186: astore_2
    //   187: aload_2
    //   188: astore_0
    //   189: goto -> 207
    //   192: astore_2
    //   193: ldc_w 'FontsProvider'
    //   196: ldc_w 'Unable to query the content provider'
    //   199: aload_2
    //   200: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   203: pop
    //   204: aload #13
    //   206: astore_0
    //   207: aload_0
    //   208: astore_2
    //   209: invokestatic endSection : ()V
    //   212: aload #14
    //   214: astore #13
    //   216: aload_0
    //   217: ifnull -> 545
    //   220: aload_0
    //   221: astore_2
    //   222: aload #14
    //   224: astore #13
    //   226: aload_0
    //   227: invokeinterface getCount : ()I
    //   232: ifle -> 545
    //   235: aload_0
    //   236: astore_2
    //   237: aload_0
    //   238: ldc_w 'result_code'
    //   241: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   246: istore #8
    //   248: aload_0
    //   249: astore_2
    //   250: new java/util/ArrayList
    //   253: astore #14
    //   255: aload_0
    //   256: astore_2
    //   257: aload #14
    //   259: invokespecial <init> : ()V
    //   262: aload_0
    //   263: astore_2
    //   264: aload_0
    //   265: ldc_w '_id'
    //   268: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   273: istore #11
    //   275: aload_0
    //   276: astore_2
    //   277: aload_0
    //   278: ldc_w 'file_id'
    //   281: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   286: istore #10
    //   288: aload_0
    //   289: astore_2
    //   290: aload_0
    //   291: ldc_w 'font_ttc_index'
    //   294: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   299: istore #7
    //   301: aload_0
    //   302: astore_2
    //   303: aload_0
    //   304: ldc_w 'font_weight'
    //   307: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   312: istore #9
    //   314: aload_0
    //   315: astore_2
    //   316: aload_0
    //   317: ldc_w 'font_italic'
    //   320: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   325: istore #6
    //   327: aload_0
    //   328: astore_2
    //   329: aload_0
    //   330: invokeinterface moveToNext : ()Z
    //   335: ifeq -> 541
    //   338: iload #8
    //   340: iconst_m1
    //   341: if_icmpeq -> 362
    //   344: aload_0
    //   345: astore_2
    //   346: aload_0
    //   347: iload #8
    //   349: invokeinterface getInt : (I)I
    //   354: istore_3
    //   355: goto -> 364
    //   358: astore_0
    //   359: goto -> 593
    //   362: iconst_0
    //   363: istore_3
    //   364: iload #7
    //   366: iconst_m1
    //   367: if_icmpeq -> 385
    //   370: aload_0
    //   371: astore_2
    //   372: aload_0
    //   373: iload #7
    //   375: invokeinterface getInt : (I)I
    //   380: istore #4
    //   382: goto -> 388
    //   385: iconst_0
    //   386: istore #4
    //   388: iload #10
    //   390: iconst_m1
    //   391: if_icmpne -> 414
    //   394: aload_0
    //   395: astore_2
    //   396: aload #15
    //   398: aload_0
    //   399: iload #11
    //   401: invokeinterface getLong : (I)J
    //   406: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   409: astore #13
    //   411: goto -> 434
    //   414: aload_0
    //   415: astore_2
    //   416: aload #17
    //   418: aload_0
    //   419: iload #10
    //   421: invokeinterface getLong : (I)J
    //   426: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   429: astore #13
    //   431: goto -> 411
    //   434: iload #9
    //   436: iconst_m1
    //   437: if_icmpeq -> 455
    //   440: aload_0
    //   441: astore_2
    //   442: aload_0
    //   443: iload #9
    //   445: invokeinterface getInt : (I)I
    //   450: istore #5
    //   452: goto -> 463
    //   455: sipush #400
    //   458: istore #5
    //   460: goto -> 452
    //   463: iload #6
    //   465: iconst_m1
    //   466: if_icmpeq -> 489
    //   469: aload_0
    //   470: astore_2
    //   471: aload_0
    //   472: iload #6
    //   474: invokeinterface getInt : (I)I
    //   479: iconst_1
    //   480: if_icmpne -> 489
    //   483: iconst_1
    //   484: istore #12
    //   486: goto -> 495
    //   489: iconst_0
    //   490: istore #12
    //   492: goto -> 486
    //   495: aload_0
    //   496: astore_2
    //   497: aload_1
    //   498: getfield f : Ljava/lang/String;
    //   501: astore #18
    //   503: aload_0
    //   504: astore_2
    //   505: new ha0
    //   508: astore #19
    //   510: aload_0
    //   511: astore_2
    //   512: aload #19
    //   514: aload #13
    //   516: iload #4
    //   518: iload #5
    //   520: iload #12
    //   522: aload #18
    //   524: iload_3
    //   525: invokespecial <init> : (Landroid/net/Uri;IIZLjava/lang/String;I)V
    //   528: aload_0
    //   529: astore_2
    //   530: aload #14
    //   532: aload #19
    //   534: invokevirtual add : (Ljava/lang/Object;)Z
    //   537: pop
    //   538: goto -> 327
    //   541: aload #14
    //   543: astore #13
    //   545: aload_0
    //   546: ifnull -> 555
    //   549: aload_0
    //   550: invokeinterface close : ()V
    //   555: aload #16
    //   557: ifnull -> 565
    //   560: aload #16
    //   562: invokevirtual close : ()V
    //   565: aload #13
    //   567: iconst_0
    //   568: anewarray ha0
    //   571: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   574: checkcast [Lha0;
    //   577: astore_0
    //   578: invokestatic endSection : ()V
    //   581: aload_0
    //   582: areturn
    //   583: astore_1
    //   584: aload_0
    //   585: astore_2
    //   586: invokestatic endSection : ()V
    //   589: aload_0
    //   590: astore_2
    //   591: aload_1
    //   592: athrow
    //   593: aload_2
    //   594: ifnull -> 603
    //   597: aload_2
    //   598: invokeinterface close : ()V
    //   603: aload #16
    //   605: ifnull -> 613
    //   608: aload #16
    //   610: invokevirtual close : ()V
    //   613: aload_0
    //   614: athrow
    //   615: astore_0
    //   616: invokestatic endSection : ()V
    //   619: aload_0
    //   620: athrow
    // Exception table:
    //   from	to	target	type
    //   8	86	615	finally
    //   93	102	358	finally
    //   102	107	583	finally
    //   118	187	192	android/os/RemoteException
    //   118	187	583	finally
    //   193	204	583	finally
    //   209	212	358	finally
    //   226	235	358	finally
    //   237	248	358	finally
    //   250	255	358	finally
    //   257	262	358	finally
    //   264	275	358	finally
    //   277	288	358	finally
    //   290	301	358	finally
    //   303	314	358	finally
    //   316	327	358	finally
    //   329	338	358	finally
    //   346	355	358	finally
    //   372	382	358	finally
    //   396	411	358	finally
    //   416	431	358	finally
    //   442	452	358	finally
    //   471	483	358	finally
    //   497	503	358	finally
    //   505	510	358	finally
    //   512	528	358	finally
    //   530	538	358	finally
    //   549	555	615	finally
    //   560	565	615	finally
    //   565	578	615	finally
    //   586	589	358	finally
    //   591	593	358	finally
    //   597	603	615	finally
    //   608	613	615	finally
    //   613	615	615	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */