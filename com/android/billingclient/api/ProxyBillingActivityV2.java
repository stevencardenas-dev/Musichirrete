package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import f2;
import g2;
import l2;
import oi0;
import ph2;
import pj2;
import qo;
import z51;

public class ProxyBillingActivityV2 extends qo {
  public l2 A;
  
  public ResultReceiver B;
  
  public ResultReceiver C;
  
  public ResultReceiver D;
  
  public ResultReceiver E;
  
  public l2 x;
  
  public l2 y;
  
  public l2 z;
  
  public final void onCreate(Bundle paramBundle) {
    l2 l21;
    super.onCreate(paramBundle);
    g2 g2 = new g2(2);
    this.x = W((f2)new pj2(this, 0), (z51)g2);
    g2 = new g2(2);
    this.y = W((f2)new pj2(this, 1), (z51)g2);
    g2 = new g2(2);
    this.z = W((f2)new pj2(this, 2), (z51)g2);
    g2 = new g2(2);
    this.A = W((f2)new pj2(this, 3), (z51)g2);
    if (paramBundle == null) {
      ph2.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
      if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        this.B = (ResultReceiver)getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
        l21 = this.x;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        l21.S0((Parcelable)new oi0(intentSender, null, 0, 0));
        return;
      } 
      if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
        this.C = (ResultReceiver)getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
        l21 = this.y;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        l21.S0((Parcelable)new oi0(intentSender, null, 0, 0));
        return;
      } 
      if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("external_offer_flow_pending_intent");
        this.D = (ResultReceiver)getIntent().getParcelableExtra("external_offer_flow_result_receiver");
        l21 = this.z;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        l21.S0((Parcelable)new oi0(intentSender, null, 0, 0));
        return;
      } 
      if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
        PendingIntent pendingIntent = (PendingIntent)getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
        this.E = (ResultReceiver)getIntent().getParcelableExtra("launch_external_link_result_receiver");
        l21 = this.A;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        l21.S0((Parcelable)new oi0(intentSender, null, 0, 0));
        return;
      } 
    } else {
      if (l21.containsKey("alternative_billing_only_dialog_result_receiver"))
        this.B = (ResultReceiver)l21.getParcelable("alternative_billing_only_dialog_result_receiver"); 
      if (l21.containsKey("external_payment_dialog_result_receiver"))
        this.C = (ResultReceiver)l21.getParcelable("external_payment_dialog_result_receiver"); 
      if (l21.containsKey("external_offer_flow_result_receiver"))
        this.D = (ResultReceiver)l21.getParcelable("external_offer_flow_result_receiver"); 
      if (l21.containsKey("launch_external_link_result_receiver"))
        this.E = (ResultReceiver)l21.getParcelable("launch_external_link_result_receiver"); 
    } 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    ResultReceiver resultReceiver = this.B;
    if (resultReceiver != null)
      paramBundle.putParcelable("alternative_billing_only_dialog_result_receiver", (Parcelable)resultReceiver); 
    resultReceiver = this.C;
    if (resultReceiver != null)
      paramBundle.putParcelable("external_payment_dialog_result_receiver", (Parcelable)resultReceiver); 
    resultReceiver = this.D;
    if (resultReceiver != null)
      paramBundle.putParcelable("external_offer_flow_result_receiver", (Parcelable)resultReceiver); 
    resultReceiver = this.E;
    if (resultReceiver != null)
      paramBundle.putParcelable("launch_external_link_result_receiver", (Parcelable)resultReceiver); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\android\billingclient\api\ProxyBillingActivityV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */