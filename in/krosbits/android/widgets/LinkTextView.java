package in.krosbits.android.widgets;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;

public class LinkTextView extends SmartTextView {
  public boolean g = false;
  
  public LinkTextView(Context paramContext) {
    super(paramContext);
  }
  
  public LinkTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public LinkTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.g && paramCharSequence != null) {
      this.g = true;
      setText((CharSequence)Html.fromHtml(paramCharSequence.toString()));
      this.g = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\LinkTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */