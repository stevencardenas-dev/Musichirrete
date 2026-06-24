import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.LockScreenActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class cm0 implements View.OnClickListener {
  public View b;
  
  public TextView c;
  
  public RecyclerView e;
  
  public ArrayList f;
  
  public int g;
  
  public LayoutInflater h;
  
  public a3 i;
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297719) {
      this.e.k0(this.g);
      return;
    } 
    if (i == 2131297743) {
      MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("jump_queue").addFlags(335544320).putExtra("jump_key", "jump_queue").putExtra("smooth", false));
      LockScreenActivity lockScreenActivity = LockScreenActivity.a1;
      if (lockScreenActivity != null)
        lockScreenActivity.u0(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */