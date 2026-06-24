import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

public final class x01 {
  public final rw0 a;
  
  public final ArrayList b;
  
  public final int c = 0;
  
  public final int d = 0;
  
  public x01(rw0 paramrw0) {
    this.a = paramrw0;
    ArrayList<Object> arrayList = new ArrayList();
    this.b = arrayList;
    arrayList.clear();
    this.c = 0;
    this.d = 0;
    for (byte b = 0; b < paramrw0.f.size(); b++) {
      MenuItem menuItem = paramrw0.getItem(b);
      if (menuItem.hasSubMenu()) {
        if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof q00) && menuItem.isVisible())
          arrayList.add(new Object()); 
        arrayList.add(menuItem);
        SubMenu subMenu = menuItem.getSubMenu();
        for (byte b1 = 0; b1 < subMenu.size(); b1++) {
          MenuItem menuItem1 = subMenu.getItem(b1);
          if (!menuItem.isVisible())
            menuItem1.setVisible(false); 
          arrayList.add(menuItem1);
          if (menuItem1.isVisible())
            this.c++; 
        } 
        arrayList.add(new Object());
      } else {
        arrayList.add(menuItem);
        if (menuItem.isVisible()) {
          this.c++;
          this.d++;
        } 
      } 
    } 
    if (!arrayList.isEmpty() && arrayList.get(arrayList.size() - 1) instanceof q00)
      arrayList.remove(arrayList.size() - 1); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */