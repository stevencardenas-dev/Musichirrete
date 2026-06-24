import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public class l81 extends ua0 implements bj0, qy0, View.OnClickListener, j41, u5, View.OnLongClickListener, ob, sb1, rq1 {
  public static final String[] e1 = new String[] { "as", "fv", "ra", "rp", "mp", "np" };
  
  public static final int[] f1 = new int[] { 2131886162, 2131886556, 2131887146, 2131887147, 2131886842, 2131887011 };
  
  public static final int[] g1 = new int[] { 2131231077, 2131231139, 2131231378, 2131231377, 2131231220, 2131231360 };
  
  public static final int[] h1 = new int[] { 2131231449, 2131231450, 2131231453, 2131231454, 2131231451, 2131231452 };
  
  public static final int i1 = 6;
  
  public static final zb0 j1 = new zb0(8);
  
  public rn1 A0;
  
  public m90 B0;
  
  public boolean C0 = false;
  
  public RecyclerViewScrollBar D0;
  
  public RecyclerViewScrollBar E0;
  
  public ArrayList F0;
  
  public ArrayList G0;
  
  public String H0;
  
  public km0 I0;
  
  public ArrayList J0;
  
  public String K0;
  
  public MusicActivity L0;
  
  public ss0 M0;
  
  public long N0;
  
  public MaterialButton O0;
  
  public MaterialButton P0;
  
  public boolean Q0;
  
  public sn R0;
  
  public m90 S0;
  
  public int T0 = 0;
  
  public int U0 = 0;
  
  public int V0 = 0;
  
  public int W0 = 0;
  
  public final int[] X0 = new int[] { 1, 3, 7, 15, 30, 60, 365 };
  
  public String[] Y0;
  
  public String[] Z0;
  
  public int a0;
  
  public boolean a1;
  
  public String b0;
  
  public boolean b1;
  
  public String c0;
  
  public final wg c1 = new wg(0, 0);
  
  public String d0;
  
  public final ColorDrawable d1 = new ColorDrawable(0);
  
  public TextView e0;
  
  public TextView f0;
  
  public RecyclerView g0;
  
  public RecyclerView h0;
  
  public RecyclerView i0;
  
  public ViewGroup j0;
  
  public ViewGroup k0;
  
  public ImageView l0;
  
  public ImageView m0;
  
  public ImageView n0;
  
  public ImageView o0;
  
  public ImageView p0;
  
  public ImageView q0;
  
  public ImageView r0;
  
  public SmartImageView s0;
  
  public CoordinatorLayout t0;
  
  public AppBarLayout u0;
  
  public TextView v0;
  
  public TextView w0;
  
  public TextView x0;
  
  public TextView y0;
  
  public TextView z0;
  
  public final void A() {
    my0.g(this.A0.d);
  }
  
  public final void D0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c0 : Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 38
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield c0 : Ljava/lang/String;
    //   14: aload_0
    //   15: aload_0
    //   16: aload_2
    //   17: invokevirtual F0 : (Ljava/lang/String;)I
    //   20: getstatic l81.i1 : I
    //   23: iadd
    //   24: iconst_1
    //   25: iadd
    //   26: invokevirtual L0 : (I)V
    //   29: aload_0
    //   30: getfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   33: iconst_1
    //   34: invokevirtual setExpanded : (Z)V
    //   37: return
    //   38: aload_0
    //   39: getfield d0 : Ljava/lang/String;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull -> 96
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield d0 : Ljava/lang/String;
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_1
    //   55: bipush #6
    //   57: if_icmpge -> 81
    //   60: getstatic l81.e1 : [Ljava/lang/String;
    //   63: iload_1
    //   64: aaload
    //   65: aload_2
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifeq -> 75
    //   72: goto -> 83
    //   75: iinc #1, 1
    //   78: goto -> 54
    //   81: iconst_m1
    //   82: istore_1
    //   83: aload_0
    //   84: iload_1
    //   85: invokevirtual L0 : (I)V
    //   88: aload_0
    //   89: getfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   92: iconst_1
    //   93: invokevirtual setExpanded : (Z)V
    //   96: return
  }
  
  public final String[] E0() {
    if (this.Z0 == null) {
      String[] arrayOfString;
      boolean bool = ws2.U();
      if (bool) {
        arrayOfString = l51.e().list();
      } else {
        HashMap hashMap = l51.a;
        arrayOfString = new String[0];
      } 
      ArrayList<String> arrayList = new ArrayList(arrayOfString.length + 5);
      if (bool) {
        ArrayList<String> arrayList2 = new ArrayList();
        ArrayList<String> arrayList1 = new ArrayList();
        int i = arrayOfString.length;
        File file = null;
        byte b = 0;
        while (b < i) {
          String str = arrayOfString[b];
          File file1 = file;
          if (!str.endsWith("shm")) {
            file1 = file;
            if (!str.endsWith("wal")) {
              file1 = file;
              if (!str.endsWith("journal")) {
                MyApplication.F.getClass();
                file1 = file;
                if (!yp1.a())
                  if (str.endsWith("tmp")) {
                    file1 = file;
                  } else if (str.startsWith("PCs_Y_")) {
                    arrayList2.add(str);
                    file1 = file;
                  } else if (str.startsWith("PCs_M_")) {
                    arrayList1.add(str);
                    file1 = file;
                  } else {
                    file1 = file;
                    if (str.startsWith(KjdXPYm.HvpRxaLBT))
                      file1 = new File(l51.e(), str); 
                  }  
              } 
            } 
          } 
          b++;
          file = file1;
        } 
        if (!arrayList2.isEmpty()) {
          arrayList2.sort(new w00(7));
          l51.c(arrayList2);
          arrayList.addAll(arrayList2);
        } 
        if (!arrayList1.isEmpty()) {
          arrayList1.sort(new w00(8));
          l51.c(arrayList1);
          arrayList.addAll(arrayList1);
        } 
        if (((file != null && file.length() > 0L) || !arrayList2.isEmpty() || !arrayList1.isEmpty()) && file != null)
          arrayList.add(file.getName()); 
        arrayList.sort(new w00(9));
      } 
      arrayList.add("CPCc_W");
      arrayList.add("CPCc_M");
      if (bool)
        arrayList.add("CPCc_Y"); 
      arrayList.add("CPCc_A");
      this.Z0 = arrayList.<String>toArray(new String[0]);
    } 
    return this.Z0;
  }
  
  public final int F0(String paramString) {
    for (byte b = 0; b < c81.g(P()).size(); b++) {
      if (((String)c81.g(P()).get(b)).equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  public final Uri G(int paramInt) {
    return null;
  }
  
  public final String G0(int paramInt) {
    int i = i1;
    if (paramInt < i)
      return T(f1[paramInt]); 
    paramInt -= i + 1;
    return (paramInt >= 0 && paramInt < c81.g(P()).size()) ? c81.g(MyApplication.i.getApplicationContext()).get(paramInt) : null;
  }
  
  public final String H0() {
    StringBuilder stringBuilder;
    String str = G0(this.a0);
    int i = this.a0;
    if (i >= 2 && i <= 5) {
      Calendar calendar = Calendar.getInstance();
      String str2 = (new SimpleDateFormat("dd MMM yyyy")).format(calendar.getTime());
      String str1 = str;
      if (this.C0) {
        i = this.a0;
        if (i == 2) {
          StringBuilder stringBuilder1 = ga1.l(str, ": ");
          stringBuilder1.append(I0()[this.T0]);
          String str3 = stringBuilder1.toString();
        } else if (i == 3) {
          StringBuilder stringBuilder1 = ga1.l(str, ": ");
          stringBuilder1.append(I0()[this.U0]);
          String str3 = stringBuilder1.toString();
        } else if (i == 4) {
          StringBuilder stringBuilder1 = ga1.l(str, ": ");
          stringBuilder1.append(l51.d(E0()[this.W0], false, true, false));
          String str3 = stringBuilder1.toString();
        } else {
          str1 = str;
          if (i == 5) {
            StringBuilder stringBuilder1 = ga1.l(str, ": ");
            stringBuilder1.append(I0()[this.V0]);
            str1 = stringBuilder1.toString();
          } 
        } 
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(" (");
      stringBuilder.append(str2);
      stringBuilder.append(")");
      return stringBuilder.toString();
    } 
    return (String)stringBuilder;
  }
  
  public final String[] I0() {
    if (this.Y0 == null) {
      int[] arrayOfInt = this.X0;
      this.Y0 = new String[arrayOfInt.length + 1];
      byte b = 0;
      while (true) {
        int i = arrayOfInt.length;
        String[] arrayOfString = this.Y0;
        if (b < i) {
          Resources resources = MyApplication.i.getApplicationContext().getResources();
          i = arrayOfInt[b];
          arrayOfString[b] = resources.getQuantityString(2131755030, i, new Object[] { Integer.valueOf(i) });
          b++;
          continue;
        } 
        arrayOfString[arrayOfInt.length] = MyApplication.i.getApplicationContext().getString(2131886163);
        break;
      } 
    } 
    return this.Y0;
  }
  
  public final void J(km0 paramkm0) {
    this.I0 = paramkm0;
    ArrayList<km0> arrayList = new ArrayList(1);
    this.J0 = arrayList;
    arrayList.add(paramkm0);
    View view = LayoutInflater.from(P()).inflate(2131493018, null);
    TextView textView = (TextView)view.findViewById(2131297873);
    ImageView imageView = (ImageView)view.findViewById(2131296860);
    textView.setText(ag0.W(this.I0));
    if (c81.c(P()).c(this.I0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener(new ag(7, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296973);
    if (this.a0 < i1)
      linearLayout.findViewById(2131297011).setVisibility(8); 
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0 ms0 = new ms0(P());
    ms0.f(view, false);
    ss0 ss01 = new ss0(ms0);
    this.M0 = ss01;
    ss01.show();
  }
  
  public final ArrayList J0(int paramInt) {
    int i = i1;
    if (paramInt < i) {
      int j = 0;
      i = 0;
      if (paramInt == 0)
        return MyApplication.j.c.i(new int[0]); 
      if (paramInt == 1)
        return c81.d((c81.c(MyApplication.i.getApplicationContext())).c); 
      if (paramInt == 2)
        return MyApplication.j.c.i(new int[] { 19 }); 
      if (paramInt == 3) {
        ArrayList<Object> arrayList1 = MyApplication.j.c.i(new int[] { 21 });
        ArrayList<km0> arrayList = new ArrayList();
        j = arrayList1.size();
        paramInt = i;
        while (paramInt < j) {
          km0 km01 = (km0)arrayList1.get(paramInt);
          paramInt++;
          km01 = km01;
          if (km01.o > 0)
            arrayList.add(km01); 
        } 
        return arrayList;
      } 
      if (paramInt == 4) {
        ArrayList<Object> arrayList1 = MyApplication.j.c.i(new int[] { 22 });
        ArrayList<km0> arrayList = new ArrayList();
        i = arrayList1.size();
        paramInt = j;
        while (paramInt < i) {
          km0 km01 = (km0)arrayList1.get(paramInt);
          paramInt++;
          km01 = km01;
          if (km01.o > 0)
            arrayList.add(km01); 
        } 
        return arrayList;
      } 
      if (paramInt == 5)
        return MyApplication.j.c.i(new int[0]); 
    } else {
      paramInt -= i + 1;
      if (paramInt >= 0 && paramInt < c81.g(P()).size())
        return c81.d((c81.f(P(), (String)c81.g(P()).get(paramInt))).c); 
    } 
    return new ArrayList();
  }
  
  public final void K0() {
    if (Build.VERSION.SDK_INT >= 30) {
      String str = tlzLOCPTHRhep.FzfQWBp;
      Intent intent = (new Intent(kOkiWEITVb.gNBAANXYzAOFX)).setType("audio/*").putExtra("android.intent.extra.MIME_TYPES", new String[] { "audio/x-mpegurl", "audio/mpegurl", "audio/x-scpls", "audio/x-pls", "audio/pls", " audio/scpls", str, "application/pls", "application/x-pls" }).putExtra("android.content.extra.SHOW_ADVANCED", true).addFlags(1).addCategory("android.intent.category.OPENABLE");
      try {
        this.L0.startActivityForResult(intent, 10201);
        ag0.O0(2131887334, 1);
        return;
      } catch (ActivityNotFoundException activityNotFoundException) {
        activityNotFoundException.printStackTrace();
        wp1.K0(P());
        return;
      } 
    } 
    (new z00(P(), T(2131887320), false, false, false, new HashSet(Arrays.asList((Object[])new String[] { "m3u", "m3u8", "pls" }, )), T(2131887338), T(2131886278), null, j1)).e();
  }
  
  public final void L0(int paramInt) {
    if (paramInt >= 0) {
      int i = i1;
      if (paramInt < c81.g(MyApplication.i.getApplicationContext()).size() + i + 1) {
        this.a0 = paramInt;
        this.H0 = G0(paramInt);
        this.F0 = J0(this.a0);
        if (paramInt > i) {
          this.G0 = new ArrayList(this.F0);
          this.z0.setVisibility(0);
        } else {
          this.z0.setVisibility(8);
        } 
        this.h0.k0(0);
        this.v0.setText(this.H0);
        this.w0.setText(this.H0);
        this.k0.setVisibility(8);
        this.g0.setVisibility(8);
        this.D0.setVisibility(8);
        this.e0.setVisibility(0);
        this.t0.setVisibility(0);
        this.C0 = true;
        M0();
        this.E0.setRecyclerView(this.h0);
        if (this.F0.size() == 0) {
          ag0.O0(2131887496, 0);
          e();
          return;
        } 
        try {
          MusicActivity musicActivity = this.L0;
          if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
            this.L0.t0.f(this.C0);
            if (this.C0 && this.a0 >= i) {
              this.L0.t0.j = 2;
              return;
            } 
            this.L0.t0.j = 0;
          } 
          return;
        } catch (Exception exception) {
          exception.printStackTrace();
          return;
        } 
      } 
    } 
    this.a0 = 0;
    e();
  }
  
  public final void M0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a0 : I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield A0 : Lrn1;
    //   9: astore #13
    //   11: iload_1
    //   12: iconst_4
    //   13: if_icmpne -> 26
    //   16: aload #13
    //   18: bipush #6
    //   20: putfield h : I
    //   23: goto -> 32
    //   26: aload #13
    //   28: iconst_0
    //   29: putfield h : I
    //   32: aconst_null
    //   33: astore #13
    //   35: aconst_null
    //   36: astore #15
    //   38: aconst_null
    //   39: astore #14
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield b0 : Ljava/lang/String;
    //   46: aload_0
    //   47: getfield X0 : [I
    //   50: astore #16
    //   52: iconst_1
    //   53: istore #5
    //   55: iload_1
    //   56: iconst_2
    //   57: if_icmpeq -> 70
    //   60: iload_1
    //   61: iconst_3
    //   62: if_icmpeq -> 70
    //   65: iload_1
    //   66: iconst_4
    //   67: if_icmpne -> 76
    //   70: iconst_1
    //   71: istore #6
    //   73: goto -> 349
    //   76: aload_0
    //   77: getfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   80: iconst_5
    //   81: invokevirtual setColorTintIndex : (I)V
    //   84: aload_0
    //   85: getfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   88: iconst_0
    //   89: invokevirtual setVisibility : (I)V
    //   92: aload_0
    //   93: getfield a0 : I
    //   96: istore_1
    //   97: iload_1
    //   98: ifeq -> 106
    //   101: iload_1
    //   102: iconst_1
    //   103: if_icmpne -> 109
    //   106: goto -> 323
    //   109: iload_1
    //   110: iconst_5
    //   111: if_icmpne -> 255
    //   114: invokestatic o : ()Landroid/content/SharedPreferences;
    //   117: ldc_w 'I_K_SRTBYF_PL'
    //   120: iconst_0
    //   121: invokeinterface getInt : (Ljava/lang/String;I)I
    //   126: istore_2
    //   127: new java/util/ArrayList
    //   130: dup
    //   131: invokespecial <init> : ()V
    //   134: astore #13
    //   136: aload_0
    //   137: getfield V0 : I
    //   140: aload #16
    //   142: arraylength
    //   143: if_icmpge -> 175
    //   146: invokestatic getInstance : ()Ljava/util/Calendar;
    //   149: astore #14
    //   151: aload #14
    //   153: iconst_5
    //   154: aload #16
    //   156: aload_0
    //   157: getfield V0 : I
    //   160: iaload
    //   161: ineg
    //   162: invokevirtual add : (II)V
    //   165: aload #14
    //   167: invokevirtual getTimeInMillis : ()J
    //   170: lstore #7
    //   172: goto -> 178
    //   175: lconst_0
    //   176: lstore #7
    //   178: aload_0
    //   179: getfield F0 : Ljava/util/ArrayList;
    //   182: astore #14
    //   184: aload #14
    //   186: invokevirtual size : ()I
    //   189: istore_3
    //   190: iconst_0
    //   191: istore_1
    //   192: iload_1
    //   193: iload_3
    //   194: if_icmpge -> 237
    //   197: aload #14
    //   199: iload_1
    //   200: invokevirtual get : (I)Ljava/lang/Object;
    //   203: astore #15
    //   205: iinc #1, 1
    //   208: aload #15
    //   210: checkcast km0
    //   213: astore #15
    //   215: aload #15
    //   217: getfield m : J
    //   220: lload #7
    //   222: lcmp
    //   223: ifgt -> 234
    //   226: aload #13
    //   228: aload #15
    //   230: invokevirtual add : (Ljava/lang/Object;)Z
    //   233: pop
    //   234: goto -> 192
    //   237: aload_0
    //   238: getfield V0 : I
    //   241: istore_1
    //   242: iload_2
    //   243: aload #13
    //   245: invokestatic R : (ILjava/util/ArrayList;)V
    //   248: iload #5
    //   250: istore #6
    //   252: goto -> 729
    //   255: aload_0
    //   256: getfield H0 : Ljava/lang/String;
    //   259: invokestatic e : (Ljava/lang/String;)I
    //   262: istore_1
    //   263: iload_1
    //   264: iconst_m1
    //   265: if_icmpeq -> 279
    //   268: iload_1
    //   269: aload_0
    //   270: getfield F0 : Ljava/util/ArrayList;
    //   273: invokestatic R : (ILjava/util/ArrayList;)V
    //   276: goto -> 285
    //   279: aload_0
    //   280: getfield G0 : Ljava/util/ArrayList;
    //   283: astore #13
    //   285: aload_0
    //   286: getfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   289: astore #14
    //   291: iload_1
    //   292: iconst_m1
    //   293: if_icmpne -> 306
    //   296: aload #14
    //   298: bipush #7
    //   300: invokevirtual setColorTintIndex : (I)V
    //   303: goto -> 312
    //   306: aload #14
    //   308: iconst_5
    //   309: invokevirtual setColorTintIndex : (I)V
    //   312: iconst_1
    //   313: istore #5
    //   315: iconst_0
    //   316: istore #6
    //   318: iconst_0
    //   319: istore_1
    //   320: goto -> 729
    //   323: invokestatic o : ()Landroid/content/SharedPreferences;
    //   326: ldc_w 'I_K_SRTBYF_PL'
    //   329: iconst_0
    //   330: invokeinterface getInt : (Ljava/lang/String;I)I
    //   335: aload_0
    //   336: getfield F0 : Ljava/util/ArrayList;
    //   339: invokestatic R : (ILjava/util/ArrayList;)V
    //   342: aload #15
    //   344: astore #13
    //   346: goto -> 312
    //   349: aload_0
    //   350: getfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   353: bipush #8
    //   355: invokevirtual setVisibility : (I)V
    //   358: aload_0
    //   359: getfield a0 : I
    //   362: istore_1
    //   363: iload_1
    //   364: iconst_2
    //   365: if_icmpne -> 492
    //   368: aload_0
    //   369: getfield T0 : I
    //   372: istore_3
    //   373: aload #14
    //   375: astore #13
    //   377: iload_3
    //   378: istore_1
    //   379: iload #6
    //   381: istore #5
    //   383: iload_3
    //   384: aload #16
    //   386: arraylength
    //   387: if_icmpge -> 248
    //   390: invokestatic getInstance : ()Ljava/util/Calendar;
    //   393: astore #13
    //   395: aload #13
    //   397: iconst_5
    //   398: aload #16
    //   400: aload_0
    //   401: getfield T0 : I
    //   404: iaload
    //   405: ineg
    //   406: invokevirtual add : (II)V
    //   409: aload #13
    //   411: invokevirtual getTimeInMillis : ()J
    //   414: lstore #7
    //   416: new java/util/ArrayList
    //   419: dup
    //   420: invokespecial <init> : ()V
    //   423: astore #14
    //   425: aload_0
    //   426: getfield F0 : Ljava/util/ArrayList;
    //   429: astore #15
    //   431: aload #15
    //   433: invokevirtual size : ()I
    //   436: istore #4
    //   438: iconst_0
    //   439: istore_2
    //   440: aload #14
    //   442: astore #13
    //   444: iload_3
    //   445: istore_1
    //   446: iload #6
    //   448: istore #5
    //   450: iload_2
    //   451: iload #4
    //   453: if_icmpge -> 248
    //   456: aload #15
    //   458: iload_2
    //   459: invokevirtual get : (I)Ljava/lang/Object;
    //   462: checkcast km0
    //   465: astore #13
    //   467: aload #13
    //   469: getfield k : J
    //   472: lload #7
    //   474: lcmp
    //   475: iflt -> 486
    //   478: aload #14
    //   480: aload #13
    //   482: invokevirtual add : (Ljava/lang/Object;)Z
    //   485: pop
    //   486: iinc #2, 1
    //   489: goto -> 440
    //   492: iload_1
    //   493: iconst_3
    //   494: if_icmpne -> 621
    //   497: aload_0
    //   498: getfield U0 : I
    //   501: istore_3
    //   502: aload #14
    //   504: astore #13
    //   506: iload_3
    //   507: istore_1
    //   508: iload #6
    //   510: istore #5
    //   512: iload_3
    //   513: aload #16
    //   515: arraylength
    //   516: if_icmpge -> 248
    //   519: invokestatic getInstance : ()Ljava/util/Calendar;
    //   522: astore #13
    //   524: aload #13
    //   526: iconst_5
    //   527: aload #16
    //   529: aload_0
    //   530: getfield U0 : I
    //   533: iaload
    //   534: ineg
    //   535: invokevirtual add : (II)V
    //   538: aload #13
    //   540: invokevirtual getTimeInMillis : ()J
    //   543: lstore #7
    //   545: new java/util/ArrayList
    //   548: dup
    //   549: invokespecial <init> : ()V
    //   552: astore #14
    //   554: aload_0
    //   555: getfield F0 : Ljava/util/ArrayList;
    //   558: astore #15
    //   560: aload #15
    //   562: invokevirtual size : ()I
    //   565: istore #4
    //   567: iconst_0
    //   568: istore_2
    //   569: aload #14
    //   571: astore #13
    //   573: iload_3
    //   574: istore_1
    //   575: iload #6
    //   577: istore #5
    //   579: iload_2
    //   580: iload #4
    //   582: if_icmpge -> 248
    //   585: aload #15
    //   587: iload_2
    //   588: invokevirtual get : (I)Ljava/lang/Object;
    //   591: checkcast km0
    //   594: astore #13
    //   596: aload #13
    //   598: getfield m : J
    //   601: lload #7
    //   603: lcmp
    //   604: iflt -> 615
    //   607: aload #14
    //   609: aload #13
    //   611: invokevirtual add : (Ljava/lang/Object;)Z
    //   614: pop
    //   615: iinc #2, 1
    //   618: goto -> 569
    //   621: aload #15
    //   623: astore #13
    //   625: iload_1
    //   626: iconst_4
    //   627: if_icmpne -> 312
    //   630: aload_0
    //   631: getfield W0 : I
    //   634: aload_0
    //   635: invokevirtual E0 : ()[Ljava/lang/String;
    //   638: arraylength
    //   639: if_icmplt -> 656
    //   642: aload_0
    //   643: aload_0
    //   644: invokevirtual E0 : ()[Ljava/lang/String;
    //   647: arraylength
    //   648: iconst_1
    //   649: isub
    //   650: putfield W0 : I
    //   653: goto -> 668
    //   656: aload_0
    //   657: getfield W0 : I
    //   660: ifge -> 668
    //   663: aload_0
    //   664: iconst_0
    //   665: putfield W0 : I
    //   668: aload_0
    //   669: getfield W0 : I
    //   672: istore_1
    //   673: aload_0
    //   674: invokevirtual E0 : ()[Ljava/lang/String;
    //   677: aload_0
    //   678: getfield W0 : I
    //   681: aaload
    //   682: astore #13
    //   684: aload_0
    //   685: aload #13
    //   687: putfield b0 : Ljava/lang/String;
    //   690: aload #13
    //   692: invokestatic f : (Ljava/lang/String;)Lu51;
    //   695: astore #14
    //   697: aload #14
    //   699: getfield a : Ljava/lang/Object;
    //   702: checkcast java/util/ArrayList
    //   705: astore #13
    //   707: aload_0
    //   708: getfield A0 : Lrn1;
    //   711: aload #14
    //   713: getfield b : Ljava/lang/Object;
    //   716: checkcast java/util/ArrayList
    //   719: putfield e : Ljava/util/ArrayList;
    //   722: iload #6
    //   724: istore #5
    //   726: goto -> 248
    //   729: aload #13
    //   731: astore #14
    //   733: aload #13
    //   735: ifnonnull -> 751
    //   738: new java/util/ArrayList
    //   741: dup
    //   742: aload_0
    //   743: getfield F0 : Ljava/util/ArrayList;
    //   746: invokespecial <init> : (Ljava/util/Collection;)V
    //   749: astore #14
    //   751: aload_0
    //   752: aload #14
    //   754: putfield J0 : Ljava/util/ArrayList;
    //   757: aload_0
    //   758: aload_0
    //   759: getfield H0 : Ljava/lang/String;
    //   762: putfield K0 : Ljava/lang/String;
    //   765: aload_0
    //   766: getfield A0 : Lrn1;
    //   769: astore #13
    //   771: aload #13
    //   773: aload #14
    //   775: putfield d : Ljava/util/ArrayList;
    //   778: aload #13
    //   780: invokevirtual g : ()V
    //   783: aload_0
    //   784: getfield S0 : Lm90;
    //   787: invokevirtual g : ()V
    //   790: aload_0
    //   791: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   794: astore #13
    //   796: iload #6
    //   798: ifeq -> 818
    //   801: aload #13
    //   803: iconst_0
    //   804: invokevirtual setVisibility : (I)V
    //   807: aload_0
    //   808: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   811: iload_1
    //   812: invokevirtual k0 : (I)V
    //   815: goto -> 825
    //   818: aload #13
    //   820: bipush #8
    //   822: invokevirtual setVisibility : (I)V
    //   825: aload_0
    //   826: getfield x0 : Landroid/widget/TextView;
    //   829: aload_0
    //   830: invokevirtual S : ()Landroid/content/res/Resources;
    //   833: ldc_w 2131755061
    //   836: aload_0
    //   837: getfield J0 : Ljava/util/ArrayList;
    //   840: invokevirtual size : ()I
    //   843: iconst_1
    //   844: anewarray java/lang/Object
    //   847: dup
    //   848: iconst_0
    //   849: aload_0
    //   850: getfield J0 : Ljava/util/ArrayList;
    //   853: invokevirtual size : ()I
    //   856: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   859: aastore
    //   860: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   863: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   866: aload_0
    //   867: getfield A0 : Lrn1;
    //   870: astore #13
    //   872: aload #13
    //   874: getfield h : I
    //   877: bipush #6
    //   879: if_icmpne -> 983
    //   882: aload #13
    //   884: getfield d : Ljava/util/ArrayList;
    //   887: invokevirtual size : ()I
    //   890: istore_2
    //   891: iconst_0
    //   892: istore_1
    //   893: lconst_0
    //   894: lstore #7
    //   896: lload #7
    //   898: lstore #9
    //   900: iload_1
    //   901: iload_2
    //   902: if_icmpge -> 1055
    //   905: lload #7
    //   907: lstore #9
    //   909: aload_0
    //   910: getfield A0 : Lrn1;
    //   913: getfield e : Ljava/util/ArrayList;
    //   916: iload_1
    //   917: invokevirtual get : (I)Ljava/lang/Object;
    //   920: checkcast java/lang/Integer
    //   923: invokevirtual intValue : ()I
    //   926: i2l
    //   927: lstore #11
    //   929: lload #7
    //   931: lstore #9
    //   933: aload_0
    //   934: getfield A0 : Lrn1;
    //   937: getfield d : Ljava/util/ArrayList;
    //   940: iload_1
    //   941: invokevirtual get : (I)Ljava/lang/Object;
    //   944: checkcast km0
    //   947: getfield c : Lqn1;
    //   950: getfield g : I
    //   953: istore_3
    //   954: lload #7
    //   956: lload #11
    //   958: iload_3
    //   959: i2l
    //   960: lmul
    //   961: ladd
    //   962: lstore #7
    //   964: iinc #1, 1
    //   967: goto -> 896
    //   970: astore #13
    //   972: goto -> 1050
    //   975: astore #13
    //   977: lconst_0
    //   978: lstore #9
    //   980: goto -> 1050
    //   983: aload_0
    //   984: getfield J0 : Ljava/util/ArrayList;
    //   987: astore #14
    //   989: aload #14
    //   991: invokevirtual size : ()I
    //   994: istore_2
    //   995: iconst_0
    //   996: istore_1
    //   997: lconst_0
    //   998: lstore #7
    //   1000: lload #7
    //   1002: lstore #9
    //   1004: iload_1
    //   1005: iload_2
    //   1006: if_icmpge -> 1055
    //   1009: lload #7
    //   1011: lstore #9
    //   1013: aload #14
    //   1015: iload_1
    //   1016: invokevirtual get : (I)Ljava/lang/Object;
    //   1019: astore #13
    //   1021: iinc #1, 1
    //   1024: lload #7
    //   1026: lstore #9
    //   1028: aload #13
    //   1030: checkcast km0
    //   1033: getfield c : Lqn1;
    //   1036: getfield g : I
    //   1039: istore_3
    //   1040: lload #7
    //   1042: iload_3
    //   1043: i2l
    //   1044: ladd
    //   1045: lstore #7
    //   1047: goto -> 1000
    //   1050: aload #13
    //   1052: invokevirtual printStackTrace : ()V
    //   1055: aload_0
    //   1056: getfield y0 : Landroid/widget/TextView;
    //   1059: lload #9
    //   1061: iconst_0
    //   1062: iconst_0
    //   1063: invokestatic B : (JZI)Ljava/lang/String;
    //   1066: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1069: aload_0
    //   1070: getfield J0 : Ljava/util/ArrayList;
    //   1073: invokevirtual size : ()I
    //   1076: iconst_3
    //   1077: if_icmple -> 1123
    //   1080: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1083: ldc_w 'k_b_qspl1'
    //   1086: iload #5
    //   1088: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1093: istore #5
    //   1095: aload_0
    //   1096: getfield e0 : Landroid/widget/TextView;
    //   1099: astore #13
    //   1101: iload #5
    //   1103: ifeq -> 1111
    //   1106: iconst_0
    //   1107: istore_1
    //   1108: goto -> 1114
    //   1111: bipush #8
    //   1113: istore_1
    //   1114: aload #13
    //   1116: iload_1
    //   1117: invokevirtual setVisibility : (I)V
    //   1120: goto -> 1132
    //   1123: aload_0
    //   1124: getfield e0 : Landroid/widget/TextView;
    //   1127: bipush #8
    //   1129: invokevirtual setVisibility : (I)V
    //   1132: aload_0
    //   1133: getfield a0 : I
    //   1136: iconst_4
    //   1137: if_icmpne -> 1396
    //   1140: aload_0
    //   1141: getfield J0 : Ljava/util/ArrayList;
    //   1144: invokevirtual size : ()I
    //   1147: iconst_5
    //   1148: if_icmplt -> 1156
    //   1151: iconst_1
    //   1152: istore_1
    //   1153: goto -> 1158
    //   1156: iconst_0
    //   1157: istore_1
    //   1158: aload_0
    //   1159: getfield Q0 : Z
    //   1162: ifeq -> 1335
    //   1165: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1168: getfield c : Llm0;
    //   1171: astore #13
    //   1173: aload #13
    //   1175: getfield I : Z
    //   1178: istore #5
    //   1180: aload_0
    //   1181: getfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   1184: astore #14
    //   1186: iload #5
    //   1188: ifeq -> 1233
    //   1191: aload #14
    //   1193: aload #13
    //   1195: getfield L : Ljava/lang/String;
    //   1198: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1201: aload_0
    //   1202: getfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   1205: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1208: getfield c : Llm0;
    //   1211: getfield K : Ljava/lang/String;
    //   1214: invokevirtual setTag : (Ljava/lang/Object;)V
    //   1217: aload_0
    //   1218: getfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   1221: iconst_0
    //   1222: invokevirtual setVisibility : (I)V
    //   1225: aload_0
    //   1226: iconst_1
    //   1227: putfield b1 : Z
    //   1230: goto -> 1245
    //   1233: aload #14
    //   1235: bipush #8
    //   1237: invokevirtual setVisibility : (I)V
    //   1240: aload_0
    //   1241: iconst_0
    //   1242: putfield b1 : Z
    //   1245: aload_0
    //   1246: getfield b0 : Ljava/lang/String;
    //   1249: astore #13
    //   1251: aload #13
    //   1253: ifnull -> 1321
    //   1256: aload #13
    //   1258: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1261: getfield c : Llm0;
    //   1264: getfield K : Ljava/lang/String;
    //   1267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1270: ifne -> 1321
    //   1273: iload_1
    //   1274: ifeq -> 1321
    //   1277: aload_0
    //   1278: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   1281: aload_0
    //   1282: getfield b0 : Ljava/lang/String;
    //   1285: iconst_0
    //   1286: iconst_1
    //   1287: iconst_0
    //   1288: invokestatic d : (Ljava/lang/String;ZZZ)Ljava/lang/String;
    //   1291: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1294: aload_0
    //   1295: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   1298: aload_0
    //   1299: getfield b0 : Ljava/lang/String;
    //   1302: invokevirtual setTag : (Ljava/lang/Object;)V
    //   1305: aload_0
    //   1306: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   1309: iconst_0
    //   1310: invokevirtual setVisibility : (I)V
    //   1313: aload_0
    //   1314: iconst_1
    //   1315: putfield a1 : Z
    //   1318: goto -> 1335
    //   1321: aload_0
    //   1322: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   1325: bipush #8
    //   1327: invokevirtual setVisibility : (I)V
    //   1330: aload_0
    //   1331: iconst_0
    //   1332: putfield a1 : Z
    //   1335: aload_0
    //   1336: getfield R0 : Lsn;
    //   1339: astore #13
    //   1341: iload_1
    //   1342: ifeq -> 1383
    //   1345: aload #13
    //   1347: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1350: iconst_0
    //   1351: invokevirtual setVisibility : (I)V
    //   1354: aload_0
    //   1355: getfield R0 : Lsn;
    //   1358: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1361: ldc_w 2131886211
    //   1364: invokevirtual setText : (I)V
    //   1367: aload_0
    //   1368: getfield R0 : Lsn;
    //   1371: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1374: ldc_w 2131231081
    //   1377: invokevirtual setIconResource : (I)V
    //   1380: goto -> 1436
    //   1383: aload #13
    //   1385: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1388: bipush #8
    //   1390: invokevirtual setVisibility : (I)V
    //   1393: goto -> 1436
    //   1396: aload_0
    //   1397: getfield R0 : Lsn;
    //   1400: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   1403: bipush #8
    //   1405: invokevirtual setVisibility : (I)V
    //   1408: aload_0
    //   1409: getfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   1412: bipush #8
    //   1414: invokevirtual setVisibility : (I)V
    //   1417: aload_0
    //   1418: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   1421: bipush #8
    //   1423: invokevirtual setVisibility : (I)V
    //   1426: aload_0
    //   1427: iconst_0
    //   1428: putfield a1 : Z
    //   1431: aload_0
    //   1432: iconst_0
    //   1433: putfield b1 : Z
    //   1436: return
    // Exception table:
    //   from	to	target	type
    //   866	891	975	finally
    //   909	929	970	finally
    //   933	954	970	finally
    //   983	995	975	finally
    //   1013	1021	970	finally
    //   1028	1040	970	finally
  }
  
  public final void N0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield C0 : Z
    //   4: istore_3
    //   5: aconst_null
    //   6: astore #5
    //   8: iload_3
    //   9: ifeq -> 48
    //   12: aload_0
    //   13: getfield J0 : Ljava/util/ArrayList;
    //   16: astore #4
    //   18: aload #4
    //   20: ifnull -> 48
    //   23: aload #4
    //   25: invokevirtual size : ()I
    //   28: iconst_1
    //   29: if_icmpne -> 48
    //   32: aload_0
    //   33: getfield J0 : Ljava/util/ArrayList;
    //   36: iconst_0
    //   37: invokevirtual get : (I)Ljava/lang/Object;
    //   40: checkcast km0
    //   43: astore #4
    //   45: goto -> 51
    //   48: aconst_null
    //   49: astore #4
    //   51: aload_0
    //   52: getfield C0 : Z
    //   55: ifeq -> 134
    //   58: aload_0
    //   59: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   62: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   65: invokevirtual t0 : ()Landroid/os/Parcelable;
    //   68: astore #6
    //   70: aload_0
    //   71: getfield a0 : I
    //   74: istore_2
    //   75: getstatic l81.i1 : I
    //   78: istore_1
    //   79: iload_2
    //   80: iload_1
    //   81: if_icmple -> 117
    //   84: aload_0
    //   85: aload_0
    //   86: getfield H0 : Ljava/lang/String;
    //   89: invokevirtual F0 : (Ljava/lang/String;)I
    //   92: istore_2
    //   93: iload_2
    //   94: iflt -> 109
    //   97: aload_0
    //   98: iload_2
    //   99: iload_1
    //   100: iadd
    //   101: iconst_1
    //   102: iadd
    //   103: invokevirtual L0 : (I)V
    //   106: goto -> 122
    //   109: aload_0
    //   110: invokevirtual e : ()Z
    //   113: pop
    //   114: goto -> 122
    //   117: aload_0
    //   118: iload_2
    //   119: invokevirtual L0 : (I)V
    //   122: aload_0
    //   123: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   126: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   129: aload #6
    //   131: invokevirtual s0 : (Landroid/os/Parcelable;)V
    //   134: aload_0
    //   135: getfield B0 : Lm90;
    //   138: astore #6
    //   140: aload #6
    //   142: invokevirtual g : ()V
    //   145: aload #6
    //   147: invokevirtual l : ()V
    //   150: aload_0
    //   151: getfield D0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   154: aload_0
    //   155: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   158: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   161: aload #4
    //   163: ifnull -> 238
    //   166: aload_0
    //   167: getfield C0 : Z
    //   170: ifeq -> 190
    //   173: aload_0
    //   174: getfield A0 : Lrn1;
    //   177: getfield d : Ljava/util/ArrayList;
    //   180: aload #4
    //   182: invokestatic p : (Ljava/util/ArrayList;Lkm0;)Ljava/lang/Object;
    //   185: checkcast km0
    //   188: astore #5
    //   190: aload #5
    //   192: ifnull -> 226
    //   195: aload_0
    //   196: aload #5
    //   198: putfield I0 : Lkm0;
    //   201: new java/util/ArrayList
    //   204: dup
    //   205: iconst_1
    //   206: invokespecial <init> : (I)V
    //   209: astore #4
    //   211: aload_0
    //   212: aload #4
    //   214: putfield J0 : Ljava/util/ArrayList;
    //   217: aload #4
    //   219: aload #5
    //   221: invokevirtual add : (Ljava/lang/Object;)Z
    //   224: pop
    //   225: return
    //   226: aload_0
    //   227: new java/util/ArrayList
    //   230: dup
    //   231: iconst_0
    //   232: invokespecial <init> : (I)V
    //   235: putfield J0 : Ljava/util/ArrayList;
    //   238: return
  }
  
  public final void c0(int paramInt1, int paramInt2, Intent paramIntent) {
    super.c0(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 110 && paramInt2 == -1 && this.C0 && c81.e(this.H0) != -1) {
      Animation animation = AnimationUtils.loadAnimation(P(), 2130772019);
      this.s0.startAnimation(animation);
    } 
  }
  
  public final void d(int paramInt) {
    ArrayList arrayList = new ArrayList(this.A0.d);
    this.J0 = arrayList;
    if (this.A0 != null) {
      MusicService musicService = this.L0.j0;
      if (musicService != null)
        musicService.k(arrayList, paramInt, H0(), true); 
    } 
    B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
  }
  
  public final boolean e() {
    if (this.C0) {
      this.t0.setVisibility(8);
      this.e0.setVisibility(8);
      this.O0.setVisibility(8);
      this.P0.setVisibility(8);
      this.a1 = false;
      this.b1 = false;
      this.k0.setVisibility(0);
      this.g0.setVisibility(0);
      this.D0.setVisibility(0);
      this.D0.setRecyclerView(this.g0);
      this.C0 = false;
      this.b0 = null;
      try {
        MusicActivity musicActivity = this.L0;
        if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
          this.L0.t0.f(this.C0);
          if (this.C0 && this.a0 >= i1) {
            this.L0.t0.j = 2;
          } else {
            this.L0.t0.j = 0;
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      this.S0.g();
      return true;
    } 
    return false;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.L0 = (MusicActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 2131492996
    //   4: aload_2
    //   5: iconst_0
    //   6: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   9: astore_1
    //   10: aload_0
    //   11: aload_1
    //   12: ldc_w 2131297419
    //   15: invokevirtual findViewById : (I)Landroid/view/View;
    //   18: checkcast androidx/recyclerview/widget/RecyclerView
    //   21: putfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   24: aload_0
    //   25: aload_1
    //   26: ldc_w 2131297418
    //   29: invokevirtual findViewById : (I)Landroid/view/View;
    //   32: checkcast androidx/recyclerview/widget/RecyclerView
    //   35: putfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   38: aload_0
    //   39: aload_1
    //   40: ldc_w 2131297864
    //   43: invokevirtual findViewById : (I)Landroid/view/View;
    //   46: checkcast android/widget/TextView
    //   49: putfield e0 : Landroid/widget/TextView;
    //   52: aload_1
    //   53: ldc_w 2131297928
    //   56: invokevirtual findViewById : (I)Landroid/view/View;
    //   59: new wg
    //   62: dup
    //   63: iconst_0
    //   64: iconst_1
    //   65: invokespecial <init> : (II)V
    //   68: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   71: aload_1
    //   72: ldc_w 2131296589
    //   75: invokevirtual findViewById : (I)Landroid/view/View;
    //   78: new wg
    //   81: dup
    //   82: iconst_0
    //   83: iconst_0
    //   84: invokespecial <init> : (II)V
    //   87: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   90: aload_0
    //   91: aload_1
    //   92: ldc_w 2131297863
    //   95: invokevirtual findViewById : (I)Landroid/view/View;
    //   98: checkcast android/widget/TextView
    //   101: putfield f0 : Landroid/widget/TextView;
    //   104: aload_0
    //   105: aload_1
    //   106: ldc_w 2131296846
    //   109: invokevirtual findViewById : (I)Landroid/view/View;
    //   112: checkcast android/widget/ImageView
    //   115: putfield p0 : Landroid/widget/ImageView;
    //   118: aload_0
    //   119: aload_1
    //   120: ldc_w 2131296910
    //   123: invokevirtual findViewById : (I)Landroid/view/View;
    //   126: checkcast android/widget/ImageView
    //   129: putfield q0 : Landroid/widget/ImageView;
    //   132: aload_1
    //   133: ldc_w 2131296579
    //   136: invokevirtual findViewById : (I)Landroid/view/View;
    //   139: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout
    //   142: astore_2
    //   143: aload_0
    //   144: aload_2
    //   145: putfield t0 : Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    //   148: aload_2
    //   149: ldc_w 2131296354
    //   152: invokevirtual findViewById : (I)Landroid/view/View;
    //   155: checkcast com/google/android/material/appbar/AppBarLayout
    //   158: astore_2
    //   159: aload_0
    //   160: aload_2
    //   161: putfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   164: aload_2
    //   165: ldc_w 2131296589
    //   168: invokevirtual findViewById : (I)Landroid/view/View;
    //   171: checkcast androidx/constraintlayout/widget/ConstraintLayout
    //   174: astore_2
    //   175: ldc_w 2131296459
    //   178: istore #4
    //   180: aload_2
    //   181: ldc_w 2131296459
    //   184: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   187: checkcast androidx/constraintlayout/widget/Barrier
    //   190: ifnull -> 1400
    //   193: ldc_w 2131296836
    //   196: istore #4
    //   198: aload_2
    //   199: ldc_w 2131296836
    //   202: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   205: checkcast in/krosbits/android/widgets/SmartImageView
    //   208: ifnull -> 1400
    //   211: aload_2
    //   212: ldc_w 2131296911
    //   215: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   218: checkcast in/krosbits/android/widgets/SmartImageView
    //   221: ifnull -> 1395
    //   224: aload_2
    //   225: ldc_w 2131297427
    //   228: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   231: checkcast androidx/recyclerview/widget/RecyclerView
    //   234: ifnull -> 1387
    //   237: aload_2
    //   238: ldc_w 2131297690
    //   241: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   244: checkcast in/krosbits/android/widgets/SmartTextView
    //   247: ifnull -> 1379
    //   250: aload_2
    //   251: ldc_w 2131297740
    //   254: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   257: checkcast in/krosbits/android/widgets/SmartTextView
    //   260: ifnull -> 1371
    //   263: aload_2
    //   264: ldc_w 2131297796
    //   267: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   270: checkcast in/krosbits/android/widgets/SmartTextView
    //   273: ifnull -> 1363
    //   276: aload_2
    //   277: ldc_w 2131297811
    //   280: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   283: checkcast in/krosbits/android/widgets/SmartTextView
    //   286: ifnull -> 1355
    //   289: ldc_w 2131297819
    //   292: istore #4
    //   294: aload_2
    //   295: ldc_w 2131297819
    //   298: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   301: checkcast com/google/android/material/button/MaterialButton
    //   304: astore_3
    //   305: aload_3
    //   306: ifnull -> 1352
    //   309: ldc_w 2131297869
    //   312: istore #4
    //   314: aload_2
    //   315: ldc_w 2131297869
    //   318: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   321: checkcast in/krosbits/android/widgets/SmartTextView
    //   324: ifnull -> 1352
    //   327: aload_2
    //   328: ldc_w 2131297879
    //   331: invokestatic C : (Landroid/view/View;I)Landroid/view/View;
    //   334: checkcast in/krosbits/android/widgets/SmartTextView
    //   337: ifnull -> 1344
    //   340: aload_0
    //   341: new sn
    //   344: dup
    //   345: aload_3
    //   346: invokespecial <init> : (Lcom/google/android/material/button/MaterialButton;)V
    //   349: putfield R0 : Lsn;
    //   352: aload_0
    //   353: aload_2
    //   354: ldc_w 2131296836
    //   357: invokevirtual findViewById : (I)Landroid/view/View;
    //   360: checkcast android/widget/ImageView
    //   363: putfield m0 : Landroid/widget/ImageView;
    //   366: aload_0
    //   367: aload_2
    //   368: ldc_w 2131297690
    //   371: invokevirtual findViewById : (I)Landroid/view/View;
    //   374: checkcast android/widget/TextView
    //   377: putfield w0 : Landroid/widget/TextView;
    //   380: aload_0
    //   381: aload_2
    //   382: ldc_w 2131296911
    //   385: invokevirtual findViewById : (I)Landroid/view/View;
    //   388: checkcast android/widget/ImageView
    //   391: putfield r0 : Landroid/widget/ImageView;
    //   394: aload_2
    //   395: ldc_w 2131297879
    //   398: invokevirtual findViewById : (I)Landroid/view/View;
    //   401: checkcast android/widget/TextView
    //   404: astore_3
    //   405: aload_2
    //   406: ldc_w 2131297811
    //   409: invokevirtual findViewById : (I)Landroid/view/View;
    //   412: checkcast android/widget/TextView
    //   415: astore_3
    //   416: aload_2
    //   417: ldc_w 2131297869
    //   420: invokevirtual findViewById : (I)Landroid/view/View;
    //   423: checkcast android/widget/TextView
    //   426: astore_3
    //   427: aload_0
    //   428: aload_2
    //   429: ldc_w 2131297427
    //   432: invokevirtual findViewById : (I)Landroid/view/View;
    //   435: checkcast androidx/recyclerview/widget/RecyclerView
    //   438: putfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   441: aload_0
    //   442: aload_2
    //   443: ldc_w 2131297796
    //   446: invokevirtual findViewById : (I)Landroid/view/View;
    //   449: checkcast android/widget/TextView
    //   452: putfield x0 : Landroid/widget/TextView;
    //   455: aload_0
    //   456: aload_2
    //   457: ldc_w 2131297740
    //   460: invokevirtual findViewById : (I)Landroid/view/View;
    //   463: checkcast android/widget/TextView
    //   466: putfield y0 : Landroid/widget/TextView;
    //   469: aload_0
    //   470: aload_1
    //   471: ldc_w 2131297386
    //   474: invokevirtual findViewById : (I)Landroid/view/View;
    //   477: checkcast android/view/ViewGroup
    //   480: putfield j0 : Landroid/view/ViewGroup;
    //   483: aload_1
    //   484: ldc_w 2131297049
    //   487: invokevirtual findViewById : (I)Landroid/view/View;
    //   490: checkcast android/view/ViewGroup
    //   493: astore_2
    //   494: aload_0
    //   495: aload_2
    //   496: putfield k0 : Landroid/view/ViewGroup;
    //   499: aload_2
    //   500: new wg
    //   503: dup
    //   504: iconst_0
    //   505: iconst_1
    //   506: invokespecial <init> : (II)V
    //   509: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   512: aload_0
    //   513: aload_0
    //   514: getfield j0 : Landroid/view/ViewGroup;
    //   517: ldc_w 2131296835
    //   520: invokevirtual findViewById : (I)Landroid/view/View;
    //   523: checkcast android/widget/ImageView
    //   526: putfield l0 : Landroid/widget/ImageView;
    //   529: aload_0
    //   530: aload_0
    //   531: getfield j0 : Landroid/view/ViewGroup;
    //   534: ldc_w 2131297826
    //   537: invokevirtual findViewById : (I)Landroid/view/View;
    //   540: checkcast android/widget/TextView
    //   543: putfield v0 : Landroid/widget/TextView;
    //   546: aload_0
    //   547: aload_0
    //   548: getfield j0 : Landroid/view/ViewGroup;
    //   551: ldc_w 2131296906
    //   554: invokevirtual findViewById : (I)Landroid/view/View;
    //   557: checkcast android/widget/ImageView
    //   560: putfield n0 : Landroid/widget/ImageView;
    //   563: aload_0
    //   564: aload_0
    //   565: getfield j0 : Landroid/view/ViewGroup;
    //   568: ldc_w 2131296876
    //   571: invokevirtual findViewById : (I)Landroid/view/View;
    //   574: checkcast android/widget/ImageView
    //   577: putfield o0 : Landroid/widget/ImageView;
    //   580: aload_0
    //   581: aload_0
    //   582: getfield j0 : Landroid/view/ViewGroup;
    //   585: ldc_w 2131296907
    //   588: invokevirtual findViewById : (I)Landroid/view/View;
    //   591: checkcast in/krosbits/android/widgets/SmartImageView
    //   594: putfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   597: aload_0
    //   598: aload_0
    //   599: getfield j0 : Landroid/view/ViewGroup;
    //   602: ldc_w 2131297742
    //   605: invokevirtual findViewById : (I)Landroid/view/View;
    //   608: checkcast android/widget/TextView
    //   611: putfield z0 : Landroid/widget/TextView;
    //   614: aload_0
    //   615: aload_1
    //   616: ldc_w 2131297398
    //   619: invokevirtual findViewById : (I)Landroid/view/View;
    //   622: checkcast in/krosbits/android/widgets/RecyclerViewScrollBar
    //   625: putfield D0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   628: aload_0
    //   629: aload_1
    //   630: ldc_w 2131297397
    //   633: invokevirtual findViewById : (I)Landroid/view/View;
    //   636: checkcast in/krosbits/android/widgets/RecyclerViewScrollBar
    //   639: putfield E0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   642: aload_0
    //   643: aload_1
    //   644: ldc_w 2131296411
    //   647: invokevirtual findViewById : (I)Landroid/view/View;
    //   650: checkcast com/google/android/material/button/MaterialButton
    //   653: putfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   656: aload_0
    //   657: aload_1
    //   658: ldc_w 2131296412
    //   661: invokevirtual findViewById : (I)Landroid/view/View;
    //   664: checkcast com/google/android/material/button/MaterialButton
    //   667: putfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   670: aload_0
    //   671: getfield e0 : Landroid/widget/TextView;
    //   674: aload_0
    //   675: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   678: aload_0
    //   679: getfield O0 : Lcom/google/android/material/button/MaterialButton;
    //   682: aload_0
    //   683: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   686: aload_0
    //   687: getfield P0 : Lcom/google/android/material/button/MaterialButton;
    //   690: aload_0
    //   691: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   694: aload_0
    //   695: getfield f0 : Landroid/widget/TextView;
    //   698: aload_0
    //   699: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   702: aload_0
    //   703: getfield l0 : Landroid/widget/ImageView;
    //   706: aload_0
    //   707: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   710: aload_0
    //   711: getfield m0 : Landroid/widget/ImageView;
    //   714: aload_0
    //   715: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   718: aload_0
    //   719: getfield n0 : Landroid/widget/ImageView;
    //   722: aload_0
    //   723: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   726: aload_0
    //   727: getfield o0 : Landroid/widget/ImageView;
    //   730: aload_0
    //   731: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   734: aload_0
    //   735: getfield s0 : Lin/krosbits/android/widgets/SmartImageView;
    //   738: aload_0
    //   739: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   742: aload_0
    //   743: getfield z0 : Landroid/widget/TextView;
    //   746: aload_0
    //   747: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   750: aload_0
    //   751: getfield p0 : Landroid/widget/ImageView;
    //   754: aload_0
    //   755: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   758: aload_0
    //   759: getfield q0 : Landroid/widget/ImageView;
    //   762: aload_0
    //   763: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   766: aload_0
    //   767: getfield r0 : Landroid/widget/ImageView;
    //   770: aload_0
    //   771: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   774: aload_0
    //   775: getfield w0 : Landroid/widget/TextView;
    //   778: aload_0
    //   779: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   782: aload_0
    //   783: getfield v0 : Landroid/widget/TextView;
    //   786: aload_0
    //   787: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   790: aload_0
    //   791: getfield r0 : Landroid/widget/ImageView;
    //   794: aload_0
    //   795: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   798: aload_0
    //   799: getfield n0 : Landroid/widget/ImageView;
    //   802: aload_0
    //   803: invokevirtual setOnLongClickListener : (Landroid/view/View$OnLongClickListener;)V
    //   806: aload_0
    //   807: getfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   810: aload_0
    //   811: invokevirtual a : (Lu5;)V
    //   814: aload_0
    //   815: getfield R0 : Lsn;
    //   818: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   821: aload_0
    //   822: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   825: aload_0
    //   826: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   829: iconst_1
    //   830: invokevirtual setHasFixedSize : (Z)V
    //   833: aload_0
    //   834: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   837: iconst_1
    //   838: invokevirtual setHasFixedSize : (Z)V
    //   841: aload_0
    //   842: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   845: iconst_1
    //   846: invokevirtual setHasFixedSize : (Z)V
    //   849: aload_0
    //   850: invokestatic o : ()Landroid/content/SharedPreferences;
    //   853: ldc_w 'k_b_mmpsb'
    //   856: iconst_1
    //   857: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   862: putfield Q0 : Z
    //   865: invokestatic o : ()Landroid/content/SharedPreferences;
    //   868: astore_3
    //   869: aload_0
    //   870: getfield X0 : [I
    //   873: astore_2
    //   874: aload_0
    //   875: aload_3
    //   876: ldc_w 'k_i_lrcascsp'
    //   879: aload_2
    //   880: arraylength
    //   881: invokeinterface getInt : (Ljava/lang/String;I)I
    //   886: putfield T0 : I
    //   889: aload_0
    //   890: invokestatic o : ()Landroid/content/SharedPreferences;
    //   893: ldc_w 'k_i_lrcpscsp'
    //   896: aload_2
    //   897: arraylength
    //   898: invokeinterface getInt : (Ljava/lang/String;I)I
    //   903: putfield U0 : I
    //   906: invokestatic o : ()Landroid/content/SharedPreferences;
    //   909: ldc_w 'k_i_lmopscspsc'
    //   912: ldc_w 'CPCc_A'
    //   915: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   920: astore_3
    //   921: iconst_0
    //   922: istore #4
    //   924: iload #4
    //   926: aload_0
    //   927: invokevirtual E0 : ()[Ljava/lang/String;
    //   930: arraylength
    //   931: if_icmpge -> 957
    //   934: aload_0
    //   935: invokevirtual E0 : ()[Ljava/lang/String;
    //   938: iload #4
    //   940: aaload
    //   941: aload_3
    //   942: invokevirtual equals : (Ljava/lang/Object;)Z
    //   945: ifeq -> 951
    //   948: goto -> 960
    //   951: iinc #4, 1
    //   954: goto -> 924
    //   957: iconst_m1
    //   958: istore #4
    //   960: iload #4
    //   962: istore #5
    //   964: iload #4
    //   966: iconst_m1
    //   967: if_icmpne -> 979
    //   970: aload_0
    //   971: invokevirtual E0 : ()[Ljava/lang/String;
    //   974: arraylength
    //   975: iconst_1
    //   976: isub
    //   977: istore #5
    //   979: aload_0
    //   980: iload #5
    //   982: putfield W0 : I
    //   985: aload_0
    //   986: invokestatic o : ()Landroid/content/SharedPreferences;
    //   989: ldc_w 'k_i_lnvpscsp'
    //   992: aload_2
    //   993: arraylength
    //   994: invokeinterface getInt : (Ljava/lang/String;I)I
    //   999: putfield V0 : I
    //   1002: aload_0
    //   1003: getfield T0 : I
    //   1006: aload_2
    //   1007: arraylength
    //   1008: if_icmple -> 1017
    //   1011: aload_0
    //   1012: aload_2
    //   1013: arraylength
    //   1014: putfield T0 : I
    //   1017: aload_0
    //   1018: getfield T0 : I
    //   1021: ifge -> 1029
    //   1024: aload_0
    //   1025: iconst_0
    //   1026: putfield T0 : I
    //   1029: aload_0
    //   1030: getfield U0 : I
    //   1033: aload_2
    //   1034: arraylength
    //   1035: if_icmple -> 1044
    //   1038: aload_0
    //   1039: aload_2
    //   1040: arraylength
    //   1041: putfield U0 : I
    //   1044: aload_0
    //   1045: getfield U0 : I
    //   1048: ifge -> 1056
    //   1051: aload_0
    //   1052: iconst_0
    //   1053: putfield U0 : I
    //   1056: aload_0
    //   1057: getfield W0 : I
    //   1060: aload_0
    //   1061: invokevirtual E0 : ()[Ljava/lang/String;
    //   1064: arraylength
    //   1065: if_icmplt -> 1079
    //   1068: aload_0
    //   1069: aload_0
    //   1070: invokevirtual E0 : ()[Ljava/lang/String;
    //   1073: arraylength
    //   1074: iconst_1
    //   1075: isub
    //   1076: putfield W0 : I
    //   1079: aload_0
    //   1080: getfield W0 : I
    //   1083: ifge -> 1091
    //   1086: aload_0
    //   1087: iconst_0
    //   1088: putfield W0 : I
    //   1091: aload_0
    //   1092: getfield V0 : I
    //   1095: aload_2
    //   1096: arraylength
    //   1097: if_icmple -> 1106
    //   1100: aload_0
    //   1101: aload_2
    //   1102: arraylength
    //   1103: putfield V0 : I
    //   1106: aload_0
    //   1107: getfield V0 : I
    //   1110: ifge -> 1118
    //   1113: aload_0
    //   1114: iconst_0
    //   1115: putfield V0 : I
    //   1118: aload_0
    //   1119: new m90
    //   1122: dup
    //   1123: aload_0
    //   1124: aload_0
    //   1125: invokespecial <init> : (Lrq1;Lj41;)V
    //   1128: putfield S0 : Lm90;
    //   1131: aload_0
    //   1132: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1135: astore_3
    //   1136: getstatic ag0.a : Ljava/lang/String;
    //   1139: astore_2
    //   1140: aload_3
    //   1141: iconst_0
    //   1142: invokevirtual setWillNotDraw : (Z)V
    //   1145: aload_3
    //   1146: iconst_0
    //   1147: invokevirtual setWillNotCacheDrawing : (Z)V
    //   1150: aload_3
    //   1151: iconst_1
    //   1152: aconst_null
    //   1153: invokevirtual setLayerType : (ILandroid/graphics/Paint;)V
    //   1156: aload_0
    //   1157: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1160: aload_0
    //   1161: getfield S0 : Lm90;
    //   1164: invokevirtual setAdapter : (Lid1;)V
    //   1167: new androidx/recyclerview/widget/LinearLayoutManager
    //   1170: dup
    //   1171: iconst_0
    //   1172: invokespecial <init> : (I)V
    //   1175: astore_2
    //   1176: aload_0
    //   1177: getfield i0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1180: aload_2
    //   1181: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   1184: aload_0
    //   1185: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1188: new androidx/recyclerview/widget/LinearLayoutManager
    //   1191: dup
    //   1192: iconst_1
    //   1193: invokespecial <init> : (I)V
    //   1196: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   1199: aload_0
    //   1200: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1203: new androidx/recyclerview/widget/LinearLayoutManager
    //   1206: dup
    //   1207: iconst_1
    //   1208: invokespecial <init> : (I)V
    //   1211: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   1214: aload_0
    //   1215: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1218: aload_0
    //   1219: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1222: getfield u0 : Lkn1;
    //   1225: invokevirtual h : (Lpd1;)V
    //   1228: aload_0
    //   1229: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1232: aload_0
    //   1233: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1236: getfield u0 : Lkn1;
    //   1239: invokevirtual h : (Lpd1;)V
    //   1242: new m90
    //   1245: dup
    //   1246: aload_0
    //   1247: invokespecial <init> : (Ll81;)V
    //   1250: astore_2
    //   1251: aload_0
    //   1252: aload_2
    //   1253: putfield B0 : Lm90;
    //   1256: aload_2
    //   1257: invokevirtual g : ()V
    //   1260: aload_0
    //   1261: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1264: aload_0
    //   1265: getfield B0 : Lm90;
    //   1268: invokevirtual setAdapter : (Lid1;)V
    //   1271: aload_0
    //   1272: getfield B0 : Lm90;
    //   1275: invokevirtual l : ()V
    //   1278: new rn1
    //   1281: dup
    //   1282: aload_0
    //   1283: invokevirtual P : ()Landroid/content/Context;
    //   1286: new java/util/ArrayList
    //   1289: dup
    //   1290: iconst_0
    //   1291: invokespecial <init> : (I)V
    //   1294: iconst_0
    //   1295: aload_0
    //   1296: invokespecial <init> : (Landroid/content/Context;Ljava/util/ArrayList;ILbj0;)V
    //   1299: astore_2
    //   1300: aload_0
    //   1301: aload_2
    //   1302: putfield A0 : Lrn1;
    //   1305: aload_0
    //   1306: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1309: aload_2
    //   1310: invokevirtual setAdapter : (Lid1;)V
    //   1313: aload_0
    //   1314: getfield D0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   1317: aload_0
    //   1318: getfield g0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1321: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   1324: aload_0
    //   1325: getfield E0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   1328: aload_0
    //   1329: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1332: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   1335: aload_0
    //   1336: getstatic my0.g : J
    //   1339: putfield N0 : J
    //   1342: aload_1
    //   1343: areturn
    //   1344: ldc_w 2131297879
    //   1347: istore #4
    //   1349: goto -> 1400
    //   1352: goto -> 1400
    //   1355: ldc_w 2131297811
    //   1358: istore #4
    //   1360: goto -> 1400
    //   1363: ldc_w 2131297796
    //   1366: istore #4
    //   1368: goto -> 1400
    //   1371: ldc_w 2131297740
    //   1374: istore #4
    //   1376: goto -> 1400
    //   1379: ldc_w 2131297690
    //   1382: istore #4
    //   1384: goto -> 1400
    //   1387: ldc_w 2131297427
    //   1390: istore #4
    //   1392: goto -> 1400
    //   1395: ldc_w 2131296911
    //   1398: istore #4
    //   1400: ldc_w 'Missing required view with ID: '
    //   1403: aload_2
    //   1404: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1407: iload #4
    //   1409: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   1412: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1415: invokestatic h : (Ljava/lang/String;)V
    //   1418: aconst_null
    //   1419: areturn
  }
  
  public final void i() {
    if (this.C0) {
      e();
      return;
    } 
    this.g0.k0(0);
  }
  
  public final int j() {
    if (this.C0) {
      int i = this.a0;
      if (i == 2 || i == 3 || i == 5)
        return (I0()).length; 
      if (i == 4)
        return (E0()).length; 
    } 
    return 0;
  }
  
  public final void j0() {
    this.I = true;
    ss0 ss01 = this.M0;
    if (ss01 != null)
      ss01.dismiss(); 
    this.L0 = null;
    this.h0 = null;
    this.g0 = null;
    this.A0 = null;
  }
  
  public final int n(int paramInt) {
    int i = this.a0;
    return (i == 2 && paramInt == this.T0) ? 0 : ((i == 3 && paramInt == this.U0) ? 0 : ((i == 4 && paramInt == this.W0) ? 0 : ((i == 5 && paramInt == this.V0) ? 0 : 1)));
  }
  
  public final void n0(Bundle paramBundle) {
    paramBundle.putParcelable("rv_playlistsStates", this.g0.getLayoutManager().t0());
    paramBundle.putBoolean("isPlaylistShowing", this.C0);
    if (this.C0) {
      paramBundle.putInt("selectedPosition", this.a0);
      paramBundle.putParcelable("rv_playlistSongsStates", this.h0.getLayoutManager().t0());
    } 
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    int i = Math.abs(paramInt);
    int j = paramAppBarLayout.getTotalScrollRange();
    ViewGroup viewGroup = this.j0;
    if (i - j == 0) {
      viewGroup.setBackground(this.c1);
      this.v0.setVisibility(0);
      this.l0.setVisibility(0);
      this.O0.setVisibility(8);
      this.P0.setVisibility(8);
      return;
    } 
    viewGroup.setBackground((Drawable)this.d1);
    this.v0.setVisibility(4);
    this.l0.setVisibility(4);
    if (this.Q0) {
      float f = 1.0F - Math.abs(paramInt) * 0.8F / paramAppBarLayout.getTotalScrollRange();
      this.O0.setAlpha(f);
      this.P0.setAlpha(f);
      if (this.a1)
        this.O0.setVisibility(0); 
      if (this.b1)
        this.P0.setVisibility(0); 
    } 
  }
  
  public final void o0() {
    this.I = true;
    D0();
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield M0 : Lss0;
    //   4: astore #6
    //   6: aload #6
    //   8: ifnull -> 31
    //   11: aload #6
    //   13: invokevirtual isShowing : ()Z
    //   16: ifeq -> 31
    //   19: aload_0
    //   20: getfield M0 : Lss0;
    //   23: invokevirtual dismiss : ()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield M0 : Lss0;
    //   31: aload_1
    //   32: invokevirtual getId : ()I
    //   35: istore #4
    //   37: iload #4
    //   39: ldc_w 2131296835
    //   42: if_icmpeq -> 3367
    //   45: iload #4
    //   47: ldc_w 2131296836
    //   50: if_icmpne -> 56
    //   53: goto -> 3367
    //   56: iconst_0
    //   57: istore_2
    //   58: iload #4
    //   60: ldc_w 2131296998
    //   63: if_icmpne -> 114
    //   66: aload_0
    //   67: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   70: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   73: aload_0
    //   74: getfield J0 : Ljava/util/ArrayList;
    //   77: iconst_0
    //   78: aload_0
    //   79: invokevirtual H0 : ()Ljava/lang/String;
    //   82: iconst_1
    //   83: invokevirtual k : (Ljava/util/ArrayList;ILjava/lang/String;Z)V
    //   86: aload_0
    //   87: new android/content/Intent
    //   90: dup
    //   91: aload_0
    //   92: invokevirtual P : ()Landroid/content/Context;
    //   95: ldc_w in/krosbits/musicolet/MusicActivity
    //   98: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   101: ldc_w 'jump_key'
    //   104: ldc_w 'jump_player'
    //   107: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   110: invokevirtual B0 : (Landroid/content/Intent;)V
    //   113: return
    //   114: iload #4
    //   116: ldc_w 2131297027
    //   119: if_icmpeq -> 130
    //   122: iload #4
    //   124: ldc_w 2131296906
    //   127: if_icmpne -> 133
    //   130: goto -> 3177
    //   133: getstatic l81.i1 : I
    //   136: istore_3
    //   137: iload #4
    //   139: ldc_w 2131296876
    //   142: if_icmpne -> 488
    //   145: aload_0
    //   146: getfield A0 : Lrn1;
    //   149: astore_1
    //   150: aload_1
    //   151: ifnull -> 3176
    //   154: aload_1
    //   155: getfield d : Ljava/util/ArrayList;
    //   158: astore_1
    //   159: aload_1
    //   160: ifnull -> 3176
    //   163: aload_1
    //   164: invokevirtual size : ()I
    //   167: ifle -> 3176
    //   170: aload_0
    //   171: invokevirtual P : ()Landroid/content/Context;
    //   174: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   177: ldc_w 2131493016
    //   180: aconst_null
    //   181: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   184: astore_1
    //   185: aload_1
    //   186: ldc_w 2131296973
    //   189: invokevirtual findViewById : (I)Landroid/view/View;
    //   192: checkcast android/widget/LinearLayout
    //   195: astore #6
    //   197: aload #6
    //   199: ldc_w 2131296949
    //   202: invokevirtual findViewById : (I)Landroid/view/View;
    //   205: iconst_0
    //   206: invokevirtual setVisibility : (I)V
    //   209: aload #6
    //   211: ldc_w 2131296992
    //   214: invokevirtual findViewById : (I)Landroid/view/View;
    //   217: astore #7
    //   219: invokestatic d : ()Z
    //   222: ifeq -> 231
    //   225: bipush #8
    //   227: istore_2
    //   228: goto -> 233
    //   231: iconst_0
    //   232: istore_2
    //   233: aload #7
    //   235: iload_2
    //   236: invokevirtual setVisibility : (I)V
    //   239: invokestatic U : ()Z
    //   242: ifne -> 258
    //   245: aload #6
    //   247: ldc_w 2131297008
    //   250: invokevirtual findViewById : (I)Landroid/view/View;
    //   253: bipush #8
    //   255: invokevirtual setVisibility : (I)V
    //   258: aload_0
    //   259: getfield a0 : I
    //   262: istore_2
    //   263: iload_2
    //   264: iconst_1
    //   265: if_icmpeq -> 273
    //   268: iload_2
    //   269: iload_3
    //   270: if_icmple -> 321
    //   273: aload #6
    //   275: ldc_w 2131296986
    //   278: invokevirtual findViewById : (I)Landroid/view/View;
    //   281: iconst_0
    //   282: invokevirtual setVisibility : (I)V
    //   285: aload #6
    //   287: ldc_w 2131296979
    //   290: invokevirtual findViewById : (I)Landroid/view/View;
    //   293: iconst_0
    //   294: invokevirtual setVisibility : (I)V
    //   297: aload #6
    //   299: ldc_w 2131296991
    //   302: invokevirtual findViewById : (I)Landroid/view/View;
    //   305: iconst_0
    //   306: invokevirtual setVisibility : (I)V
    //   309: aload #6
    //   311: ldc_w 2131296975
    //   314: invokevirtual findViewById : (I)Landroid/view/View;
    //   317: iconst_0
    //   318: invokevirtual setVisibility : (I)V
    //   321: aload_0
    //   322: getfield a0 : I
    //   325: iload_3
    //   326: if_icmple -> 383
    //   329: aload #6
    //   331: ldc_w 2131296984
    //   334: invokevirtual findViewById : (I)Landroid/view/View;
    //   337: checkcast android/widget/TextView
    //   340: astore #7
    //   342: aload #7
    //   344: ldc_w 2131887176
    //   347: invokevirtual setText : (I)V
    //   350: aload #7
    //   352: iconst_0
    //   353: invokevirtual setVisibility : (I)V
    //   356: aload #6
    //   358: ldc_w 2131297009
    //   361: invokevirtual findViewById : (I)Landroid/view/View;
    //   364: checkcast android/widget/TextView
    //   367: astore #7
    //   369: aload #7
    //   371: ldc_w 2131887169
    //   374: invokevirtual setText : (I)V
    //   377: aload #7
    //   379: iconst_0
    //   380: invokevirtual setVisibility : (I)V
    //   383: aload_0
    //   384: getfield a0 : I
    //   387: iconst_4
    //   388: if_icmpne -> 403
    //   391: aload #6
    //   393: ldc_w 2131296987
    //   396: invokevirtual findViewById : (I)Landroid/view/View;
    //   399: iconst_0
    //   400: invokevirtual setVisibility : (I)V
    //   403: aload #6
    //   405: aload_0
    //   406: getstatic a51.u : Ljava/util/HashMap;
    //   409: invokestatic x0 : (Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;Ljava/util/HashMap;)V
    //   412: new ms0
    //   415: dup
    //   416: aload_0
    //   417: invokevirtual P : ()Landroid/content/Context;
    //   420: invokespecial <init> : (Landroid/content/Context;)V
    //   423: astore #6
    //   425: aload #6
    //   427: aload_0
    //   428: getfield K0 : Ljava/lang/String;
    //   431: putfield f : Ljava/lang/CharSequence;
    //   434: aload #6
    //   436: aload_1
    //   437: iconst_0
    //   438: invokevirtual f : (Landroid/view/View;Z)V
    //   441: aload_0
    //   442: new ss0
    //   445: dup
    //   446: aload #6
    //   448: invokespecial <init> : (Lms0;)V
    //   451: putfield M0 : Lss0;
    //   454: aload_0
    //   455: new java/util/ArrayList
    //   458: dup
    //   459: aload_0
    //   460: getfield A0 : Lrn1;
    //   463: getfield d : Ljava/util/ArrayList;
    //   466: invokespecial <init> : (Ljava/util/Collection;)V
    //   469: putfield J0 : Ljava/util/ArrayList;
    //   472: aload_0
    //   473: aload_0
    //   474: getfield H0 : Ljava/lang/String;
    //   477: putfield K0 : Ljava/lang/String;
    //   480: aload_0
    //   481: getfield M0 : Lss0;
    //   484: invokevirtual show : ()V
    //   487: return
    //   488: iload #4
    //   490: ldc_w 2131296992
    //   493: if_icmpne -> 504
    //   496: aload_0
    //   497: invokevirtual P : ()Landroid/content/Context;
    //   500: invokestatic i : (Landroid/content/Context;)V
    //   503: return
    //   504: iload #4
    //   506: ldc_w 2131297011
    //   509: if_icmpne -> 575
    //   512: aload_0
    //   513: getfield a0 : I
    //   516: iload_3
    //   517: if_icmple -> 3176
    //   520: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   523: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   526: aload_0
    //   527: getfield K0 : Ljava/lang/String;
    //   530: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   533: astore_1
    //   534: aload_1
    //   535: aload_0
    //   536: getfield I0 : Lkm0;
    //   539: invokevirtual f : (Lkm0;)V
    //   542: aload_1
    //   543: invokevirtual d : ()Z
    //   546: ifeq -> 562
    //   549: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   552: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   555: aload_1
    //   556: invokestatic h : (Landroid/content/Context;Lb81;)V
    //   559: goto -> 570
    //   562: aload_0
    //   563: invokevirtual P : ()Landroid/content/Context;
    //   566: aload_1
    //   567: invokestatic k : (Landroid/content/Context;Lb81;)V
    //   570: aload_0
    //   571: invokevirtual N0 : ()V
    //   574: return
    //   575: iload #4
    //   577: ldc_w 2131296999
    //   580: if_icmpne -> 609
    //   583: aload_0
    //   584: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   587: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   590: astore_1
    //   591: aload_1
    //   592: ifnull -> 3176
    //   595: aload_1
    //   596: aload_0
    //   597: getfield I0 : Lkm0;
    //   600: invokevirtual f : (Lkm0;)V
    //   603: aload_0
    //   604: aconst_null
    //   605: putfield I0 : Lkm0;
    //   608: return
    //   609: iload #4
    //   611: ldc_w 2131297000
    //   614: if_icmpne -> 638
    //   617: aload_0
    //   618: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   621: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   624: astore_1
    //   625: aload_1
    //   626: ifnull -> 3176
    //   629: aload_1
    //   630: aload_0
    //   631: getfield J0 : Ljava/util/ArrayList;
    //   634: invokevirtual g : (Ljava/util/ArrayList;)V
    //   637: return
    //   638: iload #4
    //   640: ldc_w 2131296955
    //   643: if_icmpne -> 717
    //   646: aload_0
    //   647: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   650: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   653: ifnull -> 3176
    //   656: aload_0
    //   657: getfield I0 : Lkm0;
    //   660: ifnull -> 3176
    //   663: new java/util/ArrayList
    //   666: dup
    //   667: iconst_1
    //   668: invokespecial <init> : (I)V
    //   671: astore_1
    //   672: aload_1
    //   673: aload_0
    //   674: getfield I0 : Lkm0;
    //   677: invokevirtual add : (Ljava/lang/Object;)Z
    //   680: pop
    //   681: aload_0
    //   682: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   685: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   688: astore #6
    //   690: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   693: istore #5
    //   695: aload #6
    //   697: invokestatic h : ()Lwk1;
    //   700: getfield c : I
    //   703: aload_1
    //   704: invokevirtual j : (ILjava/util/ArrayList;)V
    //   707: aload_1
    //   708: invokevirtual clear : ()V
    //   711: aload_0
    //   712: aconst_null
    //   713: putfield I0 : Lkm0;
    //   716: return
    //   717: iload #4
    //   719: ldc_w 2131296956
    //   722: if_icmpne -> 762
    //   725: aload_0
    //   726: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   729: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   732: astore #6
    //   734: aload #6
    //   736: ifnull -> 3176
    //   739: aload_0
    //   740: getfield J0 : Ljava/util/ArrayList;
    //   743: astore_1
    //   744: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   747: istore #5
    //   749: aload #6
    //   751: invokestatic h : ()Lwk1;
    //   754: getfield c : I
    //   757: aload_1
    //   758: invokevirtual j : (ILjava/util/ArrayList;)V
    //   761: return
    //   762: iload #4
    //   764: ldc_w 2131296953
    //   767: if_icmpne -> 864
    //   770: aload_0
    //   771: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   774: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   777: ifnull -> 3176
    //   780: aload_0
    //   781: getfield I0 : Lkm0;
    //   784: ifnull -> 3176
    //   787: new java/util/ArrayList
    //   790: dup
    //   791: iconst_1
    //   792: invokespecial <init> : (I)V
    //   795: astore #6
    //   797: aload #6
    //   799: aload_0
    //   800: getfield I0 : Lkm0;
    //   803: invokevirtual add : (Ljava/lang/Object;)Z
    //   806: pop
    //   807: aload_0
    //   808: invokevirtual P : ()Landroid/content/Context;
    //   811: astore_1
    //   812: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   815: istore #5
    //   817: new tk
    //   820: dup
    //   821: aload_1
    //   822: invokestatic h : ()Lwk1;
    //   825: getfield b : Ljava/util/Stack;
    //   828: invokestatic h : ()Lwk1;
    //   831: getfield c : I
    //   834: new vn
    //   837: dup
    //   838: bipush #13
    //   840: aload_0
    //   841: aload #6
    //   843: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   846: invokespecial <init> : (Landroid/content/Context;Ljava/util/Stack;ILzy;)V
    //   849: getfield f : Ljava/lang/Object;
    //   852: checkcast ss0
    //   855: invokevirtual show : ()V
    //   858: aload_0
    //   859: aconst_null
    //   860: putfield I0 : Lkm0;
    //   863: return
    //   864: iload #4
    //   866: ldc_w 2131296954
    //   869: if_icmpne -> 930
    //   872: aload_0
    //   873: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   876: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   879: ifnull -> 3176
    //   882: aload_0
    //   883: invokevirtual P : ()Landroid/content/Context;
    //   886: astore_1
    //   887: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   890: istore #5
    //   892: new tk
    //   895: dup
    //   896: aload_1
    //   897: invokestatic h : ()Lwk1;
    //   900: getfield b : Ljava/util/Stack;
    //   903: invokestatic h : ()Lwk1;
    //   906: getfield c : I
    //   909: new g81
    //   912: dup
    //   913: aload_0
    //   914: invokespecial <init> : (Ll81;)V
    //   917: invokespecial <init> : (Landroid/content/Context;Ljava/util/Stack;ILzy;)V
    //   920: getfield f : Ljava/lang/Object;
    //   923: checkcast ss0
    //   926: invokevirtual show : ()V
    //   929: return
    //   930: iload #4
    //   932: ldc_w 2131296979
    //   935: if_icmpeq -> 3154
    //   938: iload #4
    //   940: ldc_w 2131296978
    //   943: if_icmpne -> 949
    //   946: goto -> 3154
    //   949: iload #4
    //   951: ldc_w 2131296991
    //   954: if_icmpne -> 980
    //   957: aload_0
    //   958: getfield J0 : Ljava/util/ArrayList;
    //   961: ifnull -> 3176
    //   964: aload_0
    //   965: invokevirtual P : ()Landroid/content/Context;
    //   968: aload_0
    //   969: getfield J0 : Ljava/util/ArrayList;
    //   972: invokestatic l : (Ljava/util/ArrayList;)[Lkm0;
    //   975: iconst_1
    //   976: invokestatic h0 : (Landroid/content/Context;[Lkm0;Z)V
    //   979: return
    //   980: iload #4
    //   982: ldc_w 2131296975
    //   985: if_icmpne -> 1010
    //   988: aload_0
    //   989: getfield J0 : Ljava/util/ArrayList;
    //   992: ifnull -> 3176
    //   995: aload_0
    //   996: invokevirtual P : ()Landroid/content/Context;
    //   999: aload_0
    //   1000: getfield J0 : Ljava/util/ArrayList;
    //   1003: invokestatic l : (Ljava/util/ArrayList;)[Lkm0;
    //   1006: invokestatic h : (Landroid/content/Context;[Lkm0;)V
    //   1009: return
    //   1010: iload #4
    //   1012: ldc_w 2131297025
    //   1015: if_icmpne -> 1048
    //   1018: aload_0
    //   1019: getfield I0 : Lkm0;
    //   1022: ifnull -> 3176
    //   1025: new java/util/ArrayList
    //   1028: dup
    //   1029: iconst_1
    //   1030: invokespecial <init> : (I)V
    //   1033: astore_1
    //   1034: aload_1
    //   1035: aload_0
    //   1036: getfield I0 : Lkm0;
    //   1039: invokevirtual add : (Ljava/lang/Object;)Z
    //   1042: pop
    //   1043: aload_1
    //   1044: invokestatic D0 : (Ljava/util/ArrayList;)V
    //   1047: return
    //   1048: iload #4
    //   1050: ldc_w 2131297026
    //   1053: if_icmpne -> 1071
    //   1056: aload_0
    //   1057: getfield A0 : Lrn1;
    //   1060: ifnull -> 3176
    //   1063: aload_0
    //   1064: getfield J0 : Ljava/util/ArrayList;
    //   1067: invokestatic D0 : (Ljava/util/ArrayList;)V
    //   1070: return
    //   1071: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.YbuwF : Ljava/lang/String;
    //   1074: astore #6
    //   1076: iload #4
    //   1078: ldc_w 2131296951
    //   1081: if_icmpne -> 1147
    //   1084: aload_0
    //   1085: getfield I0 : Lkm0;
    //   1088: ifnull -> 3176
    //   1091: new java/util/ArrayList
    //   1094: dup
    //   1095: iconst_1
    //   1096: invokespecial <init> : (I)V
    //   1099: astore_1
    //   1100: aload_1
    //   1101: aload_0
    //   1102: getfield I0 : Lkm0;
    //   1105: invokevirtual add : (Ljava/lang/Object;)Z
    //   1108: pop
    //   1109: aload_1
    //   1110: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1113: aload_0
    //   1114: new android/content/Intent
    //   1117: dup
    //   1118: aload_0
    //   1119: invokevirtual P : ()Landroid/content/Context;
    //   1122: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1125: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1128: aload #6
    //   1130: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1133: ldc_w 'E_TL'
    //   1136: aload_0
    //   1137: getfield K0 : Ljava/lang/String;
    //   1140: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1143: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1146: return
    //   1147: iload #4
    //   1149: ldc_w 2131296952
    //   1152: if_icmpne -> 1196
    //   1155: aload_0
    //   1156: getfield J0 : Ljava/util/ArrayList;
    //   1159: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1162: aload_0
    //   1163: new android/content/Intent
    //   1166: dup
    //   1167: aload_0
    //   1168: invokevirtual P : ()Landroid/content/Context;
    //   1171: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1174: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1177: aload #6
    //   1179: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1182: ldc_w 'E_TL'
    //   1185: aload_0
    //   1186: getfield K0 : Ljava/lang/String;
    //   1189: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1192: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1195: return
    //   1196: iload #4
    //   1198: ldc_w 2131297009
    //   1201: if_icmpne -> 1309
    //   1204: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1207: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1210: aload_0
    //   1211: getfield K0 : Ljava/lang/String;
    //   1214: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   1217: astore_1
    //   1218: aload_1
    //   1219: invokevirtual d : ()Z
    //   1222: ifeq -> 1250
    //   1225: aload_0
    //   1226: invokevirtual P : ()Landroid/content/Context;
    //   1229: aload_1
    //   1230: invokestatic h : (Landroid/content/Context;Lb81;)V
    //   1233: aload_0
    //   1234: getfield C0 : Z
    //   1237: ifeq -> 1245
    //   1240: aload_0
    //   1241: invokevirtual e : ()Z
    //   1244: pop
    //   1245: aload_0
    //   1246: invokevirtual N0 : ()V
    //   1249: return
    //   1250: new ms0
    //   1253: dup
    //   1254: aload_0
    //   1255: invokevirtual P : ()Landroid/content/Context;
    //   1258: invokespecial <init> : (Landroid/content/Context;)V
    //   1261: astore #6
    //   1263: aload #6
    //   1265: ldc_w 2131887171
    //   1268: invokevirtual c : (I)V
    //   1271: aload #6
    //   1273: ldc_w 2131887604
    //   1276: invokevirtual n : (I)V
    //   1279: aload #6
    //   1281: ldc_w 2131886989
    //   1284: invokevirtual k : (I)V
    //   1287: aload #6
    //   1289: new h81
    //   1292: dup
    //   1293: aload_0
    //   1294: aload_1
    //   1295: iconst_0
    //   1296: invokespecial <init> : (Ll81;Lb81;I)V
    //   1299: putfield A : Lrs0;
    //   1302: aload #6
    //   1304: invokevirtual p : ()Lss0;
    //   1307: pop
    //   1308: return
    //   1309: iload #4
    //   1311: ldc_w 2131296984
    //   1314: if_icmpne -> 1473
    //   1317: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1320: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1323: aload_0
    //   1324: getfield K0 : Ljava/lang/String;
    //   1327: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   1330: astore_1
    //   1331: aload_0
    //   1332: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1335: astore #8
    //   1337: aload #8
    //   1339: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1342: astore #9
    //   1344: new vm
    //   1347: dup
    //   1348: invokespecial <init> : ()V
    //   1351: astore #6
    //   1353: new ms0
    //   1356: dup
    //   1357: aload #8
    //   1359: invokespecial <init> : (Landroid/content/Context;)V
    //   1362: astore #7
    //   1364: aload #7
    //   1366: ldc_w 2131887100
    //   1369: invokevirtual q : (I)V
    //   1372: aload #7
    //   1374: aload #8
    //   1376: ldc_w 2131887100
    //   1379: invokevirtual getString : (I)Ljava/lang/String;
    //   1382: aconst_null
    //   1383: iconst_0
    //   1384: new xw
    //   1387: dup
    //   1388: aload #8
    //   1390: aload_1
    //   1391: aload #9
    //   1393: iconst_4
    //   1394: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   1397: invokevirtual g : (Ljava/lang/String;Ljava/lang/CharSequence;ZLns0;)V
    //   1400: aload #7
    //   1402: ldc_w 2131887175
    //   1405: invokevirtual n : (I)V
    //   1408: aload #7
    //   1410: ldc_w 2131886278
    //   1413: invokevirtual k : (I)V
    //   1416: aload #7
    //   1418: new x2
    //   1421: dup
    //   1422: aload #6
    //   1424: iconst_4
    //   1425: invokespecial <init> : (Lvm;I)V
    //   1428: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   1431: aload #7
    //   1433: new pf0
    //   1436: dup
    //   1437: aload #6
    //   1439: iconst_2
    //   1440: invokespecial <init> : (Lvm;I)V
    //   1443: putfield X : Landroid/content/DialogInterface$OnCancelListener;
    //   1446: aload #7
    //   1448: invokevirtual p : ()Lss0;
    //   1451: getfield n : Landroid/widget/EditText;
    //   1454: astore #7
    //   1456: aload #6
    //   1458: aload #7
    //   1460: invokevirtual m : (Landroid/widget/EditText;)V
    //   1463: aload #7
    //   1465: aload_1
    //   1466: getfield b : Ljava/lang/String;
    //   1469: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1472: return
    //   1473: iload #4
    //   1475: ldc_w 2131297033
    //   1478: if_icmpne -> 1501
    //   1481: aload_0
    //   1482: invokevirtual P : ()Landroid/content/Context;
    //   1485: aload_0
    //   1486: getfield I0 : Lkm0;
    //   1489: iconst_0
    //   1490: newarray int
    //   1492: invokestatic F0 : (Landroid/content/Context;Lkm0;[I)V
    //   1495: aload_0
    //   1496: aconst_null
    //   1497: putfield I0 : Lkm0;
    //   1500: return
    //   1501: iload #4
    //   1503: ldc_w 2131297023
    //   1506: if_icmpne -> 1521
    //   1509: aload_0
    //   1510: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1513: aload_0
    //   1514: getfield I0 : Lkm0;
    //   1517: invokestatic v0 : (Landroid/app/Activity;Lkm0;)V
    //   1520: return
    //   1521: iload #4
    //   1523: ldc_w 2131296964
    //   1526: if_icmpne -> 1541
    //   1529: aload_0
    //   1530: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1533: aload_0
    //   1534: getfield I0 : Lkm0;
    //   1537: invokestatic w0 : (Landroid/app/Activity;Lkm0;)V
    //   1540: return
    //   1541: iload #4
    //   1543: ldc_w 2131296907
    //   1546: if_icmpne -> 2211
    //   1549: aload_0
    //   1550: getfield a0 : I
    //   1553: iload_3
    //   1554: if_icmple -> 2189
    //   1557: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1560: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1563: aload_0
    //   1564: getfield K0 : Ljava/lang/String;
    //   1567: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   1570: astore #6
    //   1572: getstatic m92.h : [I
    //   1575: iconst_5
    //   1576: iaload
    //   1577: aload_0
    //   1578: invokevirtual P : ()Landroid/content/Context;
    //   1581: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1584: ldc_w 2131231068
    //   1587: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1590: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   1593: invokestatic C0 : (ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   1596: astore #8
    //   1598: bipush #35
    //   1600: newarray int
    //   1602: astore #7
    //   1604: aload #7
    //   1606: dup
    //   1607: iconst_0
    //   1608: iconst_m1
    //   1609: iastore
    //   1610: dup
    //   1611: iconst_1
    //   1612: iconst_0
    //   1613: iastore
    //   1614: dup
    //   1615: iconst_2
    //   1616: iconst_1
    //   1617: iastore
    //   1618: dup
    //   1619: iconst_3
    //   1620: iconst_2
    //   1621: iastore
    //   1622: dup
    //   1623: iconst_4
    //   1624: iconst_3
    //   1625: iastore
    //   1626: dup
    //   1627: iconst_5
    //   1628: bipush #38
    //   1630: iastore
    //   1631: dup
    //   1632: bipush #6
    //   1634: bipush #39
    //   1636: iastore
    //   1637: dup
    //   1638: bipush #7
    //   1640: bipush #28
    //   1642: iastore
    //   1643: dup
    //   1644: bipush #8
    //   1646: bipush #29
    //   1648: iastore
    //   1649: dup
    //   1650: bipush #9
    //   1652: bipush #30
    //   1654: iastore
    //   1655: dup
    //   1656: bipush #10
    //   1658: bipush #31
    //   1660: iastore
    //   1661: dup
    //   1662: bipush #11
    //   1664: iconst_4
    //   1665: iastore
    //   1666: dup
    //   1667: bipush #12
    //   1669: iconst_5
    //   1670: iastore
    //   1671: dup
    //   1672: bipush #13
    //   1674: bipush #6
    //   1676: iastore
    //   1677: dup
    //   1678: bipush #14
    //   1680: bipush #7
    //   1682: iastore
    //   1683: dup
    //   1684: bipush #15
    //   1686: bipush #8
    //   1688: iastore
    //   1689: dup
    //   1690: bipush #16
    //   1692: bipush #9
    //   1694: iastore
    //   1695: dup
    //   1696: bipush #17
    //   1698: bipush #24
    //   1700: iastore
    //   1701: dup
    //   1702: bipush #18
    //   1704: bipush #25
    //   1706: iastore
    //   1707: dup
    //   1708: bipush #19
    //   1710: bipush #26
    //   1712: iastore
    //   1713: dup
    //   1714: bipush #20
    //   1716: bipush #27
    //   1718: iastore
    //   1719: dup
    //   1720: bipush #21
    //   1722: bipush #12
    //   1724: iastore
    //   1725: dup
    //   1726: bipush #22
    //   1728: bipush #13
    //   1730: iastore
    //   1731: dup
    //   1732: bipush #23
    //   1734: bipush #10
    //   1736: iastore
    //   1737: dup
    //   1738: bipush #24
    //   1740: bipush #11
    //   1742: iastore
    //   1743: dup
    //   1744: bipush #25
    //   1746: bipush #14
    //   1748: iastore
    //   1749: dup
    //   1750: bipush #26
    //   1752: bipush #15
    //   1754: iastore
    //   1755: dup
    //   1756: bipush #27
    //   1758: bipush #16
    //   1760: iastore
    //   1761: dup
    //   1762: bipush #28
    //   1764: bipush #17
    //   1766: iastore
    //   1767: dup
    //   1768: bipush #29
    //   1770: bipush #18
    //   1772: iastore
    //   1773: dup
    //   1774: bipush #30
    //   1776: bipush #19
    //   1778: iastore
    //   1779: dup
    //   1780: bipush #31
    //   1782: bipush #20
    //   1784: iastore
    //   1785: dup
    //   1786: bipush #32
    //   1788: bipush #21
    //   1790: iastore
    //   1791: dup
    //   1792: bipush #33
    //   1794: bipush #22
    //   1796: iastore
    //   1797: dup
    //   1798: bipush #34
    //   1800: bipush #23
    //   1802: iastore
    //   1803: pop
    //   1804: aload #6
    //   1806: getfield b : Ljava/lang/String;
    //   1809: invokestatic e : (Ljava/lang/String;)I
    //   1812: istore_3
    //   1813: iload_2
    //   1814: bipush #35
    //   1816: if_icmpge -> 1836
    //   1819: aload #7
    //   1821: iload_2
    //   1822: iaload
    //   1823: iload_3
    //   1824: if_icmpne -> 1830
    //   1827: goto -> 1838
    //   1830: iinc #2, 1
    //   1833: goto -> 1813
    //   1836: iconst_m1
    //   1837: istore_2
    //   1838: new ms0
    //   1841: dup
    //   1842: aload_0
    //   1843: invokevirtual P : ()Landroid/content/Context;
    //   1846: invokespecial <init> : (Landroid/content/Context;)V
    //   1849: astore_1
    //   1850: aload_1
    //   1851: aload #8
    //   1853: putfield S : Landroid/graphics/drawable/Drawable;
    //   1856: aload_1
    //   1857: ldc_w 2131887437
    //   1860: invokevirtual q : (I)V
    //   1863: aload_1
    //   1864: bipush #35
    //   1866: newarray int
    //   1868: dup
    //   1869: iconst_0
    //   1870: ldc_w 2131886784
    //   1873: iastore
    //   1874: dup
    //   1875: iconst_1
    //   1876: ldc_w 2131887509
    //   1879: iastore
    //   1880: dup
    //   1881: iconst_2
    //   1882: ldc_w 2131887510
    //   1885: iastore
    //   1886: dup
    //   1887: iconst_3
    //   1888: ldc_w 2131886569
    //   1891: iastore
    //   1892: dup
    //   1893: iconst_4
    //   1894: ldc_w 2131886564
    //   1897: iastore
    //   1898: dup
    //   1899: iconst_5
    //   1900: ldc_w 2131886567
    //   1903: iastore
    //   1904: dup
    //   1905: bipush #6
    //   1907: ldc_w 2131886568
    //   1910: iastore
    //   1911: dup
    //   1912: bipush #7
    //   1914: ldc_w 2131886586
    //   1917: iastore
    //   1918: dup
    //   1919: bipush #8
    //   1921: ldc_w 2131886589
    //   1924: iastore
    //   1925: dup
    //   1926: bipush #9
    //   1928: ldc_w 2131886583
    //   1931: iastore
    //   1932: dup
    //   1933: bipush #10
    //   1935: ldc_w 2131886584
    //   1938: iastore
    //   1939: dup
    //   1940: bipush #11
    //   1942: ldc_w 2131886139
    //   1945: iastore
    //   1946: dup
    //   1947: bipush #12
    //   1949: ldc_w 2131886140
    //   1952: iastore
    //   1953: dup
    //   1954: bipush #13
    //   1956: ldc_w 2131886206
    //   1959: iastore
    //   1960: dup
    //   1961: bipush #14
    //   1963: ldc_w 2131886207
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #15
    //   1970: ldc_w 2131886151
    //   1973: iastore
    //   1974: dup
    //   1975: bipush #16
    //   1977: ldc_w 2131886152
    //   1980: iastore
    //   1981: dup
    //   1982: bipush #17
    //   1984: ldc_w 2131886395
    //   1987: iastore
    //   1988: dup
    //   1989: bipush #18
    //   1991: ldc_w 2131886396
    //   1994: iastore
    //   1995: dup
    //   1996: bipush #19
    //   1998: ldc_w 2131886625
    //   2001: iastore
    //   2002: dup
    //   2003: bipush #20
    //   2005: ldc_w 2131886626
    //   2008: iastore
    //   2009: dup
    //   2010: bipush #21
    //   2012: ldc_w 2131887516
    //   2015: iastore
    //   2016: dup
    //   2017: bipush #22
    //   2019: ldc_w 2131887517
    //   2022: iastore
    //   2023: dup
    //   2024: bipush #23
    //   2026: ldc_w 2131886477
    //   2029: iastore
    //   2030: dup
    //   2031: bipush #24
    //   2033: ldc_w 2131886478
    //   2036: iastore
    //   2037: dup
    //   2038: bipush #25
    //   2040: ldc_w 2131887602
    //   2043: iastore
    //   2044: dup
    //   2045: bipush #26
    //   2047: ldc_w 2131887603
    //   2050: iastore
    //   2051: dup
    //   2052: bipush #27
    //   2054: ldc_w 2131886431
    //   2057: iastore
    //   2058: dup
    //   2059: bipush #28
    //   2061: ldc_w 2131886432
    //   2064: iastore
    //   2065: dup
    //   2066: bipush #29
    //   2068: ldc_w 2131886427
    //   2071: iastore
    //   2072: dup
    //   2073: bipush #30
    //   2075: ldc_w 2131886428
    //   2078: iastore
    //   2079: dup
    //   2080: bipush #31
    //   2082: ldc_w 2131886434
    //   2085: iastore
    //   2086: dup
    //   2087: bipush #32
    //   2089: ldc_w 2131886435
    //   2092: iastore
    //   2093: dup
    //   2094: bipush #33
    //   2096: ldc_w 2131886843
    //   2099: iastore
    //   2100: dup
    //   2101: bipush #34
    //   2103: ldc_w 2131886725
    //   2106: iastore
    //   2107: invokestatic R : ([I)Ljava/util/ArrayList;
    //   2110: invokevirtual h : (Ljava/util/Collection;)V
    //   2113: new mg
    //   2116: dup
    //   2117: aload_0
    //   2118: aload #7
    //   2120: aload #6
    //   2122: iload_3
    //   2123: invokespecial <init> : (Ll81;[ILb81;I)V
    //   2126: astore #7
    //   2128: aload_1
    //   2129: iload_2
    //   2130: putfield M : I
    //   2133: aload_1
    //   2134: aconst_null
    //   2135: putfield E : Los0;
    //   2138: aload_1
    //   2139: aload #7
    //   2141: putfield F : Lqs0;
    //   2144: aload_1
    //   2145: aconst_null
    //   2146: putfield G : Lps0;
    //   2149: iload_3
    //   2150: iconst_m1
    //   2151: if_icmpeq -> 2183
    //   2154: aload_1
    //   2155: ldc_w 2131886784
    //   2158: invokevirtual l : (I)V
    //   2161: aload_1
    //   2162: ldc_w 2131886278
    //   2165: invokevirtual k : (I)V
    //   2168: aload_1
    //   2169: new h81
    //   2172: dup
    //   2173: aload_0
    //   2174: aload #6
    //   2176: iconst_1
    //   2177: invokespecial <init> : (Ll81;Lb81;I)V
    //   2180: putfield C : Lrs0;
    //   2183: aload_1
    //   2184: invokevirtual p : ()Lss0;
    //   2187: pop
    //   2188: return
    //   2189: aload_0
    //   2190: invokevirtual P : ()Landroid/content/Context;
    //   2193: ldc_w 'I_K_SRTBYF_PL'
    //   2196: new xt0
    //   2199: dup
    //   2200: bipush #8
    //   2202: aload_0
    //   2203: invokespecial <init> : (ILjava/lang/Object;)V
    //   2206: iconst_0
    //   2207: invokestatic N : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;I)V
    //   2210: return
    //   2211: iload #4
    //   2213: ldc_w 2131297864
    //   2216: if_icmpne -> 2267
    //   2219: aload_0
    //   2220: new ub1
    //   2223: dup
    //   2224: aload_0
    //   2225: invokevirtual P : ()Landroid/content/Context;
    //   2228: aload_0
    //   2229: getfield e0 : Landroid/widget/TextView;
    //   2232: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   2235: invokeinterface toString : ()Ljava/lang/String;
    //   2240: new java/util/ArrayList
    //   2243: dup
    //   2244: aload_0
    //   2245: getfield A0 : Lrn1;
    //   2248: getfield d : Ljava/util/ArrayList;
    //   2251: invokespecial <init> : (Ljava/util/Collection;)V
    //   2254: iconst_1
    //   2255: aload_0
    //   2256: aconst_null
    //   2257: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ILsb1;Ljava/lang/CharSequence;)V
    //   2260: invokevirtual p : ()Lss0;
    //   2263: putfield M0 : Lss0;
    //   2266: return
    //   2267: iload #4
    //   2269: ldc_w 2131297863
    //   2272: if_icmpne -> 2323
    //   2275: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2278: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2281: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   2284: invokestatic S : (Ljava/util/ArrayList;)Ljava/util/ArrayList;
    //   2287: astore_1
    //   2288: aload_0
    //   2289: new ub1
    //   2292: dup
    //   2293: aload_0
    //   2294: invokevirtual P : ()Landroid/content/Context;
    //   2297: aload_0
    //   2298: getfield f0 : Landroid/widget/TextView;
    //   2301: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   2304: invokeinterface toString : ()Ljava/lang/String;
    //   2309: aload_1
    //   2310: iconst_0
    //   2311: aload_0
    //   2312: aconst_null
    //   2313: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ILsb1;Ljava/lang/CharSequence;)V
    //   2316: invokevirtual p : ()Lss0;
    //   2319: putfield M0 : Lss0;
    //   2322: return
    //   2323: iload #4
    //   2325: ldc_w 2131297021
    //   2328: if_icmpne -> 2339
    //   2331: aload_0
    //   2332: getfield J0 : Ljava/util/ArrayList;
    //   2335: invokestatic h : (Ljava/util/List;)V
    //   2338: return
    //   2339: iload #4
    //   2341: ldc_w 2131296980
    //   2344: if_icmpne -> 2355
    //   2347: aload_0
    //   2348: getfield J0 : Ljava/util/ArrayList;
    //   2351: invokestatic b : (Ljava/util/List;)V
    //   2354: return
    //   2355: iload #4
    //   2357: ldc_w 2131297826
    //   2360: if_icmpeq -> 3137
    //   2363: iload #4
    //   2365: ldc_w 2131297690
    //   2368: if_icmpne -> 2374
    //   2371: goto -> 3137
    //   2374: iload #4
    //   2376: ldc_w 2131296949
    //   2379: if_icmpne -> 2446
    //   2382: aload_0
    //   2383: getfield a0 : I
    //   2386: istore_2
    //   2387: iload_2
    //   2388: iload_3
    //   2389: if_icmple -> 2409
    //   2392: aload_0
    //   2393: getfield K0 : Ljava/lang/String;
    //   2396: astore_1
    //   2397: ldc_w 'actshjp_UP_'
    //   2400: astore #6
    //   2402: ldc_w 2131231455
    //   2405: istore_2
    //   2406: goto -> 2429
    //   2409: getstatic l81.e1 : [Ljava/lang/String;
    //   2412: iload_2
    //   2413: aaload
    //   2414: astore_1
    //   2415: getstatic l81.h1 : [I
    //   2418: iload_2
    //   2419: iaload
    //   2420: istore_2
    //   2421: ldc_w 'actshjp_SP_'
    //   2424: astore #6
    //   2426: goto -> 2406
    //   2429: aload_0
    //   2430: invokevirtual P : ()Landroid/content/Context;
    //   2433: aload_0
    //   2434: getfield K0 : Ljava/lang/String;
    //   2437: aload #6
    //   2439: aload_1
    //   2440: iconst_0
    //   2441: iload_2
    //   2442: invokestatic b : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    //   2445: return
    //   2446: iload #4
    //   2448: ldc_w 2131296986
    //   2451: if_icmpne -> 2646
    //   2454: new b81
    //   2457: dup
    //   2458: aload_0
    //   2459: getfield K0 : Ljava/lang/String;
    //   2462: aload_0
    //   2463: getfield J0 : Ljava/util/ArrayList;
    //   2466: invokespecial <init> : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2469: astore_1
    //   2470: aload_0
    //   2471: invokevirtual P : ()Landroid/content/Context;
    //   2474: astore #7
    //   2476: getstatic ag0.a : Ljava/lang/String;
    //   2479: astore #6
    //   2481: aload_1
    //   2482: invokevirtual d : ()Z
    //   2485: ifeq -> 2496
    //   2488: ldc_w 2131887496
    //   2491: iconst_0
    //   2492: invokestatic O0 : (II)V
    //   2495: return
    //   2496: aload_1
    //   2497: getfield b : Ljava/lang/String;
    //   2500: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2503: ifeq -> 2636
    //   2506: new vm
    //   2509: dup
    //   2510: invokespecial <init> : ()V
    //   2513: astore #6
    //   2515: new ms0
    //   2518: dup
    //   2519: aload #7
    //   2521: invokespecial <init> : (Landroid/content/Context;)V
    //   2524: astore #8
    //   2526: aload #8
    //   2528: ldc_w 2131886537
    //   2531: invokevirtual q : (I)V
    //   2534: aload #8
    //   2536: aload #7
    //   2538: ldc_w 2131887100
    //   2541: invokevirtual getString : (I)Ljava/lang/String;
    //   2544: aload_1
    //   2545: getfield b : Ljava/lang/String;
    //   2548: iconst_0
    //   2549: new vn
    //   2552: dup
    //   2553: iconst_4
    //   2554: aload_1
    //   2555: aload #7
    //   2557: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   2560: invokevirtual g : (Ljava/lang/String;Ljava/lang/CharSequence;ZLns0;)V
    //   2563: aload #8
    //   2565: ldc_w 2131887363
    //   2568: invokevirtual n : (I)V
    //   2571: aload #8
    //   2573: ldc_w 2131886278
    //   2576: invokevirtual k : (I)V
    //   2579: aload #8
    //   2581: new x2
    //   2584: dup
    //   2585: aload #6
    //   2587: iconst_3
    //   2588: invokespecial <init> : (Lvm;I)V
    //   2591: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   2594: aload #8
    //   2596: new pf0
    //   2599: dup
    //   2600: aload #6
    //   2602: iconst_0
    //   2603: invokespecial <init> : (Lvm;I)V
    //   2606: putfield X : Landroid/content/DialogInterface$OnCancelListener;
    //   2609: aload #8
    //   2611: invokevirtual p : ()Lss0;
    //   2614: getfield n : Landroid/widget/EditText;
    //   2617: astore #7
    //   2619: aload #6
    //   2621: aload #7
    //   2623: invokevirtual m : (Landroid/widget/EditText;)V
    //   2626: aload #7
    //   2628: aload_1
    //   2629: getfield b : Ljava/lang/String;
    //   2632: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2635: return
    //   2636: aload #7
    //   2638: checkcast pc
    //   2641: aload_1
    //   2642: invokestatic n : (Lpc;Lb81;)V
    //   2645: return
    //   2646: iload #4
    //   2648: ldc_w 2131296958
    //   2651: if_icmpne -> 2671
    //   2654: aload_0
    //   2655: invokevirtual P : ()Landroid/content/Context;
    //   2658: aload_0
    //   2659: getfield J0 : Ljava/util/ArrayList;
    //   2662: aconst_null
    //   2663: iconst_1
    //   2664: aconst_null
    //   2665: iconst_0
    //   2666: aconst_null
    //   2667: invokestatic F0 : (Landroid/content/Context;Ljava/util/ArrayList;Lkm0;ZLww;ZLandroid/content/DialogInterface$OnDismissListener;)V
    //   2670: return
    //   2671: iload #4
    //   2673: ldc_w 2131296983
    //   2676: if_icmpne -> 2705
    //   2679: aload_0
    //   2680: getfield J0 : Ljava/util/ArrayList;
    //   2683: putstatic in/krosbits/musicolet/Tag2Activity.L1 : Ljava/util/ArrayList;
    //   2686: aload_0
    //   2687: new android/content/Intent
    //   2690: dup
    //   2691: aload_0
    //   2692: invokevirtual P : ()Landroid/content/Context;
    //   2695: ldc_w in/krosbits/musicolet/Tag2Activity
    //   2698: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2701: invokevirtual B0 : (Landroid/content/Intent;)V
    //   2704: return
    //   2705: iload #4
    //   2707: ldc_w 2131297823
    //   2710: if_icmpne -> 2733
    //   2713: new p71
    //   2716: dup
    //   2717: aload_0
    //   2718: invokevirtual P : ()Landroid/content/Context;
    //   2721: aload_0
    //   2722: getfield J0 : Ljava/util/ArrayList;
    //   2725: invokespecial <init> : (Landroid/content/Context;Ljava/util/List;)V
    //   2728: invokevirtual p : ()Lss0;
    //   2731: pop
    //   2732: return
    //   2733: iload #4
    //   2735: ldc_w 2131297008
    //   2738: if_icmpne -> 2760
    //   2741: aload_0
    //   2742: invokevirtual M : ()Lx5;
    //   2745: new java/util/HashSet
    //   2748: dup
    //   2749: aload_0
    //   2750: getfield J0 : Ljava/util/ArrayList;
    //   2753: invokespecial <init> : (Ljava/util/Collection;)V
    //   2756: invokestatic n0 : (Landroid/app/Activity;Ljava/util/HashSet;)V
    //   2759: return
    //   2760: iload #4
    //   2762: ldc_w 2131296911
    //   2765: if_icmpne -> 2829
    //   2768: new android/content/Intent
    //   2771: dup
    //   2772: aload_0
    //   2773: invokevirtual P : ()Landroid/content/Context;
    //   2776: ldc_w in/krosbits/musicolet/SettingsActivity
    //   2779: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2782: getstatic org/jaudiotagger/audio/Hy/PwbbJfsdcHrAjW.sPrvyPr : Ljava/lang/String;
    //   2785: iconst_1
    //   2786: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   2789: ldc_w 'jmparg'
    //   2792: ldc_w 'playlists'
    //   2795: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   2798: astore_1
    //   2799: aload_0
    //   2800: getfield C0 : Z
    //   2803: ifeq -> 2823
    //   2806: aload_0
    //   2807: getfield a0 : I
    //   2810: iconst_4
    //   2811: if_icmpne -> 2823
    //   2814: aload_1
    //   2815: ldc_w 'e_b_imppls'
    //   2818: iconst_1
    //   2819: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   2822: pop
    //   2823: aload_0
    //   2824: aload_1
    //   2825: invokevirtual B0 : (Landroid/content/Intent;)V
    //   2828: return
    //   2829: iload #4
    //   2831: ldc_w 2131297001
    //   2834: if_icmpne -> 2880
    //   2837: aload_0
    //   2838: getfield I0 : Lkm0;
    //   2841: getfield c : Lqn1;
    //   2844: invokevirtual a : ()Landroid/net/Uri;
    //   2847: astore_1
    //   2848: aload_0
    //   2849: new android/content/Intent
    //   2852: dup
    //   2853: aload_0
    //   2854: invokevirtual P : ()Landroid/content/Context;
    //   2857: ldc_w in/krosbits/musicolet/MiniPlayerActivity
    //   2860: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2863: ldc_w 'pr'
    //   2866: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   2869: ldc_w 'data'
    //   2872: aload_1
    //   2873: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   2876: invokevirtual B0 : (Landroid/content/Intent;)V
    //   2879: return
    //   2880: iload #4
    //   2882: ldc_w 2131296985
    //   2885: if_icmpeq -> 3088
    //   2888: iload #4
    //   2890: ldc_w 2131297742
    //   2893: if_icmpne -> 2899
    //   2896: goto -> 3088
    //   2899: iload #4
    //   2901: ldc_w 2131296411
    //   2904: if_icmpeq -> 2915
    //   2907: iload #4
    //   2909: ldc_w 2131296412
    //   2912: if_icmpne -> 2918
    //   2915: goto -> 3061
    //   2918: aload_1
    //   2919: aload_0
    //   2920: getfield R0 : Lsn;
    //   2923: getfield a : Lcom/google/android/material/button/MaterialButton;
    //   2926: if_acmpne -> 3017
    //   2929: aload_0
    //   2930: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   2933: astore #6
    //   2935: aload #6
    //   2937: ifnull -> 3176
    //   2940: aload_0
    //   2941: getfield C0 : Z
    //   2944: ifeq -> 3176
    //   2947: aload_0
    //   2948: getfield a0 : I
    //   2951: iconst_4
    //   2952: if_icmpne -> 3176
    //   2955: aload_0
    //   2956: getfield b0 : Ljava/lang/String;
    //   2959: astore_1
    //   2960: aload_1
    //   2961: ifnull -> 3176
    //   2964: new ms0
    //   2967: dup
    //   2968: aload #6
    //   2970: invokespecial <init> : (Landroid/content/Context;)V
    //   2973: astore #7
    //   2975: aload #7
    //   2977: iconst_0
    //   2978: iconst_1
    //   2979: invokevirtual o : (IZ)V
    //   2982: aload #7
    //   2984: ldc_w 2131887105
    //   2987: invokevirtual c : (I)V
    //   2990: new java/lang/Thread
    //   2993: dup
    //   2994: new ww
    //   2997: dup
    //   2998: aload_1
    //   2999: aload #6
    //   3001: aload #7
    //   3003: invokevirtual p : ()Lss0;
    //   3006: iconst_3
    //   3007: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   3010: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   3013: invokevirtual start : ()V
    //   3016: return
    //   3017: iload #4
    //   3019: ldc_w 2131296987
    //   3022: if_icmpne -> 3176
    //   3025: aload_0
    //   3026: new android/content/Intent
    //   3029: dup
    //   3030: aload_0
    //   3031: invokevirtual M : ()Lx5;
    //   3034: ldc_w in/krosbits/musicolet/EPCsCSVActivity
    //   3037: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3040: ldc_w 'pcs'
    //   3043: aload_0
    //   3044: getfield b0 : Ljava/lang/String;
    //   3047: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   3050: ldc_w 'edt'
    //   3053: iconst_0
    //   3054: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   3057: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3060: return
    //   3061: aload_1
    //   3062: invokevirtual getTag : ()Ljava/lang/Object;
    //   3065: astore_1
    //   3066: aload_1
    //   3067: instanceof java/lang/String
    //   3070: ifeq -> 3176
    //   3073: aload_1
    //   3074: checkcast java/lang/String
    //   3077: astore_1
    //   3078: aload_0
    //   3079: invokevirtual P : ()Landroid/content/Context;
    //   3082: aload_1
    //   3083: aconst_null
    //   3084: invokestatic R : (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    //   3087: return
    //   3088: new android/content/Intent
    //   3091: dup
    //   3092: aload_0
    //   3093: invokevirtual P : ()Landroid/content/Context;
    //   3096: ldc_w in/krosbits/musicolet/PlaylistEditActivity
    //   3099: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3102: ldc_w 'ex_pl'
    //   3105: aload_0
    //   3106: getfield K0 : Ljava/lang/String;
    //   3109: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   3112: astore_1
    //   3113: aload_0
    //   3114: getfield C0 : Z
    //   3117: ifeq -> 3131
    //   3120: aload_0
    //   3121: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   3124: aload_1
    //   3125: bipush #110
    //   3127: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   3130: return
    //   3131: aload_0
    //   3132: aload_1
    //   3133: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3136: return
    //   3137: aload_0
    //   3138: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   3141: iconst_0
    //   3142: invokevirtual k0 : (I)V
    //   3145: aload_0
    //   3146: getfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   3149: iconst_1
    //   3150: invokevirtual setExpanded : (Z)V
    //   3153: return
    //   3154: aload_0
    //   3155: getfield J0 : Ljava/util/ArrayList;
    //   3158: ifnull -> 3176
    //   3161: aload_0
    //   3162: invokevirtual P : ()Landroid/content/Context;
    //   3165: aload_0
    //   3166: getfield J0 : Ljava/util/ArrayList;
    //   3169: invokestatic l : (Ljava/util/ArrayList;)[Lkm0;
    //   3172: iconst_1
    //   3173: invokestatic j : (Landroid/content/Context;[Lkm0;Z)V
    //   3176: return
    //   3177: aload_1
    //   3178: invokevirtual getId : ()I
    //   3181: ldc_w 2131297027
    //   3184: if_icmpne -> 3202
    //   3187: new java/util/ArrayList
    //   3190: dup
    //   3191: aload_0
    //   3192: getfield J0 : Ljava/util/ArrayList;
    //   3195: invokespecial <init> : (Ljava/util/Collection;)V
    //   3198: astore_1
    //   3199: goto -> 3220
    //   3202: new java/util/ArrayList
    //   3205: dup
    //   3206: aload_0
    //   3207: getfield A0 : Lrn1;
    //   3210: getfield d : Ljava/util/ArrayList;
    //   3213: invokespecial <init> : (Ljava/util/Collection;)V
    //   3216: astore_1
    //   3217: goto -> 3199
    //   3220: iconst_m1
    //   3221: aload_1
    //   3222: invokestatic E : (ILjava/util/ArrayList;)V
    //   3225: aload_0
    //   3226: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   3229: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   3232: aload_1
    //   3233: iconst_0
    //   3234: aload_0
    //   3235: invokevirtual H0 : ()Ljava/lang/String;
    //   3238: iconst_1
    //   3239: invokevirtual k : (Ljava/util/ArrayList;ILjava/lang/String;Z)V
    //   3242: aload_0
    //   3243: getfield C0 : Z
    //   3246: ifeq -> 3339
    //   3249: invokestatic x : ()Landroid/content/SharedPreferences;
    //   3252: ldc_w 'lpshbtps'
    //   3255: iconst_0
    //   3256: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   3261: ifne -> 3339
    //   3264: invokestatic x : ()Landroid/content/SharedPreferences;
    //   3267: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   3272: ldc_w 'lpshbtps'
    //   3275: iconst_1
    //   3276: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   3281: invokeinterface apply : ()V
    //   3286: new ms0
    //   3289: dup
    //   3290: aload_0
    //   3291: invokevirtual P : ()Landroid/content/Context;
    //   3294: invokespecial <init> : (Landroid/content/Context;)V
    //   3297: astore_1
    //   3298: aload_1
    //   3299: ldc_w 2131887506
    //   3302: invokevirtual q : (I)V
    //   3305: aload_1
    //   3306: ldc_w 2131886755
    //   3309: invokevirtual c : (I)V
    //   3312: aload_1
    //   3313: new un
    //   3316: dup
    //   3317: bipush #7
    //   3319: aload_0
    //   3320: invokespecial <init> : (ILjava/lang/Object;)V
    //   3323: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   3326: aload_1
    //   3327: ldc_w 2131886639
    //   3330: invokevirtual n : (I)V
    //   3333: aload_1
    //   3334: invokevirtual p : ()Lss0;
    //   3337: pop
    //   3338: return
    //   3339: aload_0
    //   3340: new android/content/Intent
    //   3343: dup
    //   3344: aload_0
    //   3345: invokevirtual P : ()Landroid/content/Context;
    //   3348: ldc_w in/krosbits/musicolet/MusicActivity
    //   3351: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3354: ldc_w 'jump_key'
    //   3357: ldc_w 'jump_player'
    //   3360: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   3363: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3366: return
    //   3367: aload_0
    //   3368: invokevirtual e : ()Z
    //   3371: pop
    //   3372: return
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296906)
      ag0.F0(P(), this.F0, null, true, null, false, null); 
    return true;
  }
  
  public final void p() {
    my0.h(this.A0.d);
  }
  
  public final void r() {
    try {
      MusicActivity musicActivity = this.L0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        this.L0.t0.f(this.C0);
        if (this.C0 && this.a0 >= i1) {
          this.L0.t0.j = 2;
        } else {
          this.L0.t0.j = 0;
        } 
      } 
    } catch (Exception exception) {}
    if (this.N0 == my0.g)
      return; 
    this.A0.l();
    m90 m901 = this.B0;
    m901.g();
    m901.l();
    this.N0 = my0.g;
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null) {
      this.g0.getLayoutManager().s0(paramBundle.getParcelable("rv_playlistsStates"));
      this.D0.setRecyclerView(this.g0);
      if (paramBundle.getBoolean("isPlaylistShowing")) {
        int i = paramBundle.getInt("selectedPosition");
        if (i < this.B0.c()) {
          L0(i);
          this.h0.getLayoutManager().s0(paramBundle.getParcelable("rv_playlistSongsStates"));
        } 
      } 
    } 
  }
  
  public final boolean s(int paramInt) {
    return false;
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmpne -> 109
    //   5: aload_2
    //   6: checkcast km0
    //   9: astore_2
    //   10: aload_0
    //   11: getfield A0 : Lrn1;
    //   14: getfield d : Ljava/util/ArrayList;
    //   17: astore_3
    //   18: iconst_0
    //   19: istore_1
    //   20: iload_1
    //   21: aload_3
    //   22: invokevirtual size : ()I
    //   25: if_icmpge -> 61
    //   28: aload_3
    //   29: iload_1
    //   30: invokevirtual get : (I)Ljava/lang/Object;
    //   33: checkcast km0
    //   36: getfield c : Lqn1;
    //   39: getfield f : Lwo;
    //   42: aload_2
    //   43: getfield c : Lqn1;
    //   46: getfield f : Lwo;
    //   49: if_acmpne -> 55
    //   52: goto -> 63
    //   55: iinc #1, 1
    //   58: goto -> 20
    //   61: iconst_m1
    //   62: istore_1
    //   63: iload_1
    //   64: iflt -> 127
    //   67: aload_0
    //   68: getfield u0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   71: iconst_0
    //   72: invokevirtual setExpanded : (Z)V
    //   75: aload_0
    //   76: getfield h0 : Landroidx/recyclerview/widget/RecyclerView;
    //   79: iload_1
    //   80: invokevirtual k0 : (I)V
    //   83: new android/os/Handler
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: new y2
    //   93: dup
    //   94: iload_1
    //   95: bipush #9
    //   97: aload_0
    //   98: invokespecial <init> : (IILjava/lang/Object;)V
    //   101: ldc2_w 300
    //   104: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   107: pop
    //   108: return
    //   109: iload_1
    //   110: ifne -> 127
    //   113: aload_0
    //   114: aload_2
    //   115: invokeinterface getName : ()Ljava/lang/String;
    //   120: putfield c0 : Ljava/lang/String;
    //   123: aload_0
    //   124: invokevirtual D0 : ()V
    //   127: return
  }
  
  public final void v(int paramInt) {
    if (paramInt >= 0 && this.C0) {
      int i = this.a0;
      if (i == 2) {
        this.T0 = paramInt;
        MyApplication.o().edit().putInt("k_i_lrcascsp", paramInt).apply();
        M0();
        return;
      } 
      if (i == 3) {
        this.U0 = paramInt;
        MyApplication.o().edit().putInt("k_i_lrcpscsp", paramInt).apply();
        M0();
        return;
      } 
      if (i == 4) {
        this.W0 = paramInt;
        MyApplication.o().edit().putString("k_i_lmopscspsc", E0()[paramInt]).apply();
        M0();
        return;
      } 
      if (i == 5) {
        this.V0 = paramInt;
        MyApplication.o().edit().putInt("k_i_lnvpscsp", paramInt).apply();
        M0();
      } 
    } 
  }
  
  public final void w() {
    my0.b(this.A0.d);
  }
  
  public final void x() {
    my0.k(this.A0.d);
  }
  
  public final String z(int paramInt) {
    if (this.C0) {
      int i = this.a0;
      if (i == 2 || i == 3 || i == 5)
        return I0()[paramInt]; 
      if (i == 4)
        return l51.d(E0()[paramInt], true, false, false); 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */