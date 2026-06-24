import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.SettingsActivity;
import java.util.ArrayList;

public final class ql1 extends lt {
  public final SettingsActivity k;
  
  public ql1(SettingsActivity paramSettingsActivity1, SettingsActivity paramSettingsActivity2, SettingsActivity paramSettingsActivity3) {
    d((Context)paramSettingsActivity2, paramSettingsActivity3, 1);
  }
  
  public final void a(View paramView, Cursor paramCursor) {}
  
  public final View f(ViewGroup paramViewGroup) {
    return null;
  }
  
  public final int getCount() {
    return this.k.W.size();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    SettingsActivity settingsActivity = this.k;
    View view = paramView;
    if (paramView == null) {
      view = settingsActivity.T.inflate(2131493064, paramViewGroup, false);
      Object object = new Object();
      ((pl1)object).a = (TextView)view.findViewById(2131297890);
      ((pl1)object).b = (TextView)view.findViewById(2131297820);
      ((pl1)object).c = (ImageView)view.findViewById(2131296866);
      view.setTag(object);
    } 
    pl1 pl1 = (pl1)view.getTag();
    rl1 rl1 = settingsActivity.W.get(paramInt);
    TextView textView2 = pl1.a;
    TextView textView1 = pl1.b;
    String str = rl1.a;
    ArrayList<String> arrayList = rl1.f;
    textView2.setText(str);
    pl1.c.setImageDrawable(rl1.d);
    if (arrayList == null || arrayList.size() == 0) {
      textView1.setVisibility(8);
      return view;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (paramInt = 0; paramInt < arrayList.size(); paramInt++) {
      stringBuilder.append(arrayList.get(paramInt));
      stringBuilder.append(" › ");
    } 
    textView1.setText(stringBuilder.toString());
    textView1.setVisibility(0);
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ql1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */