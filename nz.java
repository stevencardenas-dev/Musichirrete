import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class nz extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final TextView x;
  
  public final oz y;
  
  public nz(oz paramoz, View paramView, int paramInt) {
    super(paramView);
    ImageView imageView1 = (ImageView)paramView.findViewById(2131296852);
    ImageView imageView4 = (ImageView)paramView.findViewById(2131296891);
    ImageView imageView3 = (ImageView)paramView.findViewById(2131296888);
    ImageView imageView2 = (ImageView)paramView.findViewById(2131296881);
    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton)paramView.findViewById(2131297342);
    this.w = (TextView)paramView.findViewById(2131297841);
    TextView textView = (TextView)paramView.findViewById(2131297840);
    this.x = textView;
    appCompatRadioButton.setSupportButtonTintList(ColorStateList.valueOf(m92.h[5]));
    textView.setSelected(true);
    if (paramInt != 2) {
      if (paramInt != 3) {
        if (paramInt == 4)
          appCompatRadioButton.setChecked(true); 
      } else {
        imageView2.setVisibility(4);
      } 
    } else {
      imageView2.setVisibility(4);
      appCompatRadioButton.setChecked(true);
    } 
    paramView.setOnClickListener(this);
    imageView3.setOnClickListener(this);
    imageView4.setOnClickListener(this);
    appCompatRadioButton.setOnClickListener(this);
    imageView1.setOnTouchListener(new lz(0, this));
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      int j = paramView.getId();
      oz oz1 = this.y;
      if (j == 2131296891) {
        boolean bool = MusicService.C0;
        oz1.h = (MyApplication.h()).b.get(i);
        ms0 ms0 = new ms0(oz1.l);
        ms0.q(2131887177);
        ms0.g(oz1.l.getString(2131886981), oz1.h.h, false, new f(8, oz1));
        ms0.n(2131887175);
        ms0.k(2131886278);
        ms0.p();
        return;
      } 
      if (j == 2131296888) {
        if (i >= 0) {
          boolean bool = MusicService.C0;
          if (i < (MyApplication.h()).b.size()) {
            if (MyApplication.o().getBoolean(VDgS.oYJZ, true)) {
              ms0 ms0 = new ms0(oz1.l);
              ms0.d(((xn1)(MyApplication.h()).b.get(i)).h);
              ms0.q(2131887173);
              ms0.k(2131886989);
              ms0.n(2131887604);
              ms0.A = new mz(i, 0, this);
              ms0.p();
              return;
            } 
            oz.a(oz1, i);
            return;
          } 
        } 
      } else {
        oz1.b.x(i);
        oz1.k.dismiss();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */