import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.b;
import in.krosbits.utils.works.AutoBackupWorker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public abstract class tb {
  public static final ExecutorService a = Executors.newSingleThreadExecutor();
  
  public static SecretKeySpec b;
  
  public static void a(u00 paramu00, boolean paramBoolean) {
    SQLiteDatabase sQLiteDatabase;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{tb}} */
    try {
      if (MyApplication.k()) {
        File file1 = new File();
        this(MyApplication.i.getApplicationContext().getCacheDir(), "_tbks");
        cd1 cd1 = v00.s(file1);
        if (!cd1.k())
          cd1.E(); 
        ArrayList<Object> arrayList = cd1.D(null);
        int i = arrayList.size();
        boolean bool = false;
        byte b = 0;
        while (b < i) {
          u00 u001 = (u00)arrayList.get(b);
          b++;
          ((u00)u001).e();
        } 
        rk0 rk01 = new rk0();
        this();
        rk01.k("v", Integer.valueOf(b.c));
        rk01.k("time", Long.valueOf(System.currentTimeMillis()));
        rk0 rk02 = new rk0();
        this();
        rk01.b.put("md5", rk02);
        rk0 rk03 = f();
        rk01.b.put("equalizer", rk03);
        File file2 = MyApplication.i.getApplicationContext().getFilesDir();
        File file3 = new File();
        this(file2, "0.names");
        if (file3.isFile()) {
          v00 v00 = cd1.A(file3.getName());
          String str = b((cd1)v00, file3);
          rk02.l(v00.h(), str);
        } 
        file3 = new File();
        this(file2, "0.favs");
        if (file3.isFile()) {
          v00 v00 = cd1.A(file3.getName());
          String str = b((cd1)v00, file3);
          rk02.l(v00.h(), str);
        } 
        ArrayList<String> arrayList1 = c81.g(MyApplication.i.getApplicationContext());
        for (b = 0; b < arrayList1.size(); b++) {
          String str = arrayList1.get(b);
          file3 = new File();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(str);
          stringBuilder.append(".mpl");
          this(file2, stringBuilder.toString());
          if (file3.isFile()) {
            v00 v00 = cd1.A(file3.getName());
            String str1 = b((cd1)v00, file3);
            rk02.l(v00.h(), str1);
          } 
        } 
        for (b = 0; b < 5; b++) {
          (new String[5])[0] = "PP";
          (new String[5])[1] = "RPN";
          (new String[5])[2] = "SSP";
          (new String[5])[3] = "USP";
          (new String[5])[4] = "OMV";
          String str1 = (new String[5])[b];
          SharedPreferences sharedPreferences = MyApplication.i.getApplicationContext().getSharedPreferences(str1, 0);
          v00 v00 = cd1.A(str1);
          String str2 = k(sharedPreferences, (cd1)v00);
          rk02.l(v00.h(), str2);
        } 
        if (MusicService.P0 != null) {
          if (MusicService.E0 != null && MusicService.F0) {
            xn1 xn1 = MusicService.z();
            if (xn1 != null)
              xn1.l(MusicService.E0.A()); 
          } 
          MusicService.P0.m0(true);
        } 
        MusicService.q0(false);
        sQLiteDatabase = MyApplication.j.getWritableDatabase();
        try {
          Cursor cursor = sQLiteDatabase.rawQuery("pragma wal_checkpoint(TRUNCATE);", null);
        } finally {
          file3 = null;
        } 
      } else {
        IllegalStateException illegalStateException = new IllegalStateException();
        this("BHM:bun>NTRD");
        throw illegalStateException;
      } 
    } finally {}
    sQLiteDatabase.close();
  }
  
  public static String b(cd1 paramcd1, File paramFile) {
    try {
      fileInputStream = new FileInputStream();
      this(paramFile);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramcd1.h());
      stringBuilder.append(".tmp");
      v00 = paramcd1.x(stringBuilder.toString());
      if (!v00.l())
        v00.p(); 
    } finally {}
    FileOutputStream fileOutputStream = ws2.o(v00);
    CipherOutputStream cipherOutputStream = new CipherOutputStream();
    try {
      Cipher cipher = Cipher.getInstance(tlzLOCPTHRhep.aPUmMYN);
      cipher.init(1, h());
    } finally {
      paramFile = null;
      paramFile.printStackTrace();
    } 
    this(cipherOutputStream, g());
    DigestOutputStream digestOutputStream;
    FileInputStream fileInputStream;
    v00 v00;
    byte[] arrayOfByte = new byte[1024];
    while (true) {
      int i = fileInputStream.read(arrayOfByte);
      if (i != -1) {
        digestOutputStream.write(arrayOfByte, 0, i);
        continue;
      } 
      String str = c(digestOutputStream.getMessageDigest().digest());
      digestOutputStream.flush();
      digestOutputStream.close();
      fileInputStream.close();
      paramcd1.e();
      v00.o(paramcd1.h());
      return str;
    } 
  }
  
  public static String c(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      byte b1 = paramArrayOfbyte[b];
      if ((b1 & 0xFF) < 16) {
        stringBuffer.append("0");
        stringBuffer.append(Integer.toHexString(paramArrayOfbyte[b] & 0xFF));
      } else {
        stringBuffer.append(Integer.toHexString(b1 & 0xFF));
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static String d() {
    return MyApplication.o().getBoolean("k_b_udnidcbkf", false) ? Environment.DIRECTORY_DOWNLOADS : Environment.DIRECTORY_DOCUMENTS;
  }
  
  public static Cipher e() {
    try {
      return cipher;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static rk0 f() {
    AudioEffect audioEffect;
    rk0 rk0 = new rk0();
    try {
      audioEffect = (AudioEffect)new Equalizer();
      this(0, 1);
    } finally {
      null = null;
    } 
    try {
      null.printStackTrace();
      return rk0;
    } finally {
      if (audioEffect != null)
        try {
          audioEffect.release();
        } catch (Exception exception) {} 
    } 
  }
  
  public static MessageDigest g() {
    try {
      return MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      noSuchAlgorithmException.printStackTrace();
      return null;
    } 
  }
  
  public static SecretKey h() {
    try {
      return b;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void i(String paramString) {
    // Byte code:
    //   0: invokestatic v : ()Landroid/content/SharedPreferences;
    //   3: ldc_w 'SAF_S_ATBKPFL'
    //   6: aconst_null
    //   7: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   12: astore #4
    //   14: aload #4
    //   16: ifnull -> 35
    //   19: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   22: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   25: aload #4
    //   27: invokestatic q : (Landroid/content/Context;Ljava/lang/String;)Lv00;
    //   30: astore #4
    //   32: goto -> 38
    //   35: aconst_null
    //   36: astore #4
    //   38: aload #4
    //   40: ifnull -> 55
    //   43: aload #4
    //   45: astore #5
    //   47: aload #4
    //   49: invokevirtual k : ()Z
    //   52: ifne -> 85
    //   55: aload #4
    //   57: astore #5
    //   59: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   62: invokevirtual p : ()Z
    //   65: ifeq -> 85
    //   68: invokestatic H : ()Lv00;
    //   71: ldc_w 'Backups'
    //   74: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   77: ldc_w 'Automatic backups'
    //   80: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   83: astore #5
    //   85: iconst_0
    //   86: istore_1
    //   87: aload #5
    //   89: ifnull -> 183
    //   92: aload #5
    //   94: invokevirtual k : ()Z
    //   97: ifeq -> 183
    //   100: aload #5
    //   102: aconst_null
    //   103: invokevirtual D : (Lq01;)Ljava/util/ArrayList;
    //   106: astore #4
    //   108: aload #4
    //   110: invokevirtual size : ()I
    //   113: istore_3
    //   114: iload_1
    //   115: iload_3
    //   116: if_icmpge -> 347
    //   119: aload #4
    //   121: iload_1
    //   122: invokevirtual get : (I)Ljava/lang/Object;
    //   125: astore #5
    //   127: iload_1
    //   128: iconst_1
    //   129: iadd
    //   130: istore_2
    //   131: aload #5
    //   133: checkcast u00
    //   136: astore #6
    //   138: aload #6
    //   140: invokevirtual h : ()Ljava/lang/String;
    //   143: astore #5
    //   145: iload_2
    //   146: istore_1
    //   147: ldc_w 'zip'
    //   150: aload #5
    //   152: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   155: invokevirtual equals : (Ljava/lang/Object;)Z
    //   158: ifeq -> 114
    //   161: iload_2
    //   162: istore_1
    //   163: aload_0
    //   164: aload #5
    //   166: invokevirtual equals : (Ljava/lang/Object;)Z
    //   169: ifne -> 114
    //   172: aload #6
    //   174: invokevirtual e : ()Z
    //   177: pop
    //   178: iload_2
    //   179: istore_1
    //   180: goto -> 114
    //   183: getstatic android/os/Build$VERSION.SDK_INT : I
    //   186: bipush #30
    //   188: if_icmplt -> 347
    //   191: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   194: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   197: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   200: astore #4
    //   202: new java/lang/StringBuilder
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: astore #5
    //   211: aload #5
    //   213: invokestatic d : ()Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #5
    //   222: ldc_w '/Musicolet/Backups/'
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #5
    //   231: invokevirtual toString : ()Ljava/lang/String;
    //   234: astore #6
    //   236: ldc_w 'external_primary'
    //   239: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   242: astore #5
    //   244: aload #4
    //   246: aload #5
    //   248: iconst_1
    //   249: anewarray java/lang/String
    //   252: dup
    //   253: iconst_0
    //   254: ldc_w '_id'
    //   257: aastore
    //   258: ldc_w 'relative_path like ? AND _display_name != ? AND _display_name like ?'
    //   261: iconst_3
    //   262: anewarray java/lang/String
    //   265: dup
    //   266: iconst_0
    //   267: aload #6
    //   269: aastore
    //   270: dup
    //   271: iconst_1
    //   272: aload_0
    //   273: aastore
    //   274: dup
    //   275: iconst_2
    //   276: ldc_w '%.zip'
    //   279: aastore
    //   280: ldc_w 'date_modified'
    //   283: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   286: astore_0
    //   287: aload_0
    //   288: ifnull -> 347
    //   291: aload_0
    //   292: invokeinterface getCount : ()I
    //   297: pop
    //   298: aload_0
    //   299: invokeinterface moveToNext : ()Z
    //   304: ifeq -> 341
    //   307: aload #4
    //   309: aload #5
    //   311: ldc_w '_id=?'
    //   314: iconst_1
    //   315: anewarray java/lang/String
    //   318: dup
    //   319: iconst_0
    //   320: ldc_w ''
    //   323: aload_0
    //   324: iconst_0
    //   325: invokeinterface getInt : (I)I
    //   330: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   333: aastore
    //   334: invokevirtual delete : (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   337: pop
    //   338: goto -> 298
    //   341: aload_0
    //   342: invokeinterface close : ()V
    //   347: return
  }
  
  public static void j() {
    byte b;
    long l;
    Context context = MyApplication.i.getApplicationContext();
    context.getClass();
    q72 q72 = q72.a(context);
    q72.getClass();
    hp2 hp2 = q72.b.m;
    String str = "CancelWorkByName_".concat("abk");
    tk1 tk1 = (tk1)q72.d.c;
    tk1.getClass();
    qz1.J(hp2, str, tk1, new ii(q72, 0));
    if (MyApplication.o().getBoolean("k_b_atbkpe", true)) {
      b = 0;
    } else {
      b = -1;
    } 
    Calendar calendar = Calendar.getInstance();
    calendar.getTimeInMillis();
    if (b == 0) {
      if (calendar.get(11) < 2) {
        calendar.set(11, 2);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        l = calendar.getTimeInMillis();
      } else {
        calendar.add(5, 1);
        calendar.set(11, 2);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        l = calendar.getTimeInMillis();
      } 
    } else {
      l = -1L;
    } 
    if (l != -1L) {
      zv0 zv0 = new zv0(AutoBackupWorker.class);
      long l1 = System.currentTimeMillis();
      TimeUnit.MILLISECONDS.getClass();
      ((y72)zv0.e).g = l - l1;
      if (Long.MAX_VALUE - System.currentTimeMillis() > ((y72)zv0.e).g) {
        List list = zo2.E(zv0.k());
        (new f72(q72, "abk", k60.b, list)).a();
        MyApplication.x().edit().putLong("stlldcatbkp", l).apply();
        return;
      } 
      l0.l("The given initial delay is too large and will cause an overflow!");
      return;
    } 
    MyApplication.x().edit().remove("stlldcatbkp").apply();
  }
  
  public static String k(SharedPreferences paramSharedPreferences, cd1 paramcd1) {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this(paramSharedPreferences.getAll());
      Set set = hashMap.keySet();
      ik0 ik0 = new ik0();
      return n(ik0, paramcd1);
    } finally {
      paramSharedPreferences = null;
      paramSharedPreferences.printStackTrace();
    } 
  }
  
  public static void l(pc parampc) {
    boolean bool = parampc instanceof in.krosbits.musicolet.MusicActivity;
    if (Build.VERSION.SDK_INT >= 30) {
      ag0.O0(2131887341, 1);
      Intent intent = (new Intent("android.intent.action.OPEN_DOCUMENT")).setType(GMDx.CCsZFfR).putExtra("android.content.extra.SHOW_ADVANCED", true).addFlags(1).addCategory("android.intent.category.OPENABLE");
      if (bool) {
        String str = yp1.e;
        intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)DocumentsContract.buildRootUri("com.android.externalstorage.documents", "primary"));
      } 
      try {
        parampc.startActivityForResult(intent, 10101);
        return;
      } catch (ActivityNotFoundException activityNotFoundException) {
        activityNotFoundException.printStackTrace();
        wp1.K0((Context)parampc);
        return;
      } 
    } 
    (new z00((Context)parampc, parampc.getString(2131887341), false, false, false, new HashSet(Collections.singletonList("zip")), parampc.getString(2131887338), parampc.getString(2131886278), null, new sb(parampc, bool))).e();
  }
  
  public static void m(u00 paramu00, Context paramContext, boolean paramBoolean) {
    try {
      rb rb = new rb();
      this(paramu00, paramContext, paramBoolean);
      ExecutorService executorService = a;
      String str = ag0.a;
      rb.executeOnExecutor(executorService, new Object[0]);
    } finally {
      paramu00 = null;
      n21.v(paramu00.toString());
    } 
  }
  
  public static String n(nk0 paramnk0, v00 paramv00) {
    DigestOutputStream digestOutputStream;
    OutputStreamWriter outputStreamWriter;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramv00.h());
    stringBuilder.append(".tmp");
    v00 v001 = paramv00.x(stringBuilder.toString());
    if (!v001.l())
      v001.p(); 
    FileOutputStream fileOutputStream = ws2.o(v001);
    try {
      Cipher cipher = Cipher.getInstance("Blowfish");
      cipher.init(1, h());
    } finally {
      stringBuilder = null;
      stringBuilder.printStackTrace();
    } 
    my my = new my();
    try {
      cl0 cl0 = new cl0();
      this(outputStreamWriter);
      cl0.q((na0)my.h);
      cl0.k = my.b;
      cl0.r(2);
      cl0.m = false;
      my.e(paramnk0, cl0);
      outputStreamWriter.flush();
      outputStreamWriter.close();
      String str = c(digestOutputStream.getMessageDigest().digest());
      paramv00.e();
      v001.o(paramv00.h());
      return str;
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */