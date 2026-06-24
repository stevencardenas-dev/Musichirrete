package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import cl;
import ke0;
import n21;
import oe0;
import sp;
import x41;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
  public static final int c = 0;
  
  public int b = 0;
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    cl cl;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.b = 0;
      setResult(paramInt2, paramIntent);
      if (bool) {
        oe0 oe0 = oe0.d((Context)this);
        if (paramInt2 != -1) {
          if (paramInt2 == 0)
            oe0.g(new sp(13, null, null), getIntent().getIntExtra("failing_client_id", -1)); 
        } else {
          cl = oe0.o;
          cl.sendMessage(cl.obtainMessage(3));
        } 
      } 
    } else if (paramInt1 == 2) {
      this.b = 0;
      setResult(paramInt2, (Intent)cl);
    } 
    finish();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    this.b = 0;
    setResult(0);
    finish();
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.b = paramBundle.getInt("resolution"); 
    if (this.b != 1) {
      Bundle bundle = getIntent().getExtras();
      if (bundle == null) {
        Log.e("GoogleApiActivity", "Activity started without extras");
        finish();
        return;
      } 
      PendingIntent pendingIntent = (PendingIntent)bundle.get("pending_intent");
      Integer integer = (Integer)bundle.get("error_code");
      if (pendingIntent != null || integer != null) {
        if (pendingIntent != null) {
          try {
            IntentSender intentSender = pendingIntent.getIntentSender();
            try {
              startIntentSenderForResult(intentSender, 1, null, 0, 0, 0);
              this.b = 1;
              return;
            } catch (ActivityNotFoundException activityNotFoundException) {
            
            } catch (android.content.IntentSender.SendIntentException null) {}
          } catch (ActivityNotFoundException activityNotFoundException) {
          
          } catch (android.content.IntentSender.SendIntentException sendIntentException) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)sendIntentException);
            finish();
          } 
          if (bundle.getBoolean("notify_manager", true)) {
            oe0.d((Context)this).g(new sp(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
          } else {
            String str1 = pendingIntent.toString();
            String str2 = x41.o(new StringBuilder(str1.length() + 36), "Activity not found while launching ", str1, ".");
            str1 = str2;
            if (Build.FINGERPRINT.contains("generic"))
              str1 = str2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."); 
            Log.e("GoogleApiActivity", str1, (Throwable)sendIntentException);
          } 
          this.b = 1;
          finish();
        } else {
          n21.m(sendIntentException);
          int i = sendIntentException.intValue();
          ke0.d.c(this, i, this);
          this.b = 1;
        } 
        return;
      } 
      Log.e("GoogleApiActivity", "Activity started without resolution");
      finish();
      return;
    } 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.putInt("resolution", this.b);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\common\api\GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */