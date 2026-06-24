import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;

public final class ec0 extends SQLiteOpenHelper {
  public static final int j = 0;
  
  public final Context b;
  
  public final gh1 c;
  
  public final mi2 e;
  
  public final boolean f;
  
  public boolean g;
  
  public final ja1 h;
  
  public boolean i;
  
  public ec0(Context paramContext, String paramString, gh1 paramgh1, mi2 parammi2, boolean paramBoolean) {
    super(paramContext, paramString, null, parammi2.c, new bc0(parammi2, paramgh1));
    this.b = paramContext;
    this.c = paramgh1;
    this.e = parammi2;
    this.f = paramBoolean;
    if (paramString == null) {
      paramString = UUID.randomUUID().toString();
      paramString.getClass();
    } 
    this.h = new ja1(paramString, paramContext.getCacheDir(), false);
  }
  
  public final ac0 a(boolean paramBoolean) {
    boolean bool;
    ja1 ja11 = this.h;
    try {
      if (!this.i && getDatabaseName() != null) {
        bool = true;
      } else {
        bool = false;
      } 
    } finally {
      Exception exception;
    } 
    ja11.a(bool);
    this.g = false;
    SQLiteDatabase sQLiteDatabase = d(paramBoolean);
    if (this.g) {
      close();
      ac0 = a(paramBoolean);
      ja11.b();
      return ac0;
    } 
    ac0 ac0 = c((SQLiteDatabase)ac0);
    ja11.b();
    return ac0;
  }
  
  public final ac0 c(SQLiteDatabase paramSQLiteDatabase) {
    gh1 gh11 = this.c;
    gh11.getClass();
    ac0 ac0 = (ac0)gh11.c;
    if (ac0 == null || !ac0.b.equals(paramSQLiteDatabase)) {
      ac0 ac01 = new ac0(paramSQLiteDatabase);
      gh11.c = ac01;
      return ac01;
    } 
    return ac0;
  }
  
  public final void close() {
    ja1 ja11 = this.h;
    try {
      ja11.a(ja11.a);
      super.close();
      this.c.c = null;
      this.i = false;
      return;
    } finally {
      ja11.b();
    } 
  }
  
  public final SQLiteDatabase d(boolean paramBoolean) {
    String str = getDatabaseName();
    boolean bool = this.i;
    Context context = this.b;
    if (str != null && !bool) {
      File file = context.getDatabasePath(str).getParentFile();
      if (file != null) {
        file.mkdirs();
        if (!file.isDirectory()) {
          StringBuilder stringBuilder = new StringBuilder("Invalid database parent file, not a directory: ");
          stringBuilder.append(file);
          Log.w("SupportSQLite", stringBuilder.toString());
        } 
      } 
    } 
    if (paramBoolean)
      try {
        return sQLiteDatabase1;
      } finally {
        SQLiteDatabase sQLiteDatabase1;
        Exception exception = null;
        try {
          Thread.sleep(500L);
        } catch (InterruptedException interruptedException) {}
        if (paramBoolean) {
          try {
            sQLiteDatabase1 = getWritableDatabase();
            sQLiteDatabase1.getClass();
          } finally {}
        } else {
          sQLiteDatabase1 = getReadableDatabase();
          sQLiteDatabase1.getClass();
        } 
      }  
    SQLiteDatabase sQLiteDatabase = getReadableDatabase();
    sQLiteDatabase.getClass();
    return sQLiteDatabase;
  }
  
  public final void onConfigure(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.getClass();
    boolean bool = this.g;
    mi2 mi21 = this.e;
    if (!bool && mi21.c != paramSQLiteDatabase.getVersion())
      paramSQLiteDatabase.setMaxSqlCacheSize(1); 
    try {
      c(paramSQLiteDatabase);
      return;
    } finally {
      paramSQLiteDatabase = null;
    } 
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.getClass();
    try {
      mi2 mi21 = this.e;
      ac0 ac0 = c(paramSQLiteDatabase);
      ah1 ah1 = (ah1)mi21.e;
      er1 er1 = new er1();
      this(ac0);
      return;
    } finally {
      paramSQLiteDatabase = null;
    } 
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.getClass();
    this.g = true;
    try {
      return;
    } finally {
      paramSQLiteDatabase = null;
    } 
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.getClass();
    if (!this.g)
      try {
        mi2 mi21 = this.e;
        ac0 ac0 = c(paramSQLiteDatabase);
        ah1 ah1 = (ah1)mi21.e;
        er1 er1 = new er1();
        this(ac0);
        ah1.f(er1);
        ah1.g = ac0;
      } finally {
        paramSQLiteDatabase = null;
      }  
    this.i = true;
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.getClass();
    this.g = true;
    try {
      return;
    } finally {
      paramSQLiteDatabase = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ec0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */