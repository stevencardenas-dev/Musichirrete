public abstract class qx0 {
  public final int a;
  
  public final int b;
  
  public qx0(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void a(ac0 paramac0) {
    paramac0.getClass();
    throw new Error("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
  }
  
  public void b(th1 paramth1) {
    paramth1.getClass();
    if (paramth1 instanceof er1) {
      a(((er1)paramth1).b);
      return;
    } 
    throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */