package in.krosbits.musicolet;

import ad0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ds;
import g92;
import l51;
import m92;
import n21;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;
import pc;
import qv;
import sc;
import ss0;
import um0;
import xs;

public final class EPCsCSVActivity extends pc {
  public String R;
  
  public String S;
  
  public final int T = 1000;
  
  public ss0 U;
  
  public int V;
  
  public String W;
  
  public static final Object l0(EPCsCSVActivity paramEPCsCSVActivity, Uri paramUri, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof s20
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast s20
    //   11: astore #4
    //   13: aload #4
    //   15: getfield k : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield k : I
    //   35: aload #4
    //   37: astore_2
    //   38: goto -> 51
    //   41: new s20
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial <init> : (Lin/krosbits/musicolet/EPCsCSVActivity;Lds;)V
    //   50: astore_2
    //   51: aload_2
    //   52: getfield i : Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_2
    //   58: getfield k : I
    //   61: istore_3
    //   62: getstatic ys.b : Lys;
    //   65: astore #6
    //   67: iload_3
    //   68: ifeq -> 143
    //   71: iload_3
    //   72: iconst_1
    //   73: if_icmpeq -> 124
    //   76: iload_3
    //   77: iconst_2
    //   78: if_icmpeq -> 105
    //   81: iload_3
    //   82: iconst_3
    //   83: if_icmpne -> 98
    //   86: aload #5
    //   88: invokestatic r0 : (Ljava/lang/Object;)V
    //   91: goto -> 390
    //   94: astore_1
    //   95: goto -> 374
    //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   100: invokestatic f : (Ljava/lang/String;)V
    //   103: aconst_null
    //   104: areturn
    //   105: aload_2
    //   106: getfield h : Lme1;
    //   109: astore #4
    //   111: aload_2
    //   112: getfield g : Lke1;
    //   115: astore_1
    //   116: aload #5
    //   118: invokestatic r0 : (Ljava/lang/Object;)V
    //   121: goto -> 295
    //   124: aload_2
    //   125: getfield g : Lke1;
    //   128: astore_1
    //   129: aload_2
    //   130: getfield f : Landroid/net/Uri;
    //   133: astore #4
    //   135: aload #5
    //   137: invokestatic r0 : (Ljava/lang/Object;)V
    //   140: goto -> 218
    //   143: aload #5
    //   145: invokestatic r0 : (Ljava/lang/Object;)V
    //   148: new java/lang/Object
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: astore #5
    //   157: getstatic e00.a : Lyw;
    //   160: astore #4
    //   162: getstatic fr0.a : Lif0;
    //   165: astore #7
    //   167: new cr
    //   170: astore #4
    //   172: aload #4
    //   174: aload_0
    //   175: aconst_null
    //   176: iconst_1
    //   177: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   180: aload_2
    //   181: aload_1
    //   182: putfield f : Landroid/net/Uri;
    //   185: aload_2
    //   186: aload #5
    //   188: putfield g : Lke1;
    //   191: aload_2
    //   192: iconst_1
    //   193: putfield k : I
    //   196: aload #7
    //   198: aload #4
    //   200: aload_2
    //   201: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   204: aload #6
    //   206: if_acmpne -> 212
    //   209: goto -> 355
    //   212: aload_1
    //   213: astore #4
    //   215: aload #5
    //   217: astore_1
    //   218: new me1
    //   221: astore #5
    //   223: aload #5
    //   225: invokespecial <init> : ()V
    //   228: getstatic e00.a : Lyw;
    //   231: astore #8
    //   233: new t20
    //   236: astore #7
    //   238: aload #7
    //   240: aload #5
    //   242: aload #4
    //   244: aload_0
    //   245: aload_1
    //   246: aconst_null
    //   247: invokespecial <init> : (Lme1;Landroid/net/Uri;Lin/krosbits/musicolet/EPCsCSVActivity;Lke1;Lcs;)V
    //   250: aload_2
    //   251: aconst_null
    //   252: putfield f : Landroid/net/Uri;
    //   255: aload_2
    //   256: aload_1
    //   257: putfield g : Lke1;
    //   260: aload_2
    //   261: aload #5
    //   263: putfield h : Lme1;
    //   266: aload_2
    //   267: iconst_2
    //   268: putfield k : I
    //   271: aload #8
    //   273: aload #7
    //   275: aload_2
    //   276: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   279: astore #4
    //   281: aload #4
    //   283: aload #6
    //   285: if_acmpne -> 291
    //   288: goto -> 355
    //   291: aload #5
    //   293: astore #4
    //   295: getstatic e00.a : Lyw;
    //   298: astore #5
    //   300: getstatic fr0.a : Lif0;
    //   303: astore #5
    //   305: new u20
    //   308: astore #7
    //   310: aload #7
    //   312: aload_1
    //   313: aload_0
    //   314: aload #4
    //   316: aconst_null
    //   317: invokespecial <init> : (Lke1;Lin/krosbits/musicolet/EPCsCSVActivity;Lme1;Lcs;)V
    //   320: aload_2
    //   321: aconst_null
    //   322: putfield f : Landroid/net/Uri;
    //   325: aload_2
    //   326: aconst_null
    //   327: putfield g : Lke1;
    //   330: aload_2
    //   331: aconst_null
    //   332: putfield h : Lme1;
    //   335: aload_2
    //   336: iconst_3
    //   337: putfield k : I
    //   340: aload #5
    //   342: aload #7
    //   344: aload_2
    //   345: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   348: astore_1
    //   349: aload_1
    //   350: aload #6
    //   352: if_acmpne -> 390
    //   355: aload #6
    //   357: areturn
    //   358: astore_1
    //   359: goto -> 374
    //   362: astore_1
    //   363: goto -> 374
    //   366: astore_1
    //   367: goto -> 359
    //   370: astore_1
    //   371: goto -> 363
    //   374: aload_1
    //   375: invokevirtual printStackTrace : ()V
    //   378: aload_0
    //   379: invokevirtual finish : ()V
    //   382: goto -> 390
    //   385: astore_0
    //   386: aload_0
    //   387: invokevirtual printStackTrace : ()V
    //   390: getstatic l02.a : Ll02;
    //   393: areturn
    // Exception table:
    //   from	to	target	type
    //   86	91	94	finally
    //   116	121	94	finally
    //   135	140	94	finally
    //   157	167	370	finally
    //   167	209	366	finally
    //   218	238	366	finally
    //   238	281	358	finally
    //   295	305	362	finally
    //   305	349	358	finally
    //   378	382	385	finally
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == this.T && paramInt2 == -1 && paramIntent != null) {
      Uri uri = paramIntent.getData();
      if (uri != null) {
        qv.L((xs)g92.E((um0)this), null, null, (ad0)new sc(this, uri, null, 5), 3);
        return;
      } 
    } 
    finish();
  }
  
  public final void onCreate(Bundle paramBundle) {
    if (!MyApplication.k()) {
      super.onCreate(paramBundle);
      finish();
      return;
    } 
    m92.d(this);
    super.onCreate(paramBundle);
    String str1 = getIntent().getStringExtra("pcs");
    this.R = str1;
    if (str1 == null) {
      n21.v("EPC:oc>npcc");
      finish();
      return;
    } 
    this.V = getIntent().getIntExtra(hrSTyFuSIm.ROptzSEqno, 0);
    str1 = l51.d(this.R, false, true, true);
    this.S = str1;
    if (str1 == null) {
      n21.v("EPC:oc>npcn");
      finish();
      return;
    } 
    String str2 = getString(2131886842);
    if (this.V == 1) {
      str1 = getString(2131886211);
    } else {
      str1 = getString(2131887420);
    } 
    String str3 = this.S;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append(" ");
    stringBuilder.append(str1);
    stringBuilder.append(" • ");
    stringBuilder.append(str3);
    stringBuilder.append(".csv");
    this.W = stringBuilder.toString();
    if (paramBundle == null)
      try {
        Intent intent = new Intent();
        this("android.intent.action.CREATE_DOCUMENT");
        intent.setType("text/csv");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.addFlags(67);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        return;
      } finally {
        paramBundle = null;
        paramBundle.printStackTrace();
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\EPCsCSVActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */