import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class z00 implements View.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, DialogInterface.OnKeyListener, vp1 {
  public v00 A;
  
  public v00 B;
  
  public final String C;
  
  public final String D;
  
  public Context b;
  
  public final String c;
  
  public final boolean e;
  
  public final boolean f;
  
  public final boolean g;
  
  public final Set h;
  
  public final List i;
  
  public List j;
  
  public y00 k;
  
  public z3 l;
  
  public final ImageView m;
  
  public final TextView n;
  
  public final TextView o;
  
  public final TextView p;
  
  public final Button q;
  
  public final Button r;
  
  public final a3 s;
  
  public v00 t;
  
  public List u;
  
  public boolean v;
  
  public boolean w;
  
  public String x;
  
  public v00 y;
  
  public xp1 z;
  
  public z00(Context paramContext, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Set paramSet, String paramString2, String paramString3, ArrayList paramArrayList, y00 paramy00) {
    this.b = paramContext;
    this.c = paramString1;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.g = paramBoolean3;
    this.h = paramSet;
    this.i = paramArrayList;
    this.k = paramy00;
    this.C = paramString2;
    this.D = paramString3;
    f();
    View view = LayoutInflater.from(paramContext).inflate(2131492957, null);
    ImageView imageView = (ImageView)view.findViewById(2131296835);
    this.m = imageView;
    TextView textView = (TextView)view.findViewById(2131297890);
    this.n = textView;
    this.o = (TextView)view.findViewById(2131297879);
    Button button2 = (Button)view.findViewById(2131296442);
    this.q = button2;
    Button button3 = (Button)view.findViewById(2131296376);
    RecyclerView recyclerView = (RecyclerView)view.findViewById(2131297413);
    this.p = (TextView)view.findViewById(2131297789);
    Button button1 = (Button)view.findViewById(2131296369);
    this.r = button1;
    textView.setText(paramString1);
    button2.setText(paramString2);
    button3.setText(paramString3);
    imageView.setOnClickListener(this);
    button3.setOnClickListener(this);
    button2.setOnClickListener(this);
    button1.setOnClickListener(this);
    recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
    a3 a31 = new a3(6, this);
    this.s = a31;
    recyclerView.setAdapter(a31);
    mi2 mi2 = new mi2(paramContext);
    ((v3)mi2.e).q = view;
    z3 z31 = mi2.c();
    this.l = z31;
    z31.setOnShowListener(this);
    this.l.setOnDismissListener(this);
    Context context = this.b;
    if (context instanceof pc)
      ((pc)context).I = this.l; 
  }
  
  public final void a() {
    z3 z31 = this.l;
    if (z31 != null && z31.isShowing()) {
      this.l.setOnDismissListener(null);
      this.l.dismiss();
    } 
    Context context = this.b;
    if (!(context instanceof pc) || !((pc)context).h0())
      this.k = null; 
    this.b = null;
    this.l = null;
  }
  
  public final void b() {
    boolean bool;
    String str;
    v00 v001 = this.y;
    if (v001 != null && this.k.n(v001)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.q.setEnabled(bool);
    if (bool) {
      try {
        str = ml0.a((MyApplication.F.c(this.y.b.toString())).b);
      } catch (NullPointerException nullPointerException) {
        nullPointerException = null;
      } 
    } else {
      str = ml0.a((MyApplication.F.c(this.x)).b);
    } 
    TextView textView = this.o;
    textView.setText(str);
    if (str == null) {
      textView.setVisibility(8);
    } else {
      textView.setVisibility(0);
    } 
  }
  
  public final void c(wp1 paramwp1) {
    Context context = this.b;
    xp1 xp13 = null;
    v00 v001 = null;
    if (context == null)
      try {
        z00 z002 = (z00)paramwp1.D0;
        pc pc = paramwp1.A0;
        xp13 = z002.z;
        xp1 xp14 = xp13;
        if (xp13 != null)
          xp14 = MyApplication.F.b(xp13.e); 
        if (xp14 != null)
          v001 = xp14.d(); 
        z00 z001 = new z00();
        this((Context)pc, z002.c, z002.e, z002.f, z002.g, z002.h, z002.C, z002.D, null, z002.k);
        z001.B = v001;
        return;
      } finally {
        paramwp1 = null;
        paramwp1.printStackTrace();
      }  
    xp1 xp12 = this.z;
    xp1 xp11 = xp13;
    if (xp12 != null)
      xp11 = MyApplication.F.b(xp12.e); 
    if (xp11 != null && xp11 != this.z) {
      f();
      d(xp11.d());
      return;
    } 
    d(this.t);
  }
  
  public final void d(v00 paramv00) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield t : Lv00;
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield y : Lv00;
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield x : Ljava/lang/String;
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield v : Z
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield z : Lxp1;
    //   25: aload_0
    //   26: getfield e : Z
    //   29: istore #7
    //   31: iconst_1
    //   32: istore_3
    //   33: aload_0
    //   34: getfield c : Ljava/lang/String;
    //   37: astore #11
    //   39: aload_1
    //   40: ifnonnull -> 69
    //   43: aload_0
    //   44: aload_0
    //   45: getfield j : Ljava/util/List;
    //   48: putfield u : Ljava/util/List;
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield v : Z
    //   56: aconst_null
    //   57: astore #10
    //   59: aload #11
    //   61: astore #8
    //   63: aload_1
    //   64: astore #9
    //   66: goto -> 424
    //   69: aload_1
    //   70: getfield b : Ld61;
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: astore #8
    //   78: aload_0
    //   79: aload #8
    //   81: putfield x : Ljava/lang/String;
    //   84: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   87: aload #8
    //   89: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   92: getfield b : Ljava/lang/String;
    //   95: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   98: astore #12
    //   100: aload_0
    //   101: new java/util/ArrayList
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: putfield u : Ljava/util/List;
    //   111: aload_0
    //   112: getfield g : Z
    //   115: istore #6
    //   117: aload_1
    //   118: astore #8
    //   120: iload #6
    //   122: ifeq -> 134
    //   125: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   128: aload_1
    //   129: invokevirtual l : (Lv00;)Lv00;
    //   132: astore #8
    //   134: aload_0
    //   135: getfield x : Ljava/lang/String;
    //   138: ldc_w 'Storage'
    //   141: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   144: ifeq -> 173
    //   147: aload #8
    //   149: invokevirtual w : ()Ljava/lang/String;
    //   152: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   155: ifeq -> 173
    //   158: aload_0
    //   159: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   162: aload #8
    //   164: invokevirtual y : ()Ljava/lang/String;
    //   167: invokevirtual b : (Ljava/lang/String;)Lxp1;
    //   170: putfield z : Lxp1;
    //   173: iload #6
    //   175: ifeq -> 219
    //   178: aload #8
    //   180: invokevirtual b : ()Z
    //   183: ifne -> 219
    //   186: aload_0
    //   187: getfield z : Lxp1;
    //   190: astore_1
    //   191: aload_1
    //   192: ifnull -> 203
    //   195: aload_1
    //   196: getfield k : Ljava/lang/String;
    //   199: astore_1
    //   200: goto -> 398
    //   203: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   206: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   209: ldc_w 2131887003
    //   212: invokevirtual getString : (I)Ljava/lang/String;
    //   215: astore_1
    //   216: goto -> 398
    //   219: aload #8
    //   221: invokevirtual a : ()Z
    //   224: ifne -> 260
    //   227: aload_0
    //   228: getfield z : Lxp1;
    //   231: astore_1
    //   232: aload_1
    //   233: ifnull -> 244
    //   236: aload_1
    //   237: getfield k : Ljava/lang/String;
    //   240: astore_1
    //   241: goto -> 398
    //   244: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   247: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   250: ldc_w 2131886991
    //   253: invokevirtual getString : (I)Ljava/lang/String;
    //   256: astore_1
    //   257: goto -> 398
    //   260: aload_0
    //   261: iconst_1
    //   262: putfield v : Z
    //   265: aload #8
    //   267: aconst_null
    //   268: invokevirtual D : (Lq01;)Ljava/util/ArrayList;
    //   271: astore_1
    //   272: aload_1
    //   273: invokevirtual size : ()I
    //   276: istore #5
    //   278: iconst_0
    //   279: istore_2
    //   280: iload_2
    //   281: iload #5
    //   283: if_icmpge -> 396
    //   286: aload_1
    //   287: iload_2
    //   288: invokevirtual get : (I)Ljava/lang/Object;
    //   291: astore #9
    //   293: iload_2
    //   294: iconst_1
    //   295: iadd
    //   296: istore #4
    //   298: aload #9
    //   300: checkcast v00
    //   303: astore #9
    //   305: aload #9
    //   307: invokevirtual k : ()Z
    //   310: istore #6
    //   312: iload #6
    //   314: ifeq -> 323
    //   317: iconst_1
    //   318: istore #6
    //   320: goto -> 366
    //   323: iload #7
    //   325: ifne -> 363
    //   328: aload_0
    //   329: getfield h : Ljava/util/Set;
    //   332: astore #10
    //   334: aload #10
    //   336: ifnull -> 317
    //   339: aload #10
    //   341: aload #9
    //   343: invokevirtual h : ()Ljava/lang/String;
    //   346: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   349: invokeinterface contains : (Ljava/lang/Object;)Z
    //   354: istore #6
    //   356: goto -> 366
    //   359: astore_1
    //   360: goto -> 392
    //   363: iconst_0
    //   364: istore #6
    //   366: iload #4
    //   368: istore_2
    //   369: iload #6
    //   371: ifeq -> 280
    //   374: aload_0
    //   375: getfield u : Ljava/util/List;
    //   378: aload #9
    //   380: invokeinterface add : (Ljava/lang/Object;)Z
    //   385: pop
    //   386: iload #4
    //   388: istore_2
    //   389: goto -> 280
    //   392: aload_1
    //   393: invokevirtual printStackTrace : ()V
    //   396: aconst_null
    //   397: astore_1
    //   398: aload_0
    //   399: getfield u : Ljava/util/List;
    //   402: new w00
    //   405: dup
    //   406: iconst_0
    //   407: invokespecial <init> : (I)V
    //   410: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   413: aload #8
    //   415: astore #9
    //   417: aload_1
    //   418: astore #10
    //   420: aload #12
    //   422: astore #8
    //   424: iload #7
    //   426: ifeq -> 442
    //   429: aload_0
    //   430: getfield v : Z
    //   433: ifeq -> 442
    //   436: aload_0
    //   437: aload #9
    //   439: putfield y : Lv00;
    //   442: aload_0
    //   443: getfield p : Landroid/widget/TextView;
    //   446: astore_1
    //   447: aload #10
    //   449: ifnull -> 466
    //   452: aload_1
    //   453: aload #10
    //   455: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   458: aload_1
    //   459: iconst_0
    //   460: invokevirtual setVisibility : (I)V
    //   463: goto -> 472
    //   466: aload_1
    //   467: bipush #8
    //   469: invokevirtual setVisibility : (I)V
    //   472: aload_0
    //   473: getfield v : Z
    //   476: istore #6
    //   478: aload_0
    //   479: getfield r : Landroid/widget/Button;
    //   482: astore #10
    //   484: iload #6
    //   486: ifne -> 514
    //   489: aload_0
    //   490: getfield z : Lxp1;
    //   493: astore_1
    //   494: aload_1
    //   495: ifnull -> 514
    //   498: aload_1
    //   499: getfield i : Z
    //   502: ifeq -> 514
    //   505: aload #10
    //   507: iconst_0
    //   508: invokevirtual setVisibility : (I)V
    //   511: goto -> 526
    //   514: aload #10
    //   516: bipush #8
    //   518: invokevirtual setVisibility : (I)V
    //   521: aload_0
    //   522: aconst_null
    //   523: putfield z : Lxp1;
    //   526: aload_0
    //   527: getfield f : Z
    //   530: ifeq -> 551
    //   533: aload #9
    //   535: ifnull -> 551
    //   538: aload_0
    //   539: getfield v : Z
    //   542: ifeq -> 551
    //   545: iconst_1
    //   546: istore #6
    //   548: goto -> 554
    //   551: iconst_0
    //   552: istore #6
    //   554: aload_0
    //   555: iload #6
    //   557: putfield w : Z
    //   560: aload_0
    //   561: getfield t : Lv00;
    //   564: astore_1
    //   565: aload_1
    //   566: ifnull -> 585
    //   569: aload_1
    //   570: aload_0
    //   571: getfield A : Lv00;
    //   574: invokevirtual equals : (Ljava/lang/Object;)Z
    //   577: ifne -> 585
    //   580: iload_3
    //   581: istore_2
    //   582: goto -> 587
    //   585: iconst_0
    //   586: istore_2
    //   587: aload_0
    //   588: getfield n : Landroid/widget/TextView;
    //   591: astore #9
    //   593: aload_0
    //   594: getfield m : Landroid/widget/ImageView;
    //   597: astore_1
    //   598: iload_2
    //   599: ifeq -> 617
    //   602: aload_1
    //   603: iconst_0
    //   604: invokevirtual setVisibility : (I)V
    //   607: aload #9
    //   609: aload #8
    //   611: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   614: goto -> 630
    //   617: aload_1
    //   618: bipush #8
    //   620: invokevirtual setVisibility : (I)V
    //   623: aload #9
    //   625: aload #11
    //   627: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   630: aload_0
    //   631: invokevirtual b : ()V
    //   634: aload_0
    //   635: getfield s : La3;
    //   638: invokevirtual g : ()V
    //   641: return
    // Exception table:
    //   from	to	target	type
    //   265	278	359	java/lang/Exception
    //   286	293	359	java/lang/Exception
    //   298	312	359	java/lang/Exception
    //   339	356	359	java/lang/Exception
    //   374	386	359	java/lang/Exception
  }
  
  public final void e() {
    z3 z31 = this.l;
    if (z31 != null)
      z31.show(); 
  }
  
  public final void f() {
    List list = this.i;
    if (list == null) {
      yp1 yp1 = MyApplication.F;
      if (yp1.p()) {
        ArrayList<ArrayList> arrayList1 = yp1.m(false);
        ArrayList<v00> arrayList = new ArrayList(arrayList1.size());
        int j = arrayList1.size();
        int i = 0;
        while (true) {
          list = arrayList;
          if (i < j) {
            list = arrayList1.get(i);
            int k = i + 1;
            v00 v001 = ((xp1)list).d();
            i = k;
            if (v001 != null) {
              arrayList.add(v001);
              i = k;
            } 
            continue;
          } 
          break;
        } 
      } else if (Build.VERSION.SDK_INT >= 30) {
        list = MyApplication.G.b();
      } else {
        list = new ArrayList(0);
      } 
      this.j = list;
      if (list.size() == 1)
        this.A = this.j.get(0); 
      return;
    } 
    this.j = list;
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296835) {
      v00 v001 = this.t;
      if (v001 != null && !v001.equals(this.A)) {
        d((v00)this.t.i());
        return;
      } 
      a();
      return;
    } 
    if (i == 2131296376) {
      a();
      return;
    } 
    if (i == 2131296442) {
      y00 y001 = this.k;
      if (y001 != null) {
        v00 v001 = this.y;
        if (v001 != null)
          y001.f(this.b, v001); 
      } 
      a();
      return;
    } 
    if (i == 2131296369 && this.z != null) {
      Bundle bundle = new Bundle();
      if (this.z.j == -2)
        bundle.putInt("arg_reqattpid", 2131755024); 
      bundle.putStringArray("arg_reqattu", new String[] { this.z.e });
      wp1 wp1 = new wp1();
      wp1.x0(bundle);
      wp1.D0 = this;
      wp1.N0((pc)this.b);
    } 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    if (this.l == paramDialogInterface)
      a(); 
  }
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && paramKeyEvent.getAction() == 1) {
      v00 v001 = this.t;
      if (v001 != null && !v001.equals(this.A)) {
        d((v00)this.t.i());
        return true;
      } 
      a();
      return true;
    } 
    return false;
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.l.setOnKeyListener(this);
    v00 v001 = this.B;
    if (v001 != null) {
      d(v001);
      return;
    } 
    d(this.A);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */