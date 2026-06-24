import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

public final class ac0 implements Closeable {
  public static final String[] c = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
  
  public static final String[] e = new String[0];
  
  public static final vl0 f = dd1.R(new i2(1));
  
  public static final vl0 g = dd1.R(new i2(2));
  
  public final SQLiteDatabase b;
  
  public ac0(SQLiteDatabase paramSQLiteDatabase) {
    this.b = paramSQLiteDatabase;
  }
  
  public final void a() {
    this.b.beginTransaction();
  }
  
  public final void c() {
    this.b.beginTransactionNonExclusive();
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final hc0 d(String paramString) {
    paramString.getClass();
    SQLiteStatement sQLiteStatement = this.b.compileStatement(paramString);
    sQLiteStatement.getClass();
    return new hc0(sQLiteStatement);
  }
  
  public final void g() {
    this.b.endTransaction();
  }
  
  public final void h(String paramString) {
    this.b.execSQL(paramString);
  }
  
  public final void k(Object[] paramArrayOfObject) {
    this.b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", paramArrayOfObject);
  }
  
  public final boolean l() {
    return this.b.inTransaction();
  }
  
  public final void m() {
    this.b.setTransactionSuccessful();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ac0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */