import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;

public final class vw extends id1 {
  public final ss0 d;
  
  public final int e;
  
  public final re0 f;
  
  public ss0 g;
  
  public vw(ss0 paramss0, int paramInt) {
    this.d = paramss0;
    this.e = paramInt;
    this.f = paramss0.e.j;
  }
  
  public final int c() {
    ArrayList arrayList = this.d.e.p;
    return (arrayList != null) ? arrayList.size() : 0;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    CheckBox checkBox;
    paramhe1 = paramhe1;
    View view = paramhe1.b;
    CompoundButton compoundButton = ((uw)paramhe1).w;
    TextView textView = ((uw)paramhe1).x;
    ss0 ss01 = this.d;
    ms0 ms0 = ss01.e;
    Integer[] arrayOfInteger = ms0.O;
    if (arrayOfInteger != null && arrayOfInteger.length != 0) {
      int j = arrayOfInteger.length;
      for (byte b = 0; b < j; b++) {
        if (arrayOfInteger[b].equals(Integer.valueOf(paramInt))) {
          b = 1;
          // Byte code: goto -> 95
        } 
      } 
    } 
    boolean bool = false;
    int i = x41.y(ss01.t);
    if (i != 1) {
      if (i == 2) {
        checkBox = (CheckBox)compoundButton;
        boolean bool1 = ss01.u.contains(Integer.valueOf(paramInt));
        z51.K(checkBox, ms0.v);
        checkBox.setChecked(bool1);
        checkBox.setEnabled(bool ^ true);
      } 
    } else {
      boolean bool1;
      RadioButton radioButton = (RadioButton)checkBox;
      if (ms0.M == paramInt) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      int j = ms0.v;
      if (dd1.O(dd1.j0(radioButton.getContext(), 16842806, 0))) {
        i = -16777216;
      } else {
        i = -1;
      } 
      i = dd1.b(i, 0.3F);
      int[] arrayOfInt3 = { 16842910, -16842912 };
      int[] arrayOfInt1 = { 16842910, 16842912 };
      int[] arrayOfInt2 = { -16842910, -16842912 };
      int[] arrayOfInt4 = { -16842910, 16842912 };
      int k = dd1.j0(radioButton.getContext(), 2130968901, 0);
      radioButton.setButtonTintList(new ColorStateList(new int[][] { arrayOfInt3, arrayOfInt1, arrayOfInt2, arrayOfInt4 }, new int[] { k, j, i, i }));
      radioButton.setChecked(bool1);
      radioButton.setEnabled(bool ^ true);
    } 
    textView.setText(ms0.p.get(paramInt));
    textView.setTextColor(ms0.c0);
    ss0.n(textView, ms0.Q);
    ViewGroup viewGroup = (ViewGroup)view;
    LinearLayout linearLayout = (LinearLayout)viewGroup;
    re0 re01 = this.f;
    linearLayout.setGravity(re01.a() | 0x10);
    if (viewGroup.getChildCount() == 2) {
      CompoundButton compoundButton1;
      if (re01 == re0.e && ss01.e.b.getResources().getConfiguration().getLayoutDirection() != 1 && viewGroup.getChildAt(0) instanceof CompoundButton) {
        compoundButton1 = (CompoundButton)viewGroup.getChildAt(0);
        viewGroup.removeView((View)compoundButton1);
        TextView textView1 = (TextView)viewGroup.getChildAt(0);
        viewGroup.removeView((View)textView1);
        textView1.setPadding(textView1.getPaddingRight(), textView1.getPaddingTop(), textView1.getPaddingLeft(), textView1.getPaddingBottom());
        viewGroup.addView((View)textView1);
        viewGroup.addView((View)compoundButton1);
      } else if (re01 == re0.b && ((ss0)compoundButton1).e.b.getResources().getConfiguration().getLayoutDirection() == 1 && viewGroup.getChildAt(1) instanceof CompoundButton) {
        CompoundButton compoundButton2 = (CompoundButton)viewGroup.getChildAt(1);
        viewGroup.removeView((View)compoundButton2);
        TextView textView1 = (TextView)viewGroup.getChildAt(0);
        viewGroup.removeView((View)textView1);
        textView1.setPadding(textView1.getPaddingRight(), textView1.getPaddingTop(), textView1.getPaddingRight(), textView1.getPaddingBottom());
        viewGroup.addView((View)compoundButton2);
        viewGroup.addView((View)textView1);
      } 
    } 
    if (viewGroup.getChildCount() == 2) {
      if (viewGroup.getChildAt(0) instanceof CompoundButton) {
        viewGroup.getChildAt(0).setBackground(null);
        return;
      } 
      if (viewGroup.getChildAt(1) instanceof CompoundButton)
        viewGroup.getChildAt(1).setBackground(null); 
    } 
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    View view = LayoutInflater.from(paramViewGroup.getContext()).inflate(this.e, paramViewGroup, false);
    ss0 ss01 = this.d;
    ms0 ms0 = ss01.e;
    ms0.getClass();
    Drawable drawable = dd1.k0(ms0.b, 2130969629);
    if (drawable == null)
      drawable = dd1.k0(ss01.getContext(), 2130969629); 
    view.setBackground(drawable);
    return new uw(view, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */