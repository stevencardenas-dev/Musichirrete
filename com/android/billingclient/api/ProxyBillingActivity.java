package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import on2;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import pf;
import ph2;
import qf;
import r3.IKWi.AyxAR;
import xi2;

public class ProxyBillingActivity extends Activity {
  public ResultReceiver b;
  
  public boolean c;
  
  public boolean e;
  
  public int f;
  
  public long g;
  
  public boolean h;
  
  public static int a(Intent paramIntent, int paramInt) {
    return (paramIntent == null) ? ((paramInt != -1) ? ((paramInt != 0) ? ((paramInt != 3) ? ((paramInt != 4) ? 117 : 116) : 115) : 114) : 113) : ((paramIntent.getExtras() == null) ? 22 : ((paramInt == 5) ? 139 : 1));
  }
  
  public final Intent b(int paramInt, long paramLong) {
    Intent intent = c();
    intent.putExtra("RESPONSE_CODE", 6);
    intent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
    pf pf = qf.a();
    pf.a = 6;
    pf.c = "An internal error occurred.";
    qf qf = pf.a();
    int i = xi2.a;
    byte[] arrayOfByte = xi2.b(paramInt, 2, qf, null, on2.c).b();
    intent.putExtra(CKYHNesT.ejuUhsmUxhvO, arrayOfByte);
    intent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
    intent.putExtra(fXMDNeMWaILNVh.UWPpvKCS, paramLong);
    intent.putExtra("wasServiceAutoReconnected", this.h);
    return intent;
  }
  
  public final Intent c() {
    Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
    intent.setPackage(getApplicationContext().getPackageName());
    return intent;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: aload_3
    //   4: invokespecial onActivityResult : (IILandroid/content/Intent;)V
    //   7: iload_1
    //   8: bipush #100
    //   10: if_icmpeq -> 161
    //   13: iload_1
    //   14: bipush #110
    //   16: if_icmpne -> 35
    //   19: aload_3
    //   20: ifnonnull -> 29
    //   23: iconst_0
    //   24: istore #5
    //   26: goto -> 168
    //   29: iconst_1
    //   30: istore #5
    //   32: goto -> 168
    //   35: iload_1
    //   36: bipush #101
    //   38: if_icmpne -> 126
    //   41: aload_3
    //   42: ifnonnull -> 57
    //   45: ldc 'ProxyBillingActivity'
    //   47: ldc 'Got null intent!'
    //   49: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   52: iconst_0
    //   53: istore_1
    //   54: goto -> 91
    //   57: getstatic ph2.a : I
    //   60: istore_1
    //   61: aload_3
    //   62: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   65: astore #8
    //   67: aload #8
    //   69: ifnonnull -> 82
    //   72: ldc 'ProxyBillingActivity'
    //   74: ldc 'Unexpected null bundle received!'
    //   76: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   79: goto -> 52
    //   82: aload #8
    //   84: ldc 'IN_APP_MESSAGE_RESPONSE_CODE'
    //   86: iconst_0
    //   87: invokevirtual getInt : (Ljava/lang/String;I)I
    //   90: istore_1
    //   91: aload_0
    //   92: getfield b : Landroid/os/ResultReceiver;
    //   95: astore #8
    //   97: aload #8
    //   99: ifnull -> 467
    //   102: aload_3
    //   103: ifnonnull -> 111
    //   106: aconst_null
    //   107: astore_3
    //   108: goto -> 116
    //   111: aload_3
    //   112: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   115: astore_3
    //   116: aload #8
    //   118: iload_1
    //   119: aload_3
    //   120: invokevirtual send : (ILandroid/os/Bundle;)V
    //   123: goto -> 467
    //   126: new java/lang/StringBuilder
    //   129: dup
    //   130: ldc 'Got onActivityResult with wrong requestCode: '
    //   132: invokespecial <init> : (Ljava/lang/String;)V
    //   135: astore_3
    //   136: aload_3
    //   137: iload_1
    //   138: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload_3
    //   143: ldc '; skipping...'
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: ldc 'ProxyBillingActivity'
    //   151: aload_3
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   158: goto -> 467
    //   161: aload_3
    //   162: ifnonnull -> 29
    //   165: goto -> 23
    //   168: ldc 'ProxyBillingActivity'
    //   170: aload_3
    //   171: invokestatic e : (Ljava/lang/String;Landroid/content/Intent;)Lqf;
    //   174: getfield a : I
    //   177: istore #7
    //   179: iconst_m1
    //   180: istore #6
    //   182: iload_2
    //   183: istore #4
    //   185: iload_2
    //   186: iconst_m1
    //   187: if_icmpne -> 201
    //   190: iload #6
    //   192: istore_2
    //   193: iload #7
    //   195: ifeq -> 250
    //   198: iconst_m1
    //   199: istore #4
    //   201: new java/lang/StringBuilder
    //   204: dup
    //   205: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.ByyYLdErD : Ljava/lang/String;
    //   208: invokespecial <init> : (Ljava/lang/String;)V
    //   211: astore #8
    //   213: aload #8
    //   215: iload #4
    //   217: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload #8
    //   223: ldc ' and billing's responseCode: '
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #8
    //   231: iload #7
    //   233: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: ldc 'ProxyBillingActivity'
    //   239: aload #8
    //   241: invokevirtual toString : ()Ljava/lang/String;
    //   244: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   247: iload #4
    //   249: istore_2
    //   250: iconst_1
    //   251: iload #5
    //   253: if_icmpeq -> 295
    //   256: new java/lang/StringBuilder
    //   259: dup
    //   260: ldc 'Got null data with resultCode '
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: astore #8
    //   267: aload #8
    //   269: iload_2
    //   270: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: aload #8
    //   276: ldc '!'
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: ldc 'ProxyBillingActivity'
    //   284: aload #8
    //   286: invokevirtual toString : ()Ljava/lang/String;
    //   289: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   292: goto -> 309
    //   295: aload_3
    //   296: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   299: ifnonnull -> 309
    //   302: ldc 'ProxyBillingActivity'
    //   304: ldc 'Got null bundle!'
    //   306: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   309: aload_3
    //   310: iload_2
    //   311: invokestatic a : (Landroid/content/Intent;I)I
    //   314: iconst_1
    //   315: invokestatic c : (II)Z
    //   318: ifne -> 338
    //   321: aload_0
    //   322: aload_3
    //   323: iload_2
    //   324: invokestatic a : (Landroid/content/Intent;I)I
    //   327: aload_0
    //   328: getfield g : J
    //   331: invokevirtual b : (IJ)Landroid/content/Intent;
    //   334: astore_3
    //   335: goto -> 448
    //   338: aload_3
    //   339: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   342: ldc 'ALTERNATIVE_BILLING_USER_CHOICE_DATA'
    //   344: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   347: astore #8
    //   349: aload #8
    //   351: ifnull -> 397
    //   354: new android/content/Intent
    //   357: dup
    //   358: ldc 'com.android.vending.billing.ALTERNATIVE_BILLING'
    //   360: invokespecial <init> : (Ljava/lang/String;)V
    //   363: astore_3
    //   364: aload_3
    //   365: aload_0
    //   366: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   369: invokevirtual getPackageName : ()Ljava/lang/String;
    //   372: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   375: pop
    //   376: aload_3
    //   377: ldc 'ALTERNATIVE_BILLING_USER_CHOICE_DATA'
    //   379: aload #8
    //   381: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   384: pop
    //   385: aload_3
    //   386: ldc 'INTENT_SOURCE'
    //   388: ldc 'LAUNCH_BILLING_FLOW'
    //   390: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   393: pop
    //   394: goto -> 426
    //   397: aload_0
    //   398: invokevirtual c : ()Landroid/content/Intent;
    //   401: astore #8
    //   403: aload #8
    //   405: aload_3
    //   406: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   409: invokevirtual putExtras : (Landroid/os/Bundle;)Landroid/content/Intent;
    //   412: pop
    //   413: aload #8
    //   415: ldc 'INTENT_SOURCE'
    //   417: ldc 'LAUNCH_BILLING_FLOW'
    //   419: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   422: pop
    //   423: aload #8
    //   425: astore_3
    //   426: aload_3
    //   427: ldc 'billingClientTransactionId'
    //   429: aload_0
    //   430: getfield g : J
    //   433: invokevirtual putExtra : (Ljava/lang/String;J)Landroid/content/Intent;
    //   436: pop
    //   437: aload_3
    //   438: ldc 'wasServiceAutoReconnected'
    //   440: aload_0
    //   441: getfield h : Z
    //   444: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   447: pop
    //   448: iload_1
    //   449: bipush #110
    //   451: if_icmpne -> 462
    //   454: aload_3
    //   455: ldc 'IS_FIRST_PARTY_PURCHASE'
    //   457: iconst_1
    //   458: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   461: pop
    //   462: aload_0
    //   463: aload_3
    //   464: invokevirtual sendBroadcast : (Landroid/content/Intent;)V
    //   467: aload_0
    //   468: iconst_0
    //   469: putfield c : Z
    //   472: aload_0
    //   473: invokevirtual finish : ()V
    //   476: return
  }
  
  public final void onCreate(Bundle paramBundle) {
    Intent intent;
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      ph2.g("ProxyBillingActivity", "Launching Play Store billing flow");
      this.f = 100;
      if (getIntent().hasExtra("BUY_INTENT")) {
        PendingIntent pendingIntent2 = (PendingIntent)getIntent().getParcelableExtra("BUY_INTENT");
        PendingIntent pendingIntent1 = pendingIntent2;
        if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT")) {
          pendingIntent1 = pendingIntent2;
          if (getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
            this.e = true;
            this.f = 110;
            pendingIntent1 = pendingIntent2;
          } 
        } 
      } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
        this.b = (ResultReceiver)getIntent().getParcelableExtra("in_app_message_result_receiver");
        this.f = 101;
      } else {
        paramBundle = null;
      } 
      if (getIntent().hasExtra("billingClientTransactionId"))
        this.g = getIntent().getLongExtra("billingClientTransactionId", 0L); 
      if (getIntent().hasExtra("wasServiceAutoReconnected"))
        this.h = getIntent().getBooleanExtra("wasServiceAutoReconnected", false); 
      try {
        this.c = true;
        IntentSender intentSender = paramBundle.getIntentSender();
        int i = this.f;
        intent = new Intent();
        this();
        startIntentSenderForResult(intentSender, i, intent, 0, 0, 0);
        return;
      } catch (android.content.IntentSender.SendIntentException sendIntentException) {
        ph2.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", (Throwable)sendIntentException);
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver != null) {
          resultReceiver.send(0, null);
        } else {
          intent = b(137, this.g);
          if (this.e)
            intent.putExtra(AyxAR.nFtTEkZCBy, true); 
          sendBroadcast(intent);
        } 
        this.c = false;
        finish();
        return;
      } 
    } 
    ph2.g("ProxyBillingActivity", ybWnIKHovcRr.bKcklbiNv);
    this.c = intent.getBoolean(tlzLOCPTHRhep.kfpLOKJFcB, false);
    if (intent.containsKey("in_app_message_result_receiver"))
      this.b = (ResultReceiver)intent.getParcelable("in_app_message_result_receiver"); 
    this.e = intent.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    this.f = intent.getInt("activity_code", 100);
    if (intent.containsKey("billingClientTransactionId"))
      this.g = intent.getLong("billingClientTransactionId"); 
    if (intent.containsKey("wasServiceAutoReconnected"))
      this.h = intent.getBoolean("wasServiceAutoReconnected"); 
  }
  
  public final void onDestroy() {
    super.onDestroy();
    if (isFinishing() && this.c) {
      Intent intent = c();
      intent.putExtra("RESPONSE_CODE", 1);
      intent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
      if (this.e)
        intent.putExtra("IS_FIRST_PARTY_PURCHASE", true); 
      int i = this.f;
      if (i == 110 || i == 100) {
        intent.putExtra("INTENT_SOURCE", kOkiWEITVb.pMo);
        intent.putExtra("billingClientTransactionId", this.g);
      } 
      sendBroadcast(intent);
    } 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    ResultReceiver resultReceiver = this.b;
    if (resultReceiver != null)
      paramBundle.putParcelable("in_app_message_result_receiver", (Parcelable)resultReceiver); 
    paramBundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
    paramBundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.e);
    paramBundle.putInt("activity_code", this.f);
    paramBundle.putLong("billingClientTransactionId", this.g);
    paramBundle.putBoolean("wasServiceAutoReconnected", this.h);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\android\billingclient\api\ProxyBillingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */