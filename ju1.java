import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.afollestad.materialdialogs.color.CircleView;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.slider.RangeSlider;
import in.krosbits.musicolet.MyApplication;
import java.util.Locale;

public final class ju1 extends ms0 implements rs0, View.OnClickListener, ym {
  public RadioGroup B0;
  
  public boolean C0;
  
  public CheckBox D0;
  
  public CircleView E0;
  
  public RangeSlider F0;
  
  public TextView G0;
  
  public TextView H0;
  
  public MaterialButtonToggleGroup I0;
  
  public ViewGroup J0;
  
  public int K0;
  
  public int L0;
  
  public int[] M0;
  
  public int N0;
  
  public int O0;
  
  public final void F(int paramInt) {
    try {
      this.N0 = paramInt;
      paramInt = this.M0[paramInt];
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.b && this.C0)
      (new Handler(Looper.getMainLooper())).postDelayed(new xt0(22, this), 150L); 
  }
  
  public final void onClick(View paramView) {
    if (paramView.getId() == 2131296948) {
      xm xm = new xm(this.b, this);
      xm.c = this.N0;
      xm.j = true;
      xm.h = false;
      xm.i = false;
      xm.f = this.M0;
      xm.e = 2131886278;
      xm.a();
    } 
  }
  
  public final void r() {
    TextView textView;
    ViewGroup viewGroup = this.J0;
    RangeSlider rangeSlider = this.F0;
    this.K0 = MyApplication.o().getInt("k_i_dstt", 360);
    int i = MyApplication.o().getInt("k_i_dedt", 1079);
    this.L0 = i;
    int j = this.K0;
    if (j % 30 != 0) {
      this.K0 = j / 30 * 30;
      this.C0 = true;
    } 
    if (this.K0 > 1410) {
      this.K0 = 1410;
      this.C0 = true;
    } 
    if ((i + 1) % 30 != 0) {
      i = i / 30 * 30 + 30;
      this.L0 = i;
      if (i > 1440)
        this.L0 = 1440; 
      this.L0--;
      this.C0 = true;
    } 
    i = this.L0;
    j = this.K0;
    if (i - j < 29) {
      this.L0 = j + 29;
      this.C0 = true;
    } 
    if (this.L0 >= 1440) {
      this.L0 = 1439;
      this.C0 = true;
    } 
    this.O0 = MyApplication.o().getInt("k_i_dtfnt", 2);
    i = this.B0.getCheckedRadioButtonId();
    if (i == 2131297355 || i == 2131297330) {
      StringBuilder stringBuilder;
      viewGroup.setVisibility(0);
      textView = this.G0;
      if (i == 2131297355) {
        textView.setVisibility(8);
        rangeSlider.setVisibility(8);
        textView = this.H0;
        stringBuilder = new StringBuilder("<b>");
        stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131886613));
        stringBuilder.append("</b>");
        textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      } else {
        textView.setVisibility(0);
        stringBuilder.setVisibility(0);
        stringBuilder.setValues(new Float[] { Float.valueOf(this.K0), Float.valueOf((this.L0 + 1)) });
        s();
      } 
      i = this.O0;
      MaterialButtonToggleGroup materialButtonToggleGroup = this.I0;
      if (i == 1) {
        materialButtonToggleGroup.g(2131297594, true);
        return;
      } 
      materialButtonToggleGroup.g(2131297593, true);
      return;
    } 
    textView.setVisibility(8);
  }
  
  public final void s() {
    StringBuilder stringBuilder1;
    TextView textView1 = this.H0;
    TextView textView2 = this.G0;
    StringBuilder stringBuilder3 = new StringBuilder("<b>");
    stringBuilder3.append(MyApplication.i.getApplicationContext().getString(2131886439));
    stringBuilder3.append(":</b> ");
    Locale locale = Locale.US;
    int m = this.K0 / 60;
    int j = this.K0;
    int i = this.L0 / 60;
    int k = this.L0;
    String str = jHxlGgUTadw.BSAnHt;
    stringBuilder3.append(String.format(locale, str, new Object[] { Integer.valueOf(m), Integer.valueOf(j % 60), Integer.valueOf(i), Integer.valueOf(k % 60) }));
    textView2.setText((CharSequence)Html.fromHtml(stringBuilder3.toString()));
    k = this.K0;
    j = 1439;
    if (k == 0 && this.L0 == 1439) {
      stringBuilder1 = new StringBuilder("<b>");
      stringBuilder1.append(MyApplication.i.getApplicationContext().getString(2131886988));
      stringBuilder1.append(":</b> ");
      stringBuilder1.append(MyApplication.i.getApplicationContext().getString(2131886979));
      stringBuilder1.append("<br/><br/><b>");
      stringBuilder1.append(MyApplication.i.getApplicationContext().getString(2131886615));
      stringBuilder1.append("</b>");
      textView1.setText((CharSequence)Html.fromHtml(stringBuilder1.toString()));
      return;
    } 
    i = this.L0;
    if (i < 1439) {
      i++;
    } else {
      i = 0;
    } 
    if (k > 0)
      j = k - 1; 
    StringBuilder stringBuilder2 = new StringBuilder("<b>");
    stringBuilder2.append(MyApplication.i.getApplicationContext().getString(2131886988));
    stringBuilder2.append(":</b> ");
    stringBuilder2.append(String.format(locale, (String)stringBuilder1, new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60), Integer.valueOf(j / 60), Integer.valueOf(j % 60) }));
    stringBuilder2.append("<br/><br/><b>");
    stringBuilder2.append(MyApplication.i.getApplicationContext().getString(2131886615));
    stringBuilder2.append("</b>");
    textView1.setText((CharSequence)Html.fromHtml(stringBuilder2.toString()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ju1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */