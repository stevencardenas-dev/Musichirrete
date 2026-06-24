import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class i50 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
  public int b;
  
  public final SmartImageView c;
  
  public final SmartImageView e;
  
  public final SmartTextView f;
  
  public final SwitchCompat g;
  
  public final ImageView h;
  
  public final EqualizerActivity2 i;
  
  public i50(EqualizerActivity2 paramEqualizerActivity2, View paramView) {
    this.i = paramEqualizerActivity2;
    this.c = (SmartImageView)paramView.findViewById(2131296913);
    this.e = (SmartImageView)paramView.findViewById(2131296850);
    this.f = (SmartTextView)paramView.findViewById(2131297890);
    SwitchCompat switchCompat = (SwitchCompat)paramView.findViewById(2131297560);
    this.g = switchCompat;
    ImageView imageView = (ImageView)paramView.findViewById(2131296843);
    this.h = imageView;
    switchCompat.setOnCheckedChangeListener(this);
    imageView.setOnClickListener(this);
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    int i = ((dl0)EqualizerActivity2.l0().get(this.b)).c;
    if (j50.r(i) != paramBoolean) {
      String str = ga1.i("IEQON_", i);
      MyApplication.o().edit().putBoolean(str, paramBoolean).apply();
      MusicService musicService = MusicService.P0;
      if (musicService != null)
        musicService.R(i, paramBoolean); 
      ArrayList arrayList = EqualizerActivity2.l0();
      EqualizerActivity2 equalizerActivity2 = this.i;
      if (i == ((dl0)arrayList.get(equalizerActivity2.S.getSelectedItemPosition())).c) {
        equalizerActivity2.Z.E0();
        equalizerActivity2.a0.E0();
        e50 e50 = equalizerActivity2.b0;
        if (e50 != null)
          e50.E0(); 
        equalizerActivity2.X.notifyDataSetChanged();
      } 
    } 
  }
  
  public final void onClick(View paramView) {
    int j = this.b;
    dl0 dl0 = EqualizerActivity2.l0().get(j);
    int i = dl0.c;
    ms0 ms0 = new ms0((Context)this.i);
    ms0.d(dl0.b);
    ms0.l(2131886278);
    ms0.n(2131887160);
    ms0.A = new g50(i, j);
    ms0.p();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */