import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.window.ldG.XUaAMlaMSa;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.a;
import in.krosbits.utils.SgV.zpEN;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class wn1 extends SQLiteOpenHelper {
  public static boolean f;
  
  public static final ExecutorService g = Executors.newSingleThreadExecutor();
  
  public static final HashMap h = new HashMap<Object, Object>();
  
  public static final float[] i = new float[0];
  
  public HashMap b = null;
  
  public lm0 c;
  
  public final bh0 e;
  
  public wn1(Context paramContext) {
    super(paramContext, "DB_SONGS_LOG", null, 8);
    bh0 bh01 = new bh0(1, (byte)0);
    bh01.c = null;
    this.e = bh01;
    setWriteAheadLoggingEnabled(true);
    boolean bool = MyApplication.o().getBoolean("k_b_hwsie", false);
    f = bool;
    if (bool)
      ag0.i = true; 
  }
  
  public static void A(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("ALTER TABLE TABLE_SONGS ADD COLUMN COL_LOGPATH TEXT ");
    Cursor cursor = paramSQLiteDatabase.query("TABLE_SONGS", new String[] { "COL_PATH" }, null, null, null, null, null);
    ContentValues contentValues = new ContentValues(2);
    String[] arrayOfString = new String[1];
    StringBuilder stringBuilder = new StringBuilder("trans:");
    stringBuilder.append(paramSQLiteDatabase.inTransaction());
    n21.F(stringBuilder.toString());
    if (cursor != null) {
      stringBuilder = new StringBuilder(" c=");
      stringBuilder.append(cursor.getCount());
      n21.F(stringBuilder.toString());
      while (cursor.moveToNext()) {
        try {
          String str1 = cursor.getString(0);
          File file = new File();
          this(str1);
          Uri uri = Uri.fromFile(file);
          String str2 = MyApplication.F.f(str1);
          if (str2 != null) {
            contentValues.put("COL_PATH", uri.toString());
            contentValues.put("COL_LOGPATH", str2);
            try {
              str2 = ag0.a;
              arrayOfString[0] = str1;
              paramSQLiteDatabase.updateWithOnConflict("TABLE_SONGS", contentValues, "COL_PATH=?", arrayOfString, 5);
              continue;
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
        } finally {}
        String str = ag0.a;
        arrayOfString[0] = (String)stringBuilder;
        paramSQLiteDatabase.delete("TABLE_SONGS", "COL_PATH=?", arrayOfString);
      } 
      cursor.close();
      im0 im0 = new im0(false, false, false);
      im0.K = true;
      im0.d = MyApplication.i.getApplicationContext().getString(2131886400);
      im0.v(paramSQLiteDatabase);
    } 
  }
  
  public static HashMap a(SQLiteDatabase paramSQLiteDatabase, boolean[] paramArrayOfboolean, q01 paramq01) {
    qn1 qn1 = null;
    try {
      HashMap<Object, Object> hashMap;
      Cursor cursor = paramSQLiteDatabase.query("TABLE_SONGS", new String[] { "COL_PATH", "COL_DATE_MODIFIED", "COL_VIS_FLAGS", "COL_TITLE", "COL_ARTIST", "COL_DURATION", "COL_LOGPATH" }, null, null, null, null, null);
      return hashMap;
    } finally {
      paramArrayOfboolean = null;
      qn1 qn11 = qn1;
    } 
  }
  
  public static List d() {
    if (Build.VERSION.SDK_INT >= 29) {
      Set set = MediaStore.getExternalVolumeNames(MyApplication.i.getApplicationContext());
      ArrayList<Uri> arrayList = new ArrayList(set.size());
      Iterator<String> iterator = set.iterator();
      while (iterator.hasNext())
        arrayList.add(MediaStore.Audio.Media.getContentUri(iterator.next())); 
      return arrayList;
    } 
    return Collections.singletonList(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
  }
  
  public static Cursor g(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    if (paramInt <= 157) {
      String str = fXMDNeMWaILNVh.ZyjuQz;
      return paramSQLiteDatabase.query(XUaAMlaMSa.TzIXLPgv, new String[] { 
            "rowid", "COL_PATH", "COL_TITLE", "COL_ARTIST", "COL_DURATION", "COL_NUM_PLAYED", "COL_LASTPOS", str, "COL_NUM_PLAYED_W", "COL_NUM_PLAYED_M", 
            "COL_NUM_PLAYED_Y" }, null, null, null, null, null);
    } 
    return paramSQLiteDatabase.query("TABLE_SONGS", new String[] { 
          "rowid", "COL_PATH", "COL_TITLE", "COL_ARTIST", "COL_DURATION", "COL_NUM_PLAYED", "COL_LASTPOS", "COL_LAST_PLAYED", "COL_NUM_PLAYED_W", eRUgfgGAccgka.MxWopYake, 
          "COL_NUM_PLAYED_Y", "COL_LOGPATH" }, null, null, null, null, null);
  }
  
  public static HashMap h(Uri paramUri) {
    ContentResolver contentResolver;
    ArrayList<u51> arrayList;
    Cursor cursor;
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>(0);
    try {
      Uri uri;
      contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      if (Build.VERSION.SDK_INT >= 29) {
        uri = MediaStore.Audio.Genres.getContentUri(MediaStore.getVolumeName(paramUri));
      } else {
        uri = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI;
      } 
      cursor = contentResolver.query(uri, new String[] { "_id", "name" }, null, null, null);
      arrayList = new ArrayList();
      this(cursor.getCount());
    } finally {
      HashMap<Object, Object> hashMap;
      paramUri = null;
    } 
    cursor.close();
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    try {
      int i = arrayList.size();
      byte b = 0;
    } finally {
      HashMap<Object, Object> hashMap;
      paramUri = null;
    } 
    MyApplication.i.getApplicationContext().getSharedPreferences("PP", 0).edit().putBoolean("B_GEN_SPT", true).apply();
    return hashMap1;
  }
  
  public static List m() {
    if (Build.VERSION.SDK_INT >= 29) {
      Set set = MediaStore.getExternalVolumeNames(MyApplication.i.getApplicationContext());
      ArrayList<Uri> arrayList = new ArrayList(set.size());
      Iterator<String> iterator = set.iterator();
      while (iterator.hasNext())
        arrayList.add(MediaStore.Video.Media.getContentUri(iterator.next())); 
      return arrayList;
    } 
    return Collections.singletonList(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
  }
  
  public static boolean q(SQLiteDatabase paramSQLiteDatabase) {
    boolean bool3 = true;
    boolean bool1 = true;
    boolean bool2 = bool3;
    try {
      Cursor cursor = paramSQLiteDatabase.query("TABLE_SONGS", new String[] { "rowid" }, null, null, null, null, null, "1");
      if (cursor != null) {
        bool2 = bool3;
        if (cursor.getCount() != 0)
          bool1 = false; 
        bool2 = bool1;
        cursor.close();
        return bool1;
      } 
    } finally {}
    return true;
  }
  
  public static void z(SQLiteDatabase paramSQLiteDatabase) {
    im0.p();
    boolean bool = paramSQLiteDatabase.inTransaction();
    if (!bool)
      paramSQLiteDatabase.beginTransactionNonExclusive(); 
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this("SL:udf>");
      stringBuilder.append(bool);
      n21.F(stringBuilder.toString());
      ContentValues contentValues = new ContentValues();
      this(1);
      Cursor cursor = paramSQLiteDatabase.query("TABLE_SONGS", new String[] { "COL_PATH", "COL_LOGPATH", "COL_VIS_FLAGS" }, null, null, null, null, null);
      if (cursor != null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        this("c,c=");
        stringBuilder1.append(cursor.getCount());
        n21.F(stringBuilder1.toString());
        String[] arrayOfString = new String[1];
        while (cursor.moveToNext()) {
          String str2 = cursor.getString(0);
          String str1 = cursor.getString(1);
          int j = cursor.getInt(2);
          int i = im0.f(ag0.C(str1)) | j & 0xFFFFF3FF;
          if (j != i) {
            contentValues.put("COL_VIS_FLAGS", Integer.valueOf(i));
            arrayOfString[0] = str2;
            paramSQLiteDatabase.updateWithOnConflict("TABLE_SONGS", contentValues, "COL_PATH=?", arrayOfString, 4);
          } 
        } 
        cursor.close();
        if (!bool)
          paramSQLiteDatabase.setTransactionSuccessful(); 
        n21.F("SL:udf>e");
      } 
    } finally {
      Exception exception;
    } 
    if (!bool)
      paramSQLiteDatabase.endTransaction(); 
    n21.F("SL:udf>f");
  }
  
  public final int c(HashSet paramHashSet, ki paramki) {
    int i;
    SQLiteDatabase sQLiteDatabase = getWritableDatabase();
    sQLiteDatabase.beginTransactionNonExclusive();
    boolean bool = false;
    try {
      Iterator<wo> iterator = paramHashSet.iterator();
      for (i = 0; iterator.hasNext(); i += sQLiteDatabase.delete("TABLE_SONGS", "COL_PATH=?", arrayOfString)) {
        int j;
        km0 km0;
        wo wo = iterator.next();
        if (paramki != null) {
          boolean bool1 = paramki.b;
          if (bool1) {
            sQLiteDatabase.endTransaction();
            return 0;
          } 
        } 
        String str1 = wo.toString();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = str1;
        bh0 bh01 = this.e;
        String str2 = arrayOfString[0];
        byte b = -1;
        int k = b;
        try {
          Cursor cursor = sQLiteDatabase.query("TABLE_SONGS", new String[] { "rowid" }, "COL_PATH=?", new String[] { str2 }, null, null, null, "1");
        } finally {
          str2 = null;
          j = k;
        } 
        bh01.getClass();
        try {
          bh01.w(j).delete();
        } finally {
          bh01 = null;
        } 
        if (km0 != null) {
          cs1 cs1 = cq0.a;
          tq tq = new tq();
          this(km0, null, 3);
          qv.X(b40.b, tq);
        } 
      } 
    } finally {}
    sQLiteDatabase.setTransactionSuccessful();
    l51.a(paramHashSet);
    sQLiteDatabase.endTransaction();
    return i;
  }
  
  public final float[] k(String paramString) {
    float[] arrayOfFloat1;
    String str2 = null;
    float[] arrayOfFloat3 = null;
    String str1 = null;
    float[] arrayOfFloat2 = arrayOfFloat3;
    try {
      Cursor cursor = getReadableDatabase().query("TABLE_SONGS", new String[] { "COL_GAINS" }, "COL_PATH=?", new String[] { paramString }, null, null, null, "1");
      paramString = str2;
    } finally {
      paramString = null;
    } 
    return arrayOfFloat1;
  }
  
  public final float[] l(wo paramwo, vn1 paramvn1, Handler paramHandler) {
    if (!g92.P()) {
      float[] arrayOfFloat = (float[])h.get(paramwo);
      if (arrayOfFloat != null)
        return (arrayOfFloat != i) ? arrayOfFloat : null; 
      (new z2(new uu0(this, paramwo, paramHandler, paramvn1, 6))).executeOnExecutor(g, new Object[0]);
      return null;
    } 
    return null;
  }
  
  public final void o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc_w 'AI:t6'
    //   5: invokestatic F : (Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokevirtual getReadableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
    //   12: astore_2
    //   13: new lm0
    //   16: astore_1
    //   17: aload_1
    //   18: aload_2
    //   19: invokespecial <init> : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   22: aload_0
    //   23: aload_1
    //   24: putfield c : Llm0;
    //   27: ldc_w 'NL>IRL'
    //   30: invokestatic F : (Ljava/lang/String;)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	33	36	finally
    //   37	39	36	finally
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    MyApplication.m = MyApplication.i.getApplicationContext().getString(2131886263);
    a a = MyApplication.O;
    if (a != null)
      a.a(); 
    paramSQLiteDatabase.execSQL("create table TABLE_SONGS ( COL_PATH TEXT primary key, COL_TITLE TEXT COLLATE NOCASE, COL_ARTIST TEXT COLLATE NOCASE, COL_ALBUM TEXT COLLATE NOCASE, COL_GENRE TEXT COLLATE NOCASE, COL_COMPOSER TEXT, COL_YEAR INTEGER, COL_DURATION INTEGER, COL_TRACK_NO INTEGER, COL_DATE_ADDED INTEGER, COL_DATE_MODIFIED INTEGER, COL_NUM_PLAYED INTEGER DEFAULT 0, COL_LAST_PLAYED INTEGER DEFAULT 0, COL_LASTPOS INTEGER DEFAULT 0, album_artist TEXT COLLATE NOCASE, COL_NUM_PLAYED_W INTEGER DEFAULT 0, COL_NUM_PLAYED_M INTEGER DEFAULT 0, COL_NUM_PLAYED_Y INTEGER DEFAULT 0, COL_VIS_FLAGS INTEGER DEFAULT 0, COL_RATING INTEGER DEFAULT 0, COL_ENDPOINTS INTEGER DEFAULT 0, COL_GAINS TEXT, COL_LOGPATH TEXT, COL_EIJ TEXT )");
    im0 im0 = new im0(false, false, false);
    im0.K = true;
    im0.d = MyApplication.i.getApplicationContext().getString(2131886263);
    im0.v(paramSQLiteDatabase);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 'SLU:'
    //   7: invokespecial <init> : (Ljava/lang/String;)V
    //   10: astore #9
    //   12: aload #9
    //   14: invokestatic currentThread : ()Ljava/lang/Thread;
    //   17: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: aload #9
    //   23: ldc_w ', '
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload #9
    //   32: iload_2
    //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload #9
    //   39: ldc_w ', '
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload #9
    //   48: iload_3
    //   49: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #9
    //   55: invokevirtual toString : ()Ljava/lang/String;
    //   58: invokestatic F : (Ljava/lang/String;)V
    //   61: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   64: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   67: ldc 2131886400
    //   69: invokevirtual getString : (I)Ljava/lang/String;
    //   72: putstatic in/krosbits/musicolet/MyApplication.m : Ljava/lang/String;
    //   75: getstatic in/krosbits/musicolet/MyApplication.O : Lin/krosbits/musicolet/a;
    //   78: astore #9
    //   80: aload #9
    //   82: ifnull -> 90
    //   85: aload #9
    //   87: invokevirtual a : ()V
    //   90: iconst_0
    //   91: istore #4
    //   93: iload_2
    //   94: iconst_2
    //   95: if_icmpgt -> 268
    //   98: aload_1
    //   99: ldc_w 'TABLE_SONG_LOGS'
    //   102: iconst_3
    //   103: anewarray java/lang/String
    //   106: dup
    //   107: iconst_0
    //   108: ldc 'COL_PATH'
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: ldc_w 'COL_NUM_PLAYED'
    //   116: aastore
    //   117: dup
    //   118: iconst_2
    //   119: ldc_w 'COL_LAST_PLAYED'
    //   122: aastore
    //   123: aconst_null
    //   124: aconst_null
    //   125: aconst_null
    //   126: aconst_null
    //   127: aconst_null
    //   128: invokevirtual query : (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   131: astore #10
    //   133: aload #10
    //   135: ifnull -> 229
    //   138: aload_0
    //   139: new java/util/HashMap
    //   142: dup
    //   143: aload #10
    //   145: invokeinterface getCount : ()I
    //   150: invokespecial <init> : (I)V
    //   153: putfield b : Ljava/util/HashMap;
    //   156: aload #10
    //   158: invokeinterface moveToNext : ()Z
    //   163: ifeq -> 222
    //   166: aload #10
    //   168: iconst_0
    //   169: invokeinterface getString : (I)Ljava/lang/String;
    //   174: astore #9
    //   176: aload #10
    //   178: iconst_1
    //   179: invokeinterface getLong : (I)J
    //   184: lstore #5
    //   186: aload #10
    //   188: iconst_2
    //   189: invokeinterface getLong : (I)J
    //   194: lstore #7
    //   196: aload_0
    //   197: getfield b : Ljava/util/HashMap;
    //   200: aload #9
    //   202: iconst_2
    //   203: newarray long
    //   205: dup
    //   206: iconst_0
    //   207: lload #5
    //   209: lastore
    //   210: dup
    //   211: iconst_1
    //   212: lload #7
    //   214: lastore
    //   215: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: goto -> 156
    //   222: aload #10
    //   224: invokeinterface close : ()V
    //   229: aload_1
    //   230: ldc_w 'DROP TABLE TABLE_SONG_LOGS'
    //   233: invokevirtual execSQL : (Ljava/lang/String;)V
    //   236: aload_0
    //   237: aload_1
    //   238: invokevirtual onCreate : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   241: aload_0
    //   242: getfield b : Ljava/util/HashMap;
    //   245: astore #9
    //   247: aload #9
    //   249: ifnull -> 262
    //   252: aload #9
    //   254: invokevirtual clear : ()V
    //   257: aload_0
    //   258: aconst_null
    //   259: putfield b : Ljava/util/HashMap;
    //   262: bipush #8
    //   264: istore_2
    //   265: goto -> 268
    //   268: iload_2
    //   269: istore_3
    //   270: iload_2
    //   271: iconst_3
    //   272: if_icmpne -> 284
    //   275: aload_1
    //   276: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_LASTPOS INTEGER DEFAULT 0 '
    //   279: invokevirtual execSQL : (Ljava/lang/String;)V
    //   282: iconst_4
    //   283: istore_3
    //   284: iload_3
    //   285: istore_2
    //   286: iload_3
    //   287: iconst_4
    //   288: if_icmpne -> 1056
    //   291: aload_1
    //   292: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN album_artist TEXT COLLATE NOCASE '
    //   295: invokevirtual execSQL : (Ljava/lang/String;)V
    //   298: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   301: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   304: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   307: astore #14
    //   309: invokestatic d : ()Ljava/util/List;
    //   312: invokeinterface iterator : ()Ljava/util/Iterator;
    //   317: astore #12
    //   319: iload #4
    //   321: istore_2
    //   322: aload #12
    //   324: invokeinterface hasNext : ()Z
    //   329: ifeq -> 1054
    //   332: aload #12
    //   334: invokeinterface next : ()Ljava/lang/Object;
    //   339: checkcast android/net/Uri
    //   342: astore #16
    //   344: aload #14
    //   346: aload #16
    //   348: iconst_2
    //   349: anewarray java/lang/String
    //   352: dup
    //   353: iconst_0
    //   354: ldc_w '_id'
    //   357: aastore
    //   358: dup
    //   359: iconst_1
    //   360: ldc_w '_data'
    //   363: aastore
    //   364: aconst_null
    //   365: aconst_null
    //   366: aconst_null
    //   367: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   370: astore #13
    //   372: aload #13
    //   374: ifnull -> 1051
    //   377: new java/util/HashMap
    //   380: dup
    //   381: iload_2
    //   382: invokespecial <init> : (I)V
    //   385: astore #11
    //   387: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   390: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   393: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   396: astore #15
    //   398: aload #15
    //   400: aload #16
    //   402: iconst_2
    //   403: anewarray java/lang/String
    //   406: dup
    //   407: iconst_0
    //   408: ldc_w '_id'
    //   411: aastore
    //   412: dup
    //   413: iconst_1
    //   414: ldc_w 'album_artist'
    //   417: aastore
    //   418: aconst_null
    //   419: aconst_null
    //   420: aconst_null
    //   421: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   424: astore #10
    //   426: new java/util/HashMap
    //   429: astore #9
    //   431: aload #9
    //   433: aload #10
    //   435: invokeinterface getCount : ()I
    //   440: invokespecial <init> : (I)V
    //   443: aload #10
    //   445: invokeinterface moveToNext : ()Z
    //   450: ifeq -> 486
    //   453: aload #9
    //   455: aload #10
    //   457: iload_2
    //   458: invokeinterface getLong : (I)J
    //   463: invokestatic valueOf : (J)Ljava/lang/Long;
    //   466: aload #10
    //   468: iconst_1
    //   469: invokeinterface getString : (I)Ljava/lang/String;
    //   474: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   477: pop
    //   478: goto -> 443
    //   481: astore #10
    //   483: goto -> 514
    //   486: aload #10
    //   488: invokeinterface close : ()V
    //   493: goto -> 874
    //   496: astore #9
    //   498: aload #9
    //   500: astore #10
    //   502: aload #11
    //   504: astore #9
    //   506: goto -> 514
    //   509: astore #9
    //   511: goto -> 498
    //   514: aload #10
    //   516: invokevirtual printStackTrace : ()V
    //   519: aload #9
    //   521: invokevirtual clear : ()V
    //   524: getstatic android/os/Build$VERSION.SDK_INT : I
    //   527: bipush #29
    //   529: if_icmplt -> 545
    //   532: aload #16
    //   534: invokestatic getVolumeName : (Landroid/net/Uri;)Ljava/lang/String;
    //   537: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   540: astore #10
    //   542: goto -> 553
    //   545: getstatic android/provider/MediaStore$Audio$Albums.EXTERNAL_CONTENT_URI : Landroid/net/Uri;
    //   548: astore #10
    //   550: goto -> 542
    //   553: aload #15
    //   555: aload #10
    //   557: iconst_2
    //   558: anewarray java/lang/String
    //   561: dup
    //   562: iconst_0
    //   563: ldc_w '_id'
    //   566: aastore
    //   567: dup
    //   568: iconst_1
    //   569: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.iLMCaPVTBjFoiBO : Ljava/lang/String;
    //   572: aastore
    //   573: aconst_null
    //   574: aconst_null
    //   575: aconst_null
    //   576: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   579: astore #10
    //   581: new java/util/HashMap
    //   584: astore #17
    //   586: aload #17
    //   588: aload #10
    //   590: invokeinterface getCount : ()I
    //   595: invokespecial <init> : (I)V
    //   598: aload #10
    //   600: invokeinterface moveToNext : ()Z
    //   605: ifeq -> 641
    //   608: aload #17
    //   610: aload #10
    //   612: iload_2
    //   613: invokeinterface getLong : (I)J
    //   618: invokestatic valueOf : (J)Ljava/lang/Long;
    //   621: aload #10
    //   623: iconst_1
    //   624: invokeinterface getString : (I)Ljava/lang/String;
    //   629: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   632: pop
    //   633: goto -> 598
    //   636: astore #10
    //   638: goto -> 831
    //   641: aload #10
    //   643: invokeinterface close : ()V
    //   648: aload #15
    //   650: aload #16
    //   652: iconst_2
    //   653: anewarray java/lang/String
    //   656: dup
    //   657: iconst_0
    //   658: ldc_w '_id'
    //   661: aastore
    //   662: dup
    //   663: iconst_1
    //   664: ldc_w 'album_id'
    //   667: aastore
    //   668: aconst_null
    //   669: aconst_null
    //   670: aconst_null
    //   671: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   674: astore #11
    //   676: new java/util/HashMap
    //   679: dup
    //   680: aload #11
    //   682: invokeinterface getCount : ()I
    //   687: invokespecial <init> : (I)V
    //   690: astore #10
    //   692: aload #11
    //   694: astore #9
    //   696: aload #9
    //   698: invokeinterface moveToNext : ()Z
    //   703: ifeq -> 778
    //   706: aload #9
    //   708: iload_2
    //   709: invokeinterface getInt : (I)I
    //   714: i2l
    //   715: lstore #5
    //   717: aload #17
    //   719: aload #9
    //   721: iconst_1
    //   722: invokeinterface getInt : (I)I
    //   727: i2l
    //   728: invokestatic valueOf : (J)Ljava/lang/Long;
    //   731: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   734: checkcast java/lang/String
    //   737: astore #11
    //   739: aload #11
    //   741: ifnull -> 773
    //   744: aload #10
    //   746: lload #5
    //   748: invokestatic valueOf : (J)Ljava/lang/Long;
    //   751: aload #11
    //   753: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   756: pop
    //   757: goto -> 773
    //   760: astore #11
    //   762: aload #10
    //   764: astore #9
    //   766: aload #11
    //   768: astore #10
    //   770: goto -> 831
    //   773: iconst_0
    //   774: istore_2
    //   775: goto -> 696
    //   778: aload #9
    //   780: invokeinterface close : ()V
    //   785: aload #17
    //   787: invokevirtual clear : ()V
    //   790: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   793: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   796: ldc_w 'PP'
    //   799: iconst_0
    //   800: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   803: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   808: ldc_w 'B_ALAR_SPT'
    //   811: iconst_1
    //   812: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   817: invokeinterface apply : ()V
    //   822: aload #10
    //   824: astore #9
    //   826: iconst_0
    //   827: istore_2
    //   828: goto -> 874
    //   831: aload #10
    //   833: invokevirtual printStackTrace : ()V
    //   836: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   839: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   842: astore #10
    //   844: iconst_0
    //   845: istore_2
    //   846: aload #10
    //   848: ldc_w 'PP'
    //   851: iconst_0
    //   852: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   855: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   860: ldc_w 'B_ALAR_SPT'
    //   863: iconst_0
    //   864: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   869: invokeinterface apply : ()V
    //   874: aload #13
    //   876: ldc_w '_id'
    //   879: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   884: istore #4
    //   886: aload #13
    //   888: ldc_w '_data'
    //   891: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   896: istore_3
    //   897: new android/content/ContentValues
    //   900: dup
    //   901: iconst_1
    //   902: invokespecial <init> : (I)V
    //   905: astore #16
    //   907: aload #13
    //   909: invokeinterface moveToNext : ()Z
    //   914: ifeq -> 1041
    //   917: aload #13
    //   919: iload #4
    //   921: invokeinterface getLong : (I)J
    //   926: lstore #5
    //   928: aload #13
    //   930: iload_3
    //   931: invokeinterface getString : (I)Ljava/lang/String;
    //   936: astore #15
    //   938: new java/io/File
    //   941: astore #10
    //   943: aload #10
    //   945: aload #15
    //   947: invokespecial <init> : (Ljava/lang/String;)V
    //   950: goto -> 958
    //   953: astore #10
    //   955: aconst_null
    //   956: astore #10
    //   958: aload #10
    //   960: ifnull -> 907
    //   963: aload #10
    //   965: invokevirtual exists : ()Z
    //   968: ifne -> 974
    //   971: goto -> 907
    //   974: aload #16
    //   976: invokevirtual clear : ()V
    //   979: aload #9
    //   981: lload #5
    //   983: invokestatic valueOf : (J)Ljava/lang/Long;
    //   986: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   989: checkcast java/lang/String
    //   992: astore #11
    //   994: aload #11
    //   996: astore #10
    //   998: aload #11
    //   1000: ifnonnull -> 1008
    //   1003: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.oeJH : Ljava/lang/String;
    //   1006: astore #10
    //   1008: aload #16
    //   1010: ldc_w 'album_artist'
    //   1013: aload #10
    //   1015: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   1018: aload_1
    //   1019: ldc 'TABLE_SONGS'
    //   1021: aload #16
    //   1023: ldc 'COL_PATH=?'
    //   1025: iconst_1
    //   1026: anewarray java/lang/String
    //   1029: dup
    //   1030: iconst_0
    //   1031: aload #15
    //   1033: aastore
    //   1034: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   1037: pop
    //   1038: goto -> 907
    //   1041: aload #13
    //   1043: invokeinterface close : ()V
    //   1048: goto -> 1051
    //   1051: goto -> 322
    //   1054: iconst_5
    //   1055: istore_2
    //   1056: iload_2
    //   1057: istore_3
    //   1058: iload_2
    //   1059: iconst_5
    //   1060: if_icmpne -> 1115
    //   1063: aload_1
    //   1064: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_NUM_PLAYED_W INTEGER DEFAULT 0'
    //   1067: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1070: aload_1
    //   1071: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_NUM_PLAYED_M INTEGER DEFAULT 0'
    //   1074: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1077: aload_1
    //   1078: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_NUM_PLAYED_Y INTEGER DEFAULT 0'
    //   1081: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1084: aload_1
    //   1085: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_VIS_FLAGS INTEGER DEFAULT 0'
    //   1088: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1091: aload_1
    //   1092: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_RATING INTEGER DEFAULT 0'
    //   1095: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1098: aload_1
    //   1099: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_ENDPOINTS INTEGER DEFAULT 0'
    //   1102: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1105: aload_1
    //   1106: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_GAINS TEXT '
    //   1109: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1112: bipush #6
    //   1114: istore_3
    //   1115: iload_3
    //   1116: istore_2
    //   1117: iload_3
    //   1118: bipush #6
    //   1120: if_icmpne -> 1156
    //   1123: aload_1
    //   1124: invokestatic A : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   1127: bipush #7
    //   1129: istore_2
    //   1130: goto -> 1156
    //   1133: astore #9
    //   1135: aload #9
    //   1137: invokevirtual printStackTrace : ()V
    //   1140: ldc_w 2131886515
    //   1143: iconst_1
    //   1144: invokestatic O0 : (II)V
    //   1147: ldc2_w 5000
    //   1150: invokestatic sleep : (J)V
    //   1153: aload #9
    //   1155: athrow
    //   1156: iload_2
    //   1157: bipush #7
    //   1159: if_icmpne -> 1192
    //   1162: aload_1
    //   1163: ldc_w 'ALTER TABLE TABLE_SONGS ADD COLUMN COL_EIJ TEXT '
    //   1166: invokevirtual execSQL : (Ljava/lang/String;)V
    //   1169: goto -> 1192
    //   1172: astore_1
    //   1173: aload_1
    //   1174: invokevirtual printStackTrace : ()V
    //   1177: ldc_w 2131886515
    //   1180: iconst_1
    //   1181: invokestatic O0 : (II)V
    //   1184: ldc2_w 5000
    //   1187: invokestatic sleep : (J)V
    //   1190: aload_1
    //   1191: athrow
    //   1192: return
    //   1193: astore_1
    //   1194: goto -> 1153
    //   1197: astore #9
    //   1199: goto -> 1190
    // Exception table:
    //   from	to	target	type
    //   398	426	509	finally
    //   426	443	496	finally
    //   443	478	481	finally
    //   486	493	481	finally
    //   524	542	636	finally
    //   545	550	636	finally
    //   553	598	636	finally
    //   598	633	636	finally
    //   641	692	636	finally
    //   696	739	760	finally
    //   744	757	760	finally
    //   778	822	760	finally
    //   938	950	953	finally
    //   1123	1127	1133	finally
    //   1147	1153	1193	finally
    //   1162	1169	1172	finally
    //   1184	1190	1197	finally
  }
  
  public final void p(ArrayList<Object> paramArrayList) {
    SQLiteDatabase sQLiteDatabase = getWritableDatabase();
    sQLiteDatabase.beginTransactionNonExclusive();
    try {
      ContentValues contentValues = new ContentValues();
      this();
      int i = paramArrayList.size();
      byte b = 0;
      while (b < i) {
        km0 km0 = (km0)paramArrayList.get(b);
        b++;
        km0 = km0;
        contentValues.clear();
        qn1 qn1 = km0.c;
        contentValues.put("COL_PATH", ag0.Q0(qn1.f));
        contentValues.put("COL_TITLE", qn1.b);
        contentValues.put("COL_ALBUM", qn1.c);
        contentValues.put("COL_ARTIST", qn1.e);
        contentValues.put("COL_GENRE", km0.e);
        contentValues.put("COL_COMPOSER", km0.f);
        contentValues.put(PwbbJfsdcHrAjW.ySilhabcdp, Integer.valueOf(km0.p));
        contentValues.put("COL_DURATION", Integer.valueOf(qn1.g));
        contentValues.put("COL_TRACK_NO", Integer.valueOf(km0.q));
        contentValues.put("COL_DATE_ADDED", Long.valueOf(km0.k));
        contentValues.put("COL_DATE_MODIFIED", Long.valueOf(km0.l));
        contentValues.put("COL_NUM_PLAYED", Integer.valueOf(km0.o));
        contentValues.put("COL_LAST_PLAYED", Long.valueOf(km0.m));
        contentValues.put(zLtYiJUm.jutWWtmyj, Long.valueOf(km0.n));
        contentValues.put("album_artist", km0.j);
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(km0.h);
        stringBuilder.append("/");
        stringBuilder.append(km0.g);
        contentValues.put("COL_LOGPATH", stringBuilder.toString());
        contentValues.put("COL_VIS_FLAGS", Integer.valueOf(km0.u));
        sQLiteDatabase.insertWithOnConflict("TABLE_SONGS", null, contentValues, 5);
      } 
    } finally {}
    sQLiteDatabase.setTransactionSuccessful();
    sQLiteDatabase.endTransaction();
  }
  
  public final void r(km0 paramkm0) {
    if (paramkm0 != null && paramkm0.c.f != null) {
      int i = paramkm0.o + 1;
      int j = paramkm0.h() + 1;
      int m = paramkm0.f() + 1;
      int k = paramkm0.j() + 1;
      long l = System.currentTimeMillis();
      paramkm0.o = i;
      paramkm0.r = j;
      paramkm0.s = m;
      paramkm0.t = k;
      paramkm0.m = l;
      (new tn1(this, l, i, j, m, k, paramkm0)).execute(new Object[0]);
      try {
        MusicActivity musicActivity = MusicActivity.R0;
        if (musicActivity != null) {
          l81 l81 = musicActivity.e0;
          i = l81.a0;
          if (i == 3 || i == 4)
            l81.N0(); 
        } 
      } finally {}
    } 
  }
  
  public final void s() {
    String str1;
    ContentValues contentValues = new ContentValues(1);
    String str2 = null;
    SQLiteDatabase sQLiteDatabase2 = null;
    SQLiteDatabase sQLiteDatabase1 = sQLiteDatabase2;
    try {
      h.clear();
      sQLiteDatabase1 = sQLiteDatabase2;
      sQLiteDatabase2 = getWritableDatabase();
      try {
        sQLiteDatabase2.beginTransactionNonExclusive();
        Cursor cursor = sQLiteDatabase2.query("TABLE_SONGS", new String[] { "COL_PATH", "COL_EIJ" }, null, null, null, null, null);
        if (cursor != null)
          while (true) {
            if (cursor.moveToNext()) {
              str2 = cursor.getString(0);
              str1 = cursor.getString(1);
              boolean bool = TextUtils.isEmpty(str1);
              if (!bool)
                try {
                  StringReader stringReader = new StringReader();
                  this(str1);
                  nk0 nk0 = fb0.n(stringReader);
                  if (nk0 instanceof rk0) {
                    nk0 = nk0.g();
                    continue;
                  } 
                } finally {} 
              str1 = null;
              continue;
            } 
            cursor.close();
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            if (sQLiteDatabase1 != null) {
              boolean bool = ((rk0)sQLiteDatabase1).b.containsKey("s");
              if (bool || ((rk0)sQLiteDatabase1).b.containsKey("p")) {
                nk0 nk0 = (nk0)((rk0)sQLiteDatabase1).b.remove("s");
                nk0 = (nk0)((rk0)sQLiteDatabase1).b.remove("p");
                contentValues.put("COL_EIJ", sQLiteDatabase1.toString());
                sQLiteDatabase2.update("TABLE_SONGS", contentValues, "COL_PATH=?", new String[] { str2 });
              } 
            } 
          }  
      } catch (Exception exception1) {
        Exception exception2 = exception1;
      } finally {}
    } catch (Exception exception) {
      String str = str2;
      str1 = str;
    } finally {
      ContentValues contentValues1;
      contentValues = null;
      String str = str1;
    } 
  }
  
  public final void u(km0 paramkm0, long paramLong, boolean paramBoolean) {
    qn1 qn1 = paramkm0.c;
    if (qn1.f != null) {
      this.c.getClass();
      try {
        paramkm0.n = paramLong;
      } finally {
        Exception exception = null;
      } 
    } 
  }
  
  public final void v(String paramString, float[] paramArrayOffloat) {
    try {
      ik0 ik0 = new ik0();
      this(2);
      ik0.k(Float.valueOf(paramArrayOffloat[0]));
      ik0.k(Float.valueOf(paramArrayOffloat[1]));
      ContentValues contentValues = new ContentValues();
      this(1);
      return;
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public final void w(ArrayList<wo> paramArrayList, float[] paramArrayOffloat) {
    SQLiteDatabase sQLiteDatabase = getWritableDatabase();
    try {
      sQLiteDatabase.beginTransactionNonExclusive();
      int i = paramArrayList.size();
      for (byte b = 0; b < i; b++) {
        rk0 rk01;
        String str = ((wo)paramArrayList.get(b)).toString();
        Cursor cursor = sQLiteDatabase.query("TABLE_SONGS", new String[] { "COL_EIJ" }, "COL_PATH=?", new String[] { str }, null, null, null, "1");
        StringReader stringReader1 = null;
        StringReader stringReader2 = null;
        if (cursor != null) {
          stringReader1 = stringReader2;
          if (cursor.moveToNext()) {
            String str1 = cursor.getString(0);
            stringReader1 = stringReader2;
            if (!TextUtils.isEmpty(str1)) {
              stringReader1 = new StringReader();
              this(str1);
              rk01 = fb0.n(stringReader1).g();
            } 
          } 
          cursor.close();
        } 
        rk0 rk02 = rk01;
        if (rk01 == null) {
          rk02 = new rk0();
          this();
        } 
        qn0 qn0 = rk02.b;
        if (paramArrayOffloat != null) {
          rk02.k("s", Float.valueOf(paramArrayOffloat[0]));
          rk02.k("p", Float.valueOf(paramArrayOffloat[1]));
        } else {
          nk0 nk0 = (nk0)qn0.remove("s");
          nk0 = (nk0)qn0.remove("p");
        } 
        ContentValues contentValues = new ContentValues();
        this(1);
        contentValues.put("COL_EIJ", rk02.toString());
        sQLiteDatabase.update("TABLE_SONGS", contentValues, "COL_PATH=?", new String[] { str });
      } 
    } finally {}
    sQLiteDatabase.setTransactionSuccessful();
    sQLiteDatabase.endTransaction();
  }
  
  public final void x(HashMap paramHashMap) {
    SQLiteDatabase sQLiteDatabase = getWritableDatabase();
    sQLiteDatabase.beginTransactionNonExclusive();
    try {
      Set set = paramHashMap.keySet();
      ContentValues contentValues = new ContentValues();
      this(2);
      for (wo wo : set) {
        Uri uri;
        v00 v002 = (v00)paramHashMap.get(wo);
        String str2 = v002.b.toString();
        v00 v001 = MyApplication.F.d(str2);
        if (v001 != null) {
          uri = v001.j();
        } else {
          uri = v002.j();
        } 
        String str1 = uri.toString();
        contentValues.put("COL_PATH", str1);
        contentValues.put("COL_LOGPATH", str2);
        sQLiteDatabase.updateWithOnConflict("TABLE_SONGS", contentValues, "COL_PATH = ? ", new String[] { wo.toString() }, 5);
      } 
    } finally {}
    sQLiteDatabase.setTransactionSuccessful();
    l51.k(paramHashMap);
    sQLiteDatabase.endTransaction();
  }
  
  public final void y(HashMap paramHashMap) {
    SQLiteDatabase sQLiteDatabase = getWritableDatabase();
    sQLiteDatabase.beginTransactionNonExclusive();
    try {
      ContentValues contentValues = new ContentValues();
      this(9);
      for (wo wo : paramHashMap.keySet()) {
        km0 km0 = (km0)paramHashMap.get(wo);
        String str = zpEN.YDVFpUs;
        qn1 qn1 = km0.c;
        contentValues.put(str, qn1.b);
        contentValues.put("COL_ALBUM", qn1.c);
        contentValues.put("COL_ARTIST", qn1.e);
        contentValues.put("album_artist", km0.j);
        contentValues.put("COL_COMPOSER", km0.f);
        contentValues.put("COL_GENRE", km0.e);
        contentValues.put("COL_TRACK_NO", Integer.valueOf(km0.q));
        contentValues.put("COL_YEAR", Integer.valueOf(km0.p));
        contentValues.put("COL_DATE_MODIFIED", Long.valueOf(km0.l));
        contentValues.put("COL_DURATION", Integer.valueOf(qn1.g));
        sQLiteDatabase.update("TABLE_SONGS", contentValues, "COL_PATH=?", new String[] { wo.toString() });
      } 
    } finally {}
    sQLiteDatabase.setTransactionSuccessful();
    sQLiteDatabase.endTransaction();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */