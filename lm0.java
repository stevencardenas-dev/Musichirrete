import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class lm0 implements Serializable {
  public static Calendar M = Calendar.getInstance();
  
  public static final Calendar N = Calendar.getInstance();
  
  public static final Pattern O = Pattern.compile("(\\s)+");
  
  public int A = 0;
  
  public final int B;
  
  public final int C;
  
  public final int D;
  
  public final Pattern E;
  
  public final Pattern F;
  
  public final Pattern G;
  
  public final Pattern H;
  
  public final boolean I;
  
  public final boolean J;
  
  public final String K;
  
  public final String L;
  
  public final ArrayList b;
  
  public final HashMap c;
  
  public final HashMap e;
  
  public final zi f;
  
  public final ArrayList g;
  
  public final zi h;
  
  public final ArrayList i;
  
  public final zi j;
  
  public final ArrayList k;
  
  public final zi l;
  
  public final ArrayList m;
  
  public final zi n;
  
  public final ArrayList o;
  
  public final zi p;
  
  public final ArrayList q;
  
  public final int r;
  
  public final long s;
  
  public final jm0 t;
  
  public jm0 u;
  
  public final HashMap v = new HashMap<Object, Object>();
  
  public transient HashMap w;
  
  public int x = 0;
  
  public int y = 0;
  
  public final int z = 0;
  
  public lm0(SQLiteDatabase paramSQLiteDatabase) {
    q01 q01 = new q01(0);
    MyApplication.m = null;
    a a = MyApplication.O;
    if (a != null)
      a.a(); 
    long l3 = System.currentTimeMillis();
    int j = MyApplication.o().getInt("k_i_adt", 0);
    boolean bool14 = MyApplication.o().getBoolean("k_b_scvfl", false);
    boolean bool11 = MyApplication.o().getBoolean("k_b_scnmfl", false);
    boolean bool12 = MyApplication.o().getBoolean("k_b_schdfl", false);
    SharedPreferences sharedPreferences1 = MyApplication.o();
    int i = jm1.a;
    if (MyApplication.F.p()) {
      i = 5;
    } else {
      i = 0;
    } 
    this.r = sharedPreferences1.getInt(eRUgfgGAccgka.ymZdL, i) * 1000;
    this.D = MyApplication.o().getInt("k_i_ams", 0);
    if (ws2.U() && MyApplication.o().getBoolean("k_b_mare", false)) {
      this.E = r();
    } else {
      this.E = null;
    } 
    boolean bool13 = ws2.U();
    Pattern pattern = O;
    if (bool13 && MyApplication.o().getBoolean("k_b_malare", false)) {
      String[] arrayOfString = pattern.split(MyApplication.o().getString("k_s_malarsp", ", ; / | & ft. feat."));
      for (i = 0; i < arrayOfString.length; i++) {
        String str1 = arrayOfString[i].trim();
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(Pattern.quote(str1));
        stringBuilder.append(")");
        String str2 = stringBuilder.toString();
        arrayOfString[i] = str2;
        arrayOfString[i] = c(str1, str2);
      } 
      this.F = Pattern.compile(TextUtils.join("|", (Object[])arrayOfString), 2);
    } else {
      this.F = null;
    } 
    if (ws2.U() && MyApplication.o().getBoolean("k_b_mcme", false)) {
      String[] arrayOfString = pattern.split(MyApplication.o().getString("k_s_mcmsp", ", ; / | & ft. feat."));
      for (i = 0; i < arrayOfString.length; i++) {
        String str1 = arrayOfString[i].trim();
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(Pattern.quote(str1));
        stringBuilder.append(")");
        String str2 = stringBuilder.toString();
        arrayOfString[i] = str2;
        arrayOfString[i] = c(str1, str2);
      } 
      this.G = Pattern.compile(TextUtils.join("|", (Object[])arrayOfString), 2);
    } else {
      this.G = null;
    } 
    if (ws2.U() && MyApplication.o().getBoolean("k_b_mgne", false)) {
      String[] arrayOfString = pattern.split(MyApplication.o().getString("k_s_mgnsp", ", ; / | &"));
      for (i = 0; i < arrayOfString.length; i++) {
        String str1 = arrayOfString[i].trim();
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(Pattern.quote(str1));
        stringBuilder.append(")");
        String str2 = stringBuilder.toString();
        arrayOfString[i] = str2;
        arrayOfString[i] = c(str1, str2);
      } 
      this.H = Pattern.compile(TextUtils.join("|", (Object[])arrayOfString), 2);
    } else {
      this.H = null;
    } 
    if (M.get(2) == 11 && M.get(5) >= 16) {
      boolean bool = true;
    } else {
      boolean bool = false;
    } 
    if (M.get(5) == M.getActualMaximum(5)) {
      boolean bool = true;
    } else {
      boolean bool = false;
    } 
    this.B = 1;
    if (j == 0) {
      this.B = 2049;
    } else if (j == 1) {
      this.B = 1025;
    } 
    this.C = 66;
    if (!bool14)
      this.C = 578; 
    if (!bool12)
      this.C |= 0x8; 
    if (!bool11)
      this.C = 0x10 | this.C; 
    String str = jLnXOLx.COniYxqRZmhEWh;
    bool11 = wn1.f;
    Cursor cursor = paramSQLiteDatabase.query("TABLE_SONGS", new String[] { 
          "rowid", "COL_PATH", "COL_TITLE", str, "COL_ARTIST", "COL_GENRE", "COL_COMPOSER", "COL_YEAR", "COL_DURATION", "COL_TRACK_NO", 
          "COL_DATE_ADDED", "COL_DATE_MODIFIED", "COL_LAST_PLAYED", "COL_NUM_PLAYED", "COL_LASTPOS", "album_artist", "COL_NUM_PLAYED_W", "COL_NUM_PLAYED_M", "COL_NUM_PLAYED_Y", "COL_LOGPATH", 
          "COL_VIS_FLAGS", "COL_GAINS" }, null, null, null, null, null);
    this.c = new HashMap<Object, Object>(cursor.getCount());
    this.e = new HashMap<Object, Object>(cursor.getCount());
    this.b = new ArrayList(cursor.getCount());
    this.f = (zi)new HashMap<Object, Object>();
    this.h = (zi)new HashMap<Object, Object>();
    this.j = (zi)new HashMap<Object, Object>();
    this.l = (zi)new HashMap<Object, Object>();
    this.n = (zi)new HashMap<Object, Object>();
    this.p = (zi)new HashMap<Object, Object>();
    this.g = new ArrayList();
    this.i = new ArrayList();
    this.k = new ArrayList();
    this.m = new ArrayList();
    this.o = new ArrayList();
    this.q = new ArrayList();
    int i3 = cursor.getColumnIndex("rowid");
    int i12 = cursor.getColumnIndex("COL_PATH");
    int i1 = cursor.getColumnIndex("COL_TITLE");
    int i4 = cursor.getColumnIndex(GMDx.ZbSuNkVipjwqP);
    int i7 = cursor.getColumnIndex("COL_ARTIST");
    int m = cursor.getColumnIndex("COL_GENRE");
    int i9 = cursor.getColumnIndex("COL_COMPOSER");
    int i10 = cursor.getColumnIndex("COL_YEAR");
    int n = cursor.getColumnIndex("COL_DURATION");
    int i6 = cursor.getColumnIndex("COL_TRACK_NO");
    int i8 = cursor.getColumnIndex(eRUgfgGAccgka.VtliwqErxVUFK);
    j = cursor.getColumnIndex("COL_DATE_MODIFIED");
    int i16 = cursor.getColumnIndex("COL_LAST_PLAYED");
    Integer integer = Integer.valueOf(2);
    int i14 = cursor.getColumnIndex("COL_NUM_PLAYED");
    int i17 = cursor.getColumnIndex("COL_LASTPOS");
    int k = cursor.getColumnIndex("album_artist");
    int i13 = cursor.getColumnIndex("COL_NUM_PLAYED_W");
    int i15 = cursor.getColumnIndex("COL_NUM_PLAYED_M");
    int i18 = cursor.getColumnIndex("COL_NUM_PLAYED_Y");
    int i11 = cursor.getColumnIndex("COL_LOGPATH");
    int i5 = cursor.getColumnIndex("COL_VIS_FLAGS");
    int i2 = cursor.getColumnIndex("COL_GAINS");
    SharedPreferences sharedPreferences2 = MyApplication.x();
    long l1 = 0L;
    long l2 = sharedPreferences2.getLong("s_pmth2", 0L);
    if (l2 > 10800000L)
      l1 = l2; 
    l2 = (MyApplication.x().getInt("s_disl2", 0) + 1);
    boolean bool2 = false;
    i = 0;
    boolean bool10 = false;
    boolean bool9 = false;
    boolean bool8 = false;
    boolean bool7 = false;
    boolean bool6 = false;
    boolean bool5 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    bool11 = false;
    bool12 = false;
    label575: while (true) {
      String str2;
      jm0 jm01;
      if (cursor.moveToNext()) {
        String str3 = cursor.getString(i12);
        if (!str3.startsWith("file:") && !str3.startsWith("content") && (Build.VERSION.SDK_INT < 30 || !str3.startsWith("musicolet")))
          continue; 
        bool13 = bool11;
        int i20 = cursor.getInt(i5);
        int i19 = this.B;
        if ((i20 & i19) == i19 && (i20 & this.C) == 0) {
          int i21;
          int i30;
          ml0 ml0;
          StringBuilder stringBuilder1;
          int i27 = cursor.getInt(n);
          if (i27 < this.r) {
            this.z++;
            continue;
          } 
          int i22 = cursor.getInt(i3);
          String str9 = cursor.getString(i1);
          String str11 = cursor.getString(i4);
          String str6 = cursor.getString(i7);
          String str7 = cursor.getString(m);
          String str8 = cursor.getString(i9);
          int i26 = cursor.getInt(i10);
          int i25 = cursor.getInt(i6);
          long l6 = cursor.getLong(i8);
          long l5 = cursor.getLong(j);
          long l7 = cursor.getLong(i16);
          int i23 = cursor.getInt(i14);
          long l4 = cursor.getLong(i17);
          String str10 = cursor.getString(k);
          int i28 = cursor.getInt(i13);
          int i24 = cursor.getInt(i15);
          int i29 = cursor.getInt(i18);
          String str12 = cursor.getString(i11);
          if (str12 == null) {
            stringBuilder1 = new StringBuilder("Li<i>: lP=null; lp=");
            stringBuilder1.append(str12);
            stringBuilder1.append("; fp=");
            stringBuilder1.append(str3);
            n21.F(stringBuilder1.toString());
            continue;
          } 
          String str13 = ml0.b(str12);
          String str5 = ml0.c(str12);
          if (str5 == null) {
            str5 = null;
          } else {
            ml0 = new ml0(str5);
          } 
          if (ml0 == null) {
            stringBuilder1 = new StringBuilder("Li<i>: lFp=null; lFp=");
            stringBuilder1.append(str12);
            stringBuilder1.append("; fp=");
            stringBuilder1.append(str3);
            n21.F(stringBuilder1.toString());
            continue;
          } 
          String str14 = ((ml0)stringBuilder1).b;
          ml0.b(str14);
          String str4 = cursor.getString(i2);
          if (!TextUtils.isEmpty(str4))
            try {
              if (str4.startsWith("[")) {
                bool11 = str4.startsWith("[-999");
                if (!bool11)
                  this.x++; 
              } 
            } finally {} 
          if (!TextUtils.isEmpty(str4))
            try {
              if (str4.endsWith("]")) {
                bool11 = str4.endsWith("-999.0]");
                if (!bool11)
                  this.y++; 
              } 
            } finally {} 
          if (str11 != null) {
            i21 = str11.length();
            for (i19 = 0; i19 < i21; i19 = Character.charCount(i30) + i19) {
              i30 = str11.codePointAt(i19);
              if (!Character.isWhitespace(i30)) {
                str4 = str11;
                continue label575;
              } 
            } 
          } 
          str4 = "<unknown>";
          if (str6 != null) {
            i21 = str6.length();
            i19 = 0;
            while (true)
              i19 = Character.charCount(i30) + i19; 
          } 
          str6 = "<unknown>";
          while (true)
            i19 = Character.charCount(i30) + i19; 
        } 
        this.A++;
        continue;
      } 
      cursor.close();
      ArrayList<Cursor> arrayList = this.g;
      k = arrayList.size();
      j = 0;
      while (j < k) {
        cursor = arrayList.get(j);
        j++;
        ((q3)cursor).t = true;
      } 
      ArrayList<ArrayList<Cursor>> arrayList1 = this.i;
      k = arrayList1.size();
      j = 0;
      while (j < k) {
        arrayList = arrayList1.get(j);
        j++;
        ((q3)arrayList).t = true;
      } 
      arrayList = this.k;
      k = arrayList.size();
      j = 0;
      while (j < k) {
        arrayList1 = (ArrayList<ArrayList<Cursor>>)arrayList.get(j);
        j++;
        ((q3)arrayList1).t = true;
      } 
      arrayList = this.o;
      k = arrayList.size();
      j = 0;
      while (j < k) {
        arrayList1 = (ArrayList<ArrayList<Cursor>>)arrayList.get(j);
        j++;
        ((q3)arrayList1).t = true;
      } 
      arrayList = this.m;
      k = arrayList.size();
      j = 0;
      while (j < k) {
        arrayList1 = (ArrayList<ArrayList<Cursor>>)arrayList.get(j);
        j++;
        ((q3)arrayList1).t = true;
      } 
      arrayList = this.q;
      k = arrayList.size();
      j = 0;
      while (j < k) {
        arrayList1 = (ArrayList<ArrayList<Cursor>>)arrayList.get(j);
        j++;
        ((k90)arrayList1).k = true;
      } 
      this.b.trimToSize();
      this.g.trimToSize();
      this.i.trimToSize();
      this.k.trimToSize();
      this.o.trimToSize();
      this.m.trimToSize();
      this.q.trimToSize();
      this.s = l1;
      s();
      HashMap<String, jm0> hashMap = this.v;
      jm0 jm02 = new jm0("", "");
      ArrayList<jm0> arrayList2 = this.q;
      m = arrayList2.size();
      j = 0;
      while (true) {
        jm01 = jm02;
        if (j < m) {
          jm0 jm03;
          jm01 = arrayList2.get(j);
          k = j + 1;
          k90 k90 = (k90)jm01;
          String str3 = k90.c;
          String str4 = str3.toLowerCase(Locale.ENGLISH);
          str2 = str4;
          sharedPreferences2 = null;
          while (!TextUtils.isEmpty(str2)) {
            jm0 jm04 = (jm0)hashMap.get(str2);
            if (jm04 == null) {
              jm04 = new jm0(str3, str2);
              hashMap.put(str2, jm04);
              if (str4 == str2)
                jm04.g = k90; 
              if (sharedPreferences2 != null) {
                jm04.e.add(sharedPreferences2);
                ((jm0)sharedPreferences2).f = jm04;
              } 
              str2 = wf2.A(str2);
              str3 = wf2.A(str3);
              jm03 = jm04;
              continue;
            } 
            if (str4 == str2)
              jm04.g = k90; 
            j = k;
            if (jm03 != null) {
              jm04.e.add(jm03);
              jm03.f = jm04;
              j = k;
            } 
          } 
          if (str4 == str2)
            jm02.g = k90; 
          j = k;
          if (jm03 != null) {
            jm02.e.add(jm03);
            jm03.f = jm02;
            j = k;
          } 
          continue;
        } 
        break;
      } 
      while (true) {
        arrayList1 = ((jm0)str2).e;
        if (arrayList1.size() == 1 && ((jm0)str2).g == null) {
          jm01 = (jm0)arrayList1.get(0);
          jm01.f = null;
          continue;
        } 
        break;
      } 
      jm01.d();
      this.t = jm01;
      this.u = null;
      String str1 = MyApplication.o().getString("k_s_hfp", null);
      if (!TextUtils.isEmpty(str1)) {
        jm0 jm03 = hashMap.get(str1.toLowerCase(Locale.ENGLISH));
        if (jm03 != null)
          this.u = jm03; 
      } 
      if (this.u == null)
        this.u = this.t; 
      q01.b.clear();
      if (bool2) {
        this.I = true;
        this.J = bool11;
        this.K = "CPCc_M";
        this.L = l51.d("CPCc_M", false, true, false);
      } else if (i != 0) {
        this.I = true;
        this.J = bool12;
        this.K = "CPCc_Y";
        this.L = l51.d("CPCc_Y", false, true, false);
      } else {
        this.I = false;
        this.J = false;
        this.K = "";
        this.L = "";
      } 
      StringBuilder stringBuilder = new StringBuilder("NLB:");
      stringBuilder.append(System.currentTimeMillis() - l3);
      n21.F(stringBuilder.toString());
      return;
      integer1 = integer;
      q011 = q01;
      i19 = i6;
      cursor1 = cursor;
      i19 = i4;
      i19 = i7;
      i19 = i5;
      i19 = i3;
      i19 = i1;
      i19 = i9;
      i19 = i8;
      i19 = j;
      i19 = k;
      i19 = m;
      i19 = n;
      i19 = i2;
    } 
  }
  
  public static String c(String paramString1, String paramString2) {
    try {
      boolean bool1 = Character.isLetterOrDigit(paramString1.charAt(0));
      return paramString2;
    } finally {
      paramString1 = null;
      paramString1.printStackTrace();
    } 
  }
  
  public static km0[] l(ArrayList paramArrayList) {
    return (km0[])paramArrayList.toArray((Object[])new km0[0]);
  }
  
  public static Pattern r() {
    String str = MyApplication.o().getString("k_s_marsp", ", ; / | & ft. feat.");
    String[] arrayOfString = O.split(str);
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str1 = arrayOfString[b].trim();
      StringBuilder stringBuilder = new StringBuilder("(");
      stringBuilder.append(Pattern.quote(str1));
      stringBuilder.append(")");
      String str2 = stringBuilder.toString();
      arrayOfString[b] = str2;
      arrayOfString[b] = c(str1, str2);
    } 
    return Pattern.compile(TextUtils.join("|", (Object[])arrayOfString), 2);
  }
  
  public final km0 a(int paramInt) {
    return (km0)this.e.get(Integer.valueOf(paramInt));
  }
  
  public final km0 b(wo paramwo) {
    return (km0)this.c.get(paramwo);
  }
  
  public final ArrayList d() {
    return (ArrayList)this.k.clone();
  }
  
  public final ArrayList e() {
    return (ArrayList)this.g.clone();
  }
  
  public final ArrayList f() {
    return (ArrayList)this.i.clone();
  }
  
  public final ArrayList g() {
    return (ArrayList)this.o.clone();
  }
  
  public final ArrayList h() {
    return (ArrayList)this.m.clone();
  }
  
  public final ArrayList i(int... paramVarArgs) {
    int i = paramVarArgs.length;
    ArrayList<?> arrayList = this.b;
    if (i > 0) {
      arrayList = new ArrayList(arrayList);
      z51.R(paramVarArgs[0], arrayList);
      return arrayList;
    } 
    return new ArrayList(arrayList);
  }
  
  public final jm0 j(String paramString) {
    if (paramString != null) {
      paramString = paramString.toLowerCase(Locale.ENGLISH);
      jm0 jm01 = (jm0)this.v.get(paramString);
      if (jm01 != null)
        return jm01; 
    } 
    return null;
  }
  
  public final ArrayList k(String paramString) {
    ArrayList<km0> arrayList1 = new ArrayList();
    String[] arrayOfString = ag0.i0(paramString.trim().toUpperCase().toLowerCase()).split("(\\s)+");
    ArrayList<Object> arrayList = this.b;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      km0 km0 = (km0)arrayList.get(i);
      int k = i + 1;
      km0 = km0;
      i = k;
      if (km0.a(arrayOfString)) {
        arrayList1.add(km0);
        i = k;
      } 
    } 
    return arrayList1;
  }
  
  public final ArrayList m(String paramString) {
    k90 k90 = (k90)this.p.get(paramString);
    return (k90 != null) ? k90.c(this, new int[0]) : new ArrayList();
  }
  
  public final ArrayList n(String paramString) {
    boolean bool = false;
    if (paramString != null) {
      String str = paramString.toLowerCase(Locale.ENGLISH);
      jm0 jm01 = (jm0)this.v.get(str);
      if (jm01 != null) {
        ArrayList<Object> arrayList2 = jm01.m;
        ArrayList<Object> arrayList1 = arrayList2;
        if (arrayList2 == null) {
          Object object;
          arrayList1 = new ArrayList();
          arrayList2 = this.b;
          int i = arrayList2.size();
          while (object < i) {
            Object object1 = arrayList2.get(object);
            int k = object + 1;
            km0 km0 = (km0)object1;
            object1 = km0.h.toLowerCase(Locale.ENGLISH);
            int j = k;
            if (object1.startsWith(str)) {
              if (object1.length() != str.length()) {
                j = k;
                if (object1.length() > str.length()) {
                  j = k;
                  if (object1.charAt(str.length()) == '/')
                    continue; 
                } 
                continue;
              } 
              continue;
            } 
            continue;
            arrayList1.add(SYNTHETIC_LOCAL_VARIABLE_9);
            object = SYNTHETIC_LOCAL_VARIABLE_3;
          } 
          jm01.m = arrayList1;
        } 
        return new ArrayList(arrayList1);
      } 
    } 
    return new ArrayList(0);
  }
  
  public final ArrayList o(int paramInt1, int paramInt2) {
    ArrayList<km0> arrayList = new ArrayList();
    ArrayList<Object> arrayList1 = this.b;
    int j = arrayList1.size();
    int i = 0;
    while (i < j) {
      km0 km01 = (km0)arrayList1.get(i);
      int k = i + 1;
      km0 km02 = km01;
      long l = km02.m;
      if (l == 0L) {
        i = k;
        continue;
      } 
      Calendar calendar = N;
      calendar.setTimeInMillis(l);
      int n = calendar.get(1);
      int m = calendar.get(2);
      i = k;
      if (n == paramInt2) {
        i = k;
        if (m == paramInt1) {
          arrayList.add(km02);
          i = k;
        } 
      } 
    } 
    return arrayList;
  }
  
  public final ArrayList p(int paramInt) {
    ArrayList<km0> arrayList = new ArrayList();
    ArrayList<Object> arrayList1 = this.b;
    int j = arrayList1.size();
    int i = 0;
    while (i < j) {
      km0 km01 = (km0)arrayList1.get(i);
      int k = i + 1;
      km0 km02 = km01;
      long l = km02.m;
      if (l == 0L) {
        i = k;
        continue;
      } 
      Calendar calendar = N;
      calendar.setTimeInMillis(l);
      i = k;
      if (calendar.get(1) == paramInt) {
        arrayList.add(km02);
        i = k;
      } 
    } 
    return arrayList;
  }
  
  public final ArrayList q(int paramInt1, int paramInt2) {
    ArrayList<km0> arrayList1 = new ArrayList();
    ArrayList<Object> arrayList = this.b;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      km0 km01 = (km0)arrayList.get(i);
      int k = i + 1;
      km0 km02 = km01;
      long l = km02.m;
      if (l == 0L) {
        i = k;
        continue;
      } 
      Calendar calendar = N;
      calendar.setTimeInMillis(l);
      int m = calendar.get(1);
      int n = calendar.get(3);
      i = k;
      if (m == paramInt1) {
        i = k;
        if (n == paramInt2) {
          arrayList1.add(km02);
          i = k;
        } 
      } 
    } 
    return arrayList1;
  }
  
  public final void s() {
    z51.R(0, this.b);
    z51.Q(0, this.q);
    boolean bool1 = z51.x(8);
    boolean bool2 = z51.w(8);
    z51.P(this.g, 0, bool1, bool2);
    bool2 = z51.x(16);
    bool1 = z51.w(16);
    z51.P(this.i, 0, bool2, bool1);
    bool2 = z51.x(32);
    bool1 = z51.w(32);
    z51.P(this.k, 0, bool2, bool1);
    z51.P(this.m, 0, false, false);
    bool1 = z51.x(64);
    bool2 = z51.w(64);
    z51.P(this.o, 0, bool1, bool2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */