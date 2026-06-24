import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;
import in.krosbits.musicolet.MyApplication;

public final class v50 extends ms0 {
  public final int B0;
  
  public final SharedPreferences C0;
  
  public final EditText D0;
  
  public final EditText E0;
  
  public v50(pc parampc) {
    super((Context)parampc);
    SharedPreferences sharedPreferences = parampc.getSharedPreferences("PP", 0);
    this.C0 = sharedPreferences;
    e(2131492954, true);
    EditText editText1 = (EditText)this.u.findViewById(2131296700);
    this.D0 = editText1;
    EditText editText2 = (EditText)this.u.findViewById(2131296699);
    this.E0 = editText2;
    int i = jm1.a;
    if (MyApplication.F.p()) {
      i = 5;
    } else {
      i = 0;
    } 
    i = sharedPreferences.getInt("I_E_D_SEC_SCN", i);
    this.B0 = i;
    if (i > 0) {
      editText2.setText(String.valueOf(i / 60));
      editText1.setText(String.valueOf(i % 60));
    } 
    n(2131887265);
    k(2131886278);
    editText2.addTextChangedListener(new u50(this, 0));
    editText1.addTextChangedListener(new u50(this, 1));
    this.A = new f(11, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */