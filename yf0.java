import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.fh;
import in.krosbits.musicolet.lc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class yf0 implements Runnable {
  public static final yf0 c = new yf0(2);
  
  public final int b;
  
  private final void b() {}
  
  public final void run() {
    switch (this.b) {
      default:
        return;
      case 1:
        try {
          ag0.m.removeCallbacks(this);
          fh.a(MyApplication.i.getApplicationContext(), lc.c);
        } finally {
          Exception exception = null;
        } 
      case 0:
        break;
    } 
    try {
      Cursor cursor;
      ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
      HashSet<String> hashSet = new HashSet();
      this();
      if (MyApplication.F.p()) {
        long l2 = System.currentTimeMillis() / 1000L;
        long l1 = ag0.q / 1000L;
        long l3 = ag0.p / 1000L;
        Iterator<Uri> iterator = wn1.d().iterator();
        while (true) {
          Cursor cursor1;
          boolean bool = iterator.hasNext();
          String str5 = ") OR (";
          String str3 = "date_added";
          String str2 = ") AND ((";
          String str1 = "<";
          String str6 = ">";
          String str4 = "date_modified";
          if (bool) {
            Uri uri = iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("(date_added<");
            stringBuilder.append(l2);
            stringBuilder.append(") AND (");
            stringBuilder.append("date_modified");
            stringBuilder.append("<");
            stringBuilder.append(l2);
            stringBuilder.append(") AND ((");
            stringBuilder.append("date_added");
            stringBuilder.append(">");
            stringBuilder.append(l3);
            stringBuilder.append(") OR (");
            stringBuilder.append("date_modified");
            stringBuilder.append(">");
            stringBuilder.append(l1);
            stringBuilder.append("))");
            str1 = stringBuilder.toString();
            cursor1 = contentResolver.query(uri, new String[] { "_data" }, str1, null, null);
            if (cursor1 != null) {
              while (cursor1.moveToNext()) {
                str1 = cursor1.getString(0);
                str1 = ml0.c(MyApplication.F.f(str1));
                if (str1 != null)
                  hashSet.add(str1); 
              } 
              cursor1.close();
            } 
            continue;
          } 
          HashSet<String> hashSet1 = hashSet;
          try {
            SharedPreferences sharedPreferences = MyApplication.o();
            String str = "))";
          } finally {
            hashSet = null;
            HashSet<String> hashSet2 = hashSet1;
            hashSet1 = hashSet;
          } 
          cursor = cursor1;
          break;
        } 
      } 
      if (!cursor.isEmpty()) {
        ArrayList<v00> arrayList = new ArrayList();
        this(cursor.size());
        for (String str : cursor) {
          v00 v00 = MyApplication.F.d(str);
          if (v00 != null)
            arrayList.add(v00); 
        } 
      } 
      im0 im0 = new im0();
      this(true, false, false);
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */