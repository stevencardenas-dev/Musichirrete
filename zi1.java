import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public final class zi1 implements View.OnClickListener, DialogInterface.OnDismissListener, View.OnLongClickListener {
  public static zi1 E;
  
  public View[] A;
  
  public boolean B;
  
  public String[] C;
  
  public yi1 D;
  
  public ss0 b;
  
  public ScrollView c;
  
  public ScrollView e;
  
  public TextView f;
  
  public TextView g;
  
  public TextView h;
  
  public TextView i;
  
  public TextView j;
  
  public TextView k;
  
  public TextView l;
  
  public TextView m;
  
  public TextView n;
  
  public TextView o;
  
  public TextView p;
  
  public ImageView q;
  
  public CheckBox r;
  
  public MaterialAutoCompleteTextView s;
  
  public Button t;
  
  public Button u;
  
  public ProgressBar v;
  
  public GhostSearchActivity w;
  
  public Handler x;
  
  public boolean y;
  
  public GhostSearchActivity z;
  
  public static void b() {
    zi1 zi11 = E;
    if (zi11 != null) {
      Handler handler = zi11.x;
      if (handler != null)
        handler.post(zi11.D); 
    } 
  }
  
  public final void a() {
    wp1 wp1 = new wp1();
    ArrayList arrayList = MyApplication.F.k();
    if (!arrayList.isEmpty()) {
      Bundle bundle = new Bundle();
      String[] arrayOfString = new String[arrayList.size()];
      for (byte b = 0; b < arrayList.size(); b++)
        arrayOfString[b] = ((xp1)arrayList.get(b)).e; 
      bundle.putStringArray("arg_reqattu", arrayOfString);
      bundle.putInt("arg_reqattpid", 2131755024);
      wp1.x0(bundle);
    } 
    wp1.N0((pc)this.w);
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getId : ()I
    //   4: istore_2
    //   5: iconst_1
    //   6: istore #4
    //   8: iload_2
    //   9: ldc 2131296903
    //   11: if_icmpne -> 50
    //   14: new android/content/Intent
    //   17: dup
    //   18: aload_0
    //   19: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   22: ldc in/krosbits/musicolet/SettingsActivity
    //   24: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   27: ldc 'jmparg'
    //   29: ldc 'tags'
    //   31: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   34: ldc 'hs'
    //   36: iconst_1
    //   37: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   40: astore_1
    //   41: aload_0
    //   42: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   45: aload_1
    //   46: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   49: return
    //   50: iload_2
    //   51: ldc 2131296435
    //   53: if_icmpne -> 207
    //   56: aload_0
    //   57: getfield C : [Ljava/lang/String;
    //   60: astore #5
    //   62: aload_0
    //   63: getfield s : Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;
    //   66: invokevirtual getText : ()Landroid/text/Editable;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: astore_1
    //   73: getstatic ag0.a : Ljava/lang/String;
    //   76: astore #6
    //   78: aload_1
    //   79: ifnull -> 111
    //   82: iconst_0
    //   83: istore_2
    //   84: iload_2
    //   85: aload #5
    //   87: arraylength
    //   88: if_icmpge -> 111
    //   91: aload_1
    //   92: aload #5
    //   94: iload_2
    //   95: aaload
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: ifeq -> 105
    //   102: goto -> 113
    //   105: iinc #2, 1
    //   108: goto -> 84
    //   111: iconst_m1
    //   112: istore_2
    //   113: aload_0
    //   114: getfield B : Z
    //   117: ifeq -> 135
    //   120: aload_0
    //   121: getfield r : Landroid/widget/CheckBox;
    //   124: invokevirtual isChecked : ()Z
    //   127: ifeq -> 135
    //   130: iconst_1
    //   131: istore_3
    //   132: goto -> 137
    //   135: iconst_0
    //   136: istore_3
    //   137: new im0
    //   140: dup
    //   141: iconst_1
    //   142: iload_3
    //   143: iconst_0
    //   144: invokespecial <init> : (ZZZ)V
    //   147: astore_1
    //   148: aload_1
    //   149: iconst_1
    //   150: putfield K : Z
    //   153: aload_1
    //   154: iconst_1
    //   155: putfield N : Z
    //   158: aload_0
    //   159: getfield B : Z
    //   162: ifeq -> 194
    //   165: iload_2
    //   166: ifne -> 174
    //   169: iconst_0
    //   170: istore_2
    //   171: goto -> 176
    //   174: iconst_1
    //   175: istore_2
    //   176: iload_2
    //   177: iconst_1
    //   178: if_icmpne -> 187
    //   181: iload #4
    //   183: istore_3
    //   184: goto -> 189
    //   187: iconst_0
    //   188: istore_3
    //   189: aload_1
    //   190: iload_3
    //   191: putfield J : Z
    //   194: aload_1
    //   195: invokestatic w : (Lim0;)V
    //   198: aload_0
    //   199: getfield n : Landroid/widget/TextView;
    //   202: iconst_0
    //   203: invokevirtual setEnabled : (Z)V
    //   206: return
    //   207: iload_2
    //   208: ldc 2131296376
    //   210: if_icmpne -> 250
    //   213: getstatic im0.g0 : Lim0;
    //   216: astore_1
    //   217: aload_1
    //   218: ifnull -> 525
    //   221: aload_1
    //   222: getfield E : Z
    //   225: istore_3
    //   226: iload_3
    //   227: ifeq -> 525
    //   230: aload_1
    //   231: getfield F : [Z
    //   234: astore_1
    //   235: aload_1
    //   236: iconst_0
    //   237: baload
    //   238: ifne -> 525
    //   241: iload_3
    //   242: ifeq -> 525
    //   245: aload_1
    //   246: iconst_0
    //   247: iconst_1
    //   248: bastore
    //   249: return
    //   250: iload_2
    //   251: ldc 2131296382
    //   253: if_icmpne -> 332
    //   256: aload_0
    //   257: getfield b : Lss0;
    //   260: ifnull -> 525
    //   263: getstatic im0.g0 : Lim0;
    //   266: astore_1
    //   267: aload_1
    //   268: ifnull -> 324
    //   271: aload_1
    //   272: getfield F : [Z
    //   275: iconst_0
    //   276: baload
    //   277: ifne -> 324
    //   280: aload_0
    //   281: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   284: astore_1
    //   285: aload_1
    //   286: ifnull -> 324
    //   289: getstatic android/os/Build$VERSION.SDK_INT : I
    //   292: bipush #34
    //   294: if_icmplt -> 324
    //   297: invokestatic r : ()Z
    //   300: ifne -> 324
    //   303: aload_1
    //   304: new a2
    //   307: dup
    //   308: aload_1
    //   309: iconst_1
    //   310: invokespecial <init> : (Landroid/app/Activity;I)V
    //   313: aload_1
    //   314: ldc_w 2131887275
    //   317: invokevirtual getString : (I)Ljava/lang/String;
    //   320: invokestatic o : (Lpc;Ljava/lang/Runnable;Ljava/lang/String;)V
    //   323: return
    //   324: aload_0
    //   325: getfield b : Lss0;
    //   328: invokevirtual dismiss : ()V
    //   331: return
    //   332: iload_2
    //   333: ldc_w 2131297683
    //   336: if_icmpne -> 368
    //   339: aload_0
    //   340: aload_0
    //   341: getfield B : Z
    //   344: iconst_1
    //   345: ixor
    //   346: putfield B : Z
    //   349: aload_0
    //   350: getfield x : Landroid/os/Handler;
    //   353: astore_1
    //   354: aload_1
    //   355: ifnull -> 525
    //   358: aload_1
    //   359: aload_0
    //   360: getfield D : Lyi1;
    //   363: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   366: pop
    //   367: return
    //   368: iload_2
    //   369: ldc_w 2131297893
    //   372: if_icmpne -> 445
    //   375: aload_0
    //   376: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   379: new android/content/Intent
    //   382: dup
    //   383: aload_0
    //   384: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   387: ldc_w in/krosbits/musicolet/DbCleanActivity
    //   390: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   393: ldc_w 'EXTTL'
    //   396: aload_0
    //   397: getfield m : Landroid/widget/TextView;
    //   400: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   403: invokeinterface toString : ()Ljava/lang/String;
    //   408: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   411: ldc_w 'EXVISFST'
    //   414: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   417: getfield c : Llm0;
    //   420: getfield C : I
    //   423: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   426: ldc_w 'EXVISFUST'
    //   429: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   432: getfield c : Llm0;
    //   435: getfield B : I
    //   438: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   441: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   444: return
    //   445: iload_2
    //   446: ldc_w 2131297761
    //   449: if_icmpne -> 457
    //   452: aload_0
    //   453: invokevirtual a : ()V
    //   456: return
    //   457: iload_2
    //   458: ldc_w 2131297894
    //   461: if_icmpne -> 480
    //   464: new v50
    //   467: dup
    //   468: aload_0
    //   469: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   472: invokespecial <init> : (Lpc;)V
    //   475: invokevirtual p : ()Lss0;
    //   478: pop
    //   479: return
    //   480: iload_2
    //   481: ldc_w 2131297754
    //   484: if_icmpne -> 496
    //   487: aload_0
    //   488: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   491: iconst_1
    //   492: invokestatic r0 : (Landroid/app/Activity;I)V
    //   495: return
    //   496: iload_2
    //   497: ldc_w 2131297749
    //   500: if_icmpne -> 525
    //   503: aload_0
    //   504: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   507: new android/content/Intent
    //   510: dup
    //   511: aload_0
    //   512: getfield w : Lin/krosbits/musicolet/GhostSearchActivity;
    //   515: ldc_w in/krosbits/musicolet/FolderExcluderActivity
    //   518: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   521: iconst_1
    //   522: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   525: return
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.x.removeCallbacksAndMessages(null);
    if (E == this)
      E = null; 
    this.b = null;
    this.w = null;
    this.D = null;
    GhostSearchActivity ghostSearchActivity = this.z;
    if (ghostSearchActivity != null)
      try {
        ghostSearchActivity.finish();
      } finally {} 
    this.z = null;
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296435 && this.w != null) {
      MyApplication.F = new yp1();
      a();
      Handler handler = this.x;
      if (handler != null)
        handler.post(this.D); 
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */