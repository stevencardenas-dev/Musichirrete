import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

public final class n91 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
  public final Preference b;
  
  public n91(Preference paramPreference) {
    this.b = paramPreference;
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    Preference preference = this.b;
    CharSequence charSequence = preference.g();
    if (preference.D && !TextUtils.isEmpty(charSequence)) {
      paramContextMenu.setHeaderTitle(charSequence);
      paramContextMenu.add(0, 0, 0, 2131886408).setOnMenuItemClickListener(this);
    } 
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    Preference preference = this.b;
    Context context = preference.b;
    ClipboardManager clipboardManager = (ClipboardManager)context.getSystemService("clipboard");
    CharSequence charSequence = preference.g();
    clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequence));
    Toast.makeText(context, context.getString(2131887112, new Object[] { charSequence }), 0).show();
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */