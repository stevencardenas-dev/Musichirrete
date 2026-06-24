import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class dk1 extends ms0 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, rs0 {
  public final EditText B0;
  
  public final EditText C0;
  
  public final EditText D0;
  
  public final int E0;
  
  public ss0 F0;
  
  public dk1(Context paramContext, int paramInt1, int paramInt2) {
    super(paramContext);
    this.E0 = paramInt2;
    this.Y = this;
    this.W = this;
    q(2131887317);
    n(2131887030);
    k(2131886278);
    this.P = false;
    e(2131492976, false);
    TextInputLayout textInputLayout1 = (TextInputLayout)this.u.findViewById(2131297645);
    TextInputLayout textInputLayout3 = (TextInputLayout)this.u.findViewById(2131297646);
    TextInputLayout textInputLayout2 = (TextInputLayout)this.u.findViewById(2131297648);
    EditText editText3 = (EditText)this.u.findViewById(2131296710);
    this.B0 = editText3;
    EditText editText1 = (EditText)this.u.findViewById(2131296711);
    this.C0 = editText1;
    EditText editText2 = (EditText)this.u.findViewById(2131296712);
    this.D0 = editText2;
    if (paramInt1 < 0)
      paramInt1 = 0; 
    int i = paramInt1;
    if (paramInt1 > paramInt2)
      i = paramInt2; 
    mj1 mj1 = new mj1(1, this);
    paramInt1 = i;
    if (paramInt2 > 3600000) {
      int j = i / 3600000;
      paramInt1 = i % 3600000;
      textInputLayout1.setEnabled(true);
      editText3.setText(String.valueOf(j));
      editText3.setSelectAllOnFocus(true);
      editText3.setImeActionLabel(paramContext.getString(2131886983), 5);
      editText3.setNextFocusForwardId(2131296711);
      editText3.setImeOptions(134217728);
      editText3.requestFocus();
    } 
    i = paramInt1;
    if (paramInt2 > 60000) {
      i = paramInt1 / 60000;
      paramInt1 %= 60000;
      textInputLayout3.setEnabled(true);
      editText1.setText(String.valueOf(i));
      editText1.setSelectAllOnFocus(true);
      editText1.setImeActionLabel(paramContext.getString(2131886983), 5);
      editText1.setImeOptions(134217728);
      editText1.setNextFocusForwardId(2131296712);
      i = paramInt1;
      if (!editText3.isEnabled()) {
        editText1.requestFocus();
        i = paramInt1;
      } 
    } 
    if (paramInt2 > 1000) {
      paramInt1 = i / 1000;
      textInputLayout2.setEnabled(true);
      editText2.setText(String.valueOf(paramInt1));
      editText2.setSelectAllOnFocus(true);
      if (!editText1.isEnabled())
        editText2.requestFocus(); 
      editText2.setImeActionLabel(paramContext.getString(2131887030), 6);
      editText2.setOnEditorActionListener(mj1);
    } 
    editText1.addTextChangedListener(new ck1(this, 0));
    editText2.addTextChangedListener(new ck1(this, 1));
    this.D = this;
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    EditText editText;
    if (paramqy == qy.b) {
      editText = this.B0;
      if (editText.getText().length() > 0) {
        l2 = Integer.parseInt(editText.getText().toString()) * 3600000L;
      } else {
        l2 = 0L;
      } 
      editText = this.C0;
      long l1 = l2;
      if (editText.getText().length() > 0)
        l1 = l2 + Integer.parseInt(editText.getText().toString()) * 60000L; 
      editText = this.D0;
      long l2 = l1;
      if (editText.getText().length() > 0)
        l2 = l1 + Integer.parseInt(editText.getText().toString()) * 1000L; 
      if (l2 <= this.E0)
        MyApplication.i.getApplicationContext().startService((new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_SEEK").putExtra("EXTRA_SEEKMILL", l2)); 
      paramss0.dismiss();
      return;
    } 
    if (editText == qy.e)
      paramss0.dismiss(); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.F0 = null;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.F0 = (ss0)paramDialogInterface;
    xt0 xt0 = new xt0(14, this);
    this.B0.postDelayed(xt0, 150L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */