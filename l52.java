import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.WidgetPrefActivity;

public final class l52 extends BaseAdapter {
  public final km0 b;
  
  public final WidgetPrefActivity c;
  
  public l52(WidgetPrefActivity paramWidgetPrefActivity, km0 paramkm0) {}
  
  public final int getCount() {
    return 4;
  }
  
  public final Object getItem(int paramInt) {
    return null;
  }
  
  public final long getItemId(int paramInt) {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt) {
    return (paramInt == 1) ? 1 : 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    String str;
    LayoutInflater layoutInflater = LayoutInflater.from(paramViewGroup.getContext());
    WidgetPrefActivity widgetPrefActivity = this.c;
    if (paramInt == 1) {
      ViewGroup viewGroup1 = (ViewGroup)layoutInflater.inflate(2131493202, paramViewGroup, false);
      TextView textView6 = (TextView)viewGroup1.findViewById(2131297890);
      textView2 = (TextView)viewGroup1.findViewById(2131297692);
      TextView textView5 = (TextView)viewGroup1.findViewById(2131297740);
      if (widgetPrefActivity.M0.b) {
        ImageView imageView = (ImageView)viewGroup1.findViewById(2131296879);
        imageView.setColorFilter(widgetPrefActivity.M0.e);
        imageView.setImageAlpha(widgetPrefActivity.M0.f);
        textView6.setTextColor(widgetPrefActivity.M0.c);
        textView2.setTextColor(widgetPrefActivity.M0.c);
        textView5.setTextColor(widgetPrefActivity.M0.c);
      } 
      km0 km01 = this.b;
      if (km01 != null) {
        str = km01.c.b;
      } else {
        str = widgetPrefActivity.getString(2131887508);
      } 
      textView6.setText(str);
      if (km01 != null) {
        str = km01.c.e;
      } else {
        str = widgetPrefActivity.getString(2131886205);
      } 
      textView2.setText(str);
      if (km01 != null) {
        paramInt = km01.c.g;
      } else {
        paramInt = 0;
      } 
      textView5.setText(ag0.B(paramInt, false, 0));
      return (View)viewGroup1;
    } 
    ViewGroup viewGroup = (ViewGroup)str.inflate(2131493201, (ViewGroup)textView2, false);
    TextView textView2 = (TextView)viewGroup.findViewById(2131297872);
    TextView textView1 = (TextView)viewGroup.findViewById(2131297890);
    TextView textView3 = (TextView)viewGroup.findViewById(2131297692);
    TextView textView4 = (TextView)viewGroup.findViewById(2131297740);
    j52 j52 = widgetPrefActivity.M0;
    if (j52.b) {
      textView2.setTextColor(j52.c);
      textView1.setTextColor(widgetPrefActivity.M0.c);
      textView3.setTextColor(widgetPrefActivity.M0.c);
      textView4.setTextColor(widgetPrefActivity.M0.c);
      textView2.setText(String.valueOf(paramInt + 1));
    } 
    textView2.setText(String.valueOf(paramInt + 1));
    textView1.setText(widgetPrefActivity.getString(2131887508));
    textView3.setText(widgetPrefActivity.getString(2131886205));
    textView4.setText(ag0.B(0L, false, 0));
    return (View)viewGroup;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */