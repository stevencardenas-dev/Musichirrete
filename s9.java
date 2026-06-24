import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;

public final class s9 extends ms0 implements SeekBar.OnSeekBarChangeListener, DialogInterface.OnDismissListener, DialogInterface.OnCancelListener, CompoundButton.OnCheckedChangeListener {
  public final AppCompatSeekBar B0;
  
  public final TextView C0;
  
  public final TextView D0;
  
  public final TextView E0;
  
  public final TextView F0;
  
  public final CheckBox G0;
  
  public SettingsActivity H0;
  
  public final int I0;
  
  public s9(SettingsActivity paramSettingsActivity) {
    super((Context)paramSettingsActivity);
    this.H0 = paramSettingsActivity;
    q(2131887197);
    e(2131492950, true);
    AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar)this.u.findViewById(2131297436);
    this.B0 = appCompatSeekBar;
    this.C0 = (TextView)this.u.findViewById(2131297776);
    this.D0 = (TextView)this.u.findViewById(2131297777);
    this.E0 = (TextView)this.u.findViewById(2131297778);
    this.F0 = (TextView)this.u.findViewById(2131297779);
    CheckBox checkBox = (CheckBox)this.u.findViewById(2131296552);
    this.G0 = checkBox;
    int i = MyApplication.o().getInt("B_R_AFL", 3);
    appCompatSeekBar.setProgress(i);
    this.I0 = i;
    checkBox.setChecked(MyApplication.o().getBoolean("B_RAF_RACE", true));
    s();
    appCompatSeekBar.setOnSeekBarChangeListener(this);
    checkBox.setOnCheckedChangeListener(this);
    i = (int)(MyApplication.p * 40.0F);
    View view = this.u;
    String str = ag0.a;
    appCompatSeekBar.post(new sf0(view, i, i, i, i));
    this.W = this;
    this.X = this;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    r();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    if (paramCompoundButton == this.G0)
      MyApplication.o().edit().putBoolean("B_RAF_RACE", paramBoolean).apply(); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    r();
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      MyApplication.o().edit().putInt("B_R_AFL", paramInt).apply();
      s();
    } 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void r() {
    if (this.H0 == null)
      return; 
    if (MyApplication.o().getInt("B_R_AFL", 3) != this.I0) {
      MusicService musicService = MusicService.P0;
      if (musicService != null)
        try {
          if (MusicService.F0 && musicService.v != null) {
            musicService.d();
            if (!musicService.j) {
              musicService.X(new Integer[] { Integer.valueOf(1) });
              Handler handler = musicService.v;
              r9 r9 = new r9();
              this(musicService, 0);
              handler.postDelayed(r9, 500L);
            } 
          } 
        } finally {
          musicService = null;
        }  
    } 
    this.H0 = null;
  }
  
  public final void s() {
    StringBuilder stringBuilder2;
    int[] arrayOfInt = m92.h;
    int i = MyApplication.o().getInt("B_R_AFL", 3);
    this.B0.setProgress(i);
    StringBuilder stringBuilder1 = new StringBuilder("<b>");
    Context context = this.b;
    stringBuilder1.append(context.getString(2131886733, new Object[] { Integer.valueOf(i) }));
    stringBuilder1.append("</b>");
    String str = stringBuilder1.toString();
    CheckBox checkBox = this.G0;
    TextView textView2 = this.F0;
    TextView textView4 = this.E0;
    TextView textView3 = this.D0;
    TextView textView1 = this.C0;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4) {
              checkBox.setVisibility(0);
              textView3.setTextColor(arrayOfInt[5]);
              textView4.setTextColor(arrayOfInt[5]);
              textView2.setTextColor(arrayOfInt[5]);
              textView3.setPaintFlags(textView1.getPaintFlags());
              textView4.setPaintFlags(textView1.getPaintFlags());
              textView2.setPaintFlags(textView1.getPaintFlags());
              textView3.setText((CharSequence)Html.fromHtml(context.getString(2131886727).replace('•', '✓')));
              textView4.setText((CharSequence)Html.fromHtml(context.getString(2131886728).replace('•', '✓')));
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append(this.H0.getString(2131886730));
              stringBuilder2.append(" ");
              stringBuilder2.append(this.H0.getString(2131886731));
              textView2.setText((CharSequence)Html.fromHtml(stringBuilder2.toString().replace('•', '✓')));
            } 
          } else {
            checkBox.setVisibility(0);
            textView3.setTextColor(arrayOfInt[5]);
            textView4.setTextColor(arrayOfInt[5]);
            textView2.setTextColor(arrayOfInt[6]);
            textView3.setPaintFlags(textView1.getPaintFlags());
            textView4.setPaintFlags(textView1.getPaintFlags());
            textView2.setPaintFlags(textView1.getPaintFlags());
            textView3.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886727).replace('•', '✓')));
            textView4.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886728).replace('•', '✓')));
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.H0.getString(2131886729));
            stringBuilder2.append(" ");
            stringBuilder2.append(this.H0.getString(2131886731));
            textView2.setText((CharSequence)Html.fromHtml(stringBuilder2.toString().replace('•', '✓')));
          } 
        } else {
          checkBox.setVisibility(0);
          textView3.setTextColor(arrayOfInt[5]);
          textView4.setTextColor(arrayOfInt[5]);
          textView2.setTextColor(stringBuilder2.getResources().getColor(2131100764));
          textView3.setPaintFlags(textView1.getPaintFlags());
          textView4.setPaintFlags(textView1.getPaintFlags());
          textView2.setPaintFlags(textView1.getPaintFlags() | 0x10);
          textView3.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886727).replace('•', '✓')));
          textView4.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886728).replace('•', '✓')));
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append(this.H0.getString(2131886732));
          stringBuilder2.append(" ");
          stringBuilder2.append(this.H0.getString(2131886731));
          textView2.setText((CharSequence)Html.fromHtml(stringBuilder2.toString()));
        } 
      } else {
        StringBuilder stringBuilder = ga1.l(str, "&nbsp&nbsp<small>⚠️ <i>(");
        stringBuilder.append(stringBuilder2.getString(2131887012));
        stringBuilder.append(")</i></small>");
        str = stringBuilder.toString();
        checkBox.setVisibility(0);
        textView3.setTextColor(arrayOfInt[5]);
        textView4.setTextColor(stringBuilder2.getResources().getColor(2131100764));
        textView2.setTextColor(stringBuilder2.getResources().getColor(2131100764));
        textView3.setPaintFlags(textView1.getPaintFlags());
        textView4.setPaintFlags(textView1.getPaintFlags() | 0x10);
        textView2.setPaintFlags(textView1.getPaintFlags() | 0x10);
        textView3.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886727).replace('•', '✓')));
        textView4.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886728)));
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.H0.getString(2131886732));
        stringBuilder2.append(" ");
        stringBuilder2.append(this.H0.getString(2131886731));
        textView2.setText((CharSequence)Html.fromHtml(stringBuilder2.toString()));
      } 
    } else {
      StringBuilder stringBuilder = ga1.l(str, "&nbsp&nbsp<small>⚠️ <i>(");
      stringBuilder.append(stringBuilder2.getString(2131887012));
      stringBuilder.append(")</i></small>");
      str = stringBuilder.toString();
      checkBox.setVisibility(8);
      textView3.setTextColor(stringBuilder2.getResources().getColor(2131100764));
      textView4.setTextColor(stringBuilder2.getResources().getColor(2131100764));
      textView2.setTextColor(stringBuilder2.getResources().getColor(2131100764));
      textView3.setPaintFlags(textView1.getPaintFlags() | 0x10);
      textView4.setPaintFlags(textView1.getPaintFlags() | 0x10);
      textView2.setPaintFlags(textView1.getPaintFlags() | 0x10);
      textView3.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886727)));
      textView4.setText((CharSequence)Html.fromHtml(stringBuilder2.getString(2131886728)));
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(this.H0.getString(2131886732));
      stringBuilder2.append(" ");
      stringBuilder2.append(this.H0.getString(2131886731));
      textView2.setText((CharSequence)Html.fromHtml(stringBuilder2.toString()));
    } 
    textView1.setText((CharSequence)Html.fromHtml(str));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */