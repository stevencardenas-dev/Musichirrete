import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class y3 {
  public final int A;
  
  public final int B;
  
  public final int C;
  
  public final int D;
  
  public final boolean E;
  
  public final w3 F;
  
  public final i1 G = new i1(1, this);
  
  public final Context a;
  
  public final z3 b;
  
  public final Window c;
  
  public CharSequence d;
  
  public CharSequence e;
  
  public AlertController.RecycleListView f;
  
  public View g;
  
  public boolean h = false;
  
  public Button i;
  
  public CharSequence j;
  
  public Message k;
  
  public Button l;
  
  public CharSequence m;
  
  public Message n;
  
  public Button o;
  
  public CharSequence p;
  
  public Message q;
  
  public NestedScrollView r;
  
  public Drawable s;
  
  public ImageView t;
  
  public TextView u;
  
  public TextView v;
  
  public View w;
  
  public ListAdapter x;
  
  public int y = -1;
  
  public final int z;
  
  public y3(Context paramContext, z3 paramz3, Window paramWindow) {
    this.a = paramContext;
    this.b = paramz3;
    this.c = paramWindow;
    w3 w31 = new w3();
    w31.b = new WeakReference<z3>(paramz3);
    this.F = w31;
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, nc1.e, 2130968622, 0);
    this.z = typedArray.getResourceId(0, 0);
    typedArray.getResourceId(2, 0);
    this.A = typedArray.getResourceId(4, 0);
    this.B = typedArray.getResourceId(5, 0);
    this.C = typedArray.getResourceId(7, 0);
    this.D = typedArray.getResourceId(3, 0);
    this.E = typedArray.getBoolean(6, true);
    typedArray.getDimensionPixelSize(1, 0);
    typedArray.recycle();
    paramz3.d().i(1);
  }
  
  public static boolean a(View paramView) {
    if (paramView.onCheckIsTextEditor())
      return true; 
    if (!(paramView instanceof ViewGroup))
      return false; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    while (i > 0) {
      int j = i - 1;
      i = j;
      if (a(viewGroup.getChildAt(j)))
        return true; 
    } 
    return false;
  }
  
  public static ViewGroup b(View paramView1, View paramView2) {
    if (paramView1 == null) {
      paramView1 = paramView2;
      if (paramView2 instanceof ViewStub)
        paramView1 = ((ViewStub)paramView2).inflate(); 
      return (ViewGroup)paramView1;
    } 
    if (paramView2 != null) {
      ViewParent viewParent = paramView2.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(paramView2); 
    } 
    paramView2 = paramView1;
    if (paramView1 instanceof ViewStub)
      paramView2 = ((ViewStub)paramView1).inflate(); 
    return (ViewGroup)paramView2;
  }
  
  public final void c(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener) {
    if (paramOnClickListener != null) {
      Message message = this.F.obtainMessage(paramInt, paramOnClickListener);
    } else {
      paramOnClickListener = null;
    } 
    if (paramInt != -3) {
      if (paramInt != -2) {
        if (paramInt == -1) {
          this.j = paramCharSequence;
          this.k = (Message)paramOnClickListener;
          return;
        } 
        l0.l("Button does not exist");
        return;
      } 
      this.m = paramCharSequence;
      this.n = (Message)paramOnClickListener;
      return;
    } 
    this.p = paramCharSequence;
    this.q = (Message)paramOnClickListener;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */