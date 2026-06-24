import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public final class ub1 extends ms0 implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener, AdapterView.OnItemClickListener, DialogInterface.OnShowListener, TextWatcher {
  public EditText B0;
  
  public final ArrayList C0;
  
  public ArrayList D0 = new ArrayList();
  
  public LinearLayout E0;
  
  public ListView F0;
  
  public final int G0;
  
  public sb1 H0;
  
  public final LayoutInflater I0;
  
  public j61 J0;
  
  public vn0 K0;
  
  public Handler L0 = new Handler(Looper.getMainLooper());
  
  public ss0 M0;
  
  public ub1(Context paramContext, String paramString, ArrayList paramArrayList, int paramInt, sb1 paramsb1, CharSequence paramCharSequence) {
    super(paramContext);
    this.G0 = paramInt;
    this.C0 = paramArrayList;
    this.H0 = paramsb1;
    this.I0 = LayoutInflater.from(paramContext);
    paramInt = (int)(this.b.getResources().getDimension(2131165390) * 16.0F);
    LinearLayout linearLayout = new LinearLayout(this.b);
    this.E0 = linearLayout;
    linearLayout.setPadding(paramInt, 0, paramInt, 0);
    this.E0.setOrientation(1);
    this.F0 = new ListView(this.b);
    vn0 vn01 = new vn0(this, paramInt);
    this.K0 = vn01;
    this.F0.setAdapter((ListAdapter)vn01);
    this.F0.setOnItemClickListener(this);
    EditText editText2 = new EditText(paramContext);
    this.B0 = editText2;
    editText2.setHint(paramString);
    this.B0.addTextChangedListener(this);
    this.B0.setSingleLine(true);
    this.B0.setInputType(1);
    EditText editText1 = this.B0;
    editText1.setImeOptions(editText1.getImeOptions() | 0x10000000);
    Drawable drawable = paramContext.getResources().getDrawable(2131231387);
    int i = (int)(paramContext.getResources().getDimension(2131165390) * 20.0F);
    drawable.setBounds(0, 0, i, i);
    ag0.C0(m92.h[7], drawable);
    this.B0.setCompoundDrawables(drawable, null, null, null);
    this.B0.setCompoundDrawablePadding(paramInt);
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.E0.addView((View)this.B0, (ViewGroup.LayoutParams)layoutParams);
    layoutParams = new LinearLayout.LayoutParams(-1, -2);
    layoutParams.weight = 1.0F;
    this.E0.addView((View)this.F0, (ViewGroup.LayoutParams)layoutParams);
    f((View)this.E0, false);
    this.Y = this;
    this.W = this;
    this.X = this;
    this.h0 = paramCharSequence;
  }
  
  public final void afterTextChanged(Editable paramEditable) {
    pb1 pb1 = new pb1(this, paramEditable.toString());
    try {
      j61 j611 = this.J0;
      if (j611 != null && j611.c) {
        i61 i61 = j611.b;
        if (i61 != null)
          i61.b = true; 
        return;
      } 
      j611 = new j61();
      this(pb1);
      this.J0 = j611;
      ExecutorService executorService = j61.d;
      return;
    } finally {
      pb1 = null;
      pb1.printStackTrace();
    } 
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    r();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss(); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    r();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss(); 
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    sb1 sb11 = this.H0;
    xj1 xj1 = this.D0.get(paramInt);
    sb11.u(this.G0, xj1);
    this.H0 = null;
    r();
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    if (this.M0 != null) {
      this.B0.requestFocus();
      this.L0.postDelayed(new ob1(this, 0), 150L);
    } 
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final ss0 p() {
    ss0 ss01 = super.p();
    this.M0 = ss01;
    return ss01;
  }
  
  public final void r() {
    View view = this.u;
    if (view != null) {
      view.removeCallbacks(null);
      this.u = null;
    } 
    EditText editText = this.B0;
    if (editText != null) {
      editText.removeCallbacks(null);
      this.B0.setCursorVisible(false);
      this.B0.removeTextChangedListener(this);
    } 
    ListView listView2 = this.F0;
    if (listView2 != null)
      listView2.removeCallbacks(null); 
    j61 j611 = this.J0;
    if (j611 != null) {
      j611.a.clear();
      this.J0 = null;
    } 
    ListView listView1 = this.F0;
    if (listView1 != null) {
      listView1.setAdapter(null);
      this.F0.setOnItemClickListener(null);
    } 
    ss0 ss01 = this.M0;
    if (ss01 != null) {
      ag0.a0(this.b, ss01.getWindow());
      ss01 = this.M0;
      ss01.c = null;
      ss01.setOnDismissListener(null);
      this.M0.setOnCancelListener(null);
      if (this.M0.isShowing())
        this.M0.dismiss(); 
    } 
    Handler handler = this.L0;
    if (handler != null)
      handler.removeCallbacksAndMessages(null); 
    this.L0 = null;
    this.J0 = null;
    this.F0 = null;
    this.E0 = null;
    this.K0 = null;
    this.M0 = null;
    this.B0 = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ub1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */