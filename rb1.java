import android.database.AbstractCursor;
import java.util.ArrayList;

public final class rb1 extends AbstractCursor {
  public final ArrayList b;
  
  public rb1(ArrayList paramArrayList) {
    this.b = paramArrayList;
  }
  
  public final String[] getColumnNames() {
    return new String[] { "_id" };
  }
  
  public final int getCount() {
    return this.b.size();
  }
  
  public final double getDouble(int paramInt) {
    return 0.0D;
  }
  
  public final float getFloat(int paramInt) {
    return 0.0F;
  }
  
  public final int getInt(int paramInt) {
    return 0;
  }
  
  public final long getLong(int paramInt) {
    return 0L;
  }
  
  public final short getShort(int paramInt) {
    return 0;
  }
  
  public final String getString(int paramInt) {
    return null;
  }
  
  public final boolean isNull(int paramInt) {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */