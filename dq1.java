import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class dq1 extends id1 {
  public final wp1 d;
  
  public final List e;
  
  public final HashSet f;
  
  public boolean g = true;
  
  public dq1(wp1 paramwp1, ArrayList paramArrayList, HashSet paramHashSet) {
    this.f = paramHashSet;
    this.d = paramwp1;
    this.e = paramArrayList;
  }
  
  public static String l(xp1 paramxp1) {
    return (paramxp1.a && !TextUtils.isEmpty(MyApplication.f)) ? MyApplication.f : paramxp1.c();
  }
  
  public final int c() {
    return this.e.size();
  }
  
  public final int f(int paramInt) {
    return 0;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    Context context;
    long l;
    int[] arrayOfInt = m92.h;
    cq1 cq1 = (cq1)paramhe1;
    xp1 xp1 = this.e.get(paramInt);
    String str4 = l(xp1);
    String str2 = xp1.l;
    TextView textView2 = cq1.A;
    View view1 = cq1.F;
    View view2 = cq1.E;
    ProgressBar progressBar = cq1.D;
    Button button2 = cq1.G;
    Button button1 = cq1.H;
    TextView textView1 = cq1.C;
    ImageView imageView = cq1.z;
    textView2.setText(str4);
    cq1.y.setImageResource(xp1.e());
    paramInt = xp1.j;
    if (paramInt == 0) {
      imageView.setImageResource(2131231111);
      imageView.setColorFilter(MyApplication.i.getApplicationContext().getResources().getColor(2131099828));
      textView1.setBackgroundColor(MyApplication.i.getApplicationContext().getResources().getColor(2131099830));
    } else if (paramInt == -1) {
      imageView.setImageResource(2131231432);
      imageView.setColorFilter(MyApplication.i.getApplicationContext().getResources().getColor(2131099762));
      textView1.setBackgroundColor(MyApplication.i.getApplicationContext().getResources().getColor(2131099764));
    } else if (paramInt == -2) {
      imageView.setImageResource(2131231131);
      imageView.setColorFilter(MyApplication.i.getApplicationContext().getResources().getColor(2131100765));
      textView1.setBackgroundColor(MyApplication.i.getApplicationContext().getResources().getColor(2131100767));
    } 
    if (!this.g) {
      imageView.setVisibility(8);
    } else {
      imageView.setVisibility(0);
    } 
    String str3 = xp1.k;
    if (str3 != null && this.g) {
      textView1.setText(str3);
      textView1.setVisibility(0);
    } else {
      textView1.setVisibility(8);
    } 
    if (xp1.i && this.g) {
      view2.setVisibility(0);
      button1.setVisibility(0);
      view1.setVisibility(0);
      button2.setVisibility(0);
    } else {
      view2.setVisibility(8);
      button1.setVisibility(8);
      view1.setVisibility(8);
      button2.setVisibility(8);
    } 
    if (xp1.a) {
      context = MyApplication.i.getApplicationContext();
      paramInt = 2131887082;
    } else {
      context = MyApplication.i.getApplicationContext();
      paramInt = 2131887159;
    } 
    String str1 = context.getString(paramInt);
    StringBuilder stringBuilder = new StringBuilder(str1);
    try {
      StatFs statFs = new StatFs();
      this(str2);
      l = statFs.getTotalBytes();
    } finally {
      view2 = null;
      view2.printStackTrace();
    } 
    HashSet hashSet = this.f;
    if (hashSet == null || hashSet.contains(xp1.e)) {
      button2.setTextColor(arrayOfInt[3]);
      button1.setTextColor(arrayOfInt[3]);
      return;
    } 
    button2.setTextColor(arrayOfInt[5]);
    button1.setTextColor(arrayOfInt[5]);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    MaterialCardView materialCardView;
    if (paramInt == 1) {
      Context context = paramViewGroup.getContext();
      materialCardView = (MaterialCardView)LayoutInflater.from(context).inflate(2131493051, paramViewGroup, false);
      TextView textView = new TextView(context);
      textView.setText("•••");
      paramInt = (int)(MyApplication.p * 12.0F);
      textView.setPadding(paramInt, paramInt, paramInt, paramInt);
      new FrameLayout.LayoutParams(-1, -2);
      textView.setGravity(17);
      materialCardView.addView((View)textView);
      materialCardView.setOnClickListener(new ql(7, this));
      return new he1((View)materialCardView);
    } 
    View view = LayoutInflater.from(materialCardView.getContext()).inflate(2131493065, (ViewGroup)materialCardView, false);
    he1 he1 = new he1(view);
    ((cq1)he1).w = this.d;
    ViewGroup viewGroup = (ViewGroup)view.findViewById(2131297411);
    ((cq1)he1).x = viewGroup;
    ((cq1)he1).y = (ImageView)view.findViewById(2131296866);
    ((cq1)he1).z = (ImageView)view.findViewById(2131296908);
    ((cq1)he1).A = (TextView)view.findViewById(2131297890);
    ((cq1)he1).B = (TextView)view.findViewById(2131297879);
    ((cq1)he1).C = (TextView)view.findViewById(2131297835);
    ((cq1)he1).D = (ProgressBar)view.findViewById(2131297299);
    ((cq1)he1).E = view.findViewById(2131297922);
    ((cq1)he1).F = view.findViewById(2131297923);
    Button button1 = (Button)view.findViewById(2131296369);
    ((cq1)he1).G = button1;
    Button button2 = (Button)view.findViewById(2131296400);
    ((cq1)he1).H = button2;
    viewGroup.setOnClickListener((View.OnClickListener)he1);
    viewGroup.setOnLongClickListener((View.OnLongClickListener)he1);
    button2.setOnClickListener((View.OnClickListener)he1);
    button1.setOnClickListener((View.OnClickListener)he1);
    return he1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */