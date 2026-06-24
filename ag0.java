import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.material.slider.Slider;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.musicolet.FileUtilsActivity;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.PlaylistActivity;
import in.krosbits.musicolet.fh;
import in.krosbits.nativex.FDTS;
import in.krosbits.utils.SgV.zpEN;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.json.JSONArray;
import org.json.JSONException;
import r3.IKWi.AyxAR;

public abstract class ag0 {
  public static final int A;
  
  public static String a;
  
  public static km0[] b;
  
  public static km0[] c;
  
  public static String d;
  
  public static boolean e;
  
  public static boolean f;
  
  public static Toast g;
  
  public static boolean h;
  
  public static boolean i;
  
  public static final boolean j;
  
  public static boolean k;
  
  public static boolean l;
  
  public static final Handler m = new Handler(Looper.getMainLooper());
  
  public static final Handler n;
  
  public static long o;
  
  public static long p;
  
  public static long q;
  
  public static final yf0 r = new yf0(0);
  
  public static final Pattern s = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
  
  public static final Pattern t;
  
  public static final Pattern u = Pattern.compile("(((\\s|_)*)((\\+|\\*|\\-|~|=|\\||&|:|;|\\\\|\\/|@)*)((\\s|_)*)((?i)([0-9]+)(\\s|\\-|_)*(kbps|mbps)))");
  
  public static final Pattern v = Pattern.compile("((?i)(music|lyrics|(lyricist(s|/s)?|production))(\\s*)(\\:)(\\s*))");
  
  public static final Pattern w = Pattern.compile(FgdLmmRfTxSFKI.mJiNJrZoVvrKY);
  
  public static final Pattern x = Pattern.compile("((((\\+|\\*|\\-|~|=|\\||&|:|;|\\\\|\\/|@)*)((\\s|_)*))*(\\Z))");
  
  public static final Pattern y = Pattern.compile("((\\A)(((\\+|\\*|\\-|~|=|\\||&|:|;|\\\\|\\/|@)*)((\\s|_)*))*)");
  
  public static final Pattern z = Pattern.compile("((^\\.$)|(^\\.\\.$)|((\\/|:|\\*|\\?|\\\\|<|>|\\|)))");
  
  static {
    A = 1;
  }
  
  public static ArrayList A() {
    ArrayList<String> arrayList = new ArrayList();
    boolean bool = MyApplication.F.p();
    int i = 0;
    int j = 0;
    if (bool) {
      String str = MyApplication.o().getString("jsa_icdfl", null);
      if (str != null)
        try {
          JSONArray jSONArray = new JSONArray();
          this(str);
          for (i = 0; i < jSONArray.length(); i++)
            arrayList.add(jSONArray.getString(i)); 
        } catch (JSONException jSONException) {} 
      if (arrayList.size() == 0) {
        ArrayList<String> arrayList1 = MyApplication.F.j();
        int k = arrayList1.size();
        i = j;
        while (i < k) {
          str = arrayList1.get(i);
          i++;
          arrayList.add(((v00)str).b.toString());
        } 
      } 
    } else if (Build.VERSION.SDK_INT >= 30) {
      ArrayList<Object> arrayList1 = MyApplication.G.b();
      j = arrayList1.size();
      while (i < j) {
        Object object = arrayList1.get(i);
        i++;
        arrayList.add(((v00)object).b.toString());
      } 
    } 
    return arrayList;
  }
  
  public static void A0(Menu paramMenu, HashMap paramHashMap) {
    B0(paramMenu, paramHashMap, m92.h[6]);
  }
  
  public static String B(long paramLong, boolean paramBoolean, int paramInt) {
    long l1 = paramLong;
    if (paramBoolean)
      l1 = paramInt - paramLong; 
    l1 /= 1000L;
    paramLong = l1 / 3600L;
    long l2 = l1 - 3600L * paramLong;
    l1 = l2 / 60L;
    l2 -= 60L * l1;
    StringBuilder stringBuilder = new StringBuilder(5);
    if (paramBoolean)
      stringBuilder.append("-"); 
    paramInt = paramLong cmp 0L;
    if (paramInt > 0) {
      stringBuilder.append(paramLong);
      stringBuilder.append(":");
    } 
    if (l1 < 10L && paramInt > 0)
      stringBuilder.append("0"); 
    stringBuilder.append(l1);
    stringBuilder.append(":");
    if (l2 < 10L)
      stringBuilder.append("0"); 
    stringBuilder.append(l2);
    return stringBuilder.toString();
  }
  
  public static void B0(Menu paramMenu, HashMap paramHashMap, int paramInt) {
    for (byte b = 0; b < paramMenu.size(); b++) {
      SubMenu subMenu;
      MenuItem menuItem = paramMenu.getItem(b);
      menuItem.getItemId();
      Drawable drawable = menuItem.getIcon();
      if (drawable != null)
        menuItem.setIcon(C0(paramInt, drawable.mutate())); 
      if (paramHashMap != null) {
        Boolean bool = (Boolean)paramHashMap.get(Integer.valueOf(menuItem.getItemId()));
        if (bool != null && !bool.booleanValue())
          menuItem.setVisible(false); 
      } 
      if (menuItem.hasSubMenu()) {
        subMenu = menuItem.getSubMenu();
      } else {
        subMenu = paramMenu.getItem(b).getSubMenu();
      } 
      if (subMenu != null) {
        int i = subMenu.size();
        for (byte b1 = 0; b1 < i; b1++) {
          MenuItem menuItem1 = subMenu.getItem(b1);
          Drawable drawable1 = menuItem1.getIcon();
          if (drawable1 != null)
            menuItem1.setIcon(C0(paramInt, drawable1.mutate())); 
          if (paramHashMap != null) {
            Boolean bool = (Boolean)paramHashMap.get(Integer.valueOf(menuItem1.getItemId()));
            if (bool != null && !bool.booleanValue())
              menuItem1.setVisible(false); 
          } 
        } 
      } 
    } 
  }
  
  public static String C(String paramString) {
    if (paramString != null) {
      int i = paramString.lastIndexOf(".");
      if (i != -1)
        try {
          return paramString.substring(i + 1).toLowerCase(Locale.ENGLISH);
        } finally {} 
    } 
    return "";
  }
  
  public static Drawable C0(int paramInt, Drawable paramDrawable) {
    if (paramDrawable == null)
      return paramDrawable; 
    paramDrawable.setColorFilter(0xFF000000 | paramInt, PorterDuff.Mode.SRC_ATOP);
    paramDrawable.setAlpha(Color.alpha(paramInt));
    return paramDrawable;
  }
  
  public static String D(double paramDouble) {
    String str;
    paramDouble /= 100.0D;
    if (paramDouble > 0.0D) {
      str = "+";
    } else {
      str = "";
    } 
    return str.concat(String.format(Locale.ENGLISH, "%.1f", new Object[] { Double.valueOf(paramDouble) }));
  }
  
  public static boolean D0(SharedPreferences paramSharedPreferences, km0 paramkm0) {
    if (paramSharedPreferences.getBoolean("k_b_rlpis", false)) {
      int i = paramSharedPreferences.getInt("k_i_rlpmd", 9);
      if (paramkm0.c.g >= i * 60000)
        return true; 
    } 
    return false;
  }
  
  public static String E(String paramString) {
    return r0(paramString.replace("(", "").replace(")", "").replace("[", "").replace("]", "").replace("<", "").replace(">", "").replace("{", "").replace("}", ""), false).replace("-", "").replace("_", "").replace(".", "").replace("!", "").replace("@", "").replace("#", "").replace("$", "").replace("%", "").replace("&", "").replace("*", "").replace(":", "").replace("~", "").replace("+", "").replace("=", "").replace("|", "").replace("\\", "").replace("/", "").replace(";", "").replace(nFLlOYeP.jXzsxlp, "").replace("\"", "").replace(",", "").replace("?", "").replace(" ", "");
  }
  
  public static boolean E0(int paramInt) {
    int i = Color.red(paramInt);
    int j = Color.green(paramInt);
    paramInt = Color.blue(paramInt);
    double d1 = i;
    double d2 = j;
    return !(1.0D - (paramInt * 0.114D + d2 * 0.587D + d1 * 0.299D) / 255.0D < 0.5D);
  }
  
  public static ArrayList F(Context paramContext) {
    ArrayList<String> arrayList = new ArrayList();
    File[] arrayOfFile = paramContext.getExternalFilesDirs(null);
    int i = arrayOfFile.length;
    byte b = 0;
    while (true) {
      if (b < i) {
        File file = arrayOfFile[b];
        if (file != null && !file.equals(paramContext.getExternalFilesDir(null))) {
          int j = file.getAbsolutePath().lastIndexOf("/Android/data");
          if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("Unexpected exfd: ");
            stringBuilder.append(file.getAbsolutePath());
            n21.F(stringBuilder.toString());
          } else {
            String str1 = file.getAbsolutePath().substring(0, j);
            try {
              File file1 = new File();
              this(str1);
              String str2 = file1.getCanonicalPath();
              str1 = str2;
            } catch (IOException iOException) {}
            arrayList.add(str1);
          } 
        } 
        b++;
        continue;
      } 
      String str = Environment.getExternalStorageDirectory().getAbsolutePath();
      if (!arrayList.contains(str))
        arrayList.add(0, str); 
      return arrayList;
    } 
  }
  
  public static void F0(Context paramContext, ArrayList paramArrayList, km0 paramkm0, boolean paramBoolean1, ww paramww, boolean paramBoolean2, DialogInterface.OnDismissListener paramOnDismissListener) {
    if (paramArrayList == null)
      return; 
    List<String> list = Arrays.asList(new String[] { paramContext.getString(2131887386), paramContext.getString(2131887390), paramContext.getString(2131887385), paramContext.getString(2131887391), paramContext.getString(2131887393), paramContext.getString(2131887392) });
    String str6 = paramContext.getString(2131886155);
    String str4 = paramContext.getString(2131886211);
    String str17 = paramContext.getString(2131886154);
    String str8 = paramContext.getString(2131886398);
    String str15 = paramContext.getString(2131886629);
    String str2 = paramContext.getString(2131886603);
    String str14 = paramContext.getString(2131886137);
    String str7 = paramContext.getString(2131886205);
    String str5 = paramContext.getString(2131886150);
    String str18 = paramContext.getString(2131886394);
    String str12 = paramContext.getString(2131886624);
    String str13 = paramContext.getString(2131886582);
    String str3 = paramContext.getString(2131887430);
    String str9 = paramContext.getString(2131887432);
    String str16 = paramContext.getString(2131887431);
    String str1 = paramContext.getString(2131887434);
    String str11 = paramContext.getString(2131887436);
    String str10 = paramContext.getString(2131887435);
    Drawable drawable = C0(m92.h[5], paramContext.getResources().getDrawable(2131231075));
    ms0 ms0 = new ms0(paramContext);
    ms0.q(2131886131);
    ms0.S = drawable;
    ms0.h(list);
    ms0.P = false;
    ms0.j(new wf0(new int[] { 0, 1, 2, 3, 4, 5 }, paramArrayList, paramkm0, paramBoolean2, paramContext, new String[] { str6, str4, str17, str8, str15, str2 }, new String[] { str14, str7, str5, str18, str12, str13 }, new String[] { str3, str9, str16, str1, str11, str10 }, list, paramOnDismissListener, paramBoolean1, paramww));
    ms0.W = paramOnDismissListener;
    ms0.p();
  }
  
  public static PendingIntent G(Context paramContext, Intent paramIntent) {
    if (c0()) {
      paramIntent.addFlags(1350565888);
      return PendingIntent.getActivity(paramContext, 0, paramIntent, 167772160, r());
    } 
    Intent intent = new Intent(paramIntent);
    intent.putExtra("tclass", paramIntent.getComponent().getClassName());
    intent.putExtra("E_IA", true);
    intent.setClass(MyApplication.i.getApplicationContext(), fh.class);
    return PendingIntent.getBroadcast(paramContext, 0, intent, 167772160);
  }
  
  public static void G0(View paramView) {
    if (paramView != null) {
      CharSequence charSequence = paramView.getContentDescription();
      if (charSequence != null && charSequence.length() > 0) {
        Context context = paramView.getContext();
        if (context instanceof Activity)
          try {
            Window window = ((Activity)context).getWindow();
            charSequence = charSequence.toString();
            Toast toast = g;
            if (toast != null)
              toast.cancel(); 
          } finally {
            paramView = null;
          }  
      } 
    } 
  }
  
  public static v00 H() {
    try {
      return v00;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void H0(Context paramContext, View paramView) {
    if (paramView != null)
      try {
        return;
      } finally {
        paramContext = null;
      }  
  }
  
  public static v00 I() {
    try {
      v00 v00 = MyApplication.F.i().d();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(Environment.DIRECTORY_PICTURES);
      stringBuilder.append("/Musicolet");
      v00 = v00.A(stringBuilder.toString());
      if (!v00.k())
        v00.E(); 
      return v00;
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public static void I0(Context paramContext, Window paramWindow) {
    try {
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static String J(String paramString) {
    String str;
    try {
      int i = paramString.lastIndexOf('.');
      str = paramString;
    } finally {
      Exception exception = null;
    } 
    return str;
  }
  
  public static void J0(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, Drawable paramDrawable, String paramString, int paramInt, List paramList, int[] paramArrayOfint, Uri paramUri, qi0 paramqi0, Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3: aload #4
    //   5: iload #5
    //   7: invokeinterface getInt : (Ljava/lang/String;I)I
    //   12: istore #12
    //   14: iconst_0
    //   15: istore #11
    //   17: iload #11
    //   19: aload #7
    //   21: arraylength
    //   22: if_icmpge -> 44
    //   25: aload #7
    //   27: iload #11
    //   29: iaload
    //   30: iload #12
    //   32: if_icmpne -> 38
    //   35: goto -> 47
    //   38: iinc #11, 1
    //   41: goto -> 17
    //   44: iconst_m1
    //   45: istore #11
    //   47: new ms0
    //   50: dup
    //   51: aload_0
    //   52: invokespecial <init> : (Landroid/content/Context;)V
    //   55: astore #13
    //   57: aload #13
    //   59: aload_1
    //   60: putfield f : Ljava/lang/CharSequence;
    //   63: aload #13
    //   65: aload_2
    //   66: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   69: aload #13
    //   71: aload_3
    //   72: putfield S : Landroid/graphics/drawable/Drawable;
    //   75: aload #13
    //   77: aload #6
    //   79: iconst_0
    //   80: anewarray java/lang/CharSequence
    //   83: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   88: checkcast [Ljava/lang/CharSequence;
    //   91: invokevirtual i : ([Ljava/lang/CharSequence;)V
    //   94: new mg
    //   97: dup
    //   98: aload #7
    //   100: iload #12
    //   102: aload #4
    //   104: aload #10
    //   106: invokespecial <init> : ([IILjava/lang/String;Ljava/lang/Runnable;)V
    //   109: astore_1
    //   110: aload #13
    //   112: iload #11
    //   114: putfield M : I
    //   117: aload #13
    //   119: aconst_null
    //   120: putfield E : Los0;
    //   123: aload #13
    //   125: aload_1
    //   126: putfield F : Lqs0;
    //   129: aload #13
    //   131: aconst_null
    //   132: putfield G : Lps0;
    //   135: aload #13
    //   137: ldc_w 2131886278
    //   140: invokevirtual n : (I)V
    //   143: aload #13
    //   145: iconst_1
    //   146: putfield I : Z
    //   149: aload #13
    //   151: new tf0
    //   154: dup
    //   155: aload_0
    //   156: aload #8
    //   158: aload #4
    //   160: iload #5
    //   162: aload #10
    //   164: invokespecial <init> : (Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;ILjava/lang/Runnable;)V
    //   167: putfield D : Lrs0;
    //   170: iload #5
    //   172: iload #12
    //   174: if_icmpeq -> 185
    //   177: aload #13
    //   179: ldc_w 2131887193
    //   182: invokevirtual l : (I)V
    //   185: getstatic m92.h : [I
    //   188: bipush #6
    //   190: iaload
    //   191: istore #5
    //   193: aload #13
    //   195: aload #13
    //   197: getfield b : Landroid/content/Context;
    //   200: iload #5
    //   202: invokestatic w : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   205: putfield z : Landroid/content/res/ColorStateList;
    //   208: aload #13
    //   210: invokevirtual p : ()Lss0;
    //   213: astore_0
    //   214: aload #9
    //   216: ifnull -> 234
    //   219: aload_0
    //   220: getfield m : Landroid/widget/TextView;
    //   223: astore_0
    //   224: aload_0
    //   225: ifnull -> 234
    //   228: aload_0
    //   229: aload #9
    //   231: invokevirtual setMovementMethod : (Landroid/text/method/MovementMethod;)V
    //   234: return
  }
  
  public static u00 K() {
    Exception exception;
    String str;
    try {
      uo0 uo0 = uo0.b(Calendar.getInstance());
      str = ju.a("yyyy-MM-dd HH-mm-ss").b(uo0).concat(".zip");
      String str1 = MyApplication.v().getString("SAF_S_ATBKPFL", null);
      if (str1 != null) {
        v00 v00 = v00.q(MyApplication.i.getApplicationContext(), str1);
        v00.E();
      } else {
        str1 = null;
      } 
    } finally {}
    if (exception != null && exception.k())
      return exception.A(str); 
    if (MyApplication.F.p()) {
      v00 v00 = H().A("Backups").A("Automatic backups");
      if (!v00.k())
        v00.E(); 
      return v00.A(str);
    } 
    if (Build.VERSION.SDK_INT >= 30) {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(tb.d());
      stringBuilder.append("/Musicolet/Backups/");
      String str1 = stringBuilder.toString();
      ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      ContentValues contentValues = new ContentValues();
      this();
      contentValues.put("_display_name", str);
      contentValues.put("relative_path", str1);
      Uri uri = contentResolver.insert(MediaStore.Files.getContentUri("external_primary"), contentValues);
      if (uri != null)
        return new c91(MyApplication.i.getApplicationContext(), uri); 
    } 
    return null;
  }
  
  public static void K0(Context paramContext, String paramString1, Drawable paramDrawable, String paramString2, int paramInt1, int paramInt2, int paramInt3, Uri paramUri, Runnable paramRunnable) {
    J0(paramContext, paramString1, null, paramDrawable, paramString2, paramInt1, Arrays.asList(MyApplication.i.getApplicationContext().getResources().getStringArray(paramInt3)), MyApplication.i.getApplicationContext().getResources().getIntArray(paramInt2), paramUri, null, paramRunnable);
  }
  
  public static ArrayList L(HashMap<Object, ArrayList> paramHashMap, Object paramObject) {
    ArrayList arrayList2 = (ArrayList)paramHashMap.get(paramObject);
    ArrayList arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      paramHashMap.put(paramObject, arrayList1);
    } 
    return arrayList1;
  }
  
  public static void L0(Context paramContext, String paramString1, Drawable paramDrawable, String paramString2, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, Runnable paramRunnable) {
    // Byte code:
    //   0: aload #6
    //   2: invokestatic R : ([I)Ljava/util/ArrayList;
    //   5: astore #6
    //   7: invokestatic o : ()Landroid/content/SharedPreferences;
    //   10: aload_3
    //   11: iload #4
    //   13: invokeinterface getInt : (Ljava/lang/String;I)I
    //   18: istore #9
    //   20: iconst_0
    //   21: istore #8
    //   23: iload #8
    //   25: aload #5
    //   27: arraylength
    //   28: if_icmpge -> 50
    //   31: aload #5
    //   33: iload #8
    //   35: iaload
    //   36: iload #9
    //   38: if_icmpne -> 44
    //   41: goto -> 53
    //   44: iinc #8, 1
    //   47: goto -> 23
    //   50: iconst_m1
    //   51: istore #8
    //   53: new ms0
    //   56: dup
    //   57: aload_0
    //   58: invokespecial <init> : (Landroid/content/Context;)V
    //   61: astore_0
    //   62: aload_0
    //   63: aload_1
    //   64: putfield f : Ljava/lang/CharSequence;
    //   67: aload_0
    //   68: aload_2
    //   69: putfield S : Landroid/graphics/drawable/Drawable;
    //   72: aload_0
    //   73: aload #6
    //   75: invokevirtual h : (Ljava/util/Collection;)V
    //   78: new xw
    //   81: dup
    //   82: aload_3
    //   83: aload #5
    //   85: aload #7
    //   87: iconst_1
    //   88: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   91: astore_1
    //   92: aload_0
    //   93: iload #8
    //   95: putfield M : I
    //   98: aload_0
    //   99: aconst_null
    //   100: putfield E : Los0;
    //   103: aload_0
    //   104: aload_1
    //   105: putfield F : Lqs0;
    //   108: aload_0
    //   109: aconst_null
    //   110: putfield G : Lps0;
    //   113: aload_0
    //   114: ldc_w 2131886278
    //   117: invokevirtual k : (I)V
    //   120: aload_0
    //   121: new vf0
    //   124: dup
    //   125: iload #4
    //   127: aload_3
    //   128: aload #7
    //   130: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   133: putfield D : Lrs0;
    //   136: iload #4
    //   138: iload #9
    //   140: if_icmpeq -> 150
    //   143: aload_0
    //   144: ldc_w 2131887193
    //   147: invokevirtual l : (I)V
    //   150: aload_0
    //   151: invokevirtual p : ()Lss0;
    //   154: pop
    //   155: return
  }
  
  public static PendingIntent M(Context paramContext, int paramInt, Intent paramIntent, boolean paramBoolean) {
    if (!paramBoolean && Build.VERSION.SDK_INT >= 26) {
      Intent intent = new Intent(paramIntent);
      intent.putExtra("tclass", paramIntent.getComponent().getClassName());
      intent.setClass(MyApplication.i.getApplicationContext(), fh.class);
      return PendingIntent.getBroadcast(paramContext, paramInt, intent, 167772160);
    } 
    return PendingIntent.getService(paramContext, paramInt, paramIntent, 167772160);
  }
  
  public static void M0(Context paramContext, GhostSearchActivity paramGhostSearchActivity) {
    im0.p();
    HashSet hashSet2 = im0.k0;
    int i = hashSet2.size();
    HashSet hashSet1 = im0.m0;
    HashSet<?> hashSet = new HashSet(hashSet1.size() + i);
    hashSet.addAll(hashSet2);
    hashSet.addAll(hashSet1);
    ArrayList<Comparable> arrayList = new ArrayList(hashSet);
    Collections.sort(arrayList);
    StringBuilder stringBuilder2 = new StringBuilder("<b><u>");
    stringBuilder2.append(paramContext.getString(2131886960));
    stringBuilder2.append("</u></b><br/>");
    stringBuilder2.append(paramContext.getString(2131886961));
    stringBuilder2.append("<br/>");
    stringBuilder2.append(TextUtils.join(", ", arrayList));
    hashSet.clear();
    arrayList.clear();
    hashSet.addAll(im0.j0);
    hashSet.addAll(im0.l0);
    arrayList.addAll(hashSet);
    Collections.sort(arrayList);
    stringBuilder2.append("<br/><br/><b><u>");
    stringBuilder2.append(paramContext.getString(2131887482));
    stringBuilder2.append("</u></b><br/>");
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(Build.MANUFACTURER);
    stringBuilder1.append(" ");
    stringBuilder1.append(Build.MODEL);
    stringBuilder2.append(paramContext.getString(2131887474, new Object[] { stringBuilder1.toString() }));
    stringBuilder2.append("<br/>");
    stringBuilder2.append(TextUtils.join(", ", arrayList));
    ms0 ms0 = new ms0(paramContext);
    ms0.q(2131887473);
    ms0.d((CharSequence)Html.fromHtml(stringBuilder2.toString()));
    ms0.n(2131887030);
    if (paramGhostSearchActivity != null)
      ms0.W = (DialogInterface.OnDismissListener)paramGhostSearchActivity; 
    TextView textView = (ms0.p()).m;
    textView.setMovementMethod(LinkMovementMethod.getInstance());
    textView.setOnLongClickListener((View.OnLongClickListener)new Object());
  }
  
  public static String[] N(String paramString) {
    String[] arrayOfString = i0(paramString.trim().toUpperCase().toLowerCase()).split("(\\s)+");
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = arrayOfString[b].toLowerCase(); 
    return arrayOfString;
  }
  
  public static void N0(View paramView, Window paramWindow, String paramString) {
    Toast toast = g;
    if (toast != null)
      toast.cancel(); 
    if (paramView == null)
      return; 
    try {
      Toast toast1 = Toast.makeText(MyApplication.i.getApplicationContext(), paramString, 0);
      g = toast1;
      return;
    } finally {
      paramView = null;
      paramView.printStackTrace();
    } 
  }
  
  public static String O(Context paramContext, Stack paramStack) {
    String str = paramContext.getResources().getString(2131887092);
    for (byte b = 0;; b++) {
      StringBuilder stringBuilder = ga1.l(str, " ");
      stringBuilder.append((char)(b + 65));
      String str1 = stringBuilder.toString();
      if (!l(str1, paramStack))
        return str1; 
    } 
  }
  
  public static void O0(int paramInt1, int paramInt2) {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static v00 P() {
    try {
      return v00;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void P0(int paramInt, CharSequence paramCharSequence, boolean paramBoolean) {
    of0 of0 = new of0(paramInt, paramCharSequence, paramBoolean);
    m.post(of0);
  }
  
  public static String Q(String paramString) {
    return x41.k("SAF_S_URI_SV_", paramString);
  }
  
  public static String Q0(Object paramObject) {
    return (paramObject != null) ? paramObject.toString() : null;
  }
  
  public static ArrayList R(int[] paramArrayOfint) {
    ArrayList<String> arrayList = new ArrayList(paramArrayOfint.length);
    int i = paramArrayOfint.length;
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      arrayList.add(MyApplication.i.getApplicationContext().getString(j));
    } 
    return arrayList;
  }
  
  public static ArrayList S(ArrayList<Object> paramArrayList) {
    ArrayList<fq1> arrayList = new ArrayList(paramArrayList.size());
    int i = paramArrayList.size();
    byte b = 0;
    while (b < i) {
      String str = (String)paramArrayList.get(b);
      b++;
      arrayList.add(new fq1(str));
    } 
    return arrayList;
  }
  
  public static StateListDrawable T(Context paramContext, int paramInt1, float paramFloat, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    Drawable drawable2 = paramContext.getResources().getDrawable(2131231669).mutate();
    Drawable drawable3 = paramContext.getResources().getDrawable(2131231669).mutate();
    Drawable drawable1 = paramContext.getResources().getDrawable(2131231688).mutate();
    if (drawable2 instanceof GradientDrawable && drawable1 instanceof GradientDrawable) {
      GradientDrawable gradientDrawable = (GradientDrawable)drawable2;
      gradientDrawable.setColor(paramInt3);
      gradientDrawable.setStroke(paramInt1, paramInt2);
      gradientDrawable.setCornerRadius(paramFloat);
      gradientDrawable = (GradientDrawable)drawable3;
      gradientDrawable.setColor((int)(Color.alpha(paramInt3) * 0.45D) << 24 | 0xFFFFFF & paramInt3);
      gradientDrawable.setStroke(paramInt1, paramInt5);
      gradientDrawable.setCornerRadius(paramFloat);
      gradientDrawable = (GradientDrawable)drawable1;
      gradientDrawable.setStroke(paramInt1, paramInt5);
      gradientDrawable.setCornerRadius(paramFloat);
      gradientDrawable.setColor(paramInt4);
    } 
    StateListDrawable stateListDrawable = new StateListDrawable();
    stateListDrawable.addState(new int[] { 16842919 }, drawable2);
    stateListDrawable.addState(new int[] { 16842908 }, drawable2);
    stateListDrawable.addState(new int[] { 16843518 }, drawable3);
    stateListDrawable.addState(new int[0], drawable1);
    return stateListDrawable;
  }
  
  public static StateListDrawable U(Context paramContext, int paramInt1, int paramInt2) {
    float f = MyApplication.p;
    return V(paramContext, paramInt1, paramInt2, (int)f, f * 40.0F);
  }
  
  public static StateListDrawable V(Context paramContext, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    int i = 0xFFFFFF & paramInt1 | 0x22000000;
    if (paramInt2 != 0)
      i = jn.c(Color.alpha(paramInt2) / 255.0F, i, 0xFF000000 | paramInt2); 
    if (paramInt2 == 0)
      paramInt2 = 0; 
    return T(paramContext, paramInt3, paramFloat, paramInt1, i, paramInt2, paramInt1);
  }
  
  public static String W(km0 paramkm0) {
    return h ? paramkm0.g : paramkm0.c.b;
  }
  
  public static int X(int paramInt1, int paramInt2) {
    return (paramInt1 <= 0) ? 2131231430 : ((paramInt1 / paramInt2 <= 0.5D) ? 2131231429 : 2131231431);
  }
  
  public static void Y(pc parampc, boolean paramBoolean, GhostSearchActivity paramGhostSearchActivity) {
    // Byte code:
    //   0: getstatic com/google/android/gms/common/internal/Qg/jHxlGgUTadw.OolsnYsiJ : Ljava/lang/String;
    //   3: astore #8
    //   5: aload_0
    //   6: invokevirtual getPackageName : ()Ljava/lang/String;
    //   9: astore #9
    //   11: aload_0
    //   12: ldc_w 2131886189
    //   15: invokevirtual getString : (I)Ljava/lang/String;
    //   18: astore #10
    //   20: new ms0
    //   23: astore #11
    //   25: aload #11
    //   27: aload_0
    //   28: invokespecial <init> : (Landroid/content/Context;)V
    //   31: aload #11
    //   33: ldc_w 2131492949
    //   36: iconst_1
    //   37: invokevirtual e : (IZ)V
    //   40: aload #11
    //   42: getfield u : Landroid/view/View;
    //   45: astore #12
    //   47: aload #12
    //   49: ldc_w 2131296372
    //   52: invokevirtual findViewById : (I)Landroid/view/View;
    //   55: checkcast com/google/android/material/button/MaterialButton
    //   58: astore #13
    //   60: aload #12
    //   62: ldc_w 2131296764
    //   65: invokevirtual findViewById : (I)Landroid/view/View;
    //   68: checkcast androidx/constraintlayout/widget/Group
    //   71: astore #14
    //   73: aload #12
    //   75: ldc_w 2131297750
    //   78: invokevirtual findViewById : (I)Landroid/view/View;
    //   81: checkcast android/widget/TextView
    //   84: astore #7
    //   86: aload #12
    //   88: ldc_w 2131297790
    //   91: invokevirtual findViewById : (I)Landroid/view/View;
    //   94: checkcast android/widget/TextView
    //   97: astore #15
    //   99: iload_1
    //   100: ifeq -> 109
    //   103: aload #15
    //   105: iconst_0
    //   106: invokevirtual setVisibility : (I)V
    //   109: invokestatic p : ()Landroid/os/PowerManager;
    //   112: aload #9
    //   114: invokevirtual isIgnoringBatteryOptimizations : (Ljava/lang/String;)Z
    //   117: ifne -> 154
    //   120: aload #14
    //   122: iconst_0
    //   123: invokevirtual setVisibility : (I)V
    //   126: new xf0
    //   129: astore #14
    //   131: aload #14
    //   133: aload_0
    //   134: aload #9
    //   136: aload #10
    //   138: invokespecial <init> : (Lpc;Ljava/lang/String;Ljava/lang/String;)V
    //   141: aload #13
    //   143: aload #14
    //   145: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   148: iconst_0
    //   149: istore #4
    //   151: goto -> 157
    //   154: iconst_1
    //   155: istore #4
    //   157: iload #4
    //   159: ifeq -> 625
    //   162: new java/lang/StringBuilder
    //   165: astore #13
    //   167: aload #13
    //   169: ldc_w '<br/>'
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: aload #13
    //   177: aload_0
    //   178: ldc_w 2131886174
    //   181: invokevirtual getString : (I)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: invokestatic D : ()Z
    //   191: istore #6
    //   193: iload #6
    //   195: ifeq -> 225
    //   198: aload #13
    //   200: ldc_w '<br/><br/>'
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #13
    //   209: aload_0
    //   210: ldc_w 2131886191
    //   213: invokevirtual getString : (I)Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: iconst_1
    //   221: istore_3
    //   222: goto -> 227
    //   225: iconst_0
    //   226: istore_3
    //   227: invokestatic G : ()Z
    //   230: ifeq -> 255
    //   233: aload #13
    //   235: ldc_w '<br/><br/>'
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload #13
    //   244: aload_0
    //   245: ldc_w 2131886193
    //   248: invokevirtual getString : (I)Ljava/lang/String;
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   258: astore #14
    //   260: aload #14
    //   262: ldc_w 'samsung'
    //   265: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   268: ifeq -> 301
    //   271: getstatic android/os/Build$VERSION.SDK_INT : I
    //   274: bipush #26
    //   276: if_icmplt -> 301
    //   279: aload #13
    //   281: ldc_w '<br/><br/>'
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: pop
    //   288: aload #13
    //   290: aload_0
    //   291: ldc_w 2131886196
    //   294: invokevirtual getString : (I)Ljava/lang/String;
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: pop
    //   301: aload #14
    //   303: ldc_w 'asus'
    //   306: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   309: ifeq -> 342
    //   312: getstatic android/os/Build$VERSION.SDK_INT : I
    //   315: bipush #26
    //   317: if_icmplt -> 342
    //   320: aload #13
    //   322: ldc_w '<br/><br/>'
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload #13
    //   331: aload_0
    //   332: ldc_w 2131886190
    //   335: invokevirtual getString : (I)Ljava/lang/String;
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: invokestatic I : ()Z
    //   345: ifeq -> 372
    //   348: aload #13
    //   350: ldc_w '<br/><br/>'
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: aload #13
    //   359: aload_0
    //   360: ldc_w 2131886195
    //   363: invokevirtual getString : (I)Ljava/lang/String;
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: iconst_1
    //   371: istore_3
    //   372: ldc_w 'oppo'
    //   375: aload #14
    //   377: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   380: ifne -> 398
    //   383: iload_3
    //   384: istore #5
    //   386: ldc_w 'oppo'
    //   389: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   392: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   395: ifeq -> 432
    //   398: iload_3
    //   399: istore #5
    //   401: invokestatic I : ()Z
    //   404: ifne -> 432
    //   407: aload #13
    //   409: ldc_w '<br/><br/>'
    //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: pop
    //   416: aload #13
    //   418: aload_0
    //   419: ldc_w 2131886194
    //   422: invokevirtual getString : (I)Ljava/lang/String;
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: iconst_1
    //   430: istore #5
    //   432: ldc_w 'vivo'
    //   435: aload #14
    //   437: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   440: ifne -> 455
    //   443: ldc_w 'vivo'
    //   446: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   449: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   452: ifeq -> 477
    //   455: aload #13
    //   457: ldc_w '<br/><br/>'
    //   460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: pop
    //   464: aload #13
    //   466: aload_0
    //   467: ldc_w 2131886197
    //   470: invokevirtual getString : (I)Ljava/lang/String;
    //   473: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   476: pop
    //   477: aload #13
    //   479: ldc_w '<br/><br/>• '
    //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: aload #13
    //   488: aload_0
    //   489: ldc_w 2131887083
    //   492: invokevirtual getString : (I)Ljava/lang/String;
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: iload #5
    //   501: ifeq -> 535
    //   504: aload #13
    //   506: ldc_w '<br/><br/><small><i>'
    //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: aload #13
    //   515: aload_0
    //   516: ldc_w 2131887525
    //   519: invokevirtual getString : (I)Ljava/lang/String;
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: pop
    //   526: aload #13
    //   528: ldc_w '</i></small>'
    //   531: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: pop
    //   535: ldc_w 'dont_kill_my_app'
    //   538: iconst_0
    //   539: anewarray java/lang/String
    //   542: invokestatic B : (Ljava/lang/String;[Ljava/lang/String;)Landroid/net/Uri;
    //   545: invokevirtual toString : ()Ljava/lang/String;
    //   548: astore #14
    //   550: aload #13
    //   552: ldc_w '<br/><br/><b><a href="'
    //   555: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: pop
    //   559: aload #13
    //   561: aload #14
    //   563: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   566: pop
    //   567: aload #13
    //   569: ldc_w '">'
    //   572: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: aload #13
    //   578: aload_0
    //   579: ldc_w 2131886724
    //   582: invokevirtual getString : (I)Ljava/lang/String;
    //   585: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   588: pop
    //   589: aload #13
    //   591: ldc_w '</a></b>'
    //   594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: pop
    //   598: aload #7
    //   600: aload #13
    //   602: invokevirtual toString : ()Ljava/lang/String;
    //   605: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   608: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   611: aload #7
    //   613: iconst_0
    //   614: invokevirtual setVisibility : (I)V
    //   617: aload #7
    //   619: invokestatic getInstance : ()Landroid/text/method/MovementMethod;
    //   622: invokevirtual setMovementMethod : (Landroid/text/method/MovementMethod;)V
    //   625: invokestatic x : ()Landroid/content/SharedPreferences;
    //   628: aload #8
    //   630: iconst_0
    //   631: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   636: istore #6
    //   638: iload #6
    //   640: ifeq -> 669
    //   643: iload_1
    //   644: ifeq -> 669
    //   647: aload #12
    //   649: ldc_w 2131296531
    //   652: invokevirtual findViewById : (I)Landroid/view/View;
    //   655: checkcast android/widget/CheckBox
    //   658: astore #7
    //   660: aload #7
    //   662: iconst_0
    //   663: invokevirtual setVisibility : (I)V
    //   666: goto -> 672
    //   669: aconst_null
    //   670: astore #7
    //   672: aload_2
    //   673: ifnull -> 682
    //   676: aload #11
    //   678: aload_2
    //   679: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   682: iload #4
    //   684: ifeq -> 698
    //   687: aload #11
    //   689: ldc_w 2131887030
    //   692: invokevirtual k : (I)V
    //   695: goto -> 714
    //   698: aload #11
    //   700: ldc_w 2131886983
    //   703: invokevirtual n : (I)V
    //   706: aload #11
    //   708: ldc_w 2131886278
    //   711: invokevirtual l : (I)V
    //   714: aload #11
    //   716: iconst_0
    //   717: putfield P : Z
    //   720: new wd0
    //   723: astore_2
    //   724: aload_2
    //   725: aload #7
    //   727: aload_0
    //   728: aload #9
    //   730: aload #10
    //   732: invokespecial <init> : (Landroid/widget/CheckBox;Lpc;Ljava/lang/String;Ljava/lang/String;)V
    //   735: aload #11
    //   737: aload_2
    //   738: putfield D : Lrs0;
    //   741: aload #11
    //   743: invokevirtual p : ()Lss0;
    //   746: astore_0
    //   747: aload #7
    //   749: ifnull -> 768
    //   752: new fz
    //   755: astore_2
    //   756: aload_2
    //   757: iconst_1
    //   758: aload_0
    //   759: invokespecial <init> : (ILjava/lang/Object;)V
    //   762: aload #7
    //   764: aload_2
    //   765: invokevirtual setOnCheckedChangeListener : (Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    //   768: iload #6
    //   770: ifne -> 794
    //   773: invokestatic x : ()Landroid/content/SharedPreferences;
    //   776: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   781: aload #8
    //   783: iconst_1
    //   784: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   789: invokeinterface apply : ()V
    //   794: return
    //   795: astore_0
    //   796: aload_0
    //   797: invokevirtual printStackTrace : ()V
    //   800: return
    // Exception table:
    //   from	to	target	type
    //   5	99	795	finally
    //   103	109	795	finally
    //   109	148	795	finally
    //   162	193	795	finally
    //   198	220	795	finally
    //   227	255	795	finally
    //   255	301	795	finally
    //   301	342	795	finally
    //   342	370	795	finally
    //   372	383	795	finally
    //   386	398	795	finally
    //   401	429	795	finally
    //   432	455	795	finally
    //   455	477	795	finally
    //   477	499	795	finally
    //   504	535	795	finally
    //   535	625	795	finally
    //   625	638	795	finally
    //   647	666	795	finally
    //   676	682	795	finally
    //   687	695	795	finally
    //   698	714	795	finally
    //   714	747	795	finally
    //   752	768	795	finally
    //   773	794	795	finally
  }
  
  public static void Z(Context paramContext, View paramView) {
    try {
      InputMethodManager inputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
      paramView.clearFocus();
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static boolean a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt) {
    if (paramArrayOfObject1 != paramArrayOfObject2)
      for (byte b = 0; b < paramInt; b++) {
        Object object1 = paramArrayOfObject1[b];
        Object object2 = paramArrayOfObject2[b];
        if (object1 != object2)
          return false; 
      }  
    return true;
  }
  
  public static void a0(Context paramContext, Window paramWindow) {
    try {
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static void b() {
    n.removeCallbacks(r);
  }
  
  public static void b0(Context paramContext, km0[] paramArrayOfkm0, String paramString, int paramInt) {
    String str;
    if (paramInt == A) {
      str = "actcp";
    } else {
      str = "actmv";
    } 
    FileUtilsActivity.U = paramArrayOfkm0;
    paramContext.startActivity((new Intent(paramContext, FileUtilsActivity.class)).setAction(str).putExtra("extrsfpt", null).putExtra("extdfpt", paramString));
  }
  
  public static int c() {
    try {
      return (packageInfo != null) ? packageInfo.versionCode : 0;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
    
    } finally {
      Exception exception = null;
    } 
    return 0;
  }
  
  public static boolean c0() {
    return (Build.VERSION.SDK_INT >= 31);
  }
  
  public static void d(Context paramContext, km0[] paramArrayOfkm0) {
    if (Build.VERSION.SDK_INT >= 30) {
      ArrayList<Uri> arrayList = new ArrayList();
      int i = paramArrayOfkm0.length;
      for (byte b = 0; b < i; b++) {
        v00 v00 = paramArrayOfkm0[b].d();
        if (v00 instanceof lw0)
          arrayList.add(((lw0)v00).L()); 
      } 
      if (!arrayList.isEmpty()) {
        c = paramArrayOfkm0;
        n0.k((pc)paramContext, 305, arrayList);
        return;
      } 
      k(paramContext, paramArrayOfkm0);
      return;
    } 
    k(paramContext, paramArrayOfkm0);
  }
  
  public static boolean d0(boolean paramBoolean) {
    if (MyApplication.k() && ws2.U() && MyApplication.o().getBoolean("k_b_accf", true) && ke0.d.b(MyApplication.i.getApplicationContext(), le0.a) == 0) {
      Exception exception;
      try {
        kj kj = kj.b(MyApplication.i.getApplicationContext());
        if (paramBoolean) {
          int i = c();
          if (i < 7)
            return false; 
        } 
      } finally {}
      if (exception != null)
        return true; 
    } 
    return false;
  }
  
  public static String e(String paramString) {
    return z.matcher(paramString).replaceAll("");
  }
  
  public static boolean e0() {
    Context context = MyApplication.i.getApplicationContext();
    PackageManager packageManager = context.getPackageManager();
    try {
      int i = (packageManager.getPackageInfo(context.getPackageName(), 0)).applicationInfo.flags;
      return ((i & 0x40000) == 262144);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      try {
        String str = context.getFilesDir().getAbsolutePath();
        if (str.startsWith("/data/"))
          return false; 
        if (!str.contains("/mnt/")) {
          boolean bool = str.contains("/sdcard/");
          if (bool)
            return true; 
        } else {
          return true;
        } 
      } finally {}
      return false;
    } 
  }
  
  public static void f(Thread paramThread, Throwable paramThrowable) {
    PrintWriter printWriter;
    boolean bool = MyApplication.F.p();
    String str2 = "";
    String str3 = zLtYiJUm.xVdrrOcH;
    if (bool) {
      printWriter = new PrintWriter(ws2.o(y().A(str3)), false);
    } else {
      int i = Build.VERSION.SDK_INT;
      StringBuilder stringBuilder3 = null;
      Cursor cursor = null;
      StringBuilder stringBuilder4 = null;
      if (i >= 30) {
        PrintWriter printWriter1;
        ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
        String str = x41.n(new StringBuilder(), Environment.DIRECTORY_DOCUMENTS, "/Musicolet/logs/");
        Uri uri = MediaStore.Files.getContentUri("external_primary");
        cursor = contentResolver.query(uri, new String[] { "_id" }, "relative_path like ?  AND _display_name like ?", new String[] { str, "last_crash%.txt" }, "date_modified DESC");
        if (cursor != null) {
          stringBuilder3 = stringBuilder4;
          if (cursor.moveToNext()) {
            i = cursor.getInt(0);
            stringBuilder3 = new StringBuilder("");
            stringBuilder3.append(i);
            printWriter1 = new PrintWriter(contentResolver.openOutputStream(Uri.withAppendedPath(uri, stringBuilder3.toString()), "wt"));
          } 
          cursor.close();
        } 
        printWriter = printWriter1;
        if (printWriter1 == null) {
          ContentValues contentValues = new ContentValues();
          contentValues.put("relative_path", str);
          contentValues.put("_display_name", str3);
          printWriter = new PrintWriter(contentResolver.openOutputStream(contentResolver.insert(uri, contentValues)));
        } 
      } 
    } 
    if (printWriter == null)
      return; 
    Date date = new Date();
    StringBuilder stringBuilder1 = new StringBuilder("Crash time: ");
    stringBuilder1.append(date);
    printWriter.println(stringBuilder1.toString());
    StringBuilder stringBuilder2 = new StringBuilder("Device:");
    String str1 = str2;
    if (MyApplication.l())
      str1 = " "; 
    stringBuilder2.append(str1);
    stringBuilder2.append(Build.MANUFACTURER);
    stringBuilder2.append(">");
    stringBuilder2.append(Build.MODEL);
    stringBuilder2.append(">");
    stringBuilder2.append(Build.DEVICE);
    stringBuilder2.append(" API:");
    stringBuilder2.append(Build.VERSION.SDK_INT);
    stringBuilder2.append(" ABI:");
    stringBuilder2.append(Arrays.toString((Object[])Build.SUPPORTED_ABIS));
    printWriter.println(stringBuilder2.toString());
    printWriter.println("App: Musicolet 6.14 build530");
    printWriter.println("------------");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
    while (true) {
      str2 = bufferedReader.readLine();
      if (str2 != null) {
        printWriter.println(str2);
        continue;
      } 
      printWriter.println("------------");
      printWriter.println("------------");
      StringBuilder stringBuilder = new StringBuilder(jLnXOLx.UUlHqdcvseRx);
      stringBuilder.append(date);
      printWriter.println(stringBuilder.toString());
      stringBuilder = new StringBuilder("Thread: ");
      stringBuilder.append(paramThread);
      printWriter.println(stringBuilder.toString());
      for (byte b = 0; paramThrowable != null && b < 100; b++) {
        StringBuilder stringBuilder3 = new StringBuilder("#");
        stringBuilder3.append(b);
        printWriter.println(stringBuilder3.toString());
        if (b > 0)
          printWriter.print("Caused by: "); 
        printWriter.print(paramThrowable.getClass().getName());
        printWriter.print(": ");
        printWriter.print(paramThrowable.getMessage());
        printWriter.println();
        for (StackTraceElement stackTraceElement : paramThrowable.getStackTrace()) {
          printWriter.print("\tat ");
          printWriter.print(stackTraceElement.getClassName());
          printWriter.print(".");
          printWriter.print(stackTraceElement.getMethodName());
          printWriter.print("(");
          printWriter.print(stackTraceElement.getFileName());
          printWriter.print(":");
          printWriter.print(String.valueOf(stackTraceElement.getLineNumber()));
          printWriter.print(")");
          printWriter.println();
        } 
        paramThrowable = paramThrowable.getCause();
      } 
      printWriter.println("CR_E");
      bufferedReader.close();
      printWriter.flush();
      printWriter.close();
      Runtime.getRuntime().exec("logcat -c");
      return;
    } 
  }
  
  public static boolean f0(String paramString) {
    int j = paramString.length();
    for (int i = 0; i < j; i += Character.charCount(k)) {
      int k = paramString.codePointAt(i);
      if (!Character.isWhitespace(k)) {
        if ("<unknown>".equals(paramString))
          break; 
        return false;
      } 
    } 
    return true;
  }
  
  public static int g(int paramInt1, int paramInt2) {
    return jn.c(Color.alpha(paramInt2) / 255.0F, paramInt1, paramInt2 | 0xFF000000) | 0xFF000000;
  }
  
  public static boolean g0(String paramString, String[] paramArrayOfString) {
    if (paramString == null)
      return false; 
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (!paramString.contains(paramArrayOfString[b]))
        return false; 
    } 
    return true;
  }
  
  public static void h(Context paramContext, km0[] paramArrayOfkm0) {
    o(paramContext, paramArrayOfkm0, A);
    if (!MyApplication.x().getBoolean("cpopexnd", false)) {
      b6 b6 = new b6(paramContext, 1);
      m.postDelayed(b6, 700L);
    } 
  }
  
  public static void h0(Context paramContext, km0[] paramArrayOfkm0, boolean paramBoolean) {
    Bundle bundle;
    wp1 wp1;
    HashSet<String> hashSet = new HashSet();
    int i = paramArrayOfkm0.length;
    byte b;
    for (b = 0; b < i; b++) {
      String str = paramArrayOfkm0[b].d().y();
      if (str != null)
        hashSet.add(str); 
    } 
    ArrayList<xp1> arrayList2 = new ArrayList();
    ArrayList<xp1> arrayList1 = new ArrayList();
    for (String str : hashSet) {
      xp1 xp1 = MyApplication.F.b(str);
      if (xp1 == null || xp1.j == 0)
        continue; 
      if (xp1.i) {
        arrayList2.add(xp1);
        continue;
      } 
      arrayList1.add(xp1);
    } 
    if (arrayList2.size() > 0) {
      if (paramBoolean) {
        bundle = new Bundle();
        String[] arrayOfString = new String[arrayList2.size()];
        for (b = 0; b < arrayList2.size(); b++)
          arrayOfString[b] = ((xp1)arrayList2.get(b)).e; 
        bundle.putStringArray("arg_reqattu", arrayOfString);
        wp1 = new wp1();
        wp1.x0(bundle);
        wp1.D0 = new qf0(paramArrayOfkm0, 0);
        wp1.N0((pc)paramContext);
      } 
      return;
    } 
    if (wp1.size() > 0) {
      arrayList2 = new ArrayList<xp1>(wp1.size());
      i = wp1.size();
      b = 0;
      while (b < i) {
        xp1 xp1 = (xp1)wp1.get(b);
        b++;
        arrayList2.add(dq1.l(xp1));
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getResources().getQuantityString(2131755031, arrayList2.size()));
      stringBuilder.append("<br/><b>");
      stringBuilder.append(TextUtils.join(",", arrayList2));
      stringBuilder.append("</b>");
      Spanned spanned = Html.fromHtml(stringBuilder.toString());
      ms0 ms0 = new ms0(paramContext);
      ms0.d((CharSequence)spanned);
      if (bundle.size() != wp1.size()) {
        ms0.n(2131886404);
        ms0.A = new rf0(paramContext, paramArrayOfkm0, 0);
      } 
      ms0.l(2131886278);
      ms0.p();
      return;
    } 
    o(paramContext, paramArrayOfkm0, 0);
  }
  
  public static void i(CharSequence paramCharSequence) {
    ((ClipboardManager)MyApplication.i.getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied text from Musicolet", paramCharSequence));
  }
  
  public static String i0(String paramString) {
    paramString = Normalizer.normalize(paramString, Normalizer.Form.NFKD);
    return s.matcher(paramString).replaceAll("");
  }
  
  public static void j(Context paramContext, km0[] paramArrayOfkm0, boolean paramBoolean) {
    Bundle bundle;
    wp1 wp1;
    HashSet<String> hashSet = new HashSet();
    int k = paramArrayOfkm0.length;
    boolean bool = false;
    int j = 0;
    int i;
    for (i = 0; i < k; i++) {
      String str = paramArrayOfkm0[i].d().y();
      if (str != null)
        hashSet.add(str); 
    } 
    ArrayList<xp1> arrayList2 = new ArrayList();
    ArrayList<xp1> arrayList1 = new ArrayList();
    for (String str : hashSet) {
      xp1 xp1 = MyApplication.F.b(str);
      if (xp1 == null || xp1.j == 0)
        continue; 
      if (xp1.i) {
        arrayList2.add(xp1);
        continue;
      } 
      arrayList1.add(xp1);
    } 
    if (arrayList2.size() > 0) {
      if (paramBoolean) {
        bundle = new Bundle();
        String[] arrayOfString = new String[arrayList2.size()];
        for (i = j; i < arrayList2.size(); i++)
          arrayOfString[i] = ((xp1)arrayList2.get(i)).e; 
        bundle.putStringArray("arg_reqattu", arrayOfString);
        wp1 = new wp1();
        wp1.x0(bundle);
        wp1.D0 = new qf0(paramArrayOfkm0, 1);
        wp1.N0((pc)paramContext);
      } 
      return;
    } 
    if (wp1.size() > 0) {
      arrayList2 = new ArrayList<xp1>(wp1.size());
      j = wp1.size();
      i = bool;
      while (i < j) {
        xp1 xp1 = (xp1)wp1.get(i);
        i++;
        arrayList2.add(dq1.l(xp1));
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getResources().getQuantityString(2131755031, arrayList2.size()));
      stringBuilder.append("<br/><b>");
      stringBuilder.append(TextUtils.join(",", arrayList2));
      stringBuilder.append("</b>");
      Spanned spanned = Html.fromHtml(stringBuilder.toString());
      ms0 ms0 = new ms0(paramContext);
      ms0.d((CharSequence)spanned);
      if (bundle.size() != wp1.size()) {
        ms0.n(2131886404);
        ms0.A = new rf0(paramContext, paramArrayOfkm0, 2);
      } 
      ms0.l(2131886278);
      ms0.p();
      return;
    } 
    d(paramContext, paramArrayOfkm0);
  }
  
  public static void j0(Context paramContext, String paramString) {
    try {
      Intent intent;
      boolean bool = paramContext instanceof Activity;
      int i = bool ^ true;
      try {
        intent = new Intent();
        this("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder stringBuilder = new StringBuilder();
        this("package:");
        stringBuilder.append(paramString);
        intent.setData(Uri.parse(stringBuilder.toString()));
        if (!bool)
          intent.addFlags(268435456); 
      } catch (ActivityNotFoundException activityNotFoundException) {}
      paramContext.startActivity(intent);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      boolean bool = false;
      activityNotFoundException.printStackTrace();
      Intent intent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
      if (bool)
        intent.addFlags(268435456); 
      paramContext.startActivity(intent);
      return;
    } 
  }
  
  public static void k(Context paramContext, km0[] paramArrayOfkm0) {
    if (paramArrayOfkm0 != null && paramArrayOfkm0.length != 0) {
      StringBuilder stringBuilder = new StringBuilder("HM>DP:");
      stringBuilder.append(paramArrayOfkm0.hashCode());
      stringBuilder.append(",");
      stringBuilder.append(paramArrayOfkm0.length);
      n21.F(stringBuilder.toString());
      ms0 ms0 = new ms0(paramContext);
      ms0.q(2131886202);
      ms0.d((CharSequence)Html.fromHtml(paramContext.getResources().getQuantityString(2131755071, paramArrayOfkm0.length, new Object[] { Integer.valueOf(paramArrayOfkm0.length) })));
      ms0.n(2131886446);
      ms0.k(2131886278);
      ms0.A = new rf0(paramContext, paramArrayOfkm0);
      if (paramArrayOfkm0.length > 5) {
        ms0.b(2131886672, false, null);
        ms0.z0 = true;
      } 
      TextView textView = (ms0.p()).m;
      textView.setMovementMethod(null);
      textView.setOnClickListener(new ag(6, paramContext, paramArrayOfkm0));
    } 
  }
  
  public static void k0() {
    String str = zpEN.LIFd;
    try {
      Intent intent = new Intent();
      this("miui.intent.action.APP_PERM_EDITOR");
      intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
      intent.putExtra(str, MyApplication.i.getApplicationContext().getPackageName());
      intent.addFlags(268435456);
      MyApplication.i.getApplicationContext().startActivity(intent);
      return;
    } catch (Exception exception) {
      try {
        Intent intent = new Intent();
        this("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra(str, MyApplication.i.getApplicationContext().getPackageName());
        intent.addFlags(268435456);
        MyApplication.i.getApplicationContext().startActivity(intent);
      } catch (Exception exception1) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", MyApplication.i.getApplicationContext().getPackageName(), null));
        intent.addFlags(268435456);
        MyApplication.i.getApplicationContext().startActivity(intent);
      } 
      return;
    } 
  }
  
  public static boolean l(String paramString, Stack paramStack) {
    if (paramString != null)
      for (xn1 xn1 : paramStack) {
        try {
          boolean bool = xn1.h.equals(paramString);
          if (bool)
            return true; 
        } catch (NullPointerException nullPointerException) {
          Log.e("JSTMUSIC2", nullPointerException.toString());
        } 
      }  
    return false;
  }
  
  public static void l0(String paramString) {
    try {
      Context context = MyApplication.i.getApplicationContext();
      Intent intent = new Intent();
      StringBuilder stringBuilder = new StringBuilder();
      this("market://details?id=");
      stringBuilder.append(paramString);
      this("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
      context.startActivity(intent.addFlags(268435456));
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      try {
        Context context = MyApplication.i.getApplicationContext();
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        this("http://play.google.com/store/apps/details?id=");
        stringBuilder.append(paramString);
        this("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        context.startActivity(intent.addFlags(268435456));
      } finally {}
      return;
    } 
  }
  
  public static void m(pc parampc, b81 paramb81) {
    Intent intent2 = (new Intent("android.intent.action.CREATE_DOCUMENT")).setType("audio/x-mpegurl").addCategory(AyxAR.MDpYKBZsRiLh).putExtra("android.content.extra.SHOW_ADVANCED", true);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(e(paramb81.b));
    stringBuilder.append(".m3u");
    Intent intent1 = intent2.putExtra("android.intent.extra.TITLE", stringBuilder.toString());
    intent1.putExtra("android.content.extra.SHOW_ADVANCED", true);
    PlaylistActivity.f0 = paramb81;
    try {
      parampc.startActivityForResult(intent1, 30);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      activityNotFoundException.printStackTrace();
      wp1.K0((Context)parampc);
      return;
    } 
  }
  
  public static void m0(pc parampc, int paramInt, boolean paramBoolean, String paramString) {
    if (MyApplication.F.m(false).size() > 1) {
      (new t00(paramInt, paramString, new ArrayList())).H0(parampc.Z(), null);
      return;
    } 
    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
    intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
    intent.putExtra("android.provider.extra.INITIAL_URI", null);
    intent.addFlags(3);
    if (paramBoolean)
      intent.addFlags(64); 
    try {
      parampc.startActivityForResult(intent, paramInt);
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      activityNotFoundException.printStackTrace();
      wp1.K0((Context)parampc);
      return;
    } 
  }
  
  public static void n(pc parampc, b81 paramb81) {
    String str = paramb81.b;
    if (str != null)
      paramb81.b = str.trim(); 
    str = paramb81.b;
    if (str == null || str.length() == 0) {
      StringBuilder stringBuilder = new StringBuilder("Musicolet - ");
      if (TextUtils.isEmpty(null)) {
        stringBuilder.append(System.currentTimeMillis() / 1000L);
        paramb81.b = stringBuilder.toString();
      } else {
        throw null;
      } 
    } 
    m(parampc, paramb81);
  }
  
  public static void n0(Context paramContext, Intent paramIntent) {
    if (Build.VERSION.SDK_INT >= 26) {
      fh.a(paramContext, paramIntent);
      return;
    } 
    paramContext.startService(paramIntent);
  }
  
  public static void o(Context paramContext, km0[] paramArrayOfkm0, int paramInt) {
    if (paramArrayOfkm0 != null && paramArrayOfkm0.length != 0) {
      if (MyApplication.F.p()) {
        int i;
        String str = paramContext.getString(2131887321);
        if (paramInt == 0) {
          i = 2131886846;
        } else {
          i = 2131886411;
        } 
        (new z00(paramContext, str, true, true, true, null, paramContext.getString(i), paramContext.getString(2131886278), null, new mi2(paramInt, 4, paramArrayOfkm0))).e();
        return;
      } 
      if (Build.VERSION.SDK_INT >= 30 && paramContext instanceof pc) {
        char c;
        boolean bool;
        b = paramArrayOfkm0;
        pc pc = (pc)paramContext;
        if (paramInt == 0) {
          c = 'Ĭ';
        } else {
          c = 'ĭ';
        } 
        if (paramInt == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        if (paramInt == 0) {
          paramInt = 2131886845;
        } else {
          paramInt = 2131886410;
        } 
        m0(pc, c, bool, paramContext.getString(paramInt));
      } 
    } 
  }
  
  public static boolean o0() {
    try {
      if (MusicService.F0) {
        boolean bool = MusicService.P0.j;
        int i = bool ^ true;
        return i;
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public static Object p(ArrayList<Object> paramArrayList, km0 paramkm0) {
    if (paramkm0 != null) {
      int i = paramArrayList.size();
      byte b = 0;
      while (b < i) {
        Object object = paramArrayList.get(b);
        b++;
        if (paramkm0.equals(object))
          return object; 
      } 
    } 
    return null;
  }
  
  public static void p0(Toast paramToast, View paramView, Window paramWindow) {
    if (Build.VERSION.SDK_INT >= 30)
      return; 
    Rect rect = new Rect();
    paramWindow.getDecorView().getWindowVisibleDisplayFrame(rect);
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int k = arrayOfInt[0];
    int j = rect.left;
    int i = arrayOfInt[1];
    int m = rect.top;
    DisplayMetrics displayMetrics = new DisplayMetrics();
    paramWindow.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    int i1 = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, 0);
    int n = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, 0);
    paramToast.getView().measure(i1, n);
    i1 = paramToast.getView().getMeasuredWidth();
    n = paramToast.getView().getMeasuredHeight();
    paramToast.setGravity(51, (paramView.getWidth() - i1) / 2 + k - j, i - m - n);
  }
  
  public static View q(ViewGroup paramViewGroup, int paramInt1, int paramInt2) {
    byte b = 0;
    try {
      while (b < paramViewGroup.getChildCount()) {
        View view = paramViewGroup.getChildAt(b);
        if (view.getVisibility() == 0) {
          int[] arrayOfInt = new int[2];
          view.getLocationOnScreen(arrayOfInt);
          Rect rect = new Rect();
          int i = arrayOfInt[0];
          this(i, arrayOfInt[1], view.getWidth() + i, arrayOfInt[1] + view.getHeight());
          boolean bool = rect.contains(paramInt1, paramInt2);
          if (bool)
            return view; 
        } 
        b++;
      } 
    } finally {
      paramViewGroup = null;
    } 
  }
  
  public static void q0(Toast paramToast, View paramView, Window paramWindow) {
    if (Build.VERSION.SDK_INT >= 30)
      return; 
    Rect rect = new Rect();
    paramWindow.getDecorView().getWindowVisibleDisplayFrame(rect);
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    int j = arrayOfInt[0];
    int i = rect.left;
    int m = arrayOfInt[1];
    int k = rect.top;
    DisplayMetrics displayMetrics = new DisplayMetrics();
    paramWindow.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    int n = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, 0);
    paramToast.getView().measure(n, i1);
    n = paramToast.getView().getMeasuredWidth();
    paramToast.setGravity(51, (paramView.getWidth() - n) / 2 + j - i, paramView.getHeight() + m - k);
  }
  
  public static Bundle r() {
    try {
      ActivityOptions activityOptions = ActivityOptions.makeBasic();
      if (Build.VERSION.SDK_INT >= 34)
        activityOptions.setPendingIntentCreatorBackgroundActivityStartMode(1); 
      return activityOptions.toBundle();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static String r0(String paramString, boolean paramBoolean) {
    if (paramString == null)
      return null; 
    Matcher matcher = t.matcher(paramString);
    String str3 = RqlokDsQOju.juglFHFOPl;
    String str1 = matcher.replaceAll(str3);
    String str2 = u.matcher(str1).replaceAll(str3);
    str1 = str2;
    if (paramBoolean)
      str1 = v.matcher(str2).replaceAll(str3); 
    str1 = w.matcher(str1).replaceAll(str3);
    str1 = x.matcher(str1).replaceAll(str3);
    str2 = y.matcher(str1).replaceAll(str3);
    str1 = str2;
    if (str2.length() == 0)
      str1 = "<unknown>"; 
    return str1;
  }
  
  public static ArrayList s(ArrayList<Object> paramArrayList, int paramInt, km0 paramkm0) {
    String str = null;
    if (paramArrayList == null)
      return null; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = -1;
    boolean bool = false;
    if (paramInt == 0) {
      int k = MyApplication.o().getInt("S_SFSHAL", 12);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.m(MyApplication.j.c.D)).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.c.c;
        paramInt = k;
      } 
    } else if (paramInt == 1) {
      int k = MyApplication.o().getInt("S_SFSHAR", 4);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.c.e).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.c.e;
        paramInt = k;
      } 
    } else if (paramInt == 2) {
      int k = MyApplication.o().getInt(oXrNDUqUkE.AogphFxQmGJTifH, 4);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.j).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.j;
        paramInt = k;
      } 
    } else if (paramInt == 3) {
      int k = MyApplication.o().getInt("S_SFSHCM", 4);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.f).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.f;
        paramInt = k;
      } 
    } else if (paramInt == 4) {
      int k = MyApplication.o().getInt("S_SFSHGN", 1000);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.e).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.e;
        paramInt = k;
      } 
    } else if (paramInt == 5) {
      int k = MyApplication.o().getInt("S_SFSHFL", 0);
      int m = paramArrayList.size();
      paramInt = 0;
      while (paramInt < m) {
        km0 km01 = (km0)paramArrayList.get(paramInt);
        paramInt++;
        km01 = km01;
        L(hashMap, km01.h).add(km01);
      } 
      paramInt = k;
      if (paramkm0 != null) {
        str = paramkm0.h;
        paramInt = k;
      } 
    } else {
      paramInt = -1;
    } 
    ArrayList<String> arrayList = new ArrayList(hashMap.keySet());
    if (str != null)
      i = arrayList.indexOf(str); 
    z51.E(i, arrayList);
    paramArrayList = new ArrayList<Object>(paramArrayList.size());
    int j = arrayList.size();
    i = bool;
    while (i < j) {
      str = arrayList.get(i);
      i++;
      ArrayList<? extends Object> arrayList1 = (ArrayList)hashMap.get(str);
      z51.R(paramInt, arrayList1);
      paramArrayList.addAll((Collection)arrayList1);
    } 
    return paramArrayList;
  }
  
  public static void s0(Context paramContext, v00 paramv00) {
    vm vm = new vm();
    ms0 ms0 = new ms0(paramContext);
    ms0.q(2131887178);
    ms0.g(paramContext.getString(2131886981), paramv00.h(), false, new vn(3, paramContext, paramv00));
    ms0.W = new x2(vm, 2);
    ms0.X = new pf0(vm, 1);
    ms0.k(2131886278);
    ms0.n(2131887175);
    vm.m((ms0.p()).n);
  }
  
  public static v00 t(String paramString) {
    String str;
    try {
      str = MyApplication.v().getString("SAF_S_ATEXCVPFL", null);
      if (str != null) {
        v00 v00 = v00.q(MyApplication.i.getApplicationContext(), str);
        v00.E();
      } else {
        str = null;
      } 
    } finally {}
    if (str != null && str.k())
      return str.A(paramString); 
    if (MyApplication.F.p()) {
      v00 v00 = H().A("Exported Play Counts");
      if (!v00.k())
        v00.E(); 
      return v00.A(paramString);
    } 
    if (Build.VERSION.SDK_INT >= 30) {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(Environment.DIRECTORY_DOCUMENTS);
      stringBuilder.append("/Musicolet/Exported Play Counts/");
      String str1 = stringBuilder.toString();
      ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      ContentValues contentValues = new ContentValues();
      this();
      contentValues.put("_display_name", paramString);
      contentValues.put("relative_path", str1);
      Uri uri = contentResolver.insert(MediaStore.Files.getContentUri("external_primary"), contentValues);
      if (uri != null)
        return new f71(uri); 
    } 
    return null;
  }
  
  public static void t0(Context paramContext, v00 paramv00, boolean paramBoolean) {
    ms0 ms0;
    Spanned spanned;
    if (MyApplication.F.p()) {
      v00 v001 = (v00)paramv00.i();
      if (v001 != null) {
        String str = v001.y();
        xp1 xp1 = MyApplication.F.b(str);
        if (xp1 != null) {
          Bundle bundle;
          int i = xp1.j;
          if (i == 0) {
            s0(paramContext, paramv00);
            return;
          } 
          if (i == -1 && xp1.i) {
            if (paramBoolean) {
              bundle = new Bundle();
              bundle.putStringArray("arg_reqattu", new String[] { str });
              wp1 wp1 = new wp1();
              wp1.x0(bundle);
              wp1.D0 = new f(15, paramv00);
              wp1.N0((pc)paramContext);
              return;
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramContext.getResources().getQuantityString(2131755031, 1));
            stringBuilder.append("<br/><b>");
            stringBuilder.append(dq1.l((xp1)bundle));
            stringBuilder.append("</b>");
            spanned = Html.fromHtml(stringBuilder.toString());
            ms0 = new ms0(paramContext);
            ms0.d((CharSequence)spanned);
            ms0.l(2131886278);
            ms0.p();
            return;
          } 
        } 
      } 
    } else if ((v00)spanned.i() != null) {
      s0((Context)ms0, (v00)spanned);
      return;
    } 
  }
  
  public static String u(int paramInt, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramInt;
    long l = paramLong;
    if (paramInt > 0) {
      int j = (int)(paramLong / 3600000L);
      i = paramInt;
      l = paramLong;
      if (j > 0) {
        l = paramLong - (3600000 * j);
        stringBuilder.append(MyApplication.i.getApplicationContext().getResources().getQuantityString(2131755050, j, new Object[] { Integer.valueOf(j) }));
        i = paramInt - 1;
      } 
    } 
    paramInt = i;
    paramLong = l;
    if (i > 0) {
      int j = (int)(l / 60000L);
      paramInt = i;
      paramLong = l;
      if (j > 0) {
        paramLong = l - (60000 * j);
        if (stringBuilder.length() > 0)
          stringBuilder.append(", "); 
        stringBuilder.append(MyApplication.i.getApplicationContext().getResources().getQuantityString(2131755052, j, new Object[] { Integer.valueOf(j) }));
        paramInt = i - 1;
      } 
    } 
    if (paramInt > 0) {
      paramInt = (int)(paramLong / 1000L);
      if (paramInt > 0) {
        if (stringBuilder.length() > 0)
          stringBuilder.append(", "); 
        stringBuilder.append(MyApplication.i.getApplicationContext().getResources().getQuantityString(2131755058, paramInt, new Object[] { Integer.valueOf(paramInt) }));
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static Bitmap u0(Bitmap paramBitmap, int paramInt) {
    Matrix matrix = new Matrix();
    switch (paramInt) {
      default:
        return paramBitmap;
      case 8:
        matrix.setRotate(-90.0F);
        break;
      case 7:
        matrix.setRotate(-90.0F);
        matrix.postScale(-1.0F, 1.0F);
        break;
      case 6:
        matrix.setRotate(90.0F);
        break;
      case 5:
        matrix.setRotate(90.0F);
        matrix.postScale(-1.0F, 1.0F);
        break;
      case 4:
        matrix.setRotate(180.0F);
        matrix.postScale(-1.0F, 1.0F);
        break;
      case 3:
        matrix.setRotate(180.0F);
        break;
      case 2:
        matrix.setScale(-1.0F, 1.0F);
        break;
    } 
    try {
      Bitmap bitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), matrix, true);
      paramBitmap.recycle();
      return bitmap;
    } catch (OutOfMemoryError outOfMemoryError) {
      outOfMemoryError.printStackTrace();
      System.gc();
      return null;
    } 
  }
  
  public static Bitmap v(Drawable paramDrawable, int paramInt1, int paramInt2) {
    if (paramDrawable instanceof BitmapDrawable)
      return ((BitmapDrawable)paramDrawable).getBitmap(); 
    Bitmap bitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
    paramDrawable.draw(canvas);
    return bitmap;
  }
  
  public static Bitmap v0(Bitmap paramBitmap, int paramInt1, int paramInt2) {
    if (paramBitmap.getWidth() == paramInt1 && paramBitmap.getHeight() == paramInt2)
      return paramBitmap; 
    int j = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f3 = paramInt1;
    float f2 = j;
    float f5 = f3 / f2;
    float f1 = paramInt2;
    float f4 = i;
    f5 = Math.max(f5, f1 / f4);
    f2 *= f5;
    f4 = f5 * f4;
    f3 = (f3 - f2) / 2.0F;
    f1 = (f1 - f4) / 2.0F;
    RectF rectF = new RectF(f3, f1, f2 + f3, f4 + f1);
    Bitmap bitmap = Bitmap.createBitmap(paramInt1, paramInt2, paramBitmap.getConfig());
    (new Canvas(bitmap)).drawBitmap(paramBitmap, null, rectF, null);
    return bitmap;
  }
  
  public static PendingIntent w() {
    Intent intent = (new Intent("A")).setComponent(new ComponentName(MyApplication.i.getApplicationContext(), d20.class));
    return PendingIntent.getBroadcast(MyApplication.i.getApplicationContext(), 0, intent, 167772160);
  }
  
  public static void w0(LyricsView paramLyricsView, int paramInt) {
    try {
      float f;
      int j = paramLyricsView.computeVerticalScrollRange();
      int k = paramLyricsView.computeVerticalScrollExtent();
      int i = paramLyricsView.computeVerticalScrollOffset();
      if (j == k) {
        f = -1.0F;
      } else {
        f = i / (j - k);
      } 
      if (f >= 0.0F && f < 1.0F)
        paramLyricsView.k0(paramInt); 
      Handler handler = paramLyricsView.getHandler();
      y2 y2 = new y2();
      return;
    } finally {
      paramLyricsView = null;
      paramLyricsView.printStackTrace();
    } 
  }
  
  public static String x() {
    String str2 = MusicService.Z0;
    String str4 = MusicService.Y0;
    boolean bool = TextUtils.isEmpty(str2);
    String str3 = "";
    if (bool || "<unknown>".equals(str2)) {
      str2 = "";
      str1 = "";
    } else {
      str1 = " • ";
    } 
    if (TextUtils.isEmpty(str4) || "<unknown>".equals(str4)) {
      str1 = "";
      return x41.l(str2, str3, str1);
    } 
    str3 = str1;
    String str1 = str4;
    return x41.l(str2, str3, str1);
  }
  
  public static void x0(ViewGroup paramViewGroup, View.OnClickListener paramOnClickListener, HashMap paramHashMap) {
    int j = paramViewGroup.getChildCount();
    Object object = null;
    View view = null;
    byte b = 0;
    int i = 0;
    while (b < j) {
      boolean bool1;
      boolean bool2;
      View view1 = paramViewGroup.getChildAt(b);
      int k = view1.getId();
      if (k != -1 && paramHashMap != null) {
        Boolean bool = (Boolean)paramHashMap.get(Integer.valueOf(k));
        if (bool != null && !bool.booleanValue())
          view1.setVisibility(8); 
      } 
      Object object1 = view1.getTag();
      boolean bool4 = "s".equals(object1);
      boolean bool3 = "su".equals(object1);
      if (!bool4 && !bool3) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1 && !" ".equals(object1)) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      k = i;
      object1 = object;
      if (bool4) {
        k = i;
        object1 = object;
        if (view1.getVisibility() == 0) {
          if (!i)
            view1.setVisibility(8); 
          object1 = view1;
          k = 0;
        } 
      } 
      i = k;
      object = object1;
      View view2 = view;
      if (bool3) {
        i = k;
        object = object1;
        view2 = view;
        if (view1.getVisibility() == 0) {
          object = object1;
          if (k == 0) {
            object = object1;
            if (object1 != null) {
              object1.setVisibility(8);
              object = null;
            } 
          } 
          view2 = view1;
          i = 0;
        } 
      } 
      if (bool2)
        view1.setOnClickListener(paramOnClickListener); 
      k = i;
      if (bool1) {
        k = i;
        if (view1.getVisibility() == 0)
          k = 1; 
      } 
      b++;
      i = k;
      view = view2;
    } 
    if (i == 0 && object != null)
      object.setVisibility(8); 
    if (i == 0 && view != null)
      view.setVisibility(8); 
  }
  
  public static v00 y() {
    try {
      return v00;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void y0(String paramString, FDTS paramFDTS) {
    if (paramString.startsWith("text")) {
      paramFDTS.ocC = 1;
      return;
    } 
    if (paramString.startsWith("image")) {
      paramFDTS.ocC = 2;
      return;
    } 
    if (paramString.startsWith("audio")) {
      paramFDTS.ocC = 3;
      return;
    } 
    paramFDTS.ocC = 4;
    int i = ve.d + 1;
    ve.d = i;
    ow.d = i;
    e91.f = i;
    ve.e = i;
    if (paramString.endsWith("aac")) {
      d = "aac";
      return;
    } 
    if (paramString.endsWith("raw"))
      d = "raw"; 
  }
  
  public static ArrayList z() {
    ArrayList<String> arrayList = new ArrayList();
    try {
      JSONArray jSONArray = new JSONArray();
      this(MyApplication.o().getString("S_PTH_SCN_J", "[]"));
      for (byte b = 0; b < jSONArray.length(); b++)
        arrayList.add(jSONArray.getString(b)); 
    } finally {
      Exception exception;
    } 
    return arrayList;
  }
  
  public static void z0(Slider paramSlider, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f = paramSlider.getStepSize();
    if (f <= 0.0F)
      f = 0.01F; 
    paramFloat2 = Math.max(f + paramFloat1, paramFloat2);
    paramFloat3 = Math.min(Math.max(paramFloat3, paramFloat1), paramFloat2);
    paramSlider.setValueFrom(paramFloat1);
    paramSlider.setValueTo(paramFloat2);
    paramSlider.setValue(paramFloat3);
  }
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 31 || !qz1.G()) {
      bool = true;
    } else {
      bool = false;
    } 
    j = bool;
  }
  
  static {
    HandlerThread handlerThread = new HandlerThread("t_async_updater");
    handlerThread.start();
    n = new Handler(handlerThread.getLooper());
  }
  
  static {
    StringBuilder stringBuilder = new StringBuilder("(((\\s|_)*)((\\+|\\*|\\-|~|=|\\||&|:|;|\\\\|\\/|@)*)((\\s|_)*)");
    stringBuilder.append(f61.a.pattern());
    stringBuilder.append(")");
    t = Pattern.compile(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ag0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */