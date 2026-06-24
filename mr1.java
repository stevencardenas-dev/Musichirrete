import android.database.Cursor;
import java.util.Arrays;

public final class mr1 extends or1 {
  public int[] f;
  
  public long[] g;
  
  public double[] h;
  
  public String[] i;
  
  public byte[][] j;
  
  public Cursor k;
  
  public static void g(Cursor paramCursor, int paramInt) {
    if (paramInt >= 0 && paramInt < paramCursor.getColumnCount())
      return; 
    m92.V("column index out of range", 25);
    throw null;
  }
  
  public final boolean L() {
    a();
    d();
    Cursor cursor = this.k;
    if (cursor != null)
      return cursor.moveToNext(); 
    tp.f("Required value was null.");
    return false;
  }
  
  public final void b(int paramInt) {
    a();
    c(5, paramInt);
    this.f[paramInt] = 5;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    paramInt2++;
    int[] arrayOfInt = this.f;
    if (arrayOfInt.length < paramInt2)
      this.f = Arrays.copyOf(arrayOfInt, paramInt2); 
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 == 4) {
            byte[][] arrayOfByte = this.j;
            if (arrayOfByte.length < paramInt2) {
              this.j = Arrays.<byte[]>copyOf(arrayOfByte, paramInt2);
              return;
            } 
          } 
        } else {
          String[] arrayOfString = this.i;
          if (arrayOfString.length < paramInt2) {
            this.i = Arrays.<String>copyOf(arrayOfString, paramInt2);
            return;
          } 
        } 
      } else {
        double[] arrayOfDouble = this.h;
        if (arrayOfDouble.length < paramInt2) {
          this.h = Arrays.copyOf(arrayOfDouble, paramInt2);
          return;
        } 
      } 
    } else {
      long[] arrayOfLong = this.g;
      if (arrayOfLong.length < paramInt2)
        this.g = Arrays.copyOf(arrayOfLong, paramInt2); 
    } 
  }
  
  public final void close() {
    if (!this.e) {
      a();
      this.f = new int[0];
      this.g = new long[0];
      this.h = new double[0];
      this.i = new String[0];
      this.j = new byte[0][];
      reset();
    } 
    this.e = true;
  }
  
  public final void d() {
    if (this.k == null) {
      bh0 bh0 = new bh0(27, this);
      ac0 ac0 = this.b;
      ac0.getClass();
      xb0 xb0 = new xb0(bh0);
      Cursor cursor = ac0.b.rawQueryWithFactory(new yb0(xb0), ((mr1)bh0.c).c, ac0.e, null);
      cursor.getClass();
      this.k = cursor;
    } 
  }
  
  public final void e(int paramInt, long paramLong) {
    a();
    c(1, paramInt);
    this.f[paramInt] = 1;
    this.g[paramInt] = paramLong;
  }
  
  public final void f(int paramInt, byte[] paramArrayOfbyte) {
    a();
    c(4, paramInt);
    this.f[paramInt] = 4;
    this.j[paramInt] = paramArrayOfbyte;
  }
  
  public final byte[] getBlob(int paramInt) {
    a();
    Cursor cursor = h();
    g(cursor, paramInt);
    byte[] arrayOfByte = cursor.getBlob(paramInt);
    arrayOfByte.getClass();
    return arrayOfByte;
  }
  
  public final int getColumnCount() {
    a();
    d();
    Cursor cursor = this.k;
    return (cursor != null) ? cursor.getColumnCount() : 0;
  }
  
  public final String getColumnName(int paramInt) {
    a();
    d();
    Cursor cursor = this.k;
    if (cursor != null) {
      g(cursor, paramInt);
      String str = cursor.getColumnName(paramInt);
      str.getClass();
      return str;
    } 
    tp.f("Required value was null.");
    return null;
  }
  
  public final long getLong(int paramInt) {
    a();
    Cursor cursor = h();
    g(cursor, paramInt);
    return cursor.getLong(paramInt);
  }
  
  public final Cursor h() {
    Cursor cursor = this.k;
    if (cursor != null)
      return cursor; 
    m92.V("no row", 21);
    throw null;
  }
  
  public final void i(String paramString, int paramInt) {
    paramString.getClass();
    a();
    c(3, paramInt);
    this.f[paramInt] = 3;
    this.i[paramInt] = paramString;
  }
  
  public final boolean isNull(int paramInt) {
    a();
    Cursor cursor = h();
    g(cursor, paramInt);
    return cursor.isNull(paramInt);
  }
  
  public final String j(int paramInt) {
    a();
    Cursor cursor = h();
    g(cursor, paramInt);
    String str = cursor.getString(paramInt);
    str.getClass();
    return str;
  }
  
  public final void reset() {
    a();
    Cursor cursor = this.k;
    if (cursor != null)
      cursor.close(); 
    this.k = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */