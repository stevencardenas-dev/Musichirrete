import android.content.Context;
import android.content.res.Resources;
import android.widget.ArrayAdapter;

public final class x3 extends ArrayAdapter {
  public final int b;
  
  public int getCount() {
    switch (this.b) {
      default:
        return super.getCount();
      case 1:
        break;
    } 
    return 59;
  }
  
  public Object getItem(int paramInt) {
    switch (this.b) {
      default:
        return super.getItem(paramInt);
      case 1:
        break;
    } 
    Resources resources = getContext().getResources();
    return resources.getQuantityString(2131755052, ++paramInt, new Object[] { Integer.valueOf(paramInt) });
  }
  
  public long getItemId(int paramInt) {
    switch (this.b) {
      default:
        return super.getItemId(paramInt);
      case 0:
        break;
    } 
    return paramInt;
  }
  
  public boolean hasStableIds() {
    switch (this.b) {
      default:
        return super.hasStableIds();
      case 0:
        break;
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */