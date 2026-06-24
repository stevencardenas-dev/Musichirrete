import android.view.View;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;
import in.krosbits.audio_cutter.TrimActivity;

public final class sx1 implements dd {
  public final int b;
  
  public final Object c;
  
  public final void C(View paramView) {
    Slider slider2;
    RangeSlider rangeSlider;
    w60 w60;
    int i = this.b;
    boolean bool = false;
    Object object = this.c;
    switch (i) {
      default:
        slider2 = (Slider)paramView;
        ((d50)object).G0();
        return;
      case 1:
        rangeSlider = (RangeSlider)slider2;
        object = object;
        w60 = ((TrimActivity)object).a0;
        if (w60 != null) {
          if (w60.A() < ((Number)rangeSlider.getValues().get(1)).floatValue() - 300.0F)
            bool = true; 
          ((TrimActivity)object).g0 = bool;
          if (!bool)
            object.q0(); 
        } 
        return;
      case 0:
        break;
    } 
    Slider slider1 = (Slider)rangeSlider;
    object = object;
    ((TrimActivity)object).e0 = false;
    if (((TrimActivity)object).a0 != null && ((TrimActivity)object).b0) {
      object.u0((int)slider1.getValue());
      object.s0();
    } 
  }
  
  public final void g(View paramView) {
    Slider slider2;
    RangeSlider rangeSlider;
    switch (this.b) {
      default:
        slider2 = (Slider)paramView;
        return;
      case 1:
        rangeSlider = (RangeSlider)slider2;
        return;
      case 0:
        break;
    } 
    Slider slider1 = (Slider)rangeSlider;
    ((TrimActivity)this.c).e0 = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */