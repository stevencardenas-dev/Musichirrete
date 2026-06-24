import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.providers.AAProvider;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.HashMap;

public abstract class p3 {
  public static final HashMap a = new HashMap<Object, Object>(0);
  
  public static boolean b = false;
  
  public static int c = 0;
  
  public static File d = null;
  
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2) {
    int j = 1;
    boolean bool = true;
    int i = j;
    if (paramInt2 != 0)
      if (paramInt1 == 0) {
        i = j;
      } else {
        int m = paramOptions.outHeight;
        int k = paramOptions.outWidth;
        if (m <= paramInt2) {
          i = j;
          if (k > paramInt1) {
            j = m / 2;
            k /= 2;
          } 
          return i;
        } 
        j = m / 2;
        k /= 2;
      }  
    return i;
  }
  
  public static Bitmap b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 != 0 && paramInt1 != 0) {
      BitmapFactory.Options options = new BitmapFactory.Options();
      options.inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray(paramArrayOfbyte, 0, paramArrayOfbyte.length, options);
      options.inSampleSize = a(options, paramInt1, paramInt2);
      options.inJustDecodeBounds = false;
      return BitmapFactory.decodeByteArray(paramArrayOfbyte, 0, paramArrayOfbyte.length, options);
    } 
    return BitmapFactory.decodeByteArray(paramArrayOfbyte, 0, paramArrayOfbyte.length, null);
  }
  
  public static Bitmap c(Resources paramResources, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 0 || paramInt2 == 0) {
      BitmapFactory.Options options = new BitmapFactory.Options();
      options.inJustDecodeBounds = true;
      BitmapFactory.decodeResource(paramResources, paramInt1, options);
      options.inSampleSize = a(options, paramInt2, paramInt3);
      options.inJustDecodeBounds = false;
      return BitmapFactory.decodeResource(paramResources, paramInt1, options);
    } 
    return BitmapFactory.decodeResource(paramResources, paramInt1, null);
  }
  
  public static ParcelFileDescriptor d(v00 paramv00, int paramInt1, int paramInt2) {
    HashMap<String, Pair> hashMap = a;
    Pair pair = null;
    Object object = null;
    try {
      lm0 lm0 = MyApplication.j.c;
      wo wo = new wo();
      this(paramv00.j().toString(), null);
      km0 km0 = lm0.b(wo);
    } finally {
      Object object1;
      paramv00 = null;
    } 
    paramv00 = null;
  }
  
  public static v00 e(v00 paramv00, String paramString) {
    if (paramv00 instanceof lw0)
      ((lw0)paramv00).m = 0; 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString);
    stringBuilder2.append(".jpg");
    v00 v001 = paramv00.A(stringBuilder2.toString());
    if (v001.l())
      return v001; 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(paramString);
    stringBuilder1.append(".png");
    paramv00 = paramv00.A(stringBuilder1.toString());
    return paramv00.l() ? paramv00 : null;
  }
  
  public static v00 f(v00 paramv00) {
    if (paramv00 instanceof lw0)
      ((lw0)paramv00).m = 0; 
    v00 v001 = paramv00.A("folder.jpg");
    if (v001.l())
      return v001; 
    v001 = paramv00.A("cover.jpg");
    if (v001.l())
      return v001; 
    v001 = paramv00.A("front.jpg");
    if (v001.l())
      return v001; 
    v001 = paramv00.A("AlbumArt.jpg");
    if (v001.l())
      return v001; 
    v001 = paramv00.A("folder.png");
    if (v001.l())
      return v001; 
    v001 = paramv00.A("cover.png");
    if (v001.l())
      return v001; 
    if (paramv00 instanceof ww1) {
      v001 = paramv00.A("Folder.jpg");
      if (v001.l())
        return v001; 
      v001 = paramv00.A("Cover.jpg");
      if (v001.l())
        return v001; 
      v001 = paramv00.A("Front.jpg");
      if (v001.l())
        return v001; 
      v001 = paramv00.A("Folder.png");
      if (v001.l())
        return v001; 
      v001 = paramv00.A("Cover.png");
      if (v001.l())
        return v001; 
    } 
    paramv00 = paramv00.A("AlbumArtSmall.jpg");
    return paramv00.l() ? paramv00 : ((Build.VERSION.SDK_INT >= 30) ? lw0.q : null);
  }
  
  public static Bitmap g(Context paramContext, v00 paramv00, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic p3.b : Z
    //   3: ifne -> 20
    //   6: iload #5
    //   8: ifeq -> 14
    //   11: goto -> 20
    //   14: aconst_null
    //   15: astore #6
    //   17: goto -> 110
    //   20: aload_1
    //   21: invokestatic j : (Lu00;)[B
    //   24: astore #6
    //   26: aload #6
    //   28: ifnull -> 50
    //   31: aload #6
    //   33: iload_2
    //   34: iload_3
    //   35: invokestatic b : ([BII)Landroid/graphics/Bitmap;
    //   38: astore #7
    //   40: goto -> 53
    //   43: astore #6
    //   45: aload #6
    //   47: invokevirtual printStackTrace : ()V
    //   50: aconst_null
    //   51: astore #7
    //   53: aload #7
    //   55: astore #6
    //   57: aload #7
    //   59: ifnonnull -> 110
    //   62: aload #7
    //   64: astore #6
    //   66: getstatic p3.c : I
    //   69: ifeq -> 110
    //   72: aload_1
    //   73: iload_2
    //   74: iload_3
    //   75: invokestatic d : (Lv00;II)Landroid/os/ParcelFileDescriptor;
    //   78: astore_1
    //   79: aload_1
    //   80: ifnull -> 14
    //   83: aload_1
    //   84: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   87: iload_2
    //   88: iload_3
    //   89: invokestatic o : (Ljava/io/FileDescriptor;II)Landroid/graphics/Bitmap;
    //   92: astore #6
    //   94: aload_1
    //   95: invokevirtual close : ()V
    //   98: goto -> 110
    //   101: astore #6
    //   103: aload_1
    //   104: invokevirtual close : ()V
    //   107: goto -> 14
    //   110: aload #6
    //   112: astore_1
    //   113: aload #6
    //   115: ifnonnull -> 167
    //   118: aload #6
    //   120: astore_1
    //   121: iload #4
    //   123: iconst_m1
    //   124: if_icmpeq -> 167
    //   127: aload_0
    //   128: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   131: iload #4
    //   133: iload_2
    //   134: iload_3
    //   135: invokestatic c : (Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;
    //   138: astore_1
    //   139: goto -> 167
    //   142: astore_0
    //   143: goto -> 150
    //   146: astore_0
    //   147: goto -> 160
    //   150: aload_0
    //   151: invokevirtual printStackTrace : ()V
    //   154: aload #6
    //   156: astore_1
    //   157: goto -> 167
    //   160: aload_0
    //   161: invokevirtual printStackTrace : ()V
    //   164: aload #6
    //   166: astore_1
    //   167: aload_1
    //   168: ifnonnull -> 173
    //   171: aconst_null
    //   172: areturn
    //   173: aload_1
    //   174: areturn
    //   175: astore_1
    //   176: goto -> 14
    //   179: astore_1
    //   180: goto -> 110
    // Exception table:
    //   from	to	target	type
    //   20	26	43	finally
    //   31	40	43	finally
    //   72	79	175	finally
    //   83	94	101	finally
    //   94	98	179	finally
    //   103	107	175	finally
    //   127	139	146	java/lang/OutOfMemoryError
    //   127	139	142	finally
  }
  
  public static Bitmap h(Context paramContext, km0 paramkm0, int paramInt1, int paramInt2, int paramInt3) {
    return (paramkm0 != null) ? g(paramContext, paramkm0.d(), paramInt1, paramInt2, paramInt3, false) : null;
  }
  
  public static ParcelFileDescriptor i(v00 paramv00, int paramInt, boolean paramBoolean) {
    ParcelFileDescriptor parcelFileDescriptor2;
    boolean bool = b;
    byte[] arrayOfByte = null;
    ParcelFileDescriptor[] arrayOfParcelFileDescriptor = null;
    if (bool || paramBoolean) {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor2;
      try {
        arrayOfByte = j(paramv00);
      } finally {
        arrayOfByte = null;
        arrayOfByte.printStackTrace();
      } 
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor1 = arrayOfParcelFileDescriptor2;
      if (arrayOfParcelFileDescriptor2 == null) {
        arrayOfParcelFileDescriptor1 = arrayOfParcelFileDescriptor2;
        if (c != 0)
          parcelFileDescriptor2 = d(paramv00, 0, 0); 
      } 
    } 
    ParcelFileDescriptor parcelFileDescriptor1 = parcelFileDescriptor2;
    if (parcelFileDescriptor2 == null)
      try {
        parcelFileDescriptor1 = k(paramInt);
      } catch (OutOfMemoryError outOfMemoryError) {
      
      } finally {
        parcelFileDescriptor1 = null;
        parcelFileDescriptor1.printStackTrace();
      }  
    return parcelFileDescriptor1;
  }
  
  public static byte[] j(u00 paramu00) {
    // Byte code:
    //   0: new wh
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Lu00;)V
    //   8: astore #9
    //   10: aload #9
    //   12: getfield e : Ld02;
    //   15: astore #10
    //   17: aconst_null
    //   18: astore #8
    //   20: aconst_null
    //   21: astore #7
    //   23: aload #9
    //   25: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   28: astore #4
    //   30: goto -> 47
    //   33: astore #4
    //   35: aload #9
    //   37: invokevirtual q : ()V
    //   40: aload #9
    //   42: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   45: astore #4
    //   47: aload #4
    //   49: invokevirtual getTag : ()Lorg/jaudiotagger/tag/Tag;
    //   52: astore #5
    //   54: aload #7
    //   56: astore #4
    //   58: aload #5
    //   60: ifnull -> 103
    //   63: aload #5
    //   65: invokeinterface getFirstArtwork : ()Lorg/jaudiotagger/tag/images/Artwork;
    //   70: astore #5
    //   72: aload #7
    //   74: astore #4
    //   76: aload #5
    //   78: ifnull -> 103
    //   81: aload #5
    //   83: invokeinterface getBinaryData : ()[B
    //   88: astore #5
    //   90: aload #7
    //   92: astore #4
    //   94: aload #5
    //   96: ifnull -> 103
    //   99: aload #5
    //   101: astore #4
    //   103: aload #9
    //   105: invokevirtual p : ()V
    //   108: goto -> 391
    //   111: astore #4
    //   113: aload #9
    //   115: invokevirtual q : ()V
    //   118: aload #10
    //   120: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   123: astore #4
    //   125: new android/media/MediaMetadataRetriever
    //   128: astore #5
    //   130: aload #5
    //   132: invokespecial <init> : ()V
    //   135: aload #5
    //   137: aload #4
    //   139: invokevirtual setDataSource : (Ljava/io/FileDescriptor;)V
    //   142: aload #5
    //   144: invokevirtual getEmbeddedPicture : ()[B
    //   147: astore #4
    //   149: aload #4
    //   151: ifnull -> 157
    //   154: goto -> 160
    //   157: aconst_null
    //   158: astore #4
    //   160: aload #5
    //   162: invokevirtual release : ()V
    //   165: goto -> 239
    //   168: astore #5
    //   170: aload #5
    //   172: invokevirtual printStackTrace : ()V
    //   175: goto -> 239
    //   178: astore #6
    //   180: aload #5
    //   182: astore #4
    //   184: goto -> 221
    //   187: astore #4
    //   189: aconst_null
    //   190: astore #4
    //   192: goto -> 203
    //   195: astore #6
    //   197: aconst_null
    //   198: astore #4
    //   200: goto -> 221
    //   203: aload #4
    //   205: ifnull -> 236
    //   208: goto -> 231
    //   211: astore #4
    //   213: aload #4
    //   215: invokevirtual printStackTrace : ()V
    //   218: goto -> 236
    //   221: aload #6
    //   223: invokevirtual printStackTrace : ()V
    //   226: aload #4
    //   228: ifnull -> 236
    //   231: aload #4
    //   233: invokevirtual release : ()V
    //   236: aconst_null
    //   237: astore #4
    //   239: aload #4
    //   241: ifnonnull -> 358
    //   244: aload #9
    //   246: invokevirtual q : ()V
    //   249: aload #10
    //   251: invokevirtual getFd : ()I
    //   254: istore_1
    //   255: aload #9
    //   257: invokevirtual n : ()J
    //   260: lstore_2
    //   261: new jt1
    //   264: astore #5
    //   266: aload #5
    //   268: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   271: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   274: aload_0
    //   275: invokevirtual j : ()Landroid/net/Uri;
    //   278: bipush #8
    //   280: iload_1
    //   281: lload_2
    //   282: invokespecial <init> : (Landroid/content/Context;Landroid/net/Uri;IIJ)V
    //   285: aload #8
    //   287: astore #4
    //   289: aload #5
    //   291: astore_0
    //   292: aload #5
    //   294: getfield c : Z
    //   297: ifeq -> 329
    //   300: aload #5
    //   302: getfield b : Lin/krosbits/nativex/FDTS;
    //   305: invokevirtual i : ()[B
    //   308: astore #6
    //   310: aload #8
    //   312: astore #4
    //   314: aload #5
    //   316: astore_0
    //   317: aload #6
    //   319: ifnull -> 329
    //   322: aload #6
    //   324: astore #4
    //   326: aload #5
    //   328: astore_0
    //   329: aload_0
    //   330: invokevirtual close : ()V
    //   333: goto -> 103
    //   336: astore_0
    //   337: aconst_null
    //   338: astore_0
    //   339: aload #7
    //   341: astore #4
    //   343: aload_0
    //   344: ifnull -> 103
    //   347: aload #8
    //   349: astore #4
    //   351: goto -> 329
    //   354: astore_0
    //   355: goto -> 384
    //   358: goto -> 103
    //   361: astore_0
    //   362: aload #4
    //   364: ifnull -> 382
    //   367: aload #4
    //   369: invokevirtual release : ()V
    //   372: goto -> 382
    //   375: astore #4
    //   377: aload #4
    //   379: invokevirtual printStackTrace : ()V
    //   382: aload_0
    //   383: athrow
    //   384: aload #9
    //   386: invokevirtual p : ()V
    //   389: aload_0
    //   390: athrow
    //   391: aload #4
    //   393: areturn
    //   394: astore_0
    //   395: aload #7
    //   397: astore #4
    //   399: goto -> 103
    //   402: astore #4
    //   404: aload #5
    //   406: astore #4
    //   408: goto -> 203
    //   411: astore_0
    //   412: aload #5
    //   414: astore_0
    //   415: goto -> 339
    // Exception table:
    //   from	to	target	type
    //   23	30	33	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   23	30	33	org/jaudiotagger/tag/TagException
    //   23	30	33	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   23	30	394	java/lang/OutOfMemoryError
    //   23	30	111	org/jaudiotagger/audio/exceptions/CannotReadException
    //   23	30	394	finally
    //   35	47	394	java/lang/OutOfMemoryError
    //   35	47	111	org/jaudiotagger/audio/exceptions/CannotReadException
    //   35	47	394	finally
    //   47	54	394	java/lang/OutOfMemoryError
    //   47	54	111	org/jaudiotagger/audio/exceptions/CannotReadException
    //   47	54	394	finally
    //   63	72	394	java/lang/OutOfMemoryError
    //   63	72	111	org/jaudiotagger/audio/exceptions/CannotReadException
    //   63	72	394	finally
    //   81	90	394	java/lang/OutOfMemoryError
    //   81	90	111	org/jaudiotagger/audio/exceptions/CannotReadException
    //   81	90	394	finally
    //   113	125	354	finally
    //   125	135	195	java/lang/OutOfMemoryError
    //   125	135	187	finally
    //   135	149	178	java/lang/OutOfMemoryError
    //   135	149	402	finally
    //   160	165	168	java/io/IOException
    //   160	165	354	finally
    //   170	175	354	finally
    //   213	218	354	finally
    //   221	226	361	finally
    //   231	236	211	java/io/IOException
    //   231	236	354	finally
    //   244	261	354	finally
    //   261	285	336	finally
    //   292	310	411	finally
    //   329	333	354	finally
    //   367	372	375	java/io/IOException
    //   367	372	354	finally
    //   377	382	354	finally
    //   382	384	354	finally
  }
  
  public static ParcelFileDescriptor k(int paramInt) {
    if (d == null) {
      File file1 = new File(MyApplication.i.getApplicationContext().getCacheDir(), "cresf");
      d = file1;
      if (!file1.exists())
        d.mkdirs(); 
    } 
    File file = new File(d, MyApplication.i.getApplicationContext().getResources().getResourceEntryName(paramInt));
    if (!file.exists()) {
      Bitmap bitmap = BitmapFactory.decodeResource(MyApplication.i.getApplicationContext().getResources(), paramInt);
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
      fileOutputStream.close();
    } 
    return ParcelFileDescriptor.open(file, 268435456);
  }
  
  public static Uri l(km0 paramkm0) {
    return n(paramkm0, m92.k, false);
  }
  
  public static Uri m(km0 paramkm0, int paramInt) {
    return n(paramkm0, paramInt, false);
  }
  
  public static Uri n(km0 paramkm0, int paramInt, boolean paramBoolean) {
    return (paramkm0 != null) ? AAProvider.c(paramkm0.b, paramInt, paramBoolean) : null;
  }
  
  public static Bitmap o(FileDescriptor paramFileDescriptor, int paramInt1, int paramInt2) {
    if (paramInt2 == 0 || paramInt1 == 0) {
      BitmapFactory.Options options = new BitmapFactory.Options();
      this();
      options.inJustDecodeBounds = true;
      BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, options);
      options.inSampleSize = a(options, paramInt1, paramInt2);
      options.inJustDecodeBounds = false;
      return BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, options);
    } 
    try {
      return BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, null);
    } finally {
      paramFileDescriptor = null;
      paramFileDescriptor.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */