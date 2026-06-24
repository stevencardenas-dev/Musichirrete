import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.afollestad.materialdialogs.color.CircleView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.SearchActivity;

public final class zm extends BaseAdapter {
  public final int b;
  
  public final Object c;
  
  public final int getCount() {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        return ((SearchActivity)object).V.size();
      case 1:
        return EqualizerActivity2.l0().size();
      case 0:
        break;
    } 
    object = object;
    if (object.N0()) {
      i = (((an)object).r0[object.R0()]).length;
    } else {
      i = ((an)object).q0.length;
    } 
    return i;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    switch (this.b) {
      default:
        return super.getDropDownView(paramInt, paramView, paramViewGroup);
      case 1:
        break;
    } 
    paramView = super.getDropDownView(paramInt, paramView, paramViewGroup);
    i50 i50 = (i50)paramView.getTag();
    i50.e.setVisibility(8);
    SmartTextView smartTextView = i50.f;
    smartTextView.setSingleLine(false);
    smartTextView.setSelected(false);
    return paramView;
  }
  
  public final Object getItem(int paramInt) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        return ((SearchActivity)object).V.get(getCount() - 1 - paramInt);
      case 1:
        return EqualizerActivity2.l0().get(paramInt);
      case 0:
        break;
    } 
    object = object;
    if (object.N0()) {
      object = Integer.valueOf(((an)object).r0[object.R0()][paramInt]);
    } else {
      object = Integer.valueOf(((an)object).q0[paramInt]);
    } 
    return object;
  }
  
  public final long getItemId(int paramInt) {
    switch (this.b) {
      default:
        return 0L;
      case 1:
        return ((dl0)EqualizerActivity2.l0().get(paramInt)).c;
      case 0:
        break;
    } 
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    TextView textView;
    SwitchCompat switchCompat1;
    Drawable drawable;
    dl0 dl0;
    CircleView circleView2;
    int j;
    EqualizerActivity2 equalizerActivity2;
    ImageView imageView;
    i50 i50;
    SmartImageView smartImageView;
    SmartTextView smartTextView;
    int i = this.b;
    boolean bool1 = true;
    boolean bool2 = true;
    Object object = this.c;
    switch (i) {
      default:
        object = object;
        i = getCount();
        if (paramView != null) {
          textView = (TextView)paramView;
        } else {
          textView = (TextView)((SearchActivity)object).W.inflate(17367043, paramViewGroup, false);
          drawable = object.getResources().getDrawable(2131231184).mutate();
          ag0.C0(m92.h[6], drawable);
          float f = object.getResources().getDimension(2131165390);
          int k = (int)(24.0F * f);
          drawable.setBounds(0, 0, k, k);
          textView.setCompoundDrawables(drawable, null, null, null);
          textView.setCompoundDrawablePadding((int)(16.0F * f));
          k = (int)(f * 8.0F);
          textView.setPadding(k, k, k, k);
          textView.setGravity(16);
        } 
        textView.setText(((SearchActivity)object).V.get(i - paramInt - 1));
        return (View)textView;
      case 1:
        equalizerActivity2 = (EqualizerActivity2)object;
        object = textView;
        if (textView == null) {
          object = LayoutInflater.from((Context)equalizerActivity2).inflate(2131493052, (ViewGroup)drawable, false);
          object.setTag(new i50(equalizerActivity2, (View)object));
        } 
        i50 = (i50)object.getTag();
        i50.b = paramInt;
        imageView = i50.h;
        smartImageView = i50.c;
        switchCompat1 = i50.g;
        smartTextView = i50.f;
        dl0 = EqualizerActivity2.l0().get(paramInt);
        paramInt = dl0.a;
        i = dl0.c;
        smartImageView.setImageResource(paramInt);
        smartTextView.setText((CharSequence)Html.fromHtml(dl0.b));
        j = MusicService.D0;
        paramInt = 8;
        if (i == j) {
          smartImageView.setColorTintIndex(3);
          smartTextView.setTextTintIndex(3);
          imageView.setVisibility(8);
          switchCompat1.setThumbTintList(equalizerActivity2.j0);
          switchCompat1.setTrackTintList(equalizerActivity2.k0);
        } else {
          smartImageView.setColorTintIndex(6);
          smartTextView.setTextTintIndex(6);
          if (i >= 40000)
            paramInt = 0; 
          imageView.setVisibility(paramInt);
          switchCompat1.setThumbTintList(equalizerActivity2.l0);
          switchCompat1.setTrackTintList(equalizerActivity2.m0);
        } 
        i50.e.setVisibility(0);
        switchCompat1.setChecked(j50.r(i));
        smartTextView.setSingleLine(true);
        smartTextView.setSelected(true);
        return (View)object;
      case 0:
        break;
    } 
    object = object;
    SwitchCompat switchCompat2 = switchCompat1;
    if (switchCompat1 == null) {
      circleView2 = new CircleView(object.P());
      i = ((an)object).s0;
      circleView2.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(i, i));
    } 
    CircleView circleView1 = circleView2;
    if (object.N0()) {
      i = ((an)object).r0[object.R0()][paramInt];
    } else {
      i = ((an)object).q0[paramInt];
    } 
    circleView1.setBackgroundColor(i);
    if (object.N0()) {
      if (object.O0() == paramInt) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
      circleView1.setSelected(bool1);
    } else {
      if (object.R0() != paramInt)
        bool1 = false; 
      circleView1.setSelected(bool1);
    } 
    circleView1.setTag(String.format("%d:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    circleView1.setOnClickListener((View.OnClickListener)object);
    circleView1.setOnLongClickListener((View.OnLongClickListener)object);
    return (View)circleView2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */