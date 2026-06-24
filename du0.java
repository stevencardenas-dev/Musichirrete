import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.IOException;
import java.util.ArrayList;

public final class du0 extends ArrayAdapter implements AdapterView.OnItemClickListener {
  public final LayoutInflater b;
  
  public final Drawable c;
  
  public final Drawable e;
  
  public final Drawable f;
  
  public final Drawable g;
  
  public du0(Context paramContext, ArrayList paramArrayList) {
    super(paramContext, 0, paramArrayList);
    this.b = LayoutInflater.from(paramContext);
    TypedArray typedArray = getContext().obtainStyledAttributes(new int[] { 2130969647, 2130969656, 2130969653, 2130969652 });
    this.c = ws2.I(paramContext, typedArray.getResourceId(0, 0));
    this.e = ws2.I(paramContext, typedArray.getResourceId(1, 0));
    this.f = ws2.I(paramContext, typedArray.getResourceId(2, 0));
    this.g = ws2.I(paramContext, typedArray.getResourceId(3, 0));
    typedArray.recycle();
  }
  
  public final boolean areAllItemsEnabled() {
    return false;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    Drawable drawable;
    View view = paramView;
    if (paramView == null)
      view = this.b.inflate(2131493122, paramViewGroup, false); 
    hv0 hv0 = (hv0)getItem(paramInt);
    TextView textView1 = (TextView)view.findViewById(2131297181);
    TextView textView2 = (TextView)view.findViewById(2131297179);
    textView1.setText(hv0.d);
    String str = hv0.e;
    paramInt = hv0.i;
    if ((paramInt == 2 || paramInt == 1) && !TextUtils.isEmpty(str)) {
      textView1.setGravity(80);
      textView2.setVisibility(0);
      textView2.setText(str);
    } else {
      textView1.setGravity(16);
      textView2.setVisibility(8);
      textView2.setText("");
    } 
    view.setEnabled(hv0.g);
    ImageView imageView = (ImageView)view.findViewById(2131297180);
    if (imageView != null) {
      Uri uri = hv0.f;
      if (uri != null)
        try {
          drawable = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
          if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return view;
          } 
        } catch (IOException iOException) {
          StringBuilder stringBuilder = new StringBuilder("Failed to load ");
          stringBuilder.append(uri);
          String str1 = stringBuilder.toString();
          Log.w(LHyji.bQpbOGs, str1, iOException);
        }  
      paramInt = hv0.n;
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (hv0.e()) {
            drawable = this.g;
          } else {
            drawable = this.c;
          } 
        } else {
          drawable = this.f;
        } 
      } else {
        drawable = this.e;
      } 
    } else {
      return view;
    } 
    imageView.setImageDrawable(drawable);
    return view;
  }
  
  public final boolean isEnabled(int paramInt) {
    return ((hv0)getItem(paramInt)).g;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    hv0 hv0 = (hv0)getItem(paramInt);
    ImageView imageView = (ImageView)paramView.findViewById(2131297180);
    ProgressBar progressBar = (ProgressBar)paramView.findViewById(2131297182);
    if (imageView != null && progressBar != null) {
      imageView.setVisibility(8);
      progressBar.setVisibility(0);
    } 
    hv0.l(true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\du0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */