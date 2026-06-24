import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public final class hu1 {
  public static xr a(View paramView, xr paramxr) {
    if (Log.isLoggable("ReceiveContent", 3)) {
      StringBuilder stringBuilder = new StringBuilder("onReceive: ");
      stringBuilder.append(paramxr);
      Log.d("ReceiveContent", stringBuilder.toString());
    } 
    wr wr = paramxr.a;
    if (wr.e() == 2)
      return paramxr; 
    ClipData clipData = wr.b();
    int j = wr.a();
    TextView textView = (TextView)paramView;
    Editable editable = (Editable)textView.getText();
    Context context = textView.getContext();
    byte b = 0;
    for (int i = 0; b < clipData.getItemCount(); i = k) {
      CharSequence charSequence;
      ClipData.Item item = clipData.getItemAt(b);
      if ((j & 0x1) != 0) {
        CharSequence charSequence1 = item.coerceToText(context);
        charSequence = charSequence1;
        if (charSequence1 instanceof android.text.Spanned)
          charSequence = charSequence1.toString(); 
      } else {
        charSequence = charSequence.coerceToStyledText(context);
      } 
      int k = i;
      if (charSequence != null)
        if (!i) {
          int m = Selection.getSelectionStart((CharSequence)editable);
          k = Selection.getSelectionEnd((CharSequence)editable);
          i = Math.max(0, Math.min(m, k));
          k = Math.max(0, Math.max(m, k));
          Selection.setSelection((Spannable)editable, k);
          editable.replace(i, k, charSequence);
          k = 1;
        } else {
          editable.insert(Selection.getSelectionEnd((CharSequence)editable), "\n");
          editable.insert(Selection.getSelectionEnd((CharSequence)editable), charSequence);
          k = i;
        }  
      b++;
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */