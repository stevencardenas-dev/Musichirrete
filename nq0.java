import android.view.View;
import android.widget.TextView;
import in.krosbits.android.widgets.LyricsView;

public final class nq0 extends pq0 {
  public final int y;
  
  public final LyricsView z;
  
  public nq0(LyricsView paramLyricsView, TextView paramTextView, int paramInt) {
    super(paramLyricsView, paramTextView);
    s();
  }
  
  public final void s() {
    View view;
    int i = this.y;
    LyricsView lyricsView = this.z;
    TextView textView = this.w;
    switch (i) {
      default:
        textView.setTextColor(lyricsView.c1);
        if (lyricsView.Y0 != 0) {
          view = this.b;
          view.setClickable(true);
          view.setBackgroundDrawable(m92.z(view.getContext(), 2130969899));
        } 
        return;
      case 0:
        break;
    } 
    textView.setTypeface(textView.getTypeface(), 1);
    textView.setBackgroundColor(((LyricsView)view).b1);
    textView.setTextColor(((LyricsView)view).a1);
    int j = (int)view.getResources().getDimension(2131165391);
    i = j / 2;
    textView.setPadding(j, i, j, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */