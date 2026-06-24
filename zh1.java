import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public final class zh1 implements Closeable {
  public static final j40 h = new j40("proto");
  
  public final fj1 b;
  
  public final am c;
  
  public final am e;
  
  public final ab f;
  
  public final fb1 g;
  
  public zh1(am paramam1, am paramam2, ab paramab, fj1 paramfj1, fb1 paramfb1) {
    this.b = paramfj1;
    this.c = paramam1;
    this.e = paramam2;
    this.f = paramab;
    this.g = paramfb1;
  }
  
  public static Long c(SQLiteDatabase paramSQLiteDatabase, ib paramib) {
    StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
    ArrayList<String> arrayList = new ArrayList(Arrays.asList((Object[])new String[] { paramib.a, String.valueOf(ia1.a(paramib.c)) }));
    byte[] arrayOfByte = paramib.b;
    if (arrayOfByte != null) {
      stringBuilder.append(FgdLmmRfTxSFKI.pmEJvY);
      arrayList.add(Base64.encodeToString(arrayOfByte, 0));
    } else {
      stringBuilder.append(" and extras is null");
    } 
    String str = stringBuilder.toString();
    String[] arrayOfString = arrayList.<String>toArray(new String[0]);
    Cursor cursor = paramSQLiteDatabase.query("transport_contexts", new String[] { "_id" }, str, arrayOfString, null, null, null);
    try {
      Long long_;
      if (!cursor.moveToNext()) {
        paramSQLiteDatabase = null;
      } else {
        long_ = Long.valueOf(cursor.getLong(0));
      } 
      return long_;
    } finally {
      cursor.close();
    } 
  }
  
  public static String l(Iterable paramIterable) {
    StringBuilder stringBuilder = new StringBuilder("(");
    Iterator iterator = paramIterable.iterator();
    while (iterator.hasNext()) {
      stringBuilder.append(((fb)iterator.next()).a);
      if (iterator.hasNext())
        stringBuilder.append(','); 
    } 
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public static Object m(Cursor paramCursor, xh1 paramxh1) {
    try {
      return paramxh1.apply(paramCursor);
    } finally {
      paramCursor.close();
    } 
  }
  
  public final SQLiteDatabase a() {
    fj1 fj11 = this.b;
    Objects.requireNonNull(fj11);
    am am1 = this.e;
    long l = am1.i();
    while (true) {
      try {
        return fj11.getWritableDatabase();
      } catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
        if (am1.i() < this.f.c + l) {
          SystemClock.sleep(50L);
          continue;
        } 
        throw new RuntimeException("Timed out while trying to open db.", sQLiteDatabaseLockedException);
      } 
    } 
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final Object d(xh1 paramxh1) {
    SQLiteDatabase sQLiteDatabase = a();
    sQLiteDatabase.beginTransaction();
    try {
      Object object = paramxh1.apply(sQLiteDatabase);
      sQLiteDatabase.setTransactionSuccessful();
      return object;
    } finally {
      sQLiteDatabase.endTransaction();
    } 
  }
  
  public final ArrayList g(SQLiteDatabase paramSQLiteDatabase, ib paramib, int paramInt) {
    ArrayList arrayList = new ArrayList();
    Long long_ = c(paramSQLiteDatabase, paramib);
    if (long_ == null)
      return arrayList; 
    String str = long_.toString();
    m(paramSQLiteDatabase.query("events", new String[] { "_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline" }, "context_id = ?", new String[] { str }, null, null, null, String.valueOf(paramInt)), new xw(this, arrayList, paramib, 7));
    return arrayList;
  }
  
  public final void h(long paramLong, lp0 paramlp0, String paramString) {
    d(new wh1(paramLong, paramString, paramlp0));
  }
  
  public final Object k(bs1 parambs1) {
    SQLiteDatabase sQLiteDatabase = a();
    am am1 = this.e;
    long l = am1.i();
    while (true) {
      try {
        sQLiteDatabase.beginTransaction();
        try {
          Object object = parambs1.c();
          sQLiteDatabase.setTransactionSuccessful();
          return object;
        } finally {
          sQLiteDatabase.endTransaction();
        } 
      } catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
        if (am1.i() < this.f.c + l) {
          SystemClock.sleep(50L);
          continue;
        } 
        throw new RuntimeException("Timed out while trying to acquire the lock.", sQLiteDatabaseLockedException);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */