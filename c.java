import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import in.krosbits.musicolet.EqualizerActivity2;

public final class c extends SQLiteOpenHelper {
  public final int a(String paramString, int paramInt) {
    byte b;
    if (TextUtils.isEmpty(paramString))
      return -1; 
    Cursor cursor = getReadableDatabase().query("TABLE_DEVICES", new String[] { "COL_ID" }, "COL_NAME=?", new String[] { paramString }, null, null, null, "1");
    if (cursor != null) {
      if (cursor.moveToNext()) {
        b = cursor.getInt(0);
      } else {
        b = -1;
      } 
      cursor.close();
    } else {
      b = -1;
    } 
    int i = b;
    if (b == -1) {
      ContentValues contentValues = new ContentValues(2);
      contentValues.put("COL_NAME", paramString);
      contentValues.put("COL_TYPE", Integer.valueOf(paramInt));
      SQLiteDatabase sQLiteDatabase = getWritableDatabase();
      sQLiteDatabase.insertWithOnConflict("TABLE_DEVICES", null, contentValues, 4);
      sQLiteDatabase.close();
      Cursor cursor1 = getReadableDatabase().query("TABLE_DEVICES", new String[] { "COL_ID" }, "COL_NAME=?", new String[] { paramString }, null, null, null, "1");
      paramInt = b;
      if (cursor1 != null) {
        paramInt = b;
        if (cursor1.moveToNext())
          paramInt = cursor1.getInt(0); 
        cursor1.close();
      } 
      EqualizerActivity2.r0 = null;
      j50.b.clear();
      EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
      i = paramInt;
      if (equalizerActivity2 != null) {
        i = paramInt;
        if (equalizerActivity2.X != null) {
          equalizerActivity2.runOnUiThread(new l3(1));
          i = paramInt;
        } 
      } 
    } 
    return i;
  }
  
  public final void c(SQLiteDatabase paramSQLiteDatabase) {
    SQLiteDatabase sQLiteDatabase = null;
    try {
      SQLiteDatabase sQLiteDatabase1 = getWritableDatabase();
      try {
        sQLiteDatabase1.beginTransaction();
        sQLiteDatabase1.delete("TABLE_DEVICES", null, null);
        Cursor cursor = paramSQLiteDatabase.query("TABLE_DEVICES", new String[] { "COL_ID", "COL_NAME", "COL_TYPE" }, null, null, null, null, null);
      } finally {
        Exception exception = null;
      } 
      sQLiteDatabase1.setTransactionSuccessful();
      return;
    } finally {
      null = null;
      paramSQLiteDatabase = sQLiteDatabase;
    } 
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("create table TABLE_DEVICES (COL_ID INTEGER PRIMARY KEY AUTOINCREMENT, COL_NAME TEXT NOT NULL UNIQUE COLLATE NOCASE,COL_TYPE INTEGER NOT NULL DEFAULT 0 )");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */