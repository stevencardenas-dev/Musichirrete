import android.util.Log;
import android.view.View;
import android.widget.TextView;

public final class ot implements View.OnClickListener {
  public final int b;
  
  public final pt c;
  
  public final void onClick(View paramView) {
    int i = this.b;
    pt pt1 = this.c;
    switch (i) {
      default:
        pt1.b.dismiss();
        return;
      case 0:
        break;
    } 
    String str = pt1.a;
    try {
      i = Integer.parseInt(pt1.c.getText().toString());
      if (i > pt1.e) {
        StringBuilder stringBuilder = new StringBuilder();
        this("wrong input( > than required): ");
        stringBuilder.append(pt1.c.getText().toString());
        Log.e(str, stringBuilder.toString());
        pt1.c.setText("");
        pt1.c.setHint("Wrong Input!");
      } else if (i < pt1.d) {
        StringBuilder stringBuilder = new StringBuilder();
        this("wrong input( < then required): ");
        stringBuilder.append(pt1.c.getText().toString());
        Log.e(str, stringBuilder.toString());
        pt1.c.setText("");
        pt1.c.setHint("Wrong Input!");
      } else {
        bh0 bh0 = pt1.f;
        if (bh0 != null) {
          q91 q91 = (q91)bh0.c;
          q91.a(i);
          q91.l.setOnSeekBarChangeListener(null);
          q91.l.setProgress(q91.g - q91.e);
          q91.l.setOnSeekBarChangeListener(q91);
          TextView textView = q91.k;
          String[] arrayOfString = q91.w;
          i = q91.g;
          if (arrayOfString != null && i >= 0 && i < arrayOfString.length) {
            str = arrayOfString[i];
          } else {
            str = String.valueOf(i);
          } 
          textView.setText(str);
          pt1.b.dismiss();
        } 
      } 
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder("worng input(non-integer): ");
      stringBuilder.append(pt1.c.getText().toString());
      Log.e(str, stringBuilder.toString());
      pt1.c.setText("");
      pt1.c.setHint("Wrong Input!");
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */