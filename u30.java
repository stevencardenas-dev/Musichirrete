import android.text.Editable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class u30 implements KeyListener {
  public final KeyListener a;
  
  public u30(KeyListener paramKeyListener) {
    this.a = paramKeyListener;
  }
  
  public final void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt) {
    this.a.clearMetaKeyState(paramView, paramEditable, paramInt);
  }
  
  public final int getInputType() {
    return this.a.getInputType();
  }
  
  public final boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    if (paramInt != 67) {
      if (paramInt != 112) {
        bool = false;
      } else {
        bool = zo2.j(paramEditable, paramKeyEvent, true);
      } 
    } else {
      bool = zo2.j(paramEditable, paramKeyEvent, false);
    } 
    if (bool) {
      MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)paramEditable);
      return true;
    } 
    return this.a.onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent) {
    return this.a.onKeyOther(paramView, paramEditable, paramKeyEvent);
  }
  
  public final boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent) {
    return this.a.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */