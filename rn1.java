import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class rn1 extends id1 implements cj0 {
  public ArrayList d;
  
  public ArrayList e;
  
  public final LayoutInflater f;
  
  public final bj0 g;
  
  public int h;
  
  public boolean i;
  
  public rn1(Context paramContext, ArrayList paramArrayList, int paramInt, bj0 parambj0) {
    this.d = paramArrayList;
    this.h = paramInt;
    this.g = parambj0;
    this.f = LayoutInflater.from(paramContext);
  }
  
  public final void a(int paramInt) {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void b(int paramInt) {
    try {
      if (my0.d())
        this.i = true; 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final int c() {
    ArrayList arrayList = this.d;
    return (arrayList == null) ? 0 : arrayList.size();
  }
  
  public final void d(int paramInt) {
    try {
      if (my0.d()) {
        this.i = true;
        return;
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final int f(int paramInt) {
    try {
      return i + bool;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    ImageView imageView;
    ag1 ag1;
    km0 km0 = this.d.get(paramInt);
    Uri uri = p3.l(km0);
    int i = this.h;
    if (i == 0) {
      paramhe1 = paramhe1;
      TextView textView = ((yn1)paramhe1).y;
      String str = ag0.W(km0);
      qn1 qn1 = km0.c;
      textView.setText(str);
      ((yn1)paramhe1).w.setText(qn1.c);
      ((yn1)paramhe1).x.setText(qn1.e);
      ((yn1)paramhe1).z.setText(ag0.B(qn1.g, false, 0));
      ag1 = MyApplication.v.f(uri);
      ag1.d = true;
      ag1.a();
      ag1.c = true;
      ag1.k();
      ag1.f(((yn1)paramhe1).A);
      imageView = ((yn1)paramhe1).B;
    } else {
      ImageView imageView1;
      if (i == 2) {
        r3 r3 = (r3)imageView;
        TextView textView = r3.x;
        String str = ag0.W(km0);
        qn1 qn1 = km0.c;
        textView.setText(str);
        r3.w.setText(qn1.e);
        r3.y.setText(ag0.B(qn1.g, false, 0));
        ag1 = MyApplication.v.f((Uri)ag1);
        ag1.d = true;
        ag1.a();
        ag1.c = true;
        ag1.k();
        ag1.f(r3.z);
        imageView1 = r3.A;
      } else if (i == 4) {
        r3 r3 = (r3)imageView1;
        TextView textView = r3.x;
        String str = ag0.W(km0);
        qn1 qn1 = km0.c;
        textView.setText(str);
        r3.w.setText(qn1.c);
        r3.y.setText(ag0.B(qn1.g, false, 0));
        ag1 = MyApplication.v.f((Uri)ag1);
        ag1.d = true;
        ag1.a();
        ag1.c = true;
        ag1.k();
        ag1.f(r3.z);
        imageView = r3.A;
      } else if (i == 6) {
        vb vb = (vb)imageView;
        TextView textView = vb.y;
        String str = ag0.W(km0);
        qn1 qn1 = km0.c;
        textView.setText(str);
        vb.w.setText(qn1.c);
        vb.x.setText(qn1.e);
        vb.z.setText(ag0.B(qn1.g, false, 0));
        vb.A.setText(String.valueOf(this.e.get(paramInt)));
        ag1 = MyApplication.v.f((Uri)ag1);
        ag1.d = true;
        ag1.a();
        ag1.c = true;
        ag1.k();
        ag1.f(vb.B);
        ImageView imageView2 = vb.C;
      } else {
        imageView = null;
      } 
    } 
    if (my0.d()) {
      imageView.setVisibility(0);
      if (my0.e(km0.b)) {
        imageView.setImageResource(2131230845);
        return;
      } 
      imageView.setImageResource(2131230844);
      return;
    } 
    imageView.setVisibility(8);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    ImageView imageView;
    he1 he11;
    he1 he12;
    View view2;
    int i = paramInt % 2;
    int j = paramInt - i;
    LayoutInflater layoutInflater = this.f;
    boolean bool2 = true;
    boolean bool1 = true;
    paramInt = 1;
    if (j == 2 || j == 4) {
      View view = layoutInflater.inflate(2131493022, paramViewGroup, false);
      if (i == 1) {
        paramInt = bool1;
      } else {
        paramInt = 0;
      } 
      he12 = new he1(view);
      ((r3)he12).x = (TextView)view.findViewById(2131297890);
      ((r3)he12).w = (TextView)view.findViewById(2131297688);
      imageView = (ImageView)view.findViewById(2131296876);
      ((r3)he12).y = (TextView)view.findViewById(2131297740);
      ((r3)he12).z = (ImageView)view.findViewById(2131296913);
      ((r3)he12).A = (ImageView)view.findViewById(2131296842);
      ((r3)he12).B = this;
      view.setOnClickListener((View.OnClickListener)he12);
      view.setOnLongClickListener((View.OnLongClickListener)he12);
      imageView.setOnClickListener((View.OnClickListener)he12);
      if (paramInt != 0)
        view.setBackgroundDrawable(m92.z(view.getContext(), 2130969903)); 
      return he12;
    } 
    if (j == 6) {
      view2 = he12.inflate(2131493030, (ViewGroup)imageView, false);
      if (i != 1)
        paramInt = 0; 
      he11 = new he1(view2);
      ((vb)he11).y = (TextView)view2.findViewById(2131297890);
      ((vb)he11).w = (TextView)view2.findViewById(2131297685);
      ((vb)he11).x = (TextView)view2.findViewById(2131297692);
      ((vb)he11).z = (TextView)view2.findViewById(2131297740);
      ((vb)he11).A = (TextView)view2.findViewById(2131297700);
      ((vb)he11).B = (ImageView)view2.findViewById(2131296913);
      ((vb)he11).C = (ImageView)view2.findViewById(2131296842);
      ImageView imageView1 = (ImageView)view2.findViewById(2131296876);
      ((vb)he11).D = this;
      view2.setOnClickListener((View.OnClickListener)he11);
      imageView1.setOnClickListener((View.OnClickListener)he11);
      view2.setOnLongClickListener((View.OnLongClickListener)he11);
      if (paramInt != 0)
        view2.setBackgroundDrawable(m92.z(view2.getContext(), 2130969903)); 
      return he11;
    } 
    View view1 = view2.inflate(2131493029, (ViewGroup)he11, false);
    if (i != 1)
      bool2 = false; 
    return new yn1(view1, this, bool2);
  }
  
  public final void k(he1 paramhe1) {
    ImageView imageView;
    if (paramhe1 instanceof yn1) {
      imageView = ((yn1)paramhe1).A;
      if (imageView != null) {
        MyApplication.v.a(imageView);
        return;
      } 
    } else if (imageView instanceof r3) {
      imageView = ((r3)imageView).z;
      if (imageView != null) {
        MyApplication.v.a(imageView);
        return;
      } 
    } else if (imageView instanceof vb) {
      imageView = ((vb)imageView).B;
      if (imageView != null)
        MyApplication.v.a(imageView); 
    } 
  }
  
  public final void l() {
    if (!my0.d())
      this.i = false; 
    if (this.i) {
      this.i = false;
      return;
    } 
    g();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */