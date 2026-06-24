import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.musicolet.MyApplication;
import java.util.HashSet;

public class pq0 extends he1 implements View.OnLongClickListener, View.OnClickListener {
  public final TextView w;
  
  public final LyricsView x;
  
  public pq0(LyricsView paramLyricsView, TextView paramTextView) {
    super((View)paramTextView);
    this.w = paramTextView;
    int j = paramLyricsView.getContext().getSharedPreferences("PP", 0).getInt("I_FS_LYCS_DP", 16);
    int i = j;
    if (paramLyricsView.Q0)
      i = j - 4; 
    j = i;
    if (i < 12)
      j = 12; 
    paramTextView.setTextSize(2, j);
    sd1 sd1 = new sd1(-1, -2);
    sd1.width = -1;
    paramTextView.setLayoutParams((ViewGroup.LayoutParams)sd1);
    i = (int)paramLyricsView.getResources().getDimension(2131165391);
    String str = MyApplication.o().getString("k_s_lrcff", "d_serif");
    if ("d_serif".equals(str)) {
      paramTextView.setTypeface(Typeface.SERIF);
    } else if ("d_sans".equals(str)) {
      paramTextView.setTypeface(Typeface.DEFAULT);
    } 
    j = i / 2;
    paramTextView.setPadding(i, j, i, j);
    i = MyApplication.o().getInt("k_i_lrctaln", 0);
    if (i == -1) {
      paramTextView.setGravity(3);
    } else if (i == 1) {
      paramTextView.setGravity(5);
    } else {
      paramTextView.setGravity(17);
    } 
    s();
    paramTextView.setOnClickListener(this);
    paramTextView.setOnLongClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    LyricsView lyricsView = this.x;
    if (lyricsView.S0) {
      onLongClick(paramView);
      return;
    } 
    xp0 xp0 = lyricsView.N0;
    if (xp0.d && lyricsView.Y0 == 2) {
      if (i >= 0)
        try {
        
        } finally {
          xp0 = null;
        }  
      return;
    } 
    lyricsView.O0.l();
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    LyricsView lyricsView = this.x;
    rq0 rq0 = lyricsView.O0;
    HashSet<Integer> hashSet = lyricsView.T0;
    if (rq0 != null && rq0.a() && !(this instanceof oq0) && !lyricsView.N0.f) {
      if (lyricsView.S0) {
        if (hashSet.contains(Integer.valueOf(i))) {
          hashSet.remove(Integer.valueOf(i));
        } else {
          hashSet.add(Integer.valueOf(i));
        } 
        if (lyricsView.U0 && hashSet.isEmpty()) {
          lyricsView.setSelectionModeOn(false);
        } else {
          lyricsView.P0.h(i);
        } 
        lyricsView.O0.t();
        return true;
      } 
      hashSet.clear();
      hashSet.add(Integer.valueOf(i));
      lyricsView.setSelectionModeOn(true);
      lyricsView.U0 = true;
    } 
    return true;
  }
  
  public void s() {
    int i = this.x.a1;
    this.w.setTextColor(i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */