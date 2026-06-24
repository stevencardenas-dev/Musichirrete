import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

public class z3 extends w6 implements DialogInterface {
  public final y3 i = new y3(getContext(), this, getWindow());
  
  public z3(ContextThemeWrapper paramContextThemeWrapper, int paramInt) {
    super((Context)paramContextThemeWrapper, f((Context)paramContextThemeWrapper, paramInt));
  }
  
  public static int f(Context paramContext, int paramInt) {
    if ((paramInt >>> 24 & 0xFF) >= 1)
      return paramInt; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130968623, typedValue, true);
    return typedValue.resourceId;
  }
  
  public void onCreate(Bundle paramBundle) {
    byte b1;
    boolean bool;
    super.onCreate(paramBundle);
    y3 y31 = this.i;
    int i = y31.z;
    y31.b.setContentView(i);
    Context context = y31.a;
    Window window = y31.c;
    View view1 = window.findViewById(2131297291);
    View view4 = view1.findViewById(2131297661);
    View view2 = view1.findViewById(2131296598);
    View view3 = view1.findViewById(2131296483);
    ViewGroup viewGroup3 = (ViewGroup)view1.findViewById(2131296622);
    view1 = y31.g;
    if (view1 == null)
      view1 = null; 
    byte b2 = 0;
    if (view1 != null) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i == 0 || !y3.a(view1))
      window.setFlags(131072, 131072); 
    if (i != 0) {
      FrameLayout frameLayout = (FrameLayout)window.findViewById(2131296621);
      frameLayout.addView(view1, new ViewGroup.LayoutParams(-1, -1));
      if (y31.h)
        frameLayout.setPadding(0, 0, 0, 0); 
      if (y31.f != null)
        ((dn0)viewGroup3.getLayoutParams()).weight = 0.0F; 
    } else {
      viewGroup3.setVisibility(8);
    } 
    view1 = viewGroup3.findViewById(2131297661);
    View view6 = viewGroup3.findViewById(2131296598);
    View view5 = viewGroup3.findViewById(2131296483);
    ViewGroup viewGroup1 = y3.b(view1, view4);
    ViewGroup viewGroup2 = y3.b(view6, view2);
    ViewGroup viewGroup4 = y3.b(view5, view3);
    NestedScrollView nestedScrollView = (NestedScrollView)window.findViewById(2131297449);
    y31.r = nestedScrollView;
    nestedScrollView.setFocusable(false);
    y31.r.setNestedScrollingEnabled(false);
    TextView textView = (TextView)viewGroup2.findViewById(16908299);
    y31.v = textView;
    if (textView != null) {
      CharSequence charSequence = y31.e;
      if (charSequence != null) {
        textView.setText(charSequence);
      } else {
        textView.setVisibility(8);
        y31.r.removeView((View)y31.v);
        if (y31.f != null) {
          ViewGroup viewGroup = (ViewGroup)y31.r.getParent();
          i = viewGroup.indexOfChild((View)y31.r);
          viewGroup.removeViewAt(i);
          viewGroup.addView((View)y31.f, i, new ViewGroup.LayoutParams(-1, -1));
        } else {
          viewGroup2.setVisibility(8);
        } 
      } 
    } 
    Button button2 = (Button)viewGroup4.findViewById(16908313);
    y31.i = button2;
    i1 i1 = y31.G;
    button2.setOnClickListener(i1);
    boolean bool1 = TextUtils.isEmpty(y31.j);
    button2 = y31.i;
    if (bool1) {
      button2.setVisibility(8);
      i = 0;
    } else {
      button2.setText(y31.j);
      y31.i.setVisibility(0);
      i = 1;
    } 
    button2 = (Button)viewGroup4.findViewById(16908314);
    y31.l = button2;
    button2.setOnClickListener(i1);
    bool1 = TextUtils.isEmpty(y31.m);
    button2 = y31.l;
    if (bool1) {
      button2.setVisibility(8);
    } else {
      button2.setText(y31.m);
      y31.l.setVisibility(0);
      i |= 0x2;
    } 
    button2 = (Button)viewGroup4.findViewById(16908315);
    y31.o = button2;
    button2.setOnClickListener(i1);
    bool1 = TextUtils.isEmpty(y31.p);
    Button button1 = y31.o;
    if (bool1) {
      button1.setVisibility(8);
    } else {
      button1.setText(y31.p);
      y31.o.setVisibility(0);
      i |= 0x4;
    } 
    TypedValue typedValue = new TypedValue();
    context.getTheme().resolveAttribute(2130968621, typedValue, true);
    if (typedValue.data != 0)
      if (i == 1) {
        Button button = y31.i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5F;
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      } else if (i == 2) {
        Button button = y31.l;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5F;
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      } else if (i == 4) {
        Button button = y31.o;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5F;
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      }  
    if (i == 0)
      viewGroup4.setVisibility(8); 
    if (y31.w != null) {
      ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
      viewGroup1.addView(y31.w, 0, layoutParams);
      window.findViewById(2131297652).setVisibility(8);
    } else {
      y31.t = (ImageView)window.findViewById(16908294);
      if (!TextUtils.isEmpty(y31.d) && y31.E) {
        TextView textView1 = (TextView)window.findViewById(2131296344);
        y31.u = textView1;
        textView1.setText(y31.d);
        Drawable drawable = y31.s;
        if (drawable != null) {
          y31.t.setImageDrawable(drawable);
        } else {
          y31.u.setPadding(y31.t.getPaddingLeft(), y31.t.getPaddingTop(), y31.t.getPaddingRight(), y31.t.getPaddingBottom());
          y31.t.setVisibility(8);
        } 
      } else {
        window.findViewById(2131297652).setVisibility(8);
        y31.t.setVisibility(8);
        viewGroup1.setVisibility(8);
      } 
    } 
    if (viewGroup3.getVisibility() != 8) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (viewGroup1 != null && viewGroup1.getVisibility() != 8) {
      i = 1;
    } else {
      i = 0;
    } 
    if (viewGroup4.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool) {
      View view = viewGroup2.findViewById(2131297615);
      if (view != null)
        view.setVisibility(0); 
    } 
    if (i != 0) {
      NestedScrollView nestedScrollView1 = y31.r;
      if (nestedScrollView1 != null)
        nestedScrollView1.setClipToPadding(true); 
      if (y31.e != null || y31.f != null) {
        View view = viewGroup1.findViewById(2131297651);
      } else {
        viewGroup1 = null;
      } 
      if (viewGroup1 != null)
        viewGroup1.setVisibility(0); 
    } else {
      View view = viewGroup2.findViewById(2131297616);
      if (view != null)
        view.setVisibility(0); 
    } 
    AlertController.RecycleListView recycleListView1 = y31.f;
    if (recycleListView1 != null && (!bool || i == 0)) {
      int j;
      int k;
      int m = recycleListView1.getPaddingLeft();
      if (i != 0) {
        j = recycleListView1.getPaddingTop();
      } else {
        j = recycleListView1.b;
      } 
      int n = recycleListView1.getPaddingRight();
      if (bool) {
        k = recycleListView1.getPaddingBottom();
      } else {
        k = recycleListView1.c;
      } 
      recycleListView1.setPadding(m, j, n, k);
    } 
    if (!b1) {
      NestedScrollView nestedScrollView1;
      recycleListView1 = y31.f;
      if (recycleListView1 == null)
        nestedScrollView1 = y31.r; 
      if (nestedScrollView1 != null) {
        b1 = b2;
        if (bool)
          b1 = 2; 
        View view7 = window.findViewById(2131297448);
        View view8 = window.findViewById(2131297447);
        WeakHashMap weakHashMap = v22.a;
        nestedScrollView1.setScrollIndicators(i | b1, 3);
        if (view7 != null)
          viewGroup2.removeView(view7); 
        if (view8 != null)
          viewGroup2.removeView(view8); 
      } 
    } 
    AlertController.RecycleListView recycleListView2 = y31.f;
    if (recycleListView2 != null) {
      ListAdapter listAdapter = y31.x;
      if (listAdapter != null) {
        recycleListView2.setAdapter(listAdapter);
        i = y31.y;
        if (i > -1) {
          recycleListView2.setItemChecked(i, true);
          recycleListView2.setSelection(i);
        } 
      } 
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    NestedScrollView nestedScrollView = this.i.r;
    return (nestedScrollView != null && nestedScrollView.i(paramKeyEvent)) ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    NestedScrollView nestedScrollView = this.i.r;
    return (nestedScrollView != null && nestedScrollView.i(paramKeyEvent)) ? true : super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    y3 y31 = this.i;
    y31.d = paramCharSequence;
    TextView textView = y31.u;
    if (textView != null)
      textView.setText(paramCharSequence); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */