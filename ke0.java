import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class ke0 extends le0 {
  public static final Object c = new Object();
  
  public static final ke0 d = (ke0)new Object();
  
  public static AlertDialog d(Activity paramActivity, int paramInt, jb2 paramjb2, DialogInterface.OnCancelListener paramOnCancelListener) {
    String str2;
    AlertDialog.Builder builder1 = null;
    if (paramInt == 0)
      return null; 
    TypedValue typedValue = new TypedValue();
    paramActivity.getTheme().resolveAttribute(16843529, typedValue, true);
    if ("Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(typedValue.resourceId)))
      builder1 = new AlertDialog.Builder((Context)paramActivity, 5); 
    AlertDialog.Builder builder2 = builder1;
    if (builder1 == null)
      builder2 = new AlertDialog.Builder((Context)paramActivity); 
    builder2.setMessage(xa2.b((Context)paramActivity, paramInt));
    if (paramOnCancelListener != null)
      builder2.setOnCancelListener(paramOnCancelListener); 
    Resources resources = paramActivity.getResources();
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          str2 = resources.getString(17039370);
        } else {
          str2 = str2.getString(2131886376);
        } 
      } else {
        str2 = str2.getString(2131886386);
      } 
    } else {
      str2 = str2.getString(2131886379);
    } 
    if (str2 != null)
      builder2.setPositiveButton(str2, paramjb2); 
    String str1 = xa2.a((Context)paramActivity, paramInt);
    if (str1 != null)
      builder2.setTitle(str1); 
    Log.w("GoogleApiAvailability", ga1.i("Creating dialog for Google Play services availability issue. ConnectionResult=", paramInt), new IllegalArgumentException());
    return builder2.create();
  }
  
  public static void g(Activity paramActivity, AlertDialog paramAlertDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener) {
    lb0 lb0;
    try {
      boolean bool = paramActivity instanceof x5;
      if (bool) {
        lb0 = ((x5)paramActivity).Z();
        zq1 zq1 = new zq1();
        n21.n("Cannot display null dialog", paramAlertDialog);
        paramAlertDialog.setOnCancelListener(null);
        paramAlertDialog.setOnDismissListener(null);
        zq1.q0 = (Dialog)paramAlertDialog;
        if (paramOnCancelListener != null)
          zq1.r0 = paramOnCancelListener; 
        zq1.H0(lb0, paramString);
        return;
      } 
    } catch (NoClassDefFoundError noClassDefFoundError) {}
    FragmentManager fragmentManager = lb0.getFragmentManager();
    DialogFragment dialogFragment = new DialogFragment();
    n21.n("Cannot display null dialog", paramAlertDialog);
    paramAlertDialog.setOnCancelListener(null);
    paramAlertDialog.setOnDismissListener(null);
    ((l50)dialogFragment).b = (Dialog)paramAlertDialog;
    if (paramOnCancelListener != null)
      ((l50)dialogFragment).c = paramOnCancelListener; 
    dialogFragment.show(fragmentManager, paramString);
  }
  
  public final void c(GoogleApiActivity paramGoogleApiActivity1, int paramInt, GoogleApiActivity paramGoogleApiActivity2) {
    AlertDialog alertDialog = d((Activity)paramGoogleApiActivity1, paramInt, new db2(a(paramInt, (Context)paramGoogleApiActivity1, "d"), paramGoogleApiActivity1), (DialogInterface.OnCancelListener)paramGoogleApiActivity2);
    if (alertDialog == null)
      return; 
    g((Activity)paramGoogleApiActivity1, alertDialog, "GooglePlayServicesErrorDialog", (DialogInterface.OnCancelListener)paramGoogleApiActivity2);
  }
  
  public final void e(Activity paramActivity, tm0 paramtm0, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener) {
    AlertDialog alertDialog = d(paramActivity, paramInt, new gb2(a(paramInt, (Context)paramActivity, "d"), paramtm0), paramOnCancelListener);
    if (alertDialog == null)
      return; 
    g(paramActivity, alertDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
  }
  
  public final void f(Context paramContext, int paramInt, PendingIntent paramPendingIntent) {
    // Byte code:
    //   0: ldc 'GoogleApiAvailability'
    //   2: iload_2
    //   3: ldc 'GMS core API Availability. ConnectionResult='
    //   5: ldc ', tag=null'
    //   7: invokestatic i : (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   10: new java/lang/IllegalArgumentException
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   20: pop
    //   21: iload_2
    //   22: bipush #18
    //   24: if_icmpne -> 45
    //   27: new fb2
    //   30: dup
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial <init> : (Lke0;Landroid/content/Context;)V
    //   36: iconst_1
    //   37: ldc2_w 120000
    //   40: invokevirtual sendEmptyMessageDelayed : (IJ)Z
    //   43: pop
    //   44: return
    //   45: aload_3
    //   46: ifnonnull -> 64
    //   49: iload_2
    //   50: bipush #6
    //   52: if_icmpne -> 63
    //   55: ldc 'GoogleApiAvailability'
    //   57: ldc 'Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.'
    //   59: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   62: pop
    //   63: return
    //   64: iload_2
    //   65: bipush #6
    //   67: if_icmpne -> 81
    //   70: aload_1
    //   71: ldc 'common_google_play_services_resolution_required_title'
    //   73: invokestatic e : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   76: astore #9
    //   78: goto -> 88
    //   81: aload_1
    //   82: iload_2
    //   83: invokestatic a : (Landroid/content/Context;I)Ljava/lang/String;
    //   86: astore #9
    //   88: aload #9
    //   90: astore #10
    //   92: aload #9
    //   94: ifnonnull -> 108
    //   97: aload_1
    //   98: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   101: ldc 2131886383
    //   103: invokevirtual getString : (I)Ljava/lang/String;
    //   106: astore #10
    //   108: iload_2
    //   109: bipush #6
    //   111: if_icmpeq -> 133
    //   114: iload_2
    //   115: bipush #19
    //   117: if_icmpne -> 123
    //   120: goto -> 133
    //   123: aload_1
    //   124: iload_2
    //   125: invokestatic b : (Landroid/content/Context;I)Ljava/lang/String;
    //   128: astore #9
    //   130: goto -> 145
    //   133: aload_1
    //   134: ldc 'common_google_play_services_resolution_required_text'
    //   136: aload_1
    //   137: invokestatic c : (Landroid/content/Context;)Ljava/lang/String;
    //   140: invokestatic d : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   143: astore #9
    //   145: aload_1
    //   146: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   149: astore #13
    //   151: aload_1
    //   152: ldc 'notification'
    //   154: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   157: astore #11
    //   159: aload #11
    //   161: invokestatic m : (Ljava/lang/Object;)V
    //   164: aload #11
    //   166: checkcast android/app/NotificationManager
    //   169: astore #11
    //   171: new s21
    //   174: dup
    //   175: aload_1
    //   176: aconst_null
    //   177: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   180: astore #12
    //   182: aload #12
    //   184: iconst_1
    //   185: putfield q : Z
    //   188: aload #12
    //   190: bipush #16
    //   192: iconst_1
    //   193: invokevirtual d : (IZ)V
    //   196: aload #12
    //   198: aload #10
    //   200: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   203: putfield e : Ljava/lang/CharSequence;
    //   206: new java/lang/Object
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: astore #10
    //   215: aload #10
    //   217: aload #9
    //   219: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   222: putfield b : Ljava/lang/CharSequence;
    //   225: aload #12
    //   227: aload #10
    //   229: invokevirtual f : (Lhd;)V
    //   232: aload_1
    //   233: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   236: astore #10
    //   238: getstatic n21.g : Ljava/lang/Boolean;
    //   241: ifnonnull -> 258
    //   244: aload #10
    //   246: ldc_w 'android.hardware.type.watch'
    //   249: invokevirtual hasSystemFeature : (Ljava/lang/String;)Z
    //   252: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   255: putstatic n21.g : Ljava/lang/Boolean;
    //   258: getstatic n21.g : Ljava/lang/Boolean;
    //   261: invokevirtual booleanValue : ()Z
    //   264: istore #6
    //   266: ldc_w 17301642
    //   269: istore #5
    //   271: iload #6
    //   273: ifeq -> 349
    //   276: aload_1
    //   277: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   280: getfield icon : I
    //   283: istore #4
    //   285: iload #4
    //   287: ifne -> 297
    //   290: iload #5
    //   292: istore #4
    //   294: goto -> 297
    //   297: aload #12
    //   299: getfield z : Landroid/app/Notification;
    //   302: iload #4
    //   304: putfield icon : I
    //   307: aload #12
    //   309: iconst_2
    //   310: putfield j : I
    //   313: aload_1
    //   314: invokestatic H : (Landroid/content/Context;)Z
    //   317: ifeq -> 340
    //   320: aload #12
    //   322: ldc_w 2131230996
    //   325: aload #13
    //   327: ldc_w 2131886391
    //   330: invokevirtual getString : (I)Ljava/lang/String;
    //   333: aload_3
    //   334: invokevirtual a : (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   337: goto -> 413
    //   340: aload #12
    //   342: aload_3
    //   343: putfield g : Landroid/app/PendingIntent;
    //   346: goto -> 413
    //   349: aload #12
    //   351: getfield z : Landroid/app/Notification;
    //   354: ldc_w 17301642
    //   357: putfield icon : I
    //   360: aload #13
    //   362: ldc 2131886383
    //   364: invokevirtual getString : (I)Ljava/lang/String;
    //   367: astore #10
    //   369: aload #12
    //   371: getfield z : Landroid/app/Notification;
    //   374: aload #10
    //   376: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   379: putfield tickerText : Ljava/lang/CharSequence;
    //   382: invokestatic currentTimeMillis : ()J
    //   385: lstore #7
    //   387: aload #12
    //   389: getfield z : Landroid/app/Notification;
    //   392: lload #7
    //   394: putfield when : J
    //   397: aload #12
    //   399: aload_3
    //   400: putfield g : Landroid/app/PendingIntent;
    //   403: aload #12
    //   405: aload #9
    //   407: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   410: putfield f : Ljava/lang/CharSequence;
    //   413: invokestatic S : ()Z
    //   416: ifne -> 422
    //   419: goto -> 510
    //   422: invokestatic S : ()Z
    //   425: ifeq -> 562
    //   428: getstatic ke0.c : Ljava/lang/Object;
    //   431: astore_3
    //   432: aload_3
    //   433: monitorenter
    //   434: aload_3
    //   435: monitorexit
    //   436: aload #11
    //   438: ldc_w 'com.google.android.gms.availability'
    //   441: invokevirtual getNotificationChannel : (Ljava/lang/String;)Landroid/app/NotificationChannel;
    //   444: astore_3
    //   445: aload_1
    //   446: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   449: ldc_w 2131886382
    //   452: invokevirtual getString : (I)Ljava/lang/String;
    //   455: astore_1
    //   456: aload_3
    //   457: ifnonnull -> 480
    //   460: aload #11
    //   462: new android/app/NotificationChannel
    //   465: dup
    //   466: ldc_w 'com.google.android.gms.availability'
    //   469: aload_1
    //   470: iconst_4
    //   471: invokespecial <init> : (Ljava/lang/String;Ljava/lang/CharSequence;I)V
    //   474: invokevirtual createNotificationChannel : (Landroid/app/NotificationChannel;)V
    //   477: goto -> 502
    //   480: aload_1
    //   481: aload_3
    //   482: invokevirtual getName : ()Ljava/lang/CharSequence;
    //   485: invokevirtual contentEquals : (Ljava/lang/CharSequence;)Z
    //   488: ifne -> 502
    //   491: aload_3
    //   492: aload_1
    //   493: invokevirtual setName : (Ljava/lang/CharSequence;)V
    //   496: aload #11
    //   498: aload_3
    //   499: invokevirtual createNotificationChannel : (Landroid/app/NotificationChannel;)V
    //   502: aload #12
    //   504: ldc_w 'com.google.android.gms.availability'
    //   507: putfield x : Ljava/lang/String;
    //   510: aload #12
    //   512: invokevirtual b : ()Landroid/app/Notification;
    //   515: astore_1
    //   516: iload_2
    //   517: iconst_1
    //   518: if_icmpeq -> 538
    //   521: iload_2
    //   522: iconst_2
    //   523: if_icmpeq -> 538
    //   526: iload_2
    //   527: iconst_3
    //   528: if_icmpeq -> 538
    //   531: ldc_w 39789
    //   534: istore_2
    //   535: goto -> 549
    //   538: getstatic pe0.a : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   541: iconst_0
    //   542: invokevirtual set : (Z)V
    //   545: sipush #10436
    //   548: istore_2
    //   549: aload #11
    //   551: iload_2
    //   552: aload_1
    //   553: invokevirtual notify : (ILandroid/app/Notification;)V
    //   556: return
    //   557: astore_1
    //   558: aload_3
    //   559: monitorexit
    //   560: aload_1
    //   561: athrow
    //   562: new java/lang/IllegalStateException
    //   565: dup
    //   566: invokespecial <init> : ()V
    //   569: athrow
    // Exception table:
    //   from	to	target	type
    //   434	436	557	finally
    //   558	560	557	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ke0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */