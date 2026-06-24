import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.button.MaterialButton;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jj extends w6 implements View.OnClickListener {
  public View A;
  
  public final cj B;
  
  public final boolean C;
  
  public final iv0 i;
  
  public final dj j;
  
  public final Context k;
  
  public final MusicActivity l;
  
  public cv0 m;
  
  public ArrayList n;
  
  public hj o;
  
  public RecyclerView p;
  
  public ViewGroup q;
  
  public MaterialButton r;
  
  public boolean s;
  
  public hv0 t;
  
  public final long u;
  
  public long v;
  
  public TextView w;
  
  public TextView x;
  
  public TextView y;
  
  public TextView z;
  
  public jj(MusicActivity paramMusicActivity) {
    // Byte code:
    //   0: new android/view/ContextThemeWrapper
    //   3: dup
    //   4: aload_1
    //   5: aload_1
    //   6: ldc 2130969066
    //   8: invokestatic E : (Landroid/view/ContextThemeWrapper;I)I
    //   11: invokespecial <init> : (Landroid/content/Context;I)V
    //   14: astore #7
    //   16: aload #7
    //   18: ldc 2130969655
    //   20: invokestatic E : (Landroid/view/ContextThemeWrapper;I)I
    //   23: istore_2
    //   24: ldc 2131952413
    //   26: istore_3
    //   27: aload #7
    //   29: astore #6
    //   31: iload_2
    //   32: ifeq -> 96
    //   35: aload #7
    //   37: invokestatic Q : (Landroid/content/Context;)Z
    //   40: ifeq -> 65
    //   43: aload #7
    //   45: invokestatic y : (Landroid/view/ContextThemeWrapper;)I
    //   48: ldc -570425344
    //   50: if_icmpne -> 59
    //   53: ldc 2131952414
    //   55: istore_2
    //   56: goto -> 84
    //   59: ldc 2131952415
    //   61: istore_2
    //   62: goto -> 84
    //   65: aload #7
    //   67: invokestatic y : (Landroid/view/ContextThemeWrapper;)I
    //   70: ldc -570425344
    //   72: if_icmpne -> 81
    //   75: ldc 2131952416
    //   77: istore_2
    //   78: goto -> 84
    //   81: ldc 2131952413
    //   83: istore_2
    //   84: new android/view/ContextThemeWrapper
    //   87: dup
    //   88: aload #7
    //   90: iload_2
    //   91: invokespecial <init> : (Landroid/content/Context;I)V
    //   94: astore #6
    //   96: aload #6
    //   98: ldc 2130969655
    //   100: invokestatic E : (Landroid/view/ContextThemeWrapper;I)I
    //   103: istore #4
    //   105: iload #4
    //   107: istore_2
    //   108: iload #4
    //   110: ifne -> 158
    //   113: aload #6
    //   115: invokestatic Q : (Landroid/content/Context;)Z
    //   118: ifeq -> 143
    //   121: aload #6
    //   123: invokestatic y : (Landroid/view/ContextThemeWrapper;)I
    //   126: ldc -570425344
    //   128: if_icmpne -> 137
    //   131: ldc 2131952414
    //   133: istore_2
    //   134: goto -> 158
    //   137: ldc 2131952415
    //   139: istore_2
    //   140: goto -> 158
    //   143: iload_3
    //   144: istore_2
    //   145: aload #6
    //   147: invokestatic y : (Landroid/view/ContextThemeWrapper;)I
    //   150: ldc -570425344
    //   152: if_icmpne -> 158
    //   155: ldc 2131952416
    //   157: istore_2
    //   158: aload_0
    //   159: aload #6
    //   161: iload_2
    //   162: invokespecial <init> : (Landroid/content/Context;I)V
    //   165: aload_0
    //   166: getstatic cv0.c : Lcv0;
    //   169: putfield m : Lcv0;
    //   172: iconst_0
    //   173: istore #5
    //   175: aload_0
    //   176: new cj
    //   179: dup
    //   180: iconst_0
    //   181: aload_0
    //   182: invokespecial <init> : (ILjava/lang/Object;)V
    //   185: putfield B : Lcj;
    //   188: aload_0
    //   189: invokevirtual getContext : ()Landroid/content/Context;
    //   192: astore #7
    //   194: aload_0
    //   195: aload #7
    //   197: invokestatic d : (Landroid/content/Context;)Liv0;
    //   200: putfield i : Liv0;
    //   203: aload_0
    //   204: new dj
    //   207: dup
    //   208: iconst_0
    //   209: aload_0
    //   210: invokespecial <init> : (ILjava/lang/Object;)V
    //   213: putfield j : Ldj;
    //   216: aload_0
    //   217: aload #7
    //   219: putfield k : Landroid/content/Context;
    //   222: aload_0
    //   223: aload_1
    //   224: putfield l : Lin/krosbits/musicolet/MusicActivity;
    //   227: aload_0
    //   228: ldc2_w 1000
    //   231: putfield u : J
    //   234: aload #7
    //   236: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   239: new android/content/Intent
    //   242: dup
    //   243: ldc 'android.settings.CAST_SETTINGS'
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: ldc 65536
    //   250: invokevirtual resolveActivity : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   253: astore #6
    //   255: aload #6
    //   257: ifnull -> 291
    //   260: aload #6
    //   262: getfield activityInfo : Landroid/content/pm/ActivityInfo;
    //   265: astore #8
    //   267: aload #6
    //   269: astore_1
    //   270: aload #8
    //   272: ifnull -> 311
    //   275: aload #6
    //   277: astore_1
    //   278: ldc 'org.chromium.settings.SettingsBlackHoleActivity'
    //   280: aload #8
    //   282: getfield name : Ljava/lang/String;
    //   285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   288: ifeq -> 311
    //   291: aload #7
    //   293: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   296: new android/content/Intent
    //   299: dup
    //   300: ldc 'android.settings.WIFI_DISPLAY_SETTINGS'
    //   302: invokespecial <init> : (Ljava/lang/String;)V
    //   305: ldc 65536
    //   307: invokevirtual resolveActivity : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   310: astore_1
    //   311: aload_1
    //   312: ifnull -> 318
    //   315: iconst_1
    //   316: istore #5
    //   318: aload_0
    //   319: iload #5
    //   321: putfield C : Z
    //   324: return
  }
  
  public final void dismiss() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void f() {
    if (this.t == null && this.s) {
      this.i.getClass();
      ArrayList<hv0> arrayList = new ArrayList(iv0.f());
      int i = arrayList.size();
      while (true) {
        int j = i - 1;
        if (i > 0) {
          hv0 hv01 = arrayList.get(j);
          if (hv01.d() || !hv01.g || !hv01.h(this.m))
            arrayList.remove(j); 
          i = j;
          continue;
        } 
        Collections.sort(arrayList, ij.c);
        long l1 = SystemClock.uptimeMillis();
        long l2 = this.v;
        long l3 = this.u;
        if (l1 - l2 >= l3) {
          g(arrayList);
          return;
        } 
        cj cj1 = this.B;
        cj1.removeMessages(1);
        cj1.sendMessageAtTime(cj1.obtainMessage(1, arrayList), this.v + l3);
        break;
      } 
    } 
  }
  
  public final void g(List paramList) {
    this.v = SystemClock.uptimeMillis();
    this.n.clear();
    this.n.addAll(paramList);
    this.o.l();
    boolean bool = this.n.isEmpty();
    RecyclerView recyclerView = this.p;
    if (bool) {
      recyclerView.setVisibility(8);
      this.q.setVisibility(0);
      return;
    } 
    recyclerView.setVisibility(0);
    this.q.setVisibility(8);
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.s = true;
    cv0 cv01 = this.m;
    dj dj1 = this.j;
    this.i.a(cv01, dj1, 1);
    f();
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (paramView == this.r) {
      zo2.I(this.l);
      return;
    } 
    if (2131297801 == i) {
      String str = ag0.a;
      try {
        Intent intent = MyApplication.i.getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.google.android.apps.chromecast.app");
      } finally {
        str = null;
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    int i;
    super.onCreate(paramBundle);
    setContentView(2131492964);
    View view = getWindow().getDecorView();
    Context context = this.k;
    if (dd1.Q(context)) {
      i = 2131100662;
    } else {
      i = 2131100661;
    } 
    view.setBackgroundColor(context.getColor(i));
    this.n = new ArrayList();
    this.o = new hj(this);
    this.p = (RecyclerView)findViewById(2131297409);
    this.q = (ViewGroup)findViewById(2131296993);
    this.r = (MaterialButton)findViewById(2131296437);
    this.w = (TextView)findViewById(2131297813);
    this.x = (TextView)findViewById(2131297814);
    this.y = (TextView)findViewById(2131297815);
    this.z = (TextView)findViewById(2131297816);
    this.A = findViewById(2131297922);
    this.p.setAdapter(this.o);
    this.p.setLayoutManager((a)new LinearLayoutManager(1));
    this.r.setOnClickListener(this);
    findViewById(2131297801).setOnClickListener(this);
    boolean bool1 = context.getResources().getBoolean(2131034120);
    boolean bool = false;
    if (!bool1) {
      i = -1;
    } else {
      float f;
      DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
      if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
        i = 1;
      } else {
        i = 0;
      } 
      TypedValue typedValue = new TypedValue();
      Resources resources = context.getResources();
      if (i != 0) {
        i = 2131166115;
      } else {
        i = 2131166114;
      } 
      resources.getValue(i, typedValue, true);
      i = typedValue.type;
      if (i == 5) {
        f = typedValue.getDimension(displayMetrics);
      } else if (i == 6) {
        f = displayMetrics.widthPixels;
        f = typedValue.getFraction(f, f);
      } else {
        i = -2;
        getWindow().setLayout(i, -2);
      } 
      i = (int)f;
    } 
    getWindow().setLayout(i, -2);
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.s = false;
    this.i.j(this.j);
    this.B.removeMessages(1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */