import android.database.sqlite.SQLiteProgram;

public class gc0 implements lr1 {
  public final SQLiteProgram b;
  
  public gc0(SQLiteProgram paramSQLiteProgram) {
    this.b = paramSQLiteProgram;
  }
  
  public final void I(String paramString, int paramInt) {
    paramString.getClass();
    this.b.bindString(paramInt, paramString);
  }
  
  public final void b(int paramInt) {
    this.b.bindNull(paramInt);
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final void e(int paramInt, long paramLong) {
    this.b.bindLong(paramInt, paramLong);
  }
  
  public final void f(int paramInt, byte[] paramArrayOfbyte) {
    this.b.bindBlob(paramInt, paramArrayOfbyte);
  }
  
  public final void n(double paramDouble, int paramInt) {
    this.b.bindDouble(paramInt, paramDouble);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */