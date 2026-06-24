import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.Arrays;
import java.util.List;

public final class fj1 extends SQLiteOpenHelper {
  public static final String e;
  
  public static final int f = 5;
  
  public static final List g = Arrays.asList(new ej1[] { new ej1(0), new ej1(1), new ej1(2), new ej1(3), new ej1(4) });
  
  public final int b;
  
  public boolean c = false;
  
  public fj1(int paramInt, Context paramContext, String paramString) {
    super(paramContext, paramString, null, paramInt);
    this.b = paramInt;
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    List list = g;
    if (paramInt2 <= list.size()) {
      while (paramInt1 < paramInt2) {
        switch (((ej1)list.get(paramInt1)).a) {
          default:
            paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
            paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
            paramSQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
            paramSQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
            paramSQLiteDatabase.execSQL(e);
            break;
          case 3:
            paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
            paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
            paramSQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            break;
          case 2:
            paramSQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            break;
          case 1:
            paramSQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
            paramSQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
            paramSQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            break;
          case 0:
            paramSQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
            paramSQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
            paramSQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
            paramSQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
            paramSQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            break;
        } 
        paramInt1++;
      } 
      return;
    } 
    int i = list.size();
    StringBuilder stringBuilder = new StringBuilder("Migration from ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" to ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" was requested, but cannot be performed. Only ");
    stringBuilder.append(i);
    stringBuilder.append(" migrations are provided");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final void onConfigure(SQLiteDatabase paramSQLiteDatabase) {
    this.c = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    if (!this.c)
      onConfigure(paramSQLiteDatabase); 
    a(paramSQLiteDatabase, 0, this.b);
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
    if (!this.c)
      onConfigure(paramSQLiteDatabase); 
    a(paramSQLiteDatabase, 0, paramInt2);
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase) {
    if (!this.c)
      onConfigure(paramSQLiteDatabase); 
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    if (!this.c)
      onConfigure(paramSQLiteDatabase); 
    a(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  static {
    StringBuilder stringBuilder = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
    stringBuilder.append(System.currentTimeMillis());
    stringBuilder.append(LHyji.dRBUBBzQ);
    e = stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */