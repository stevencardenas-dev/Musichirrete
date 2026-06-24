import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eu0 extends w6 {
  public final iv0 i = iv0.d(getContext());
  
  public final dj j = new dj(1, this);
  
  public cv0 k = cv0.c;
  
  public ArrayList l;
  
  public TextView m;
  
  public TextView n;
  
  public RelativeLayout o;
  
  public TextView p;
  
  public TextView q;
  
  public LinearLayout r;
  
  public Button s;
  
  public ProgressBar t;
  
  public ListView u;
  
  public du0 v;
  
  public final q6 w = new q6(4, this);
  
  public boolean x;
  
  public long y;
  
  public final cj z = new cj(5, this);
  
  public eu0(Context paramContext) {
    super((Context)contextThemeWrapper, i);
  }
  
  public final void dismiss() {
    try {
      getContext().unregisterReceiver(this.w);
    } catch (IllegalArgumentException illegalArgumentException) {}
    super.dismiss();
  }
  
  public final void f(List paramList) {
    this.y = SystemClock.uptimeMillis();
    this.l.clear();
    this.l.addAll(paramList);
    this.v.notifyDataSetChanged();
    cj cj1 = this.z;
    cj1.removeMessages(3);
    cj1.removeMessages(2);
    if (paramList.isEmpty()) {
      j(0);
      cj1.sendMessageDelayed(cj1.obtainMessage(2), 5000L);
      return;
    } 
    j(1);
  }
  
  public final void g() {
    if (this.x) {
      this.i.getClass();
      ArrayList<hv0> arrayList = new ArrayList(iv0.f());
      int i = arrayList.size();
      while (true) {
        int j = i - 1;
        if (i > 0) {
          hv0 hv0 = arrayList.get(j);
          if (hv0.d() || !hv0.g || !hv0.h(this.k))
            arrayList.remove(j); 
          i = j;
          continue;
        } 
        Collections.sort(arrayList, ij.e);
        if (SystemClock.uptimeMillis() - this.y >= 300L) {
          f(arrayList);
          return;
        } 
        cj cj1 = this.z;
        cj1.removeMessages(1);
        cj1.sendMessageAtTime(cj1.obtainMessage(1, arrayList), this.y + 300L);
        break;
      } 
    } 
  }
  
  public final void i(cv0 paramcv0) {
    if (paramcv0 != null) {
      if (!this.k.equals(paramcv0)) {
        this.k = paramcv0;
        if (this.x) {
          iv0 iv01 = this.i;
          dj dj1 = this.j;
          iv01.j(dj1);
          iv01.a(paramcv0, dj1, 1);
        } 
        g();
      } 
      return;
    } 
    l0.l("selector must not be null");
  }
  
  public final void j(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3)
            return; 
          setTitle(2131886862);
          this.u.setVisibility(8);
          this.n.setVisibility(8);
          this.t.setVisibility(8);
          this.r.setVisibility(0);
          this.s.setVisibility(0);
          this.q.setVisibility(0);
          this.o.setVisibility(0);
          return;
        } 
        setTitle(2131886854);
        this.u.setVisibility(8);
        this.n.setVisibility(8);
        this.t.setVisibility(0);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.q.setVisibility(4);
        this.o.setVisibility(0);
        return;
      } 
      setTitle(2131886854);
      this.u.setVisibility(0);
      this.n.setVisibility(8);
      this.t.setVisibility(8);
      this.r.setVisibility(8);
      this.s.setVisibility(8);
      this.q.setVisibility(8);
      this.o.setVisibility(8);
      return;
    } 
    setTitle(2131886854);
    this.u.setVisibility(8);
    this.n.setVisibility(0);
    this.t.setVisibility(0);
    this.r.setVisibility(8);
    this.s.setVisibility(8);
    this.q.setVisibility(8);
    this.o.setVisibility(8);
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.x = true;
    cv0 cv01 = this.k;
    dj dj1 = this.j;
    this.i.a(cv01, dj1, 1);
    g();
    cj cj1 = this.z;
    cj1.removeMessages(2);
    cj1.removeMessages(3);
    cj1.removeMessages(1);
    cj1.sendMessageDelayed(cj1.obtainMessage(2), 5000L);
  }
  
  public final void onCreate(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onCreate : (Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: ldc_w 2131493121
    //   9: invokevirtual setContentView : (I)V
    //   12: aload_0
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield l : Ljava/util/ArrayList;
    //   23: aload_0
    //   24: new du0
    //   27: dup
    //   28: aload_0
    //   29: invokevirtual getContext : ()Landroid/content/Context;
    //   32: aload_0
    //   33: getfield l : Ljava/util/ArrayList;
    //   36: invokespecial <init> : (Landroid/content/Context;Ljava/util/ArrayList;)V
    //   39: putfield v : Ldu0;
    //   42: aload_0
    //   43: aload_0
    //   44: ldc_w 2131297185
    //   47: invokevirtual findViewById : (I)Landroid/view/View;
    //   50: checkcast android/widget/TextView
    //   53: putfield m : Landroid/widget/TextView;
    //   56: aload_0
    //   57: aload_0
    //   58: ldc_w 2131297184
    //   61: invokevirtual findViewById : (I)Landroid/view/View;
    //   64: checkcast android/widget/TextView
    //   67: putfield n : Landroid/widget/TextView;
    //   70: aload_0
    //   71: aload_0
    //   72: ldc_w 2131297188
    //   75: invokevirtual findViewById : (I)Landroid/view/View;
    //   78: checkcast android/widget/RelativeLayout
    //   81: putfield o : Landroid/widget/RelativeLayout;
    //   84: aload_0
    //   85: aload_0
    //   86: ldc_w 2131297189
    //   89: invokevirtual findViewById : (I)Landroid/view/View;
    //   92: checkcast android/widget/TextView
    //   95: putfield p : Landroid/widget/TextView;
    //   98: aload_0
    //   99: aload_0
    //   100: ldc_w 2131297186
    //   103: invokevirtual findViewById : (I)Landroid/view/View;
    //   106: checkcast android/widget/TextView
    //   109: putfield q : Landroid/widget/TextView;
    //   112: aload_0
    //   113: aload_0
    //   114: ldc_w 2131297178
    //   117: invokevirtual findViewById : (I)Landroid/view/View;
    //   120: checkcast android/widget/LinearLayout
    //   123: putfield r : Landroid/widget/LinearLayout;
    //   126: aload_0
    //   127: aload_0
    //   128: ldc_w 2131297177
    //   131: invokevirtual findViewById : (I)Landroid/view/View;
    //   134: checkcast android/widget/Button
    //   137: putfield s : Landroid/widget/Button;
    //   140: aload_0
    //   141: aload_0
    //   142: ldc_w 2131297183
    //   145: invokevirtual findViewById : (I)Landroid/view/View;
    //   148: checkcast android/widget/ProgressBar
    //   151: putfield t : Landroid/widget/ProgressBar;
    //   154: aload_0
    //   155: invokevirtual getContext : ()Landroid/content/Context;
    //   158: astore_1
    //   159: getstatic z51.v : Ljava/lang/Boolean;
    //   162: astore #4
    //   164: iconst_0
    //   165: istore_3
    //   166: aload #4
    //   168: ifnonnull -> 241
    //   171: aload_1
    //   172: invokestatic u : (Landroid/content/Context;)Z
    //   175: ifne -> 232
    //   178: aload_1
    //   179: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   182: astore #4
    //   184: getstatic z51.z : Ljava/lang/Boolean;
    //   187: ifnonnull -> 204
    //   190: aload #4
    //   192: ldc_w 'android.hardware.type.watch'
    //   195: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   198: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   201: putstatic z51.z : Ljava/lang/Boolean;
    //   204: getstatic z51.z : Ljava/lang/Boolean;
    //   207: invokevirtual booleanValue : ()Z
    //   210: ifne -> 232
    //   213: aload_1
    //   214: invokestatic s : (Landroid/content/Context;)Z
    //   217: ifne -> 232
    //   220: aload_1
    //   221: invokestatic v : (Landroid/content/Context;)Z
    //   224: ifne -> 232
    //   227: iconst_1
    //   228: istore_2
    //   229: goto -> 234
    //   232: iconst_0
    //   233: istore_2
    //   234: iload_2
    //   235: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   238: putstatic z51.v : Ljava/lang/Boolean;
    //   241: getstatic z51.v : Ljava/lang/Boolean;
    //   244: invokevirtual booleanValue : ()Z
    //   247: ifne -> 442
    //   250: getstatic z51.x : Ljava/lang/Boolean;
    //   253: ifnonnull -> 306
    //   256: aload_1
    //   257: ldc_w 'sensor'
    //   260: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   263: checkcast android/hardware/SensorManager
    //   266: astore #4
    //   268: iload_3
    //   269: istore_2
    //   270: getstatic android/os/Build$VERSION.SDK_INT : I
    //   273: bipush #30
    //   275: if_icmplt -> 299
    //   278: iload_3
    //   279: istore_2
    //   280: aload #4
    //   282: ifnull -> 299
    //   285: iload_3
    //   286: istore_2
    //   287: aload #4
    //   289: bipush #36
    //   291: invokevirtual getDefaultSensor : (I)Landroid/hardware/Sensor;
    //   294: ifnull -> 299
    //   297: iconst_1
    //   298: istore_2
    //   299: iload_2
    //   300: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   303: putstatic z51.x : Ljava/lang/Boolean;
    //   306: getstatic z51.x : Ljava/lang/Boolean;
    //   309: invokevirtual booleanValue : ()Z
    //   312: ifeq -> 318
    //   315: goto -> 442
    //   318: aload_1
    //   319: invokestatic u : (Landroid/content/Context;)Z
    //   322: ifne -> 431
    //   325: aload_1
    //   326: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   329: invokestatic t : (Landroid/content/res/Resources;)Z
    //   332: ifeq -> 338
    //   335: goto -> 431
    //   338: aload_1
    //   339: invokestatic v : (Landroid/content/Context;)Z
    //   342: ifeq -> 356
    //   345: aload_1
    //   346: ldc_w 2131886859
    //   349: invokevirtual getString : (I)Ljava/lang/String;
    //   352: astore_1
    //   353: goto -> 450
    //   356: aload_1
    //   357: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   360: astore #4
    //   362: getstatic z51.z : Ljava/lang/Boolean;
    //   365: ifnonnull -> 382
    //   368: aload #4
    //   370: ldc_w 'android.hardware.type.watch'
    //   373: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   376: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   379: putstatic z51.z : Ljava/lang/Boolean;
    //   382: getstatic z51.z : Ljava/lang/Boolean;
    //   385: invokevirtual booleanValue : ()Z
    //   388: ifeq -> 402
    //   391: aload_1
    //   392: ldc_w 2131886861
    //   395: invokevirtual getString : (I)Ljava/lang/String;
    //   398: astore_1
    //   399: goto -> 450
    //   402: aload_1
    //   403: invokestatic s : (Landroid/content/Context;)Z
    //   406: ifeq -> 420
    //   409: aload_1
    //   410: ldc_w 2131886856
    //   413: invokevirtual getString : (I)Ljava/lang/String;
    //   416: astore_1
    //   417: goto -> 450
    //   420: aload_1
    //   421: ldc_w 2131886860
    //   424: invokevirtual getString : (I)Ljava/lang/String;
    //   427: astore_1
    //   428: goto -> 450
    //   431: aload_1
    //   432: ldc_w 2131886858
    //   435: invokevirtual getString : (I)Ljava/lang/String;
    //   438: astore_1
    //   439: goto -> 450
    //   442: aload_1
    //   443: ldc_w 2131886857
    //   446: invokevirtual getString : (I)Ljava/lang/String;
    //   449: astore_1
    //   450: aload_0
    //   451: getfield p : Landroid/widget/TextView;
    //   454: aload_1
    //   455: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   458: aload_0
    //   459: getfield q : Landroid/widget/TextView;
    //   462: invokestatic getInstance : ()Landroid/text/method/MovementMethod;
    //   465: invokevirtual setMovementMethod : (Landroid/text/method/MovementMethod;)V
    //   468: aload_0
    //   469: getfield s : Landroid/widget/Button;
    //   472: new ql
    //   475: dup
    //   476: iconst_3
    //   477: aload_0
    //   478: invokespecial <init> : (ILjava/lang/Object;)V
    //   481: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   484: aload_0
    //   485: ldc_w 2131297176
    //   488: invokevirtual findViewById : (I)Landroid/view/View;
    //   491: checkcast android/widget/ListView
    //   494: astore_1
    //   495: aload_0
    //   496: aload_1
    //   497: putfield u : Landroid/widget/ListView;
    //   500: aload_1
    //   501: aload_0
    //   502: getfield v : Ldu0;
    //   505: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   508: aload_0
    //   509: getfield u : Landroid/widget/ListView;
    //   512: aload_0
    //   513: getfield v : Ldu0;
    //   516: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   519: aload_0
    //   520: getfield u : Landroid/widget/ListView;
    //   523: aload_0
    //   524: ldc_w 16908292
    //   527: invokevirtual findViewById : (I)Landroid/view/View;
    //   530: invokevirtual setEmptyView : (Landroid/view/View;)V
    //   533: aload_0
    //   534: invokevirtual getWindow : ()Landroid/view/Window;
    //   537: aload_0
    //   538: invokevirtual getContext : ()Landroid/content/Context;
    //   541: invokestatic m : (Landroid/content/Context;)I
    //   544: bipush #-2
    //   546: invokevirtual setLayout : (II)V
    //   549: new android/content/IntentFilter
    //   552: dup
    //   553: ldc_w 'android.intent.action.SCREEN_OFF'
    //   556: invokespecial <init> : (Ljava/lang/String;)V
    //   559: astore_1
    //   560: aload_0
    //   561: invokevirtual getContext : ()Landroid/content/Context;
    //   564: aload_0
    //   565: getfield w : Lq6;
    //   568: aload_1
    //   569: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   572: pop
    //   573: return
  }
  
  public final void onDetachedFromWindow() {
    this.x = false;
    this.i.j(this.j);
    cj cj1 = this.z;
    cj1.removeMessages(1);
    cj1.removeMessages(2);
    cj1.removeMessages(3);
    super.onDetachedFromWindow();
  }
  
  public final void setTitle(int paramInt) {
    this.m.setText(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence) {
    this.m.setText(paramCharSequence);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */