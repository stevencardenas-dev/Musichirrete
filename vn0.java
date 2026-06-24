import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.android.widgets.SmartTextView;
import java.util.ArrayList;

public final class vn0 extends BaseAdapter {
  public final int b;
  
  public int c;
  
  public final AdapterView.OnItemClickListener e;
  
  public vn0(ub1 paramub1, int paramInt) {}
  
  public vn0(wn0 paramwn0) {
    this.c = -1;
    a();
  }
  
  public void a() {
    rw0 rw0 = ((wn0)this.e).e;
    uw0 uw0 = rw0.v;
    if (uw0 != null) {
      rw0.i();
      ArrayList<uw0> arrayList = rw0.j;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        if ((uw0)arrayList.get(b) == uw0) {
          this.c = b;
          return;
        } 
      } 
    } 
    this.c = -1;
  }
  
  public uw0 b(int paramInt) {
    wn0 wn0 = (wn0)this.e;
    rw0 rw0 = wn0.e;
    rw0.i();
    ArrayList<uw0> arrayList = rw0.j;
    wn0.getClass();
    int j = this.c;
    int i = paramInt;
    if (j >= 0) {
      i = paramInt;
      if (paramInt >= j)
        i = paramInt + 1; 
    } 
    return arrayList.get(i);
  }
  
  public final int getCount() {
    ArrayList arrayList;
    int i = this.b;
    AdapterView.OnItemClickListener onItemClickListener = this.e;
    switch (i) {
      default:
        arrayList = ((ub1)onItemClickListener).D0;
        if (arrayList != null) {
          i = arrayList.size();
        } else {
          i = 0;
        } 
        return i;
      case 0:
        break;
    } 
    wn0 wn0 = (wn0)arrayList;
    rw0 rw0 = wn0.e;
    rw0.i();
    i = rw0.j.size();
    wn0.getClass();
    if (this.c >= 0)
      i--; 
    return i;
  }
  
  public final Object getItem(int paramInt) {
    ArrayList<ArrayList> arrayList;
    switch (this.b) {
      default:
        arrayList = ((ub1)this.e).D0;
        if (arrayList != null) {
          arrayList = arrayList.get(paramInt);
        } else {
          arrayList = null;
        } 
        return arrayList;
      case 0:
        break;
    } 
    return b(paramInt);
  }
  
  public final long getItemId(int paramInt) {
    switch (this.b) {
      default:
        return 0L;
      case 0:
        break;
    } 
    return paramInt;
  }
  
  public int getItemViewType(int paramInt) {
    switch (this.b) {
      default:
        return super.getItemViewType(paramInt);
      case 1:
        break;
    } 
    xj1 xj1 = ((ub1)this.e).D0.get(paramInt);
    if (xj1 instanceof q3) {
      if (((q3)xj1).i > 0)
        return 2; 
    } else if (xj1 instanceof km0) {
      return 1;
    } 
    return 3;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    xj1 xj11;
    TextView textView;
    View view2;
    View view1;
    LayoutInflater layoutInflater;
    int i = this.b;
    AdapterView.OnItemClickListener onItemClickListener = this.e;
    switch (i) {
      default:
        onItemClickListener = onItemClickListener;
        layoutInflater = ((ub1)onItemClickListener).I0;
        i = getItemViewType(paramInt);
        view2 = paramView;
        if (paramView == null) {
          xj1 xj13;
          Object object;
          int j = this.c;
          if (i == 2) {
            paramView = layoutInflater.inflate(2131493025, paramViewGroup, false);
            textView = (TextView)paramView.findViewById(2131297688);
            ImageView imageView = (ImageView)paramView.findViewById(2131296913);
            textView.setTextSize(1, 14.0F);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            j *= 2;
            layoutParams.height = j;
            layoutParams.width = j;
            imageView.setLayoutParams(layoutParams);
            object = new Object();
            ((qb1)object).a = textView;
            ((qb1)object).b = imageView;
            paramView.setTag(object);
          } else if (i == 1) {
            paramView = object.inflate(2131493029, (ViewGroup)textView, false);
            ImageView imageView1 = (ImageView)paramView.findViewById(2131296913);
            textView = (TextView)paramView.findViewById(2131297890);
            TextView textView2 = (TextView)paramView.findViewById(2131297685);
            object = paramView.findViewById(2131297692);
            TextView textView1 = (TextView)paramView.findViewById(2131297740);
            ImageView imageView2 = (ImageView)paramView.findViewById(2131296876);
            textView.setTextSize(1, 14.0F);
            textView2.setTextSize(1, 11.0F);
            object.setTextSize(1, 11.0F);
            textView1.setTextSize(1, 11.0F);
            ViewGroup.LayoutParams layoutParams = imageView1.getLayoutParams();
            j *= 3;
            layoutParams.height = j;
            layoutParams.width = j;
            imageView1.setLayoutParams(layoutParams);
            layoutParams = imageView2.getLayoutParams();
            layoutParams.height = 0;
            layoutParams.width = 0;
            imageView2.setLayoutParams(layoutParams);
            Object object1 = new Object();
            ((tb1)object1).a = textView;
            ((tb1)object1).b = textView2;
            ((tb1)object1).c = (TextView)object;
            ((tb1)object1).d = textView1;
            ((tb1)object1).e = imageView1;
            paramView.setTag(object1);
          } else {
            view2 = object.inflate(2131493027, (ViewGroup)textView, false);
            SmartTextView smartTextView = (SmartTextView)view2.findViewById(2131297688);
            view2.setTag(smartTextView);
            smartTextView.setTextSize(1, 14.0F);
            xj13 = ((ub1)onItemClickListener).D0.get(paramInt);
          } 
          xj1 xj14 = xj13;
        } 
        xj11 = ((ub1)onItemClickListener).D0.get(paramInt);
      case 0:
        break;
    } 
    xj1 xj12 = xj11;
    if (xj11 == null)
      view1 = ((wn0)onItemClickListener).c.inflate(2131492880, (ViewGroup)textView, false); 
    ((ix0)view1).initialize(b(paramInt), 0);
    return view1;
  }
  
  public int getViewTypeCount() {
    switch (this.b) {
      default:
        return super.getViewTypeCount();
      case 1:
        break;
    } 
    return 5;
  }
  
  public void notifyDataSetChanged() {
    switch (this.b) {
      default:
        super.notifyDataSetChanged();
        return;
      case 0:
        break;
    } 
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */